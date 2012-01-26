package ca.uhn.hl7v2.model.v26.segment;

import ca.uhn.hl7v2.model.*;
import ca.uhn.hl7v2.model.v26.datatype.*;
import ca.uhn.log.HapiLogFactory;
import ca.uhn.hl7v2.parser.ModelClassFactory;
import ca.uhn.hl7v2.HL7Exception;

/**
 * <p>Represents an HL7 UB2 message segment. 
 * This segment has the following fields:</p><p>
 * UB2-1: Set ID - UB2 (SI)<br> 
 * UB2-2: Co-Insurance Days (9) (ST)<br> 
 * UB2-3: Condition Code (24-30) (IS)<br> 
 * UB2-4: Covered Days (7) (ST)<br> 
 * UB2-5: Non-Covered Days (8) (ST)<br> 
 * UB2-6: Value Amount & Code (UVC)<br> 
 * UB2-7: Occurrence Code & Date (32-35) (OCD)<br> 
 * UB2-8: Occurrence Span Code/Dates (36) (OSP)<br> 
 * UB2-9: UB92 Locator 2 (State) (ST)<br> 
 * UB2-10: UB92 Locator 11 (State) (ST)<br> 
 * UB2-11: UB92 Locator 31 (National) (ST)<br> 
 * UB2-12: Document Control Number (ST)<br> 
 * UB2-13: UB92 Locator 49 (National) (ST)<br> 
 * UB2-14: UB92 Locator 56 (State) (ST)<br> 
 * UB2-15: UB92 Locator 57 (National) (ST)<br> 
 * UB2-16: UB92 Locator 78 (State) (ST)<br> 
 * UB2-17: Special Visit Count (NM)<br> 
 * </p><p>The get...() methods return data from individual fields.  These methods 
 * do not throw exceptions and may therefore have to handle exceptions internally.  
 * If an exception is handled internally, it is logged and null is returned.  
 * This is not expected to happen - if it does happen this indicates not so much 
 * an exceptional circumstance as a bug in the code for this class.</p>    
 */
public class UB2 extends AbstractSegment  {

  /**
   * Creates a UB2 (UB92 Data) segment object that belongs to the given 
   * message.  
   */
  public UB2(Group parent, ModelClassFactory factory) {
    super(parent, factory);
    Message message = getMessage();
    try {
       this.add(SI.class, false, 1, 4, new Object[]{message}, "Set ID - UB2");
       this.add(ST.class, false, 1, 3, new Object[]{message}, "Co-Insurance Days (9)");
       this.add(IS.class, false, 7, 2, new Object[]{message, new Integer(43)}, "Condition Code (24-30)");
       this.add(ST.class, false, 1, 3, new Object[]{message}, "Covered Days (7)");
       this.add(ST.class, false, 1, 4, new Object[]{message}, "Non-Covered Days (8)");
       this.add(UVC.class, false, 12, 41, new Object[]{message}, "Value Amount & Code");
       this.add(OCD.class, false, 8, 259, new Object[]{message}, "Occurrence Code & Date (32-35)");
       this.add(OSP.class, false, 2, 268, new Object[]{message}, "Occurrence Span Code/Dates (36)");
       this.add(ST.class, false, 2, 29, new Object[]{message}, "UB92 Locator 2 (State)");
       this.add(ST.class, false, 2, 12, new Object[]{message}, "UB92 Locator 11 (State)");
       this.add(ST.class, false, 1, 5, new Object[]{message}, "UB92 Locator 31 (National)");
       this.add(ST.class, false, 3, 23, new Object[]{message}, "Document Control Number");
       this.add(ST.class, false, 23, 4, new Object[]{message}, "UB92 Locator 49 (National)");
       this.add(ST.class, false, 5, 14, new Object[]{message}, "UB92 Locator 56 (State)");
       this.add(ST.class, false, 1, 27, new Object[]{message}, "UB92 Locator 57 (National)");
       this.add(ST.class, false, 2, 2, new Object[]{message}, "UB92 Locator 78 (State)");
       this.add(NM.class, false, 1, 3, new Object[]{message}, "Special Visit Count");
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Can't instantiate " + this.getClass().getName(), he);
    }
  }

