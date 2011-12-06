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

public class BinaryDataDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final StringExpression base64String;
	
	public BinaryDataDetachedCriteria() {
		super(tr.com.srdc.icardea.hibernate.BinaryData.class, tr.com.srdc.icardea.hibernate.BinaryDataCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		base64String = new StringExpression("base64String", this.getDetachedCriteria());
	}
	
	public BinaryDataDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, tr.com.srdc.icardea.hibernate.BinaryDataCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		base64String = new StringExpression("base64String", this.getDetachedCriteria());
	}
	
	public ObservationDetachedCriteria createObservationCriteria() {
		return new ObservationDetachedCriteria(createCriteria("observation"));
	}
	
	public BinaryData uniqueBinaryData(PersistentSession session) {
		return (BinaryData) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public BinaryData[] listBinaryData(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (BinaryData[]) list.toArray(new BinaryData[list.size()]);
	}
}

