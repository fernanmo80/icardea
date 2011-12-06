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

public class BRADYSTAT {
	private static final org.apache.log4j.Logger _logger = org.apache.log4j.Logger.getLogger(BRADYSTAT.class);
	public BRADYSTAT() {
	}
	
	public static BRADYSTAT loadBRADYSTATByORMID(int ID) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return loadBRADYSTATByORMID(session, ID);
		}
		catch (Exception e) {
			_logger.error("loadBRADYSTATByORMID(int ID)", e);
			return null;
		}
	}
	
	public static BRADYSTAT getBRADYSTATByORMID(int ID) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return getBRADYSTATByORMID(session, ID);
		}
		catch (Exception e) {
			_logger.error("getBRADYSTATByORMID(int ID)", e);
			return null;
		}
	}
	
	public static BRADYSTAT loadBRADYSTATByORMID(int ID, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return loadBRADYSTATByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			_logger.error("loadBRADYSTATByORMID(int ID, org.hibernate.LockMode lockMode)", e);
			return null;
		}
	}
	
	public static BRADYSTAT getBRADYSTATByORMID(int ID, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return getBRADYSTATByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			_logger.error("getBRADYSTATByORMID(int ID, org.hibernate.LockMode lockMode)", e);
			return null;
		}
	}
	
	public static BRADYSTAT loadBRADYSTATByORMID(PersistentSession session, int ID) {
		try {
			return (BRADYSTAT) session.load(tr.com.srdc.icardea.hibernate.BRADYSTAT.class, new Integer(ID));
		}
		catch (Exception e) {
			_logger.error("loadBRADYSTATByORMID(PersistentSession session, int ID)", e);
			return null;
		}
	}
	
	public static BRADYSTAT getBRADYSTATByORMID(PersistentSession session, int ID) {
		try {
			return (BRADYSTAT) session.get(tr.com.srdc.icardea.hibernate.BRADYSTAT.class, new Integer(ID));
		}
		catch (Exception e) {
			_logger.error("getBRADYSTATByORMID(PersistentSession session, int ID)", e);
			return null;
		}
	}
	
	public static BRADYSTAT loadBRADYSTATByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) {
		try {
			return (BRADYSTAT) session.load(tr.com.srdc.icardea.hibernate.BRADYSTAT.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			_logger.error("loadBRADYSTATByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode)", e);
			return null;
		}
	}
	
	public static BRADYSTAT getBRADYSTATByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) {
		try {
			return (BRADYSTAT) session.get(tr.com.srdc.icardea.hibernate.BRADYSTAT.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			_logger.error("getBRADYSTATByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode)", e);
			return null;
		}
	}
	
	public static BRADYSTAT[] listBRADYSTATByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return listBRADYSTATByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("listBRADYSTATByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static BRADYSTAT[] listBRADYSTATByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return listBRADYSTATByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("listBRADYSTATByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static BRADYSTAT[] listBRADYSTATByQuery(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From tr.com.srdc.icardea.hibernate.BRADYSTAT as BRADYSTAT");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			List list = query.list();
			return (BRADYSTAT[]) list.toArray(new BRADYSTAT[list.size()]);
		}
		catch (Exception e) {
			_logger.error("listBRADYSTATByQuery(PersistentSession session, String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static BRADYSTAT[] listBRADYSTATByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From tr.com.srdc.icardea.hibernate.BRADYSTAT as BRADYSTAT");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("this", lockMode);
			List list = query.list();
			return (BRADYSTAT[]) list.toArray(new BRADYSTAT[list.size()]);
		}
		catch (Exception e) {
			_logger.error("listBRADYSTATByQuery(PersistentSession session, String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static BRADYSTAT loadBRADYSTATByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return loadBRADYSTATByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("loadBRADYSTATByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static BRADYSTAT loadBRADYSTATByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return loadBRADYSTATByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("loadBRADYSTATByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static BRADYSTAT loadBRADYSTATByQuery(PersistentSession session, String condition, String orderBy) {
		BRADYSTAT[] bRADYSTATs = listBRADYSTATByQuery(session, condition, orderBy);
		if (bRADYSTATs != null && bRADYSTATs.length > 0)
			return bRADYSTATs[0];
		else
			return null;
	}
	
	public static BRADYSTAT loadBRADYSTATByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		BRADYSTAT[] bRADYSTATs = listBRADYSTATByQuery(session, condition, orderBy, lockMode);
		if (bRADYSTATs != null && bRADYSTATs.length > 0)
			return bRADYSTATs[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateBRADYSTATByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return iterateBRADYSTATByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("iterateBRADYSTATByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static java.util.Iterator iterateBRADYSTATByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return iterateBRADYSTATByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("iterateBRADYSTATByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static java.util.Iterator iterateBRADYSTATByQuery(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From tr.com.srdc.icardea.hibernate.BRADYSTAT as BRADYSTAT");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			_logger.error("iterateBRADYSTATByQuery(PersistentSession session, String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static java.util.Iterator iterateBRADYSTATByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From tr.com.srdc.icardea.hibernate.BRADYSTAT as BRADYSTAT");
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
			_logger.error("iterateBRADYSTATByQuery(PersistentSession session, String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static BRADYSTAT loadBRADYSTATByCriteria(BRADYSTATCriteria bRADYSTATCriteria) {
		BRADYSTAT[] bRADYSTATs = listBRADYSTATByCriteria(bRADYSTATCriteria);
		if(bRADYSTATs == null || bRADYSTATs.length == 0) {
			return null;
		}
		return bRADYSTATs[0];
	}
	
	public static BRADYSTAT[] listBRADYSTATByCriteria(BRADYSTATCriteria bRADYSTATCriteria) {
		return bRADYSTATCriteria.listBRADYSTAT();
	}
	
	public static BRADYSTAT createBRADYSTAT() {
		return new tr.com.srdc.icardea.hibernate.BRADYSTAT();
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
				getsTAT().setbRADYSTAT(null);
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
				getsTAT().setbRADYSTAT(null);
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
	
	private String dtm_start;
	
	private String dtm_end;
	
	private String ra_percent_paced;
	
	private String rv_percent_paced;
	
	private String ap_vp_percent;
	
	private String as_vp_percent;
	
	private String ap_vs_percent;
	
	private String as_vs_percent;
	
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
	
	public void setRa_percent_paced(String value) {
		this.ra_percent_paced = value;
	}
	
	public String getRa_percent_paced() {
		return ra_percent_paced;
	}
	
	public void setRv_percent_paced(String value) {
		this.rv_percent_paced = value;
	}
	
	public String getRv_percent_paced() {
		return rv_percent_paced;
	}
	
	public void setAp_vp_percent(String value) {
		this.ap_vp_percent = value;
	}
	
	public String getAp_vp_percent() {
		return ap_vp_percent;
	}
	
	public void setAs_vp_percent(String value) {
		this.as_vp_percent = value;
	}
	
	public String getAs_vp_percent() {
		return as_vp_percent;
	}
	
	public void setAp_vs_percent(String value) {
		this.ap_vs_percent = value;
	}
	
	public String getAp_vs_percent() {
		return ap_vs_percent;
	}
	
	public void setAs_vs_percent(String value) {
		this.as_vs_percent = value;
	}
	
	public String getAs_vs_percent() {
		return as_vs_percent;
	}
	
	public void setsTAT(tr.com.srdc.icardea.hibernate.STAT value) {
		if (this.sTAT != value) {
			tr.com.srdc.icardea.hibernate.STAT lsTAT = this.sTAT;
			this.sTAT = value;
			if (value != null) {
				sTAT.setbRADYSTAT(this);
			}
			else {
				lsTAT.setbRADYSTAT(null);
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
			sb.append("BRADYSTAT[ ");
			sb.append("ID=").append(getID()).append(" ");
			sb.append("Dtm_start=").append(getDtm_start()).append(" ");
			sb.append("Dtm_end=").append(getDtm_end()).append(" ");
			sb.append("Ra_percent_paced=").append(getRa_percent_paced()).append(" ");
			sb.append("Rv_percent_paced=").append(getRv_percent_paced()).append(" ");
			sb.append("Ap_vp_percent=").append(getAp_vp_percent()).append(" ");
			sb.append("As_vp_percent=").append(getAs_vp_percent()).append(" ");
			sb.append("Ap_vs_percent=").append(getAp_vs_percent()).append(" ");
			sb.append("As_vs_percent=").append(getAs_vs_percent()).append(" ");
			if (getsTAT() != null)
				sb.append("sTAT.Persist_ID=").append(getsTAT().toString(true)).append(" ");
			else
				sb.append("sTAT=null ");
			sb.append("]");
			return sb.toString();
		}
	}
	
}
