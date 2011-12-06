package tr.com.srdc.icardea.careplan.hibernate;

import java.util.List;
import java.sql.Timestamp;

import tr.com.srdc.icardea.careplan.pojo.Patient;
import tr.com.srdc.icardea.careplan.PatientDAO;

import org.hibernate.criterion.Restrictions;

/**
 * <p>Hibernate DAO layer for Patients</p>
 * <p>Generated at Sun Feb 06 21:02:52 EET 2011</p>
 *
 * @author Salto-db Generator v1.0.16 / EJB3 + Spring/Hibernate DAO
 * @see http://www.hibernate.org/328.html
 */
public class PatientHibernateDAO extends
		AbstractHibernateDAO<Patient, Integer> implements
		PatientDAO {

	/**
	 * Find Patient by assigningAuthority
	 */
	public List<Patient> findByAssigningAuthority(String assigningAuthority) {
		return findByCriteria(Restrictions.eq("assigningAuthority", assigningAuthority));
	}
	
	/**
	 * Find Patient by identifierTypeCode
	 */
	public List<Patient> findByIdentifierTypeCode(String identifierTypeCode) {
		return findByCriteria(Restrictions.eq("identifierTypeCode", identifierTypeCode));
	}
	
	/**
	 * Find Patient by givenName
	 */
	public List<Patient> findByGivenName(String givenName) {
		return findByCriteria(Restrictions.eq("givenName", givenName));
	}
	
	/**
	 * Find Patient by familyName
	 */
	public List<Patient> findByFamilyName(String familyName) {
		return findByCriteria(Restrictions.eq("familyName", familyName));
	}
	
	/**
	 * Find Patient by secondName
	 */
	public List<Patient> findBySecondName(String secondName) {
		return findByCriteria(Restrictions.eq("secondName", secondName));
	}
	
	/**
	 * Find Patient by dateTimeOfBirth
	 */
	public List<Patient> findByDateTimeOfBirth(Timestamp dateTimeOfBirth) {
		return findByCriteria(Restrictions.eq("dateTimeOfBirth", dateTimeOfBirth));
	}
	
	/**
	 * Find Patient by administrativeSex
	 */
	public List<Patient> findByAdministrativeSex(String administrativeSex) {
		return findByCriteria(Restrictions.eq("administrativeSex", administrativeSex));
	}
	
	/**
	 * Find Patient by street
	 */
	public List<Patient> findByStreet(String street) {
		return findByCriteria(Restrictions.eq("street", street));
	}
	
	/**
	 * Find Patient by city
	 */
	public List<Patient> findByCity(String city) {
		return findByCriteria(Restrictions.eq("city", city));
	}
	
	/**
	 * Find Patient by postalCode
	 */
	public List<Patient> findByPostalCode(String postalCode) {
		return findByCriteria(Restrictions.eq("postalCode", postalCode));
	}
	
	/**
	 * Find Patient by country
	 */
	public List<Patient> findByCountry(String country) {
		return findByCriteria(Restrictions.eq("country", country));
	}
	
	/**
	 * Find Patient by citizenshipNumber
	 */
	public List<Patient> findByCitizenshipNumber(String citizenshipNumber) {
		return findByCriteria(Restrictions.eq("citizenshipNumber", citizenshipNumber));
	}
	

}
