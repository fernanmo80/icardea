package ca.uhn.hl7v2.model.v26.group;

import ca.uhn.hl7v2.parser.ModelClassFactory;
import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.log.HapiLogFactory;
import ca.uhn.hl7v2.model.v26.segment.*;

import ca.uhn.hl7v2.model.*;
/**
 * <p>Represents the SQM_S25_RESOURCES Group.  A Group is an ordered collection of message 
 * segments that can repeat together or be optionally in/excluded together.
 * This Group contains the following elements: </p>
 * 0: RGS (Resource Group) <b></b><br>
 * 1: SQM_S25_SERVICE (a Group object) <b>optional repeating</b><br>
 * 2: SQM_S25_GENERAL_RESOURCE (a Group object) <b>optional repeating</b><br>
 * 3: SQM_S25_PERSONNEL_RESOURCE (a Group object) <b>optional repeating</b><br>
 * 4: SQM_S25_LOCATION_RESOURCE (a Group object) <b>optional repeating</b><br>
 */
public class SQM_S25_RESOURCES extends AbstractGroup {

	/** 
	 * Creates a new SQM_S25_RESOURCES Group.
	 */
	public SQM_S25_RESOURCES(Group parent, ModelClassFactory factory) {
	   super(parent, factory);
	   try {
	      this.add(RGS.class, true, false);
	      this.add(SQM_S25_SERVICE.class, false, true);
	      this.add(SQM_S25_GENERAL_RESOURCE.class, false, true);
	      this.add(SQM_S25_PERSONNEL_RESOURCE.class, false, true);
	      this.add(SQM_S25_LOCATION_RESOURCE.class, false, true);
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error creating SQM_S25_RESOURCES - this is probably a bug in the source code generator.", e);
	   }
	}

