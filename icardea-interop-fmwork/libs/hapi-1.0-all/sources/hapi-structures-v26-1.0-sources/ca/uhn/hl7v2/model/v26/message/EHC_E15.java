package ca.uhn.hl7v2.model.v26.message;

import ca.uhn.log.HapiLogFactory;
import ca.uhn.hl7v2.model.v26.group.*;

import ca.uhn.hl7v2.model.v26.segment.*;

import ca.uhn.hl7v2.HL7Exception;

import ca.uhn.hl7v2.parser.ModelClassFactory;

import ca.uhn.hl7v2.parser.DefaultModelClassFactory;

import ca.uhn.hl7v2.model.AbstractMessage;

/**
 * <p>Represents a EHC_E15 message structure (see chapter 16.3.9). This structure contains the 
 * following elements: </p>
 * 0: MSH (Message Header) <b></b><br>
 * 1: SFT (Software Segment) <b>optional repeating</b><br>
 * 2: UAC (User Authentication Credential Segment) <b>optional repeating</b><br>
 * 3: PMT (Payment Information) <b></b><br>
 * 4: PYE (Payee Information) <b></b><br>
 * 5: EHC_E15_PAYMENT_REMITTANCE_DETAIL_INFO (a Group object) <b>optional repeating</b><br>
 * 6: EHC_E15_ADJUSTMENT_PAYEE (a Group object) <b>optional repeating</b><br>
 */
public class EHC_E15 extends AbstractMessage  {

	/** 
	 * Creates a new EHC_E15 Group with custom ModelClassFactory.
	 */
	public EHC_E15(ModelClassFactory factory) {
	   super(factory);
	   init(factory);
	}

	/**
	 * Creates a new EHC_E15 Group with DefaultModelClassFactory. 
	 */ 
	public EHC_E15() { 
	   super(new DefaultModelClassFactory());
	   init(new DefaultModelClassFactory());
	}

