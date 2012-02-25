package de.offis.health.icardea.ppm.login;


import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ResourceBundle;

import javax.servlet.http.HttpSession;

import org.eclipse.rwt.RWT;
import org.openid4java.discovery.DiscoveryInformation;
import org.openid4java.message.AuthRequest;

//import flex.messaging.FlexContext;
//import flex.messaging.FlexSession;



/**
 * Consolidates business logic from the UI code for Registration activities.
 * 
 * Most of this code modeled after ConsumerServlet, part of the openid4java
 * sample code available at
 * http://code.google.com/p/openid4java/wiki/SampleConsumer. Some of this code
 * was outright copied :->.
 * 
 * @author J Steven Perry
 * @author http://makotoconsulting.com
 * 
 */

public class LoginServiceImpl implements LoginService {

	public String createRedirect(String username) {
		ResourceBundle properties = ResourceBundle.getBundle("icardea");
		String salkServer = properties.getString("salk.server");		
		 
		boolean salkUsage = new Boolean(ResourceBundle.getBundle("icardea")
				.getString("salk.usage")).booleanValue();
		System.out.println("SAlk Usage" + salkUsage);

		if(salkUsage == true){
			username=salkServer+"/idp/u="+username; //only valid for SALK server
		}
		System.out.println("LoginServiceImpl "+"##############AT Discovery for: "+username);
		DiscoveryInformation discovery = RegistrationService
				.performDiscoveryOnUserSuppliedIdentifier(username);
		String url = RegistrationService.getReturnToUrl();
		System.out.println("LoginServiceImpl "+"##############AT return url:"+url);
	
		AuthRequest authRequest = RegistrationService.createOpenIdAuthRequest(discovery, url);
		
		String redirectUrl = authRequest.getDestinationUrl(true);
		
		return redirectUrl;
	}
	public RegistrationModel handleValidation(){
		System.out.println("LoginServiceImpl "+"##############AT HANDLEVALIDATION");
		RegistrationModel model = new RegistrationModel();
//		FlexSession mySession= FlexContext.getFlexSession();
//		model.setIs_verified((String)mySession.getAttribute("is_verified"));
//		model.setEmailAddress((String)mySession.getAttribute("user_email"));
//		model.setOpenId((String)mySession.getAttribute("user_openid"));
//		model.setFullName((String)mySession.getAttribute("user_fullname"));
//		model.setRole((String)mySession.getAttribute("user_role"));
		
		model.setIs_verified((false));
		model.setEmailAddress(("user_email"));
		model.setOpenId(("user_openid"));
		model.setFullName(("user_fullname"));
		model.setRole(("user_role"));
	
		
		//TODO sign and encrypt model
		return model;
		
	}
	public void doLogout(){
//		FlexSession mySession= FlexContext.getFlexSession();
		HttpSession mySession = RWT.getSessionStore().getHttpSession();
		mySession.setAttribute("is_verified", false);
		//TODO control is_verified variable from Registration Model 
	}
	
	public String redirectPPM() {
		String redirectUrl = "";
		ResourceBundle properties = ResourceBundle.getBundle("icardea");
		String ppmEndPoint = properties.getString("ppm.end");		
		 
		//username=salkServer+"/idp/u="+username; //only valid for SALK server
	
		return ppmEndPoint;
		
	}

	public String getCurrentIP() {
		String hostname="";
		try {
		    InetAddress addr = InetAddress.getLocalHost();
		     hostname = addr.getHostAddress();
		   
		} catch (UnknownHostException e) {
		}
		return hostname;
	}
	//TODO: TestLogin
	void main(){
		LoginServiceImpl logserv= new LoginServiceImpl();
		String redirect=logserv.createRedirect("http://134.106.52.9:4545/idp/u=athiel");
		System.out.println("LoginServiceImpl "+redirect);
		
	}
}
