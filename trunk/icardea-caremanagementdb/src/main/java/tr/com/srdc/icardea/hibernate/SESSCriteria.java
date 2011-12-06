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

public class SESSCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final StringExpression dtm;
	public final StringExpression type;
	public final StringExpression reprogrammed;
	public final StringExpression dtm_previous;
	public final StringExpression type_previous;
	public final StringExpression reprogrammed_previous;
	public final StringExpression clinician_name;
	public final StringExpression clinician_contact_information;
	public final StringExpression clinic_name;
	
	public SESSCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		dtm = new StringExpression("dtm", this);
		type = new StringExpression("type", this);
		reprogrammed = new StringExpression("reprogrammed", this);
		dtm_previous = new StringExpression("dtm_previous", this);
		type_previous = new StringExpression("type_previous", this);
		reprogrammed_previous = new StringExpression("reprogrammed_previous", this);
		clinician_name = new StringExpression("clinician_name", this);
		clinician_contact_information = new StringExpression("clinician_contact_information", this);
		clinic_name = new StringExpression("clinic_name", this);
	}
	
	public SESSCriteria(PersistentSession session) {
		this(session.createCriteria(SESS.class));
	}
	
	public SESSCriteria() throws PersistentException {
		this(tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession());
	}
	
	public SystemCriteria createSystemCriteria() {
		return new SystemCriteria(createCriteria("system"));
	}
	
	public SESS uniqueSESS() {
		return (SESS) super.uniqueResult();
	}
	
	public SESS[] listSESS() {
		java.util.List list = super.list();
		return (SESS[]) list.toArray(new SESS[list.size()]);
	}
}

