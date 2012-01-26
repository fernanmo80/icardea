package ca.uhn.hl7v2.model.v26.segment;

import ca.uhn.hl7v2.model.*;
import ca.uhn.hl7v2.model.v26.datatype.*;
import ca.uhn.log.HapiLogFactory;
import ca.uhn.hl7v2.parser.ModelClassFactory;
import ca.uhn.hl7v2.HL7Exception;

/**
 * <p>Represents an HL7 OM4 message segment. 
 * This segment has the following fields:</p><p>
 * OM4-1: Sequence Number - Test/Observation Master File (NM)<br> 
 * OM4-2: Derived Specimen (ID)<br> 
 * OM4-3: Container Description (TX)<br> 
 * OM4-4: Container Volume (NM)<br> 
 * OM4-5: Container Units (CWE)<br> 
 * OM4-6: Specimen (CWE)<br> 
 * OM4-7: Additive (CWE)<br> 
 * OM4-8: Preparation (TX)<br> 
 * OM4-9: Special Handling Requirements (TX)<br> 
 * OM4-10: Normal Collection Volume (CQ)<br> 
 * OM4-11: Minimum Collection Volume (CQ)<br> 
 * OM4-12: Specimen Requirements (TX)<br> 
 * OM4-13: Specimen Priorities (ID)<br> 
 * OM4-14: Specimen Retention Time (CQ)<br> 
 * </p><p>The get...() methods return data from individual fields.  These methods 
 * do not throw exceptions and may therefore have to handle exceptions internally.  
 * If an exception is handled internally, it is logged and null is returned.  
 * This is not expected to happen - if it does happen this indicates not so much 
 * an exceptional circumstance as a bug in the code for this class.</p>    
 */
public class OM4 extends AbstractSegment  {

  /**
   * Creates a OM4 (Observations that Require Specimens) segment object that belongs to the given 
   * message.  
   */
  public OM4(Group parent, ModelClassFactory factory) {
    super(parent, factory);
    Message message = getMessage();
    try {
       this.add(NM.class, false, 1, 4, new Object[]{message}, "Sequence Number - Test/Observation Master File");
       this.add(ID.class, false, 1, 1, new Object[]{message, new Integer(170)}, "Derived Specimen");
       this.add(TX.class, false, 1, 60, new Object[]{message}, "Container Description");
       this.add(NM.class, false, 1, 20, new Object[]{message}, "Container Volume");
       this.add(CWE.class, false, 1, 250, new Object[]{message}, "Container Units");
       this.add(CWE.class, false, 1, 250, new Object[]{message}, "Specimen");
       this.add(CWE.class, false, 1, 705, new Object[]{message}, "Additive");
       this.add(TX.class, false, 1, 10240, new Object[]{message}, "Preparation");
       this.add(TX.class, false, 1, 10240, new Object[]{message}, "Special Handling Requirements");
       this.add(CQ.class, false, 1, 20, new Object[]{message}, "Normal Collection Volume");
       this.add(CQ.class, false, 1, 20, new Object[]{message}, "Minimum Collection Volume");
       this.add(TX.class, false, 1, 10240, new Object[]{message}, "Specimen Requirements");
       this.add(ID.class, false, 0, 1, new Object[]{message, new Integer(27)}, "Specimen Priorities");
       this.add(CQ.class, false, 1, 20, new Object[]{message}, "Specimen Retention Time");
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Can't instantiate " + this.getClass().getName(), he);
    }
  }

