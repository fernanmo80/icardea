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

public class CRTSTATDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final StringExpression dtm_start;
	public final StringExpression dtm_end;
	public final StringExpression lv_percent_paced;
	public final StringExpression percent_paced;
	
	public CRTSTATDetachedCriteria() {
		super(tr.com.srdc.icardea.hibernate.CRTSTAT.class, tr.com.srdc.icardea.hibernate.CRTSTATCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		dtm_start = new StringExpression("dtm_start", this.getDetachedCriteria());
		dtm_end = new StringExpression("dtm_end", this.getDetachedCriteria());
		lv_percent_paced = new StringExpression("lv_percent_paced", this.getDetachedCriteria());
		percent_paced = new StringExpression("percent_paced", this.getDetachedCriteria());
	}
	
	public CRTSTATDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, tr.com.srdc.icardea.hibernate.CRTSTATCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		dtm_start = new StringExpression("dtm_start", this.getDetachedCriteria());
		dtm_end = new StringExpression("dtm_end", this.getDetachedCriteria());
		lv_percent_paced = new StringExpression("lv_percent_paced", this.getDetachedCriteria());
		percent_paced = new StringExpression("percent_paced", this.getDetachedCriteria());
	}
	
	public STATDetachedCriteria createSTATCriteria() {
		return new STATDetachedCriteria(createCriteria("sTAT"));
	}
	
	public CRTSTAT uniqueCRTSTAT(PersistentSession session) {
		return (CRTSTAT) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public CRTSTAT[] listCRTSTAT(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (CRTSTAT[]) list.toArray(new CRTSTAT[list.size()]);
	}
}

