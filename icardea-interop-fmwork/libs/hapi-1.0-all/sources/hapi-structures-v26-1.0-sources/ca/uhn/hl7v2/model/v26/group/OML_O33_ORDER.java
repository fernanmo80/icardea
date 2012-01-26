package ca.uhn.hl7v2.model.v26.group;

import ca.uhn.hl7v2.parser.ModelClassFactory;
import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.log.HapiLogFactory;
import ca.uhn.hl7v2.model.v26.segment.*;

import ca.uhn.hl7v2.model.*;
/**
 * <p>Represents the OML_O33_ORDER Group.  A Group is an ordered collection of message 
 * segments that can repeat together or be optionally in/excluded together.
 * This Group contains the following elements: </p>
 * 0: ORC (Common Order) <b></b><br>
 * 1: OML_O33_TIMING (a Group object) <b>optional repeating</b><br>
 * 2: OML_O33_OBSERVATION_REQUEST (a Group object) <b>optional </b><br>
 * 3: FT1 (Financial Transaction) <b>optional repeating</b><br>
 * 4: CTI (Clinical Trial Identification) <b>optional repeating</b><br>
 * 5: BLG (Billing) <b>optional </b><br>
 */
public class OML_O33_ORDER extends AbstractGroup {

	/** 
	 * Creates a new OML_O33_ORDER Group.
	 */
	public OML_O33_ORDER(Group parent, ModelClassFactory factory) {
	   super(parent, factory);
	   try {
	      this.add(ORC.class, true, false);
	      this.add(OML_O33_TIMING.class, false, true);
	      this.add(OML_O33_OBSERVATION_REQUEST.class, false, false);
	      this.add(FT1.class, false, true);
	      this.add(CTI.class, false, true);
	      this.add(BLG.class, false, false);
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error creating OML_O33_ORDER - this is probably a bug in the source code generator.", e);
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
	 * Returns  first repetition of OML_O33_TIMING (a Group object) - creates it if necessary
	 */
	public OML_O33_TIMING getTIMING() { 
	   OML_O33_TIMING ret = null;
	   try {
	      ret = (OML_O33_TIMING)this.get("TIMING");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns a specific repetition of OML_O33_TIMING
	 * (a Group object) - creates it if necessary
	 * @throws HL7Exception if the repetition requested is more than one 
	 *     greater than the number of existing repetitions.
	 */
	public OML_O33_TIMING getTIMING(int rep) throws HL7Exception { 
	   return (OML_O33_TIMING)this.get("TIMING", rep);
	}

	/** 
	 * Returns the number of existing repetitions of OML_O33_TIMING 
	 */ 
	public int getTIMINGReps() { 
	    int reps = -1; 
	    try { 
	        reps = this.getAll("TIMING").length; 
	    } catch (HL7Exception e) { 
	        String message = "Unexpected error accessing data - this is probably a bug in the source code generator."; 
	        HapiLogFactory.getHapiLog(this.getClass()).error(message, e); 
	        throw new RuntimeException(message);
	    } 
	    return reps; 
	} 

	/**
	 * Inserts a specific repetition of OML_O33_TIMING
	 * (a Group object)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public void  insertTIMING(OML_O33_TIMING structure, int rep) throws HL7Exception { 
	   super.insertRepetition( structure, rep);
	}

	/**
	 * Inserts a specific repetition of OML_O33_TIMING
	 * (a Group object)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public OML_O33_TIMING insertTIMING(int rep) throws HL7Exception { 
	   return (OML_O33_TIMING)super.insertRepetition("TIMING", rep);
	}

	/**
	 * Removes a specific repetition of OML_O33_TIMING
	 * (a Group object)
	 * @see AbstractGroup#insertremoveRepetition(String, int) 
	 */
	public OML_O33_TIMING removeTIMING(int rep) throws HL7Exception { 
	   return (OML_O33_TIMING)super.removeRepetition("TIMING", rep);
	}

	/**
	 * Returns OML_O33_OBSERVATION_REQUEST (a Group object) - creates it if necessary
	 */
	public OML_O33_OBSERVATION_REQUEST getOBSERVATION_REQUEST() { 
	   OML_O33_OBSERVATION_REQUEST ret = null;
	   try {
	      ret = (OML_O33_OBSERVATION_REQUEST)this.get("OBSERVATION_REQUEST");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
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
	 * Returns BLG (Billing) - creates it if necessary
	 */
	public BLG getBLG() { 
	   BLG ret = null;
	   try {
	      ret = (BLG)this.get("BLG");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

}
