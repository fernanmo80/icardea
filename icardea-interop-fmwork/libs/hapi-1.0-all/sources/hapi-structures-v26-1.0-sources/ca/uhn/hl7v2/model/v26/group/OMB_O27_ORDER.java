package ca.uhn.hl7v2.model.v26.group;

import ca.uhn.hl7v2.parser.ModelClassFactory;
import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.log.HapiLogFactory;
import ca.uhn.hl7v2.model.v26.segment.*;

import ca.uhn.hl7v2.model.*;
/**
 * <p>Represents the OMB_O27_ORDER Group.  A Group is an ordered collection of message 
 * segments that can repeat together or be optionally in/excluded together.
 * This Group contains the following elements: </p>
 * 0: ORC (Common Order) <b></b><br>
 * 1: OMB_O27_TIMING (a Group object) <b>optional repeating</b><br>
 * 2: BPO (Blood product order) <b></b><br>
 * 3: SPM (Specimen) <b>optional </b><br>
 * 4: NTE (Notes and Comments) <b>optional repeating</b><br>
 * 5: DG1 (Diagnosis) <b>optional repeating</b><br>
 * 6: OMB_O27_OBSERVATION (a Group object) <b>optional repeating</b><br>
 * 7: FT1 (Financial Transaction) <b>optional repeating</b><br>
 * 8: BLG (Billing) <b>optional </b><br>
 */
public class OMB_O27_ORDER extends AbstractGroup {

	/** 
	 * Creates a new OMB_O27_ORDER Group.
	 */
	public OMB_O27_ORDER(Group parent, ModelClassFactory factory) {
	   super(parent, factory);
	   try {
	      this.add(ORC.class, true, false);
	      this.add(OMB_O27_TIMING.class, false, true);
	      this.add(BPO.class, true, false);
	      this.add(SPM.class, false, false);
	      this.add(NTE.class, false, true);
	      this.add(DG1.class, false, true);
	      this.add(OMB_O27_OBSERVATION.class, false, true);
	      this.add(FT1.class, false, true);
	      this.add(BLG.class, false, false);
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error creating OMB_O27_ORDER - this is probably a bug in the source code generator.", e);
	   }
	}

