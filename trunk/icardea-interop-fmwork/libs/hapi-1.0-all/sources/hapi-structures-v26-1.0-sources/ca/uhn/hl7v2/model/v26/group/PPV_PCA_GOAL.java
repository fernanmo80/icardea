package ca.uhn.hl7v2.model.v26.group;

import ca.uhn.hl7v2.parser.ModelClassFactory;
import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.log.HapiLogFactory;
import ca.uhn.hl7v2.model.v26.segment.*;

import ca.uhn.hl7v2.model.*;
/**
 * <p>Represents the PPV_PCA_GOAL Group.  A Group is an ordered collection of message 
 * segments that can repeat together or be optionally in/excluded together.
 * This Group contains the following elements: </p>
 * 0: GOL (Goal Detail) <b></b><br>
 * 1: NTE (Notes and Comments) <b>optional repeating</b><br>
 * 2: VAR (Variance) <b>optional repeating</b><br>
 * 3: PPV_PCA_GOAL_ROLE (a Group object) <b>optional repeating</b><br>
 * 4: PPV_PCA_GOAL_PATHWAY (a Group object) <b>optional repeating</b><br>
 * 5: PPV_PCA_GOAL_OBSERVATION (a Group object) <b>optional repeating</b><br>
 * 6: PPV_PCA_PROBLEM (a Group object) <b>optional repeating</b><br>
 * 7: PPV_PCA_ORDER (a Group object) <b>optional repeating</b><br>
 */
public class PPV_PCA_GOAL extends AbstractGroup {

	/** 
	 * Creates a new PPV_PCA_GOAL Group.
	 */
	public PPV_PCA_GOAL(Group parent, ModelClassFactory factory) {
	   super(parent, factory);
	   try {
	      this.add(GOL.class, true, false);
	      this.add(NTE.class, false, true);
	      this.add(VAR.class, false, true);
	      this.add(PPV_PCA_GOAL_ROLE.class, false, true);
	      this.add(PPV_PCA_GOAL_PATHWAY.class, false, true);
	      this.add(PPV_PCA_GOAL_OBSERVATION.class, false, true);
	      this.add(PPV_PCA_PROBLEM.class, false, true);
	      this.add(PPV_PCA_ORDER.class, false, true);
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error creating PPV_PCA_GOAL - this is probably a bug in the source code generator.", e);
	   }
	}

