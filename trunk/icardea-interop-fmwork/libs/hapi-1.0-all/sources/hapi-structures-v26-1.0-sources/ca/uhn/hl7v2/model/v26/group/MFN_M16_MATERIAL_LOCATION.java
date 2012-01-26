package ca.uhn.hl7v2.model.v26.group;

import ca.uhn.hl7v2.parser.ModelClassFactory;
import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.log.HapiLogFactory;
import ca.uhn.hl7v2.model.v26.segment.*;

import ca.uhn.hl7v2.model.*;
/**
 * <p>Represents the MFN_M16_MATERIAL_LOCATION Group.  A Group is an ordered collection of message 
 * segments that can repeat together or be optionally in/excluded together.
 * This Group contains the following elements: </p>
 * 0: IVT (Material Location) <b></b><br>
 * 1: ILT (Material Lot) <b>optional repeating</b><br>
 * 2: NTE (Notes and Comments) <b>optional repeating</b><br>
 */
public class MFN_M16_MATERIAL_LOCATION extends AbstractGroup {

	/** 
	 * Creates a new MFN_M16_MATERIAL_LOCATION Group.
	 */
	public MFN_M16_MATERIAL_LOCATION(Group parent, ModelClassFactory factory) {
	   super(parent, factory);
	   try {
	      this.add(IVT.class, true, false);
	      this.add(ILT.class, false, true);
	      this.add(NTE.class, false, true);
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error creating MFN_M16_MATERIAL_LOCATION - this is probably a bug in the source code generator.", e);
	   }
	}

	/**
	 * Returns IVT (Material Location) - creates it if necessary
	 */
	public IVT getIVT() { 
	   IVT ret = null;
	   try {
	      ret = (IVT)this.get("IVT");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns  first repetition of ILT (Material Lot) - creates it if necessary
	 */
	public ILT getILT() { 
	   ILT ret = null;
	   try {
	      ret = (ILT)this.get("ILT");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns a specific repetition of ILT
	 * (Material Lot) - creates it if necessary
	 * @throws HL7Exception if the repetition requested is more than one 
	 *     greater than the number of existing repetitions.
	 */
	public ILT getILT(int rep) throws HL7Exception { 
	   return (ILT)this.get("ILT", rep);
	}

	/** 
	 * Returns the number of existing repetitions of ILT 
	 */ 
	public int getILTReps() { 
	    int reps = -1; 
	    try { 
	        reps = this.getAll("ILT").length; 
	    } catch (HL7Exception e) { 
	        String message = "Unexpected error accessing data - this is probably a bug in the source code generator."; 
	        HapiLogFactory.getHapiLog(this.getClass()).error(message, e); 
	        throw new RuntimeException(message);
	    } 
	    return reps; 
	} 

	/**
	 * Inserts a specific repetition of ILT
	 * (Material Lot)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public void  insertILT(ILT structure, int rep) throws HL7Exception { 
	   super.insertRepetition( structure, rep);
	}

	/**
	 * Inserts a specific repetition of ILT
	 * (Material Lot)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public ILT insertILT(int rep) throws HL7Exception { 
	   return (ILT)super.insertRepetition("ILT", rep);
	}

	/**
	 * Removes a specific repetition of ILT
	 * (Material Lot)
	 * @see AbstractGroup#insertremoveRepetition(String, int) 
	 */
	public ILT removeILT(int rep) throws HL7Exception { 
	   return (ILT)super.removeRepetition("ILT", rep);
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

}
