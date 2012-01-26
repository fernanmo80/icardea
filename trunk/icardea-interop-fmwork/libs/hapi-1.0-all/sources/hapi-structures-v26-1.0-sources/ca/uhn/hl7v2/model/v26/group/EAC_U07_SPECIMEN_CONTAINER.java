package ca.uhn.hl7v2.model.v26.group;

import ca.uhn.hl7v2.parser.ModelClassFactory;
import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.log.HapiLogFactory;
import ca.uhn.hl7v2.model.v26.segment.*;

import ca.uhn.hl7v2.model.*;
/**
 * <p>Represents the EAC_U07_SPECIMEN_CONTAINER Group.  A Group is an ordered collection of message 
 * segments that can repeat together or be optionally in/excluded together.
 * This Group contains the following elements: </p>
 * 0: SAC (Specimen Container detail) <b></b><br>
 * 1: SPM (Specimen) <b>optional repeating</b><br>
 */
public class EAC_U07_SPECIMEN_CONTAINER extends AbstractGroup {

	/** 
	 * Creates a new EAC_U07_SPECIMEN_CONTAINER Group.
	 */
	public EAC_U07_SPECIMEN_CONTAINER(Group parent, ModelClassFactory factory) {
	   super(parent, factory);
	   try {
	      this.add(SAC.class, true, false);
	      this.add(SPM.class, false, true);
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error creating EAC_U07_SPECIMEN_CONTAINER - this is probably a bug in the source code generator.", e);
	   }
	}

	/**
	 * Returns SAC (Specimen Container detail) - creates it if necessary
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
	 * Returns  first repetition of SPM (Specimen) - creates it if necessary
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
	 * Returns a specific repetition of SPM
	 * (Specimen) - creates it if necessary
	 * @throws HL7Exception if the repetition requested is more than one 
	 *     greater than the number of existing repetitions.
	 */
	public SPM getSPM(int rep) throws HL7Exception { 
	   return (SPM)this.get("SPM", rep);
	}

	/** 
	 * Returns the number of existing repetitions of SPM 
	 */ 
	public int getSPMReps() { 
	    int reps = -1; 
	    try { 
	        reps = this.getAll("SPM").length; 
	    } catch (HL7Exception e) { 
	        String message = "Unexpected error accessing data - this is probably a bug in the source code generator."; 
	        HapiLogFactory.getHapiLog(this.getClass()).error(message, e); 
	        throw new RuntimeException(message);
	    } 
	    return reps; 
	} 

	/**
	 * Inserts a specific repetition of SPM
	 * (Specimen)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public void  insertSPM(SPM structure, int rep) throws HL7Exception { 
	   super.insertRepetition( structure, rep);
	}

	/**
	 * Inserts a specific repetition of SPM
	 * (Specimen)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public SPM insertSPM(int rep) throws HL7Exception { 
	   return (SPM)super.insertRepetition("SPM", rep);
	}

	/**
	 * Removes a specific repetition of SPM
	 * (Specimen)
	 * @see AbstractGroup#insertremoveRepetition(String, int) 
	 */
	public SPM removeSPM(int rep) throws HL7Exception { 
	   return (SPM)super.removeRepetition("SPM", rep);
	}

}