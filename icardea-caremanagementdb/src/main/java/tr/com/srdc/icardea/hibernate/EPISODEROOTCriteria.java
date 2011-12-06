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

public class EPISODEROOTCriteria extends AbstractORMCriteria {
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
	
	public EPISODEROOTCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		identifier = new StringExpression("identifier", this);
		dtm = new StringExpression("dtm", this);
		atrial_interval_at_detection = new StringExpression("atrial_interval_at_detection", this);
		atrial_interval_at_termination = new StringExpression("atrial_interval_at_termination", this);
		ventricular_interval_at_detection = new StringExpression("ventricular_interval_at_detection", this);
		ventricular_interval_at_termination = new StringExpression("ventricular_interval_at_termination", this);
		detection_therapy_details = new StringExpression("detection_therapy_details", this);
		therapy_result = new StringExpression("therapy_result", this);
		duration = new StringExpression("duration", this);
		subID = new IntegerExpression("subID", this);
		type = new StringExpression("type", this);
		type_induced = new StringExpression("type_induced", this);
		vendor_type = new StringExpression("vendor_type", this);
	}
	
	public EPISODEROOTCriteria(PersistentSession session) {
		this(session.createCriteria(EPISODEROOT.class));
	}
	
	public EPISODEROOTCriteria() throws PersistentException {
		this(tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession());
	}
	
	public SystemCriteria createSystemCriteria() {
		return new SystemCriteria(createCriteria("system"));
	}
	
	public EPISODEROOT uniqueEPISODEROOT() {
		return (EPISODEROOT) super.uniqueResult();
	}
	
	public EPISODEROOT[] listEPISODEROOT() {
		java.util.List list = super.list();
		return (EPISODEROOT[]) list.toArray(new EPISODEROOT[list.size()]);
	}
}

