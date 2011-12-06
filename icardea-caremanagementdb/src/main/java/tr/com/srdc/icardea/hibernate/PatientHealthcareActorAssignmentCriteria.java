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

public class PatientHealthcareActorAssignmentCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final StringExpression patientIdentifier;
	public final StringExpression healthcareActorIdentifier;
	public final TimestampExpression assignmentDate;
	
	public PatientHealthcareActorAssignmentCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		patientIdentifier = new StringExpression("patientIdentifier", this);
		healthcareActorIdentifier = new StringExpression("healthcareActorIdentifier", this);
		assignmentDate = new TimestampExpression("assignmentDate", this);
	}
	
	public PatientHealthcareActorAssignmentCriteria(PersistentSession session) {
		this(session.createCriteria(PatientHealthcareActorAssignment.class));
	}
	
	public PatientHealthcareActorAssignmentCriteria() throws PersistentException {
		this(tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession());
	}
	
	public PatientHealthcareActorAssignment uniquePatientHealthcareActorAssignment() {
		return (PatientHealthcareActorAssignment) super.uniqueResult();
	}
	
	public PatientHealthcareActorAssignment[] listPatientHealthcareActorAssignment() {
		java.util.List list = super.list();
		return (PatientHealthcareActorAssignment[]) list.toArray(new PatientHealthcareActorAssignment[list.size()]);
	}
}

