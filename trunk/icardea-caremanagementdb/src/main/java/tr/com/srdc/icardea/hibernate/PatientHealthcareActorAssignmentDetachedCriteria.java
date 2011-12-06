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

public class PatientHealthcareActorAssignmentDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final StringExpression patientIdentifier;
	public final StringExpression healthcareActorIdentifier;
	public final TimestampExpression assignmentDate;
	
	public PatientHealthcareActorAssignmentDetachedCriteria() {
		super(tr.com.srdc.icardea.hibernate.PatientHealthcareActorAssignment.class, tr.com.srdc.icardea.hibernate.PatientHealthcareActorAssignmentCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		patientIdentifier = new StringExpression("patientIdentifier", this.getDetachedCriteria());
		healthcareActorIdentifier = new StringExpression("healthcareActorIdentifier", this.getDetachedCriteria());
		assignmentDate = new TimestampExpression("assignmentDate", this.getDetachedCriteria());
	}
	
	public PatientHealthcareActorAssignmentDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, tr.com.srdc.icardea.hibernate.PatientHealthcareActorAssignmentCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		patientIdentifier = new StringExpression("patientIdentifier", this.getDetachedCriteria());
		healthcareActorIdentifier = new StringExpression("healthcareActorIdentifier", this.getDetachedCriteria());
		assignmentDate = new TimestampExpression("assignmentDate", this.getDetachedCriteria());
	}
	
	public PatientHealthcareActorAssignment uniquePatientHealthcareActorAssignment(PersistentSession session) {
		return (PatientHealthcareActorAssignment) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public PatientHealthcareActorAssignment[] listPatientHealthcareActorAssignment(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (PatientHealthcareActorAssignment[]) list.toArray(new PatientHealthcareActorAssignment[list.size()]);
	}
}

