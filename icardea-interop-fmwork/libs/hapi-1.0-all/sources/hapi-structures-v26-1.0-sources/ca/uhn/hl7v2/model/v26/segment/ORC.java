package ca.uhn.hl7v2.model.v26.segment;

import ca.uhn.hl7v2.model.*;
import ca.uhn.hl7v2.model.v26.datatype.*;
import ca.uhn.log.HapiLogFactory;
import ca.uhn.hl7v2.parser.ModelClassFactory;
import ca.uhn.hl7v2.HL7Exception;

/**
 * <p>Represents an HL7 ORC message segment. 
 * This segment has the following fields:</p><p>
 * ORC-1: Order Control (ID)<br> 
 * ORC-2: Placer Order Number (EI)<br> 
 * ORC-3: Filler Order Number (EI)<br> 
 * ORC-4: Placer Group Number (EI)<br> 
 * ORC-5: Order Status (ID)<br> 
 * ORC-6: Response Flag (ID)<br> 
 * ORC-7: Quantity/Timing (TQ)<br> 
 * ORC-8: Parent (EIP)<br> 
 * ORC-9: Date/Time of Transaction (DTM)<br> 
 * ORC-10: Entered By (XCN)<br> 
 * ORC-11: Verified By (XCN)<br> 
 * ORC-12: Ordering Provider (XCN)<br> 
 * ORC-13: Enterer's Location (PL)<br> 
 * ORC-14: Call Back Phone Number (XTN)<br> 
 * ORC-15: Order Effective Date/Time (DTM)<br> 
 * ORC-16: Order Control Code Reason (CWE)<br> 
 * ORC-17: Entering Organization (CWE)<br> 
 * ORC-18: Entering Device (CWE)<br> 
 * ORC-19: Action By (XCN)<br> 
 * ORC-20: Advanced Beneficiary Notice Code (CWE)<br> 
 * ORC-21: Ordering Facility Name (XON)<br> 
 * ORC-22: Ordering Facility Address (XAD)<br> 
 * ORC-23: Ordering Facility Phone Number (XTN)<br> 
 * ORC-24: Ordering Provider Address (XAD)<br> 
 * ORC-25: Order Status Modifier (CWE)<br> 
 * ORC-26: Advanced Beneficiary Notice Override Reason (CWE)<br> 
 * ORC-27: Filler's Expected Availability Date/Time (DTM)<br> 
 * ORC-28: Confidentiality Code (CWE)<br> 
 * ORC-29: Order Type (CWE)<br> 
 * ORC-30: Enterer Authorization Mode (CNE)<br> 
 * ORC-31: Parent Universal Service Identifier (CWE)<br> 
 * </p><p>The get...() methods return data from individual fields.  These methods 
 * do not throw exceptions and may therefore have to handle exceptions internally.  
 * If an exception is handled internally, it is logged and null is returned.  
 * This is not expected to happen - if it does happen this indicates not so much 
 * an exceptional circumstance as a bug in the code for this class.</p>    
 */
public class ORC extends AbstractSegment  {

