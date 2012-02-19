package de.offis.health.icardea.ppm.login;


import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;
import java.util.ResourceBundle;

import javax.servlet.http.HttpServletRequest;

import org.apache.http.auth.AUTH;
import org.apache.log4j.Logger;
//import org.eclipse.core.internal.expressions.InstanceofExpression;
import org.openid4java.association.AssociationException;
import org.openid4java.consumer.ConsumerAssociationStore;
import org.openid4java.consumer.ConsumerException;
import org.openid4java.consumer.ConsumerManager;
import org.openid4java.consumer.InMemoryConsumerAssociationStore;
import org.openid4java.consumer.InMemoryNonceVerifier;
import org.openid4java.consumer.VerificationResult;
import org.openid4java.discovery.DiscoveryException;
import org.openid4java.discovery.DiscoveryInformation;
import org.openid4java.discovery.Identifier;
import org.openid4java.message.AuthRequest;
import org.openid4java.message.AuthSuccess;
import org.openid4java.message.MessageException;
import org.openid4java.message.MessageExtension;
import org.openid4java.message.ParameterList;
import org.openid4java.message.ax.AxMessage;
import org.openid4java.message.ax.FetchRequest;
import org.openid4java.message.ax.FetchResponse;
import org.openid4java.message.sreg.SRegMessage;
import org.openid4java.message.sreg.SRegRequest;
import org.openid4java.message.sreg.SRegResponse;


public class RegistrationService {
	private static final Logger log = Logger.getLogger(RegistrationService.class);
	
	/**
	 * Perform discovery on the User-Supplied identifier and return the
	 * DiscoveryInformation object that results from Association with the
	 * OP. This will probably be needed by the caller (stored in Session
	 * perhaps?).
	 * 
	 * I'm not thrilled about ConsumerManager being static, but it is
	 * very important to openid4java that the ConsumerManager object be the
	 * same instance all through a conversation (discovery, auth request, 
	 * auth response) with the OP. I didn't dig terribly deeply, but suspect
	 * that part of the key exchange or the nonce uses the ConsumerManager's
	 * hash, or some other instance-specific construct to do its thing.
	 * 
	 * @param userSuppliedIdentifier The User-Supplied identifier. It may already
	 *  be normalized.
	 *
	 *  @return DiscoveryInformation - The resulting DisoveryInformation object
	 *  returned by openid4java following successful association with the OP.
	 */
	@SuppressWarnings("unchecked")
	public static DiscoveryInformation performDiscoveryOnUserSuppliedIdentifier(String userSuppliedIdentifier) {
		DiscoveryInformation ret = null;
		//
		log.debug(" performDiscoveryOnUserSuppliedIdentifier: "+userSuppliedIdentifier);
		ConsumerManager consumerManager = getConsumerManager();
		try {
			
		// Perform discover on the User-Supplied Identifier
			consumerManager.setConnectTimeout(2000);
			List<DiscoveryInformation> discoveries = consumerManager.discover(userSuppliedIdentifier);
		
		if(discoveries.isEmpty()){
			log.info("RegistrationService: Empty discoveries");
		}
		
		// Pass the discoveries to the associate() method...
		log.debug(" got "+discoveries.size());
		
		
		ret = consumerManager.associate(discoveries);

		} catch (DiscoveryException e) {
			String message = "Error occurred during discovery!";
			log.error(message, e);
			log.debug("RegistrationService : " + userSuppliedIdentifier);
			//throw new RuntimeException(message, e);
			log.info(" Seems that the User is not known");
			return null;
		}
		return ret;
	}
	/**
	 * Create an OpenID Auth Request, using the DiscoveryInformation object
	 * return by the openid4java library.
	 * 
	 * This method also uses the Simple Registration Extension to grant
	 * the Relying Party (RP).
	 * 
	 * @param discoveryInformation The DiscoveryInformation that should have
	 *  been previously obtained from a call to 
	 *  performDiscoveryOnUserSuppliedIdentifier().
	 *  
	 *  @param returnToUrl The URL to which the OP will redirect once the
	 *   authentication call is complete.
	 *  
	 * @return AuthRequest - A "good-to-go" AuthRequest object packed with all
	 *  kinds of great OpenID goodies for the OpenID Provider (OP). The caller
	 *  must take this object and forward it on to the OP. Or call
	 *  processAuthRequest() - part of this Service Class.
	 */
	public static AuthRequest createOpenIdAuthRequest(DiscoveryInformation discoveryInformation, String returnToUrl) {
		AuthRequest ret = null;
		//
		try {
			// Create the AuthRequest object
			ret = getConsumerManager().authenticate(discoveryInformation, returnToUrl);
			// Create the Simple Registration Request
			SRegRequest sRegRequest = SRegRequest.createFetchRequest();
			FetchRequest ax = FetchRequest.createFetchRequest();
			//ax.addAttribute("http://www.w3.org/2006/vcard/ns#role",true);
			ax.addAttribute("label", "http://www.w3.org/2006/vcard/ns#role",true, 0 );
			
			sRegRequest.addAttribute("email", false);
			sRegRequest.addAttribute("fullname", false);
			sRegRequest.addAttribute("dob", false);
			sRegRequest.addAttribute("postcode", false);
			ret.addExtension(sRegRequest);
			ret.addExtension(ax);
			
		} catch (Exception e) {
			String message = "Exception occurred while building AuthRequest object!";
			log.error(message, e);
			throw new RuntimeException(message, e);
		}
		return ret;
	}
	
