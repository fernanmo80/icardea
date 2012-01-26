package ca.uhn.hl7v2.model.v26.group;

import ca.uhn.hl7v2.parser.ModelClassFactory;
import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.log.HapiLogFactory;
import ca.uhn.hl7v2.model.v26.segment.*;

import ca.uhn.hl7v2.model.*;
/**
 * <p>Represents the OPU_R25_ORDER Group.  A Group is an ordered collection of message 
 * segments that can repeat together or be optionally in/excluded together.
 * This Group contains the following elements: </p>
 * 0: OBR (Observation Request) <b></b><br>
 * 1: ORC (Common Order) <b>optional </b><br>
 * 2: NTE (Notes and Comments) <b>optional repeating</b><br>
 * 3: ROL (Role) <b>optional repeating</b><br>
 * 4: OPU_R25_TIMING_QTY (a Group object) <b>optional repeating</b><br>
 * 5: OPU_R25_RESULT (a Group object) <b>repeating</b><br>
 */
public class OPU_R25_ORDER extends AbstractGroup {

	/** 
	 * Creates a new OPU_R25_ORDER Group.
	 */
	public OPU_R25_ORDER(Group parent, ModelClassFactory factory) {
	   super(parent, factory);
	   try {
	      this.add(OBR.class, true, false);
	      this.add(ORC.class, false, false);
	      this.add(NTE.class, false, true);
	      this.add(ROL.class, false, true);
	      this.add(OPU_R25_TIMING_QTY.class, false, true);
	      this.add(OPU_R25_RESULT.class, true, true);
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error creating OPU_R25_ORDER - this is probably a bug in the source code generator.", e);
	   }
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
	 * Returns  first repetition of NTE (Notes and Comments) - creates it if necessary
	 */
	public NTE getNTE() { 
	   NTE ret = null;
	   try {
	      ret = (NTE)this.get("NTE");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns a specific repetition of NTE
	 * (Notes and Comments) - creates it if necessary
	 * @throws HL7Exception if the repetition requested is more than one 
	 *     greater than the number of existing repetitions.
	 */
	public NTE getNTE(int rep) throws HL7Exception { 
	   return (NTE)this.get("NTE", rep);
	}

	/** 
	 * Returns the number of existing repetitions of NTE 
	 */ 
	public int getNTEReps() { 
	    int reps = -1; 
	    try { 
	        reps = this.getAll("NTE").length; 
	    } catch (HL7Exception e) { 
	        String message = "Unexpected error accessing data - this is probably a bug in the source code generator."; 
	        HapiLogFactory.getHapiLog(this.getClass()).error(message, e); 
	        throw new RuntimeException(message);
	    } 
	    return reps; 
	} 

	/**
	 * Inserts a specific repetition of NTE
	 * (Notes and Comments)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public void  insertNTE(NTE structure, int rep) throws HL7Exception { 
	   super.insertRepetition( structure, rep);
	}

	/**
	 * Inserts a specific repetition of NTE
	 * (Notes and Comments)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public NTE insertNTE(int rep) throws HL7Exception { 
	   return (NTE)super.insertRepetition("NTE", rep);
	}

	/**
	 * Removes a specific repetition of NTE
	 * (Notes and Comments)
	 * @see AbstractGroup#insertremoveRepetition(String, int) 
	 */
	public NTE removeNTE(int rep) throws HL7Exception { 
	   return (NTE)super.removeRepetition("NTE", rep);
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
	 * Returns  first repetition of OPU_R25_TIMING_QTY (a Group object) - creates it if necessary
	 */
	public OPU_R25_TIMING_QTY getTIMING_QTY() { 
	   OPU_R25_TIMING_QTY ret = null;
	   try {
	      ret = (OPU_R25_TIMING_QTY)this.get("TIMING_QTY");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns a specific repetition of OPU_R25_TIMING_QTY
	 * (a Group object) - creates it if necessary
	 * @throws HL7Exception if the repetition requested is more than one 
	 *     greater than the number of existing repetitions.
	 */
	public OPU_R25_TIMING_QTY getTIMING_QTY(int rep) throws HL7Exception { 
	   return (OPU_R25_TIMING_QTY)this.get("TIMING_QTY", rep);
	}

	/** 
	 * Returns the number of existing repetitions of OPU_R25_TIMING_QTY 
	 */ 
	public int getTIMING_QTYReps() { 
	    int reps = -1; 
	    try { 
	        reps = this.getAll("TIMING_QTY").length; 
	    } catch (HL7Exception e) { 
	        String message = "Unexpected error accessing data - this is probably a bug in the source code generator."; 
	        HapiLogFactory.getHapiLog(this.getClass()).error(message, e); 
	        throw new RuntimeException(message);
	    } 
	    return reps; 
	} 

	/**
	 * Inserts a specific repetition of OPU_R25_TIMING_QTY
	 * (a Group object)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public void  insertTIMING_QTY(OPU_R25_TIMING_QTY structure, int rep) throws HL7Exception { 
	   super.insertRepetition( structure, rep);
	}

	/**
	 * Inserts a specific repetition of OPU_R25_TIMING_QTY
	 * (a Group object)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public OPU_R25_TIMING_QTY insertTIMING_QTY(int rep) throws HL7Exception { 
	   return (OPU_R25_TIMING_QTY)super.insertRepetition("TIMING_QTY", rep);
	}

	/**
	 * Removes a specific repetition of OPU_R25_TIMING_QTY
	 * (a Group object)
	 * @see AbstractGroup#insertremoveRepetition(String, int) 
	 */
	public OPU_R25_TIMING_QTY removeTIMING_QTY(int rep) throws HL7Exception { 
	   return (OPU_R25_TIMING_QTY)super.removeRepetition("TIMING_QTY", rep);
	}

	/**
	 * Returns  first repetition of OPU_R25_RESULT (a Group object) - creates it if necessary
	 */
	public OPU_R25_RESULT getRESULT() { 
	   OPU_R25_RESULT ret = null;
	   try {
	      ret = (OPU_R25_RESULT)this.get("RESULT");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns a specific repetition of OPU_R25_RESULT
	 * (a Group object) - creates it if necessary
	 * @throws HL7Exception if the repetition requested is more than one 
	 *     greater than the number of existing repetitions.
	 */
	public OPU_R25_RESULT getRESULT(int rep) throws HL7Exception { 
	   return (OPU_R25_RESULT)this.get("RESULT", rep);
	}

	/** 
	 * Returns the number of existing repetitions of OPU_R25_RESULT 
	 */ 
	public int getRESULTReps() { 
	    int reps = -1; 
	    try { 
	        reps = this.getAll("RESULT").length; 
	    } catch (HL7Exception e) { 
	        String message = "Unexpected error accessing data - this is probably a bug in the source code generator."; 
	        HapiLogFactory.getHapiLog(this.getClass()).error(message, e); 
	        throw new RuntimeException(message);
	    } 
	    return reps; 
	} 

	/**
	 * Inserts a specific repetition of OPU_R25_RESULT
	 * (a Group object)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public void  insertRESULT(OPU_R25_RESULT structure, int rep) throws HL7Exception { 
	   super.insertRepetition( structure, rep);
	}

	/**
	 * Inserts a specific repetition of OPU_R25_RESULT
	 * (a Group object)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public OPU_R25_RESULT insertRESULT(int rep) throws HL7Exception { 
	   return (OPU_R25_RESULT)super.insertRepetition("RESULT", rep);
	}

	/**
	 * Removes a specific repetition of OPU_R25_RESULT
	 * (a Group object)
	 * @see AbstractGroup#insertremoveRepetition(String, int) 
	 */
	public OPU_R25_RESULT removeRESULT(int rep) throws HL7Exception { 
	   return (OPU_R25_RESULT)super.removeRepetition("RESULT", rep);
	}

}
