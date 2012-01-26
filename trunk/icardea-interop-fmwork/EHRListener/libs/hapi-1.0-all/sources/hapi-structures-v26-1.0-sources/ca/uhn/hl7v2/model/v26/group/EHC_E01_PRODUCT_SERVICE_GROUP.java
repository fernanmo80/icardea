package ca.uhn.hl7v2.model.v26.group;

import ca.uhn.hl7v2.parser.ModelClassFactory;
import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.log.HapiLogFactory;
import ca.uhn.hl7v2.model.v26.segment.*;

import ca.uhn.hl7v2.model.*;
/**
 * <p>Represents the EHC_E01_PRODUCT_SERVICE_GROUP Group.  A Group is an ordered collection of message 
 * segments that can repeat together or be optionally in/excluded together.
 * This Group contains the following elements: </p>
 * 0: PSG (Product/Service Group) <b></b><br>
 * 1: LOC (Location Identification) <b>optional repeating</b><br>
 * 2: ROL (Role) <b>optional repeating</b><br>
 * 3: EHC_E01_PATIENT_INFO (a Group object) <b>optional repeating</b><br>
 * 4: EHC_E01_PRODUCT_SERVICE_LINE_ITEM (a Group object) <b>repeating</b><br>
 * 5: EHC_E01_PROCEDURE (a Group object) <b>optional repeating</b><br>
 * 6: EHC_E01_INVOICE_PROCESSING (a Group object) <b>optional repeating</b><br>
 */
public class EHC_E01_PRODUCT_SERVICE_GROUP extends AbstractGroup {

