package ca.uhn.hl7v2.model.v26.group;

import ca.uhn.hl7v2.parser.ModelClassFactory;
import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.log.HapiLogFactory;
import ca.uhn.hl7v2.model.v26.segment.*;

import ca.uhn.hl7v2.model.*;
/**
 * <p>Represents the RDS_O13_ORDER_DETAIL_SUPPLEMENT Group.  A Group is an ordered collection of message 
 * segments that can repeat together or be optionally in/excluded together.
 * This Group contains the following elements: </p>
 * 0: NTE (Notes and Comments) <b>repeating</b><br>
 * 1: RXR (Pharmacy/Treatment Route) <b>repeating</b><br>
 * 2: RDS_O13_COMPONENT (a Group object) <b>optional repeating</b><br>
 */
public class RDS_O13_ORDER_DETAIL_SUPPLEMENT extends AbstractGroup {

	/** 
	 * Creates a new RDS_O13_ORDER_DETAIL_SUPPLEMENT Group.
	 */
	public RDS_O13_ORDER_DETAIL_SUPPLEMENT(Group parent, ModelClassFactory factory) {
	   super(parent, factory);
	   try {
	      this.add(NTE.class, true, true);
	      this.add(RXR.class, true, true);
	      this.add(RDS_O13_COMPONENT.class, false, true);
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error creating RDS_O13_ORDER_DETAIL_SUPPLEMENT - this is probably a bug in the source code generator.", e);
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
	 * Returns  first repetition of RDS_O13_COMPONENT (a Group object) - creates it if necessary
	 */
	public RDS_O13_COMPONENT getCOMPONENT() { 
	   RDS_O13_COMPONENT ret = null;
	   try {
	      ret = (RDS_O13_COMPONENT)this.get("COMPONENT");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns a specific repetition of RDS_O13_COMPONENT
	 * (a Group object) - creates it if necessary
	 * @throws HL7Exception if the repetition requested is more than one 
	 *     greater than the number of existing repetitions.
	 */
	public RDS_O13_COMPONENT getCOMPONENT(int rep) throws HL7Exception { 
	   return (RDS_O13_COMPONENT)this.get("COMPONENT", rep);
	}

	/** 
	 * Returns the number of existing repetitions of RDS_O13_COMPONENT 
	 */ 
	public int getCOMPONENTReps() { 
	    int reps = -1; 
	    try { 
	        reps = this.getAll("COMPONENT").length; 
	    } catch (HL7Exception e) { 
	        String message = "Unexpected error accessing data - this is probably a bug in the source code generator."; 
	        HapiLogFactory.getHapiLog(this.getClass()).error(message, e); 
	        throw new RuntimeException(message);
	    } 
	    return reps; 
	} 

	/**
	 * Inserts a specific repetition of RDS_O13_COMPONENT
	 * (a Group object)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public void  insertCOMPONENT(RDS_O13_COMPONENT structure, int rep) throws HL7Exception { 
	   super.insertRepetition( structure, rep);
	}

	/**
	 * Inserts a specific repetition of RDS_O13_COMPONENT
	 * (a Group object)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public RDS_O13_COMPONENT insertCOMPONENT(int rep) throws HL7Exception { 
	   return (RDS_O13_COMPONENT)super.insertRepetition("COMPONENT", rep);
	}

	/**
	 * Removes a specific repetition of RDS_O13_COMPONENT
	 * (a Group object)
	 * @see AbstractGroup#insertremoveRepetition(String, int) 
	 */
	public RDS_O13_COMPONENT removeCOMPONENT(int rep) throws HL7Exception { 
	   return (RDS_O13_COMPONENT)super.removeRepetition("COMPONENT", rep);
	}

}
