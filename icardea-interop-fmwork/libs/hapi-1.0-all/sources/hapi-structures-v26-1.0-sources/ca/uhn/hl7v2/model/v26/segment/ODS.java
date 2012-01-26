package ca.uhn.hl7v2.model.v26.segment;

import ca.uhn.hl7v2.model.*;
import ca.uhn.hl7v2.model.v26.datatype.*;
import ca.uhn.log.HapiLogFactory;
import ca.uhn.hl7v2.parser.ModelClassFactory;
import ca.uhn.hl7v2.HL7Exception;

/**
 * <p>Represents an HL7 ODS message segment. 
 * This segment has the following fields:</p><p>
 * ODS-1: Type (ID)<br> 
 * ODS-2: Service Period (CWE)<br> 
 * ODS-3: Diet, Supplement, or Preference Code (CWE)<br> 
 * ODS-4: Text Instruction (ST)<br> 
 * </p><p>The get...() methods return data from individual fields.  These methods 
 * do not throw exceptions and may therefore have to handle exceptions internally.  
 * If an exception is handled internally, it is logged and null is returned.  
 * This is not expected to happen - if it does happen this indicates not so much 
 * an exceptional circumstance as a bug in the code for this class.</p>    
 */
public class ODS extends AbstractSegment  {

  /**
   * Creates a ODS (Dietary Orders, Supplements, and Preferences) segment object that belongs to the given 
   * message.  
   */
  public ODS(Group parent, ModelClassFactory factory) {
    super(parent, factory);
    Message message = getMessage();
    try {
       this.add(ID.class, true, 1, 1, new Object[]{message, new Integer(159)}, "Type");
       this.add(CWE.class, false, 10, 250, new Object[]{message}, "Service Period");
       this.add(CWE.class, true, 20, 250, new Object[]{message}, "Diet, Supplement, or Preference Code");
       this.add(ST.class, false, 2, 80, new Object[]{message}, "Text Instruction");
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Can't instantiate " + this.getClass().getName(), he);
    }
  }

