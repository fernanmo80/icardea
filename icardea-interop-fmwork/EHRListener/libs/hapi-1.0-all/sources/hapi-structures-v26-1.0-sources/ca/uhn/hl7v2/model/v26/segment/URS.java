package ca.uhn.hl7v2.model.v26.segment;

import ca.uhn.hl7v2.model.*;
import ca.uhn.hl7v2.model.v26.datatype.*;
import ca.uhn.log.HapiLogFactory;
import ca.uhn.hl7v2.parser.ModelClassFactory;
import ca.uhn.hl7v2.HL7Exception;

/**
 * <p>Represents an HL7 URS message segment. 
 * This segment has the following fields:</p><p>
 * URS-1: R/U Where Subject Definition (ST)<br> 
 * URS-2: R/U When Data Start Date/Time (DTM)<br> 
 * URS-3: R/U When Data End Date/Time (DTM)<br> 
 * URS-4: R/U What User Qualifier (ST)<br> 
 * URS-5: R/U Other Results Subject Definition (ST)<br> 
 * URS-6: R/U Which Date/Time Qualifier (ID)<br> 
 * URS-7: R/U Which Date/Time Status Qualifier (ID)<br> 
 * URS-8: R/U Date/Time Selection Qualifier (ID)<br> 
 * URS-9: R/U Quantity/Timing Qualifier (TQ)<br> 
 * </p><p>The get...() methods return data from individual fields.  These methods 
 * do not throw exceptions and may therefore have to handle exceptions internally.  
 * If an exception is handled internally, it is logged and null is returned.  
 * This is not expected to happen - if it does happen this indicates not so much 
 * an exceptional circumstance as a bug in the code for this class.</p>    
 */
public class URS extends AbstractSegment  {

  /**
   * Creates a URS (Unsolicited Selection) segment object that belongs to the given 
   * message.  
   */
  public URS(Group parent, ModelClassFactory factory) {
    super(parent, factory);
    Message message = getMessage();
    try {
       this.add(ST.class, true, 0, 20, new Object[]{message}, "R/U Where Subject Definition");
       this.add(DTM.class, false, 1, 24, new Object[]{message}, "R/U When Data Start Date/Time");
       this.add(DTM.class, false, 1, 24, new Object[]{message}, "R/U When Data End Date/Time");
       this.add(ST.class, false, 0, 20, new Object[]{message}, "R/U What User Qualifier");
       this.add(ST.class, false, 0, 20, new Object[]{message}, "R/U Other Results Subject Definition");
       this.add(ID.class, false, 0, 12, new Object[]{message, new Integer(156)}, "R/U Which Date/Time Qualifier");
       this.add(ID.class, false, 0, 12, new Object[]{message, new Integer(157)}, "R/U Which Date/Time Status Qualifier");
       this.add(ID.class, false, 0, 12, new Object[]{message, new Integer(158)}, "R/U Date/Time Selection Qualifier");
       this.add(TQ.class, false, 1, 0, new Object[]{message}, "R/U Quantity/Timing Qualifier");
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Can't instantiate " + this.getClass().getName(), he);
    }
  }

