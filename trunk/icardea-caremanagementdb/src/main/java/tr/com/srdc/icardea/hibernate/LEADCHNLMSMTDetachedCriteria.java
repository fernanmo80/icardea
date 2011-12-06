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

public class LEADCHNLMSMTDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final StringExpression chamber;
	public final StringExpression dtm_start;
	public final StringExpression dtm_end;
	public final StringExpression lead_channel_status;
	public final IntegerExpression subID;
	public final StringExpression dtm;
	
	public LEADCHNLMSMTDetachedCriteria() {
		super(tr.com.srdc.icardea.hibernate.LEADCHNLMSMT.class, tr.com.srdc.icardea.hibernate.LEADCHNLMSMTCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		chamber = new StringExpression("chamber", this.getDetachedCriteria());
		dtm_start = new StringExpression("dtm_start", this.getDetachedCriteria());
		dtm_end = new StringExpression("dtm_end", this.getDetachedCriteria());
		lead_channel_status = new StringExpression("lead_channel_status", this.getDetachedCriteria());
		subID = new IntegerExpression("subID", this.getDetachedCriteria());
		dtm = new StringExpression("dtm", this.getDetachedCriteria());
	}
	
	public LEADCHNLMSMTDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, tr.com.srdc.icardea.hibernate.LEADCHNLMSMTCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		chamber = new StringExpression("chamber", this.getDetachedCriteria());
		dtm_start = new StringExpression("dtm_start", this.getDetachedCriteria());
		dtm_end = new StringExpression("dtm_end", this.getDetachedCriteria());
		lead_channel_status = new StringExpression("lead_channel_status", this.getDetachedCriteria());
		subID = new IntegerExpression("subID", this.getDetachedCriteria());
		dtm = new StringExpression("dtm", this.getDetachedCriteria());
	}
	
	public MSMTDetachedCriteria createMSMTCriteria() {
		return new MSMTDetachedCriteria(createCriteria("mSMT"));
	}
	
	public SENSINGMSMTDetachedCriteria createSENSINGMSMTCriteria() {
		return new SENSINGMSMTDetachedCriteria(createCriteria("sENSINGMSMT"));
	}
	
	public PACINGTHRESHOLDDetachedCriteria createPACINGTHRESHOLDCriteria() {
		return new PACINGTHRESHOLDDetachedCriteria(createCriteria("pACINGTHRESHOLD"));
	}
	
	public IMPEDANCEDetachedCriteria createIMPEDANCECriteria() {
		return new IMPEDANCEDetachedCriteria(createCriteria("iMPEDANCE"));
	}
	
	public LEADCHNLMSMT uniqueLEADCHNLMSMT(PersistentSession session) {
		return (LEADCHNLMSMT) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public LEADCHNLMSMT[] listLEADCHNLMSMT(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (LEADCHNLMSMT[]) list.toArray(new LEADCHNLMSMT[list.size()]);
	}
}

