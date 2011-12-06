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

public class IMPEDANCECriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final StringExpression value;
	public final StringExpression polarity;
	
	public IMPEDANCECriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		value = new StringExpression("value", this);
		polarity = new StringExpression("polarity", this);
	}
	
	public IMPEDANCECriteria(PersistentSession session) {
		this(session.createCriteria(IMPEDANCE.class));
	}
	
	public IMPEDANCECriteria() throws PersistentException {
		this(tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession());
	}
	
	public LEADCHNLMSMTCriteria createLEADCHNLMSMTCriteria() {
		return new LEADCHNLMSMTCriteria(createCriteria("lEADCHNLMSMT"));
	}
	
	public IMPEDANCE uniqueIMPEDANCE() {
		return (IMPEDANCE) super.uniqueResult();
	}
	
	public IMPEDANCE[] listIMPEDANCE() {
		java.util.List list = super.list();
		return (IMPEDANCE[]) list.toArray(new IMPEDANCE[list.size()]);
	}
}

