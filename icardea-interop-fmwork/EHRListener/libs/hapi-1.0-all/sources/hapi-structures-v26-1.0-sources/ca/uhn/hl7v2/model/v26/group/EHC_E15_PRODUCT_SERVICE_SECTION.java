package ca.uhn.hl7v2.model.v26.group;

import ca.uhn.hl7v2.parser.ModelClassFactory;
import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.log.HapiLogFactory;
import ca.uhn.hl7v2.model.v26.segment.*;

import ca.uhn.hl7v2.model.*;
/**
 * <p>Represents the EHC_E15_PRODUCT_SERVICE_SECTION Group.  A Group is an ordered collection of message 
 * segments that can repeat together or be optionally in/excluded together.
 * This Group contains the following elements: </p>
 * 0: PSS (Product/Service Section) <b></b><br>
 * 1: EHC_E15_PRODUCT_SERVICE_GROUP (a Group object) <b>repeating</b><br>
 */
public class EHC_E15_PRODUCT_SERVICE_SECTION extends AbstractGroup {

	/** 
	 * Creates a new EHC_E15_PRODUCT_SERVICE_SECTION Group.
	 */
	public EHC_E15_PRODUCT_SERVICE_SECTION(Group parent, ModelClassFactory factory) {
	   super(parent, factory);
	   try {
	      this.add(PSS.class, true, false);
	      this.add(EHC_E15_PRODUCT_SERVICE_GROUP.class, true, true);
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error creating EHC_E15_PRODUCT_SERVICE_SECTION - this is probably a bug in the source code generator.", e);
	   }
	}

	/**
	 * Returns PSS (Product/Service Section) - creates it if necessary
	 */
	public PSS getPSS() { 
	   PSS ret = null;
	   try {
	      ret = (PSS)this.get("PSS");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns  first repetition of EHC_E15_PRODUCT_SERVICE_GROUP (a Group object) - creates it if necessary
	 */
	public EHC_E15_PRODUCT_SERVICE_GROUP getPRODUCT_SERVICE_GROUP() { 
	   EHC_E15_PRODUCT_SERVICE_GROUP ret = null;
	   try {
	      ret = (EHC_E15_PRODUCT_SERVICE_GROUP)this.get("PRODUCT_SERVICE_GROUP");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns a specific repetition of EHC_E15_PRODUCT_SERVICE_GROUP
	 * (a Group object) - creates it if necessary
	 * @throws HL7Exception if the repetition requested is more than one 
	 *     greater than the number of existing repetitions.
	 */
	public EHC_E15_PRODUCT_SERVICE_GROUP getPRODUCT_SERVICE_GROUP(int rep) throws HL7Exception { 
	   return (EHC_E15_PRODUCT_SERVICE_GROUP)this.get("PRODUCT_SERVICE_GROUP", rep);
	}

	/** 
	 * Returns the number of existing repetitions of EHC_E15_PRODUCT_SERVICE_GROUP 
	 */ 
	public int getPRODUCT_SERVICE_GROUPReps() { 
	    int reps = -1; 
	    try { 
	        reps = this.getAll("PRODUCT_SERVICE_GROUP").length; 
	    } catch (HL7Exception e) { 
	        String message = "Unexpected error accessing data - this is probably a bug in the source code generator."; 
	        HapiLogFactory.getHapiLog(this.getClass()).error(message, e); 
	        throw new RuntimeException(message);
	    } 
	    return reps; 
	} 

	/**
	 * Inserts a specific repetition of EHC_E15_PRODUCT_SERVICE_GROUP
	 * (a Group object)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public void  insertPRODUCT_SERVICE_GROUP(EHC_E15_PRODUCT_SERVICE_GROUP structure, int rep) throws HL7Exception { 
	   super.insertRepetition( structure, rep);
	}

	/**
	 * Inserts a specific repetition of EHC_E15_PRODUCT_SERVICE_GROUP
	 * (a Group object)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public EHC_E15_PRODUCT_SERVICE_GROUP insertPRODUCT_SERVICE_GROUP(int rep) throws HL7Exception { 
	   return (EHC_E15_PRODUCT_SERVICE_GROUP)super.insertRepetition("PRODUCT_SERVICE_GROUP", rep);
	}

	/**
	 * Removes a specific repetition of EHC_E15_PRODUCT_SERVICE_GROUP
	 * (a Group object)
	 * @see AbstractGroup#insertremoveRepetition(String, int) 
	 */
	public EHC_E15_PRODUCT_SERVICE_GROUP removePRODUCT_SERVICE_GROUP(int rep) throws HL7Exception { 
	   return (EHC_E15_PRODUCT_SERVICE_GROUP)super.removeRepetition("PRODUCT_SERVICE_GROUP", rep);
	}

}
