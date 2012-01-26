package ca.uhn.hl7v2.model.v26.segment;

import ca.uhn.hl7v2.model.*;
import ca.uhn.hl7v2.model.v26.datatype.*;
import ca.uhn.log.HapiLogFactory;
import ca.uhn.hl7v2.parser.ModelClassFactory;
import ca.uhn.hl7v2.HL7Exception;

/**
 * <p>Represents an HL7 PV1 message segment. 
 * This segment has the following fields:</p><p>
 * PV1-1: Set ID - PV1 (SI)<br> 
 * PV1-2: Patient Class (IS)<br> 
 * PV1-3: Assigned Patient Location (PL)<br> 
 * PV1-4: Admission Type (IS)<br> 
 * PV1-5: Preadmit Number (CX)<br> 
 * PV1-6: Prior Patient Location (PL)<br> 
 * PV1-7: Attending Doctor (XCN)<br> 
 * PV1-8: Referring Doctor (XCN)<br> 
 * PV1-9: Consulting Doctor (XCN)<br> 
 * PV1-10: Hospital Service (IS)<br> 
 * PV1-11: Temporary Location (PL)<br> 
 * PV1-12: Preadmit Test Indicator (IS)<br> 
 * PV1-13: Re-admission Indicator (IS)<br> 
 * PV1-14: Admit Source (IS)<br> 
 * PV1-15: Ambulatory Status (IS)<br> 
 * PV1-16: VIP Indicator (IS)<br> 
 * PV1-17: Admitting Doctor (XCN)<br> 
 * PV1-18: Patient Type (IS)<br> 
 * PV1-19: Visit Number (CX)<br> 
 * PV1-20: Financial Class (FC)<br> 
 * PV1-21: Charge Price Indicator (IS)<br> 
 * PV1-22: Courtesy Code (IS)<br> 
 * PV1-23: Credit Rating (IS)<br> 
 * PV1-24: Contract Code (IS)<br> 
 * PV1-25: Contract Effective Date (DT)<br> 
 * PV1-26: Contract Amount (NM)<br> 
 * PV1-27: Contract Period (NM)<br> 
 * PV1-28: Interest Code (IS)<br> 
 * PV1-29: Transfer to Bad Debt Code (IS)<br> 
 * PV1-30: Transfer to Bad Debt Date (DT)<br> 
 * PV1-31: Bad Debt Agency Code (IS)<br> 
 * PV1-32: Bad Debt Transfer Amount (NM)<br> 
 * PV1-33: Bad Debt Recovery Amount (NM)<br> 
 * PV1-34: Delete Account Indicator (IS)<br> 
 * PV1-35: Delete Account Date (DT)<br> 
 * PV1-36: Discharge Disposition (IS)<br> 
 * PV1-37: Discharged to Location (DLD)<br> 
 * PV1-38: Diet Type (CWE)<br> 
 * PV1-39: Servicing Facility (IS)<br> 
 * PV1-40: Bed Status (IS)<br> 
 * PV1-41: Account Status (IS)<br> 
 * PV1-42: Pending Location (PL)<br> 
 * PV1-43: Prior Temporary Location (PL)<br> 
 * PV1-44: Admit Date/Time (DTM)<br> 
 * PV1-45: Discharge Date/Time (DTM)<br> 
 * PV1-46: Current Patient Balance (NM)<br> 
 * PV1-47: Total Charges (NM)<br> 
 * PV1-48: Total Adjustments (NM)<br> 
 * PV1-49: Total Payments (NM)<br> 
 * PV1-50: Alternate Visit ID (CX)<br> 
 * PV1-51: Visit Indicator (IS)<br> 
 * PV1-52: Other Healthcare Provider (XCN)<br> 
 * </p><p>The get...() methods return data from individual fields.  These methods 
 * do not throw exceptions and may therefore have to handle exceptions internally.  
 * If an exception is handled internally, it is logged and null is returned.  
 * This is not expected to happen - if it does happen this indicates not so much 
 * an exceptional circumstance as a bug in the code for this class.</p>    
 */
public class PV1 extends AbstractSegment  {

