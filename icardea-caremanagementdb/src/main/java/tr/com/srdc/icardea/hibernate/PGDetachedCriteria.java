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

public class PGDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final StringExpression type;
	public final StringExpression model;
	public final StringExpression serial;
	public final StringExpression mfg;
	public final StringExpression implant_dt;
	public final StringExpression implanter;
	public final StringExpression implanter_contact_info;
	public final StringExpression implanting_facility;
	
	public PGDetachedCriteria() {
		super(tr.com.srdc.icardea.hibernate.PG.class, tr.com.srdc.icardea.hibernate.PGCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		type = new StringExpression("type", this.getDetachedCriteria());
		model = new StringExpression("model", this.getDetachedCriteria());
		serial = new StringExpression("serial", this.getDetachedCriteria());
		mfg = new StringExpression("mfg", this.getDetachedCriteria());
		implant_dt = new StringExpression("implant_dt", this.getDetachedCriteria());
		implanter = new StringExpression("implanter", this.getDetachedCriteria());
		implanter_contact_info = new StringExpression("implanter_contact_info", this.getDetachedCriteria());
		implanting_facility = new StringExpression("implanting_facility", this.getDetachedCriteria());
	}
	
	public PGDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, tr.com.srdc.icardea.hibernate.PGCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		type = new StringExpression("type", this.getDetachedCriteria());
		model = new StringExpression("model", this.getDetachedCriteria());
		serial = new StringExpression("serial", this.getDetachedCriteria());
		mfg = new StringExpression("mfg", this.getDetachedCriteria());
		implant_dt = new StringExpression("implant_dt", this.getDetachedCriteria());
		implanter = new StringExpression("implanter", this.getDetachedCriteria());
		implanter_contact_info = new StringExpression("implanter_contact_info", this.getDetachedCriteria());
		implanting_facility = new StringExpression("implanting_facility", this.getDetachedCriteria());
	}
	
	public SystemDetachedCriteria createSystemCriteria() {
		return new SystemDetachedCriteria(createCriteria("system"));
	}
	
	public PG uniquePG(PersistentSession session) {
		return (PG) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public PG[] listPG(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (PG[]) list.toArray(new PG[list.size()]);
	}
}

