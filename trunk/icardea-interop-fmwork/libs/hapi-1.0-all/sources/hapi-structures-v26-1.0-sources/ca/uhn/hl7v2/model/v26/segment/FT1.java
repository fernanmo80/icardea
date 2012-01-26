package ca.uhn.hl7v2.model.v26.segment;

import ca.uhn.hl7v2.model.*;
import ca.uhn.hl7v2.model.v26.datatype.*;
import ca.uhn.log.HapiLogFactory;
import ca.uhn.hl7v2.parser.ModelClassFactory;
import ca.uhn.hl7v2.HL7Exception;

/**
 * <p>Represents an HL7 FT1 message segment. 
 * This segment has the following fields:</p><p>
 * FT1-1: Set ID - FT1 (SI)<br> 
 * FT1-2: Transaction ID (ST)<br> 
 * FT1-3: Transaction Batch ID (ST)<br> 
 * FT1-4: Transaction Date (DR)<br> 
 * FT1-5: Transaction Posting Date (DTM)<br> 
 * FT1-6: Transaction Type (IS)<br> 
 * FT1-7: Transaction Code (CWE)<br> 
 * FT1-8: Transaction Description (-)<br> 
 * FT1-9: Transaction Description - Alt (-)<br> 
 * FT1-10: Transaction Quantity (NM)<br> 
 * FT1-11: Transaction Amount - Extended (CP)<br> 
 * FT1-12: Transaction amount - unit (CP)<br> 
 * FT1-13: Department Code (CWE)<br> 
 * FT1-14: Insurance Plan ID (CWE)<br> 
 * FT1-15: Insurance Amount (CP)<br> 
 * FT1-16: Assigned Patient Location (PL)<br> 
 * FT1-17: Fee Schedule (IS)<br> 
 * FT1-18: Patient Type (IS)<br> 
 * FT1-19: Diagnosis Code - FT1 (CWE)<br> 
 * FT1-20: Performed By Code (XCN)<br> 
 * FT1-21: Ordered By Code (XCN)<br> 
 * FT1-22: Unit Cost (CP)<br> 
 * FT1-23: Filler Order Number (EI)<br> 
 * FT1-24: Entered By Code (XCN)<br> 
 * FT1-25: Procedure Code (CNE)<br> 
 * FT1-26: Procedure Code Modifier (CNE)<br> 
 * FT1-27: Advanced Beneficiary Notice Code (CWE)<br> 
 * FT1-28: Medically Necessary Duplicate Procedure Reason (CWE)<br> 
 * FT1-29: NDC Code (CWE)<br> 
 * FT1-30: Payment Reference ID (CX)<br> 
 * FT1-31: Transaction Reference Key (SI)<br> 
 * </p><p>The get...() methods return data from individual fields.  These methods 
 * do not throw exceptions and may therefore have to handle exceptions internally.  
 * If an exception is handled internally, it is logged and null is returned.  
 * This is not expected to happen - if it does happen this indicates not so much 
 * an exceptional circumstance as a bug in the code for this class.</p>    
 */
public class FT1 extends AbstractSegment  {

