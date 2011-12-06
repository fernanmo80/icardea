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

public class Medication {
	private static final org.apache.log4j.Logger _logger = org.apache.log4j.Logger.getLogger(Medication.class);
	public Medication() {
	}
	
	public static Medication loadMedicationByORMID(int ID) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return loadMedicationByORMID(session, ID);
		}
		catch (Exception e) {
			_logger.error("loadMedicationByORMID(int ID)", e);
			return null;
		}
	}
	
	public static Medication getMedicationByORMID(int ID) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return getMedicationByORMID(session, ID);
		}
		catch (Exception e) {
			_logger.error("getMedicationByORMID(int ID)", e);
			return null;
		}
	}
	
	public static Medication loadMedicationByORMID(int ID, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return loadMedicationByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			_logger.error("loadMedicationByORMID(int ID, org.hibernate.LockMode lockMode)", e);
			return null;
		}
	}
	
	public static Medication getMedicationByORMID(int ID, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return getMedicationByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			_logger.error("getMedicationByORMID(int ID, org.hibernate.LockMode lockMode)", e);
			return null;
		}
	}
	
	public static Medication loadMedicationByORMID(PersistentSession session, int ID) {
		try {
			return (Medication) session.load(tr.com.srdc.icardea.hibernate.Medication.class, new Integer(ID));
		}
		catch (Exception e) {
			_logger.error("loadMedicationByORMID(PersistentSession session, int ID)", e);
			return null;
		}
	}
	
	public static Medication getMedicationByORMID(PersistentSession session, int ID) {
		try {
			return (Medication) session.get(tr.com.srdc.icardea.hibernate.Medication.class, new Integer(ID));
		}
		catch (Exception e) {
			_logger.error("getMedicationByORMID(PersistentSession session, int ID)", e);
			return null;
		}
	}
	
	public static Medication loadMedicationByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) {
		try {
			return (Medication) session.load(tr.com.srdc.icardea.hibernate.Medication.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			_logger.error("loadMedicationByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode)", e);
			return null;
		}
	}
	
	public static Medication getMedicationByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) {
		try {
			return (Medication) session.get(tr.com.srdc.icardea.hibernate.Medication.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			_logger.error("getMedicationByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode)", e);
			return null;
		}
	}
	
	public static Medication[] listMedicationByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return listMedicationByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("listMedicationByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static Medication[] listMedicationByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return listMedicationByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("listMedicationByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static Medication[] listMedicationByQuery(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From tr.com.srdc.icardea.hibernate.Medication as Medication");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			List list = query.list();
			return (Medication[]) list.toArray(new Medication[list.size()]);
		}
		catch (Exception e) {
			_logger.error("listMedicationByQuery(PersistentSession session, String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static Medication[] listMedicationByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From tr.com.srdc.icardea.hibernate.Medication as Medication");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("this", lockMode);
			List list = query.list();
			return (Medication[]) list.toArray(new Medication[list.size()]);
		}
		catch (Exception e) {
			_logger.error("listMedicationByQuery(PersistentSession session, String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static Medication loadMedicationByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return loadMedicationByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("loadMedicationByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static Medication loadMedicationByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return loadMedicationByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("loadMedicationByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static Medication loadMedicationByQuery(PersistentSession session, String condition, String orderBy) {
		Medication[] medications = listMedicationByQuery(session, condition, orderBy);
		if (medications != null && medications.length > 0)
			return medications[0];
		else
			return null;
	}
	
	public static Medication loadMedicationByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		Medication[] medications = listMedicationByQuery(session, condition, orderBy, lockMode);
		if (medications != null && medications.length > 0)
			return medications[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateMedicationByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return iterateMedicationByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("iterateMedicationByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static java.util.Iterator iterateMedicationByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return iterateMedicationByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("iterateMedicationByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static java.util.Iterator iterateMedicationByQuery(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From tr.com.srdc.icardea.hibernate.Medication as Medication");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			_logger.error("iterateMedicationByQuery(PersistentSession session, String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static java.util.Iterator iterateMedicationByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From tr.com.srdc.icardea.hibernate.Medication as Medication");
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
			_logger.error("iterateMedicationByQuery(PersistentSession session, String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static Medication loadMedicationByCriteria(MedicationCriteria medicationCriteria) {
		Medication[] medications = listMedicationByCriteria(medicationCriteria);
		if(medications == null || medications.length == 0) {
			return null;
		}
		return medications[0];
	}
	
	public static Medication[] listMedicationByCriteria(MedicationCriteria medicationCriteria) {
		return medicationCriteria.listMedication();
	}
	
	public static Medication createMedication() {
		return new tr.com.srdc.icardea.hibernate.Medication();
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
				geteHRPHRData().setMedication(null);
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
				geteHRPHRData().setMedication(null);
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
	
	private String text;
	
	private String effectiveTime;
	
	private String routeCode;
	
	private String approachSiteCode;
	
	private String doseQuantity;
	
	private String drugCode;
	
	private String drugCodeSystem;
	
	private tr.com.srdc.icardea.hibernate.EHRPHRData eHRPHRData;
	
	private String effectiveTimeHigh;
	
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
	
	public void setText(String value) {
		this.text = value;
	}
	
	public String getText() {
		return text;
	}
	
	public void setEffectiveTime(String value) {
		this.effectiveTime = value;
	}
	
	public String getEffectiveTime() {
		return effectiveTime;
	}
	
	public void setRouteCode(String value) {
		this.routeCode = value;
	}
	
	public String getRouteCode() {
		return routeCode;
	}
	
	public void setApproachSiteCode(String value) {
		this.approachSiteCode = value;
	}
	
	public String getApproachSiteCode() {
		return approachSiteCode;
	}
	
	public void setDoseQuantity(String value) {
		this.doseQuantity = value;
	}
	
	public String getDoseQuantity() {
		return doseQuantity;
	}
	
	public void setDrugCode(String value) {
		this.drugCode = value;
	}
	
	public String getDrugCode() {
		return drugCode;
	}
	
	public void setDrugCodeSystem(String value) {
		this.drugCodeSystem = value;
	}
	
	public String getDrugCodeSystem() {
		return drugCodeSystem;
	}
	
	public void setEffectiveTimeHigh(String value) {
		this.effectiveTimeHigh = value;
	}
	
	public String getEffectiveTimeHigh() {
		return effectiveTimeHigh;
	}
	
	public void seteHRPHRData(tr.com.srdc.icardea.hibernate.EHRPHRData value) {
		if (this.eHRPHRData != value) {
			tr.com.srdc.icardea.hibernate.EHRPHRData leHRPHRData = this.eHRPHRData;
			this.eHRPHRData = value;
			if (value != null) {
				eHRPHRData.setMedication(this);
			}
			else {
				leHRPHRData.setMedication(null);
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
			sb.append("Medication[ ");
			sb.append("ID=").append(getID()).append(" ");
			sb.append("CareProvisionCode=").append(getCareProvisionCode()).append(" ");
			sb.append("Text=").append(getText()).append(" ");
			sb.append("EffectiveTime=").append(getEffectiveTime()).append(" ");
			sb.append("RouteCode=").append(getRouteCode()).append(" ");
			sb.append("ApproachSiteCode=").append(getApproachSiteCode()).append(" ");
			sb.append("DoseQuantity=").append(getDoseQuantity()).append(" ");
			sb.append("DrugCode=").append(getDrugCode()).append(" ");
			sb.append("DrugCodeSystem=").append(getDrugCodeSystem()).append(" ");
			if (geteHRPHRData() != null)
				sb.append("eHRPHRData.Persist_ID=").append(geteHRPHRData().toString(true)).append(" ");
			else
				sb.append("eHRPHRData=null ");
			sb.append("EffectiveTimeHigh=").append(getEffectiveTimeHigh()).append(" ");
			sb.append("]");
			return sb.toString();
		}
	}
	
}
