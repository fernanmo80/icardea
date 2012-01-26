package ca.uhn.hl7v2.model.v26.segment;

import ca.uhn.hl7v2.model.*;
import ca.uhn.hl7v2.model.v26.datatype.*;
import ca.uhn.log.HapiLogFactory;
import ca.uhn.hl7v2.parser.ModelClassFactory;
import ca.uhn.hl7v2.HL7Exception;

/**
 * <p>Represents an HL7 RXD message segment. 
 * This segment has the following fields:</p><p>
 * RXD-1: Dispense Sub-ID Counter (NM)<br> 
 * RXD-2: Dispense/Give Code (CWE)<br> 
 * RXD-3: Date/Time Dispensed (DTM)<br> 
 * RXD-4: Actual Dispense Amount (NM)<br> 
 * RXD-5: Actual Dispense Units (CWE)<br> 
 * RXD-6: Actual Dosage Form (CWE)<br> 
 * RXD-7: Prescription Number (ST)<br> 
 * RXD-8: Number of Refills Remaining (NM)<br> 
 * RXD-9: Dispense Notes (ST)<br> 
 * RXD-10: Dispensing Provider (XCN)<br> 
 * RXD-11: Substitution Status (ID)<br> 
 * RXD-12: Total Daily Dose (CQ)<br> 
 * RXD-13: Dispense-to Location (LA2)<br> 
 * RXD-14: Needs Human Review (ID)<br> 
 * RXD-15: Pharmacy/Treatment Supplier's Special Dispensing Instructions (CWE)<br> 
 * RXD-16: Actual Strength (NM)<br> 
 * RXD-17: Actual Strength Unit (CWE)<br> 
 * RXD-18: Substance Lot Number (ST)<br> 
 * RXD-19: Substance Expiration Date (DTM)<br> 
 * RXD-20: Substance Manufacturer Name (CWE)<br> 
 * RXD-21: Indication (CWE)<br> 
 * RXD-22: Dispense Package Size (NM)<br> 
 * RXD-23: Dispense Package Size Unit (CWE)<br> 
 * RXD-24: Dispense Package Method (ID)<br> 
 * RXD-25: Supplementary Code (CWE)<br> 
 * RXD-26: Initiating Location (CWE)<br> 
 * RXD-27: Packaging/Assembly Location (CWE)<br> 
 * RXD-28: Actual Drug Strength Volume (NM)<br> 
 * RXD-29: Actual Drug Strength Volume Units (CWE)<br> 
 * RXD-30: Dispense to Pharmacy (CWE)<br> 
 * RXD-31: Dispense to Pharmacy Address (XAD)<br> 
 * RXD-32: Pharmacy Order Type (ID)<br> 
 * RXD-33: Dispense Type (CWE)<br> 
 * </p><p>The get...() methods return data from individual fields.  These methods 
 * do not throw exceptions and may therefore have to handle exceptions internally.  
 * If an exception is handled internally, it is logged and null is returned.  
 * This is not expected to happen - if it does happen this indicates not so much 
 * an exceptional circumstance as a bug in the code for this class.</p>    
 */
public class RXD extends AbstractSegment  {

