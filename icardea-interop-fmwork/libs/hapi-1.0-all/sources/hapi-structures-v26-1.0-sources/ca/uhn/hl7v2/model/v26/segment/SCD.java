package ca.uhn.hl7v2.model.v26.segment;

import ca.uhn.hl7v2.model.*;
import ca.uhn.hl7v2.model.v26.datatype.*;
import ca.uhn.log.HapiLogFactory;
import ca.uhn.hl7v2.parser.ModelClassFactory;
import ca.uhn.hl7v2.HL7Exception;

/**
 * <p>Represents an HL7 SCD message segment. 
 * This segment has the following fields:</p><p>
 * SCD-1: Cycle Start Time (TM)<br> 
 * SCD-2: Cycle Count (NM)<br> 
 * SCD-3: Temp Max (CQ)<br> 
 * SCD-4: Temp Min (CQ)<br> 
 * SCD-5: Load Number (NM)<br> 
 * SCD-6: Condition Time (CQ)<br> 
 * SCD-7: Sterilize Time (CQ)<br> 
 * SCD-8: Exhaust Time (CQ)<br> 
 * SCD-9: Total Cycle Time (CQ)<br> 
 * SCD-10: Device Status (CWE)<br> 
 * SCD-11: Cycle Start Date/Time (DTM)<br> 
 * SCD-12: Dry Time (CQ)<br> 
 * SCD-13: Leak Rate (CQ)<br> 
 * SCD-14: Control Temperature (CQ)<br> 
 * SCD-15: Sterilizer Temperature (CQ)<br> 
 * SCD-16: Cycle Complete Time (TM)<br> 
 * SCD-17: Under Temperature (CQ)<br> 
 * SCD-18: Over Temperature (CQ)<br> 
 * SCD-19: Abort Cycle (CNE)<br> 
 * SCD-20: Alarm (CNE)<br> 
 * SCD-21: Long in Charge Phase (CNE)<br> 
 * SCD-22: Long in Exhaust Phase (CNE)<br> 
 * SCD-23: Long in Fast Exhaust Phase (CNE)<br> 
 * SCD-24: Reset (CNE)<br> 
 * SCD-25: Operator - Unload (XCN)<br> 
 * SCD-26: Door Open (CNE)<br> 
 * SCD-27: Reading Failure (CNE)<br> 
 * SCD-28: Cycle Type (CWE)<br> 
 * SCD-29: Thermal Rinse Time (CQ)<br> 
 * SCD-30: Wash Time (CQ)<br> 
 * SCD-31: Injection Rate (CQ)<br> 
 * SCD-32: Procedure Code (CNE)<br> 
 * SCD-33: Patient Identifier List (CX)<br> 
 * SCD-34: Attending Doctor (XCN)<br> 
 * SCD-35: Dilution Factor (SN)<br> 
 * SCD-36: Fill Time (CQ)<br> 
 * SCD-37: Inlet Temperature (CQ)<br> 
 * </p><p>The get...() methods return data from individual fields.  These methods 
 * do not throw exceptions and may therefore have to handle exceptions internally.  
 * If an exception is handled internally, it is logged and null is returned.  
 * This is not expected to happen - if it does happen this indicates not so much 
 * an exceptional circumstance as a bug in the code for this class.</p>    
 */
public class SCD extends AbstractSegment  {

