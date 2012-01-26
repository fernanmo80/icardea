package ca.uhn.hl7v2.model.v26.group;

import ca.uhn.hl7v2.parser.ModelClassFactory;
import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.log.HapiLogFactory;
import ca.uhn.hl7v2.model.v26.segment.*;

import ca.uhn.hl7v2.model.*;
/**
 * <p>Represents the RSP_Z88_ALLERGY Group.  A Group is an ordered collection of message 
 * segments that can repeat together or be optionally in/excluded together.
 * This Group contains the following elements: </p>
 * 0: AL1 (Patient Allergy Information) <b>repeating</b><br>
 * 1: RSP_Z88_VISIT (a Group object) <b>optional </b><br>
 */
public class RSP_Z88_ALLERGY extends AbstractGroup {

	/** 
	 * Creates a new RSP_Z88_ALLERGY Group.
	 */
	public RSP_Z88_ALLERGY(Group parent, ModelClassFactory factory) {
	   super(parent, factory);
	   try {
	      this.add(AL1.class, true, true);
	      this.add(RSP_Z88_VISIT.class, false, false);
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error creating RSP_Z88_ALLERGY - this is probably a bug in the source code generator.", e);
	   }
	}

	/**
	 * Returns  first repetition of AL1 (Patient Allergy Information) - creates it if necessary
	 */
	public AL1 getAL1() { 
	   AL1 ret = null;
	   try {
	      ret = (AL1)this.get("AL1");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns a specific repetition of AL1
	 * (Patient Allergy Information) - creates it if necessary
	 * @throws HL7Exception if the repetition requested is more than one 
	 *     greater than the number of existing repetitions.
	 */
	public AL1 getAL1(int rep) throws HL7Exception { 
	   return (AL1)this.get("AL1", rep);
	}

	/** 
	 * Returns the number of existing repetitions of AL1 
	 */ 
	public int getAL1Reps() { 
	    int reps = -1; 
	    try { 
	        reps = this.getAll("AL1").length; 
	    } catch (HL7Exception e) { 
	        String message = "Unexpected error accessing data - this is probably a bug in the source code generator."; 
	        HapiLogFactory.getHapiLog(this.getClass()).error(message, e); 
	        throw new RuntimeException(message);
	    } 
	    return reps; 
	} 

	/**
	 * Inserts a specific repetition of AL1
	 * (Patient Allergy Information)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public void  insertAL1(AL1 structure, int rep) throws HL7Exception { 
	   super.insertRepetition( structure, rep);
	}

	/**
	 * Inserts a specific repetition of AL1
	 * (Patient Allergy Information)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public AL1 insertAL1(int rep) throws HL7Exception { 
	   return (AL1)super.insertRepetition("AL1", rep);
	}

	/**
	 * Removes a specific repetition of AL1
	 * (Patient Allergy Information)
	 * @see AbstractGroup#insertremoveRepetition(String, int) 
	 */
	public AL1 removeAL1(int rep) throws HL7Exception { 
	   return (AL1)super.removeRepetition("AL1", rep);
	}

	/**
	 * Returns RSP_Z88_VISIT (a Group object) - creates it if necessary
	 */
	public RSP_Z88_VISIT getVISIT() { 
	   RSP_Z88_VISIT ret = null;
	   try {
	      ret = (RSP_Z88_VISIT)this.get("VISIT");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

}
