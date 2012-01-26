package ca.uhn.hl7v2.model.v26.segment;

import ca.uhn.hl7v2.model.*;
import ca.uhn.hl7v2.model.v26.datatype.*;
import ca.uhn.log.HapiLogFactory;
import ca.uhn.hl7v2.parser.ModelClassFactory;
import ca.uhn.hl7v2.HL7Exception;

/**
 * <p>Represents an HL7 TQ1 message segment. 
 * This segment has the following fields:</p><p>
 * TQ1-1: Set ID - TQ1 (SI)<br> 
 * TQ1-2: Quantity (CQ)<br> 
 * TQ1-3: Repeat Pattern (RPT)<br> 
 * TQ1-4: Explicit Time (TM)<br> 
 * TQ1-5: Relative Time and Units (CQ)<br> 
 * TQ1-6: Service Duration (CQ)<br> 
 * TQ1-7: Start date/time (DTM)<br> 
 * TQ1-8: End date/time (DTM)<br> 
 * TQ1-9: Priority (CWE)<br> 
 * TQ1-10: Condition text (TX)<br> 
 * TQ1-11: Text instruction (TX)<br> 
 * TQ1-12: Conjunction (ID)<br> 
 * TQ1-13: Occurrence duration (CQ)<br> 
 * TQ1-14: Total occurrences (NM)<br> 
 * </p><p>The get...() methods return data from individual fields.  These methods 
 * do not throw exceptions and may therefore have to handle exceptions internally.  
 * If an exception is handled internally, it is logged and null is returned.  
 * This is not expected to happen - if it does happen this indicates not so much 
 * an exceptional circumstance as a bug in the code for this class.</p>    
 */
public class TQ1 extends AbstractSegment  {

  /**
   * Creates a TQ1 (Timing/Quantity) segment object that belongs to the given 
   * message.  
   */
  public TQ1(Group parent, ModelClassFactory factory) {
    super(parent, factory);
    Message message = getMessage();
    try {
       this.add(SI.class, false, 1, 4, new Object[]{message}, "Set ID - TQ1");
       this.add(CQ.class, false, 1, 20, new Object[]{message}, "Quantity");
       this.add(RPT.class, false, 0, 540, new Object[]{message}, "Repeat Pattern");
       this.add(TM.class, false, 0, 20, new Object[]{message}, "Explicit Time");
       this.add(CQ.class, false, 0, 20, new Object[]{message}, "Relative Time and Units");
       this.add(CQ.class, false, 1, 20, new Object[]{message}, "Service Duration");
       this.add(DTM.class, false, 1, 24, new Object[]{message}, "Start date/time");
       this.add(DTM.class, false, 1, 24, new Object[]{message}, "End date/time");
       this.add(CWE.class, false, 0, 250, new Object[]{message}, "Priority");
       this.add(TX.class, false, 1, 250, new Object[]{message}, "Condition text");
       this.add(TX.class, false, 1, 250, new Object[]{message}, "Text instruction");
       this.add(ID.class, false, 1, 10, new Object[]{message, new Integer(472)}, "Conjunction");
       this.add(CQ.class, false, 1, 20, new Object[]{message}, "Occurrence duration");
       this.add(NM.class, false, 1, 10, new Object[]{message}, "Total occurrences");
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Can't instantiate " + this.getClass().getName(), he);
    }
  }

