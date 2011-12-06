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

public class CIEDDataDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final StringExpression sendingApplication;
	public final StringExpression sendingFacility;
	public final StringExpression receivingApplication;
	public final StringExpression receivingFacility;
	public final StringExpression messageTime;
	public final StringExpression comment;
	public final StringExpression receivedTime;
	
	public CIEDDataDetachedCriteria() {
		super(tr.com.srdc.icardea.hibernate.CIEDData.class, tr.com.srdc.icardea.hibernate.CIEDDataCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		sendingApplication = new StringExpression("sendingApplication", this.getDetachedCriteria());
		sendingFacility = new StringExpression("sendingFacility", this.getDetachedCriteria());
		receivingApplication = new StringExpression("receivingApplication", this.getDetachedCriteria());
		receivingFacility = new StringExpression("receivingFacility", this.getDetachedCriteria());
		messageTime = new StringExpression("messageTime", this.getDetachedCriteria());
		comment = new StringExpression("comment", this.getDetachedCriteria());
		receivedTime = new StringExpression("receivedTime", this.getDetachedCriteria());
	}
	
	public CIEDDataDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, tr.com.srdc.icardea.hibernate.CIEDDataCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		sendingApplication = new StringExpression("sendingApplication", this.getDetachedCriteria());
		sendingFacility = new StringExpression("sendingFacility", this.getDetachedCriteria());
		receivingApplication = new StringExpression("receivingApplication", this.getDetachedCriteria());
		receivingFacility = new StringExpression("receivingFacility", this.getDetachedCriteria());
		messageTime = new StringExpression("messageTime", this.getDetachedCriteria());
		comment = new StringExpression("comment", this.getDetachedCriteria());
		receivedTime = new StringExpression("receivedTime", this.getDetachedCriteria());
	}
	
	public ObservationDetachedCriteria createObservationfillerOrderNumberCriteria() {
		return new ObservationDetachedCriteria(createCriteria("observationfillerOrderNumber"));
	}
	
	public PatientDetachedCriteria createPatient1Criteria() {
		return new PatientDetachedCriteria(createCriteria("patient1"));
	}
	
	public CIEDData uniqueCIEDData(PersistentSession session) {
		return (CIEDData) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public CIEDData[] listCIEDData(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (CIEDData[]) list.toArray(new CIEDData[list.size()]);
	}
}