  /**
   * Creates a PV1 (Patient Visit) segment object that belongs to the given 
   * message.  
   */
  public PV1(Group parent, ModelClassFactory factory) {
    super(parent, factory);
    Message message = getMessage();
    try {
       this.add(SI.class, false, 1, 4, new Object[]{message}, "Set ID - PV1");
       this.add(IS.class, true, 1, 1, new Object[]{message, new Integer(4)}, "Patient Class");
       this.add(PL.class, false, 1, 80, new Object[]{message}, "Assigned Patient Location");
       this.add(IS.class, false, 1, 2, new Object[]{message, new Integer(7)}, "Admission Type");
       this.add(CX.class, false, 1, 250, new Object[]{message}, "Preadmit Number");
       this.add(PL.class, false, 1, 80, new Object[]{message}, "Prior Patient Location");
       this.add(XCN.class, false, 0, 250, new Object[]{message}, "Attending Doctor");
       this.add(XCN.class, false, 0, 250, new Object[]{message}, "Referring Doctor");
       this.add(XCN.class, false, 0, 0, new Object[]{message}, "Consulting Doctor");
       this.add(IS.class, false, 1, 3, new Object[]{message, new Integer(69)}, "Hospital Service");
       this.add(PL.class, false, 1, 80, new Object[]{message}, "Temporary Location");
       this.add(IS.class, false, 1, 2, new Object[]{message, new Integer(87)}, "Preadmit Test Indicator");
       this.add(IS.class, false, 1, 2, new Object[]{message, new Integer(92)}, "Re-admission Indicator");
       this.add(IS.class, false, 1, 6, new Object[]{message, new Integer(23)}, "Admit Source");
       this.add(IS.class, false, 0, 2, new Object[]{message, new Integer(9)}, "Ambulatory Status");
       this.add(IS.class, false, 1, 2, new Object[]{message, new Integer(99)}, "VIP Indicator");
       this.add(XCN.class, false, 0, 250, new Object[]{message}, "Admitting Doctor");
       this.add(IS.class, false, 1, 2, new Object[]{message, new Integer(18)}, "Patient Type");
       this.add(CX.class, false, 1, 250, new Object[]{message}, "Visit Number");
       this.add(FC.class, false, 0, 50, new Object[]{message}, "Financial Class");
       this.add(IS.class, false, 1, 2, new Object[]{message, new Integer(32)}, "Charge Price Indicator");
       this.add(IS.class, false, 1, 2, new Object[]{message, new Integer(45)}, "Courtesy Code");
       this.add(IS.class, false, 1, 2, new Object[]{message, new Integer(46)}, "Credit Rating");
       this.add(IS.class, false, 0, 2, new Object[]{message, new Integer(44)}, "Contract Code");
       this.add(DT.class, false, 0, 8, new Object[]{message}, "Contract Effective Date");
       this.add(NM.class, false, 0, 12, new Object[]{message}, "Contract Amount");
       this.add(NM.class, false, 0, 3, new Object[]{message}, "Contract Period");
       this.add(IS.class, false, 1, 2, new Object[]{message, new Integer(73)}, "Interest Code");
       this.add(IS.class, false, 1, 4, new Object[]{message, new Integer(110)}, "Transfer to Bad Debt Code");
       this.add(DT.class, false, 1, 8, new Object[]{message}, "Transfer to Bad Debt Date");
       this.add(IS.class, false, 1, 10, new Object[]{message, new Integer(21)}, "Bad Debt Agency Code");
       this.add(NM.class, false, 1, 12, new Object[]{message}, "Bad Debt Transfer Amount");
       this.add(NM.class, false, 1, 12, new Object[]{message}, "Bad Debt Recovery Amount");
       this.add(IS.class, false, 1, 1, new Object[]{message, new Integer(111)}, "Delete Account Indicator");
       this.add(DT.class, false, 1, 8, new Object[]{message}, "Delete Account Date");
       this.add(IS.class, false, 1, 3, new Object[]{message, new Integer(112)}, "Discharge Disposition");
       this.add(DLD.class, false, 1, 47, new Object[]{message}, "Discharged to Location");
       this.add(CWE.class, false, 1, 705, new Object[]{message}, "Diet Type");
       this.add(IS.class, false, 1, 2, new Object[]{message, new Integer(115)}, "Servicing Facility");
       this.add(IS.class, false, 1, 0, new Object[]{message, new Integer(116)}, "Bed Status");
       this.add(IS.class, false, 1, 2, new Object[]{message, new Integer(117)}, "Account Status");
       this.add(PL.class, false, 1, 80, new Object[]{message}, "Pending Location");
       this.add(PL.class, false, 1, 80, new Object[]{message}, "Prior Temporary Location");
       this.add(DTM.class, false, 1, 24, new Object[]{message}, "Admit Date/Time");
       this.add(DTM.class, false, 1, 24, new Object[]{message}, "Discharge Date/Time");
       this.add(NM.class, false, 1, 12, new Object[]{message}, "Current Patient Balance");
       this.add(NM.class, false, 1, 12, new Object[]{message}, "Total Charges");
       this.add(NM.class, false, 1, 12, new Object[]{message}, "Total Adjustments");
       this.add(NM.class, false, 1, 12, new Object[]{message}, "Total Payments");
       this.add(CX.class, false, 1, 250, new Object[]{message}, "Alternate Visit ID");
       this.add(IS.class, false, 1, 1, new Object[]{message, new Integer(326)}, "Visit Indicator");
       this.add(XCN.class, false, 0, 0, new Object[]{message}, "Other Healthcare Provider");
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Can't instantiate " + this.getClass().getName(), he);
    }
  }