  /**
   * Returns Set ID - TQ1 (TQ1-1).
   */
  public SI getSetIDTQ1()  {
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
   * Returns Set ID - TQ1 (TQ1-1).
   */
  public SI getTq11_SetIDTQ1()  {
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
   * Returns Quantity (TQ1-2).
   */
  public CQ getQuantity()  {
    CQ ret = null;
    try {
        Type t = this.getField(2, 0);
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
   * Returns Quantity (TQ1-2).
   */
  public CQ getTq12_Quantity()  {
    CQ ret = null;
    try {
        Type t = this.getField(2, 0);
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
   * Returns a single repetition of Repeat Pattern (TQ1-3).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public RPT getRepeatPattern(int rep) throws HL7Exception {
    RPT ret = null;
    try {
        Type t = this.getField(3, rep);
        ret = (RPT)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Repeat Pattern (TQ1-3).
   */
  public RPT[] getRepeatPattern() {
     RPT[] ret = null;
    try {
        Type[] t = this.getField(3);  
        ret = new RPT[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (RPT)t[i];
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
   * Returns a count of the number of repetitions of Repeat Pattern (TQ1-3).
   */
  public int getRepeatPatternReps() {
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
   * Inserts a repetition of Repeat Pattern (TQ1-3) at a given index and returns it.
   * @param index The index
   */
  public RPT insertRepeatPattern(int index) throws HL7Exception {
     return (RPT) super.insertRepetition(3, index);
  }

  /**
   * Removes a repetition of Repeat Pattern (TQ1-3) at a given index and returns it.
   * @param index The index
   */
  public RPT removeRepeatPattern(int index) throws HL7Exception {
     return (RPT) super.removeRepetition(3, index);
  }

  /**
   * Returns a single repetition of Repeat Pattern (TQ1-3).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public RPT getTq13_RepeatPattern(int rep) throws HL7Exception {
    RPT ret = null;
    try {
        Type t = this.getField(3, rep);
        ret = (RPT)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Repeat Pattern (TQ1-3).
   */
  public RPT[] getTq13_RepeatPattern() {
     RPT[] ret = null;
    try {
        Type[] t = this.getField(3);  
        ret = new RPT[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (RPT)t[i];
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
   * Returns a count of the number of repetitions of Repeat Pattern (TQ1-3).
   */
  public int getTq13_RepeatPatternReps() {
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
   * Inserts a repetition of Repeat Pattern (TQ1-3) at a given index and returns it.
   * @param index The index
   */
  public RPT insertTq13_RepeatPattern(int index) throws HL7Exception {
     return (RPT) super.insertRepetition(3, index);
  }

  /**
   * Removes a repetition of Repeat Pattern (TQ1-3) at a given index and returns it.
   * @param index The index
   */
  public RPT removeTq13_RepeatPattern(int index) throws HL7Exception {
     return (RPT) super.removeRepetition(3, index);
  }

  /**
   * Returns a single repetition of Explicit Time (TQ1-4).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public TM getExplicitTime(int rep) throws HL7Exception {
    TM ret = null;
    try {
        Type t = this.getField(4, rep);
        ret = (TM)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Explicit Time (TQ1-4).
   */
  public TM[] getExplicitTime() {
     TM[] ret = null;
    try {
        Type[] t = this.getField(4);  
        ret = new TM[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (TM)t[i];
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
   * Returns a count of the number of repetitions of Explicit Time (TQ1-4).
   */
  public int getExplicitTimeReps() {
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
   * Inserts a repetition of Explicit Time (TQ1-4) at a given index and returns it.
   * @param index The index
   */
  public TM insertExplicitTime(int index) throws HL7Exception {
     return (TM) super.insertRepetition(4, index);
  }

  /**
   * Removes a repetition of Explicit Time (TQ1-4) at a given index and returns it.
   * @param index The index
   */
  public TM removeExplicitTime(int index) throws HL7Exception {
     return (TM) super.removeRepetition(4, index);
  }

  /**
   * Returns a single repetition of Explicit Time (TQ1-4).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public TM getTq14_ExplicitTime(int rep) throws HL7Exception {
    TM ret = null;
    try {
        Type t = this.getField(4, rep);
        ret = (TM)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Explicit Time (TQ1-4).
   */
  public TM[] getTq14_ExplicitTime() {
     TM[] ret = null;
    try {
        Type[] t = this.getField(4);  
        ret = new TM[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (TM)t[i];
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
   * Returns a count of the number of repetitions of Explicit Time (TQ1-4).
   */
  public int getTq14_ExplicitTimeReps() {
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
   * Inserts a repetition of Explicit Time (TQ1-4) at a given index and returns it.
   * @param index The index
   */
  public TM insertTq14_ExplicitTime(int index) throws HL7Exception {
     return (TM) super.insertRepetition(4, index);
  }

  /**
   * Removes a repetition of Explicit Time (TQ1-4) at a given index and returns it.
   * @param index The index
   */
  public TM removeTq14_ExplicitTime(int index) throws HL7Exception {
     return (TM) super.removeRepetition(4, index);
  }

  /**
   * Returns a single repetition of Relative Time and Units (TQ1-5).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CQ getRelativeTimeAndUnits(int rep) throws HL7Exception {
    CQ ret = null;
    try {
        Type t = this.getField(5, rep);
        ret = (CQ)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Relative Time and Units (TQ1-5).
   */
  public CQ[] getRelativeTimeAndUnits() {
     CQ[] ret = null;
    try {
        Type[] t = this.getField(5);  
        ret = new CQ[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (CQ)t[i];
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
   * Returns a count of the number of repetitions of Relative Time and Units (TQ1-5).
   */
  public int getRelativeTimeAndUnitsReps() {
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
   * Inserts a repetition of Relative Time and Units (TQ1-5) at a given index and returns it.
   * @param index The index
   */
  public CQ insertRelativeTimeAndUnits(int index) throws HL7Exception {
     return (CQ) super.insertRepetition(5, index);
  }

  /**
   * Removes a repetition of Relative Time and Units (TQ1-5) at a given index and returns it.
   * @param index The index
   */
  public CQ removeRelativeTimeAndUnits(int index) throws HL7Exception {
     return (CQ) super.removeRepetition(5, index);
  }

  /**
   * Returns a single repetition of Relative Time and Units (TQ1-5).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CQ getTq15_RelativeTimeAndUnits(int rep) throws HL7Exception {
    CQ ret = null;
    try {
        Type t = this.getField(5, rep);
        ret = (CQ)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Relative Time and Units (TQ1-5).
   */
  public CQ[] getTq15_RelativeTimeAndUnits() {
     CQ[] ret = null;
    try {
        Type[] t = this.getField(5);  
        ret = new CQ[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (CQ)t[i];
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
   * Returns a count of the number of repetitions of Relative Time and Units (TQ1-5).
   */
  public int getTq15_RelativeTimeAndUnitsReps() {
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
   * Inserts a repetition of Relative Time and Units (TQ1-5) at a given index and returns it.
   * @param index The index
   */
  public CQ insertTq15_RelativeTimeAndUnits(int index) throws HL7Exception {
     return (CQ) super.insertRepetition(5, index);
  }

  /**
   * Removes a repetition of Relative Time and Units (TQ1-5) at a given index and returns it.
   * @param index The index
   */
  public CQ removeTq15_RelativeTimeAndUnits(int index) throws HL7Exception {
     return (CQ) super.removeRepetition(5, index);
  }

  /**
   * Returns Service Duration (TQ1-6).
   */
  public CQ getServiceDuration()  {
    CQ ret = null;
    try {
        Type t = this.getField(6, 0);
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
   * Returns Service Duration (TQ1-6).
   */
  public CQ getTq16_ServiceDuration()  {
    CQ ret = null;
    try {
        Type t = this.getField(6, 0);
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
   * Returns Start date/time (TQ1-7).
   */
  public DTM getStartDateTime()  {
    DTM ret = null;
    try {
        Type t = this.getField(7, 0);
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
   * Returns Start date/time (TQ1-7).
   */
  public DTM getTq17_StartDateTime()  {
    DTM ret = null;
    try {
        Type t = this.getField(7, 0);
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
   * Returns End date/time (TQ1-8).
   */
  public DTM getEndDateTime()  {
    DTM ret = null;
    try {
        Type t = this.getField(8, 0);
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
   * Returns End date/time (TQ1-8).
   */
  public DTM getTq18_EndDateTime()  {
    DTM ret = null;
    try {
        Type t = this.getField(8, 0);
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
   * Returns a single repetition of Priority (TQ1-9).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getPriority(int rep) throws HL7Exception {
    CWE ret = null;
    try {
        Type t = this.getField(9, rep);
        ret = (CWE)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Priority (TQ1-9).
   */
  public CWE[] getPriority() {
     CWE[] ret = null;
    try {
        Type[] t = this.getField(9);  
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
   * Returns a count of the number of repetitions of Priority (TQ1-9).
   */
  public int getPriorityReps() {
    try {
        return this.getField(9).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Priority (TQ1-9) at a given index and returns it.
   * @param index The index
   */
  public CWE insertPriority(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(9, index);
  }

  /**
   * Removes a repetition of Priority (TQ1-9) at a given index and returns it.
   * @param index The index
   */
  public CWE removePriority(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(9, index);
  }

  /**
   * Returns a single repetition of Priority (TQ1-9).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getTq19_Priority(int rep) throws HL7Exception {
    CWE ret = null;
    try {
        Type t = this.getField(9, rep);
        ret = (CWE)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Priority (TQ1-9).
   */
  public CWE[] getTq19_Priority() {
     CWE[] ret = null;
    try {
        Type[] t = this.getField(9);  
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
   * Returns a count of the number of repetitions of Priority (TQ1-9).
   */
  public int getTq19_PriorityReps() {
    try {
        return this.getField(9).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Priority (TQ1-9) at a given index and returns it.
   * @param index The index
   */
  public CWE insertTq19_Priority(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(9, index);
  }

  /**
   * Removes a repetition of Priority (TQ1-9) at a given index and returns it.
   * @param index The index
   */
  public CWE removeTq19_Priority(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(9, index);
  }

  /**
   * Returns Condition text (TQ1-10).
   */
  public TX getConditionText()  {
    TX ret = null;
    try {
        Type t = this.getField(10, 0);
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
   * Returns Condition text (TQ1-10).
   */
  public TX getTq110_ConditionText()  {
    TX ret = null;
    try {
        Type t = this.getField(10, 0);
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
   * Returns Text instruction (TQ1-11).
   */
  public TX getTextInstruction()  {
    TX ret = null;
    try {
        Type t = this.getField(11, 0);
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
   * Returns Text instruction (TQ1-11).
   */
  public TX getTq111_TextInstruction()  {
    TX ret = null;
    try {
        Type t = this.getField(11, 0);
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
   * Returns Conjunction (TQ1-12).
   */
  public ID getConjunction()  {
    ID ret = null;
    try {
        Type t = this.getField(12, 0);
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
   * Returns Conjunction (TQ1-12).
   */
  public ID getTq112_Conjunction()  {
    ID ret = null;
    try {
        Type t = this.getField(12, 0);
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
   * Returns Occurrence duration (TQ1-13).
   */
  public CQ getOccurrenceDuration()  {
    CQ ret = null;
    try {
        Type t = this.getField(13, 0);
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
   * Returns Occurrence duration (TQ1-13).
   */
  public CQ getTq113_OccurrenceDuration()  {
    CQ ret = null;
    try {
        Type t = this.getField(13, 0);
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
   * Returns Total occurrences (TQ1-14).
   */
  public NM getTotalOccurrences()  {
    NM ret = null;
    try {
        Type t = this.getField(14, 0);
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
   * Returns Total occurrences (TQ1-14).
   */
  public NM getTq114_TotalOccurrences()  {
    NM ret = null;
    try {
        Type t = this.getField(14, 0);
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

   protected Type createNewTypeWithoutReflection(int field) {
      switch (field) {
         case 0: return new ca.uhn.hl7v2.model.v26.datatype.SI(getMessage());
         case 1: return new ca.uhn.hl7v2.model.v26.datatype.CQ(getMessage());
         case 2: return new ca.uhn.hl7v2.model.v26.datatype.RPT(getMessage());
         case 3: return new ca.uhn.hl7v2.model.v26.datatype.TM(getMessage());
         case 4: return new ca.uhn.hl7v2.model.v26.datatype.CQ(getMessage());
         case 5: return new ca.uhn.hl7v2.model.v26.datatype.CQ(getMessage());
         case 6: return new ca.uhn.hl7v2.model.v26.datatype.DTM(getMessage());
         case 7: return new ca.uhn.hl7v2.model.v26.datatype.DTM(getMessage());
         case 8: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 9: return new ca.uhn.hl7v2.model.v26.datatype.TX(getMessage());
         case 10: return new ca.uhn.hl7v2.model.v26.datatype.TX(getMessage());
         case 11: return new ca.uhn.hl7v2.model.v26.datatype.ID(getMessage(), new Integer(472));
         case 12: return new ca.uhn.hl7v2.model.v26.datatype.CQ(getMessage());
         case 13: return new ca.uhn.hl7v2.model.v26.datatype.NM(getMessage());
         default: return null;
      }
   }

}