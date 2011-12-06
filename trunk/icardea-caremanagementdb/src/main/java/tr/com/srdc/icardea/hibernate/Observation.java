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

public class Observation {
	private static final org.apache.log4j.Logger _logger = org.apache.log4j.Logger.getLogger(Observation.class);
	public Observation() {
	}
	
	public static Observation loadObservationByORMID(int ID) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return loadObservationByORMID(session, ID);
		}
		catch (Exception e) {
			_logger.error("loadObservationByORMID(int ID)", e);
			return null;
		}
	}
	
	public static Observation getObservationByORMID(int ID) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return getObservationByORMID(session, ID);
		}
		catch (Exception e) {
			_logger.error("getObservationByORMID(int ID)", e);
			return null;
		}
	}
	
	public static Observation loadObservationByORMID(int ID, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return loadObservationByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			_logger.error("loadObservationByORMID(int ID, org.hibernate.LockMode lockMode)", e);
			return null;
		}
	}
	
	public static Observation getObservationByORMID(int ID, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return getObservationByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			_logger.error("getObservationByORMID(int ID, org.hibernate.LockMode lockMode)", e);
			return null;
		}
	}
	
	public static Observation loadObservationByORMID(PersistentSession session, int ID) {
		try {
			return (Observation) session.load(tr.com.srdc.icardea.hibernate.Observation.class, new Integer(ID));
		}
		catch (Exception e) {
			_logger.error("loadObservationByORMID(PersistentSession session, int ID)", e);
			return null;
		}
	}
	
	public static Observation getObservationByORMID(PersistentSession session, int ID) {
		try {
			return (Observation) session.get(tr.com.srdc.icardea.hibernate.Observation.class, new Integer(ID));
		}
		catch (Exception e) {
			_logger.error("getObservationByORMID(PersistentSession session, int ID)", e);
			return null;
		}
	}
	
	public static Observation loadObservationByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) {
		try {
			return (Observation) session.load(tr.com.srdc.icardea.hibernate.Observation.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			_logger.error("loadObservationByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode)", e);
			return null;
		}
	}
	
	public static Observation getObservationByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) {
		try {
			return (Observation) session.get(tr.com.srdc.icardea.hibernate.Observation.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			_logger.error("getObservationByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode)", e);
			return null;
		}
	}
	
	public static Observation[] listObservationByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return listObservationByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("listObservationByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static Observation[] listObservationByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return listObservationByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("listObservationByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static Observation[] listObservationByQuery(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From tr.com.srdc.icardea.hibernate.Observation as Observation");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			List list = query.list();
			return (Observation[]) list.toArray(new Observation[list.size()]);
		}
		catch (Exception e) {
			_logger.error("listObservationByQuery(PersistentSession session, String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static Observation[] listObservationByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From tr.com.srdc.icardea.hibernate.Observation as Observation");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("this", lockMode);
			List list = query.list();
			return (Observation[]) list.toArray(new Observation[list.size()]);
		}
		catch (Exception e) {
			_logger.error("listObservationByQuery(PersistentSession session, String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static Observation loadObservationByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return loadObservationByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("loadObservationByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static Observation loadObservationByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return loadObservationByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("loadObservationByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static Observation loadObservationByQuery(PersistentSession session, String condition, String orderBy) {
		Observation[] observations = listObservationByQuery(session, condition, orderBy);
		if (observations != null && observations.length > 0)
			return observations[0];
		else
			return null;
	}
	
	public static Observation loadObservationByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		Observation[] observations = listObservationByQuery(session, condition, orderBy, lockMode);
		if (observations != null && observations.length > 0)
			return observations[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateObservationByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return iterateObservationByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("iterateObservationByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static java.util.Iterator iterateObservationByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return iterateObservationByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("iterateObservationByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static java.util.Iterator iterateObservationByQuery(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From tr.com.srdc.icardea.hibernate.Observation as Observation");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			_logger.error("iterateObservationByQuery(PersistentSession session, String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static java.util.Iterator iterateObservationByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From tr.com.srdc.icardea.hibernate.Observation as Observation");
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
			_logger.error("iterateObservationByQuery(PersistentSession session, String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static Observation loadObservationByCriteria(ObservationCriteria observationCriteria) {
		Observation[] observations = listObservationByCriteria(observationCriteria);
		if(observations == null || observations.length == 0) {
			return null;
		}
		return observations[0];
	}
	
	public static Observation[] listObservationByCriteria(ObservationCriteria observationCriteria) {
		return observationCriteria.listObservation();
	}
	
	public static Observation createObservation() {
		return new tr.com.srdc.icardea.hibernate.Observation();
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
				getSystem().setObservation(null);
			}
			
			if(getcIEDData() != null) {
				getcIEDData().setObservationfillerOrderNumber(null);
			}
			
			tr.com.srdc.icardea.hibernate.BinaryData[] lBinaryDatas = binaryData.toArray();
			for(int i = 0; i < lBinaryDatas.length; i++) {
				lBinaryDatas[i].setObservation(null);
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
				getSystem().setObservation(null);
			}
			
			if(getcIEDData() != null) {
				getcIEDData().setObservationfillerOrderNumber(null);
			}
			
			tr.com.srdc.icardea.hibernate.BinaryData[] lBinaryDatas = binaryData.toArray();
			for(int i = 0; i < lBinaryDatas.length; i++) {
				lBinaryDatas[i].setObservation(null);
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
	
	private java.util.Set this_getSet (int key) {
		if (key == tr.com.srdc.icardea.hibernate.ORMConstants.KEY_OBSERVATION_BINARYDATA) {
			return ORM_binaryData;
		}
		
		return null;
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	private int ID;
	
	private String universalServiceIdentifier;
	
	private String observationDateTime;
	
	private String observationEndDataTime;
	
	private String resultRptStatusChangeDateTime;
	
	private String resultStatus;
	
	private String attendingDoctorID;
	
	private String visitID;
	
	private String patientClass;
	
	private tr.com.srdc.icardea.hibernate.System system;
	
	private String base64String;
	
	private String abnormalFlags;
	
	private String equipmentInstanceIdentifier;
	
	private String fillerOrderNumber;
	
	private tr.com.srdc.icardea.hibernate.CIEDData cIEDData;
	
	private java.util.Set ORM_binaryData = new java.util.HashSet();
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setUniversalServiceIdentifier(String value) {
		this.universalServiceIdentifier = value;
	}
	
	public String getUniversalServiceIdentifier() {
		return universalServiceIdentifier;
	}
	
	public void setObservationDateTime(String value) {
		this.observationDateTime = value;
	}
	
	public String getObservationDateTime() {
		return observationDateTime;
	}
	
	public void setObservationEndDataTime(String value) {
		this.observationEndDataTime = value;
	}
	
	public String getObservationEndDataTime() {
		return observationEndDataTime;
	}
	
	public void setResultRptStatusChangeDateTime(String value) {
		this.resultRptStatusChangeDateTime = value;
	}
	
	public String getResultRptStatusChangeDateTime() {
		return resultRptStatusChangeDateTime;
	}
	
	public void setResultStatus(String value) {
		this.resultStatus = value;
	}
	
	public String getResultStatus() {
		return resultStatus;
	}
	
	public void setAttendingDoctorID(String value) {
		this.attendingDoctorID = value;
	}
	
	public String getAttendingDoctorID() {
		return attendingDoctorID;
	}
	
	public void setVisitID(String value) {
		this.visitID = value;
	}
	
	public String getVisitID() {
		return visitID;
	}
	
	public void setPatientClass(String value) {
		this.patientClass = value;
	}
	
	public String getPatientClass() {
		return patientClass;
	}
	
	public void setBase64String(String value) {
		this.base64String = value;
	}
	
	public String getBase64String() {
		return base64String;
	}
	
	public void setAbnormalFlags(String value) {
		this.abnormalFlags = value;
	}
	
	public String getAbnormalFlags() {
		return abnormalFlags;
	}
	
	public void setEquipmentInstanceIdentifier(String value) {
		this.equipmentInstanceIdentifier = value;
	}
	
	public String getEquipmentInstanceIdentifier() {
		return equipmentInstanceIdentifier;
	}
	
	public void setFillerOrderNumber(String value) {
		this.fillerOrderNumber = value;
	}
	
	public String getFillerOrderNumber() {
		return fillerOrderNumber;
	}
	
	public void setSystem(tr.com.srdc.icardea.hibernate.System value) {
		if (this.system != value) {
			tr.com.srdc.icardea.hibernate.System lsystem = this.system;
			this.system = value;
			if (value != null) {
				system.setObservation(this);
			}
			else {
				lsystem.setObservation(null);
			}
		}
	}
	
	public tr.com.srdc.icardea.hibernate.System getSystem() {
		return system;
	}
	
	public void setcIEDData(tr.com.srdc.icardea.hibernate.CIEDData value) {
		if (this.cIEDData != value) {
			tr.com.srdc.icardea.hibernate.CIEDData lcIEDData = this.cIEDData;
			this.cIEDData = value;
			if (value != null) {
				cIEDData.setObservationfillerOrderNumber(this);
			}
			else {
				lcIEDData.setObservationfillerOrderNumber(null);
			}
		}
	}
	
	public tr.com.srdc.icardea.hibernate.CIEDData getcIEDData() {
		return cIEDData;
	}
	
	private void setORM_BinaryData(java.util.Set value) {
		this.ORM_binaryData = value;
	}
	
	private java.util.Set getORM_BinaryData() {
		return ORM_binaryData;
	}
	
	public final tr.com.srdc.icardea.hibernate.BinaryDataSetCollection binaryData = new tr.com.srdc.icardea.hibernate.BinaryDataSetCollection(this, _ormAdapter, tr.com.srdc.icardea.hibernate.ORMConstants.KEY_OBSERVATION_BINARYDATA, tr.com.srdc.icardea.hibernate.ORMConstants.KEY_BINARYDATA_OBSERVATION, tr.com.srdc.icardea.hibernate.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return toString(false);
	}
	
	public String toString(boolean idOnly) {
		if (idOnly) {
			return String.valueOf(getID());
		}
		else {
			StringBuffer sb = new StringBuffer();
			sb.append("Observation[ ");
			sb.append("ID=").append(getID()).append(" ");
			sb.append("UniversalServiceIdentifier=").append(getUniversalServiceIdentifier()).append(" ");
			sb.append("ObservationDateTime=").append(getObservationDateTime()).append(" ");
			sb.append("ObservationEndDataTime=").append(getObservationEndDataTime()).append(" ");
			sb.append("ResultRptStatusChangeDateTime=").append(getResultRptStatusChangeDateTime()).append(" ");
			sb.append("ResultStatus=").append(getResultStatus()).append(" ");
			sb.append("AttendingDoctorID=").append(getAttendingDoctorID()).append(" ");
			sb.append("VisitID=").append(getVisitID()).append(" ");
			sb.append("PatientClass=").append(getPatientClass()).append(" ");
			if (getSystem() != null)
				sb.append("System.Persist_ID=").append(getSystem().toString(true)).append(" ");
			else
				sb.append("System=null ");
			sb.append("Base64String=").append(getBase64String()).append(" ");
			sb.append("AbnormalFlags=").append(getAbnormalFlags()).append(" ");
			sb.append("EquipmentInstanceIdentifier=").append(getEquipmentInstanceIdentifier()).append(" ");
			sb.append("FillerOrderNumber=").append(getFillerOrderNumber()).append(" ");
			if (getcIEDData() != null)
				sb.append("cIEDData.Persist_ID=").append(getcIEDData().toString(true)).append(" ");
			else
				sb.append("cIEDData=null ");
			sb.append("BinaryData.size=").append(binaryData.size()).append(" ");
			sb.append("]");
			return sb.toString();
		}
	}
	
}
