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

public class CRTSTAT {
	private static final org.apache.log4j.Logger _logger = org.apache.log4j.Logger.getLogger(CRTSTAT.class);
	public CRTSTAT() {
	}
	
	public static CRTSTAT loadCRTSTATByORMID(int ID) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return loadCRTSTATByORMID(session, ID);
		}
		catch (Exception e) {
			_logger.error("loadCRTSTATByORMID(int ID)", e);
			return null;
		}
	}
	
	public static CRTSTAT getCRTSTATByORMID(int ID) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return getCRTSTATByORMID(session, ID);
		}
		catch (Exception e) {
			_logger.error("getCRTSTATByORMID(int ID)", e);
			return null;
		}
	}
	
	public static CRTSTAT loadCRTSTATByORMID(int ID, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return loadCRTSTATByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			_logger.error("loadCRTSTATByORMID(int ID, org.hibernate.LockMode lockMode)", e);
			return null;
		}
	}
	
	public static CRTSTAT getCRTSTATByORMID(int ID, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return getCRTSTATByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			_logger.error("getCRTSTATByORMID(int ID, org.hibernate.LockMode lockMode)", e);
			return null;
		}
	}
	
	public static CRTSTAT loadCRTSTATByORMID(PersistentSession session, int ID) {
		try {
			return (CRTSTAT) session.load(tr.com.srdc.icardea.hibernate.CRTSTAT.class, new Integer(ID));
		}
		catch (Exception e) {
			_logger.error("loadCRTSTATByORMID(PersistentSession session, int ID)", e);
			return null;
		}
	}
	
	public static CRTSTAT getCRTSTATByORMID(PersistentSession session, int ID) {
		try {
			return (CRTSTAT) session.get(tr.com.srdc.icardea.hibernate.CRTSTAT.class, new Integer(ID));
		}
		catch (Exception e) {
			_logger.error("getCRTSTATByORMID(PersistentSession session, int ID)", e);
			return null;
		}
	}
	
	public static CRTSTAT loadCRTSTATByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) {
		try {
			return (CRTSTAT) session.load(tr.com.srdc.icardea.hibernate.CRTSTAT.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			_logger.error("loadCRTSTATByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode)", e);
			return null;
		}
	}
	
	public static CRTSTAT getCRTSTATByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) {
		try {
			return (CRTSTAT) session.get(tr.com.srdc.icardea.hibernate.CRTSTAT.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			_logger.error("getCRTSTATByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode)", e);
			return null;
		}
	}
	
	public static CRTSTAT[] listCRTSTATByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return listCRTSTATByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("listCRTSTATByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static CRTSTAT[] listCRTSTATByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return listCRTSTATByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("listCRTSTATByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static CRTSTAT[] listCRTSTATByQuery(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From tr.com.srdc.icardea.hibernate.CRTSTAT as CRTSTAT");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			List list = query.list();
			return (CRTSTAT[]) list.toArray(new CRTSTAT[list.size()]);
		}
		catch (Exception e) {
			_logger.error("listCRTSTATByQuery(PersistentSession session, String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static CRTSTAT[] listCRTSTATByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From tr.com.srdc.icardea.hibernate.CRTSTAT as CRTSTAT");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("this", lockMode);
			List list = query.list();
			return (CRTSTAT[]) list.toArray(new CRTSTAT[list.size()]);
		}
		catch (Exception e) {
			_logger.error("listCRTSTATByQuery(PersistentSession session, String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static CRTSTAT loadCRTSTATByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return loadCRTSTATByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("loadCRTSTATByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static CRTSTAT loadCRTSTATByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return loadCRTSTATByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("loadCRTSTATByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static CRTSTAT loadCRTSTATByQuery(PersistentSession session, String condition, String orderBy) {
		CRTSTAT[] cRTSTATs = listCRTSTATByQuery(session, condition, orderBy);
		if (cRTSTATs != null && cRTSTATs.length > 0)
			return cRTSTATs[0];
		else
			return null;
	}
	
	public static CRTSTAT loadCRTSTATByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		CRTSTAT[] cRTSTATs = listCRTSTATByQuery(session, condition, orderBy, lockMode);
		if (cRTSTATs != null && cRTSTATs.length > 0)
			return cRTSTATs[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateCRTSTATByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return iterateCRTSTATByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("iterateCRTSTATByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static java.util.Iterator iterateCRTSTATByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return iterateCRTSTATByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("iterateCRTSTATByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static java.util.Iterator iterateCRTSTATByQuery(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From tr.com.srdc.icardea.hibernate.CRTSTAT as CRTSTAT");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			_logger.error("iterateCRTSTATByQuery(PersistentSession session, String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static java.util.Iterator iterateCRTSTATByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From tr.com.srdc.icardea.hibernate.CRTSTAT as CRTSTAT");
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
			_logger.error("iterateCRTSTATByQuery(PersistentSession session, String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static CRTSTAT loadCRTSTATByCriteria(CRTSTATCriteria cRTSTATCriteria) {
		CRTSTAT[] cRTSTATs = listCRTSTATByCriteria(cRTSTATCriteria);
		if(cRTSTATs == null || cRTSTATs.length == 0) {
			return null;
		}
		return cRTSTATs[0];
	}
	
	public static CRTSTAT[] listCRTSTATByCriteria(CRTSTATCriteria cRTSTATCriteria) {
		return cRTSTATCriteria.listCRTSTAT();
	}
	
	public static CRTSTAT createCRTSTAT() {
		return new tr.com.srdc.icardea.hibernate.CRTSTAT();
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
				getsTAT().setcRTSTAT(null);
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
				getsTAT().setcRTSTAT(null);
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
	
	private String dtm_start;
	
	private String dtm_end;
	
	private String lv_percent_paced;
	
	private String percent_paced;
	
	private tr.com.srdc.icardea.hibernate.STAT sTAT;
	
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
	
	public void setLv_percent_paced(String value) {
		this.lv_percent_paced = value;
	}
	
	public String getLv_percent_paced() {
		return lv_percent_paced;
	}
	
	public void setPercent_paced(String value) {
		this.percent_paced = value;
	}
	
	public String getPercent_paced() {
		return percent_paced;
	}
	
	public void setsTAT(tr.com.srdc.icardea.hibernate.STAT value) {
		if (this.sTAT != value) {
			tr.com.srdc.icardea.hibernate.STAT lsTAT = this.sTAT;
			this.sTAT = value;
			if (value != null) {
				sTAT.setcRTSTAT(this);
			}
			else {
				lsTAT.setcRTSTAT(null);
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
			sb.append("CRTSTAT[ ");
			sb.append("ID=").append(getID()).append(" ");
			sb.append("Dtm_start=").append(getDtm_start()).append(" ");
			sb.append("Dtm_end=").append(getDtm_end()).append(" ");
			sb.append("Lv_percent_paced=").append(getLv_percent_paced()).append(" ");
			sb.append("Percent_paced=").append(getPercent_paced()).append(" ");
			if (getsTAT() != null)
				sb.append("sTAT.Persist_ID=").append(getsTAT().toString(true)).append(" ");
			else
				sb.append("sTAT=null ");
			sb.append("]");
			return sb.toString();
		}
	}
	
}
