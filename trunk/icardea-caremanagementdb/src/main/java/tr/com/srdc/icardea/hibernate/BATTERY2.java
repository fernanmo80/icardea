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

public class BATTERY2 {
	private static final org.apache.log4j.Logger _logger = org.apache.log4j.Logger.getLogger(BATTERY2.class);
	public BATTERY2() {
	}
	
	public static BATTERY2 loadBATTERY2ByORMID(int ID) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return loadBATTERY2ByORMID(session, ID);
		}
		catch (Exception e) {
			_logger.error("loadBATTERY2ByORMID(int ID)", e);
			return null;
		}
	}
	
	public static BATTERY2 getBATTERY2ByORMID(int ID) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return getBATTERY2ByORMID(session, ID);
		}
		catch (Exception e) {
			_logger.error("getBATTERY2ByORMID(int ID)", e);
			return null;
		}
	}
	
	public static BATTERY2 loadBATTERY2ByORMID(int ID, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return loadBATTERY2ByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			_logger.error("loadBATTERY2ByORMID(int ID, org.hibernate.LockMode lockMode)", e);
			return null;
		}
	}
	
	public static BATTERY2 getBATTERY2ByORMID(int ID, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return getBATTERY2ByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			_logger.error("getBATTERY2ByORMID(int ID, org.hibernate.LockMode lockMode)", e);
			return null;
		}
	}
	
	public static BATTERY2 loadBATTERY2ByORMID(PersistentSession session, int ID) {
		try {
			return (BATTERY2) session.load(tr.com.srdc.icardea.hibernate.BATTERY2.class, new Integer(ID));
		}
		catch (Exception e) {
			_logger.error("loadBATTERY2ByORMID(PersistentSession session, int ID)", e);
			return null;
		}
	}
	
	public static BATTERY2 getBATTERY2ByORMID(PersistentSession session, int ID) {
		try {
			return (BATTERY2) session.get(tr.com.srdc.icardea.hibernate.BATTERY2.class, new Integer(ID));
		}
		catch (Exception e) {
			_logger.error("getBATTERY2ByORMID(PersistentSession session, int ID)", e);
			return null;
		}
	}
	
	public static BATTERY2 loadBATTERY2ByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) {
		try {
			return (BATTERY2) session.load(tr.com.srdc.icardea.hibernate.BATTERY2.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			_logger.error("loadBATTERY2ByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode)", e);
			return null;
		}
	}
	
	public static BATTERY2 getBATTERY2ByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) {
		try {
			return (BATTERY2) session.get(tr.com.srdc.icardea.hibernate.BATTERY2.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			_logger.error("getBATTERY2ByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode)", e);
			return null;
		}
	}
	
	public static BATTERY2[] listBATTERY2ByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return listBATTERY2ByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("listBATTERY2ByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static BATTERY2[] listBATTERY2ByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return listBATTERY2ByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("listBATTERY2ByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static BATTERY2[] listBATTERY2ByQuery(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From tr.com.srdc.icardea.hibernate.BATTERY2 as BATTERY2");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			List list = query.list();
			return (BATTERY2[]) list.toArray(new BATTERY2[list.size()]);
		}
		catch (Exception e) {
			_logger.error("listBATTERY2ByQuery(PersistentSession session, String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static BATTERY2[] listBATTERY2ByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From tr.com.srdc.icardea.hibernate.BATTERY2 as BATTERY2");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("this", lockMode);
			List list = query.list();
			return (BATTERY2[]) list.toArray(new BATTERY2[list.size()]);
		}
		catch (Exception e) {
			_logger.error("listBATTERY2ByQuery(PersistentSession session, String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static BATTERY2 loadBATTERY2ByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return loadBATTERY2ByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("loadBATTERY2ByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static BATTERY2 loadBATTERY2ByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return loadBATTERY2ByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("loadBATTERY2ByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static BATTERY2 loadBATTERY2ByQuery(PersistentSession session, String condition, String orderBy) {
		BATTERY2[] bATTERY2s = listBATTERY2ByQuery(session, condition, orderBy);
		if (bATTERY2s != null && bATTERY2s.length > 0)
			return bATTERY2s[0];
		else
			return null;
	}
	
	public static BATTERY2 loadBATTERY2ByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		BATTERY2[] bATTERY2s = listBATTERY2ByQuery(session, condition, orderBy, lockMode);
		if (bATTERY2s != null && bATTERY2s.length > 0)
			return bATTERY2s[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateBATTERY2ByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return iterateBATTERY2ByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("iterateBATTERY2ByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static java.util.Iterator iterateBATTERY2ByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return iterateBATTERY2ByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("iterateBATTERY2ByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static java.util.Iterator iterateBATTERY2ByQuery(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From tr.com.srdc.icardea.hibernate.BATTERY2 as BATTERY2");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			_logger.error("iterateBATTERY2ByQuery(PersistentSession session, String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static java.util.Iterator iterateBATTERY2ByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From tr.com.srdc.icardea.hibernate.BATTERY2 as BATTERY2");
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
			_logger.error("iterateBATTERY2ByQuery(PersistentSession session, String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static BATTERY2 loadBATTERY2ByCriteria(BATTERY2Criteria bATTERY2Criteria) {
		BATTERY2[] bATTERY2s = listBATTERY2ByCriteria(bATTERY2Criteria);
		if(bATTERY2s == null || bATTERY2s.length == 0) {
			return null;
		}
		return bATTERY2s[0];
	}
	
	public static BATTERY2[] listBATTERY2ByCriteria(BATTERY2Criteria bATTERY2Criteria) {
		return bATTERY2Criteria.listBATTERY2();
	}
	
	public static BATTERY2 createBATTERY2() {
		return new tr.com.srdc.icardea.hibernate.BATTERY2();
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
				getmSMT().bATTERY2.remove(this);
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
				getmSMT().bATTERY2.remove(this);
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
		if (key == tr.com.srdc.icardea.hibernate.ORMConstants.KEY_BATTERY2_MSMT) {
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
	
	private String dtm;
	
	private String status;
	
	private String voltage;
	
	private String impedance;
	
	private String remaining_longevity;
	
	private String remaining_percentage;
	
	private String rrt_trigger;
	
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
	
	public void setDtm(String value) {
		this.dtm = value;
	}
	
	public String getDtm() {
		return dtm;
	}
	
	public void setStatus(String value) {
		this.status = value;
	}
	
	public String getStatus() {
		return status;
	}
	
	public void setVoltage(String value) {
		this.voltage = value;
	}
	
	public String getVoltage() {
		return voltage;
	}
	
	public void setImpedance(String value) {
		this.impedance = value;
	}
	
	public String getImpedance() {
		return impedance;
	}
	
	public void setRemaining_longevity(String value) {
		this.remaining_longevity = value;
	}
	
	public String getRemaining_longevity() {
		return remaining_longevity;
	}
	
	public void setRemaining_percentage(String value) {
		this.remaining_percentage = value;
	}
	
	public String getRemaining_percentage() {
		return remaining_percentage;
	}
	
	public void setRrt_trigger(String value) {
		this.rrt_trigger = value;
	}
	
	public String getRrt_trigger() {
		return rrt_trigger;
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
			mSMT.bATTERY2.remove(this);
		}
		if (value != null) {
			value.bATTERY2.add(this);
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
			sb.append("BATTERY2[ ");
			sb.append("ID=").append(getID()).append(" ");
			if (getmSMT() != null)
				sb.append("mSMT.Persist_ID=").append(getmSMT().toString(true)).append(" ");
			else
				sb.append("mSMT=null ");
			sb.append("Dtm=").append(getDtm()).append(" ");
			sb.append("Status=").append(getStatus()).append(" ");
			sb.append("Voltage=").append(getVoltage()).append(" ");
			sb.append("Impedance=").append(getImpedance()).append(" ");
			sb.append("Remaining_longevity=").append(getRemaining_longevity()).append(" ");
			sb.append("Remaining_percentage=").append(getRemaining_percentage()).append(" ");
			sb.append("Rrt_trigger=").append(getRrt_trigger()).append(" ");
			sb.append("SubID=").append(getSubID()).append(" ");
			sb.append("]");
			return sb.toString();
		}
	}
	
}
