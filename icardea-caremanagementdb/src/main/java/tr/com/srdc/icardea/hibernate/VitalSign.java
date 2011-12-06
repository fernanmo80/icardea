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

public class VitalSign {
	private static final org.apache.log4j.Logger _logger = org.apache.log4j.Logger.getLogger(VitalSign.class);
	public VitalSign() {
	}
	
	public static VitalSign loadVitalSignByORMID(int ID) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return loadVitalSignByORMID(session, ID);
		}
		catch (Exception e) {
			_logger.error("loadVitalSignByORMID(int ID)", e);
			return null;
		}
	}
	
	public static VitalSign getVitalSignByORMID(int ID) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return getVitalSignByORMID(session, ID);
		}
		catch (Exception e) {
			_logger.error("getVitalSignByORMID(int ID)", e);
			return null;
		}
	}
	
	public static VitalSign loadVitalSignByORMID(int ID, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return loadVitalSignByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			_logger.error("loadVitalSignByORMID(int ID, org.hibernate.LockMode lockMode)", e);
			return null;
		}
	}
	
	public static VitalSign getVitalSignByORMID(int ID, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return getVitalSignByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			_logger.error("getVitalSignByORMID(int ID, org.hibernate.LockMode lockMode)", e);
			return null;
		}
	}
	
	public static VitalSign loadVitalSignByORMID(PersistentSession session, int ID) {
		try {
			return (VitalSign) session.load(tr.com.srdc.icardea.hibernate.VitalSign.class, new Integer(ID));
		}
		catch (Exception e) {
			_logger.error("loadVitalSignByORMID(PersistentSession session, int ID)", e);
			return null;
		}
	}
	
	public static VitalSign getVitalSignByORMID(PersistentSession session, int ID) {
		try {
			return (VitalSign) session.get(tr.com.srdc.icardea.hibernate.VitalSign.class, new Integer(ID));
		}
		catch (Exception e) {
			_logger.error("getVitalSignByORMID(PersistentSession session, int ID)", e);
			return null;
		}
	}
	
	public static VitalSign loadVitalSignByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) {
		try {
			return (VitalSign) session.load(tr.com.srdc.icardea.hibernate.VitalSign.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			_logger.error("loadVitalSignByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode)", e);
			return null;
		}
	}
	
	public static VitalSign getVitalSignByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) {
		try {
			return (VitalSign) session.get(tr.com.srdc.icardea.hibernate.VitalSign.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			_logger.error("getVitalSignByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode)", e);
			return null;
		}
	}
	
	public static VitalSign[] listVitalSignByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return listVitalSignByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("listVitalSignByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static VitalSign[] listVitalSignByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return listVitalSignByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("listVitalSignByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static VitalSign[] listVitalSignByQuery(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From tr.com.srdc.icardea.hibernate.VitalSign as VitalSign");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			List list = query.list();
			return (VitalSign[]) list.toArray(new VitalSign[list.size()]);
		}
		catch (Exception e) {
			_logger.error("listVitalSignByQuery(PersistentSession session, String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static VitalSign[] listVitalSignByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From tr.com.srdc.icardea.hibernate.VitalSign as VitalSign");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("this", lockMode);
			List list = query.list();
			return (VitalSign[]) list.toArray(new VitalSign[list.size()]);
		}
		catch (Exception e) {
			_logger.error("listVitalSignByQuery(PersistentSession session, String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static VitalSign loadVitalSignByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return loadVitalSignByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("loadVitalSignByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static VitalSign loadVitalSignByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return loadVitalSignByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("loadVitalSignByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static VitalSign loadVitalSignByQuery(PersistentSession session, String condition, String orderBy) {
		VitalSign[] vitalSigns = listVitalSignByQuery(session, condition, orderBy);
		if (vitalSigns != null && vitalSigns.length > 0)
			return vitalSigns[0];
		else
			return null;
	}
	
	public static VitalSign loadVitalSignByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		VitalSign[] vitalSigns = listVitalSignByQuery(session, condition, orderBy, lockMode);
		if (vitalSigns != null && vitalSigns.length > 0)
			return vitalSigns[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateVitalSignByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return iterateVitalSignByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("iterateVitalSignByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static java.util.Iterator iterateVitalSignByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return iterateVitalSignByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("iterateVitalSignByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static java.util.Iterator iterateVitalSignByQuery(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From tr.com.srdc.icardea.hibernate.VitalSign as VitalSign");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			_logger.error("iterateVitalSignByQuery(PersistentSession session, String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static java.util.Iterator iterateVitalSignByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From tr.com.srdc.icardea.hibernate.VitalSign as VitalSign");
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
			_logger.error("iterateVitalSignByQuery(PersistentSession session, String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static VitalSign loadVitalSignByCriteria(VitalSignCriteria vitalSignCriteria) {
		VitalSign[] vitalSigns = listVitalSignByCriteria(vitalSignCriteria);
		if(vitalSigns == null || vitalSigns.length == 0) {
			return null;
		}
		return vitalSigns[0];
	}
	
	public static VitalSign[] listVitalSignByCriteria(VitalSignCriteria vitalSignCriteria) {
		return vitalSignCriteria.listVitalSign();
	}
	
	public static VitalSign createVitalSign() {
		return new tr.com.srdc.icardea.hibernate.VitalSign();
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
				geteHRPHRData().setVitalSign(null);
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
				geteHRPHRData().setVitalSign(null);
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
	
	private String effectiveTime;
	
	private String unit;
	
	private String value;
	
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
	
	public void setEffectiveTime(String value) {
		this.effectiveTime = value;
	}
	
	public String getEffectiveTime() {
		return effectiveTime;
	}
	
	public void setUnit(String value) {
		this.unit = value;
	}
	
	public String getUnit() {
		return unit;
	}
	
	public void setValue(String value) {
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}
	
	public void seteHRPHRData(tr.com.srdc.icardea.hibernate.EHRPHRData value) {
		if (this.eHRPHRData != value) {
			tr.com.srdc.icardea.hibernate.EHRPHRData leHRPHRData = this.eHRPHRData;
			this.eHRPHRData = value;
			if (value != null) {
				eHRPHRData.setVitalSign(this);
			}
			else {
				leHRPHRData.setVitalSign(null);
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
			sb.append("VitalSign[ ");
			sb.append("ID=").append(getID()).append(" ");
			sb.append("CareProvisionCode=").append(getCareProvisionCode()).append(" ");
			sb.append("EffectiveTime=").append(getEffectiveTime()).append(" ");
			sb.append("Unit=").append(getUnit()).append(" ");
			sb.append("Value=").append(getValue()).append(" ");
			if (geteHRPHRData() != null)
				sb.append("eHRPHRData.Persist_ID=").append(geteHRPHRData().toString(true)).append(" ");
			else
				sb.append("eHRPHRData=null ");
			sb.append("]");
			return sb.toString();
		}
	}
	
}
