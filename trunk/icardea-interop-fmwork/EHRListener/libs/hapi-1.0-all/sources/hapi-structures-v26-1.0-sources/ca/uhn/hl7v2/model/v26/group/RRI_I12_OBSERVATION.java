package ca.uhn.hl7v2.model.v26.group;

import ca.uhn.hl7v2.parser.ModelClassFactory;
import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.log.HapiLogFactory;
import ca.uhn.hl7v2.model.v26.segment.*;

import ca.uhn.hl7v2.model.*;
/**
 * <p>Represents the RRI_I12_OBSERVATION Group.  A Group is an ordered collection of message 
 * segments that can repeat together or be optionally in/excluded together.
 * This Group contains the following elements: </p>
 * 0: OBR (Observation Request) <b></b><br>
 * 1: NTE (Notes and Comments) <b>optional repeating</b><br>
 * 2: RRI_I12_RESULTS_NOTES (a Group object) <b>optional repeating</b><br>
 */
public class RRI_I12_OBSERVATION extends AbstractGroup {

	/** 
	 * Creates a new RRI_I12_OBSERVATION Group.
	 */
	public RRI_I12_OBSERVATION(Group parent, ModelClassFactory factory) {
	   super(parent, factory);
	   try {
	      this.add(OBR.class, true, false);
	      this.add(NTE.class, false, true);
	      this.add(RRI_I12_RESULTS_NOTES.class, false, true);
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error creating RRI_I12_OBSERVATION - this is probably a bug in the source code generator.", e);
	   }
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
	 * Returns  first repetition of RRI_I12_RESULTS_NOTES (a Group object) - creates it if necessary
	 */
	public RRI_I12_RESULTS_NOTES getRESULTS_NOTES() { 
	   RRI_I12_RESULTS_NOTES ret = null;
	   try {
	      ret = (RRI_I12_RESULTS_NOTES)this.get("RESULTS_NOTES");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns a specific repetition of RRI_I12_RESULTS_NOTES
	 * (a Group object) - creates it if necessary
	 * @throws HL7Exception if the repetition requested is more than one 
	 *     greater than the number of existing repetitions.
	 */
	public RRI_I12_RESULTS_NOTES getRESULTS_NOTES(int rep) throws HL7Exception { 
	   return (RRI_I12_RESULTS_NOTES)this.get("RESULTS_NOTES", rep);
	}

	/** 
	 * Returns the number of existing repetitions of RRI_I12_RESULTS_NOTES 
	 */ 
	public int getRESULTS_NOTESReps() { 
	    int reps = -1; 
	    try { 
	        reps = this.getAll("RESULTS_NOTES").length; 
	    } catch (HL7Exception e) { 
	        String message = "Unexpected error accessing data - this is probably a bug in the source code generator."; 
	        HapiLogFactory.getHapiLog(this.getClass()).error(message, e); 
	        throw new RuntimeException(message);
	    } 
	    return reps; 
	} 

	/**
	 * Inserts a specific repetition of RRI_I12_RESULTS_NOTES
	 * (a Group object)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public void  insertRESULTS_NOTES(RRI_I12_RESULTS_NOTES structure, int rep) throws HL7Exception { 
	   super.insertRepetition( structure, rep);
	}

	/**
	 * Inserts a specific repetition of RRI_I12_RESULTS_NOTES
	 * (a Group object)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public RRI_I12_RESULTS_NOTES insertRESULTS_NOTES(int rep) throws HL7Exception { 
	   return (RRI_I12_RESULTS_NOTES)super.insertRepetition("RESULTS_NOTES", rep);
	}

	/**
	 * Removes a specific repetition of RRI_I12_RESULTS_NOTES
	 * (a Group object)
	 * @see AbstractGroup#insertremoveRepetition(String, int) 
	 */
	public RRI_I12_RESULTS_NOTES removeRESULTS_NOTES(int rep) throws HL7Exception { 
	   return (RRI_I12_RESULTS_NOTES)super.removeRepetition("RESULTS_NOTES", rep);
	}

}
