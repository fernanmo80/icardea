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

public class EncounterCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final StringExpression careProvisionCode;
	public final StringExpression encounterCode;
	public final StringExpression effectiveTimeLow;
	public final StringExpression effectiveTimeHigh;
	public final StringExpression encounterText;
	public final StringExpression doctorID;
	public final StringExpression organizationID;
	
	public EncounterCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		careProvisionCode = new StringExpression("careProvisionCode", this);
		encounterCode = new StringExpression("encounterCode", this);
		effectiveTimeLow = new StringExpression("effectiveTimeLow", this);
		effectiveTimeHigh = new StringExpression("effectiveTimeHigh", this);
		encounterText = new StringExpression("encounterText", this);
		doctorID = new StringExpression("doctorID", this);
		organizationID = new StringExpression("organizationID", this);
	}
	
	public EncounterCriteria(PersistentSession session) {
		this(session.createCriteria(Encounter.class));
	}
	
	public EncounterCriteria() throws PersistentException {
		this(tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession());
	}
	
	public EHRPHRDataCriteria createEHRPHRDataCriteria() {
		return new EHRPHRDataCriteria(createCriteria("eHRPHRData"));
	}
	
	public Encounter uniqueEncounter() {
		return (Encounter) super.uniqueResult();
	}
	
	public Encounter[] listEncounter() {
		java.util.List list = super.list();
		return (Encounter[]) list.toArray(new Encounter[list.size()]);
	}
}

