package ca.uhn.hl7v2.model.v26.segment;

import ca.uhn.hl7v2.model.*;
import ca.uhn.hl7v2.model.v26.datatype.*;
import ca.uhn.log.HapiLogFactory;
import ca.uhn.hl7v2.parser.ModelClassFactory;
import ca.uhn.hl7v2.HL7Exception;

/**
 * <p>Represents an HL7 RXO message segment. 
 * This segment has the following fields:</p><p>
 * RXO-1: Requested Give Code (CWE)<br> 
 * RXO-2: Requested Give Amount - Minimum (NM)<br> 
 * RXO-3: Requested Give Amount - Maximum (NM)<br> 
 * RXO-4: Requested Give Units (CWE)<br> 
 * RXO-5: Requested Dosage Form (CWE)<br> 
 * RXO-6: Provider's Pharmacy/Treatment Instructions (CWE)<br> 
 * RXO-7: Provider's Administration Instructions (CWE)<br> 
 * RXO-8: Deliver-To Location (LA1)<br> 
 * RXO-9: Allow Substitutions (ID)<br> 
 * RXO-10: Requested Dispense Code (CWE)<br> 
 * RXO-11: Requested Dispense Amount (NM)<br> 
 * RXO-12: Requested Dispense Units (CWE)<br> 
 * RXO-13: Number Of Refills (NM)<br> 
 * RXO-14: Ordering Provider's DEA Number (XCN)<br> 
 * RXO-15: Pharmacist/Treatment Supplier's Verifier ID (XCN)<br> 
 * RXO-16: Needs Human Review (ID)<br> 
 * RXO-17: Requested Give Per (Time Unit) (ST)<br> 
 * RXO-18: Requested Give Strength (NM)<br> 
 * RXO-19: Requested Give Strength Units (CWE)<br> 
 * RXO-20: Indication (CWE)<br> 
 * RXO-21: Requested Give Rate Amount (ST)<br> 
 * RXO-22: Requested Give Rate Units (CWE)<br> 
 * RXO-23: Total Daily Dose (CQ)<br> 
 * RXO-24: Supplementary Code (CWE)<br> 
 * RXO-25: Requested Drug Strength Volume (NM)<br> 
 * RXO-26: Requested Drug Strength Volume Units (CWE)<br> 
 * RXO-27: Pharmacy Order Type (ID)<br> 
 * RXO-28: Dispensing Interval (NM)<br> 
 * RXO-29: Medication Instance Identifier (EI)<br> 
 * RXO-30: Segment Instance Identifier (EI)<br> 
 * RXO-31: Mood Code (CNE)<br> 
 * RXO-32: Dispensing Pharmacy (CWE)<br> 
 * RXO-33: Dispensing Pharmacy Address (XAD)<br> 
 * RXO-34: Deliver-to Patient Location (PL)<br> 
 * RXO-35: Deliver-to Address (XAD)<br> 
 * </p><p>The get...() methods return data from individual fields.  These methods 
 * do not throw exceptions and may therefore have to handle exceptions internally.  
 * If an exception is handled internally, it is logged and null is returned.  
 * This is not expected to happen - if it does happen this indicates not so much 
 * an exceptional circumstance as a bug in the code for this class.</p>    
 */
public class RXO extends AbstractSegment  {

