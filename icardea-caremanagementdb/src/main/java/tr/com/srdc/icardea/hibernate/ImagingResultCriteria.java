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

public class ImagingResultCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final StringExpression careProvisionCode;
	public final StringExpression labResultCode;
	public final StringExpression labResultText;
	public final StringExpression effectiveTime;
	public final StringExpression labResultValue;
	public final StringExpression labResultValueCodeSystem;
	public final StringExpression mediaType;
	public final StringExpression base64Encoded;
	
	public ImagingResultCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		careProvisionCode = new StringExpression("careProvisionCode", this);
		labResultCode = new StringExpression("labResultCode", this);
		labResultText = new StringExpression("labResultText", this);
		effectiveTime = new StringExpression("effectiveTime", this);
		labResultValue = new StringExpression("labResultValue", this);
		labResultValueCodeSystem = new StringExpression("labResultValueCodeSystem", this);
		mediaType = new StringExpression("mediaType", this);
		base64Encoded = new StringExpression("base64Encoded", this);
	}
	
	public ImagingResultCriteria(PersistentSession session) {
		this(session.createCriteria(ImagingResult.class));
	}
	
	public ImagingResultCriteria() throws PersistentException {
		this(tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession());
	}
	
	public EHRPHRDataCriteria createEHRPHRDataCriteria() {
		return new EHRPHRDataCriteria(createCriteria("eHRPHRData"));
	}
	
	public ImagingResult uniqueImagingResult() {
		return (ImagingResult) super.uniqueResult();
	}
	
	public ImagingResult[] listImagingResult() {
		java.util.List list = super.list();
		return (ImagingResult[]) list.toArray(new ImagingResult[list.size()]);
	}
}

