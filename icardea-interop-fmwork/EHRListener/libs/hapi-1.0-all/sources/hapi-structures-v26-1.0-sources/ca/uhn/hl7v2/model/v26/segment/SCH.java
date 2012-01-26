package ca.uhn.hl7v2.model.v26.segment;

import ca.uhn.hl7v2.model.*;
import ca.uhn.hl7v2.model.v26.datatype.*;
import ca.uhn.log.HapiLogFactory;
import ca.uhn.hl7v2.parser.ModelClassFactory;
import ca.uhn.hl7v2.HL7Exception;

/**
 * <p>Represents an HL7 SCH message segment. 
 * This segment has the following fields:</p><p>
 * SCH-1: Placer Appointment ID (EI)<br> 
 * SCH-2: Filler Appointment ID (EI)<br> 
 * SCH-3: Occurrence Number (NM)<br> 
 * SCH-4: Placer Group Number (EI)<br> 
 * SCH-5: Schedule ID (CWE)<br> 
 * SCH-6: Event Reason (CWE)<br> 
 * SCH-7: Appointment Reason (CWE)<br> 
 * SCH-8: Appointment Type (CWE)<br> 
 * SCH-9: Appointment Duration (NM)<br> 
 * SCH-10: Appointment Duration Units (CNE)<br> 
 * SCH-11: Appointment Timing Quantity (TQ)<br> 
 * SCH-12: Placer Contact Person (XCN)<br> 
 * SCH-13: Placer Contact Phone Number (XTN)<br> 
 * SCH-14: Placer Contact Address (XAD)<br> 
 * SCH-15: Placer Contact Location (PL)<br> 
 * SCH-16: Filler Contact Person (XCN)<br> 
 * SCH-17: Filler Contact Phone Number (XTN)<br> 
 * SCH-18: Filler Contact Address (XAD)<br> 
 * SCH-19: Filler Contact Location (PL)<br> 
 * SCH-20: Entered By Person (XCN)<br> 
 * SCH-21: Entered By Phone Number (XTN)<br> 
 * SCH-22: Entered By Location (PL)<br> 
 * SCH-23: Parent Placer Appointment ID (EI)<br> 
 * SCH-24: Parent Filler Appointment ID (EI)<br> 
 * SCH-25: Filler Status Code (CWE)<br> 
 * SCH-26: Placer Order Number (EI)<br> 
 * SCH-27: Filler Order Number (EI)<br> 
 * </p><p>The get...() methods return data from individual fields.  These methods 
 * do not throw exceptions and may therefore have to handle exceptions internally.  
 * If an exception is handled internally, it is logged and null is returned.  
 * This is not expected to happen - if it does happen this indicates not so much 
 * an exceptional circumstance as a bug in the code for this class.</p>    
 */
public class SCH extends AbstractSegment  {

