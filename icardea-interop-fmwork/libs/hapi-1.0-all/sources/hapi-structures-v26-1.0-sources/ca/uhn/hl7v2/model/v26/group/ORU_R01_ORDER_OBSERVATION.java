package ca.uhn.hl7v2.model.v26.group;

import ca.uhn.hl7v2.parser.ModelClassFactory;
import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.log.HapiLogFactory;
import ca.uhn.hl7v2.model.v26.segment.*;

import ca.uhn.hl7v2.model.*;
/**
 * <p>Represents the ORU_R01_ORDER_OBSERVATION Group.  A Group is an ordered collection of message 
 * segments that can repeat together or be optionally in/excluded together.
 * This Group contains the following elements: </p>
 * 0: ORC (Common Order) <b>optional </b><br>
 * 1: OBR (Observation Request) <b></b><br>
 * 2: NTE (Notes and Comments) <b>optional repeating</b><br>
 * 3: ROL (Role) <b>optional repeating</b><br>
 * 4: ORU_R01_TIMING_QTY (a Group object) <b>optional repeating</b><br>
 * 5: CTD (Contact Data) <b>optional </b><br>
 * 6: ORU_R01_OBSERVATION (a Group object) <b>optional repeating</b><br>
 * 7: FT1 (Financial Transaction) <b>optional repeating</b><br>
 * 8: CTI (Clinical Trial Identification) <b>optional repeating</b><br>
 * 9: ORU_R01_SPECIMEN (a Group object) <b>optional repeating</b><br>
 */
public class ORU_R01_ORDER_OBSERVATION extends AbstractGroup {