  /**
   * Creates a SCD (Anti-Microbial Cycle Data) segment object that belongs to the given 
   * message.  
   */
  public SCD(Group parent, ModelClassFactory factory) {
    super(parent, factory);
    Message message = getMessage();
    try {
       this.add(TM.class, false, 1, 16, new Object[]{message}, "Cycle Start Time");
       this.add(NM.class, false, 1, 16, new Object[]{message}, "Cycle Count");
       this.add(CQ.class, false, 1, 36, new Object[]{message}, "Temp Max");
       this.add(CQ.class, false, 1, 36, new Object[]{message}, "Temp Min");
       this.add(NM.class, false, 1, 16, new Object[]{message}, "Load Number");
       this.add(CQ.class, false, 1, 16, new Object[]{message}, "Condition Time");
       this.add(CQ.class, false, 1, 16, new Object[]{message}, "Sterilize Time");
       this.add(CQ.class, false, 1, 16, new Object[]{message}, "Exhaust Time");
       this.add(CQ.class, false, 1, 16, new Object[]{message}, "Total Cycle Time");
       this.add(CWE.class, false, 1, 4, new Object[]{message}, "Device Status");
       this.add(DTM.class, false, 1, 24, new Object[]{message}, "Cycle Start Date/Time");
       this.add(CQ.class, false, 1, 16, new Object[]{message}, "Dry Time");
       this.add(CQ.class, false, 1, 16, new Object[]{message}, "Leak Rate");
       this.add(CQ.class, false, 1, 36, new Object[]{message}, "Control Temperature");
       this.add(CQ.class, false, 1, 36, new Object[]{message}, "Sterilizer Temperature");
       this.add(TM.class, false, 1, 16, new Object[]{message}, "Cycle Complete Time");
       this.add(CQ.class, false, 1, 36, new Object[]{message}, "Under Temperature");
       this.add(CQ.class, false, 1, 36, new Object[]{message}, "Over Temperature");
       this.add(CNE.class, false, 1, 4, new Object[]{message}, "Abort Cycle");
       this.add(CNE.class, false, 1, 4, new Object[]{message}, "Alarm");
       this.add(CNE.class, false, 1, 4, new Object[]{message}, "Long in Charge Phase");
       this.add(CNE.class, false, 1, 4, new Object[]{message}, "Long in Exhaust Phase");
       this.add(CNE.class, false, 1, 4, new Object[]{message}, "Long in Fast Exhaust Phase");
       this.add(CNE.class, false, 1, 4, new Object[]{message}, "Reset");
       this.add(XCN.class, false, 1, 15, new Object[]{message}, "Operator - Unload");
       this.add(CNE.class, false, 1, 4, new Object[]{message}, "Door Open");
       this.add(CNE.class, false, 1, 4, new Object[]{message}, "Reading Failure");
       this.add(CWE.class, false, 1, 3, new Object[]{message}, "Cycle Type");
       this.add(CQ.class, false, 1, 16, new Object[]{message}, "Thermal Rinse Time");
       this.add(CQ.class, false, 1, 16, new Object[]{message}, "Wash Time");
       this.add(CQ.class, false, 1, 16, new Object[]{message}, "Injection Rate");
       this.add(CNE.class, false, 1, 705, new Object[]{message}, "Procedure Code");
       this.add(CX.class, false, 0, 250, new Object[]{message}, "Patient Identifier List");
       this.add(XCN.class, false, 1, 250, new Object[]{message}, "Attending Doctor");
       this.add(SN.class, false, 1, 36, new Object[]{message}, "Dilution Factor");
       this.add(CQ.class, false, 1, 16, new Object[]{message}, "Fill Time");
       this.add(CQ.class, false, 1, 36, new Object[]{message}, "Inlet Temperature");
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Can't instantiate " + this.getClass().getName(), he);
    }
  }

