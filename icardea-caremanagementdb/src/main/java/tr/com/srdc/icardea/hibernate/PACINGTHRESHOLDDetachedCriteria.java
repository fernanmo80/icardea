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

public class PACINGTHRESHOLDDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final StringExpression amplitude;
	public final StringExpression pulsewidth;
	public final StringExpression measurement_method;
	public final StringExpression polarity;
	
	public PACINGTHRESHOLDDetachedCriteria() {
		super(tr.com.srdc.icardea.hibernate.PACINGTHRESHOLD.class, tr.com.srdc.icardea.hibernate.PACINGTHRESHOLDCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		amplitude = new StringExpression("amplitude", this.getDetachedCriteria());
		pulsewidth = new StringExpression("pulsewidth", this.getDetachedCriteria());
		measurement_method = new StringExpression("measurement_method", this.getDetachedCriteria());
		polarity = new StringExpression("polarity", this.getDetachedCriteria());
	}
	
	public PACINGTHRESHOLDDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, tr.com.srdc.icardea.hibernate.PACINGTHRESHOLDCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		amplitude = new StringExpression("amplitude", this.getDetachedCriteria());
		pulsewidth = new StringExpression("pulsewidth", this.getDetachedCriteria());
		measurement_method = new StringExpression("measurement_method", this.getDetachedCriteria());
		polarity = new StringExpression("polarity", this.getDetachedCriteria());
	}
	
	public LEADCHNLMSMTDetachedCriteria createLEADCHNLMSMTCriteria() {
		return new LEADCHNLMSMTDetachedCriteria(createCriteria("lEADCHNLMSMT"));
	}
	
	public PACINGTHRESHOLD uniquePACINGTHRESHOLD(PersistentSession session) {
		return (PACINGTHRESHOLD) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public PACINGTHRESHOLD[] listPACINGTHRESHOLD(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (PACINGTHRESHOLD[]) list.toArray(new PACINGTHRESHOLD[list.size()]);
	}
}

