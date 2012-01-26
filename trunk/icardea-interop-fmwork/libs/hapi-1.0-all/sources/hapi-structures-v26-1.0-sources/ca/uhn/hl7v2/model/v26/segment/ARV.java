package ca.uhn.hl7v2.model.v26.segment;

import ca.uhn.hl7v2.model.*;
import ca.uhn.hl7v2.model.v26.datatype.*;
import ca.uhn.log.HapiLogFactory;
import ca.uhn.hl7v2.parser.ModelClassFactory;
import ca.uhn.hl7v2.HL7Exception;

/**
 * <p>Represents an HL7 ARV message segment. 
 * This segment has the following fields:</p><p>
 * ARV-1: Set ID (SI)<br> 
 * ARV-2: Access Restriction Action Code (CNE)<br> 
 * ARV-3: Access Restriction Value (CWE)<br> 
 * ARV-4: Access Restriction Reason (CWE)<br> 
 * ARV-5: Special Access Restriction Instructions (ST)<br> 
 * ARV-6: Access Restriction Date Range (DR)<br> 
 * </p><p>The get...() methods return data from individual fields.  These methods 
 * do not throw exceptions and may therefore have to handle exceptions internally.  
 * If an exception is handled internally, it is logged and null is returned.  
 * This is not expected to happen - if it does happen this indicates not so much 
 * an exceptional circumstance as a bug in the code for this class.</p>    
 */
public class ARV extends AbstractSegment  {

  /**
   * Creates a ARV (Access Restriction) segment object that belongs to the given 
   * message.  
   */
  public ARV(Group parent, ModelClassFactory factory) {
    super(parent, factory);
    Message message = getMessage();
    try {
       this.add(SI.class, false, 1, 4, new Object[]{message}, "Set ID");
       this.add(CNE.class, true, 1, 705, new Object[]{message}, "Access Restriction Action Code");
       this.add(CWE.class, true, 1, 705, new Object[]{message}, "Access Restriction Value");
       this.add(CWE.class, false, 0, 705, new Object[]{message}, "Access Restriction Reason");
       this.add(ST.class, false, 0, 250, new Object[]{message}, "Special Access Restriction Instructions");
       this.add(DR.class, false, 1, 49, new Object[]{message}, "Access Restriction Date Range");
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Can't instantiate " + this.getClass().getName(), he);
    }
  }

