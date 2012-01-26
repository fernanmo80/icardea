package ca.uhn.hl7v2.model.v26.segment;

import ca.uhn.hl7v2.model.*;
import ca.uhn.hl7v2.model.v26.datatype.*;
import ca.uhn.log.HapiLogFactory;
import ca.uhn.hl7v2.parser.ModelClassFactory;
import ca.uhn.hl7v2.HL7Exception;

/**
 * <p>Represents an HL7 PEO message segment. 
 * This segment has the following fields:</p><p>
 * PEO-1: Event Identifiers Used (CWE)<br> 
 * PEO-2: Event Symptom/Diagnosis Code (CWE)<br> 
 * PEO-3: Event Onset Date/Time (DTM)<br> 
 * PEO-4: Event Exacerbation Date/Time (DTM)<br> 
 * PEO-5: Event Improved Date/Time (DTM)<br> 
 * PEO-6: Event Ended Data/Time (DTM)<br> 
 * PEO-7: Event Location Occurred Address (XAD)<br> 
 * PEO-8: Event Qualification (ID)<br> 
 * PEO-9: Event Serious (ID)<br> 
 * PEO-10: Event Expected (ID)<br> 
 * PEO-11: Event Outcome (ID)<br> 
 * PEO-12: Patient Outcome (ID)<br> 
 * PEO-13: Event Description from Others (FT)<br> 
 * PEO-14: Event Description from Original Reporter (FT)<br> 
 * PEO-15: Event Description from Patient (FT)<br> 
 * PEO-16: Event Description from Practitioner (FT)<br> 
 * PEO-17: Event Description from Autopsy (FT)<br> 
 * PEO-18: Cause Of Death (CWE)<br> 
 * PEO-19: Primary Observer Name (XPN)<br> 
 * PEO-20: Primary Observer Address (XAD)<br> 
 * PEO-21: Primary Observer Telephone (XTN)<br> 
 * PEO-22: Primary Observer's Qualification (ID)<br> 
 * PEO-23: Confirmation Provided By (ID)<br> 
 * PEO-24: Primary Observer Aware Date/Time (DTM)<br> 
 * PEO-25: Primary Observer's identity May Be Divulged (ID)<br> 
 * </p><p>The get...() methods return data from individual fields.  These methods 
 * do not throw exceptions and may therefore have to handle exceptions internally.  
 * If an exception is handled internally, it is logged and null is returned.  
 * This is not expected to happen - if it does happen this indicates not so much 
 * an exceptional circumstance as a bug in the code for this class.</p>    
 */
public class PEO extends AbstractSegment  {

  /**
   * Creates a PEO (Product Experience Observation) segment object that belongs to the given 
   * message.  
   */
  public PEO(Group parent, ModelClassFactory factory) {
    super(parent, factory);
    Message message = getMessage();
    try {
       this.add(CWE.class, false, 0, 705, new Object[]{message}, "Event Identifiers Used");
       this.add(CWE.class, false, 0, 705, new Object[]{message}, "Event Symptom/Diagnosis Code");
       this.add(DTM.class, true, 1, 24, new Object[]{message}, "Event Onset Date/Time");
       this.add(DTM.class, false, 1, 24, new Object[]{message}, "Event Exacerbation Date/Time");
       this.add(DTM.class, false, 1, 24, new Object[]{message}, "Event Improved Date/Time");
       this.add(DTM.class, false, 1, 24, new Object[]{message}, "Event Ended Data/Time");
       this.add(XAD.class, false, 0, 2915, new Object[]{message}, "Event Location Occurred Address");
       this.add(ID.class, false, 0, 1, new Object[]{message, new Integer(237)}, "Event Qualification");
       this.add(ID.class, false, 1, 1, new Object[]{message, new Integer(238)}, "Event Serious");
       this.add(ID.class, false, 1, 1, new Object[]{message, new Integer(239)}, "Event Expected");
       this.add(ID.class, false, 0, 1, new Object[]{message, new Integer(240)}, "Event Outcome");
       this.add(ID.class, false, 1, 1, new Object[]{message, new Integer(241)}, "Patient Outcome");
       this.add(FT.class, false, 0, 600, new Object[]{message}, "Event Description from Others");
       this.add(FT.class, false, 0, 600, new Object[]{message}, "Event Description from Original Reporter");
       this.add(FT.class, false, 0, 600, new Object[]{message}, "Event Description from Patient");
       this.add(FT.class, false, 0, 600, new Object[]{message}, "Event Description from Practitioner");
       this.add(FT.class, false, 0, 600, new Object[]{message}, "Event Description from Autopsy");
       this.add(CWE.class, false, 0, 705, new Object[]{message}, "Cause Of Death");
       this.add(XPN.class, false, 0, 1317, new Object[]{message}, "Primary Observer Name");
       this.add(XAD.class, false, 0, 2915, new Object[]{message}, "Primary Observer Address");
       this.add(XTN.class, false, 0, 2743, new Object[]{message}, "Primary Observer Telephone");
       this.add(ID.class, false, 1, 1, new Object[]{message, new Integer(242)}, "Primary Observer's Qualification");
       this.add(ID.class, false, 1, 1, new Object[]{message, new Integer(242)}, "Confirmation Provided By");
       this.add(DTM.class, false, 1, 24, new Object[]{message}, "Primary Observer Aware Date/Time");
       this.add(ID.class, false, 1, 1, new Object[]{message, new Integer(243)}, "Primary Observer's identity May Be Divulged");
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Can't instantiate " + this.getClass().getName(), he);
    }
  }

