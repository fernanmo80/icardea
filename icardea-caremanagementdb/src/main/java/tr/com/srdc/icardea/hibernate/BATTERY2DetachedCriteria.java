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

public class BATTERY2DetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final StringExpression dtm;
	public final StringExpression status;
	public final StringExpression voltage;
	public final StringExpression impedance;
	public final StringExpression remaining_longevity;
	public final StringExpression remaining_percentage;
	public final StringExpression rrt_trigger;
	public final IntegerExpression subID;
	
	public BATTERY2DetachedCriteria() {
		super(tr.com.srdc.icardea.hibernate.BATTERY2.class, tr.com.srdc.icardea.hibernate.BATTERY2Criteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		dtm = new StringExpression("dtm", this.getDetachedCriteria());
		status = new StringExpression("status", this.getDetachedCriteria());
		voltage = new StringExpression("voltage", this.getDetachedCriteria());
		impedance = new StringExpression("impedance", this.getDetachedCriteria());
		remaining_longevity = new StringExpression("remaining_longevity", this.getDetachedCriteria());
		remaining_percentage = new StringExpression("remaining_percentage", this.getDetachedCriteria());
		rrt_trigger = new StringExpression("rrt_trigger", this.getDetachedCriteria());
		subID = new IntegerExpression("subID", this.getDetachedCriteria());
	}
	
	public BATTERY2DetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, tr.com.srdc.icardea.hibernate.BATTERY2Criteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		dtm = new StringExpression("dtm", this.getDetachedCriteria());
		status = new StringExpression("status", this.getDetachedCriteria());
		voltage = new StringExpression("voltage", this.getDetachedCriteria());
		impedance = new StringExpression("impedance", this.getDetachedCriteria());
		remaining_longevity = new StringExpression("remaining_longevity", this.getDetachedCriteria());
		remaining_percentage = new StringExpression("remaining_percentage", this.getDetachedCriteria());
		rrt_trigger = new StringExpression("rrt_trigger", this.getDetachedCriteria());
		subID = new IntegerExpression("subID", this.getDetachedCriteria());
	}
	
	public MSMTDetachedCriteria createMSMTCriteria() {
		return new MSMTDetachedCriteria(createCriteria("mSMT"));
	}
	
	public BATTERY2 uniqueBATTERY2(PersistentSession session) {
		return (BATTERY2) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public BATTERY2[] listBATTERY2(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (BATTERY2[]) list.toArray(new BATTERY2[list.size()]);
	}
}

