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

public class SystemDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	
	public SystemDetachedCriteria() {
		super(tr.com.srdc.icardea.hibernate.System.class, tr.com.srdc.icardea.hibernate.SystemCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
	}
	
	public SystemDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, tr.com.srdc.icardea.hibernate.SystemCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
	}
	
	public ObservationDetachedCriteria createObservationCriteria() {
		return new ObservationDetachedCriteria(createCriteria("observation"));
	}
	
	public PGDetachedCriteria createPGCriteria() {
		return new PGDetachedCriteria(createCriteria("pG"));
	}
	
	public LEAD2DetachedCriteria createLEAD2Criteria() {
		return new LEAD2DetachedCriteria(createCriteria("ORM_LEAD2"));
	}
	
	public SESSDetachedCriteria createSESSCriteria() {
		return new SESSDetachedCriteria(createCriteria("sESS"));
	}
	
	public MSMTDetachedCriteria createMSMTCriteria() {
		return new MSMTDetachedCriteria(createCriteria("mSMT"));
	}
	
	public SETDetachedCriteria createSETCriteria() {
		return new SETDetachedCriteria(createCriteria("sET"));
	}
	
	public STATDetachedCriteria createSTATCriteria() {
		return new STATDetachedCriteria(createCriteria("sTAT"));
	}
	
	public EPISODEROOTDetachedCriteria createEPISODEROOTCriteria() {
		return new EPISODEROOTDetachedCriteria(createCriteria("ORM_EPISODEROOT"));
	}
	
	public System uniqueSystem(PersistentSession session) {
		return (System) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public System[] listSystem(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (System[]) list.toArray(new System[list.size()]);
	}
}

