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

public class LEADHVCHANNELMSMTCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final StringExpression dtm_start;
	public final StringExpression dtm_end;
	public final StringExpression impedance;
	public final StringExpression measurement_type;
	public final StringExpression status;
	public final IntegerExpression subID;
	public final StringExpression dtm;
	
	public LEADHVCHANNELMSMTCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		dtm_start = new StringExpression("dtm_start", this);
		dtm_end = new StringExpression("dtm_end", this);
		impedance = new StringExpression("impedance", this);
		measurement_type = new StringExpression("measurement_type", this);
		status = new StringExpression("status", this);
		subID = new IntegerExpression("subID", this);
		dtm = new StringExpression("dtm", this);
	}
	
	public LEADHVCHANNELMSMTCriteria(PersistentSession session) {
		this(session.createCriteria(LEADHVCHANNELMSMT.class));
	}
	
	public LEADHVCHANNELMSMTCriteria() throws PersistentException {
		this(tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession());
	}
	
	public MSMTCriteria createMSMTCriteria() {
		return new MSMTCriteria(createCriteria("mSMT"));
	}
	
	public LEADHVCHANNELMSMT uniqueLEADHVCHANNELMSMT() {
		return (LEADHVCHANNELMSMT) super.uniqueResult();
	}
	
	public LEADHVCHANNELMSMT[] listLEADHVCHANNELMSMT() {
		java.util.List list = super.list();
		return (LEADHVCHANNELMSMT[]) list.toArray(new LEADHVCHANNELMSMT[list.size()]);
	}
}

