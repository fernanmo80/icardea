package ca.uhn.hl7v2.model.v26.group;

import ca.uhn.hl7v2.parser.ModelClassFactory;
import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.log.HapiLogFactory;
import ca.uhn.hl7v2.model.v26.segment.*;

import ca.uhn.hl7v2.model.*;
/**
 * <p>Represents the EHC_E15_ADJUSTMENT_PAYEE Group.  A Group is an ordered collection of message 
 * segments that can repeat together or be optionally in/excluded together.
 * This Group contains the following elements: </p>
 * 0: ADJ (Adjustment) <b></b><br>
 * 1: ROL (Role) <b>optional </b><br>
 */
public class EHC_E15_ADJUSTMENT_PAYEE extends AbstractGroup {

	/** 
	 * Creates a new EHC_E15_ADJUSTMENT_PAYEE Group.
	 */
	public EHC_E15_ADJUSTMENT_PAYEE(Group parent, ModelClassFactory factory) {
	   super(parent, factory);
	   try {
	      this.add(ADJ.class, true, false);
	      this.add(ROL.class, false, false);
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error creating EHC_E15_ADJUSTMENT_PAYEE - this is probably a bug in the source code generator.", e);
	   }
	}

	/**
	 * Returns ADJ (Adjustment) - creates it if necessary
	 */
	public ADJ getADJ() { 
	   ADJ ret = null;
	   try {
	      ret = (ADJ)this.get("ADJ");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns ROL (Role) - creates it if necessary
	 */
	public ROL getROL() { 
	   ROL ret = null;
	   try {
	      ret = (ROL)this.get("ROL");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

}
