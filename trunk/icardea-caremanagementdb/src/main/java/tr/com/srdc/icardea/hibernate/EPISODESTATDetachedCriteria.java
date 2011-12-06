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

public class EPISODESTATDetachedCriteria extends AbstractORMDetachedCriteria {
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
	
	public EPISODESTATDetachedCriteria() {
		super(tr.com.srdc.icardea.hibernate.EPISODESTAT.class, tr.com.srdc.icardea.hibernate.EPISODESTATCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		type = new StringExpression("type", this.getDetachedCriteria());
		type_induced = new StringExpression("type_induced", this.getDetachedCriteria());
		vendor_type = new StringExpression("vendor_type", this.getDetachedCriteria());
		recent_count = new StringExpression("recent_count", this.getDetachedCriteria());
		recent_count_dtm_start = new StringExpression("recent_count_dtm_start", this.getDetachedCriteria());
		recent_count_dtm_end = new StringExpression("recent_count_dtm_end", this.getDetachedCriteria());
		total_count = new StringExpression("total_count", this.getDetachedCriteria());
		total_count_dtm_start = new StringExpression("total_count_dtm_start", this.getDetachedCriteria());
		total_count_dtm_end = new StringExpression("total_count_dtm_end", this.getDetachedCriteria());
		subID = new IntegerExpression("subID", this.getDetachedCriteria());
	}
	
	public EPISODESTATDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, tr.com.srdc.icardea.hibernate.EPISODESTATCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		type = new StringExpression("type", this.getDetachedCriteria());
		type_induced = new StringExpression("type_induced", this.getDetachedCriteria());
		vendor_type = new StringExpression("vendor_type", this.getDetachedCriteria());
		recent_count = new StringExpression("recent_count", this.getDetachedCriteria());
		recent_count_dtm_start = new StringExpression("recent_count_dtm_start", this.getDetachedCriteria());
		recent_count_dtm_end = new StringExpression("recent_count_dtm_end", this.getDetachedCriteria());
		total_count = new StringExpression("total_count", this.getDetachedCriteria());
		total_count_dtm_start = new StringExpression("total_count_dtm_start", this.getDetachedCriteria());
		total_count_dtm_end = new StringExpression("total_count_dtm_end", this.getDetachedCriteria());
		subID = new IntegerExpression("subID", this.getDetachedCriteria());
	}
	
	public STATDetachedCriteria createSTATCriteria() {
		return new STATDetachedCriteria(createCriteria("sTAT"));
	}
	
	public EPISODESTAT uniqueEPISODESTAT(PersistentSession session) {
		return (EPISODESTAT) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public EPISODESTAT[] listEPISODESTAT(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (EPISODESTAT[]) list.toArray(new EPISODESTAT[list.size()]);
	}
}

