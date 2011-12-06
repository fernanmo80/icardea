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

public class TACHYTHERAPYSET {
	private static final org.apache.log4j.Logger _logger = org.apache.log4j.Logger.getLogger(TACHYTHERAPYSET.class);
	public TACHYTHERAPYSET() {
	}
	
	public static TACHYTHERAPYSET loadTACHYTHERAPYSETByORMID(int ID) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return loadTACHYTHERAPYSETByORMID(session, ID);
		}
		catch (Exception e) {
			_logger.error("loadTACHYTHERAPYSETByORMID(int ID)", e);
			return null;
		}
	}
	
	public static TACHYTHERAPYSET getTACHYTHERAPYSETByORMID(int ID) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return getTACHYTHERAPYSETByORMID(session, ID);
		}
		catch (Exception e) {
			_logger.error("getTACHYTHERAPYSETByORMID(int ID)", e);
			return null;
		}
	}
	
	public static TACHYTHERAPYSET loadTACHYTHERAPYSETByORMID(int ID, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return loadTACHYTHERAPYSETByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			_logger.error("loadTACHYTHERAPYSETByORMID(int ID, org.hibernate.LockMode lockMode)", e);
			return null;
		}
	}
	
	public static TACHYTHERAPYSET getTACHYTHERAPYSETByORMID(int ID, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return getTACHYTHERAPYSETByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			_logger.error("getTACHYTHERAPYSETByORMID(int ID, org.hibernate.LockMode lockMode)", e);
			return null;
		}
	}
	
	public static TACHYTHERAPYSET loadTACHYTHERAPYSETByORMID(PersistentSession session, int ID) {
		try {
			return (TACHYTHERAPYSET) session.load(tr.com.srdc.icardea.hibernate.TACHYTHERAPYSET.class, new Integer(ID));
		}
		catch (Exception e) {
			_logger.error("loadTACHYTHERAPYSETByORMID(PersistentSession session, int ID)", e);
			return null;
		}
	}
	
	public static TACHYTHERAPYSET getTACHYTHERAPYSETByORMID(PersistentSession session, int ID) {
		try {
			return (TACHYTHERAPYSET) session.get(tr.com.srdc.icardea.hibernate.TACHYTHERAPYSET.class, new Integer(ID));
		}
		catch (Exception e) {
			_logger.error("getTACHYTHERAPYSETByORMID(PersistentSession session, int ID)", e);
			return null;
		}
	}
	
	public static TACHYTHERAPYSET loadTACHYTHERAPYSETByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) {
		try {
			return (TACHYTHERAPYSET) session.load(tr.com.srdc.icardea.hibernate.TACHYTHERAPYSET.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			_logger.error("loadTACHYTHERAPYSETByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode)", e);
			return null;
		}
	}
	
	public static TACHYTHERAPYSET getTACHYTHERAPYSETByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) {
		try {
			return (TACHYTHERAPYSET) session.get(tr.com.srdc.icardea.hibernate.TACHYTHERAPYSET.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			_logger.error("getTACHYTHERAPYSETByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode)", e);
			return null;
		}
	}
	
	public static TACHYTHERAPYSET[] listTACHYTHERAPYSETByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return listTACHYTHERAPYSETByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("listTACHYTHERAPYSETByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static TACHYTHERAPYSET[] listTACHYTHERAPYSETByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return listTACHYTHERAPYSETByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("listTACHYTHERAPYSETByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static TACHYTHERAPYSET[] listTACHYTHERAPYSETByQuery(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From tr.com.srdc.icardea.hibernate.TACHYTHERAPYSET as TACHYTHERAPYSET");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			List list = query.list();
			return (TACHYTHERAPYSET[]) list.toArray(new TACHYTHERAPYSET[list.size()]);
		}
		catch (Exception e) {
			_logger.error("listTACHYTHERAPYSETByQuery(PersistentSession session, String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static TACHYTHERAPYSET[] listTACHYTHERAPYSETByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From tr.com.srdc.icardea.hibernate.TACHYTHERAPYSET as TACHYTHERAPYSET");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("this", lockMode);
			List list = query.list();
			return (TACHYTHERAPYSET[]) list.toArray(new TACHYTHERAPYSET[list.size()]);
		}
		catch (Exception e) {
			_logger.error("listTACHYTHERAPYSETByQuery(PersistentSession session, String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static TACHYTHERAPYSET loadTACHYTHERAPYSETByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return loadTACHYTHERAPYSETByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("loadTACHYTHERAPYSETByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static TACHYTHERAPYSET loadTACHYTHERAPYSETByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return loadTACHYTHERAPYSETByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("loadTACHYTHERAPYSETByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static TACHYTHERAPYSET loadTACHYTHERAPYSETByQuery(PersistentSession session, String condition, String orderBy) {
		TACHYTHERAPYSET[] tACHYTHERAPYSETs = listTACHYTHERAPYSETByQuery(session, condition, orderBy);
		if (tACHYTHERAPYSETs != null && tACHYTHERAPYSETs.length > 0)
			return tACHYTHERAPYSETs[0];
		else
			return null;
	}
	
	public static TACHYTHERAPYSET loadTACHYTHERAPYSETByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		TACHYTHERAPYSET[] tACHYTHERAPYSETs = listTACHYTHERAPYSETByQuery(session, condition, orderBy, lockMode);
		if (tACHYTHERAPYSETs != null && tACHYTHERAPYSETs.length > 0)
			return tACHYTHERAPYSETs[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateTACHYTHERAPYSETByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return iterateTACHYTHERAPYSETByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("iterateTACHYTHERAPYSETByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static java.util.Iterator iterateTACHYTHERAPYSETByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return iterateTACHYTHERAPYSETByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("iterateTACHYTHERAPYSETByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static java.util.Iterator iterateTACHYTHERAPYSETByQuery(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From tr.com.srdc.icardea.hibernate.TACHYTHERAPYSET as TACHYTHERAPYSET");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			_logger.error("iterateTACHYTHERAPYSETByQuery(PersistentSession session, String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static java.util.Iterator iterateTACHYTHERAPYSETByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From tr.com.srdc.icardea.hibernate.TACHYTHERAPYSET as TACHYTHERAPYSET");
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
			_logger.error("iterateTACHYTHERAPYSETByQuery(PersistentSession session, String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static TACHYTHERAPYSET loadTACHYTHERAPYSETByCriteria(TACHYTHERAPYSETCriteria tACHYTHERAPYSETCriteria) {
		TACHYTHERAPYSET[] tACHYTHERAPYSETs = listTACHYTHERAPYSETByCriteria(tACHYTHERAPYSETCriteria);
		if(tACHYTHERAPYSETs == null || tACHYTHERAPYSETs.length == 0) {
			return null;
		}
		return tACHYTHERAPYSETs[0];
	}
	
	public static TACHYTHERAPYSET[] listTACHYTHERAPYSETByCriteria(TACHYTHERAPYSETCriteria tACHYTHERAPYSETCriteria) {
		return tACHYTHERAPYSETCriteria.listTACHYTHERAPYSET();
	}
	
	public static TACHYTHERAPYSET createTACHYTHERAPYSET() {
		return new tr.com.srdc.icardea.hibernate.TACHYTHERAPYSET();
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
				getsET().settACHYTHERAPYSET(null);
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
				getsET().settACHYTHERAPYSET(null);
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
	
	private String vstat;
	
	private String astat;
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setVstat(String value) {
		this.vstat = value;
	}
	
	public String getVstat() {
		return vstat;
	}
	
	public void setAstat(String value) {
		this.astat = value;
	}
	
	public String getAstat() {
		return astat;
	}
	
	public void setsET(tr.com.srdc.icardea.hibernate.SET value) {
		if (this.sET != value) {
			tr.com.srdc.icardea.hibernate.SET lsET = this.sET;
			this.sET = value;
			if (value != null) {
				sET.settACHYTHERAPYSET(this);
			}
			else {
				lsET.settACHYTHERAPYSET(null);
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
			sb.append("TACHYTHERAPYSET[ ");
			sb.append("ID=").append(getID()).append(" ");
			if (getsET() != null)
				sb.append("sET.Persist_ID=").append(getsET().toString(true)).append(" ");
			else
				sb.append("sET=null ");
			sb.append("Vstat=").append(getVstat()).append(" ");
			sb.append("Astat=").append(getAstat()).append(" ");
			sb.append("]");
			return sb.toString();
		}
	}
	
}
