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

public class SENSINGMSMTCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final StringExpression intr_ampl_min;
	public final StringExpression intr_ampl_max;
	public final StringExpression intr_ampl_mean;
	public final StringExpression polarity;
	public final StringExpression intr_ampl;
	
	public SENSINGMSMTCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		intr_ampl_min = new StringExpression("intr_ampl_min", this);
		intr_ampl_max = new StringExpression("intr_ampl_max", this);
		intr_ampl_mean = new StringExpression("intr_ampl_mean", this);
		polarity = new StringExpression("polarity", this);
		intr_ampl = new StringExpression("intr_ampl", this);
	}
	
	public SENSINGMSMTCriteria(PersistentSession session) {
		this(session.createCriteria(SENSINGMSMT.class));
	}
	
	public SENSINGMSMTCriteria() throws PersistentException {
		this(tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession());
	}
	
	public LEADCHNLMSMTCriteria createLEADCHNLMSMTCriteria() {
		return new LEADCHNLMSMTCriteria(createCriteria("lEADCHNLMSMT"));
	}
	
	public SENSINGMSMT uniqueSENSINGMSMT() {
		return (SENSINGMSMT) super.uniqueResult();
	}
	
	public SENSINGMSMT[] listSENSINGMSMT() {
		java.util.List list = super.list();
		return (SENSINGMSMT[]) list.toArray(new SENSINGMSMT[list.size()]);
	}
}

