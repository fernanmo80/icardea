package tr.com.srdc.icardea.platform.service.login;

import java.util.List;

import org.apache.http.HttpResponse;
import org.apache.log4j.Logger;
import org.apache.wicket.PageParameters;
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
import org.openid4java.message.MessageExtension;
import org.openid4java.message.ParameterList;
import org.openid4java.message.sreg.SRegMessage;
import org.openid4java.message.sreg.SRegRequest;
import org.openid4java.message.sreg.SRegResponse;



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
		
		DiscoveryInformation discovery = RegistrationService
				.performDiscoveryOnUserSuppliedIdentifier(username);
		String url = RegistrationService.getReturnToUrl();
		AuthRequest authRequest = RegistrationService.createOpenIdAuthRequest(discovery, url);
		
		String redirectUrl = authRequest.getDestinationUrl(true);
				
		return redirectUrl;
	}
	public void handleReturnUrl(){
		
		
	}

	
}
