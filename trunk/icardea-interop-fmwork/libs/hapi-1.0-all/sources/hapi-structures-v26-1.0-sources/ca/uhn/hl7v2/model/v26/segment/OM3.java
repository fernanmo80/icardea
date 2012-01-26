package ca.uhn.hl7v2.model.v26.segment;

import ca.uhn.hl7v2.model.*;
import ca.uhn.hl7v2.model.v26.datatype.*;
import ca.uhn.log.HapiLogFactory;
import ca.uhn.hl7v2.parser.ModelClassFactory;
import ca.uhn.hl7v2.HL7Exception;

/**
 * <p>Represents an HL7 OM3 message segment. 
 * This segment has the following fields:</p><p>
 * OM3-1: Sequence Number - Test/Observation Master File (NM)<br> 
 * OM3-2: Preferred Coding System (CWE)<br> 
 * OM3-3: Valid Coded "Answers" (CWE)<br> 
 * OM3-4: Normal Text/Codes for Categorical Observations (CWE)<br> 
 * OM3-5: Abnormal Text/Codes for Categorical Observations (CWE)<br> 
 * OM3-6: Critical Text/Codes for Categorical Observations (CWE)<br> 
 * OM3-7: Value Type (ID)<br> 
 * </p><p>The get...() methods return data from individual fields.  These methods 
 * do not throw exceptions and may therefore have to handle exceptions internally.  
 * If an exception is handled internally, it is logged and null is returned.  
 * This is not expected to happen - if it does happen this indicates not so much 
 * an exceptional circumstance as a bug in the code for this class.</p>    
 */
public class OM3 extends AbstractSegment  {

  /**
   * Creates a OM3 (Categorical Service/Test/Observation) segment object that belongs to the given 
   * message.  
   */
  public OM3(Group parent, ModelClassFactory factory) {
    super(parent, factory);
    Message message = getMessage();
    try {
       this.add(NM.class, false, 1, 4, new Object[]{message}, "Sequence Number - Test/Observation Master File");
       this.add(CWE.class, false, 1, 250, new Object[]{message}, "Preferred Coding System");
       this.add(CWE.class, false, 0, 250, new Object[]{message}, "Valid Coded \"Answers\"");
       this.add(CWE.class, false, 0, 250, new Object[]{message}, "Normal Text/Codes for Categorical Observations");
       this.add(CWE.class, false, 0, 250, new Object[]{message}, "Abnormal Text/Codes for Categorical Observations");
       this.add(CWE.class, false, 0, 250, new Object[]{message}, "Critical Text/Codes for Categorical Observations");
       this.add(ID.class, false, 1, 3, new Object[]{message, new Integer(125)}, "Value Type");
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Can't instantiate " + this.getClass().getName(), he);
    }
  }