  /**
   * Creates a SCH (Scheduling Activity Information) segment object that belongs to the given 
   * message.  
   */
  public SCH(Group parent, ModelClassFactory factory) {
    super(parent, factory);
    Message message = getMessage();
    try {
       this.add(EI.class, false, 1, 75, new Object[]{message}, "Placer Appointment ID");
       this.add(EI.class, false, 1, 75, new Object[]{message}, "Filler Appointment ID");
       this.add(NM.class, false, 1, 5, new Object[]{message}, "Occurrence Number");
       this.add(EI.class, false, 1, 22, new Object[]{message}, "Placer Group Number");
       this.add(CWE.class, false, 1, 250, new Object[]{message}, "Schedule ID");
       this.add(CWE.class, true, 1, 250, new Object[]{message}, "Event Reason");
       this.add(CWE.class, false, 1, 250, new Object[]{message}, "Appointment Reason");
       this.add(CWE.class, false, 1, 250, new Object[]{message}, "Appointment Type");
       this.add(NM.class, false, 1, 0, new Object[]{message}, "Appointment Duration");
       this.add(CNE.class, false, 1, 0, new Object[]{message}, "Appointment Duration Units");
       this.add(TQ.class, false, 0, 0, new Object[]{message}, "Appointment Timing Quantity");
       this.add(XCN.class, false, 0, 250, new Object[]{message}, "Placer Contact Person");
       this.add(XTN.class, false, 1, 250, new Object[]{message}, "Placer Contact Phone Number");
       this.add(XAD.class, false, 0, 250, new Object[]{message}, "Placer Contact Address");
       this.add(PL.class, false, 1, 80, new Object[]{message}, "Placer Contact Location");
       this.add(XCN.class, true, 0, 250, new Object[]{message}, "Filler Contact Person");
       this.add(XTN.class, false, 1, 250, new Object[]{message}, "Filler Contact Phone Number");
       this.add(XAD.class, false, 0, 250, new Object[]{message}, "Filler Contact Address");
       this.add(PL.class, false, 1, 80, new Object[]{message}, "Filler Contact Location");
       this.add(XCN.class, true, 0, 250, new Object[]{message}, "Entered By Person");
       this.add(XTN.class, false, 0, 250, new Object[]{message}, "Entered By Phone Number");
       this.add(PL.class, false, 1, 80, new Object[]{message}, "Entered By Location");
       this.add(EI.class, false, 1, 75, new Object[]{message}, "Parent Placer Appointment ID");
       this.add(EI.class, false, 1, 75, new Object[]{message}, "Parent Filler Appointment ID");
       this.add(CWE.class, false, 1, 250, new Object[]{message}, "Filler Status Code");
       this.add(EI.class, false, 0, 427, new Object[]{message}, "Placer Order Number");
       this.add(EI.class, false, 0, 427, new Object[]{message}, "Filler Order Number");
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Can't instantiate " + this.getClass().getName(), he);
    }
  }

