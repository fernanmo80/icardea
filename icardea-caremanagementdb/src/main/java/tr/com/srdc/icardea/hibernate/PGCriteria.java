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

public class PGCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final StringExpression type;
	public final StringExpression model;
	public final StringExpression serial;
	public final StringExpression mfg;
	public final StringExpression implant_dt;
	public final StringExpression implanter;
	public final StringExpression implanter_contact_info;
	public final StringExpression implanting_facility;
	
	public PGCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		type = new StringExpression("type", this);
		model = new StringExpression("model", this);
		serial = new StringExpression("serial", this);
		mfg = new StringExpression("mfg", this);
		implant_dt = new StringExpression("implant_dt", this);
		implanter = new StringExpression("implanter", this);
		implanter_contact_info = new StringExpression("implanter_contact_info", this);
		implanting_facility = new StringExpression("implanting_facility", this);
	}
	
	public PGCriteria(PersistentSession session) {
		this(session.createCriteria(PG.class));
	}
	
	public PGCriteria() throws PersistentException {
		this(tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession());
	}
	
	public SystemCriteria createSystemCriteria() {
		return new SystemCriteria(createCriteria("system"));
	}
	
	public PG uniquePG() {
		return (PG) super.uniqueResult();
	}
	
	public PG[] listPG() {
		java.util.List list = super.list();
		return (PG[]) list.toArray(new PG[list.size()]);
	}
}

