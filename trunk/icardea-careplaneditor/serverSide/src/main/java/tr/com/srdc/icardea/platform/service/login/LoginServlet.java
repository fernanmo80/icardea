package tr.com.srdc.icardea.platform.service.login;

import java.io.IOException;
import java.util.Enumeration;
import java.util.ResourceBundle;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginServlet extends javax.servlet.http.HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	final static String YAHOO_ENDPOINT = "https://me.yahoo.com";
	final static String GOOGLE_ENDPOINT = "https://www.google.com/accounts/o8/id";

	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
		throws ServletException, IOException {
		ResourceBundle properties = ResourceBundle.getBundle("icardea");
		String salkServer = properties.getString("salk.server");
		String securePort = properties.getString("secure.port");
		
		HttpSession session = req.getSession();	
		resp.setContentType("text/html;charset=UTF-8");   
	    Enumeration en = req.getParameterNames();        
        
        session.setAttribute("is_verified", "true");
        while (en.hasMoreElements()) {
            String paramName = ((String) en.nextElement()).trim();
            System.out.println(paramName + " = " + req.getParameter(paramName) + "\n");
            session.setAttribute(paramName, req.getParameter(paramName));
        }  		
		resp.sendRedirect(salkServer+":"+securePort+"/icardea_careplaneditor/flex-client/iCardea.html");
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		//System.out.println("login servlet post");
		
	}


}