  /**
   * Creates a FT1 (Financial Transaction) segment object that belongs to the given 
   * message.  
   */
  public FT1(Group parent, ModelClassFactory factory) {
    super(parent, factory);
    Message message = getMessage();
    try {
       this.add(SI.class, false, 1, 4, new Object[]{message}, "Set ID - FT1");
       this.add(ST.class, false, 1, 12, new Object[]{message}, "Transaction ID");
       this.add(ST.class, false, 1, 10, new Object[]{message}, "Transaction Batch ID");
       this.add(DR.class, true, 1, 53, new Object[]{message}, "Transaction Date");
       this.add(DTM.class, false, 1, 24, new Object[]{message}, "Transaction Posting Date");
       this.add(IS.class, true, 1, 8, new Object[]{message, new Integer(17)}, "Transaction Type");
       this.add(CWE.class, true, 1, 250, new Object[]{message}, "Transaction Code");
       this.add(NULLDT.class, false, 1, 0, new Object[]{message}, "Transaction Description");
       this.add(NULLDT.class, false, 1, 0, new Object[]{message}, "Transaction Description - Alt");
       this.add(NM.class, false, 1, 6, new Object[]{message}, "Transaction Quantity");
       this.add(CP.class, false, 1, 12, new Object[]{message}, "Transaction Amount - Extended");
       this.add(CP.class, false, 1, 12, new Object[]{message}, "Transaction amount - unit");
       this.add(CWE.class, false, 1, 250, new Object[]{message}, "Department Code");
       this.add(CWE.class, false, 1, 250, new Object[]{message}, "Insurance Plan ID");
       this.add(CP.class, false, 1, 12, new Object[]{message}, "Insurance Amount");
       this.add(PL.class, false, 1, 80, new Object[]{message}, "Assigned Patient Location");
       this.add(IS.class, false, 1, 1, new Object[]{message, new Integer(24)}, "Fee Schedule");
       this.add(IS.class, false, 1, 2, new Object[]{message, new Integer(18)}, "Patient Type");
       this.add(CWE.class, false, 0, 250, new Object[]{message}, "Diagnosis Code - FT1");
       this.add(XCN.class, false, 0, 250, new Object[]{message}, "Performed By Code");
       this.add(XCN.class, false, 0, 250, new Object[]{message}, "Ordered By Code");
       this.add(CP.class, false, 1, 12, new Object[]{message}, "Unit Cost");
       this.add(EI.class, false, 1, 427, new Object[]{message}, "Filler Order Number");
       this.add(XCN.class, false, 0, 250, new Object[]{message}, "Entered By Code");
       this.add(CNE.class, false, 1, 705, new Object[]{message}, "Procedure Code");
       this.add(CNE.class, false, 0, 705, new Object[]{message}, "Procedure Code Modifier");
       this.add(CWE.class, false, 1, 250, new Object[]{message}, "Advanced Beneficiary Notice Code");
       this.add(CWE.class, false, 1, 705, new Object[]{message}, "Medically Necessary Duplicate Procedure Reason");
       this.add(CWE.class, false, 1, 250, new Object[]{message}, "NDC Code");
       this.add(CX.class, false, 1, 250, new Object[]{message}, "Payment Reference ID");
       this.add(SI.class, false, 0, 4, new Object[]{message}, "Transaction Reference Key");
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Can't instantiate " + this.getClass().getName(), he);
    }
  }

