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

public class STATCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final StringExpression dtm_start;
	public final StringExpression dtm_end;
	
	public STATCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		dtm_start = new StringExpression("dtm_start", this);
		dtm_end = new StringExpression("dtm_end", this);
	}
	
	public STATCriteria(PersistentSession session) {
		this(session.createCriteria(STAT.class));
	}
	
	public STATCriteria() throws PersistentException {
		this(tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession());
	}
	
	public SystemCriteria createSystemCriteria() {
		return new SystemCriteria(createCriteria("system"));
	}
	
	public HEART_RATECriteria createHEART_RATECriteria() {
		return new HEART_RATECriteria(createCriteria("hEART_RATE"));
	}
	
	public ATCriteria createATCriteria() {
		return new ATCriteria(createCriteria("aT"));
	}
	
	public EPISODESTATCriteria createEPISODESTATCriteria() {
		return new EPISODESTATCriteria(createCriteria("ORM_ePISODESTAT"));
	}
	
	public BRADYSTATCriteria createBRADYSTATCriteria() {
		return new BRADYSTATCriteria(createCriteria("bRADYSTAT"));
	}
	
	public CRTSTATCriteria createCRTSTATCriteria() {
		return new CRTSTATCriteria(createCriteria("cRTSTAT"));
	}
	
	public TACHYTHERAPYSTATCriteria createTACHYTHERAPYSTATCriteria() {
		return new TACHYTHERAPYSTATCriteria(createCriteria("tACHYTHERAPYSTAT"));
	}
	
	public STAT uniqueSTAT() {
		return (STAT) super.uniqueResult();
	}
	
	public STAT[] listSTAT() {
		java.util.List list = super.list();
		return (STAT[]) list.toArray(new STAT[list.size()]);
	}
}

