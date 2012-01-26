package ca.uhn.hl7v2.model.v26.group;

import ca.uhn.hl7v2.parser.ModelClassFactory;
import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.log.HapiLogFactory;
import ca.uhn.hl7v2.model.v26.segment.*;

import ca.uhn.hl7v2.model.*;
/**
 * <p>Represents the PRR_PC5_PROBLEM Group.  A Group is an ordered collection of message 
 * segments that can repeat together or be optionally in/excluded together.
 * This Group contains the following elements: </p>
 * 0: PRB (Problem Details) <b></b><br>
 * 1: NTE (Notes and Comments) <b>optional repeating</b><br>
 * 2: VAR (Variance) <b>optional repeating</b><br>
 * 3: PRR_PC5_PROBLEM_ROLE (a Group object) <b>optional repeating</b><br>
 * 4: PRR_PC5_PROBLEM_PATHWAY (a Group object) <b>optional repeating</b><br>
 * 5: PRR_PC5_PROBLEM_OBSERVATION (a Group object) <b>optional repeating</b><br>
 * 6: PRR_PC5_GOAL (a Group object) <b>optional repeating</b><br>
 * 7: PRR_PC5_ORDER (a Group object) <b>optional repeating</b><br>
 */
public class PRR_PC5_PROBLEM extends AbstractGroup {

	/** 
	 * Creates a new PRR_PC5_PROBLEM Group.
	 */
	public PRR_PC5_PROBLEM(Group parent, ModelClassFactory factory) {
	   super(parent, factory);
	   try {
	      this.add(PRB.class, true, false);
	      this.add(NTE.class, false, true);
	      this.add(VAR.class, false, true);
	      this.add(PRR_PC5_PROBLEM_ROLE.class, false, true);
	      this.add(PRR_PC5_PROBLEM_PATHWAY.class, false, true);
	      this.add(PRR_PC5_PROBLEM_OBSERVATION.class, false, true);
	      this.add(PRR_PC5_GOAL.class, false, true);
	      this.add(PRR_PC5_ORDER.class, false, true);
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error creating PRR_PC5_PROBLEM - this is probably a bug in the source code generator.", e);
	   }
	}

