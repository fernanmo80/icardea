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

public class MedicalCareplanTemplateCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final StringExpression content;
	public final StringExpression identifier;
	public final BooleanExpression approved;
	public final StringExpression ICD10Code;
	public final TimestampExpression creationDate;
	public final StringExpression name;
	
	public MedicalCareplanTemplateCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		content = new StringExpression("content", this);
		identifier = new StringExpression("identifier", this);
		approved = new BooleanExpression("approved", this);
		ICD10Code = new StringExpression("ICD10Code", this);
		creationDate = new TimestampExpression("creationDate", this);
		name = new StringExpression("name", this);
	}
	
	public MedicalCareplanTemplateCriteria(PersistentSession session) {
		this(session.createCriteria(MedicalCareplanTemplate.class));
	}
	
	public MedicalCareplanTemplateCriteria() throws PersistentException {
		this(tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession());
	}
	
	public PersonalizedMedicalCareplanCriteria createPersonalizedMedicalCareplanCriteria() {
		return new PersonalizedMedicalCareplanCriteria(createCriteria("ORM_PersonalizedMedicalCareplan"));
	}
	
	public MedicalCareplanTemplate uniqueMedicalCareplanTemplate() {
		return (MedicalCareplanTemplate) super.uniqueResult();
	}
	
	public MedicalCareplanTemplate[] listMedicalCareplanTemplate() {
		java.util.List list = super.list();
		return (MedicalCareplanTemplate[]) list.toArray(new MedicalCareplanTemplate[list.size()]);
	}
}

