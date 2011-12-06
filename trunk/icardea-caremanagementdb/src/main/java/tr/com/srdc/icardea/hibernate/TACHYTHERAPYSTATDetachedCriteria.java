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

public class TACHYTHERAPYSTATDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final StringExpression shocks_delivered_recent;
	public final StringExpression shocks_delivered_total;
	public final StringExpression shocks_aborted_recent;
	public final StringExpression shocks_aborted_total;
	public final StringExpression atp_delivered_recent;
	public final StringExpression atp_delivered_total;
	public final StringExpression total_dtm_start;
	public final StringExpression total_dtm_end;
	public final StringExpression recent_dtm_start;
	public final StringExpression recent_dtm_end;
	
	public TACHYTHERAPYSTATDetachedCriteria() {
		super(tr.com.srdc.icardea.hibernate.TACHYTHERAPYSTAT.class, tr.com.srdc.icardea.hibernate.TACHYTHERAPYSTATCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		shocks_delivered_recent = new StringExpression("shocks_delivered_recent", this.getDetachedCriteria());
		shocks_delivered_total = new StringExpression("shocks_delivered_total", this.getDetachedCriteria());
		shocks_aborted_recent = new StringExpression("shocks_aborted_recent", this.getDetachedCriteria());
		shocks_aborted_total = new StringExpression("shocks_aborted_total", this.getDetachedCriteria());
		atp_delivered_recent = new StringExpression("atp_delivered_recent", this.getDetachedCriteria());
		atp_delivered_total = new StringExpression("atp_delivered_total", this.getDetachedCriteria());
		total_dtm_start = new StringExpression("total_dtm_start", this.getDetachedCriteria());
		total_dtm_end = new StringExpression("total_dtm_end", this.getDetachedCriteria());
		recent_dtm_start = new StringExpression("recent_dtm_start", this.getDetachedCriteria());
		recent_dtm_end = new StringExpression("recent_dtm_end", this.getDetachedCriteria());
	}
	
	public TACHYTHERAPYSTATDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, tr.com.srdc.icardea.hibernate.TACHYTHERAPYSTATCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		shocks_delivered_recent = new StringExpression("shocks_delivered_recent", this.getDetachedCriteria());
		shocks_delivered_total = new StringExpression("shocks_delivered_total", this.getDetachedCriteria());
		shocks_aborted_recent = new StringExpression("shocks_aborted_recent", this.getDetachedCriteria());
		shocks_aborted_total = new StringExpression("shocks_aborted_total", this.getDetachedCriteria());
		atp_delivered_recent = new StringExpression("atp_delivered_recent", this.getDetachedCriteria());
		atp_delivered_total = new StringExpression("atp_delivered_total", this.getDetachedCriteria());
		total_dtm_start = new StringExpression("total_dtm_start", this.getDetachedCriteria());
		total_dtm_end = new StringExpression("total_dtm_end", this.getDetachedCriteria());
		recent_dtm_start = new StringExpression("recent_dtm_start", this.getDetachedCriteria());
		recent_dtm_end = new StringExpression("recent_dtm_end", this.getDetachedCriteria());
	}
	
	public STATDetachedCriteria createSTATCriteria() {
		return new STATDetachedCriteria(createCriteria("sTAT"));
	}
	
	public TACHYTHERAPYSTAT uniqueTACHYTHERAPYSTAT(PersistentSession session) {
		return (TACHYTHERAPYSTAT) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public TACHYTHERAPYSTAT[] listTACHYTHERAPYSTAT(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (TACHYTHERAPYSTAT[]) list.toArray(new TACHYTHERAPYSTAT[list.size()]);
	}
}

