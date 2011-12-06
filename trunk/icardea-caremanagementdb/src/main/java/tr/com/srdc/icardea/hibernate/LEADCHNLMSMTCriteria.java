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

public class LEADCHNLMSMTCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final StringExpression chamber;
	public final StringExpression dtm_start;
	public final StringExpression dtm_end;
	public final StringExpression lead_channel_status;
	public final IntegerExpression subID;
	public final StringExpression dtm;
	
	public LEADCHNLMSMTCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		chamber = new StringExpression("chamber", this);
		dtm_start = new StringExpression("dtm_start", this);
		dtm_end = new StringExpression("dtm_end", this);
		lead_channel_status = new StringExpression("lead_channel_status", this);
		subID = new IntegerExpression("subID", this);
		dtm = new StringExpression("dtm", this);
	}
	
	public LEADCHNLMSMTCriteria(PersistentSession session) {
		this(session.createCriteria(LEADCHNLMSMT.class));
	}
	
	public LEADCHNLMSMTCriteria() throws PersistentException {
		this(tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession());
	}
	
	public MSMTCriteria createMSMTCriteria() {
		return new MSMTCriteria(createCriteria("mSMT"));
	}
	
	public SENSINGMSMTCriteria createSENSINGMSMTCriteria() {
		return new SENSINGMSMTCriteria(createCriteria("sENSINGMSMT"));
	}
	
	public PACINGTHRESHOLDCriteria createPACINGTHRESHOLDCriteria() {
		return new PACINGTHRESHOLDCriteria(createCriteria("pACINGTHRESHOLD"));
	}
	
	public IMPEDANCECriteria createIMPEDANCECriteria() {
		return new IMPEDANCECriteria(createCriteria("iMPEDANCE"));
	}
	
	public LEADCHNLMSMT uniqueLEADCHNLMSMT() {
		return (LEADCHNLMSMT) super.uniqueResult();
	}
	
	public LEADCHNLMSMT[] listLEADCHNLMSMT() {
		java.util.List list = super.list();
		return (LEADCHNLMSMT[]) list.toArray(new LEADCHNLMSMT[list.size()]);
	}
}

