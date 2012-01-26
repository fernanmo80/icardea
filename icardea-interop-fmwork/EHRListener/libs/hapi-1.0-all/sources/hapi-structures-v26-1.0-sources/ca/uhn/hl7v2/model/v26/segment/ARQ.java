package ca.uhn.hl7v2.model.v26.segment;

import ca.uhn.hl7v2.model.*;
import ca.uhn.hl7v2.model.v26.datatype.*;
import ca.uhn.log.HapiLogFactory;
import ca.uhn.hl7v2.parser.ModelClassFactory;
import ca.uhn.hl7v2.HL7Exception;

/**
 * <p>Represents an HL7 ARQ message segment. 
 * This segment has the following fields:</p><p>
 * ARQ-1: Placer Appointment ID (EI)<br> 
 * ARQ-2: Filler Appointment ID (EI)<br> 
 * ARQ-3: Occurrence Number (NM)<br> 
 * ARQ-4: Placer Group Number (EI)<br> 
 * ARQ-5: Schedule ID (CWE)<br> 
 * ARQ-6: Request Event Reason (CWE)<br> 
 * ARQ-7: Appointment Reason (CWE)<br> 
 * ARQ-8: Appointment Type (CWE)<br> 
 * ARQ-9: Appointment Duration (NM)<br> 
 * ARQ-10: Appointment Duration Units (CNE)<br> 
 * ARQ-11: Requested Start Date/Time Range (DR)<br> 
 * ARQ-12: Priority-ARQ (ST)<br> 
 * ARQ-13: Repeating Interval (RI)<br> 
 * ARQ-14: Repeating Interval Duration (ST)<br> 
 * ARQ-15: Placer Contact Person (XCN)<br> 
 * ARQ-16: Placer Contact Phone Number (XTN)<br> 
 * ARQ-17: Placer Contact Address (XAD)<br> 
 * ARQ-18: Placer Contact Location (PL)<br> 
 * ARQ-19: Entered By Person (XCN)<br> 
 * ARQ-20: Entered By Phone Number (XTN)<br> 
 * ARQ-21: Entered By Location (PL)<br> 
 * ARQ-22: Parent Placer Appointment ID (EI)<br> 
 * ARQ-23: Parent Filler Appointment ID (EI)<br> 
 * ARQ-24: Placer Order Number (EI)<br> 
 * ARQ-25: Filler Order Number (EI)<br> 
 * </p><p>The get...() methods return data from individual fields.  These methods 
 * do not throw exceptions and may therefore have to handle exceptions internally.  
 * If an exception is handled internally, it is logged and null is returned.  
 * This is not expected to happen - if it does happen this indicates not so much 
 * an exceptional circumstance as a bug in the code for this class.</p>    
 */
public class ARQ extends AbstractSegment  {

