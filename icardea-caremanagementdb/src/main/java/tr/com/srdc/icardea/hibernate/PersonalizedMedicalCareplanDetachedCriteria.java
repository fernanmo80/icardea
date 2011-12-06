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

public class PersonalizedMedicalCareplanDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final StringExpression content;
	public final StringExpression identifier;
	public final TimestampExpression creationDate;
	public final StringExpression name;
	public final StringExpression patientIdentifier;
	
	public PersonalizedMedicalCareplanDetachedCriteria() {
		super(tr.com.srdc.icardea.hibernate.PersonalizedMedicalCareplan.class, tr.com.srdc.icardea.hibernate.PersonalizedMedicalCareplanCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		content = new StringExpression("content", this.getDetachedCriteria());
		identifier = new StringExpression("identifier", this.getDetachedCriteria());
		creationDate = new TimestampExpression("creationDate", this.getDetachedCriteria());
		name = new StringExpression("name", this.getDetachedCriteria());
		patientIdentifier = new StringExpression("patientIdentifier", this.getDetachedCriteria());
	}
	
	public PersonalizedMedicalCareplanDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, tr.com.srdc.icardea.hibernate.PersonalizedMedicalCareplanCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		content = new StringExpression("content", this.getDetachedCriteria());
		identifier = new StringExpression("identifier", this.getDetachedCriteria());
		creationDate = new TimestampExpression("creationDate", this.getDetachedCriteria());
		name = new StringExpression("name", this.getDetachedCriteria());
		patientIdentifier = new StringExpression("patientIdentifier", this.getDetachedCriteria());
	}
	
	public MedicalCareplanTemplateDetachedCriteria createMedicalCareplanTemplateCriteria() {
		return new MedicalCareplanTemplateDetachedCriteria(createCriteria("medicalCareplanTemplate"));
	}
	
	public PersonalizedMedicalCareplanInstanceDetachedCriteria createPersonalizedMedicalCareplanInstanceCriteria() {
		return new PersonalizedMedicalCareplanInstanceDetachedCriteria(createCriteria("ORM_PersonalizedMedicalCareplanInstance"));
	}
	
	public PersonalizedMedicalCareplan uniquePersonalizedMedicalCareplan(PersistentSession session) {
		return (PersonalizedMedicalCareplan) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public PersonalizedMedicalCareplan[] listPersonalizedMedicalCareplan(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (PersonalizedMedicalCareplan[]) list.toArray(new PersonalizedMedicalCareplan[list.size()]);
	}
}

