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

public class CRTSETDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final StringExpression lvrv_delay;
	public final StringExpression paced_chambers;
	
	public CRTSETDetachedCriteria() {
		super(tr.com.srdc.icardea.hibernate.CRTSET.class, tr.com.srdc.icardea.hibernate.CRTSETCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		lvrv_delay = new StringExpression("lvrv_delay", this.getDetachedCriteria());
		paced_chambers = new StringExpression("paced_chambers", this.getDetachedCriteria());
	}
	
	public CRTSETDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, tr.com.srdc.icardea.hibernate.CRTSETCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		lvrv_delay = new StringExpression("lvrv_delay", this.getDetachedCriteria());
		paced_chambers = new StringExpression("paced_chambers", this.getDetachedCriteria());
	}
	
	public SETDetachedCriteria createSETCriteria() {
		return new SETDetachedCriteria(createCriteria("sET"));
	}
	
	public CRTSET uniqueCRTSET(PersistentSession session) {
		return (CRTSET) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public CRTSET[] listCRTSET(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (CRTSET[]) list.toArray(new CRTSET[list.size()]);
	}
}

