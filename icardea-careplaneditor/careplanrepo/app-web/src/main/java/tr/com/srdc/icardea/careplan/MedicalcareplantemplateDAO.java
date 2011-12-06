package tr.com.srdc.icardea.careplan;

import java.util.List;
import java.sql.Timestamp;

import tr.com.srdc.icardea.careplan.pojo.Medicalcareplantemplate;
/**
 * <p>Generic DAO layer for Medicalcareplantemplates</p>
 * <p>Generated at Sun Feb 06 21:02:52 EET 2011</p>
 *
 * @author Salto-db Generator v1.0.16 / EJB3 + Spring/Hibernate DAO
 * @see http://www.hibernate.org/328.html
 */
public interface MedicalcareplantemplateDAO extends GenericDAO<Medicalcareplantemplate,Integer> {

	/*
	 * TODO : Add specific businesses daos here.
	 * These methods will be overwrited if you re-generate this interface.
	 * You might want to extend this interface and to change the dao factory to return 
	 * an instance of the new implemenation in buildMedicalcareplantemplateDAO()
	 */
	  	 
	/**
	 * Find Medicalcareplantemplate by content
	 */
	public List<Medicalcareplantemplate> findByContent(String content);

	/**
	 * Find Medicalcareplantemplate by identifier
	 */
	public List<Medicalcareplantemplate> findByIdentifier(String identifier);

	/**
	 * Find Medicalcareplantemplate by diagramContent
	 */
	public List<Medicalcareplantemplate> findByDiagramContent(String diagramContent);

	/**
	 * Find Medicalcareplantemplate by approved
	 */
	public List<Medicalcareplantemplate> findByApproved(Boolean approved);

	/**
	 * Find Medicalcareplantemplate by iCD10Code
	 */
	public List<Medicalcareplantemplate> findByICD10Code(String iCD10Code);

	/**
	 * Find Medicalcareplantemplate by creationDate
	 */
	public List<Medicalcareplantemplate> findByCreationDate(Timestamp creationDate);

	/**
	 * Find Medicalcareplantemplate by name
	 */
	public List<Medicalcareplantemplate> findByName(String name);

}