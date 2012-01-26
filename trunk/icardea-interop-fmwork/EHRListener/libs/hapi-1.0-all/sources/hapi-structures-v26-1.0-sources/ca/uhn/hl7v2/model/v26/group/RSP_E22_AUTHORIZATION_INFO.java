package ca.uhn.hl7v2.model.v26.group;

import ca.uhn.hl7v2.parser.ModelClassFactory;
import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.log.HapiLogFactory;
import ca.uhn.hl7v2.model.v26.segment.*;

import ca.uhn.hl7v2.model.*;
/**
 * <p>Represents the RSP_E22_AUTHORIZATION_INFO Group.  A Group is an ordered collection of message 
 * segments that can repeat together or be optionally in/excluded together.
 * This Group contains the following elements: </p>
 * 0: IVC (Invoice Segment) <b></b><br>
 * 1: PSG (Product/Service Group) <b></b><br>
 * 2: RSP_E22_PSL_ITEM_INFO (a Group object) <b>repeating</b><br>
 */
public class RSP_E22_AUTHORIZATION_INFO extends AbstractGroup {

	/** 
	 * Creates a new RSP_E22_AUTHORIZATION_INFO Group.
	 */
	public RSP_E22_AUTHORIZATION_INFO(Group parent, ModelClassFactory factory) {
	   super(parent, factory);
	   try {
	      this.add(IVC.class, true, false);
	      this.add(PSG.class, true, false);
	      this.add(RSP_E22_PSL_ITEM_INFO.class, true, true);
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error creating RSP_E22_AUTHORIZATION_INFO - this is probably a bug in the source code generator.", e);
	   }
	}

	/**
	 * Returns IVC (Invoice Segment) - creates it if necessary
	 */
	public IVC getIVC() { 
	   IVC ret = null;
	   try {
	      ret = (IVC)this.get("IVC");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
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
	 * Returns  first repetition of RSP_E22_PSL_ITEM_INFO (a Group object) - creates it if necessary
	 */
	public RSP_E22_PSL_ITEM_INFO getPSL_ITEM_INFO() { 
	   RSP_E22_PSL_ITEM_INFO ret = null;
	   try {
	      ret = (RSP_E22_PSL_ITEM_INFO)this.get("PSL_ITEM_INFO");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns a specific repetition of RSP_E22_PSL_ITEM_INFO
	 * (a Group object) - creates it if necessary
	 * @throws HL7Exception if the repetition requested is more than one 
	 *     greater than the number of existing repetitions.
	 */
	public RSP_E22_PSL_ITEM_INFO getPSL_ITEM_INFO(int rep) throws HL7Exception { 
	   return (RSP_E22_PSL_ITEM_INFO)this.get("PSL_ITEM_INFO", rep);
	}

	/** 
	 * Returns the number of existing repetitions of RSP_E22_PSL_ITEM_INFO 
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
	 * Inserts a specific repetition of RSP_E22_PSL_ITEM_INFO
	 * (a Group object)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public void  insertPSL_ITEM_INFO(RSP_E22_PSL_ITEM_INFO structure, int rep) throws HL7Exception { 
	   super.insertRepetition( structure, rep);
	}

	/**
	 * Inserts a specific repetition of RSP_E22_PSL_ITEM_INFO
	 * (a Group object)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public RSP_E22_PSL_ITEM_INFO insertPSL_ITEM_INFO(int rep) throws HL7Exception { 
	   return (RSP_E22_PSL_ITEM_INFO)super.insertRepetition("PSL_ITEM_INFO", rep);
	}

	/**
	 * Removes a specific repetition of RSP_E22_PSL_ITEM_INFO
	 * (a Group object)
	 * @see AbstractGroup#insertremoveRepetition(String, int) 
	 */
	public RSP_E22_PSL_ITEM_INFO removePSL_ITEM_INFO(int rep) throws HL7Exception { 
	   return (RSP_E22_PSL_ITEM_INFO)super.removeRepetition("PSL_ITEM_INFO", rep);
	}

}
