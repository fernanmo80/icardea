package ca.uhn.hl7v2.model.v26.group;

import ca.uhn.hl7v2.parser.ModelClassFactory;
import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.log.HapiLogFactory;
import ca.uhn.hl7v2.model.v26.segment.*;

import ca.uhn.hl7v2.model.*;
/**
 * <p>Represents the OPU_R25_PATIENT Group.  A Group is an ordered collection of message 
 * segments that can repeat together or be optionally in/excluded together.
 * This Group contains the following elements: </p>
 * 0: PID (Patient Identification) <b></b><br>
 * 1: PD1 (Patient Additional Demographic) <b>optional </b><br>
 * 2: OPU_R25_PATIENT_OBSERVATION (a Group object) <b>optional repeating</b><br>
 */
public class OPU_R25_PATIENT extends AbstractGroup {

	/** 
	 * Creates a new OPU_R25_PATIENT Group.
	 */
	public OPU_R25_PATIENT(Group parent, ModelClassFactory factory) {
	   super(parent, factory);
	   try {
	      this.add(PID.class, true, false);
	      this.add(PD1.class, false, false);
	      this.add(OPU_R25_PATIENT_OBSERVATION.class, false, true);
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error creating OPU_R25_PATIENT - this is probably a bug in the source code generator.", e);
	   }
	}

	/**
	 * Returns PID (Patient Identification) - creates it if necessary
	 */
	public PID getPID() { 
	   PID ret = null;
	   try {
	      ret = (PID)this.get("PID");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns PD1 (Patient Additional Demographic) - creates it if necessary
	 */
	public PD1 getPD1() { 
	   PD1 ret = null;
	   try {
	      ret = (PD1)this.get("PD1");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns  first repetition of OPU_R25_PATIENT_OBSERVATION (a Group object) - creates it if necessary
	 */
	public OPU_R25_PATIENT_OBSERVATION getPATIENT_OBSERVATION() { 
	   OPU_R25_PATIENT_OBSERVATION ret = null;
	   try {
	      ret = (OPU_R25_PATIENT_OBSERVATION)this.get("PATIENT_OBSERVATION");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns a specific repetition of OPU_R25_PATIENT_OBSERVATION
	 * (a Group object) - creates it if necessary
	 * @throws HL7Exception if the repetition requested is more than one 
	 *     greater than the number of existing repetitions.
	 */
	public OPU_R25_PATIENT_OBSERVATION getPATIENT_OBSERVATION(int rep) throws HL7Exception { 
	   return (OPU_R25_PATIENT_OBSERVATION)this.get("PATIENT_OBSERVATION", rep);
	}

	/** 
	 * Returns the number of existing repetitions of OPU_R25_PATIENT_OBSERVATION 
	 */ 
	public int getPATIENT_OBSERVATIONReps() { 
	    int reps = -1; 
	    try { 
	        reps = this.getAll("PATIENT_OBSERVATION").length; 
	    } catch (HL7Exception e) { 
	        String message = "Unexpected error accessing data - this is probably a bug in the source code generator."; 
	        HapiLogFactory.getHapiLog(this.getClass()).error(message, e); 
	        throw new RuntimeException(message);
	    } 
	    return reps; 
	} 

	/**
	 * Inserts a specific repetition of OPU_R25_PATIENT_OBSERVATION
	 * (a Group object)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public void  insertPATIENT_OBSERVATION(OPU_R25_PATIENT_OBSERVATION structure, int rep) throws HL7Exception { 
	   super.insertRepetition( structure, rep);
	}

	/**
	 * Inserts a specific repetition of OPU_R25_PATIENT_OBSERVATION
	 * (a Group object)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public OPU_R25_PATIENT_OBSERVATION insertPATIENT_OBSERVATION(int rep) throws HL7Exception { 
	   return (OPU_R25_PATIENT_OBSERVATION)super.insertRepetition("PATIENT_OBSERVATION", rep);
	}

	/**
	 * Removes a specific repetition of OPU_R25_PATIENT_OBSERVATION
	 * (a Group object)
	 * @see AbstractGroup#insertremoveRepetition(String, int) 
	 */
	public OPU_R25_PATIENT_OBSERVATION removePATIENT_OBSERVATION(int rep) throws HL7Exception { 
	   return (OPU_R25_PATIENT_OBSERVATION)super.removeRepetition("PATIENT_OBSERVATION", rep);
	}

}
