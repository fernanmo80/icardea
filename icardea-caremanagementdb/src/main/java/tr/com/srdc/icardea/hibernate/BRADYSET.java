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

public class BRADYSET {
	private static final org.apache.log4j.Logger _logger = org.apache.log4j.Logger.getLogger(BRADYSET.class);
	public BRADYSET() {
	}
	
	public static BRADYSET loadBRADYSETByORMID(int ID) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return loadBRADYSETByORMID(session, ID);
		}
		catch (Exception e) {
			_logger.error("loadBRADYSETByORMID(int ID)", e);
			return null;
		}
	}
	
	public static BRADYSET getBRADYSETByORMID(int ID) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return getBRADYSETByORMID(session, ID);
		}
		catch (Exception e) {
			_logger.error("getBRADYSETByORMID(int ID)", e);
			return null;
		}
	}
	
	public static BRADYSET loadBRADYSETByORMID(int ID, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return loadBRADYSETByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			_logger.error("loadBRADYSETByORMID(int ID, org.hibernate.LockMode lockMode)", e);
			return null;
		}
	}
	
	public static BRADYSET getBRADYSETByORMID(int ID, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return getBRADYSETByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			_logger.error("getBRADYSETByORMID(int ID, org.hibernate.LockMode lockMode)", e);
			return null;
		}
	}
	
	public static BRADYSET loadBRADYSETByORMID(PersistentSession session, int ID) {
		try {
			return (BRADYSET) session.load(tr.com.srdc.icardea.hibernate.BRADYSET.class, new Integer(ID));
		}
		catch (Exception e) {
			_logger.error("loadBRADYSETByORMID(PersistentSession session, int ID)", e);
			return null;
		}
	}
	
	public static BRADYSET getBRADYSETByORMID(PersistentSession session, int ID) {
		try {
			return (BRADYSET) session.get(tr.com.srdc.icardea.hibernate.BRADYSET.class, new Integer(ID));
		}
		catch (Exception e) {
			_logger.error("getBRADYSETByORMID(PersistentSession session, int ID)", e);
			return null;
		}
	}
	
	public static BRADYSET loadBRADYSETByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) {
		try {
			return (BRADYSET) session.load(tr.com.srdc.icardea.hibernate.BRADYSET.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			_logger.error("loadBRADYSETByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode)", e);
			return null;
		}
	}
	
	public static BRADYSET getBRADYSETByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) {
		try {
			return (BRADYSET) session.get(tr.com.srdc.icardea.hibernate.BRADYSET.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			_logger.error("getBRADYSETByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode)", e);
			return null;
		}
	}
	
	public static BRADYSET[] listBRADYSETByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return listBRADYSETByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("listBRADYSETByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static BRADYSET[] listBRADYSETByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return listBRADYSETByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("listBRADYSETByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static BRADYSET[] listBRADYSETByQuery(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From tr.com.srdc.icardea.hibernate.BRADYSET as BRADYSET");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			List list = query.list();
			return (BRADYSET[]) list.toArray(new BRADYSET[list.size()]);
		}
		catch (Exception e) {
			_logger.error("listBRADYSETByQuery(PersistentSession session, String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static BRADYSET[] listBRADYSETByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From tr.com.srdc.icardea.hibernate.BRADYSET as BRADYSET");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("this", lockMode);
			List list = query.list();
			return (BRADYSET[]) list.toArray(new BRADYSET[list.size()]);
		}
		catch (Exception e) {
			_logger.error("listBRADYSETByQuery(PersistentSession session, String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static BRADYSET loadBRADYSETByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return loadBRADYSETByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("loadBRADYSETByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static BRADYSET loadBRADYSETByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return loadBRADYSETByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("loadBRADYSETByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static BRADYSET loadBRADYSETByQuery(PersistentSession session, String condition, String orderBy) {
		BRADYSET[] bRADYSETs = listBRADYSETByQuery(session, condition, orderBy);
		if (bRADYSETs != null && bRADYSETs.length > 0)
			return bRADYSETs[0];
		else
			return null;
	}
	
	public static BRADYSET loadBRADYSETByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		BRADYSET[] bRADYSETs = listBRADYSETByQuery(session, condition, orderBy, lockMode);
		if (bRADYSETs != null && bRADYSETs.length > 0)
			return bRADYSETs[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateBRADYSETByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return iterateBRADYSETByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("iterateBRADYSETByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static java.util.Iterator iterateBRADYSETByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return iterateBRADYSETByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("iterateBRADYSETByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static java.util.Iterator iterateBRADYSETByQuery(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From tr.com.srdc.icardea.hibernate.BRADYSET as BRADYSET");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			_logger.error("iterateBRADYSETByQuery(PersistentSession session, String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static java.util.Iterator iterateBRADYSETByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From tr.com.srdc.icardea.hibernate.BRADYSET as BRADYSET");
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
			_logger.error("iterateBRADYSETByQuery(PersistentSession session, String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static BRADYSET loadBRADYSETByCriteria(BRADYSETCriteria bRADYSETCriteria) {
		BRADYSET[] bRADYSETs = listBRADYSETByCriteria(bRADYSETCriteria);
		if(bRADYSETs == null || bRADYSETs.length == 0) {
			return null;
		}
		return bRADYSETs[0];
	}
	
	public static BRADYSET[] listBRADYSETByCriteria(BRADYSETCriteria bRADYSETCriteria) {
		return bRADYSETCriteria.listBRADYSET();
	}
	
	public static BRADYSET createBRADYSET() {
		return new tr.com.srdc.icardea.hibernate.BRADYSET();
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
				getsET().setbRADYSET(null);
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
				getsET().setbRADYSET(null);
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
	
	private tr.com.srdc.icardea.hibernate.SET sET;
	
	private String mode;
	
	private String vendor_mode;
	
	private String lowrate;
	
	private String hystrate;
	
	private String night_rate;
	
	private String sensor_type;
	
	private String max_tracking_rate;
	
	private String max_sensor_rate;
	
	private String sav_delay_high;
	
	private String sav_delay_low;
	
	private String pav_delay_high;
	
	private String pav_delay_low;
	
	private String at_mode_switch_mode;
	
	private String at_mode_switch_rate;
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setMode(String value) {
		this.mode = value;
	}
	
	public String getMode() {
		return mode;
	}
	
	public void setVendor_mode(String value) {
		this.vendor_mode = value;
	}
	
	public String getVendor_mode() {
		return vendor_mode;
	}
	
	public void setLowrate(String value) {
		this.lowrate = value;
	}
	
	public String getLowrate() {
		return lowrate;
	}
	
	public void setHystrate(String value) {
		this.hystrate = value;
	}
	
	public String getHystrate() {
		return hystrate;
	}
	
	public void setNight_rate(String value) {
		this.night_rate = value;
	}
	
	public String getNight_rate() {
		return night_rate;
	}
	
	public void setSensor_type(String value) {
		this.sensor_type = value;
	}
	
	public String getSensor_type() {
		return sensor_type;
	}
	
	public void setMax_tracking_rate(String value) {
		this.max_tracking_rate = value;
	}
	
	public String getMax_tracking_rate() {
		return max_tracking_rate;
	}
	
	public void setMax_sensor_rate(String value) {
		this.max_sensor_rate = value;
	}
	
	public String getMax_sensor_rate() {
		return max_sensor_rate;
	}
	
	public void setSav_delay_high(String value) {
		this.sav_delay_high = value;
	}
	
	public String getSav_delay_high() {
		return sav_delay_high;
	}
	
	public void setSav_delay_low(String value) {
		this.sav_delay_low = value;
	}
	
	public String getSav_delay_low() {
		return sav_delay_low;
	}
	
	public void setPav_delay_high(String value) {
		this.pav_delay_high = value;
	}
	
	public String getPav_delay_high() {
		return pav_delay_high;
	}
	
	public void setPav_delay_low(String value) {
		this.pav_delay_low = value;
	}
	
	public String getPav_delay_low() {
		return pav_delay_low;
	}
	
	public void setAt_mode_switch_mode(String value) {
		this.at_mode_switch_mode = value;
	}
	
	public String getAt_mode_switch_mode() {
		return at_mode_switch_mode;
	}
	
	public void setAt_mode_switch_rate(String value) {
		this.at_mode_switch_rate = value;
	}
	
	public String getAt_mode_switch_rate() {
		return at_mode_switch_rate;
	}
	
	public void setsET(tr.com.srdc.icardea.hibernate.SET value) {
		if (this.sET != value) {
			tr.com.srdc.icardea.hibernate.SET lsET = this.sET;
			this.sET = value;
			if (value != null) {
				sET.setbRADYSET(this);
			}
			else {
				lsET.setbRADYSET(null);
			}
		}
	}
	
	public tr.com.srdc.icardea.hibernate.SET getsET() {
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
			sb.append("BRADYSET[ ");
			sb.append("ID=").append(getID()).append(" ");
			if (getsET() != null)
				sb.append("sET.Persist_ID=").append(getsET().toString(true)).append(" ");
			else
				sb.append("sET=null ");
			sb.append("Mode=").append(getMode()).append(" ");
			sb.append("Vendor_mode=").append(getVendor_mode()).append(" ");
			sb.append("Lowrate=").append(getLowrate()).append(" ");
			sb.append("Hystrate=").append(getHystrate()).append(" ");
			sb.append("Night_rate=").append(getNight_rate()).append(" ");
			sb.append("Sensor_type=").append(getSensor_type()).append(" ");
			sb.append("Max_tracking_rate=").append(getMax_tracking_rate()).append(" ");
			sb.append("Max_sensor_rate=").append(getMax_sensor_rate()).append(" ");
			sb.append("Sav_delay_high=").append(getSav_delay_high()).append(" ");
			sb.append("Sav_delay_low=").append(getSav_delay_low()).append(" ");
			sb.append("Pav_delay_high=").append(getPav_delay_high()).append(" ");
			sb.append("Pav_delay_low=").append(getPav_delay_low()).append(" ");
			sb.append("At_mode_switch_mode=").append(getAt_mode_switch_mode()).append(" ");
			sb.append("At_mode_switch_rate=").append(getAt_mode_switch_rate()).append(" ");
			sb.append("]");
			return sb.toString();
		}
	}
	
}
