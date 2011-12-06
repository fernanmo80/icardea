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

public class PersonalizedMedicalCareplan {
	private static final org.apache.log4j.Logger _logger = org.apache.log4j.Logger.getLogger(PersonalizedMedicalCareplan.class);
	public PersonalizedMedicalCareplan() {
	}
	
	public static PersonalizedMedicalCareplan loadPersonalizedMedicalCareplanByORMID(int ID) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return loadPersonalizedMedicalCareplanByORMID(session, ID);
		}
		catch (Exception e) {
			_logger.error("loadPersonalizedMedicalCareplanByORMID(int ID)", e);
			return null;
		}
	}
	
	public static PersonalizedMedicalCareplan getPersonalizedMedicalCareplanByORMID(int ID) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return getPersonalizedMedicalCareplanByORMID(session, ID);
		}
		catch (Exception e) {
			_logger.error("getPersonalizedMedicalCareplanByORMID(int ID)", e);
			return null;
		}
	}
	
	public static PersonalizedMedicalCareplan loadPersonalizedMedicalCareplanByORMID(int ID, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return loadPersonalizedMedicalCareplanByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			_logger.error("loadPersonalizedMedicalCareplanByORMID(int ID, org.hibernate.LockMode lockMode)", e);
			return null;
		}
	}
	
	public static PersonalizedMedicalCareplan getPersonalizedMedicalCareplanByORMID(int ID, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return getPersonalizedMedicalCareplanByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			_logger.error("getPersonalizedMedicalCareplanByORMID(int ID, org.hibernate.LockMode lockMode)", e);
			return null;
		}
	}
	
	public static PersonalizedMedicalCareplan loadPersonalizedMedicalCareplanByORMID(PersistentSession session, int ID) {
		try {
			return (PersonalizedMedicalCareplan) session.load(tr.com.srdc.icardea.hibernate.PersonalizedMedicalCareplan.class, new Integer(ID));
		}
		catch (Exception e) {
			_logger.error("loadPersonalizedMedicalCareplanByORMID(PersistentSession session, int ID)", e);
			return null;
		}
	}
	
	public static PersonalizedMedicalCareplan getPersonalizedMedicalCareplanByORMID(PersistentSession session, int ID) {
		try {
			return (PersonalizedMedicalCareplan) session.get(tr.com.srdc.icardea.hibernate.PersonalizedMedicalCareplan.class, new Integer(ID));
		}
		catch (Exception e) {
			_logger.error("getPersonalizedMedicalCareplanByORMID(PersistentSession session, int ID)", e);
			return null;
		}
	}
	
	public static PersonalizedMedicalCareplan loadPersonalizedMedicalCareplanByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) {
		try {
			return (PersonalizedMedicalCareplan) session.load(tr.com.srdc.icardea.hibernate.PersonalizedMedicalCareplan.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			_logger.error("loadPersonalizedMedicalCareplanByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode)", e);
			return null;
		}
	}
	
	public static PersonalizedMedicalCareplan getPersonalizedMedicalCareplanByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) {
		try {
			return (PersonalizedMedicalCareplan) session.get(tr.com.srdc.icardea.hibernate.PersonalizedMedicalCareplan.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			_logger.error("getPersonalizedMedicalCareplanByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode)", e);
			return null;
		}
	}
	
	public static PersonalizedMedicalCareplan[] listPersonalizedMedicalCareplanByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return listPersonalizedMedicalCareplanByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("listPersonalizedMedicalCareplanByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static PersonalizedMedicalCareplan[] listPersonalizedMedicalCareplanByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return listPersonalizedMedicalCareplanByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("listPersonalizedMedicalCareplanByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static PersonalizedMedicalCareplan[] listPersonalizedMedicalCareplanByQuery(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From tr.com.srdc.icardea.hibernate.PersonalizedMedicalCareplan as PersonalizedMedicalCareplan");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			List list = query.list();
			return (PersonalizedMedicalCareplan[]) list.toArray(new PersonalizedMedicalCareplan[list.size()]);
		}
		catch (Exception e) {
			_logger.error("listPersonalizedMedicalCareplanByQuery(PersistentSession session, String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static PersonalizedMedicalCareplan[] listPersonalizedMedicalCareplanByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From tr.com.srdc.icardea.hibernate.PersonalizedMedicalCareplan as PersonalizedMedicalCareplan");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("this", lockMode);
			List list = query.list();
			return (PersonalizedMedicalCareplan[]) list.toArray(new PersonalizedMedicalCareplan[list.size()]);
		}
		catch (Exception e) {
			_logger.error("listPersonalizedMedicalCareplanByQuery(PersistentSession session, String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static PersonalizedMedicalCareplan loadPersonalizedMedicalCareplanByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return loadPersonalizedMedicalCareplanByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("loadPersonalizedMedicalCareplanByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static PersonalizedMedicalCareplan loadPersonalizedMedicalCareplanByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return loadPersonalizedMedicalCareplanByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("loadPersonalizedMedicalCareplanByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static PersonalizedMedicalCareplan loadPersonalizedMedicalCareplanByQuery(PersistentSession session, String condition, String orderBy) {
		PersonalizedMedicalCareplan[] personalizedMedicalCareplans = listPersonalizedMedicalCareplanByQuery(session, condition, orderBy);
		if (personalizedMedicalCareplans != null && personalizedMedicalCareplans.length > 0)
			return personalizedMedicalCareplans[0];
		else
			return null;
	}
	
	public static PersonalizedMedicalCareplan loadPersonalizedMedicalCareplanByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		PersonalizedMedicalCareplan[] personalizedMedicalCareplans = listPersonalizedMedicalCareplanByQuery(session, condition, orderBy, lockMode);
		if (personalizedMedicalCareplans != null && personalizedMedicalCareplans.length > 0)
			return personalizedMedicalCareplans[0];
		else
			return null;
	}
	
	public static java.util.Iterator iteratePersonalizedMedicalCareplanByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return iteratePersonalizedMedicalCareplanByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("iteratePersonalizedMedicalCareplanByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static java.util.Iterator iteratePersonalizedMedicalCareplanByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return iteratePersonalizedMedicalCareplanByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("iteratePersonalizedMedicalCareplanByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static java.util.Iterator iteratePersonalizedMedicalCareplanByQuery(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From tr.com.srdc.icardea.hibernate.PersonalizedMedicalCareplan as PersonalizedMedicalCareplan");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			_logger.error("iteratePersonalizedMedicalCareplanByQuery(PersistentSession session, String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static java.util.Iterator iteratePersonalizedMedicalCareplanByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From tr.com.srdc.icardea.hibernate.PersonalizedMedicalCareplan as PersonalizedMedicalCareplan");
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
			_logger.error("iteratePersonalizedMedicalCareplanByQuery(PersistentSession session, String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static PersonalizedMedicalCareplan loadPersonalizedMedicalCareplanByCriteria(PersonalizedMedicalCareplanCriteria personalizedMedicalCareplanCriteria) {
		PersonalizedMedicalCareplan[] personalizedMedicalCareplans = listPersonalizedMedicalCareplanByCriteria(personalizedMedicalCareplanCriteria);
		if(personalizedMedicalCareplans == null || personalizedMedicalCareplans.length == 0) {
			return null;
		}
		return personalizedMedicalCareplans[0];
	}
	
	public static PersonalizedMedicalCareplan[] listPersonalizedMedicalCareplanByCriteria(PersonalizedMedicalCareplanCriteria personalizedMedicalCareplanCriteria) {
		return personalizedMedicalCareplanCriteria.listPersonalizedMedicalCareplan();
	}
	
	public static PersonalizedMedicalCareplan createPersonalizedMedicalCareplan() {
		return new tr.com.srdc.icardea.hibernate.PersonalizedMedicalCareplan();
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
			if(getMedicalCareplanTemplate() != null) {
				getMedicalCareplanTemplate().personalizedMedicalCareplan.remove(this);
			}
			
			tr.com.srdc.icardea.hibernate.PersonalizedMedicalCareplanInstance[] lPersonalizedMedicalCareplanInstances = personalizedMedicalCareplanInstance.toArray();
			for(int i = 0; i < lPersonalizedMedicalCareplanInstances.length; i++) {
				lPersonalizedMedicalCareplanInstances[i].setPersonalizedMedicalCareplan(null);
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
			if(getMedicalCareplanTemplate() != null) {
				getMedicalCareplanTemplate().personalizedMedicalCareplan.remove(this);
			}
			
			tr.com.srdc.icardea.hibernate.PersonalizedMedicalCareplanInstance[] lPersonalizedMedicalCareplanInstances = personalizedMedicalCareplanInstance.toArray();
			for(int i = 0; i < lPersonalizedMedicalCareplanInstances.length; i++) {
				lPersonalizedMedicalCareplanInstances[i].setPersonalizedMedicalCareplan(null);
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
		if (key == tr.com.srdc.icardea.hibernate.ORMConstants.KEY_PERSONALIZEDMEDICALCAREPLAN_PERSONALIZEDMEDICALCAREPLANINSTANCE) {
			return ORM_personalizedMedicalCareplanInstance;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == tr.com.srdc.icardea.hibernate.ORMConstants.KEY_PERSONALIZEDMEDICALCAREPLAN_MEDICALCAREPLANTEMPLATE) {
			this.medicalCareplanTemplate = (tr.com.srdc.icardea.hibernate.MedicalCareplanTemplate) owner;
		}
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	private int ID;
	
	private String content;
	
	private String identifier;
	
	private java.sql.Timestamp creationDate;
	
	private String name;
	
	private String patientIdentifier;
	
	private tr.com.srdc.icardea.hibernate.MedicalCareplanTemplate medicalCareplanTemplate;
	
	private java.util.Set ORM_personalizedMedicalCareplanInstance = new java.util.HashSet();
	
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
	
	public void setPatientIdentifier(String value) {
		this.patientIdentifier = value;
	}
	
	public String getPatientIdentifier() {
		return patientIdentifier;
	}
	
	public void setMedicalCareplanTemplate(tr.com.srdc.icardea.hibernate.MedicalCareplanTemplate value) {
		if (medicalCareplanTemplate != null) {
			medicalCareplanTemplate.personalizedMedicalCareplan.remove(this);
		}
		if (value != null) {
			value.personalizedMedicalCareplan.add(this);
		}
	}
	
	public tr.com.srdc.icardea.hibernate.MedicalCareplanTemplate getMedicalCareplanTemplate() {
		return medicalCareplanTemplate;
	}
	
	/**
	 * This method is for internal use only.
	 */
	private void setORM_MedicalCareplanTemplate(tr.com.srdc.icardea.hibernate.MedicalCareplanTemplate value) {
		this.medicalCareplanTemplate = value;
	}
	
	private tr.com.srdc.icardea.hibernate.MedicalCareplanTemplate getORM_MedicalCareplanTemplate() {
		return medicalCareplanTemplate;
	}
	
	private void setORM_PersonalizedMedicalCareplanInstance(java.util.Set value) {
		this.ORM_personalizedMedicalCareplanInstance = value;
	}
	
	private java.util.Set getORM_PersonalizedMedicalCareplanInstance() {
		return ORM_personalizedMedicalCareplanInstance;
	}
	
	public final tr.com.srdc.icardea.hibernate.PersonalizedMedicalCareplanInstanceSetCollection personalizedMedicalCareplanInstance = new tr.com.srdc.icardea.hibernate.PersonalizedMedicalCareplanInstanceSetCollection(this, _ormAdapter, tr.com.srdc.icardea.hibernate.ORMConstants.KEY_PERSONALIZEDMEDICALCAREPLAN_PERSONALIZEDMEDICALCAREPLANINSTANCE, tr.com.srdc.icardea.hibernate.ORMConstants.KEY_PERSONALIZEDMEDICALCAREPLANINSTANCE_PERSONALIZEDMEDICALCAREPLAN, tr.com.srdc.icardea.hibernate.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return toString(false);
	}
	
	public String toString(boolean idOnly) {
		if (idOnly) {
			return String.valueOf(getID());
		}
		else {
			StringBuffer sb = new StringBuffer();
			sb.append("PersonalizedMedicalCareplan[ ");
			sb.append("ID=").append(getID()).append(" ");
			sb.append("Content=").append(getContent()).append(" ");
			sb.append("Identifier=").append(getIdentifier()).append(" ");
			sb.append("CreationDate=").append(getCreationDate()).append(" ");
			sb.append("Name=").append(getName()).append(" ");
			sb.append("PatientIdentifier=").append(getPatientIdentifier()).append(" ");
			if (getMedicalCareplanTemplate() != null)
				sb.append("MedicalCareplanTemplate.Persist_ID=").append(getMedicalCareplanTemplate().toString(true)).append(" ");
			else
				sb.append("MedicalCareplanTemplate=null ");
			sb.append("PersonalizedMedicalCareplanInstance.size=").append(personalizedMedicalCareplanInstance.size()).append(" ");
			sb.append("]");
			return sb.toString();
		}
	}
	
}