  /**
   * Returns Set ID - PV1 (PV1-1).
   */
  public SI getSetIDPV1()  {
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
   * Returns Set ID - PV1 (PV1-1).
   */
  public SI getPv11_SetIDPV1()  {
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
   * Returns Patient Class (PV1-2).
   */
  public IS getPatientClass()  {
    IS ret = null;
    try {
        Type t = this.getField(2, 0);
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
   * Returns Patient Class (PV1-2).
   */
  public IS getPv12_PatientClass()  {
    IS ret = null;
    try {
        Type t = this.getField(2, 0);
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
   * Returns Assigned Patient Location (PV1-3).
   */
  public PL getAssignedPatientLocation()  {
    PL ret = null;
    try {
        Type t = this.getField(3, 0);
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
   * Returns Assigned Patient Location (PV1-3).
   */
  public PL getPv13_AssignedPatientLocation()  {
    PL ret = null;
    try {
        Type t = this.getField(3, 0);
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
   * Returns Admission Type (PV1-4).
   */
  public IS getAdmissionType()  {
    IS ret = null;
    try {
        Type t = this.getField(4, 0);
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
   * Returns Admission Type (PV1-4).
   */
  public IS getPv14_AdmissionType()  {
    IS ret = null;
    try {
        Type t = this.getField(4, 0);
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
   * Returns Preadmit Number (PV1-5).
   */
  public CX getPreadmitNumber()  {
    CX ret = null;
    try {
        Type t = this.getField(5, 0);
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
   * Returns Preadmit Number (PV1-5).
   */
  public CX getPv15_PreadmitNumber()  {
    CX ret = null;
    try {
        Type t = this.getField(5, 0);
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
   * Returns Prior Patient Location (PV1-6).
   */
  public PL getPriorPatientLocation()  {
    PL ret = null;
    try {
        Type t = this.getField(6, 0);
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
   * Returns Prior Patient Location (PV1-6).
   */
  public PL getPv16_PriorPatientLocation()  {
    PL ret = null;
    try {
        Type t = this.getField(6, 0);
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
   * Returns a single repetition of Attending Doctor (PV1-7).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XCN getAttendingDoctor(int rep) throws HL7Exception {
    XCN ret = null;
    try {
        Type t = this.getField(7, rep);
        ret = (XCN)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Attending Doctor (PV1-7).
   */
  public XCN[] getAttendingDoctor() {
     XCN[] ret = null;
    try {
        Type[] t = this.getField(7);  
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
   * Returns a count of the number of repetitions of Attending Doctor (PV1-7).
   */
  public int getAttendingDoctorReps() {
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
   * Inserts a repetition of Attending Doctor (PV1-7) at a given index and returns it.
   * @param index The index
   */
  public XCN insertAttendingDoctor(int index) throws HL7Exception {
     return (XCN) super.insertRepetition(7, index);
  }

  /**
   * Removes a repetition of Attending Doctor (PV1-7) at a given index and returns it.
   * @param index The index
   */
  public XCN removeAttendingDoctor(int index) throws HL7Exception {
     return (XCN) super.removeRepetition(7, index);
  }

  /**
   * Returns a single repetition of Attending Doctor (PV1-7).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XCN getPv17_AttendingDoctor(int rep) throws HL7Exception {
    XCN ret = null;
    try {
        Type t = this.getField(7, rep);
        ret = (XCN)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Attending Doctor (PV1-7).
   */
  public XCN[] getPv17_AttendingDoctor() {
     XCN[] ret = null;
    try {
        Type[] t = this.getField(7);  
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
   * Returns a count of the number of repetitions of Attending Doctor (PV1-7).
   */
  public int getPv17_AttendingDoctorReps() {
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
   * Inserts a repetition of Attending Doctor (PV1-7) at a given index and returns it.
   * @param index The index
   */
  public XCN insertPv17_AttendingDoctor(int index) throws HL7Exception {
     return (XCN) super.insertRepetition(7, index);
  }

  /**
   * Removes a repetition of Attending Doctor (PV1-7) at a given index and returns it.
   * @param index The index
   */
  public XCN removePv17_AttendingDoctor(int index) throws HL7Exception {
     return (XCN) super.removeRepetition(7, index);
  }

  /**
   * Returns a single repetition of Referring Doctor (PV1-8).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XCN getReferringDoctor(int rep) throws HL7Exception {
    XCN ret = null;
    try {
        Type t = this.getField(8, rep);
        ret = (XCN)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Referring Doctor (PV1-8).
   */
  public XCN[] getReferringDoctor() {
     XCN[] ret = null;
    try {
        Type[] t = this.getField(8);  
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
   * Returns a count of the number of repetitions of Referring Doctor (PV1-8).
   */
  public int getReferringDoctorReps() {
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
   * Inserts a repetition of Referring Doctor (PV1-8) at a given index and returns it.
   * @param index The index
   */
  public XCN insertReferringDoctor(int index) throws HL7Exception {
     return (XCN) super.insertRepetition(8, index);
  }

  /**
   * Removes a repetition of Referring Doctor (PV1-8) at a given index and returns it.
   * @param index The index
   */
  public XCN removeReferringDoctor(int index) throws HL7Exception {
     return (XCN) super.removeRepetition(8, index);
  }

  /**
   * Returns a single repetition of Referring Doctor (PV1-8).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XCN getPv18_ReferringDoctor(int rep) throws HL7Exception {
    XCN ret = null;
    try {
        Type t = this.getField(8, rep);
        ret = (XCN)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Referring Doctor (PV1-8).
   */
  public XCN[] getPv18_ReferringDoctor() {
     XCN[] ret = null;
    try {
        Type[] t = this.getField(8);  
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
   * Returns a count of the number of repetitions of Referring Doctor (PV1-8).
   */
  public int getPv18_ReferringDoctorReps() {
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
   * Inserts a repetition of Referring Doctor (PV1-8) at a given index and returns it.
   * @param index The index
   */
  public XCN insertPv18_ReferringDoctor(int index) throws HL7Exception {
     return (XCN) super.insertRepetition(8, index);
  }

  /**
   * Removes a repetition of Referring Doctor (PV1-8) at a given index and returns it.
   * @param index The index
   */
  public XCN removePv18_ReferringDoctor(int index) throws HL7Exception {
     return (XCN) super.removeRepetition(8, index);
  }

  /**
   * Returns a single repetition of Consulting Doctor (PV1-9).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XCN getConsultingDoctor(int rep) throws HL7Exception {
    XCN ret = null;
    try {
        Type t = this.getField(9, rep);
        ret = (XCN)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Consulting Doctor (PV1-9).
   */
  public XCN[] getConsultingDoctor() {
     XCN[] ret = null;
    try {
        Type[] t = this.getField(9);  
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
   * Returns a count of the number of repetitions of Consulting Doctor (PV1-9).
   */
  public int getConsultingDoctorReps() {
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
   * Inserts a repetition of Consulting Doctor (PV1-9) at a given index and returns it.
   * @param index The index
   */
  public XCN insertConsultingDoctor(int index) throws HL7Exception {
     return (XCN) super.insertRepetition(9, index);
  }

  /**
   * Removes a repetition of Consulting Doctor (PV1-9) at a given index and returns it.
   * @param index The index
   */
  public XCN removeConsultingDoctor(int index) throws HL7Exception {
     return (XCN) super.removeRepetition(9, index);
  }

  /**
   * Returns a single repetition of Consulting Doctor (PV1-9).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XCN getPv19_ConsultingDoctor(int rep) throws HL7Exception {
    XCN ret = null;
    try {
        Type t = this.getField(9, rep);
        ret = (XCN)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Consulting Doctor (PV1-9).
   */
  public XCN[] getPv19_ConsultingDoctor() {
     XCN[] ret = null;
    try {
        Type[] t = this.getField(9);  
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
   * Returns a count of the number of repetitions of Consulting Doctor (PV1-9).
   */
  public int getPv19_ConsultingDoctorReps() {
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
   * Inserts a repetition of Consulting Doctor (PV1-9) at a given index and returns it.
   * @param index The index
   */
  public XCN insertPv19_ConsultingDoctor(int index) throws HL7Exception {
     return (XCN) super.insertRepetition(9, index);
  }

  /**
   * Removes a repetition of Consulting Doctor (PV1-9) at a given index and returns it.
   * @param index The index
   */
  public XCN removePv19_ConsultingDoctor(int index) throws HL7Exception {
     return (XCN) super.removeRepetition(9, index);
  }

  /**
   * Returns Hospital Service (PV1-10).
   */
  public IS getHospitalService()  {
    IS ret = null;
    try {
        Type t = this.getField(10, 0);
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
   * Returns Hospital Service (PV1-10).
   */
  public IS getPv110_HospitalService()  {
    IS ret = null;
    try {
        Type t = this.getField(10, 0);
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
   * Returns Temporary Location (PV1-11).
   */
  public PL getTemporaryLocation()  {
    PL ret = null;
    try {
        Type t = this.getField(11, 0);
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
   * Returns Temporary Location (PV1-11).
   */
  public PL getPv111_TemporaryLocation()  {
    PL ret = null;
    try {
        Type t = this.getField(11, 0);
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
   * Returns Preadmit Test Indicator (PV1-12).
   */
  public IS getPreadmitTestIndicator()  {
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
   * Returns Preadmit Test Indicator (PV1-12).
   */
  public IS getPv112_PreadmitTestIndicator()  {
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
   * Returns Re-admission Indicator (PV1-13).
   */
  public IS getReAdmissionIndicator()  {
    IS ret = null;
    try {
        Type t = this.getField(13, 0);
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
   * Returns Re-admission Indicator (PV1-13).
   */
  public IS getPv113_ReAdmissionIndicator()  {
    IS ret = null;
    try {
        Type t = this.getField(13, 0);
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
   * Returns Admit Source (PV1-14).
   */
  public IS getAdmitSource()  {
    IS ret = null;
    try {
        Type t = this.getField(14, 0);
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
   * Returns Admit Source (PV1-14).
   */
  public IS getPv114_AdmitSource()  {
    IS ret = null;
    try {
        Type t = this.getField(14, 0);
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
   * Returns a single repetition of Ambulatory Status (PV1-15).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public IS getAmbulatoryStatus(int rep) throws HL7Exception {
    IS ret = null;
    try {
        Type t = this.getField(15, rep);
        ret = (IS)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Ambulatory Status (PV1-15).
   */
  public IS[] getAmbulatoryStatus() {
     IS[] ret = null;
    try {
        Type[] t = this.getField(15);  
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
   * Returns a count of the number of repetitions of Ambulatory Status (PV1-15).
   */
  public int getAmbulatoryStatusReps() {
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
   * Inserts a repetition of Ambulatory Status (PV1-15) at a given index and returns it.
   * @param index The index
   */
  public IS insertAmbulatoryStatus(int index) throws HL7Exception {
     return (IS) super.insertRepetition(15, index);
  }

  /**
   * Removes a repetition of Ambulatory Status (PV1-15) at a given index and returns it.
   * @param index The index
   */
  public IS removeAmbulatoryStatus(int index) throws HL7Exception {
     return (IS) super.removeRepetition(15, index);
  }

  /**
   * Returns a single repetition of Ambulatory Status (PV1-15).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public IS getPv115_AmbulatoryStatus(int rep) throws HL7Exception {
    IS ret = null;
    try {
        Type t = this.getField(15, rep);
        ret = (IS)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Ambulatory Status (PV1-15).
   */
  public IS[] getPv115_AmbulatoryStatus() {
     IS[] ret = null;
    try {
        Type[] t = this.getField(15);  
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
   * Returns a count of the number of repetitions of Ambulatory Status (PV1-15).
   */
  public int getPv115_AmbulatoryStatusReps() {
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
   * Inserts a repetition of Ambulatory Status (PV1-15) at a given index and returns it.
   * @param index The index
   */
  public IS insertPv115_AmbulatoryStatus(int index) throws HL7Exception {
     return (IS) super.insertRepetition(15, index);
  }

  /**
   * Removes a repetition of Ambulatory Status (PV1-15) at a given index and returns it.
   * @param index The index
   */
  public IS removePv115_AmbulatoryStatus(int index) throws HL7Exception {
     return (IS) super.removeRepetition(15, index);
  }

  /**
   * Returns VIP Indicator (PV1-16).
   */
  public IS getVIPIndicator()  {
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
   * Returns VIP Indicator (PV1-16).
   */
  public IS getPv116_VIPIndicator()  {
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
   * Returns a single repetition of Admitting Doctor (PV1-17).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XCN getAdmittingDoctor(int rep) throws HL7Exception {
    XCN ret = null;
    try {
        Type t = this.getField(17, rep);
        ret = (XCN)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Admitting Doctor (PV1-17).
   */
  public XCN[] getAdmittingDoctor() {
     XCN[] ret = null;
    try {
        Type[] t = this.getField(17);  
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
   * Returns a count of the number of repetitions of Admitting Doctor (PV1-17).
   */
  public int getAdmittingDoctorReps() {
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
   * Inserts a repetition of Admitting Doctor (PV1-17) at a given index and returns it.
   * @param index The index
   */
  public XCN insertAdmittingDoctor(int index) throws HL7Exception {
     return (XCN) super.insertRepetition(17, index);
  }

  /**
   * Removes a repetition of Admitting Doctor (PV1-17) at a given index and returns it.
   * @param index The index
   */
  public XCN removeAdmittingDoctor(int index) throws HL7Exception {
     return (XCN) super.removeRepetition(17, index);
  }

  /**
   * Returns a single repetition of Admitting Doctor (PV1-17).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XCN getPv117_AdmittingDoctor(int rep) throws HL7Exception {
    XCN ret = null;
    try {
        Type t = this.getField(17, rep);
        ret = (XCN)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Admitting Doctor (PV1-17).
   */
  public XCN[] getPv117_AdmittingDoctor() {
     XCN[] ret = null;
    try {
        Type[] t = this.getField(17);  
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
   * Returns a count of the number of repetitions of Admitting Doctor (PV1-17).
   */
  public int getPv117_AdmittingDoctorReps() {
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
   * Inserts a repetition of Admitting Doctor (PV1-17) at a given index and returns it.
   * @param index The index
   */
  public XCN insertPv117_AdmittingDoctor(int index) throws HL7Exception {
     return (XCN) super.insertRepetition(17, index);
  }

  /**
   * Removes a repetition of Admitting Doctor (PV1-17) at a given index and returns it.
   * @param index The index
   */
  public XCN removePv117_AdmittingDoctor(int index) throws HL7Exception {
     return (XCN) super.removeRepetition(17, index);
  }

  /**
   * Returns Patient Type (PV1-18).
   */
  public IS getPatientType()  {
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
   * Returns Patient Type (PV1-18).
   */
  public IS getPv118_PatientType()  {
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
   * Returns Visit Number (PV1-19).
   */
  public CX getVisitNumber()  {
    CX ret = null;
    try {
        Type t = this.getField(19, 0);
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
   * Returns Visit Number (PV1-19).
   */
  public CX getPv119_VisitNumber()  {
    CX ret = null;
    try {
        Type t = this.getField(19, 0);
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
   * Returns a single repetition of Financial Class (PV1-20).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public FC getFinancialClass(int rep) throws HL7Exception {
    FC ret = null;
    try {
        Type t = this.getField(20, rep);
        ret = (FC)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Financial Class (PV1-20).
   */
  public FC[] getFinancialClass() {
     FC[] ret = null;
    try {
        Type[] t = this.getField(20);  
        ret = new FC[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (FC)t[i];
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
   * Returns a count of the number of repetitions of Financial Class (PV1-20).
   */
  public int getFinancialClassReps() {
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
   * Inserts a repetition of Financial Class (PV1-20) at a given index and returns it.
   * @param index The index
   */
  public FC insertFinancialClass(int index) throws HL7Exception {
     return (FC) super.insertRepetition(20, index);
  }

  /**
   * Removes a repetition of Financial Class (PV1-20) at a given index and returns it.
   * @param index The index
   */
  public FC removeFinancialClass(int index) throws HL7Exception {
     return (FC) super.removeRepetition(20, index);
  }

  /**
   * Returns a single repetition of Financial Class (PV1-20).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public FC getPv120_FinancialClass(int rep) throws HL7Exception {
    FC ret = null;
    try {
        Type t = this.getField(20, rep);
        ret = (FC)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Financial Class (PV1-20).
   */
  public FC[] getPv120_FinancialClass() {
     FC[] ret = null;
    try {
        Type[] t = this.getField(20);  
        ret = new FC[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (FC)t[i];
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
   * Returns a count of the number of repetitions of Financial Class (PV1-20).
   */
  public int getPv120_FinancialClassReps() {
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
   * Inserts a repetition of Financial Class (PV1-20) at a given index and returns it.
   * @param index The index
   */
  public FC insertPv120_FinancialClass(int index) throws HL7Exception {
     return (FC) super.insertRepetition(20, index);
  }

  /**
   * Removes a repetition of Financial Class (PV1-20) at a given index and returns it.
   * @param index The index
   */
  public FC removePv120_FinancialClass(int index) throws HL7Exception {
     return (FC) super.removeRepetition(20, index);
  }

  /**
   * Returns Charge Price Indicator (PV1-21).
   */
  public IS getChargePriceIndicator()  {
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
   * Returns Charge Price Indicator (PV1-21).
   */
  public IS getPv121_ChargePriceIndicator()  {
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
   * Returns Courtesy Code (PV1-22).
   */
  public IS getCourtesyCode()  {
    IS ret = null;
    try {
        Type t = this.getField(22, 0);
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
   * Returns Courtesy Code (PV1-22).
   */
  public IS getPv122_CourtesyCode()  {
    IS ret = null;
    try {
        Type t = this.getField(22, 0);
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
   * Returns Credit Rating (PV1-23).
   */
  public IS getCreditRating()  {
    IS ret = null;
    try {
        Type t = this.getField(23, 0);
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
   * Returns Credit Rating (PV1-23).
   */
  public IS getPv123_CreditRating()  {
    IS ret = null;
    try {
        Type t = this.getField(23, 0);
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
   * Returns a single repetition of Contract Code (PV1-24).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public IS getContractCode(int rep) throws HL7Exception {
    IS ret = null;
    try {
        Type t = this.getField(24, rep);
        ret = (IS)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Contract Code (PV1-24).
   */
  public IS[] getContractCode() {
     IS[] ret = null;
    try {
        Type[] t = this.getField(24);  
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
   * Returns a count of the number of repetitions of Contract Code (PV1-24).
   */
  public int getContractCodeReps() {
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
   * Inserts a repetition of Contract Code (PV1-24) at a given index and returns it.
   * @param index The index
   */
  public IS insertContractCode(int index) throws HL7Exception {
     return (IS) super.insertRepetition(24, index);
  }

  /**
   * Removes a repetition of Contract Code (PV1-24) at a given index and returns it.
   * @param index The index
   */
  public IS removeContractCode(int index) throws HL7Exception {
     return (IS) super.removeRepetition(24, index);
  }

  /**
   * Returns a single repetition of Contract Code (PV1-24).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public IS getPv124_ContractCode(int rep) throws HL7Exception {
    IS ret = null;
    try {
        Type t = this.getField(24, rep);
        ret = (IS)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Contract Code (PV1-24).
   */
  public IS[] getPv124_ContractCode() {
     IS[] ret = null;
    try {
        Type[] t = this.getField(24);  
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
   * Returns a count of the number of repetitions of Contract Code (PV1-24).
   */
  public int getPv124_ContractCodeReps() {
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
   * Inserts a repetition of Contract Code (PV1-24) at a given index and returns it.
   * @param index The index
   */
  public IS insertPv124_ContractCode(int index) throws HL7Exception {
     return (IS) super.insertRepetition(24, index);
  }

  /**
   * Removes a repetition of Contract Code (PV1-24) at a given index and returns it.
   * @param index The index
   */
  public IS removePv124_ContractCode(int index) throws HL7Exception {
     return (IS) super.removeRepetition(24, index);
  }

  /**
   * Returns a single repetition of Contract Effective Date (PV1-25).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public DT getContractEffectiveDate(int rep) throws HL7Exception {
    DT ret = null;
    try {
        Type t = this.getField(25, rep);
        ret = (DT)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Contract Effective Date (PV1-25).
   */
  public DT[] getContractEffectiveDate() {
     DT[] ret = null;
    try {
        Type[] t = this.getField(25);  
        ret = new DT[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (DT)t[i];
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
   * Returns a count of the number of repetitions of Contract Effective Date (PV1-25).
   */
  public int getContractEffectiveDateReps() {
    try {
        return this.getField(25).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Contract Effective Date (PV1-25) at a given index and returns it.
   * @param index The index
   */
  public DT insertContractEffectiveDate(int index) throws HL7Exception {
     return (DT) super.insertRepetition(25, index);
  }

  /**
   * Removes a repetition of Contract Effective Date (PV1-25) at a given index and returns it.
   * @param index The index
   */
  public DT removeContractEffectiveDate(int index) throws HL7Exception {
     return (DT) super.removeRepetition(25, index);
  }

  /**
   * Returns a single repetition of Contract Effective Date (PV1-25).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public DT getPv125_ContractEffectiveDate(int rep) throws HL7Exception {
    DT ret = null;
    try {
        Type t = this.getField(25, rep);
        ret = (DT)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Contract Effective Date (PV1-25).
   */
  public DT[] getPv125_ContractEffectiveDate() {
     DT[] ret = null;
    try {
        Type[] t = this.getField(25);  
        ret = new DT[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (DT)t[i];
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
   * Returns a count of the number of repetitions of Contract Effective Date (PV1-25).
   */
  public int getPv125_ContractEffectiveDateReps() {
    try {
        return this.getField(25).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Contract Effective Date (PV1-25) at a given index and returns it.
   * @param index The index
   */
  public DT insertPv125_ContractEffectiveDate(int index) throws HL7Exception {
     return (DT) super.insertRepetition(25, index);
  }

  /**
   * Removes a repetition of Contract Effective Date (PV1-25) at a given index and returns it.
   * @param index The index
   */
  public DT removePv125_ContractEffectiveDate(int index) throws HL7Exception {
     return (DT) super.removeRepetition(25, index);
  }

  /**
   * Returns a single repetition of Contract Amount (PV1-26).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public NM getContractAmount(int rep) throws HL7Exception {
    NM ret = null;
    try {
        Type t = this.getField(26, rep);
        ret = (NM)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Contract Amount (PV1-26).
   */
  public NM[] getContractAmount() {
     NM[] ret = null;
    try {
        Type[] t = this.getField(26);  
        ret = new NM[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (NM)t[i];
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
   * Returns a count of the number of repetitions of Contract Amount (PV1-26).
   */
  public int getContractAmountReps() {
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
   * Inserts a repetition of Contract Amount (PV1-26) at a given index and returns it.
   * @param index The index
   */
  public NM insertContractAmount(int index) throws HL7Exception {
     return (NM) super.insertRepetition(26, index);
  }

  /**
   * Removes a repetition of Contract Amount (PV1-26) at a given index and returns it.
   * @param index The index
   */
  public NM removeContractAmount(int index) throws HL7Exception {
     return (NM) super.removeRepetition(26, index);
  }

  /**
   * Returns a single repetition of Contract Amount (PV1-26).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public NM getPv126_ContractAmount(int rep) throws HL7Exception {
    NM ret = null;
    try {
        Type t = this.getField(26, rep);
        ret = (NM)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Contract Amount (PV1-26).
   */
  public NM[] getPv126_ContractAmount() {
     NM[] ret = null;
    try {
        Type[] t = this.getField(26);  
        ret = new NM[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (NM)t[i];
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
   * Returns a count of the number of repetitions of Contract Amount (PV1-26).
   */
  public int getPv126_ContractAmountReps() {
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
   * Inserts a repetition of Contract Amount (PV1-26) at a given index and returns it.
   * @param index The index
   */
  public NM insertPv126_ContractAmount(int index) throws HL7Exception {
     return (NM) super.insertRepetition(26, index);
  }

  /**
   * Removes a repetition of Contract Amount (PV1-26) at a given index and returns it.
   * @param index The index
   */
  public NM removePv126_ContractAmount(int index) throws HL7Exception {
     return (NM) super.removeRepetition(26, index);
  }

  /**
   * Returns a single repetition of Contract Period (PV1-27).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public NM getContractPeriod(int rep) throws HL7Exception {
    NM ret = null;
    try {
        Type t = this.getField(27, rep);
        ret = (NM)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Contract Period (PV1-27).
   */
  public NM[] getContractPeriod() {
     NM[] ret = null;
    try {
        Type[] t = this.getField(27);  
        ret = new NM[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (NM)t[i];
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
   * Returns a count of the number of repetitions of Contract Period (PV1-27).
   */
  public int getContractPeriodReps() {
    try {
        return this.getField(27).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Contract Period (PV1-27) at a given index and returns it.
   * @param index The index
   */
  public NM insertContractPeriod(int index) throws HL7Exception {
     return (NM) super.insertRepetition(27, index);
  }

  /**
   * Removes a repetition of Contract Period (PV1-27) at a given index and returns it.
   * @param index The index
   */
  public NM removeContractPeriod(int index) throws HL7Exception {
     return (NM) super.removeRepetition(27, index);
  }

  /**
   * Returns a single repetition of Contract Period (PV1-27).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public NM getPv127_ContractPeriod(int rep) throws HL7Exception {
    NM ret = null;
    try {
        Type t = this.getField(27, rep);
        ret = (NM)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Contract Period (PV1-27).
   */
  public NM[] getPv127_ContractPeriod() {
     NM[] ret = null;
    try {
        Type[] t = this.getField(27);  
        ret = new NM[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (NM)t[i];
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
   * Returns a count of the number of repetitions of Contract Period (PV1-27).
   */
  public int getPv127_ContractPeriodReps() {
    try {
        return this.getField(27).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Contract Period (PV1-27) at a given index and returns it.
   * @param index The index
   */
  public NM insertPv127_ContractPeriod(int index) throws HL7Exception {
     return (NM) super.insertRepetition(27, index);
  }

  /**
   * Removes a repetition of Contract Period (PV1-27) at a given index and returns it.
   * @param index The index
   */
  public NM removePv127_ContractPeriod(int index) throws HL7Exception {
     return (NM) super.removeRepetition(27, index);
  }

  /**
   * Returns Interest Code (PV1-28).
   */
  public IS getInterestCode()  {
    IS ret = null;
    try {
        Type t = this.getField(28, 0);
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
   * Returns Interest Code (PV1-28).
   */
  public IS getPv128_InterestCode()  {
    IS ret = null;
    try {
        Type t = this.getField(28, 0);
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
   * Returns Transfer to Bad Debt Code (PV1-29).
   */
  public IS getTransferToBadDebtCode()  {
    IS ret = null;
    try {
        Type t = this.getField(29, 0);
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
   * Returns Transfer to Bad Debt Code (PV1-29).
   */
  public IS getPv129_TransferToBadDebtCode()  {
    IS ret = null;
    try {
        Type t = this.getField(29, 0);
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
   * Returns Transfer to Bad Debt Date (PV1-30).
   */
  public DT getTransferToBadDebtDate()  {
    DT ret = null;
    try {
        Type t = this.getField(30, 0);
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
   * Returns Transfer to Bad Debt Date (PV1-30).
   */
  public DT getPv130_TransferToBadDebtDate()  {
    DT ret = null;
    try {
        Type t = this.getField(30, 0);
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
   * Returns Bad Debt Agency Code (PV1-31).
   */
  public IS getBadDebtAgencyCode()  {
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
   * Returns Bad Debt Agency Code (PV1-31).
   */
  public IS getPv131_BadDebtAgencyCode()  {
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
   * Returns Bad Debt Transfer Amount (PV1-32).
   */
  public NM getBadDebtTransferAmount()  {
    NM ret = null;
    try {
        Type t = this.getField(32, 0);
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
   * Returns Bad Debt Transfer Amount (PV1-32).
   */
  public NM getPv132_BadDebtTransferAmount()  {
    NM ret = null;
    try {
        Type t = this.getField(32, 0);
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
   * Returns Bad Debt Recovery Amount (PV1-33).
   */
  public NM getBadDebtRecoveryAmount()  {
    NM ret = null;
    try {
        Type t = this.getField(33, 0);
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
   * Returns Bad Debt Recovery Amount (PV1-33).
   */
  public NM getPv133_BadDebtRecoveryAmount()  {
    NM ret = null;
    try {
        Type t = this.getField(33, 0);
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
   * Returns Delete Account Indicator (PV1-34).
   */
  public IS getDeleteAccountIndicator()  {
    IS ret = null;
    try {
        Type t = this.getField(34, 0);
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
   * Returns Delete Account Indicator (PV1-34).
   */
  public IS getPv134_DeleteAccountIndicator()  {
    IS ret = null;
    try {
        Type t = this.getField(34, 0);
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
   * Returns Delete Account Date (PV1-35).
   */
  public DT getDeleteAccountDate()  {
    DT ret = null;
    try {
        Type t = this.getField(35, 0);
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
   * Returns Delete Account Date (PV1-35).
   */
  public DT getPv135_DeleteAccountDate()  {
    DT ret = null;
    try {
        Type t = this.getField(35, 0);
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
   * Returns Discharge Disposition (PV1-36).
   */
  public IS getDischargeDisposition()  {
    IS ret = null;
    try {
        Type t = this.getField(36, 0);
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
   * Returns Discharge Disposition (PV1-36).
   */
  public IS getPv136_DischargeDisposition()  {
    IS ret = null;
    try {
        Type t = this.getField(36, 0);
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
   * Returns Discharged to Location (PV1-37).
   */
  public DLD getDischargedToLocation()  {
    DLD ret = null;
    try {
        Type t = this.getField(37, 0);
        ret = (DLD)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns Discharged to Location (PV1-37).
   */
  public DLD getPv137_DischargedToLocation()  {
    DLD ret = null;
    try {
        Type t = this.getField(37, 0);
        ret = (DLD)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns Diet Type (PV1-38).
   */
  public CWE getDietType()  {
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
   * Returns Diet Type (PV1-38).
   */
  public CWE getPv138_DietType()  {
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
   * Returns Servicing Facility (PV1-39).
   */
  public IS getServicingFacility()  {
    IS ret = null;
    try {
        Type t = this.getField(39, 0);
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
   * Returns Servicing Facility (PV1-39).
   */
  public IS getPv139_ServicingFacility()  {
    IS ret = null;
    try {
        Type t = this.getField(39, 0);
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
   * Returns Bed Status (PV1-40).
   */
  public IS getBedStatus()  {
    IS ret = null;
    try {
        Type t = this.getField(40, 0);
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
   * Returns Bed Status (PV1-40).
   */
  public IS getPv140_BedStatus()  {
    IS ret = null;
    try {
        Type t = this.getField(40, 0);
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
   * Returns Account Status (PV1-41).
   */
  public IS getAccountStatus()  {
    IS ret = null;
    try {
        Type t = this.getField(41, 0);
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
   * Returns Account Status (PV1-41).
   */
  public IS getPv141_AccountStatus()  {
    IS ret = null;
    try {
        Type t = this.getField(41, 0);
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
   * Returns Pending Location (PV1-42).
   */
  public PL getPendingLocation()  {
    PL ret = null;
    try {
        Type t = this.getField(42, 0);
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
   * Returns Pending Location (PV1-42).
   */
  public PL getPv142_PendingLocation()  {
    PL ret = null;
    try {
        Type t = this.getField(42, 0);
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
   * Returns Prior Temporary Location (PV1-43).
   */
  public PL getPriorTemporaryLocation()  {
    PL ret = null;
    try {
        Type t = this.getField(43, 0);
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
   * Returns Prior Temporary Location (PV1-43).
   */
  public PL getPv143_PriorTemporaryLocation()  {
    PL ret = null;
    try {
        Type t = this.getField(43, 0);
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
   * Returns Admit Date/Time (PV1-44).
   */
  public DTM getAdmitDateTime()  {
    DTM ret = null;
    try {
        Type t = this.getField(44, 0);
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
   * Returns Admit Date/Time (PV1-44).
   */
  public DTM getPv144_AdmitDateTime()  {
    DTM ret = null;
    try {
        Type t = this.getField(44, 0);
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
   * Returns Discharge Date/Time (PV1-45).
   */
  public DTM getDischargeDateTime()  {
    DTM ret = null;
    try {
        Type t = this.getField(45, 0);
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
   * Returns Discharge Date/Time (PV1-45).
   */
  public DTM getPv145_DischargeDateTime()  {
    DTM ret = null;
    try {
        Type t = this.getField(45, 0);
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
   * Returns Current Patient Balance (PV1-46).
   */
  public NM getCurrentPatientBalance()  {
    NM ret = null;
    try {
        Type t = this.getField(46, 0);
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
   * Returns Current Patient Balance (PV1-46).
   */
  public NM getPv146_CurrentPatientBalance()  {
    NM ret = null;
    try {
        Type t = this.getField(46, 0);
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
   * Returns Total Charges (PV1-47).
   */
  public NM getTotalCharges()  {
    NM ret = null;
    try {
        Type t = this.getField(47, 0);
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
   * Returns Total Charges (PV1-47).
   */
  public NM getPv147_TotalCharges()  {
    NM ret = null;
    try {
        Type t = this.getField(47, 0);
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
   * Returns Total Adjustments (PV1-48).
   */
  public NM getTotalAdjustments()  {
    NM ret = null;
    try {
        Type t = this.getField(48, 0);
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
   * Returns Total Adjustments (PV1-48).
   */
  public NM getPv148_TotalAdjustments()  {
    NM ret = null;
    try {
        Type t = this.getField(48, 0);
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
   * Returns Total Payments (PV1-49).
   */
  public NM getTotalPayments()  {
    NM ret = null;
    try {
        Type t = this.getField(49, 0);
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
   * Returns Total Payments (PV1-49).
   */
  public NM getPv149_TotalPayments()  {
    NM ret = null;
    try {
        Type t = this.getField(49, 0);
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
   * Returns Alternate Visit ID (PV1-50).
   */
  public CX getAlternateVisitID()  {
    CX ret = null;
    try {
        Type t = this.getField(50, 0);
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
   * Returns Alternate Visit ID (PV1-50).
   */
  public CX getPv150_AlternateVisitID()  {
    CX ret = null;
    try {
        Type t = this.getField(50, 0);
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
   * Returns Visit Indicator (PV1-51).
   */
  public IS getVisitIndicator()  {
    IS ret = null;
    try {
        Type t = this.getField(51, 0);
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
   * Returns Visit Indicator (PV1-51).
   */
  public IS getPv151_VisitIndicator()  {
    IS ret = null;
    try {
        Type t = this.getField(51, 0);
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
   * Returns a single repetition of Other Healthcare Provider (PV1-52).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XCN getOtherHealthcareProvider(int rep) throws HL7Exception {
    XCN ret = null;
    try {
        Type t = this.getField(52, rep);
        ret = (XCN)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Other Healthcare Provider (PV1-52).
   */
  public XCN[] getOtherHealthcareProvider() {
     XCN[] ret = null;
    try {
        Type[] t = this.getField(52);  
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
   * Returns a count of the number of repetitions of Other Healthcare Provider (PV1-52).
   */
  public int getOtherHealthcareProviderReps() {
    try {
        return this.getField(52).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Other Healthcare Provider (PV1-52) at a given index and returns it.
   * @param index The index
   */
  public XCN insertOtherHealthcareProvider(int index) throws HL7Exception {
     return (XCN) super.insertRepetition(52, index);
  }

  /**
   * Removes a repetition of Other Healthcare Provider (PV1-52) at a given index and returns it.
   * @param index The index
   */
  public XCN removeOtherHealthcareProvider(int index) throws HL7Exception {
     return (XCN) super.removeRepetition(52, index);
  }

  /**
   * Returns a single repetition of Other Healthcare Provider (PV1-52).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XCN getPv152_OtherHealthcareProvider(int rep) throws HL7Exception {
    XCN ret = null;
    try {
        Type t = this.getField(52, rep);
        ret = (XCN)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Other Healthcare Provider (PV1-52).
   */
  public XCN[] getPv152_OtherHealthcareProvider() {
     XCN[] ret = null;
    try {
        Type[] t = this.getField(52);  
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
   * Returns a count of the number of repetitions of Other Healthcare Provider (PV1-52).
   */
  public int getPv152_OtherHealthcareProviderReps() {
    try {
        return this.getField(52).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Other Healthcare Provider (PV1-52) at a given index and returns it.
   * @param index The index
   */
  public XCN insertPv152_OtherHealthcareProvider(int index) throws HL7Exception {
     return (XCN) super.insertRepetition(52, index);
  }

  /**
   * Removes a repetition of Other Healthcare Provider (PV1-52) at a given index and returns it.
   * @param index The index
   */
  public XCN removePv152_OtherHealthcareProvider(int index) throws HL7Exception {
     return (XCN) super.removeRepetition(52, index);
  }

   protected Type createNewTypeWithoutReflection(int field) {
      switch (field) {
         case 0: return new ca.uhn.hl7v2.model.v26.datatype.SI(getMessage());
         case 1: return new ca.uhn.hl7v2.model.v26.datatype.IS(getMessage(), new Integer(4));
         case 2: return new ca.uhn.hl7v2.model.v26.datatype.PL(getMessage());
         case 3: return new ca.uhn.hl7v2.model.v26.datatype.IS(getMessage(), new Integer(7));
         case 4: return new ca.uhn.hl7v2.model.v26.datatype.CX(getMessage());
         case 5: return new ca.uhn.hl7v2.model.v26.datatype.PL(getMessage());
         case 6: return new ca.uhn.hl7v2.model.v26.datatype.XCN(getMessage());
         case 7: return new ca.uhn.hl7v2.model.v26.datatype.XCN(getMessage());
         case 8: return new ca.uhn.hl7v2.model.v26.datatype.XCN(getMessage());
         case 9: return new ca.uhn.hl7v2.model.v26.datatype.IS(getMessage(), new Integer(69));
         case 10: return new ca.uhn.hl7v2.model.v26.datatype.PL(getMessage());
         case 11: return new ca.uhn.hl7v2.model.v26.datatype.IS(getMessage(), new Integer(87));
         case 12: return new ca.uhn.hl7v2.model.v26.datatype.IS(getMessage(), new Integer(92));
         case 13: return new ca.uhn.hl7v2.model.v26.datatype.IS(getMessage(), new Integer(23));
         case 14: return new ca.uhn.hl7v2.model.v26.datatype.IS(getMessage(), new Integer(9));
         case 15: return new ca.uhn.hl7v2.model.v26.datatype.IS(getMessage(), new Integer(99));
         case 16: return new ca.uhn.hl7v2.model.v26.datatype.XCN(getMessage());
         case 17: return new ca.uhn.hl7v2.model.v26.datatype.IS(getMessage(), new Integer(18));
         case 18: return new ca.uhn.hl7v2.model.v26.datatype.CX(getMessage());
         case 19: return new ca.uhn.hl7v2.model.v26.datatype.FC(getMessage());
         case 20: return new ca.uhn.hl7v2.model.v26.datatype.IS(getMessage(), new Integer(32));
         case 21: return new ca.uhn.hl7v2.model.v26.datatype.IS(getMessage(), new Integer(45));
         case 22: return new ca.uhn.hl7v2.model.v26.datatype.IS(getMessage(), new Integer(46));
         case 23: return new ca.uhn.hl7v2.model.v26.datatype.IS(getMessage(), new Integer(44));
         case 24: return new ca.uhn.hl7v2.model.v26.datatype.DT(getMessage());
         case 25: return new ca.uhn.hl7v2.model.v26.datatype.NM(getMessage());
         case 26: return new ca.uhn.hl7v2.model.v26.datatype.NM(getMessage());
         case 27: return new ca.uhn.hl7v2.model.v26.datatype.IS(getMessage(), new Integer(73));
         case 28: return new ca.uhn.hl7v2.model.v26.datatype.IS(getMessage(), new Integer(110));
         case 29: return new ca.uhn.hl7v2.model.v26.datatype.DT(getMessage());
         case 30: return new ca.uhn.hl7v2.model.v26.datatype.IS(getMessage(), new Integer(21));
         case 31: return new ca.uhn.hl7v2.model.v26.datatype.NM(getMessage());
         case 32: return new ca.uhn.hl7v2.model.v26.datatype.NM(getMessage());
         case 33: return new ca.uhn.hl7v2.model.v26.datatype.IS(getMessage(), new Integer(111));
         case 34: return new ca.uhn.hl7v2.model.v26.datatype.DT(getMessage());
         case 35: return new ca.uhn.hl7v2.model.v26.datatype.IS(getMessage(), new Integer(112));
         case 36: return new ca.uhn.hl7v2.model.v26.datatype.DLD(getMessage());
         case 37: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 38: return new ca.uhn.hl7v2.model.v26.datatype.IS(getMessage(), new Integer(115));
         case 39: return new ca.uhn.hl7v2.model.v26.datatype.IS(getMessage(), new Integer(116));
         case 40: return new ca.uhn.hl7v2.model.v26.datatype.IS(getMessage(), new Integer(117));
         case 41: return new ca.uhn.hl7v2.model.v26.datatype.PL(getMessage());
         case 42: return new ca.uhn.hl7v2.model.v26.datatype.PL(getMessage());
         case 43: return new ca.uhn.hl7v2.model.v26.datatype.DTM(getMessage());
         case 44: return new ca.uhn.hl7v2.model.v26.datatype.DTM(getMessage());
         case 45: return new ca.uhn.hl7v2.model.v26.datatype.NM(getMessage());
         case 46: return new ca.uhn.hl7v2.model.v26.datatype.NM(getMessage());
         case 47: return new ca.uhn.hl7v2.model.v26.datatype.NM(getMessage());
         case 48: return new ca.uhn.hl7v2.model.v26.datatype.NM(getMessage());
         case 49: return new ca.uhn.hl7v2.model.v26.datatype.CX(getMessage());
         case 50: return new ca.uhn.hl7v2.model.v26.datatype.IS(getMessage(), new Integer(326));
         case 51: return new ca.uhn.hl7v2.model.v26.datatype.XCN(getMessage());
         default: return null;
      }
   }

}