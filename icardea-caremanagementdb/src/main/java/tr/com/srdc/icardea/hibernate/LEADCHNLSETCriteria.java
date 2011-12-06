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

public class LEADCHNLSETCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final StringExpression chamber;
	public final IntegerExpression subID;
	
	public LEADCHNLSETCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		chamber = new StringExpression("chamber", this);
		subID = new IntegerExpression("subID", this);
	}
	
	public LEADCHNLSETCriteria(PersistentSession session) {
		this(session.createCriteria(LEADCHNLSET.class));
	}
	
	public LEADCHNLSETCriteria() throws PersistentException {
		this(tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession());
	}
	
	public SETCriteria createSETCriteria() {
		return new SETCriteria(createCriteria("sET"));
	}
	
	public SENSINGSETCriteria createSENSINGSETCriteria() {
		return new SENSINGSETCriteria(createCriteria("sENSINGSET"));
	}
	
	public PACINGCriteria createPACINGCriteria() {
		return new PACINGCriteria(createCriteria("pACING"));
	}
	
	public LEADCHNLSET uniqueLEADCHNLSET() {
		return (LEADCHNLSET) super.uniqueResult();
	}
	
	public LEADCHNLSET[] listLEADCHNLSET() {
		java.util.List list = super.list();
		return (LEADCHNLSET[]) list.toArray(new LEADCHNLSET[list.size()]);
	}
}

