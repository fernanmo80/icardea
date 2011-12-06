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

public class CAPDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final StringExpression charge_dtm;
	public final StringExpression charge_time;
	public final StringExpression charge_energy;
	public final StringExpression charge_type;
	public final IntegerExpression subID;
	
	public CAPDetachedCriteria() {
		super(tr.com.srdc.icardea.hibernate.CAP.class, tr.com.srdc.icardea.hibernate.CAPCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		charge_dtm = new StringExpression("charge_dtm", this.getDetachedCriteria());
		charge_time = new StringExpression("charge_time", this.getDetachedCriteria());
		charge_energy = new StringExpression("charge_energy", this.getDetachedCriteria());
		charge_type = new StringExpression("charge_type", this.getDetachedCriteria());
		subID = new IntegerExpression("subID", this.getDetachedCriteria());
	}
	
	public CAPDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, tr.com.srdc.icardea.hibernate.CAPCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		charge_dtm = new StringExpression("charge_dtm", this.getDetachedCriteria());
		charge_time = new StringExpression("charge_time", this.getDetachedCriteria());
		charge_energy = new StringExpression("charge_energy", this.getDetachedCriteria());
		charge_type = new StringExpression("charge_type", this.getDetachedCriteria());
		subID = new IntegerExpression("subID", this.getDetachedCriteria());
	}
	
	public MSMTDetachedCriteria createMSMTCriteria() {
		return new MSMTDetachedCriteria(createCriteria("mSMT"));
	}
	
	public CAP uniqueCAP(PersistentSession session) {
		return (CAP) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public CAP[] listCAP(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (CAP[]) list.toArray(new CAP[list.size()]);
	}
}

