package ca.uhn.hl7v2.model.v26.segment;

import ca.uhn.hl7v2.model.*;
import ca.uhn.hl7v2.model.v26.datatype.*;
import ca.uhn.log.HapiLogFactory;
import ca.uhn.hl7v2.parser.ModelClassFactory;
import ca.uhn.hl7v2.HL7Exception;

/**
 * <p>Represents an HL7 DRG message segment. 
 * This segment has the following fields:</p><p>
 * DRG-1: Diagnostic Related Group (CNE)<br> 
 * DRG-2: DRG Assigned Date/Time (DTM)<br> 
 * DRG-3: DRG Approval Indicator (ID)<br> 
 * DRG-4: DRG Grouper Review Code (IS)<br> 
 * DRG-5: Outlier Type (CWE)<br> 
 * DRG-6: Outlier Days (NM)<br> 
 * DRG-7: Outlier Cost (CP)<br> 
 * DRG-8: DRG Payor (IS)<br> 
 * DRG-9: Outlier Reimbursement (CP)<br> 
 * DRG-10: Confidential Indicator (ID)<br> 
 * DRG-11: DRG Transfer Type (IS)<br> 
 * DRG-12: Name of Coder (XPN)<br> 
 * DRG-13: Grouper Status (CWE)<br> 
 * DRG-14: PCCL Value Code (CWE)<br> 
 * DRG-15: Effective Weight (NM)<br> 
 * DRG-16: Monetary Amount (MO)<br> 
 * DRG-17: Status Patient (IS)<br> 
 * DRG-18: Grouper Software Name (ST)<br> 
 * DRG-19: Grouper Software Version (ST)<br> 
 * DRG-20: Status Financial Calculation (IS)<br> 
 * DRG-21: Relative Discount/Surcharge (MO)<br> 
 * DRG-22: Basic Charge (MO)<br> 
 * DRG-23: Total Charge (MO)<br> 
 * DRG-24: Discount/Surcharge (MO)<br> 
 * DRG-25: Calculated Days (NM)<br> 
 * DRG-26: Status Gender (IS)<br> 
 * DRG-27: Status Age (IS)<br> 
 * DRG-28: Status Length of Stay (IS)<br> 
 * DRG-29: Status Same Day Flag (IS)<br> 
 * DRG-30: Status Separation Mode (IS)<br> 
 * DRG-31: Status Weight at Birth (IS)<br> 
 * DRG-32: Status Respiration Minutes (IS)<br> 
 * DRG-33: Status Admission (IS)<br> 
 * </p><p>The get...() methods return data from individual fields.  These methods 
 * do not throw exceptions and may therefore have to handle exceptions internally.  
 * If an exception is handled internally, it is logged and null is returned.  
 * This is not expected to happen - if it does happen this indicates not so much 
 * an exceptional circumstance as a bug in the code for this class.</p>    
 */
public class DRG extends AbstractSegment  {

