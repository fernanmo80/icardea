package ca.uhn.hl7v2.model.v26.segment;

import ca.uhn.hl7v2.model.*;
import ca.uhn.hl7v2.model.v26.datatype.*;
import ca.uhn.log.HapiLogFactory;
import ca.uhn.hl7v2.parser.ModelClassFactory;
import ca.uhn.hl7v2.HL7Exception;

/**
 * <p>Represents an HL7 MFE message segment. 
 * This segment has the following fields:</p><p>
 * MFE-1: Record-Level Event Code (ID)<br> 
 * MFE-2: MFN Control ID (ST)<br> 
 * MFE-3: Effective Date/Time (DTM)<br> 
 * MFE-4: Primary Key Value - MFE (varies)<br> 
 * MFE-5: Primary Key Value Type (ID)<br> 
 * MFE-6: Entered Date/Time (DTM)<br> 
 * MFE-7: Entered By (XCN)<br> 
 * </p><p>The get...() methods return data from individual fields.  These methods 
 * do not throw exceptions and may therefore have to handle exceptions internally.  
 * If an exception is handled internally, it is logged and null is returned.  
 * This is not expected to happen - if it does happen this indicates not so much 
 * an exceptional circumstance as a bug in the code for this class.</p>    
 */
public class MFE extends AbstractSegment  {

  /**
   * Creates a MFE (Master File Entry) segment object that belongs to the given 
   * message.  
   */
  public MFE(Group parent, ModelClassFactory factory) {
    super(parent, factory);
    Message message = getMessage();
    try {
       this.add(ID.class, true, 1, 3, new Object[]{message, new Integer(180)}, "Record-Level Event Code");
       this.add(ST.class, false, 1, 20, new Object[]{message}, "MFN Control ID");
       this.add(DTM.class, false, 1, 24, new Object[]{message}, "Effective Date/Time");
       this.add(Varies.class, true, 0, 200, new Object[]{message}, "Primary Key Value - MFE");
       this.add(ID.class, true, 0, 3, new Object[]{message, new Integer(355)}, "Primary Key Value Type");
       this.add(DTM.class, false, 1, 24, new Object[]{message}, "Entered Date/Time");
       this.add(XCN.class, false, 1, 3220, new Object[]{message}, "Entered By");
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Can't instantiate " + this.getClass().getName(), he);
    }
  }

