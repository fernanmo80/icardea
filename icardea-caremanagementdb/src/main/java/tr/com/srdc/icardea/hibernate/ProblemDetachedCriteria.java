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

public class ProblemDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final StringExpression careProvisionCode;
	public final StringExpression problemCode;
	public final StringExpression problemText;
	public final StringExpression effectiveTimeLow;
	public final StringExpression effectiveTimeHigh;
	public final StringExpression problemValue;
	public final StringExpression problemValueCodeSystem;
	public final StringExpression problemValueOriginalText;
	public final StringExpression severity;
	
	public ProblemDetachedCriteria() {
		super(tr.com.srdc.icardea.hibernate.Problem.class, tr.com.srdc.icardea.hibernate.ProblemCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		careProvisionCode = new StringExpression("careProvisionCode", this.getDetachedCriteria());
		problemCode = new StringExpression("problemCode", this.getDetachedCriteria());
		problemText = new StringExpression("problemText", this.getDetachedCriteria());
		effectiveTimeLow = new StringExpression("effectiveTimeLow", this.getDetachedCriteria());
		effectiveTimeHigh = new StringExpression("effectiveTimeHigh", this.getDetachedCriteria());
		problemValue = new StringExpression("problemValue", this.getDetachedCriteria());
		problemValueCodeSystem = new StringExpression("problemValueCodeSystem", this.getDetachedCriteria());
		problemValueOriginalText = new StringExpression("problemValueOriginalText", this.getDetachedCriteria());
		severity = new StringExpression("severity", this.getDetachedCriteria());
	}
	
	public ProblemDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, tr.com.srdc.icardea.hibernate.ProblemCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		careProvisionCode = new StringExpression("careProvisionCode", this.getDetachedCriteria());
		problemCode = new StringExpression("problemCode", this.getDetachedCriteria());
		problemText = new StringExpression("problemText", this.getDetachedCriteria());
		effectiveTimeLow = new StringExpression("effectiveTimeLow", this.getDetachedCriteria());
		effectiveTimeHigh = new StringExpression("effectiveTimeHigh", this.getDetachedCriteria());
		problemValue = new StringExpression("problemValue", this.getDetachedCriteria());
		problemValueCodeSystem = new StringExpression("problemValueCodeSystem", this.getDetachedCriteria());
		problemValueOriginalText = new StringExpression("problemValueOriginalText", this.getDetachedCriteria());
		severity = new StringExpression("severity", this.getDetachedCriteria());
	}
	
	public EHRPHRDataDetachedCriteria createEHRPHRDataCriteria() {
		return new EHRPHRDataDetachedCriteria(createCriteria("eHRPHRData"));
	}
	
	public ConcernDetachedCriteria createConcernCriteria() {
		return new ConcernDetachedCriteria(createCriteria("concern"));
	}
	
	public Problem uniqueProblem(PersistentSession session) {
		return (Problem) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Problem[] listProblem(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Problem[]) list.toArray(new Problem[list.size()]);
	}
}

