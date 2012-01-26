package ca.uhn.hl7v2.model.v26.group;

import ca.uhn.hl7v2.parser.ModelClassFactory;
import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.log.HapiLogFactory;
import ca.uhn.hl7v2.model.v26.segment.*;

import ca.uhn.hl7v2.model.*;
/**
 * <p>Represents the EHC_E15_PRODUCT_SERVICE_GROUP Group.  A Group is an ordered collection of message 
 * segments that can repeat together or be optionally in/excluded together.
 * This Group contains the following elements: </p>
 * 0: PSG (Product/Service Group) <b></b><br>
 * 1: EHC_E15_PSL_ITEM_INFO (a Group object) <b>repeating</b><br>
 */
public class EHC_E15_PRODUCT_SERVICE_GROUP extends AbstractGroup {

	/** 
	 * Creates a new EHC_E15_PRODUCT_SERVICE_GROUP Group.
	 */
	public EHC_E15_PRODUCT_SERVICE_GROUP(Group parent, ModelClassFactory factory) {
	   super(parent, factory);
	   try {
	      this.add(PSG.class, true, false);
	      this.add(EHC_E15_PSL_ITEM_INFO.class, true, true);
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error creating EHC_E15_PRODUCT_SERVICE_GROUP - this is probably a bug in the source code generator.", e);
	   }
	}

	/**
	 * Returns PSG (Product/Service Group) - creates it if necessary
	 */
	public PSG getPSG() { 
	   PSG ret = null;
	   try {
	      ret = (PSG)this.get("PSG");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns  first repetition of EHC_E15_PSL_ITEM_INFO (a Group object) - creates it if necessary
	 */
	public EHC_E15_PSL_ITEM_INFO getPSL_ITEM_INFO() { 
	   EHC_E15_PSL_ITEM_INFO ret = null;
	   try {
	      ret = (EHC_E15_PSL_ITEM_INFO)this.get("PSL_ITEM_INFO");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns a specific repetition of EHC_E15_PSL_ITEM_INFO
	 * (a Group object) - creates it if necessary
	 * @throws HL7Exception if the repetition requested is more than one 
	 *     greater than the number of existing repetitions.
	 */
	public EHC_E15_PSL_ITEM_INFO getPSL_ITEM_INFO(int rep) throws HL7Exception { 
	   return (EHC_E15_PSL_ITEM_INFO)this.get("PSL_ITEM_INFO", rep);
	}

	/** 
	 * Returns the number of existing repetitions of EHC_E15_PSL_ITEM_INFO 
	 */ 
	public int getPSL_ITEM_INFOReps() { 
	    int reps = -1; 
	    try { 
	        reps = this.getAll("PSL_ITEM_INFO").length; 
	    } catch (HL7Exception e) { 
	        String message = "Unexpected error accessing data - this is probably a bug in the source code generator."; 
	        HapiLogFactory.getHapiLog(this.getClass()).error(message, e); 
	        throw new RuntimeException(message);
	    } 
	    return reps; 
	} 

	/**
	 * Inserts a specific repetition of EHC_E15_PSL_ITEM_INFO
	 * (a Group object)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public void  insertPSL_ITEM_INFO(EHC_E15_PSL_ITEM_INFO structure, int rep) throws HL7Exception { 
	   super.insertRepetition( structure, rep);
	}

	/**
	 * Inserts a specific repetition of EHC_E15_PSL_ITEM_INFO
	 * (a Group object)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public EHC_E15_PSL_ITEM_INFO insertPSL_ITEM_INFO(int rep) throws HL7Exception { 
	   return (EHC_E15_PSL_ITEM_INFO)super.insertRepetition("PSL_ITEM_INFO", rep);
	}

	/**
	 * Removes a specific repetition of EHC_E15_PSL_ITEM_INFO
	 * (a Group object)
	 * @see AbstractGroup#insertremoveRepetition(String, int) 
	 */
	public EHC_E15_PSL_ITEM_INFO removePSL_ITEM_INFO(int rep) throws HL7Exception { 
	   return (EHC_E15_PSL_ITEM_INFO)super.removeRepetition("PSL_ITEM_INFO", rep);
	}

}
