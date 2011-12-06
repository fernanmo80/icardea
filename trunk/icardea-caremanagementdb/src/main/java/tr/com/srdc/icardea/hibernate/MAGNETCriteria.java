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

public class MAGNETCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final StringExpression resp;
	
	public MAGNETCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		resp = new StringExpression("resp", this);
	}
	
	public MAGNETCriteria(PersistentSession session) {
		this(session.createCriteria(MAGNET.class));
	}
	
	public MAGNETCriteria() throws PersistentException {
		this(tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession());
	}
	
	public SETCriteria createSETCriteria() {
		return new SETCriteria(createCriteria("sET"));
	}
	
	public MAGNET uniqueMAGNET() {
		return (MAGNET) super.uniqueResult();
	}
	
	public MAGNET[] listMAGNET() {
		java.util.List list = super.list();
		return (MAGNET[]) list.toArray(new MAGNET[list.size()]);
	}
}

