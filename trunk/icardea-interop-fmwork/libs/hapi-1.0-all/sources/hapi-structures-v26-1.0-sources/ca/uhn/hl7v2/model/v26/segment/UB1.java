package ca.uhn.hl7v2.model.v26.segment;

import ca.uhn.hl7v2.model.*;
import ca.uhn.hl7v2.model.v26.datatype.*;
import ca.uhn.log.HapiLogFactory;
import ca.uhn.hl7v2.parser.ModelClassFactory;
import ca.uhn.hl7v2.HL7Exception;

/**
 * <p>Represents an HL7 UB1 message segment. 
 * This segment has the following fields:</p><p>
 * UB1-1: Set ID - UB1 (SI)<br> 
 * UB1-2: Blood Deductible (-)<br> 
 * UB1-3: Blood Furnished-Pints (NM)<br> 
 * UB1-4: Blood Replaced-Pints (NM)<br> 
 * UB1-5: Blood Not Replaced-Pints (NM)<br> 
 * UB1-6: Co-Insurance Days (NM)<br> 
 * UB1-7: Condition Code (IS)<br> 
 * UB1-8: Covered Days (NM)<br> 
 * UB1-9: Non Covered Days (NM)<br> 
 * UB1-10: Value Amount & Code (UVC)<br> 
 * UB1-11: Number Of Grace Days (NM)<br> 
 * UB1-12: Special Program Indicator (CWE)<br> 
 * UB1-13: PSRO/UR Approval Indicator (CWE)<br> 
 * UB1-14: PSRO/UR Approved Stay-Fm (DT)<br> 
 * UB1-15: PSRO/UR Approved Stay-To (DT)<br> 
 * UB1-16: Occurrence (OCD)<br> 
 * UB1-17: Occurrence Span (CWE)<br> 
 * UB1-18: Occur Span Start Date (DT)<br> 
 * UB1-19: Occur Span End Date (DT)<br> 
 * UB1-20: UB-82 Locator 2 (ST)<br> 
 * UB1-21: UB-82 Locator 9 (ST)<br> 
 * UB1-22: UB-82 Locator 27 (ST)<br> 
 * UB1-23: UB-82 Locator 45 (ST)<br> 
 * </p><p>The get...() methods return data from individual fields.  These methods 
 * do not throw exceptions and may therefore have to handle exceptions internally.  
 * If an exception is handled internally, it is logged and null is returned.  
 * This is not expected to happen - if it does happen this indicates not so much 
 * an exceptional circumstance as a bug in the code for this class.</p>    
 */
public class UB1 extends AbstractSegment  {

  /**
   * Creates a UB1 (UB82) segment object that belongs to the given 
   * message.  
   */
  public UB1(Group parent, ModelClassFactory factory) {
    super(parent, factory);
    Message message = getMessage();
    try {
       this.add(SI.class, false, 1, 4, new Object[]{message}, "Set ID - UB1");
       this.add(NULLDT.class, false, 1, 0, new Object[]{message}, "Blood Deductible");
       this.add(NM.class, false, 1, 2, new Object[]{message}, "Blood Furnished-Pints");
       this.add(NM.class, false, 1, 2, new Object[]{message}, "Blood Replaced-Pints");
       this.add(NM.class, false, 1, 2, new Object[]{message}, "Blood Not Replaced-Pints");
       this.add(NM.class, false, 1, 0, new Object[]{message}, "Co-Insurance Days");
       this.add(IS.class, false, 5, 0, new Object[]{message, new Integer(43)}, "Condition Code");
       this.add(NM.class, false, 1, 0, new Object[]{message}, "Covered Days");
       this.add(NM.class, false, 1, 0, new Object[]{message}, "Non Covered Days");
       this.add(UVC.class, false, 8, 0, new Object[]{message}, "Value Amount & Code");
       this.add(NM.class, false, 1, 2, new Object[]{message}, "Number Of Grace Days");
       this.add(CWE.class, false, 1, 250, new Object[]{message}, "Special Program Indicator");
       this.add(CWE.class, false, 1, 250, new Object[]{message}, "PSRO/UR Approval Indicator");
       this.add(DT.class, false, 1, 8, new Object[]{message}, "PSRO/UR Approved Stay-Fm");
       this.add(DT.class, false, 1, 8, new Object[]{message}, "PSRO/UR Approved Stay-To");
       this.add(OCD.class, false, 5, 0, new Object[]{message}, "Occurrence");
       this.add(CWE.class, false, 1, 0, new Object[]{message}, "Occurrence Span");
       this.add(DT.class, false, 1, 0, new Object[]{message}, "Occur Span Start Date");
       this.add(DT.class, false, 1, 0, new Object[]{message}, "Occur Span End Date");
       this.add(ST.class, false, 1, 0, new Object[]{message}, "UB-82 Locator 2");
       this.add(ST.class, false, 1, 0, new Object[]{message}, "UB-82 Locator 9");
       this.add(ST.class, false, 1, 0, new Object[]{message}, "UB-82 Locator 27");
       this.add(ST.class, false, 1, 0, new Object[]{message}, "UB-82 Locator 45");
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Can't instantiate " + this.getClass().getName(), he);
    }
  }

