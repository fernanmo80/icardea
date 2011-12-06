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

public class LEAD2Criteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final StringExpression model;
	public final StringExpression serial;
	public final StringExpression mfg;
	public final StringExpression implant_dt;
	public final StringExpression polarity_type;
	public final StringExpression location;
	public final StringExpression location_detail_1;
	public final StringExpression location_detail_2;
	public final StringExpression location_detail_3;
	public final StringExpression connection_status;
	public final StringExpression special_function;
	public final IntegerExpression subID;
	
	public LEAD2Criteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		model = new StringExpression("model", this);
		serial = new StringExpression("serial", this);
		mfg = new StringExpression("mfg", this);
		implant_dt = new StringExpression("implant_dt", this);
		polarity_type = new StringExpression("polarity_type", this);
		location = new StringExpression("location", this);
		location_detail_1 = new StringExpression("location_detail_1", this);
		location_detail_2 = new StringExpression("location_detail_2", this);
		location_detail_3 = new StringExpression("location_detail_3", this);
		connection_status = new StringExpression("connection_status", this);
		special_function = new StringExpression("special_function", this);
		subID = new IntegerExpression("subID", this);
	}
	
	public LEAD2Criteria(PersistentSession session) {
		this(session.createCriteria(LEAD2.class));
	}
	
	public LEAD2Criteria() throws PersistentException {
		this(tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession());
	}
	
	public SystemCriteria createSystemCriteria() {
		return new SystemCriteria(createCriteria("system"));
	}
	
	public LEAD2 uniqueLEAD2() {
		return (LEAD2) super.uniqueResult();
	}
	
	public LEAD2[] listLEAD2() {
		java.util.List list = super.list();
		return (LEAD2[]) list.toArray(new LEAD2[list.size()]);
	}
}

