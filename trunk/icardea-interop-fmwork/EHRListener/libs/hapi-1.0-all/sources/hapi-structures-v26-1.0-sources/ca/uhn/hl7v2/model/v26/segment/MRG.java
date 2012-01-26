package ca.uhn.hl7v2.model.v26.segment;

import ca.uhn.hl7v2.model.*;
import ca.uhn.hl7v2.model.v26.datatype.*;
import ca.uhn.log.HapiLogFactory;
import ca.uhn.hl7v2.parser.ModelClassFactory;
import ca.uhn.hl7v2.HL7Exception;

/**
 * <p>Represents an HL7 MRG message segment. 
 * This segment has the following fields:</p><p>
 * MRG-1: Prior Patient Identifier List (CX)<br> 
 * MRG-2: Prior Alternate Patient ID (CX)<br> 
 * MRG-3: Prior Patient Account Number (CX)<br> 
 * MRG-4: Prior Patient ID (CX)<br> 
 * MRG-5: Prior Visit Number (CX)<br> 
 * MRG-6: Prior Alternate Visit ID (CX)<br> 
 * MRG-7: Prior Patient Name (XPN)<br> 
 * </p><p>The get...() methods return data from individual fields.  These methods 
 * do not throw exceptions and may therefore have to handle exceptions internally.  
 * If an exception is handled internally, it is logged and null is returned.  
 * This is not expected to happen - if it does happen this indicates not so much 
 * an exceptional circumstance as a bug in the code for this class.</p>    
 */
public class MRG extends AbstractSegment  {

  /**
   * Creates a MRG (Merge Patient Information) segment object that belongs to the given 
   * message.  
   */
  public MRG(Group parent, ModelClassFactory factory) {
    super(parent, factory);
    Message message = getMessage();
    try {
       this.add(CX.class, true, 0, 250, new Object[]{message}, "Prior Patient Identifier List");
       this.add(CX.class, false, 0, 0, new Object[]{message}, "Prior Alternate Patient ID");
       this.add(CX.class, false, 1, 250, new Object[]{message}, "Prior Patient Account Number");
       this.add(CX.class, false, 1, 0, new Object[]{message}, "Prior Patient ID");
       this.add(CX.class, false, 1, 250, new Object[]{message}, "Prior Visit Number");
       this.add(CX.class, false, 1, 250, new Object[]{message}, "Prior Alternate Visit ID");
       this.add(XPN.class, false, 0, 250, new Object[]{message}, "Prior Patient Name");
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Can't instantiate " + this.getClass().getName(), he);
    }
  }

