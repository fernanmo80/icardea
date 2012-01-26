package ca.uhn.hl7v2.model.v26.message;

import ca.uhn.log.HapiLogFactory;
import ca.uhn.hl7v2.model.v26.group.*;

import ca.uhn.hl7v2.model.v26.segment.*;

import ca.uhn.hl7v2.HL7Exception;

import ca.uhn.hl7v2.parser.ModelClassFactory;

import ca.uhn.hl7v2.parser.DefaultModelClassFactory;

import ca.uhn.hl7v2.model.AbstractMessage;

/**
 * <p>Represents a EAR_U08 message structure (see chapter 13.3.8). This structure contains the 
 * following elements: </p>
 * 0: MSH (Message Header) <b></b><br>
 * 1: SFT (Software Segment) <b>optional repeating</b><br>
 * 2: UAC (User Authentication Credential Segment) <b>optional </b><br>
 * 3: EQU (Equipment Detail) <b></b><br>
 * 4: EAR_U08_COMMAND_RESPONSE (a Group object) <b>repeating</b><br>
 * 5: ROL (Role) <b>optional </b><br>
 */
public class EAR_U08 extends AbstractMessage  {

	/** 
	 * Creates a new EAR_U08 Group with custom ModelClassFactory.
	 */
	public EAR_U08(ModelClassFactory factory) {
	   super(factory);
	   init(factory);
	}

	/**
	 * Creates a new EAR_U08 Group with DefaultModelClassFactory. 
	 */ 
	public EAR_U08() { 
	   super(new DefaultModelClassFactory());
	   init(new DefaultModelClassFactory());
	}

	private void init(ModelClassFactory factory) {
	   try {
	      this.add(MSH.class, true, false);
	      this.add(SFT.class, false, true);
	      this.add(UAC.class, false, false);
	      this.add(EQU.class, true, false);
	      this.add(EAR_U08_COMMAND_RESPONSE.class, true, true);
	      this.add(ROL.class, false, false);
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error creating EAR_U08 - this is probably a bug in the source code generator.", e);
	   }
	}

	/** {@inheritDoc} */
	public String getVersion() {
	   return "2.6";
	}

	/**
	 * Returns MSH (Message Header) - creates it if necessary
	 */
	public MSH getMSH() { 
	   MSH ret = null;
	   try {
	      ret = (MSH)this.get("MSH");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns  first repetition of SFT (Software Segment) - creates it if necessary
	 */
	public SFT getSFT() { 
	   SFT ret = null;
	   try {
	      ret = (SFT)this.get("SFT");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns a specific repetition of SFT
	 * (Software Segment) - creates it if necessary
	 * @throws HL7Exception if the repetition requested is more than one 
	 *     greater than the number of existing repetitions.
	 */
	public SFT getSFT(int rep) throws HL7Exception { 
	   return (SFT)this.get("SFT", rep);
	}

	/** 
	 * Returns the number of existing repetitions of SFT 
	 */ 
	public int getSFTReps() { 
	    int reps = -1; 
	    try { 
	        reps = this.getAll("SFT").length; 
	    } catch (HL7Exception e) { 
	        String message = "Unexpected error accessing data - this is probably a bug in the source code generator."; 
	        HapiLogFactory.getHapiLog(this.getClass()).error(message, e); 
	        throw new RuntimeException(message);
	    } 
	    return reps; 
	} 

	/**
	 * Inserts a specific repetition of SFT
	 * (Software Segment)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public void  insertSFT(SFT structure, int rep) throws HL7Exception { 
	   super.insertRepetition( structure, rep);
	}

	/**
	 * Inserts a specific repetition of SFT
	 * (Software Segment)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public SFT insertSFT(int rep) throws HL7Exception { 
	   return (SFT)super.insertRepetition("SFT", rep);
	}

	/**
	 * Removes a specific repetition of SFT
	 * (Software Segment)
	 * @see AbstractGroup#insertremoveRepetition(String, int) 
	 */
	public SFT removeSFT(int rep) throws HL7Exception { 
	   return (SFT)super.removeRepetition("SFT", rep);
	}

	/**
	 * Returns UAC (User Authentication Credential Segment) - creates it if necessary
	 */
	public UAC getUAC() { 
	   UAC ret = null;
	   try {
	      ret = (UAC)this.get("UAC");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns EQU (Equipment Detail) - creates it if necessary
	 */
	public EQU getEQU() { 
	   EQU ret = null;
	   try {
	      ret = (EQU)this.get("EQU");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns  first repetition of EAR_U08_COMMAND_RESPONSE (a Group object) - creates it if necessary
	 */
	public EAR_U08_COMMAND_RESPONSE getCOMMAND_RESPONSE() { 
	   EAR_U08_COMMAND_RESPONSE ret = null;
	   try {
	      ret = (EAR_U08_COMMAND_RESPONSE)this.get("COMMAND_RESPONSE");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns a specific repetition of EAR_U08_COMMAND_RESPONSE
	 * (a Group object) - creates it if necessary
	 * @throws HL7Exception if the repetition requested is more than one 
	 *     greater than the number of existing repetitions.
	 */
	public EAR_U08_COMMAND_RESPONSE getCOMMAND_RESPONSE(int rep) throws HL7Exception { 
	   return (EAR_U08_COMMAND_RESPONSE)this.get("COMMAND_RESPONSE", rep);
	}

	/** 
	 * Returns the number of existing repetitions of EAR_U08_COMMAND_RESPONSE 
	 */ 
	public int getCOMMAND_RESPONSEReps() { 
	    int reps = -1; 
	    try { 
	        reps = this.getAll("COMMAND_RESPONSE").length; 
	    } catch (HL7Exception e) { 
	        String message = "Unexpected error accessing data - this is probably a bug in the source code generator."; 
	        HapiLogFactory.getHapiLog(this.getClass()).error(message, e); 
	        throw new RuntimeException(message);
	    } 
	    return reps; 
	} 

	/**
	 * Inserts a specific repetition of EAR_U08_COMMAND_RESPONSE
	 * (a Group object)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public void  insertCOMMAND_RESPONSE(EAR_U08_COMMAND_RESPONSE structure, int rep) throws HL7Exception { 
	   super.insertRepetition( structure, rep);
	}

	/**
	 * Inserts a specific repetition of EAR_U08_COMMAND_RESPONSE
	 * (a Group object)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public EAR_U08_COMMAND_RESPONSE insertCOMMAND_RESPONSE(int rep) throws HL7Exception { 
	   return (EAR_U08_COMMAND_RESPONSE)super.insertRepetition("COMMAND_RESPONSE", rep);
	}

	/**
	 * Removes a specific repetition of EAR_U08_COMMAND_RESPONSE
	 * (a Group object)
	 * @see AbstractGroup#insertremoveRepetition(String, int) 
	 */
	public EAR_U08_COMMAND_RESPONSE removeCOMMAND_RESPONSE(int rep) throws HL7Exception { 
	   return (EAR_U08_COMMAND_RESPONSE)super.removeRepetition("COMMAND_RESPONSE", rep);
	}

	/**
	 * Returns ROL (Role) - creates it if necessary
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

}
