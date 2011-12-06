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

public class CIEDDataCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final StringExpression sendingApplication;
	public final StringExpression sendingFacility;
	public final StringExpression receivingApplication;
	public final StringExpression receivingFacility;
	public final StringExpression messageTime;
	public final StringExpression comment;
	public final StringExpression receivedTime;
	
	public CIEDDataCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		sendingApplication = new StringExpression("sendingApplication", this);
		sendingFacility = new StringExpression("sendingFacility", this);
		receivingApplication = new StringExpression("receivingApplication", this);
		receivingFacility = new StringExpression("receivingFacility", this);
		messageTime = new StringExpression("messageTime", this);
		comment = new StringExpression("comment", this);
		receivedTime = new StringExpression("receivedTime", this);
	}
	
	public CIEDDataCriteria(PersistentSession session) {
		this(session.createCriteria(CIEDData.class));
	}
	
	public CIEDDataCriteria() throws PersistentException {
		this(tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession());
	}
	
	public ObservationCriteria createObservationfillerOrderNumberCriteria() {
		return new ObservationCriteria(createCriteria("observationfillerOrderNumber"));
	}
	
	public PatientCriteria createPatient1Criteria() {
		return new PatientCriteria(createCriteria("patient1"));
	}
	
	public CIEDData uniqueCIEDData() {
		return (CIEDData) super.uniqueResult();
	}
	
	public CIEDData[] listCIEDData() {
		java.util.List list = super.list();
		return (CIEDData[]) list.toArray(new CIEDData[list.size()]);
	}
}

