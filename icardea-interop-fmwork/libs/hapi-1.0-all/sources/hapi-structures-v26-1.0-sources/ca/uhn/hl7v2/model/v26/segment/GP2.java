package ca.uhn.hl7v2.model.v26.segment;

import ca.uhn.hl7v2.model.*;
import ca.uhn.hl7v2.model.v26.datatype.*;
import ca.uhn.log.HapiLogFactory;
import ca.uhn.hl7v2.parser.ModelClassFactory;
import ca.uhn.hl7v2.HL7Exception;

/**
 * <p>Represents an HL7 GP2 message segment. 
 * This segment has the following fields:</p><p>
 * GP2-1: Revenue Code (IS)<br> 
 * GP2-2: Number of Service Units (NM)<br> 
 * GP2-3: Charge (CP)<br> 
 * GP2-4: Reimbursement Action Code (IS)<br> 
 * GP2-5: Denial or Rejection Code (IS)<br> 
 * GP2-6: OCE Edit Code (IS)<br> 
 * GP2-7: Ambulatory Payment Classification Code (CWE)<br> 
 * GP2-8: Modifier Edit Code (IS)<br> 
 * GP2-9: Payment Adjustment Code (IS)<br> 
 * GP2-10: Packaging Status Code (IS)<br> 
 * GP2-11: Expected CMS Payment Amount (CP)<br> 
 * GP2-12: Reimbursement Type Code (IS)<br> 
 * GP2-13: Co-Pay Amount (CP)<br> 
 * GP2-14: Pay Rate per Service Unit (NM)<br> 
 * </p><p>The get...() methods return data from individual fields.  These methods 
 * do not throw exceptions and may therefore have to handle exceptions internally.  
 * If an exception is handled internally, it is logged and null is returned.  
 * This is not expected to happen - if it does happen this indicates not so much 
 * an exceptional circumstance as a bug in the code for this class.</p>    
 */
public class GP2 extends AbstractSegment  {

  /**
   * Creates a GP2 (Grouping/Reimbursement - Procedure Line Item) segment object that belongs to the given 
   * message.  
   */
  public GP2(Group parent, ModelClassFactory factory) {
    super(parent, factory);
    Message message = getMessage();
    try {
       this.add(IS.class, false, 1, 3, new Object[]{message, new Integer(456)}, "Revenue Code");
       this.add(NM.class, false, 1, 7, new Object[]{message}, "Number of Service Units");
       this.add(CP.class, false, 1, 12, new Object[]{message}, "Charge");
       this.add(IS.class, false, 1, 1, new Object[]{message, new Integer(459)}, "Reimbursement Action Code");
       this.add(IS.class, false, 1, 1, new Object[]{message, new Integer(460)}, "Denial or Rejection Code");
       this.add(IS.class, false, 0, 3, new Object[]{message, new Integer(458)}, "OCE Edit Code");
       this.add(CWE.class, false, 1, 250, new Object[]{message}, "Ambulatory Payment Classification Code");
       this.add(IS.class, false, 0, 1, new Object[]{message, new Integer(467)}, "Modifier Edit Code");
       this.add(IS.class, false, 1, 1, new Object[]{message, new Integer(468)}, "Payment Adjustment Code");
       this.add(IS.class, false, 1, 1, new Object[]{message, new Integer(469)}, "Packaging Status Code");
       this.add(CP.class, false, 1, 12, new Object[]{message}, "Expected CMS Payment Amount");
       this.add(IS.class, false, 1, 2, new Object[]{message, new Integer(470)}, "Reimbursement Type Code");
       this.add(CP.class, false, 1, 12, new Object[]{message}, "Co-Pay Amount");
       this.add(NM.class, false, 1, 4, new Object[]{message}, "Pay Rate per Service Unit");
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Can't instantiate " + this.getClass().getName(), he);
    }
  }