  /**
   * Creates a RXD (Pharmacy/Treatment Dispense) segment object that belongs to the given 
   * message.  
   */
  public RXD(Group parent, ModelClassFactory factory) {
    super(parent, factory);
    Message message = getMessage();
    try {
       this.add(NM.class, true, 1, 4, new Object[]{message}, "Dispense Sub-ID Counter");
       this.add(CWE.class, true, 1, 250, new Object[]{message}, "Dispense/Give Code");
       this.add(DTM.class, true, 1, 24, new Object[]{message}, "Date/Time Dispensed");
       this.add(NM.class, true, 1, 20, new Object[]{message}, "Actual Dispense Amount");
       this.add(CWE.class, false, 1, 250, new Object[]{message}, "Actual Dispense Units");
       this.add(CWE.class, false, 1, 250, new Object[]{message}, "Actual Dosage Form");
       this.add(ST.class, true, 1, 20, new Object[]{message}, "Prescription Number");
       this.add(NM.class, false, 1, 20, new Object[]{message}, "Number of Refills Remaining");
       this.add(ST.class, false, 0, 200, new Object[]{message}, "Dispense Notes");
       this.add(XCN.class, false, 0, 200, new Object[]{message}, "Dispensing Provider");
       this.add(ID.class, false, 1, 1, new Object[]{message, new Integer(167)}, "Substitution Status");
       this.add(CQ.class, false, 1, 10, new Object[]{message}, "Total Daily Dose");
       this.add(LA2.class, false, 1, 0, new Object[]{message}, "Dispense-to Location");
       this.add(ID.class, false, 1, 1, new Object[]{message, new Integer(136)}, "Needs Human Review");
       this.add(CWE.class, false, 0, 250, new Object[]{message}, "Pharmacy/Treatment Supplier's Special Dispensing Instructions");
       this.add(NM.class, false, 1, 20, new Object[]{message}, "Actual Strength");
       this.add(CWE.class, false, 1, 250, new Object[]{message}, "Actual Strength Unit");
       this.add(ST.class, false, 0, 20, new Object[]{message}, "Substance Lot Number");
       this.add(DTM.class, false, 0, 24, new Object[]{message}, "Substance Expiration Date");
       this.add(CWE.class, false, 0, 250, new Object[]{message}, "Substance Manufacturer Name");
       this.add(CWE.class, false, 0, 250, new Object[]{message}, "Indication");
       this.add(NM.class, false, 1, 20, new Object[]{message}, "Dispense Package Size");
       this.add(CWE.class, false, 1, 250, new Object[]{message}, "Dispense Package Size Unit");
       this.add(ID.class, false, 1, 2, new Object[]{message, new Integer(321)}, "Dispense Package Method");
       this.add(CWE.class, false, 0, 250, new Object[]{message}, "Supplementary Code");
       this.add(CWE.class, false, 1, 250, new Object[]{message}, "Initiating Location");
       this.add(CWE.class, false, 1, 250, new Object[]{message}, "Packaging/Assembly Location");
       this.add(NM.class, false, 1, 5, new Object[]{message}, "Actual Drug Strength Volume");
       this.add(CWE.class, false, 1, 250, new Object[]{message}, "Actual Drug Strength Volume Units");
       this.add(CWE.class, false, 1, 180, new Object[]{message}, "Dispense to Pharmacy");
       this.add(XAD.class, false, 1, 106, new Object[]{message}, "Dispense to Pharmacy Address");
       this.add(ID.class, false, 1, 1, new Object[]{message, new Integer(480)}, "Pharmacy Order Type");
       this.add(CWE.class, false, 1, 250, new Object[]{message}, "Dispense Type");
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Can't instantiate " + this.getClass().getName(), he);
    }
  }