  /**
   * Returns Placer Appointment ID (SCH-1).
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
   * Returns Placer Appointment ID (SCH-1).
   */
  public EI getSch1_PlacerAppointmentID()  {
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
   * Returns Filler Appointment ID (SCH-2).
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
   * Returns Filler Appointment ID (SCH-2).
   */
  public EI getSch2_FillerAppointmentID()  {
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
   * Returns Occurrence Number (SCH-3).
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
   * Returns Occurrence Number (SCH-3).
   */
  public NM getSch3_OccurrenceNumber()  {
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
   * Returns Placer Group Number (SCH-4).
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
   * Returns Placer Group Number (SCH-4).
   */
  public EI getSch4_PlacerGroupNumber()  {
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
   * Returns Schedule ID (SCH-5).
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
   * Returns Schedule ID (SCH-5).
   */
  public CWE getSch5_ScheduleID()  {
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
   * Returns Event Reason (SCH-6).
   */
  public CWE getEventReason()  {
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
   * Returns Event Reason (SCH-6).
   */
  public CWE getSch6_EventReason()  {
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
   * Returns Appointment Reason (SCH-7).
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
   * Returns Appointment Reason (SCH-7).
   */
  public CWE getSch7_AppointmentReason()  {
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
   * Returns Appointment Type (SCH-8).
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
   * Returns Appointment Type (SCH-8).
   */
  public CWE getSch8_AppointmentType()  {
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
   * Returns Appointment Duration (SCH-9).
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
   * Returns Appointment Duration (SCH-9).
   */
  public NM getSch9_AppointmentDuration()  {
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
   * Returns Appointment Duration Units (SCH-10).
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
   * Returns Appointment Duration Units (SCH-10).
   */
  public CNE getSch10_AppointmentDurationUnits()  {
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
   * Returns a single repetition of Appointment Timing Quantity (SCH-11).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public TQ getAppointmentTimingQuantity(int rep) throws HL7Exception {
    TQ ret = null;
    try {
        Type t = this.getField(11, rep);
        ret = (TQ)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Appointment Timing Quantity (SCH-11).
   */
  public TQ[] getAppointmentTimingQuantity() {
     TQ[] ret = null;
    try {
        Type[] t = this.getField(11);  
        ret = new TQ[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (TQ)t[i];
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
   * Returns a count of the number of repetitions of Appointment Timing Quantity (SCH-11).
   */
  public int getAppointmentTimingQuantityReps() {
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
   * Inserts a repetition of Appointment Timing Quantity (SCH-11) at a given index and returns it.
   * @param index The index
   */
  public TQ insertAppointmentTimingQuantity(int index) throws HL7Exception {
     return (TQ) super.insertRepetition(11, index);
  }

  /**
   * Removes a repetition of Appointment Timing Quantity (SCH-11) at a given index and returns it.
   * @param index The index
   */
  public TQ removeAppointmentTimingQuantity(int index) throws HL7Exception {
     return (TQ) super.removeRepetition(11, index);
  }

  /**
   * Returns a single repetition of Appointment Timing Quantity (SCH-11).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public TQ getSch11_AppointmentTimingQuantity(int rep) throws HL7Exception {
    TQ ret = null;
    try {
        Type t = this.getField(11, rep);
        ret = (TQ)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Appointment Timing Quantity (SCH-11).
   */
  public TQ[] getSch11_AppointmentTimingQuantity() {
     TQ[] ret = null;
    try {
        Type[] t = this.getField(11);  
        ret = new TQ[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (TQ)t[i];
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
   * Returns a count of the number of repetitions of Appointment Timing Quantity (SCH-11).
   */
  public int getSch11_AppointmentTimingQuantityReps() {
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
   * Inserts a repetition of Appointment Timing Quantity (SCH-11) at a given index and returns it.
   * @param index The index
   */
  public TQ insertSch11_AppointmentTimingQuantity(int index) throws HL7Exception {
     return (TQ) super.insertRepetition(11, index);
  }

  /**
   * Removes a repetition of Appointment Timing Quantity (SCH-11) at a given index and returns it.
   * @param index The index
   */
  public TQ removeSch11_AppointmentTimingQuantity(int index) throws HL7Exception {
     return (TQ) super.removeRepetition(11, index);
  }

  /**
   * Returns a single repetition of Placer Contact Person (SCH-12).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XCN getPlacerContactPerson(int rep) throws HL7Exception {
    XCN ret = null;
    try {
        Type t = this.getField(12, rep);
        ret = (XCN)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Placer Contact Person (SCH-12).
   */
  public XCN[] getPlacerContactPerson() {
     XCN[] ret = null;
    try {
        Type[] t = this.getField(12);  
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
   * Returns a count of the number of repetitions of Placer Contact Person (SCH-12).
   */
  public int getPlacerContactPersonReps() {
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
   * Inserts a repetition of Placer Contact Person (SCH-12) at a given index and returns it.
   * @param index The index
   */
  public XCN insertPlacerContactPerson(int index) throws HL7Exception {
     return (XCN) super.insertRepetition(12, index);
  }

  /**
   * Removes a repetition of Placer Contact Person (SCH-12) at a given index and returns it.
   * @param index The index
   */
  public XCN removePlacerContactPerson(int index) throws HL7Exception {
     return (XCN) super.removeRepetition(12, index);
  }

  /**
   * Returns a single repetition of Placer Contact Person (SCH-12).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XCN getSch12_PlacerContactPerson(int rep) throws HL7Exception {
    XCN ret = null;
    try {
        Type t = this.getField(12, rep);
        ret = (XCN)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Placer Contact Person (SCH-12).
   */
  public XCN[] getSch12_PlacerContactPerson() {
     XCN[] ret = null;
    try {
        Type[] t = this.getField(12);  
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
   * Returns a count of the number of repetitions of Placer Contact Person (SCH-12).
   */
  public int getSch12_PlacerContactPersonReps() {
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
   * Inserts a repetition of Placer Contact Person (SCH-12) at a given index and returns it.
   * @param index The index
   */
  public XCN insertSch12_PlacerContactPerson(int index) throws HL7Exception {
     return (XCN) super.insertRepetition(12, index);
  }

  /**
   * Removes a repetition of Placer Contact Person (SCH-12) at a given index and returns it.
   * @param index The index
   */
  public XCN removeSch12_PlacerContactPerson(int index) throws HL7Exception {
     return (XCN) super.removeRepetition(12, index);
  }

  /**
   * Returns Placer Contact Phone Number (SCH-13).
   */
  public XTN getPlacerContactPhoneNumber()  {
    XTN ret = null;
    try {
        Type t = this.getField(13, 0);
        ret = (XTN)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns Placer Contact Phone Number (SCH-13).
   */
  public XTN getSch13_PlacerContactPhoneNumber()  {
    XTN ret = null;
    try {
        Type t = this.getField(13, 0);
        ret = (XTN)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns a single repetition of Placer Contact Address (SCH-14).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XAD getPlacerContactAddress(int rep) throws HL7Exception {
    XAD ret = null;
    try {
        Type t = this.getField(14, rep);
        ret = (XAD)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Placer Contact Address (SCH-14).
   */
  public XAD[] getPlacerContactAddress() {
     XAD[] ret = null;
    try {
        Type[] t = this.getField(14);  
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
   * Returns a count of the number of repetitions of Placer Contact Address (SCH-14).
   */
  public int getPlacerContactAddressReps() {
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
   * Inserts a repetition of Placer Contact Address (SCH-14) at a given index and returns it.
   * @param index The index
   */
  public XAD insertPlacerContactAddress(int index) throws HL7Exception {
     return (XAD) super.insertRepetition(14, index);
  }

  /**
   * Removes a repetition of Placer Contact Address (SCH-14) at a given index and returns it.
   * @param index The index
   */
  public XAD removePlacerContactAddress(int index) throws HL7Exception {
     return (XAD) super.removeRepetition(14, index);
  }

  /**
   * Returns a single repetition of Placer Contact Address (SCH-14).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XAD getSch14_PlacerContactAddress(int rep) throws HL7Exception {
    XAD ret = null;
    try {
        Type t = this.getField(14, rep);
        ret = (XAD)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Placer Contact Address (SCH-14).
   */
  public XAD[] getSch14_PlacerContactAddress() {
     XAD[] ret = null;
    try {
        Type[] t = this.getField(14);  
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
   * Returns a count of the number of repetitions of Placer Contact Address (SCH-14).
   */
  public int getSch14_PlacerContactAddressReps() {
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
   * Inserts a repetition of Placer Contact Address (SCH-14) at a given index and returns it.
   * @param index The index
   */
  public XAD insertSch14_PlacerContactAddress(int index) throws HL7Exception {
     return (XAD) super.insertRepetition(14, index);
  }

  /**
   * Removes a repetition of Placer Contact Address (SCH-14) at a given index and returns it.
   * @param index The index
   */
  public XAD removeSch14_PlacerContactAddress(int index) throws HL7Exception {
     return (XAD) super.removeRepetition(14, index);
  }

  /**
   * Returns Placer Contact Location (SCH-15).
   */
  public PL getPlacerContactLocation()  {
    PL ret = null;
    try {
        Type t = this.getField(15, 0);
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
   * Returns Placer Contact Location (SCH-15).
   */
  public PL getSch15_PlacerContactLocation()  {
    PL ret = null;
    try {
        Type t = this.getField(15, 0);
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
   * Returns a single repetition of Filler Contact Person (SCH-16).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XCN getFillerContactPerson(int rep) throws HL7Exception {
    XCN ret = null;
    try {
        Type t = this.getField(16, rep);
        ret = (XCN)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Filler Contact Person (SCH-16).
   */
  public XCN[] getFillerContactPerson() {
     XCN[] ret = null;
    try {
        Type[] t = this.getField(16);  
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
   * Returns a count of the number of repetitions of Filler Contact Person (SCH-16).
   */
  public int getFillerContactPersonReps() {
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
   * Inserts a repetition of Filler Contact Person (SCH-16) at a given index and returns it.
   * @param index The index
   */
  public XCN insertFillerContactPerson(int index) throws HL7Exception {
     return (XCN) super.insertRepetition(16, index);
  }

  /**
   * Removes a repetition of Filler Contact Person (SCH-16) at a given index and returns it.
   * @param index The index
   */
  public XCN removeFillerContactPerson(int index) throws HL7Exception {
     return (XCN) super.removeRepetition(16, index);
  }

  /**
   * Returns a single repetition of Filler Contact Person (SCH-16).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XCN getSch16_FillerContactPerson(int rep) throws HL7Exception {
    XCN ret = null;
    try {
        Type t = this.getField(16, rep);
        ret = (XCN)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Filler Contact Person (SCH-16).
   */
  public XCN[] getSch16_FillerContactPerson() {
     XCN[] ret = null;
    try {
        Type[] t = this.getField(16);  
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
   * Returns a count of the number of repetitions of Filler Contact Person (SCH-16).
   */
  public int getSch16_FillerContactPersonReps() {
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
   * Inserts a repetition of Filler Contact Person (SCH-16) at a given index and returns it.
   * @param index The index
   */
  public XCN insertSch16_FillerContactPerson(int index) throws HL7Exception {
     return (XCN) super.insertRepetition(16, index);
  }

  /**
   * Removes a repetition of Filler Contact Person (SCH-16) at a given index and returns it.
   * @param index The index
   */
  public XCN removeSch16_FillerContactPerson(int index) throws HL7Exception {
     return (XCN) super.removeRepetition(16, index);
  }

  /**
   * Returns Filler Contact Phone Number (SCH-17).
   */
  public XTN getFillerContactPhoneNumber()  {
    XTN ret = null;
    try {
        Type t = this.getField(17, 0);
        ret = (XTN)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns Filler Contact Phone Number (SCH-17).
   */
  public XTN getSch17_FillerContactPhoneNumber()  {
    XTN ret = null;
    try {
        Type t = this.getField(17, 0);
        ret = (XTN)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns a single repetition of Filler Contact Address (SCH-18).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XAD getFillerContactAddress(int rep) throws HL7Exception {
    XAD ret = null;
    try {
        Type t = this.getField(18, rep);
        ret = (XAD)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Filler Contact Address (SCH-18).
   */
  public XAD[] getFillerContactAddress() {
     XAD[] ret = null;
    try {
        Type[] t = this.getField(18);  
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
   * Returns a count of the number of repetitions of Filler Contact Address (SCH-18).
   */
  public int getFillerContactAddressReps() {
    try {
        return this.getField(18).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Filler Contact Address (SCH-18) at a given index and returns it.
   * @param index The index
   */
  public XAD insertFillerContactAddress(int index) throws HL7Exception {
     return (XAD) super.insertRepetition(18, index);
  }

  /**
   * Removes a repetition of Filler Contact Address (SCH-18) at a given index and returns it.
   * @param index The index
   */
  public XAD removeFillerContactAddress(int index) throws HL7Exception {
     return (XAD) super.removeRepetition(18, index);
  }

  /**
   * Returns a single repetition of Filler Contact Address (SCH-18).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XAD getSch18_FillerContactAddress(int rep) throws HL7Exception {
    XAD ret = null;
    try {
        Type t = this.getField(18, rep);
        ret = (XAD)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Filler Contact Address (SCH-18).
   */
  public XAD[] getSch18_FillerContactAddress() {
     XAD[] ret = null;
    try {
        Type[] t = this.getField(18);  
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
   * Returns a count of the number of repetitions of Filler Contact Address (SCH-18).
   */
  public int getSch18_FillerContactAddressReps() {
    try {
        return this.getField(18).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Filler Contact Address (SCH-18) at a given index and returns it.
   * @param index The index
   */
  public XAD insertSch18_FillerContactAddress(int index) throws HL7Exception {
     return (XAD) super.insertRepetition(18, index);
  }

  /**
   * Removes a repetition of Filler Contact Address (SCH-18) at a given index and returns it.
   * @param index The index
   */
  public XAD removeSch18_FillerContactAddress(int index) throws HL7Exception {
     return (XAD) super.removeRepetition(18, index);
  }

  /**
   * Returns Filler Contact Location (SCH-19).
   */
  public PL getFillerContactLocation()  {
    PL ret = null;
    try {
        Type t = this.getField(19, 0);
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
   * Returns Filler Contact Location (SCH-19).
   */
  public PL getSch19_FillerContactLocation()  {
    PL ret = null;
    try {
        Type t = this.getField(19, 0);
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
   * Returns a single repetition of Entered By Person (SCH-20).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XCN getEnteredByPerson(int rep) throws HL7Exception {
    XCN ret = null;
    try {
        Type t = this.getField(20, rep);
        ret = (XCN)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Entered By Person (SCH-20).
   */
  public XCN[] getEnteredByPerson() {
     XCN[] ret = null;
    try {
        Type[] t = this.getField(20);  
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
   * Returns a count of the number of repetitions of Entered By Person (SCH-20).
   */
  public int getEnteredByPersonReps() {
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
   * Inserts a repetition of Entered By Person (SCH-20) at a given index and returns it.
   * @param index The index
   */
  public XCN insertEnteredByPerson(int index) throws HL7Exception {
     return (XCN) super.insertRepetition(20, index);
  }

  /**
   * Removes a repetition of Entered By Person (SCH-20) at a given index and returns it.
   * @param index The index
   */
  public XCN removeEnteredByPerson(int index) throws HL7Exception {
     return (XCN) super.removeRepetition(20, index);
  }

  /**
   * Returns a single repetition of Entered By Person (SCH-20).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XCN getSch20_EnteredByPerson(int rep) throws HL7Exception {
    XCN ret = null;
    try {
        Type t = this.getField(20, rep);
        ret = (XCN)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Entered By Person (SCH-20).
   */
  public XCN[] getSch20_EnteredByPerson() {
     XCN[] ret = null;
    try {
        Type[] t = this.getField(20);  
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
   * Returns a count of the number of repetitions of Entered By Person (SCH-20).
   */
  public int getSch20_EnteredByPersonReps() {
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
   * Inserts a repetition of Entered By Person (SCH-20) at a given index and returns it.
   * @param index The index
   */
  public XCN insertSch20_EnteredByPerson(int index) throws HL7Exception {
     return (XCN) super.insertRepetition(20, index);
  }

  /**
   * Removes a repetition of Entered By Person (SCH-20) at a given index and returns it.
   * @param index The index
   */
  public XCN removeSch20_EnteredByPerson(int index) throws HL7Exception {
     return (XCN) super.removeRepetition(20, index);
  }

  /**
   * Returns a single repetition of Entered By Phone Number (SCH-21).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XTN getEnteredByPhoneNumber(int rep) throws HL7Exception {
    XTN ret = null;
    try {
        Type t = this.getField(21, rep);
        ret = (XTN)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Entered By Phone Number (SCH-21).
   */
  public XTN[] getEnteredByPhoneNumber() {
     XTN[] ret = null;
    try {
        Type[] t = this.getField(21);  
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
   * Returns a count of the number of repetitions of Entered By Phone Number (SCH-21).
   */
  public int getEnteredByPhoneNumberReps() {
    try {
        return this.getField(21).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Entered By Phone Number (SCH-21) at a given index and returns it.
   * @param index The index
   */
  public XTN insertEnteredByPhoneNumber(int index) throws HL7Exception {
     return (XTN) super.insertRepetition(21, index);
  }

  /**
   * Removes a repetition of Entered By Phone Number (SCH-21) at a given index and returns it.
   * @param index The index
   */
  public XTN removeEnteredByPhoneNumber(int index) throws HL7Exception {
     return (XTN) super.removeRepetition(21, index);
  }

  /**
   * Returns a single repetition of Entered By Phone Number (SCH-21).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XTN getSch21_EnteredByPhoneNumber(int rep) throws HL7Exception {
    XTN ret = null;
    try {
        Type t = this.getField(21, rep);
        ret = (XTN)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Entered By Phone Number (SCH-21).
   */
  public XTN[] getSch21_EnteredByPhoneNumber() {
     XTN[] ret = null;
    try {
        Type[] t = this.getField(21);  
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
   * Returns a count of the number of repetitions of Entered By Phone Number (SCH-21).
   */
  public int getSch21_EnteredByPhoneNumberReps() {
    try {
        return this.getField(21).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Entered By Phone Number (SCH-21) at a given index and returns it.
   * @param index The index
   */
  public XTN insertSch21_EnteredByPhoneNumber(int index) throws HL7Exception {
     return (XTN) super.insertRepetition(21, index);
  }

  /**
   * Removes a repetition of Entered By Phone Number (SCH-21) at a given index and returns it.
   * @param index The index
   */
  public XTN removeSch21_EnteredByPhoneNumber(int index) throws HL7Exception {
     return (XTN) super.removeRepetition(21, index);
  }

  /**
   * Returns Entered By Location (SCH-22).
   */
  public PL getEnteredByLocation()  {
    PL ret = null;
    try {
        Type t = this.getField(22, 0);
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
   * Returns Entered By Location (SCH-22).
   */
  public PL getSch22_EnteredByLocation()  {
    PL ret = null;
    try {
        Type t = this.getField(22, 0);
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
   * Returns Parent Placer Appointment ID (SCH-23).
   */
  public EI getParentPlacerAppointmentID()  {
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
   * Returns Parent Placer Appointment ID (SCH-23).
   */
  public EI getSch23_ParentPlacerAppointmentID()  {
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
   * Returns Parent Filler Appointment ID (SCH-24).
   */
  public EI getParentFillerAppointmentID()  {
    EI ret = null;
    try {
        Type t = this.getField(24, 0);
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
   * Returns Parent Filler Appointment ID (SCH-24).
   */
  public EI getSch24_ParentFillerAppointmentID()  {
    EI ret = null;
    try {
        Type t = this.getField(24, 0);
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
   * Returns Filler Status Code (SCH-25).
   */
  public CWE getFillerStatusCode()  {
    CWE ret = null;
    try {
        Type t = this.getField(25, 0);
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
   * Returns Filler Status Code (SCH-25).
   */
  public CWE getSch25_FillerStatusCode()  {
    CWE ret = null;
    try {
        Type t = this.getField(25, 0);
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
   * Returns a single repetition of Placer Order Number (SCH-26).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public EI getPlacerOrderNumber(int rep) throws HL7Exception {
    EI ret = null;
    try {
        Type t = this.getField(26, rep);
        ret = (EI)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Placer Order Number (SCH-26).
   */
  public EI[] getPlacerOrderNumber() {
     EI[] ret = null;
    try {
        Type[] t = this.getField(26);  
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
   * Returns a count of the number of repetitions of Placer Order Number (SCH-26).
   */
  public int getPlacerOrderNumberReps() {
    try {
        return this.getField(26).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Placer Order Number (SCH-26) at a given index and returns it.
   * @param index The index
   */
  public EI insertPlacerOrderNumber(int index) throws HL7Exception {
     return (EI) super.insertRepetition(26, index);
  }

  /**
   * Removes a repetition of Placer Order Number (SCH-26) at a given index and returns it.
   * @param index The index
   */
  public EI removePlacerOrderNumber(int index) throws HL7Exception {
     return (EI) super.removeRepetition(26, index);
  }

  /**
   * Returns a single repetition of Placer Order Number (SCH-26).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public EI getSch26_PlacerOrderNumber(int rep) throws HL7Exception {
    EI ret = null;
    try {
        Type t = this.getField(26, rep);
        ret = (EI)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Placer Order Number (SCH-26).
   */
  public EI[] getSch26_PlacerOrderNumber() {
     EI[] ret = null;
    try {
        Type[] t = this.getField(26);  
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
   * Returns a count of the number of repetitions of Placer Order Number (SCH-26).
   */
  public int getSch26_PlacerOrderNumberReps() {
    try {
        return this.getField(26).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Placer Order Number (SCH-26) at a given index and returns it.
   * @param index The index
   */
  public EI insertSch26_PlacerOrderNumber(int index) throws HL7Exception {
     return (EI) super.insertRepetition(26, index);
  }

  /**
   * Removes a repetition of Placer Order Number (SCH-26) at a given index and returns it.
   * @param index The index
   */
  public EI removeSch26_PlacerOrderNumber(int index) throws HL7Exception {
     return (EI) super.removeRepetition(26, index);
  }

  /**
   * Returns a single repetition of Filler Order Number (SCH-27).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public EI getFillerOrderNumber(int rep) throws HL7Exception {
    EI ret = null;
    try {
        Type t = this.getField(27, rep);
        ret = (EI)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Filler Order Number (SCH-27).
   */
  public EI[] getFillerOrderNumber() {
     EI[] ret = null;
    try {
        Type[] t = this.getField(27);  
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
   * Returns a count of the number of repetitions of Filler Order Number (SCH-27).
   */
  public int getFillerOrderNumberReps() {
    try {
        return this.getField(27).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Filler Order Number (SCH-27) at a given index and returns it.
   * @param index The index
   */
  public EI insertFillerOrderNumber(int index) throws HL7Exception {
     return (EI) super.insertRepetition(27, index);
  }

  /**
   * Removes a repetition of Filler Order Number (SCH-27) at a given index and returns it.
   * @param index The index
   */
  public EI removeFillerOrderNumber(int index) throws HL7Exception {
     return (EI) super.removeRepetition(27, index);
  }

  /**
   * Returns a single repetition of Filler Order Number (SCH-27).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public EI getSch27_FillerOrderNumber(int rep) throws HL7Exception {
    EI ret = null;
    try {
        Type t = this.getField(27, rep);
        ret = (EI)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Filler Order Number (SCH-27).
   */
  public EI[] getSch27_FillerOrderNumber() {
     EI[] ret = null;
    try {
        Type[] t = this.getField(27);  
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
   * Returns a count of the number of repetitions of Filler Order Number (SCH-27).
   */
  public int getSch27_FillerOrderNumberReps() {
    try {
        return this.getField(27).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Filler Order Number (SCH-27) at a given index and returns it.
   * @param index The index
   */
  public EI insertSch27_FillerOrderNumber(int index) throws HL7Exception {
     return (EI) super.insertRepetition(27, index);
  }

  /**
   * Removes a repetition of Filler Order Number (SCH-27) at a given index and returns it.
   * @param index The index
   */
  public EI removeSch27_FillerOrderNumber(int index) throws HL7Exception {
     return (EI) super.removeRepetition(27, index);
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
         case 10: return new ca.uhn.hl7v2.model.v26.datatype.TQ(getMessage());
         case 11: return new ca.uhn.hl7v2.model.v26.datatype.XCN(getMessage());
         case 12: return new ca.uhn.hl7v2.model.v26.datatype.XTN(getMessage());
         case 13: return new ca.uhn.hl7v2.model.v26.datatype.XAD(getMessage());
         case 14: return new ca.uhn.hl7v2.model.v26.datatype.PL(getMessage());
         case 15: return new ca.uhn.hl7v2.model.v26.datatype.XCN(getMessage());
         case 16: return new ca.uhn.hl7v2.model.v26.datatype.XTN(getMessage());
         case 17: return new ca.uhn.hl7v2.model.v26.datatype.XAD(getMessage());
         case 18: return new ca.uhn.hl7v2.model.v26.datatype.PL(getMessage());
         case 19: return new ca.uhn.hl7v2.model.v26.datatype.XCN(getMessage());
         case 20: return new ca.uhn.hl7v2.model.v26.datatype.XTN(getMessage());
         case 21: return new ca.uhn.hl7v2.model.v26.datatype.PL(getMessage());
         case 22: return new ca.uhn.hl7v2.model.v26.datatype.EI(getMessage());
         case 23: return new ca.uhn.hl7v2.model.v26.datatype.EI(getMessage());
         case 24: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 25: return new ca.uhn.hl7v2.model.v26.datatype.EI(getMessage());
         case 26: return new ca.uhn.hl7v2.model.v26.datatype.EI(getMessage());
         default: return null;
      }
   }

}