  /**
   * Creates a DRG (Diagnosis Related Group) segment object that belongs to the given 
   * message.  
   */
  public DRG(Group parent, ModelClassFactory factory) {
    super(parent, factory);
    Message message = getMessage();
    try {
       this.add(CNE.class, false, 1, 250, new Object[]{message}, "Diagnostic Related Group");
       this.add(DTM.class, false, 1, 24, new Object[]{message}, "DRG Assigned Date/Time");
       this.add(ID.class, false, 1, 1, new Object[]{message, new Integer(136)}, "DRG Approval Indicator");
       this.add(IS.class, false, 1, 2, new Object[]{message, new Integer(56)}, "DRG Grouper Review Code");
       this.add(CWE.class, false, 1, 250, new Object[]{message}, "Outlier Type");
       this.add(NM.class, false, 1, 3, new Object[]{message}, "Outlier Days");
       this.add(CP.class, false, 1, 12, new Object[]{message}, "Outlier Cost");
       this.add(IS.class, false, 1, 1, new Object[]{message, new Integer(229)}, "DRG Payor");
       this.add(CP.class, false, 1, 9, new Object[]{message}, "Outlier Reimbursement");
       this.add(ID.class, false, 1, 1, new Object[]{message, new Integer(136)}, "Confidential Indicator");
       this.add(IS.class, false, 1, 21, new Object[]{message, new Integer(415)}, "DRG Transfer Type");
       this.add(XPN.class, false, 1, 1103, new Object[]{message}, "Name of Coder");
       this.add(CWE.class, false, 1, 705, new Object[]{message}, "Grouper Status");
       this.add(CWE.class, false, 1, 20, new Object[]{message}, "PCCL Value Code");
       this.add(NM.class, false, 1, 5, new Object[]{message}, "Effective Weight");
       this.add(MO.class, false, 1, 20, new Object[]{message}, "Monetary Amount");
       this.add(IS.class, false, 1, 20, new Object[]{message, new Integer(739)}, "Status Patient");
       this.add(ST.class, false, 1, 100, new Object[]{message}, "Grouper Software Name");
       this.add(ST.class, false, 1, 100, new Object[]{message}, "Grouper Software Version");
       this.add(IS.class, false, 1, 20, new Object[]{message, new Integer(742)}, "Status Financial Calculation");
       this.add(MO.class, false, 1, 20, new Object[]{message}, "Relative Discount/Surcharge");
       this.add(MO.class, false, 1, 20, new Object[]{message}, "Basic Charge");
       this.add(MO.class, false, 1, 20, new Object[]{message}, "Total Charge");
       this.add(MO.class, false, 1, 20, new Object[]{message}, "Discount/Surcharge");
       this.add(NM.class, false, 1, 5, new Object[]{message}, "Calculated Days");
       this.add(IS.class, false, 1, 20, new Object[]{message, new Integer(749)}, "Status Gender");
       this.add(IS.class, false, 1, 20, new Object[]{message, new Integer(749)}, "Status Age");
       this.add(IS.class, false, 1, 20, new Object[]{message, new Integer(749)}, "Status Length of Stay");
       this.add(IS.class, false, 1, 20, new Object[]{message, new Integer(749)}, "Status Same Day Flag");
       this.add(IS.class, false, 1, 20, new Object[]{message, new Integer(749)}, "Status Separation Mode");
       this.add(IS.class, false, 1, 20, new Object[]{message, new Integer(755)}, "Status Weight at Birth");
       this.add(IS.class, false, 1, 20, new Object[]{message, new Integer(757)}, "Status Respiration Minutes");
       this.add(IS.class, false, 1, 20, new Object[]{message, new Integer(759)}, "Status Admission");
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Can't instantiate " + this.getClass().getName(), he);
    }
  }

