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

public class BinaryData {
	private static final org.apache.log4j.Logger _logger = org.apache.log4j.Logger.getLogger(BinaryData.class);
	public BinaryData() {
	}
	
	public static BinaryData loadBinaryDataByORMID(int ID) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return loadBinaryDataByORMID(session, ID);
		}
		catch (Exception e) {
			_logger.error("loadBinaryDataByORMID(int ID)", e);
			return null;
		}
	}
	
	public static BinaryData getBinaryDataByORMID(int ID) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return getBinaryDataByORMID(session, ID);
		}
		catch (Exception e) {
			_logger.error("getBinaryDataByORMID(int ID)", e);
			return null;
		}
	}
	
	public static BinaryData loadBinaryDataByORMID(int ID, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return loadBinaryDataByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			_logger.error("loadBinaryDataByORMID(int ID, org.hibernate.LockMode lockMode)", e);
			return null;
		}
	}
	
	public static BinaryData getBinaryDataByORMID(int ID, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return getBinaryDataByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			_logger.error("getBinaryDataByORMID(int ID, org.hibernate.LockMode lockMode)", e);
			return null;
		}
	}
	
	public static BinaryData loadBinaryDataByORMID(PersistentSession session, int ID) {
		try {
			return (BinaryData) session.load(tr.com.srdc.icardea.hibernate.BinaryData.class, new Integer(ID));
		}
		catch (Exception e) {
			_logger.error("loadBinaryDataByORMID(PersistentSession session, int ID)", e);
			return null;
		}
	}
	
	public static BinaryData getBinaryDataByORMID(PersistentSession session, int ID) {
		try {
			return (BinaryData) session.get(tr.com.srdc.icardea.hibernate.BinaryData.class, new Integer(ID));
		}
		catch (Exception e) {
			_logger.error("getBinaryDataByORMID(PersistentSession session, int ID)", e);
			return null;
		}
	}
	
	public static BinaryData loadBinaryDataByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) {
		try {
			return (BinaryData) session.load(tr.com.srdc.icardea.hibernate.BinaryData.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			_logger.error("loadBinaryDataByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode)", e);
			return null;
		}
	}
	
	public static BinaryData getBinaryDataByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) {
		try {
			return (BinaryData) session.get(tr.com.srdc.icardea.hibernate.BinaryData.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			_logger.error("getBinaryDataByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode)", e);
			return null;
		}
	}
	
	public static BinaryData[] listBinaryDataByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return listBinaryDataByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("listBinaryDataByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static BinaryData[] listBinaryDataByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return listBinaryDataByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("listBinaryDataByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static BinaryData[] listBinaryDataByQuery(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From tr.com.srdc.icardea.hibernate.BinaryData as BinaryData");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			List list = query.list();
			return (BinaryData[]) list.toArray(new BinaryData[list.size()]);
		}
		catch (Exception e) {
			_logger.error("listBinaryDataByQuery(PersistentSession session, String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static BinaryData[] listBinaryDataByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From tr.com.srdc.icardea.hibernate.BinaryData as BinaryData");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("this", lockMode);
			List list = query.list();
			return (BinaryData[]) list.toArray(new BinaryData[list.size()]);
		}
		catch (Exception e) {
			_logger.error("listBinaryDataByQuery(PersistentSession session, String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static BinaryData loadBinaryDataByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return loadBinaryDataByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("loadBinaryDataByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static BinaryData loadBinaryDataByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return loadBinaryDataByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("loadBinaryDataByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static BinaryData loadBinaryDataByQuery(PersistentSession session, String condition, String orderBy) {
		BinaryData[] binaryDatas = listBinaryDataByQuery(session, condition, orderBy);
		if (binaryDatas != null && binaryDatas.length > 0)
			return binaryDatas[0];
		else
			return null;
	}
	
	public static BinaryData loadBinaryDataByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		BinaryData[] binaryDatas = listBinaryDataByQuery(session, condition, orderBy, lockMode);
		if (binaryDatas != null && binaryDatas.length > 0)
			return binaryDatas[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateBinaryDataByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return iterateBinaryDataByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("iterateBinaryDataByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static java.util.Iterator iterateBinaryDataByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return iterateBinaryDataByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("iterateBinaryDataByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static java.util.Iterator iterateBinaryDataByQuery(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From tr.com.srdc.icardea.hibernate.BinaryData as BinaryData");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			_logger.error("iterateBinaryDataByQuery(PersistentSession session, String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static java.util.Iterator iterateBinaryDataByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From tr.com.srdc.icardea.hibernate.BinaryData as BinaryData");
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
			_logger.error("iterateBinaryDataByQuery(PersistentSession session, String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static BinaryData loadBinaryDataByCriteria(BinaryDataCriteria binaryDataCriteria) {
		BinaryData[] binaryDatas = listBinaryDataByCriteria(binaryDataCriteria);
		if(binaryDatas == null || binaryDatas.length == 0) {
			return null;
		}
		return binaryDatas[0];
	}
	
	public static BinaryData[] listBinaryDataByCriteria(BinaryDataCriteria binaryDataCriteria) {
		return binaryDataCriteria.listBinaryData();
	}
	
	public static BinaryData createBinaryData() {
		return new tr.com.srdc.icardea.hibernate.BinaryData();
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
			if(getObservation() != null) {
				getObservation().binaryData.remove(this);
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
			if(getObservation() != null) {
				getObservation().binaryData.remove(this);
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
		if (key == tr.com.srdc.icardea.hibernate.ORMConstants.KEY_BINARYDATA_OBSERVATION) {
			this.observation = (tr.com.srdc.icardea.hibernate.Observation) owner;
		}
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	private int ID;
	
	private String base64String;
	
	private tr.com.srdc.icardea.hibernate.Observation observation;
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setBase64String(String value) {
		this.base64String = value;
	}
	
	public String getBase64String() {
		return base64String;
	}
	
	public void setObservation(tr.com.srdc.icardea.hibernate.Observation value) {
		if (observation != null) {
			observation.binaryData.remove(this);
		}
		if (value != null) {
			value.binaryData.add(this);
		}
	}
	
	public tr.com.srdc.icardea.hibernate.Observation getObservation() {
		return observation;
	}
	
	/**
	 * This method is for internal use only.
	 */
	private void setORM_Observation(tr.com.srdc.icardea.hibernate.Observation value) {
		this.observation = value;
	}
	
	private tr.com.srdc.icardea.hibernate.Observation getORM_Observation() {
		return observation;
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
			sb.append("BinaryData[ ");
			sb.append("ID=").append(getID()).append(" ");
			sb.append("Base64String=").append(getBase64String()).append(" ");
			if (getObservation() != null)
				sb.append("Observation.Persist_ID=").append(getObservation().toString(true)).append(" ");
			else
				sb.append("Observation=null ");
			sb.append("]");
			return sb.toString();
		}
	}
	
}
