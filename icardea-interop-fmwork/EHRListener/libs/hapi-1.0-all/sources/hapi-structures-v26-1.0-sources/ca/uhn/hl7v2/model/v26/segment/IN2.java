package ca.uhn.hl7v2.model.v26.segment;

import ca.uhn.hl7v2.model.*;
import ca.uhn.hl7v2.model.v26.datatype.*;
import ca.uhn.log.HapiLogFactory;
import ca.uhn.hl7v2.parser.ModelClassFactory;
import ca.uhn.hl7v2.HL7Exception;

/**
 * <p>Represents an HL7 IN2 message segment. 
 * This segment has the following fields:</p><p>
 * IN2-1: Insured's Employee ID (CX)<br> 
 * IN2-2: Insured's Social Security Number (ST)<br> 
 * IN2-3: Insured's Employer's Name and ID (XCN)<br> 
 * IN2-4: Employer Information Data (IS)<br> 
 * IN2-5: Mail Claim Party (IS)<br> 
 * IN2-6: Medicare Health Ins Card Number (ST)<br> 
 * IN2-7: Medicaid Case Name (XPN)<br> 
 * IN2-8: Medicaid Case Number (ST)<br> 
 * IN2-9: Military Sponsor Name (XPN)<br> 
 * IN2-10: Military ID Number (ST)<br> 
 * IN2-11: Dependent Of Military Recipient (CWE)<br> 
 * IN2-12: Military Organization (ST)<br> 
 * IN2-13: Military Station (ST)<br> 
 * IN2-14: Military Service (IS)<br> 
 * IN2-15: Military Rank/Grade (IS)<br> 
 * IN2-16: Military Status (IS)<br> 
 * IN2-17: Military Retire Date (DT)<br> 
 * IN2-18: Military Non-Avail Cert On File (ID)<br> 
 * IN2-19: Baby Coverage (ID)<br> 
 * IN2-20: Combine Baby Bill (ID)<br> 
 * IN2-21: Blood Deductible (ST)<br> 
 * IN2-22: Special Coverage Approval Name (XPN)<br> 
 * IN2-23: Special Coverage Approval Title (ST)<br> 
 * IN2-24: Non-Covered Insurance Code (IS)<br> 
 * IN2-25: Payor ID (CX)<br> 
 * IN2-26: Payor Subscriber ID (CX)<br> 
 * IN2-27: Eligibility Source (IS)<br> 
 * IN2-28: Room Coverage Type/Amount (RMC)<br> 
 * IN2-29: Policy Type/Amount (PTA)<br> 
 * IN2-30: Daily Deductible (DDI)<br> 
 * IN2-31: Living Dependency (IS)<br> 
 * IN2-32: Ambulatory Status (IS)<br> 
 * IN2-33: Citizenship (CWE)<br> 
 * IN2-34: Primary Language (CWE)<br> 
 * IN2-35: Living Arrangement (IS)<br> 
 * IN2-36: Publicity Code (CWE)<br> 
 * IN2-37: Protection Indicator (ID)<br> 
 * IN2-38: Student Indicator (IS)<br> 
 * IN2-39: Religion (CWE)<br> 
 * IN2-40: Mother's Maiden Name (XPN)<br> 
 * IN2-41: Nationality (CWE)<br> 
 * IN2-42: Ethnic Group (CWE)<br> 
 * IN2-43: Marital Status (CWE)<br> 
 * IN2-44: Insured's Employment Start Date (DT)<br> 
 * IN2-45: Employment Stop Date (DT)<br> 
 * IN2-46: Job Title (ST)<br> 
 * IN2-47: Job Code/Class (JCC)<br> 
 * IN2-48: Job Status (IS)<br> 
 * IN2-49: Employer Contact Person Name (XPN)<br> 
 * IN2-50: Employer Contact Person Phone Number (XTN)<br> 
 * IN2-51: Employer Contact Reason (IS)<br> 
 * IN2-52: Insured's Contact Person's Name (XPN)<br> 
 * IN2-53: Insured's Contact Person Phone Number (XTN)<br> 
 * IN2-54: Insured's Contact Person Reason (IS)<br> 
 * IN2-55: Relationship to the Patient Start Date (DT)<br> 
 * IN2-56: Relationship to the Patient Stop Date (DT)<br> 
 * IN2-57: Insurance Co Contact Reason (IS)<br> 
 * IN2-58: Insurance Co Contact Phone Number (XTN)<br> 
 * IN2-59: Policy Scope (IS)<br> 
 * IN2-60: Policy Source (IS)<br> 
 * IN2-61: Patient Member Number (CX)<br> 
 * IN2-62: Guarantor's Relationship to Insured (CWE)<br> 
 * IN2-63: Insured's Phone Number - Home (XTN)<br> 
 * IN2-64: Insured's Employer Phone Number (XTN)<br> 
 * IN2-65: Military Handicapped Program (CWE)<br> 
 * IN2-66: Suspend Flag (ID)<br> 
 * IN2-67: Copay Limit Flag (ID)<br> 
 * IN2-68: Stoploss Limit Flag (ID)<br> 
 * IN2-69: Insured Organization Name and ID (XON)<br> 
 * IN2-70: Insured Employer Organization Name and ID (XON)<br> 
 * IN2-71: Race (CWE)<br> 
 * IN2-72: Patient's Relationship to Insured (CWE)<br> 
 * </p><p>The get...() methods return data from individual fields.  These methods 
 * do not throw exceptions and may therefore have to handle exceptions internally.  
 * If an exception is handled internally, it is logged and null is returned.  
 * This is not expected to happen - if it does happen this indicates not so much 
 * an exceptional circumstance as a bug in the code for this class.</p>    
 */
public class IN2 extends AbstractSegment  {

  /**
   * Creates a IN2 (Insurance Additional Information) segment object that belongs to the given 
   * message.  
   */
  public IN2(Group parent, ModelClassFactory factory) {
    super(parent, factory);
    Message message = getMessage();
    try {
       this.add(CX.class, false, 0, 250, new Object[]{message}, "Insured's Employee ID");
       this.add(ST.class, false, 1, 11, new Object[]{message}, "Insured's Social Security Number");
       this.add(XCN.class, false, 0, 250, new Object[]{message}, "Insured's Employer's Name and ID");
       this.add(IS.class, false, 1, 1, new Object[]{message, new Integer(139)}, "Employer Information Data");
       this.add(IS.class, false, 0, 1, new Object[]{message, new Integer(137)}, "Mail Claim Party");
       this.add(ST.class, false, 1, 15, new Object[]{message}, "Medicare Health Ins Card Number");
       this.add(XPN.class, false, 0, 250, new Object[]{message}, "Medicaid Case Name");
       this.add(ST.class, false, 1, 15, new Object[]{message}, "Medicaid Case Number");
       this.add(XPN.class, false, 0, 250, new Object[]{message}, "Military Sponsor Name");
       this.add(ST.class, false, 1, 20, new Object[]{message}, "Military ID Number");
       this.add(CWE.class, false, 1, 250, new Object[]{message}, "Dependent Of Military Recipient");
       this.add(ST.class, false, 1, 25, new Object[]{message}, "Military Organization");
       this.add(ST.class, false, 1, 25, new Object[]{message}, "Military Station");
       this.add(IS.class, false, 1, 14, new Object[]{message, new Integer(140)}, "Military Service");
       this.add(IS.class, false, 1, 2, new Object[]{message, new Integer(141)}, "Military Rank/Grade");
       this.add(IS.class, false, 1, 3, new Object[]{message, new Integer(142)}, "Military Status");
       this.add(DT.class, false, 1, 8, new Object[]{message}, "Military Retire Date");
       this.add(ID.class, false, 1, 1, new Object[]{message, new Integer(136)}, "Military Non-Avail Cert On File");
       this.add(ID.class, false, 1, 1, new Object[]{message, new Integer(136)}, "Baby Coverage");
       this.add(ID.class, false, 1, 1, new Object[]{message, new Integer(136)}, "Combine Baby Bill");
       this.add(ST.class, false, 1, 1, new Object[]{message}, "Blood Deductible");
       this.add(XPN.class, false, 0, 250, new Object[]{message}, "Special Coverage Approval Name");
       this.add(ST.class, false, 1, 30, new Object[]{message}, "Special Coverage Approval Title");
       this.add(IS.class, false, 0, 8, new Object[]{message, new Integer(143)}, "Non-Covered Insurance Code");
       this.add(CX.class, false, 0, 250, new Object[]{message}, "Payor ID");
       this.add(CX.class, false, 0, 250, new Object[]{message}, "Payor Subscriber ID");
       this.add(IS.class, false, 1, 1, new Object[]{message, new Integer(144)}, "Eligibility Source");
       this.add(RMC.class, false, 0, 82, new Object[]{message}, "Room Coverage Type/Amount");
       this.add(PTA.class, false, 0, 56, new Object[]{message}, "Policy Type/Amount");
       this.add(DDI.class, false, 1, 25, new Object[]{message}, "Daily Deductible");
       this.add(IS.class, false, 1, 2, new Object[]{message, new Integer(223)}, "Living Dependency");
       this.add(IS.class, false, 0, 2, new Object[]{message, new Integer(9)}, "Ambulatory Status");
       this.add(CWE.class, false, 0, 705, new Object[]{message}, "Citizenship");
       this.add(CWE.class, false, 1, 705, new Object[]{message}, "Primary Language");
       this.add(IS.class, false, 1, 2, new Object[]{message, new Integer(220)}, "Living Arrangement");
       this.add(CWE.class, false, 1, 705, new Object[]{message}, "Publicity Code");
       this.add(ID.class, false, 1, 0, new Object[]{message, new Integer(136)}, "Protection Indicator");
       this.add(IS.class, false, 1, 2, new Object[]{message, new Integer(231)}, "Student Indicator");
       this.add(CWE.class, false, 1, 705, new Object[]{message}, "Religion");
       this.add(XPN.class, false, 0, 250, new Object[]{message}, "Mother's Maiden Name");
       this.add(CWE.class, false, 1, 0, new Object[]{message}, "Nationality");
       this.add(CWE.class, false, 0, 705, new Object[]{message}, "Ethnic Group");
       this.add(CWE.class, false, 0, 705, new Object[]{message}, "Marital Status");
       this.add(DT.class, false, 1, 8, new Object[]{message}, "Insured's Employment Start Date");
       this.add(DT.class, false, 1, 8, new Object[]{message}, "Employment Stop Date");
       this.add(ST.class, false, 1, 20, new Object[]{message}, "Job Title");
       this.add(JCC.class, false, 1, 20, new Object[]{message}, "Job Code/Class");
       this.add(IS.class, false, 1, 2, new Object[]{message, new Integer(311)}, "Job Status");
       this.add(XPN.class, false, 0, 250, new Object[]{message}, "Employer Contact Person Name");
       this.add(XTN.class, false, 0, 250, new Object[]{message}, "Employer Contact Person Phone Number");
       this.add(IS.class, false, 1, 2, new Object[]{message, new Integer(222)}, "Employer Contact Reason");
       this.add(XPN.class, false, 0, 250, new Object[]{message}, "Insured's Contact Person's Name");
       this.add(XTN.class, false, 0, 250, new Object[]{message}, "Insured's Contact Person Phone Number");
       this.add(IS.class, false, 0, 2, new Object[]{message, new Integer(222)}, "Insured's Contact Person Reason");
       this.add(DT.class, false, 1, 8, new Object[]{message}, "Relationship to the Patient Start Date");
       this.add(DT.class, false, 0, 8, new Object[]{message}, "Relationship to the Patient Stop Date");
       this.add(IS.class, false, 1, 2, new Object[]{message, new Integer(232)}, "Insurance Co Contact Reason");
       this.add(XTN.class, false, 0, 250, new Object[]{message}, "Insurance Co Contact Phone Number");
       this.add(IS.class, false, 1, 2, new Object[]{message, new Integer(312)}, "Policy Scope");
       this.add(IS.class, false, 1, 2, new Object[]{message, new Integer(313)}, "Policy Source");
       this.add(CX.class, false, 1, 250, new Object[]{message}, "Patient Member Number");
       this.add(CWE.class, false, 1, 250, new Object[]{message}, "Guarantor's Relationship to Insured");
       this.add(XTN.class, false, 0, 250, new Object[]{message}, "Insured's Phone Number - Home");
       this.add(XTN.class, false, 0, 250, new Object[]{message}, "Insured's Employer Phone Number");
       this.add(CWE.class, false, 1, 250, new Object[]{message}, "Military Handicapped Program");
       this.add(ID.class, false, 1, 1, new Object[]{message, new Integer(136)}, "Suspend Flag");
       this.add(ID.class, false, 1, 1, new Object[]{message, new Integer(136)}, "Copay Limit Flag");
       this.add(ID.class, false, 1, 1, new Object[]{message, new Integer(136)}, "Stoploss Limit Flag");
       this.add(XON.class, false, 0, 250, new Object[]{message}, "Insured Organization Name and ID");
       this.add(XON.class, false, 0, 250, new Object[]{message}, "Insured Employer Organization Name and ID");
       this.add(CWE.class, false, 0, 705, new Object[]{message}, "Race");
       this.add(CWE.class, false, 1, 705, new Object[]{message}, "Patient's Relationship to Insured");
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Can't instantiate " + this.getClass().getName(), he);
    }
  }

