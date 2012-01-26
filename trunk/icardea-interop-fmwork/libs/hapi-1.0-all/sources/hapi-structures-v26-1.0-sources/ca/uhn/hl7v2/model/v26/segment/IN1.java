package ca.uhn.hl7v2.model.v26.segment;

import ca.uhn.hl7v2.model.*;
import ca.uhn.hl7v2.model.v26.datatype.*;
import ca.uhn.log.HapiLogFactory;
import ca.uhn.hl7v2.parser.ModelClassFactory;
import ca.uhn.hl7v2.HL7Exception;

/**
 * <p>Represents an HL7 IN1 message segment. 
 * This segment has the following fields:</p><p>
 * IN1-1: Set ID - IN1 (SI)<br> 
 * IN1-2: Insurance Plan ID (CWE)<br> 
 * IN1-3: Insurance Company ID (CX)<br> 
 * IN1-4: Insurance Company Name (XON)<br> 
 * IN1-5: Insurance Company Address (XAD)<br> 
 * IN1-6: Insurance Co Contact Person (XPN)<br> 
 * IN1-7: Insurance Co Phone Number (XTN)<br> 
 * IN1-8: Group Number (ST)<br> 
 * IN1-9: Group Name (XON)<br> 
 * IN1-10: Insured's Group Emp ID (CX)<br> 
 * IN1-11: Insured's Group Emp Name (XON)<br> 
 * IN1-12: Plan Effective Date (DT)<br> 
 * IN1-13: Plan Expiration Date (DT)<br> 
 * IN1-14: Authorization Information (AUI)<br> 
 * IN1-15: Plan Type (IS)<br> 
 * IN1-16: Name Of Insured (XPN)<br> 
 * IN1-17: Insured's Relationship To Patient (CWE)<br> 
 * IN1-18: Insured's Date Of Birth (DTM)<br> 
 * IN1-19: Insured's Address (XAD)<br> 
 * IN1-20: Assignment Of Benefits (IS)<br> 
 * IN1-21: Coordination Of Benefits (IS)<br> 
 * IN1-22: Coord Of Ben. Priority (ST)<br> 
 * IN1-23: Notice Of Admission Flag (ID)<br> 
 * IN1-24: Notice Of Admission Date (DT)<br> 
 * IN1-25: Report Of Eligibility Flag (ID)<br> 
 * IN1-26: Report Of Eligibility Date (DT)<br> 
 * IN1-27: Release Information Code (IS)<br> 
 * IN1-28: Pre-Admit Cert (PAC) (ST)<br> 
 * IN1-29: Verification Date/Time (DTM)<br> 
 * IN1-30: Verification By (XCN)<br> 
 * IN1-31: Type Of Agreement Code (IS)<br> 
 * IN1-32: Billing Status (IS)<br> 
 * IN1-33: Lifetime Reserve Days (NM)<br> 
 * IN1-34: Delay Before L.R. Day (NM)<br> 
 * IN1-35: Company Plan Code (IS)<br> 
 * IN1-36: Policy Number (ST)<br> 
 * IN1-37: Policy Deductible (CP)<br> 
 * IN1-38: Policy Limit - Amount (-)<br> 
 * IN1-39: Policy Limit - Days (NM)<br> 
 * IN1-40: Room Rate - Semi-Private (-)<br> 
 * IN1-41: Room Rate - Private (-)<br> 
 * IN1-42: Insured's Employment Status (CWE)<br> 
 * IN1-43: Insured's Administrative Sex (IS)<br> 
 * IN1-44: Insured's Employer's Address (XAD)<br> 
 * IN1-45: Verification Status (ST)<br> 
 * IN1-46: Prior Insurance Plan ID (IS)<br> 
 * IN1-47: Coverage Type (IS)<br> 
 * IN1-48: Handicap (IS)<br> 
 * IN1-49: Insured's ID Number (CX)<br> 
 * IN1-50: Signature Code (IS)<br> 
 * IN1-51: Signature Code Date (DT)<br> 
 * IN1-52: Insured's Birth Place (ST)<br> 
 * IN1-53: VIP Indicator (IS)<br> 
 * </p><p>The get...() methods return data from individual fields.  These methods 
 * do not throw exceptions and may therefore have to handle exceptions internally.  
 * If an exception is handled internally, it is logged and null is returned.  
 * This is not expected to happen - if it does happen this indicates not so much 
 * an exceptional circumstance as a bug in the code for this class.</p>    
 */
public class IN1 extends AbstractSegment  {

