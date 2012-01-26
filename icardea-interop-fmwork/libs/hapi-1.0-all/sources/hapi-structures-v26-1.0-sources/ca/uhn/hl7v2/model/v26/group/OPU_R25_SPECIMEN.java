package ca.uhn.hl7v2.model.v26.group;

import ca.uhn.hl7v2.parser.ModelClassFactory;
import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.log.HapiLogFactory;
import ca.uhn.hl7v2.model.v26.segment.*;

import ca.uhn.hl7v2.model.*;
/**
 * <p>Represents the OPU_R25_SPECIMEN Group.  A Group is an ordered collection of message 
 * segments that can repeat together or be optionally in/excluded together.
 * This Group contains the following elements: </p>
 * 0: SPM (Specimen) <b></b><br>
 * 1: OPU_R25_SPECIMEN_OBSERVATION (a Group object) <b>optional repeating</b><br>
 * 2: OPU_R25_CONTAINER (a Group object) <b>optional repeating</b><br>
 * 3: OPU_R25_ORDER (a Group object) <b>repeating</b><br>
 */
public class OPU_R25_SPECIMEN extends AbstractGroup {

	/** 
	 * Creates a new OPU_R25_SPECIMEN Group.
	 */
	public OPU_R25_SPECIMEN(Group parent, ModelClassFactory factory) {
	   super(parent, factory);
	   try {
	      this.add(SPM.class, true, false);
	      this.add(OPU_R25_SPECIMEN_OBSERVATION.class, false, true);
	      this.add(OPU_R25_CONTAINER.class, false, true);
	      this.add(OPU_R25_ORDER.class, true, true);
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error creating OPU_R25_SPECIMEN - this is probably a bug in the source code generator.", e);
	   }
	}

