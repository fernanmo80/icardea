package ca.uhn.hl7v2.model.v26.group;

import ca.uhn.hl7v2.parser.ModelClassFactory;
import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.log.HapiLogFactory;
import ca.uhn.hl7v2.model.v26.segment.*;

import ca.uhn.hl7v2.model.*;
/**
 * <p>Represents the EHC_E04_PRODUCT_SERVICE_GROUP Group.  A Group is an ordered collection of message 
 * segments that can repeat together or be optionally in/excluded together.
 * This Group contains the following elements: </p>
 * 0: PSG (Product/Service Group) <b></b><br>
 * 1: PSL (Product/Service Line Item) <b>optional repeating</b><br>
 */
public class EHC_E04_PRODUCT_SERVICE_GROUP extends AbstractGroup {

	/** 
	 * Creates a new EHC_E04_PRODUCT_SERVICE_GROUP Group.
	 */
	public EHC_E04_PRODUCT_SERVICE_GROUP(Group parent, ModelClassFactory factory) {
	   super(parent, factory);
	   try {
	      this.add(PSG.class, true, false);
	      this.add(PSL.class, false, true);
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error creating EHC_E04_PRODUCT_SERVICE_GROUP - this is probably a bug in the source code generator.", e);
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
	 * Returns  first repetition of PSL (Product/Service Line Item) - creates it if necessary
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
	 * Returns a specific repetition of PSL
	 * (Product/Service Line Item) - creates it if necessary
	 * @throws HL7Exception if the repetition requested is more than one 
	 *     greater than the number of existing repetitions.
	 */
	public PSL getPSL(int rep) throws HL7Exception { 
	   return (PSL)this.get("PSL", rep);
	}

	/** 
	 * Returns the number of existing repetitions of PSL 
	 */ 
	public int getPSLReps() { 
	    int reps = -1; 
	    try { 
	        reps = this.getAll("PSL").length; 
	    } catch (HL7Exception e) { 
	        String message = "Unexpected error accessing data - this is probably a bug in the source code generator."; 
	        HapiLogFactory.getHapiLog(this.getClass()).error(message, e); 
	        throw new RuntimeException(message);
	    } 
	    return reps; 
	} 

	/**
	 * Inserts a specific repetition of PSL
	 * (Product/Service Line Item)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public void  insertPSL(PSL structure, int rep) throws HL7Exception { 
	   super.insertRepetition( structure, rep);
	}

	/**
	 * Inserts a specific repetition of PSL
	 * (Product/Service Line Item)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public PSL insertPSL(int rep) throws HL7Exception { 
	   return (PSL)super.insertRepetition("PSL", rep);
	}

	/**
	 * Removes a specific repetition of PSL
	 * (Product/Service Line Item)
	 * @see AbstractGroup#insertremoveRepetition(String, int) 
	 */
	public PSL removePSL(int rep) throws HL7Exception { 
	   return (PSL)super.removeRepetition("PSL", rep);
	}

}
