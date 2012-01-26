package ca.uhn.hl7v2.model.v26.segment;

import ca.uhn.hl7v2.model.*;
import ca.uhn.hl7v2.model.v26.datatype.*;
import ca.uhn.log.HapiLogFactory;
import ca.uhn.hl7v2.parser.ModelClassFactory;
import ca.uhn.hl7v2.HL7Exception;

/**
 * <p>Represents an HL7 MSH message segment. 
 * This segment has the following fields:</p><p>
 * MSH-1: Field Separator (ST)<br> 
 * MSH-2: Encoding Characters (ST)<br> 
 * MSH-3: Sending Application (HD)<br> 
 * MSH-4: Sending Facility (HD)<br> 
 * MSH-5: Receiving Application (HD)<br> 
 * MSH-6: Receiving Facility (HD)<br> 
 * MSH-7: Date/Time of Message (DTM)<br> 
 * MSH-8: Security (ST)<br> 
 * MSH-9: Message Type (MSG)<br> 
 * MSH-10: Message Control ID (ST)<br> 
 * MSH-11: Processing ID (PT)<br> 
 * MSH-12: Version ID (VID)<br> 
 * MSH-13: Sequence Number (NM)<br> 
 * MSH-14: Continuation Pointer (ST)<br> 
 * MSH-15: Accept Acknowledgment Type (ID)<br> 
 * MSH-16: Application Acknowledgment Type (ID)<br> 
 * MSH-17: Country Code (ID)<br> 
 * MSH-18: Character Set (ID)<br> 
 * MSH-19: Principal Language Of Message (CWE)<br> 
 * MSH-20: Alternate Character Set Handling Scheme (ID)<br> 
 * MSH-21: Message Profile Identifier (EI)<br> 
 * MSH-22: Sending Responsible Organization (XON)<br> 
 * MSH-23: Receiving Responsible Organization (XON)<br> 
 * MSH-24: Sending Network Address (HD)<br> 
 * MSH-25: Receiving Network Address (HD)<br> 
 * </p><p>The get...() methods return data from individual fields.  These methods 
 * do not throw exceptions and may therefore have to handle exceptions internally.  
 * If an exception is handled internally, it is logged and null is returned.  
 * This is not expected to happen - if it does happen this indicates not so much 
 * an exceptional circumstance as a bug in the code for this class.</p>    
 */
public class MSH extends AbstractSegment  {

  /**
   * Creates a MSH (Message Header) segment object that belongs to the given 
   * message.  
   */
  public MSH(Group parent, ModelClassFactory factory) {
    super(parent, factory);
    Message message = getMessage();
    try {
       this.add(ST.class, true, 1, 1, new Object[]{message}, "Field Separator");
       this.add(ST.class, true, 1, 4, new Object[]{message}, "Encoding Characters");
       this.add(HD.class, false, 1, 227, new Object[]{message}, "Sending Application");
       this.add(HD.class, false, 1, 227, new Object[]{message}, "Sending Facility");
       this.add(HD.class, false, 1, 227, new Object[]{message}, "Receiving Application");
       this.add(HD.class, false, 1, 227, new Object[]{message}, "Receiving Facility");
       this.add(DTM.class, true, 1, 24, new Object[]{message}, "Date/Time of Message");
       this.add(ST.class, false, 1, 40, new Object[]{message}, "Security");
       this.add(MSG.class, true, 1, 15, new Object[]{message}, "Message Type");
       this.add(ST.class, true, 1, 199, new Object[]{message}, "Message Control ID");
       this.add(PT.class, true, 1, 3, new Object[]{message}, "Processing ID");
       this.add(VID.class, true, 1, 60, new Object[]{message}, "Version ID");
       this.add(NM.class, false, 1, 15, new Object[]{message}, "Sequence Number");
       this.add(ST.class, false, 1, 180, new Object[]{message}, "Continuation Pointer");
       this.add(ID.class, false, 1, 2, new Object[]{message, new Integer(155)}, "Accept Acknowledgment Type");
       this.add(ID.class, false, 1, 2, new Object[]{message, new Integer(155)}, "Application Acknowledgment Type");
       this.add(ID.class, false, 1, 3, new Object[]{message, new Integer(399)}, "Country Code");
       this.add(ID.class, false, 0, 16, new Object[]{message, new Integer(211)}, "Character Set");
       this.add(CWE.class, false, 1, 250, new Object[]{message}, "Principal Language Of Message");
       this.add(ID.class, false, 1, 20, new Object[]{message, new Integer(356)}, "Alternate Character Set Handling Scheme");
       this.add(EI.class, false, 0, 427, new Object[]{message}, "Message Profile Identifier");
       this.add(XON.class, false, 1, 567, new Object[]{message}, "Sending Responsible Organization");
       this.add(XON.class, false, 1, 567, new Object[]{message}, "Receiving Responsible Organization");
       this.add(HD.class, false, 1, 227, new Object[]{message}, "Sending Network Address");
       this.add(HD.class, false, 1, 227, new Object[]{message}, "Receiving Network Address");
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Can't instantiate " + this.getClass().getName(), he);
    }
  }

