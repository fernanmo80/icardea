package ca.uhn.hl7v2.model.v26.group;

import ca.uhn.hl7v2.parser.ModelClassFactory;
import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.log.HapiLogFactory;
import ca.uhn.hl7v2.model.v26.segment.*;

import ca.uhn.hl7v2.model.*;
/**
 * <p>Represents the MFR_M06_MF_QUERY Group.  A Group is an ordered collection of message 
 * segments that can repeat together or be optionally in/excluded together.
 * This Group contains the following elements: </p>
 * 0: MFE (Master File Entry) <b></b><br>
 * 1: CM0 (Clinical Study Master) <b></b><br>
 * 2: MFR_M06_MF_PHASE_SCHED_DETAIL (a Group object) <b>optional repeating</b><br>
 */
public class MFR_M06_MF_QUERY extends AbstractGroup {

	/** 
	 * Creates a new MFR_M06_MF_QUERY Group.
	 */
	public MFR_M06_MF_QUERY(Group parent, ModelClassFactory factory) {
	   super(parent, factory);
	   try {
	      this.add(MFE.class, true, false);
	      this.add(CM0.class, true, false);
	      this.add(MFR_M06_MF_PHASE_SCHED_DETAIL.class, false, true);
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error creating MFR_M06_MF_QUERY - this is probably a bug in the source code generator.", e);
	   }
	}

	/**
	 * Returns MFE (Master File Entry) - creates it if necessary
	 */
	public MFE getMFE() { 
	   MFE ret = null;
	   try {
	      ret = (MFE)this.get("MFE");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns CM0 (Clinical Study Master) - creates it if necessary
	 */
	public CM0 getCM0() { 
	   CM0 ret = null;
	   try {
	      ret = (CM0)this.get("CM0");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns  first repetition of MFR_M06_MF_PHASE_SCHED_DETAIL (a Group object) - creates it if necessary
	 */
	public MFR_M06_MF_PHASE_SCHED_DETAIL getMF_PHASE_SCHED_DETAIL() { 
	   MFR_M06_MF_PHASE_SCHED_DETAIL ret = null;
	   try {
	      ret = (MFR_M06_MF_PHASE_SCHED_DETAIL)this.get("MF_PHASE_SCHED_DETAIL");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns a specific repetition of MFR_M06_MF_PHASE_SCHED_DETAIL
	 * (a Group object) - creates it if necessary
	 * @throws HL7Exception if the repetition requested is more than one 
	 *     greater than the number of existing repetitions.
	 */
	public MFR_M06_MF_PHASE_SCHED_DETAIL getMF_PHASE_SCHED_DETAIL(int rep) throws HL7Exception { 
	   return (MFR_M06_MF_PHASE_SCHED_DETAIL)this.get("MF_PHASE_SCHED_DETAIL", rep);
	}

	/** 
	 * Returns the number of existing repetitions of MFR_M06_MF_PHASE_SCHED_DETAIL 
	 */ 
	public int getMF_PHASE_SCHED_DETAILReps() { 
	    int reps = -1; 
	    try { 
	        reps = this.getAll("MF_PHASE_SCHED_DETAIL").length; 
	    } catch (HL7Exception e) { 
	        String message = "Unexpected error accessing data - this is probably a bug in the source code generator."; 
	        HapiLogFactory.getHapiLog(this.getClass()).error(message, e); 
	        throw new RuntimeException(message);
	    } 
	    return reps; 
	} 

	/**
	 * Inserts a specific repetition of MFR_M06_MF_PHASE_SCHED_DETAIL
	 * (a Group object)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public void  insertMF_PHASE_SCHED_DETAIL(MFR_M06_MF_PHASE_SCHED_DETAIL structure, int rep) throws HL7Exception { 
	   super.insertRepetition( structure, rep);
	}

	/**
	 * Inserts a specific repetition of MFR_M06_MF_PHASE_SCHED_DETAIL
	 * (a Group object)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public MFR_M06_MF_PHASE_SCHED_DETAIL insertMF_PHASE_SCHED_DETAIL(int rep) throws HL7Exception { 
	   return (MFR_M06_MF_PHASE_SCHED_DETAIL)super.insertRepetition("MF_PHASE_SCHED_DETAIL", rep);
	}

	/**
	 * Removes a specific repetition of MFR_M06_MF_PHASE_SCHED_DETAIL
	 * (a Group object)
	 * @see AbstractGroup#insertremoveRepetition(String, int) 
	 */
	public MFR_M06_MF_PHASE_SCHED_DETAIL removeMF_PHASE_SCHED_DETAIL(int rep) throws HL7Exception { 
	   return (MFR_M06_MF_PHASE_SCHED_DETAIL)super.removeRepetition("MF_PHASE_SCHED_DETAIL", rep);
	}

}
