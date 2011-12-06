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

public class EHRPHRDataDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final StringExpression pcc9QueryId;
	public final StringExpression messageDateTime;
	public final IntegerExpression isEHR;
	
	public EHRPHRDataDetachedCriteria() {
		super(tr.com.srdc.icardea.hibernate.EHRPHRData.class, tr.com.srdc.icardea.hibernate.EHRPHRDataCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		pcc9QueryId = new StringExpression("pcc9QueryId", this.getDetachedCriteria());
		messageDateTime = new StringExpression("messageDateTime", this.getDetachedCriteria());
		isEHR = new IntegerExpression("isEHR", this.getDetachedCriteria());
	}
	
	public EHRPHRDataDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, tr.com.srdc.icardea.hibernate.EHRPHRDataCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		pcc9QueryId = new StringExpression("pcc9QueryId", this.getDetachedCriteria());
		messageDateTime = new StringExpression("messageDateTime", this.getDetachedCriteria());
		isEHR = new IntegerExpression("isEHR", this.getDetachedCriteria());
	}
	
	public PatientDetachedCriteria createPatientCriteria() {
		return new PatientDetachedCriteria(createCriteria("patient"));
	}
	
	public ConcernDetachedCriteria createConcernCriteria() {
		return new ConcernDetachedCriteria(createCriteria("concern"));
	}
	
	public MedicationDetachedCriteria createMedicationCriteria() {
		return new MedicationDetachedCriteria(createCriteria("medication"));
	}
	
	public ImmunizationDetachedCriteria createImmunizationCriteria() {
		return new ImmunizationDetachedCriteria(createCriteria("immunization"));
	}
	
	public ProblemDetachedCriteria createProblemCriteria() {
		return new ProblemDetachedCriteria(createCriteria("problem"));
	}
	
	public ImagingResultDetachedCriteria createImagingResultCriteria() {
		return new ImagingResultDetachedCriteria(createCriteria("imagingResult"));
	}
	
	public ProcedureDetachedCriteria createProcedureCriteria() {
		return new ProcedureDetachedCriteria(createCriteria("procedure"));
	}
	
	public EncounterDetachedCriteria createEncounterCriteria() {
		return new EncounterDetachedCriteria(createCriteria("encounter"));
	}
	
	public VitalSignDetachedCriteria createVitalSignCriteria() {
		return new VitalSignDetachedCriteria(createCriteria("vitalSign"));
	}
	
	public EHRPHRData uniqueEHRPHRData(PersistentSession session) {
		return (EHRPHRData) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public EHRPHRData[] listEHRPHRData(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (EHRPHRData[]) list.toArray(new EHRPHRData[list.size()]);
	}
}