	/**
	 * Processes the returned information from an authentication request
	 * from the OP.
	 * 
	 * @param discoveryInformation DiscoveryInformation that was created earlier
	 *  in the conversation (by openid4java). This will need to be verified with
	 *  openid4java to make sure everything went smoothly and there are no
	 *  possible problems. This object was probably stored in session and retrieved
	 *  for use in calling this method.
	 *  
	 * @param pageParameters PageParameters passed to the page handling the
	 *  return verificaion.
	 *  
	 * @param returnToUrl The "return to" URL that was passed to the OP. It must
	 *  match exactly, or openid4java will issue a verification failed message
	 *  in the logs.
	 *  
	 * @return RegistrationModel - null if there was a problem, or a RegistrationModel
	 *  object, with parameters filled in as compeletely as possible from the
	 *  information available from the OP. If you are using MyOpenID, most of the
	 *  time what is returned is from your "Default" profile, so if you need more 
	 *  information returned, make sure your Default profile is completely filled
	 *  out.
	 * @throws AssociationException 
	 * @throws DiscoveryException 
	 * @throws MessageException 
	 */
	public static RegistrationModel processReturn(HttpServletRequest req) throws MessageException, DiscoveryException, AssociationException {
		RegistrationModel ret = null;
		ParameterList response = new ParameterList(req.getParameterMap());
		log.debug("RETURN STATE "+response.getParameterValue("openid.mode"));
		DiscoveryInformation discovered = (DiscoveryInformation)
        req.getSession().getAttribute("openid-disc");
		//log.debug("Register: Authtype"+req.getAuthType().toString());
		log.debug("Register Attribute names"+req.getAttributeNames());
		
		// extract the receiving URL from the HTTP request
		StringBuffer receivingURL = req.getRequestURL();
		String queryString = req.getQueryString();
		if (queryString != null && queryString.length() > 0)
		    receivingURL.append("?").append(req.getQueryString());
		
		// verify the response; ConsumerManager needs to be the same
		// (static) instance used to place the authentication request
		log.debug("Consumer start verify");
		VerificationResult verification = getConsumerManager().verify(
		        receivingURL.toString(),
		        response, discovered);
		log.debug("Register: Messages :" +verification.getAuthResponse().toString());
		log.debug("Reigster Class of verification"+verification.getAuthResponse().getClass().toString());
		log.debug("Register: ConsumerManager" + consumerManager.getDiscovery().toString());
	
		if (verification.getAuthResponse() instanceof org.openid4java.message.AuthFailure){
			log.debug("Evtl. Fehlerhafter Return");
		}
		else if (verification.getAuthResponse() instanceof org.openid4java.message.AuthSuccess){
			log.debug("Evtl. erfolgreicher Auth");
		}
		else {log.debug("Kein Positiver und kein negativer Auth. Fehler!");}
		log.debug("Verification:"+verification.getStatusMsg());
		// examine the verification result and extract the verified identifier
		Identifier verified = verification.getVerifiedId();
		log.debug("VerifiedID:"+verified);
		if (verified != null)
		{
			
			ret = new RegistrationModel();
		    AuthSuccess authSuccess =
		            (AuthSuccess) verification.getAuthResponse();
		    
		    if (authSuccess.hasExtension(AxMessage.OPENID_NS_AX))
		    {
		        FetchResponse fetchResp = (FetchResponse) authSuccess
		                .getExtension(AxMessage.OPENID_NS_AX);
		
		        List<String> roles = fetchResp.getAttributeValues("label");
		        
		        log.debug("roles size: "+ roles.size());
		        if(roles.size() > 0){
		        	String role = (String) roles.get(0);
			        ret.setRole(role);
		        }
		        
		    }
		    if (authSuccess.hasExtension(SRegMessage.OPENID_NS_SREG)) {
				MessageExtension extension = authSuccess.getExtension(SRegMessage.OPENID_NS_SREG);
				if (extension instanceof SRegResponse) {
					ret.setOpenId(verified.getIdentifier());
					ret.setIs_verified("true");
					SRegResponse sRegResponse = (SRegResponse)extension;
					String value = sRegResponse.getAttributeValue("dob");
					if (value != null) {
					  ret.setDateOfBirth(value);
					}
					value = sRegResponse.getAttributeValue("email");
					if (value != null) {
					  ret.setEmailAddress(value);
					}
					value = sRegResponse.getAttributeValue("fullname");
					if (value != null) {
					  ret.setFullName(value);
					}
				}
			}	    
		}
		return ret;
	}