  /**
   * Returns a single repetition of Event Identifiers Used (PEO-1).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getEventIdentifiersUsed(int rep) throws HL7Exception {
    CWE ret = null;
    try {
        Type t = this.getField(1, rep);
        ret = (CWE)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Event Identifiers Used (PEO-1).
   */
  public CWE[] getEventIdentifiersUsed() {
     CWE[] ret = null;
    try {
        Type[] t = this.getField(1);  
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
   * Returns a count of the number of repetitions of Event Identifiers Used (PEO-1).
   */
  public int getEventIdentifiersUsedReps() {
    try {
        return this.getField(1).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Event Identifiers Used (PEO-1) at a given index and returns it.
   * @param index The index
   */
  public CWE insertEventIdentifiersUsed(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(1, index);
  }

  /**
   * Removes a repetition of Event Identifiers Used (PEO-1) at a given index and returns it.
   * @param index The index
   */
  public CWE removeEventIdentifiersUsed(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(1, index);
  }

  /**
   * Returns a single repetition of Event Identifiers Used (PEO-1).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getPeo1_EventIdentifiersUsed(int rep) throws HL7Exception {
    CWE ret = null;
    try {
        Type t = this.getField(1, rep);
        ret = (CWE)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Event Identifiers Used (PEO-1).
   */
  public CWE[] getPeo1_EventIdentifiersUsed() {
     CWE[] ret = null;
    try {
        Type[] t = this.getField(1);  
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
   * Returns a count of the number of repetitions of Event Identifiers Used (PEO-1).
   */
  public int getPeo1_EventIdentifiersUsedReps() {
    try {
        return this.getField(1).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Event Identifiers Used (PEO-1) at a given index and returns it.
   * @param index The index
   */
  public CWE insertPeo1_EventIdentifiersUsed(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(1, index);
  }

  /**
   * Removes a repetition of Event Identifiers Used (PEO-1) at a given index and returns it.
   * @param index The index
   */
  public CWE removePeo1_EventIdentifiersUsed(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(1, index);
  }

  /**
   * Returns a single repetition of Event Symptom/Diagnosis Code (PEO-2).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getEventSymptomDiagnosisCode(int rep) throws HL7Exception {
    CWE ret = null;
    try {
        Type t = this.getField(2, rep);
        ret = (CWE)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Event Symptom/Diagnosis Code (PEO-2).
   */
  public CWE[] getEventSymptomDiagnosisCode() {
     CWE[] ret = null;
    try {
        Type[] t = this.getField(2);  
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
   * Returns a count of the number of repetitions of Event Symptom/Diagnosis Code (PEO-2).
   */
  public int getEventSymptomDiagnosisCodeReps() {
    try {
        return this.getField(2).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Event Symptom/Diagnosis Code (PEO-2) at a given index and returns it.
   * @param index The index
   */
  public CWE insertEventSymptomDiagnosisCode(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(2, index);
  }

  /**
   * Removes a repetition of Event Symptom/Diagnosis Code (PEO-2) at a given index and returns it.
   * @param index The index
   */
  public CWE removeEventSymptomDiagnosisCode(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(2, index);
  }

  /**
   * Returns a single repetition of Event Symptom/Diagnosis Code (PEO-2).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getPeo2_EventSymptomDiagnosisCode(int rep) throws HL7Exception {
    CWE ret = null;
    try {
        Type t = this.getField(2, rep);
        ret = (CWE)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Event Symptom/Diagnosis Code (PEO-2).
   */
  public CWE[] getPeo2_EventSymptomDiagnosisCode() {
     CWE[] ret = null;
    try {
        Type[] t = this.getField(2);  
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
   * Returns a count of the number of repetitions of Event Symptom/Diagnosis Code (PEO-2).
   */
  public int getPeo2_EventSymptomDiagnosisCodeReps() {
    try {
        return this.getField(2).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Event Symptom/Diagnosis Code (PEO-2) at a given index and returns it.
   * @param index The index
   */
  public CWE insertPeo2_EventSymptomDiagnosisCode(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(2, index);
  }

  /**
   * Removes a repetition of Event Symptom/Diagnosis Code (PEO-2) at a given index and returns it.
   * @param index The index
   */
  public CWE removePeo2_EventSymptomDiagnosisCode(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(2, index);
  }

  /**
   * Returns Event Onset Date/Time (PEO-3).
   */
  public DTM getEventOnsetDateTime()  {
    DTM ret = null;
    try {
        Type t = this.getField(3, 0);
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
   * Returns Event Onset Date/Time (PEO-3).
   */
  public DTM getPeo3_EventOnsetDateTime()  {
    DTM ret = null;
    try {
        Type t = this.getField(3, 0);
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
   * Returns Event Exacerbation Date/Time (PEO-4).
   */
  public DTM getEventExacerbationDateTime()  {
    DTM ret = null;
    try {
        Type t = this.getField(4, 0);
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
   * Returns Event Exacerbation Date/Time (PEO-4).
   */
  public DTM getPeo4_EventExacerbationDateTime()  {
    DTM ret = null;
    try {
        Type t = this.getField(4, 0);
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
   * Returns Event Improved Date/Time (PEO-5).
   */
  public DTM getEventImprovedDateTime()  {
    DTM ret = null;
    try {
        Type t = this.getField(5, 0);
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
   * Returns Event Improved Date/Time (PEO-5).
   */
  public DTM getPeo5_EventImprovedDateTime()  {
    DTM ret = null;
    try {
        Type t = this.getField(5, 0);
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
   * Returns Event Ended Data/Time (PEO-6).
   */
  public DTM getEventEndedDataTime()  {
    DTM ret = null;
    try {
        Type t = this.getField(6, 0);
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
   * Returns Event Ended Data/Time (PEO-6).
   */
  public DTM getPeo6_EventEndedDataTime()  {
    DTM ret = null;
    try {
        Type t = this.getField(6, 0);
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
   * Returns a single repetition of Event Location Occurred Address (PEO-7).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XAD getEventLocationOccurredAddress(int rep) throws HL7Exception {
    XAD ret = null;
    try {
        Type t = this.getField(7, rep);
        ret = (XAD)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Event Location Occurred Address (PEO-7).
   */
  public XAD[] getEventLocationOccurredAddress() {
     XAD[] ret = null;
    try {
        Type[] t = this.getField(7);  
        ret = new XAD[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (XAD)t[i];
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
   * Returns a count of the number of repetitions of Event Location Occurred Address (PEO-7).
   */
  public int getEventLocationOccurredAddressReps() {
    try {
        return this.getField(7).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Event Location Occurred Address (PEO-7) at a given index and returns it.
   * @param index The index
   */
  public XAD insertEventLocationOccurredAddress(int index) throws HL7Exception {
     return (XAD) super.insertRepetition(7, index);
  }

  /**
   * Removes a repetition of Event Location Occurred Address (PEO-7) at a given index and returns it.
   * @param index The index
   */
  public XAD removeEventLocationOccurredAddress(int index) throws HL7Exception {
     return (XAD) super.removeRepetition(7, index);
  }

  /**
   * Returns a single repetition of Event Location Occurred Address (PEO-7).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XAD getPeo7_EventLocationOccurredAddress(int rep) throws HL7Exception {
    XAD ret = null;
    try {
        Type t = this.getField(7, rep);
        ret = (XAD)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Event Location Occurred Address (PEO-7).
   */
  public XAD[] getPeo7_EventLocationOccurredAddress() {
     XAD[] ret = null;
    try {
        Type[] t = this.getField(7);  
        ret = new XAD[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (XAD)t[i];
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
   * Returns a count of the number of repetitions of Event Location Occurred Address (PEO-7).
   */
  public int getPeo7_EventLocationOccurredAddressReps() {
    try {
        return this.getField(7).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Event Location Occurred Address (PEO-7) at a given index and returns it.
   * @param index The index
   */
  public XAD insertPeo7_EventLocationOccurredAddress(int index) throws HL7Exception {
     return (XAD) super.insertRepetition(7, index);
  }

  /**
   * Removes a repetition of Event Location Occurred Address (PEO-7) at a given index and returns it.
   * @param index The index
   */
  public XAD removePeo7_EventLocationOccurredAddress(int index) throws HL7Exception {
     return (XAD) super.removeRepetition(7, index);
  }

  /**
   * Returns a single repetition of Event Qualification (PEO-8).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public ID getEventQualification(int rep) throws HL7Exception {
    ID ret = null;
    try {
        Type t = this.getField(8, rep);
        ret = (ID)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Event Qualification (PEO-8).
   */
  public ID[] getEventQualification() {
     ID[] ret = null;
    try {
        Type[] t = this.getField(8);  
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
   * Returns a count of the number of repetitions of Event Qualification (PEO-8).
   */
  public int getEventQualificationReps() {
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
   * Inserts a repetition of Event Qualification (PEO-8) at a given index and returns it.
   * @param index The index
   */
  public ID insertEventQualification(int index) throws HL7Exception {
     return (ID) super.insertRepetition(8, index);
  }

  /**
   * Removes a repetition of Event Qualification (PEO-8) at a given index and returns it.
   * @param index The index
   */
  public ID removeEventQualification(int index) throws HL7Exception {
     return (ID) super.removeRepetition(8, index);
  }

  /**
   * Returns a single repetition of Event Qualification (PEO-8).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public ID getPeo8_EventQualification(int rep) throws HL7Exception {
    ID ret = null;
    try {
        Type t = this.getField(8, rep);
        ret = (ID)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Event Qualification (PEO-8).
   */
  public ID[] getPeo8_EventQualification() {
     ID[] ret = null;
    try {
        Type[] t = this.getField(8);  
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
   * Returns a count of the number of repetitions of Event Qualification (PEO-8).
   */
  public int getPeo8_EventQualificationReps() {
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
   * Inserts a repetition of Event Qualification (PEO-8) at a given index and returns it.
   * @param index The index
   */
  public ID insertPeo8_EventQualification(int index) throws HL7Exception {
     return (ID) super.insertRepetition(8, index);
  }

  /**
   * Removes a repetition of Event Qualification (PEO-8) at a given index and returns it.
   * @param index The index
   */
  public ID removePeo8_EventQualification(int index) throws HL7Exception {
     return (ID) super.removeRepetition(8, index);
  }

  /**
   * Returns Event Serious (PEO-9).
   */
  public ID getEventSerious()  {
    ID ret = null;
    try {
        Type t = this.getField(9, 0);
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
   * Returns Event Serious (PEO-9).
   */
  public ID getPeo9_EventSerious()  {
    ID ret = null;
    try {
        Type t = this.getField(9, 0);
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
   * Returns Event Expected (PEO-10).
   */
  public ID getEventExpected()  {
    ID ret = null;
    try {
        Type t = this.getField(10, 0);
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
   * Returns Event Expected (PEO-10).
   */
  public ID getPeo10_EventExpected()  {
    ID ret = null;
    try {
        Type t = this.getField(10, 0);
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
   * Returns a single repetition of Event Outcome (PEO-11).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public ID getEventOutcome(int rep) throws HL7Exception {
    ID ret = null;
    try {
        Type t = this.getField(11, rep);
        ret = (ID)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Event Outcome (PEO-11).
   */
  public ID[] getEventOutcome() {
     ID[] ret = null;
    try {
        Type[] t = this.getField(11);  
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
   * Returns a count of the number of repetitions of Event Outcome (PEO-11).
   */
  public int getEventOutcomeReps() {
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
   * Inserts a repetition of Event Outcome (PEO-11) at a given index and returns it.
   * @param index The index
   */
  public ID insertEventOutcome(int index) throws HL7Exception {
     return (ID) super.insertRepetition(11, index);
  }

  /**
   * Removes a repetition of Event Outcome (PEO-11) at a given index and returns it.
   * @param index The index
   */
  public ID removeEventOutcome(int index) throws HL7Exception {
     return (ID) super.removeRepetition(11, index);
  }

  /**
   * Returns a single repetition of Event Outcome (PEO-11).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public ID getPeo11_EventOutcome(int rep) throws HL7Exception {
    ID ret = null;
    try {
        Type t = this.getField(11, rep);
        ret = (ID)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Event Outcome (PEO-11).
   */
  public ID[] getPeo11_EventOutcome() {
     ID[] ret = null;
    try {
        Type[] t = this.getField(11);  
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
   * Returns a count of the number of repetitions of Event Outcome (PEO-11).
   */
  public int getPeo11_EventOutcomeReps() {
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
   * Inserts a repetition of Event Outcome (PEO-11) at a given index and returns it.
   * @param index The index
   */
  public ID insertPeo11_EventOutcome(int index) throws HL7Exception {
     return (ID) super.insertRepetition(11, index);
  }

  /**
   * Removes a repetition of Event Outcome (PEO-11) at a given index and returns it.
   * @param index The index
   */
  public ID removePeo11_EventOutcome(int index) throws HL7Exception {
     return (ID) super.removeRepetition(11, index);
  }

  /**
   * Returns Patient Outcome (PEO-12).
   */
  public ID getPatientOutcome()  {
    ID ret = null;
    try {
        Type t = this.getField(12, 0);
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
   * Returns Patient Outcome (PEO-12).
   */
  public ID getPeo12_PatientOutcome()  {
    ID ret = null;
    try {
        Type t = this.getField(12, 0);
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
   * Returns a single repetition of Event Description from Others (PEO-13).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public FT getEventDescriptionFromOthers(int rep) throws HL7Exception {
    FT ret = null;
    try {
        Type t = this.getField(13, rep);
        ret = (FT)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Event Description from Others (PEO-13).
   */
  public FT[] getEventDescriptionFromOthers() {
     FT[] ret = null;
    try {
        Type[] t = this.getField(13);  
        ret = new FT[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (FT)t[i];
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
   * Returns a count of the number of repetitions of Event Description from Others (PEO-13).
   */
  public int getEventDescriptionFromOthersReps() {
    try {
        return this.getField(13).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Event Description from Others (PEO-13) at a given index and returns it.
   * @param index The index
   */
  public FT insertEventDescriptionFromOthers(int index) throws HL7Exception {
     return (FT) super.insertRepetition(13, index);
  }

  /**
   * Removes a repetition of Event Description from Others (PEO-13) at a given index and returns it.
   * @param index The index
   */
  public FT removeEventDescriptionFromOthers(int index) throws HL7Exception {
     return (FT) super.removeRepetition(13, index);
  }

  /**
   * Returns a single repetition of Event Description from Others (PEO-13).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public FT getPeo13_EventDescriptionFromOthers(int rep) throws HL7Exception {
    FT ret = null;
    try {
        Type t = this.getField(13, rep);
        ret = (FT)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Event Description from Others (PEO-13).
   */
  public FT[] getPeo13_EventDescriptionFromOthers() {
     FT[] ret = null;
    try {
        Type[] t = this.getField(13);  
        ret = new FT[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (FT)t[i];
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
   * Returns a count of the number of repetitions of Event Description from Others (PEO-13).
   */
  public int getPeo13_EventDescriptionFromOthersReps() {
    try {
        return this.getField(13).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Event Description from Others (PEO-13) at a given index and returns it.
   * @param index The index
   */
  public FT insertPeo13_EventDescriptionFromOthers(int index) throws HL7Exception {
     return (FT) super.insertRepetition(13, index);
  }

  /**
   * Removes a repetition of Event Description from Others (PEO-13) at a given index and returns it.
   * @param index The index
   */
  public FT removePeo13_EventDescriptionFromOthers(int index) throws HL7Exception {
     return (FT) super.removeRepetition(13, index);
  }

  /**
   * Returns a single repetition of Event Description from Original Reporter (PEO-14).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public FT getEventDescriptionFromOriginalReporter(int rep) throws HL7Exception {
    FT ret = null;
    try {
        Type t = this.getField(14, rep);
        ret = (FT)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Event Description from Original Reporter (PEO-14).
   */
  public FT[] getEventDescriptionFromOriginalReporter() {
     FT[] ret = null;
    try {
        Type[] t = this.getField(14);  
        ret = new FT[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (FT)t[i];
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
   * Returns a count of the number of repetitions of Event Description from Original Reporter (PEO-14).
   */
  public int getEventDescriptionFromOriginalReporterReps() {
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
   * Inserts a repetition of Event Description from Original Reporter (PEO-14) at a given index and returns it.
   * @param index The index
   */
  public FT insertEventDescriptionFromOriginalReporter(int index) throws HL7Exception {
     return (FT) super.insertRepetition(14, index);
  }

  /**
   * Removes a repetition of Event Description from Original Reporter (PEO-14) at a given index and returns it.
   * @param index The index
   */
  public FT removeEventDescriptionFromOriginalReporter(int index) throws HL7Exception {
     return (FT) super.removeRepetition(14, index);
  }

  /**
   * Returns a single repetition of Event Description from Original Reporter (PEO-14).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public FT getPeo14_EventDescriptionFromOriginalReporter(int rep) throws HL7Exception {
    FT ret = null;
    try {
        Type t = this.getField(14, rep);
        ret = (FT)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Event Description from Original Reporter (PEO-14).
   */
  public FT[] getPeo14_EventDescriptionFromOriginalReporter() {
     FT[] ret = null;
    try {
        Type[] t = this.getField(14);  
        ret = new FT[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (FT)t[i];
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
   * Returns a count of the number of repetitions of Event Description from Original Reporter (PEO-14).
   */
  public int getPeo14_EventDescriptionFromOriginalReporterReps() {
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
   * Inserts a repetition of Event Description from Original Reporter (PEO-14) at a given index and returns it.
   * @param index The index
   */
  public FT insertPeo14_EventDescriptionFromOriginalReporter(int index) throws HL7Exception {
     return (FT) super.insertRepetition(14, index);
  }

  /**
   * Removes a repetition of Event Description from Original Reporter (PEO-14) at a given index and returns it.
   * @param index The index
   */
  public FT removePeo14_EventDescriptionFromOriginalReporter(int index) throws HL7Exception {
     return (FT) super.removeRepetition(14, index);
  }

  /**
   * Returns a single repetition of Event Description from Patient (PEO-15).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public FT getEventDescriptionFromPatient(int rep) throws HL7Exception {
    FT ret = null;
    try {
        Type t = this.getField(15, rep);
        ret = (FT)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Event Description from Patient (PEO-15).
   */
  public FT[] getEventDescriptionFromPatient() {
     FT[] ret = null;
    try {
        Type[] t = this.getField(15);  
        ret = new FT[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (FT)t[i];
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
   * Returns a count of the number of repetitions of Event Description from Patient (PEO-15).
   */
  public int getEventDescriptionFromPatientReps() {
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
   * Inserts a repetition of Event Description from Patient (PEO-15) at a given index and returns it.
   * @param index The index
   */
  public FT insertEventDescriptionFromPatient(int index) throws HL7Exception {
     return (FT) super.insertRepetition(15, index);
  }

  /**
   * Removes a repetition of Event Description from Patient (PEO-15) at a given index and returns it.
   * @param index The index
   */
  public FT removeEventDescriptionFromPatient(int index) throws HL7Exception {
     return (FT) super.removeRepetition(15, index);
  }

  /**
   * Returns a single repetition of Event Description from Patient (PEO-15).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public FT getPeo15_EventDescriptionFromPatient(int rep) throws HL7Exception {
    FT ret = null;
    try {
        Type t = this.getField(15, rep);
        ret = (FT)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Event Description from Patient (PEO-15).
   */
  public FT[] getPeo15_EventDescriptionFromPatient() {
     FT[] ret = null;
    try {
        Type[] t = this.getField(15);  
        ret = new FT[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (FT)t[i];
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
   * Returns a count of the number of repetitions of Event Description from Patient (PEO-15).
   */
  public int getPeo15_EventDescriptionFromPatientReps() {
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
   * Inserts a repetition of Event Description from Patient (PEO-15) at a given index and returns it.
   * @param index The index
   */
  public FT insertPeo15_EventDescriptionFromPatient(int index) throws HL7Exception {
     return (FT) super.insertRepetition(15, index);
  }

  /**
   * Removes a repetition of Event Description from Patient (PEO-15) at a given index and returns it.
   * @param index The index
   */
  public FT removePeo15_EventDescriptionFromPatient(int index) throws HL7Exception {
     return (FT) super.removeRepetition(15, index);
  }

  /**
   * Returns a single repetition of Event Description from Practitioner (PEO-16).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public FT getEventDescriptionFromPractitioner(int rep) throws HL7Exception {
    FT ret = null;
    try {
        Type t = this.getField(16, rep);
        ret = (FT)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Event Description from Practitioner (PEO-16).
   */
  public FT[] getEventDescriptionFromPractitioner() {
     FT[] ret = null;
    try {
        Type[] t = this.getField(16);  
        ret = new FT[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (FT)t[i];
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
   * Returns a count of the number of repetitions of Event Description from Practitioner (PEO-16).
   */
  public int getEventDescriptionFromPractitionerReps() {
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
   * Inserts a repetition of Event Description from Practitioner (PEO-16) at a given index and returns it.
   * @param index The index
   */
  public FT insertEventDescriptionFromPractitioner(int index) throws HL7Exception {
     return (FT) super.insertRepetition(16, index);
  }

  /**
   * Removes a repetition of Event Description from Practitioner (PEO-16) at a given index and returns it.
   * @param index The index
   */
  public FT removeEventDescriptionFromPractitioner(int index) throws HL7Exception {
     return (FT) super.removeRepetition(16, index);
  }

  /**
   * Returns a single repetition of Event Description from Practitioner (PEO-16).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public FT getPeo16_EventDescriptionFromPractitioner(int rep) throws HL7Exception {
    FT ret = null;
    try {
        Type t = this.getField(16, rep);
        ret = (FT)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Event Description from Practitioner (PEO-16).
   */
  public FT[] getPeo16_EventDescriptionFromPractitioner() {
     FT[] ret = null;
    try {
        Type[] t = this.getField(16);  
        ret = new FT[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (FT)t[i];
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
   * Returns a count of the number of repetitions of Event Description from Practitioner (PEO-16).
   */
  public int getPeo16_EventDescriptionFromPractitionerReps() {
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
   * Inserts a repetition of Event Description from Practitioner (PEO-16) at a given index and returns it.
   * @param index The index
   */
  public FT insertPeo16_EventDescriptionFromPractitioner(int index) throws HL7Exception {
     return (FT) super.insertRepetition(16, index);
  }

  /**
   * Removes a repetition of Event Description from Practitioner (PEO-16) at a given index and returns it.
   * @param index The index
   */
  public FT removePeo16_EventDescriptionFromPractitioner(int index) throws HL7Exception {
     return (FT) super.removeRepetition(16, index);
  }

  /**
   * Returns a single repetition of Event Description from Autopsy (PEO-17).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public FT getEventDescriptionFromAutopsy(int rep) throws HL7Exception {
    FT ret = null;
    try {
        Type t = this.getField(17, rep);
        ret = (FT)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Event Description from Autopsy (PEO-17).
   */
  public FT[] getEventDescriptionFromAutopsy() {
     FT[] ret = null;
    try {
        Type[] t = this.getField(17);  
        ret = new FT[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (FT)t[i];
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
   * Returns a count of the number of repetitions of Event Description from Autopsy (PEO-17).
   */
  public int getEventDescriptionFromAutopsyReps() {
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
   * Inserts a repetition of Event Description from Autopsy (PEO-17) at a given index and returns it.
   * @param index The index
   */
  public FT insertEventDescriptionFromAutopsy(int index) throws HL7Exception {
     return (FT) super.insertRepetition(17, index);
  }

  /**
   * Removes a repetition of Event Description from Autopsy (PEO-17) at a given index and returns it.
   * @param index The index
   */
  public FT removeEventDescriptionFromAutopsy(int index) throws HL7Exception {
     return (FT) super.removeRepetition(17, index);
  }

  /**
   * Returns a single repetition of Event Description from Autopsy (PEO-17).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public FT getPeo17_EventDescriptionFromAutopsy(int rep) throws HL7Exception {
    FT ret = null;
    try {
        Type t = this.getField(17, rep);
        ret = (FT)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Event Description from Autopsy (PEO-17).
   */
  public FT[] getPeo17_EventDescriptionFromAutopsy() {
     FT[] ret = null;
    try {
        Type[] t = this.getField(17);  
        ret = new FT[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (FT)t[i];
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
   * Returns a count of the number of repetitions of Event Description from Autopsy (PEO-17).
   */
  public int getPeo17_EventDescriptionFromAutopsyReps() {
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
   * Inserts a repetition of Event Description from Autopsy (PEO-17) at a given index and returns it.
   * @param index The index
   */
  public FT insertPeo17_EventDescriptionFromAutopsy(int index) throws HL7Exception {
     return (FT) super.insertRepetition(17, index);
  }

  /**
   * Removes a repetition of Event Description from Autopsy (PEO-17) at a given index and returns it.
   * @param index The index
   */
  public FT removePeo17_EventDescriptionFromAutopsy(int index) throws HL7Exception {
     return (FT) super.removeRepetition(17, index);
  }

  /**
   * Returns a single repetition of Cause Of Death (PEO-18).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getCauseOfDeath(int rep) throws HL7Exception {
    CWE ret = null;
    try {
        Type t = this.getField(18, rep);
        ret = (CWE)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Cause Of Death (PEO-18).
   */
  public CWE[] getCauseOfDeath() {
     CWE[] ret = null;
    try {
        Type[] t = this.getField(18);  
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
   * Returns a count of the number of repetitions of Cause Of Death (PEO-18).
   */
  public int getCauseOfDeathReps() {
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
   * Inserts a repetition of Cause Of Death (PEO-18) at a given index and returns it.
   * @param index The index
   */
  public CWE insertCauseOfDeath(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(18, index);
  }

  /**
   * Removes a repetition of Cause Of Death (PEO-18) at a given index and returns it.
   * @param index The index
   */
  public CWE removeCauseOfDeath(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(18, index);
  }

  /**
   * Returns a single repetition of Cause Of Death (PEO-18).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getPeo18_CauseOfDeath(int rep) throws HL7Exception {
    CWE ret = null;
    try {
        Type t = this.getField(18, rep);
        ret = (CWE)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Cause Of Death (PEO-18).
   */
  public CWE[] getPeo18_CauseOfDeath() {
     CWE[] ret = null;
    try {
        Type[] t = this.getField(18);  
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
   * Returns a count of the number of repetitions of Cause Of Death (PEO-18).
   */
  public int getPeo18_CauseOfDeathReps() {
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
   * Inserts a repetition of Cause Of Death (PEO-18) at a given index and returns it.
   * @param index The index
   */
  public CWE insertPeo18_CauseOfDeath(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(18, index);
  }

  /**
   * Removes a repetition of Cause Of Death (PEO-18) at a given index and returns it.
   * @param index The index
   */
  public CWE removePeo18_CauseOfDeath(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(18, index);
  }

  /**
   * Returns a single repetition of Primary Observer Name (PEO-19).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XPN getPrimaryObserverName(int rep) throws HL7Exception {
    XPN ret = null;
    try {
        Type t = this.getField(19, rep);
        ret = (XPN)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Primary Observer Name (PEO-19).
   */
  public XPN[] getPrimaryObserverName() {
     XPN[] ret = null;
    try {
        Type[] t = this.getField(19);  
        ret = new XPN[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (XPN)t[i];
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
   * Returns a count of the number of repetitions of Primary Observer Name (PEO-19).
   */
  public int getPrimaryObserverNameReps() {
    try {
        return this.getField(19).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Primary Observer Name (PEO-19) at a given index and returns it.
   * @param index The index
   */
  public XPN insertPrimaryObserverName(int index) throws HL7Exception {
     return (XPN) super.insertRepetition(19, index);
  }

  /**
   * Removes a repetition of Primary Observer Name (PEO-19) at a given index and returns it.
   * @param index The index
   */
  public XPN removePrimaryObserverName(int index) throws HL7Exception {
     return (XPN) super.removeRepetition(19, index);
  }

  /**
   * Returns a single repetition of Primary Observer Name (PEO-19).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XPN getPeo19_PrimaryObserverName(int rep) throws HL7Exception {
    XPN ret = null;
    try {
        Type t = this.getField(19, rep);
        ret = (XPN)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Primary Observer Name (PEO-19).
   */
  public XPN[] getPeo19_PrimaryObserverName() {
     XPN[] ret = null;
    try {
        Type[] t = this.getField(19);  
        ret = new XPN[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (XPN)t[i];
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
   * Returns a count of the number of repetitions of Primary Observer Name (PEO-19).
   */
  public int getPeo19_PrimaryObserverNameReps() {
    try {
        return this.getField(19).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Primary Observer Name (PEO-19) at a given index and returns it.
   * @param index The index
   */
  public XPN insertPeo19_PrimaryObserverName(int index) throws HL7Exception {
     return (XPN) super.insertRepetition(19, index);
  }

  /**
   * Removes a repetition of Primary Observer Name (PEO-19) at a given index and returns it.
   * @param index The index
   */
  public XPN removePeo19_PrimaryObserverName(int index) throws HL7Exception {
     return (XPN) super.removeRepetition(19, index);
  }

  /**
   * Returns a single repetition of Primary Observer Address (PEO-20).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XAD getPrimaryObserverAddress(int rep) throws HL7Exception {
    XAD ret = null;
    try {
        Type t = this.getField(20, rep);
        ret = (XAD)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Primary Observer Address (PEO-20).
   */
  public XAD[] getPrimaryObserverAddress() {
     XAD[] ret = null;
    try {
        Type[] t = this.getField(20);  
        ret = new XAD[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (XAD)t[i];
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
   * Returns a count of the number of repetitions of Primary Observer Address (PEO-20).
   */
  public int getPrimaryObserverAddressReps() {
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
   * Inserts a repetition of Primary Observer Address (PEO-20) at a given index and returns it.
   * @param index The index
   */
  public XAD insertPrimaryObserverAddress(int index) throws HL7Exception {
     return (XAD) super.insertRepetition(20, index);
  }

  /**
   * Removes a repetition of Primary Observer Address (PEO-20) at a given index and returns it.
   * @param index The index
   */
  public XAD removePrimaryObserverAddress(int index) throws HL7Exception {
     return (XAD) super.removeRepetition(20, index);
  }

  /**
   * Returns a single repetition of Primary Observer Address (PEO-20).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XAD getPeo20_PrimaryObserverAddress(int rep) throws HL7Exception {
    XAD ret = null;
    try {
        Type t = this.getField(20, rep);
        ret = (XAD)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Primary Observer Address (PEO-20).
   */
  public XAD[] getPeo20_PrimaryObserverAddress() {
     XAD[] ret = null;
    try {
        Type[] t = this.getField(20);  
        ret = new XAD[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (XAD)t[i];
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
   * Returns a count of the number of repetitions of Primary Observer Address (PEO-20).
   */
  public int getPeo20_PrimaryObserverAddressReps() {
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
   * Inserts a repetition of Primary Observer Address (PEO-20) at a given index and returns it.
   * @param index The index
   */
  public XAD insertPeo20_PrimaryObserverAddress(int index) throws HL7Exception {
     return (XAD) super.insertRepetition(20, index);
  }

  /**
   * Removes a repetition of Primary Observer Address (PEO-20) at a given index and returns it.
   * @param index The index
   */
  public XAD removePeo20_PrimaryObserverAddress(int index) throws HL7Exception {
     return (XAD) super.removeRepetition(20, index);
  }

  /**
   * Returns a single repetition of Primary Observer Telephone (PEO-21).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XTN getPrimaryObserverTelephone(int rep) throws HL7Exception {
    XTN ret = null;
    try {
        Type t = this.getField(21, rep);
        ret = (XTN)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Primary Observer Telephone (PEO-21).
   */
  public XTN[] getPrimaryObserverTelephone() {
     XTN[] ret = null;
    try {
        Type[] t = this.getField(21);  
        ret = new XTN[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (XTN)t[i];
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
   * Returns a count of the number of repetitions of Primary Observer Telephone (PEO-21).
   */
  public int getPrimaryObserverTelephoneReps() {
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
   * Inserts a repetition of Primary Observer Telephone (PEO-21) at a given index and returns it.
   * @param index The index
   */
  public XTN insertPrimaryObserverTelephone(int index) throws HL7Exception {
     return (XTN) super.insertRepetition(21, index);
  }

  /**
   * Removes a repetition of Primary Observer Telephone (PEO-21) at a given index and returns it.
   * @param index The index
   */
  public XTN removePrimaryObserverTelephone(int index) throws HL7Exception {
     return (XTN) super.removeRepetition(21, index);
  }

  /**
   * Returns a single repetition of Primary Observer Telephone (PEO-21).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XTN getPeo21_PrimaryObserverTelephone(int rep) throws HL7Exception {
    XTN ret = null;
    try {
        Type t = this.getField(21, rep);
        ret = (XTN)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Primary Observer Telephone (PEO-21).
   */
  public XTN[] getPeo21_PrimaryObserverTelephone() {
     XTN[] ret = null;
    try {
        Type[] t = this.getField(21);  
        ret = new XTN[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (XTN)t[i];
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
   * Returns a count of the number of repetitions of Primary Observer Telephone (PEO-21).
   */
  public int getPeo21_PrimaryObserverTelephoneReps() {
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
   * Inserts a repetition of Primary Observer Telephone (PEO-21) at a given index and returns it.
   * @param index The index
   */
  public XTN insertPeo21_PrimaryObserverTelephone(int index) throws HL7Exception {
     return (XTN) super.insertRepetition(21, index);
  }

  /**
   * Removes a repetition of Primary Observer Telephone (PEO-21) at a given index and returns it.
   * @param index The index
   */
  public XTN removePeo21_PrimaryObserverTelephone(int index) throws HL7Exception {
     return (XTN) super.removeRepetition(21, index);
  }

  /**
   * Returns Primary Observer's Qualification (PEO-22).
   */
  public ID getPrimaryObserverSQualification()  {
    ID ret = null;
    try {
        Type t = this.getField(22, 0);
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
   * Returns Primary Observer's Qualification (PEO-22).
   */
  public ID getPeo22_PrimaryObserverSQualification()  {
    ID ret = null;
    try {
        Type t = this.getField(22, 0);
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
   * Returns Confirmation Provided By (PEO-23).
   */
  public ID getConfirmationProvidedBy()  {
    ID ret = null;
    try {
        Type t = this.getField(23, 0);
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
   * Returns Confirmation Provided By (PEO-23).
   */
  public ID getPeo23_ConfirmationProvidedBy()  {
    ID ret = null;
    try {
        Type t = this.getField(23, 0);
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
   * Returns Primary Observer Aware Date/Time (PEO-24).
   */
  public DTM getPrimaryObserverAwareDateTime()  {
    DTM ret = null;
    try {
        Type t = this.getField(24, 0);
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
   * Returns Primary Observer Aware Date/Time (PEO-24).
   */
  public DTM getPeo24_PrimaryObserverAwareDateTime()  {
    DTM ret = null;
    try {
        Type t = this.getField(24, 0);
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
   * Returns Primary Observer's identity May Be Divulged (PEO-25).
   */
  public ID getPrimaryObserverSIdentityMayBeDivulged()  {
    ID ret = null;
    try {
        Type t = this.getField(25, 0);
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
   * Returns Primary Observer's identity May Be Divulged (PEO-25).
   */
  public ID getPeo25_PrimaryObserverSIdentityMayBeDivulged()  {
    ID ret = null;
    try {
        Type t = this.getField(25, 0);
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

   protected Type createNewTypeWithoutReflection(int field) {
      switch (field) {
         case 0: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 1: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 2: return new ca.uhn.hl7v2.model.v26.datatype.DTM(getMessage());
         case 3: return new ca.uhn.hl7v2.model.v26.datatype.DTM(getMessage());
         case 4: return new ca.uhn.hl7v2.model.v26.datatype.DTM(getMessage());
         case 5: return new ca.uhn.hl7v2.model.v26.datatype.DTM(getMessage());
         case 6: return new ca.uhn.hl7v2.model.v26.datatype.XAD(getMessage());
         case 7: return new ca.uhn.hl7v2.model.v26.datatype.ID(getMessage(), new Integer(237));
         case 8: return new ca.uhn.hl7v2.model.v26.datatype.ID(getMessage(), new Integer(238));
         case 9: return new ca.uhn.hl7v2.model.v26.datatype.ID(getMessage(), new Integer(239));
         case 10: return new ca.uhn.hl7v2.model.v26.datatype.ID(getMessage(), new Integer(240));
         case 11: return new ca.uhn.hl7v2.model.v26.datatype.ID(getMessage(), new Integer(241));
         case 12: return new ca.uhn.hl7v2.model.v26.datatype.FT(getMessage());
         case 13: return new ca.uhn.hl7v2.model.v26.datatype.FT(getMessage());
         case 14: return new ca.uhn.hl7v2.model.v26.datatype.FT(getMessage());
         case 15: return new ca.uhn.hl7v2.model.v26.datatype.FT(getMessage());
         case 16: return new ca.uhn.hl7v2.model.v26.datatype.FT(getMessage());
         case 17: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 18: return new ca.uhn.hl7v2.model.v26.datatype.XPN(getMessage());
         case 19: return new ca.uhn.hl7v2.model.v26.datatype.XAD(getMessage());
         case 20: return new ca.uhn.hl7v2.model.v26.datatype.XTN(getMessage());
         case 21: return new ca.uhn.hl7v2.model.v26.datatype.ID(getMessage(), new Integer(242));
         case 22: return new ca.uhn.hl7v2.model.v26.datatype.ID(getMessage(), new Integer(242));
         case 23: return new ca.uhn.hl7v2.model.v26.datatype.DTM(getMessage());
         case 24: return new ca.uhn.hl7v2.model.v26.datatype.ID(getMessage(), new Integer(243));
         default: return null;
      }
   }

}