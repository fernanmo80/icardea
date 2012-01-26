package ca.uhn.hl7v2.model.v26.segment;

import ca.uhn.hl7v2.model.*;
import ca.uhn.hl7v2.model.v26.datatype.*;
import ca.uhn.log.HapiLogFactory;
import ca.uhn.hl7v2.parser.ModelClassFactory;
import ca.uhn.hl7v2.HL7Exception;

/**
 * <p>Represents an HL7 INV message segment. 
 * This segment has the following fields:</p><p>
 * INV-1: Substance Identifier (CWE)<br> 
 * INV-2: Substance Status (CWE)<br> 
 * INV-3: Substance Type (CWE)<br> 
 * INV-4: Inventory Container Identifier (CWE)<br> 
 * INV-5: Container Carrier Identifier (CWE)<br> 
 * INV-6: Position on Carrier (CWE)<br> 
 * INV-7: Initial Quantity (NM)<br> 
 * INV-8: Current Quantity (NM)<br> 
 * INV-9: Available Quantity (NM)<br> 
 * INV-10: Consumption Quantity (NM)<br> 
 * INV-11: Quantity Units (CWE)<br> 
 * INV-12: Expiration Date/Time (DTM)<br> 
 * INV-13: First Used Date/Time (DTM)<br> 
 * INV-14: On Board Stability Duration (TQ)<br> 
 * INV-15: Test/Fluid Identifier(s) (CWE)<br> 
 * INV-16: Manufacturer Lot Number (ST)<br> 
 * INV-17: Manufacturer Identifier (CWE)<br> 
 * INV-18: Supplier Identifier (CWE)<br> 
 * INV-19: On Board Stability Time (CQ)<br> 
 * INV-20: Target Value (CQ)<br> 
 * </p><p>The get...() methods return data from individual fields.  These methods 
 * do not throw exceptions and may therefore have to handle exceptions internally.  
 * If an exception is handled internally, it is logged and null is returned.  
 * This is not expected to happen - if it does happen this indicates not so much 
 * an exceptional circumstance as a bug in the code for this class.</p>    
 */
public class INV extends AbstractSegment  {

  /**
   * Creates a INV (Inventory Detail) segment object that belongs to the given 
   * message.  
   */
  public INV(Group parent, ModelClassFactory factory) {
    super(parent, factory);
    Message message = getMessage();
    try {
       this.add(CWE.class, true, 1, 705, new Object[]{message}, "Substance Identifier");
       this.add(CWE.class, true, 0, 705, new Object[]{message}, "Substance Status");
       this.add(CWE.class, false, 1, 705, new Object[]{message}, "Substance Type");
       this.add(CWE.class, false, 1, 705, new Object[]{message}, "Inventory Container Identifier");
       this.add(CWE.class, false, 1, 705, new Object[]{message}, "Container Carrier Identifier");
       this.add(CWE.class, false, 1, 705, new Object[]{message}, "Position on Carrier");
       this.add(NM.class, false, 1, 20, new Object[]{message}, "Initial Quantity");
       this.add(NM.class, false, 1, 20, new Object[]{message}, "Current Quantity");
       this.add(NM.class, false, 1, 20, new Object[]{message}, "Available Quantity");
       this.add(NM.class, false, 1, 20, new Object[]{message}, "Consumption Quantity");
       this.add(CWE.class, false, 1, 705, new Object[]{message}, "Quantity Units");
       this.add(DTM.class, false, 1, 24, new Object[]{message}, "Expiration Date/Time");
       this.add(DTM.class, false, 1, 24, new Object[]{message}, "First Used Date/Time");
       this.add(TQ.class, false, 1, 0, new Object[]{message}, "On Board Stability Duration");
       this.add(CWE.class, false, 0, 705, new Object[]{message}, "Test/Fluid Identifier(s)");
       this.add(ST.class, false, 1, 200, new Object[]{message}, "Manufacturer Lot Number");
       this.add(CWE.class, false, 1, 705, new Object[]{message}, "Manufacturer Identifier");
       this.add(CWE.class, false, 1, 705, new Object[]{message}, "Supplier Identifier");
       this.add(CQ.class, false, 1, 722, new Object[]{message}, "On Board Stability Time");
       this.add(CQ.class, false, 1, 722, new Object[]{message}, "Target Value");
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Can't instantiate " + this.getClass().getName(), he);
    }
  }

