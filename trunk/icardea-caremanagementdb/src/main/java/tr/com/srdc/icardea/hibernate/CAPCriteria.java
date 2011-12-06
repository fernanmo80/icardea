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

public class CAPCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final StringExpression charge_dtm;
	public final StringExpression charge_time;
	public final StringExpression charge_energy;
	public final StringExpression charge_type;
	public final IntegerExpression subID;
	
	public CAPCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		charge_dtm = new StringExpression("charge_dtm", this);
		charge_time = new StringExpression("charge_time", this);
		charge_energy = new StringExpression("charge_energy", this);
		charge_type = new StringExpression("charge_type", this);
		subID = new IntegerExpression("subID", this);
	}
	
	public CAPCriteria(PersistentSession session) {
		this(session.createCriteria(CAP.class));
	}
	
	public CAPCriteria() throws PersistentException {
		this(tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession());
	}
	
	public MSMTCriteria createMSMTCriteria() {
		return new MSMTCriteria(createCriteria("mSMT"));
	}
	
	public CAP uniqueCAP() {
		return (CAP) super.uniqueResult();
	}
	
	public CAP[] listCAP() {
		java.util.List list = super.list();
		return (CAP[]) list.toArray(new CAP[list.size()]);
	}
}

