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

public class Procedure {
	private static final org.apache.log4j.Logger _logger = org.apache.log4j.Logger.getLogger(Procedure.class);
	public Procedure() {
	}
	
	public static Procedure loadProcedureByORMID(int ID) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return loadProcedureByORMID(session, ID);
		}
		catch (Exception e) {
			_logger.error("loadProcedureByORMID(int ID)", e);
			return null;
		}
	}
	
	public static Procedure getProcedureByORMID(int ID) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return getProcedureByORMID(session, ID);
		}
		catch (Exception e) {
			_logger.error("getProcedureByORMID(int ID)", e);
			return null;
		}
	}
	
	public static Procedure loadProcedureByORMID(int ID, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return loadProcedureByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			_logger.error("loadProcedureByORMID(int ID, org.hibernate.LockMode lockMode)", e);
			return null;
		}
	}
	
	public static Procedure getProcedureByORMID(int ID, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return getProcedureByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			_logger.error("getProcedureByORMID(int ID, org.hibernate.LockMode lockMode)", e);
			return null;
		}
	}
	
	public static Procedure loadProcedureByORMID(PersistentSession session, int ID) {
		try {
			return (Procedure) session.load(tr.com.srdc.icardea.hibernate.Procedure.class, new Integer(ID));
		}
		catch (Exception e) {
			_logger.error("loadProcedureByORMID(PersistentSession session, int ID)", e);
			return null;
		}
	}
	
	public static Procedure getProcedureByORMID(PersistentSession session, int ID) {
		try {
			return (Procedure) session.get(tr.com.srdc.icardea.hibernate.Procedure.class, new Integer(ID));
		}
		catch (Exception e) {
			_logger.error("getProcedureByORMID(PersistentSession session, int ID)", e);
			return null;
		}
	}
	
	public static Procedure loadProcedureByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) {
		try {
			return (Procedure) session.load(tr.com.srdc.icardea.hibernate.Procedure.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			_logger.error("loadProcedureByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode)", e);
			return null;
		}
	}
	
	public static Procedure getProcedureByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) {
		try {
			return (Procedure) session.get(tr.com.srdc.icardea.hibernate.Procedure.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			_logger.error("getProcedureByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode)", e);
			return null;
		}
	}
	
	public static Procedure[] listProcedureByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return listProcedureByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("listProcedureByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static Procedure[] listProcedureByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return listProcedureByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("listProcedureByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static Procedure[] listProcedureByQuery(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From tr.com.srdc.icardea.hibernate.Procedure as Procedure");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			List list = query.list();
			return (Procedure[]) list.toArray(new Procedure[list.size()]);
		}
		catch (Exception e) {
			_logger.error("listProcedureByQuery(PersistentSession session, String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static Procedure[] listProcedureByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From tr.com.srdc.icardea.hibernate.Procedure as Procedure");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("this", lockMode);
			List list = query.list();
			return (Procedure[]) list.toArray(new Procedure[list.size()]);
		}
		catch (Exception e) {
			_logger.error("listProcedureByQuery(PersistentSession session, String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static Procedure loadProcedureByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return loadProcedureByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("loadProcedureByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static Procedure loadProcedureByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return loadProcedureByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("loadProcedureByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static Procedure loadProcedureByQuery(PersistentSession session, String condition, String orderBy) {
		Procedure[] procedures = listProcedureByQuery(session, condition, orderBy);
		if (procedures != null && procedures.length > 0)
			return procedures[0];
		else
			return null;
	}
	
	public static Procedure loadProcedureByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		Procedure[] procedures = listProcedureByQuery(session, condition, orderBy, lockMode);
		if (procedures != null && procedures.length > 0)
			return procedures[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateProcedureByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return iterateProcedureByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("iterateProcedureByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static java.util.Iterator iterateProcedureByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return iterateProcedureByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("iterateProcedureByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static java.util.Iterator iterateProcedureByQuery(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From tr.com.srdc.icardea.hibernate.Procedure as Procedure");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			_logger.error("iterateProcedureByQuery(PersistentSession session, String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static java.util.Iterator iterateProcedureByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From tr.com.srdc.icardea.hibernate.Procedure as Procedure");
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
			_logger.error("iterateProcedureByQuery(PersistentSession session, String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static Procedure loadProcedureByCriteria(ProcedureCriteria procedureCriteria) {
		Procedure[] procedures = listProcedureByCriteria(procedureCriteria);
		if(procedures == null || procedures.length == 0) {
			return null;
		}
		return procedures[0];
	}
	
	public static Procedure[] listProcedureByCriteria(ProcedureCriteria procedureCriteria) {
		return procedureCriteria.listProcedure();
	}
	
	public static Procedure createProcedure() {
		return new tr.com.srdc.icardea.hibernate.Procedure();
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
				geteHRPHRData().setProcedure(null);
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
				geteHRPHRData().setProcedure(null);
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
	
	private String procedureCode;
	
	private String procedureCodeSystem;
	
	private String procedureText;
	
	private String statusCode;
	
	private String effectiveTimeLow;
	
	private String effectiveTimeHigh;
	
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
	
	public void setProcedureCode(String value) {
		this.procedureCode = value;
	}
	
	public String getProcedureCode() {
		return procedureCode;
	}
	
	public void setProcedureCodeSystem(String value) {
		this.procedureCodeSystem = value;
	}
	
	public String getProcedureCodeSystem() {
		return procedureCodeSystem;
	}
	
	public void setProcedureText(String value) {
		this.procedureText = value;
	}
	
	public String getProcedureText() {
		return procedureText;
	}
	
	public void setStatusCode(String value) {
		this.statusCode = value;
	}
	
	public String getStatusCode() {
		return statusCode;
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
	
	public void seteHRPHRData(tr.com.srdc.icardea.hibernate.EHRPHRData value) {
		if (this.eHRPHRData != value) {
			tr.com.srdc.icardea.hibernate.EHRPHRData leHRPHRData = this.eHRPHRData;
			this.eHRPHRData = value;
			if (value != null) {
				eHRPHRData.setProcedure(this);
			}
			else {
				leHRPHRData.setProcedure(null);
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
			sb.append("Procedure[ ");
			sb.append("ID=").append(getID()).append(" ");
			sb.append("CareProvisionCode=").append(getCareProvisionCode()).append(" ");
			sb.append("ProcedureCode=").append(getProcedureCode()).append(" ");
			sb.append("ProcedureCodeSystem=").append(getProcedureCodeSystem()).append(" ");
			sb.append("ProcedureText=").append(getProcedureText()).append(" ");
			sb.append("StatusCode=").append(getStatusCode()).append(" ");
			sb.append("EffectiveTimeLow=").append(getEffectiveTimeLow()).append(" ");
			sb.append("EffectiveTimeHigh=").append(getEffectiveTimeHigh()).append(" ");
			if (geteHRPHRData() != null)
				sb.append("eHRPHRData.Persist_ID=").append(geteHRPHRData().toString(true)).append(" ");
			else
				sb.append("eHRPHRData=null ");
			sb.append("]");
			return sb.toString();
		}
	}
	
}
