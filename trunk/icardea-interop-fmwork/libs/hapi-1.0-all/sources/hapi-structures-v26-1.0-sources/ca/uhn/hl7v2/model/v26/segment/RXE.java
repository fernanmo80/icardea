package ca.uhn.hl7v2.model.v26.segment;

import ca.uhn.hl7v2.model.*;
import ca.uhn.hl7v2.model.v26.datatype.*;
import ca.uhn.log.HapiLogFactory;
import ca.uhn.hl7v2.parser.ModelClassFactory;
import ca.uhn.hl7v2.HL7Exception;

/**
 * <p>Represents an HL7 RXE message segment. 
 * This segment has the following fields:</p><p>
 * RXE-1: Quantity/Timing (TQ)<br> 
 * RXE-2: Give Code (CWE)<br> 
 * RXE-3: Give Amount - Minimum (NM)<br> 
 * RXE-4: Give Amount - Maximum (NM)<br> 
 * RXE-5: Give Units (CWE)<br> 
 * RXE-6: Give Dosage Form (CWE)<br> 
 * RXE-7: Provider's Administration Instructions (CWE)<br> 
 * RXE-8: Deliver-To Location (LA1)<br> 
 * RXE-9: Substitution Status (ID)<br> 
 * RXE-10: Dispense Amount (NM)<br> 
 * RXE-11: Dispense Units (CWE)<br> 
 * RXE-12: Number Of Refills (NM)<br> 
 * RXE-13: Ordering Provider's DEA Number (XCN)<br> 
 * RXE-14: Pharmacist/Treatment Supplier's Verifier ID (XCN)<br> 
 * RXE-15: Prescription Number (ST)<br> 
 * RXE-16: Number of Refills Remaining (NM)<br> 
 * RXE-17: Number of Refills/Doses Dispensed (NM)<br> 
 * RXE-18: D/T of Most Recent Refill or Dose Dispensed (DTM)<br> 
 * RXE-19: Total Daily Dose (CQ)<br> 
 * RXE-20: Needs Human Review (ID)<br> 
 * RXE-21: Pharmacy/Treatment Supplier's Special Dispensing Instructions (CWE)<br> 
 * RXE-22: Give Per (Time Unit) (ST)<br> 
 * RXE-23: Give Rate Amount (ST)<br> 
 * RXE-24: Give Rate Units (CWE)<br> 
 * RXE-25: Give Strength (NM)<br> 
 * RXE-26: Give Strength Units (CWE)<br> 
 * RXE-27: Give Indication (CWE)<br> 
 * RXE-28: Dispense Package Size (NM)<br> 
 * RXE-29: Dispense Package Size Unit (CWE)<br> 
 * RXE-30: Dispense Package Method (ID)<br> 
 * RXE-31: Supplementary Code (CWE)<br> 
 * RXE-32: Original Order Date/Time (DTM)<br> 
 * RXE-33: Give Drug Strength Volume (NM)<br> 
 * RXE-34: Give Drug Strength Volume Units (CWE)<br> 
 * RXE-35: Controlled Substance Schedule (CWE)<br> 
 * RXE-36: Formulary Status (ID)<br> 
 * RXE-37: Pharmaceutical Substance Alternative (CWE)<br> 
 * RXE-38: Pharmacy of Most Recent Fill (CWE)<br> 
 * RXE-39: Initial Dispense Amount (NM)<br> 
 * RXE-40: Dispensing Pharmacy (CWE)<br> 
 * RXE-41: Dispensing Pharmacy Address (XAD)<br> 
 * RXE-42: Deliver-to Patient Location (PL)<br> 
 * RXE-43: Deliver-to Address (XAD)<br> 
 * RXE-44: Pharmacy Order Type (ID)<br> 
 * </p><p>The get...() methods return data from individual fields.  These methods 
 * do not throw exceptions and may therefore have to handle exceptions internally.  
 * If an exception is handled internally, it is logged and null is returned.  
 * This is not expected to happen - if it does happen this indicates not so much 
 * an exceptional circumstance as a bug in the code for this class.</p>    
 */
public class RXE extends AbstractSegment  {

