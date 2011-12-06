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

public class System {
	private static final org.apache.log4j.Logger _logger = org.apache.log4j.Logger.getLogger(System.class);
	public System() {
	}
	
	public static System loadSystemByORMID(int ID) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return loadSystemByORMID(session, ID);
		}
		catch (Exception e) {
			_logger.error("loadSystemByORMID(int ID)", e);
			return null;
		}
	}
	
	public static System getSystemByORMID(int ID) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return getSystemByORMID(session, ID);
		}
		catch (Exception e) {
			_logger.error("getSystemByORMID(int ID)", e);
			return null;
		}
	}
	
	public static System loadSystemByORMID(int ID, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return loadSystemByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			_logger.error("loadSystemByORMID(int ID, org.hibernate.LockMode lockMode)", e);
			return null;
		}
	}
	
	public static System getSystemByORMID(int ID, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return getSystemByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			_logger.error("getSystemByORMID(int ID, org.hibernate.LockMode lockMode)", e);
			return null;
		}
	}
	
	public static System loadSystemByORMID(PersistentSession session, int ID) {
		try {
			return (System) session.load(tr.com.srdc.icardea.hibernate.System.class, new Integer(ID));
		}
		catch (Exception e) {
			_logger.error("loadSystemByORMID(PersistentSession session, int ID)", e);
			return null;
		}
	}
	
	public static System getSystemByORMID(PersistentSession session, int ID) {
		try {
			return (System) session.get(tr.com.srdc.icardea.hibernate.System.class, new Integer(ID));
		}
		catch (Exception e) {
			_logger.error("getSystemByORMID(PersistentSession session, int ID)", e);
			return null;
		}
	}
	
	public static System loadSystemByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) {
		try {
			return (System) session.load(tr.com.srdc.icardea.hibernate.System.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			_logger.error("loadSystemByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode)", e);
			return null;
		}
	}
	
	public static System getSystemByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) {
		try {
			return (System) session.get(tr.com.srdc.icardea.hibernate.System.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			_logger.error("getSystemByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode)", e);
			return null;
		}
	}
	
	public static System[] listSystemByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return listSystemByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("listSystemByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static System[] listSystemByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return listSystemByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("listSystemByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static System[] listSystemByQuery(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From tr.com.srdc.icardea.hibernate.System as System");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			List list = query.list();
			return (System[]) list.toArray(new System[list.size()]);
		}
		catch (Exception e) {
			_logger.error("listSystemByQuery(PersistentSession session, String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static System[] listSystemByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From tr.com.srdc.icardea.hibernate.System as System");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("this", lockMode);
			List list = query.list();
			return (System[]) list.toArray(new System[list.size()]);
		}
		catch (Exception e) {
			_logger.error("listSystemByQuery(PersistentSession session, String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static System loadSystemByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return loadSystemByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("loadSystemByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static System loadSystemByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return loadSystemByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("loadSystemByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static System loadSystemByQuery(PersistentSession session, String condition, String orderBy) {
		System[] systems = listSystemByQuery(session, condition, orderBy);
		if (systems != null && systems.length > 0)
			return systems[0];
		else
			return null;
	}
	
	public static System loadSystemByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		System[] systems = listSystemByQuery(session, condition, orderBy, lockMode);
		if (systems != null && systems.length > 0)
			return systems[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateSystemByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return iterateSystemByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("iterateSystemByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static java.util.Iterator iterateSystemByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return iterateSystemByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("iterateSystemByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static java.util.Iterator iterateSystemByQuery(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From tr.com.srdc.icardea.hibernate.System as System");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			_logger.error("iterateSystemByQuery(PersistentSession session, String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static java.util.Iterator iterateSystemByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From tr.com.srdc.icardea.hibernate.System as System");
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
			_logger.error("iterateSystemByQuery(PersistentSession session, String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static System loadSystemByCriteria(SystemCriteria systemCriteria) {
		System[] systems = listSystemByCriteria(systemCriteria);
		if(systems == null || systems.length == 0) {
			return null;
		}
		return systems[0];
	}
	
	public static System[] listSystemByCriteria(SystemCriteria systemCriteria) {
		return systemCriteria.listSystem();
	}
	
	public static System createSystem() {
		return new tr.com.srdc.icardea.hibernate.System();
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
				getObservation().setSystem(null);
			}
			
			if(getpG() != null) {
				getpG().setSystem(null);
			}
			
			tr.com.srdc.icardea.hibernate.LEAD2[] llEAD2s = lEAD2.toArray();
			for(int i = 0; i < llEAD2s.length; i++) {
				llEAD2s[i].setSystem(null);
			}
			if(getsESS() != null) {
				getsESS().setSystem(null);
			}
			
			if(getmSMT() != null) {
				getmSMT().setSystem(null);
			}
			
			if(getsET() != null) {
				getsET().setSystem(null);
			}
			
			if(getsTAT() != null) {
				getsTAT().setSystem(null);
			}
			
			tr.com.srdc.icardea.hibernate.EPISODEROOT[] lePISODEROOTs = ePISODEROOT.toArray();
			for(int i = 0; i < lePISODEROOTs.length; i++) {
				lePISODEROOTs[i].setSystem(null);
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
				getObservation().setSystem(null);
			}
			
			if(getpG() != null) {
				getpG().setSystem(null);
			}
			
			tr.com.srdc.icardea.hibernate.LEAD2[] llEAD2s = lEAD2.toArray();
			for(int i = 0; i < llEAD2s.length; i++) {
				llEAD2s[i].setSystem(null);
			}
			if(getsESS() != null) {
				getsESS().setSystem(null);
			}
			
			if(getmSMT() != null) {
				getmSMT().setSystem(null);
			}
			
			if(getsET() != null) {
				getsET().setSystem(null);
			}
			
			if(getsTAT() != null) {
				getsTAT().setSystem(null);
			}
			
			tr.com.srdc.icardea.hibernate.EPISODEROOT[] lePISODEROOTs = ePISODEROOT.toArray();
			for(int i = 0; i < lePISODEROOTs.length; i++) {
				lePISODEROOTs[i].setSystem(null);
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
		if (key == tr.com.srdc.icardea.hibernate.ORMConstants.KEY_SYSTEM_LEAD2) {
			return ORM_lEAD2;
		}
		else if (key == tr.com.srdc.icardea.hibernate.ORMConstants.KEY_SYSTEM_EPISODEROOT) {
			return ORM_ePISODEROOT;
		}
		
		return null;
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	private int ID;
	
	private tr.com.srdc.icardea.hibernate.Observation observation;
	
	private tr.com.srdc.icardea.hibernate.PG pG;
	
	private java.util.Set ORM_lEAD2 = new java.util.HashSet();
	
	private tr.com.srdc.icardea.hibernate.SESS sESS;
	
	private tr.com.srdc.icardea.hibernate.MSMT mSMT;
	
	private tr.com.srdc.icardea.hibernate.SET sET;
	
	private tr.com.srdc.icardea.hibernate.STAT sTAT;
	
	private java.util.Set ORM_ePISODEROOT = new java.util.HashSet();
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setObservation(tr.com.srdc.icardea.hibernate.Observation value) {
		if (this.observation != value) {
			tr.com.srdc.icardea.hibernate.Observation lobservation = this.observation;
			this.observation = value;
			if (value != null) {
				observation.setSystem(this);
			}
			else {
				lobservation.setSystem(null);
			}
		}
	}
	
	public tr.com.srdc.icardea.hibernate.Observation getObservation() {
		return observation;
	}
	
	public void setpG(tr.com.srdc.icardea.hibernate.PG value) {
		if (this.pG != value) {
			tr.com.srdc.icardea.hibernate.PG lpG = this.pG;
			this.pG = value;
			if (value != null) {
				pG.setSystem(this);
			}
			else {
				lpG.setSystem(null);
			}
		}
	}
	
	public tr.com.srdc.icardea.hibernate.PG getpG() {
		return pG;
	}
	
	private void setORM_lEAD2(java.util.Set value) {
		this.ORM_lEAD2 = value;
	}
	
	private java.util.Set getORM_lEAD2() {
		return ORM_lEAD2;
	}
	
	public final tr.com.srdc.icardea.hibernate.LEAD2SetCollection lEAD2 = new tr.com.srdc.icardea.hibernate.LEAD2SetCollection(this, _ormAdapter, tr.com.srdc.icardea.hibernate.ORMConstants.KEY_SYSTEM_LEAD2, tr.com.srdc.icardea.hibernate.ORMConstants.KEY_LEAD2_SYSTEM, tr.com.srdc.icardea.hibernate.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public void setsESS(tr.com.srdc.icardea.hibernate.SESS value) {
		if (this.sESS != value) {
			tr.com.srdc.icardea.hibernate.SESS lsESS = this.sESS;
			this.sESS = value;
			if (value != null) {
				sESS.setSystem(this);
			}
			else {
				lsESS.setSystem(null);
			}
		}
	}
	
	public tr.com.srdc.icardea.hibernate.SESS getsESS() {
		return sESS;
	}
	
	public void setmSMT(tr.com.srdc.icardea.hibernate.MSMT value) {
		if (this.mSMT != value) {
			tr.com.srdc.icardea.hibernate.MSMT lmSMT = this.mSMT;
			this.mSMT = value;
			if (value != null) {
				mSMT.setSystem(this);
			}
			else {
				lmSMT.setSystem(null);
			}
		}
	}
	
	public tr.com.srdc.icardea.hibernate.MSMT getmSMT() {
		return mSMT;
	}
	
	public void setsET(tr.com.srdc.icardea.hibernate.SET value) {
		if (this.sET != value) {
			tr.com.srdc.icardea.hibernate.SET lsET = this.sET;
			this.sET = value;
			if (value != null) {
				sET.setSystem(this);
			}
			else {
				lsET.setSystem(null);
			}
		}
	}
	
	public tr.com.srdc.icardea.hibernate.SET getsET() {
		return sET;
	}
	
	public void setsTAT(tr.com.srdc.icardea.hibernate.STAT value) {
		if (this.sTAT != value) {
			tr.com.srdc.icardea.hibernate.STAT lsTAT = this.sTAT;
			this.sTAT = value;
			if (value != null) {
				sTAT.setSystem(this);
			}
			else {
				lsTAT.setSystem(null);
			}
		}
	}
	
	public tr.com.srdc.icardea.hibernate.STAT getsTAT() {
		return sTAT;
	}
	
	private void setORM_ePISODEROOT(java.util.Set value) {
		this.ORM_ePISODEROOT = value;
	}
	
	private java.util.Set getORM_ePISODEROOT() {
		return ORM_ePISODEROOT;
	}
	
	public final tr.com.srdc.icardea.hibernate.EPISODEROOTSetCollection ePISODEROOT = new tr.com.srdc.icardea.hibernate.EPISODEROOTSetCollection(this, _ormAdapter, tr.com.srdc.icardea.hibernate.ORMConstants.KEY_SYSTEM_EPISODEROOT, tr.com.srdc.icardea.hibernate.ORMConstants.KEY_EPISODEROOT_SYSTEM, tr.com.srdc.icardea.hibernate.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return toString(false);
	}
	
	public String toString(boolean idOnly) {
		if (idOnly) {
			return String.valueOf(getID());
		}
		else {
			StringBuffer sb = new StringBuffer();
			sb.append("System[ ");
			sb.append("ID=").append(getID()).append(" ");
			if (getObservation() != null)
				sb.append("Observation.Persist_ID=").append(getObservation().toString(true)).append(" ");
			else
				sb.append("Observation=null ");
			if (getpG() != null)
				sb.append("pG.Persist_ID=").append(getpG().toString(true)).append(" ");
			else
				sb.append("pG=null ");
			sb.append("LEAD2.size=").append(lEAD2.size()).append(" ");
			if (getsESS() != null)
				sb.append("sESS.Persist_ID=").append(getsESS().toString(true)).append(" ");
			else
				sb.append("sESS=null ");
			if (getmSMT() != null)
				sb.append("mSMT.Persist_ID=").append(getmSMT().toString(true)).append(" ");
			else
				sb.append("mSMT=null ");
			if (getsET() != null)
				sb.append("sET.Persist_ID=").append(getsET().toString(true)).append(" ");
			else
				sb.append("sET=null ");
			if (getsTAT() != null)
				sb.append("sTAT.Persist_ID=").append(getsTAT().toString(true)).append(" ");
			else
				sb.append("sTAT=null ");
			sb.append("EPISODEROOT.size=").append(ePISODEROOT.size()).append(" ");
			sb.append("]");
			return sb.toString();
		}
	}
	
}
