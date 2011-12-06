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

public class MAGNETDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final StringExpression resp;
	
	public MAGNETDetachedCriteria() {
		super(tr.com.srdc.icardea.hibernate.MAGNET.class, tr.com.srdc.icardea.hibernate.MAGNETCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		resp = new StringExpression("resp", this.getDetachedCriteria());
	}
	
	public MAGNETDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, tr.com.srdc.icardea.hibernate.MAGNETCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		resp = new StringExpression("resp", this.getDetachedCriteria());
	}
	
	public SETDetachedCriteria createSETCriteria() {
		return new SETDetachedCriteria(createCriteria("sET"));
	}
	
	public MAGNET uniqueMAGNET(PersistentSession session) {
		return (MAGNET) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public MAGNET[] listMAGNET(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (MAGNET[]) list.toArray(new MAGNET[list.size()]);
	}
}

