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

public class MSMTCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final StringExpression dtm_start;
	public final StringExpression dtm_end;
	
	public MSMTCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		dtm_start = new StringExpression("dtm_start", this);
		dtm_end = new StringExpression("dtm_end", this);
	}
	
	public MSMTCriteria(PersistentSession session) {
		this(session.createCriteria(MSMT.class));
	}
	
	public MSMTCriteria() throws PersistentException {
		this(tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession());
	}
	
	public SystemCriteria createSystemCriteria() {
		return new SystemCriteria(createCriteria("system"));
	}
	
	public BATTERY2Criteria createBATTERY2Criteria() {
		return new BATTERY2Criteria(createCriteria("ORM_bATTERY2"));
	}
	
	public CAPCriteria createCAPCriteria() {
		return new CAPCriteria(createCriteria("ORM_cAP"));
	}
	
	public LEADCHNLMSMTCriteria createLEADCHNLMSMTCriteria() {
		return new LEADCHNLMSMTCriteria(createCriteria("ORM_lEADCHNLMSMT"));
	}
	
	public LEADHVCHANNELMSMTCriteria createLEADHVCHANNELMSMTCriteria() {
		return new LEADHVCHANNELMSMTCriteria(createCriteria("ORM_lEADHVCHANNELMSMT"));
	}
	
	public MSMT uniqueMSMT() {
		return (MSMT) super.uniqueResult();
	}
	
	public MSMT[] listMSMT() {
		java.util.List list = super.list();
		return (MSMT[]) list.toArray(new MSMT[list.size()]);
	}
}

