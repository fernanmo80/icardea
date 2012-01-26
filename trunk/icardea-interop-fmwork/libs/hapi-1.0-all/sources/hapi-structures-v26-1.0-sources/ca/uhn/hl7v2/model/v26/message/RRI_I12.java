package ca.uhn.hl7v2.model.v26.message;

import ca.uhn.log.HapiLogFactory;
import ca.uhn.hl7v2.model.v26.group.*;

import ca.uhn.hl7v2.model.v26.segment.*;

import ca.uhn.hl7v2.HL7Exception;

import ca.uhn.hl7v2.parser.ModelClassFactory;

import ca.uhn.hl7v2.parser.DefaultModelClassFactory;

import ca.uhn.hl7v2.model.AbstractMessage;

/**
 * <p>Represents a RRI_I12 message structure (see chapter 11.5.1). This structure contains the 
 * following elements: </p>
 * 0: MSH (Message Header) <b></b><br>
 * 1: SFT (Software Segment) <b>optional repeating</b><br>
 * 2: UAC (User Authentication Credential Segment) <b>optional </b><br>
 * 3: MSA (Message Acknowledgment) <b>optional </b><br>
 * 4: RF1 (Referral Information) <b>optional </b><br>
 * 5: RRI_I12_AUTHORIZATION_CONTACT (a Group object) <b>optional </b><br>
 * 6: RRI_I12_PROVIDER_CONTACT (a Group object) <b>repeating</b><br>
 * 7: PID (Patient Identification) <b></b><br>
 * 8: ACC (Accident) <b>optional </b><br>
 * 9: DG1 (Diagnosis) <b>optional repeating</b><br>
 * 10: DRG (Diagnosis Related Group) <b>optional repeating</b><br>
 * 11: AL1 (Patient Allergy Information) <b>optional repeating</b><br>
 * 12: RRI_I12_PROCEDURE (a Group object) <b>optional repeating</b><br>
 * 13: RRI_I12_OBSERVATION (a Group object) <b>optional repeating</b><br>
 * 14: RRI_I12_PATIENT_VISIT (a Group object) <b>optional </b><br>
 * 15: NTE (Notes and Comments) <b>optional repeating</b><br>
 */
public class RRI_I12 extends AbstractMessage  {

	/** 
	 * Creates a new RRI_I12 Group with custom ModelClassFactory.
	 */
	public RRI_I12(ModelClassFactory factory) {
	   super(factory);
	   init(factory);
	}

	/**
	 * Creates a new RRI_I12 Group with DefaultModelClassFactory. 
	 */ 
	public RRI_I12() { 
	   super(new DefaultModelClassFactory());
	   init(new DefaultModelClassFactory());
	}

