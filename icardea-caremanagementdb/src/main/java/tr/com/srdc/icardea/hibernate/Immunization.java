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

public class Immunization {
	private static final org.apache.log4j.Logger _logger = org.apache.log4j.Logger.getLogger(Immunization.class);
	public Immunization() {
	}
	
	public static Immunization loadImmunizationByORMID(int ID) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return loadImmunizationByORMID(session, ID);
		}
		catch (Exception e) {
			_logger.error("loadImmunizationByORMID(int ID)", e);
			return null;
		}
	}
	
	public static Immunization getImmunizationByORMID(int ID) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return getImmunizationByORMID(session, ID);
		}
		catch (Exception e) {
			_logger.error("getImmunizationByORMID(int ID)", e);
			return null;
		}
	}
	
	public static Immunization loadImmunizationByORMID(int ID, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return loadImmunizationByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			_logger.error("loadImmunizationByORMID(int ID, org.hibernate.LockMode lockMode)", e);
			return null;
		}
	}
	
	public static Immunization getImmunizationByORMID(int ID, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return getImmunizationByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			_logger.error("getImmunizationByORMID(int ID, org.hibernate.LockMode lockMode)", e);
			return null;
		}
	}
	
	public static Immunization loadImmunizationByORMID(PersistentSession session, int ID) {
		try {
			return (Immunization) session.load(tr.com.srdc.icardea.hibernate.Immunization.class, new Integer(ID));
		}
		catch (Exception e) {
			_logger.error("loadImmunizationByORMID(PersistentSession session, int ID)", e);
			return null;
		}
	}
	
	public static Immunization getImmunizationByORMID(PersistentSession session, int ID) {
		try {
			return (Immunization) session.get(tr.com.srdc.icardea.hibernate.Immunization.class, new Integer(ID));
		}
		catch (Exception e) {
			_logger.error("getImmunizationByORMID(PersistentSession session, int ID)", e);
			return null;
		}
	}
	
	public static Immunization loadImmunizationByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) {
		try {
			return (Immunization) session.load(tr.com.srdc.icardea.hibernate.Immunization.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			_logger.error("loadImmunizationByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode)", e);
			return null;
		}
	}
	
	public static Immunization getImmunizationByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) {
		try {
			return (Immunization) session.get(tr.com.srdc.icardea.hibernate.Immunization.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			_logger.error("getImmunizationByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode)", e);
			return null;
		}
	}
	
	public static Immunization[] listImmunizationByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return listImmunizationByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("listImmunizationByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static Immunization[] listImmunizationByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return listImmunizationByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("listImmunizationByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static Immunization[] listImmunizationByQuery(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From tr.com.srdc.icardea.hibernate.Immunization as Immunization");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			List list = query.list();
			return (Immunization[]) list.toArray(new Immunization[list.size()]);
		}
		catch (Exception e) {
			_logger.error("listImmunizationByQuery(PersistentSession session, String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static Immunization[] listImmunizationByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From tr.com.srdc.icardea.hibernate.Immunization as Immunization");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("this", lockMode);
			List list = query.list();
			return (Immunization[]) list.toArray(new Immunization[list.size()]);
		}
		catch (Exception e) {
			_logger.error("listImmunizationByQuery(PersistentSession session, String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static Immunization loadImmunizationByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return loadImmunizationByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("loadImmunizationByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static Immunization loadImmunizationByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return loadImmunizationByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("loadImmunizationByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static Immunization loadImmunizationByQuery(PersistentSession session, String condition, String orderBy) {
		Immunization[] immunizations = listImmunizationByQuery(session, condition, orderBy);
		if (immunizations != null && immunizations.length > 0)
			return immunizations[0];
		else
			return null;
	}
	
	public static Immunization loadImmunizationByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		Immunization[] immunizations = listImmunizationByQuery(session, condition, orderBy, lockMode);
		if (immunizations != null && immunizations.length > 0)
			return immunizations[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateImmunizationByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return iterateImmunizationByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("iterateImmunizationByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static java.util.Iterator iterateImmunizationByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return iterateImmunizationByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("iterateImmunizationByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static java.util.Iterator iterateImmunizationByQuery(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From tr.com.srdc.icardea.hibernate.Immunization as Immunization");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			_logger.error("iterateImmunizationByQuery(PersistentSession session, String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static java.util.Iterator iterateImmunizationByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From tr.com.srdc.icardea.hibernate.Immunization as Immunization");
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
			_logger.error("iterateImmunizationByQuery(PersistentSession session, String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static Immunization loadImmunizationByCriteria(ImmunizationCriteria immunizationCriteria) {
		Immunization[] immunizations = listImmunizationByCriteria(immunizationCriteria);
		if(immunizations == null || immunizations.length == 0) {
			return null;
		}
		return immunizations[0];
	}
	
	public static Immunization[] listImmunizationByCriteria(ImmunizationCriteria immunizationCriteria) {
		return immunizationCriteria.listImmunization();
	}
	
	public static Immunization createImmunization() {
		return new tr.com.srdc.icardea.hibernate.Immunization();
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
				geteHRPHRData().setImmunization(null);
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
				geteHRPHRData().setImmunization(null);
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
	
	private String doseQuantityUnit;
	
	private String drugCode;
	
	private String drugCodeSystem;
	
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
	
	public void setDoseQuantityUnit(String value) {
		this.doseQuantityUnit = value;
	}
	
	public String getDoseQuantityUnit() {
		return doseQuantityUnit;
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
	
	public void seteHRPHRData(tr.com.srdc.icardea.hibernate.EHRPHRData value) {
		if (this.eHRPHRData != value) {
			tr.com.srdc.icardea.hibernate.EHRPHRData leHRPHRData = this.eHRPHRData;
			this.eHRPHRData = value;
			if (value != null) {
				eHRPHRData.setImmunization(this);
			}
			else {
				leHRPHRData.setImmunization(null);
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
			sb.append("Immunization[ ");
			sb.append("ID=").append(getID()).append(" ");
			sb.append("CareProvisionCode=").append(getCareProvisionCode()).append(" ");
			sb.append("Text=").append(getText()).append(" ");
			sb.append("EffectiveTime=").append(getEffectiveTime()).append(" ");
			sb.append("RouteCode=").append(getRouteCode()).append(" ");
			sb.append("ApproachSiteCode=").append(getApproachSiteCode()).append(" ");
			sb.append("DoseQuantity=").append(getDoseQuantity()).append(" ");
			sb.append("DoseQuantityUnit=").append(getDoseQuantityUnit()).append(" ");
			sb.append("DrugCode=").append(getDrugCode()).append(" ");
			sb.append("DrugCodeSystem=").append(getDrugCodeSystem()).append(" ");
			if (geteHRPHRData() != null)
				sb.append("eHRPHRData.Persist_ID=").append(geteHRPHRData().toString(true)).append(" ");
			else
				sb.append("eHRPHRData=null ");
			sb.append("]");
			return sb.toString();
		}
	}
	
}
