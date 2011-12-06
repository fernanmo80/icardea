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

public class ImmunizationDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final StringExpression careProvisionCode;
	public final StringExpression text;
	public final StringExpression effectiveTime;
	public final StringExpression routeCode;
	public final StringExpression approachSiteCode;
	public final StringExpression doseQuantity;
	public final StringExpression doseQuantityUnit;
	public final StringExpression drugCode;
	public final StringExpression drugCodeSystem;
	
	public ImmunizationDetachedCriteria() {
		super(tr.com.srdc.icardea.hibernate.Immunization.class, tr.com.srdc.icardea.hibernate.ImmunizationCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		careProvisionCode = new StringExpression("careProvisionCode", this.getDetachedCriteria());
		text = new StringExpression("text", this.getDetachedCriteria());
		effectiveTime = new StringExpression("effectiveTime", this.getDetachedCriteria());
		routeCode = new StringExpression("routeCode", this.getDetachedCriteria());
		approachSiteCode = new StringExpression("approachSiteCode", this.getDetachedCriteria());
		doseQuantity = new StringExpression("doseQuantity", this.getDetachedCriteria());
		doseQuantityUnit = new StringExpression("doseQuantityUnit", this.getDetachedCriteria());
		drugCode = new StringExpression("drugCode", this.getDetachedCriteria());
		drugCodeSystem = new StringExpression("drugCodeSystem", this.getDetachedCriteria());
	}
	
	public ImmunizationDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, tr.com.srdc.icardea.hibernate.ImmunizationCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		careProvisionCode = new StringExpression("careProvisionCode", this.getDetachedCriteria());
		text = new StringExpression("text", this.getDetachedCriteria());
		effectiveTime = new StringExpression("effectiveTime", this.getDetachedCriteria());
		routeCode = new StringExpression("routeCode", this.getDetachedCriteria());
		approachSiteCode = new StringExpression("approachSiteCode", this.getDetachedCriteria());
		doseQuantity = new StringExpression("doseQuantity", this.getDetachedCriteria());
		doseQuantityUnit = new StringExpression("doseQuantityUnit", this.getDetachedCriteria());
		drugCode = new StringExpression("drugCode", this.getDetachedCriteria());
		drugCodeSystem = new StringExpression("drugCodeSystem", this.getDetachedCriteria());
	}
	
	public EHRPHRDataDetachedCriteria createEHRPHRDataCriteria() {
		return new EHRPHRDataDetachedCriteria(createCriteria("eHRPHRData"));
	}
	
	public Immunization uniqueImmunization(PersistentSession session) {
		return (Immunization) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Immunization[] listImmunization(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Immunization[]) list.toArray(new Immunization[list.size()]);
	}
}

