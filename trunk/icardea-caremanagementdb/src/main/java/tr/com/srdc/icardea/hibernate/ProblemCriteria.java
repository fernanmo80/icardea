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

public class ProblemCriteria extends AbstractORMCriteria {
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
	
	public ProblemCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		careProvisionCode = new StringExpression("careProvisionCode", this);
		problemCode = new StringExpression("problemCode", this);
		problemText = new StringExpression("problemText", this);
		effectiveTimeLow = new StringExpression("effectiveTimeLow", this);
		effectiveTimeHigh = new StringExpression("effectiveTimeHigh", this);
		problemValue = new StringExpression("problemValue", this);
		problemValueCodeSystem = new StringExpression("problemValueCodeSystem", this);
		problemValueOriginalText = new StringExpression("problemValueOriginalText", this);
		severity = new StringExpression("severity", this);
	}
	
	public ProblemCriteria(PersistentSession session) {
		this(session.createCriteria(Problem.class));
	}
	
	public ProblemCriteria() throws PersistentException {
		this(tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession());
	}
	
	public EHRPHRDataCriteria createEHRPHRDataCriteria() {
		return new EHRPHRDataCriteria(createCriteria("eHRPHRData"));
	}
	
	public ConcernCriteria createConcernCriteria() {
		return new ConcernCriteria(createCriteria("concern"));
	}
	
	public Problem uniqueProblem() {
		return (Problem) super.uniqueResult();
	}
	
	public Problem[] listProblem() {
		java.util.List list = super.list();
		return (Problem[]) list.toArray(new Problem[list.size()]);
	}
}

