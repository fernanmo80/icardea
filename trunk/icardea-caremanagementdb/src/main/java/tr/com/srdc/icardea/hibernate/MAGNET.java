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

public class MAGNET {
	private static final org.apache.log4j.Logger _logger = org.apache.log4j.Logger.getLogger(MAGNET.class);
	public MAGNET() {
	}
	
	public static MAGNET loadMAGNETByORMID(int ID) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return loadMAGNETByORMID(session, ID);
		}
		catch (Exception e) {
			_logger.error("loadMAGNETByORMID(int ID)", e);
			return null;
		}
	}
	
	public static MAGNET getMAGNETByORMID(int ID) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return getMAGNETByORMID(session, ID);
		}
		catch (Exception e) {
			_logger.error("getMAGNETByORMID(int ID)", e);
			return null;
		}
	}
	
	public static MAGNET loadMAGNETByORMID(int ID, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return loadMAGNETByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			_logger.error("loadMAGNETByORMID(int ID, org.hibernate.LockMode lockMode)", e);
			return null;
		}
	}
	
	public static MAGNET getMAGNETByORMID(int ID, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return getMAGNETByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			_logger.error("getMAGNETByORMID(int ID, org.hibernate.LockMode lockMode)", e);
			return null;
		}
	}
	
	public static MAGNET loadMAGNETByORMID(PersistentSession session, int ID) {
		try {
			return (MAGNET) session.load(tr.com.srdc.icardea.hibernate.MAGNET.class, new Integer(ID));
		}
		catch (Exception e) {
			_logger.error("loadMAGNETByORMID(PersistentSession session, int ID)", e);
			return null;
		}
	}
	
	public static MAGNET getMAGNETByORMID(PersistentSession session, int ID) {
		try {
			return (MAGNET) session.get(tr.com.srdc.icardea.hibernate.MAGNET.class, new Integer(ID));
		}
		catch (Exception e) {
			_logger.error("getMAGNETByORMID(PersistentSession session, int ID)", e);
			return null;
		}
	}
	
	public static MAGNET loadMAGNETByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) {
		try {
			return (MAGNET) session.load(tr.com.srdc.icardea.hibernate.MAGNET.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			_logger.error("loadMAGNETByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode)", e);
			return null;
		}
	}
	
	public static MAGNET getMAGNETByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) {
		try {
			return (MAGNET) session.get(tr.com.srdc.icardea.hibernate.MAGNET.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			_logger.error("getMAGNETByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode)", e);
			return null;
		}
	}
	
	public static MAGNET[] listMAGNETByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return listMAGNETByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("listMAGNETByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static MAGNET[] listMAGNETByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return listMAGNETByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("listMAGNETByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static MAGNET[] listMAGNETByQuery(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From tr.com.srdc.icardea.hibernate.MAGNET as MAGNET");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			List list = query.list();
			return (MAGNET[]) list.toArray(new MAGNET[list.size()]);
		}
		catch (Exception e) {
			_logger.error("listMAGNETByQuery(PersistentSession session, String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static MAGNET[] listMAGNETByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From tr.com.srdc.icardea.hibernate.MAGNET as MAGNET");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("this", lockMode);
			List list = query.list();
			return (MAGNET[]) list.toArray(new MAGNET[list.size()]);
		}
		catch (Exception e) {
			_logger.error("listMAGNETByQuery(PersistentSession session, String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static MAGNET loadMAGNETByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return loadMAGNETByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("loadMAGNETByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static MAGNET loadMAGNETByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return loadMAGNETByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("loadMAGNETByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static MAGNET loadMAGNETByQuery(PersistentSession session, String condition, String orderBy) {
		MAGNET[] mAGNETs = listMAGNETByQuery(session, condition, orderBy);
		if (mAGNETs != null && mAGNETs.length > 0)
			return mAGNETs[0];
		else
			return null;
	}
	
	public static MAGNET loadMAGNETByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		MAGNET[] mAGNETs = listMAGNETByQuery(session, condition, orderBy, lockMode);
		if (mAGNETs != null && mAGNETs.length > 0)
			return mAGNETs[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateMAGNETByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return iterateMAGNETByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("iterateMAGNETByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static java.util.Iterator iterateMAGNETByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return iterateMAGNETByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("iterateMAGNETByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static java.util.Iterator iterateMAGNETByQuery(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From tr.com.srdc.icardea.hibernate.MAGNET as MAGNET");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			_logger.error("iterateMAGNETByQuery(PersistentSession session, String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static java.util.Iterator iterateMAGNETByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From tr.com.srdc.icardea.hibernate.MAGNET as MAGNET");
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
			_logger.error("iterateMAGNETByQuery(PersistentSession session, String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static MAGNET loadMAGNETByCriteria(MAGNETCriteria mAGNETCriteria) {
		MAGNET[] mAGNETs = listMAGNETByCriteria(mAGNETCriteria);
		if(mAGNETs == null || mAGNETs.length == 0) {
			return null;
		}
		return mAGNETs[0];
	}
	
	public static MAGNET[] listMAGNETByCriteria(MAGNETCriteria mAGNETCriteria) {
		return mAGNETCriteria.listMAGNET();
	}
	
	public static MAGNET createMAGNET() {
		return new tr.com.srdc.icardea.hibernate.MAGNET();
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
				getsET().setmAGNET(null);
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
				getsET().setmAGNET(null);
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
	
	private String resp;
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setResp(String value) {
		this.resp = value;
	}
	
	public String getResp() {
		return resp;
	}
	
	public void setsET(tr.com.srdc.icardea.hibernate.SET value) {
		if (this.sET != value) {
			tr.com.srdc.icardea.hibernate.SET lsET = this.sET;
			this.sET = value;
			if (value != null) {
				sET.setmAGNET(this);
			}
			else {
				lsET.setmAGNET(null);
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
			sb.append("MAGNET[ ");
			sb.append("ID=").append(getID()).append(" ");
			if (getsET() != null)
				sb.append("sET.Persist_ID=").append(getsET().toString(true)).append(" ");
			else
				sb.append("sET=null ");
			sb.append("Resp=").append(getResp()).append(" ");
			sb.append("]");
			return sb.toString();
		}
	}
	
}
