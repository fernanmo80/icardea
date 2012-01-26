package ca.uhn.hl7v2.model.v26.segment;

import ca.uhn.hl7v2.model.*;
import ca.uhn.hl7v2.model.v26.datatype.*;
import ca.uhn.log.HapiLogFactory;
import ca.uhn.hl7v2.parser.ModelClassFactory;
import ca.uhn.hl7v2.HL7Exception;

/**
 * <p>Represents an HL7 RXA message segment. 
 * This segment has the following fields:</p><p>
 * RXA-1: Give Sub-ID Counter (NM)<br> 
 * RXA-2: Administration Sub-ID Counter (NM)<br> 
 * RXA-3: Date/Time Start of Administration (DTM)<br> 
 * RXA-4: Date/Time End of Administration (DTM)<br> 
 * RXA-5: Administered Code (CWE)<br> 
 * RXA-6: Administered Amount (NM)<br> 
 * RXA-7: Administered Units (CWE)<br> 
 * RXA-8: Administered Dosage Form (CWE)<br> 
 * RXA-9: Administration Notes (CWE)<br> 
 * RXA-10: Administering Provider (XCN)<br> 
 * RXA-11: Administered-at Location (LA2)<br> 
 * RXA-12: Administered Per (Time Unit) (ST)<br> 
 * RXA-13: Administered Strength (NM)<br> 
 * RXA-14: Administered Strength Units (CWE)<br> 
 * RXA-15: Substance Lot Number (ST)<br> 
 * RXA-16: Substance Expiration Date (DTM)<br> 
 * RXA-17: Substance Manufacturer Name (CWE)<br> 
 * RXA-18: Substance/Treatment Refusal Reason (CWE)<br> 
 * RXA-19: Indication (CWE)<br> 
 * RXA-20: Completion Status (ID)<br> 
 * RXA-21: Action Code - RXA (ID)<br> 
 * RXA-22: System Entry Date/Time (DTM)<br> 
 * RXA-23: Administered Drug Strength Volume (NM)<br> 
 * RXA-24: Administered Drug Strength Volume Units (CWE)<br> 
 * RXA-25: Administered Barcode Identifier (CWE)<br> 
 * RXA-26: Pharmacy Order Type (ID)<br> 
 * RXA-27: Administer-at (PL)<br> 
 * RXA-28: Administered-at Address (XAD)<br> 
 * </p><p>The get...() methods return data from individual fields.  These methods 
 * do not throw exceptions and may therefore have to handle exceptions internally.  
 * If an exception is handled internally, it is logged and null is returned.  
 * This is not expected to happen - if it does happen this indicates not so much 
 * an exceptional circumstance as a bug in the code for this class.</p>    
 */
public class RXA extends AbstractSegment  {

