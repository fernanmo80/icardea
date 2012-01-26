package ca.uhn.hl7v2.model.v26.group;

import ca.uhn.hl7v2.parser.ModelClassFactory;
import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.log.HapiLogFactory;
import ca.uhn.hl7v2.model.v26.segment.*;

import ca.uhn.hl7v2.model.*;
/**
 * <p>Represents the EHC_E13_REQUEST Group.  A Group is an ordered collection of message 
 * segments that can repeat together or be optionally in/excluded together.
 * This Group contains the following elements: </p>
 * 0: CTD (Contact Data) <b>optional </b><br>
 * 1: OBR (Observation Request) <b></b><br>
 * 2: NTE (Notes and Comments) <b>optional </b><br>
 * 3: EHC_E13_RESPONSE (a Group object) <b>repeating</b><br>
 */
public class EHC_E13_REQUEST extends AbstractGroup {

	/** 
	 * Creates a new EHC_E13_REQUEST Group.
	 */
	public EHC_E13_REQUEST(Group parent, ModelClassFactory factory) {
	   super(parent, factory);
	   try {
	      this.add(CTD.class, false, false);
	      this.add(OBR.class, true, false);
	      this.add(NTE.class, false, false);
	      this.add(EHC_E13_RESPONSE.class, true, true);
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error creating EHC_E13_REQUEST - this is probably a bug in the source code generator.", e);
	   }
	}

	/**
	 * Returns CTD (Contact Data) - creates it if necessary
	 */
	public CTD getCTD() { 
	   CTD ret = null;
	   try {
	      ret = (CTD)this.get("CTD");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns OBR (Observation Request) - creates it if necessary
	 */
	public OBR getOBR() { 
	   OBR ret = null;
	   try {
	      ret = (OBR)this.get("OBR");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns NTE (Notes and Comments) - creates it if necessary
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
	 * Returns  first repetition of EHC_E13_RESPONSE (a Group object) - creates it if necessary
	 */
	public EHC_E13_RESPONSE getRESPONSE() { 
	   EHC_E13_RESPONSE ret = null;
	   try {
	      ret = (EHC_E13_RESPONSE)this.get("RESPONSE");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns a specific repetition of EHC_E13_RESPONSE
	 * (a Group object) - creates it if necessary
	 * @throws HL7Exception if the repetition requested is more than one 
	 *     greater than the number of existing repetitions.
	 */
	public EHC_E13_RESPONSE getRESPONSE(int rep) throws HL7Exception { 
	   return (EHC_E13_RESPONSE)this.get("RESPONSE", rep);
	}

	/** 
	 * Returns the number of existing repetitions of EHC_E13_RESPONSE 
	 */ 
	public int getRESPONSEReps() { 
	    int reps = -1; 
	    try { 
	        reps = this.getAll("RESPONSE").length; 
	    } catch (HL7Exception e) { 
	        String message = "Unexpected error accessing data - this is probably a bug in the source code generator."; 
	        HapiLogFactory.getHapiLog(this.getClass()).error(message, e); 
	        throw new RuntimeException(message);
	    } 
	    return reps; 
	} 

	/**
	 * Inserts a specific repetition of EHC_E13_RESPONSE
	 * (a Group object)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public void  insertRESPONSE(EHC_E13_RESPONSE structure, int rep) throws HL7Exception { 
	   super.insertRepetition( structure, rep);
	}

	/**
	 * Inserts a specific repetition of EHC_E13_RESPONSE
	 * (a Group object)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public EHC_E13_RESPONSE insertRESPONSE(int rep) throws HL7Exception { 
	   return (EHC_E13_RESPONSE)super.insertRepetition("RESPONSE", rep);
	}

	/**
	 * Removes a specific repetition of EHC_E13_RESPONSE
	 * (a Group object)
	 * @see AbstractGroup#insertremoveRepetition(String, int) 
	 */
	public EHC_E13_RESPONSE removeRESPONSE(int rep) throws HL7Exception { 
	   return (EHC_E13_RESPONSE)super.removeRepetition("RESPONSE", rep);
	}

}
