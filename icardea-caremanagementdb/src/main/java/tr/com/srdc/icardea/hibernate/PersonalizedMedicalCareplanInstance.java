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

public class PersonalizedMedicalCareplanInstance {
	private static final org.apache.log4j.Logger _logger = org.apache.log4j.Logger.getLogger(PersonalizedMedicalCareplanInstance.class);
	public PersonalizedMedicalCareplanInstance() {
	}
	
	public static PersonalizedMedicalCareplanInstance loadPersonalizedMedicalCareplanInstanceByORMID(int ID) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return loadPersonalizedMedicalCareplanInstanceByORMID(session, ID);
		}
		catch (Exception e) {
			_logger.error("loadPersonalizedMedicalCareplanInstanceByORMID(int ID)", e);
			return null;
		}
	}
	
	public static PersonalizedMedicalCareplanInstance getPersonalizedMedicalCareplanInstanceByORMID(int ID) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return getPersonalizedMedicalCareplanInstanceByORMID(session, ID);
		}
		catch (Exception e) {
			_logger.error("getPersonalizedMedicalCareplanInstanceByORMID(int ID)", e);
			return null;
		}
	}
	
	public static PersonalizedMedicalCareplanInstance loadPersonalizedMedicalCareplanInstanceByORMID(int ID, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return loadPersonalizedMedicalCareplanInstanceByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			_logger.error("loadPersonalizedMedicalCareplanInstanceByORMID(int ID, org.hibernate.LockMode lockMode)", e);
			return null;
		}
	}
	
	public static PersonalizedMedicalCareplanInstance getPersonalizedMedicalCareplanInstanceByORMID(int ID, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return getPersonalizedMedicalCareplanInstanceByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			_logger.error("getPersonalizedMedicalCareplanInstanceByORMID(int ID, org.hibernate.LockMode lockMode)", e);
			return null;
		}
	}
	
	public static PersonalizedMedicalCareplanInstance loadPersonalizedMedicalCareplanInstanceByORMID(PersistentSession session, int ID) {
		try {
			return (PersonalizedMedicalCareplanInstance) session.load(tr.com.srdc.icardea.hibernate.PersonalizedMedicalCareplanInstance.class, new Integer(ID));
		}
		catch (Exception e) {
			_logger.error("loadPersonalizedMedicalCareplanInstanceByORMID(PersistentSession session, int ID)", e);
			return null;
		}
	}
	
	public static PersonalizedMedicalCareplanInstance getPersonalizedMedicalCareplanInstanceByORMID(PersistentSession session, int ID) {
		try {
			return (PersonalizedMedicalCareplanInstance) session.get(tr.com.srdc.icardea.hibernate.PersonalizedMedicalCareplanInstance.class, new Integer(ID));
		}
		catch (Exception e) {
			_logger.error("getPersonalizedMedicalCareplanInstanceByORMID(PersistentSession session, int ID)", e);
			return null;
		}
	}
	
	public static PersonalizedMedicalCareplanInstance loadPersonalizedMedicalCareplanInstanceByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) {
		try {
			return (PersonalizedMedicalCareplanInstance) session.load(tr.com.srdc.icardea.hibernate.PersonalizedMedicalCareplanInstance.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			_logger.error("loadPersonalizedMedicalCareplanInstanceByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode)", e);
			return null;
		}
	}
	
	public static PersonalizedMedicalCareplanInstance getPersonalizedMedicalCareplanInstanceByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) {
		try {
			return (PersonalizedMedicalCareplanInstance) session.get(tr.com.srdc.icardea.hibernate.PersonalizedMedicalCareplanInstance.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			_logger.error("getPersonalizedMedicalCareplanInstanceByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode)", e);
			return null;
		}
	}
	
	public static PersonalizedMedicalCareplanInstance[] listPersonalizedMedicalCareplanInstanceByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return listPersonalizedMedicalCareplanInstanceByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("listPersonalizedMedicalCareplanInstanceByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static PersonalizedMedicalCareplanInstance[] listPersonalizedMedicalCareplanInstanceByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return listPersonalizedMedicalCareplanInstanceByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("listPersonalizedMedicalCareplanInstanceByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static PersonalizedMedicalCareplanInstance[] listPersonalizedMedicalCareplanInstanceByQuery(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From tr.com.srdc.icardea.hibernate.PersonalizedMedicalCareplanInstance as PersonalizedMedicalCareplanInstance");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			List list = query.list();
			return (PersonalizedMedicalCareplanInstance[]) list.toArray(new PersonalizedMedicalCareplanInstance[list.size()]);
		}
		catch (Exception e) {
			_logger.error("listPersonalizedMedicalCareplanInstanceByQuery(PersistentSession session, String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static PersonalizedMedicalCareplanInstance[] listPersonalizedMedicalCareplanInstanceByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From tr.com.srdc.icardea.hibernate.PersonalizedMedicalCareplanInstance as PersonalizedMedicalCareplanInstance");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("this", lockMode);
			List list = query.list();
			return (PersonalizedMedicalCareplanInstance[]) list.toArray(new PersonalizedMedicalCareplanInstance[list.size()]);
		}
		catch (Exception e) {
			_logger.error("listPersonalizedMedicalCareplanInstanceByQuery(PersistentSession session, String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static PersonalizedMedicalCareplanInstance loadPersonalizedMedicalCareplanInstanceByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return loadPersonalizedMedicalCareplanInstanceByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("loadPersonalizedMedicalCareplanInstanceByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static PersonalizedMedicalCareplanInstance loadPersonalizedMedicalCareplanInstanceByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return loadPersonalizedMedicalCareplanInstanceByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("loadPersonalizedMedicalCareplanInstanceByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static PersonalizedMedicalCareplanInstance loadPersonalizedMedicalCareplanInstanceByQuery(PersistentSession session, String condition, String orderBy) {
		PersonalizedMedicalCareplanInstance[] personalizedMedicalCareplanInstances = listPersonalizedMedicalCareplanInstanceByQuery(session, condition, orderBy);
		if (personalizedMedicalCareplanInstances != null && personalizedMedicalCareplanInstances.length > 0)
			return personalizedMedicalCareplanInstances[0];
		else
			return null;
	}
	
	public static PersonalizedMedicalCareplanInstance loadPersonalizedMedicalCareplanInstanceByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		PersonalizedMedicalCareplanInstance[] personalizedMedicalCareplanInstances = listPersonalizedMedicalCareplanInstanceByQuery(session, condition, orderBy, lockMode);
		if (personalizedMedicalCareplanInstances != null && personalizedMedicalCareplanInstances.length > 0)
			return personalizedMedicalCareplanInstances[0];
		else
			return null;
	}
	
	public static java.util.Iterator iteratePersonalizedMedicalCareplanInstanceByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return iteratePersonalizedMedicalCareplanInstanceByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("iteratePersonalizedMedicalCareplanInstanceByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static java.util.Iterator iteratePersonalizedMedicalCareplanInstanceByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return iteratePersonalizedMedicalCareplanInstanceByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("iteratePersonalizedMedicalCareplanInstanceByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static java.util.Iterator iteratePersonalizedMedicalCareplanInstanceByQuery(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From tr.com.srdc.icardea.hibernate.PersonalizedMedicalCareplanInstance as PersonalizedMedicalCareplanInstance");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			_logger.error("iteratePersonalizedMedicalCareplanInstanceByQuery(PersistentSession session, String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static java.util.Iterator iteratePersonalizedMedicalCareplanInstanceByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From tr.com.srdc.icardea.hibernate.PersonalizedMedicalCareplanInstance as PersonalizedMedicalCareplanInstance");
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
			_logger.error("iteratePersonalizedMedicalCareplanInstanceByQuery(PersistentSession session, String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static PersonalizedMedicalCareplanInstance loadPersonalizedMedicalCareplanInstanceByCriteria(PersonalizedMedicalCareplanInstanceCriteria personalizedMedicalCareplanInstanceCriteria) {
		PersonalizedMedicalCareplanInstance[] personalizedMedicalCareplanInstances = listPersonalizedMedicalCareplanInstanceByCriteria(personalizedMedicalCareplanInstanceCriteria);
		if(personalizedMedicalCareplanInstances == null || personalizedMedicalCareplanInstances.length == 0) {
			return null;
		}
		return personalizedMedicalCareplanInstances[0];
	}
	
	public static PersonalizedMedicalCareplanInstance[] listPersonalizedMedicalCareplanInstanceByCriteria(PersonalizedMedicalCareplanInstanceCriteria personalizedMedicalCareplanInstanceCriteria) {
		return personalizedMedicalCareplanInstanceCriteria.listPersonalizedMedicalCareplanInstance();
	}
	
	public static PersonalizedMedicalCareplanInstance createPersonalizedMedicalCareplanInstance() {
		return new tr.com.srdc.icardea.hibernate.PersonalizedMedicalCareplanInstance();
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
			if(getPersonalizedMedicalCareplan() != null) {
				getPersonalizedMedicalCareplan().personalizedMedicalCareplanInstance.remove(this);
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
			if(getPersonalizedMedicalCareplan() != null) {
				getPersonalizedMedicalCareplan().personalizedMedicalCareplanInstance.remove(this);
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
	
	private void this_setOwner(Object owner, int key) {
		if (key == tr.com.srdc.icardea.hibernate.ORMConstants.KEY_PERSONALIZEDMEDICALCAREPLANINSTANCE_PERSONALIZEDMEDICALCAREPLAN) {
			this.personalizedMedicalCareplan = (tr.com.srdc.icardea.hibernate.PersonalizedMedicalCareplan) owner;
		}
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	private int ID;
	
	private String content;
	
	private String identifier;
	
	private java.sql.Timestamp instantiationDate;
	
	private tr.com.srdc.icardea.hibernate.PersonalizedMedicalCareplan personalizedMedicalCareplan;
	
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
	
	public void setInstantiationDate(java.sql.Timestamp value) {
		this.instantiationDate = value;
	}
	
	public java.sql.Timestamp getInstantiationDate() {
		return instantiationDate;
	}
	
	public void setPersonalizedMedicalCareplan(tr.com.srdc.icardea.hibernate.PersonalizedMedicalCareplan value) {
		if (personalizedMedicalCareplan != null) {
			personalizedMedicalCareplan.personalizedMedicalCareplanInstance.remove(this);
		}
		if (value != null) {
			value.personalizedMedicalCareplanInstance.add(this);
		}
	}
	
	public tr.com.srdc.icardea.hibernate.PersonalizedMedicalCareplan getPersonalizedMedicalCareplan() {
		return personalizedMedicalCareplan;
	}
	
	/**
	 * This method is for internal use only.
	 */
	private void setORM_PersonalizedMedicalCareplan(tr.com.srdc.icardea.hibernate.PersonalizedMedicalCareplan value) {
		this.personalizedMedicalCareplan = value;
	}
	
	private tr.com.srdc.icardea.hibernate.PersonalizedMedicalCareplan getORM_PersonalizedMedicalCareplan() {
		return personalizedMedicalCareplan;
	}
	
	public String toString() {
		return toString(false);
	}
	
	public String toString(boolean idOnly) {
		if (idOnly) {
			return String.valueOf(getID());
		}
		else {
			StringBuffer sb = new StringBuffer();
			sb.append("PersonalizedMedicalCareplanInstance[ ");
			sb.append("ID=").append(getID()).append(" ");
			sb.append("Content=").append(getContent()).append(" ");
			sb.append("Identifier=").append(getIdentifier()).append(" ");
			sb.append("InstantiationDate=").append(getInstantiationDate()).append(" ");
			if (getPersonalizedMedicalCareplan() != null)
				sb.append("PersonalizedMedicalCareplan.Persist_ID=").append(getPersonalizedMedicalCareplan().toString(true)).append(" ");
			else
				sb.append("PersonalizedMedicalCareplan=null ");
			sb.append("]");
			return sb.toString();
		}
	}
	
}
