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

public class ProcedureDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final StringExpression careProvisionCode;
	public final StringExpression procedureCode;
	public final StringExpression procedureCodeSystem;
	public final StringExpression procedureText;
	public final StringExpression statusCode;
	public final StringExpression effectiveTimeLow;
	public final StringExpression effectiveTimeHigh;
	
	public ProcedureDetachedCriteria() {
		super(tr.com.srdc.icardea.hibernate.Procedure.class, tr.com.srdc.icardea.hibernate.ProcedureCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		careProvisionCode = new StringExpression("careProvisionCode", this.getDetachedCriteria());
		procedureCode = new StringExpression("procedureCode", this.getDetachedCriteria());
		procedureCodeSystem = new StringExpression("procedureCodeSystem", this.getDetachedCriteria());
		procedureText = new StringExpression("procedureText", this.getDetachedCriteria());
		statusCode = new StringExpression("statusCode", this.getDetachedCriteria());
		effectiveTimeLow = new StringExpression("effectiveTimeLow", this.getDetachedCriteria());
		effectiveTimeHigh = new StringExpression("effectiveTimeHigh", this.getDetachedCriteria());
	}
	
	public ProcedureDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, tr.com.srdc.icardea.hibernate.ProcedureCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		careProvisionCode = new StringExpression("careProvisionCode", this.getDetachedCriteria());
		procedureCode = new StringExpression("procedureCode", this.getDetachedCriteria());
		procedureCodeSystem = new StringExpression("procedureCodeSystem", this.getDetachedCriteria());
		procedureText = new StringExpression("procedureText", this.getDetachedCriteria());
		statusCode = new StringExpression("statusCode", this.getDetachedCriteria());
		effectiveTimeLow = new StringExpression("effectiveTimeLow", this.getDetachedCriteria());
		effectiveTimeHigh = new StringExpression("effectiveTimeHigh", this.getDetachedCriteria());
	}
	
	public EHRPHRDataDetachedCriteria createEHRPHRDataCriteria() {
		return new EHRPHRDataDetachedCriteria(createCriteria("eHRPHRData"));
	}
	
	public Procedure uniqueProcedure(PersistentSession session) {
		return (Procedure) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Procedure[] listProcedure(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Procedure[]) list.toArray(new Procedure[list.size()]);
	}
}

