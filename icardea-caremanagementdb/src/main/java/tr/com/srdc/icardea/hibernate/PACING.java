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

public class PACING {
	private static final org.apache.log4j.Logger _logger = org.apache.log4j.Logger.getLogger(PACING.class);
	public PACING() {
	}
	
	public static PACING loadPACINGByORMID(int ID) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return loadPACINGByORMID(session, ID);
		}
		catch (Exception e) {
			_logger.error("loadPACINGByORMID(int ID)", e);
			return null;
		}
	}
	
	public static PACING getPACINGByORMID(int ID) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return getPACINGByORMID(session, ID);
		}
		catch (Exception e) {
			_logger.error("getPACINGByORMID(int ID)", e);
			return null;
		}
	}
	
	public static PACING loadPACINGByORMID(int ID, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return loadPACINGByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			_logger.error("loadPACINGByORMID(int ID, org.hibernate.LockMode lockMode)", e);
			return null;
		}
	}
	
	public static PACING getPACINGByORMID(int ID, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return getPACINGByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			_logger.error("getPACINGByORMID(int ID, org.hibernate.LockMode lockMode)", e);
			return null;
		}
	}
	
	public static PACING loadPACINGByORMID(PersistentSession session, int ID) {
		try {
			return (PACING) session.load(tr.com.srdc.icardea.hibernate.PACING.class, new Integer(ID));
		}
		catch (Exception e) {
			_logger.error("loadPACINGByORMID(PersistentSession session, int ID)", e);
			return null;
		}
	}
	
	public static PACING getPACINGByORMID(PersistentSession session, int ID) {
		try {
			return (PACING) session.get(tr.com.srdc.icardea.hibernate.PACING.class, new Integer(ID));
		}
		catch (Exception e) {
			_logger.error("getPACINGByORMID(PersistentSession session, int ID)", e);
			return null;
		}
	}
	
	public static PACING loadPACINGByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) {
		try {
			return (PACING) session.load(tr.com.srdc.icardea.hibernate.PACING.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			_logger.error("loadPACINGByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode)", e);
			return null;
		}
	}
	
	public static PACING getPACINGByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) {
		try {
			return (PACING) session.get(tr.com.srdc.icardea.hibernate.PACING.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			_logger.error("getPACINGByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode)", e);
			return null;
		}
	}
	
	public static PACING[] listPACINGByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return listPACINGByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("listPACINGByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static PACING[] listPACINGByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return listPACINGByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("listPACINGByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static PACING[] listPACINGByQuery(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From tr.com.srdc.icardea.hibernate.PACING as PACING");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			List list = query.list();
			return (PACING[]) list.toArray(new PACING[list.size()]);
		}
		catch (Exception e) {
			_logger.error("listPACINGByQuery(PersistentSession session, String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static PACING[] listPACINGByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From tr.com.srdc.icardea.hibernate.PACING as PACING");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("this", lockMode);
			List list = query.list();
			return (PACING[]) list.toArray(new PACING[list.size()]);
		}
		catch (Exception e) {
			_logger.error("listPACINGByQuery(PersistentSession session, String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static PACING loadPACINGByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return loadPACINGByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("loadPACINGByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static PACING loadPACINGByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return loadPACINGByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("loadPACINGByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static PACING loadPACINGByQuery(PersistentSession session, String condition, String orderBy) {
		PACING[] pACINGs = listPACINGByQuery(session, condition, orderBy);
		if (pACINGs != null && pACINGs.length > 0)
			return pACINGs[0];
		else
			return null;
	}
	
	public static PACING loadPACINGByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		PACING[] pACINGs = listPACINGByQuery(session, condition, orderBy, lockMode);
		if (pACINGs != null && pACINGs.length > 0)
			return pACINGs[0];
		else
			return null;
	}
	
	public static java.util.Iterator iteratePACINGByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return iteratePACINGByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("iteratePACINGByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static java.util.Iterator iteratePACINGByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return iteratePACINGByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("iteratePACINGByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static java.util.Iterator iteratePACINGByQuery(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From tr.com.srdc.icardea.hibernate.PACING as PACING");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			_logger.error("iteratePACINGByQuery(PersistentSession session, String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static java.util.Iterator iteratePACINGByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From tr.com.srdc.icardea.hibernate.PACING as PACING");
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
			_logger.error("iteratePACINGByQuery(PersistentSession session, String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static PACING loadPACINGByCriteria(PACINGCriteria pACINGCriteria) {
		PACING[] pACINGs = listPACINGByCriteria(pACINGCriteria);
		if(pACINGs == null || pACINGs.length == 0) {
			return null;
		}
		return pACINGs[0];
	}
	
	public static PACING[] listPACINGByCriteria(PACINGCriteria pACINGCriteria) {
		return pACINGCriteria.listPACING();
	}
	
	public static PACING createPACING() {
		return new tr.com.srdc.icardea.hibernate.PACING();
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
				getlEADCHNLSET().setpACING(null);
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
				getlEADCHNLSET().setpACING(null);
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
	
	private String amplitude;
	
	private String pulsewidth;
	
	private String polarity;
	
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
	
	private String capture_mode;
	
	private tr.com.srdc.icardea.hibernate.LEADCHNLSET lEADCHNLSET;
	
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
	
	public void setPolarity(String value) {
		this.polarity = value;
	}
	
	public String getPolarity() {
		return polarity;
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
	
	public void setCapture_mode(String value) {
		this.capture_mode = value;
	}
	
	public String getCapture_mode() {
		return capture_mode;
	}
	
	public void setlEADCHNLSET(tr.com.srdc.icardea.hibernate.LEADCHNLSET value) {
		if (this.lEADCHNLSET != value) {
			tr.com.srdc.icardea.hibernate.LEADCHNLSET llEADCHNLSET = this.lEADCHNLSET;
			this.lEADCHNLSET = value;
			if (value != null) {
				lEADCHNLSET.setpACING(this);
			}
			else {
				llEADCHNLSET.setpACING(null);
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
			sb.append("PACING[ ");
			sb.append("ID=").append(getID()).append(" ");
			sb.append("Amplitude=").append(getAmplitude()).append(" ");
			sb.append("Pulsewidth=").append(getPulsewidth()).append(" ");
			sb.append("Polarity=").append(getPolarity()).append(" ");
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
			sb.append("Capture_mode=").append(getCapture_mode()).append(" ");
			if (getlEADCHNLSET() != null)
				sb.append("lEADCHNLSET.Persist_ID=").append(getlEADCHNLSET().toString(true)).append(" ");
			else
				sb.append("lEADCHNLSET=null ");
			sb.append("]");
			return sb.toString();
		}
	}
	
}
