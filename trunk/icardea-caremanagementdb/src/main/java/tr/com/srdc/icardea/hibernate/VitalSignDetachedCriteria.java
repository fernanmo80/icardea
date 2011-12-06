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

public class VitalSignDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final StringExpression careProvisionCode;
	public final StringExpression effectiveTime;
	public final StringExpression unit;
	public final StringExpression value;
	
	public VitalSignDetachedCriteria() {
		super(tr.com.srdc.icardea.hibernate.VitalSign.class, tr.com.srdc.icardea.hibernate.VitalSignCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		careProvisionCode = new StringExpression("careProvisionCode", this.getDetachedCriteria());
		effectiveTime = new StringExpression("effectiveTime", this.getDetachedCriteria());
		unit = new StringExpression("unit", this.getDetachedCriteria());
		value = new StringExpression("value", this.getDetachedCriteria());
	}
	
	public VitalSignDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, tr.com.srdc.icardea.hibernate.VitalSignCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		careProvisionCode = new StringExpression("careProvisionCode", this.getDetachedCriteria());
		effectiveTime = new StringExpression("effectiveTime", this.getDetachedCriteria());
		unit = new StringExpression("unit", this.getDetachedCriteria());
		value = new StringExpression("value", this.getDetachedCriteria());
	}
	
	public EHRPHRDataDetachedCriteria createEHRPHRDataCriteria() {
		return new EHRPHRDataDetachedCriteria(createCriteria("eHRPHRData"));
	}
	
	public VitalSign uniqueVitalSign(PersistentSession session) {
		return (VitalSign) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public VitalSign[] listVitalSign(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (VitalSign[]) list.toArray(new VitalSign[list.size()]);
	}
}

