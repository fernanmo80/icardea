package ca.uhn.hl7v2.model.v26.segment;

import ca.uhn.hl7v2.model.*;
import ca.uhn.hl7v2.model.v26.datatype.*;
import ca.uhn.log.HapiLogFactory;
import ca.uhn.hl7v2.parser.ModelClassFactory;
import ca.uhn.hl7v2.HL7Exception;

/**
 * <p>Represents an HL7 OM7 message segment. 
 * This segment has the following fields:</p><p>
 * OM7-1: Sequence Number - Test/Observation Master File (NM)<br> 
 * OM7-2: Universal Service Identifier (CWE)<br> 
 * OM7-3: Category Identifier (CWE)<br> 
 * OM7-4: Category Description (TX)<br> 
 * OM7-5: Category Synonym (ST)<br> 
 * OM7-6: Effective Test/Service Start Date/Time (DTM)<br> 
 * OM7-7: Effective Test/Service End Date/Time (DTM)<br> 
 * OM7-8: Test/Service Default Duration Quantity (NM)<br> 
 * OM7-9: Test/Service Default Duration Units (CWE)<br> 
 * OM7-10: Test/Service Default Frequency (IS)<br> 
 * OM7-11: Consent Indicator (ID)<br> 
 * OM7-12: Consent Identifier (CWE)<br> 
 * OM7-13: Consent Effective Start Date/Time (DTM)<br> 
 * OM7-14: Consent Effective End Date/Time (DTM)<br> 
 * OM7-15: Consent Interval Quantity (NM)<br> 
 * OM7-16: Consent Interval Units (CWE)<br> 
 * OM7-17: Consent Waiting Period Quantity (NM)<br> 
 * OM7-18: Consent Waiting Period Units (CWE)<br> 
 * OM7-19: Effective Date/Time of Change (DTM)<br> 
 * OM7-20: Entered By (XCN)<br> 
 * OM7-21: Orderable-at Location (PL)<br> 
 * OM7-22: Formulary Status (IS)<br> 
 * OM7-23: Special Order Indicator (ID)<br> 
 * OM7-24: Primary Key Value - CDM (CWE)<br> 
 * </p><p>The get...() methods return data from individual fields.  These methods 
 * do not throw exceptions and may therefore have to handle exceptions internally.  
 * If an exception is handled internally, it is logged and null is returned.  
 * This is not expected to happen - if it does happen this indicates not so much 
 * an exceptional circumstance as a bug in the code for this class.</p>    
 */
public class OM7 extends AbstractSegment  {

  /**
   * Creates a OM7 (Additional Basic Attributes) segment object that belongs to the given 
   * message.  
   */
  public OM7(Group parent, ModelClassFactory factory) {
    super(parent, factory);
    Message message = getMessage();
    try {
       this.add(NM.class, true, 1, 4, new Object[]{message}, "Sequence Number - Test/Observation Master File");
       this.add(CWE.class, true, 1, 705, new Object[]{message}, "Universal Service Identifier");
       this.add(CWE.class, false, 0, 250, new Object[]{message}, "Category Identifier");
       this.add(TX.class, false, 1, 200, new Object[]{message}, "Category Description");
       this.add(ST.class, false, 0, 200, new Object[]{message}, "Category Synonym");
       this.add(DTM.class, false, 1, 24, new Object[]{message}, "Effective Test/Service Start Date/Time");
       this.add(DTM.class, false, 1, 24, new Object[]{message}, "Effective Test/Service End Date/Time");
       this.add(NM.class, false, 1, 5, new Object[]{message}, "Test/Service Default Duration Quantity");
       this.add(CWE.class, false, 1, 250, new Object[]{message}, "Test/Service Default Duration Units");
       this.add(IS.class, false, 1, 60, new Object[]{message, new Integer(0)}, "Test/Service Default Frequency");
       this.add(ID.class, false, 1, 1, new Object[]{message, new Integer(136)}, "Consent Indicator");
       this.add(CWE.class, false, 1, 250, new Object[]{message}, "Consent Identifier");
       this.add(DTM.class, false, 1, 24, new Object[]{message}, "Consent Effective Start Date/Time");
       this.add(DTM.class, false, 1, 24, new Object[]{message}, "Consent Effective End Date/Time");
       this.add(NM.class, false, 1, 5, new Object[]{message}, "Consent Interval Quantity");
       this.add(CWE.class, false, 1, 250, new Object[]{message}, "Consent Interval Units");
       this.add(NM.class, false, 1, 5, new Object[]{message}, "Consent Waiting Period Quantity");
       this.add(CWE.class, false, 1, 250, new Object[]{message}, "Consent Waiting Period Units");
       this.add(DTM.class, false, 1, 24, new Object[]{message}, "Effective Date/Time of Change");
       this.add(XCN.class, false, 1, 3220, new Object[]{message}, "Entered By");
       this.add(PL.class, false, 0, 200, new Object[]{message}, "Orderable-at Location");
       this.add(IS.class, false, 1, 1, new Object[]{message, new Integer(473)}, "Formulary Status");
       this.add(ID.class, false, 1, 1, new Object[]{message, new Integer(136)}, "Special Order Indicator");
       this.add(CWE.class, false, 0, 250, new Object[]{message}, "Primary Key Value - CDM");
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Can't instantiate " + this.getClass().getName(), he);
    }
  }

