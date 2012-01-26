package ca.uhn.hl7v2.model.v26.group;

import ca.uhn.hl7v2.parser.ModelClassFactory;
import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.log.HapiLogFactory;
import ca.uhn.hl7v2.model.v26.segment.*;

import ca.uhn.hl7v2.model.*;
/**
 * <p>Represents the RSP_E22_PSL_ITEM_INFO Group.  A Group is an ordered collection of message 
 * segments that can repeat together or be optionally in/excluded together.
 * This Group contains the following elements: </p>
 * 0: PSL (Product/Service Line Item) <b></b><br>
 */
public class RSP_E22_PSL_ITEM_INFO extends AbstractGroup {

	/** 
	 * Creates a new RSP_E22_PSL_ITEM_INFO Group.
	 */
	public RSP_E22_PSL_ITEM_INFO(Group parent, ModelClassFactory factory) {
	   super(parent, factory);
	   try {
	      this.add(PSL.class, true, false);
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error creating RSP_E22_PSL_ITEM_INFO - this is probably a bug in the source code generator.", e);
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

}
