package ca.uhn.hl7v2.model.v26.segment;

import ca.uhn.hl7v2.model.*;
import ca.uhn.hl7v2.model.v26.datatype.*;
import ca.uhn.log.HapiLogFactory;
import ca.uhn.hl7v2.parser.ModelClassFactory;
import ca.uhn.hl7v2.HL7Exception;

/**
 * <p>Represents an HL7 BPO message segment. 
 * This segment has the following fields:</p><p>
 * BPO-1: Set ID - BPO (SI)<br> 
 * BPO-2: BP Universal Service Identifier (CWE)<br> 
 * BPO-3: BP  Processing Requirements (CWE)<br> 
 * BPO-4: BP Quantity (NM)<br> 
 * BPO-5: BP Amount (NM)<br> 
 * BPO-6: BP Units (CWE)<br> 
 * BPO-7: BP Intended Use Date/Time (DTM)<br> 
 * BPO-8: BP Intended Dispense From Location (PL)<br> 
 * BPO-9: BP Intended Dispense From Address (XAD)<br> 
 * BPO-10: BP Requested Dispense Date/Time (DTM)<br> 
 * BPO-11: BP Requested Dispense To Location (PL)<br> 
 * BPO-12: BP Requested Dispense To Address (XAD)<br> 
 * BPO-13: BP Indication for Use (CWE)<br> 
 * BPO-14: BP Informed Consent Indicator (ID)<br> 
 * </p><p>The get...() methods return data from individual fields.  These methods 
 * do not throw exceptions and may therefore have to handle exceptions internally.  
 * If an exception is handled internally, it is logged and null is returned.  
 * This is not expected to happen - if it does happen this indicates not so much 
 * an exceptional circumstance as a bug in the code for this class.</p>    
 */
public class BPO extends AbstractSegment  {

  /**
   * Creates a BPO (Blood product order) segment object that belongs to the given 
   * message.  
   */
  public BPO(Group parent, ModelClassFactory factory) {
    super(parent, factory);
    Message message = getMessage();
    try {
       this.add(SI.class, true, 1, 4, new Object[]{message}, "Set ID - BPO");
       this.add(CWE.class, true, 1, 250, new Object[]{message}, "BP Universal Service Identifier");
       this.add(CWE.class, false, 0, 250, new Object[]{message}, "BP  Processing Requirements");
       this.add(NM.class, true, 1, 5, new Object[]{message}, "BP Quantity");
       this.add(NM.class, false, 1, 5, new Object[]{message}, "BP Amount");
       this.add(CWE.class, false, 1, 250, new Object[]{message}, "BP Units");
       this.add(DTM.class, false, 1, 24, new Object[]{message}, "BP Intended Use Date/Time");
       this.add(PL.class, false, 1, 80, new Object[]{message}, "BP Intended Dispense From Location");
       this.add(XAD.class, false, 1, 250, new Object[]{message}, "BP Intended Dispense From Address");
       this.add(DTM.class, false, 1, 24, new Object[]{message}, "BP Requested Dispense Date/Time");
       this.add(PL.class, false, 1, 80, new Object[]{message}, "BP Requested Dispense To Location");
       this.add(XAD.class, false, 1, 250, new Object[]{message}, "BP Requested Dispense To Address");
       this.add(CWE.class, false, 0, 250, new Object[]{message}, "BP Indication for Use");
       this.add(ID.class, false, 1, 1, new Object[]{message, new Integer(136)}, "BP Informed Consent Indicator");
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Can't instantiate " + this.getClass().getName(), he);
    }
  }

