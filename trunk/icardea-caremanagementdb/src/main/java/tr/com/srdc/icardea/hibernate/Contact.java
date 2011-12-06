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

public class Contact {
	private static final org.apache.log4j.Logger _logger = org.apache.log4j.Logger.getLogger(Contact.class);
	public Contact() {
	}
	
	public static Contact loadContactByORMID(int ID) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return loadContactByORMID(session, ID);
		}
		catch (Exception e) {
			_logger.error("loadContactByORMID(int ID)", e);
			return null;
		}
	}
	
	public static Contact getContactByORMID(int ID) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return getContactByORMID(session, ID);
		}
		catch (Exception e) {
			_logger.error("getContactByORMID(int ID)", e);
			return null;
		}
	}
	
	public static Contact loadContactByORMID(int ID, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return loadContactByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			_logger.error("loadContactByORMID(int ID, org.hibernate.LockMode lockMode)", e);
			return null;
		}
	}
	
	public static Contact getContactByORMID(int ID, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return getContactByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			_logger.error("getContactByORMID(int ID, org.hibernate.LockMode lockMode)", e);
			return null;
		}
	}
	
	public static Contact loadContactByORMID(PersistentSession session, int ID) {
		try {
			return (Contact) session.load(tr.com.srdc.icardea.hibernate.Contact.class, new Integer(ID));
		}
		catch (Exception e) {
			_logger.error("loadContactByORMID(PersistentSession session, int ID)", e);
			return null;
		}
	}
	
	public static Contact getContactByORMID(PersistentSession session, int ID) {
		try {
			return (Contact) session.get(tr.com.srdc.icardea.hibernate.Contact.class, new Integer(ID));
		}
		catch (Exception e) {
			_logger.error("getContactByORMID(PersistentSession session, int ID)", e);
			return null;
		}
	}
	
	public static Contact loadContactByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) {
		try {
			return (Contact) session.load(tr.com.srdc.icardea.hibernate.Contact.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			_logger.error("loadContactByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode)", e);
			return null;
		}
	}
	
	public static Contact getContactByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) {
		try {
			return (Contact) session.get(tr.com.srdc.icardea.hibernate.Contact.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			_logger.error("getContactByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode)", e);
			return null;
		}
	}
	
	public static Contact[] listContactByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return listContactByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("listContactByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static Contact[] listContactByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return listContactByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("listContactByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static Contact[] listContactByQuery(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From tr.com.srdc.icardea.hibernate.Contact as Contact");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			List list = query.list();
			return (Contact[]) list.toArray(new Contact[list.size()]);
		}
		catch (Exception e) {
			_logger.error("listContactByQuery(PersistentSession session, String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static Contact[] listContactByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From tr.com.srdc.icardea.hibernate.Contact as Contact");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("this", lockMode);
			List list = query.list();
			return (Contact[]) list.toArray(new Contact[list.size()]);
		}
		catch (Exception e) {
			_logger.error("listContactByQuery(PersistentSession session, String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static Contact loadContactByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return loadContactByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("loadContactByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static Contact loadContactByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return loadContactByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("loadContactByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static Contact loadContactByQuery(PersistentSession session, String condition, String orderBy) {
		Contact[] contacts = listContactByQuery(session, condition, orderBy);
		if (contacts != null && contacts.length > 0)
			return contacts[0];
		else
			return null;
	}
	
	public static Contact loadContactByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		Contact[] contacts = listContactByQuery(session, condition, orderBy, lockMode);
		if (contacts != null && contacts.length > 0)
			return contacts[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateContactByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return iterateContactByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("iterateContactByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static java.util.Iterator iterateContactByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return iterateContactByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("iterateContactByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static java.util.Iterator iterateContactByQuery(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From tr.com.srdc.icardea.hibernate.Contact as Contact");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			_logger.error("iterateContactByQuery(PersistentSession session, String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static java.util.Iterator iterateContactByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From tr.com.srdc.icardea.hibernate.Contact as Contact");
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
			_logger.error("iterateContactByQuery(PersistentSession session, String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static Contact loadContactByCriteria(ContactCriteria contactCriteria) {
		Contact[] contacts = listContactByCriteria(contactCriteria);
		if(contacts == null || contacts.length == 0) {
			return null;
		}
		return contacts[0];
	}
	
	public static Contact[] listContactByCriteria(ContactCriteria contactCriteria) {
		return contactCriteria.listContact();
	}
	
	public static Contact createContact() {
		return new tr.com.srdc.icardea.hibernate.Contact();
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
			if(getOrganization() != null) {
				getOrganization().setContact(null);
			}
			
			if(getPerson() != null) {
				getPerson().setContact(null);
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
			if(getOrganization() != null) {
				getOrganization().setContact(null);
			}
			
			if(getPerson() != null) {
				getPerson().setContact(null);
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
	
	private String addressLine;
	
	private String faxNumber;
	
	private String email;
	
	private String phoneNumber;
	
	private String mobileNumber;
	
	private String GTalk;
	
	private tr.com.srdc.icardea.hibernate.Organization organization;
	
	private tr.com.srdc.icardea.hibernate.Person person;
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setAddressLine(String value) {
		this.addressLine = value;
	}
	
	public String getAddressLine() {
		return addressLine;
	}
	
	public void setFaxNumber(String value) {
		this.faxNumber = value;
	}
	
	public String getFaxNumber() {
		return faxNumber;
	}
	
	public void setEmail(String value) {
		this.email = value;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setPhoneNumber(String value) {
		this.phoneNumber = value;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public void setMobileNumber(String value) {
		this.mobileNumber = value;
	}
	
	public String getMobileNumber() {
		return mobileNumber;
	}
	
	public void setGTalk(String value) {
		this.GTalk = value;
	}
	
	public String getGTalk() {
		return GTalk;
	}
	
	public void setOrganization(tr.com.srdc.icardea.hibernate.Organization value) {
		if (this.organization != value) {
			tr.com.srdc.icardea.hibernate.Organization lorganization = this.organization;
			this.organization = value;
			if (value != null) {
				organization.setContact(this);
			}
			else {
				lorganization.setContact(null);
			}
		}
	}
	
	public tr.com.srdc.icardea.hibernate.Organization getOrganization() {
		return organization;
	}
	
	public void setPerson(tr.com.srdc.icardea.hibernate.Person value) {
		if (this.person != value) {
			tr.com.srdc.icardea.hibernate.Person lperson = this.person;
			this.person = value;
			if (value != null) {
				person.setContact(this);
			}
			else {
				lperson.setContact(null);
			}
		}
	}
	
	public tr.com.srdc.icardea.hibernate.Person getPerson() {
		return person;
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
			sb.append("Contact[ ");
			sb.append("ID=").append(getID()).append(" ");
			sb.append("AddressLine=").append(getAddressLine()).append(" ");
			sb.append("FaxNumber=").append(getFaxNumber()).append(" ");
			sb.append("Email=").append(getEmail()).append(" ");
			sb.append("PhoneNumber=").append(getPhoneNumber()).append(" ");
			sb.append("MobileNumber=").append(getMobileNumber()).append(" ");
			sb.append("GTalk=").append(getGTalk()).append(" ");
			if (getOrganization() != null)
				sb.append("Organization.Persist_ID=").append(getOrganization().toString(true)).append(" ");
			else
				sb.append("Organization=null ");
			if (getPerson() != null)
				sb.append("Person.Persist_ID=").append(getPerson().toString(true)).append(" ");
			else
				sb.append("Person=null ");
			sb.append("]");
			return sb.toString();
		}
	}
	
}
