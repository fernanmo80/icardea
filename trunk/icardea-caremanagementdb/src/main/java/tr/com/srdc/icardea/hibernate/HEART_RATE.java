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

public class HEART_RATE {
	private static final org.apache.log4j.Logger _logger = org.apache.log4j.Logger.getLogger(HEART_RATE.class);
	public HEART_RATE() {
	}
	
	public static HEART_RATE loadHEART_RATEByORMID(int ID) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return loadHEART_RATEByORMID(session, ID);
		}
		catch (Exception e) {
			_logger.error("loadHEART_RATEByORMID(int ID)", e);
			return null;
		}
	}
	
	public static HEART_RATE getHEART_RATEByORMID(int ID) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return getHEART_RATEByORMID(session, ID);
		}
		catch (Exception e) {
			_logger.error("getHEART_RATEByORMID(int ID)", e);
			return null;
		}
	}
	
	public static HEART_RATE loadHEART_RATEByORMID(int ID, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return loadHEART_RATEByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			_logger.error("loadHEART_RATEByORMID(int ID, org.hibernate.LockMode lockMode)", e);
			return null;
		}
	}
	
	public static HEART_RATE getHEART_RATEByORMID(int ID, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return getHEART_RATEByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			_logger.error("getHEART_RATEByORMID(int ID, org.hibernate.LockMode lockMode)", e);
			return null;
		}
	}
	
	public static HEART_RATE loadHEART_RATEByORMID(PersistentSession session, int ID) {
		try {
			return (HEART_RATE) session.load(tr.com.srdc.icardea.hibernate.HEART_RATE.class, new Integer(ID));
		}
		catch (Exception e) {
			_logger.error("loadHEART_RATEByORMID(PersistentSession session, int ID)", e);
			return null;
		}
	}
	
	public static HEART_RATE getHEART_RATEByORMID(PersistentSession session, int ID) {
		try {
			return (HEART_RATE) session.get(tr.com.srdc.icardea.hibernate.HEART_RATE.class, new Integer(ID));
		}
		catch (Exception e) {
			_logger.error("getHEART_RATEByORMID(PersistentSession session, int ID)", e);
			return null;
		}
	}
	
	public static HEART_RATE loadHEART_RATEByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) {
		try {
			return (HEART_RATE) session.load(tr.com.srdc.icardea.hibernate.HEART_RATE.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			_logger.error("loadHEART_RATEByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode)", e);
			return null;
		}
	}
	
	public static HEART_RATE getHEART_RATEByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) {
		try {
			return (HEART_RATE) session.get(tr.com.srdc.icardea.hibernate.HEART_RATE.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			_logger.error("getHEART_RATEByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode)", e);
			return null;
		}
	}
	
	public static HEART_RATE[] listHEART_RATEByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return listHEART_RATEByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("listHEART_RATEByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static HEART_RATE[] listHEART_RATEByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return listHEART_RATEByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("listHEART_RATEByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static HEART_RATE[] listHEART_RATEByQuery(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From tr.com.srdc.icardea.hibernate.HEART_RATE as HEART_RATE");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			List list = query.list();
			return (HEART_RATE[]) list.toArray(new HEART_RATE[list.size()]);
		}
		catch (Exception e) {
			_logger.error("listHEART_RATEByQuery(PersistentSession session, String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static HEART_RATE[] listHEART_RATEByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From tr.com.srdc.icardea.hibernate.HEART_RATE as HEART_RATE");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("this", lockMode);
			List list = query.list();
			return (HEART_RATE[]) list.toArray(new HEART_RATE[list.size()]);
		}
		catch (Exception e) {
			_logger.error("listHEART_RATEByQuery(PersistentSession session, String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static HEART_RATE loadHEART_RATEByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return loadHEART_RATEByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("loadHEART_RATEByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static HEART_RATE loadHEART_RATEByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return loadHEART_RATEByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("loadHEART_RATEByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static HEART_RATE loadHEART_RATEByQuery(PersistentSession session, String condition, String orderBy) {
		HEART_RATE[] hEART_RATEs = listHEART_RATEByQuery(session, condition, orderBy);
		if (hEART_RATEs != null && hEART_RATEs.length > 0)
			return hEART_RATEs[0];
		else
			return null;
	}
	
	public static HEART_RATE loadHEART_RATEByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		HEART_RATE[] hEART_RATEs = listHEART_RATEByQuery(session, condition, orderBy, lockMode);
		if (hEART_RATEs != null && hEART_RATEs.length > 0)
			return hEART_RATEs[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateHEART_RATEByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return iterateHEART_RATEByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("iterateHEART_RATEByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static java.util.Iterator iterateHEART_RATEByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return iterateHEART_RATEByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("iterateHEART_RATEByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static java.util.Iterator iterateHEART_RATEByQuery(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From tr.com.srdc.icardea.hibernate.HEART_RATE as HEART_RATE");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			_logger.error("iterateHEART_RATEByQuery(PersistentSession session, String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static java.util.Iterator iterateHEART_RATEByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From tr.com.srdc.icardea.hibernate.HEART_RATE as HEART_RATE");
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
			_logger.error("iterateHEART_RATEByQuery(PersistentSession session, String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static HEART_RATE loadHEART_RATEByCriteria(HEART_RATECriteria hEART_RATECriteria) {
		HEART_RATE[] hEART_RATEs = listHEART_RATEByCriteria(hEART_RATECriteria);
		if(hEART_RATEs == null || hEART_RATEs.length == 0) {
			return null;
		}
		return hEART_RATEs[0];
	}
	
	public static HEART_RATE[] listHEART_RATEByCriteria(HEART_RATECriteria hEART_RATECriteria) {
		return hEART_RATECriteria.listHEART_RATE();
	}
	
	public static HEART_RATE createHEART_RATE() {
		return new tr.com.srdc.icardea.hibernate.HEART_RATE();
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
			if(getsTAT() != null) {
				getsTAT().sethEART_RATE(null);
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
			if(getsTAT() != null) {
				getsTAT().sethEART_RATE(null);
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
	
	private tr.com.srdc.icardea.hibernate.STAT sTAT;
	
	private String dtm_start;
	
	private String dtm_end;
	
	private String atrial_min;
	
	private String atrial_max;
	
	private String atrial_mean;
	
	private String ventricular_min;
	
	private String ventricular_max;
	
	private String ventricular_mean;
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setDtm_start(String value) {
		this.dtm_start = value;
	}
	
	public String getDtm_start() {
		return dtm_start;
	}
	
	public void setDtm_end(String value) {
		this.dtm_end = value;
	}
	
	public String getDtm_end() {
		return dtm_end;
	}
	
	public void setAtrial_min(String value) {
		this.atrial_min = value;
	}
	
	public String getAtrial_min() {
		return atrial_min;
	}
	
	public void setAtrial_max(String value) {
		this.atrial_max = value;
	}
	
	public String getAtrial_max() {
		return atrial_max;
	}
	
	public void setAtrial_mean(String value) {
		this.atrial_mean = value;
	}
	
	public String getAtrial_mean() {
		return atrial_mean;
	}
	
	public void setVentricular_min(String value) {
		this.ventricular_min = value;
	}
	
	public String getVentricular_min() {
		return ventricular_min;
	}
	
	public void setVentricular_max(String value) {
		this.ventricular_max = value;
	}
	
	public String getVentricular_max() {
		return ventricular_max;
	}
	
	public void setVentricular_mean(String value) {
		this.ventricular_mean = value;
	}
	
	public String getVentricular_mean() {
		return ventricular_mean;
	}
	
	public void setsTAT(tr.com.srdc.icardea.hibernate.STAT value) {
		if (this.sTAT != value) {
			tr.com.srdc.icardea.hibernate.STAT lsTAT = this.sTAT;
			this.sTAT = value;
			if (value != null) {
				sTAT.sethEART_RATE(this);
			}
			else {
				lsTAT.sethEART_RATE(null);
			}
		}
	}
	
	public tr.com.srdc.icardea.hibernate.STAT getsTAT() {
		return sTAT;
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
			sb.append("HEART_RATE[ ");
			sb.append("ID=").append(getID()).append(" ");
			if (getsTAT() != null)
				sb.append("sTAT.Persist_ID=").append(getsTAT().toString(true)).append(" ");
			else
				sb.append("sTAT=null ");
			sb.append("Dtm_start=").append(getDtm_start()).append(" ");
			sb.append("Dtm_end=").append(getDtm_end()).append(" ");
			sb.append("Atrial_min=").append(getAtrial_min()).append(" ");
			sb.append("Atrial_max=").append(getAtrial_max()).append(" ");
			sb.append("Atrial_mean=").append(getAtrial_mean()).append(" ");
			sb.append("Ventricular_min=").append(getVentricular_min()).append(" ");
			sb.append("Ventricular_max=").append(getVentricular_max()).append(" ");
			sb.append("Ventricular_mean=").append(getVentricular_mean()).append(" ");
			sb.append("]");
			return sb.toString();
		}
	}
	
}
