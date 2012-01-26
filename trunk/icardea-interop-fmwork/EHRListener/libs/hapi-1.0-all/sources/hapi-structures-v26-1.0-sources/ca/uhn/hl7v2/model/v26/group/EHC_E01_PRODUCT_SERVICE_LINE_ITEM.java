package ca.uhn.hl7v2.model.v26.group;

import ca.uhn.hl7v2.parser.ModelClassFactory;
import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.log.HapiLogFactory;
import ca.uhn.hl7v2.model.v26.segment.*;

import ca.uhn.hl7v2.model.*;
/**
 * <p>Represents the EHC_E01_PRODUCT_SERVICE_LINE_ITEM Group.  A Group is an ordered collection of message 
 * segments that can repeat together or be optionally in/excluded together.
 * This Group contains the following elements: </p>
 * 0: PSL (Product/Service Line Item) <b></b><br>
 * 1: NTE (Notes and Comments) <b>optional repeating</b><br>
 * 2: ADJ (Adjustment) <b>optional repeating</b><br>
 * 3: AUT (Authorization Information) <b>optional </b><br>
 * 4: LOC (Location Identification) <b>optional repeating</b><br>
 * 5: ROL (Role) <b>optional repeating</b><br>
 */
public class EHC_E01_PRODUCT_SERVICE_LINE_ITEM extends AbstractGroup {

	/** 
	 * Creates a new EHC_E01_PRODUCT_SERVICE_LINE_ITEM Group.
	 */
	public EHC_E01_PRODUCT_SERVICE_LINE_ITEM(Group parent, ModelClassFactory factory) {
	   super(parent, factory);
	   try {
	      this.add(PSL.class, true, false);
	      this.add(NTE.class, false, true);
	      this.add(ADJ.class, false, true);
	      this.add(AUT.class, false, false);
	      this.add(LOC.class, false, true);
	      this.add(ROL.class, false, true);
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error creating EHC_E01_PRODUCT_SERVICE_LINE_ITEM - this is probably a bug in the source code generator.", e);
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
	 * Returns  first repetition of NTE (Notes and Comments) - creates it if necessary
	 */
	public NTE getNTE() { 
	   NTE ret = null;
	   try {
	      ret = (NTE)this.get("NTE");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns a specific repetition of NTE
	 * (Notes and Comments) - creates it if necessary
	 * @throws HL7Exception if the repetition requested is more than one 
	 *     greater than the number of existing repetitions.
	 */
	public NTE getNTE(int rep) throws HL7Exception { 
	   return (NTE)this.get("NTE", rep);
	}

	/** 
	 * Returns the number of existing repetitions of NTE 
	 */ 
	public int getNTEReps() { 
	    int reps = -1; 
	    try { 
	        reps = this.getAll("NTE").length; 
	    } catch (HL7Exception e) { 
	        String message = "Unexpected error accessing data - this is probably a bug in the source code generator."; 
	        HapiLogFactory.getHapiLog(this.getClass()).error(message, e); 
	        throw new RuntimeException(message);
	    } 
	    return reps; 
	} 

	/**
	 * Inserts a specific repetition of NTE
	 * (Notes and Comments)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public void  insertNTE(NTE structure, int rep) throws HL7Exception { 
	   super.insertRepetition( structure, rep);
	}

	/**
	 * Inserts a specific repetition of NTE
	 * (Notes and Comments)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public NTE insertNTE(int rep) throws HL7Exception { 
	   return (NTE)super.insertRepetition("NTE", rep);
	}

	/**
	 * Removes a specific repetition of NTE
	 * (Notes and Comments)
	 * @see AbstractGroup#insertremoveRepetition(String, int) 
	 */
	public NTE removeNTE(int rep) throws HL7Exception { 
	   return (NTE)super.removeRepetition("NTE", rep);
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

}
