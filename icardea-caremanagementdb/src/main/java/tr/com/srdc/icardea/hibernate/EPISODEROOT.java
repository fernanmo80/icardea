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

public class EPISODEROOT {
	private static final org.apache.log4j.Logger _logger = org.apache.log4j.Logger.getLogger(EPISODEROOT.class);
	public EPISODEROOT() {
	}
	
	public static EPISODEROOT loadEPISODEROOTByORMID(int ID) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return loadEPISODEROOTByORMID(session, ID);
		}
		catch (Exception e) {
			_logger.error("loadEPISODEROOTByORMID(int ID)", e);
			return null;
		}
	}
	
	public static EPISODEROOT getEPISODEROOTByORMID(int ID) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return getEPISODEROOTByORMID(session, ID);
		}
		catch (Exception e) {
			_logger.error("getEPISODEROOTByORMID(int ID)", e);
			return null;
		}
	}
	
	public static EPISODEROOT loadEPISODEROOTByORMID(int ID, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return loadEPISODEROOTByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			_logger.error("loadEPISODEROOTByORMID(int ID, org.hibernate.LockMode lockMode)", e);
			return null;
		}
	}
	
	public static EPISODEROOT getEPISODEROOTByORMID(int ID, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return getEPISODEROOTByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			_logger.error("getEPISODEROOTByORMID(int ID, org.hibernate.LockMode lockMode)", e);
			return null;
		}
	}
	
	public static EPISODEROOT loadEPISODEROOTByORMID(PersistentSession session, int ID) {
		try {
			return (EPISODEROOT) session.load(tr.com.srdc.icardea.hibernate.EPISODEROOT.class, new Integer(ID));
		}
		catch (Exception e) {
			_logger.error("loadEPISODEROOTByORMID(PersistentSession session, int ID)", e);
			return null;
		}
	}
	
	public static EPISODEROOT getEPISODEROOTByORMID(PersistentSession session, int ID) {
		try {
			return (EPISODEROOT) session.get(tr.com.srdc.icardea.hibernate.EPISODEROOT.class, new Integer(ID));
		}
		catch (Exception e) {
			_logger.error("getEPISODEROOTByORMID(PersistentSession session, int ID)", e);
			return null;
		}
	}
	
	public static EPISODEROOT loadEPISODEROOTByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) {
		try {
			return (EPISODEROOT) session.load(tr.com.srdc.icardea.hibernate.EPISODEROOT.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			_logger.error("loadEPISODEROOTByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode)", e);
			return null;
		}
	}
	
	public static EPISODEROOT getEPISODEROOTByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) {
		try {
			return (EPISODEROOT) session.get(tr.com.srdc.icardea.hibernate.EPISODEROOT.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			_logger.error("getEPISODEROOTByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode)", e);
			return null;
		}
	}
	
	public static EPISODEROOT[] listEPISODEROOTByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return listEPISODEROOTByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("listEPISODEROOTByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static EPISODEROOT[] listEPISODEROOTByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return listEPISODEROOTByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("listEPISODEROOTByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static EPISODEROOT[] listEPISODEROOTByQuery(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From tr.com.srdc.icardea.hibernate.EPISODEROOT as EPISODEROOT");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			List list = query.list();
			return (EPISODEROOT[]) list.toArray(new EPISODEROOT[list.size()]);
		}
		catch (Exception e) {
			_logger.error("listEPISODEROOTByQuery(PersistentSession session, String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static EPISODEROOT[] listEPISODEROOTByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From tr.com.srdc.icardea.hibernate.EPISODEROOT as EPISODEROOT");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("this", lockMode);
			List list = query.list();
			return (EPISODEROOT[]) list.toArray(new EPISODEROOT[list.size()]);
		}
		catch (Exception e) {
			_logger.error("listEPISODEROOTByQuery(PersistentSession session, String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static EPISODEROOT loadEPISODEROOTByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return loadEPISODEROOTByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("loadEPISODEROOTByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static EPISODEROOT loadEPISODEROOTByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return loadEPISODEROOTByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("loadEPISODEROOTByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static EPISODEROOT loadEPISODEROOTByQuery(PersistentSession session, String condition, String orderBy) {
		EPISODEROOT[] ePISODEROOTs = listEPISODEROOTByQuery(session, condition, orderBy);
		if (ePISODEROOTs != null && ePISODEROOTs.length > 0)
			return ePISODEROOTs[0];
		else
			return null;
	}
	
	public static EPISODEROOT loadEPISODEROOTByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		EPISODEROOT[] ePISODEROOTs = listEPISODEROOTByQuery(session, condition, orderBy, lockMode);
		if (ePISODEROOTs != null && ePISODEROOTs.length > 0)
			return ePISODEROOTs[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateEPISODEROOTByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return iterateEPISODEROOTByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("iterateEPISODEROOTByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static java.util.Iterator iterateEPISODEROOTByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return iterateEPISODEROOTByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("iterateEPISODEROOTByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static java.util.Iterator iterateEPISODEROOTByQuery(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From tr.com.srdc.icardea.hibernate.EPISODEROOT as EPISODEROOT");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			_logger.error("iterateEPISODEROOTByQuery(PersistentSession session, String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static java.util.Iterator iterateEPISODEROOTByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From tr.com.srdc.icardea.hibernate.EPISODEROOT as EPISODEROOT");
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
			_logger.error("iterateEPISODEROOTByQuery(PersistentSession session, String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static EPISODEROOT loadEPISODEROOTByCriteria(EPISODEROOTCriteria ePISODEROOTCriteria) {
		EPISODEROOT[] ePISODEROOTs = listEPISODEROOTByCriteria(ePISODEROOTCriteria);
		if(ePISODEROOTs == null || ePISODEROOTs.length == 0) {
			return null;
		}
		return ePISODEROOTs[0];
	}
	
	public static EPISODEROOT[] listEPISODEROOTByCriteria(EPISODEROOTCriteria ePISODEROOTCriteria) {
		return ePISODEROOTCriteria.listEPISODEROOT();
	}
	
	public static EPISODEROOT createEPISODEROOT() {
		return new tr.com.srdc.icardea.hibernate.EPISODEROOT();
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
			if(getSystem() != null) {
				getSystem().ePISODEROOT.remove(this);
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
			if(getSystem() != null) {
				getSystem().ePISODEROOT.remove(this);
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
		if (key == tr.com.srdc.icardea.hibernate.ORMConstants.KEY_EPISODEROOT_SYSTEM) {
			this.system = (tr.com.srdc.icardea.hibernate.System) owner;
		}
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	private int ID;
	
	private String identifier;
	
	private String dtm;
	
	private String atrial_interval_at_detection;
	
	private String atrial_interval_at_termination;
	
	private String ventricular_interval_at_detection;
	
	private String ventricular_interval_at_termination;
	
	private String detection_therapy_details;
	
	private String therapy_result;
	
	private String duration;
	
	private Integer subID;
	
	private tr.com.srdc.icardea.hibernate.System system;
	
	private String type;
	
	private String type_induced;
	
	private String vendor_type;
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setIdentifier(String value) {
		this.identifier = value;
	}
	
	public String getIdentifier() {
		return identifier;
	}
	
	public void setDtm(String value) {
		this.dtm = value;
	}
	
	public String getDtm() {
		return dtm;
	}
	
	public void setAtrial_interval_at_detection(String value) {
		this.atrial_interval_at_detection = value;
	}
	
	public String getAtrial_interval_at_detection() {
		return atrial_interval_at_detection;
	}
	
	public void setAtrial_interval_at_termination(String value) {
		this.atrial_interval_at_termination = value;
	}
	
	public String getAtrial_interval_at_termination() {
		return atrial_interval_at_termination;
	}
	
	public void setVentricular_interval_at_detection(String value) {
		this.ventricular_interval_at_detection = value;
	}
	
	public String getVentricular_interval_at_detection() {
		return ventricular_interval_at_detection;
	}
	
	public void setVentricular_interval_at_termination(String value) {
		this.ventricular_interval_at_termination = value;
	}
	
	public String getVentricular_interval_at_termination() {
		return ventricular_interval_at_termination;
	}
	
	public void setDetection_therapy_details(String value) {
		this.detection_therapy_details = value;
	}
	
	public String getDetection_therapy_details() {
		return detection_therapy_details;
	}
	
	public void setTherapy_result(String value) {
		this.therapy_result = value;
	}
	
	public String getTherapy_result() {
		return therapy_result;
	}
	
	public void setDuration(String value) {
		this.duration = value;
	}
	
	public String getDuration() {
		return duration;
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
	
	public void setSystem(tr.com.srdc.icardea.hibernate.System value) {
		if (system != null) {
			system.ePISODEROOT.remove(this);
		}
		if (value != null) {
			value.ePISODEROOT.add(this);
		}
	}
	
	public tr.com.srdc.icardea.hibernate.System getSystem() {
		return system;
	}
	
	/**
	 * This method is for internal use only.
	 */
	private void setORM_System(tr.com.srdc.icardea.hibernate.System value) {
		this.system = value;
	}
	
	private tr.com.srdc.icardea.hibernate.System getORM_System() {
		return system;
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
			sb.append("EPISODEROOT[ ");
			sb.append("ID=").append(getID()).append(" ");
			sb.append("Identifier=").append(getIdentifier()).append(" ");
			sb.append("Dtm=").append(getDtm()).append(" ");
			sb.append("Atrial_interval_at_detection=").append(getAtrial_interval_at_detection()).append(" ");
			sb.append("Atrial_interval_at_termination=").append(getAtrial_interval_at_termination()).append(" ");
			sb.append("Ventricular_interval_at_detection=").append(getVentricular_interval_at_detection()).append(" ");
			sb.append("Ventricular_interval_at_termination=").append(getVentricular_interval_at_termination()).append(" ");
			sb.append("Detection_therapy_details=").append(getDetection_therapy_details()).append(" ");
			sb.append("Therapy_result=").append(getTherapy_result()).append(" ");
			sb.append("Duration=").append(getDuration()).append(" ");
			sb.append("SubID=").append(getSubID()).append(" ");
			if (getSystem() != null)
				sb.append("System.Persist_ID=").append(getSystem().toString(true)).append(" ");
			else
				sb.append("System=null ");
			sb.append("Type=").append(getType()).append(" ");
			sb.append("Type_induced=").append(getType_induced()).append(" ");
			sb.append("Vendor_type=").append(getVendor_type()).append(" ");
			sb.append("]");
			return sb.toString();
		}
	}
	
}
