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

public class CRTSTATCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final StringExpression dtm_start;
	public final StringExpression dtm_end;
	public final StringExpression lv_percent_paced;
	public final StringExpression percent_paced;
	
	public CRTSTATCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		dtm_start = new StringExpression("dtm_start", this);
		dtm_end = new StringExpression("dtm_end", this);
		lv_percent_paced = new StringExpression("lv_percent_paced", this);
		percent_paced = new StringExpression("percent_paced", this);
	}
	
	public CRTSTATCriteria(PersistentSession session) {
		this(session.createCriteria(CRTSTAT.class));
	}
	
	public CRTSTATCriteria() throws PersistentException {
		this(tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession());
	}
	
	public STATCriteria createSTATCriteria() {
		return new STATCriteria(createCriteria("sTAT"));
	}
	
	public CRTSTAT uniqueCRTSTAT() {
		return (CRTSTAT) super.uniqueResult();
	}
	
	public CRTSTAT[] listCRTSTAT() {
		java.util.List list = super.list();
		return (CRTSTAT[]) list.toArray(new CRTSTAT[list.size()]);
	}
}

