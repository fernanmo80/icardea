package tr.com.srdc.icardea.careplan.pojo;

import java.util.List;
import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Transient;
import javax.persistence.Embeddable;

/**
 * <p>Pojo mapping TABLE Patient</p>
 * <p></p>
 *
 * <p>Generated at Sun Feb 06 21:02:52 EET 2011</p>
 * @author Salto-db Generator v1.0.16 / EJB3
 * 
 */
@Entity
@Table(name = "Patient", catalog = "medicalcareplanrepository")
@SuppressWarnings("serial")
public class Patient implements Serializable {

	/**
	 * Attribute id.
	 */
	private Integer id;
	
	/**
	 * Attribute assigningAuthority.
	 */
	private String assigningAuthority;
	
	/**
	 * Attribute identifierTypeCode.
	 */
	private String identifierTypeCode;
	
	/**
	 * Attribute givenName.
	 */
	private String givenName;
	
	/**
	 * Attribute familyName.
	 */
	private String familyName;
	
	/**
	 * Attribute secondName.
	 */
	private String secondName;
	
	/**
	 * Attribute dateTimeOfBirth.
	 */
	private Timestamp dateTimeOfBirth;
	
	/**
	 * Attribute administrativeSex.
	 */
	private String administrativeSex;
	
	/**
	 * Attribute street.
	 */
	private String street;
	
	/**
	 * Attribute city.
	 */
	private String city;
	
	/**
	 * Attribute postalCode.
	 */
	private String postalCode;
	
	/**
	 * Attribute country.
	 */
	private String country;
	
	/**
	 * Attribute citizenshipNumber.
	 */
	private String citizenshipNumber;
	
	/**
	 * List of Personalizedmedicalcareplan
	 */
	private List<Personalizedmedicalcareplan> personalizedmedicalcareplans = null;

	
	/**
	 * <p> 
	 * </p>
	 * @return id
	 */
	@Basic
	@Id
	@GeneratedValue
	@Column(name = "id")
		public Integer getId() {
		return id;
	}

	/**
	 * @param id new value for id 
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	
	/**
	 * <p> 
	 * </p>
	 * @return assigningAuthority
	 */
	@Basic
	@Column(name = "assigningAuthority", length = 45)
		public String getAssigningAuthority() {
		return assigningAuthority;
	}

	/**
	 * @param assigningAuthority new value for assigningAuthority 
	 */
	public void setAssigningAuthority(String assigningAuthority) {
		this.assigningAuthority = assigningAuthority;
	}
	
	/**
	 * <p> 
	 * </p>
	 * @return identifierTypeCode
	 */
	@Basic
	@Column(name = "identifierTypeCode", length = 45)
		public String getIdentifierTypeCode() {
		return identifierTypeCode;
	}

	/**
	 * @param identifierTypeCode new value for identifierTypeCode 
	 */
	public void setIdentifierTypeCode(String identifierTypeCode) {
		this.identifierTypeCode = identifierTypeCode;
	}
	
	/**
	 * <p> 
	 * </p>
	 * @return givenName
	 */
	@Basic
	@Column(name = "givenName", length = 45)
		public String getGivenName() {
		return givenName;
	}

	/**
	 * @param givenName new value for givenName 
	 */
	public void setGivenName(String givenName) {
		this.givenName = givenName;
	}
	
	/**
	 * <p> 
	 * </p>
	 * @return familyName
	 */
	@Basic
	@Column(name = "familyName", length = 45)
		public String getFamilyName() {
		return familyName;
	}

	/**
	 * @param familyName new value for familyName 
	 */
	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}
	
	/**
	 * <p> 
	 * </p>
	 * @return secondName
	 */
	@Basic
	@Column(name = "secondName", length = 45)
		public String getSecondName() {
		return secondName;
	}

	/**
	 * @param secondName new value for secondName 
	 */
	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}
	
	/**
	 * <p> 
	 * </p>
	 * @return dateTimeOfBirth
	 */
	@Basic
	@Column(name = "dateTimeOfBirth")
		public Timestamp getDateTimeOfBirth() {
		return dateTimeOfBirth;
	}

	/**
	 * @param dateTimeOfBirth new value for dateTimeOfBirth 
	 */
	public void setDateTimeOfBirth(Timestamp dateTimeOfBirth) {
		this.dateTimeOfBirth = dateTimeOfBirth;
	}
	
	/**
	 * <p> 
	 * </p>
	 * @return administrativeSex
	 */
	@Basic
	@Column(name = "administrativeSex", length = 45)
		public String getAdministrativeSex() {
		return administrativeSex;
	}

	/**
	 * @param administrativeSex new value for administrativeSex 
	 */
	public void setAdministrativeSex(String administrativeSex) {
		this.administrativeSex = administrativeSex;
	}
	
	/**
	 * <p> 
	 * </p>
	 * @return street
	 */
	@Basic
	@Column(name = "street", length = 45)
		public String getStreet() {
		return street;
	}

	/**
	 * @param street new value for street 
	 */
	public void setStreet(String street) {
		this.street = street;
	}
	
	/**
	 * <p> 
	 * </p>
	 * @return city
	 */
	@Basic
	@Column(name = "city", length = 45)
		public String getCity() {
		return city;
	}

	/**
	 * @param city new value for city 
	 */
	public void setCity(String city) {
		this.city = city;
	}
	
	/**
	 * <p> 
	 * </p>
	 * @return postalCode
	 */
	@Basic
	@Column(name = "postalCode", length = 45)
		public String getPostalCode() {
		return postalCode;
	}

	/**
	 * @param postalCode new value for postalCode 
	 */
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	
	/**
	 * <p> 
	 * </p>
	 * @return country
	 */
	@Basic
	@Column(name = "country", length = 45)
		public String getCountry() {
		return country;
	}

	/**
	 * @param country new value for country 
	 */
	public void setCountry(String country) {
		this.country = country;
	}
	
	/**
	 * <p> 
	 * </p>
	 * @return citizenshipNumber
	 */
	@Basic
	@Column(name = "citizenshipNumber", length = 45)
		public String getCitizenshipNumber() {
		return citizenshipNumber;
	}

	/**
	 * @param citizenshipNumber new value for citizenshipNumber 
	 */
	public void setCitizenshipNumber(String citizenshipNumber) {
		this.citizenshipNumber = citizenshipNumber;
	}
	
	/**
	 * Get the list of Personalizedmedicalcareplan
	 */
	 @OneToMany(mappedBy="patient")
	 public List<Personalizedmedicalcareplan> getPersonalizedmedicalcareplans() {
	 	return this.personalizedmedicalcareplans;
	 }
	 
	/**
	 * Set the list of Personalizedmedicalcareplan
	 */
	 public void setPersonalizedmedicalcareplans(List<Personalizedmedicalcareplan> personalizedmedicalcareplans) {
	 	this.personalizedmedicalcareplans = personalizedmedicalcareplans;
	 }


}