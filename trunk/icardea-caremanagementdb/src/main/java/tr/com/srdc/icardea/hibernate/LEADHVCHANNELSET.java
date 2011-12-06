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

public class LEADHVCHANNELSET {
	private static final org.apache.log4j.Logger _logger = org.apache.log4j.Logger.getLogger(LEADHVCHANNELSET.class);
	public LEADHVCHANNELSET() {
	}
	
	public static LEADHVCHANNELSET loadLEADHVCHANNELSETByORMID(int ID) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return loadLEADHVCHANNELSETByORMID(session, ID);
		}
		catch (Exception e) {
			_logger.error("loadLEADHVCHANNELSETByORMID(int ID)", e);
			return null;
		}
	}
	
	public static LEADHVCHANNELSET getLEADHVCHANNELSETByORMID(int ID) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return getLEADHVCHANNELSETByORMID(session, ID);
		}
		catch (Exception e) {
			_logger.error("getLEADHVCHANNELSETByORMID(int ID)", e);
			return null;
		}
	}
	
	public static LEADHVCHANNELSET loadLEADHVCHANNELSETByORMID(int ID, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return loadLEADHVCHANNELSETByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			_logger.error("loadLEADHVCHANNELSETByORMID(int ID, org.hibernate.LockMode lockMode)", e);
			return null;
		}
	}
	
	public static LEADHVCHANNELSET getLEADHVCHANNELSETByORMID(int ID, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return getLEADHVCHANNELSETByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			_logger.error("getLEADHVCHANNELSETByORMID(int ID, org.hibernate.LockMode lockMode)", e);
			return null;
		}
	}
	
	public static LEADHVCHANNELSET loadLEADHVCHANNELSETByORMID(PersistentSession session, int ID) {
		try {
			return (LEADHVCHANNELSET) session.load(tr.com.srdc.icardea.hibernate.LEADHVCHANNELSET.class, new Integer(ID));
		}
		catch (Exception e) {
			_logger.error("loadLEADHVCHANNELSETByORMID(PersistentSession session, int ID)", e);
			return null;
		}
	}
	
	public static LEADHVCHANNELSET getLEADHVCHANNELSETByORMID(PersistentSession session, int ID) {
		try {
			return (LEADHVCHANNELSET) session.get(tr.com.srdc.icardea.hibernate.LEADHVCHANNELSET.class, new Integer(ID));
		}
		catch (Exception e) {
			_logger.error("getLEADHVCHANNELSETByORMID(PersistentSession session, int ID)", e);
			return null;
		}
	}
	
	public static LEADHVCHANNELSET loadLEADHVCHANNELSETByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) {
		try {
			return (LEADHVCHANNELSET) session.load(tr.com.srdc.icardea.hibernate.LEADHVCHANNELSET.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			_logger.error("loadLEADHVCHANNELSETByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode)", e);
			return null;
		}
	}
	
	public static LEADHVCHANNELSET getLEADHVCHANNELSETByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) {
		try {
			return (LEADHVCHANNELSET) session.get(tr.com.srdc.icardea.hibernate.LEADHVCHANNELSET.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			_logger.error("getLEADHVCHANNELSETByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode)", e);
			return null;
		}
	}
	
	public static LEADHVCHANNELSET[] listLEADHVCHANNELSETByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return listLEADHVCHANNELSETByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("listLEADHVCHANNELSETByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static LEADHVCHANNELSET[] listLEADHVCHANNELSETByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return listLEADHVCHANNELSETByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("listLEADHVCHANNELSETByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static LEADHVCHANNELSET[] listLEADHVCHANNELSETByQuery(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From tr.com.srdc.icardea.hibernate.LEADHVCHANNELSET as LEADHVCHANNELSET");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			List list = query.list();
			return (LEADHVCHANNELSET[]) list.toArray(new LEADHVCHANNELSET[list.size()]);
		}
		catch (Exception e) {
			_logger.error("listLEADHVCHANNELSETByQuery(PersistentSession session, String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static LEADHVCHANNELSET[] listLEADHVCHANNELSETByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From tr.com.srdc.icardea.hibernate.LEADHVCHANNELSET as LEADHVCHANNELSET");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("this", lockMode);
			List list = query.list();
			return (LEADHVCHANNELSET[]) list.toArray(new LEADHVCHANNELSET[list.size()]);
		}
		catch (Exception e) {
			_logger.error("listLEADHVCHANNELSETByQuery(PersistentSession session, String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static LEADHVCHANNELSET loadLEADHVCHANNELSETByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return loadLEADHVCHANNELSETByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("loadLEADHVCHANNELSETByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static LEADHVCHANNELSET loadLEADHVCHANNELSETByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return loadLEADHVCHANNELSETByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("loadLEADHVCHANNELSETByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static LEADHVCHANNELSET loadLEADHVCHANNELSETByQuery(PersistentSession session, String condition, String orderBy) {
		LEADHVCHANNELSET[] lEADHVCHANNELSETs = listLEADHVCHANNELSETByQuery(session, condition, orderBy);
		if (lEADHVCHANNELSETs != null && lEADHVCHANNELSETs.length > 0)
			return lEADHVCHANNELSETs[0];
		else
			return null;
	}
	
	public static LEADHVCHANNELSET loadLEADHVCHANNELSETByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		LEADHVCHANNELSET[] lEADHVCHANNELSETs = listLEADHVCHANNELSETByQuery(session, condition, orderBy, lockMode);
		if (lEADHVCHANNELSETs != null && lEADHVCHANNELSETs.length > 0)
			return lEADHVCHANNELSETs[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateLEADHVCHANNELSETByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return iterateLEADHVCHANNELSETByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("iterateLEADHVCHANNELSETByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static java.util.Iterator iterateLEADHVCHANNELSETByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return iterateLEADHVCHANNELSETByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("iterateLEADHVCHANNELSETByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static java.util.Iterator iterateLEADHVCHANNELSETByQuery(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From tr.com.srdc.icardea.hibernate.LEADHVCHANNELSET as LEADHVCHANNELSET");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			_logger.error("iterateLEADHVCHANNELSETByQuery(PersistentSession session, String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static java.util.Iterator iterateLEADHVCHANNELSETByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From tr.com.srdc.icardea.hibernate.LEADHVCHANNELSET as LEADHVCHANNELSET");
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
			_logger.error("iterateLEADHVCHANNELSETByQuery(PersistentSession session, String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static LEADHVCHANNELSET loadLEADHVCHANNELSETByCriteria(LEADHVCHANNELSETCriteria lEADHVCHANNELSETCriteria) {
		LEADHVCHANNELSET[] lEADHVCHANNELSETs = listLEADHVCHANNELSETByCriteria(lEADHVCHANNELSETCriteria);
		if(lEADHVCHANNELSETs == null || lEADHVCHANNELSETs.length == 0) {
			return null;
		}
		return lEADHVCHANNELSETs[0];
	}
	
	public static LEADHVCHANNELSET[] listLEADHVCHANNELSETByCriteria(LEADHVCHANNELSETCriteria lEADHVCHANNELSETCriteria) {
		return lEADHVCHANNELSETCriteria.listLEADHVCHANNELSET();
	}
	
	public static LEADHVCHANNELSET createLEADHVCHANNELSET() {
		return new tr.com.srdc.icardea.hibernate.LEADHVCHANNELSET();
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
				getsET().setlEADHVCHANNELSET(null);
			}
			
			if(getsHOCKVECTOR() != null) {
				getsHOCKVECTOR().setlEADHVCHANNELSET(null);
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
				getsET().setlEADHVCHANNELSET(null);
			}
			
			if(getsHOCKVECTOR() != null) {
				getsHOCKVECTOR().setlEADHVCHANNELSET(null);
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
	
	private Integer subID;
	
	private tr.com.srdc.icardea.hibernate.SET sET;
	
	private tr.com.srdc.icardea.hibernate.SHOCKVECTOR sHOCKVECTOR;
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setSubID(int value) {
		setSubID(new Integer(value));
	}
	
	public void setSubID(Integer value) {
		this.subID = value;
	}
	
	public Integer getSubID() {
		return subID;
	}
	
	public void setsET(tr.com.srdc.icardea.hibernate.SET value) {
		if (this.sET != value) {
			tr.com.srdc.icardea.hibernate.SET lsET = this.sET;
			this.sET = value;
			if (value != null) {
				sET.setlEADHVCHANNELSET(this);
			}
			else {
				lsET.setlEADHVCHANNELSET(null);
			}
		}
	}
	
	public tr.com.srdc.icardea.hibernate.SET getsET() {
		return sET;
	}
	
	public void setsHOCKVECTOR(tr.com.srdc.icardea.hibernate.SHOCKVECTOR value) {
		if (this.sHOCKVECTOR != value) {
			tr.com.srdc.icardea.hibernate.SHOCKVECTOR lsHOCKVECTOR = this.sHOCKVECTOR;
			this.sHOCKVECTOR = value;
			if (value != null) {
				sHOCKVECTOR.setlEADHVCHANNELSET(this);
			}
			else {
				lsHOCKVECTOR.setlEADHVCHANNELSET(null);
			}
		}
	}
	
	public tr.com.srdc.icardea.hibernate.SHOCKVECTOR getsHOCKVECTOR() {
		return sHOCKVECTOR;
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
			sb.append("LEADHVCHANNELSET[ ");
			sb.append("ID=").append(getID()).append(" ");
			sb.append("SubID=").append(getSubID()).append(" ");
			if (getsET() != null)
				sb.append("sET.Persist_ID=").append(getsET().toString(true)).append(" ");
			else
				sb.append("sET=null ");
			if (getsHOCKVECTOR() != null)
				sb.append("sHOCKVECTOR.Persist_ID=").append(getsHOCKVECTOR().toString(true)).append(" ");
			else
				sb.append("sHOCKVECTOR=null ");
			sb.append("]");
			return sb.toString();
		}
	}
	
}