  /**
   * Returns Type (ODS-1).
   */
  public ID getType()  {
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
   * Returns Type (ODS-1).
   */
  public ID getOds1_Type()  {
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
   * Returns a single repetition of Service Period (ODS-2).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getServicePeriod(int rep) throws HL7Exception {
    CWE ret = null;
    try {
        Type t = this.getField(2, rep);
        ret = (CWE)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Service Period (ODS-2).
   */
  public CWE[] getServicePeriod() {
     CWE[] ret = null;
    try {
        Type[] t = this.getField(2);  
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
   * Returns a count of the number of repetitions of Service Period (ODS-2).
   */
  public int getServicePeriodReps() {
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
   * Inserts a repetition of Service Period (ODS-2) at a given index and returns it.
   * @param index The index
   */
  public CWE insertServicePeriod(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(2, index);
  }

  /**
   * Removes a repetition of Service Period (ODS-2) at a given index and returns it.
   * @param index The index
   */
  public CWE removeServicePeriod(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(2, index);
  }

  /**
   * Returns a single repetition of Service Period (ODS-2).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getOds2_ServicePeriod(int rep) throws HL7Exception {
    CWE ret = null;
    try {
        Type t = this.getField(2, rep);
        ret = (CWE)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Service Period (ODS-2).
   */
  public CWE[] getOds2_ServicePeriod() {
     CWE[] ret = null;
    try {
        Type[] t = this.getField(2);  
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
   * Returns a count of the number of repetitions of Service Period (ODS-2).
   */
  public int getOds2_ServicePeriodReps() {
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
   * Inserts a repetition of Service Period (ODS-2) at a given index and returns it.
   * @param index The index
   */
  public CWE insertOds2_ServicePeriod(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(2, index);
  }

  /**
   * Removes a repetition of Service Period (ODS-2) at a given index and returns it.
   * @param index The index
   */
  public CWE removeOds2_ServicePeriod(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(2, index);
  }

  /**
   * Returns a single repetition of Diet, Supplement, or Preference Code (ODS-3).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getDietSupplementOrPreferenceCode(int rep) throws HL7Exception {
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
   * Returns all repetitions of Diet, Supplement, or Preference Code (ODS-3).
   */
  public CWE[] getDietSupplementOrPreferenceCode() {
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
   * Returns a count of the number of repetitions of Diet, Supplement, or Preference Code (ODS-3).
   */
  public int getDietSupplementOrPreferenceCodeReps() {
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
   * Inserts a repetition of Diet, Supplement, or Preference Code (ODS-3) at a given index and returns it.
   * @param index The index
   */
  public CWE insertDietSupplementOrPreferenceCode(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(3, index);
  }

  /**
   * Removes a repetition of Diet, Supplement, or Preference Code (ODS-3) at a given index and returns it.
   * @param index The index
   */
  public CWE removeDietSupplementOrPreferenceCode(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(3, index);
  }

  /**
   * Returns a single repetition of Diet, Supplement, or Preference Code (ODS-3).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getOds3_DietSupplementOrPreferenceCode(int rep) throws HL7Exception {
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
   * Returns all repetitions of Diet, Supplement, or Preference Code (ODS-3).
   */
  public CWE[] getOds3_DietSupplementOrPreferenceCode() {
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
   * Returns a count of the number of repetitions of Diet, Supplement, or Preference Code (ODS-3).
   */
  public int getOds3_DietSupplementOrPreferenceCodeReps() {
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
   * Inserts a repetition of Diet, Supplement, or Preference Code (ODS-3) at a given index and returns it.
   * @param index The index
   */
  public CWE insertOds3_DietSupplementOrPreferenceCode(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(3, index);
  }

  /**
   * Removes a repetition of Diet, Supplement, or Preference Code (ODS-3) at a given index and returns it.
   * @param index The index
   */
  public CWE removeOds3_DietSupplementOrPreferenceCode(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(3, index);
  }

  /**
   * Returns a single repetition of Text Instruction (ODS-4).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public ST getTextInstruction(int rep) throws HL7Exception {
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
   * Returns all repetitions of Text Instruction (ODS-4).
   */
  public ST[] getTextInstruction() {
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
   * Returns a count of the number of repetitions of Text Instruction (ODS-4).
   */
  public int getTextInstructionReps() {
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
   * Inserts a repetition of Text Instruction (ODS-4) at a given index and returns it.
   * @param index The index
   */
  public ST insertTextInstruction(int index) throws HL7Exception {
     return (ST) super.insertRepetition(4, index);
  }

  /**
   * Removes a repetition of Text Instruction (ODS-4) at a given index and returns it.
   * @param index The index
   */
  public ST removeTextInstruction(int index) throws HL7Exception {
     return (ST) super.removeRepetition(4, index);
  }

  /**
   * Returns a single repetition of Text Instruction (ODS-4).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public ST getOds4_TextInstruction(int rep) throws HL7Exception {
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
   * Returns all repetitions of Text Instruction (ODS-4).
   */
  public ST[] getOds4_TextInstruction() {
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
   * Returns a count of the number of repetitions of Text Instruction (ODS-4).
   */
  public int getOds4_TextInstructionReps() {
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
   * Inserts a repetition of Text Instruction (ODS-4) at a given index and returns it.
   * @param index The index
   */
  public ST insertOds4_TextInstruction(int index) throws HL7Exception {
     return (ST) super.insertRepetition(4, index);
  }

  /**
   * Removes a repetition of Text Instruction (ODS-4) at a given index and returns it.
   * @param index The index
   */
  public ST removeOds4_TextInstruction(int index) throws HL7Exception {
     return (ST) super.removeRepetition(4, index);
  }

   protected Type createNewTypeWithoutReflection(int field) {
      switch (field) {
         case 0: return new ca.uhn.hl7v2.model.v26.datatype.ID(getMessage(), new Integer(159));
         case 1: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 2: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 3: return new ca.uhn.hl7v2.model.v26.datatype.ST(getMessage());
         default: return null;
      }
   }

}