	/**
	 * Returns SPM (Specimen) - creates it if necessary
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
	 * Returns  first repetition of OPU_R25_SPECIMEN_OBSERVATION (a Group object) - creates it if necessary
	 */
	public OPU_R25_SPECIMEN_OBSERVATION getSPECIMEN_OBSERVATION() { 
	   OPU_R25_SPECIMEN_OBSERVATION ret = null;
	   try {
	      ret = (OPU_R25_SPECIMEN_OBSERVATION)this.get("SPECIMEN_OBSERVATION");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns a specific repetition of OPU_R25_SPECIMEN_OBSERVATION
	 * (a Group object) - creates it if necessary
	 * @throws HL7Exception if the repetition requested is more than one 
	 *     greater than the number of existing repetitions.
	 */
	public OPU_R25_SPECIMEN_OBSERVATION getSPECIMEN_OBSERVATION(int rep) throws HL7Exception { 
	   return (OPU_R25_SPECIMEN_OBSERVATION)this.get("SPECIMEN_OBSERVATION", rep);
	}

	/** 
	 * Returns the number of existing repetitions of OPU_R25_SPECIMEN_OBSERVATION 
	 */ 
	public int getSPECIMEN_OBSERVATIONReps() { 
	    int reps = -1; 
	    try { 
	        reps = this.getAll("SPECIMEN_OBSERVATION").length; 
	    } catch (HL7Exception e) { 
	        String message = "Unexpected error accessing data - this is probably a bug in the source code generator."; 
	        HapiLogFactory.getHapiLog(this.getClass()).error(message, e); 
	        throw new RuntimeException(message);
	    } 
	    return reps; 
	} 

	/**
	 * Inserts a specific repetition of OPU_R25_SPECIMEN_OBSERVATION
	 * (a Group object)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public void  insertSPECIMEN_OBSERVATION(OPU_R25_SPECIMEN_OBSERVATION structure, int rep) throws HL7Exception { 
	   super.insertRepetition( structure, rep);
	}

	/**
	 * Inserts a specific repetition of OPU_R25_SPECIMEN_OBSERVATION
	 * (a Group object)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public OPU_R25_SPECIMEN_OBSERVATION insertSPECIMEN_OBSERVATION(int rep) throws HL7Exception { 
	   return (OPU_R25_SPECIMEN_OBSERVATION)super.insertRepetition("SPECIMEN_OBSERVATION", rep);
	}

	/**
	 * Removes a specific repetition of OPU_R25_SPECIMEN_OBSERVATION
	 * (a Group object)
	 * @see AbstractGroup#insertremoveRepetition(String, int) 
	 */
	public OPU_R25_SPECIMEN_OBSERVATION removeSPECIMEN_OBSERVATION(int rep) throws HL7Exception { 
	   return (OPU_R25_SPECIMEN_OBSERVATION)super.removeRepetition("SPECIMEN_OBSERVATION", rep);
	}

	/**
	 * Returns  first repetition of OPU_R25_CONTAINER (a Group object) - creates it if necessary
	 */
	public OPU_R25_CONTAINER getCONTAINER() { 
	   OPU_R25_CONTAINER ret = null;
	   try {
	      ret = (OPU_R25_CONTAINER)this.get("CONTAINER");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns a specific repetition of OPU_R25_CONTAINER
	 * (a Group object) - creates it if necessary
	 * @throws HL7Exception if the repetition requested is more than one 
	 *     greater than the number of existing repetitions.
	 */
	public OPU_R25_CONTAINER getCONTAINER(int rep) throws HL7Exception { 
	   return (OPU_R25_CONTAINER)this.get("CONTAINER", rep);
	}

	/** 
	 * Returns the number of existing repetitions of OPU_R25_CONTAINER 
	 */ 
	public int getCONTAINERReps() { 
	    int reps = -1; 
	    try { 
	        reps = this.getAll("CONTAINER").length; 
	    } catch (HL7Exception e) { 
	        String message = "Unexpected error accessing data - this is probably a bug in the source code generator."; 
	        HapiLogFactory.getHapiLog(this.getClass()).error(message, e); 
	        throw new RuntimeException(message);
	    } 
	    return reps; 
	} 

	/**
	 * Inserts a specific repetition of OPU_R25_CONTAINER
	 * (a Group object)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public void  insertCONTAINER(OPU_R25_CONTAINER structure, int rep) throws HL7Exception { 
	   super.insertRepetition( structure, rep);
	}

	/**
	 * Inserts a specific repetition of OPU_R25_CONTAINER
	 * (a Group object)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public OPU_R25_CONTAINER insertCONTAINER(int rep) throws HL7Exception { 
	   return (OPU_R25_CONTAINER)super.insertRepetition("CONTAINER", rep);
	}

	/**
	 * Removes a specific repetition of OPU_R25_CONTAINER
	 * (a Group object)
	 * @see AbstractGroup#insertremoveRepetition(String, int) 
	 */
	public OPU_R25_CONTAINER removeCONTAINER(int rep) throws HL7Exception { 
	   return (OPU_R25_CONTAINER)super.removeRepetition("CONTAINER", rep);
	}

	/**
	 * Returns  first repetition of OPU_R25_ORDER (a Group object) - creates it if necessary
	 */
	public OPU_R25_ORDER getORDER() { 
	   OPU_R25_ORDER ret = null;
	   try {
	      ret = (OPU_R25_ORDER)this.get("ORDER");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns a specific repetition of OPU_R25_ORDER
	 * (a Group object) - creates it if necessary
	 * @throws HL7Exception if the repetition requested is more than one 
	 *     greater than the number of existing repetitions.
	 */
	public OPU_R25_ORDER getORDER(int rep) throws HL7Exception { 
	   return (OPU_R25_ORDER)this.get("ORDER", rep);
	}

	/** 
	 * Returns the number of existing repetitions of OPU_R25_ORDER 
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
	 * Inserts a specific repetition of OPU_R25_ORDER
	 * (a Group object)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public void  insertORDER(OPU_R25_ORDER structure, int rep) throws HL7Exception { 
	   super.insertRepetition( structure, rep);
	}

	/**
	 * Inserts a specific repetition of OPU_R25_ORDER
	 * (a Group object)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public OPU_R25_ORDER insertORDER(int rep) throws HL7Exception { 
	   return (OPU_R25_ORDER)super.insertRepetition("ORDER", rep);
	}

	/**
	 * Removes a specific repetition of OPU_R25_ORDER
	 * (a Group object)
	 * @see AbstractGroup#insertremoveRepetition(String, int) 
	 */
	public OPU_R25_ORDER removeORDER(int rep) throws HL7Exception { 
	   return (OPU_R25_ORDER)super.removeRepetition("ORDER", rep);
	}

}