  /**
   * Creates a RXA (Pharmacy/Treatment Administration) segment object that belongs to the given 
   * message.  
   */
  public RXA(Group parent, ModelClassFactory factory) {
    super(parent, factory);
    Message message = getMessage();
    try {
       this.add(NM.class, true, 1, 4, new Object[]{message}, "Give Sub-ID Counter");
       this.add(NM.class, true, 1, 4, new Object[]{message}, "Administration Sub-ID Counter");
       this.add(DTM.class, true, 1, 24, new Object[]{message}, "Date/Time Start of Administration");
       this.add(DTM.class, true, 1, 24, new Object[]{message}, "Date/Time End of Administration");
       this.add(CWE.class, true, 1, 250, new Object[]{message}, "Administered Code");
       this.add(NM.class, true, 1, 20, new Object[]{message}, "Administered Amount");
       this.add(CWE.class, false, 1, 250, new Object[]{message}, "Administered Units");
       this.add(CWE.class, false, 1, 250, new Object[]{message}, "Administered Dosage Form");
       this.add(CWE.class, false, 0, 250, new Object[]{message}, "Administration Notes");
       this.add(XCN.class, false, 0, 250, new Object[]{message}, "Administering Provider");
       this.add(LA2.class, false, 1, 0, new Object[]{message}, "Administered-at Location");
       this.add(ST.class, false, 1, 20, new Object[]{message}, "Administered Per (Time Unit)");
       this.add(NM.class, false, 1, 20, new Object[]{message}, "Administered Strength");
       this.add(CWE.class, false, 1, 250, new Object[]{message}, "Administered Strength Units");
       this.add(ST.class, false, 0, 20, new Object[]{message}, "Substance Lot Number");
       this.add(DTM.class, false, 0, 24, new Object[]{message}, "Substance Expiration Date");
       this.add(CWE.class, false, 0, 250, new Object[]{message}, "Substance Manufacturer Name");
       this.add(CWE.class, false, 0, 250, new Object[]{message}, "Substance/Treatment Refusal Reason");
       this.add(CWE.class, false, 0, 250, new Object[]{message}, "Indication");
       this.add(ID.class, false, 1, 2, new Object[]{message, new Integer(322)}, "Completion Status");
       this.add(ID.class, false, 1, 2, new Object[]{message, new Integer(206)}, "Action Code - RXA");
       this.add(DTM.class, false, 1, 24, new Object[]{message}, "System Entry Date/Time");
       this.add(NM.class, false, 1, 5, new Object[]{message}, "Administered Drug Strength Volume");
       this.add(CWE.class, false, 1, 250, new Object[]{message}, "Administered Drug Strength Volume Units");
       this.add(CWE.class, false, 1, 60, new Object[]{message}, "Administered Barcode Identifier");
       this.add(ID.class, false, 1, 1, new Object[]{message, new Integer(480)}, "Pharmacy Order Type");
       this.add(PL.class, false, 1, 180, new Object[]{message}, "Administer-at");
       this.add(XAD.class, false, 1, 106, new Object[]{message}, "Administered-at Address");
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Can't instantiate " + this.getClass().getName(), he);
    }
  }