  /**
   * Returns Diagnostic Related Group (DRG-1).
   */
  public CNE getDiagnosticRelatedGroup()  {
    CNE ret = null;
    try {
        Type t = this.getField(1, 0);
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
   * Returns Diagnostic Related Group (DRG-1).
   */
  public CNE getDrg1_DiagnosticRelatedGroup()  {
    CNE ret = null;
    try {
        Type t = this.getField(1, 0);
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
   * Returns DRG Assigned Date/Time (DRG-2).
   */
  public DTM getDRGAssignedDateTime()  {
    DTM ret = null;
    try {
        Type t = this.getField(2, 0);
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
   * Returns DRG Assigned Date/Time (DRG-2).
   */
  public DTM getDrg2_DRGAssignedDateTime()  {
    DTM ret = null;
    try {
        Type t = this.getField(2, 0);
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
   * Returns DRG Approval Indicator (DRG-3).
   */
  public ID getDRGApprovalIndicator()  {
    ID ret = null;
    try {
        Type t = this.getField(3, 0);
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
   * Returns DRG Approval Indicator (DRG-3).
   */
  public ID getDrg3_DRGApprovalIndicator()  {
    ID ret = null;
    try {
        Type t = this.getField(3, 0);
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
   * Returns DRG Grouper Review Code (DRG-4).
   */
  public IS getDRGGrouperReviewCode()  {
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
   * Returns DRG Grouper Review Code (DRG-4).
   */
  public IS getDrg4_DRGGrouperReviewCode()  {
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
   * Returns Outlier Type (DRG-5).
   */
  public CWE getOutlierType()  {
    CWE ret = null;
    try {
        Type t = this.getField(5, 0);
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
   * Returns Outlier Type (DRG-5).
   */
  public CWE getDrg5_OutlierType()  {
    CWE ret = null;
    try {
        Type t = this.getField(5, 0);
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
   * Returns Outlier Days (DRG-6).
   */
  public NM getOutlierDays()  {
    NM ret = null;
    try {
        Type t = this.getField(6, 0);
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
   * Returns Outlier Days (DRG-6).
   */
  public NM getDrg6_OutlierDays()  {
    NM ret = null;
    try {
        Type t = this.getField(6, 0);
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
   * Returns Outlier Cost (DRG-7).
   */
  public CP getOutlierCost()  {
    CP ret = null;
    try {
        Type t = this.getField(7, 0);
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
   * Returns Outlier Cost (DRG-7).
   */
  public CP getDrg7_OutlierCost()  {
    CP ret = null;
    try {
        Type t = this.getField(7, 0);
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
   * Returns DRG Payor (DRG-8).
   */
  public IS getDRGPayor()  {
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
   * Returns DRG Payor (DRG-8).
   */
  public IS getDrg8_DRGPayor()  {
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
   * Returns Outlier Reimbursement (DRG-9).
   */
  public CP getOutlierReimbursement()  {
    CP ret = null;
    try {
        Type t = this.getField(9, 0);
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
   * Returns Outlier Reimbursement (DRG-9).
   */
  public CP getDrg9_OutlierReimbursement()  {
    CP ret = null;
    try {
        Type t = this.getField(9, 0);
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
   * Returns Confidential Indicator (DRG-10).
   */
  public ID getConfidentialIndicator()  {
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
   * Returns Confidential Indicator (DRG-10).
   */
  public ID getDrg10_ConfidentialIndicator()  {
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
   * Returns DRG Transfer Type (DRG-11).
   */
  public IS getDRGTransferType()  {
    IS ret = null;
    try {
        Type t = this.getField(11, 0);
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
   * Returns DRG Transfer Type (DRG-11).
   */
  public IS getDrg11_DRGTransferType()  {
    IS ret = null;
    try {
        Type t = this.getField(11, 0);
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
   * Returns Name of Coder (DRG-12).
   */
  public XPN getNameOfCoder()  {
    XPN ret = null;
    try {
        Type t = this.getField(12, 0);
        ret = (XPN)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns Name of Coder (DRG-12).
   */
  public XPN getDrg12_NameOfCoder()  {
    XPN ret = null;
    try {
        Type t = this.getField(12, 0);
        ret = (XPN)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns Grouper Status (DRG-13).
   */
  public CWE getGrouperStatus()  {
    CWE ret = null;
    try {
        Type t = this.getField(13, 0);
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
   * Returns Grouper Status (DRG-13).
   */
  public CWE getDrg13_GrouperStatus()  {
    CWE ret = null;
    try {
        Type t = this.getField(13, 0);
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
   * Returns PCCL Value Code (DRG-14).
   */
  public CWE getPCCLValueCode()  {
    CWE ret = null;
    try {
        Type t = this.getField(14, 0);
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
   * Returns PCCL Value Code (DRG-14).
   */
  public CWE getDrg14_PCCLValueCode()  {
    CWE ret = null;
    try {
        Type t = this.getField(14, 0);
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
   * Returns Effective Weight (DRG-15).
   */
  public NM getEffectiveWeight()  {
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
   * Returns Effective Weight (DRG-15).
   */
  public NM getDrg15_EffectiveWeight()  {
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
   * Returns Monetary Amount (DRG-16).
   */
  public MO getMonetaryAmount()  {
    MO ret = null;
    try {
        Type t = this.getField(16, 0);
        ret = (MO)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns Monetary Amount (DRG-16).
   */
  public MO getDrg16_MonetaryAmount()  {
    MO ret = null;
    try {
        Type t = this.getField(16, 0);
        ret = (MO)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns Status Patient (DRG-17).
   */
  public IS getStatusPatient()  {
    IS ret = null;
    try {
        Type t = this.getField(17, 0);
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
   * Returns Status Patient (DRG-17).
   */
  public IS getDrg17_StatusPatient()  {
    IS ret = null;
    try {
        Type t = this.getField(17, 0);
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
   * Returns Grouper Software Name (DRG-18).
   */
  public ST getGrouperSoftwareName()  {
    ST ret = null;
    try {
        Type t = this.getField(18, 0);
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
   * Returns Grouper Software Name (DRG-18).
   */
  public ST getDrg18_GrouperSoftwareName()  {
    ST ret = null;
    try {
        Type t = this.getField(18, 0);
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
   * Returns Grouper Software Version (DRG-19).
   */
  public ST getGrouperSoftwareVersion()  {
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
   * Returns Grouper Software Version (DRG-19).
   */
  public ST getDrg19_GrouperSoftwareVersion()  {
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
   * Returns Status Financial Calculation (DRG-20).
   */
  public IS getStatusFinancialCalculation()  {
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
   * Returns Status Financial Calculation (DRG-20).
   */
  public IS getDrg20_StatusFinancialCalculation()  {
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
   * Returns Relative Discount/Surcharge (DRG-21).
   */
  public MO getRelativeDiscountSurcharge()  {
    MO ret = null;
    try {
        Type t = this.getField(21, 0);
        ret = (MO)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns Relative Discount/Surcharge (DRG-21).
   */
  public MO getDrg21_RelativeDiscountSurcharge()  {
    MO ret = null;
    try {
        Type t = this.getField(21, 0);
        ret = (MO)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns Basic Charge (DRG-22).
   */
  public MO getBasicCharge()  {
    MO ret = null;
    try {
        Type t = this.getField(22, 0);
        ret = (MO)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns Basic Charge (DRG-22).
   */
  public MO getDrg22_BasicCharge()  {
    MO ret = null;
    try {
        Type t = this.getField(22, 0);
        ret = (MO)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns Total Charge (DRG-23).
   */
  public MO getTotalCharge()  {
    MO ret = null;
    try {
        Type t = this.getField(23, 0);
        ret = (MO)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns Total Charge (DRG-23).
   */
  public MO getDrg23_TotalCharge()  {
    MO ret = null;
    try {
        Type t = this.getField(23, 0);
        ret = (MO)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns Discount/Surcharge (DRG-24).
   */
  public MO getDiscountSurcharge()  {
    MO ret = null;
    try {
        Type t = this.getField(24, 0);
        ret = (MO)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns Discount/Surcharge (DRG-24).
   */
  public MO getDrg24_DiscountSurcharge()  {
    MO ret = null;
    try {
        Type t = this.getField(24, 0);
        ret = (MO)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns Calculated Days (DRG-25).
   */
  public NM getCalculatedDays()  {
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
   * Returns Calculated Days (DRG-25).
   */
  public NM getDrg25_CalculatedDays()  {
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
   * Returns Status Gender (DRG-26).
   */
  public IS getStatusGender()  {
    IS ret = null;
    try {
        Type t = this.getField(26, 0);
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
   * Returns Status Gender (DRG-26).
   */
  public IS getDrg26_StatusGender()  {
    IS ret = null;
    try {
        Type t = this.getField(26, 0);
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
   * Returns Status Age (DRG-27).
   */
  public IS getStatusAge()  {
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
   * Returns Status Age (DRG-27).
   */
  public IS getDrg27_StatusAge()  {
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
   * Returns Status Length of Stay (DRG-28).
   */
  public IS getStatusLengthOfStay()  {
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
   * Returns Status Length of Stay (DRG-28).
   */
  public IS getDrg28_StatusLengthOfStay()  {
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
   * Returns Status Same Day Flag (DRG-29).
   */
  public IS getStatusSameDayFlag()  {
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
   * Returns Status Same Day Flag (DRG-29).
   */
  public IS getDrg29_StatusSameDayFlag()  {
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
   * Returns Status Separation Mode (DRG-30).
   */
  public IS getStatusSeparationMode()  {
    IS ret = null;
    try {
        Type t = this.getField(30, 0);
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
   * Returns Status Separation Mode (DRG-30).
   */
  public IS getDrg30_StatusSeparationMode()  {
    IS ret = null;
    try {
        Type t = this.getField(30, 0);
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
   * Returns Status Weight at Birth (DRG-31).
   */
  public IS getStatusWeightAtBirth()  {
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
   * Returns Status Weight at Birth (DRG-31).
   */
  public IS getDrg31_StatusWeightAtBirth()  {
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
   * Returns Status Respiration Minutes (DRG-32).
   */
  public IS getStatusRespirationMinutes()  {
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
   * Returns Status Respiration Minutes (DRG-32).
   */
  public IS getDrg32_StatusRespirationMinutes()  {
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
   * Returns Status Admission (DRG-33).
   */
  public IS getStatusAdmission()  {
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
   * Returns Status Admission (DRG-33).
   */
  public IS getDrg33_StatusAdmission()  {
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

   protected Type createNewTypeWithoutReflection(int field) {
      switch (field) {
         case 0: return new ca.uhn.hl7v2.model.v26.datatype.CNE(getMessage());
         case 1: return new ca.uhn.hl7v2.model.v26.datatype.DTM(getMessage());
         case 2: return new ca.uhn.hl7v2.model.v26.datatype.ID(getMessage(), new Integer(136));
         case 3: return new ca.uhn.hl7v2.model.v26.datatype.IS(getMessage(), new Integer(56));
         case 4: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 5: return new ca.uhn.hl7v2.model.v26.datatype.NM(getMessage());
         case 6: return new ca.uhn.hl7v2.model.v26.datatype.CP(getMessage());
         case 7: return new ca.uhn.hl7v2.model.v26.datatype.IS(getMessage(), new Integer(229));
         case 8: return new ca.uhn.hl7v2.model.v26.datatype.CP(getMessage());
         case 9: return new ca.uhn.hl7v2.model.v26.datatype.ID(getMessage(), new Integer(136));
         case 10: return new ca.uhn.hl7v2.model.v26.datatype.IS(getMessage(), new Integer(415));
         case 11: return new ca.uhn.hl7v2.model.v26.datatype.XPN(getMessage());
         case 12: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 13: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 14: return new ca.uhn.hl7v2.model.v26.datatype.NM(getMessage());
         case 15: return new ca.uhn.hl7v2.model.v26.datatype.MO(getMessage());
         case 16: return new ca.uhn.hl7v2.model.v26.datatype.IS(getMessage(), new Integer(739));
         case 17: return new ca.uhn.hl7v2.model.v26.datatype.ST(getMessage());
         case 18: return new ca.uhn.hl7v2.model.v26.datatype.ST(getMessage());
         case 19: return new ca.uhn.hl7v2.model.v26.datatype.IS(getMessage(), new Integer(742));
         case 20: return new ca.uhn.hl7v2.model.v26.datatype.MO(getMessage());
         case 21: return new ca.uhn.hl7v2.model.v26.datatype.MO(getMessage());
         case 22: return new ca.uhn.hl7v2.model.v26.datatype.MO(getMessage());
         case 23: return new ca.uhn.hl7v2.model.v26.datatype.MO(getMessage());
         case 24: return new ca.uhn.hl7v2.model.v26.datatype.NM(getMessage());
         case 25: return new ca.uhn.hl7v2.model.v26.datatype.IS(getMessage(), new Integer(749));
         case 26: return new ca.uhn.hl7v2.model.v26.datatype.IS(getMessage(), new Integer(749));
         case 27: return new ca.uhn.hl7v2.model.v26.datatype.IS(getMessage(), new Integer(749));
         case 28: return new ca.uhn.hl7v2.model.v26.datatype.IS(getMessage(), new Integer(749));
         case 29: return new ca.uhn.hl7v2.model.v26.datatype.IS(getMessage(), new Integer(749));
         case 30: return new ca.uhn.hl7v2.model.v26.datatype.IS(getMessage(), new Integer(755));
         case 31: return new ca.uhn.hl7v2.model.v26.datatype.IS(getMessage(), new Integer(757));
         case 32: return new ca.uhn.hl7v2.model.v26.datatype.IS(getMessage(), new Integer(759));
         default: return null;
      }
   }

}