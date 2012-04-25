package tr.com.srdc.icardea.platform.service.login;



public interface LoginService {
	String createRedirect(String username);
	RegistrationModel handleValidation();
	void doLogout();
	String redirectPPM();
	String redirectPIX();
	String getCurrentIP();
	
}
