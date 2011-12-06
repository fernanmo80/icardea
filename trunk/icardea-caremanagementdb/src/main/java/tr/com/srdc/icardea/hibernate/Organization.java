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

public class Organization {
	private static final org.apache.log4j.Logger _logger = org.apache.log4j.Logger.getLogger(Organization.class);
	public Organization() {
	}
	
	public static Organization loadOrganizationByORMID(int ID) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return loadOrganizationByORMID(session, ID);
		}
		catch (Exception e) {
			_logger.error("loadOrganizationByORMID(int ID)", e);
			return null;
		}
	}
	
	public static Organization getOrganizationByORMID(int ID) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return getOrganizationByORMID(session, ID);
		}
		catch (Exception e) {
			_logger.error("getOrganizationByORMID(int ID)", e);
			return null;
		}
	}
	
	public static Organization loadOrganizationByORMID(int ID, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return loadOrganizationByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			_logger.error("loadOrganizationByORMID(int ID, org.hibernate.LockMode lockMode)", e);
			return null;
		}
	}
	
	public static Organization getOrganizationByORMID(int ID, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return getOrganizationByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			_logger.error("getOrganizationByORMID(int ID, org.hibernate.LockMode lockMode)", e);
			return null;
		}
	}
	
	public static Organization loadOrganizationByORMID(PersistentSession session, int ID) {
		try {
			return (Organization) session.load(tr.com.srdc.icardea.hibernate.Organization.class, new Integer(ID));
		}
		catch (Exception e) {
			_logger.error("loadOrganizationByORMID(PersistentSession session, int ID)", e);
			return null;
		}
	}
	
	public static Organization getOrganizationByORMID(PersistentSession session, int ID) {
		try {
			return (Organization) session.get(tr.com.srdc.icardea.hibernate.Organization.class, new Integer(ID));
		}
		catch (Exception e) {
			_logger.error("getOrganizationByORMID(PersistentSession session, int ID)", e);
			return null;
		}
	}
	
	public static Organization loadOrganizationByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) {
		try {
			return (Organization) session.load(tr.com.srdc.icardea.hibernate.Organization.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			_logger.error("loadOrganizationByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode)", e);
			return null;
		}
	}
	
	public static Organization getOrganizationByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) {
		try {
			return (Organization) session.get(tr.com.srdc.icardea.hibernate.Organization.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			_logger.error("getOrganizationByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode)", e);
			return null;
		}
	}
	
	public static Organization[] listOrganizationByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return listOrganizationByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("listOrganizationByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static Organization[] listOrganizationByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return listOrganizationByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("listOrganizationByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static Organization[] listOrganizationByQuery(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From tr.com.srdc.icardea.hibernate.Organization as Organization");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			List list = query.list();
			return (Organization[]) list.toArray(new Organization[list.size()]);
		}
		catch (Exception e) {
			_logger.error("listOrganizationByQuery(PersistentSession session, String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static Organization[] listOrganizationByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From tr.com.srdc.icardea.hibernate.Organization as Organization");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("this", lockMode);
			List list = query.list();
			return (Organization[]) list.toArray(new Organization[list.size()]);
		}
		catch (Exception e) {
			_logger.error("listOrganizationByQuery(PersistentSession session, String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static Organization loadOrganizationByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return loadOrganizationByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("loadOrganizationByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static Organization loadOrganizationByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return loadOrganizationByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("loadOrganizationByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static Organization loadOrganizationByQuery(PersistentSession session, String condition, String orderBy) {
		Organization[] organizations = listOrganizationByQuery(session, condition, orderBy);
		if (organizations != null && organizations.length > 0)
			return organizations[0];
		else
			return null;
	}
	
	public static Organization loadOrganizationByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		Organization[] organizations = listOrganizationByQuery(session, condition, orderBy, lockMode);
		if (organizations != null && organizations.length > 0)
			return organizations[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateOrganizationByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return iterateOrganizationByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("iterateOrganizationByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static java.util.Iterator iterateOrganizationByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return iterateOrganizationByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("iterateOrganizationByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static java.util.Iterator iterateOrganizationByQuery(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From tr.com.srdc.icardea.hibernate.Organization as Organization");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			_logger.error("iterateOrganizationByQuery(PersistentSession session, String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static java.util.Iterator iterateOrganizationByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From tr.com.srdc.icardea.hibernate.Organization as Organization");
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
			_logger.error("iterateOrganizationByQuery(PersistentSession session, String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static Organization loadOrganizationByCriteria(OrganizationCriteria organizationCriteria) {
		Organization[] organizations = listOrganizationByCriteria(organizationCriteria);
		if(organizations == null || organizations.length == 0) {
			return null;
		}
		return organizations[0];
	}
	
	public static Organization[] listOrganizationByCriteria(OrganizationCriteria organizationCriteria) {
		return organizationCriteria.listOrganization();
	}
	
	public static Organization createOrganization() {
		return new tr.com.srdc.icardea.hibernate.Organization();
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
			if(getPerson() != null) {
				getPerson().setOrganization(null);
			}
			
			if(getContact() != null) {
				getContact().setOrganization(null);
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
			if(getPerson() != null) {
				getPerson().setOrganization(null);
			}
			
			if(getContact() != null) {
				getContact().setOrganization(null);
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
	
	private String name;
	
	private String identifier;
	
	private tr.com.srdc.icardea.hibernate.Person person;
	
	private tr.com.srdc.icardea.hibernate.Contact contact;
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setName(String value) {
		this.name = value;
	}
	
	public String getName() {
		return name;
	}
	
	public void setIdentifier(String value) {
		this.identifier = value;
	}
	
	public String getIdentifier() {
		return identifier;
	}
	
	public void setPerson(tr.com.srdc.icardea.hibernate.Person value) {
		if (this.person != value) {
			tr.com.srdc.icardea.hibernate.Person lperson = this.person;
			this.person = value;
			if (value != null) {
				person.setOrganization(this);
			}
			else {
				lperson.setOrganization(null);
			}
		}
	}
	
	public tr.com.srdc.icardea.hibernate.Person getPerson() {
		return person;
	}
	
	public void setContact(tr.com.srdc.icardea.hibernate.Contact value) {
		if (this.contact != value) {
			tr.com.srdc.icardea.hibernate.Contact lcontact = this.contact;
			this.contact = value;
			if (value != null) {
				contact.setOrganization(this);
			}
			else {
				lcontact.setOrganization(null);
			}
		}
	}
	
	public tr.com.srdc.icardea.hibernate.Contact getContact() {
		return contact;
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
			sb.append("Organization[ ");
			sb.append("ID=").append(getID()).append(" ");
			sb.append("Name=").append(getName()).append(" ");
			sb.append("Identifier=").append(getIdentifier()).append(" ");
			if (getPerson() != null)
				sb.append("Person.Persist_ID=").append(getPerson().toString(true)).append(" ");
			else
				sb.append("Person=null ");
			if (getContact() != null)
				sb.append("Contact.Persist_ID=").append(getContact().toString(true)).append(" ");
			else
				sb.append("Contact=null ");
			sb.append("]");
			return sb.toString();
		}
	}
	
}
