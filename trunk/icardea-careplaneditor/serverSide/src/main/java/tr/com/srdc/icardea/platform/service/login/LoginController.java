package tr.com.srdc.icardea.platform.service.login;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public interface LoginController {
	
	void doGet(
	        HttpServletRequest request,
	        HttpServletResponse response) throws Exception;

}
