package ca.uhn.hl7v2.model.v26.segment;

import ca.uhn.hl7v2.model.*;
import ca.uhn.hl7v2.model.v26.datatype.*;
import ca.uhn.log.HapiLogFactory;
import ca.uhn.hl7v2.parser.ModelClassFactory;
import ca.uhn.hl7v2.HL7Exception;

/**
 * <p>Represents an HL7 OM2 message segment. 
 * This segment has the following fields:</p><p>
 * OM2-1: Sequence Number - Test/Observation Master File (NM)<br> 
 * OM2-2: Units of Measure (CWE)<br> 
 * OM2-3: Range of Decimal Precision (NM)<br> 
 * OM2-4: Corresponding SI Units of Measure (CWE)<br> 
 * OM2-5: SI Conversion Factor (TX)<br> 
 * OM2-6: Reference (Normal) Range for Ordinal and Continuous Observations (RFR)<br> 
 * OM2-7: Critical Range for Ordinal and Continuous Observations (RFR)<br> 
 * OM2-8: Absolute Range for Ordinal and Continuous Observations (RFR)<br> 
 * OM2-9: Delta Check Criteria (DLT)<br> 
 * OM2-10: Minimum Meaningful Increments (NM)<br> 
 * </p><p>The get...() methods return data from individual fields.  These methods 
 * do not throw exceptions and may therefore have to handle exceptions internally.  
 * If an exception is handled internally, it is logged and null is returned.  
 * This is not expected to happen - if it does happen this indicates not so much 
 * an exceptional circumstance as a bug in the code for this class.</p>    
 */
public class OM2 extends AbstractSegment  {

  /**
   * Creates a OM2 (Numeric Observation) segment object that belongs to the given 
   * message.  
   */
  public OM2(Group parent, ModelClassFactory factory) {
    super(parent, factory);
    Message message = getMessage();
    try {
       this.add(NM.class, false, 1, 4, new Object[]{message}, "Sequence Number - Test/Observation Master File");
       this.add(CWE.class, false, 1, 250, new Object[]{message}, "Units of Measure");
       this.add(NM.class, false, 0, 10, new Object[]{message}, "Range of Decimal Precision");
       this.add(CWE.class, false, 1, 250, new Object[]{message}, "Corresponding SI Units of Measure");
       this.add(TX.class, false, 1, 60, new Object[]{message}, "SI Conversion Factor");
       this.add(RFR.class, false, 0, 250, new Object[]{message}, "Reference (Normal) Range for Ordinal and Continuous Observations");
       this.add(RFR.class, false, 0, 205, new Object[]{message}, "Critical Range for Ordinal and Continuous Observations");
       this.add(RFR.class, false, 1, 250, new Object[]{message}, "Absolute Range for Ordinal and Continuous Observations");
       this.add(DLT.class, false, 0, 250, new Object[]{message}, "Delta Check Criteria");
       this.add(NM.class, false, 1, 20, new Object[]{message}, "Minimum Meaningful Increments");
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Can't instantiate " + this.getClass().getName(), he);
    }
  }

