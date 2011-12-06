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

public class ImagingResult {
	private static final org.apache.log4j.Logger _logger = org.apache.log4j.Logger.getLogger(ImagingResult.class);
	public ImagingResult() {
	}
	
	public static ImagingResult loadImagingResultByORMID(int ID) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return loadImagingResultByORMID(session, ID);
		}
		catch (Exception e) {
			_logger.error("loadImagingResultByORMID(int ID)", e);
			return null;
		}
	}
	
	public static ImagingResult getImagingResultByORMID(int ID) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return getImagingResultByORMID(session, ID);
		}
		catch (Exception e) {
			_logger.error("getImagingResultByORMID(int ID)", e);
			return null;
		}
	}
	
	public static ImagingResult loadImagingResultByORMID(int ID, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return loadImagingResultByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			_logger.error("loadImagingResultByORMID(int ID, org.hibernate.LockMode lockMode)", e);
			return null;
		}
	}
	
	public static ImagingResult getImagingResultByORMID(int ID, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return getImagingResultByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			_logger.error("getImagingResultByORMID(int ID, org.hibernate.LockMode lockMode)", e);
			return null;
		}
	}
	
	public static ImagingResult loadImagingResultByORMID(PersistentSession session, int ID) {
		try {
			return (ImagingResult) session.load(tr.com.srdc.icardea.hibernate.ImagingResult.class, new Integer(ID));
		}
		catch (Exception e) {
			_logger.error("loadImagingResultByORMID(PersistentSession session, int ID)", e);
			return null;
		}
	}
	
	public static ImagingResult getImagingResultByORMID(PersistentSession session, int ID) {
		try {
			return (ImagingResult) session.get(tr.com.srdc.icardea.hibernate.ImagingResult.class, new Integer(ID));
		}
		catch (Exception e) {
			_logger.error("getImagingResultByORMID(PersistentSession session, int ID)", e);
			return null;
		}
	}
	
	public static ImagingResult loadImagingResultByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) {
		try {
			return (ImagingResult) session.load(tr.com.srdc.icardea.hibernate.ImagingResult.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			_logger.error("loadImagingResultByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode)", e);
			return null;
		}
	}
	
	public static ImagingResult getImagingResultByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) {
		try {
			return (ImagingResult) session.get(tr.com.srdc.icardea.hibernate.ImagingResult.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			_logger.error("getImagingResultByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode)", e);
			return null;
		}
	}
	
	public static ImagingResult[] listImagingResultByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return listImagingResultByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("listImagingResultByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static ImagingResult[] listImagingResultByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return listImagingResultByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("listImagingResultByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static ImagingResult[] listImagingResultByQuery(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From tr.com.srdc.icardea.hibernate.ImagingResult as ImagingResult");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			List list = query.list();
			return (ImagingResult[]) list.toArray(new ImagingResult[list.size()]);
		}
		catch (Exception e) {
			_logger.error("listImagingResultByQuery(PersistentSession session, String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static ImagingResult[] listImagingResultByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From tr.com.srdc.icardea.hibernate.ImagingResult as ImagingResult");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("this", lockMode);
			List list = query.list();
			return (ImagingResult[]) list.toArray(new ImagingResult[list.size()]);
		}
		catch (Exception e) {
			_logger.error("listImagingResultByQuery(PersistentSession session, String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static ImagingResult loadImagingResultByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return loadImagingResultByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("loadImagingResultByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static ImagingResult loadImagingResultByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return loadImagingResultByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("loadImagingResultByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static ImagingResult loadImagingResultByQuery(PersistentSession session, String condition, String orderBy) {
		ImagingResult[] imagingResults = listImagingResultByQuery(session, condition, orderBy);
		if (imagingResults != null && imagingResults.length > 0)
			return imagingResults[0];
		else
			return null;
	}
	
	public static ImagingResult loadImagingResultByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		ImagingResult[] imagingResults = listImagingResultByQuery(session, condition, orderBy, lockMode);
		if (imagingResults != null && imagingResults.length > 0)
			return imagingResults[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateImagingResultByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return iterateImagingResultByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("iterateImagingResultByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static java.util.Iterator iterateImagingResultByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return iterateImagingResultByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("iterateImagingResultByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static java.util.Iterator iterateImagingResultByQuery(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From tr.com.srdc.icardea.hibernate.ImagingResult as ImagingResult");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			_logger.error("iterateImagingResultByQuery(PersistentSession session, String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static java.util.Iterator iterateImagingResultByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From tr.com.srdc.icardea.hibernate.ImagingResult as ImagingResult");
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
			_logger.error("iterateImagingResultByQuery(PersistentSession session, String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static ImagingResult loadImagingResultByCriteria(ImagingResultCriteria imagingResultCriteria) {
		ImagingResult[] imagingResults = listImagingResultByCriteria(imagingResultCriteria);
		if(imagingResults == null || imagingResults.length == 0) {
			return null;
		}
		return imagingResults[0];
	}
	
	public static ImagingResult[] listImagingResultByCriteria(ImagingResultCriteria imagingResultCriteria) {
		return imagingResultCriteria.listImagingResult();
	}
	
	public static ImagingResult createImagingResult() {
		return new tr.com.srdc.icardea.hibernate.ImagingResult();
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
				geteHRPHRData().setImagingResult(null);
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
				geteHRPHRData().setImagingResult(null);
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
	
	private String labResultCode;
	
	private String labResultText;
	
	private String effectiveTime;
	
	private String labResultValue;
	
	private String labResultValueCodeSystem;
	
	private String mediaType;
	
	private String base64Encoded;
	
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
	
	public void setLabResultCode(String value) {
		this.labResultCode = value;
	}
	
	public String getLabResultCode() {
		return labResultCode;
	}
	
	public void setLabResultText(String value) {
		this.labResultText = value;
	}
	
	public String getLabResultText() {
		return labResultText;
	}
	
	public void setEffectiveTime(String value) {
		this.effectiveTime = value;
	}
	
	public String getEffectiveTime() {
		return effectiveTime;
	}
	
	public void setLabResultValue(String value) {
		this.labResultValue = value;
	}
	
	public String getLabResultValue() {
		return labResultValue;
	}
	
	public void setLabResultValueCodeSystem(String value) {
		this.labResultValueCodeSystem = value;
	}
	
	public String getLabResultValueCodeSystem() {
		return labResultValueCodeSystem;
	}
	
	public void setMediaType(String value) {
		this.mediaType = value;
	}
	
	public String getMediaType() {
		return mediaType;
	}
	
	public void setBase64Encoded(String value) {
		this.base64Encoded = value;
	}
	
	public String getBase64Encoded() {
		return base64Encoded;
	}
	
	public void seteHRPHRData(tr.com.srdc.icardea.hibernate.EHRPHRData value) {
		if (this.eHRPHRData != value) {
			tr.com.srdc.icardea.hibernate.EHRPHRData leHRPHRData = this.eHRPHRData;
			this.eHRPHRData = value;
			if (value != null) {
				eHRPHRData.setImagingResult(this);
			}
			else {
				leHRPHRData.setImagingResult(null);
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
			sb.append("ImagingResult[ ");
			sb.append("ID=").append(getID()).append(" ");
			sb.append("CareProvisionCode=").append(getCareProvisionCode()).append(" ");
			sb.append("LabResultCode=").append(getLabResultCode()).append(" ");
			sb.append("LabResultText=").append(getLabResultText()).append(" ");
			sb.append("EffectiveTime=").append(getEffectiveTime()).append(" ");
			sb.append("LabResultValue=").append(getLabResultValue()).append(" ");
			sb.append("LabResultValueCodeSystem=").append(getLabResultValueCodeSystem()).append(" ");
			sb.append("MediaType=").append(getMediaType()).append(" ");
			sb.append("Base64Encoded=").append(getBase64Encoded()).append(" ");
			if (geteHRPHRData() != null)
				sb.append("eHRPHRData.Persist_ID=").append(geteHRPHRData().toString(true)).append(" ");
			else
				sb.append("eHRPHRData=null ");
			sb.append("]");
			return sb.toString();
		}
	}
	
}
