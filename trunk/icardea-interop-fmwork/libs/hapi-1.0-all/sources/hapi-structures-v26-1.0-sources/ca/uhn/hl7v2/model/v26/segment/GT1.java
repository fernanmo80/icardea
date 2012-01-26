package ca.uhn.hl7v2.model.v26.segment;

import ca.uhn.hl7v2.model.*;
import ca.uhn.hl7v2.model.v26.datatype.*;
import ca.uhn.log.HapiLogFactory;
import ca.uhn.hl7v2.parser.ModelClassFactory;
import ca.uhn.hl7v2.HL7Exception;

/**
 * <p>Represents an HL7 GT1 message segment. 
 * This segment has the following fields:</p><p>
 * GT1-1: Set ID - GT1 (SI)<br> 
 * GT1-2: Guarantor Number (CX)<br> 
 * GT1-3: Guarantor Name (XPN)<br> 
 * GT1-4: Guarantor Spouse Name (XPN)<br> 
 * GT1-5: Guarantor Address (XAD)<br> 
 * GT1-6: Guarantor Ph Num - Home (XTN)<br> 
 * GT1-7: Guarantor Ph Num - Business (XTN)<br> 
 * GT1-8: Guarantor Date/Time Of Birth (DTM)<br> 
 * GT1-9: Guarantor Administrative Sex (IS)<br> 
 * GT1-10: Guarantor Type (IS)<br> 
 * GT1-11: Guarantor Relationship (CWE)<br> 
 * GT1-12: Guarantor SSN (ST)<br> 
 * GT1-13: Guarantor Date - Begin (DT)<br> 
 * GT1-14: Guarantor Date - End (DT)<br> 
 * GT1-15: Guarantor Priority (NM)<br> 
 * GT1-16: Guarantor Employer Name (XPN)<br> 
 * GT1-17: Guarantor Employer Address (XAD)<br> 
 * GT1-18: Guarantor Employer Phone Number (XTN)<br> 
 * GT1-19: Guarantor Employee ID Number (CX)<br> 
 * GT1-20: Guarantor Employment Status (IS)<br> 
 * GT1-21: Guarantor Organization Name (XON)<br> 
 * GT1-22: Guarantor Billing Hold Flag (ID)<br> 
 * GT1-23: Guarantor Credit Rating Code (CWE)<br> 
 * GT1-24: Guarantor Death Date And Time (DTM)<br> 
 * GT1-25: Guarantor Death Flag (ID)<br> 
 * GT1-26: Guarantor Charge Adjustment Code (CWE)<br> 
 * GT1-27: Guarantor Household Annual Income (CP)<br> 
 * GT1-28: Guarantor Household Size (NM)<br> 
 * GT1-29: Guarantor Employer ID Number (CX)<br> 
 * GT1-30: Guarantor Marital Status Code (CWE)<br> 
 * GT1-31: Guarantor Hire Effective Date (DT)<br> 
 * GT1-32: Employment Stop Date (DT)<br> 
 * GT1-33: Living Dependency (IS)<br> 
 * GT1-34: Ambulatory Status (IS)<br> 
 * GT1-35: Citizenship (CWE)<br> 
 * GT1-36: Primary Language (CWE)<br> 
 * GT1-37: Living Arrangement (IS)<br> 
 * GT1-38: Publicity Code (CWE)<br> 
 * GT1-39: Protection Indicator (ID)<br> 
 * GT1-40: Student Indicator (IS)<br> 
 * GT1-41: Religion (CWE)<br> 
 * GT1-42: Mother's Maiden Name (XPN)<br> 
 * GT1-43: Nationality (CWE)<br> 
 * GT1-44: Ethnic Group (CWE)<br> 
 * GT1-45: Contact Person's Name (XPN)<br> 
 * GT1-46: Contact Person's Telephone Number (XTN)<br> 
 * GT1-47: Contact Reason (CWE)<br> 
 * GT1-48: Contact Relationship (IS)<br> 
 * GT1-49: Job Title (ST)<br> 
 * GT1-50: Job Code/Class (JCC)<br> 
 * GT1-51: Guarantor Employer's Organization Name (XON)<br> 
 * GT1-52: Handicap (IS)<br> 
 * GT1-53: Job Status (IS)<br> 
 * GT1-54: Guarantor Financial Class (FC)<br> 
 * GT1-55: Guarantor Race (CWE)<br> 
 * GT1-56: Guarantor Birth Place (ST)<br> 
 * GT1-57: VIP Indicator (IS)<br> 
 * </p><p>The get...() methods return data from individual fields.  These methods 
 * do not throw exceptions and may therefore have to handle exceptions internally.  
 * If an exception is handled internally, it is logged and null is returned.  
 * This is not expected to happen - if it does happen this indicates not so much 
 * an exceptional circumstance as a bug in the code for this class.</p>    
 */
public class GT1 extends AbstractSegment  {

  /**
   * Creates a GT1 (Guarantor) segment object that belongs to the given 
   * message.  
   */
  public GT1(Group parent, ModelClassFactory factory) {
    super(parent, factory);
    Message message = getMessage();
    try {
       this.add(SI.class, true, 1, 4, new Object[]{message}, "Set ID - GT1");
       this.add(CX.class, false, 0, 250, new Object[]{message}, "Guarantor Number");
       this.add(XPN.class, true, 0, 250, new Object[]{message}, "Guarantor Name");
       this.add(XPN.class, false, 0, 250, new Object[]{message}, "Guarantor Spouse Name");
       this.add(XAD.class, false, 0, 250, new Object[]{message}, "Guarantor Address");
       this.add(XTN.class, false, 0, 250, new Object[]{message}, "Guarantor Ph Num - Home");
       this.add(XTN.class, false, 0, 250, new Object[]{message}, "Guarantor Ph Num - Business");
       this.add(DTM.class, false, 1, 24, new Object[]{message}, "Guarantor Date/Time Of Birth");
       this.add(IS.class, false, 1, 1, new Object[]{message, new Integer(1)}, "Guarantor Administrative Sex");
       this.add(IS.class, false, 1, 2, new Object[]{message, new Integer(68)}, "Guarantor Type");
       this.add(CWE.class, false, 1, 250, new Object[]{message}, "Guarantor Relationship");
       this.add(ST.class, false, 1, 11, new Object[]{message}, "Guarantor SSN");
       this.add(DT.class, false, 1, 8, new Object[]{message}, "Guarantor Date - Begin");
       this.add(DT.class, false, 1, 8, new Object[]{message}, "Guarantor Date - End");
       this.add(NM.class, false, 1, 2, new Object[]{message}, "Guarantor Priority");
       this.add(XPN.class, false, 0, 250, new Object[]{message}, "Guarantor Employer Name");
       this.add(XAD.class, false, 0, 250, new Object[]{message}, "Guarantor Employer Address");
       this.add(XTN.class, false, 0, 250, new Object[]{message}, "Guarantor Employer Phone Number");
       this.add(CX.class, false, 0, 250, new Object[]{message}, "Guarantor Employee ID Number");
       this.add(IS.class, false, 1, 2, new Object[]{message, new Integer(66)}, "Guarantor Employment Status");
       this.add(XON.class, false, 0, 250, new Object[]{message}, "Guarantor Organization Name");
       this.add(ID.class, false, 1, 1, new Object[]{message, new Integer(136)}, "Guarantor Billing Hold Flag");
       this.add(CWE.class, false, 1, 250, new Object[]{message}, "Guarantor Credit Rating Code");
       this.add(DTM.class, false, 1, 24, new Object[]{message}, "Guarantor Death Date And Time");
       this.add(ID.class, false, 1, 1, new Object[]{message, new Integer(136)}, "Guarantor Death Flag");
       this.add(CWE.class, false, 1, 250, new Object[]{message}, "Guarantor Charge Adjustment Code");
       this.add(CP.class, false, 1, 10, new Object[]{message}, "Guarantor Household Annual Income");
       this.add(NM.class, false, 1, 3, new Object[]{message}, "Guarantor Household Size");
       this.add(CX.class, false, 0, 250, new Object[]{message}, "Guarantor Employer ID Number");
       this.add(CWE.class, false, 1, 250, new Object[]{message}, "Guarantor Marital Status Code");
       this.add(DT.class, false, 1, 8, new Object[]{message}, "Guarantor Hire Effective Date");
       this.add(DT.class, false, 1, 8, new Object[]{message}, "Employment Stop Date");
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
       this.add(XPN.class, false, 0, 250, new Object[]{message}, "Contact Person's Name");
       this.add(XTN.class, false, 0, 250, new Object[]{message}, "Contact Person's Telephone Number");
       this.add(CWE.class, false, 1, 705, new Object[]{message}, "Contact Reason");
       this.add(IS.class, false, 1, 3, new Object[]{message, new Integer(63)}, "Contact Relationship");
       this.add(ST.class, false, 1, 20, new Object[]{message}, "Job Title");
       this.add(JCC.class, false, 1, 20, new Object[]{message}, "Job Code/Class");
       this.add(XON.class, false, 0, 250, new Object[]{message}, "Guarantor Employer's Organization Name");
       this.add(IS.class, false, 1, 2, new Object[]{message, new Integer(295)}, "Handicap");
       this.add(IS.class, false, 1, 2, new Object[]{message, new Integer(311)}, "Job Status");
       this.add(FC.class, false, 1, 50, new Object[]{message}, "Guarantor Financial Class");
       this.add(CWE.class, false, 0, 250, new Object[]{message}, "Guarantor Race");
       this.add(ST.class, false, 1, 250, new Object[]{message}, "Guarantor Birth Place");
       this.add(IS.class, false, 1, 2, new Object[]{message, new Integer(99)}, "VIP Indicator");
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Can't instantiate " + this.getClass().getName(), he);
    }
  }

