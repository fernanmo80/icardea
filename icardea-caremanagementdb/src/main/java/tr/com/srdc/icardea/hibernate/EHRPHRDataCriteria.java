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

public class EHRPHRDataCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final StringExpression pcc9QueryId;
	public final StringExpression messageDateTime;
	public final IntegerExpression isEHR;
	
	public EHRPHRDataCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		pcc9QueryId = new StringExpression("pcc9QueryId", this);
		messageDateTime = new StringExpression("messageDateTime", this);
		isEHR = new IntegerExpression("isEHR", this);
	}
	
	public EHRPHRDataCriteria(PersistentSession session) {
		this(session.createCriteria(EHRPHRData.class));
	}
	
	public EHRPHRDataCriteria() throws PersistentException {
		this(tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession());
	}
	
	public PatientCriteria createPatientCriteria() {
		return new PatientCriteria(createCriteria("patient"));
	}
	
	public ConcernCriteria createConcernCriteria() {
		return new ConcernCriteria(createCriteria("concern"));
	}
	
	public MedicationCriteria createMedicationCriteria() {
		return new MedicationCriteria(createCriteria("medication"));
	}
	
	public ImmunizationCriteria createImmunizationCriteria() {
		return new ImmunizationCriteria(createCriteria("immunization"));
	}
	
	public ProblemCriteria createProblemCriteria() {
		return new ProblemCriteria(createCriteria("problem"));
	}
	
	public ImagingResultCriteria createImagingResultCriteria() {
		return new ImagingResultCriteria(createCriteria("imagingResult"));
	}
	
	public ProcedureCriteria createProcedureCriteria() {
		return new ProcedureCriteria(createCriteria("procedure"));
	}
	
	public EncounterCriteria createEncounterCriteria() {
		return new EncounterCriteria(createCriteria("encounter"));
	}
	
	public VitalSignCriteria createVitalSignCriteria() {
		return new VitalSignCriteria(createCriteria("vitalSign"));
	}
	
	public EHRPHRData uniqueEHRPHRData() {
		return (EHRPHRData) super.uniqueResult();
	}
	
	public EHRPHRData[] listEHRPHRData() {
		java.util.List list = super.list();
		return (EHRPHRData[]) list.toArray(new EHRPHRData[list.size()]);
	}
}

