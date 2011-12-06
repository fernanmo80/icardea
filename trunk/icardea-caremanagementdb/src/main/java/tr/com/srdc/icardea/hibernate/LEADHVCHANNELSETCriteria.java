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

public class LEADHVCHANNELSETCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final IntegerExpression subID;
	
	public LEADHVCHANNELSETCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		subID = new IntegerExpression("subID", this);
	}
	
	public LEADHVCHANNELSETCriteria(PersistentSession session) {
		this(session.createCriteria(LEADHVCHANNELSET.class));
	}
	
	public LEADHVCHANNELSETCriteria() throws PersistentException {
		this(tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession());
	}
	
	public SETCriteria createSETCriteria() {
		return new SETCriteria(createCriteria("sET"));
	}
	
	public SHOCKVECTORCriteria createSHOCKVECTORCriteria() {
		return new SHOCKVECTORCriteria(createCriteria("sHOCKVECTOR"));
	}
	
	public LEADHVCHANNELSET uniqueLEADHVCHANNELSET() {
		return (LEADHVCHANNELSET) super.uniqueResult();
	}
	
	public LEADHVCHANNELSET[] listLEADHVCHANNELSET() {
		java.util.List list = super.list();
		return (LEADHVCHANNELSET[]) list.toArray(new LEADHVCHANNELSET[list.size()]);
	}
}

