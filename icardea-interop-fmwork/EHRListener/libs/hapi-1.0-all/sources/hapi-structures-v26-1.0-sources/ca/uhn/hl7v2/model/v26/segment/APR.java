package ca.uhn.hl7v2.model.v26.segment;

import ca.uhn.hl7v2.model.*;
import ca.uhn.hl7v2.model.v26.datatype.*;
import ca.uhn.log.HapiLogFactory;
import ca.uhn.hl7v2.parser.ModelClassFactory;
import ca.uhn.hl7v2.HL7Exception;

/**
 * <p>Represents an HL7 APR message segment. 
 * This segment has the following fields:</p><p>
 * APR-1: Time Selection Criteria (SCV)<br> 
 * APR-2: Resource Selection Criteria (SCV)<br> 
 * APR-3: Location Selection Criteria (SCV)<br> 
 * APR-4: Slot Spacing Criteria (NM)<br> 
 * APR-5: Filler Override Criteria (SCV)<br> 
 * </p><p>The get...() methods return data from individual fields.  These methods 
 * do not throw exceptions and may therefore have to handle exceptions internally.  
 * If an exception is handled internally, it is logged and null is returned.  
 * This is not expected to happen - if it does happen this indicates not so much 
 * an exceptional circumstance as a bug in the code for this class.</p>    
 */
public class APR extends AbstractSegment  {

  /**
   * Creates a APR (Appointment Preferences) segment object that belongs to the given 
   * message.  
   */
  public APR(Group parent, ModelClassFactory factory) {
    super(parent, factory);
    Message message = getMessage();
    try {
       this.add(SCV.class, false, 0, 80, new Object[]{message}, "Time Selection Criteria");
       this.add(SCV.class, false, 0, 80, new Object[]{message}, "Resource Selection Criteria");
       this.add(SCV.class, false, 0, 80, new Object[]{message}, "Location Selection Criteria");
       this.add(NM.class, false, 1, 5, new Object[]{message}, "Slot Spacing Criteria");
       this.add(SCV.class, false, 0, 80, new Object[]{message}, "Filler Override Criteria");
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Can't instantiate " + this.getClass().getName(), he);
    }
  }

