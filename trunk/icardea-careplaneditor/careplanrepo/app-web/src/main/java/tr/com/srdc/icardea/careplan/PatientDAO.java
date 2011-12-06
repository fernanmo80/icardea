package tr.com.srdc.icardea.careplan;

import java.util.List;
import java.sql.Timestamp;

import tr.com.srdc.icardea.careplan.pojo.Patient;
/**
 * <p>Generic DAO layer for Patients</p>
 * <p>Generated at Sun Feb 06 21:02:52 EET 2011</p>
 *
 * @author Salto-db Generator v1.0.16 / EJB3 + Spring/Hibernate DAO
 * @see http://www.hibernate.org/328.html
 */
public interface PatientDAO extends GenericDAO<Patient,Integer> {

	/*
	 * TODO : Add specific businesses daos here.
	 * These methods will be overwrited if you re-generate this interface.
	 * You might want to extend this interface and to change the dao factory to return 
	 * an instance of the new implemenation in buildPatientDAO()
	 */
	  	 
	/**
	 * Find Patient by assigningAuthority
	 */
	public List<Patient> findByAssigningAuthority(String assigningAuthority);

	/**
	 * Find Patient by identifierTypeCode
	 */
	public List<Patient> findByIdentifierTypeCode(String identifierTypeCode);

	/**
	 * Find Patient by givenName
	 */
	public List<Patient> findByGivenName(String givenName);

	/**
	 * Find Patient by familyName
	 */
	public List<Patient> findByFamilyName(String familyName);

	/**
	 * Find Patient by secondName
	 */
	public List<Patient> findBySecondName(String secondName);

	/**
	 * Find Patient by dateTimeOfBirth
	 */
	public List<Patient> findByDateTimeOfBirth(Timestamp dateTimeOfBirth);

	/**
	 * Find Patient by administrativeSex
	 */
	public List<Patient> findByAdministrativeSex(String administrativeSex);

	/**
	 * Find Patient by street
	 */
	public List<Patient> findByStreet(String street);

	/**
	 * Find Patient by city
	 */
	public List<Patient> findByCity(String city);

	/**
	 * Find Patient by postalCode
	 */
	public List<Patient> findByPostalCode(String postalCode);

	/**
	 * Find Patient by country
	 */
	public List<Patient> findByCountry(String country);

	/**
	 * Find Patient by citizenshipNumber
	 */
	public List<Patient> findByCitizenshipNumber(String citizenshipNumber);

}