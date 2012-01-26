package ca.uhn.hl7v2.model.v26.group;

import ca.uhn.hl7v2.parser.ModelClassFactory;
import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.log.HapiLogFactory;
import ca.uhn.hl7v2.model.v26.segment.*;

import ca.uhn.hl7v2.model.*;
/**
 * <p>Represents the RSP_K25_STAFF Group.  A Group is an ordered collection of message 
 * segments that can repeat together or be optionally in/excluded together.
 * This Group contains the following elements: </p>
 * 0: STF (Staff Identification) <b></b><br>
 * 1: PRA (Practitioner Detail) <b>optional repeating</b><br>
 * 2: ORG (Practitioner Organization Unit) <b>optional repeating</b><br>
 * 3: AFF (Professional Affiliation) <b>optional repeating</b><br>
 * 4: LAN (Language Detail) <b>optional repeating</b><br>
 * 5: EDU (Educational Detail) <b>optional repeating</b><br>
 * 6: CER (Certificate Detail) <b>optional repeating</b><br>
 */
public class RSP_K25_STAFF extends AbstractGroup {

	/** 
	 * Creates a new RSP_K25_STAFF Group.
	 */
	public RSP_K25_STAFF(Group parent, ModelClassFactory factory) {
	   super(parent, factory);
	   try {
	      this.add(STF.class, true, false);
	      this.add(PRA.class, false, true);
	      this.add(ORG.class, false, true);
	      this.add(AFF.class, false, true);
	      this.add(LAN.class, false, true);
	      this.add(EDU.class, false, true);
	      this.add(CER.class, false, true);
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error creating RSP_K25_STAFF - this is probably a bug in the source code generator.", e);
	   }
	}

