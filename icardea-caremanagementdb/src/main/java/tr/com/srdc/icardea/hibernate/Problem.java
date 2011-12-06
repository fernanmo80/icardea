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

public class Problem {
	private static final org.apache.log4j.Logger _logger = org.apache.log4j.Logger.getLogger(Problem.class);
	public Problem() {
	}
	
	public static Problem loadProblemByORMID(int ID) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return loadProblemByORMID(session, ID);
		}
		catch (Exception e) {
			_logger.error("loadProblemByORMID(int ID)", e);
			return null;
		}
	}
	
	public static Problem getProblemByORMID(int ID) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return getProblemByORMID(session, ID);
		}
		catch (Exception e) {
			_logger.error("getProblemByORMID(int ID)", e);
			return null;
		}
	}
	
	public static Problem loadProblemByORMID(int ID, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return loadProblemByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			_logger.error("loadProblemByORMID(int ID, org.hibernate.LockMode lockMode)", e);
			return null;
		}
	}
	
	public static Problem getProblemByORMID(int ID, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return getProblemByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			_logger.error("getProblemByORMID(int ID, org.hibernate.LockMode lockMode)", e);
			return null;
		}
	}
	
	public static Problem loadProblemByORMID(PersistentSession session, int ID) {
		try {
			return (Problem) session.load(tr.com.srdc.icardea.hibernate.Problem.class, new Integer(ID));
		}
		catch (Exception e) {
			_logger.error("loadProblemByORMID(PersistentSession session, int ID)", e);
			return null;
		}
	}
	
	public static Problem getProblemByORMID(PersistentSession session, int ID) {
		try {
			return (Problem) session.get(tr.com.srdc.icardea.hibernate.Problem.class, new Integer(ID));
		}
		catch (Exception e) {
			_logger.error("getProblemByORMID(PersistentSession session, int ID)", e);
			return null;
		}
	}
	
	public static Problem loadProblemByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) {
		try {
			return (Problem) session.load(tr.com.srdc.icardea.hibernate.Problem.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			_logger.error("loadProblemByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode)", e);
			return null;
		}
	}
	
	public static Problem getProblemByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) {
		try {
			return (Problem) session.get(tr.com.srdc.icardea.hibernate.Problem.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			_logger.error("getProblemByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode)", e);
			return null;
		}
	}
	
	public static Problem[] listProblemByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return listProblemByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("listProblemByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static Problem[] listProblemByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return listProblemByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("listProblemByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static Problem[] listProblemByQuery(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From tr.com.srdc.icardea.hibernate.Problem as Problem");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			List list = query.list();
			return (Problem[]) list.toArray(new Problem[list.size()]);
		}
		catch (Exception e) {
			_logger.error("listProblemByQuery(PersistentSession session, String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static Problem[] listProblemByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From tr.com.srdc.icardea.hibernate.Problem as Problem");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("this", lockMode);
			List list = query.list();
			return (Problem[]) list.toArray(new Problem[list.size()]);
		}
		catch (Exception e) {
			_logger.error("listProblemByQuery(PersistentSession session, String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static Problem loadProblemByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return loadProblemByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("loadProblemByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static Problem loadProblemByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return loadProblemByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("loadProblemByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static Problem loadProblemByQuery(PersistentSession session, String condition, String orderBy) {
		Problem[] problems = listProblemByQuery(session, condition, orderBy);
		if (problems != null && problems.length > 0)
			return problems[0];
		else
			return null;
	}
	
	public static Problem loadProblemByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		Problem[] problems = listProblemByQuery(session, condition, orderBy, lockMode);
		if (problems != null && problems.length > 0)
			return problems[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateProblemByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return iterateProblemByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("iterateProblemByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static java.util.Iterator iterateProblemByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return iterateProblemByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("iterateProblemByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static java.util.Iterator iterateProblemByQuery(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From tr.com.srdc.icardea.hibernate.Problem as Problem");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			_logger.error("iterateProblemByQuery(PersistentSession session, String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static java.util.Iterator iterateProblemByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From tr.com.srdc.icardea.hibernate.Problem as Problem");
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
			_logger.error("iterateProblemByQuery(PersistentSession session, String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static Problem loadProblemByCriteria(ProblemCriteria problemCriteria) {
		Problem[] problems = listProblemByCriteria(problemCriteria);
		if(problems == null || problems.length == 0) {
			return null;
		}
		return problems[0];
	}
	
	public static Problem[] listProblemByCriteria(ProblemCriteria problemCriteria) {
		return problemCriteria.listProblem();
	}
	
	public static Problem createProblem() {
		return new tr.com.srdc.icardea.hibernate.Problem();
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
				geteHRPHRData().setProblem(null);
			}
			
			if(getConcern() != null) {
				getConcern().setProblem(null);
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
				geteHRPHRData().setProblem(null);
			}
			
			if(getConcern() != null) {
				getConcern().setProblem(null);
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
	
	private String problemCode;
	
	private String problemText;
	
	private String effectiveTimeLow;
	
	private String effectiveTimeHigh;
	
	private String problemValue;
	
	private String problemValueCodeSystem;
	
	private String problemValueOriginalText;
	
	private tr.com.srdc.icardea.hibernate.EHRPHRData eHRPHRData;
	
	private String severity;
	
	private tr.com.srdc.icardea.hibernate.Concern concern;
	
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
	
	public void setProblemCode(String value) {
		this.problemCode = value;
	}
	
	public String getProblemCode() {
		return problemCode;
	}
	
	public void setProblemText(String value) {
		this.problemText = value;
	}
	
	public String getProblemText() {
		return problemText;
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
	
	public void setProblemValue(String value) {
		this.problemValue = value;
	}
	
	public String getProblemValue() {
		return problemValue;
	}
	
	public void setProblemValueCodeSystem(String value) {
		this.problemValueCodeSystem = value;
	}
	
	public String getProblemValueCodeSystem() {
		return problemValueCodeSystem;
	}
	
	public void setProblemValueOriginalText(String value) {
		this.problemValueOriginalText = value;
	}
	
	public String getProblemValueOriginalText() {
		return problemValueOriginalText;
	}
	
	public void setSeverity(String value) {
		this.severity = value;
	}
	
	public String getSeverity() {
		return severity;
	}
	
	public void seteHRPHRData(tr.com.srdc.icardea.hibernate.EHRPHRData value) {
		if (this.eHRPHRData != value) {
			tr.com.srdc.icardea.hibernate.EHRPHRData leHRPHRData = this.eHRPHRData;
			this.eHRPHRData = value;
			if (value != null) {
				eHRPHRData.setProblem(this);
			}
			else {
				leHRPHRData.setProblem(null);
			}
		}
	}
	
	public tr.com.srdc.icardea.hibernate.EHRPHRData geteHRPHRData() {
		return eHRPHRData;
	}
	
	public void setConcern(tr.com.srdc.icardea.hibernate.Concern value) {
		if (this.concern != value) {
			tr.com.srdc.icardea.hibernate.Concern lconcern = this.concern;
			this.concern = value;
			if (value != null) {
				concern.setProblem(this);
			}
			else {
				lconcern.setProblem(null);
			}
		}
	}
	
	public tr.com.srdc.icardea.hibernate.Concern getConcern() {
		return concern;
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
			sb.append("Problem[ ");
			sb.append("ID=").append(getID()).append(" ");
			sb.append("CareProvisionCode=").append(getCareProvisionCode()).append(" ");
			sb.append("ProblemCode=").append(getProblemCode()).append(" ");
			sb.append("ProblemText=").append(getProblemText()).append(" ");
			sb.append("EffectiveTimeLow=").append(getEffectiveTimeLow()).append(" ");
			sb.append("EffectiveTimeHigh=").append(getEffectiveTimeHigh()).append(" ");
			sb.append("ProblemValue=").append(getProblemValue()).append(" ");
			sb.append("ProblemValueCodeSystem=").append(getProblemValueCodeSystem()).append(" ");
			sb.append("ProblemValueOriginalText=").append(getProblemValueOriginalText()).append(" ");
			if (geteHRPHRData() != null)
				sb.append("eHRPHRData.Persist_ID=").append(geteHRPHRData().toString(true)).append(" ");
			else
				sb.append("eHRPHRData=null ");
			sb.append("Severity=").append(getSeverity()).append(" ");
			if (getConcern() != null)
				sb.append("Concern.Persist_ID=").append(getConcern().toString(true)).append(" ");
			else
				sb.append("Concern=null ");
			sb.append("]");
			return sb.toString();
		}
	}
	
}