  /**
   * Returns Set ID - UB1 (UB1-1).
   */
  public SI getSetIDUB1()  {
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
   * Returns Set ID - UB1 (UB1-1).
   */
  public SI getUb11_SetIDUB1()  {
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
   * Returns Blood Deductible (UB1-2).
   */
  public NULLDT getBloodDeductible()  {
    NULLDT ret = null;
    try {
        Type t = this.getField(2, 0);
        ret = (NULLDT)t;
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
   * Returns Blood Deductible (UB1-2).
   */
  public NULLDT getUb12_BloodDeductible()  {
    NULLDT ret = null;
    try {
        Type t = this.getField(2, 0);
        ret = (NULLDT)t;
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
   * Returns Blood Furnished-Pints (UB1-3).
   */
  public NM getBloodFurnishedPints()  {
    NM ret = null;
    try {
        Type t = this.getField(3, 0);
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
   * Returns Blood Furnished-Pints (UB1-3).
   */
  public NM getUb13_BloodFurnishedPints()  {
    NM ret = null;
    try {
        Type t = this.getField(3, 0);
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
   * Returns Blood Replaced-Pints (UB1-4).
   */
  public NM getBloodReplacedPints()  {
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
   * Returns Blood Replaced-Pints (UB1-4).
   */
  public NM getUb14_BloodReplacedPints()  {
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
   * Returns Blood Not Replaced-Pints (UB1-5).
   */
  public NM getBloodNotReplacedPints()  {
    NM ret = null;
    try {
        Type t = this.getField(5, 0);
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
   * Returns Blood Not Replaced-Pints (UB1-5).
   */
  public NM getUb15_BloodNotReplacedPints()  {
    NM ret = null;
    try {
        Type t = this.getField(5, 0);
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
   * Returns Co-Insurance Days (UB1-6).
   */
  public NM getCoInsuranceDays()  {
    NM ret = null;
    try {
        Type t = this.getField(6, 0);
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
   * Returns Co-Insurance Days (UB1-6).
   */
  public NM getUb16_CoInsuranceDays()  {
    NM ret = null;
    try {
        Type t = this.getField(6, 0);
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
   * Returns a single repetition of Condition Code (UB1-7).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public IS getConditionCode(int rep) throws HL7Exception {
    IS ret = null;
    try {
        Type t = this.getField(7, rep);
        ret = (IS)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Condition Code (UB1-7).
   */
  public IS[] getConditionCode() {
     IS[] ret = null;
    try {
        Type[] t = this.getField(7);  
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
   * Returns a count of the number of repetitions of Condition Code (UB1-7).
   */
  public int getConditionCodeReps() {
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
   * Inserts a repetition of Condition Code (UB1-7) at a given index and returns it.
   * @param index The index
   */
  public IS insertConditionCode(int index) throws HL7Exception {
     return (IS) super.insertRepetition(7, index);
  }

  /**
   * Removes a repetition of Condition Code (UB1-7) at a given index and returns it.
   * @param index The index
   */
  public IS removeConditionCode(int index) throws HL7Exception {
     return (IS) super.removeRepetition(7, index);
  }

  /**
   * Returns a single repetition of Condition Code (UB1-7).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public IS getUb17_ConditionCode(int rep) throws HL7Exception {
    IS ret = null;
    try {
        Type t = this.getField(7, rep);
        ret = (IS)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Condition Code (UB1-7).
   */
  public IS[] getUb17_ConditionCode() {
     IS[] ret = null;
    try {
        Type[] t = this.getField(7);  
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
   * Returns a count of the number of repetitions of Condition Code (UB1-7).
   */
  public int getUb17_ConditionCodeReps() {
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
   * Inserts a repetition of Condition Code (UB1-7) at a given index and returns it.
   * @param index The index
   */
  public IS insertUb17_ConditionCode(int index) throws HL7Exception {
     return (IS) super.insertRepetition(7, index);
  }

  /**
   * Removes a repetition of Condition Code (UB1-7) at a given index and returns it.
   * @param index The index
   */
  public IS removeUb17_ConditionCode(int index) throws HL7Exception {
     return (IS) super.removeRepetition(7, index);
  }

  /**
   * Returns Covered Days (UB1-8).
   */
  public NM getCoveredDays()  {
    NM ret = null;
    try {
        Type t = this.getField(8, 0);
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
   * Returns Covered Days (UB1-8).
   */
  public NM getUb18_CoveredDays()  {
    NM ret = null;
    try {
        Type t = this.getField(8, 0);
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
   * Returns Non Covered Days (UB1-9).
   */
  public NM getNonCoveredDays()  {
    NM ret = null;
    try {
        Type t = this.getField(9, 0);
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
   * Returns Non Covered Days (UB1-9).
   */
  public NM getUb19_NonCoveredDays()  {
    NM ret = null;
    try {
        Type t = this.getField(9, 0);
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
   * Returns a single repetition of Value Amount & Code (UB1-10).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public UVC getValueAmountCode(int rep) throws HL7Exception {
    UVC ret = null;
    try {
        Type t = this.getField(10, rep);
        ret = (UVC)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Value Amount & Code (UB1-10).
   */
  public UVC[] getValueAmountCode() {
     UVC[] ret = null;
    try {
        Type[] t = this.getField(10);  
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
   * Returns a count of the number of repetitions of Value Amount & Code (UB1-10).
   */
  public int getValueAmountCodeReps() {
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
   * Inserts a repetition of Value Amount & Code (UB1-10) at a given index and returns it.
   * @param index The index
   */
  public UVC insertValueAmountCode(int index) throws HL7Exception {
     return (UVC) super.insertRepetition(10, index);
  }

  /**
   * Removes a repetition of Value Amount & Code (UB1-10) at a given index and returns it.
   * @param index The index
   */
  public UVC removeValueAmountCode(int index) throws HL7Exception {
     return (UVC) super.removeRepetition(10, index);
  }

  /**
   * Returns a single repetition of Value Amount & Code (UB1-10).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public UVC getUb110_ValueAmountCode(int rep) throws HL7Exception {
    UVC ret = null;
    try {
        Type t = this.getField(10, rep);
        ret = (UVC)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Value Amount & Code (UB1-10).
   */
  public UVC[] getUb110_ValueAmountCode() {
     UVC[] ret = null;
    try {
        Type[] t = this.getField(10);  
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
   * Returns a count of the number of repetitions of Value Amount & Code (UB1-10).
   */
  public int getUb110_ValueAmountCodeReps() {
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
   * Inserts a repetition of Value Amount & Code (UB1-10) at a given index and returns it.
   * @param index The index
   */
  public UVC insertUb110_ValueAmountCode(int index) throws HL7Exception {
     return (UVC) super.insertRepetition(10, index);
  }

  /**
   * Removes a repetition of Value Amount & Code (UB1-10) at a given index and returns it.
   * @param index The index
   */
  public UVC removeUb110_ValueAmountCode(int index) throws HL7Exception {
     return (UVC) super.removeRepetition(10, index);
  }

  /**
   * Returns Number Of Grace Days (UB1-11).
   */
  public NM getNumberOfGraceDays()  {
    NM ret = null;
    try {
        Type t = this.getField(11, 0);
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
   * Returns Number Of Grace Days (UB1-11).
   */
  public NM getUb111_NumberOfGraceDays()  {
    NM ret = null;
    try {
        Type t = this.getField(11, 0);
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
   * Returns Special Program Indicator (UB1-12).
   */
  public CWE getSpecialProgramIndicator()  {
    CWE ret = null;
    try {
        Type t = this.getField(12, 0);
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
   * Returns Special Program Indicator (UB1-12).
   */
  public CWE getUb112_SpecialProgramIndicator()  {
    CWE ret = null;
    try {
        Type t = this.getField(12, 0);
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
   * Returns PSRO/UR Approval Indicator (UB1-13).
   */
  public CWE getPSROURApprovalIndicator()  {
    CWE ret = null;
    try {
        Type t = this.getField(13, 0);
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
   * Returns PSRO/UR Approval Indicator (UB1-13).
   */
  public CWE getUb113_PSROURApprovalIndicator()  {
    CWE ret = null;
    try {
        Type t = this.getField(13, 0);
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
   * Returns PSRO/UR Approved Stay-Fm (UB1-14).
   */
  public DT getPSROURApprovedStayFm()  {
    DT ret = null;
    try {
        Type t = this.getField(14, 0);
        ret = (DT)t;
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
   * Returns PSRO/UR Approved Stay-Fm (UB1-14).
   */
  public DT getUb114_PSROURApprovedStayFm()  {
    DT ret = null;
    try {
        Type t = this.getField(14, 0);
        ret = (DT)t;
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
   * Returns PSRO/UR Approved Stay-To (UB1-15).
   */
  public DT getPSROURApprovedStayTo()  {
    DT ret = null;
    try {
        Type t = this.getField(15, 0);
        ret = (DT)t;
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
   * Returns PSRO/UR Approved Stay-To (UB1-15).
   */
  public DT getUb115_PSROURApprovedStayTo()  {
    DT ret = null;
    try {
        Type t = this.getField(15, 0);
        ret = (DT)t;
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
   * Returns a single repetition of Occurrence (UB1-16).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public OCD getOccurrence(int rep) throws HL7Exception {
    OCD ret = null;
    try {
        Type t = this.getField(16, rep);
        ret = (OCD)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Occurrence (UB1-16).
   */
  public OCD[] getOccurrence() {
     OCD[] ret = null;
    try {
        Type[] t = this.getField(16);  
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
   * Returns a count of the number of repetitions of Occurrence (UB1-16).
   */
  public int getOccurrenceReps() {
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
   * Inserts a repetition of Occurrence (UB1-16) at a given index and returns it.
   * @param index The index
   */
  public OCD insertOccurrence(int index) throws HL7Exception {
     return (OCD) super.insertRepetition(16, index);
  }

  /**
   * Removes a repetition of Occurrence (UB1-16) at a given index and returns it.
   * @param index The index
   */
  public OCD removeOccurrence(int index) throws HL7Exception {
     return (OCD) super.removeRepetition(16, index);
  }

  /**
   * Returns a single repetition of Occurrence (UB1-16).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public OCD getUb116_Occurrence(int rep) throws HL7Exception {
    OCD ret = null;
    try {
        Type t = this.getField(16, rep);
        ret = (OCD)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Occurrence (UB1-16).
   */
  public OCD[] getUb116_Occurrence() {
     OCD[] ret = null;
    try {
        Type[] t = this.getField(16);  
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
   * Returns a count of the number of repetitions of Occurrence (UB1-16).
   */
  public int getUb116_OccurrenceReps() {
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
   * Inserts a repetition of Occurrence (UB1-16) at a given index and returns it.
   * @param index The index
   */
  public OCD insertUb116_Occurrence(int index) throws HL7Exception {
     return (OCD) super.insertRepetition(16, index);
  }

  /**
   * Removes a repetition of Occurrence (UB1-16) at a given index and returns it.
   * @param index The index
   */
  public OCD removeUb116_Occurrence(int index) throws HL7Exception {
     return (OCD) super.removeRepetition(16, index);
  }

  /**
   * Returns Occurrence Span (UB1-17).
   */
  public CWE getOccurrenceSpan()  {
    CWE ret = null;
    try {
        Type t = this.getField(17, 0);
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
   * Returns Occurrence Span (UB1-17).
   */
  public CWE getUb117_OccurrenceSpan()  {
    CWE ret = null;
    try {
        Type t = this.getField(17, 0);
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
   * Returns Occur Span Start Date (UB1-18).
   */
  public DT getOccurSpanStartDate()  {
    DT ret = null;
    try {
        Type t = this.getField(18, 0);
        ret = (DT)t;
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
   * Returns Occur Span Start Date (UB1-18).
   */
  public DT getUb118_OccurSpanStartDate()  {
    DT ret = null;
    try {
        Type t = this.getField(18, 0);
        ret = (DT)t;
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
   * Returns Occur Span End Date (UB1-19).
   */
  public DT getOccurSpanEndDate()  {
    DT ret = null;
    try {
        Type t = this.getField(19, 0);
        ret = (DT)t;
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
   * Returns Occur Span End Date (UB1-19).
   */
  public DT getUb119_OccurSpanEndDate()  {
    DT ret = null;
    try {
        Type t = this.getField(19, 0);
        ret = (DT)t;
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
   * Returns UB-82 Locator 2 (UB1-20).
   */
  public ST getUB82Locator2()  {
    ST ret = null;
    try {
        Type t = this.getField(20, 0);
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
   * Returns UB-82 Locator 2 (UB1-20).
   */
  public ST getUb120_UB82Locator2()  {
    ST ret = null;
    try {
        Type t = this.getField(20, 0);
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
   * Returns UB-82 Locator 9 (UB1-21).
   */
  public ST getUB82Locator9()  {
    ST ret = null;
    try {
        Type t = this.getField(21, 0);
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
   * Returns UB-82 Locator 9 (UB1-21).
   */
  public ST getUb121_UB82Locator9()  {
    ST ret = null;
    try {
        Type t = this.getField(21, 0);
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
   * Returns UB-82 Locator 27 (UB1-22).
   */
  public ST getUB82Locator27()  {
    ST ret = null;
    try {
        Type t = this.getField(22, 0);
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
   * Returns UB-82 Locator 27 (UB1-22).
   */
  public ST getUb122_UB82Locator27()  {
    ST ret = null;
    try {
        Type t = this.getField(22, 0);
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
   * Returns UB-82 Locator 45 (UB1-23).
   */
  public ST getUB82Locator45()  {
    ST ret = null;
    try {
        Type t = this.getField(23, 0);
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
   * Returns UB-82 Locator 45 (UB1-23).
   */
  public ST getUb123_UB82Locator45()  {
    ST ret = null;
    try {
        Type t = this.getField(23, 0);
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
         case 0: return new ca.uhn.hl7v2.model.v26.datatype.SI(getMessage());
         case 1: return new ca.uhn.hl7v2.model.v26.datatype.NULLDT(getMessage());
         case 2: return new ca.uhn.hl7v2.model.v26.datatype.NM(getMessage());
         case 3: return new ca.uhn.hl7v2.model.v26.datatype.NM(getMessage());
         case 4: return new ca.uhn.hl7v2.model.v26.datatype.NM(getMessage());
         case 5: return new ca.uhn.hl7v2.model.v26.datatype.NM(getMessage());
         case 6: return new ca.uhn.hl7v2.model.v26.datatype.IS(getMessage(), new Integer(43));
         case 7: return new ca.uhn.hl7v2.model.v26.datatype.NM(getMessage());
         case 8: return new ca.uhn.hl7v2.model.v26.datatype.NM(getMessage());
         case 9: return new ca.uhn.hl7v2.model.v26.datatype.UVC(getMessage());
         case 10: return new ca.uhn.hl7v2.model.v26.datatype.NM(getMessage());
         case 11: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 12: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 13: return new ca.uhn.hl7v2.model.v26.datatype.DT(getMessage());
         case 14: return new ca.uhn.hl7v2.model.v26.datatype.DT(getMessage());
         case 15: return new ca.uhn.hl7v2.model.v26.datatype.OCD(getMessage());
         case 16: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 17: return new ca.uhn.hl7v2.model.v26.datatype.DT(getMessage());
         case 18: return new ca.uhn.hl7v2.model.v26.datatype.DT(getMessage());
         case 19: return new ca.uhn.hl7v2.model.v26.datatype.ST(getMessage());
         case 20: return new ca.uhn.hl7v2.model.v26.datatype.ST(getMessage());
         case 21: return new ca.uhn.hl7v2.model.v26.datatype.ST(getMessage());
         case 22: return new ca.uhn.hl7v2.model.v26.datatype.ST(getMessage());
         default: return null;
      }
   }

}