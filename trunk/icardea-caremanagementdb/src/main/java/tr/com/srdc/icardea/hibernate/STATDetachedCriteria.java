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

public class STATDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final StringExpression dtm_start;
	public final StringExpression dtm_end;
	
	public STATDetachedCriteria() {
		super(tr.com.srdc.icardea.hibernate.STAT.class, tr.com.srdc.icardea.hibernate.STATCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		dtm_start = new StringExpression("dtm_start", this.getDetachedCriteria());
		dtm_end = new StringExpression("dtm_end", this.getDetachedCriteria());
	}
	
	public STATDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, tr.com.srdc.icardea.hibernate.STATCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		dtm_start = new StringExpression("dtm_start", this.getDetachedCriteria());
		dtm_end = new StringExpression("dtm_end", this.getDetachedCriteria());
	}
	
	public SystemDetachedCriteria createSystemCriteria() {
		return new SystemDetachedCriteria(createCriteria("system"));
	}
	
	public HEART_RATEDetachedCriteria createHEART_RATECriteria() {
		return new HEART_RATEDetachedCriteria(createCriteria("hEART_RATE"));
	}
	
	public ATDetachedCriteria createATCriteria() {
		return new ATDetachedCriteria(createCriteria("aT"));
	}
	
	public EPISODESTATDetachedCriteria createEPISODESTATCriteria() {
		return new EPISODESTATDetachedCriteria(createCriteria("ORM_EPISODESTAT"));
	}
	
	public BRADYSTATDetachedCriteria createBRADYSTATCriteria() {
		return new BRADYSTATDetachedCriteria(createCriteria("bRADYSTAT"));
	}
	
	public CRTSTATDetachedCriteria createCRTSTATCriteria() {
		return new CRTSTATDetachedCriteria(createCriteria("cRTSTAT"));
	}
	
	public TACHYTHERAPYSTATDetachedCriteria createTACHYTHERAPYSTATCriteria() {
		return new TACHYTHERAPYSTATDetachedCriteria(createCriteria("tACHYTHERAPYSTAT"));
	}
	
	public STAT uniqueSTAT(PersistentSession session) {
		return (STAT) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public STAT[] listSTAT(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (STAT[]) list.toArray(new STAT[list.size()]);
	}
}