  /**
   * Returns Set ID (ARV-1).
   */
  public SI getSetID()  {
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
   * Returns Set ID (ARV-1).
   */
  public SI getArv1_SetID()  {
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
   * Returns Access Restriction Action Code (ARV-2).
   */
  public CNE getAccessRestrictionActionCode()  {
    CNE ret = null;
    try {
        Type t = this.getField(2, 0);
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
   * Returns Access Restriction Action Code (ARV-2).
   */
  public CNE getArv2_AccessRestrictionActionCode()  {
    CNE ret = null;
    try {
        Type t = this.getField(2, 0);
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
   * Returns Access Restriction Value (ARV-3).
   */
  public CWE getAccessRestrictionValue()  {
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
   * Returns Access Restriction Value (ARV-3).
   */
  public CWE getArv3_AccessRestrictionValue()  {
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
   * Returns a single repetition of Access Restriction Reason (ARV-4).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getAccessRestrictionReason(int rep) throws HL7Exception {
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
   * Returns all repetitions of Access Restriction Reason (ARV-4).
   */
  public CWE[] getAccessRestrictionReason() {
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
   * Returns a count of the number of repetitions of Access Restriction Reason (ARV-4).
   */
  public int getAccessRestrictionReasonReps() {
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
   * Inserts a repetition of Access Restriction Reason (ARV-4) at a given index and returns it.
   * @param index The index
   */
  public CWE insertAccessRestrictionReason(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(4, index);
  }

  /**
   * Removes a repetition of Access Restriction Reason (ARV-4) at a given index and returns it.
   * @param index The index
   */
  public CWE removeAccessRestrictionReason(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(4, index);
  }

  /**
   * Returns a single repetition of Access Restriction Reason (ARV-4).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getArv4_AccessRestrictionReason(int rep) throws HL7Exception {
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
   * Returns all repetitions of Access Restriction Reason (ARV-4).
   */
  public CWE[] getArv4_AccessRestrictionReason() {
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
   * Returns a count of the number of repetitions of Access Restriction Reason (ARV-4).
   */
  public int getArv4_AccessRestrictionReasonReps() {
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
   * Inserts a repetition of Access Restriction Reason (ARV-4) at a given index and returns it.
   * @param index The index
   */
  public CWE insertArv4_AccessRestrictionReason(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(4, index);
  }

  /**
   * Removes a repetition of Access Restriction Reason (ARV-4) at a given index and returns it.
   * @param index The index
   */
  public CWE removeArv4_AccessRestrictionReason(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(4, index);
  }

  /**
   * Returns a single repetition of Special Access Restriction Instructions (ARV-5).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public ST getSpecialAccessRestrictionInstructions(int rep) throws HL7Exception {
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
   * Returns all repetitions of Special Access Restriction Instructions (ARV-5).
   */
  public ST[] getSpecialAccessRestrictionInstructions() {
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
   * Returns a count of the number of repetitions of Special Access Restriction Instructions (ARV-5).
   */
  public int getSpecialAccessRestrictionInstructionsReps() {
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
   * Inserts a repetition of Special Access Restriction Instructions (ARV-5) at a given index and returns it.
   * @param index The index
   */
  public ST insertSpecialAccessRestrictionInstructions(int index) throws HL7Exception {
     return (ST) super.insertRepetition(5, index);
  }

  /**
   * Removes a repetition of Special Access Restriction Instructions (ARV-5) at a given index and returns it.
   * @param index The index
   */
  public ST removeSpecialAccessRestrictionInstructions(int index) throws HL7Exception {
     return (ST) super.removeRepetition(5, index);
  }

  /**
   * Returns a single repetition of Special Access Restriction Instructions (ARV-5).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public ST getArv5_SpecialAccessRestrictionInstructions(int rep) throws HL7Exception {
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
   * Returns all repetitions of Special Access Restriction Instructions (ARV-5).
   */
  public ST[] getArv5_SpecialAccessRestrictionInstructions() {
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
   * Returns a count of the number of repetitions of Special Access Restriction Instructions (ARV-5).
   */
  public int getArv5_SpecialAccessRestrictionInstructionsReps() {
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
   * Inserts a repetition of Special Access Restriction Instructions (ARV-5) at a given index and returns it.
   * @param index The index
   */
  public ST insertArv5_SpecialAccessRestrictionInstructions(int index) throws HL7Exception {
     return (ST) super.insertRepetition(5, index);
  }

  /**
   * Removes a repetition of Special Access Restriction Instructions (ARV-5) at a given index and returns it.
   * @param index The index
   */
  public ST removeArv5_SpecialAccessRestrictionInstructions(int index) throws HL7Exception {
     return (ST) super.removeRepetition(5, index);
  }

  /**
   * Returns Access Restriction Date Range (ARV-6).
   */
  public DR getAccessRestrictionDateRange()  {
    DR ret = null;
    try {
        Type t = this.getField(6, 0);
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
   * Returns Access Restriction Date Range (ARV-6).
   */
  public DR getArv6_AccessRestrictionDateRange()  {
    DR ret = null;
    try {
        Type t = this.getField(6, 0);
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

   protected Type createNewTypeWithoutReflection(int field) {
      switch (field) {
         case 0: return new ca.uhn.hl7v2.model.v26.datatype.SI(getMessage());
         case 1: return new ca.uhn.hl7v2.model.v26.datatype.CNE(getMessage());
         case 2: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 3: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 4: return new ca.uhn.hl7v2.model.v26.datatype.ST(getMessage());
         case 5: return new ca.uhn.hl7v2.model.v26.datatype.DR(getMessage());
         default: return null;
      }
   }

}