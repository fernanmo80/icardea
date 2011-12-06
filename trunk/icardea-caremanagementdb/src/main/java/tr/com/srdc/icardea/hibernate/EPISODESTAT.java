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

public class EPISODESTAT {
	private static final org.apache.log4j.Logger _logger = org.apache.log4j.Logger.getLogger(EPISODESTAT.class);
	public EPISODESTAT() {
	}
	
	public static EPISODESTAT loadEPISODESTATByORMID(int ID) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return loadEPISODESTATByORMID(session, ID);
		}
		catch (Exception e) {
			_logger.error("loadEPISODESTATByORMID(int ID)", e);
			return null;
		}
	}
	
	public static EPISODESTAT getEPISODESTATByORMID(int ID) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return getEPISODESTATByORMID(session, ID);
		}
		catch (Exception e) {
			_logger.error("getEPISODESTATByORMID(int ID)", e);
			return null;
		}
	}
	
	public static EPISODESTAT loadEPISODESTATByORMID(int ID, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return loadEPISODESTATByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			_logger.error("loadEPISODESTATByORMID(int ID, org.hibernate.LockMode lockMode)", e);
			return null;
		}
	}
	
	public static EPISODESTAT getEPISODESTATByORMID(int ID, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return getEPISODESTATByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			_logger.error("getEPISODESTATByORMID(int ID, org.hibernate.LockMode lockMode)", e);
			return null;
		}
	}
	
	public static EPISODESTAT loadEPISODESTATByORMID(PersistentSession session, int ID) {
		try {
			return (EPISODESTAT) session.load(tr.com.srdc.icardea.hibernate.EPISODESTAT.class, new Integer(ID));
		}
		catch (Exception e) {
			_logger.error("loadEPISODESTATByORMID(PersistentSession session, int ID)", e);
			return null;
		}
	}
	
	public static EPISODESTAT getEPISODESTATByORMID(PersistentSession session, int ID) {
		try {
			return (EPISODESTAT) session.get(tr.com.srdc.icardea.hibernate.EPISODESTAT.class, new Integer(ID));
		}
		catch (Exception e) {
			_logger.error("getEPISODESTATByORMID(PersistentSession session, int ID)", e);
			return null;
		}
	}
	
	public static EPISODESTAT loadEPISODESTATByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) {
		try {
			return (EPISODESTAT) session.load(tr.com.srdc.icardea.hibernate.EPISODESTAT.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			_logger.error("loadEPISODESTATByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode)", e);
			return null;
		}
	}
	
	public static EPISODESTAT getEPISODESTATByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) {
		try {
			return (EPISODESTAT) session.get(tr.com.srdc.icardea.hibernate.EPISODESTAT.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			_logger.error("getEPISODESTATByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode)", e);
			return null;
		}
	}
	
	public static EPISODESTAT[] listEPISODESTATByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return listEPISODESTATByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("listEPISODESTATByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static EPISODESTAT[] listEPISODESTATByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return listEPISODESTATByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("listEPISODESTATByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static EPISODESTAT[] listEPISODESTATByQuery(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From tr.com.srdc.icardea.hibernate.EPISODESTAT as EPISODESTAT");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			List list = query.list();
			return (EPISODESTAT[]) list.toArray(new EPISODESTAT[list.size()]);
		}
		catch (Exception e) {
			_logger.error("listEPISODESTATByQuery(PersistentSession session, String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static EPISODESTAT[] listEPISODESTATByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From tr.com.srdc.icardea.hibernate.EPISODESTAT as EPISODESTAT");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("this", lockMode);
			List list = query.list();
			return (EPISODESTAT[]) list.toArray(new EPISODESTAT[list.size()]);
		}
		catch (Exception e) {
			_logger.error("listEPISODESTATByQuery(PersistentSession session, String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static EPISODESTAT loadEPISODESTATByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return loadEPISODESTATByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("loadEPISODESTATByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static EPISODESTAT loadEPISODESTATByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return loadEPISODESTATByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("loadEPISODESTATByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static EPISODESTAT loadEPISODESTATByQuery(PersistentSession session, String condition, String orderBy) {
		EPISODESTAT[] ePISODESTATs = listEPISODESTATByQuery(session, condition, orderBy);
		if (ePISODESTATs != null && ePISODESTATs.length > 0)
			return ePISODESTATs[0];
		else
			return null;
	}
	
	public static EPISODESTAT loadEPISODESTATByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		EPISODESTAT[] ePISODESTATs = listEPISODESTATByQuery(session, condition, orderBy, lockMode);
		if (ePISODESTATs != null && ePISODESTATs.length > 0)
			return ePISODESTATs[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateEPISODESTATByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return iterateEPISODESTATByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("iterateEPISODESTATByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static java.util.Iterator iterateEPISODESTATByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return iterateEPISODESTATByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("iterateEPISODESTATByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static java.util.Iterator iterateEPISODESTATByQuery(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From tr.com.srdc.icardea.hibernate.EPISODESTAT as EPISODESTAT");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			_logger.error("iterateEPISODESTATByQuery(PersistentSession session, String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static java.util.Iterator iterateEPISODESTATByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From tr.com.srdc.icardea.hibernate.EPISODESTAT as EPISODESTAT");
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
			_logger.error("iterateEPISODESTATByQuery(PersistentSession session, String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static EPISODESTAT loadEPISODESTATByCriteria(EPISODESTATCriteria ePISODESTATCriteria) {
		EPISODESTAT[] ePISODESTATs = listEPISODESTATByCriteria(ePISODESTATCriteria);
		if(ePISODESTATs == null || ePISODESTATs.length == 0) {
			return null;
		}
		return ePISODESTATs[0];
	}
	
	public static EPISODESTAT[] listEPISODESTATByCriteria(EPISODESTATCriteria ePISODESTATCriteria) {
		return ePISODESTATCriteria.listEPISODESTAT();
	}
	
	public static EPISODESTAT createEPISODESTAT() {
		return new tr.com.srdc.icardea.hibernate.EPISODESTAT();
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
			if(getsTAT() != null) {
				getsTAT().ePISODESTAT.remove(this);
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
			if(getsTAT() != null) {
				getsTAT().ePISODESTAT.remove(this);
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
		if (key == tr.com.srdc.icardea.hibernate.ORMConstants.KEY_EPISODESTAT_STAT) {
			this.sTAT = (tr.com.srdc.icardea.hibernate.STAT) owner;
		}
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	private int ID;
	
	private tr.com.srdc.icardea.hibernate.STAT sTAT;
	
	private String type;
	
	private String type_induced;
	
	private String vendor_type;
	
	private String recent_count;
	
	private String recent_count_dtm_start;
	
	private String recent_count_dtm_end;
	
	private String total_count;
	
	private String total_count_dtm_start;
	
	private String total_count_dtm_end;
	
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
	
	public void setType(String value) {
		this.type = value;
	}
	
	public String getType() {
		return type;
	}
	
	public void setType_induced(String value) {
		this.type_induced = value;
	}
	
	public String getType_induced() {
		return type_induced;
	}
	
	public void setVendor_type(String value) {
		this.vendor_type = value;
	}
	
	public String getVendor_type() {
		return vendor_type;
	}
	
	public void setRecent_count(String value) {
		this.recent_count = value;
	}
	
	public String getRecent_count() {
		return recent_count;
	}
	
	public void setRecent_count_dtm_start(String value) {
		this.recent_count_dtm_start = value;
	}
	
	public String getRecent_count_dtm_start() {
		return recent_count_dtm_start;
	}
	
	public void setRecent_count_dtm_end(String value) {
		this.recent_count_dtm_end = value;
	}
	
	public String getRecent_count_dtm_end() {
		return recent_count_dtm_end;
	}
	
	public void setTotal_count(String value) {
		this.total_count = value;
	}
	
	public String getTotal_count() {
		return total_count;
	}
	
	public void setTotal_count_dtm_start(String value) {
		this.total_count_dtm_start = value;
	}
	
	public String getTotal_count_dtm_start() {
		return total_count_dtm_start;
	}
	
	public void setTotal_count_dtm_end(String value) {
		this.total_count_dtm_end = value;
	}
	
	public String getTotal_count_dtm_end() {
		return total_count_dtm_end;
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
	
	public void setsTAT(tr.com.srdc.icardea.hibernate.STAT value) {
		if (sTAT != null) {
			sTAT.ePISODESTAT.remove(this);
		}
		if (value != null) {
			value.ePISODESTAT.add(this);
		}
	}
	
	public tr.com.srdc.icardea.hibernate.STAT getsTAT() {
		return sTAT;
	}
	
	/**
	 * This method is for internal use only.
	 */
	private void setORM_sTAT(tr.com.srdc.icardea.hibernate.STAT value) {
		this.sTAT = value;
	}
	
	private tr.com.srdc.icardea.hibernate.STAT getORM_STAT() {
		return sTAT;
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
			sb.append("EPISODESTAT[ ");
			sb.append("ID=").append(getID()).append(" ");
			if (getsTAT() != null)
				sb.append("sTAT.Persist_ID=").append(getsTAT().toString(true)).append(" ");
			else
				sb.append("sTAT=null ");
			sb.append("Type=").append(getType()).append(" ");
			sb.append("Type_induced=").append(getType_induced()).append(" ");
			sb.append("Vendor_type=").append(getVendor_type()).append(" ");
			sb.append("Recent_count=").append(getRecent_count()).append(" ");
			sb.append("Recent_count_dtm_start=").append(getRecent_count_dtm_start()).append(" ");
			sb.append("Recent_count_dtm_end=").append(getRecent_count_dtm_end()).append(" ");
			sb.append("Total_count=").append(getTotal_count()).append(" ");
			sb.append("Total_count_dtm_start=").append(getTotal_count_dtm_start()).append(" ");
			sb.append("Total_count_dtm_end=").append(getTotal_count_dtm_end()).append(" ");
			sb.append("SubID=").append(getSubID()).append(" ");
			sb.append("]");
			return sb.toString();
		}
	}
	
}
