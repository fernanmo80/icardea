package ca.uhn.hl7v2.model.v26.group;

import ca.uhn.hl7v2.parser.ModelClassFactory;
import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.log.HapiLogFactory;
import ca.uhn.hl7v2.model.v26.segment.*;

import ca.uhn.hl7v2.model.*;
/**
 * <p>Represents the MFN_M16_MATERIAL_ITEM_RECORD Group.  A Group is an ordered collection of message 
 * segments that can repeat together or be optionally in/excluded together.
 * This Group contains the following elements: </p>
 * 0: MFE (Master File Entry) <b></b><br>
 * 1: ITM (Material Item) <b></b><br>
 * 2: NTE (Notes and Comments) <b>optional repeating</b><br>
 * 3: MFN_M16_STERILIZATION (a Group object) <b>optional repeating</b><br>
 * 4: MFN_M16_PURCHASING_VENDOR (a Group object) <b>optional repeating</b><br>
 * 5: MFN_M16_MATERIAL_LOCATION (a Group object) <b>optional repeating</b><br>
 */
public class MFN_M16_MATERIAL_ITEM_RECORD extends AbstractGroup {

	/** 
	 * Creates a new MFN_M16_MATERIAL_ITEM_RECORD Group.
	 */
	public MFN_M16_MATERIAL_ITEM_RECORD(Group parent, ModelClassFactory factory) {
	   super(parent, factory);
	   try {
	      this.add(MFE.class, true, false);
	      this.add(ITM.class, true, false);
	      this.add(NTE.class, false, true);
	      this.add(MFN_M16_STERILIZATION.class, false, true);
	      this.add(MFN_M16_PURCHASING_VENDOR.class, false, true);
	      this.add(MFN_M16_MATERIAL_LOCATION.class, false, true);
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error creating MFN_M16_MATERIAL_ITEM_RECORD - this is probably a bug in the source code generator.", e);
	   }
	}

