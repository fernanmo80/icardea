package ca.uhn.hl7v2.model.v26.group;

import ca.uhn.hl7v2.parser.ModelClassFactory;
import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.log.HapiLogFactory;
import ca.uhn.hl7v2.model.v26.segment.*;

import ca.uhn.hl7v2.model.*;
/**
 * <p>Represents the EHC_E13_RESPONSE Group.  A Group is an ordered collection of message 
 * segments that can repeat together or be optionally in/excluded together.
 * This Group contains the following elements: </p>
 * 0: OBX (Observation/Result) <b></b><br>
 * 1: NTE (Notes and Comments) <b>optional </b><br>
 * 2: TXA (Transcription Document Header) <b>optional </b><br>
 */
public class EHC_E13_RESPONSE extends AbstractGroup {

	/** 
	 * Creates a new EHC_E13_RESPONSE Group.
	 */
	public EHC_E13_RESPONSE(Group parent, ModelClassFactory factory) {
	   super(parent, factory);
	   try {
	      this.add(OBX.class, true, false);
	      this.add(NTE.class, false, false);
	      this.add(TXA.class, false, false);
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error creating EHC_E13_RESPONSE - this is probably a bug in the source code generator.", e);
	   }
	}

	/**
	 * Returns OBX (Observation/Result) - creates it if necessary
	 */
	public OBX getOBX() { 
	   OBX ret = null;
	   try {
	      ret = (OBX)this.get("OBX");
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
	 * Returns TXA (Transcription Document Header) - creates it if necessary
	 */
	public TXA getTXA() { 
	   TXA ret = null;
	   try {
	      ret = (TXA)this.get("TXA");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

}
