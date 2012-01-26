package ca.uhn.hl7v2.model.v26.segment;

import ca.uhn.hl7v2.model.*;
import ca.uhn.hl7v2.model.v26.datatype.*;
import ca.uhn.log.HapiLogFactory;
import ca.uhn.hl7v2.parser.ModelClassFactory;
import ca.uhn.hl7v2.HL7Exception;

/**
 * <p>Represents an HL7 PID message segment. 
 * This segment has the following fields:</p><p>
 * PID-1: Set ID - PID (SI)<br> 
 * PID-2: Patient ID (CX)<br> 
 * PID-3: Patient Identifier List (CX)<br> 
 * PID-4: Alternate Patient ID - PID (CX)<br> 
 * PID-5: Patient Name (XPN)<br> 
 * PID-6: Mother's Maiden Name (XPN)<br> 
 * PID-7: Date/Time of Birth (DTM)<br> 
 * PID-8: Administrative Sex (IS)<br> 
 * PID-9: Patient Alias (XPN)<br> 
 * PID-10: Race (CWE)<br> 
 * PID-11: Patient Address (XAD)<br> 
 * PID-12: County Code (IS)<br> 
 * PID-13: Phone Number - Home (XTN)<br> 
 * PID-14: Phone Number - Business (XTN)<br> 
 * PID-15: Primary Language (CWE)<br> 
 * PID-16: Marital Status (CWE)<br> 
 * PID-17: Religion (CWE)<br> 
 * PID-18: Patient Account Number (CX)<br> 
 * PID-19: SSN Number - Patient (ST)<br> 
 * PID-20: Driver's License Number - Patient (DLN)<br> 
 * PID-21: Mother's Identifier (CX)<br> 
 * PID-22: Ethnic Group (CWE)<br> 
 * PID-23: Birth Place (ST)<br> 
 * PID-24: Multiple Birth Indicator (ID)<br> 
 * PID-25: Birth Order (NM)<br> 
 * PID-26: Citizenship (CWE)<br> 
 * PID-27: Veterans Military Status (CWE)<br> 
 * PID-28: Nationality (CWE)<br> 
 * PID-29: Patient Death Date and Time (DTM)<br> 
 * PID-30: Patient Death Indicator (ID)<br> 
 * PID-31: Identity Unknown Indicator (ID)<br> 
 * PID-32: Identity Reliability Code (IS)<br> 
 * PID-33: Last Update Date/Time (DTM)<br> 
 * PID-34: Last Update Facility (HD)<br> 
 * PID-35: Species Code (CWE)<br> 
 * PID-36: Breed Code (CWE)<br> 
 * PID-37: Strain (ST)<br> 
 * PID-38: Production Class Code (CWE)<br> 
 * PID-39: Tribal Citizenship (CWE)<br> 
 * </p><p>The get...() methods return data from individual fields.  These methods 
 * do not throw exceptions and may therefore have to handle exceptions internally.  
 * If an exception is handled internally, it is logged and null is returned.  
 * This is not expected to happen - if it does happen this indicates not so much 
 * an exceptional circumstance as a bug in the code for this class.</p>    
 */
public class PID extends AbstractSegment  {

  /**
   * Creates a PID (Patient Identification) segment object that belongs to the given 
   * message.  
   */
  public PID(Group parent, ModelClassFactory factory) {
    super(parent, factory);
    Message message = getMessage();
    try {
       this.add(SI.class, false, 1, 4, new Object[]{message}, "Set ID - PID");
       this.add(CX.class, false, 1, 0, new Object[]{message}, "Patient ID");
       this.add(CX.class, true, 0, 250, new Object[]{message}, "Patient Identifier List");
       this.add(CX.class, false, 0, 0, new Object[]{message}, "Alternate Patient ID - PID");
       this.add(XPN.class, true, 0, 250, new Object[]{message}, "Patient Name");
       this.add(XPN.class, false, 0, 250, new Object[]{message}, "Mother's Maiden Name");
       this.add(DTM.class, false, 1, 24, new Object[]{message}, "Date/Time of Birth");
       this.add(IS.class, false, 1, 1, new Object[]{message, new Integer(1)}, "Administrative Sex");
       this.add(XPN.class, false, 0, 0, new Object[]{message}, "Patient Alias");
       this.add(CWE.class, false, 0, 705, new Object[]{message}, "Race");
       this.add(XAD.class, false, 0, 250, new Object[]{message}, "Patient Address");
       this.add(IS.class, false, 1, 0, new Object[]{message, new Integer(289)}, "County Code");
       this.add(XTN.class, false, 0, 250, new Object[]{message}, "Phone Number - Home");
       this.add(XTN.class, false, 0, 250, new Object[]{message}, "Phone Number - Business");
       this.add(CWE.class, false, 1, 705, new Object[]{message}, "Primary Language");
       this.add(CWE.class, false, 1, 705, new Object[]{message}, "Marital Status");
       this.add(CWE.class, false, 1, 705, new Object[]{message}, "Religion");
       this.add(CX.class, false, 1, 250, new Object[]{message}, "Patient Account Number");
       this.add(ST.class, false, 1, 0, new Object[]{message}, "SSN Number - Patient");
       this.add(DLN.class, false, 1, 0, new Object[]{message}, "Driver's License Number - Patient");
       this.add(CX.class, false, 0, 250, new Object[]{message}, "Mother's Identifier");
       this.add(CWE.class, false, 0, 705, new Object[]{message}, "Ethnic Group");
       this.add(ST.class, false, 1, 250, new Object[]{message}, "Birth Place");
       this.add(ID.class, false, 1, 1, new Object[]{message, new Integer(136)}, "Multiple Birth Indicator");
       this.add(NM.class, false, 1, 2, new Object[]{message}, "Birth Order");
       this.add(CWE.class, false, 0, 705, new Object[]{message}, "Citizenship");
       this.add(CWE.class, false, 1, 705, new Object[]{message}, "Veterans Military Status");
       this.add(CWE.class, false, 1, 0, new Object[]{message}, "Nationality");
       this.add(DTM.class, false, 1, 24, new Object[]{message}, "Patient Death Date and Time");
       this.add(ID.class, false, 1, 1, new Object[]{message, new Integer(136)}, "Patient Death Indicator");
       this.add(ID.class, false, 1, 1, new Object[]{message, new Integer(136)}, "Identity Unknown Indicator");
       this.add(IS.class, false, 0, 20, new Object[]{message, new Integer(445)}, "Identity Reliability Code");
       this.add(DTM.class, false, 1, 24, new Object[]{message}, "Last Update Date/Time");
       this.add(HD.class, false, 1, 241, new Object[]{message}, "Last Update Facility");
       this.add(CWE.class, false, 1, 705, new Object[]{message}, "Species Code");
       this.add(CWE.class, false, 1, 705, new Object[]{message}, "Breed Code");
       this.add(ST.class, false, 1, 80, new Object[]{message}, "Strain");
       this.add(CWE.class, false, 1, 705, new Object[]{message}, "Production Class Code");
       this.add(CWE.class, false, 0, 705, new Object[]{message}, "Tribal Citizenship");
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Can't instantiate " + this.getClass().getName(), he);
    }
  }