	/** 
	 * Creates a new ORU_R01_ORDER_OBSERVATION Group.
	 */
	public ORU_R01_ORDER_OBSERVATION(Group parent, ModelClassFactory factory) {
	   super(parent, factory);
	   try {
	      this.add(ORC.class, false, false);
	      this.add(OBR.class, true, false);
	      this.add(NTE.class, false, true);
	      this.add(ROL.class, false, true);
	      this.add(ORU_R01_TIMING_QTY.class, false, true);
	      this.add(CTD.class, false, false);
	      this.add(ORU_R01_OBSERVATION.class, false, true);
	      this.add(FT1.class, false, true);
	      this.add(CTI.class, false, true);
	      this.add(ORU_R01_SPECIMEN.class, false, true);
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error creating ORU_R01_ORDER_OBSERVATION - this is probably a bug in the source code generator.", e);
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
	 * Returns OBR (Observation Request) - creates it if necessary
	 */
	public OBR getOBR() { 
	   OBR ret = null;
	   try {
	      ret = (OBR)this.get("OBR");
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
	 * Returns  first repetition of ROL (Role) - creates it if necessary
	 */
	public ROL getROL() { 
	   ROL ret = null;
	   try {
	      ret = (ROL)this.get("ROL");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns a specific repetition of ROL
	 * (Role) - creates it if necessary
	 * @throws HL7Exception if the repetition requested is more than one 
	 *     greater than the number of existing repetitions.
	 */
	public ROL getROL(int rep) throws HL7Exception { 
	   return (ROL)this.get("ROL", rep);
	}

	/** 
	 * Returns the number of existing repetitions of ROL 
	 */ 
	public int getROLReps() { 
	    int reps = -1; 
	    try { 
	        reps = this.getAll("ROL").length; 
	    } catch (HL7Exception e) { 
	        String message = "Unexpected error accessing data - this is probably a bug in the source code generator."; 
	        HapiLogFactory.getHapiLog(this.getClass()).error(message, e); 
	        throw new RuntimeException(message);
	    } 
	    return reps; 
	} 

	/**
	 * Inserts a specific repetition of ROL
	 * (Role)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public void  insertROL(ROL structure, int rep) throws HL7Exception { 
	   super.insertRepetition( structure, rep);
	}

	/**
	 * Inserts a specific repetition of ROL
	 * (Role)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public ROL insertROL(int rep) throws HL7Exception { 
	   return (ROL)super.insertRepetition("ROL", rep);
	}

	/**
	 * Removes a specific repetition of ROL
	 * (Role)
	 * @see AbstractGroup#insertremoveRepetition(String, int) 
	 */
	public ROL removeROL(int rep) throws HL7Exception { 
	   return (ROL)super.removeRepetition("ROL", rep);
	}

	/**
	 * Returns  first repetition of ORU_R01_TIMING_QTY (a Group object) - creates it if necessary
	 */
	public ORU_R01_TIMING_QTY getTIMING_QTY() { 
	   ORU_R01_TIMING_QTY ret = null;
	   try {
	      ret = (ORU_R01_TIMING_QTY)this.get("TIMING_QTY");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns a specific repetition of ORU_R01_TIMING_QTY
	 * (a Group object) - creates it if necessary
	 * @throws HL7Exception if the repetition requested is more than one 
	 *     greater than the number of existing repetitions.
	 */
	public ORU_R01_TIMING_QTY getTIMING_QTY(int rep) throws HL7Exception { 
	   return (ORU_R01_TIMING_QTY)this.get("TIMING_QTY", rep);
	}

	/** 
	 * Returns the number of existing repetitions of ORU_R01_TIMING_QTY 
	 */ 
	public int getTIMING_QTYReps() { 
	    int reps = -1; 
	    try { 
	        reps = this.getAll("TIMING_QTY").length; 
	    } catch (HL7Exception e) { 
	        String message = "Unexpected error accessing data - this is probably a bug in the source code generator."; 
	        HapiLogFactory.getHapiLog(this.getClass()).error(message, e); 
	        throw new RuntimeException(message);
	    } 
	    return reps; 
	} 

	/**
	 * Inserts a specific repetition of ORU_R01_TIMING_QTY
	 * (a Group object)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public void  insertTIMING_QTY(ORU_R01_TIMING_QTY structure, int rep) throws HL7Exception { 
	   super.insertRepetition( structure, rep);
	}

	/**
	 * Inserts a specific repetition of ORU_R01_TIMING_QTY
	 * (a Group object)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public ORU_R01_TIMING_QTY insertTIMING_QTY(int rep) throws HL7Exception { 
	   return (ORU_R01_TIMING_QTY)super.insertRepetition("TIMING_QTY", rep);
	}

	/**
	 * Removes a specific repetition of ORU_R01_TIMING_QTY
	 * (a Group object)
	 * @see AbstractGroup#insertremoveRepetition(String, int) 
	 */
	public ORU_R01_TIMING_QTY removeTIMING_QTY(int rep) throws HL7Exception { 
	   return (ORU_R01_TIMING_QTY)super.removeRepetition("TIMING_QTY", rep);
	}

	/**
	 * Returns CTD (Contact Data) - creates it if necessary
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
	 * Returns  first repetition of ORU_R01_OBSERVATION (a Group object) - creates it if necessary
	 */
	public ORU_R01_OBSERVATION getOBSERVATION() { 
	   ORU_R01_OBSERVATION ret = null;
	   try {
	      ret = (ORU_R01_OBSERVATION)this.get("OBSERVATION");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns a specific repetition of ORU_R01_OBSERVATION
	 * (a Group object) - creates it if necessary
	 * @throws HL7Exception if the repetition requested is more than one 
	 *     greater than the number of existing repetitions.
	 */
	public ORU_R01_OBSERVATION getOBSERVATION(int rep) throws HL7Exception { 
	   return (ORU_R01_OBSERVATION)this.get("OBSERVATION", rep);
	}

	/** 
	 * Returns the number of existing repetitions of ORU_R01_OBSERVATION 
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
	 * Inserts a specific repetition of ORU_R01_OBSERVATION
	 * (a Group object)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public void  insertOBSERVATION(ORU_R01_OBSERVATION structure, int rep) throws HL7Exception { 
	   super.insertRepetition( structure, rep);
	}

	/**
	 * Inserts a specific repetition of ORU_R01_OBSERVATION
	 * (a Group object)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public ORU_R01_OBSERVATION insertOBSERVATION(int rep) throws HL7Exception { 
	   return (ORU_R01_OBSERVATION)super.insertRepetition("OBSERVATION", rep);
	}

	/**
	 * Removes a specific repetition of ORU_R01_OBSERVATION
	 * (a Group object)
	 * @see AbstractGroup#insertremoveRepetition(String, int) 
	 */
	public ORU_R01_OBSERVATION removeOBSERVATION(int rep) throws HL7Exception { 
	   return (ORU_R01_OBSERVATION)super.removeRepetition("OBSERVATION", rep);
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
	 * Returns  first repetition of CTI (Clinical Trial Identification) - creates it if necessary
	 */
	public CTI getCTI() { 
	   CTI ret = null;
	   try {
	      ret = (CTI)this.get("CTI");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns a specific repetition of CTI
	 * (Clinical Trial Identification) - creates it if necessary
	 * @throws HL7Exception if the repetition requested is more than one 
	 *     greater than the number of existing repetitions.
	 */
	public CTI getCTI(int rep) throws HL7Exception { 
	   return (CTI)this.get("CTI", rep);
	}

	/** 
	 * Returns the number of existing repetitions of CTI 
	 */ 
	public int getCTIReps() { 
	    int reps = -1; 
	    try { 
	        reps = this.getAll("CTI").length; 
	    } catch (HL7Exception e) { 
	        String message = "Unexpected error accessing data - this is probably a bug in the source code generator."; 
	        HapiLogFactory.getHapiLog(this.getClass()).error(message, e); 
	        throw new RuntimeException(message);
	    } 
	    return reps; 
	} 

	/**
	 * Inserts a specific repetition of CTI
	 * (Clinical Trial Identification)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public void  insertCTI(CTI structure, int rep) throws HL7Exception { 
	   super.insertRepetition( structure, rep);
	}

	/**
	 * Inserts a specific repetition of CTI
	 * (Clinical Trial Identification)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public CTI insertCTI(int rep) throws HL7Exception { 
	   return (CTI)super.insertRepetition("CTI", rep);
	}

	/**
	 * Removes a specific repetition of CTI
	 * (Clinical Trial Identification)
	 * @see AbstractGroup#insertremoveRepetition(String, int) 
	 */
	public CTI removeCTI(int rep) throws HL7Exception { 
	   return (CTI)super.removeRepetition("CTI", rep);
	}

	/**
	 * Returns  first repetition of ORU_R01_SPECIMEN (a Group object) - creates it if necessary
	 */
	public ORU_R01_SPECIMEN getSPECIMEN() { 
	   ORU_R01_SPECIMEN ret = null;
	   try {
	      ret = (ORU_R01_SPECIMEN)this.get("SPECIMEN");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns a specific repetition of ORU_R01_SPECIMEN
	 * (a Group object) - creates it if necessary
	 * @throws HL7Exception if the repetition requested is more than one 
	 *     greater than the number of existing repetitions.
	 */
	public ORU_R01_SPECIMEN getSPECIMEN(int rep) throws HL7Exception { 
	   return (ORU_R01_SPECIMEN)this.get("SPECIMEN", rep);
	}

	/** 
	 * Returns the number of existing repetitions of ORU_R01_SPECIMEN 
	 */ 
	public int getSPECIMENReps() { 
	    int reps = -1; 
	    try { 
	        reps = this.getAll("SPECIMEN").length; 
	    } catch (HL7Exception e) { 
	        String message = "Unexpected error accessing data - this is probably a bug in the source code generator."; 
	        HapiLogFactory.getHapiLog(this.getClass()).error(message, e); 
	        throw new RuntimeException(message);
	    } 
	    return reps; 
	} 

	/**
	 * Inserts a specific repetition of ORU_R01_SPECIMEN
	 * (a Group object)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public void  insertSPECIMEN(ORU_R01_SPECIMEN structure, int rep) throws HL7Exception { 
	   super.insertRepetition( structure, rep);
	}

	/**
	 * Inserts a specific repetition of ORU_R01_SPECIMEN
	 * (a Group object)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public ORU_R01_SPECIMEN insertSPECIMEN(int rep) throws HL7Exception { 
	   return (ORU_R01_SPECIMEN)super.insertRepetition("SPECIMEN", rep);
	}

	/**
	 * Removes a specific repetition of ORU_R01_SPECIMEN
	 * (a Group object)
	 * @see AbstractGroup#insertremoveRepetition(String, int) 
	 */
	public ORU_R01_SPECIMEN removeSPECIMEN(int rep) throws HL7Exception { 
	   return (ORU_R01_SPECIMEN)super.removeRepetition("SPECIMEN", rep);
	}

}
