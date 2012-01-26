package ca.uhn.hl7v2.model.v26.group;

import ca.uhn.hl7v2.parser.ModelClassFactory;
import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.log.HapiLogFactory;
import ca.uhn.hl7v2.model.v26.segment.*;

import ca.uhn.hl7v2.model.*;
/**
 * <p>Represents the PTR_PCF_PROBLEM Group.  A Group is an ordered collection of message 
 * segments that can repeat together or be optionally in/excluded together.
 * This Group contains the following elements: </p>
 * 0: PRB (Problem Details) <b></b><br>
 * 1: NTE (Notes and Comments) <b>optional repeating</b><br>
 * 2: VAR (Variance) <b>optional repeating</b><br>
 * 3: PTR_PCF_PROBLEM_ROLE (a Group object) <b>optional repeating</b><br>
 * 4: PTR_PCF_PROBLEM_OBSERVATION (a Group object) <b>optional repeating</b><br>
 * 5: PTR_PCF_GOAL (a Group object) <b>optional repeating</b><br>
 * 6: PTR_PCF_ORDER (a Group object) <b>optional repeating</b><br>
 */
public class PTR_PCF_PROBLEM extends AbstractGroup {

	/** 
	 * Creates a new PTR_PCF_PROBLEM Group.
	 */
	public PTR_PCF_PROBLEM(Group parent, ModelClassFactory factory) {
	   super(parent, factory);
	   try {
	      this.add(PRB.class, true, false);
	      this.add(NTE.class, false, true);
	      this.add(VAR.class, false, true);
	      this.add(PTR_PCF_PROBLEM_ROLE.class, false, true);
	      this.add(PTR_PCF_PROBLEM_OBSERVATION.class, false, true);
	      this.add(PTR_PCF_GOAL.class, false, true);
	      this.add(PTR_PCF_ORDER.class, false, true);
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error creating PTR_PCF_PROBLEM - this is probably a bug in the source code generator.", e);
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
	 * Returns  first repetition of PTR_PCF_PROBLEM_ROLE (a Group object) - creates it if necessary
	 */
	public PTR_PCF_PROBLEM_ROLE getPROBLEM_ROLE() { 
	   PTR_PCF_PROBLEM_ROLE ret = null;
	   try {
	      ret = (PTR_PCF_PROBLEM_ROLE)this.get("PROBLEM_ROLE");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns a specific repetition of PTR_PCF_PROBLEM_ROLE
	 * (a Group object) - creates it if necessary
	 * @throws HL7Exception if the repetition requested is more than one 
	 *     greater than the number of existing repetitions.
	 */
	public PTR_PCF_PROBLEM_ROLE getPROBLEM_ROLE(int rep) throws HL7Exception { 
	   return (PTR_PCF_PROBLEM_ROLE)this.get("PROBLEM_ROLE", rep);
	}

	/** 
	 * Returns the number of existing repetitions of PTR_PCF_PROBLEM_ROLE 
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
	 * Inserts a specific repetition of PTR_PCF_PROBLEM_ROLE
	 * (a Group object)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public void  insertPROBLEM_ROLE(PTR_PCF_PROBLEM_ROLE structure, int rep) throws HL7Exception { 
	   super.insertRepetition( structure, rep);
	}

	/**
	 * Inserts a specific repetition of PTR_PCF_PROBLEM_ROLE
	 * (a Group object)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public PTR_PCF_PROBLEM_ROLE insertPROBLEM_ROLE(int rep) throws HL7Exception { 
	   return (PTR_PCF_PROBLEM_ROLE)super.insertRepetition("PROBLEM_ROLE", rep);
	}

	/**
	 * Removes a specific repetition of PTR_PCF_PROBLEM_ROLE
	 * (a Group object)
	 * @see AbstractGroup#insertremoveRepetition(String, int) 
	 */
	public PTR_PCF_PROBLEM_ROLE removePROBLEM_ROLE(int rep) throws HL7Exception { 
	   return (PTR_PCF_PROBLEM_ROLE)super.removeRepetition("PROBLEM_ROLE", rep);
	}

	/**
	 * Returns  first repetition of PTR_PCF_PROBLEM_OBSERVATION (a Group object) - creates it if necessary
	 */
	public PTR_PCF_PROBLEM_OBSERVATION getPROBLEM_OBSERVATION() { 
	   PTR_PCF_PROBLEM_OBSERVATION ret = null;
	   try {
	      ret = (PTR_PCF_PROBLEM_OBSERVATION)this.get("PROBLEM_OBSERVATION");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns a specific repetition of PTR_PCF_PROBLEM_OBSERVATION
	 * (a Group object) - creates it if necessary
	 * @throws HL7Exception if the repetition requested is more than one 
	 *     greater than the number of existing repetitions.
	 */
	public PTR_PCF_PROBLEM_OBSERVATION getPROBLEM_OBSERVATION(int rep) throws HL7Exception { 
	   return (PTR_PCF_PROBLEM_OBSERVATION)this.get("PROBLEM_OBSERVATION", rep);
	}

	/** 
	 * Returns the number of existing repetitions of PTR_PCF_PROBLEM_OBSERVATION 
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
	 * Inserts a specific repetition of PTR_PCF_PROBLEM_OBSERVATION
	 * (a Group object)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public void  insertPROBLEM_OBSERVATION(PTR_PCF_PROBLEM_OBSERVATION structure, int rep) throws HL7Exception { 
	   super.insertRepetition( structure, rep);
	}

	/**
	 * Inserts a specific repetition of PTR_PCF_PROBLEM_OBSERVATION
	 * (a Group object)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public PTR_PCF_PROBLEM_OBSERVATION insertPROBLEM_OBSERVATION(int rep) throws HL7Exception { 
	   return (PTR_PCF_PROBLEM_OBSERVATION)super.insertRepetition("PROBLEM_OBSERVATION", rep);
	}

	/**
	 * Removes a specific repetition of PTR_PCF_PROBLEM_OBSERVATION
	 * (a Group object)
	 * @see AbstractGroup#insertremoveRepetition(String, int) 
	 */
	public PTR_PCF_PROBLEM_OBSERVATION removePROBLEM_OBSERVATION(int rep) throws HL7Exception { 
	   return (PTR_PCF_PROBLEM_OBSERVATION)super.removeRepetition("PROBLEM_OBSERVATION", rep);
	}

	/**
	 * Returns  first repetition of PTR_PCF_GOAL (a Group object) - creates it if necessary
	 */
	public PTR_PCF_GOAL getGOAL() { 
	   PTR_PCF_GOAL ret = null;
	   try {
	      ret = (PTR_PCF_GOAL)this.get("GOAL");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns a specific repetition of PTR_PCF_GOAL
	 * (a Group object) - creates it if necessary
	 * @throws HL7Exception if the repetition requested is more than one 
	 *     greater than the number of existing repetitions.
	 */
	public PTR_PCF_GOAL getGOAL(int rep) throws HL7Exception { 
	   return (PTR_PCF_GOAL)this.get("GOAL", rep);
	}

	/** 
	 * Returns the number of existing repetitions of PTR_PCF_GOAL 
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
	 * Inserts a specific repetition of PTR_PCF_GOAL
	 * (a Group object)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public void  insertGOAL(PTR_PCF_GOAL structure, int rep) throws HL7Exception { 
	   super.insertRepetition( structure, rep);
	}

	/**
	 * Inserts a specific repetition of PTR_PCF_GOAL
	 * (a Group object)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public PTR_PCF_GOAL insertGOAL(int rep) throws HL7Exception { 
	   return (PTR_PCF_GOAL)super.insertRepetition("GOAL", rep);
	}

	/**
	 * Removes a specific repetition of PTR_PCF_GOAL
	 * (a Group object)
	 * @see AbstractGroup#insertremoveRepetition(String, int) 
	 */
	public PTR_PCF_GOAL removeGOAL(int rep) throws HL7Exception { 
	   return (PTR_PCF_GOAL)super.removeRepetition("GOAL", rep);
	}

	/**
	 * Returns  first repetition of PTR_PCF_ORDER (a Group object) - creates it if necessary
	 */
	public PTR_PCF_ORDER getORDER() { 
	   PTR_PCF_ORDER ret = null;
	   try {
	      ret = (PTR_PCF_ORDER)this.get("ORDER");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns a specific repetition of PTR_PCF_ORDER
	 * (a Group object) - creates it if necessary
	 * @throws HL7Exception if the repetition requested is more than one 
	 *     greater than the number of existing repetitions.
	 */
	public PTR_PCF_ORDER getORDER(int rep) throws HL7Exception { 
	   return (PTR_PCF_ORDER)this.get("ORDER", rep);
	}

	/** 
	 * Returns the number of existing repetitions of PTR_PCF_ORDER 
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
	 * Inserts a specific repetition of PTR_PCF_ORDER
	 * (a Group object)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public void  insertORDER(PTR_PCF_ORDER structure, int rep) throws HL7Exception { 
	   super.insertRepetition( structure, rep);
	}

	/**
	 * Inserts a specific repetition of PTR_PCF_ORDER
	 * (a Group object)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public PTR_PCF_ORDER insertORDER(int rep) throws HL7Exception { 
	   return (PTR_PCF_ORDER)super.insertRepetition("ORDER", rep);
	}

	/**
	 * Removes a specific repetition of PTR_PCF_ORDER
	 * (a Group object)
	 * @see AbstractGroup#insertremoveRepetition(String, int) 
	 */
	public PTR_PCF_ORDER removeORDER(int rep) throws HL7Exception { 
	   return (PTR_PCF_ORDER)super.removeRepetition("ORDER", rep);
	}

}
