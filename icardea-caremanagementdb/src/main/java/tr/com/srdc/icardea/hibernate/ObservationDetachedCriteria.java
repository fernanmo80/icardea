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

public class ObservationDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final StringExpression universalServiceIdentifier;
	public final StringExpression observationDateTime;
	public final StringExpression observationEndDataTime;
	public final StringExpression resultRptStatusChangeDateTime;
	public final StringExpression resultStatus;
	public final StringExpression attendingDoctorID;
	public final StringExpression visitID;
	public final StringExpression patientClass;
	public final StringExpression base64String;
	public final StringExpression abnormalFlags;
	public final StringExpression equipmentInstanceIdentifier;
	public final StringExpression fillerOrderNumber;
	
	public ObservationDetachedCriteria() {
		super(tr.com.srdc.icardea.hibernate.Observation.class, tr.com.srdc.icardea.hibernate.ObservationCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		universalServiceIdentifier = new StringExpression("universalServiceIdentifier", this.getDetachedCriteria());
		observationDateTime = new StringExpression("observationDateTime", this.getDetachedCriteria());
		observationEndDataTime = new StringExpression("observationEndDataTime", this.getDetachedCriteria());
		resultRptStatusChangeDateTime = new StringExpression("resultRptStatusChangeDateTime", this.getDetachedCriteria());
		resultStatus = new StringExpression("resultStatus", this.getDetachedCriteria());
		attendingDoctorID = new StringExpression("attendingDoctorID", this.getDetachedCriteria());
		visitID = new StringExpression("visitID", this.getDetachedCriteria());
		patientClass = new StringExpression("patientClass", this.getDetachedCriteria());
		base64String = new StringExpression("base64String", this.getDetachedCriteria());
		abnormalFlags = new StringExpression("abnormalFlags", this.getDetachedCriteria());
		equipmentInstanceIdentifier = new StringExpression("equipmentInstanceIdentifier", this.getDetachedCriteria());
		fillerOrderNumber = new StringExpression("fillerOrderNumber", this.getDetachedCriteria());
	}
	
	public ObservationDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, tr.com.srdc.icardea.hibernate.ObservationCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		universalServiceIdentifier = new StringExpression("universalServiceIdentifier", this.getDetachedCriteria());
		observationDateTime = new StringExpression("observationDateTime", this.getDetachedCriteria());
		observationEndDataTime = new StringExpression("observationEndDataTime", this.getDetachedCriteria());
		resultRptStatusChangeDateTime = new StringExpression("resultRptStatusChangeDateTime", this.getDetachedCriteria());
		resultStatus = new StringExpression("resultStatus", this.getDetachedCriteria());
		attendingDoctorID = new StringExpression("attendingDoctorID", this.getDetachedCriteria());
		visitID = new StringExpression("visitID", this.getDetachedCriteria());
		patientClass = new StringExpression("patientClass", this.getDetachedCriteria());
		base64String = new StringExpression("base64String", this.getDetachedCriteria());
		abnormalFlags = new StringExpression("abnormalFlags", this.getDetachedCriteria());
		equipmentInstanceIdentifier = new StringExpression("equipmentInstanceIdentifier", this.getDetachedCriteria());
		fillerOrderNumber = new StringExpression("fillerOrderNumber", this.getDetachedCriteria());
	}
	
	public SystemDetachedCriteria createSystemCriteria() {
		return new SystemDetachedCriteria(createCriteria("system"));
	}
	
	public CIEDDataDetachedCriteria createCIEDDataCriteria() {
		return new CIEDDataDetachedCriteria(createCriteria("cIEDData"));
	}
	
	public BinaryDataDetachedCriteria createBinaryDataCriteria() {
		return new BinaryDataDetachedCriteria(createCriteria("ORM_BinaryData"));
	}
	
	public Observation uniqueObservation(PersistentSession session) {
		return (Observation) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Observation[] listObservation(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Observation[]) list.toArray(new Observation[list.size()]);
	}
}

