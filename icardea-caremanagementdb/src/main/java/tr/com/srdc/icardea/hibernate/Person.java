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

public class Person {
	private static final org.apache.log4j.Logger _logger = org.apache.log4j.Logger.getLogger(Person.class);
	public Person() {
	}
	
	public static Person loadPersonByORMID(int ID) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return loadPersonByORMID(session, ID);
		}
		catch (Exception e) {
			_logger.error("loadPersonByORMID(int ID)", e);
			return null;
		}
	}
	
	public static Person getPersonByORMID(int ID) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return getPersonByORMID(session, ID);
		}
		catch (Exception e) {
			_logger.error("getPersonByORMID(int ID)", e);
			return null;
		}
	}
	
	public static Person loadPersonByORMID(int ID, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return loadPersonByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			_logger.error("loadPersonByORMID(int ID, org.hibernate.LockMode lockMode)", e);
			return null;
		}
	}
	
	public static Person getPersonByORMID(int ID, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return getPersonByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			_logger.error("getPersonByORMID(int ID, org.hibernate.LockMode lockMode)", e);
			return null;
		}
	}
	
	public static Person loadPersonByORMID(PersistentSession session, int ID) {
		try {
			return (Person) session.load(tr.com.srdc.icardea.hibernate.Person.class, new Integer(ID));
		}
		catch (Exception e) {
			_logger.error("loadPersonByORMID(PersistentSession session, int ID)", e);
			return null;
		}
	}
	
	public static Person getPersonByORMID(PersistentSession session, int ID) {
		try {
			return (Person) session.get(tr.com.srdc.icardea.hibernate.Person.class, new Integer(ID));
		}
		catch (Exception e) {
			_logger.error("getPersonByORMID(PersistentSession session, int ID)", e);
			return null;
		}
	}
	
	public static Person loadPersonByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) {
		try {
			return (Person) session.load(tr.com.srdc.icardea.hibernate.Person.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			_logger.error("loadPersonByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode)", e);
			return null;
		}
	}
	
	public static Person getPersonByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) {
		try {
			return (Person) session.get(tr.com.srdc.icardea.hibernate.Person.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			_logger.error("getPersonByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode)", e);
			return null;
		}
	}
	
	public static Person[] listPersonByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return listPersonByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("listPersonByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static Person[] listPersonByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return listPersonByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("listPersonByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static Person[] listPersonByQuery(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From tr.com.srdc.icardea.hibernate.Person as Person");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			List list = query.list();
			return (Person[]) list.toArray(new Person[list.size()]);
		}
		catch (Exception e) {
			_logger.error("listPersonByQuery(PersistentSession session, String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static Person[] listPersonByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From tr.com.srdc.icardea.hibernate.Person as Person");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("this", lockMode);
			List list = query.list();
			return (Person[]) list.toArray(new Person[list.size()]);
		}
		catch (Exception e) {
			_logger.error("listPersonByQuery(PersistentSession session, String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static Person loadPersonByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return loadPersonByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("loadPersonByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static Person loadPersonByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return loadPersonByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("loadPersonByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static Person loadPersonByQuery(PersistentSession session, String condition, String orderBy) {
		Person[] persons = listPersonByQuery(session, condition, orderBy);
		if (persons != null && persons.length > 0)
			return persons[0];
		else
			return null;
	}
	
	public static Person loadPersonByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		Person[] persons = listPersonByQuery(session, condition, orderBy, lockMode);
		if (persons != null && persons.length > 0)
			return persons[0];
		else
			return null;
	}
	
	public static java.util.Iterator iteratePersonByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return iteratePersonByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("iteratePersonByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static java.util.Iterator iteratePersonByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession();
			return iteratePersonByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("iteratePersonByQuery(String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static java.util.Iterator iteratePersonByQuery(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From tr.com.srdc.icardea.hibernate.Person as Person");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			_logger.error("iteratePersonByQuery(PersistentSession session, String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static java.util.Iterator iteratePersonByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From tr.com.srdc.icardea.hibernate.Person as Person");
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
			_logger.error("iteratePersonByQuery(PersistentSession session, String condition, String orderBy)", e);
			return null;
		}
	}
	
	public static Person loadPersonByCriteria(PersonCriteria personCriteria) {
		Person[] persons = listPersonByCriteria(personCriteria);
		if(persons == null || persons.length == 0) {
			return null;
		}
		return persons[0];
	}
	
	public static Person[] listPersonByCriteria(PersonCriteria personCriteria) {
		return personCriteria.listPerson();
	}
	
	public static Person createPerson() {
		return new tr.com.srdc.icardea.hibernate.Person();
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
				getOrganization().setPerson(null);
			}
			
			if(getContact() != null) {
				getContact().setPerson(null);
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
				getOrganization().setPerson(null);
			}
			
			if(getContact() != null) {
				getContact().setPerson(null);
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
	
	private String identifier;
	
	private String alternateIdentifier;
	
	private String name;
	
	private String surname;
	
	private String middleName;
	
	private String title;
	
	private String role;
	
	private String username;
	
	private String password;
	
	private tr.com.srdc.icardea.hibernate.Organization organization;
	
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
	
	public void setIdentifier(String value) {
		this.identifier = value;
	}
	
	public String getIdentifier() {
		return identifier;
	}
	
	public void setAlternateIdentifier(String value) {
		this.alternateIdentifier = value;
	}
	
	public String getAlternateIdentifier() {
		return alternateIdentifier;
	}
	
	public void setName(String value) {
		this.name = value;
	}
	
	public String getName() {
		return name;
	}
	
	public void setSurname(String value) {
		this.surname = value;
	}
	
	public String getSurname() {
		return surname;
	}
	
	public void setMiddleName(String value) {
		this.middleName = value;
	}
	
	public String getMiddleName() {
		return middleName;
	}
	
	public void setTitle(String value) {
		this.title = value;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setRole(String value) {
		this.role = value;
	}
	
	public String getRole() {
		return role;
	}
	
	public void setUsername(String value) {
		this.username = value;
	}
	
	public String getUsername() {
		return username;
	}
	
	public void setPassword(String value) {
		this.password = value;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setOrganization(tr.com.srdc.icardea.hibernate.Organization value) {
		if (this.organization != value) {
			tr.com.srdc.icardea.hibernate.Organization lorganization = this.organization;
			this.organization = value;
			if (value != null) {
				organization.setPerson(this);
			}
			else {
				lorganization.setPerson(null);
			}
		}
	}
	
	public tr.com.srdc.icardea.hibernate.Organization getOrganization() {
		return organization;
	}
	
	public void setContact(tr.com.srdc.icardea.hibernate.Contact value) {
		if (this.contact != value) {
			tr.com.srdc.icardea.hibernate.Contact lcontact = this.contact;
			this.contact = value;
			if (value != null) {
				contact.setPerson(this);
			}
			else {
				lcontact.setPerson(null);
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
			sb.append("Person[ ");
			sb.append("ID=").append(getID()).append(" ");
			sb.append("Identifier=").append(getIdentifier()).append(" ");
			sb.append("AlternateIdentifier=").append(getAlternateIdentifier()).append(" ");
			sb.append("Name=").append(getName()).append(" ");
			sb.append("Surname=").append(getSurname()).append(" ");
			sb.append("MiddleName=").append(getMiddleName()).append(" ");
			sb.append("Title=").append(getTitle()).append(" ");
			sb.append("Role=").append(getRole()).append(" ");
			sb.append("Username=").append(getUsername()).append(" ");
			sb.append("Password=").append(getPassword()).append(" ");
			if (getOrganization() != null)
				sb.append("Organization.Persist_ID=").append(getOrganization().toString(true)).append(" ");
			else
				sb.append("Organization=null ");
			if (getContact() != null)
				sb.append("Contact.Persist_ID=").append(getContact().toString(true)).append(" ");
			else
				sb.append("Contact=null ");
			sb.append("]");
			return sb.toString();
		}
	}
	
}
