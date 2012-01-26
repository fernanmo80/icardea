package ca.uhn.hl7v2.model.v26.group;

import ca.uhn.hl7v2.parser.ModelClassFactory;
import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.log.HapiLogFactory;
import ca.uhn.hl7v2.model.v26.segment.*;

import ca.uhn.hl7v2.model.*;
/**
 * <p>Represents the EHC_E15_PSL_ITEM_INFO Group.  A Group is an ordered collection of message 
 * segments that can repeat together or be optionally in/excluded together.
 * This Group contains the following elements: </p>
 * 0: PSL (Product/Service Line Item) <b></b><br>
 * 1: ADJ (Adjustment) <b>optional repeating</b><br>
 */
public class EHC_E15_PSL_ITEM_INFO extends AbstractGroup {

	/** 
	 * Creates a new EHC_E15_PSL_ITEM_INFO Group.
	 */
	public EHC_E15_PSL_ITEM_INFO(Group parent, ModelClassFactory factory) {
	   super(parent, factory);
	   try {
	      this.add(PSL.class, true, false);
	      this.add(ADJ.class, false, true);
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error creating EHC_E15_PSL_ITEM_INFO - this is probably a bug in the source code generator.", e);
	   }
	}

	/**
	 * Returns PSL (Product/Service Line Item) - creates it if necessary
	 */
	public PSL getPSL() { 
	   PSL ret = null;
	   try {
	      ret = (PSL)this.get("PSL");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns  first repetition of ADJ (Adjustment) - creates it if necessary
	 */
	public ADJ getADJ() { 
	   ADJ ret = null;
	   try {
	      ret = (ADJ)this.get("ADJ");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns a specific repetition of ADJ
	 * (Adjustment) - creates it if necessary
	 * @throws HL7Exception if the repetition requested is more than one 
	 *     greater than the number of existing repetitions.
	 */
	public ADJ getADJ(int rep) throws HL7Exception { 
	   return (ADJ)this.get("ADJ", rep);
	}

	/** 
	 * Returns the number of existing repetitions of ADJ 
	 */ 
	public int getADJReps() { 
	    int reps = -1; 
	    try { 
	        reps = this.getAll("ADJ").length; 
	    } catch (HL7Exception e) { 
	        String message = "Unexpected error accessing data - this is probably a bug in the source code generator."; 
	        HapiLogFactory.getHapiLog(this.getClass()).error(message, e); 
	        throw new RuntimeException(message);
	    } 
	    return reps; 
	} 

	/**
	 * Inserts a specific repetition of ADJ
	 * (Adjustment)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public void  insertADJ(ADJ structure, int rep) throws HL7Exception { 
	   super.insertRepetition( structure, rep);
	}

	/**
	 * Inserts a specific repetition of ADJ
	 * (Adjustment)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public ADJ insertADJ(int rep) throws HL7Exception { 
	   return (ADJ)super.insertRepetition("ADJ", rep);
	}

	/**
	 * Removes a specific repetition of ADJ
	 * (Adjustment)
	 * @see AbstractGroup#insertremoveRepetition(String, int) 
	 */
	public ADJ removeADJ(int rep) throws HL7Exception { 
	   return (ADJ)super.removeRepetition("ADJ", rep);
	}

}
