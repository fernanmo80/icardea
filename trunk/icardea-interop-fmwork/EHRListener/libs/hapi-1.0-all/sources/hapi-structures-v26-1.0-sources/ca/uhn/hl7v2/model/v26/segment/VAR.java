package ca.uhn.hl7v2.model.v26.segment;

import ca.uhn.hl7v2.model.*;
import ca.uhn.hl7v2.model.v26.datatype.*;
import ca.uhn.log.HapiLogFactory;
import ca.uhn.hl7v2.parser.ModelClassFactory;
import ca.uhn.hl7v2.HL7Exception;

/**
 * <p>Represents an HL7 VAR message segment. 
 * This segment has the following fields:</p><p>
 * VAR-1: Variance Instance ID (EI)<br> 
 * VAR-2: Documented Date/Time (DTM)<br> 
 * VAR-3: Stated Variance Date/Time (DTM)<br> 
 * VAR-4: Variance Originator (XCN)<br> 
 * VAR-5: Variance Classification (CWE)<br> 
 * VAR-6: Variance Description (ST)<br> 
 * </p><p>The get...() methods return data from individual fields.  These methods 
 * do not throw exceptions and may therefore have to handle exceptions internally.  
 * If an exception is handled internally, it is logged and null is returned.  
 * This is not expected to happen - if it does happen this indicates not so much 
 * an exceptional circumstance as a bug in the code for this class.</p>    
 */
public class VAR extends AbstractSegment  {

  /**
   * Creates a VAR (Variance) segment object that belongs to the given 
   * message.  
   */
  public VAR(Group parent, ModelClassFactory factory) {
    super(parent, factory);
    Message message = getMessage();
    try {
       this.add(EI.class, true, 1, 60, new Object[]{message}, "Variance Instance ID");
       this.add(DTM.class, true, 1, 24, new Object[]{message}, "Documented Date/Time");
       this.add(DTM.class, false, 1, 24, new Object[]{message}, "Stated Variance Date/Time");
       this.add(XCN.class, false, 0, 250, new Object[]{message}, "Variance Originator");
       this.add(CWE.class, false, 1, 705, new Object[]{message}, "Variance Classification");
       this.add(ST.class, false, 0, 512, new Object[]{message}, "Variance Description");
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Can't instantiate " + this.getClass().getName(), he);
    }
  }

