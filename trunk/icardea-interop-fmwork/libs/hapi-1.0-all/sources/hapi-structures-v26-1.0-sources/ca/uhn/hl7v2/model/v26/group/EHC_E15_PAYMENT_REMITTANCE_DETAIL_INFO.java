package ca.uhn.hl7v2.model.v26.group;

import ca.uhn.hl7v2.parser.ModelClassFactory;
import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.log.HapiLogFactory;
import ca.uhn.hl7v2.model.v26.segment.*;

import ca.uhn.hl7v2.model.*;
/**
 * <p>Represents the EHC_E15_PAYMENT_REMITTANCE_DETAIL_INFO Group.  A Group is an ordered collection of message 
 * segments that can repeat together or be optionally in/excluded together.
 * This Group contains the following elements: </p>
 * 0: IPR (Invoice Processing Results) <b></b><br>
 * 1: IVC (Invoice Segment) <b></b><br>
 * 2: EHC_E15_PRODUCT_SERVICE_SECTION (a Group object) <b>repeating</b><br>
 */
public class EHC_E15_PAYMENT_REMITTANCE_DETAIL_INFO extends AbstractGroup {

	/** 
	 * Creates a new EHC_E15_PAYMENT_REMITTANCE_DETAIL_INFO Group.
	 */
	public EHC_E15_PAYMENT_REMITTANCE_DETAIL_INFO(Group parent, ModelClassFactory factory) {
	   super(parent, factory);
	   try {
	      this.add(IPR.class, true, false);
	      this.add(IVC.class, true, false);
	      this.add(EHC_E15_PRODUCT_SERVICE_SECTION.class, true, true);
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error creating EHC_E15_PAYMENT_REMITTANCE_DETAIL_INFO - this is probably a bug in the source code generator.", e);
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
	 * Returns  first repetition of EHC_E15_PRODUCT_SERVICE_SECTION (a Group object) - creates it if necessary
	 */
	public EHC_E15_PRODUCT_SERVICE_SECTION getPRODUCT_SERVICE_SECTION() { 
	   EHC_E15_PRODUCT_SERVICE_SECTION ret = null;
	   try {
	      ret = (EHC_E15_PRODUCT_SERVICE_SECTION)this.get("PRODUCT_SERVICE_SECTION");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns a specific repetition of EHC_E15_PRODUCT_SERVICE_SECTION
	 * (a Group object) - creates it if necessary
	 * @throws HL7Exception if the repetition requested is more than one 
	 *     greater than the number of existing repetitions.
	 */
	public EHC_E15_PRODUCT_SERVICE_SECTION getPRODUCT_SERVICE_SECTION(int rep) throws HL7Exception { 
	   return (EHC_E15_PRODUCT_SERVICE_SECTION)this.get("PRODUCT_SERVICE_SECTION", rep);
	}

	/** 
	 * Returns the number of existing repetitions of EHC_E15_PRODUCT_SERVICE_SECTION 
	 */ 
	public int getPRODUCT_SERVICE_SECTIONReps() { 
	    int reps = -1; 
	    try { 
	        reps = this.getAll("PRODUCT_SERVICE_SECTION").length; 
	    } catch (HL7Exception e) { 
	        String message = "Unexpected error accessing data - this is probably a bug in the source code generator."; 
	        HapiLogFactory.getHapiLog(this.getClass()).error(message, e); 
	        throw new RuntimeException(message);
	    } 
	    return reps; 
	} 

	/**
	 * Inserts a specific repetition of EHC_E15_PRODUCT_SERVICE_SECTION
	 * (a Group object)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public void  insertPRODUCT_SERVICE_SECTION(EHC_E15_PRODUCT_SERVICE_SECTION structure, int rep) throws HL7Exception { 
	   super.insertRepetition( structure, rep);
	}

	/**
	 * Inserts a specific repetition of EHC_E15_PRODUCT_SERVICE_SECTION
	 * (a Group object)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public EHC_E15_PRODUCT_SERVICE_SECTION insertPRODUCT_SERVICE_SECTION(int rep) throws HL7Exception { 
	   return (EHC_E15_PRODUCT_SERVICE_SECTION)super.insertRepetition("PRODUCT_SERVICE_SECTION", rep);
	}

	/**
	 * Removes a specific repetition of EHC_E15_PRODUCT_SERVICE_SECTION
	 * (a Group object)
	 * @see AbstractGroup#insertremoveRepetition(String, int) 
	 */
	public EHC_E15_PRODUCT_SERVICE_SECTION removePRODUCT_SERVICE_SECTION(int rep) throws HL7Exception { 
	   return (EHC_E15_PRODUCT_SERVICE_SECTION)super.removeRepetition("PRODUCT_SERVICE_SECTION", rep);
	}

}