	private static ConsumerManager consumerManager;
	/**
	 * Retrieves an instance of the ConsumerManager object. It is static
	 * (see note in Class-level JavaDoc comments above) because openid4java
	 * likes it that way.
	 * 
	 * Note: if you are planning to debug the code, set the lifespan parameter
	 * of the InMemoryNonceVerifier high enough to outlive your debug cycle, or
	 * you may notice Nonce Verification errors. Depending on where you are
	 * debugging, this might pose an artificial problem for you (of your own
	 * making) that has nothing to do with either your code or openid4java.
	 * 
	 * @return ConsumerManager - The ConsumerManager object that handles
	 *  communication with the openid4java API.
	 */
	private static ConsumerManager getConsumerManager() {
		if (consumerManager == null) {
			consumerManager = new ConsumerManager();
			consumerManager.setAssociations(new InMemoryConsumerAssociationStore());
			consumerManager.setNonceVerifier(new InMemoryNonceVerifier(10000));
		}
		return consumerManager;
	}
  /**
   * Generates the returnToUrl parameter that is passed to the OP. The
   * User Agent (i.e., the browser) will be directed to this page following
   * authentication.
   * 
   * @param representedPage The RegistrationPage object whose cover is to be
   *  cracked open to get at the raw HttpServlet goodies inside.
   *  
   * @return String - the returnToUrl to be used for the authentication request.
   */
		
  public static String getReturnToUrl() {
	  ResourceBundle properties = ResourceBundle.getBundle("icardea");
	  boolean isSalkUsage = Boolean.parseBoolean(properties.getString("salk.usage"));
	  String server =""; 
	  String port ="";
	  String url = "";
	  if(isSalkUsage){
	  server = properties.getString("salk.server");
	  port = properties.getString("secure.port");
	  url = server + ":"+port+"/ppm_v2/";
	  }
	  else{// (isSalkUSage) NoSalkUsage, we assume localhost testing
		 log.info("Localhost testing. salk.usage was not 'true'");
		  server = "http://127.0.0.1";
		  port= "10101";
		  url = server + ":"+port+"/";
		  }
	   url= url + "view?startup=de.offis.health.icardea.ppm.viewapp";
	  
	  /*try {
		    InetAddress addr = InetAddress.getLocalHost();

		    // Get IP Address
		    byte[] ipAddr = addr.getAddress();
		    String ipadd = ipAddr.toString();	
		    // Get hostname
		    String hostname = addr.getHostAddress();
		    url = "https://"+ hostname + ":"+securePort+"/icardea_careplaneditor/servlet/loginServlet?";
		} catch (UnknownHostException e) {
		}*/
	  return url;
  }
}