  /**
   * Creates a RXE (Pharmacy/Treatment Encoded Order) segment object that belongs to the given 
   * message.  
   */
  public RXE(Group parent, ModelClassFactory factory) {
    super(parent, factory);
    Message message = getMessage();
    try {
       this.add(TQ.class, false, 1, 0, new Object[]{message}, "Quantity/Timing");
       this.add(CWE.class, true, 1, 250, new Object[]{message}, "Give Code");
       this.add(NM.class, true, 1, 20, new Object[]{message}, "Give Amount - Minimum");
       this.add(NM.class, false, 1, 20, new Object[]{message}, "Give Amount - Maximum");
       this.add(CWE.class, true, 1, 250, new Object[]{message}, "Give Units");
       this.add(CWE.class, false, 1, 250, new Object[]{message}, "Give Dosage Form");
       this.add(CWE.class, false, 0, 250, new Object[]{message}, "Provider's Administration Instructions");
       this.add(LA1.class, false, 1, 0, new Object[]{message}, "Deliver-To Location");
       this.add(ID.class, false, 1, 1, new Object[]{message, new Integer(167)}, "Substitution Status");
       this.add(NM.class, false, 1, 20, new Object[]{message}, "Dispense Amount");
       this.add(CWE.class, false, 1, 250, new Object[]{message}, "Dispense Units");
       this.add(NM.class, false, 1, 3, new Object[]{message}, "Number Of Refills");
       this.add(XCN.class, false, 0, 250, new Object[]{message}, "Ordering Provider's DEA Number");
       this.add(XCN.class, false, 0, 250, new Object[]{message}, "Pharmacist/Treatment Supplier's Verifier ID");
       this.add(ST.class, false, 1, 20, new Object[]{message}, "Prescription Number");
       this.add(NM.class, false, 1, 20, new Object[]{message}, "Number of Refills Remaining");
       this.add(NM.class, false, 1, 20, new Object[]{message}, "Number of Refills/Doses Dispensed");
       this.add(DTM.class, false, 1, 24, new Object[]{message}, "D/T of Most Recent Refill or Dose Dispensed");
       this.add(CQ.class, false, 1, 10, new Object[]{message}, "Total Daily Dose");
       this.add(ID.class, false, 1, 1, new Object[]{message, new Integer(136)}, "Needs Human Review");
       this.add(CWE.class, false, 0, 250, new Object[]{message}, "Pharmacy/Treatment Supplier's Special Dispensing Instructions");
       this.add(ST.class, false, 1, 20, new Object[]{message}, "Give Per (Time Unit)");
       this.add(ST.class, false, 1, 6, new Object[]{message}, "Give Rate Amount");
       this.add(CWE.class, false, 1, 250, new Object[]{message}, "Give Rate Units");
       this.add(NM.class, false, 1, 20, new Object[]{message}, "Give Strength");
       this.add(CWE.class, false, 1, 250, new Object[]{message}, "Give Strength Units");
       this.add(CWE.class, false, 0, 250, new Object[]{message}, "Give Indication");
       this.add(NM.class, false, 1, 20, new Object[]{message}, "Dispense Package Size");
       this.add(CWE.class, false, 1, 250, new Object[]{message}, "Dispense Package Size Unit");
       this.add(ID.class, false, 1, 2, new Object[]{message, new Integer(321)}, "Dispense Package Method");
       this.add(CWE.class, false, 0, 250, new Object[]{message}, "Supplementary Code");
       this.add(DTM.class, false, 1, 24, new Object[]{message}, "Original Order Date/Time");
       this.add(NM.class, false, 1, 5, new Object[]{message}, "Give Drug Strength Volume");
       this.add(CWE.class, false, 1, 250, new Object[]{message}, "Give Drug Strength Volume Units");
       this.add(CWE.class, false, 1, 60, new Object[]{message}, "Controlled Substance Schedule");
       this.add(ID.class, false, 1, 1, new Object[]{message, new Integer(478)}, "Formulary Status");
       this.add(CWE.class, false, 0, 60, new Object[]{message}, "Pharmaceutical Substance Alternative");
       this.add(CWE.class, false, 1, 250, new Object[]{message}, "Pharmacy of Most Recent Fill");
       this.add(NM.class, false, 1, 250, new Object[]{message}, "Initial Dispense Amount");
       this.add(CWE.class, false, 1, 250, new Object[]{message}, "Dispensing Pharmacy");
       this.add(XAD.class, false, 1, 250, new Object[]{message}, "Dispensing Pharmacy Address");
       this.add(PL.class, false, 1, 80, new Object[]{message}, "Deliver-to Patient Location");
       this.add(XAD.class, false, 1, 250, new Object[]{message}, "Deliver-to Address");
       this.add(ID.class, false, 1, 1, new Object[]{message, new Integer(480)}, "Pharmacy Order Type");
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Can't instantiate " + this.getClass().getName(), he);
    }
  }

