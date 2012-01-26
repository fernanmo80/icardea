package ca.uhn.hl7v2.model.v26.message;

import ca.uhn.log.HapiLogFactory;
import ca.uhn.hl7v2.model.v26.group.*;

import ca.uhn.hl7v2.model.v26.segment.*;

import ca.uhn.hl7v2.HL7Exception;

import ca.uhn.hl7v2.parser.ModelClassFactory;

import ca.uhn.hl7v2.parser.DefaultModelClassFactory;

import ca.uhn.hl7v2.model.AbstractMessage;

/**
 * <p>Represents a MDM_T02 message structure (see chapter 9.5.2). This structure contains the 
 * following elements: </p>
 * 0: MSH (Message Header) <b></b><br>
 * 1: SFT (Software Segment) <b>optional repeating</b><br>
 * 2: UAC (User Authentication Credential Segment) <b>optional </b><br>
 * 3: EVN (Event Type) <b></b><br>
 * 4: PID (Patient Identification) <b></b><br>
 * 5: PV1 (Patient Visit) <b></b><br>
 * 6: MDM_T02_COMMON_ORDER (a Group object) <b>optional repeating</b><br>
 * 7: TXA (Transcription Document Header) <b></b><br>
 * 8: MDM_T02_OBSERVATION (a Group object) <b>repeating</b><br>
 */
public class MDM_T02 extends AbstractMessage  {

	/** 
	 * Creates a new MDM_T02 Group with custom ModelClassFactory.
	 */
	public MDM_T02(ModelClassFactory factory) {
	   super(factory);
	   init(factory);
	}

	/**
	 * Creates a new MDM_T02 Group with DefaultModelClassFactory. 
	 */ 
	public MDM_T02() { 
	   super(new DefaultModelClassFactory());
	   init(new DefaultModelClassFactory());
	}

	private void init(ModelClassFactory factory) {
	   try {
	      this.add(MSH.class, true, false);
	      this.add(SFT.class, false, true);
	      this.add(UAC.class, false, false);
	      this.add(EVN.class, true, false);
	      this.add(PID.class, true, false);
	      this.add(PV1.class, true, false);
	      this.add(MDM_T02_COMMON_ORDER.class, false, true);
	      this.add(TXA.class, true, false);
	      this.add(MDM_T02_OBSERVATION.class, true, true);
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error creating MDM_T02 - this is probably a bug in the source code generator.", e);
	   }
	}

	/** {@inheritDoc} */
	public String getVersion() {
	   return "2.6";
	}

