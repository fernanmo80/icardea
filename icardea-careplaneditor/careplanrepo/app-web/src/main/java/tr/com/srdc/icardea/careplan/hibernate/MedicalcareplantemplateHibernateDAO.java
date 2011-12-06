package tr.com.srdc.icardea.careplan.hibernate;

import java.util.List;
import java.sql.Timestamp;

import tr.com.srdc.icardea.careplan.pojo.Medicalcareplantemplate;
import tr.com.srdc.icardea.careplan.MedicalcareplantemplateDAO;

import org.hibernate.criterion.Restrictions;

/**
 * <p>Hibernate DAO layer for Medicalcareplantemplates</p>
 * <p>Generated at Sun Feb 06 21:02:52 EET 2011</p>
 *
 * @author Salto-db Generator v1.0.16 / EJB3 + Spring/Hibernate DAO
 * @see http://www.hibernate.org/328.html
 */
public class MedicalcareplantemplateHibernateDAO extends
		AbstractHibernateDAO<Medicalcareplantemplate, Integer> implements
		MedicalcareplantemplateDAO {

	/**
	 * Find Medicalcareplantemplate by content
	 */
	public List<Medicalcareplantemplate> findByContent(String content) {
		return findByCriteria(Restrictions.eq("content", content));
	}
	
	/**
	 * Find Medicalcareplantemplate by identifier
	 */
	public List<Medicalcareplantemplate> findByIdentifier(String identifier) {
		return findByCriteria(Restrictions.eq("identifier", identifier));
	}
	
	/**
	 * Find Medicalcareplantemplate by diagramContent
	 */
	public List<Medicalcareplantemplate> findByDiagramContent(String diagramContent) {
		return findByCriteria(Restrictions.eq("diagramContent", diagramContent));
	}
	
	/**
	 * Find Medicalcareplantemplate by approved
	 */
	public List<Medicalcareplantemplate> findByApproved(Boolean approved) {
		return findByCriteria(Restrictions.eq("approved", approved));
	}
	
	/**
	 * Find Medicalcareplantemplate by iCD10Code
	 */
	public List<Medicalcareplantemplate> findByICD10Code(String iCD10Code) {
		return findByCriteria(Restrictions.eq("iCD10Code", iCD10Code));
	}
	
	/**
	 * Find Medicalcareplantemplate by creationDate
	 */
	public List<Medicalcareplantemplate> findByCreationDate(Timestamp creationDate) {
		return findByCriteria(Restrictions.eq("creationDate", creationDate));
	}
	
	/**
	 * Find Medicalcareplantemplate by name
	 */
	public List<Medicalcareplantemplate> findByName(String name) {
		return findByCriteria(Restrictions.eq("name", name));
	}
	

}