	/**
	 * Returns PRB (Problem Details) - creates it if necessary
	 */
	public PRB getPRB() { 
	   PRB ret = null;
	   try {
	      ret = (PRB)this.get("PRB");
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
	 * Returns  first repetition of VAR (Variance) - creates it if necessary
	 */
	public VAR getVAR() { 
	   VAR ret = null;
	   try {
	      ret = (VAR)this.get("VAR");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns a specific repetition of VAR
	 * (Variance) - creates it if necessary
	 * @throws HL7Exception if the repetition requested is more than one 
	 *     greater than the number of existing repetitions.
	 */
	public VAR getVAR(int rep) throws HL7Exception { 
	   return (VAR)this.get("VAR", rep);
	}

	/** 
	 * Returns the number of existing repetitions of VAR 
	 */ 
	public int getVARReps() { 
	    int reps = -1; 
	    try { 
	        reps = this.getAll("VAR").length; 
	    } catch (HL7Exception e) { 
	        String message = "Unexpected error accessing data - this is probably a bug in the source code generator."; 
	        HapiLogFactory.getHapiLog(this.getClass()).error(message, e); 
	        throw new RuntimeException(message);
	    } 
	    return reps; 
	} 

	/**
	 * Inserts a specific repetition of VAR
	 * (Variance)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public void  insertVAR(VAR structure, int rep) throws HL7Exception { 
	   super.insertRepetition( structure, rep);
	}

	/**
	 * Inserts a specific repetition of VAR
	 * (Variance)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public VAR insertVAR(int rep) throws HL7Exception { 
	   return (VAR)super.insertRepetition("VAR", rep);
	}

	/**
	 * Removes a specific repetition of VAR
	 * (Variance)
	 * @see AbstractGroup#insertremoveRepetition(String, int) 
	 */
	public VAR removeVAR(int rep) throws HL7Exception { 
	   return (VAR)super.removeRepetition("VAR", rep);
	}

	/**
	 * Returns  first repetition of PRR_PC5_PROBLEM_ROLE (a Group object) - creates it if necessary
	 */
	public PRR_PC5_PROBLEM_ROLE getPROBLEM_ROLE() { 
	   PRR_PC5_PROBLEM_ROLE ret = null;
	   try {
	      ret = (PRR_PC5_PROBLEM_ROLE)this.get("PROBLEM_ROLE");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns a specific repetition of PRR_PC5_PROBLEM_ROLE
	 * (a Group object) - creates it if necessary
	 * @throws HL7Exception if the repetition requested is more than one 
	 *     greater than the number of existing repetitions.
	 */
	public PRR_PC5_PROBLEM_ROLE getPROBLEM_ROLE(int rep) throws HL7Exception { 
	   return (PRR_PC5_PROBLEM_ROLE)this.get("PROBLEM_ROLE", rep);
	}

	/** 
	 * Returns the number of existing repetitions of PRR_PC5_PROBLEM_ROLE 
	 */ 
	public int getPROBLEM_ROLEReps() { 
	    int reps = -1; 
	    try { 
	        reps = this.getAll("PROBLEM_ROLE").length; 
	    } catch (HL7Exception e) { 
	        String message = "Unexpected error accessing data - this is probably a bug in the source code generator."; 
	        HapiLogFactory.getHapiLog(this.getClass()).error(message, e); 
	        throw new RuntimeException(message);
	    } 
	    return reps; 
	} 

	/**
	 * Inserts a specific repetition of PRR_PC5_PROBLEM_ROLE
	 * (a Group object)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public void  insertPROBLEM_ROLE(PRR_PC5_PROBLEM_ROLE structure, int rep) throws HL7Exception { 
	   super.insertRepetition( structure, rep);
	}

	/**
	 * Inserts a specific repetition of PRR_PC5_PROBLEM_ROLE
	 * (a Group object)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public PRR_PC5_PROBLEM_ROLE insertPROBLEM_ROLE(int rep) throws HL7Exception { 
	   return (PRR_PC5_PROBLEM_ROLE)super.insertRepetition("PROBLEM_ROLE", rep);
	}

	/**
	 * Removes a specific repetition of PRR_PC5_PROBLEM_ROLE
	 * (a Group object)
	 * @see AbstractGroup#insertremoveRepetition(String, int) 
	 */
	public PRR_PC5_PROBLEM_ROLE removePROBLEM_ROLE(int rep) throws HL7Exception { 
	   return (PRR_PC5_PROBLEM_ROLE)super.removeRepetition("PROBLEM_ROLE", rep);
	}

	/**
	 * Returns  first repetition of PRR_PC5_PROBLEM_PATHWAY (a Group object) - creates it if necessary
	 */
	public PRR_PC5_PROBLEM_PATHWAY getPROBLEM_PATHWAY() { 
	   PRR_PC5_PROBLEM_PATHWAY ret = null;
	   try {
	      ret = (PRR_PC5_PROBLEM_PATHWAY)this.get("PROBLEM_PATHWAY");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns a specific repetition of PRR_PC5_PROBLEM_PATHWAY
	 * (a Group object) - creates it if necessary
	 * @throws HL7Exception if the repetition requested is more than one 
	 *     greater than the number of existing repetitions.
	 */
	public PRR_PC5_PROBLEM_PATHWAY getPROBLEM_PATHWAY(int rep) throws HL7Exception { 
	   return (PRR_PC5_PROBLEM_PATHWAY)this.get("PROBLEM_PATHWAY", rep);
	}

	/** 
	 * Returns the number of existing repetitions of PRR_PC5_PROBLEM_PATHWAY 
	 */ 
	public int getPROBLEM_PATHWAYReps() { 
	    int reps = -1; 
	    try { 
	        reps = this.getAll("PROBLEM_PATHWAY").length; 
	    } catch (HL7Exception e) { 
	        String message = "Unexpected error accessing data - this is probably a bug in the source code generator."; 
	        HapiLogFactory.getHapiLog(this.getClass()).error(message, e); 
	        throw new RuntimeException(message);
	    } 
	    return reps; 
	} 

	/**
	 * Inserts a specific repetition of PRR_PC5_PROBLEM_PATHWAY
	 * (a Group object)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public void  insertPROBLEM_PATHWAY(PRR_PC5_PROBLEM_PATHWAY structure, int rep) throws HL7Exception { 
	   super.insertRepetition( structure, rep);
	}

	/**
	 * Inserts a specific repetition of PRR_PC5_PROBLEM_PATHWAY
	 * (a Group object)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public PRR_PC5_PROBLEM_PATHWAY insertPROBLEM_PATHWAY(int rep) throws HL7Exception { 
	   return (PRR_PC5_PROBLEM_PATHWAY)super.insertRepetition("PROBLEM_PATHWAY", rep);
	}

	/**
	 * Removes a specific repetition of PRR_PC5_PROBLEM_PATHWAY
	 * (a Group object)
	 * @see AbstractGroup#insertremoveRepetition(String, int) 
	 */
	public PRR_PC5_PROBLEM_PATHWAY removePROBLEM_PATHWAY(int rep) throws HL7Exception { 
	   return (PRR_PC5_PROBLEM_PATHWAY)super.removeRepetition("PROBLEM_PATHWAY", rep);
	}

	/**
	 * Returns  first repetition of PRR_PC5_PROBLEM_OBSERVATION (a Group object) - creates it if necessary
	 */
	public PRR_PC5_PROBLEM_OBSERVATION getPROBLEM_OBSERVATION() { 
	   PRR_PC5_PROBLEM_OBSERVATION ret = null;
	   try {
	      ret = (PRR_PC5_PROBLEM_OBSERVATION)this.get("PROBLEM_OBSERVATION");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns a specific repetition of PRR_PC5_PROBLEM_OBSERVATION
	 * (a Group object) - creates it if necessary
	 * @throws HL7Exception if the repetition requested is more than one 
	 *     greater than the number of existing repetitions.
	 */
	public PRR_PC5_PROBLEM_OBSERVATION getPROBLEM_OBSERVATION(int rep) throws HL7Exception { 
	   return (PRR_PC5_PROBLEM_OBSERVATION)this.get("PROBLEM_OBSERVATION", rep);
	}

	/** 
	 * Returns the number of existing repetitions of PRR_PC5_PROBLEM_OBSERVATION 
	 */ 
	public int getPROBLEM_OBSERVATIONReps() { 
	    int reps = -1; 
	    try { 
	        reps = this.getAll("PROBLEM_OBSERVATION").length; 
	    } catch (HL7Exception e) { 
	        String message = "Unexpected error accessing data - this is probably a bug in the source code generator."; 
	        HapiLogFactory.getHapiLog(this.getClass()).error(message, e); 
	        throw new RuntimeException(message);
	    } 
	    return reps; 
	} 

	/**
	 * Inserts a specific repetition of PRR_PC5_PROBLEM_OBSERVATION
	 * (a Group object)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public void  insertPROBLEM_OBSERVATION(PRR_PC5_PROBLEM_OBSERVATION structure, int rep) throws HL7Exception { 
	   super.insertRepetition( structure, rep);
	}

	/**
	 * Inserts a specific repetition of PRR_PC5_PROBLEM_OBSERVATION
	 * (a Group object)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public PRR_PC5_PROBLEM_OBSERVATION insertPROBLEM_OBSERVATION(int rep) throws HL7Exception { 
	   return (PRR_PC5_PROBLEM_OBSERVATION)super.insertRepetition("PROBLEM_OBSERVATION", rep);
	}

	/**
	 * Removes a specific repetition of PRR_PC5_PROBLEM_OBSERVATION
	 * (a Group object)
	 * @see AbstractGroup#insertremoveRepetition(String, int) 
	 */
	public PRR_PC5_PROBLEM_OBSERVATION removePROBLEM_OBSERVATION(int rep) throws HL7Exception { 
	   return (PRR_PC5_PROBLEM_OBSERVATION)super.removeRepetition("PROBLEM_OBSERVATION", rep);
	}

	/**
	 * Returns  first repetition of PRR_PC5_GOAL (a Group object) - creates it if necessary
	 */
	public PRR_PC5_GOAL getGOAL() { 
	   PRR_PC5_GOAL ret = null;
	   try {
	      ret = (PRR_PC5_GOAL)this.get("GOAL");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns a specific repetition of PRR_PC5_GOAL
	 * (a Group object) - creates it if necessary
	 * @throws HL7Exception if the repetition requested is more than one 
	 *     greater than the number of existing repetitions.
	 */
	public PRR_PC5_GOAL getGOAL(int rep) throws HL7Exception { 
	   return (PRR_PC5_GOAL)this.get("GOAL", rep);
	}

	/** 
	 * Returns the number of existing repetitions of PRR_PC5_GOAL 
	 */ 
	public int getGOALReps() { 
	    int reps = -1; 
	    try { 
	        reps = this.getAll("GOAL").length; 
	    } catch (HL7Exception e) { 
	        String message = "Unexpected error accessing data - this is probably a bug in the source code generator."; 
	        HapiLogFactory.getHapiLog(this.getClass()).error(message, e); 
	        throw new RuntimeException(message);
	    } 
	    return reps; 
	} 

	/**
	 * Inserts a specific repetition of PRR_PC5_GOAL
	 * (a Group object)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public void  insertGOAL(PRR_PC5_GOAL structure, int rep) throws HL7Exception { 
	   super.insertRepetition( structure, rep);
	}

	/**
	 * Inserts a specific repetition of PRR_PC5_GOAL
	 * (a Group object)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public PRR_PC5_GOAL insertGOAL(int rep) throws HL7Exception { 
	   return (PRR_PC5_GOAL)super.insertRepetition("GOAL", rep);
	}

	/**
	 * Removes a specific repetition of PRR_PC5_GOAL
	 * (a Group object)
	 * @see AbstractGroup#insertremoveRepetition(String, int) 
	 */
	public PRR_PC5_GOAL removeGOAL(int rep) throws HL7Exception { 
	   return (PRR_PC5_GOAL)super.removeRepetition("GOAL", rep);
	}

	/**
	 * Returns  first repetition of PRR_PC5_ORDER (a Group object) - creates it if necessary
	 */
	public PRR_PC5_ORDER getORDER() { 
	   PRR_PC5_ORDER ret = null;
	   try {
	      ret = (PRR_PC5_ORDER)this.get("ORDER");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns a specific repetition of PRR_PC5_ORDER
	 * (a Group object) - creates it if necessary
	 * @throws HL7Exception if the repetition requested is more than one 
	 *     greater than the number of existing repetitions.
	 */
	public PRR_PC5_ORDER getORDER(int rep) throws HL7Exception { 
	   return (PRR_PC5_ORDER)this.get("ORDER", rep);
	}

	/** 
	 * Returns the number of existing repetitions of PRR_PC5_ORDER 
	 */ 
	public int getORDERReps() { 
	    int reps = -1; 
	    try { 
	        reps = this.getAll("ORDER").length; 
	    } catch (HL7Exception e) { 
	        String message = "Unexpected error accessing data - this is probably a bug in the source code generator."; 
	        HapiLogFactory.getHapiLog(this.getClass()).error(message, e); 
	        throw new RuntimeException(message);
	    } 
	    return reps; 
	} 

	/**
	 * Inserts a specific repetition of PRR_PC5_ORDER
	 * (a Group object)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public void  insertORDER(PRR_PC5_ORDER structure, int rep) throws HL7Exception { 
	   super.insertRepetition( structure, rep);
	}

	/**
	 * Inserts a specific repetition of PRR_PC5_ORDER
	 * (a Group object)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public PRR_PC5_ORDER insertORDER(int rep) throws HL7Exception { 
	   return (PRR_PC5_ORDER)super.insertRepetition("ORDER", rep);
	}

	/**
	 * Removes a specific repetition of PRR_PC5_ORDER
	 * (a Group object)
	 * @see AbstractGroup#insertremoveRepetition(String, int) 
	 */
	public PRR_PC5_ORDER removeORDER(int rep) throws HL7Exception { 
	   return (PRR_PC5_ORDER)super.removeRepetition("ORDER", rep);
	}

}
