package ca.uhn.hl7v2.model.v26.segment;

import ca.uhn.hl7v2.model.*;
import ca.uhn.hl7v2.model.v26.datatype.*;
import ca.uhn.log.HapiLogFactory;
import ca.uhn.hl7v2.parser.ModelClassFactory;
import ca.uhn.hl7v2.HL7Exception;

/**
 * <p>Represents an HL7 RF1 message segment. 
 * This segment has the following fields:</p><p>
 * RF1-1: Referral Status (CWE)<br> 
 * RF1-2: Referral Priority (CWE)<br> 
 * RF1-3: Referral Type (CWE)<br> 
 * RF1-4: Referral Disposition (CWE)<br> 
 * RF1-5: Referral Category (CWE)<br> 
 * RF1-6: Originating Referral Identifier (EI)<br> 
 * RF1-7: Effective Date (DTM)<br> 
 * RF1-8: Expiration Date (DTM)<br> 
 * RF1-9: Process Date (DTM)<br> 
 * RF1-10: Referral Reason (CWE)<br> 
 * RF1-11: External Referral Identifier (EI)<br> 
 * RF1-12: Referral Documentation Completion Status (CWE)<br> 
 * </p><p>The get...() methods return data from individual fields.  These methods 
 * do not throw exceptions and may therefore have to handle exceptions internally.  
 * If an exception is handled internally, it is logged and null is returned.  
 * This is not expected to happen - if it does happen this indicates not so much 
 * an exceptional circumstance as a bug in the code for this class.</p>    
 */
public class RF1 extends AbstractSegment  {

  /**
   * Creates a RF1 (Referral Information) segment object that belongs to the given 
   * message.  
   */
  public RF1(Group parent, ModelClassFactory factory) {
    super(parent, factory);
    Message message = getMessage();
    try {
       this.add(CWE.class, false, 1, 705, new Object[]{message}, "Referral Status");
       this.add(CWE.class, false, 1, 705, new Object[]{message}, "Referral Priority");
       this.add(CWE.class, false, 1, 705, new Object[]{message}, "Referral Type");
       this.add(CWE.class, false, 0, 705, new Object[]{message}, "Referral Disposition");
       this.add(CWE.class, false, 1, 705, new Object[]{message}, "Referral Category");
       this.add(EI.class, true, 1, 30, new Object[]{message}, "Originating Referral Identifier");
       this.add(DTM.class, false, 1, 24, new Object[]{message}, "Effective Date");
       this.add(DTM.class, false, 1, 24, new Object[]{message}, "Expiration Date");
       this.add(DTM.class, false, 1, 24, new Object[]{message}, "Process Date");
       this.add(CWE.class, false, 0, 705, new Object[]{message}, "Referral Reason");
       this.add(EI.class, false, 0, 30, new Object[]{message}, "External Referral Identifier");
       this.add(CWE.class, false, 1, 705, new Object[]{message}, "Referral Documentation Completion Status");
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Can't instantiate " + this.getClass().getName(), he);
    }
  }

