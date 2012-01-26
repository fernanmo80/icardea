package ca.uhn.hl7v2.model.v26.segment;

import ca.uhn.hl7v2.model.*;
import ca.uhn.hl7v2.model.v26.datatype.*;
import ca.uhn.log.HapiLogFactory;
import ca.uhn.hl7v2.parser.ModelClassFactory;
import ca.uhn.hl7v2.HL7Exception;

/**
 * <p>Represents an HL7 MFA message segment. 
 * This segment has the following fields:</p><p>
 * MFA-1: Record-Level Event Code (ID)<br> 
 * MFA-2: MFN Control ID (ST)<br> 
 * MFA-3: Event Completion Date/Time (DTM)<br> 
 * MFA-4: MFN Record Level Error Return (CWE)<br> 
 * MFA-5: Primary Key Value - MFA (varies)<br> 
 * MFA-6: Primary Key Value Type - MFA (ID)<br> 
 * </p><p>The get...() methods return data from individual fields.  These methods 
 * do not throw exceptions and may therefore have to handle exceptions internally.  
 * If an exception is handled internally, it is logged and null is returned.  
 * This is not expected to happen - if it does happen this indicates not so much 
 * an exceptional circumstance as a bug in the code for this class.</p>    
 */
public class MFA extends AbstractSegment  {

  /**
   * Creates a MFA (Master File Acknowledgment) segment object that belongs to the given 
   * message.  
   */
  public MFA(Group parent, ModelClassFactory factory) {
    super(parent, factory);
    Message message = getMessage();
    try {
       this.add(ID.class, true, 1, 3, new Object[]{message, new Integer(180)}, "Record-Level Event Code");
       this.add(ST.class, false, 1, 20, new Object[]{message}, "MFN Control ID");
       this.add(DTM.class, false, 1, 24, new Object[]{message}, "Event Completion Date/Time");
       this.add(CWE.class, true, 1, 250, new Object[]{message}, "MFN Record Level Error Return");
       this.add(Varies.class, true, 0, 250, new Object[]{message}, "Primary Key Value - MFA");
       this.add(ID.class, true, 0, 3, new Object[]{message, new Integer(355)}, "Primary Key Value Type - MFA");
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Can't instantiate " + this.getClass().getName(), he);
    }
  }

