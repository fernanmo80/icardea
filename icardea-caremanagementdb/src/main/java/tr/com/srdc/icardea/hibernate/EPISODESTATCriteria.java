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

public class EPISODESTATCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final StringExpression type;
	public final StringExpression type_induced;
	public final StringExpression vendor_type;
	public final StringExpression recent_count;
	public final StringExpression recent_count_dtm_start;
	public final StringExpression recent_count_dtm_end;
	public final StringExpression total_count;
	public final StringExpression total_count_dtm_start;
	public final StringExpression total_count_dtm_end;
	public final IntegerExpression subID;
	
	public EPISODESTATCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		type = new StringExpression("type", this);
		type_induced = new StringExpression("type_induced", this);
		vendor_type = new StringExpression("vendor_type", this);
		recent_count = new StringExpression("recent_count", this);
		recent_count_dtm_start = new StringExpression("recent_count_dtm_start", this);
		recent_count_dtm_end = new StringExpression("recent_count_dtm_end", this);
		total_count = new StringExpression("total_count", this);
		total_count_dtm_start = new StringExpression("total_count_dtm_start", this);
		total_count_dtm_end = new StringExpression("total_count_dtm_end", this);
		subID = new IntegerExpression("subID", this);
	}
	
	public EPISODESTATCriteria(PersistentSession session) {
		this(session.createCriteria(EPISODESTAT.class));
	}
	
	public EPISODESTATCriteria() throws PersistentException {
		this(tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession());
	}
	
	public STATCriteria createSTATCriteria() {
		return new STATCriteria(createCriteria("sTAT"));
	}
	
	public EPISODESTAT uniqueEPISODESTAT() {
		return (EPISODESTAT) super.uniqueResult();
	}
	
	public EPISODESTAT[] listEPISODESTAT() {
		java.util.List list = super.list();
		return (EPISODESTAT[]) list.toArray(new EPISODESTAT[list.size()]);
	}
}

