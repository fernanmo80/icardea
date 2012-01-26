package ca.uhn.hl7v2.model.v26.segment;

import ca.uhn.hl7v2.model.*;
import ca.uhn.hl7v2.model.v26.datatype.*;
import ca.uhn.log.HapiLogFactory;
import ca.uhn.hl7v2.parser.ModelClassFactory;
import ca.uhn.hl7v2.HL7Exception;

/**
 * <p>Represents an HL7 BPX message segment. 
 * This segment has the following fields:</p><p>
 * BPX-1: Set ID - BPX (SI)<br> 
 * BPX-2: BP Dispense Status (CWE)<br> 
 * BPX-3: BP Status (ID)<br> 
 * BPX-4: BP Date/Time of Status (DTM)<br> 
 * BPX-5: BC Donation ID (EI)<br> 
 * BPX-6: BC Component (CNE)<br> 
 * BPX-7: BC Donation Type / Intended Use (CNE)<br> 
 * BPX-8: CP Commercial Product (CWE)<br> 
 * BPX-9: CP Manufacturer (XON)<br> 
 * BPX-10: CP Lot Number (EI)<br> 
 * BPX-11: BP Blood Group (CNE)<br> 
 * BPX-12: BC Special Testing (CNE)<br> 
 * BPX-13: BP Expiration Date/Time (DTM)<br> 
 * BPX-14: BP Quantity (NM)<br> 
 * BPX-15: BP Amount (NM)<br> 
 * BPX-16: BP Units (CWE)<br> 
 * BPX-17: BP Unique ID (EI)<br> 
 * BPX-18: BP Actual Dispensed To Location (PL)<br> 
 * BPX-19: BP Actual Dispensed To Address (XAD)<br> 
 * BPX-20: BP Dispensed to Receiver (XCN)<br> 
 * BPX-21: BP Dispensing Individual (XCN)<br> 
 * </p><p>The get...() methods return data from individual fields.  These methods 
 * do not throw exceptions and may therefore have to handle exceptions internally.  
 * If an exception is handled internally, it is logged and null is returned.  
 * This is not expected to happen - if it does happen this indicates not so much 
 * an exceptional circumstance as a bug in the code for this class.</p>    
 */
public class BPX extends AbstractSegment  {

  /**
   * Creates a BPX (Blood product dispense status) segment object that belongs to the given 
   * message.  
   */
  public BPX(Group parent, ModelClassFactory factory) {
    super(parent, factory);
    Message message = getMessage();
    try {
       this.add(SI.class, true, 1, 4, new Object[]{message}, "Set ID - BPX");
       this.add(CWE.class, true, 1, 250, new Object[]{message}, "BP Dispense Status");
       this.add(ID.class, true, 1, 1, new Object[]{message, new Integer(511)}, "BP Status");
       this.add(DTM.class, true, 1, 24, new Object[]{message}, "BP Date/Time of Status");
       this.add(EI.class, false, 1, 22, new Object[]{message}, "BC Donation ID");
       this.add(CNE.class, false, 1, 250, new Object[]{message}, "BC Component");
       this.add(CNE.class, false, 1, 250, new Object[]{message}, "BC Donation Type / Intended Use");
       this.add(CWE.class, false, 1, 250, new Object[]{message}, "CP Commercial Product");
       this.add(XON.class, false, 1, 250, new Object[]{message}, "CP Manufacturer");
       this.add(EI.class, false, 1, 22, new Object[]{message}, "CP Lot Number");
       this.add(CNE.class, false, 1, 250, new Object[]{message}, "BP Blood Group");
       this.add(CNE.class, false, 0, 250, new Object[]{message}, "BC Special Testing");
       this.add(DTM.class, false, 1, 24, new Object[]{message}, "BP Expiration Date/Time");
       this.add(NM.class, true, 1, 5, new Object[]{message}, "BP Quantity");
       this.add(NM.class, false, 1, 5, new Object[]{message}, "BP Amount");
       this.add(CWE.class, false, 1, 250, new Object[]{message}, "BP Units");
       this.add(EI.class, false, 1, 22, new Object[]{message}, "BP Unique ID");
       this.add(PL.class, false, 1, 80, new Object[]{message}, "BP Actual Dispensed To Location");
       this.add(XAD.class, false, 1, 250, new Object[]{message}, "BP Actual Dispensed To Address");
       this.add(XCN.class, false, 1, 250, new Object[]{message}, "BP Dispensed to Receiver");
       this.add(XCN.class, false, 1, 250, new Object[]{message}, "BP Dispensing Individual");
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Can't instantiate " + this.getClass().getName(), he);
    }
  }

