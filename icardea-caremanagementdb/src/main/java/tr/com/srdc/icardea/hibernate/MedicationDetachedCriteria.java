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

public class MedicationDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final StringExpression careProvisionCode;
	public final StringExpression text;
	public final StringExpression effectiveTime;
	public final StringExpression routeCode;
	public final StringExpression approachSiteCode;
	public final StringExpression doseQuantity;
	public final StringExpression drugCode;
	public final StringExpression drugCodeSystem;
	public final StringExpression effectiveTimeHigh;
	
	public MedicationDetachedCriteria() {
		super(tr.com.srdc.icardea.hibernate.Medication.class, tr.com.srdc.icardea.hibernate.MedicationCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		careProvisionCode = new StringExpression("careProvisionCode", this.getDetachedCriteria());
		text = new StringExpression("text", this.getDetachedCriteria());
		effectiveTime = new StringExpression("effectiveTime", this.getDetachedCriteria());
		routeCode = new StringExpression("routeCode", this.getDetachedCriteria());
		approachSiteCode = new StringExpression("approachSiteCode", this.getDetachedCriteria());
		doseQuantity = new StringExpression("doseQuantity", this.getDetachedCriteria());
		drugCode = new StringExpression("drugCode", this.getDetachedCriteria());
		drugCodeSystem = new StringExpression("drugCodeSystem", this.getDetachedCriteria());
		effectiveTimeHigh = new StringExpression("effectiveTimeHigh", this.getDetachedCriteria());
	}
	
	public MedicationDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, tr.com.srdc.icardea.hibernate.MedicationCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		careProvisionCode = new StringExpression("careProvisionCode", this.getDetachedCriteria());
		text = new StringExpression("text", this.getDetachedCriteria());
		effectiveTime = new StringExpression("effectiveTime", this.getDetachedCriteria());
		routeCode = new StringExpression("routeCode", this.getDetachedCriteria());
		approachSiteCode = new StringExpression("approachSiteCode", this.getDetachedCriteria());
		doseQuantity = new StringExpression("doseQuantity", this.getDetachedCriteria());
		drugCode = new StringExpression("drugCode", this.getDetachedCriteria());
		drugCodeSystem = new StringExpression("drugCodeSystem", this.getDetachedCriteria());
		effectiveTimeHigh = new StringExpression("effectiveTimeHigh", this.getDetachedCriteria());
	}
	
	public EHRPHRDataDetachedCriteria createEHRPHRDataCriteria() {
		return new EHRPHRDataDetachedCriteria(createCriteria("eHRPHRData"));
	}
	
	public Medication uniqueMedication(PersistentSession session) {
		return (Medication) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Medication[] listMedication(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Medication[]) list.toArray(new Medication[list.size()]);
	}
}

