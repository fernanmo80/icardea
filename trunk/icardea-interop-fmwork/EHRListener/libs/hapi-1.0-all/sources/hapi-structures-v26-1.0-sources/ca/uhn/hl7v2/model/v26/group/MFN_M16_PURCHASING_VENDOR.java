package ca.uhn.hl7v2.model.v26.group;

import ca.uhn.hl7v2.parser.ModelClassFactory;
import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.log.HapiLogFactory;
import ca.uhn.hl7v2.model.v26.segment.*;

import ca.uhn.hl7v2.model.*;
/**
 * <p>Represents the MFN_M16_PURCHASING_VENDOR Group.  A Group is an ordered collection of message 
 * segments that can repeat together or be optionally in/excluded together.
 * This Group contains the following elements: </p>
 * 0: VND (Purchasing Vendor) <b></b><br>
 * 1: MFN_M16_PACKAGING (a Group object) <b>optional repeating</b><br>
 */
public class MFN_M16_PURCHASING_VENDOR extends AbstractGroup {

	/** 
	 * Creates a new MFN_M16_PURCHASING_VENDOR Group.
	 */
	public MFN_M16_PURCHASING_VENDOR(Group parent, ModelClassFactory factory) {
	   super(parent, factory);
	   try {
	      this.add(VND.class, true, false);
	      this.add(MFN_M16_PACKAGING.class, false, true);
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error creating MFN_M16_PURCHASING_VENDOR - this is probably a bug in the source code generator.", e);
	   }
	}

	/**
	 * Returns VND (Purchasing Vendor) - creates it if necessary
	 */
	public VND getVND() { 
	   VND ret = null;
	   try {
	      ret = (VND)this.get("VND");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns  first repetition of MFN_M16_PACKAGING (a Group object) - creates it if necessary
	 */
	public MFN_M16_PACKAGING getPACKAGING() { 
	   MFN_M16_PACKAGING ret = null;
	   try {
	      ret = (MFN_M16_PACKAGING)this.get("PACKAGING");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns a specific repetition of MFN_M16_PACKAGING
	 * (a Group object) - creates it if necessary
	 * @throws HL7Exception if the repetition requested is more than one 
	 *     greater than the number of existing repetitions.
	 */
	public MFN_M16_PACKAGING getPACKAGING(int rep) throws HL7Exception { 
	   return (MFN_M16_PACKAGING)this.get("PACKAGING", rep);
	}

	/** 
	 * Returns the number of existing repetitions of MFN_M16_PACKAGING 
	 */ 
	public int getPACKAGINGReps() { 
	    int reps = -1; 
	    try { 
	        reps = this.getAll("PACKAGING").length; 
	    } catch (HL7Exception e) { 
	        String message = "Unexpected error accessing data - this is probably a bug in the source code generator."; 
	        HapiLogFactory.getHapiLog(this.getClass()).error(message, e); 
	        throw new RuntimeException(message);
	    } 
	    return reps; 
	} 

	/**
	 * Inserts a specific repetition of MFN_M16_PACKAGING
	 * (a Group object)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public void  insertPACKAGING(MFN_M16_PACKAGING structure, int rep) throws HL7Exception { 
	   super.insertRepetition( structure, rep);
	}

	/**
	 * Inserts a specific repetition of MFN_M16_PACKAGING
	 * (a Group object)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public MFN_M16_PACKAGING insertPACKAGING(int rep) throws HL7Exception { 
	   return (MFN_M16_PACKAGING)super.insertRepetition("PACKAGING", rep);
	}

	/**
	 * Removes a specific repetition of MFN_M16_PACKAGING
	 * (a Group object)
	 * @see AbstractGroup#insertremoveRepetition(String, int) 
	 */
	public MFN_M16_PACKAGING removePACKAGING(int rep) throws HL7Exception { 
	   return (MFN_M16_PACKAGING)super.removeRepetition("PACKAGING", rep);
	}

}
