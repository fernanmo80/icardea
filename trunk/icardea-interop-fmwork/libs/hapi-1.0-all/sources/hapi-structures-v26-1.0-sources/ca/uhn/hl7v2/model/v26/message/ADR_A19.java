package ca.uhn.hl7v2.model.v26.message;

import ca.uhn.log.HapiLogFactory;
import ca.uhn.hl7v2.model.v26.group.*;

import ca.uhn.hl7v2.model.v26.segment.*;

import ca.uhn.hl7v2.HL7Exception;

import ca.uhn.hl7v2.parser.ModelClassFactory;

import ca.uhn.hl7v2.parser.DefaultModelClassFactory;

import ca.uhn.hl7v2.model.AbstractMessage;

/**
 * <p>Represents a ADR_A19 message structure (see chapter 3.3.19). This structure contains the 
 * following elements: </p>
 * 0: MSH (Message Header) <b></b><br>
 * 1: SFT (Software Segment) <b>optional repeating</b><br>
 * 2: UAC (User Authentication Credential Segment) <b>optional </b><br>
 * 3: MSA (Message Acknowledgment) <b></b><br>
 * 4: ERR (Error) <b>optional </b><br>
 * 5: QAK (Query Acknowledgment) <b>optional </b><br>
 * 6: QRD (Original-Style Query Definition) <b></b><br>
 * 7: QRF (Original style query filter) <b>optional </b><br>
 * 8: ADR_A19_QUERY_RESPONSE (a Group object) <b>repeating</b><br>
 * 9: DSC (Continuation Pointer) <b>optional </b><br>
 */
public class ADR_A19 extends AbstractMessage  {

	/** 
	 * Creates a new ADR_A19 Group with custom ModelClassFactory.
	 */
	public ADR_A19(ModelClassFactory factory) {
	   super(factory);
	   init(factory);
	}

	/**
	 * Creates a new ADR_A19 Group with DefaultModelClassFactory. 
	 */ 
	public ADR_A19() { 
	   super(new DefaultModelClassFactory());
	   init(new DefaultModelClassFactory());
	}

	private void init(ModelClassFactory factory) {
	   try {
	      this.add(MSH.class, true, false);
	      this.add(SFT.class, false, true);
	      this.add(UAC.class, false, false);
	      this.add(MSA.class, true, false);
	      this.add(ERR.class, false, false);
	      this.add(QAK.class, false, false);
	      this.add(QRD.class, true, false);
	      this.add(QRF.class, false, false);
	      this.add(ADR_A19_QUERY_RESPONSE.class, true, true);
	      this.add(DSC.class, false, false);
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error creating ADR_A19 - this is probably a bug in the source code generator.", e);
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
	 * Returns ERR (Error) - creates it if necessary
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
	 * Returns QRD (Original-Style Query Definition) - creates it if necessary
	 */
	public QRD getQRD() { 
	   QRD ret = null;
	   try {
	      ret = (QRD)this.get("QRD");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns QRF (Original style query filter) - creates it if necessary
	 */
	public QRF getQRF() { 
	   QRF ret = null;
	   try {
	      ret = (QRF)this.get("QRF");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns  first repetition of ADR_A19_QUERY_RESPONSE (a Group object) - creates it if necessary
	 */
	public ADR_A19_QUERY_RESPONSE getQUERY_RESPONSE() { 
	   ADR_A19_QUERY_RESPONSE ret = null;
	   try {
	      ret = (ADR_A19_QUERY_RESPONSE)this.get("QUERY_RESPONSE");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns a specific repetition of ADR_A19_QUERY_RESPONSE
	 * (a Group object) - creates it if necessary
	 * @throws HL7Exception if the repetition requested is more than one 
	 *     greater than the number of existing repetitions.
	 */
	public ADR_A19_QUERY_RESPONSE getQUERY_RESPONSE(int rep) throws HL7Exception { 
	   return (ADR_A19_QUERY_RESPONSE)this.get("QUERY_RESPONSE", rep);
	}

	/** 
	 * Returns the number of existing repetitions of ADR_A19_QUERY_RESPONSE 
	 */ 
	public int getQUERY_RESPONSEReps() { 
	    int reps = -1; 
	    try { 
	        reps = this.getAll("QUERY_RESPONSE").length; 
	    } catch (HL7Exception e) { 
	        String message = "Unexpected error accessing data - this is probably a bug in the source code generator."; 
	        HapiLogFactory.getHapiLog(this.getClass()).error(message, e); 
	        throw new RuntimeException(message);
	    } 
	    return reps; 
	} 

	/**
	 * Inserts a specific repetition of ADR_A19_QUERY_RESPONSE
	 * (a Group object)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public void  insertQUERY_RESPONSE(ADR_A19_QUERY_RESPONSE structure, int rep) throws HL7Exception { 
	   super.insertRepetition( structure, rep);
	}

	/**
	 * Inserts a specific repetition of ADR_A19_QUERY_RESPONSE
	 * (a Group object)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public ADR_A19_QUERY_RESPONSE insertQUERY_RESPONSE(int rep) throws HL7Exception { 
	   return (ADR_A19_QUERY_RESPONSE)super.insertRepetition("QUERY_RESPONSE", rep);
	}

	/**
	 * Removes a specific repetition of ADR_A19_QUERY_RESPONSE
	 * (a Group object)
	 * @see AbstractGroup#insertremoveRepetition(String, int) 
	 */
	public ADR_A19_QUERY_RESPONSE removeQUERY_RESPONSE(int rep) throws HL7Exception { 
	   return (ADR_A19_QUERY_RESPONSE)super.removeRepetition("QUERY_RESPONSE", rep);
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