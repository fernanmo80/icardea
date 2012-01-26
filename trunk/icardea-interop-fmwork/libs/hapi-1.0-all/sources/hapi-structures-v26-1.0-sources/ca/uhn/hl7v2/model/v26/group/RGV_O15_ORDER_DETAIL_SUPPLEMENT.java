package ca.uhn.hl7v2.model.v26.group;

import ca.uhn.hl7v2.parser.ModelClassFactory;
import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.log.HapiLogFactory;
import ca.uhn.hl7v2.model.v26.segment.*;

import ca.uhn.hl7v2.model.*;
/**
 * <p>Represents the RGV_O15_ORDER_DETAIL_SUPPLEMENT Group.  A Group is an ordered collection of message 
 * segments that can repeat together or be optionally in/excluded together.
 * This Group contains the following elements: </p>
 * 0: NTE (Notes and Comments) <b>repeating</b><br>
 * 1: RXR (Pharmacy/Treatment Route) <b>repeating</b><br>
 * 2: RGV_O15_COMPONENTS (a Group object) <b>optional repeating</b><br>
 */
public class RGV_O15_ORDER_DETAIL_SUPPLEMENT extends AbstractGroup {

	/** 
	 * Creates a new RGV_O15_ORDER_DETAIL_SUPPLEMENT Group.
	 */
	public RGV_O15_ORDER_DETAIL_SUPPLEMENT(Group parent, ModelClassFactory factory) {
	   super(parent, factory);
	   try {
	      this.add(NTE.class, true, true);
	      this.add(RXR.class, true, true);
	      this.add(RGV_O15_COMPONENTS.class, false, true);
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error creating RGV_O15_ORDER_DETAIL_SUPPLEMENT - this is probably a bug in the source code generator.", e);
	   }
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
	 * Returns  first repetition of RXR (Pharmacy/Treatment Route) - creates it if necessary
	 */
	public RXR getRXR() { 
	   RXR ret = null;
	   try {
	      ret = (RXR)this.get("RXR");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns a specific repetition of RXR
	 * (Pharmacy/Treatment Route) - creates it if necessary
	 * @throws HL7Exception if the repetition requested is more than one 
	 *     greater than the number of existing repetitions.
	 */
	public RXR getRXR(int rep) throws HL7Exception { 
	   return (RXR)this.get("RXR", rep);
	}

	/** 
	 * Returns the number of existing repetitions of RXR 
	 */ 
	public int getRXRReps() { 
	    int reps = -1; 
	    try { 
	        reps = this.getAll("RXR").length; 
	    } catch (HL7Exception e) { 
	        String message = "Unexpected error accessing data - this is probably a bug in the source code generator."; 
	        HapiLogFactory.getHapiLog(this.getClass()).error(message, e); 
	        throw new RuntimeException(message);
	    } 
	    return reps; 
	} 

	/**
	 * Inserts a specific repetition of RXR
	 * (Pharmacy/Treatment Route)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public void  insertRXR(RXR structure, int rep) throws HL7Exception { 
	   super.insertRepetition( structure, rep);
	}

	/**
	 * Inserts a specific repetition of RXR
	 * (Pharmacy/Treatment Route)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public RXR insertRXR(int rep) throws HL7Exception { 
	   return (RXR)super.insertRepetition("RXR", rep);
	}

	/**
	 * Removes a specific repetition of RXR
	 * (Pharmacy/Treatment Route)
	 * @see AbstractGroup#insertremoveRepetition(String, int) 
	 */
	public RXR removeRXR(int rep) throws HL7Exception { 
	   return (RXR)super.removeRepetition("RXR", rep);
	}

	/**
	 * Returns  first repetition of RGV_O15_COMPONENTS (a Group object) - creates it if necessary
	 */
	public RGV_O15_COMPONENTS getCOMPONENTS() { 
	   RGV_O15_COMPONENTS ret = null;
	   try {
	      ret = (RGV_O15_COMPONENTS)this.get("COMPONENTS");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns a specific repetition of RGV_O15_COMPONENTS
	 * (a Group object) - creates it if necessary
	 * @throws HL7Exception if the repetition requested is more than one 
	 *     greater than the number of existing repetitions.
	 */
	public RGV_O15_COMPONENTS getCOMPONENTS(int rep) throws HL7Exception { 
	   return (RGV_O15_COMPONENTS)this.get("COMPONENTS", rep);
	}

	/** 
	 * Returns the number of existing repetitions of RGV_O15_COMPONENTS 
	 */ 
	public int getCOMPONENTSReps() { 
	    int reps = -1; 
	    try { 
	        reps = this.getAll("COMPONENTS").length; 
	    } catch (HL7Exception e) { 
	        String message = "Unexpected error accessing data - this is probably a bug in the source code generator."; 
	        HapiLogFactory.getHapiLog(this.getClass()).error(message, e); 
	        throw new RuntimeException(message);
	    } 
	    return reps; 
	} 

	/**
	 * Inserts a specific repetition of RGV_O15_COMPONENTS
	 * (a Group object)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public void  insertCOMPONENTS(RGV_O15_COMPONENTS structure, int rep) throws HL7Exception { 
	   super.insertRepetition( structure, rep);
	}

	/**
	 * Inserts a specific repetition of RGV_O15_COMPONENTS
	 * (a Group object)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public RGV_O15_COMPONENTS insertCOMPONENTS(int rep) throws HL7Exception { 
	   return (RGV_O15_COMPONENTS)super.insertRepetition("COMPONENTS", rep);
	}

	/**
	 * Removes a specific repetition of RGV_O15_COMPONENTS
	 * (a Group object)
	 * @see AbstractGroup#insertremoveRepetition(String, int) 
	 */
	public RGV_O15_COMPONENTS removeCOMPONENTS(int rep) throws HL7Exception { 
	   return (RGV_O15_COMPONENTS)super.removeRepetition("COMPONENTS", rep);
	}

}