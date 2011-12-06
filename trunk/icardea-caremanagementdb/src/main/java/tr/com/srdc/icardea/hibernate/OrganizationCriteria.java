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

public class OrganizationCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final StringExpression name;
	public final StringExpression identifier;
	
	public OrganizationCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		name = new StringExpression("name", this);
		identifier = new StringExpression("identifier", this);
	}
	
	public OrganizationCriteria(PersistentSession session) {
		this(session.createCriteria(Organization.class));
	}
	
	public OrganizationCriteria() throws PersistentException {
		this(tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession());
	}
	
	public PersonCriteria createPersonCriteria() {
		return new PersonCriteria(createCriteria("person"));
	}
	
	public ContactCriteria createContactCriteria() {
		return new ContactCriteria(createCriteria("contact"));
	}
	
	public Organization uniqueOrganization() {
		return (Organization) super.uniqueResult();
	}
	
	public Organization[] listOrganization() {
		java.util.List list = super.list();
		return (Organization[]) list.toArray(new Organization[list.size()]);
	}
}

