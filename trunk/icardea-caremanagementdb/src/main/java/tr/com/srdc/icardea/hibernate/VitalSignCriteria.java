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

public class VitalSignCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final StringExpression careProvisionCode;
	public final StringExpression effectiveTime;
	public final StringExpression unit;
	public final StringExpression value;
	
	public VitalSignCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		careProvisionCode = new StringExpression("careProvisionCode", this);
		effectiveTime = new StringExpression("effectiveTime", this);
		unit = new StringExpression("unit", this);
		value = new StringExpression("value", this);
	}
	
	public VitalSignCriteria(PersistentSession session) {
		this(session.createCriteria(VitalSign.class));
	}
	
	public VitalSignCriteria() throws PersistentException {
		this(tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession());
	}
	
	public EHRPHRDataCriteria createEHRPHRDataCriteria() {
		return new EHRPHRDataCriteria(createCriteria("eHRPHRData"));
	}
	
	public VitalSign uniqueVitalSign() {
		return (VitalSign) super.uniqueResult();
	}
	
	public VitalSign[] listVitalSign() {
		java.util.List list = super.list();
		return (VitalSign[]) list.toArray(new VitalSign[list.size()]);
	}
}

