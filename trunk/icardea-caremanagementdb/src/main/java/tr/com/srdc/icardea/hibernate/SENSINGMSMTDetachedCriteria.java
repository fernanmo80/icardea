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

public class SENSINGMSMTDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final StringExpression intr_ampl_min;
	public final StringExpression intr_ampl_max;
	public final StringExpression intr_ampl_mean;
	public final StringExpression polarity;
	public final StringExpression intr_ampl;
	
	public SENSINGMSMTDetachedCriteria() {
		super(tr.com.srdc.icardea.hibernate.SENSINGMSMT.class, tr.com.srdc.icardea.hibernate.SENSINGMSMTCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		intr_ampl_min = new StringExpression("intr_ampl_min", this.getDetachedCriteria());
		intr_ampl_max = new StringExpression("intr_ampl_max", this.getDetachedCriteria());
		intr_ampl_mean = new StringExpression("intr_ampl_mean", this.getDetachedCriteria());
		polarity = new StringExpression("polarity", this.getDetachedCriteria());
		intr_ampl = new StringExpression("intr_ampl", this.getDetachedCriteria());
	}
	
	public SENSINGMSMTDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, tr.com.srdc.icardea.hibernate.SENSINGMSMTCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		intr_ampl_min = new StringExpression("intr_ampl_min", this.getDetachedCriteria());
		intr_ampl_max = new StringExpression("intr_ampl_max", this.getDetachedCriteria());
		intr_ampl_mean = new StringExpression("intr_ampl_mean", this.getDetachedCriteria());
		polarity = new StringExpression("polarity", this.getDetachedCriteria());
		intr_ampl = new StringExpression("intr_ampl", this.getDetachedCriteria());
	}
	
	public LEADCHNLMSMTDetachedCriteria createLEADCHNLMSMTCriteria() {
		return new LEADCHNLMSMTDetachedCriteria(createCriteria("lEADCHNLMSMT"));
	}
	
	public SENSINGMSMT uniqueSENSINGMSMT(PersistentSession session) {
		return (SENSINGMSMT) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public SENSINGMSMT[] listSENSINGMSMT(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (SENSINGMSMT[]) list.toArray(new SENSINGMSMT[list.size()]);
	}
}

