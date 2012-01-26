package ca.uhn.hl7v2.model.v26.segment;

import ca.uhn.hl7v2.model.*;
import ca.uhn.hl7v2.model.v26.datatype.*;
import ca.uhn.log.HapiLogFactory;
import ca.uhn.hl7v2.parser.ModelClassFactory;
import ca.uhn.hl7v2.HL7Exception;

/**
 * <p>Represents an HL7 RXG message segment. 
 * This segment has the following fields:</p><p>
 * RXG-1: Give Sub-ID Counter (NM)<br> 
 * RXG-2: Dispense Sub-ID Counter (NM)<br> 
 * RXG-3: Quantity/Timing (TQ)<br> 
 * RXG-4: Give Code (CWE)<br> 
 * RXG-5: Give Amount - Minimum (NM)<br> 
 * RXG-6: Give Amount - Maximum (NM)<br> 
 * RXG-7: Give Units (CWE)<br> 
 * RXG-8: Give Dosage Form (CWE)<br> 
 * RXG-9: Administration Notes (CWE)<br> 
 * RXG-10: Substitution Status (ID)<br> 
 * RXG-11: Dispense-to Location (LA2)<br> 
 * RXG-12: Needs Human Review (ID)<br> 
 * RXG-13: Pharmacy/Treatment Supplier's Special Administration Instructions (CWE)<br> 
 * RXG-14: Give Per (Time Unit) (ST)<br> 
 * RXG-15: Give Rate Amount (ST)<br> 
 * RXG-16: Give Rate Units (CWE)<br> 
 * RXG-17: Give Strength (NM)<br> 
 * RXG-18: Give Strength Units (CWE)<br> 
 * RXG-19: Substance Lot Number (ST)<br> 
 * RXG-20: Substance Expiration Date (DTM)<br> 
 * RXG-21: Substance Manufacturer Name (CWE)<br> 
 * RXG-22: Indication (CWE)<br> 
 * RXG-23: Give Drug Strength Volume (NM)<br> 
 * RXG-24: Give Drug Strength Volume Units (CWE)<br> 
 * RXG-25: Give Barcode Identifier (CWE)<br> 
 * RXG-26: Pharmacy Order Type (ID)<br> 
 * RXG-27: Dispense to Pharmacy (CWE)<br> 
 * RXG-28: Dispense to Pharmacy Address (XAD)<br> 
 * RXG-29: Deliver-to Patient Location (PL)<br> 
 * RXG-30: Deliver-to Address (XAD)<br> 
 * </p><p>The get...() methods return data from individual fields.  These methods 
 * do not throw exceptions and may therefore have to handle exceptions internally.  
 * If an exception is handled internally, it is logged and null is returned.  
 * This is not expected to happen - if it does happen this indicates not so much 
 * an exceptional circumstance as a bug in the code for this class.</p>    
 */
public class RXG extends AbstractSegment  {

