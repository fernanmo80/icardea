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

public class SETCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	
	public SETCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
	}
	
	public SETCriteria(PersistentSession session) {
		this(session.createCriteria(SET.class));
	}
	
	public SETCriteria() throws PersistentException {
		this(tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession());
	}
	
	public SystemCriteria createSystemCriteria() {
		return new SystemCriteria(createCriteria("system"));
	}
	
	public CRTSETCriteria createCRTSETCriteria() {
		return new CRTSETCriteria(createCriteria("cRTSET"));
	}
	
	public MAGNETCriteria createMAGNETCriteria() {
		return new MAGNETCriteria(createCriteria("mAGNET"));
	}
	
	public BRADYSETCriteria createBRADYSETCriteria() {
		return new BRADYSETCriteria(createCriteria("bRADYSET"));
	}
	
	public TACHYTHERAPYSETCriteria createTACHYTHERAPYSETCriteria() {
		return new TACHYTHERAPYSETCriteria(createCriteria("tACHYTHERAPYSET"));
	}
	
	public ZONECriteria createZONECriteria() {
		return new ZONECriteria(createCriteria("ORM_zONE"));
	}
	
	public LEADHVCHANNELSETCriteria createLEADHVCHANNELSETCriteria() {
		return new LEADHVCHANNELSETCriteria(createCriteria("lEADHVCHANNELSET"));
	}
	
	public LEADCHNLSETCriteria createLEADCHNLSETCriteria() {
		return new LEADCHNLSETCriteria(createCriteria("ORM_lEADCHNLSET"));
	}
	
	public SET uniqueSET() {
		return (SET) super.uniqueResult();
	}
	
	public SET[] listSET() {
		java.util.List list = super.list();
		return (SET[]) list.toArray(new SET[list.size()]);
	}
}

