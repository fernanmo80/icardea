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

public class HEART_RATECriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final StringExpression dtm_start;
	public final StringExpression dtm_end;
	public final StringExpression atrial_min;
	public final StringExpression atrial_max;
	public final StringExpression atrial_mean;
	public final StringExpression ventricular_min;
	public final StringExpression ventricular_max;
	public final StringExpression ventricular_mean;
	
	public HEART_RATECriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		dtm_start = new StringExpression("dtm_start", this);
		dtm_end = new StringExpression("dtm_end", this);
		atrial_min = new StringExpression("atrial_min", this);
		atrial_max = new StringExpression("atrial_max", this);
		atrial_mean = new StringExpression("atrial_mean", this);
		ventricular_min = new StringExpression("ventricular_min", this);
		ventricular_max = new StringExpression("ventricular_max", this);
		ventricular_mean = new StringExpression("ventricular_mean", this);
	}
	
	public HEART_RATECriteria(PersistentSession session) {
		this(session.createCriteria(HEART_RATE.class));
	}
	
	public HEART_RATECriteria() throws PersistentException {
		this(tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession());
	}
	
	public STATCriteria createSTATCriteria() {
		return new STATCriteria(createCriteria("sTAT"));
	}
	
	public HEART_RATE uniqueHEART_RATE() {
		return (HEART_RATE) super.uniqueResult();
	}
	
	public HEART_RATE[] listHEART_RATE() {
		java.util.List list = super.list();
		return (HEART_RATE[]) list.toArray(new HEART_RATE[list.size()]);
	}
}