	/**
	 * Returns MSH (Message Header) - creates it if necessary
	 */
	public MSH getMSH() { 
	   MSH ret = null;
	   try {
	      ret = (MSH)this.get("MSH");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns  first repetition of SFT (Software Segment) - creates it if necessary
	 */
	public SFT getSFT() { 
	   SFT ret = null;
	   try {
	      ret = (SFT)this.get("SFT");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns a specific repetition of SFT
	 * (Software Segment) - creates it if necessary
	 * @throws HL7Exception if the repetition requested is more than one 
	 *     greater than the number of existing repetitions.
	 */
	public SFT getSFT(int rep) throws HL7Exception { 
	   return (SFT)this.get("SFT", rep);
	}

	/** 
	 * Returns the number of existing repetitions of SFT 
	 */ 
	public int getSFTReps() { 
	    int reps = -1; 
	    try { 
	        reps = this.getAll("SFT").length; 
	    } catch (HL7Exception e) { 
	        String message = "Unexpected error accessing data - this is probably a bug in the source code generator."; 
	        HapiLogFactory.getHapiLog(this.getClass()).error(message, e); 
	        throw new RuntimeException(message);
	    } 
	    return reps; 
	} 

	/**
	 * Inserts a specific repetition of SFT
	 * (Software Segment)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public void  insertSFT(SFT structure, int rep) throws HL7Exception { 
	   super.insertRepetition( structure, rep);
	}

	/**
	 * Inserts a specific repetition of SFT
	 * (Software Segment)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public SFT insertSFT(int rep) throws HL7Exception { 
	   return (SFT)super.insertRepetition("SFT", rep);
	}

	/**
	 * Removes a specific repetition of SFT
	 * (Software Segment)
	 * @see AbstractGroup#insertremoveRepetition(String, int) 
	 */
	public SFT removeSFT(int rep) throws HL7Exception { 
	   return (SFT)super.removeRepetition("SFT", rep);
	}

	/**
	 * Returns UAC (User Authentication Credential Segment) - creates it if necessary
	 */
	public UAC getUAC() { 
	   UAC ret = null;
	   try {
	      ret = (UAC)this.get("UAC");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns EVN (Event Type) - creates it if necessary
	 */
	public EVN getEVN() { 
	   EVN ret = null;
	   try {
	      ret = (EVN)this.get("EVN");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
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
	 * Returns PV1 (Patient Visit) - creates it if necessary
	 */
	public PV1 getPV1() { 
	   PV1 ret = null;
	   try {
	      ret = (PV1)this.get("PV1");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns  first repetition of MDM_T02_COMMON_ORDER (a Group object) - creates it if necessary
	 */
	public MDM_T02_COMMON_ORDER getCOMMON_ORDER() { 
	   MDM_T02_COMMON_ORDER ret = null;
	   try {
	      ret = (MDM_T02_COMMON_ORDER)this.get("COMMON_ORDER");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns a specific repetition of MDM_T02_COMMON_ORDER
	 * (a Group object) - creates it if necessary
	 * @throws HL7Exception if the repetition requested is more than one 
	 *     greater than the number of existing repetitions.
	 */
	public MDM_T02_COMMON_ORDER getCOMMON_ORDER(int rep) throws HL7Exception { 
	   return (MDM_T02_COMMON_ORDER)this.get("COMMON_ORDER", rep);
	}

	/** 
	 * Returns the number of existing repetitions of MDM_T02_COMMON_ORDER 
	 */ 
	public int getCOMMON_ORDERReps() { 
	    int reps = -1; 
	    try { 
	        reps = this.getAll("COMMON_ORDER").length; 
	    } catch (HL7Exception e) { 
	        String message = "Unexpected error accessing data - this is probably a bug in the source code generator."; 
	        HapiLogFactory.getHapiLog(this.getClass()).error(message, e); 
	        throw new RuntimeException(message);
	    } 
	    return reps; 
	} 

	/**
	 * Inserts a specific repetition of MDM_T02_COMMON_ORDER
	 * (a Group object)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public void  insertCOMMON_ORDER(MDM_T02_COMMON_ORDER structure, int rep) throws HL7Exception { 
	   super.insertRepetition( structure, rep);
	}

	/**
	 * Inserts a specific repetition of MDM_T02_COMMON_ORDER
	 * (a Group object)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public MDM_T02_COMMON_ORDER insertCOMMON_ORDER(int rep) throws HL7Exception { 
	   return (MDM_T02_COMMON_ORDER)super.insertRepetition("COMMON_ORDER", rep);
	}

	/**
	 * Removes a specific repetition of MDM_T02_COMMON_ORDER
	 * (a Group object)
	 * @see AbstractGroup#insertremoveRepetition(String, int) 
	 */
	public MDM_T02_COMMON_ORDER removeCOMMON_ORDER(int rep) throws HL7Exception { 
	   return (MDM_T02_COMMON_ORDER)super.removeRepetition("COMMON_ORDER", rep);
	}

	/**
	 * Returns TXA (Transcription Document Header) - creates it if necessary
	 */
	public TXA getTXA() { 
	   TXA ret = null;
	   try {
	      ret = (TXA)this.get("TXA");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns  first repetition of MDM_T02_OBSERVATION (a Group object) - creates it if necessary
	 */
	public MDM_T02_OBSERVATION getOBSERVATION() { 
	   MDM_T02_OBSERVATION ret = null;
	   try {
	      ret = (MDM_T02_OBSERVATION)this.get("OBSERVATION");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns a specific repetition of MDM_T02_OBSERVATION
	 * (a Group object) - creates it if necessary
	 * @throws HL7Exception if the repetition requested is more than one 
	 *     greater than the number of existing repetitions.
	 */
	public MDM_T02_OBSERVATION getOBSERVATION(int rep) throws HL7Exception { 
	   return (MDM_T02_OBSERVATION)this.get("OBSERVATION", rep);
	}

	/** 
	 * Returns the number of existing repetitions of MDM_T02_OBSERVATION 
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
	 * Inserts a specific repetition of MDM_T02_OBSERVATION
	 * (a Group object)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public void  insertOBSERVATION(MDM_T02_OBSERVATION structure, int rep) throws HL7Exception { 
	   super.insertRepetition( structure, rep);
	}

	/**
	 * Inserts a specific repetition of MDM_T02_OBSERVATION
	 * (a Group object)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public MDM_T02_OBSERVATION insertOBSERVATION(int rep) throws HL7Exception { 
	   return (MDM_T02_OBSERVATION)super.insertRepetition("OBSERVATION", rep);
	}

	/**
	 * Removes a specific repetition of MDM_T02_OBSERVATION
	 * (a Group object)
	 * @see AbstractGroup#insertremoveRepetition(String, int) 
	 */
	public MDM_T02_OBSERVATION removeOBSERVATION(int rep) throws HL7Exception { 
	   return (MDM_T02_OBSERVATION)super.removeRepetition("OBSERVATION", rep);
	}

}
