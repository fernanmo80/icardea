package ca.uhn.hl7v2.model.v26.segment;

import ca.uhn.hl7v2.model.*;
import ca.uhn.hl7v2.model.v26.datatype.*;
import ca.uhn.log.HapiLogFactory;
import ca.uhn.hl7v2.parser.ModelClassFactory;
import ca.uhn.hl7v2.HL7Exception;

/**
 * <p>Represents an HL7 EVN message segment. 
 * This segment has the following fields:</p><p>
 * EVN-1: Event Type Code (ID)<br> 
 * EVN-2: Recorded Date/Time (DTM)<br> 
 * EVN-3: Date/Time Planned Event (DTM)<br> 
 * EVN-4: Event Reason Code (IS)<br> 
 * EVN-5: Operator ID (XCN)<br> 
 * EVN-6: Event Occurred (DTM)<br> 
 * EVN-7: Event Facility (HD)<br> 
 * </p><p>The get...() methods return data from individual fields.  These methods 
 * do not throw exceptions and may therefore have to handle exceptions internally.  
 * If an exception is handled internally, it is logged and null is returned.  
 * This is not expected to happen - if it does happen this indicates not so much 
 * an exceptional circumstance as a bug in the code for this class.</p>    
 */
public class EVN extends AbstractSegment  {

  /**
   * Creates a EVN (Event Type) segment object that belongs to the given 
   * message.  
   */
  public EVN(Group parent, ModelClassFactory factory) {
    super(parent, factory);
    Message message = getMessage();
    try {
       this.add(ID.class, false, 1, 0, new Object[]{message, new Integer(3)}, "Event Type Code");
       this.add(DTM.class, true, 1, 24, new Object[]{message}, "Recorded Date/Time");
       this.add(DTM.class, false, 1, 24, new Object[]{message}, "Date/Time Planned Event");
       this.add(IS.class, false, 1, 3, new Object[]{message, new Integer(62)}, "Event Reason Code");
       this.add(XCN.class, false, 0, 250, new Object[]{message}, "Operator ID");
       this.add(DTM.class, false, 1, 24, new Object[]{message}, "Event Occurred");
       this.add(HD.class, false, 1, 241, new Object[]{message}, "Event Facility");
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Can't instantiate " + this.getClass().getName(), he);
    }
  }

  /**
   * Returns Event Type Code (EVN-1).
   */
  public ID getEventTypeCode()  {
    ID ret = null;
    try {
        Type t = this.getField(1, 0);
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
   * Returns Event Type Code (EVN-1).
   */
  public ID getEvn1_EventTypeCode()  {
    ID ret = null;
    try {
        Type t = this.getField(1, 0);
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
   * Returns Recorded Date/Time (EVN-2).
   */
  public DTM getRecordedDateTime()  {
    DTM ret = null;
    try {
        Type t = this.getField(2, 0);
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
   * Returns Recorded Date/Time (EVN-2).
   */
  public DTM getEvn2_RecordedDateTime()  {
    DTM ret = null;
    try {
        Type t = this.getField(2, 0);
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
   * Returns Date/Time Planned Event (EVN-3).
   */
  public DTM getDateTimePlannedEvent()  {
    DTM ret = null;
    try {
        Type t = this.getField(3, 0);
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
   * Returns Date/Time Planned Event (EVN-3).
   */
  public DTM getEvn3_DateTimePlannedEvent()  {
    DTM ret = null;
    try {
        Type t = this.getField(3, 0);
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
   * Returns Event Reason Code (EVN-4).
   */
  public IS getEventReasonCode()  {
    IS ret = null;
    try {
        Type t = this.getField(4, 0);
        ret = (IS)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns Event Reason Code (EVN-4).
   */
  public IS getEvn4_EventReasonCode()  {
    IS ret = null;
    try {
        Type t = this.getField(4, 0);
        ret = (IS)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns a single repetition of Operator ID (EVN-5).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XCN getOperatorID(int rep) throws HL7Exception {
    XCN ret = null;
    try {
        Type t = this.getField(5, rep);
        ret = (XCN)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Operator ID (EVN-5).
   */
  public XCN[] getOperatorID() {
     XCN[] ret = null;
    try {
        Type[] t = this.getField(5);  
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
   * Returns a count of the number of repetitions of Operator ID (EVN-5).
   */
  public int getOperatorIDReps() {
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
   * Inserts a repetition of Operator ID (EVN-5) at a given index and returns it.
   * @param index The index
   */
  public XCN insertOperatorID(int index) throws HL7Exception {
     return (XCN) super.insertRepetition(5, index);
  }

  /**
   * Removes a repetition of Operator ID (EVN-5) at a given index and returns it.
   * @param index The index
   */
  public XCN removeOperatorID(int index) throws HL7Exception {
     return (XCN) super.removeRepetition(5, index);
  }

  /**
   * Returns a single repetition of Operator ID (EVN-5).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XCN getEvn5_OperatorID(int rep) throws HL7Exception {
    XCN ret = null;
    try {
        Type t = this.getField(5, rep);
        ret = (XCN)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Operator ID (EVN-5).
   */
  public XCN[] getEvn5_OperatorID() {
     XCN[] ret = null;
    try {
        Type[] t = this.getField(5);  
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
   * Returns a count of the number of repetitions of Operator ID (EVN-5).
   */
  public int getEvn5_OperatorIDReps() {
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
   * Inserts a repetition of Operator ID (EVN-5) at a given index and returns it.
   * @param index The index
   */
  public XCN insertEvn5_OperatorID(int index) throws HL7Exception {
     return (XCN) super.insertRepetition(5, index);
  }

  /**
   * Removes a repetition of Operator ID (EVN-5) at a given index and returns it.
   * @param index The index
   */
  public XCN removeEvn5_OperatorID(int index) throws HL7Exception {
     return (XCN) super.removeRepetition(5, index);
  }

  /**
   * Returns Event Occurred (EVN-6).
   */
  public DTM getEventOccurred()  {
    DTM ret = null;
    try {
        Type t = this.getField(6, 0);
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
   * Returns Event Occurred (EVN-6).
   */
  public DTM getEvn6_EventOccurred()  {
    DTM ret = null;
    try {
        Type t = this.getField(6, 0);
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
   * Returns Event Facility (EVN-7).
   */
  public HD getEventFacility()  {
    HD ret = null;
    try {
        Type t = this.getField(7, 0);
        ret = (HD)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns Event Facility (EVN-7).
   */
  public HD getEvn7_EventFacility()  {
    HD ret = null;
    try {
        Type t = this.getField(7, 0);
        ret = (HD)t;
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
         case 0: return new ca.uhn.hl7v2.model.v26.datatype.ID(getMessage(), new Integer(3));
         case 1: return new ca.uhn.hl7v2.model.v26.datatype.DTM(getMessage());
         case 2: return new ca.uhn.hl7v2.model.v26.datatype.DTM(getMessage());
         case 3: return new ca.uhn.hl7v2.model.v26.datatype.IS(getMessage(), new Integer(62));
         case 4: return new ca.uhn.hl7v2.model.v26.datatype.XCN(getMessage());
         case 5: return new ca.uhn.hl7v2.model.v26.datatype.DTM(getMessage());
         case 6: return new ca.uhn.hl7v2.model.v26.datatype.HD(getMessage());
         default: return null;
      }
   }

}