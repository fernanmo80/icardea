package ca.uhn.hl7v2.model.v26.group;

import ca.uhn.hl7v2.parser.ModelClassFactory;
import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.log.HapiLogFactory;
import ca.uhn.hl7v2.model.v26.segment.*;

import ca.uhn.hl7v2.model.*;
/**
 * <p>Represents the RQP_I04_PROVIDER Group.  A Group is an ordered collection of message 
 * segments that can repeat together or be optionally in/excluded together.
 * This Group contains the following elements: </p>
 * 0: PRD (Provider Data) <b></b><br>
 * 1: CTD (Contact Data) <b>optional repeating</b><br>
 */
public class RQP_I04_PROVIDER extends AbstractGroup {

	/** 
	 * Creates a new RQP_I04_PROVIDER Group.
	 */
	public RQP_I04_PROVIDER(Group parent, ModelClassFactory factory) {
	   super(parent, factory);
	   try {
	      this.add(PRD.class, true, false);
	      this.add(CTD.class, false, true);
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error creating RQP_I04_PROVIDER - this is probably a bug in the source code generator.", e);
	   }
	}

	/**
	 * Returns PRD (Provider Data) - creates it if necessary
	 */
	public PRD getPRD() { 
	   PRD ret = null;
	   try {
	      ret = (PRD)this.get("PRD");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns  first repetition of CTD (Contact Data) - creates it if necessary
	 */
	public CTD getCTD() { 
	   CTD ret = null;
	   try {
	      ret = (CTD)this.get("CTD");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns a specific repetition of CTD
	 * (Contact Data) - creates it if necessary
	 * @throws HL7Exception if the repetition requested is more than one 
	 *     greater than the number of existing repetitions.
	 */
	public CTD getCTD(int rep) throws HL7Exception { 
	   return (CTD)this.get("CTD", rep);
	}

	/** 
	 * Returns the number of existing repetitions of CTD 
	 */ 
	public int getCTDReps() { 
	    int reps = -1; 
	    try { 
	        reps = this.getAll("CTD").length; 
	    } catch (HL7Exception e) { 
	        String message = "Unexpected error accessing data - this is probably a bug in the source code generator."; 
	        HapiLogFactory.getHapiLog(this.getClass()).error(message, e); 
	        throw new RuntimeException(message);
	    } 
	    return reps; 
	} 

	/**
	 * Inserts a specific repetition of CTD
	 * (Contact Data)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public void  insertCTD(CTD structure, int rep) throws HL7Exception { 
	   super.insertRepetition( structure, rep);
	}

	/**
	 * Inserts a specific repetition of CTD
	 * (Contact Data)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public CTD insertCTD(int rep) throws HL7Exception { 
	   return (CTD)super.insertRepetition("CTD", rep);
	}

	/**
	 * Removes a specific repetition of CTD
	 * (Contact Data)
	 * @see AbstractGroup#insertremoveRepetition(String, int) 
	 */
	public CTD removeCTD(int rep) throws HL7Exception { 
	   return (CTD)super.removeRepetition("CTD", rep);
	}

}