  /**
   * Creates a RXO (Pharmacy/Treatment Order) segment object that belongs to the given 
   * message.  
   */
  public RXO(Group parent, ModelClassFactory factory) {
    super(parent, factory);
    Message message = getMessage();
    try {
       this.add(CWE.class, false, 1, 250, new Object[]{message}, "Requested Give Code");
       this.add(NM.class, false, 1, 20, new Object[]{message}, "Requested Give Amount - Minimum");
       this.add(NM.class, false, 1, 20, new Object[]{message}, "Requested Give Amount - Maximum");
       this.add(CWE.class, false, 1, 250, new Object[]{message}, "Requested Give Units");
       this.add(CWE.class, false, 1, 250, new Object[]{message}, "Requested Dosage Form");
       this.add(CWE.class, false, 0, 250, new Object[]{message}, "Provider's Pharmacy/Treatment Instructions");
       this.add(CWE.class, false, 0, 250, new Object[]{message}, "Provider's Administration Instructions");
       this.add(LA1.class, false, 1, 0, new Object[]{message}, "Deliver-To Location");
       this.add(ID.class, false, 1, 1, new Object[]{message, new Integer(161)}, "Allow Substitutions");
       this.add(CWE.class, false, 1, 250, new Object[]{message}, "Requested Dispense Code");
       this.add(NM.class, false, 1, 20, new Object[]{message}, "Requested Dispense Amount");
       this.add(CWE.class, false, 1, 250, new Object[]{message}, "Requested Dispense Units");
       this.add(NM.class, false, 1, 3, new Object[]{message}, "Number Of Refills");
       this.add(XCN.class, false, 0, 250, new Object[]{message}, "Ordering Provider's DEA Number");
       this.add(XCN.class, false, 0, 250, new Object[]{message}, "Pharmacist/Treatment Supplier's Verifier ID");
       this.add(ID.class, false, 1, 1, new Object[]{message, new Integer(136)}, "Needs Human Review");
       this.add(ST.class, false, 1, 20, new Object[]{message}, "Requested Give Per (Time Unit)");
       this.add(NM.class, false, 1, 20, new Object[]{message}, "Requested Give Strength");
       this.add(CWE.class, false, 1, 250, new Object[]{message}, "Requested Give Strength Units");
       this.add(CWE.class, false, 0, 250, new Object[]{message}, "Indication");
       this.add(ST.class, false, 1, 6, new Object[]{message}, "Requested Give Rate Amount");
       this.add(CWE.class, false, 1, 250, new Object[]{message}, "Requested Give Rate Units");
       this.add(CQ.class, false, 1, 10, new Object[]{message}, "Total Daily Dose");
       this.add(CWE.class, false, 0, 250, new Object[]{message}, "Supplementary Code");
       this.add(NM.class, false, 1, 5, new Object[]{message}, "Requested Drug Strength Volume");
       this.add(CWE.class, false, 1, 250, new Object[]{message}, "Requested Drug Strength Volume Units");
       this.add(ID.class, false, 1, 1, new Object[]{message, new Integer(480)}, "Pharmacy Order Type");
       this.add(NM.class, false, 1, 20, new Object[]{message}, "Dispensing Interval");
       this.add(EI.class, false, 1, 60, new Object[]{message}, "Medication Instance Identifier");
       this.add(EI.class, false, 1, 60, new Object[]{message}, "Segment Instance Identifier");
       this.add(CNE.class, false, 1, 2, new Object[]{message}, "Mood Code");
       this.add(CWE.class, false, 1, 250, new Object[]{message}, "Dispensing Pharmacy");
       this.add(XAD.class, false, 1, 250, new Object[]{message}, "Dispensing Pharmacy Address");
       this.add(PL.class, false, 1, 80, new Object[]{message}, "Deliver-to Patient Location");
       this.add(XAD.class, false, 1, 250, new Object[]{message}, "Deliver-to Address");
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Can't instantiate " + this.getClass().getName(), he);
    }
  }

