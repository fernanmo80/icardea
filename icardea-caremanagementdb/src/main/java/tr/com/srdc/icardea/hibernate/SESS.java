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

public class SESS {
	private static final org.apache.log4j.Logger _logger = org.apache.log4j.Logger.getLogger(SESS.class);
	public SESS() {
	}
	
	public static SESS loadSESSByORMID(int ID) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return loadSESSByORMID(session, ID);
		}
		catch (Exception e) {
			_logger.error("loadSESSByORMID(int ID)", e);
			return null;
		}
	}
	
	public static SESS getSESSByORMID(int ID) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return getSESSByORMID(session, ID);
		}
		catch (Exception e) {
			_logger.error("getSESSByORMID(int ID)", e);
			return null;
		}
	}
	
	public static SESS loadSESSByORMID(int ID, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return loadSESSByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			_logger.error("loadSESSByORMID(int ID, org.hibernate.LockMode lockMode)", e);
			return null;
		}
	}
	
	public static SESS getSESSByORMID(int ID, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return getSESSByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			_logger.error("getSESSByORMID(int ID, org.hibernate.LockMode lockMode)", e);
			return null;
		}
	}
	
	public static SESS loadSESSByORMID(PersistentSession session, int ID) {
		try {
			return (SESS) session.load(tr.com.srdc.icardea.hibernate.SESS.class, new Integer(ID));
		}
		catch (Exception e) {
			_logger.error("loadSESSByORMID(PersistentSession session, int ID)", e);
			return null;
		}
	}
	
	public static SESS getSESSByORMID(PersistentSession session, int ID) {
		try {
			return (SESS) session.get(tr.com.srdc.icardea.hibernate.SESS.class, new Integer(ID));
		}
		catch (Exception e) {
			_logger.error("getSESSByORMID(PersistentSession session, int ID)", e);
			return null;
		}
	}
	
	public static SESS loadSESSByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) {
		try {
			return (SESS) session.load(tr.com.srdc.icardea.hibernate.SESS.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			_logger.error("loadSESSByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode)", e);
			return null;
		}
	}
	
	public static SESS getSESSByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) {
		try {
			return (SESS) session.get(tr.com.srdc.icardea.hibernate.SESS.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			_logger.error("getSESSByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode)", e);
			return null;
		}
	}
	
	public static SESS[] listSESSByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return listSESSByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("listSESSByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static SESS[] listSESSByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return listSESSByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("listSESSByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static SESS[] listSESSByQuery(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From tr.com.srdc.icardea.hibernate.SESS as SESS");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			List list = query.list();
			return (SESS[]) list.toArray(new SESS[list.size()]);
		}
		catch (Exception e) {
			_logger.error("listSESSByQuery(PersistentSession session, String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static SESS[] listSESSByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From tr.com.srdc.icardea.hibernate.SESS as SESS");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("this", lockMode);
			List list = query.list();
			return (SESS[]) list.toArray(new SESS[list.size()]);
		}
		catch (Exception e) {
			_logger.error("listSESSByQuery(PersistentSession session, String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static SESS loadSESSByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return loadSESSByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("loadSESSByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static SESS loadSESSByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return loadSESSByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("loadSESSByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static SESS loadSESSByQuery(PersistentSession session, String condition, String orderBy) {
		SESS[] sESSs = listSESSByQuery(session, condition, orderBy);
		if (sESSs != null && sESSs.length > 0)
			return sESSs[0];
		else
			return null;
	}
	
	public static SESS loadSESSByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		SESS[] sESSs = listSESSByQuery(session, condition, orderBy, lockMode);
		if (sESSs != null && sESSs.length > 0)
			return sESSs[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateSESSByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return iterateSESSByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("iterateSESSByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static java.util.Iterator iterateSESSByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return iterateSESSByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("iterateSESSByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static java.util.Iterator iterateSESSByQuery(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From tr.com.srdc.icardea.hibernate.SESS as SESS");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			_logger.error("iterateSESSByQuery(PersistentSession session, String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static java.util.Iterator iterateSESSByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From tr.com.srdc.icardea.hibernate.SESS as SESS");
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
			_logger.error("iterateSESSByQuery(PersistentSession session, String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static SESS loadSESSByCriteria(SESSCriteria sESSCriteria) {
		SESS[] sESSs = listSESSByCriteria(sESSCriteria);
		if(sESSs == null || sESSs.length == 0) {
			return null;
		}
		return sESSs[0];
	}
	
	public static SESS[] listSESSByCriteria(SESSCriteria sESSCriteria) {
		return sESSCriteria.listSESS();
	}
	
	public static SESS createSESS() {
		return new tr.com.srdc.icardea.hibernate.SESS();
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
			if(getSystem() != null) {
				getSystem().setsESS(null);
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
			if(getSystem() != null) {
				getSystem().setsESS(null);
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
	
	private int ID;
	
	private tr.com.srdc.icardea.hibernate.System system;
	
	private String dtm;
	
	private String type;
	
	private String reprogrammed;
	
	private String dtm_previous;
	
	private String type_previous;
	
	private String reprogrammed_previous;
	
	private String clinician_name;
	
	private String clinician_contact_information;
	
	private String clinic_name;
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setDtm(String value) {
		this.dtm = value;
	}
	
	public String getDtm() {
		return dtm;
	}
	
	public void setType(String value) {
		this.type = value;
	}
	
	public String getType() {
		return type;
	}
	
	public void setReprogrammed(String value) {
		this.reprogrammed = value;
	}
	
	public String getReprogrammed() {
		return reprogrammed;
	}
	
	public void setDtm_previous(String value) {
		this.dtm_previous = value;
	}
	
	public String getDtm_previous() {
		return dtm_previous;
	}
	
	public void setType_previous(String value) {
		this.type_previous = value;
	}
	
	public String getType_previous() {
		return type_previous;
	}
	
	public void setReprogrammed_previous(String value) {
		this.reprogrammed_previous = value;
	}
	
	public String getReprogrammed_previous() {
		return reprogrammed_previous;
	}
	
	public void setClinician_name(String value) {
		this.clinician_name = value;
	}
	
	public String getClinician_name() {
		return clinician_name;
	}
	
	public void setClinician_contact_information(String value) {
		this.clinician_contact_information = value;
	}
	
	public String getClinician_contact_information() {
		return clinician_contact_information;
	}
	
	public void setClinic_name(String value) {
		this.clinic_name = value;
	}
	
	public String getClinic_name() {
		return clinic_name;
	}
	
	public void setSystem(tr.com.srdc.icardea.hibernate.System value) {
		if (this.system != value) {
			tr.com.srdc.icardea.hibernate.System lsystem = this.system;
			this.system = value;
			if (value != null) {
				system.setsESS(this);
			}
			else {
				lsystem.setsESS(null);
			}
		}
	}
	
	public tr.com.srdc.icardea.hibernate.System getSystem() {
		return system;
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
			sb.append("SESS[ ");
			sb.append("ID=").append(getID()).append(" ");
			if (getSystem() != null)
				sb.append("System.Persist_ID=").append(getSystem().toString(true)).append(" ");
			else
				sb.append("System=null ");
			sb.append("Dtm=").append(getDtm()).append(" ");
			sb.append("Type=").append(getType()).append(" ");
			sb.append("Reprogrammed=").append(getReprogrammed()).append(" ");
			sb.append("Dtm_previous=").append(getDtm_previous()).append(" ");
			sb.append("Type_previous=").append(getType_previous()).append(" ");
			sb.append("Reprogrammed_previous=").append(getReprogrammed_previous()).append(" ");
			sb.append("Clinician_name=").append(getClinician_name()).append(" ");
			sb.append("Clinician_contact_information=").append(getClinician_contact_information()).append(" ");
			sb.append("Clinic_name=").append(getClinic_name()).append(" ");
			sb.append("]");
			return sb.toString();
		}
	}
	
}
