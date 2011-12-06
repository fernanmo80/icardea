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

public class TACHYTHERAPYSETCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final StringExpression vstat;
	public final StringExpression astat;
	
	public TACHYTHERAPYSETCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		vstat = new StringExpression("vstat", this);
		astat = new StringExpression("astat", this);
	}
	
	public TACHYTHERAPYSETCriteria(PersistentSession session) {
		this(session.createCriteria(TACHYTHERAPYSET.class));
	}
	
	public TACHYTHERAPYSETCriteria() throws PersistentException {
		this(tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession());
	}
	
	public SETCriteria createSETCriteria() {
		return new SETCriteria(createCriteria("sET"));
	}
	
	public TACHYTHERAPYSET uniqueTACHYTHERAPYSET() {
		return (TACHYTHERAPYSET) super.uniqueResult();
	}
	
	public TACHYTHERAPYSET[] listTACHYTHERAPYSET() {
		java.util.List list = super.list();
		return (TACHYTHERAPYSET[]) list.toArray(new TACHYTHERAPYSET[list.size()]);
	}
}

