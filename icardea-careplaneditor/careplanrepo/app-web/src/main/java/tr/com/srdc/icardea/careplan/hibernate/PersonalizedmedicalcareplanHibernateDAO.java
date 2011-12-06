package tr.com.srdc.icardea.careplan.hibernate;

import java.util.List;
import java.sql.Timestamp;

import tr.com.srdc.icardea.careplan.pojo.Personalizedmedicalcareplan;
import tr.com.srdc.icardea.careplan.PersonalizedmedicalcareplanDAO;

import org.hibernate.criterion.Restrictions;

/**
 * <p>Hibernate DAO layer for Personalizedmedicalcareplans</p>
 * <p>Generated at Sun Feb 06 21:02:52 EET 2011</p>
 *
 * @author Salto-db Generator v1.0.16 / EJB3 + Spring/Hibernate DAO
 * @see http://www.hibernate.org/328.html
 */
public class PersonalizedmedicalcareplanHibernateDAO extends
		AbstractHibernateDAO<Personalizedmedicalcareplan, Integer> implements
		PersonalizedmedicalcareplanDAO {

	/**
	 * Find Personalizedmedicalcareplan by patientId
	 */
	@SuppressWarnings("unchecked")
	public List<Personalizedmedicalcareplan> findByPatientId(Integer patientId) {
		return findByCriteria(Restrictions.eq("patient.patientId", patientId));
	}
	
	/**
	 * Find Personalizedmedicalcareplan by medicalcareplantemplateId
	 */
	@SuppressWarnings("unchecked")
	public List<Personalizedmedicalcareplan> findByMedicalcareplantemplateId(Integer medicalcareplantemplateId) {
		return findByCriteria(Restrictions.eq("medicalcareplantemplate.medicalcareplantemplateId", medicalcareplantemplateId));
	}
	
	/**
	 * Find Personalizedmedicalcareplan by content
	 */
	public List<Personalizedmedicalcareplan> findByContent(String content) {
		return findByCriteria(Restrictions.eq("content", content));
	}
	
	/**
	 * Find Personalizedmedicalcareplan by diagramContent
	 */
	public List<Personalizedmedicalcareplan> findByDiagramContent(String diagramContent) {
		return findByCriteria(Restrictions.eq("diagramContent", diagramContent));
	}
	
	/**
	 * Find Personalizedmedicalcareplan by identifier
	 */
	public List<Personalizedmedicalcareplan> findByIdentifier(String identifier) {
		return findByCriteria(Restrictions.eq("identifier", identifier));
	}
	
	/**
	 * Find Personalizedmedicalcareplan by creationDate
	 */
	public List<Personalizedmedicalcareplan> findByCreationDate(Timestamp creationDate) {
		return findByCriteria(Restrictions.eq("creationDate", creationDate));
	}
	

}