  /**
   * Returns Set ID - PID (PID-1).
   */
  public SI getSetIDPID()  {
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
   * Returns Set ID - PID (PID-1).
   */
  public SI getPid1_SetIDPID()  {
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
   * Returns Patient ID (PID-2).
   */
  public CX getPatientID()  {
    CX ret = null;
    try {
        Type t = this.getField(2, 0);
        ret = (CX)t;
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
   * Returns Patient ID (PID-2).
   */
  public CX getPid2_PatientID()  {
    CX ret = null;
    try {
        Type t = this.getField(2, 0);
        ret = (CX)t;
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
   * Returns a single repetition of Patient Identifier List (PID-3).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CX getPatientIdentifierList(int rep) throws HL7Exception {
    CX ret = null;
    try {
        Type t = this.getField(3, rep);
        ret = (CX)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Patient Identifier List (PID-3).
   */
  public CX[] getPatientIdentifierList() {
     CX[] ret = null;
    try {
        Type[] t = this.getField(3);  
        ret = new CX[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (CX)t[i];
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
   * Returns a count of the number of repetitions of Patient Identifier List (PID-3).
   */
  public int getPatientIdentifierListReps() {
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
   * Inserts a repetition of Patient Identifier List (PID-3) at a given index and returns it.
   * @param index The index
   */
  public CX insertPatientIdentifierList(int index) throws HL7Exception {
     return (CX) super.insertRepetition(3, index);
  }

  /**
   * Removes a repetition of Patient Identifier List (PID-3) at a given index and returns it.
   * @param index The index
   */
  public CX removePatientIdentifierList(int index) throws HL7Exception {
     return (CX) super.removeRepetition(3, index);
  }

  /**
   * Returns a single repetition of Patient Identifier List (PID-3).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CX getPid3_PatientIdentifierList(int rep) throws HL7Exception {
    CX ret = null;
    try {
        Type t = this.getField(3, rep);
        ret = (CX)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Patient Identifier List (PID-3).
   */
  public CX[] getPid3_PatientIdentifierList() {
     CX[] ret = null;
    try {
        Type[] t = this.getField(3);  
        ret = new CX[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (CX)t[i];
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
   * Returns a count of the number of repetitions of Patient Identifier List (PID-3).
   */
  public int getPid3_PatientIdentifierListReps() {
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
   * Inserts a repetition of Patient Identifier List (PID-3) at a given index and returns it.
   * @param index The index
   */
  public CX insertPid3_PatientIdentifierList(int index) throws HL7Exception {
     return (CX) super.insertRepetition(3, index);
  }

  /**
   * Removes a repetition of Patient Identifier List (PID-3) at a given index and returns it.
   * @param index The index
   */
  public CX removePid3_PatientIdentifierList(int index) throws HL7Exception {
     return (CX) super.removeRepetition(3, index);
  }

  /**
   * Returns a single repetition of Alternate Patient ID - PID (PID-4).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CX getAlternatePatientIDPID(int rep) throws HL7Exception {
    CX ret = null;
    try {
        Type t = this.getField(4, rep);
        ret = (CX)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Alternate Patient ID - PID (PID-4).
   */
  public CX[] getAlternatePatientIDPID() {
     CX[] ret = null;
    try {
        Type[] t = this.getField(4);  
        ret = new CX[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (CX)t[i];
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
   * Returns a count of the number of repetitions of Alternate Patient ID - PID (PID-4).
   */
  public int getAlternatePatientIDPIDReps() {
    try {
        return this.getField(4).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Alternate Patient ID - PID (PID-4) at a given index and returns it.
   * @param index The index
   */
  public CX insertAlternatePatientIDPID(int index) throws HL7Exception {
     return (CX) super.insertRepetition(4, index);
  }

  /**
   * Removes a repetition of Alternate Patient ID - PID (PID-4) at a given index and returns it.
   * @param index The index
   */
  public CX removeAlternatePatientIDPID(int index) throws HL7Exception {
     return (CX) super.removeRepetition(4, index);
  }

  /**
   * Returns a single repetition of Alternate Patient ID - PID (PID-4).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CX getPid4_AlternatePatientIDPID(int rep) throws HL7Exception {
    CX ret = null;
    try {
        Type t = this.getField(4, rep);
        ret = (CX)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Alternate Patient ID - PID (PID-4).
   */
  public CX[] getPid4_AlternatePatientIDPID() {
     CX[] ret = null;
    try {
        Type[] t = this.getField(4);  
        ret = new CX[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (CX)t[i];
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
   * Returns a count of the number of repetitions of Alternate Patient ID - PID (PID-4).
   */
  public int getPid4_AlternatePatientIDPIDReps() {
    try {
        return this.getField(4).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Alternate Patient ID - PID (PID-4) at a given index and returns it.
   * @param index The index
   */
  public CX insertPid4_AlternatePatientIDPID(int index) throws HL7Exception {
     return (CX) super.insertRepetition(4, index);
  }

  /**
   * Removes a repetition of Alternate Patient ID - PID (PID-4) at a given index and returns it.
   * @param index The index
   */
  public CX removePid4_AlternatePatientIDPID(int index) throws HL7Exception {
     return (CX) super.removeRepetition(4, index);
  }

  /**
   * Returns a single repetition of Patient Name (PID-5).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XPN getPatientName(int rep) throws HL7Exception {
    XPN ret = null;
    try {
        Type t = this.getField(5, rep);
        ret = (XPN)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Patient Name (PID-5).
   */
  public XPN[] getPatientName() {
     XPN[] ret = null;
    try {
        Type[] t = this.getField(5);  
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
   * Returns a count of the number of repetitions of Patient Name (PID-5).
   */
  public int getPatientNameReps() {
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
   * Inserts a repetition of Patient Name (PID-5) at a given index and returns it.
   * @param index The index
   */
  public XPN insertPatientName(int index) throws HL7Exception {
     return (XPN) super.insertRepetition(5, index);
  }

  /**
   * Removes a repetition of Patient Name (PID-5) at a given index and returns it.
   * @param index The index
   */
  public XPN removePatientName(int index) throws HL7Exception {
     return (XPN) super.removeRepetition(5, index);
  }

  /**
   * Returns a single repetition of Patient Name (PID-5).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XPN getPid5_PatientName(int rep) throws HL7Exception {
    XPN ret = null;
    try {
        Type t = this.getField(5, rep);
        ret = (XPN)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Patient Name (PID-5).
   */
  public XPN[] getPid5_PatientName() {
     XPN[] ret = null;
    try {
        Type[] t = this.getField(5);  
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
   * Returns a count of the number of repetitions of Patient Name (PID-5).
   */
  public int getPid5_PatientNameReps() {
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
   * Inserts a repetition of Patient Name (PID-5) at a given index and returns it.
   * @param index The index
   */
  public XPN insertPid5_PatientName(int index) throws HL7Exception {
     return (XPN) super.insertRepetition(5, index);
  }

  /**
   * Removes a repetition of Patient Name (PID-5) at a given index and returns it.
   * @param index The index
   */
  public XPN removePid5_PatientName(int index) throws HL7Exception {
     return (XPN) super.removeRepetition(5, index);
  }

  /**
   * Returns a single repetition of Mother's Maiden Name (PID-6).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XPN getMotherSMaidenName(int rep) throws HL7Exception {
    XPN ret = null;
    try {
        Type t = this.getField(6, rep);
        ret = (XPN)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Mother's Maiden Name (PID-6).
   */
  public XPN[] getMotherSMaidenName() {
     XPN[] ret = null;
    try {
        Type[] t = this.getField(6);  
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
   * Returns a count of the number of repetitions of Mother's Maiden Name (PID-6).
   */
  public int getMotherSMaidenNameReps() {
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
   * Inserts a repetition of Mother's Maiden Name (PID-6) at a given index and returns it.
   * @param index The index
   */
  public XPN insertMotherSMaidenName(int index) throws HL7Exception {
     return (XPN) super.insertRepetition(6, index);
  }

  /**
   * Removes a repetition of Mother's Maiden Name (PID-6) at a given index and returns it.
   * @param index The index
   */
  public XPN removeMotherSMaidenName(int index) throws HL7Exception {
     return (XPN) super.removeRepetition(6, index);
  }

  /**
   * Returns a single repetition of Mother's Maiden Name (PID-6).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XPN getPid6_MotherSMaidenName(int rep) throws HL7Exception {
    XPN ret = null;
    try {
        Type t = this.getField(6, rep);
        ret = (XPN)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Mother's Maiden Name (PID-6).
   */
  public XPN[] getPid6_MotherSMaidenName() {
     XPN[] ret = null;
    try {
        Type[] t = this.getField(6);  
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
   * Returns a count of the number of repetitions of Mother's Maiden Name (PID-6).
   */
  public int getPid6_MotherSMaidenNameReps() {
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
   * Inserts a repetition of Mother's Maiden Name (PID-6) at a given index and returns it.
   * @param index The index
   */
  public XPN insertPid6_MotherSMaidenName(int index) throws HL7Exception {
     return (XPN) super.insertRepetition(6, index);
  }

  /**
   * Removes a repetition of Mother's Maiden Name (PID-6) at a given index and returns it.
   * @param index The index
   */
  public XPN removePid6_MotherSMaidenName(int index) throws HL7Exception {
     return (XPN) super.removeRepetition(6, index);
  }

  /**
   * Returns Date/Time of Birth (PID-7).
   */
  public DTM getDateTimeOfBirth()  {
    DTM ret = null;
    try {
        Type t = this.getField(7, 0);
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
   * Returns Date/Time of Birth (PID-7).
   */
  public DTM getPid7_DateTimeOfBirth()  {
    DTM ret = null;
    try {
        Type t = this.getField(7, 0);
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
   * Returns Administrative Sex (PID-8).
   */
  public IS getAdministrativeSex()  {
    IS ret = null;
    try {
        Type t = this.getField(8, 0);
        ret = (IS)t;
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
   * Returns Administrative Sex (PID-8).
   */
  public IS getPid8_AdministrativeSex()  {
    IS ret = null;
    try {
        Type t = this.getField(8, 0);
        ret = (IS)t;
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
   * Returns a single repetition of Patient Alias (PID-9).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XPN getPatientAlias(int rep) throws HL7Exception {
    XPN ret = null;
    try {
        Type t = this.getField(9, rep);
        ret = (XPN)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Patient Alias (PID-9).
   */
  public XPN[] getPatientAlias() {
     XPN[] ret = null;
    try {
        Type[] t = this.getField(9);  
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
   * Returns a count of the number of repetitions of Patient Alias (PID-9).
   */
  public int getPatientAliasReps() {
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
   * Inserts a repetition of Patient Alias (PID-9) at a given index and returns it.
   * @param index The index
   */
  public XPN insertPatientAlias(int index) throws HL7Exception {
     return (XPN) super.insertRepetition(9, index);
  }

  /**
   * Removes a repetition of Patient Alias (PID-9) at a given index and returns it.
   * @param index The index
   */
  public XPN removePatientAlias(int index) throws HL7Exception {
     return (XPN) super.removeRepetition(9, index);
  }

  /**
   * Returns a single repetition of Patient Alias (PID-9).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XPN getPid9_PatientAlias(int rep) throws HL7Exception {
    XPN ret = null;
    try {
        Type t = this.getField(9, rep);
        ret = (XPN)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Patient Alias (PID-9).
   */
  public XPN[] getPid9_PatientAlias() {
     XPN[] ret = null;
    try {
        Type[] t = this.getField(9);  
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
   * Returns a count of the number of repetitions of Patient Alias (PID-9).
   */
  public int getPid9_PatientAliasReps() {
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
   * Inserts a repetition of Patient Alias (PID-9) at a given index and returns it.
   * @param index The index
   */
  public XPN insertPid9_PatientAlias(int index) throws HL7Exception {
     return (XPN) super.insertRepetition(9, index);
  }

  /**
   * Removes a repetition of Patient Alias (PID-9) at a given index and returns it.
   * @param index The index
   */
  public XPN removePid9_PatientAlias(int index) throws HL7Exception {
     return (XPN) super.removeRepetition(9, index);
  }

  /**
   * Returns a single repetition of Race (PID-10).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getRace(int rep) throws HL7Exception {
    CWE ret = null;
    try {
        Type t = this.getField(10, rep);
        ret = (CWE)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Race (PID-10).
   */
  public CWE[] getRace() {
     CWE[] ret = null;
    try {
        Type[] t = this.getField(10);  
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
   * Returns a count of the number of repetitions of Race (PID-10).
   */
  public int getRaceReps() {
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
   * Inserts a repetition of Race (PID-10) at a given index and returns it.
   * @param index The index
   */
  public CWE insertRace(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(10, index);
  }

  /**
   * Removes a repetition of Race (PID-10) at a given index and returns it.
   * @param index The index
   */
  public CWE removeRace(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(10, index);
  }

  /**
   * Returns a single repetition of Race (PID-10).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getPid10_Race(int rep) throws HL7Exception {
    CWE ret = null;
    try {
        Type t = this.getField(10, rep);
        ret = (CWE)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Race (PID-10).
   */
  public CWE[] getPid10_Race() {
     CWE[] ret = null;
    try {
        Type[] t = this.getField(10);  
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
   * Returns a count of the number of repetitions of Race (PID-10).
   */
  public int getPid10_RaceReps() {
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
   * Inserts a repetition of Race (PID-10) at a given index and returns it.
   * @param index The index
   */
  public CWE insertPid10_Race(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(10, index);
  }

  /**
   * Removes a repetition of Race (PID-10) at a given index and returns it.
   * @param index The index
   */
  public CWE removePid10_Race(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(10, index);
  }

  /**
   * Returns a single repetition of Patient Address (PID-11).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XAD getPatientAddress(int rep) throws HL7Exception {
    XAD ret = null;
    try {
        Type t = this.getField(11, rep);
        ret = (XAD)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Patient Address (PID-11).
   */
  public XAD[] getPatientAddress() {
     XAD[] ret = null;
    try {
        Type[] t = this.getField(11);  
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
   * Returns a count of the number of repetitions of Patient Address (PID-11).
   */
  public int getPatientAddressReps() {
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
   * Inserts a repetition of Patient Address (PID-11) at a given index and returns it.
   * @param index The index
   */
  public XAD insertPatientAddress(int index) throws HL7Exception {
     return (XAD) super.insertRepetition(11, index);
  }

  /**
   * Removes a repetition of Patient Address (PID-11) at a given index and returns it.
   * @param index The index
   */
  public XAD removePatientAddress(int index) throws HL7Exception {
     return (XAD) super.removeRepetition(11, index);
  }

  /**
   * Returns a single repetition of Patient Address (PID-11).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XAD getPid11_PatientAddress(int rep) throws HL7Exception {
    XAD ret = null;
    try {
        Type t = this.getField(11, rep);
        ret = (XAD)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Patient Address (PID-11).
   */
  public XAD[] getPid11_PatientAddress() {
     XAD[] ret = null;
    try {
        Type[] t = this.getField(11);  
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
   * Returns a count of the number of repetitions of Patient Address (PID-11).
   */
  public int getPid11_PatientAddressReps() {
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
   * Inserts a repetition of Patient Address (PID-11) at a given index and returns it.
   * @param index The index
   */
  public XAD insertPid11_PatientAddress(int index) throws HL7Exception {
     return (XAD) super.insertRepetition(11, index);
  }

  /**
   * Removes a repetition of Patient Address (PID-11) at a given index and returns it.
   * @param index The index
   */
  public XAD removePid11_PatientAddress(int index) throws HL7Exception {
     return (XAD) super.removeRepetition(11, index);
  }

  /**
   * Returns County Code (PID-12).
   */
  public IS getCountyCode()  {
    IS ret = null;
    try {
        Type t = this.getField(12, 0);
        ret = (IS)t;
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
   * Returns County Code (PID-12).
   */
  public IS getPid12_CountyCode()  {
    IS ret = null;
    try {
        Type t = this.getField(12, 0);
        ret = (IS)t;
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
   * Returns a single repetition of Phone Number - Home (PID-13).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XTN getPhoneNumberHome(int rep) throws HL7Exception {
    XTN ret = null;
    try {
        Type t = this.getField(13, rep);
        ret = (XTN)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Phone Number - Home (PID-13).
   */
  public XTN[] getPhoneNumberHome() {
     XTN[] ret = null;
    try {
        Type[] t = this.getField(13);  
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
   * Returns a count of the number of repetitions of Phone Number - Home (PID-13).
   */
  public int getPhoneNumberHomeReps() {
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
   * Inserts a repetition of Phone Number - Home (PID-13) at a given index and returns it.
   * @param index The index
   */
  public XTN insertPhoneNumberHome(int index) throws HL7Exception {
     return (XTN) super.insertRepetition(13, index);
  }

  /**
   * Removes a repetition of Phone Number - Home (PID-13) at a given index and returns it.
   * @param index The index
   */
  public XTN removePhoneNumberHome(int index) throws HL7Exception {
     return (XTN) super.removeRepetition(13, index);
  }

  /**
   * Returns a single repetition of Phone Number - Home (PID-13).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XTN getPid13_PhoneNumberHome(int rep) throws HL7Exception {
    XTN ret = null;
    try {
        Type t = this.getField(13, rep);
        ret = (XTN)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Phone Number - Home (PID-13).
   */
  public XTN[] getPid13_PhoneNumberHome() {
     XTN[] ret = null;
    try {
        Type[] t = this.getField(13);  
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
   * Returns a count of the number of repetitions of Phone Number - Home (PID-13).
   */
  public int getPid13_PhoneNumberHomeReps() {
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
   * Inserts a repetition of Phone Number - Home (PID-13) at a given index and returns it.
   * @param index The index
   */
  public XTN insertPid13_PhoneNumberHome(int index) throws HL7Exception {
     return (XTN) super.insertRepetition(13, index);
  }

  /**
   * Removes a repetition of Phone Number - Home (PID-13) at a given index and returns it.
   * @param index The index
   */
  public XTN removePid13_PhoneNumberHome(int index) throws HL7Exception {
     return (XTN) super.removeRepetition(13, index);
  }

  /**
   * Returns a single repetition of Phone Number - Business (PID-14).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XTN getPhoneNumberBusiness(int rep) throws HL7Exception {
    XTN ret = null;
    try {
        Type t = this.getField(14, rep);
        ret = (XTN)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Phone Number - Business (PID-14).
   */
  public XTN[] getPhoneNumberBusiness() {
     XTN[] ret = null;
    try {
        Type[] t = this.getField(14);  
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
   * Returns a count of the number of repetitions of Phone Number - Business (PID-14).
   */
  public int getPhoneNumberBusinessReps() {
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
   * Inserts a repetition of Phone Number - Business (PID-14) at a given index and returns it.
   * @param index The index
   */
  public XTN insertPhoneNumberBusiness(int index) throws HL7Exception {
     return (XTN) super.insertRepetition(14, index);
  }

  /**
   * Removes a repetition of Phone Number - Business (PID-14) at a given index and returns it.
   * @param index The index
   */
  public XTN removePhoneNumberBusiness(int index) throws HL7Exception {
     return (XTN) super.removeRepetition(14, index);
  }

  /**
   * Returns a single repetition of Phone Number - Business (PID-14).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XTN getPid14_PhoneNumberBusiness(int rep) throws HL7Exception {
    XTN ret = null;
    try {
        Type t = this.getField(14, rep);
        ret = (XTN)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Phone Number - Business (PID-14).
   */
  public XTN[] getPid14_PhoneNumberBusiness() {
     XTN[] ret = null;
    try {
        Type[] t = this.getField(14);  
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
   * Returns a count of the number of repetitions of Phone Number - Business (PID-14).
   */
  public int getPid14_PhoneNumberBusinessReps() {
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
   * Inserts a repetition of Phone Number - Business (PID-14) at a given index and returns it.
   * @param index The index
   */
  public XTN insertPid14_PhoneNumberBusiness(int index) throws HL7Exception {
     return (XTN) super.insertRepetition(14, index);
  }

  /**
   * Removes a repetition of Phone Number - Business (PID-14) at a given index and returns it.
   * @param index The index
   */
  public XTN removePid14_PhoneNumberBusiness(int index) throws HL7Exception {
     return (XTN) super.removeRepetition(14, index);
  }

  /**
   * Returns Primary Language (PID-15).
   */
  public CWE getPrimaryLanguage()  {
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
   * Returns Primary Language (PID-15).
   */
  public CWE getPid15_PrimaryLanguage()  {
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
   * Returns Marital Status (PID-16).
   */
  public CWE getMaritalStatus()  {
    CWE ret = null;
    try {
        Type t = this.getField(16, 0);
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
   * Returns Marital Status (PID-16).
   */
  public CWE getPid16_MaritalStatus()  {
    CWE ret = null;
    try {
        Type t = this.getField(16, 0);
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
   * Returns Religion (PID-17).
   */
  public CWE getReligion()  {
    CWE ret = null;
    try {
        Type t = this.getField(17, 0);
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
   * Returns Religion (PID-17).
   */
  public CWE getPid17_Religion()  {
    CWE ret = null;
    try {
        Type t = this.getField(17, 0);
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
   * Returns Patient Account Number (PID-18).
   */
  public CX getPatientAccountNumber()  {
    CX ret = null;
    try {
        Type t = this.getField(18, 0);
        ret = (CX)t;
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
   * Returns Patient Account Number (PID-18).
   */
  public CX getPid18_PatientAccountNumber()  {
    CX ret = null;
    try {
        Type t = this.getField(18, 0);
        ret = (CX)t;
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
   * Returns SSN Number - Patient (PID-19).
   */
  public ST getSSNNumberPatient()  {
    ST ret = null;
    try {
        Type t = this.getField(19, 0);
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
   * Returns SSN Number - Patient (PID-19).
   */
  public ST getPid19_SSNNumberPatient()  {
    ST ret = null;
    try {
        Type t = this.getField(19, 0);
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
   * Returns Driver's License Number - Patient (PID-20).
   */
  public DLN getDriverSLicenseNumberPatient()  {
    DLN ret = null;
    try {
        Type t = this.getField(20, 0);
        ret = (DLN)t;
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
   * Returns Driver's License Number - Patient (PID-20).
   */
  public DLN getPid20_DriverSLicenseNumberPatient()  {
    DLN ret = null;
    try {
        Type t = this.getField(20, 0);
        ret = (DLN)t;
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
   * Returns a single repetition of Mother's Identifier (PID-21).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CX getMotherSIdentifier(int rep) throws HL7Exception {
    CX ret = null;
    try {
        Type t = this.getField(21, rep);
        ret = (CX)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Mother's Identifier (PID-21).
   */
  public CX[] getMotherSIdentifier() {
     CX[] ret = null;
    try {
        Type[] t = this.getField(21);  
        ret = new CX[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (CX)t[i];
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
   * Returns a count of the number of repetitions of Mother's Identifier (PID-21).
   */
  public int getMotherSIdentifierReps() {
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
   * Inserts a repetition of Mother's Identifier (PID-21) at a given index and returns it.
   * @param index The index
   */
  public CX insertMotherSIdentifier(int index) throws HL7Exception {
     return (CX) super.insertRepetition(21, index);
  }

  /**
   * Removes a repetition of Mother's Identifier (PID-21) at a given index and returns it.
   * @param index The index
   */
  public CX removeMotherSIdentifier(int index) throws HL7Exception {
     return (CX) super.removeRepetition(21, index);
  }

  /**
   * Returns a single repetition of Mother's Identifier (PID-21).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CX getPid21_MotherSIdentifier(int rep) throws HL7Exception {
    CX ret = null;
    try {
        Type t = this.getField(21, rep);
        ret = (CX)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Mother's Identifier (PID-21).
   */
  public CX[] getPid21_MotherSIdentifier() {
     CX[] ret = null;
    try {
        Type[] t = this.getField(21);  
        ret = new CX[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (CX)t[i];
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
   * Returns a count of the number of repetitions of Mother's Identifier (PID-21).
   */
  public int getPid21_MotherSIdentifierReps() {
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
   * Inserts a repetition of Mother's Identifier (PID-21) at a given index and returns it.
   * @param index The index
   */
  public CX insertPid21_MotherSIdentifier(int index) throws HL7Exception {
     return (CX) super.insertRepetition(21, index);
  }

  /**
   * Removes a repetition of Mother's Identifier (PID-21) at a given index and returns it.
   * @param index The index
   */
  public CX removePid21_MotherSIdentifier(int index) throws HL7Exception {
     return (CX) super.removeRepetition(21, index);
  }

  /**
   * Returns a single repetition of Ethnic Group (PID-22).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getEthnicGroup(int rep) throws HL7Exception {
    CWE ret = null;
    try {
        Type t = this.getField(22, rep);
        ret = (CWE)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Ethnic Group (PID-22).
   */
  public CWE[] getEthnicGroup() {
     CWE[] ret = null;
    try {
        Type[] t = this.getField(22);  
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
   * Returns a count of the number of repetitions of Ethnic Group (PID-22).
   */
  public int getEthnicGroupReps() {
    try {
        return this.getField(22).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Ethnic Group (PID-22) at a given index and returns it.
   * @param index The index
   */
  public CWE insertEthnicGroup(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(22, index);
  }

  /**
   * Removes a repetition of Ethnic Group (PID-22) at a given index and returns it.
   * @param index The index
   */
  public CWE removeEthnicGroup(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(22, index);
  }

  /**
   * Returns a single repetition of Ethnic Group (PID-22).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getPid22_EthnicGroup(int rep) throws HL7Exception {
    CWE ret = null;
    try {
        Type t = this.getField(22, rep);
        ret = (CWE)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Ethnic Group (PID-22).
   */
  public CWE[] getPid22_EthnicGroup() {
     CWE[] ret = null;
    try {
        Type[] t = this.getField(22);  
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
   * Returns a count of the number of repetitions of Ethnic Group (PID-22).
   */
  public int getPid22_EthnicGroupReps() {
    try {
        return this.getField(22).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Ethnic Group (PID-22) at a given index and returns it.
   * @param index The index
   */
  public CWE insertPid22_EthnicGroup(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(22, index);
  }

  /**
   * Removes a repetition of Ethnic Group (PID-22) at a given index and returns it.
   * @param index The index
   */
  public CWE removePid22_EthnicGroup(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(22, index);
  }

  /**
   * Returns Birth Place (PID-23).
   */
  public ST getBirthPlace()  {
    ST ret = null;
    try {
        Type t = this.getField(23, 0);
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
   * Returns Birth Place (PID-23).
   */
  public ST getPid23_BirthPlace()  {
    ST ret = null;
    try {
        Type t = this.getField(23, 0);
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
   * Returns Multiple Birth Indicator (PID-24).
   */
  public ID getMultipleBirthIndicator()  {
    ID ret = null;
    try {
        Type t = this.getField(24, 0);
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
   * Returns Multiple Birth Indicator (PID-24).
   */
  public ID getPid24_MultipleBirthIndicator()  {
    ID ret = null;
    try {
        Type t = this.getField(24, 0);
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
   * Returns Birth Order (PID-25).
   */
  public NM getBirthOrder()  {
    NM ret = null;
    try {
        Type t = this.getField(25, 0);
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
   * Returns Birth Order (PID-25).
   */
  public NM getPid25_BirthOrder()  {
    NM ret = null;
    try {
        Type t = this.getField(25, 0);
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
   * Returns a single repetition of Citizenship (PID-26).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getCitizenship(int rep) throws HL7Exception {
    CWE ret = null;
    try {
        Type t = this.getField(26, rep);
        ret = (CWE)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Citizenship (PID-26).
   */
  public CWE[] getCitizenship() {
     CWE[] ret = null;
    try {
        Type[] t = this.getField(26);  
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
   * Returns a count of the number of repetitions of Citizenship (PID-26).
   */
  public int getCitizenshipReps() {
    try {
        return this.getField(26).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Citizenship (PID-26) at a given index and returns it.
   * @param index The index
   */
  public CWE insertCitizenship(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(26, index);
  }

  /**
   * Removes a repetition of Citizenship (PID-26) at a given index and returns it.
   * @param index The index
   */
  public CWE removeCitizenship(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(26, index);
  }

  /**
   * Returns a single repetition of Citizenship (PID-26).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getPid26_Citizenship(int rep) throws HL7Exception {
    CWE ret = null;
    try {
        Type t = this.getField(26, rep);
        ret = (CWE)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Citizenship (PID-26).
   */
  public CWE[] getPid26_Citizenship() {
     CWE[] ret = null;
    try {
        Type[] t = this.getField(26);  
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
   * Returns a count of the number of repetitions of Citizenship (PID-26).
   */
  public int getPid26_CitizenshipReps() {
    try {
        return this.getField(26).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Citizenship (PID-26) at a given index and returns it.
   * @param index The index
   */
  public CWE insertPid26_Citizenship(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(26, index);
  }

  /**
   * Removes a repetition of Citizenship (PID-26) at a given index and returns it.
   * @param index The index
   */
  public CWE removePid26_Citizenship(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(26, index);
  }

  /**
   * Returns Veterans Military Status (PID-27).
   */
  public CWE getVeteransMilitaryStatus()  {
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
   * Returns Veterans Military Status (PID-27).
   */
  public CWE getPid27_VeteransMilitaryStatus()  {
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
   * Returns Nationality (PID-28).
   */
  public CWE getNationality()  {
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
   * Returns Nationality (PID-28).
   */
  public CWE getPid28_Nationality()  {
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
   * Returns Patient Death Date and Time (PID-29).
   */
  public DTM getPatientDeathDateAndTime()  {
    DTM ret = null;
    try {
        Type t = this.getField(29, 0);
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
   * Returns Patient Death Date and Time (PID-29).
   */
  public DTM getPid29_PatientDeathDateAndTime()  {
    DTM ret = null;
    try {
        Type t = this.getField(29, 0);
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
   * Returns Patient Death Indicator (PID-30).
   */
  public ID getPatientDeathIndicator()  {
    ID ret = null;
    try {
        Type t = this.getField(30, 0);
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
   * Returns Patient Death Indicator (PID-30).
   */
  public ID getPid30_PatientDeathIndicator()  {
    ID ret = null;
    try {
        Type t = this.getField(30, 0);
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
   * Returns Identity Unknown Indicator (PID-31).
   */
  public ID getIdentityUnknownIndicator()  {
    ID ret = null;
    try {
        Type t = this.getField(31, 0);
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
   * Returns Identity Unknown Indicator (PID-31).
   */
  public ID getPid31_IdentityUnknownIndicator()  {
    ID ret = null;
    try {
        Type t = this.getField(31, 0);
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
   * Returns a single repetition of Identity Reliability Code (PID-32).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public IS getIdentityReliabilityCode(int rep) throws HL7Exception {
    IS ret = null;
    try {
        Type t = this.getField(32, rep);
        ret = (IS)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Identity Reliability Code (PID-32).
   */
  public IS[] getIdentityReliabilityCode() {
     IS[] ret = null;
    try {
        Type[] t = this.getField(32);  
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
   * Returns a count of the number of repetitions of Identity Reliability Code (PID-32).
   */
  public int getIdentityReliabilityCodeReps() {
    try {
        return this.getField(32).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Identity Reliability Code (PID-32) at a given index and returns it.
   * @param index The index
   */
  public IS insertIdentityReliabilityCode(int index) throws HL7Exception {
     return (IS) super.insertRepetition(32, index);
  }

  /**
   * Removes a repetition of Identity Reliability Code (PID-32) at a given index and returns it.
   * @param index The index
   */
  public IS removeIdentityReliabilityCode(int index) throws HL7Exception {
     return (IS) super.removeRepetition(32, index);
  }

  /**
   * Returns a single repetition of Identity Reliability Code (PID-32).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public IS getPid32_IdentityReliabilityCode(int rep) throws HL7Exception {
    IS ret = null;
    try {
        Type t = this.getField(32, rep);
        ret = (IS)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Identity Reliability Code (PID-32).
   */
  public IS[] getPid32_IdentityReliabilityCode() {
     IS[] ret = null;
    try {
        Type[] t = this.getField(32);  
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
   * Returns a count of the number of repetitions of Identity Reliability Code (PID-32).
   */
  public int getPid32_IdentityReliabilityCodeReps() {
    try {
        return this.getField(32).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Identity Reliability Code (PID-32) at a given index and returns it.
   * @param index The index
   */
  public IS insertPid32_IdentityReliabilityCode(int index) throws HL7Exception {
     return (IS) super.insertRepetition(32, index);
  }

  /**
   * Removes a repetition of Identity Reliability Code (PID-32) at a given index and returns it.
   * @param index The index
   */
  public IS removePid32_IdentityReliabilityCode(int index) throws HL7Exception {
     return (IS) super.removeRepetition(32, index);
  }

  /**
   * Returns Last Update Date/Time (PID-33).
   */
  public DTM getLastUpdateDateTime()  {
    DTM ret = null;
    try {
        Type t = this.getField(33, 0);
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
   * Returns Last Update Date/Time (PID-33).
   */
  public DTM getPid33_LastUpdateDateTime()  {
    DTM ret = null;
    try {
        Type t = this.getField(33, 0);
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
   * Returns Last Update Facility (PID-34).
   */
  public HD getLastUpdateFacility()  {
    HD ret = null;
    try {
        Type t = this.getField(34, 0);
        ret = (HD)t;
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
   * Returns Last Update Facility (PID-34).
   */
  public HD getPid34_LastUpdateFacility()  {
    HD ret = null;
    try {
        Type t = this.getField(34, 0);
        ret = (HD)t;
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
   * Returns Species Code (PID-35).
   */
  public CWE getSpeciesCode()  {
    CWE ret = null;
    try {
        Type t = this.getField(35, 0);
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
   * Returns Species Code (PID-35).
   */
  public CWE getPid35_SpeciesCode()  {
    CWE ret = null;
    try {
        Type t = this.getField(35, 0);
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
   * Returns Breed Code (PID-36).
   */
  public CWE getBreedCode()  {
    CWE ret = null;
    try {
        Type t = this.getField(36, 0);
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
   * Returns Breed Code (PID-36).
   */
  public CWE getPid36_BreedCode()  {
    CWE ret = null;
    try {
        Type t = this.getField(36, 0);
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
   * Returns Strain (PID-37).
   */
  public ST getStrain()  {
    ST ret = null;
    try {
        Type t = this.getField(37, 0);
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
   * Returns Strain (PID-37).
   */
  public ST getPid37_Strain()  {
    ST ret = null;
    try {
        Type t = this.getField(37, 0);
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
   * Returns Production Class Code (PID-38).
   */
  public CWE getProductionClassCode()  {
    CWE ret = null;
    try {
        Type t = this.getField(38, 0);
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
   * Returns Production Class Code (PID-38).
   */
  public CWE getPid38_ProductionClassCode()  {
    CWE ret = null;
    try {
        Type t = this.getField(38, 0);
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
   * Returns a single repetition of Tribal Citizenship (PID-39).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getTribalCitizenship(int rep) throws HL7Exception {
    CWE ret = null;
    try {
        Type t = this.getField(39, rep);
        ret = (CWE)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Tribal Citizenship (PID-39).
   */
  public CWE[] getTribalCitizenship() {
     CWE[] ret = null;
    try {
        Type[] t = this.getField(39);  
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
   * Returns a count of the number of repetitions of Tribal Citizenship (PID-39).
   */
  public int getTribalCitizenshipReps() {
    try {
        return this.getField(39).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Tribal Citizenship (PID-39) at a given index and returns it.
   * @param index The index
   */
  public CWE insertTribalCitizenship(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(39, index);
  }

  /**
   * Removes a repetition of Tribal Citizenship (PID-39) at a given index and returns it.
   * @param index The index
   */
  public CWE removeTribalCitizenship(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(39, index);
  }

  /**
   * Returns a single repetition of Tribal Citizenship (PID-39).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getPid39_TribalCitizenship(int rep) throws HL7Exception {
    CWE ret = null;
    try {
        Type t = this.getField(39, rep);
        ret = (CWE)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Tribal Citizenship (PID-39).
   */
  public CWE[] getPid39_TribalCitizenship() {
     CWE[] ret = null;
    try {
        Type[] t = this.getField(39);  
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
   * Returns a count of the number of repetitions of Tribal Citizenship (PID-39).
   */
  public int getPid39_TribalCitizenshipReps() {
    try {
        return this.getField(39).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Tribal Citizenship (PID-39) at a given index and returns it.
   * @param index The index
   */
  public CWE insertPid39_TribalCitizenship(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(39, index);
  }

  /**
   * Removes a repetition of Tribal Citizenship (PID-39) at a given index and returns it.
   * @param index The index
   */
  public CWE removePid39_TribalCitizenship(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(39, index);
  }

   protected Type createNewTypeWithoutReflection(int field) {
      switch (field) {
         case 0: return new ca.uhn.hl7v2.model.v26.datatype.SI(getMessage());
         case 1: return new ca.uhn.hl7v2.model.v26.datatype.CX(getMessage());
         case 2: return new ca.uhn.hl7v2.model.v26.datatype.CX(getMessage());
         case 3: return new ca.uhn.hl7v2.model.v26.datatype.CX(getMessage());
         case 4: return new ca.uhn.hl7v2.model.v26.datatype.XPN(getMessage());
         case 5: return new ca.uhn.hl7v2.model.v26.datatype.XPN(getMessage());
         case 6: return new ca.uhn.hl7v2.model.v26.datatype.DTM(getMessage());
         case 7: return new ca.uhn.hl7v2.model.v26.datatype.IS(getMessage(), new Integer(1));
         case 8: return new ca.uhn.hl7v2.model.v26.datatype.XPN(getMessage());
         case 9: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 10: return new ca.uhn.hl7v2.model.v26.datatype.XAD(getMessage());
         case 11: return new ca.uhn.hl7v2.model.v26.datatype.IS(getMessage(), new Integer(289));
         case 12: return new ca.uhn.hl7v2.model.v26.datatype.XTN(getMessage());
         case 13: return new ca.uhn.hl7v2.model.v26.datatype.XTN(getMessage());
         case 14: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 15: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 16: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 17: return new ca.uhn.hl7v2.model.v26.datatype.CX(getMessage());
         case 18: return new ca.uhn.hl7v2.model.v26.datatype.ST(getMessage());
         case 19: return new ca.uhn.hl7v2.model.v26.datatype.DLN(getMessage());
         case 20: return new ca.uhn.hl7v2.model.v26.datatype.CX(getMessage());
         case 21: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 22: return new ca.uhn.hl7v2.model.v26.datatype.ST(getMessage());
         case 23: return new ca.uhn.hl7v2.model.v26.datatype.ID(getMessage(), new Integer(136));
         case 24: return new ca.uhn.hl7v2.model.v26.datatype.NM(getMessage());
         case 25: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 26: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 27: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 28: return new ca.uhn.hl7v2.model.v26.datatype.DTM(getMessage());
         case 29: return new ca.uhn.hl7v2.model.v26.datatype.ID(getMessage(), new Integer(136));
         case 30: return new ca.uhn.hl7v2.model.v26.datatype.ID(getMessage(), new Integer(136));
         case 31: return new ca.uhn.hl7v2.model.v26.datatype.IS(getMessage(), new Integer(445));
         case 32: return new ca.uhn.hl7v2.model.v26.datatype.DTM(getMessage());
         case 33: return new ca.uhn.hl7v2.model.v26.datatype.HD(getMessage());
         case 34: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 35: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 36: return new ca.uhn.hl7v2.model.v26.datatype.ST(getMessage());
         case 37: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 38: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         default: return null;
      }
   }

}