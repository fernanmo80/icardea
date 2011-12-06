package tr.com.srdc.icardea.platform.service.login;

import java.io.IOException;

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
		HttpSession session = req.getSession();
		session.setAttribute("is_verified", "true");
		
		System.out.println("login servlet get");
		
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		System.out.println("login servlet post");
		
	}


}
