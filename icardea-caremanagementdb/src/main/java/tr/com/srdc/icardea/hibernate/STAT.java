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

public class STAT {
	private static final org.apache.log4j.Logger _logger = org.apache.log4j.Logger.getLogger(STAT.class);
	public STAT() {
	}
	
	public static STAT loadSTATByORMID(int ID) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return loadSTATByORMID(session, ID);
		}
		catch (Exception e) {
			_logger.error("loadSTATByORMID(int ID)", e);
			return null;
		}
	}
	
	public static STAT getSTATByORMID(int ID) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return getSTATByORMID(session, ID);
		}
		catch (Exception e) {
			_logger.error("getSTATByORMID(int ID)", e);
			return null;
		}
	}
	
	public static STAT loadSTATByORMID(int ID, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return loadSTATByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			_logger.error("loadSTATByORMID(int ID, org.hibernate.LockMode lockMode)", e);
			return null;
		}
	}
	
	public static STAT getSTATByORMID(int ID, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return getSTATByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			_logger.error("getSTATByORMID(int ID, org.hibernate.LockMode lockMode)", e);
			return null;
		}
	}
	
	public static STAT loadSTATByORMID(PersistentSession session, int ID) {
		try {
			return (STAT) session.load(tr.com.srdc.icardea.hibernate.STAT.class, new Integer(ID));
		}
		catch (Exception e) {
			_logger.error("loadSTATByORMID(PersistentSession session, int ID)", e);
			return null;
		}
	}
	
	public static STAT getSTATByORMID(PersistentSession session, int ID) {
		try {
			return (STAT) session.get(tr.com.srdc.icardea.hibernate.STAT.class, new Integer(ID));
		}
		catch (Exception e) {
			_logger.error("getSTATByORMID(PersistentSession session, int ID)", e);
			return null;
		}
	}
	
	public static STAT loadSTATByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) {
		try {
			return (STAT) session.load(tr.com.srdc.icardea.hibernate.STAT.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			_logger.error("loadSTATByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode)", e);
			return null;
		}
	}
	
	public static STAT getSTATByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) {
		try {
			return (STAT) session.get(tr.com.srdc.icardea.hibernate.STAT.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			_logger.error("getSTATByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode)", e);
			return null;
		}
	}
	
	public static STAT[] listSTATByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return listSTATByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("listSTATByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static STAT[] listSTATByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return listSTATByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("listSTATByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static STAT[] listSTATByQuery(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From tr.com.srdc.icardea.hibernate.STAT as STAT");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			List list = query.list();
			return (STAT[]) list.toArray(new STAT[list.size()]);
		}
		catch (Exception e) {
			_logger.error("listSTATByQuery(PersistentSession session, String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static STAT[] listSTATByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From tr.com.srdc.icardea.hibernate.STAT as STAT");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("this", lockMode);
			List list = query.list();
			return (STAT[]) list.toArray(new STAT[list.size()]);
		}
		catch (Exception e) {
			_logger.error("listSTATByQuery(PersistentSession session, String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static STAT loadSTATByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return loadSTATByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("loadSTATByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static STAT loadSTATByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return loadSTATByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("loadSTATByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static STAT loadSTATByQuery(PersistentSession session, String condition, String orderBy) {
		STAT[] sTATs = listSTATByQuery(session, condition, orderBy);
		if (sTATs != null && sTATs.length > 0)
			return sTATs[0];
		else
			return null;
	}
	
	public static STAT loadSTATByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		STAT[] sTATs = listSTATByQuery(session, condition, orderBy, lockMode);
		if (sTATs != null && sTATs.length > 0)
			return sTATs[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateSTATByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return iterateSTATByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("iterateSTATByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static java.util.Iterator iterateSTATByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return iterateSTATByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("iterateSTATByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static java.util.Iterator iterateSTATByQuery(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From tr.com.srdc.icardea.hibernate.STAT as STAT");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			_logger.error("iterateSTATByQuery(PersistentSession session, String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static java.util.Iterator iterateSTATByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From tr.com.srdc.icardea.hibernate.STAT as STAT");
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
			_logger.error("iterateSTATByQuery(PersistentSession session, String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static STAT loadSTATByCriteria(STATCriteria sTATCriteria) {
		STAT[] sTATs = listSTATByCriteria(sTATCriteria);
		if(sTATs == null || sTATs.length == 0) {
			return null;
		}
		return sTATs[0];
	}
	
	public static STAT[] listSTATByCriteria(STATCriteria sTATCriteria) {
		return sTATCriteria.listSTAT();
	}
	
	public static STAT createSTAT() {
		return new tr.com.srdc.icardea.hibernate.STAT();
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
				getSystem().setsTAT(null);
			}
			
			if(gethEART_RATE() != null) {
				gethEART_RATE().setsTAT(null);
			}
			
			if(getaT() != null) {
				getaT().setsTAT(null);
			}
			
			tr.com.srdc.icardea.hibernate.EPISODESTAT[] lePISODESTATs = ePISODESTAT.toArray();
			for(int i = 0; i < lePISODESTATs.length; i++) {
				lePISODESTATs[i].setsTAT(null);
			}
			if(getbRADYSTAT() != null) {
				getbRADYSTAT().setsTAT(null);
			}
			
			if(getcRTSTAT() != null) {
				getcRTSTAT().setsTAT(null);
			}
			
			if(gettACHYTHERAPYSTAT() != null) {
				gettACHYTHERAPYSTAT().setsTAT(null);
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
				getSystem().setsTAT(null);
			}
			
			if(gethEART_RATE() != null) {
				gethEART_RATE().setsTAT(null);
			}
			
			if(getaT() != null) {
				getaT().setsTAT(null);
			}
			
			tr.com.srdc.icardea.hibernate.EPISODESTAT[] lePISODESTATs = ePISODESTAT.toArray();
			for(int i = 0; i < lePISODESTATs.length; i++) {
				lePISODESTATs[i].setsTAT(null);
			}
			if(getbRADYSTAT() != null) {
				getbRADYSTAT().setsTAT(null);
			}
			
			if(getcRTSTAT() != null) {
				getcRTSTAT().setsTAT(null);
			}
			
			if(gettACHYTHERAPYSTAT() != null) {
				gettACHYTHERAPYSTAT().setsTAT(null);
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
		if (key == tr.com.srdc.icardea.hibernate.ORMConstants.KEY_STAT_EPISODESTAT) {
			return ORM_ePISODESTAT;
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
	
	private tr.com.srdc.icardea.hibernate.HEART_RATE hEART_RATE;
	
	private tr.com.srdc.icardea.hibernate.AT aT;
	
	private java.util.Set ORM_ePISODESTAT = new java.util.HashSet();
	
	private tr.com.srdc.icardea.hibernate.BRADYSTAT bRADYSTAT;
	
	private tr.com.srdc.icardea.hibernate.CRTSTAT cRTSTAT;
	
	private tr.com.srdc.icardea.hibernate.TACHYTHERAPYSTAT tACHYTHERAPYSTAT;
	
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
				system.setsTAT(this);
			}
			else {
				lsystem.setsTAT(null);
			}
		}
	}
	
	public tr.com.srdc.icardea.hibernate.System getSystem() {
		return system;
	}
	
	public void sethEART_RATE(tr.com.srdc.icardea.hibernate.HEART_RATE value) {
		if (this.hEART_RATE != value) {
			tr.com.srdc.icardea.hibernate.HEART_RATE lhEART_RATE = this.hEART_RATE;
			this.hEART_RATE = value;
			if (value != null) {
				hEART_RATE.setsTAT(this);
			}
			else {
				lhEART_RATE.setsTAT(null);
			}
		}
	}
	
	public tr.com.srdc.icardea.hibernate.HEART_RATE gethEART_RATE() {
		return hEART_RATE;
	}
	
	public void setaT(tr.com.srdc.icardea.hibernate.AT value) {
		if (this.aT != value) {
			tr.com.srdc.icardea.hibernate.AT laT = this.aT;
			this.aT = value;
			if (value != null) {
				aT.setsTAT(this);
			}
			else {
				laT.setsTAT(null);
			}
		}
	}
	
	public tr.com.srdc.icardea.hibernate.AT getaT() {
		return aT;
	}
	
	private void setORM_ePISODESTAT(java.util.Set value) {
		this.ORM_ePISODESTAT = value;
	}
	
	private java.util.Set getORM_ePISODESTAT() {
		return ORM_ePISODESTAT;
	}
	
	public final tr.com.srdc.icardea.hibernate.EPISODESTATSetCollection ePISODESTAT = new tr.com.srdc.icardea.hibernate.EPISODESTATSetCollection(this, _ormAdapter, tr.com.srdc.icardea.hibernate.ORMConstants.KEY_STAT_EPISODESTAT, tr.com.srdc.icardea.hibernate.ORMConstants.KEY_EPISODESTAT_STAT, tr.com.srdc.icardea.hibernate.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public void setbRADYSTAT(tr.com.srdc.icardea.hibernate.BRADYSTAT value) {
		if (this.bRADYSTAT != value) {
			tr.com.srdc.icardea.hibernate.BRADYSTAT lbRADYSTAT = this.bRADYSTAT;
			this.bRADYSTAT = value;
			if (value != null) {
				bRADYSTAT.setsTAT(this);
			}
			else {
				lbRADYSTAT.setsTAT(null);
			}
		}
	}
	
	public tr.com.srdc.icardea.hibernate.BRADYSTAT getbRADYSTAT() {
		return bRADYSTAT;
	}
	
	public void setcRTSTAT(tr.com.srdc.icardea.hibernate.CRTSTAT value) {
		if (this.cRTSTAT != value) {
			tr.com.srdc.icardea.hibernate.CRTSTAT lcRTSTAT = this.cRTSTAT;
			this.cRTSTAT = value;
			if (value != null) {
				cRTSTAT.setsTAT(this);
			}
			else {
				lcRTSTAT.setsTAT(null);
			}
		}
	}
	
	public tr.com.srdc.icardea.hibernate.CRTSTAT getcRTSTAT() {
		return cRTSTAT;
	}
	
	public void settACHYTHERAPYSTAT(tr.com.srdc.icardea.hibernate.TACHYTHERAPYSTAT value) {
		if (this.tACHYTHERAPYSTAT != value) {
			tr.com.srdc.icardea.hibernate.TACHYTHERAPYSTAT ltACHYTHERAPYSTAT = this.tACHYTHERAPYSTAT;
			this.tACHYTHERAPYSTAT = value;
			if (value != null) {
				tACHYTHERAPYSTAT.setsTAT(this);
			}
			else {
				ltACHYTHERAPYSTAT.setsTAT(null);
			}
		}
	}
	
	public tr.com.srdc.icardea.hibernate.TACHYTHERAPYSTAT gettACHYTHERAPYSTAT() {
		return tACHYTHERAPYSTAT;
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
			sb.append("STAT[ ");
			sb.append("ID=").append(getID()).append(" ");
			if (getSystem() != null)
				sb.append("System.Persist_ID=").append(getSystem().toString(true)).append(" ");
			else
				sb.append("System=null ");
			sb.append("Dtm_start=").append(getDtm_start()).append(" ");
			sb.append("Dtm_end=").append(getDtm_end()).append(" ");
			if (gethEART_RATE() != null)
				sb.append("hEART_RATE.Persist_ID=").append(gethEART_RATE().toString(true)).append(" ");
			else
				sb.append("hEART_RATE=null ");
			if (getaT() != null)
				sb.append("aT.Persist_ID=").append(getaT().toString(true)).append(" ");
			else
				sb.append("aT=null ");
			sb.append("EPISODESTAT.size=").append(ePISODESTAT.size()).append(" ");
			if (getbRADYSTAT() != null)
				sb.append("bRADYSTAT.Persist_ID=").append(getbRADYSTAT().toString(true)).append(" ");
			else
				sb.append("bRADYSTAT=null ");
			if (getcRTSTAT() != null)
				sb.append("cRTSTAT.Persist_ID=").append(getcRTSTAT().toString(true)).append(" ");
			else
				sb.append("cRTSTAT=null ");
			if (gettACHYTHERAPYSTAT() != null)
				sb.append("tACHYTHERAPYSTAT.Persist_ID=").append(gettACHYTHERAPYSTAT().toString(true)).append(" ");
			else
				sb.append("tACHYTHERAPYSTAT=null ");
			sb.append("]");
			return sb.toString();
		}
	}
	
}
