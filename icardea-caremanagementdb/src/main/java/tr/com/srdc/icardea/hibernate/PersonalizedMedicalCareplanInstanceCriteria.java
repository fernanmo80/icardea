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

public class PersonalizedMedicalCareplanInstanceCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final StringExpression content;
	public final StringExpression identifier;
	public final TimestampExpression instantiationDate;
	
	public PersonalizedMedicalCareplanInstanceCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		content = new StringExpression("content", this);
		identifier = new StringExpression("identifier", this);
		instantiationDate = new TimestampExpression("instantiationDate", this);
	}
	
	public PersonalizedMedicalCareplanInstanceCriteria(PersistentSession session) {
		this(session.createCriteria(PersonalizedMedicalCareplanInstance.class));
	}
	
	public PersonalizedMedicalCareplanInstanceCriteria() throws PersistentException {
		this(tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession());
	}
	
	public PersonalizedMedicalCareplanCriteria createPersonalizedMedicalCareplanCriteria() {
		return new PersonalizedMedicalCareplanCriteria(createCriteria("personalizedMedicalCareplan"));
	}
	
	public PersonalizedMedicalCareplanInstance uniquePersonalizedMedicalCareplanInstance() {
		return (PersonalizedMedicalCareplanInstance) super.uniqueResult();
	}
	
	public PersonalizedMedicalCareplanInstance[] listPersonalizedMedicalCareplanInstance() {
		java.util.List list = super.list();
		return (PersonalizedMedicalCareplanInstance[]) list.toArray(new PersonalizedMedicalCareplanInstance[list.size()]);
	}
}