	/**
	 * Returns STF (Staff Identification) - creates it if necessary
	 */
	public STF getSTF() { 
	   STF ret = null;
	   try {
	      ret = (STF)this.get("STF");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns  first repetition of PRA (Practitioner Detail) - creates it if necessary
	 */
	public PRA getPRA() { 
	   PRA ret = null;
	   try {
	      ret = (PRA)this.get("PRA");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns a specific repetition of PRA
	 * (Practitioner Detail) - creates it if necessary
	 * @throws HL7Exception if the repetition requested is more than one 
	 *     greater than the number of existing repetitions.
	 */
	public PRA getPRA(int rep) throws HL7Exception { 
	   return (PRA)this.get("PRA", rep);
	}

	/** 
	 * Returns the number of existing repetitions of PRA 
	 */ 
	public int getPRAReps() { 
	    int reps = -1; 
	    try { 
	        reps = this.getAll("PRA").length; 
	    } catch (HL7Exception e) { 
	        String message = "Unexpected error accessing data - this is probably a bug in the source code generator."; 
	        HapiLogFactory.getHapiLog(this.getClass()).error(message, e); 
	        throw new RuntimeException(message);
	    } 
	    return reps; 
	} 

	/**
	 * Inserts a specific repetition of PRA
	 * (Practitioner Detail)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public void  insertPRA(PRA structure, int rep) throws HL7Exception { 
	   super.insertRepetition( structure, rep);
	}

	/**
	 * Inserts a specific repetition of PRA
	 * (Practitioner Detail)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public PRA insertPRA(int rep) throws HL7Exception { 
	   return (PRA)super.insertRepetition("PRA", rep);
	}

	/**
	 * Removes a specific repetition of PRA
	 * (Practitioner Detail)
	 * @see AbstractGroup#insertremoveRepetition(String, int) 
	 */
	public PRA removePRA(int rep) throws HL7Exception { 
	   return (PRA)super.removeRepetition("PRA", rep);
	}

	/**
	 * Returns  first repetition of ORG (Practitioner Organization Unit) - creates it if necessary
	 */
	public ORG getORG() { 
	   ORG ret = null;
	   try {
	      ret = (ORG)this.get("ORG");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns a specific repetition of ORG
	 * (Practitioner Organization Unit) - creates it if necessary
	 * @throws HL7Exception if the repetition requested is more than one 
	 *     greater than the number of existing repetitions.
	 */
	public ORG getORG(int rep) throws HL7Exception { 
	   return (ORG)this.get("ORG", rep);
	}

	/** 
	 * Returns the number of existing repetitions of ORG 
	 */ 
	public int getORGReps() { 
	    int reps = -1; 
	    try { 
	        reps = this.getAll("ORG").length; 
	    } catch (HL7Exception e) { 
	        String message = "Unexpected error accessing data - this is probably a bug in the source code generator."; 
	        HapiLogFactory.getHapiLog(this.getClass()).error(message, e); 
	        throw new RuntimeException(message);
	    } 
	    return reps; 
	} 

	/**
	 * Inserts a specific repetition of ORG
	 * (Practitioner Organization Unit)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public void  insertORG(ORG structure, int rep) throws HL7Exception { 
	   super.insertRepetition( structure, rep);
	}

	/**
	 * Inserts a specific repetition of ORG
	 * (Practitioner Organization Unit)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public ORG insertORG(int rep) throws HL7Exception { 
	   return (ORG)super.insertRepetition("ORG", rep);
	}

	/**
	 * Removes a specific repetition of ORG
	 * (Practitioner Organization Unit)
	 * @see AbstractGroup#insertremoveRepetition(String, int) 
	 */
	public ORG removeORG(int rep) throws HL7Exception { 
	   return (ORG)super.removeRepetition("ORG", rep);
	}

	/**
	 * Returns  first repetition of AFF (Professional Affiliation) - creates it if necessary
	 */
	public AFF getAFF() { 
	   AFF ret = null;
	   try {
	      ret = (AFF)this.get("AFF");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns a specific repetition of AFF
	 * (Professional Affiliation) - creates it if necessary
	 * @throws HL7Exception if the repetition requested is more than one 
	 *     greater than the number of existing repetitions.
	 */
	public AFF getAFF(int rep) throws HL7Exception { 
	   return (AFF)this.get("AFF", rep);
	}

	/** 
	 * Returns the number of existing repetitions of AFF 
	 */ 
	public int getAFFReps() { 
	    int reps = -1; 
	    try { 
	        reps = this.getAll("AFF").length; 
	    } catch (HL7Exception e) { 
	        String message = "Unexpected error accessing data - this is probably a bug in the source code generator."; 
	        HapiLogFactory.getHapiLog(this.getClass()).error(message, e); 
	        throw new RuntimeException(message);
	    } 
	    return reps; 
	} 

	/**
	 * Inserts a specific repetition of AFF
	 * (Professional Affiliation)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public void  insertAFF(AFF structure, int rep) throws HL7Exception { 
	   super.insertRepetition( structure, rep);
	}

	/**
	 * Inserts a specific repetition of AFF
	 * (Professional Affiliation)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public AFF insertAFF(int rep) throws HL7Exception { 
	   return (AFF)super.insertRepetition("AFF", rep);
	}

	/**
	 * Removes a specific repetition of AFF
	 * (Professional Affiliation)
	 * @see AbstractGroup#insertremoveRepetition(String, int) 
	 */
	public AFF removeAFF(int rep) throws HL7Exception { 
	   return (AFF)super.removeRepetition("AFF", rep);
	}

	/**
	 * Returns  first repetition of LAN (Language Detail) - creates it if necessary
	 */
	public LAN getLAN() { 
	   LAN ret = null;
	   try {
	      ret = (LAN)this.get("LAN");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns a specific repetition of LAN
	 * (Language Detail) - creates it if necessary
	 * @throws HL7Exception if the repetition requested is more than one 
	 *     greater than the number of existing repetitions.
	 */
	public LAN getLAN(int rep) throws HL7Exception { 
	   return (LAN)this.get("LAN", rep);
	}

	/** 
	 * Returns the number of existing repetitions of LAN 
	 */ 
	public int getLANReps() { 
	    int reps = -1; 
	    try { 
	        reps = this.getAll("LAN").length; 
	    } catch (HL7Exception e) { 
	        String message = "Unexpected error accessing data - this is probably a bug in the source code generator."; 
	        HapiLogFactory.getHapiLog(this.getClass()).error(message, e); 
	        throw new RuntimeException(message);
	    } 
	    return reps; 
	} 

	/**
	 * Inserts a specific repetition of LAN
	 * (Language Detail)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public void  insertLAN(LAN structure, int rep) throws HL7Exception { 
	   super.insertRepetition( structure, rep);
	}

	/**
	 * Inserts a specific repetition of LAN
	 * (Language Detail)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public LAN insertLAN(int rep) throws HL7Exception { 
	   return (LAN)super.insertRepetition("LAN", rep);
	}

	/**
	 * Removes a specific repetition of LAN
	 * (Language Detail)
	 * @see AbstractGroup#insertremoveRepetition(String, int) 
	 */
	public LAN removeLAN(int rep) throws HL7Exception { 
	   return (LAN)super.removeRepetition("LAN", rep);
	}

	/**
	 * Returns  first repetition of EDU (Educational Detail) - creates it if necessary
	 */
	public EDU getEDU() { 
	   EDU ret = null;
	   try {
	      ret = (EDU)this.get("EDU");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns a specific repetition of EDU
	 * (Educational Detail) - creates it if necessary
	 * @throws HL7Exception if the repetition requested is more than one 
	 *     greater than the number of existing repetitions.
	 */
	public EDU getEDU(int rep) throws HL7Exception { 
	   return (EDU)this.get("EDU", rep);
	}

	/** 
	 * Returns the number of existing repetitions of EDU 
	 */ 
	public int getEDUReps() { 
	    int reps = -1; 
	    try { 
	        reps = this.getAll("EDU").length; 
	    } catch (HL7Exception e) { 
	        String message = "Unexpected error accessing data - this is probably a bug in the source code generator."; 
	        HapiLogFactory.getHapiLog(this.getClass()).error(message, e); 
	        throw new RuntimeException(message);
	    } 
	    return reps; 
	} 

	/**
	 * Inserts a specific repetition of EDU
	 * (Educational Detail)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public void  insertEDU(EDU structure, int rep) throws HL7Exception { 
	   super.insertRepetition( structure, rep);
	}

	/**
	 * Inserts a specific repetition of EDU
	 * (Educational Detail)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public EDU insertEDU(int rep) throws HL7Exception { 
	   return (EDU)super.insertRepetition("EDU", rep);
	}

	/**
	 * Removes a specific repetition of EDU
	 * (Educational Detail)
	 * @see AbstractGroup#insertremoveRepetition(String, int) 
	 */
	public EDU removeEDU(int rep) throws HL7Exception { 
	   return (EDU)super.removeRepetition("EDU", rep);
	}

	/**
	 * Returns  first repetition of CER (Certificate Detail) - creates it if necessary
	 */
	public CER getCER() { 
	   CER ret = null;
	   try {
	      ret = (CER)this.get("CER");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns a specific repetition of CER
	 * (Certificate Detail) - creates it if necessary
	 * @throws HL7Exception if the repetition requested is more than one 
	 *     greater than the number of existing repetitions.
	 */
	public CER getCER(int rep) throws HL7Exception { 
	   return (CER)this.get("CER", rep);
	}

	/** 
	 * Returns the number of existing repetitions of CER 
	 */ 
	public int getCERReps() { 
	    int reps = -1; 
	    try { 
	        reps = this.getAll("CER").length; 
	    } catch (HL7Exception e) { 
	        String message = "Unexpected error accessing data - this is probably a bug in the source code generator."; 
	        HapiLogFactory.getHapiLog(this.getClass()).error(message, e); 
	        throw new RuntimeException(message);
	    } 
	    return reps; 
	} 

	/**
	 * Inserts a specific repetition of CER
	 * (Certificate Detail)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public void  insertCER(CER structure, int rep) throws HL7Exception { 
	   super.insertRepetition( structure, rep);
	}

	/**
	 * Inserts a specific repetition of CER
	 * (Certificate Detail)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public CER insertCER(int rep) throws HL7Exception { 
	   return (CER)super.insertRepetition("CER", rep);
	}

	/**
	 * Removes a specific repetition of CER
	 * (Certificate Detail)
	 * @see AbstractGroup#insertremoveRepetition(String, int) 
	 */
	public CER removeCER(int rep) throws HL7Exception { 
	   return (CER)super.removeRepetition("CER", rep);
	}

}
