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

public class LEADHVCHANNELMSMTDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final StringExpression dtm_start;
	public final StringExpression dtm_end;
	public final StringExpression impedance;
	public final StringExpression measurement_type;
	public final StringExpression status;
	public final IntegerExpression subID;
	public final StringExpression dtm;
	
	public LEADHVCHANNELMSMTDetachedCriteria() {
		super(tr.com.srdc.icardea.hibernate.LEADHVCHANNELMSMT.class, tr.com.srdc.icardea.hibernate.LEADHVCHANNELMSMTCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		dtm_start = new StringExpression("dtm_start", this.getDetachedCriteria());
		dtm_end = new StringExpression("dtm_end", this.getDetachedCriteria());
		impedance = new StringExpression("impedance", this.getDetachedCriteria());
		measurement_type = new StringExpression("measurement_type", this.getDetachedCriteria());
		status = new StringExpression("status", this.getDetachedCriteria());
		subID = new IntegerExpression("subID", this.getDetachedCriteria());
		dtm = new StringExpression("dtm", this.getDetachedCriteria());
	}
	
	public LEADHVCHANNELMSMTDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, tr.com.srdc.icardea.hibernate.LEADHVCHANNELMSMTCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		dtm_start = new StringExpression("dtm_start", this.getDetachedCriteria());
		dtm_end = new StringExpression("dtm_end", this.getDetachedCriteria());
		impedance = new StringExpression("impedance", this.getDetachedCriteria());
		measurement_type = new StringExpression("measurement_type", this.getDetachedCriteria());
		status = new StringExpression("status", this.getDetachedCriteria());
		subID = new IntegerExpression("subID", this.getDetachedCriteria());
		dtm = new StringExpression("dtm", this.getDetachedCriteria());
	}
	
	public MSMTDetachedCriteria createMSMTCriteria() {
		return new MSMTDetachedCriteria(createCriteria("mSMT"));
	}
	
	public LEADHVCHANNELMSMT uniqueLEADHVCHANNELMSMT(PersistentSession session) {
		return (LEADHVCHANNELMSMT) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public LEADHVCHANNELMSMT[] listLEADHVCHANNELMSMT(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (LEADHVCHANNELMSMT[]) list.toArray(new LEADHVCHANNELMSMT[list.size()]);
	}
}

