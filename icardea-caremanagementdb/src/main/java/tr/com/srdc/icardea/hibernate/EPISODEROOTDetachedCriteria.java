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

public class EPISODEROOTDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final StringExpression identifier;
	public final StringExpression dtm;
	public final StringExpression atrial_interval_at_detection;
	public final StringExpression atrial_interval_at_termination;
	public final StringExpression ventricular_interval_at_detection;
	public final StringExpression ventricular_interval_at_termination;
	public final StringExpression detection_therapy_details;
	public final StringExpression therapy_result;
	public final StringExpression duration;
	public final IntegerExpression subID;
	public final StringExpression type;
	public final StringExpression type_induced;
	public final StringExpression vendor_type;
	
	public EPISODEROOTDetachedCriteria() {
		super(tr.com.srdc.icardea.hibernate.EPISODEROOT.class, tr.com.srdc.icardea.hibernate.EPISODEROOTCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		identifier = new StringExpression("identifier", this.getDetachedCriteria());
		dtm = new StringExpression("dtm", this.getDetachedCriteria());
		atrial_interval_at_detection = new StringExpression("atrial_interval_at_detection", this.getDetachedCriteria());
		atrial_interval_at_termination = new StringExpression("atrial_interval_at_termination", this.getDetachedCriteria());
		ventricular_interval_at_detection = new StringExpression("ventricular_interval_at_detection", this.getDetachedCriteria());
		ventricular_interval_at_termination = new StringExpression("ventricular_interval_at_termination", this.getDetachedCriteria());
		detection_therapy_details = new StringExpression("detection_therapy_details", this.getDetachedCriteria());
		therapy_result = new StringExpression("therapy_result", this.getDetachedCriteria());
		duration = new StringExpression("duration", this.getDetachedCriteria());
		subID = new IntegerExpression("subID", this.getDetachedCriteria());
		type = new StringExpression("type", this.getDetachedCriteria());
		type_induced = new StringExpression("type_induced", this.getDetachedCriteria());
		vendor_type = new StringExpression("vendor_type", this.getDetachedCriteria());
	}
	
	public EPISODEROOTDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, tr.com.srdc.icardea.hibernate.EPISODEROOTCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		identifier = new StringExpression("identifier", this.getDetachedCriteria());
		dtm = new StringExpression("dtm", this.getDetachedCriteria());
		atrial_interval_at_detection = new StringExpression("atrial_interval_at_detection", this.getDetachedCriteria());
		atrial_interval_at_termination = new StringExpression("atrial_interval_at_termination", this.getDetachedCriteria());
		ventricular_interval_at_detection = new StringExpression("ventricular_interval_at_detection", this.getDetachedCriteria());
		ventricular_interval_at_termination = new StringExpression("ventricular_interval_at_termination", this.getDetachedCriteria());
		detection_therapy_details = new StringExpression("detection_therapy_details", this.getDetachedCriteria());
		therapy_result = new StringExpression("therapy_result", this.getDetachedCriteria());
		duration = new StringExpression("duration", this.getDetachedCriteria());
		subID = new IntegerExpression("subID", this.getDetachedCriteria());
		type = new StringExpression("type", this.getDetachedCriteria());
		type_induced = new StringExpression("type_induced", this.getDetachedCriteria());
		vendor_type = new StringExpression("vendor_type", this.getDetachedCriteria());
	}
	
	public SystemDetachedCriteria createSystemCriteria() {
		return new SystemDetachedCriteria(createCriteria("system"));
	}
	
	public EPISODEROOT uniqueEPISODEROOT(PersistentSession session) {
		return (EPISODEROOT) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public EPISODEROOT[] listEPISODEROOT(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (EPISODEROOT[]) list.toArray(new EPISODEROOT[list.size()]);
	}
}

