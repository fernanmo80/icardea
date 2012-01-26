package ca.uhn.hl7v2.model.v26.group;

import ca.uhn.hl7v2.parser.ModelClassFactory;
import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.log.HapiLogFactory;
import ca.uhn.hl7v2.model.v26.segment.*;

import ca.uhn.hl7v2.model.*;
/**
 * <p>Represents the PPG_PCG_PATHWAY Group.  A Group is an ordered collection of message 
 * segments that can repeat together or be optionally in/excluded together.
 * This Group contains the following elements: </p>
 * 0: PTH (Pathway) <b></b><br>
 * 1: NTE (Notes and Comments) <b>optional repeating</b><br>
 * 2: VAR (Variance) <b>optional repeating</b><br>
 * 3: PPG_PCG_PATHWAY_ROLE (a Group object) <b>optional repeating</b><br>
 * 4: PPG_PCG_GOAL (a Group object) <b>optional repeating</b><br>
 */
public class PPG_PCG_PATHWAY extends AbstractGroup {

	/** 
	 * Creates a new PPG_PCG_PATHWAY Group.
	 */
	public PPG_PCG_PATHWAY(Group parent, ModelClassFactory factory) {
	   super(parent, factory);
	   try {
	      this.add(PTH.class, true, false);
	      this.add(NTE.class, false, true);
	      this.add(VAR.class, false, true);
	      this.add(PPG_PCG_PATHWAY_ROLE.class, false, true);
	      this.add(PPG_PCG_GOAL.class, false, true);
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error creating PPG_PCG_PATHWAY - this is probably a bug in the source code generator.", e);
	   }
	}

	/**
	 * Returns PTH (Pathway) - creates it if necessary
	 */
	public PTH getPTH() { 
	   PTH ret = null;
	   try {
	      ret = (PTH)this.get("PTH");
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
	 * Returns  first repetition of PPG_PCG_PATHWAY_ROLE (a Group object) - creates it if necessary
	 */
	public PPG_PCG_PATHWAY_ROLE getPATHWAY_ROLE() { 
	   PPG_PCG_PATHWAY_ROLE ret = null;
	   try {
	      ret = (PPG_PCG_PATHWAY_ROLE)this.get("PATHWAY_ROLE");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns a specific repetition of PPG_PCG_PATHWAY_ROLE
	 * (a Group object) - creates it if necessary
	 * @throws HL7Exception if the repetition requested is more than one 
	 *     greater than the number of existing repetitions.
	 */
	public PPG_PCG_PATHWAY_ROLE getPATHWAY_ROLE(int rep) throws HL7Exception { 
	   return (PPG_PCG_PATHWAY_ROLE)this.get("PATHWAY_ROLE", rep);
	}

	/** 
	 * Returns the number of existing repetitions of PPG_PCG_PATHWAY_ROLE 
	 */ 
	public int getPATHWAY_ROLEReps() { 
	    int reps = -1; 
	    try { 
	        reps = this.getAll("PATHWAY_ROLE").length; 
	    } catch (HL7Exception e) { 
	        String message = "Unexpected error accessing data - this is probably a bug in the source code generator."; 
	        HapiLogFactory.getHapiLog(this.getClass()).error(message, e); 
	        throw new RuntimeException(message);
	    } 
	    return reps; 
	} 

	/**
	 * Inserts a specific repetition of PPG_PCG_PATHWAY_ROLE
	 * (a Group object)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public void  insertPATHWAY_ROLE(PPG_PCG_PATHWAY_ROLE structure, int rep) throws HL7Exception { 
	   super.insertRepetition( structure, rep);
	}

	/**
	 * Inserts a specific repetition of PPG_PCG_PATHWAY_ROLE
	 * (a Group object)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public PPG_PCG_PATHWAY_ROLE insertPATHWAY_ROLE(int rep) throws HL7Exception { 
	   return (PPG_PCG_PATHWAY_ROLE)super.insertRepetition("PATHWAY_ROLE", rep);
	}

	/**
	 * Removes a specific repetition of PPG_PCG_PATHWAY_ROLE
	 * (a Group object)
	 * @see AbstractGroup#insertremoveRepetition(String, int) 
	 */
	public PPG_PCG_PATHWAY_ROLE removePATHWAY_ROLE(int rep) throws HL7Exception { 
	   return (PPG_PCG_PATHWAY_ROLE)super.removeRepetition("PATHWAY_ROLE", rep);
	}

	/**
	 * Returns  first repetition of PPG_PCG_GOAL (a Group object) - creates it if necessary
	 */
	public PPG_PCG_GOAL getGOAL() { 
	   PPG_PCG_GOAL ret = null;
	   try {
	      ret = (PPG_PCG_GOAL)this.get("GOAL");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns a specific repetition of PPG_PCG_GOAL
	 * (a Group object) - creates it if necessary
	 * @throws HL7Exception if the repetition requested is more than one 
	 *     greater than the number of existing repetitions.
	 */
	public PPG_PCG_GOAL getGOAL(int rep) throws HL7Exception { 
	   return (PPG_PCG_GOAL)this.get("GOAL", rep);
	}

	/** 
	 * Returns the number of existing repetitions of PPG_PCG_GOAL 
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
	 * Inserts a specific repetition of PPG_PCG_GOAL
	 * (a Group object)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public void  insertGOAL(PPG_PCG_GOAL structure, int rep) throws HL7Exception { 
	   super.insertRepetition( structure, rep);
	}

	/**
	 * Inserts a specific repetition of PPG_PCG_GOAL
	 * (a Group object)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public PPG_PCG_GOAL insertGOAL(int rep) throws HL7Exception { 
	   return (PPG_PCG_GOAL)super.insertRepetition("GOAL", rep);
	}

	/**
	 * Removes a specific repetition of PPG_PCG_GOAL
	 * (a Group object)
	 * @see AbstractGroup#insertremoveRepetition(String, int) 
	 */
	public PPG_PCG_GOAL removeGOAL(int rep) throws HL7Exception { 
	   return (PPG_PCG_GOAL)super.removeRepetition("GOAL", rep);
	}

}
