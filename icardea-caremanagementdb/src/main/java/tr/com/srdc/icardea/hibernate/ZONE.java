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

public class ZONE {
	private static final org.apache.log4j.Logger _logger = org.apache.log4j.Logger.getLogger(ZONE.class);
	public ZONE() {
	}
	
	public static ZONE loadZONEByORMID(int ID) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return loadZONEByORMID(session, ID);
		}
		catch (Exception e) {
			_logger.error("loadZONEByORMID(int ID)", e);
			return null;
		}
	}
	
	public static ZONE getZONEByORMID(int ID) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return getZONEByORMID(session, ID);
		}
		catch (Exception e) {
			_logger.error("getZONEByORMID(int ID)", e);
			return null;
		}
	}
	
	public static ZONE loadZONEByORMID(int ID, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return loadZONEByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			_logger.error("loadZONEByORMID(int ID, org.hibernate.LockMode lockMode)", e);
			return null;
		}
	}
	
	public static ZONE getZONEByORMID(int ID, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return getZONEByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			_logger.error("getZONEByORMID(int ID, org.hibernate.LockMode lockMode)", e);
			return null;
		}
	}
	
	public static ZONE loadZONEByORMID(PersistentSession session, int ID) {
		try {
			return (ZONE) session.load(tr.com.srdc.icardea.hibernate.ZONE.class, new Integer(ID));
		}
		catch (Exception e) {
			_logger.error("loadZONEByORMID(PersistentSession session, int ID)", e);
			return null;
		}
	}
	
	public static ZONE getZONEByORMID(PersistentSession session, int ID) {
		try {
			return (ZONE) session.get(tr.com.srdc.icardea.hibernate.ZONE.class, new Integer(ID));
		}
		catch (Exception e) {
			_logger.error("getZONEByORMID(PersistentSession session, int ID)", e);
			return null;
		}
	}
	
	public static ZONE loadZONEByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) {
		try {
			return (ZONE) session.load(tr.com.srdc.icardea.hibernate.ZONE.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			_logger.error("loadZONEByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode)", e);
			return null;
		}
	}
	
	public static ZONE getZONEByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) {
		try {
			return (ZONE) session.get(tr.com.srdc.icardea.hibernate.ZONE.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			_logger.error("getZONEByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode)", e);
			return null;
		}
	}
	
	public static ZONE[] listZONEByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return listZONEByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("listZONEByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static ZONE[] listZONEByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return listZONEByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("listZONEByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static ZONE[] listZONEByQuery(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From tr.com.srdc.icardea.hibernate.ZONE as ZONE");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			List list = query.list();
			return (ZONE[]) list.toArray(new ZONE[list.size()]);
		}
		catch (Exception e) {
			_logger.error("listZONEByQuery(PersistentSession session, String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static ZONE[] listZONEByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From tr.com.srdc.icardea.hibernate.ZONE as ZONE");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("this", lockMode);
			List list = query.list();
			return (ZONE[]) list.toArray(new ZONE[list.size()]);
		}
		catch (Exception e) {
			_logger.error("listZONEByQuery(PersistentSession session, String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static ZONE loadZONEByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return loadZONEByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("loadZONEByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static ZONE loadZONEByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return loadZONEByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("loadZONEByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static ZONE loadZONEByQuery(PersistentSession session, String condition, String orderBy) {
		ZONE[] zONEs = listZONEByQuery(session, condition, orderBy);
		if (zONEs != null && zONEs.length > 0)
			return zONEs[0];
		else
			return null;
	}
	
	public static ZONE loadZONEByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		ZONE[] zONEs = listZONEByQuery(session, condition, orderBy, lockMode);
		if (zONEs != null && zONEs.length > 0)
			return zONEs[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateZONEByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return iterateZONEByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("iterateZONEByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static java.util.Iterator iterateZONEByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return iterateZONEByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("iterateZONEByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static java.util.Iterator iterateZONEByQuery(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From tr.com.srdc.icardea.hibernate.ZONE as ZONE");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			_logger.error("iterateZONEByQuery(PersistentSession session, String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static java.util.Iterator iterateZONEByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From tr.com.srdc.icardea.hibernate.ZONE as ZONE");
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
			_logger.error("iterateZONEByQuery(PersistentSession session, String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static ZONE loadZONEByCriteria(ZONECriteria zONECriteria) {
		ZONE[] zONEs = listZONEByCriteria(zONECriteria);
		if(zONEs == null || zONEs.length == 0) {
			return null;
		}
		return zONEs[0];
	}
	
	public static ZONE[] listZONEByCriteria(ZONECriteria zONECriteria) {
		return zONECriteria.listZONE();
	}
	
	public static ZONE createZONE() {
		return new tr.com.srdc.icardea.hibernate.ZONE();
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
			if(getsET() != null) {
				getsET().zONE.remove(this);
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
			if(getsET() != null) {
				getsET().zONE.remove(this);
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
		if (key == tr.com.srdc.icardea.hibernate.ORMConstants.KEY_ZONE_SET) {
			this.sET = (tr.com.srdc.icardea.hibernate.SET) owner;
		}
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	private int ID;
	
	private tr.com.srdc.icardea.hibernate.SET sET;
	
	private String type;
	
	private String vendor_type;
	
	private String status;
	
	private String detection_interval;
	
	private String detection_beats_numerator;
	
	private String detection_beats_denominator;
	
	private String detection_details;
	
	private String type_atp_1;
	
	private String type_atp_2;
	
	private String type_atp_3;
	
	private String type_atp_4;
	
	private String type_atp_5;
	
	private String num_atp_seqs_1;
	
	private String num_atp_seqs_2;
	
	private String num_atp_seqs_3;
	
	private String num_atp_seqs_4;
	
	private String num_atp_seqs_5;
	
	private String shock_energy_1;
	
	private String shock_energy_2;
	
	private String shock_energy_3;
	
	private String shock_energy_4;
	
	private String shock_energy_5;
	
	private String num_shocks_1;
	
	private String num_shocks_2;
	
	private String num_shocks_3;
	
	private String num_shocks_4;
	
	private String num_shocks_5;
	
	private Integer subID;
	
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
	
	public void setVendor_type(String value) {
		this.vendor_type = value;
	}
	
	public String getVendor_type() {
		return vendor_type;
	}
	
	public void setStatus(String value) {
		this.status = value;
	}
	
	public String getStatus() {
		return status;
	}
	
	public void setDetection_interval(String value) {
		this.detection_interval = value;
	}
	
	public String getDetection_interval() {
		return detection_interval;
	}
	
	public void setDetection_beats_numerator(String value) {
		this.detection_beats_numerator = value;
	}
	
	public String getDetection_beats_numerator() {
		return detection_beats_numerator;
	}
	
	public void setDetection_beats_denominator(String value) {
		this.detection_beats_denominator = value;
	}
	
	public String getDetection_beats_denominator() {
		return detection_beats_denominator;
	}
	
	public void setDetection_details(String value) {
		this.detection_details = value;
	}
	
	public String getDetection_details() {
		return detection_details;
	}
	
	public void setType_atp_1(String value) {
		this.type_atp_1 = value;
	}
	
	public String getType_atp_1() {
		return type_atp_1;
	}
	
	public void setType_atp_2(String value) {
		this.type_atp_2 = value;
	}
	
	public String getType_atp_2() {
		return type_atp_2;
	}
	
	public void setType_atp_3(String value) {
		this.type_atp_3 = value;
	}
	
	public String getType_atp_3() {
		return type_atp_3;
	}
	
	public void setType_atp_4(String value) {
		this.type_atp_4 = value;
	}
	
	public String getType_atp_4() {
		return type_atp_4;
	}
	
	public void setType_atp_5(String value) {
		this.type_atp_5 = value;
	}
	
	public String getType_atp_5() {
		return type_atp_5;
	}
	
	public void setNum_atp_seqs_1(String value) {
		this.num_atp_seqs_1 = value;
	}
	
	public String getNum_atp_seqs_1() {
		return num_atp_seqs_1;
	}
	
	public void setNum_atp_seqs_2(String value) {
		this.num_atp_seqs_2 = value;
	}
	
	public String getNum_atp_seqs_2() {
		return num_atp_seqs_2;
	}
	
	public void setNum_atp_seqs_3(String value) {
		this.num_atp_seqs_3 = value;
	}
	
	public String getNum_atp_seqs_3() {
		return num_atp_seqs_3;
	}
	
	public void setNum_atp_seqs_4(String value) {
		this.num_atp_seqs_4 = value;
	}
	
	public String getNum_atp_seqs_4() {
		return num_atp_seqs_4;
	}
	
	public void setNum_atp_seqs_5(String value) {
		this.num_atp_seqs_5 = value;
	}
	
	public String getNum_atp_seqs_5() {
		return num_atp_seqs_5;
	}
	
	public void setShock_energy_1(String value) {
		this.shock_energy_1 = value;
	}
	
	public String getShock_energy_1() {
		return shock_energy_1;
	}
	
	public void setShock_energy_2(String value) {
		this.shock_energy_2 = value;
	}
	
	public String getShock_energy_2() {
		return shock_energy_2;
	}
	
	public void setShock_energy_3(String value) {
		this.shock_energy_3 = value;
	}
	
	public String getShock_energy_3() {
		return shock_energy_3;
	}
	
	public void setShock_energy_4(String value) {
		this.shock_energy_4 = value;
	}
	
	public String getShock_energy_4() {
		return shock_energy_4;
	}
	
	public void setShock_energy_5(String value) {
		this.shock_energy_5 = value;
	}
	
	public String getShock_energy_5() {
		return shock_energy_5;
	}
	
	public void setNum_shocks_1(String value) {
		this.num_shocks_1 = value;
	}
	
	public String getNum_shocks_1() {
		return num_shocks_1;
	}
	
	public void setNum_shocks_2(String value) {
		this.num_shocks_2 = value;
	}
	
	public String getNum_shocks_2() {
		return num_shocks_2;
	}
	
	public void setNum_shocks_3(String value) {
		this.num_shocks_3 = value;
	}
	
	public String getNum_shocks_3() {
		return num_shocks_3;
	}
	
	public void setNum_shocks_4(String value) {
		this.num_shocks_4 = value;
	}
	
	public String getNum_shocks_4() {
		return num_shocks_4;
	}
	
	public void setNum_shocks_5(String value) {
		this.num_shocks_5 = value;
	}
	
	public String getNum_shocks_5() {
		return num_shocks_5;
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
	
	public void setsET(tr.com.srdc.icardea.hibernate.SET value) {
		if (sET != null) {
			sET.zONE.remove(this);
		}
		if (value != null) {
			value.zONE.add(this);
		}
	}
	
	public tr.com.srdc.icardea.hibernate.SET getsET() {
		return sET;
	}
	
	/**
	 * This method is for internal use only.
	 */
	private void setORM_sET(tr.com.srdc.icardea.hibernate.SET value) {
		this.sET = value;
	}
	
	private tr.com.srdc.icardea.hibernate.SET getORM_SET() {
		return sET;
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
			sb.append("ZONE[ ");
			sb.append("ID=").append(getID()).append(" ");
			if (getsET() != null)
				sb.append("sET.Persist_ID=").append(getsET().toString(true)).append(" ");
			else
				sb.append("sET=null ");
			sb.append("Type=").append(getType()).append(" ");
			sb.append("Vendor_type=").append(getVendor_type()).append(" ");
			sb.append("Status=").append(getStatus()).append(" ");
			sb.append("Detection_interval=").append(getDetection_interval()).append(" ");
			sb.append("Detection_beats_numerator=").append(getDetection_beats_numerator()).append(" ");
			sb.append("Detection_beats_denominator=").append(getDetection_beats_denominator()).append(" ");
			sb.append("Detection_details=").append(getDetection_details()).append(" ");
			sb.append("Type_atp_1=").append(getType_atp_1()).append(" ");
			sb.append("Type_atp_2=").append(getType_atp_2()).append(" ");
			sb.append("Type_atp_3=").append(getType_atp_3()).append(" ");
			sb.append("Type_atp_4=").append(getType_atp_4()).append(" ");
			sb.append("Type_atp_5=").append(getType_atp_5()).append(" ");
			sb.append("Num_atp_seqs_1=").append(getNum_atp_seqs_1()).append(" ");
			sb.append("Num_atp_seqs_2=").append(getNum_atp_seqs_2()).append(" ");
			sb.append("Num_atp_seqs_3=").append(getNum_atp_seqs_3()).append(" ");
			sb.append("Num_atp_seqs_4=").append(getNum_atp_seqs_4()).append(" ");
			sb.append("Num_atp_seqs_5=").append(getNum_atp_seqs_5()).append(" ");
			sb.append("Shock_energy_1=").append(getShock_energy_1()).append(" ");
			sb.append("Shock_energy_2=").append(getShock_energy_2()).append(" ");
			sb.append("Shock_energy_3=").append(getShock_energy_3()).append(" ");
			sb.append("Shock_energy_4=").append(getShock_energy_4()).append(" ");
			sb.append("Shock_energy_5=").append(getShock_energy_5()).append(" ");
			sb.append("Num_shocks_1=").append(getNum_shocks_1()).append(" ");
			sb.append("Num_shocks_2=").append(getNum_shocks_2()).append(" ");
			sb.append("Num_shocks_3=").append(getNum_shocks_3()).append(" ");
			sb.append("Num_shocks_4=").append(getNum_shocks_4()).append(" ");
			sb.append("Num_shocks_5=").append(getNum_shocks_5()).append(" ");
			sb.append("SubID=").append(getSubID()).append(" ");
			sb.append("]");
			return sb.toString();
		}
	}
	
}
