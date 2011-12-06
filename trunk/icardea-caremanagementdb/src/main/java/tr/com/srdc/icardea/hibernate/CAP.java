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

public class CAP {
	private static final org.apache.log4j.Logger _logger = org.apache.log4j.Logger.getLogger(CAP.class);
	public CAP() {
	}
	
	public static CAP loadCAPByORMID(int ID) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return loadCAPByORMID(session, ID);
		}
		catch (Exception e) {
			_logger.error("loadCAPByORMID(int ID)", e);
			return null;
		}
	}
	
	public static CAP getCAPByORMID(int ID) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return getCAPByORMID(session, ID);
		}
		catch (Exception e) {
			_logger.error("getCAPByORMID(int ID)", e);
			return null;
		}
	}
	
	public static CAP loadCAPByORMID(int ID, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return loadCAPByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			_logger.error("loadCAPByORMID(int ID, org.hibernate.LockMode lockMode)", e);
			return null;
		}
	}
	
	public static CAP getCAPByORMID(int ID, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return getCAPByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			_logger.error("getCAPByORMID(int ID, org.hibernate.LockMode lockMode)", e);
			return null;
		}
	}
	
	public static CAP loadCAPByORMID(PersistentSession session, int ID) {
		try {
			return (CAP) session.load(tr.com.srdc.icardea.hibernate.CAP.class, new Integer(ID));
		}
		catch (Exception e) {
			_logger.error("loadCAPByORMID(PersistentSession session, int ID)", e);
			return null;
		}
	}
	
	public static CAP getCAPByORMID(PersistentSession session, int ID) {
		try {
			return (CAP) session.get(tr.com.srdc.icardea.hibernate.CAP.class, new Integer(ID));
		}
		catch (Exception e) {
			_logger.error("getCAPByORMID(PersistentSession session, int ID)", e);
			return null;
		}
	}
	
	public static CAP loadCAPByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) {
		try {
			return (CAP) session.load(tr.com.srdc.icardea.hibernate.CAP.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			_logger.error("loadCAPByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode)", e);
			return null;
		}
	}
	
	public static CAP getCAPByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) {
		try {
			return (CAP) session.get(tr.com.srdc.icardea.hibernate.CAP.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			_logger.error("getCAPByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode)", e);
			return null;
		}
	}
	
	public static CAP[] listCAPByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return listCAPByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("listCAPByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static CAP[] listCAPByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return listCAPByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("listCAPByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static CAP[] listCAPByQuery(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From tr.com.srdc.icardea.hibernate.CAP as CAP");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			List list = query.list();
			return (CAP[]) list.toArray(new CAP[list.size()]);
		}
		catch (Exception e) {
			_logger.error("listCAPByQuery(PersistentSession session, String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static CAP[] listCAPByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From tr.com.srdc.icardea.hibernate.CAP as CAP");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("this", lockMode);
			List list = query.list();
			return (CAP[]) list.toArray(new CAP[list.size()]);
		}
		catch (Exception e) {
			_logger.error("listCAPByQuery(PersistentSession session, String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static CAP loadCAPByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return loadCAPByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("loadCAPByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static CAP loadCAPByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return loadCAPByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("loadCAPByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static CAP loadCAPByQuery(PersistentSession session, String condition, String orderBy) {
		CAP[] cAPs = listCAPByQuery(session, condition, orderBy);
		if (cAPs != null && cAPs.length > 0)
			return cAPs[0];
		else
			return null;
	}
	
	public static CAP loadCAPByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		CAP[] cAPs = listCAPByQuery(session, condition, orderBy, lockMode);
		if (cAPs != null && cAPs.length > 0)
			return cAPs[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateCAPByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return iterateCAPByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("iterateCAPByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static java.util.Iterator iterateCAPByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return iterateCAPByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("iterateCAPByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static java.util.Iterator iterateCAPByQuery(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From tr.com.srdc.icardea.hibernate.CAP as CAP");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			_logger.error("iterateCAPByQuery(PersistentSession session, String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static java.util.Iterator iterateCAPByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From tr.com.srdc.icardea.hibernate.CAP as CAP");
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
			_logger.error("iterateCAPByQuery(PersistentSession session, String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static CAP loadCAPByCriteria(CAPCriteria cAPCriteria) {
		CAP[] cAPs = listCAPByCriteria(cAPCriteria);
		if(cAPs == null || cAPs.length == 0) {
			return null;
		}
		return cAPs[0];
	}
	
	public static CAP[] listCAPByCriteria(CAPCriteria cAPCriteria) {
		return cAPCriteria.listCAP();
	}
	
	public static CAP createCAP() {
		return new tr.com.srdc.icardea.hibernate.CAP();
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
			if(getmSMT() != null) {
				getmSMT().cAP.remove(this);
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
			if(getmSMT() != null) {
				getmSMT().cAP.remove(this);
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
		if (key == tr.com.srdc.icardea.hibernate.ORMConstants.KEY_CAP_MSMT) {
			this.mSMT = (tr.com.srdc.icardea.hibernate.MSMT) owner;
		}
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	private int ID;
	
	private tr.com.srdc.icardea.hibernate.MSMT mSMT;
	
	private String charge_dtm;
	
	private String charge_time;
	
	private String charge_energy;
	
	private String charge_type;
	
	private Integer subID;
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setCharge_dtm(String value) {
		this.charge_dtm = value;
	}
	
	public String getCharge_dtm() {
		return charge_dtm;
	}
	
	public void setCharge_time(String value) {
		this.charge_time = value;
	}
	
	public String getCharge_time() {
		return charge_time;
	}
	
	public void setCharge_energy(String value) {
		this.charge_energy = value;
	}
	
	public String getCharge_energy() {
		return charge_energy;
	}
	
	public void setCharge_type(String value) {
		this.charge_type = value;
	}
	
	public String getCharge_type() {
		return charge_type;
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
	
	public void setmSMT(tr.com.srdc.icardea.hibernate.MSMT value) {
		if (mSMT != null) {
			mSMT.cAP.remove(this);
		}
		if (value != null) {
			value.cAP.add(this);
		}
	}
	
	public tr.com.srdc.icardea.hibernate.MSMT getmSMT() {
		return mSMT;
	}
	
	/**
	 * This method is for internal use only.
	 */
	private void setORM_mSMT(tr.com.srdc.icardea.hibernate.MSMT value) {
		this.mSMT = value;
	}
	
	private tr.com.srdc.icardea.hibernate.MSMT getORM_MSMT() {
		return mSMT;
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
			sb.append("CAP[ ");
			sb.append("ID=").append(getID()).append(" ");
			if (getmSMT() != null)
				sb.append("mSMT.Persist_ID=").append(getmSMT().toString(true)).append(" ");
			else
				sb.append("mSMT=null ");
			sb.append("Charge_dtm=").append(getCharge_dtm()).append(" ");
			sb.append("Charge_time=").append(getCharge_time()).append(" ");
			sb.append("Charge_energy=").append(getCharge_energy()).append(" ");
			sb.append("Charge_type=").append(getCharge_type()).append(" ");
			sb.append("SubID=").append(getSubID()).append(" ");
			sb.append("]");
			return sb.toString();
		}
	}
	
}