  /**
   * Creates a RXG (Pharmacy/Treatment Give) segment object that belongs to the given 
   * message.  
   */
  public RXG(Group parent, ModelClassFactory factory) {
    super(parent, factory);
    Message message = getMessage();
    try {
       this.add(NM.class, true, 1, 4, new Object[]{message}, "Give Sub-ID Counter");
       this.add(NM.class, false, 1, 4, new Object[]{message}, "Dispense Sub-ID Counter");
       this.add(TQ.class, false, 1, 0, new Object[]{message}, "Quantity/Timing");
       this.add(CWE.class, true, 1, 250, new Object[]{message}, "Give Code");
       this.add(NM.class, true, 1, 20, new Object[]{message}, "Give Amount - Minimum");
       this.add(NM.class, false, 1, 20, new Object[]{message}, "Give Amount - Maximum");
       this.add(CWE.class, true, 1, 250, new Object[]{message}, "Give Units");
       this.add(CWE.class, false, 1, 250, new Object[]{message}, "Give Dosage Form");
       this.add(CWE.class, false, 0, 250, new Object[]{message}, "Administration Notes");
       this.add(ID.class, false, 1, 1, new Object[]{message, new Integer(167)}, "Substitution Status");
       this.add(LA2.class, false, 1, 0, new Object[]{message}, "Dispense-to Location");
       this.add(ID.class, false, 1, 1, new Object[]{message, new Integer(136)}, "Needs Human Review");
       this.add(CWE.class, false, 0, 250, new Object[]{message}, "Pharmacy/Treatment Supplier's Special Administration Instructions");
       this.add(ST.class, false, 1, 20, new Object[]{message}, "Give Per (Time Unit)");
       this.add(ST.class, false, 1, 6, new Object[]{message}, "Give Rate Amount");
       this.add(CWE.class, false, 1, 250, new Object[]{message}, "Give Rate Units");
       this.add(NM.class, false, 1, 20, new Object[]{message}, "Give Strength");
       this.add(CWE.class, false, 1, 250, new Object[]{message}, "Give Strength Units");
       this.add(ST.class, false, 0, 20, new Object[]{message}, "Substance Lot Number");
       this.add(DTM.class, false, 0, 24, new Object[]{message}, "Substance Expiration Date");
       this.add(CWE.class, false, 0, 250, new Object[]{message}, "Substance Manufacturer Name");
       this.add(CWE.class, false, 0, 250, new Object[]{message}, "Indication");
       this.add(NM.class, false, 1, 5, new Object[]{message}, "Give Drug Strength Volume");
       this.add(CWE.class, false, 1, 250, new Object[]{message}, "Give Drug Strength Volume Units");
       this.add(CWE.class, false, 1, 60, new Object[]{message}, "Give Barcode Identifier");
       this.add(ID.class, false, 1, 1, new Object[]{message, new Integer(480)}, "Pharmacy Order Type");
       this.add(CWE.class, false, 1, 180, new Object[]{message}, "Dispense to Pharmacy");
       this.add(XAD.class, false, 1, 106, new Object[]{message}, "Dispense to Pharmacy Address");
       this.add(PL.class, false, 1, 80, new Object[]{message}, "Deliver-to Patient Location");
       this.add(XAD.class, false, 1, 250, new Object[]{message}, "Deliver-to Address");
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Can't instantiate " + this.getClass().getName(), he);
    }
  }