  /**
   * Creates a ORC (Common Order) segment object that belongs to the given 
   * message.  
   */
  public ORC(Group parent, ModelClassFactory factory) {
    super(parent, factory);
    Message message = getMessage();
    try {
       this.add(ID.class, true, 1, 2, new Object[]{message, new Integer(119)}, "Order Control");
       this.add(EI.class, false, 1, 427, new Object[]{message}, "Placer Order Number");
       this.add(EI.class, false, 1, 427, new Object[]{message}, "Filler Order Number");
       this.add(EI.class, false, 1, 22, new Object[]{message}, "Placer Group Number");
       this.add(ID.class, false, 1, 2, new Object[]{message, new Integer(38)}, "Order Status");
       this.add(ID.class, false, 1, 1, new Object[]{message, new Integer(121)}, "Response Flag");
       this.add(TQ.class, false, 0, 0, new Object[]{message}, "Quantity/Timing");
       this.add(EIP.class, false, 1, 200, new Object[]{message}, "Parent");
       this.add(DTM.class, false, 1, 24, new Object[]{message}, "Date/Time of Transaction");
       this.add(XCN.class, false, 0, 3220, new Object[]{message}, "Entered By");
       this.add(XCN.class, false, 0, 250, new Object[]{message}, "Verified By");
       this.add(XCN.class, false, 0, 3220, new Object[]{message}, "Ordering Provider");
       this.add(PL.class, false, 1, 80, new Object[]{message}, "Enterer's Location");
       this.add(XTN.class, false, 2, 250, new Object[]{message}, "Call Back Phone Number");
       this.add(DTM.class, false, 1, 24, new Object[]{message}, "Order Effective Date/Time");
       this.add(CWE.class, false, 1, 250, new Object[]{message}, "Order Control Code Reason");
       this.add(CWE.class, false, 1, 250, new Object[]{message}, "Entering Organization");
       this.add(CWE.class, false, 1, 250, new Object[]{message}, "Entering Device");
       this.add(XCN.class, false, 0, 250, new Object[]{message}, "Action By");
       this.add(CWE.class, false, 1, 250, new Object[]{message}, "Advanced Beneficiary Notice Code");
       this.add(XON.class, false, 0, 250, new Object[]{message}, "Ordering Facility Name");
       this.add(XAD.class, false, 0, 250, new Object[]{message}, "Ordering Facility Address");
       this.add(XTN.class, false, 0, 250, new Object[]{message}, "Ordering Facility Phone Number");
       this.add(XAD.class, false, 0, 250, new Object[]{message}, "Ordering Provider Address");
       this.add(CWE.class, false, 1, 250, new Object[]{message}, "Order Status Modifier");
       this.add(CWE.class, false, 1, 60, new Object[]{message}, "Advanced Beneficiary Notice Override Reason");
       this.add(DTM.class, false, 1, 24, new Object[]{message}, "Filler's Expected Availability Date/Time");
       this.add(CWE.class, false, 1, 250, new Object[]{message}, "Confidentiality Code");
       this.add(CWE.class, false, 1, 250, new Object[]{message}, "Order Type");
       this.add(CNE.class, false, 1, 250, new Object[]{message}, "Enterer Authorization Mode");
       this.add(CWE.class, false, 1, 250, new Object[]{message}, "Parent Universal Service Identifier");
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Can't instantiate " + this.getClass().getName(), he);
    }
  }

