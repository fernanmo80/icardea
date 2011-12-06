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

public class HEART_RATEDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final StringExpression dtm_start;
	public final StringExpression dtm_end;
	public final StringExpression atrial_min;
	public final StringExpression atrial_max;
	public final StringExpression atrial_mean;
	public final StringExpression ventricular_min;
	public final StringExpression ventricular_max;
	public final StringExpression ventricular_mean;
	
	public HEART_RATEDetachedCriteria() {
		super(tr.com.srdc.icardea.hibernate.HEART_RATE.class, tr.com.srdc.icardea.hibernate.HEART_RATECriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		dtm_start = new StringExpression("dtm_start", this.getDetachedCriteria());
		dtm_end = new StringExpression("dtm_end", this.getDetachedCriteria());
		atrial_min = new StringExpression("atrial_min", this.getDetachedCriteria());
		atrial_max = new StringExpression("atrial_max", this.getDetachedCriteria());
		atrial_mean = new StringExpression("atrial_mean", this.getDetachedCriteria());
		ventricular_min = new StringExpression("ventricular_min", this.getDetachedCriteria());
		ventricular_max = new StringExpression("ventricular_max", this.getDetachedCriteria());
		ventricular_mean = new StringExpression("ventricular_mean", this.getDetachedCriteria());
	}
	
	public HEART_RATEDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, tr.com.srdc.icardea.hibernate.HEART_RATECriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		dtm_start = new StringExpression("dtm_start", this.getDetachedCriteria());
		dtm_end = new StringExpression("dtm_end", this.getDetachedCriteria());
		atrial_min = new StringExpression("atrial_min", this.getDetachedCriteria());
		atrial_max = new StringExpression("atrial_max", this.getDetachedCriteria());
		atrial_mean = new StringExpression("atrial_mean", this.getDetachedCriteria());
		ventricular_min = new StringExpression("ventricular_min", this.getDetachedCriteria());
		ventricular_max = new StringExpression("ventricular_max", this.getDetachedCriteria());
		ventricular_mean = new StringExpression("ventricular_mean", this.getDetachedCriteria());
	}
	
	public STATDetachedCriteria createSTATCriteria() {
		return new STATDetachedCriteria(createCriteria("sTAT"));
	}
	
	public HEART_RATE uniqueHEART_RATE(PersistentSession session) {
		return (HEART_RATE) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public HEART_RATE[] listHEART_RATE(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (HEART_RATE[]) list.toArray(new HEART_RATE[list.size()]);
	}
}

