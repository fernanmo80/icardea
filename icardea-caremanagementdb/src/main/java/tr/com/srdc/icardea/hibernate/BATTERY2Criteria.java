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

public class BATTERY2Criteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final StringExpression dtm;
	public final StringExpression status;
	public final StringExpression voltage;
	public final StringExpression impedance;
	public final StringExpression remaining_longevity;
	public final StringExpression remaining_percentage;
	public final StringExpression rrt_trigger;
	public final IntegerExpression subID;
	
	public BATTERY2Criteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		dtm = new StringExpression("dtm", this);
		status = new StringExpression("status", this);
		voltage = new StringExpression("voltage", this);
		impedance = new StringExpression("impedance", this);
		remaining_longevity = new StringExpression("remaining_longevity", this);
		remaining_percentage = new StringExpression("remaining_percentage", this);
		rrt_trigger = new StringExpression("rrt_trigger", this);
		subID = new IntegerExpression("subID", this);
	}
	
	public BATTERY2Criteria(PersistentSession session) {
		this(session.createCriteria(BATTERY2.class));
	}
	
	public BATTERY2Criteria() throws PersistentException {
		this(tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession());
	}
	
	public MSMTCriteria createMSMTCriteria() {
		return new MSMTCriteria(createCriteria("mSMT"));
	}
	
	public BATTERY2 uniqueBATTERY2() {
		return (BATTERY2) super.uniqueResult();
	}
	
	public BATTERY2[] listBATTERY2() {
		java.util.List list = super.list();
		return (BATTERY2[]) list.toArray(new BATTERY2[list.size()]);
	}
}

