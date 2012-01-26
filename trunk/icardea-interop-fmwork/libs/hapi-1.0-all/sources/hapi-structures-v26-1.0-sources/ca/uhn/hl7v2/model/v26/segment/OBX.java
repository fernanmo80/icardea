package ca.uhn.hl7v2.model.v26.segment;

import ca.uhn.hl7v2.model.*;
import ca.uhn.hl7v2.model.v26.datatype.*;
import ca.uhn.log.HapiLogFactory;
import ca.uhn.hl7v2.parser.ModelClassFactory;
import ca.uhn.hl7v2.HL7Exception;

/**
 * <p>Represents an HL7 OBX message segment. 
 * This segment has the following fields:</p><p>
 * OBX-1: Set ID - OBX (SI)<br> 
 * OBX-2: Value Type (ID)<br> 
 * OBX-3: Observation Identifier (CWE)<br> 
 * OBX-4: Observation Sub-ID (ST)<br> 
 * OBX-5: Observation Value (varies)<br> 
 * OBX-6: Units (CWE)<br> 
 * OBX-7: References Range (ST)<br> 
 * OBX-8: Abnormal Flags (IS)<br> 
 * OBX-9: Probability (NM)<br> 
 * OBX-10: Nature of Abnormal Test (ID)<br> 
 * OBX-11: Observation Result Status (ID)<br> 
 * OBX-12: Effective Date of Reference Range (DTM)<br> 
 * OBX-13: User Defined Access Checks (ST)<br> 
 * OBX-14: Date/Time of the Observation (DTM)<br> 
 * OBX-15: Producer's ID (CWE)<br> 
 * OBX-16: Responsible Observer (XCN)<br> 
 * OBX-17: Observation Method (CWE)<br> 
 * OBX-18: Equipment Instance Identifier (EI)<br> 
 * OBX-19: Date/Time of the Analysis (DTM)<br> 
 * OBX-20: Observation Site (CWE)<br> 
 * OBX-21: Observation Instance Identifier (EI)<br> 
 * OBX-22: Mood Code (CNE)<br> 
 * OBX-23: Performing Organization Name (XON)<br> 
 * OBX-24: Performing Organization Address (XAD)<br> 
 * OBX-25: Performing Organization Medical Director (XCN)<br> 
 * </p><p>The get...() methods return data from individual fields.  These methods 
 * do not throw exceptions and may therefore have to handle exceptions internally.  
 * If an exception is handled internally, it is logged and null is returned.  
 * This is not expected to happen - if it does happen this indicates not so much 
 * an exceptional circumstance as a bug in the code for this class.</p>    
 */
public class OBX extends AbstractSegment  {

  /**
   * Creates a OBX (Observation/Result) segment object that belongs to the given 
   * message.  
   */
  public OBX(Group parent, ModelClassFactory factory) {
    super(parent, factory);
    Message message = getMessage();
    try {
       this.add(SI.class, false, 1, 4, new Object[]{message}, "Set ID - OBX");
       this.add(ID.class, false, 1, 3, new Object[]{message, new Integer(125)}, "Value Type");
       this.add(CWE.class, true, 1, 705, new Object[]{message}, "Observation Identifier");
       this.add(ST.class, false, 1, 20, new Object[]{message}, "Observation Sub-ID");
       this.add(Varies.class, false, 0, 65536, new Object[]{message}, "Observation Value");
       this.add(CWE.class, false, 1, 705, new Object[]{message}, "Units");
       this.add(ST.class, false, 1, 60, new Object[]{message}, "References Range");
       this.add(IS.class, false, 0, 5, new Object[]{message, new Integer(78)}, "Abnormal Flags");
       this.add(NM.class, false, 1, 5, new Object[]{message}, "Probability");
       this.add(ID.class, false, 0, 2, new Object[]{message, new Integer(80)}, "Nature of Abnormal Test");
       this.add(ID.class, true, 1, 1, new Object[]{message, new Integer(85)}, "Observation Result Status");
       this.add(DTM.class, false, 1, 24, new Object[]{message}, "Effective Date of Reference Range");
       this.add(ST.class, false, 1, 20, new Object[]{message}, "User Defined Access Checks");
       this.add(DTM.class, false, 1, 24, new Object[]{message}, "Date/Time of the Observation");
       this.add(CWE.class, false, 1, 705, new Object[]{message}, "Producer's ID");
       this.add(XCN.class, false, 0, 3220, new Object[]{message}, "Responsible Observer");
       this.add(CWE.class, false, 0, 705, new Object[]{message}, "Observation Method");
       this.add(EI.class, false, 0, 427, new Object[]{message}, "Equipment Instance Identifier");
       this.add(DTM.class, false, 1, 24, new Object[]{message}, "Date/Time of the Analysis");
       this.add(CWE.class, false, 0, 705, new Object[]{message}, "Observation Site");
       this.add(EI.class, false, 1, 427, new Object[]{message}, "Observation Instance Identifier");
       this.add(CNE.class, false, 1, 705, new Object[]{message}, "Mood Code");
       this.add(XON.class, false, 1, 570, new Object[]{message}, "Performing Organization Name");
       this.add(XAD.class, false, 1, 2915, new Object[]{message}, "Performing Organization Address");
       this.add(XCN.class, false, 1, 3220, new Object[]{message}, "Performing Organization Medical Director");
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Can't instantiate " + this.getClass().getName(), he);
    }
  }

