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

public class ObservationCriteria extends AbstractORMCriteria {
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
	
	public ObservationCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		universalServiceIdentifier = new StringExpression("universalServiceIdentifier", this);
		observationDateTime = new StringExpression("observationDateTime", this);
		observationEndDataTime = new StringExpression("observationEndDataTime", this);
		resultRptStatusChangeDateTime = new StringExpression("resultRptStatusChangeDateTime", this);
		resultStatus = new StringExpression("resultStatus", this);
		attendingDoctorID = new StringExpression("attendingDoctorID", this);
		visitID = new StringExpression("visitID", this);
		patientClass = new StringExpression("patientClass", this);
		base64String = new StringExpression("base64String", this);
		abnormalFlags = new StringExpression("abnormalFlags", this);
		equipmentInstanceIdentifier = new StringExpression("equipmentInstanceIdentifier", this);
		fillerOrderNumber = new StringExpression("fillerOrderNumber", this);
	}
	
	public ObservationCriteria(PersistentSession session) {
		this(session.createCriteria(Observation.class));
	}
	
	public ObservationCriteria() throws PersistentException {
		this(tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession());
	}
	
	public SystemCriteria createSystemCriteria() {
		return new SystemCriteria(createCriteria("system"));
	}
	
	public CIEDDataCriteria createCIEDDataCriteria() {
		return new CIEDDataCriteria(createCriteria("cIEDData"));
	}
	
	public BinaryDataCriteria createBinaryDataCriteria() {
		return new BinaryDataCriteria(createCriteria("ORM_BinaryData"));
	}
	
	public Observation uniqueObservation() {
		return (Observation) super.uniqueResult();
	}
	
	public Observation[] listObservation() {
		java.util.List list = super.list();
		return (Observation[]) list.toArray(new Observation[list.size()]);
	}
}

