package ca.uhn.hl7v2.model.v26.group;

import ca.uhn.hl7v2.parser.ModelClassFactory;
import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.log.HapiLogFactory;
import ca.uhn.hl7v2.model.v26.segment.*;

import ca.uhn.hl7v2.model.*;
/**
 * <p>Represents the EHC_E01_INVOICE_PROCESSING Group.  A Group is an ordered collection of message 
 * segments that can repeat together or be optionally in/excluded together.
 * This Group contains the following elements: </p>
 * 0: IPR (Invoice Processing Results) <b></b><br>
 */
public class EHC_E01_INVOICE_PROCESSING extends AbstractGroup {

	/** 
	 * Creates a new EHC_E01_INVOICE_PROCESSING Group.
	 */
	public EHC_E01_INVOICE_PROCESSING(Group parent, ModelClassFactory factory) {
	   super(parent, factory);
	   try {
	      this.add(IPR.class, true, false);
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error creating EHC_E01_INVOICE_PROCESSING - this is probably a bug in the source code generator.", e);
	   }
	}

	/**
	 * Returns IPR (Invoice Processing Results) - creates it if necessary
	 */
	public IPR getIPR() { 
	   IPR ret = null;
	   try {
	      ret = (IPR)this.get("IPR");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

}