  /**
   * Returns Set ID - FT1 (FT1-1).
   */
  public SI getSetIDFT1()  {
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
   * Returns Set ID - FT1 (FT1-1).
   */
  public SI getFt11_SetIDFT1()  {
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
   * Returns Transaction ID (FT1-2).
   */
  public ST getTransactionID()  {
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
   * Returns Transaction ID (FT1-2).
   */
  public ST getFt12_TransactionID()  {
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
   * Returns Transaction Batch ID (FT1-3).
   */
  public ST getTransactionBatchID()  {
    ST ret = null;
    try {
        Type t = this.getField(3, 0);
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
   * Returns Transaction Batch ID (FT1-3).
   */
  public ST getFt13_TransactionBatchID()  {
    ST ret = null;
    try {
        Type t = this.getField(3, 0);
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
   * Returns Transaction Date (FT1-4).
   */
  public DR getTransactionDate()  {
    DR ret = null;
    try {
        Type t = this.getField(4, 0);
        ret = (DR)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns Transaction Date (FT1-4).
   */
  public DR getFt14_TransactionDate()  {
    DR ret = null;
    try {
        Type t = this.getField(4, 0);
        ret = (DR)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns Transaction Posting Date (FT1-5).
   */
  public DTM getTransactionPostingDate()  {
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
   * Returns Transaction Posting Date (FT1-5).
   */
  public DTM getFt15_TransactionPostingDate()  {
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
   * Returns Transaction Type (FT1-6).
   */
  public IS getTransactionType()  {
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
   * Returns Transaction Type (FT1-6).
   */
  public IS getFt16_TransactionType()  {
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
   * Returns Transaction Code (FT1-7).
   */
  public CWE getTransactionCode()  {
    CWE ret = null;
    try {
        Type t = this.getField(7, 0);
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
   * Returns Transaction Code (FT1-7).
   */
  public CWE getFt17_TransactionCode()  {
    CWE ret = null;
    try {
        Type t = this.getField(7, 0);
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
   * Returns Transaction Description (FT1-8).
   */
  public NULLDT getTransactionDescription()  {
    NULLDT ret = null;
    try {
        Type t = this.getField(8, 0);
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
   * Returns Transaction Description (FT1-8).
   */
  public NULLDT getFt18_TransactionDescription()  {
    NULLDT ret = null;
    try {
        Type t = this.getField(8, 0);
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
   * Returns Transaction Description - Alt (FT1-9).
   */
  public NULLDT getTransactionDescriptionAlt()  {
    NULLDT ret = null;
    try {
        Type t = this.getField(9, 0);
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
   * Returns Transaction Description - Alt (FT1-9).
   */
  public NULLDT getFt19_TransactionDescriptionAlt()  {
    NULLDT ret = null;
    try {
        Type t = this.getField(9, 0);
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
   * Returns Transaction Quantity (FT1-10).
   */
  public NM getTransactionQuantity()  {
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
   * Returns Transaction Quantity (FT1-10).
   */
  public NM getFt110_TransactionQuantity()  {
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
   * Returns Transaction Amount - Extended (FT1-11).
   */
  public CP getTransactionAmountExtended()  {
    CP ret = null;
    try {
        Type t = this.getField(11, 0);
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
   * Returns Transaction Amount - Extended (FT1-11).
   */
  public CP getFt111_TransactionAmountExtended()  {
    CP ret = null;
    try {
        Type t = this.getField(11, 0);
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
   * Returns Transaction amount - unit (FT1-12).
   */
  public CP getTransactionAmountUnit()  {
    CP ret = null;
    try {
        Type t = this.getField(12, 0);
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
   * Returns Transaction amount - unit (FT1-12).
   */
  public CP getFt112_TransactionAmountUnit()  {
    CP ret = null;
    try {
        Type t = this.getField(12, 0);
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
   * Returns Department Code (FT1-13).
   */
  public CWE getDepartmentCode()  {
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
   * Returns Department Code (FT1-13).
   */
  public CWE getFt113_DepartmentCode()  {
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
   * Returns Insurance Plan ID (FT1-14).
   */
  public CWE getInsurancePlanID()  {
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
   * Returns Insurance Plan ID (FT1-14).
   */
  public CWE getFt114_InsurancePlanID()  {
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
   * Returns Insurance Amount (FT1-15).
   */
  public CP getInsuranceAmount()  {
    CP ret = null;
    try {
        Type t = this.getField(15, 0);
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
   * Returns Insurance Amount (FT1-15).
   */
  public CP getFt115_InsuranceAmount()  {
    CP ret = null;
    try {
        Type t = this.getField(15, 0);
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
   * Returns Assigned Patient Location (FT1-16).
   */
  public PL getAssignedPatientLocation()  {
    PL ret = null;
    try {
        Type t = this.getField(16, 0);
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
   * Returns Assigned Patient Location (FT1-16).
   */
  public PL getFt116_AssignedPatientLocation()  {
    PL ret = null;
    try {
        Type t = this.getField(16, 0);
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
   * Returns Fee Schedule (FT1-17).
   */
  public IS getFeeSchedule()  {
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
   * Returns Fee Schedule (FT1-17).
   */
  public IS getFt117_FeeSchedule()  {
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
   * Returns Patient Type (FT1-18).
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
   * Returns Patient Type (FT1-18).
   */
  public IS getFt118_PatientType()  {
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
   * Returns a single repetition of Diagnosis Code - FT1 (FT1-19).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getDiagnosisCodeFT1(int rep) throws HL7Exception {
    CWE ret = null;
    try {
        Type t = this.getField(19, rep);
        ret = (CWE)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Diagnosis Code - FT1 (FT1-19).
   */
  public CWE[] getDiagnosisCodeFT1() {
     CWE[] ret = null;
    try {
        Type[] t = this.getField(19);  
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
   * Returns a count of the number of repetitions of Diagnosis Code - FT1 (FT1-19).
   */
  public int getDiagnosisCodeFT1Reps() {
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
   * Inserts a repetition of Diagnosis Code - FT1 (FT1-19) at a given index and returns it.
   * @param index The index
   */
  public CWE insertDiagnosisCodeFT1(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(19, index);
  }

  /**
   * Removes a repetition of Diagnosis Code - FT1 (FT1-19) at a given index and returns it.
   * @param index The index
   */
  public CWE removeDiagnosisCodeFT1(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(19, index);
  }

  /**
   * Returns a single repetition of Diagnosis Code - FT1 (FT1-19).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getFt119_DiagnosisCodeFT1(int rep) throws HL7Exception {
    CWE ret = null;
    try {
        Type t = this.getField(19, rep);
        ret = (CWE)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Diagnosis Code - FT1 (FT1-19).
   */
  public CWE[] getFt119_DiagnosisCodeFT1() {
     CWE[] ret = null;
    try {
        Type[] t = this.getField(19);  
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
   * Returns a count of the number of repetitions of Diagnosis Code - FT1 (FT1-19).
   */
  public int getFt119_DiagnosisCodeFT1Reps() {
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
   * Inserts a repetition of Diagnosis Code - FT1 (FT1-19) at a given index and returns it.
   * @param index The index
   */
  public CWE insertFt119_DiagnosisCodeFT1(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(19, index);
  }

  /**
   * Removes a repetition of Diagnosis Code - FT1 (FT1-19) at a given index and returns it.
   * @param index The index
   */
  public CWE removeFt119_DiagnosisCodeFT1(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(19, index);
  }

  /**
   * Returns a single repetition of Performed By Code (FT1-20).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XCN getPerformedByCode(int rep) throws HL7Exception {
    XCN ret = null;
    try {
        Type t = this.getField(20, rep);
        ret = (XCN)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Performed By Code (FT1-20).
   */
  public XCN[] getPerformedByCode() {
     XCN[] ret = null;
    try {
        Type[] t = this.getField(20);  
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
   * Returns a count of the number of repetitions of Performed By Code (FT1-20).
   */
  public int getPerformedByCodeReps() {
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
   * Inserts a repetition of Performed By Code (FT1-20) at a given index and returns it.
   * @param index The index
   */
  public XCN insertPerformedByCode(int index) throws HL7Exception {
     return (XCN) super.insertRepetition(20, index);
  }

  /**
   * Removes a repetition of Performed By Code (FT1-20) at a given index and returns it.
   * @param index The index
   */
  public XCN removePerformedByCode(int index) throws HL7Exception {
     return (XCN) super.removeRepetition(20, index);
  }

  /**
   * Returns a single repetition of Performed By Code (FT1-20).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XCN getFt120_PerformedByCode(int rep) throws HL7Exception {
    XCN ret = null;
    try {
        Type t = this.getField(20, rep);
        ret = (XCN)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Performed By Code (FT1-20).
   */
  public XCN[] getFt120_PerformedByCode() {
     XCN[] ret = null;
    try {
        Type[] t = this.getField(20);  
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
   * Returns a count of the number of repetitions of Performed By Code (FT1-20).
   */
  public int getFt120_PerformedByCodeReps() {
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
   * Inserts a repetition of Performed By Code (FT1-20) at a given index and returns it.
   * @param index The index
   */
  public XCN insertFt120_PerformedByCode(int index) throws HL7Exception {
     return (XCN) super.insertRepetition(20, index);
  }

  /**
   * Removes a repetition of Performed By Code (FT1-20) at a given index and returns it.
   * @param index The index
   */
  public XCN removeFt120_PerformedByCode(int index) throws HL7Exception {
     return (XCN) super.removeRepetition(20, index);
  }

  /**
   * Returns a single repetition of Ordered By Code (FT1-21).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XCN getOrderedByCode(int rep) throws HL7Exception {
    XCN ret = null;
    try {
        Type t = this.getField(21, rep);
        ret = (XCN)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Ordered By Code (FT1-21).
   */
  public XCN[] getOrderedByCode() {
     XCN[] ret = null;
    try {
        Type[] t = this.getField(21);  
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
   * Returns a count of the number of repetitions of Ordered By Code (FT1-21).
   */
  public int getOrderedByCodeReps() {
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
   * Inserts a repetition of Ordered By Code (FT1-21) at a given index and returns it.
   * @param index The index
   */
  public XCN insertOrderedByCode(int index) throws HL7Exception {
     return (XCN) super.insertRepetition(21, index);
  }

  /**
   * Removes a repetition of Ordered By Code (FT1-21) at a given index and returns it.
   * @param index The index
   */
  public XCN removeOrderedByCode(int index) throws HL7Exception {
     return (XCN) super.removeRepetition(21, index);
  }

  /**
   * Returns a single repetition of Ordered By Code (FT1-21).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XCN getFt121_OrderedByCode(int rep) throws HL7Exception {
    XCN ret = null;
    try {
        Type t = this.getField(21, rep);
        ret = (XCN)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Ordered By Code (FT1-21).
   */
  public XCN[] getFt121_OrderedByCode() {
     XCN[] ret = null;
    try {
        Type[] t = this.getField(21);  
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
   * Returns a count of the number of repetitions of Ordered By Code (FT1-21).
   */
  public int getFt121_OrderedByCodeReps() {
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
   * Inserts a repetition of Ordered By Code (FT1-21) at a given index and returns it.
   * @param index The index
   */
  public XCN insertFt121_OrderedByCode(int index) throws HL7Exception {
     return (XCN) super.insertRepetition(21, index);
  }

  /**
   * Removes a repetition of Ordered By Code (FT1-21) at a given index and returns it.
   * @param index The index
   */
  public XCN removeFt121_OrderedByCode(int index) throws HL7Exception {
     return (XCN) super.removeRepetition(21, index);
  }

  /**
   * Returns Unit Cost (FT1-22).
   */
  public CP getUnitCost()  {
    CP ret = null;
    try {
        Type t = this.getField(22, 0);
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
   * Returns Unit Cost (FT1-22).
   */
  public CP getFt122_UnitCost()  {
    CP ret = null;
    try {
        Type t = this.getField(22, 0);
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
   * Returns Filler Order Number (FT1-23).
   */
  public EI getFillerOrderNumber()  {
    EI ret = null;
    try {
        Type t = this.getField(23, 0);
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
   * Returns Filler Order Number (FT1-23).
   */
  public EI getFt123_FillerOrderNumber()  {
    EI ret = null;
    try {
        Type t = this.getField(23, 0);
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
   * Returns a single repetition of Entered By Code (FT1-24).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XCN getEnteredByCode(int rep) throws HL7Exception {
    XCN ret = null;
    try {
        Type t = this.getField(24, rep);
        ret = (XCN)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Entered By Code (FT1-24).
   */
  public XCN[] getEnteredByCode() {
     XCN[] ret = null;
    try {
        Type[] t = this.getField(24);  
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
   * Returns a count of the number of repetitions of Entered By Code (FT1-24).
   */
  public int getEnteredByCodeReps() {
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
   * Inserts a repetition of Entered By Code (FT1-24) at a given index and returns it.
   * @param index The index
   */
  public XCN insertEnteredByCode(int index) throws HL7Exception {
     return (XCN) super.insertRepetition(24, index);
  }

  /**
   * Removes a repetition of Entered By Code (FT1-24) at a given index and returns it.
   * @param index The index
   */
  public XCN removeEnteredByCode(int index) throws HL7Exception {
     return (XCN) super.removeRepetition(24, index);
  }

  /**
   * Returns a single repetition of Entered By Code (FT1-24).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XCN getFt124_EnteredByCode(int rep) throws HL7Exception {
    XCN ret = null;
    try {
        Type t = this.getField(24, rep);
        ret = (XCN)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Entered By Code (FT1-24).
   */
  public XCN[] getFt124_EnteredByCode() {
     XCN[] ret = null;
    try {
        Type[] t = this.getField(24);  
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
   * Returns a count of the number of repetitions of Entered By Code (FT1-24).
   */
  public int getFt124_EnteredByCodeReps() {
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
   * Inserts a repetition of Entered By Code (FT1-24) at a given index and returns it.
   * @param index The index
   */
  public XCN insertFt124_EnteredByCode(int index) throws HL7Exception {
     return (XCN) super.insertRepetition(24, index);
  }

  /**
   * Removes a repetition of Entered By Code (FT1-24) at a given index and returns it.
   * @param index The index
   */
  public XCN removeFt124_EnteredByCode(int index) throws HL7Exception {
     return (XCN) super.removeRepetition(24, index);
  }

  /**
   * Returns Procedure Code (FT1-25).
   */
  public CNE getProcedureCode()  {
    CNE ret = null;
    try {
        Type t = this.getField(25, 0);
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
   * Returns Procedure Code (FT1-25).
   */
  public CNE getFt125_ProcedureCode()  {
    CNE ret = null;
    try {
        Type t = this.getField(25, 0);
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
   * Returns a single repetition of Procedure Code Modifier (FT1-26).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CNE getProcedureCodeModifier(int rep) throws HL7Exception {
    CNE ret = null;
    try {
        Type t = this.getField(26, rep);
        ret = (CNE)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Procedure Code Modifier (FT1-26).
   */
  public CNE[] getProcedureCodeModifier() {
     CNE[] ret = null;
    try {
        Type[] t = this.getField(26);  
        ret = new CNE[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (CNE)t[i];
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
   * Returns a count of the number of repetitions of Procedure Code Modifier (FT1-26).
   */
  public int getProcedureCodeModifierReps() {
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
   * Inserts a repetition of Procedure Code Modifier (FT1-26) at a given index and returns it.
   * @param index The index
   */
  public CNE insertProcedureCodeModifier(int index) throws HL7Exception {
     return (CNE) super.insertRepetition(26, index);
  }

  /**
   * Removes a repetition of Procedure Code Modifier (FT1-26) at a given index and returns it.
   * @param index The index
   */
  public CNE removeProcedureCodeModifier(int index) throws HL7Exception {
     return (CNE) super.removeRepetition(26, index);
  }

  /**
   * Returns a single repetition of Procedure Code Modifier (FT1-26).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CNE getFt126_ProcedureCodeModifier(int rep) throws HL7Exception {
    CNE ret = null;
    try {
        Type t = this.getField(26, rep);
        ret = (CNE)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Procedure Code Modifier (FT1-26).
   */
  public CNE[] getFt126_ProcedureCodeModifier() {
     CNE[] ret = null;
    try {
        Type[] t = this.getField(26);  
        ret = new CNE[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (CNE)t[i];
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
   * Returns a count of the number of repetitions of Procedure Code Modifier (FT1-26).
   */
  public int getFt126_ProcedureCodeModifierReps() {
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
   * Inserts a repetition of Procedure Code Modifier (FT1-26) at a given index and returns it.
   * @param index The index
   */
  public CNE insertFt126_ProcedureCodeModifier(int index) throws HL7Exception {
     return (CNE) super.insertRepetition(26, index);
  }

  /**
   * Removes a repetition of Procedure Code Modifier (FT1-26) at a given index and returns it.
   * @param index The index
   */
  public CNE removeFt126_ProcedureCodeModifier(int index) throws HL7Exception {
     return (CNE) super.removeRepetition(26, index);
  }

  /**
   * Returns Advanced Beneficiary Notice Code (FT1-27).
   */
  public CWE getAdvancedBeneficiaryNoticeCode()  {
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
   * Returns Advanced Beneficiary Notice Code (FT1-27).
   */
  public CWE getFt127_AdvancedBeneficiaryNoticeCode()  {
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
   * Returns Medically Necessary Duplicate Procedure Reason (FT1-28).
   */
  public CWE getMedicallyNecessaryDuplicateProcedureReason()  {
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
   * Returns Medically Necessary Duplicate Procedure Reason (FT1-28).
   */
  public CWE getFt128_MedicallyNecessaryDuplicateProcedureReason()  {
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
   * Returns NDC Code (FT1-29).
   */
  public CWE getNDCCode()  {
    CWE ret = null;
    try {
        Type t = this.getField(29, 0);
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
   * Returns NDC Code (FT1-29).
   */
  public CWE getFt129_NDCCode()  {
    CWE ret = null;
    try {
        Type t = this.getField(29, 0);
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
   * Returns Payment Reference ID (FT1-30).
   */
  public CX getPaymentReferenceID()  {
    CX ret = null;
    try {
        Type t = this.getField(30, 0);
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
   * Returns Payment Reference ID (FT1-30).
   */
  public CX getFt130_PaymentReferenceID()  {
    CX ret = null;
    try {
        Type t = this.getField(30, 0);
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
   * Returns a single repetition of Transaction Reference Key (FT1-31).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public SI getTransactionReferenceKey(int rep) throws HL7Exception {
    SI ret = null;
    try {
        Type t = this.getField(31, rep);
        ret = (SI)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Transaction Reference Key (FT1-31).
   */
  public SI[] getTransactionReferenceKey() {
     SI[] ret = null;
    try {
        Type[] t = this.getField(31);  
        ret = new SI[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (SI)t[i];
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
   * Returns a count of the number of repetitions of Transaction Reference Key (FT1-31).
   */
  public int getTransactionReferenceKeyReps() {
    try {
        return this.getField(31).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Transaction Reference Key (FT1-31) at a given index and returns it.
   * @param index The index
   */
  public SI insertTransactionReferenceKey(int index) throws HL7Exception {
     return (SI) super.insertRepetition(31, index);
  }

  /**
   * Removes a repetition of Transaction Reference Key (FT1-31) at a given index and returns it.
   * @param index The index
   */
  public SI removeTransactionReferenceKey(int index) throws HL7Exception {
     return (SI) super.removeRepetition(31, index);
  }

  /**
   * Returns a single repetition of Transaction Reference Key (FT1-31).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public SI getFt131_TransactionReferenceKey(int rep) throws HL7Exception {
    SI ret = null;
    try {
        Type t = this.getField(31, rep);
        ret = (SI)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Transaction Reference Key (FT1-31).
   */
  public SI[] getFt131_TransactionReferenceKey() {
     SI[] ret = null;
    try {
        Type[] t = this.getField(31);  
        ret = new SI[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (SI)t[i];
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
   * Returns a count of the number of repetitions of Transaction Reference Key (FT1-31).
   */
  public int getFt131_TransactionReferenceKeyReps() {
    try {
        return this.getField(31).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Transaction Reference Key (FT1-31) at a given index and returns it.
   * @param index The index
   */
  public SI insertFt131_TransactionReferenceKey(int index) throws HL7Exception {
     return (SI) super.insertRepetition(31, index);
  }

  /**
   * Removes a repetition of Transaction Reference Key (FT1-31) at a given index and returns it.
   * @param index The index
   */
  public SI removeFt131_TransactionReferenceKey(int index) throws HL7Exception {
     return (SI) super.removeRepetition(31, index);
  }

   protected Type createNewTypeWithoutReflection(int field) {
      switch (field) {
         case 0: return new ca.uhn.hl7v2.model.v26.datatype.SI(getMessage());
         case 1: return new ca.uhn.hl7v2.model.v26.datatype.ST(getMessage());
         case 2: return new ca.uhn.hl7v2.model.v26.datatype.ST(getMessage());
         case 3: return new ca.uhn.hl7v2.model.v26.datatype.DR(getMessage());
         case 4: return new ca.uhn.hl7v2.model.v26.datatype.DTM(getMessage());
         case 5: return new ca.uhn.hl7v2.model.v26.datatype.IS(getMessage(), new Integer(17));
         case 6: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 7: return new ca.uhn.hl7v2.model.v26.datatype.NULLDT(getMessage());
         case 8: return new ca.uhn.hl7v2.model.v26.datatype.NULLDT(getMessage());
         case 9: return new ca.uhn.hl7v2.model.v26.datatype.NM(getMessage());
         case 10: return new ca.uhn.hl7v2.model.v26.datatype.CP(getMessage());
         case 11: return new ca.uhn.hl7v2.model.v26.datatype.CP(getMessage());
         case 12: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 13: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 14: return new ca.uhn.hl7v2.model.v26.datatype.CP(getMessage());
         case 15: return new ca.uhn.hl7v2.model.v26.datatype.PL(getMessage());
         case 16: return new ca.uhn.hl7v2.model.v26.datatype.IS(getMessage(), new Integer(24));
         case 17: return new ca.uhn.hl7v2.model.v26.datatype.IS(getMessage(), new Integer(18));
         case 18: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 19: return new ca.uhn.hl7v2.model.v26.datatype.XCN(getMessage());
         case 20: return new ca.uhn.hl7v2.model.v26.datatype.XCN(getMessage());
         case 21: return new ca.uhn.hl7v2.model.v26.datatype.CP(getMessage());
         case 22: return new ca.uhn.hl7v2.model.v26.datatype.EI(getMessage());
         case 23: return new ca.uhn.hl7v2.model.v26.datatype.XCN(getMessage());
         case 24: return new ca.uhn.hl7v2.model.v26.datatype.CNE(getMessage());
         case 25: return new ca.uhn.hl7v2.model.v26.datatype.CNE(getMessage());
         case 26: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 27: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 28: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 29: return new ca.uhn.hl7v2.model.v26.datatype.CX(getMessage());
         case 30: return new ca.uhn.hl7v2.model.v26.datatype.SI(getMessage());
         default: return null;
      }
   }

}