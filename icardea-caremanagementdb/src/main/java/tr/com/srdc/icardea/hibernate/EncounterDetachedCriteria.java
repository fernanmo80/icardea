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

public class EncounterDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final StringExpression careProvisionCode;
	public final StringExpression encounterCode;
	public final StringExpression effectiveTimeLow;
	public final StringExpression effectiveTimeHigh;
	public final StringExpression encounterText;
	public final StringExpression doctorID;
	public final StringExpression organizationID;
	
	public EncounterDetachedCriteria() {
		super(tr.com.srdc.icardea.hibernate.Encounter.class, tr.com.srdc.icardea.hibernate.EncounterCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		careProvisionCode = new StringExpression("careProvisionCode", this.getDetachedCriteria());
		encounterCode = new StringExpression("encounterCode", this.getDetachedCriteria());
		effectiveTimeLow = new StringExpression("effectiveTimeLow", this.getDetachedCriteria());
		effectiveTimeHigh = new StringExpression("effectiveTimeHigh", this.getDetachedCriteria());
		encounterText = new StringExpression("encounterText", this.getDetachedCriteria());
		doctorID = new StringExpression("doctorID", this.getDetachedCriteria());
		organizationID = new StringExpression("organizationID", this.getDetachedCriteria());
	}
	
	public EncounterDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, tr.com.srdc.icardea.hibernate.EncounterCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		careProvisionCode = new StringExpression("careProvisionCode", this.getDetachedCriteria());
		encounterCode = new StringExpression("encounterCode", this.getDetachedCriteria());
		effectiveTimeLow = new StringExpression("effectiveTimeLow", this.getDetachedCriteria());
		effectiveTimeHigh = new StringExpression("effectiveTimeHigh", this.getDetachedCriteria());
		encounterText = new StringExpression("encounterText", this.getDetachedCriteria());
		doctorID = new StringExpression("doctorID", this.getDetachedCriteria());
		organizationID = new StringExpression("organizationID", this.getDetachedCriteria());
	}
	
	public EHRPHRDataDetachedCriteria createEHRPHRDataCriteria() {
		return new EHRPHRDataDetachedCriteria(createCriteria("eHRPHRData"));
	}
	
	public Encounter uniqueEncounter(PersistentSession session) {
		return (Encounter) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Encounter[] listEncounter(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Encounter[]) list.toArray(new Encounter[list.size()]);
	}
}