	/**
	 * Returns RGS (Resource Group) - creates it if necessary
	 */
	public RGS getRGS() { 
	   RGS ret = null;
	   try {
	      ret = (RGS)this.get("RGS");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns  first repetition of SQM_S25_SERVICE (a Group object) - creates it if necessary
	 */
	public SQM_S25_SERVICE getSERVICE() { 
	   SQM_S25_SERVICE ret = null;
	   try {
	      ret = (SQM_S25_SERVICE)this.get("SERVICE");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns a specific repetition of SQM_S25_SERVICE
	 * (a Group object) - creates it if necessary
	 * @throws HL7Exception if the repetition requested is more than one 
	 *     greater than the number of existing repetitions.
	 */
	public SQM_S25_SERVICE getSERVICE(int rep) throws HL7Exception { 
	   return (SQM_S25_SERVICE)this.get("SERVICE", rep);
	}

	/** 
	 * Returns the number of existing repetitions of SQM_S25_SERVICE 
	 */ 
	public int getSERVICEReps() { 
	    int reps = -1; 
	    try { 
	        reps = this.getAll("SERVICE").length; 
	    } catch (HL7Exception e) { 
	        String message = "Unexpected error accessing data - this is probably a bug in the source code generator."; 
	        HapiLogFactory.getHapiLog(this.getClass()).error(message, e); 
	        throw new RuntimeException(message);
	    } 
	    return reps; 
	} 

	/**
	 * Inserts a specific repetition of SQM_S25_SERVICE
	 * (a Group object)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public void  insertSERVICE(SQM_S25_SERVICE structure, int rep) throws HL7Exception { 
	   super.insertRepetition( structure, rep);
	}

	/**
	 * Inserts a specific repetition of SQM_S25_SERVICE
	 * (a Group object)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public SQM_S25_SERVICE insertSERVICE(int rep) throws HL7Exception { 
	   return (SQM_S25_SERVICE)super.insertRepetition("SERVICE", rep);
	}

	/**
	 * Removes a specific repetition of SQM_S25_SERVICE
	 * (a Group object)
	 * @see AbstractGroup#insertremoveRepetition(String, int) 
	 */
	public SQM_S25_SERVICE removeSERVICE(int rep) throws HL7Exception { 
	   return (SQM_S25_SERVICE)super.removeRepetition("SERVICE", rep);
	}

	/**
	 * Returns  first repetition of SQM_S25_GENERAL_RESOURCE (a Group object) - creates it if necessary
	 */
	public SQM_S25_GENERAL_RESOURCE getGENERAL_RESOURCE() { 
	   SQM_S25_GENERAL_RESOURCE ret = null;
	   try {
	      ret = (SQM_S25_GENERAL_RESOURCE)this.get("GENERAL_RESOURCE");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns a specific repetition of SQM_S25_GENERAL_RESOURCE
	 * (a Group object) - creates it if necessary
	 * @throws HL7Exception if the repetition requested is more than one 
	 *     greater than the number of existing repetitions.
	 */
	public SQM_S25_GENERAL_RESOURCE getGENERAL_RESOURCE(int rep) throws HL7Exception { 
	   return (SQM_S25_GENERAL_RESOURCE)this.get("GENERAL_RESOURCE", rep);
	}

	/** 
	 * Returns the number of existing repetitions of SQM_S25_GENERAL_RESOURCE 
	 */ 
	public int getGENERAL_RESOURCEReps() { 
	    int reps = -1; 
	    try { 
	        reps = this.getAll("GENERAL_RESOURCE").length; 
	    } catch (HL7Exception e) { 
	        String message = "Unexpected error accessing data - this is probably a bug in the source code generator."; 
	        HapiLogFactory.getHapiLog(this.getClass()).error(message, e); 
	        throw new RuntimeException(message);
	    } 
	    return reps; 
	} 

	/**
	 * Inserts a specific repetition of SQM_S25_GENERAL_RESOURCE
	 * (a Group object)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public void  insertGENERAL_RESOURCE(SQM_S25_GENERAL_RESOURCE structure, int rep) throws HL7Exception { 
	   super.insertRepetition( structure, rep);
	}

	/**
	 * Inserts a specific repetition of SQM_S25_GENERAL_RESOURCE
	 * (a Group object)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public SQM_S25_GENERAL_RESOURCE insertGENERAL_RESOURCE(int rep) throws HL7Exception { 
	   return (SQM_S25_GENERAL_RESOURCE)super.insertRepetition("GENERAL_RESOURCE", rep);
	}

	/**
	 * Removes a specific repetition of SQM_S25_GENERAL_RESOURCE
	 * (a Group object)
	 * @see AbstractGroup#insertremoveRepetition(String, int) 
	 */
	public SQM_S25_GENERAL_RESOURCE removeGENERAL_RESOURCE(int rep) throws HL7Exception { 
	   return (SQM_S25_GENERAL_RESOURCE)super.removeRepetition("GENERAL_RESOURCE", rep);
	}

	/**
	 * Returns  first repetition of SQM_S25_PERSONNEL_RESOURCE (a Group object) - creates it if necessary
	 */
	public SQM_S25_PERSONNEL_RESOURCE getPERSONNEL_RESOURCE() { 
	   SQM_S25_PERSONNEL_RESOURCE ret = null;
	   try {
	      ret = (SQM_S25_PERSONNEL_RESOURCE)this.get("PERSONNEL_RESOURCE");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns a specific repetition of SQM_S25_PERSONNEL_RESOURCE
	 * (a Group object) - creates it if necessary
	 * @throws HL7Exception if the repetition requested is more than one 
	 *     greater than the number of existing repetitions.
	 */
	public SQM_S25_PERSONNEL_RESOURCE getPERSONNEL_RESOURCE(int rep) throws HL7Exception { 
	   return (SQM_S25_PERSONNEL_RESOURCE)this.get("PERSONNEL_RESOURCE", rep);
	}

	/** 
	 * Returns the number of existing repetitions of SQM_S25_PERSONNEL_RESOURCE 
	 */ 
	public int getPERSONNEL_RESOURCEReps() { 
	    int reps = -1; 
	    try { 
	        reps = this.getAll("PERSONNEL_RESOURCE").length; 
	    } catch (HL7Exception e) { 
	        String message = "Unexpected error accessing data - this is probably a bug in the source code generator."; 
	        HapiLogFactory.getHapiLog(this.getClass()).error(message, e); 
	        throw new RuntimeException(message);
	    } 
	    return reps; 
	} 

	/**
	 * Inserts a specific repetition of SQM_S25_PERSONNEL_RESOURCE
	 * (a Group object)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public void  insertPERSONNEL_RESOURCE(SQM_S25_PERSONNEL_RESOURCE structure, int rep) throws HL7Exception { 
	   super.insertRepetition( structure, rep);
	}

	/**
	 * Inserts a specific repetition of SQM_S25_PERSONNEL_RESOURCE
	 * (a Group object)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public SQM_S25_PERSONNEL_RESOURCE insertPERSONNEL_RESOURCE(int rep) throws HL7Exception { 
	   return (SQM_S25_PERSONNEL_RESOURCE)super.insertRepetition("PERSONNEL_RESOURCE", rep);
	}

	/**
	 * Removes a specific repetition of SQM_S25_PERSONNEL_RESOURCE
	 * (a Group object)
	 * @see AbstractGroup#insertremoveRepetition(String, int) 
	 */
	public SQM_S25_PERSONNEL_RESOURCE removePERSONNEL_RESOURCE(int rep) throws HL7Exception { 
	   return (SQM_S25_PERSONNEL_RESOURCE)super.removeRepetition("PERSONNEL_RESOURCE", rep);
	}

	/**
	 * Returns  first repetition of SQM_S25_LOCATION_RESOURCE (a Group object) - creates it if necessary
	 */
	public SQM_S25_LOCATION_RESOURCE getLOCATION_RESOURCE() { 
	   SQM_S25_LOCATION_RESOURCE ret = null;
	   try {
	      ret = (SQM_S25_LOCATION_RESOURCE)this.get("LOCATION_RESOURCE");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns a specific repetition of SQM_S25_LOCATION_RESOURCE
	 * (a Group object) - creates it if necessary
	 * @throws HL7Exception if the repetition requested is more than one 
	 *     greater than the number of existing repetitions.
	 */
	public SQM_S25_LOCATION_RESOURCE getLOCATION_RESOURCE(int rep) throws HL7Exception { 
	   return (SQM_S25_LOCATION_RESOURCE)this.get("LOCATION_RESOURCE", rep);
	}

	/** 
	 * Returns the number of existing repetitions of SQM_S25_LOCATION_RESOURCE 
	 */ 
	public int getLOCATION_RESOURCEReps() { 
	    int reps = -1; 
	    try { 
	        reps = this.getAll("LOCATION_RESOURCE").length; 
	    } catch (HL7Exception e) { 
	        String message = "Unexpected error accessing data - this is probably a bug in the source code generator."; 
	        HapiLogFactory.getHapiLog(this.getClass()).error(message, e); 
	        throw new RuntimeException(message);
	    } 
	    return reps; 
	} 

	/**
	 * Inserts a specific repetition of SQM_S25_LOCATION_RESOURCE
	 * (a Group object)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public void  insertLOCATION_RESOURCE(SQM_S25_LOCATION_RESOURCE structure, int rep) throws HL7Exception { 
	   super.insertRepetition( structure, rep);
	}

	/**
	 * Inserts a specific repetition of SQM_S25_LOCATION_RESOURCE
	 * (a Group object)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public SQM_S25_LOCATION_RESOURCE insertLOCATION_RESOURCE(int rep) throws HL7Exception { 
	   return (SQM_S25_LOCATION_RESOURCE)super.insertRepetition("LOCATION_RESOURCE", rep);
	}

	/**
	 * Removes a specific repetition of SQM_S25_LOCATION_RESOURCE
	 * (a Group object)
	 * @see AbstractGroup#insertremoveRepetition(String, int) 
	 */
	public SQM_S25_LOCATION_RESOURCE removeLOCATION_RESOURCE(int rep) throws HL7Exception { 
	   return (SQM_S25_LOCATION_RESOURCE)super.removeRepetition("LOCATION_RESOURCE", rep);
	}

}