/**
 * 
 */
package de.offis.health.icardea.ppm;

/**
 * @author thiel
 *
 */
public class Patient {
	
	/**
	 * 
	 */
	public Patient() {
		super();
		// TODO Auto-generated constructor stub
		this.givenName = "";
		this.familyName = "";
		this.dateOfBirth = "";
		this.id = 0;
		this.patientIdentifier = "";
		this.ciedIdentifier = "";
		this.citizenshipNumber = "";

	}


	public Patient(String givenName, String familyName, String dateOfBirth,
			int id, String patientIdentifier, String ciedIdentifier,
			String citizenshipNumber) {
		super();
		this.givenName = givenName;
		this.familyName = familyName;
		this.dateOfBirth = dateOfBirth;
		this.id = id;
		this.patientIdentifier = patientIdentifier;
		this.ciedIdentifier = ciedIdentifier;
		this.citizenshipNumber = citizenshipNumber;
	}
	

	/**
	 * @param givenName
	 * @param familyName
	 * @param dateOfBirth
	 * @param id
	 * @param ciedIdentifier
	 * @param citizenshipNumber
	 */
	public Patient(String givenName, String familyName, String dateOfBirth,
			int id, String ciedIdentifier, String citizenshipNumber) {
		super();
		this.givenName = givenName;
		this.familyName = familyName;
		this.dateOfBirth = dateOfBirth;
		this.id = id;
		this.ciedIdentifier = ciedIdentifier;
		this.citizenshipNumber = citizenshipNumber;
	}


	private String givenName;
	private String familyName;
	private String dateOfBirth;
	private String dateOfBirthPoint;
	
	private int id;
	private String patientIdentifier;
	private String ciedIdentifier;
	private String citizenshipNumber;
	/**
	 * @return the givenName
	 */
	public String getGivenName() {
		return givenName;
	}
	/**
	 * @param givenName the givenName to set
	 */
	public void setGivenName(String givenName) {
		this.givenName = givenName;
	}
	/**
	 * @return the familyName
	 */
	public String getFamilyName() {
		return familyName;
	}
	/**
	 * @param familyName the familyName to set
	 */
	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}
	/**
	 * @return the dateOfBirth
	 */
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	/**
	 * @param dateOfBirth the dateOfBirth to set
	 */
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
		if (dateOfBirth==null) {
			this.dateOfBirthPoint="*unknown";
		}else{
		this.dateOfBirthPoint=dateOfBirth.substring(6,8)+"." +dateOfBirth.substring(4,6)+"."+dateOfBirth.substring(0,4);
	}}


	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the patientIdentifier
	 */
	public String getPatientIdentifier() {
		return patientIdentifier;
	}
	/**
	 * @param patientIdentifier the patientIdentifier to set
	 */
	public void setPatientIdentifier(String patientIdentifier) {
		this.patientIdentifier = patientIdentifier;
	}
	/**
	 * @return the ciedIdentifier
	 */
	public String getCiedIdentifier() {
		return ciedIdentifier;
	}
	/**
	 * @param ciedIdentifier the ciedIdentifier to set
	 */
	public void setCiedIdentifier(String ciedIdentifier) {
		this.ciedIdentifier = ciedIdentifier;
	}
	/**
	 * @return the citizenshipNumber
	 */
	public String getCitizenshipNumber() {
		return citizenshipNumber;
	}
	/**
	 * @param citizenshipNumber the citizenshipNumber to set
	 */
	public void setCitizenshipNumber(String citizenshipNumber) {
		this.citizenshipNumber = citizenshipNumber;
	}
	public String getPatientNameBirthdateString()
	{
		return (this.familyName+ ","+this.givenName+" (" + this.dateOfBirthPoint+")");
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Patient [givenName=" + givenName + ", familyName=" + familyName
				+ ", dateOfBirth=" + dateOfBirth + ", dateOfBirthPoint="
				+ dateOfBirthPoint + ", id=" + id + ", patientIdentifier="
				+ patientIdentifier + ", ciedIdentifier=" + ciedIdentifier
				+ ", citizenshipNumber=" + citizenshipNumber + "]";
	}
	
	
} 
