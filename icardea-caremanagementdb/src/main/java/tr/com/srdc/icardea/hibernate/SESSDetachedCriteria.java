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

public class SESSDetachedCriteria extends AbstractORMDetachedCriteria {
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
	
	public SESSDetachedCriteria() {
		super(tr.com.srdc.icardea.hibernate.SESS.class, tr.com.srdc.icardea.hibernate.SESSCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		dtm = new StringExpression("dtm", this.getDetachedCriteria());
		type = new StringExpression("type", this.getDetachedCriteria());
		reprogrammed = new StringExpression("reprogrammed", this.getDetachedCriteria());
		dtm_previous = new StringExpression("dtm_previous", this.getDetachedCriteria());
		type_previous = new StringExpression("type_previous", this.getDetachedCriteria());
		reprogrammed_previous = new StringExpression("reprogrammed_previous", this.getDetachedCriteria());
		clinician_name = new StringExpression("clinician_name", this.getDetachedCriteria());
		clinician_contact_information = new StringExpression("clinician_contact_information", this.getDetachedCriteria());
		clinic_name = new StringExpression("clinic_name", this.getDetachedCriteria());
	}
	
	public SESSDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, tr.com.srdc.icardea.hibernate.SESSCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		dtm = new StringExpression("dtm", this.getDetachedCriteria());
		type = new StringExpression("type", this.getDetachedCriteria());
		reprogrammed = new StringExpression("reprogrammed", this.getDetachedCriteria());
		dtm_previous = new StringExpression("dtm_previous", this.getDetachedCriteria());
		type_previous = new StringExpression("type_previous", this.getDetachedCriteria());
		reprogrammed_previous = new StringExpression("reprogrammed_previous", this.getDetachedCriteria());
		clinician_name = new StringExpression("clinician_name", this.getDetachedCriteria());
		clinician_contact_information = new StringExpression("clinician_contact_information", this.getDetachedCriteria());
		clinic_name = new StringExpression("clinic_name", this.getDetachedCriteria());
	}
	
	public SystemDetachedCriteria createSystemCriteria() {
		return new SystemDetachedCriteria(createCriteria("system"));
	}
	
	public SESS uniqueSESS(PersistentSession session) {
		return (SESS) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public SESS[] listSESS(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (SESS[]) list.toArray(new SESS[list.size()]);
	}
}

