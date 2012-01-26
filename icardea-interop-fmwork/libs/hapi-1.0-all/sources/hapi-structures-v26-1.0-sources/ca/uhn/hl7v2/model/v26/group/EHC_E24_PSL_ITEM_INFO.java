package ca.uhn.hl7v2.model.v26.group;

import ca.uhn.hl7v2.parser.ModelClassFactory;
import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.log.HapiLogFactory;
import ca.uhn.hl7v2.model.v26.segment.*;

import ca.uhn.hl7v2.model.*;
/**
 * <p>Represents the EHC_E24_PSL_ITEM_INFO Group.  A Group is an ordered collection of message 
 * segments that can repeat together or be optionally in/excluded together.
 * This Group contains the following elements: </p>
 * 0: PSL (Product/Service Line Item) <b></b><br>
 * 1: AUT (Authorization Information) <b>optional </b><br>
 * 2: EHC_E24_PAYER_ADJUSTMENT (a Group object) <b>optional repeating</b><br>
 */
public class EHC_E24_PSL_ITEM_INFO extends AbstractGroup {

	/** 
	 * Creates a new EHC_E24_PSL_ITEM_INFO Group.
	 */
	public EHC_E24_PSL_ITEM_INFO(Group parent, ModelClassFactory factory) {
	   super(parent, factory);
	   try {
	      this.add(PSL.class, true, false);
	      this.add(AUT.class, false, false);
	      this.add(EHC_E24_PAYER_ADJUSTMENT.class, false, true);
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error creating EHC_E24_PSL_ITEM_INFO - this is probably a bug in the source code generator.", e);
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
	 * Returns AUT (Authorization Information) - creates it if necessary
	 */
	public AUT getAUT() { 
	   AUT ret = null;
	   try {
	      ret = (AUT)this.get("AUT");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns  first repetition of EHC_E24_PAYER_ADJUSTMENT (a Group object) - creates it if necessary
	 */
	public EHC_E24_PAYER_ADJUSTMENT getPAYER_ADJUSTMENT() { 
	   EHC_E24_PAYER_ADJUSTMENT ret = null;
	   try {
	      ret = (EHC_E24_PAYER_ADJUSTMENT)this.get("PAYER_ADJUSTMENT");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns a specific repetition of EHC_E24_PAYER_ADJUSTMENT
	 * (a Group object) - creates it if necessary
	 * @throws HL7Exception if the repetition requested is more than one 
	 *     greater than the number of existing repetitions.
	 */
	public EHC_E24_PAYER_ADJUSTMENT getPAYER_ADJUSTMENT(int rep) throws HL7Exception { 
	   return (EHC_E24_PAYER_ADJUSTMENT)this.get("PAYER_ADJUSTMENT", rep);
	}

	/** 
	 * Returns the number of existing repetitions of EHC_E24_PAYER_ADJUSTMENT 
	 */ 
	public int getPAYER_ADJUSTMENTReps() { 
	    int reps = -1; 
	    try { 
	        reps = this.getAll("PAYER_ADJUSTMENT").length; 
	    } catch (HL7Exception e) { 
	        String message = "Unexpected error accessing data - this is probably a bug in the source code generator."; 
	        HapiLogFactory.getHapiLog(this.getClass()).error(message, e); 
	        throw new RuntimeException(message);
	    } 
	    return reps; 
	} 

	/**
	 * Inserts a specific repetition of EHC_E24_PAYER_ADJUSTMENT
	 * (a Group object)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public void  insertPAYER_ADJUSTMENT(EHC_E24_PAYER_ADJUSTMENT structure, int rep) throws HL7Exception { 
	   super.insertRepetition( structure, rep);
	}

	/**
	 * Inserts a specific repetition of EHC_E24_PAYER_ADJUSTMENT
	 * (a Group object)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public EHC_E24_PAYER_ADJUSTMENT insertPAYER_ADJUSTMENT(int rep) throws HL7Exception { 
	   return (EHC_E24_PAYER_ADJUSTMENT)super.insertRepetition("PAYER_ADJUSTMENT", rep);
	}

	/**
	 * Removes a specific repetition of EHC_E24_PAYER_ADJUSTMENT
	 * (a Group object)
	 * @see AbstractGroup#insertremoveRepetition(String, int) 
	 */
	public EHC_E24_PAYER_ADJUSTMENT removePAYER_ADJUSTMENT(int rep) throws HL7Exception { 
	   return (EHC_E24_PAYER_ADJUSTMENT)super.removeRepetition("PAYER_ADJUSTMENT", rep);
	}

}
