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

public class AT {
	private static final org.apache.log4j.Logger _logger = org.apache.log4j.Logger.getLogger(AT.class);
	public AT() {
	}
	
	public static AT loadATByORMID(int ID) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return loadATByORMID(session, ID);
		}
		catch (Exception e) {
			_logger.error("loadATByORMID(int ID)", e);
			return null;
		}
	}
	
	public static AT getATByORMID(int ID) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return getATByORMID(session, ID);
		}
		catch (Exception e) {
			_logger.error("getATByORMID(int ID)", e);
			return null;
		}
	}
	
	public static AT loadATByORMID(int ID, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return loadATByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			_logger.error("loadATByORMID(int ID, org.hibernate.LockMode lockMode)", e);
			return null;
		}
	}
	
	public static AT getATByORMID(int ID, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return getATByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			_logger.error("getATByORMID(int ID, org.hibernate.LockMode lockMode)", e);
			return null;
		}
	}
	
	public static AT loadATByORMID(PersistentSession session, int ID) {
		try {
			return (AT) session.load(tr.com.srdc.icardea.hibernate.AT.class, new Integer(ID));
		}
		catch (Exception e) {
			_logger.error("loadATByORMID(PersistentSession session, int ID)", e);
			return null;
		}
	}
	
	public static AT getATByORMID(PersistentSession session, int ID) {
		try {
			return (AT) session.get(tr.com.srdc.icardea.hibernate.AT.class, new Integer(ID));
		}
		catch (Exception e) {
			_logger.error("getATByORMID(PersistentSession session, int ID)", e);
			return null;
		}
	}
	
	public static AT loadATByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) {
		try {
			return (AT) session.load(tr.com.srdc.icardea.hibernate.AT.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			_logger.error("loadATByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode)", e);
			return null;
		}
	}
	
	public static AT getATByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) {
		try {
			return (AT) session.get(tr.com.srdc.icardea.hibernate.AT.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			_logger.error("getATByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode)", e);
			return null;
		}
	}
	
	public static AT[] listATByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return listATByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("listATByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static AT[] listATByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return listATByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("listATByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static AT[] listATByQuery(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From tr.com.srdc.icardea.hibernate.AT as AT");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			List list = query.list();
			return (AT[]) list.toArray(new AT[list.size()]);
		}
		catch (Exception e) {
			_logger.error("listATByQuery(PersistentSession session, String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static AT[] listATByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From tr.com.srdc.icardea.hibernate.AT as AT");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("this", lockMode);
			List list = query.list();
			return (AT[]) list.toArray(new AT[list.size()]);
		}
		catch (Exception e) {
			_logger.error("listATByQuery(PersistentSession session, String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static AT loadATByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return loadATByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("loadATByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static AT loadATByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return loadATByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("loadATByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static AT loadATByQuery(PersistentSession session, String condition, String orderBy) {
		AT[] aTs = listATByQuery(session, condition, orderBy);
		if (aTs != null && aTs.length > 0)
			return aTs[0];
		else
			return null;
	}
	
	public static AT loadATByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		AT[] aTs = listATByQuery(session, condition, orderBy, lockMode);
		if (aTs != null && aTs.length > 0)
			return aTs[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateATByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return iterateATByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("iterateATByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static java.util.Iterator iterateATByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return iterateATByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("iterateATByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static java.util.Iterator iterateATByQuery(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From tr.com.srdc.icardea.hibernate.AT as AT");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			_logger.error("iterateATByQuery(PersistentSession session, String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static java.util.Iterator iterateATByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From tr.com.srdc.icardea.hibernate.AT as AT");
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
			_logger.error("iterateATByQuery(PersistentSession session, String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static AT loadATByCriteria(ATCriteria aTCriteria) {
		AT[] aTs = listATByCriteria(aTCriteria);
		if(aTs == null || aTs.length == 0) {
			return null;
		}
		return aTs[0];
	}
	
	public static AT[] listATByCriteria(ATCriteria aTCriteria) {
		return aTCriteria.listAT();
	}
	
	public static AT createAT() {
		return new tr.com.srdc.icardea.hibernate.AT();
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
				getsTAT().setaT(null);
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
				getsTAT().setaT(null);
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
	
	private tr.com.srdc.icardea.hibernate.STAT sTAT;
	
	private String dtm_start;
	
	private String dtm_end;
	
	private String mode_sw_max_duration;
	
	private String burden_percent;
	
	private String mode_sw_percent_time;
	
	private String mode_sw_percent_time_per_day;
	
	private String mode_sw_count;
	
	private String mode_sw_count_per_day;
	
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
	
	public void setMode_sw_max_duration(String value) {
		this.mode_sw_max_duration = value;
	}
	
	public String getMode_sw_max_duration() {
		return mode_sw_max_duration;
	}
	
	public void setBurden_percent(String value) {
		this.burden_percent = value;
	}
	
	public String getBurden_percent() {
		return burden_percent;
	}
	
	public void setMode_sw_percent_time(String value) {
		this.mode_sw_percent_time = value;
	}
	
	public String getMode_sw_percent_time() {
		return mode_sw_percent_time;
	}
	
	public void setMode_sw_percent_time_per_day(String value) {
		this.mode_sw_percent_time_per_day = value;
	}
	
	public String getMode_sw_percent_time_per_day() {
		return mode_sw_percent_time_per_day;
	}
	
	public void setMode_sw_count(String value) {
		this.mode_sw_count = value;
	}
	
	public String getMode_sw_count() {
		return mode_sw_count;
	}
	
	public void setMode_sw_count_per_day(String value) {
		this.mode_sw_count_per_day = value;
	}
	
	public String getMode_sw_count_per_day() {
		return mode_sw_count_per_day;
	}
	
	public void setsTAT(tr.com.srdc.icardea.hibernate.STAT value) {
		if (this.sTAT != value) {
			tr.com.srdc.icardea.hibernate.STAT lsTAT = this.sTAT;
			this.sTAT = value;
			if (value != null) {
				sTAT.setaT(this);
			}
			else {
				lsTAT.setaT(null);
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
			sb.append("AT[ ");
			sb.append("ID=").append(getID()).append(" ");
			if (getsTAT() != null)
				sb.append("sTAT.Persist_ID=").append(getsTAT().toString(true)).append(" ");
			else
				sb.append("sTAT=null ");
			sb.append("Dtm_start=").append(getDtm_start()).append(" ");
			sb.append("Dtm_end=").append(getDtm_end()).append(" ");
			sb.append("Mode_sw_max_duration=").append(getMode_sw_max_duration()).append(" ");
			sb.append("Burden_percent=").append(getBurden_percent()).append(" ");
			sb.append("Mode_sw_percent_time=").append(getMode_sw_percent_time()).append(" ");
			sb.append("Mode_sw_percent_time_per_day=").append(getMode_sw_percent_time_per_day()).append(" ");
			sb.append("Mode_sw_count=").append(getMode_sw_count()).append(" ");
			sb.append("Mode_sw_count_per_day=").append(getMode_sw_count_per_day()).append(" ");
			sb.append("]");
			return sb.toString();
		}
	}
	
}
