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

public class SENSINGSET {
	private static final org.apache.log4j.Logger _logger = org.apache.log4j.Logger.getLogger(SENSINGSET.class);
	public SENSINGSET() {
	}
	
	public static SENSINGSET loadSENSINGSETByORMID(int ID) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return loadSENSINGSETByORMID(session, ID);
		}
		catch (Exception e) {
			_logger.error("loadSENSINGSETByORMID(int ID)", e);
			return null;
		}
	}
	
	public static SENSINGSET getSENSINGSETByORMID(int ID) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return getSENSINGSETByORMID(session, ID);
		}
		catch (Exception e) {
			_logger.error("getSENSINGSETByORMID(int ID)", e);
			return null;
		}
	}
	
	public static SENSINGSET loadSENSINGSETByORMID(int ID, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return loadSENSINGSETByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			_logger.error("loadSENSINGSETByORMID(int ID, org.hibernate.LockMode lockMode)", e);
			return null;
		}
	}
	
	public static SENSINGSET getSENSINGSETByORMID(int ID, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return getSENSINGSETByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			_logger.error("getSENSINGSETByORMID(int ID, org.hibernate.LockMode lockMode)", e);
			return null;
		}
	}
	
	public static SENSINGSET loadSENSINGSETByORMID(PersistentSession session, int ID) {
		try {
			return (SENSINGSET) session.load(tr.com.srdc.icardea.hibernate.SENSINGSET.class, new Integer(ID));
		}
		catch (Exception e) {
			_logger.error("loadSENSINGSETByORMID(PersistentSession session, int ID)", e);
			return null;
		}
	}
	
	public static SENSINGSET getSENSINGSETByORMID(PersistentSession session, int ID) {
		try {
			return (SENSINGSET) session.get(tr.com.srdc.icardea.hibernate.SENSINGSET.class, new Integer(ID));
		}
		catch (Exception e) {
			_logger.error("getSENSINGSETByORMID(PersistentSession session, int ID)", e);
			return null;
		}
	}
	
	public static SENSINGSET loadSENSINGSETByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) {
		try {
			return (SENSINGSET) session.load(tr.com.srdc.icardea.hibernate.SENSINGSET.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			_logger.error("loadSENSINGSETByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode)", e);
			return null;
		}
	}
	
	public static SENSINGSET getSENSINGSETByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) {
		try {
			return (SENSINGSET) session.get(tr.com.srdc.icardea.hibernate.SENSINGSET.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			_logger.error("getSENSINGSETByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode)", e);
			return null;
		}
	}
	
	public static SENSINGSET[] listSENSINGSETByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return listSENSINGSETByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("listSENSINGSETByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static SENSINGSET[] listSENSINGSETByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return listSENSINGSETByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("listSENSINGSETByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static SENSINGSET[] listSENSINGSETByQuery(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From tr.com.srdc.icardea.hibernate.SENSINGSET as SENSINGSET");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			List list = query.list();
			return (SENSINGSET[]) list.toArray(new SENSINGSET[list.size()]);
		}
		catch (Exception e) {
			_logger.error("listSENSINGSETByQuery(PersistentSession session, String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static SENSINGSET[] listSENSINGSETByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From tr.com.srdc.icardea.hibernate.SENSINGSET as SENSINGSET");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("this", lockMode);
			List list = query.list();
			return (SENSINGSET[]) list.toArray(new SENSINGSET[list.size()]);
		}
		catch (Exception e) {
			_logger.error("listSENSINGSETByQuery(PersistentSession session, String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static SENSINGSET loadSENSINGSETByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return loadSENSINGSETByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("loadSENSINGSETByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static SENSINGSET loadSENSINGSETByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return loadSENSINGSETByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("loadSENSINGSETByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static SENSINGSET loadSENSINGSETByQuery(PersistentSession session, String condition, String orderBy) {
		SENSINGSET[] sENSINGSETs = listSENSINGSETByQuery(session, condition, orderBy);
		if (sENSINGSETs != null && sENSINGSETs.length > 0)
			return sENSINGSETs[0];
		else
			return null;
	}
	
	public static SENSINGSET loadSENSINGSETByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		SENSINGSET[] sENSINGSETs = listSENSINGSETByQuery(session, condition, orderBy, lockMode);
		if (sENSINGSETs != null && sENSINGSETs.length > 0)
			return sENSINGSETs[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateSENSINGSETByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return iterateSENSINGSETByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("iterateSENSINGSETByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static java.util.Iterator iterateSENSINGSETByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return iterateSENSINGSETByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("iterateSENSINGSETByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static java.util.Iterator iterateSENSINGSETByQuery(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From tr.com.srdc.icardea.hibernate.SENSINGSET as SENSINGSET");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			_logger.error("iterateSENSINGSETByQuery(PersistentSession session, String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static java.util.Iterator iterateSENSINGSETByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From tr.com.srdc.icardea.hibernate.SENSINGSET as SENSINGSET");
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
			_logger.error("iterateSENSINGSETByQuery(PersistentSession session, String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static SENSINGSET loadSENSINGSETByCriteria(SENSINGSETCriteria sENSINGSETCriteria) {
		SENSINGSET[] sENSINGSETs = listSENSINGSETByCriteria(sENSINGSETCriteria);
		if(sENSINGSETs == null || sENSINGSETs.length == 0) {
			return null;
		}
		return sENSINGSETs[0];
	}
	
	public static SENSINGSET[] listSENSINGSETByCriteria(SENSINGSETCriteria sENSINGSETCriteria) {
		return sENSINGSETCriteria.listSENSINGSET();
	}
	
	public static SENSINGSET createSENSINGSET() {
		return new tr.com.srdc.icardea.hibernate.SENSINGSET();
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
			if(getlEADCHNLSET() != null) {
				getlEADCHNLSET().setsENSINGSET(null);
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
			if(getlEADCHNLSET() != null) {
				getlEADCHNLSET().setsENSINGSET(null);
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
	
	private String sensitivity;
	
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
	
	private String adaptation_mode;
	
	private tr.com.srdc.icardea.hibernate.LEADCHNLSET lEADCHNLSET;
	
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
	
	public void setSensitivity(String value) {
		this.sensitivity = value;
	}
	
	public String getSensitivity() {
		return sensitivity;
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
	
	public void setAdaptation_mode(String value) {
		this.adaptation_mode = value;
	}
	
	public String getAdaptation_mode() {
		return adaptation_mode;
	}
	
	public void setPolarity(String value) {
		this.polarity = value;
	}
	
	public String getPolarity() {
		return polarity;
	}
	
	public void setlEADCHNLSET(tr.com.srdc.icardea.hibernate.LEADCHNLSET value) {
		if (this.lEADCHNLSET != value) {
			tr.com.srdc.icardea.hibernate.LEADCHNLSET llEADCHNLSET = this.lEADCHNLSET;
			this.lEADCHNLSET = value;
			if (value != null) {
				lEADCHNLSET.setsENSINGSET(this);
			}
			else {
				llEADCHNLSET.setsENSINGSET(null);
			}
		}
	}
	
	public tr.com.srdc.icardea.hibernate.LEADCHNLSET getlEADCHNLSET() {
		return lEADCHNLSET;
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
			sb.append("SENSINGSET[ ");
			sb.append("ID=").append(getID()).append(" ");
			sb.append("Sensitivity=").append(getSensitivity()).append(" ");
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
			sb.append("Adaptation_mode=").append(getAdaptation_mode()).append(" ");
			if (getlEADCHNLSET() != null)
				sb.append("lEADCHNLSET.Persist_ID=").append(getlEADCHNLSET().toString(true)).append(" ");
			else
				sb.append("lEADCHNLSET=null ");
			sb.append("Polarity=").append(getPolarity()).append(" ");
			sb.append("]");
			return sb.toString();
		}
	}
	
}