	private void init(ModelClassFactory factory) {
	   try {
	      this.add(MSH.class, true, false);
	      this.add(SFT.class, false, true);
	      this.add(UAC.class, false, false);
	      this.add(MSA.class, false, false);
	      this.add(RF1.class, false, false);
	      this.add(RRI_I12_AUTHORIZATION_CONTACT.class, false, false);
	      this.add(RRI_I12_PROVIDER_CONTACT.class, true, true);
	      this.add(PID.class, true, false);
	      this.add(ACC.class, false, false);
	      this.add(DG1.class, false, true);
	      this.add(DRG.class, false, true);
	      this.add(AL1.class, false, true);
	      this.add(RRI_I12_PROCEDURE.class, false, true);
	      this.add(RRI_I12_OBSERVATION.class, false, true);
	      this.add(RRI_I12_PATIENT_VISIT.class, false, false);
	      this.add(NTE.class, false, true);
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error creating RRI_I12 - this is probably a bug in the source code generator.", e);
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
	 * Returns RF1 (Referral Information) - creates it if necessary
	 */
	public RF1 getRF1() { 
	   RF1 ret = null;
	   try {
	      ret = (RF1)this.get("RF1");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns RRI_I12_AUTHORIZATION_CONTACT (a Group object) - creates it if necessary
	 */
	public RRI_I12_AUTHORIZATION_CONTACT getAUTHORIZATION_CONTACT() { 
	   RRI_I12_AUTHORIZATION_CONTACT ret = null;
	   try {
	      ret = (RRI_I12_AUTHORIZATION_CONTACT)this.get("AUTHORIZATION_CONTACT");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns  first repetition of RRI_I12_PROVIDER_CONTACT (a Group object) - creates it if necessary
	 */
	public RRI_I12_PROVIDER_CONTACT getPROVIDER_CONTACT() { 
	   RRI_I12_PROVIDER_CONTACT ret = null;
	   try {
	      ret = (RRI_I12_PROVIDER_CONTACT)this.get("PROVIDER_CONTACT");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns a specific repetition of RRI_I12_PROVIDER_CONTACT
	 * (a Group object) - creates it if necessary
	 * @throws HL7Exception if the repetition requested is more than one 
	 *     greater than the number of existing repetitions.
	 */
	public RRI_I12_PROVIDER_CONTACT getPROVIDER_CONTACT(int rep) throws HL7Exception { 
	   return (RRI_I12_PROVIDER_CONTACT)this.get("PROVIDER_CONTACT", rep);
	}

	/** 
	 * Returns the number of existing repetitions of RRI_I12_PROVIDER_CONTACT 
	 */ 
	public int getPROVIDER_CONTACTReps() { 
	    int reps = -1; 
	    try { 
	        reps = this.getAll("PROVIDER_CONTACT").length; 
	    } catch (HL7Exception e) { 
	        String message = "Unexpected error accessing data - this is probably a bug in the source code generator."; 
	        HapiLogFactory.getHapiLog(this.getClass()).error(message, e); 
	        throw new RuntimeException(message);
	    } 
	    return reps; 
	} 

	/**
	 * Inserts a specific repetition of RRI_I12_PROVIDER_CONTACT
	 * (a Group object)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public void  insertPROVIDER_CONTACT(RRI_I12_PROVIDER_CONTACT structure, int rep) throws HL7Exception { 
	   super.insertRepetition( structure, rep);
	}

	/**
	 * Inserts a specific repetition of RRI_I12_PROVIDER_CONTACT
	 * (a Group object)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public RRI_I12_PROVIDER_CONTACT insertPROVIDER_CONTACT(int rep) throws HL7Exception { 
	   return (RRI_I12_PROVIDER_CONTACT)super.insertRepetition("PROVIDER_CONTACT", rep);
	}

	/**
	 * Removes a specific repetition of RRI_I12_PROVIDER_CONTACT
	 * (a Group object)
	 * @see AbstractGroup#insertremoveRepetition(String, int) 
	 */
	public RRI_I12_PROVIDER_CONTACT removePROVIDER_CONTACT(int rep) throws HL7Exception { 
	   return (RRI_I12_PROVIDER_CONTACT)super.removeRepetition("PROVIDER_CONTACT", rep);
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
	 * Returns ACC (Accident) - creates it if necessary
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
	 * Returns  first repetition of DRG (Diagnosis Related Group) - creates it if necessary
	 */
	public DRG getDRG() { 
	   DRG ret = null;
	   try {
	      ret = (DRG)this.get("DRG");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns a specific repetition of DRG
	 * (Diagnosis Related Group) - creates it if necessary
	 * @throws HL7Exception if the repetition requested is more than one 
	 *     greater than the number of existing repetitions.
	 */
	public DRG getDRG(int rep) throws HL7Exception { 
	   return (DRG)this.get("DRG", rep);
	}

	/** 
	 * Returns the number of existing repetitions of DRG 
	 */ 
	public int getDRGReps() { 
	    int reps = -1; 
	    try { 
	        reps = this.getAll("DRG").length; 
	    } catch (HL7Exception e) { 
	        String message = "Unexpected error accessing data - this is probably a bug in the source code generator."; 
	        HapiLogFactory.getHapiLog(this.getClass()).error(message, e); 
	        throw new RuntimeException(message);
	    } 
	    return reps; 
	} 

	/**
	 * Inserts a specific repetition of DRG
	 * (Diagnosis Related Group)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public void  insertDRG(DRG structure, int rep) throws HL7Exception { 
	   super.insertRepetition( structure, rep);
	}

	/**
	 * Inserts a specific repetition of DRG
	 * (Diagnosis Related Group)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public DRG insertDRG(int rep) throws HL7Exception { 
	   return (DRG)super.insertRepetition("DRG", rep);
	}

	/**
	 * Removes a specific repetition of DRG
	 * (Diagnosis Related Group)
	 * @see AbstractGroup#insertremoveRepetition(String, int) 
	 */
	public DRG removeDRG(int rep) throws HL7Exception { 
	   return (DRG)super.removeRepetition("DRG", rep);
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

	/**
	 * Returns  first repetition of RRI_I12_PROCEDURE (a Group object) - creates it if necessary
	 */
	public RRI_I12_PROCEDURE getPROCEDURE() { 
	   RRI_I12_PROCEDURE ret = null;
	   try {
	      ret = (RRI_I12_PROCEDURE)this.get("PROCEDURE");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns a specific repetition of RRI_I12_PROCEDURE
	 * (a Group object) - creates it if necessary
	 * @throws HL7Exception if the repetition requested is more than one 
	 *     greater than the number of existing repetitions.
	 */
	public RRI_I12_PROCEDURE getPROCEDURE(int rep) throws HL7Exception { 
	   return (RRI_I12_PROCEDURE)this.get("PROCEDURE", rep);
	}

	/** 
	 * Returns the number of existing repetitions of RRI_I12_PROCEDURE 
	 */ 
	public int getPROCEDUREReps() { 
	    int reps = -1; 
	    try { 
	        reps = this.getAll("PROCEDURE").length; 
	    } catch (HL7Exception e) { 
	        String message = "Unexpected error accessing data - this is probably a bug in the source code generator."; 
	        HapiLogFactory.getHapiLog(this.getClass()).error(message, e); 
	        throw new RuntimeException(message);
	    } 
	    return reps; 
	} 

	/**
	 * Inserts a specific repetition of RRI_I12_PROCEDURE
	 * (a Group object)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public void  insertPROCEDURE(RRI_I12_PROCEDURE structure, int rep) throws HL7Exception { 
	   super.insertRepetition( structure, rep);
	}

	/**
	 * Inserts a specific repetition of RRI_I12_PROCEDURE
	 * (a Group object)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public RRI_I12_PROCEDURE insertPROCEDURE(int rep) throws HL7Exception { 
	   return (RRI_I12_PROCEDURE)super.insertRepetition("PROCEDURE", rep);
	}

	/**
	 * Removes a specific repetition of RRI_I12_PROCEDURE
	 * (a Group object)
	 * @see AbstractGroup#insertremoveRepetition(String, int) 
	 */
	public RRI_I12_PROCEDURE removePROCEDURE(int rep) throws HL7Exception { 
	   return (RRI_I12_PROCEDURE)super.removeRepetition("PROCEDURE", rep);
	}

	/**
	 * Returns  first repetition of RRI_I12_OBSERVATION (a Group object) - creates it if necessary
	 */
	public RRI_I12_OBSERVATION getOBSERVATION() { 
	   RRI_I12_OBSERVATION ret = null;
	   try {
	      ret = (RRI_I12_OBSERVATION)this.get("OBSERVATION");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns a specific repetition of RRI_I12_OBSERVATION
	 * (a Group object) - creates it if necessary
	 * @throws HL7Exception if the repetition requested is more than one 
	 *     greater than the number of existing repetitions.
	 */
	public RRI_I12_OBSERVATION getOBSERVATION(int rep) throws HL7Exception { 
	   return (RRI_I12_OBSERVATION)this.get("OBSERVATION", rep);
	}

	/** 
	 * Returns the number of existing repetitions of RRI_I12_OBSERVATION 
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
	 * Inserts a specific repetition of RRI_I12_OBSERVATION
	 * (a Group object)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public void  insertOBSERVATION(RRI_I12_OBSERVATION structure, int rep) throws HL7Exception { 
	   super.insertRepetition( structure, rep);
	}

	/**
	 * Inserts a specific repetition of RRI_I12_OBSERVATION
	 * (a Group object)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public RRI_I12_OBSERVATION insertOBSERVATION(int rep) throws HL7Exception { 
	   return (RRI_I12_OBSERVATION)super.insertRepetition("OBSERVATION", rep);
	}

	/**
	 * Removes a specific repetition of RRI_I12_OBSERVATION
	 * (a Group object)
	 * @see AbstractGroup#insertremoveRepetition(String, int) 
	 */
	public RRI_I12_OBSERVATION removeOBSERVATION(int rep) throws HL7Exception { 
	   return (RRI_I12_OBSERVATION)super.removeRepetition("OBSERVATION", rep);
	}

	/**
	 * Returns RRI_I12_PATIENT_VISIT (a Group object) - creates it if necessary
	 */
	public RRI_I12_PATIENT_VISIT getPATIENT_VISIT() { 
	   RRI_I12_PATIENT_VISIT ret = null;
	   try {
	      ret = (RRI_I12_PATIENT_VISIT)this.get("PATIENT_VISIT");
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

}