	/**
	 * Returns GOL (Goal Detail) - creates it if necessary
	 */
	public GOL getGOL() { 
	   GOL ret = null;
	   try {
	      ret = (GOL)this.get("GOL");
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
	 * Returns  first repetition of PPV_PCA_GOAL_ROLE (a Group object) - creates it if necessary
	 */
	public PPV_PCA_GOAL_ROLE getGOAL_ROLE() { 
	   PPV_PCA_GOAL_ROLE ret = null;
	   try {
	      ret = (PPV_PCA_GOAL_ROLE)this.get("GOAL_ROLE");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns a specific repetition of PPV_PCA_GOAL_ROLE
	 * (a Group object) - creates it if necessary
	 * @throws HL7Exception if the repetition requested is more than one 
	 *     greater than the number of existing repetitions.
	 */
	public PPV_PCA_GOAL_ROLE getGOAL_ROLE(int rep) throws HL7Exception { 
	   return (PPV_PCA_GOAL_ROLE)this.get("GOAL_ROLE", rep);
	}

	/** 
	 * Returns the number of existing repetitions of PPV_PCA_GOAL_ROLE 
	 */ 
	public int getGOAL_ROLEReps() { 
	    int reps = -1; 
	    try { 
	        reps = this.getAll("GOAL_ROLE").length; 
	    } catch (HL7Exception e) { 
	        String message = "Unexpected error accessing data - this is probably a bug in the source code generator."; 
	        HapiLogFactory.getHapiLog(this.getClass()).error(message, e); 
	        throw new RuntimeException(message);
	    } 
	    return reps; 
	} 

	/**
	 * Inserts a specific repetition of PPV_PCA_GOAL_ROLE
	 * (a Group object)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public void  insertGOAL_ROLE(PPV_PCA_GOAL_ROLE structure, int rep) throws HL7Exception { 
	   super.insertRepetition( structure, rep);
	}

	/**
	 * Inserts a specific repetition of PPV_PCA_GOAL_ROLE
	 * (a Group object)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public PPV_PCA_GOAL_ROLE insertGOAL_ROLE(int rep) throws HL7Exception { 
	   return (PPV_PCA_GOAL_ROLE)super.insertRepetition("GOAL_ROLE", rep);
	}

	/**
	 * Removes a specific repetition of PPV_PCA_GOAL_ROLE
	 * (a Group object)
	 * @see AbstractGroup#insertremoveRepetition(String, int) 
	 */
	public PPV_PCA_GOAL_ROLE removeGOAL_ROLE(int rep) throws HL7Exception { 
	   return (PPV_PCA_GOAL_ROLE)super.removeRepetition("GOAL_ROLE", rep);
	}

	/**
	 * Returns  first repetition of PPV_PCA_GOAL_PATHWAY (a Group object) - creates it if necessary
	 */
	public PPV_PCA_GOAL_PATHWAY getGOAL_PATHWAY() { 
	   PPV_PCA_GOAL_PATHWAY ret = null;
	   try {
	      ret = (PPV_PCA_GOAL_PATHWAY)this.get("GOAL_PATHWAY");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns a specific repetition of PPV_PCA_GOAL_PATHWAY
	 * (a Group object) - creates it if necessary
	 * @throws HL7Exception if the repetition requested is more than one 
	 *     greater than the number of existing repetitions.
	 */
	public PPV_PCA_GOAL_PATHWAY getGOAL_PATHWAY(int rep) throws HL7Exception { 
	   return (PPV_PCA_GOAL_PATHWAY)this.get("GOAL_PATHWAY", rep);
	}

	/** 
	 * Returns the number of existing repetitions of PPV_PCA_GOAL_PATHWAY 
	 */ 
	public int getGOAL_PATHWAYReps() { 
	    int reps = -1; 
	    try { 
	        reps = this.getAll("GOAL_PATHWAY").length; 
	    } catch (HL7Exception e) { 
	        String message = "Unexpected error accessing data - this is probably a bug in the source code generator."; 
	        HapiLogFactory.getHapiLog(this.getClass()).error(message, e); 
	        throw new RuntimeException(message);
	    } 
	    return reps; 
	} 

	/**
	 * Inserts a specific repetition of PPV_PCA_GOAL_PATHWAY
	 * (a Group object)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public void  insertGOAL_PATHWAY(PPV_PCA_GOAL_PATHWAY structure, int rep) throws HL7Exception { 
	   super.insertRepetition( structure, rep);
	}

	/**
	 * Inserts a specific repetition of PPV_PCA_GOAL_PATHWAY
	 * (a Group object)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public PPV_PCA_GOAL_PATHWAY insertGOAL_PATHWAY(int rep) throws HL7Exception { 
	   return (PPV_PCA_GOAL_PATHWAY)super.insertRepetition("GOAL_PATHWAY", rep);
	}

	/**
	 * Removes a specific repetition of PPV_PCA_GOAL_PATHWAY
	 * (a Group object)
	 * @see AbstractGroup#insertremoveRepetition(String, int) 
	 */
	public PPV_PCA_GOAL_PATHWAY removeGOAL_PATHWAY(int rep) throws HL7Exception { 
	   return (PPV_PCA_GOAL_PATHWAY)super.removeRepetition("GOAL_PATHWAY", rep);
	}

	/**
	 * Returns  first repetition of PPV_PCA_GOAL_OBSERVATION (a Group object) - creates it if necessary
	 */
	public PPV_PCA_GOAL_OBSERVATION getGOAL_OBSERVATION() { 
	   PPV_PCA_GOAL_OBSERVATION ret = null;
	   try {
	      ret = (PPV_PCA_GOAL_OBSERVATION)this.get("GOAL_OBSERVATION");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns a specific repetition of PPV_PCA_GOAL_OBSERVATION
	 * (a Group object) - creates it if necessary
	 * @throws HL7Exception if the repetition requested is more than one 
	 *     greater than the number of existing repetitions.
	 */
	public PPV_PCA_GOAL_OBSERVATION getGOAL_OBSERVATION(int rep) throws HL7Exception { 
	   return (PPV_PCA_GOAL_OBSERVATION)this.get("GOAL_OBSERVATION", rep);
	}

	/** 
	 * Returns the number of existing repetitions of PPV_PCA_GOAL_OBSERVATION 
	 */ 
	public int getGOAL_OBSERVATIONReps() { 
	    int reps = -1; 
	    try { 
	        reps = this.getAll("GOAL_OBSERVATION").length; 
	    } catch (HL7Exception e) { 
	        String message = "Unexpected error accessing data - this is probably a bug in the source code generator."; 
	        HapiLogFactory.getHapiLog(this.getClass()).error(message, e); 
	        throw new RuntimeException(message);
	    } 
	    return reps; 
	} 

	/**
	 * Inserts a specific repetition of PPV_PCA_GOAL_OBSERVATION
	 * (a Group object)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public void  insertGOAL_OBSERVATION(PPV_PCA_GOAL_OBSERVATION structure, int rep) throws HL7Exception { 
	   super.insertRepetition( structure, rep);
	}

	/**
	 * Inserts a specific repetition of PPV_PCA_GOAL_OBSERVATION
	 * (a Group object)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public PPV_PCA_GOAL_OBSERVATION insertGOAL_OBSERVATION(int rep) throws HL7Exception { 
	   return (PPV_PCA_GOAL_OBSERVATION)super.insertRepetition("GOAL_OBSERVATION", rep);
	}

	/**
	 * Removes a specific repetition of PPV_PCA_GOAL_OBSERVATION
	 * (a Group object)
	 * @see AbstractGroup#insertremoveRepetition(String, int) 
	 */
	public PPV_PCA_GOAL_OBSERVATION removeGOAL_OBSERVATION(int rep) throws HL7Exception { 
	   return (PPV_PCA_GOAL_OBSERVATION)super.removeRepetition("GOAL_OBSERVATION", rep);
	}

	/**
	 * Returns  first repetition of PPV_PCA_PROBLEM (a Group object) - creates it if necessary
	 */
	public PPV_PCA_PROBLEM getPROBLEM() { 
	   PPV_PCA_PROBLEM ret = null;
	   try {
	      ret = (PPV_PCA_PROBLEM)this.get("PROBLEM");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns a specific repetition of PPV_PCA_PROBLEM
	 * (a Group object) - creates it if necessary
	 * @throws HL7Exception if the repetition requested is more than one 
	 *     greater than the number of existing repetitions.
	 */
	public PPV_PCA_PROBLEM getPROBLEM(int rep) throws HL7Exception { 
	   return (PPV_PCA_PROBLEM)this.get("PROBLEM", rep);
	}

	/** 
	 * Returns the number of existing repetitions of PPV_PCA_PROBLEM 
	 */ 
	public int getPROBLEMReps() { 
	    int reps = -1; 
	    try { 
	        reps = this.getAll("PROBLEM").length; 
	    } catch (HL7Exception e) { 
	        String message = "Unexpected error accessing data - this is probably a bug in the source code generator."; 
	        HapiLogFactory.getHapiLog(this.getClass()).error(message, e); 
	        throw new RuntimeException(message);
	    } 
	    return reps; 
	} 

	/**
	 * Inserts a specific repetition of PPV_PCA_PROBLEM
	 * (a Group object)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public void  insertPROBLEM(PPV_PCA_PROBLEM structure, int rep) throws HL7Exception { 
	   super.insertRepetition( structure, rep);
	}

	/**
	 * Inserts a specific repetition of PPV_PCA_PROBLEM
	 * (a Group object)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public PPV_PCA_PROBLEM insertPROBLEM(int rep) throws HL7Exception { 
	   return (PPV_PCA_PROBLEM)super.insertRepetition("PROBLEM", rep);
	}

	/**
	 * Removes a specific repetition of PPV_PCA_PROBLEM
	 * (a Group object)
	 * @see AbstractGroup#insertremoveRepetition(String, int) 
	 */
	public PPV_PCA_PROBLEM removePROBLEM(int rep) throws HL7Exception { 
	   return (PPV_PCA_PROBLEM)super.removeRepetition("PROBLEM", rep);
	}

	/**
	 * Returns  first repetition of PPV_PCA_ORDER (a Group object) - creates it if necessary
	 */
	public PPV_PCA_ORDER getORDER() { 
	   PPV_PCA_ORDER ret = null;
	   try {
	      ret = (PPV_PCA_ORDER)this.get("ORDER");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns a specific repetition of PPV_PCA_ORDER
	 * (a Group object) - creates it if necessary
	 * @throws HL7Exception if the repetition requested is more than one 
	 *     greater than the number of existing repetitions.
	 */
	public PPV_PCA_ORDER getORDER(int rep) throws HL7Exception { 
	   return (PPV_PCA_ORDER)this.get("ORDER", rep);
	}

	/** 
	 * Returns the number of existing repetitions of PPV_PCA_ORDER 
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
	 * Inserts a specific repetition of PPV_PCA_ORDER
	 * (a Group object)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public void  insertORDER(PPV_PCA_ORDER structure, int rep) throws HL7Exception { 
	   super.insertRepetition( structure, rep);
	}

	/**
	 * Inserts a specific repetition of PPV_PCA_ORDER
	 * (a Group object)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public PPV_PCA_ORDER insertORDER(int rep) throws HL7Exception { 
	   return (PPV_PCA_ORDER)super.insertRepetition("ORDER", rep);
	}

	/**
	 * Removes a specific repetition of PPV_PCA_ORDER
	 * (a Group object)
	 * @see AbstractGroup#insertremoveRepetition(String, int) 
	 */
	public PPV_PCA_ORDER removeORDER(int rep) throws HL7Exception { 
	   return (PPV_PCA_ORDER)super.removeRepetition("ORDER", rep);
	}

}