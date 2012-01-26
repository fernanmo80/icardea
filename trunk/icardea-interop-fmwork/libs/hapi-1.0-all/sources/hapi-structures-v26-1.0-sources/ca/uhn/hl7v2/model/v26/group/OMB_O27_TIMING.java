package ca.uhn.hl7v2.model.v26.group;

import ca.uhn.hl7v2.parser.ModelClassFactory;
import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.log.HapiLogFactory;
import ca.uhn.hl7v2.model.v26.segment.*;

import ca.uhn.hl7v2.model.*;
/**
 * <p>Represents the OMB_O27_TIMING Group.  A Group is an ordered collection of message 
 * segments that can repeat together or be optionally in/excluded together.
 * This Group contains the following elements: </p>
 * 0: TQ1 (Timing/Quantity) <b></b><br>
 * 1: TQ2 (Timing/Quantity Relationship) <b>optional repeating</b><br>
 */
public class OMB_O27_TIMING extends AbstractGroup {

	/** 
	 * Creates a new OMB_O27_TIMING Group.
	 */
	public OMB_O27_TIMING(Group parent, ModelClassFactory factory) {
	   super(parent, factory);
	   try {
	      this.add(TQ1.class, true, false);
	      this.add(TQ2.class, false, true);
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error creating OMB_O27_TIMING - this is probably a bug in the source code generator.", e);
	   }
	}

	/**
	 * Returns TQ1 (Timing/Quantity) - creates it if necessary
	 */
	public TQ1 getTQ1() { 
	   TQ1 ret = null;
	   try {
	      ret = (TQ1)this.get("TQ1");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns  first repetition of TQ2 (Timing/Quantity Relationship) - creates it if necessary
	 */
	public TQ2 getTQ2() { 
	   TQ2 ret = null;
	   try {
	      ret = (TQ2)this.get("TQ2");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns a specific repetition of TQ2
	 * (Timing/Quantity Relationship) - creates it if necessary
	 * @throws HL7Exception if the repetition requested is more than one 
	 *     greater than the number of existing repetitions.
	 */
	public TQ2 getTQ2(int rep) throws HL7Exception { 
	   return (TQ2)this.get("TQ2", rep);
	}

	/** 
	 * Returns the number of existing repetitions of TQ2 
	 */ 
	public int getTQ2Reps() { 
	    int reps = -1; 
	    try { 
	        reps = this.getAll("TQ2").length; 
	    } catch (HL7Exception e) { 
	        String message = "Unexpected error accessing data - this is probably a bug in the source code generator."; 
	        HapiLogFactory.getHapiLog(this.getClass()).error(message, e); 
	        throw new RuntimeException(message);
	    } 
	    return reps; 
	} 

	/**
	 * Inserts a specific repetition of TQ2
	 * (Timing/Quantity Relationship)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public void  insertTQ2(TQ2 structure, int rep) throws HL7Exception { 
	   super.insertRepetition( structure, rep);
	}

	/**
	 * Inserts a specific repetition of TQ2
	 * (Timing/Quantity Relationship)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public TQ2 insertTQ2(int rep) throws HL7Exception { 
	   return (TQ2)super.insertRepetition("TQ2", rep);
	}

	/**
	 * Removes a specific repetition of TQ2
	 * (Timing/Quantity Relationship)
	 * @see AbstractGroup#insertremoveRepetition(String, int) 
	 */
	public TQ2 removeTQ2(int rep) throws HL7Exception { 
	   return (TQ2)super.removeRepetition("TQ2", rep);
	}

}