  /**
   * Returns Set ID - BPO (BPO-1).
   */
  public SI getSetIDBPO()  {
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
   * Returns Set ID - BPO (BPO-1).
   */
  public SI getBpo1_SetIDBPO()  {
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
   * Returns BP Universal Service Identifier (BPO-2).
   */
  public CWE getBPUniversalServiceIdentifier()  {
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
   * Returns BP Universal Service Identifier (BPO-2).
   */
  public CWE getBpo2_BPUniversalServiceIdentifier()  {
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
   * Returns a single repetition of BP  Processing Requirements (BPO-3).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getBPProcessingRequirements(int rep) throws HL7Exception {
    CWE ret = null;
    try {
        Type t = this.getField(3, rep);
        ret = (CWE)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of BP  Processing Requirements (BPO-3).
   */
  public CWE[] getBPProcessingRequirements() {
     CWE[] ret = null;
    try {
        Type[] t = this.getField(3);  
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
   * Returns a count of the number of repetitions of BP  Processing Requirements (BPO-3).
   */
  public int getBPProcessingRequirementsReps() {
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
   * Inserts a repetition of BP  Processing Requirements (BPO-3) at a given index and returns it.
   * @param index The index
   */
  public CWE insertBPProcessingRequirements(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(3, index);
  }

  /**
   * Removes a repetition of BP  Processing Requirements (BPO-3) at a given index and returns it.
   * @param index The index
   */
  public CWE removeBPProcessingRequirements(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(3, index);
  }

  /**
   * Returns a single repetition of BP  Processing Requirements (BPO-3).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getBpo3_BPProcessingRequirements(int rep) throws HL7Exception {
    CWE ret = null;
    try {
        Type t = this.getField(3, rep);
        ret = (CWE)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of BP  Processing Requirements (BPO-3).
   */
  public CWE[] getBpo3_BPProcessingRequirements() {
     CWE[] ret = null;
    try {
        Type[] t = this.getField(3);  
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
   * Returns a count of the number of repetitions of BP  Processing Requirements (BPO-3).
   */
  public int getBpo3_BPProcessingRequirementsReps() {
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
   * Inserts a repetition of BP  Processing Requirements (BPO-3) at a given index and returns it.
   * @param index The index
   */
  public CWE insertBpo3_BPProcessingRequirements(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(3, index);
  }

  /**
   * Removes a repetition of BP  Processing Requirements (BPO-3) at a given index and returns it.
   * @param index The index
   */
  public CWE removeBpo3_BPProcessingRequirements(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(3, index);
  }

  /**
   * Returns BP Quantity (BPO-4).
   */
  public NM getBPQuantity()  {
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
   * Returns BP Quantity (BPO-4).
   */
  public NM getBpo4_BPQuantity()  {
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
   * Returns BP Amount (BPO-5).
   */
  public NM getBPAmount()  {
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
   * Returns BP Amount (BPO-5).
   */
  public NM getBpo5_BPAmount()  {
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
   * Returns BP Units (BPO-6).
   */
  public CWE getBPUnits()  {
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
   * Returns BP Units (BPO-6).
   */
  public CWE getBpo6_BPUnits()  {
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
   * Returns BP Intended Use Date/Time (BPO-7).
   */
  public DTM getBPIntendedUseDateTime()  {
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
   * Returns BP Intended Use Date/Time (BPO-7).
   */
  public DTM getBpo7_BPIntendedUseDateTime()  {
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
   * Returns BP Intended Dispense From Location (BPO-8).
   */
  public PL getBPIntendedDispenseFromLocation()  {
    PL ret = null;
    try {
        Type t = this.getField(8, 0);
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
   * Returns BP Intended Dispense From Location (BPO-8).
   */
  public PL getBpo8_BPIntendedDispenseFromLocation()  {
    PL ret = null;
    try {
        Type t = this.getField(8, 0);
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
   * Returns BP Intended Dispense From Address (BPO-9).
   */
  public XAD getBPIntendedDispenseFromAddress()  {
    XAD ret = null;
    try {
        Type t = this.getField(9, 0);
        ret = (XAD)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns BP Intended Dispense From Address (BPO-9).
   */
  public XAD getBpo9_BPIntendedDispenseFromAddress()  {
    XAD ret = null;
    try {
        Type t = this.getField(9, 0);
        ret = (XAD)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns BP Requested Dispense Date/Time (BPO-10).
   */
  public DTM getBPRequestedDispenseDateTime()  {
    DTM ret = null;
    try {
        Type t = this.getField(10, 0);
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
   * Returns BP Requested Dispense Date/Time (BPO-10).
   */
  public DTM getBpo10_BPRequestedDispenseDateTime()  {
    DTM ret = null;
    try {
        Type t = this.getField(10, 0);
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
   * Returns BP Requested Dispense To Location (BPO-11).
   */
  public PL getBPRequestedDispenseToLocation()  {
    PL ret = null;
    try {
        Type t = this.getField(11, 0);
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
   * Returns BP Requested Dispense To Location (BPO-11).
   */
  public PL getBpo11_BPRequestedDispenseToLocation()  {
    PL ret = null;
    try {
        Type t = this.getField(11, 0);
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
   * Returns BP Requested Dispense To Address (BPO-12).
   */
  public XAD getBPRequestedDispenseToAddress()  {
    XAD ret = null;
    try {
        Type t = this.getField(12, 0);
        ret = (XAD)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns BP Requested Dispense To Address (BPO-12).
   */
  public XAD getBpo12_BPRequestedDispenseToAddress()  {
    XAD ret = null;
    try {
        Type t = this.getField(12, 0);
        ret = (XAD)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns a single repetition of BP Indication for Use (BPO-13).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getBPIndicationForUse(int rep) throws HL7Exception {
    CWE ret = null;
    try {
        Type t = this.getField(13, rep);
        ret = (CWE)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of BP Indication for Use (BPO-13).
   */
  public CWE[] getBPIndicationForUse() {
     CWE[] ret = null;
    try {
        Type[] t = this.getField(13);  
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
   * Returns a count of the number of repetitions of BP Indication for Use (BPO-13).
   */
  public int getBPIndicationForUseReps() {
    try {
        return this.getField(13).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of BP Indication for Use (BPO-13) at a given index and returns it.
   * @param index The index
   */
  public CWE insertBPIndicationForUse(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(13, index);
  }

  /**
   * Removes a repetition of BP Indication for Use (BPO-13) at a given index and returns it.
   * @param index The index
   */
  public CWE removeBPIndicationForUse(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(13, index);
  }

  /**
   * Returns a single repetition of BP Indication for Use (BPO-13).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getBpo13_BPIndicationForUse(int rep) throws HL7Exception {
    CWE ret = null;
    try {
        Type t = this.getField(13, rep);
        ret = (CWE)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of BP Indication for Use (BPO-13).
   */
  public CWE[] getBpo13_BPIndicationForUse() {
     CWE[] ret = null;
    try {
        Type[] t = this.getField(13);  
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
   * Returns a count of the number of repetitions of BP Indication for Use (BPO-13).
   */
  public int getBpo13_BPIndicationForUseReps() {
    try {
        return this.getField(13).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of BP Indication for Use (BPO-13) at a given index and returns it.
   * @param index The index
   */
  public CWE insertBpo13_BPIndicationForUse(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(13, index);
  }

  /**
   * Removes a repetition of BP Indication for Use (BPO-13) at a given index and returns it.
   * @param index The index
   */
  public CWE removeBpo13_BPIndicationForUse(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(13, index);
  }

  /**
   * Returns BP Informed Consent Indicator (BPO-14).
   */
  public ID getBPInformedConsentIndicator()  {
    ID ret = null;
    try {
        Type t = this.getField(14, 0);
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
   * Returns BP Informed Consent Indicator (BPO-14).
   */
  public ID getBpo14_BPInformedConsentIndicator()  {
    ID ret = null;
    try {
        Type t = this.getField(14, 0);
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

   protected Type createNewTypeWithoutReflection(int field) {
      switch (field) {
         case 0: return new ca.uhn.hl7v2.model.v26.datatype.SI(getMessage());
         case 1: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 2: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 3: return new ca.uhn.hl7v2.model.v26.datatype.NM(getMessage());
         case 4: return new ca.uhn.hl7v2.model.v26.datatype.NM(getMessage());
         case 5: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 6: return new ca.uhn.hl7v2.model.v26.datatype.DTM(getMessage());
         case 7: return new ca.uhn.hl7v2.model.v26.datatype.PL(getMessage());
         case 8: return new ca.uhn.hl7v2.model.v26.datatype.XAD(getMessage());
         case 9: return new ca.uhn.hl7v2.model.v26.datatype.DTM(getMessage());
         case 10: return new ca.uhn.hl7v2.model.v26.datatype.PL(getMessage());
         case 11: return new ca.uhn.hl7v2.model.v26.datatype.XAD(getMessage());
         case 12: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 13: return new ca.uhn.hl7v2.model.v26.datatype.ID(getMessage(), new Integer(136));
         default: return null;
      }
   }

}