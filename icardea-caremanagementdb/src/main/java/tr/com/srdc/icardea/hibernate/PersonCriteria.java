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

import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class PersonCriteria extends AbstractORMCriteria {
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
	
	public PersonCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		identifier = new StringExpression("identifier", this);
		alternateIdentifier = new StringExpression("alternateIdentifier", this);
		name = new StringExpression("name", this);
		surname = new StringExpression("surname", this);
		middleName = new StringExpression("middleName", this);
		title = new StringExpression("title", this);
		role = new StringExpression("role", this);
		username = new StringExpression("username", this);
		password = new StringExpression("password", this);
	}
	
	public PersonCriteria(PersistentSession session) {
		this(session.createCriteria(Person.class));
	}
	
	public PersonCriteria() throws PersistentException {
		this(tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession());
	}
	
	public OrganizationCriteria createOrganizationCriteria() {
		return new OrganizationCriteria(createCriteria("organization"));
	}
	
	public ContactCriteria createContactCriteria() {
		return new ContactCriteria(createCriteria("contact"));
	}
	
	public Person uniquePerson() {
		return (Person) super.uniqueResult();
	}
	
	public Person[] listPerson() {
		java.util.List list = super.list();
		return (Person[]) list.toArray(new Person[list.size()]);
	}
}

