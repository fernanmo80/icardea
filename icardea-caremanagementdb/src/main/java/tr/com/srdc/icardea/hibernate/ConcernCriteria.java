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

public class ConcernCriteria extends AbstractORMCriteria {
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
	
	public ConcernCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		careProvisionCode = new StringExpression("careProvisionCode", this);
		concernStatusCode = new StringExpression("concernStatusCode", this);
		effectiveTimeLow = new StringExpression("effectiveTimeLow", this);
		effectiveTimeHigh = new StringExpression("effectiveTimeHigh", this);
		allergyCode = new StringExpression("allergyCode", this);
		allergyValue = new StringExpression("allergyValue", this);
		allergyValueCodeSystem = new StringExpression("allergyValueCodeSystem", this);
		allergySubstanceCode = new StringExpression("allergySubstanceCode", this);
		allergySubstanceCodeSystem = new StringExpression("allergySubstanceCodeSystem", this);
		allergyOriginalText = new StringExpression("allergyOriginalText", this);
	}
	
	public ConcernCriteria(PersistentSession session) {
		this(session.createCriteria(Concern.class));
	}
	
	public ConcernCriteria() throws PersistentException {
		this(tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession());
	}
	
	public EHRPHRDataCriteria createEHRPHRDataCriteria() {
		return new EHRPHRDataCriteria(createCriteria("eHRPHRData"));
	}
	
	public ProblemCriteria createProblemCriteria() {
		return new ProblemCriteria(createCriteria("problem"));
	}
	
	public Concern uniqueConcern() {
		return (Concern) super.uniqueResult();
	}
	
	public Concern[] listConcern() {
		java.util.List list = super.list();
		return (Concern[]) list.toArray(new Concern[list.size()]);
	}
}

