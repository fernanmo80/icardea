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

public class ConcernDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final StringExpression careProvisionCode;
	public final StringExpression concernStatusCode;
	public final StringExpression effectiveTimeLow;
	public final StringExpression effectiveTimeHigh;
	public final StringExpression allergyCode;
	public final StringExpression allergyValue;
	public final StringExpression allergyValueCodeSystem;
	public final StringExpression allergySubstanceCode;
	public final StringExpression allergySubstanceCodeSystem;
	public final StringExpression allergyOriginalText;
	
	public ConcernDetachedCriteria() {
		super(tr.com.srdc.icardea.hibernate.Concern.class, tr.com.srdc.icardea.hibernate.ConcernCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		careProvisionCode = new StringExpression("careProvisionCode", this.getDetachedCriteria());
		concernStatusCode = new StringExpression("concernStatusCode", this.getDetachedCriteria());
		effectiveTimeLow = new StringExpression("effectiveTimeLow", this.getDetachedCriteria());
		effectiveTimeHigh = new StringExpression("effectiveTimeHigh", this.getDetachedCriteria());
		allergyCode = new StringExpression("allergyCode", this.getDetachedCriteria());
		allergyValue = new StringExpression("allergyValue", this.getDetachedCriteria());
		allergyValueCodeSystem = new StringExpression("allergyValueCodeSystem", this.getDetachedCriteria());
		allergySubstanceCode = new StringExpression("allergySubstanceCode", this.getDetachedCriteria());
		allergySubstanceCodeSystem = new StringExpression("allergySubstanceCodeSystem", this.getDetachedCriteria());
		allergyOriginalText = new StringExpression("allergyOriginalText", this.getDetachedCriteria());
	}
	
	public ConcernDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, tr.com.srdc.icardea.hibernate.ConcernCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		careProvisionCode = new StringExpression("careProvisionCode", this.getDetachedCriteria());
		concernStatusCode = new StringExpression("concernStatusCode", this.getDetachedCriteria());
		effectiveTimeLow = new StringExpression("effectiveTimeLow", this.getDetachedCriteria());
		effectiveTimeHigh = new StringExpression("effectiveTimeHigh", this.getDetachedCriteria());
		allergyCode = new StringExpression("allergyCode", this.getDetachedCriteria());
		allergyValue = new StringExpression("allergyValue", this.getDetachedCriteria());
		allergyValueCodeSystem = new StringExpression("allergyValueCodeSystem", this.getDetachedCriteria());
		allergySubstanceCode = new StringExpression("allergySubstanceCode", this.getDetachedCriteria());
		allergySubstanceCodeSystem = new StringExpression("allergySubstanceCodeSystem", this.getDetachedCriteria());
		allergyOriginalText = new StringExpression("allergyOriginalText", this.getDetachedCriteria());
	}
	
	public EHRPHRDataDetachedCriteria createEHRPHRDataCriteria() {
		return new EHRPHRDataDetachedCriteria(createCriteria("eHRPHRData"));
	}
	
	public ProblemDetachedCriteria createProblemCriteria() {
		return new ProblemDetachedCriteria(createCriteria("problem"));
	}
	
	public Concern uniqueConcern(PersistentSession session) {
		return (Concern) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Concern[] listConcern(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Concern[]) list.toArray(new Concern[list.size()]);
	}
}