  /**
   * Creates a ARQ (Appointment Request) segment object that belongs to the given 
   * message.  
   */
  public ARQ(Group parent, ModelClassFactory factory) {
    super(parent, factory);
    Message message = getMessage();
    try {
       this.add(EI.class, true, 1, 75, new Object[]{message}, "Placer Appointment ID");
       this.add(EI.class, false, 1, 75, new Object[]{message}, "Filler Appointment ID");
       this.add(NM.class, false, 1, 5, new Object[]{message}, "Occurrence Number");
       this.add(EI.class, false, 1, 22, new Object[]{message}, "Placer Group Number");
       this.add(CWE.class, false, 1, 250, new Object[]{message}, "Schedule ID");
       this.add(CWE.class, false, 1, 250, new Object[]{message}, "Request Event Reason");
       this.add(CWE.class, false, 1, 250, new Object[]{message}, "Appointment Reason");
       this.add(CWE.class, false, 1, 250, new Object[]{message}, "Appointment Type");
       this.add(NM.class, false, 1, 0, new Object[]{message}, "Appointment Duration");
       this.add(CNE.class, false, 1, 0, new Object[]{message}, "Appointment Duration Units");
       this.add(DR.class, false, 0, 49, new Object[]{message}, "Requested Start Date/Time Range");
       this.add(ST.class, false, 1, 5, new Object[]{message}, "Priority-ARQ");
       this.add(RI.class, false, 1, 100, new Object[]{message}, "Repeating Interval");
       this.add(ST.class, false, 1, 5, new Object[]{message}, "Repeating Interval Duration");
       this.add(XCN.class, true, 0, 250, new Object[]{message}, "Placer Contact Person");
       this.add(XTN.class, false, 0, 250, new Object[]{message}, "Placer Contact Phone Number");
       this.add(XAD.class, false, 0, 250, new Object[]{message}, "Placer Contact Address");
       this.add(PL.class, false, 1, 80, new Object[]{message}, "Placer Contact Location");
       this.add(XCN.class, true, 0, 250, new Object[]{message}, "Entered By Person");
       this.add(XTN.class, false, 0, 250, new Object[]{message}, "Entered By Phone Number");
       this.add(PL.class, false, 1, 80, new Object[]{message}, "Entered By Location");
       this.add(EI.class, false, 1, 75, new Object[]{message}, "Parent Placer Appointment ID");
       this.add(EI.class, false, 1, 75, new Object[]{message}, "Parent Filler Appointment ID");
       this.add(EI.class, false, 0, 427, new Object[]{message}, "Placer Order Number");
       this.add(EI.class, false, 0, 427, new Object[]{message}, "Filler Order Number");
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Can't instantiate " + this.getClass().getName(), he);
    }
  }

