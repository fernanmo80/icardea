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

public class LEAD2 {
	private static final org.apache.log4j.Logger _logger = org.apache.log4j.Logger.getLogger(LEAD2.class);
	public LEAD2() {
	}
	
	public static LEAD2 loadLEAD2ByORMID(int ID) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return loadLEAD2ByORMID(session, ID);
		}
		catch (Exception e) {
			_logger.error("loadLEAD2ByORMID(int ID)", e);
			return null;
		}
	}
	
	public static LEAD2 getLEAD2ByORMID(int ID) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return getLEAD2ByORMID(session, ID);
		}
		catch (Exception e) {
			_logger.error("getLEAD2ByORMID(int ID)", e);
			return null;
		}
	}
	
	public static LEAD2 loadLEAD2ByORMID(int ID, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return loadLEAD2ByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			_logger.error("loadLEAD2ByORMID(int ID, org.hibernate.LockMode lockMode)", e);
			return null;
		}
	}
	
	public static LEAD2 getLEAD2ByORMID(int ID, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return getLEAD2ByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			_logger.error("getLEAD2ByORMID(int ID, org.hibernate.LockMode lockMode)", e);
			return null;
		}
	}
	
	public static LEAD2 loadLEAD2ByORMID(PersistentSession session, int ID) {
		try {
			return (LEAD2) session.load(tr.com.srdc.icardea.hibernate.LEAD2.class, new Integer(ID));
		}
		catch (Exception e) {
			_logger.error("loadLEAD2ByORMID(PersistentSession session, int ID)", e);
			return null;
		}
	}
	
	public static LEAD2 getLEAD2ByORMID(PersistentSession session, int ID) {
		try {
			return (LEAD2) session.get(tr.com.srdc.icardea.hibernate.LEAD2.class, new Integer(ID));
		}
		catch (Exception e) {
			_logger.error("getLEAD2ByORMID(PersistentSession session, int ID)", e);
			return null;
		}
	}
	
	public static LEAD2 loadLEAD2ByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) {
		try {
			return (LEAD2) session.load(tr.com.srdc.icardea.hibernate.LEAD2.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			_logger.error("loadLEAD2ByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode)", e);
			return null;
		}
	}
	
	public static LEAD2 getLEAD2ByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) {
		try {
			return (LEAD2) session.get(tr.com.srdc.icardea.hibernate.LEAD2.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			_logger.error("getLEAD2ByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode)", e);
			return null;
		}
	}
	
	public static LEAD2[] listLEAD2ByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return listLEAD2ByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("listLEAD2ByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static LEAD2[] listLEAD2ByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return listLEAD2ByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("listLEAD2ByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static LEAD2[] listLEAD2ByQuery(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From tr.com.srdc.icardea.hibernate.LEAD2 as LEAD2");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			List list = query.list();
			return (LEAD2[]) list.toArray(new LEAD2[list.size()]);
		}
		catch (Exception e) {
			_logger.error("listLEAD2ByQuery(PersistentSession session, String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static LEAD2[] listLEAD2ByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From tr.com.srdc.icardea.hibernate.LEAD2 as LEAD2");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("this", lockMode);
			List list = query.list();
			return (LEAD2[]) list.toArray(new LEAD2[list.size()]);
		}
		catch (Exception e) {
			_logger.error("listLEAD2ByQuery(PersistentSession session, String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static LEAD2 loadLEAD2ByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return loadLEAD2ByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("loadLEAD2ByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static LEAD2 loadLEAD2ByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return loadLEAD2ByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("loadLEAD2ByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static LEAD2 loadLEAD2ByQuery(PersistentSession session, String condition, String orderBy) {
		LEAD2[] lEAD2s = listLEAD2ByQuery(session, condition, orderBy);
		if (lEAD2s != null && lEAD2s.length > 0)
			return lEAD2s[0];
		else
			return null;
	}
	
	public static LEAD2 loadLEAD2ByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		LEAD2[] lEAD2s = listLEAD2ByQuery(session, condition, orderBy, lockMode);
		if (lEAD2s != null && lEAD2s.length > 0)
			return lEAD2s[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateLEAD2ByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return iterateLEAD2ByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("iterateLEAD2ByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static java.util.Iterator iterateLEAD2ByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return iterateLEAD2ByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("iterateLEAD2ByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static java.util.Iterator iterateLEAD2ByQuery(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From tr.com.srdc.icardea.hibernate.LEAD2 as LEAD2");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			_logger.error("iterateLEAD2ByQuery(PersistentSession session, String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static java.util.Iterator iterateLEAD2ByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From tr.com.srdc.icardea.hibernate.LEAD2 as LEAD2");
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
			_logger.error("iterateLEAD2ByQuery(PersistentSession session, String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static LEAD2 loadLEAD2ByCriteria(LEAD2Criteria lEAD2Criteria) {
		LEAD2[] lEAD2s = listLEAD2ByCriteria(lEAD2Criteria);
		if(lEAD2s == null || lEAD2s.length == 0) {
			return null;
		}
		return lEAD2s[0];
	}
	
	public static LEAD2[] listLEAD2ByCriteria(LEAD2Criteria lEAD2Criteria) {
		return lEAD2Criteria.listLEAD2();
	}
	
	public static LEAD2 createLEAD2() {
		return new tr.com.srdc.icardea.hibernate.LEAD2();
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
			if(getSystem() != null) {
				getSystem().lEAD2.remove(this);
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
			if(getSystem() != null) {
				getSystem().lEAD2.remove(this);
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
		if (key == tr.com.srdc.icardea.hibernate.ORMConstants.KEY_LEAD2_SYSTEM) {
			this.system = (tr.com.srdc.icardea.hibernate.System) owner;
		}
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	private int ID;
	
	private tr.com.srdc.icardea.hibernate.System system;
	
	private String model;
	
	private String serial;
	
	private String mfg;
	
	private String implant_dt;
	
	private String polarity_type;
	
	private String location;
	
	private String location_detail_1;
	
	private String location_detail_2;
	
	private String location_detail_3;
	
	private String connection_status;
	
	private String special_function;
	
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
	
	public void setModel(String value) {
		this.model = value;
	}
	
	public String getModel() {
		return model;
	}
	
	public void setSerial(String value) {
		this.serial = value;
	}
	
	public String getSerial() {
		return serial;
	}
	
	public void setMfg(String value) {
		this.mfg = value;
	}
	
	public String getMfg() {
		return mfg;
	}
	
	public void setImplant_dt(String value) {
		this.implant_dt = value;
	}
	
	public String getImplant_dt() {
		return implant_dt;
	}
	
	public void setPolarity_type(String value) {
		this.polarity_type = value;
	}
	
	public String getPolarity_type() {
		return polarity_type;
	}
	
	public void setLocation(String value) {
		this.location = value;
	}
	
	public String getLocation() {
		return location;
	}
	
	public void setLocation_detail_1(String value) {
		this.location_detail_1 = value;
	}
	
	public String getLocation_detail_1() {
		return location_detail_1;
	}
	
	public void setLocation_detail_2(String value) {
		this.location_detail_2 = value;
	}
	
	public String getLocation_detail_2() {
		return location_detail_2;
	}
	
	public void setLocation_detail_3(String value) {
		this.location_detail_3 = value;
	}
	
	public String getLocation_detail_3() {
		return location_detail_3;
	}
	
	public void setConnection_status(String value) {
		this.connection_status = value;
	}
	
	public String getConnection_status() {
		return connection_status;
	}
	
	public void setSpecial_function(String value) {
		this.special_function = value;
	}
	
	public String getSpecial_function() {
		return special_function;
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
	
	public void setSystem(tr.com.srdc.icardea.hibernate.System value) {
		if (system != null) {
			system.lEAD2.remove(this);
		}
		if (value != null) {
			value.lEAD2.add(this);
		}
	}
	
	public tr.com.srdc.icardea.hibernate.System getSystem() {
		return system;
	}
	
	/**
	 * This method is for internal use only.
	 */
	private void setORM_System(tr.com.srdc.icardea.hibernate.System value) {
		this.system = value;
	}
	
	private tr.com.srdc.icardea.hibernate.System getORM_System() {
		return system;
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
			sb.append("LEAD2[ ");
			sb.append("ID=").append(getID()).append(" ");
			if (getSystem() != null)
				sb.append("System.Persist_ID=").append(getSystem().toString(true)).append(" ");
			else
				sb.append("System=null ");
			sb.append("Model=").append(getModel()).append(" ");
			sb.append("Serial=").append(getSerial()).append(" ");
			sb.append("Mfg=").append(getMfg()).append(" ");
			sb.append("Implant_dt=").append(getImplant_dt()).append(" ");
			sb.append("Polarity_type=").append(getPolarity_type()).append(" ");
			sb.append("Location=").append(getLocation()).append(" ");
			sb.append("Location_detail_1=").append(getLocation_detail_1()).append(" ");
			sb.append("Location_detail_2=").append(getLocation_detail_2()).append(" ");
			sb.append("Location_detail_3=").append(getLocation_detail_3()).append(" ");
			sb.append("Connection_status=").append(getConnection_status()).append(" ");
			sb.append("Special_function=").append(getSpecial_function()).append(" ");
			sb.append("SubID=").append(getSubID()).append(" ");
			sb.append("]");
			return sb.toString();
		}
	}
	
}