  /**
   * Returns Set ID - OBX (OBX-1).
   */
  public SI getSetIDOBX()  {
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
   * Returns Set ID - OBX (OBX-1).
   */
  public SI getObx1_SetIDOBX()  {
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
   * Returns Value Type (OBX-2).
   */
  public ID getValueType()  {
    ID ret = null;
    try {
        Type t = this.getField(2, 0);
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
   * Returns Value Type (OBX-2).
   */
  public ID getObx2_ValueType()  {
    ID ret = null;
    try {
        Type t = this.getField(2, 0);
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
   * Returns Observation Identifier (OBX-3).
   */
  public CWE getObservationIdentifier()  {
    CWE ret = null;
    try {
        Type t = this.getField(3, 0);
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
   * Returns Observation Identifier (OBX-3).
   */
  public CWE getObx3_ObservationIdentifier()  {
    CWE ret = null;
    try {
        Type t = this.getField(3, 0);
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
   * Returns Observation Sub-ID (OBX-4).
   */
  public ST getObservationSubID()  {
    ST ret = null;
    try {
        Type t = this.getField(4, 0);
        ret = (ST)t;
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
   * Returns Observation Sub-ID (OBX-4).
   */
  public ST getObx4_ObservationSubID()  {
    ST ret = null;
    try {
        Type t = this.getField(4, 0);
        ret = (ST)t;
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
   * Returns a single repetition of Observation Value (OBX-5).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public Varies getObservationValue(int rep) throws HL7Exception {
    Varies ret = null;
    try {
        Type t = this.getField(5, rep);
        ret = (Varies)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Observation Value (OBX-5).
   */
  public Varies[] getObservationValue() {
     Varies[] ret = null;
    try {
        Type[] t = this.getField(5);  
        ret = new Varies[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (Varies)t[i];
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
   * Returns a count of the number of repetitions of Observation Value (OBX-5).
   */
  public int getObservationValueReps() {
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
   * Inserts a repetition of Observation Value (OBX-5) at a given index and returns it.
   * @param index The index
   */
  public Varies insertObservationValue(int index) throws HL7Exception {
     return (Varies) super.insertRepetition(5, index);
  }

  /**
   * Removes a repetition of Observation Value (OBX-5) at a given index and returns it.
   * @param index The index
   */
  public Varies removeObservationValue(int index) throws HL7Exception {
     return (Varies) super.removeRepetition(5, index);
  }

  /**
   * Returns a single repetition of Observation Value (OBX-5).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public Varies getObx5_ObservationValue(int rep) throws HL7Exception {
    Varies ret = null;
    try {
        Type t = this.getField(5, rep);
        ret = (Varies)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Observation Value (OBX-5).
   */
  public Varies[] getObx5_ObservationValue() {
     Varies[] ret = null;
    try {
        Type[] t = this.getField(5);  
        ret = new Varies[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (Varies)t[i];
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
   * Returns a count of the number of repetitions of Observation Value (OBX-5).
   */
  public int getObx5_ObservationValueReps() {
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
   * Inserts a repetition of Observation Value (OBX-5) at a given index and returns it.
   * @param index The index
   */
  public Varies insertObx5_ObservationValue(int index) throws HL7Exception {
     return (Varies) super.insertRepetition(5, index);
  }

  /**
   * Removes a repetition of Observation Value (OBX-5) at a given index and returns it.
   * @param index The index
   */
  public Varies removeObx5_ObservationValue(int index) throws HL7Exception {
     return (Varies) super.removeRepetition(5, index);
  }

  /**
   * Returns Units (OBX-6).
   */
  public CWE getUnits()  {
    CWE ret = null;
    try {
        Type t = this.getField(6, 0);
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
   * Returns Units (OBX-6).
   */
  public CWE getObx6_Units()  {
    CWE ret = null;
    try {
        Type t = this.getField(6, 0);
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
   * Returns References Range (OBX-7).
   */
  public ST getReferencesRange()  {
    ST ret = null;
    try {
        Type t = this.getField(7, 0);
        ret = (ST)t;
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
   * Returns References Range (OBX-7).
   */
  public ST getObx7_ReferencesRange()  {
    ST ret = null;
    try {
        Type t = this.getField(7, 0);
        ret = (ST)t;
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
   * Returns a single repetition of Abnormal Flags (OBX-8).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public IS getAbnormalFlags(int rep) throws HL7Exception {
    IS ret = null;
    try {
        Type t = this.getField(8, rep);
        ret = (IS)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Abnormal Flags (OBX-8).
   */
  public IS[] getAbnormalFlags() {
     IS[] ret = null;
    try {
        Type[] t = this.getField(8);  
        ret = new IS[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (IS)t[i];
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
   * Returns a count of the number of repetitions of Abnormal Flags (OBX-8).
   */
  public int getAbnormalFlagsReps() {
    try {
        return this.getField(8).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Abnormal Flags (OBX-8) at a given index and returns it.
   * @param index The index
   */
  public IS insertAbnormalFlags(int index) throws HL7Exception {
     return (IS) super.insertRepetition(8, index);
  }

  /**
   * Removes a repetition of Abnormal Flags (OBX-8) at a given index and returns it.
   * @param index The index
   */
  public IS removeAbnormalFlags(int index) throws HL7Exception {
     return (IS) super.removeRepetition(8, index);
  }

  /**
   * Returns a single repetition of Abnormal Flags (OBX-8).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public IS getObx8_AbnormalFlags(int rep) throws HL7Exception {
    IS ret = null;
    try {
        Type t = this.getField(8, rep);
        ret = (IS)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Abnormal Flags (OBX-8).
   */
  public IS[] getObx8_AbnormalFlags() {
     IS[] ret = null;
    try {
        Type[] t = this.getField(8);  
        ret = new IS[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (IS)t[i];
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
   * Returns a count of the number of repetitions of Abnormal Flags (OBX-8).
   */
  public int getObx8_AbnormalFlagsReps() {
    try {
        return this.getField(8).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Abnormal Flags (OBX-8) at a given index and returns it.
   * @param index The index
   */
  public IS insertObx8_AbnormalFlags(int index) throws HL7Exception {
     return (IS) super.insertRepetition(8, index);
  }

  /**
   * Removes a repetition of Abnormal Flags (OBX-8) at a given index and returns it.
   * @param index The index
   */
  public IS removeObx8_AbnormalFlags(int index) throws HL7Exception {
     return (IS) super.removeRepetition(8, index);
  }

  /**
   * Returns Probability (OBX-9).
   */
  public NM getProbability()  {
    NM ret = null;
    try {
        Type t = this.getField(9, 0);
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
   * Returns Probability (OBX-9).
   */
  public NM getObx9_Probability()  {
    NM ret = null;
    try {
        Type t = this.getField(9, 0);
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
   * Returns a single repetition of Nature of Abnormal Test (OBX-10).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public ID getNatureOfAbnormalTest(int rep) throws HL7Exception {
    ID ret = null;
    try {
        Type t = this.getField(10, rep);
        ret = (ID)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Nature of Abnormal Test (OBX-10).
   */
  public ID[] getNatureOfAbnormalTest() {
     ID[] ret = null;
    try {
        Type[] t = this.getField(10);  
        ret = new ID[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (ID)t[i];
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
   * Returns a count of the number of repetitions of Nature of Abnormal Test (OBX-10).
   */
  public int getNatureOfAbnormalTestReps() {
    try {
        return this.getField(10).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Nature of Abnormal Test (OBX-10) at a given index and returns it.
   * @param index The index
   */
  public ID insertNatureOfAbnormalTest(int index) throws HL7Exception {
     return (ID) super.insertRepetition(10, index);
  }

  /**
   * Removes a repetition of Nature of Abnormal Test (OBX-10) at a given index and returns it.
   * @param index The index
   */
  public ID removeNatureOfAbnormalTest(int index) throws HL7Exception {
     return (ID) super.removeRepetition(10, index);
  }

  /**
   * Returns a single repetition of Nature of Abnormal Test (OBX-10).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public ID getObx10_NatureOfAbnormalTest(int rep) throws HL7Exception {
    ID ret = null;
    try {
        Type t = this.getField(10, rep);
        ret = (ID)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Nature of Abnormal Test (OBX-10).
   */
  public ID[] getObx10_NatureOfAbnormalTest() {
     ID[] ret = null;
    try {
        Type[] t = this.getField(10);  
        ret = new ID[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (ID)t[i];
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
   * Returns a count of the number of repetitions of Nature of Abnormal Test (OBX-10).
   */
  public int getObx10_NatureOfAbnormalTestReps() {
    try {
        return this.getField(10).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Nature of Abnormal Test (OBX-10) at a given index and returns it.
   * @param index The index
   */
  public ID insertObx10_NatureOfAbnormalTest(int index) throws HL7Exception {
     return (ID) super.insertRepetition(10, index);
  }

  /**
   * Removes a repetition of Nature of Abnormal Test (OBX-10) at a given index and returns it.
   * @param index The index
   */
  public ID removeObx10_NatureOfAbnormalTest(int index) throws HL7Exception {
     return (ID) super.removeRepetition(10, index);
  }

  /**
   * Returns Observation Result Status (OBX-11).
   */
  public ID getObservationResultStatus()  {
    ID ret = null;
    try {
        Type t = this.getField(11, 0);
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
   * Returns Observation Result Status (OBX-11).
   */
  public ID getObx11_ObservationResultStatus()  {
    ID ret = null;
    try {
        Type t = this.getField(11, 0);
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
   * Returns Effective Date of Reference Range (OBX-12).
   */
  public DTM getEffectiveDateOfReferenceRange()  {
    DTM ret = null;
    try {
        Type t = this.getField(12, 0);
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
   * Returns Effective Date of Reference Range (OBX-12).
   */
  public DTM getObx12_EffectiveDateOfReferenceRange()  {
    DTM ret = null;
    try {
        Type t = this.getField(12, 0);
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
   * Returns User Defined Access Checks (OBX-13).
   */
  public ST getUserDefinedAccessChecks()  {
    ST ret = null;
    try {
        Type t = this.getField(13, 0);
        ret = (ST)t;
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
   * Returns User Defined Access Checks (OBX-13).
   */
  public ST getObx13_UserDefinedAccessChecks()  {
    ST ret = null;
    try {
        Type t = this.getField(13, 0);
        ret = (ST)t;
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
   * Returns Date/Time of the Observation (OBX-14).
   */
  public DTM getDateTimeOfTheObservation()  {
    DTM ret = null;
    try {
        Type t = this.getField(14, 0);
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
   * Returns Date/Time of the Observation (OBX-14).
   */
  public DTM getObx14_DateTimeOfTheObservation()  {
    DTM ret = null;
    try {
        Type t = this.getField(14, 0);
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
   * Returns Producer's ID (OBX-15).
   */
  public CWE getProducerSID()  {
    CWE ret = null;
    try {
        Type t = this.getField(15, 0);
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
   * Returns Producer's ID (OBX-15).
   */
  public CWE getObx15_ProducerSID()  {
    CWE ret = null;
    try {
        Type t = this.getField(15, 0);
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
   * Returns a single repetition of Responsible Observer (OBX-16).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XCN getResponsibleObserver(int rep) throws HL7Exception {
    XCN ret = null;
    try {
        Type t = this.getField(16, rep);
        ret = (XCN)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Responsible Observer (OBX-16).
   */
  public XCN[] getResponsibleObserver() {
     XCN[] ret = null;
    try {
        Type[] t = this.getField(16);  
        ret = new XCN[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (XCN)t[i];
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
   * Returns a count of the number of repetitions of Responsible Observer (OBX-16).
   */
  public int getResponsibleObserverReps() {
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
   * Inserts a repetition of Responsible Observer (OBX-16) at a given index and returns it.
   * @param index The index
   */
  public XCN insertResponsibleObserver(int index) throws HL7Exception {
     return (XCN) super.insertRepetition(16, index);
  }

  /**
   * Removes a repetition of Responsible Observer (OBX-16) at a given index and returns it.
   * @param index The index
   */
  public XCN removeResponsibleObserver(int index) throws HL7Exception {
     return (XCN) super.removeRepetition(16, index);
  }

  /**
   * Returns a single repetition of Responsible Observer (OBX-16).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XCN getObx16_ResponsibleObserver(int rep) throws HL7Exception {
    XCN ret = null;
    try {
        Type t = this.getField(16, rep);
        ret = (XCN)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Responsible Observer (OBX-16).
   */
  public XCN[] getObx16_ResponsibleObserver() {
     XCN[] ret = null;
    try {
        Type[] t = this.getField(16);  
        ret = new XCN[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (XCN)t[i];
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
   * Returns a count of the number of repetitions of Responsible Observer (OBX-16).
   */
  public int getObx16_ResponsibleObserverReps() {
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
   * Inserts a repetition of Responsible Observer (OBX-16) at a given index and returns it.
   * @param index The index
   */
  public XCN insertObx16_ResponsibleObserver(int index) throws HL7Exception {
     return (XCN) super.insertRepetition(16, index);
  }

  /**
   * Removes a repetition of Responsible Observer (OBX-16) at a given index and returns it.
   * @param index The index
   */
  public XCN removeObx16_ResponsibleObserver(int index) throws HL7Exception {
     return (XCN) super.removeRepetition(16, index);
  }

  /**
   * Returns a single repetition of Observation Method (OBX-17).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getObservationMethod(int rep) throws HL7Exception {
    CWE ret = null;
    try {
        Type t = this.getField(17, rep);
        ret = (CWE)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Observation Method (OBX-17).
   */
  public CWE[] getObservationMethod() {
     CWE[] ret = null;
    try {
        Type[] t = this.getField(17);  
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
   * Returns a count of the number of repetitions of Observation Method (OBX-17).
   */
  public int getObservationMethodReps() {
    try {
        return this.getField(17).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Observation Method (OBX-17) at a given index and returns it.
   * @param index The index
   */
  public CWE insertObservationMethod(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(17, index);
  }

  /**
   * Removes a repetition of Observation Method (OBX-17) at a given index and returns it.
   * @param index The index
   */
  public CWE removeObservationMethod(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(17, index);
  }

  /**
   * Returns a single repetition of Observation Method (OBX-17).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getObx17_ObservationMethod(int rep) throws HL7Exception {
    CWE ret = null;
    try {
        Type t = this.getField(17, rep);
        ret = (CWE)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Observation Method (OBX-17).
   */
  public CWE[] getObx17_ObservationMethod() {
     CWE[] ret = null;
    try {
        Type[] t = this.getField(17);  
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
   * Returns a count of the number of repetitions of Observation Method (OBX-17).
   */
  public int getObx17_ObservationMethodReps() {
    try {
        return this.getField(17).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Observation Method (OBX-17) at a given index and returns it.
   * @param index The index
   */
  public CWE insertObx17_ObservationMethod(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(17, index);
  }

  /**
   * Removes a repetition of Observation Method (OBX-17) at a given index and returns it.
   * @param index The index
   */
  public CWE removeObx17_ObservationMethod(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(17, index);
  }

  /**
   * Returns a single repetition of Equipment Instance Identifier (OBX-18).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public EI getEquipmentInstanceIdentifier(int rep) throws HL7Exception {
    EI ret = null;
    try {
        Type t = this.getField(18, rep);
        ret = (EI)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Equipment Instance Identifier (OBX-18).
   */
  public EI[] getEquipmentInstanceIdentifier() {
     EI[] ret = null;
    try {
        Type[] t = this.getField(18);  
        ret = new EI[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (EI)t[i];
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
   * Returns a count of the number of repetitions of Equipment Instance Identifier (OBX-18).
   */
  public int getEquipmentInstanceIdentifierReps() {
    try {
        return this.getField(18).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Equipment Instance Identifier (OBX-18) at a given index and returns it.
   * @param index The index
   */
  public EI insertEquipmentInstanceIdentifier(int index) throws HL7Exception {
     return (EI) super.insertRepetition(18, index);
  }

  /**
   * Removes a repetition of Equipment Instance Identifier (OBX-18) at a given index and returns it.
   * @param index The index
   */
  public EI removeEquipmentInstanceIdentifier(int index) throws HL7Exception {
     return (EI) super.removeRepetition(18, index);
  }

  /**
   * Returns a single repetition of Equipment Instance Identifier (OBX-18).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public EI getObx18_EquipmentInstanceIdentifier(int rep) throws HL7Exception {
    EI ret = null;
    try {
        Type t = this.getField(18, rep);
        ret = (EI)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Equipment Instance Identifier (OBX-18).
   */
  public EI[] getObx18_EquipmentInstanceIdentifier() {
     EI[] ret = null;
    try {
        Type[] t = this.getField(18);  
        ret = new EI[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (EI)t[i];
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
   * Returns a count of the number of repetitions of Equipment Instance Identifier (OBX-18).
   */
  public int getObx18_EquipmentInstanceIdentifierReps() {
    try {
        return this.getField(18).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Equipment Instance Identifier (OBX-18) at a given index and returns it.
   * @param index The index
   */
  public EI insertObx18_EquipmentInstanceIdentifier(int index) throws HL7Exception {
     return (EI) super.insertRepetition(18, index);
  }

  /**
   * Removes a repetition of Equipment Instance Identifier (OBX-18) at a given index and returns it.
   * @param index The index
   */
  public EI removeObx18_EquipmentInstanceIdentifier(int index) throws HL7Exception {
     return (EI) super.removeRepetition(18, index);
  }

  /**
   * Returns Date/Time of the Analysis (OBX-19).
   */
  public DTM getDateTimeOfTheAnalysis()  {
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
   * Returns Date/Time of the Analysis (OBX-19).
   */
  public DTM getObx19_DateTimeOfTheAnalysis()  {
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
   * Returns a single repetition of Observation Site (OBX-20).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getObservationSite(int rep) throws HL7Exception {
    CWE ret = null;
    try {
        Type t = this.getField(20, rep);
        ret = (CWE)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Observation Site (OBX-20).
   */
  public CWE[] getObservationSite() {
     CWE[] ret = null;
    try {
        Type[] t = this.getField(20);  
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
   * Returns a count of the number of repetitions of Observation Site (OBX-20).
   */
  public int getObservationSiteReps() {
    try {
        return this.getField(20).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Observation Site (OBX-20) at a given index and returns it.
   * @param index The index
   */
  public CWE insertObservationSite(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(20, index);
  }

  /**
   * Removes a repetition of Observation Site (OBX-20) at a given index and returns it.
   * @param index The index
   */
  public CWE removeObservationSite(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(20, index);
  }

  /**
   * Returns a single repetition of Observation Site (OBX-20).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getObx20_ObservationSite(int rep) throws HL7Exception {
    CWE ret = null;
    try {
        Type t = this.getField(20, rep);
        ret = (CWE)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Observation Site (OBX-20).
   */
  public CWE[] getObx20_ObservationSite() {
     CWE[] ret = null;
    try {
        Type[] t = this.getField(20);  
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
   * Returns a count of the number of repetitions of Observation Site (OBX-20).
   */
  public int getObx20_ObservationSiteReps() {
    try {
        return this.getField(20).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Observation Site (OBX-20) at a given index and returns it.
   * @param index The index
   */
  public CWE insertObx20_ObservationSite(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(20, index);
  }

  /**
   * Removes a repetition of Observation Site (OBX-20) at a given index and returns it.
   * @param index The index
   */
  public CWE removeObx20_ObservationSite(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(20, index);
  }

  /**
   * Returns Observation Instance Identifier (OBX-21).
   */
  public EI getObservationInstanceIdentifier()  {
    EI ret = null;
    try {
        Type t = this.getField(21, 0);
        ret = (EI)t;
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
   * Returns Observation Instance Identifier (OBX-21).
   */
  public EI getObx21_ObservationInstanceIdentifier()  {
    EI ret = null;
    try {
        Type t = this.getField(21, 0);
        ret = (EI)t;
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
   * Returns Mood Code (OBX-22).
   */
  public CNE getMoodCode()  {
    CNE ret = null;
    try {
        Type t = this.getField(22, 0);
        ret = (CNE)t;
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
   * Returns Mood Code (OBX-22).
   */
  public CNE getObx22_MoodCode()  {
    CNE ret = null;
    try {
        Type t = this.getField(22, 0);
        ret = (CNE)t;
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
   * Returns Performing Organization Name (OBX-23).
   */
  public XON getPerformingOrganizationName()  {
    XON ret = null;
    try {
        Type t = this.getField(23, 0);
        ret = (XON)t;
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
   * Returns Performing Organization Name (OBX-23).
   */
  public XON getObx23_PerformingOrganizationName()  {
    XON ret = null;
    try {
        Type t = this.getField(23, 0);
        ret = (XON)t;
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
   * Returns Performing Organization Address (OBX-24).
   */
  public XAD getPerformingOrganizationAddress()  {
    XAD ret = null;
    try {
        Type t = this.getField(24, 0);
        ret = (XAD)t;
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
   * Returns Performing Organization Address (OBX-24).
   */
  public XAD getObx24_PerformingOrganizationAddress()  {
    XAD ret = null;
    try {
        Type t = this.getField(24, 0);
        ret = (XAD)t;
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
   * Returns Performing Organization Medical Director (OBX-25).
   */
  public XCN getPerformingOrganizationMedicalDirector()  {
    XCN ret = null;
    try {
        Type t = this.getField(25, 0);
        ret = (XCN)t;
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
   * Returns Performing Organization Medical Director (OBX-25).
   */
  public XCN getObx25_PerformingOrganizationMedicalDirector()  {
    XCN ret = null;
    try {
        Type t = this.getField(25, 0);
        ret = (XCN)t;
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
         case 1: return new ca.uhn.hl7v2.model.v26.datatype.ID(getMessage(), new Integer(125));
         case 2: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 3: return new ca.uhn.hl7v2.model.v26.datatype.ST(getMessage());
         case 4: return new Varies(getMessage());
         case 5: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 6: return new ca.uhn.hl7v2.model.v26.datatype.ST(getMessage());
         case 7: return new ca.uhn.hl7v2.model.v26.datatype.IS(getMessage(), new Integer(78));
         case 8: return new ca.uhn.hl7v2.model.v26.datatype.NM(getMessage());
         case 9: return new ca.uhn.hl7v2.model.v26.datatype.ID(getMessage(), new Integer(80));
         case 10: return new ca.uhn.hl7v2.model.v26.datatype.ID(getMessage(), new Integer(85));
         case 11: return new ca.uhn.hl7v2.model.v26.datatype.DTM(getMessage());
         case 12: return new ca.uhn.hl7v2.model.v26.datatype.ST(getMessage());
         case 13: return new ca.uhn.hl7v2.model.v26.datatype.DTM(getMessage());
         case 14: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 15: return new ca.uhn.hl7v2.model.v26.datatype.XCN(getMessage());
         case 16: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 17: return new ca.uhn.hl7v2.model.v26.datatype.EI(getMessage());
         case 18: return new ca.uhn.hl7v2.model.v26.datatype.DTM(getMessage());
         case 19: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 20: return new ca.uhn.hl7v2.model.v26.datatype.EI(getMessage());
         case 21: return new ca.uhn.hl7v2.model.v26.datatype.CNE(getMessage());
         case 22: return new ca.uhn.hl7v2.model.v26.datatype.XON(getMessage());
         case 23: return new ca.uhn.hl7v2.model.v26.datatype.XAD(getMessage());
         case 24: return new ca.uhn.hl7v2.model.v26.datatype.XCN(getMessage());
         default: return null;
      }
   }

}