  /**
   * Returns Sequence Number - Test/Observation Master File (OM4-1).
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
   * Returns Sequence Number - Test/Observation Master File (OM4-1).
   */
  public NM getOm41_SequenceNumberTestObservationMasterFile()  {
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
   * Returns Derived Specimen (OM4-2).
   */
  public ID getDerivedSpecimen()  {
    ID ret = null;
    try {
        Type t = this.getField(2, 0);
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
   * Returns Derived Specimen (OM4-2).
   */
  public ID getOm42_DerivedSpecimen()  {
    ID ret = null;
    try {
        Type t = this.getField(2, 0);
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
   * Returns Container Description (OM4-3).
   */
  public TX getContainerDescription()  {
    TX ret = null;
    try {
        Type t = this.getField(3, 0);
        ret = (TX)t;
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
   * Returns Container Description (OM4-3).
   */
  public TX getOm43_ContainerDescription()  {
    TX ret = null;
    try {
        Type t = this.getField(3, 0);
        ret = (TX)t;
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
   * Returns Container Volume (OM4-4).
   */
  public NM getContainerVolume()  {
    NM ret = null;
    try {
        Type t = this.getField(4, 0);
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
   * Returns Container Volume (OM4-4).
   */
  public NM getOm44_ContainerVolume()  {
    NM ret = null;
    try {
        Type t = this.getField(4, 0);
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
   * Returns Container Units (OM4-5).
   */
  public CWE getContainerUnits()  {
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
   * Returns Container Units (OM4-5).
   */
  public CWE getOm45_ContainerUnits()  {
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
   * Returns Specimen (OM4-6).
   */
  public CWE getSpecimen()  {
    CWE ret = null;
    try {
        Type t = this.getField(6, 0);
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
   * Returns Specimen (OM4-6).
   */
  public CWE getOm46_Specimen()  {
    CWE ret = null;
    try {
        Type t = this.getField(6, 0);
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
   * Returns Additive (OM4-7).
   */
  public CWE getAdditive()  {
    CWE ret = null;
    try {
        Type t = this.getField(7, 0);
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
   * Returns Additive (OM4-7).
   */
  public CWE getOm47_Additive()  {
    CWE ret = null;
    try {
        Type t = this.getField(7, 0);
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
   * Returns Preparation (OM4-8).
   */
  public TX getPreparation()  {
    TX ret = null;
    try {
        Type t = this.getField(8, 0);
        ret = (TX)t;
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
   * Returns Preparation (OM4-8).
   */
  public TX getOm48_Preparation()  {
    TX ret = null;
    try {
        Type t = this.getField(8, 0);
        ret = (TX)t;
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
   * Returns Special Handling Requirements (OM4-9).
   */
  public TX getSpecialHandlingRequirements()  {
    TX ret = null;
    try {
        Type t = this.getField(9, 0);
        ret = (TX)t;
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
   * Returns Special Handling Requirements (OM4-9).
   */
  public TX getOm49_SpecialHandlingRequirements()  {
    TX ret = null;
    try {
        Type t = this.getField(9, 0);
        ret = (TX)t;
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
   * Returns Normal Collection Volume (OM4-10).
   */
  public CQ getNormalCollectionVolume()  {
    CQ ret = null;
    try {
        Type t = this.getField(10, 0);
        ret = (CQ)t;
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
   * Returns Normal Collection Volume (OM4-10).
   */
  public CQ getOm410_NormalCollectionVolume()  {
    CQ ret = null;
    try {
        Type t = this.getField(10, 0);
        ret = (CQ)t;
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
   * Returns Minimum Collection Volume (OM4-11).
   */
  public CQ getMinimumCollectionVolume()  {
    CQ ret = null;
    try {
        Type t = this.getField(11, 0);
        ret = (CQ)t;
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
   * Returns Minimum Collection Volume (OM4-11).
   */
  public CQ getOm411_MinimumCollectionVolume()  {
    CQ ret = null;
    try {
        Type t = this.getField(11, 0);
        ret = (CQ)t;
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
   * Returns Specimen Requirements (OM4-12).
   */
  public TX getSpecimenRequirements()  {
    TX ret = null;
    try {
        Type t = this.getField(12, 0);
        ret = (TX)t;
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
   * Returns Specimen Requirements (OM4-12).
   */
  public TX getOm412_SpecimenRequirements()  {
    TX ret = null;
    try {
        Type t = this.getField(12, 0);
        ret = (TX)t;
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
   * Returns a single repetition of Specimen Priorities (OM4-13).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public ID getSpecimenPriorities(int rep) throws HL7Exception {
    ID ret = null;
    try {
        Type t = this.getField(13, rep);
        ret = (ID)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Specimen Priorities (OM4-13).
   */
  public ID[] getSpecimenPriorities() {
     ID[] ret = null;
    try {
        Type[] t = this.getField(13);  
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
   * Returns a count of the number of repetitions of Specimen Priorities (OM4-13).
   */
  public int getSpecimenPrioritiesReps() {
    try {
        return this.getField(13).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Specimen Priorities (OM4-13) at a given index and returns it.
   * @param index The index
   */
  public ID insertSpecimenPriorities(int index) throws HL7Exception {
     return (ID) super.insertRepetition(13, index);
  }

  /**
   * Removes a repetition of Specimen Priorities (OM4-13) at a given index and returns it.
   * @param index The index
   */
  public ID removeSpecimenPriorities(int index) throws HL7Exception {
     return (ID) super.removeRepetition(13, index);
  }

  /**
   * Returns a single repetition of Specimen Priorities (OM4-13).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public ID getOm413_SpecimenPriorities(int rep) throws HL7Exception {
    ID ret = null;
    try {
        Type t = this.getField(13, rep);
        ret = (ID)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Specimen Priorities (OM4-13).
   */
  public ID[] getOm413_SpecimenPriorities() {
     ID[] ret = null;
    try {
        Type[] t = this.getField(13);  
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
   * Returns a count of the number of repetitions of Specimen Priorities (OM4-13).
   */
  public int getOm413_SpecimenPrioritiesReps() {
    try {
        return this.getField(13).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Specimen Priorities (OM4-13) at a given index and returns it.
   * @param index The index
   */
  public ID insertOm413_SpecimenPriorities(int index) throws HL7Exception {
     return (ID) super.insertRepetition(13, index);
  }

  /**
   * Removes a repetition of Specimen Priorities (OM4-13) at a given index and returns it.
   * @param index The index
   */
  public ID removeOm413_SpecimenPriorities(int index) throws HL7Exception {
     return (ID) super.removeRepetition(13, index);
  }

  /**
   * Returns Specimen Retention Time (OM4-14).
   */
  public CQ getSpecimenRetentionTime()  {
    CQ ret = null;
    try {
        Type t = this.getField(14, 0);
        ret = (CQ)t;
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
   * Returns Specimen Retention Time (OM4-14).
   */
  public CQ getOm414_SpecimenRetentionTime()  {
    CQ ret = null;
    try {
        Type t = this.getField(14, 0);
        ret = (CQ)t;
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
         case 1: return new ca.uhn.hl7v2.model.v26.datatype.ID(getMessage(), new Integer(170));
         case 2: return new ca.uhn.hl7v2.model.v26.datatype.TX(getMessage());
         case 3: return new ca.uhn.hl7v2.model.v26.datatype.NM(getMessage());
         case 4: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 5: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 6: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 7: return new ca.uhn.hl7v2.model.v26.datatype.TX(getMessage());
         case 8: return new ca.uhn.hl7v2.model.v26.datatype.TX(getMessage());
         case 9: return new ca.uhn.hl7v2.model.v26.datatype.CQ(getMessage());
         case 10: return new ca.uhn.hl7v2.model.v26.datatype.CQ(getMessage());
         case 11: return new ca.uhn.hl7v2.model.v26.datatype.TX(getMessage());
         case 12: return new ca.uhn.hl7v2.model.v26.datatype.ID(getMessage(), new Integer(27));
         case 13: return new ca.uhn.hl7v2.model.v26.datatype.CQ(getMessage());
         default: return null;
      }
   }

}