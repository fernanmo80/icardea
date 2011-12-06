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

public class PACINGTHRESHOLD {
	private static final org.apache.log4j.Logger _logger = org.apache.log4j.Logger.getLogger(PACINGTHRESHOLD.class);
	public PACINGTHRESHOLD() {
	}
	
	public static PACINGTHRESHOLD loadPACINGTHRESHOLDByORMID(int ID) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return loadPACINGTHRESHOLDByORMID(session, ID);
		}
		catch (Exception e) {
			_logger.error("loadPACINGTHRESHOLDByORMID(int ID)", e);
			return null;
		}
	}
	
	public static PACINGTHRESHOLD getPACINGTHRESHOLDByORMID(int ID) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return getPACINGTHRESHOLDByORMID(session, ID);
		}
		catch (Exception e) {
			_logger.error("getPACINGTHRESHOLDByORMID(int ID)", e);
			return null;
		}
	}
	
	public static PACINGTHRESHOLD loadPACINGTHRESHOLDByORMID(int ID, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return loadPACINGTHRESHOLDByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			_logger.error("loadPACINGTHRESHOLDByORMID(int ID, org.hibernate.LockMode lockMode)", e);
			return null;
		}
	}
	
	public static PACINGTHRESHOLD getPACINGTHRESHOLDByORMID(int ID, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return getPACINGTHRESHOLDByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			_logger.error("getPACINGTHRESHOLDByORMID(int ID, org.hibernate.LockMode lockMode)", e);
			return null;
		}
	}
	
	public static PACINGTHRESHOLD loadPACINGTHRESHOLDByORMID(PersistentSession session, int ID) {
		try {
			return (PACINGTHRESHOLD) session.load(tr.com.srdc.icardea.hibernate.PACINGTHRESHOLD.class, new Integer(ID));
		}
		catch (Exception e) {
			_logger.error("loadPACINGTHRESHOLDByORMID(PersistentSession session, int ID)", e);
			return null;
		}
	}
	
	public static PACINGTHRESHOLD getPACINGTHRESHOLDByORMID(PersistentSession session, int ID) {
		try {
			return (PACINGTHRESHOLD) session.get(tr.com.srdc.icardea.hibernate.PACINGTHRESHOLD.class, new Integer(ID));
		}
		catch (Exception e) {
			_logger.error("getPACINGTHRESHOLDByORMID(PersistentSession session, int ID)", e);
			return null;
		}
	}
	
	public static PACINGTHRESHOLD loadPACINGTHRESHOLDByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) {
		try {
			return (PACINGTHRESHOLD) session.load(tr.com.srdc.icardea.hibernate.PACINGTHRESHOLD.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			_logger.error("loadPACINGTHRESHOLDByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode)", e);
			return null;
		}
	}
	
	public static PACINGTHRESHOLD getPACINGTHRESHOLDByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) {
		try {
			return (PACINGTHRESHOLD) session.get(tr.com.srdc.icardea.hibernate.PACINGTHRESHOLD.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			_logger.error("getPACINGTHRESHOLDByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode)", e);
			return null;
		}
	}
	
	public static PACINGTHRESHOLD[] listPACINGTHRESHOLDByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return listPACINGTHRESHOLDByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("listPACINGTHRESHOLDByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static PACINGTHRESHOLD[] listPACINGTHRESHOLDByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return listPACINGTHRESHOLDByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("listPACINGTHRESHOLDByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static PACINGTHRESHOLD[] listPACINGTHRESHOLDByQuery(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From tr.com.srdc.icardea.hibernate.PACINGTHRESHOLD as PACINGTHRESHOLD");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			List list = query.list();
			return (PACINGTHRESHOLD[]) list.toArray(new PACINGTHRESHOLD[list.size()]);
		}
		catch (Exception e) {
			_logger.error("listPACINGTHRESHOLDByQuery(PersistentSession session, String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static PACINGTHRESHOLD[] listPACINGTHRESHOLDByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From tr.com.srdc.icardea.hibernate.PACINGTHRESHOLD as PACINGTHRESHOLD");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("this", lockMode);
			List list = query.list();
			return (PACINGTHRESHOLD[]) list.toArray(new PACINGTHRESHOLD[list.size()]);
		}
		catch (Exception e) {
			_logger.error("listPACINGTHRESHOLDByQuery(PersistentSession session, String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static PACINGTHRESHOLD loadPACINGTHRESHOLDByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return loadPACINGTHRESHOLDByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("loadPACINGTHRESHOLDByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static PACINGTHRESHOLD loadPACINGTHRESHOLDByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return loadPACINGTHRESHOLDByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("loadPACINGTHRESHOLDByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static PACINGTHRESHOLD loadPACINGTHRESHOLDByQuery(PersistentSession session, String condition, String orderBy) {
		PACINGTHRESHOLD[] pACINGTHRESHOLDs = listPACINGTHRESHOLDByQuery(session, condition, orderBy);
		if (pACINGTHRESHOLDs != null && pACINGTHRESHOLDs.length > 0)
			return pACINGTHRESHOLDs[0];
		else
			return null;
	}
	
	public static PACINGTHRESHOLD loadPACINGTHRESHOLDByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		PACINGTHRESHOLD[] pACINGTHRESHOLDs = listPACINGTHRESHOLDByQuery(session, condition, orderBy, lockMode);
		if (pACINGTHRESHOLDs != null && pACINGTHRESHOLDs.length > 0)
			return pACINGTHRESHOLDs[0];
		else
			return null;
	}
	
	public static java.util.Iterator iteratePACINGTHRESHOLDByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return iteratePACINGTHRESHOLDByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("iteratePACINGTHRESHOLDByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static java.util.Iterator iteratePACINGTHRESHOLDByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return iteratePACINGTHRESHOLDByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("iteratePACINGTHRESHOLDByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static java.util.Iterator iteratePACINGTHRESHOLDByQuery(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From tr.com.srdc.icardea.hibernate.PACINGTHRESHOLD as PACINGTHRESHOLD");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			_logger.error("iteratePACINGTHRESHOLDByQuery(PersistentSession session, String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static java.util.Iterator iteratePACINGTHRESHOLDByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From tr.com.srdc.icardea.hibernate.PACINGTHRESHOLD as PACINGTHRESHOLD");
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
			_logger.error("iteratePACINGTHRESHOLDByQuery(PersistentSession session, String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static PACINGTHRESHOLD loadPACINGTHRESHOLDByCriteria(PACINGTHRESHOLDCriteria pACINGTHRESHOLDCriteria) {
		PACINGTHRESHOLD[] pACINGTHRESHOLDs = listPACINGTHRESHOLDByCriteria(pACINGTHRESHOLDCriteria);
		if(pACINGTHRESHOLDs == null || pACINGTHRESHOLDs.length == 0) {
			return null;
		}
		return pACINGTHRESHOLDs[0];
	}
	
	public static PACINGTHRESHOLD[] listPACINGTHRESHOLDByCriteria(PACINGTHRESHOLDCriteria pACINGTHRESHOLDCriteria) {
		return pACINGTHRESHOLDCriteria.listPACINGTHRESHOLD();
	}
	
	public static PACINGTHRESHOLD createPACINGTHRESHOLD() {
		return new tr.com.srdc.icardea.hibernate.PACINGTHRESHOLD();
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
				getlEADCHNLMSMT().setpACINGTHRESHOLD(null);
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
				getlEADCHNLMSMT().setpACINGTHRESHOLD(null);
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
	
	private String amplitude;
	
	private String pulsewidth;
	
	private String measurement_method;
	
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
	
	public void setAmplitude(String value) {
		this.amplitude = value;
	}
	
	public String getAmplitude() {
		return amplitude;
	}
	
	public void setPulsewidth(String value) {
		this.pulsewidth = value;
	}
	
	public String getPulsewidth() {
		return pulsewidth;
	}
	
	public void setMeasurement_method(String value) {
		this.measurement_method = value;
	}
	
	public String getMeasurement_method() {
		return measurement_method;
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
				lEADCHNLMSMT.setpACINGTHRESHOLD(this);
			}
			else {
				llEADCHNLMSMT.setpACINGTHRESHOLD(null);
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
			sb.append("PACINGTHRESHOLD[ ");
			sb.append("ID=").append(getID()).append(" ");
			if (getlEADCHNLMSMT() != null)
				sb.append("lEADCHNLMSMT.Persist_ID=").append(getlEADCHNLMSMT().toString(true)).append(" ");
			else
				sb.append("lEADCHNLMSMT=null ");
			sb.append("Amplitude=").append(getAmplitude()).append(" ");
			sb.append("Pulsewidth=").append(getPulsewidth()).append(" ");
			sb.append("Measurement_method=").append(getMeasurement_method()).append(" ");
			sb.append("Polarity=").append(getPolarity()).append(" ");
			sb.append("]");
			return sb.toString();
		}
	}
	
}
