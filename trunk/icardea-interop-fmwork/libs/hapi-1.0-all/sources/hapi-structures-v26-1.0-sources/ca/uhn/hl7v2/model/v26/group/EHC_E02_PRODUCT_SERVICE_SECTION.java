package ca.uhn.hl7v2.model.v26.group;

import ca.uhn.hl7v2.parser.ModelClassFactory;
import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.log.HapiLogFactory;
import ca.uhn.hl7v2.model.v26.segment.*;

import ca.uhn.hl7v2.model.*;
/**
 * <p>Represents the EHC_E02_PRODUCT_SERVICE_SECTION Group.  A Group is an ordered collection of message 
 * segments that can repeat together or be optionally in/excluded together.
 * This Group contains the following elements: </p>
 * 0: PSS (Product/Service Section) <b></b><br>
 * 1: EHC_E02_PSG (a Group object) <b>optional repeating</b><br>
 */
public class EHC_E02_PRODUCT_SERVICE_SECTION extends AbstractGroup {

	/** 
	 * Creates a new EHC_E02_PRODUCT_SERVICE_SECTION Group.
	 */
	public EHC_E02_PRODUCT_SERVICE_SECTION(Group parent, ModelClassFactory factory) {
	   super(parent, factory);
	   try {
	      this.add(PSS.class, true, false);
	      this.add(EHC_E02_PSG.class, false, true);
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error creating EHC_E02_PRODUCT_SERVICE_SECTION - this is probably a bug in the source code generator.", e);
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
	 * Returns  first repetition of EHC_E02_PSG (a Group object) - creates it if necessary
	 */
	public EHC_E02_PSG getPSG() { 
	   EHC_E02_PSG ret = null;
	   try {
	      ret = (EHC_E02_PSG)this.get("PSG");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns a specific repetition of EHC_E02_PSG
	 * (a Group object) - creates it if necessary
	 * @throws HL7Exception if the repetition requested is more than one 
	 *     greater than the number of existing repetitions.
	 */
	public EHC_E02_PSG getPSG(int rep) throws HL7Exception { 
	   return (EHC_E02_PSG)this.get("PSG", rep);
	}

	/** 
	 * Returns the number of existing repetitions of EHC_E02_PSG 
	 */ 
	public int getPSGReps() { 
	    int reps = -1; 
	    try { 
	        reps = this.getAll("PSG").length; 
	    } catch (HL7Exception e) { 
	        String message = "Unexpected error accessing data - this is probably a bug in the source code generator."; 
	        HapiLogFactory.getHapiLog(this.getClass()).error(message, e); 
	        throw new RuntimeException(message);
	    } 
	    return reps; 
	} 

	/**
	 * Inserts a specific repetition of EHC_E02_PSG
	 * (a Group object)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public void  insertPSG(EHC_E02_PSG structure, int rep) throws HL7Exception { 
	   super.insertRepetition( structure, rep);
	}

	/**
	 * Inserts a specific repetition of EHC_E02_PSG
	 * (a Group object)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public EHC_E02_PSG insertPSG(int rep) throws HL7Exception { 
	   return (EHC_E02_PSG)super.insertRepetition("PSG", rep);
	}

	/**
	 * Removes a specific repetition of EHC_E02_PSG
	 * (a Group object)
	 * @see AbstractGroup#insertremoveRepetition(String, int) 
	 */
	public EHC_E02_PSG removePSG(int rep) throws HL7Exception { 
	   return (EHC_E02_PSG)super.removeRepetition("PSG", rep);
	}

}
