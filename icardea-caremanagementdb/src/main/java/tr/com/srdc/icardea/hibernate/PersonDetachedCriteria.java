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

import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class PersonDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final StringExpression identifier;
	public final StringExpression alternateIdentifier;
	public final StringExpression name;
	public final StringExpression surname;
	public final StringExpression middleName;
	public final StringExpression title;
	public final StringExpression role;
	public final StringExpression username;
	public final StringExpression password;
	
	public PersonDetachedCriteria() {
		super(tr.com.srdc.icardea.hibernate.Person.class, tr.com.srdc.icardea.hibernate.PersonCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		identifier = new StringExpression("identifier", this.getDetachedCriteria());
		alternateIdentifier = new StringExpression("alternateIdentifier", this.getDetachedCriteria());
		name = new StringExpression("name", this.getDetachedCriteria());
		surname = new StringExpression("surname", this.getDetachedCriteria());
		middleName = new StringExpression("middleName", this.getDetachedCriteria());
		title = new StringExpression("title", this.getDetachedCriteria());
		role = new StringExpression("role", this.getDetachedCriteria());
		username = new StringExpression("username", this.getDetachedCriteria());
		password = new StringExpression("password", this.getDetachedCriteria());
	}
	
	public PersonDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, tr.com.srdc.icardea.hibernate.PersonCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		identifier = new StringExpression("identifier", this.getDetachedCriteria());
		alternateIdentifier = new StringExpression("alternateIdentifier", this.getDetachedCriteria());
		name = new StringExpression("name", this.getDetachedCriteria());
		surname = new StringExpression("surname", this.getDetachedCriteria());
		middleName = new StringExpression("middleName", this.getDetachedCriteria());
		title = new StringExpression("title", this.getDetachedCriteria());
		role = new StringExpression("role", this.getDetachedCriteria());
		username = new StringExpression("username", this.getDetachedCriteria());
		password = new StringExpression("password", this.getDetachedCriteria());
	}
	
	public OrganizationDetachedCriteria createOrganizationCriteria() {
		return new OrganizationDetachedCriteria(createCriteria("organization"));
	}
	
	public ContactDetachedCriteria createContactCriteria() {
		return new ContactDetachedCriteria(createCriteria("contact"));
	}
	
	public Person uniquePerson(PersistentSession session) {
		return (Person) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Person[] listPerson(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Person[]) list.toArray(new Person[list.size()]);
	}
}