  /**
   * Returns Field Separator (MSH-1).
   */
  public ST getFieldSeparator()  {
    ST ret = null;
    try {
        Type t = this.getField(1, 0);
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
   * Returns Field Separator (MSH-1).
   */
  public ST getMsh1_FieldSeparator()  {
    ST ret = null;
    try {
        Type t = this.getField(1, 0);
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
   * Returns Encoding Characters (MSH-2).
   */
  public ST getEncodingCharacters()  {
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
   * Returns Encoding Characters (MSH-2).
   */
  public ST getMsh2_EncodingCharacters()  {
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
   * Returns Sending Application (MSH-3).
   */
  public HD getSendingApplication()  {
    HD ret = null;
    try {
        Type t = this.getField(3, 0);
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
   * Returns Sending Application (MSH-3).
   */
  public HD getMsh3_SendingApplication()  {
    HD ret = null;
    try {
        Type t = this.getField(3, 0);
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
   * Returns Sending Facility (MSH-4).
   */
  public HD getSendingFacility()  {
    HD ret = null;
    try {
        Type t = this.getField(4, 0);
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
   * Returns Sending Facility (MSH-4).
   */
  public HD getMsh4_SendingFacility()  {
    HD ret = null;
    try {
        Type t = this.getField(4, 0);
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
   * Returns Receiving Application (MSH-5).
   */
  public HD getReceivingApplication()  {
    HD ret = null;
    try {
        Type t = this.getField(5, 0);
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
   * Returns Receiving Application (MSH-5).
   */
  public HD getMsh5_ReceivingApplication()  {
    HD ret = null;
    try {
        Type t = this.getField(5, 0);
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
   * Returns Receiving Facility (MSH-6).
   */
  public HD getReceivingFacility()  {
    HD ret = null;
    try {
        Type t = this.getField(6, 0);
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
   * Returns Receiving Facility (MSH-6).
   */
  public HD getMsh6_ReceivingFacility()  {
    HD ret = null;
    try {
        Type t = this.getField(6, 0);
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
   * Returns Date/Time of Message (MSH-7).
   */
  public DTM getDateTimeOfMessage()  {
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
   * Returns Date/Time of Message (MSH-7).
   */
  public DTM getMsh7_DateTimeOfMessage()  {
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
   * Returns Security (MSH-8).
   */
  public ST getSecurity()  {
    ST ret = null;
    try {
        Type t = this.getField(8, 0);
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
   * Returns Security (MSH-8).
   */
  public ST getMsh8_Security()  {
    ST ret = null;
    try {
        Type t = this.getField(8, 0);
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
   * Returns Message Type (MSH-9).
   */
  public MSG getMessageType()  {
    MSG ret = null;
    try {
        Type t = this.getField(9, 0);
        ret = (MSG)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns Message Type (MSH-9).
   */
  public MSG getMsh9_MessageType()  {
    MSG ret = null;
    try {
        Type t = this.getField(9, 0);
        ret = (MSG)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns Message Control ID (MSH-10).
   */
  public ST getMessageControlID()  {
    ST ret = null;
    try {
        Type t = this.getField(10, 0);
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
   * Returns Message Control ID (MSH-10).
   */
  public ST getMsh10_MessageControlID()  {
    ST ret = null;
    try {
        Type t = this.getField(10, 0);
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
   * Returns Processing ID (MSH-11).
   */
  public PT getProcessingID()  {
    PT ret = null;
    try {
        Type t = this.getField(11, 0);
        ret = (PT)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns Processing ID (MSH-11).
   */
  public PT getMsh11_ProcessingID()  {
    PT ret = null;
    try {
        Type t = this.getField(11, 0);
        ret = (PT)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns Version ID (MSH-12).
   */
  public VID getVersionID()  {
    VID ret = null;
    try {
        Type t = this.getField(12, 0);
        ret = (VID)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns Version ID (MSH-12).
   */
  public VID getMsh12_VersionID()  {
    VID ret = null;
    try {
        Type t = this.getField(12, 0);
        ret = (VID)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns Sequence Number (MSH-13).
   */
  public NM getSequenceNumber()  {
    NM ret = null;
    try {
        Type t = this.getField(13, 0);
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
   * Returns Sequence Number (MSH-13).
   */
  public NM getMsh13_SequenceNumber()  {
    NM ret = null;
    try {
        Type t = this.getField(13, 0);
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
   * Returns Continuation Pointer (MSH-14).
   */
  public ST getContinuationPointer()  {
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
   * Returns Continuation Pointer (MSH-14).
   */
  public ST getMsh14_ContinuationPointer()  {
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
   * Returns Accept Acknowledgment Type (MSH-15).
   */
  public ID getAcceptAcknowledgmentType()  {
    ID ret = null;
    try {
        Type t = this.getField(15, 0);
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
   * Returns Accept Acknowledgment Type (MSH-15).
   */
  public ID getMsh15_AcceptAcknowledgmentType()  {
    ID ret = null;
    try {
        Type t = this.getField(15, 0);
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
   * Returns Application Acknowledgment Type (MSH-16).
   */
  public ID getApplicationAcknowledgmentType()  {
    ID ret = null;
    try {
        Type t = this.getField(16, 0);
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
   * Returns Application Acknowledgment Type (MSH-16).
   */
  public ID getMsh16_ApplicationAcknowledgmentType()  {
    ID ret = null;
    try {
        Type t = this.getField(16, 0);
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
   * Returns Country Code (MSH-17).
   */
  public ID getCountryCode()  {
    ID ret = null;
    try {
        Type t = this.getField(17, 0);
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
   * Returns Country Code (MSH-17).
   */
  public ID getMsh17_CountryCode()  {
    ID ret = null;
    try {
        Type t = this.getField(17, 0);
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
   * Returns a single repetition of Character Set (MSH-18).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public ID getCharacterSet(int rep) throws HL7Exception {
    ID ret = null;
    try {
        Type t = this.getField(18, rep);
        ret = (ID)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Character Set (MSH-18).
   */
  public ID[] getCharacterSet() {
     ID[] ret = null;
    try {
        Type[] t = this.getField(18);  
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
   * Returns a count of the number of repetitions of Character Set (MSH-18).
   */
  public int getCharacterSetReps() {
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
   * Inserts a repetition of Character Set (MSH-18) at a given index and returns it.
   * @param index The index
   */
  public ID insertCharacterSet(int index) throws HL7Exception {
     return (ID) super.insertRepetition(18, index);
  }

  /**
   * Removes a repetition of Character Set (MSH-18) at a given index and returns it.
   * @param index The index
   */
  public ID removeCharacterSet(int index) throws HL7Exception {
     return (ID) super.removeRepetition(18, index);
  }

  /**
   * Returns a single repetition of Character Set (MSH-18).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public ID getMsh18_CharacterSet(int rep) throws HL7Exception {
    ID ret = null;
    try {
        Type t = this.getField(18, rep);
        ret = (ID)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Character Set (MSH-18).
   */
  public ID[] getMsh18_CharacterSet() {
     ID[] ret = null;
    try {
        Type[] t = this.getField(18);  
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
   * Returns a count of the number of repetitions of Character Set (MSH-18).
   */
  public int getMsh18_CharacterSetReps() {
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
   * Inserts a repetition of Character Set (MSH-18) at a given index and returns it.
   * @param index The index
   */
  public ID insertMsh18_CharacterSet(int index) throws HL7Exception {
     return (ID) super.insertRepetition(18, index);
  }

  /**
   * Removes a repetition of Character Set (MSH-18) at a given index and returns it.
   * @param index The index
   */
  public ID removeMsh18_CharacterSet(int index) throws HL7Exception {
     return (ID) super.removeRepetition(18, index);
  }

  /**
   * Returns Principal Language Of Message (MSH-19).
   */
  public CWE getPrincipalLanguageOfMessage()  {
    CWE ret = null;
    try {
        Type t = this.getField(19, 0);
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
   * Returns Principal Language Of Message (MSH-19).
   */
  public CWE getMsh19_PrincipalLanguageOfMessage()  {
    CWE ret = null;
    try {
        Type t = this.getField(19, 0);
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
   * Returns Alternate Character Set Handling Scheme (MSH-20).
   */
  public ID getAlternateCharacterSetHandlingScheme()  {
    ID ret = null;
    try {
        Type t = this.getField(20, 0);
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
   * Returns Alternate Character Set Handling Scheme (MSH-20).
   */
  public ID getMsh20_AlternateCharacterSetHandlingScheme()  {
    ID ret = null;
    try {
        Type t = this.getField(20, 0);
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
   * Returns a single repetition of Message Profile Identifier (MSH-21).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public EI getMessageProfileIdentifier(int rep) throws HL7Exception {
    EI ret = null;
    try {
        Type t = this.getField(21, rep);
        ret = (EI)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Message Profile Identifier (MSH-21).
   */
  public EI[] getMessageProfileIdentifier() {
     EI[] ret = null;
    try {
        Type[] t = this.getField(21);  
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
   * Returns a count of the number of repetitions of Message Profile Identifier (MSH-21).
   */
  public int getMessageProfileIdentifierReps() {
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
   * Inserts a repetition of Message Profile Identifier (MSH-21) at a given index and returns it.
   * @param index The index
   */
  public EI insertMessageProfileIdentifier(int index) throws HL7Exception {
     return (EI) super.insertRepetition(21, index);
  }

  /**
   * Removes a repetition of Message Profile Identifier (MSH-21) at a given index and returns it.
   * @param index The index
   */
  public EI removeMessageProfileIdentifier(int index) throws HL7Exception {
     return (EI) super.removeRepetition(21, index);
  }

  /**
   * Returns a single repetition of Message Profile Identifier (MSH-21).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public EI getMsh21_MessageProfileIdentifier(int rep) throws HL7Exception {
    EI ret = null;
    try {
        Type t = this.getField(21, rep);
        ret = (EI)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Message Profile Identifier (MSH-21).
   */
  public EI[] getMsh21_MessageProfileIdentifier() {
     EI[] ret = null;
    try {
        Type[] t = this.getField(21);  
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
   * Returns a count of the number of repetitions of Message Profile Identifier (MSH-21).
   */
  public int getMsh21_MessageProfileIdentifierReps() {
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
   * Inserts a repetition of Message Profile Identifier (MSH-21) at a given index and returns it.
   * @param index The index
   */
  public EI insertMsh21_MessageProfileIdentifier(int index) throws HL7Exception {
     return (EI) super.insertRepetition(21, index);
  }

  /**
   * Removes a repetition of Message Profile Identifier (MSH-21) at a given index and returns it.
   * @param index The index
   */
  public EI removeMsh21_MessageProfileIdentifier(int index) throws HL7Exception {
     return (EI) super.removeRepetition(21, index);
  }

  /**
   * Returns Sending Responsible Organization (MSH-22).
   */
  public XON getSendingResponsibleOrganization()  {
    XON ret = null;
    try {
        Type t = this.getField(22, 0);
        ret = (XON)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns Sending Responsible Organization (MSH-22).
   */
  public XON getMsh22_SendingResponsibleOrganization()  {
    XON ret = null;
    try {
        Type t = this.getField(22, 0);
        ret = (XON)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns Receiving Responsible Organization (MSH-23).
   */
  public XON getReceivingResponsibleOrganization()  {
    XON ret = null;
    try {
        Type t = this.getField(23, 0);
        ret = (XON)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns Receiving Responsible Organization (MSH-23).
   */
  public XON getMsh23_ReceivingResponsibleOrganization()  {
    XON ret = null;
    try {
        Type t = this.getField(23, 0);
        ret = (XON)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns Sending Network Address (MSH-24).
   */
  public HD getSendingNetworkAddress()  {
    HD ret = null;
    try {
        Type t = this.getField(24, 0);
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
   * Returns Sending Network Address (MSH-24).
   */
  public HD getMsh24_SendingNetworkAddress()  {
    HD ret = null;
    try {
        Type t = this.getField(24, 0);
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
   * Returns Receiving Network Address (MSH-25).
   */
  public HD getReceivingNetworkAddress()  {
    HD ret = null;
    try {
        Type t = this.getField(25, 0);
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
   * Returns Receiving Network Address (MSH-25).
   */
  public HD getMsh25_ReceivingNetworkAddress()  {
    HD ret = null;
    try {
        Type t = this.getField(25, 0);
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
         case 0: return new ca.uhn.hl7v2.model.v26.datatype.ST(getMessage());
         case 1: return new ca.uhn.hl7v2.model.v26.datatype.ST(getMessage());
         case 2: return new ca.uhn.hl7v2.model.v26.datatype.HD(getMessage());
         case 3: return new ca.uhn.hl7v2.model.v26.datatype.HD(getMessage());
         case 4: return new ca.uhn.hl7v2.model.v26.datatype.HD(getMessage());
         case 5: return new ca.uhn.hl7v2.model.v26.datatype.HD(getMessage());
         case 6: return new ca.uhn.hl7v2.model.v26.datatype.DTM(getMessage());
         case 7: return new ca.uhn.hl7v2.model.v26.datatype.ST(getMessage());
         case 8: return new ca.uhn.hl7v2.model.v26.datatype.MSG(getMessage());
         case 9: return new ca.uhn.hl7v2.model.v26.datatype.ST(getMessage());
         case 10: return new ca.uhn.hl7v2.model.v26.datatype.PT(getMessage());
         case 11: return new ca.uhn.hl7v2.model.v26.datatype.VID(getMessage());
         case 12: return new ca.uhn.hl7v2.model.v26.datatype.NM(getMessage());
         case 13: return new ca.uhn.hl7v2.model.v26.datatype.ST(getMessage());
         case 14: return new ca.uhn.hl7v2.model.v26.datatype.ID(getMessage(), new Integer(155));
         case 15: return new ca.uhn.hl7v2.model.v26.datatype.ID(getMessage(), new Integer(155));
         case 16: return new ca.uhn.hl7v2.model.v26.datatype.ID(getMessage(), new Integer(399));
         case 17: return new ca.uhn.hl7v2.model.v26.datatype.ID(getMessage(), new Integer(211));
         case 18: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 19: return new ca.uhn.hl7v2.model.v26.datatype.ID(getMessage(), new Integer(356));
         case 20: return new ca.uhn.hl7v2.model.v26.datatype.EI(getMessage());
         case 21: return new ca.uhn.hl7v2.model.v26.datatype.XON(getMessage());
         case 22: return new ca.uhn.hl7v2.model.v26.datatype.XON(getMessage());
         case 23: return new ca.uhn.hl7v2.model.v26.datatype.HD(getMessage());
         case 24: return new ca.uhn.hl7v2.model.v26.datatype.HD(getMessage());
         default: return null;
      }
   }

}