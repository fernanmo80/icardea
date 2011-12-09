package tr.com.srdc.icardea.platform.service.login;


import java.util.ResourceBundle;

import org.openid4java.discovery.DiscoveryInformation;
import org.openid4java.message.AuthRequest;

import flex.messaging.FlexContext;
import flex.messaging.FlexSession;



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
		
		
		username=salkServer+"/idp/u="+username; //only valid for SALK server
		
		DiscoveryInformation discovery = RegistrationService
				.performDiscoveryOnUserSuppliedIdentifier(username);
		String url = RegistrationService.getReturnToUrl();
		AuthRequest authRequest = RegistrationService.createOpenIdAuthRequest(discovery, url);
		
		String redirectUrl = authRequest.getDestinationUrl(true);
				
		return redirectUrl;
	}
	public RegistrationModel handleValidation(){
		RegistrationModel model = new RegistrationModel();
		FlexSession mySession= FlexContext.getFlexSession();
		model.setIs_verified((String)mySession.getAttribute("is_verified"));
		model.setEmailAddress((String)mySession.getAttribute("user_email"));
		model.setOpenId((String)mySession.getAttribute("user_openid"));
		model.setFullName((String)mySession.getAttribute("user_fullname"));
		model.setRole((String)mySession.getAttribute("user_role"));
		//TODO sign and encrypt model
		
		return model;
		
	}
	public void doLogout(){
		FlexSession mySession= FlexContext.getFlexSession();
		mySession.setAttribute("is_verified", "false");
	}
	
}
