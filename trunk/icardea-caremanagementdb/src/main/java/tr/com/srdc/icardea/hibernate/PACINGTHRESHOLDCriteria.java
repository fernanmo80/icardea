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

public class PACINGTHRESHOLDCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final StringExpression amplitude;
	public final StringExpression pulsewidth;
	public final StringExpression measurement_method;
	public final StringExpression polarity;
	
	public PACINGTHRESHOLDCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		amplitude = new StringExpression("amplitude", this);
		pulsewidth = new StringExpression("pulsewidth", this);
		measurement_method = new StringExpression("measurement_method", this);
		polarity = new StringExpression("polarity", this);
	}
	
	public PACINGTHRESHOLDCriteria(PersistentSession session) {
		this(session.createCriteria(PACINGTHRESHOLD.class));
	}
	
	public PACINGTHRESHOLDCriteria() throws PersistentException {
		this(tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession());
	}
	
	public LEADCHNLMSMTCriteria createLEADCHNLMSMTCriteria() {
		return new LEADCHNLMSMTCriteria(createCriteria("lEADCHNLMSMT"));
	}
	
	public PACINGTHRESHOLD uniquePACINGTHRESHOLD() {
		return (PACINGTHRESHOLD) super.uniqueResult();
	}
	
	public PACINGTHRESHOLD[] listPACINGTHRESHOLD() {
		java.util.List list = super.list();
		return (PACINGTHRESHOLD[]) list.toArray(new PACINGTHRESHOLD[list.size()]);
	}
}

