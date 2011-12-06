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

public class SystemCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	
	public SystemCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
	}
	
	public SystemCriteria(PersistentSession session) {
		this(session.createCriteria(System.class));
	}
	
	public SystemCriteria() throws PersistentException {
		this(tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession());
	}
	
	public ObservationCriteria createObservationCriteria() {
		return new ObservationCriteria(createCriteria("observation"));
	}
	
	public PGCriteria createPGCriteria() {
		return new PGCriteria(createCriteria("pG"));
	}
	
	public LEAD2Criteria createLEAD2Criteria() {
		return new LEAD2Criteria(createCriteria("ORM_lEAD2"));
	}
	
	public SESSCriteria createSESSCriteria() {
		return new SESSCriteria(createCriteria("sESS"));
	}
	
	public MSMTCriteria createMSMTCriteria() {
		return new MSMTCriteria(createCriteria("mSMT"));
	}
	
	public SETCriteria createSETCriteria() {
		return new SETCriteria(createCriteria("sET"));
	}
	
	public STATCriteria createSTATCriteria() {
		return new STATCriteria(createCriteria("sTAT"));
	}
	
	public EPISODEROOTCriteria createEPISODEROOTCriteria() {
		return new EPISODEROOTCriteria(createCriteria("ORM_ePISODEROOT"));
	}
	
	public System uniqueSystem() {
		return (System) super.uniqueResult();
	}
	
	public System[] listSystem() {
		java.util.List list = super.list();
		return (System[]) list.toArray(new System[list.size()]);
	}
}

