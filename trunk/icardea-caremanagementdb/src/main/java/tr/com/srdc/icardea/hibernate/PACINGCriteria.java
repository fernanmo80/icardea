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

public class PACINGCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final StringExpression amplitude;
	public final StringExpression pulsewidth;
	public final StringExpression polarity;
	public final StringExpression anode_location_1;
	public final StringExpression anode_location_2;
	public final StringExpression anode_location_3;
	public final StringExpression anode_electrode_1;
	public final StringExpression anode_electrode_2;
	public final StringExpression anode_electrode_3;
	public final StringExpression cathode_location_1;
	public final StringExpression cathode_location_2;
	public final StringExpression cathode_location_3;
	public final StringExpression cathode_electrode_1;
	public final StringExpression cathode_electrode_2;
	public final StringExpression cathode_electrode_3;
	public final StringExpression capture_mode;
	
	public PACINGCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		amplitude = new StringExpression("amplitude", this);
		pulsewidth = new StringExpression("pulsewidth", this);
		polarity = new StringExpression("polarity", this);
		anode_location_1 = new StringExpression("anode_location_1", this);
		anode_location_2 = new StringExpression("anode_location_2", this);
		anode_location_3 = new StringExpression("anode_location_3", this);
		anode_electrode_1 = new StringExpression("anode_electrode_1", this);
		anode_electrode_2 = new StringExpression("anode_electrode_2", this);
		anode_electrode_3 = new StringExpression("anode_electrode_3", this);
		cathode_location_1 = new StringExpression("cathode_location_1", this);
		cathode_location_2 = new StringExpression("cathode_location_2", this);
		cathode_location_3 = new StringExpression("cathode_location_3", this);
		cathode_electrode_1 = new StringExpression("cathode_electrode_1", this);
		cathode_electrode_2 = new StringExpression("cathode_electrode_2", this);
		cathode_electrode_3 = new StringExpression("cathode_electrode_3", this);
		capture_mode = new StringExpression("capture_mode", this);
	}
	
	public PACINGCriteria(PersistentSession session) {
		this(session.createCriteria(PACING.class));
	}
	
	public PACINGCriteria() throws PersistentException {
		this(tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession());
	}
	
	public LEADCHNLSETCriteria createLEADCHNLSETCriteria() {
		return new LEADCHNLSETCriteria(createCriteria("lEADCHNLSET"));
	}
	
	public PACING uniquePACING() {
		return (PACING) super.uniqueResult();
	}
	
	public PACING[] listPACING() {
		java.util.List list = super.list();
		return (PACING[]) list.toArray(new PACING[list.size()]);
	}
}

