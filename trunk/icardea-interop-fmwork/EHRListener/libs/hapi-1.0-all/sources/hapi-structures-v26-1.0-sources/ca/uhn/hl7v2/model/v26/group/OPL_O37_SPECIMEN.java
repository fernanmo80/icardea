package ca.uhn.hl7v2.model.v26.group;

import ca.uhn.hl7v2.parser.ModelClassFactory;
import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.log.HapiLogFactory;
import ca.uhn.hl7v2.model.v26.segment.*;

import ca.uhn.hl7v2.model.*;
/**
 * <p>Represents the OPL_O37_SPECIMEN Group.  A Group is an ordered collection of message 
 * segments that can repeat together or be optionally in/excluded together.
 * This Group contains the following elements: </p>
 * 0: SPM (Specimen) <b></b><br>
 * 1: OBX (Observation/Result) <b>optional repeating</b><br>
 * 2: OPL_O37_CONTAINER (a Group object) <b>optional repeating</b><br>
 * 3: OPL_O37_OBSERVATION_REQUEST (a Group object) <b>repeating</b><br>
 */
public class OPL_O37_SPECIMEN extends AbstractGroup {

	/** 
	 * Creates a new OPL_O37_SPECIMEN Group.
	 */
	public OPL_O37_SPECIMEN(Group parent, ModelClassFactory factory) {
	   super(parent, factory);
	   try {
	      this.add(SPM.class, true, false);
	      this.add(OBX.class, false, true);
	      this.add(OPL_O37_CONTAINER.class, false, true);
	      this.add(OPL_O37_OBSERVATION_REQUEST.class, true, true);
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error creating OPL_O37_SPECIMEN - this is probably a bug in the source code generator.", e);
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
	 * Returns  first repetition of OPL_O37_CONTAINER (a Group object) - creates it if necessary
	 */
	public OPL_O37_CONTAINER getCONTAINER() { 
	   OPL_O37_CONTAINER ret = null;
	   try {
	      ret = (OPL_O37_CONTAINER)this.get("CONTAINER");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns a specific repetition of OPL_O37_CONTAINER
	 * (a Group object) - creates it if necessary
	 * @throws HL7Exception if the repetition requested is more than one 
	 *     greater than the number of existing repetitions.
	 */
	public OPL_O37_CONTAINER getCONTAINER(int rep) throws HL7Exception { 
	   return (OPL_O37_CONTAINER)this.get("CONTAINER", rep);
	}

	/** 
	 * Returns the number of existing repetitions of OPL_O37_CONTAINER 
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
	 * Inserts a specific repetition of OPL_O37_CONTAINER
	 * (a Group object)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public void  insertCONTAINER(OPL_O37_CONTAINER structure, int rep) throws HL7Exception { 
	   super.insertRepetition( structure, rep);
	}

	/**
	 * Inserts a specific repetition of OPL_O37_CONTAINER
	 * (a Group object)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public OPL_O37_CONTAINER insertCONTAINER(int rep) throws HL7Exception { 
	   return (OPL_O37_CONTAINER)super.insertRepetition("CONTAINER", rep);
	}

	/**
	 * Removes a specific repetition of OPL_O37_CONTAINER
	 * (a Group object)
	 * @see AbstractGroup#insertremoveRepetition(String, int) 
	 */
	public OPL_O37_CONTAINER removeCONTAINER(int rep) throws HL7Exception { 
	   return (OPL_O37_CONTAINER)super.removeRepetition("CONTAINER", rep);
	}

	/**
	 * Returns  first repetition of OPL_O37_OBSERVATION_REQUEST (a Group object) - creates it if necessary
	 */
	public OPL_O37_OBSERVATION_REQUEST getOBSERVATION_REQUEST() { 
	   OPL_O37_OBSERVATION_REQUEST ret = null;
	   try {
	      ret = (OPL_O37_OBSERVATION_REQUEST)this.get("OBSERVATION_REQUEST");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns a specific repetition of OPL_O37_OBSERVATION_REQUEST
	 * (a Group object) - creates it if necessary
	 * @throws HL7Exception if the repetition requested is more than one 
	 *     greater than the number of existing repetitions.
	 */
	public OPL_O37_OBSERVATION_REQUEST getOBSERVATION_REQUEST(int rep) throws HL7Exception { 
	   return (OPL_O37_OBSERVATION_REQUEST)this.get("OBSERVATION_REQUEST", rep);
	}

	/** 
	 * Returns the number of existing repetitions of OPL_O37_OBSERVATION_REQUEST 
	 */ 
	public int getOBSERVATION_REQUESTReps() { 
	    int reps = -1; 
	    try { 
	        reps = this.getAll("OBSERVATION_REQUEST").length; 
	    } catch (HL7Exception e) { 
	        String message = "Unexpected error accessing data - this is probably a bug in the source code generator."; 
	        HapiLogFactory.getHapiLog(this.getClass()).error(message, e); 
	        throw new RuntimeException(message);
	    } 
	    return reps; 
	} 

	/**
	 * Inserts a specific repetition of OPL_O37_OBSERVATION_REQUEST
	 * (a Group object)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public void  insertOBSERVATION_REQUEST(OPL_O37_OBSERVATION_REQUEST structure, int rep) throws HL7Exception { 
	   super.insertRepetition( structure, rep);
	}

	/**
	 * Inserts a specific repetition of OPL_O37_OBSERVATION_REQUEST
	 * (a Group object)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public OPL_O37_OBSERVATION_REQUEST insertOBSERVATION_REQUEST(int rep) throws HL7Exception { 
	   return (OPL_O37_OBSERVATION_REQUEST)super.insertRepetition("OBSERVATION_REQUEST", rep);
	}

	/**
	 * Removes a specific repetition of OPL_O37_OBSERVATION_REQUEST
	 * (a Group object)
	 * @see AbstractGroup#insertremoveRepetition(String, int) 
	 */
	public OPL_O37_OBSERVATION_REQUEST removeOBSERVATION_REQUEST(int rep) throws HL7Exception { 
	   return (OPL_O37_OBSERVATION_REQUEST)super.removeRepetition("OBSERVATION_REQUEST", rep);
	}

}
