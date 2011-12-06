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

public class CRTSETCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final StringExpression lvrv_delay;
	public final StringExpression paced_chambers;
	
	public CRTSETCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		lvrv_delay = new StringExpression("lvrv_delay", this);
		paced_chambers = new StringExpression("paced_chambers", this);
	}
	
	public CRTSETCriteria(PersistentSession session) {
		this(session.createCriteria(CRTSET.class));
	}
	
	public CRTSETCriteria() throws PersistentException {
		this(tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession());
	}
	
	public SETCriteria createSETCriteria() {
		return new SETCriteria(createCriteria("sET"));
	}
	
	public CRTSET uniqueCRTSET() {
		return (CRTSET) super.uniqueResult();
	}
	
	public CRTSET[] listCRTSET() {
		java.util.List list = super.list();
		return (CRTSET[]) list.toArray(new CRTSET[list.size()]);
	}
}

