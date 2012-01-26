package ca.uhn.hl7v2.model.v26.segment;

import ca.uhn.hl7v2.model.*;
import ca.uhn.hl7v2.model.v26.datatype.*;
import ca.uhn.log.HapiLogFactory;
import ca.uhn.hl7v2.parser.ModelClassFactory;
import ca.uhn.hl7v2.HL7Exception;

/**
 * <p>Represents an HL7 SPM message segment. 
 * This segment has the following fields:</p><p>
 * SPM-1: Set ID - SPM (SI)<br> 
 * SPM-2: Specimen ID (EIP)<br> 
 * SPM-3: Specimen Parent IDs (EIP)<br> 
 * SPM-4: Specimen Type (CWE)<br> 
 * SPM-5: Specimen Type Modifier (CWE)<br> 
 * SPM-6: Specimen Additives (CWE)<br> 
 * SPM-7: Specimen Collection Method (CWE)<br> 
 * SPM-8: Specimen Source Site (CWE)<br> 
 * SPM-9: Specimen Source Site Modifier (CWE)<br> 
 * SPM-10: Specimen Collection Site (CWE)<br> 
 * SPM-11: Specimen Role (CWE)<br> 
 * SPM-12: Specimen Collection Amount (CQ)<br> 
 * SPM-13: Grouped Specimen Count (NM)<br> 
 * SPM-14: Specimen Description (ST)<br> 
 * SPM-15: Specimen Handling Code (CWE)<br> 
 * SPM-16: Specimen Risk Code (CWE)<br> 
 * SPM-17: Specimen Collection Date/Time (DR)<br> 
 * SPM-18: Specimen Received Date/Time (DTM)<br> 
 * SPM-19: Specimen Expiration Date/Time (DTM)<br> 
 * SPM-20: Specimen Availability (ID)<br> 
 * SPM-21: Specimen Reject Reason (CWE)<br> 
 * SPM-22: Specimen Quality (CWE)<br> 
 * SPM-23: Specimen Appropriateness (CWE)<br> 
 * SPM-24: Specimen Condition (CWE)<br> 
 * SPM-25: Specimen Current Quantity (CQ)<br> 
 * SPM-26: Number of Specimen Containers (NM)<br> 
 * SPM-27: Container Type (CWE)<br> 
 * SPM-28: Container Condition (CWE)<br> 
 * SPM-29: Specimen Child Role (CWE)<br> 
 * </p><p>The get...() methods return data from individual fields.  These methods 
 * do not throw exceptions and may therefore have to handle exceptions internally.  
 * If an exception is handled internally, it is logged and null is returned.  
 * This is not expected to happen - if it does happen this indicates not so much 
 * an exceptional circumstance as a bug in the code for this class.</p>    
 */
public class SPM extends AbstractSegment  {

  /**
   * Creates a SPM (Specimen) segment object that belongs to the given 
   * message.  
   */
  public SPM(Group parent, ModelClassFactory factory) {
    super(parent, factory);
    Message message = getMessage();
    try {
       this.add(SI.class, false, 1, 4, new Object[]{message}, "Set ID - SPM");
       this.add(EIP.class, false, 1, 855, new Object[]{message}, "Specimen ID");
       this.add(EIP.class, false, 0, 855, new Object[]{message}, "Specimen Parent IDs");
       this.add(CWE.class, true, 1, 705, new Object[]{message}, "Specimen Type");
       this.add(CWE.class, false, 0, 705, new Object[]{message}, "Specimen Type Modifier");
       this.add(CWE.class, false, 0, 705, new Object[]{message}, "Specimen Additives");
       this.add(CWE.class, false, 1, 705, new Object[]{message}, "Specimen Collection Method");
       this.add(CWE.class, false, 1, 705, new Object[]{message}, "Specimen Source Site");
       this.add(CWE.class, false, 0, 705, new Object[]{message}, "Specimen Source Site Modifier");
       this.add(CWE.class, false, 1, 705, new Object[]{message}, "Specimen Collection Site");
       this.add(CWE.class, false, 0, 705, new Object[]{message}, "Specimen Role");
       this.add(CQ.class, false, 1, 20, new Object[]{message}, "Specimen Collection Amount");
       this.add(NM.class, false, 1, 6, new Object[]{message}, "Grouped Specimen Count");
       this.add(ST.class, false, 0, 250, new Object[]{message}, "Specimen Description");
       this.add(CWE.class, false, 0, 705, new Object[]{message}, "Specimen Handling Code");
       this.add(CWE.class, false, 0, 705, new Object[]{message}, "Specimen Risk Code");
       this.add(DR.class, false, 1, 49, new Object[]{message}, "Specimen Collection Date/Time");
       this.add(DTM.class, false, 1, 24, new Object[]{message}, "Specimen Received Date/Time");
       this.add(DTM.class, false, 1, 24, new Object[]{message}, "Specimen Expiration Date/Time");
       this.add(ID.class, false, 1, 1, new Object[]{message, new Integer(136)}, "Specimen Availability");
       this.add(CWE.class, false, 0, 705, new Object[]{message}, "Specimen Reject Reason");
       this.add(CWE.class, false, 1, 705, new Object[]{message}, "Specimen Quality");
       this.add(CWE.class, false, 1, 705, new Object[]{message}, "Specimen Appropriateness");
       this.add(CWE.class, false, 0, 705, new Object[]{message}, "Specimen Condition");
       this.add(CQ.class, false, 1, 722, new Object[]{message}, "Specimen Current Quantity");
       this.add(NM.class, false, 1, 4, new Object[]{message}, "Number of Specimen Containers");
       this.add(CWE.class, false, 1, 705, new Object[]{message}, "Container Type");
       this.add(CWE.class, false, 1, 705, new Object[]{message}, "Container Condition");
       this.add(CWE.class, false, 1, 705, new Object[]{message}, "Specimen Child Role");
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Can't instantiate " + this.getClass().getName(), he);
    }
  }

