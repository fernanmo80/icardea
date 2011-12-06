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

public class CIEDData {
	private static final org.apache.log4j.Logger _logger = org.apache.log4j.Logger.getLogger(CIEDData.class);
	public CIEDData() {
	}
	
	public static CIEDData loadCIEDDataByORMID(int ID) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return loadCIEDDataByORMID(session, ID);
		}
		catch (Exception e) {
			_logger.error("loadCIEDDataByORMID(int ID)", e);
			return null;
		}
	}
	
	public static CIEDData getCIEDDataByORMID(int ID) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return getCIEDDataByORMID(session, ID);
		}
		catch (Exception e) {
			_logger.error("getCIEDDataByORMID(int ID)", e);
			return null;
		}
	}
	
	public static CIEDData loadCIEDDataByORMID(int ID, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return loadCIEDDataByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			_logger.error("loadCIEDDataByORMID(int ID, org.hibernate.LockMode lockMode)", e);
			return null;
		}
	}
	
	public static CIEDData getCIEDDataByORMID(int ID, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return getCIEDDataByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			_logger.error("getCIEDDataByORMID(int ID, org.hibernate.LockMode lockMode)", e);
			return null;
		}
	}
	
	public static CIEDData loadCIEDDataByORMID(PersistentSession session, int ID) {
		try {
			return (CIEDData) session.load(tr.com.srdc.icardea.hibernate.CIEDData.class, new Integer(ID));
		}
		catch (Exception e) {
			_logger.error("loadCIEDDataByORMID(PersistentSession session, int ID)", e);
			return null;
		}
	}
	
	public static CIEDData getCIEDDataByORMID(PersistentSession session, int ID) {
		try {
			return (CIEDData) session.get(tr.com.srdc.icardea.hibernate.CIEDData.class, new Integer(ID));
		}
		catch (Exception e) {
			_logger.error("getCIEDDataByORMID(PersistentSession session, int ID)", e);
			return null;
		}
	}
	
	public static CIEDData loadCIEDDataByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) {
		try {
			return (CIEDData) session.load(tr.com.srdc.icardea.hibernate.CIEDData.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			_logger.error("loadCIEDDataByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode)", e);
			return null;
		}
	}
	
	public static CIEDData getCIEDDataByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) {
		try {
			return (CIEDData) session.get(tr.com.srdc.icardea.hibernate.CIEDData.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			_logger.error("getCIEDDataByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode)", e);
			return null;
		}
	}
	
	public static CIEDData[] listCIEDDataByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return listCIEDDataByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("listCIEDDataByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static CIEDData[] listCIEDDataByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return listCIEDDataByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("listCIEDDataByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static CIEDData[] listCIEDDataByQuery(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From tr.com.srdc.icardea.hibernate.CIEDData as CIEDData");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			List list = query.list();
			return (CIEDData[]) list.toArray(new CIEDData[list.size()]);
		}
		catch (Exception e) {
			_logger.error("listCIEDDataByQuery(PersistentSession session, String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static CIEDData[] listCIEDDataByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From tr.com.srdc.icardea.hibernate.CIEDData as CIEDData");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("this", lockMode);
			List list = query.list();
			return (CIEDData[]) list.toArray(new CIEDData[list.size()]);
		}
		catch (Exception e) {
			_logger.error("listCIEDDataByQuery(PersistentSession session, String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static CIEDData loadCIEDDataByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return loadCIEDDataByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("loadCIEDDataByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static CIEDData loadCIEDDataByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return loadCIEDDataByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("loadCIEDDataByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static CIEDData loadCIEDDataByQuery(PersistentSession session, String condition, String orderBy) {
		CIEDData[] cIEDDatas = listCIEDDataByQuery(session, condition, orderBy);
		if (cIEDDatas != null && cIEDDatas.length > 0)
			return cIEDDatas[0];
		else
			return null;
	}
	
	public static CIEDData loadCIEDDataByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		CIEDData[] cIEDDatas = listCIEDDataByQuery(session, condition, orderBy, lockMode);
		if (cIEDDatas != null && cIEDDatas.length > 0)
			return cIEDDatas[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateCIEDDataByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return iterateCIEDDataByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("iterateCIEDDataByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static java.util.Iterator iterateCIEDDataByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return iterateCIEDDataByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("iterateCIEDDataByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static java.util.Iterator iterateCIEDDataByQuery(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From tr.com.srdc.icardea.hibernate.CIEDData as CIEDData");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			_logger.error("iterateCIEDDataByQuery(PersistentSession session, String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static java.util.Iterator iterateCIEDDataByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From tr.com.srdc.icardea.hibernate.CIEDData as CIEDData");
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
			_logger.error("iterateCIEDDataByQuery(PersistentSession session, String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static CIEDData loadCIEDDataByCriteria(CIEDDataCriteria cIEDDataCriteria) {
		CIEDData[] cIEDDatas = listCIEDDataByCriteria(cIEDDataCriteria);
		if(cIEDDatas == null || cIEDDatas.length == 0) {
			return null;
		}
		return cIEDDatas[0];
	}
	
	public static CIEDData[] listCIEDDataByCriteria(CIEDDataCriteria cIEDDataCriteria) {
		return cIEDDataCriteria.listCIEDData();
	}
	
	public static CIEDData createCIEDData() {
		return new tr.com.srdc.icardea.hibernate.CIEDData();
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
			if(getObservationfillerOrderNumber() != null) {
				getObservationfillerOrderNumber().setcIEDData(null);
			}
			
			if(getPatient1() != null) {
				getPatient1().cIEDData1.remove(this);
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
			if(getObservationfillerOrderNumber() != null) {
				getObservationfillerOrderNumber().setcIEDData(null);
			}
			
			if(getPatient1() != null) {
				getPatient1().cIEDData1.remove(this);
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
		if (key == tr.com.srdc.icardea.hibernate.ORMConstants.KEY_CIEDDATA_OBSERVATIONFILLERORDERNUMBER) {
			this.observationfillerOrderNumber = (tr.com.srdc.icardea.hibernate.Observation) owner;
		}
		
		else if (key == tr.com.srdc.icardea.hibernate.ORMConstants.KEY_CIEDDATA_PATIENT1) {
			this.patient1 = (tr.com.srdc.icardea.hibernate.Patient) owner;
		}
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	private int ID;
	
	private String sendingApplication;
	
	private String sendingFacility;
	
	private String receivingApplication;
	
	private String receivingFacility;
	
	private String messageTime;
	
	private String comment;
	
	private tr.com.srdc.icardea.hibernate.Observation observationfillerOrderNumber;
	
	private String receivedTime;
	
	private tr.com.srdc.icardea.hibernate.Patient patient1;
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setSendingApplication(String value) {
		this.sendingApplication = value;
	}
	
	public String getSendingApplication() {
		return sendingApplication;
	}
	
	public void setSendingFacility(String value) {
		this.sendingFacility = value;
	}
	
	public String getSendingFacility() {
		return sendingFacility;
	}
	
	public void setReceivingApplication(String value) {
		this.receivingApplication = value;
	}
	
	public String getReceivingApplication() {
		return receivingApplication;
	}
	
	public void setReceivingFacility(String value) {
		this.receivingFacility = value;
	}
	
	public String getReceivingFacility() {
		return receivingFacility;
	}
	
	public void setMessageTime(String value) {
		this.messageTime = value;
	}
	
	public String getMessageTime() {
		return messageTime;
	}
	
	public void setComment(String value) {
		this.comment = value;
	}
	
	public String getComment() {
		return comment;
	}
	
	public void setReceivedTime(String value) {
		this.receivedTime = value;
	}
	
	public String getReceivedTime() {
		return receivedTime;
	}
	
	public void setObservationfillerOrderNumber(tr.com.srdc.icardea.hibernate.Observation value) {
		if (this.observationfillerOrderNumber != value) {
			tr.com.srdc.icardea.hibernate.Observation lobservationfillerOrderNumber = this.observationfillerOrderNumber;
			this.observationfillerOrderNumber = value;
			if (value != null) {
				observationfillerOrderNumber.setcIEDData(this);
			}
			else {
				lobservationfillerOrderNumber.setcIEDData(null);
			}
		}
	}
	
	public tr.com.srdc.icardea.hibernate.Observation getObservationfillerOrderNumber() {
		return observationfillerOrderNumber;
	}
	
	public void setPatient1(tr.com.srdc.icardea.hibernate.Patient value) {
		if (patient1 != null) {
			patient1.cIEDData1.remove(this);
		}
		if (value != null) {
			value.cIEDData1.add(this);
		}
	}
	
	public tr.com.srdc.icardea.hibernate.Patient getPatient1() {
		return patient1;
	}
	
	/**
	 * This method is for internal use only.
	 */
	private void setORM_Patient1(tr.com.srdc.icardea.hibernate.Patient value) {
		this.patient1 = value;
	}
	
	private tr.com.srdc.icardea.hibernate.Patient getORM_Patient1() {
		return patient1;
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
			sb.append("CIEDData[ ");
			sb.append("ID=").append(getID()).append(" ");
			sb.append("SendingApplication=").append(getSendingApplication()).append(" ");
			sb.append("SendingFacility=").append(getSendingFacility()).append(" ");
			sb.append("ReceivingApplication=").append(getReceivingApplication()).append(" ");
			sb.append("ReceivingFacility=").append(getReceivingFacility()).append(" ");
			sb.append("MessageTime=").append(getMessageTime()).append(" ");
			sb.append("Comment=").append(getComment()).append(" ");
			if (getObservationfillerOrderNumber() != null)
				sb.append("ObservationfillerOrderNumber.Persist_ID=").append(getObservationfillerOrderNumber().toString(true)).append(" ");
			else
				sb.append("ObservationfillerOrderNumber=null ");
			sb.append("ReceivedTime=").append(getReceivedTime()).append(" ");
			if (getPatient1() != null)
				sb.append("Patient1.Persist_ID=").append(getPatient1().toString(true)).append(" ");
			else
				sb.append("Patient1=null ");
			sb.append("]");
			return sb.toString();
		}
	}
	
}
