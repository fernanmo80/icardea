package ca.uhn.hl7v2.model.v26.group;

import ca.uhn.hl7v2.parser.ModelClassFactory;
import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.log.HapiLogFactory;
import ca.uhn.hl7v2.model.v26.segment.*;

import ca.uhn.hl7v2.model.*;
/**
 * <p>Represents the OPR_O38_RESPONSE Group.  A Group is an ordered collection of message 
 * segments that can repeat together or be optionally in/excluded together.
 * This Group contains the following elements: </p>
 * 0: NK1 (Next of Kin / Associated Parties) <b>repeating</b><br>
 * 1: PID (Patient Identification) <b>optional </b><br>
 * 2: OPR_O38_SPECIMEN (a Group object) <b>optional repeating</b><br>
 */
public class OPR_O38_RESPONSE extends AbstractGroup {

	/** 
	 * Creates a new OPR_O38_RESPONSE Group.
	 */
	public OPR_O38_RESPONSE(Group parent, ModelClassFactory factory) {
	   super(parent, factory);
	   try {
	      this.add(NK1.class, true, true);
	      this.add(PID.class, false, false);
	      this.add(OPR_O38_SPECIMEN.class, false, true);
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error creating OPR_O38_RESPONSE - this is probably a bug in the source code generator.", e);
	   }
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
	 * Returns  first repetition of OPR_O38_SPECIMEN (a Group object) - creates it if necessary
	 */
	public OPR_O38_SPECIMEN getSPECIMEN() { 
	   OPR_O38_SPECIMEN ret = null;
	   try {
	      ret = (OPR_O38_SPECIMEN)this.get("SPECIMEN");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns a specific repetition of OPR_O38_SPECIMEN
	 * (a Group object) - creates it if necessary
	 * @throws HL7Exception if the repetition requested is more than one 
	 *     greater than the number of existing repetitions.
	 */
	public OPR_O38_SPECIMEN getSPECIMEN(int rep) throws HL7Exception { 
	   return (OPR_O38_SPECIMEN)this.get("SPECIMEN", rep);
	}

	/** 
	 * Returns the number of existing repetitions of OPR_O38_SPECIMEN 
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
	 * Inserts a specific repetition of OPR_O38_SPECIMEN
	 * (a Group object)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public void  insertSPECIMEN(OPR_O38_SPECIMEN structure, int rep) throws HL7Exception { 
	   super.insertRepetition( structure, rep);
	}

	/**
	 * Inserts a specific repetition of OPR_O38_SPECIMEN
	 * (a Group object)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public OPR_O38_SPECIMEN insertSPECIMEN(int rep) throws HL7Exception { 
	   return (OPR_O38_SPECIMEN)super.insertRepetition("SPECIMEN", rep);
	}

	/**
	 * Removes a specific repetition of OPR_O38_SPECIMEN
	 * (a Group object)
	 * @see AbstractGroup#insertremoveRepetition(String, int) 
	 */
	public OPR_O38_SPECIMEN removeSPECIMEN(int rep) throws HL7Exception { 
	   return (OPR_O38_SPECIMEN)super.removeRepetition("SPECIMEN", rep);
	}

}