  /**
   * Returns Sequence Number - Test/Observation Master File (OM2-1).
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
   * Returns Sequence Number - Test/Observation Master File (OM2-1).
   */
  public NM getOm21_SequenceNumberTestObservationMasterFile()  {
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
   * Returns Units of Measure (OM2-2).
   */
  public CWE getUnitsOfMeasure()  {
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
   * Returns Units of Measure (OM2-2).
   */
  public CWE getOm22_UnitsOfMeasure()  {
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
   * Returns a single repetition of Range of Decimal Precision (OM2-3).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public NM getRangeOfDecimalPrecision(int rep) throws HL7Exception {
    NM ret = null;
    try {
        Type t = this.getField(3, rep);
        ret = (NM)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Range of Decimal Precision (OM2-3).
   */
  public NM[] getRangeOfDecimalPrecision() {
     NM[] ret = null;
    try {
        Type[] t = this.getField(3);  
        ret = new NM[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (NM)t[i];
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
   * Returns a count of the number of repetitions of Range of Decimal Precision (OM2-3).
   */
  public int getRangeOfDecimalPrecisionReps() {
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
   * Inserts a repetition of Range of Decimal Precision (OM2-3) at a given index and returns it.
   * @param index The index
   */
  public NM insertRangeOfDecimalPrecision(int index) throws HL7Exception {
     return (NM) super.insertRepetition(3, index);
  }

  /**
   * Removes a repetition of Range of Decimal Precision (OM2-3) at a given index and returns it.
   * @param index The index
   */
  public NM removeRangeOfDecimalPrecision(int index) throws HL7Exception {
     return (NM) super.removeRepetition(3, index);
  }

  /**
   * Returns a single repetition of Range of Decimal Precision (OM2-3).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public NM getOm23_RangeOfDecimalPrecision(int rep) throws HL7Exception {
    NM ret = null;
    try {
        Type t = this.getField(3, rep);
        ret = (NM)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Range of Decimal Precision (OM2-3).
   */
  public NM[] getOm23_RangeOfDecimalPrecision() {
     NM[] ret = null;
    try {
        Type[] t = this.getField(3);  
        ret = new NM[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (NM)t[i];
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
   * Returns a count of the number of repetitions of Range of Decimal Precision (OM2-3).
   */
  public int getOm23_RangeOfDecimalPrecisionReps() {
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
   * Inserts a repetition of Range of Decimal Precision (OM2-3) at a given index and returns it.
   * @param index The index
   */
  public NM insertOm23_RangeOfDecimalPrecision(int index) throws HL7Exception {
     return (NM) super.insertRepetition(3, index);
  }

  /**
   * Removes a repetition of Range of Decimal Precision (OM2-3) at a given index and returns it.
   * @param index The index
   */
  public NM removeOm23_RangeOfDecimalPrecision(int index) throws HL7Exception {
     return (NM) super.removeRepetition(3, index);
  }

  /**
   * Returns Corresponding SI Units of Measure (OM2-4).
   */
  public CWE getCorrespondingSIUnitsOfMeasure()  {
    CWE ret = null;
    try {
        Type t = this.getField(4, 0);
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
   * Returns Corresponding SI Units of Measure (OM2-4).
   */
  public CWE getOm24_CorrespondingSIUnitsOfMeasure()  {
    CWE ret = null;
    try {
        Type t = this.getField(4, 0);
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
   * Returns SI Conversion Factor (OM2-5).
   */
  public TX getSIConversionFactor()  {
    TX ret = null;
    try {
        Type t = this.getField(5, 0);
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
   * Returns SI Conversion Factor (OM2-5).
   */
  public TX getOm25_SIConversionFactor()  {
    TX ret = null;
    try {
        Type t = this.getField(5, 0);
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
   * Returns a single repetition of Reference (Normal) Range for Ordinal and Continuous Observations (OM2-6).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public RFR getReferenceNormalRangeForOrdinalAndContinuousObservations(int rep) throws HL7Exception {
    RFR ret = null;
    try {
        Type t = this.getField(6, rep);
        ret = (RFR)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Reference (Normal) Range for Ordinal and Continuous Observations (OM2-6).
   */
  public RFR[] getReferenceNormalRangeForOrdinalAndContinuousObservations() {
     RFR[] ret = null;
    try {
        Type[] t = this.getField(6);  
        ret = new RFR[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (RFR)t[i];
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
   * Returns a count of the number of repetitions of Reference (Normal) Range for Ordinal and Continuous Observations (OM2-6).
   */
  public int getReferenceNormalRangeForOrdinalAndContinuousObservationsReps() {
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
   * Inserts a repetition of Reference (Normal) Range for Ordinal and Continuous Observations (OM2-6) at a given index and returns it.
   * @param index The index
   */
  public RFR insertReferenceNormalRangeForOrdinalAndContinuousObservations(int index) throws HL7Exception {
     return (RFR) super.insertRepetition(6, index);
  }

  /**
   * Removes a repetition of Reference (Normal) Range for Ordinal and Continuous Observations (OM2-6) at a given index and returns it.
   * @param index The index
   */
  public RFR removeReferenceNormalRangeForOrdinalAndContinuousObservations(int index) throws HL7Exception {
     return (RFR) super.removeRepetition(6, index);
  }

  /**
   * Returns a single repetition of Reference (Normal) Range for Ordinal and Continuous Observations (OM2-6).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public RFR getOm26_ReferenceNormalRangeForOrdinalAndContinuousObservations(int rep) throws HL7Exception {
    RFR ret = null;
    try {
        Type t = this.getField(6, rep);
        ret = (RFR)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Reference (Normal) Range for Ordinal and Continuous Observations (OM2-6).
   */
  public RFR[] getOm26_ReferenceNormalRangeForOrdinalAndContinuousObservations() {
     RFR[] ret = null;
    try {
        Type[] t = this.getField(6);  
        ret = new RFR[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (RFR)t[i];
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
   * Returns a count of the number of repetitions of Reference (Normal) Range for Ordinal and Continuous Observations (OM2-6).
   */
  public int getOm26_ReferenceNormalRangeForOrdinalAndContinuousObservationsReps() {
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
   * Inserts a repetition of Reference (Normal) Range for Ordinal and Continuous Observations (OM2-6) at a given index and returns it.
   * @param index The index
   */
  public RFR insertOm26_ReferenceNormalRangeForOrdinalAndContinuousObservations(int index) throws HL7Exception {
     return (RFR) super.insertRepetition(6, index);
  }

  /**
   * Removes a repetition of Reference (Normal) Range for Ordinal and Continuous Observations (OM2-6) at a given index and returns it.
   * @param index The index
   */
  public RFR removeOm26_ReferenceNormalRangeForOrdinalAndContinuousObservations(int index) throws HL7Exception {
     return (RFR) super.removeRepetition(6, index);
  }

  /**
   * Returns a single repetition of Critical Range for Ordinal and Continuous Observations (OM2-7).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public RFR getCriticalRangeForOrdinalAndContinuousObservations(int rep) throws HL7Exception {
    RFR ret = null;
    try {
        Type t = this.getField(7, rep);
        ret = (RFR)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Critical Range for Ordinal and Continuous Observations (OM2-7).
   */
  public RFR[] getCriticalRangeForOrdinalAndContinuousObservations() {
     RFR[] ret = null;
    try {
        Type[] t = this.getField(7);  
        ret = new RFR[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (RFR)t[i];
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
   * Returns a count of the number of repetitions of Critical Range for Ordinal and Continuous Observations (OM2-7).
   */
  public int getCriticalRangeForOrdinalAndContinuousObservationsReps() {
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
   * Inserts a repetition of Critical Range for Ordinal and Continuous Observations (OM2-7) at a given index and returns it.
   * @param index The index
   */
  public RFR insertCriticalRangeForOrdinalAndContinuousObservations(int index) throws HL7Exception {
     return (RFR) super.insertRepetition(7, index);
  }

  /**
   * Removes a repetition of Critical Range for Ordinal and Continuous Observations (OM2-7) at a given index and returns it.
   * @param index The index
   */
  public RFR removeCriticalRangeForOrdinalAndContinuousObservations(int index) throws HL7Exception {
     return (RFR) super.removeRepetition(7, index);
  }

  /**
   * Returns a single repetition of Critical Range for Ordinal and Continuous Observations (OM2-7).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public RFR getOm27_CriticalRangeForOrdinalAndContinuousObservations(int rep) throws HL7Exception {
    RFR ret = null;
    try {
        Type t = this.getField(7, rep);
        ret = (RFR)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Critical Range for Ordinal and Continuous Observations (OM2-7).
   */
  public RFR[] getOm27_CriticalRangeForOrdinalAndContinuousObservations() {
     RFR[] ret = null;
    try {
        Type[] t = this.getField(7);  
        ret = new RFR[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (RFR)t[i];
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
   * Returns a count of the number of repetitions of Critical Range for Ordinal and Continuous Observations (OM2-7).
   */
  public int getOm27_CriticalRangeForOrdinalAndContinuousObservationsReps() {
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
   * Inserts a repetition of Critical Range for Ordinal and Continuous Observations (OM2-7) at a given index and returns it.
   * @param index The index
   */
  public RFR insertOm27_CriticalRangeForOrdinalAndContinuousObservations(int index) throws HL7Exception {
     return (RFR) super.insertRepetition(7, index);
  }

  /**
   * Removes a repetition of Critical Range for Ordinal and Continuous Observations (OM2-7) at a given index and returns it.
   * @param index The index
   */
  public RFR removeOm27_CriticalRangeForOrdinalAndContinuousObservations(int index) throws HL7Exception {
     return (RFR) super.removeRepetition(7, index);
  }

  /**
   * Returns Absolute Range for Ordinal and Continuous Observations (OM2-8).
   */
  public RFR getAbsoluteRangeForOrdinalAndContinuousObservations()  {
    RFR ret = null;
    try {
        Type t = this.getField(8, 0);
        ret = (RFR)t;
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
   * Returns Absolute Range for Ordinal and Continuous Observations (OM2-8).
   */
  public RFR getOm28_AbsoluteRangeForOrdinalAndContinuousObservations()  {
    RFR ret = null;
    try {
        Type t = this.getField(8, 0);
        ret = (RFR)t;
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
   * Returns a single repetition of Delta Check Criteria (OM2-9).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public DLT getDeltaCheckCriteria(int rep) throws HL7Exception {
    DLT ret = null;
    try {
        Type t = this.getField(9, rep);
        ret = (DLT)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Delta Check Criteria (OM2-9).
   */
  public DLT[] getDeltaCheckCriteria() {
     DLT[] ret = null;
    try {
        Type[] t = this.getField(9);  
        ret = new DLT[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (DLT)t[i];
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
   * Returns a count of the number of repetitions of Delta Check Criteria (OM2-9).
   */
  public int getDeltaCheckCriteriaReps() {
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
   * Inserts a repetition of Delta Check Criteria (OM2-9) at a given index and returns it.
   * @param index The index
   */
  public DLT insertDeltaCheckCriteria(int index) throws HL7Exception {
     return (DLT) super.insertRepetition(9, index);
  }

  /**
   * Removes a repetition of Delta Check Criteria (OM2-9) at a given index and returns it.
   * @param index The index
   */
  public DLT removeDeltaCheckCriteria(int index) throws HL7Exception {
     return (DLT) super.removeRepetition(9, index);
  }

  /**
   * Returns a single repetition of Delta Check Criteria (OM2-9).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public DLT getOm29_DeltaCheckCriteria(int rep) throws HL7Exception {
    DLT ret = null;
    try {
        Type t = this.getField(9, rep);
        ret = (DLT)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Delta Check Criteria (OM2-9).
   */
  public DLT[] getOm29_DeltaCheckCriteria() {
     DLT[] ret = null;
    try {
        Type[] t = this.getField(9);  
        ret = new DLT[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (DLT)t[i];
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
   * Returns a count of the number of repetitions of Delta Check Criteria (OM2-9).
   */
  public int getOm29_DeltaCheckCriteriaReps() {
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
   * Inserts a repetition of Delta Check Criteria (OM2-9) at a given index and returns it.
   * @param index The index
   */
  public DLT insertOm29_DeltaCheckCriteria(int index) throws HL7Exception {
     return (DLT) super.insertRepetition(9, index);
  }

  /**
   * Removes a repetition of Delta Check Criteria (OM2-9) at a given index and returns it.
   * @param index The index
   */
  public DLT removeOm29_DeltaCheckCriteria(int index) throws HL7Exception {
     return (DLT) super.removeRepetition(9, index);
  }

  /**
   * Returns Minimum Meaningful Increments (OM2-10).
   */
  public NM getMinimumMeaningfulIncrements()  {
    NM ret = null;
    try {
        Type t = this.getField(10, 0);
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
   * Returns Minimum Meaningful Increments (OM2-10).
   */
  public NM getOm210_MinimumMeaningfulIncrements()  {
    NM ret = null;
    try {
        Type t = this.getField(10, 0);
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
         case 0: return new ca.uhn.hl7v2.model.v26.datatype.NM(getMessage());
         case 1: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 2: return new ca.uhn.hl7v2.model.v26.datatype.NM(getMessage());
         case 3: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 4: return new ca.uhn.hl7v2.model.v26.datatype.TX(getMessage());
         case 5: return new ca.uhn.hl7v2.model.v26.datatype.RFR(getMessage());
         case 6: return new ca.uhn.hl7v2.model.v26.datatype.RFR(getMessage());
         case 7: return new ca.uhn.hl7v2.model.v26.datatype.RFR(getMessage());
         case 8: return new ca.uhn.hl7v2.model.v26.datatype.DLT(getMessage());
         case 9: return new ca.uhn.hl7v2.model.v26.datatype.NM(getMessage());
         default: return null;
      }
   }

}