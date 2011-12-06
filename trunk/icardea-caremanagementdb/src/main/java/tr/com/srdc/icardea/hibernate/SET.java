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

public class SET {
	private static final org.apache.log4j.Logger _logger = org.apache.log4j.Logger.getLogger(SET.class);
	public SET() {
	}
	
	public static SET loadSETByORMID(int ID) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return loadSETByORMID(session, ID);
		}
		catch (Exception e) {
			_logger.error("loadSETByORMID(int ID)", e);
			return null;
		}
	}
	
	public static SET getSETByORMID(int ID) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return getSETByORMID(session, ID);
		}
		catch (Exception e) {
			_logger.error("getSETByORMID(int ID)", e);
			return null;
		}
	}
	
	public static SET loadSETByORMID(int ID, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return loadSETByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			_logger.error("loadSETByORMID(int ID, org.hibernate.LockMode lockMode)", e);
			return null;
		}
	}
	
	public static SET getSETByORMID(int ID, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return getSETByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			_logger.error("getSETByORMID(int ID, org.hibernate.LockMode lockMode)", e);
			return null;
		}
	}
	
	public static SET loadSETByORMID(PersistentSession session, int ID) {
		try {
			return (SET) session.load(tr.com.srdc.icardea.hibernate.SET.class, new Integer(ID));
		}
		catch (Exception e) {
			_logger.error("loadSETByORMID(PersistentSession session, int ID)", e);
			return null;
		}
	}
	
	public static SET getSETByORMID(PersistentSession session, int ID) {
		try {
			return (SET) session.get(tr.com.srdc.icardea.hibernate.SET.class, new Integer(ID));
		}
		catch (Exception e) {
			_logger.error("getSETByORMID(PersistentSession session, int ID)", e);
			return null;
		}
	}
	
	public static SET loadSETByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) {
		try {
			return (SET) session.load(tr.com.srdc.icardea.hibernate.SET.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			_logger.error("loadSETByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode)", e);
			return null;
		}
	}
	
	public static SET getSETByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) {
		try {
			return (SET) session.get(tr.com.srdc.icardea.hibernate.SET.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			_logger.error("getSETByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode)", e);
			return null;
		}
	}
	
	public static SET[] listSETByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return listSETByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("listSETByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static SET[] listSETByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return listSETByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("listSETByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static SET[] listSETByQuery(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From tr.com.srdc.icardea.hibernate.SET as SET");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			List list = query.list();
			return (SET[]) list.toArray(new SET[list.size()]);
		}
		catch (Exception e) {
			_logger.error("listSETByQuery(PersistentSession session, String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static SET[] listSETByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From tr.com.srdc.icardea.hibernate.SET as SET");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("this", lockMode);
			List list = query.list();
			return (SET[]) list.toArray(new SET[list.size()]);
		}
		catch (Exception e) {
			_logger.error("listSETByQuery(PersistentSession session, String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static SET loadSETByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return loadSETByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("loadSETByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static SET loadSETByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return loadSETByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("loadSETByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static SET loadSETByQuery(PersistentSession session, String condition, String orderBy) {
		SET[] sETs = listSETByQuery(session, condition, orderBy);
		if (sETs != null && sETs.length > 0)
			return sETs[0];
		else
			return null;
	}
	
	public static SET loadSETByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		SET[] sETs = listSETByQuery(session, condition, orderBy, lockMode);
		if (sETs != null && sETs.length > 0)
			return sETs[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateSETByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return iterateSETByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("iterateSETByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static java.util.Iterator iterateSETByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return iterateSETByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("iterateSETByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static java.util.Iterator iterateSETByQuery(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From tr.com.srdc.icardea.hibernate.SET as SET");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			_logger.error("iterateSETByQuery(PersistentSession session, String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static java.util.Iterator iterateSETByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From tr.com.srdc.icardea.hibernate.SET as SET");
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
			_logger.error("iterateSETByQuery(PersistentSession session, String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static SET loadSETByCriteria(SETCriteria sETCriteria) {
		SET[] sETs = listSETByCriteria(sETCriteria);
		if(sETs == null || sETs.length == 0) {
			return null;
		}
		return sETs[0];
	}
	
	public static SET[] listSETByCriteria(SETCriteria sETCriteria) {
		return sETCriteria.listSET();
	}
	
	public static SET createSET() {
		return new tr.com.srdc.icardea.hibernate.SET();
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
				getSystem().setsET(null);
			}
			
			if(getcRTSET() != null) {
				getcRTSET().setsET(null);
			}
			
			if(getmAGNET() != null) {
				getmAGNET().setsET(null);
			}
			
			if(getbRADYSET() != null) {
				getbRADYSET().setsET(null);
			}
			
			if(gettACHYTHERAPYSET() != null) {
				gettACHYTHERAPYSET().setsET(null);
			}
			
			tr.com.srdc.icardea.hibernate.ZONE[] lzONEs = zONE.toArray();
			for(int i = 0; i < lzONEs.length; i++) {
				lzONEs[i].setsET(null);
			}
			if(getlEADHVCHANNELSET() != null) {
				getlEADHVCHANNELSET().setsET(null);
			}
			
			tr.com.srdc.icardea.hibernate.LEADCHNLSET[] llEADCHNLSETs = lEADCHNLSET.toArray();
			for(int i = 0; i < llEADCHNLSETs.length; i++) {
				llEADCHNLSETs[i].setsET(null);
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
				getSystem().setsET(null);
			}
			
			if(getcRTSET() != null) {
				getcRTSET().setsET(null);
			}
			
			if(getmAGNET() != null) {
				getmAGNET().setsET(null);
			}
			
			if(getbRADYSET() != null) {
				getbRADYSET().setsET(null);
			}
			
			if(gettACHYTHERAPYSET() != null) {
				gettACHYTHERAPYSET().setsET(null);
			}
			
			tr.com.srdc.icardea.hibernate.ZONE[] lzONEs = zONE.toArray();
			for(int i = 0; i < lzONEs.length; i++) {
				lzONEs[i].setsET(null);
			}
			if(getlEADHVCHANNELSET() != null) {
				getlEADHVCHANNELSET().setsET(null);
			}
			
			tr.com.srdc.icardea.hibernate.LEADCHNLSET[] llEADCHNLSETs = lEADCHNLSET.toArray();
			for(int i = 0; i < llEADCHNLSETs.length; i++) {
				llEADCHNLSETs[i].setsET(null);
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
		if (key == tr.com.srdc.icardea.hibernate.ORMConstants.KEY_SET_ZONE) {
			return ORM_zONE;
		}
		else if (key == tr.com.srdc.icardea.hibernate.ORMConstants.KEY_SET_LEADCHNLSET) {
			return ORM_lEADCHNLSET;
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
	
	private tr.com.srdc.icardea.hibernate.CRTSET cRTSET;
	
	private tr.com.srdc.icardea.hibernate.MAGNET mAGNET;
	
	private tr.com.srdc.icardea.hibernate.BRADYSET bRADYSET;
	
	private tr.com.srdc.icardea.hibernate.TACHYTHERAPYSET tACHYTHERAPYSET;
	
	private java.util.Set ORM_zONE = new java.util.HashSet();
	
	private tr.com.srdc.icardea.hibernate.LEADHVCHANNELSET lEADHVCHANNELSET;
	
	private java.util.Set ORM_lEADCHNLSET = new java.util.HashSet();
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setSystem(tr.com.srdc.icardea.hibernate.System value) {
		if (this.system != value) {
			tr.com.srdc.icardea.hibernate.System lsystem = this.system;
			this.system = value;
			if (value != null) {
				system.setsET(this);
			}
			else {
				lsystem.setsET(null);
			}
		}
	}
	
	public tr.com.srdc.icardea.hibernate.System getSystem() {
		return system;
	}
	
	public void setcRTSET(tr.com.srdc.icardea.hibernate.CRTSET value) {
		if (this.cRTSET != value) {
			tr.com.srdc.icardea.hibernate.CRTSET lcRTSET = this.cRTSET;
			this.cRTSET = value;
			if (value != null) {
				cRTSET.setsET(this);
			}
			else {
				lcRTSET.setsET(null);
			}
		}
	}
	
	public tr.com.srdc.icardea.hibernate.CRTSET getcRTSET() {
		return cRTSET;
	}
	
	public void setmAGNET(tr.com.srdc.icardea.hibernate.MAGNET value) {
		if (this.mAGNET != value) {
			tr.com.srdc.icardea.hibernate.MAGNET lmAGNET = this.mAGNET;
			this.mAGNET = value;
			if (value != null) {
				mAGNET.setsET(this);
			}
			else {
				lmAGNET.setsET(null);
			}
		}
	}
	
	public tr.com.srdc.icardea.hibernate.MAGNET getmAGNET() {
		return mAGNET;
	}
	
	public void setbRADYSET(tr.com.srdc.icardea.hibernate.BRADYSET value) {
		if (this.bRADYSET != value) {
			tr.com.srdc.icardea.hibernate.BRADYSET lbRADYSET = this.bRADYSET;
			this.bRADYSET = value;
			if (value != null) {
				bRADYSET.setsET(this);
			}
			else {
				lbRADYSET.setsET(null);
			}
		}
	}
	
	public tr.com.srdc.icardea.hibernate.BRADYSET getbRADYSET() {
		return bRADYSET;
	}
	
	public void settACHYTHERAPYSET(tr.com.srdc.icardea.hibernate.TACHYTHERAPYSET value) {
		if (this.tACHYTHERAPYSET != value) {
			tr.com.srdc.icardea.hibernate.TACHYTHERAPYSET ltACHYTHERAPYSET = this.tACHYTHERAPYSET;
			this.tACHYTHERAPYSET = value;
			if (value != null) {
				tACHYTHERAPYSET.setsET(this);
			}
			else {
				ltACHYTHERAPYSET.setsET(null);
			}
		}
	}
	
	public tr.com.srdc.icardea.hibernate.TACHYTHERAPYSET gettACHYTHERAPYSET() {
		return tACHYTHERAPYSET;
	}
	
	private void setORM_zONE(java.util.Set value) {
		this.ORM_zONE = value;
	}
	
	private java.util.Set getORM_zONE() {
		return ORM_zONE;
	}
	
	public final tr.com.srdc.icardea.hibernate.ZONESetCollection zONE = new tr.com.srdc.icardea.hibernate.ZONESetCollection(this, _ormAdapter, tr.com.srdc.icardea.hibernate.ORMConstants.KEY_SET_ZONE, tr.com.srdc.icardea.hibernate.ORMConstants.KEY_ZONE_SET, tr.com.srdc.icardea.hibernate.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public void setlEADHVCHANNELSET(tr.com.srdc.icardea.hibernate.LEADHVCHANNELSET value) {
		if (this.lEADHVCHANNELSET != value) {
			tr.com.srdc.icardea.hibernate.LEADHVCHANNELSET llEADHVCHANNELSET = this.lEADHVCHANNELSET;
			this.lEADHVCHANNELSET = value;
			if (value != null) {
				lEADHVCHANNELSET.setsET(this);
			}
			else {
				llEADHVCHANNELSET.setsET(null);
			}
		}
	}
	
	public tr.com.srdc.icardea.hibernate.LEADHVCHANNELSET getlEADHVCHANNELSET() {
		return lEADHVCHANNELSET;
	}
	
	private void setORM_lEADCHNLSET(java.util.Set value) {
		this.ORM_lEADCHNLSET = value;
	}
	
	private java.util.Set getORM_lEADCHNLSET() {
		return ORM_lEADCHNLSET;
	}
	
	public final tr.com.srdc.icardea.hibernate.LEADCHNLSETSetCollection lEADCHNLSET = new tr.com.srdc.icardea.hibernate.LEADCHNLSETSetCollection(this, _ormAdapter, tr.com.srdc.icardea.hibernate.ORMConstants.KEY_SET_LEADCHNLSET, tr.com.srdc.icardea.hibernate.ORMConstants.KEY_LEADCHNLSET_SET, tr.com.srdc.icardea.hibernate.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return toString(false);
	}
	
	public String toString(boolean idOnly) {
		if (idOnly) {
			return String.valueOf(getID());
		}
		else {
			StringBuffer sb = new StringBuffer();
			sb.append("SET[ ");
			sb.append("ID=").append(getID()).append(" ");
			if (getSystem() != null)
				sb.append("System.Persist_ID=").append(getSystem().toString(true)).append(" ");
			else
				sb.append("System=null ");
			if (getcRTSET() != null)
				sb.append("cRTSET.Persist_ID=").append(getcRTSET().toString(true)).append(" ");
			else
				sb.append("cRTSET=null ");
			if (getmAGNET() != null)
				sb.append("mAGNET.Persist_ID=").append(getmAGNET().toString(true)).append(" ");
			else
				sb.append("mAGNET=null ");
			if (getbRADYSET() != null)
				sb.append("bRADYSET.Persist_ID=").append(getbRADYSET().toString(true)).append(" ");
			else
				sb.append("bRADYSET=null ");
			if (gettACHYTHERAPYSET() != null)
				sb.append("tACHYTHERAPYSET.Persist_ID=").append(gettACHYTHERAPYSET().toString(true)).append(" ");
			else
				sb.append("tACHYTHERAPYSET=null ");
			sb.append("ZONE.size=").append(zONE.size()).append(" ");
			if (getlEADHVCHANNELSET() != null)
				sb.append("lEADHVCHANNELSET.Persist_ID=").append(getlEADHVCHANNELSET().toString(true)).append(" ");
			else
				sb.append("lEADHVCHANNELSET=null ");
			sb.append("LEADCHNLSET.size=").append(lEADCHNLSET.size()).append(" ");
			sb.append("]");
			return sb.toString();
		}
	}
	
}
