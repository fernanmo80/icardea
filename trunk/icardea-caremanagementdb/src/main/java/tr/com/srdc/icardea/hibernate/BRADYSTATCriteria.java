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

public class BRADYSTATCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final StringExpression dtm_start;
	public final StringExpression dtm_end;
	public final StringExpression ra_percent_paced;
	public final StringExpression rv_percent_paced;
	public final StringExpression ap_vp_percent;
	public final StringExpression as_vp_percent;
	public final StringExpression ap_vs_percent;
	public final StringExpression as_vs_percent;
	
	public BRADYSTATCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		dtm_start = new StringExpression("dtm_start", this);
		dtm_end = new StringExpression("dtm_end", this);
		ra_percent_paced = new StringExpression("ra_percent_paced", this);
		rv_percent_paced = new StringExpression("rv_percent_paced", this);
		ap_vp_percent = new StringExpression("ap_vp_percent", this);
		as_vp_percent = new StringExpression("as_vp_percent", this);
		ap_vs_percent = new StringExpression("ap_vs_percent", this);
		as_vs_percent = new StringExpression("as_vs_percent", this);
	}
	
	public BRADYSTATCriteria(PersistentSession session) {
		this(session.createCriteria(BRADYSTAT.class));
	}
	
	public BRADYSTATCriteria() throws PersistentException {
		this(tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession());
	}
	
	public STATCriteria createSTATCriteria() {
		return new STATCriteria(createCriteria("sTAT"));
	}
	
	public BRADYSTAT uniqueBRADYSTAT() {
		return (BRADYSTAT) super.uniqueResult();
	}
	
	public BRADYSTAT[] listBRADYSTAT() {
		java.util.List list = super.list();
		return (BRADYSTAT[]) list.toArray(new BRADYSTAT[list.size()]);
	}
}

