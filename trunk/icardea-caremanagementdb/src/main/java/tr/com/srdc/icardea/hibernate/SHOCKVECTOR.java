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

public class SHOCKVECTOR {
	private static final org.apache.log4j.Logger _logger = org.apache.log4j.Logger.getLogger(SHOCKVECTOR.class);
	public SHOCKVECTOR() {
	}
	
	public static SHOCKVECTOR loadSHOCKVECTORByORMID(int ID) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return loadSHOCKVECTORByORMID(session, ID);
		}
		catch (Exception e) {
			_logger.error("loadSHOCKVECTORByORMID(int ID)", e);
			return null;
		}
	}
	
	public static SHOCKVECTOR getSHOCKVECTORByORMID(int ID) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return getSHOCKVECTORByORMID(session, ID);
		}
		catch (Exception e) {
			_logger.error("getSHOCKVECTORByORMID(int ID)", e);
			return null;
		}
	}
	
	public static SHOCKVECTOR loadSHOCKVECTORByORMID(int ID, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return loadSHOCKVECTORByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			_logger.error("loadSHOCKVECTORByORMID(int ID, org.hibernate.LockMode lockMode)", e);
			return null;
		}
	}
	
	public static SHOCKVECTOR getSHOCKVECTORByORMID(int ID, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return getSHOCKVECTORByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			_logger.error("getSHOCKVECTORByORMID(int ID, org.hibernate.LockMode lockMode)", e);
			return null;
		}
	}
	
	public static SHOCKVECTOR loadSHOCKVECTORByORMID(PersistentSession session, int ID) {
		try {
			return (SHOCKVECTOR) session.load(tr.com.srdc.icardea.hibernate.SHOCKVECTOR.class, new Integer(ID));
		}
		catch (Exception e) {
			_logger.error("loadSHOCKVECTORByORMID(PersistentSession session, int ID)", e);
			return null;
		}
	}
	
	public static SHOCKVECTOR getSHOCKVECTORByORMID(PersistentSession session, int ID) {
		try {
			return (SHOCKVECTOR) session.get(tr.com.srdc.icardea.hibernate.SHOCKVECTOR.class, new Integer(ID));
		}
		catch (Exception e) {
			_logger.error("getSHOCKVECTORByORMID(PersistentSession session, int ID)", e);
			return null;
		}
	}
	
	public static SHOCKVECTOR loadSHOCKVECTORByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) {
		try {
			return (SHOCKVECTOR) session.load(tr.com.srdc.icardea.hibernate.SHOCKVECTOR.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			_logger.error("loadSHOCKVECTORByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode)", e);
			return null;
		}
	}
	
	public static SHOCKVECTOR getSHOCKVECTORByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) {
		try {
			return (SHOCKVECTOR) session.get(tr.com.srdc.icardea.hibernate.SHOCKVECTOR.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			_logger.error("getSHOCKVECTORByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode)", e);
			return null;
		}
	}
	
	public static SHOCKVECTOR[] listSHOCKVECTORByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return listSHOCKVECTORByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("listSHOCKVECTORByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static SHOCKVECTOR[] listSHOCKVECTORByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return listSHOCKVECTORByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("listSHOCKVECTORByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static SHOCKVECTOR[] listSHOCKVECTORByQuery(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From tr.com.srdc.icardea.hibernate.SHOCKVECTOR as SHOCKVECTOR");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			List list = query.list();
			return (SHOCKVECTOR[]) list.toArray(new SHOCKVECTOR[list.size()]);
		}
		catch (Exception e) {
			_logger.error("listSHOCKVECTORByQuery(PersistentSession session, String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static SHOCKVECTOR[] listSHOCKVECTORByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From tr.com.srdc.icardea.hibernate.SHOCKVECTOR as SHOCKVECTOR");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("this", lockMode);
			List list = query.list();
			return (SHOCKVECTOR[]) list.toArray(new SHOCKVECTOR[list.size()]);
		}
		catch (Exception e) {
			_logger.error("listSHOCKVECTORByQuery(PersistentSession session, String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static SHOCKVECTOR loadSHOCKVECTORByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return loadSHOCKVECTORByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("loadSHOCKVECTORByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static SHOCKVECTOR loadSHOCKVECTORByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return loadSHOCKVECTORByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("loadSHOCKVECTORByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static SHOCKVECTOR loadSHOCKVECTORByQuery(PersistentSession session, String condition, String orderBy) {
		SHOCKVECTOR[] sHOCKVECTORs = listSHOCKVECTORByQuery(session, condition, orderBy);
		if (sHOCKVECTORs != null && sHOCKVECTORs.length > 0)
			return sHOCKVECTORs[0];
		else
			return null;
	}
	
	public static SHOCKVECTOR loadSHOCKVECTORByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		SHOCKVECTOR[] sHOCKVECTORs = listSHOCKVECTORByQuery(session, condition, orderBy, lockMode);
		if (sHOCKVECTORs != null && sHOCKVECTORs.length > 0)
			return sHOCKVECTORs[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateSHOCKVECTORByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return iterateSHOCKVECTORByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("iterateSHOCKVECTORByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static java.util.Iterator iterateSHOCKVECTORByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return iterateSHOCKVECTORByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("iterateSHOCKVECTORByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static java.util.Iterator iterateSHOCKVECTORByQuery(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From tr.com.srdc.icardea.hibernate.SHOCKVECTOR as SHOCKVECTOR");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			_logger.error("iterateSHOCKVECTORByQuery(PersistentSession session, String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static java.util.Iterator iterateSHOCKVECTORByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From tr.com.srdc.icardea.hibernate.SHOCKVECTOR as SHOCKVECTOR");
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
			_logger.error("iterateSHOCKVECTORByQuery(PersistentSession session, String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static SHOCKVECTOR loadSHOCKVECTORByCriteria(SHOCKVECTORCriteria sHOCKVECTORCriteria) {
		SHOCKVECTOR[] sHOCKVECTORs = listSHOCKVECTORByCriteria(sHOCKVECTORCriteria);
		if(sHOCKVECTORs == null || sHOCKVECTORs.length == 0) {
			return null;
		}
		return sHOCKVECTORs[0];
	}
	
	public static SHOCKVECTOR[] listSHOCKVECTORByCriteria(SHOCKVECTORCriteria sHOCKVECTORCriteria) {
		return sHOCKVECTORCriteria.listSHOCKVECTOR();
	}
	
	public static SHOCKVECTOR createSHOCKVECTOR() {
		return new tr.com.srdc.icardea.hibernate.SHOCKVECTOR();
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
			if(getlEADHVCHANNELSET() != null) {
				getlEADHVCHANNELSET().setsHOCKVECTOR(null);
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
			if(getlEADHVCHANNELSET() != null) {
				getlEADHVCHANNELSET().setsHOCKVECTOR(null);
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
	
	private String anode_location_1;
	
	private String anode_location_2;
	
	private String anode_location_3;
	
	private String anode_electrode_1;
	
	private String anode_electrode_2;
	
	private String anode_electrode_3;
	
	private String cathode_location_1;
	
	private String cathode_location_2;
	
	private String cathode_location_3;
	
	private String cathode_electrode_1;
	
	private String cathode_electrode_2;
	
	private String cathode_electrode_3;
	
	private tr.com.srdc.icardea.hibernate.LEADHVCHANNELSET lEADHVCHANNELSET;
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setAnode_location_1(String value) {
		this.anode_location_1 = value;
	}
	
	public String getAnode_location_1() {
		return anode_location_1;
	}
	
	public void setAnode_location_2(String value) {
		this.anode_location_2 = value;
	}
	
	public String getAnode_location_2() {
		return anode_location_2;
	}
	
	public void setAnode_location_3(String value) {
		this.anode_location_3 = value;
	}
	
	public String getAnode_location_3() {
		return anode_location_3;
	}
	
	public void setAnode_electrode_1(String value) {
		this.anode_electrode_1 = value;
	}
	
	public String getAnode_electrode_1() {
		return anode_electrode_1;
	}
	
	public void setAnode_electrode_2(String value) {
		this.anode_electrode_2 = value;
	}
	
	public String getAnode_electrode_2() {
		return anode_electrode_2;
	}
	
	public void setAnode_electrode_3(String value) {
		this.anode_electrode_3 = value;
	}
	
	public String getAnode_electrode_3() {
		return anode_electrode_3;
	}
	
	public void setCathode_location_1(String value) {
		this.cathode_location_1 = value;
	}
	
	public String getCathode_location_1() {
		return cathode_location_1;
	}
	
	public void setCathode_location_2(String value) {
		this.cathode_location_2 = value;
	}
	
	public String getCathode_location_2() {
		return cathode_location_2;
	}
	
	public void setCathode_location_3(String value) {
		this.cathode_location_3 = value;
	}
	
	public String getCathode_location_3() {
		return cathode_location_3;
	}
	
	public void setCathode_electrode_1(String value) {
		this.cathode_electrode_1 = value;
	}
	
	public String getCathode_electrode_1() {
		return cathode_electrode_1;
	}
	
	public void setCathode_electrode_2(String value) {
		this.cathode_electrode_2 = value;
	}
	
	public String getCathode_electrode_2() {
		return cathode_electrode_2;
	}
	
	public void setCathode_electrode_3(String value) {
		this.cathode_electrode_3 = value;
	}
	
	public String getCathode_electrode_3() {
		return cathode_electrode_3;
	}
	
	public void setlEADHVCHANNELSET(tr.com.srdc.icardea.hibernate.LEADHVCHANNELSET value) {
		if (this.lEADHVCHANNELSET != value) {
			tr.com.srdc.icardea.hibernate.LEADHVCHANNELSET llEADHVCHANNELSET = this.lEADHVCHANNELSET;
			this.lEADHVCHANNELSET = value;
			if (value != null) {
				lEADHVCHANNELSET.setsHOCKVECTOR(this);
			}
			else {
				llEADHVCHANNELSET.setsHOCKVECTOR(null);
			}
		}
	}
	
	public tr.com.srdc.icardea.hibernate.LEADHVCHANNELSET getlEADHVCHANNELSET() {
		return lEADHVCHANNELSET;
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
			sb.append("SHOCKVECTOR[ ");
			sb.append("ID=").append(getID()).append(" ");
			sb.append("Anode_location_1=").append(getAnode_location_1()).append(" ");
			sb.append("Anode_location_2=").append(getAnode_location_2()).append(" ");
			sb.append("Anode_location_3=").append(getAnode_location_3()).append(" ");
			sb.append("Anode_electrode_1=").append(getAnode_electrode_1()).append(" ");
			sb.append("Anode_electrode_2=").append(getAnode_electrode_2()).append(" ");
			sb.append("Anode_electrode_3=").append(getAnode_electrode_3()).append(" ");
			sb.append("Cathode_location_1=").append(getCathode_location_1()).append(" ");
			sb.append("Cathode_location_2=").append(getCathode_location_2()).append(" ");
			sb.append("Cathode_location_3=").append(getCathode_location_3()).append(" ");
			sb.append("Cathode_electrode_1=").append(getCathode_electrode_1()).append(" ");
			sb.append("Cathode_electrode_2=").append(getCathode_electrode_2()).append(" ");
			sb.append("Cathode_electrode_3=").append(getCathode_electrode_3()).append(" ");
			if (getlEADHVCHANNELSET() != null)
				sb.append("lEADHVCHANNELSET.Persist_ID=").append(getlEADHVCHANNELSET().toString(true)).append(" ");
			else
				sb.append("lEADHVCHANNELSET=null ");
			sb.append("]");
			return sb.toString();
		}
	}
	
}
