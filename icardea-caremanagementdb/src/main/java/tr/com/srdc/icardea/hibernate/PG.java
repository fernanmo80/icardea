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

public class PG {
	private static final org.apache.log4j.Logger _logger = org.apache.log4j.Logger.getLogger(PG.class);
	public PG() {
	}
	
	public static PG loadPGByORMID(int ID) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return loadPGByORMID(session, ID);
		}
		catch (Exception e) {
			_logger.error("loadPGByORMID(int ID)", e);
			return null;
		}
	}
	
	public static PG getPGByORMID(int ID) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return getPGByORMID(session, ID);
		}
		catch (Exception e) {
			_logger.error("getPGByORMID(int ID)", e);
			return null;
		}
	}
	
	public static PG loadPGByORMID(int ID, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return loadPGByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			_logger.error("loadPGByORMID(int ID, org.hibernate.LockMode lockMode)", e);
			return null;
		}
	}
	
	public static PG getPGByORMID(int ID, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return getPGByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			_logger.error("getPGByORMID(int ID, org.hibernate.LockMode lockMode)", e);
			return null;
		}
	}
	
	public static PG loadPGByORMID(PersistentSession session, int ID) {
		try {
			return (PG) session.load(tr.com.srdc.icardea.hibernate.PG.class, new Integer(ID));
		}
		catch (Exception e) {
			_logger.error("loadPGByORMID(PersistentSession session, int ID)", e);
			return null;
		}
	}
	
	public static PG getPGByORMID(PersistentSession session, int ID) {
		try {
			return (PG) session.get(tr.com.srdc.icardea.hibernate.PG.class, new Integer(ID));
		}
		catch (Exception e) {
			_logger.error("getPGByORMID(PersistentSession session, int ID)", e);
			return null;
		}
	}
	
	public static PG loadPGByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) {
		try {
			return (PG) session.load(tr.com.srdc.icardea.hibernate.PG.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			_logger.error("loadPGByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode)", e);
			return null;
		}
	}
	
	public static PG getPGByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) {
		try {
			return (PG) session.get(tr.com.srdc.icardea.hibernate.PG.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			_logger.error("getPGByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode)", e);
			return null;
		}
	}
	
	public static PG[] listPGByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return listPGByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("listPGByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static PG[] listPGByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return listPGByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("listPGByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static PG[] listPGByQuery(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From tr.com.srdc.icardea.hibernate.PG as PG");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			List list = query.list();
			return (PG[]) list.toArray(new PG[list.size()]);
		}
		catch (Exception e) {
			_logger.error("listPGByQuery(PersistentSession session, String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static PG[] listPGByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From tr.com.srdc.icardea.hibernate.PG as PG");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("this", lockMode);
			List list = query.list();
			return (PG[]) list.toArray(new PG[list.size()]);
		}
		catch (Exception e) {
			_logger.error("listPGByQuery(PersistentSession session, String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static PG loadPGByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return loadPGByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("loadPGByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static PG loadPGByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return loadPGByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("loadPGByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static PG loadPGByQuery(PersistentSession session, String condition, String orderBy) {
		PG[] pGs = listPGByQuery(session, condition, orderBy);
		if (pGs != null && pGs.length > 0)
			return pGs[0];
		else
			return null;
	}
	
	public static PG loadPGByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		PG[] pGs = listPGByQuery(session, condition, orderBy, lockMode);
		if (pGs != null && pGs.length > 0)
			return pGs[0];
		else
			return null;
	}
	
	public static java.util.Iterator iteratePGByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return iteratePGByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("iteratePGByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static java.util.Iterator iteratePGByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return iteratePGByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("iteratePGByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static java.util.Iterator iteratePGByQuery(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From tr.com.srdc.icardea.hibernate.PG as PG");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			_logger.error("iteratePGByQuery(PersistentSession session, String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static java.util.Iterator iteratePGByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From tr.com.srdc.icardea.hibernate.PG as PG");
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
			_logger.error("iteratePGByQuery(PersistentSession session, String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static PG loadPGByCriteria(PGCriteria pGCriteria) {
		PG[] pGs = listPGByCriteria(pGCriteria);
		if(pGs == null || pGs.length == 0) {
			return null;
		}
		return pGs[0];
	}
	
	public static PG[] listPGByCriteria(PGCriteria pGCriteria) {
		return pGCriteria.listPG();
	}
	
	public static PG createPG() {
		return new tr.com.srdc.icardea.hibernate.PG();
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
				getSystem().setpG(null);
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
				getSystem().setpG(null);
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
	
	private tr.com.srdc.icardea.hibernate.System system;
	
	private String type;
	
	private String model;
	
	private String serial;
	
	private String mfg;
	
	private String implant_dt;
	
	private String implanter;
	
	private String implanter_contact_info;
	
	private String implanting_facility;
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setType(String value) {
		this.type = value;
	}
	
	public String getType() {
		return type;
	}
	
	public void setModel(String value) {
		this.model = value;
	}
	
	public String getModel() {
		return model;
	}
	
	public void setSerial(String value) {
		this.serial = value;
	}
	
	public String getSerial() {
		return serial;
	}
	
	public void setMfg(String value) {
		this.mfg = value;
	}
	
	public String getMfg() {
		return mfg;
	}
	
	public void setImplant_dt(String value) {
		this.implant_dt = value;
	}
	
	public String getImplant_dt() {
		return implant_dt;
	}
	
	public void setImplanter(String value) {
		this.implanter = value;
	}
	
	public String getImplanter() {
		return implanter;
	}
	
	public void setImplanter_contact_info(String value) {
		this.implanter_contact_info = value;
	}
	
	public String getImplanter_contact_info() {
		return implanter_contact_info;
	}
	
	public void setImplanting_facility(String value) {
		this.implanting_facility = value;
	}
	
	public String getImplanting_facility() {
		return implanting_facility;
	}
	
	public void setSystem(tr.com.srdc.icardea.hibernate.System value) {
		if (this.system != value) {
			tr.com.srdc.icardea.hibernate.System lsystem = this.system;
			this.system = value;
			if (value != null) {
				system.setpG(this);
			}
			else {
				lsystem.setpG(null);
			}
		}
	}
	
	public tr.com.srdc.icardea.hibernate.System getSystem() {
		return system;
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
			sb.append("PG[ ");
			sb.append("ID=").append(getID()).append(" ");
			if (getSystem() != null)
				sb.append("System.Persist_ID=").append(getSystem().toString(true)).append(" ");
			else
				sb.append("System=null ");
			sb.append("Type=").append(getType()).append(" ");
			sb.append("Model=").append(getModel()).append(" ");
			sb.append("Serial=").append(getSerial()).append(" ");
			sb.append("Mfg=").append(getMfg()).append(" ");
			sb.append("Implant_dt=").append(getImplant_dt()).append(" ");
			sb.append("Implanter=").append(getImplanter()).append(" ");
			sb.append("Implanter_contact_info=").append(getImplanter_contact_info()).append(" ");
			sb.append("Implanting_facility=").append(getImplanting_facility()).append(" ");
			sb.append("]");
			return sb.toString();
		}
	}
	
}