  /**
   * Creates a IN1 (Insurance) segment object that belongs to the given 
   * message.  
   */
  public IN1(Group parent, ModelClassFactory factory) {
    super(parent, factory);
    Message message = getMessage();
    try {
       this.add(SI.class, true, 1, 4, new Object[]{message}, "Set ID - IN1");
       this.add(CWE.class, true, 1, 250, new Object[]{message}, "Insurance Plan ID");
       this.add(CX.class, true, 0, 250, new Object[]{message}, "Insurance Company ID");
       this.add(XON.class, false, 0, 250, new Object[]{message}, "Insurance Company Name");
       this.add(XAD.class, false, 0, 250, new Object[]{message}, "Insurance Company Address");
       this.add(XPN.class, false, 0, 250, new Object[]{message}, "Insurance Co Contact Person");
       this.add(XTN.class, false, 0, 250, new Object[]{message}, "Insurance Co Phone Number");
       this.add(ST.class, false, 1, 12, new Object[]{message}, "Group Number");
       this.add(XON.class, false, 0, 250, new Object[]{message}, "Group Name");
       this.add(CX.class, false, 0, 250, new Object[]{message}, "Insured's Group Emp ID");
       this.add(XON.class, false, 0, 250, new Object[]{message}, "Insured's Group Emp Name");
       this.add(DT.class, false, 1, 8, new Object[]{message}, "Plan Effective Date");
       this.add(DT.class, false, 1, 8, new Object[]{message}, "Plan Expiration Date");
       this.add(AUI.class, false, 1, 239, new Object[]{message}, "Authorization Information");
       this.add(IS.class, false, 1, 3, new Object[]{message, new Integer(86)}, "Plan Type");
       this.add(XPN.class, false, 0, 250, new Object[]{message}, "Name Of Insured");
       this.add(CWE.class, false, 1, 250, new Object[]{message}, "Insured's Relationship To Patient");
       this.add(DTM.class, false, 1, 24, new Object[]{message}, "Insured's Date Of Birth");
       this.add(XAD.class, false, 0, 250, new Object[]{message}, "Insured's Address");
       this.add(IS.class, false, 1, 2, new Object[]{message, new Integer(135)}, "Assignment Of Benefits");
       this.add(IS.class, false, 1, 2, new Object[]{message, new Integer(173)}, "Coordination Of Benefits");
       this.add(ST.class, false, 1, 2, new Object[]{message}, "Coord Of Ben. Priority");
       this.add(ID.class, false, 1, 1, new Object[]{message, new Integer(136)}, "Notice Of Admission Flag");
       this.add(DT.class, false, 1, 8, new Object[]{message}, "Notice Of Admission Date");
       this.add(ID.class, false, 1, 1, new Object[]{message, new Integer(136)}, "Report Of Eligibility Flag");
       this.add(DT.class, false, 1, 8, new Object[]{message}, "Report Of Eligibility Date");
       this.add(IS.class, false, 1, 2, new Object[]{message, new Integer(93)}, "Release Information Code");
       this.add(ST.class, false, 1, 15, new Object[]{message}, "Pre-Admit Cert (PAC)");
       this.add(DTM.class, false, 1, 24, new Object[]{message}, "Verification Date/Time");
       this.add(XCN.class, false, 0, 250, new Object[]{message}, "Verification By");
       this.add(IS.class, false, 1, 2, new Object[]{message, new Integer(98)}, "Type Of Agreement Code");
       this.add(IS.class, false, 1, 2, new Object[]{message, new Integer(22)}, "Billing Status");
       this.add(NM.class, false, 1, 4, new Object[]{message}, "Lifetime Reserve Days");
       this.add(NM.class, false, 1, 4, new Object[]{message}, "Delay Before L.R. Day");
       this.add(IS.class, false, 1, 20, new Object[]{message, new Integer(42)}, "Company Plan Code");
       this.add(ST.class, false, 1, 15, new Object[]{message}, "Policy Number");
       this.add(CP.class, false, 1, 12, new Object[]{message}, "Policy Deductible");
       this.add(NULLDT.class, false, 1, 0, new Object[]{message}, "Policy Limit - Amount");
       this.add(NM.class, false, 1, 4, new Object[]{message}, "Policy Limit - Days");
       this.add(NULLDT.class, false, 1, 0, new Object[]{message}, "Room Rate - Semi-Private");
       this.add(NULLDT.class, false, 1, 0, new Object[]{message}, "Room Rate - Private");
       this.add(CWE.class, false, 1, 250, new Object[]{message}, "Insured's Employment Status");
       this.add(IS.class, false, 1, 1, new Object[]{message, new Integer(1)}, "Insured's Administrative Sex");
       this.add(XAD.class, false, 0, 250, new Object[]{message}, "Insured's Employer's Address");
       this.add(ST.class, false, 1, 2, new Object[]{message}, "Verification Status");
       this.add(IS.class, false, 1, 8, new Object[]{message, new Integer(72)}, "Prior Insurance Plan ID");
       this.add(IS.class, false, 1, 3, new Object[]{message, new Integer(309)}, "Coverage Type");
       this.add(IS.class, false, 1, 2, new Object[]{message, new Integer(295)}, "Handicap");
       this.add(CX.class, false, 0, 250, new Object[]{message}, "Insured's ID Number");
       this.add(IS.class, false, 1, 1, new Object[]{message, new Integer(535)}, "Signature Code");
       this.add(DT.class, false, 1, 8, new Object[]{message}, "Signature Code Date");
       this.add(ST.class, false, 1, 250, new Object[]{message}, "Insured's Birth Place");
       this.add(IS.class, false, 1, 2, new Object[]{message, new Integer(99)}, "VIP Indicator");
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Can't instantiate " + this.getClass().getName(), he);
    }
  }