  /**
   * Returns Give Sub-ID Counter (RXG-1).
   */
  public NM getGiveSubIDCounter()  {
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
   * Returns Give Sub-ID Counter (RXG-1).
   */
  public NM getRxg1_GiveSubIDCounter()  {
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
   * Returns Dispense Sub-ID Counter (RXG-2).
   */
  public NM getDispenseSubIDCounter()  {
    NM ret = null;
    try {
        Type t = this.getField(2, 0);
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
   * Returns Dispense Sub-ID Counter (RXG-2).
   */
  public NM getRxg2_DispenseSubIDCounter()  {
    NM ret = null;
    try {
        Type t = this.getField(2, 0);
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
   * Returns Quantity/Timing (RXG-3).
   */
  public TQ getQuantityTiming()  {
    TQ ret = null;
    try {
        Type t = this.getField(3, 0);
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
   * Returns Quantity/Timing (RXG-3).
   */
  public TQ getRxg3_QuantityTiming()  {
    TQ ret = null;
    try {
        Type t = this.getField(3, 0);
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
   * Returns Give Code (RXG-4).
   */
  public CWE getGiveCode()  {
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
   * Returns Give Code (RXG-4).
   */
  public CWE getRxg4_GiveCode()  {
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
   * Returns Give Amount - Minimum (RXG-5).
   */
  public NM getGiveAmountMinimum()  {
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
   * Returns Give Amount - Minimum (RXG-5).
   */
  public NM getRxg5_GiveAmountMinimum()  {
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
   * Returns Give Amount - Maximum (RXG-6).
   */
  public NM getGiveAmountMaximum()  {
    NM ret = null;
    try {
        Type t = this.getField(6, 0);
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
   * Returns Give Amount - Maximum (RXG-6).
   */
  public NM getRxg6_GiveAmountMaximum()  {
    NM ret = null;
    try {
        Type t = this.getField(6, 0);
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
   * Returns Give Units (RXG-7).
   */
  public CWE getGiveUnits()  {
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
   * Returns Give Units (RXG-7).
   */
  public CWE getRxg7_GiveUnits()  {
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
   * Returns Give Dosage Form (RXG-8).
   */
  public CWE getGiveDosageForm()  {
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
   * Returns Give Dosage Form (RXG-8).
   */
  public CWE getRxg8_GiveDosageForm()  {
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
   * Returns a single repetition of Administration Notes (RXG-9).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getAdministrationNotes(int rep) throws HL7Exception {
    CWE ret = null;
    try {
        Type t = this.getField(9, rep);
        ret = (CWE)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Administration Notes (RXG-9).
   */
  public CWE[] getAdministrationNotes() {
     CWE[] ret = null;
    try {
        Type[] t = this.getField(9);  
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
   * Returns a count of the number of repetitions of Administration Notes (RXG-9).
   */
  public int getAdministrationNotesReps() {
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
   * Inserts a repetition of Administration Notes (RXG-9) at a given index and returns it.
   * @param index The index
   */
  public CWE insertAdministrationNotes(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(9, index);
  }

  /**
   * Removes a repetition of Administration Notes (RXG-9) at a given index and returns it.
   * @param index The index
   */
  public CWE removeAdministrationNotes(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(9, index);
  }

  /**
   * Returns a single repetition of Administration Notes (RXG-9).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getRxg9_AdministrationNotes(int rep) throws HL7Exception {
    CWE ret = null;
    try {
        Type t = this.getField(9, rep);
        ret = (CWE)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Administration Notes (RXG-9).
   */
  public CWE[] getRxg9_AdministrationNotes() {
     CWE[] ret = null;
    try {
        Type[] t = this.getField(9);  
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
   * Returns a count of the number of repetitions of Administration Notes (RXG-9).
   */
  public int getRxg9_AdministrationNotesReps() {
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
   * Inserts a repetition of Administration Notes (RXG-9) at a given index and returns it.
   * @param index The index
   */
  public CWE insertRxg9_AdministrationNotes(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(9, index);
  }

  /**
   * Removes a repetition of Administration Notes (RXG-9) at a given index and returns it.
   * @param index The index
   */
  public CWE removeRxg9_AdministrationNotes(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(9, index);
  }

  /**
   * Returns Substitution Status (RXG-10).
   */
  public ID getSubstitutionStatus()  {
    ID ret = null;
    try {
        Type t = this.getField(10, 0);
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
   * Returns Substitution Status (RXG-10).
   */
  public ID getRxg10_SubstitutionStatus()  {
    ID ret = null;
    try {
        Type t = this.getField(10, 0);
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
   * Returns Dispense-to Location (RXG-11).
   */
  public LA2 getDispenseToLocation()  {
    LA2 ret = null;
    try {
        Type t = this.getField(11, 0);
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
   * Returns Dispense-to Location (RXG-11).
   */
  public LA2 getRxg11_DispenseToLocation()  {
    LA2 ret = null;
    try {
        Type t = this.getField(11, 0);
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
   * Returns Needs Human Review (RXG-12).
   */
  public ID getNeedsHumanReview()  {
    ID ret = null;
    try {
        Type t = this.getField(12, 0);
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
   * Returns Needs Human Review (RXG-12).
   */
  public ID getRxg12_NeedsHumanReview()  {
    ID ret = null;
    try {
        Type t = this.getField(12, 0);
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
   * Returns a single repetition of Pharmacy/Treatment Supplier's Special Administration Instructions (RXG-13).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getPharmacyTreatmentSupplierSSpecialAdministrationInstructions(int rep) throws HL7Exception {
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
   * Returns all repetitions of Pharmacy/Treatment Supplier's Special Administration Instructions (RXG-13).
   */
  public CWE[] getPharmacyTreatmentSupplierSSpecialAdministrationInstructions() {
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
   * Returns a count of the number of repetitions of Pharmacy/Treatment Supplier's Special Administration Instructions (RXG-13).
   */
  public int getPharmacyTreatmentSupplierSSpecialAdministrationInstructionsReps() {
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
   * Inserts a repetition of Pharmacy/Treatment Supplier's Special Administration Instructions (RXG-13) at a given index and returns it.
   * @param index The index
   */
  public CWE insertPharmacyTreatmentSupplierSSpecialAdministrationInstructions(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(13, index);
  }

  /**
   * Removes a repetition of Pharmacy/Treatment Supplier's Special Administration Instructions (RXG-13) at a given index and returns it.
   * @param index The index
   */
  public CWE removePharmacyTreatmentSupplierSSpecialAdministrationInstructions(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(13, index);
  }

  /**
   * Returns a single repetition of Pharmacy/Treatment Supplier's Special Administration Instructions (RXG-13).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getRxg13_PharmacyTreatmentSupplierSSpecialAdministrationInstructions(int rep) throws HL7Exception {
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
   * Returns all repetitions of Pharmacy/Treatment Supplier's Special Administration Instructions (RXG-13).
   */
  public CWE[] getRxg13_PharmacyTreatmentSupplierSSpecialAdministrationInstructions() {
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
   * Returns a count of the number of repetitions of Pharmacy/Treatment Supplier's Special Administration Instructions (RXG-13).
   */
  public int getRxg13_PharmacyTreatmentSupplierSSpecialAdministrationInstructionsReps() {
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
   * Inserts a repetition of Pharmacy/Treatment Supplier's Special Administration Instructions (RXG-13) at a given index and returns it.
   * @param index The index
   */
  public CWE insertRxg13_PharmacyTreatmentSupplierSSpecialAdministrationInstructions(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(13, index);
  }

  /**
   * Removes a repetition of Pharmacy/Treatment Supplier's Special Administration Instructions (RXG-13) at a given index and returns it.
   * @param index The index
   */
  public CWE removeRxg13_PharmacyTreatmentSupplierSSpecialAdministrationInstructions(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(13, index);
  }

  /**
   * Returns Give Per (Time Unit) (RXG-14).
   */
  public ST getGivePerTimeUnit()  {
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
   * Returns Give Per (Time Unit) (RXG-14).
   */
  public ST getRxg14_GivePerTimeUnit()  {
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
   * Returns Give Rate Amount (RXG-15).
   */
  public ST getGiveRateAmount()  {
    ST ret = null;
    try {
        Type t = this.getField(15, 0);
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
   * Returns Give Rate Amount (RXG-15).
   */
  public ST getRxg15_GiveRateAmount()  {
    ST ret = null;
    try {
        Type t = this.getField(15, 0);
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
   * Returns Give Rate Units (RXG-16).
   */
  public CWE getGiveRateUnits()  {
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
   * Returns Give Rate Units (RXG-16).
   */
  public CWE getRxg16_GiveRateUnits()  {
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
   * Returns Give Strength (RXG-17).
   */
  public NM getGiveStrength()  {
    NM ret = null;
    try {
        Type t = this.getField(17, 0);
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
   * Returns Give Strength (RXG-17).
   */
  public NM getRxg17_GiveStrength()  {
    NM ret = null;
    try {
        Type t = this.getField(17, 0);
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
   * Returns Give Strength Units (RXG-18).
   */
  public CWE getGiveStrengthUnits()  {
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
   * Returns Give Strength Units (RXG-18).
   */
  public CWE getRxg18_GiveStrengthUnits()  {
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
   * Returns a single repetition of Substance Lot Number (RXG-19).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public ST getSubstanceLotNumber(int rep) throws HL7Exception {
    ST ret = null;
    try {
        Type t = this.getField(19, rep);
        ret = (ST)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Substance Lot Number (RXG-19).
   */
  public ST[] getSubstanceLotNumber() {
     ST[] ret = null;
    try {
        Type[] t = this.getField(19);  
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
   * Returns a count of the number of repetitions of Substance Lot Number (RXG-19).
   */
  public int getSubstanceLotNumberReps() {
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
   * Inserts a repetition of Substance Lot Number (RXG-19) at a given index and returns it.
   * @param index The index
   */
  public ST insertSubstanceLotNumber(int index) throws HL7Exception {
     return (ST) super.insertRepetition(19, index);
  }

  /**
   * Removes a repetition of Substance Lot Number (RXG-19) at a given index and returns it.
   * @param index The index
   */
  public ST removeSubstanceLotNumber(int index) throws HL7Exception {
     return (ST) super.removeRepetition(19, index);
  }

  /**
   * Returns a single repetition of Substance Lot Number (RXG-19).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public ST getRxg19_SubstanceLotNumber(int rep) throws HL7Exception {
    ST ret = null;
    try {
        Type t = this.getField(19, rep);
        ret = (ST)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Substance Lot Number (RXG-19).
   */
  public ST[] getRxg19_SubstanceLotNumber() {
     ST[] ret = null;
    try {
        Type[] t = this.getField(19);  
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
   * Returns a count of the number of repetitions of Substance Lot Number (RXG-19).
   */
  public int getRxg19_SubstanceLotNumberReps() {
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
   * Inserts a repetition of Substance Lot Number (RXG-19) at a given index and returns it.
   * @param index The index
   */
  public ST insertRxg19_SubstanceLotNumber(int index) throws HL7Exception {
     return (ST) super.insertRepetition(19, index);
  }

  /**
   * Removes a repetition of Substance Lot Number (RXG-19) at a given index and returns it.
   * @param index The index
   */
  public ST removeRxg19_SubstanceLotNumber(int index) throws HL7Exception {
     return (ST) super.removeRepetition(19, index);
  }

  /**
   * Returns a single repetition of Substance Expiration Date (RXG-20).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public DTM getSubstanceExpirationDate(int rep) throws HL7Exception {
    DTM ret = null;
    try {
        Type t = this.getField(20, rep);
        ret = (DTM)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Substance Expiration Date (RXG-20).
   */
  public DTM[] getSubstanceExpirationDate() {
     DTM[] ret = null;
    try {
        Type[] t = this.getField(20);  
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
   * Returns a count of the number of repetitions of Substance Expiration Date (RXG-20).
   */
  public int getSubstanceExpirationDateReps() {
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
   * Inserts a repetition of Substance Expiration Date (RXG-20) at a given index and returns it.
   * @param index The index
   */
  public DTM insertSubstanceExpirationDate(int index) throws HL7Exception {
     return (DTM) super.insertRepetition(20, index);
  }

  /**
   * Removes a repetition of Substance Expiration Date (RXG-20) at a given index and returns it.
   * @param index The index
   */
  public DTM removeSubstanceExpirationDate(int index) throws HL7Exception {
     return (DTM) super.removeRepetition(20, index);
  }

  /**
   * Returns a single repetition of Substance Expiration Date (RXG-20).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public DTM getRxg20_SubstanceExpirationDate(int rep) throws HL7Exception {
    DTM ret = null;
    try {
        Type t = this.getField(20, rep);
        ret = (DTM)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Substance Expiration Date (RXG-20).
   */
  public DTM[] getRxg20_SubstanceExpirationDate() {
     DTM[] ret = null;
    try {
        Type[] t = this.getField(20);  
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
   * Returns a count of the number of repetitions of Substance Expiration Date (RXG-20).
   */
  public int getRxg20_SubstanceExpirationDateReps() {
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
   * Inserts a repetition of Substance Expiration Date (RXG-20) at a given index and returns it.
   * @param index The index
   */
  public DTM insertRxg20_SubstanceExpirationDate(int index) throws HL7Exception {
     return (DTM) super.insertRepetition(20, index);
  }

  /**
   * Removes a repetition of Substance Expiration Date (RXG-20) at a given index and returns it.
   * @param index The index
   */
  public DTM removeRxg20_SubstanceExpirationDate(int index) throws HL7Exception {
     return (DTM) super.removeRepetition(20, index);
  }

  /**
   * Returns a single repetition of Substance Manufacturer Name (RXG-21).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getSubstanceManufacturerName(int rep) throws HL7Exception {
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
   * Returns all repetitions of Substance Manufacturer Name (RXG-21).
   */
  public CWE[] getSubstanceManufacturerName() {
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
   * Returns a count of the number of repetitions of Substance Manufacturer Name (RXG-21).
   */
  public int getSubstanceManufacturerNameReps() {
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
   * Inserts a repetition of Substance Manufacturer Name (RXG-21) at a given index and returns it.
   * @param index The index
   */
  public CWE insertSubstanceManufacturerName(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(21, index);
  }

  /**
   * Removes a repetition of Substance Manufacturer Name (RXG-21) at a given index and returns it.
   * @param index The index
   */
  public CWE removeSubstanceManufacturerName(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(21, index);
  }

  /**
   * Returns a single repetition of Substance Manufacturer Name (RXG-21).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getRxg21_SubstanceManufacturerName(int rep) throws HL7Exception {
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
   * Returns all repetitions of Substance Manufacturer Name (RXG-21).
   */
  public CWE[] getRxg21_SubstanceManufacturerName() {
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
   * Returns a count of the number of repetitions of Substance Manufacturer Name (RXG-21).
   */
  public int getRxg21_SubstanceManufacturerNameReps() {
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
   * Inserts a repetition of Substance Manufacturer Name (RXG-21) at a given index and returns it.
   * @param index The index
   */
  public CWE insertRxg21_SubstanceManufacturerName(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(21, index);
  }

  /**
   * Removes a repetition of Substance Manufacturer Name (RXG-21) at a given index and returns it.
   * @param index The index
   */
  public CWE removeRxg21_SubstanceManufacturerName(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(21, index);
  }

  /**
   * Returns a single repetition of Indication (RXG-22).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getIndication(int rep) throws HL7Exception {
    CWE ret = null;
    try {
        Type t = this.getField(22, rep);
        ret = (CWE)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Indication (RXG-22).
   */
  public CWE[] getIndication() {
     CWE[] ret = null;
    try {
        Type[] t = this.getField(22);  
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
   * Returns a count of the number of repetitions of Indication (RXG-22).
   */
  public int getIndicationReps() {
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
   * Inserts a repetition of Indication (RXG-22) at a given index and returns it.
   * @param index The index
   */
  public CWE insertIndication(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(22, index);
  }

  /**
   * Removes a repetition of Indication (RXG-22) at a given index and returns it.
   * @param index The index
   */
  public CWE removeIndication(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(22, index);
  }

  /**
   * Returns a single repetition of Indication (RXG-22).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getRxg22_Indication(int rep) throws HL7Exception {
    CWE ret = null;
    try {
        Type t = this.getField(22, rep);
        ret = (CWE)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Indication (RXG-22).
   */
  public CWE[] getRxg22_Indication() {
     CWE[] ret = null;
    try {
        Type[] t = this.getField(22);  
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
   * Returns a count of the number of repetitions of Indication (RXG-22).
   */
  public int getRxg22_IndicationReps() {
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
   * Inserts a repetition of Indication (RXG-22) at a given index and returns it.
   * @param index The index
   */
  public CWE insertRxg22_Indication(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(22, index);
  }

  /**
   * Removes a repetition of Indication (RXG-22) at a given index and returns it.
   * @param index The index
   */
  public CWE removeRxg22_Indication(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(22, index);
  }

  /**
   * Returns Give Drug Strength Volume (RXG-23).
   */
  public NM getGiveDrugStrengthVolume()  {
    NM ret = null;
    try {
        Type t = this.getField(23, 0);
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
   * Returns Give Drug Strength Volume (RXG-23).
   */
  public NM getRxg23_GiveDrugStrengthVolume()  {
    NM ret = null;
    try {
        Type t = this.getField(23, 0);
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
   * Returns Give Drug Strength Volume Units (RXG-24).
   */
  public CWE getGiveDrugStrengthVolumeUnits()  {
    CWE ret = null;
    try {
        Type t = this.getField(24, 0);
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
   * Returns Give Drug Strength Volume Units (RXG-24).
   */
  public CWE getRxg24_GiveDrugStrengthVolumeUnits()  {
    CWE ret = null;
    try {
        Type t = this.getField(24, 0);
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
   * Returns Give Barcode Identifier (RXG-25).
   */
  public CWE getGiveBarcodeIdentifier()  {
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
   * Returns Give Barcode Identifier (RXG-25).
   */
  public CWE getRxg25_GiveBarcodeIdentifier()  {
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
   * Returns Pharmacy Order Type (RXG-26).
   */
  public ID getPharmacyOrderType()  {
    ID ret = null;
    try {
        Type t = this.getField(26, 0);
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
   * Returns Pharmacy Order Type (RXG-26).
   */
  public ID getRxg26_PharmacyOrderType()  {
    ID ret = null;
    try {
        Type t = this.getField(26, 0);
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
   * Returns Dispense to Pharmacy (RXG-27).
   */
  public CWE getDispenseToPharmacy()  {
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
   * Returns Dispense to Pharmacy (RXG-27).
   */
  public CWE getRxg27_DispenseToPharmacy()  {
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
   * Returns Dispense to Pharmacy Address (RXG-28).
   */
  public XAD getDispenseToPharmacyAddress()  {
    XAD ret = null;
    try {
        Type t = this.getField(28, 0);
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
   * Returns Dispense to Pharmacy Address (RXG-28).
   */
  public XAD getRxg28_DispenseToPharmacyAddress()  {
    XAD ret = null;
    try {
        Type t = this.getField(28, 0);
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
   * Returns Deliver-to Patient Location (RXG-29).
   */
  public PL getDeliverToPatientLocation()  {
    PL ret = null;
    try {
        Type t = this.getField(29, 0);
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
   * Returns Deliver-to Patient Location (RXG-29).
   */
  public PL getRxg29_DeliverToPatientLocation()  {
    PL ret = null;
    try {
        Type t = this.getField(29, 0);
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
   * Returns Deliver-to Address (RXG-30).
   */
  public XAD getDeliverToAddress()  {
    XAD ret = null;
    try {
        Type t = this.getField(30, 0);
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
   * Returns Deliver-to Address (RXG-30).
   */
  public XAD getRxg30_DeliverToAddress()  {
    XAD ret = null;
    try {
        Type t = this.getField(30, 0);
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

   protected Type createNewTypeWithoutReflection(int field) {
      switch (field) {
         case 0: return new ca.uhn.hl7v2.model.v26.datatype.NM(getMessage());
         case 1: return new ca.uhn.hl7v2.model.v26.datatype.NM(getMessage());
         case 2: return new ca.uhn.hl7v2.model.v26.datatype.TQ(getMessage());
         case 3: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 4: return new ca.uhn.hl7v2.model.v26.datatype.NM(getMessage());
         case 5: return new ca.uhn.hl7v2.model.v26.datatype.NM(getMessage());
         case 6: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 7: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 8: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 9: return new ca.uhn.hl7v2.model.v26.datatype.ID(getMessage(), new Integer(167));
         case 10: return new ca.uhn.hl7v2.model.v26.datatype.LA2(getMessage());
         case 11: return new ca.uhn.hl7v2.model.v26.datatype.ID(getMessage(), new Integer(136));
         case 12: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 13: return new ca.uhn.hl7v2.model.v26.datatype.ST(getMessage());
         case 14: return new ca.uhn.hl7v2.model.v26.datatype.ST(getMessage());
         case 15: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 16: return new ca.uhn.hl7v2.model.v26.datatype.NM(getMessage());
         case 17: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 18: return new ca.uhn.hl7v2.model.v26.datatype.ST(getMessage());
         case 19: return new ca.uhn.hl7v2.model.v26.datatype.DTM(getMessage());
         case 20: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 21: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 22: return new ca.uhn.hl7v2.model.v26.datatype.NM(getMessage());
         case 23: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 24: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 25: return new ca.uhn.hl7v2.model.v26.datatype.ID(getMessage(), new Integer(480));
         case 26: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 27: return new ca.uhn.hl7v2.model.v26.datatype.XAD(getMessage());
         case 28: return new ca.uhn.hl7v2.model.v26.datatype.PL(getMessage());
         case 29: return new ca.uhn.hl7v2.model.v26.datatype.XAD(getMessage());
         default: return null;
      }
   }

}