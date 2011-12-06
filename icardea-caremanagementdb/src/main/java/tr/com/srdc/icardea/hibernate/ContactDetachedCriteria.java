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

public class ContactDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final StringExpression addressLine;
	public final StringExpression faxNumber;
	public final StringExpression email;
	public final StringExpression phoneNumber;
	public final StringExpression mobileNumber;
	public final StringExpression GTalk;
	
	public ContactDetachedCriteria() {
		super(tr.com.srdc.icardea.hibernate.Contact.class, tr.com.srdc.icardea.hibernate.ContactCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		addressLine = new StringExpression("addressLine", this.getDetachedCriteria());
		faxNumber = new StringExpression("faxNumber", this.getDetachedCriteria());
		email = new StringExpression("email", this.getDetachedCriteria());
		phoneNumber = new StringExpression("phoneNumber", this.getDetachedCriteria());
		mobileNumber = new StringExpression("mobileNumber", this.getDetachedCriteria());
		GTalk = new StringExpression("GTalk", this.getDetachedCriteria());
	}
	
	public ContactDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, tr.com.srdc.icardea.hibernate.ContactCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		addressLine = new StringExpression("addressLine", this.getDetachedCriteria());
		faxNumber = new StringExpression("faxNumber", this.getDetachedCriteria());
		email = new StringExpression("email", this.getDetachedCriteria());
		phoneNumber = new StringExpression("phoneNumber", this.getDetachedCriteria());
		mobileNumber = new StringExpression("mobileNumber", this.getDetachedCriteria());
		GTalk = new StringExpression("GTalk", this.getDetachedCriteria());
	}
	
	public OrganizationDetachedCriteria createOrganizationCriteria() {
		return new OrganizationDetachedCriteria(createCriteria("organization"));
	}
	
	public PersonDetachedCriteria createPersonCriteria() {
		return new PersonDetachedCriteria(createCriteria("person"));
	}
	
	public Contact uniqueContact(PersistentSession session) {
		return (Contact) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Contact[] listContact(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Contact[]) list.toArray(new Contact[list.size()]);
	}
}

