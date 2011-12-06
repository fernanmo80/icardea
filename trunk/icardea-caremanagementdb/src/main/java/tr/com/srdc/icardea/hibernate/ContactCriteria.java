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

public class ContactCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final StringExpression addressLine;
	public final StringExpression faxNumber;
	public final StringExpression email;
	public final StringExpression phoneNumber;
	public final StringExpression mobileNumber;
	public final StringExpression GTalk;
	
	public ContactCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		addressLine = new StringExpression("addressLine", this);
		faxNumber = new StringExpression("faxNumber", this);
		email = new StringExpression("email", this);
		phoneNumber = new StringExpression("phoneNumber", this);
		mobileNumber = new StringExpression("mobileNumber", this);
		GTalk = new StringExpression("GTalk", this);
	}
	
	public ContactCriteria(PersistentSession session) {
		this(session.createCriteria(Contact.class));
	}
	
	public ContactCriteria() throws PersistentException {
		this(tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession());
	}
	
	public OrganizationCriteria createOrganizationCriteria() {
		return new OrganizationCriteria(createCriteria("organization"));
	}
	
	public PersonCriteria createPersonCriteria() {
		return new PersonCriteria(createCriteria("person"));
	}
	
	public Contact uniqueContact() {
		return (Contact) super.uniqueResult();
	}
	
	public Contact[] listContact() {
		java.util.List list = super.list();
		return (Contact[]) list.toArray(new Contact[list.size()]);
	}
}

