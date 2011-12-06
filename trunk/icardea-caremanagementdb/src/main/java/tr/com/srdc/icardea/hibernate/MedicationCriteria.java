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

public class MedicationCriteria extends AbstractORMCriteria {
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
	
	public MedicationCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		careProvisionCode = new StringExpression("careProvisionCode", this);
		text = new StringExpression("text", this);
		effectiveTime = new StringExpression("effectiveTime", this);
		routeCode = new StringExpression("routeCode", this);
		approachSiteCode = new StringExpression("approachSiteCode", this);
		doseQuantity = new StringExpression("doseQuantity", this);
		drugCode = new StringExpression("drugCode", this);
		drugCodeSystem = new StringExpression("drugCodeSystem", this);
		effectiveTimeHigh = new StringExpression("effectiveTimeHigh", this);
	}
	
	public MedicationCriteria(PersistentSession session) {
		this(session.createCriteria(Medication.class));
	}
	
	public MedicationCriteria() throws PersistentException {
		this(tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession());
	}
	
	public EHRPHRDataCriteria createEHRPHRDataCriteria() {
		return new EHRPHRDataCriteria(createCriteria("eHRPHRData"));
	}
	
	public Medication uniqueMedication() {
		return (Medication) super.uniqueResult();
	}
	
	public Medication[] listMedication() {
		java.util.List list = super.list();
		return (Medication[]) list.toArray(new Medication[list.size()]);
	}
}

