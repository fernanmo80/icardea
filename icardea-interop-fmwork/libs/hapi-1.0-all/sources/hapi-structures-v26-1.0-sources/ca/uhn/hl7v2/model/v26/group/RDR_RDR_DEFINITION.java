package ca.uhn.hl7v2.model.v26.group;

import ca.uhn.hl7v2.parser.ModelClassFactory;
import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.log.HapiLogFactory;
import ca.uhn.hl7v2.model.v26.segment.*;

import ca.uhn.hl7v2.model.*;
/**
 * <p>Represents the RDR_RDR_DEFINITION Group.  A Group is an ordered collection of message 
 * segments that can repeat together or be optionally in/excluded together.
 * This Group contains the following elements: </p>
 * 0: QRD (Original-Style Query Definition) <b></b><br>
 * 1: QRF (Original style query filter) <b>optional </b><br>
 * 2: RDR_RDR_PATIENT (a Group object) <b>optional </b><br>
 * 3: RDR_RDR_ORDER (a Group object) <b>repeating</b><br>
 * 4: RXR (Pharmacy/Treatment Route) <b>repeating</b><br>
 */
public class RDR_RDR_DEFINITION extends AbstractGroup {

	/** 
	 * Creates a new RDR_RDR_DEFINITION Group.
	 */
	public RDR_RDR_DEFINITION(Group parent, ModelClassFactory factory) {
	   super(parent, factory);
	   try {
	      this.add(QRD.class, true, false);
	      this.add(QRF.class, false, false);
	      this.add(RDR_RDR_PATIENT.class, false, false);
	      this.add(RDR_RDR_ORDER.class, true, true);
	      this.add(RXR.class, true, true);
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error creating RDR_RDR_DEFINITION - this is probably a bug in the source code generator.", e);
	   }
	}

	/**
	 * Returns QRD (Original-Style Query Definition) - creates it if necessary
	 */
	public QRD getQRD() { 
	   QRD ret = null;
	   try {
	      ret = (QRD)this.get("QRD");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns QRF (Original style query filter) - creates it if necessary
	 */
	public QRF getQRF() { 
	   QRF ret = null;
	   try {
	      ret = (QRF)this.get("QRF");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns RDR_RDR_PATIENT (a Group object) - creates it if necessary
	 */
	public RDR_RDR_PATIENT getPATIENT() { 
	   RDR_RDR_PATIENT ret = null;
	   try {
	      ret = (RDR_RDR_PATIENT)this.get("PATIENT");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns  first repetition of RDR_RDR_ORDER (a Group object) - creates it if necessary
	 */
	public RDR_RDR_ORDER getORDER() { 
	   RDR_RDR_ORDER ret = null;
	   try {
	      ret = (RDR_RDR_ORDER)this.get("ORDER");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns a specific repetition of RDR_RDR_ORDER
	 * (a Group object) - creates it if necessary
	 * @throws HL7Exception if the repetition requested is more than one 
	 *     greater than the number of existing repetitions.
	 */
	public RDR_RDR_ORDER getORDER(int rep) throws HL7Exception { 
	   return (RDR_RDR_ORDER)this.get("ORDER", rep);
	}

	/** 
	 * Returns the number of existing repetitions of RDR_RDR_ORDER 
	 */ 
	public int getORDERReps() { 
	    int reps = -1; 
	    try { 
	        reps = this.getAll("ORDER").length; 
	    } catch (HL7Exception e) { 
	        String message = "Unexpected error accessing data - this is probably a bug in the source code generator."; 
	        HapiLogFactory.getHapiLog(this.getClass()).error(message, e); 
	        throw new RuntimeException(message);
	    } 
	    return reps; 
	} 

	/**
	 * Inserts a specific repetition of RDR_RDR_ORDER
	 * (a Group object)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public void  insertORDER(RDR_RDR_ORDER structure, int rep) throws HL7Exception { 
	   super.insertRepetition( structure, rep);
	}

	/**
	 * Inserts a specific repetition of RDR_RDR_ORDER
	 * (a Group object)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public RDR_RDR_ORDER insertORDER(int rep) throws HL7Exception { 
	   return (RDR_RDR_ORDER)super.insertRepetition("ORDER", rep);
	}

	/**
	 * Removes a specific repetition of RDR_RDR_ORDER
	 * (a Group object)
	 * @see AbstractGroup#insertremoveRepetition(String, int) 
	 */
	public RDR_RDR_ORDER removeORDER(int rep) throws HL7Exception { 
	   return (RDR_RDR_ORDER)super.removeRepetition("ORDER", rep);
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

}
