package ca.uhn.hl7v2.model.v26.segment;

import ca.uhn.hl7v2.model.*;
import ca.uhn.hl7v2.model.v26.datatype.*;
import ca.uhn.log.HapiLogFactory;
import ca.uhn.hl7v2.parser.ModelClassFactory;
import ca.uhn.hl7v2.HL7Exception;

/**
 * <p>Represents an HL7 DG1 message segment. 
 * This segment has the following fields:</p><p>
 * DG1-1: Set ID - DG1 (SI)<br> 
 * DG1-2: Diagnosis Coding Method (-)<br> 
 * DG1-3: Diagnosis Code - DG1 (CWE)<br> 
 * DG1-4: Diagnosis Description (-)<br> 
 * DG1-5: Diagnosis Date/Time (DTM)<br> 
 * DG1-6: Diagnosis Type (IS)<br> 
 * DG1-7: Major Diagnostic Category (CNE)<br> 
 * DG1-8: Diagnostic Related Group (CNE)<br> 
 * DG1-9: DRG Approval Indicator (ID)<br> 
 * DG1-10: DRG Grouper Review Code (IS)<br> 
 * DG1-11: Outlier Type (CWE)<br> 
 * DG1-12: Outlier Days (NM)<br> 
 * DG1-13: Outlier Cost (CP)<br> 
 * DG1-14: Grouper Version And Type (-)<br> 
 * DG1-15: Diagnosis Priority (ID)<br> 
 * DG1-16: Diagnosing Clinician (XCN)<br> 
 * DG1-17: Diagnosis Classification (IS)<br> 
 * DG1-18: Confidential Indicator (ID)<br> 
 * DG1-19: Attestation Date/Time (DTM)<br> 
 * DG1-20: Diagnosis Identifier (EI)<br> 
 * DG1-21: Diagnosis Action Code (ID)<br> 
 * DG1-22: Parent Diagnosis (EI)<br> 
 * DG1-23: DRG CCL Value Code (CWE)<br> 
 * DG1-24: DRG Grouping Usage (ID)<br> 
 * DG1-25: DRG Diagnosis Determination Status (IS)<br> 
 * DG1-26: Present On Admission (POA) Indicator (IS)<br> 
 * </p><p>The get...() methods return data from individual fields.  These methods 
 * do not throw exceptions and may therefore have to handle exceptions internally.  
 * If an exception is handled internally, it is logged and null is returned.  
 * This is not expected to happen - if it does happen this indicates not so much 
 * an exceptional circumstance as a bug in the code for this class.</p>    
 */
public class DG1 extends AbstractSegment  {

  /**
   * Creates a DG1 (Diagnosis) segment object that belongs to the given 
   * message.  
   */
  public DG1(Group parent, ModelClassFactory factory) {
    super(parent, factory);
    Message message = getMessage();
    try {
       this.add(SI.class, true, 1, 4, new Object[]{message}, "Set ID - DG1");
       this.add(NULLDT.class, false, 1, 0, new Object[]{message}, "Diagnosis Coding Method");
       this.add(CWE.class, true, 1, 250, new Object[]{message}, "Diagnosis Code - DG1");
       this.add(NULLDT.class, false, 1, 0, new Object[]{message}, "Diagnosis Description");
       this.add(DTM.class, false, 1, 24, new Object[]{message}, "Diagnosis Date/Time");
       this.add(IS.class, true, 1, 2, new Object[]{message, new Integer(52)}, "Diagnosis Type");
       this.add(CNE.class, false, 1, 1, new Object[]{message}, "Major Diagnostic Category");
       this.add(CNE.class, false, 1, 250, new Object[]{message}, "Diagnostic Related Group");
       this.add(ID.class, false, 1, 1, new Object[]{message, new Integer(136)}, "DRG Approval Indicator");
       this.add(IS.class, false, 1, 2, new Object[]{message, new Integer(56)}, "DRG Grouper Review Code");
       this.add(CWE.class, false, 1, 250, new Object[]{message}, "Outlier Type");
       this.add(NM.class, false, 1, 3, new Object[]{message}, "Outlier Days");
       this.add(CP.class, false, 1, 12, new Object[]{message}, "Outlier Cost");
       this.add(NULLDT.class, false, 1, 0, new Object[]{message}, "Grouper Version And Type");
       this.add(ID.class, false, 1, 2, new Object[]{message, new Integer(359)}, "Diagnosis Priority");
       this.add(XCN.class, false, 0, 250, new Object[]{message}, "Diagnosing Clinician");
       this.add(IS.class, false, 1, 3, new Object[]{message, new Integer(228)}, "Diagnosis Classification");
       this.add(ID.class, false, 1, 1, new Object[]{message, new Integer(136)}, "Confidential Indicator");
       this.add(DTM.class, false, 1, 24, new Object[]{message}, "Attestation Date/Time");
       this.add(EI.class, false, 1, 427, new Object[]{message}, "Diagnosis Identifier");
       this.add(ID.class, false, 1, 1, new Object[]{message, new Integer(206)}, "Diagnosis Action Code");
       this.add(EI.class, false, 1, 427, new Object[]{message}, "Parent Diagnosis");
       this.add(CWE.class, false, 1, 705, new Object[]{message}, "DRG CCL Value Code");
       this.add(ID.class, false, 1, 20, new Object[]{message, new Integer(136)}, "DRG Grouping Usage");
       this.add(IS.class, false, 1, 20, new Object[]{message, new Integer(731)}, "DRG Diagnosis Determination Status");
       this.add(IS.class, false, 1, 1, new Object[]{message, new Integer(895)}, "Present On Admission (POA) Indicator");
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Can't instantiate " + this.getClass().getName(), he);
    }
  }