  /**
   * Returns Give Sub-ID Counter (RXA-1).
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
   * Returns Give Sub-ID Counter (RXA-1).
   */
  public NM getRxa1_GiveSubIDCounter()  {
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
   * Returns Administration Sub-ID Counter (RXA-2).
   */
  public NM getAdministrationSubIDCounter()  {
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
   * Returns Administration Sub-ID Counter (RXA-2).
   */
  public NM getRxa2_AdministrationSubIDCounter()  {
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
   * Returns Date/Time Start of Administration (RXA-3).
   */
  public DTM getDateTimeStartOfAdministration()  {
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
   * Returns Date/Time Start of Administration (RXA-3).
   */
  public DTM getRxa3_DateTimeStartOfAdministration()  {
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
   * Returns Date/Time End of Administration (RXA-4).
   */
  public DTM getDateTimeEndOfAdministration()  {
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
   * Returns Date/Time End of Administration (RXA-4).
   */
  public DTM getRxa4_DateTimeEndOfAdministration()  {
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
   * Returns Administered Code (RXA-5).
   */
  public CWE getAdministeredCode()  {
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
   * Returns Administered Code (RXA-5).
   */
  public CWE getRxa5_AdministeredCode()  {
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
   * Returns Administered Amount (RXA-6).
   */
  public NM getAdministeredAmount()  {
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
   * Returns Administered Amount (RXA-6).
   */
  public NM getRxa6_AdministeredAmount()  {
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
   * Returns Administered Units (RXA-7).
   */
  public CWE getAdministeredUnits()  {
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
   * Returns Administered Units (RXA-7).
   */
  public CWE getRxa7_AdministeredUnits()  {
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
   * Returns Administered Dosage Form (RXA-8).
   */
  public CWE getAdministeredDosageForm()  {
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
   * Returns Administered Dosage Form (RXA-8).
   */
  public CWE getRxa8_AdministeredDosageForm()  {
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
   * Returns a single repetition of Administration Notes (RXA-9).
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
   * Returns all repetitions of Administration Notes (RXA-9).
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
   * Returns a count of the number of repetitions of Administration Notes (RXA-9).
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
   * Inserts a repetition of Administration Notes (RXA-9) at a given index and returns it.
   * @param index The index
   */
  public CWE insertAdministrationNotes(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(9, index);
  }

  /**
   * Removes a repetition of Administration Notes (RXA-9) at a given index and returns it.
   * @param index The index
   */
  public CWE removeAdministrationNotes(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(9, index);
  }

  /**
   * Returns a single repetition of Administration Notes (RXA-9).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getRxa9_AdministrationNotes(int rep) throws HL7Exception {
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
   * Returns all repetitions of Administration Notes (RXA-9).
   */
  public CWE[] getRxa9_AdministrationNotes() {
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
   * Returns a count of the number of repetitions of Administration Notes (RXA-9).
   */
  public int getRxa9_AdministrationNotesReps() {
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
   * Inserts a repetition of Administration Notes (RXA-9) at a given index and returns it.
   * @param index The index
   */
  public CWE insertRxa9_AdministrationNotes(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(9, index);
  }

  /**
   * Removes a repetition of Administration Notes (RXA-9) at a given index and returns it.
   * @param index The index
   */
  public CWE removeRxa9_AdministrationNotes(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(9, index);
  }

  /**
   * Returns a single repetition of Administering Provider (RXA-10).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XCN getAdministeringProvider(int rep) throws HL7Exception {
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
   * Returns all repetitions of Administering Provider (RXA-10).
   */
  public XCN[] getAdministeringProvider() {
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
   * Returns a count of the number of repetitions of Administering Provider (RXA-10).
   */
  public int getAdministeringProviderReps() {
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
   * Inserts a repetition of Administering Provider (RXA-10) at a given index and returns it.
   * @param index The index
   */
  public XCN insertAdministeringProvider(int index) throws HL7Exception {
     return (XCN) super.insertRepetition(10, index);
  }

  /**
   * Removes a repetition of Administering Provider (RXA-10) at a given index and returns it.
   * @param index The index
   */
  public XCN removeAdministeringProvider(int index) throws HL7Exception {
     return (XCN) super.removeRepetition(10, index);
  }

  /**
   * Returns a single repetition of Administering Provider (RXA-10).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XCN getRxa10_AdministeringProvider(int rep) throws HL7Exception {
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
   * Returns all repetitions of Administering Provider (RXA-10).
   */
  public XCN[] getRxa10_AdministeringProvider() {
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
   * Returns a count of the number of repetitions of Administering Provider (RXA-10).
   */
  public int getRxa10_AdministeringProviderReps() {
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
   * Inserts a repetition of Administering Provider (RXA-10) at a given index and returns it.
   * @param index The index
   */
  public XCN insertRxa10_AdministeringProvider(int index) throws HL7Exception {
     return (XCN) super.insertRepetition(10, index);
  }

  /**
   * Removes a repetition of Administering Provider (RXA-10) at a given index and returns it.
   * @param index The index
   */
  public XCN removeRxa10_AdministeringProvider(int index) throws HL7Exception {
     return (XCN) super.removeRepetition(10, index);
  }

  /**
   * Returns Administered-at Location (RXA-11).
   */
  public LA2 getAdministeredAtLocation()  {
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
   * Returns Administered-at Location (RXA-11).
   */
  public LA2 getRxa11_AdministeredAtLocation()  {
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
   * Returns Administered Per (Time Unit) (RXA-12).
   */
  public ST getAdministeredPerTimeUnit()  {
    ST ret = null;
    try {
        Type t = this.getField(12, 0);
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
   * Returns Administered Per (Time Unit) (RXA-12).
   */
  public ST getRxa12_AdministeredPerTimeUnit()  {
    ST ret = null;
    try {
        Type t = this.getField(12, 0);
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
   * Returns Administered Strength (RXA-13).
   */
  public NM getAdministeredStrength()  {
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
   * Returns Administered Strength (RXA-13).
   */
  public NM getRxa13_AdministeredStrength()  {
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
   * Returns Administered Strength Units (RXA-14).
   */
  public CWE getAdministeredStrengthUnits()  {
    CWE ret = null;
    try {
        Type t = this.getField(14, 0);
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
   * Returns Administered Strength Units (RXA-14).
   */
  public CWE getRxa14_AdministeredStrengthUnits()  {
    CWE ret = null;
    try {
        Type t = this.getField(14, 0);
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
   * Returns a single repetition of Substance Lot Number (RXA-15).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public ST getSubstanceLotNumber(int rep) throws HL7Exception {
    ST ret = null;
    try {
        Type t = this.getField(15, rep);
        ret = (ST)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Substance Lot Number (RXA-15).
   */
  public ST[] getSubstanceLotNumber() {
     ST[] ret = null;
    try {
        Type[] t = this.getField(15);  
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
   * Returns a count of the number of repetitions of Substance Lot Number (RXA-15).
   */
  public int getSubstanceLotNumberReps() {
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
   * Inserts a repetition of Substance Lot Number (RXA-15) at a given index and returns it.
   * @param index The index
   */
  public ST insertSubstanceLotNumber(int index) throws HL7Exception {
     return (ST) super.insertRepetition(15, index);
  }

  /**
   * Removes a repetition of Substance Lot Number (RXA-15) at a given index and returns it.
   * @param index The index
   */
  public ST removeSubstanceLotNumber(int index) throws HL7Exception {
     return (ST) super.removeRepetition(15, index);
  }

  /**
   * Returns a single repetition of Substance Lot Number (RXA-15).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public ST getRxa15_SubstanceLotNumber(int rep) throws HL7Exception {
    ST ret = null;
    try {
        Type t = this.getField(15, rep);
        ret = (ST)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Substance Lot Number (RXA-15).
   */
  public ST[] getRxa15_SubstanceLotNumber() {
     ST[] ret = null;
    try {
        Type[] t = this.getField(15);  
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
   * Returns a count of the number of repetitions of Substance Lot Number (RXA-15).
   */
  public int getRxa15_SubstanceLotNumberReps() {
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
   * Inserts a repetition of Substance Lot Number (RXA-15) at a given index and returns it.
   * @param index The index
   */
  public ST insertRxa15_SubstanceLotNumber(int index) throws HL7Exception {
     return (ST) super.insertRepetition(15, index);
  }

  /**
   * Removes a repetition of Substance Lot Number (RXA-15) at a given index and returns it.
   * @param index The index
   */
  public ST removeRxa15_SubstanceLotNumber(int index) throws HL7Exception {
     return (ST) super.removeRepetition(15, index);
  }

  /**
   * Returns a single repetition of Substance Expiration Date (RXA-16).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public DTM getSubstanceExpirationDate(int rep) throws HL7Exception {
    DTM ret = null;
    try {
        Type t = this.getField(16, rep);
        ret = (DTM)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Substance Expiration Date (RXA-16).
   */
  public DTM[] getSubstanceExpirationDate() {
     DTM[] ret = null;
    try {
        Type[] t = this.getField(16);  
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
   * Returns a count of the number of repetitions of Substance Expiration Date (RXA-16).
   */
  public int getSubstanceExpirationDateReps() {
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
   * Inserts a repetition of Substance Expiration Date (RXA-16) at a given index and returns it.
   * @param index The index
   */
  public DTM insertSubstanceExpirationDate(int index) throws HL7Exception {
     return (DTM) super.insertRepetition(16, index);
  }

  /**
   * Removes a repetition of Substance Expiration Date (RXA-16) at a given index and returns it.
   * @param index The index
   */
  public DTM removeSubstanceExpirationDate(int index) throws HL7Exception {
     return (DTM) super.removeRepetition(16, index);
  }

  /**
   * Returns a single repetition of Substance Expiration Date (RXA-16).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public DTM getRxa16_SubstanceExpirationDate(int rep) throws HL7Exception {
    DTM ret = null;
    try {
        Type t = this.getField(16, rep);
        ret = (DTM)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Substance Expiration Date (RXA-16).
   */
  public DTM[] getRxa16_SubstanceExpirationDate() {
     DTM[] ret = null;
    try {
        Type[] t = this.getField(16);  
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
   * Returns a count of the number of repetitions of Substance Expiration Date (RXA-16).
   */
  public int getRxa16_SubstanceExpirationDateReps() {
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
   * Inserts a repetition of Substance Expiration Date (RXA-16) at a given index and returns it.
   * @param index The index
   */
  public DTM insertRxa16_SubstanceExpirationDate(int index) throws HL7Exception {
     return (DTM) super.insertRepetition(16, index);
  }

  /**
   * Removes a repetition of Substance Expiration Date (RXA-16) at a given index and returns it.
   * @param index The index
   */
  public DTM removeRxa16_SubstanceExpirationDate(int index) throws HL7Exception {
     return (DTM) super.removeRepetition(16, index);
  }

  /**
   * Returns a single repetition of Substance Manufacturer Name (RXA-17).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getSubstanceManufacturerName(int rep) throws HL7Exception {
    CWE ret = null;
    try {
        Type t = this.getField(17, rep);
        ret = (CWE)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Substance Manufacturer Name (RXA-17).
   */
  public CWE[] getSubstanceManufacturerName() {
     CWE[] ret = null;
    try {
        Type[] t = this.getField(17);  
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
   * Returns a count of the number of repetitions of Substance Manufacturer Name (RXA-17).
   */
  public int getSubstanceManufacturerNameReps() {
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
   * Inserts a repetition of Substance Manufacturer Name (RXA-17) at a given index and returns it.
   * @param index The index
   */
  public CWE insertSubstanceManufacturerName(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(17, index);
  }

  /**
   * Removes a repetition of Substance Manufacturer Name (RXA-17) at a given index and returns it.
   * @param index The index
   */
  public CWE removeSubstanceManufacturerName(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(17, index);
  }

  /**
   * Returns a single repetition of Substance Manufacturer Name (RXA-17).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getRxa17_SubstanceManufacturerName(int rep) throws HL7Exception {
    CWE ret = null;
    try {
        Type t = this.getField(17, rep);
        ret = (CWE)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Substance Manufacturer Name (RXA-17).
   */
  public CWE[] getRxa17_SubstanceManufacturerName() {
     CWE[] ret = null;
    try {
        Type[] t = this.getField(17);  
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
   * Returns a count of the number of repetitions of Substance Manufacturer Name (RXA-17).
   */
  public int getRxa17_SubstanceManufacturerNameReps() {
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
   * Inserts a repetition of Substance Manufacturer Name (RXA-17) at a given index and returns it.
   * @param index The index
   */
  public CWE insertRxa17_SubstanceManufacturerName(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(17, index);
  }

  /**
   * Removes a repetition of Substance Manufacturer Name (RXA-17) at a given index and returns it.
   * @param index The index
   */
  public CWE removeRxa17_SubstanceManufacturerName(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(17, index);
  }

  /**
   * Returns a single repetition of Substance/Treatment Refusal Reason (RXA-18).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getSubstanceTreatmentRefusalReason(int rep) throws HL7Exception {
    CWE ret = null;
    try {
        Type t = this.getField(18, rep);
        ret = (CWE)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Substance/Treatment Refusal Reason (RXA-18).
   */
  public CWE[] getSubstanceTreatmentRefusalReason() {
     CWE[] ret = null;
    try {
        Type[] t = this.getField(18);  
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
   * Returns a count of the number of repetitions of Substance/Treatment Refusal Reason (RXA-18).
   */
  public int getSubstanceTreatmentRefusalReasonReps() {
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
   * Inserts a repetition of Substance/Treatment Refusal Reason (RXA-18) at a given index and returns it.
   * @param index The index
   */
  public CWE insertSubstanceTreatmentRefusalReason(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(18, index);
  }

  /**
   * Removes a repetition of Substance/Treatment Refusal Reason (RXA-18) at a given index and returns it.
   * @param index The index
   */
  public CWE removeSubstanceTreatmentRefusalReason(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(18, index);
  }

  /**
   * Returns a single repetition of Substance/Treatment Refusal Reason (RXA-18).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getRxa18_SubstanceTreatmentRefusalReason(int rep) throws HL7Exception {
    CWE ret = null;
    try {
        Type t = this.getField(18, rep);
        ret = (CWE)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Substance/Treatment Refusal Reason (RXA-18).
   */
  public CWE[] getRxa18_SubstanceTreatmentRefusalReason() {
     CWE[] ret = null;
    try {
        Type[] t = this.getField(18);  
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
   * Returns a count of the number of repetitions of Substance/Treatment Refusal Reason (RXA-18).
   */
  public int getRxa18_SubstanceTreatmentRefusalReasonReps() {
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
   * Inserts a repetition of Substance/Treatment Refusal Reason (RXA-18) at a given index and returns it.
   * @param index The index
   */
  public CWE insertRxa18_SubstanceTreatmentRefusalReason(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(18, index);
  }

  /**
   * Removes a repetition of Substance/Treatment Refusal Reason (RXA-18) at a given index and returns it.
   * @param index The index
   */
  public CWE removeRxa18_SubstanceTreatmentRefusalReason(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(18, index);
  }

  /**
   * Returns a single repetition of Indication (RXA-19).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getIndication(int rep) throws HL7Exception {
    CWE ret = null;
    try {
        Type t = this.getField(19, rep);
        ret = (CWE)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Indication (RXA-19).
   */
  public CWE[] getIndication() {
     CWE[] ret = null;
    try {
        Type[] t = this.getField(19);  
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
   * Returns a count of the number of repetitions of Indication (RXA-19).
   */
  public int getIndicationReps() {
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
   * Inserts a repetition of Indication (RXA-19) at a given index and returns it.
   * @param index The index
   */
  public CWE insertIndication(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(19, index);
  }

  /**
   * Removes a repetition of Indication (RXA-19) at a given index and returns it.
   * @param index The index
   */
  public CWE removeIndication(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(19, index);
  }

  /**
   * Returns a single repetition of Indication (RXA-19).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getRxa19_Indication(int rep) throws HL7Exception {
    CWE ret = null;
    try {
        Type t = this.getField(19, rep);
        ret = (CWE)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Indication (RXA-19).
   */
  public CWE[] getRxa19_Indication() {
     CWE[] ret = null;
    try {
        Type[] t = this.getField(19);  
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
   * Returns a count of the number of repetitions of Indication (RXA-19).
   */
  public int getRxa19_IndicationReps() {
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
   * Inserts a repetition of Indication (RXA-19) at a given index and returns it.
   * @param index The index
   */
  public CWE insertRxa19_Indication(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(19, index);
  }

  /**
   * Removes a repetition of Indication (RXA-19) at a given index and returns it.
   * @param index The index
   */
  public CWE removeRxa19_Indication(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(19, index);
  }

  /**
   * Returns Completion Status (RXA-20).
   */
  public ID getCompletionStatus()  {
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
   * Returns Completion Status (RXA-20).
   */
  public ID getRxa20_CompletionStatus()  {
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
   * Returns Action Code - RXA (RXA-21).
   */
  public ID getActionCodeRXA()  {
    ID ret = null;
    try {
        Type t = this.getField(21, 0);
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
   * Returns Action Code - RXA (RXA-21).
   */
  public ID getRxa21_ActionCodeRXA()  {
    ID ret = null;
    try {
        Type t = this.getField(21, 0);
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
   * Returns System Entry Date/Time (RXA-22).
   */
  public DTM getSystemEntryDateTime()  {
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
   * Returns System Entry Date/Time (RXA-22).
   */
  public DTM getRxa22_SystemEntryDateTime()  {
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
   * Returns Administered Drug Strength Volume (RXA-23).
   */
  public NM getAdministeredDrugStrengthVolume()  {
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
   * Returns Administered Drug Strength Volume (RXA-23).
   */
  public NM getRxa23_AdministeredDrugStrengthVolume()  {
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
   * Returns Administered Drug Strength Volume Units (RXA-24).
   */
  public CWE getAdministeredDrugStrengthVolumeUnits()  {
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
   * Returns Administered Drug Strength Volume Units (RXA-24).
   */
  public CWE getRxa24_AdministeredDrugStrengthVolumeUnits()  {
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
   * Returns Administered Barcode Identifier (RXA-25).
   */
  public CWE getAdministeredBarcodeIdentifier()  {
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
   * Returns Administered Barcode Identifier (RXA-25).
   */
  public CWE getRxa25_AdministeredBarcodeIdentifier()  {
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
   * Returns Pharmacy Order Type (RXA-26).
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
   * Returns Pharmacy Order Type (RXA-26).
   */
  public ID getRxa26_PharmacyOrderType()  {
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
   * Returns Administer-at (RXA-27).
   */
  public PL getAdministerAt()  {
    PL ret = null;
    try {
        Type t = this.getField(27, 0);
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
   * Returns Administer-at (RXA-27).
   */
  public PL getRxa27_AdministerAt()  {
    PL ret = null;
    try {
        Type t = this.getField(27, 0);
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
   * Returns Administered-at Address (RXA-28).
   */
  public XAD getAdministeredAtAddress()  {
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
   * Returns Administered-at Address (RXA-28).
   */
  public XAD getRxa28_AdministeredAtAddress()  {
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

   protected Type createNewTypeWithoutReflection(int field) {
      switch (field) {
         case 0: return new ca.uhn.hl7v2.model.v26.datatype.NM(getMessage());
         case 1: return new ca.uhn.hl7v2.model.v26.datatype.NM(getMessage());
         case 2: return new ca.uhn.hl7v2.model.v26.datatype.DTM(getMessage());
         case 3: return new ca.uhn.hl7v2.model.v26.datatype.DTM(getMessage());
         case 4: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 5: return new ca.uhn.hl7v2.model.v26.datatype.NM(getMessage());
         case 6: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 7: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 8: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 9: return new ca.uhn.hl7v2.model.v26.datatype.XCN(getMessage());
         case 10: return new ca.uhn.hl7v2.model.v26.datatype.LA2(getMessage());
         case 11: return new ca.uhn.hl7v2.model.v26.datatype.ST(getMessage());
         case 12: return new ca.uhn.hl7v2.model.v26.datatype.NM(getMessage());
         case 13: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 14: return new ca.uhn.hl7v2.model.v26.datatype.ST(getMessage());
         case 15: return new ca.uhn.hl7v2.model.v26.datatype.DTM(getMessage());
         case 16: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 17: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 18: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 19: return new ca.uhn.hl7v2.model.v26.datatype.ID(getMessage(), new Integer(322));
         case 20: return new ca.uhn.hl7v2.model.v26.datatype.ID(getMessage(), new Integer(206));
         case 21: return new ca.uhn.hl7v2.model.v26.datatype.DTM(getMessage());
         case 22: return new ca.uhn.hl7v2.model.v26.datatype.NM(getMessage());
         case 23: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 24: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 25: return new ca.uhn.hl7v2.model.v26.datatype.ID(getMessage(), new Integer(480));
         case 26: return new ca.uhn.hl7v2.model.v26.datatype.PL(getMessage());
         case 27: return new ca.uhn.hl7v2.model.v26.datatype.XAD(getMessage());
         default: return null;
      }
   }

}