  /**
   * Returns Record-Level Event Code (MFE-1).
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
   * Returns Record-Level Event Code (MFE-1).
   */
  public ID getMfe1_RecordLevelEventCode()  {
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
   * Returns MFN Control ID (MFE-2).
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
   * Returns MFN Control ID (MFE-2).
   */
  public ST getMfe2_MFNControlID()  {
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
   * Returns Effective Date/Time (MFE-3).
   */
  public DTM getEffectiveDateTime()  {
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
   * Returns Effective Date/Time (MFE-3).
   */
  public DTM getMfe3_EffectiveDateTime()  {
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
   * Returns a single repetition of Primary Key Value - MFE (MFE-4).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public Varies getPrimaryKeyValueMFE(int rep) throws HL7Exception {
    Varies ret = null;
    try {
        Type t = this.getField(4, rep);
        ret = (Varies)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Primary Key Value - MFE (MFE-4).
   */
  public Varies[] getPrimaryKeyValueMFE() {
     Varies[] ret = null;
    try {
        Type[] t = this.getField(4);  
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
   * Returns a count of the number of repetitions of Primary Key Value - MFE (MFE-4).
   */
  public int getPrimaryKeyValueMFEReps() {
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
   * Inserts a repetition of Primary Key Value - MFE (MFE-4) at a given index and returns it.
   * @param index The index
   */
  public Varies insertPrimaryKeyValueMFE(int index) throws HL7Exception {
     return (Varies) super.insertRepetition(4, index);
  }

  /**
   * Removes a repetition of Primary Key Value - MFE (MFE-4) at a given index and returns it.
   * @param index The index
   */
  public Varies removePrimaryKeyValueMFE(int index) throws HL7Exception {
     return (Varies) super.removeRepetition(4, index);
  }

  /**
   * Returns a single repetition of Primary Key Value - MFE (MFE-4).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public Varies getMfe4_PrimaryKeyValueMFE(int rep) throws HL7Exception {
    Varies ret = null;
    try {
        Type t = this.getField(4, rep);
        ret = (Varies)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Primary Key Value - MFE (MFE-4).
   */
  public Varies[] getMfe4_PrimaryKeyValueMFE() {
     Varies[] ret = null;
    try {
        Type[] t = this.getField(4);  
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
   * Returns a count of the number of repetitions of Primary Key Value - MFE (MFE-4).
   */
  public int getMfe4_PrimaryKeyValueMFEReps() {
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
   * Inserts a repetition of Primary Key Value - MFE (MFE-4) at a given index and returns it.
   * @param index The index
   */
  public Varies insertMfe4_PrimaryKeyValueMFE(int index) throws HL7Exception {
     return (Varies) super.insertRepetition(4, index);
  }

  /**
   * Removes a repetition of Primary Key Value - MFE (MFE-4) at a given index and returns it.
   * @param index The index
   */
  public Varies removeMfe4_PrimaryKeyValueMFE(int index) throws HL7Exception {
     return (Varies) super.removeRepetition(4, index);
  }

  /**
   * Returns a single repetition of Primary Key Value Type (MFE-5).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public ID getPrimaryKeyValueType(int rep) throws HL7Exception {
    ID ret = null;
    try {
        Type t = this.getField(5, rep);
        ret = (ID)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Primary Key Value Type (MFE-5).
   */
  public ID[] getPrimaryKeyValueType() {
     ID[] ret = null;
    try {
        Type[] t = this.getField(5);  
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
   * Returns a count of the number of repetitions of Primary Key Value Type (MFE-5).
   */
  public int getPrimaryKeyValueTypeReps() {
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
   * Inserts a repetition of Primary Key Value Type (MFE-5) at a given index and returns it.
   * @param index The index
   */
  public ID insertPrimaryKeyValueType(int index) throws HL7Exception {
     return (ID) super.insertRepetition(5, index);
  }

  /**
   * Removes a repetition of Primary Key Value Type (MFE-5) at a given index and returns it.
   * @param index The index
   */
  public ID removePrimaryKeyValueType(int index) throws HL7Exception {
     return (ID) super.removeRepetition(5, index);
  }

  /**
   * Returns a single repetition of Primary Key Value Type (MFE-5).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public ID getMfe5_PrimaryKeyValueType(int rep) throws HL7Exception {
    ID ret = null;
    try {
        Type t = this.getField(5, rep);
        ret = (ID)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Primary Key Value Type (MFE-5).
   */
  public ID[] getMfe5_PrimaryKeyValueType() {
     ID[] ret = null;
    try {
        Type[] t = this.getField(5);  
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
   * Returns a count of the number of repetitions of Primary Key Value Type (MFE-5).
   */
  public int getMfe5_PrimaryKeyValueTypeReps() {
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
   * Inserts a repetition of Primary Key Value Type (MFE-5) at a given index and returns it.
   * @param index The index
   */
  public ID insertMfe5_PrimaryKeyValueType(int index) throws HL7Exception {
     return (ID) super.insertRepetition(5, index);
  }

  /**
   * Removes a repetition of Primary Key Value Type (MFE-5) at a given index and returns it.
   * @param index The index
   */
  public ID removeMfe5_PrimaryKeyValueType(int index) throws HL7Exception {
     return (ID) super.removeRepetition(5, index);
  }

  /**
   * Returns Entered Date/Time (MFE-6).
   */
  public DTM getEnteredDateTime()  {
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
   * Returns Entered Date/Time (MFE-6).
   */
  public DTM getMfe6_EnteredDateTime()  {
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
   * Returns Entered By (MFE-7).
   */
  public XCN getEnteredBy()  {
    XCN ret = null;
    try {
        Type t = this.getField(7, 0);
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
   * Returns Entered By (MFE-7).
   */
  public XCN getMfe7_EnteredBy()  {
    XCN ret = null;
    try {
        Type t = this.getField(7, 0);
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

   protected Type createNewTypeWithoutReflection(int field) {
      switch (field) {
         case 0: return new ca.uhn.hl7v2.model.v26.datatype.ID(getMessage(), new Integer(180));
         case 1: return new ca.uhn.hl7v2.model.v26.datatype.ST(getMessage());
         case 2: return new ca.uhn.hl7v2.model.v26.datatype.DTM(getMessage());
         case 3: return new Varies(getMessage());
         case 4: return new ca.uhn.hl7v2.model.v26.datatype.ID(getMessage(), new Integer(355));
         case 5: return new ca.uhn.hl7v2.model.v26.datatype.DTM(getMessage());
         case 6: return new ca.uhn.hl7v2.model.v26.datatype.XCN(getMessage());
         default: return null;
      }
   }

}