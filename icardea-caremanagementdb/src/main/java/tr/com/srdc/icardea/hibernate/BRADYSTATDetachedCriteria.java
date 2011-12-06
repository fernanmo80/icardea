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

public class BRADYSTATDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final StringExpression dtm_start;
	public final StringExpression dtm_end;
	public final StringExpression ra_percent_paced;
	public final StringExpression rv_percent_paced;
	public final StringExpression ap_vp_percent;
	public final StringExpression as_vp_percent;
	public final StringExpression ap_vs_percent;
	public final StringExpression as_vs_percent;
	
	public BRADYSTATDetachedCriteria() {
		super(tr.com.srdc.icardea.hibernate.BRADYSTAT.class, tr.com.srdc.icardea.hibernate.BRADYSTATCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		dtm_start = new StringExpression("dtm_start", this.getDetachedCriteria());
		dtm_end = new StringExpression("dtm_end", this.getDetachedCriteria());
		ra_percent_paced = new StringExpression("ra_percent_paced", this.getDetachedCriteria());
		rv_percent_paced = new StringExpression("rv_percent_paced", this.getDetachedCriteria());
		ap_vp_percent = new StringExpression("ap_vp_percent", this.getDetachedCriteria());
		as_vp_percent = new StringExpression("as_vp_percent", this.getDetachedCriteria());
		ap_vs_percent = new StringExpression("ap_vs_percent", this.getDetachedCriteria());
		as_vs_percent = new StringExpression("as_vs_percent", this.getDetachedCriteria());
	}
	
	public BRADYSTATDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, tr.com.srdc.icardea.hibernate.BRADYSTATCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		dtm_start = new StringExpression("dtm_start", this.getDetachedCriteria());
		dtm_end = new StringExpression("dtm_end", this.getDetachedCriteria());
		ra_percent_paced = new StringExpression("ra_percent_paced", this.getDetachedCriteria());
		rv_percent_paced = new StringExpression("rv_percent_paced", this.getDetachedCriteria());
		ap_vp_percent = new StringExpression("ap_vp_percent", this.getDetachedCriteria());
		as_vp_percent = new StringExpression("as_vp_percent", this.getDetachedCriteria());
		ap_vs_percent = new StringExpression("ap_vs_percent", this.getDetachedCriteria());
		as_vs_percent = new StringExpression("as_vs_percent", this.getDetachedCriteria());
	}
	
	public STATDetachedCriteria createSTATCriteria() {
		return new STATDetachedCriteria(createCriteria("sTAT"));
	}
	
	public BRADYSTAT uniqueBRADYSTAT(PersistentSession session) {
		return (BRADYSTAT) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public BRADYSTAT[] listBRADYSTAT(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (BRADYSTAT[]) list.toArray(new BRADYSTAT[list.size()]);
	}
}

