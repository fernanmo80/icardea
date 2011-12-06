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

public class TACHYTHERAPYSETDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final StringExpression vstat;
	public final StringExpression astat;
	
	public TACHYTHERAPYSETDetachedCriteria() {
		super(tr.com.srdc.icardea.hibernate.TACHYTHERAPYSET.class, tr.com.srdc.icardea.hibernate.TACHYTHERAPYSETCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		vstat = new StringExpression("vstat", this.getDetachedCriteria());
		astat = new StringExpression("astat", this.getDetachedCriteria());
	}
	
	public TACHYTHERAPYSETDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, tr.com.srdc.icardea.hibernate.TACHYTHERAPYSETCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		vstat = new StringExpression("vstat", this.getDetachedCriteria());
		astat = new StringExpression("astat", this.getDetachedCriteria());
	}
	
	public SETDetachedCriteria createSETCriteria() {
		return new SETDetachedCriteria(createCriteria("sET"));
	}
	
	public TACHYTHERAPYSET uniqueTACHYTHERAPYSET(PersistentSession session) {
		return (TACHYTHERAPYSET) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public TACHYTHERAPYSET[] listTACHYTHERAPYSET(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (TACHYTHERAPYSET[]) list.toArray(new TACHYTHERAPYSET[list.size()]);
	}
}