  /**
   * Returns Quantity/Timing (RXE-1).
   */
  public TQ getQuantityTiming()  {
    TQ ret = null;
    try {
        Type t = this.getField(1, 0);
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
   * Returns Quantity/Timing (RXE-1).
   */
  public TQ getRxe1_QuantityTiming()  {
    TQ ret = null;
    try {
        Type t = this.getField(1, 0);
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
   * Returns Give Code (RXE-2).
   */
  public CWE getGiveCode()  {
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
   * Returns Give Code (RXE-2).
   */
  public CWE getRxe2_GiveCode()  {
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
   * Returns Give Amount - Minimum (RXE-3).
   */
  public NM getGiveAmountMinimum()  {
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
   * Returns Give Amount - Minimum (RXE-3).
   */
  public NM getRxe3_GiveAmountMinimum()  {
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
   * Returns Give Amount - Maximum (RXE-4).
   */
  public NM getGiveAmountMaximum()  {
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
   * Returns Give Amount - Maximum (RXE-4).
   */
  public NM getRxe4_GiveAmountMaximum()  {
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
   * Returns Give Units (RXE-5).
   */
  public CWE getGiveUnits()  {
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
   * Returns Give Units (RXE-5).
   */
  public CWE getRxe5_GiveUnits()  {
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
   * Returns Give Dosage Form (RXE-6).
   */
  public CWE getGiveDosageForm()  {
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
   * Returns Give Dosage Form (RXE-6).
   */
  public CWE getRxe6_GiveDosageForm()  {
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
   * Returns a single repetition of Provider's Administration Instructions (RXE-7).
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
   * Returns all repetitions of Provider's Administration Instructions (RXE-7).
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
   * Returns a count of the number of repetitions of Provider's Administration Instructions (RXE-7).
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
   * Inserts a repetition of Provider's Administration Instructions (RXE-7) at a given index and returns it.
   * @param index The index
   */
  public CWE insertProviderSAdministrationInstructions(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(7, index);
  }

  /**
   * Removes a repetition of Provider's Administration Instructions (RXE-7) at a given index and returns it.
   * @param index The index
   */
  public CWE removeProviderSAdministrationInstructions(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(7, index);
  }

  /**
   * Returns a single repetition of Provider's Administration Instructions (RXE-7).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getRxe7_ProviderSAdministrationInstructions(int rep) throws HL7Exception {
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
   * Returns all repetitions of Provider's Administration Instructions (RXE-7).
   */
  public CWE[] getRxe7_ProviderSAdministrationInstructions() {
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
   * Returns a count of the number of repetitions of Provider's Administration Instructions (RXE-7).
   */
  public int getRxe7_ProviderSAdministrationInstructionsReps() {
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
   * Inserts a repetition of Provider's Administration Instructions (RXE-7) at a given index and returns it.
   * @param index The index
   */
  public CWE insertRxe7_ProviderSAdministrationInstructions(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(7, index);
  }

  /**
   * Removes a repetition of Provider's Administration Instructions (RXE-7) at a given index and returns it.
   * @param index The index
   */
  public CWE removeRxe7_ProviderSAdministrationInstructions(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(7, index);
  }

  /**
   * Returns Deliver-To Location (RXE-8).
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
   * Returns Deliver-To Location (RXE-8).
   */
  public LA1 getRxe8_DeliverToLocation()  {
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
   * Returns Substitution Status (RXE-9).
   */
  public ID getSubstitutionStatus()  {
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
   * Returns Substitution Status (RXE-9).
   */
  public ID getRxe9_SubstitutionStatus()  {
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
   * Returns Dispense Amount (RXE-10).
   */
  public NM getDispenseAmount()  {
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
   * Returns Dispense Amount (RXE-10).
   */
  public NM getRxe10_DispenseAmount()  {
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
   * Returns Dispense Units (RXE-11).
   */
  public CWE getDispenseUnits()  {
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
   * Returns Dispense Units (RXE-11).
   */
  public CWE getRxe11_DispenseUnits()  {
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
   * Returns Number Of Refills (RXE-12).
   */
  public NM getNumberOfRefills()  {
    NM ret = null;
    try {
        Type t = this.getField(12, 0);
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
   * Returns Number Of Refills (RXE-12).
   */
  public NM getRxe12_NumberOfRefills()  {
    NM ret = null;
    try {
        Type t = this.getField(12, 0);
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
   * Returns a single repetition of Ordering Provider's DEA Number (RXE-13).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XCN getOrderingProviderSDEANumber(int rep) throws HL7Exception {
    XCN ret = null;
    try {
        Type t = this.getField(13, rep);
        ret = (XCN)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Ordering Provider's DEA Number (RXE-13).
   */
  public XCN[] getOrderingProviderSDEANumber() {
     XCN[] ret = null;
    try {
        Type[] t = this.getField(13);  
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
   * Returns a count of the number of repetitions of Ordering Provider's DEA Number (RXE-13).
   */
  public int getOrderingProviderSDEANumberReps() {
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
   * Inserts a repetition of Ordering Provider's DEA Number (RXE-13) at a given index and returns it.
   * @param index The index
   */
  public XCN insertOrderingProviderSDEANumber(int index) throws HL7Exception {
     return (XCN) super.insertRepetition(13, index);
  }

  /**
   * Removes a repetition of Ordering Provider's DEA Number (RXE-13) at a given index and returns it.
   * @param index The index
   */
  public XCN removeOrderingProviderSDEANumber(int index) throws HL7Exception {
     return (XCN) super.removeRepetition(13, index);
  }

  /**
   * Returns a single repetition of Ordering Provider's DEA Number (RXE-13).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XCN getRxe13_OrderingProviderSDEANumber(int rep) throws HL7Exception {
    XCN ret = null;
    try {
        Type t = this.getField(13, rep);
        ret = (XCN)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Ordering Provider's DEA Number (RXE-13).
   */
  public XCN[] getRxe13_OrderingProviderSDEANumber() {
     XCN[] ret = null;
    try {
        Type[] t = this.getField(13);  
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
   * Returns a count of the number of repetitions of Ordering Provider's DEA Number (RXE-13).
   */
  public int getRxe13_OrderingProviderSDEANumberReps() {
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
   * Inserts a repetition of Ordering Provider's DEA Number (RXE-13) at a given index and returns it.
   * @param index The index
   */
  public XCN insertRxe13_OrderingProviderSDEANumber(int index) throws HL7Exception {
     return (XCN) super.insertRepetition(13, index);
  }

  /**
   * Removes a repetition of Ordering Provider's DEA Number (RXE-13) at a given index and returns it.
   * @param index The index
   */
  public XCN removeRxe13_OrderingProviderSDEANumber(int index) throws HL7Exception {
     return (XCN) super.removeRepetition(13, index);
  }

  /**
   * Returns a single repetition of Pharmacist/Treatment Supplier's Verifier ID (RXE-14).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XCN getPharmacistTreatmentSupplierSVerifierID(int rep) throws HL7Exception {
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
   * Returns all repetitions of Pharmacist/Treatment Supplier's Verifier ID (RXE-14).
   */
  public XCN[] getPharmacistTreatmentSupplierSVerifierID() {
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
   * Returns a count of the number of repetitions of Pharmacist/Treatment Supplier's Verifier ID (RXE-14).
   */
  public int getPharmacistTreatmentSupplierSVerifierIDReps() {
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
   * Inserts a repetition of Pharmacist/Treatment Supplier's Verifier ID (RXE-14) at a given index and returns it.
   * @param index The index
   */
  public XCN insertPharmacistTreatmentSupplierSVerifierID(int index) throws HL7Exception {
     return (XCN) super.insertRepetition(14, index);
  }

  /**
   * Removes a repetition of Pharmacist/Treatment Supplier's Verifier ID (RXE-14) at a given index and returns it.
   * @param index The index
   */
  public XCN removePharmacistTreatmentSupplierSVerifierID(int index) throws HL7Exception {
     return (XCN) super.removeRepetition(14, index);
  }

  /**
   * Returns a single repetition of Pharmacist/Treatment Supplier's Verifier ID (RXE-14).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XCN getRxe14_PharmacistTreatmentSupplierSVerifierID(int rep) throws HL7Exception {
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
   * Returns all repetitions of Pharmacist/Treatment Supplier's Verifier ID (RXE-14).
   */
  public XCN[] getRxe14_PharmacistTreatmentSupplierSVerifierID() {
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
   * Returns a count of the number of repetitions of Pharmacist/Treatment Supplier's Verifier ID (RXE-14).
   */
  public int getRxe14_PharmacistTreatmentSupplierSVerifierIDReps() {
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
   * Inserts a repetition of Pharmacist/Treatment Supplier's Verifier ID (RXE-14) at a given index and returns it.
   * @param index The index
   */
  public XCN insertRxe14_PharmacistTreatmentSupplierSVerifierID(int index) throws HL7Exception {
     return (XCN) super.insertRepetition(14, index);
  }

  /**
   * Removes a repetition of Pharmacist/Treatment Supplier's Verifier ID (RXE-14) at a given index and returns it.
   * @param index The index
   */
  public XCN removeRxe14_PharmacistTreatmentSupplierSVerifierID(int index) throws HL7Exception {
     return (XCN) super.removeRepetition(14, index);
  }

  /**
   * Returns Prescription Number (RXE-15).
   */
  public ST getPrescriptionNumber()  {
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
   * Returns Prescription Number (RXE-15).
   */
  public ST getRxe15_PrescriptionNumber()  {
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
   * Returns Number of Refills Remaining (RXE-16).
   */
  public NM getNumberOfRefillsRemaining()  {
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
   * Returns Number of Refills Remaining (RXE-16).
   */
  public NM getRxe16_NumberOfRefillsRemaining()  {
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
   * Returns Number of Refills/Doses Dispensed (RXE-17).
   */
  public NM getNumberOfRefillsDosesDispensed()  {
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
   * Returns Number of Refills/Doses Dispensed (RXE-17).
   */
  public NM getRxe17_NumberOfRefillsDosesDispensed()  {
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
   * Returns D/T of Most Recent Refill or Dose Dispensed (RXE-18).
   */
  public DTM getDTOfMostRecentRefillOrDoseDispensed()  {
    DTM ret = null;
    try {
        Type t = this.getField(18, 0);
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
   * Returns D/T of Most Recent Refill or Dose Dispensed (RXE-18).
   */
  public DTM getRxe18_DTOfMostRecentRefillOrDoseDispensed()  {
    DTM ret = null;
    try {
        Type t = this.getField(18, 0);
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
   * Returns Total Daily Dose (RXE-19).
   */
  public CQ getTotalDailyDose()  {
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
   * Returns Total Daily Dose (RXE-19).
   */
  public CQ getRxe19_TotalDailyDose()  {
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
   * Returns Needs Human Review (RXE-20).
   */
  public ID getNeedsHumanReview()  {
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
   * Returns Needs Human Review (RXE-20).
   */
  public ID getRxe20_NeedsHumanReview()  {
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
   * Returns a single repetition of Pharmacy/Treatment Supplier's Special Dispensing Instructions (RXE-21).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getPharmacyTreatmentSupplierSSpecialDispensingInstructions(int rep) throws HL7Exception {
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
   * Returns all repetitions of Pharmacy/Treatment Supplier's Special Dispensing Instructions (RXE-21).
   */
  public CWE[] getPharmacyTreatmentSupplierSSpecialDispensingInstructions() {
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
   * Returns a count of the number of repetitions of Pharmacy/Treatment Supplier's Special Dispensing Instructions (RXE-21).
   */
  public int getPharmacyTreatmentSupplierSSpecialDispensingInstructionsReps() {
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
   * Inserts a repetition of Pharmacy/Treatment Supplier's Special Dispensing Instructions (RXE-21) at a given index and returns it.
   * @param index The index
   */
  public CWE insertPharmacyTreatmentSupplierSSpecialDispensingInstructions(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(21, index);
  }

  /**
   * Removes a repetition of Pharmacy/Treatment Supplier's Special Dispensing Instructions (RXE-21) at a given index and returns it.
   * @param index The index
   */
  public CWE removePharmacyTreatmentSupplierSSpecialDispensingInstructions(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(21, index);
  }

  /**
   * Returns a single repetition of Pharmacy/Treatment Supplier's Special Dispensing Instructions (RXE-21).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getRxe21_PharmacyTreatmentSupplierSSpecialDispensingInstructions(int rep) throws HL7Exception {
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
   * Returns all repetitions of Pharmacy/Treatment Supplier's Special Dispensing Instructions (RXE-21).
   */
  public CWE[] getRxe21_PharmacyTreatmentSupplierSSpecialDispensingInstructions() {
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
   * Returns a count of the number of repetitions of Pharmacy/Treatment Supplier's Special Dispensing Instructions (RXE-21).
   */
  public int getRxe21_PharmacyTreatmentSupplierSSpecialDispensingInstructionsReps() {
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
   * Inserts a repetition of Pharmacy/Treatment Supplier's Special Dispensing Instructions (RXE-21) at a given index and returns it.
   * @param index The index
   */
  public CWE insertRxe21_PharmacyTreatmentSupplierSSpecialDispensingInstructions(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(21, index);
  }

  /**
   * Removes a repetition of Pharmacy/Treatment Supplier's Special Dispensing Instructions (RXE-21) at a given index and returns it.
   * @param index The index
   */
  public CWE removeRxe21_PharmacyTreatmentSupplierSSpecialDispensingInstructions(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(21, index);
  }

  /**
   * Returns Give Per (Time Unit) (RXE-22).
   */
  public ST getGivePerTimeUnit()  {
    ST ret = null;
    try {
        Type t = this.getField(22, 0);
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
   * Returns Give Per (Time Unit) (RXE-22).
   */
  public ST getRxe22_GivePerTimeUnit()  {
    ST ret = null;
    try {
        Type t = this.getField(22, 0);
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
   * Returns Give Rate Amount (RXE-23).
   */
  public ST getGiveRateAmount()  {
    ST ret = null;
    try {
        Type t = this.getField(23, 0);
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
   * Returns Give Rate Amount (RXE-23).
   */
  public ST getRxe23_GiveRateAmount()  {
    ST ret = null;
    try {
        Type t = this.getField(23, 0);
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
   * Returns Give Rate Units (RXE-24).
   */
  public CWE getGiveRateUnits()  {
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
   * Returns Give Rate Units (RXE-24).
   */
  public CWE getRxe24_GiveRateUnits()  {
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
   * Returns Give Strength (RXE-25).
   */
  public NM getGiveStrength()  {
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
   * Returns Give Strength (RXE-25).
   */
  public NM getRxe25_GiveStrength()  {
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
   * Returns Give Strength Units (RXE-26).
   */
  public CWE getGiveStrengthUnits()  {
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
   * Returns Give Strength Units (RXE-26).
   */
  public CWE getRxe26_GiveStrengthUnits()  {
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
   * Returns a single repetition of Give Indication (RXE-27).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getGiveIndication(int rep) throws HL7Exception {
    CWE ret = null;
    try {
        Type t = this.getField(27, rep);
        ret = (CWE)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Give Indication (RXE-27).
   */
  public CWE[] getGiveIndication() {
     CWE[] ret = null;
    try {
        Type[] t = this.getField(27);  
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
   * Returns a count of the number of repetitions of Give Indication (RXE-27).
   */
  public int getGiveIndicationReps() {
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
   * Inserts a repetition of Give Indication (RXE-27) at a given index and returns it.
   * @param index The index
   */
  public CWE insertGiveIndication(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(27, index);
  }

  /**
   * Removes a repetition of Give Indication (RXE-27) at a given index and returns it.
   * @param index The index
   */
  public CWE removeGiveIndication(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(27, index);
  }

  /**
   * Returns a single repetition of Give Indication (RXE-27).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getRxe27_GiveIndication(int rep) throws HL7Exception {
    CWE ret = null;
    try {
        Type t = this.getField(27, rep);
        ret = (CWE)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Give Indication (RXE-27).
   */
  public CWE[] getRxe27_GiveIndication() {
     CWE[] ret = null;
    try {
        Type[] t = this.getField(27);  
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
   * Returns a count of the number of repetitions of Give Indication (RXE-27).
   */
  public int getRxe27_GiveIndicationReps() {
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
   * Inserts a repetition of Give Indication (RXE-27) at a given index and returns it.
   * @param index The index
   */
  public CWE insertRxe27_GiveIndication(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(27, index);
  }

  /**
   * Removes a repetition of Give Indication (RXE-27) at a given index and returns it.
   * @param index The index
   */
  public CWE removeRxe27_GiveIndication(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(27, index);
  }

  /**
   * Returns Dispense Package Size (RXE-28).
   */
  public NM getDispensePackageSize()  {
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
   * Returns Dispense Package Size (RXE-28).
   */
  public NM getRxe28_DispensePackageSize()  {
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
   * Returns Dispense Package Size Unit (RXE-29).
   */
  public CWE getDispensePackageSizeUnit()  {
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
   * Returns Dispense Package Size Unit (RXE-29).
   */
  public CWE getRxe29_DispensePackageSizeUnit()  {
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
   * Returns Dispense Package Method (RXE-30).
   */
  public ID getDispensePackageMethod()  {
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
   * Returns Dispense Package Method (RXE-30).
   */
  public ID getRxe30_DispensePackageMethod()  {
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
   * Returns a single repetition of Supplementary Code (RXE-31).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getSupplementaryCode(int rep) throws HL7Exception {
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
   * Returns all repetitions of Supplementary Code (RXE-31).
   */
  public CWE[] getSupplementaryCode() {
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
   * Returns a count of the number of repetitions of Supplementary Code (RXE-31).
   */
  public int getSupplementaryCodeReps() {
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
   * Inserts a repetition of Supplementary Code (RXE-31) at a given index and returns it.
   * @param index The index
   */
  public CWE insertSupplementaryCode(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(31, index);
  }

  /**
   * Removes a repetition of Supplementary Code (RXE-31) at a given index and returns it.
   * @param index The index
   */
  public CWE removeSupplementaryCode(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(31, index);
  }

  /**
   * Returns a single repetition of Supplementary Code (RXE-31).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getRxe31_SupplementaryCode(int rep) throws HL7Exception {
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
   * Returns all repetitions of Supplementary Code (RXE-31).
   */
  public CWE[] getRxe31_SupplementaryCode() {
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
   * Returns a count of the number of repetitions of Supplementary Code (RXE-31).
   */
  public int getRxe31_SupplementaryCodeReps() {
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
   * Inserts a repetition of Supplementary Code (RXE-31) at a given index and returns it.
   * @param index The index
   */
  public CWE insertRxe31_SupplementaryCode(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(31, index);
  }

  /**
   * Removes a repetition of Supplementary Code (RXE-31) at a given index and returns it.
   * @param index The index
   */
  public CWE removeRxe31_SupplementaryCode(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(31, index);
  }

  /**
   * Returns Original Order Date/Time (RXE-32).
   */
  public DTM getOriginalOrderDateTime()  {
    DTM ret = null;
    try {
        Type t = this.getField(32, 0);
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
   * Returns Original Order Date/Time (RXE-32).
   */
  public DTM getRxe32_OriginalOrderDateTime()  {
    DTM ret = null;
    try {
        Type t = this.getField(32, 0);
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
   * Returns Give Drug Strength Volume (RXE-33).
   */
  public NM getGiveDrugStrengthVolume()  {
    NM ret = null;
    try {
        Type t = this.getField(33, 0);
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
   * Returns Give Drug Strength Volume (RXE-33).
   */
  public NM getRxe33_GiveDrugStrengthVolume()  {
    NM ret = null;
    try {
        Type t = this.getField(33, 0);
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
   * Returns Give Drug Strength Volume Units (RXE-34).
   */
  public CWE getGiveDrugStrengthVolumeUnits()  {
    CWE ret = null;
    try {
        Type t = this.getField(34, 0);
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
   * Returns Give Drug Strength Volume Units (RXE-34).
   */
  public CWE getRxe34_GiveDrugStrengthVolumeUnits()  {
    CWE ret = null;
    try {
        Type t = this.getField(34, 0);
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
   * Returns Controlled Substance Schedule (RXE-35).
   */
  public CWE getControlledSubstanceSchedule()  {
    CWE ret = null;
    try {
        Type t = this.getField(35, 0);
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
   * Returns Controlled Substance Schedule (RXE-35).
   */
  public CWE getRxe35_ControlledSubstanceSchedule()  {
    CWE ret = null;
    try {
        Type t = this.getField(35, 0);
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
   * Returns Formulary Status (RXE-36).
   */
  public ID getFormularyStatus()  {
    ID ret = null;
    try {
        Type t = this.getField(36, 0);
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
   * Returns Formulary Status (RXE-36).
   */
  public ID getRxe36_FormularyStatus()  {
    ID ret = null;
    try {
        Type t = this.getField(36, 0);
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
   * Returns a single repetition of Pharmaceutical Substance Alternative (RXE-37).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getPharmaceuticalSubstanceAlternative(int rep) throws HL7Exception {
    CWE ret = null;
    try {
        Type t = this.getField(37, rep);
        ret = (CWE)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Pharmaceutical Substance Alternative (RXE-37).
   */
  public CWE[] getPharmaceuticalSubstanceAlternative() {
     CWE[] ret = null;
    try {
        Type[] t = this.getField(37);  
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
   * Returns a count of the number of repetitions of Pharmaceutical Substance Alternative (RXE-37).
   */
  public int getPharmaceuticalSubstanceAlternativeReps() {
    try {
        return this.getField(37).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Pharmaceutical Substance Alternative (RXE-37) at a given index and returns it.
   * @param index The index
   */
  public CWE insertPharmaceuticalSubstanceAlternative(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(37, index);
  }

  /**
   * Removes a repetition of Pharmaceutical Substance Alternative (RXE-37) at a given index and returns it.
   * @param index The index
   */
  public CWE removePharmaceuticalSubstanceAlternative(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(37, index);
  }

  /**
   * Returns a single repetition of Pharmaceutical Substance Alternative (RXE-37).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getRxe37_PharmaceuticalSubstanceAlternative(int rep) throws HL7Exception {
    CWE ret = null;
    try {
        Type t = this.getField(37, rep);
        ret = (CWE)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Pharmaceutical Substance Alternative (RXE-37).
   */
  public CWE[] getRxe37_PharmaceuticalSubstanceAlternative() {
     CWE[] ret = null;
    try {
        Type[] t = this.getField(37);  
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
   * Returns a count of the number of repetitions of Pharmaceutical Substance Alternative (RXE-37).
   */
  public int getRxe37_PharmaceuticalSubstanceAlternativeReps() {
    try {
        return this.getField(37).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Pharmaceutical Substance Alternative (RXE-37) at a given index and returns it.
   * @param index The index
   */
  public CWE insertRxe37_PharmaceuticalSubstanceAlternative(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(37, index);
  }

  /**
   * Removes a repetition of Pharmaceutical Substance Alternative (RXE-37) at a given index and returns it.
   * @param index The index
   */
  public CWE removeRxe37_PharmaceuticalSubstanceAlternative(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(37, index);
  }

  /**
   * Returns Pharmacy of Most Recent Fill (RXE-38).
   */
  public CWE getPharmacyOfMostRecentFill()  {
    CWE ret = null;
    try {
        Type t = this.getField(38, 0);
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
   * Returns Pharmacy of Most Recent Fill (RXE-38).
   */
  public CWE getRxe38_PharmacyOfMostRecentFill()  {
    CWE ret = null;
    try {
        Type t = this.getField(38, 0);
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
   * Returns Initial Dispense Amount (RXE-39).
   */
  public NM getInitialDispenseAmount()  {
    NM ret = null;
    try {
        Type t = this.getField(39, 0);
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
   * Returns Initial Dispense Amount (RXE-39).
   */
  public NM getRxe39_InitialDispenseAmount()  {
    NM ret = null;
    try {
        Type t = this.getField(39, 0);
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
   * Returns Dispensing Pharmacy (RXE-40).
   */
  public CWE getDispensingPharmacy()  {
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
   * Returns Dispensing Pharmacy (RXE-40).
   */
  public CWE getRxe40_DispensingPharmacy()  {
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
   * Returns Dispensing Pharmacy Address (RXE-41).
   */
  public XAD getDispensingPharmacyAddress()  {
    XAD ret = null;
    try {
        Type t = this.getField(41, 0);
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
   * Returns Dispensing Pharmacy Address (RXE-41).
   */
  public XAD getRxe41_DispensingPharmacyAddress()  {
    XAD ret = null;
    try {
        Type t = this.getField(41, 0);
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
   * Returns Deliver-to Patient Location (RXE-42).
   */
  public PL getDeliverToPatientLocation()  {
    PL ret = null;
    try {
        Type t = this.getField(42, 0);
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
   * Returns Deliver-to Patient Location (RXE-42).
   */
  public PL getRxe42_DeliverToPatientLocation()  {
    PL ret = null;
    try {
        Type t = this.getField(42, 0);
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
   * Returns Deliver-to Address (RXE-43).
   */
  public XAD getDeliverToAddress()  {
    XAD ret = null;
    try {
        Type t = this.getField(43, 0);
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
   * Returns Deliver-to Address (RXE-43).
   */
  public XAD getRxe43_DeliverToAddress()  {
    XAD ret = null;
    try {
        Type t = this.getField(43, 0);
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
   * Returns Pharmacy Order Type (RXE-44).
   */
  public ID getPharmacyOrderType()  {
    ID ret = null;
    try {
        Type t = this.getField(44, 0);
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
   * Returns Pharmacy Order Type (RXE-44).
   */
  public ID getRxe44_PharmacyOrderType()  {
    ID ret = null;
    try {
        Type t = this.getField(44, 0);
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
         case 0: return new ca.uhn.hl7v2.model.v26.datatype.TQ(getMessage());
         case 1: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 2: return new ca.uhn.hl7v2.model.v26.datatype.NM(getMessage());
         case 3: return new ca.uhn.hl7v2.model.v26.datatype.NM(getMessage());
         case 4: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 5: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 6: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 7: return new ca.uhn.hl7v2.model.v26.datatype.LA1(getMessage());
         case 8: return new ca.uhn.hl7v2.model.v26.datatype.ID(getMessage(), new Integer(167));
         case 9: return new ca.uhn.hl7v2.model.v26.datatype.NM(getMessage());
         case 10: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 11: return new ca.uhn.hl7v2.model.v26.datatype.NM(getMessage());
         case 12: return new ca.uhn.hl7v2.model.v26.datatype.XCN(getMessage());
         case 13: return new ca.uhn.hl7v2.model.v26.datatype.XCN(getMessage());
         case 14: return new ca.uhn.hl7v2.model.v26.datatype.ST(getMessage());
         case 15: return new ca.uhn.hl7v2.model.v26.datatype.NM(getMessage());
         case 16: return new ca.uhn.hl7v2.model.v26.datatype.NM(getMessage());
         case 17: return new ca.uhn.hl7v2.model.v26.datatype.DTM(getMessage());
         case 18: return new ca.uhn.hl7v2.model.v26.datatype.CQ(getMessage());
         case 19: return new ca.uhn.hl7v2.model.v26.datatype.ID(getMessage(), new Integer(136));
         case 20: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 21: return new ca.uhn.hl7v2.model.v26.datatype.ST(getMessage());
         case 22: return new ca.uhn.hl7v2.model.v26.datatype.ST(getMessage());
         case 23: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 24: return new ca.uhn.hl7v2.model.v26.datatype.NM(getMessage());
         case 25: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 26: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 27: return new ca.uhn.hl7v2.model.v26.datatype.NM(getMessage());
         case 28: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 29: return new ca.uhn.hl7v2.model.v26.datatype.ID(getMessage(), new Integer(321));
         case 30: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 31: return new ca.uhn.hl7v2.model.v26.datatype.DTM(getMessage());
         case 32: return new ca.uhn.hl7v2.model.v26.datatype.NM(getMessage());
         case 33: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 34: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 35: return new ca.uhn.hl7v2.model.v26.datatype.ID(getMessage(), new Integer(478));
         case 36: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 37: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 38: return new ca.uhn.hl7v2.model.v26.datatype.NM(getMessage());
         case 39: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 40: return new ca.uhn.hl7v2.model.v26.datatype.XAD(getMessage());
         case 41: return new ca.uhn.hl7v2.model.v26.datatype.PL(getMessage());
         case 42: return new ca.uhn.hl7v2.model.v26.datatype.XAD(getMessage());
         case 43: return new ca.uhn.hl7v2.model.v26.datatype.ID(getMessage(), new Integer(480));
         default: return null;
      }
   }

}