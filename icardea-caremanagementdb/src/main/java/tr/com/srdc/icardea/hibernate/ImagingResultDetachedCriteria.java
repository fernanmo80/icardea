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

public class ImagingResultDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final StringExpression careProvisionCode;
	public final StringExpression labResultCode;
	public final StringExpression labResultText;
	public final StringExpression effectiveTime;
	public final StringExpression labResultValue;
	public final StringExpression labResultValueCodeSystem;
	public final StringExpression mediaType;
	public final StringExpression base64Encoded;
	
	public ImagingResultDetachedCriteria() {
		super(tr.com.srdc.icardea.hibernate.ImagingResult.class, tr.com.srdc.icardea.hibernate.ImagingResultCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		careProvisionCode = new StringExpression("careProvisionCode", this.getDetachedCriteria());
		labResultCode = new StringExpression("labResultCode", this.getDetachedCriteria());
		labResultText = new StringExpression("labResultText", this.getDetachedCriteria());
		effectiveTime = new StringExpression("effectiveTime", this.getDetachedCriteria());
		labResultValue = new StringExpression("labResultValue", this.getDetachedCriteria());
		labResultValueCodeSystem = new StringExpression("labResultValueCodeSystem", this.getDetachedCriteria());
		mediaType = new StringExpression("mediaType", this.getDetachedCriteria());
		base64Encoded = new StringExpression("base64Encoded", this.getDetachedCriteria());
	}
	
	public ImagingResultDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, tr.com.srdc.icardea.hibernate.ImagingResultCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		careProvisionCode = new StringExpression("careProvisionCode", this.getDetachedCriteria());
		labResultCode = new StringExpression("labResultCode", this.getDetachedCriteria());
		labResultText = new StringExpression("labResultText", this.getDetachedCriteria());
		effectiveTime = new StringExpression("effectiveTime", this.getDetachedCriteria());
		labResultValue = new StringExpression("labResultValue", this.getDetachedCriteria());
		labResultValueCodeSystem = new StringExpression("labResultValueCodeSystem", this.getDetachedCriteria());
		mediaType = new StringExpression("mediaType", this.getDetachedCriteria());
		base64Encoded = new StringExpression("base64Encoded", this.getDetachedCriteria());
	}
	
	public EHRPHRDataDetachedCriteria createEHRPHRDataCriteria() {
		return new EHRPHRDataDetachedCriteria(createCriteria("eHRPHRData"));
	}
	
	public ImagingResult uniqueImagingResult(PersistentSession session) {
		return (ImagingResult) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public ImagingResult[] listImagingResult(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (ImagingResult[]) list.toArray(new ImagingResult[list.size()]);
	}
}

