package ca.uhn.hl7v2.model.v26.group;

import ca.uhn.hl7v2.parser.ModelClassFactory;
import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.log.HapiLogFactory;
import ca.uhn.hl7v2.model.v26.segment.*;

import ca.uhn.hl7v2.model.*;
/**
 * <p>Represents the OPL_O37_PRIOR_RESULT Group.  A Group is an ordered collection of message 
 * segments that can repeat together or be optionally in/excluded together.
 * This Group contains the following elements: </p>
 * 0: NK1 (Next of Kin / Associated Parties) <b>repeating</b><br>
 * 1: OPL_O37_PATIENT_PRIOR (a Group object) <b>optional </b><br>
 * 2: OPL_O37_PATIENT_VISIT_PRIOR (a Group object) <b>optional </b><br>
 * 3: AL1 (Patient Allergy Information) <b>optional </b><br>
 * 4: OPL_O37_ORDER_PRIOR (a Group object) <b>repeating</b><br>
 */
public class OPL_O37_PRIOR_RESULT extends AbstractGroup {

	/** 
	 * Creates a new OPL_O37_PRIOR_RESULT Group.
	 */
	public OPL_O37_PRIOR_RESULT(Group parent, ModelClassFactory factory) {
	   super(parent, factory);
	   try {
	      this.add(NK1.class, true, true);
	      this.add(OPL_O37_PATIENT_PRIOR.class, false, false);
	      this.add(OPL_O37_PATIENT_VISIT_PRIOR.class, false, false);
	      this.add(AL1.class, false, false);
	      this.add(OPL_O37_ORDER_PRIOR.class, true, true);
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error creating OPL_O37_PRIOR_RESULT - this is probably a bug in the source code generator.", e);
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
	 * Returns OPL_O37_PATIENT_PRIOR (a Group object) - creates it if necessary
	 */
	public OPL_O37_PATIENT_PRIOR getPATIENT_PRIOR() { 
	   OPL_O37_PATIENT_PRIOR ret = null;
	   try {
	      ret = (OPL_O37_PATIENT_PRIOR)this.get("PATIENT_PRIOR");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns OPL_O37_PATIENT_VISIT_PRIOR (a Group object) - creates it if necessary
	 */
	public OPL_O37_PATIENT_VISIT_PRIOR getPATIENT_VISIT_PRIOR() { 
	   OPL_O37_PATIENT_VISIT_PRIOR ret = null;
	   try {
	      ret = (OPL_O37_PATIENT_VISIT_PRIOR)this.get("PATIENT_VISIT_PRIOR");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns AL1 (Patient Allergy Information) - creates it if necessary
	 */
	public AL1 getAL1() { 
	   AL1 ret = null;
	   try {
	      ret = (AL1)this.get("AL1");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns  first repetition of OPL_O37_ORDER_PRIOR (a Group object) - creates it if necessary
	 */
	public OPL_O37_ORDER_PRIOR getORDER_PRIOR() { 
	   OPL_O37_ORDER_PRIOR ret = null;
	   try {
	      ret = (OPL_O37_ORDER_PRIOR)this.get("ORDER_PRIOR");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns a specific repetition of OPL_O37_ORDER_PRIOR
	 * (a Group object) - creates it if necessary
	 * @throws HL7Exception if the repetition requested is more than one 
	 *     greater than the number of existing repetitions.
	 */
	public OPL_O37_ORDER_PRIOR getORDER_PRIOR(int rep) throws HL7Exception { 
	   return (OPL_O37_ORDER_PRIOR)this.get("ORDER_PRIOR", rep);
	}

	/** 
	 * Returns the number of existing repetitions of OPL_O37_ORDER_PRIOR 
	 */ 
	public int getORDER_PRIORReps() { 
	    int reps = -1; 
	    try { 
	        reps = this.getAll("ORDER_PRIOR").length; 
	    } catch (HL7Exception e) { 
	        String message = "Unexpected error accessing data - this is probably a bug in the source code generator."; 
	        HapiLogFactory.getHapiLog(this.getClass()).error(message, e); 
	        throw new RuntimeException(message);
	    } 
	    return reps; 
	} 

	/**
	 * Inserts a specific repetition of OPL_O37_ORDER_PRIOR
	 * (a Group object)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public void  insertORDER_PRIOR(OPL_O37_ORDER_PRIOR structure, int rep) throws HL7Exception { 
	   super.insertRepetition( structure, rep);
	}

	/**
	 * Inserts a specific repetition of OPL_O37_ORDER_PRIOR
	 * (a Group object)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public OPL_O37_ORDER_PRIOR insertORDER_PRIOR(int rep) throws HL7Exception { 
	   return (OPL_O37_ORDER_PRIOR)super.insertRepetition("ORDER_PRIOR", rep);
	}

	/**
	 * Removes a specific repetition of OPL_O37_ORDER_PRIOR
	 * (a Group object)
	 * @see AbstractGroup#insertremoveRepetition(String, int) 
	 */
	public OPL_O37_ORDER_PRIOR removeORDER_PRIOR(int rep) throws HL7Exception { 
	   return (OPL_O37_ORDER_PRIOR)super.removeRepetition("ORDER_PRIOR", rep);
	}

}
