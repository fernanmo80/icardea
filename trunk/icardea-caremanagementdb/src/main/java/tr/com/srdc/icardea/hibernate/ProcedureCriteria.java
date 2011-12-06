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

public class ProcedureCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final StringExpression careProvisionCode;
	public final StringExpression procedureCode;
	public final StringExpression procedureCodeSystem;
	public final StringExpression procedureText;
	public final StringExpression statusCode;
	public final StringExpression effectiveTimeLow;
	public final StringExpression effectiveTimeHigh;
	
	public ProcedureCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		careProvisionCode = new StringExpression("careProvisionCode", this);
		procedureCode = new StringExpression("procedureCode", this);
		procedureCodeSystem = new StringExpression("procedureCodeSystem", this);
		procedureText = new StringExpression("procedureText", this);
		statusCode = new StringExpression("statusCode", this);
		effectiveTimeLow = new StringExpression("effectiveTimeLow", this);
		effectiveTimeHigh = new StringExpression("effectiveTimeHigh", this);
	}
	
	public ProcedureCriteria(PersistentSession session) {
		this(session.createCriteria(Procedure.class));
	}
	
	public ProcedureCriteria() throws PersistentException {
		this(tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession());
	}
	
	public EHRPHRDataCriteria createEHRPHRDataCriteria() {
		return new EHRPHRDataCriteria(createCriteria("eHRPHRData"));
	}
	
	public Procedure uniqueProcedure() {
		return (Procedure) super.uniqueResult();
	}
	
	public Procedure[] listProcedure() {
		java.util.List list = super.list();
		return (Procedure[]) list.toArray(new Procedure[list.size()]);
	}
}