  /**
   * Returns Variance Instance ID (VAR-1).
   */
  public EI getVarianceInstanceID()  {
    EI ret = null;
    try {
        Type t = this.getField(1, 0);
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
   * Returns Variance Instance ID (VAR-1).
   */
  public EI getVar1_VarianceInstanceID()  {
    EI ret = null;
    try {
        Type t = this.getField(1, 0);
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
   * Returns Documented Date/Time (VAR-2).
   */
  public DTM getDocumentedDateTime()  {
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
   * Returns Documented Date/Time (VAR-2).
   */
  public DTM getVar2_DocumentedDateTime()  {
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
   * Returns Stated Variance Date/Time (VAR-3).
   */
  public DTM getStatedVarianceDateTime()  {
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
   * Returns Stated Variance Date/Time (VAR-3).
   */
  public DTM getVar3_StatedVarianceDateTime()  {
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
   * Returns a single repetition of Variance Originator (VAR-4).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XCN getVarianceOriginator(int rep) throws HL7Exception {
    XCN ret = null;
    try {
        Type t = this.getField(4, rep);
        ret = (XCN)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Variance Originator (VAR-4).
   */
  public XCN[] getVarianceOriginator() {
     XCN[] ret = null;
    try {
        Type[] t = this.getField(4);  
        ret = new XCN[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (XCN)t[i];
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
   * Returns a count of the number of repetitions of Variance Originator (VAR-4).
   */
  public int getVarianceOriginatorReps() {
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
   * Inserts a repetition of Variance Originator (VAR-4) at a given index and returns it.
   * @param index The index
   */
  public XCN insertVarianceOriginator(int index) throws HL7Exception {
     return (XCN) super.insertRepetition(4, index);
  }

  /**
   * Removes a repetition of Variance Originator (VAR-4) at a given index and returns it.
   * @param index The index
   */
  public XCN removeVarianceOriginator(int index) throws HL7Exception {
     return (XCN) super.removeRepetition(4, index);
  }

  /**
   * Returns a single repetition of Variance Originator (VAR-4).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XCN getVar4_VarianceOriginator(int rep) throws HL7Exception {
    XCN ret = null;
    try {
        Type t = this.getField(4, rep);
        ret = (XCN)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Variance Originator (VAR-4).
   */
  public XCN[] getVar4_VarianceOriginator() {
     XCN[] ret = null;
    try {
        Type[] t = this.getField(4);  
        ret = new XCN[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (XCN)t[i];
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
   * Returns a count of the number of repetitions of Variance Originator (VAR-4).
   */
  public int getVar4_VarianceOriginatorReps() {
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
   * Inserts a repetition of Variance Originator (VAR-4) at a given index and returns it.
   * @param index The index
   */
  public XCN insertVar4_VarianceOriginator(int index) throws HL7Exception {
     return (XCN) super.insertRepetition(4, index);
  }

  /**
   * Removes a repetition of Variance Originator (VAR-4) at a given index and returns it.
   * @param index The index
   */
  public XCN removeVar4_VarianceOriginator(int index) throws HL7Exception {
     return (XCN) super.removeRepetition(4, index);
  }

  /**
   * Returns Variance Classification (VAR-5).
   */
  public CWE getVarianceClassification()  {
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
   * Returns Variance Classification (VAR-5).
   */
  public CWE getVar5_VarianceClassification()  {
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
   * Returns a single repetition of Variance Description (VAR-6).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public ST getVarianceDescription(int rep) throws HL7Exception {
    ST ret = null;
    try {
        Type t = this.getField(6, rep);
        ret = (ST)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Variance Description (VAR-6).
   */
  public ST[] getVarianceDescription() {
     ST[] ret = null;
    try {
        Type[] t = this.getField(6);  
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
   * Returns a count of the number of repetitions of Variance Description (VAR-6).
   */
  public int getVarianceDescriptionReps() {
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
   * Inserts a repetition of Variance Description (VAR-6) at a given index and returns it.
   * @param index The index
   */
  public ST insertVarianceDescription(int index) throws HL7Exception {
     return (ST) super.insertRepetition(6, index);
  }

  /**
   * Removes a repetition of Variance Description (VAR-6) at a given index and returns it.
   * @param index The index
   */
  public ST removeVarianceDescription(int index) throws HL7Exception {
     return (ST) super.removeRepetition(6, index);
  }

  /**
   * Returns a single repetition of Variance Description (VAR-6).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public ST getVar6_VarianceDescription(int rep) throws HL7Exception {
    ST ret = null;
    try {
        Type t = this.getField(6, rep);
        ret = (ST)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Variance Description (VAR-6).
   */
  public ST[] getVar6_VarianceDescription() {
     ST[] ret = null;
    try {
        Type[] t = this.getField(6);  
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
   * Returns a count of the number of repetitions of Variance Description (VAR-6).
   */
  public int getVar6_VarianceDescriptionReps() {
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
   * Inserts a repetition of Variance Description (VAR-6) at a given index and returns it.
   * @param index The index
   */
  public ST insertVar6_VarianceDescription(int index) throws HL7Exception {
     return (ST) super.insertRepetition(6, index);
  }

  /**
   * Removes a repetition of Variance Description (VAR-6) at a given index and returns it.
   * @param index The index
   */
  public ST removeVar6_VarianceDescription(int index) throws HL7Exception {
     return (ST) super.removeRepetition(6, index);
  }

   protected Type createNewTypeWithoutReflection(int field) {
      switch (field) {
         case 0: return new ca.uhn.hl7v2.model.v26.datatype.EI(getMessage());
         case 1: return new ca.uhn.hl7v2.model.v26.datatype.DTM(getMessage());
         case 2: return new ca.uhn.hl7v2.model.v26.datatype.DTM(getMessage());
         case 3: return new ca.uhn.hl7v2.model.v26.datatype.XCN(getMessage());
         case 4: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 5: return new ca.uhn.hl7v2.model.v26.datatype.ST(getMessage());
         default: return null;
      }
   }

}