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

public class TACHYTHERAPYSTATCriteria extends AbstractORMCriteria {
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
	
	public TACHYTHERAPYSTATCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		shocks_delivered_recent = new StringExpression("shocks_delivered_recent", this);
		shocks_delivered_total = new StringExpression("shocks_delivered_total", this);
		shocks_aborted_recent = new StringExpression("shocks_aborted_recent", this);
		shocks_aborted_total = new StringExpression("shocks_aborted_total", this);
		atp_delivered_recent = new StringExpression("atp_delivered_recent", this);
		atp_delivered_total = new StringExpression("atp_delivered_total", this);
		total_dtm_start = new StringExpression("total_dtm_start", this);
		total_dtm_end = new StringExpression("total_dtm_end", this);
		recent_dtm_start = new StringExpression("recent_dtm_start", this);
		recent_dtm_end = new StringExpression("recent_dtm_end", this);
	}
	
	public TACHYTHERAPYSTATCriteria(PersistentSession session) {
		this(session.createCriteria(TACHYTHERAPYSTAT.class));
	}
	
	public TACHYTHERAPYSTATCriteria() throws PersistentException {
		this(tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession());
	}
	
	public STATCriteria createSTATCriteria() {
		return new STATCriteria(createCriteria("sTAT"));
	}
	
	public TACHYTHERAPYSTAT uniqueTACHYTHERAPYSTAT() {
		return (TACHYTHERAPYSTAT) super.uniqueResult();
	}
	
	public TACHYTHERAPYSTAT[] listTACHYTHERAPYSTAT() {
		java.util.List list = super.list();
		return (TACHYTHERAPYSTAT[]) list.toArray(new TACHYTHERAPYSTAT[list.size()]);
	}
}