	/** 
	 * Creates a new EHC_E01_PRODUCT_SERVICE_GROUP Group.
	 */
	public EHC_E01_PRODUCT_SERVICE_GROUP(Group parent, ModelClassFactory factory) {
	   super(parent, factory);
	   try {
	      this.add(PSG.class, true, false);
	      this.add(LOC.class, false, true);
	      this.add(ROL.class, false, true);
	      this.add(EHC_E01_PATIENT_INFO.class, false, true);
	      this.add(EHC_E01_PRODUCT_SERVICE_LINE_ITEM.class, true, true);
	      this.add(EHC_E01_PROCEDURE.class, false, true);
	      this.add(EHC_E01_INVOICE_PROCESSING.class, false, true);
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error creating EHC_E01_PRODUCT_SERVICE_GROUP - this is probably a bug in the source code generator.", e);
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
	 * Returns  first repetition of LOC (Location Identification) - creates it if necessary
	 */
	public LOC getLOC() { 
	   LOC ret = null;
	   try {
	      ret = (LOC)this.get("LOC");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns a specific repetition of LOC
	 * (Location Identification) - creates it if necessary
	 * @throws HL7Exception if the repetition requested is more than one 
	 *     greater than the number of existing repetitions.
	 */
	public LOC getLOC(int rep) throws HL7Exception { 
	   return (LOC)this.get("LOC", rep);
	}

	/** 
	 * Returns the number of existing repetitions of LOC 
	 */ 
	public int getLOCReps() { 
	    int reps = -1; 
	    try { 
	        reps = this.getAll("LOC").length; 
	    } catch (HL7Exception e) { 
	        String message = "Unexpected error accessing data - this is probably a bug in the source code generator."; 
	        HapiLogFactory.getHapiLog(this.getClass()).error(message, e); 
	        throw new RuntimeException(message);
	    } 
	    return reps; 
	} 

	/**
	 * Inserts a specific repetition of LOC
	 * (Location Identification)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public void  insertLOC(LOC structure, int rep) throws HL7Exception { 
	   super.insertRepetition( structure, rep);
	}

	/**
	 * Inserts a specific repetition of LOC
	 * (Location Identification)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public LOC insertLOC(int rep) throws HL7Exception { 
	   return (LOC)super.insertRepetition("LOC", rep);
	}

	/**
	 * Removes a specific repetition of LOC
	 * (Location Identification)
	 * @see AbstractGroup#insertremoveRepetition(String, int) 
	 */
	public LOC removeLOC(int rep) throws HL7Exception { 
	   return (LOC)super.removeRepetition("LOC", rep);
	}

	/**
	 * Returns  first repetition of ROL (Role) - creates it if necessary
	 */
	public ROL getROL() { 
	   ROL ret = null;
	   try {
	      ret = (ROL)this.get("ROL");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns a specific repetition of ROL
	 * (Role) - creates it if necessary
	 * @throws HL7Exception if the repetition requested is more than one 
	 *     greater than the number of existing repetitions.
	 */
	public ROL getROL(int rep) throws HL7Exception { 
	   return (ROL)this.get("ROL", rep);
	}

	/** 
	 * Returns the number of existing repetitions of ROL 
	 */ 
	public int getROLReps() { 
	    int reps = -1; 
	    try { 
	        reps = this.getAll("ROL").length; 
	    } catch (HL7Exception e) { 
	        String message = "Unexpected error accessing data - this is probably a bug in the source code generator."; 
	        HapiLogFactory.getHapiLog(this.getClass()).error(message, e); 
	        throw new RuntimeException(message);
	    } 
	    return reps; 
	} 

	/**
	 * Inserts a specific repetition of ROL
	 * (Role)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public void  insertROL(ROL structure, int rep) throws HL7Exception { 
	   super.insertRepetition( structure, rep);
	}

	/**
	 * Inserts a specific repetition of ROL
	 * (Role)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public ROL insertROL(int rep) throws HL7Exception { 
	   return (ROL)super.insertRepetition("ROL", rep);
	}

	/**
	 * Removes a specific repetition of ROL
	 * (Role)
	 * @see AbstractGroup#insertremoveRepetition(String, int) 
	 */
	public ROL removeROL(int rep) throws HL7Exception { 
	   return (ROL)super.removeRepetition("ROL", rep);
	}

	/**
	 * Returns  first repetition of EHC_E01_PATIENT_INFO (a Group object) - creates it if necessary
	 */
	public EHC_E01_PATIENT_INFO getPATIENT_INFO() { 
	   EHC_E01_PATIENT_INFO ret = null;
	   try {
	      ret = (EHC_E01_PATIENT_INFO)this.get("PATIENT_INFO");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns a specific repetition of EHC_E01_PATIENT_INFO
	 * (a Group object) - creates it if necessary
	 * @throws HL7Exception if the repetition requested is more than one 
	 *     greater than the number of existing repetitions.
	 */
	public EHC_E01_PATIENT_INFO getPATIENT_INFO(int rep) throws HL7Exception { 
	   return (EHC_E01_PATIENT_INFO)this.get("PATIENT_INFO", rep);
	}

	/** 
	 * Returns the number of existing repetitions of EHC_E01_PATIENT_INFO 
	 */ 
	public int getPATIENT_INFOReps() { 
	    int reps = -1; 
	    try { 
	        reps = this.getAll("PATIENT_INFO").length; 
	    } catch (HL7Exception e) { 
	        String message = "Unexpected error accessing data - this is probably a bug in the source code generator."; 
	        HapiLogFactory.getHapiLog(this.getClass()).error(message, e); 
	        throw new RuntimeException(message);
	    } 
	    return reps; 
	} 

	/**
	 * Inserts a specific repetition of EHC_E01_PATIENT_INFO
	 * (a Group object)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public void  insertPATIENT_INFO(EHC_E01_PATIENT_INFO structure, int rep) throws HL7Exception { 
	   super.insertRepetition( structure, rep);
	}

	/**
	 * Inserts a specific repetition of EHC_E01_PATIENT_INFO
	 * (a Group object)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public EHC_E01_PATIENT_INFO insertPATIENT_INFO(int rep) throws HL7Exception { 
	   return (EHC_E01_PATIENT_INFO)super.insertRepetition("PATIENT_INFO", rep);
	}

	/**
	 * Removes a specific repetition of EHC_E01_PATIENT_INFO
	 * (a Group object)
	 * @see AbstractGroup#insertremoveRepetition(String, int) 
	 */
	public EHC_E01_PATIENT_INFO removePATIENT_INFO(int rep) throws HL7Exception { 
	   return (EHC_E01_PATIENT_INFO)super.removeRepetition("PATIENT_INFO", rep);
	}

	/**
	 * Returns  first repetition of EHC_E01_PRODUCT_SERVICE_LINE_ITEM (a Group object) - creates it if necessary
	 */
	public EHC_E01_PRODUCT_SERVICE_LINE_ITEM getPRODUCT_SERVICE_LINE_ITEM() { 
	   EHC_E01_PRODUCT_SERVICE_LINE_ITEM ret = null;
	   try {
	      ret = (EHC_E01_PRODUCT_SERVICE_LINE_ITEM)this.get("PRODUCT_SERVICE_LINE_ITEM");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns a specific repetition of EHC_E01_PRODUCT_SERVICE_LINE_ITEM
	 * (a Group object) - creates it if necessary
	 * @throws HL7Exception if the repetition requested is more than one 
	 *     greater than the number of existing repetitions.
	 */
	public EHC_E01_PRODUCT_SERVICE_LINE_ITEM getPRODUCT_SERVICE_LINE_ITEM(int rep) throws HL7Exception { 
	   return (EHC_E01_PRODUCT_SERVICE_LINE_ITEM)this.get("PRODUCT_SERVICE_LINE_ITEM", rep);
	}

	/** 
	 * Returns the number of existing repetitions of EHC_E01_PRODUCT_SERVICE_LINE_ITEM 
	 */ 
	public int getPRODUCT_SERVICE_LINE_ITEMReps() { 
	    int reps = -1; 
	    try { 
	        reps = this.getAll("PRODUCT_SERVICE_LINE_ITEM").length; 
	    } catch (HL7Exception e) { 
	        String message = "Unexpected error accessing data - this is probably a bug in the source code generator."; 
	        HapiLogFactory.getHapiLog(this.getClass()).error(message, e); 
	        throw new RuntimeException(message);
	    } 
	    return reps; 
	} 

	/**
	 * Inserts a specific repetition of EHC_E01_PRODUCT_SERVICE_LINE_ITEM
	 * (a Group object)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public void  insertPRODUCT_SERVICE_LINE_ITEM(EHC_E01_PRODUCT_SERVICE_LINE_ITEM structure, int rep) throws HL7Exception { 
	   super.insertRepetition( structure, rep);
	}

	/**
	 * Inserts a specific repetition of EHC_E01_PRODUCT_SERVICE_LINE_ITEM
	 * (a Group object)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public EHC_E01_PRODUCT_SERVICE_LINE_ITEM insertPRODUCT_SERVICE_LINE_ITEM(int rep) throws HL7Exception { 
	   return (EHC_E01_PRODUCT_SERVICE_LINE_ITEM)super.insertRepetition("PRODUCT_SERVICE_LINE_ITEM", rep);
	}

	/**
	 * Removes a specific repetition of EHC_E01_PRODUCT_SERVICE_LINE_ITEM
	 * (a Group object)
	 * @see AbstractGroup#insertremoveRepetition(String, int) 
	 */
	public EHC_E01_PRODUCT_SERVICE_LINE_ITEM removePRODUCT_SERVICE_LINE_ITEM(int rep) throws HL7Exception { 
	   return (EHC_E01_PRODUCT_SERVICE_LINE_ITEM)super.removeRepetition("PRODUCT_SERVICE_LINE_ITEM", rep);
	}

	/**
	 * Returns  first repetition of EHC_E01_PROCEDURE (a Group object) - creates it if necessary
	 */
	public EHC_E01_PROCEDURE getPROCEDURE() { 
	   EHC_E01_PROCEDURE ret = null;
	   try {
	      ret = (EHC_E01_PROCEDURE)this.get("PROCEDURE");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns a specific repetition of EHC_E01_PROCEDURE
	 * (a Group object) - creates it if necessary
	 * @throws HL7Exception if the repetition requested is more than one 
	 *     greater than the number of existing repetitions.
	 */
	public EHC_E01_PROCEDURE getPROCEDURE(int rep) throws HL7Exception { 
	   return (EHC_E01_PROCEDURE)this.get("PROCEDURE", rep);
	}

	/** 
	 * Returns the number of existing repetitions of EHC_E01_PROCEDURE 
	 */ 
	public int getPROCEDUREReps() { 
	    int reps = -1; 
	    try { 
	        reps = this.getAll("PROCEDURE").length; 
	    } catch (HL7Exception e) { 
	        String message = "Unexpected error accessing data - this is probably a bug in the source code generator."; 
	        HapiLogFactory.getHapiLog(this.getClass()).error(message, e); 
	        throw new RuntimeException(message);
	    } 
	    return reps; 
	} 

	/**
	 * Inserts a specific repetition of EHC_E01_PROCEDURE
	 * (a Group object)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public void  insertPROCEDURE(EHC_E01_PROCEDURE structure, int rep) throws HL7Exception { 
	   super.insertRepetition( structure, rep);
	}

	/**
	 * Inserts a specific repetition of EHC_E01_PROCEDURE
	 * (a Group object)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public EHC_E01_PROCEDURE insertPROCEDURE(int rep) throws HL7Exception { 
	   return (EHC_E01_PROCEDURE)super.insertRepetition("PROCEDURE", rep);
	}

	/**
	 * Removes a specific repetition of EHC_E01_PROCEDURE
	 * (a Group object)
	 * @see AbstractGroup#insertremoveRepetition(String, int) 
	 */
	public EHC_E01_PROCEDURE removePROCEDURE(int rep) throws HL7Exception { 
	   return (EHC_E01_PROCEDURE)super.removeRepetition("PROCEDURE", rep);
	}

	/**
	 * Returns  first repetition of EHC_E01_INVOICE_PROCESSING (a Group object) - creates it if necessary
	 */
	public EHC_E01_INVOICE_PROCESSING getINVOICE_PROCESSING() { 
	   EHC_E01_INVOICE_PROCESSING ret = null;
	   try {
	      ret = (EHC_E01_INVOICE_PROCESSING)this.get("INVOICE_PROCESSING");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns a specific repetition of EHC_E01_INVOICE_PROCESSING
	 * (a Group object) - creates it if necessary
	 * @throws HL7Exception if the repetition requested is more than one 
	 *     greater than the number of existing repetitions.
	 */
	public EHC_E01_INVOICE_PROCESSING getINVOICE_PROCESSING(int rep) throws HL7Exception { 
	   return (EHC_E01_INVOICE_PROCESSING)this.get("INVOICE_PROCESSING", rep);
	}

	/** 
	 * Returns the number of existing repetitions of EHC_E01_INVOICE_PROCESSING 
	 */ 
	public int getINVOICE_PROCESSINGReps() { 
	    int reps = -1; 
	    try { 
	        reps = this.getAll("INVOICE_PROCESSING").length; 
	    } catch (HL7Exception e) { 
	        String message = "Unexpected error accessing data - this is probably a bug in the source code generator."; 
	        HapiLogFactory.getHapiLog(this.getClass()).error(message, e); 
	        throw new RuntimeException(message);
	    } 
	    return reps; 
	} 

	/**
	 * Inserts a specific repetition of EHC_E01_INVOICE_PROCESSING
	 * (a Group object)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public void  insertINVOICE_PROCESSING(EHC_E01_INVOICE_PROCESSING structure, int rep) throws HL7Exception { 
	   super.insertRepetition( structure, rep);
	}

	/**
	 * Inserts a specific repetition of EHC_E01_INVOICE_PROCESSING
	 * (a Group object)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public EHC_E01_INVOICE_PROCESSING insertINVOICE_PROCESSING(int rep) throws HL7Exception { 
	   return (EHC_E01_INVOICE_PROCESSING)super.insertRepetition("INVOICE_PROCESSING", rep);
	}

	/**
	 * Removes a specific repetition of EHC_E01_INVOICE_PROCESSING
	 * (a Group object)
	 * @see AbstractGroup#insertremoveRepetition(String, int) 
	 */
	public EHC_E01_INVOICE_PROCESSING removeINVOICE_PROCESSING(int rep) throws HL7Exception { 
	   return (EHC_E01_INVOICE_PROCESSING)super.removeRepetition("INVOICE_PROCESSING", rep);
	}

}