  /**
   * Returns Order Control (ORC-1).
   */
  public ID getOrderControl()  {
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
   * Returns Order Control (ORC-1).
   */
  public ID getOrc1_OrderControl()  {
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
   * Returns Placer Order Number (ORC-2).
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
   * Returns Placer Order Number (ORC-2).
   */
  public EI getOrc2_PlacerOrderNumber()  {
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
   * Returns Filler Order Number (ORC-3).
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
   * Returns Filler Order Number (ORC-3).
   */
  public EI getOrc3_FillerOrderNumber()  {
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
   * Returns Placer Group Number (ORC-4).
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
   * Returns Placer Group Number (ORC-4).
   */
  public EI getOrc4_PlacerGroupNumber()  {
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
   * Returns Order Status (ORC-5).
   */
  public ID getOrderStatus()  {
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
   * Returns Order Status (ORC-5).
   */
  public ID getOrc5_OrderStatus()  {
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
   * Returns Response Flag (ORC-6).
   */
  public ID getResponseFlag()  {
    ID ret = null;
    try {
        Type t = this.getField(6, 0);
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
   * Returns Response Flag (ORC-6).
   */
  public ID getOrc6_ResponseFlag()  {
    ID ret = null;
    try {
        Type t = this.getField(6, 0);
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
   * Returns a single repetition of Quantity/Timing (ORC-7).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public TQ getQuantityTiming(int rep) throws HL7Exception {
    TQ ret = null;
    try {
        Type t = this.getField(7, rep);
        ret = (TQ)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Quantity/Timing (ORC-7).
   */
  public TQ[] getQuantityTiming() {
     TQ[] ret = null;
    try {
        Type[] t = this.getField(7);  
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
   * Returns a count of the number of repetitions of Quantity/Timing (ORC-7).
   */
  public int getQuantityTimingReps() {
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
   * Inserts a repetition of Quantity/Timing (ORC-7) at a given index and returns it.
   * @param index The index
   */
  public TQ insertQuantityTiming(int index) throws HL7Exception {
     return (TQ) super.insertRepetition(7, index);
  }

  /**
   * Removes a repetition of Quantity/Timing (ORC-7) at a given index and returns it.
   * @param index The index
   */
  public TQ removeQuantityTiming(int index) throws HL7Exception {
     return (TQ) super.removeRepetition(7, index);
  }

  /**
   * Returns a single repetition of Quantity/Timing (ORC-7).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public TQ getOrc7_QuantityTiming(int rep) throws HL7Exception {
    TQ ret = null;
    try {
        Type t = this.getField(7, rep);
        ret = (TQ)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Quantity/Timing (ORC-7).
   */
  public TQ[] getOrc7_QuantityTiming() {
     TQ[] ret = null;
    try {
        Type[] t = this.getField(7);  
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
   * Returns a count of the number of repetitions of Quantity/Timing (ORC-7).
   */
  public int getOrc7_QuantityTimingReps() {
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
   * Inserts a repetition of Quantity/Timing (ORC-7) at a given index and returns it.
   * @param index The index
   */
  public TQ insertOrc7_QuantityTiming(int index) throws HL7Exception {
     return (TQ) super.insertRepetition(7, index);
  }

  /**
   * Removes a repetition of Quantity/Timing (ORC-7) at a given index and returns it.
   * @param index The index
   */
  public TQ removeOrc7_QuantityTiming(int index) throws HL7Exception {
     return (TQ) super.removeRepetition(7, index);
  }

  /**
   * Returns Parent (ORC-8).
   */
  public EIP getORCParent()  {
    EIP ret = null;
    try {
        Type t = this.getField(8, 0);
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
   * Returns Parent (ORC-8).
   */
  public EIP getOrc8_Parent()  {
    EIP ret = null;
    try {
        Type t = this.getField(8, 0);
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
   * Returns Date/Time of Transaction (ORC-9).
   */
  public DTM getDateTimeOfTransaction()  {
    DTM ret = null;
    try {
        Type t = this.getField(9, 0);
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
   * Returns Date/Time of Transaction (ORC-9).
   */
  public DTM getOrc9_DateTimeOfTransaction()  {
    DTM ret = null;
    try {
        Type t = this.getField(9, 0);
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
   * Returns a single repetition of Entered By (ORC-10).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XCN getEnteredBy(int rep) throws HL7Exception {
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
   * Returns all repetitions of Entered By (ORC-10).
   */
  public XCN[] getEnteredBy() {
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
   * Returns a count of the number of repetitions of Entered By (ORC-10).
   */
  public int getEnteredByReps() {
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
   * Inserts a repetition of Entered By (ORC-10) at a given index and returns it.
   * @param index The index
   */
  public XCN insertEnteredBy(int index) throws HL7Exception {
     return (XCN) super.insertRepetition(10, index);
  }

  /**
   * Removes a repetition of Entered By (ORC-10) at a given index and returns it.
   * @param index The index
   */
  public XCN removeEnteredBy(int index) throws HL7Exception {
     return (XCN) super.removeRepetition(10, index);
  }

  /**
   * Returns a single repetition of Entered By (ORC-10).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XCN getOrc10_EnteredBy(int rep) throws HL7Exception {
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
   * Returns all repetitions of Entered By (ORC-10).
   */
  public XCN[] getOrc10_EnteredBy() {
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
   * Returns a count of the number of repetitions of Entered By (ORC-10).
   */
  public int getOrc10_EnteredByReps() {
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
   * Inserts a repetition of Entered By (ORC-10) at a given index and returns it.
   * @param index The index
   */
  public XCN insertOrc10_EnteredBy(int index) throws HL7Exception {
     return (XCN) super.insertRepetition(10, index);
  }

  /**
   * Removes a repetition of Entered By (ORC-10) at a given index and returns it.
   * @param index The index
   */
  public XCN removeOrc10_EnteredBy(int index) throws HL7Exception {
     return (XCN) super.removeRepetition(10, index);
  }

  /**
   * Returns a single repetition of Verified By (ORC-11).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XCN getVerifiedBy(int rep) throws HL7Exception {
    XCN ret = null;
    try {
        Type t = this.getField(11, rep);
        ret = (XCN)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Verified By (ORC-11).
   */
  public XCN[] getVerifiedBy() {
     XCN[] ret = null;
    try {
        Type[] t = this.getField(11);  
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
   * Returns a count of the number of repetitions of Verified By (ORC-11).
   */
  public int getVerifiedByReps() {
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
   * Inserts a repetition of Verified By (ORC-11) at a given index and returns it.
   * @param index The index
   */
  public XCN insertVerifiedBy(int index) throws HL7Exception {
     return (XCN) super.insertRepetition(11, index);
  }

  /**
   * Removes a repetition of Verified By (ORC-11) at a given index and returns it.
   * @param index The index
   */
  public XCN removeVerifiedBy(int index) throws HL7Exception {
     return (XCN) super.removeRepetition(11, index);
  }

  /**
   * Returns a single repetition of Verified By (ORC-11).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XCN getOrc11_VerifiedBy(int rep) throws HL7Exception {
    XCN ret = null;
    try {
        Type t = this.getField(11, rep);
        ret = (XCN)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Verified By (ORC-11).
   */
  public XCN[] getOrc11_VerifiedBy() {
     XCN[] ret = null;
    try {
        Type[] t = this.getField(11);  
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
   * Returns a count of the number of repetitions of Verified By (ORC-11).
   */
  public int getOrc11_VerifiedByReps() {
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
   * Inserts a repetition of Verified By (ORC-11) at a given index and returns it.
   * @param index The index
   */
  public XCN insertOrc11_VerifiedBy(int index) throws HL7Exception {
     return (XCN) super.insertRepetition(11, index);
  }

  /**
   * Removes a repetition of Verified By (ORC-11) at a given index and returns it.
   * @param index The index
   */
  public XCN removeOrc11_VerifiedBy(int index) throws HL7Exception {
     return (XCN) super.removeRepetition(11, index);
  }

  /**
   * Returns a single repetition of Ordering Provider (ORC-12).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XCN getOrderingProvider(int rep) throws HL7Exception {
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
   * Returns all repetitions of Ordering Provider (ORC-12).
   */
  public XCN[] getOrderingProvider() {
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
   * Returns a count of the number of repetitions of Ordering Provider (ORC-12).
   */
  public int getOrderingProviderReps() {
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
   * Inserts a repetition of Ordering Provider (ORC-12) at a given index and returns it.
   * @param index The index
   */
  public XCN insertOrderingProvider(int index) throws HL7Exception {
     return (XCN) super.insertRepetition(12, index);
  }

  /**
   * Removes a repetition of Ordering Provider (ORC-12) at a given index and returns it.
   * @param index The index
   */
  public XCN removeOrderingProvider(int index) throws HL7Exception {
     return (XCN) super.removeRepetition(12, index);
  }

  /**
   * Returns a single repetition of Ordering Provider (ORC-12).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XCN getOrc12_OrderingProvider(int rep) throws HL7Exception {
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
   * Returns all repetitions of Ordering Provider (ORC-12).
   */
  public XCN[] getOrc12_OrderingProvider() {
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
   * Returns a count of the number of repetitions of Ordering Provider (ORC-12).
   */
  public int getOrc12_OrderingProviderReps() {
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
   * Inserts a repetition of Ordering Provider (ORC-12) at a given index and returns it.
   * @param index The index
   */
  public XCN insertOrc12_OrderingProvider(int index) throws HL7Exception {
     return (XCN) super.insertRepetition(12, index);
  }

  /**
   * Removes a repetition of Ordering Provider (ORC-12) at a given index and returns it.
   * @param index The index
   */
  public XCN removeOrc12_OrderingProvider(int index) throws HL7Exception {
     return (XCN) super.removeRepetition(12, index);
  }

  /**
   * Returns Enterer's Location (ORC-13).
   */
  public PL getEntererSLocation()  {
    PL ret = null;
    try {
        Type t = this.getField(13, 0);
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
   * Returns Enterer's Location (ORC-13).
   */
  public PL getOrc13_EntererSLocation()  {
    PL ret = null;
    try {
        Type t = this.getField(13, 0);
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
   * Returns a single repetition of Call Back Phone Number (ORC-14).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XTN getCallBackPhoneNumber(int rep) throws HL7Exception {
    XTN ret = null;
    try {
        Type t = this.getField(14, rep);
        ret = (XTN)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Call Back Phone Number (ORC-14).
   */
  public XTN[] getCallBackPhoneNumber() {
     XTN[] ret = null;
    try {
        Type[] t = this.getField(14);  
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
   * Returns a count of the number of repetitions of Call Back Phone Number (ORC-14).
   */
  public int getCallBackPhoneNumberReps() {
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
   * Inserts a repetition of Call Back Phone Number (ORC-14) at a given index and returns it.
   * @param index The index
   */
  public XTN insertCallBackPhoneNumber(int index) throws HL7Exception {
     return (XTN) super.insertRepetition(14, index);
  }

  /**
   * Removes a repetition of Call Back Phone Number (ORC-14) at a given index and returns it.
   * @param index The index
   */
  public XTN removeCallBackPhoneNumber(int index) throws HL7Exception {
     return (XTN) super.removeRepetition(14, index);
  }

  /**
   * Returns a single repetition of Call Back Phone Number (ORC-14).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XTN getOrc14_CallBackPhoneNumber(int rep) throws HL7Exception {
    XTN ret = null;
    try {
        Type t = this.getField(14, rep);
        ret = (XTN)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Call Back Phone Number (ORC-14).
   */
  public XTN[] getOrc14_CallBackPhoneNumber() {
     XTN[] ret = null;
    try {
        Type[] t = this.getField(14);  
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
   * Returns a count of the number of repetitions of Call Back Phone Number (ORC-14).
   */
  public int getOrc14_CallBackPhoneNumberReps() {
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
   * Inserts a repetition of Call Back Phone Number (ORC-14) at a given index and returns it.
   * @param index The index
   */
  public XTN insertOrc14_CallBackPhoneNumber(int index) throws HL7Exception {
     return (XTN) super.insertRepetition(14, index);
  }

  /**
   * Removes a repetition of Call Back Phone Number (ORC-14) at a given index and returns it.
   * @param index The index
   */
  public XTN removeOrc14_CallBackPhoneNumber(int index) throws HL7Exception {
     return (XTN) super.removeRepetition(14, index);
  }

  /**
   * Returns Order Effective Date/Time (ORC-15).
   */
  public DTM getOrderEffectiveDateTime()  {
    DTM ret = null;
    try {
        Type t = this.getField(15, 0);
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
   * Returns Order Effective Date/Time (ORC-15).
   */
  public DTM getOrc15_OrderEffectiveDateTime()  {
    DTM ret = null;
    try {
        Type t = this.getField(15, 0);
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
   * Returns Order Control Code Reason (ORC-16).
   */
  public CWE getOrderControlCodeReason()  {
    CWE ret = null;
    try {
        Type t = this.getField(16, 0);
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
   * Returns Order Control Code Reason (ORC-16).
   */
  public CWE getOrc16_OrderControlCodeReason()  {
    CWE ret = null;
    try {
        Type t = this.getField(16, 0);
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
   * Returns Entering Organization (ORC-17).
   */
  public CWE getEnteringOrganization()  {
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
   * Returns Entering Organization (ORC-17).
   */
  public CWE getOrc17_EnteringOrganization()  {
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
   * Returns Entering Device (ORC-18).
   */
  public CWE getEnteringDevice()  {
    CWE ret = null;
    try {
        Type t = this.getField(18, 0);
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
   * Returns Entering Device (ORC-18).
   */
  public CWE getOrc18_EnteringDevice()  {
    CWE ret = null;
    try {
        Type t = this.getField(18, 0);
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
   * Returns a single repetition of Action By (ORC-19).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XCN getActionBy(int rep) throws HL7Exception {
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
   * Returns all repetitions of Action By (ORC-19).
   */
  public XCN[] getActionBy() {
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
   * Returns a count of the number of repetitions of Action By (ORC-19).
   */
  public int getActionByReps() {
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
   * Inserts a repetition of Action By (ORC-19) at a given index and returns it.
   * @param index The index
   */
  public XCN insertActionBy(int index) throws HL7Exception {
     return (XCN) super.insertRepetition(19, index);
  }

  /**
   * Removes a repetition of Action By (ORC-19) at a given index and returns it.
   * @param index The index
   */
  public XCN removeActionBy(int index) throws HL7Exception {
     return (XCN) super.removeRepetition(19, index);
  }

  /**
   * Returns a single repetition of Action By (ORC-19).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XCN getOrc19_ActionBy(int rep) throws HL7Exception {
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
   * Returns all repetitions of Action By (ORC-19).
   */
  public XCN[] getOrc19_ActionBy() {
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
   * Returns a count of the number of repetitions of Action By (ORC-19).
   */
  public int getOrc19_ActionByReps() {
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
   * Inserts a repetition of Action By (ORC-19) at a given index and returns it.
   * @param index The index
   */
  public XCN insertOrc19_ActionBy(int index) throws HL7Exception {
     return (XCN) super.insertRepetition(19, index);
  }

  /**
   * Removes a repetition of Action By (ORC-19) at a given index and returns it.
   * @param index The index
   */
  public XCN removeOrc19_ActionBy(int index) throws HL7Exception {
     return (XCN) super.removeRepetition(19, index);
  }

  /**
   * Returns Advanced Beneficiary Notice Code (ORC-20).
   */
  public CWE getAdvancedBeneficiaryNoticeCode()  {
    CWE ret = null;
    try {
        Type t = this.getField(20, 0);
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
   * Returns Advanced Beneficiary Notice Code (ORC-20).
   */
  public CWE getOrc20_AdvancedBeneficiaryNoticeCode()  {
    CWE ret = null;
    try {
        Type t = this.getField(20, 0);
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
   * Returns a single repetition of Ordering Facility Name (ORC-21).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XON getOrderingFacilityName(int rep) throws HL7Exception {
    XON ret = null;
    try {
        Type t = this.getField(21, rep);
        ret = (XON)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Ordering Facility Name (ORC-21).
   */
  public XON[] getOrderingFacilityName() {
     XON[] ret = null;
    try {
        Type[] t = this.getField(21);  
        ret = new XON[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (XON)t[i];
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
   * Returns a count of the number of repetitions of Ordering Facility Name (ORC-21).
   */
  public int getOrderingFacilityNameReps() {
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
   * Inserts a repetition of Ordering Facility Name (ORC-21) at a given index and returns it.
   * @param index The index
   */
  public XON insertOrderingFacilityName(int index) throws HL7Exception {
     return (XON) super.insertRepetition(21, index);
  }

  /**
   * Removes a repetition of Ordering Facility Name (ORC-21) at a given index and returns it.
   * @param index The index
   */
  public XON removeOrderingFacilityName(int index) throws HL7Exception {
     return (XON) super.removeRepetition(21, index);
  }

  /**
   * Returns a single repetition of Ordering Facility Name (ORC-21).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XON getOrc21_OrderingFacilityName(int rep) throws HL7Exception {
    XON ret = null;
    try {
        Type t = this.getField(21, rep);
        ret = (XON)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Ordering Facility Name (ORC-21).
   */
  public XON[] getOrc21_OrderingFacilityName() {
     XON[] ret = null;
    try {
        Type[] t = this.getField(21);  
        ret = new XON[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (XON)t[i];
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
   * Returns a count of the number of repetitions of Ordering Facility Name (ORC-21).
   */
  public int getOrc21_OrderingFacilityNameReps() {
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
   * Inserts a repetition of Ordering Facility Name (ORC-21) at a given index and returns it.
   * @param index The index
   */
  public XON insertOrc21_OrderingFacilityName(int index) throws HL7Exception {
     return (XON) super.insertRepetition(21, index);
  }

  /**
   * Removes a repetition of Ordering Facility Name (ORC-21) at a given index and returns it.
   * @param index The index
   */
  public XON removeOrc21_OrderingFacilityName(int index) throws HL7Exception {
     return (XON) super.removeRepetition(21, index);
  }

  /**
   * Returns a single repetition of Ordering Facility Address (ORC-22).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XAD getOrderingFacilityAddress(int rep) throws HL7Exception {
    XAD ret = null;
    try {
        Type t = this.getField(22, rep);
        ret = (XAD)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Ordering Facility Address (ORC-22).
   */
  public XAD[] getOrderingFacilityAddress() {
     XAD[] ret = null;
    try {
        Type[] t = this.getField(22);  
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
   * Returns a count of the number of repetitions of Ordering Facility Address (ORC-22).
   */
  public int getOrderingFacilityAddressReps() {
    try {
        return this.getField(22).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Ordering Facility Address (ORC-22) at a given index and returns it.
   * @param index The index
   */
  public XAD insertOrderingFacilityAddress(int index) throws HL7Exception {
     return (XAD) super.insertRepetition(22, index);
  }

  /**
   * Removes a repetition of Ordering Facility Address (ORC-22) at a given index and returns it.
   * @param index The index
   */
  public XAD removeOrderingFacilityAddress(int index) throws HL7Exception {
     return (XAD) super.removeRepetition(22, index);
  }

  /**
   * Returns a single repetition of Ordering Facility Address (ORC-22).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XAD getOrc22_OrderingFacilityAddress(int rep) throws HL7Exception {
    XAD ret = null;
    try {
        Type t = this.getField(22, rep);
        ret = (XAD)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Ordering Facility Address (ORC-22).
   */
  public XAD[] getOrc22_OrderingFacilityAddress() {
     XAD[] ret = null;
    try {
        Type[] t = this.getField(22);  
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
   * Returns a count of the number of repetitions of Ordering Facility Address (ORC-22).
   */
  public int getOrc22_OrderingFacilityAddressReps() {
    try {
        return this.getField(22).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Ordering Facility Address (ORC-22) at a given index and returns it.
   * @param index The index
   */
  public XAD insertOrc22_OrderingFacilityAddress(int index) throws HL7Exception {
     return (XAD) super.insertRepetition(22, index);
  }

  /**
   * Removes a repetition of Ordering Facility Address (ORC-22) at a given index and returns it.
   * @param index The index
   */
  public XAD removeOrc22_OrderingFacilityAddress(int index) throws HL7Exception {
     return (XAD) super.removeRepetition(22, index);
  }

  /**
   * Returns a single repetition of Ordering Facility Phone Number (ORC-23).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XTN getOrderingFacilityPhoneNumber(int rep) throws HL7Exception {
    XTN ret = null;
    try {
        Type t = this.getField(23, rep);
        ret = (XTN)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Ordering Facility Phone Number (ORC-23).
   */
  public XTN[] getOrderingFacilityPhoneNumber() {
     XTN[] ret = null;
    try {
        Type[] t = this.getField(23);  
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
   * Returns a count of the number of repetitions of Ordering Facility Phone Number (ORC-23).
   */
  public int getOrderingFacilityPhoneNumberReps() {
    try {
        return this.getField(23).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Ordering Facility Phone Number (ORC-23) at a given index and returns it.
   * @param index The index
   */
  public XTN insertOrderingFacilityPhoneNumber(int index) throws HL7Exception {
     return (XTN) super.insertRepetition(23, index);
  }

  /**
   * Removes a repetition of Ordering Facility Phone Number (ORC-23) at a given index and returns it.
   * @param index The index
   */
  public XTN removeOrderingFacilityPhoneNumber(int index) throws HL7Exception {
     return (XTN) super.removeRepetition(23, index);
  }

  /**
   * Returns a single repetition of Ordering Facility Phone Number (ORC-23).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XTN getOrc23_OrderingFacilityPhoneNumber(int rep) throws HL7Exception {
    XTN ret = null;
    try {
        Type t = this.getField(23, rep);
        ret = (XTN)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Ordering Facility Phone Number (ORC-23).
   */
  public XTN[] getOrc23_OrderingFacilityPhoneNumber() {
     XTN[] ret = null;
    try {
        Type[] t = this.getField(23);  
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
   * Returns a count of the number of repetitions of Ordering Facility Phone Number (ORC-23).
   */
  public int getOrc23_OrderingFacilityPhoneNumberReps() {
    try {
        return this.getField(23).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Ordering Facility Phone Number (ORC-23) at a given index and returns it.
   * @param index The index
   */
  public XTN insertOrc23_OrderingFacilityPhoneNumber(int index) throws HL7Exception {
     return (XTN) super.insertRepetition(23, index);
  }

  /**
   * Removes a repetition of Ordering Facility Phone Number (ORC-23) at a given index and returns it.
   * @param index The index
   */
  public XTN removeOrc23_OrderingFacilityPhoneNumber(int index) throws HL7Exception {
     return (XTN) super.removeRepetition(23, index);
  }

  /**
   * Returns a single repetition of Ordering Provider Address (ORC-24).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XAD getOrderingProviderAddress(int rep) throws HL7Exception {
    XAD ret = null;
    try {
        Type t = this.getField(24, rep);
        ret = (XAD)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Ordering Provider Address (ORC-24).
   */
  public XAD[] getOrderingProviderAddress() {
     XAD[] ret = null;
    try {
        Type[] t = this.getField(24);  
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
   * Returns a count of the number of repetitions of Ordering Provider Address (ORC-24).
   */
  public int getOrderingProviderAddressReps() {
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
   * Inserts a repetition of Ordering Provider Address (ORC-24) at a given index and returns it.
   * @param index The index
   */
  public XAD insertOrderingProviderAddress(int index) throws HL7Exception {
     return (XAD) super.insertRepetition(24, index);
  }

  /**
   * Removes a repetition of Ordering Provider Address (ORC-24) at a given index and returns it.
   * @param index The index
   */
  public XAD removeOrderingProviderAddress(int index) throws HL7Exception {
     return (XAD) super.removeRepetition(24, index);
  }

  /**
   * Returns a single repetition of Ordering Provider Address (ORC-24).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XAD getOrc24_OrderingProviderAddress(int rep) throws HL7Exception {
    XAD ret = null;
    try {
        Type t = this.getField(24, rep);
        ret = (XAD)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Ordering Provider Address (ORC-24).
   */
  public XAD[] getOrc24_OrderingProviderAddress() {
     XAD[] ret = null;
    try {
        Type[] t = this.getField(24);  
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
   * Returns a count of the number of repetitions of Ordering Provider Address (ORC-24).
   */
  public int getOrc24_OrderingProviderAddressReps() {
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
   * Inserts a repetition of Ordering Provider Address (ORC-24) at a given index and returns it.
   * @param index The index
   */
  public XAD insertOrc24_OrderingProviderAddress(int index) throws HL7Exception {
     return (XAD) super.insertRepetition(24, index);
  }

  /**
   * Removes a repetition of Ordering Provider Address (ORC-24) at a given index and returns it.
   * @param index The index
   */
  public XAD removeOrc24_OrderingProviderAddress(int index) throws HL7Exception {
     return (XAD) super.removeRepetition(24, index);
  }

  /**
   * Returns Order Status Modifier (ORC-25).
   */
  public CWE getOrderStatusModifier()  {
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
   * Returns Order Status Modifier (ORC-25).
   */
  public CWE getOrc25_OrderStatusModifier()  {
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
   * Returns Advanced Beneficiary Notice Override Reason (ORC-26).
   */
  public CWE getAdvancedBeneficiaryNoticeOverrideReason()  {
    CWE ret = null;
    try {
        Type t = this.getField(26, 0);
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
   * Returns Advanced Beneficiary Notice Override Reason (ORC-26).
   */
  public CWE getOrc26_AdvancedBeneficiaryNoticeOverrideReason()  {
    CWE ret = null;
    try {
        Type t = this.getField(26, 0);
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
   * Returns Filler's Expected Availability Date/Time (ORC-27).
   */
  public DTM getFillerSExpectedAvailabilityDateTime()  {
    DTM ret = null;
    try {
        Type t = this.getField(27, 0);
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
   * Returns Filler's Expected Availability Date/Time (ORC-27).
   */
  public DTM getOrc27_FillerSExpectedAvailabilityDateTime()  {
    DTM ret = null;
    try {
        Type t = this.getField(27, 0);
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
   * Returns Confidentiality Code (ORC-28).
   */
  public CWE getConfidentialityCode()  {
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
   * Returns Confidentiality Code (ORC-28).
   */
  public CWE getOrc28_ConfidentialityCode()  {
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
   * Returns Order Type (ORC-29).
   */
  public CWE getOrderType()  {
    CWE ret = null;
    try {
        Type t = this.getField(29, 0);
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
   * Returns Order Type (ORC-29).
   */
  public CWE getOrc29_OrderType()  {
    CWE ret = null;
    try {
        Type t = this.getField(29, 0);
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
   * Returns Enterer Authorization Mode (ORC-30).
   */
  public CNE getEntererAuthorizationMode()  {
    CNE ret = null;
    try {
        Type t = this.getField(30, 0);
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
   * Returns Enterer Authorization Mode (ORC-30).
   */
  public CNE getOrc30_EntererAuthorizationMode()  {
    CNE ret = null;
    try {
        Type t = this.getField(30, 0);
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
   * Returns Parent Universal Service Identifier (ORC-31).
   */
  public CWE getParentUniversalServiceIdentifier()  {
    CWE ret = null;
    try {
        Type t = this.getField(31, 0);
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
   * Returns Parent Universal Service Identifier (ORC-31).
   */
  public CWE getOrc31_ParentUniversalServiceIdentifier()  {
    CWE ret = null;
    try {
        Type t = this.getField(31, 0);
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
         case 0: return new ca.uhn.hl7v2.model.v26.datatype.ID(getMessage(), new Integer(119));
         case 1: return new ca.uhn.hl7v2.model.v26.datatype.EI(getMessage());
         case 2: return new ca.uhn.hl7v2.model.v26.datatype.EI(getMessage());
         case 3: return new ca.uhn.hl7v2.model.v26.datatype.EI(getMessage());
         case 4: return new ca.uhn.hl7v2.model.v26.datatype.ID(getMessage(), new Integer(38));
         case 5: return new ca.uhn.hl7v2.model.v26.datatype.ID(getMessage(), new Integer(121));
         case 6: return new ca.uhn.hl7v2.model.v26.datatype.TQ(getMessage());
         case 7: return new ca.uhn.hl7v2.model.v26.datatype.EIP(getMessage());
         case 8: return new ca.uhn.hl7v2.model.v26.datatype.DTM(getMessage());
         case 9: return new ca.uhn.hl7v2.model.v26.datatype.XCN(getMessage());
         case 10: return new ca.uhn.hl7v2.model.v26.datatype.XCN(getMessage());
         case 11: return new ca.uhn.hl7v2.model.v26.datatype.XCN(getMessage());
         case 12: return new ca.uhn.hl7v2.model.v26.datatype.PL(getMessage());
         case 13: return new ca.uhn.hl7v2.model.v26.datatype.XTN(getMessage());
         case 14: return new ca.uhn.hl7v2.model.v26.datatype.DTM(getMessage());
         case 15: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 16: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 17: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 18: return new ca.uhn.hl7v2.model.v26.datatype.XCN(getMessage());
         case 19: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 20: return new ca.uhn.hl7v2.model.v26.datatype.XON(getMessage());
         case 21: return new ca.uhn.hl7v2.model.v26.datatype.XAD(getMessage());
         case 22: return new ca.uhn.hl7v2.model.v26.datatype.XTN(getMessage());
         case 23: return new ca.uhn.hl7v2.model.v26.datatype.XAD(getMessage());
         case 24: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 25: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 26: return new ca.uhn.hl7v2.model.v26.datatype.DTM(getMessage());
         case 27: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 28: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 29: return new ca.uhn.hl7v2.model.v26.datatype.CNE(getMessage());
         case 30: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         default: return null;
      }
   }

}