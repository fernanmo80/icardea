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

public class LEADCHNLSET {
	private static final org.apache.log4j.Logger _logger = org.apache.log4j.Logger.getLogger(LEADCHNLSET.class);
	public LEADCHNLSET() {
	}
	
	public static LEADCHNLSET loadLEADCHNLSETByORMID(int ID) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return loadLEADCHNLSETByORMID(session, ID);
		}
		catch (Exception e) {
			_logger.error("loadLEADCHNLSETByORMID(int ID)", e);
			return null;
		}
	}
	
	public static LEADCHNLSET getLEADCHNLSETByORMID(int ID) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return getLEADCHNLSETByORMID(session, ID);
		}
		catch (Exception e) {
			_logger.error("getLEADCHNLSETByORMID(int ID)", e);
			return null;
		}
	}
	
	public static LEADCHNLSET loadLEADCHNLSETByORMID(int ID, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return loadLEADCHNLSETByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			_logger.error("loadLEADCHNLSETByORMID(int ID, org.hibernate.LockMode lockMode)", e);
			return null;
		}
	}
	
	public static LEADCHNLSET getLEADCHNLSETByORMID(int ID, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return getLEADCHNLSETByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			_logger.error("getLEADCHNLSETByORMID(int ID, org.hibernate.LockMode lockMode)", e);
			return null;
		}
	}
	
	public static LEADCHNLSET loadLEADCHNLSETByORMID(PersistentSession session, int ID) {
		try {
			return (LEADCHNLSET) session.load(tr.com.srdc.icardea.hibernate.LEADCHNLSET.class, new Integer(ID));
		}
		catch (Exception e) {
			_logger.error("loadLEADCHNLSETByORMID(PersistentSession session, int ID)", e);
			return null;
		}
	}
	
	public static LEADCHNLSET getLEADCHNLSETByORMID(PersistentSession session, int ID) {
		try {
			return (LEADCHNLSET) session.get(tr.com.srdc.icardea.hibernate.LEADCHNLSET.class, new Integer(ID));
		}
		catch (Exception e) {
			_logger.error("getLEADCHNLSETByORMID(PersistentSession session, int ID)", e);
			return null;
		}
	}
	
	public static LEADCHNLSET loadLEADCHNLSETByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) {
		try {
			return (LEADCHNLSET) session.load(tr.com.srdc.icardea.hibernate.LEADCHNLSET.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			_logger.error("loadLEADCHNLSETByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode)", e);
			return null;
		}
	}
	
	public static LEADCHNLSET getLEADCHNLSETByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) {
		try {
			return (LEADCHNLSET) session.get(tr.com.srdc.icardea.hibernate.LEADCHNLSET.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			_logger.error("getLEADCHNLSETByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode)", e);
			return null;
		}
	}
	
	public static LEADCHNLSET[] listLEADCHNLSETByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return listLEADCHNLSETByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("listLEADCHNLSETByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static LEADCHNLSET[] listLEADCHNLSETByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return listLEADCHNLSETByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("listLEADCHNLSETByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static LEADCHNLSET[] listLEADCHNLSETByQuery(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From tr.com.srdc.icardea.hibernate.LEADCHNLSET as LEADCHNLSET");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			List list = query.list();
			return (LEADCHNLSET[]) list.toArray(new LEADCHNLSET[list.size()]);
		}
		catch (Exception e) {
			_logger.error("listLEADCHNLSETByQuery(PersistentSession session, String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static LEADCHNLSET[] listLEADCHNLSETByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From tr.com.srdc.icardea.hibernate.LEADCHNLSET as LEADCHNLSET");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("this", lockMode);
			List list = query.list();
			return (LEADCHNLSET[]) list.toArray(new LEADCHNLSET[list.size()]);
		}
		catch (Exception e) {
			_logger.error("listLEADCHNLSETByQuery(PersistentSession session, String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static LEADCHNLSET loadLEADCHNLSETByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return loadLEADCHNLSETByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("loadLEADCHNLSETByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static LEADCHNLSET loadLEADCHNLSETByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return loadLEADCHNLSETByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("loadLEADCHNLSETByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static LEADCHNLSET loadLEADCHNLSETByQuery(PersistentSession session, String condition, String orderBy) {
		LEADCHNLSET[] lEADCHNLSETs = listLEADCHNLSETByQuery(session, condition, orderBy);
		if (lEADCHNLSETs != null && lEADCHNLSETs.length > 0)
			return lEADCHNLSETs[0];
		else
			return null;
	}
	
	public static LEADCHNLSET loadLEADCHNLSETByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		LEADCHNLSET[] lEADCHNLSETs = listLEADCHNLSETByQuery(session, condition, orderBy, lockMode);
		if (lEADCHNLSETs != null && lEADCHNLSETs.length > 0)
			return lEADCHNLSETs[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateLEADCHNLSETByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return iterateLEADCHNLSETByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("iterateLEADCHNLSETByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static java.util.Iterator iterateLEADCHNLSETByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return iterateLEADCHNLSETByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("iterateLEADCHNLSETByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static java.util.Iterator iterateLEADCHNLSETByQuery(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From tr.com.srdc.icardea.hibernate.LEADCHNLSET as LEADCHNLSET");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			_logger.error("iterateLEADCHNLSETByQuery(PersistentSession session, String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static java.util.Iterator iterateLEADCHNLSETByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From tr.com.srdc.icardea.hibernate.LEADCHNLSET as LEADCHNLSET");
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
			_logger.error("iterateLEADCHNLSETByQuery(PersistentSession session, String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static LEADCHNLSET loadLEADCHNLSETByCriteria(LEADCHNLSETCriteria lEADCHNLSETCriteria) {
		LEADCHNLSET[] lEADCHNLSETs = listLEADCHNLSETByCriteria(lEADCHNLSETCriteria);
		if(lEADCHNLSETs == null || lEADCHNLSETs.length == 0) {
			return null;
		}
		return lEADCHNLSETs[0];
	}
	
	public static LEADCHNLSET[] listLEADCHNLSETByCriteria(LEADCHNLSETCriteria lEADCHNLSETCriteria) {
		return lEADCHNLSETCriteria.listLEADCHNLSET();
	}
	
	public static LEADCHNLSET createLEADCHNLSET() {
		return new tr.com.srdc.icardea.hibernate.LEADCHNLSET();
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
				getsET().lEADCHNLSET.remove(this);
			}
			
			if(getsENSINGSET() != null) {
				getsENSINGSET().setlEADCHNLSET(null);
			}
			
			if(getpACING() != null) {
				getpACING().setlEADCHNLSET(null);
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
				getsET().lEADCHNLSET.remove(this);
			}
			
			if(getsENSINGSET() != null) {
				getsENSINGSET().setlEADCHNLSET(null);
			}
			
			if(getpACING() != null) {
				getpACING().setlEADCHNLSET(null);
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
		if (key == tr.com.srdc.icardea.hibernate.ORMConstants.KEY_LEADCHNLSET_SET) {
			this.sET = (tr.com.srdc.icardea.hibernate.SET) owner;
		}
		
		else if (key == tr.com.srdc.icardea.hibernate.ORMConstants.KEY_LEADCHNLSET_SENSINGSET) {
			this.sENSINGSET = (tr.com.srdc.icardea.hibernate.SENSINGSET) owner;
		}
		
		else if (key == tr.com.srdc.icardea.hibernate.ORMConstants.KEY_LEADCHNLSET_PACING) {
			this.pACING = (tr.com.srdc.icardea.hibernate.PACING) owner;
		}
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	private int ID;
	
	private String chamber;
	
	private Integer subID;
	
	private tr.com.srdc.icardea.hibernate.SET sET;
	
	private tr.com.srdc.icardea.hibernate.SENSINGSET sENSINGSET;
	
	private tr.com.srdc.icardea.hibernate.PACING pACING;
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setChamber(String value) {
		this.chamber = value;
	}
	
	public String getChamber() {
		return chamber;
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
		if (sET != null) {
			sET.lEADCHNLSET.remove(this);
		}
		if (value != null) {
			value.lEADCHNLSET.add(this);
		}
	}
	
	public tr.com.srdc.icardea.hibernate.SET getsET() {
		return sET;
	}
	
	/**
	 * This method is for internal use only.
	 */
	private void setORM_sET(tr.com.srdc.icardea.hibernate.SET value) {
		this.sET = value;
	}
	
	private tr.com.srdc.icardea.hibernate.SET getORM_SET() {
		return sET;
	}
	
	public void setsENSINGSET(tr.com.srdc.icardea.hibernate.SENSINGSET value) {
		if (this.sENSINGSET != value) {
			tr.com.srdc.icardea.hibernate.SENSINGSET lsENSINGSET = this.sENSINGSET;
			this.sENSINGSET = value;
			if (value != null) {
				sENSINGSET.setlEADCHNLSET(this);
			}
			else {
				lsENSINGSET.setlEADCHNLSET(null);
			}
		}
	}
	
	public tr.com.srdc.icardea.hibernate.SENSINGSET getsENSINGSET() {
		return sENSINGSET;
	}
	
	public void setpACING(tr.com.srdc.icardea.hibernate.PACING value) {
		if (this.pACING != value) {
			tr.com.srdc.icardea.hibernate.PACING lpACING = this.pACING;
			this.pACING = value;
			if (value != null) {
				pACING.setlEADCHNLSET(this);
			}
			else {
				lpACING.setlEADCHNLSET(null);
			}
		}
	}
	
	public tr.com.srdc.icardea.hibernate.PACING getpACING() {
		return pACING;
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
			sb.append("LEADCHNLSET[ ");
			sb.append("ID=").append(getID()).append(" ");
			sb.append("Chamber=").append(getChamber()).append(" ");
			sb.append("SubID=").append(getSubID()).append(" ");
			if (getsET() != null)
				sb.append("sET.Persist_ID=").append(getsET().toString(true)).append(" ");
			else
				sb.append("sET=null ");
			if (getsENSINGSET() != null)
				sb.append("sENSINGSET.Persist_ID=").append(getsENSINGSET().toString(true)).append(" ");
			else
				sb.append("sENSINGSET=null ");
			if (getpACING() != null)
				sb.append("pACING.Persist_ID=").append(getpACING().toString(true)).append(" ");
			else
				sb.append("pACING=null ");
			sb.append("]");
			return sb.toString();
		}
	}
	
}
