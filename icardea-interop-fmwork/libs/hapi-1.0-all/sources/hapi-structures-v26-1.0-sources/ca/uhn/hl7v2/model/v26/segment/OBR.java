package ca.uhn.hl7v2.model.v26.segment;

import ca.uhn.hl7v2.model.*;
import ca.uhn.hl7v2.model.v26.datatype.*;
import ca.uhn.log.HapiLogFactory;
import ca.uhn.hl7v2.parser.ModelClassFactory;
import ca.uhn.hl7v2.HL7Exception;

/**
 * <p>Represents an HL7 OBR message segment. 
 * This segment has the following fields:</p><p>
 * OBR-1: Set ID - OBR (SI)<br> 
 * OBR-2: Placer Order Number (EI)<br> 
 * OBR-3: Filler Order Number (EI)<br> 
 * OBR-4: Universal Service Identifier (CWE)<br> 
 * OBR-5: Priority (ID)<br> 
 * OBR-6: Requested Date/Time (DTM)<br> 
 * OBR-7: Observation Date/Time # (DTM)<br> 
 * OBR-8: Observation End Date/Time # (DTM)<br> 
 * OBR-9: Collection Volume * (CQ)<br> 
 * OBR-10: Collector Identifier * (XCN)<br> 
 * OBR-11: Specimen Action Code * (ID)<br> 
 * OBR-12: Danger Code (CWE)<br> 
 * OBR-13: Relevant Clinical Information (ST)<br> 
 * OBR-14: Specimen Received Date/Time (DTM)<br> 
 * OBR-15: Specimen Source (SPS)<br> 
 * OBR-16: Ordering Provider (XCN)<br> 
 * OBR-17: Order Callback Phone Number (XTN)<br> 
 * OBR-18: Placer Field 1 (ST)<br> 
 * OBR-19: Placer Field 2 (ST)<br> 
 * OBR-20: Filler Field 1 + (ST)<br> 
 * OBR-21: Filler Field 2 + (ST)<br> 
 * OBR-22: Results Rpt/Status Chng - Date/Time + (DTM)<br> 
 * OBR-23: Charge to Practice + (MOC)<br> 
 * OBR-24: Diagnostic Serv Sect ID (ID)<br> 
 * OBR-25: Result Status + (ID)<br> 
 * OBR-26: Parent Result + (PRL)<br> 
 * OBR-27: Quantity/Timing (TQ)<br> 
 * OBR-28: Result Copies To (XCN)<br> 
 * OBR-29: Parent (EIP)<br> 
 * OBR-30: Transportation Mode (ID)<br> 
 * OBR-31: Reason for Study (CWE)<br> 
 * OBR-32: Principal Result Interpreter + (NDL)<br> 
 * OBR-33: Assistant Result Interpreter + (NDL)<br> 
 * OBR-34: Technician + (NDL)<br> 
 * OBR-35: Transcriptionist + (NDL)<br> 
 * OBR-36: Scheduled Date/Time + (DTM)<br> 
 * OBR-37: Number of Sample Containers * (NM)<br> 
 * OBR-38: Transport Logistics of Collected Sample * (CWE)<br> 
 * OBR-39: Collector's Comment * (CWE)<br> 
 * OBR-40: Transport Arrangement Responsibility (CWE)<br> 
 * OBR-41: Transport Arranged (ID)<br> 
 * OBR-42: Escort Required (ID)<br> 
 * OBR-43: Planned Patient Transport Comment (CWE)<br> 
 * OBR-44: Procedure Code (CNE)<br> 
 * OBR-45: Procedure Code Modifier (CNE)<br> 
 * OBR-46: Placer Supplemental Service Information (CWE)<br> 
 * OBR-47: Filler Supplemental Service Information (CWE)<br> 
 * OBR-48: Medically Necessary Duplicate Procedure Reason (CWE)<br> 
 * OBR-49: Result Handling (IS)<br> 
 * OBR-50: Parent Universal Service Identifier (CWE)<br> 
 * </p><p>The get...() methods return data from individual fields.  These methods 
 * do not throw exceptions and may therefore have to handle exceptions internally.  
 * If an exception is handled internally, it is logged and null is returned.  
 * This is not expected to happen - if it does happen this indicates not so much 
 * an exceptional circumstance as a bug in the code for this class.</p>    
 */
public class OBR extends AbstractSegment  {

  /**
   * Creates a OBR (Observation Request) segment object that belongs to the given 
   * message.  
   */
  public OBR(Group parent, ModelClassFactory factory) {
    super(parent, factory);
    Message message = getMessage();
    try {
       this.add(SI.class, false, 1, 4, new Object[]{message}, "Set ID - OBR");
       this.add(EI.class, false, 1, 427, new Object[]{message}, "Placer Order Number");
       this.add(EI.class, false, 1, 427, new Object[]{message}, "Filler Order Number");
       this.add(CWE.class, true, 1, 705, new Object[]{message}, "Universal Service Identifier");
       this.add(ID.class, false, 1, 0, new Object[]{message, new Integer(0)}, "Priority");
       this.add(DTM.class, false, 1, 0, new Object[]{message}, "Requested Date/Time");
       this.add(DTM.class, false, 1, 24, new Object[]{message}, "Observation Date/Time #");
       this.add(DTM.class, false, 1, 24, new Object[]{message}, "Observation End Date/Time #");
       this.add(CQ.class, false, 1, 722, new Object[]{message}, "Collection Volume *");
       this.add(XCN.class, false, 0, 3220, new Object[]{message}, "Collector Identifier *");
       this.add(ID.class, false, 1, 1, new Object[]{message, new Integer(65)}, "Specimen Action Code *");
       this.add(CWE.class, false, 1, 705, new Object[]{message}, "Danger Code");
       this.add(ST.class, false, 1, 300, new Object[]{message}, "Relevant Clinical Information");
       this.add(DTM.class, false, 1, 24, new Object[]{message}, "Specimen Received Date/Time");
       this.add(SPS.class, false, 1, 0, new Object[]{message}, "Specimen Source");
       this.add(XCN.class, false, 0, 3220, new Object[]{message}, "Ordering Provider");
       this.add(XTN.class, false, 2, 2743, new Object[]{message}, "Order Callback Phone Number");
       this.add(ST.class, false, 1, 199, new Object[]{message}, "Placer Field 1");
       this.add(ST.class, false, 1, 199, new Object[]{message}, "Placer Field 2");
       this.add(ST.class, false, 1, 199, new Object[]{message}, "Filler Field 1 +");
       this.add(ST.class, false, 1, 199, new Object[]{message}, "Filler Field 2 +");
       this.add(DTM.class, false, 1, 24, new Object[]{message}, "Results Rpt/Status Chng - Date/Time +");
       this.add(MOC.class, false, 1, 504, new Object[]{message}, "Charge to Practice +");
       this.add(ID.class, false, 1, 10, new Object[]{message, new Integer(74)}, "Diagnostic Serv Sect ID");
       this.add(ID.class, false, 1, 1, new Object[]{message, new Integer(123)}, "Result Status +");
       this.add(PRL.class, false, 1, 977, new Object[]{message}, "Parent Result +");
       this.add(TQ.class, false, 0, 0, new Object[]{message}, "Quantity/Timing");
       this.add(XCN.class, false, 0, 3220, new Object[]{message}, "Result Copies To");
       this.add(EIP.class, false, 1, 855, new Object[]{message}, "Parent");
       this.add(ID.class, false, 1, 20, new Object[]{message, new Integer(124)}, "Transportation Mode");
       this.add(CWE.class, false, 0, 705, new Object[]{message}, "Reason for Study");
       this.add(NDL.class, false, 1, 0, new Object[]{message}, "Principal Result Interpreter +");
       this.add(NDL.class, false, 0, 0, new Object[]{message}, "Assistant Result Interpreter +");
       this.add(NDL.class, false, 0, 0, new Object[]{message}, "Technician +");
       this.add(NDL.class, false, 0, 0, new Object[]{message}, "Transcriptionist +");
       this.add(DTM.class, false, 1, 24, new Object[]{message}, "Scheduled Date/Time +");
       this.add(NM.class, false, 1, 16, new Object[]{message}, "Number of Sample Containers *");
       this.add(CWE.class, false, 0, 705, new Object[]{message}, "Transport Logistics of Collected Sample *");
       this.add(CWE.class, false, 0, 705, new Object[]{message}, "Collector's Comment *");
       this.add(CWE.class, false, 1, 705, new Object[]{message}, "Transport Arrangement Responsibility");
       this.add(ID.class, false, 1, 30, new Object[]{message, new Integer(224)}, "Transport Arranged");
       this.add(ID.class, false, 1, 1, new Object[]{message, new Integer(225)}, "Escort Required");
       this.add(CWE.class, false, 0, 705, new Object[]{message}, "Planned Patient Transport Comment");
       this.add(CNE.class, false, 1, 705, new Object[]{message}, "Procedure Code");
       this.add(CNE.class, false, 0, 705, new Object[]{message}, "Procedure Code Modifier");
       this.add(CWE.class, false, 0, 705, new Object[]{message}, "Placer Supplemental Service Information");
       this.add(CWE.class, false, 0, 705, new Object[]{message}, "Filler Supplemental Service Information");
       this.add(CWE.class, false, 1, 705, new Object[]{message}, "Medically Necessary Duplicate Procedure Reason");
       this.add(IS.class, false, 1, 2, new Object[]{message, new Integer(507)}, "Result Handling");
       this.add(CWE.class, false, 1, 705, new Object[]{message}, "Parent Universal Service Identifier");
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Can't instantiate " + this.getClass().getName(), he);
    }
  }

