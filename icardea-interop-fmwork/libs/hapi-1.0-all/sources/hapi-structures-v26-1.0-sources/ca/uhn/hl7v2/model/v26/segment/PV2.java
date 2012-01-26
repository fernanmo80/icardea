package ca.uhn.hl7v2.model.v26.segment;

import ca.uhn.hl7v2.model.*;
import ca.uhn.hl7v2.model.v26.datatype.*;
import ca.uhn.log.HapiLogFactory;
import ca.uhn.hl7v2.parser.ModelClassFactory;
import ca.uhn.hl7v2.HL7Exception;

/**
 * <p>Represents an HL7 PV2 message segment. 
 * This segment has the following fields:</p><p>
 * PV2-1: Prior Pending Location (PL)<br> 
 * PV2-2: Accommodation Code (CWE)<br> 
 * PV2-3: Admit Reason (CWE)<br> 
 * PV2-4: Transfer Reason (CWE)<br> 
 * PV2-5: Patient Valuables (ST)<br> 
 * PV2-6: Patient Valuables Location (ST)<br> 
 * PV2-7: Visit User Code (IS)<br> 
 * PV2-8: Expected Admit Date/Time (DTM)<br> 
 * PV2-9: Expected Discharge Date/Time (DTM)<br> 
 * PV2-10: Estimated Length of Inpatient Stay (NM)<br> 
 * PV2-11: Actual Length of Inpatient Stay (NM)<br> 
 * PV2-12: Visit Description (ST)<br> 
 * PV2-13: Referral Source Code (XCN)<br> 
 * PV2-14: Previous Service Date (DT)<br> 
 * PV2-15: Employment Illness Related Indicator (ID)<br> 
 * PV2-16: Purge Status Code (IS)<br> 
 * PV2-17: Purge Status Date (DT)<br> 
 * PV2-18: Special Program Code (IS)<br> 
 * PV2-19: Retention Indicator (ID)<br> 
 * PV2-20: Expected Number of Insurance Plans (NM)<br> 
 * PV2-21: Visit Publicity Code (IS)<br> 
 * PV2-22: Visit Protection Indicator (ID)<br> 
 * PV2-23: Clinic Organization Name (XON)<br> 
 * PV2-24: Patient Status Code (IS)<br> 
 * PV2-25: Visit Priority Code (IS)<br> 
 * PV2-26: Previous Treatment Date (DT)<br> 
 * PV2-27: Expected Discharge Disposition (IS)<br> 
 * PV2-28: Signature on File Date (DT)<br> 
 * PV2-29: First Similar Illness Date (DT)<br> 
 * PV2-30: Patient Charge Adjustment Code (CWE)<br> 
 * PV2-31: Recurring Service Code (IS)<br> 
 * PV2-32: Billing Media Code (ID)<br> 
 * PV2-33: Expected Surgery Date and Time (DTM)<br> 
 * PV2-34: Military Partnership Code (ID)<br> 
 * PV2-35: Military Non-Availability Code (ID)<br> 
 * PV2-36: Newborn Baby Indicator (ID)<br> 
 * PV2-37: Baby Detained Indicator (ID)<br> 
 * PV2-38: Mode of Arrival Code (CWE)<br> 
 * PV2-39: Recreational Drug Use Code (CWE)<br> 
 * PV2-40: Admission Level of Care Code (CWE)<br> 
 * PV2-41: Precaution Code (CWE)<br> 
 * PV2-42: Patient Condition Code (CWE)<br> 
 * PV2-43: Living Will Code (IS)<br> 
 * PV2-44: Organ Donor Code (IS)<br> 
 * PV2-45: Advance Directive Code (CWE)<br> 
 * PV2-46: Patient Status Effective Date (DT)<br> 
 * PV2-47: Expected LOA Return Date/Time (DTM)<br> 
 * PV2-48: Expected Pre-admission Testing Date/Time (DTM)<br> 
 * PV2-49: Notify Clergy Code (IS)<br> 
 * PV2-50: Advance Directive Last Verified Date (DT)<br> 
 * </p><p>The get...() methods return data from individual fields.  These methods 
 * do not throw exceptions and may therefore have to handle exceptions internally.  
 * If an exception is handled internally, it is logged and null is returned.  
 * This is not expected to happen - if it does happen this indicates not so much 
 * an exceptional circumstance as a bug in the code for this class.</p>    
 */
public class PV2 extends AbstractSegment  {

