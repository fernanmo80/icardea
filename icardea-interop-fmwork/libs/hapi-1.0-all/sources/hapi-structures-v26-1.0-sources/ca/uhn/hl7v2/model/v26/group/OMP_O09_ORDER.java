package ca.uhn.hl7v2.model.v26.group;

import ca.uhn.hl7v2.parser.ModelClassFactory;
import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.log.HapiLogFactory;
import ca.uhn.hl7v2.model.v26.segment.*;

import ca.uhn.hl7v2.model.*;
/**
 * <p>Represents the OMP_O09_ORDER Group.  A Group is an ordered collection of message 
 * segments that can repeat together or be optionally in/excluded together.
 * This Group contains the following elements: </p>
 * 0: ORC (Common Order) <b></b><br>
 * 1: OMP_O09_TIMING (a Group object) <b>optional repeating</b><br>
 * 2: RXO (Pharmacy/Treatment Order) <b></b><br>
 * 3: NTE (Notes and Comments) <b>optional repeating</b><br>
 * 4: RXR (Pharmacy/Treatment Route) <b>repeating</b><br>
 * 5: OMP_O09_COMPONENT (a Group object) <b>optional repeating</b><br>
 * 6: OMP_O09_OBSERVATION (a Group object) <b>optional repeating</b><br>
 * 7: FT1 (Financial Transaction) <b>optional repeating</b><br>
 * 8: BLG (Billing) <b>optional </b><br>
 */
public class OMP_O09_ORDER extends AbstractGroup {

