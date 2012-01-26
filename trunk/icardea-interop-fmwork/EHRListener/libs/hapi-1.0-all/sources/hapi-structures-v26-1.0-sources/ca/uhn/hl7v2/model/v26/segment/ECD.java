package ca.uhn.hl7v2.model.v26.segment;

import ca.uhn.hl7v2.model.*;
import ca.uhn.hl7v2.model.v26.datatype.*;
import ca.uhn.log.HapiLogFactory;
import ca.uhn.hl7v2.parser.ModelClassFactory;
import ca.uhn.hl7v2.HL7Exception;

/**
 * <p>Represents an HL7 ECD message segment. 
 * This segment has the following fields:</p><p>
 * ECD-1: Reference Command Number (NM)<br> 
 * ECD-2: Remote Control Command (CWE)<br> 
 * ECD-3: Response Required (ID)<br> 
 * ECD-4: Requested Completion Time (TQ)<br> 
 * ECD-5: Parameters (TX)<br> 
 * </p><p>The get...() methods return data from individual fields.  These methods 
 * do not throw exceptions and may therefore have to handle exceptions internally.  
 * If an exception is handled internally, it is logged and null is returned.  
 * This is not expected to happen - if it does happen this indicates not so much 
 * an exceptional circumstance as a bug in the code for this class.</p>    
 */
public class ECD extends AbstractSegment  {

  /**
   * Creates a ECD (Equipment Command) segment object that belongs to the given 
   * message.  
   */
  public ECD(Group parent, ModelClassFactory factory) {
    super(parent, factory);
    Message message = getMessage();
    try {
       this.add(NM.class, true, 1, 20, new Object[]{message}, "Reference Command Number");
       this.add(CWE.class, true, 1, 250, new Object[]{message}, "Remote Control Command");
       this.add(ID.class, false, 1, 80, new Object[]{message, new Integer(136)}, "Response Required");
       this.add(TQ.class, false, 1, 0, new Object[]{message}, "Requested Completion Time");
       this.add(TX.class, false, 0, 65536, new Object[]{message}, "Parameters");
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Can't instantiate " + this.getClass().getName(), he);
    }
  }

  /**
   * Returns Reference Command Number (ECD-1).
   */
  public NM getReferenceCommandNumber()  {
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
   * Returns Reference Command Number (ECD-1).
   */
  public NM getEcd1_ReferenceCommandNumber()  {
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
   * Returns Remote Control Command (ECD-2).
   */
  public CWE getRemoteControlCommand()  {
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
   * Returns Remote Control Command (ECD-2).
   */
  public CWE getEcd2_RemoteControlCommand()  {
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
   * Returns Response Required (ECD-3).
   */
  public ID getResponseRequired()  {
    ID ret = null;
    try {
        Type t = this.getField(3, 0);
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
   * Returns Response Required (ECD-3).
   */
  public ID getEcd3_ResponseRequired()  {
    ID ret = null;
    try {
        Type t = this.getField(3, 0);
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
   * Returns Requested Completion Time (ECD-4).
   */
  public TQ getRequestedCompletionTime()  {
    TQ ret = null;
    try {
        Type t = this.getField(4, 0);
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
   * Returns Requested Completion Time (ECD-4).
   */
  public TQ getEcd4_RequestedCompletionTime()  {
    TQ ret = null;
    try {
        Type t = this.getField(4, 0);
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
   * Returns a single repetition of Parameters (ECD-5).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public TX getParameters(int rep) throws HL7Exception {
    TX ret = null;
    try {
        Type t = this.getField(5, rep);
        ret = (TX)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Parameters (ECD-5).
   */
  public TX[] getParameters() {
     TX[] ret = null;
    try {
        Type[] t = this.getField(5);  
        ret = new TX[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (TX)t[i];
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
   * Returns a count of the number of repetitions of Parameters (ECD-5).
   */
  public int getParametersReps() {
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
   * Inserts a repetition of Parameters (ECD-5) at a given index and returns it.
   * @param index The index
   */
  public TX insertParameters(int index) throws HL7Exception {
     return (TX) super.insertRepetition(5, index);
  }

  /**
   * Removes a repetition of Parameters (ECD-5) at a given index and returns it.
   * @param index The index
   */
  public TX removeParameters(int index) throws HL7Exception {
     return (TX) super.removeRepetition(5, index);
  }

  /**
   * Returns a single repetition of Parameters (ECD-5).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public TX getEcd5_Parameters(int rep) throws HL7Exception {
    TX ret = null;
    try {
        Type t = this.getField(5, rep);
        ret = (TX)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Parameters (ECD-5).
   */
  public TX[] getEcd5_Parameters() {
     TX[] ret = null;
    try {
        Type[] t = this.getField(5);  
        ret = new TX[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (TX)t[i];
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
   * Returns a count of the number of repetitions of Parameters (ECD-5).
   */
  public int getEcd5_ParametersReps() {
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
   * Inserts a repetition of Parameters (ECD-5) at a given index and returns it.
   * @param index The index
   */
  public TX insertEcd5_Parameters(int index) throws HL7Exception {
     return (TX) super.insertRepetition(5, index);
  }

  /**
   * Removes a repetition of Parameters (ECD-5) at a given index and returns it.
   * @param index The index
   */
  public TX removeEcd5_Parameters(int index) throws HL7Exception {
     return (TX) super.removeRepetition(5, index);
  }

   protected Type createNewTypeWithoutReflection(int field) {
      switch (field) {
         case 0: return new ca.uhn.hl7v2.model.v26.datatype.NM(getMessage());
         case 1: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 2: return new ca.uhn.hl7v2.model.v26.datatype.ID(getMessage(), new Integer(136));
         case 3: return new ca.uhn.hl7v2.model.v26.datatype.TQ(getMessage());
         case 4: return new ca.uhn.hl7v2.model.v26.datatype.TX(getMessage());
         default: return null;
      }
   }

}