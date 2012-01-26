package ca.uhn.hl7v2.model.v26.segment;

import ca.uhn.hl7v2.model.*;
import ca.uhn.hl7v2.model.v26.datatype.*;
import ca.uhn.log.HapiLogFactory;
import ca.uhn.hl7v2.parser.ModelClassFactory;
import ca.uhn.hl7v2.HL7Exception;

/**
 * <p>Represents an HL7 OM5 message segment. 
 * This segment has the following fields:</p><p>
 * OM5-1: Sequence Number - Test/Observation Master File (NM)<br> 
 * OM5-2: Test/Observations Included Within an Ordered Test Battery (CWE)<br> 
 * OM5-3: Observation ID Suffixes (ST)<br> 
 * </p><p>The get...() methods return data from individual fields.  These methods 
 * do not throw exceptions and may therefore have to handle exceptions internally.  
 * If an exception is handled internally, it is logged and null is returned.  
 * This is not expected to happen - if it does happen this indicates not so much 
 * an exceptional circumstance as a bug in the code for this class.</p>    
 */
public class OM5 extends AbstractSegment  {

  /**
   * Creates a OM5 (Observation Batteries (Sets)) segment object that belongs to the given 
   * message.  
   */
  public OM5(Group parent, ModelClassFactory factory) {
    super(parent, factory);
    Message message = getMessage();
    try {
       this.add(NM.class, false, 1, 4, new Object[]{message}, "Sequence Number - Test/Observation Master File");
       this.add(CWE.class, false, 0, 250, new Object[]{message}, "Test/Observations Included Within an Ordered Test Battery");
       this.add(ST.class, false, 1, 250, new Object[]{message}, "Observation ID Suffixes");
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Can't instantiate " + this.getClass().getName(), he);
    }
  }

  /**
   * Returns Sequence Number - Test/Observation Master File (OM5-1).
   */
  public NM getSequenceNumberTestObservationMasterFile()  {
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
   * Returns Sequence Number - Test/Observation Master File (OM5-1).
   */
  public NM getOm51_SequenceNumberTestObservationMasterFile()  {
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
   * Returns a single repetition of Test/Observations Included Within an Ordered Test Battery (OM5-2).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getTestObservationsIncludedWithinAnOrderedTestBattery(int rep) throws HL7Exception {
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
   * Returns all repetitions of Test/Observations Included Within an Ordered Test Battery (OM5-2).
   */
  public CWE[] getTestObservationsIncludedWithinAnOrderedTestBattery() {
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
   * Returns a count of the number of repetitions of Test/Observations Included Within an Ordered Test Battery (OM5-2).
   */
  public int getTestObservationsIncludedWithinAnOrderedTestBatteryReps() {
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
   * Inserts a repetition of Test/Observations Included Within an Ordered Test Battery (OM5-2) at a given index and returns it.
   * @param index The index
   */
  public CWE insertTestObservationsIncludedWithinAnOrderedTestBattery(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(2, index);
  }

  /**
   * Removes a repetition of Test/Observations Included Within an Ordered Test Battery (OM5-2) at a given index and returns it.
   * @param index The index
   */
  public CWE removeTestObservationsIncludedWithinAnOrderedTestBattery(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(2, index);
  }

  /**
   * Returns a single repetition of Test/Observations Included Within an Ordered Test Battery (OM5-2).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getOm52_TestObservationsIncludedWithinAnOrderedTestBattery(int rep) throws HL7Exception {
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
   * Returns all repetitions of Test/Observations Included Within an Ordered Test Battery (OM5-2).
   */
  public CWE[] getOm52_TestObservationsIncludedWithinAnOrderedTestBattery() {
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
   * Returns a count of the number of repetitions of Test/Observations Included Within an Ordered Test Battery (OM5-2).
   */
  public int getOm52_TestObservationsIncludedWithinAnOrderedTestBatteryReps() {
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
   * Inserts a repetition of Test/Observations Included Within an Ordered Test Battery (OM5-2) at a given index and returns it.
   * @param index The index
   */
  public CWE insertOm52_TestObservationsIncludedWithinAnOrderedTestBattery(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(2, index);
  }

  /**
   * Removes a repetition of Test/Observations Included Within an Ordered Test Battery (OM5-2) at a given index and returns it.
   * @param index The index
   */
  public CWE removeOm52_TestObservationsIncludedWithinAnOrderedTestBattery(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(2, index);
  }

  /**
   * Returns Observation ID Suffixes (OM5-3).
   */
  public ST getObservationIDSuffixes()  {
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
   * Returns Observation ID Suffixes (OM5-3).
   */
  public ST getOm53_ObservationIDSuffixes()  {
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
         case 0: return new ca.uhn.hl7v2.model.v26.datatype.NM(getMessage());
         case 1: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 2: return new ca.uhn.hl7v2.model.v26.datatype.ST(getMessage());
         default: return null;
      }
   }

}