	/**
	 * Returns ORC (Common Order) - creates it if necessary
	 */
	public ORC getORC() { 
	   ORC ret = null;
	   try {
	      ret = (ORC)this.get("ORC");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns  first repetition of OMB_O27_TIMING (a Group object) - creates it if necessary
	 */
	public OMB_O27_TIMING getTIMING() { 
	   OMB_O27_TIMING ret = null;
	   try {
	      ret = (OMB_O27_TIMING)this.get("TIMING");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns a specific repetition of OMB_O27_TIMING
	 * (a Group object) - creates it if necessary
	 * @throws HL7Exception if the repetition requested is more than one 
	 *     greater than the number of existing repetitions.
	 */
	public OMB_O27_TIMING getTIMING(int rep) throws HL7Exception { 
	   return (OMB_O27_TIMING)this.get("TIMING", rep);
	}

	/** 
	 * Returns the number of existing repetitions of OMB_O27_TIMING 
	 */ 
	public int getTIMINGReps() { 
	    int reps = -1; 
	    try { 
	        reps = this.getAll("TIMING").length; 
	    } catch (HL7Exception e) { 
	        String message = "Unexpected error accessing data - this is probably a bug in the source code generator."; 
	        HapiLogFactory.getHapiLog(this.getClass()).error(message, e); 
	        throw new RuntimeException(message);
	    } 
	    return reps; 
	} 

	/**
	 * Inserts a specific repetition of OMB_O27_TIMING
	 * (a Group object)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public void  insertTIMING(OMB_O27_TIMING structure, int rep) throws HL7Exception { 
	   super.insertRepetition( structure, rep);
	}

	/**
	 * Inserts a specific repetition of OMB_O27_TIMING
	 * (a Group object)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public OMB_O27_TIMING insertTIMING(int rep) throws HL7Exception { 
	   return (OMB_O27_TIMING)super.insertRepetition("TIMING", rep);
	}

	/**
	 * Removes a specific repetition of OMB_O27_TIMING
	 * (a Group object)
	 * @see AbstractGroup#insertremoveRepetition(String, int) 
	 */
	public OMB_O27_TIMING removeTIMING(int rep) throws HL7Exception { 
	   return (OMB_O27_TIMING)super.removeRepetition("TIMING", rep);
	}

	/**
	 * Returns BPO (Blood product order) - creates it if necessary
	 */
	public BPO getBPO() { 
	   BPO ret = null;
	   try {
	      ret = (BPO)this.get("BPO");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
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
	 * Returns  first repetition of DG1 (Diagnosis) - creates it if necessary
	 */
	public DG1 getDG1() { 
	   DG1 ret = null;
	   try {
	      ret = (DG1)this.get("DG1");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns a specific repetition of DG1
	 * (Diagnosis) - creates it if necessary
	 * @throws HL7Exception if the repetition requested is more than one 
	 *     greater than the number of existing repetitions.
	 */
	public DG1 getDG1(int rep) throws HL7Exception { 
	   return (DG1)this.get("DG1", rep);
	}

	/** 
	 * Returns the number of existing repetitions of DG1 
	 */ 
	public int getDG1Reps() { 
	    int reps = -1; 
	    try { 
	        reps = this.getAll("DG1").length; 
	    } catch (HL7Exception e) { 
	        String message = "Unexpected error accessing data - this is probably a bug in the source code generator."; 
	        HapiLogFactory.getHapiLog(this.getClass()).error(message, e); 
	        throw new RuntimeException(message);
	    } 
	    return reps; 
	} 

	/**
	 * Inserts a specific repetition of DG1
	 * (Diagnosis)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public void  insertDG1(DG1 structure, int rep) throws HL7Exception { 
	   super.insertRepetition( structure, rep);
	}

	/**
	 * Inserts a specific repetition of DG1
	 * (Diagnosis)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public DG1 insertDG1(int rep) throws HL7Exception { 
	   return (DG1)super.insertRepetition("DG1", rep);
	}

	/**
	 * Removes a specific repetition of DG1
	 * (Diagnosis)
	 * @see AbstractGroup#insertremoveRepetition(String, int) 
	 */
	public DG1 removeDG1(int rep) throws HL7Exception { 
	   return (DG1)super.removeRepetition("DG1", rep);
	}

	/**
	 * Returns  first repetition of OMB_O27_OBSERVATION (a Group object) - creates it if necessary
	 */
	public OMB_O27_OBSERVATION getOBSERVATION() { 
	   OMB_O27_OBSERVATION ret = null;
	   try {
	      ret = (OMB_O27_OBSERVATION)this.get("OBSERVATION");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns a specific repetition of OMB_O27_OBSERVATION
	 * (a Group object) - creates it if necessary
	 * @throws HL7Exception if the repetition requested is more than one 
	 *     greater than the number of existing repetitions.
	 */
	public OMB_O27_OBSERVATION getOBSERVATION(int rep) throws HL7Exception { 
	   return (OMB_O27_OBSERVATION)this.get("OBSERVATION", rep);
	}

	/** 
	 * Returns the number of existing repetitions of OMB_O27_OBSERVATION 
	 */ 
	public int getOBSERVATIONReps() { 
	    int reps = -1; 
	    try { 
	        reps = this.getAll("OBSERVATION").length; 
	    } catch (HL7Exception e) { 
	        String message = "Unexpected error accessing data - this is probably a bug in the source code generator."; 
	        HapiLogFactory.getHapiLog(this.getClass()).error(message, e); 
	        throw new RuntimeException(message);
	    } 
	    return reps; 
	} 

	/**
	 * Inserts a specific repetition of OMB_O27_OBSERVATION
	 * (a Group object)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public void  insertOBSERVATION(OMB_O27_OBSERVATION structure, int rep) throws HL7Exception { 
	   super.insertRepetition( structure, rep);
	}

	/**
	 * Inserts a specific repetition of OMB_O27_OBSERVATION
	 * (a Group object)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public OMB_O27_OBSERVATION insertOBSERVATION(int rep) throws HL7Exception { 
	   return (OMB_O27_OBSERVATION)super.insertRepetition("OBSERVATION", rep);
	}

	/**
	 * Removes a specific repetition of OMB_O27_OBSERVATION
	 * (a Group object)
	 * @see AbstractGroup#insertremoveRepetition(String, int) 
	 */
	public OMB_O27_OBSERVATION removeOBSERVATION(int rep) throws HL7Exception { 
	   return (OMB_O27_OBSERVATION)super.removeRepetition("OBSERVATION", rep);
	}

	/**
	 * Returns  first repetition of FT1 (Financial Transaction) - creates it if necessary
	 */
	public FT1 getFT1() { 
	   FT1 ret = null;
	   try {
	      ret = (FT1)this.get("FT1");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns a specific repetition of FT1
	 * (Financial Transaction) - creates it if necessary
	 * @throws HL7Exception if the repetition requested is more than one 
	 *     greater than the number of existing repetitions.
	 */
	public FT1 getFT1(int rep) throws HL7Exception { 
	   return (FT1)this.get("FT1", rep);
	}

	/** 
	 * Returns the number of existing repetitions of FT1 
	 */ 
	public int getFT1Reps() { 
	    int reps = -1; 
	    try { 
	        reps = this.getAll("FT1").length; 
	    } catch (HL7Exception e) { 
	        String message = "Unexpected error accessing data - this is probably a bug in the source code generator."; 
	        HapiLogFactory.getHapiLog(this.getClass()).error(message, e); 
	        throw new RuntimeException(message);
	    } 
	    return reps; 
	} 

	/**
	 * Inserts a specific repetition of FT1
	 * (Financial Transaction)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public void  insertFT1(FT1 structure, int rep) throws HL7Exception { 
	   super.insertRepetition( structure, rep);
	}

	/**
	 * Inserts a specific repetition of FT1
	 * (Financial Transaction)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public FT1 insertFT1(int rep) throws HL7Exception { 
	   return (FT1)super.insertRepetition("FT1", rep);
	}

	/**
	 * Removes a specific repetition of FT1
	 * (Financial Transaction)
	 * @see AbstractGroup#insertremoveRepetition(String, int) 
	 */
	public FT1 removeFT1(int rep) throws HL7Exception { 
	   return (FT1)super.removeRepetition("FT1", rep);
	}

	/**
	 * Returns BLG (Billing) - creates it if necessary
	 */
	public BLG getBLG() { 
	   BLG ret = null;
	   try {
	      ret = (BLG)this.get("BLG");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

}
