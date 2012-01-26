package ca.uhn.hl7v2.model.v26.message;

import ca.uhn.log.HapiLogFactory;
import ca.uhn.hl7v2.model.v26.group.*;

import ca.uhn.hl7v2.model.v26.segment.*;

import ca.uhn.hl7v2.HL7Exception;

import ca.uhn.hl7v2.parser.ModelClassFactory;

import ca.uhn.hl7v2.parser.DefaultModelClassFactory;

import ca.uhn.hl7v2.model.AbstractMessage;

/**
 * <p>Represents a RSP_K31 message structure (see chapter 4.13.20). This structure contains the 
 * following elements: </p>
 * 0: MSH (Message Header) <b></b><br>
 * 1: MSA (Message Acknowledgment) <b></b><br>
 * 2: ERR (Error) <b>optional repeating</b><br>
 * 3: SFT (Software Segment) <b>optional repeating</b><br>
 * 4: UAC (User Authentication Credential Segment) <b>optional </b><br>
 * 5: QAK (Query Acknowledgment) <b></b><br>
 * 6: QPD (Query Parameter Definition) <b></b><br>
 * 7: RCP (Response Control Parameter) <b></b><br>
 * 8: RSP_K31_RESPONSE (a Group object) <b>repeating</b><br>
 * 9: DSC (Continuation Pointer) <b>optional </b><br>
 */
public class RSP_K31 extends AbstractMessage  {

	/** 
	 * Creates a new RSP_K31 Group with custom ModelClassFactory.
	 */
	public RSP_K31(ModelClassFactory factory) {
	   super(factory);
	   init(factory);
	}

	/**
	 * Creates a new RSP_K31 Group with DefaultModelClassFactory. 
	 */ 
	public RSP_K31() { 
	   super(new DefaultModelClassFactory());
	   init(new DefaultModelClassFactory());
	}

	private void init(ModelClassFactory factory) {
	   try {
	      this.add(MSH.class, true, false);
	      this.add(MSA.class, true, false);
	      this.add(ERR.class, false, true);
	      this.add(SFT.class, false, true);
	      this.add(UAC.class, false, false);
	      this.add(QAK.class, true, false);
	      this.add(QPD.class, true, false);
	      this.add(RCP.class, true, false);
	      this.add(RSP_K31_RESPONSE.class, true, true);
	      this.add(DSC.class, false, false);
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error creating RSP_K31 - this is probably a bug in the source code generator.", e);
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
	 * Returns MSA (Message Acknowledgment) - creates it if necessary
	 */
	public MSA getMSA() { 
	   MSA ret = null;
	   try {
	      ret = (MSA)this.get("MSA");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns  first repetition of ERR (Error) - creates it if necessary
	 */
	public ERR getERR() { 
	   ERR ret = null;
	   try {
	      ret = (ERR)this.get("ERR");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns a specific repetition of ERR
	 * (Error) - creates it if necessary
	 * @throws HL7Exception if the repetition requested is more than one 
	 *     greater than the number of existing repetitions.
	 */
	public ERR getERR(int rep) throws HL7Exception { 
	   return (ERR)this.get("ERR", rep);
	}

	/** 
	 * Returns the number of existing repetitions of ERR 
	 */ 
	public int getERRReps() { 
	    int reps = -1; 
	    try { 
	        reps = this.getAll("ERR").length; 
	    } catch (HL7Exception e) { 
	        String message = "Unexpected error accessing data - this is probably a bug in the source code generator."; 
	        HapiLogFactory.getHapiLog(this.getClass()).error(message, e); 
	        throw new RuntimeException(message);
	    } 
	    return reps; 
	} 

	/**
	 * Inserts a specific repetition of ERR
	 * (Error)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public void  insertERR(ERR structure, int rep) throws HL7Exception { 
	   super.insertRepetition( structure, rep);
	}

	/**
	 * Inserts a specific repetition of ERR
	 * (Error)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public ERR insertERR(int rep) throws HL7Exception { 
	   return (ERR)super.insertRepetition("ERR", rep);
	}

	/**
	 * Removes a specific repetition of ERR
	 * (Error)
	 * @see AbstractGroup#insertremoveRepetition(String, int) 
	 */
	public ERR removeERR(int rep) throws HL7Exception { 
	   return (ERR)super.removeRepetition("ERR", rep);
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
	 * Returns QAK (Query Acknowledgment) - creates it if necessary
	 */
	public QAK getQAK() { 
	   QAK ret = null;
	   try {
	      ret = (QAK)this.get("QAK");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns QPD (Query Parameter Definition) - creates it if necessary
	 */
	public QPD getQPD() { 
	   QPD ret = null;
	   try {
	      ret = (QPD)this.get("QPD");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns RCP (Response Control Parameter) - creates it if necessary
	 */
	public RCP getRCP() { 
	   RCP ret = null;
	   try {
	      ret = (RCP)this.get("RCP");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns  first repetition of RSP_K31_RESPONSE (a Group object) - creates it if necessary
	 */
	public RSP_K31_RESPONSE getRESPONSE() { 
	   RSP_K31_RESPONSE ret = null;
	   try {
	      ret = (RSP_K31_RESPONSE)this.get("RESPONSE");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns a specific repetition of RSP_K31_RESPONSE
	 * (a Group object) - creates it if necessary
	 * @throws HL7Exception if the repetition requested is more than one 
	 *     greater than the number of existing repetitions.
	 */
	public RSP_K31_RESPONSE getRESPONSE(int rep) throws HL7Exception { 
	   return (RSP_K31_RESPONSE)this.get("RESPONSE", rep);
	}

	/** 
	 * Returns the number of existing repetitions of RSP_K31_RESPONSE 
	 */ 
	public int getRESPONSEReps() { 
	    int reps = -1; 
	    try { 
	        reps = this.getAll("RESPONSE").length; 
	    } catch (HL7Exception e) { 
	        String message = "Unexpected error accessing data - this is probably a bug in the source code generator."; 
	        HapiLogFactory.getHapiLog(this.getClass()).error(message, e); 
	        throw new RuntimeException(message);
	    } 
	    return reps; 
	} 

	/**
	 * Inserts a specific repetition of RSP_K31_RESPONSE
	 * (a Group object)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public void  insertRESPONSE(RSP_K31_RESPONSE structure, int rep) throws HL7Exception { 
	   super.insertRepetition( structure, rep);
	}

	/**
	 * Inserts a specific repetition of RSP_K31_RESPONSE
	 * (a Group object)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public RSP_K31_RESPONSE insertRESPONSE(int rep) throws HL7Exception { 
	   return (RSP_K31_RESPONSE)super.insertRepetition("RESPONSE", rep);
	}

	/**
	 * Removes a specific repetition of RSP_K31_RESPONSE
	 * (a Group object)
	 * @see AbstractGroup#insertremoveRepetition(String, int) 
	 */
	public RSP_K31_RESPONSE removeRESPONSE(int rep) throws HL7Exception { 
	   return (RSP_K31_RESPONSE)super.removeRepetition("RESPONSE", rep);
	}

	/**
	 * Returns DSC (Continuation Pointer) - creates it if necessary
	 */
	public DSC getDSC() { 
	   DSC ret = null;
	   try {
	      ret = (DSC)this.get("DSC");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

}