	private void init(ModelClassFactory factory) {
	   try {
	      this.add(MSH.class, true, false);
	      this.add(SFT.class, false, true);
	      this.add(UAC.class, false, true);
	      this.add(PMT.class, true, false);
	      this.add(PYE.class, true, false);
	      this.add(EHC_E15_PAYMENT_REMITTANCE_DETAIL_INFO.class, false, true);
	      this.add(EHC_E15_ADJUSTMENT_PAYEE.class, false, true);
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error creating EHC_E15 - this is probably a bug in the source code generator.", e);
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
	 * Returns  first repetition of UAC (User Authentication Credential Segment) - creates it if necessary
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
	 * Returns a specific repetition of UAC
	 * (User Authentication Credential Segment) - creates it if necessary
	 * @throws HL7Exception if the repetition requested is more than one 
	 *     greater than the number of existing repetitions.
	 */
	public UAC getUAC(int rep) throws HL7Exception { 
	   return (UAC)this.get("UAC", rep);
	}

	/** 
	 * Returns the number of existing repetitions of UAC 
	 */ 
	public int getUACReps() { 
	    int reps = -1; 
	    try { 
	        reps = this.getAll("UAC").length; 
	    } catch (HL7Exception e) { 
	        String message = "Unexpected error accessing data - this is probably a bug in the source code generator."; 
	        HapiLogFactory.getHapiLog(this.getClass()).error(message, e); 
	        throw new RuntimeException(message);
	    } 
	    return reps; 
	} 

	/**
	 * Inserts a specific repetition of UAC
	 * (User Authentication Credential Segment)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public void  insertUAC(UAC structure, int rep) throws HL7Exception { 
	   super.insertRepetition( structure, rep);
	}

	/**
	 * Inserts a specific repetition of UAC
	 * (User Authentication Credential Segment)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public UAC insertUAC(int rep) throws HL7Exception { 
	   return (UAC)super.insertRepetition("UAC", rep);
	}

	/**
	 * Removes a specific repetition of UAC
	 * (User Authentication Credential Segment)
	 * @see AbstractGroup#insertremoveRepetition(String, int) 
	 */
	public UAC removeUAC(int rep) throws HL7Exception { 
	   return (UAC)super.removeRepetition("UAC", rep);
	}

	/**
	 * Returns PMT (Payment Information) - creates it if necessary
	 */
	public PMT getPMT() { 
	   PMT ret = null;
	   try {
	      ret = (PMT)this.get("PMT");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns PYE (Payee Information) - creates it if necessary
	 */
	public PYE getPYE() { 
	   PYE ret = null;
	   try {
	      ret = (PYE)this.get("PYE");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns  first repetition of EHC_E15_PAYMENT_REMITTANCE_DETAIL_INFO (a Group object) - creates it if necessary
	 */
	public EHC_E15_PAYMENT_REMITTANCE_DETAIL_INFO getPAYMENT_REMITTANCE_DETAIL_INFO() { 
	   EHC_E15_PAYMENT_REMITTANCE_DETAIL_INFO ret = null;
	   try {
	      ret = (EHC_E15_PAYMENT_REMITTANCE_DETAIL_INFO)this.get("PAYMENT_REMITTANCE_DETAIL_INFO");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns a specific repetition of EHC_E15_PAYMENT_REMITTANCE_DETAIL_INFO
	 * (a Group object) - creates it if necessary
	 * @throws HL7Exception if the repetition requested is more than one 
	 *     greater than the number of existing repetitions.
	 */
	public EHC_E15_PAYMENT_REMITTANCE_DETAIL_INFO getPAYMENT_REMITTANCE_DETAIL_INFO(int rep) throws HL7Exception { 
	   return (EHC_E15_PAYMENT_REMITTANCE_DETAIL_INFO)this.get("PAYMENT_REMITTANCE_DETAIL_INFO", rep);
	}

	/** 
	 * Returns the number of existing repetitions of EHC_E15_PAYMENT_REMITTANCE_DETAIL_INFO 
	 */ 
	public int getPAYMENT_REMITTANCE_DETAIL_INFOReps() { 
	    int reps = -1; 
	    try { 
	        reps = this.getAll("PAYMENT_REMITTANCE_DETAIL_INFO").length; 
	    } catch (HL7Exception e) { 
	        String message = "Unexpected error accessing data - this is probably a bug in the source code generator."; 
	        HapiLogFactory.getHapiLog(this.getClass()).error(message, e); 
	        throw new RuntimeException(message);
	    } 
	    return reps; 
	} 

	/**
	 * Inserts a specific repetition of EHC_E15_PAYMENT_REMITTANCE_DETAIL_INFO
	 * (a Group object)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public void  insertPAYMENT_REMITTANCE_DETAIL_INFO(EHC_E15_PAYMENT_REMITTANCE_DETAIL_INFO structure, int rep) throws HL7Exception { 
	   super.insertRepetition( structure, rep);
	}

	/**
	 * Inserts a specific repetition of EHC_E15_PAYMENT_REMITTANCE_DETAIL_INFO
	 * (a Group object)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public EHC_E15_PAYMENT_REMITTANCE_DETAIL_INFO insertPAYMENT_REMITTANCE_DETAIL_INFO(int rep) throws HL7Exception { 
	   return (EHC_E15_PAYMENT_REMITTANCE_DETAIL_INFO)super.insertRepetition("PAYMENT_REMITTANCE_DETAIL_INFO", rep);
	}

	/**
	 * Removes a specific repetition of EHC_E15_PAYMENT_REMITTANCE_DETAIL_INFO
	 * (a Group object)
	 * @see AbstractGroup#insertremoveRepetition(String, int) 
	 */
	public EHC_E15_PAYMENT_REMITTANCE_DETAIL_INFO removePAYMENT_REMITTANCE_DETAIL_INFO(int rep) throws HL7Exception { 
	   return (EHC_E15_PAYMENT_REMITTANCE_DETAIL_INFO)super.removeRepetition("PAYMENT_REMITTANCE_DETAIL_INFO", rep);
	}

	/**
	 * Returns  first repetition of EHC_E15_ADJUSTMENT_PAYEE (a Group object) - creates it if necessary
	 */
	public EHC_E15_ADJUSTMENT_PAYEE getADJUSTMENT_PAYEE() { 
	   EHC_E15_ADJUSTMENT_PAYEE ret = null;
	   try {
	      ret = (EHC_E15_ADJUSTMENT_PAYEE)this.get("ADJUSTMENT_PAYEE");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns a specific repetition of EHC_E15_ADJUSTMENT_PAYEE
	 * (a Group object) - creates it if necessary
	 * @throws HL7Exception if the repetition requested is more than one 
	 *     greater than the number of existing repetitions.
	 */
	public EHC_E15_ADJUSTMENT_PAYEE getADJUSTMENT_PAYEE(int rep) throws HL7Exception { 
	   return (EHC_E15_ADJUSTMENT_PAYEE)this.get("ADJUSTMENT_PAYEE", rep);
	}

	/** 
	 * Returns the number of existing repetitions of EHC_E15_ADJUSTMENT_PAYEE 
	 */ 
	public int getADJUSTMENT_PAYEEReps() { 
	    int reps = -1; 
	    try { 
	        reps = this.getAll("ADJUSTMENT_PAYEE").length; 
	    } catch (HL7Exception e) { 
	        String message = "Unexpected error accessing data - this is probably a bug in the source code generator."; 
	        HapiLogFactory.getHapiLog(this.getClass()).error(message, e); 
	        throw new RuntimeException(message);
	    } 
	    return reps; 
	} 

	/**
	 * Inserts a specific repetition of EHC_E15_ADJUSTMENT_PAYEE
	 * (a Group object)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public void  insertADJUSTMENT_PAYEE(EHC_E15_ADJUSTMENT_PAYEE structure, int rep) throws HL7Exception { 
	   super.insertRepetition( structure, rep);
	}

	/**
	 * Inserts a specific repetition of EHC_E15_ADJUSTMENT_PAYEE
	 * (a Group object)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public EHC_E15_ADJUSTMENT_PAYEE insertADJUSTMENT_PAYEE(int rep) throws HL7Exception { 
	   return (EHC_E15_ADJUSTMENT_PAYEE)super.insertRepetition("ADJUSTMENT_PAYEE", rep);
	}

	/**
	 * Removes a specific repetition of EHC_E15_ADJUSTMENT_PAYEE
	 * (a Group object)
	 * @see AbstractGroup#insertremoveRepetition(String, int) 
	 */
	public EHC_E15_ADJUSTMENT_PAYEE removeADJUSTMENT_PAYEE(int rep) throws HL7Exception { 
	   return (EHC_E15_ADJUSTMENT_PAYEE)super.removeRepetition("ADJUSTMENT_PAYEE", rep);
	}

}