  /**
   * Returns a single repetition of Prior Patient Identifier List (MRG-1).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CX getPriorPatientIdentifierList(int rep) throws HL7Exception {
    CX ret = null;
    try {
        Type t = this.getField(1, rep);
        ret = (CX)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Prior Patient Identifier List (MRG-1).
   */
  public CX[] getPriorPatientIdentifierList() {
     CX[] ret = null;
    try {
        Type[] t = this.getField(1);  
        ret = new CX[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (CX)t[i];
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
   * Returns a count of the number of repetitions of Prior Patient Identifier List (MRG-1).
   */
  public int getPriorPatientIdentifierListReps() {
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
   * Inserts a repetition of Prior Patient Identifier List (MRG-1) at a given index and returns it.
   * @param index The index
   */
  public CX insertPriorPatientIdentifierList(int index) throws HL7Exception {
     return (CX) super.insertRepetition(1, index);
  }

  /**
   * Removes a repetition of Prior Patient Identifier List (MRG-1) at a given index and returns it.
   * @param index The index
   */
  public CX removePriorPatientIdentifierList(int index) throws HL7Exception {
     return (CX) super.removeRepetition(1, index);
  }

  /**
   * Returns a single repetition of Prior Patient Identifier List (MRG-1).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CX getMrg1_PriorPatientIdentifierList(int rep) throws HL7Exception {
    CX ret = null;
    try {
        Type t = this.getField(1, rep);
        ret = (CX)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Prior Patient Identifier List (MRG-1).
   */
  public CX[] getMrg1_PriorPatientIdentifierList() {
     CX[] ret = null;
    try {
        Type[] t = this.getField(1);  
        ret = new CX[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (CX)t[i];
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
   * Returns a count of the number of repetitions of Prior Patient Identifier List (MRG-1).
   */
  public int getMrg1_PriorPatientIdentifierListReps() {
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
   * Inserts a repetition of Prior Patient Identifier List (MRG-1) at a given index and returns it.
   * @param index The index
   */
  public CX insertMrg1_PriorPatientIdentifierList(int index) throws HL7Exception {
     return (CX) super.insertRepetition(1, index);
  }

  /**
   * Removes a repetition of Prior Patient Identifier List (MRG-1) at a given index and returns it.
   * @param index The index
   */
  public CX removeMrg1_PriorPatientIdentifierList(int index) throws HL7Exception {
     return (CX) super.removeRepetition(1, index);
  }

  /**
   * Returns a single repetition of Prior Alternate Patient ID (MRG-2).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CX getPriorAlternatePatientID(int rep) throws HL7Exception {
    CX ret = null;
    try {
        Type t = this.getField(2, rep);
        ret = (CX)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Prior Alternate Patient ID (MRG-2).
   */
  public CX[] getPriorAlternatePatientID() {
     CX[] ret = null;
    try {
        Type[] t = this.getField(2);  
        ret = new CX[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (CX)t[i];
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
   * Returns a count of the number of repetitions of Prior Alternate Patient ID (MRG-2).
   */
  public int getPriorAlternatePatientIDReps() {
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
   * Inserts a repetition of Prior Alternate Patient ID (MRG-2) at a given index and returns it.
   * @param index The index
   */
  public CX insertPriorAlternatePatientID(int index) throws HL7Exception {
     return (CX) super.insertRepetition(2, index);
  }

  /**
   * Removes a repetition of Prior Alternate Patient ID (MRG-2) at a given index and returns it.
   * @param index The index
   */
  public CX removePriorAlternatePatientID(int index) throws HL7Exception {
     return (CX) super.removeRepetition(2, index);
  }

  /**
   * Returns a single repetition of Prior Alternate Patient ID (MRG-2).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CX getMrg2_PriorAlternatePatientID(int rep) throws HL7Exception {
    CX ret = null;
    try {
        Type t = this.getField(2, rep);
        ret = (CX)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Prior Alternate Patient ID (MRG-2).
   */
  public CX[] getMrg2_PriorAlternatePatientID() {
     CX[] ret = null;
    try {
        Type[] t = this.getField(2);  
        ret = new CX[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (CX)t[i];
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
   * Returns a count of the number of repetitions of Prior Alternate Patient ID (MRG-2).
   */
  public int getMrg2_PriorAlternatePatientIDReps() {
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
   * Inserts a repetition of Prior Alternate Patient ID (MRG-2) at a given index and returns it.
   * @param index The index
   */
  public CX insertMrg2_PriorAlternatePatientID(int index) throws HL7Exception {
     return (CX) super.insertRepetition(2, index);
  }

  /**
   * Removes a repetition of Prior Alternate Patient ID (MRG-2) at a given index and returns it.
   * @param index The index
   */
  public CX removeMrg2_PriorAlternatePatientID(int index) throws HL7Exception {
     return (CX) super.removeRepetition(2, index);
  }

  /**
   * Returns Prior Patient Account Number (MRG-3).
   */
  public CX getPriorPatientAccountNumber()  {
    CX ret = null;
    try {
        Type t = this.getField(3, 0);
        ret = (CX)t;
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
   * Returns Prior Patient Account Number (MRG-3).
   */
  public CX getMrg3_PriorPatientAccountNumber()  {
    CX ret = null;
    try {
        Type t = this.getField(3, 0);
        ret = (CX)t;
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
   * Returns Prior Patient ID (MRG-4).
   */
  public CX getPriorPatientID()  {
    CX ret = null;
    try {
        Type t = this.getField(4, 0);
        ret = (CX)t;
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
   * Returns Prior Patient ID (MRG-4).
   */
  public CX getMrg4_PriorPatientID()  {
    CX ret = null;
    try {
        Type t = this.getField(4, 0);
        ret = (CX)t;
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
   * Returns Prior Visit Number (MRG-5).
   */
  public CX getPriorVisitNumber()  {
    CX ret = null;
    try {
        Type t = this.getField(5, 0);
        ret = (CX)t;
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
   * Returns Prior Visit Number (MRG-5).
   */
  public CX getMrg5_PriorVisitNumber()  {
    CX ret = null;
    try {
        Type t = this.getField(5, 0);
        ret = (CX)t;
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
   * Returns Prior Alternate Visit ID (MRG-6).
   */
  public CX getPriorAlternateVisitID()  {
    CX ret = null;
    try {
        Type t = this.getField(6, 0);
        ret = (CX)t;
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
   * Returns Prior Alternate Visit ID (MRG-6).
   */
  public CX getMrg6_PriorAlternateVisitID()  {
    CX ret = null;
    try {
        Type t = this.getField(6, 0);
        ret = (CX)t;
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
   * Returns a single repetition of Prior Patient Name (MRG-7).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XPN getPriorPatientName(int rep) throws HL7Exception {
    XPN ret = null;
    try {
        Type t = this.getField(7, rep);
        ret = (XPN)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Prior Patient Name (MRG-7).
   */
  public XPN[] getPriorPatientName() {
     XPN[] ret = null;
    try {
        Type[] t = this.getField(7);  
        ret = new XPN[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (XPN)t[i];
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
   * Returns a count of the number of repetitions of Prior Patient Name (MRG-7).
   */
  public int getPriorPatientNameReps() {
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
   * Inserts a repetition of Prior Patient Name (MRG-7) at a given index and returns it.
   * @param index The index
   */
  public XPN insertPriorPatientName(int index) throws HL7Exception {
     return (XPN) super.insertRepetition(7, index);
  }

  /**
   * Removes a repetition of Prior Patient Name (MRG-7) at a given index and returns it.
   * @param index The index
   */
  public XPN removePriorPatientName(int index) throws HL7Exception {
     return (XPN) super.removeRepetition(7, index);
  }

  /**
   * Returns a single repetition of Prior Patient Name (MRG-7).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XPN getMrg7_PriorPatientName(int rep) throws HL7Exception {
    XPN ret = null;
    try {
        Type t = this.getField(7, rep);
        ret = (XPN)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Prior Patient Name (MRG-7).
   */
  public XPN[] getMrg7_PriorPatientName() {
     XPN[] ret = null;
    try {
        Type[] t = this.getField(7);  
        ret = new XPN[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (XPN)t[i];
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
   * Returns a count of the number of repetitions of Prior Patient Name (MRG-7).
   */
  public int getMrg7_PriorPatientNameReps() {
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
   * Inserts a repetition of Prior Patient Name (MRG-7) at a given index and returns it.
   * @param index The index
   */
  public XPN insertMrg7_PriorPatientName(int index) throws HL7Exception {
     return (XPN) super.insertRepetition(7, index);
  }

  /**
   * Removes a repetition of Prior Patient Name (MRG-7) at a given index and returns it.
   * @param index The index
   */
  public XPN removeMrg7_PriorPatientName(int index) throws HL7Exception {
     return (XPN) super.removeRepetition(7, index);
  }

   protected Type createNewTypeWithoutReflection(int field) {
      switch (field) {
         case 0: return new ca.uhn.hl7v2.model.v26.datatype.CX(getMessage());
         case 1: return new ca.uhn.hl7v2.model.v26.datatype.CX(getMessage());
         case 2: return new ca.uhn.hl7v2.model.v26.datatype.CX(getMessage());
         case 3: return new ca.uhn.hl7v2.model.v26.datatype.CX(getMessage());
         case 4: return new ca.uhn.hl7v2.model.v26.datatype.CX(getMessage());
         case 5: return new ca.uhn.hl7v2.model.v26.datatype.CX(getMessage());
         case 6: return new ca.uhn.hl7v2.model.v26.datatype.XPN(getMessage());
         default: return null;
      }
   }

}