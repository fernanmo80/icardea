package ca.uhn.hl7v2.model.v26.message;

import ca.uhn.log.HapiLogFactory;
import ca.uhn.hl7v2.model.v26.group.*;

import ca.uhn.hl7v2.model.v26.segment.*;

import ca.uhn.hl7v2.HL7Exception;

import ca.uhn.hl7v2.parser.ModelClassFactory;

import ca.uhn.hl7v2.parser.DefaultModelClassFactory;

import ca.uhn.hl7v2.model.AbstractMessage;

/**
 * <p>Represents a EHC_E13 message structure (see chapter 16.3.8). This structure contains the 
 * following elements: </p>
 * 0: MSH (Message Header) <b></b><br>
 * 1: SFT (Software Segment) <b>optional repeating</b><br>
 * 2: UAC (User Authentication Credential Segment) <b>optional repeating</b><br>
 * 3: MSA (Message Acknowledgment) <b></b><br>
 * 4: ERR (Error) <b>optional repeating</b><br>
 * 5: RFI (Request for Information) <b></b><br>
 * 6: CTD (Contact Data) <b>optional repeating</b><br>
 * 7: IVC (Invoice Segment) <b></b><br>
 * 8: PSS (Product/Service Section) <b></b><br>
 * 9: PSG (Product/Service Group) <b></b><br>
 * 10: PID (Patient Identification) <b>optional </b><br>
 * 11: PSL (Product/Service Line Item) <b>optional </b><br>
 * 12: EHC_E13_REQUEST (a Group object) <b>repeating</b><br>
 */
public class EHC_E13 extends AbstractMessage  {

	/** 
	 * Creates a new EHC_E13 Group with custom ModelClassFactory.
	 */
	public EHC_E13(ModelClassFactory factory) {
	   super(factory);
	   init(factory);
	}

	/**
	 * Creates a new EHC_E13 Group with DefaultModelClassFactory. 
	 */ 
	public EHC_E13() { 
	   super(new DefaultModelClassFactory());
	   init(new DefaultModelClassFactory());
	}

	private void init(ModelClassFactory factory) {
	   try {
	      this.add(MSH.class, true, false);
	      this.add(SFT.class, false, true);
	      this.add(UAC.class, false, true);
	      this.add(MSA.class, true, false);
	      this.add(ERR.class, false, true);
	      this.add(RFI.class, true, false);
	      this.add(CTD.class, false, true);
	      this.add(IVC.class, true, false);
	      this.add(PSS.class, true, false);
	      this.add(PSG.class, true, false);
	      this.add(PID.class, false, false);
	      this.add(PSL.class, false, false);
	      this.add(EHC_E13_REQUEST.class, true, true);
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error creating EHC_E13 - this is probably a bug in the source code generator.", e);
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
	 * Returns RFI (Request for Information) - creates it if necessary
	 */
	public RFI getRFI() { 
	   RFI ret = null;
	   try {
	      ret = (RFI)this.get("RFI");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns  first repetition of CTD (Contact Data) - creates it if necessary
	 */
	public CTD getCTD() { 
	   CTD ret = null;
	   try {
	      ret = (CTD)this.get("CTD");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns a specific repetition of CTD
	 * (Contact Data) - creates it if necessary
	 * @throws HL7Exception if the repetition requested is more than one 
	 *     greater than the number of existing repetitions.
	 */
	public CTD getCTD(int rep) throws HL7Exception { 
	   return (CTD)this.get("CTD", rep);
	}

	/** 
	 * Returns the number of existing repetitions of CTD 
	 */ 
	public int getCTDReps() { 
	    int reps = -1; 
	    try { 
	        reps = this.getAll("CTD").length; 
	    } catch (HL7Exception e) { 
	        String message = "Unexpected error accessing data - this is probably a bug in the source code generator."; 
	        HapiLogFactory.getHapiLog(this.getClass()).error(message, e); 
	        throw new RuntimeException(message);
	    } 
	    return reps; 
	} 

	/**
	 * Inserts a specific repetition of CTD
	 * (Contact Data)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public void  insertCTD(CTD structure, int rep) throws HL7Exception { 
	   super.insertRepetition( structure, rep);
	}

	/**
	 * Inserts a specific repetition of CTD
	 * (Contact Data)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public CTD insertCTD(int rep) throws HL7Exception { 
	   return (CTD)super.insertRepetition("CTD", rep);
	}

	/**
	 * Removes a specific repetition of CTD
	 * (Contact Data)
	 * @see AbstractGroup#insertremoveRepetition(String, int) 
	 */
	public CTD removeCTD(int rep) throws HL7Exception { 
	   return (CTD)super.removeRepetition("CTD", rep);
	}

	/**
	 * Returns IVC (Invoice Segment) - creates it if necessary
	 */
	public IVC getIVC() { 
	   IVC ret = null;
	   try {
	      ret = (IVC)this.get("IVC");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns PSS (Product/Service Section) - creates it if necessary
	 */
	public PSS getPSS() { 
	   PSS ret = null;
	   try {
	      ret = (PSS)this.get("PSS");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns PSG (Product/Service Group) - creates it if necessary
	 */
	public PSG getPSG() { 
	   PSG ret = null;
	   try {
	      ret = (PSG)this.get("PSG");
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
	 * Returns PSL (Product/Service Line Item) - creates it if necessary
	 */
	public PSL getPSL() { 
	   PSL ret = null;
	   try {
	      ret = (PSL)this.get("PSL");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns  first repetition of EHC_E13_REQUEST (a Group object) - creates it if necessary
	 */
	public EHC_E13_REQUEST getREQUEST() { 
	   EHC_E13_REQUEST ret = null;
	   try {
	      ret = (EHC_E13_REQUEST)this.get("REQUEST");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns a specific repetition of EHC_E13_REQUEST
	 * (a Group object) - creates it if necessary
	 * @throws HL7Exception if the repetition requested is more than one 
	 *     greater than the number of existing repetitions.
	 */
	public EHC_E13_REQUEST getREQUEST(int rep) throws HL7Exception { 
	   return (EHC_E13_REQUEST)this.get("REQUEST", rep);
	}

	/** 
	 * Returns the number of existing repetitions of EHC_E13_REQUEST 
	 */ 
	public int getREQUESTReps() { 
	    int reps = -1; 
	    try { 
	        reps = this.getAll("REQUEST").length; 
	    } catch (HL7Exception e) { 
	        String message = "Unexpected error accessing data - this is probably a bug in the source code generator."; 
	        HapiLogFactory.getHapiLog(this.getClass()).error(message, e); 
	        throw new RuntimeException(message);
	    } 
	    return reps; 
	} 

	/**
	 * Inserts a specific repetition of EHC_E13_REQUEST
	 * (a Group object)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public void  insertREQUEST(EHC_E13_REQUEST structure, int rep) throws HL7Exception { 
	   super.insertRepetition( structure, rep);
	}

	/**
	 * Inserts a specific repetition of EHC_E13_REQUEST
	 * (a Group object)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public EHC_E13_REQUEST insertREQUEST(int rep) throws HL7Exception { 
	   return (EHC_E13_REQUEST)super.insertRepetition("REQUEST", rep);
	}

	/**
	 * Removes a specific repetition of EHC_E13_REQUEST
	 * (a Group object)
	 * @see AbstractGroup#insertremoveRepetition(String, int) 
	 */
	public EHC_E13_REQUEST removeREQUEST(int rep) throws HL7Exception { 
	   return (EHC_E13_REQUEST)super.removeRepetition("REQUEST", rep);
	}

}
