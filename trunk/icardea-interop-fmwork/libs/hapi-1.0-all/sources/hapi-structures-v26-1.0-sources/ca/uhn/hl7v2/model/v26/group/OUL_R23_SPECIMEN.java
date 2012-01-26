package ca.uhn.hl7v2.model.v26.group;

import ca.uhn.hl7v2.parser.ModelClassFactory;
import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.log.HapiLogFactory;
import ca.uhn.hl7v2.model.v26.segment.*;

import ca.uhn.hl7v2.model.*;
/**
 * <p>Represents the OUL_R23_SPECIMEN Group.  A Group is an ordered collection of message 
 * segments that can repeat together or be optionally in/excluded together.
 * This Group contains the following elements: </p>
 * 0: SPM (Specimen) <b></b><br>
 * 1: OBX (Observation/Result) <b>optional repeating</b><br>
 * 2: OUL_R23_CONTAINER (a Group object) <b>repeating</b><br>
 */
public class OUL_R23_SPECIMEN extends AbstractGroup {

	/** 
	 * Creates a new OUL_R23_SPECIMEN Group.
	 */
	public OUL_R23_SPECIMEN(Group parent, ModelClassFactory factory) {
	   super(parent, factory);
	   try {
	      this.add(SPM.class, true, false);
	      this.add(OBX.class, false, true);
	      this.add(OUL_R23_CONTAINER.class, true, true);
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error creating OUL_R23_SPECIMEN - this is probably a bug in the source code generator.", e);
	   }
	}

	/**
	 * Returns SPM (Specimen) - creates it if necessary
	 */
	public SPM getSPM() { 
	   SPM ret = null;
	   try {
	      ret = (SPM)this.get("SPM");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns  first repetition of OBX (Observation/Result) - creates it if necessary
	 */
	public OBX getOBX() { 
	   OBX ret = null;
	   try {
	      ret = (OBX)this.get("OBX");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns a specific repetition of OBX
	 * (Observation/Result) - creates it if necessary
	 * @throws HL7Exception if the repetition requested is more than one 
	 *     greater than the number of existing repetitions.
	 */
	public OBX getOBX(int rep) throws HL7Exception { 
	   return (OBX)this.get("OBX", rep);
	}

	/** 
	 * Returns the number of existing repetitions of OBX 
	 */ 
	public int getOBXReps() { 
	    int reps = -1; 
	    try { 
	        reps = this.getAll("OBX").length; 
	    } catch (HL7Exception e) { 
	        String message = "Unexpected error accessing data - this is probably a bug in the source code generator."; 
	        HapiLogFactory.getHapiLog(this.getClass()).error(message, e); 
	        throw new RuntimeException(message);
	    } 
	    return reps; 
	} 

	/**
	 * Inserts a specific repetition of OBX
	 * (Observation/Result)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public void  insertOBX(OBX structure, int rep) throws HL7Exception { 
	   super.insertRepetition( structure, rep);
	}

	/**
	 * Inserts a specific repetition of OBX
	 * (Observation/Result)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public OBX insertOBX(int rep) throws HL7Exception { 
	   return (OBX)super.insertRepetition("OBX", rep);
	}

	/**
	 * Removes a specific repetition of OBX
	 * (Observation/Result)
	 * @see AbstractGroup#insertremoveRepetition(String, int) 
	 */
	public OBX removeOBX(int rep) throws HL7Exception { 
	   return (OBX)super.removeRepetition("OBX", rep);
	}

	/**
	 * Returns  first repetition of OUL_R23_CONTAINER (a Group object) - creates it if necessary
	 */
	public OUL_R23_CONTAINER getCONTAINER() { 
	   OUL_R23_CONTAINER ret = null;
	   try {
	      ret = (OUL_R23_CONTAINER)this.get("CONTAINER");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns a specific repetition of OUL_R23_CONTAINER
	 * (a Group object) - creates it if necessary
	 * @throws HL7Exception if the repetition requested is more than one 
	 *     greater than the number of existing repetitions.
	 */
	public OUL_R23_CONTAINER getCONTAINER(int rep) throws HL7Exception { 
	   return (OUL_R23_CONTAINER)this.get("CONTAINER", rep);
	}

	/** 
	 * Returns the number of existing repetitions of OUL_R23_CONTAINER 
	 */ 
	public int getCONTAINERReps() { 
	    int reps = -1; 
	    try { 
	        reps = this.getAll("CONTAINER").length; 
	    } catch (HL7Exception e) { 
	        String message = "Unexpected error accessing data - this is probably a bug in the source code generator."; 
	        HapiLogFactory.getHapiLog(this.getClass()).error(message, e); 
	        throw new RuntimeException(message);
	    } 
	    return reps; 
	} 

	/**
	 * Inserts a specific repetition of OUL_R23_CONTAINER
	 * (a Group object)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public void  insertCONTAINER(OUL_R23_CONTAINER structure, int rep) throws HL7Exception { 
	   super.insertRepetition( structure, rep);
	}

	/**
	 * Inserts a specific repetition of OUL_R23_CONTAINER
	 * (a Group object)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public OUL_R23_CONTAINER insertCONTAINER(int rep) throws HL7Exception { 
	   return (OUL_R23_CONTAINER)super.insertRepetition("CONTAINER", rep);
	}

	/**
	 * Removes a specific repetition of OUL_R23_CONTAINER
	 * (a Group object)
	 * @see AbstractGroup#insertremoveRepetition(String, int) 
	 */
	public OUL_R23_CONTAINER removeCONTAINER(int rep) throws HL7Exception { 
	   return (OUL_R23_CONTAINER)super.removeRepetition("CONTAINER", rep);
	}

}
