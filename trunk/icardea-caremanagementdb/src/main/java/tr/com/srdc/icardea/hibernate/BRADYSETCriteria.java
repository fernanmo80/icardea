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

public class BRADYSETCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final StringExpression mode;
	public final StringExpression vendor_mode;
	public final StringExpression lowrate;
	public final StringExpression hystrate;
	public final StringExpression night_rate;
	public final StringExpression sensor_type;
	public final StringExpression max_tracking_rate;
	public final StringExpression max_sensor_rate;
	public final StringExpression sav_delay_high;
	public final StringExpression sav_delay_low;
	public final StringExpression pav_delay_high;
	public final StringExpression pav_delay_low;
	public final StringExpression at_mode_switch_mode;
	public final StringExpression at_mode_switch_rate;
	
	public BRADYSETCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		mode = new StringExpression("mode", this);
		vendor_mode = new StringExpression("vendor_mode", this);
		lowrate = new StringExpression("lowrate", this);
		hystrate = new StringExpression("hystrate", this);
		night_rate = new StringExpression("night_rate", this);
		sensor_type = new StringExpression("sensor_type", this);
		max_tracking_rate = new StringExpression("max_tracking_rate", this);
		max_sensor_rate = new StringExpression("max_sensor_rate", this);
		sav_delay_high = new StringExpression("sav_delay_high", this);
		sav_delay_low = new StringExpression("sav_delay_low", this);
		pav_delay_high = new StringExpression("pav_delay_high", this);
		pav_delay_low = new StringExpression("pav_delay_low", this);
		at_mode_switch_mode = new StringExpression("at_mode_switch_mode", this);
		at_mode_switch_rate = new StringExpression("at_mode_switch_rate", this);
	}
	
	public BRADYSETCriteria(PersistentSession session) {
		this(session.createCriteria(BRADYSET.class));
	}
	
	public BRADYSETCriteria() throws PersistentException {
		this(tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession());
	}
	
	public SETCriteria createSETCriteria() {
		return new SETCriteria(createCriteria("sET"));
	}
	
	public BRADYSET uniqueBRADYSET() {
		return (BRADYSET) super.uniqueResult();
	}
	
	public BRADYSET[] listBRADYSET() {
		java.util.List list = super.list();
		return (BRADYSET[]) list.toArray(new BRADYSET[list.size()]);
	}
}

