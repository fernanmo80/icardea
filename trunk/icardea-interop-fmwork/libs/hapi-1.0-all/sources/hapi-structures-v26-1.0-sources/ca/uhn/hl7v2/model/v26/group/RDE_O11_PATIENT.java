package ca.uhn.hl7v2.model.v26.group;

import ca.uhn.hl7v2.parser.ModelClassFactory;
import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.log.HapiLogFactory;
import ca.uhn.hl7v2.model.v26.segment.*;

import ca.uhn.hl7v2.model.*;
/**
 * <p>Represents the RDE_O11_PATIENT Group.  A Group is an ordered collection of message 
 * segments that can repeat together or be optionally in/excluded together.
 * This Group contains the following elements: </p>
 * 0: PID (Patient Identification) <b></b><br>
 * 1: PD1 (Patient Additional Demographic) <b>optional </b><br>
 * 2: NTE (Notes and Comments) <b>optional repeating</b><br>
 * 3: RDE_O11_PATIENT_VISIT (a Group object) <b>optional </b><br>
 * 4: RDE_O11_INSURANCE (a Group object) <b>optional repeating</b><br>
 * 5: GT1 (Guarantor) <b>optional </b><br>
 * 6: AL1 (Patient Allergy Information) <b>optional repeating</b><br>
 */
public class RDE_O11_PATIENT extends AbstractGroup {

	/** 
	 * Creates a new RDE_O11_PATIENT Group.
	 */
	public RDE_O11_PATIENT(Group parent, ModelClassFactory factory) {
	   super(parent, factory);
	   try {
	      this.add(PID.class, true, false);
	      this.add(PD1.class, false, false);
	      this.add(NTE.class, false, true);
	      this.add(RDE_O11_PATIENT_VISIT.class, false, false);
	      this.add(RDE_O11_INSURANCE.class, false, true);
	      this.add(GT1.class, false, false);
	      this.add(AL1.class, false, true);
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error creating RDE_O11_PATIENT - this is probably a bug in the source code generator.", e);
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
	 * Returns RDE_O11_PATIENT_VISIT (a Group object) - creates it if necessary
	 */
	public RDE_O11_PATIENT_VISIT getPATIENT_VISIT() { 
	   RDE_O11_PATIENT_VISIT ret = null;
	   try {
	      ret = (RDE_O11_PATIENT_VISIT)this.get("PATIENT_VISIT");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns  first repetition of RDE_O11_INSURANCE (a Group object) - creates it if necessary
	 */
	public RDE_O11_INSURANCE getINSURANCE() { 
	   RDE_O11_INSURANCE ret = null;
	   try {
	      ret = (RDE_O11_INSURANCE)this.get("INSURANCE");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns a specific repetition of RDE_O11_INSURANCE
	 * (a Group object) - creates it if necessary
	 * @throws HL7Exception if the repetition requested is more than one 
	 *     greater than the number of existing repetitions.
	 */
	public RDE_O11_INSURANCE getINSURANCE(int rep) throws HL7Exception { 
	   return (RDE_O11_INSURANCE)this.get("INSURANCE", rep);
	}

	/** 
	 * Returns the number of existing repetitions of RDE_O11_INSURANCE 
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
	 * Inserts a specific repetition of RDE_O11_INSURANCE
	 * (a Group object)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public void  insertINSURANCE(RDE_O11_INSURANCE structure, int rep) throws HL7Exception { 
	   super.insertRepetition( structure, rep);
	}

	/**
	 * Inserts a specific repetition of RDE_O11_INSURANCE
	 * (a Group object)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public RDE_O11_INSURANCE insertINSURANCE(int rep) throws HL7Exception { 
	   return (RDE_O11_INSURANCE)super.insertRepetition("INSURANCE", rep);
	}

	/**
	 * Removes a specific repetition of RDE_O11_INSURANCE
	 * (a Group object)
	 * @see AbstractGroup#insertremoveRepetition(String, int) 
	 */
	public RDE_O11_INSURANCE removeINSURANCE(int rep) throws HL7Exception { 
	   return (RDE_O11_INSURANCE)super.removeRepetition("INSURANCE", rep);
	}

	/**
	 * Returns GT1 (Guarantor) - creates it if necessary
	 */
	public GT1 getGT1() { 
	   GT1 ret = null;
	   try {
	      ret = (GT1)this.get("GT1");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns  first repetition of AL1 (Patient Allergy Information) - creates it if necessary
	 */
	public AL1 getAL1() { 
	   AL1 ret = null;
	   try {
	      ret = (AL1)this.get("AL1");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns a specific repetition of AL1
	 * (Patient Allergy Information) - creates it if necessary
	 * @throws HL7Exception if the repetition requested is more than one 
	 *     greater than the number of existing repetitions.
	 */
	public AL1 getAL1(int rep) throws HL7Exception { 
	   return (AL1)this.get("AL1", rep);
	}

	/** 
	 * Returns the number of existing repetitions of AL1 
	 */ 
	public int getAL1Reps() { 
	    int reps = -1; 
	    try { 
	        reps = this.getAll("AL1").length; 
	    } catch (HL7Exception e) { 
	        String message = "Unexpected error accessing data - this is probably a bug in the source code generator."; 
	        HapiLogFactory.getHapiLog(this.getClass()).error(message, e); 
	        throw new RuntimeException(message);
	    } 
	    return reps; 
	} 

	/**
	 * Inserts a specific repetition of AL1
	 * (Patient Allergy Information)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public void  insertAL1(AL1 structure, int rep) throws HL7Exception { 
	   super.insertRepetition( structure, rep);
	}

	/**
	 * Inserts a specific repetition of AL1
	 * (Patient Allergy Information)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public AL1 insertAL1(int rep) throws HL7Exception { 
	   return (AL1)super.insertRepetition("AL1", rep);
	}

	/**
	 * Removes a specific repetition of AL1
	 * (Patient Allergy Information)
	 * @see AbstractGroup#insertremoveRepetition(String, int) 
	 */
	public AL1 removeAL1(int rep) throws HL7Exception { 
	   return (AL1)super.removeRepetition("AL1", rep);
	}

}