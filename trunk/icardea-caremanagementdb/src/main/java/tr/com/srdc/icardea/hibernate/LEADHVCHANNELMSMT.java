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

public class LEADHVCHANNELMSMT {
	private static final org.apache.log4j.Logger _logger = org.apache.log4j.Logger.getLogger(LEADHVCHANNELMSMT.class);
	public LEADHVCHANNELMSMT() {
	}
	
	public static LEADHVCHANNELMSMT loadLEADHVCHANNELMSMTByORMID(int ID) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return loadLEADHVCHANNELMSMTByORMID(session, ID);
		}
		catch (Exception e) {
			_logger.error("loadLEADHVCHANNELMSMTByORMID(int ID)", e);
			return null;
		}
	}
	
	public static LEADHVCHANNELMSMT getLEADHVCHANNELMSMTByORMID(int ID) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return getLEADHVCHANNELMSMTByORMID(session, ID);
		}
		catch (Exception e) {
			_logger.error("getLEADHVCHANNELMSMTByORMID(int ID)", e);
			return null;
		}
	}
	
	public static LEADHVCHANNELMSMT loadLEADHVCHANNELMSMTByORMID(int ID, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return loadLEADHVCHANNELMSMTByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			_logger.error("loadLEADHVCHANNELMSMTByORMID(int ID, org.hibernate.LockMode lockMode)", e);
			return null;
		}
	}
	
	public static LEADHVCHANNELMSMT getLEADHVCHANNELMSMTByORMID(int ID, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return getLEADHVCHANNELMSMTByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			_logger.error("getLEADHVCHANNELMSMTByORMID(int ID, org.hibernate.LockMode lockMode)", e);
			return null;
		}
	}
	
	public static LEADHVCHANNELMSMT loadLEADHVCHANNELMSMTByORMID(PersistentSession session, int ID) {
		try {
			return (LEADHVCHANNELMSMT) session.load(tr.com.srdc.icardea.hibernate.LEADHVCHANNELMSMT.class, new Integer(ID));
		}
		catch (Exception e) {
			_logger.error("loadLEADHVCHANNELMSMTByORMID(PersistentSession session, int ID)", e);
			return null;
		}
	}
	
	public static LEADHVCHANNELMSMT getLEADHVCHANNELMSMTByORMID(PersistentSession session, int ID) {
		try {
			return (LEADHVCHANNELMSMT) session.get(tr.com.srdc.icardea.hibernate.LEADHVCHANNELMSMT.class, new Integer(ID));
		}
		catch (Exception e) {
			_logger.error("getLEADHVCHANNELMSMTByORMID(PersistentSession session, int ID)", e);
			return null;
		}
	}
	
	public static LEADHVCHANNELMSMT loadLEADHVCHANNELMSMTByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) {
		try {
			return (LEADHVCHANNELMSMT) session.load(tr.com.srdc.icardea.hibernate.LEADHVCHANNELMSMT.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			_logger.error("loadLEADHVCHANNELMSMTByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode)", e);
			return null;
		}
	}
	
	public static LEADHVCHANNELMSMT getLEADHVCHANNELMSMTByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) {
		try {
			return (LEADHVCHANNELMSMT) session.get(tr.com.srdc.icardea.hibernate.LEADHVCHANNELMSMT.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			_logger.error("getLEADHVCHANNELMSMTByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode)", e);
			return null;
		}
	}
	
	public static LEADHVCHANNELMSMT[] listLEADHVCHANNELMSMTByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return listLEADHVCHANNELMSMTByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("listLEADHVCHANNELMSMTByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static LEADHVCHANNELMSMT[] listLEADHVCHANNELMSMTByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return listLEADHVCHANNELMSMTByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("listLEADHVCHANNELMSMTByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static LEADHVCHANNELMSMT[] listLEADHVCHANNELMSMTByQuery(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From tr.com.srdc.icardea.hibernate.LEADHVCHANNELMSMT as LEADHVCHANNELMSMT");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			List list = query.list();
			return (LEADHVCHANNELMSMT[]) list.toArray(new LEADHVCHANNELMSMT[list.size()]);
		}
		catch (Exception e) {
			_logger.error("listLEADHVCHANNELMSMTByQuery(PersistentSession session, String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static LEADHVCHANNELMSMT[] listLEADHVCHANNELMSMTByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From tr.com.srdc.icardea.hibernate.LEADHVCHANNELMSMT as LEADHVCHANNELMSMT");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("this", lockMode);
			List list = query.list();
			return (LEADHVCHANNELMSMT[]) list.toArray(new LEADHVCHANNELMSMT[list.size()]);
		}
		catch (Exception e) {
			_logger.error("listLEADHVCHANNELMSMTByQuery(PersistentSession session, String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static LEADHVCHANNELMSMT loadLEADHVCHANNELMSMTByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return loadLEADHVCHANNELMSMTByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("loadLEADHVCHANNELMSMTByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static LEADHVCHANNELMSMT loadLEADHVCHANNELMSMTByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return loadLEADHVCHANNELMSMTByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("loadLEADHVCHANNELMSMTByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static LEADHVCHANNELMSMT loadLEADHVCHANNELMSMTByQuery(PersistentSession session, String condition, String orderBy) {
		LEADHVCHANNELMSMT[] lEADHVCHANNELMSMTs = listLEADHVCHANNELMSMTByQuery(session, condition, orderBy);
		if (lEADHVCHANNELMSMTs != null && lEADHVCHANNELMSMTs.length > 0)
			return lEADHVCHANNELMSMTs[0];
		else
			return null;
	}
	
	public static LEADHVCHANNELMSMT loadLEADHVCHANNELMSMTByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		LEADHVCHANNELMSMT[] lEADHVCHANNELMSMTs = listLEADHVCHANNELMSMTByQuery(session, condition, orderBy, lockMode);
		if (lEADHVCHANNELMSMTs != null && lEADHVCHANNELMSMTs.length > 0)
			return lEADHVCHANNELMSMTs[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateLEADHVCHANNELMSMTByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return iterateLEADHVCHANNELMSMTByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("iterateLEADHVCHANNELMSMTByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static java.util.Iterator iterateLEADHVCHANNELMSMTByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return iterateLEADHVCHANNELMSMTByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("iterateLEADHVCHANNELMSMTByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static java.util.Iterator iterateLEADHVCHANNELMSMTByQuery(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From tr.com.srdc.icardea.hibernate.LEADHVCHANNELMSMT as LEADHVCHANNELMSMT");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			_logger.error("iterateLEADHVCHANNELMSMTByQuery(PersistentSession session, String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static java.util.Iterator iterateLEADHVCHANNELMSMTByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From tr.com.srdc.icardea.hibernate.LEADHVCHANNELMSMT as LEADHVCHANNELMSMT");
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
			_logger.error("iterateLEADHVCHANNELMSMTByQuery(PersistentSession session, String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static LEADHVCHANNELMSMT loadLEADHVCHANNELMSMTByCriteria(LEADHVCHANNELMSMTCriteria lEADHVCHANNELMSMTCriteria) {
		LEADHVCHANNELMSMT[] lEADHVCHANNELMSMTs = listLEADHVCHANNELMSMTByCriteria(lEADHVCHANNELMSMTCriteria);
		if(lEADHVCHANNELMSMTs == null || lEADHVCHANNELMSMTs.length == 0) {
			return null;
		}
		return lEADHVCHANNELMSMTs[0];
	}
	
	public static LEADHVCHANNELMSMT[] listLEADHVCHANNELMSMTByCriteria(LEADHVCHANNELMSMTCriteria lEADHVCHANNELMSMTCriteria) {
		return lEADHVCHANNELMSMTCriteria.listLEADHVCHANNELMSMT();
	}
	
	public static LEADHVCHANNELMSMT createLEADHVCHANNELMSMT() {
		return new tr.com.srdc.icardea.hibernate.LEADHVCHANNELMSMT();
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
				getmSMT().lEADHVCHANNELMSMT.remove(this);
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
				getmSMT().lEADHVCHANNELMSMT.remove(this);
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
		if (key == tr.com.srdc.icardea.hibernate.ORMConstants.KEY_LEADHVCHANNELMSMT_MSMT) {
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
	
	private String dtm_start;
	
	private String dtm_end;
	
	private String impedance;
	
	private String measurement_type;
	
	private String status;
	
	private Integer subID;
	
	private String dtm;
	
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
	
	public void setImpedance(String value) {
		this.impedance = value;
	}
	
	public String getImpedance() {
		return impedance;
	}
	
	public void setMeasurement_type(String value) {
		this.measurement_type = value;
	}
	
	public String getMeasurement_type() {
		return measurement_type;
	}
	
	public void setStatus(String value) {
		this.status = value;
	}
	
	public String getStatus() {
		return status;
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
	
	public void setDtm(String value) {
		this.dtm = value;
	}
	
	public String getDtm() {
		return dtm;
	}
	
	public void setmSMT(tr.com.srdc.icardea.hibernate.MSMT value) {
		if (mSMT != null) {
			mSMT.lEADHVCHANNELMSMT.remove(this);
		}
		if (value != null) {
			value.lEADHVCHANNELMSMT.add(this);
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
			sb.append("LEADHVCHANNELMSMT[ ");
			sb.append("ID=").append(getID()).append(" ");
			if (getmSMT() != null)
				sb.append("mSMT.Persist_ID=").append(getmSMT().toString(true)).append(" ");
			else
				sb.append("mSMT=null ");
			sb.append("Dtm_start=").append(getDtm_start()).append(" ");
			sb.append("Dtm_end=").append(getDtm_end()).append(" ");
			sb.append("Impedance=").append(getImpedance()).append(" ");
			sb.append("Measurement_type=").append(getMeasurement_type()).append(" ");
			sb.append("Status=").append(getStatus()).append(" ");
			sb.append("SubID=").append(getSubID()).append(" ");
			sb.append("Dtm=").append(getDtm()).append(" ");
			sb.append("]");
			return sb.toString();
		}
	}
	
}
