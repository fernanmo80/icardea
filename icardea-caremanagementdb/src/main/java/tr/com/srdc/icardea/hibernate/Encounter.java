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

public class Encounter {
	private static final org.apache.log4j.Logger _logger = org.apache.log4j.Logger.getLogger(Encounter.class);
	public Encounter() {
	}
	
	public static Encounter loadEncounterByORMID(int ID) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return loadEncounterByORMID(session, ID);
		}
		catch (Exception e) {
			_logger.error("loadEncounterByORMID(int ID)", e);
			return null;
		}
	}
	
	public static Encounter getEncounterByORMID(int ID) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return getEncounterByORMID(session, ID);
		}
		catch (Exception e) {
			_logger.error("getEncounterByORMID(int ID)", e);
			return null;
		}
	}
	
	public static Encounter loadEncounterByORMID(int ID, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return loadEncounterByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			_logger.error("loadEncounterByORMID(int ID, org.hibernate.LockMode lockMode)", e);
			return null;
		}
	}
	
	public static Encounter getEncounterByORMID(int ID, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return getEncounterByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			_logger.error("getEncounterByORMID(int ID, org.hibernate.LockMode lockMode)", e);
			return null;
		}
	}
	
	public static Encounter loadEncounterByORMID(PersistentSession session, int ID) {
		try {
			return (Encounter) session.load(tr.com.srdc.icardea.hibernate.Encounter.class, new Integer(ID));
		}
		catch (Exception e) {
			_logger.error("loadEncounterByORMID(PersistentSession session, int ID)", e);
			return null;
		}
	}
	
	public static Encounter getEncounterByORMID(PersistentSession session, int ID) {
		try {
			return (Encounter) session.get(tr.com.srdc.icardea.hibernate.Encounter.class, new Integer(ID));
		}
		catch (Exception e) {
			_logger.error("getEncounterByORMID(PersistentSession session, int ID)", e);
			return null;
		}
	}
	
	public static Encounter loadEncounterByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) {
		try {
			return (Encounter) session.load(tr.com.srdc.icardea.hibernate.Encounter.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			_logger.error("loadEncounterByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode)", e);
			return null;
		}
	}
	
	public static Encounter getEncounterByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) {
		try {
			return (Encounter) session.get(tr.com.srdc.icardea.hibernate.Encounter.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			_logger.error("getEncounterByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode)", e);
			return null;
		}
	}
	
	public static Encounter[] listEncounterByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return listEncounterByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("listEncounterByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static Encounter[] listEncounterByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return listEncounterByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("listEncounterByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static Encounter[] listEncounterByQuery(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From tr.com.srdc.icardea.hibernate.Encounter as Encounter");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			List list = query.list();
			return (Encounter[]) list.toArray(new Encounter[list.size()]);
		}
		catch (Exception e) {
			_logger.error("listEncounterByQuery(PersistentSession session, String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static Encounter[] listEncounterByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From tr.com.srdc.icardea.hibernate.Encounter as Encounter");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("this", lockMode);
			List list = query.list();
			return (Encounter[]) list.toArray(new Encounter[list.size()]);
		}
		catch (Exception e) {
			_logger.error("listEncounterByQuery(PersistentSession session, String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static Encounter loadEncounterByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return loadEncounterByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("loadEncounterByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static Encounter loadEncounterByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return loadEncounterByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("loadEncounterByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static Encounter loadEncounterByQuery(PersistentSession session, String condition, String orderBy) {
		Encounter[] encounters = listEncounterByQuery(session, condition, orderBy);
		if (encounters != null && encounters.length > 0)
			return encounters[0];
		else
			return null;
	}
	
	public static Encounter loadEncounterByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		Encounter[] encounters = listEncounterByQuery(session, condition, orderBy, lockMode);
		if (encounters != null && encounters.length > 0)
			return encounters[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateEncounterByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return iterateEncounterByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("iterateEncounterByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static java.util.Iterator iterateEncounterByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return iterateEncounterByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("iterateEncounterByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static java.util.Iterator iterateEncounterByQuery(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From tr.com.srdc.icardea.hibernate.Encounter as Encounter");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			_logger.error("iterateEncounterByQuery(PersistentSession session, String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static java.util.Iterator iterateEncounterByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From tr.com.srdc.icardea.hibernate.Encounter as Encounter");
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
			_logger.error("iterateEncounterByQuery(PersistentSession session, String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static Encounter loadEncounterByCriteria(EncounterCriteria encounterCriteria) {
		Encounter[] encounters = listEncounterByCriteria(encounterCriteria);
		if(encounters == null || encounters.length == 0) {
			return null;
		}
		return encounters[0];
	}
	
	public static Encounter[] listEncounterByCriteria(EncounterCriteria encounterCriteria) {
		return encounterCriteria.listEncounter();
	}
	
	public static Encounter createEncounter() {
		return new tr.com.srdc.icardea.hibernate.Encounter();
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
			if(geteHRPHRData() != null) {
				geteHRPHRData().setEncounter(null);
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
			if(geteHRPHRData() != null) {
				geteHRPHRData().setEncounter(null);
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
	
	private String careProvisionCode;
	
	private String encounterCode;
	
	private String effectiveTimeLow;
	
	private String effectiveTimeHigh;
	
	private String encounterText;
	
	private String doctorID;
	
	private String organizationID;
	
	private tr.com.srdc.icardea.hibernate.EHRPHRData eHRPHRData;
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setCareProvisionCode(String value) {
		this.careProvisionCode = value;
	}
	
	public String getCareProvisionCode() {
		return careProvisionCode;
	}
	
	public void setEncounterCode(String value) {
		this.encounterCode = value;
	}
	
	public String getEncounterCode() {
		return encounterCode;
	}
	
	public void setEffectiveTimeLow(String value) {
		this.effectiveTimeLow = value;
	}
	
	public String getEffectiveTimeLow() {
		return effectiveTimeLow;
	}
	
	public void setEffectiveTimeHigh(String value) {
		this.effectiveTimeHigh = value;
	}
	
	public String getEffectiveTimeHigh() {
		return effectiveTimeHigh;
	}
	
	public void setEncounterText(String value) {
		this.encounterText = value;
	}
	
	public String getEncounterText() {
		return encounterText;
	}
	
	public void setDoctorID(String value) {
		this.doctorID = value;
	}
	
	public String getDoctorID() {
		return doctorID;
	}
	
	public void setOrganizationID(String value) {
		this.organizationID = value;
	}
	
	public String getOrganizationID() {
		return organizationID;
	}
	
	public void seteHRPHRData(tr.com.srdc.icardea.hibernate.EHRPHRData value) {
		if (this.eHRPHRData != value) {
			tr.com.srdc.icardea.hibernate.EHRPHRData leHRPHRData = this.eHRPHRData;
			this.eHRPHRData = value;
			if (value != null) {
				eHRPHRData.setEncounter(this);
			}
			else {
				leHRPHRData.setEncounter(null);
			}
		}
	}
	
	public tr.com.srdc.icardea.hibernate.EHRPHRData geteHRPHRData() {
		return eHRPHRData;
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
			sb.append("Encounter[ ");
			sb.append("ID=").append(getID()).append(" ");
			sb.append("CareProvisionCode=").append(getCareProvisionCode()).append(" ");
			sb.append("EncounterCode=").append(getEncounterCode()).append(" ");
			sb.append("EffectiveTimeLow=").append(getEffectiveTimeLow()).append(" ");
			sb.append("EffectiveTimeHigh=").append(getEffectiveTimeHigh()).append(" ");
			sb.append("EncounterText=").append(getEncounterText()).append(" ");
			sb.append("DoctorID=").append(getDoctorID()).append(" ");
			sb.append("OrganizationID=").append(getOrganizationID()).append(" ");
			if (geteHRPHRData() != null)
				sb.append("eHRPHRData.Persist_ID=").append(geteHRPHRData().toString(true)).append(" ");
			else
				sb.append("eHRPHRData=null ");
			sb.append("]");
			return sb.toString();
		}
	}
	
}
