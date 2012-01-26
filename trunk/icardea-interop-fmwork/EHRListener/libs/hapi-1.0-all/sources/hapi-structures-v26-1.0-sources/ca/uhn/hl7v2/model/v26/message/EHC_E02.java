package ca.uhn.hl7v2.model.v26.message;

import ca.uhn.log.HapiLogFactory;
import ca.uhn.hl7v2.model.v26.group.*;

import ca.uhn.hl7v2.model.v26.segment.*;

import ca.uhn.hl7v2.HL7Exception;

import ca.uhn.hl7v2.parser.ModelClassFactory;

import ca.uhn.hl7v2.parser.DefaultModelClassFactory;

import ca.uhn.hl7v2.model.AbstractMessage;

/**
 * <p>Represents a EHC_E02 message structure (see chapter 16.3.2). This structure contains the 
 * following elements: </p>
 * 0: MSH (Message Header) <b></b><br>
 * 1: SFT (Software Segment) <b>optional repeating</b><br>
 * 2: UAC (User Authentication Credential Segment) <b>optional repeating</b><br>
 * 3: IVC (Invoice Segment) <b></b><br>
 * 4: PYE (Payee Information) <b></b><br>
 * 5: CTD (Contact Data) <b>optional repeating</b><br>
 * 6: NTE (Notes and Comments) <b>optional repeating</b><br>
 * 7: EHC_E02_PRODUCT_SERVICE_SECTION (a Group object) <b>optional repeating</b><br>
 */
public class EHC_E02 extends AbstractMessage  {

	/** 
	 * Creates a new EHC_E02 Group with custom ModelClassFactory.
	 */
	public EHC_E02(ModelClassFactory factory) {
	   super(factory);
	   init(factory);
	}

	/**
	 * Creates a new EHC_E02 Group with DefaultModelClassFactory. 
	 */ 
	public EHC_E02() { 
	   super(new DefaultModelClassFactory());
	   init(new DefaultModelClassFactory());
	}

	private void init(ModelClassFactory factory) {
	   try {
	      this.add(MSH.class, true, false);
	      this.add(SFT.class, false, true);
	      this.add(UAC.class, false, true);
	      this.add(IVC.class, true, false);
	      this.add(PYE.class, true, false);
	      this.add(CTD.class, false, true);
	      this.add(NTE.class, false, true);
	      this.add(EHC_E02_PRODUCT_SERVICE_SECTION.class, false, true);
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error creating EHC_E02 - this is probably a bug in the source code generator.", e);
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
	 * Returns  first repetition of EHC_E02_PRODUCT_SERVICE_SECTION (a Group object) - creates it if necessary
	 */
	public EHC_E02_PRODUCT_SERVICE_SECTION getPRODUCT_SERVICE_SECTION() { 
	   EHC_E02_PRODUCT_SERVICE_SECTION ret = null;
	   try {
	      ret = (EHC_E02_PRODUCT_SERVICE_SECTION)this.get("PRODUCT_SERVICE_SECTION");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns a specific repetition of EHC_E02_PRODUCT_SERVICE_SECTION
	 * (a Group object) - creates it if necessary
	 * @throws HL7Exception if the repetition requested is more than one 
	 *     greater than the number of existing repetitions.
	 */
	public EHC_E02_PRODUCT_SERVICE_SECTION getPRODUCT_SERVICE_SECTION(int rep) throws HL7Exception { 
	   return (EHC_E02_PRODUCT_SERVICE_SECTION)this.get("PRODUCT_SERVICE_SECTION", rep);
	}

	/** 
	 * Returns the number of existing repetitions of EHC_E02_PRODUCT_SERVICE_SECTION 
	 */ 
	public int getPRODUCT_SERVICE_SECTIONReps() { 
	    int reps = -1; 
	    try { 
	        reps = this.getAll("PRODUCT_SERVICE_SECTION").length; 
	    } catch (HL7Exception e) { 
	        String message = "Unexpected error accessing data - this is probably a bug in the source code generator."; 
	        HapiLogFactory.getHapiLog(this.getClass()).error(message, e); 
	        throw new RuntimeException(message);
	    } 
	    return reps; 
	} 

	/**
	 * Inserts a specific repetition of EHC_E02_PRODUCT_SERVICE_SECTION
	 * (a Group object)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public void  insertPRODUCT_SERVICE_SECTION(EHC_E02_PRODUCT_SERVICE_SECTION structure, int rep) throws HL7Exception { 
	   super.insertRepetition( structure, rep);
	}

	/**
	 * Inserts a specific repetition of EHC_E02_PRODUCT_SERVICE_SECTION
	 * (a Group object)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public EHC_E02_PRODUCT_SERVICE_SECTION insertPRODUCT_SERVICE_SECTION(int rep) throws HL7Exception { 
	   return (EHC_E02_PRODUCT_SERVICE_SECTION)super.insertRepetition("PRODUCT_SERVICE_SECTION", rep);
	}

	/**
	 * Removes a specific repetition of EHC_E02_PRODUCT_SERVICE_SECTION
	 * (a Group object)
	 * @see AbstractGroup#insertremoveRepetition(String, int) 
	 */
	public EHC_E02_PRODUCT_SERVICE_SECTION removePRODUCT_SERVICE_SECTION(int rep) throws HL7Exception { 
	   return (EHC_E02_PRODUCT_SERVICE_SECTION)super.removeRepetition("PRODUCT_SERVICE_SECTION", rep);
	}

}