  /**
   * Returns a single repetition of Insured's Employee ID (IN2-1).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CX getInsuredSEmployeeID(int rep) throws HL7Exception {
    CX ret = null;
    try {
        Type t = this.getField(1, rep);
        ret = (CX)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Insured's Employee ID (IN2-1).
   */
  public CX[] getInsuredSEmployeeID() {
     CX[] ret = null;
    try {
        Type[] t = this.getField(1);  
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
   * Returns a count of the number of repetitions of Insured's Employee ID (IN2-1).
   */
  public int getInsuredSEmployeeIDReps() {
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
   * Inserts a repetition of Insured's Employee ID (IN2-1) at a given index and returns it.
   * @param index The index
   */
  public CX insertInsuredSEmployeeID(int index) throws HL7Exception {
     return (CX) super.insertRepetition(1, index);
  }

  /**
   * Removes a repetition of Insured's Employee ID (IN2-1) at a given index and returns it.
   * @param index The index
   */
  public CX removeInsuredSEmployeeID(int index) throws HL7Exception {
     return (CX) super.removeRepetition(1, index);
  }

  /**
   * Returns a single repetition of Insured's Employee ID (IN2-1).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CX getIn21_InsuredSEmployeeID(int rep) throws HL7Exception {
    CX ret = null;
    try {
        Type t = this.getField(1, rep);
        ret = (CX)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Insured's Employee ID (IN2-1).
   */
  public CX[] getIn21_InsuredSEmployeeID() {
     CX[] ret = null;
    try {
        Type[] t = this.getField(1);  
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
   * Returns a count of the number of repetitions of Insured's Employee ID (IN2-1).
   */
  public int getIn21_InsuredSEmployeeIDReps() {
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
   * Inserts a repetition of Insured's Employee ID (IN2-1) at a given index and returns it.
   * @param index The index
   */
  public CX insertIn21_InsuredSEmployeeID(int index) throws HL7Exception {
     return (CX) super.insertRepetition(1, index);
  }

  /**
   * Removes a repetition of Insured's Employee ID (IN2-1) at a given index and returns it.
   * @param index The index
   */
  public CX removeIn21_InsuredSEmployeeID(int index) throws HL7Exception {
     return (CX) super.removeRepetition(1, index);
  }

  /**
   * Returns Insured's Social Security Number (IN2-2).
   */
  public ST getInsuredSSocialSecurityNumber()  {
    ST ret = null;
    try {
        Type t = this.getField(2, 0);
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
   * Returns Insured's Social Security Number (IN2-2).
   */
  public ST getIn22_InsuredSSocialSecurityNumber()  {
    ST ret = null;
    try {
        Type t = this.getField(2, 0);
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
   * Returns a single repetition of Insured's Employer's Name and ID (IN2-3).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XCN getInsuredSEmployerSNameAndID(int rep) throws HL7Exception {
    XCN ret = null;
    try {
        Type t = this.getField(3, rep);
        ret = (XCN)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Insured's Employer's Name and ID (IN2-3).
   */
  public XCN[] getInsuredSEmployerSNameAndID() {
     XCN[] ret = null;
    try {
        Type[] t = this.getField(3);  
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
   * Returns a count of the number of repetitions of Insured's Employer's Name and ID (IN2-3).
   */
  public int getInsuredSEmployerSNameAndIDReps() {
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
   * Inserts a repetition of Insured's Employer's Name and ID (IN2-3) at a given index and returns it.
   * @param index The index
   */
  public XCN insertInsuredSEmployerSNameAndID(int index) throws HL7Exception {
     return (XCN) super.insertRepetition(3, index);
  }

  /**
   * Removes a repetition of Insured's Employer's Name and ID (IN2-3) at a given index and returns it.
   * @param index The index
   */
  public XCN removeInsuredSEmployerSNameAndID(int index) throws HL7Exception {
     return (XCN) super.removeRepetition(3, index);
  }

  /**
   * Returns a single repetition of Insured's Employer's Name and ID (IN2-3).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XCN getIn23_InsuredSEmployerSNameAndID(int rep) throws HL7Exception {
    XCN ret = null;
    try {
        Type t = this.getField(3, rep);
        ret = (XCN)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Insured's Employer's Name and ID (IN2-3).
   */
  public XCN[] getIn23_InsuredSEmployerSNameAndID() {
     XCN[] ret = null;
    try {
        Type[] t = this.getField(3);  
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
   * Returns a count of the number of repetitions of Insured's Employer's Name and ID (IN2-3).
   */
  public int getIn23_InsuredSEmployerSNameAndIDReps() {
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
   * Inserts a repetition of Insured's Employer's Name and ID (IN2-3) at a given index and returns it.
   * @param index The index
   */
  public XCN insertIn23_InsuredSEmployerSNameAndID(int index) throws HL7Exception {
     return (XCN) super.insertRepetition(3, index);
  }

  /**
   * Removes a repetition of Insured's Employer's Name and ID (IN2-3) at a given index and returns it.
   * @param index The index
   */
  public XCN removeIn23_InsuredSEmployerSNameAndID(int index) throws HL7Exception {
     return (XCN) super.removeRepetition(3, index);
  }

  /**
   * Returns Employer Information Data (IN2-4).
   */
  public IS getEmployerInformationData()  {
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
   * Returns Employer Information Data (IN2-4).
   */
  public IS getIn24_EmployerInformationData()  {
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
   * Returns a single repetition of Mail Claim Party (IN2-5).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public IS getMailClaimParty(int rep) throws HL7Exception {
    IS ret = null;
    try {
        Type t = this.getField(5, rep);
        ret = (IS)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Mail Claim Party (IN2-5).
   */
  public IS[] getMailClaimParty() {
     IS[] ret = null;
    try {
        Type[] t = this.getField(5);  
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
   * Returns a count of the number of repetitions of Mail Claim Party (IN2-5).
   */
  public int getMailClaimPartyReps() {
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
   * Inserts a repetition of Mail Claim Party (IN2-5) at a given index and returns it.
   * @param index The index
   */
  public IS insertMailClaimParty(int index) throws HL7Exception {
     return (IS) super.insertRepetition(5, index);
  }

  /**
   * Removes a repetition of Mail Claim Party (IN2-5) at a given index and returns it.
   * @param index The index
   */
  public IS removeMailClaimParty(int index) throws HL7Exception {
     return (IS) super.removeRepetition(5, index);
  }

  /**
   * Returns a single repetition of Mail Claim Party (IN2-5).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public IS getIn25_MailClaimParty(int rep) throws HL7Exception {
    IS ret = null;
    try {
        Type t = this.getField(5, rep);
        ret = (IS)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Mail Claim Party (IN2-5).
   */
  public IS[] getIn25_MailClaimParty() {
     IS[] ret = null;
    try {
        Type[] t = this.getField(5);  
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
   * Returns a count of the number of repetitions of Mail Claim Party (IN2-5).
   */
  public int getIn25_MailClaimPartyReps() {
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
   * Inserts a repetition of Mail Claim Party (IN2-5) at a given index and returns it.
   * @param index The index
   */
  public IS insertIn25_MailClaimParty(int index) throws HL7Exception {
     return (IS) super.insertRepetition(5, index);
  }

  /**
   * Removes a repetition of Mail Claim Party (IN2-5) at a given index and returns it.
   * @param index The index
   */
  public IS removeIn25_MailClaimParty(int index) throws HL7Exception {
     return (IS) super.removeRepetition(5, index);
  }

  /**
   * Returns Medicare Health Ins Card Number (IN2-6).
   */
  public ST getMedicareHealthInsCardNumber()  {
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
   * Returns Medicare Health Ins Card Number (IN2-6).
   */
  public ST getIn26_MedicareHealthInsCardNumber()  {
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
   * Returns a single repetition of Medicaid Case Name (IN2-7).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XPN getMedicaidCaseName(int rep) throws HL7Exception {
    XPN ret = null;
    try {
        Type t = this.getField(7, rep);
        ret = (XPN)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Medicaid Case Name (IN2-7).
   */
  public XPN[] getMedicaidCaseName() {
     XPN[] ret = null;
    try {
        Type[] t = this.getField(7);  
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
   * Returns a count of the number of repetitions of Medicaid Case Name (IN2-7).
   */
  public int getMedicaidCaseNameReps() {
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
   * Inserts a repetition of Medicaid Case Name (IN2-7) at a given index and returns it.
   * @param index The index
   */
  public XPN insertMedicaidCaseName(int index) throws HL7Exception {
     return (XPN) super.insertRepetition(7, index);
  }

  /**
   * Removes a repetition of Medicaid Case Name (IN2-7) at a given index and returns it.
   * @param index The index
   */
  public XPN removeMedicaidCaseName(int index) throws HL7Exception {
     return (XPN) super.removeRepetition(7, index);
  }

  /**
   * Returns a single repetition of Medicaid Case Name (IN2-7).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XPN getIn27_MedicaidCaseName(int rep) throws HL7Exception {
    XPN ret = null;
    try {
        Type t = this.getField(7, rep);
        ret = (XPN)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Medicaid Case Name (IN2-7).
   */
  public XPN[] getIn27_MedicaidCaseName() {
     XPN[] ret = null;
    try {
        Type[] t = this.getField(7);  
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
   * Returns a count of the number of repetitions of Medicaid Case Name (IN2-7).
   */
  public int getIn27_MedicaidCaseNameReps() {
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
   * Inserts a repetition of Medicaid Case Name (IN2-7) at a given index and returns it.
   * @param index The index
   */
  public XPN insertIn27_MedicaidCaseName(int index) throws HL7Exception {
     return (XPN) super.insertRepetition(7, index);
  }

  /**
   * Removes a repetition of Medicaid Case Name (IN2-7) at a given index and returns it.
   * @param index The index
   */
  public XPN removeIn27_MedicaidCaseName(int index) throws HL7Exception {
     return (XPN) super.removeRepetition(7, index);
  }

  /**
   * Returns Medicaid Case Number (IN2-8).
   */
  public ST getMedicaidCaseNumber()  {
    ST ret = null;
    try {
        Type t = this.getField(8, 0);
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
   * Returns Medicaid Case Number (IN2-8).
   */
  public ST getIn28_MedicaidCaseNumber()  {
    ST ret = null;
    try {
        Type t = this.getField(8, 0);
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
   * Returns a single repetition of Military Sponsor Name (IN2-9).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XPN getMilitarySponsorName(int rep) throws HL7Exception {
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
   * Returns all repetitions of Military Sponsor Name (IN2-9).
   */
  public XPN[] getMilitarySponsorName() {
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
   * Returns a count of the number of repetitions of Military Sponsor Name (IN2-9).
   */
  public int getMilitarySponsorNameReps() {
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
   * Inserts a repetition of Military Sponsor Name (IN2-9) at a given index and returns it.
   * @param index The index
   */
  public XPN insertMilitarySponsorName(int index) throws HL7Exception {
     return (XPN) super.insertRepetition(9, index);
  }

  /**
   * Removes a repetition of Military Sponsor Name (IN2-9) at a given index and returns it.
   * @param index The index
   */
  public XPN removeMilitarySponsorName(int index) throws HL7Exception {
     return (XPN) super.removeRepetition(9, index);
  }

  /**
   * Returns a single repetition of Military Sponsor Name (IN2-9).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XPN getIn29_MilitarySponsorName(int rep) throws HL7Exception {
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
   * Returns all repetitions of Military Sponsor Name (IN2-9).
   */
  public XPN[] getIn29_MilitarySponsorName() {
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
   * Returns a count of the number of repetitions of Military Sponsor Name (IN2-9).
   */
  public int getIn29_MilitarySponsorNameReps() {
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
   * Inserts a repetition of Military Sponsor Name (IN2-9) at a given index and returns it.
   * @param index The index
   */
  public XPN insertIn29_MilitarySponsorName(int index) throws HL7Exception {
     return (XPN) super.insertRepetition(9, index);
  }

  /**
   * Removes a repetition of Military Sponsor Name (IN2-9) at a given index and returns it.
   * @param index The index
   */
  public XPN removeIn29_MilitarySponsorName(int index) throws HL7Exception {
     return (XPN) super.removeRepetition(9, index);
  }

  /**
   * Returns Military ID Number (IN2-10).
   */
  public ST getMilitaryIDNumber()  {
    ST ret = null;
    try {
        Type t = this.getField(10, 0);
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
   * Returns Military ID Number (IN2-10).
   */
  public ST getIn210_MilitaryIDNumber()  {
    ST ret = null;
    try {
        Type t = this.getField(10, 0);
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
   * Returns Dependent Of Military Recipient (IN2-11).
   */
  public CWE getDependentOfMilitaryRecipient()  {
    CWE ret = null;
    try {
        Type t = this.getField(11, 0);
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
   * Returns Dependent Of Military Recipient (IN2-11).
   */
  public CWE getIn211_DependentOfMilitaryRecipient()  {
    CWE ret = null;
    try {
        Type t = this.getField(11, 0);
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
   * Returns Military Organization (IN2-12).
   */
  public ST getMilitaryOrganization()  {
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
   * Returns Military Organization (IN2-12).
   */
  public ST getIn212_MilitaryOrganization()  {
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
   * Returns Military Station (IN2-13).
   */
  public ST getMilitaryStation()  {
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
   * Returns Military Station (IN2-13).
   */
  public ST getIn213_MilitaryStation()  {
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
   * Returns Military Service (IN2-14).
   */
  public IS getMilitaryService()  {
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
   * Returns Military Service (IN2-14).
   */
  public IS getIn214_MilitaryService()  {
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
   * Returns Military Rank/Grade (IN2-15).
   */
  public IS getMilitaryRankGrade()  {
    IS ret = null;
    try {
        Type t = this.getField(15, 0);
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
   * Returns Military Rank/Grade (IN2-15).
   */
  public IS getIn215_MilitaryRankGrade()  {
    IS ret = null;
    try {
        Type t = this.getField(15, 0);
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
   * Returns Military Status (IN2-16).
   */
  public IS getMilitaryStatus()  {
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
   * Returns Military Status (IN2-16).
   */
  public IS getIn216_MilitaryStatus()  {
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
   * Returns Military Retire Date (IN2-17).
   */
  public DT getMilitaryRetireDate()  {
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
   * Returns Military Retire Date (IN2-17).
   */
  public DT getIn217_MilitaryRetireDate()  {
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
   * Returns Military Non-Avail Cert On File (IN2-18).
   */
  public ID getMilitaryNonAvailCertOnFile()  {
    ID ret = null;
    try {
        Type t = this.getField(18, 0);
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
   * Returns Military Non-Avail Cert On File (IN2-18).
   */
  public ID getIn218_MilitaryNonAvailCertOnFile()  {
    ID ret = null;
    try {
        Type t = this.getField(18, 0);
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
   * Returns Baby Coverage (IN2-19).
   */
  public ID getBabyCoverage()  {
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
   * Returns Baby Coverage (IN2-19).
   */
  public ID getIn219_BabyCoverage()  {
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
   * Returns Combine Baby Bill (IN2-20).
   */
  public ID getCombineBabyBill()  {
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
   * Returns Combine Baby Bill (IN2-20).
   */
  public ID getIn220_CombineBabyBill()  {
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
   * Returns Blood Deductible (IN2-21).
   */
  public ST getBloodDeductible()  {
    ST ret = null;
    try {
        Type t = this.getField(21, 0);
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
   * Returns Blood Deductible (IN2-21).
   */
  public ST getIn221_BloodDeductible()  {
    ST ret = null;
    try {
        Type t = this.getField(21, 0);
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
   * Returns a single repetition of Special Coverage Approval Name (IN2-22).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XPN getSpecialCoverageApprovalName(int rep) throws HL7Exception {
    XPN ret = null;
    try {
        Type t = this.getField(22, rep);
        ret = (XPN)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Special Coverage Approval Name (IN2-22).
   */
  public XPN[] getSpecialCoverageApprovalName() {
     XPN[] ret = null;
    try {
        Type[] t = this.getField(22);  
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
   * Returns a count of the number of repetitions of Special Coverage Approval Name (IN2-22).
   */
  public int getSpecialCoverageApprovalNameReps() {
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
   * Inserts a repetition of Special Coverage Approval Name (IN2-22) at a given index and returns it.
   * @param index The index
   */
  public XPN insertSpecialCoverageApprovalName(int index) throws HL7Exception {
     return (XPN) super.insertRepetition(22, index);
  }

  /**
   * Removes a repetition of Special Coverage Approval Name (IN2-22) at a given index and returns it.
   * @param index The index
   */
  public XPN removeSpecialCoverageApprovalName(int index) throws HL7Exception {
     return (XPN) super.removeRepetition(22, index);
  }

  /**
   * Returns a single repetition of Special Coverage Approval Name (IN2-22).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XPN getIn222_SpecialCoverageApprovalName(int rep) throws HL7Exception {
    XPN ret = null;
    try {
        Type t = this.getField(22, rep);
        ret = (XPN)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Special Coverage Approval Name (IN2-22).
   */
  public XPN[] getIn222_SpecialCoverageApprovalName() {
     XPN[] ret = null;
    try {
        Type[] t = this.getField(22);  
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
   * Returns a count of the number of repetitions of Special Coverage Approval Name (IN2-22).
   */
  public int getIn222_SpecialCoverageApprovalNameReps() {
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
   * Inserts a repetition of Special Coverage Approval Name (IN2-22) at a given index and returns it.
   * @param index The index
   */
  public XPN insertIn222_SpecialCoverageApprovalName(int index) throws HL7Exception {
     return (XPN) super.insertRepetition(22, index);
  }

  /**
   * Removes a repetition of Special Coverage Approval Name (IN2-22) at a given index and returns it.
   * @param index The index
   */
  public XPN removeIn222_SpecialCoverageApprovalName(int index) throws HL7Exception {
     return (XPN) super.removeRepetition(22, index);
  }

  /**
   * Returns Special Coverage Approval Title (IN2-23).
   */
  public ST getSpecialCoverageApprovalTitle()  {
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
   * Returns Special Coverage Approval Title (IN2-23).
   */
  public ST getIn223_SpecialCoverageApprovalTitle()  {
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
   * Returns a single repetition of Non-Covered Insurance Code (IN2-24).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public IS getNonCoveredInsuranceCode(int rep) throws HL7Exception {
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
   * Returns all repetitions of Non-Covered Insurance Code (IN2-24).
   */
  public IS[] getNonCoveredInsuranceCode() {
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
   * Returns a count of the number of repetitions of Non-Covered Insurance Code (IN2-24).
   */
  public int getNonCoveredInsuranceCodeReps() {
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
   * Inserts a repetition of Non-Covered Insurance Code (IN2-24) at a given index and returns it.
   * @param index The index
   */
  public IS insertNonCoveredInsuranceCode(int index) throws HL7Exception {
     return (IS) super.insertRepetition(24, index);
  }

  /**
   * Removes a repetition of Non-Covered Insurance Code (IN2-24) at a given index and returns it.
   * @param index The index
   */
  public IS removeNonCoveredInsuranceCode(int index) throws HL7Exception {
     return (IS) super.removeRepetition(24, index);
  }

  /**
   * Returns a single repetition of Non-Covered Insurance Code (IN2-24).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public IS getIn224_NonCoveredInsuranceCode(int rep) throws HL7Exception {
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
   * Returns all repetitions of Non-Covered Insurance Code (IN2-24).
   */
  public IS[] getIn224_NonCoveredInsuranceCode() {
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
   * Returns a count of the number of repetitions of Non-Covered Insurance Code (IN2-24).
   */
  public int getIn224_NonCoveredInsuranceCodeReps() {
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
   * Inserts a repetition of Non-Covered Insurance Code (IN2-24) at a given index and returns it.
   * @param index The index
   */
  public IS insertIn224_NonCoveredInsuranceCode(int index) throws HL7Exception {
     return (IS) super.insertRepetition(24, index);
  }

  /**
   * Removes a repetition of Non-Covered Insurance Code (IN2-24) at a given index and returns it.
   * @param index The index
   */
  public IS removeIn224_NonCoveredInsuranceCode(int index) throws HL7Exception {
     return (IS) super.removeRepetition(24, index);
  }

  /**
   * Returns a single repetition of Payor ID (IN2-25).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CX getPayorID(int rep) throws HL7Exception {
    CX ret = null;
    try {
        Type t = this.getField(25, rep);
        ret = (CX)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Payor ID (IN2-25).
   */
  public CX[] getPayorID() {
     CX[] ret = null;
    try {
        Type[] t = this.getField(25);  
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
   * Returns a count of the number of repetitions of Payor ID (IN2-25).
   */
  public int getPayorIDReps() {
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
   * Inserts a repetition of Payor ID (IN2-25) at a given index and returns it.
   * @param index The index
   */
  public CX insertPayorID(int index) throws HL7Exception {
     return (CX) super.insertRepetition(25, index);
  }

  /**
   * Removes a repetition of Payor ID (IN2-25) at a given index and returns it.
   * @param index The index
   */
  public CX removePayorID(int index) throws HL7Exception {
     return (CX) super.removeRepetition(25, index);
  }

  /**
   * Returns a single repetition of Payor ID (IN2-25).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CX getIn225_PayorID(int rep) throws HL7Exception {
    CX ret = null;
    try {
        Type t = this.getField(25, rep);
        ret = (CX)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Payor ID (IN2-25).
   */
  public CX[] getIn225_PayorID() {
     CX[] ret = null;
    try {
        Type[] t = this.getField(25);  
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
   * Returns a count of the number of repetitions of Payor ID (IN2-25).
   */
  public int getIn225_PayorIDReps() {
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
   * Inserts a repetition of Payor ID (IN2-25) at a given index and returns it.
   * @param index The index
   */
  public CX insertIn225_PayorID(int index) throws HL7Exception {
     return (CX) super.insertRepetition(25, index);
  }

  /**
   * Removes a repetition of Payor ID (IN2-25) at a given index and returns it.
   * @param index The index
   */
  public CX removeIn225_PayorID(int index) throws HL7Exception {
     return (CX) super.removeRepetition(25, index);
  }

  /**
   * Returns a single repetition of Payor Subscriber ID (IN2-26).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CX getPayorSubscriberID(int rep) throws HL7Exception {
    CX ret = null;
    try {
        Type t = this.getField(26, rep);
        ret = (CX)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Payor Subscriber ID (IN2-26).
   */
  public CX[] getPayorSubscriberID() {
     CX[] ret = null;
    try {
        Type[] t = this.getField(26);  
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
   * Returns a count of the number of repetitions of Payor Subscriber ID (IN2-26).
   */
  public int getPayorSubscriberIDReps() {
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
   * Inserts a repetition of Payor Subscriber ID (IN2-26) at a given index and returns it.
   * @param index The index
   */
  public CX insertPayorSubscriberID(int index) throws HL7Exception {
     return (CX) super.insertRepetition(26, index);
  }

  /**
   * Removes a repetition of Payor Subscriber ID (IN2-26) at a given index and returns it.
   * @param index The index
   */
  public CX removePayorSubscriberID(int index) throws HL7Exception {
     return (CX) super.removeRepetition(26, index);
  }

  /**
   * Returns a single repetition of Payor Subscriber ID (IN2-26).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CX getIn226_PayorSubscriberID(int rep) throws HL7Exception {
    CX ret = null;
    try {
        Type t = this.getField(26, rep);
        ret = (CX)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Payor Subscriber ID (IN2-26).
   */
  public CX[] getIn226_PayorSubscriberID() {
     CX[] ret = null;
    try {
        Type[] t = this.getField(26);  
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
   * Returns a count of the number of repetitions of Payor Subscriber ID (IN2-26).
   */
  public int getIn226_PayorSubscriberIDReps() {
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
   * Inserts a repetition of Payor Subscriber ID (IN2-26) at a given index and returns it.
   * @param index The index
   */
  public CX insertIn226_PayorSubscriberID(int index) throws HL7Exception {
     return (CX) super.insertRepetition(26, index);
  }

  /**
   * Removes a repetition of Payor Subscriber ID (IN2-26) at a given index and returns it.
   * @param index The index
   */
  public CX removeIn226_PayorSubscriberID(int index) throws HL7Exception {
     return (CX) super.removeRepetition(26, index);
  }

  /**
   * Returns Eligibility Source (IN2-27).
   */
  public IS getEligibilitySource()  {
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
   * Returns Eligibility Source (IN2-27).
   */
  public IS getIn227_EligibilitySource()  {
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
   * Returns a single repetition of Room Coverage Type/Amount (IN2-28).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public RMC getRoomCoverageTypeAmount(int rep) throws HL7Exception {
    RMC ret = null;
    try {
        Type t = this.getField(28, rep);
        ret = (RMC)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Room Coverage Type/Amount (IN2-28).
   */
  public RMC[] getRoomCoverageTypeAmount() {
     RMC[] ret = null;
    try {
        Type[] t = this.getField(28);  
        ret = new RMC[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (RMC)t[i];
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
   * Returns a count of the number of repetitions of Room Coverage Type/Amount (IN2-28).
   */
  public int getRoomCoverageTypeAmountReps() {
    try {
        return this.getField(28).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Room Coverage Type/Amount (IN2-28) at a given index and returns it.
   * @param index The index
   */
  public RMC insertRoomCoverageTypeAmount(int index) throws HL7Exception {
     return (RMC) super.insertRepetition(28, index);
  }

  /**
   * Removes a repetition of Room Coverage Type/Amount (IN2-28) at a given index and returns it.
   * @param index The index
   */
  public RMC removeRoomCoverageTypeAmount(int index) throws HL7Exception {
     return (RMC) super.removeRepetition(28, index);
  }

  /**
   * Returns a single repetition of Room Coverage Type/Amount (IN2-28).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public RMC getIn228_RoomCoverageTypeAmount(int rep) throws HL7Exception {
    RMC ret = null;
    try {
        Type t = this.getField(28, rep);
        ret = (RMC)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Room Coverage Type/Amount (IN2-28).
   */
  public RMC[] getIn228_RoomCoverageTypeAmount() {
     RMC[] ret = null;
    try {
        Type[] t = this.getField(28);  
        ret = new RMC[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (RMC)t[i];
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
   * Returns a count of the number of repetitions of Room Coverage Type/Amount (IN2-28).
   */
  public int getIn228_RoomCoverageTypeAmountReps() {
    try {
        return this.getField(28).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Room Coverage Type/Amount (IN2-28) at a given index and returns it.
   * @param index The index
   */
  public RMC insertIn228_RoomCoverageTypeAmount(int index) throws HL7Exception {
     return (RMC) super.insertRepetition(28, index);
  }

  /**
   * Removes a repetition of Room Coverage Type/Amount (IN2-28) at a given index and returns it.
   * @param index The index
   */
  public RMC removeIn228_RoomCoverageTypeAmount(int index) throws HL7Exception {
     return (RMC) super.removeRepetition(28, index);
  }

  /**
   * Returns a single repetition of Policy Type/Amount (IN2-29).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public PTA getPolicyTypeAmount(int rep) throws HL7Exception {
    PTA ret = null;
    try {
        Type t = this.getField(29, rep);
        ret = (PTA)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Policy Type/Amount (IN2-29).
   */
  public PTA[] getPolicyTypeAmount() {
     PTA[] ret = null;
    try {
        Type[] t = this.getField(29);  
        ret = new PTA[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (PTA)t[i];
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
   * Returns a count of the number of repetitions of Policy Type/Amount (IN2-29).
   */
  public int getPolicyTypeAmountReps() {
    try {
        return this.getField(29).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Policy Type/Amount (IN2-29) at a given index and returns it.
   * @param index The index
   */
  public PTA insertPolicyTypeAmount(int index) throws HL7Exception {
     return (PTA) super.insertRepetition(29, index);
  }

  /**
   * Removes a repetition of Policy Type/Amount (IN2-29) at a given index and returns it.
   * @param index The index
   */
  public PTA removePolicyTypeAmount(int index) throws HL7Exception {
     return (PTA) super.removeRepetition(29, index);
  }

  /**
   * Returns a single repetition of Policy Type/Amount (IN2-29).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public PTA getIn229_PolicyTypeAmount(int rep) throws HL7Exception {
    PTA ret = null;
    try {
        Type t = this.getField(29, rep);
        ret = (PTA)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Policy Type/Amount (IN2-29).
   */
  public PTA[] getIn229_PolicyTypeAmount() {
     PTA[] ret = null;
    try {
        Type[] t = this.getField(29);  
        ret = new PTA[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (PTA)t[i];
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
   * Returns a count of the number of repetitions of Policy Type/Amount (IN2-29).
   */
  public int getIn229_PolicyTypeAmountReps() {
    try {
        return this.getField(29).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Policy Type/Amount (IN2-29) at a given index and returns it.
   * @param index The index
   */
  public PTA insertIn229_PolicyTypeAmount(int index) throws HL7Exception {
     return (PTA) super.insertRepetition(29, index);
  }

  /**
   * Removes a repetition of Policy Type/Amount (IN2-29) at a given index and returns it.
   * @param index The index
   */
  public PTA removeIn229_PolicyTypeAmount(int index) throws HL7Exception {
     return (PTA) super.removeRepetition(29, index);
  }

  /**
   * Returns Daily Deductible (IN2-30).
   */
  public DDI getDailyDeductible()  {
    DDI ret = null;
    try {
        Type t = this.getField(30, 0);
        ret = (DDI)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns Daily Deductible (IN2-30).
   */
  public DDI getIn230_DailyDeductible()  {
    DDI ret = null;
    try {
        Type t = this.getField(30, 0);
        ret = (DDI)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns Living Dependency (IN2-31).
   */
  public IS getLivingDependency()  {
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
   * Returns Living Dependency (IN2-31).
   */
  public IS getIn231_LivingDependency()  {
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
   * Returns a single repetition of Ambulatory Status (IN2-32).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public IS getAmbulatoryStatus(int rep) throws HL7Exception {
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
   * Returns all repetitions of Ambulatory Status (IN2-32).
   */
  public IS[] getAmbulatoryStatus() {
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
   * Returns a count of the number of repetitions of Ambulatory Status (IN2-32).
   */
  public int getAmbulatoryStatusReps() {
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
   * Inserts a repetition of Ambulatory Status (IN2-32) at a given index and returns it.
   * @param index The index
   */
  public IS insertAmbulatoryStatus(int index) throws HL7Exception {
     return (IS) super.insertRepetition(32, index);
  }

  /**
   * Removes a repetition of Ambulatory Status (IN2-32) at a given index and returns it.
   * @param index The index
   */
  public IS removeAmbulatoryStatus(int index) throws HL7Exception {
     return (IS) super.removeRepetition(32, index);
  }

  /**
   * Returns a single repetition of Ambulatory Status (IN2-32).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public IS getIn232_AmbulatoryStatus(int rep) throws HL7Exception {
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
   * Returns all repetitions of Ambulatory Status (IN2-32).
   */
  public IS[] getIn232_AmbulatoryStatus() {
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
   * Returns a count of the number of repetitions of Ambulatory Status (IN2-32).
   */
  public int getIn232_AmbulatoryStatusReps() {
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
   * Inserts a repetition of Ambulatory Status (IN2-32) at a given index and returns it.
   * @param index The index
   */
  public IS insertIn232_AmbulatoryStatus(int index) throws HL7Exception {
     return (IS) super.insertRepetition(32, index);
  }

  /**
   * Removes a repetition of Ambulatory Status (IN2-32) at a given index and returns it.
   * @param index The index
   */
  public IS removeIn232_AmbulatoryStatus(int index) throws HL7Exception {
     return (IS) super.removeRepetition(32, index);
  }

  /**
   * Returns a single repetition of Citizenship (IN2-33).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getCitizenship(int rep) throws HL7Exception {
    CWE ret = null;
    try {
        Type t = this.getField(33, rep);
        ret = (CWE)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Citizenship (IN2-33).
   */
  public CWE[] getCitizenship() {
     CWE[] ret = null;
    try {
        Type[] t = this.getField(33);  
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
   * Returns a count of the number of repetitions of Citizenship (IN2-33).
   */
  public int getCitizenshipReps() {
    try {
        return this.getField(33).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Citizenship (IN2-33) at a given index and returns it.
   * @param index The index
   */
  public CWE insertCitizenship(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(33, index);
  }

  /**
   * Removes a repetition of Citizenship (IN2-33) at a given index and returns it.
   * @param index The index
   */
  public CWE removeCitizenship(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(33, index);
  }

  /**
   * Returns a single repetition of Citizenship (IN2-33).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getIn233_Citizenship(int rep) throws HL7Exception {
    CWE ret = null;
    try {
        Type t = this.getField(33, rep);
        ret = (CWE)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Citizenship (IN2-33).
   */
  public CWE[] getIn233_Citizenship() {
     CWE[] ret = null;
    try {
        Type[] t = this.getField(33);  
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
   * Returns a count of the number of repetitions of Citizenship (IN2-33).
   */
  public int getIn233_CitizenshipReps() {
    try {
        return this.getField(33).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Citizenship (IN2-33) at a given index and returns it.
   * @param index The index
   */
  public CWE insertIn233_Citizenship(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(33, index);
  }

  /**
   * Removes a repetition of Citizenship (IN2-33) at a given index and returns it.
   * @param index The index
   */
  public CWE removeIn233_Citizenship(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(33, index);
  }

  /**
   * Returns Primary Language (IN2-34).
   */
  public CWE getPrimaryLanguage()  {
    CWE ret = null;
    try {
        Type t = this.getField(34, 0);
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
   * Returns Primary Language (IN2-34).
   */
  public CWE getIn234_PrimaryLanguage()  {
    CWE ret = null;
    try {
        Type t = this.getField(34, 0);
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
   * Returns Living Arrangement (IN2-35).
   */
  public IS getLivingArrangement()  {
    IS ret = null;
    try {
        Type t = this.getField(35, 0);
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
   * Returns Living Arrangement (IN2-35).
   */
  public IS getIn235_LivingArrangement()  {
    IS ret = null;
    try {
        Type t = this.getField(35, 0);
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
   * Returns Publicity Code (IN2-36).
   */
  public CWE getPublicityCode()  {
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
   * Returns Publicity Code (IN2-36).
   */
  public CWE getIn236_PublicityCode()  {
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
   * Returns Protection Indicator (IN2-37).
   */
  public ID getProtectionIndicator()  {
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
   * Returns Protection Indicator (IN2-37).
   */
  public ID getIn237_ProtectionIndicator()  {
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
   * Returns Student Indicator (IN2-38).
   */
  public IS getStudentIndicator()  {
    IS ret = null;
    try {
        Type t = this.getField(38, 0);
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
   * Returns Student Indicator (IN2-38).
   */
  public IS getIn238_StudentIndicator()  {
    IS ret = null;
    try {
        Type t = this.getField(38, 0);
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
   * Returns Religion (IN2-39).
   */
  public CWE getReligion()  {
    CWE ret = null;
    try {
        Type t = this.getField(39, 0);
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
   * Returns Religion (IN2-39).
   */
  public CWE getIn239_Religion()  {
    CWE ret = null;
    try {
        Type t = this.getField(39, 0);
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
   * Returns a single repetition of Mother's Maiden Name (IN2-40).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XPN getMotherSMaidenName(int rep) throws HL7Exception {
    XPN ret = null;
    try {
        Type t = this.getField(40, rep);
        ret = (XPN)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Mother's Maiden Name (IN2-40).
   */
  public XPN[] getMotherSMaidenName() {
     XPN[] ret = null;
    try {
        Type[] t = this.getField(40);  
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
   * Returns a count of the number of repetitions of Mother's Maiden Name (IN2-40).
   */
  public int getMotherSMaidenNameReps() {
    try {
        return this.getField(40).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Mother's Maiden Name (IN2-40) at a given index and returns it.
   * @param index The index
   */
  public XPN insertMotherSMaidenName(int index) throws HL7Exception {
     return (XPN) super.insertRepetition(40, index);
  }

  /**
   * Removes a repetition of Mother's Maiden Name (IN2-40) at a given index and returns it.
   * @param index The index
   */
  public XPN removeMotherSMaidenName(int index) throws HL7Exception {
     return (XPN) super.removeRepetition(40, index);
  }

  /**
   * Returns a single repetition of Mother's Maiden Name (IN2-40).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XPN getIn240_MotherSMaidenName(int rep) throws HL7Exception {
    XPN ret = null;
    try {
        Type t = this.getField(40, rep);
        ret = (XPN)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Mother's Maiden Name (IN2-40).
   */
  public XPN[] getIn240_MotherSMaidenName() {
     XPN[] ret = null;
    try {
        Type[] t = this.getField(40);  
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
   * Returns a count of the number of repetitions of Mother's Maiden Name (IN2-40).
   */
  public int getIn240_MotherSMaidenNameReps() {
    try {
        return this.getField(40).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Mother's Maiden Name (IN2-40) at a given index and returns it.
   * @param index The index
   */
  public XPN insertIn240_MotherSMaidenName(int index) throws HL7Exception {
     return (XPN) super.insertRepetition(40, index);
  }

  /**
   * Removes a repetition of Mother's Maiden Name (IN2-40) at a given index and returns it.
   * @param index The index
   */
  public XPN removeIn240_MotherSMaidenName(int index) throws HL7Exception {
     return (XPN) super.removeRepetition(40, index);
  }

  /**
   * Returns Nationality (IN2-41).
   */
  public CWE getNationality()  {
    CWE ret = null;
    try {
        Type t = this.getField(41, 0);
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
   * Returns Nationality (IN2-41).
   */
  public CWE getIn241_Nationality()  {
    CWE ret = null;
    try {
        Type t = this.getField(41, 0);
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
   * Returns a single repetition of Ethnic Group (IN2-42).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getEthnicGroup(int rep) throws HL7Exception {
    CWE ret = null;
    try {
        Type t = this.getField(42, rep);
        ret = (CWE)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Ethnic Group (IN2-42).
   */
  public CWE[] getEthnicGroup() {
     CWE[] ret = null;
    try {
        Type[] t = this.getField(42);  
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
   * Returns a count of the number of repetitions of Ethnic Group (IN2-42).
   */
  public int getEthnicGroupReps() {
    try {
        return this.getField(42).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Ethnic Group (IN2-42) at a given index and returns it.
   * @param index The index
   */
  public CWE insertEthnicGroup(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(42, index);
  }

  /**
   * Removes a repetition of Ethnic Group (IN2-42) at a given index and returns it.
   * @param index The index
   */
  public CWE removeEthnicGroup(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(42, index);
  }

  /**
   * Returns a single repetition of Ethnic Group (IN2-42).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getIn242_EthnicGroup(int rep) throws HL7Exception {
    CWE ret = null;
    try {
        Type t = this.getField(42, rep);
        ret = (CWE)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Ethnic Group (IN2-42).
   */
  public CWE[] getIn242_EthnicGroup() {
     CWE[] ret = null;
    try {
        Type[] t = this.getField(42);  
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
   * Returns a count of the number of repetitions of Ethnic Group (IN2-42).
   */
  public int getIn242_EthnicGroupReps() {
    try {
        return this.getField(42).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Ethnic Group (IN2-42) at a given index and returns it.
   * @param index The index
   */
  public CWE insertIn242_EthnicGroup(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(42, index);
  }

  /**
   * Removes a repetition of Ethnic Group (IN2-42) at a given index and returns it.
   * @param index The index
   */
  public CWE removeIn242_EthnicGroup(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(42, index);
  }

  /**
   * Returns a single repetition of Marital Status (IN2-43).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getMaritalStatus(int rep) throws HL7Exception {
    CWE ret = null;
    try {
        Type t = this.getField(43, rep);
        ret = (CWE)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Marital Status (IN2-43).
   */
  public CWE[] getMaritalStatus() {
     CWE[] ret = null;
    try {
        Type[] t = this.getField(43);  
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
   * Returns a count of the number of repetitions of Marital Status (IN2-43).
   */
  public int getMaritalStatusReps() {
    try {
        return this.getField(43).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Marital Status (IN2-43) at a given index and returns it.
   * @param index The index
   */
  public CWE insertMaritalStatus(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(43, index);
  }

  /**
   * Removes a repetition of Marital Status (IN2-43) at a given index and returns it.
   * @param index The index
   */
  public CWE removeMaritalStatus(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(43, index);
  }

  /**
   * Returns a single repetition of Marital Status (IN2-43).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getIn243_MaritalStatus(int rep) throws HL7Exception {
    CWE ret = null;
    try {
        Type t = this.getField(43, rep);
        ret = (CWE)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Marital Status (IN2-43).
   */
  public CWE[] getIn243_MaritalStatus() {
     CWE[] ret = null;
    try {
        Type[] t = this.getField(43);  
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
   * Returns a count of the number of repetitions of Marital Status (IN2-43).
   */
  public int getIn243_MaritalStatusReps() {
    try {
        return this.getField(43).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Marital Status (IN2-43) at a given index and returns it.
   * @param index The index
   */
  public CWE insertIn243_MaritalStatus(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(43, index);
  }

  /**
   * Removes a repetition of Marital Status (IN2-43) at a given index and returns it.
   * @param index The index
   */
  public CWE removeIn243_MaritalStatus(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(43, index);
  }

  /**
   * Returns Insured's Employment Start Date (IN2-44).
   */
  public DT getInsuredSEmploymentStartDate()  {
    DT ret = null;
    try {
        Type t = this.getField(44, 0);
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
   * Returns Insured's Employment Start Date (IN2-44).
   */
  public DT getIn244_InsuredSEmploymentStartDate()  {
    DT ret = null;
    try {
        Type t = this.getField(44, 0);
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
   * Returns Employment Stop Date (IN2-45).
   */
  public DT getEmploymentStopDate()  {
    DT ret = null;
    try {
        Type t = this.getField(45, 0);
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
   * Returns Employment Stop Date (IN2-45).
   */
  public DT getIn245_EmploymentStopDate()  {
    DT ret = null;
    try {
        Type t = this.getField(45, 0);
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
   * Returns Job Title (IN2-46).
   */
  public ST getJobTitle()  {
    ST ret = null;
    try {
        Type t = this.getField(46, 0);
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
   * Returns Job Title (IN2-46).
   */
  public ST getIn246_JobTitle()  {
    ST ret = null;
    try {
        Type t = this.getField(46, 0);
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
   * Returns Job Code/Class (IN2-47).
   */
  public JCC getJobCodeClass()  {
    JCC ret = null;
    try {
        Type t = this.getField(47, 0);
        ret = (JCC)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns Job Code/Class (IN2-47).
   */
  public JCC getIn247_JobCodeClass()  {
    JCC ret = null;
    try {
        Type t = this.getField(47, 0);
        ret = (JCC)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns Job Status (IN2-48).
   */
  public IS getJobStatus()  {
    IS ret = null;
    try {
        Type t = this.getField(48, 0);
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
   * Returns Job Status (IN2-48).
   */
  public IS getIn248_JobStatus()  {
    IS ret = null;
    try {
        Type t = this.getField(48, 0);
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
   * Returns a single repetition of Employer Contact Person Name (IN2-49).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XPN getEmployerContactPersonName(int rep) throws HL7Exception {
    XPN ret = null;
    try {
        Type t = this.getField(49, rep);
        ret = (XPN)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Employer Contact Person Name (IN2-49).
   */
  public XPN[] getEmployerContactPersonName() {
     XPN[] ret = null;
    try {
        Type[] t = this.getField(49);  
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
   * Returns a count of the number of repetitions of Employer Contact Person Name (IN2-49).
   */
  public int getEmployerContactPersonNameReps() {
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
   * Inserts a repetition of Employer Contact Person Name (IN2-49) at a given index and returns it.
   * @param index The index
   */
  public XPN insertEmployerContactPersonName(int index) throws HL7Exception {
     return (XPN) super.insertRepetition(49, index);
  }

  /**
   * Removes a repetition of Employer Contact Person Name (IN2-49) at a given index and returns it.
   * @param index The index
   */
  public XPN removeEmployerContactPersonName(int index) throws HL7Exception {
     return (XPN) super.removeRepetition(49, index);
  }

  /**
   * Returns a single repetition of Employer Contact Person Name (IN2-49).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XPN getIn249_EmployerContactPersonName(int rep) throws HL7Exception {
    XPN ret = null;
    try {
        Type t = this.getField(49, rep);
        ret = (XPN)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Employer Contact Person Name (IN2-49).
   */
  public XPN[] getIn249_EmployerContactPersonName() {
     XPN[] ret = null;
    try {
        Type[] t = this.getField(49);  
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
   * Returns a count of the number of repetitions of Employer Contact Person Name (IN2-49).
   */
  public int getIn249_EmployerContactPersonNameReps() {
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
   * Inserts a repetition of Employer Contact Person Name (IN2-49) at a given index and returns it.
   * @param index The index
   */
  public XPN insertIn249_EmployerContactPersonName(int index) throws HL7Exception {
     return (XPN) super.insertRepetition(49, index);
  }

  /**
   * Removes a repetition of Employer Contact Person Name (IN2-49) at a given index and returns it.
   * @param index The index
   */
  public XPN removeIn249_EmployerContactPersonName(int index) throws HL7Exception {
     return (XPN) super.removeRepetition(49, index);
  }

  /**
   * Returns a single repetition of Employer Contact Person Phone Number (IN2-50).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XTN getEmployerContactPersonPhoneNumber(int rep) throws HL7Exception {
    XTN ret = null;
    try {
        Type t = this.getField(50, rep);
        ret = (XTN)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Employer Contact Person Phone Number (IN2-50).
   */
  public XTN[] getEmployerContactPersonPhoneNumber() {
     XTN[] ret = null;
    try {
        Type[] t = this.getField(50);  
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
   * Returns a count of the number of repetitions of Employer Contact Person Phone Number (IN2-50).
   */
  public int getEmployerContactPersonPhoneNumberReps() {
    try {
        return this.getField(50).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Employer Contact Person Phone Number (IN2-50) at a given index and returns it.
   * @param index The index
   */
  public XTN insertEmployerContactPersonPhoneNumber(int index) throws HL7Exception {
     return (XTN) super.insertRepetition(50, index);
  }

  /**
   * Removes a repetition of Employer Contact Person Phone Number (IN2-50) at a given index and returns it.
   * @param index The index
   */
  public XTN removeEmployerContactPersonPhoneNumber(int index) throws HL7Exception {
     return (XTN) super.removeRepetition(50, index);
  }

  /**
   * Returns a single repetition of Employer Contact Person Phone Number (IN2-50).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XTN getIn250_EmployerContactPersonPhoneNumber(int rep) throws HL7Exception {
    XTN ret = null;
    try {
        Type t = this.getField(50, rep);
        ret = (XTN)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Employer Contact Person Phone Number (IN2-50).
   */
  public XTN[] getIn250_EmployerContactPersonPhoneNumber() {
     XTN[] ret = null;
    try {
        Type[] t = this.getField(50);  
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
   * Returns a count of the number of repetitions of Employer Contact Person Phone Number (IN2-50).
   */
  public int getIn250_EmployerContactPersonPhoneNumberReps() {
    try {
        return this.getField(50).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Employer Contact Person Phone Number (IN2-50) at a given index and returns it.
   * @param index The index
   */
  public XTN insertIn250_EmployerContactPersonPhoneNumber(int index) throws HL7Exception {
     return (XTN) super.insertRepetition(50, index);
  }

  /**
   * Removes a repetition of Employer Contact Person Phone Number (IN2-50) at a given index and returns it.
   * @param index The index
   */
  public XTN removeIn250_EmployerContactPersonPhoneNumber(int index) throws HL7Exception {
     return (XTN) super.removeRepetition(50, index);
  }

  /**
   * Returns Employer Contact Reason (IN2-51).
   */
  public IS getEmployerContactReason()  {
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
   * Returns Employer Contact Reason (IN2-51).
   */
  public IS getIn251_EmployerContactReason()  {
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
   * Returns a single repetition of Insured's Contact Person's Name (IN2-52).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XPN getInsuredSContactPersonSName(int rep) throws HL7Exception {
    XPN ret = null;
    try {
        Type t = this.getField(52, rep);
        ret = (XPN)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Insured's Contact Person's Name (IN2-52).
   */
  public XPN[] getInsuredSContactPersonSName() {
     XPN[] ret = null;
    try {
        Type[] t = this.getField(52);  
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
   * Returns a count of the number of repetitions of Insured's Contact Person's Name (IN2-52).
   */
  public int getInsuredSContactPersonSNameReps() {
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
   * Inserts a repetition of Insured's Contact Person's Name (IN2-52) at a given index and returns it.
   * @param index The index
   */
  public XPN insertInsuredSContactPersonSName(int index) throws HL7Exception {
     return (XPN) super.insertRepetition(52, index);
  }

  /**
   * Removes a repetition of Insured's Contact Person's Name (IN2-52) at a given index and returns it.
   * @param index The index
   */
  public XPN removeInsuredSContactPersonSName(int index) throws HL7Exception {
     return (XPN) super.removeRepetition(52, index);
  }

  /**
   * Returns a single repetition of Insured's Contact Person's Name (IN2-52).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XPN getIn252_InsuredSContactPersonSName(int rep) throws HL7Exception {
    XPN ret = null;
    try {
        Type t = this.getField(52, rep);
        ret = (XPN)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Insured's Contact Person's Name (IN2-52).
   */
  public XPN[] getIn252_InsuredSContactPersonSName() {
     XPN[] ret = null;
    try {
        Type[] t = this.getField(52);  
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
   * Returns a count of the number of repetitions of Insured's Contact Person's Name (IN2-52).
   */
  public int getIn252_InsuredSContactPersonSNameReps() {
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
   * Inserts a repetition of Insured's Contact Person's Name (IN2-52) at a given index and returns it.
   * @param index The index
   */
  public XPN insertIn252_InsuredSContactPersonSName(int index) throws HL7Exception {
     return (XPN) super.insertRepetition(52, index);
  }

  /**
   * Removes a repetition of Insured's Contact Person's Name (IN2-52) at a given index and returns it.
   * @param index The index
   */
  public XPN removeIn252_InsuredSContactPersonSName(int index) throws HL7Exception {
     return (XPN) super.removeRepetition(52, index);
  }

  /**
   * Returns a single repetition of Insured's Contact Person Phone Number (IN2-53).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XTN getInsuredSContactPersonPhoneNumber(int rep) throws HL7Exception {
    XTN ret = null;
    try {
        Type t = this.getField(53, rep);
        ret = (XTN)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Insured's Contact Person Phone Number (IN2-53).
   */
  public XTN[] getInsuredSContactPersonPhoneNumber() {
     XTN[] ret = null;
    try {
        Type[] t = this.getField(53);  
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
   * Returns a count of the number of repetitions of Insured's Contact Person Phone Number (IN2-53).
   */
  public int getInsuredSContactPersonPhoneNumberReps() {
    try {
        return this.getField(53).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Insured's Contact Person Phone Number (IN2-53) at a given index and returns it.
   * @param index The index
   */
  public XTN insertInsuredSContactPersonPhoneNumber(int index) throws HL7Exception {
     return (XTN) super.insertRepetition(53, index);
  }

  /**
   * Removes a repetition of Insured's Contact Person Phone Number (IN2-53) at a given index and returns it.
   * @param index The index
   */
  public XTN removeInsuredSContactPersonPhoneNumber(int index) throws HL7Exception {
     return (XTN) super.removeRepetition(53, index);
  }

  /**
   * Returns a single repetition of Insured's Contact Person Phone Number (IN2-53).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XTN getIn253_InsuredSContactPersonPhoneNumber(int rep) throws HL7Exception {
    XTN ret = null;
    try {
        Type t = this.getField(53, rep);
        ret = (XTN)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Insured's Contact Person Phone Number (IN2-53).
   */
  public XTN[] getIn253_InsuredSContactPersonPhoneNumber() {
     XTN[] ret = null;
    try {
        Type[] t = this.getField(53);  
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
   * Returns a count of the number of repetitions of Insured's Contact Person Phone Number (IN2-53).
   */
  public int getIn253_InsuredSContactPersonPhoneNumberReps() {
    try {
        return this.getField(53).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Insured's Contact Person Phone Number (IN2-53) at a given index and returns it.
   * @param index The index
   */
  public XTN insertIn253_InsuredSContactPersonPhoneNumber(int index) throws HL7Exception {
     return (XTN) super.insertRepetition(53, index);
  }

  /**
   * Removes a repetition of Insured's Contact Person Phone Number (IN2-53) at a given index and returns it.
   * @param index The index
   */
  public XTN removeIn253_InsuredSContactPersonPhoneNumber(int index) throws HL7Exception {
     return (XTN) super.removeRepetition(53, index);
  }

  /**
   * Returns a single repetition of Insured's Contact Person Reason (IN2-54).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public IS getInsuredSContactPersonReason(int rep) throws HL7Exception {
    IS ret = null;
    try {
        Type t = this.getField(54, rep);
        ret = (IS)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Insured's Contact Person Reason (IN2-54).
   */
  public IS[] getInsuredSContactPersonReason() {
     IS[] ret = null;
    try {
        Type[] t = this.getField(54);  
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
   * Returns a count of the number of repetitions of Insured's Contact Person Reason (IN2-54).
   */
  public int getInsuredSContactPersonReasonReps() {
    try {
        return this.getField(54).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Insured's Contact Person Reason (IN2-54) at a given index and returns it.
   * @param index The index
   */
  public IS insertInsuredSContactPersonReason(int index) throws HL7Exception {
     return (IS) super.insertRepetition(54, index);
  }

  /**
   * Removes a repetition of Insured's Contact Person Reason (IN2-54) at a given index and returns it.
   * @param index The index
   */
  public IS removeInsuredSContactPersonReason(int index) throws HL7Exception {
     return (IS) super.removeRepetition(54, index);
  }

  /**
   * Returns a single repetition of Insured's Contact Person Reason (IN2-54).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public IS getIn254_InsuredSContactPersonReason(int rep) throws HL7Exception {
    IS ret = null;
    try {
        Type t = this.getField(54, rep);
        ret = (IS)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Insured's Contact Person Reason (IN2-54).
   */
  public IS[] getIn254_InsuredSContactPersonReason() {
     IS[] ret = null;
    try {
        Type[] t = this.getField(54);  
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
   * Returns a count of the number of repetitions of Insured's Contact Person Reason (IN2-54).
   */
  public int getIn254_InsuredSContactPersonReasonReps() {
    try {
        return this.getField(54).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Insured's Contact Person Reason (IN2-54) at a given index and returns it.
   * @param index The index
   */
  public IS insertIn254_InsuredSContactPersonReason(int index) throws HL7Exception {
     return (IS) super.insertRepetition(54, index);
  }

  /**
   * Removes a repetition of Insured's Contact Person Reason (IN2-54) at a given index and returns it.
   * @param index The index
   */
  public IS removeIn254_InsuredSContactPersonReason(int index) throws HL7Exception {
     return (IS) super.removeRepetition(54, index);
  }

  /**
   * Returns Relationship to the Patient Start Date (IN2-55).
   */
  public DT getRelationshipToThePatientStartDate()  {
    DT ret = null;
    try {
        Type t = this.getField(55, 0);
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
   * Returns Relationship to the Patient Start Date (IN2-55).
   */
  public DT getIn255_RelationshipToThePatientStartDate()  {
    DT ret = null;
    try {
        Type t = this.getField(55, 0);
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
   * Returns a single repetition of Relationship to the Patient Stop Date (IN2-56).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public DT getRelationshipToThePatientStopDate(int rep) throws HL7Exception {
    DT ret = null;
    try {
        Type t = this.getField(56, rep);
        ret = (DT)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Relationship to the Patient Stop Date (IN2-56).
   */
  public DT[] getRelationshipToThePatientStopDate() {
     DT[] ret = null;
    try {
        Type[] t = this.getField(56);  
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
   * Returns a count of the number of repetitions of Relationship to the Patient Stop Date (IN2-56).
   */
  public int getRelationshipToThePatientStopDateReps() {
    try {
        return this.getField(56).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Relationship to the Patient Stop Date (IN2-56) at a given index and returns it.
   * @param index The index
   */
  public DT insertRelationshipToThePatientStopDate(int index) throws HL7Exception {
     return (DT) super.insertRepetition(56, index);
  }

  /**
   * Removes a repetition of Relationship to the Patient Stop Date (IN2-56) at a given index and returns it.
   * @param index The index
   */
  public DT removeRelationshipToThePatientStopDate(int index) throws HL7Exception {
     return (DT) super.removeRepetition(56, index);
  }

  /**
   * Returns a single repetition of Relationship to the Patient Stop Date (IN2-56).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public DT getIn256_RelationshipToThePatientStopDate(int rep) throws HL7Exception {
    DT ret = null;
    try {
        Type t = this.getField(56, rep);
        ret = (DT)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Relationship to the Patient Stop Date (IN2-56).
   */
  public DT[] getIn256_RelationshipToThePatientStopDate() {
     DT[] ret = null;
    try {
        Type[] t = this.getField(56);  
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
   * Returns a count of the number of repetitions of Relationship to the Patient Stop Date (IN2-56).
   */
  public int getIn256_RelationshipToThePatientStopDateReps() {
    try {
        return this.getField(56).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Relationship to the Patient Stop Date (IN2-56) at a given index and returns it.
   * @param index The index
   */
  public DT insertIn256_RelationshipToThePatientStopDate(int index) throws HL7Exception {
     return (DT) super.insertRepetition(56, index);
  }

  /**
   * Removes a repetition of Relationship to the Patient Stop Date (IN2-56) at a given index and returns it.
   * @param index The index
   */
  public DT removeIn256_RelationshipToThePatientStopDate(int index) throws HL7Exception {
     return (DT) super.removeRepetition(56, index);
  }

  /**
   * Returns Insurance Co Contact Reason (IN2-57).
   */
  public IS getInsuranceCoContactReason()  {
    IS ret = null;
    try {
        Type t = this.getField(57, 0);
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
   * Returns Insurance Co Contact Reason (IN2-57).
   */
  public IS getIn257_InsuranceCoContactReason()  {
    IS ret = null;
    try {
        Type t = this.getField(57, 0);
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
   * Returns a single repetition of Insurance Co Contact Phone Number (IN2-58).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XTN getInsuranceCoContactPhoneNumber(int rep) throws HL7Exception {
    XTN ret = null;
    try {
        Type t = this.getField(58, rep);
        ret = (XTN)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Insurance Co Contact Phone Number (IN2-58).
   */
  public XTN[] getInsuranceCoContactPhoneNumber() {
     XTN[] ret = null;
    try {
        Type[] t = this.getField(58);  
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
   * Returns a count of the number of repetitions of Insurance Co Contact Phone Number (IN2-58).
   */
  public int getInsuranceCoContactPhoneNumberReps() {
    try {
        return this.getField(58).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Insurance Co Contact Phone Number (IN2-58) at a given index and returns it.
   * @param index The index
   */
  public XTN insertInsuranceCoContactPhoneNumber(int index) throws HL7Exception {
     return (XTN) super.insertRepetition(58, index);
  }

  /**
   * Removes a repetition of Insurance Co Contact Phone Number (IN2-58) at a given index and returns it.
   * @param index The index
   */
  public XTN removeInsuranceCoContactPhoneNumber(int index) throws HL7Exception {
     return (XTN) super.removeRepetition(58, index);
  }

  /**
   * Returns a single repetition of Insurance Co Contact Phone Number (IN2-58).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XTN getIn258_InsuranceCoContactPhoneNumber(int rep) throws HL7Exception {
    XTN ret = null;
    try {
        Type t = this.getField(58, rep);
        ret = (XTN)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Insurance Co Contact Phone Number (IN2-58).
   */
  public XTN[] getIn258_InsuranceCoContactPhoneNumber() {
     XTN[] ret = null;
    try {
        Type[] t = this.getField(58);  
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
   * Returns a count of the number of repetitions of Insurance Co Contact Phone Number (IN2-58).
   */
  public int getIn258_InsuranceCoContactPhoneNumberReps() {
    try {
        return this.getField(58).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Insurance Co Contact Phone Number (IN2-58) at a given index and returns it.
   * @param index The index
   */
  public XTN insertIn258_InsuranceCoContactPhoneNumber(int index) throws HL7Exception {
     return (XTN) super.insertRepetition(58, index);
  }

  /**
   * Removes a repetition of Insurance Co Contact Phone Number (IN2-58) at a given index and returns it.
   * @param index The index
   */
  public XTN removeIn258_InsuranceCoContactPhoneNumber(int index) throws HL7Exception {
     return (XTN) super.removeRepetition(58, index);
  }

  /**
   * Returns Policy Scope (IN2-59).
   */
  public IS getPolicyScope()  {
    IS ret = null;
    try {
        Type t = this.getField(59, 0);
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
   * Returns Policy Scope (IN2-59).
   */
  public IS getIn259_PolicyScope()  {
    IS ret = null;
    try {
        Type t = this.getField(59, 0);
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
   * Returns Policy Source (IN2-60).
   */
  public IS getPolicySource()  {
    IS ret = null;
    try {
        Type t = this.getField(60, 0);
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
   * Returns Policy Source (IN2-60).
   */
  public IS getIn260_PolicySource()  {
    IS ret = null;
    try {
        Type t = this.getField(60, 0);
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
   * Returns Patient Member Number (IN2-61).
   */
  public CX getPatientMemberNumber()  {
    CX ret = null;
    try {
        Type t = this.getField(61, 0);
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
   * Returns Patient Member Number (IN2-61).
   */
  public CX getIn261_PatientMemberNumber()  {
    CX ret = null;
    try {
        Type t = this.getField(61, 0);
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
   * Returns Guarantor's Relationship to Insured (IN2-62).
   */
  public CWE getGuarantorSRelationshipToInsured()  {
    CWE ret = null;
    try {
        Type t = this.getField(62, 0);
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
   * Returns Guarantor's Relationship to Insured (IN2-62).
   */
  public CWE getIn262_GuarantorSRelationshipToInsured()  {
    CWE ret = null;
    try {
        Type t = this.getField(62, 0);
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
   * Returns a single repetition of Insured's Phone Number - Home (IN2-63).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XTN getInsuredSPhoneNumberHome(int rep) throws HL7Exception {
    XTN ret = null;
    try {
        Type t = this.getField(63, rep);
        ret = (XTN)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Insured's Phone Number - Home (IN2-63).
   */
  public XTN[] getInsuredSPhoneNumberHome() {
     XTN[] ret = null;
    try {
        Type[] t = this.getField(63);  
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
   * Returns a count of the number of repetitions of Insured's Phone Number - Home (IN2-63).
   */
  public int getInsuredSPhoneNumberHomeReps() {
    try {
        return this.getField(63).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Insured's Phone Number - Home (IN2-63) at a given index and returns it.
   * @param index The index
   */
  public XTN insertInsuredSPhoneNumberHome(int index) throws HL7Exception {
     return (XTN) super.insertRepetition(63, index);
  }

  /**
   * Removes a repetition of Insured's Phone Number - Home (IN2-63) at a given index and returns it.
   * @param index The index
   */
  public XTN removeInsuredSPhoneNumberHome(int index) throws HL7Exception {
     return (XTN) super.removeRepetition(63, index);
  }

  /**
   * Returns a single repetition of Insured's Phone Number - Home (IN2-63).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XTN getIn263_InsuredSPhoneNumberHome(int rep) throws HL7Exception {
    XTN ret = null;
    try {
        Type t = this.getField(63, rep);
        ret = (XTN)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Insured's Phone Number - Home (IN2-63).
   */
  public XTN[] getIn263_InsuredSPhoneNumberHome() {
     XTN[] ret = null;
    try {
        Type[] t = this.getField(63);  
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
   * Returns a count of the number of repetitions of Insured's Phone Number - Home (IN2-63).
   */
  public int getIn263_InsuredSPhoneNumberHomeReps() {
    try {
        return this.getField(63).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Insured's Phone Number - Home (IN2-63) at a given index and returns it.
   * @param index The index
   */
  public XTN insertIn263_InsuredSPhoneNumberHome(int index) throws HL7Exception {
     return (XTN) super.insertRepetition(63, index);
  }

  /**
   * Removes a repetition of Insured's Phone Number - Home (IN2-63) at a given index and returns it.
   * @param index The index
   */
  public XTN removeIn263_InsuredSPhoneNumberHome(int index) throws HL7Exception {
     return (XTN) super.removeRepetition(63, index);
  }

  /**
   * Returns a single repetition of Insured's Employer Phone Number (IN2-64).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XTN getInsuredSEmployerPhoneNumber(int rep) throws HL7Exception {
    XTN ret = null;
    try {
        Type t = this.getField(64, rep);
        ret = (XTN)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Insured's Employer Phone Number (IN2-64).
   */
  public XTN[] getInsuredSEmployerPhoneNumber() {
     XTN[] ret = null;
    try {
        Type[] t = this.getField(64);  
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
   * Returns a count of the number of repetitions of Insured's Employer Phone Number (IN2-64).
   */
  public int getInsuredSEmployerPhoneNumberReps() {
    try {
        return this.getField(64).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Insured's Employer Phone Number (IN2-64) at a given index and returns it.
   * @param index The index
   */
  public XTN insertInsuredSEmployerPhoneNumber(int index) throws HL7Exception {
     return (XTN) super.insertRepetition(64, index);
  }

  /**
   * Removes a repetition of Insured's Employer Phone Number (IN2-64) at a given index and returns it.
   * @param index The index
   */
  public XTN removeInsuredSEmployerPhoneNumber(int index) throws HL7Exception {
     return (XTN) super.removeRepetition(64, index);
  }

  /**
   * Returns a single repetition of Insured's Employer Phone Number (IN2-64).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XTN getIn264_InsuredSEmployerPhoneNumber(int rep) throws HL7Exception {
    XTN ret = null;
    try {
        Type t = this.getField(64, rep);
        ret = (XTN)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Insured's Employer Phone Number (IN2-64).
   */
  public XTN[] getIn264_InsuredSEmployerPhoneNumber() {
     XTN[] ret = null;
    try {
        Type[] t = this.getField(64);  
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
   * Returns a count of the number of repetitions of Insured's Employer Phone Number (IN2-64).
   */
  public int getIn264_InsuredSEmployerPhoneNumberReps() {
    try {
        return this.getField(64).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Insured's Employer Phone Number (IN2-64) at a given index and returns it.
   * @param index The index
   */
  public XTN insertIn264_InsuredSEmployerPhoneNumber(int index) throws HL7Exception {
     return (XTN) super.insertRepetition(64, index);
  }

  /**
   * Removes a repetition of Insured's Employer Phone Number (IN2-64) at a given index and returns it.
   * @param index The index
   */
  public XTN removeIn264_InsuredSEmployerPhoneNumber(int index) throws HL7Exception {
     return (XTN) super.removeRepetition(64, index);
  }

  /**
   * Returns Military Handicapped Program (IN2-65).
   */
  public CWE getMilitaryHandicappedProgram()  {
    CWE ret = null;
    try {
        Type t = this.getField(65, 0);
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
   * Returns Military Handicapped Program (IN2-65).
   */
  public CWE getIn265_MilitaryHandicappedProgram()  {
    CWE ret = null;
    try {
        Type t = this.getField(65, 0);
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
   * Returns Suspend Flag (IN2-66).
   */
  public ID getSuspendFlag()  {
    ID ret = null;
    try {
        Type t = this.getField(66, 0);
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
   * Returns Suspend Flag (IN2-66).
   */
  public ID getIn266_SuspendFlag()  {
    ID ret = null;
    try {
        Type t = this.getField(66, 0);
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
   * Returns Copay Limit Flag (IN2-67).
   */
  public ID getCopayLimitFlag()  {
    ID ret = null;
    try {
        Type t = this.getField(67, 0);
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
   * Returns Copay Limit Flag (IN2-67).
   */
  public ID getIn267_CopayLimitFlag()  {
    ID ret = null;
    try {
        Type t = this.getField(67, 0);
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
   * Returns Stoploss Limit Flag (IN2-68).
   */
  public ID getStoplossLimitFlag()  {
    ID ret = null;
    try {
        Type t = this.getField(68, 0);
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
   * Returns Stoploss Limit Flag (IN2-68).
   */
  public ID getIn268_StoplossLimitFlag()  {
    ID ret = null;
    try {
        Type t = this.getField(68, 0);
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
   * Returns a single repetition of Insured Organization Name and ID (IN2-69).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XON getInsuredOrganizationNameAndID(int rep) throws HL7Exception {
    XON ret = null;
    try {
        Type t = this.getField(69, rep);
        ret = (XON)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Insured Organization Name and ID (IN2-69).
   */
  public XON[] getInsuredOrganizationNameAndID() {
     XON[] ret = null;
    try {
        Type[] t = this.getField(69);  
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
   * Returns a count of the number of repetitions of Insured Organization Name and ID (IN2-69).
   */
  public int getInsuredOrganizationNameAndIDReps() {
    try {
        return this.getField(69).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Insured Organization Name and ID (IN2-69) at a given index and returns it.
   * @param index The index
   */
  public XON insertInsuredOrganizationNameAndID(int index) throws HL7Exception {
     return (XON) super.insertRepetition(69, index);
  }

  /**
   * Removes a repetition of Insured Organization Name and ID (IN2-69) at a given index and returns it.
   * @param index The index
   */
  public XON removeInsuredOrganizationNameAndID(int index) throws HL7Exception {
     return (XON) super.removeRepetition(69, index);
  }

  /**
   * Returns a single repetition of Insured Organization Name and ID (IN2-69).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XON getIn269_InsuredOrganizationNameAndID(int rep) throws HL7Exception {
    XON ret = null;
    try {
        Type t = this.getField(69, rep);
        ret = (XON)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Insured Organization Name and ID (IN2-69).
   */
  public XON[] getIn269_InsuredOrganizationNameAndID() {
     XON[] ret = null;
    try {
        Type[] t = this.getField(69);  
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
   * Returns a count of the number of repetitions of Insured Organization Name and ID (IN2-69).
   */
  public int getIn269_InsuredOrganizationNameAndIDReps() {
    try {
        return this.getField(69).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Insured Organization Name and ID (IN2-69) at a given index and returns it.
   * @param index The index
   */
  public XON insertIn269_InsuredOrganizationNameAndID(int index) throws HL7Exception {
     return (XON) super.insertRepetition(69, index);
  }

  /**
   * Removes a repetition of Insured Organization Name and ID (IN2-69) at a given index and returns it.
   * @param index The index
   */
  public XON removeIn269_InsuredOrganizationNameAndID(int index) throws HL7Exception {
     return (XON) super.removeRepetition(69, index);
  }

  /**
   * Returns a single repetition of Insured Employer Organization Name and ID (IN2-70).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XON getInsuredEmployerOrganizationNameAndID(int rep) throws HL7Exception {
    XON ret = null;
    try {
        Type t = this.getField(70, rep);
        ret = (XON)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Insured Employer Organization Name and ID (IN2-70).
   */
  public XON[] getInsuredEmployerOrganizationNameAndID() {
     XON[] ret = null;
    try {
        Type[] t = this.getField(70);  
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
   * Returns a count of the number of repetitions of Insured Employer Organization Name and ID (IN2-70).
   */
  public int getInsuredEmployerOrganizationNameAndIDReps() {
    try {
        return this.getField(70).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Insured Employer Organization Name and ID (IN2-70) at a given index and returns it.
   * @param index The index
   */
  public XON insertInsuredEmployerOrganizationNameAndID(int index) throws HL7Exception {
     return (XON) super.insertRepetition(70, index);
  }

  /**
   * Removes a repetition of Insured Employer Organization Name and ID (IN2-70) at a given index and returns it.
   * @param index The index
   */
  public XON removeInsuredEmployerOrganizationNameAndID(int index) throws HL7Exception {
     return (XON) super.removeRepetition(70, index);
  }

  /**
   * Returns a single repetition of Insured Employer Organization Name and ID (IN2-70).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XON getIn270_InsuredEmployerOrganizationNameAndID(int rep) throws HL7Exception {
    XON ret = null;
    try {
        Type t = this.getField(70, rep);
        ret = (XON)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Insured Employer Organization Name and ID (IN2-70).
   */
  public XON[] getIn270_InsuredEmployerOrganizationNameAndID() {
     XON[] ret = null;
    try {
        Type[] t = this.getField(70);  
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
   * Returns a count of the number of repetitions of Insured Employer Organization Name and ID (IN2-70).
   */
  public int getIn270_InsuredEmployerOrganizationNameAndIDReps() {
    try {
        return this.getField(70).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Insured Employer Organization Name and ID (IN2-70) at a given index and returns it.
   * @param index The index
   */
  public XON insertIn270_InsuredEmployerOrganizationNameAndID(int index) throws HL7Exception {
     return (XON) super.insertRepetition(70, index);
  }

  /**
   * Removes a repetition of Insured Employer Organization Name and ID (IN2-70) at a given index and returns it.
   * @param index The index
   */
  public XON removeIn270_InsuredEmployerOrganizationNameAndID(int index) throws HL7Exception {
     return (XON) super.removeRepetition(70, index);
  }

  /**
   * Returns a single repetition of Race (IN2-71).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getRace(int rep) throws HL7Exception {
    CWE ret = null;
    try {
        Type t = this.getField(71, rep);
        ret = (CWE)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Race (IN2-71).
   */
  public CWE[] getRace() {
     CWE[] ret = null;
    try {
        Type[] t = this.getField(71);  
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
   * Returns a count of the number of repetitions of Race (IN2-71).
   */
  public int getRaceReps() {
    try {
        return this.getField(71).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Race (IN2-71) at a given index and returns it.
   * @param index The index
   */
  public CWE insertRace(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(71, index);
  }

  /**
   * Removes a repetition of Race (IN2-71) at a given index and returns it.
   * @param index The index
   */
  public CWE removeRace(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(71, index);
  }

  /**
   * Returns a single repetition of Race (IN2-71).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getIn271_Race(int rep) throws HL7Exception {
    CWE ret = null;
    try {
        Type t = this.getField(71, rep);
        ret = (CWE)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Race (IN2-71).
   */
  public CWE[] getIn271_Race() {
     CWE[] ret = null;
    try {
        Type[] t = this.getField(71);  
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
   * Returns a count of the number of repetitions of Race (IN2-71).
   */
  public int getIn271_RaceReps() {
    try {
        return this.getField(71).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Race (IN2-71) at a given index and returns it.
   * @param index The index
   */
  public CWE insertIn271_Race(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(71, index);
  }

  /**
   * Removes a repetition of Race (IN2-71) at a given index and returns it.
   * @param index The index
   */
  public CWE removeIn271_Race(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(71, index);
  }

  /**
   * Returns Patient's Relationship to Insured (IN2-72).
   */
  public CWE getPatientSRelationshipToInsured()  {
    CWE ret = null;
    try {
        Type t = this.getField(72, 0);
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
   * Returns Patient's Relationship to Insured (IN2-72).
   */
  public CWE getIn272_PatientSRelationshipToInsured()  {
    CWE ret = null;
    try {
        Type t = this.getField(72, 0);
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
         case 0: return new ca.uhn.hl7v2.model.v26.datatype.CX(getMessage());
         case 1: return new ca.uhn.hl7v2.model.v26.datatype.ST(getMessage());
         case 2: return new ca.uhn.hl7v2.model.v26.datatype.XCN(getMessage());
         case 3: return new ca.uhn.hl7v2.model.v26.datatype.IS(getMessage(), new Integer(139));
         case 4: return new ca.uhn.hl7v2.model.v26.datatype.IS(getMessage(), new Integer(137));
         case 5: return new ca.uhn.hl7v2.model.v26.datatype.ST(getMessage());
         case 6: return new ca.uhn.hl7v2.model.v26.datatype.XPN(getMessage());
         case 7: return new ca.uhn.hl7v2.model.v26.datatype.ST(getMessage());
         case 8: return new ca.uhn.hl7v2.model.v26.datatype.XPN(getMessage());
         case 9: return new ca.uhn.hl7v2.model.v26.datatype.ST(getMessage());
         case 10: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 11: return new ca.uhn.hl7v2.model.v26.datatype.ST(getMessage());
         case 12: return new ca.uhn.hl7v2.model.v26.datatype.ST(getMessage());
         case 13: return new ca.uhn.hl7v2.model.v26.datatype.IS(getMessage(), new Integer(140));
         case 14: return new ca.uhn.hl7v2.model.v26.datatype.IS(getMessage(), new Integer(141));
         case 15: return new ca.uhn.hl7v2.model.v26.datatype.IS(getMessage(), new Integer(142));
         case 16: return new ca.uhn.hl7v2.model.v26.datatype.DT(getMessage());
         case 17: return new ca.uhn.hl7v2.model.v26.datatype.ID(getMessage(), new Integer(136));
         case 18: return new ca.uhn.hl7v2.model.v26.datatype.ID(getMessage(), new Integer(136));
         case 19: return new ca.uhn.hl7v2.model.v26.datatype.ID(getMessage(), new Integer(136));
         case 20: return new ca.uhn.hl7v2.model.v26.datatype.ST(getMessage());
         case 21: return new ca.uhn.hl7v2.model.v26.datatype.XPN(getMessage());
         case 22: return new ca.uhn.hl7v2.model.v26.datatype.ST(getMessage());
         case 23: return new ca.uhn.hl7v2.model.v26.datatype.IS(getMessage(), new Integer(143));
         case 24: return new ca.uhn.hl7v2.model.v26.datatype.CX(getMessage());
         case 25: return new ca.uhn.hl7v2.model.v26.datatype.CX(getMessage());
         case 26: return new ca.uhn.hl7v2.model.v26.datatype.IS(getMessage(), new Integer(144));
         case 27: return new ca.uhn.hl7v2.model.v26.datatype.RMC(getMessage());
         case 28: return new ca.uhn.hl7v2.model.v26.datatype.PTA(getMessage());
         case 29: return new ca.uhn.hl7v2.model.v26.datatype.DDI(getMessage());
         case 30: return new ca.uhn.hl7v2.model.v26.datatype.IS(getMessage(), new Integer(223));
         case 31: return new ca.uhn.hl7v2.model.v26.datatype.IS(getMessage(), new Integer(9));
         case 32: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 33: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 34: return new ca.uhn.hl7v2.model.v26.datatype.IS(getMessage(), new Integer(220));
         case 35: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 36: return new ca.uhn.hl7v2.model.v26.datatype.ID(getMessage(), new Integer(136));
         case 37: return new ca.uhn.hl7v2.model.v26.datatype.IS(getMessage(), new Integer(231));
         case 38: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 39: return new ca.uhn.hl7v2.model.v26.datatype.XPN(getMessage());
         case 40: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 41: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 42: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 43: return new ca.uhn.hl7v2.model.v26.datatype.DT(getMessage());
         case 44: return new ca.uhn.hl7v2.model.v26.datatype.DT(getMessage());
         case 45: return new ca.uhn.hl7v2.model.v26.datatype.ST(getMessage());
         case 46: return new ca.uhn.hl7v2.model.v26.datatype.JCC(getMessage());
         case 47: return new ca.uhn.hl7v2.model.v26.datatype.IS(getMessage(), new Integer(311));
         case 48: return new ca.uhn.hl7v2.model.v26.datatype.XPN(getMessage());
         case 49: return new ca.uhn.hl7v2.model.v26.datatype.XTN(getMessage());
         case 50: return new ca.uhn.hl7v2.model.v26.datatype.IS(getMessage(), new Integer(222));
         case 51: return new ca.uhn.hl7v2.model.v26.datatype.XPN(getMessage());
         case 52: return new ca.uhn.hl7v2.model.v26.datatype.XTN(getMessage());
         case 53: return new ca.uhn.hl7v2.model.v26.datatype.IS(getMessage(), new Integer(222));
         case 54: return new ca.uhn.hl7v2.model.v26.datatype.DT(getMessage());
         case 55: return new ca.uhn.hl7v2.model.v26.datatype.DT(getMessage());
         case 56: return new ca.uhn.hl7v2.model.v26.datatype.IS(getMessage(), new Integer(232));
         case 57: return new ca.uhn.hl7v2.model.v26.datatype.XTN(getMessage());
         case 58: return new ca.uhn.hl7v2.model.v26.datatype.IS(getMessage(), new Integer(312));
         case 59: return new ca.uhn.hl7v2.model.v26.datatype.IS(getMessage(), new Integer(313));
         case 60: return new ca.uhn.hl7v2.model.v26.datatype.CX(getMessage());
         case 61: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 62: return new ca.uhn.hl7v2.model.v26.datatype.XTN(getMessage());
         case 63: return new ca.uhn.hl7v2.model.v26.datatype.XTN(getMessage());
         case 64: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 65: return new ca.uhn.hl7v2.model.v26.datatype.ID(getMessage(), new Integer(136));
         case 66: return new ca.uhn.hl7v2.model.v26.datatype.ID(getMessage(), new Integer(136));
         case 67: return new ca.uhn.hl7v2.model.v26.datatype.ID(getMessage(), new Integer(136));
         case 68: return new ca.uhn.hl7v2.model.v26.datatype.XON(getMessage());
         case 69: return new ca.uhn.hl7v2.model.v26.datatype.XON(getMessage());
         case 70: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 71: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         default: return null;
      }
   }

}