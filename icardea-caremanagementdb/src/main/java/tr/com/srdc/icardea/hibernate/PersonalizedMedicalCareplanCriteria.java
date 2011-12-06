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

public class PersonalizedMedicalCareplanCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final StringExpression content;
	public final StringExpression identifier;
	public final TimestampExpression creationDate;
	public final StringExpression name;
	public final StringExpression patientIdentifier;
	
	public PersonalizedMedicalCareplanCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		content = new StringExpression("content", this);
		identifier = new StringExpression("identifier", this);
		creationDate = new TimestampExpression("creationDate", this);
		name = new StringExpression("name", this);
		patientIdentifier = new StringExpression("patientIdentifier", this);
	}
	
	public PersonalizedMedicalCareplanCriteria(PersistentSession session) {
		this(session.createCriteria(PersonalizedMedicalCareplan.class));
	}
	
	public PersonalizedMedicalCareplanCriteria() throws PersistentException {
		this(tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession());
	}
	
	public MedicalCareplanTemplateCriteria createMedicalCareplanTemplateCriteria() {
		return new MedicalCareplanTemplateCriteria(createCriteria("medicalCareplanTemplate"));
	}
	
	public PersonalizedMedicalCareplanInstanceCriteria createPersonalizedMedicalCareplanInstanceCriteria() {
		return new PersonalizedMedicalCareplanInstanceCriteria(createCriteria("ORM_PersonalizedMedicalCareplanInstance"));
	}
	
	public PersonalizedMedicalCareplan uniquePersonalizedMedicalCareplan() {
		return (PersonalizedMedicalCareplan) super.uniqueResult();
	}
	
	public PersonalizedMedicalCareplan[] listPersonalizedMedicalCareplan() {
		java.util.List list = super.list();
		return (PersonalizedMedicalCareplan[]) list.toArray(new PersonalizedMedicalCareplan[list.size()]);
	}
}

