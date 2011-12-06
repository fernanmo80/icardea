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

public class Patient {
	private static final org.apache.log4j.Logger _logger = org.apache.log4j.Logger.getLogger(Patient.class);
	public Patient() {
	}
	
	public static Patient loadPatientByORMID(int ID) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return loadPatientByORMID(session, ID);
		}
		catch (Exception e) {
			_logger.error("loadPatientByORMID(int ID)", e);
			return null;
		}
	}
	
	public static Patient getPatientByORMID(int ID) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return getPatientByORMID(session, ID);
		}
		catch (Exception e) {
			_logger.error("getPatientByORMID(int ID)", e);
			return null;
		}
	}
	
	public static Patient loadPatientByORMID(int ID, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return loadPatientByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			_logger.error("loadPatientByORMID(int ID, org.hibernate.LockMode lockMode)", e);
			return null;
		}
	}
	
	public static Patient getPatientByORMID(int ID, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return getPatientByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			_logger.error("getPatientByORMID(int ID, org.hibernate.LockMode lockMode)", e);
			return null;
		}
	}
	
	public static Patient loadPatientByORMID(PersistentSession session, int ID) {
		try {
			return (Patient) session.load(tr.com.srdc.icardea.hibernate.Patient.class, new Integer(ID));
		}
		catch (Exception e) {
			_logger.error("loadPatientByORMID(PersistentSession session, int ID)", e);
			return null;
		}
	}
	
	public static Patient getPatientByORMID(PersistentSession session, int ID) {
		try {
			return (Patient) session.get(tr.com.srdc.icardea.hibernate.Patient.class, new Integer(ID));
		}
		catch (Exception e) {
			_logger.error("getPatientByORMID(PersistentSession session, int ID)", e);
			return null;
		}
	}
	
	public static Patient loadPatientByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) {
		try {
			return (Patient) session.load(tr.com.srdc.icardea.hibernate.Patient.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			_logger.error("loadPatientByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode)", e);
			return null;
		}
	}
	
	public static Patient getPatientByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) {
		try {
			return (Patient) session.get(tr.com.srdc.icardea.hibernate.Patient.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			_logger.error("getPatientByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode)", e);
			return null;
		}
	}
	
	public static Patient[] listPatientByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return listPatientByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("listPatientByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static Patient[] listPatientByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return listPatientByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("listPatientByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static Patient[] listPatientByQuery(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From tr.com.srdc.icardea.hibernate.Patient as Patient");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			List list = query.list();
			return (Patient[]) list.toArray(new Patient[list.size()]);
		}
		catch (Exception e) {
			_logger.error("listPatientByQuery(PersistentSession session, String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static Patient[] listPatientByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From tr.com.srdc.icardea.hibernate.Patient as Patient");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("this", lockMode);
			List list = query.list();
			return (Patient[]) list.toArray(new Patient[list.size()]);
		}
		catch (Exception e) {
			_logger.error("listPatientByQuery(PersistentSession session, String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static Patient loadPatientByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return loadPatientByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("loadPatientByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static Patient loadPatientByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return loadPatientByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("loadPatientByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static Patient loadPatientByQuery(PersistentSession session, String condition, String orderBy) {
		Patient[] patients = listPatientByQuery(session, condition, orderBy);
		if (patients != null && patients.length > 0)
			return patients[0];
		else
			return null;
	}
	
	public static Patient loadPatientByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		Patient[] patients = listPatientByQuery(session, condition, orderBy, lockMode);
		if (patients != null && patients.length > 0)
			return patients[0];
		else
			return null;
	}
	
	public static java.util.Iterator iteratePatientByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return iteratePatientByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("iteratePatientByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static java.util.Iterator iteratePatientByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return iteratePatientByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("iteratePatientByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static java.util.Iterator iteratePatientByQuery(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From tr.com.srdc.icardea.hibernate.Patient as Patient");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			_logger.error("iteratePatientByQuery(PersistentSession session, String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static java.util.Iterator iteratePatientByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From tr.com.srdc.icardea.hibernate.Patient as Patient");
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
			_logger.error("iteratePatientByQuery(PersistentSession session, String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static Patient loadPatientByCriteria(PatientCriteria patientCriteria) {
		Patient[] patients = listPatientByCriteria(patientCriteria);
		if(patients == null || patients.length == 0) {
			return null;
		}
		return patients[0];
	}
	
	public static Patient[] listPatientByCriteria(PatientCriteria patientCriteria) {
		return patientCriteria.listPatient();
	}
	
	public static Patient createPatient() {
		return new tr.com.srdc.icardea.hibernate.Patient();
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
			tr.com.srdc.icardea.hibernate.EHRPHRData[] leHRPHRDatas = eHRPHRData.toArray();
			for(int i = 0; i < leHRPHRDatas.length; i++) {
				leHRPHRDatas[i].setPatient(null);
			}
			tr.com.srdc.icardea.hibernate.CIEDData[] lcIEDData1s = cIEDData1.toArray();
			for(int i = 0; i < lcIEDData1s.length; i++) {
				lcIEDData1s[i].setPatient1(null);
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
			tr.com.srdc.icardea.hibernate.EHRPHRData[] leHRPHRDatas = eHRPHRData.toArray();
			for(int i = 0; i < leHRPHRDatas.length; i++) {
				leHRPHRDatas[i].setPatient(null);
			}
			tr.com.srdc.icardea.hibernate.CIEDData[] lcIEDData1s = cIEDData1.toArray();
			for(int i = 0; i < lcIEDData1s.length; i++) {
				lcIEDData1s[i].setPatient1(null);
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
		if (key == tr.com.srdc.icardea.hibernate.ORMConstants.KEY_PATIENT_EHRPHRDATA) {
			return ORM_eHRPHRData;
		}
		else if (key == tr.com.srdc.icardea.hibernate.ORMConstants.KEY_PATIENT_CIEDDATA1) {
			return ORM_cIEDData1;
		}
		
		return null;
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	private int ID;
	
	private String assigningAuthority;
	
	private String identifierTypeCode;
	
	private String givenName;
	
	private String familyName;
	
	private String secondName;
	
	private String dateTimeOfBirth;
	
	private String administrativeSex;
	
	private String street;
	
	private String city;
	
	private String postalCode;
	
	private String country;
	
	private String patientIdentifier;
	
	private String citizenshipNumber;
	
	private java.util.Set ORM_eHRPHRData = new java.util.HashSet();
	
	private java.util.Set ORM_cIEDData1 = new java.util.HashSet();
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setAssigningAuthority(String value) {
		this.assigningAuthority = value;
	}
	
	public String getAssigningAuthority() {
		return assigningAuthority;
	}
	
	public void setIdentifierTypeCode(String value) {
		this.identifierTypeCode = value;
	}
	
	public String getIdentifierTypeCode() {
		return identifierTypeCode;
	}
	
	public void setGivenName(String value) {
		this.givenName = value;
	}
	
	public String getGivenName() {
		return givenName;
	}
	
	public void setFamilyName(String value) {
		this.familyName = value;
	}
	
	public String getFamilyName() {
		return familyName;
	}
	
	public void setSecondName(String value) {
		this.secondName = value;
	}
	
	public String getSecondName() {
		return secondName;
	}
	
	public void setDateTimeOfBirth(String value) {
		this.dateTimeOfBirth = value;
	}
	
	public String getDateTimeOfBirth() {
		return dateTimeOfBirth;
	}
	
	public void setAdministrativeSex(String value) {
		this.administrativeSex = value;
	}
	
	public String getAdministrativeSex() {
		return administrativeSex;
	}
	
	public void setStreet(String value) {
		this.street = value;
	}
	
	public String getStreet() {
		return street;
	}
	
	public void setCity(String value) {
		this.city = value;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setPostalCode(String value) {
		this.postalCode = value;
	}
	
	public String getPostalCode() {
		return postalCode;
	}
	
	public void setCountry(String value) {
		this.country = value;
	}
	
	public String getCountry() {
		return country;
	}
	
	public void setPatientIdentifier(String value) {
		this.patientIdentifier = value;
	}
	
	public String getPatientIdentifier() {
		return patientIdentifier;
	}
	
	public void setCitizenshipNumber(String value) {
		this.citizenshipNumber = value;
	}
	
	public String getCitizenshipNumber() {
		return citizenshipNumber;
	}
	
	private void setORM_eHRPHRData(java.util.Set value) {
		this.ORM_eHRPHRData = value;
	}
	
	private java.util.Set getORM_eHRPHRData() {
		return ORM_eHRPHRData;
	}
	
	public final tr.com.srdc.icardea.hibernate.EHRPHRDataSetCollection eHRPHRData = new tr.com.srdc.icardea.hibernate.EHRPHRDataSetCollection(this, _ormAdapter, tr.com.srdc.icardea.hibernate.ORMConstants.KEY_PATIENT_EHRPHRDATA, tr.com.srdc.icardea.hibernate.ORMConstants.KEY_EHRPHRDATA_PATIENT, tr.com.srdc.icardea.hibernate.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_cIEDData1(java.util.Set value) {
		this.ORM_cIEDData1 = value;
	}
	
	private java.util.Set getORM_cIEDData1() {
		return ORM_cIEDData1;
	}
	
	public final tr.com.srdc.icardea.hibernate.CIEDDataSetCollection cIEDData1 = new tr.com.srdc.icardea.hibernate.CIEDDataSetCollection(this, _ormAdapter, tr.com.srdc.icardea.hibernate.ORMConstants.KEY_PATIENT_CIEDDATA1, tr.com.srdc.icardea.hibernate.ORMConstants.KEY_CIEDDATA_PATIENT1, tr.com.srdc.icardea.hibernate.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return toString(false);
	}
	
	public String toString(boolean idOnly) {
		if (idOnly) {
			return String.valueOf(getID());
		}
		else {
			StringBuffer sb = new StringBuffer();
			sb.append("Patient[ ");
			sb.append("ID=").append(getID()).append(" ");
			sb.append("AssigningAuthority=").append(getAssigningAuthority()).append(" ");
			sb.append("IdentifierTypeCode=").append(getIdentifierTypeCode()).append(" ");
			sb.append("GivenName=").append(getGivenName()).append(" ");
			sb.append("FamilyName=").append(getFamilyName()).append(" ");
			sb.append("SecondName=").append(getSecondName()).append(" ");
			sb.append("DateTimeOfBirth=").append(getDateTimeOfBirth()).append(" ");
			sb.append("AdministrativeSex=").append(getAdministrativeSex()).append(" ");
			sb.append("Street=").append(getStreet()).append(" ");
			sb.append("City=").append(getCity()).append(" ");
			sb.append("PostalCode=").append(getPostalCode()).append(" ");
			sb.append("Country=").append(getCountry()).append(" ");
			sb.append("PatientIdentifier=").append(getPatientIdentifier()).append(" ");
			sb.append("CitizenshipNumber=").append(getCitizenshipNumber()).append(" ");
			sb.append("EHRPHRData.size=").append(eHRPHRData.size()).append(" ");
			sb.append("CIEDData1.size=").append(cIEDData1.size()).append(" ");
			sb.append("]");
			return sb.toString();
		}
	}
	
}