  /**
   * Creates a PV2 (Patient Visit - Additional Information) segment object that belongs to the given 
   * message.  
   */
  public PV2(Group parent, ModelClassFactory factory) {
    super(parent, factory);
    Message message = getMessage();
    try {
       this.add(PL.class, false, 1, 80, new Object[]{message}, "Prior Pending Location");
       this.add(CWE.class, false, 1, 705, new Object[]{message}, "Accommodation Code");
       this.add(CWE.class, false, 1, 705, new Object[]{message}, "Admit Reason");
       this.add(CWE.class, false, 1, 705, new Object[]{message}, "Transfer Reason");
       this.add(ST.class, false, 0, 25, new Object[]{message}, "Patient Valuables");
       this.add(ST.class, false, 1, 25, new Object[]{message}, "Patient Valuables Location");
       this.add(IS.class, false, 0, 2, new Object[]{message, new Integer(130)}, "Visit User Code");
       this.add(DTM.class, false, 1, 24, new Object[]{message}, "Expected Admit Date/Time");
       this.add(DTM.class, false, 1, 24, new Object[]{message}, "Expected Discharge Date/Time");
       this.add(NM.class, false, 1, 3, new Object[]{message}, "Estimated Length of Inpatient Stay");
       this.add(NM.class, false, 1, 3, new Object[]{message}, "Actual Length of Inpatient Stay");
       this.add(ST.class, false, 1, 50, new Object[]{message}, "Visit Description");
       this.add(XCN.class, false, 0, 250, new Object[]{message}, "Referral Source Code");
       this.add(DT.class, false, 1, 8, new Object[]{message}, "Previous Service Date");
       this.add(ID.class, false, 1, 1, new Object[]{message, new Integer(136)}, "Employment Illness Related Indicator");
       this.add(IS.class, false, 1, 1, new Object[]{message, new Integer(213)}, "Purge Status Code");
       this.add(DT.class, false, 1, 8, new Object[]{message}, "Purge Status Date");
       this.add(IS.class, false, 1, 2, new Object[]{message, new Integer(214)}, "Special Program Code");
       this.add(ID.class, false, 1, 1, new Object[]{message, new Integer(136)}, "Retention Indicator");
       this.add(NM.class, false, 1, 1, new Object[]{message}, "Expected Number of Insurance Plans");
       this.add(IS.class, false, 1, 1, new Object[]{message, new Integer(215)}, "Visit Publicity Code");
       this.add(ID.class, false, 1, 0, new Object[]{message, new Integer(136)}, "Visit Protection Indicator");
       this.add(XON.class, false, 0, 250, new Object[]{message}, "Clinic Organization Name");
       this.add(IS.class, false, 1, 2, new Object[]{message, new Integer(216)}, "Patient Status Code");
       this.add(IS.class, false, 1, 1, new Object[]{message, new Integer(217)}, "Visit Priority Code");
       this.add(DT.class, false, 1, 8, new Object[]{message}, "Previous Treatment Date");
       this.add(IS.class, false, 1, 2, new Object[]{message, new Integer(112)}, "Expected Discharge Disposition");
       this.add(DT.class, false, 1, 8, new Object[]{message}, "Signature on File Date");
       this.add(DT.class, false, 1, 8, new Object[]{message}, "First Similar Illness Date");
       this.add(CWE.class, false, 1, 705, new Object[]{message}, "Patient Charge Adjustment Code");
       this.add(IS.class, false, 1, 2, new Object[]{message, new Integer(219)}, "Recurring Service Code");
       this.add(ID.class, false, 1, 1, new Object[]{message, new Integer(136)}, "Billing Media Code");
       this.add(DTM.class, false, 1, 24, new Object[]{message}, "Expected Surgery Date and Time");
       this.add(ID.class, false, 1, 1, new Object[]{message, new Integer(136)}, "Military Partnership Code");
       this.add(ID.class, false, 1, 1, new Object[]{message, new Integer(136)}, "Military Non-Availability Code");
       this.add(ID.class, false, 1, 1, new Object[]{message, new Integer(136)}, "Newborn Baby Indicator");
       this.add(ID.class, false, 1, 1, new Object[]{message, new Integer(136)}, "Baby Detained Indicator");
       this.add(CWE.class, false, 1, 705, new Object[]{message}, "Mode of Arrival Code");
       this.add(CWE.class, false, 0, 705, new Object[]{message}, "Recreational Drug Use Code");
       this.add(CWE.class, false, 1, 705, new Object[]{message}, "Admission Level of Care Code");
       this.add(CWE.class, false, 0, 705, new Object[]{message}, "Precaution Code");
       this.add(CWE.class, false, 1, 705, new Object[]{message}, "Patient Condition Code");
       this.add(IS.class, false, 1, 2, new Object[]{message, new Integer(315)}, "Living Will Code");
       this.add(IS.class, false, 1, 2, new Object[]{message, new Integer(316)}, "Organ Donor Code");
       this.add(CWE.class, false, 0, 705, new Object[]{message}, "Advance Directive Code");
       this.add(DT.class, false, 1, 8, new Object[]{message}, "Patient Status Effective Date");
       this.add(DTM.class, false, 1, 24, new Object[]{message}, "Expected LOA Return Date/Time");
       this.add(DTM.class, false, 1, 24, new Object[]{message}, "Expected Pre-admission Testing Date/Time");
       this.add(IS.class, false, 0, 20, new Object[]{message, new Integer(534)}, "Notify Clergy Code");
       this.add(DT.class, false, 1, 8, new Object[]{message}, "Advance Directive Last Verified Date");
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Can't instantiate " + this.getClass().getName(), he);
    }
  }

