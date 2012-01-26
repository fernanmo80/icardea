package ca.uhn.hl7v2.model.v26.group;

import ca.uhn.hl7v2.parser.ModelClassFactory;
import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.log.HapiLogFactory;
import ca.uhn.hl7v2.model.v26.segment.*;

import ca.uhn.hl7v2.model.*;
/**
 * <p>Represents the SQR_S25_SCHEDULE Group.  A Group is an ordered collection of message 
 * segments that can repeat together or be optionally in/excluded together.
 * This Group contains the following elements: </p>
 * 0: SCH (Scheduling Activity Information) <b></b><br>
 * 1: TQ1 (Timing/Quantity) <b>optional repeating</b><br>
 * 2: NTE (Notes and Comments) <b>optional repeating</b><br>
 * 3: SQR_S25_PATIENT (a Group object) <b>optional </b><br>
 * 4: SQR_S25_RESOURCES (a Group object) <b>repeating</b><br>
 */
public class SQR_S25_SCHEDULE extends AbstractGroup {

	/** 
	 * Creates a new SQR_S25_SCHEDULE Group.
	 */
	public SQR_S25_SCHEDULE(Group parent, ModelClassFactory factory) {
	   super(parent, factory);
	   try {
	      this.add(SCH.class, true, false);
	      this.add(TQ1.class, false, true);
	      this.add(NTE.class, false, true);
	      this.add(SQR_S25_PATIENT.class, false, false);
	      this.add(SQR_S25_RESOURCES.class, true, true);
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error creating SQR_S25_SCHEDULE - this is probably a bug in the source code generator.", e);
	   }
	}

	/**
	 * Returns SCH (Scheduling Activity Information) - creates it if necessary
	 */
	public SCH getSCH() { 
	   SCH ret = null;
	   try {
	      ret = (SCH)this.get("SCH");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns  first repetition of TQ1 (Timing/Quantity) - creates it if necessary
	 */
	public TQ1 getTQ1() { 
	   TQ1 ret = null;
	   try {
	      ret = (TQ1)this.get("TQ1");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns a specific repetition of TQ1
	 * (Timing/Quantity) - creates it if necessary
	 * @throws HL7Exception if the repetition requested is more than one 
	 *     greater than the number of existing repetitions.
	 */
	public TQ1 getTQ1(int rep) throws HL7Exception { 
	   return (TQ1)this.get("TQ1", rep);
	}

	/** 
	 * Returns the number of existing repetitions of TQ1 
	 */ 
	public int getTQ1Reps() { 
	    int reps = -1; 
	    try { 
	        reps = this.getAll("TQ1").length; 
	    } catch (HL7Exception e) { 
	        String message = "Unexpected error accessing data - this is probably a bug in the source code generator."; 
	        HapiLogFactory.getHapiLog(this.getClass()).error(message, e); 
	        throw new RuntimeException(message);
	    } 
	    return reps; 
	} 

	/**
	 * Inserts a specific repetition of TQ1
	 * (Timing/Quantity)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public void  insertTQ1(TQ1 structure, int rep) throws HL7Exception { 
	   super.insertRepetition( structure, rep);
	}

	/**
	 * Inserts a specific repetition of TQ1
	 * (Timing/Quantity)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public TQ1 insertTQ1(int rep) throws HL7Exception { 
	   return (TQ1)super.insertRepetition("TQ1", rep);
	}

	/**
	 * Removes a specific repetition of TQ1
	 * (Timing/Quantity)
	 * @see AbstractGroup#insertremoveRepetition(String, int) 
	 */
	public TQ1 removeTQ1(int rep) throws HL7Exception { 
	   return (TQ1)super.removeRepetition("TQ1", rep);
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
	 * Returns SQR_S25_PATIENT (a Group object) - creates it if necessary
	 */
	public SQR_S25_PATIENT getPATIENT() { 
	   SQR_S25_PATIENT ret = null;
	   try {
	      ret = (SQR_S25_PATIENT)this.get("PATIENT");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns  first repetition of SQR_S25_RESOURCES (a Group object) - creates it if necessary
	 */
	public SQR_S25_RESOURCES getRESOURCES() { 
	   SQR_S25_RESOURCES ret = null;
	   try {
	      ret = (SQR_S25_RESOURCES)this.get("RESOURCES");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns a specific repetition of SQR_S25_RESOURCES
	 * (a Group object) - creates it if necessary
	 * @throws HL7Exception if the repetition requested is more than one 
	 *     greater than the number of existing repetitions.
	 */
	public SQR_S25_RESOURCES getRESOURCES(int rep) throws HL7Exception { 
	   return (SQR_S25_RESOURCES)this.get("RESOURCES", rep);
	}

	/** 
	 * Returns the number of existing repetitions of SQR_S25_RESOURCES 
	 */ 
	public int getRESOURCESReps() { 
	    int reps = -1; 
	    try { 
	        reps = this.getAll("RESOURCES").length; 
	    } catch (HL7Exception e) { 
	        String message = "Unexpected error accessing data - this is probably a bug in the source code generator."; 
	        HapiLogFactory.getHapiLog(this.getClass()).error(message, e); 
	        throw new RuntimeException(message);
	    } 
	    return reps; 
	} 

	/**
	 * Inserts a specific repetition of SQR_S25_RESOURCES
	 * (a Group object)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public void  insertRESOURCES(SQR_S25_RESOURCES structure, int rep) throws HL7Exception { 
	   super.insertRepetition( structure, rep);
	}

	/**
	 * Inserts a specific repetition of SQR_S25_RESOURCES
	 * (a Group object)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public SQR_S25_RESOURCES insertRESOURCES(int rep) throws HL7Exception { 
	   return (SQR_S25_RESOURCES)super.insertRepetition("RESOURCES", rep);
	}

	/**
	 * Removes a specific repetition of SQR_S25_RESOURCES
	 * (a Group object)
	 * @see AbstractGroup#insertremoveRepetition(String, int) 
	 */
	public SQR_S25_RESOURCES removeRESOURCES(int rep) throws HL7Exception { 
	   return (SQR_S25_RESOURCES)super.removeRepetition("RESOURCES", rep);
	}

}