  /**
   * Returns Set ID - UB2 (UB2-1).
   */
  public SI getSetIDUB2()  {
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
   * Returns Set ID - UB2 (UB2-1).
   */
  public SI getUb21_SetIDUB2()  {
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
   * Returns Co-Insurance Days (9) (UB2-2).
   */
  public ST getCoInsuranceDays9()  {
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
   * Returns Co-Insurance Days (9) (UB2-2).
   */
  public ST getUb22_CoInsuranceDays9()  {
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
   * Returns a single repetition of Condition Code (24-30) (UB2-3).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public IS getConditionCode2430(int rep) throws HL7Exception {
    IS ret = null;
    try {
        Type t = this.getField(3, rep);
        ret = (IS)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Condition Code (24-30) (UB2-3).
   */
  public IS[] getConditionCode2430() {
     IS[] ret = null;
    try {
        Type[] t = this.getField(3);  
        ret = new IS[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (IS)t[i];
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
   * Returns a count of the number of repetitions of Condition Code (24-30) (UB2-3).
   */
  public int getConditionCode2430Reps() {
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
   * Inserts a repetition of Condition Code (24-30) (UB2-3) at a given index and returns it.
   * @param index The index
   */
  public IS insertConditionCode2430(int index) throws HL7Exception {
     return (IS) super.insertRepetition(3, index);
  }

  /**
   * Removes a repetition of Condition Code (24-30) (UB2-3) at a given index and returns it.
   * @param index The index
   */
  public IS removeConditionCode2430(int index) throws HL7Exception {
     return (IS) super.removeRepetition(3, index);
  }

  /**
   * Returns a single repetition of Condition Code (24-30) (UB2-3).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public IS getUb23_ConditionCode2430(int rep) throws HL7Exception {
    IS ret = null;
    try {
        Type t = this.getField(3, rep);
        ret = (IS)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Condition Code (24-30) (UB2-3).
   */
  public IS[] getUb23_ConditionCode2430() {
     IS[] ret = null;
    try {
        Type[] t = this.getField(3);  
        ret = new IS[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (IS)t[i];
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
   * Returns a count of the number of repetitions of Condition Code (24-30) (UB2-3).
   */
  public int getUb23_ConditionCode2430Reps() {
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
   * Inserts a repetition of Condition Code (24-30) (UB2-3) at a given index and returns it.
   * @param index The index
   */
  public IS insertUb23_ConditionCode2430(int index) throws HL7Exception {
     return (IS) super.insertRepetition(3, index);
  }

  /**
   * Removes a repetition of Condition Code (24-30) (UB2-3) at a given index and returns it.
   * @param index The index
   */
  public IS removeUb23_ConditionCode2430(int index) throws HL7Exception {
     return (IS) super.removeRepetition(3, index);
  }

  /**
   * Returns Covered Days (7) (UB2-4).
   */
  public ST getCoveredDays7()  {
    ST ret = null;
    try {
        Type t = this.getField(4, 0);
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
   * Returns Covered Days (7) (UB2-4).
   */
  public ST getUb24_CoveredDays7()  {
    ST ret = null;
    try {
        Type t = this.getField(4, 0);
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
   * Returns Non-Covered Days (8) (UB2-5).
   */
  public ST getNonCoveredDays8()  {
    ST ret = null;
    try {
        Type t = this.getField(5, 0);
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
   * Returns Non-Covered Days (8) (UB2-5).
   */
  public ST getUb25_NonCoveredDays8()  {
    ST ret = null;
    try {
        Type t = this.getField(5, 0);
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
   * Returns a single repetition of Value Amount & Code (UB2-6).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public UVC getValueAmountCode(int rep) throws HL7Exception {
    UVC ret = null;
    try {
        Type t = this.getField(6, rep);
        ret = (UVC)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Value Amount & Code (UB2-6).
   */
  public UVC[] getValueAmountCode() {
     UVC[] ret = null;
    try {
        Type[] t = this.getField(6);  
        ret = new UVC[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (UVC)t[i];
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
   * Returns a count of the number of repetitions of Value Amount & Code (UB2-6).
   */
  public int getValueAmountCodeReps() {
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
   * Inserts a repetition of Value Amount & Code (UB2-6) at a given index and returns it.
   * @param index The index
   */
  public UVC insertValueAmountCode(int index) throws HL7Exception {
     return (UVC) super.insertRepetition(6, index);
  }

  /**
   * Removes a repetition of Value Amount & Code (UB2-6) at a given index and returns it.
   * @param index The index
   */
  public UVC removeValueAmountCode(int index) throws HL7Exception {
     return (UVC) super.removeRepetition(6, index);
  }

  /**
   * Returns a single repetition of Value Amount & Code (UB2-6).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public UVC getUb26_ValueAmountCode(int rep) throws HL7Exception {
    UVC ret = null;
    try {
        Type t = this.getField(6, rep);
        ret = (UVC)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Value Amount & Code (UB2-6).
   */
  public UVC[] getUb26_ValueAmountCode() {
     UVC[] ret = null;
    try {
        Type[] t = this.getField(6);  
        ret = new UVC[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (UVC)t[i];
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
   * Returns a count of the number of repetitions of Value Amount & Code (UB2-6).
   */
  public int getUb26_ValueAmountCodeReps() {
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
   * Inserts a repetition of Value Amount & Code (UB2-6) at a given index and returns it.
   * @param index The index
   */
  public UVC insertUb26_ValueAmountCode(int index) throws HL7Exception {
     return (UVC) super.insertRepetition(6, index);
  }

  /**
   * Removes a repetition of Value Amount & Code (UB2-6) at a given index and returns it.
   * @param index The index
   */
  public UVC removeUb26_ValueAmountCode(int index) throws HL7Exception {
     return (UVC) super.removeRepetition(6, index);
  }

  /**
   * Returns a single repetition of Occurrence Code & Date (32-35) (UB2-7).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public OCD getOccurrenceCodeDate3235(int rep) throws HL7Exception {
    OCD ret = null;
    try {
        Type t = this.getField(7, rep);
        ret = (OCD)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Occurrence Code & Date (32-35) (UB2-7).
   */
  public OCD[] getOccurrenceCodeDate3235() {
     OCD[] ret = null;
    try {
        Type[] t = this.getField(7);  
        ret = new OCD[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (OCD)t[i];
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
   * Returns a count of the number of repetitions of Occurrence Code & Date (32-35) (UB2-7).
   */
  public int getOccurrenceCodeDate3235Reps() {
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
   * Inserts a repetition of Occurrence Code & Date (32-35) (UB2-7) at a given index and returns it.
   * @param index The index
   */
  public OCD insertOccurrenceCodeDate3235(int index) throws HL7Exception {
     return (OCD) super.insertRepetition(7, index);
  }

  /**
   * Removes a repetition of Occurrence Code & Date (32-35) (UB2-7) at a given index and returns it.
   * @param index The index
   */
  public OCD removeOccurrenceCodeDate3235(int index) throws HL7Exception {
     return (OCD) super.removeRepetition(7, index);
  }

  /**
   * Returns a single repetition of Occurrence Code & Date (32-35) (UB2-7).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public OCD getUb27_OccurrenceCodeDate3235(int rep) throws HL7Exception {
    OCD ret = null;
    try {
        Type t = this.getField(7, rep);
        ret = (OCD)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Occurrence Code & Date (32-35) (UB2-7).
   */
  public OCD[] getUb27_OccurrenceCodeDate3235() {
     OCD[] ret = null;
    try {
        Type[] t = this.getField(7);  
        ret = new OCD[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (OCD)t[i];
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
   * Returns a count of the number of repetitions of Occurrence Code & Date (32-35) (UB2-7).
   */
  public int getUb27_OccurrenceCodeDate3235Reps() {
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
   * Inserts a repetition of Occurrence Code & Date (32-35) (UB2-7) at a given index and returns it.
   * @param index The index
   */
  public OCD insertUb27_OccurrenceCodeDate3235(int index) throws HL7Exception {
     return (OCD) super.insertRepetition(7, index);
  }

  /**
   * Removes a repetition of Occurrence Code & Date (32-35) (UB2-7) at a given index and returns it.
   * @param index The index
   */
  public OCD removeUb27_OccurrenceCodeDate3235(int index) throws HL7Exception {
     return (OCD) super.removeRepetition(7, index);
  }

  /**
   * Returns a single repetition of Occurrence Span Code/Dates (36) (UB2-8).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public OSP getOccurrenceSpanCodeDates(int rep) throws HL7Exception {
    OSP ret = null;
    try {
        Type t = this.getField(8, rep);
        ret = (OSP)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Occurrence Span Code/Dates (36) (UB2-8).
   */
  public OSP[] getOccurrenceSpanCodeDates() {
     OSP[] ret = null;
    try {
        Type[] t = this.getField(8);  
        ret = new OSP[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (OSP)t[i];
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
   * Returns a count of the number of repetitions of Occurrence Span Code/Dates (36) (UB2-8).
   */
  public int getOccurrenceSpanCodeDatesReps() {
    try {
        return this.getField(8).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Occurrence Span Code/Dates (36) (UB2-8) at a given index and returns it.
   * @param index The index
   */
  public OSP insertOccurrenceSpanCodeDates(int index) throws HL7Exception {
     return (OSP) super.insertRepetition(8, index);
  }

  /**
   * Removes a repetition of Occurrence Span Code/Dates (36) (UB2-8) at a given index and returns it.
   * @param index The index
   */
  public OSP removeOccurrenceSpanCodeDates(int index) throws HL7Exception {
     return (OSP) super.removeRepetition(8, index);
  }

  /**
   * Returns a single repetition of Occurrence Span Code/Dates (36) (UB2-8).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public OSP getUb28_OccurrenceSpanCodeDates(int rep) throws HL7Exception {
    OSP ret = null;
    try {
        Type t = this.getField(8, rep);
        ret = (OSP)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Occurrence Span Code/Dates (36) (UB2-8).
   */
  public OSP[] getUb28_OccurrenceSpanCodeDates() {
     OSP[] ret = null;
    try {
        Type[] t = this.getField(8);  
        ret = new OSP[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (OSP)t[i];
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
   * Returns a count of the number of repetitions of Occurrence Span Code/Dates (36) (UB2-8).
   */
  public int getUb28_OccurrenceSpanCodeDatesReps() {
    try {
        return this.getField(8).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Occurrence Span Code/Dates (36) (UB2-8) at a given index and returns it.
   * @param index The index
   */
  public OSP insertUb28_OccurrenceSpanCodeDates(int index) throws HL7Exception {
     return (OSP) super.insertRepetition(8, index);
  }

  /**
   * Removes a repetition of Occurrence Span Code/Dates (36) (UB2-8) at a given index and returns it.
   * @param index The index
   */
  public OSP removeUb28_OccurrenceSpanCodeDates(int index) throws HL7Exception {
     return (OSP) super.removeRepetition(8, index);
  }

  /**
   * Returns a single repetition of UB92 Locator 2 (State) (UB2-9).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public ST getUB92Locator2State(int rep) throws HL7Exception {
    ST ret = null;
    try {
        Type t = this.getField(9, rep);
        ret = (ST)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of UB92 Locator 2 (State) (UB2-9).
   */
  public ST[] getUB92Locator2State() {
     ST[] ret = null;
    try {
        Type[] t = this.getField(9);  
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
   * Returns a count of the number of repetitions of UB92 Locator 2 (State) (UB2-9).
   */
  public int getUB92Locator2StateReps() {
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
   * Inserts a repetition of UB92 Locator 2 (State) (UB2-9) at a given index and returns it.
   * @param index The index
   */
  public ST insertUB92Locator2State(int index) throws HL7Exception {
     return (ST) super.insertRepetition(9, index);
  }

  /**
   * Removes a repetition of UB92 Locator 2 (State) (UB2-9) at a given index and returns it.
   * @param index The index
   */
  public ST removeUB92Locator2State(int index) throws HL7Exception {
     return (ST) super.removeRepetition(9, index);
  }

  /**
   * Returns a single repetition of UB92 Locator 2 (State) (UB2-9).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public ST getUb29_UB92Locator2State(int rep) throws HL7Exception {
    ST ret = null;
    try {
        Type t = this.getField(9, rep);
        ret = (ST)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of UB92 Locator 2 (State) (UB2-9).
   */
  public ST[] getUb29_UB92Locator2State() {
     ST[] ret = null;
    try {
        Type[] t = this.getField(9);  
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
   * Returns a count of the number of repetitions of UB92 Locator 2 (State) (UB2-9).
   */
  public int getUb29_UB92Locator2StateReps() {
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
   * Inserts a repetition of UB92 Locator 2 (State) (UB2-9) at a given index and returns it.
   * @param index The index
   */
  public ST insertUb29_UB92Locator2State(int index) throws HL7Exception {
     return (ST) super.insertRepetition(9, index);
  }

  /**
   * Removes a repetition of UB92 Locator 2 (State) (UB2-9) at a given index and returns it.
   * @param index The index
   */
  public ST removeUb29_UB92Locator2State(int index) throws HL7Exception {
     return (ST) super.removeRepetition(9, index);
  }

  /**
   * Returns a single repetition of UB92 Locator 11 (State) (UB2-10).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public ST getUB92Locator11State(int rep) throws HL7Exception {
    ST ret = null;
    try {
        Type t = this.getField(10, rep);
        ret = (ST)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of UB92 Locator 11 (State) (UB2-10).
   */
  public ST[] getUB92Locator11State() {
     ST[] ret = null;
    try {
        Type[] t = this.getField(10);  
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
   * Returns a count of the number of repetitions of UB92 Locator 11 (State) (UB2-10).
   */
  public int getUB92Locator11StateReps() {
    try {
        return this.getField(10).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of UB92 Locator 11 (State) (UB2-10) at a given index and returns it.
   * @param index The index
   */
  public ST insertUB92Locator11State(int index) throws HL7Exception {
     return (ST) super.insertRepetition(10, index);
  }

  /**
   * Removes a repetition of UB92 Locator 11 (State) (UB2-10) at a given index and returns it.
   * @param index The index
   */
  public ST removeUB92Locator11State(int index) throws HL7Exception {
     return (ST) super.removeRepetition(10, index);
  }

  /**
   * Returns a single repetition of UB92 Locator 11 (State) (UB2-10).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public ST getUb210_UB92Locator11State(int rep) throws HL7Exception {
    ST ret = null;
    try {
        Type t = this.getField(10, rep);
        ret = (ST)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of UB92 Locator 11 (State) (UB2-10).
   */
  public ST[] getUb210_UB92Locator11State() {
     ST[] ret = null;
    try {
        Type[] t = this.getField(10);  
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
   * Returns a count of the number of repetitions of UB92 Locator 11 (State) (UB2-10).
   */
  public int getUb210_UB92Locator11StateReps() {
    try {
        return this.getField(10).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of UB92 Locator 11 (State) (UB2-10) at a given index and returns it.
   * @param index The index
   */
  public ST insertUb210_UB92Locator11State(int index) throws HL7Exception {
     return (ST) super.insertRepetition(10, index);
  }

  /**
   * Removes a repetition of UB92 Locator 11 (State) (UB2-10) at a given index and returns it.
   * @param index The index
   */
  public ST removeUb210_UB92Locator11State(int index) throws HL7Exception {
     return (ST) super.removeRepetition(10, index);
  }

  /**
   * Returns UB92 Locator 31 (National) (UB2-11).
   */
  public ST getUB92Locator31National()  {
    ST ret = null;
    try {
        Type t = this.getField(11, 0);
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
   * Returns UB92 Locator 31 (National) (UB2-11).
   */
  public ST getUb211_UB92Locator31National()  {
    ST ret = null;
    try {
        Type t = this.getField(11, 0);
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
   * Returns a single repetition of Document Control Number (UB2-12).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public ST getDocumentControlNumber(int rep) throws HL7Exception {
    ST ret = null;
    try {
        Type t = this.getField(12, rep);
        ret = (ST)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Document Control Number (UB2-12).
   */
  public ST[] getDocumentControlNumber() {
     ST[] ret = null;
    try {
        Type[] t = this.getField(12);  
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
   * Returns a count of the number of repetitions of Document Control Number (UB2-12).
   */
  public int getDocumentControlNumberReps() {
    try {
        return this.getField(12).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Document Control Number (UB2-12) at a given index and returns it.
   * @param index The index
   */
  public ST insertDocumentControlNumber(int index) throws HL7Exception {
     return (ST) super.insertRepetition(12, index);
  }

  /**
   * Removes a repetition of Document Control Number (UB2-12) at a given index and returns it.
   * @param index The index
   */
  public ST removeDocumentControlNumber(int index) throws HL7Exception {
     return (ST) super.removeRepetition(12, index);
  }

  /**
   * Returns a single repetition of Document Control Number (UB2-12).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public ST getUb212_DocumentControlNumber(int rep) throws HL7Exception {
    ST ret = null;
    try {
        Type t = this.getField(12, rep);
        ret = (ST)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Document Control Number (UB2-12).
   */
  public ST[] getUb212_DocumentControlNumber() {
     ST[] ret = null;
    try {
        Type[] t = this.getField(12);  
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
   * Returns a count of the number of repetitions of Document Control Number (UB2-12).
   */
  public int getUb212_DocumentControlNumberReps() {
    try {
        return this.getField(12).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Document Control Number (UB2-12) at a given index and returns it.
   * @param index The index
   */
  public ST insertUb212_DocumentControlNumber(int index) throws HL7Exception {
     return (ST) super.insertRepetition(12, index);
  }

  /**
   * Removes a repetition of Document Control Number (UB2-12) at a given index and returns it.
   * @param index The index
   */
  public ST removeUb212_DocumentControlNumber(int index) throws HL7Exception {
     return (ST) super.removeRepetition(12, index);
  }

  /**
   * Returns a single repetition of UB92 Locator 49 (National) (UB2-13).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public ST getUB92Locator49National(int rep) throws HL7Exception {
    ST ret = null;
    try {
        Type t = this.getField(13, rep);
        ret = (ST)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of UB92 Locator 49 (National) (UB2-13).
   */
  public ST[] getUB92Locator49National() {
     ST[] ret = null;
    try {
        Type[] t = this.getField(13);  
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
   * Returns a count of the number of repetitions of UB92 Locator 49 (National) (UB2-13).
   */
  public int getUB92Locator49NationalReps() {
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
   * Inserts a repetition of UB92 Locator 49 (National) (UB2-13) at a given index and returns it.
   * @param index The index
   */
  public ST insertUB92Locator49National(int index) throws HL7Exception {
     return (ST) super.insertRepetition(13, index);
  }

  /**
   * Removes a repetition of UB92 Locator 49 (National) (UB2-13) at a given index and returns it.
   * @param index The index
   */
  public ST removeUB92Locator49National(int index) throws HL7Exception {
     return (ST) super.removeRepetition(13, index);
  }

  /**
   * Returns a single repetition of UB92 Locator 49 (National) (UB2-13).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public ST getUb213_UB92Locator49National(int rep) throws HL7Exception {
    ST ret = null;
    try {
        Type t = this.getField(13, rep);
        ret = (ST)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of UB92 Locator 49 (National) (UB2-13).
   */
  public ST[] getUb213_UB92Locator49National() {
     ST[] ret = null;
    try {
        Type[] t = this.getField(13);  
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
   * Returns a count of the number of repetitions of UB92 Locator 49 (National) (UB2-13).
   */
  public int getUb213_UB92Locator49NationalReps() {
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
   * Inserts a repetition of UB92 Locator 49 (National) (UB2-13) at a given index and returns it.
   * @param index The index
   */
  public ST insertUb213_UB92Locator49National(int index) throws HL7Exception {
     return (ST) super.insertRepetition(13, index);
  }

  /**
   * Removes a repetition of UB92 Locator 49 (National) (UB2-13) at a given index and returns it.
   * @param index The index
   */
  public ST removeUb213_UB92Locator49National(int index) throws HL7Exception {
     return (ST) super.removeRepetition(13, index);
  }

  /**
   * Returns a single repetition of UB92 Locator 56 (State) (UB2-14).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public ST getUB92Locator56State(int rep) throws HL7Exception {
    ST ret = null;
    try {
        Type t = this.getField(14, rep);
        ret = (ST)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of UB92 Locator 56 (State) (UB2-14).
   */
  public ST[] getUB92Locator56State() {
     ST[] ret = null;
    try {
        Type[] t = this.getField(14);  
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
   * Returns a count of the number of repetitions of UB92 Locator 56 (State) (UB2-14).
   */
  public int getUB92Locator56StateReps() {
    try {
        return this.getField(14).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of UB92 Locator 56 (State) (UB2-14) at a given index and returns it.
   * @param index The index
   */
  public ST insertUB92Locator56State(int index) throws HL7Exception {
     return (ST) super.insertRepetition(14, index);
  }

  /**
   * Removes a repetition of UB92 Locator 56 (State) (UB2-14) at a given index and returns it.
   * @param index The index
   */
  public ST removeUB92Locator56State(int index) throws HL7Exception {
     return (ST) super.removeRepetition(14, index);
  }

  /**
   * Returns a single repetition of UB92 Locator 56 (State) (UB2-14).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public ST getUb214_UB92Locator56State(int rep) throws HL7Exception {
    ST ret = null;
    try {
        Type t = this.getField(14, rep);
        ret = (ST)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of UB92 Locator 56 (State) (UB2-14).
   */
  public ST[] getUb214_UB92Locator56State() {
     ST[] ret = null;
    try {
        Type[] t = this.getField(14);  
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
   * Returns a count of the number of repetitions of UB92 Locator 56 (State) (UB2-14).
   */
  public int getUb214_UB92Locator56StateReps() {
    try {
        return this.getField(14).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of UB92 Locator 56 (State) (UB2-14) at a given index and returns it.
   * @param index The index
   */
  public ST insertUb214_UB92Locator56State(int index) throws HL7Exception {
     return (ST) super.insertRepetition(14, index);
  }

  /**
   * Removes a repetition of UB92 Locator 56 (State) (UB2-14) at a given index and returns it.
   * @param index The index
   */
  public ST removeUb214_UB92Locator56State(int index) throws HL7Exception {
     return (ST) super.removeRepetition(14, index);
  }

  /**
   * Returns UB92 Locator 57 (National) (UB2-15).
   */
  public ST getUB92Locator57National()  {
    ST ret = null;
    try {
        Type t = this.getField(15, 0);
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
   * Returns UB92 Locator 57 (National) (UB2-15).
   */
  public ST getUb215_UB92Locator57National()  {
    ST ret = null;
    try {
        Type t = this.getField(15, 0);
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
   * Returns a single repetition of UB92 Locator 78 (State) (UB2-16).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public ST getUB92Locator78State(int rep) throws HL7Exception {
    ST ret = null;
    try {
        Type t = this.getField(16, rep);
        ret = (ST)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of UB92 Locator 78 (State) (UB2-16).
   */
  public ST[] getUB92Locator78State() {
     ST[] ret = null;
    try {
        Type[] t = this.getField(16);  
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
   * Returns a count of the number of repetitions of UB92 Locator 78 (State) (UB2-16).
   */
  public int getUB92Locator78StateReps() {
    try {
        return this.getField(16).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of UB92 Locator 78 (State) (UB2-16) at a given index and returns it.
   * @param index The index
   */
  public ST insertUB92Locator78State(int index) throws HL7Exception {
     return (ST) super.insertRepetition(16, index);
  }

  /**
   * Removes a repetition of UB92 Locator 78 (State) (UB2-16) at a given index and returns it.
   * @param index The index
   */
  public ST removeUB92Locator78State(int index) throws HL7Exception {
     return (ST) super.removeRepetition(16, index);
  }

  /**
   * Returns a single repetition of UB92 Locator 78 (State) (UB2-16).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public ST getUb216_UB92Locator78State(int rep) throws HL7Exception {
    ST ret = null;
    try {
        Type t = this.getField(16, rep);
        ret = (ST)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of UB92 Locator 78 (State) (UB2-16).
   */
  public ST[] getUb216_UB92Locator78State() {
     ST[] ret = null;
    try {
        Type[] t = this.getField(16);  
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
   * Returns a count of the number of repetitions of UB92 Locator 78 (State) (UB2-16).
   */
  public int getUb216_UB92Locator78StateReps() {
    try {
        return this.getField(16).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of UB92 Locator 78 (State) (UB2-16) at a given index and returns it.
   * @param index The index
   */
  public ST insertUb216_UB92Locator78State(int index) throws HL7Exception {
     return (ST) super.insertRepetition(16, index);
  }

  /**
   * Removes a repetition of UB92 Locator 78 (State) (UB2-16) at a given index and returns it.
   * @param index The index
   */
  public ST removeUb216_UB92Locator78State(int index) throws HL7Exception {
     return (ST) super.removeRepetition(16, index);
  }

  /**
   * Returns Special Visit Count (UB2-17).
   */
  public NM getSpecialVisitCount()  {
    NM ret = null;
    try {
        Type t = this.getField(17, 0);
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
   * Returns Special Visit Count (UB2-17).
   */
  public NM getUb217_SpecialVisitCount()  {
    NM ret = null;
    try {
        Type t = this.getField(17, 0);
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
         case 1: return new ca.uhn.hl7v2.model.v26.datatype.ST(getMessage());
         case 2: return new ca.uhn.hl7v2.model.v26.datatype.IS(getMessage(), new Integer(43));
         case 3: return new ca.uhn.hl7v2.model.v26.datatype.ST(getMessage());
         case 4: return new ca.uhn.hl7v2.model.v26.datatype.ST(getMessage());
         case 5: return new ca.uhn.hl7v2.model.v26.datatype.UVC(getMessage());
         case 6: return new ca.uhn.hl7v2.model.v26.datatype.OCD(getMessage());
         case 7: return new ca.uhn.hl7v2.model.v26.datatype.OSP(getMessage());
         case 8: return new ca.uhn.hl7v2.model.v26.datatype.ST(getMessage());
         case 9: return new ca.uhn.hl7v2.model.v26.datatype.ST(getMessage());
         case 10: return new ca.uhn.hl7v2.model.v26.datatype.ST(getMessage());
         case 11: return new ca.uhn.hl7v2.model.v26.datatype.ST(getMessage());
         case 12: return new ca.uhn.hl7v2.model.v26.datatype.ST(getMessage());
         case 13: return new ca.uhn.hl7v2.model.v26.datatype.ST(getMessage());
         case 14: return new ca.uhn.hl7v2.model.v26.datatype.ST(getMessage());
         case 15: return new ca.uhn.hl7v2.model.v26.datatype.ST(getMessage());
         case 16: return new ca.uhn.hl7v2.model.v26.datatype.NM(getMessage());
         default: return null;
      }
   }

}