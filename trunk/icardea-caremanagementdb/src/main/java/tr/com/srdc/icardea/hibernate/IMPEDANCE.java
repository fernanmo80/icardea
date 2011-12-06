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

public class IMPEDANCE {
	private static final org.apache.log4j.Logger _logger = org.apache.log4j.Logger.getLogger(IMPEDANCE.class);
	public IMPEDANCE() {
	}
	
	public static IMPEDANCE loadIMPEDANCEByORMID(int ID) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return loadIMPEDANCEByORMID(session, ID);
		}
		catch (Exception e) {
			_logger.error("loadIMPEDANCEByORMID(int ID)", e);
			return null;
		}
	}
	
	public static IMPEDANCE getIMPEDANCEByORMID(int ID) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return getIMPEDANCEByORMID(session, ID);
		}
		catch (Exception e) {
			_logger.error("getIMPEDANCEByORMID(int ID)", e);
			return null;
		}
	}
	
	public static IMPEDANCE loadIMPEDANCEByORMID(int ID, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return loadIMPEDANCEByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			_logger.error("loadIMPEDANCEByORMID(int ID, org.hibernate.LockMode lockMode)", e);
			return null;
		}
	}
	
	public static IMPEDANCE getIMPEDANCEByORMID(int ID, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return getIMPEDANCEByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			_logger.error("getIMPEDANCEByORMID(int ID, org.hibernate.LockMode lockMode)", e);
			return null;
		}
	}
	
	public static IMPEDANCE loadIMPEDANCEByORMID(PersistentSession session, int ID) {
		try {
			return (IMPEDANCE) session.load(tr.com.srdc.icardea.hibernate.IMPEDANCE.class, new Integer(ID));
		}
		catch (Exception e) {
			_logger.error("loadIMPEDANCEByORMID(PersistentSession session, int ID)", e);
			return null;
		}
	}
	
	public static IMPEDANCE getIMPEDANCEByORMID(PersistentSession session, int ID) {
		try {
			return (IMPEDANCE) session.get(tr.com.srdc.icardea.hibernate.IMPEDANCE.class, new Integer(ID));
		}
		catch (Exception e) {
			_logger.error("getIMPEDANCEByORMID(PersistentSession session, int ID)", e);
			return null;
		}
	}
	
	public static IMPEDANCE loadIMPEDANCEByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) {
		try {
			return (IMPEDANCE) session.load(tr.com.srdc.icardea.hibernate.IMPEDANCE.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			_logger.error("loadIMPEDANCEByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode)", e);
			return null;
		}
	}
	
	public static IMPEDANCE getIMPEDANCEByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) {
		try {
			return (IMPEDANCE) session.get(tr.com.srdc.icardea.hibernate.IMPEDANCE.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			_logger.error("getIMPEDANCEByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode)", e);
			return null;
		}
	}
	
	public static IMPEDANCE[] listIMPEDANCEByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return listIMPEDANCEByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("listIMPEDANCEByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static IMPEDANCE[] listIMPEDANCEByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return listIMPEDANCEByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("listIMPEDANCEByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static IMPEDANCE[] listIMPEDANCEByQuery(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From tr.com.srdc.icardea.hibernate.IMPEDANCE as IMPEDANCE");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			List list = query.list();
			return (IMPEDANCE[]) list.toArray(new IMPEDANCE[list.size()]);
		}
		catch (Exception e) {
			_logger.error("listIMPEDANCEByQuery(PersistentSession session, String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static IMPEDANCE[] listIMPEDANCEByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From tr.com.srdc.icardea.hibernate.IMPEDANCE as IMPEDANCE");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("this", lockMode);
			List list = query.list();
			return (IMPEDANCE[]) list.toArray(new IMPEDANCE[list.size()]);
		}
		catch (Exception e) {
			_logger.error("listIMPEDANCEByQuery(PersistentSession session, String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static IMPEDANCE loadIMPEDANCEByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return loadIMPEDANCEByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("loadIMPEDANCEByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static IMPEDANCE loadIMPEDANCEByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return loadIMPEDANCEByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("loadIMPEDANCEByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static IMPEDANCE loadIMPEDANCEByQuery(PersistentSession session, String condition, String orderBy) {
		IMPEDANCE[] iMPEDANCEs = listIMPEDANCEByQuery(session, condition, orderBy);
		if (iMPEDANCEs != null && iMPEDANCEs.length > 0)
			return iMPEDANCEs[0];
		else
			return null;
	}
	
	public static IMPEDANCE loadIMPEDANCEByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		IMPEDANCE[] iMPEDANCEs = listIMPEDANCEByQuery(session, condition, orderBy, lockMode);
		if (iMPEDANCEs != null && iMPEDANCEs.length > 0)
			return iMPEDANCEs[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateIMPEDANCEByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return iterateIMPEDANCEByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("iterateIMPEDANCEByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static java.util.Iterator iterateIMPEDANCEByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return iterateIMPEDANCEByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("iterateIMPEDANCEByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static java.util.Iterator iterateIMPEDANCEByQuery(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From tr.com.srdc.icardea.hibernate.IMPEDANCE as IMPEDANCE");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			_logger.error("iterateIMPEDANCEByQuery(PersistentSession session, String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static java.util.Iterator iterateIMPEDANCEByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From tr.com.srdc.icardea.hibernate.IMPEDANCE as IMPEDANCE");
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
			_logger.error("iterateIMPEDANCEByQuery(PersistentSession session, String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static IMPEDANCE loadIMPEDANCEByCriteria(IMPEDANCECriteria iMPEDANCECriteria) {
		IMPEDANCE[] iMPEDANCEs = listIMPEDANCEByCriteria(iMPEDANCECriteria);
		if(iMPEDANCEs == null || iMPEDANCEs.length == 0) {
			return null;
		}
		return iMPEDANCEs[0];
	}
	
	public static IMPEDANCE[] listIMPEDANCEByCriteria(IMPEDANCECriteria iMPEDANCECriteria) {
		return iMPEDANCECriteria.listIMPEDANCE();
	}
	
	public static IMPEDANCE createIMPEDANCE() {
		return new tr.com.srdc.icardea.hibernate.IMPEDANCE();
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
				getlEADCHNLMSMT().setiMPEDANCE(null);
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
				getlEADCHNLMSMT().setiMPEDANCE(null);
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
	
	private String value;
	
	private String polarity;
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setValue(String value) {
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}
	
	public void setPolarity(String value) {
		this.polarity = value;
	}
	
	public String getPolarity() {
		return polarity;
	}
	
	public void setlEADCHNLMSMT(tr.com.srdc.icardea.hibernate.LEADCHNLMSMT value) {
		if (this.lEADCHNLMSMT != value) {
			tr.com.srdc.icardea.hibernate.LEADCHNLMSMT llEADCHNLMSMT = this.lEADCHNLMSMT;
			this.lEADCHNLMSMT = value;
			if (value != null) {
				lEADCHNLMSMT.setiMPEDANCE(this);
			}
			else {
				llEADCHNLMSMT.setiMPEDANCE(null);
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
			sb.append("IMPEDANCE[ ");
			sb.append("ID=").append(getID()).append(" ");
			if (getlEADCHNLMSMT() != null)
				sb.append("lEADCHNLMSMT.Persist_ID=").append(getlEADCHNLMSMT().toString(true)).append(" ");
			else
				sb.append("lEADCHNLMSMT=null ");
			sb.append("Value=").append(getValue()).append(" ");
			sb.append("Polarity=").append(getPolarity()).append(" ");
			sb.append("]");
			return sb.toString();
		}
	}
	
}
