package ca.uhn.hl7v2.model.v26.group;

import ca.uhn.hl7v2.parser.ModelClassFactory;
import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.log.HapiLogFactory;
import ca.uhn.hl7v2.model.v26.segment.*;

import ca.uhn.hl7v2.model.*;
/**
 * <p>Represents the OPU_R25_ACCESSION_DETAIL Group.  A Group is an ordered collection of message 
 * segments that can repeat together or be optionally in/excluded together.
 * This Group contains the following elements: </p>
 * 0: NK1 (Next of Kin / Associated Parties) <b>repeating</b><br>
 * 1: OPU_R25_PATIENT (a Group object) <b>optional </b><br>
 * 2: OPU_R25_SPECIMEN (a Group object) <b>repeating</b><br>
 */
public class OPU_R25_ACCESSION_DETAIL extends AbstractGroup {

	/** 
	 * Creates a new OPU_R25_ACCESSION_DETAIL Group.
	 */
	public OPU_R25_ACCESSION_DETAIL(Group parent, ModelClassFactory factory) {
	   super(parent, factory);
	   try {
	      this.add(NK1.class, true, true);
	      this.add(OPU_R25_PATIENT.class, false, false);
	      this.add(OPU_R25_SPECIMEN.class, true, true);
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error creating OPU_R25_ACCESSION_DETAIL - this is probably a bug in the source code generator.", e);
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
	 * Returns OPU_R25_PATIENT (a Group object) - creates it if necessary
	 */
	public OPU_R25_PATIENT getPATIENT() { 
	   OPU_R25_PATIENT ret = null;
	   try {
	      ret = (OPU_R25_PATIENT)this.get("PATIENT");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns  first repetition of OPU_R25_SPECIMEN (a Group object) - creates it if necessary
	 */
	public OPU_R25_SPECIMEN getSPECIMEN() { 
	   OPU_R25_SPECIMEN ret = null;
	   try {
	      ret = (OPU_R25_SPECIMEN)this.get("SPECIMEN");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns a specific repetition of OPU_R25_SPECIMEN
	 * (a Group object) - creates it if necessary
	 * @throws HL7Exception if the repetition requested is more than one 
	 *     greater than the number of existing repetitions.
	 */
	public OPU_R25_SPECIMEN getSPECIMEN(int rep) throws HL7Exception { 
	   return (OPU_R25_SPECIMEN)this.get("SPECIMEN", rep);
	}

	/** 
	 * Returns the number of existing repetitions of OPU_R25_SPECIMEN 
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
	 * Inserts a specific repetition of OPU_R25_SPECIMEN
	 * (a Group object)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public void  insertSPECIMEN(OPU_R25_SPECIMEN structure, int rep) throws HL7Exception { 
	   super.insertRepetition( structure, rep);
	}

	/**
	 * Inserts a specific repetition of OPU_R25_SPECIMEN
	 * (a Group object)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public OPU_R25_SPECIMEN insertSPECIMEN(int rep) throws HL7Exception { 
	   return (OPU_R25_SPECIMEN)super.insertRepetition("SPECIMEN", rep);
	}

	/**
	 * Removes a specific repetition of OPU_R25_SPECIMEN
	 * (a Group object)
	 * @see AbstractGroup#insertremoveRepetition(String, int) 
	 */
	public OPU_R25_SPECIMEN removeSPECIMEN(int rep) throws HL7Exception { 
	   return (OPU_R25_SPECIMEN)super.removeRepetition("SPECIMEN", rep);
	}

}
