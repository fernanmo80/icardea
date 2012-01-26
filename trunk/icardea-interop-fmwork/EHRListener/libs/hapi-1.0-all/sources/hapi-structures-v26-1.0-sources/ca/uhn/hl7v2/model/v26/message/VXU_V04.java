package ca.uhn.hl7v2.model.v26.message;

import ca.uhn.log.HapiLogFactory;
import ca.uhn.hl7v2.model.v26.group.*;

import ca.uhn.hl7v2.model.v26.segment.*;

import ca.uhn.hl7v2.HL7Exception;

import ca.uhn.hl7v2.parser.ModelClassFactory;

import ca.uhn.hl7v2.parser.DefaultModelClassFactory;

import ca.uhn.hl7v2.model.AbstractMessage;

/**
 * <p>Represents a VXU_V04 message structure (see chapter 4.17.6). This structure contains the 
 * following elements: </p>
 * 0: MSH (Message Header) <b></b><br>
 * 1: SFT (Software Segment) <b>optional repeating</b><br>
 * 2: UAC (User Authentication Credential Segment) <b>optional </b><br>
 * 3: PID (Patient Identification) <b></b><br>
 * 4: PD1 (Patient Additional Demographic) <b>optional </b><br>
 * 5: NK1 (Next of Kin / Associated Parties) <b>optional repeating</b><br>
 * 6: VXU_V04_PATIENT (a Group object) <b>optional </b><br>
 * 7: GT1 (Guarantor) <b>optional repeating</b><br>
 * 8: VXU_V04_INSURANCE (a Group object) <b>optional repeating</b><br>
 * 9: VXU_V04_ORDER (a Group object) <b>optional repeating</b><br>
 */
public class VXU_V04 extends AbstractMessage  {

	/** 
	 * Creates a new VXU_V04 Group with custom ModelClassFactory.
	 */
	public VXU_V04(ModelClassFactory factory) {
	   super(factory);
	   init(factory);
	}

	/**
	 * Creates a new VXU_V04 Group with DefaultModelClassFactory. 
	 */ 
	public VXU_V04() { 
	   super(new DefaultModelClassFactory());
	   init(new DefaultModelClassFactory());
	}