  /**
   * Returns Substance Identifier (INV-1).
   */
  public CWE getSubstanceIdentifier()  {
    CWE ret = null;
    try {
        Type t = this.getField(1, 0);
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
   * Returns Substance Identifier (INV-1).
   */
  public CWE getInv1_SubstanceIdentifier()  {
    CWE ret = null;
    try {
        Type t = this.getField(1, 0);
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
   * Returns a single repetition of Substance Status (INV-2).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getSubstanceStatus(int rep) throws HL7Exception {
    CWE ret = null;
    try {
        Type t = this.getField(2, rep);
        ret = (CWE)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Substance Status (INV-2).
   */
  public CWE[] getSubstanceStatus() {
     CWE[] ret = null;
    try {
        Type[] t = this.getField(2);  
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
   * Returns a count of the number of repetitions of Substance Status (INV-2).
   */
  public int getSubstanceStatusReps() {
    try {
        return this.getField(2).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Substance Status (INV-2) at a given index and returns it.
   * @param index The index
   */
  public CWE insertSubstanceStatus(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(2, index);
  }

  /**
   * Removes a repetition of Substance Status (INV-2) at a given index and returns it.
   * @param index The index
   */
  public CWE removeSubstanceStatus(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(2, index);
  }

  /**
   * Returns a single repetition of Substance Status (INV-2).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getInv2_SubstanceStatus(int rep) throws HL7Exception {
    CWE ret = null;
    try {
        Type t = this.getField(2, rep);
        ret = (CWE)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Substance Status (INV-2).
   */
  public CWE[] getInv2_SubstanceStatus() {
     CWE[] ret = null;
    try {
        Type[] t = this.getField(2);  
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
   * Returns a count of the number of repetitions of Substance Status (INV-2).
   */
  public int getInv2_SubstanceStatusReps() {
    try {
        return this.getField(2).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Substance Status (INV-2) at a given index and returns it.
   * @param index The index
   */
  public CWE insertInv2_SubstanceStatus(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(2, index);
  }

  /**
   * Removes a repetition of Substance Status (INV-2) at a given index and returns it.
   * @param index The index
   */
  public CWE removeInv2_SubstanceStatus(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(2, index);
  }

  /**
   * Returns Substance Type (INV-3).
   */
  public CWE getSubstanceType()  {
    CWE ret = null;
    try {
        Type t = this.getField(3, 0);
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
   * Returns Substance Type (INV-3).
   */
  public CWE getInv3_SubstanceType()  {
    CWE ret = null;
    try {
        Type t = this.getField(3, 0);
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
   * Returns Inventory Container Identifier (INV-4).
   */
  public CWE getInventoryContainerIdentifier()  {
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
   * Returns Inventory Container Identifier (INV-4).
   */
  public CWE getInv4_InventoryContainerIdentifier()  {
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
   * Returns Container Carrier Identifier (INV-5).
   */
  public CWE getContainerCarrierIdentifier()  {
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
   * Returns Container Carrier Identifier (INV-5).
   */
  public CWE getInv5_ContainerCarrierIdentifier()  {
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
   * Returns Position on Carrier (INV-6).
   */
  public CWE getPositionOnCarrier()  {
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
   * Returns Position on Carrier (INV-6).
   */
  public CWE getInv6_PositionOnCarrier()  {
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
   * Returns Initial Quantity (INV-7).
   */
  public NM getInitialQuantity()  {
    NM ret = null;
    try {
        Type t = this.getField(7, 0);
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
   * Returns Initial Quantity (INV-7).
   */
  public NM getInv7_InitialQuantity()  {
    NM ret = null;
    try {
        Type t = this.getField(7, 0);
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
   * Returns Current Quantity (INV-8).
   */
  public NM getCurrentQuantity()  {
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
   * Returns Current Quantity (INV-8).
   */
  public NM getInv8_CurrentQuantity()  {
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
   * Returns Available Quantity (INV-9).
   */
  public NM getAvailableQuantity()  {
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
   * Returns Available Quantity (INV-9).
   */
  public NM getInv9_AvailableQuantity()  {
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
   * Returns Consumption Quantity (INV-10).
   */
  public NM getConsumptionQuantity()  {
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
   * Returns Consumption Quantity (INV-10).
   */
  public NM getInv10_ConsumptionQuantity()  {
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
   * Returns Quantity Units (INV-11).
   */
  public CWE getQuantityUnits()  {
    CWE ret = null;
    try {
        Type t = this.getField(11, 0);
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
   * Returns Quantity Units (INV-11).
   */
  public CWE getInv11_QuantityUnits()  {
    CWE ret = null;
    try {
        Type t = this.getField(11, 0);
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
   * Returns Expiration Date/Time (INV-12).
   */
  public DTM getExpirationDateTime()  {
    DTM ret = null;
    try {
        Type t = this.getField(12, 0);
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
   * Returns Expiration Date/Time (INV-12).
   */
  public DTM getInv12_ExpirationDateTime()  {
    DTM ret = null;
    try {
        Type t = this.getField(12, 0);
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
   * Returns First Used Date/Time (INV-13).
   */
  public DTM getFirstUsedDateTime()  {
    DTM ret = null;
    try {
        Type t = this.getField(13, 0);
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
   * Returns First Used Date/Time (INV-13).
   */
  public DTM getInv13_FirstUsedDateTime()  {
    DTM ret = null;
    try {
        Type t = this.getField(13, 0);
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
   * Returns On Board Stability Duration (INV-14).
   */
  public TQ getOnBoardStabilityDuration()  {
    TQ ret = null;
    try {
        Type t = this.getField(14, 0);
        ret = (TQ)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns On Board Stability Duration (INV-14).
   */
  public TQ getInv14_OnBoardStabilityDuration()  {
    TQ ret = null;
    try {
        Type t = this.getField(14, 0);
        ret = (TQ)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns a single repetition of Test/Fluid Identifier(s) (INV-15).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getTestFluidIdentifierS(int rep) throws HL7Exception {
    CWE ret = null;
    try {
        Type t = this.getField(15, rep);
        ret = (CWE)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Test/Fluid Identifier(s) (INV-15).
   */
  public CWE[] getTestFluidIdentifierS() {
     CWE[] ret = null;
    try {
        Type[] t = this.getField(15);  
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
   * Returns a count of the number of repetitions of Test/Fluid Identifier(s) (INV-15).
   */
  public int getTestFluidIdentifierSReps() {
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
   * Inserts a repetition of Test/Fluid Identifier(s) (INV-15) at a given index and returns it.
   * @param index The index
   */
  public CWE insertTestFluidIdentifierS(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(15, index);
  }

  /**
   * Removes a repetition of Test/Fluid Identifier(s) (INV-15) at a given index and returns it.
   * @param index The index
   */
  public CWE removeTestFluidIdentifierS(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(15, index);
  }

  /**
   * Returns a single repetition of Test/Fluid Identifier(s) (INV-15).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getInv15_TestFluidIdentifierS(int rep) throws HL7Exception {
    CWE ret = null;
    try {
        Type t = this.getField(15, rep);
        ret = (CWE)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Test/Fluid Identifier(s) (INV-15).
   */
  public CWE[] getInv15_TestFluidIdentifierS() {
     CWE[] ret = null;
    try {
        Type[] t = this.getField(15);  
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
   * Returns a count of the number of repetitions of Test/Fluid Identifier(s) (INV-15).
   */
  public int getInv15_TestFluidIdentifierSReps() {
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
   * Inserts a repetition of Test/Fluid Identifier(s) (INV-15) at a given index and returns it.
   * @param index The index
   */
  public CWE insertInv15_TestFluidIdentifierS(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(15, index);
  }

  /**
   * Removes a repetition of Test/Fluid Identifier(s) (INV-15) at a given index and returns it.
   * @param index The index
   */
  public CWE removeInv15_TestFluidIdentifierS(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(15, index);
  }

  /**
   * Returns Manufacturer Lot Number (INV-16).
   */
  public ST getManufacturerLotNumber()  {
    ST ret = null;
    try {
        Type t = this.getField(16, 0);
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
   * Returns Manufacturer Lot Number (INV-16).
   */
  public ST getInv16_ManufacturerLotNumber()  {
    ST ret = null;
    try {
        Type t = this.getField(16, 0);
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
   * Returns Manufacturer Identifier (INV-17).
   */
  public CWE getManufacturerIdentifier()  {
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
   * Returns Manufacturer Identifier (INV-17).
   */
  public CWE getInv17_ManufacturerIdentifier()  {
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
   * Returns Supplier Identifier (INV-18).
   */
  public CWE getSupplierIdentifier()  {
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
   * Returns Supplier Identifier (INV-18).
   */
  public CWE getInv18_SupplierIdentifier()  {
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
   * Returns On Board Stability Time (INV-19).
   */
  public CQ getOnBoardStabilityTime()  {
    CQ ret = null;
    try {
        Type t = this.getField(19, 0);
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
   * Returns On Board Stability Time (INV-19).
   */
  public CQ getInv19_OnBoardStabilityTime()  {
    CQ ret = null;
    try {
        Type t = this.getField(19, 0);
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
   * Returns Target Value (INV-20).
   */
  public CQ getTargetValue()  {
    CQ ret = null;
    try {
        Type t = this.getField(20, 0);
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
   * Returns Target Value (INV-20).
   */
  public CQ getInv20_TargetValue()  {
    CQ ret = null;
    try {
        Type t = this.getField(20, 0);
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
         case 0: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 1: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 2: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 3: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 4: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 5: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 6: return new ca.uhn.hl7v2.model.v26.datatype.NM(getMessage());
         case 7: return new ca.uhn.hl7v2.model.v26.datatype.NM(getMessage());
         case 8: return new ca.uhn.hl7v2.model.v26.datatype.NM(getMessage());
         case 9: return new ca.uhn.hl7v2.model.v26.datatype.NM(getMessage());
         case 10: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 11: return new ca.uhn.hl7v2.model.v26.datatype.DTM(getMessage());
         case 12: return new ca.uhn.hl7v2.model.v26.datatype.DTM(getMessage());
         case 13: return new ca.uhn.hl7v2.model.v26.datatype.TQ(getMessage());
         case 14: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 15: return new ca.uhn.hl7v2.model.v26.datatype.ST(getMessage());
         case 16: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 17: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 18: return new ca.uhn.hl7v2.model.v26.datatype.CQ(getMessage());
         case 19: return new ca.uhn.hl7v2.model.v26.datatype.CQ(getMessage());
         default: return null;
      }
   }

}