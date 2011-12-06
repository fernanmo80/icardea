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

public class BRADYSETDetachedCriteria extends AbstractORMDetachedCriteria {
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
	
	public BRADYSETDetachedCriteria() {
		super(tr.com.srdc.icardea.hibernate.BRADYSET.class, tr.com.srdc.icardea.hibernate.BRADYSETCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		mode = new StringExpression("mode", this.getDetachedCriteria());
		vendor_mode = new StringExpression("vendor_mode", this.getDetachedCriteria());
		lowrate = new StringExpression("lowrate", this.getDetachedCriteria());
		hystrate = new StringExpression("hystrate", this.getDetachedCriteria());
		night_rate = new StringExpression("night_rate", this.getDetachedCriteria());
		sensor_type = new StringExpression("sensor_type", this.getDetachedCriteria());
		max_tracking_rate = new StringExpression("max_tracking_rate", this.getDetachedCriteria());
		max_sensor_rate = new StringExpression("max_sensor_rate", this.getDetachedCriteria());
		sav_delay_high = new StringExpression("sav_delay_high", this.getDetachedCriteria());
		sav_delay_low = new StringExpression("sav_delay_low", this.getDetachedCriteria());
		pav_delay_high = new StringExpression("pav_delay_high", this.getDetachedCriteria());
		pav_delay_low = new StringExpression("pav_delay_low", this.getDetachedCriteria());
		at_mode_switch_mode = new StringExpression("at_mode_switch_mode", this.getDetachedCriteria());
		at_mode_switch_rate = new StringExpression("at_mode_switch_rate", this.getDetachedCriteria());
	}
	
	public BRADYSETDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, tr.com.srdc.icardea.hibernate.BRADYSETCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		mode = new StringExpression("mode", this.getDetachedCriteria());
		vendor_mode = new StringExpression("vendor_mode", this.getDetachedCriteria());
		lowrate = new StringExpression("lowrate", this.getDetachedCriteria());
		hystrate = new StringExpression("hystrate", this.getDetachedCriteria());
		night_rate = new StringExpression("night_rate", this.getDetachedCriteria());
		sensor_type = new StringExpression("sensor_type", this.getDetachedCriteria());
		max_tracking_rate = new StringExpression("max_tracking_rate", this.getDetachedCriteria());
		max_sensor_rate = new StringExpression("max_sensor_rate", this.getDetachedCriteria());
		sav_delay_high = new StringExpression("sav_delay_high", this.getDetachedCriteria());
		sav_delay_low = new StringExpression("sav_delay_low", this.getDetachedCriteria());
		pav_delay_high = new StringExpression("pav_delay_high", this.getDetachedCriteria());
		pav_delay_low = new StringExpression("pav_delay_low", this.getDetachedCriteria());
		at_mode_switch_mode = new StringExpression("at_mode_switch_mode", this.getDetachedCriteria());
		at_mode_switch_rate = new StringExpression("at_mode_switch_rate", this.getDetachedCriteria());
	}
	
	public SETDetachedCriteria createSETCriteria() {
		return new SETDetachedCriteria(createCriteria("sET"));
	}
	
	public BRADYSET uniqueBRADYSET(PersistentSession session) {
		return (BRADYSET) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public BRADYSET[] listBRADYSET(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (BRADYSET[]) list.toArray(new BRADYSET[list.size()]);
	}
}