	private void init(ModelClassFactory factory) {
	   try {
	      this.add(MSH.class, true, false);
	      this.add(SFT.class, false, true);
	      this.add(UAC.class, false, false);
	      this.add(PID.class, true, false);
	      this.add(PD1.class, false, false);
	      this.add(NK1.class, false, true);
	      this.add(VXU_V04_PATIENT.class, false, false);
	      this.add(GT1.class, false, true);
	      this.add(VXU_V04_INSURANCE.class, false, true);
	      this.add(VXU_V04_ORDER.class, false, true);
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error creating VXU_V04 - this is probably a bug in the source code generator.", e);
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
	 * Returns  first repetition of NK1 (Next of Kin / Associated Parties) - creates it if necessary
	 */
	public NK1 getNK1() { 
	   NK1 ret = null;
	   try {
	      ret = (NK1)this.get("NK1");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns a specific repetition of NK1
	 * (Next of Kin / Associated Parties) - creates it if necessary
	 * @throws HL7Exception if the repetition requested is more than one 
	 *     greater than the number of existing repetitions.
	 */
	public NK1 getNK1(int rep) throws HL7Exception { 
	   return (NK1)this.get("NK1", rep);
	}

	/** 
	 * Returns the number of existing repetitions of NK1 
	 */ 
	public int getNK1Reps() { 
	    int reps = -1; 
	    try { 
	        reps = this.getAll("NK1").length; 
	    } catch (HL7Exception e) { 
	        String message = "Unexpected error accessing data - this is probably a bug in the source code generator."; 
	        HapiLogFactory.getHapiLog(this.getClass()).error(message, e); 
	        throw new RuntimeException(message);
	    } 
	    return reps; 
	} 

	/**
	 * Inserts a specific repetition of NK1
	 * (Next of Kin / Associated Parties)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public void  insertNK1(NK1 structure, int rep) throws HL7Exception { 
	   super.insertRepetition( structure, rep);
	}

	/**
	 * Inserts a specific repetition of NK1
	 * (Next of Kin / Associated Parties)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public NK1 insertNK1(int rep) throws HL7Exception { 
	   return (NK1)super.insertRepetition("NK1", rep);
	}

	/**
	 * Removes a specific repetition of NK1
	 * (Next of Kin / Associated Parties)
	 * @see AbstractGroup#insertremoveRepetition(String, int) 
	 */
	public NK1 removeNK1(int rep) throws HL7Exception { 
	   return (NK1)super.removeRepetition("NK1", rep);
	}

	/**
	 * Returns VXU_V04_PATIENT (a Group object) - creates it if necessary
	 */
	public VXU_V04_PATIENT getPATIENT() { 
	   VXU_V04_PATIENT ret = null;
	   try {
	      ret = (VXU_V04_PATIENT)this.get("PATIENT");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns  first repetition of GT1 (Guarantor) - creates it if necessary
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
	 * Returns a specific repetition of GT1
	 * (Guarantor) - creates it if necessary
	 * @throws HL7Exception if the repetition requested is more than one 
	 *     greater than the number of existing repetitions.
	 */
	public GT1 getGT1(int rep) throws HL7Exception { 
	   return (GT1)this.get("GT1", rep);
	}

	/** 
	 * Returns the number of existing repetitions of GT1 
	 */ 
	public int getGT1Reps() { 
	    int reps = -1; 
	    try { 
	        reps = this.getAll("GT1").length; 
	    } catch (HL7Exception e) { 
	        String message = "Unexpected error accessing data - this is probably a bug in the source code generator."; 
	        HapiLogFactory.getHapiLog(this.getClass()).error(message, e); 
	        throw new RuntimeException(message);
	    } 
	    return reps; 
	} 

	/**
	 * Inserts a specific repetition of GT1
	 * (Guarantor)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public void  insertGT1(GT1 structure, int rep) throws HL7Exception { 
	   super.insertRepetition( structure, rep);
	}

	/**
	 * Inserts a specific repetition of GT1
	 * (Guarantor)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public GT1 insertGT1(int rep) throws HL7Exception { 
	   return (GT1)super.insertRepetition("GT1", rep);
	}

	/**
	 * Removes a specific repetition of GT1
	 * (Guarantor)
	 * @see AbstractGroup#insertremoveRepetition(String, int) 
	 */
	public GT1 removeGT1(int rep) throws HL7Exception { 
	   return (GT1)super.removeRepetition("GT1", rep);
	}

	/**
	 * Returns  first repetition of VXU_V04_INSURANCE (a Group object) - creates it if necessary
	 */
	public VXU_V04_INSURANCE getINSURANCE() { 
	   VXU_V04_INSURANCE ret = null;
	   try {
	      ret = (VXU_V04_INSURANCE)this.get("INSURANCE");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns a specific repetition of VXU_V04_INSURANCE
	 * (a Group object) - creates it if necessary
	 * @throws HL7Exception if the repetition requested is more than one 
	 *     greater than the number of existing repetitions.
	 */
	public VXU_V04_INSURANCE getINSURANCE(int rep) throws HL7Exception { 
	   return (VXU_V04_INSURANCE)this.get("INSURANCE", rep);
	}

	/** 
	 * Returns the number of existing repetitions of VXU_V04_INSURANCE 
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
	 * Inserts a specific repetition of VXU_V04_INSURANCE
	 * (a Group object)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public void  insertINSURANCE(VXU_V04_INSURANCE structure, int rep) throws HL7Exception { 
	   super.insertRepetition( structure, rep);
	}

	/**
	 * Inserts a specific repetition of VXU_V04_INSURANCE
	 * (a Group object)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public VXU_V04_INSURANCE insertINSURANCE(int rep) throws HL7Exception { 
	   return (VXU_V04_INSURANCE)super.insertRepetition("INSURANCE", rep);
	}

	/**
	 * Removes a specific repetition of VXU_V04_INSURANCE
	 * (a Group object)
	 * @see AbstractGroup#insertremoveRepetition(String, int) 
	 */
	public VXU_V04_INSURANCE removeINSURANCE(int rep) throws HL7Exception { 
	   return (VXU_V04_INSURANCE)super.removeRepetition("INSURANCE", rep);
	}

	/**
	 * Returns  first repetition of VXU_V04_ORDER (a Group object) - creates it if necessary
	 */
	public VXU_V04_ORDER getORDER() { 
	   VXU_V04_ORDER ret = null;
	   try {
	      ret = (VXU_V04_ORDER)this.get("ORDER");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns a specific repetition of VXU_V04_ORDER
	 * (a Group object) - creates it if necessary
	 * @throws HL7Exception if the repetition requested is more than one 
	 *     greater than the number of existing repetitions.
	 */
	public VXU_V04_ORDER getORDER(int rep) throws HL7Exception { 
	   return (VXU_V04_ORDER)this.get("ORDER", rep);
	}

	/** 
	 * Returns the number of existing repetitions of VXU_V04_ORDER 
	 */ 
	public int getORDERReps() { 
	    int reps = -1; 
	    try { 
	        reps = this.getAll("ORDER").length; 
	    } catch (HL7Exception e) { 
	        String message = "Unexpected error accessing data - this is probably a bug in the source code generator."; 
	        HapiLogFactory.getHapiLog(this.getClass()).error(message, e); 
	        throw new RuntimeException(message);
	    } 
	    return reps; 
	} 

	/**
	 * Inserts a specific repetition of VXU_V04_ORDER
	 * (a Group object)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public void  insertORDER(VXU_V04_ORDER structure, int rep) throws HL7Exception { 
	   super.insertRepetition( structure, rep);
	}

	/**
	 * Inserts a specific repetition of VXU_V04_ORDER
	 * (a Group object)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public VXU_V04_ORDER insertORDER(int rep) throws HL7Exception { 
	   return (VXU_V04_ORDER)super.insertRepetition("ORDER", rep);
	}

	/**
	 * Removes a specific repetition of VXU_V04_ORDER
	 * (a Group object)
	 * @see AbstractGroup#insertremoveRepetition(String, int) 
	 */
	public VXU_V04_ORDER removeORDER(int rep) throws HL7Exception { 
	   return (VXU_V04_ORDER)super.removeRepetition("ORDER", rep);
	}

}