  /**
   * Returns Sequence Number - Test/Observation Master File (OM3-1).
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
   * Returns Sequence Number - Test/Observation Master File (OM3-1).
   */
  public NM getOm31_SequenceNumberTestObservationMasterFile()  {
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
   * Returns Preferred Coding System (OM3-2).
   */
  public CWE getPreferredCodingSystem()  {
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
   * Returns Preferred Coding System (OM3-2).
   */
  public CWE getOm32_PreferredCodingSystem()  {
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
   * Returns a single repetition of Valid Coded "Answers" (OM3-3).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getValidCodedAnswers(int rep) throws HL7Exception {
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
   * Returns all repetitions of Valid Coded "Answers" (OM3-3).
   */
  public CWE[] getValidCodedAnswers() {
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
   * Returns a count of the number of repetitions of Valid Coded "Answers" (OM3-3).
   */
  public int getValidCodedAnswersReps() {
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
   * Inserts a repetition of Valid Coded "Answers" (OM3-3) at a given index and returns it.
   * @param index The index
   */
  public CWE insertValidCodedAnswers(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(3, index);
  }

  /**
   * Removes a repetition of Valid Coded "Answers" (OM3-3) at a given index and returns it.
   * @param index The index
   */
  public CWE removeValidCodedAnswers(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(3, index);
  }

  /**
   * Returns a single repetition of Valid Coded "Answers" (OM3-3).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getOm33_ValidCodedAnswers(int rep) throws HL7Exception {
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
   * Returns all repetitions of Valid Coded "Answers" (OM3-3).
   */
  public CWE[] getOm33_ValidCodedAnswers() {
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
   * Returns a count of the number of repetitions of Valid Coded "Answers" (OM3-3).
   */
  public int getOm33_ValidCodedAnswersReps() {
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
   * Inserts a repetition of Valid Coded "Answers" (OM3-3) at a given index and returns it.
   * @param index The index
   */
  public CWE insertOm33_ValidCodedAnswers(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(3, index);
  }

  /**
   * Removes a repetition of Valid Coded "Answers" (OM3-3) at a given index and returns it.
   * @param index The index
   */
  public CWE removeOm33_ValidCodedAnswers(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(3, index);
  }

  /**
   * Returns a single repetition of Normal Text/Codes for Categorical Observations (OM3-4).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getNormalTextCodesForCategoricalObservations(int rep) throws HL7Exception {
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
   * Returns all repetitions of Normal Text/Codes for Categorical Observations (OM3-4).
   */
  public CWE[] getNormalTextCodesForCategoricalObservations() {
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
   * Returns a count of the number of repetitions of Normal Text/Codes for Categorical Observations (OM3-4).
   */
  public int getNormalTextCodesForCategoricalObservationsReps() {
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
   * Inserts a repetition of Normal Text/Codes for Categorical Observations (OM3-4) at a given index and returns it.
   * @param index The index
   */
  public CWE insertNormalTextCodesForCategoricalObservations(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(4, index);
  }

  /**
   * Removes a repetition of Normal Text/Codes for Categorical Observations (OM3-4) at a given index and returns it.
   * @param index The index
   */
  public CWE removeNormalTextCodesForCategoricalObservations(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(4, index);
  }

  /**
   * Returns a single repetition of Normal Text/Codes for Categorical Observations (OM3-4).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getOm34_NormalTextCodesForCategoricalObservations(int rep) throws HL7Exception {
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
   * Returns all repetitions of Normal Text/Codes for Categorical Observations (OM3-4).
   */
  public CWE[] getOm34_NormalTextCodesForCategoricalObservations() {
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
   * Returns a count of the number of repetitions of Normal Text/Codes for Categorical Observations (OM3-4).
   */
  public int getOm34_NormalTextCodesForCategoricalObservationsReps() {
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
   * Inserts a repetition of Normal Text/Codes for Categorical Observations (OM3-4) at a given index and returns it.
   * @param index The index
   */
  public CWE insertOm34_NormalTextCodesForCategoricalObservations(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(4, index);
  }

  /**
   * Removes a repetition of Normal Text/Codes for Categorical Observations (OM3-4) at a given index and returns it.
   * @param index The index
   */
  public CWE removeOm34_NormalTextCodesForCategoricalObservations(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(4, index);
  }

  /**
   * Returns a single repetition of Abnormal Text/Codes for Categorical Observations (OM3-5).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getAbnormalTextCodesForCategoricalObservations(int rep) throws HL7Exception {
    CWE ret = null;
    try {
        Type t = this.getField(5, rep);
        ret = (CWE)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Abnormal Text/Codes for Categorical Observations (OM3-5).
   */
  public CWE[] getAbnormalTextCodesForCategoricalObservations() {
     CWE[] ret = null;
    try {
        Type[] t = this.getField(5);  
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
   * Returns a count of the number of repetitions of Abnormal Text/Codes for Categorical Observations (OM3-5).
   */
  public int getAbnormalTextCodesForCategoricalObservationsReps() {
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
   * Inserts a repetition of Abnormal Text/Codes for Categorical Observations (OM3-5) at a given index and returns it.
   * @param index The index
   */
  public CWE insertAbnormalTextCodesForCategoricalObservations(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(5, index);
  }

  /**
   * Removes a repetition of Abnormal Text/Codes for Categorical Observations (OM3-5) at a given index and returns it.
   * @param index The index
   */
  public CWE removeAbnormalTextCodesForCategoricalObservations(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(5, index);
  }

  /**
   * Returns a single repetition of Abnormal Text/Codes for Categorical Observations (OM3-5).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getOm35_AbnormalTextCodesForCategoricalObservations(int rep) throws HL7Exception {
    CWE ret = null;
    try {
        Type t = this.getField(5, rep);
        ret = (CWE)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Abnormal Text/Codes for Categorical Observations (OM3-5).
   */
  public CWE[] getOm35_AbnormalTextCodesForCategoricalObservations() {
     CWE[] ret = null;
    try {
        Type[] t = this.getField(5);  
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
   * Returns a count of the number of repetitions of Abnormal Text/Codes for Categorical Observations (OM3-5).
   */
  public int getOm35_AbnormalTextCodesForCategoricalObservationsReps() {
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
   * Inserts a repetition of Abnormal Text/Codes for Categorical Observations (OM3-5) at a given index and returns it.
   * @param index The index
   */
  public CWE insertOm35_AbnormalTextCodesForCategoricalObservations(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(5, index);
  }

  /**
   * Removes a repetition of Abnormal Text/Codes for Categorical Observations (OM3-5) at a given index and returns it.
   * @param index The index
   */
  public CWE removeOm35_AbnormalTextCodesForCategoricalObservations(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(5, index);
  }

  /**
   * Returns a single repetition of Critical Text/Codes for Categorical Observations (OM3-6).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getCriticalTextCodesForCategoricalObservations(int rep) throws HL7Exception {
    CWE ret = null;
    try {
        Type t = this.getField(6, rep);
        ret = (CWE)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Critical Text/Codes for Categorical Observations (OM3-6).
   */
  public CWE[] getCriticalTextCodesForCategoricalObservations() {
     CWE[] ret = null;
    try {
        Type[] t = this.getField(6);  
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
   * Returns a count of the number of repetitions of Critical Text/Codes for Categorical Observations (OM3-6).
   */
  public int getCriticalTextCodesForCategoricalObservationsReps() {
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
   * Inserts a repetition of Critical Text/Codes for Categorical Observations (OM3-6) at a given index and returns it.
   * @param index The index
   */
  public CWE insertCriticalTextCodesForCategoricalObservations(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(6, index);
  }

  /**
   * Removes a repetition of Critical Text/Codes for Categorical Observations (OM3-6) at a given index and returns it.
   * @param index The index
   */
  public CWE removeCriticalTextCodesForCategoricalObservations(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(6, index);
  }

  /**
   * Returns a single repetition of Critical Text/Codes for Categorical Observations (OM3-6).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getOm36_CriticalTextCodesForCategoricalObservations(int rep) throws HL7Exception {
    CWE ret = null;
    try {
        Type t = this.getField(6, rep);
        ret = (CWE)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Critical Text/Codes for Categorical Observations (OM3-6).
   */
  public CWE[] getOm36_CriticalTextCodesForCategoricalObservations() {
     CWE[] ret = null;
    try {
        Type[] t = this.getField(6);  
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
   * Returns a count of the number of repetitions of Critical Text/Codes for Categorical Observations (OM3-6).
   */
  public int getOm36_CriticalTextCodesForCategoricalObservationsReps() {
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
   * Inserts a repetition of Critical Text/Codes for Categorical Observations (OM3-6) at a given index and returns it.
   * @param index The index
   */
  public CWE insertOm36_CriticalTextCodesForCategoricalObservations(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(6, index);
  }

  /**
   * Removes a repetition of Critical Text/Codes for Categorical Observations (OM3-6) at a given index and returns it.
   * @param index The index
   */
  public CWE removeOm36_CriticalTextCodesForCategoricalObservations(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(6, index);
  }

  /**
   * Returns Value Type (OM3-7).
   */
  public ID getValueType()  {
    ID ret = null;
    try {
        Type t = this.getField(7, 0);
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
   * Returns Value Type (OM3-7).
   */
  public ID getOm37_ValueType()  {
    ID ret = null;
    try {
        Type t = this.getField(7, 0);
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

   protected Type createNewTypeWithoutReflection(int field) {
      switch (field) {
         case 0: return new ca.uhn.hl7v2.model.v26.datatype.NM(getMessage());
         case 1: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 2: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 3: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 4: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 5: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 6: return new ca.uhn.hl7v2.model.v26.datatype.ID(getMessage(), new Integer(125));
         default: return null;
      }
   }

}