  /**
   * Returns Requested Give Code (RXO-1).
   */
  public CWE getRequestedGiveCode()  {
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
   * Returns Requested Give Code (RXO-1).
   */
  public CWE getRxo1_RequestedGiveCode()  {
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
   * Returns Requested Give Amount - Minimum (RXO-2).
   */
  public NM getRequestedGiveAmountMinimum()  {
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
   * Returns Requested Give Amount - Minimum (RXO-2).
   */
  public NM getRxo2_RequestedGiveAmountMinimum()  {
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
   * Returns Requested Give Amount - Maximum (RXO-3).
   */
  public NM getRequestedGiveAmountMaximum()  {
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
   * Returns Requested Give Amount - Maximum (RXO-3).
   */
  public NM getRxo3_RequestedGiveAmountMaximum()  {
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
   * Returns Requested Give Units (RXO-4).
   */
  public CWE getRequestedGiveUnits()  {
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
   * Returns Requested Give Units (RXO-4).
   */
  public CWE getRxo4_RequestedGiveUnits()  {
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
   * Returns Requested Dosage Form (RXO-5).
   */
  public CWE getRequestedDosageForm()  {
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
   * Returns Requested Dosage Form (RXO-5).
   */
  public CWE getRxo5_RequestedDosageForm()  {
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
   * Returns a single repetition of Provider's Pharmacy/Treatment Instructions (RXO-6).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getProviderSPharmacyTreatmentInstructions(int rep) throws HL7Exception {
    CWE ret = null;
    try {
        Type t = this.getField(6, rep);
        ret = (CWE)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Provider's Pharmacy/Treatment Instructions (RXO-6).
   */
  public CWE[] getProviderSPharmacyTreatmentInstructions() {
     CWE[] ret = null;
    try {
        Type[] t = this.getField(6);  
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
   * Returns a count of the number of repetitions of Provider's Pharmacy/Treatment Instructions (RXO-6).
   */
  public int getProviderSPharmacyTreatmentInstructionsReps() {
    try {
        return this.getField(6).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Provider's Pharmacy/Treatment Instructions (RXO-6) at a given index and returns it.
   * @param index The index
   */
  public CWE insertProviderSPharmacyTreatmentInstructions(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(6, index);
  }

  /**
   * Removes a repetition of Provider's Pharmacy/Treatment Instructions (RXO-6) at a given index and returns it.
   * @param index The index
   */
  public CWE removeProviderSPharmacyTreatmentInstructions(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(6, index);
  }

  /**
   * Returns a single repetition of Provider's Pharmacy/Treatment Instructions (RXO-6).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getRxo6_ProviderSPharmacyTreatmentInstructions(int rep) throws HL7Exception {
    CWE ret = null;
    try {
        Type t = this.getField(6, rep);
        ret = (CWE)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Provider's Pharmacy/Treatment Instructions (RXO-6).
   */
  public CWE[] getRxo6_ProviderSPharmacyTreatmentInstructions() {
     CWE[] ret = null;
    try {
        Type[] t = this.getField(6);  
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
   * Returns a count of the number of repetitions of Provider's Pharmacy/Treatment Instructions (RXO-6).
   */
  public int getRxo6_ProviderSPharmacyTreatmentInstructionsReps() {
    try {
        return this.getField(6).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Provider's Pharmacy/Treatment Instructions (RXO-6) at a given index and returns it.
   * @param index The index
   */
  public CWE insertRxo6_ProviderSPharmacyTreatmentInstructions(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(6, index);
  }

  /**
   * Removes a repetition of Provider's Pharmacy/Treatment Instructions (RXO-6) at a given index and returns it.
   * @param index The index
   */
  public CWE removeRxo6_ProviderSPharmacyTreatmentInstructions(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(6, index);
  }

  /**
   * Returns a single repetition of Provider's Administration Instructions (RXO-7).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getProviderSAdministrationInstructions(int rep) throws HL7Exception {
    CWE ret = null;
    try {
        Type t = this.getField(7, rep);
        ret = (CWE)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Provider's Administration Instructions (RXO-7).
   */
  public CWE[] getProviderSAdministrationInstructions() {
     CWE[] ret = null;
    try {
        Type[] t = this.getField(7);  
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
   * Returns a count of the number of repetitions of Provider's Administration Instructions (RXO-7).
   */
  public int getProviderSAdministrationInstructionsReps() {
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
   * Inserts a repetition of Provider's Administration Instructions (RXO-7) at a given index and returns it.
   * @param index The index
   */
  public CWE insertProviderSAdministrationInstructions(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(7, index);
  }

  /**
   * Removes a repetition of Provider's Administration Instructions (RXO-7) at a given index and returns it.
   * @param index The index
   */
  public CWE removeProviderSAdministrationInstructions(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(7, index);
  }

  /**
   * Returns a single repetition of Provider's Administration Instructions (RXO-7).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getRxo7_ProviderSAdministrationInstructions(int rep) throws HL7Exception {
    CWE ret = null;
    try {
        Type t = this.getField(7, rep);
        ret = (CWE)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Provider's Administration Instructions (RXO-7).
   */
  public CWE[] getRxo7_ProviderSAdministrationInstructions() {
     CWE[] ret = null;
    try {
        Type[] t = this.getField(7);  
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
   * Returns a count of the number of repetitions of Provider's Administration Instructions (RXO-7).
   */
  public int getRxo7_ProviderSAdministrationInstructionsReps() {
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
   * Inserts a repetition of Provider's Administration Instructions (RXO-7) at a given index and returns it.
   * @param index The index
   */
  public CWE insertRxo7_ProviderSAdministrationInstructions(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(7, index);
  }

  /**
   * Removes a repetition of Provider's Administration Instructions (RXO-7) at a given index and returns it.
   * @param index The index
   */
  public CWE removeRxo7_ProviderSAdministrationInstructions(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(7, index);
  }

  /**
   * Returns Deliver-To Location (RXO-8).
   */
  public LA1 getDeliverToLocation()  {
    LA1 ret = null;
    try {
        Type t = this.getField(8, 0);
        ret = (LA1)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns Deliver-To Location (RXO-8).
   */
  public LA1 getRxo8_DeliverToLocation()  {
    LA1 ret = null;
    try {
        Type t = this.getField(8, 0);
        ret = (LA1)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns Allow Substitutions (RXO-9).
   */
  public ID getAllowSubstitutions()  {
    ID ret = null;
    try {
        Type t = this.getField(9, 0);
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
   * Returns Allow Substitutions (RXO-9).
   */
  public ID getRxo9_AllowSubstitutions()  {
    ID ret = null;
    try {
        Type t = this.getField(9, 0);
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
   * Returns Requested Dispense Code (RXO-10).
   */
  public CWE getRequestedDispenseCode()  {
    CWE ret = null;
    try {
        Type t = this.getField(10, 0);
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
   * Returns Requested Dispense Code (RXO-10).
   */
  public CWE getRxo10_RequestedDispenseCode()  {
    CWE ret = null;
    try {
        Type t = this.getField(10, 0);
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
   * Returns Requested Dispense Amount (RXO-11).
   */
  public NM getRequestedDispenseAmount()  {
    NM ret = null;
    try {
        Type t = this.getField(11, 0);
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
   * Returns Requested Dispense Amount (RXO-11).
   */
  public NM getRxo11_RequestedDispenseAmount()  {
    NM ret = null;
    try {
        Type t = this.getField(11, 0);
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
   * Returns Requested Dispense Units (RXO-12).
   */
  public CWE getRequestedDispenseUnits()  {
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
   * Returns Requested Dispense Units (RXO-12).
   */
  public CWE getRxo12_RequestedDispenseUnits()  {
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
   * Returns Number Of Refills (RXO-13).
   */
  public NM getNumberOfRefills()  {
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
   * Returns Number Of Refills (RXO-13).
   */
  public NM getRxo13_NumberOfRefills()  {
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
   * Returns a single repetition of Ordering Provider's DEA Number (RXO-14).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XCN getOrderingProviderSDEANumber(int rep) throws HL7Exception {
    XCN ret = null;
    try {
        Type t = this.getField(14, rep);
        ret = (XCN)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Ordering Provider's DEA Number (RXO-14).
   */
  public XCN[] getOrderingProviderSDEANumber() {
     XCN[] ret = null;
    try {
        Type[] t = this.getField(14);  
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
   * Returns a count of the number of repetitions of Ordering Provider's DEA Number (RXO-14).
   */
  public int getOrderingProviderSDEANumberReps() {
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
   * Inserts a repetition of Ordering Provider's DEA Number (RXO-14) at a given index and returns it.
   * @param index The index
   */
  public XCN insertOrderingProviderSDEANumber(int index) throws HL7Exception {
     return (XCN) super.insertRepetition(14, index);
  }

  /**
   * Removes a repetition of Ordering Provider's DEA Number (RXO-14) at a given index and returns it.
   * @param index The index
   */
  public XCN removeOrderingProviderSDEANumber(int index) throws HL7Exception {
     return (XCN) super.removeRepetition(14, index);
  }

  /**
   * Returns a single repetition of Ordering Provider's DEA Number (RXO-14).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XCN getRxo14_OrderingProviderSDEANumber(int rep) throws HL7Exception {
    XCN ret = null;
    try {
        Type t = this.getField(14, rep);
        ret = (XCN)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Ordering Provider's DEA Number (RXO-14).
   */
  public XCN[] getRxo14_OrderingProviderSDEANumber() {
     XCN[] ret = null;
    try {
        Type[] t = this.getField(14);  
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
   * Returns a count of the number of repetitions of Ordering Provider's DEA Number (RXO-14).
   */
  public int getRxo14_OrderingProviderSDEANumberReps() {
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
   * Inserts a repetition of Ordering Provider's DEA Number (RXO-14) at a given index and returns it.
   * @param index The index
   */
  public XCN insertRxo14_OrderingProviderSDEANumber(int index) throws HL7Exception {
     return (XCN) super.insertRepetition(14, index);
  }

  /**
   * Removes a repetition of Ordering Provider's DEA Number (RXO-14) at a given index and returns it.
   * @param index The index
   */
  public XCN removeRxo14_OrderingProviderSDEANumber(int index) throws HL7Exception {
     return (XCN) super.removeRepetition(14, index);
  }

  /**
   * Returns a single repetition of Pharmacist/Treatment Supplier's Verifier ID (RXO-15).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XCN getPharmacistTreatmentSupplierSVerifierID(int rep) throws HL7Exception {
    XCN ret = null;
    try {
        Type t = this.getField(15, rep);
        ret = (XCN)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Pharmacist/Treatment Supplier's Verifier ID (RXO-15).
   */
  public XCN[] getPharmacistTreatmentSupplierSVerifierID() {
     XCN[] ret = null;
    try {
        Type[] t = this.getField(15);  
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
   * Returns a count of the number of repetitions of Pharmacist/Treatment Supplier's Verifier ID (RXO-15).
   */
  public int getPharmacistTreatmentSupplierSVerifierIDReps() {
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
   * Inserts a repetition of Pharmacist/Treatment Supplier's Verifier ID (RXO-15) at a given index and returns it.
   * @param index The index
   */
  public XCN insertPharmacistTreatmentSupplierSVerifierID(int index) throws HL7Exception {
     return (XCN) super.insertRepetition(15, index);
  }

  /**
   * Removes a repetition of Pharmacist/Treatment Supplier's Verifier ID (RXO-15) at a given index and returns it.
   * @param index The index
   */
  public XCN removePharmacistTreatmentSupplierSVerifierID(int index) throws HL7Exception {
     return (XCN) super.removeRepetition(15, index);
  }

  /**
   * Returns a single repetition of Pharmacist/Treatment Supplier's Verifier ID (RXO-15).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XCN getRxo15_PharmacistTreatmentSupplierSVerifierID(int rep) throws HL7Exception {
    XCN ret = null;
    try {
        Type t = this.getField(15, rep);
        ret = (XCN)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Pharmacist/Treatment Supplier's Verifier ID (RXO-15).
   */
  public XCN[] getRxo15_PharmacistTreatmentSupplierSVerifierID() {
     XCN[] ret = null;
    try {
        Type[] t = this.getField(15);  
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
   * Returns a count of the number of repetitions of Pharmacist/Treatment Supplier's Verifier ID (RXO-15).
   */
  public int getRxo15_PharmacistTreatmentSupplierSVerifierIDReps() {
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
   * Inserts a repetition of Pharmacist/Treatment Supplier's Verifier ID (RXO-15) at a given index and returns it.
   * @param index The index
   */
  public XCN insertRxo15_PharmacistTreatmentSupplierSVerifierID(int index) throws HL7Exception {
     return (XCN) super.insertRepetition(15, index);
  }

  /**
   * Removes a repetition of Pharmacist/Treatment Supplier's Verifier ID (RXO-15) at a given index and returns it.
   * @param index The index
   */
  public XCN removeRxo15_PharmacistTreatmentSupplierSVerifierID(int index) throws HL7Exception {
     return (XCN) super.removeRepetition(15, index);
  }

  /**
   * Returns Needs Human Review (RXO-16).
   */
  public ID getNeedsHumanReview()  {
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
   * Returns Needs Human Review (RXO-16).
   */
  public ID getRxo16_NeedsHumanReview()  {
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
   * Returns Requested Give Per (Time Unit) (RXO-17).
   */
  public ST getRequestedGivePerTimeUnit()  {
    ST ret = null;
    try {
        Type t = this.getField(17, 0);
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
   * Returns Requested Give Per (Time Unit) (RXO-17).
   */
  public ST getRxo17_RequestedGivePerTimeUnit()  {
    ST ret = null;
    try {
        Type t = this.getField(17, 0);
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
   * Returns Requested Give Strength (RXO-18).
   */
  public NM getRequestedGiveStrength()  {
    NM ret = null;
    try {
        Type t = this.getField(18, 0);
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
   * Returns Requested Give Strength (RXO-18).
   */
  public NM getRxo18_RequestedGiveStrength()  {
    NM ret = null;
    try {
        Type t = this.getField(18, 0);
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
   * Returns Requested Give Strength Units (RXO-19).
   */
  public CWE getRequestedGiveStrengthUnits()  {
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
   * Returns Requested Give Strength Units (RXO-19).
   */
  public CWE getRxo19_RequestedGiveStrengthUnits()  {
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
   * Returns a single repetition of Indication (RXO-20).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getIndication(int rep) throws HL7Exception {
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
   * Returns all repetitions of Indication (RXO-20).
   */
  public CWE[] getIndication() {
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
   * Returns a count of the number of repetitions of Indication (RXO-20).
   */
  public int getIndicationReps() {
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
   * Inserts a repetition of Indication (RXO-20) at a given index and returns it.
   * @param index The index
   */
  public CWE insertIndication(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(20, index);
  }

  /**
   * Removes a repetition of Indication (RXO-20) at a given index and returns it.
   * @param index The index
   */
  public CWE removeIndication(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(20, index);
  }

  /**
   * Returns a single repetition of Indication (RXO-20).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getRxo20_Indication(int rep) throws HL7Exception {
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
   * Returns all repetitions of Indication (RXO-20).
   */
  public CWE[] getRxo20_Indication() {
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
   * Returns a count of the number of repetitions of Indication (RXO-20).
   */
  public int getRxo20_IndicationReps() {
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
   * Inserts a repetition of Indication (RXO-20) at a given index and returns it.
   * @param index The index
   */
  public CWE insertRxo20_Indication(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(20, index);
  }

  /**
   * Removes a repetition of Indication (RXO-20) at a given index and returns it.
   * @param index The index
   */
  public CWE removeRxo20_Indication(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(20, index);
  }

  /**
   * Returns Requested Give Rate Amount (RXO-21).
   */
  public ST getRequestedGiveRateAmount()  {
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
   * Returns Requested Give Rate Amount (RXO-21).
   */
  public ST getRxo21_RequestedGiveRateAmount()  {
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
   * Returns Requested Give Rate Units (RXO-22).
   */
  public CWE getRequestedGiveRateUnits()  {
    CWE ret = null;
    try {
        Type t = this.getField(22, 0);
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
   * Returns Requested Give Rate Units (RXO-22).
   */
  public CWE getRxo22_RequestedGiveRateUnits()  {
    CWE ret = null;
    try {
        Type t = this.getField(22, 0);
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
   * Returns Total Daily Dose (RXO-23).
   */
  public CQ getTotalDailyDose()  {
    CQ ret = null;
    try {
        Type t = this.getField(23, 0);
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
   * Returns Total Daily Dose (RXO-23).
   */
  public CQ getRxo23_TotalDailyDose()  {
    CQ ret = null;
    try {
        Type t = this.getField(23, 0);
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
   * Returns a single repetition of Supplementary Code (RXO-24).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getSupplementaryCode(int rep) throws HL7Exception {
    CWE ret = null;
    try {
        Type t = this.getField(24, rep);
        ret = (CWE)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Supplementary Code (RXO-24).
   */
  public CWE[] getSupplementaryCode() {
     CWE[] ret = null;
    try {
        Type[] t = this.getField(24);  
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
   * Returns a count of the number of repetitions of Supplementary Code (RXO-24).
   */
  public int getSupplementaryCodeReps() {
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
   * Inserts a repetition of Supplementary Code (RXO-24) at a given index and returns it.
   * @param index The index
   */
  public CWE insertSupplementaryCode(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(24, index);
  }

  /**
   * Removes a repetition of Supplementary Code (RXO-24) at a given index and returns it.
   * @param index The index
   */
  public CWE removeSupplementaryCode(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(24, index);
  }

  /**
   * Returns a single repetition of Supplementary Code (RXO-24).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getRxo24_SupplementaryCode(int rep) throws HL7Exception {
    CWE ret = null;
    try {
        Type t = this.getField(24, rep);
        ret = (CWE)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Supplementary Code (RXO-24).
   */
  public CWE[] getRxo24_SupplementaryCode() {
     CWE[] ret = null;
    try {
        Type[] t = this.getField(24);  
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
   * Returns a count of the number of repetitions of Supplementary Code (RXO-24).
   */
  public int getRxo24_SupplementaryCodeReps() {
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
   * Inserts a repetition of Supplementary Code (RXO-24) at a given index and returns it.
   * @param index The index
   */
  public CWE insertRxo24_SupplementaryCode(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(24, index);
  }

  /**
   * Removes a repetition of Supplementary Code (RXO-24) at a given index and returns it.
   * @param index The index
   */
  public CWE removeRxo24_SupplementaryCode(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(24, index);
  }

  /**
   * Returns Requested Drug Strength Volume (RXO-25).
   */
  public NM getRequestedDrugStrengthVolume()  {
    NM ret = null;
    try {
        Type t = this.getField(25, 0);
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
   * Returns Requested Drug Strength Volume (RXO-25).
   */
  public NM getRxo25_RequestedDrugStrengthVolume()  {
    NM ret = null;
    try {
        Type t = this.getField(25, 0);
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
   * Returns Requested Drug Strength Volume Units (RXO-26).
   */
  public CWE getRequestedDrugStrengthVolumeUnits()  {
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
   * Returns Requested Drug Strength Volume Units (RXO-26).
   */
  public CWE getRxo26_RequestedDrugStrengthVolumeUnits()  {
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
   * Returns Pharmacy Order Type (RXO-27).
   */
  public ID getPharmacyOrderType()  {
    ID ret = null;
    try {
        Type t = this.getField(27, 0);
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
   * Returns Pharmacy Order Type (RXO-27).
   */
  public ID getRxo27_PharmacyOrderType()  {
    ID ret = null;
    try {
        Type t = this.getField(27, 0);
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
   * Returns Dispensing Interval (RXO-28).
   */
  public NM getDispensingInterval()  {
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
   * Returns Dispensing Interval (RXO-28).
   */
  public NM getRxo28_DispensingInterval()  {
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
   * Returns Medication Instance Identifier (RXO-29).
   */
  public EI getMedicationInstanceIdentifier()  {
    EI ret = null;
    try {
        Type t = this.getField(29, 0);
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
   * Returns Medication Instance Identifier (RXO-29).
   */
  public EI getRxo29_MedicationInstanceIdentifier()  {
    EI ret = null;
    try {
        Type t = this.getField(29, 0);
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
   * Returns Segment Instance Identifier (RXO-30).
   */
  public EI getSegmentInstanceIdentifier()  {
    EI ret = null;
    try {
        Type t = this.getField(30, 0);
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
   * Returns Segment Instance Identifier (RXO-30).
   */
  public EI getRxo30_SegmentInstanceIdentifier()  {
    EI ret = null;
    try {
        Type t = this.getField(30, 0);
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
   * Returns Mood Code (RXO-31).
   */
  public CNE getMoodCode()  {
    CNE ret = null;
    try {
        Type t = this.getField(31, 0);
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
   * Returns Mood Code (RXO-31).
   */
  public CNE getRxo31_MoodCode()  {
    CNE ret = null;
    try {
        Type t = this.getField(31, 0);
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
   * Returns Dispensing Pharmacy (RXO-32).
   */
  public CWE getDispensingPharmacy()  {
    CWE ret = null;
    try {
        Type t = this.getField(32, 0);
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
   * Returns Dispensing Pharmacy (RXO-32).
   */
  public CWE getRxo32_DispensingPharmacy()  {
    CWE ret = null;
    try {
        Type t = this.getField(32, 0);
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
   * Returns Dispensing Pharmacy Address (RXO-33).
   */
  public XAD getDispensingPharmacyAddress()  {
    XAD ret = null;
    try {
        Type t = this.getField(33, 0);
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
   * Returns Dispensing Pharmacy Address (RXO-33).
   */
  public XAD getRxo33_DispensingPharmacyAddress()  {
    XAD ret = null;
    try {
        Type t = this.getField(33, 0);
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
   * Returns Deliver-to Patient Location (RXO-34).
   */
  public PL getDeliverToPatientLocation()  {
    PL ret = null;
    try {
        Type t = this.getField(34, 0);
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
   * Returns Deliver-to Patient Location (RXO-34).
   */
  public PL getRxo34_DeliverToPatientLocation()  {
    PL ret = null;
    try {
        Type t = this.getField(34, 0);
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
   * Returns Deliver-to Address (RXO-35).
   */
  public XAD getDeliverToAddress()  {
    XAD ret = null;
    try {
        Type t = this.getField(35, 0);
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
   * Returns Deliver-to Address (RXO-35).
   */
  public XAD getRxo35_DeliverToAddress()  {
    XAD ret = null;
    try {
        Type t = this.getField(35, 0);
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
         case 0: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 1: return new ca.uhn.hl7v2.model.v26.datatype.NM(getMessage());
         case 2: return new ca.uhn.hl7v2.model.v26.datatype.NM(getMessage());
         case 3: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 4: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 5: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 6: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 7: return new ca.uhn.hl7v2.model.v26.datatype.LA1(getMessage());
         case 8: return new ca.uhn.hl7v2.model.v26.datatype.ID(getMessage(), new Integer(161));
         case 9: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 10: return new ca.uhn.hl7v2.model.v26.datatype.NM(getMessage());
         case 11: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 12: return new ca.uhn.hl7v2.model.v26.datatype.NM(getMessage());
         case 13: return new ca.uhn.hl7v2.model.v26.datatype.XCN(getMessage());
         case 14: return new ca.uhn.hl7v2.model.v26.datatype.XCN(getMessage());
         case 15: return new ca.uhn.hl7v2.model.v26.datatype.ID(getMessage(), new Integer(136));
         case 16: return new ca.uhn.hl7v2.model.v26.datatype.ST(getMessage());
         case 17: return new ca.uhn.hl7v2.model.v26.datatype.NM(getMessage());
         case 18: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 19: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 20: return new ca.uhn.hl7v2.model.v26.datatype.ST(getMessage());
         case 21: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 22: return new ca.uhn.hl7v2.model.v26.datatype.CQ(getMessage());
         case 23: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 24: return new ca.uhn.hl7v2.model.v26.datatype.NM(getMessage());
         case 25: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 26: return new ca.uhn.hl7v2.model.v26.datatype.ID(getMessage(), new Integer(480));
         case 27: return new ca.uhn.hl7v2.model.v26.datatype.NM(getMessage());
         case 28: return new ca.uhn.hl7v2.model.v26.datatype.EI(getMessage());
         case 29: return new ca.uhn.hl7v2.model.v26.datatype.EI(getMessage());
         case 30: return new ca.uhn.hl7v2.model.v26.datatype.CNE(getMessage());
         case 31: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 32: return new ca.uhn.hl7v2.model.v26.datatype.XAD(getMessage());
         case 33: return new ca.uhn.hl7v2.model.v26.datatype.PL(getMessage());
         case 34: return new ca.uhn.hl7v2.model.v26.datatype.XAD(getMessage());
         default: return null;
      }
   }

}