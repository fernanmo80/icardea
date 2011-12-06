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

public class SETDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	
	public SETDetachedCriteria() {
		super(tr.com.srdc.icardea.hibernate.SET.class, tr.com.srdc.icardea.hibernate.SETCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
	}
	
	public SETDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, tr.com.srdc.icardea.hibernate.SETCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
	}
	
	public SystemDetachedCriteria createSystemCriteria() {
		return new SystemDetachedCriteria(createCriteria("system"));
	}
	
	public CRTSETDetachedCriteria createCRTSETCriteria() {
		return new CRTSETDetachedCriteria(createCriteria("cRTSET"));
	}
	
	public MAGNETDetachedCriteria createMAGNETCriteria() {
		return new MAGNETDetachedCriteria(createCriteria("mAGNET"));
	}
	
	public BRADYSETDetachedCriteria createBRADYSETCriteria() {
		return new BRADYSETDetachedCriteria(createCriteria("bRADYSET"));
	}
	
	public TACHYTHERAPYSETDetachedCriteria createTACHYTHERAPYSETCriteria() {
		return new TACHYTHERAPYSETDetachedCriteria(createCriteria("tACHYTHERAPYSET"));
	}
	
	public ZONEDetachedCriteria createZONECriteria() {
		return new ZONEDetachedCriteria(createCriteria("ORM_ZONE"));
	}
	
	public LEADHVCHANNELSETDetachedCriteria createLEADHVCHANNELSETCriteria() {
		return new LEADHVCHANNELSETDetachedCriteria(createCriteria("lEADHVCHANNELSET"));
	}
	
	public LEADCHNLSETDetachedCriteria createLEADCHNLSETCriteria() {
		return new LEADCHNLSETDetachedCriteria(createCriteria("ORM_LEADCHNLSET"));
	}
	
	public SET uniqueSET(PersistentSession session) {
		return (SET) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public SET[] listSET(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (SET[]) list.toArray(new SET[list.size()]);
	}
}

