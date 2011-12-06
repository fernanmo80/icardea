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

public class SHOCKVECTORCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
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
	
	public SHOCKVECTORCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
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
	}
	
	public SHOCKVECTORCriteria(PersistentSession session) {
		this(session.createCriteria(SHOCKVECTOR.class));
	}
	
	public SHOCKVECTORCriteria() throws PersistentException {
		this(tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().getSession());
	}
	
	public LEADHVCHANNELSETCriteria createLEADHVCHANNELSETCriteria() {
		return new LEADHVCHANNELSETCriteria(createCriteria("lEADHVCHANNELSET"));
	}
	
	public SHOCKVECTOR uniqueSHOCKVECTOR() {
		return (SHOCKVECTOR) super.uniqueResult();
	}
	
	public SHOCKVECTOR[] listSHOCKVECTOR() {
		java.util.List list = super.list();
		return (SHOCKVECTOR[]) list.toArray(new SHOCKVECTOR[list.size()]);
	}
}

