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

public class ATCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final StringExpression dtm_start;
	public final StringExpression dtm_end;
	public final StringExpression mode_sw_max_duration;
	public final StringExpression burden_percent;
	public final StringExpression mode_sw_percent_time;
	public final StringExpression mode_sw_percent_time_per_day;
	public final StringExpression mode_sw_count;
	public final StringExpression mode_sw_count_per_day;
	
	public ATCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		dtm_start = new StringExpression("dtm_start", this);
		dtm_end = new StringExpression("dtm_end", this);
		mode_sw_max_duration = new StringExpression("mode_sw_max_duration", this);
		burden_percent = new StringExpression("burden_percent", this);
		mode_sw_percent_time = new StringExpression("mode_sw_percent_time", this);
		mode_sw_percent_time_per_day = new StringExpression("mode_sw_percent_time_per_day", this);
		mode_sw_count = new StringExpression("mode_sw_count", this);
		mode_sw_count_per_day = new StringExpression("mode_sw_count_per_day", this);
	}
	
	public ATCriteria(PersistentSession session) {
		this(session.createCriteria(AT.class));
	}
	
	public ATCriteria() throws PersistentException {
		this(tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession());
	}
	
	public STATCriteria createSTATCriteria() {
		return new STATCriteria(createCriteria("sTAT"));
	}
	
	public AT uniqueAT() {
		return (AT) super.uniqueResult();
	}
	
	public AT[] listAT() {
		java.util.List list = super.list();
		return (AT[]) list.toArray(new AT[list.size()]);
	}
}

