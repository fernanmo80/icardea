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

public class ATDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final StringExpression dtm_start;
	public final StringExpression dtm_end;
	public final StringExpression mode_sw_max_duration;
	public final StringExpression burden_percent;
	public final StringExpression mode_sw_percent_time;
	public final StringExpression mode_sw_percent_time_per_day;
	public final StringExpression mode_sw_count;
	public final StringExpression mode_sw_count_per_day;
	
	public ATDetachedCriteria() {
		super(tr.com.srdc.icardea.hibernate.AT.class, tr.com.srdc.icardea.hibernate.ATCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		dtm_start = new StringExpression("dtm_start", this.getDetachedCriteria());
		dtm_end = new StringExpression("dtm_end", this.getDetachedCriteria());
		mode_sw_max_duration = new StringExpression("mode_sw_max_duration", this.getDetachedCriteria());
		burden_percent = new StringExpression("burden_percent", this.getDetachedCriteria());
		mode_sw_percent_time = new StringExpression("mode_sw_percent_time", this.getDetachedCriteria());
		mode_sw_percent_time_per_day = new StringExpression("mode_sw_percent_time_per_day", this.getDetachedCriteria());
		mode_sw_count = new StringExpression("mode_sw_count", this.getDetachedCriteria());
		mode_sw_count_per_day = new StringExpression("mode_sw_count_per_day", this.getDetachedCriteria());
	}
	
	public ATDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, tr.com.srdc.icardea.hibernate.ATCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		dtm_start = new StringExpression("dtm_start", this.getDetachedCriteria());
		dtm_end = new StringExpression("dtm_end", this.getDetachedCriteria());
		mode_sw_max_duration = new StringExpression("mode_sw_max_duration", this.getDetachedCriteria());
		burden_percent = new StringExpression("burden_percent", this.getDetachedCriteria());
		mode_sw_percent_time = new StringExpression("mode_sw_percent_time", this.getDetachedCriteria());
		mode_sw_percent_time_per_day = new StringExpression("mode_sw_percent_time_per_day", this.getDetachedCriteria());
		mode_sw_count = new StringExpression("mode_sw_count", this.getDetachedCriteria());
		mode_sw_count_per_day = new StringExpression("mode_sw_count_per_day", this.getDetachedCriteria());
	}
	
	public STATDetachedCriteria createSTATCriteria() {
		return new STATDetachedCriteria(createCriteria("sTAT"));
	}
	
	public AT uniqueAT(PersistentSession session) {
		return (AT) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public AT[] listAT(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (AT[]) list.toArray(new AT[list.size()]);
	}
}