  /**
   * Returns Set ID - IN1 (IN1-1).
   */
  public SI getSetIDIN1()  {
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
   * Returns Set ID - IN1 (IN1-1).
   */
  public SI getIn11_SetIDIN1()  {
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
   * Returns Insurance Plan ID (IN1-2).
   */
  public CWE getInsurancePlanID()  {
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
   * Returns Insurance Plan ID (IN1-2).
   */
  public CWE getIn12_InsurancePlanID()  {
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
   * Returns a single repetition of Insurance Company ID (IN1-3).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CX getInsuranceCompanyID(int rep) throws HL7Exception {
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
   * Returns all repetitions of Insurance Company ID (IN1-3).
   */
  public CX[] getInsuranceCompanyID() {
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
   * Returns a count of the number of repetitions of Insurance Company ID (IN1-3).
   */
  public int getInsuranceCompanyIDReps() {
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
   * Inserts a repetition of Insurance Company ID (IN1-3) at a given index and returns it.
   * @param index The index
   */
  public CX insertInsuranceCompanyID(int index) throws HL7Exception {
     return (CX) super.insertRepetition(3, index);
  }

  /**
   * Removes a repetition of Insurance Company ID (IN1-3) at a given index and returns it.
   * @param index The index
   */
  public CX removeInsuranceCompanyID(int index) throws HL7Exception {
     return (CX) super.removeRepetition(3, index);
  }

  /**
   * Returns a single repetition of Insurance Company ID (IN1-3).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CX getIn13_InsuranceCompanyID(int rep) throws HL7Exception {
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
   * Returns all repetitions of Insurance Company ID (IN1-3).
   */
  public CX[] getIn13_InsuranceCompanyID() {
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
   * Returns a count of the number of repetitions of Insurance Company ID (IN1-3).
   */
  public int getIn13_InsuranceCompanyIDReps() {
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
   * Inserts a repetition of Insurance Company ID (IN1-3) at a given index and returns it.
   * @param index The index
   */
  public CX insertIn13_InsuranceCompanyID(int index) throws HL7Exception {
     return (CX) super.insertRepetition(3, index);
  }

  /**
   * Removes a repetition of Insurance Company ID (IN1-3) at a given index and returns it.
   * @param index The index
   */
  public CX removeIn13_InsuranceCompanyID(int index) throws HL7Exception {
     return (CX) super.removeRepetition(3, index);
  }

  /**
   * Returns a single repetition of Insurance Company Name (IN1-4).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XON getInsuranceCompanyName(int rep) throws HL7Exception {
    XON ret = null;
    try {
        Type t = this.getField(4, rep);
        ret = (XON)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Insurance Company Name (IN1-4).
   */
  public XON[] getInsuranceCompanyName() {
     XON[] ret = null;
    try {
        Type[] t = this.getField(4);  
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
   * Returns a count of the number of repetitions of Insurance Company Name (IN1-4).
   */
  public int getInsuranceCompanyNameReps() {
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
   * Inserts a repetition of Insurance Company Name (IN1-4) at a given index and returns it.
   * @param index The index
   */
  public XON insertInsuranceCompanyName(int index) throws HL7Exception {
     return (XON) super.insertRepetition(4, index);
  }

  /**
   * Removes a repetition of Insurance Company Name (IN1-4) at a given index and returns it.
   * @param index The index
   */
  public XON removeInsuranceCompanyName(int index) throws HL7Exception {
     return (XON) super.removeRepetition(4, index);
  }

  /**
   * Returns a single repetition of Insurance Company Name (IN1-4).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XON getIn14_InsuranceCompanyName(int rep) throws HL7Exception {
    XON ret = null;
    try {
        Type t = this.getField(4, rep);
        ret = (XON)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Insurance Company Name (IN1-4).
   */
  public XON[] getIn14_InsuranceCompanyName() {
     XON[] ret = null;
    try {
        Type[] t = this.getField(4);  
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
   * Returns a count of the number of repetitions of Insurance Company Name (IN1-4).
   */
  public int getIn14_InsuranceCompanyNameReps() {
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
   * Inserts a repetition of Insurance Company Name (IN1-4) at a given index and returns it.
   * @param index The index
   */
  public XON insertIn14_InsuranceCompanyName(int index) throws HL7Exception {
     return (XON) super.insertRepetition(4, index);
  }

  /**
   * Removes a repetition of Insurance Company Name (IN1-4) at a given index and returns it.
   * @param index The index
   */
  public XON removeIn14_InsuranceCompanyName(int index) throws HL7Exception {
     return (XON) super.removeRepetition(4, index);
  }

  /**
   * Returns a single repetition of Insurance Company Address (IN1-5).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XAD getInsuranceCompanyAddress(int rep) throws HL7Exception {
    XAD ret = null;
    try {
        Type t = this.getField(5, rep);
        ret = (XAD)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Insurance Company Address (IN1-5).
   */
  public XAD[] getInsuranceCompanyAddress() {
     XAD[] ret = null;
    try {
        Type[] t = this.getField(5);  
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
   * Returns a count of the number of repetitions of Insurance Company Address (IN1-5).
   */
  public int getInsuranceCompanyAddressReps() {
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
   * Inserts a repetition of Insurance Company Address (IN1-5) at a given index and returns it.
   * @param index The index
   */
  public XAD insertInsuranceCompanyAddress(int index) throws HL7Exception {
     return (XAD) super.insertRepetition(5, index);
  }

  /**
   * Removes a repetition of Insurance Company Address (IN1-5) at a given index and returns it.
   * @param index The index
   */
  public XAD removeInsuranceCompanyAddress(int index) throws HL7Exception {
     return (XAD) super.removeRepetition(5, index);
  }

  /**
   * Returns a single repetition of Insurance Company Address (IN1-5).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XAD getIn15_InsuranceCompanyAddress(int rep) throws HL7Exception {
    XAD ret = null;
    try {
        Type t = this.getField(5, rep);
        ret = (XAD)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Insurance Company Address (IN1-5).
   */
  public XAD[] getIn15_InsuranceCompanyAddress() {
     XAD[] ret = null;
    try {
        Type[] t = this.getField(5);  
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
   * Returns a count of the number of repetitions of Insurance Company Address (IN1-5).
   */
  public int getIn15_InsuranceCompanyAddressReps() {
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
   * Inserts a repetition of Insurance Company Address (IN1-5) at a given index and returns it.
   * @param index The index
   */
  public XAD insertIn15_InsuranceCompanyAddress(int index) throws HL7Exception {
     return (XAD) super.insertRepetition(5, index);
  }

  /**
   * Removes a repetition of Insurance Company Address (IN1-5) at a given index and returns it.
   * @param index The index
   */
  public XAD removeIn15_InsuranceCompanyAddress(int index) throws HL7Exception {
     return (XAD) super.removeRepetition(5, index);
  }

  /**
   * Returns a single repetition of Insurance Co Contact Person (IN1-6).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XPN getInsuranceCoContactPerson(int rep) throws HL7Exception {
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
   * Returns all repetitions of Insurance Co Contact Person (IN1-6).
   */
  public XPN[] getInsuranceCoContactPerson() {
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
   * Returns a count of the number of repetitions of Insurance Co Contact Person (IN1-6).
   */
  public int getInsuranceCoContactPersonReps() {
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
   * Inserts a repetition of Insurance Co Contact Person (IN1-6) at a given index and returns it.
   * @param index The index
   */
  public XPN insertInsuranceCoContactPerson(int index) throws HL7Exception {
     return (XPN) super.insertRepetition(6, index);
  }

  /**
   * Removes a repetition of Insurance Co Contact Person (IN1-6) at a given index and returns it.
   * @param index The index
   */
  public XPN removeInsuranceCoContactPerson(int index) throws HL7Exception {
     return (XPN) super.removeRepetition(6, index);
  }

  /**
   * Returns a single repetition of Insurance Co Contact Person (IN1-6).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XPN getIn16_InsuranceCoContactPerson(int rep) throws HL7Exception {
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
   * Returns all repetitions of Insurance Co Contact Person (IN1-6).
   */
  public XPN[] getIn16_InsuranceCoContactPerson() {
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
   * Returns a count of the number of repetitions of Insurance Co Contact Person (IN1-6).
   */
  public int getIn16_InsuranceCoContactPersonReps() {
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
   * Inserts a repetition of Insurance Co Contact Person (IN1-6) at a given index and returns it.
   * @param index The index
   */
  public XPN insertIn16_InsuranceCoContactPerson(int index) throws HL7Exception {
     return (XPN) super.insertRepetition(6, index);
  }

  /**
   * Removes a repetition of Insurance Co Contact Person (IN1-6) at a given index and returns it.
   * @param index The index
   */
  public XPN removeIn16_InsuranceCoContactPerson(int index) throws HL7Exception {
     return (XPN) super.removeRepetition(6, index);
  }

  /**
   * Returns a single repetition of Insurance Co Phone Number (IN1-7).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XTN getInsuranceCoPhoneNumber(int rep) throws HL7Exception {
    XTN ret = null;
    try {
        Type t = this.getField(7, rep);
        ret = (XTN)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Insurance Co Phone Number (IN1-7).
   */
  public XTN[] getInsuranceCoPhoneNumber() {
     XTN[] ret = null;
    try {
        Type[] t = this.getField(7);  
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
   * Returns a count of the number of repetitions of Insurance Co Phone Number (IN1-7).
   */
  public int getInsuranceCoPhoneNumberReps() {
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
   * Inserts a repetition of Insurance Co Phone Number (IN1-7) at a given index and returns it.
   * @param index The index
   */
  public XTN insertInsuranceCoPhoneNumber(int index) throws HL7Exception {
     return (XTN) super.insertRepetition(7, index);
  }

  /**
   * Removes a repetition of Insurance Co Phone Number (IN1-7) at a given index and returns it.
   * @param index The index
   */
  public XTN removeInsuranceCoPhoneNumber(int index) throws HL7Exception {
     return (XTN) super.removeRepetition(7, index);
  }

  /**
   * Returns a single repetition of Insurance Co Phone Number (IN1-7).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XTN getIn17_InsuranceCoPhoneNumber(int rep) throws HL7Exception {
    XTN ret = null;
    try {
        Type t = this.getField(7, rep);
        ret = (XTN)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Insurance Co Phone Number (IN1-7).
   */
  public XTN[] getIn17_InsuranceCoPhoneNumber() {
     XTN[] ret = null;
    try {
        Type[] t = this.getField(7);  
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
   * Returns a count of the number of repetitions of Insurance Co Phone Number (IN1-7).
   */
  public int getIn17_InsuranceCoPhoneNumberReps() {
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
   * Inserts a repetition of Insurance Co Phone Number (IN1-7) at a given index and returns it.
   * @param index The index
   */
  public XTN insertIn17_InsuranceCoPhoneNumber(int index) throws HL7Exception {
     return (XTN) super.insertRepetition(7, index);
  }

  /**
   * Removes a repetition of Insurance Co Phone Number (IN1-7) at a given index and returns it.
   * @param index The index
   */
  public XTN removeIn17_InsuranceCoPhoneNumber(int index) throws HL7Exception {
     return (XTN) super.removeRepetition(7, index);
  }

  /**
   * Returns Group Number (IN1-8).
   */
  public ST getGroupNumber()  {
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
   * Returns Group Number (IN1-8).
   */
  public ST getIn18_GroupNumber()  {
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
   * Returns a single repetition of Group Name (IN1-9).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XON getGroupName(int rep) throws HL7Exception {
    XON ret = null;
    try {
        Type t = this.getField(9, rep);
        ret = (XON)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Group Name (IN1-9).
   */
  public XON[] getGroupName() {
     XON[] ret = null;
    try {
        Type[] t = this.getField(9);  
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
   * Returns a count of the number of repetitions of Group Name (IN1-9).
   */
  public int getGroupNameReps() {
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
   * Inserts a repetition of Group Name (IN1-9) at a given index and returns it.
   * @param index The index
   */
  public XON insertGroupName(int index) throws HL7Exception {
     return (XON) super.insertRepetition(9, index);
  }

  /**
   * Removes a repetition of Group Name (IN1-9) at a given index and returns it.
   * @param index The index
   */
  public XON removeGroupName(int index) throws HL7Exception {
     return (XON) super.removeRepetition(9, index);
  }

  /**
   * Returns a single repetition of Group Name (IN1-9).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XON getIn19_GroupName(int rep) throws HL7Exception {
    XON ret = null;
    try {
        Type t = this.getField(9, rep);
        ret = (XON)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Group Name (IN1-9).
   */
  public XON[] getIn19_GroupName() {
     XON[] ret = null;
    try {
        Type[] t = this.getField(9);  
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
   * Returns a count of the number of repetitions of Group Name (IN1-9).
   */
  public int getIn19_GroupNameReps() {
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
   * Inserts a repetition of Group Name (IN1-9) at a given index and returns it.
   * @param index The index
   */
  public XON insertIn19_GroupName(int index) throws HL7Exception {
     return (XON) super.insertRepetition(9, index);
  }

  /**
   * Removes a repetition of Group Name (IN1-9) at a given index and returns it.
   * @param index The index
   */
  public XON removeIn19_GroupName(int index) throws HL7Exception {
     return (XON) super.removeRepetition(9, index);
  }

  /**
   * Returns a single repetition of Insured's Group Emp ID (IN1-10).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CX getInsuredSGroupEmpID(int rep) throws HL7Exception {
    CX ret = null;
    try {
        Type t = this.getField(10, rep);
        ret = (CX)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Insured's Group Emp ID (IN1-10).
   */
  public CX[] getInsuredSGroupEmpID() {
     CX[] ret = null;
    try {
        Type[] t = this.getField(10);  
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
   * Returns a count of the number of repetitions of Insured's Group Emp ID (IN1-10).
   */
  public int getInsuredSGroupEmpIDReps() {
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
   * Inserts a repetition of Insured's Group Emp ID (IN1-10) at a given index and returns it.
   * @param index The index
   */
  public CX insertInsuredSGroupEmpID(int index) throws HL7Exception {
     return (CX) super.insertRepetition(10, index);
  }

  /**
   * Removes a repetition of Insured's Group Emp ID (IN1-10) at a given index and returns it.
   * @param index The index
   */
  public CX removeInsuredSGroupEmpID(int index) throws HL7Exception {
     return (CX) super.removeRepetition(10, index);
  }

  /**
   * Returns a single repetition of Insured's Group Emp ID (IN1-10).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CX getIn110_InsuredSGroupEmpID(int rep) throws HL7Exception {
    CX ret = null;
    try {
        Type t = this.getField(10, rep);
        ret = (CX)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Insured's Group Emp ID (IN1-10).
   */
  public CX[] getIn110_InsuredSGroupEmpID() {
     CX[] ret = null;
    try {
        Type[] t = this.getField(10);  
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
   * Returns a count of the number of repetitions of Insured's Group Emp ID (IN1-10).
   */
  public int getIn110_InsuredSGroupEmpIDReps() {
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
   * Inserts a repetition of Insured's Group Emp ID (IN1-10) at a given index and returns it.
   * @param index The index
   */
  public CX insertIn110_InsuredSGroupEmpID(int index) throws HL7Exception {
     return (CX) super.insertRepetition(10, index);
  }

  /**
   * Removes a repetition of Insured's Group Emp ID (IN1-10) at a given index and returns it.
   * @param index The index
   */
  public CX removeIn110_InsuredSGroupEmpID(int index) throws HL7Exception {
     return (CX) super.removeRepetition(10, index);
  }

  /**
   * Returns a single repetition of Insured's Group Emp Name (IN1-11).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XON getInsuredSGroupEmpName(int rep) throws HL7Exception {
    XON ret = null;
    try {
        Type t = this.getField(11, rep);
        ret = (XON)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Insured's Group Emp Name (IN1-11).
   */
  public XON[] getInsuredSGroupEmpName() {
     XON[] ret = null;
    try {
        Type[] t = this.getField(11);  
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
   * Returns a count of the number of repetitions of Insured's Group Emp Name (IN1-11).
   */
  public int getInsuredSGroupEmpNameReps() {
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
   * Inserts a repetition of Insured's Group Emp Name (IN1-11) at a given index and returns it.
   * @param index The index
   */
  public XON insertInsuredSGroupEmpName(int index) throws HL7Exception {
     return (XON) super.insertRepetition(11, index);
  }

  /**
   * Removes a repetition of Insured's Group Emp Name (IN1-11) at a given index and returns it.
   * @param index The index
   */
  public XON removeInsuredSGroupEmpName(int index) throws HL7Exception {
     return (XON) super.removeRepetition(11, index);
  }

  /**
   * Returns a single repetition of Insured's Group Emp Name (IN1-11).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XON getIn111_InsuredSGroupEmpName(int rep) throws HL7Exception {
    XON ret = null;
    try {
        Type t = this.getField(11, rep);
        ret = (XON)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Insured's Group Emp Name (IN1-11).
   */
  public XON[] getIn111_InsuredSGroupEmpName() {
     XON[] ret = null;
    try {
        Type[] t = this.getField(11);  
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
   * Returns a count of the number of repetitions of Insured's Group Emp Name (IN1-11).
   */
  public int getIn111_InsuredSGroupEmpNameReps() {
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
   * Inserts a repetition of Insured's Group Emp Name (IN1-11) at a given index and returns it.
   * @param index The index
   */
  public XON insertIn111_InsuredSGroupEmpName(int index) throws HL7Exception {
     return (XON) super.insertRepetition(11, index);
  }

  /**
   * Removes a repetition of Insured's Group Emp Name (IN1-11) at a given index and returns it.
   * @param index The index
   */
  public XON removeIn111_InsuredSGroupEmpName(int index) throws HL7Exception {
     return (XON) super.removeRepetition(11, index);
  }

  /**
   * Returns Plan Effective Date (IN1-12).
   */
  public DT getPlanEffectiveDate()  {
    DT ret = null;
    try {
        Type t = this.getField(12, 0);
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
   * Returns Plan Effective Date (IN1-12).
   */
  public DT getIn112_PlanEffectiveDate()  {
    DT ret = null;
    try {
        Type t = this.getField(12, 0);
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
   * Returns Plan Expiration Date (IN1-13).
   */
  public DT getPlanExpirationDate()  {
    DT ret = null;
    try {
        Type t = this.getField(13, 0);
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
   * Returns Plan Expiration Date (IN1-13).
   */
  public DT getIn113_PlanExpirationDate()  {
    DT ret = null;
    try {
        Type t = this.getField(13, 0);
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
   * Returns Authorization Information (IN1-14).
   */
  public AUI getAuthorizationInformation()  {
    AUI ret = null;
    try {
        Type t = this.getField(14, 0);
        ret = (AUI)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns Authorization Information (IN1-14).
   */
  public AUI getIn114_AuthorizationInformation()  {
    AUI ret = null;
    try {
        Type t = this.getField(14, 0);
        ret = (AUI)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns Plan Type (IN1-15).
   */
  public IS getPlanType()  {
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
   * Returns Plan Type (IN1-15).
   */
  public IS getIn115_PlanType()  {
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
   * Returns a single repetition of Name Of Insured (IN1-16).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XPN getNameOfInsured(int rep) throws HL7Exception {
    XPN ret = null;
    try {
        Type t = this.getField(16, rep);
        ret = (XPN)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Name Of Insured (IN1-16).
   */
  public XPN[] getNameOfInsured() {
     XPN[] ret = null;
    try {
        Type[] t = this.getField(16);  
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
   * Returns a count of the number of repetitions of Name Of Insured (IN1-16).
   */
  public int getNameOfInsuredReps() {
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
   * Inserts a repetition of Name Of Insured (IN1-16) at a given index and returns it.
   * @param index The index
   */
  public XPN insertNameOfInsured(int index) throws HL7Exception {
     return (XPN) super.insertRepetition(16, index);
  }

  /**
   * Removes a repetition of Name Of Insured (IN1-16) at a given index and returns it.
   * @param index The index
   */
  public XPN removeNameOfInsured(int index) throws HL7Exception {
     return (XPN) super.removeRepetition(16, index);
  }

  /**
   * Returns a single repetition of Name Of Insured (IN1-16).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XPN getIn116_NameOfInsured(int rep) throws HL7Exception {
    XPN ret = null;
    try {
        Type t = this.getField(16, rep);
        ret = (XPN)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Name Of Insured (IN1-16).
   */
  public XPN[] getIn116_NameOfInsured() {
     XPN[] ret = null;
    try {
        Type[] t = this.getField(16);  
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
   * Returns a count of the number of repetitions of Name Of Insured (IN1-16).
   */
  public int getIn116_NameOfInsuredReps() {
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
   * Inserts a repetition of Name Of Insured (IN1-16) at a given index and returns it.
   * @param index The index
   */
  public XPN insertIn116_NameOfInsured(int index) throws HL7Exception {
     return (XPN) super.insertRepetition(16, index);
  }

  /**
   * Removes a repetition of Name Of Insured (IN1-16) at a given index and returns it.
   * @param index The index
   */
  public XPN removeIn116_NameOfInsured(int index) throws HL7Exception {
     return (XPN) super.removeRepetition(16, index);
  }

  /**
   * Returns Insured's Relationship To Patient (IN1-17).
   */
  public CWE getInsuredSRelationshipToPatient()  {
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
   * Returns Insured's Relationship To Patient (IN1-17).
   */
  public CWE getIn117_InsuredSRelationshipToPatient()  {
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
   * Returns Insured's Date Of Birth (IN1-18).
   */
  public DTM getInsuredSDateOfBirth()  {
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
   * Returns Insured's Date Of Birth (IN1-18).
   */
  public DTM getIn118_InsuredSDateOfBirth()  {
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
   * Returns a single repetition of Insured's Address (IN1-19).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XAD getInsuredSAddress(int rep) throws HL7Exception {
    XAD ret = null;
    try {
        Type t = this.getField(19, rep);
        ret = (XAD)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Insured's Address (IN1-19).
   */
  public XAD[] getInsuredSAddress() {
     XAD[] ret = null;
    try {
        Type[] t = this.getField(19);  
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
   * Returns a count of the number of repetitions of Insured's Address (IN1-19).
   */
  public int getInsuredSAddressReps() {
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
   * Inserts a repetition of Insured's Address (IN1-19) at a given index and returns it.
   * @param index The index
   */
  public XAD insertInsuredSAddress(int index) throws HL7Exception {
     return (XAD) super.insertRepetition(19, index);
  }

  /**
   * Removes a repetition of Insured's Address (IN1-19) at a given index and returns it.
   * @param index The index
   */
  public XAD removeInsuredSAddress(int index) throws HL7Exception {
     return (XAD) super.removeRepetition(19, index);
  }

  /**
   * Returns a single repetition of Insured's Address (IN1-19).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XAD getIn119_InsuredSAddress(int rep) throws HL7Exception {
    XAD ret = null;
    try {
        Type t = this.getField(19, rep);
        ret = (XAD)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Insured's Address (IN1-19).
   */
  public XAD[] getIn119_InsuredSAddress() {
     XAD[] ret = null;
    try {
        Type[] t = this.getField(19);  
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
   * Returns a count of the number of repetitions of Insured's Address (IN1-19).
   */
  public int getIn119_InsuredSAddressReps() {
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
   * Inserts a repetition of Insured's Address (IN1-19) at a given index and returns it.
   * @param index The index
   */
  public XAD insertIn119_InsuredSAddress(int index) throws HL7Exception {
     return (XAD) super.insertRepetition(19, index);
  }

  /**
   * Removes a repetition of Insured's Address (IN1-19) at a given index and returns it.
   * @param index The index
   */
  public XAD removeIn119_InsuredSAddress(int index) throws HL7Exception {
     return (XAD) super.removeRepetition(19, index);
  }

  /**
   * Returns Assignment Of Benefits (IN1-20).
   */
  public IS getAssignmentOfBenefits()  {
    IS ret = null;
    try {
        Type t = this.getField(20, 0);
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
   * Returns Assignment Of Benefits (IN1-20).
   */
  public IS getIn120_AssignmentOfBenefits()  {
    IS ret = null;
    try {
        Type t = this.getField(20, 0);
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
   * Returns Coordination Of Benefits (IN1-21).
   */
  public IS getCoordinationOfBenefits()  {
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
   * Returns Coordination Of Benefits (IN1-21).
   */
  public IS getIn121_CoordinationOfBenefits()  {
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
   * Returns Coord Of Ben. Priority (IN1-22).
   */
  public ST getCoordOfBenPriority()  {
    ST ret = null;
    try {
        Type t = this.getField(22, 0);
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
   * Returns Coord Of Ben. Priority (IN1-22).
   */
  public ST getIn122_CoordOfBenPriority()  {
    ST ret = null;
    try {
        Type t = this.getField(22, 0);
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
   * Returns Notice Of Admission Flag (IN1-23).
   */
  public ID getNoticeOfAdmissionFlag()  {
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
   * Returns Notice Of Admission Flag (IN1-23).
   */
  public ID getIn123_NoticeOfAdmissionFlag()  {
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
   * Returns Notice Of Admission Date (IN1-24).
   */
  public DT getNoticeOfAdmissionDate()  {
    DT ret = null;
    try {
        Type t = this.getField(24, 0);
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
   * Returns Notice Of Admission Date (IN1-24).
   */
  public DT getIn124_NoticeOfAdmissionDate()  {
    DT ret = null;
    try {
        Type t = this.getField(24, 0);
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
   * Returns Report Of Eligibility Flag (IN1-25).
   */
  public ID getReportOfEligibilityFlag()  {
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
   * Returns Report Of Eligibility Flag (IN1-25).
   */
  public ID getIn125_ReportOfEligibilityFlag()  {
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
   * Returns Report Of Eligibility Date (IN1-26).
   */
  public DT getReportOfEligibilityDate()  {
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
   * Returns Report Of Eligibility Date (IN1-26).
   */
  public DT getIn126_ReportOfEligibilityDate()  {
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
   * Returns Release Information Code (IN1-27).
   */
  public IS getReleaseInformationCode()  {
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
   * Returns Release Information Code (IN1-27).
   */
  public IS getIn127_ReleaseInformationCode()  {
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
   * Returns Pre-Admit Cert (PAC) (IN1-28).
   */
  public ST getPreAdmitCert()  {
    ST ret = null;
    try {
        Type t = this.getField(28, 0);
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
   * Returns Pre-Admit Cert (PAC) (IN1-28).
   */
  public ST getIn128_PreAdmitCert()  {
    ST ret = null;
    try {
        Type t = this.getField(28, 0);
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
   * Returns Verification Date/Time (IN1-29).
   */
  public DTM getVerificationDateTime()  {
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
   * Returns Verification Date/Time (IN1-29).
   */
  public DTM getIn129_VerificationDateTime()  {
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
   * Returns a single repetition of Verification By (IN1-30).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XCN getVerificationBy(int rep) throws HL7Exception {
    XCN ret = null;
    try {
        Type t = this.getField(30, rep);
        ret = (XCN)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Verification By (IN1-30).
   */
  public XCN[] getVerificationBy() {
     XCN[] ret = null;
    try {
        Type[] t = this.getField(30);  
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
   * Returns a count of the number of repetitions of Verification By (IN1-30).
   */
  public int getVerificationByReps() {
    try {
        return this.getField(30).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Verification By (IN1-30) at a given index and returns it.
   * @param index The index
   */
  public XCN insertVerificationBy(int index) throws HL7Exception {
     return (XCN) super.insertRepetition(30, index);
  }

  /**
   * Removes a repetition of Verification By (IN1-30) at a given index and returns it.
   * @param index The index
   */
  public XCN removeVerificationBy(int index) throws HL7Exception {
     return (XCN) super.removeRepetition(30, index);
  }

  /**
   * Returns a single repetition of Verification By (IN1-30).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XCN getIn130_VerificationBy(int rep) throws HL7Exception {
    XCN ret = null;
    try {
        Type t = this.getField(30, rep);
        ret = (XCN)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Verification By (IN1-30).
   */
  public XCN[] getIn130_VerificationBy() {
     XCN[] ret = null;
    try {
        Type[] t = this.getField(30);  
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
   * Returns a count of the number of repetitions of Verification By (IN1-30).
   */
  public int getIn130_VerificationByReps() {
    try {
        return this.getField(30).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Verification By (IN1-30) at a given index and returns it.
   * @param index The index
   */
  public XCN insertIn130_VerificationBy(int index) throws HL7Exception {
     return (XCN) super.insertRepetition(30, index);
  }

  /**
   * Removes a repetition of Verification By (IN1-30) at a given index and returns it.
   * @param index The index
   */
  public XCN removeIn130_VerificationBy(int index) throws HL7Exception {
     return (XCN) super.removeRepetition(30, index);
  }

  /**
   * Returns Type Of Agreement Code (IN1-31).
   */
  public IS getTypeOfAgreementCode()  {
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
   * Returns Type Of Agreement Code (IN1-31).
   */
  public IS getIn131_TypeOfAgreementCode()  {
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
   * Returns Billing Status (IN1-32).
   */
  public IS getBillingStatus()  {
    IS ret = null;
    try {
        Type t = this.getField(32, 0);
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
   * Returns Billing Status (IN1-32).
   */
  public IS getIn132_BillingStatus()  {
    IS ret = null;
    try {
        Type t = this.getField(32, 0);
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
   * Returns Lifetime Reserve Days (IN1-33).
   */
  public NM getLifetimeReserveDays()  {
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
   * Returns Lifetime Reserve Days (IN1-33).
   */
  public NM getIn133_LifetimeReserveDays()  {
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
   * Returns Delay Before L.R. Day (IN1-34).
   */
  public NM getDelayBeforeLRDay()  {
    NM ret = null;
    try {
        Type t = this.getField(34, 0);
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
   * Returns Delay Before L.R. Day (IN1-34).
   */
  public NM getIn134_DelayBeforeLRDay()  {
    NM ret = null;
    try {
        Type t = this.getField(34, 0);
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
   * Returns Company Plan Code (IN1-35).
   */
  public IS getCompanyPlanCode()  {
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
   * Returns Company Plan Code (IN1-35).
   */
  public IS getIn135_CompanyPlanCode()  {
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
   * Returns Policy Number (IN1-36).
   */
  public ST getPolicyNumber()  {
    ST ret = null;
    try {
        Type t = this.getField(36, 0);
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
   * Returns Policy Number (IN1-36).
   */
  public ST getIn136_PolicyNumber()  {
    ST ret = null;
    try {
        Type t = this.getField(36, 0);
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
   * Returns Policy Deductible (IN1-37).
   */
  public CP getPolicyDeductible()  {
    CP ret = null;
    try {
        Type t = this.getField(37, 0);
        ret = (CP)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns Policy Deductible (IN1-37).
   */
  public CP getIn137_PolicyDeductible()  {
    CP ret = null;
    try {
        Type t = this.getField(37, 0);
        ret = (CP)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns Policy Limit - Amount (IN1-38).
   */
  public NULLDT getPolicyLimitAmount()  {
    NULLDT ret = null;
    try {
        Type t = this.getField(38, 0);
        ret = (NULLDT)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns Policy Limit - Amount (IN1-38).
   */
  public NULLDT getIn138_PolicyLimitAmount()  {
    NULLDT ret = null;
    try {
        Type t = this.getField(38, 0);
        ret = (NULLDT)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns Policy Limit - Days (IN1-39).
   */
  public NM getPolicyLimitDays()  {
    NM ret = null;
    try {
        Type t = this.getField(39, 0);
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
   * Returns Policy Limit - Days (IN1-39).
   */
  public NM getIn139_PolicyLimitDays()  {
    NM ret = null;
    try {
        Type t = this.getField(39, 0);
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
   * Returns Room Rate - Semi-Private (IN1-40).
   */
  public NULLDT getRoomRateSemiPrivate()  {
    NULLDT ret = null;
    try {
        Type t = this.getField(40, 0);
        ret = (NULLDT)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns Room Rate - Semi-Private (IN1-40).
   */
  public NULLDT getIn140_RoomRateSemiPrivate()  {
    NULLDT ret = null;
    try {
        Type t = this.getField(40, 0);
        ret = (NULLDT)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns Room Rate - Private (IN1-41).
   */
  public NULLDT getRoomRatePrivate()  {
    NULLDT ret = null;
    try {
        Type t = this.getField(41, 0);
        ret = (NULLDT)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns Room Rate - Private (IN1-41).
   */
  public NULLDT getIn141_RoomRatePrivate()  {
    NULLDT ret = null;
    try {
        Type t = this.getField(41, 0);
        ret = (NULLDT)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns Insured's Employment Status (IN1-42).
   */
  public CWE getInsuredSEmploymentStatus()  {
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
   * Returns Insured's Employment Status (IN1-42).
   */
  public CWE getIn142_InsuredSEmploymentStatus()  {
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
   * Returns Insured's Administrative Sex (IN1-43).
   */
  public IS getInsuredSAdministrativeSex()  {
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
   * Returns Insured's Administrative Sex (IN1-43).
   */
  public IS getIn143_InsuredSAdministrativeSex()  {
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
   * Returns a single repetition of Insured's Employer's Address (IN1-44).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XAD getInsuredSEmployerSAddress(int rep) throws HL7Exception {
    XAD ret = null;
    try {
        Type t = this.getField(44, rep);
        ret = (XAD)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Insured's Employer's Address (IN1-44).
   */
  public XAD[] getInsuredSEmployerSAddress() {
     XAD[] ret = null;
    try {
        Type[] t = this.getField(44);  
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
   * Returns a count of the number of repetitions of Insured's Employer's Address (IN1-44).
   */
  public int getInsuredSEmployerSAddressReps() {
    try {
        return this.getField(44).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Insured's Employer's Address (IN1-44) at a given index and returns it.
   * @param index The index
   */
  public XAD insertInsuredSEmployerSAddress(int index) throws HL7Exception {
     return (XAD) super.insertRepetition(44, index);
  }

  /**
   * Removes a repetition of Insured's Employer's Address (IN1-44) at a given index and returns it.
   * @param index The index
   */
  public XAD removeInsuredSEmployerSAddress(int index) throws HL7Exception {
     return (XAD) super.removeRepetition(44, index);
  }

  /**
   * Returns a single repetition of Insured's Employer's Address (IN1-44).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XAD getIn144_InsuredSEmployerSAddress(int rep) throws HL7Exception {
    XAD ret = null;
    try {
        Type t = this.getField(44, rep);
        ret = (XAD)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Insured's Employer's Address (IN1-44).
   */
  public XAD[] getIn144_InsuredSEmployerSAddress() {
     XAD[] ret = null;
    try {
        Type[] t = this.getField(44);  
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
   * Returns a count of the number of repetitions of Insured's Employer's Address (IN1-44).
   */
  public int getIn144_InsuredSEmployerSAddressReps() {
    try {
        return this.getField(44).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Insured's Employer's Address (IN1-44) at a given index and returns it.
   * @param index The index
   */
  public XAD insertIn144_InsuredSEmployerSAddress(int index) throws HL7Exception {
     return (XAD) super.insertRepetition(44, index);
  }

  /**
   * Removes a repetition of Insured's Employer's Address (IN1-44) at a given index and returns it.
   * @param index The index
   */
  public XAD removeIn144_InsuredSEmployerSAddress(int index) throws HL7Exception {
     return (XAD) super.removeRepetition(44, index);
  }

  /**
   * Returns Verification Status (IN1-45).
   */
  public ST getVerificationStatus()  {
    ST ret = null;
    try {
        Type t = this.getField(45, 0);
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
   * Returns Verification Status (IN1-45).
   */
  public ST getIn145_VerificationStatus()  {
    ST ret = null;
    try {
        Type t = this.getField(45, 0);
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
   * Returns Prior Insurance Plan ID (IN1-46).
   */
  public IS getPriorInsurancePlanID()  {
    IS ret = null;
    try {
        Type t = this.getField(46, 0);
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
   * Returns Prior Insurance Plan ID (IN1-46).
   */
  public IS getIn146_PriorInsurancePlanID()  {
    IS ret = null;
    try {
        Type t = this.getField(46, 0);
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
   * Returns Coverage Type (IN1-47).
   */
  public IS getCoverageType()  {
    IS ret = null;
    try {
        Type t = this.getField(47, 0);
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
   * Returns Coverage Type (IN1-47).
   */
  public IS getIn147_CoverageType()  {
    IS ret = null;
    try {
        Type t = this.getField(47, 0);
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
   * Returns Handicap (IN1-48).
   */
  public IS getHandicap()  {
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
   * Returns Handicap (IN1-48).
   */
  public IS getIn148_Handicap()  {
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
   * Returns a single repetition of Insured's ID Number (IN1-49).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CX getInsuredSIDNumber(int rep) throws HL7Exception {
    CX ret = null;
    try {
        Type t = this.getField(49, rep);
        ret = (CX)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Insured's ID Number (IN1-49).
   */
  public CX[] getInsuredSIDNumber() {
     CX[] ret = null;
    try {
        Type[] t = this.getField(49);  
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
   * Returns a count of the number of repetitions of Insured's ID Number (IN1-49).
   */
  public int getInsuredSIDNumberReps() {
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
   * Inserts a repetition of Insured's ID Number (IN1-49) at a given index and returns it.
   * @param index The index
   */
  public CX insertInsuredSIDNumber(int index) throws HL7Exception {
     return (CX) super.insertRepetition(49, index);
  }

  /**
   * Removes a repetition of Insured's ID Number (IN1-49) at a given index and returns it.
   * @param index The index
   */
  public CX removeInsuredSIDNumber(int index) throws HL7Exception {
     return (CX) super.removeRepetition(49, index);
  }

  /**
   * Returns a single repetition of Insured's ID Number (IN1-49).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CX getIn149_InsuredSIDNumber(int rep) throws HL7Exception {
    CX ret = null;
    try {
        Type t = this.getField(49, rep);
        ret = (CX)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Insured's ID Number (IN1-49).
   */
  public CX[] getIn149_InsuredSIDNumber() {
     CX[] ret = null;
    try {
        Type[] t = this.getField(49);  
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
   * Returns a count of the number of repetitions of Insured's ID Number (IN1-49).
   */
  public int getIn149_InsuredSIDNumberReps() {
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
   * Inserts a repetition of Insured's ID Number (IN1-49) at a given index and returns it.
   * @param index The index
   */
  public CX insertIn149_InsuredSIDNumber(int index) throws HL7Exception {
     return (CX) super.insertRepetition(49, index);
  }

  /**
   * Removes a repetition of Insured's ID Number (IN1-49) at a given index and returns it.
   * @param index The index
   */
  public CX removeIn149_InsuredSIDNumber(int index) throws HL7Exception {
     return (CX) super.removeRepetition(49, index);
  }

  /**
   * Returns Signature Code (IN1-50).
   */
  public IS getSignatureCode()  {
    IS ret = null;
    try {
        Type t = this.getField(50, 0);
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
   * Returns Signature Code (IN1-50).
   */
  public IS getIn150_SignatureCode()  {
    IS ret = null;
    try {
        Type t = this.getField(50, 0);
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
   * Returns Signature Code Date (IN1-51).
   */
  public DT getSignatureCodeDate()  {
    DT ret = null;
    try {
        Type t = this.getField(51, 0);
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
   * Returns Signature Code Date (IN1-51).
   */
  public DT getIn151_SignatureCodeDate()  {
    DT ret = null;
    try {
        Type t = this.getField(51, 0);
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
   * Returns Insured's Birth Place (IN1-52).
   */
  public ST getInsuredSBirthPlace()  {
    ST ret = null;
    try {
        Type t = this.getField(52, 0);
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
   * Returns Insured's Birth Place (IN1-52).
   */
  public ST getIn152_InsuredSBirthPlace()  {
    ST ret = null;
    try {
        Type t = this.getField(52, 0);
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
   * Returns VIP Indicator (IN1-53).
   */
  public IS getVIPIndicator()  {
    IS ret = null;
    try {
        Type t = this.getField(53, 0);
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
   * Returns VIP Indicator (IN1-53).
   */
  public IS getIn153_VIPIndicator()  {
    IS ret = null;
    try {
        Type t = this.getField(53, 0);
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

   protected Type createNewTypeWithoutReflection(int field) {
      switch (field) {
         case 0: return new ca.uhn.hl7v2.model.v26.datatype.SI(getMessage());
         case 1: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 2: return new ca.uhn.hl7v2.model.v26.datatype.CX(getMessage());
         case 3: return new ca.uhn.hl7v2.model.v26.datatype.XON(getMessage());
         case 4: return new ca.uhn.hl7v2.model.v26.datatype.XAD(getMessage());
         case 5: return new ca.uhn.hl7v2.model.v26.datatype.XPN(getMessage());
         case 6: return new ca.uhn.hl7v2.model.v26.datatype.XTN(getMessage());
         case 7: return new ca.uhn.hl7v2.model.v26.datatype.ST(getMessage());
         case 8: return new ca.uhn.hl7v2.model.v26.datatype.XON(getMessage());
         case 9: return new ca.uhn.hl7v2.model.v26.datatype.CX(getMessage());
         case 10: return new ca.uhn.hl7v2.model.v26.datatype.XON(getMessage());
         case 11: return new ca.uhn.hl7v2.model.v26.datatype.DT(getMessage());
         case 12: return new ca.uhn.hl7v2.model.v26.datatype.DT(getMessage());
         case 13: return new ca.uhn.hl7v2.model.v26.datatype.AUI(getMessage());
         case 14: return new ca.uhn.hl7v2.model.v26.datatype.IS(getMessage(), new Integer(86));
         case 15: return new ca.uhn.hl7v2.model.v26.datatype.XPN(getMessage());
         case 16: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 17: return new ca.uhn.hl7v2.model.v26.datatype.DTM(getMessage());
         case 18: return new ca.uhn.hl7v2.model.v26.datatype.XAD(getMessage());
         case 19: return new ca.uhn.hl7v2.model.v26.datatype.IS(getMessage(), new Integer(135));
         case 20: return new ca.uhn.hl7v2.model.v26.datatype.IS(getMessage(), new Integer(173));
         case 21: return new ca.uhn.hl7v2.model.v26.datatype.ST(getMessage());
         case 22: return new ca.uhn.hl7v2.model.v26.datatype.ID(getMessage(), new Integer(136));
         case 23: return new ca.uhn.hl7v2.model.v26.datatype.DT(getMessage());
         case 24: return new ca.uhn.hl7v2.model.v26.datatype.ID(getMessage(), new Integer(136));
         case 25: return new ca.uhn.hl7v2.model.v26.datatype.DT(getMessage());
         case 26: return new ca.uhn.hl7v2.model.v26.datatype.IS(getMessage(), new Integer(93));
         case 27: return new ca.uhn.hl7v2.model.v26.datatype.ST(getMessage());
         case 28: return new ca.uhn.hl7v2.model.v26.datatype.DTM(getMessage());
         case 29: return new ca.uhn.hl7v2.model.v26.datatype.XCN(getMessage());
         case 30: return new ca.uhn.hl7v2.model.v26.datatype.IS(getMessage(), new Integer(98));
         case 31: return new ca.uhn.hl7v2.model.v26.datatype.IS(getMessage(), new Integer(22));
         case 32: return new ca.uhn.hl7v2.model.v26.datatype.NM(getMessage());
         case 33: return new ca.uhn.hl7v2.model.v26.datatype.NM(getMessage());
         case 34: return new ca.uhn.hl7v2.model.v26.datatype.IS(getMessage(), new Integer(42));
         case 35: return new ca.uhn.hl7v2.model.v26.datatype.ST(getMessage());
         case 36: return new ca.uhn.hl7v2.model.v26.datatype.CP(getMessage());
         case 37: return new ca.uhn.hl7v2.model.v26.datatype.NULLDT(getMessage());
         case 38: return new ca.uhn.hl7v2.model.v26.datatype.NM(getMessage());
         case 39: return new ca.uhn.hl7v2.model.v26.datatype.NULLDT(getMessage());
         case 40: return new ca.uhn.hl7v2.model.v26.datatype.NULLDT(getMessage());
         case 41: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 42: return new ca.uhn.hl7v2.model.v26.datatype.IS(getMessage(), new Integer(1));
         case 43: return new ca.uhn.hl7v2.model.v26.datatype.XAD(getMessage());
         case 44: return new ca.uhn.hl7v2.model.v26.datatype.ST(getMessage());
         case 45: return new ca.uhn.hl7v2.model.v26.datatype.IS(getMessage(), new Integer(72));
         case 46: return new ca.uhn.hl7v2.model.v26.datatype.IS(getMessage(), new Integer(309));
         case 47: return new ca.uhn.hl7v2.model.v26.datatype.IS(getMessage(), new Integer(295));
         case 48: return new ca.uhn.hl7v2.model.v26.datatype.CX(getMessage());
         case 49: return new ca.uhn.hl7v2.model.v26.datatype.IS(getMessage(), new Integer(535));
         case 50: return new ca.uhn.hl7v2.model.v26.datatype.DT(getMessage());
         case 51: return new ca.uhn.hl7v2.model.v26.datatype.ST(getMessage());
         case 52: return new ca.uhn.hl7v2.model.v26.datatype.IS(getMessage(), new Integer(99));
         default: return null;
      }
   }

}