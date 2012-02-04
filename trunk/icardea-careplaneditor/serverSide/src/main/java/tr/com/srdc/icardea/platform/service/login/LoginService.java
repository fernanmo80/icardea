package de.offis.health.icardea.ppm.login;



public interface LoginService {
	String createRedirect(String username);
	RegistrationModel handleValidation();
	void doLogout();
	String redirectPPM();
	String getCurrentIP();
	
}
