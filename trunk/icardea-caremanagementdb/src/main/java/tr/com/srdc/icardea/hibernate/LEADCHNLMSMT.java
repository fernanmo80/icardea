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

public class LEADCHNLMSMT {
	private static final org.apache.log4j.Logger _logger = org.apache.log4j.Logger.getLogger(LEADCHNLMSMT.class);
	public LEADCHNLMSMT() {
	}
	
	public static LEADCHNLMSMT loadLEADCHNLMSMTByORMID(int ID) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return loadLEADCHNLMSMTByORMID(session, ID);
		}
		catch (Exception e) {
			_logger.error("loadLEADCHNLMSMTByORMID(int ID)", e);
			return null;
		}
	}
	
	public static LEADCHNLMSMT getLEADCHNLMSMTByORMID(int ID) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return getLEADCHNLMSMTByORMID(session, ID);
		}
		catch (Exception e) {
			_logger.error("getLEADCHNLMSMTByORMID(int ID)", e);
			return null;
		}
	}
	
	public static LEADCHNLMSMT loadLEADCHNLMSMTByORMID(int ID, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return loadLEADCHNLMSMTByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			_logger.error("loadLEADCHNLMSMTByORMID(int ID, org.hibernate.LockMode lockMode)", e);
			return null;
		}
	}
	
	public static LEADCHNLMSMT getLEADCHNLMSMTByORMID(int ID, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return getLEADCHNLMSMTByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			_logger.error("getLEADCHNLMSMTByORMID(int ID, org.hibernate.LockMode lockMode)", e);
			return null;
		}
	}
	
	public static LEADCHNLMSMT loadLEADCHNLMSMTByORMID(PersistentSession session, int ID) {
		try {
			return (LEADCHNLMSMT) session.load(tr.com.srdc.icardea.hibernate.LEADCHNLMSMT.class, new Integer(ID));
		}
		catch (Exception e) {
			_logger.error("loadLEADCHNLMSMTByORMID(PersistentSession session, int ID)", e);
			return null;
		}
	}
	
	public static LEADCHNLMSMT getLEADCHNLMSMTByORMID(PersistentSession session, int ID) {
		try {
			return (LEADCHNLMSMT) session.get(tr.com.srdc.icardea.hibernate.LEADCHNLMSMT.class, new Integer(ID));
		}
		catch (Exception e) {
			_logger.error("getLEADCHNLMSMTByORMID(PersistentSession session, int ID)", e);
			return null;
		}
	}
	
	public static LEADCHNLMSMT loadLEADCHNLMSMTByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) {
		try {
			return (LEADCHNLMSMT) session.load(tr.com.srdc.icardea.hibernate.LEADCHNLMSMT.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			_logger.error("loadLEADCHNLMSMTByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode)", e);
			return null;
		}
	}
	
	public static LEADCHNLMSMT getLEADCHNLMSMTByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) {
		try {
			return (LEADCHNLMSMT) session.get(tr.com.srdc.icardea.hibernate.LEADCHNLMSMT.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			_logger.error("getLEADCHNLMSMTByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode)", e);
			return null;
		}
	}
	
	public static LEADCHNLMSMT[] listLEADCHNLMSMTByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return listLEADCHNLMSMTByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("listLEADCHNLMSMTByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static LEADCHNLMSMT[] listLEADCHNLMSMTByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return listLEADCHNLMSMTByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("listLEADCHNLMSMTByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static LEADCHNLMSMT[] listLEADCHNLMSMTByQuery(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From tr.com.srdc.icardea.hibernate.LEADCHNLMSMT as LEADCHNLMSMT");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			List list = query.list();
			return (LEADCHNLMSMT[]) list.toArray(new LEADCHNLMSMT[list.size()]);
		}
		catch (Exception e) {
			_logger.error("listLEADCHNLMSMTByQuery(PersistentSession session, String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static LEADCHNLMSMT[] listLEADCHNLMSMTByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From tr.com.srdc.icardea.hibernate.LEADCHNLMSMT as LEADCHNLMSMT");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("this", lockMode);
			List list = query.list();
			return (LEADCHNLMSMT[]) list.toArray(new LEADCHNLMSMT[list.size()]);
		}
		catch (Exception e) {
			_logger.error("listLEADCHNLMSMTByQuery(PersistentSession session, String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static LEADCHNLMSMT loadLEADCHNLMSMTByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return loadLEADCHNLMSMTByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("loadLEADCHNLMSMTByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static LEADCHNLMSMT loadLEADCHNLMSMTByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return loadLEADCHNLMSMTByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("loadLEADCHNLMSMTByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static LEADCHNLMSMT loadLEADCHNLMSMTByQuery(PersistentSession session, String condition, String orderBy) {
		LEADCHNLMSMT[] lEADCHNLMSMTs = listLEADCHNLMSMTByQuery(session, condition, orderBy);
		if (lEADCHNLMSMTs != null && lEADCHNLMSMTs.length > 0)
			return lEADCHNLMSMTs[0];
		else
			return null;
	}
	
	public static LEADCHNLMSMT loadLEADCHNLMSMTByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		LEADCHNLMSMT[] lEADCHNLMSMTs = listLEADCHNLMSMTByQuery(session, condition, orderBy, lockMode);
		if (lEADCHNLMSMTs != null && lEADCHNLMSMTs.length > 0)
			return lEADCHNLMSMTs[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateLEADCHNLMSMTByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return iterateLEADCHNLMSMTByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("iterateLEADCHNLMSMTByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static java.util.Iterator iterateLEADCHNLMSMTByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return iterateLEADCHNLMSMTByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("iterateLEADCHNLMSMTByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static java.util.Iterator iterateLEADCHNLMSMTByQuery(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From tr.com.srdc.icardea.hibernate.LEADCHNLMSMT as LEADCHNLMSMT");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			_logger.error("iterateLEADCHNLMSMTByQuery(PersistentSession session, String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static java.util.Iterator iterateLEADCHNLMSMTByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From tr.com.srdc.icardea.hibernate.LEADCHNLMSMT as LEADCHNLMSMT");
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
			_logger.error("iterateLEADCHNLMSMTByQuery(PersistentSession session, String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static LEADCHNLMSMT loadLEADCHNLMSMTByCriteria(LEADCHNLMSMTCriteria lEADCHNLMSMTCriteria) {
		LEADCHNLMSMT[] lEADCHNLMSMTs = listLEADCHNLMSMTByCriteria(lEADCHNLMSMTCriteria);
		if(lEADCHNLMSMTs == null || lEADCHNLMSMTs.length == 0) {
			return null;
		}
		return lEADCHNLMSMTs[0];
	}
	
	public static LEADCHNLMSMT[] listLEADCHNLMSMTByCriteria(LEADCHNLMSMTCriteria lEADCHNLMSMTCriteria) {
		return lEADCHNLMSMTCriteria.listLEADCHNLMSMT();
	}
	
	public static LEADCHNLMSMT createLEADCHNLMSMT() {
		return new tr.com.srdc.icardea.hibernate.LEADCHNLMSMT();
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
			if(getmSMT() != null) {
				getmSMT().lEADCHNLMSMT.remove(this);
			}
			
			if(getsENSINGMSMT() != null) {
				getsENSINGMSMT().setlEADCHNLMSMT(null);
			}
			
			if(getpACINGTHRESHOLD() != null) {
				getpACINGTHRESHOLD().setlEADCHNLMSMT(null);
			}
			
			if(getiMPEDANCE() != null) {
				getiMPEDANCE().setlEADCHNLMSMT(null);
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
			if(getmSMT() != null) {
				getmSMT().lEADCHNLMSMT.remove(this);
			}
			
			if(getsENSINGMSMT() != null) {
				getsENSINGMSMT().setlEADCHNLMSMT(null);
			}
			
			if(getpACINGTHRESHOLD() != null) {
				getpACINGTHRESHOLD().setlEADCHNLMSMT(null);
			}
			
			if(getiMPEDANCE() != null) {
				getiMPEDANCE().setlEADCHNLMSMT(null);
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
		if (key == tr.com.srdc.icardea.hibernate.ORMConstants.KEY_LEADCHNLMSMT_MSMT) {
			this.mSMT = (tr.com.srdc.icardea.hibernate.MSMT) owner;
		}
		
		else if (key == tr.com.srdc.icardea.hibernate.ORMConstants.KEY_LEADCHNLMSMT_SENSINGMSMT) {
			this.sENSINGMSMT = (tr.com.srdc.icardea.hibernate.SENSINGMSMT) owner;
		}
		
		else if (key == tr.com.srdc.icardea.hibernate.ORMConstants.KEY_LEADCHNLMSMT_PACINGTHRESHOLD) {
			this.pACINGTHRESHOLD = (tr.com.srdc.icardea.hibernate.PACINGTHRESHOLD) owner;
		}
		
		else if (key == tr.com.srdc.icardea.hibernate.ORMConstants.KEY_LEADCHNLMSMT_IMPEDANCE) {
			this.iMPEDANCE = (tr.com.srdc.icardea.hibernate.IMPEDANCE) owner;
		}
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	private int ID;
	
	private tr.com.srdc.icardea.hibernate.MSMT mSMT;
	
	private String chamber;
	
	private String dtm_start;
	
	private String dtm_end;
	
	private String lead_channel_status;
	
	private Integer subID;
	
	private String dtm;
	
	private tr.com.srdc.icardea.hibernate.SENSINGMSMT sENSINGMSMT;
	
	private tr.com.srdc.icardea.hibernate.PACINGTHRESHOLD pACINGTHRESHOLD;
	
	private tr.com.srdc.icardea.hibernate.IMPEDANCE iMPEDANCE;
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setChamber(String value) {
		this.chamber = value;
	}
	
	public String getChamber() {
		return chamber;
	}
	
	public void setDtm_start(String value) {
		this.dtm_start = value;
	}
	
	public String getDtm_start() {
		return dtm_start;
	}
	
	public void setDtm_end(String value) {
		this.dtm_end = value;
	}
	
	public String getDtm_end() {
		return dtm_end;
	}
	
	public void setLead_channel_status(String value) {
		this.lead_channel_status = value;
	}
	
	public String getLead_channel_status() {
		return lead_channel_status;
	}
	
	public void setSubID(int value) {
		setSubID(new Integer(value));
	}
	
	public void setSubID(Integer value) {
		this.subID = value;
	}
	
	public Integer getSubID() {
		return subID;
	}
	
	public void setDtm(String value) {
		this.dtm = value;
	}
	
	public String getDtm() {
		return dtm;
	}
	
	public void setmSMT(tr.com.srdc.icardea.hibernate.MSMT value) {
		if (mSMT != null) {
			mSMT.lEADCHNLMSMT.remove(this);
		}
		if (value != null) {
			value.lEADCHNLMSMT.add(this);
		}
	}
	
	public tr.com.srdc.icardea.hibernate.MSMT getmSMT() {
		return mSMT;
	}
	
	/**
	 * This method is for internal use only.
	 */
	private void setORM_mSMT(tr.com.srdc.icardea.hibernate.MSMT value) {
		this.mSMT = value;
	}
	
	private tr.com.srdc.icardea.hibernate.MSMT getORM_MSMT() {
		return mSMT;
	}
	
	public void setsENSINGMSMT(tr.com.srdc.icardea.hibernate.SENSINGMSMT value) {
		if (this.sENSINGMSMT != value) {
			tr.com.srdc.icardea.hibernate.SENSINGMSMT lsENSINGMSMT = this.sENSINGMSMT;
			this.sENSINGMSMT = value;
			if (value != null) {
				sENSINGMSMT.setlEADCHNLMSMT(this);
			}
			else {
				lsENSINGMSMT.setlEADCHNLMSMT(null);
			}
		}
	}
	
	public tr.com.srdc.icardea.hibernate.SENSINGMSMT getsENSINGMSMT() {
		return sENSINGMSMT;
	}
	
	public void setpACINGTHRESHOLD(tr.com.srdc.icardea.hibernate.PACINGTHRESHOLD value) {
		if (this.pACINGTHRESHOLD != value) {
			tr.com.srdc.icardea.hibernate.PACINGTHRESHOLD lpACINGTHRESHOLD = this.pACINGTHRESHOLD;
			this.pACINGTHRESHOLD = value;
			if (value != null) {
				pACINGTHRESHOLD.setlEADCHNLMSMT(this);
			}
			else {
				lpACINGTHRESHOLD.setlEADCHNLMSMT(null);
			}
		}
	}
	
	public tr.com.srdc.icardea.hibernate.PACINGTHRESHOLD getpACINGTHRESHOLD() {
		return pACINGTHRESHOLD;
	}
	
	public void setiMPEDANCE(tr.com.srdc.icardea.hibernate.IMPEDANCE value) {
		if (this.iMPEDANCE != value) {
			tr.com.srdc.icardea.hibernate.IMPEDANCE liMPEDANCE = this.iMPEDANCE;
			this.iMPEDANCE = value;
			if (value != null) {
				iMPEDANCE.setlEADCHNLMSMT(this);
			}
			else {
				liMPEDANCE.setlEADCHNLMSMT(null);
			}
		}
	}
	
	public tr.com.srdc.icardea.hibernate.IMPEDANCE getiMPEDANCE() {
		return iMPEDANCE;
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
			sb.append("LEADCHNLMSMT[ ");
			sb.append("ID=").append(getID()).append(" ");
			if (getmSMT() != null)
				sb.append("mSMT.Persist_ID=").append(getmSMT().toString(true)).append(" ");
			else
				sb.append("mSMT=null ");
			sb.append("Chamber=").append(getChamber()).append(" ");
			sb.append("Dtm_start=").append(getDtm_start()).append(" ");
			sb.append("Dtm_end=").append(getDtm_end()).append(" ");
			sb.append("Lead_channel_status=").append(getLead_channel_status()).append(" ");
			sb.append("SubID=").append(getSubID()).append(" ");
			sb.append("Dtm=").append(getDtm()).append(" ");
			if (getsENSINGMSMT() != null)
				sb.append("sENSINGMSMT.Persist_ID=").append(getsENSINGMSMT().toString(true)).append(" ");
			else
				sb.append("sENSINGMSMT=null ");
			if (getpACINGTHRESHOLD() != null)
				sb.append("pACINGTHRESHOLD.Persist_ID=").append(getpACINGTHRESHOLD().toString(true)).append(" ");
			else
				sb.append("pACINGTHRESHOLD=null ");
			if (getiMPEDANCE() != null)
				sb.append("iMPEDANCE.Persist_ID=").append(getiMPEDANCE().toString(true)).append(" ");
			else
				sb.append("iMPEDANCE=null ");
			sb.append("]");
			return sb.toString();
		}
	}
	
}