	/** 
	 * Creates a new OMP_O09_ORDER Group.
	 */
	public OMP_O09_ORDER(Group parent, ModelClassFactory factory) {
	   super(parent, factory);
	   try {
	      this.add(ORC.class, true, false);
	      this.add(OMP_O09_TIMING.class, false, true);
	      this.add(RXO.class, true, false);
	      this.add(NTE.class, false, true);
	      this.add(RXR.class, true, true);
	      this.add(OMP_O09_COMPONENT.class, false, true);
	      this.add(OMP_O09_OBSERVATION.class, false, true);
	      this.add(FT1.class, false, true);
	      this.add(BLG.class, false, false);
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error creating OMP_O09_ORDER - this is probably a bug in the source code generator.", e);
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
	 * Returns  first repetition of OMP_O09_TIMING (a Group object) - creates it if necessary
	 */
	public OMP_O09_TIMING getTIMING() { 
	   OMP_O09_TIMING ret = null;
	   try {
	      ret = (OMP_O09_TIMING)this.get("TIMING");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns a specific repetition of OMP_O09_TIMING
	 * (a Group object) - creates it if necessary
	 * @throws HL7Exception if the repetition requested is more than one 
	 *     greater than the number of existing repetitions.
	 */
	public OMP_O09_TIMING getTIMING(int rep) throws HL7Exception { 
	   return (OMP_O09_TIMING)this.get("TIMING", rep);
	}

	/** 
	 * Returns the number of existing repetitions of OMP_O09_TIMING 
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
	 * Inserts a specific repetition of OMP_O09_TIMING
	 * (a Group object)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public void  insertTIMING(OMP_O09_TIMING structure, int rep) throws HL7Exception { 
	   super.insertRepetition( structure, rep);
	}

	/**
	 * Inserts a specific repetition of OMP_O09_TIMING
	 * (a Group object)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public OMP_O09_TIMING insertTIMING(int rep) throws HL7Exception { 
	   return (OMP_O09_TIMING)super.insertRepetition("TIMING", rep);
	}

	/**
	 * Removes a specific repetition of OMP_O09_TIMING
	 * (a Group object)
	 * @see AbstractGroup#insertremoveRepetition(String, int) 
	 */
	public OMP_O09_TIMING removeTIMING(int rep) throws HL7Exception { 
	   return (OMP_O09_TIMING)super.removeRepetition("TIMING", rep);
	}

	/**
	 * Returns RXO (Pharmacy/Treatment Order) - creates it if necessary
	 */
	public RXO getRXO() { 
	   RXO ret = null;
	   try {
	      ret = (RXO)this.get("RXO");
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
	 * Returns  first repetition of RXR (Pharmacy/Treatment Route) - creates it if necessary
	 */
	public RXR getRXR() { 
	   RXR ret = null;
	   try {
	      ret = (RXR)this.get("RXR");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns a specific repetition of RXR
	 * (Pharmacy/Treatment Route) - creates it if necessary
	 * @throws HL7Exception if the repetition requested is more than one 
	 *     greater than the number of existing repetitions.
	 */
	public RXR getRXR(int rep) throws HL7Exception { 
	   return (RXR)this.get("RXR", rep);
	}

	/** 
	 * Returns the number of existing repetitions of RXR 
	 */ 
	public int getRXRReps() { 
	    int reps = -1; 
	    try { 
	        reps = this.getAll("RXR").length; 
	    } catch (HL7Exception e) { 
	        String message = "Unexpected error accessing data - this is probably a bug in the source code generator."; 
	        HapiLogFactory.getHapiLog(this.getClass()).error(message, e); 
	        throw new RuntimeException(message);
	    } 
	    return reps; 
	} 

	/**
	 * Inserts a specific repetition of RXR
	 * (Pharmacy/Treatment Route)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public void  insertRXR(RXR structure, int rep) throws HL7Exception { 
	   super.insertRepetition( structure, rep);
	}

	/**
	 * Inserts a specific repetition of RXR
	 * (Pharmacy/Treatment Route)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public RXR insertRXR(int rep) throws HL7Exception { 
	   return (RXR)super.insertRepetition("RXR", rep);
	}

	/**
	 * Removes a specific repetition of RXR
	 * (Pharmacy/Treatment Route)
	 * @see AbstractGroup#insertremoveRepetition(String, int) 
	 */
	public RXR removeRXR(int rep) throws HL7Exception { 
	   return (RXR)super.removeRepetition("RXR", rep);
	}

	/**
	 * Returns  first repetition of OMP_O09_COMPONENT (a Group object) - creates it if necessary
	 */
	public OMP_O09_COMPONENT getCOMPONENT() { 
	   OMP_O09_COMPONENT ret = null;
	   try {
	      ret = (OMP_O09_COMPONENT)this.get("COMPONENT");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns a specific repetition of OMP_O09_COMPONENT
	 * (a Group object) - creates it if necessary
	 * @throws HL7Exception if the repetition requested is more than one 
	 *     greater than the number of existing repetitions.
	 */
	public OMP_O09_COMPONENT getCOMPONENT(int rep) throws HL7Exception { 
	   return (OMP_O09_COMPONENT)this.get("COMPONENT", rep);
	}

	/** 
	 * Returns the number of existing repetitions of OMP_O09_COMPONENT 
	 */ 
	public int getCOMPONENTReps() { 
	    int reps = -1; 
	    try { 
	        reps = this.getAll("COMPONENT").length; 
	    } catch (HL7Exception e) { 
	        String message = "Unexpected error accessing data - this is probably a bug in the source code generator."; 
	        HapiLogFactory.getHapiLog(this.getClass()).error(message, e); 
	        throw new RuntimeException(message);
	    } 
	    return reps; 
	} 

	/**
	 * Inserts a specific repetition of OMP_O09_COMPONENT
	 * (a Group object)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public void  insertCOMPONENT(OMP_O09_COMPONENT structure, int rep) throws HL7Exception { 
	   super.insertRepetition( structure, rep);
	}

	/**
	 * Inserts a specific repetition of OMP_O09_COMPONENT
	 * (a Group object)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public OMP_O09_COMPONENT insertCOMPONENT(int rep) throws HL7Exception { 
	   return (OMP_O09_COMPONENT)super.insertRepetition("COMPONENT", rep);
	}

	/**
	 * Removes a specific repetition of OMP_O09_COMPONENT
	 * (a Group object)
	 * @see AbstractGroup#insertremoveRepetition(String, int) 
	 */
	public OMP_O09_COMPONENT removeCOMPONENT(int rep) throws HL7Exception { 
	   return (OMP_O09_COMPONENT)super.removeRepetition("COMPONENT", rep);
	}

	/**
	 * Returns  first repetition of OMP_O09_OBSERVATION (a Group object) - creates it if necessary
	 */
	public OMP_O09_OBSERVATION getOBSERVATION() { 
	   OMP_O09_OBSERVATION ret = null;
	   try {
	      ret = (OMP_O09_OBSERVATION)this.get("OBSERVATION");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns a specific repetition of OMP_O09_OBSERVATION
	 * (a Group object) - creates it if necessary
	 * @throws HL7Exception if the repetition requested is more than one 
	 *     greater than the number of existing repetitions.
	 */
	public OMP_O09_OBSERVATION getOBSERVATION(int rep) throws HL7Exception { 
	   return (OMP_O09_OBSERVATION)this.get("OBSERVATION", rep);
	}

	/** 
	 * Returns the number of existing repetitions of OMP_O09_OBSERVATION 
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
	 * Inserts a specific repetition of OMP_O09_OBSERVATION
	 * (a Group object)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public void  insertOBSERVATION(OMP_O09_OBSERVATION structure, int rep) throws HL7Exception { 
	   super.insertRepetition( structure, rep);
	}

	/**
	 * Inserts a specific repetition of OMP_O09_OBSERVATION
	 * (a Group object)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public OMP_O09_OBSERVATION insertOBSERVATION(int rep) throws HL7Exception { 
	   return (OMP_O09_OBSERVATION)super.insertRepetition("OBSERVATION", rep);
	}

	/**
	 * Removes a specific repetition of OMP_O09_OBSERVATION
	 * (a Group object)
	 * @see AbstractGroup#insertremoveRepetition(String, int) 
	 */
	public OMP_O09_OBSERVATION removeOBSERVATION(int rep) throws HL7Exception { 
	   return (OMP_O09_OBSERVATION)super.removeRepetition("OBSERVATION", rep);
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
