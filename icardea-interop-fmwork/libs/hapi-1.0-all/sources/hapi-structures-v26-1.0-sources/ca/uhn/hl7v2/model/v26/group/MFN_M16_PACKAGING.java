package ca.uhn.hl7v2.model.v26.group;

import ca.uhn.hl7v2.parser.ModelClassFactory;
import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.log.HapiLogFactory;
import ca.uhn.hl7v2.model.v26.segment.*;

import ca.uhn.hl7v2.model.*;
/**
 * <p>Represents the MFN_M16_PACKAGING Group.  A Group is an ordered collection of message 
 * segments that can repeat together or be optionally in/excluded together.
 * This Group contains the following elements: </p>
 * 0: PKG (Item Packaging) <b></b><br>
 * 1: PCE (Patient Charge Cost Center Exceptions) <b>optional repeating</b><br>
 */
public class MFN_M16_PACKAGING extends AbstractGroup {

	/** 
	 * Creates a new MFN_M16_PACKAGING Group.
	 */
	public MFN_M16_PACKAGING(Group parent, ModelClassFactory factory) {
	   super(parent, factory);
	   try {
	      this.add(PKG.class, true, false);
	      this.add(PCE.class, false, true);
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error creating MFN_M16_PACKAGING - this is probably a bug in the source code generator.", e);
	   }
	}

	/**
	 * Returns PKG (Item Packaging) - creates it if necessary
	 */
	public PKG getPKG() { 
	   PKG ret = null;
	   try {
	      ret = (PKG)this.get("PKG");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns  first repetition of PCE (Patient Charge Cost Center Exceptions) - creates it if necessary
	 */
	public PCE getPCE() { 
	   PCE ret = null;
	   try {
	      ret = (PCE)this.get("PCE");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns a specific repetition of PCE
	 * (Patient Charge Cost Center Exceptions) - creates it if necessary
	 * @throws HL7Exception if the repetition requested is more than one 
	 *     greater than the number of existing repetitions.
	 */
	public PCE getPCE(int rep) throws HL7Exception { 
	   return (PCE)this.get("PCE", rep);
	}

	/** 
	 * Returns the number of existing repetitions of PCE 
	 */ 
	public int getPCEReps() { 
	    int reps = -1; 
	    try { 
	        reps = this.getAll("PCE").length; 
	    } catch (HL7Exception e) { 
	        String message = "Unexpected error accessing data - this is probably a bug in the source code generator."; 
	        HapiLogFactory.getHapiLog(this.getClass()).error(message, e); 
	        throw new RuntimeException(message);
	    } 
	    return reps; 
	} 

	/**
	 * Inserts a specific repetition of PCE
	 * (Patient Charge Cost Center Exceptions)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public void  insertPCE(PCE structure, int rep) throws HL7Exception { 
	   super.insertRepetition( structure, rep);
	}

	/**
	 * Inserts a specific repetition of PCE
	 * (Patient Charge Cost Center Exceptions)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public PCE insertPCE(int rep) throws HL7Exception { 
	   return (PCE)super.insertRepetition("PCE", rep);
	}

	/**
	 * Removes a specific repetition of PCE
	 * (Patient Charge Cost Center Exceptions)
	 * @see AbstractGroup#insertremoveRepetition(String, int) 
	 */
	public PCE removePCE(int rep) throws HL7Exception { 
	   return (PCE)super.removeRepetition("PCE", rep);
	}

}
