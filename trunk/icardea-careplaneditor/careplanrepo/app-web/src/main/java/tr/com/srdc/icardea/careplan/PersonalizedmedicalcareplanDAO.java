package tr.com.srdc.icardea.careplan;

import java.util.List;
import java.sql.Timestamp;

import tr.com.srdc.icardea.careplan.pojo.Personalizedmedicalcareplan;
/**
 * <p>Generic DAO layer for Personalizedmedicalcareplans</p>
 * <p>Generated at Sun Feb 06 21:02:52 EET 2011</p>
 *
 * @author Salto-db Generator v1.0.16 / EJB3 + Spring/Hibernate DAO
 * @see http://www.hibernate.org/328.html
 */
public interface PersonalizedmedicalcareplanDAO extends GenericDAO<Personalizedmedicalcareplan,Integer> {

	/*
	 * TODO : Add specific businesses daos here.
	 * These methods will be overwrited if you re-generate this interface.
	 * You might want to extend this interface and to change the dao factory to return 
	 * an instance of the new implemenation in buildPersonalizedmedicalcareplanDAO()
	 */
	  	 
	/**
	 * Find Personalizedmedicalcareplan by patientId
	 */
	public List<Personalizedmedicalcareplan> findByPatientId(Integer patientId);

	/**
	 * Find Personalizedmedicalcareplan by medicalcareplantemplateId
	 */
	public List<Personalizedmedicalcareplan> findByMedicalcareplantemplateId(Integer medicalcareplantemplateId);

	/**
	 * Find Personalizedmedicalcareplan by content
	 */
	public List<Personalizedmedicalcareplan> findByContent(String content);

	/**
	 * Find Personalizedmedicalcareplan by diagramContent
	 */
	public List<Personalizedmedicalcareplan> findByDiagramContent(String diagramContent);

	/**
	 * Find Personalizedmedicalcareplan by identifier
	 */
	public List<Personalizedmedicalcareplan> findByIdentifier(String identifier);

	/**
	 * Find Personalizedmedicalcareplan by creationDate
	 */
	public List<Personalizedmedicalcareplan> findByCreationDate(Timestamp creationDate);

}