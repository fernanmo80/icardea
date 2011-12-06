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

public class ImmunizationCriteria extends AbstractORMCriteria {
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
	
	public ImmunizationCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		careProvisionCode = new StringExpression("careProvisionCode", this);
		text = new StringExpression("text", this);
		effectiveTime = new StringExpression("effectiveTime", this);
		routeCode = new StringExpression("routeCode", this);
		approachSiteCode = new StringExpression("approachSiteCode", this);
		doseQuantity = new StringExpression("doseQuantity", this);
		doseQuantityUnit = new StringExpression("doseQuantityUnit", this);
		drugCode = new StringExpression("drugCode", this);
		drugCodeSystem = new StringExpression("drugCodeSystem", this);
	}
	
	public ImmunizationCriteria(PersistentSession session) {
		this(session.createCriteria(Immunization.class));
	}
	
	public ImmunizationCriteria() throws PersistentException {
		this(tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession());
	}
	
	public EHRPHRDataCriteria createEHRPHRDataCriteria() {
		return new EHRPHRDataCriteria(createCriteria("eHRPHRData"));
	}
	
	public Immunization uniqueImmunization() {
		return (Immunization) super.uniqueResult();
	}
	
	public Immunization[] listImmunization() {
		java.util.List list = super.list();
		return (Immunization[]) list.toArray(new Immunization[list.size()]);
	}
}

