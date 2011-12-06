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

public class SENSINGMSMT {
	private static final org.apache.log4j.Logger _logger = org.apache.log4j.Logger.getLogger(SENSINGMSMT.class);
	public SENSINGMSMT() {
	}
	
	public static SENSINGMSMT loadSENSINGMSMTByORMID(int ID) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return loadSENSINGMSMTByORMID(session, ID);
		}
		catch (Exception e) {
			_logger.error("loadSENSINGMSMTByORMID(int ID)", e);
			return null;
		}
	}
	
	public static SENSINGMSMT getSENSINGMSMTByORMID(int ID) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return getSENSINGMSMTByORMID(session, ID);
		}
		catch (Exception e) {
			_logger.error("getSENSINGMSMTByORMID(int ID)", e);
			return null;
		}
	}
	
	public static SENSINGMSMT loadSENSINGMSMTByORMID(int ID, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return loadSENSINGMSMTByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			_logger.error("loadSENSINGMSMTByORMID(int ID, org.hibernate.LockMode lockMode)", e);
			return null;
		}
	}
	
	public static SENSINGMSMT getSENSINGMSMTByORMID(int ID, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return getSENSINGMSMTByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			_logger.error("getSENSINGMSMTByORMID(int ID, org.hibernate.LockMode lockMode)", e);
			return null;
		}
	}
	
	public static SENSINGMSMT loadSENSINGMSMTByORMID(PersistentSession session, int ID) {
		try {
			return (SENSINGMSMT) session.load(tr.com.srdc.icardea.hibernate.SENSINGMSMT.class, new Integer(ID));
		}
		catch (Exception e) {
			_logger.error("loadSENSINGMSMTByORMID(PersistentSession session, int ID)", e);
			return null;
		}
	}
	
	public static SENSINGMSMT getSENSINGMSMTByORMID(PersistentSession session, int ID) {
		try {
			return (SENSINGMSMT) session.get(tr.com.srdc.icardea.hibernate.SENSINGMSMT.class, new Integer(ID));
		}
		catch (Exception e) {
			_logger.error("getSENSINGMSMTByORMID(PersistentSession session, int ID)", e);
			return null;
		}
	}
	
	public static SENSINGMSMT loadSENSINGMSMTByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) {
		try {
			return (SENSINGMSMT) session.load(tr.com.srdc.icardea.hibernate.SENSINGMSMT.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			_logger.error("loadSENSINGMSMTByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode)", e);
			return null;
		}
	}
	
	public static SENSINGMSMT getSENSINGMSMTByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) {
		try {
			return (SENSINGMSMT) session.get(tr.com.srdc.icardea.hibernate.SENSINGMSMT.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			_logger.error("getSENSINGMSMTByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode)", e);
			return null;
		}
	}
	
	public static SENSINGMSMT[] listSENSINGMSMTByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return listSENSINGMSMTByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("listSENSINGMSMTByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static SENSINGMSMT[] listSENSINGMSMTByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return listSENSINGMSMTByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("listSENSINGMSMTByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static SENSINGMSMT[] listSENSINGMSMTByQuery(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From tr.com.srdc.icardea.hibernate.SENSINGMSMT as SENSINGMSMT");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			List list = query.list();
			return (SENSINGMSMT[]) list.toArray(new SENSINGMSMT[list.size()]);
		}
		catch (Exception e) {
			_logger.error("listSENSINGMSMTByQuery(PersistentSession session, String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static SENSINGMSMT[] listSENSINGMSMTByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From tr.com.srdc.icardea.hibernate.SENSINGMSMT as SENSINGMSMT");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("this", lockMode);
			List list = query.list();
			return (SENSINGMSMT[]) list.toArray(new SENSINGMSMT[list.size()]);
		}
		catch (Exception e) {
			_logger.error("listSENSINGMSMTByQuery(PersistentSession session, String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static SENSINGMSMT loadSENSINGMSMTByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return loadSENSINGMSMTByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("loadSENSINGMSMTByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static SENSINGMSMT loadSENSINGMSMTByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return loadSENSINGMSMTByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("loadSENSINGMSMTByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static SENSINGMSMT loadSENSINGMSMTByQuery(PersistentSession session, String condition, String orderBy) {
		SENSINGMSMT[] sENSINGMSMTs = listSENSINGMSMTByQuery(session, condition, orderBy);
		if (sENSINGMSMTs != null && sENSINGMSMTs.length > 0)
			return sENSINGMSMTs[0];
		else
			return null;
	}
	
	public static SENSINGMSMT loadSENSINGMSMTByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		SENSINGMSMT[] sENSINGMSMTs = listSENSINGMSMTByQuery(session, condition, orderBy, lockMode);
		if (sENSINGMSMTs != null && sENSINGMSMTs.length > 0)
			return sENSINGMSMTs[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateSENSINGMSMTByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return iterateSENSINGMSMTByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("iterateSENSINGMSMTByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static java.util.Iterator iterateSENSINGMSMTByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return iterateSENSINGMSMTByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("iterateSENSINGMSMTByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static java.util.Iterator iterateSENSINGMSMTByQuery(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From tr.com.srdc.icardea.hibernate.SENSINGMSMT as SENSINGMSMT");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			_logger.error("iterateSENSINGMSMTByQuery(PersistentSession session, String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static java.util.Iterator iterateSENSINGMSMTByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From tr.com.srdc.icardea.hibernate.SENSINGMSMT as SENSINGMSMT");
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
			_logger.error("iterateSENSINGMSMTByQuery(PersistentSession session, String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static SENSINGMSMT loadSENSINGMSMTByCriteria(SENSINGMSMTCriteria sENSINGMSMTCriteria) {
		SENSINGMSMT[] sENSINGMSMTs = listSENSINGMSMTByCriteria(sENSINGMSMTCriteria);
		if(sENSINGMSMTs == null || sENSINGMSMTs.length == 0) {
			return null;
		}
		return sENSINGMSMTs[0];
	}
	
	public static SENSINGMSMT[] listSENSINGMSMTByCriteria(SENSINGMSMTCriteria sENSINGMSMTCriteria) {
		return sENSINGMSMTCriteria.listSENSINGMSMT();
	}
	
	public static SENSINGMSMT createSENSINGMSMT() {
		return new tr.com.srdc.icardea.hibernate.SENSINGMSMT();
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
			if(getlEADCHNLMSMT() != null) {
				getlEADCHNLMSMT().setsENSINGMSMT(null);
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
			if(getlEADCHNLMSMT() != null) {
				getlEADCHNLMSMT().setsENSINGMSMT(null);
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
	
	private tr.com.srdc.icardea.hibernate.LEADCHNLMSMT lEADCHNLMSMT;
	
	private String intr_ampl_min;
	
	private String intr_ampl_max;
	
	private String intr_ampl_mean;
	
	private String polarity;
	
	private String intr_ampl;
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setIntr_ampl_min(String value) {
		this.intr_ampl_min = value;
	}
	
	public String getIntr_ampl_min() {
		return intr_ampl_min;
	}
	
	public void setIntr_ampl_max(String value) {
		this.intr_ampl_max = value;
	}
	
	public String getIntr_ampl_max() {
		return intr_ampl_max;
	}
	
	public void setIntr_ampl_mean(String value) {
		this.intr_ampl_mean = value;
	}
	
	public String getIntr_ampl_mean() {
		return intr_ampl_mean;
	}
	
	public void setPolarity(String value) {
		this.polarity = value;
	}
	
	public String getPolarity() {
		return polarity;
	}
	
	public void setIntr_ampl(String value) {
		this.intr_ampl = value;
	}
	
	public String getIntr_ampl() {
		return intr_ampl;
	}
	
	public void setlEADCHNLMSMT(tr.com.srdc.icardea.hibernate.LEADCHNLMSMT value) {
		if (this.lEADCHNLMSMT != value) {
			tr.com.srdc.icardea.hibernate.LEADCHNLMSMT llEADCHNLMSMT = this.lEADCHNLMSMT;
			this.lEADCHNLMSMT = value;
			if (value != null) {
				lEADCHNLMSMT.setsENSINGMSMT(this);
			}
			else {
				llEADCHNLMSMT.setsENSINGMSMT(null);
			}
		}
	}
	
	public tr.com.srdc.icardea.hibernate.LEADCHNLMSMT getlEADCHNLMSMT() {
		return lEADCHNLMSMT;
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
			sb.append("SENSINGMSMT[ ");
			sb.append("ID=").append(getID()).append(" ");
			if (getlEADCHNLMSMT() != null)
				sb.append("lEADCHNLMSMT.Persist_ID=").append(getlEADCHNLMSMT().toString(true)).append(" ");
			else
				sb.append("lEADCHNLMSMT=null ");
			sb.append("Intr_ampl_min=").append(getIntr_ampl_min()).append(" ");
			sb.append("Intr_ampl_max=").append(getIntr_ampl_max()).append(" ");
			sb.append("Intr_ampl_mean=").append(getIntr_ampl_mean()).append(" ");
			sb.append("Polarity=").append(getPolarity()).append(" ");
			sb.append("Intr_ampl=").append(getIntr_ampl()).append(" ");
			sb.append("]");
			return sb.toString();
		}
	}
	
}