  /**
   * Returns Dispense Sub-ID Counter (RXD-1).
   */
  public NM getDispenseSubIDCounter()  {
    NM ret = null;
    try {
        Type t = this.getField(1, 0);
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
   * Returns Dispense Sub-ID Counter (RXD-1).
   */
  public NM getRxd1_DispenseSubIDCounter()  {
    NM ret = null;
    try {
        Type t = this.getField(1, 0);
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
   * Returns Dispense/Give Code (RXD-2).
   */
  public CWE getDispenseGiveCode()  {
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
   * Returns Dispense/Give Code (RXD-2).
   */
  public CWE getRxd2_DispenseGiveCode()  {
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
   * Returns Date/Time Dispensed (RXD-3).
   */
  public DTM getDateTimeDispensed()  {
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
   * Returns Date/Time Dispensed (RXD-3).
   */
  public DTM getRxd3_DateTimeDispensed()  {
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
   * Returns Actual Dispense Amount (RXD-4).
   */
  public NM getActualDispenseAmount()  {
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
   * Returns Actual Dispense Amount (RXD-4).
   */
  public NM getRxd4_ActualDispenseAmount()  {
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
   * Returns Actual Dispense Units (RXD-5).
   */
  public CWE getActualDispenseUnits()  {
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
   * Returns Actual Dispense Units (RXD-5).
   */
  public CWE getRxd5_ActualDispenseUnits()  {
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
   * Returns Actual Dosage Form (RXD-6).
   */
  public CWE getActualDosageForm()  {
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
   * Returns Actual Dosage Form (RXD-6).
   */
  public CWE getRxd6_ActualDosageForm()  {
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
   * Returns Prescription Number (RXD-7).
   */
  public ST getPrescriptionNumber()  {
    ST ret = null;
    try {
        Type t = this.getField(7, 0);
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
   * Returns Prescription Number (RXD-7).
   */
  public ST getRxd7_PrescriptionNumber()  {
    ST ret = null;
    try {
        Type t = this.getField(7, 0);
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
   * Returns Number of Refills Remaining (RXD-8).
   */
  public NM getNumberOfRefillsRemaining()  {
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
   * Returns Number of Refills Remaining (RXD-8).
   */
  public NM getRxd8_NumberOfRefillsRemaining()  {
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
   * Returns a single repetition of Dispense Notes (RXD-9).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public ST getDispenseNotes(int rep) throws HL7Exception {
    ST ret = null;
    try {
        Type t = this.getField(9, rep);
        ret = (ST)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Dispense Notes (RXD-9).
   */
  public ST[] getDispenseNotes() {
     ST[] ret = null;
    try {
        Type[] t = this.getField(9);  
        ret = new ST[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (ST)t[i];
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
   * Returns a count of the number of repetitions of Dispense Notes (RXD-9).
   */
  public int getDispenseNotesReps() {
    try {
        return this.getField(9).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Dispense Notes (RXD-9) at a given index and returns it.
   * @param index The index
   */
  public ST insertDispenseNotes(int index) throws HL7Exception {
     return (ST) super.insertRepetition(9, index);
  }

  /**
   * Removes a repetition of Dispense Notes (RXD-9) at a given index and returns it.
   * @param index The index
   */
  public ST removeDispenseNotes(int index) throws HL7Exception {
     return (ST) super.removeRepetition(9, index);
  }

  /**
   * Returns a single repetition of Dispense Notes (RXD-9).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public ST getRxd9_DispenseNotes(int rep) throws HL7Exception {
    ST ret = null;
    try {
        Type t = this.getField(9, rep);
        ret = (ST)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Dispense Notes (RXD-9).
   */
  public ST[] getRxd9_DispenseNotes() {
     ST[] ret = null;
    try {
        Type[] t = this.getField(9);  
        ret = new ST[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (ST)t[i];
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
   * Returns a count of the number of repetitions of Dispense Notes (RXD-9).
   */
  public int getRxd9_DispenseNotesReps() {
    try {
        return this.getField(9).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Dispense Notes (RXD-9) at a given index and returns it.
   * @param index The index
   */
  public ST insertRxd9_DispenseNotes(int index) throws HL7Exception {
     return (ST) super.insertRepetition(9, index);
  }

  /**
   * Removes a repetition of Dispense Notes (RXD-9) at a given index and returns it.
   * @param index The index
   */
  public ST removeRxd9_DispenseNotes(int index) throws HL7Exception {
     return (ST) super.removeRepetition(9, index);
  }

  /**
   * Returns a single repetition of Dispensing Provider (RXD-10).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XCN getDispensingProvider(int rep) throws HL7Exception {
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
   * Returns all repetitions of Dispensing Provider (RXD-10).
   */
  public XCN[] getDispensingProvider() {
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
   * Returns a count of the number of repetitions of Dispensing Provider (RXD-10).
   */
  public int getDispensingProviderReps() {
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
   * Inserts a repetition of Dispensing Provider (RXD-10) at a given index and returns it.
   * @param index The index
   */
  public XCN insertDispensingProvider(int index) throws HL7Exception {
     return (XCN) super.insertRepetition(10, index);
  }

  /**
   * Removes a repetition of Dispensing Provider (RXD-10) at a given index and returns it.
   * @param index The index
   */
  public XCN removeDispensingProvider(int index) throws HL7Exception {
     return (XCN) super.removeRepetition(10, index);
  }

  /**
   * Returns a single repetition of Dispensing Provider (RXD-10).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XCN getRxd10_DispensingProvider(int rep) throws HL7Exception {
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
   * Returns all repetitions of Dispensing Provider (RXD-10).
   */
  public XCN[] getRxd10_DispensingProvider() {
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
   * Returns a count of the number of repetitions of Dispensing Provider (RXD-10).
   */
  public int getRxd10_DispensingProviderReps() {
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
   * Inserts a repetition of Dispensing Provider (RXD-10) at a given index and returns it.
   * @param index The index
   */
  public XCN insertRxd10_DispensingProvider(int index) throws HL7Exception {
     return (XCN) super.insertRepetition(10, index);
  }

  /**
   * Removes a repetition of Dispensing Provider (RXD-10) at a given index and returns it.
   * @param index The index
   */
  public XCN removeRxd10_DispensingProvider(int index) throws HL7Exception {
     return (XCN) super.removeRepetition(10, index);
  }

  /**
   * Returns Substitution Status (RXD-11).
   */
  public ID getSubstitutionStatus()  {
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
   * Returns Substitution Status (RXD-11).
   */
  public ID getRxd11_SubstitutionStatus()  {
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
   * Returns Total Daily Dose (RXD-12).
   */
  public CQ getTotalDailyDose()  {
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
   * Returns Total Daily Dose (RXD-12).
   */
  public CQ getRxd12_TotalDailyDose()  {
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
   * Returns Dispense-to Location (RXD-13).
   */
  public LA2 getDispenseToLocation()  {
    LA2 ret = null;
    try {
        Type t = this.getField(13, 0);
        ret = (LA2)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns Dispense-to Location (RXD-13).
   */
  public LA2 getRxd13_DispenseToLocation()  {
    LA2 ret = null;
    try {
        Type t = this.getField(13, 0);
        ret = (LA2)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns Needs Human Review (RXD-14).
   */
  public ID getNeedsHumanReview()  {
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
   * Returns Needs Human Review (RXD-14).
   */
  public ID getRxd14_NeedsHumanReview()  {
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
   * Returns a single repetition of Pharmacy/Treatment Supplier's Special Dispensing Instructions (RXD-15).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getPharmacyTreatmentSupplierSSpecialDispensingInstructions(int rep) throws HL7Exception {
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
   * Returns all repetitions of Pharmacy/Treatment Supplier's Special Dispensing Instructions (RXD-15).
   */
  public CWE[] getPharmacyTreatmentSupplierSSpecialDispensingInstructions() {
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
   * Returns a count of the number of repetitions of Pharmacy/Treatment Supplier's Special Dispensing Instructions (RXD-15).
   */
  public int getPharmacyTreatmentSupplierSSpecialDispensingInstructionsReps() {
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
   * Inserts a repetition of Pharmacy/Treatment Supplier's Special Dispensing Instructions (RXD-15) at a given index and returns it.
   * @param index The index
   */
  public CWE insertPharmacyTreatmentSupplierSSpecialDispensingInstructions(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(15, index);
  }

  /**
   * Removes a repetition of Pharmacy/Treatment Supplier's Special Dispensing Instructions (RXD-15) at a given index and returns it.
   * @param index The index
   */
  public CWE removePharmacyTreatmentSupplierSSpecialDispensingInstructions(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(15, index);
  }

  /**
   * Returns a single repetition of Pharmacy/Treatment Supplier's Special Dispensing Instructions (RXD-15).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getRxd15_PharmacyTreatmentSupplierSSpecialDispensingInstructions(int rep) throws HL7Exception {
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
   * Returns all repetitions of Pharmacy/Treatment Supplier's Special Dispensing Instructions (RXD-15).
   */
  public CWE[] getRxd15_PharmacyTreatmentSupplierSSpecialDispensingInstructions() {
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
   * Returns a count of the number of repetitions of Pharmacy/Treatment Supplier's Special Dispensing Instructions (RXD-15).
   */
  public int getRxd15_PharmacyTreatmentSupplierSSpecialDispensingInstructionsReps() {
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
   * Inserts a repetition of Pharmacy/Treatment Supplier's Special Dispensing Instructions (RXD-15) at a given index and returns it.
   * @param index The index
   */
  public CWE insertRxd15_PharmacyTreatmentSupplierSSpecialDispensingInstructions(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(15, index);
  }

  /**
   * Removes a repetition of Pharmacy/Treatment Supplier's Special Dispensing Instructions (RXD-15) at a given index and returns it.
   * @param index The index
   */
  public CWE removeRxd15_PharmacyTreatmentSupplierSSpecialDispensingInstructions(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(15, index);
  }

  /**
   * Returns Actual Strength (RXD-16).
   */
  public NM getActualStrength()  {
    NM ret = null;
    try {
        Type t = this.getField(16, 0);
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
   * Returns Actual Strength (RXD-16).
   */
  public NM getRxd16_ActualStrength()  {
    NM ret = null;
    try {
        Type t = this.getField(16, 0);
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
   * Returns Actual Strength Unit (RXD-17).
   */
  public CWE getActualStrengthUnit()  {
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
   * Returns Actual Strength Unit (RXD-17).
   */
  public CWE getRxd17_ActualStrengthUnit()  {
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
   * Returns a single repetition of Substance Lot Number (RXD-18).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public ST getSubstanceLotNumber(int rep) throws HL7Exception {
    ST ret = null;
    try {
        Type t = this.getField(18, rep);
        ret = (ST)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Substance Lot Number (RXD-18).
   */
  public ST[] getSubstanceLotNumber() {
     ST[] ret = null;
    try {
        Type[] t = this.getField(18);  
        ret = new ST[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (ST)t[i];
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
   * Returns a count of the number of repetitions of Substance Lot Number (RXD-18).
   */
  public int getSubstanceLotNumberReps() {
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
   * Inserts a repetition of Substance Lot Number (RXD-18) at a given index and returns it.
   * @param index The index
   */
  public ST insertSubstanceLotNumber(int index) throws HL7Exception {
     return (ST) super.insertRepetition(18, index);
  }

  /**
   * Removes a repetition of Substance Lot Number (RXD-18) at a given index and returns it.
   * @param index The index
   */
  public ST removeSubstanceLotNumber(int index) throws HL7Exception {
     return (ST) super.removeRepetition(18, index);
  }

  /**
   * Returns a single repetition of Substance Lot Number (RXD-18).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public ST getRxd18_SubstanceLotNumber(int rep) throws HL7Exception {
    ST ret = null;
    try {
        Type t = this.getField(18, rep);
        ret = (ST)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Substance Lot Number (RXD-18).
   */
  public ST[] getRxd18_SubstanceLotNumber() {
     ST[] ret = null;
    try {
        Type[] t = this.getField(18);  
        ret = new ST[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (ST)t[i];
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
   * Returns a count of the number of repetitions of Substance Lot Number (RXD-18).
   */
  public int getRxd18_SubstanceLotNumberReps() {
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
   * Inserts a repetition of Substance Lot Number (RXD-18) at a given index and returns it.
   * @param index The index
   */
  public ST insertRxd18_SubstanceLotNumber(int index) throws HL7Exception {
     return (ST) super.insertRepetition(18, index);
  }

  /**
   * Removes a repetition of Substance Lot Number (RXD-18) at a given index and returns it.
   * @param index The index
   */
  public ST removeRxd18_SubstanceLotNumber(int index) throws HL7Exception {
     return (ST) super.removeRepetition(18, index);
  }

  /**
   * Returns a single repetition of Substance Expiration Date (RXD-19).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public DTM getSubstanceExpirationDate(int rep) throws HL7Exception {
    DTM ret = null;
    try {
        Type t = this.getField(19, rep);
        ret = (DTM)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Substance Expiration Date (RXD-19).
   */
  public DTM[] getSubstanceExpirationDate() {
     DTM[] ret = null;
    try {
        Type[] t = this.getField(19);  
        ret = new DTM[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (DTM)t[i];
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
   * Returns a count of the number of repetitions of Substance Expiration Date (RXD-19).
   */
  public int getSubstanceExpirationDateReps() {
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
   * Inserts a repetition of Substance Expiration Date (RXD-19) at a given index and returns it.
   * @param index The index
   */
  public DTM insertSubstanceExpirationDate(int index) throws HL7Exception {
     return (DTM) super.insertRepetition(19, index);
  }

  /**
   * Removes a repetition of Substance Expiration Date (RXD-19) at a given index and returns it.
   * @param index The index
   */
  public DTM removeSubstanceExpirationDate(int index) throws HL7Exception {
     return (DTM) super.removeRepetition(19, index);
  }

  /**
   * Returns a single repetition of Substance Expiration Date (RXD-19).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public DTM getRxd19_SubstanceExpirationDate(int rep) throws HL7Exception {
    DTM ret = null;
    try {
        Type t = this.getField(19, rep);
        ret = (DTM)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Substance Expiration Date (RXD-19).
   */
  public DTM[] getRxd19_SubstanceExpirationDate() {
     DTM[] ret = null;
    try {
        Type[] t = this.getField(19);  
        ret = new DTM[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (DTM)t[i];
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
   * Returns a count of the number of repetitions of Substance Expiration Date (RXD-19).
   */
  public int getRxd19_SubstanceExpirationDateReps() {
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
   * Inserts a repetition of Substance Expiration Date (RXD-19) at a given index and returns it.
   * @param index The index
   */
  public DTM insertRxd19_SubstanceExpirationDate(int index) throws HL7Exception {
     return (DTM) super.insertRepetition(19, index);
  }

  /**
   * Removes a repetition of Substance Expiration Date (RXD-19) at a given index and returns it.
   * @param index The index
   */
  public DTM removeRxd19_SubstanceExpirationDate(int index) throws HL7Exception {
     return (DTM) super.removeRepetition(19, index);
  }

  /**
   * Returns a single repetition of Substance Manufacturer Name (RXD-20).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getSubstanceManufacturerName(int rep) throws HL7Exception {
    CWE ret = null;
    try {
        Type t = this.getField(20, rep);
        ret = (CWE)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Substance Manufacturer Name (RXD-20).
   */
  public CWE[] getSubstanceManufacturerName() {
     CWE[] ret = null;
    try {
        Type[] t = this.getField(20);  
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
   * Returns a count of the number of repetitions of Substance Manufacturer Name (RXD-20).
   */
  public int getSubstanceManufacturerNameReps() {
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
   * Inserts a repetition of Substance Manufacturer Name (RXD-20) at a given index and returns it.
   * @param index The index
   */
  public CWE insertSubstanceManufacturerName(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(20, index);
  }

  /**
   * Removes a repetition of Substance Manufacturer Name (RXD-20) at a given index and returns it.
   * @param index The index
   */
  public CWE removeSubstanceManufacturerName(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(20, index);
  }

  /**
   * Returns a single repetition of Substance Manufacturer Name (RXD-20).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getRxd20_SubstanceManufacturerName(int rep) throws HL7Exception {
    CWE ret = null;
    try {
        Type t = this.getField(20, rep);
        ret = (CWE)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Substance Manufacturer Name (RXD-20).
   */
  public CWE[] getRxd20_SubstanceManufacturerName() {
     CWE[] ret = null;
    try {
        Type[] t = this.getField(20);  
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
   * Returns a count of the number of repetitions of Substance Manufacturer Name (RXD-20).
   */
  public int getRxd20_SubstanceManufacturerNameReps() {
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
   * Inserts a repetition of Substance Manufacturer Name (RXD-20) at a given index and returns it.
   * @param index The index
   */
  public CWE insertRxd20_SubstanceManufacturerName(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(20, index);
  }

  /**
   * Removes a repetition of Substance Manufacturer Name (RXD-20) at a given index and returns it.
   * @param index The index
   */
  public CWE removeRxd20_SubstanceManufacturerName(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(20, index);
  }

  /**
   * Returns a single repetition of Indication (RXD-21).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getIndication(int rep) throws HL7Exception {
    CWE ret = null;
    try {
        Type t = this.getField(21, rep);
        ret = (CWE)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Indication (RXD-21).
   */
  public CWE[] getIndication() {
     CWE[] ret = null;
    try {
        Type[] t = this.getField(21);  
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
   * Returns a count of the number of repetitions of Indication (RXD-21).
   */
  public int getIndicationReps() {
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
   * Inserts a repetition of Indication (RXD-21) at a given index and returns it.
   * @param index The index
   */
  public CWE insertIndication(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(21, index);
  }

  /**
   * Removes a repetition of Indication (RXD-21) at a given index and returns it.
   * @param index The index
   */
  public CWE removeIndication(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(21, index);
  }

  /**
   * Returns a single repetition of Indication (RXD-21).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getRxd21_Indication(int rep) throws HL7Exception {
    CWE ret = null;
    try {
        Type t = this.getField(21, rep);
        ret = (CWE)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Indication (RXD-21).
   */
  public CWE[] getRxd21_Indication() {
     CWE[] ret = null;
    try {
        Type[] t = this.getField(21);  
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
   * Returns a count of the number of repetitions of Indication (RXD-21).
   */
  public int getRxd21_IndicationReps() {
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
   * Inserts a repetition of Indication (RXD-21) at a given index and returns it.
   * @param index The index
   */
  public CWE insertRxd21_Indication(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(21, index);
  }

  /**
   * Removes a repetition of Indication (RXD-21) at a given index and returns it.
   * @param index The index
   */
  public CWE removeRxd21_Indication(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(21, index);
  }

  /**
   * Returns Dispense Package Size (RXD-22).
   */
  public NM getDispensePackageSize()  {
    NM ret = null;
    try {
        Type t = this.getField(22, 0);
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
   * Returns Dispense Package Size (RXD-22).
   */
  public NM getRxd22_DispensePackageSize()  {
    NM ret = null;
    try {
        Type t = this.getField(22, 0);
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
   * Returns Dispense Package Size Unit (RXD-23).
   */
  public CWE getDispensePackageSizeUnit()  {
    CWE ret = null;
    try {
        Type t = this.getField(23, 0);
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
   * Returns Dispense Package Size Unit (RXD-23).
   */
  public CWE getRxd23_DispensePackageSizeUnit()  {
    CWE ret = null;
    try {
        Type t = this.getField(23, 0);
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
   * Returns Dispense Package Method (RXD-24).
   */
  public ID getDispensePackageMethod()  {
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
   * Returns Dispense Package Method (RXD-24).
   */
  public ID getRxd24_DispensePackageMethod()  {
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
   * Returns a single repetition of Supplementary Code (RXD-25).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getSupplementaryCode(int rep) throws HL7Exception {
    CWE ret = null;
    try {
        Type t = this.getField(25, rep);
        ret = (CWE)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Supplementary Code (RXD-25).
   */
  public CWE[] getSupplementaryCode() {
     CWE[] ret = null;
    try {
        Type[] t = this.getField(25);  
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
   * Returns a count of the number of repetitions of Supplementary Code (RXD-25).
   */
  public int getSupplementaryCodeReps() {
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
   * Inserts a repetition of Supplementary Code (RXD-25) at a given index and returns it.
   * @param index The index
   */
  public CWE insertSupplementaryCode(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(25, index);
  }

  /**
   * Removes a repetition of Supplementary Code (RXD-25) at a given index and returns it.
   * @param index The index
   */
  public CWE removeSupplementaryCode(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(25, index);
  }

  /**
   * Returns a single repetition of Supplementary Code (RXD-25).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getRxd25_SupplementaryCode(int rep) throws HL7Exception {
    CWE ret = null;
    try {
        Type t = this.getField(25, rep);
        ret = (CWE)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Supplementary Code (RXD-25).
   */
  public CWE[] getRxd25_SupplementaryCode() {
     CWE[] ret = null;
    try {
        Type[] t = this.getField(25);  
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
   * Returns a count of the number of repetitions of Supplementary Code (RXD-25).
   */
  public int getRxd25_SupplementaryCodeReps() {
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
   * Inserts a repetition of Supplementary Code (RXD-25) at a given index and returns it.
   * @param index The index
   */
  public CWE insertRxd25_SupplementaryCode(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(25, index);
  }

  /**
   * Removes a repetition of Supplementary Code (RXD-25) at a given index and returns it.
   * @param index The index
   */
  public CWE removeRxd25_SupplementaryCode(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(25, index);
  }

  /**
   * Returns Initiating Location (RXD-26).
   */
  public CWE getInitiatingLocation()  {
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
   * Returns Initiating Location (RXD-26).
   */
  public CWE getRxd26_InitiatingLocation()  {
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
   * Returns Packaging/Assembly Location (RXD-27).
   */
  public CWE getPackagingAssemblyLocation()  {
    CWE ret = null;
    try {
        Type t = this.getField(27, 0);
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
   * Returns Packaging/Assembly Location (RXD-27).
   */
  public CWE getRxd27_PackagingAssemblyLocation()  {
    CWE ret = null;
    try {
        Type t = this.getField(27, 0);
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
   * Returns Actual Drug Strength Volume (RXD-28).
   */
  public NM getActualDrugStrengthVolume()  {
    NM ret = null;
    try {
        Type t = this.getField(28, 0);
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
   * Returns Actual Drug Strength Volume (RXD-28).
   */
  public NM getRxd28_ActualDrugStrengthVolume()  {
    NM ret = null;
    try {
        Type t = this.getField(28, 0);
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
   * Returns Actual Drug Strength Volume Units (RXD-29).
   */
  public CWE getActualDrugStrengthVolumeUnits()  {
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
   * Returns Actual Drug Strength Volume Units (RXD-29).
   */
  public CWE getRxd29_ActualDrugStrengthVolumeUnits()  {
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
   * Returns Dispense to Pharmacy (RXD-30).
   */
  public CWE getDispenseToPharmacy()  {
    CWE ret = null;
    try {
        Type t = this.getField(30, 0);
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
   * Returns Dispense to Pharmacy (RXD-30).
   */
  public CWE getRxd30_DispenseToPharmacy()  {
    CWE ret = null;
    try {
        Type t = this.getField(30, 0);
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
   * Returns Dispense to Pharmacy Address (RXD-31).
   */
  public XAD getDispenseToPharmacyAddress()  {
    XAD ret = null;
    try {
        Type t = this.getField(31, 0);
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
   * Returns Dispense to Pharmacy Address (RXD-31).
   */
  public XAD getRxd31_DispenseToPharmacyAddress()  {
    XAD ret = null;
    try {
        Type t = this.getField(31, 0);
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
   * Returns Pharmacy Order Type (RXD-32).
   */
  public ID getPharmacyOrderType()  {
    ID ret = null;
    try {
        Type t = this.getField(32, 0);
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
   * Returns Pharmacy Order Type (RXD-32).
   */
  public ID getRxd32_PharmacyOrderType()  {
    ID ret = null;
    try {
        Type t = this.getField(32, 0);
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
   * Returns Dispense Type (RXD-33).
   */
  public CWE getDispenseType()  {
    CWE ret = null;
    try {
        Type t = this.getField(33, 0);
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
   * Returns Dispense Type (RXD-33).
   */
  public CWE getRxd33_DispenseType()  {
    CWE ret = null;
    try {
        Type t = this.getField(33, 0);
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
         case 0: return new ca.uhn.hl7v2.model.v26.datatype.NM(getMessage());
         case 1: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 2: return new ca.uhn.hl7v2.model.v26.datatype.DTM(getMessage());
         case 3: return new ca.uhn.hl7v2.model.v26.datatype.NM(getMessage());
         case 4: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 5: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 6: return new ca.uhn.hl7v2.model.v26.datatype.ST(getMessage());
         case 7: return new ca.uhn.hl7v2.model.v26.datatype.NM(getMessage());
         case 8: return new ca.uhn.hl7v2.model.v26.datatype.ST(getMessage());
         case 9: return new ca.uhn.hl7v2.model.v26.datatype.XCN(getMessage());
         case 10: return new ca.uhn.hl7v2.model.v26.datatype.ID(getMessage(), new Integer(167));
         case 11: return new ca.uhn.hl7v2.model.v26.datatype.CQ(getMessage());
         case 12: return new ca.uhn.hl7v2.model.v26.datatype.LA2(getMessage());
         case 13: return new ca.uhn.hl7v2.model.v26.datatype.ID(getMessage(), new Integer(136));
         case 14: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 15: return new ca.uhn.hl7v2.model.v26.datatype.NM(getMessage());
         case 16: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 17: return new ca.uhn.hl7v2.model.v26.datatype.ST(getMessage());
         case 18: return new ca.uhn.hl7v2.model.v26.datatype.DTM(getMessage());
         case 19: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 20: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 21: return new ca.uhn.hl7v2.model.v26.datatype.NM(getMessage());
         case 22: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 23: return new ca.uhn.hl7v2.model.v26.datatype.ID(getMessage(), new Integer(321));
         case 24: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 25: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 26: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 27: return new ca.uhn.hl7v2.model.v26.datatype.NM(getMessage());
         case 28: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 29: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 30: return new ca.uhn.hl7v2.model.v26.datatype.XAD(getMessage());
         case 31: return new ca.uhn.hl7v2.model.v26.datatype.ID(getMessage(), new Integer(480));
         case 32: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         default: return null;
      }
   }

}