  /**
   * Returns Sequence Number - Test/Observation Master File (OM7-1).
   */
  public NM getSequenceNumberTestObservationMasterFile()  {
    NM ret = null;
    try {
        Type t = this.getField(1, 0);
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
   * Returns Sequence Number - Test/Observation Master File (OM7-1).
   */
  public NM getOm71_SequenceNumberTestObservationMasterFile()  {
    NM ret = null;
    try {
        Type t = this.getField(1, 0);
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
   * Returns Universal Service Identifier (OM7-2).
   */
  public CWE getUniversalServiceIdentifier()  {
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
   * Returns Universal Service Identifier (OM7-2).
   */
  public CWE getOm72_UniversalServiceIdentifier()  {
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
   * Returns a single repetition of Category Identifier (OM7-3).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getCategoryIdentifier(int rep) throws HL7Exception {
    CWE ret = null;
    try {
        Type t = this.getField(3, rep);
        ret = (CWE)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Category Identifier (OM7-3).
   */
  public CWE[] getCategoryIdentifier() {
     CWE[] ret = null;
    try {
        Type[] t = this.getField(3);  
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
   * Returns a count of the number of repetitions of Category Identifier (OM7-3).
   */
  public int getCategoryIdentifierReps() {
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
   * Inserts a repetition of Category Identifier (OM7-3) at a given index and returns it.
   * @param index The index
   */
  public CWE insertCategoryIdentifier(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(3, index);
  }

  /**
   * Removes a repetition of Category Identifier (OM7-3) at a given index and returns it.
   * @param index The index
   */
  public CWE removeCategoryIdentifier(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(3, index);
  }

  /**
   * Returns a single repetition of Category Identifier (OM7-3).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getOm73_CategoryIdentifier(int rep) throws HL7Exception {
    CWE ret = null;
    try {
        Type t = this.getField(3, rep);
        ret = (CWE)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Category Identifier (OM7-3).
   */
  public CWE[] getOm73_CategoryIdentifier() {
     CWE[] ret = null;
    try {
        Type[] t = this.getField(3);  
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
   * Returns a count of the number of repetitions of Category Identifier (OM7-3).
   */
  public int getOm73_CategoryIdentifierReps() {
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
   * Inserts a repetition of Category Identifier (OM7-3) at a given index and returns it.
   * @param index The index
   */
  public CWE insertOm73_CategoryIdentifier(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(3, index);
  }

  /**
   * Removes a repetition of Category Identifier (OM7-3) at a given index and returns it.
   * @param index The index
   */
  public CWE removeOm73_CategoryIdentifier(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(3, index);
  }

  /**
   * Returns Category Description (OM7-4).
   */
  public TX getCategoryDescription()  {
    TX ret = null;
    try {
        Type t = this.getField(4, 0);
        ret = (TX)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns Category Description (OM7-4).
   */
  public TX getOm74_CategoryDescription()  {
    TX ret = null;
    try {
        Type t = this.getField(4, 0);
        ret = (TX)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns a single repetition of Category Synonym (OM7-5).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public ST getCategorySynonym(int rep) throws HL7Exception {
    ST ret = null;
    try {
        Type t = this.getField(5, rep);
        ret = (ST)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Category Synonym (OM7-5).
   */
  public ST[] getCategorySynonym() {
     ST[] ret = null;
    try {
        Type[] t = this.getField(5);  
        ret = new ST[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (ST)t[i];
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
   * Returns a count of the number of repetitions of Category Synonym (OM7-5).
   */
  public int getCategorySynonymReps() {
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
   * Inserts a repetition of Category Synonym (OM7-5) at a given index and returns it.
   * @param index The index
   */
  public ST insertCategorySynonym(int index) throws HL7Exception {
     return (ST) super.insertRepetition(5, index);
  }

  /**
   * Removes a repetition of Category Synonym (OM7-5) at a given index and returns it.
   * @param index The index
   */
  public ST removeCategorySynonym(int index) throws HL7Exception {
     return (ST) super.removeRepetition(5, index);
  }

  /**
   * Returns a single repetition of Category Synonym (OM7-5).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public ST getOm75_CategorySynonym(int rep) throws HL7Exception {
    ST ret = null;
    try {
        Type t = this.getField(5, rep);
        ret = (ST)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Category Synonym (OM7-5).
   */
  public ST[] getOm75_CategorySynonym() {
     ST[] ret = null;
    try {
        Type[] t = this.getField(5);  
        ret = new ST[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (ST)t[i];
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
   * Returns a count of the number of repetitions of Category Synonym (OM7-5).
   */
  public int getOm75_CategorySynonymReps() {
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
   * Inserts a repetition of Category Synonym (OM7-5) at a given index and returns it.
   * @param index The index
   */
  public ST insertOm75_CategorySynonym(int index) throws HL7Exception {
     return (ST) super.insertRepetition(5, index);
  }

  /**
   * Removes a repetition of Category Synonym (OM7-5) at a given index and returns it.
   * @param index The index
   */
  public ST removeOm75_CategorySynonym(int index) throws HL7Exception {
     return (ST) super.removeRepetition(5, index);
  }

  /**
   * Returns Effective Test/Service Start Date/Time (OM7-6).
   */
  public DTM getEffectiveTestServiceStartDateTime()  {
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
   * Returns Effective Test/Service Start Date/Time (OM7-6).
   */
  public DTM getOm76_EffectiveTestServiceStartDateTime()  {
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
   * Returns Effective Test/Service End Date/Time (OM7-7).
   */
  public DTM getEffectiveTestServiceEndDateTime()  {
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
   * Returns Effective Test/Service End Date/Time (OM7-7).
   */
  public DTM getOm77_EffectiveTestServiceEndDateTime()  {
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
   * Returns Test/Service Default Duration Quantity (OM7-8).
   */
  public NM getTestServiceDefaultDurationQuantity()  {
    NM ret = null;
    try {
        Type t = this.getField(8, 0);
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
   * Returns Test/Service Default Duration Quantity (OM7-8).
   */
  public NM getOm78_TestServiceDefaultDurationQuantity()  {
    NM ret = null;
    try {
        Type t = this.getField(8, 0);
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
   * Returns Test/Service Default Duration Units (OM7-9).
   */
  public CWE getTestServiceDefaultDurationUnits()  {
    CWE ret = null;
    try {
        Type t = this.getField(9, 0);
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
   * Returns Test/Service Default Duration Units (OM7-9).
   */
  public CWE getOm79_TestServiceDefaultDurationUnits()  {
    CWE ret = null;
    try {
        Type t = this.getField(9, 0);
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
   * Returns Test/Service Default Frequency (OM7-10).
   */
  public IS getTestServiceDefaultFrequency()  {
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
   * Returns Test/Service Default Frequency (OM7-10).
   */
  public IS getOm710_TestServiceDefaultFrequency()  {
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
   * Returns Consent Indicator (OM7-11).
   */
  public ID getConsentIndicator()  {
    ID ret = null;
    try {
        Type t = this.getField(11, 0);
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
   * Returns Consent Indicator (OM7-11).
   */
  public ID getOm711_ConsentIndicator()  {
    ID ret = null;
    try {
        Type t = this.getField(11, 0);
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
   * Returns Consent Identifier (OM7-12).
   */
  public CWE getConsentIdentifier()  {
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
   * Returns Consent Identifier (OM7-12).
   */
  public CWE getOm712_ConsentIdentifier()  {
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
   * Returns Consent Effective Start Date/Time (OM7-13).
   */
  public DTM getConsentEffectiveStartDateTime()  {
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
   * Returns Consent Effective Start Date/Time (OM7-13).
   */
  public DTM getOm713_ConsentEffectiveStartDateTime()  {
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
   * Returns Consent Effective End Date/Time (OM7-14).
   */
  public DTM getConsentEffectiveEndDateTime()  {
    DTM ret = null;
    try {
        Type t = this.getField(14, 0);
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
   * Returns Consent Effective End Date/Time (OM7-14).
   */
  public DTM getOm714_ConsentEffectiveEndDateTime()  {
    DTM ret = null;
    try {
        Type t = this.getField(14, 0);
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
   * Returns Consent Interval Quantity (OM7-15).
   */
  public NM getConsentIntervalQuantity()  {
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
   * Returns Consent Interval Quantity (OM7-15).
   */
  public NM getOm715_ConsentIntervalQuantity()  {
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
   * Returns Consent Interval Units (OM7-16).
   */
  public CWE getConsentIntervalUnits()  {
    CWE ret = null;
    try {
        Type t = this.getField(16, 0);
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
   * Returns Consent Interval Units (OM7-16).
   */
  public CWE getOm716_ConsentIntervalUnits()  {
    CWE ret = null;
    try {
        Type t = this.getField(16, 0);
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
   * Returns Consent Waiting Period Quantity (OM7-17).
   */
  public NM getConsentWaitingPeriodQuantity()  {
    NM ret = null;
    try {
        Type t = this.getField(17, 0);
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
   * Returns Consent Waiting Period Quantity (OM7-17).
   */
  public NM getOm717_ConsentWaitingPeriodQuantity()  {
    NM ret = null;
    try {
        Type t = this.getField(17, 0);
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
   * Returns Consent Waiting Period Units (OM7-18).
   */
  public CWE getConsentWaitingPeriodUnits()  {
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
   * Returns Consent Waiting Period Units (OM7-18).
   */
  public CWE getOm718_ConsentWaitingPeriodUnits()  {
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
   * Returns Effective Date/Time of Change (OM7-19).
   */
  public DTM getEffectiveDateTimeOfChange()  {
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
   * Returns Effective Date/Time of Change (OM7-19).
   */
  public DTM getOm719_EffectiveDateTimeOfChange()  {
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
   * Returns Entered By (OM7-20).
   */
  public XCN getEnteredBy()  {
    XCN ret = null;
    try {
        Type t = this.getField(20, 0);
        ret = (XCN)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns Entered By (OM7-20).
   */
  public XCN getOm720_EnteredBy()  {
    XCN ret = null;
    try {
        Type t = this.getField(20, 0);
        ret = (XCN)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns a single repetition of Orderable-at Location (OM7-21).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public PL getOrderableAtLocation(int rep) throws HL7Exception {
    PL ret = null;
    try {
        Type t = this.getField(21, rep);
        ret = (PL)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Orderable-at Location (OM7-21).
   */
  public PL[] getOrderableAtLocation() {
     PL[] ret = null;
    try {
        Type[] t = this.getField(21);  
        ret = new PL[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (PL)t[i];
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
   * Returns a count of the number of repetitions of Orderable-at Location (OM7-21).
   */
  public int getOrderableAtLocationReps() {
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
   * Inserts a repetition of Orderable-at Location (OM7-21) at a given index and returns it.
   * @param index The index
   */
  public PL insertOrderableAtLocation(int index) throws HL7Exception {
     return (PL) super.insertRepetition(21, index);
  }

  /**
   * Removes a repetition of Orderable-at Location (OM7-21) at a given index and returns it.
   * @param index The index
   */
  public PL removeOrderableAtLocation(int index) throws HL7Exception {
     return (PL) super.removeRepetition(21, index);
  }

  /**
   * Returns a single repetition of Orderable-at Location (OM7-21).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public PL getOm721_OrderableAtLocation(int rep) throws HL7Exception {
    PL ret = null;
    try {
        Type t = this.getField(21, rep);
        ret = (PL)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Orderable-at Location (OM7-21).
   */
  public PL[] getOm721_OrderableAtLocation() {
     PL[] ret = null;
    try {
        Type[] t = this.getField(21);  
        ret = new PL[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (PL)t[i];
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
   * Returns a count of the number of repetitions of Orderable-at Location (OM7-21).
   */
  public int getOm721_OrderableAtLocationReps() {
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
   * Inserts a repetition of Orderable-at Location (OM7-21) at a given index and returns it.
   * @param index The index
   */
  public PL insertOm721_OrderableAtLocation(int index) throws HL7Exception {
     return (PL) super.insertRepetition(21, index);
  }

  /**
   * Removes a repetition of Orderable-at Location (OM7-21) at a given index and returns it.
   * @param index The index
   */
  public PL removeOm721_OrderableAtLocation(int index) throws HL7Exception {
     return (PL) super.removeRepetition(21, index);
  }

  /**
   * Returns Formulary Status (OM7-22).
   */
  public IS getFormularyStatus()  {
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
   * Returns Formulary Status (OM7-22).
   */
  public IS getOm722_FormularyStatus()  {
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
   * Returns Special Order Indicator (OM7-23).
   */
  public ID getSpecialOrderIndicator()  {
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
   * Returns Special Order Indicator (OM7-23).
   */
  public ID getOm723_SpecialOrderIndicator()  {
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
   * Returns a single repetition of Primary Key Value - CDM (OM7-24).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getPrimaryKeyValueCDM(int rep) throws HL7Exception {
    CWE ret = null;
    try {
        Type t = this.getField(24, rep);
        ret = (CWE)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Primary Key Value - CDM (OM7-24).
   */
  public CWE[] getPrimaryKeyValueCDM() {
     CWE[] ret = null;
    try {
        Type[] t = this.getField(24);  
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
   * Returns a count of the number of repetitions of Primary Key Value - CDM (OM7-24).
   */
  public int getPrimaryKeyValueCDMReps() {
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
   * Inserts a repetition of Primary Key Value - CDM (OM7-24) at a given index and returns it.
   * @param index The index
   */
  public CWE insertPrimaryKeyValueCDM(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(24, index);
  }

  /**
   * Removes a repetition of Primary Key Value - CDM (OM7-24) at a given index and returns it.
   * @param index The index
   */
  public CWE removePrimaryKeyValueCDM(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(24, index);
  }

  /**
   * Returns a single repetition of Primary Key Value - CDM (OM7-24).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getOm724_PrimaryKeyValueCDM(int rep) throws HL7Exception {
    CWE ret = null;
    try {
        Type t = this.getField(24, rep);
        ret = (CWE)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Primary Key Value - CDM (OM7-24).
   */
  public CWE[] getOm724_PrimaryKeyValueCDM() {
     CWE[] ret = null;
    try {
        Type[] t = this.getField(24);  
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
   * Returns a count of the number of repetitions of Primary Key Value - CDM (OM7-24).
   */
  public int getOm724_PrimaryKeyValueCDMReps() {
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
   * Inserts a repetition of Primary Key Value - CDM (OM7-24) at a given index and returns it.
   * @param index The index
   */
  public CWE insertOm724_PrimaryKeyValueCDM(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(24, index);
  }

  /**
   * Removes a repetition of Primary Key Value - CDM (OM7-24) at a given index and returns it.
   * @param index The index
   */
  public CWE removeOm724_PrimaryKeyValueCDM(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(24, index);
  }

   protected Type createNewTypeWithoutReflection(int field) {
      switch (field) {
         case 0: return new ca.uhn.hl7v2.model.v26.datatype.NM(getMessage());
         case 1: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 2: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 3: return new ca.uhn.hl7v2.model.v26.datatype.TX(getMessage());
         case 4: return new ca.uhn.hl7v2.model.v26.datatype.ST(getMessage());
         case 5: return new ca.uhn.hl7v2.model.v26.datatype.DTM(getMessage());
         case 6: return new ca.uhn.hl7v2.model.v26.datatype.DTM(getMessage());
         case 7: return new ca.uhn.hl7v2.model.v26.datatype.NM(getMessage());
         case 8: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 9: return new ca.uhn.hl7v2.model.v26.datatype.IS(getMessage(), new Integer(0));
         case 10: return new ca.uhn.hl7v2.model.v26.datatype.ID(getMessage(), new Integer(136));
         case 11: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 12: return new ca.uhn.hl7v2.model.v26.datatype.DTM(getMessage());
         case 13: return new ca.uhn.hl7v2.model.v26.datatype.DTM(getMessage());
         case 14: return new ca.uhn.hl7v2.model.v26.datatype.NM(getMessage());
         case 15: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 16: return new ca.uhn.hl7v2.model.v26.datatype.NM(getMessage());
         case 17: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 18: return new ca.uhn.hl7v2.model.v26.datatype.DTM(getMessage());
         case 19: return new ca.uhn.hl7v2.model.v26.datatype.XCN(getMessage());
         case 20: return new ca.uhn.hl7v2.model.v26.datatype.PL(getMessage());
         case 21: return new ca.uhn.hl7v2.model.v26.datatype.IS(getMessage(), new Integer(473));
         case 22: return new ca.uhn.hl7v2.model.v26.datatype.ID(getMessage(), new Integer(136));
         case 23: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         default: return null;
      }
   }

}