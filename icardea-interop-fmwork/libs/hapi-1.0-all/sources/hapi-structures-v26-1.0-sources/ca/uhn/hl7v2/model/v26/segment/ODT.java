package ca.uhn.hl7v2.model.v26.segment;

import ca.uhn.hl7v2.model.*;
import ca.uhn.hl7v2.model.v26.datatype.*;
import ca.uhn.log.HapiLogFactory;
import ca.uhn.hl7v2.parser.ModelClassFactory;
import ca.uhn.hl7v2.HL7Exception;

/**
 * <p>Represents an HL7 ODT message segment. 
 * This segment has the following fields:</p><p>
 * ODT-1: Tray Type (CWE)<br> 
 * ODT-2: Service Period (CWE)<br> 
 * ODT-3: Text Instruction (ST)<br> 
 * </p><p>The get...() methods return data from individual fields.  These methods 
 * do not throw exceptions and may therefore have to handle exceptions internally.  
 * If an exception is handled internally, it is logged and null is returned.  
 * This is not expected to happen - if it does happen this indicates not so much 
 * an exceptional circumstance as a bug in the code for this class.</p>    
 */
public class ODT extends AbstractSegment  {

  /**
   * Creates a ODT (Diet Tray Instructions) segment object that belongs to the given 
   * message.  
   */
  public ODT(Group parent, ModelClassFactory factory) {
    super(parent, factory);
    Message message = getMessage();
    try {
       this.add(CWE.class, true, 1, 250, new Object[]{message}, "Tray Type");
       this.add(CWE.class, false, 10, 250, new Object[]{message}, "Service Period");
       this.add(ST.class, false, 1, 80, new Object[]{message}, "Text Instruction");
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Can't instantiate " + this.getClass().getName(), he);
    }
  }

  /**
   * Returns Tray Type (ODT-1).
   */
  public CWE getTrayType()  {
    CWE ret = null;
    try {
        Type t = this.getField(1, 0);
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
   * Returns Tray Type (ODT-1).
   */
  public CWE getOdt1_TrayType()  {
    CWE ret = null;
    try {
        Type t = this.getField(1, 0);
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
   * Returns a single repetition of Service Period (ODT-2).
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
   * Returns all repetitions of Service Period (ODT-2).
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
   * Returns a count of the number of repetitions of Service Period (ODT-2).
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
   * Inserts a repetition of Service Period (ODT-2) at a given index and returns it.
   * @param index The index
   */
  public CWE insertServicePeriod(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(2, index);
  }

  /**
   * Removes a repetition of Service Period (ODT-2) at a given index and returns it.
   * @param index The index
   */
  public CWE removeServicePeriod(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(2, index);
  }

  /**
   * Returns a single repetition of Service Period (ODT-2).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getOdt2_ServicePeriod(int rep) throws HL7Exception {
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
   * Returns all repetitions of Service Period (ODT-2).
   */
  public CWE[] getOdt2_ServicePeriod() {
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
   * Returns a count of the number of repetitions of Service Period (ODT-2).
   */
  public int getOdt2_ServicePeriodReps() {
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
   * Inserts a repetition of Service Period (ODT-2) at a given index and returns it.
   * @param index The index
   */
  public CWE insertOdt2_ServicePeriod(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(2, index);
  }

  /**
   * Removes a repetition of Service Period (ODT-2) at a given index and returns it.
   * @param index The index
   */
  public CWE removeOdt2_ServicePeriod(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(2, index);
  }

  /**
   * Returns Text Instruction (ODT-3).
   */
  public ST getTextInstruction()  {
    ST ret = null;
    try {
        Type t = this.getField(3, 0);
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
   * Returns Text Instruction (ODT-3).
   */
  public ST getOdt3_TextInstruction()  {
    ST ret = null;
    try {
        Type t = this.getField(3, 0);
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

   protected Type createNewTypeWithoutReflection(int field) {
      switch (field) {
         case 0: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 1: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 2: return new ca.uhn.hl7v2.model.v26.datatype.ST(getMessage());
         default: return null;
      }
   }

}