  /**
   * Returns Set ID - GT1 (GT1-1).
   */
  public SI getSetIDGT1()  {
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
   * Returns Set ID - GT1 (GT1-1).
   */
  public SI getGt11_SetIDGT1()  {
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
   * Returns a single repetition of Guarantor Number (GT1-2).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CX getGuarantorNumber(int rep) throws HL7Exception {
    CX ret = null;
    try {
        Type t = this.getField(2, rep);
        ret = (CX)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Guarantor Number (GT1-2).
   */
  public CX[] getGuarantorNumber() {
     CX[] ret = null;
    try {
        Type[] t = this.getField(2);  
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
   * Returns a count of the number of repetitions of Guarantor Number (GT1-2).
   */
  public int getGuarantorNumberReps() {
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
   * Inserts a repetition of Guarantor Number (GT1-2) at a given index and returns it.
   * @param index The index
   */
  public CX insertGuarantorNumber(int index) throws HL7Exception {
     return (CX) super.insertRepetition(2, index);
  }

  /**
   * Removes a repetition of Guarantor Number (GT1-2) at a given index and returns it.
   * @param index The index
   */
  public CX removeGuarantorNumber(int index) throws HL7Exception {
     return (CX) super.removeRepetition(2, index);
  }

  /**
   * Returns a single repetition of Guarantor Number (GT1-2).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CX getGt12_GuarantorNumber(int rep) throws HL7Exception {
    CX ret = null;
    try {
        Type t = this.getField(2, rep);
        ret = (CX)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Guarantor Number (GT1-2).
   */
  public CX[] getGt12_GuarantorNumber() {
     CX[] ret = null;
    try {
        Type[] t = this.getField(2);  
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
   * Returns a count of the number of repetitions of Guarantor Number (GT1-2).
   */
  public int getGt12_GuarantorNumberReps() {
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
   * Inserts a repetition of Guarantor Number (GT1-2) at a given index and returns it.
   * @param index The index
   */
  public CX insertGt12_GuarantorNumber(int index) throws HL7Exception {
     return (CX) super.insertRepetition(2, index);
  }

  /**
   * Removes a repetition of Guarantor Number (GT1-2) at a given index and returns it.
   * @param index The index
   */
  public CX removeGt12_GuarantorNumber(int index) throws HL7Exception {
     return (CX) super.removeRepetition(2, index);
  }

  /**
   * Returns a single repetition of Guarantor Name (GT1-3).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XPN getGuarantorName(int rep) throws HL7Exception {
    XPN ret = null;
    try {
        Type t = this.getField(3, rep);
        ret = (XPN)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Guarantor Name (GT1-3).
   */
  public XPN[] getGuarantorName() {
     XPN[] ret = null;
    try {
        Type[] t = this.getField(3);  
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
   * Returns a count of the number of repetitions of Guarantor Name (GT1-3).
   */
  public int getGuarantorNameReps() {
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
   * Inserts a repetition of Guarantor Name (GT1-3) at a given index and returns it.
   * @param index The index
   */
  public XPN insertGuarantorName(int index) throws HL7Exception {
     return (XPN) super.insertRepetition(3, index);
  }

  /**
   * Removes a repetition of Guarantor Name (GT1-3) at a given index and returns it.
   * @param index The index
   */
  public XPN removeGuarantorName(int index) throws HL7Exception {
     return (XPN) super.removeRepetition(3, index);
  }

  /**
   * Returns a single repetition of Guarantor Name (GT1-3).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XPN getGt13_GuarantorName(int rep) throws HL7Exception {
    XPN ret = null;
    try {
        Type t = this.getField(3, rep);
        ret = (XPN)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Guarantor Name (GT1-3).
   */
  public XPN[] getGt13_GuarantorName() {
     XPN[] ret = null;
    try {
        Type[] t = this.getField(3);  
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
   * Returns a count of the number of repetitions of Guarantor Name (GT1-3).
   */
  public int getGt13_GuarantorNameReps() {
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
   * Inserts a repetition of Guarantor Name (GT1-3) at a given index and returns it.
   * @param index The index
   */
  public XPN insertGt13_GuarantorName(int index) throws HL7Exception {
     return (XPN) super.insertRepetition(3, index);
  }

  /**
   * Removes a repetition of Guarantor Name (GT1-3) at a given index and returns it.
   * @param index The index
   */
  public XPN removeGt13_GuarantorName(int index) throws HL7Exception {
     return (XPN) super.removeRepetition(3, index);
  }

  /**
   * Returns a single repetition of Guarantor Spouse Name (GT1-4).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XPN getGuarantorSpouseName(int rep) throws HL7Exception {
    XPN ret = null;
    try {
        Type t = this.getField(4, rep);
        ret = (XPN)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Guarantor Spouse Name (GT1-4).
   */
  public XPN[] getGuarantorSpouseName() {
     XPN[] ret = null;
    try {
        Type[] t = this.getField(4);  
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
   * Returns a count of the number of repetitions of Guarantor Spouse Name (GT1-4).
   */
  public int getGuarantorSpouseNameReps() {
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
   * Inserts a repetition of Guarantor Spouse Name (GT1-4) at a given index and returns it.
   * @param index The index
   */
  public XPN insertGuarantorSpouseName(int index) throws HL7Exception {
     return (XPN) super.insertRepetition(4, index);
  }

  /**
   * Removes a repetition of Guarantor Spouse Name (GT1-4) at a given index and returns it.
   * @param index The index
   */
  public XPN removeGuarantorSpouseName(int index) throws HL7Exception {
     return (XPN) super.removeRepetition(4, index);
  }

  /**
   * Returns a single repetition of Guarantor Spouse Name (GT1-4).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XPN getGt14_GuarantorSpouseName(int rep) throws HL7Exception {
    XPN ret = null;
    try {
        Type t = this.getField(4, rep);
        ret = (XPN)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Guarantor Spouse Name (GT1-4).
   */
  public XPN[] getGt14_GuarantorSpouseName() {
     XPN[] ret = null;
    try {
        Type[] t = this.getField(4);  
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
   * Returns a count of the number of repetitions of Guarantor Spouse Name (GT1-4).
   */
  public int getGt14_GuarantorSpouseNameReps() {
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
   * Inserts a repetition of Guarantor Spouse Name (GT1-4) at a given index and returns it.
   * @param index The index
   */
  public XPN insertGt14_GuarantorSpouseName(int index) throws HL7Exception {
     return (XPN) super.insertRepetition(4, index);
  }

  /**
   * Removes a repetition of Guarantor Spouse Name (GT1-4) at a given index and returns it.
   * @param index The index
   */
  public XPN removeGt14_GuarantorSpouseName(int index) throws HL7Exception {
     return (XPN) super.removeRepetition(4, index);
  }

  /**
   * Returns a single repetition of Guarantor Address (GT1-5).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XAD getGuarantorAddress(int rep) throws HL7Exception {
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
   * Returns all repetitions of Guarantor Address (GT1-5).
   */
  public XAD[] getGuarantorAddress() {
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
   * Returns a count of the number of repetitions of Guarantor Address (GT1-5).
   */
  public int getGuarantorAddressReps() {
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
   * Inserts a repetition of Guarantor Address (GT1-5) at a given index and returns it.
   * @param index The index
   */
  public XAD insertGuarantorAddress(int index) throws HL7Exception {
     return (XAD) super.insertRepetition(5, index);
  }

  /**
   * Removes a repetition of Guarantor Address (GT1-5) at a given index and returns it.
   * @param index The index
   */
  public XAD removeGuarantorAddress(int index) throws HL7Exception {
     return (XAD) super.removeRepetition(5, index);
  }

  /**
   * Returns a single repetition of Guarantor Address (GT1-5).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XAD getGt15_GuarantorAddress(int rep) throws HL7Exception {
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
   * Returns all repetitions of Guarantor Address (GT1-5).
   */
  public XAD[] getGt15_GuarantorAddress() {
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
   * Returns a count of the number of repetitions of Guarantor Address (GT1-5).
   */
  public int getGt15_GuarantorAddressReps() {
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
   * Inserts a repetition of Guarantor Address (GT1-5) at a given index and returns it.
   * @param index The index
   */
  public XAD insertGt15_GuarantorAddress(int index) throws HL7Exception {
     return (XAD) super.insertRepetition(5, index);
  }

  /**
   * Removes a repetition of Guarantor Address (GT1-5) at a given index and returns it.
   * @param index The index
   */
  public XAD removeGt15_GuarantorAddress(int index) throws HL7Exception {
     return (XAD) super.removeRepetition(5, index);
  }

  /**
   * Returns a single repetition of Guarantor Ph Num - Home (GT1-6).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XTN getGuarantorPhNumHome(int rep) throws HL7Exception {
    XTN ret = null;
    try {
        Type t = this.getField(6, rep);
        ret = (XTN)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Guarantor Ph Num - Home (GT1-6).
   */
  public XTN[] getGuarantorPhNumHome() {
     XTN[] ret = null;
    try {
        Type[] t = this.getField(6);  
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
   * Returns a count of the number of repetitions of Guarantor Ph Num - Home (GT1-6).
   */
  public int getGuarantorPhNumHomeReps() {
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
   * Inserts a repetition of Guarantor Ph Num - Home (GT1-6) at a given index and returns it.
   * @param index The index
   */
  public XTN insertGuarantorPhNumHome(int index) throws HL7Exception {
     return (XTN) super.insertRepetition(6, index);
  }

  /**
   * Removes a repetition of Guarantor Ph Num - Home (GT1-6) at a given index and returns it.
   * @param index The index
   */
  public XTN removeGuarantorPhNumHome(int index) throws HL7Exception {
     return (XTN) super.removeRepetition(6, index);
  }

  /**
   * Returns a single repetition of Guarantor Ph Num - Home (GT1-6).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XTN getGt16_GuarantorPhNumHome(int rep) throws HL7Exception {
    XTN ret = null;
    try {
        Type t = this.getField(6, rep);
        ret = (XTN)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Guarantor Ph Num - Home (GT1-6).
   */
  public XTN[] getGt16_GuarantorPhNumHome() {
     XTN[] ret = null;
    try {
        Type[] t = this.getField(6);  
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
   * Returns a count of the number of repetitions of Guarantor Ph Num - Home (GT1-6).
   */
  public int getGt16_GuarantorPhNumHomeReps() {
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
   * Inserts a repetition of Guarantor Ph Num - Home (GT1-6) at a given index and returns it.
   * @param index The index
   */
  public XTN insertGt16_GuarantorPhNumHome(int index) throws HL7Exception {
     return (XTN) super.insertRepetition(6, index);
  }

  /**
   * Removes a repetition of Guarantor Ph Num - Home (GT1-6) at a given index and returns it.
   * @param index The index
   */
  public XTN removeGt16_GuarantorPhNumHome(int index) throws HL7Exception {
     return (XTN) super.removeRepetition(6, index);
  }

  /**
   * Returns a single repetition of Guarantor Ph Num - Business (GT1-7).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XTN getGuarantorPhNumBusiness(int rep) throws HL7Exception {
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
   * Returns all repetitions of Guarantor Ph Num - Business (GT1-7).
   */
  public XTN[] getGuarantorPhNumBusiness() {
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
   * Returns a count of the number of repetitions of Guarantor Ph Num - Business (GT1-7).
   */
  public int getGuarantorPhNumBusinessReps() {
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
   * Inserts a repetition of Guarantor Ph Num - Business (GT1-7) at a given index and returns it.
   * @param index The index
   */
  public XTN insertGuarantorPhNumBusiness(int index) throws HL7Exception {
     return (XTN) super.insertRepetition(7, index);
  }

  /**
   * Removes a repetition of Guarantor Ph Num - Business (GT1-7) at a given index and returns it.
   * @param index The index
   */
  public XTN removeGuarantorPhNumBusiness(int index) throws HL7Exception {
     return (XTN) super.removeRepetition(7, index);
  }

  /**
   * Returns a single repetition of Guarantor Ph Num - Business (GT1-7).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XTN getGt17_GuarantorPhNumBusiness(int rep) throws HL7Exception {
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
   * Returns all repetitions of Guarantor Ph Num - Business (GT1-7).
   */
  public XTN[] getGt17_GuarantorPhNumBusiness() {
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
   * Returns a count of the number of repetitions of Guarantor Ph Num - Business (GT1-7).
   */
  public int getGt17_GuarantorPhNumBusinessReps() {
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
   * Inserts a repetition of Guarantor Ph Num - Business (GT1-7) at a given index and returns it.
   * @param index The index
   */
  public XTN insertGt17_GuarantorPhNumBusiness(int index) throws HL7Exception {
     return (XTN) super.insertRepetition(7, index);
  }

  /**
   * Removes a repetition of Guarantor Ph Num - Business (GT1-7) at a given index and returns it.
   * @param index The index
   */
  public XTN removeGt17_GuarantorPhNumBusiness(int index) throws HL7Exception {
     return (XTN) super.removeRepetition(7, index);
  }

  /**
   * Returns Guarantor Date/Time Of Birth (GT1-8).
   */
  public DTM getGuarantorDateTimeOfBirth()  {
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
   * Returns Guarantor Date/Time Of Birth (GT1-8).
   */
  public DTM getGt18_GuarantorDateTimeOfBirth()  {
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
   * Returns Guarantor Administrative Sex (GT1-9).
   */
  public IS getGuarantorAdministrativeSex()  {
    IS ret = null;
    try {
        Type t = this.getField(9, 0);
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
   * Returns Guarantor Administrative Sex (GT1-9).
   */
  public IS getGt19_GuarantorAdministrativeSex()  {
    IS ret = null;
    try {
        Type t = this.getField(9, 0);
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
   * Returns Guarantor Type (GT1-10).
   */
  public IS getGuarantorType()  {
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
   * Returns Guarantor Type (GT1-10).
   */
  public IS getGt110_GuarantorType()  {
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
   * Returns Guarantor Relationship (GT1-11).
   */
  public CWE getGuarantorRelationship()  {
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
   * Returns Guarantor Relationship (GT1-11).
   */
  public CWE getGt111_GuarantorRelationship()  {
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
   * Returns Guarantor SSN (GT1-12).
   */
  public ST getGuarantorSSN()  {
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
   * Returns Guarantor SSN (GT1-12).
   */
  public ST getGt112_GuarantorSSN()  {
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
   * Returns Guarantor Date - Begin (GT1-13).
   */
  public DT getGuarantorDateBegin()  {
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
   * Returns Guarantor Date - Begin (GT1-13).
   */
  public DT getGt113_GuarantorDateBegin()  {
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
   * Returns Guarantor Date - End (GT1-14).
   */
  public DT getGuarantorDateEnd()  {
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
   * Returns Guarantor Date - End (GT1-14).
   */
  public DT getGt114_GuarantorDateEnd()  {
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
   * Returns Guarantor Priority (GT1-15).
   */
  public NM getGuarantorPriority()  {
    NM ret = null;
    try {
        Type t = this.getField(15, 0);
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
   * Returns Guarantor Priority (GT1-15).
   */
  public NM getGt115_GuarantorPriority()  {
    NM ret = null;
    try {
        Type t = this.getField(15, 0);
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
   * Returns a single repetition of Guarantor Employer Name (GT1-16).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XPN getGuarantorEmployerName(int rep) throws HL7Exception {
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
   * Returns all repetitions of Guarantor Employer Name (GT1-16).
   */
  public XPN[] getGuarantorEmployerName() {
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
   * Returns a count of the number of repetitions of Guarantor Employer Name (GT1-16).
   */
  public int getGuarantorEmployerNameReps() {
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
   * Inserts a repetition of Guarantor Employer Name (GT1-16) at a given index and returns it.
   * @param index The index
   */
  public XPN insertGuarantorEmployerName(int index) throws HL7Exception {
     return (XPN) super.insertRepetition(16, index);
  }

  /**
   * Removes a repetition of Guarantor Employer Name (GT1-16) at a given index and returns it.
   * @param index The index
   */
  public XPN removeGuarantorEmployerName(int index) throws HL7Exception {
     return (XPN) super.removeRepetition(16, index);
  }

  /**
   * Returns a single repetition of Guarantor Employer Name (GT1-16).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XPN getGt116_GuarantorEmployerName(int rep) throws HL7Exception {
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
   * Returns all repetitions of Guarantor Employer Name (GT1-16).
   */
  public XPN[] getGt116_GuarantorEmployerName() {
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
   * Returns a count of the number of repetitions of Guarantor Employer Name (GT1-16).
   */
  public int getGt116_GuarantorEmployerNameReps() {
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
   * Inserts a repetition of Guarantor Employer Name (GT1-16) at a given index and returns it.
   * @param index The index
   */
  public XPN insertGt116_GuarantorEmployerName(int index) throws HL7Exception {
     return (XPN) super.insertRepetition(16, index);
  }

  /**
   * Removes a repetition of Guarantor Employer Name (GT1-16) at a given index and returns it.
   * @param index The index
   */
  public XPN removeGt116_GuarantorEmployerName(int index) throws HL7Exception {
     return (XPN) super.removeRepetition(16, index);
  }

  /**
   * Returns a single repetition of Guarantor Employer Address (GT1-17).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XAD getGuarantorEmployerAddress(int rep) throws HL7Exception {
    XAD ret = null;
    try {
        Type t = this.getField(17, rep);
        ret = (XAD)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Guarantor Employer Address (GT1-17).
   */
  public XAD[] getGuarantorEmployerAddress() {
     XAD[] ret = null;
    try {
        Type[] t = this.getField(17);  
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
   * Returns a count of the number of repetitions of Guarantor Employer Address (GT1-17).
   */
  public int getGuarantorEmployerAddressReps() {
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
   * Inserts a repetition of Guarantor Employer Address (GT1-17) at a given index and returns it.
   * @param index The index
   */
  public XAD insertGuarantorEmployerAddress(int index) throws HL7Exception {
     return (XAD) super.insertRepetition(17, index);
  }

  /**
   * Removes a repetition of Guarantor Employer Address (GT1-17) at a given index and returns it.
   * @param index The index
   */
  public XAD removeGuarantorEmployerAddress(int index) throws HL7Exception {
     return (XAD) super.removeRepetition(17, index);
  }

  /**
   * Returns a single repetition of Guarantor Employer Address (GT1-17).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XAD getGt117_GuarantorEmployerAddress(int rep) throws HL7Exception {
    XAD ret = null;
    try {
        Type t = this.getField(17, rep);
        ret = (XAD)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Guarantor Employer Address (GT1-17).
   */
  public XAD[] getGt117_GuarantorEmployerAddress() {
     XAD[] ret = null;
    try {
        Type[] t = this.getField(17);  
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
   * Returns a count of the number of repetitions of Guarantor Employer Address (GT1-17).
   */
  public int getGt117_GuarantorEmployerAddressReps() {
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
   * Inserts a repetition of Guarantor Employer Address (GT1-17) at a given index and returns it.
   * @param index The index
   */
  public XAD insertGt117_GuarantorEmployerAddress(int index) throws HL7Exception {
     return (XAD) super.insertRepetition(17, index);
  }

  /**
   * Removes a repetition of Guarantor Employer Address (GT1-17) at a given index and returns it.
   * @param index The index
   */
  public XAD removeGt117_GuarantorEmployerAddress(int index) throws HL7Exception {
     return (XAD) super.removeRepetition(17, index);
  }

  /**
   * Returns a single repetition of Guarantor Employer Phone Number (GT1-18).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XTN getGuarantorEmployerPhoneNumber(int rep) throws HL7Exception {
    XTN ret = null;
    try {
        Type t = this.getField(18, rep);
        ret = (XTN)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Guarantor Employer Phone Number (GT1-18).
   */
  public XTN[] getGuarantorEmployerPhoneNumber() {
     XTN[] ret = null;
    try {
        Type[] t = this.getField(18);  
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
   * Returns a count of the number of repetitions of Guarantor Employer Phone Number (GT1-18).
   */
  public int getGuarantorEmployerPhoneNumberReps() {
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
   * Inserts a repetition of Guarantor Employer Phone Number (GT1-18) at a given index and returns it.
   * @param index The index
   */
  public XTN insertGuarantorEmployerPhoneNumber(int index) throws HL7Exception {
     return (XTN) super.insertRepetition(18, index);
  }

  /**
   * Removes a repetition of Guarantor Employer Phone Number (GT1-18) at a given index and returns it.
   * @param index The index
   */
  public XTN removeGuarantorEmployerPhoneNumber(int index) throws HL7Exception {
     return (XTN) super.removeRepetition(18, index);
  }

  /**
   * Returns a single repetition of Guarantor Employer Phone Number (GT1-18).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XTN getGt118_GuarantorEmployerPhoneNumber(int rep) throws HL7Exception {
    XTN ret = null;
    try {
        Type t = this.getField(18, rep);
        ret = (XTN)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Guarantor Employer Phone Number (GT1-18).
   */
  public XTN[] getGt118_GuarantorEmployerPhoneNumber() {
     XTN[] ret = null;
    try {
        Type[] t = this.getField(18);  
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
   * Returns a count of the number of repetitions of Guarantor Employer Phone Number (GT1-18).
   */
  public int getGt118_GuarantorEmployerPhoneNumberReps() {
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
   * Inserts a repetition of Guarantor Employer Phone Number (GT1-18) at a given index and returns it.
   * @param index The index
   */
  public XTN insertGt118_GuarantorEmployerPhoneNumber(int index) throws HL7Exception {
     return (XTN) super.insertRepetition(18, index);
  }

  /**
   * Removes a repetition of Guarantor Employer Phone Number (GT1-18) at a given index and returns it.
   * @param index The index
   */
  public XTN removeGt118_GuarantorEmployerPhoneNumber(int index) throws HL7Exception {
     return (XTN) super.removeRepetition(18, index);
  }

  /**
   * Returns a single repetition of Guarantor Employee ID Number (GT1-19).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CX getGuarantorEmployeeIDNumber(int rep) throws HL7Exception {
    CX ret = null;
    try {
        Type t = this.getField(19, rep);
        ret = (CX)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Guarantor Employee ID Number (GT1-19).
   */
  public CX[] getGuarantorEmployeeIDNumber() {
     CX[] ret = null;
    try {
        Type[] t = this.getField(19);  
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
   * Returns a count of the number of repetitions of Guarantor Employee ID Number (GT1-19).
   */
  public int getGuarantorEmployeeIDNumberReps() {
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
   * Inserts a repetition of Guarantor Employee ID Number (GT1-19) at a given index and returns it.
   * @param index The index
   */
  public CX insertGuarantorEmployeeIDNumber(int index) throws HL7Exception {
     return (CX) super.insertRepetition(19, index);
  }

  /**
   * Removes a repetition of Guarantor Employee ID Number (GT1-19) at a given index and returns it.
   * @param index The index
   */
  public CX removeGuarantorEmployeeIDNumber(int index) throws HL7Exception {
     return (CX) super.removeRepetition(19, index);
  }

  /**
   * Returns a single repetition of Guarantor Employee ID Number (GT1-19).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CX getGt119_GuarantorEmployeeIDNumber(int rep) throws HL7Exception {
    CX ret = null;
    try {
        Type t = this.getField(19, rep);
        ret = (CX)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Guarantor Employee ID Number (GT1-19).
   */
  public CX[] getGt119_GuarantorEmployeeIDNumber() {
     CX[] ret = null;
    try {
        Type[] t = this.getField(19);  
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
   * Returns a count of the number of repetitions of Guarantor Employee ID Number (GT1-19).
   */
  public int getGt119_GuarantorEmployeeIDNumberReps() {
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
   * Inserts a repetition of Guarantor Employee ID Number (GT1-19) at a given index and returns it.
   * @param index The index
   */
  public CX insertGt119_GuarantorEmployeeIDNumber(int index) throws HL7Exception {
     return (CX) super.insertRepetition(19, index);
  }

  /**
   * Removes a repetition of Guarantor Employee ID Number (GT1-19) at a given index and returns it.
   * @param index The index
   */
  public CX removeGt119_GuarantorEmployeeIDNumber(int index) throws HL7Exception {
     return (CX) super.removeRepetition(19, index);
  }

  /**
   * Returns Guarantor Employment Status (GT1-20).
   */
  public IS getGuarantorEmploymentStatus()  {
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
   * Returns Guarantor Employment Status (GT1-20).
   */
  public IS getGt120_GuarantorEmploymentStatus()  {
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
   * Returns a single repetition of Guarantor Organization Name (GT1-21).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XON getGuarantorOrganizationName(int rep) throws HL7Exception {
    XON ret = null;
    try {
        Type t = this.getField(21, rep);
        ret = (XON)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Guarantor Organization Name (GT1-21).
   */
  public XON[] getGuarantorOrganizationName() {
     XON[] ret = null;
    try {
        Type[] t = this.getField(21);  
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
   * Returns a count of the number of repetitions of Guarantor Organization Name (GT1-21).
   */
  public int getGuarantorOrganizationNameReps() {
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
   * Inserts a repetition of Guarantor Organization Name (GT1-21) at a given index and returns it.
   * @param index The index
   */
  public XON insertGuarantorOrganizationName(int index) throws HL7Exception {
     return (XON) super.insertRepetition(21, index);
  }

  /**
   * Removes a repetition of Guarantor Organization Name (GT1-21) at a given index and returns it.
   * @param index The index
   */
  public XON removeGuarantorOrganizationName(int index) throws HL7Exception {
     return (XON) super.removeRepetition(21, index);
  }

  /**
   * Returns a single repetition of Guarantor Organization Name (GT1-21).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XON getGt121_GuarantorOrganizationName(int rep) throws HL7Exception {
    XON ret = null;
    try {
        Type t = this.getField(21, rep);
        ret = (XON)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Guarantor Organization Name (GT1-21).
   */
  public XON[] getGt121_GuarantorOrganizationName() {
     XON[] ret = null;
    try {
        Type[] t = this.getField(21);  
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
   * Returns a count of the number of repetitions of Guarantor Organization Name (GT1-21).
   */
  public int getGt121_GuarantorOrganizationNameReps() {
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
   * Inserts a repetition of Guarantor Organization Name (GT1-21) at a given index and returns it.
   * @param index The index
   */
  public XON insertGt121_GuarantorOrganizationName(int index) throws HL7Exception {
     return (XON) super.insertRepetition(21, index);
  }

  /**
   * Removes a repetition of Guarantor Organization Name (GT1-21) at a given index and returns it.
   * @param index The index
   */
  public XON removeGt121_GuarantorOrganizationName(int index) throws HL7Exception {
     return (XON) super.removeRepetition(21, index);
  }

  /**
   * Returns Guarantor Billing Hold Flag (GT1-22).
   */
  public ID getGuarantorBillingHoldFlag()  {
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
   * Returns Guarantor Billing Hold Flag (GT1-22).
   */
  public ID getGt122_GuarantorBillingHoldFlag()  {
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
   * Returns Guarantor Credit Rating Code (GT1-23).
   */
  public CWE getGuarantorCreditRatingCode()  {
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
   * Returns Guarantor Credit Rating Code (GT1-23).
   */
  public CWE getGt123_GuarantorCreditRatingCode()  {
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
   * Returns Guarantor Death Date And Time (GT1-24).
   */
  public DTM getGuarantorDeathDateAndTime()  {
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
   * Returns Guarantor Death Date And Time (GT1-24).
   */
  public DTM getGt124_GuarantorDeathDateAndTime()  {
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
   * Returns Guarantor Death Flag (GT1-25).
   */
  public ID getGuarantorDeathFlag()  {
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
   * Returns Guarantor Death Flag (GT1-25).
   */
  public ID getGt125_GuarantorDeathFlag()  {
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
   * Returns Guarantor Charge Adjustment Code (GT1-26).
   */
  public CWE getGuarantorChargeAdjustmentCode()  {
    CWE ret = null;
    try {
        Type t = this.getField(26, 0);
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
   * Returns Guarantor Charge Adjustment Code (GT1-26).
   */
  public CWE getGt126_GuarantorChargeAdjustmentCode()  {
    CWE ret = null;
    try {
        Type t = this.getField(26, 0);
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
   * Returns Guarantor Household Annual Income (GT1-27).
   */
  public CP getGuarantorHouseholdAnnualIncome()  {
    CP ret = null;
    try {
        Type t = this.getField(27, 0);
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
   * Returns Guarantor Household Annual Income (GT1-27).
   */
  public CP getGt127_GuarantorHouseholdAnnualIncome()  {
    CP ret = null;
    try {
        Type t = this.getField(27, 0);
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
   * Returns Guarantor Household Size (GT1-28).
   */
  public NM getGuarantorHouseholdSize()  {
    NM ret = null;
    try {
        Type t = this.getField(28, 0);
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
   * Returns Guarantor Household Size (GT1-28).
   */
  public NM getGt128_GuarantorHouseholdSize()  {
    NM ret = null;
    try {
        Type t = this.getField(28, 0);
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
   * Returns a single repetition of Guarantor Employer ID Number (GT1-29).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CX getGuarantorEmployerIDNumber(int rep) throws HL7Exception {
    CX ret = null;
    try {
        Type t = this.getField(29, rep);
        ret = (CX)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Guarantor Employer ID Number (GT1-29).
   */
  public CX[] getGuarantorEmployerIDNumber() {
     CX[] ret = null;
    try {
        Type[] t = this.getField(29);  
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
   * Returns a count of the number of repetitions of Guarantor Employer ID Number (GT1-29).
   */
  public int getGuarantorEmployerIDNumberReps() {
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
   * Inserts a repetition of Guarantor Employer ID Number (GT1-29) at a given index and returns it.
   * @param index The index
   */
  public CX insertGuarantorEmployerIDNumber(int index) throws HL7Exception {
     return (CX) super.insertRepetition(29, index);
  }

  /**
   * Removes a repetition of Guarantor Employer ID Number (GT1-29) at a given index and returns it.
   * @param index The index
   */
  public CX removeGuarantorEmployerIDNumber(int index) throws HL7Exception {
     return (CX) super.removeRepetition(29, index);
  }

  /**
   * Returns a single repetition of Guarantor Employer ID Number (GT1-29).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CX getGt129_GuarantorEmployerIDNumber(int rep) throws HL7Exception {
    CX ret = null;
    try {
        Type t = this.getField(29, rep);
        ret = (CX)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Guarantor Employer ID Number (GT1-29).
   */
  public CX[] getGt129_GuarantorEmployerIDNumber() {
     CX[] ret = null;
    try {
        Type[] t = this.getField(29);  
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
   * Returns a count of the number of repetitions of Guarantor Employer ID Number (GT1-29).
   */
  public int getGt129_GuarantorEmployerIDNumberReps() {
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
   * Inserts a repetition of Guarantor Employer ID Number (GT1-29) at a given index and returns it.
   * @param index The index
   */
  public CX insertGt129_GuarantorEmployerIDNumber(int index) throws HL7Exception {
     return (CX) super.insertRepetition(29, index);
  }

  /**
   * Removes a repetition of Guarantor Employer ID Number (GT1-29) at a given index and returns it.
   * @param index The index
   */
  public CX removeGt129_GuarantorEmployerIDNumber(int index) throws HL7Exception {
     return (CX) super.removeRepetition(29, index);
  }

  /**
   * Returns Guarantor Marital Status Code (GT1-30).
   */
  public CWE getGuarantorMaritalStatusCode()  {
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
   * Returns Guarantor Marital Status Code (GT1-30).
   */
  public CWE getGt130_GuarantorMaritalStatusCode()  {
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
   * Returns Guarantor Hire Effective Date (GT1-31).
   */
  public DT getGuarantorHireEffectiveDate()  {
    DT ret = null;
    try {
        Type t = this.getField(31, 0);
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
   * Returns Guarantor Hire Effective Date (GT1-31).
   */
  public DT getGt131_GuarantorHireEffectiveDate()  {
    DT ret = null;
    try {
        Type t = this.getField(31, 0);
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
   * Returns Employment Stop Date (GT1-32).
   */
  public DT getEmploymentStopDate()  {
    DT ret = null;
    try {
        Type t = this.getField(32, 0);
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
   * Returns Employment Stop Date (GT1-32).
   */
  public DT getGt132_EmploymentStopDate()  {
    DT ret = null;
    try {
        Type t = this.getField(32, 0);
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
   * Returns Living Dependency (GT1-33).
   */
  public IS getLivingDependency()  {
    IS ret = null;
    try {
        Type t = this.getField(33, 0);
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
   * Returns Living Dependency (GT1-33).
   */
  public IS getGt133_LivingDependency()  {
    IS ret = null;
    try {
        Type t = this.getField(33, 0);
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
   * Returns a single repetition of Ambulatory Status (GT1-34).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public IS getAmbulatoryStatus(int rep) throws HL7Exception {
    IS ret = null;
    try {
        Type t = this.getField(34, rep);
        ret = (IS)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Ambulatory Status (GT1-34).
   */
  public IS[] getAmbulatoryStatus() {
     IS[] ret = null;
    try {
        Type[] t = this.getField(34);  
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
   * Returns a count of the number of repetitions of Ambulatory Status (GT1-34).
   */
  public int getAmbulatoryStatusReps() {
    try {
        return this.getField(34).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Ambulatory Status (GT1-34) at a given index and returns it.
   * @param index The index
   */
  public IS insertAmbulatoryStatus(int index) throws HL7Exception {
     return (IS) super.insertRepetition(34, index);
  }

  /**
   * Removes a repetition of Ambulatory Status (GT1-34) at a given index and returns it.
   * @param index The index
   */
  public IS removeAmbulatoryStatus(int index) throws HL7Exception {
     return (IS) super.removeRepetition(34, index);
  }

  /**
   * Returns a single repetition of Ambulatory Status (GT1-34).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public IS getGt134_AmbulatoryStatus(int rep) throws HL7Exception {
    IS ret = null;
    try {
        Type t = this.getField(34, rep);
        ret = (IS)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Ambulatory Status (GT1-34).
   */
  public IS[] getGt134_AmbulatoryStatus() {
     IS[] ret = null;
    try {
        Type[] t = this.getField(34);  
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
   * Returns a count of the number of repetitions of Ambulatory Status (GT1-34).
   */
  public int getGt134_AmbulatoryStatusReps() {
    try {
        return this.getField(34).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Ambulatory Status (GT1-34) at a given index and returns it.
   * @param index The index
   */
  public IS insertGt134_AmbulatoryStatus(int index) throws HL7Exception {
     return (IS) super.insertRepetition(34, index);
  }

  /**
   * Removes a repetition of Ambulatory Status (GT1-34) at a given index and returns it.
   * @param index The index
   */
  public IS removeGt134_AmbulatoryStatus(int index) throws HL7Exception {
     return (IS) super.removeRepetition(34, index);
  }

  /**
   * Returns a single repetition of Citizenship (GT1-35).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getCitizenship(int rep) throws HL7Exception {
    CWE ret = null;
    try {
        Type t = this.getField(35, rep);
        ret = (CWE)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Citizenship (GT1-35).
   */
  public CWE[] getCitizenship() {
     CWE[] ret = null;
    try {
        Type[] t = this.getField(35);  
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
   * Returns a count of the number of repetitions of Citizenship (GT1-35).
   */
  public int getCitizenshipReps() {
    try {
        return this.getField(35).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Citizenship (GT1-35) at a given index and returns it.
   * @param index The index
   */
  public CWE insertCitizenship(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(35, index);
  }

  /**
   * Removes a repetition of Citizenship (GT1-35) at a given index and returns it.
   * @param index The index
   */
  public CWE removeCitizenship(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(35, index);
  }

  /**
   * Returns a single repetition of Citizenship (GT1-35).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getGt135_Citizenship(int rep) throws HL7Exception {
    CWE ret = null;
    try {
        Type t = this.getField(35, rep);
        ret = (CWE)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Citizenship (GT1-35).
   */
  public CWE[] getGt135_Citizenship() {
     CWE[] ret = null;
    try {
        Type[] t = this.getField(35);  
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
   * Returns a count of the number of repetitions of Citizenship (GT1-35).
   */
  public int getGt135_CitizenshipReps() {
    try {
        return this.getField(35).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Citizenship (GT1-35) at a given index and returns it.
   * @param index The index
   */
  public CWE insertGt135_Citizenship(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(35, index);
  }

  /**
   * Removes a repetition of Citizenship (GT1-35) at a given index and returns it.
   * @param index The index
   */
  public CWE removeGt135_Citizenship(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(35, index);
  }

  /**
   * Returns Primary Language (GT1-36).
   */
  public CWE getPrimaryLanguage()  {
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
   * Returns Primary Language (GT1-36).
   */
  public CWE getGt136_PrimaryLanguage()  {
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
   * Returns Living Arrangement (GT1-37).
   */
  public IS getLivingArrangement()  {
    IS ret = null;
    try {
        Type t = this.getField(37, 0);
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
   * Returns Living Arrangement (GT1-37).
   */
  public IS getGt137_LivingArrangement()  {
    IS ret = null;
    try {
        Type t = this.getField(37, 0);
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
   * Returns Publicity Code (GT1-38).
   */
  public CWE getPublicityCode()  {
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
   * Returns Publicity Code (GT1-38).
   */
  public CWE getGt138_PublicityCode()  {
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
   * Returns Protection Indicator (GT1-39).
   */
  public ID getProtectionIndicator()  {
    ID ret = null;
    try {
        Type t = this.getField(39, 0);
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
   * Returns Protection Indicator (GT1-39).
   */
  public ID getGt139_ProtectionIndicator()  {
    ID ret = null;
    try {
        Type t = this.getField(39, 0);
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
   * Returns Student Indicator (GT1-40).
   */
  public IS getStudentIndicator()  {
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
   * Returns Student Indicator (GT1-40).
   */
  public IS getGt140_StudentIndicator()  {
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
   * Returns Religion (GT1-41).
   */
  public CWE getReligion()  {
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
   * Returns Religion (GT1-41).
   */
  public CWE getGt141_Religion()  {
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
   * Returns a single repetition of Mother's Maiden Name (GT1-42).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XPN getMotherSMaidenName(int rep) throws HL7Exception {
    XPN ret = null;
    try {
        Type t = this.getField(42, rep);
        ret = (XPN)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Mother's Maiden Name (GT1-42).
   */
  public XPN[] getMotherSMaidenName() {
     XPN[] ret = null;
    try {
        Type[] t = this.getField(42);  
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
   * Returns a count of the number of repetitions of Mother's Maiden Name (GT1-42).
   */
  public int getMotherSMaidenNameReps() {
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
   * Inserts a repetition of Mother's Maiden Name (GT1-42) at a given index and returns it.
   * @param index The index
   */
  public XPN insertMotherSMaidenName(int index) throws HL7Exception {
     return (XPN) super.insertRepetition(42, index);
  }

  /**
   * Removes a repetition of Mother's Maiden Name (GT1-42) at a given index and returns it.
   * @param index The index
   */
  public XPN removeMotherSMaidenName(int index) throws HL7Exception {
     return (XPN) super.removeRepetition(42, index);
  }

  /**
   * Returns a single repetition of Mother's Maiden Name (GT1-42).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XPN getGt142_MotherSMaidenName(int rep) throws HL7Exception {
    XPN ret = null;
    try {
        Type t = this.getField(42, rep);
        ret = (XPN)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Mother's Maiden Name (GT1-42).
   */
  public XPN[] getGt142_MotherSMaidenName() {
     XPN[] ret = null;
    try {
        Type[] t = this.getField(42);  
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
   * Returns a count of the number of repetitions of Mother's Maiden Name (GT1-42).
   */
  public int getGt142_MotherSMaidenNameReps() {
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
   * Inserts a repetition of Mother's Maiden Name (GT1-42) at a given index and returns it.
   * @param index The index
   */
  public XPN insertGt142_MotherSMaidenName(int index) throws HL7Exception {
     return (XPN) super.insertRepetition(42, index);
  }

  /**
   * Removes a repetition of Mother's Maiden Name (GT1-42) at a given index and returns it.
   * @param index The index
   */
  public XPN removeGt142_MotherSMaidenName(int index) throws HL7Exception {
     return (XPN) super.removeRepetition(42, index);
  }

  /**
   * Returns Nationality (GT1-43).
   */
  public CWE getNationality()  {
    CWE ret = null;
    try {
        Type t = this.getField(43, 0);
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
   * Returns Nationality (GT1-43).
   */
  public CWE getGt143_Nationality()  {
    CWE ret = null;
    try {
        Type t = this.getField(43, 0);
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
   * Returns a single repetition of Ethnic Group (GT1-44).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getEthnicGroup(int rep) throws HL7Exception {
    CWE ret = null;
    try {
        Type t = this.getField(44, rep);
        ret = (CWE)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Ethnic Group (GT1-44).
   */
  public CWE[] getEthnicGroup() {
     CWE[] ret = null;
    try {
        Type[] t = this.getField(44);  
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
   * Returns a count of the number of repetitions of Ethnic Group (GT1-44).
   */
  public int getEthnicGroupReps() {
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
   * Inserts a repetition of Ethnic Group (GT1-44) at a given index and returns it.
   * @param index The index
   */
  public CWE insertEthnicGroup(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(44, index);
  }

  /**
   * Removes a repetition of Ethnic Group (GT1-44) at a given index and returns it.
   * @param index The index
   */
  public CWE removeEthnicGroup(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(44, index);
  }

  /**
   * Returns a single repetition of Ethnic Group (GT1-44).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getGt144_EthnicGroup(int rep) throws HL7Exception {
    CWE ret = null;
    try {
        Type t = this.getField(44, rep);
        ret = (CWE)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Ethnic Group (GT1-44).
   */
  public CWE[] getGt144_EthnicGroup() {
     CWE[] ret = null;
    try {
        Type[] t = this.getField(44);  
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
   * Returns a count of the number of repetitions of Ethnic Group (GT1-44).
   */
  public int getGt144_EthnicGroupReps() {
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
   * Inserts a repetition of Ethnic Group (GT1-44) at a given index and returns it.
   * @param index The index
   */
  public CWE insertGt144_EthnicGroup(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(44, index);
  }

  /**
   * Removes a repetition of Ethnic Group (GT1-44) at a given index and returns it.
   * @param index The index
   */
  public CWE removeGt144_EthnicGroup(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(44, index);
  }

  /**
   * Returns a single repetition of Contact Person's Name (GT1-45).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XPN getContactPersonSName(int rep) throws HL7Exception {
    XPN ret = null;
    try {
        Type t = this.getField(45, rep);
        ret = (XPN)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Contact Person's Name (GT1-45).
   */
  public XPN[] getContactPersonSName() {
     XPN[] ret = null;
    try {
        Type[] t = this.getField(45);  
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
   * Returns a count of the number of repetitions of Contact Person's Name (GT1-45).
   */
  public int getContactPersonSNameReps() {
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
   * Inserts a repetition of Contact Person's Name (GT1-45) at a given index and returns it.
   * @param index The index
   */
  public XPN insertContactPersonSName(int index) throws HL7Exception {
     return (XPN) super.insertRepetition(45, index);
  }

  /**
   * Removes a repetition of Contact Person's Name (GT1-45) at a given index and returns it.
   * @param index The index
   */
  public XPN removeContactPersonSName(int index) throws HL7Exception {
     return (XPN) super.removeRepetition(45, index);
  }

  /**
   * Returns a single repetition of Contact Person's Name (GT1-45).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XPN getGt145_ContactPersonSName(int rep) throws HL7Exception {
    XPN ret = null;
    try {
        Type t = this.getField(45, rep);
        ret = (XPN)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Contact Person's Name (GT1-45).
   */
  public XPN[] getGt145_ContactPersonSName() {
     XPN[] ret = null;
    try {
        Type[] t = this.getField(45);  
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
   * Returns a count of the number of repetitions of Contact Person's Name (GT1-45).
   */
  public int getGt145_ContactPersonSNameReps() {
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
   * Inserts a repetition of Contact Person's Name (GT1-45) at a given index and returns it.
   * @param index The index
   */
  public XPN insertGt145_ContactPersonSName(int index) throws HL7Exception {
     return (XPN) super.insertRepetition(45, index);
  }

  /**
   * Removes a repetition of Contact Person's Name (GT1-45) at a given index and returns it.
   * @param index The index
   */
  public XPN removeGt145_ContactPersonSName(int index) throws HL7Exception {
     return (XPN) super.removeRepetition(45, index);
  }

  /**
   * Returns a single repetition of Contact Person's Telephone Number (GT1-46).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XTN getContactPersonSTelephoneNumber(int rep) throws HL7Exception {
    XTN ret = null;
    try {
        Type t = this.getField(46, rep);
        ret = (XTN)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Contact Person's Telephone Number (GT1-46).
   */
  public XTN[] getContactPersonSTelephoneNumber() {
     XTN[] ret = null;
    try {
        Type[] t = this.getField(46);  
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
   * Returns a count of the number of repetitions of Contact Person's Telephone Number (GT1-46).
   */
  public int getContactPersonSTelephoneNumberReps() {
    try {
        return this.getField(46).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Contact Person's Telephone Number (GT1-46) at a given index and returns it.
   * @param index The index
   */
  public XTN insertContactPersonSTelephoneNumber(int index) throws HL7Exception {
     return (XTN) super.insertRepetition(46, index);
  }

  /**
   * Removes a repetition of Contact Person's Telephone Number (GT1-46) at a given index and returns it.
   * @param index The index
   */
  public XTN removeContactPersonSTelephoneNumber(int index) throws HL7Exception {
     return (XTN) super.removeRepetition(46, index);
  }

  /**
   * Returns a single repetition of Contact Person's Telephone Number (GT1-46).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XTN getGt146_ContactPersonSTelephoneNumber(int rep) throws HL7Exception {
    XTN ret = null;
    try {
        Type t = this.getField(46, rep);
        ret = (XTN)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Contact Person's Telephone Number (GT1-46).
   */
  public XTN[] getGt146_ContactPersonSTelephoneNumber() {
     XTN[] ret = null;
    try {
        Type[] t = this.getField(46);  
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
   * Returns a count of the number of repetitions of Contact Person's Telephone Number (GT1-46).
   */
  public int getGt146_ContactPersonSTelephoneNumberReps() {
    try {
        return this.getField(46).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Contact Person's Telephone Number (GT1-46) at a given index and returns it.
   * @param index The index
   */
  public XTN insertGt146_ContactPersonSTelephoneNumber(int index) throws HL7Exception {
     return (XTN) super.insertRepetition(46, index);
  }

  /**
   * Removes a repetition of Contact Person's Telephone Number (GT1-46) at a given index and returns it.
   * @param index The index
   */
  public XTN removeGt146_ContactPersonSTelephoneNumber(int index) throws HL7Exception {
     return (XTN) super.removeRepetition(46, index);
  }

  /**
   * Returns Contact Reason (GT1-47).
   */
  public CWE getContactReason()  {
    CWE ret = null;
    try {
        Type t = this.getField(47, 0);
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
   * Returns Contact Reason (GT1-47).
   */
  public CWE getGt147_ContactReason()  {
    CWE ret = null;
    try {
        Type t = this.getField(47, 0);
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
   * Returns Contact Relationship (GT1-48).
   */
  public IS getContactRelationship()  {
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
   * Returns Contact Relationship (GT1-48).
   */
  public IS getGt148_ContactRelationship()  {
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
   * Returns Job Title (GT1-49).
   */
  public ST getJobTitle()  {
    ST ret = null;
    try {
        Type t = this.getField(49, 0);
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
   * Returns Job Title (GT1-49).
   */
  public ST getGt149_JobTitle()  {
    ST ret = null;
    try {
        Type t = this.getField(49, 0);
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
   * Returns Job Code/Class (GT1-50).
   */
  public JCC getJobCodeClass()  {
    JCC ret = null;
    try {
        Type t = this.getField(50, 0);
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
   * Returns Job Code/Class (GT1-50).
   */
  public JCC getGt150_JobCodeClass()  {
    JCC ret = null;
    try {
        Type t = this.getField(50, 0);
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
   * Returns a single repetition of Guarantor Employer's Organization Name (GT1-51).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XON getGuarantorEmployerSOrganizationName(int rep) throws HL7Exception {
    XON ret = null;
    try {
        Type t = this.getField(51, rep);
        ret = (XON)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Guarantor Employer's Organization Name (GT1-51).
   */
  public XON[] getGuarantorEmployerSOrganizationName() {
     XON[] ret = null;
    try {
        Type[] t = this.getField(51);  
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
   * Returns a count of the number of repetitions of Guarantor Employer's Organization Name (GT1-51).
   */
  public int getGuarantorEmployerSOrganizationNameReps() {
    try {
        return this.getField(51).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Guarantor Employer's Organization Name (GT1-51) at a given index and returns it.
   * @param index The index
   */
  public XON insertGuarantorEmployerSOrganizationName(int index) throws HL7Exception {
     return (XON) super.insertRepetition(51, index);
  }

  /**
   * Removes a repetition of Guarantor Employer's Organization Name (GT1-51) at a given index and returns it.
   * @param index The index
   */
  public XON removeGuarantorEmployerSOrganizationName(int index) throws HL7Exception {
     return (XON) super.removeRepetition(51, index);
  }

  /**
   * Returns a single repetition of Guarantor Employer's Organization Name (GT1-51).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XON getGt151_GuarantorEmployerSOrganizationName(int rep) throws HL7Exception {
    XON ret = null;
    try {
        Type t = this.getField(51, rep);
        ret = (XON)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Guarantor Employer's Organization Name (GT1-51).
   */
  public XON[] getGt151_GuarantorEmployerSOrganizationName() {
     XON[] ret = null;
    try {
        Type[] t = this.getField(51);  
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
   * Returns a count of the number of repetitions of Guarantor Employer's Organization Name (GT1-51).
   */
  public int getGt151_GuarantorEmployerSOrganizationNameReps() {
    try {
        return this.getField(51).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Guarantor Employer's Organization Name (GT1-51) at a given index and returns it.
   * @param index The index
   */
  public XON insertGt151_GuarantorEmployerSOrganizationName(int index) throws HL7Exception {
     return (XON) super.insertRepetition(51, index);
  }

  /**
   * Removes a repetition of Guarantor Employer's Organization Name (GT1-51) at a given index and returns it.
   * @param index The index
   */
  public XON removeGt151_GuarantorEmployerSOrganizationName(int index) throws HL7Exception {
     return (XON) super.removeRepetition(51, index);
  }

  /**
   * Returns Handicap (GT1-52).
   */
  public IS getHandicap()  {
    IS ret = null;
    try {
        Type t = this.getField(52, 0);
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
   * Returns Handicap (GT1-52).
   */
  public IS getGt152_Handicap()  {
    IS ret = null;
    try {
        Type t = this.getField(52, 0);
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
   * Returns Job Status (GT1-53).
   */
  public IS getJobStatus()  {
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
   * Returns Job Status (GT1-53).
   */
  public IS getGt153_JobStatus()  {
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
   * Returns Guarantor Financial Class (GT1-54).
   */
  public FC getGuarantorFinancialClass()  {
    FC ret = null;
    try {
        Type t = this.getField(54, 0);
        ret = (FC)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns Guarantor Financial Class (GT1-54).
   */
  public FC getGt154_GuarantorFinancialClass()  {
    FC ret = null;
    try {
        Type t = this.getField(54, 0);
        ret = (FC)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns a single repetition of Guarantor Race (GT1-55).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getGuarantorRace(int rep) throws HL7Exception {
    CWE ret = null;
    try {
        Type t = this.getField(55, rep);
        ret = (CWE)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Guarantor Race (GT1-55).
   */
  public CWE[] getGuarantorRace() {
     CWE[] ret = null;
    try {
        Type[] t = this.getField(55);  
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
   * Returns a count of the number of repetitions of Guarantor Race (GT1-55).
   */
  public int getGuarantorRaceReps() {
    try {
        return this.getField(55).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Guarantor Race (GT1-55) at a given index and returns it.
   * @param index The index
   */
  public CWE insertGuarantorRace(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(55, index);
  }

  /**
   * Removes a repetition of Guarantor Race (GT1-55) at a given index and returns it.
   * @param index The index
   */
  public CWE removeGuarantorRace(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(55, index);
  }

  /**
   * Returns a single repetition of Guarantor Race (GT1-55).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getGt155_GuarantorRace(int rep) throws HL7Exception {
    CWE ret = null;
    try {
        Type t = this.getField(55, rep);
        ret = (CWE)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Guarantor Race (GT1-55).
   */
  public CWE[] getGt155_GuarantorRace() {
     CWE[] ret = null;
    try {
        Type[] t = this.getField(55);  
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
   * Returns a count of the number of repetitions of Guarantor Race (GT1-55).
   */
  public int getGt155_GuarantorRaceReps() {
    try {
        return this.getField(55).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Guarantor Race (GT1-55) at a given index and returns it.
   * @param index The index
   */
  public CWE insertGt155_GuarantorRace(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(55, index);
  }

  /**
   * Removes a repetition of Guarantor Race (GT1-55) at a given index and returns it.
   * @param index The index
   */
  public CWE removeGt155_GuarantorRace(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(55, index);
  }

  /**
   * Returns Guarantor Birth Place (GT1-56).
   */
  public ST getGuarantorBirthPlace()  {
    ST ret = null;
    try {
        Type t = this.getField(56, 0);
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
   * Returns Guarantor Birth Place (GT1-56).
   */
  public ST getGt156_GuarantorBirthPlace()  {
    ST ret = null;
    try {
        Type t = this.getField(56, 0);
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
   * Returns VIP Indicator (GT1-57).
   */
  public IS getVIPIndicator()  {
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
   * Returns VIP Indicator (GT1-57).
   */
  public IS getGt157_VIPIndicator()  {
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

   protected Type createNewTypeWithoutReflection(int field) {
      switch (field) {
         case 0: return new ca.uhn.hl7v2.model.v26.datatype.SI(getMessage());
         case 1: return new ca.uhn.hl7v2.model.v26.datatype.CX(getMessage());
         case 2: return new ca.uhn.hl7v2.model.v26.datatype.XPN(getMessage());
         case 3: return new ca.uhn.hl7v2.model.v26.datatype.XPN(getMessage());
         case 4: return new ca.uhn.hl7v2.model.v26.datatype.XAD(getMessage());
         case 5: return new ca.uhn.hl7v2.model.v26.datatype.XTN(getMessage());
         case 6: return new ca.uhn.hl7v2.model.v26.datatype.XTN(getMessage());
         case 7: return new ca.uhn.hl7v2.model.v26.datatype.DTM(getMessage());
         case 8: return new ca.uhn.hl7v2.model.v26.datatype.IS(getMessage(), new Integer(1));
         case 9: return new ca.uhn.hl7v2.model.v26.datatype.IS(getMessage(), new Integer(68));
         case 10: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 11: return new ca.uhn.hl7v2.model.v26.datatype.ST(getMessage());
         case 12: return new ca.uhn.hl7v2.model.v26.datatype.DT(getMessage());
         case 13: return new ca.uhn.hl7v2.model.v26.datatype.DT(getMessage());
         case 14: return new ca.uhn.hl7v2.model.v26.datatype.NM(getMessage());
         case 15: return new ca.uhn.hl7v2.model.v26.datatype.XPN(getMessage());
         case 16: return new ca.uhn.hl7v2.model.v26.datatype.XAD(getMessage());
         case 17: return new ca.uhn.hl7v2.model.v26.datatype.XTN(getMessage());
         case 18: return new ca.uhn.hl7v2.model.v26.datatype.CX(getMessage());
         case 19: return new ca.uhn.hl7v2.model.v26.datatype.IS(getMessage(), new Integer(66));
         case 20: return new ca.uhn.hl7v2.model.v26.datatype.XON(getMessage());
         case 21: return new ca.uhn.hl7v2.model.v26.datatype.ID(getMessage(), new Integer(136));
         case 22: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 23: return new ca.uhn.hl7v2.model.v26.datatype.DTM(getMessage());
         case 24: return new ca.uhn.hl7v2.model.v26.datatype.ID(getMessage(), new Integer(136));
         case 25: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 26: return new ca.uhn.hl7v2.model.v26.datatype.CP(getMessage());
         case 27: return new ca.uhn.hl7v2.model.v26.datatype.NM(getMessage());
         case 28: return new ca.uhn.hl7v2.model.v26.datatype.CX(getMessage());
         case 29: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 30: return new ca.uhn.hl7v2.model.v26.datatype.DT(getMessage());
         case 31: return new ca.uhn.hl7v2.model.v26.datatype.DT(getMessage());
         case 32: return new ca.uhn.hl7v2.model.v26.datatype.IS(getMessage(), new Integer(223));
         case 33: return new ca.uhn.hl7v2.model.v26.datatype.IS(getMessage(), new Integer(9));
         case 34: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 35: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 36: return new ca.uhn.hl7v2.model.v26.datatype.IS(getMessage(), new Integer(220));
         case 37: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 38: return new ca.uhn.hl7v2.model.v26.datatype.ID(getMessage(), new Integer(136));
         case 39: return new ca.uhn.hl7v2.model.v26.datatype.IS(getMessage(), new Integer(231));
         case 40: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 41: return new ca.uhn.hl7v2.model.v26.datatype.XPN(getMessage());
         case 42: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 43: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 44: return new ca.uhn.hl7v2.model.v26.datatype.XPN(getMessage());
         case 45: return new ca.uhn.hl7v2.model.v26.datatype.XTN(getMessage());
         case 46: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 47: return new ca.uhn.hl7v2.model.v26.datatype.IS(getMessage(), new Integer(63));
         case 48: return new ca.uhn.hl7v2.model.v26.datatype.ST(getMessage());
         case 49: return new ca.uhn.hl7v2.model.v26.datatype.JCC(getMessage());
         case 50: return new ca.uhn.hl7v2.model.v26.datatype.XON(getMessage());
         case 51: return new ca.uhn.hl7v2.model.v26.datatype.IS(getMessage(), new Integer(295));
         case 52: return new ca.uhn.hl7v2.model.v26.datatype.IS(getMessage(), new Integer(311));
         case 53: return new ca.uhn.hl7v2.model.v26.datatype.FC(getMessage());
         case 54: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 55: return new ca.uhn.hl7v2.model.v26.datatype.ST(getMessage());
         case 56: return new ca.uhn.hl7v2.model.v26.datatype.IS(getMessage(), new Integer(99));
         default: return null;
      }
   }

}