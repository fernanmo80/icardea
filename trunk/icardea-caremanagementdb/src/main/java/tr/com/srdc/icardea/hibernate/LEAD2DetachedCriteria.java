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

public class LEAD2DetachedCriteria extends AbstractORMDetachedCriteria {
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
	
	public LEAD2DetachedCriteria() {
		super(tr.com.srdc.icardea.hibernate.LEAD2.class, tr.com.srdc.icardea.hibernate.LEAD2Criteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		model = new StringExpression("model", this.getDetachedCriteria());
		serial = new StringExpression("serial", this.getDetachedCriteria());
		mfg = new StringExpression("mfg", this.getDetachedCriteria());
		implant_dt = new StringExpression("implant_dt", this.getDetachedCriteria());
		polarity_type = new StringExpression("polarity_type", this.getDetachedCriteria());
		location = new StringExpression("location", this.getDetachedCriteria());
		location_detail_1 = new StringExpression("location_detail_1", this.getDetachedCriteria());
		location_detail_2 = new StringExpression("location_detail_2", this.getDetachedCriteria());
		location_detail_3 = new StringExpression("location_detail_3", this.getDetachedCriteria());
		connection_status = new StringExpression("connection_status", this.getDetachedCriteria());
		special_function = new StringExpression("special_function", this.getDetachedCriteria());
		subID = new IntegerExpression("subID", this.getDetachedCriteria());
	}
	
	public LEAD2DetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, tr.com.srdc.icardea.hibernate.LEAD2Criteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		model = new StringExpression("model", this.getDetachedCriteria());
		serial = new StringExpression("serial", this.getDetachedCriteria());
		mfg = new StringExpression("mfg", this.getDetachedCriteria());
		implant_dt = new StringExpression("implant_dt", this.getDetachedCriteria());
		polarity_type = new StringExpression("polarity_type", this.getDetachedCriteria());
		location = new StringExpression("location", this.getDetachedCriteria());
		location_detail_1 = new StringExpression("location_detail_1", this.getDetachedCriteria());
		location_detail_2 = new StringExpression("location_detail_2", this.getDetachedCriteria());
		location_detail_3 = new StringExpression("location_detail_3", this.getDetachedCriteria());
		connection_status = new StringExpression("connection_status", this.getDetachedCriteria());
		special_function = new StringExpression("special_function", this.getDetachedCriteria());
		subID = new IntegerExpression("subID", this.getDetachedCriteria());
	}
	
	public SystemDetachedCriteria createSystemCriteria() {
		return new SystemDetachedCriteria(createCriteria("system"));
	}
	
	public LEAD2 uniqueLEAD2(PersistentSession session) {
		return (LEAD2) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public LEAD2[] listLEAD2(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (LEAD2[]) list.toArray(new LEAD2[list.size()]);
	}
}