  /**
   * Returns a single repetition of R/U Where Subject Definition (URS-1).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public ST getRUWhereSubjectDefinition(int rep) throws HL7Exception {
    ST ret = null;
    try {
        Type t = this.getField(1, rep);
        ret = (ST)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of R/U Where Subject Definition (URS-1).
   */
  public ST[] getRUWhereSubjectDefinition() {
     ST[] ret = null;
    try {
        Type[] t = this.getField(1);  
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
   * Returns a count of the number of repetitions of R/U Where Subject Definition (URS-1).
   */
  public int getRUWhereSubjectDefinitionReps() {
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
   * Inserts a repetition of R/U Where Subject Definition (URS-1) at a given index and returns it.
   * @param index The index
   */
  public ST insertRUWhereSubjectDefinition(int index) throws HL7Exception {
     return (ST) super.insertRepetition(1, index);
  }

  /**
   * Removes a repetition of R/U Where Subject Definition (URS-1) at a given index and returns it.
   * @param index The index
   */
  public ST removeRUWhereSubjectDefinition(int index) throws HL7Exception {
     return (ST) super.removeRepetition(1, index);
  }

  /**
   * Returns a single repetition of R/U Where Subject Definition (URS-1).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public ST getUrs1_RUWhereSubjectDefinition(int rep) throws HL7Exception {
    ST ret = null;
    try {
        Type t = this.getField(1, rep);
        ret = (ST)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of R/U Where Subject Definition (URS-1).
   */
  public ST[] getUrs1_RUWhereSubjectDefinition() {
     ST[] ret = null;
    try {
        Type[] t = this.getField(1);  
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
   * Returns a count of the number of repetitions of R/U Where Subject Definition (URS-1).
   */
  public int getUrs1_RUWhereSubjectDefinitionReps() {
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
   * Inserts a repetition of R/U Where Subject Definition (URS-1) at a given index and returns it.
   * @param index The index
   */
  public ST insertUrs1_RUWhereSubjectDefinition(int index) throws HL7Exception {
     return (ST) super.insertRepetition(1, index);
  }

  /**
   * Removes a repetition of R/U Where Subject Definition (URS-1) at a given index and returns it.
   * @param index The index
   */
  public ST removeUrs1_RUWhereSubjectDefinition(int index) throws HL7Exception {
     return (ST) super.removeRepetition(1, index);
  }

  /**
   * Returns R/U When Data Start Date/Time (URS-2).
   */
  public DTM getRUWhenDataStartDateTime()  {
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
   * Returns R/U When Data Start Date/Time (URS-2).
   */
  public DTM getUrs2_RUWhenDataStartDateTime()  {
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
   * Returns R/U When Data End Date/Time (URS-3).
   */
  public DTM getRUWhenDataEndDateTime()  {
    DTM ret = null;
    try {
        Type t = this.getField(3, 0);
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
   * Returns R/U When Data End Date/Time (URS-3).
   */
  public DTM getUrs3_RUWhenDataEndDateTime()  {
    DTM ret = null;
    try {
        Type t = this.getField(3, 0);
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
   * Returns a single repetition of R/U What User Qualifier (URS-4).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public ST getRUWhatUserQualifier(int rep) throws HL7Exception {
    ST ret = null;
    try {
        Type t = this.getField(4, rep);
        ret = (ST)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of R/U What User Qualifier (URS-4).
   */
  public ST[] getRUWhatUserQualifier() {
     ST[] ret = null;
    try {
        Type[] t = this.getField(4);  
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
   * Returns a count of the number of repetitions of R/U What User Qualifier (URS-4).
   */
  public int getRUWhatUserQualifierReps() {
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
   * Inserts a repetition of R/U What User Qualifier (URS-4) at a given index and returns it.
   * @param index The index
   */
  public ST insertRUWhatUserQualifier(int index) throws HL7Exception {
     return (ST) super.insertRepetition(4, index);
  }

  /**
   * Removes a repetition of R/U What User Qualifier (URS-4) at a given index and returns it.
   * @param index The index
   */
  public ST removeRUWhatUserQualifier(int index) throws HL7Exception {
     return (ST) super.removeRepetition(4, index);
  }

  /**
   * Returns a single repetition of R/U What User Qualifier (URS-4).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public ST getUrs4_RUWhatUserQualifier(int rep) throws HL7Exception {
    ST ret = null;
    try {
        Type t = this.getField(4, rep);
        ret = (ST)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of R/U What User Qualifier (URS-4).
   */
  public ST[] getUrs4_RUWhatUserQualifier() {
     ST[] ret = null;
    try {
        Type[] t = this.getField(4);  
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
   * Returns a count of the number of repetitions of R/U What User Qualifier (URS-4).
   */
  public int getUrs4_RUWhatUserQualifierReps() {
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
   * Inserts a repetition of R/U What User Qualifier (URS-4) at a given index and returns it.
   * @param index The index
   */
  public ST insertUrs4_RUWhatUserQualifier(int index) throws HL7Exception {
     return (ST) super.insertRepetition(4, index);
  }

  /**
   * Removes a repetition of R/U What User Qualifier (URS-4) at a given index and returns it.
   * @param index The index
   */
  public ST removeUrs4_RUWhatUserQualifier(int index) throws HL7Exception {
     return (ST) super.removeRepetition(4, index);
  }

  /**
   * Returns a single repetition of R/U Other Results Subject Definition (URS-5).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public ST getRUOtherResultsSubjectDefinition(int rep) throws HL7Exception {
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
   * Returns all repetitions of R/U Other Results Subject Definition (URS-5).
   */
  public ST[] getRUOtherResultsSubjectDefinition() {
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
   * Returns a count of the number of repetitions of R/U Other Results Subject Definition (URS-5).
   */
  public int getRUOtherResultsSubjectDefinitionReps() {
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
   * Inserts a repetition of R/U Other Results Subject Definition (URS-5) at a given index and returns it.
   * @param index The index
   */
  public ST insertRUOtherResultsSubjectDefinition(int index) throws HL7Exception {
     return (ST) super.insertRepetition(5, index);
  }

  /**
   * Removes a repetition of R/U Other Results Subject Definition (URS-5) at a given index and returns it.
   * @param index The index
   */
  public ST removeRUOtherResultsSubjectDefinition(int index) throws HL7Exception {
     return (ST) super.removeRepetition(5, index);
  }

  /**
   * Returns a single repetition of R/U Other Results Subject Definition (URS-5).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public ST getUrs5_RUOtherResultsSubjectDefinition(int rep) throws HL7Exception {
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
   * Returns all repetitions of R/U Other Results Subject Definition (URS-5).
   */
  public ST[] getUrs5_RUOtherResultsSubjectDefinition() {
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
   * Returns a count of the number of repetitions of R/U Other Results Subject Definition (URS-5).
   */
  public int getUrs5_RUOtherResultsSubjectDefinitionReps() {
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
   * Inserts a repetition of R/U Other Results Subject Definition (URS-5) at a given index and returns it.
   * @param index The index
   */
  public ST insertUrs5_RUOtherResultsSubjectDefinition(int index) throws HL7Exception {
     return (ST) super.insertRepetition(5, index);
  }

  /**
   * Removes a repetition of R/U Other Results Subject Definition (URS-5) at a given index and returns it.
   * @param index The index
   */
  public ST removeUrs5_RUOtherResultsSubjectDefinition(int index) throws HL7Exception {
     return (ST) super.removeRepetition(5, index);
  }

  /**
   * Returns a single repetition of R/U Which Date/Time Qualifier (URS-6).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public ID getRUWhichDateTimeQualifier(int rep) throws HL7Exception {
    ID ret = null;
    try {
        Type t = this.getField(6, rep);
        ret = (ID)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of R/U Which Date/Time Qualifier (URS-6).
   */
  public ID[] getRUWhichDateTimeQualifier() {
     ID[] ret = null;
    try {
        Type[] t = this.getField(6);  
        ret = new ID[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (ID)t[i];
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
   * Returns a count of the number of repetitions of R/U Which Date/Time Qualifier (URS-6).
   */
  public int getRUWhichDateTimeQualifierReps() {
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
   * Inserts a repetition of R/U Which Date/Time Qualifier (URS-6) at a given index and returns it.
   * @param index The index
   */
  public ID insertRUWhichDateTimeQualifier(int index) throws HL7Exception {
     return (ID) super.insertRepetition(6, index);
  }

  /**
   * Removes a repetition of R/U Which Date/Time Qualifier (URS-6) at a given index and returns it.
   * @param index The index
   */
  public ID removeRUWhichDateTimeQualifier(int index) throws HL7Exception {
     return (ID) super.removeRepetition(6, index);
  }

  /**
   * Returns a single repetition of R/U Which Date/Time Qualifier (URS-6).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public ID getUrs6_RUWhichDateTimeQualifier(int rep) throws HL7Exception {
    ID ret = null;
    try {
        Type t = this.getField(6, rep);
        ret = (ID)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of R/U Which Date/Time Qualifier (URS-6).
   */
  public ID[] getUrs6_RUWhichDateTimeQualifier() {
     ID[] ret = null;
    try {
        Type[] t = this.getField(6);  
        ret = new ID[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (ID)t[i];
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
   * Returns a count of the number of repetitions of R/U Which Date/Time Qualifier (URS-6).
   */
  public int getUrs6_RUWhichDateTimeQualifierReps() {
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
   * Inserts a repetition of R/U Which Date/Time Qualifier (URS-6) at a given index and returns it.
   * @param index The index
   */
  public ID insertUrs6_RUWhichDateTimeQualifier(int index) throws HL7Exception {
     return (ID) super.insertRepetition(6, index);
  }

  /**
   * Removes a repetition of R/U Which Date/Time Qualifier (URS-6) at a given index and returns it.
   * @param index The index
   */
  public ID removeUrs6_RUWhichDateTimeQualifier(int index) throws HL7Exception {
     return (ID) super.removeRepetition(6, index);
  }

  /**
   * Returns a single repetition of R/U Which Date/Time Status Qualifier (URS-7).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public ID getRUWhichDateTimeStatusQualifier(int rep) throws HL7Exception {
    ID ret = null;
    try {
        Type t = this.getField(7, rep);
        ret = (ID)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of R/U Which Date/Time Status Qualifier (URS-7).
   */
  public ID[] getRUWhichDateTimeStatusQualifier() {
     ID[] ret = null;
    try {
        Type[] t = this.getField(7);  
        ret = new ID[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (ID)t[i];
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
   * Returns a count of the number of repetitions of R/U Which Date/Time Status Qualifier (URS-7).
   */
  public int getRUWhichDateTimeStatusQualifierReps() {
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
   * Inserts a repetition of R/U Which Date/Time Status Qualifier (URS-7) at a given index and returns it.
   * @param index The index
   */
  public ID insertRUWhichDateTimeStatusQualifier(int index) throws HL7Exception {
     return (ID) super.insertRepetition(7, index);
  }

  /**
   * Removes a repetition of R/U Which Date/Time Status Qualifier (URS-7) at a given index and returns it.
   * @param index The index
   */
  public ID removeRUWhichDateTimeStatusQualifier(int index) throws HL7Exception {
     return (ID) super.removeRepetition(7, index);
  }

  /**
   * Returns a single repetition of R/U Which Date/Time Status Qualifier (URS-7).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public ID getUrs7_RUWhichDateTimeStatusQualifier(int rep) throws HL7Exception {
    ID ret = null;
    try {
        Type t = this.getField(7, rep);
        ret = (ID)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of R/U Which Date/Time Status Qualifier (URS-7).
   */
  public ID[] getUrs7_RUWhichDateTimeStatusQualifier() {
     ID[] ret = null;
    try {
        Type[] t = this.getField(7);  
        ret = new ID[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (ID)t[i];
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
   * Returns a count of the number of repetitions of R/U Which Date/Time Status Qualifier (URS-7).
   */
  public int getUrs7_RUWhichDateTimeStatusQualifierReps() {
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
   * Inserts a repetition of R/U Which Date/Time Status Qualifier (URS-7) at a given index and returns it.
   * @param index The index
   */
  public ID insertUrs7_RUWhichDateTimeStatusQualifier(int index) throws HL7Exception {
     return (ID) super.insertRepetition(7, index);
  }

  /**
   * Removes a repetition of R/U Which Date/Time Status Qualifier (URS-7) at a given index and returns it.
   * @param index The index
   */
  public ID removeUrs7_RUWhichDateTimeStatusQualifier(int index) throws HL7Exception {
     return (ID) super.removeRepetition(7, index);
  }

  /**
   * Returns a single repetition of R/U Date/Time Selection Qualifier (URS-8).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public ID getRUDateTimeSelectionQualifier(int rep) throws HL7Exception {
    ID ret = null;
    try {
        Type t = this.getField(8, rep);
        ret = (ID)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of R/U Date/Time Selection Qualifier (URS-8).
   */
  public ID[] getRUDateTimeSelectionQualifier() {
     ID[] ret = null;
    try {
        Type[] t = this.getField(8);  
        ret = new ID[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (ID)t[i];
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
   * Returns a count of the number of repetitions of R/U Date/Time Selection Qualifier (URS-8).
   */
  public int getRUDateTimeSelectionQualifierReps() {
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
   * Inserts a repetition of R/U Date/Time Selection Qualifier (URS-8) at a given index and returns it.
   * @param index The index
   */
  public ID insertRUDateTimeSelectionQualifier(int index) throws HL7Exception {
     return (ID) super.insertRepetition(8, index);
  }

  /**
   * Removes a repetition of R/U Date/Time Selection Qualifier (URS-8) at a given index and returns it.
   * @param index The index
   */
  public ID removeRUDateTimeSelectionQualifier(int index) throws HL7Exception {
     return (ID) super.removeRepetition(8, index);
  }

  /**
   * Returns a single repetition of R/U Date/Time Selection Qualifier (URS-8).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public ID getUrs8_RUDateTimeSelectionQualifier(int rep) throws HL7Exception {
    ID ret = null;
    try {
        Type t = this.getField(8, rep);
        ret = (ID)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of R/U Date/Time Selection Qualifier (URS-8).
   */
  public ID[] getUrs8_RUDateTimeSelectionQualifier() {
     ID[] ret = null;
    try {
        Type[] t = this.getField(8);  
        ret = new ID[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (ID)t[i];
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
   * Returns a count of the number of repetitions of R/U Date/Time Selection Qualifier (URS-8).
   */
  public int getUrs8_RUDateTimeSelectionQualifierReps() {
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
   * Inserts a repetition of R/U Date/Time Selection Qualifier (URS-8) at a given index and returns it.
   * @param index The index
   */
  public ID insertUrs8_RUDateTimeSelectionQualifier(int index) throws HL7Exception {
     return (ID) super.insertRepetition(8, index);
  }

  /**
   * Removes a repetition of R/U Date/Time Selection Qualifier (URS-8) at a given index and returns it.
   * @param index The index
   */
  public ID removeUrs8_RUDateTimeSelectionQualifier(int index) throws HL7Exception {
     return (ID) super.removeRepetition(8, index);
  }

  /**
   * Returns R/U Quantity/Timing Qualifier (URS-9).
   */
  public TQ getRUQuantityTimingQualifier()  {
    TQ ret = null;
    try {
        Type t = this.getField(9, 0);
        ret = (TQ)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns R/U Quantity/Timing Qualifier (URS-9).
   */
  public TQ getUrs9_RUQuantityTimingQualifier()  {
    TQ ret = null;
    try {
        Type t = this.getField(9, 0);
        ret = (TQ)t;
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
         case 0: return new ca.uhn.hl7v2.model.v26.datatype.ST(getMessage());
         case 1: return new ca.uhn.hl7v2.model.v26.datatype.DTM(getMessage());
         case 2: return new ca.uhn.hl7v2.model.v26.datatype.DTM(getMessage());
         case 3: return new ca.uhn.hl7v2.model.v26.datatype.ST(getMessage());
         case 4: return new ca.uhn.hl7v2.model.v26.datatype.ST(getMessage());
         case 5: return new ca.uhn.hl7v2.model.v26.datatype.ID(getMessage(), new Integer(156));
         case 6: return new ca.uhn.hl7v2.model.v26.datatype.ID(getMessage(), new Integer(157));
         case 7: return new ca.uhn.hl7v2.model.v26.datatype.ID(getMessage(), new Integer(158));
         case 8: return new ca.uhn.hl7v2.model.v26.datatype.TQ(getMessage());
         default: return null;
      }
   }

}