  /**
   * Returns a single repetition of Time Selection Criteria (APR-1).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public SCV getTimeSelectionCriteria(int rep) throws HL7Exception {
    SCV ret = null;
    try {
        Type t = this.getField(1, rep);
        ret = (SCV)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Time Selection Criteria (APR-1).
   */
  public SCV[] getTimeSelectionCriteria() {
     SCV[] ret = null;
    try {
        Type[] t = this.getField(1);  
        ret = new SCV[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (SCV)t[i];
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
   * Returns a count of the number of repetitions of Time Selection Criteria (APR-1).
   */
  public int getTimeSelectionCriteriaReps() {
    try {
        return this.getField(1).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Time Selection Criteria (APR-1) at a given index and returns it.
   * @param index The index
   */
  public SCV insertTimeSelectionCriteria(int index) throws HL7Exception {
     return (SCV) super.insertRepetition(1, index);
  }

  /**
   * Removes a repetition of Time Selection Criteria (APR-1) at a given index and returns it.
   * @param index The index
   */
  public SCV removeTimeSelectionCriteria(int index) throws HL7Exception {
     return (SCV) super.removeRepetition(1, index);
  }

  /**
   * Returns a single repetition of Time Selection Criteria (APR-1).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public SCV getApr1_TimeSelectionCriteria(int rep) throws HL7Exception {
    SCV ret = null;
    try {
        Type t = this.getField(1, rep);
        ret = (SCV)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Time Selection Criteria (APR-1).
   */
  public SCV[] getApr1_TimeSelectionCriteria() {
     SCV[] ret = null;
    try {
        Type[] t = this.getField(1);  
        ret = new SCV[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (SCV)t[i];
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
   * Returns a count of the number of repetitions of Time Selection Criteria (APR-1).
   */
  public int getApr1_TimeSelectionCriteriaReps() {
    try {
        return this.getField(1).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Time Selection Criteria (APR-1) at a given index and returns it.
   * @param index The index
   */
  public SCV insertApr1_TimeSelectionCriteria(int index) throws HL7Exception {
     return (SCV) super.insertRepetition(1, index);
  }

  /**
   * Removes a repetition of Time Selection Criteria (APR-1) at a given index and returns it.
   * @param index The index
   */
  public SCV removeApr1_TimeSelectionCriteria(int index) throws HL7Exception {
     return (SCV) super.removeRepetition(1, index);
  }

  /**
   * Returns a single repetition of Resource Selection Criteria (APR-2).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public SCV getResourceSelectionCriteria(int rep) throws HL7Exception {
    SCV ret = null;
    try {
        Type t = this.getField(2, rep);
        ret = (SCV)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Resource Selection Criteria (APR-2).
   */
  public SCV[] getResourceSelectionCriteria() {
     SCV[] ret = null;
    try {
        Type[] t = this.getField(2);  
        ret = new SCV[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (SCV)t[i];
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
   * Returns a count of the number of repetitions of Resource Selection Criteria (APR-2).
   */
  public int getResourceSelectionCriteriaReps() {
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
   * Inserts a repetition of Resource Selection Criteria (APR-2) at a given index and returns it.
   * @param index The index
   */
  public SCV insertResourceSelectionCriteria(int index) throws HL7Exception {
     return (SCV) super.insertRepetition(2, index);
  }

  /**
   * Removes a repetition of Resource Selection Criteria (APR-2) at a given index and returns it.
   * @param index The index
   */
  public SCV removeResourceSelectionCriteria(int index) throws HL7Exception {
     return (SCV) super.removeRepetition(2, index);
  }

  /**
   * Returns a single repetition of Resource Selection Criteria (APR-2).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public SCV getApr2_ResourceSelectionCriteria(int rep) throws HL7Exception {
    SCV ret = null;
    try {
        Type t = this.getField(2, rep);
        ret = (SCV)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Resource Selection Criteria (APR-2).
   */
  public SCV[] getApr2_ResourceSelectionCriteria() {
     SCV[] ret = null;
    try {
        Type[] t = this.getField(2);  
        ret = new SCV[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (SCV)t[i];
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
   * Returns a count of the number of repetitions of Resource Selection Criteria (APR-2).
   */
  public int getApr2_ResourceSelectionCriteriaReps() {
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
   * Inserts a repetition of Resource Selection Criteria (APR-2) at a given index and returns it.
   * @param index The index
   */
  public SCV insertApr2_ResourceSelectionCriteria(int index) throws HL7Exception {
     return (SCV) super.insertRepetition(2, index);
  }

  /**
   * Removes a repetition of Resource Selection Criteria (APR-2) at a given index and returns it.
   * @param index The index
   */
  public SCV removeApr2_ResourceSelectionCriteria(int index) throws HL7Exception {
     return (SCV) super.removeRepetition(2, index);
  }

  /**
   * Returns a single repetition of Location Selection Criteria (APR-3).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public SCV getLocationSelectionCriteria(int rep) throws HL7Exception {
    SCV ret = null;
    try {
        Type t = this.getField(3, rep);
        ret = (SCV)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Location Selection Criteria (APR-3).
   */
  public SCV[] getLocationSelectionCriteria() {
     SCV[] ret = null;
    try {
        Type[] t = this.getField(3);  
        ret = new SCV[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (SCV)t[i];
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
   * Returns a count of the number of repetitions of Location Selection Criteria (APR-3).
   */
  public int getLocationSelectionCriteriaReps() {
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
   * Inserts a repetition of Location Selection Criteria (APR-3) at a given index and returns it.
   * @param index The index
   */
  public SCV insertLocationSelectionCriteria(int index) throws HL7Exception {
     return (SCV) super.insertRepetition(3, index);
  }

  /**
   * Removes a repetition of Location Selection Criteria (APR-3) at a given index and returns it.
   * @param index The index
   */
  public SCV removeLocationSelectionCriteria(int index) throws HL7Exception {
     return (SCV) super.removeRepetition(3, index);
  }

  /**
   * Returns a single repetition of Location Selection Criteria (APR-3).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public SCV getApr3_LocationSelectionCriteria(int rep) throws HL7Exception {
    SCV ret = null;
    try {
        Type t = this.getField(3, rep);
        ret = (SCV)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Location Selection Criteria (APR-3).
   */
  public SCV[] getApr3_LocationSelectionCriteria() {
     SCV[] ret = null;
    try {
        Type[] t = this.getField(3);  
        ret = new SCV[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (SCV)t[i];
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
   * Returns a count of the number of repetitions of Location Selection Criteria (APR-3).
   */
  public int getApr3_LocationSelectionCriteriaReps() {
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
   * Inserts a repetition of Location Selection Criteria (APR-3) at a given index and returns it.
   * @param index The index
   */
  public SCV insertApr3_LocationSelectionCriteria(int index) throws HL7Exception {
     return (SCV) super.insertRepetition(3, index);
  }

  /**
   * Removes a repetition of Location Selection Criteria (APR-3) at a given index and returns it.
   * @param index The index
   */
  public SCV removeApr3_LocationSelectionCriteria(int index) throws HL7Exception {
     return (SCV) super.removeRepetition(3, index);
  }

  /**
   * Returns Slot Spacing Criteria (APR-4).
   */
  public NM getSlotSpacingCriteria()  {
    NM ret = null;
    try {
        Type t = this.getField(4, 0);
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
   * Returns Slot Spacing Criteria (APR-4).
   */
  public NM getApr4_SlotSpacingCriteria()  {
    NM ret = null;
    try {
        Type t = this.getField(4, 0);
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
   * Returns a single repetition of Filler Override Criteria (APR-5).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public SCV getFillerOverrideCriteria(int rep) throws HL7Exception {
    SCV ret = null;
    try {
        Type t = this.getField(5, rep);
        ret = (SCV)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Filler Override Criteria (APR-5).
   */
  public SCV[] getFillerOverrideCriteria() {
     SCV[] ret = null;
    try {
        Type[] t = this.getField(5);  
        ret = new SCV[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (SCV)t[i];
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
   * Returns a count of the number of repetitions of Filler Override Criteria (APR-5).
   */
  public int getFillerOverrideCriteriaReps() {
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
   * Inserts a repetition of Filler Override Criteria (APR-5) at a given index and returns it.
   * @param index The index
   */
  public SCV insertFillerOverrideCriteria(int index) throws HL7Exception {
     return (SCV) super.insertRepetition(5, index);
  }

  /**
   * Removes a repetition of Filler Override Criteria (APR-5) at a given index and returns it.
   * @param index The index
   */
  public SCV removeFillerOverrideCriteria(int index) throws HL7Exception {
     return (SCV) super.removeRepetition(5, index);
  }

  /**
   * Returns a single repetition of Filler Override Criteria (APR-5).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public SCV getApr5_FillerOverrideCriteria(int rep) throws HL7Exception {
    SCV ret = null;
    try {
        Type t = this.getField(5, rep);
        ret = (SCV)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Filler Override Criteria (APR-5).
   */
  public SCV[] getApr5_FillerOverrideCriteria() {
     SCV[] ret = null;
    try {
        Type[] t = this.getField(5);  
        ret = new SCV[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (SCV)t[i];
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
   * Returns a count of the number of repetitions of Filler Override Criteria (APR-5).
   */
  public int getApr5_FillerOverrideCriteriaReps() {
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
   * Inserts a repetition of Filler Override Criteria (APR-5) at a given index and returns it.
   * @param index The index
   */
  public SCV insertApr5_FillerOverrideCriteria(int index) throws HL7Exception {
     return (SCV) super.insertRepetition(5, index);
  }

  /**
   * Removes a repetition of Filler Override Criteria (APR-5) at a given index and returns it.
   * @param index The index
   */
  public SCV removeApr5_FillerOverrideCriteria(int index) throws HL7Exception {
     return (SCV) super.removeRepetition(5, index);
  }

   protected Type createNewTypeWithoutReflection(int field) {
      switch (field) {
         case 0: return new ca.uhn.hl7v2.model.v26.datatype.SCV(getMessage());
         case 1: return new ca.uhn.hl7v2.model.v26.datatype.SCV(getMessage());
         case 2: return new ca.uhn.hl7v2.model.v26.datatype.SCV(getMessage());
         case 3: return new ca.uhn.hl7v2.model.v26.datatype.NM(getMessage());
         case 4: return new ca.uhn.hl7v2.model.v26.datatype.SCV(getMessage());
         default: return null;
      }
   }

}