  /**
   * Returns Revenue Code (GP2-1).
   */
  public IS getRevenueCode()  {
    IS ret = null;
    try {
        Type t = this.getField(1, 0);
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
   * Returns Revenue Code (GP2-1).
   */
  public IS getGp21_RevenueCode()  {
    IS ret = null;
    try {
        Type t = this.getField(1, 0);
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
   * Returns Number of Service Units (GP2-2).
   */
  public NM getNumberOfServiceUnits()  {
    NM ret = null;
    try {
        Type t = this.getField(2, 0);
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
   * Returns Number of Service Units (GP2-2).
   */
  public NM getGp22_NumberOfServiceUnits()  {
    NM ret = null;
    try {
        Type t = this.getField(2, 0);
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
   * Returns Charge (GP2-3).
   */
  public CP getCharge()  {
    CP ret = null;
    try {
        Type t = this.getField(3, 0);
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
   * Returns Charge (GP2-3).
   */
  public CP getGp23_Charge()  {
    CP ret = null;
    try {
        Type t = this.getField(3, 0);
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
   * Returns Reimbursement Action Code (GP2-4).
   */
  public IS getReimbursementActionCode()  {
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
   * Returns Reimbursement Action Code (GP2-4).
   */
  public IS getGp24_ReimbursementActionCode()  {
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
   * Returns Denial or Rejection Code (GP2-5).
   */
  public IS getDenialOrRejectionCode()  {
    IS ret = null;
    try {
        Type t = this.getField(5, 0);
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
   * Returns Denial or Rejection Code (GP2-5).
   */
  public IS getGp25_DenialOrRejectionCode()  {
    IS ret = null;
    try {
        Type t = this.getField(5, 0);
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
   * Returns a single repetition of OCE Edit Code (GP2-6).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public IS getOCEEditCode(int rep) throws HL7Exception {
    IS ret = null;
    try {
        Type t = this.getField(6, rep);
        ret = (IS)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of OCE Edit Code (GP2-6).
   */
  public IS[] getOCEEditCode() {
     IS[] ret = null;
    try {
        Type[] t = this.getField(6);  
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
   * Returns a count of the number of repetitions of OCE Edit Code (GP2-6).
   */
  public int getOCEEditCodeReps() {
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
   * Inserts a repetition of OCE Edit Code (GP2-6) at a given index and returns it.
   * @param index The index
   */
  public IS insertOCEEditCode(int index) throws HL7Exception {
     return (IS) super.insertRepetition(6, index);
  }

  /**
   * Removes a repetition of OCE Edit Code (GP2-6) at a given index and returns it.
   * @param index The index
   */
  public IS removeOCEEditCode(int index) throws HL7Exception {
     return (IS) super.removeRepetition(6, index);
  }

  /**
   * Returns a single repetition of OCE Edit Code (GP2-6).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public IS getGp26_OCEEditCode(int rep) throws HL7Exception {
    IS ret = null;
    try {
        Type t = this.getField(6, rep);
        ret = (IS)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of OCE Edit Code (GP2-6).
   */
  public IS[] getGp26_OCEEditCode() {
     IS[] ret = null;
    try {
        Type[] t = this.getField(6);  
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
   * Returns a count of the number of repetitions of OCE Edit Code (GP2-6).
   */
  public int getGp26_OCEEditCodeReps() {
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
   * Inserts a repetition of OCE Edit Code (GP2-6) at a given index and returns it.
   * @param index The index
   */
  public IS insertGp26_OCEEditCode(int index) throws HL7Exception {
     return (IS) super.insertRepetition(6, index);
  }

  /**
   * Removes a repetition of OCE Edit Code (GP2-6) at a given index and returns it.
   * @param index The index
   */
  public IS removeGp26_OCEEditCode(int index) throws HL7Exception {
     return (IS) super.removeRepetition(6, index);
  }

  /**
   * Returns Ambulatory Payment Classification Code (GP2-7).
   */
  public CWE getAmbulatoryPaymentClassificationCode()  {
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
   * Returns Ambulatory Payment Classification Code (GP2-7).
   */
  public CWE getGp27_AmbulatoryPaymentClassificationCode()  {
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
   * Returns a single repetition of Modifier Edit Code (GP2-8).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public IS getModifierEditCode(int rep) throws HL7Exception {
    IS ret = null;
    try {
        Type t = this.getField(8, rep);
        ret = (IS)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Modifier Edit Code (GP2-8).
   */
  public IS[] getModifierEditCode() {
     IS[] ret = null;
    try {
        Type[] t = this.getField(8);  
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
   * Returns a count of the number of repetitions of Modifier Edit Code (GP2-8).
   */
  public int getModifierEditCodeReps() {
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
   * Inserts a repetition of Modifier Edit Code (GP2-8) at a given index and returns it.
   * @param index The index
   */
  public IS insertModifierEditCode(int index) throws HL7Exception {
     return (IS) super.insertRepetition(8, index);
  }

  /**
   * Removes a repetition of Modifier Edit Code (GP2-8) at a given index and returns it.
   * @param index The index
   */
  public IS removeModifierEditCode(int index) throws HL7Exception {
     return (IS) super.removeRepetition(8, index);
  }

  /**
   * Returns a single repetition of Modifier Edit Code (GP2-8).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public IS getGp28_ModifierEditCode(int rep) throws HL7Exception {
    IS ret = null;
    try {
        Type t = this.getField(8, rep);
        ret = (IS)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Modifier Edit Code (GP2-8).
   */
  public IS[] getGp28_ModifierEditCode() {
     IS[] ret = null;
    try {
        Type[] t = this.getField(8);  
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
   * Returns a count of the number of repetitions of Modifier Edit Code (GP2-8).
   */
  public int getGp28_ModifierEditCodeReps() {
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
   * Inserts a repetition of Modifier Edit Code (GP2-8) at a given index and returns it.
   * @param index The index
   */
  public IS insertGp28_ModifierEditCode(int index) throws HL7Exception {
     return (IS) super.insertRepetition(8, index);
  }

  /**
   * Removes a repetition of Modifier Edit Code (GP2-8) at a given index and returns it.
   * @param index The index
   */
  public IS removeGp28_ModifierEditCode(int index) throws HL7Exception {
     return (IS) super.removeRepetition(8, index);
  }

  /**
   * Returns Payment Adjustment Code (GP2-9).
   */
  public IS getPaymentAdjustmentCode()  {
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
   * Returns Payment Adjustment Code (GP2-9).
   */
  public IS getGp29_PaymentAdjustmentCode()  {
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
   * Returns Packaging Status Code (GP2-10).
   */
  public IS getPackagingStatusCode()  {
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
   * Returns Packaging Status Code (GP2-10).
   */
  public IS getGp210_PackagingStatusCode()  {
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
   * Returns Expected CMS Payment Amount (GP2-11).
   */
  public CP getExpectedCMSPaymentAmount()  {
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
   * Returns Expected CMS Payment Amount (GP2-11).
   */
  public CP getGp211_ExpectedCMSPaymentAmount()  {
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
   * Returns Reimbursement Type Code (GP2-12).
   */
  public IS getReimbursementTypeCode()  {
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
   * Returns Reimbursement Type Code (GP2-12).
   */
  public IS getGp212_ReimbursementTypeCode()  {
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
   * Returns Co-Pay Amount (GP2-13).
   */
  public CP getCoPayAmount()  {
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
   * Returns Co-Pay Amount (GP2-13).
   */
  public CP getGp213_CoPayAmount()  {
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
   * Returns Pay Rate per Service Unit (GP2-14).
   */
  public NM getPayRatePerServiceUnit()  {
    NM ret = null;
    try {
        Type t = this.getField(14, 0);
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
   * Returns Pay Rate per Service Unit (GP2-14).
   */
  public NM getGp214_PayRatePerServiceUnit()  {
    NM ret = null;
    try {
        Type t = this.getField(14, 0);
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

   protected Type createNewTypeWithoutReflection(int field) {
      switch (field) {
         case 0: return new ca.uhn.hl7v2.model.v26.datatype.IS(getMessage(), new Integer(456));
         case 1: return new ca.uhn.hl7v2.model.v26.datatype.NM(getMessage());
         case 2: return new ca.uhn.hl7v2.model.v26.datatype.CP(getMessage());
         case 3: return new ca.uhn.hl7v2.model.v26.datatype.IS(getMessage(), new Integer(459));
         case 4: return new ca.uhn.hl7v2.model.v26.datatype.IS(getMessage(), new Integer(460));
         case 5: return new ca.uhn.hl7v2.model.v26.datatype.IS(getMessage(), new Integer(458));
         case 6: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 7: return new ca.uhn.hl7v2.model.v26.datatype.IS(getMessage(), new Integer(467));
         case 8: return new ca.uhn.hl7v2.model.v26.datatype.IS(getMessage(), new Integer(468));
         case 9: return new ca.uhn.hl7v2.model.v26.datatype.IS(getMessage(), new Integer(469));
         case 10: return new ca.uhn.hl7v2.model.v26.datatype.CP(getMessage());
         case 11: return new ca.uhn.hl7v2.model.v26.datatype.IS(getMessage(), new Integer(470));
         case 12: return new ca.uhn.hl7v2.model.v26.datatype.CP(getMessage());
         case 13: return new ca.uhn.hl7v2.model.v26.datatype.NM(getMessage());
         default: return null;
      }
   }

}