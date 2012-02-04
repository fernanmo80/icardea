package de.offis.health.icardea.ppm.login;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ResourceBundle;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.openid4java.association.AssociationException;
import org.openid4java.discovery.DiscoveryException;
import org.openid4java.message.MessageException;

public class LoginServlet extends javax.servlet.http.HttpServlet {


	private static final long serialVersionUID = 1L;
//	final static String YAHOO_ENDPOINT = "https://me.yahoo.com";
//	final static String GOOGLE_ENDPOINT = "https://www.google.com/accounts/o8/id";

	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
		throws ServletException, IOException {
		// --- processing the authentication response ---
		try {
			RegistrationModel model = RegistrationService.processReturn(req);
			HttpSession session = req.getSession();
			System.out.println("is_verified: "+model.getIs_verified());   
			System.out.println("user_role: "+model.getRole());    
			System.out.println("user_fullname: "+model.getFullName());
			System.out.println("user_openid: "+ model.getOpenId());
			
			session.setAttribute("is_verified", model.getIs_verified());
			session.setAttribute("user_role", model.getRole());
			session.setAttribute("user_fullname", model.getFullName());
			session.setAttribute("user_email", model.getEmailAddress());
			session.setAttribute("user_openid", model.getOpenId());
			
		} catch (MessageException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (DiscoveryException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (AssociationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
		ResourceBundle properties = ResourceBundle.getBundle("icardea");
		String salkServer = properties.getString("salk.server");
		String securePort = properties.getString("secure.port");
		resp.sendRedirect(salkServer + ":"+securePort+"/icardea_careplaneditor/flex-client/iCardea.html"); //only valid for SALK server
		
        
//        while (en.hasMoreElements()) {
//            String paramName = ((String) en.nextElement()).trim();
//            System.out.println(paramName + " = " + req.getParameter(paramName) + "\n");
//            session.setAttribute(paramName, req.getParameter(paramName));
//        } 
//		try {
//		    InetAddress addr = InetAddress.getLocalHost();
//
//		    // Get IP Address
//		    byte[] ipAddr = addr.getAddress();
//		    String ipadd = ipAddr.toString();	
//		    // Get hostname
//		    String hostname = addr.getHostAddress();
//		    resp.sendRedirect("https://"+hostname+":"+securePort+"/icardea_careplaneditor/flex-client/iCardea.html");
//		  
//		} catch (UnknownHostException e) {
//		}
		
	}
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		//System.out.println("login servlet post");
		
	}


}