  /**
   * Returns Placer Appointment ID (ARQ-1).
   */
  public EI getPlacerAppointmentID()  {
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
   * Returns Placer Appointment ID (ARQ-1).
   */
  public EI getArq1_PlacerAppointmentID()  {
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
   * Returns Filler Appointment ID (ARQ-2).
   */
  public EI getFillerAppointmentID()  {
    EI ret = null;
    try {
        Type t = this.getField(2, 0);
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
   * Returns Filler Appointment ID (ARQ-2).
   */
  public EI getArq2_FillerAppointmentID()  {
    EI ret = null;
    try {
        Type t = this.getField(2, 0);
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
   * Returns Occurrence Number (ARQ-3).
   */
  public NM getOccurrenceNumber()  {
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
   * Returns Occurrence Number (ARQ-3).
   */
  public NM getArq3_OccurrenceNumber()  {
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
   * Returns Placer Group Number (ARQ-4).
   */
  public EI getPlacerGroupNumber()  {
    EI ret = null;
    try {
        Type t = this.getField(4, 0);
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
   * Returns Placer Group Number (ARQ-4).
   */
  public EI getArq4_PlacerGroupNumber()  {
    EI ret = null;
    try {
        Type t = this.getField(4, 0);
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
   * Returns Schedule ID (ARQ-5).
   */
  public CWE getScheduleID()  {
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
   * Returns Schedule ID (ARQ-5).
   */
  public CWE getArq5_ScheduleID()  {
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
   * Returns Request Event Reason (ARQ-6).
   */
  public CWE getRequestEventReason()  {
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
   * Returns Request Event Reason (ARQ-6).
   */
  public CWE getArq6_RequestEventReason()  {
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
   * Returns Appointment Reason (ARQ-7).
   */
  public CWE getAppointmentReason()  {
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
   * Returns Appointment Reason (ARQ-7).
   */
  public CWE getArq7_AppointmentReason()  {
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
   * Returns Appointment Type (ARQ-8).
   */
  public CWE getAppointmentType()  {
    CWE ret = null;
    try {
        Type t = this.getField(8, 0);
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
   * Returns Appointment Type (ARQ-8).
   */
  public CWE getArq8_AppointmentType()  {
    CWE ret = null;
    try {
        Type t = this.getField(8, 0);
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
   * Returns Appointment Duration (ARQ-9).
   */
  public NM getAppointmentDuration()  {
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
   * Returns Appointment Duration (ARQ-9).
   */
  public NM getArq9_AppointmentDuration()  {
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
   * Returns Appointment Duration Units (ARQ-10).
   */
  public CNE getAppointmentDurationUnits()  {
    CNE ret = null;
    try {
        Type t = this.getField(10, 0);
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
   * Returns Appointment Duration Units (ARQ-10).
   */
  public CNE getArq10_AppointmentDurationUnits()  {
    CNE ret = null;
    try {
        Type t = this.getField(10, 0);
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
   * Returns a single repetition of Requested Start Date/Time Range (ARQ-11).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public DR getRequestedStartDateTimeRange(int rep) throws HL7Exception {
    DR ret = null;
    try {
        Type t = this.getField(11, rep);
        ret = (DR)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Requested Start Date/Time Range (ARQ-11).
   */
  public DR[] getRequestedStartDateTimeRange() {
     DR[] ret = null;
    try {
        Type[] t = this.getField(11);  
        ret = new DR[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (DR)t[i];
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
   * Returns a count of the number of repetitions of Requested Start Date/Time Range (ARQ-11).
   */
  public int getRequestedStartDateTimeRangeReps() {
    try {
        return this.getField(11).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Requested Start Date/Time Range (ARQ-11) at a given index and returns it.
   * @param index The index
   */
  public DR insertRequestedStartDateTimeRange(int index) throws HL7Exception {
     return (DR) super.insertRepetition(11, index);
  }

  /**
   * Removes a repetition of Requested Start Date/Time Range (ARQ-11) at a given index and returns it.
   * @param index The index
   */
  public DR removeRequestedStartDateTimeRange(int index) throws HL7Exception {
     return (DR) super.removeRepetition(11, index);
  }

  /**
   * Returns a single repetition of Requested Start Date/Time Range (ARQ-11).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public DR getArq11_RequestedStartDateTimeRange(int rep) throws HL7Exception {
    DR ret = null;
    try {
        Type t = this.getField(11, rep);
        ret = (DR)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Requested Start Date/Time Range (ARQ-11).
   */
  public DR[] getArq11_RequestedStartDateTimeRange() {
     DR[] ret = null;
    try {
        Type[] t = this.getField(11);  
        ret = new DR[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (DR)t[i];
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
   * Returns a count of the number of repetitions of Requested Start Date/Time Range (ARQ-11).
   */
  public int getArq11_RequestedStartDateTimeRangeReps() {
    try {
        return this.getField(11).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Requested Start Date/Time Range (ARQ-11) at a given index and returns it.
   * @param index The index
   */
  public DR insertArq11_RequestedStartDateTimeRange(int index) throws HL7Exception {
     return (DR) super.insertRepetition(11, index);
  }

  /**
   * Removes a repetition of Requested Start Date/Time Range (ARQ-11) at a given index and returns it.
   * @param index The index
   */
  public DR removeArq11_RequestedStartDateTimeRange(int index) throws HL7Exception {
     return (DR) super.removeRepetition(11, index);
  }

  /**
   * Returns Priority-ARQ (ARQ-12).
   */
  public ST getPriorityARQ()  {
    ST ret = null;
    try {
        Type t = this.getField(12, 0);
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
   * Returns Priority-ARQ (ARQ-12).
   */
  public ST getArq12_PriorityARQ()  {
    ST ret = null;
    try {
        Type t = this.getField(12, 0);
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
   * Returns Repeating Interval (ARQ-13).
   */
  public RI getRepeatingInterval()  {
    RI ret = null;
    try {
        Type t = this.getField(13, 0);
        ret = (RI)t;
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
   * Returns Repeating Interval (ARQ-13).
   */
  public RI getArq13_RepeatingInterval()  {
    RI ret = null;
    try {
        Type t = this.getField(13, 0);
        ret = (RI)t;
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
   * Returns Repeating Interval Duration (ARQ-14).
   */
  public ST getRepeatingIntervalDuration()  {
    ST ret = null;
    try {
        Type t = this.getField(14, 0);
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
   * Returns Repeating Interval Duration (ARQ-14).
   */
  public ST getArq14_RepeatingIntervalDuration()  {
    ST ret = null;
    try {
        Type t = this.getField(14, 0);
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
   * Returns a single repetition of Placer Contact Person (ARQ-15).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XCN getPlacerContactPerson(int rep) throws HL7Exception {
    XCN ret = null;
    try {
        Type t = this.getField(15, rep);
        ret = (XCN)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Placer Contact Person (ARQ-15).
   */
  public XCN[] getPlacerContactPerson() {
     XCN[] ret = null;
    try {
        Type[] t = this.getField(15);  
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
   * Returns a count of the number of repetitions of Placer Contact Person (ARQ-15).
   */
  public int getPlacerContactPersonReps() {
    try {
        return this.getField(15).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Placer Contact Person (ARQ-15) at a given index and returns it.
   * @param index The index
   */
  public XCN insertPlacerContactPerson(int index) throws HL7Exception {
     return (XCN) super.insertRepetition(15, index);
  }

  /**
   * Removes a repetition of Placer Contact Person (ARQ-15) at a given index and returns it.
   * @param index The index
   */
  public XCN removePlacerContactPerson(int index) throws HL7Exception {
     return (XCN) super.removeRepetition(15, index);
  }

  /**
   * Returns a single repetition of Placer Contact Person (ARQ-15).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XCN getArq15_PlacerContactPerson(int rep) throws HL7Exception {
    XCN ret = null;
    try {
        Type t = this.getField(15, rep);
        ret = (XCN)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Placer Contact Person (ARQ-15).
   */
  public XCN[] getArq15_PlacerContactPerson() {
     XCN[] ret = null;
    try {
        Type[] t = this.getField(15);  
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
   * Returns a count of the number of repetitions of Placer Contact Person (ARQ-15).
   */
  public int getArq15_PlacerContactPersonReps() {
    try {
        return this.getField(15).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Placer Contact Person (ARQ-15) at a given index and returns it.
   * @param index The index
   */
  public XCN insertArq15_PlacerContactPerson(int index) throws HL7Exception {
     return (XCN) super.insertRepetition(15, index);
  }

  /**
   * Removes a repetition of Placer Contact Person (ARQ-15) at a given index and returns it.
   * @param index The index
   */
  public XCN removeArq15_PlacerContactPerson(int index) throws HL7Exception {
     return (XCN) super.removeRepetition(15, index);
  }

  /**
   * Returns a single repetition of Placer Contact Phone Number (ARQ-16).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XTN getPlacerContactPhoneNumber(int rep) throws HL7Exception {
    XTN ret = null;
    try {
        Type t = this.getField(16, rep);
        ret = (XTN)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Placer Contact Phone Number (ARQ-16).
   */
  public XTN[] getPlacerContactPhoneNumber() {
     XTN[] ret = null;
    try {
        Type[] t = this.getField(16);  
        ret = new XTN[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (XTN)t[i];
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
   * Returns a count of the number of repetitions of Placer Contact Phone Number (ARQ-16).
   */
  public int getPlacerContactPhoneNumberReps() {
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
   * Inserts a repetition of Placer Contact Phone Number (ARQ-16) at a given index and returns it.
   * @param index The index
   */
  public XTN insertPlacerContactPhoneNumber(int index) throws HL7Exception {
     return (XTN) super.insertRepetition(16, index);
  }

  /**
   * Removes a repetition of Placer Contact Phone Number (ARQ-16) at a given index and returns it.
   * @param index The index
   */
  public XTN removePlacerContactPhoneNumber(int index) throws HL7Exception {
     return (XTN) super.removeRepetition(16, index);
  }

  /**
   * Returns a single repetition of Placer Contact Phone Number (ARQ-16).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XTN getArq16_PlacerContactPhoneNumber(int rep) throws HL7Exception {
    XTN ret = null;
    try {
        Type t = this.getField(16, rep);
        ret = (XTN)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Placer Contact Phone Number (ARQ-16).
   */
  public XTN[] getArq16_PlacerContactPhoneNumber() {
     XTN[] ret = null;
    try {
        Type[] t = this.getField(16);  
        ret = new XTN[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (XTN)t[i];
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
   * Returns a count of the number of repetitions of Placer Contact Phone Number (ARQ-16).
   */
  public int getArq16_PlacerContactPhoneNumberReps() {
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
   * Inserts a repetition of Placer Contact Phone Number (ARQ-16) at a given index and returns it.
   * @param index The index
   */
  public XTN insertArq16_PlacerContactPhoneNumber(int index) throws HL7Exception {
     return (XTN) super.insertRepetition(16, index);
  }

  /**
   * Removes a repetition of Placer Contact Phone Number (ARQ-16) at a given index and returns it.
   * @param index The index
   */
  public XTN removeArq16_PlacerContactPhoneNumber(int index) throws HL7Exception {
     return (XTN) super.removeRepetition(16, index);
  }

  /**
   * Returns a single repetition of Placer Contact Address (ARQ-17).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XAD getPlacerContactAddress(int rep) throws HL7Exception {
    XAD ret = null;
    try {
        Type t = this.getField(17, rep);
        ret = (XAD)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Placer Contact Address (ARQ-17).
   */
  public XAD[] getPlacerContactAddress() {
     XAD[] ret = null;
    try {
        Type[] t = this.getField(17);  
        ret = new XAD[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (XAD)t[i];
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
   * Returns a count of the number of repetitions of Placer Contact Address (ARQ-17).
   */
  public int getPlacerContactAddressReps() {
    try {
        return this.getField(17).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Placer Contact Address (ARQ-17) at a given index and returns it.
   * @param index The index
   */
  public XAD insertPlacerContactAddress(int index) throws HL7Exception {
     return (XAD) super.insertRepetition(17, index);
  }

  /**
   * Removes a repetition of Placer Contact Address (ARQ-17) at a given index and returns it.
   * @param index The index
   */
  public XAD removePlacerContactAddress(int index) throws HL7Exception {
     return (XAD) super.removeRepetition(17, index);
  }

  /**
   * Returns a single repetition of Placer Contact Address (ARQ-17).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XAD getArq17_PlacerContactAddress(int rep) throws HL7Exception {
    XAD ret = null;
    try {
        Type t = this.getField(17, rep);
        ret = (XAD)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Placer Contact Address (ARQ-17).
   */
  public XAD[] getArq17_PlacerContactAddress() {
     XAD[] ret = null;
    try {
        Type[] t = this.getField(17);  
        ret = new XAD[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (XAD)t[i];
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
   * Returns a count of the number of repetitions of Placer Contact Address (ARQ-17).
   */
  public int getArq17_PlacerContactAddressReps() {
    try {
        return this.getField(17).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Placer Contact Address (ARQ-17) at a given index and returns it.
   * @param index The index
   */
  public XAD insertArq17_PlacerContactAddress(int index) throws HL7Exception {
     return (XAD) super.insertRepetition(17, index);
  }

  /**
   * Removes a repetition of Placer Contact Address (ARQ-17) at a given index and returns it.
   * @param index The index
   */
  public XAD removeArq17_PlacerContactAddress(int index) throws HL7Exception {
     return (XAD) super.removeRepetition(17, index);
  }

  /**
   * Returns Placer Contact Location (ARQ-18).
   */
  public PL getPlacerContactLocation()  {
    PL ret = null;
    try {
        Type t = this.getField(18, 0);
        ret = (PL)t;
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
   * Returns Placer Contact Location (ARQ-18).
   */
  public PL getArq18_PlacerContactLocation()  {
    PL ret = null;
    try {
        Type t = this.getField(18, 0);
        ret = (PL)t;
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
   * Returns a single repetition of Entered By Person (ARQ-19).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XCN getEnteredByPerson(int rep) throws HL7Exception {
    XCN ret = null;
    try {
        Type t = this.getField(19, rep);
        ret = (XCN)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Entered By Person (ARQ-19).
   */
  public XCN[] getEnteredByPerson() {
     XCN[] ret = null;
    try {
        Type[] t = this.getField(19);  
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
   * Returns a count of the number of repetitions of Entered By Person (ARQ-19).
   */
  public int getEnteredByPersonReps() {
    try {
        return this.getField(19).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Entered By Person (ARQ-19) at a given index and returns it.
   * @param index The index
   */
  public XCN insertEnteredByPerson(int index) throws HL7Exception {
     return (XCN) super.insertRepetition(19, index);
  }

  /**
   * Removes a repetition of Entered By Person (ARQ-19) at a given index and returns it.
   * @param index The index
   */
  public XCN removeEnteredByPerson(int index) throws HL7Exception {
     return (XCN) super.removeRepetition(19, index);
  }

  /**
   * Returns a single repetition of Entered By Person (ARQ-19).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XCN getArq19_EnteredByPerson(int rep) throws HL7Exception {
    XCN ret = null;
    try {
        Type t = this.getField(19, rep);
        ret = (XCN)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Entered By Person (ARQ-19).
   */
  public XCN[] getArq19_EnteredByPerson() {
     XCN[] ret = null;
    try {
        Type[] t = this.getField(19);  
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
   * Returns a count of the number of repetitions of Entered By Person (ARQ-19).
   */
  public int getArq19_EnteredByPersonReps() {
    try {
        return this.getField(19).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Entered By Person (ARQ-19) at a given index and returns it.
   * @param index The index
   */
  public XCN insertArq19_EnteredByPerson(int index) throws HL7Exception {
     return (XCN) super.insertRepetition(19, index);
  }

  /**
   * Removes a repetition of Entered By Person (ARQ-19) at a given index and returns it.
   * @param index The index
   */
  public XCN removeArq19_EnteredByPerson(int index) throws HL7Exception {
     return (XCN) super.removeRepetition(19, index);
  }

  /**
   * Returns a single repetition of Entered By Phone Number (ARQ-20).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XTN getEnteredByPhoneNumber(int rep) throws HL7Exception {
    XTN ret = null;
    try {
        Type t = this.getField(20, rep);
        ret = (XTN)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Entered By Phone Number (ARQ-20).
   */
  public XTN[] getEnteredByPhoneNumber() {
     XTN[] ret = null;
    try {
        Type[] t = this.getField(20);  
        ret = new XTN[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (XTN)t[i];
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
   * Returns a count of the number of repetitions of Entered By Phone Number (ARQ-20).
   */
  public int getEnteredByPhoneNumberReps() {
    try {
        return this.getField(20).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Entered By Phone Number (ARQ-20) at a given index and returns it.
   * @param index The index
   */
  public XTN insertEnteredByPhoneNumber(int index) throws HL7Exception {
     return (XTN) super.insertRepetition(20, index);
  }

  /**
   * Removes a repetition of Entered By Phone Number (ARQ-20) at a given index and returns it.
   * @param index The index
   */
  public XTN removeEnteredByPhoneNumber(int index) throws HL7Exception {
     return (XTN) super.removeRepetition(20, index);
  }

  /**
   * Returns a single repetition of Entered By Phone Number (ARQ-20).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XTN getArq20_EnteredByPhoneNumber(int rep) throws HL7Exception {
    XTN ret = null;
    try {
        Type t = this.getField(20, rep);
        ret = (XTN)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Entered By Phone Number (ARQ-20).
   */
  public XTN[] getArq20_EnteredByPhoneNumber() {
     XTN[] ret = null;
    try {
        Type[] t = this.getField(20);  
        ret = new XTN[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (XTN)t[i];
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
   * Returns a count of the number of repetitions of Entered By Phone Number (ARQ-20).
   */
  public int getArq20_EnteredByPhoneNumberReps() {
    try {
        return this.getField(20).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Entered By Phone Number (ARQ-20) at a given index and returns it.
   * @param index The index
   */
  public XTN insertArq20_EnteredByPhoneNumber(int index) throws HL7Exception {
     return (XTN) super.insertRepetition(20, index);
  }

  /**
   * Removes a repetition of Entered By Phone Number (ARQ-20) at a given index and returns it.
   * @param index The index
   */
  public XTN removeArq20_EnteredByPhoneNumber(int index) throws HL7Exception {
     return (XTN) super.removeRepetition(20, index);
  }

  /**
   * Returns Entered By Location (ARQ-21).
   */
  public PL getEnteredByLocation()  {
    PL ret = null;
    try {
        Type t = this.getField(21, 0);
        ret = (PL)t;
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
   * Returns Entered By Location (ARQ-21).
   */
  public PL getArq21_EnteredByLocation()  {
    PL ret = null;
    try {
        Type t = this.getField(21, 0);
        ret = (PL)t;
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
   * Returns Parent Placer Appointment ID (ARQ-22).
   */
  public EI getParentPlacerAppointmentID()  {
    EI ret = null;
    try {
        Type t = this.getField(22, 0);
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
   * Returns Parent Placer Appointment ID (ARQ-22).
   */
  public EI getArq22_ParentPlacerAppointmentID()  {
    EI ret = null;
    try {
        Type t = this.getField(22, 0);
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
   * Returns Parent Filler Appointment ID (ARQ-23).
   */
  public EI getParentFillerAppointmentID()  {
    EI ret = null;
    try {
        Type t = this.getField(23, 0);
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
   * Returns Parent Filler Appointment ID (ARQ-23).
   */
  public EI getArq23_ParentFillerAppointmentID()  {
    EI ret = null;
    try {
        Type t = this.getField(23, 0);
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
   * Returns a single repetition of Placer Order Number (ARQ-24).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public EI getPlacerOrderNumber(int rep) throws HL7Exception {
    EI ret = null;
    try {
        Type t = this.getField(24, rep);
        ret = (EI)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Placer Order Number (ARQ-24).
   */
  public EI[] getPlacerOrderNumber() {
     EI[] ret = null;
    try {
        Type[] t = this.getField(24);  
        ret = new EI[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (EI)t[i];
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
   * Returns a count of the number of repetitions of Placer Order Number (ARQ-24).
   */
  public int getPlacerOrderNumberReps() {
    try {
        return this.getField(24).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Placer Order Number (ARQ-24) at a given index and returns it.
   * @param index The index
   */
  public EI insertPlacerOrderNumber(int index) throws HL7Exception {
     return (EI) super.insertRepetition(24, index);
  }

  /**
   * Removes a repetition of Placer Order Number (ARQ-24) at a given index and returns it.
   * @param index The index
   */
  public EI removePlacerOrderNumber(int index) throws HL7Exception {
     return (EI) super.removeRepetition(24, index);
  }

  /**
   * Returns a single repetition of Placer Order Number (ARQ-24).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public EI getArq24_PlacerOrderNumber(int rep) throws HL7Exception {
    EI ret = null;
    try {
        Type t = this.getField(24, rep);
        ret = (EI)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Placer Order Number (ARQ-24).
   */
  public EI[] getArq24_PlacerOrderNumber() {
     EI[] ret = null;
    try {
        Type[] t = this.getField(24);  
        ret = new EI[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (EI)t[i];
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
   * Returns a count of the number of repetitions of Placer Order Number (ARQ-24).
   */
  public int getArq24_PlacerOrderNumberReps() {
    try {
        return this.getField(24).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Placer Order Number (ARQ-24) at a given index and returns it.
   * @param index The index
   */
  public EI insertArq24_PlacerOrderNumber(int index) throws HL7Exception {
     return (EI) super.insertRepetition(24, index);
  }

  /**
   * Removes a repetition of Placer Order Number (ARQ-24) at a given index and returns it.
   * @param index The index
   */
  public EI removeArq24_PlacerOrderNumber(int index) throws HL7Exception {
     return (EI) super.removeRepetition(24, index);
  }

  /**
   * Returns a single repetition of Filler Order Number (ARQ-25).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public EI getFillerOrderNumber(int rep) throws HL7Exception {
    EI ret = null;
    try {
        Type t = this.getField(25, rep);
        ret = (EI)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Filler Order Number (ARQ-25).
   */
  public EI[] getFillerOrderNumber() {
     EI[] ret = null;
    try {
        Type[] t = this.getField(25);  
        ret = new EI[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (EI)t[i];
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
   * Returns a count of the number of repetitions of Filler Order Number (ARQ-25).
   */
  public int getFillerOrderNumberReps() {
    try {
        return this.getField(25).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Filler Order Number (ARQ-25) at a given index and returns it.
   * @param index The index
   */
  public EI insertFillerOrderNumber(int index) throws HL7Exception {
     return (EI) super.insertRepetition(25, index);
  }

  /**
   * Removes a repetition of Filler Order Number (ARQ-25) at a given index and returns it.
   * @param index The index
   */
  public EI removeFillerOrderNumber(int index) throws HL7Exception {
     return (EI) super.removeRepetition(25, index);
  }

  /**
   * Returns a single repetition of Filler Order Number (ARQ-25).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public EI getArq25_FillerOrderNumber(int rep) throws HL7Exception {
    EI ret = null;
    try {
        Type t = this.getField(25, rep);
        ret = (EI)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Filler Order Number (ARQ-25).
   */
  public EI[] getArq25_FillerOrderNumber() {
     EI[] ret = null;
    try {
        Type[] t = this.getField(25);  
        ret = new EI[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (EI)t[i];
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
   * Returns a count of the number of repetitions of Filler Order Number (ARQ-25).
   */
  public int getArq25_FillerOrderNumberReps() {
    try {
        return this.getField(25).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Filler Order Number (ARQ-25) at a given index and returns it.
   * @param index The index
   */
  public EI insertArq25_FillerOrderNumber(int index) throws HL7Exception {
     return (EI) super.insertRepetition(25, index);
  }

  /**
   * Removes a repetition of Filler Order Number (ARQ-25) at a given index and returns it.
   * @param index The index
   */
  public EI removeArq25_FillerOrderNumber(int index) throws HL7Exception {
     return (EI) super.removeRepetition(25, index);
  }

   protected Type createNewTypeWithoutReflection(int field) {
      switch (field) {
         case 0: return new ca.uhn.hl7v2.model.v26.datatype.EI(getMessage());
         case 1: return new ca.uhn.hl7v2.model.v26.datatype.EI(getMessage());
         case 2: return new ca.uhn.hl7v2.model.v26.datatype.NM(getMessage());
         case 3: return new ca.uhn.hl7v2.model.v26.datatype.EI(getMessage());
         case 4: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 5: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 6: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 7: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 8: return new ca.uhn.hl7v2.model.v26.datatype.NM(getMessage());
         case 9: return new ca.uhn.hl7v2.model.v26.datatype.CNE(getMessage());
         case 10: return new ca.uhn.hl7v2.model.v26.datatype.DR(getMessage());
         case 11: return new ca.uhn.hl7v2.model.v26.datatype.ST(getMessage());
         case 12: return new ca.uhn.hl7v2.model.v26.datatype.RI(getMessage());
         case 13: return new ca.uhn.hl7v2.model.v26.datatype.ST(getMessage());
         case 14: return new ca.uhn.hl7v2.model.v26.datatype.XCN(getMessage());
         case 15: return new ca.uhn.hl7v2.model.v26.datatype.XTN(getMessage());
         case 16: return new ca.uhn.hl7v2.model.v26.datatype.XAD(getMessage());
         case 17: return new ca.uhn.hl7v2.model.v26.datatype.PL(getMessage());
         case 18: return new ca.uhn.hl7v2.model.v26.datatype.XCN(getMessage());
         case 19: return new ca.uhn.hl7v2.model.v26.datatype.XTN(getMessage());
         case 20: return new ca.uhn.hl7v2.model.v26.datatype.PL(getMessage());
         case 21: return new ca.uhn.hl7v2.model.v26.datatype.EI(getMessage());
         case 22: return new ca.uhn.hl7v2.model.v26.datatype.EI(getMessage());
         case 23: return new ca.uhn.hl7v2.model.v26.datatype.EI(getMessage());
         case 24: return new ca.uhn.hl7v2.model.v26.datatype.EI(getMessage());
         default: return null;
      }
   }

}