  /**
   * Returns Cycle Start Time (SCD-1).
   */
  public TM getCycleStartTime()  {
    TM ret = null;
    try {
        Type t = this.getField(1, 0);
        ret = (TM)t;
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
   * Returns Cycle Start Time (SCD-1).
   */
  public TM getScd1_CycleStartTime()  {
    TM ret = null;
    try {
        Type t = this.getField(1, 0);
        ret = (TM)t;
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
   * Returns Cycle Count (SCD-2).
   */
  public NM getCycleCount()  {
    NM ret = null;
    try {
        Type t = this.getField(2, 0);
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
   * Returns Cycle Count (SCD-2).
   */
  public NM getScd2_CycleCount()  {
    NM ret = null;
    try {
        Type t = this.getField(2, 0);
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
   * Returns Temp Max (SCD-3).
   */
  public CQ getTempMax()  {
    CQ ret = null;
    try {
        Type t = this.getField(3, 0);
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
   * Returns Temp Max (SCD-3).
   */
  public CQ getScd3_TempMax()  {
    CQ ret = null;
    try {
        Type t = this.getField(3, 0);
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
   * Returns Temp Min (SCD-4).
   */
  public CQ getTempMin()  {
    CQ ret = null;
    try {
        Type t = this.getField(4, 0);
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
   * Returns Temp Min (SCD-4).
   */
  public CQ getScd4_TempMin()  {
    CQ ret = null;
    try {
        Type t = this.getField(4, 0);
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
   * Returns Load Number (SCD-5).
   */
  public NM getLoadNumber()  {
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
   * Returns Load Number (SCD-5).
   */
  public NM getScd5_LoadNumber()  {
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
   * Returns Condition Time (SCD-6).
   */
  public CQ getConditionTime()  {
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
   * Returns Condition Time (SCD-6).
   */
  public CQ getScd6_ConditionTime()  {
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
   * Returns Sterilize Time (SCD-7).
   */
  public CQ getSterilizeTime()  {
    CQ ret = null;
    try {
        Type t = this.getField(7, 0);
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
   * Returns Sterilize Time (SCD-7).
   */
  public CQ getScd7_SterilizeTime()  {
    CQ ret = null;
    try {
        Type t = this.getField(7, 0);
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
   * Returns Exhaust Time (SCD-8).
   */
  public CQ getExhaustTime()  {
    CQ ret = null;
    try {
        Type t = this.getField(8, 0);
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
   * Returns Exhaust Time (SCD-8).
   */
  public CQ getScd8_ExhaustTime()  {
    CQ ret = null;
    try {
        Type t = this.getField(8, 0);
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
   * Returns Total Cycle Time (SCD-9).
   */
  public CQ getTotalCycleTime()  {
    CQ ret = null;
    try {
        Type t = this.getField(9, 0);
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
   * Returns Total Cycle Time (SCD-9).
   */
  public CQ getScd9_TotalCycleTime()  {
    CQ ret = null;
    try {
        Type t = this.getField(9, 0);
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
   * Returns Device Status (SCD-10).
   */
  public CWE getDeviceStatus()  {
    CWE ret = null;
    try {
        Type t = this.getField(10, 0);
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
   * Returns Device Status (SCD-10).
   */
  public CWE getScd10_DeviceStatus()  {
    CWE ret = null;
    try {
        Type t = this.getField(10, 0);
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
   * Returns Cycle Start Date/Time (SCD-11).
   */
  public DTM getCycleStartDateTime()  {
    DTM ret = null;
    try {
        Type t = this.getField(11, 0);
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
   * Returns Cycle Start Date/Time (SCD-11).
   */
  public DTM getScd11_CycleStartDateTime()  {
    DTM ret = null;
    try {
        Type t = this.getField(11, 0);
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
   * Returns Dry Time (SCD-12).
   */
  public CQ getDryTime()  {
    CQ ret = null;
    try {
        Type t = this.getField(12, 0);
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
   * Returns Dry Time (SCD-12).
   */
  public CQ getScd12_DryTime()  {
    CQ ret = null;
    try {
        Type t = this.getField(12, 0);
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
   * Returns Leak Rate (SCD-13).
   */
  public CQ getLeakRate()  {
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
   * Returns Leak Rate (SCD-13).
   */
  public CQ getScd13_LeakRate()  {
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
   * Returns Control Temperature (SCD-14).
   */
  public CQ getControlTemperature()  {
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
   * Returns Control Temperature (SCD-14).
   */
  public CQ getScd14_ControlTemperature()  {
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
   * Returns Sterilizer Temperature (SCD-15).
   */
  public CQ getSterilizerTemperature()  {
    CQ ret = null;
    try {
        Type t = this.getField(15, 0);
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
   * Returns Sterilizer Temperature (SCD-15).
   */
  public CQ getScd15_SterilizerTemperature()  {
    CQ ret = null;
    try {
        Type t = this.getField(15, 0);
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
   * Returns Cycle Complete Time (SCD-16).
   */
  public TM getCycleCompleteTime()  {
    TM ret = null;
    try {
        Type t = this.getField(16, 0);
        ret = (TM)t;
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
   * Returns Cycle Complete Time (SCD-16).
   */
  public TM getScd16_CycleCompleteTime()  {
    TM ret = null;
    try {
        Type t = this.getField(16, 0);
        ret = (TM)t;
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
   * Returns Under Temperature (SCD-17).
   */
  public CQ getUnderTemperature()  {
    CQ ret = null;
    try {
        Type t = this.getField(17, 0);
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
   * Returns Under Temperature (SCD-17).
   */
  public CQ getScd17_UnderTemperature()  {
    CQ ret = null;
    try {
        Type t = this.getField(17, 0);
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
   * Returns Over Temperature (SCD-18).
   */
  public CQ getOverTemperature()  {
    CQ ret = null;
    try {
        Type t = this.getField(18, 0);
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
   * Returns Over Temperature (SCD-18).
   */
  public CQ getScd18_OverTemperature()  {
    CQ ret = null;
    try {
        Type t = this.getField(18, 0);
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
   * Returns Abort Cycle (SCD-19).
   */
  public CNE getAbortCycle()  {
    CNE ret = null;
    try {
        Type t = this.getField(19, 0);
        ret = (CNE)t;
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
   * Returns Abort Cycle (SCD-19).
   */
  public CNE getScd19_AbortCycle()  {
    CNE ret = null;
    try {
        Type t = this.getField(19, 0);
        ret = (CNE)t;
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
   * Returns Alarm (SCD-20).
   */
  public CNE getAlarm()  {
    CNE ret = null;
    try {
        Type t = this.getField(20, 0);
        ret = (CNE)t;
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
   * Returns Alarm (SCD-20).
   */
  public CNE getScd20_Alarm()  {
    CNE ret = null;
    try {
        Type t = this.getField(20, 0);
        ret = (CNE)t;
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
   * Returns Long in Charge Phase (SCD-21).
   */
  public CNE getLongInChargePhase()  {
    CNE ret = null;
    try {
        Type t = this.getField(21, 0);
        ret = (CNE)t;
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
   * Returns Long in Charge Phase (SCD-21).
   */
  public CNE getScd21_LongInChargePhase()  {
    CNE ret = null;
    try {
        Type t = this.getField(21, 0);
        ret = (CNE)t;
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
   * Returns Long in Exhaust Phase (SCD-22).
   */
  public CNE getLongInExhaustPhase()  {
    CNE ret = null;
    try {
        Type t = this.getField(22, 0);
        ret = (CNE)t;
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
   * Returns Long in Exhaust Phase (SCD-22).
   */
  public CNE getScd22_LongInExhaustPhase()  {
    CNE ret = null;
    try {
        Type t = this.getField(22, 0);
        ret = (CNE)t;
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
   * Returns Long in Fast Exhaust Phase (SCD-23).
   */
  public CNE getLongInFastExhaustPhase()  {
    CNE ret = null;
    try {
        Type t = this.getField(23, 0);
        ret = (CNE)t;
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
   * Returns Long in Fast Exhaust Phase (SCD-23).
   */
  public CNE getScd23_LongInFastExhaustPhase()  {
    CNE ret = null;
    try {
        Type t = this.getField(23, 0);
        ret = (CNE)t;
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
   * Returns Reset (SCD-24).
   */
  public CNE getReset()  {
    CNE ret = null;
    try {
        Type t = this.getField(24, 0);
        ret = (CNE)t;
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
   * Returns Reset (SCD-24).
   */
  public CNE getScd24_Reset()  {
    CNE ret = null;
    try {
        Type t = this.getField(24, 0);
        ret = (CNE)t;
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
   * Returns Operator - Unload (SCD-25).
   */
  public XCN getOperatorUnload()  {
    XCN ret = null;
    try {
        Type t = this.getField(25, 0);
        ret = (XCN)t;
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
   * Returns Operator - Unload (SCD-25).
   */
  public XCN getScd25_OperatorUnload()  {
    XCN ret = null;
    try {
        Type t = this.getField(25, 0);
        ret = (XCN)t;
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
   * Returns Door Open (SCD-26).
   */
  public CNE getDoorOpen()  {
    CNE ret = null;
    try {
        Type t = this.getField(26, 0);
        ret = (CNE)t;
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
   * Returns Door Open (SCD-26).
   */
  public CNE getScd26_DoorOpen()  {
    CNE ret = null;
    try {
        Type t = this.getField(26, 0);
        ret = (CNE)t;
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
   * Returns Reading Failure (SCD-27).
   */
  public CNE getReadingFailure()  {
    CNE ret = null;
    try {
        Type t = this.getField(27, 0);
        ret = (CNE)t;
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
   * Returns Reading Failure (SCD-27).
   */
  public CNE getScd27_ReadingFailure()  {
    CNE ret = null;
    try {
        Type t = this.getField(27, 0);
        ret = (CNE)t;
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
   * Returns Cycle Type (SCD-28).
   */
  public CWE getCycleType()  {
    CWE ret = null;
    try {
        Type t = this.getField(28, 0);
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
   * Returns Cycle Type (SCD-28).
   */
  public CWE getScd28_CycleType()  {
    CWE ret = null;
    try {
        Type t = this.getField(28, 0);
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
   * Returns Thermal Rinse Time (SCD-29).
   */
  public CQ getThermalRinseTime()  {
    CQ ret = null;
    try {
        Type t = this.getField(29, 0);
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
   * Returns Thermal Rinse Time (SCD-29).
   */
  public CQ getScd29_ThermalRinseTime()  {
    CQ ret = null;
    try {
        Type t = this.getField(29, 0);
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
   * Returns Wash Time (SCD-30).
   */
  public CQ getWashTime()  {
    CQ ret = null;
    try {
        Type t = this.getField(30, 0);
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
   * Returns Wash Time (SCD-30).
   */
  public CQ getScd30_WashTime()  {
    CQ ret = null;
    try {
        Type t = this.getField(30, 0);
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
   * Returns Injection Rate (SCD-31).
   */
  public CQ getInjectionRate()  {
    CQ ret = null;
    try {
        Type t = this.getField(31, 0);
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
   * Returns Injection Rate (SCD-31).
   */
  public CQ getScd31_InjectionRate()  {
    CQ ret = null;
    try {
        Type t = this.getField(31, 0);
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
   * Returns Procedure Code (SCD-32).
   */
  public CNE getProcedureCode()  {
    CNE ret = null;
    try {
        Type t = this.getField(32, 0);
        ret = (CNE)t;
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
   * Returns Procedure Code (SCD-32).
   */
  public CNE getScd32_ProcedureCode()  {
    CNE ret = null;
    try {
        Type t = this.getField(32, 0);
        ret = (CNE)t;
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
   * Returns a single repetition of Patient Identifier List (SCD-33).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CX getPatientIdentifierList(int rep) throws HL7Exception {
    CX ret = null;
    try {
        Type t = this.getField(33, rep);
        ret = (CX)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Patient Identifier List (SCD-33).
   */
  public CX[] getPatientIdentifierList() {
     CX[] ret = null;
    try {
        Type[] t = this.getField(33);  
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
   * Returns a count of the number of repetitions of Patient Identifier List (SCD-33).
   */
  public int getPatientIdentifierListReps() {
    try {
        return this.getField(33).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Patient Identifier List (SCD-33) at a given index and returns it.
   * @param index The index
   */
  public CX insertPatientIdentifierList(int index) throws HL7Exception {
     return (CX) super.insertRepetition(33, index);
  }

  /**
   * Removes a repetition of Patient Identifier List (SCD-33) at a given index and returns it.
   * @param index The index
   */
  public CX removePatientIdentifierList(int index) throws HL7Exception {
     return (CX) super.removeRepetition(33, index);
  }

  /**
   * Returns a single repetition of Patient Identifier List (SCD-33).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CX getScd33_PatientIdentifierList(int rep) throws HL7Exception {
    CX ret = null;
    try {
        Type t = this.getField(33, rep);
        ret = (CX)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Patient Identifier List (SCD-33).
   */
  public CX[] getScd33_PatientIdentifierList() {
     CX[] ret = null;
    try {
        Type[] t = this.getField(33);  
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
   * Returns a count of the number of repetitions of Patient Identifier List (SCD-33).
   */
  public int getScd33_PatientIdentifierListReps() {
    try {
        return this.getField(33).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Patient Identifier List (SCD-33) at a given index and returns it.
   * @param index The index
   */
  public CX insertScd33_PatientIdentifierList(int index) throws HL7Exception {
     return (CX) super.insertRepetition(33, index);
  }

  /**
   * Removes a repetition of Patient Identifier List (SCD-33) at a given index and returns it.
   * @param index The index
   */
  public CX removeScd33_PatientIdentifierList(int index) throws HL7Exception {
     return (CX) super.removeRepetition(33, index);
  }

  /**
   * Returns Attending Doctor (SCD-34).
   */
  public XCN getAttendingDoctor()  {
    XCN ret = null;
    try {
        Type t = this.getField(34, 0);
        ret = (XCN)t;
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
   * Returns Attending Doctor (SCD-34).
   */
  public XCN getScd34_AttendingDoctor()  {
    XCN ret = null;
    try {
        Type t = this.getField(34, 0);
        ret = (XCN)t;
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
   * Returns Dilution Factor (SCD-35).
   */
  public SN getDilutionFactor()  {
    SN ret = null;
    try {
        Type t = this.getField(35, 0);
        ret = (SN)t;
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
   * Returns Dilution Factor (SCD-35).
   */
  public SN getScd35_DilutionFactor()  {
    SN ret = null;
    try {
        Type t = this.getField(35, 0);
        ret = (SN)t;
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
   * Returns Fill Time (SCD-36).
   */
  public CQ getFillTime()  {
    CQ ret = null;
    try {
        Type t = this.getField(36, 0);
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
   * Returns Fill Time (SCD-36).
   */
  public CQ getScd36_FillTime()  {
    CQ ret = null;
    try {
        Type t = this.getField(36, 0);
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
   * Returns Inlet Temperature (SCD-37).
   */
  public CQ getInletTemperature()  {
    CQ ret = null;
    try {
        Type t = this.getField(37, 0);
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
   * Returns Inlet Temperature (SCD-37).
   */
  public CQ getScd37_InletTemperature()  {
    CQ ret = null;
    try {
        Type t = this.getField(37, 0);
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
         case 0: return new ca.uhn.hl7v2.model.v26.datatype.TM(getMessage());
         case 1: return new ca.uhn.hl7v2.model.v26.datatype.NM(getMessage());
         case 2: return new ca.uhn.hl7v2.model.v26.datatype.CQ(getMessage());
         case 3: return new ca.uhn.hl7v2.model.v26.datatype.CQ(getMessage());
         case 4: return new ca.uhn.hl7v2.model.v26.datatype.NM(getMessage());
         case 5: return new ca.uhn.hl7v2.model.v26.datatype.CQ(getMessage());
         case 6: return new ca.uhn.hl7v2.model.v26.datatype.CQ(getMessage());
         case 7: return new ca.uhn.hl7v2.model.v26.datatype.CQ(getMessage());
         case 8: return new ca.uhn.hl7v2.model.v26.datatype.CQ(getMessage());
         case 9: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 10: return new ca.uhn.hl7v2.model.v26.datatype.DTM(getMessage());
         case 11: return new ca.uhn.hl7v2.model.v26.datatype.CQ(getMessage());
         case 12: return new ca.uhn.hl7v2.model.v26.datatype.CQ(getMessage());
         case 13: return new ca.uhn.hl7v2.model.v26.datatype.CQ(getMessage());
         case 14: return new ca.uhn.hl7v2.model.v26.datatype.CQ(getMessage());
         case 15: return new ca.uhn.hl7v2.model.v26.datatype.TM(getMessage());
         case 16: return new ca.uhn.hl7v2.model.v26.datatype.CQ(getMessage());
         case 17: return new ca.uhn.hl7v2.model.v26.datatype.CQ(getMessage());
         case 18: return new ca.uhn.hl7v2.model.v26.datatype.CNE(getMessage());
         case 19: return new ca.uhn.hl7v2.model.v26.datatype.CNE(getMessage());
         case 20: return new ca.uhn.hl7v2.model.v26.datatype.CNE(getMessage());
         case 21: return new ca.uhn.hl7v2.model.v26.datatype.CNE(getMessage());
         case 22: return new ca.uhn.hl7v2.model.v26.datatype.CNE(getMessage());
         case 23: return new ca.uhn.hl7v2.model.v26.datatype.CNE(getMessage());
         case 24: return new ca.uhn.hl7v2.model.v26.datatype.XCN(getMessage());
         case 25: return new ca.uhn.hl7v2.model.v26.datatype.CNE(getMessage());
         case 26: return new ca.uhn.hl7v2.model.v26.datatype.CNE(getMessage());
         case 27: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 28: return new ca.uhn.hl7v2.model.v26.datatype.CQ(getMessage());
         case 29: return new ca.uhn.hl7v2.model.v26.datatype.CQ(getMessage());
         case 30: return new ca.uhn.hl7v2.model.v26.datatype.CQ(getMessage());
         case 31: return new ca.uhn.hl7v2.model.v26.datatype.CNE(getMessage());
         case 32: return new ca.uhn.hl7v2.model.v26.datatype.CX(getMessage());
         case 33: return new ca.uhn.hl7v2.model.v26.datatype.XCN(getMessage());
         case 34: return new ca.uhn.hl7v2.model.v26.datatype.SN(getMessage());
         case 35: return new ca.uhn.hl7v2.model.v26.datatype.CQ(getMessage());
         case 36: return new ca.uhn.hl7v2.model.v26.datatype.CQ(getMessage());
         default: return null;
      }
   }

}