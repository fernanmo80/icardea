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

public class LEADHVCHANNELSETDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final IntegerExpression subID;
	
	public LEADHVCHANNELSETDetachedCriteria() {
		super(tr.com.srdc.icardea.hibernate.LEADHVCHANNELSET.class, tr.com.srdc.icardea.hibernate.LEADHVCHANNELSETCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		subID = new IntegerExpression("subID", this.getDetachedCriteria());
	}
	
	public LEADHVCHANNELSETDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, tr.com.srdc.icardea.hibernate.LEADHVCHANNELSETCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		subID = new IntegerExpression("subID", this.getDetachedCriteria());
	}
	
	public SETDetachedCriteria createSETCriteria() {
		return new SETDetachedCriteria(createCriteria("sET"));
	}
	
	public SHOCKVECTORDetachedCriteria createSHOCKVECTORCriteria() {
		return new SHOCKVECTORDetachedCriteria(createCriteria("sHOCKVECTOR"));
	}
	
	public LEADHVCHANNELSET uniqueLEADHVCHANNELSET(PersistentSession session) {
		return (LEADHVCHANNELSET) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public LEADHVCHANNELSET[] listLEADHVCHANNELSET(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (LEADHVCHANNELSET[]) list.toArray(new LEADHVCHANNELSET[list.size()]);
	}
}