  /**
   * Returns Set ID - DG1 (DG1-1).
   */
  public SI getSetIDDG1()  {
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
   * Returns Set ID - DG1 (DG1-1).
   */
  public SI getDg11_SetIDDG1()  {
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
   * Returns Diagnosis Coding Method (DG1-2).
   */
  public NULLDT getDiagnosisCodingMethod()  {
    NULLDT ret = null;
    try {
        Type t = this.getField(2, 0);
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
   * Returns Diagnosis Coding Method (DG1-2).
   */
  public NULLDT getDg12_DiagnosisCodingMethod()  {
    NULLDT ret = null;
    try {
        Type t = this.getField(2, 0);
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
   * Returns Diagnosis Code - DG1 (DG1-3).
   */
  public CWE getDiagnosisCodeDG1()  {
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
   * Returns Diagnosis Code - DG1 (DG1-3).
   */
  public CWE getDg13_DiagnosisCodeDG1()  {
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
   * Returns Diagnosis Description (DG1-4).
   */
  public NULLDT getDiagnosisDescription()  {
    NULLDT ret = null;
    try {
        Type t = this.getField(4, 0);
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
   * Returns Diagnosis Description (DG1-4).
   */
  public NULLDT getDg14_DiagnosisDescription()  {
    NULLDT ret = null;
    try {
        Type t = this.getField(4, 0);
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
   * Returns Diagnosis Date/Time (DG1-5).
   */
  public DTM getDiagnosisDateTime()  {
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
   * Returns Diagnosis Date/Time (DG1-5).
   */
  public DTM getDg15_DiagnosisDateTime()  {
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
   * Returns Diagnosis Type (DG1-6).
   */
  public IS getDiagnosisType()  {
    IS ret = null;
    try {
        Type t = this.getField(6, 0);
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
   * Returns Diagnosis Type (DG1-6).
   */
  public IS getDg16_DiagnosisType()  {
    IS ret = null;
    try {
        Type t = this.getField(6, 0);
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
   * Returns Major Diagnostic Category (DG1-7).
   */
  public CNE getMajorDiagnosticCategory()  {
    CNE ret = null;
    try {
        Type t = this.getField(7, 0);
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
   * Returns Major Diagnostic Category (DG1-7).
   */
  public CNE getDg17_MajorDiagnosticCategory()  {
    CNE ret = null;
    try {
        Type t = this.getField(7, 0);
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
   * Returns Diagnostic Related Group (DG1-8).
   */
  public CNE getDiagnosticRelatedGroup()  {
    CNE ret = null;
    try {
        Type t = this.getField(8, 0);
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
   * Returns Diagnostic Related Group (DG1-8).
   */
  public CNE getDg18_DiagnosticRelatedGroup()  {
    CNE ret = null;
    try {
        Type t = this.getField(8, 0);
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
   * Returns DRG Approval Indicator (DG1-9).
   */
  public ID getDRGApprovalIndicator()  {
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
   * Returns DRG Approval Indicator (DG1-9).
   */
  public ID getDg19_DRGApprovalIndicator()  {
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
   * Returns DRG Grouper Review Code (DG1-10).
   */
  public IS getDRGGrouperReviewCode()  {
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
   * Returns DRG Grouper Review Code (DG1-10).
   */
  public IS getDg110_DRGGrouperReviewCode()  {
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
   * Returns Outlier Type (DG1-11).
   */
  public CWE getOutlierType()  {
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
   * Returns Outlier Type (DG1-11).
   */
  public CWE getDg111_OutlierType()  {
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
   * Returns Outlier Days (DG1-12).
   */
  public NM getOutlierDays()  {
    NM ret = null;
    try {
        Type t = this.getField(12, 0);
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
   * Returns Outlier Days (DG1-12).
   */
  public NM getDg112_OutlierDays()  {
    NM ret = null;
    try {
        Type t = this.getField(12, 0);
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
   * Returns Outlier Cost (DG1-13).
   */
  public CP getOutlierCost()  {
    CP ret = null;
    try {
        Type t = this.getField(13, 0);
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
   * Returns Outlier Cost (DG1-13).
   */
  public CP getDg113_OutlierCost()  {
    CP ret = null;
    try {
        Type t = this.getField(13, 0);
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
   * Returns Grouper Version And Type (DG1-14).
   */
  public NULLDT getGrouperVersionAndType()  {
    NULLDT ret = null;
    try {
        Type t = this.getField(14, 0);
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
   * Returns Grouper Version And Type (DG1-14).
   */
  public NULLDT getDg114_GrouperVersionAndType()  {
    NULLDT ret = null;
    try {
        Type t = this.getField(14, 0);
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
   * Returns Diagnosis Priority (DG1-15).
   */
  public ID getDiagnosisPriority()  {
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
   * Returns Diagnosis Priority (DG1-15).
   */
  public ID getDg115_DiagnosisPriority()  {
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
   * Returns a single repetition of Diagnosing Clinician (DG1-16).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XCN getDiagnosingClinician(int rep) throws HL7Exception {
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
   * Returns all repetitions of Diagnosing Clinician (DG1-16).
   */
  public XCN[] getDiagnosingClinician() {
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
   * Returns a count of the number of repetitions of Diagnosing Clinician (DG1-16).
   */
  public int getDiagnosingClinicianReps() {
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
   * Inserts a repetition of Diagnosing Clinician (DG1-16) at a given index and returns it.
   * @param index The index
   */
  public XCN insertDiagnosingClinician(int index) throws HL7Exception {
     return (XCN) super.insertRepetition(16, index);
  }

  /**
   * Removes a repetition of Diagnosing Clinician (DG1-16) at a given index and returns it.
   * @param index The index
   */
  public XCN removeDiagnosingClinician(int index) throws HL7Exception {
     return (XCN) super.removeRepetition(16, index);
  }

  /**
   * Returns a single repetition of Diagnosing Clinician (DG1-16).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XCN getDg116_DiagnosingClinician(int rep) throws HL7Exception {
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
   * Returns all repetitions of Diagnosing Clinician (DG1-16).
   */
  public XCN[] getDg116_DiagnosingClinician() {
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
   * Returns a count of the number of repetitions of Diagnosing Clinician (DG1-16).
   */
  public int getDg116_DiagnosingClinicianReps() {
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
   * Inserts a repetition of Diagnosing Clinician (DG1-16) at a given index and returns it.
   * @param index The index
   */
  public XCN insertDg116_DiagnosingClinician(int index) throws HL7Exception {
     return (XCN) super.insertRepetition(16, index);
  }

  /**
   * Removes a repetition of Diagnosing Clinician (DG1-16) at a given index and returns it.
   * @param index The index
   */
  public XCN removeDg116_DiagnosingClinician(int index) throws HL7Exception {
     return (XCN) super.removeRepetition(16, index);
  }

  /**
   * Returns Diagnosis Classification (DG1-17).
   */
  public IS getDiagnosisClassification()  {
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
   * Returns Diagnosis Classification (DG1-17).
   */
  public IS getDg117_DiagnosisClassification()  {
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
   * Returns Confidential Indicator (DG1-18).
   */
  public ID getConfidentialIndicator()  {
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
   * Returns Confidential Indicator (DG1-18).
   */
  public ID getDg118_ConfidentialIndicator()  {
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
   * Returns Attestation Date/Time (DG1-19).
   */
  public DTM getAttestationDateTime()  {
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
   * Returns Attestation Date/Time (DG1-19).
   */
  public DTM getDg119_AttestationDateTime()  {
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
   * Returns Diagnosis Identifier (DG1-20).
   */
  public EI getDiagnosisIdentifier()  {
    EI ret = null;
    try {
        Type t = this.getField(20, 0);
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
   * Returns Diagnosis Identifier (DG1-20).
   */
  public EI getDg120_DiagnosisIdentifier()  {
    EI ret = null;
    try {
        Type t = this.getField(20, 0);
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
   * Returns Diagnosis Action Code (DG1-21).
   */
  public ID getDiagnosisActionCode()  {
    ID ret = null;
    try {
        Type t = this.getField(21, 0);
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
   * Returns Diagnosis Action Code (DG1-21).
   */
  public ID getDg121_DiagnosisActionCode()  {
    ID ret = null;
    try {
        Type t = this.getField(21, 0);
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
   * Returns Parent Diagnosis (DG1-22).
   */
  public EI getParentDiagnosis()  {
    EI ret = null;
    try {
        Type t = this.getField(22, 0);
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
   * Returns Parent Diagnosis (DG1-22).
   */
  public EI getDg122_ParentDiagnosis()  {
    EI ret = null;
    try {
        Type t = this.getField(22, 0);
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
   * Returns DRG CCL Value Code (DG1-23).
   */
  public CWE getDRGCCLValueCode()  {
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
   * Returns DRG CCL Value Code (DG1-23).
   */
  public CWE getDg123_DRGCCLValueCode()  {
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
   * Returns DRG Grouping Usage (DG1-24).
   */
  public ID getDRGGroupingUsage()  {
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
   * Returns DRG Grouping Usage (DG1-24).
   */
  public ID getDg124_DRGGroupingUsage()  {
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
   * Returns DRG Diagnosis Determination Status (DG1-25).
   */
  public IS getDRGDiagnosisDeterminationStatus()  {
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
   * Returns DRG Diagnosis Determination Status (DG1-25).
   */
  public IS getDg125_DRGDiagnosisDeterminationStatus()  {
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
   * Returns Present On Admission (POA) Indicator (DG1-26).
   */
  public IS getPresentOnAdmissionIndicator()  {
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
   * Returns Present On Admission (POA) Indicator (DG1-26).
   */
  public IS getDg126_PresentOnAdmissionIndicator()  {
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

   protected Type createNewTypeWithoutReflection(int field) {
      switch (field) {
         case 0: return new ca.uhn.hl7v2.model.v26.datatype.SI(getMessage());
         case 1: return new ca.uhn.hl7v2.model.v26.datatype.NULLDT(getMessage());
         case 2: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 3: return new ca.uhn.hl7v2.model.v26.datatype.NULLDT(getMessage());
         case 4: return new ca.uhn.hl7v2.model.v26.datatype.DTM(getMessage());
         case 5: return new ca.uhn.hl7v2.model.v26.datatype.IS(getMessage(), new Integer(52));
         case 6: return new ca.uhn.hl7v2.model.v26.datatype.CNE(getMessage());
         case 7: return new ca.uhn.hl7v2.model.v26.datatype.CNE(getMessage());
         case 8: return new ca.uhn.hl7v2.model.v26.datatype.ID(getMessage(), new Integer(136));
         case 9: return new ca.uhn.hl7v2.model.v26.datatype.IS(getMessage(), new Integer(56));
         case 10: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 11: return new ca.uhn.hl7v2.model.v26.datatype.NM(getMessage());
         case 12: return new ca.uhn.hl7v2.model.v26.datatype.CP(getMessage());
         case 13: return new ca.uhn.hl7v2.model.v26.datatype.NULLDT(getMessage());
         case 14: return new ca.uhn.hl7v2.model.v26.datatype.ID(getMessage(), new Integer(359));
         case 15: return new ca.uhn.hl7v2.model.v26.datatype.XCN(getMessage());
         case 16: return new ca.uhn.hl7v2.model.v26.datatype.IS(getMessage(), new Integer(228));
         case 17: return new ca.uhn.hl7v2.model.v26.datatype.ID(getMessage(), new Integer(136));
         case 18: return new ca.uhn.hl7v2.model.v26.datatype.DTM(getMessage());
         case 19: return new ca.uhn.hl7v2.model.v26.datatype.EI(getMessage());
         case 20: return new ca.uhn.hl7v2.model.v26.datatype.ID(getMessage(), new Integer(206));
         case 21: return new ca.uhn.hl7v2.model.v26.datatype.EI(getMessage());
         case 22: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 23: return new ca.uhn.hl7v2.model.v26.datatype.ID(getMessage(), new Integer(136));
         case 24: return new ca.uhn.hl7v2.model.v26.datatype.IS(getMessage(), new Integer(731));
         case 25: return new ca.uhn.hl7v2.model.v26.datatype.IS(getMessage(), new Integer(895));
         default: return null;
      }
   }

}