	/**
	 * Returns MFE (Master File Entry) - creates it if necessary
	 */
	public MFE getMFE() { 
	   MFE ret = null;
	   try {
	      ret = (MFE)this.get("MFE");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns ITM (Material Item) - creates it if necessary
	 */
	public ITM getITM() { 
	   ITM ret = null;
	   try {
	      ret = (ITM)this.get("ITM");
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
	 * Returns  first repetition of MFN_M16_STERILIZATION (a Group object) - creates it if necessary
	 */
	public MFN_M16_STERILIZATION getSTERILIZATION() { 
	   MFN_M16_STERILIZATION ret = null;
	   try {
	      ret = (MFN_M16_STERILIZATION)this.get("STERILIZATION");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns a specific repetition of MFN_M16_STERILIZATION
	 * (a Group object) - creates it if necessary
	 * @throws HL7Exception if the repetition requested is more than one 
	 *     greater than the number of existing repetitions.
	 */
	public MFN_M16_STERILIZATION getSTERILIZATION(int rep) throws HL7Exception { 
	   return (MFN_M16_STERILIZATION)this.get("STERILIZATION", rep);
	}

	/** 
	 * Returns the number of existing repetitions of MFN_M16_STERILIZATION 
	 */ 
	public int getSTERILIZATIONReps() { 
	    int reps = -1; 
	    try { 
	        reps = this.getAll("STERILIZATION").length; 
	    } catch (HL7Exception e) { 
	        String message = "Unexpected error accessing data - this is probably a bug in the source code generator."; 
	        HapiLogFactory.getHapiLog(this.getClass()).error(message, e); 
	        throw new RuntimeException(message);
	    } 
	    return reps; 
	} 

	/**
	 * Inserts a specific repetition of MFN_M16_STERILIZATION
	 * (a Group object)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public void  insertSTERILIZATION(MFN_M16_STERILIZATION structure, int rep) throws HL7Exception { 
	   super.insertRepetition( structure, rep);
	}

	/**
	 * Inserts a specific repetition of MFN_M16_STERILIZATION
	 * (a Group object)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public MFN_M16_STERILIZATION insertSTERILIZATION(int rep) throws HL7Exception { 
	   return (MFN_M16_STERILIZATION)super.insertRepetition("STERILIZATION", rep);
	}

	/**
	 * Removes a specific repetition of MFN_M16_STERILIZATION
	 * (a Group object)
	 * @see AbstractGroup#insertremoveRepetition(String, int) 
	 */
	public MFN_M16_STERILIZATION removeSTERILIZATION(int rep) throws HL7Exception { 
	   return (MFN_M16_STERILIZATION)super.removeRepetition("STERILIZATION", rep);
	}

	/**
	 * Returns  first repetition of MFN_M16_PURCHASING_VENDOR (a Group object) - creates it if necessary
	 */
	public MFN_M16_PURCHASING_VENDOR getPURCHASING_VENDOR() { 
	   MFN_M16_PURCHASING_VENDOR ret = null;
	   try {
	      ret = (MFN_M16_PURCHASING_VENDOR)this.get("PURCHASING_VENDOR");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns a specific repetition of MFN_M16_PURCHASING_VENDOR
	 * (a Group object) - creates it if necessary
	 * @throws HL7Exception if the repetition requested is more than one 
	 *     greater than the number of existing repetitions.
	 */
	public MFN_M16_PURCHASING_VENDOR getPURCHASING_VENDOR(int rep) throws HL7Exception { 
	   return (MFN_M16_PURCHASING_VENDOR)this.get("PURCHASING_VENDOR", rep);
	}

	/** 
	 * Returns the number of existing repetitions of MFN_M16_PURCHASING_VENDOR 
	 */ 
	public int getPURCHASING_VENDORReps() { 
	    int reps = -1; 
	    try { 
	        reps = this.getAll("PURCHASING_VENDOR").length; 
	    } catch (HL7Exception e) { 
	        String message = "Unexpected error accessing data - this is probably a bug in the source code generator."; 
	        HapiLogFactory.getHapiLog(this.getClass()).error(message, e); 
	        throw new RuntimeException(message);
	    } 
	    return reps; 
	} 

	/**
	 * Inserts a specific repetition of MFN_M16_PURCHASING_VENDOR
	 * (a Group object)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public void  insertPURCHASING_VENDOR(MFN_M16_PURCHASING_VENDOR structure, int rep) throws HL7Exception { 
	   super.insertRepetition( structure, rep);
	}

	/**
	 * Inserts a specific repetition of MFN_M16_PURCHASING_VENDOR
	 * (a Group object)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public MFN_M16_PURCHASING_VENDOR insertPURCHASING_VENDOR(int rep) throws HL7Exception { 
	   return (MFN_M16_PURCHASING_VENDOR)super.insertRepetition("PURCHASING_VENDOR", rep);
	}

	/**
	 * Removes a specific repetition of MFN_M16_PURCHASING_VENDOR
	 * (a Group object)
	 * @see AbstractGroup#insertremoveRepetition(String, int) 
	 */
	public MFN_M16_PURCHASING_VENDOR removePURCHASING_VENDOR(int rep) throws HL7Exception { 
	   return (MFN_M16_PURCHASING_VENDOR)super.removeRepetition("PURCHASING_VENDOR", rep);
	}

	/**
	 * Returns  first repetition of MFN_M16_MATERIAL_LOCATION (a Group object) - creates it if necessary
	 */
	public MFN_M16_MATERIAL_LOCATION getMATERIAL_LOCATION() { 
	   MFN_M16_MATERIAL_LOCATION ret = null;
	   try {
	      ret = (MFN_M16_MATERIAL_LOCATION)this.get("MATERIAL_LOCATION");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns a specific repetition of MFN_M16_MATERIAL_LOCATION
	 * (a Group object) - creates it if necessary
	 * @throws HL7Exception if the repetition requested is more than one 
	 *     greater than the number of existing repetitions.
	 */
	public MFN_M16_MATERIAL_LOCATION getMATERIAL_LOCATION(int rep) throws HL7Exception { 
	   return (MFN_M16_MATERIAL_LOCATION)this.get("MATERIAL_LOCATION", rep);
	}

	/** 
	 * Returns the number of existing repetitions of MFN_M16_MATERIAL_LOCATION 
	 */ 
	public int getMATERIAL_LOCATIONReps() { 
	    int reps = -1; 
	    try { 
	        reps = this.getAll("MATERIAL_LOCATION").length; 
	    } catch (HL7Exception e) { 
	        String message = "Unexpected error accessing data - this is probably a bug in the source code generator."; 
	        HapiLogFactory.getHapiLog(this.getClass()).error(message, e); 
	        throw new RuntimeException(message);
	    } 
	    return reps; 
	} 

	/**
	 * Inserts a specific repetition of MFN_M16_MATERIAL_LOCATION
	 * (a Group object)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public void  insertMATERIAL_LOCATION(MFN_M16_MATERIAL_LOCATION structure, int rep) throws HL7Exception { 
	   super.insertRepetition( structure, rep);
	}

	/**
	 * Inserts a specific repetition of MFN_M16_MATERIAL_LOCATION
	 * (a Group object)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public MFN_M16_MATERIAL_LOCATION insertMATERIAL_LOCATION(int rep) throws HL7Exception { 
	   return (MFN_M16_MATERIAL_LOCATION)super.insertRepetition("MATERIAL_LOCATION", rep);
	}

	/**
	 * Removes a specific repetition of MFN_M16_MATERIAL_LOCATION
	 * (a Group object)
	 * @see AbstractGroup#insertremoveRepetition(String, int) 
	 */
	public MFN_M16_MATERIAL_LOCATION removeMATERIAL_LOCATION(int rep) throws HL7Exception { 
	   return (MFN_M16_MATERIAL_LOCATION)super.removeRepetition("MATERIAL_LOCATION", rep);
	}

}