  /**
   * Returns Set ID - SPM (SPM-1).
   */
  public SI getSetIDSPM()  {
    SI ret = null;
    try {
        Type t = this.getField(1, 0);
        ret = (SI)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns Set ID - SPM (SPM-1).
   */
  public SI getSpm1_SetIDSPM()  {
    SI ret = null;
    try {
        Type t = this.getField(1, 0);
        ret = (SI)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns Specimen ID (SPM-2).
   */
  public EIP getSpecimenID()  {
    EIP ret = null;
    try {
        Type t = this.getField(2, 0);
        ret = (EIP)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns Specimen ID (SPM-2).
   */
  public EIP getSpm2_SpecimenID()  {
    EIP ret = null;
    try {
        Type t = this.getField(2, 0);
        ret = (EIP)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns a single repetition of Specimen Parent IDs (SPM-3).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public EIP getSpecimenParentIDs(int rep) throws HL7Exception {
    EIP ret = null;
    try {
        Type t = this.getField(3, rep);
        ret = (EIP)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Specimen Parent IDs (SPM-3).
   */
  public EIP[] getSpecimenParentIDs() {
     EIP[] ret = null;
    try {
        Type[] t = this.getField(3);  
        ret = new EIP[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (EIP)t[i];
        }
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns a count of the number of repetitions of Specimen Parent IDs (SPM-3).
   */
  public int getSpecimenParentIDsReps() {
    try {
        return this.getField(3).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Specimen Parent IDs (SPM-3) at a given index and returns it.
   * @param index The index
   */
  public EIP insertSpecimenParentIDs(int index) throws HL7Exception {
     return (EIP) super.insertRepetition(3, index);
  }

  /**
   * Removes a repetition of Specimen Parent IDs (SPM-3) at a given index and returns it.
   * @param index The index
   */
  public EIP removeSpecimenParentIDs(int index) throws HL7Exception {
     return (EIP) super.removeRepetition(3, index);
  }

  /**
   * Returns a single repetition of Specimen Parent IDs (SPM-3).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public EIP getSpm3_SpecimenParentIDs(int rep) throws HL7Exception {
    EIP ret = null;
    try {
        Type t = this.getField(3, rep);
        ret = (EIP)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Specimen Parent IDs (SPM-3).
   */
  public EIP[] getSpm3_SpecimenParentIDs() {
     EIP[] ret = null;
    try {
        Type[] t = this.getField(3);  
        ret = new EIP[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (EIP)t[i];
        }
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns a count of the number of repetitions of Specimen Parent IDs (SPM-3).
   */
  public int getSpm3_SpecimenParentIDsReps() {
    try {
        return this.getField(3).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Specimen Parent IDs (SPM-3) at a given index and returns it.
   * @param index The index
   */
  public EIP insertSpm3_SpecimenParentIDs(int index) throws HL7Exception {
     return (EIP) super.insertRepetition(3, index);
  }

  /**
   * Removes a repetition of Specimen Parent IDs (SPM-3) at a given index and returns it.
   * @param index The index
   */
  public EIP removeSpm3_SpecimenParentIDs(int index) throws HL7Exception {
     return (EIP) super.removeRepetition(3, index);
  }

  /**
   * Returns Specimen Type (SPM-4).
   */
  public CWE getSpecimenType()  {
    CWE ret = null;
    try {
        Type t = this.getField(4, 0);
        ret = (CWE)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns Specimen Type (SPM-4).
   */
  public CWE getSpm4_SpecimenType()  {
    CWE ret = null;
    try {
        Type t = this.getField(4, 0);
        ret = (CWE)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns a single repetition of Specimen Type Modifier (SPM-5).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getSpecimenTypeModifier(int rep) throws HL7Exception {
    CWE ret = null;
    try {
        Type t = this.getField(5, rep);
        ret = (CWE)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Specimen Type Modifier (SPM-5).
   */
  public CWE[] getSpecimenTypeModifier() {
     CWE[] ret = null;
    try {
        Type[] t = this.getField(5);  
        ret = new CWE[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (CWE)t[i];
        }
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns a count of the number of repetitions of Specimen Type Modifier (SPM-5).
   */
  public int getSpecimenTypeModifierReps() {
    try {
        return this.getField(5).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Specimen Type Modifier (SPM-5) at a given index and returns it.
   * @param index The index
   */
  public CWE insertSpecimenTypeModifier(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(5, index);
  }

  /**
   * Removes a repetition of Specimen Type Modifier (SPM-5) at a given index and returns it.
   * @param index The index
   */
  public CWE removeSpecimenTypeModifier(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(5, index);
  }

  /**
   * Returns a single repetition of Specimen Type Modifier (SPM-5).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getSpm5_SpecimenTypeModifier(int rep) throws HL7Exception {
    CWE ret = null;
    try {
        Type t = this.getField(5, rep);
        ret = (CWE)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Specimen Type Modifier (SPM-5).
   */
  public CWE[] getSpm5_SpecimenTypeModifier() {
     CWE[] ret = null;
    try {
        Type[] t = this.getField(5);  
        ret = new CWE[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (CWE)t[i];
        }
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns a count of the number of repetitions of Specimen Type Modifier (SPM-5).
   */
  public int getSpm5_SpecimenTypeModifierReps() {
    try {
        return this.getField(5).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Specimen Type Modifier (SPM-5) at a given index and returns it.
   * @param index The index
   */
  public CWE insertSpm5_SpecimenTypeModifier(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(5, index);
  }

  /**
   * Removes a repetition of Specimen Type Modifier (SPM-5) at a given index and returns it.
   * @param index The index
   */
  public CWE removeSpm5_SpecimenTypeModifier(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(5, index);
  }

  /**
   * Returns a single repetition of Specimen Additives (SPM-6).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getSpecimenAdditives(int rep) throws HL7Exception {
    CWE ret = null;
    try {
        Type t = this.getField(6, rep);
        ret = (CWE)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Specimen Additives (SPM-6).
   */
  public CWE[] getSpecimenAdditives() {
     CWE[] ret = null;
    try {
        Type[] t = this.getField(6);  
        ret = new CWE[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (CWE)t[i];
        }
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns a count of the number of repetitions of Specimen Additives (SPM-6).
   */
  public int getSpecimenAdditivesReps() {
    try {
        return this.getField(6).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Specimen Additives (SPM-6) at a given index and returns it.
   * @param index The index
   */
  public CWE insertSpecimenAdditives(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(6, index);
  }

  /**
   * Removes a repetition of Specimen Additives (SPM-6) at a given index and returns it.
   * @param index The index
   */
  public CWE removeSpecimenAdditives(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(6, index);
  }

  /**
   * Returns a single repetition of Specimen Additives (SPM-6).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getSpm6_SpecimenAdditives(int rep) throws HL7Exception {
    CWE ret = null;
    try {
        Type t = this.getField(6, rep);
        ret = (CWE)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Specimen Additives (SPM-6).
   */
  public CWE[] getSpm6_SpecimenAdditives() {
     CWE[] ret = null;
    try {
        Type[] t = this.getField(6);  
        ret = new CWE[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (CWE)t[i];
        }
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns a count of the number of repetitions of Specimen Additives (SPM-6).
   */
  public int getSpm6_SpecimenAdditivesReps() {
    try {
        return this.getField(6).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Specimen Additives (SPM-6) at a given index and returns it.
   * @param index The index
   */
  public CWE insertSpm6_SpecimenAdditives(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(6, index);
  }

  /**
   * Removes a repetition of Specimen Additives (SPM-6) at a given index and returns it.
   * @param index The index
   */
  public CWE removeSpm6_SpecimenAdditives(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(6, index);
  }

  /**
   * Returns Specimen Collection Method (SPM-7).
   */
  public CWE getSpecimenCollectionMethod()  {
    CWE ret = null;
    try {
        Type t = this.getField(7, 0);
        ret = (CWE)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns Specimen Collection Method (SPM-7).
   */
  public CWE getSpm7_SpecimenCollectionMethod()  {
    CWE ret = null;
    try {
        Type t = this.getField(7, 0);
        ret = (CWE)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns Specimen Source Site (SPM-8).
   */
  public CWE getSpecimenSourceSite()  {
    CWE ret = null;
    try {
        Type t = this.getField(8, 0);
        ret = (CWE)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns Specimen Source Site (SPM-8).
   */
  public CWE getSpm8_SpecimenSourceSite()  {
    CWE ret = null;
    try {
        Type t = this.getField(8, 0);
        ret = (CWE)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns a single repetition of Specimen Source Site Modifier (SPM-9).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getSpecimenSourceSiteModifier(int rep) throws HL7Exception {
    CWE ret = null;
    try {
        Type t = this.getField(9, rep);
        ret = (CWE)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Specimen Source Site Modifier (SPM-9).
   */
  public CWE[] getSpecimenSourceSiteModifier() {
     CWE[] ret = null;
    try {
        Type[] t = this.getField(9);  
        ret = new CWE[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (CWE)t[i];
        }
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns a count of the number of repetitions of Specimen Source Site Modifier (SPM-9).
   */
  public int getSpecimenSourceSiteModifierReps() {
    try {
        return this.getField(9).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Specimen Source Site Modifier (SPM-9) at a given index and returns it.
   * @param index The index
   */
  public CWE insertSpecimenSourceSiteModifier(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(9, index);
  }

  /**
   * Removes a repetition of Specimen Source Site Modifier (SPM-9) at a given index and returns it.
   * @param index The index
   */
  public CWE removeSpecimenSourceSiteModifier(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(9, index);
  }

  /**
   * Returns a single repetition of Specimen Source Site Modifier (SPM-9).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getSpm9_SpecimenSourceSiteModifier(int rep) throws HL7Exception {
    CWE ret = null;
    try {
        Type t = this.getField(9, rep);
        ret = (CWE)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Specimen Source Site Modifier (SPM-9).
   */
  public CWE[] getSpm9_SpecimenSourceSiteModifier() {
     CWE[] ret = null;
    try {
        Type[] t = this.getField(9);  
        ret = new CWE[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (CWE)t[i];
        }
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns a count of the number of repetitions of Specimen Source Site Modifier (SPM-9).
   */
  public int getSpm9_SpecimenSourceSiteModifierReps() {
    try {
        return this.getField(9).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Specimen Source Site Modifier (SPM-9) at a given index and returns it.
   * @param index The index
   */
  public CWE insertSpm9_SpecimenSourceSiteModifier(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(9, index);
  }

  /**
   * Removes a repetition of Specimen Source Site Modifier (SPM-9) at a given index and returns it.
   * @param index The index
   */
  public CWE removeSpm9_SpecimenSourceSiteModifier(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(9, index);
  }

  /**
   * Returns Specimen Collection Site (SPM-10).
   */
  public CWE getSpecimenCollectionSite()  {
    CWE ret = null;
    try {
        Type t = this.getField(10, 0);
        ret = (CWE)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns Specimen Collection Site (SPM-10).
   */
  public CWE getSpm10_SpecimenCollectionSite()  {
    CWE ret = null;
    try {
        Type t = this.getField(10, 0);
        ret = (CWE)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns a single repetition of Specimen Role (SPM-11).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getSpecimenRole(int rep) throws HL7Exception {
    CWE ret = null;
    try {
        Type t = this.getField(11, rep);
        ret = (CWE)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Specimen Role (SPM-11).
   */
  public CWE[] getSpecimenRole() {
     CWE[] ret = null;
    try {
        Type[] t = this.getField(11);  
        ret = new CWE[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (CWE)t[i];
        }
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns a count of the number of repetitions of Specimen Role (SPM-11).
   */
  public int getSpecimenRoleReps() {
    try {
        return this.getField(11).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Specimen Role (SPM-11) at a given index and returns it.
   * @param index The index
   */
  public CWE insertSpecimenRole(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(11, index);
  }

  /**
   * Removes a repetition of Specimen Role (SPM-11) at a given index and returns it.
   * @param index The index
   */
  public CWE removeSpecimenRole(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(11, index);
  }

  /**
   * Returns a single repetition of Specimen Role (SPM-11).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getSpm11_SpecimenRole(int rep) throws HL7Exception {
    CWE ret = null;
    try {
        Type t = this.getField(11, rep);
        ret = (CWE)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Specimen Role (SPM-11).
   */
  public CWE[] getSpm11_SpecimenRole() {
     CWE[] ret = null;
    try {
        Type[] t = this.getField(11);  
        ret = new CWE[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (CWE)t[i];
        }
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns a count of the number of repetitions of Specimen Role (SPM-11).
   */
  public int getSpm11_SpecimenRoleReps() {
    try {
        return this.getField(11).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Specimen Role (SPM-11) at a given index and returns it.
   * @param index The index
   */
  public CWE insertSpm11_SpecimenRole(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(11, index);
  }

  /**
   * Removes a repetition of Specimen Role (SPM-11) at a given index and returns it.
   * @param index The index
   */
  public CWE removeSpm11_SpecimenRole(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(11, index);
  }

  /**
   * Returns Specimen Collection Amount (SPM-12).
   */
  public CQ getSpecimenCollectionAmount()  {
    CQ ret = null;
    try {
        Type t = this.getField(12, 0);
        ret = (CQ)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns Specimen Collection Amount (SPM-12).
   */
  public CQ getSpm12_SpecimenCollectionAmount()  {
    CQ ret = null;
    try {
        Type t = this.getField(12, 0);
        ret = (CQ)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns Grouped Specimen Count (SPM-13).
   */
  public NM getGroupedSpecimenCount()  {
    NM ret = null;
    try {
        Type t = this.getField(13, 0);
        ret = (NM)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns Grouped Specimen Count (SPM-13).
   */
  public NM getSpm13_GroupedSpecimenCount()  {
    NM ret = null;
    try {
        Type t = this.getField(13, 0);
        ret = (NM)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns a single repetition of Specimen Description (SPM-14).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public ST getSpecimenDescription(int rep) throws HL7Exception {
    ST ret = null;
    try {
        Type t = this.getField(14, rep);
        ret = (ST)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Specimen Description (SPM-14).
   */
  public ST[] getSpecimenDescription() {
     ST[] ret = null;
    try {
        Type[] t = this.getField(14);  
        ret = new ST[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (ST)t[i];
        }
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns a count of the number of repetitions of Specimen Description (SPM-14).
   */
  public int getSpecimenDescriptionReps() {
    try {
        return this.getField(14).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Specimen Description (SPM-14) at a given index and returns it.
   * @param index The index
   */
  public ST insertSpecimenDescription(int index) throws HL7Exception {
     return (ST) super.insertRepetition(14, index);
  }

  /**
   * Removes a repetition of Specimen Description (SPM-14) at a given index and returns it.
   * @param index The index
   */
  public ST removeSpecimenDescription(int index) throws HL7Exception {
     return (ST) super.removeRepetition(14, index);
  }

  /**
   * Returns a single repetition of Specimen Description (SPM-14).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public ST getSpm14_SpecimenDescription(int rep) throws HL7Exception {
    ST ret = null;
    try {
        Type t = this.getField(14, rep);
        ret = (ST)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Specimen Description (SPM-14).
   */
  public ST[] getSpm14_SpecimenDescription() {
     ST[] ret = null;
    try {
        Type[] t = this.getField(14);  
        ret = new ST[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (ST)t[i];
        }
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns a count of the number of repetitions of Specimen Description (SPM-14).
   */
  public int getSpm14_SpecimenDescriptionReps() {
    try {
        return this.getField(14).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Specimen Description (SPM-14) at a given index and returns it.
   * @param index The index
   */
  public ST insertSpm14_SpecimenDescription(int index) throws HL7Exception {
     return (ST) super.insertRepetition(14, index);
  }

  /**
   * Removes a repetition of Specimen Description (SPM-14) at a given index and returns it.
   * @param index The index
   */
  public ST removeSpm14_SpecimenDescription(int index) throws HL7Exception {
     return (ST) super.removeRepetition(14, index);
  }

  /**
   * Returns a single repetition of Specimen Handling Code (SPM-15).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getSpecimenHandlingCode(int rep) throws HL7Exception {
    CWE ret = null;
    try {
        Type t = this.getField(15, rep);
        ret = (CWE)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Specimen Handling Code (SPM-15).
   */
  public CWE[] getSpecimenHandlingCode() {
     CWE[] ret = null;
    try {
        Type[] t = this.getField(15);  
        ret = new CWE[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (CWE)t[i];
        }
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns a count of the number of repetitions of Specimen Handling Code (SPM-15).
   */
  public int getSpecimenHandlingCodeReps() {
    try {
        return this.getField(15).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Specimen Handling Code (SPM-15) at a given index and returns it.
   * @param index The index
   */
  public CWE insertSpecimenHandlingCode(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(15, index);
  }

  /**
   * Removes a repetition of Specimen Handling Code (SPM-15) at a given index and returns it.
   * @param index The index
   */
  public CWE removeSpecimenHandlingCode(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(15, index);
  }

  /**
   * Returns a single repetition of Specimen Handling Code (SPM-15).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getSpm15_SpecimenHandlingCode(int rep) throws HL7Exception {
    CWE ret = null;
    try {
        Type t = this.getField(15, rep);
        ret = (CWE)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Specimen Handling Code (SPM-15).
   */
  public CWE[] getSpm15_SpecimenHandlingCode() {
     CWE[] ret = null;
    try {
        Type[] t = this.getField(15);  
        ret = new CWE[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (CWE)t[i];
        }
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns a count of the number of repetitions of Specimen Handling Code (SPM-15).
   */
  public int getSpm15_SpecimenHandlingCodeReps() {
    try {
        return this.getField(15).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Specimen Handling Code (SPM-15) at a given index and returns it.
   * @param index The index
   */
  public CWE insertSpm15_SpecimenHandlingCode(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(15, index);
  }

  /**
   * Removes a repetition of Specimen Handling Code (SPM-15) at a given index and returns it.
   * @param index The index
   */
  public CWE removeSpm15_SpecimenHandlingCode(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(15, index);
  }

  /**
   * Returns a single repetition of Specimen Risk Code (SPM-16).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getSpecimenRiskCode(int rep) throws HL7Exception {
    CWE ret = null;
    try {
        Type t = this.getField(16, rep);
        ret = (CWE)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Specimen Risk Code (SPM-16).
   */
  public CWE[] getSpecimenRiskCode() {
     CWE[] ret = null;
    try {
        Type[] t = this.getField(16);  
        ret = new CWE[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (CWE)t[i];
        }
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns a count of the number of repetitions of Specimen Risk Code (SPM-16).
   */
  public int getSpecimenRiskCodeReps() {
    try {
        return this.getField(16).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Specimen Risk Code (SPM-16) at a given index and returns it.
   * @param index The index
   */
  public CWE insertSpecimenRiskCode(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(16, index);
  }

  /**
   * Removes a repetition of Specimen Risk Code (SPM-16) at a given index and returns it.
   * @param index The index
   */
  public CWE removeSpecimenRiskCode(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(16, index);
  }

  /**
   * Returns a single repetition of Specimen Risk Code (SPM-16).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getSpm16_SpecimenRiskCode(int rep) throws HL7Exception {
    CWE ret = null;
    try {
        Type t = this.getField(16, rep);
        ret = (CWE)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Specimen Risk Code (SPM-16).
   */
  public CWE[] getSpm16_SpecimenRiskCode() {
     CWE[] ret = null;
    try {
        Type[] t = this.getField(16);  
        ret = new CWE[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (CWE)t[i];
        }
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns a count of the number of repetitions of Specimen Risk Code (SPM-16).
   */
  public int getSpm16_SpecimenRiskCodeReps() {
    try {
        return this.getField(16).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Specimen Risk Code (SPM-16) at a given index and returns it.
   * @param index The index
   */
  public CWE insertSpm16_SpecimenRiskCode(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(16, index);
  }

  /**
   * Removes a repetition of Specimen Risk Code (SPM-16) at a given index and returns it.
   * @param index The index
   */
  public CWE removeSpm16_SpecimenRiskCode(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(16, index);
  }

  /**
   * Returns Specimen Collection Date/Time (SPM-17).
   */
  public DR getSpecimenCollectionDateTime()  {
    DR ret = null;
    try {
        Type t = this.getField(17, 0);
        ret = (DR)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns Specimen Collection Date/Time (SPM-17).
   */
  public DR getSpm17_SpecimenCollectionDateTime()  {
    DR ret = null;
    try {
        Type t = this.getField(17, 0);
        ret = (DR)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns Specimen Received Date/Time (SPM-18).
   */
  public DTM getSpecimenReceivedDateTime()  {
    DTM ret = null;
    try {
        Type t = this.getField(18, 0);
        ret = (DTM)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns Specimen Received Date/Time (SPM-18).
   */
  public DTM getSpm18_SpecimenReceivedDateTime()  {
    DTM ret = null;
    try {
        Type t = this.getField(18, 0);
        ret = (DTM)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns Specimen Expiration Date/Time (SPM-19).
   */
  public DTM getSpecimenExpirationDateTime()  {
    DTM ret = null;
    try {
        Type t = this.getField(19, 0);
        ret = (DTM)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns Specimen Expiration Date/Time (SPM-19).
   */
  public DTM getSpm19_SpecimenExpirationDateTime()  {
    DTM ret = null;
    try {
        Type t = this.getField(19, 0);
        ret = (DTM)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns Specimen Availability (SPM-20).
   */
  public ID getSpecimenAvailability()  {
    ID ret = null;
    try {
        Type t = this.getField(20, 0);
        ret = (ID)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns Specimen Availability (SPM-20).
   */
  public ID getSpm20_SpecimenAvailability()  {
    ID ret = null;
    try {
        Type t = this.getField(20, 0);
        ret = (ID)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns a single repetition of Specimen Reject Reason (SPM-21).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getSpecimenRejectReason(int rep) throws HL7Exception {
    CWE ret = null;
    try {
        Type t = this.getField(21, rep);
        ret = (CWE)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Specimen Reject Reason (SPM-21).
   */
  public CWE[] getSpecimenRejectReason() {
     CWE[] ret = null;
    try {
        Type[] t = this.getField(21);  
        ret = new CWE[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (CWE)t[i];
        }
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns a count of the number of repetitions of Specimen Reject Reason (SPM-21).
   */
  public int getSpecimenRejectReasonReps() {
    try {
        return this.getField(21).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Specimen Reject Reason (SPM-21) at a given index and returns it.
   * @param index The index
   */
  public CWE insertSpecimenRejectReason(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(21, index);
  }

  /**
   * Removes a repetition of Specimen Reject Reason (SPM-21) at a given index and returns it.
   * @param index The index
   */
  public CWE removeSpecimenRejectReason(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(21, index);
  }

  /**
   * Returns a single repetition of Specimen Reject Reason (SPM-21).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getSpm21_SpecimenRejectReason(int rep) throws HL7Exception {
    CWE ret = null;
    try {
        Type t = this.getField(21, rep);
        ret = (CWE)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Specimen Reject Reason (SPM-21).
   */
  public CWE[] getSpm21_SpecimenRejectReason() {
     CWE[] ret = null;
    try {
        Type[] t = this.getField(21);  
        ret = new CWE[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (CWE)t[i];
        }
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns a count of the number of repetitions of Specimen Reject Reason (SPM-21).
   */
  public int getSpm21_SpecimenRejectReasonReps() {
    try {
        return this.getField(21).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Specimen Reject Reason (SPM-21) at a given index and returns it.
   * @param index The index
   */
  public CWE insertSpm21_SpecimenRejectReason(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(21, index);
  }

  /**
   * Removes a repetition of Specimen Reject Reason (SPM-21) at a given index and returns it.
   * @param index The index
   */
  public CWE removeSpm21_SpecimenRejectReason(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(21, index);
  }

  /**
   * Returns Specimen Quality (SPM-22).
   */
  public CWE getSpecimenQuality()  {
    CWE ret = null;
    try {
        Type t = this.getField(22, 0);
        ret = (CWE)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns Specimen Quality (SPM-22).
   */
  public CWE getSpm22_SpecimenQuality()  {
    CWE ret = null;
    try {
        Type t = this.getField(22, 0);
        ret = (CWE)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns Specimen Appropriateness (SPM-23).
   */
  public CWE getSpecimenAppropriateness()  {
    CWE ret = null;
    try {
        Type t = this.getField(23, 0);
        ret = (CWE)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns Specimen Appropriateness (SPM-23).
   */
  public CWE getSpm23_SpecimenAppropriateness()  {
    CWE ret = null;
    try {
        Type t = this.getField(23, 0);
        ret = (CWE)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns a single repetition of Specimen Condition (SPM-24).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getSpecimenCondition(int rep) throws HL7Exception {
    CWE ret = null;
    try {
        Type t = this.getField(24, rep);
        ret = (CWE)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Specimen Condition (SPM-24).
   */
  public CWE[] getSpecimenCondition() {
     CWE[] ret = null;
    try {
        Type[] t = this.getField(24);  
        ret = new CWE[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (CWE)t[i];
        }
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns a count of the number of repetitions of Specimen Condition (SPM-24).
   */
  public int getSpecimenConditionReps() {
    try {
        return this.getField(24).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Specimen Condition (SPM-24) at a given index and returns it.
   * @param index The index
   */
  public CWE insertSpecimenCondition(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(24, index);
  }

  /**
   * Removes a repetition of Specimen Condition (SPM-24) at a given index and returns it.
   * @param index The index
   */
  public CWE removeSpecimenCondition(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(24, index);
  }

  /**
   * Returns a single repetition of Specimen Condition (SPM-24).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getSpm24_SpecimenCondition(int rep) throws HL7Exception {
    CWE ret = null;
    try {
        Type t = this.getField(24, rep);
        ret = (CWE)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Specimen Condition (SPM-24).
   */
  public CWE[] getSpm24_SpecimenCondition() {
     CWE[] ret = null;
    try {
        Type[] t = this.getField(24);  
        ret = new CWE[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (CWE)t[i];
        }
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns a count of the number of repetitions of Specimen Condition (SPM-24).
   */
  public int getSpm24_SpecimenConditionReps() {
    try {
        return this.getField(24).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Specimen Condition (SPM-24) at a given index and returns it.
   * @param index The index
   */
  public CWE insertSpm24_SpecimenCondition(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(24, index);
  }

  /**
   * Removes a repetition of Specimen Condition (SPM-24) at a given index and returns it.
   * @param index The index
   */
  public CWE removeSpm24_SpecimenCondition(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(24, index);
  }

  /**
   * Returns Specimen Current Quantity (SPM-25).
   */
  public CQ getSpecimenCurrentQuantity()  {
    CQ ret = null;
    try {
        Type t = this.getField(25, 0);
        ret = (CQ)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns Specimen Current Quantity (SPM-25).
   */
  public CQ getSpm25_SpecimenCurrentQuantity()  {
    CQ ret = null;
    try {
        Type t = this.getField(25, 0);
        ret = (CQ)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns Number of Specimen Containers (SPM-26).
   */
  public NM getNumberOfSpecimenContainers()  {
    NM ret = null;
    try {
        Type t = this.getField(26, 0);
        ret = (NM)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns Number of Specimen Containers (SPM-26).
   */
  public NM getSpm26_NumberOfSpecimenContainers()  {
    NM ret = null;
    try {
        Type t = this.getField(26, 0);
        ret = (NM)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns Container Type (SPM-27).
   */
  public CWE getContainerType()  {
    CWE ret = null;
    try {
        Type t = this.getField(27, 0);
        ret = (CWE)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns Container Type (SPM-27).
   */
  public CWE getSpm27_ContainerType()  {
    CWE ret = null;
    try {
        Type t = this.getField(27, 0);
        ret = (CWE)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns Container Condition (SPM-28).
   */
  public CWE getContainerCondition()  {
    CWE ret = null;
    try {
        Type t = this.getField(28, 0);
        ret = (CWE)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns Container Condition (SPM-28).
   */
  public CWE getSpm28_ContainerCondition()  {
    CWE ret = null;
    try {
        Type t = this.getField(28, 0);
        ret = (CWE)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns Specimen Child Role (SPM-29).
   */
  public CWE getSpecimenChildRole()  {
    CWE ret = null;
    try {
        Type t = this.getField(29, 0);
        ret = (CWE)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns Specimen Child Role (SPM-29).
   */
  public CWE getSpm29_SpecimenChildRole()  {
    CWE ret = null;
    try {
        Type t = this.getField(29, 0);
        ret = (CWE)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

   protected Type createNewTypeWithoutReflection(int field) {
      switch (field) {
         case 0: return new ca.uhn.hl7v2.model.v26.datatype.SI(getMessage());
         case 1: return new ca.uhn.hl7v2.model.v26.datatype.EIP(getMessage());
         case 2: return new ca.uhn.hl7v2.model.v26.datatype.EIP(getMessage());
         case 3: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 4: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 5: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 6: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 7: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 8: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 9: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 10: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 11: return new ca.uhn.hl7v2.model.v26.datatype.CQ(getMessage());
         case 12: return new ca.uhn.hl7v2.model.v26.datatype.NM(getMessage());
         case 13: return new ca.uhn.hl7v2.model.v26.datatype.ST(getMessage());
         case 14: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 15: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 16: return new ca.uhn.hl7v2.model.v26.datatype.DR(getMessage());
         case 17: return new ca.uhn.hl7v2.model.v26.datatype.DTM(getMessage());
         case 18: return new ca.uhn.hl7v2.model.v26.datatype.DTM(getMessage());
         case 19: return new ca.uhn.hl7v2.model.v26.datatype.ID(getMessage(), new Integer(136));
         case 20: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 21: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 22: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 23: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 24: return new ca.uhn.hl7v2.model.v26.datatype.CQ(getMessage());
         case 25: return new ca.uhn.hl7v2.model.v26.datatype.NM(getMessage());
         case 26: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 27: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 28: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         default: return null;
      }
   }

}