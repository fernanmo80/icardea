package ca.uhn.hl7v2.model.v26.group;

import ca.uhn.hl7v2.parser.ModelClassFactory;
import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.log.HapiLogFactory;
import ca.uhn.hl7v2.model.v26.segment.*;

import ca.uhn.hl7v2.model.*;
/**
 * <p>Represents the ADR_A19_QUERY_RESPONSE Group.  A Group is an ordered collection of message 
 * segments that can repeat together or be optionally in/excluded together.
 * This Group contains the following elements: </p>
 * 0: EVN (Event Type) <b>optional </b><br>
 * 1: PID (Patient Identification) <b></b><br>
 * 2: PD1 (Patient Additional Demographic) <b>optional </b><br>
 * 3: ARV (Access Restriction) <b>optional repeating</b><br>
 * 4: ROL (Role) <b>optional repeating</b><br>
 * 5: NK1 (Next of Kin / Associated Parties) <b>optional repeating</b><br>
 * 6: PV1 (Patient Visit) <b></b><br>
 * 7: PV2 (Patient Visit - Additional Information) <b>optional </b><br>
 * 8: ARV (Access Restriction) <b>optional repeating</b><br>
 * 9: ROL (Role) <b>optional repeating</b><br>
 * 10: DB1 (Disability) <b>optional repeating</b><br>
 * 11: OBX (Observation/Result) <b>optional repeating</b><br>
 * 12: AL1 (Patient Allergy Information) <b>optional repeating</b><br>
 * 13: DG1 (Diagnosis) <b>optional repeating</b><br>
 * 14: DRG (Diagnosis Related Group) <b>optional </b><br>
 * 15: ADR_A19_PROCEDURE (a Group object) <b>optional repeating</b><br>
 * 16: GT1 (Guarantor) <b>optional repeating</b><br>
 * 17: ADR_A19_INSURANCE (a Group object) <b>optional repeating</b><br>
 * 18: ACC (Accident) <b>optional </b><br>
 * 19: UB1 (UB82) <b>optional </b><br>
 * 20: UB2 (UB92 Data) <b>optional </b><br>
 */
public class ADR_A19_QUERY_RESPONSE extends AbstractGroup {

	/** 
	 * Creates a new ADR_A19_QUERY_RESPONSE Group.
	 */
	public ADR_A19_QUERY_RESPONSE(Group parent, ModelClassFactory factory) {
	   super(parent, factory);
	   try {
	      this.add(EVN.class, false, false);
	      this.add(PID.class, true, false);
	      this.add(PD1.class, false, false);
	      this.add(ARV.class, false, true);
	      this.add(ROL.class, false, true);
	      this.add(NK1.class, false, true);
	      this.add(PV1.class, true, false);
	      this.add(PV2.class, false, false);
	      this.add(ARV.class, false, true);
	      this.add(ROL.class, false, true);
	      this.add(DB1.class, false, true);
	      this.add(OBX.class, false, true);
	      this.add(AL1.class, false, true);
	      this.add(DG1.class, false, true);
	      this.add(DRG.class, false, false);
	      this.add(ADR_A19_PROCEDURE.class, false, true);
	      this.add(GT1.class, false, true);
	      this.add(ADR_A19_INSURANCE.class, false, true);
	      this.add(ACC.class, false, false);
	      this.add(UB1.class, false, false);
	      this.add(UB2.class, false, false);
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error creating ADR_A19_QUERY_RESPONSE - this is probably a bug in the source code generator.", e);
	   }
	}

