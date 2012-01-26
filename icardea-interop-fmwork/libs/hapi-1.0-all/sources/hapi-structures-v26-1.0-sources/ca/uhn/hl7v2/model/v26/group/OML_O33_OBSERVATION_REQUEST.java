package ca.uhn.hl7v2.model.v26.group;

import ca.uhn.hl7v2.parser.ModelClassFactory;
import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.log.HapiLogFactory;
import ca.uhn.hl7v2.model.v26.segment.*;

import ca.uhn.hl7v2.model.*;
/**
 * <p>Represents the OML_O33_OBSERVATION_REQUEST Group.  A Group is an ordered collection of message 
 * segments that can repeat together or be optionally in/excluded together.
 * This Group contains the following elements: </p>
 * 0: OBR (Observation Request) <b></b><br>
 * 1: TCD (Test Code Detail) <b>optional </b><br>
 * 2: NTE (Notes and Comments) <b>optional repeating</b><br>
 * 3: ROL (Role) <b>optional repeating</b><br>
 * 4: DG1 (Diagnosis) <b>optional repeating</b><br>
 * 5: OML_O33_OBSERVATION (a Group object) <b>optional repeating</b><br>
 * 6: OML_O33_PRIOR_RESULT (a Group object) <b>optional repeating</b><br>
 */
public class OML_O33_OBSERVATION_REQUEST extends AbstractGroup {

	/** 
	 * Creates a new OML_O33_OBSERVATION_REQUEST Group.
	 */
	public OML_O33_OBSERVATION_REQUEST(Group parent, ModelClassFactory factory) {
	   super(parent, factory);
	   try {
	      this.add(OBR.class, true, false);
	      this.add(TCD.class, false, false);
	      this.add(NTE.class, false, true);
	      this.add(ROL.class, false, true);
	      this.add(DG1.class, false, true);
	      this.add(OML_O33_OBSERVATION.class, false, true);
	      this.add(OML_O33_PRIOR_RESULT.class, false, true);
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error creating OML_O33_OBSERVATION_REQUEST - this is probably a bug in the source code generator.", e);
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
	 * Returns  first repetition of OML_O33_OBSERVATION (a Group object) - creates it if necessary
	 */
	public OML_O33_OBSERVATION getOBSERVATION() { 
	   OML_O33_OBSERVATION ret = null;
	   try {
	      ret = (OML_O33_OBSERVATION)this.get("OBSERVATION");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns a specific repetition of OML_O33_OBSERVATION
	 * (a Group object) - creates it if necessary
	 * @throws HL7Exception if the repetition requested is more than one 
	 *     greater than the number of existing repetitions.
	 */
	public OML_O33_OBSERVATION getOBSERVATION(int rep) throws HL7Exception { 
	   return (OML_O33_OBSERVATION)this.get("OBSERVATION", rep);
	}

	/** 
	 * Returns the number of existing repetitions of OML_O33_OBSERVATION 
	 */ 
	public int getOBSERVATIONReps() { 
	    int reps = -1; 
	    try { 
	        reps = this.getAll("OBSERVATION").length; 
	    } catch (HL7Exception e) { 
	        String message = "Unexpected error accessing data - this is probably a bug in the source code generator."; 
	        HapiLogFactory.getHapiLog(this.getClass()).error(message, e); 
	        throw new RuntimeException(message);
	    } 
	    return reps; 
	} 

	/**
	 * Inserts a specific repetition of OML_O33_OBSERVATION
	 * (a Group object)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public void  insertOBSERVATION(OML_O33_OBSERVATION structure, int rep) throws HL7Exception { 
	   super.insertRepetition( structure, rep);
	}

	/**
	 * Inserts a specific repetition of OML_O33_OBSERVATION
	 * (a Group object)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public OML_O33_OBSERVATION insertOBSERVATION(int rep) throws HL7Exception { 
	   return (OML_O33_OBSERVATION)super.insertRepetition("OBSERVATION", rep);
	}

	/**
	 * Removes a specific repetition of OML_O33_OBSERVATION
	 * (a Group object)
	 * @see AbstractGroup#insertremoveRepetition(String, int) 
	 */
	public OML_O33_OBSERVATION removeOBSERVATION(int rep) throws HL7Exception { 
	   return (OML_O33_OBSERVATION)super.removeRepetition("OBSERVATION", rep);
	}

	/**
	 * Returns  first repetition of OML_O33_PRIOR_RESULT (a Group object) - creates it if necessary
	 */
	public OML_O33_PRIOR_RESULT getPRIOR_RESULT() { 
	   OML_O33_PRIOR_RESULT ret = null;
	   try {
	      ret = (OML_O33_PRIOR_RESULT)this.get("PRIOR_RESULT");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns a specific repetition of OML_O33_PRIOR_RESULT
	 * (a Group object) - creates it if necessary
	 * @throws HL7Exception if the repetition requested is more than one 
	 *     greater than the number of existing repetitions.
	 */
	public OML_O33_PRIOR_RESULT getPRIOR_RESULT(int rep) throws HL7Exception { 
	   return (OML_O33_PRIOR_RESULT)this.get("PRIOR_RESULT", rep);
	}

	/** 
	 * Returns the number of existing repetitions of OML_O33_PRIOR_RESULT 
	 */ 
	public int getPRIOR_RESULTReps() { 
	    int reps = -1; 
	    try { 
	        reps = this.getAll("PRIOR_RESULT").length; 
	    } catch (HL7Exception e) { 
	        String message = "Unexpected error accessing data - this is probably a bug in the source code generator."; 
	        HapiLogFactory.getHapiLog(this.getClass()).error(message, e); 
	        throw new RuntimeException(message);
	    } 
	    return reps; 
	} 

	/**
	 * Inserts a specific repetition of OML_O33_PRIOR_RESULT
	 * (a Group object)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public void  insertPRIOR_RESULT(OML_O33_PRIOR_RESULT structure, int rep) throws HL7Exception { 
	   super.insertRepetition( structure, rep);
	}

	/**
	 * Inserts a specific repetition of OML_O33_PRIOR_RESULT
	 * (a Group object)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public OML_O33_PRIOR_RESULT insertPRIOR_RESULT(int rep) throws HL7Exception { 
	   return (OML_O33_PRIOR_RESULT)super.insertRepetition("PRIOR_RESULT", rep);
	}

	/**
	 * Removes a specific repetition of OML_O33_PRIOR_RESULT
	 * (a Group object)
	 * @see AbstractGroup#insertremoveRepetition(String, int) 
	 */
	public OML_O33_PRIOR_RESULT removePRIOR_RESULT(int rep) throws HL7Exception { 
	   return (OML_O33_PRIOR_RESULT)super.removeRepetition("PRIOR_RESULT", rep);
	}

}
