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

public class TACHYTHERAPYSTAT {
	private static final org.apache.log4j.Logger _logger = org.apache.log4j.Logger.getLogger(TACHYTHERAPYSTAT.class);
	public TACHYTHERAPYSTAT() {
	}
	
	public static TACHYTHERAPYSTAT loadTACHYTHERAPYSTATByORMID(int ID) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return loadTACHYTHERAPYSTATByORMID(session, ID);
		}
		catch (Exception e) {
			_logger.error("loadTACHYTHERAPYSTATByORMID(int ID)", e);
			return null;
		}
	}
	
	public static TACHYTHERAPYSTAT getTACHYTHERAPYSTATByORMID(int ID) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return getTACHYTHERAPYSTATByORMID(session, ID);
		}
		catch (Exception e) {
			_logger.error("getTACHYTHERAPYSTATByORMID(int ID)", e);
			return null;
		}
	}
	
	public static TACHYTHERAPYSTAT loadTACHYTHERAPYSTATByORMID(int ID, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return loadTACHYTHERAPYSTATByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			_logger.error("loadTACHYTHERAPYSTATByORMID(int ID, org.hibernate.LockMode lockMode)", e);
			return null;
		}
	}
	
	public static TACHYTHERAPYSTAT getTACHYTHERAPYSTATByORMID(int ID, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return getTACHYTHERAPYSTATByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			_logger.error("getTACHYTHERAPYSTATByORMID(int ID, org.hibernate.LockMode lockMode)", e);
			return null;
		}
	}
	
	public static TACHYTHERAPYSTAT loadTACHYTHERAPYSTATByORMID(PersistentSession session, int ID) {
		try {
			return (TACHYTHERAPYSTAT) session.load(tr.com.srdc.icardea.hibernate.TACHYTHERAPYSTAT.class, new Integer(ID));
		}
		catch (Exception e) {
			_logger.error("loadTACHYTHERAPYSTATByORMID(PersistentSession session, int ID)", e);
			return null;
		}
	}
	
	public static TACHYTHERAPYSTAT getTACHYTHERAPYSTATByORMID(PersistentSession session, int ID) {
		try {
			return (TACHYTHERAPYSTAT) session.get(tr.com.srdc.icardea.hibernate.TACHYTHERAPYSTAT.class, new Integer(ID));
		}
		catch (Exception e) {
			_logger.error("getTACHYTHERAPYSTATByORMID(PersistentSession session, int ID)", e);
			return null;
		}
	}
	
	public static TACHYTHERAPYSTAT loadTACHYTHERAPYSTATByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) {
		try {
			return (TACHYTHERAPYSTAT) session.load(tr.com.srdc.icardea.hibernate.TACHYTHERAPYSTAT.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			_logger.error("loadTACHYTHERAPYSTATByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode)", e);
			return null;
		}
	}
	
	public static TACHYTHERAPYSTAT getTACHYTHERAPYSTATByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) {
		try {
			return (TACHYTHERAPYSTAT) session.get(tr.com.srdc.icardea.hibernate.TACHYTHERAPYSTAT.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			_logger.error("getTACHYTHERAPYSTATByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode)", e);
			return null;
		}
	}
	
	public static TACHYTHERAPYSTAT[] listTACHYTHERAPYSTATByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return listTACHYTHERAPYSTATByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("listTACHYTHERAPYSTATByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static TACHYTHERAPYSTAT[] listTACHYTHERAPYSTATByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return listTACHYTHERAPYSTATByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("listTACHYTHERAPYSTATByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static TACHYTHERAPYSTAT[] listTACHYTHERAPYSTATByQuery(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From tr.com.srdc.icardea.hibernate.TACHYTHERAPYSTAT as TACHYTHERAPYSTAT");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			List list = query.list();
			return (TACHYTHERAPYSTAT[]) list.toArray(new TACHYTHERAPYSTAT[list.size()]);
		}
		catch (Exception e) {
			_logger.error("listTACHYTHERAPYSTATByQuery(PersistentSession session, String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static TACHYTHERAPYSTAT[] listTACHYTHERAPYSTATByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From tr.com.srdc.icardea.hibernate.TACHYTHERAPYSTAT as TACHYTHERAPYSTAT");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("this", lockMode);
			List list = query.list();
			return (TACHYTHERAPYSTAT[]) list.toArray(new TACHYTHERAPYSTAT[list.size()]);
		}
		catch (Exception e) {
			_logger.error("listTACHYTHERAPYSTATByQuery(PersistentSession session, String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static TACHYTHERAPYSTAT loadTACHYTHERAPYSTATByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return loadTACHYTHERAPYSTATByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("loadTACHYTHERAPYSTATByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static TACHYTHERAPYSTAT loadTACHYTHERAPYSTATByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return loadTACHYTHERAPYSTATByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("loadTACHYTHERAPYSTATByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static TACHYTHERAPYSTAT loadTACHYTHERAPYSTATByQuery(PersistentSession session, String condition, String orderBy) {
		TACHYTHERAPYSTAT[] tACHYTHERAPYSTATs = listTACHYTHERAPYSTATByQuery(session, condition, orderBy);
		if (tACHYTHERAPYSTATs != null && tACHYTHERAPYSTATs.length > 0)
			return tACHYTHERAPYSTATs[0];
		else
			return null;
	}
	
	public static TACHYTHERAPYSTAT loadTACHYTHERAPYSTATByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		TACHYTHERAPYSTAT[] tACHYTHERAPYSTATs = listTACHYTHERAPYSTATByQuery(session, condition, orderBy, lockMode);
		if (tACHYTHERAPYSTATs != null && tACHYTHERAPYSTATs.length > 0)
			return tACHYTHERAPYSTATs[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateTACHYTHERAPYSTATByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return iterateTACHYTHERAPYSTATByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("iterateTACHYTHERAPYSTATByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static java.util.Iterator iterateTACHYTHERAPYSTATByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return iterateTACHYTHERAPYSTATByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("iterateTACHYTHERAPYSTATByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static java.util.Iterator iterateTACHYTHERAPYSTATByQuery(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From tr.com.srdc.icardea.hibernate.TACHYTHERAPYSTAT as TACHYTHERAPYSTAT");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			_logger.error("iterateTACHYTHERAPYSTATByQuery(PersistentSession session, String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static java.util.Iterator iterateTACHYTHERAPYSTATByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From tr.com.srdc.icardea.hibernate.TACHYTHERAPYSTAT as TACHYTHERAPYSTAT");
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
			_logger.error("iterateTACHYTHERAPYSTATByQuery(PersistentSession session, String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static TACHYTHERAPYSTAT loadTACHYTHERAPYSTATByCriteria(TACHYTHERAPYSTATCriteria tACHYTHERAPYSTATCriteria) {
		TACHYTHERAPYSTAT[] tACHYTHERAPYSTATs = listTACHYTHERAPYSTATByCriteria(tACHYTHERAPYSTATCriteria);
		if(tACHYTHERAPYSTATs == null || tACHYTHERAPYSTATs.length == 0) {
			return null;
		}
		return tACHYTHERAPYSTATs[0];
	}
	
	public static TACHYTHERAPYSTAT[] listTACHYTHERAPYSTATByCriteria(TACHYTHERAPYSTATCriteria tACHYTHERAPYSTATCriteria) {
		return tACHYTHERAPYSTATCriteria.listTACHYTHERAPYSTAT();
	}
	
	public static TACHYTHERAPYSTAT createTACHYTHERAPYSTAT() {
		return new tr.com.srdc.icardea.hibernate.TACHYTHERAPYSTAT();
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
				getsTAT().settACHYTHERAPYSTAT(null);
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
				getsTAT().settACHYTHERAPYSTAT(null);
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
	
	private String shocks_delivered_recent;
	
	private String shocks_delivered_total;
	
	private String shocks_aborted_recent;
	
	private String shocks_aborted_total;
	
	private String atp_delivered_recent;
	
	private String atp_delivered_total;
	
	private String total_dtm_start;
	
	private String total_dtm_end;
	
	private String recent_dtm_start;
	
	private String recent_dtm_end;
	
	private tr.com.srdc.icardea.hibernate.STAT sTAT;
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setShocks_delivered_recent(String value) {
		this.shocks_delivered_recent = value;
	}
	
	public String getShocks_delivered_recent() {
		return shocks_delivered_recent;
	}
	
	public void setShocks_delivered_total(String value) {
		this.shocks_delivered_total = value;
	}
	
	public String getShocks_delivered_total() {
		return shocks_delivered_total;
	}
	
	public void setShocks_aborted_recent(String value) {
		this.shocks_aborted_recent = value;
	}
	
	public String getShocks_aborted_recent() {
		return shocks_aborted_recent;
	}
	
	public void setShocks_aborted_total(String value) {
		this.shocks_aborted_total = value;
	}
	
	public String getShocks_aborted_total() {
		return shocks_aborted_total;
	}
	
	public void setAtp_delivered_recent(String value) {
		this.atp_delivered_recent = value;
	}
	
	public String getAtp_delivered_recent() {
		return atp_delivered_recent;
	}
	
	public void setAtp_delivered_total(String value) {
		this.atp_delivered_total = value;
	}
	
	public String getAtp_delivered_total() {
		return atp_delivered_total;
	}
	
	public void setTotal_dtm_start(String value) {
		this.total_dtm_start = value;
	}
	
	public String getTotal_dtm_start() {
		return total_dtm_start;
	}
	
	public void setTotal_dtm_end(String value) {
		this.total_dtm_end = value;
	}
	
	public String getTotal_dtm_end() {
		return total_dtm_end;
	}
	
	public void setRecent_dtm_start(String value) {
		this.recent_dtm_start = value;
	}
	
	public String getRecent_dtm_start() {
		return recent_dtm_start;
	}
	
	public void setRecent_dtm_end(String value) {
		this.recent_dtm_end = value;
	}
	
	public String getRecent_dtm_end() {
		return recent_dtm_end;
	}
	
	public void setsTAT(tr.com.srdc.icardea.hibernate.STAT value) {
		if (this.sTAT != value) {
			tr.com.srdc.icardea.hibernate.STAT lsTAT = this.sTAT;
			this.sTAT = value;
			if (value != null) {
				sTAT.settACHYTHERAPYSTAT(this);
			}
			else {
				lsTAT.settACHYTHERAPYSTAT(null);
			}
		}
	}
	
	public tr.com.srdc.icardea.hibernate.STAT getsTAT() {
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
			sb.append("TACHYTHERAPYSTAT[ ");
			sb.append("ID=").append(getID()).append(" ");
			sb.append("Shocks_delivered_recent=").append(getShocks_delivered_recent()).append(" ");
			sb.append("Shocks_delivered_total=").append(getShocks_delivered_total()).append(" ");
			sb.append("Shocks_aborted_recent=").append(getShocks_aborted_recent()).append(" ");
			sb.append("Shocks_aborted_total=").append(getShocks_aborted_total()).append(" ");
			sb.append("Atp_delivered_recent=").append(getAtp_delivered_recent()).append(" ");
			sb.append("Atp_delivered_total=").append(getAtp_delivered_total()).append(" ");
			sb.append("Total_dtm_start=").append(getTotal_dtm_start()).append(" ");
			sb.append("Total_dtm_end=").append(getTotal_dtm_end()).append(" ");
			sb.append("Recent_dtm_start=").append(getRecent_dtm_start()).append(" ");
			sb.append("Recent_dtm_end=").append(getRecent_dtm_end()).append(" ");
			if (getsTAT() != null)
				sb.append("sTAT.Persist_ID=").append(getsTAT().toString(true)).append(" ");
			else
				sb.append("sTAT=null ");
			sb.append("]");
			return sb.toString();
		}
	}
	
}