	/**
	 * Returns EVN (Event Type) - creates it if necessary
	 */
	public EVN getEVN() { 
	   EVN ret = null;
	   try {
	      ret = (EVN)this.get("EVN");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns PID (Patient Identification) - creates it if necessary
	 */
	public PID getPID() { 
	   PID ret = null;
	   try {
	      ret = (PID)this.get("PID");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns PD1 (Patient Additional Demographic) - creates it if necessary
	 */
	public PD1 getPD1() { 
	   PD1 ret = null;
	   try {
	      ret = (PD1)this.get("PD1");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns  first repetition of ARV (Access Restriction) - creates it if necessary
	 */
	public ARV getARV() { 
	   ARV ret = null;
	   try {
	      ret = (ARV)this.get("ARV");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns a specific repetition of ARV
	 * (Access Restriction) - creates it if necessary
	 * @throws HL7Exception if the repetition requested is more than one 
	 *     greater than the number of existing repetitions.
	 */
	public ARV getARV(int rep) throws HL7Exception { 
	   return (ARV)this.get("ARV", rep);
	}

	/** 
	 * Returns the number of existing repetitions of ARV 
	 */ 
	public int getARVReps() { 
	    int reps = -1; 
	    try { 
	        reps = this.getAll("ARV").length; 
	    } catch (HL7Exception e) { 
	        String message = "Unexpected error accessing data - this is probably a bug in the source code generator."; 
	        HapiLogFactory.getHapiLog(this.getClass()).error(message, e); 
	        throw new RuntimeException(message);
	    } 
	    return reps; 
	} 

	/**
	 * Inserts a specific repetition of ARV
	 * (Access Restriction)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public void  insertARV(ARV structure, int rep) throws HL7Exception { 
	   super.insertRepetition( structure, rep);
	}

	/**
	 * Inserts a specific repetition of ARV
	 * (Access Restriction)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public ARV insertARV(int rep) throws HL7Exception { 
	   return (ARV)super.insertRepetition("ARV", rep);
	}

	/**
	 * Removes a specific repetition of ARV
	 * (Access Restriction)
	 * @see AbstractGroup#insertremoveRepetition(String, int) 
	 */
	public ARV removeARV(int rep) throws HL7Exception { 
	   return (ARV)super.removeRepetition("ARV", rep);
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
	 * Returns  first repetition of NK1 (Next of Kin / Associated Parties) - creates it if necessary
	 */
	public NK1 getNK1() { 
	   NK1 ret = null;
	   try {
	      ret = (NK1)this.get("NK1");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns a specific repetition of NK1
	 * (Next of Kin / Associated Parties) - creates it if necessary
	 * @throws HL7Exception if the repetition requested is more than one 
	 *     greater than the number of existing repetitions.
	 */
	public NK1 getNK1(int rep) throws HL7Exception { 
	   return (NK1)this.get("NK1", rep);
	}

	/** 
	 * Returns the number of existing repetitions of NK1 
	 */ 
	public int getNK1Reps() { 
	    int reps = -1; 
	    try { 
	        reps = this.getAll("NK1").length; 
	    } catch (HL7Exception e) { 
	        String message = "Unexpected error accessing data - this is probably a bug in the source code generator."; 
	        HapiLogFactory.getHapiLog(this.getClass()).error(message, e); 
	        throw new RuntimeException(message);
	    } 
	    return reps; 
	} 

	/**
	 * Inserts a specific repetition of NK1
	 * (Next of Kin / Associated Parties)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public void  insertNK1(NK1 structure, int rep) throws HL7Exception { 
	   super.insertRepetition( structure, rep);
	}

	/**
	 * Inserts a specific repetition of NK1
	 * (Next of Kin / Associated Parties)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public NK1 insertNK1(int rep) throws HL7Exception { 
	   return (NK1)super.insertRepetition("NK1", rep);
	}

	/**
	 * Removes a specific repetition of NK1
	 * (Next of Kin / Associated Parties)
	 * @see AbstractGroup#insertremoveRepetition(String, int) 
	 */
	public NK1 removeNK1(int rep) throws HL7Exception { 
	   return (NK1)super.removeRepetition("NK1", rep);
	}

	/**
	 * Returns PV1 (Patient Visit) - creates it if necessary
	 */
	public PV1 getPV1() { 
	   PV1 ret = null;
	   try {
	      ret = (PV1)this.get("PV1");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns PV2 (Patient Visit - Additional Information) - creates it if necessary
	 */
	public PV2 getPV2() { 
	   PV2 ret = null;
	   try {
	      ret = (PV2)this.get("PV2");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns  first repetition of ARV2 (Access Restriction) - creates it if necessary
	 */
	public ARV getARV2() { 
	   ARV ret = null;
	   try {
	      ret = (ARV)this.get("ARV2");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns a specific repetition of ARV2
	 * (Access Restriction) - creates it if necessary
	 * @throws HL7Exception if the repetition requested is more than one 
	 *     greater than the number of existing repetitions.
	 */
	public ARV getARV2(int rep) throws HL7Exception { 
	   return (ARV)this.get("ARV2", rep);
	}

	/** 
	 * Returns the number of existing repetitions of ARV2 
	 */ 
	public int getARV2Reps() { 
	    int reps = -1; 
	    try { 
	        reps = this.getAll("ARV2").length; 
	    } catch (HL7Exception e) { 
	        String message = "Unexpected error accessing data - this is probably a bug in the source code generator."; 
	        HapiLogFactory.getHapiLog(this.getClass()).error(message, e); 
	        throw new RuntimeException(message);
	    } 
	    return reps; 
	} 

	/**
	 * Inserts a specific repetition of ARV2
	 * (Access Restriction)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public void  insertARV2(ARV structure, int rep) throws HL7Exception { 
	   super.insertRepetition( structure, rep);
	}

	/**
	 * Inserts a specific repetition of ARV2
	 * (Access Restriction)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public ARV insertARV2(int rep) throws HL7Exception { 
	   return (ARV)super.insertRepetition("ARV2", rep);
	}

	/**
	 * Removes a specific repetition of ARV2
	 * (Access Restriction)
	 * @see AbstractGroup#insertremoveRepetition(String, int) 
	 */
	public ARV removeARV2(int rep) throws HL7Exception { 
	   return (ARV)super.removeRepetition("ARV2", rep);
	}

	/**
	 * Returns  first repetition of ROL2 (Role) - creates it if necessary
	 */
	public ROL getROL2() { 
	   ROL ret = null;
	   try {
	      ret = (ROL)this.get("ROL2");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns a specific repetition of ROL2
	 * (Role) - creates it if necessary
	 * @throws HL7Exception if the repetition requested is more than one 
	 *     greater than the number of existing repetitions.
	 */
	public ROL getROL2(int rep) throws HL7Exception { 
	   return (ROL)this.get("ROL2", rep);
	}

	/** 
	 * Returns the number of existing repetitions of ROL2 
	 */ 
	public int getROL2Reps() { 
	    int reps = -1; 
	    try { 
	        reps = this.getAll("ROL2").length; 
	    } catch (HL7Exception e) { 
	        String message = "Unexpected error accessing data - this is probably a bug in the source code generator."; 
	        HapiLogFactory.getHapiLog(this.getClass()).error(message, e); 
	        throw new RuntimeException(message);
	    } 
	    return reps; 
	} 

	/**
	 * Inserts a specific repetition of ROL2
	 * (Role)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public void  insertROL2(ROL structure, int rep) throws HL7Exception { 
	   super.insertRepetition( structure, rep);
	}

	/**
	 * Inserts a specific repetition of ROL2
	 * (Role)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public ROL insertROL2(int rep) throws HL7Exception { 
	   return (ROL)super.insertRepetition("ROL2", rep);
	}

	/**
	 * Removes a specific repetition of ROL2
	 * (Role)
	 * @see AbstractGroup#insertremoveRepetition(String, int) 
	 */
	public ROL removeROL2(int rep) throws HL7Exception { 
	   return (ROL)super.removeRepetition("ROL2", rep);
	}

	/**
	 * Returns  first repetition of DB1 (Disability) - creates it if necessary
	 */
	public DB1 getDB1() { 
	   DB1 ret = null;
	   try {
	      ret = (DB1)this.get("DB1");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns a specific repetition of DB1
	 * (Disability) - creates it if necessary
	 * @throws HL7Exception if the repetition requested is more than one 
	 *     greater than the number of existing repetitions.
	 */
	public DB1 getDB1(int rep) throws HL7Exception { 
	   return (DB1)this.get("DB1", rep);
	}

	/** 
	 * Returns the number of existing repetitions of DB1 
	 */ 
	public int getDB1Reps() { 
	    int reps = -1; 
	    try { 
	        reps = this.getAll("DB1").length; 
	    } catch (HL7Exception e) { 
	        String message = "Unexpected error accessing data - this is probably a bug in the source code generator."; 
	        HapiLogFactory.getHapiLog(this.getClass()).error(message, e); 
	        throw new RuntimeException(message);
	    } 
	    return reps; 
	} 

	/**
	 * Inserts a specific repetition of DB1
	 * (Disability)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public void  insertDB1(DB1 structure, int rep) throws HL7Exception { 
	   super.insertRepetition( structure, rep);
	}

	/**
	 * Inserts a specific repetition of DB1
	 * (Disability)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public DB1 insertDB1(int rep) throws HL7Exception { 
	   return (DB1)super.insertRepetition("DB1", rep);
	}

	/**
	 * Removes a specific repetition of DB1
	 * (Disability)
	 * @see AbstractGroup#insertremoveRepetition(String, int) 
	 */
	public DB1 removeDB1(int rep) throws HL7Exception { 
	   return (DB1)super.removeRepetition("DB1", rep);
	}

	/**
	 * Returns  first repetition of OBX (Observation/Result) - creates it if necessary
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
	 * Returns a specific repetition of OBX
	 * (Observation/Result) - creates it if necessary
	 * @throws HL7Exception if the repetition requested is more than one 
	 *     greater than the number of existing repetitions.
	 */
	public OBX getOBX(int rep) throws HL7Exception { 
	   return (OBX)this.get("OBX", rep);
	}

	/** 
	 * Returns the number of existing repetitions of OBX 
	 */ 
	public int getOBXReps() { 
	    int reps = -1; 
	    try { 
	        reps = this.getAll("OBX").length; 
	    } catch (HL7Exception e) { 
	        String message = "Unexpected error accessing data - this is probably a bug in the source code generator."; 
	        HapiLogFactory.getHapiLog(this.getClass()).error(message, e); 
	        throw new RuntimeException(message);
	    } 
	    return reps; 
	} 

	/**
	 * Inserts a specific repetition of OBX
	 * (Observation/Result)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public void  insertOBX(OBX structure, int rep) throws HL7Exception { 
	   super.insertRepetition( structure, rep);
	}

	/**
	 * Inserts a specific repetition of OBX
	 * (Observation/Result)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public OBX insertOBX(int rep) throws HL7Exception { 
	   return (OBX)super.insertRepetition("OBX", rep);
	}

	/**
	 * Removes a specific repetition of OBX
	 * (Observation/Result)
	 * @see AbstractGroup#insertremoveRepetition(String, int) 
	 */
	public OBX removeOBX(int rep) throws HL7Exception { 
	   return (OBX)super.removeRepetition("OBX", rep);
	}

	/**
	 * Returns  first repetition of AL1 (Patient Allergy Information) - creates it if necessary
	 */
	public AL1 getAL1() { 
	   AL1 ret = null;
	   try {
	      ret = (AL1)this.get("AL1");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns a specific repetition of AL1
	 * (Patient Allergy Information) - creates it if necessary
	 * @throws HL7Exception if the repetition requested is more than one 
	 *     greater than the number of existing repetitions.
	 */
	public AL1 getAL1(int rep) throws HL7Exception { 
	   return (AL1)this.get("AL1", rep);
	}

	/** 
	 * Returns the number of existing repetitions of AL1 
	 */ 
	public int getAL1Reps() { 
	    int reps = -1; 
	    try { 
	        reps = this.getAll("AL1").length; 
	    } catch (HL7Exception e) { 
	        String message = "Unexpected error accessing data - this is probably a bug in the source code generator."; 
	        HapiLogFactory.getHapiLog(this.getClass()).error(message, e); 
	        throw new RuntimeException(message);
	    } 
	    return reps; 
	} 

	/**
	 * Inserts a specific repetition of AL1
	 * (Patient Allergy Information)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public void  insertAL1(AL1 structure, int rep) throws HL7Exception { 
	   super.insertRepetition( structure, rep);
	}

	/**
	 * Inserts a specific repetition of AL1
	 * (Patient Allergy Information)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public AL1 insertAL1(int rep) throws HL7Exception { 
	   return (AL1)super.insertRepetition("AL1", rep);
	}

	/**
	 * Removes a specific repetition of AL1
	 * (Patient Allergy Information)
	 * @see AbstractGroup#insertremoveRepetition(String, int) 
	 */
	public AL1 removeAL1(int rep) throws HL7Exception { 
	   return (AL1)super.removeRepetition("AL1", rep);
	}

	/**
	 * Returns  first repetition of DG1 (Diagnosis) - creates it if necessary
	 */
	public DG1 getDG1() { 
	   DG1 ret = null;
	   try {
	      ret = (DG1)this.get("DG1");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns a specific repetition of DG1
	 * (Diagnosis) - creates it if necessary
	 * @throws HL7Exception if the repetition requested is more than one 
	 *     greater than the number of existing repetitions.
	 */
	public DG1 getDG1(int rep) throws HL7Exception { 
	   return (DG1)this.get("DG1", rep);
	}

	/** 
	 * Returns the number of existing repetitions of DG1 
	 */ 
	public int getDG1Reps() { 
	    int reps = -1; 
	    try { 
	        reps = this.getAll("DG1").length; 
	    } catch (HL7Exception e) { 
	        String message = "Unexpected error accessing data - this is probably a bug in the source code generator."; 
	        HapiLogFactory.getHapiLog(this.getClass()).error(message, e); 
	        throw new RuntimeException(message);
	    } 
	    return reps; 
	} 

	/**
	 * Inserts a specific repetition of DG1
	 * (Diagnosis)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public void  insertDG1(DG1 structure, int rep) throws HL7Exception { 
	   super.insertRepetition( structure, rep);
	}

	/**
	 * Inserts a specific repetition of DG1
	 * (Diagnosis)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public DG1 insertDG1(int rep) throws HL7Exception { 
	   return (DG1)super.insertRepetition("DG1", rep);
	}

	/**
	 * Removes a specific repetition of DG1
	 * (Diagnosis)
	 * @see AbstractGroup#insertremoveRepetition(String, int) 
	 */
	public DG1 removeDG1(int rep) throws HL7Exception { 
	   return (DG1)super.removeRepetition("DG1", rep);
	}

	/**
	 * Returns DRG (Diagnosis Related Group) - creates it if necessary
	 */
	public DRG getDRG() { 
	   DRG ret = null;
	   try {
	      ret = (DRG)this.get("DRG");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns  first repetition of ADR_A19_PROCEDURE (a Group object) - creates it if necessary
	 */
	public ADR_A19_PROCEDURE getPROCEDURE() { 
	   ADR_A19_PROCEDURE ret = null;
	   try {
	      ret = (ADR_A19_PROCEDURE)this.get("PROCEDURE");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns a specific repetition of ADR_A19_PROCEDURE
	 * (a Group object) - creates it if necessary
	 * @throws HL7Exception if the repetition requested is more than one 
	 *     greater than the number of existing repetitions.
	 */
	public ADR_A19_PROCEDURE getPROCEDURE(int rep) throws HL7Exception { 
	   return (ADR_A19_PROCEDURE)this.get("PROCEDURE", rep);
	}

	/** 
	 * Returns the number of existing repetitions of ADR_A19_PROCEDURE 
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
	 * Inserts a specific repetition of ADR_A19_PROCEDURE
	 * (a Group object)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public void  insertPROCEDURE(ADR_A19_PROCEDURE structure, int rep) throws HL7Exception { 
	   super.insertRepetition( structure, rep);
	}

	/**
	 * Inserts a specific repetition of ADR_A19_PROCEDURE
	 * (a Group object)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public ADR_A19_PROCEDURE insertPROCEDURE(int rep) throws HL7Exception { 
	   return (ADR_A19_PROCEDURE)super.insertRepetition("PROCEDURE", rep);
	}

	/**
	 * Removes a specific repetition of ADR_A19_PROCEDURE
	 * (a Group object)
	 * @see AbstractGroup#insertremoveRepetition(String, int) 
	 */
	public ADR_A19_PROCEDURE removePROCEDURE(int rep) throws HL7Exception { 
	   return (ADR_A19_PROCEDURE)super.removeRepetition("PROCEDURE", rep);
	}

	/**
	 * Returns  first repetition of GT1 (Guarantor) - creates it if necessary
	 */
	public GT1 getGT1() { 
	   GT1 ret = null;
	   try {
	      ret = (GT1)this.get("GT1");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns a specific repetition of GT1
	 * (Guarantor) - creates it if necessary
	 * @throws HL7Exception if the repetition requested is more than one 
	 *     greater than the number of existing repetitions.
	 */
	public GT1 getGT1(int rep) throws HL7Exception { 
	   return (GT1)this.get("GT1", rep);
	}

	/** 
	 * Returns the number of existing repetitions of GT1 
	 */ 
	public int getGT1Reps() { 
	    int reps = -1; 
	    try { 
	        reps = this.getAll("GT1").length; 
	    } catch (HL7Exception e) { 
	        String message = "Unexpected error accessing data - this is probably a bug in the source code generator."; 
	        HapiLogFactory.getHapiLog(this.getClass()).error(message, e); 
	        throw new RuntimeException(message);
	    } 
	    return reps; 
	} 

	/**
	 * Inserts a specific repetition of GT1
	 * (Guarantor)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public void  insertGT1(GT1 structure, int rep) throws HL7Exception { 
	   super.insertRepetition( structure, rep);
	}

	/**
	 * Inserts a specific repetition of GT1
	 * (Guarantor)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public GT1 insertGT1(int rep) throws HL7Exception { 
	   return (GT1)super.insertRepetition("GT1", rep);
	}

	/**
	 * Removes a specific repetition of GT1
	 * (Guarantor)
	 * @see AbstractGroup#insertremoveRepetition(String, int) 
	 */
	public GT1 removeGT1(int rep) throws HL7Exception { 
	   return (GT1)super.removeRepetition("GT1", rep);
	}

	/**
	 * Returns  first repetition of ADR_A19_INSURANCE (a Group object) - creates it if necessary
	 */
	public ADR_A19_INSURANCE getINSURANCE() { 
	   ADR_A19_INSURANCE ret = null;
	   try {
	      ret = (ADR_A19_INSURANCE)this.get("INSURANCE");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns a specific repetition of ADR_A19_INSURANCE
	 * (a Group object) - creates it if necessary
	 * @throws HL7Exception if the repetition requested is more than one 
	 *     greater than the number of existing repetitions.
	 */
	public ADR_A19_INSURANCE getINSURANCE(int rep) throws HL7Exception { 
	   return (ADR_A19_INSURANCE)this.get("INSURANCE", rep);
	}

	/** 
	 * Returns the number of existing repetitions of ADR_A19_INSURANCE 
	 */ 
	public int getINSURANCEReps() { 
	    int reps = -1; 
	    try { 
	        reps = this.getAll("INSURANCE").length; 
	    } catch (HL7Exception e) { 
	        String message = "Unexpected error accessing data - this is probably a bug in the source code generator."; 
	        HapiLogFactory.getHapiLog(this.getClass()).error(message, e); 
	        throw new RuntimeException(message);
	    } 
	    return reps; 
	} 

	/**
	 * Inserts a specific repetition of ADR_A19_INSURANCE
	 * (a Group object)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public void  insertINSURANCE(ADR_A19_INSURANCE structure, int rep) throws HL7Exception { 
	   super.insertRepetition( structure, rep);
	}

	/**
	 * Inserts a specific repetition of ADR_A19_INSURANCE
	 * (a Group object)
	 * @see AbstractGroup#insertRepetition(Structure, int) 
	 */
	public ADR_A19_INSURANCE insertINSURANCE(int rep) throws HL7Exception { 
	   return (ADR_A19_INSURANCE)super.insertRepetition("INSURANCE", rep);
	}

	/**
	 * Removes a specific repetition of ADR_A19_INSURANCE
	 * (a Group object)
	 * @see AbstractGroup#insertremoveRepetition(String, int) 
	 */
	public ADR_A19_INSURANCE removeINSURANCE(int rep) throws HL7Exception { 
	   return (ADR_A19_INSURANCE)super.removeRepetition("INSURANCE", rep);
	}

	/**
	 * Returns ACC (Accident) - creates it if necessary
	 */
	public ACC getACC() { 
	   ACC ret = null;
	   try {
	      ret = (ACC)this.get("ACC");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns UB1 (UB82) - creates it if necessary
	 */
	public UB1 getUB1() { 
	   UB1 ret = null;
	   try {
	      ret = (UB1)this.get("UB1");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns UB2 (UB92 Data) - creates it if necessary
	 */
	public UB2 getUB2() { 
	   UB2 ret = null;
	   try {
	      ret = (UB2)this.get("UB2");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

}
