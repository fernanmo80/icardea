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

public class IMPEDANCEDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final StringExpression value;
	public final StringExpression polarity;
	
	public IMPEDANCEDetachedCriteria() {
		super(tr.com.srdc.icardea.hibernate.IMPEDANCE.class, tr.com.srdc.icardea.hibernate.IMPEDANCECriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		value = new StringExpression("value", this.getDetachedCriteria());
		polarity = new StringExpression("polarity", this.getDetachedCriteria());
	}
	
	public IMPEDANCEDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, tr.com.srdc.icardea.hibernate.IMPEDANCECriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		value = new StringExpression("value", this.getDetachedCriteria());
		polarity = new StringExpression("polarity", this.getDetachedCriteria());
	}
	
	public LEADCHNLMSMTDetachedCriteria createLEADCHNLMSMTCriteria() {
		return new LEADCHNLMSMTDetachedCriteria(createCriteria("lEADCHNLMSMT"));
	}
	
	public IMPEDANCE uniqueIMPEDANCE(PersistentSession session) {
		return (IMPEDANCE) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public IMPEDANCE[] listIMPEDANCE(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (IMPEDANCE[]) list.toArray(new IMPEDANCE[list.size()]);
	}
}