  /**
   * Returns Prior Pending Location (PV2-1).
   */
  public PL getPriorPendingLocation()  {
    PL ret = null;
    try {
        Type t = this.getField(1, 0);
        ret = (PL)t;
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
   * Returns Prior Pending Location (PV2-1).
   */
  public PL getPv21_PriorPendingLocation()  {
    PL ret = null;
    try {
        Type t = this.getField(1, 0);
        ret = (PL)t;
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
   * Returns Accommodation Code (PV2-2).
   */
  public CWE getAccommodationCode()  {
    CWE ret = null;
    try {
        Type t = this.getField(2, 0);
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
   * Returns Accommodation Code (PV2-2).
   */
  public CWE getPv22_AccommodationCode()  {
    CWE ret = null;
    try {
        Type t = this.getField(2, 0);
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
   * Returns Admit Reason (PV2-3).
   */
  public CWE getAdmitReason()  {
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
   * Returns Admit Reason (PV2-3).
   */
  public CWE getPv23_AdmitReason()  {
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
   * Returns Transfer Reason (PV2-4).
   */
  public CWE getTransferReason()  {
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
   * Returns Transfer Reason (PV2-4).
   */
  public CWE getPv24_TransferReason()  {
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
   * Returns a single repetition of Patient Valuables (PV2-5).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public ST getPatientValuables(int rep) throws HL7Exception {
    ST ret = null;
    try {
        Type t = this.getField(5, rep);
        ret = (ST)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Patient Valuables (PV2-5).
   */
  public ST[] getPatientValuables() {
     ST[] ret = null;
    try {
        Type[] t = this.getField(5);  
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
   * Returns a count of the number of repetitions of Patient Valuables (PV2-5).
   */
  public int getPatientValuablesReps() {
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
   * Inserts a repetition of Patient Valuables (PV2-5) at a given index and returns it.
   * @param index The index
   */
  public ST insertPatientValuables(int index) throws HL7Exception {
     return (ST) super.insertRepetition(5, index);
  }

  /**
   * Removes a repetition of Patient Valuables (PV2-5) at a given index and returns it.
   * @param index The index
   */
  public ST removePatientValuables(int index) throws HL7Exception {
     return (ST) super.removeRepetition(5, index);
  }

  /**
   * Returns a single repetition of Patient Valuables (PV2-5).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public ST getPv25_PatientValuables(int rep) throws HL7Exception {
    ST ret = null;
    try {
        Type t = this.getField(5, rep);
        ret = (ST)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Patient Valuables (PV2-5).
   */
  public ST[] getPv25_PatientValuables() {
     ST[] ret = null;
    try {
        Type[] t = this.getField(5);  
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
   * Returns a count of the number of repetitions of Patient Valuables (PV2-5).
   */
  public int getPv25_PatientValuablesReps() {
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
   * Inserts a repetition of Patient Valuables (PV2-5) at a given index and returns it.
   * @param index The index
   */
  public ST insertPv25_PatientValuables(int index) throws HL7Exception {
     return (ST) super.insertRepetition(5, index);
  }

  /**
   * Removes a repetition of Patient Valuables (PV2-5) at a given index and returns it.
   * @param index The index
   */
  public ST removePv25_PatientValuables(int index) throws HL7Exception {
     return (ST) super.removeRepetition(5, index);
  }

  /**
   * Returns Patient Valuables Location (PV2-6).
   */
  public ST getPatientValuablesLocation()  {
    ST ret = null;
    try {
        Type t = this.getField(6, 0);
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
   * Returns Patient Valuables Location (PV2-6).
   */
  public ST getPv26_PatientValuablesLocation()  {
    ST ret = null;
    try {
        Type t = this.getField(6, 0);
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
   * Returns a single repetition of Visit User Code (PV2-7).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public IS getVisitUserCode(int rep) throws HL7Exception {
    IS ret = null;
    try {
        Type t = this.getField(7, rep);
        ret = (IS)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Visit User Code (PV2-7).
   */
  public IS[] getVisitUserCode() {
     IS[] ret = null;
    try {
        Type[] t = this.getField(7);  
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
   * Returns a count of the number of repetitions of Visit User Code (PV2-7).
   */
  public int getVisitUserCodeReps() {
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
   * Inserts a repetition of Visit User Code (PV2-7) at a given index and returns it.
   * @param index The index
   */
  public IS insertVisitUserCode(int index) throws HL7Exception {
     return (IS) super.insertRepetition(7, index);
  }

  /**
   * Removes a repetition of Visit User Code (PV2-7) at a given index and returns it.
   * @param index The index
   */
  public IS removeVisitUserCode(int index) throws HL7Exception {
     return (IS) super.removeRepetition(7, index);
  }

  /**
   * Returns a single repetition of Visit User Code (PV2-7).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public IS getPv27_VisitUserCode(int rep) throws HL7Exception {
    IS ret = null;
    try {
        Type t = this.getField(7, rep);
        ret = (IS)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Visit User Code (PV2-7).
   */
  public IS[] getPv27_VisitUserCode() {
     IS[] ret = null;
    try {
        Type[] t = this.getField(7);  
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
   * Returns a count of the number of repetitions of Visit User Code (PV2-7).
   */
  public int getPv27_VisitUserCodeReps() {
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
   * Inserts a repetition of Visit User Code (PV2-7) at a given index and returns it.
   * @param index The index
   */
  public IS insertPv27_VisitUserCode(int index) throws HL7Exception {
     return (IS) super.insertRepetition(7, index);
  }

  /**
   * Removes a repetition of Visit User Code (PV2-7) at a given index and returns it.
   * @param index The index
   */
  public IS removePv27_VisitUserCode(int index) throws HL7Exception {
     return (IS) super.removeRepetition(7, index);
  }

  /**
   * Returns Expected Admit Date/Time (PV2-8).
   */
  public DTM getExpectedAdmitDateTime()  {
    DTM ret = null;
    try {
        Type t = this.getField(8, 0);
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
   * Returns Expected Admit Date/Time (PV2-8).
   */
  public DTM getPv28_ExpectedAdmitDateTime()  {
    DTM ret = null;
    try {
        Type t = this.getField(8, 0);
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
   * Returns Expected Discharge Date/Time (PV2-9).
   */
  public DTM getExpectedDischargeDateTime()  {
    DTM ret = null;
    try {
        Type t = this.getField(9, 0);
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
   * Returns Expected Discharge Date/Time (PV2-9).
   */
  public DTM getPv29_ExpectedDischargeDateTime()  {
    DTM ret = null;
    try {
        Type t = this.getField(9, 0);
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
   * Returns Estimated Length of Inpatient Stay (PV2-10).
   */
  public NM getEstimatedLengthOfInpatientStay()  {
    NM ret = null;
    try {
        Type t = this.getField(10, 0);
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
   * Returns Estimated Length of Inpatient Stay (PV2-10).
   */
  public NM getPv210_EstimatedLengthOfInpatientStay()  {
    NM ret = null;
    try {
        Type t = this.getField(10, 0);
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
   * Returns Actual Length of Inpatient Stay (PV2-11).
   */
  public NM getActualLengthOfInpatientStay()  {
    NM ret = null;
    try {
        Type t = this.getField(11, 0);
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
   * Returns Actual Length of Inpatient Stay (PV2-11).
   */
  public NM getPv211_ActualLengthOfInpatientStay()  {
    NM ret = null;
    try {
        Type t = this.getField(11, 0);
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
   * Returns Visit Description (PV2-12).
   */
  public ST getVisitDescription()  {
    ST ret = null;
    try {
        Type t = this.getField(12, 0);
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
   * Returns Visit Description (PV2-12).
   */
  public ST getPv212_VisitDescription()  {
    ST ret = null;
    try {
        Type t = this.getField(12, 0);
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
   * Returns a single repetition of Referral Source Code (PV2-13).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XCN getReferralSourceCode(int rep) throws HL7Exception {
    XCN ret = null;
    try {
        Type t = this.getField(13, rep);
        ret = (XCN)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Referral Source Code (PV2-13).
   */
  public XCN[] getReferralSourceCode() {
     XCN[] ret = null;
    try {
        Type[] t = this.getField(13);  
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
   * Returns a count of the number of repetitions of Referral Source Code (PV2-13).
   */
  public int getReferralSourceCodeReps() {
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
   * Inserts a repetition of Referral Source Code (PV2-13) at a given index and returns it.
   * @param index The index
   */
  public XCN insertReferralSourceCode(int index) throws HL7Exception {
     return (XCN) super.insertRepetition(13, index);
  }

  /**
   * Removes a repetition of Referral Source Code (PV2-13) at a given index and returns it.
   * @param index The index
   */
  public XCN removeReferralSourceCode(int index) throws HL7Exception {
     return (XCN) super.removeRepetition(13, index);
  }

  /**
   * Returns a single repetition of Referral Source Code (PV2-13).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XCN getPv213_ReferralSourceCode(int rep) throws HL7Exception {
    XCN ret = null;
    try {
        Type t = this.getField(13, rep);
        ret = (XCN)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Referral Source Code (PV2-13).
   */
  public XCN[] getPv213_ReferralSourceCode() {
     XCN[] ret = null;
    try {
        Type[] t = this.getField(13);  
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
   * Returns a count of the number of repetitions of Referral Source Code (PV2-13).
   */
  public int getPv213_ReferralSourceCodeReps() {
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
   * Inserts a repetition of Referral Source Code (PV2-13) at a given index and returns it.
   * @param index The index
   */
  public XCN insertPv213_ReferralSourceCode(int index) throws HL7Exception {
     return (XCN) super.insertRepetition(13, index);
  }

  /**
   * Removes a repetition of Referral Source Code (PV2-13) at a given index and returns it.
   * @param index The index
   */
  public XCN removePv213_ReferralSourceCode(int index) throws HL7Exception {
     return (XCN) super.removeRepetition(13, index);
  }

  /**
   * Returns Previous Service Date (PV2-14).
   */
  public DT getPreviousServiceDate()  {
    DT ret = null;
    try {
        Type t = this.getField(14, 0);
        ret = (DT)t;
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
   * Returns Previous Service Date (PV2-14).
   */
  public DT getPv214_PreviousServiceDate()  {
    DT ret = null;
    try {
        Type t = this.getField(14, 0);
        ret = (DT)t;
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
   * Returns Employment Illness Related Indicator (PV2-15).
   */
  public ID getEmploymentIllnessRelatedIndicator()  {
    ID ret = null;
    try {
        Type t = this.getField(15, 0);
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
   * Returns Employment Illness Related Indicator (PV2-15).
   */
  public ID getPv215_EmploymentIllnessRelatedIndicator()  {
    ID ret = null;
    try {
        Type t = this.getField(15, 0);
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
   * Returns Purge Status Code (PV2-16).
   */
  public IS getPurgeStatusCode()  {
    IS ret = null;
    try {
        Type t = this.getField(16, 0);
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
   * Returns Purge Status Code (PV2-16).
   */
  public IS getPv216_PurgeStatusCode()  {
    IS ret = null;
    try {
        Type t = this.getField(16, 0);
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
   * Returns Purge Status Date (PV2-17).
   */
  public DT getPurgeStatusDate()  {
    DT ret = null;
    try {
        Type t = this.getField(17, 0);
        ret = (DT)t;
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
   * Returns Purge Status Date (PV2-17).
   */
  public DT getPv217_PurgeStatusDate()  {
    DT ret = null;
    try {
        Type t = this.getField(17, 0);
        ret = (DT)t;
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
   * Returns Special Program Code (PV2-18).
   */
  public IS getSpecialProgramCode()  {
    IS ret = null;
    try {
        Type t = this.getField(18, 0);
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
   * Returns Special Program Code (PV2-18).
   */
  public IS getPv218_SpecialProgramCode()  {
    IS ret = null;
    try {
        Type t = this.getField(18, 0);
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
   * Returns Retention Indicator (PV2-19).
   */
  public ID getRetentionIndicator()  {
    ID ret = null;
    try {
        Type t = this.getField(19, 0);
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
   * Returns Retention Indicator (PV2-19).
   */
  public ID getPv219_RetentionIndicator()  {
    ID ret = null;
    try {
        Type t = this.getField(19, 0);
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
   * Returns Expected Number of Insurance Plans (PV2-20).
   */
  public NM getExpectedNumberOfInsurancePlans()  {
    NM ret = null;
    try {
        Type t = this.getField(20, 0);
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
   * Returns Expected Number of Insurance Plans (PV2-20).
   */
  public NM getPv220_ExpectedNumberOfInsurancePlans()  {
    NM ret = null;
    try {
        Type t = this.getField(20, 0);
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
   * Returns Visit Publicity Code (PV2-21).
   */
  public IS getVisitPublicityCode()  {
    IS ret = null;
    try {
        Type t = this.getField(21, 0);
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
   * Returns Visit Publicity Code (PV2-21).
   */
  public IS getPv221_VisitPublicityCode()  {
    IS ret = null;
    try {
        Type t = this.getField(21, 0);
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
   * Returns Visit Protection Indicator (PV2-22).
   */
  public ID getVisitProtectionIndicator()  {
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
   * Returns Visit Protection Indicator (PV2-22).
   */
  public ID getPv222_VisitProtectionIndicator()  {
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
   * Returns a single repetition of Clinic Organization Name (PV2-23).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XON getClinicOrganizationName(int rep) throws HL7Exception {
    XON ret = null;
    try {
        Type t = this.getField(23, rep);
        ret = (XON)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Clinic Organization Name (PV2-23).
   */
  public XON[] getClinicOrganizationName() {
     XON[] ret = null;
    try {
        Type[] t = this.getField(23);  
        ret = new XON[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (XON)t[i];
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
   * Returns a count of the number of repetitions of Clinic Organization Name (PV2-23).
   */
  public int getClinicOrganizationNameReps() {
    try {
        return this.getField(23).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Clinic Organization Name (PV2-23) at a given index and returns it.
   * @param index The index
   */
  public XON insertClinicOrganizationName(int index) throws HL7Exception {
     return (XON) super.insertRepetition(23, index);
  }

  /**
   * Removes a repetition of Clinic Organization Name (PV2-23) at a given index and returns it.
   * @param index The index
   */
  public XON removeClinicOrganizationName(int index) throws HL7Exception {
     return (XON) super.removeRepetition(23, index);
  }

  /**
   * Returns a single repetition of Clinic Organization Name (PV2-23).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XON getPv223_ClinicOrganizationName(int rep) throws HL7Exception {
    XON ret = null;
    try {
        Type t = this.getField(23, rep);
        ret = (XON)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Clinic Organization Name (PV2-23).
   */
  public XON[] getPv223_ClinicOrganizationName() {
     XON[] ret = null;
    try {
        Type[] t = this.getField(23);  
        ret = new XON[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (XON)t[i];
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
   * Returns a count of the number of repetitions of Clinic Organization Name (PV2-23).
   */
  public int getPv223_ClinicOrganizationNameReps() {
    try {
        return this.getField(23).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Clinic Organization Name (PV2-23) at a given index and returns it.
   * @param index The index
   */
  public XON insertPv223_ClinicOrganizationName(int index) throws HL7Exception {
     return (XON) super.insertRepetition(23, index);
  }

  /**
   * Removes a repetition of Clinic Organization Name (PV2-23) at a given index and returns it.
   * @param index The index
   */
  public XON removePv223_ClinicOrganizationName(int index) throws HL7Exception {
     return (XON) super.removeRepetition(23, index);
  }

  /**
   * Returns Patient Status Code (PV2-24).
   */
  public IS getPatientStatusCode()  {
    IS ret = null;
    try {
        Type t = this.getField(24, 0);
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
   * Returns Patient Status Code (PV2-24).
   */
  public IS getPv224_PatientStatusCode()  {
    IS ret = null;
    try {
        Type t = this.getField(24, 0);
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
   * Returns Visit Priority Code (PV2-25).
   */
  public IS getVisitPriorityCode()  {
    IS ret = null;
    try {
        Type t = this.getField(25, 0);
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
   * Returns Visit Priority Code (PV2-25).
   */
  public IS getPv225_VisitPriorityCode()  {
    IS ret = null;
    try {
        Type t = this.getField(25, 0);
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
   * Returns Previous Treatment Date (PV2-26).
   */
  public DT getPreviousTreatmentDate()  {
    DT ret = null;
    try {
        Type t = this.getField(26, 0);
        ret = (DT)t;
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
   * Returns Previous Treatment Date (PV2-26).
   */
  public DT getPv226_PreviousTreatmentDate()  {
    DT ret = null;
    try {
        Type t = this.getField(26, 0);
        ret = (DT)t;
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
   * Returns Expected Discharge Disposition (PV2-27).
   */
  public IS getExpectedDischargeDisposition()  {
    IS ret = null;
    try {
        Type t = this.getField(27, 0);
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
   * Returns Expected Discharge Disposition (PV2-27).
   */
  public IS getPv227_ExpectedDischargeDisposition()  {
    IS ret = null;
    try {
        Type t = this.getField(27, 0);
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
   * Returns Signature on File Date (PV2-28).
   */
  public DT getSignatureOnFileDate()  {
    DT ret = null;
    try {
        Type t = this.getField(28, 0);
        ret = (DT)t;
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
   * Returns Signature on File Date (PV2-28).
   */
  public DT getPv228_SignatureOnFileDate()  {
    DT ret = null;
    try {
        Type t = this.getField(28, 0);
        ret = (DT)t;
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
   * Returns First Similar Illness Date (PV2-29).
   */
  public DT getFirstSimilarIllnessDate()  {
    DT ret = null;
    try {
        Type t = this.getField(29, 0);
        ret = (DT)t;
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
   * Returns First Similar Illness Date (PV2-29).
   */
  public DT getPv229_FirstSimilarIllnessDate()  {
    DT ret = null;
    try {
        Type t = this.getField(29, 0);
        ret = (DT)t;
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
   * Returns Patient Charge Adjustment Code (PV2-30).
   */
  public CWE getPatientChargeAdjustmentCode()  {
    CWE ret = null;
    try {
        Type t = this.getField(30, 0);
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
   * Returns Patient Charge Adjustment Code (PV2-30).
   */
  public CWE getPv230_PatientChargeAdjustmentCode()  {
    CWE ret = null;
    try {
        Type t = this.getField(30, 0);
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
   * Returns Recurring Service Code (PV2-31).
   */
  public IS getRecurringServiceCode()  {
    IS ret = null;
    try {
        Type t = this.getField(31, 0);
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
   * Returns Recurring Service Code (PV2-31).
   */
  public IS getPv231_RecurringServiceCode()  {
    IS ret = null;
    try {
        Type t = this.getField(31, 0);
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
   * Returns Billing Media Code (PV2-32).
   */
  public ID getBillingMediaCode()  {
    ID ret = null;
    try {
        Type t = this.getField(32, 0);
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
   * Returns Billing Media Code (PV2-32).
   */
  public ID getPv232_BillingMediaCode()  {
    ID ret = null;
    try {
        Type t = this.getField(32, 0);
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
   * Returns Expected Surgery Date and Time (PV2-33).
   */
  public DTM getExpectedSurgeryDateAndTime()  {
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
   * Returns Expected Surgery Date and Time (PV2-33).
   */
  public DTM getPv233_ExpectedSurgeryDateAndTime()  {
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
   * Returns Military Partnership Code (PV2-34).
   */
  public ID getMilitaryPartnershipCode()  {
    ID ret = null;
    try {
        Type t = this.getField(34, 0);
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
   * Returns Military Partnership Code (PV2-34).
   */
  public ID getPv234_MilitaryPartnershipCode()  {
    ID ret = null;
    try {
        Type t = this.getField(34, 0);
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
   * Returns Military Non-Availability Code (PV2-35).
   */
  public ID getMilitaryNonAvailabilityCode()  {
    ID ret = null;
    try {
        Type t = this.getField(35, 0);
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
   * Returns Military Non-Availability Code (PV2-35).
   */
  public ID getPv235_MilitaryNonAvailabilityCode()  {
    ID ret = null;
    try {
        Type t = this.getField(35, 0);
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
   * Returns Newborn Baby Indicator (PV2-36).
   */
  public ID getNewbornBabyIndicator()  {
    ID ret = null;
    try {
        Type t = this.getField(36, 0);
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
   * Returns Newborn Baby Indicator (PV2-36).
   */
  public ID getPv236_NewbornBabyIndicator()  {
    ID ret = null;
    try {
        Type t = this.getField(36, 0);
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
   * Returns Baby Detained Indicator (PV2-37).
   */
  public ID getBabyDetainedIndicator()  {
    ID ret = null;
    try {
        Type t = this.getField(37, 0);
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
   * Returns Baby Detained Indicator (PV2-37).
   */
  public ID getPv237_BabyDetainedIndicator()  {
    ID ret = null;
    try {
        Type t = this.getField(37, 0);
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
   * Returns Mode of Arrival Code (PV2-38).
   */
  public CWE getModeOfArrivalCode()  {
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
   * Returns Mode of Arrival Code (PV2-38).
   */
  public CWE getPv238_ModeOfArrivalCode()  {
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
   * Returns a single repetition of Recreational Drug Use Code (PV2-39).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getRecreationalDrugUseCode(int rep) throws HL7Exception {
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
   * Returns all repetitions of Recreational Drug Use Code (PV2-39).
   */
  public CWE[] getRecreationalDrugUseCode() {
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
   * Returns a count of the number of repetitions of Recreational Drug Use Code (PV2-39).
   */
  public int getRecreationalDrugUseCodeReps() {
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
   * Inserts a repetition of Recreational Drug Use Code (PV2-39) at a given index and returns it.
   * @param index The index
   */
  public CWE insertRecreationalDrugUseCode(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(39, index);
  }

  /**
   * Removes a repetition of Recreational Drug Use Code (PV2-39) at a given index and returns it.
   * @param index The index
   */
  public CWE removeRecreationalDrugUseCode(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(39, index);
  }

  /**
   * Returns a single repetition of Recreational Drug Use Code (PV2-39).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getPv239_RecreationalDrugUseCode(int rep) throws HL7Exception {
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
   * Returns all repetitions of Recreational Drug Use Code (PV2-39).
   */
  public CWE[] getPv239_RecreationalDrugUseCode() {
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
   * Returns a count of the number of repetitions of Recreational Drug Use Code (PV2-39).
   */
  public int getPv239_RecreationalDrugUseCodeReps() {
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
   * Inserts a repetition of Recreational Drug Use Code (PV2-39) at a given index and returns it.
   * @param index The index
   */
  public CWE insertPv239_RecreationalDrugUseCode(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(39, index);
  }

  /**
   * Removes a repetition of Recreational Drug Use Code (PV2-39) at a given index and returns it.
   * @param index The index
   */
  public CWE removePv239_RecreationalDrugUseCode(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(39, index);
  }

  /**
   * Returns Admission Level of Care Code (PV2-40).
   */
  public CWE getAdmissionLevelOfCareCode()  {
    CWE ret = null;
    try {
        Type t = this.getField(40, 0);
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
   * Returns Admission Level of Care Code (PV2-40).
   */
  public CWE getPv240_AdmissionLevelOfCareCode()  {
    CWE ret = null;
    try {
        Type t = this.getField(40, 0);
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
   * Returns a single repetition of Precaution Code (PV2-41).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getPrecautionCode(int rep) throws HL7Exception {
    CWE ret = null;
    try {
        Type t = this.getField(41, rep);
        ret = (CWE)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Precaution Code (PV2-41).
   */
  public CWE[] getPrecautionCode() {
     CWE[] ret = null;
    try {
        Type[] t = this.getField(41);  
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
   * Returns a count of the number of repetitions of Precaution Code (PV2-41).
   */
  public int getPrecautionCodeReps() {
    try {
        return this.getField(41).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Precaution Code (PV2-41) at a given index and returns it.
   * @param index The index
   */
  public CWE insertPrecautionCode(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(41, index);
  }

  /**
   * Removes a repetition of Precaution Code (PV2-41) at a given index and returns it.
   * @param index The index
   */
  public CWE removePrecautionCode(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(41, index);
  }

  /**
   * Returns a single repetition of Precaution Code (PV2-41).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getPv241_PrecautionCode(int rep) throws HL7Exception {
    CWE ret = null;
    try {
        Type t = this.getField(41, rep);
        ret = (CWE)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Precaution Code (PV2-41).
   */
  public CWE[] getPv241_PrecautionCode() {
     CWE[] ret = null;
    try {
        Type[] t = this.getField(41);  
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
   * Returns a count of the number of repetitions of Precaution Code (PV2-41).
   */
  public int getPv241_PrecautionCodeReps() {
    try {
        return this.getField(41).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Precaution Code (PV2-41) at a given index and returns it.
   * @param index The index
   */
  public CWE insertPv241_PrecautionCode(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(41, index);
  }

  /**
   * Removes a repetition of Precaution Code (PV2-41) at a given index and returns it.
   * @param index The index
   */
  public CWE removePv241_PrecautionCode(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(41, index);
  }

  /**
   * Returns Patient Condition Code (PV2-42).
   */
  public CWE getPatientConditionCode()  {
    CWE ret = null;
    try {
        Type t = this.getField(42, 0);
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
   * Returns Patient Condition Code (PV2-42).
   */
  public CWE getPv242_PatientConditionCode()  {
    CWE ret = null;
    try {
        Type t = this.getField(42, 0);
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
   * Returns Living Will Code (PV2-43).
   */
  public IS getLivingWillCode()  {
    IS ret = null;
    try {
        Type t = this.getField(43, 0);
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
   * Returns Living Will Code (PV2-43).
   */
  public IS getPv243_LivingWillCode()  {
    IS ret = null;
    try {
        Type t = this.getField(43, 0);
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
   * Returns Organ Donor Code (PV2-44).
   */
  public IS getOrganDonorCode()  {
    IS ret = null;
    try {
        Type t = this.getField(44, 0);
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
   * Returns Organ Donor Code (PV2-44).
   */
  public IS getPv244_OrganDonorCode()  {
    IS ret = null;
    try {
        Type t = this.getField(44, 0);
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
   * Returns a single repetition of Advance Directive Code (PV2-45).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getAdvanceDirectiveCode(int rep) throws HL7Exception {
    CWE ret = null;
    try {
        Type t = this.getField(45, rep);
        ret = (CWE)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Advance Directive Code (PV2-45).
   */
  public CWE[] getAdvanceDirectiveCode() {
     CWE[] ret = null;
    try {
        Type[] t = this.getField(45);  
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
   * Returns a count of the number of repetitions of Advance Directive Code (PV2-45).
   */
  public int getAdvanceDirectiveCodeReps() {
    try {
        return this.getField(45).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Advance Directive Code (PV2-45) at a given index and returns it.
   * @param index The index
   */
  public CWE insertAdvanceDirectiveCode(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(45, index);
  }

  /**
   * Removes a repetition of Advance Directive Code (PV2-45) at a given index and returns it.
   * @param index The index
   */
  public CWE removeAdvanceDirectiveCode(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(45, index);
  }

  /**
   * Returns a single repetition of Advance Directive Code (PV2-45).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getPv245_AdvanceDirectiveCode(int rep) throws HL7Exception {
    CWE ret = null;
    try {
        Type t = this.getField(45, rep);
        ret = (CWE)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Advance Directive Code (PV2-45).
   */
  public CWE[] getPv245_AdvanceDirectiveCode() {
     CWE[] ret = null;
    try {
        Type[] t = this.getField(45);  
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
   * Returns a count of the number of repetitions of Advance Directive Code (PV2-45).
   */
  public int getPv245_AdvanceDirectiveCodeReps() {
    try {
        return this.getField(45).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Advance Directive Code (PV2-45) at a given index and returns it.
   * @param index The index
   */
  public CWE insertPv245_AdvanceDirectiveCode(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(45, index);
  }

  /**
   * Removes a repetition of Advance Directive Code (PV2-45) at a given index and returns it.
   * @param index The index
   */
  public CWE removePv245_AdvanceDirectiveCode(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(45, index);
  }

  /**
   * Returns Patient Status Effective Date (PV2-46).
   */
  public DT getPatientStatusEffectiveDate()  {
    DT ret = null;
    try {
        Type t = this.getField(46, 0);
        ret = (DT)t;
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
   * Returns Patient Status Effective Date (PV2-46).
   */
  public DT getPv246_PatientStatusEffectiveDate()  {
    DT ret = null;
    try {
        Type t = this.getField(46, 0);
        ret = (DT)t;
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
   * Returns Expected LOA Return Date/Time (PV2-47).
   */
  public DTM getExpectedLOAReturnDateTime()  {
    DTM ret = null;
    try {
        Type t = this.getField(47, 0);
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
   * Returns Expected LOA Return Date/Time (PV2-47).
   */
  public DTM getPv247_ExpectedLOAReturnDateTime()  {
    DTM ret = null;
    try {
        Type t = this.getField(47, 0);
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
   * Returns Expected Pre-admission Testing Date/Time (PV2-48).
   */
  public DTM getExpectedPreAdmissionTestingDateTime()  {
    DTM ret = null;
    try {
        Type t = this.getField(48, 0);
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
   * Returns Expected Pre-admission Testing Date/Time (PV2-48).
   */
  public DTM getPv248_ExpectedPreAdmissionTestingDateTime()  {
    DTM ret = null;
    try {
        Type t = this.getField(48, 0);
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
   * Returns a single repetition of Notify Clergy Code (PV2-49).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public IS getNotifyClergyCode(int rep) throws HL7Exception {
    IS ret = null;
    try {
        Type t = this.getField(49, rep);
        ret = (IS)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Notify Clergy Code (PV2-49).
   */
  public IS[] getNotifyClergyCode() {
     IS[] ret = null;
    try {
        Type[] t = this.getField(49);  
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
   * Returns a count of the number of repetitions of Notify Clergy Code (PV2-49).
   */
  public int getNotifyClergyCodeReps() {
    try {
        return this.getField(49).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Notify Clergy Code (PV2-49) at a given index and returns it.
   * @param index The index
   */
  public IS insertNotifyClergyCode(int index) throws HL7Exception {
     return (IS) super.insertRepetition(49, index);
  }

  /**
   * Removes a repetition of Notify Clergy Code (PV2-49) at a given index and returns it.
   * @param index The index
   */
  public IS removeNotifyClergyCode(int index) throws HL7Exception {
     return (IS) super.removeRepetition(49, index);
  }

  /**
   * Returns a single repetition of Notify Clergy Code (PV2-49).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public IS getPv249_NotifyClergyCode(int rep) throws HL7Exception {
    IS ret = null;
    try {
        Type t = this.getField(49, rep);
        ret = (IS)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Notify Clergy Code (PV2-49).
   */
  public IS[] getPv249_NotifyClergyCode() {
     IS[] ret = null;
    try {
        Type[] t = this.getField(49);  
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
   * Returns a count of the number of repetitions of Notify Clergy Code (PV2-49).
   */
  public int getPv249_NotifyClergyCodeReps() {
    try {
        return this.getField(49).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Notify Clergy Code (PV2-49) at a given index and returns it.
   * @param index The index
   */
  public IS insertPv249_NotifyClergyCode(int index) throws HL7Exception {
     return (IS) super.insertRepetition(49, index);
  }

  /**
   * Removes a repetition of Notify Clergy Code (PV2-49) at a given index and returns it.
   * @param index The index
   */
  public IS removePv249_NotifyClergyCode(int index) throws HL7Exception {
     return (IS) super.removeRepetition(49, index);
  }

  /**
   * Returns Advance Directive Last Verified Date (PV2-50).
   */
  public DT getAdvanceDirectiveLastVerifiedDate()  {
    DT ret = null;
    try {
        Type t = this.getField(50, 0);
        ret = (DT)t;
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
   * Returns Advance Directive Last Verified Date (PV2-50).
   */
  public DT getPv250_AdvanceDirectiveLastVerifiedDate()  {
    DT ret = null;
    try {
        Type t = this.getField(50, 0);
        ret = (DT)t;
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
         case 0: return new ca.uhn.hl7v2.model.v26.datatype.PL(getMessage());
         case 1: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 2: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 3: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 4: return new ca.uhn.hl7v2.model.v26.datatype.ST(getMessage());
         case 5: return new ca.uhn.hl7v2.model.v26.datatype.ST(getMessage());
         case 6: return new ca.uhn.hl7v2.model.v26.datatype.IS(getMessage(), new Integer(130));
         case 7: return new ca.uhn.hl7v2.model.v26.datatype.DTM(getMessage());
         case 8: return new ca.uhn.hl7v2.model.v26.datatype.DTM(getMessage());
         case 9: return new ca.uhn.hl7v2.model.v26.datatype.NM(getMessage());
         case 10: return new ca.uhn.hl7v2.model.v26.datatype.NM(getMessage());
         case 11: return new ca.uhn.hl7v2.model.v26.datatype.ST(getMessage());
         case 12: return new ca.uhn.hl7v2.model.v26.datatype.XCN(getMessage());
         case 13: return new ca.uhn.hl7v2.model.v26.datatype.DT(getMessage());
         case 14: return new ca.uhn.hl7v2.model.v26.datatype.ID(getMessage(), new Integer(136));
         case 15: return new ca.uhn.hl7v2.model.v26.datatype.IS(getMessage(), new Integer(213));
         case 16: return new ca.uhn.hl7v2.model.v26.datatype.DT(getMessage());
         case 17: return new ca.uhn.hl7v2.model.v26.datatype.IS(getMessage(), new Integer(214));
         case 18: return new ca.uhn.hl7v2.model.v26.datatype.ID(getMessage(), new Integer(136));
         case 19: return new ca.uhn.hl7v2.model.v26.datatype.NM(getMessage());
         case 20: return new ca.uhn.hl7v2.model.v26.datatype.IS(getMessage(), new Integer(215));
         case 21: return new ca.uhn.hl7v2.model.v26.datatype.ID(getMessage(), new Integer(136));
         case 22: return new ca.uhn.hl7v2.model.v26.datatype.XON(getMessage());
         case 23: return new ca.uhn.hl7v2.model.v26.datatype.IS(getMessage(), new Integer(216));
         case 24: return new ca.uhn.hl7v2.model.v26.datatype.IS(getMessage(), new Integer(217));
         case 25: return new ca.uhn.hl7v2.model.v26.datatype.DT(getMessage());
         case 26: return new ca.uhn.hl7v2.model.v26.datatype.IS(getMessage(), new Integer(112));
         case 27: return new ca.uhn.hl7v2.model.v26.datatype.DT(getMessage());
         case 28: return new ca.uhn.hl7v2.model.v26.datatype.DT(getMessage());
         case 29: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 30: return new ca.uhn.hl7v2.model.v26.datatype.IS(getMessage(), new Integer(219));
         case 31: return new ca.uhn.hl7v2.model.v26.datatype.ID(getMessage(), new Integer(136));
         case 32: return new ca.uhn.hl7v2.model.v26.datatype.DTM(getMessage());
         case 33: return new ca.uhn.hl7v2.model.v26.datatype.ID(getMessage(), new Integer(136));
         case 34: return new ca.uhn.hl7v2.model.v26.datatype.ID(getMessage(), new Integer(136));
         case 35: return new ca.uhn.hl7v2.model.v26.datatype.ID(getMessage(), new Integer(136));
         case 36: return new ca.uhn.hl7v2.model.v26.datatype.ID(getMessage(), new Integer(136));
         case 37: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 38: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 39: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 40: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 41: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 42: return new ca.uhn.hl7v2.model.v26.datatype.IS(getMessage(), new Integer(315));
         case 43: return new ca.uhn.hl7v2.model.v26.datatype.IS(getMessage(), new Integer(316));
         case 44: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 45: return new ca.uhn.hl7v2.model.v26.datatype.DT(getMessage());
         case 46: return new ca.uhn.hl7v2.model.v26.datatype.DTM(getMessage());
         case 47: return new ca.uhn.hl7v2.model.v26.datatype.DTM(getMessage());
         case 48: return new ca.uhn.hl7v2.model.v26.datatype.IS(getMessage(), new Integer(534));
         case 49: return new ca.uhn.hl7v2.model.v26.datatype.DT(getMessage());
         default: return null;
      }
   }

}