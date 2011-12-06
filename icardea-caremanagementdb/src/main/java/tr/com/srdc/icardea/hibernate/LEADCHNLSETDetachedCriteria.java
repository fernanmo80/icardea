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

public class LEADCHNLSETDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final StringExpression chamber;
	public final IntegerExpression subID;
	
	public LEADCHNLSETDetachedCriteria() {
		super(tr.com.srdc.icardea.hibernate.LEADCHNLSET.class, tr.com.srdc.icardea.hibernate.LEADCHNLSETCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		chamber = new StringExpression("chamber", this.getDetachedCriteria());
		subID = new IntegerExpression("subID", this.getDetachedCriteria());
	}
	
	public LEADCHNLSETDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, tr.com.srdc.icardea.hibernate.LEADCHNLSETCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		chamber = new StringExpression("chamber", this.getDetachedCriteria());
		subID = new IntegerExpression("subID", this.getDetachedCriteria());
	}
	
	public SETDetachedCriteria createSETCriteria() {
		return new SETDetachedCriteria(createCriteria("sET"));
	}
	
	public SENSINGSETDetachedCriteria createSENSINGSETCriteria() {
		return new SENSINGSETDetachedCriteria(createCriteria("sENSINGSET"));
	}
	
	public PACINGDetachedCriteria createPACINGCriteria() {
		return new PACINGDetachedCriteria(createCriteria("pACING"));
	}
	
	public LEADCHNLSET uniqueLEADCHNLSET(PersistentSession session) {
		return (LEADCHNLSET) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public LEADCHNLSET[] listLEADCHNLSET(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (LEADCHNLSET[]) list.toArray(new LEADCHNLSET[list.size()]);
	}
}

