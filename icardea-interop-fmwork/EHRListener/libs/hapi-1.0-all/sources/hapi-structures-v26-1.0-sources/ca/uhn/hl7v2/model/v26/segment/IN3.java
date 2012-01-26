package ca.uhn.hl7v2.model.v26.segment;

import ca.uhn.hl7v2.model.*;
import ca.uhn.hl7v2.model.v26.datatype.*;
import ca.uhn.log.HapiLogFactory;
import ca.uhn.hl7v2.parser.ModelClassFactory;
import ca.uhn.hl7v2.HL7Exception;

/**
 * <p>Represents an HL7 IN3 message segment. 
 * This segment has the following fields:</p><p>
 * IN3-1: Set ID - IN3 (SI)<br> 
 * IN3-2: Certification Number (CX)<br> 
 * IN3-3: Certified By (XCN)<br> 
 * IN3-4: Certification Required (ID)<br> 
 * IN3-5: Penalty (MOP)<br> 
 * IN3-6: Certification Date/Time (DTM)<br> 
 * IN3-7: Certification Modify Date/Time (DTM)<br> 
 * IN3-8: Operator (XCN)<br> 
 * IN3-9: Certification Begin Date (DT)<br> 
 * IN3-10: Certification End Date (DT)<br> 
 * IN3-11: Days (DTN)<br> 
 * IN3-12: Non-Concur Code/Description (CWE)<br> 
 * IN3-13: Non-Concur Effective Date/Time (DTM)<br> 
 * IN3-14: Physician Reviewer (XCN)<br> 
 * IN3-15: Certification Contact (ST)<br> 
 * IN3-16: Certification Contact Phone Number (XTN)<br> 
 * IN3-17: Appeal Reason (CWE)<br> 
 * IN3-18: Certification Agency (CWE)<br> 
 * IN3-19: Certification Agency Phone Number (XTN)<br> 
 * IN3-20: Pre-Certification Requirement (ICD)<br> 
 * IN3-21: Case Manager (ST)<br> 
 * IN3-22: Second Opinion Date (DT)<br> 
 * IN3-23: Second Opinion Status (IS)<br> 
 * IN3-24: Second Opinion Documentation Received (IS)<br> 
 * IN3-25: Second Opinion Physician (XCN)<br> 
 * </p><p>The get...() methods return data from individual fields.  These methods 
 * do not throw exceptions and may therefore have to handle exceptions internally.  
 * If an exception is handled internally, it is logged and null is returned.  
 * This is not expected to happen - if it does happen this indicates not so much 
 * an exceptional circumstance as a bug in the code for this class.</p>    
 */
public class IN3 extends AbstractSegment  {

  /**
   * Creates a IN3 (Insurance Additional Information, Certification) segment object that belongs to the given 
   * message.  
   */
  public IN3(Group parent, ModelClassFactory factory) {
    super(parent, factory);
    Message message = getMessage();
    try {
       this.add(SI.class, true, 1, 4, new Object[]{message}, "Set ID - IN3");
       this.add(CX.class, false, 1, 250, new Object[]{message}, "Certification Number");
       this.add(XCN.class, false, 0, 250, new Object[]{message}, "Certified By");
       this.add(ID.class, false, 1, 1, new Object[]{message, new Integer(136)}, "Certification Required");
       this.add(MOP.class, false, 1, 23, new Object[]{message}, "Penalty");
       this.add(DTM.class, false, 1, 24, new Object[]{message}, "Certification Date/Time");
       this.add(DTM.class, false, 1, 24, new Object[]{message}, "Certification Modify Date/Time");
       this.add(XCN.class, false, 0, 250, new Object[]{message}, "Operator");
       this.add(DT.class, false, 1, 8, new Object[]{message}, "Certification Begin Date");
       this.add(DT.class, false, 1, 8, new Object[]{message}, "Certification End Date");
       this.add(DTN.class, false, 1, 6, new Object[]{message}, "Days");
       this.add(CWE.class, false, 1, 250, new Object[]{message}, "Non-Concur Code/Description");
       this.add(DTM.class, false, 1, 24, new Object[]{message}, "Non-Concur Effective Date/Time");
       this.add(XCN.class, false, 0, 250, new Object[]{message}, "Physician Reviewer");
       this.add(ST.class, false, 1, 48, new Object[]{message}, "Certification Contact");
       this.add(XTN.class, false, 0, 250, new Object[]{message}, "Certification Contact Phone Number");
       this.add(CWE.class, false, 1, 250, new Object[]{message}, "Appeal Reason");
       this.add(CWE.class, false, 1, 250, new Object[]{message}, "Certification Agency");
       this.add(XTN.class, false, 0, 250, new Object[]{message}, "Certification Agency Phone Number");
       this.add(ICD.class, false, 0, 40, new Object[]{message}, "Pre-Certification Requirement");
       this.add(ST.class, false, 1, 48, new Object[]{message}, "Case Manager");
       this.add(DT.class, false, 1, 8, new Object[]{message}, "Second Opinion Date");
       this.add(IS.class, false, 1, 1, new Object[]{message, new Integer(151)}, "Second Opinion Status");
       this.add(IS.class, false, 0, 1, new Object[]{message, new Integer(152)}, "Second Opinion Documentation Received");
       this.add(XCN.class, false, 0, 250, new Object[]{message}, "Second Opinion Physician");
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Can't instantiate " + this.getClass().getName(), he);
    }
  }

