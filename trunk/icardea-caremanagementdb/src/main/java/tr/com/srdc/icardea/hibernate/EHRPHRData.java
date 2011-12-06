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

public class EHRPHRData {
	private static final org.apache.log4j.Logger _logger = org.apache.log4j.Logger.getLogger(EHRPHRData.class);
	public EHRPHRData() {
	}
	
	public static EHRPHRData loadEHRPHRDataByORMID(int ID) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return loadEHRPHRDataByORMID(session, ID);
		}
		catch (Exception e) {
			_logger.error("loadEHRPHRDataByORMID(int ID)", e);
			return null;
		}
	}
	
	public static EHRPHRData getEHRPHRDataByORMID(int ID) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return getEHRPHRDataByORMID(session, ID);
		}
		catch (Exception e) {
			_logger.error("getEHRPHRDataByORMID(int ID)", e);
			return null;
		}
	}
	
	public static EHRPHRData loadEHRPHRDataByORMID(int ID, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return loadEHRPHRDataByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			_logger.error("loadEHRPHRDataByORMID(int ID, org.hibernate.LockMode lockMode)", e);
			return null;
		}
	}
	
	public static EHRPHRData getEHRPHRDataByORMID(int ID, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return getEHRPHRDataByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			_logger.error("getEHRPHRDataByORMID(int ID, org.hibernate.LockMode lockMode)", e);
			return null;
		}
	}
	
	public static EHRPHRData loadEHRPHRDataByORMID(PersistentSession session, int ID) {
		try {
			return (EHRPHRData) session.load(tr.com.srdc.icardea.hibernate.EHRPHRData.class, new Integer(ID));
		}
		catch (Exception e) {
			_logger.error("loadEHRPHRDataByORMID(PersistentSession session, int ID)", e);
			return null;
		}
	}
	
	public static EHRPHRData getEHRPHRDataByORMID(PersistentSession session, int ID) {
		try {
			return (EHRPHRData) session.get(tr.com.srdc.icardea.hibernate.EHRPHRData.class, new Integer(ID));
		}
		catch (Exception e) {
			_logger.error("getEHRPHRDataByORMID(PersistentSession session, int ID)", e);
			return null;
		}
	}
	
	public static EHRPHRData loadEHRPHRDataByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) {
		try {
			return (EHRPHRData) session.load(tr.com.srdc.icardea.hibernate.EHRPHRData.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			_logger.error("loadEHRPHRDataByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode)", e);
			return null;
		}
	}
	
	public static EHRPHRData getEHRPHRDataByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) {
		try {
			return (EHRPHRData) session.get(tr.com.srdc.icardea.hibernate.EHRPHRData.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			_logger.error("getEHRPHRDataByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode)", e);
			return null;
		}
	}
	
	public static EHRPHRData[] listEHRPHRDataByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return listEHRPHRDataByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("listEHRPHRDataByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static EHRPHRData[] listEHRPHRDataByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return listEHRPHRDataByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("listEHRPHRDataByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static EHRPHRData[] listEHRPHRDataByQuery(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From tr.com.srdc.icardea.hibernate.EHRPHRData as EHRPHRData");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			List list = query.list();
			return (EHRPHRData[]) list.toArray(new EHRPHRData[list.size()]);
		}
		catch (Exception e) {
			_logger.error("listEHRPHRDataByQuery(PersistentSession session, String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static EHRPHRData[] listEHRPHRDataByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From tr.com.srdc.icardea.hibernate.EHRPHRData as EHRPHRData");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("this", lockMode);
			List list = query.list();
			return (EHRPHRData[]) list.toArray(new EHRPHRData[list.size()]);
		}
		catch (Exception e) {
			_logger.error("listEHRPHRDataByQuery(PersistentSession session, String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static EHRPHRData loadEHRPHRDataByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return loadEHRPHRDataByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("loadEHRPHRDataByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static EHRPHRData loadEHRPHRDataByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return loadEHRPHRDataByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("loadEHRPHRDataByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static EHRPHRData loadEHRPHRDataByQuery(PersistentSession session, String condition, String orderBy) {
		EHRPHRData[] eHRPHRDatas = listEHRPHRDataByQuery(session, condition, orderBy);
		if (eHRPHRDatas != null && eHRPHRDatas.length > 0)
			return eHRPHRDatas[0];
		else
			return null;
	}
	
	public static EHRPHRData loadEHRPHRDataByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		EHRPHRData[] eHRPHRDatas = listEHRPHRDataByQuery(session, condition, orderBy, lockMode);
		if (eHRPHRDatas != null && eHRPHRDatas.length > 0)
			return eHRPHRDatas[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateEHRPHRDataByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return iterateEHRPHRDataByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("iterateEHRPHRDataByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static java.util.Iterator iterateEHRPHRDataByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return iterateEHRPHRDataByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("iterateEHRPHRDataByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static java.util.Iterator iterateEHRPHRDataByQuery(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From tr.com.srdc.icardea.hibernate.EHRPHRData as EHRPHRData");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			_logger.error("iterateEHRPHRDataByQuery(PersistentSession session, String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static java.util.Iterator iterateEHRPHRDataByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From tr.com.srdc.icardea.hibernate.EHRPHRData as EHRPHRData");
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
			_logger.error("iterateEHRPHRDataByQuery(PersistentSession session, String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static EHRPHRData loadEHRPHRDataByCriteria(EHRPHRDataCriteria eHRPHRDataCriteria) {
		EHRPHRData[] eHRPHRDatas = listEHRPHRDataByCriteria(eHRPHRDataCriteria);
		if(eHRPHRDatas == null || eHRPHRDatas.length == 0) {
			return null;
		}
		return eHRPHRDatas[0];
	}
	
	public static EHRPHRData[] listEHRPHRDataByCriteria(EHRPHRDataCriteria eHRPHRDataCriteria) {
		return eHRPHRDataCriteria.listEHRPHRData();
	}
	
	public static EHRPHRData createEHRPHRData() {
		return new tr.com.srdc.icardea.hibernate.EHRPHRData();
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
			if(getPatient() != null) {
				getPatient().eHRPHRData.remove(this);
			}
			
			if(getConcern() != null) {
				getConcern().seteHRPHRData(null);
			}
			
			if(getMedication() != null) {
				getMedication().seteHRPHRData(null);
			}
			
			if(getImmunization() != null) {
				getImmunization().seteHRPHRData(null);
			}
			
			if(getProblem() != null) {
				getProblem().seteHRPHRData(null);
			}
			
			if(getImagingResult() != null) {
				getImagingResult().seteHRPHRData(null);
			}
			
			if(getProcedure() != null) {
				getProcedure().seteHRPHRData(null);
			}
			
			if(getEncounter() != null) {
				getEncounter().seteHRPHRData(null);
			}
			
			if(getVitalSign() != null) {
				getVitalSign().seteHRPHRData(null);
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
			if(getPatient() != null) {
				getPatient().eHRPHRData.remove(this);
			}
			
			if(getConcern() != null) {
				getConcern().seteHRPHRData(null);
			}
			
			if(getMedication() != null) {
				getMedication().seteHRPHRData(null);
			}
			
			if(getImmunization() != null) {
				getImmunization().seteHRPHRData(null);
			}
			
			if(getProblem() != null) {
				getProblem().seteHRPHRData(null);
			}
			
			if(getImagingResult() != null) {
				getImagingResult().seteHRPHRData(null);
			}
			
			if(getProcedure() != null) {
				getProcedure().seteHRPHRData(null);
			}
			
			if(getEncounter() != null) {
				getEncounter().seteHRPHRData(null);
			}
			
			if(getVitalSign() != null) {
				getVitalSign().seteHRPHRData(null);
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
		if (key == tr.com.srdc.icardea.hibernate.ORMConstants.KEY_EHRPHRDATA_PATIENT) {
			this.patient = (tr.com.srdc.icardea.hibernate.Patient) owner;
		}
		
		else if (key == tr.com.srdc.icardea.hibernate.ORMConstants.KEY_EHRPHRDATA_CONCERN) {
			this.concern = (tr.com.srdc.icardea.hibernate.Concern) owner;
		}
		
		else if (key == tr.com.srdc.icardea.hibernate.ORMConstants.KEY_EHRPHRDATA_MEDICATION) {
			this.medication = (tr.com.srdc.icardea.hibernate.Medication) owner;
		}
		
		else if (key == tr.com.srdc.icardea.hibernate.ORMConstants.KEY_EHRPHRDATA_IMMUNIZATION) {
			this.immunization = (tr.com.srdc.icardea.hibernate.Immunization) owner;
		}
		
		else if (key == tr.com.srdc.icardea.hibernate.ORMConstants.KEY_EHRPHRDATA_PROBLEM) {
			this.problem = (tr.com.srdc.icardea.hibernate.Problem) owner;
		}
		
		else if (key == tr.com.srdc.icardea.hibernate.ORMConstants.KEY_EHRPHRDATA_IMAGINGRESULT) {
			this.imagingResult = (tr.com.srdc.icardea.hibernate.ImagingResult) owner;
		}
		
		else if (key == tr.com.srdc.icardea.hibernate.ORMConstants.KEY_EHRPHRDATA_PROCEDURE) {
			this.procedure = (tr.com.srdc.icardea.hibernate.Procedure) owner;
		}
		
		else if (key == tr.com.srdc.icardea.hibernate.ORMConstants.KEY_EHRPHRDATA_ENCOUNTER) {
			this.encounter = (tr.com.srdc.icardea.hibernate.Encounter) owner;
		}
		
		else if (key == tr.com.srdc.icardea.hibernate.ORMConstants.KEY_EHRPHRDATA_VITALSIGN) {
			this.vitalSign = (tr.com.srdc.icardea.hibernate.VitalSign) owner;
		}
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	private int ID;
	
	private String pcc9QueryId;
	
	private String messageDateTime;
	
	private tr.com.srdc.icardea.hibernate.Patient patient;
	
	private Integer isEHR;
	
	private tr.com.srdc.icardea.hibernate.Concern concern;
	
	private tr.com.srdc.icardea.hibernate.Medication medication;
	
	private tr.com.srdc.icardea.hibernate.Immunization immunization;
	
	private tr.com.srdc.icardea.hibernate.Problem problem;
	
	private tr.com.srdc.icardea.hibernate.ImagingResult imagingResult;
	
	private tr.com.srdc.icardea.hibernate.Procedure procedure;
	
	private tr.com.srdc.icardea.hibernate.Encounter encounter;
	
	private tr.com.srdc.icardea.hibernate.VitalSign vitalSign;
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setPcc9QueryId(String value) {
		this.pcc9QueryId = value;
	}
	
	public String getPcc9QueryId() {
		return pcc9QueryId;
	}
	
	public void setMessageDateTime(String value) {
		this.messageDateTime = value;
	}
	
	public String getMessageDateTime() {
		return messageDateTime;
	}
	
	public void setIsEHR(int value) {
		setIsEHR(new Integer(value));
	}
	
	public void setIsEHR(Integer value) {
		this.isEHR = value;
	}
	
	public Integer getIsEHR() {
		return isEHR;
	}
	
	public void setPatient(tr.com.srdc.icardea.hibernate.Patient value) {
		if (patient != null) {
			patient.eHRPHRData.remove(this);
		}
		if (value != null) {
			value.eHRPHRData.add(this);
		}
	}
	
	public tr.com.srdc.icardea.hibernate.Patient getPatient() {
		return patient;
	}
	
	/**
	 * This method is for internal use only.
	 */
	private void setORM_Patient(tr.com.srdc.icardea.hibernate.Patient value) {
		this.patient = value;
	}
	
	private tr.com.srdc.icardea.hibernate.Patient getORM_Patient() {
		return patient;
	}
	
	public void setConcern(tr.com.srdc.icardea.hibernate.Concern value) {
		if (this.concern != value) {
			tr.com.srdc.icardea.hibernate.Concern lconcern = this.concern;
			this.concern = value;
			if (value != null) {
				concern.seteHRPHRData(this);
			}
			else {
				lconcern.seteHRPHRData(null);
			}
		}
	}
	
	public tr.com.srdc.icardea.hibernate.Concern getConcern() {
		return concern;
	}
	
	public void setMedication(tr.com.srdc.icardea.hibernate.Medication value) {
		if (this.medication != value) {
			tr.com.srdc.icardea.hibernate.Medication lmedication = this.medication;
			this.medication = value;
			if (value != null) {
				medication.seteHRPHRData(this);
			}
			else {
				lmedication.seteHRPHRData(null);
			}
		}
	}
	
	public tr.com.srdc.icardea.hibernate.Medication getMedication() {
		return medication;
	}
	
	public void setImmunization(tr.com.srdc.icardea.hibernate.Immunization value) {
		if (this.immunization != value) {
			tr.com.srdc.icardea.hibernate.Immunization limmunization = this.immunization;
			this.immunization = value;
			if (value != null) {
				immunization.seteHRPHRData(this);
			}
			else {
				limmunization.seteHRPHRData(null);
			}
		}
	}
	
	public tr.com.srdc.icardea.hibernate.Immunization getImmunization() {
		return immunization;
	}
	
	public void setProblem(tr.com.srdc.icardea.hibernate.Problem value) {
		if (this.problem != value) {
			tr.com.srdc.icardea.hibernate.Problem lproblem = this.problem;
			this.problem = value;
			if (value != null) {
				problem.seteHRPHRData(this);
			}
			else {
				lproblem.seteHRPHRData(null);
			}
		}
	}
	
	public tr.com.srdc.icardea.hibernate.Problem getProblem() {
		return problem;
	}
	
	public void setImagingResult(tr.com.srdc.icardea.hibernate.ImagingResult value) {
		if (this.imagingResult != value) {
			tr.com.srdc.icardea.hibernate.ImagingResult limagingResult = this.imagingResult;
			this.imagingResult = value;
			if (value != null) {
				imagingResult.seteHRPHRData(this);
			}
			else {
				limagingResult.seteHRPHRData(null);
			}
		}
	}
	
	public tr.com.srdc.icardea.hibernate.ImagingResult getImagingResult() {
		return imagingResult;
	}
	
	public void setProcedure(tr.com.srdc.icardea.hibernate.Procedure value) {
		if (this.procedure != value) {
			tr.com.srdc.icardea.hibernate.Procedure lprocedure = this.procedure;
			this.procedure = value;
			if (value != null) {
				procedure.seteHRPHRData(this);
			}
			else {
				lprocedure.seteHRPHRData(null);
			}
		}
	}
	
	public tr.com.srdc.icardea.hibernate.Procedure getProcedure() {
		return procedure;
	}
	
	public void setEncounter(tr.com.srdc.icardea.hibernate.Encounter value) {
		if (this.encounter != value) {
			tr.com.srdc.icardea.hibernate.Encounter lencounter = this.encounter;
			this.encounter = value;
			if (value != null) {
				encounter.seteHRPHRData(this);
			}
			else {
				lencounter.seteHRPHRData(null);
			}
		}
	}
	
	public tr.com.srdc.icardea.hibernate.Encounter getEncounter() {
		return encounter;
	}
	
	public void setVitalSign(tr.com.srdc.icardea.hibernate.VitalSign value) {
		if (this.vitalSign != value) {
			tr.com.srdc.icardea.hibernate.VitalSign lvitalSign = this.vitalSign;
			this.vitalSign = value;
			if (value != null) {
				vitalSign.seteHRPHRData(this);
			}
			else {
				lvitalSign.seteHRPHRData(null);
			}
		}
	}
	
	public tr.com.srdc.icardea.hibernate.VitalSign getVitalSign() {
		return vitalSign;
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
			sb.append("EHRPHRData[ ");
			sb.append("ID=").append(getID()).append(" ");
			sb.append("Pcc9QueryId=").append(getPcc9QueryId()).append(" ");
			sb.append("MessageDateTime=").append(getMessageDateTime()).append(" ");
			if (getPatient() != null)
				sb.append("Patient.Persist_ID=").append(getPatient().toString(true)).append(" ");
			else
				sb.append("Patient=null ");
			sb.append("IsEHR=").append(getIsEHR()).append(" ");
			if (getConcern() != null)
				sb.append("Concern.Persist_ID=").append(getConcern().toString(true)).append(" ");
			else
				sb.append("Concern=null ");
			if (getMedication() != null)
				sb.append("Medication.Persist_ID=").append(getMedication().toString(true)).append(" ");
			else
				sb.append("Medication=null ");
			if (getImmunization() != null)
				sb.append("Immunization.Persist_ID=").append(getImmunization().toString(true)).append(" ");
			else
				sb.append("Immunization=null ");
			if (getProblem() != null)
				sb.append("Problem.Persist_ID=").append(getProblem().toString(true)).append(" ");
			else
				sb.append("Problem=null ");
			if (getImagingResult() != null)
				sb.append("ImagingResult.Persist_ID=").append(getImagingResult().toString(true)).append(" ");
			else
				sb.append("ImagingResult=null ");
			if (getProcedure() != null)
				sb.append("Procedure.Persist_ID=").append(getProcedure().toString(true)).append(" ");
			else
				sb.append("Procedure=null ");
			if (getEncounter() != null)
				sb.append("Encounter.Persist_ID=").append(getEncounter().toString(true)).append(" ");
			else
				sb.append("Encounter=null ");
			if (getVitalSign() != null)
				sb.append("VitalSign.Persist_ID=").append(getVitalSign().toString(true)).append(" ");
			else
				sb.append("VitalSign=null ");
			sb.append("]");
			return sb.toString();
		}
	}
	
}
