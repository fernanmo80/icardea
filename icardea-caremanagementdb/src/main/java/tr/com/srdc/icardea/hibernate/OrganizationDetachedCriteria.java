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

public class OrganizationDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final StringExpression name;
	public final StringExpression identifier;
	
	public OrganizationDetachedCriteria() {
		super(tr.com.srdc.icardea.hibernate.Organization.class, tr.com.srdc.icardea.hibernate.OrganizationCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		name = new StringExpression("name", this.getDetachedCriteria());
		identifier = new StringExpression("identifier", this.getDetachedCriteria());
	}
	
	public OrganizationDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, tr.com.srdc.icardea.hibernate.OrganizationCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		name = new StringExpression("name", this.getDetachedCriteria());
		identifier = new StringExpression("identifier", this.getDetachedCriteria());
	}
	
	public PersonDetachedCriteria createPersonCriteria() {
		return new PersonDetachedCriteria(createCriteria("person"));
	}
	
	public ContactDetachedCriteria createContactCriteria() {
		return new ContactDetachedCriteria(createCriteria("contact"));
	}
	
	public Organization uniqueOrganization(PersistentSession session) {
		return (Organization) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Organization[] listOrganization(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Organization[]) list.toArray(new Organization[list.size()]);
	}
}