  /**
   * Returns Referral Status (RF1-1).
   */
  public CWE getReferralStatus()  {
    CWE ret = null;
    try {
        Type t = this.getField(1, 0);
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
   * Returns Referral Status (RF1-1).
   */
  public CWE getRf11_ReferralStatus()  {
    CWE ret = null;
    try {
        Type t = this.getField(1, 0);
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
   * Returns Referral Priority (RF1-2).
   */
  public CWE getReferralPriority()  {
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
   * Returns Referral Priority (RF1-2).
   */
  public CWE getRf12_ReferralPriority()  {
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
   * Returns Referral Type (RF1-3).
   */
  public CWE getReferralType()  {
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
   * Returns Referral Type (RF1-3).
   */
  public CWE getRf13_ReferralType()  {
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
   * Returns a single repetition of Referral Disposition (RF1-4).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getReferralDisposition(int rep) throws HL7Exception {
    CWE ret = null;
    try {
        Type t = this.getField(4, rep);
        ret = (CWE)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Referral Disposition (RF1-4).
   */
  public CWE[] getReferralDisposition() {
     CWE[] ret = null;
    try {
        Type[] t = this.getField(4);  
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
   * Returns a count of the number of repetitions of Referral Disposition (RF1-4).
   */
  public int getReferralDispositionReps() {
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
   * Inserts a repetition of Referral Disposition (RF1-4) at a given index and returns it.
   * @param index The index
   */
  public CWE insertReferralDisposition(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(4, index);
  }

  /**
   * Removes a repetition of Referral Disposition (RF1-4) at a given index and returns it.
   * @param index The index
   */
  public CWE removeReferralDisposition(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(4, index);
  }

  /**
   * Returns a single repetition of Referral Disposition (RF1-4).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getRf14_ReferralDisposition(int rep) throws HL7Exception {
    CWE ret = null;
    try {
        Type t = this.getField(4, rep);
        ret = (CWE)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Referral Disposition (RF1-4).
   */
  public CWE[] getRf14_ReferralDisposition() {
     CWE[] ret = null;
    try {
        Type[] t = this.getField(4);  
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
   * Returns a count of the number of repetitions of Referral Disposition (RF1-4).
   */
  public int getRf14_ReferralDispositionReps() {
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
   * Inserts a repetition of Referral Disposition (RF1-4) at a given index and returns it.
   * @param index The index
   */
  public CWE insertRf14_ReferralDisposition(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(4, index);
  }

  /**
   * Removes a repetition of Referral Disposition (RF1-4) at a given index and returns it.
   * @param index The index
   */
  public CWE removeRf14_ReferralDisposition(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(4, index);
  }

  /**
   * Returns Referral Category (RF1-5).
   */
  public CWE getReferralCategory()  {
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
   * Returns Referral Category (RF1-5).
   */
  public CWE getRf15_ReferralCategory()  {
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
   * Returns Originating Referral Identifier (RF1-6).
   */
  public EI getOriginatingReferralIdentifier()  {
    EI ret = null;
    try {
        Type t = this.getField(6, 0);
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
   * Returns Originating Referral Identifier (RF1-6).
   */
  public EI getRf16_OriginatingReferralIdentifier()  {
    EI ret = null;
    try {
        Type t = this.getField(6, 0);
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
   * Returns Effective Date (RF1-7).
   */
  public DTM getEffectiveDate()  {
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
   * Returns Effective Date (RF1-7).
   */
  public DTM getRf17_EffectiveDate()  {
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
   * Returns Expiration Date (RF1-8).
   */
  public DTM getExpirationDate()  {
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
   * Returns Expiration Date (RF1-8).
   */
  public DTM getRf18_ExpirationDate()  {
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
   * Returns Process Date (RF1-9).
   */
  public DTM getProcessDate()  {
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
   * Returns Process Date (RF1-9).
   */
  public DTM getRf19_ProcessDate()  {
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
   * Returns a single repetition of Referral Reason (RF1-10).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getReferralReason(int rep) throws HL7Exception {
    CWE ret = null;
    try {
        Type t = this.getField(10, rep);
        ret = (CWE)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Referral Reason (RF1-10).
   */
  public CWE[] getReferralReason() {
     CWE[] ret = null;
    try {
        Type[] t = this.getField(10);  
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
   * Returns a count of the number of repetitions of Referral Reason (RF1-10).
   */
  public int getReferralReasonReps() {
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
   * Inserts a repetition of Referral Reason (RF1-10) at a given index and returns it.
   * @param index The index
   */
  public CWE insertReferralReason(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(10, index);
  }

  /**
   * Removes a repetition of Referral Reason (RF1-10) at a given index and returns it.
   * @param index The index
   */
  public CWE removeReferralReason(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(10, index);
  }

  /**
   * Returns a single repetition of Referral Reason (RF1-10).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getRf110_ReferralReason(int rep) throws HL7Exception {
    CWE ret = null;
    try {
        Type t = this.getField(10, rep);
        ret = (CWE)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Referral Reason (RF1-10).
   */
  public CWE[] getRf110_ReferralReason() {
     CWE[] ret = null;
    try {
        Type[] t = this.getField(10);  
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
   * Returns a count of the number of repetitions of Referral Reason (RF1-10).
   */
  public int getRf110_ReferralReasonReps() {
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
   * Inserts a repetition of Referral Reason (RF1-10) at a given index and returns it.
   * @param index The index
   */
  public CWE insertRf110_ReferralReason(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(10, index);
  }

  /**
   * Removes a repetition of Referral Reason (RF1-10) at a given index and returns it.
   * @param index The index
   */
  public CWE removeRf110_ReferralReason(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(10, index);
  }

  /**
   * Returns a single repetition of External Referral Identifier (RF1-11).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public EI getExternalReferralIdentifier(int rep) throws HL7Exception {
    EI ret = null;
    try {
        Type t = this.getField(11, rep);
        ret = (EI)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of External Referral Identifier (RF1-11).
   */
  public EI[] getExternalReferralIdentifier() {
     EI[] ret = null;
    try {
        Type[] t = this.getField(11);  
        ret = new EI[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (EI)t[i];
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
   * Returns a count of the number of repetitions of External Referral Identifier (RF1-11).
   */
  public int getExternalReferralIdentifierReps() {
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
   * Inserts a repetition of External Referral Identifier (RF1-11) at a given index and returns it.
   * @param index The index
   */
  public EI insertExternalReferralIdentifier(int index) throws HL7Exception {
     return (EI) super.insertRepetition(11, index);
  }

  /**
   * Removes a repetition of External Referral Identifier (RF1-11) at a given index and returns it.
   * @param index The index
   */
  public EI removeExternalReferralIdentifier(int index) throws HL7Exception {
     return (EI) super.removeRepetition(11, index);
  }

  /**
   * Returns a single repetition of External Referral Identifier (RF1-11).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public EI getRf111_ExternalReferralIdentifier(int rep) throws HL7Exception {
    EI ret = null;
    try {
        Type t = this.getField(11, rep);
        ret = (EI)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of External Referral Identifier (RF1-11).
   */
  public EI[] getRf111_ExternalReferralIdentifier() {
     EI[] ret = null;
    try {
        Type[] t = this.getField(11);  
        ret = new EI[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (EI)t[i];
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
   * Returns a count of the number of repetitions of External Referral Identifier (RF1-11).
   */
  public int getRf111_ExternalReferralIdentifierReps() {
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
   * Inserts a repetition of External Referral Identifier (RF1-11) at a given index and returns it.
   * @param index The index
   */
  public EI insertRf111_ExternalReferralIdentifier(int index) throws HL7Exception {
     return (EI) super.insertRepetition(11, index);
  }

  /**
   * Removes a repetition of External Referral Identifier (RF1-11) at a given index and returns it.
   * @param index The index
   */
  public EI removeRf111_ExternalReferralIdentifier(int index) throws HL7Exception {
     return (EI) super.removeRepetition(11, index);
  }

  /**
   * Returns Referral Documentation Completion Status (RF1-12).
   */
  public CWE getReferralDocumentationCompletionStatus()  {
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
   * Returns Referral Documentation Completion Status (RF1-12).
   */
  public CWE getRf112_ReferralDocumentationCompletionStatus()  {
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

   protected Type createNewTypeWithoutReflection(int field) {
      switch (field) {
         case 0: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 1: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 2: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 3: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 4: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 5: return new ca.uhn.hl7v2.model.v26.datatype.EI(getMessage());
         case 6: return new ca.uhn.hl7v2.model.v26.datatype.DTM(getMessage());
         case 7: return new ca.uhn.hl7v2.model.v26.datatype.DTM(getMessage());
         case 8: return new ca.uhn.hl7v2.model.v26.datatype.DTM(getMessage());
         case 9: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 10: return new ca.uhn.hl7v2.model.v26.datatype.EI(getMessage());
         case 11: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         default: return null;
      }
   }

}