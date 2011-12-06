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

public class SHOCKVECTORDetachedCriteria extends AbstractORMDetachedCriteria {
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
	
	public SHOCKVECTORDetachedCriteria() {
		super(tr.com.srdc.icardea.hibernate.SHOCKVECTOR.class, tr.com.srdc.icardea.hibernate.SHOCKVECTORCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		anode_location_1 = new StringExpression("anode_location_1", this.getDetachedCriteria());
		anode_location_2 = new StringExpression("anode_location_2", this.getDetachedCriteria());
		anode_location_3 = new StringExpression("anode_location_3", this.getDetachedCriteria());
		anode_electrode_1 = new StringExpression("anode_electrode_1", this.getDetachedCriteria());
		anode_electrode_2 = new StringExpression("anode_electrode_2", this.getDetachedCriteria());
		anode_electrode_3 = new StringExpression("anode_electrode_3", this.getDetachedCriteria());
		cathode_location_1 = new StringExpression("cathode_location_1", this.getDetachedCriteria());
		cathode_location_2 = new StringExpression("cathode_location_2", this.getDetachedCriteria());
		cathode_location_3 = new StringExpression("cathode_location_3", this.getDetachedCriteria());
		cathode_electrode_1 = new StringExpression("cathode_electrode_1", this.getDetachedCriteria());
		cathode_electrode_2 = new StringExpression("cathode_electrode_2", this.getDetachedCriteria());
		cathode_electrode_3 = new StringExpression("cathode_electrode_3", this.getDetachedCriteria());
	}
	
	public SHOCKVECTORDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, tr.com.srdc.icardea.hibernate.SHOCKVECTORCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		anode_location_1 = new StringExpression("anode_location_1", this.getDetachedCriteria());
		anode_location_2 = new StringExpression("anode_location_2", this.getDetachedCriteria());
		anode_location_3 = new StringExpression("anode_location_3", this.getDetachedCriteria());
		anode_electrode_1 = new StringExpression("anode_electrode_1", this.getDetachedCriteria());
		anode_electrode_2 = new StringExpression("anode_electrode_2", this.getDetachedCriteria());
		anode_electrode_3 = new StringExpression("anode_electrode_3", this.getDetachedCriteria());
		cathode_location_1 = new StringExpression("cathode_location_1", this.getDetachedCriteria());
		cathode_location_2 = new StringExpression("cathode_location_2", this.getDetachedCriteria());
		cathode_location_3 = new StringExpression("cathode_location_3", this.getDetachedCriteria());
		cathode_electrode_1 = new StringExpression("cathode_electrode_1", this.getDetachedCriteria());
		cathode_electrode_2 = new StringExpression("cathode_electrode_2", this.getDetachedCriteria());
		cathode_electrode_3 = new StringExpression("cathode_electrode_3", this.getDetachedCriteria());
	}
	
	public LEADHVCHANNELSETDetachedCriteria createLEADHVCHANNELSETCriteria() {
		return new LEADHVCHANNELSETDetachedCriteria(createCriteria("lEADHVCHANNELSET"));
	}
	
	public SHOCKVECTOR uniqueSHOCKVECTOR(PersistentSession session) {
		return (SHOCKVECTOR) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public SHOCKVECTOR[] listSHOCKVECTOR(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (SHOCKVECTOR[]) list.toArray(new SHOCKVECTOR[list.size()]);
	}
}

