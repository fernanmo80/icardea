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

public class PatientHealthcareActorAssignment {
	private static final org.apache.log4j.Logger _logger = org.apache.log4j.Logger.getLogger(PatientHealthcareActorAssignment.class);
	public PatientHealthcareActorAssignment() {
	}
	
	public static PatientHealthcareActorAssignment loadPatientHealthcareActorAssignmentByORMID(int ID) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return loadPatientHealthcareActorAssignmentByORMID(session, ID);
		}
		catch (Exception e) {
			_logger.error("loadPatientHealthcareActorAssignmentByORMID(int ID)", e);
			return null;
		}
	}
	
	public static PatientHealthcareActorAssignment getPatientHealthcareActorAssignmentByORMID(int ID) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return getPatientHealthcareActorAssignmentByORMID(session, ID);
		}
		catch (Exception e) {
			_logger.error("getPatientHealthcareActorAssignmentByORMID(int ID)", e);
			return null;
		}
	}
	
	public static PatientHealthcareActorAssignment loadPatientHealthcareActorAssignmentByORMID(int ID, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return loadPatientHealthcareActorAssignmentByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			_logger.error("loadPatientHealthcareActorAssignmentByORMID(int ID, org.hibernate.LockMode lockMode)", e);
			return null;
		}
	}
	
	public static PatientHealthcareActorAssignment getPatientHealthcareActorAssignmentByORMID(int ID, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return getPatientHealthcareActorAssignmentByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			_logger.error("getPatientHealthcareActorAssignmentByORMID(int ID, org.hibernate.LockMode lockMode)", e);
			return null;
		}
	}
	
	public static PatientHealthcareActorAssignment loadPatientHealthcareActorAssignmentByORMID(PersistentSession session, int ID) {
		try {
			return (PatientHealthcareActorAssignment) session.load(tr.com.srdc.icardea.hibernate.PatientHealthcareActorAssignment.class, new Integer(ID));
		}
		catch (Exception e) {
			_logger.error("loadPatientHealthcareActorAssignmentByORMID(PersistentSession session, int ID)", e);
			return null;
		}
	}
	
	public static PatientHealthcareActorAssignment getPatientHealthcareActorAssignmentByORMID(PersistentSession session, int ID) {
		try {
			return (PatientHealthcareActorAssignment) session.get(tr.com.srdc.icardea.hibernate.PatientHealthcareActorAssignment.class, new Integer(ID));
		}
		catch (Exception e) {
			_logger.error("getPatientHealthcareActorAssignmentByORMID(PersistentSession session, int ID)", e);
			return null;
		}
	}
	
	public static PatientHealthcareActorAssignment loadPatientHealthcareActorAssignmentByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) {
		try {
			return (PatientHealthcareActorAssignment) session.load(tr.com.srdc.icardea.hibernate.PatientHealthcareActorAssignment.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			_logger.error("loadPatientHealthcareActorAssignmentByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode)", e);
			return null;
		}
	}
	
	public static PatientHealthcareActorAssignment getPatientHealthcareActorAssignmentByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) {
		try {
			return (PatientHealthcareActorAssignment) session.get(tr.com.srdc.icardea.hibernate.PatientHealthcareActorAssignment.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			_logger.error("getPatientHealthcareActorAssignmentByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode)", e);
			return null;
		}
	}
	
	public static PatientHealthcareActorAssignment[] listPatientHealthcareActorAssignmentByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return listPatientHealthcareActorAssignmentByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("listPatientHealthcareActorAssignmentByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static PatientHealthcareActorAssignment[] listPatientHealthcareActorAssignmentByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return listPatientHealthcareActorAssignmentByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("listPatientHealthcareActorAssignmentByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static PatientHealthcareActorAssignment[] listPatientHealthcareActorAssignmentByQuery(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From tr.com.srdc.icardea.hibernate.PatientHealthcareActorAssignment as PatientHealthcareActorAssignment");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			List list = query.list();
			return (PatientHealthcareActorAssignment[]) list.toArray(new PatientHealthcareActorAssignment[list.size()]);
		}
		catch (Exception e) {
			_logger.error("listPatientHealthcareActorAssignmentByQuery(PersistentSession session, String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static PatientHealthcareActorAssignment[] listPatientHealthcareActorAssignmentByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From tr.com.srdc.icardea.hibernate.PatientHealthcareActorAssignment as PatientHealthcareActorAssignment");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("this", lockMode);
			List list = query.list();
			return (PatientHealthcareActorAssignment[]) list.toArray(new PatientHealthcareActorAssignment[list.size()]);
		}
		catch (Exception e) {
			_logger.error("listPatientHealthcareActorAssignmentByQuery(PersistentSession session, String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static PatientHealthcareActorAssignment loadPatientHealthcareActorAssignmentByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return loadPatientHealthcareActorAssignmentByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("loadPatientHealthcareActorAssignmentByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static PatientHealthcareActorAssignment loadPatientHealthcareActorAssignmentByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return loadPatientHealthcareActorAssignmentByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("loadPatientHealthcareActorAssignmentByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static PatientHealthcareActorAssignment loadPatientHealthcareActorAssignmentByQuery(PersistentSession session, String condition, String orderBy) {
		PatientHealthcareActorAssignment[] patientHealthcareActorAssignments = listPatientHealthcareActorAssignmentByQuery(session, condition, orderBy);
		if (patientHealthcareActorAssignments != null && patientHealthcareActorAssignments.length > 0)
			return patientHealthcareActorAssignments[0];
		else
			return null;
	}
	
	public static PatientHealthcareActorAssignment loadPatientHealthcareActorAssignmentByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		PatientHealthcareActorAssignment[] patientHealthcareActorAssignments = listPatientHealthcareActorAssignmentByQuery(session, condition, orderBy, lockMode);
		if (patientHealthcareActorAssignments != null && patientHealthcareActorAssignments.length > 0)
			return patientHealthcareActorAssignments[0];
		else
			return null;
	}
	
	public static java.util.Iterator iteratePatientHealthcareActorAssignmentByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return iteratePatientHealthcareActorAssignmentByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("iteratePatientHealthcareActorAssignmentByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static java.util.Iterator iteratePatientHealthcareActorAssignmentByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return iteratePatientHealthcareActorAssignmentByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("iteratePatientHealthcareActorAssignmentByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static java.util.Iterator iteratePatientHealthcareActorAssignmentByQuery(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From tr.com.srdc.icardea.hibernate.PatientHealthcareActorAssignment as PatientHealthcareActorAssignment");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			_logger.error("iteratePatientHealthcareActorAssignmentByQuery(PersistentSession session, String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static java.util.Iterator iteratePatientHealthcareActorAssignmentByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From tr.com.srdc.icardea.hibernate.PatientHealthcareActorAssignment as PatientHealthcareActorAssignment");
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
			_logger.error("iteratePatientHealthcareActorAssignmentByQuery(PersistentSession session, String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static PatientHealthcareActorAssignment loadPatientHealthcareActorAssignmentByCriteria(PatientHealthcareActorAssignmentCriteria patientHealthcareActorAssignmentCriteria) {
		PatientHealthcareActorAssignment[] patientHealthcareActorAssignments = listPatientHealthcareActorAssignmentByCriteria(patientHealthcareActorAssignmentCriteria);
		if(patientHealthcareActorAssignments == null || patientHealthcareActorAssignments.length == 0) {
			return null;
		}
		return patientHealthcareActorAssignments[0];
	}
	
	public static PatientHealthcareActorAssignment[] listPatientHealthcareActorAssignmentByCriteria(PatientHealthcareActorAssignmentCriteria patientHealthcareActorAssignmentCriteria) {
		return patientHealthcareActorAssignmentCriteria.listPatientHealthcareActorAssignment();
	}
	
	public static PatientHealthcareActorAssignment createPatientHealthcareActorAssignment() {
		return new tr.com.srdc.icardea.hibernate.PatientHealthcareActorAssignment();
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
	
	private int ID;
	
	private String patientIdentifier;
	
	private String healthcareActorIdentifier;
	
	private java.sql.Timestamp assignmentDate;
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setPatientIdentifier(String value) {
		this.patientIdentifier = value;
	}
	
	public String getPatientIdentifier() {
		return patientIdentifier;
	}
	
	public void setHealthcareActorIdentifier(String value) {
		this.healthcareActorIdentifier = value;
	}
	
	public String getHealthcareActorIdentifier() {
		return healthcareActorIdentifier;
	}
	
	public void setAssignmentDate(java.sql.Timestamp value) {
		this.assignmentDate = value;
	}
	
	public java.sql.Timestamp getAssignmentDate() {
		return assignmentDate;
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
			sb.append("PatientHealthcareActorAssignment[ ");
			sb.append("ID=").append(getID()).append(" ");
			sb.append("PatientIdentifier=").append(getPatientIdentifier()).append(" ");
			sb.append("HealthcareActorIdentifier=").append(getHealthcareActorIdentifier()).append(" ");
			sb.append("AssignmentDate=").append(getAssignmentDate()).append(" ");
			sb.append("]");
			return sb.toString();
		}
	}
	
}