  /**
   * Returns Set ID - IN3 (IN3-1).
   */
  public SI getSetIDIN3()  {
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
   * Returns Set ID - IN3 (IN3-1).
   */
  public SI getIn31_SetIDIN3()  {
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
   * Returns Certification Number (IN3-2).
   */
  public CX getCertificationNumber()  {
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
   * Returns Certification Number (IN3-2).
   */
  public CX getIn32_CertificationNumber()  {
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
   * Returns a single repetition of Certified By (IN3-3).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XCN getCertifiedBy(int rep) throws HL7Exception {
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
   * Returns all repetitions of Certified By (IN3-3).
   */
  public XCN[] getCertifiedBy() {
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
   * Returns a count of the number of repetitions of Certified By (IN3-3).
   */
  public int getCertifiedByReps() {
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
   * Inserts a repetition of Certified By (IN3-3) at a given index and returns it.
   * @param index The index
   */
  public XCN insertCertifiedBy(int index) throws HL7Exception {
     return (XCN) super.insertRepetition(3, index);
  }

  /**
   * Removes a repetition of Certified By (IN3-3) at a given index and returns it.
   * @param index The index
   */
  public XCN removeCertifiedBy(int index) throws HL7Exception {
     return (XCN) super.removeRepetition(3, index);
  }

  /**
   * Returns a single repetition of Certified By (IN3-3).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XCN getIn33_CertifiedBy(int rep) throws HL7Exception {
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
   * Returns all repetitions of Certified By (IN3-3).
   */
  public XCN[] getIn33_CertifiedBy() {
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
   * Returns a count of the number of repetitions of Certified By (IN3-3).
   */
  public int getIn33_CertifiedByReps() {
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
   * Inserts a repetition of Certified By (IN3-3) at a given index and returns it.
   * @param index The index
   */
  public XCN insertIn33_CertifiedBy(int index) throws HL7Exception {
     return (XCN) super.insertRepetition(3, index);
  }

  /**
   * Removes a repetition of Certified By (IN3-3) at a given index and returns it.
   * @param index The index
   */
  public XCN removeIn33_CertifiedBy(int index) throws HL7Exception {
     return (XCN) super.removeRepetition(3, index);
  }

  /**
   * Returns Certification Required (IN3-4).
   */
  public ID getCertificationRequired()  {
    ID ret = null;
    try {
        Type t = this.getField(4, 0);
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
   * Returns Certification Required (IN3-4).
   */
  public ID getIn34_CertificationRequired()  {
    ID ret = null;
    try {
        Type t = this.getField(4, 0);
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
   * Returns Penalty (IN3-5).
   */
  public MOP getPenalty()  {
    MOP ret = null;
    try {
        Type t = this.getField(5, 0);
        ret = (MOP)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns Penalty (IN3-5).
   */
  public MOP getIn35_Penalty()  {
    MOP ret = null;
    try {
        Type t = this.getField(5, 0);
        ret = (MOP)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns Certification Date/Time (IN3-6).
   */
  public DTM getCertificationDateTime()  {
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
   * Returns Certification Date/Time (IN3-6).
   */
  public DTM getIn36_CertificationDateTime()  {
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
   * Returns Certification Modify Date/Time (IN3-7).
   */
  public DTM getCertificationModifyDateTime()  {
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
   * Returns Certification Modify Date/Time (IN3-7).
   */
  public DTM getIn37_CertificationModifyDateTime()  {
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
   * Returns a single repetition of Operator (IN3-8).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XCN getOperator(int rep) throws HL7Exception {
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
   * Returns all repetitions of Operator (IN3-8).
   */
  public XCN[] getOperator() {
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
   * Returns a count of the number of repetitions of Operator (IN3-8).
   */
  public int getOperatorReps() {
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
   * Inserts a repetition of Operator (IN3-8) at a given index and returns it.
   * @param index The index
   */
  public XCN insertOperator(int index) throws HL7Exception {
     return (XCN) super.insertRepetition(8, index);
  }

  /**
   * Removes a repetition of Operator (IN3-8) at a given index and returns it.
   * @param index The index
   */
  public XCN removeOperator(int index) throws HL7Exception {
     return (XCN) super.removeRepetition(8, index);
  }

  /**
   * Returns a single repetition of Operator (IN3-8).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XCN getIn38_Operator(int rep) throws HL7Exception {
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
   * Returns all repetitions of Operator (IN3-8).
   */
  public XCN[] getIn38_Operator() {
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
   * Returns a count of the number of repetitions of Operator (IN3-8).
   */
  public int getIn38_OperatorReps() {
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
   * Inserts a repetition of Operator (IN3-8) at a given index and returns it.
   * @param index The index
   */
  public XCN insertIn38_Operator(int index) throws HL7Exception {
     return (XCN) super.insertRepetition(8, index);
  }

  /**
   * Removes a repetition of Operator (IN3-8) at a given index and returns it.
   * @param index The index
   */
  public XCN removeIn38_Operator(int index) throws HL7Exception {
     return (XCN) super.removeRepetition(8, index);
  }

  /**
   * Returns Certification Begin Date (IN3-9).
   */
  public DT getCertificationBeginDate()  {
    DT ret = null;
    try {
        Type t = this.getField(9, 0);
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
   * Returns Certification Begin Date (IN3-9).
   */
  public DT getIn39_CertificationBeginDate()  {
    DT ret = null;
    try {
        Type t = this.getField(9, 0);
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
   * Returns Certification End Date (IN3-10).
   */
  public DT getCertificationEndDate()  {
    DT ret = null;
    try {
        Type t = this.getField(10, 0);
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
   * Returns Certification End Date (IN3-10).
   */
  public DT getIn310_CertificationEndDate()  {
    DT ret = null;
    try {
        Type t = this.getField(10, 0);
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
   * Returns Days (IN3-11).
   */
  public DTN getDays()  {
    DTN ret = null;
    try {
        Type t = this.getField(11, 0);
        ret = (DTN)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns Days (IN3-11).
   */
  public DTN getIn311_Days()  {
    DTN ret = null;
    try {
        Type t = this.getField(11, 0);
        ret = (DTN)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns Non-Concur Code/Description (IN3-12).
   */
  public CWE getNonConcurCodeDescription()  {
    CWE ret = null;
    try {
        Type t = this.getField(12, 0);
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
   * Returns Non-Concur Code/Description (IN3-12).
   */
  public CWE getIn312_NonConcurCodeDescription()  {
    CWE ret = null;
    try {
        Type t = this.getField(12, 0);
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
   * Returns Non-Concur Effective Date/Time (IN3-13).
   */
  public DTM getNonConcurEffectiveDateTime()  {
    DTM ret = null;
    try {
        Type t = this.getField(13, 0);
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
   * Returns Non-Concur Effective Date/Time (IN3-13).
   */
  public DTM getIn313_NonConcurEffectiveDateTime()  {
    DTM ret = null;
    try {
        Type t = this.getField(13, 0);
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
   * Returns a single repetition of Physician Reviewer (IN3-14).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XCN getPhysicianReviewer(int rep) throws HL7Exception {
    XCN ret = null;
    try {
        Type t = this.getField(14, rep);
        ret = (XCN)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Physician Reviewer (IN3-14).
   */
  public XCN[] getPhysicianReviewer() {
     XCN[] ret = null;
    try {
        Type[] t = this.getField(14);  
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
   * Returns a count of the number of repetitions of Physician Reviewer (IN3-14).
   */
  public int getPhysicianReviewerReps() {
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
   * Inserts a repetition of Physician Reviewer (IN3-14) at a given index and returns it.
   * @param index The index
   */
  public XCN insertPhysicianReviewer(int index) throws HL7Exception {
     return (XCN) super.insertRepetition(14, index);
  }

  /**
   * Removes a repetition of Physician Reviewer (IN3-14) at a given index and returns it.
   * @param index The index
   */
  public XCN removePhysicianReviewer(int index) throws HL7Exception {
     return (XCN) super.removeRepetition(14, index);
  }

  /**
   * Returns a single repetition of Physician Reviewer (IN3-14).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XCN getIn314_PhysicianReviewer(int rep) throws HL7Exception {
    XCN ret = null;
    try {
        Type t = this.getField(14, rep);
        ret = (XCN)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Physician Reviewer (IN3-14).
   */
  public XCN[] getIn314_PhysicianReviewer() {
     XCN[] ret = null;
    try {
        Type[] t = this.getField(14);  
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
   * Returns a count of the number of repetitions of Physician Reviewer (IN3-14).
   */
  public int getIn314_PhysicianReviewerReps() {
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
   * Inserts a repetition of Physician Reviewer (IN3-14) at a given index and returns it.
   * @param index The index
   */
  public XCN insertIn314_PhysicianReviewer(int index) throws HL7Exception {
     return (XCN) super.insertRepetition(14, index);
  }

  /**
   * Removes a repetition of Physician Reviewer (IN3-14) at a given index and returns it.
   * @param index The index
   */
  public XCN removeIn314_PhysicianReviewer(int index) throws HL7Exception {
     return (XCN) super.removeRepetition(14, index);
  }

  /**
   * Returns Certification Contact (IN3-15).
   */
  public ST getCertificationContact()  {
    ST ret = null;
    try {
        Type t = this.getField(15, 0);
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
   * Returns Certification Contact (IN3-15).
   */
  public ST getIn315_CertificationContact()  {
    ST ret = null;
    try {
        Type t = this.getField(15, 0);
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
   * Returns a single repetition of Certification Contact Phone Number (IN3-16).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XTN getCertificationContactPhoneNumber(int rep) throws HL7Exception {
    XTN ret = null;
    try {
        Type t = this.getField(16, rep);
        ret = (XTN)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Certification Contact Phone Number (IN3-16).
   */
  public XTN[] getCertificationContactPhoneNumber() {
     XTN[] ret = null;
    try {
        Type[] t = this.getField(16);  
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
   * Returns a count of the number of repetitions of Certification Contact Phone Number (IN3-16).
   */
  public int getCertificationContactPhoneNumberReps() {
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
   * Inserts a repetition of Certification Contact Phone Number (IN3-16) at a given index and returns it.
   * @param index The index
   */
  public XTN insertCertificationContactPhoneNumber(int index) throws HL7Exception {
     return (XTN) super.insertRepetition(16, index);
  }

  /**
   * Removes a repetition of Certification Contact Phone Number (IN3-16) at a given index and returns it.
   * @param index The index
   */
  public XTN removeCertificationContactPhoneNumber(int index) throws HL7Exception {
     return (XTN) super.removeRepetition(16, index);
  }

  /**
   * Returns a single repetition of Certification Contact Phone Number (IN3-16).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XTN getIn316_CertificationContactPhoneNumber(int rep) throws HL7Exception {
    XTN ret = null;
    try {
        Type t = this.getField(16, rep);
        ret = (XTN)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Certification Contact Phone Number (IN3-16).
   */
  public XTN[] getIn316_CertificationContactPhoneNumber() {
     XTN[] ret = null;
    try {
        Type[] t = this.getField(16);  
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
   * Returns a count of the number of repetitions of Certification Contact Phone Number (IN3-16).
   */
  public int getIn316_CertificationContactPhoneNumberReps() {
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
   * Inserts a repetition of Certification Contact Phone Number (IN3-16) at a given index and returns it.
   * @param index The index
   */
  public XTN insertIn316_CertificationContactPhoneNumber(int index) throws HL7Exception {
     return (XTN) super.insertRepetition(16, index);
  }

  /**
   * Removes a repetition of Certification Contact Phone Number (IN3-16) at a given index and returns it.
   * @param index The index
   */
  public XTN removeIn316_CertificationContactPhoneNumber(int index) throws HL7Exception {
     return (XTN) super.removeRepetition(16, index);
  }

  /**
   * Returns Appeal Reason (IN3-17).
   */
  public CWE getAppealReason()  {
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
   * Returns Appeal Reason (IN3-17).
   */
  public CWE getIn317_AppealReason()  {
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
   * Returns Certification Agency (IN3-18).
   */
  public CWE getCertificationAgency()  {
    CWE ret = null;
    try {
        Type t = this.getField(18, 0);
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
   * Returns Certification Agency (IN3-18).
   */
  public CWE getIn318_CertificationAgency()  {
    CWE ret = null;
    try {
        Type t = this.getField(18, 0);
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
   * Returns a single repetition of Certification Agency Phone Number (IN3-19).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XTN getCertificationAgencyPhoneNumber(int rep) throws HL7Exception {
    XTN ret = null;
    try {
        Type t = this.getField(19, rep);
        ret = (XTN)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Certification Agency Phone Number (IN3-19).
   */
  public XTN[] getCertificationAgencyPhoneNumber() {
     XTN[] ret = null;
    try {
        Type[] t = this.getField(19);  
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
   * Returns a count of the number of repetitions of Certification Agency Phone Number (IN3-19).
   */
  public int getCertificationAgencyPhoneNumberReps() {
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
   * Inserts a repetition of Certification Agency Phone Number (IN3-19) at a given index and returns it.
   * @param index The index
   */
  public XTN insertCertificationAgencyPhoneNumber(int index) throws HL7Exception {
     return (XTN) super.insertRepetition(19, index);
  }

  /**
   * Removes a repetition of Certification Agency Phone Number (IN3-19) at a given index and returns it.
   * @param index The index
   */
  public XTN removeCertificationAgencyPhoneNumber(int index) throws HL7Exception {
     return (XTN) super.removeRepetition(19, index);
  }

  /**
   * Returns a single repetition of Certification Agency Phone Number (IN3-19).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XTN getIn319_CertificationAgencyPhoneNumber(int rep) throws HL7Exception {
    XTN ret = null;
    try {
        Type t = this.getField(19, rep);
        ret = (XTN)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Certification Agency Phone Number (IN3-19).
   */
  public XTN[] getIn319_CertificationAgencyPhoneNumber() {
     XTN[] ret = null;
    try {
        Type[] t = this.getField(19);  
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
   * Returns a count of the number of repetitions of Certification Agency Phone Number (IN3-19).
   */
  public int getIn319_CertificationAgencyPhoneNumberReps() {
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
   * Inserts a repetition of Certification Agency Phone Number (IN3-19) at a given index and returns it.
   * @param index The index
   */
  public XTN insertIn319_CertificationAgencyPhoneNumber(int index) throws HL7Exception {
     return (XTN) super.insertRepetition(19, index);
  }

  /**
   * Removes a repetition of Certification Agency Phone Number (IN3-19) at a given index and returns it.
   * @param index The index
   */
  public XTN removeIn319_CertificationAgencyPhoneNumber(int index) throws HL7Exception {
     return (XTN) super.removeRepetition(19, index);
  }

  /**
   * Returns a single repetition of Pre-Certification Requirement (IN3-20).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public ICD getPreCertificationRequirement(int rep) throws HL7Exception {
    ICD ret = null;
    try {
        Type t = this.getField(20, rep);
        ret = (ICD)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Pre-Certification Requirement (IN3-20).
   */
  public ICD[] getPreCertificationRequirement() {
     ICD[] ret = null;
    try {
        Type[] t = this.getField(20);  
        ret = new ICD[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (ICD)t[i];
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
   * Returns a count of the number of repetitions of Pre-Certification Requirement (IN3-20).
   */
  public int getPreCertificationRequirementReps() {
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
   * Inserts a repetition of Pre-Certification Requirement (IN3-20) at a given index and returns it.
   * @param index The index
   */
  public ICD insertPreCertificationRequirement(int index) throws HL7Exception {
     return (ICD) super.insertRepetition(20, index);
  }

  /**
   * Removes a repetition of Pre-Certification Requirement (IN3-20) at a given index and returns it.
   * @param index The index
   */
  public ICD removePreCertificationRequirement(int index) throws HL7Exception {
     return (ICD) super.removeRepetition(20, index);
  }

  /**
   * Returns a single repetition of Pre-Certification Requirement (IN3-20).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public ICD getIn320_PreCertificationRequirement(int rep) throws HL7Exception {
    ICD ret = null;
    try {
        Type t = this.getField(20, rep);
        ret = (ICD)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Pre-Certification Requirement (IN3-20).
   */
  public ICD[] getIn320_PreCertificationRequirement() {
     ICD[] ret = null;
    try {
        Type[] t = this.getField(20);  
        ret = new ICD[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (ICD)t[i];
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
   * Returns a count of the number of repetitions of Pre-Certification Requirement (IN3-20).
   */
  public int getIn320_PreCertificationRequirementReps() {
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
   * Inserts a repetition of Pre-Certification Requirement (IN3-20) at a given index and returns it.
   * @param index The index
   */
  public ICD insertIn320_PreCertificationRequirement(int index) throws HL7Exception {
     return (ICD) super.insertRepetition(20, index);
  }

  /**
   * Removes a repetition of Pre-Certification Requirement (IN3-20) at a given index and returns it.
   * @param index The index
   */
  public ICD removeIn320_PreCertificationRequirement(int index) throws HL7Exception {
     return (ICD) super.removeRepetition(20, index);
  }

  /**
   * Returns Case Manager (IN3-21).
   */
  public ST getCaseManager()  {
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
   * Returns Case Manager (IN3-21).
   */
  public ST getIn321_CaseManager()  {
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
   * Returns Second Opinion Date (IN3-22).
   */
  public DT getSecondOpinionDate()  {
    DT ret = null;
    try {
        Type t = this.getField(22, 0);
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
   * Returns Second Opinion Date (IN3-22).
   */
  public DT getIn322_SecondOpinionDate()  {
    DT ret = null;
    try {
        Type t = this.getField(22, 0);
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
   * Returns Second Opinion Status (IN3-23).
   */
  public IS getSecondOpinionStatus()  {
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
   * Returns Second Opinion Status (IN3-23).
   */
  public IS getIn323_SecondOpinionStatus()  {
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
   * Returns a single repetition of Second Opinion Documentation Received (IN3-24).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public IS getSecondOpinionDocumentationReceived(int rep) throws HL7Exception {
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
   * Returns all repetitions of Second Opinion Documentation Received (IN3-24).
   */
  public IS[] getSecondOpinionDocumentationReceived() {
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
   * Returns a count of the number of repetitions of Second Opinion Documentation Received (IN3-24).
   */
  public int getSecondOpinionDocumentationReceivedReps() {
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
   * Inserts a repetition of Second Opinion Documentation Received (IN3-24) at a given index and returns it.
   * @param index The index
   */
  public IS insertSecondOpinionDocumentationReceived(int index) throws HL7Exception {
     return (IS) super.insertRepetition(24, index);
  }

  /**
   * Removes a repetition of Second Opinion Documentation Received (IN3-24) at a given index and returns it.
   * @param index The index
   */
  public IS removeSecondOpinionDocumentationReceived(int index) throws HL7Exception {
     return (IS) super.removeRepetition(24, index);
  }

  /**
   * Returns a single repetition of Second Opinion Documentation Received (IN3-24).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public IS getIn324_SecondOpinionDocumentationReceived(int rep) throws HL7Exception {
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
   * Returns all repetitions of Second Opinion Documentation Received (IN3-24).
   */
  public IS[] getIn324_SecondOpinionDocumentationReceived() {
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
   * Returns a count of the number of repetitions of Second Opinion Documentation Received (IN3-24).
   */
  public int getIn324_SecondOpinionDocumentationReceivedReps() {
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
   * Inserts a repetition of Second Opinion Documentation Received (IN3-24) at a given index and returns it.
   * @param index The index
   */
  public IS insertIn324_SecondOpinionDocumentationReceived(int index) throws HL7Exception {
     return (IS) super.insertRepetition(24, index);
  }

  /**
   * Removes a repetition of Second Opinion Documentation Received (IN3-24) at a given index and returns it.
   * @param index The index
   */
  public IS removeIn324_SecondOpinionDocumentationReceived(int index) throws HL7Exception {
     return (IS) super.removeRepetition(24, index);
  }

  /**
   * Returns a single repetition of Second Opinion Physician (IN3-25).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XCN getSecondOpinionPhysician(int rep) throws HL7Exception {
    XCN ret = null;
    try {
        Type t = this.getField(25, rep);
        ret = (XCN)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Second Opinion Physician (IN3-25).
   */
  public XCN[] getSecondOpinionPhysician() {
     XCN[] ret = null;
    try {
        Type[] t = this.getField(25);  
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
   * Returns a count of the number of repetitions of Second Opinion Physician (IN3-25).
   */
  public int getSecondOpinionPhysicianReps() {
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
   * Inserts a repetition of Second Opinion Physician (IN3-25) at a given index and returns it.
   * @param index The index
   */
  public XCN insertSecondOpinionPhysician(int index) throws HL7Exception {
     return (XCN) super.insertRepetition(25, index);
  }

  /**
   * Removes a repetition of Second Opinion Physician (IN3-25) at a given index and returns it.
   * @param index The index
   */
  public XCN removeSecondOpinionPhysician(int index) throws HL7Exception {
     return (XCN) super.removeRepetition(25, index);
  }

  /**
   * Returns a single repetition of Second Opinion Physician (IN3-25).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XCN getIn325_SecondOpinionPhysician(int rep) throws HL7Exception {
    XCN ret = null;
    try {
        Type t = this.getField(25, rep);
        ret = (XCN)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Second Opinion Physician (IN3-25).
   */
  public XCN[] getIn325_SecondOpinionPhysician() {
     XCN[] ret = null;
    try {
        Type[] t = this.getField(25);  
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
   * Returns a count of the number of repetitions of Second Opinion Physician (IN3-25).
   */
  public int getIn325_SecondOpinionPhysicianReps() {
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
   * Inserts a repetition of Second Opinion Physician (IN3-25) at a given index and returns it.
   * @param index The index
   */
  public XCN insertIn325_SecondOpinionPhysician(int index) throws HL7Exception {
     return (XCN) super.insertRepetition(25, index);
  }

  /**
   * Removes a repetition of Second Opinion Physician (IN3-25) at a given index and returns it.
   * @param index The index
   */
  public XCN removeIn325_SecondOpinionPhysician(int index) throws HL7Exception {
     return (XCN) super.removeRepetition(25, index);
  }

   protected Type createNewTypeWithoutReflection(int field) {
      switch (field) {
         case 0: return new ca.uhn.hl7v2.model.v26.datatype.SI(getMessage());
         case 1: return new ca.uhn.hl7v2.model.v26.datatype.CX(getMessage());
         case 2: return new ca.uhn.hl7v2.model.v26.datatype.XCN(getMessage());
         case 3: return new ca.uhn.hl7v2.model.v26.datatype.ID(getMessage(), new Integer(136));
         case 4: return new ca.uhn.hl7v2.model.v26.datatype.MOP(getMessage());
         case 5: return new ca.uhn.hl7v2.model.v26.datatype.DTM(getMessage());
         case 6: return new ca.uhn.hl7v2.model.v26.datatype.DTM(getMessage());
         case 7: return new ca.uhn.hl7v2.model.v26.datatype.XCN(getMessage());
         case 8: return new ca.uhn.hl7v2.model.v26.datatype.DT(getMessage());
         case 9: return new ca.uhn.hl7v2.model.v26.datatype.DT(getMessage());
         case 10: return new ca.uhn.hl7v2.model.v26.datatype.DTN(getMessage());
         case 11: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 12: return new ca.uhn.hl7v2.model.v26.datatype.DTM(getMessage());
         case 13: return new ca.uhn.hl7v2.model.v26.datatype.XCN(getMessage());
         case 14: return new ca.uhn.hl7v2.model.v26.datatype.ST(getMessage());
         case 15: return new ca.uhn.hl7v2.model.v26.datatype.XTN(getMessage());
         case 16: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 17: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 18: return new ca.uhn.hl7v2.model.v26.datatype.XTN(getMessage());
         case 19: return new ca.uhn.hl7v2.model.v26.datatype.ICD(getMessage());
         case 20: return new ca.uhn.hl7v2.model.v26.datatype.ST(getMessage());
         case 21: return new ca.uhn.hl7v2.model.v26.datatype.DT(getMessage());
         case 22: return new ca.uhn.hl7v2.model.v26.datatype.IS(getMessage(), new Integer(151));
         case 23: return new ca.uhn.hl7v2.model.v26.datatype.IS(getMessage(), new Integer(152));
         case 24: return new ca.uhn.hl7v2.model.v26.datatype.XCN(getMessage());
         default: return null;
      }
   }

}