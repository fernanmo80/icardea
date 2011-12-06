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

public class ZONECriteria extends AbstractORMCriteria {
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
	
	public ZONECriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		type = new StringExpression("type", this);
		vendor_type = new StringExpression("vendor_type", this);
		status = new StringExpression("status", this);
		detection_interval = new StringExpression("detection_interval", this);
		detection_beats_numerator = new StringExpression("detection_beats_numerator", this);
		detection_beats_denominator = new StringExpression("detection_beats_denominator", this);
		detection_details = new StringExpression("detection_details", this);
		type_atp_1 = new StringExpression("type_atp_1", this);
		type_atp_2 = new StringExpression("type_atp_2", this);
		type_atp_3 = new StringExpression("type_atp_3", this);
		type_atp_4 = new StringExpression("type_atp_4", this);
		type_atp_5 = new StringExpression("type_atp_5", this);
		num_atp_seqs_1 = new StringExpression("num_atp_seqs_1", this);
		num_atp_seqs_2 = new StringExpression("num_atp_seqs_2", this);
		num_atp_seqs_3 = new StringExpression("num_atp_seqs_3", this);
		num_atp_seqs_4 = new StringExpression("num_atp_seqs_4", this);
		num_atp_seqs_5 = new StringExpression("num_atp_seqs_5", this);
		shock_energy_1 = new StringExpression("shock_energy_1", this);
		shock_energy_2 = new StringExpression("shock_energy_2", this);
		shock_energy_3 = new StringExpression("shock_energy_3", this);
		shock_energy_4 = new StringExpression("shock_energy_4", this);
		shock_energy_5 = new StringExpression("shock_energy_5", this);
		num_shocks_1 = new StringExpression("num_shocks_1", this);
		num_shocks_2 = new StringExpression("num_shocks_2", this);
		num_shocks_3 = new StringExpression("num_shocks_3", this);
		num_shocks_4 = new StringExpression("num_shocks_4", this);
		num_shocks_5 = new StringExpression("num_shocks_5", this);
		subID = new IntegerExpression("subID", this);
	}
	
	public ZONECriteria(PersistentSession session) {
		this(session.createCriteria(ZONE.class));
	}
	
	public ZONECriteria() throws PersistentException {
		this(tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession());
	}
	
	public SETCriteria createSETCriteria() {
		return new SETCriteria(createCriteria("sET"));
	}
	
	public ZONE uniqueZONE() {
		return (ZONE) super.uniqueResult();
	}
	
	public ZONE[] listZONE() {
		java.util.List list = super.list();
		return (ZONE[]) list.toArray(new ZONE[list.size()]);
	}
}

