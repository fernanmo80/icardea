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

public class BinaryDataCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final StringExpression base64String;
	
	public BinaryDataCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		base64String = new StringExpression("base64String", this);
	}
	
	public BinaryDataCriteria(PersistentSession session) {
		this(session.createCriteria(BinaryData.class));
	}
	
	public BinaryDataCriteria() throws PersistentException {
		this(tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession());
	}
	
	public ObservationCriteria createObservationCriteria() {
		return new ObservationCriteria(createCriteria("observation"));
	}
	
	public BinaryData uniqueBinaryData() {
		return (BinaryData) super.uniqueResult();
	}
	
	public BinaryData[] listBinaryData() {
		java.util.List list = super.list();
		return (BinaryData[]) list.toArray(new BinaryData[list.size()]);
	}
}

