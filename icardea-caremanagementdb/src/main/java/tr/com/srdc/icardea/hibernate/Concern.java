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

public class Concern {
	private static final org.apache.log4j.Logger _logger = org.apache.log4j.Logger.getLogger(Concern.class);
	public Concern() {
	}
	
	public static Concern loadConcernByORMID(int ID) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return loadConcernByORMID(session, ID);
		}
		catch (Exception e) {
			_logger.error("loadConcernByORMID(int ID)", e);
			return null;
		}
	}
	
	public static Concern getConcernByORMID(int ID) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return getConcernByORMID(session, ID);
		}
		catch (Exception e) {
			_logger.error("getConcernByORMID(int ID)", e);
			return null;
		}
	}
	
	public static Concern loadConcernByORMID(int ID, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return loadConcernByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			_logger.error("loadConcernByORMID(int ID, org.hibernate.LockMode lockMode)", e);
			return null;
		}
	}
	
	public static Concern getConcernByORMID(int ID, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return getConcernByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			_logger.error("getConcernByORMID(int ID, org.hibernate.LockMode lockMode)", e);
			return null;
		}
	}
	
	public static Concern loadConcernByORMID(PersistentSession session, int ID) {
		try {
			return (Concern) session.load(tr.com.srdc.icardea.hibernate.Concern.class, new Integer(ID));
		}
		catch (Exception e) {
			_logger.error("loadConcernByORMID(PersistentSession session, int ID)", e);
			return null;
		}
	}
	
	public static Concern getConcernByORMID(PersistentSession session, int ID) {
		try {
			return (Concern) session.get(tr.com.srdc.icardea.hibernate.Concern.class, new Integer(ID));
		}
		catch (Exception e) {
			_logger.error("getConcernByORMID(PersistentSession session, int ID)", e);
			return null;
		}
	}
	
	public static Concern loadConcernByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) {
		try {
			return (Concern) session.load(tr.com.srdc.icardea.hibernate.Concern.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			_logger.error("loadConcernByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode)", e);
			return null;
		}
	}
	
	public static Concern getConcernByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) {
		try {
			return (Concern) session.get(tr.com.srdc.icardea.hibernate.Concern.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			_logger.error("getConcernByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode)", e);
			return null;
		}
	}
	
	public static Concern[] listConcernByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return listConcernByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("listConcernByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static Concern[] listConcernByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return listConcernByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("listConcernByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static Concern[] listConcernByQuery(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From tr.com.srdc.icardea.hibernate.Concern as Concern");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			List list = query.list();
			return (Concern[]) list.toArray(new Concern[list.size()]);
		}
		catch (Exception e) {
			_logger.error("listConcernByQuery(PersistentSession session, String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static Concern[] listConcernByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From tr.com.srdc.icardea.hibernate.Concern as Concern");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("this", lockMode);
			List list = query.list();
			return (Concern[]) list.toArray(new Concern[list.size()]);
		}
		catch (Exception e) {
			_logger.error("listConcernByQuery(PersistentSession session, String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static Concern loadConcernByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return loadConcernByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("loadConcernByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static Concern loadConcernByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return loadConcernByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("loadConcernByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static Concern loadConcernByQuery(PersistentSession session, String condition, String orderBy) {
		Concern[] concerns = listConcernByQuery(session, condition, orderBy);
		if (concerns != null && concerns.length > 0)
			return concerns[0];
		else
			return null;
	}
	
	public static Concern loadConcernByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		Concern[] concerns = listConcernByQuery(session, condition, orderBy, lockMode);
		if (concerns != null && concerns.length > 0)
			return concerns[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateConcernByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return iterateConcernByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("iterateConcernByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static java.util.Iterator iterateConcernByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return iterateConcernByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("iterateConcernByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static java.util.Iterator iterateConcernByQuery(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From tr.com.srdc.icardea.hibernate.Concern as Concern");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			_logger.error("iterateConcernByQuery(PersistentSession session, String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static java.util.Iterator iterateConcernByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From tr.com.srdc.icardea.hibernate.Concern as Concern");
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
			_logger.error("iterateConcernByQuery(PersistentSession session, String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static Concern loadConcernByCriteria(ConcernCriteria concernCriteria) {
		Concern[] concerns = listConcernByCriteria(concernCriteria);
		if(concerns == null || concerns.length == 0) {
			return null;
		}
		return concerns[0];
	}
	
	public static Concern[] listConcernByCriteria(ConcernCriteria concernCriteria) {
		return concernCriteria.listConcern();
	}
	
	public static Concern createConcern() {
		return new tr.com.srdc.icardea.hibernate.Concern();
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
				geteHRPHRData().setConcern(null);
			}
			
			if(getProblem() != null) {
				getProblem().setConcern(null);
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
				geteHRPHRData().setConcern(null);
			}
			
			if(getProblem() != null) {
				getProblem().setConcern(null);
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
	
	private String concernStatusCode;
	
	private String effectiveTimeLow;
	
	private String effectiveTimeHigh;
	
	private String allergyCode;
	
	private String allergyValue;
	
	private String allergyValueCodeSystem;
	
	private String allergySubstanceCode;
	
	private String allergySubstanceCodeSystem;
	
	private String allergyOriginalText;
	
	private tr.com.srdc.icardea.hibernate.EHRPHRData eHRPHRData;
	
	private tr.com.srdc.icardea.hibernate.Problem problem;
	
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
	
	public void setConcernStatusCode(String value) {
		this.concernStatusCode = value;
	}
	
	public String getConcernStatusCode() {
		return concernStatusCode;
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
	
	public void setAllergyCode(String value) {
		this.allergyCode = value;
	}
	
	public String getAllergyCode() {
		return allergyCode;
	}
	
	public void setAllergyValue(String value) {
		this.allergyValue = value;
	}
	
	public String getAllergyValue() {
		return allergyValue;
	}
	
	public void setAllergyValueCodeSystem(String value) {
		this.allergyValueCodeSystem = value;
	}
	
	public String getAllergyValueCodeSystem() {
		return allergyValueCodeSystem;
	}
	
	public void setAllergySubstanceCode(String value) {
		this.allergySubstanceCode = value;
	}
	
	public String getAllergySubstanceCode() {
		return allergySubstanceCode;
	}
	
	public void setAllergySubstanceCodeSystem(String value) {
		this.allergySubstanceCodeSystem = value;
	}
	
	public String getAllergySubstanceCodeSystem() {
		return allergySubstanceCodeSystem;
	}
	
	public void setAllergyOriginalText(String value) {
		this.allergyOriginalText = value;
	}
	
	public String getAllergyOriginalText() {
		return allergyOriginalText;
	}
	
	public void seteHRPHRData(tr.com.srdc.icardea.hibernate.EHRPHRData value) {
		if (this.eHRPHRData != value) {
			tr.com.srdc.icardea.hibernate.EHRPHRData leHRPHRData = this.eHRPHRData;
			this.eHRPHRData = value;
			if (value != null) {
				eHRPHRData.setConcern(this);
			}
			else {
				leHRPHRData.setConcern(null);
			}
		}
	}
	
	public tr.com.srdc.icardea.hibernate.EHRPHRData geteHRPHRData() {
		return eHRPHRData;
	}
	
	public void setProblem(tr.com.srdc.icardea.hibernate.Problem value) {
		if (this.problem != value) {
			tr.com.srdc.icardea.hibernate.Problem lproblem = this.problem;
			this.problem = value;
			if (value != null) {
				problem.setConcern(this);
			}
			else {
				lproblem.setConcern(null);
			}
		}
	}
	
	public tr.com.srdc.icardea.hibernate.Problem getProblem() {
		return problem;
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
			sb.append("Concern[ ");
			sb.append("ID=").append(getID()).append(" ");
			sb.append("CareProvisionCode=").append(getCareProvisionCode()).append(" ");
			sb.append("ConcernStatusCode=").append(getConcernStatusCode()).append(" ");
			sb.append("EffectiveTimeLow=").append(getEffectiveTimeLow()).append(" ");
			sb.append("EffectiveTimeHigh=").append(getEffectiveTimeHigh()).append(" ");
			sb.append("AllergyCode=").append(getAllergyCode()).append(" ");
			sb.append("AllergyValue=").append(getAllergyValue()).append(" ");
			sb.append("AllergyValueCodeSystem=").append(getAllergyValueCodeSystem()).append(" ");
			sb.append("AllergySubstanceCode=").append(getAllergySubstanceCode()).append(" ");
			sb.append("AllergySubstanceCodeSystem=").append(getAllergySubstanceCodeSystem()).append(" ");
			sb.append("AllergyOriginalText=").append(getAllergyOriginalText()).append(" ");
			if (geteHRPHRData() != null)
				sb.append("eHRPHRData.Persist_ID=").append(geteHRPHRData().toString(true)).append(" ");
			else
				sb.append("eHRPHRData=null ");
			if (getProblem() != null)
				sb.append("Problem.Persist_ID=").append(getProblem().toString(true)).append(" ");
			else
				sb.append("Problem=null ");
			sb.append("]");
			return sb.toString();
		}
	}
	
}
