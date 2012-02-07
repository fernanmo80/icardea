package de.offis.health.icardea.ppm.login;


public class RegistrationModel {
  /**
	 * 
	 */

	private String openId;
	private String fullName;
	private String emailAddress;
	private String phoneNumber;
	private String role;
	private String dateOfBirth;	
	private String is_verified;
	
	public RegistrationModel() {
		
	}
	public String getOpenId() {
		return openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}	
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public void setIs_verified(String is_verified) {
		this.is_verified = is_verified;
	}
	public String getIs_verified() {
		return is_verified;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getRole() {
		return role;
	}
}

