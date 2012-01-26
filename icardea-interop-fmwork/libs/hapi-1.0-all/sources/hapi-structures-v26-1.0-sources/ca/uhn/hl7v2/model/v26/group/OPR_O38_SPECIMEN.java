package ca.uhn.hl7v2.model.v26.group;

import ca.uhn.hl7v2.parser.ModelClassFactory;
import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.log.HapiLogFactory;
import ca.uhn.hl7v2.model.v26.segment.*;

import ca.uhn.hl7v2.model.*;
/**
 * <p>Represents the OPR_O38_SPECIMEN Group.  A Group is an ordered collection of message 
 * segments that can repeat together or be optionally in/excluded together.
 * This Group contains the following elements: </p>
 * 0: SPM (Specimen) <b></b><br>
 * 1: OBX (Observation/Result) <b>optional repeating</b><br>
 * 2: SAC (Specimen Container detail) <b>optional repeating</b><br>
 * 3: OPR_O38_OBSERVATION_REQUEST (a Group object) <b>optional repeating</b><br>
 * 4: OPR_O38_TIMING (a Group object) <b>optional repeating</b><br>
 */
public class OPR_O38_SPECIMEN extends AbstractGroup {

	/** 
	 * Creates a new OPR_O38_SPECIMEN Group.
	 */
	public OPR_O38_SPECIMEN(Group parent, ModelClassFactory factory) {
	   super(parent, factory);
	   try {
	      this.add(SPM.class, true, false);
	      this.add(OBX.class, false, true);
	      this.add(SAC.class, false, true);
	      this.add(OPR_O38_OBSERVATION_REQUEST.class, false, true);
	      this.add(OPR_O38_TIMING.class, false, true);
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error creating OPR_O38_SPECIMEN - this is probably a bug in the source code generator.", e);
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
	 * Returns  first repetition of SAC (Specimen Container detail) - creates it if necessary
	 */
	public SAC getSAC() { 
	   SAC ret = null;
	   try {
	      ret = (SAC)this.get("SAC");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns a specific repetition of SAC
	 * (Specimen Container detail) - creates it if necessary
	 * @throws HL7Exception if the repetition requested is more than one 
	 *     greater than the number of existing repetitions.
	 */
	public SAC getSAC(int rep) throws HL7Exception { 
	   return (SAC)this.get("SAC", rep);
	}

	/** 
	 * Returns the number of existing repetitions of SAC 
	 */ 
	public int getSACReps() { 
	    int reps = -1; 
	    try { 
	        reps = this.getAll("SAC").length; 
	    } catch (HL7Exception e) { 
	        String message = "Unexpected error accessing data - this is probably a bug in the source code generator."; 
	        HapiLogFactory.getHapiLog(this.getClass()).error(message, e); 
	        throw new RuntimeException(message);
	    } 
	    return reps; 
	} 

	/**
	 * Inserts a specific repetition of SAC
	 * (Specimen Container detail)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public void  insertSAC(SAC structure, int rep) throws HL7Exception { 
	   super.insertRepetition( structure, rep);
	}

	/**
	 * Inserts a specific repetition of SAC
	 * (Specimen Container detail)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public SAC insertSAC(int rep) throws HL7Exception { 
	   return (SAC)super.insertRepetition("SAC", rep);
	}

	/**
	 * Removes a specific repetition of SAC
	 * (Specimen Container detail)
	 * @see AbstractGroup#insertremoveRepetition(String, int) 
	 */
	public SAC removeSAC(int rep) throws HL7Exception { 
	   return (SAC)super.removeRepetition("SAC", rep);
	}

	/**
	 * Returns  first repetition of OPR_O38_OBSERVATION_REQUEST (a Group object) - creates it if necessary
	 */
	public OPR_O38_OBSERVATION_REQUEST getOBSERVATION_REQUEST() { 
	   OPR_O38_OBSERVATION_REQUEST ret = null;
	   try {
	      ret = (OPR_O38_OBSERVATION_REQUEST)this.get("OBSERVATION_REQUEST");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns a specific repetition of OPR_O38_OBSERVATION_REQUEST
	 * (a Group object) - creates it if necessary
	 * @throws HL7Exception if the repetition requested is more than one 
	 *     greater than the number of existing repetitions.
	 */
	public OPR_O38_OBSERVATION_REQUEST getOBSERVATION_REQUEST(int rep) throws HL7Exception { 
	   return (OPR_O38_OBSERVATION_REQUEST)this.get("OBSERVATION_REQUEST", rep);
	}

	/** 
	 * Returns the number of existing repetitions of OPR_O38_OBSERVATION_REQUEST 
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
	 * Inserts a specific repetition of OPR_O38_OBSERVATION_REQUEST
	 * (a Group object)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public void  insertOBSERVATION_REQUEST(OPR_O38_OBSERVATION_REQUEST structure, int rep) throws HL7Exception { 
	   super.insertRepetition( structure, rep);
	}

	/**
	 * Inserts a specific repetition of OPR_O38_OBSERVATION_REQUEST
	 * (a Group object)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public OPR_O38_OBSERVATION_REQUEST insertOBSERVATION_REQUEST(int rep) throws HL7Exception { 
	   return (OPR_O38_OBSERVATION_REQUEST)super.insertRepetition("OBSERVATION_REQUEST", rep);
	}

	/**
	 * Removes a specific repetition of OPR_O38_OBSERVATION_REQUEST
	 * (a Group object)
	 * @see AbstractGroup#insertremoveRepetition(String, int) 
	 */
	public OPR_O38_OBSERVATION_REQUEST removeOBSERVATION_REQUEST(int rep) throws HL7Exception { 
	   return (OPR_O38_OBSERVATION_REQUEST)super.removeRepetition("OBSERVATION_REQUEST", rep);
	}

	/**
	 * Returns  first repetition of OPR_O38_TIMING (a Group object) - creates it if necessary
	 */
	public OPR_O38_TIMING getTIMING() { 
	   OPR_O38_TIMING ret = null;
	   try {
	      ret = (OPR_O38_TIMING)this.get("TIMING");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns a specific repetition of OPR_O38_TIMING
	 * (a Group object) - creates it if necessary
	 * @throws HL7Exception if the repetition requested is more than one 
	 *     greater than the number of existing repetitions.
	 */
	public OPR_O38_TIMING getTIMING(int rep) throws HL7Exception { 
	   return (OPR_O38_TIMING)this.get("TIMING", rep);
	}

	/** 
	 * Returns the number of existing repetitions of OPR_O38_TIMING 
	 */ 
	public int getTIMINGReps() { 
	    int reps = -1; 
	    try { 
	        reps = this.getAll("TIMING").length; 
	    } catch (HL7Exception e) { 
	        String message = "Unexpected error accessing data - this is probably a bug in the source code generator."; 
	        HapiLogFactory.getHapiLog(this.getClass()).error(message, e); 
	        throw new RuntimeException(message);
	    } 
	    return reps; 
	} 

	/**
	 * Inserts a specific repetition of OPR_O38_TIMING
	 * (a Group object)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public void  insertTIMING(OPR_O38_TIMING structure, int rep) throws HL7Exception { 
	   super.insertRepetition( structure, rep);
	}

	/**
	 * Inserts a specific repetition of OPR_O38_TIMING
	 * (a Group object)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public OPR_O38_TIMING insertTIMING(int rep) throws HL7Exception { 
	   return (OPR_O38_TIMING)super.insertRepetition("TIMING", rep);
	}

	/**
	 * Removes a specific repetition of OPR_O38_TIMING
	 * (a Group object)
	 * @see AbstractGroup#insertremoveRepetition(String, int) 
	 */
	public OPR_O38_TIMING removeTIMING(int rep) throws HL7Exception { 
	   return (OPR_O38_TIMING)super.removeRepetition("TIMING", rep);
	}

}