  /**
   * Returns Set ID - BPX (BPX-1).
   */
  public SI getSetIDBPX()  {
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
   * Returns Set ID - BPX (BPX-1).
   */
  public SI getBpx1_SetIDBPX()  {
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
   * Returns BP Dispense Status (BPX-2).
   */
  public CWE getBPDispenseStatus()  {
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
   * Returns BP Dispense Status (BPX-2).
   */
  public CWE getBpx2_BPDispenseStatus()  {
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
   * Returns BP Status (BPX-3).
   */
  public ID getBPStatus()  {
    ID ret = null;
    try {
        Type t = this.getField(3, 0);
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
   * Returns BP Status (BPX-3).
   */
  public ID getBpx3_BPStatus()  {
    ID ret = null;
    try {
        Type t = this.getField(3, 0);
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
   * Returns BP Date/Time of Status (BPX-4).
   */
  public DTM getBPDateTimeOfStatus()  {
    DTM ret = null;
    try {
        Type t = this.getField(4, 0);
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
   * Returns BP Date/Time of Status (BPX-4).
   */
  public DTM getBpx4_BPDateTimeOfStatus()  {
    DTM ret = null;
    try {
        Type t = this.getField(4, 0);
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
   * Returns BC Donation ID (BPX-5).
   */
  public EI getBCDonationID()  {
    EI ret = null;
    try {
        Type t = this.getField(5, 0);
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
   * Returns BC Donation ID (BPX-5).
   */
  public EI getBpx5_BCDonationID()  {
    EI ret = null;
    try {
        Type t = this.getField(5, 0);
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
   * Returns BC Component (BPX-6).
   */
  public CNE getBCComponent()  {
    CNE ret = null;
    try {
        Type t = this.getField(6, 0);
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
   * Returns BC Component (BPX-6).
   */
  public CNE getBpx6_BCComponent()  {
    CNE ret = null;
    try {
        Type t = this.getField(6, 0);
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
   * Returns BC Donation Type / Intended Use (BPX-7).
   */
  public CNE getBCDonationTypeIntendedUse()  {
    CNE ret = null;
    try {
        Type t = this.getField(7, 0);
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
   * Returns BC Donation Type / Intended Use (BPX-7).
   */
  public CNE getBpx7_BCDonationTypeIntendedUse()  {
    CNE ret = null;
    try {
        Type t = this.getField(7, 0);
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
   * Returns CP Commercial Product (BPX-8).
   */
  public CWE getCPCommercialProduct()  {
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
   * Returns CP Commercial Product (BPX-8).
   */
  public CWE getBpx8_CPCommercialProduct()  {
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
   * Returns CP Manufacturer (BPX-9).
   */
  public XON getCPManufacturer()  {
    XON ret = null;
    try {
        Type t = this.getField(9, 0);
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
   * Returns CP Manufacturer (BPX-9).
   */
  public XON getBpx9_CPManufacturer()  {
    XON ret = null;
    try {
        Type t = this.getField(9, 0);
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
   * Returns CP Lot Number (BPX-10).
   */
  public EI getCPLotNumber()  {
    EI ret = null;
    try {
        Type t = this.getField(10, 0);
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
   * Returns CP Lot Number (BPX-10).
   */
  public EI getBpx10_CPLotNumber()  {
    EI ret = null;
    try {
        Type t = this.getField(10, 0);
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
   * Returns BP Blood Group (BPX-11).
   */
  public CNE getBPBloodGroup()  {
    CNE ret = null;
    try {
        Type t = this.getField(11, 0);
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
   * Returns BP Blood Group (BPX-11).
   */
  public CNE getBpx11_BPBloodGroup()  {
    CNE ret = null;
    try {
        Type t = this.getField(11, 0);
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
   * Returns a single repetition of BC Special Testing (BPX-12).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CNE getBCSpecialTesting(int rep) throws HL7Exception {
    CNE ret = null;
    try {
        Type t = this.getField(12, rep);
        ret = (CNE)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of BC Special Testing (BPX-12).
   */
  public CNE[] getBCSpecialTesting() {
     CNE[] ret = null;
    try {
        Type[] t = this.getField(12);  
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
   * Returns a count of the number of repetitions of BC Special Testing (BPX-12).
   */
  public int getBCSpecialTestingReps() {
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
   * Inserts a repetition of BC Special Testing (BPX-12) at a given index and returns it.
   * @param index The index
   */
  public CNE insertBCSpecialTesting(int index) throws HL7Exception {
     return (CNE) super.insertRepetition(12, index);
  }

  /**
   * Removes a repetition of BC Special Testing (BPX-12) at a given index and returns it.
   * @param index The index
   */
  public CNE removeBCSpecialTesting(int index) throws HL7Exception {
     return (CNE) super.removeRepetition(12, index);
  }

  /**
   * Returns a single repetition of BC Special Testing (BPX-12).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CNE getBpx12_BCSpecialTesting(int rep) throws HL7Exception {
    CNE ret = null;
    try {
        Type t = this.getField(12, rep);
        ret = (CNE)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of BC Special Testing (BPX-12).
   */
  public CNE[] getBpx12_BCSpecialTesting() {
     CNE[] ret = null;
    try {
        Type[] t = this.getField(12);  
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
   * Returns a count of the number of repetitions of BC Special Testing (BPX-12).
   */
  public int getBpx12_BCSpecialTestingReps() {
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
   * Inserts a repetition of BC Special Testing (BPX-12) at a given index and returns it.
   * @param index The index
   */
  public CNE insertBpx12_BCSpecialTesting(int index) throws HL7Exception {
     return (CNE) super.insertRepetition(12, index);
  }

  /**
   * Removes a repetition of BC Special Testing (BPX-12) at a given index and returns it.
   * @param index The index
   */
  public CNE removeBpx12_BCSpecialTesting(int index) throws HL7Exception {
     return (CNE) super.removeRepetition(12, index);
  }

  /**
   * Returns BP Expiration Date/Time (BPX-13).
   */
  public DTM getBPExpirationDateTime()  {
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
   * Returns BP Expiration Date/Time (BPX-13).
   */
  public DTM getBpx13_BPExpirationDateTime()  {
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
   * Returns BP Quantity (BPX-14).
   */
  public NM getBPQuantity()  {
    NM ret = null;
    try {
        Type t = this.getField(14, 0);
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
   * Returns BP Quantity (BPX-14).
   */
  public NM getBpx14_BPQuantity()  {
    NM ret = null;
    try {
        Type t = this.getField(14, 0);
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
   * Returns BP Amount (BPX-15).
   */
  public NM getBPAmount()  {
    NM ret = null;
    try {
        Type t = this.getField(15, 0);
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
   * Returns BP Amount (BPX-15).
   */
  public NM getBpx15_BPAmount()  {
    NM ret = null;
    try {
        Type t = this.getField(15, 0);
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
   * Returns BP Units (BPX-16).
   */
  public CWE getBPUnits()  {
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
   * Returns BP Units (BPX-16).
   */
  public CWE getBpx16_BPUnits()  {
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
   * Returns BP Unique ID (BPX-17).
   */
  public EI getBPUniqueID()  {
    EI ret = null;
    try {
        Type t = this.getField(17, 0);
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
   * Returns BP Unique ID (BPX-17).
   */
  public EI getBpx17_BPUniqueID()  {
    EI ret = null;
    try {
        Type t = this.getField(17, 0);
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
   * Returns BP Actual Dispensed To Location (BPX-18).
   */
  public PL getBPActualDispensedToLocation()  {
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
   * Returns BP Actual Dispensed To Location (BPX-18).
   */
  public PL getBpx18_BPActualDispensedToLocation()  {
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
   * Returns BP Actual Dispensed To Address (BPX-19).
   */
  public XAD getBPActualDispensedToAddress()  {
    XAD ret = null;
    try {
        Type t = this.getField(19, 0);
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
   * Returns BP Actual Dispensed To Address (BPX-19).
   */
  public XAD getBpx19_BPActualDispensedToAddress()  {
    XAD ret = null;
    try {
        Type t = this.getField(19, 0);
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
   * Returns BP Dispensed to Receiver (BPX-20).
   */
  public XCN getBPDispensedToReceiver()  {
    XCN ret = null;
    try {
        Type t = this.getField(20, 0);
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
   * Returns BP Dispensed to Receiver (BPX-20).
   */
  public XCN getBpx20_BPDispensedToReceiver()  {
    XCN ret = null;
    try {
        Type t = this.getField(20, 0);
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
   * Returns BP Dispensing Individual (BPX-21).
   */
  public XCN getBPDispensingIndividual()  {
    XCN ret = null;
    try {
        Type t = this.getField(21, 0);
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
   * Returns BP Dispensing Individual (BPX-21).
   */
  public XCN getBpx21_BPDispensingIndividual()  {
    XCN ret = null;
    try {
        Type t = this.getField(21, 0);
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

   protected Type createNewTypeWithoutReflection(int field) {
      switch (field) {
         case 0: return new ca.uhn.hl7v2.model.v26.datatype.SI(getMessage());
         case 1: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 2: return new ca.uhn.hl7v2.model.v26.datatype.ID(getMessage(), new Integer(511));
         case 3: return new ca.uhn.hl7v2.model.v26.datatype.DTM(getMessage());
         case 4: return new ca.uhn.hl7v2.model.v26.datatype.EI(getMessage());
         case 5: return new ca.uhn.hl7v2.model.v26.datatype.CNE(getMessage());
         case 6: return new ca.uhn.hl7v2.model.v26.datatype.CNE(getMessage());
         case 7: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 8: return new ca.uhn.hl7v2.model.v26.datatype.XON(getMessage());
         case 9: return new ca.uhn.hl7v2.model.v26.datatype.EI(getMessage());
         case 10: return new ca.uhn.hl7v2.model.v26.datatype.CNE(getMessage());
         case 11: return new ca.uhn.hl7v2.model.v26.datatype.CNE(getMessage());
         case 12: return new ca.uhn.hl7v2.model.v26.datatype.DTM(getMessage());
         case 13: return new ca.uhn.hl7v2.model.v26.datatype.NM(getMessage());
         case 14: return new ca.uhn.hl7v2.model.v26.datatype.NM(getMessage());
         case 15: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 16: return new ca.uhn.hl7v2.model.v26.datatype.EI(getMessage());
         case 17: return new ca.uhn.hl7v2.model.v26.datatype.PL(getMessage());
         case 18: return new ca.uhn.hl7v2.model.v26.datatype.XAD(getMessage());
         case 19: return new ca.uhn.hl7v2.model.v26.datatype.XCN(getMessage());
         case 20: return new ca.uhn.hl7v2.model.v26.datatype.XCN(getMessage());
         default: return null;
      }
   }

}