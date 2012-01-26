package ca.uhn.hl7v2.model.v26.group;

import ca.uhn.hl7v2.parser.ModelClassFactory;
import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.log.HapiLogFactory;
import ca.uhn.hl7v2.model.v26.segment.*;

import ca.uhn.hl7v2.model.*;
/**
 * <p>Represents the OMD_O03_ORDER_TRAY Group.  A Group is an ordered collection of message 
 * segments that can repeat together or be optionally in/excluded together.
 * This Group contains the following elements: </p>
 * 0: ORC (Common Order) <b></b><br>
 * 1: OMD_O03_TIMING_TRAY (a Group object) <b>optional repeating</b><br>
 * 2: ODT (Diet Tray Instructions) <b>repeating</b><br>
 * 3: NTE (Notes and Comments) <b>optional repeating</b><br>
 */
public class OMD_O03_ORDER_TRAY extends AbstractGroup {

	/** 
	 * Creates a new OMD_O03_ORDER_TRAY Group.
	 */
	public OMD_O03_ORDER_TRAY(Group parent, ModelClassFactory factory) {
	   super(parent, factory);
	   try {
	      this.add(ORC.class, true, false);
	      this.add(OMD_O03_TIMING_TRAY.class, false, true);
	      this.add(ODT.class, true, true);
	      this.add(NTE.class, false, true);
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error creating OMD_O03_ORDER_TRAY - this is probably a bug in the source code generator.", e);
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
	 * Returns  first repetition of OMD_O03_TIMING_TRAY (a Group object) - creates it if necessary
	 */
	public OMD_O03_TIMING_TRAY getTIMING_TRAY() { 
	   OMD_O03_TIMING_TRAY ret = null;
	   try {
	      ret = (OMD_O03_TIMING_TRAY)this.get("TIMING_TRAY");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns a specific repetition of OMD_O03_TIMING_TRAY
	 * (a Group object) - creates it if necessary
	 * @throws HL7Exception if the repetition requested is more than one 
	 *     greater than the number of existing repetitions.
	 */
	public OMD_O03_TIMING_TRAY getTIMING_TRAY(int rep) throws HL7Exception { 
	   return (OMD_O03_TIMING_TRAY)this.get("TIMING_TRAY", rep);
	}

	/** 
	 * Returns the number of existing repetitions of OMD_O03_TIMING_TRAY 
	 */ 
	public int getTIMING_TRAYReps() { 
	    int reps = -1; 
	    try { 
	        reps = this.getAll("TIMING_TRAY").length; 
	    } catch (HL7Exception e) { 
	        String message = "Unexpected error accessing data - this is probably a bug in the source code generator."; 
	        HapiLogFactory.getHapiLog(this.getClass()).error(message, e); 
	        throw new RuntimeException(message);
	    } 
	    return reps; 
	} 

	/**
	 * Inserts a specific repetition of OMD_O03_TIMING_TRAY
	 * (a Group object)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public void  insertTIMING_TRAY(OMD_O03_TIMING_TRAY structure, int rep) throws HL7Exception { 
	   super.insertRepetition( structure, rep);
	}

	/**
	 * Inserts a specific repetition of OMD_O03_TIMING_TRAY
	 * (a Group object)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public OMD_O03_TIMING_TRAY insertTIMING_TRAY(int rep) throws HL7Exception { 
	   return (OMD_O03_TIMING_TRAY)super.insertRepetition("TIMING_TRAY", rep);
	}

	/**
	 * Removes a specific repetition of OMD_O03_TIMING_TRAY
	 * (a Group object)
	 * @see AbstractGroup#insertremoveRepetition(String, int) 
	 */
	public OMD_O03_TIMING_TRAY removeTIMING_TRAY(int rep) throws HL7Exception { 
	   return (OMD_O03_TIMING_TRAY)super.removeRepetition("TIMING_TRAY", rep);
	}

	/**
	 * Returns  first repetition of ODT (Diet Tray Instructions) - creates it if necessary
	 */
	public ODT getODT() { 
	   ODT ret = null;
	   try {
	      ret = (ODT)this.get("ODT");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns a specific repetition of ODT
	 * (Diet Tray Instructions) - creates it if necessary
	 * @throws HL7Exception if the repetition requested is more than one 
	 *     greater than the number of existing repetitions.
	 */
	public ODT getODT(int rep) throws HL7Exception { 
	   return (ODT)this.get("ODT", rep);
	}

	/** 
	 * Returns the number of existing repetitions of ODT 
	 */ 
	public int getODTReps() { 
	    int reps = -1; 
	    try { 
	        reps = this.getAll("ODT").length; 
	    } catch (HL7Exception e) { 
	        String message = "Unexpected error accessing data - this is probably a bug in the source code generator."; 
	        HapiLogFactory.getHapiLog(this.getClass()).error(message, e); 
	        throw new RuntimeException(message);
	    } 
	    return reps; 
	} 

	/**
	 * Inserts a specific repetition of ODT
	 * (Diet Tray Instructions)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public void  insertODT(ODT structure, int rep) throws HL7Exception { 
	   super.insertRepetition( structure, rep);
	}

	/**
	 * Inserts a specific repetition of ODT
	 * (Diet Tray Instructions)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public ODT insertODT(int rep) throws HL7Exception { 
	   return (ODT)super.insertRepetition("ODT", rep);
	}

	/**
	 * Removes a specific repetition of ODT
	 * (Diet Tray Instructions)
	 * @see AbstractGroup#insertremoveRepetition(String, int) 
	 */
	public ODT removeODT(int rep) throws HL7Exception { 
	   return (ODT)super.removeRepetition("ODT", rep);
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