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

public class CRTSET {
	private static final org.apache.log4j.Logger _logger = org.apache.log4j.Logger.getLogger(CRTSET.class);
	public CRTSET() {
	}
	
	public static CRTSET loadCRTSETByORMID(int ID) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return loadCRTSETByORMID(session, ID);
		}
		catch (Exception e) {
			_logger.error("loadCRTSETByORMID(int ID)", e);
			return null;
		}
	}
	
	public static CRTSET getCRTSETByORMID(int ID) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return getCRTSETByORMID(session, ID);
		}
		catch (Exception e) {
			_logger.error("getCRTSETByORMID(int ID)", e);
			return null;
		}
	}
	
	public static CRTSET loadCRTSETByORMID(int ID, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return loadCRTSETByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			_logger.error("loadCRTSETByORMID(int ID, org.hibernate.LockMode lockMode)", e);
			return null;
		}
	}
	
	public static CRTSET getCRTSETByORMID(int ID, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return getCRTSETByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			_logger.error("getCRTSETByORMID(int ID, org.hibernate.LockMode lockMode)", e);
			return null;
		}
	}
	
	public static CRTSET loadCRTSETByORMID(PersistentSession session, int ID) {
		try {
			return (CRTSET) session.load(tr.com.srdc.icardea.hibernate.CRTSET.class, new Integer(ID));
		}
		catch (Exception e) {
			_logger.error("loadCRTSETByORMID(PersistentSession session, int ID)", e);
			return null;
		}
	}
	
	public static CRTSET getCRTSETByORMID(PersistentSession session, int ID) {
		try {
			return (CRTSET) session.get(tr.com.srdc.icardea.hibernate.CRTSET.class, new Integer(ID));
		}
		catch (Exception e) {
			_logger.error("getCRTSETByORMID(PersistentSession session, int ID)", e);
			return null;
		}
	}
	
	public static CRTSET loadCRTSETByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) {
		try {
			return (CRTSET) session.load(tr.com.srdc.icardea.hibernate.CRTSET.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			_logger.error("loadCRTSETByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode)", e);
			return null;
		}
	}
	
	public static CRTSET getCRTSETByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) {
		try {
			return (CRTSET) session.get(tr.com.srdc.icardea.hibernate.CRTSET.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			_logger.error("getCRTSETByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode)", e);
			return null;
		}
	}
	
	public static CRTSET[] listCRTSETByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return listCRTSETByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("listCRTSETByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static CRTSET[] listCRTSETByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return listCRTSETByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("listCRTSETByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static CRTSET[] listCRTSETByQuery(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From tr.com.srdc.icardea.hibernate.CRTSET as CRTSET");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			List list = query.list();
			return (CRTSET[]) list.toArray(new CRTSET[list.size()]);
		}
		catch (Exception e) {
			_logger.error("listCRTSETByQuery(PersistentSession session, String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static CRTSET[] listCRTSETByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From tr.com.srdc.icardea.hibernate.CRTSET as CRTSET");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("this", lockMode);
			List list = query.list();
			return (CRTSET[]) list.toArray(new CRTSET[list.size()]);
		}
		catch (Exception e) {
			_logger.error("listCRTSETByQuery(PersistentSession session, String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static CRTSET loadCRTSETByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return loadCRTSETByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("loadCRTSETByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static CRTSET loadCRTSETByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return loadCRTSETByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("loadCRTSETByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static CRTSET loadCRTSETByQuery(PersistentSession session, String condition, String orderBy) {
		CRTSET[] cRTSETs = listCRTSETByQuery(session, condition, orderBy);
		if (cRTSETs != null && cRTSETs.length > 0)
			return cRTSETs[0];
		else
			return null;
	}
	
	public static CRTSET loadCRTSETByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		CRTSET[] cRTSETs = listCRTSETByQuery(session, condition, orderBy, lockMode);
		if (cRTSETs != null && cRTSETs.length > 0)
			return cRTSETs[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateCRTSETByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return iterateCRTSETByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("iterateCRTSETByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static java.util.Iterator iterateCRTSETByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return iterateCRTSETByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("iterateCRTSETByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static java.util.Iterator iterateCRTSETByQuery(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From tr.com.srdc.icardea.hibernate.CRTSET as CRTSET");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			_logger.error("iterateCRTSETByQuery(PersistentSession session, String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static java.util.Iterator iterateCRTSETByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From tr.com.srdc.icardea.hibernate.CRTSET as CRTSET");
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
			_logger.error("iterateCRTSETByQuery(PersistentSession session, String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static CRTSET loadCRTSETByCriteria(CRTSETCriteria cRTSETCriteria) {
		CRTSET[] cRTSETs = listCRTSETByCriteria(cRTSETCriteria);
		if(cRTSETs == null || cRTSETs.length == 0) {
			return null;
		}
		return cRTSETs[0];
	}
	
	public static CRTSET[] listCRTSETByCriteria(CRTSETCriteria cRTSETCriteria) {
		return cRTSETCriteria.listCRTSET();
	}
	
	public static CRTSET createCRTSET() {
		return new tr.com.srdc.icardea.hibernate.CRTSET();
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
			if(getsET() != null) {
				getsET().setcRTSET(null);
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
			if(getsET() != null) {
				getsET().setcRTSET(null);
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
	
	private tr.com.srdc.icardea.hibernate.SET sET;
	
	private String lvrv_delay;
	
	private String paced_chambers;
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setLvrv_delay(String value) {
		this.lvrv_delay = value;
	}
	
	public String getLvrv_delay() {
		return lvrv_delay;
	}
	
	public void setPaced_chambers(String value) {
		this.paced_chambers = value;
	}
	
	public String getPaced_chambers() {
		return paced_chambers;
	}
	
	public void setsET(tr.com.srdc.icardea.hibernate.SET value) {
		if (this.sET != value) {
			tr.com.srdc.icardea.hibernate.SET lsET = this.sET;
			this.sET = value;
			if (value != null) {
				sET.setcRTSET(this);
			}
			else {
				lsET.setcRTSET(null);
			}
		}
	}
	
	public tr.com.srdc.icardea.hibernate.SET getsET() {
		return sET;
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
			sb.append("CRTSET[ ");
			sb.append("ID=").append(getID()).append(" ");
			if (getsET() != null)
				sb.append("sET.Persist_ID=").append(getsET().toString(true)).append(" ");
			else
				sb.append("sET=null ");
			sb.append("Lvrv_delay=").append(getLvrv_delay()).append(" ");
			sb.append("Paced_chambers=").append(getPaced_chambers()).append(" ");
			sb.append("]");
			return sb.toString();
		}
	}
	
}
