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

public class MSMT {
	private static final org.apache.log4j.Logger _logger = org.apache.log4j.Logger.getLogger(MSMT.class);
	public MSMT() {
	}
	
	public static MSMT loadMSMTByORMID(int ID) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return loadMSMTByORMID(session, ID);
		}
		catch (Exception e) {
			_logger.error("loadMSMTByORMID(int ID)", e);
			return null;
		}
	}
	
	public static MSMT getMSMTByORMID(int ID) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return getMSMTByORMID(session, ID);
		}
		catch (Exception e) {
			_logger.error("getMSMTByORMID(int ID)", e);
			return null;
		}
	}
	
	public static MSMT loadMSMTByORMID(int ID, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return loadMSMTByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			_logger.error("loadMSMTByORMID(int ID, org.hibernate.LockMode lockMode)", e);
			return null;
		}
	}
	
	public static MSMT getMSMTByORMID(int ID, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return getMSMTByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			_logger.error("getMSMTByORMID(int ID, org.hibernate.LockMode lockMode)", e);
			return null;
		}
	}
	
	public static MSMT loadMSMTByORMID(PersistentSession session, int ID) {
		try {
			return (MSMT) session.load(tr.com.srdc.icardea.hibernate.MSMT.class, new Integer(ID));
		}
		catch (Exception e) {
			_logger.error("loadMSMTByORMID(PersistentSession session, int ID)", e);
			return null;
		}
	}
	
	public static MSMT getMSMTByORMID(PersistentSession session, int ID) {
		try {
			return (MSMT) session.get(tr.com.srdc.icardea.hibernate.MSMT.class, new Integer(ID));
		}
		catch (Exception e) {
			_logger.error("getMSMTByORMID(PersistentSession session, int ID)", e);
			return null;
		}
	}
	
	public static MSMT loadMSMTByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) {
		try {
			return (MSMT) session.load(tr.com.srdc.icardea.hibernate.MSMT.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			_logger.error("loadMSMTByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode)", e);
			return null;
		}
	}
	
	public static MSMT getMSMTByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) {
		try {
			return (MSMT) session.get(tr.com.srdc.icardea.hibernate.MSMT.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			_logger.error("getMSMTByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode)", e);
			return null;
		}
	}
	
	public static MSMT[] listMSMTByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return listMSMTByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("listMSMTByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static MSMT[] listMSMTByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return listMSMTByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("listMSMTByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static MSMT[] listMSMTByQuery(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From tr.com.srdc.icardea.hibernate.MSMT as MSMT");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			List list = query.list();
			return (MSMT[]) list.toArray(new MSMT[list.size()]);
		}
		catch (Exception e) {
			_logger.error("listMSMTByQuery(PersistentSession session, String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static MSMT[] listMSMTByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From tr.com.srdc.icardea.hibernate.MSMT as MSMT");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("this", lockMode);
			List list = query.list();
			return (MSMT[]) list.toArray(new MSMT[list.size()]);
		}
		catch (Exception e) {
			_logger.error("listMSMTByQuery(PersistentSession session, String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static MSMT loadMSMTByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return loadMSMTByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("loadMSMTByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static MSMT loadMSMTByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return loadMSMTByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("loadMSMTByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static MSMT loadMSMTByQuery(PersistentSession session, String condition, String orderBy) {
		MSMT[] mSMTs = listMSMTByQuery(session, condition, orderBy);
		if (mSMTs != null && mSMTs.length > 0)
			return mSMTs[0];
		else
			return null;
	}
	
	public static MSMT loadMSMTByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		MSMT[] mSMTs = listMSMTByQuery(session, condition, orderBy, lockMode);
		if (mSMTs != null && mSMTs.length > 0)
			return mSMTs[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateMSMTByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return iterateMSMTByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("iterateMSMTByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static java.util.Iterator iterateMSMTByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return iterateMSMTByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("iterateMSMTByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static java.util.Iterator iterateMSMTByQuery(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From tr.com.srdc.icardea.hibernate.MSMT as MSMT");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			_logger.error("iterateMSMTByQuery(PersistentSession session, String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static java.util.Iterator iterateMSMTByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From tr.com.srdc.icardea.hibernate.MSMT as MSMT");
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
			_logger.error("iterateMSMTByQuery(PersistentSession session, String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static MSMT loadMSMTByCriteria(MSMTCriteria mSMTCriteria) {
		MSMT[] mSMTs = listMSMTByCriteria(mSMTCriteria);
		if(mSMTs == null || mSMTs.length == 0) {
			return null;
		}
		return mSMTs[0];
	}
	
	public static MSMT[] listMSMTByCriteria(MSMTCriteria mSMTCriteria) {
		return mSMTCriteria.listMSMT();
	}
	
	public static MSMT createMSMT() {
		return new tr.com.srdc.icardea.hibernate.MSMT();
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
				getSystem().setmSMT(null);
			}
			
			tr.com.srdc.icardea.hibernate.BATTERY2[] lbATTERY2s = bATTERY2.toArray();
			for(int i = 0; i < lbATTERY2s.length; i++) {
				lbATTERY2s[i].setmSMT(null);
			}
			tr.com.srdc.icardea.hibernate.CAP[] lcAPs = cAP.toArray();
			for(int i = 0; i < lcAPs.length; i++) {
				lcAPs[i].setmSMT(null);
			}
			tr.com.srdc.icardea.hibernate.LEADCHNLMSMT[] llEADCHNLMSMTs = lEADCHNLMSMT.toArray();
			for(int i = 0; i < llEADCHNLMSMTs.length; i++) {
				llEADCHNLMSMTs[i].setmSMT(null);
			}
			tr.com.srdc.icardea.hibernate.LEADHVCHANNELMSMT[] llEADHVCHANNELMSMTs = lEADHVCHANNELMSMT.toArray();
			for(int i = 0; i < llEADHVCHANNELMSMTs.length; i++) {
				llEADHVCHANNELMSMTs[i].setmSMT(null);
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
				getSystem().setmSMT(null);
			}
			
			tr.com.srdc.icardea.hibernate.BATTERY2[] lbATTERY2s = bATTERY2.toArray();
			for(int i = 0; i < lbATTERY2s.length; i++) {
				lbATTERY2s[i].setmSMT(null);
			}
			tr.com.srdc.icardea.hibernate.CAP[] lcAPs = cAP.toArray();
			for(int i = 0; i < lcAPs.length; i++) {
				lcAPs[i].setmSMT(null);
			}
			tr.com.srdc.icardea.hibernate.LEADCHNLMSMT[] llEADCHNLMSMTs = lEADCHNLMSMT.toArray();
			for(int i = 0; i < llEADCHNLMSMTs.length; i++) {
				llEADCHNLMSMTs[i].setmSMT(null);
			}
			tr.com.srdc.icardea.hibernate.LEADHVCHANNELMSMT[] llEADHVCHANNELMSMTs = lEADHVCHANNELMSMT.toArray();
			for(int i = 0; i < llEADHVCHANNELMSMTs.length; i++) {
				llEADHVCHANNELMSMTs[i].setmSMT(null);
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
		if (key == tr.com.srdc.icardea.hibernate.ORMConstants.KEY_MSMT_BATTERY2) {
			return ORM_bATTERY2;
		}
		else if (key == tr.com.srdc.icardea.hibernate.ORMConstants.KEY_MSMT_CAP) {
			return ORM_cAP;
		}
		else if (key == tr.com.srdc.icardea.hibernate.ORMConstants.KEY_MSMT_LEADCHNLMSMT) {
			return ORM_lEADCHNLMSMT;
		}
		else if (key == tr.com.srdc.icardea.hibernate.ORMConstants.KEY_MSMT_LEADHVCHANNELMSMT) {
			return ORM_lEADHVCHANNELMSMT;
		}
		
		return null;
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	private int ID;
	
	private tr.com.srdc.icardea.hibernate.System system;
	
	private String dtm_start;
	
	private String dtm_end;
	
	private java.util.Set ORM_bATTERY2 = new java.util.HashSet();
	
	private java.util.Set ORM_cAP = new java.util.HashSet();
	
	private java.util.Set ORM_lEADCHNLMSMT = new java.util.HashSet();
	
	private java.util.Set ORM_lEADHVCHANNELMSMT = new java.util.HashSet();
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
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
	
	public void setSystem(tr.com.srdc.icardea.hibernate.System value) {
		if (this.system != value) {
			tr.com.srdc.icardea.hibernate.System lsystem = this.system;
			this.system = value;
			if (value != null) {
				system.setmSMT(this);
			}
			else {
				lsystem.setmSMT(null);
			}
		}
	}
	
	public tr.com.srdc.icardea.hibernate.System getSystem() {
		return system;
	}
	
	private void setORM_bATTERY2(java.util.Set value) {
		this.ORM_bATTERY2 = value;
	}
	
	private java.util.Set getORM_bATTERY2() {
		return ORM_bATTERY2;
	}
	
	public final tr.com.srdc.icardea.hibernate.BATTERY2SetCollection bATTERY2 = new tr.com.srdc.icardea.hibernate.BATTERY2SetCollection(this, _ormAdapter, tr.com.srdc.icardea.hibernate.ORMConstants.KEY_MSMT_BATTERY2, tr.com.srdc.icardea.hibernate.ORMConstants.KEY_BATTERY2_MSMT, tr.com.srdc.icardea.hibernate.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_cAP(java.util.Set value) {
		this.ORM_cAP = value;
	}
	
	private java.util.Set getORM_cAP() {
		return ORM_cAP;
	}
	
	public final tr.com.srdc.icardea.hibernate.CAPSetCollection cAP = new tr.com.srdc.icardea.hibernate.CAPSetCollection(this, _ormAdapter, tr.com.srdc.icardea.hibernate.ORMConstants.KEY_MSMT_CAP, tr.com.srdc.icardea.hibernate.ORMConstants.KEY_CAP_MSMT, tr.com.srdc.icardea.hibernate.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_lEADCHNLMSMT(java.util.Set value) {
		this.ORM_lEADCHNLMSMT = value;
	}
	
	private java.util.Set getORM_lEADCHNLMSMT() {
		return ORM_lEADCHNLMSMT;
	}
	
	public final tr.com.srdc.icardea.hibernate.LEADCHNLMSMTSetCollection lEADCHNLMSMT = new tr.com.srdc.icardea.hibernate.LEADCHNLMSMTSetCollection(this, _ormAdapter, tr.com.srdc.icardea.hibernate.ORMConstants.KEY_MSMT_LEADCHNLMSMT, tr.com.srdc.icardea.hibernate.ORMConstants.KEY_LEADCHNLMSMT_MSMT, tr.com.srdc.icardea.hibernate.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_lEADHVCHANNELMSMT(java.util.Set value) {
		this.ORM_lEADHVCHANNELMSMT = value;
	}
	
	private java.util.Set getORM_lEADHVCHANNELMSMT() {
		return ORM_lEADHVCHANNELMSMT;
	}
	
	public final tr.com.srdc.icardea.hibernate.LEADHVCHANNELMSMTSetCollection lEADHVCHANNELMSMT = new tr.com.srdc.icardea.hibernate.LEADHVCHANNELMSMTSetCollection(this, _ormAdapter, tr.com.srdc.icardea.hibernate.ORMConstants.KEY_MSMT_LEADHVCHANNELMSMT, tr.com.srdc.icardea.hibernate.ORMConstants.KEY_LEADHVCHANNELMSMT_MSMT, tr.com.srdc.icardea.hibernate.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return toString(false);
	}
	
	public String toString(boolean idOnly) {
		if (idOnly) {
			return String.valueOf(getID());
		}
		else {
			StringBuffer sb = new StringBuffer();
			sb.append("MSMT[ ");
			sb.append("ID=").append(getID()).append(" ");
			if (getSystem() != null)
				sb.append("System.Persist_ID=").append(getSystem().toString(true)).append(" ");
			else
				sb.append("System=null ");
			sb.append("Dtm_start=").append(getDtm_start()).append(" ");
			sb.append("Dtm_end=").append(getDtm_end()).append(" ");
			sb.append("BATTERY2.size=").append(bATTERY2.size()).append(" ");
			sb.append("CAP.size=").append(cAP.size()).append(" ");
			sb.append("LEADCHNLMSMT.size=").append(lEADCHNLMSMT.size()).append(" ");
			sb.append("LEADHVCHANNELMSMT.size=").append(lEADHVCHANNELMSMT.size()).append(" ");
			sb.append("]");
			return sb.toString();
		}
	}
	
}
