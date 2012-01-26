package ca.uhn.hl7v2.model.v26.group;

import ca.uhn.hl7v2.parser.ModelClassFactory;
import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.log.HapiLogFactory;
import ca.uhn.hl7v2.model.v26.segment.*;

import ca.uhn.hl7v2.model.*;
/**
 * <p>Represents the OMI_O23_ORDER Group.  A Group is an ordered collection of message 
 * segments that can repeat together or be optionally in/excluded together.
 * This Group contains the following elements: </p>
 * 0: ORC (Common Order) <b></b><br>
 * 1: OMI_O23_TIMING (a Group object) <b>optional repeating</b><br>
 * 2: OBR (Observation Request) <b></b><br>
 * 3: NTE (Notes and Comments) <b>optional repeating</b><br>
 * 4: ROL (Role) <b>optional repeating</b><br>
 * 5: CTD (Contact Data) <b>optional </b><br>
 * 6: DG1 (Diagnosis) <b>optional repeating</b><br>
 * 7: OMI_O23_OBSERVATION (a Group object) <b>optional repeating</b><br>
 * 8: IPC (Imaging Procedure Control Segment) <b>repeating</b><br>
 */
public class OMI_O23_ORDER extends AbstractGroup {

	/** 
	 * Creates a new OMI_O23_ORDER Group.
	 */
	public OMI_O23_ORDER(Group parent, ModelClassFactory factory) {
	   super(parent, factory);
	   try {
	      this.add(ORC.class, true, false);
	      this.add(OMI_O23_TIMING.class, false, true);
	      this.add(OBR.class, true, false);
	      this.add(NTE.class, false, true);
	      this.add(ROL.class, false, true);
	      this.add(CTD.class, false, false);
	      this.add(DG1.class, false, true);
	      this.add(OMI_O23_OBSERVATION.class, false, true);
	      this.add(IPC.class, true, true);
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error creating OMI_O23_ORDER - this is probably a bug in the source code generator.", e);
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
	 * Returns  first repetition of OMI_O23_TIMING (a Group object) - creates it if necessary
	 */
	public OMI_O23_TIMING getTIMING() { 
	   OMI_O23_TIMING ret = null;
	   try {
	      ret = (OMI_O23_TIMING)this.get("TIMING");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns a specific repetition of OMI_O23_TIMING
	 * (a Group object) - creates it if necessary
	 * @throws HL7Exception if the repetition requested is more than one 
	 *     greater than the number of existing repetitions.
	 */
	public OMI_O23_TIMING getTIMING(int rep) throws HL7Exception { 
	   return (OMI_O23_TIMING)this.get("TIMING", rep);
	}

	/** 
	 * Returns the number of existing repetitions of OMI_O23_TIMING 
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
	 * Inserts a specific repetition of OMI_O23_TIMING
	 * (a Group object)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public void  insertTIMING(OMI_O23_TIMING structure, int rep) throws HL7Exception { 
	   super.insertRepetition( structure, rep);
	}

	/**
	 * Inserts a specific repetition of OMI_O23_TIMING
	 * (a Group object)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public OMI_O23_TIMING insertTIMING(int rep) throws HL7Exception { 
	   return (OMI_O23_TIMING)super.insertRepetition("TIMING", rep);
	}

	/**
	 * Removes a specific repetition of OMI_O23_TIMING
	 * (a Group object)
	 * @see AbstractGroup#insertremoveRepetition(String, int) 
	 */
	public OMI_O23_TIMING removeTIMING(int rep) throws HL7Exception { 
	   return (OMI_O23_TIMING)super.removeRepetition("TIMING", rep);
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
	 * Returns  first repetition of OMI_O23_OBSERVATION (a Group object) - creates it if necessary
	 */
	public OMI_O23_OBSERVATION getOBSERVATION() { 
	   OMI_O23_OBSERVATION ret = null;
	   try {
	      ret = (OMI_O23_OBSERVATION)this.get("OBSERVATION");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns a specific repetition of OMI_O23_OBSERVATION
	 * (a Group object) - creates it if necessary
	 * @throws HL7Exception if the repetition requested is more than one 
	 *     greater than the number of existing repetitions.
	 */
	public OMI_O23_OBSERVATION getOBSERVATION(int rep) throws HL7Exception { 
	   return (OMI_O23_OBSERVATION)this.get("OBSERVATION", rep);
	}

	/** 
	 * Returns the number of existing repetitions of OMI_O23_OBSERVATION 
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
	 * Inserts a specific repetition of OMI_O23_OBSERVATION
	 * (a Group object)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public void  insertOBSERVATION(OMI_O23_OBSERVATION structure, int rep) throws HL7Exception { 
	   super.insertRepetition( structure, rep);
	}

	/**
	 * Inserts a specific repetition of OMI_O23_OBSERVATION
	 * (a Group object)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public OMI_O23_OBSERVATION insertOBSERVATION(int rep) throws HL7Exception { 
	   return (OMI_O23_OBSERVATION)super.insertRepetition("OBSERVATION", rep);
	}

	/**
	 * Removes a specific repetition of OMI_O23_OBSERVATION
	 * (a Group object)
	 * @see AbstractGroup#insertremoveRepetition(String, int) 
	 */
	public OMI_O23_OBSERVATION removeOBSERVATION(int rep) throws HL7Exception { 
	   return (OMI_O23_OBSERVATION)super.removeRepetition("OBSERVATION", rep);
	}

	/**
	 * Returns  first repetition of IPC (Imaging Procedure Control Segment) - creates it if necessary
	 */
	public IPC getIPC() { 
	   IPC ret = null;
	   try {
	      ret = (IPC)this.get("IPC");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns a specific repetition of IPC
	 * (Imaging Procedure Control Segment) - creates it if necessary
	 * @throws HL7Exception if the repetition requested is more than one 
	 *     greater than the number of existing repetitions.
	 */
	public IPC getIPC(int rep) throws HL7Exception { 
	   return (IPC)this.get("IPC", rep);
	}

	/** 
	 * Returns the number of existing repetitions of IPC 
	 */ 
	public int getIPCReps() { 
	    int reps = -1; 
	    try { 
	        reps = this.getAll("IPC").length; 
	    } catch (HL7Exception e) { 
	        String message = "Unexpected error accessing data - this is probably a bug in the source code generator."; 
	        HapiLogFactory.getHapiLog(this.getClass()).error(message, e); 
	        throw new RuntimeException(message);
	    } 
	    return reps; 
	} 

	/**
	 * Inserts a specific repetition of IPC
	 * (Imaging Procedure Control Segment)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public void  insertIPC(IPC structure, int rep) throws HL7Exception { 
	   super.insertRepetition( structure, rep);
	}

	/**
	 * Inserts a specific repetition of IPC
	 * (Imaging Procedure Control Segment)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public IPC insertIPC(int rep) throws HL7Exception { 
	   return (IPC)super.insertRepetition("IPC", rep);
	}

	/**
	 * Removes a specific repetition of IPC
	 * (Imaging Procedure Control Segment)
	 * @see AbstractGroup#insertremoveRepetition(String, int) 
	 */
	public IPC removeIPC(int rep) throws HL7Exception { 
	   return (IPC)super.removeRepetition("IPC", rep);
	}

}
