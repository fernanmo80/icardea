package ca.uhn.hl7v2.model.v26.group;

import ca.uhn.hl7v2.parser.ModelClassFactory;
import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.log.HapiLogFactory;
import ca.uhn.hl7v2.model.v26.segment.*;

import ca.uhn.hl7v2.model.*;
/**
 * <p>Represents the OPL_O37_OBSERVATION_REQUEST Group.  A Group is an ordered collection of message 
 * segments that can repeat together or be optionally in/excluded together.
 * This Group contains the following elements: </p>
 * 0: ORC (Common Order) <b></b><br>
 * 1: OBR (Observation Request) <b></b><br>
 * 2: ROL (Role) <b>optional repeating</b><br>
 * 3: OPL_O37_TIMING (a Group object) <b>optional repeating</b><br>
 * 4: TCD (Test Code Detail) <b>optional </b><br>
 * 5: DG1 (Diagnosis) <b>optional repeating</b><br>
 * 6: OBX (Observation/Result) <b>optional repeating</b><br>
 */
public class OPL_O37_OBSERVATION_REQUEST extends AbstractGroup {

	/** 
	 * Creates a new OPL_O37_OBSERVATION_REQUEST Group.
	 */
	public OPL_O37_OBSERVATION_REQUEST(Group parent, ModelClassFactory factory) {
	   super(parent, factory);
	   try {
	      this.add(ORC.class, true, false);
	      this.add(OBR.class, true, false);
	      this.add(ROL.class, false, true);
	      this.add(OPL_O37_TIMING.class, false, true);
	      this.add(TCD.class, false, false);
	      this.add(DG1.class, false, true);
	      this.add(OBX.class, false, true);
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error creating OPL_O37_OBSERVATION_REQUEST - this is probably a bug in the source code generator.", e);
	   }
	}

	/**
	 * Returns ORC (Common Order) - creates it if necessary
	 */
	public ORC getORC() { 
	   ORC ret = null;
	   try {
	      ret = (ORC)this.get("ORC");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns OBR (Observation Request) - creates it if necessary
	 */
	public OBR getOBR() { 
	   OBR ret = null;
	   try {
	      ret = (OBR)this.get("OBR");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns  first repetition of ROL (Role) - creates it if necessary
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

	/**
	 * Returns a specific repetition of ROL
	 * (Role) - creates it if necessary
	 * @throws HL7Exception if the repetition requested is more than one 
	 *     greater than the number of existing repetitions.
	 */
	public ROL getROL(int rep) throws HL7Exception { 
	   return (ROL)this.get("ROL", rep);
	}

	/** 
	 * Returns the number of existing repetitions of ROL 
	 */ 
	public int getROLReps() { 
	    int reps = -1; 
	    try { 
	        reps = this.getAll("ROL").length; 
	    } catch (HL7Exception e) { 
	        String message = "Unexpected error accessing data - this is probably a bug in the source code generator."; 
	        HapiLogFactory.getHapiLog(this.getClass()).error(message, e); 
	        throw new RuntimeException(message);
	    } 
	    return reps; 
	} 

	/**
	 * Inserts a specific repetition of ROL
	 * (Role)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public void  insertROL(ROL structure, int rep) throws HL7Exception { 
	   super.insertRepetition( structure, rep);
	}

	/**
	 * Inserts a specific repetition of ROL
	 * (Role)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public ROL insertROL(int rep) throws HL7Exception { 
	   return (ROL)super.insertRepetition("ROL", rep);
	}

	/**
	 * Removes a specific repetition of ROL
	 * (Role)
	 * @see AbstractGroup#insertremoveRepetition(String, int) 
	 */
	public ROL removeROL(int rep) throws HL7Exception { 
	   return (ROL)super.removeRepetition("ROL", rep);
	}

	/**
	 * Returns  first repetition of OPL_O37_TIMING (a Group object) - creates it if necessary
	 */
	public OPL_O37_TIMING getTIMING() { 
	   OPL_O37_TIMING ret = null;
	   try {
	      ret = (OPL_O37_TIMING)this.get("TIMING");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns a specific repetition of OPL_O37_TIMING
	 * (a Group object) - creates it if necessary
	 * @throws HL7Exception if the repetition requested is more than one 
	 *     greater than the number of existing repetitions.
	 */
	public OPL_O37_TIMING getTIMING(int rep) throws HL7Exception { 
	   return (OPL_O37_TIMING)this.get("TIMING", rep);
	}

	/** 
	 * Returns the number of existing repetitions of OPL_O37_TIMING 
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
	 * Inserts a specific repetition of OPL_O37_TIMING
	 * (a Group object)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public void  insertTIMING(OPL_O37_TIMING structure, int rep) throws HL7Exception { 
	   super.insertRepetition( structure, rep);
	}

	/**
	 * Inserts a specific repetition of OPL_O37_TIMING
	 * (a Group object)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public OPL_O37_TIMING insertTIMING(int rep) throws HL7Exception { 
	   return (OPL_O37_TIMING)super.insertRepetition("TIMING", rep);
	}

	/**
	 * Removes a specific repetition of OPL_O37_TIMING
	 * (a Group object)
	 * @see AbstractGroup#insertremoveRepetition(String, int) 
	 */
	public OPL_O37_TIMING removeTIMING(int rep) throws HL7Exception { 
	   return (OPL_O37_TIMING)super.removeRepetition("TIMING", rep);
	}

	/**
	 * Returns TCD (Test Code Detail) - creates it if necessary
	 */
	public TCD getTCD() { 
	   TCD ret = null;
	   try {
	      ret = (TCD)this.get("TCD");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns  first repetition of DG1 (Diagnosis) - creates it if necessary
	 */
	public DG1 getDG1() { 
	   DG1 ret = null;
	   try {
	      ret = (DG1)this.get("DG1");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns a specific repetition of DG1
	 * (Diagnosis) - creates it if necessary
	 * @throws HL7Exception if the repetition requested is more than one 
	 *     greater than the number of existing repetitions.
	 */
	public DG1 getDG1(int rep) throws HL7Exception { 
	   return (DG1)this.get("DG1", rep);
	}

	/** 
	 * Returns the number of existing repetitions of DG1 
	 */ 
	public int getDG1Reps() { 
	    int reps = -1; 
	    try { 
	        reps = this.getAll("DG1").length; 
	    } catch (HL7Exception e) { 
	        String message = "Unexpected error accessing data - this is probably a bug in the source code generator."; 
	        HapiLogFactory.getHapiLog(this.getClass()).error(message, e); 
	        throw new RuntimeException(message);
	    } 
	    return reps; 
	} 

	/**
	 * Inserts a specific repetition of DG1
	 * (Diagnosis)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public void  insertDG1(DG1 structure, int rep) throws HL7Exception { 
	   super.insertRepetition( structure, rep);
	}

	/**
	 * Inserts a specific repetition of DG1
	 * (Diagnosis)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public DG1 insertDG1(int rep) throws HL7Exception { 
	   return (DG1)super.insertRepetition("DG1", rep);
	}

	/**
	 * Removes a specific repetition of DG1
	 * (Diagnosis)
	 * @see AbstractGroup#insertremoveRepetition(String, int) 
	 */
	public DG1 removeDG1(int rep) throws HL7Exception { 
	   return (DG1)super.removeRepetition("DG1", rep);
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

}
