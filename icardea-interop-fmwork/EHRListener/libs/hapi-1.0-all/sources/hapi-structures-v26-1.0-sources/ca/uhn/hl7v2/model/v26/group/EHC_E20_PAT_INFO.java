package ca.uhn.hl7v2.model.v26.group;

import ca.uhn.hl7v2.parser.ModelClassFactory;
import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.log.HapiLogFactory;
import ca.uhn.hl7v2.model.v26.segment.*;

import ca.uhn.hl7v2.model.*;
/**
 * <p>Represents the EHC_E20_PAT_INFO Group.  A Group is an ordered collection of message 
 * segments that can repeat together or be optionally in/excluded together.
 * This Group contains the following elements: </p>
 * 0: PID (Patient Identification) <b></b><br>
 * 1: ACC (Accident) <b>optional repeating</b><br>
 * 2: EHC_E20_INSURANCE (a Group object) <b>repeating</b><br>
 * 3: EHC_E20_DIAGNOSIS (a Group object) <b>optional repeating</b><br>
 * 4: OBX (Observation/Result) <b>optional repeating</b><br>
 */
public class EHC_E20_PAT_INFO extends AbstractGroup {

	/** 
	 * Creates a new EHC_E20_PAT_INFO Group.
	 */
	public EHC_E20_PAT_INFO(Group parent, ModelClassFactory factory) {
	   super(parent, factory);
	   try {
	      this.add(PID.class, true, false);
	      this.add(ACC.class, false, true);
	      this.add(EHC_E20_INSURANCE.class, true, true);
	      this.add(EHC_E20_DIAGNOSIS.class, false, true);
	      this.add(OBX.class, false, true);
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error creating EHC_E20_PAT_INFO - this is probably a bug in the source code generator.", e);
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
	 * Returns  first repetition of ACC (Accident) - creates it if necessary
	 */
	public ACC getACC() { 
	   ACC ret = null;
	   try {
	      ret = (ACC)this.get("ACC");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns a specific repetition of ACC
	 * (Accident) - creates it if necessary
	 * @throws HL7Exception if the repetition requested is more than one 
	 *     greater than the number of existing repetitions.
	 */
	public ACC getACC(int rep) throws HL7Exception { 
	   return (ACC)this.get("ACC", rep);
	}

	/** 
	 * Returns the number of existing repetitions of ACC 
	 */ 
	public int getACCReps() { 
	    int reps = -1; 
	    try { 
	        reps = this.getAll("ACC").length; 
	    } catch (HL7Exception e) { 
	        String message = "Unexpected error accessing data - this is probably a bug in the source code generator."; 
	        HapiLogFactory.getHapiLog(this.getClass()).error(message, e); 
	        throw new RuntimeException(message);
	    } 
	    return reps; 
	} 

	/**
	 * Inserts a specific repetition of ACC
	 * (Accident)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public void  insertACC(ACC structure, int rep) throws HL7Exception { 
	   super.insertRepetition( structure, rep);
	}

	/**
	 * Inserts a specific repetition of ACC
	 * (Accident)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public ACC insertACC(int rep) throws HL7Exception { 
	   return (ACC)super.insertRepetition("ACC", rep);
	}

	/**
	 * Removes a specific repetition of ACC
	 * (Accident)
	 * @see AbstractGroup#insertremoveRepetition(String, int) 
	 */
	public ACC removeACC(int rep) throws HL7Exception { 
	   return (ACC)super.removeRepetition("ACC", rep);
	}

	/**
	 * Returns  first repetition of EHC_E20_INSURANCE (a Group object) - creates it if necessary
	 */
	public EHC_E20_INSURANCE getINSURANCE() { 
	   EHC_E20_INSURANCE ret = null;
	   try {
	      ret = (EHC_E20_INSURANCE)this.get("INSURANCE");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns a specific repetition of EHC_E20_INSURANCE
	 * (a Group object) - creates it if necessary
	 * @throws HL7Exception if the repetition requested is more than one 
	 *     greater than the number of existing repetitions.
	 */
	public EHC_E20_INSURANCE getINSURANCE(int rep) throws HL7Exception { 
	   return (EHC_E20_INSURANCE)this.get("INSURANCE", rep);
	}

	/** 
	 * Returns the number of existing repetitions of EHC_E20_INSURANCE 
	 */ 
	public int getINSURANCEReps() { 
	    int reps = -1; 
	    try { 
	        reps = this.getAll("INSURANCE").length; 
	    } catch (HL7Exception e) { 
	        String message = "Unexpected error accessing data - this is probably a bug in the source code generator."; 
	        HapiLogFactory.getHapiLog(this.getClass()).error(message, e); 
	        throw new RuntimeException(message);
	    } 
	    return reps; 
	} 

	/**
	 * Inserts a specific repetition of EHC_E20_INSURANCE
	 * (a Group object)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public void  insertINSURANCE(EHC_E20_INSURANCE structure, int rep) throws HL7Exception { 
	   super.insertRepetition( structure, rep);
	}

	/**
	 * Inserts a specific repetition of EHC_E20_INSURANCE
	 * (a Group object)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public EHC_E20_INSURANCE insertINSURANCE(int rep) throws HL7Exception { 
	   return (EHC_E20_INSURANCE)super.insertRepetition("INSURANCE", rep);
	}

	/**
	 * Removes a specific repetition of EHC_E20_INSURANCE
	 * (a Group object)
	 * @see AbstractGroup#insertremoveRepetition(String, int) 
	 */
	public EHC_E20_INSURANCE removeINSURANCE(int rep) throws HL7Exception { 
	   return (EHC_E20_INSURANCE)super.removeRepetition("INSURANCE", rep);
	}

	/**
	 * Returns  first repetition of EHC_E20_DIAGNOSIS (a Group object) - creates it if necessary
	 */
	public EHC_E20_DIAGNOSIS getDIAGNOSIS() { 
	   EHC_E20_DIAGNOSIS ret = null;
	   try {
	      ret = (EHC_E20_DIAGNOSIS)this.get("DIAGNOSIS");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns a specific repetition of EHC_E20_DIAGNOSIS
	 * (a Group object) - creates it if necessary
	 * @throws HL7Exception if the repetition requested is more than one 
	 *     greater than the number of existing repetitions.
	 */
	public EHC_E20_DIAGNOSIS getDIAGNOSIS(int rep) throws HL7Exception { 
	   return (EHC_E20_DIAGNOSIS)this.get("DIAGNOSIS", rep);
	}

	/** 
	 * Returns the number of existing repetitions of EHC_E20_DIAGNOSIS 
	 */ 
	public int getDIAGNOSISReps() { 
	    int reps = -1; 
	    try { 
	        reps = this.getAll("DIAGNOSIS").length; 
	    } catch (HL7Exception e) { 
	        String message = "Unexpected error accessing data - this is probably a bug in the source code generator."; 
	        HapiLogFactory.getHapiLog(this.getClass()).error(message, e); 
	        throw new RuntimeException(message);
	    } 
	    return reps; 
	} 

	/**
	 * Inserts a specific repetition of EHC_E20_DIAGNOSIS
	 * (a Group object)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public void  insertDIAGNOSIS(EHC_E20_DIAGNOSIS structure, int rep) throws HL7Exception { 
	   super.insertRepetition( structure, rep);
	}

	/**
	 * Inserts a specific repetition of EHC_E20_DIAGNOSIS
	 * (a Group object)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public EHC_E20_DIAGNOSIS insertDIAGNOSIS(int rep) throws HL7Exception { 
	   return (EHC_E20_DIAGNOSIS)super.insertRepetition("DIAGNOSIS", rep);
	}

	/**
	 * Removes a specific repetition of EHC_E20_DIAGNOSIS
	 * (a Group object)
	 * @see AbstractGroup#insertremoveRepetition(String, int) 
	 */
	public EHC_E20_DIAGNOSIS removeDIAGNOSIS(int rep) throws HL7Exception { 
	   return (EHC_E20_DIAGNOSIS)super.removeRepetition("DIAGNOSIS", rep);
	}

	/**
	 * Returns  first repetition of OBX (Observation/Result) - creates it if necessary
	 */
	public OBX getOBX() { 
	   OBX ret = null;
	   try {
	      ret = (OBX)this.get("OBX");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns a specific repetition of OBX
	 * (Observation/Result) - creates it if necessary
	 * @throws HL7Exception if the repetition requested is more than one 
	 *     greater than the number of existing repetitions.
	 */
	public OBX getOBX(int rep) throws HL7Exception { 
	   return (OBX)this.get("OBX", rep);
	}

	/** 
	 * Returns the number of existing repetitions of OBX 
	 */ 
	public int getOBXReps() { 
	    int reps = -1; 
	    try { 
	        reps = this.getAll("OBX").length; 
	    } catch (HL7Exception e) { 
	        String message = "Unexpected error accessing data - this is probably a bug in the source code generator."; 
	        HapiLogFactory.getHapiLog(this.getClass()).error(message, e); 
	        throw new RuntimeException(message);
	    } 
	    return reps; 
	} 

	/**
	 * Inserts a specific repetition of OBX
	 * (Observation/Result)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public void  insertOBX(OBX structure, int rep) throws HL7Exception { 
	   super.insertRepetition( structure, rep);
	}

	/**
	 * Inserts a specific repetition of OBX
	 * (Observation/Result)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public OBX insertOBX(int rep) throws HL7Exception { 
	   return (OBX)super.insertRepetition("OBX", rep);
	}

	/**
	 * Removes a specific repetition of OBX
	 * (Observation/Result)
	 * @see AbstractGroup#insertremoveRepetition(String, int) 
	 */
	public OBX removeOBX(int rep) throws HL7Exception { 
	   return (OBX)super.removeRepetition("OBX", rep);
	}

}