  /**
   * Returns Record-Level Event Code (MFA-1).
   */
  public ID getRecordLevelEventCode()  {
    ID ret = null;
    try {
        Type t = this.getField(1, 0);
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
   * Returns Record-Level Event Code (MFA-1).
   */
  public ID getMfa1_RecordLevelEventCode()  {
    ID ret = null;
    try {
        Type t = this.getField(1, 0);
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
   * Returns MFN Control ID (MFA-2).
   */
  public ST getMFNControlID()  {
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
   * Returns MFN Control ID (MFA-2).
   */
  public ST getMfa2_MFNControlID()  {
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
   * Returns Event Completion Date/Time (MFA-3).
   */
  public DTM getEventCompletionDateTime()  {
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
   * Returns Event Completion Date/Time (MFA-3).
   */
  public DTM getMfa3_EventCompletionDateTime()  {
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
   * Returns MFN Record Level Error Return (MFA-4).
   */
  public CWE getMFNRecordLevelErrorReturn()  {
    CWE ret = null;
    try {
        Type t = this.getField(4, 0);
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
   * Returns MFN Record Level Error Return (MFA-4).
   */
  public CWE getMfa4_MFNRecordLevelErrorReturn()  {
    CWE ret = null;
    try {
        Type t = this.getField(4, 0);
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
   * Returns a single repetition of Primary Key Value - MFA (MFA-5).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public Varies getPrimaryKeyValueMFA(int rep) throws HL7Exception {
    Varies ret = null;
    try {
        Type t = this.getField(5, rep);
        ret = (Varies)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Primary Key Value - MFA (MFA-5).
   */
  public Varies[] getPrimaryKeyValueMFA() {
     Varies[] ret = null;
    try {
        Type[] t = this.getField(5);  
        ret = new Varies[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (Varies)t[i];
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
   * Returns a count of the number of repetitions of Primary Key Value - MFA (MFA-5).
   */
  public int getPrimaryKeyValueMFAReps() {
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
   * Inserts a repetition of Primary Key Value - MFA (MFA-5) at a given index and returns it.
   * @param index The index
   */
  public Varies insertPrimaryKeyValueMFA(int index) throws HL7Exception {
     return (Varies) super.insertRepetition(5, index);
  }

  /**
   * Removes a repetition of Primary Key Value - MFA (MFA-5) at a given index and returns it.
   * @param index The index
   */
  public Varies removePrimaryKeyValueMFA(int index) throws HL7Exception {
     return (Varies) super.removeRepetition(5, index);
  }

  /**
   * Returns a single repetition of Primary Key Value - MFA (MFA-5).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public Varies getMfa5_PrimaryKeyValueMFA(int rep) throws HL7Exception {
    Varies ret = null;
    try {
        Type t = this.getField(5, rep);
        ret = (Varies)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Primary Key Value - MFA (MFA-5).
   */
  public Varies[] getMfa5_PrimaryKeyValueMFA() {
     Varies[] ret = null;
    try {
        Type[] t = this.getField(5);  
        ret = new Varies[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (Varies)t[i];
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
   * Returns a count of the number of repetitions of Primary Key Value - MFA (MFA-5).
   */
  public int getMfa5_PrimaryKeyValueMFAReps() {
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
   * Inserts a repetition of Primary Key Value - MFA (MFA-5) at a given index and returns it.
   * @param index The index
   */
  public Varies insertMfa5_PrimaryKeyValueMFA(int index) throws HL7Exception {
     return (Varies) super.insertRepetition(5, index);
  }

  /**
   * Removes a repetition of Primary Key Value - MFA (MFA-5) at a given index and returns it.
   * @param index The index
   */
  public Varies removeMfa5_PrimaryKeyValueMFA(int index) throws HL7Exception {
     return (Varies) super.removeRepetition(5, index);
  }

  /**
   * Returns a single repetition of Primary Key Value Type - MFA (MFA-6).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public ID getPrimaryKeyValueTypeMFA(int rep) throws HL7Exception {
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
   * Returns all repetitions of Primary Key Value Type - MFA (MFA-6).
   */
  public ID[] getPrimaryKeyValueTypeMFA() {
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
   * Returns a count of the number of repetitions of Primary Key Value Type - MFA (MFA-6).
   */
  public int getPrimaryKeyValueTypeMFAReps() {
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
   * Inserts a repetition of Primary Key Value Type - MFA (MFA-6) at a given index and returns it.
   * @param index The index
   */
  public ID insertPrimaryKeyValueTypeMFA(int index) throws HL7Exception {
     return (ID) super.insertRepetition(6, index);
  }

  /**
   * Removes a repetition of Primary Key Value Type - MFA (MFA-6) at a given index and returns it.
   * @param index The index
   */
  public ID removePrimaryKeyValueTypeMFA(int index) throws HL7Exception {
     return (ID) super.removeRepetition(6, index);
  }

  /**
   * Returns a single repetition of Primary Key Value Type - MFA (MFA-6).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public ID getMfa6_PrimaryKeyValueTypeMFA(int rep) throws HL7Exception {
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
   * Returns all repetitions of Primary Key Value Type - MFA (MFA-6).
   */
  public ID[] getMfa6_PrimaryKeyValueTypeMFA() {
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
   * Returns a count of the number of repetitions of Primary Key Value Type - MFA (MFA-6).
   */
  public int getMfa6_PrimaryKeyValueTypeMFAReps() {
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
   * Inserts a repetition of Primary Key Value Type - MFA (MFA-6) at a given index and returns it.
   * @param index The index
   */
  public ID insertMfa6_PrimaryKeyValueTypeMFA(int index) throws HL7Exception {
     return (ID) super.insertRepetition(6, index);
  }

  /**
   * Removes a repetition of Primary Key Value Type - MFA (MFA-6) at a given index and returns it.
   * @param index The index
   */
  public ID removeMfa6_PrimaryKeyValueTypeMFA(int index) throws HL7Exception {
     return (ID) super.removeRepetition(6, index);
  }

   protected Type createNewTypeWithoutReflection(int field) {
      switch (field) {
         case 0: return new ca.uhn.hl7v2.model.v26.datatype.ID(getMessage(), new Integer(180));
         case 1: return new ca.uhn.hl7v2.model.v26.datatype.ST(getMessage());
         case 2: return new ca.uhn.hl7v2.model.v26.datatype.DTM(getMessage());
         case 3: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 4: return new Varies(getMessage());
         case 5: return new ca.uhn.hl7v2.model.v26.datatype.ID(getMessage(), new Integer(355));
         default: return null;
      }
   }

}