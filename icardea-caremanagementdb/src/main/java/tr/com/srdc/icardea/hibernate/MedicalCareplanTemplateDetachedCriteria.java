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

public class MedicalCareplanTemplateDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final StringExpression content;
	public final StringExpression identifier;
	public final BooleanExpression approved;
	public final StringExpression ICD10Code;
	public final TimestampExpression creationDate;
	public final StringExpression name;
	
	public MedicalCareplanTemplateDetachedCriteria() {
		super(tr.com.srdc.icardea.hibernate.MedicalCareplanTemplate.class, tr.com.srdc.icardea.hibernate.MedicalCareplanTemplateCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		content = new StringExpression("content", this.getDetachedCriteria());
		identifier = new StringExpression("identifier", this.getDetachedCriteria());
		approved = new BooleanExpression("approved", this.getDetachedCriteria());
		ICD10Code = new StringExpression("ICD10Code", this.getDetachedCriteria());
		creationDate = new TimestampExpression("creationDate", this.getDetachedCriteria());
		name = new StringExpression("name", this.getDetachedCriteria());
	}
	
	public MedicalCareplanTemplateDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, tr.com.srdc.icardea.hibernate.MedicalCareplanTemplateCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		content = new StringExpression("content", this.getDetachedCriteria());
		identifier = new StringExpression("identifier", this.getDetachedCriteria());
		approved = new BooleanExpression("approved", this.getDetachedCriteria());
		ICD10Code = new StringExpression("ICD10Code", this.getDetachedCriteria());
		creationDate = new TimestampExpression("creationDate", this.getDetachedCriteria());
		name = new StringExpression("name", this.getDetachedCriteria());
	}
	
	public PersonalizedMedicalCareplanDetachedCriteria createPersonalizedMedicalCareplanCriteria() {
		return new PersonalizedMedicalCareplanDetachedCriteria(createCriteria("ORM_PersonalizedMedicalCareplan"));
	}
	
	public MedicalCareplanTemplate uniqueMedicalCareplanTemplate(PersistentSession session) {
		return (MedicalCareplanTemplate) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public MedicalCareplanTemplate[] listMedicalCareplanTemplate(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (MedicalCareplanTemplate[]) list.toArray(new MedicalCareplanTemplate[list.size()]);
	}
}

