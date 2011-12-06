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

public class PersonalizedMedicalCareplanInstanceDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final StringExpression content;
	public final StringExpression identifier;
	public final TimestampExpression instantiationDate;
	
	public PersonalizedMedicalCareplanInstanceDetachedCriteria() {
		super(tr.com.srdc.icardea.hibernate.PersonalizedMedicalCareplanInstance.class, tr.com.srdc.icardea.hibernate.PersonalizedMedicalCareplanInstanceCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		content = new StringExpression("content", this.getDetachedCriteria());
		identifier = new StringExpression("identifier", this.getDetachedCriteria());
		instantiationDate = new TimestampExpression("instantiationDate", this.getDetachedCriteria());
	}
	
	public PersonalizedMedicalCareplanInstanceDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, tr.com.srdc.icardea.hibernate.PersonalizedMedicalCareplanInstanceCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		content = new StringExpression("content", this.getDetachedCriteria());
		identifier = new StringExpression("identifier", this.getDetachedCriteria());
		instantiationDate = new TimestampExpression("instantiationDate", this.getDetachedCriteria());
	}
	
	public PersonalizedMedicalCareplanDetachedCriteria createPersonalizedMedicalCareplanCriteria() {
		return new PersonalizedMedicalCareplanDetachedCriteria(createCriteria("personalizedMedicalCareplan"));
	}
	
	public PersonalizedMedicalCareplanInstance uniquePersonalizedMedicalCareplanInstance(PersistentSession session) {
		return (PersonalizedMedicalCareplanInstance) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public PersonalizedMedicalCareplanInstance[] listPersonalizedMedicalCareplanInstance(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (PersonalizedMedicalCareplanInstance[]) list.toArray(new PersonalizedMedicalCareplanInstance[list.size()]);
	}
}

