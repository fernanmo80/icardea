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

public class MSMTDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final StringExpression dtm_start;
	public final StringExpression dtm_end;
	
	public MSMTDetachedCriteria() {
		super(tr.com.srdc.icardea.hibernate.MSMT.class, tr.com.srdc.icardea.hibernate.MSMTCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		dtm_start = new StringExpression("dtm_start", this.getDetachedCriteria());
		dtm_end = new StringExpression("dtm_end", this.getDetachedCriteria());
	}
	
	public MSMTDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, tr.com.srdc.icardea.hibernate.MSMTCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		dtm_start = new StringExpression("dtm_start", this.getDetachedCriteria());
		dtm_end = new StringExpression("dtm_end", this.getDetachedCriteria());
	}
	
	public SystemDetachedCriteria createSystemCriteria() {
		return new SystemDetachedCriteria(createCriteria("system"));
	}
	
	public BATTERY2DetachedCriteria createBATTERY2Criteria() {
		return new BATTERY2DetachedCriteria(createCriteria("ORM_BATTERY2"));
	}
	
	public CAPDetachedCriteria createCAPCriteria() {
		return new CAPDetachedCriteria(createCriteria("ORM_CAP"));
	}
	
	public LEADCHNLMSMTDetachedCriteria createLEADCHNLMSMTCriteria() {
		return new LEADCHNLMSMTDetachedCriteria(createCriteria("ORM_LEADCHNLMSMT"));
	}
	
	public LEADHVCHANNELMSMTDetachedCriteria createLEADHVCHANNELMSMTCriteria() {
		return new LEADHVCHANNELMSMTDetachedCriteria(createCriteria("ORM_LEADHVCHANNELMSMT"));
	}
	
	public MSMT uniqueMSMT(PersistentSession session) {
		return (MSMT) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public MSMT[] listMSMT(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (MSMT[]) list.toArray(new MSMT[list.size()]);
	}
}

