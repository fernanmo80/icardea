/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: Gokce  Laleci
 * License Type: Evaluation
 */
package tr.com.srdc.icardea.hibernate;

import org.orm.*;
import org.hibernate.Query;
import java.util.List;

public class MedicalCareplanTemplate {
	private static final org.apache.log4j.Logger _logger = org.apache.log4j.Logger.getLogger(MedicalCareplanTemplate.class);
	public MedicalCareplanTemplate() {
	}
	
	public static MedicalCareplanTemplate loadMedicalCareplanTemplateByORMID(int ID) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return loadMedicalCareplanTemplateByORMID(session, ID);
		}
		catch (Exception e) {
			_logger.error("loadMedicalCareplanTemplateByORMID(int ID)", e);
			return null;
		}
	}
	
	public static MedicalCareplanTemplate getMedicalCareplanTemplateByORMID(int ID) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return getMedicalCareplanTemplateByORMID(session, ID);
		}
		catch (Exception e) {
			_logger.error("getMedicalCareplanTemplateByORMID(int ID)", e);
			return null;
		}
	}
	
	public static MedicalCareplanTemplate loadMedicalCareplanTemplateByORMID(int ID, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return loadMedicalCareplanTemplateByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			_logger.error("loadMedicalCareplanTemplateByORMID(int ID, org.hibernate.LockMode lockMode)", e);
			return null;
		}
	}
	
	public static MedicalCareplanTemplate getMedicalCareplanTemplateByORMID(int ID, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return getMedicalCareplanTemplateByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			_logger.error("getMedicalCareplanTemplateByORMID(int ID, org.hibernate.LockMode lockMode)", e);
			return null;
		}
	}
	
	public static MedicalCareplanTemplate loadMedicalCareplanTemplateByORMID(PersistentSession session, int ID) {
		try {
			return (MedicalCareplanTemplate) session.load(tr.com.srdc.icardea.hibernate.MedicalCareplanTemplate.class, new Integer(ID));
		}
		catch (Exception e) {
			_logger.error("loadMedicalCareplanTemplateByORMID(PersistentSession session, int ID)", e);
			return null;
		}
	}
	
	public static MedicalCareplanTemplate getMedicalCareplanTemplateByORMID(PersistentSession session, int ID) {
		try {
			return (MedicalCareplanTemplate) session.get(tr.com.srdc.icardea.hibernate.MedicalCareplanTemplate.class, new Integer(ID));
		}
		catch (Exception e) {
			_logger.error("getMedicalCareplanTemplateByORMID(PersistentSession session, int ID)", e);
			return null;
		}
	}
	
	public static MedicalCareplanTemplate loadMedicalCareplanTemplateByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) {
		try {
			return (MedicalCareplanTemplate) session.load(tr.com.srdc.icardea.hibernate.MedicalCareplanTemplate.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			_logger.error("loadMedicalCareplanTemplateByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode)", e);
			return null;
		}
	}
	
	public static MedicalCareplanTemplate getMedicalCareplanTemplateByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) {
		try {
			return (MedicalCareplanTemplate) session.get(tr.com.srdc.icardea.hibernate.MedicalCareplanTemplate.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			_logger.error("getMedicalCareplanTemplateByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode)", e);
			return null;
		}
	}
	
	public static MedicalCareplanTemplate[] listMedicalCareplanTemplateByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return listMedicalCareplanTemplateByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("listMedicalCareplanTemplateByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static MedicalCareplanTemplate[] listMedicalCareplanTemplateByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return listMedicalCareplanTemplateByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("listMedicalCareplanTemplateByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static MedicalCareplanTemplate[] listMedicalCareplanTemplateByQuery(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From tr.com.srdc.icardea.hibernate.MedicalCareplanTemplate as MedicalCareplanTemplate");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			List list = query.list();
			return (MedicalCareplanTemplate[]) list.toArray(new MedicalCareplanTemplate[list.size()]);
		}
		catch (Exception e) {
			_logger.error("listMedicalCareplanTemplateByQuery(PersistentSession session, String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static MedicalCareplanTemplate[] listMedicalCareplanTemplateByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From tr.com.srdc.icardea.hibernate.MedicalCareplanTemplate as MedicalCareplanTemplate");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("this", lockMode);
			List list = query.list();
			return (MedicalCareplanTemplate[]) list.toArray(new MedicalCareplanTemplate[list.size()]);
		}
		catch (Exception e) {
			_logger.error("listMedicalCareplanTemplateByQuery(PersistentSession session, String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static MedicalCareplanTemplate loadMedicalCareplanTemplateByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return loadMedicalCareplanTemplateByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("loadMedicalCareplanTemplateByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static MedicalCareplanTemplate loadMedicalCareplanTemplateByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return loadMedicalCareplanTemplateByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("loadMedicalCareplanTemplateByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static MedicalCareplanTemplate loadMedicalCareplanTemplateByQuery(PersistentSession session, String condition, String orderBy) {
		MedicalCareplanTemplate[] medicalCareplanTemplates = listMedicalCareplanTemplateByQuery(session, condition, orderBy);
		if (medicalCareplanTemplates != null && medicalCareplanTemplates.length > 0)
			return medicalCareplanTemplates[0];
		else
			return null;
	}
	
	public static MedicalCareplanTemplate loadMedicalCareplanTemplateByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		MedicalCareplanTemplate[] medicalCareplanTemplates = listMedicalCareplanTemplateByQuery(session, condition, orderBy, lockMode);
		if (medicalCareplanTemplates != null && medicalCareplanTemplates.length > 0)
			return medicalCareplanTemplates[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateMedicalCareplanTemplateByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return iterateMedicalCareplanTemplateByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("iterateMedicalCareplanTemplateByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static java.util.Iterator iterateMedicalCareplanTemplateByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return iterateMedicalCareplanTemplateByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("iterateMedicalCareplanTemplateByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static java.util.Iterator iterateMedicalCareplanTemplateByQuery(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From tr.com.srdc.icardea.hibernate.MedicalCareplanTemplate as MedicalCareplanTemplate");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			_logger.error("iterateMedicalCareplanTemplateByQuery(PersistentSession session, String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static java.util.Iterator iterateMedicalCareplanTemplateByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From tr.com.srdc.icardea.hibernate.MedicalCareplanTemplate as MedicalCareplanTemplate");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("this", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			_logger.error("iterateMedicalCareplanTemplateByQuery(PersistentSession session, String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static MedicalCareplanTemplate loadMedicalCareplanTemplateByCriteria(MedicalCareplanTemplateCriteria medicalCareplanTemplateCriteria) {
		MedicalCareplanTemplate[] medicalCareplanTemplates = listMedicalCareplanTemplateByCriteria(medicalCareplanTemplateCriteria);
		if(medicalCareplanTemplates == null || medicalCareplanTemplates.length == 0) {
			return null;
		}
		return medicalCareplanTemplates[0];
	}
	
	public static MedicalCareplanTemplate[] listMedicalCareplanTemplateByCriteria(MedicalCareplanTemplateCriteria medicalCareplanTemplateCriteria) {
		return medicalCareplanTemplateCriteria.listMedicalCareplanTemplate();
	}
	
	public static MedicalCareplanTemplate createMedicalCareplanTemplate() {
		return new tr.com.srdc.icardea.hibernate.MedicalCareplanTemplate();
	}
	
	public boolean save() {
		try {
			tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().saveObject(this);
			return true;
		}
		catch (Exception e) {
			_logger.error("save()", e);
			return false;
		}
	}
	
	public boolean delete() {
		try {
			tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().deleteObject(this);
			return true;
		}
		catch (Exception e) {
			_logger.error("delete()", e);
			return false;
		}
	}
	
	public boolean refresh() {
		try {
			tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession().refresh(this);
			return true;
		}
		catch (Exception e) {
			_logger.error("refresh()", e);
			return false;
		}
	}
	
	public boolean evict() {
		try {
			tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession().evict(this);
			return true;
		}
		catch (Exception e) {
			_logger.error("evict()", e);
			return false;
		}
	}
	
	public boolean deleteAndDissociate() {
		try {
			tr.com.srdc.icardea.hibernate.PersonalizedMedicalCareplan[] lPersonalizedMedicalCareplans = personalizedMedicalCareplan.toArray();
			for(int i = 0; i < lPersonalizedMedicalCareplans.length; i++) {
				lPersonalizedMedicalCareplans[i].setMedicalCareplanTemplate(null);
			}
			return delete();
		}
		catch(Exception e) {
			_logger.error("deleteAndDissociate()", e);
			return false;
		}
	}
	
	public boolean deleteAndDissociate(org.orm.PersistentSession session) {
		try {
			tr.com.srdc.icardea.hibernate.PersonalizedMedicalCareplan[] lPersonalizedMedicalCareplans = personalizedMedicalCareplan.toArray();
			for(int i = 0; i < lPersonalizedMedicalCareplans.length; i++) {
				lPersonalizedMedicalCareplans[i].setMedicalCareplanTemplate(null);
			}
			try {
				session.delete(this);
				return true;
			} catch (Exception e) {
				return false;
			}
		}
		catch(Exception e) {
			_logger.error("deleteAndDissociate(org.orm.PersistentSession session)", e);
			return false;
		}
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == tr.com.srdc.icardea.hibernate.ORMConstants.KEY_MEDICALCAREPLANTEMPLATE_PERSONALIZEDMEDICALCAREPLAN) {
			return ORM_personalizedMedicalCareplan;
		}
		
		return null;
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	private int ID;
	
	private String content;
	
	private String identifier;
	
	private Boolean approved;
	
	private String ICD10Code;
	
	private java.sql.Timestamp creationDate;
	
	private String name;
	private String careplan;
	private String diagram;
	
	private java.util.Set ORM_personalizedMedicalCareplan = new java.util.HashSet();
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setContent(String value) {
		this.content = value;
	}
	
	public String getContent() {
		return content;
	}
	
	public void setIdentifier(String value) {
		this.identifier = value;
	}
	
	public String getIdentifier() {
		return identifier;
	}
	
	public void setApproved(boolean value) {
		setApproved(new Boolean(value));
	}
	
	public void setApproved(Boolean value) {
		this.approved = value;
	}
	
	public Boolean getApproved() {
		return approved;
	}
	
	public void setICD10Code(String value) {
		this.ICD10Code = value;
	}
	
	public String getICD10Code() {
		return ICD10Code;
	}
	
	public void setCreationDate(java.sql.Timestamp value) {
		this.creationDate = value;
	}
	
	public java.sql.Timestamp getCreationDate() {
		return creationDate;
	}
	
	public void setName(String value) {
		this.name = value;
	}
	
	public String getName() {
		return name;
	}
	
	private void setORM_PersonalizedMedicalCareplan(java.util.Set value) {
		this.ORM_personalizedMedicalCareplan = value;
	}
	
	private java.util.Set getORM_PersonalizedMedicalCareplan() {
		return ORM_personalizedMedicalCareplan;
	}
	
	public final tr.com.srdc.icardea.hibernate.PersonalizedMedicalCareplanSetCollection personalizedMedicalCareplan = new tr.com.srdc.icardea.hibernate.PersonalizedMedicalCareplanSetCollection(this, _ormAdapter, tr.com.srdc.icardea.hibernate.ORMConstants.KEY_MEDICALCAREPLANTEMPLATE_PERSONALIZEDMEDICALCAREPLAN, tr.com.srdc.icardea.hibernate.ORMConstants.KEY_PERSONALIZEDMEDICALCAREPLAN_MEDICALCAREPLANTEMPLATE, tr.com.srdc.icardea.hibernate.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return toString(false);
	}
	
	public String toString(boolean idOnly) {
		if (idOnly) {
			return String.valueOf(getID());
		}
		else {
			StringBuffer sb = new StringBuffer();
			sb.append("MedicalCareplanTemplate[ ");
			sb.append("ID=").append(getID()).append(" ");
			sb.append("Content=").append(getContent()).append(" ");
			sb.append("Identifier=").append(getIdentifier()).append(" ");
			sb.append("Approved=").append(getApproved()).append(" ");
			sb.append("ICD10Code=").append(getICD10Code()).append(" ");
			sb.append("CreationDate=").append(getCreationDate()).append(" ");
			sb.append("Name=").append(getName()).append(" ");
			sb.append("PersonalizedMedicalCareplan.size=").append(personalizedMedicalCareplan.size()).append(" ");
			sb.append("]");
			return sb.toString();
		}
	}

	public void setCareplan(String careplan) {
		this.careplan = careplan;
	}

	public String getCareplan() {
		return careplan;
	}

	public void setDiagram(String diagram) {
		this.diagram = diagram;
	}

	public String getDiagram() {
		return diagram;
	}
	
}
