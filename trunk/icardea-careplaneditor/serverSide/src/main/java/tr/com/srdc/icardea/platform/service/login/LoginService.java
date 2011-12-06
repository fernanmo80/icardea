package tr.com.srdc.icardea.platform.service.login;



public interface LoginService {
	String createRedirect(String username);
	void handleReturnUrl();
	
}