  /**
   * Returns Set ID - OBR (OBR-1).
   */
  public SI getSetIDOBR()  {
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
   * Returns Set ID - OBR (OBR-1).
   */
  public SI getObr1_SetIDOBR()  {
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
   * Returns Placer Order Number (OBR-2).
   */
  public EI getPlacerOrderNumber()  {
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
   * Returns Placer Order Number (OBR-2).
   */
  public EI getObr2_PlacerOrderNumber()  {
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
   * Returns Filler Order Number (OBR-3).
   */
  public EI getFillerOrderNumber()  {
    EI ret = null;
    try {
        Type t = this.getField(3, 0);
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
   * Returns Filler Order Number (OBR-3).
   */
  public EI getObr3_FillerOrderNumber()  {
    EI ret = null;
    try {
        Type t = this.getField(3, 0);
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
   * Returns Universal Service Identifier (OBR-4).
   */
  public CWE getUniversalServiceIdentifier()  {
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
   * Returns Universal Service Identifier (OBR-4).
   */
  public CWE getObr4_UniversalServiceIdentifier()  {
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
   * Returns Priority (OBR-5).
   */
  public ID getPriority()  {
    ID ret = null;
    try {
        Type t = this.getField(5, 0);
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
   * Returns Priority (OBR-5).
   */
  public ID getObr5_Priority()  {
    ID ret = null;
    try {
        Type t = this.getField(5, 0);
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
   * Returns Requested Date/Time (OBR-6).
   */
  public DTM getRequestedDateTime()  {
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
   * Returns Requested Date/Time (OBR-6).
   */
  public DTM getObr6_RequestedDateTime()  {
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
   * Returns Observation Date/Time # (OBR-7).
   */
  public DTM getObservationDateTime()  {
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
   * Returns Observation Date/Time # (OBR-7).
   */
  public DTM getObr7_ObservationDateTime()  {
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
   * Returns Observation End Date/Time # (OBR-8).
   */
  public DTM getObservationEndDateTime()  {
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
   * Returns Observation End Date/Time # (OBR-8).
   */
  public DTM getObr8_ObservationEndDateTime()  {
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
   * Returns Collection Volume * (OBR-9).
   */
  public CQ getCollectionVolume()  {
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
   * Returns Collection Volume * (OBR-9).
   */
  public CQ getObr9_CollectionVolume()  {
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
   * Returns a single repetition of Collector Identifier * (OBR-10).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XCN getCollectorIdentifier(int rep) throws HL7Exception {
    XCN ret = null;
    try {
        Type t = this.getField(10, rep);
        ret = (XCN)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Collector Identifier * (OBR-10).
   */
  public XCN[] getCollectorIdentifier() {
     XCN[] ret = null;
    try {
        Type[] t = this.getField(10);  
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
   * Returns a count of the number of repetitions of Collector Identifier * (OBR-10).
   */
  public int getCollectorIdentifierReps() {
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
   * Inserts a repetition of Collector Identifier * (OBR-10) at a given index and returns it.
   * @param index The index
   */
  public XCN insertCollectorIdentifier(int index) throws HL7Exception {
     return (XCN) super.insertRepetition(10, index);
  }

  /**
   * Removes a repetition of Collector Identifier * (OBR-10) at a given index and returns it.
   * @param index The index
   */
  public XCN removeCollectorIdentifier(int index) throws HL7Exception {
     return (XCN) super.removeRepetition(10, index);
  }

  /**
   * Returns a single repetition of Collector Identifier * (OBR-10).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XCN getObr10_CollectorIdentifier(int rep) throws HL7Exception {
    XCN ret = null;
    try {
        Type t = this.getField(10, rep);
        ret = (XCN)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Collector Identifier * (OBR-10).
   */
  public XCN[] getObr10_CollectorIdentifier() {
     XCN[] ret = null;
    try {
        Type[] t = this.getField(10);  
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
   * Returns a count of the number of repetitions of Collector Identifier * (OBR-10).
   */
  public int getObr10_CollectorIdentifierReps() {
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
   * Inserts a repetition of Collector Identifier * (OBR-10) at a given index and returns it.
   * @param index The index
   */
  public XCN insertObr10_CollectorIdentifier(int index) throws HL7Exception {
     return (XCN) super.insertRepetition(10, index);
  }

  /**
   * Removes a repetition of Collector Identifier * (OBR-10) at a given index and returns it.
   * @param index The index
   */
  public XCN removeObr10_CollectorIdentifier(int index) throws HL7Exception {
     return (XCN) super.removeRepetition(10, index);
  }

  /**
   * Returns Specimen Action Code * (OBR-11).
   */
  public ID getSpecimenActionCode()  {
    ID ret = null;
    try {
        Type t = this.getField(11, 0);
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
   * Returns Specimen Action Code * (OBR-11).
   */
  public ID getObr11_SpecimenActionCode()  {
    ID ret = null;
    try {
        Type t = this.getField(11, 0);
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
   * Returns Danger Code (OBR-12).
   */
  public CWE getDangerCode()  {
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
   * Returns Danger Code (OBR-12).
   */
  public CWE getObr12_DangerCode()  {
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
   * Returns Relevant Clinical Information (OBR-13).
   */
  public ST getRelevantClinicalInformation()  {
    ST ret = null;
    try {
        Type t = this.getField(13, 0);
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
   * Returns Relevant Clinical Information (OBR-13).
   */
  public ST getObr13_RelevantClinicalInformation()  {
    ST ret = null;
    try {
        Type t = this.getField(13, 0);
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
   * Returns Specimen Received Date/Time (OBR-14).
   */
  public DTM getSpecimenReceivedDateTime()  {
    DTM ret = null;
    try {
        Type t = this.getField(14, 0);
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
   * Returns Specimen Received Date/Time (OBR-14).
   */
  public DTM getObr14_SpecimenReceivedDateTime()  {
    DTM ret = null;
    try {
        Type t = this.getField(14, 0);
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
   * Returns Specimen Source (OBR-15).
   */
  public SPS getSpecimenSource()  {
    SPS ret = null;
    try {
        Type t = this.getField(15, 0);
        ret = (SPS)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns Specimen Source (OBR-15).
   */
  public SPS getObr15_SpecimenSource()  {
    SPS ret = null;
    try {
        Type t = this.getField(15, 0);
        ret = (SPS)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns a single repetition of Ordering Provider (OBR-16).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XCN getOrderingProvider(int rep) throws HL7Exception {
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
   * Returns all repetitions of Ordering Provider (OBR-16).
   */
  public XCN[] getOrderingProvider() {
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
   * Returns a count of the number of repetitions of Ordering Provider (OBR-16).
   */
  public int getOrderingProviderReps() {
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
   * Inserts a repetition of Ordering Provider (OBR-16) at a given index and returns it.
   * @param index The index
   */
  public XCN insertOrderingProvider(int index) throws HL7Exception {
     return (XCN) super.insertRepetition(16, index);
  }

  /**
   * Removes a repetition of Ordering Provider (OBR-16) at a given index and returns it.
   * @param index The index
   */
  public XCN removeOrderingProvider(int index) throws HL7Exception {
     return (XCN) super.removeRepetition(16, index);
  }

  /**
   * Returns a single repetition of Ordering Provider (OBR-16).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XCN getObr16_OrderingProvider(int rep) throws HL7Exception {
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
   * Returns all repetitions of Ordering Provider (OBR-16).
   */
  public XCN[] getObr16_OrderingProvider() {
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
   * Returns a count of the number of repetitions of Ordering Provider (OBR-16).
   */
  public int getObr16_OrderingProviderReps() {
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
   * Inserts a repetition of Ordering Provider (OBR-16) at a given index and returns it.
   * @param index The index
   */
  public XCN insertObr16_OrderingProvider(int index) throws HL7Exception {
     return (XCN) super.insertRepetition(16, index);
  }

  /**
   * Removes a repetition of Ordering Provider (OBR-16) at a given index and returns it.
   * @param index The index
   */
  public XCN removeObr16_OrderingProvider(int index) throws HL7Exception {
     return (XCN) super.removeRepetition(16, index);
  }

  /**
   * Returns a single repetition of Order Callback Phone Number (OBR-17).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XTN getOrderCallbackPhoneNumber(int rep) throws HL7Exception {
    XTN ret = null;
    try {
        Type t = this.getField(17, rep);
        ret = (XTN)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Order Callback Phone Number (OBR-17).
   */
  public XTN[] getOrderCallbackPhoneNumber() {
     XTN[] ret = null;
    try {
        Type[] t = this.getField(17);  
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
   * Returns a count of the number of repetitions of Order Callback Phone Number (OBR-17).
   */
  public int getOrderCallbackPhoneNumberReps() {
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
   * Inserts a repetition of Order Callback Phone Number (OBR-17) at a given index and returns it.
   * @param index The index
   */
  public XTN insertOrderCallbackPhoneNumber(int index) throws HL7Exception {
     return (XTN) super.insertRepetition(17, index);
  }

  /**
   * Removes a repetition of Order Callback Phone Number (OBR-17) at a given index and returns it.
   * @param index The index
   */
  public XTN removeOrderCallbackPhoneNumber(int index) throws HL7Exception {
     return (XTN) super.removeRepetition(17, index);
  }

  /**
   * Returns a single repetition of Order Callback Phone Number (OBR-17).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XTN getObr17_OrderCallbackPhoneNumber(int rep) throws HL7Exception {
    XTN ret = null;
    try {
        Type t = this.getField(17, rep);
        ret = (XTN)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Order Callback Phone Number (OBR-17).
   */
  public XTN[] getObr17_OrderCallbackPhoneNumber() {
     XTN[] ret = null;
    try {
        Type[] t = this.getField(17);  
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
   * Returns a count of the number of repetitions of Order Callback Phone Number (OBR-17).
   */
  public int getObr17_OrderCallbackPhoneNumberReps() {
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
   * Inserts a repetition of Order Callback Phone Number (OBR-17) at a given index and returns it.
   * @param index The index
   */
  public XTN insertObr17_OrderCallbackPhoneNumber(int index) throws HL7Exception {
     return (XTN) super.insertRepetition(17, index);
  }

  /**
   * Removes a repetition of Order Callback Phone Number (OBR-17) at a given index and returns it.
   * @param index The index
   */
  public XTN removeObr17_OrderCallbackPhoneNumber(int index) throws HL7Exception {
     return (XTN) super.removeRepetition(17, index);
  }

  /**
   * Returns Placer Field 1 (OBR-18).
   */
  public ST getPlacerField1()  {
    ST ret = null;
    try {
        Type t = this.getField(18, 0);
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
   * Returns Placer Field 1 (OBR-18).
   */
  public ST getObr18_PlacerField1()  {
    ST ret = null;
    try {
        Type t = this.getField(18, 0);
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
   * Returns Placer Field 2 (OBR-19).
   */
  public ST getPlacerField2()  {
    ST ret = null;
    try {
        Type t = this.getField(19, 0);
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
   * Returns Placer Field 2 (OBR-19).
   */
  public ST getObr19_PlacerField2()  {
    ST ret = null;
    try {
        Type t = this.getField(19, 0);
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
   * Returns Filler Field 1 + (OBR-20).
   */
  public ST getFillerField1()  {
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
   * Returns Filler Field 1 + (OBR-20).
   */
  public ST getObr20_FillerField1()  {
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
   * Returns Filler Field 2 + (OBR-21).
   */
  public ST getFillerField2()  {
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
   * Returns Filler Field 2 + (OBR-21).
   */
  public ST getObr21_FillerField2()  {
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
   * Returns Results Rpt/Status Chng - Date/Time + (OBR-22).
   */
  public DTM getResultsRptStatusChngDateTime()  {
    DTM ret = null;
    try {
        Type t = this.getField(22, 0);
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
   * Returns Results Rpt/Status Chng - Date/Time + (OBR-22).
   */
  public DTM getObr22_ResultsRptStatusChngDateTime()  {
    DTM ret = null;
    try {
        Type t = this.getField(22, 0);
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
   * Returns Charge to Practice + (OBR-23).
   */
  public MOC getChargeToPractice()  {
    MOC ret = null;
    try {
        Type t = this.getField(23, 0);
        ret = (MOC)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns Charge to Practice + (OBR-23).
   */
  public MOC getObr23_ChargeToPractice()  {
    MOC ret = null;
    try {
        Type t = this.getField(23, 0);
        ret = (MOC)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns Diagnostic Serv Sect ID (OBR-24).
   */
  public ID getDiagnosticServSectID()  {
    ID ret = null;
    try {
        Type t = this.getField(24, 0);
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
   * Returns Diagnostic Serv Sect ID (OBR-24).
   */
  public ID getObr24_DiagnosticServSectID()  {
    ID ret = null;
    try {
        Type t = this.getField(24, 0);
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
   * Returns Result Status + (OBR-25).
   */
  public ID getResultStatus()  {
    ID ret = null;
    try {
        Type t = this.getField(25, 0);
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
   * Returns Result Status + (OBR-25).
   */
  public ID getObr25_ResultStatus()  {
    ID ret = null;
    try {
        Type t = this.getField(25, 0);
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
   * Returns Parent Result + (OBR-26).
   */
  public PRL getParentResult()  {
    PRL ret = null;
    try {
        Type t = this.getField(26, 0);
        ret = (PRL)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns Parent Result + (OBR-26).
   */
  public PRL getObr26_ParentResult()  {
    PRL ret = null;
    try {
        Type t = this.getField(26, 0);
        ret = (PRL)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns a single repetition of Quantity/Timing (OBR-27).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public TQ getQuantityTiming(int rep) throws HL7Exception {
    TQ ret = null;
    try {
        Type t = this.getField(27, rep);
        ret = (TQ)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Quantity/Timing (OBR-27).
   */
  public TQ[] getQuantityTiming() {
     TQ[] ret = null;
    try {
        Type[] t = this.getField(27);  
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
   * Returns a count of the number of repetitions of Quantity/Timing (OBR-27).
   */
  public int getQuantityTimingReps() {
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
   * Inserts a repetition of Quantity/Timing (OBR-27) at a given index and returns it.
   * @param index The index
   */
  public TQ insertQuantityTiming(int index) throws HL7Exception {
     return (TQ) super.insertRepetition(27, index);
  }

  /**
   * Removes a repetition of Quantity/Timing (OBR-27) at a given index and returns it.
   * @param index The index
   */
  public TQ removeQuantityTiming(int index) throws HL7Exception {
     return (TQ) super.removeRepetition(27, index);
  }

  /**
   * Returns a single repetition of Quantity/Timing (OBR-27).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public TQ getObr27_QuantityTiming(int rep) throws HL7Exception {
    TQ ret = null;
    try {
        Type t = this.getField(27, rep);
        ret = (TQ)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Quantity/Timing (OBR-27).
   */
  public TQ[] getObr27_QuantityTiming() {
     TQ[] ret = null;
    try {
        Type[] t = this.getField(27);  
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
   * Returns a count of the number of repetitions of Quantity/Timing (OBR-27).
   */
  public int getObr27_QuantityTimingReps() {
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
   * Inserts a repetition of Quantity/Timing (OBR-27) at a given index and returns it.
   * @param index The index
   */
  public TQ insertObr27_QuantityTiming(int index) throws HL7Exception {
     return (TQ) super.insertRepetition(27, index);
  }

  /**
   * Removes a repetition of Quantity/Timing (OBR-27) at a given index and returns it.
   * @param index The index
   */
  public TQ removeObr27_QuantityTiming(int index) throws HL7Exception {
     return (TQ) super.removeRepetition(27, index);
  }

  /**
   * Returns a single repetition of Result Copies To (OBR-28).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XCN getResultCopiesTo(int rep) throws HL7Exception {
    XCN ret = null;
    try {
        Type t = this.getField(28, rep);
        ret = (XCN)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Result Copies To (OBR-28).
   */
  public XCN[] getResultCopiesTo() {
     XCN[] ret = null;
    try {
        Type[] t = this.getField(28);  
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
   * Returns a count of the number of repetitions of Result Copies To (OBR-28).
   */
  public int getResultCopiesToReps() {
    try {
        return this.getField(28).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Result Copies To (OBR-28) at a given index and returns it.
   * @param index The index
   */
  public XCN insertResultCopiesTo(int index) throws HL7Exception {
     return (XCN) super.insertRepetition(28, index);
  }

  /**
   * Removes a repetition of Result Copies To (OBR-28) at a given index and returns it.
   * @param index The index
   */
  public XCN removeResultCopiesTo(int index) throws HL7Exception {
     return (XCN) super.removeRepetition(28, index);
  }

  /**
   * Returns a single repetition of Result Copies To (OBR-28).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XCN getObr28_ResultCopiesTo(int rep) throws HL7Exception {
    XCN ret = null;
    try {
        Type t = this.getField(28, rep);
        ret = (XCN)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Result Copies To (OBR-28).
   */
  public XCN[] getObr28_ResultCopiesTo() {
     XCN[] ret = null;
    try {
        Type[] t = this.getField(28);  
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
   * Returns a count of the number of repetitions of Result Copies To (OBR-28).
   */
  public int getObr28_ResultCopiesToReps() {
    try {
        return this.getField(28).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Result Copies To (OBR-28) at a given index and returns it.
   * @param index The index
   */
  public XCN insertObr28_ResultCopiesTo(int index) throws HL7Exception {
     return (XCN) super.insertRepetition(28, index);
  }

  /**
   * Removes a repetition of Result Copies To (OBR-28) at a given index and returns it.
   * @param index The index
   */
  public XCN removeObr28_ResultCopiesTo(int index) throws HL7Exception {
     return (XCN) super.removeRepetition(28, index);
  }

  /**
   * Returns Parent (OBR-29).
   */
  public EIP getOBRParent()  {
    EIP ret = null;
    try {
        Type t = this.getField(29, 0);
        ret = (EIP)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns Parent (OBR-29).
   */
  public EIP getObr29_Parent()  {
    EIP ret = null;
    try {
        Type t = this.getField(29, 0);
        ret = (EIP)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns Transportation Mode (OBR-30).
   */
  public ID getTransportationMode()  {
    ID ret = null;
    try {
        Type t = this.getField(30, 0);
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
   * Returns Transportation Mode (OBR-30).
   */
  public ID getObr30_TransportationMode()  {
    ID ret = null;
    try {
        Type t = this.getField(30, 0);
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
   * Returns a single repetition of Reason for Study (OBR-31).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getReasonForStudy(int rep) throws HL7Exception {
    CWE ret = null;
    try {
        Type t = this.getField(31, rep);
        ret = (CWE)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Reason for Study (OBR-31).
   */
  public CWE[] getReasonForStudy() {
     CWE[] ret = null;
    try {
        Type[] t = this.getField(31);  
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
   * Returns a count of the number of repetitions of Reason for Study (OBR-31).
   */
  public int getReasonForStudyReps() {
    try {
        return this.getField(31).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Reason for Study (OBR-31) at a given index and returns it.
   * @param index The index
   */
  public CWE insertReasonForStudy(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(31, index);
  }

  /**
   * Removes a repetition of Reason for Study (OBR-31) at a given index and returns it.
   * @param index The index
   */
  public CWE removeReasonForStudy(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(31, index);
  }

  /**
   * Returns a single repetition of Reason for Study (OBR-31).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getObr31_ReasonForStudy(int rep) throws HL7Exception {
    CWE ret = null;
    try {
        Type t = this.getField(31, rep);
        ret = (CWE)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Reason for Study (OBR-31).
   */
  public CWE[] getObr31_ReasonForStudy() {
     CWE[] ret = null;
    try {
        Type[] t = this.getField(31);  
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
   * Returns a count of the number of repetitions of Reason for Study (OBR-31).
   */
  public int getObr31_ReasonForStudyReps() {
    try {
        return this.getField(31).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Reason for Study (OBR-31) at a given index and returns it.
   * @param index The index
   */
  public CWE insertObr31_ReasonForStudy(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(31, index);
  }

  /**
   * Removes a repetition of Reason for Study (OBR-31) at a given index and returns it.
   * @param index The index
   */
  public CWE removeObr31_ReasonForStudy(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(31, index);
  }

  /**
   * Returns Principal Result Interpreter + (OBR-32).
   */
  public NDL getPrincipalResultInterpreter()  {
    NDL ret = null;
    try {
        Type t = this.getField(32, 0);
        ret = (NDL)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns Principal Result Interpreter + (OBR-32).
   */
  public NDL getObr32_PrincipalResultInterpreter()  {
    NDL ret = null;
    try {
        Type t = this.getField(32, 0);
        ret = (NDL)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns a single repetition of Assistant Result Interpreter + (OBR-33).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public NDL getAssistantResultInterpreter(int rep) throws HL7Exception {
    NDL ret = null;
    try {
        Type t = this.getField(33, rep);
        ret = (NDL)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Assistant Result Interpreter + (OBR-33).
   */
  public NDL[] getAssistantResultInterpreter() {
     NDL[] ret = null;
    try {
        Type[] t = this.getField(33);  
        ret = new NDL[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (NDL)t[i];
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
   * Returns a count of the number of repetitions of Assistant Result Interpreter + (OBR-33).
   */
  public int getAssistantResultInterpreterReps() {
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
   * Inserts a repetition of Assistant Result Interpreter + (OBR-33) at a given index and returns it.
   * @param index The index
   */
  public NDL insertAssistantResultInterpreter(int index) throws HL7Exception {
     return (NDL) super.insertRepetition(33, index);
  }

  /**
   * Removes a repetition of Assistant Result Interpreter + (OBR-33) at a given index and returns it.
   * @param index The index
   */
  public NDL removeAssistantResultInterpreter(int index) throws HL7Exception {
     return (NDL) super.removeRepetition(33, index);
  }

  /**
   * Returns a single repetition of Assistant Result Interpreter + (OBR-33).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public NDL getObr33_AssistantResultInterpreter(int rep) throws HL7Exception {
    NDL ret = null;
    try {
        Type t = this.getField(33, rep);
        ret = (NDL)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Assistant Result Interpreter + (OBR-33).
   */
  public NDL[] getObr33_AssistantResultInterpreter() {
     NDL[] ret = null;
    try {
        Type[] t = this.getField(33);  
        ret = new NDL[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (NDL)t[i];
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
   * Returns a count of the number of repetitions of Assistant Result Interpreter + (OBR-33).
   */
  public int getObr33_AssistantResultInterpreterReps() {
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
   * Inserts a repetition of Assistant Result Interpreter + (OBR-33) at a given index and returns it.
   * @param index The index
   */
  public NDL insertObr33_AssistantResultInterpreter(int index) throws HL7Exception {
     return (NDL) super.insertRepetition(33, index);
  }

  /**
   * Removes a repetition of Assistant Result Interpreter + (OBR-33) at a given index and returns it.
   * @param index The index
   */
  public NDL removeObr33_AssistantResultInterpreter(int index) throws HL7Exception {
     return (NDL) super.removeRepetition(33, index);
  }

  /**
   * Returns a single repetition of Technician + (OBR-34).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public NDL getTechnician(int rep) throws HL7Exception {
    NDL ret = null;
    try {
        Type t = this.getField(34, rep);
        ret = (NDL)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Technician + (OBR-34).
   */
  public NDL[] getTechnician() {
     NDL[] ret = null;
    try {
        Type[] t = this.getField(34);  
        ret = new NDL[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (NDL)t[i];
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
   * Returns a count of the number of repetitions of Technician + (OBR-34).
   */
  public int getTechnicianReps() {
    try {
        return this.getField(34).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Technician + (OBR-34) at a given index and returns it.
   * @param index The index
   */
  public NDL insertTechnician(int index) throws HL7Exception {
     return (NDL) super.insertRepetition(34, index);
  }

  /**
   * Removes a repetition of Technician + (OBR-34) at a given index and returns it.
   * @param index The index
   */
  public NDL removeTechnician(int index) throws HL7Exception {
     return (NDL) super.removeRepetition(34, index);
  }

  /**
   * Returns a single repetition of Technician + (OBR-34).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public NDL getObr34_Technician(int rep) throws HL7Exception {
    NDL ret = null;
    try {
        Type t = this.getField(34, rep);
        ret = (NDL)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Technician + (OBR-34).
   */
  public NDL[] getObr34_Technician() {
     NDL[] ret = null;
    try {
        Type[] t = this.getField(34);  
        ret = new NDL[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (NDL)t[i];
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
   * Returns a count of the number of repetitions of Technician + (OBR-34).
   */
  public int getObr34_TechnicianReps() {
    try {
        return this.getField(34).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Technician + (OBR-34) at a given index and returns it.
   * @param index The index
   */
  public NDL insertObr34_Technician(int index) throws HL7Exception {
     return (NDL) super.insertRepetition(34, index);
  }

  /**
   * Removes a repetition of Technician + (OBR-34) at a given index and returns it.
   * @param index The index
   */
  public NDL removeObr34_Technician(int index) throws HL7Exception {
     return (NDL) super.removeRepetition(34, index);
  }

  /**
   * Returns a single repetition of Transcriptionist + (OBR-35).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public NDL getTranscriptionist(int rep) throws HL7Exception {
    NDL ret = null;
    try {
        Type t = this.getField(35, rep);
        ret = (NDL)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Transcriptionist + (OBR-35).
   */
  public NDL[] getTranscriptionist() {
     NDL[] ret = null;
    try {
        Type[] t = this.getField(35);  
        ret = new NDL[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (NDL)t[i];
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
   * Returns a count of the number of repetitions of Transcriptionist + (OBR-35).
   */
  public int getTranscriptionistReps() {
    try {
        return this.getField(35).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Transcriptionist + (OBR-35) at a given index and returns it.
   * @param index The index
   */
  public NDL insertTranscriptionist(int index) throws HL7Exception {
     return (NDL) super.insertRepetition(35, index);
  }

  /**
   * Removes a repetition of Transcriptionist + (OBR-35) at a given index and returns it.
   * @param index The index
   */
  public NDL removeTranscriptionist(int index) throws HL7Exception {
     return (NDL) super.removeRepetition(35, index);
  }

  /**
   * Returns a single repetition of Transcriptionist + (OBR-35).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public NDL getObr35_Transcriptionist(int rep) throws HL7Exception {
    NDL ret = null;
    try {
        Type t = this.getField(35, rep);
        ret = (NDL)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Transcriptionist + (OBR-35).
   */
  public NDL[] getObr35_Transcriptionist() {
     NDL[] ret = null;
    try {
        Type[] t = this.getField(35);  
        ret = new NDL[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (NDL)t[i];
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
   * Returns a count of the number of repetitions of Transcriptionist + (OBR-35).
   */
  public int getObr35_TranscriptionistReps() {
    try {
        return this.getField(35).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Transcriptionist + (OBR-35) at a given index and returns it.
   * @param index The index
   */
  public NDL insertObr35_Transcriptionist(int index) throws HL7Exception {
     return (NDL) super.insertRepetition(35, index);
  }

  /**
   * Removes a repetition of Transcriptionist + (OBR-35) at a given index and returns it.
   * @param index The index
   */
  public NDL removeObr35_Transcriptionist(int index) throws HL7Exception {
     return (NDL) super.removeRepetition(35, index);
  }

  /**
   * Returns Scheduled Date/Time + (OBR-36).
   */
  public DTM getScheduledDateTime()  {
    DTM ret = null;
    try {
        Type t = this.getField(36, 0);
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
   * Returns Scheduled Date/Time + (OBR-36).
   */
  public DTM getObr36_ScheduledDateTime()  {
    DTM ret = null;
    try {
        Type t = this.getField(36, 0);
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
   * Returns Number of Sample Containers * (OBR-37).
   */
  public NM getNumberOfSampleContainers()  {
    NM ret = null;
    try {
        Type t = this.getField(37, 0);
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
   * Returns Number of Sample Containers * (OBR-37).
   */
  public NM getObr37_NumberOfSampleContainers()  {
    NM ret = null;
    try {
        Type t = this.getField(37, 0);
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
   * Returns a single repetition of Transport Logistics of Collected Sample * (OBR-38).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getTransportLogisticsOfCollectedSample(int rep) throws HL7Exception {
    CWE ret = null;
    try {
        Type t = this.getField(38, rep);
        ret = (CWE)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Transport Logistics of Collected Sample * (OBR-38).
   */
  public CWE[] getTransportLogisticsOfCollectedSample() {
     CWE[] ret = null;
    try {
        Type[] t = this.getField(38);  
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
   * Returns a count of the number of repetitions of Transport Logistics of Collected Sample * (OBR-38).
   */
  public int getTransportLogisticsOfCollectedSampleReps() {
    try {
        return this.getField(38).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Transport Logistics of Collected Sample * (OBR-38) at a given index and returns it.
   * @param index The index
   */
  public CWE insertTransportLogisticsOfCollectedSample(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(38, index);
  }

  /**
   * Removes a repetition of Transport Logistics of Collected Sample * (OBR-38) at a given index and returns it.
   * @param index The index
   */
  public CWE removeTransportLogisticsOfCollectedSample(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(38, index);
  }

  /**
   * Returns a single repetition of Transport Logistics of Collected Sample * (OBR-38).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getObr38_TransportLogisticsOfCollectedSample(int rep) throws HL7Exception {
    CWE ret = null;
    try {
        Type t = this.getField(38, rep);
        ret = (CWE)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Transport Logistics of Collected Sample * (OBR-38).
   */
  public CWE[] getObr38_TransportLogisticsOfCollectedSample() {
     CWE[] ret = null;
    try {
        Type[] t = this.getField(38);  
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
   * Returns a count of the number of repetitions of Transport Logistics of Collected Sample * (OBR-38).
   */
  public int getObr38_TransportLogisticsOfCollectedSampleReps() {
    try {
        return this.getField(38).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Transport Logistics of Collected Sample * (OBR-38) at a given index and returns it.
   * @param index The index
   */
  public CWE insertObr38_TransportLogisticsOfCollectedSample(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(38, index);
  }

  /**
   * Removes a repetition of Transport Logistics of Collected Sample * (OBR-38) at a given index and returns it.
   * @param index The index
   */
  public CWE removeObr38_TransportLogisticsOfCollectedSample(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(38, index);
  }

  /**
   * Returns a single repetition of Collector's Comment * (OBR-39).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getCollectorSComment(int rep) throws HL7Exception {
    CWE ret = null;
    try {
        Type t = this.getField(39, rep);
        ret = (CWE)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Collector's Comment * (OBR-39).
   */
  public CWE[] getCollectorSComment() {
     CWE[] ret = null;
    try {
        Type[] t = this.getField(39);  
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
   * Returns a count of the number of repetitions of Collector's Comment * (OBR-39).
   */
  public int getCollectorSCommentReps() {
    try {
        return this.getField(39).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Collector's Comment * (OBR-39) at a given index and returns it.
   * @param index The index
   */
  public CWE insertCollectorSComment(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(39, index);
  }

  /**
   * Removes a repetition of Collector's Comment * (OBR-39) at a given index and returns it.
   * @param index The index
   */
  public CWE removeCollectorSComment(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(39, index);
  }

  /**
   * Returns a single repetition of Collector's Comment * (OBR-39).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getObr39_CollectorSComment(int rep) throws HL7Exception {
    CWE ret = null;
    try {
        Type t = this.getField(39, rep);
        ret = (CWE)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Collector's Comment * (OBR-39).
   */
  public CWE[] getObr39_CollectorSComment() {
     CWE[] ret = null;
    try {
        Type[] t = this.getField(39);  
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
   * Returns a count of the number of repetitions of Collector's Comment * (OBR-39).
   */
  public int getObr39_CollectorSCommentReps() {
    try {
        return this.getField(39).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Collector's Comment * (OBR-39) at a given index and returns it.
   * @param index The index
   */
  public CWE insertObr39_CollectorSComment(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(39, index);
  }

  /**
   * Removes a repetition of Collector's Comment * (OBR-39) at a given index and returns it.
   * @param index The index
   */
  public CWE removeObr39_CollectorSComment(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(39, index);
  }

  /**
   * Returns Transport Arrangement Responsibility (OBR-40).
   */
  public CWE getTransportArrangementResponsibility()  {
    CWE ret = null;
    try {
        Type t = this.getField(40, 0);
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
   * Returns Transport Arrangement Responsibility (OBR-40).
   */
  public CWE getObr40_TransportArrangementResponsibility()  {
    CWE ret = null;
    try {
        Type t = this.getField(40, 0);
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
   * Returns Transport Arranged (OBR-41).
   */
  public ID getTransportArranged()  {
    ID ret = null;
    try {
        Type t = this.getField(41, 0);
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
   * Returns Transport Arranged (OBR-41).
   */
  public ID getObr41_TransportArranged()  {
    ID ret = null;
    try {
        Type t = this.getField(41, 0);
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
   * Returns Escort Required (OBR-42).
   */
  public ID getEscortRequired()  {
    ID ret = null;
    try {
        Type t = this.getField(42, 0);
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
   * Returns Escort Required (OBR-42).
   */
  public ID getObr42_EscortRequired()  {
    ID ret = null;
    try {
        Type t = this.getField(42, 0);
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
   * Returns a single repetition of Planned Patient Transport Comment (OBR-43).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getPlannedPatientTransportComment(int rep) throws HL7Exception {
    CWE ret = null;
    try {
        Type t = this.getField(43, rep);
        ret = (CWE)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Planned Patient Transport Comment (OBR-43).
   */
  public CWE[] getPlannedPatientTransportComment() {
     CWE[] ret = null;
    try {
        Type[] t = this.getField(43);  
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
   * Returns a count of the number of repetitions of Planned Patient Transport Comment (OBR-43).
   */
  public int getPlannedPatientTransportCommentReps() {
    try {
        return this.getField(43).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Planned Patient Transport Comment (OBR-43) at a given index and returns it.
   * @param index The index
   */
  public CWE insertPlannedPatientTransportComment(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(43, index);
  }

  /**
   * Removes a repetition of Planned Patient Transport Comment (OBR-43) at a given index and returns it.
   * @param index The index
   */
  public CWE removePlannedPatientTransportComment(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(43, index);
  }

  /**
   * Returns a single repetition of Planned Patient Transport Comment (OBR-43).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getObr43_PlannedPatientTransportComment(int rep) throws HL7Exception {
    CWE ret = null;
    try {
        Type t = this.getField(43, rep);
        ret = (CWE)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Planned Patient Transport Comment (OBR-43).
   */
  public CWE[] getObr43_PlannedPatientTransportComment() {
     CWE[] ret = null;
    try {
        Type[] t = this.getField(43);  
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
   * Returns a count of the number of repetitions of Planned Patient Transport Comment (OBR-43).
   */
  public int getObr43_PlannedPatientTransportCommentReps() {
    try {
        return this.getField(43).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Planned Patient Transport Comment (OBR-43) at a given index and returns it.
   * @param index The index
   */
  public CWE insertObr43_PlannedPatientTransportComment(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(43, index);
  }

  /**
   * Removes a repetition of Planned Patient Transport Comment (OBR-43) at a given index and returns it.
   * @param index The index
   */
  public CWE removeObr43_PlannedPatientTransportComment(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(43, index);
  }

  /**
   * Returns Procedure Code (OBR-44).
   */
  public CNE getProcedureCode()  {
    CNE ret = null;
    try {
        Type t = this.getField(44, 0);
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
   * Returns Procedure Code (OBR-44).
   */
  public CNE getObr44_ProcedureCode()  {
    CNE ret = null;
    try {
        Type t = this.getField(44, 0);
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
   * Returns a single repetition of Procedure Code Modifier (OBR-45).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CNE getProcedureCodeModifier(int rep) throws HL7Exception {
    CNE ret = null;
    try {
        Type t = this.getField(45, rep);
        ret = (CNE)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Procedure Code Modifier (OBR-45).
   */
  public CNE[] getProcedureCodeModifier() {
     CNE[] ret = null;
    try {
        Type[] t = this.getField(45);  
        ret = new CNE[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (CNE)t[i];
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
   * Returns a count of the number of repetitions of Procedure Code Modifier (OBR-45).
   */
  public int getProcedureCodeModifierReps() {
    try {
        return this.getField(45).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Procedure Code Modifier (OBR-45) at a given index and returns it.
   * @param index The index
   */
  public CNE insertProcedureCodeModifier(int index) throws HL7Exception {
     return (CNE) super.insertRepetition(45, index);
  }

  /**
   * Removes a repetition of Procedure Code Modifier (OBR-45) at a given index and returns it.
   * @param index The index
   */
  public CNE removeProcedureCodeModifier(int index) throws HL7Exception {
     return (CNE) super.removeRepetition(45, index);
  }

  /**
   * Returns a single repetition of Procedure Code Modifier (OBR-45).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CNE getObr45_ProcedureCodeModifier(int rep) throws HL7Exception {
    CNE ret = null;
    try {
        Type t = this.getField(45, rep);
        ret = (CNE)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Procedure Code Modifier (OBR-45).
   */
  public CNE[] getObr45_ProcedureCodeModifier() {
     CNE[] ret = null;
    try {
        Type[] t = this.getField(45);  
        ret = new CNE[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (CNE)t[i];
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
   * Returns a count of the number of repetitions of Procedure Code Modifier (OBR-45).
   */
  public int getObr45_ProcedureCodeModifierReps() {
    try {
        return this.getField(45).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Procedure Code Modifier (OBR-45) at a given index and returns it.
   * @param index The index
   */
  public CNE insertObr45_ProcedureCodeModifier(int index) throws HL7Exception {
     return (CNE) super.insertRepetition(45, index);
  }

  /**
   * Removes a repetition of Procedure Code Modifier (OBR-45) at a given index and returns it.
   * @param index The index
   */
  public CNE removeObr45_ProcedureCodeModifier(int index) throws HL7Exception {
     return (CNE) super.removeRepetition(45, index);
  }

  /**
   * Returns a single repetition of Placer Supplemental Service Information (OBR-46).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getPlacerSupplementalServiceInformation(int rep) throws HL7Exception {
    CWE ret = null;
    try {
        Type t = this.getField(46, rep);
        ret = (CWE)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Placer Supplemental Service Information (OBR-46).
   */
  public CWE[] getPlacerSupplementalServiceInformation() {
     CWE[] ret = null;
    try {
        Type[] t = this.getField(46);  
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
   * Returns a count of the number of repetitions of Placer Supplemental Service Information (OBR-46).
   */
  public int getPlacerSupplementalServiceInformationReps() {
    try {
        return this.getField(46).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Placer Supplemental Service Information (OBR-46) at a given index and returns it.
   * @param index The index
   */
  public CWE insertPlacerSupplementalServiceInformation(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(46, index);
  }

  /**
   * Removes a repetition of Placer Supplemental Service Information (OBR-46) at a given index and returns it.
   * @param index The index
   */
  public CWE removePlacerSupplementalServiceInformation(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(46, index);
  }

  /**
   * Returns a single repetition of Placer Supplemental Service Information (OBR-46).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getObr46_PlacerSupplementalServiceInformation(int rep) throws HL7Exception {
    CWE ret = null;
    try {
        Type t = this.getField(46, rep);
        ret = (CWE)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Placer Supplemental Service Information (OBR-46).
   */
  public CWE[] getObr46_PlacerSupplementalServiceInformation() {
     CWE[] ret = null;
    try {
        Type[] t = this.getField(46);  
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
   * Returns a count of the number of repetitions of Placer Supplemental Service Information (OBR-46).
   */
  public int getObr46_PlacerSupplementalServiceInformationReps() {
    try {
        return this.getField(46).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Placer Supplemental Service Information (OBR-46) at a given index and returns it.
   * @param index The index
   */
  public CWE insertObr46_PlacerSupplementalServiceInformation(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(46, index);
  }

  /**
   * Removes a repetition of Placer Supplemental Service Information (OBR-46) at a given index and returns it.
   * @param index The index
   */
  public CWE removeObr46_PlacerSupplementalServiceInformation(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(46, index);
  }

  /**
   * Returns a single repetition of Filler Supplemental Service Information (OBR-47).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getFillerSupplementalServiceInformation(int rep) throws HL7Exception {
    CWE ret = null;
    try {
        Type t = this.getField(47, rep);
        ret = (CWE)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Filler Supplemental Service Information (OBR-47).
   */
  public CWE[] getFillerSupplementalServiceInformation() {
     CWE[] ret = null;
    try {
        Type[] t = this.getField(47);  
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
   * Returns a count of the number of repetitions of Filler Supplemental Service Information (OBR-47).
   */
  public int getFillerSupplementalServiceInformationReps() {
    try {
        return this.getField(47).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Filler Supplemental Service Information (OBR-47) at a given index and returns it.
   * @param index The index
   */
  public CWE insertFillerSupplementalServiceInformation(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(47, index);
  }

  /**
   * Removes a repetition of Filler Supplemental Service Information (OBR-47) at a given index and returns it.
   * @param index The index
   */
  public CWE removeFillerSupplementalServiceInformation(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(47, index);
  }

  /**
   * Returns a single repetition of Filler Supplemental Service Information (OBR-47).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getObr47_FillerSupplementalServiceInformation(int rep) throws HL7Exception {
    CWE ret = null;
    try {
        Type t = this.getField(47, rep);
        ret = (CWE)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Filler Supplemental Service Information (OBR-47).
   */
  public CWE[] getObr47_FillerSupplementalServiceInformation() {
     CWE[] ret = null;
    try {
        Type[] t = this.getField(47);  
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
   * Returns a count of the number of repetitions of Filler Supplemental Service Information (OBR-47).
   */
  public int getObr47_FillerSupplementalServiceInformationReps() {
    try {
        return this.getField(47).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Filler Supplemental Service Information (OBR-47) at a given index and returns it.
   * @param index The index
   */
  public CWE insertObr47_FillerSupplementalServiceInformation(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(47, index);
  }

  /**
   * Removes a repetition of Filler Supplemental Service Information (OBR-47) at a given index and returns it.
   * @param index The index
   */
  public CWE removeObr47_FillerSupplementalServiceInformation(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(47, index);
  }

  /**
   * Returns Medically Necessary Duplicate Procedure Reason (OBR-48).
   */
  public CWE getMedicallyNecessaryDuplicateProcedureReason()  {
    CWE ret = null;
    try {
        Type t = this.getField(48, 0);
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
   * Returns Medically Necessary Duplicate Procedure Reason (OBR-48).
   */
  public CWE getObr48_MedicallyNecessaryDuplicateProcedureReason()  {
    CWE ret = null;
    try {
        Type t = this.getField(48, 0);
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
   * Returns Result Handling (OBR-49).
   */
  public IS getResultHandling()  {
    IS ret = null;
    try {
        Type t = this.getField(49, 0);
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
   * Returns Result Handling (OBR-49).
   */
  public IS getObr49_ResultHandling()  {
    IS ret = null;
    try {
        Type t = this.getField(49, 0);
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
   * Returns Parent Universal Service Identifier (OBR-50).
   */
  public CWE getParentUniversalServiceIdentifier()  {
    CWE ret = null;
    try {
        Type t = this.getField(50, 0);
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
   * Returns Parent Universal Service Identifier (OBR-50).
   */
  public CWE getObr50_ParentUniversalServiceIdentifier()  {
    CWE ret = null;
    try {
        Type t = this.getField(50, 0);
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

   protected Type createNewTypeWithoutReflection(int field) {
      switch (field) {
         case 0: return new ca.uhn.hl7v2.model.v26.datatype.SI(getMessage());
         case 1: return new ca.uhn.hl7v2.model.v26.datatype.EI(getMessage());
         case 2: return new ca.uhn.hl7v2.model.v26.datatype.EI(getMessage());
         case 3: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 4: return new ca.uhn.hl7v2.model.v26.datatype.ID(getMessage(), new Integer(0));
         case 5: return new ca.uhn.hl7v2.model.v26.datatype.DTM(getMessage());
         case 6: return new ca.uhn.hl7v2.model.v26.datatype.DTM(getMessage());
         case 7: return new ca.uhn.hl7v2.model.v26.datatype.DTM(getMessage());
         case 8: return new ca.uhn.hl7v2.model.v26.datatype.CQ(getMessage());
         case 9: return new ca.uhn.hl7v2.model.v26.datatype.XCN(getMessage());
         case 10: return new ca.uhn.hl7v2.model.v26.datatype.ID(getMessage(), new Integer(65));
         case 11: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 12: return new ca.uhn.hl7v2.model.v26.datatype.ST(getMessage());
         case 13: return new ca.uhn.hl7v2.model.v26.datatype.DTM(getMessage());
         case 14: return new ca.uhn.hl7v2.model.v26.datatype.SPS(getMessage());
         case 15: return new ca.uhn.hl7v2.model.v26.datatype.XCN(getMessage());
         case 16: return new ca.uhn.hl7v2.model.v26.datatype.XTN(getMessage());
         case 17: return new ca.uhn.hl7v2.model.v26.datatype.ST(getMessage());
         case 18: return new ca.uhn.hl7v2.model.v26.datatype.ST(getMessage());
         case 19: return new ca.uhn.hl7v2.model.v26.datatype.ST(getMessage());
         case 20: return new ca.uhn.hl7v2.model.v26.datatype.ST(getMessage());
         case 21: return new ca.uhn.hl7v2.model.v26.datatype.DTM(getMessage());
         case 22: return new ca.uhn.hl7v2.model.v26.datatype.MOC(getMessage());
         case 23: return new ca.uhn.hl7v2.model.v26.datatype.ID(getMessage(), new Integer(74));
         case 24: return new ca.uhn.hl7v2.model.v26.datatype.ID(getMessage(), new Integer(123));
         case 25: return new ca.uhn.hl7v2.model.v26.datatype.PRL(getMessage());
         case 26: return new ca.uhn.hl7v2.model.v26.datatype.TQ(getMessage());
         case 27: return new ca.uhn.hl7v2.model.v26.datatype.XCN(getMessage());
         case 28: return new ca.uhn.hl7v2.model.v26.datatype.EIP(getMessage());
         case 29: return new ca.uhn.hl7v2.model.v26.datatype.ID(getMessage(), new Integer(124));
         case 30: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 31: return new ca.uhn.hl7v2.model.v26.datatype.NDL(getMessage());
         case 32: return new ca.uhn.hl7v2.model.v26.datatype.NDL(getMessage());
         case 33: return new ca.uhn.hl7v2.model.v26.datatype.NDL(getMessage());
         case 34: return new ca.uhn.hl7v2.model.v26.datatype.NDL(getMessage());
         case 35: return new ca.uhn.hl7v2.model.v26.datatype.DTM(getMessage());
         case 36: return new ca.uhn.hl7v2.model.v26.datatype.NM(getMessage());
         case 37: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 38: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 39: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 40: return new ca.uhn.hl7v2.model.v26.datatype.ID(getMessage(), new Integer(224));
         case 41: return new ca.uhn.hl7v2.model.v26.datatype.ID(getMessage(), new Integer(225));
         case 42: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 43: return new ca.uhn.hl7v2.model.v26.datatype.CNE(getMessage());
         case 44: return new ca.uhn.hl7v2.model.v26.datatype.CNE(getMessage());
         case 45: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 46: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 47: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 48: return new ca.uhn.hl7v2.model.v26.datatype.IS(getMessage(), new Integer(507));
         case 49: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         default: return null;
      }
   }

}