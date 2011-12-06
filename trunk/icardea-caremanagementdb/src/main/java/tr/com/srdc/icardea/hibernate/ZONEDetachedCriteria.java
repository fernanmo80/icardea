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

public class ZONEDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final StringExpression type;
	public final StringExpression vendor_type;
	public final StringExpression status;
	public final StringExpression detection_interval;
	public final StringExpression detection_beats_numerator;
	public final StringExpression detection_beats_denominator;
	public final StringExpression detection_details;
	public final StringExpression type_atp_1;
	public final StringExpression type_atp_2;
	public final StringExpression type_atp_3;
	public final StringExpression type_atp_4;
	public final StringExpression type_atp_5;
	public final StringExpression num_atp_seqs_1;
	public final StringExpression num_atp_seqs_2;
	public final StringExpression num_atp_seqs_3;
	public final StringExpression num_atp_seqs_4;
	public final StringExpression num_atp_seqs_5;
	public final StringExpression shock_energy_1;
	public final StringExpression shock_energy_2;
	public final StringExpression shock_energy_3;
	public final StringExpression shock_energy_4;
	public final StringExpression shock_energy_5;
	public final StringExpression num_shocks_1;
	public final StringExpression num_shocks_2;
	public final StringExpression num_shocks_3;
	public final StringExpression num_shocks_4;
	public final StringExpression num_shocks_5;
	public final IntegerExpression subID;
	
	public ZONEDetachedCriteria() {
		super(tr.com.srdc.icardea.hibernate.ZONE.class, tr.com.srdc.icardea.hibernate.ZONECriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		type = new StringExpression("type", this.getDetachedCriteria());
		vendor_type = new StringExpression("vendor_type", this.getDetachedCriteria());
		status = new StringExpression("status", this.getDetachedCriteria());
		detection_interval = new StringExpression("detection_interval", this.getDetachedCriteria());
		detection_beats_numerator = new StringExpression("detection_beats_numerator", this.getDetachedCriteria());
		detection_beats_denominator = new StringExpression("detection_beats_denominator", this.getDetachedCriteria());
		detection_details = new StringExpression("detection_details", this.getDetachedCriteria());
		type_atp_1 = new StringExpression("type_atp_1", this.getDetachedCriteria());
		type_atp_2 = new StringExpression("type_atp_2", this.getDetachedCriteria());
		type_atp_3 = new StringExpression("type_atp_3", this.getDetachedCriteria());
		type_atp_4 = new StringExpression("type_atp_4", this.getDetachedCriteria());
		type_atp_5 = new StringExpression("type_atp_5", this.getDetachedCriteria());
		num_atp_seqs_1 = new StringExpression("num_atp_seqs_1", this.getDetachedCriteria());
		num_atp_seqs_2 = new StringExpression("num_atp_seqs_2", this.getDetachedCriteria());
		num_atp_seqs_3 = new StringExpression("num_atp_seqs_3", this.getDetachedCriteria());
		num_atp_seqs_4 = new StringExpression("num_atp_seqs_4", this.getDetachedCriteria());
		num_atp_seqs_5 = new StringExpression("num_atp_seqs_5", this.getDetachedCriteria());
		shock_energy_1 = new StringExpression("shock_energy_1", this.getDetachedCriteria());
		shock_energy_2 = new StringExpression("shock_energy_2", this.getDetachedCriteria());
		shock_energy_3 = new StringExpression("shock_energy_3", this.getDetachedCriteria());
		shock_energy_4 = new StringExpression("shock_energy_4", this.getDetachedCriteria());
		shock_energy_5 = new StringExpression("shock_energy_5", this.getDetachedCriteria());
		num_shocks_1 = new StringExpression("num_shocks_1", this.getDetachedCriteria());
		num_shocks_2 = new StringExpression("num_shocks_2", this.getDetachedCriteria());
		num_shocks_3 = new StringExpression("num_shocks_3", this.getDetachedCriteria());
		num_shocks_4 = new StringExpression("num_shocks_4", this.getDetachedCriteria());
		num_shocks_5 = new StringExpression("num_shocks_5", this.getDetachedCriteria());
		subID = new IntegerExpression("subID", this.getDetachedCriteria());
	}
	
	public ZONEDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, tr.com.srdc.icardea.hibernate.ZONECriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		type = new StringExpression("type", this.getDetachedCriteria());
		vendor_type = new StringExpression("vendor_type", this.getDetachedCriteria());
		status = new StringExpression("status", this.getDetachedCriteria());
		detection_interval = new StringExpression("detection_interval", this.getDetachedCriteria());
		detection_beats_numerator = new StringExpression("detection_beats_numerator", this.getDetachedCriteria());
		detection_beats_denominator = new StringExpression("detection_beats_denominator", this.getDetachedCriteria());
		detection_details = new StringExpression("detection_details", this.getDetachedCriteria());
		type_atp_1 = new StringExpression("type_atp_1", this.getDetachedCriteria());
		type_atp_2 = new StringExpression("type_atp_2", this.getDetachedCriteria());
		type_atp_3 = new StringExpression("type_atp_3", this.getDetachedCriteria());
		type_atp_4 = new StringExpression("type_atp_4", this.getDetachedCriteria());
		type_atp_5 = new StringExpression("type_atp_5", this.getDetachedCriteria());
		num_atp_seqs_1 = new StringExpression("num_atp_seqs_1", this.getDetachedCriteria());
		num_atp_seqs_2 = new StringExpression("num_atp_seqs_2", this.getDetachedCriteria());
		num_atp_seqs_3 = new StringExpression("num_atp_seqs_3", this.getDetachedCriteria());
		num_atp_seqs_4 = new StringExpression("num_atp_seqs_4", this.getDetachedCriteria());
		num_atp_seqs_5 = new StringExpression("num_atp_seqs_5", this.getDetachedCriteria());
		shock_energy_1 = new StringExpression("shock_energy_1", this.getDetachedCriteria());
		shock_energy_2 = new StringExpression("shock_energy_2", this.getDetachedCriteria());
		shock_energy_3 = new StringExpression("shock_energy_3", this.getDetachedCriteria());
		shock_energy_4 = new StringExpression("shock_energy_4", this.getDetachedCriteria());
		shock_energy_5 = new StringExpression("shock_energy_5", this.getDetachedCriteria());
		num_shocks_1 = new StringExpression("num_shocks_1", this.getDetachedCriteria());
		num_shocks_2 = new StringExpression("num_shocks_2", this.getDetachedCriteria());
		num_shocks_3 = new StringExpression("num_shocks_3", this.getDetachedCriteria());
		num_shocks_4 = new StringExpression("num_shocks_4", this.getDetachedCriteria());
		num_shocks_5 = new StringExpression("num_shocks_5", this.getDetachedCriteria());
		subID = new IntegerExpression("subID", this.getDetachedCriteria());
	}
	
	public SETDetachedCriteria createSETCriteria() {
		return new SETDetachedCriteria(createCriteria("sET"));
	}
	
	public ZONE uniqueZONE(PersistentSession session) {
		return (ZONE) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public ZONE[] listZONE(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (ZONE[]) list.toArray(new ZONE[list.size()]);
	}
}

