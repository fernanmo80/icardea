package ca.uhn.hl7v2.model.v26.segment;

import ca.uhn.hl7v2.model.*;
import ca.uhn.hl7v2.model.v26.datatype.*;
import ca.uhn.log.HapiLogFactory;
import ca.uhn.hl7v2.parser.ModelClassFactory;
import ca.uhn.hl7v2.HL7Exception;

/**
 * <p>Represents an HL7 PD1 message segment. 
 * This segment has the following fields:</p><p>
 * PD1-1: Living Dependency (IS)<br> 
 * PD1-2: Living Arrangement (IS)<br> 
 * PD1-3: Patient Primary Facility (XON)<br> 
 * PD1-4: Patient Primary Care Provider Name & ID No. (XCN)<br> 
 * PD1-5: Student Indicator (IS)<br> 
 * PD1-6: Handicap (IS)<br> 
 * PD1-7: Living Will Code (IS)<br> 
 * PD1-8: Organ Donor Code (IS)<br> 
 * PD1-9: Separate Bill (ID)<br> 
 * PD1-10: Duplicate Patient (CX)<br> 
 * PD1-11: Publicity Code (CWE)<br> 
 * PD1-12: Protection Indicator (ID)<br> 
 * PD1-13: Protection Indicator Effective Date (DT)<br> 
 * PD1-14: Place of Worship (XON)<br> 
 * PD1-15: Advance Directive Code (CWE)<br> 
 * PD1-16: Immunization Registry Status (IS)<br> 
 * PD1-17: Immunization Registry Status Effective Date (DT)<br> 
 * PD1-18: Publicity Code Effective Date (DT)<br> 
 * PD1-19: Military Branch (IS)<br> 
 * PD1-20: Military Rank/Grade (IS)<br> 
 * PD1-21: Military Status (IS)<br> 
 * PD1-22: Advance Directive Last Verified Date (DT)<br> 
 * </p><p>The get...() methods return data from individual fields.  These methods 
 * do not throw exceptions and may therefore have to handle exceptions internally.  
 * If an exception is handled internally, it is logged and null is returned.  
 * This is not expected to happen - if it does happen this indicates not so much 
 * an exceptional circumstance as a bug in the code for this class.</p>    
 */
public class PD1 extends AbstractSegment  {

  /**
   * Creates a PD1 (Patient Additional Demographic) segment object that belongs to the given 
   * message.  
   */
  public PD1(Group parent, ModelClassFactory factory) {
    super(parent, factory);
    Message message = getMessage();
    try {
       this.add(IS.class, false, 0, 2, new Object[]{message, new Integer(223)}, "Living Dependency");
       this.add(IS.class, false, 1, 2, new Object[]{message, new Integer(220)}, "Living Arrangement");
       this.add(XON.class, false, 0, 250, new Object[]{message}, "Patient Primary Facility");
       this.add(XCN.class, false, 0, 0, new Object[]{message}, "Patient Primary Care Provider Name & ID No.");
       this.add(IS.class, false, 1, 2, new Object[]{message, new Integer(231)}, "Student Indicator");
       this.add(IS.class, false, 1, 2, new Object[]{message, new Integer(295)}, "Handicap");
       this.add(IS.class, false, 1, 2, new Object[]{message, new Integer(315)}, "Living Will Code");
       this.add(IS.class, false, 1, 2, new Object[]{message, new Integer(316)}, "Organ Donor Code");
       this.add(ID.class, false, 1, 1, new Object[]{message, new Integer(136)}, "Separate Bill");
       this.add(CX.class, false, 0, 250, new Object[]{message}, "Duplicate Patient");
       this.add(CWE.class, false, 1, 705, new Object[]{message}, "Publicity Code");
       this.add(ID.class, false, 1, 0, new Object[]{message, new Integer(136)}, "Protection Indicator");
       this.add(DT.class, false, 1, 0, new Object[]{message}, "Protection Indicator Effective Date");
       this.add(XON.class, false, 0, 250, new Object[]{message}, "Place of Worship");
       this.add(CWE.class, false, 0, 705, new Object[]{message}, "Advance Directive Code");
       this.add(IS.class, false, 1, 1, new Object[]{message, new Integer(441)}, "Immunization Registry Status");
       this.add(DT.class, false, 1, 8, new Object[]{message}, "Immunization Registry Status Effective Date");
       this.add(DT.class, false, 1, 8, new Object[]{message}, "Publicity Code Effective Date");
       this.add(IS.class, false, 1, 5, new Object[]{message, new Integer(140)}, "Military Branch");
       this.add(IS.class, false, 1, 2, new Object[]{message, new Integer(141)}, "Military Rank/Grade");
       this.add(IS.class, false, 1, 3, new Object[]{message, new Integer(142)}, "Military Status");
       this.add(DT.class, false, 1, 8, new Object[]{message}, "Advance Directive Last Verified Date");
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Can't instantiate " + this.getClass().getName(), he);
    }
  }

  /**
   * Returns a single repetition of Living Dependency (PD1-1).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public IS getLivingDependency(int rep) throws HL7Exception {
    IS ret = null;
    try {
        Type t = this.getField(1, rep);
        ret = (IS)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Living Dependency (PD1-1).
   */
  public IS[] getLivingDependency() {
     IS[] ret = null;
    try {
        Type[] t = this.getField(1);  
        ret = new IS[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (IS)t[i];
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
   * Returns a count of the number of repetitions of Living Dependency (PD1-1).
   */
  public int getLivingDependencyReps() {
    try {
        return this.getField(1).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Living Dependency (PD1-1) at a given index and returns it.
   * @param index The index
   */
  public IS insertLivingDependency(int index) throws HL7Exception {
     return (IS) super.insertRepetition(1, index);
  }

  /**
   * Removes a repetition of Living Dependency (PD1-1) at a given index and returns it.
   * @param index The index
   */
  public IS removeLivingDependency(int index) throws HL7Exception {
     return (IS) super.removeRepetition(1, index);
  }

  /**
   * Returns a single repetition of Living Dependency (PD1-1).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public IS getPd11_LivingDependency(int rep) throws HL7Exception {
    IS ret = null;
    try {
        Type t = this.getField(1, rep);
        ret = (IS)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Living Dependency (PD1-1).
   */
  public IS[] getPd11_LivingDependency() {
     IS[] ret = null;
    try {
        Type[] t = this.getField(1);  
        ret = new IS[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (IS)t[i];
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
   * Returns a count of the number of repetitions of Living Dependency (PD1-1).
   */
  public int getPd11_LivingDependencyReps() {
    try {
        return this.getField(1).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Living Dependency (PD1-1) at a given index and returns it.
   * @param index The index
   */
  public IS insertPd11_LivingDependency(int index) throws HL7Exception {
     return (IS) super.insertRepetition(1, index);
  }

  /**
   * Removes a repetition of Living Dependency (PD1-1) at a given index and returns it.
   * @param index The index
   */
  public IS removePd11_LivingDependency(int index) throws HL7Exception {
     return (IS) super.removeRepetition(1, index);
  }

  /**
   * Returns Living Arrangement (PD1-2).
   */
  public IS getLivingArrangement()  {
    IS ret = null;
    try {
        Type t = this.getField(2, 0);
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
   * Returns Living Arrangement (PD1-2).
   */
  public IS getPd12_LivingArrangement()  {
    IS ret = null;
    try {
        Type t = this.getField(2, 0);
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
   * Returns a single repetition of Patient Primary Facility (PD1-3).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XON getPatientPrimaryFacility(int rep) throws HL7Exception {
    XON ret = null;
    try {
        Type t = this.getField(3, rep);
        ret = (XON)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Patient Primary Facility (PD1-3).
   */
  public XON[] getPatientPrimaryFacility() {
     XON[] ret = null;
    try {
        Type[] t = this.getField(3);  
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
   * Returns a count of the number of repetitions of Patient Primary Facility (PD1-3).
   */
  public int getPatientPrimaryFacilityReps() {
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
   * Inserts a repetition of Patient Primary Facility (PD1-3) at a given index and returns it.
   * @param index The index
   */
  public XON insertPatientPrimaryFacility(int index) throws HL7Exception {
     return (XON) super.insertRepetition(3, index);
  }

  /**
   * Removes a repetition of Patient Primary Facility (PD1-3) at a given index and returns it.
   * @param index The index
   */
  public XON removePatientPrimaryFacility(int index) throws HL7Exception {
     return (XON) super.removeRepetition(3, index);
  }

  /**
   * Returns a single repetition of Patient Primary Facility (PD1-3).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XON getPd13_PatientPrimaryFacility(int rep) throws HL7Exception {
    XON ret = null;
    try {
        Type t = this.getField(3, rep);
        ret = (XON)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Patient Primary Facility (PD1-3).
   */
  public XON[] getPd13_PatientPrimaryFacility() {
     XON[] ret = null;
    try {
        Type[] t = this.getField(3);  
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
   * Returns a count of the number of repetitions of Patient Primary Facility (PD1-3).
   */
  public int getPd13_PatientPrimaryFacilityReps() {
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
   * Inserts a repetition of Patient Primary Facility (PD1-3) at a given index and returns it.
   * @param index The index
   */
  public XON insertPd13_PatientPrimaryFacility(int index) throws HL7Exception {
     return (XON) super.insertRepetition(3, index);
  }

  /**
   * Removes a repetition of Patient Primary Facility (PD1-3) at a given index and returns it.
   * @param index The index
   */
  public XON removePd13_PatientPrimaryFacility(int index) throws HL7Exception {
     return (XON) super.removeRepetition(3, index);
  }

  /**
   * Returns a single repetition of Patient Primary Care Provider Name & ID No. (PD1-4).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XCN getPatientPrimaryCareProviderNameIDNo(int rep) throws HL7Exception {
    XCN ret = null;
    try {
        Type t = this.getField(4, rep);
        ret = (XCN)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Patient Primary Care Provider Name & ID No. (PD1-4).
   */
  public XCN[] getPatientPrimaryCareProviderNameIDNo() {
     XCN[] ret = null;
    try {
        Type[] t = this.getField(4);  
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
   * Returns a count of the number of repetitions of Patient Primary Care Provider Name & ID No. (PD1-4).
   */
  public int getPatientPrimaryCareProviderNameIDNoReps() {
    try {
        return this.getField(4).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Patient Primary Care Provider Name & ID No. (PD1-4) at a given index and returns it.
   * @param index The index
   */
  public XCN insertPatientPrimaryCareProviderNameIDNo(int index) throws HL7Exception {
     return (XCN) super.insertRepetition(4, index);
  }

  /**
   * Removes a repetition of Patient Primary Care Provider Name & ID No. (PD1-4) at a given index and returns it.
   * @param index The index
   */
  public XCN removePatientPrimaryCareProviderNameIDNo(int index) throws HL7Exception {
     return (XCN) super.removeRepetition(4, index);
  }

  /**
   * Returns a single repetition of Patient Primary Care Provider Name & ID No. (PD1-4).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XCN getPd14_PatientPrimaryCareProviderNameIDNo(int rep) throws HL7Exception {
    XCN ret = null;
    try {
        Type t = this.getField(4, rep);
        ret = (XCN)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Patient Primary Care Provider Name & ID No. (PD1-4).
   */
  public XCN[] getPd14_PatientPrimaryCareProviderNameIDNo() {
     XCN[] ret = null;
    try {
        Type[] t = this.getField(4);  
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
   * Returns a count of the number of repetitions of Patient Primary Care Provider Name & ID No. (PD1-4).
   */
  public int getPd14_PatientPrimaryCareProviderNameIDNoReps() {
    try {
        return this.getField(4).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Patient Primary Care Provider Name & ID No. (PD1-4) at a given index and returns it.
   * @param index The index
   */
  public XCN insertPd14_PatientPrimaryCareProviderNameIDNo(int index) throws HL7Exception {
     return (XCN) super.insertRepetition(4, index);
  }

  /**
   * Removes a repetition of Patient Primary Care Provider Name & ID No. (PD1-4) at a given index and returns it.
   * @param index The index
   */
  public XCN removePd14_PatientPrimaryCareProviderNameIDNo(int index) throws HL7Exception {
     return (XCN) super.removeRepetition(4, index);
  }

  /**
   * Returns Student Indicator (PD1-5).
   */
  public IS getStudentIndicator()  {
    IS ret = null;
    try {
        Type t = this.getField(5, 0);
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
   * Returns Student Indicator (PD1-5).
   */
  public IS getPd15_StudentIndicator()  {
    IS ret = null;
    try {
        Type t = this.getField(5, 0);
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
   * Returns Handicap (PD1-6).
   */
  public IS getHandicap()  {
    IS ret = null;
    try {
        Type t = this.getField(6, 0);
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
   * Returns Handicap (PD1-6).
   */
  public IS getPd16_Handicap()  {
    IS ret = null;
    try {
        Type t = this.getField(6, 0);
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
   * Returns Living Will Code (PD1-7).
   */
  public IS getLivingWillCode()  {
    IS ret = null;
    try {
        Type t = this.getField(7, 0);
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
   * Returns Living Will Code (PD1-7).
   */
  public IS getPd17_LivingWillCode()  {
    IS ret = null;
    try {
        Type t = this.getField(7, 0);
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
   * Returns Organ Donor Code (PD1-8).
   */
  public IS getOrganDonorCode()  {
    IS ret = null;
    try {
        Type t = this.getField(8, 0);
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
   * Returns Organ Donor Code (PD1-8).
   */
  public IS getPd18_OrganDonorCode()  {
    IS ret = null;
    try {
        Type t = this.getField(8, 0);
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
   * Returns Separate Bill (PD1-9).
   */
  public ID getSeparateBill()  {
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
   * Returns Separate Bill (PD1-9).
   */
  public ID getPd19_SeparateBill()  {
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
   * Returns a single repetition of Duplicate Patient (PD1-10).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CX getDuplicatePatient(int rep) throws HL7Exception {
    CX ret = null;
    try {
        Type t = this.getField(10, rep);
        ret = (CX)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Duplicate Patient (PD1-10).
   */
  public CX[] getDuplicatePatient() {
     CX[] ret = null;
    try {
        Type[] t = this.getField(10);  
        ret = new CX[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (CX)t[i];
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
   * Returns a count of the number of repetitions of Duplicate Patient (PD1-10).
   */
  public int getDuplicatePatientReps() {
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
   * Inserts a repetition of Duplicate Patient (PD1-10) at a given index and returns it.
   * @param index The index
   */
  public CX insertDuplicatePatient(int index) throws HL7Exception {
     return (CX) super.insertRepetition(10, index);
  }

  /**
   * Removes a repetition of Duplicate Patient (PD1-10) at a given index and returns it.
   * @param index The index
   */
  public CX removeDuplicatePatient(int index) throws HL7Exception {
     return (CX) super.removeRepetition(10, index);
  }

  /**
   * Returns a single repetition of Duplicate Patient (PD1-10).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CX getPd110_DuplicatePatient(int rep) throws HL7Exception {
    CX ret = null;
    try {
        Type t = this.getField(10, rep);
        ret = (CX)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Duplicate Patient (PD1-10).
   */
  public CX[] getPd110_DuplicatePatient() {
     CX[] ret = null;
    try {
        Type[] t = this.getField(10);  
        ret = new CX[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (CX)t[i];
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
   * Returns a count of the number of repetitions of Duplicate Patient (PD1-10).
   */
  public int getPd110_DuplicatePatientReps() {
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
   * Inserts a repetition of Duplicate Patient (PD1-10) at a given index and returns it.
   * @param index The index
   */
  public CX insertPd110_DuplicatePatient(int index) throws HL7Exception {
     return (CX) super.insertRepetition(10, index);
  }

  /**
   * Removes a repetition of Duplicate Patient (PD1-10) at a given index and returns it.
   * @param index The index
   */
  public CX removePd110_DuplicatePatient(int index) throws HL7Exception {
     return (CX) super.removeRepetition(10, index);
  }

  /**
   * Returns Publicity Code (PD1-11).
   */
  public CWE getPublicityCode()  {
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
   * Returns Publicity Code (PD1-11).
   */
  public CWE getPd111_PublicityCode()  {
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
   * Returns Protection Indicator (PD1-12).
   */
  public ID getProtectionIndicator()  {
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
   * Returns Protection Indicator (PD1-12).
   */
  public ID getPd112_ProtectionIndicator()  {
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
   * Returns Protection Indicator Effective Date (PD1-13).
   */
  public DT getProtectionIndicatorEffectiveDate()  {
    DT ret = null;
    try {
        Type t = this.getField(13, 0);
        ret = (DT)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns Protection Indicator Effective Date (PD1-13).
   */
  public DT getPd113_ProtectionIndicatorEffectiveDate()  {
    DT ret = null;
    try {
        Type t = this.getField(13, 0);
        ret = (DT)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns a single repetition of Place of Worship (PD1-14).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XON getPlaceOfWorship(int rep) throws HL7Exception {
    XON ret = null;
    try {
        Type t = this.getField(14, rep);
        ret = (XON)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Place of Worship (PD1-14).
   */
  public XON[] getPlaceOfWorship() {
     XON[] ret = null;
    try {
        Type[] t = this.getField(14);  
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
   * Returns a count of the number of repetitions of Place of Worship (PD1-14).
   */
  public int getPlaceOfWorshipReps() {
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
   * Inserts a repetition of Place of Worship (PD1-14) at a given index and returns it.
   * @param index The index
   */
  public XON insertPlaceOfWorship(int index) throws HL7Exception {
     return (XON) super.insertRepetition(14, index);
  }

  /**
   * Removes a repetition of Place of Worship (PD1-14) at a given index and returns it.
   * @param index The index
   */
  public XON removePlaceOfWorship(int index) throws HL7Exception {
     return (XON) super.removeRepetition(14, index);
  }

  /**
   * Returns a single repetition of Place of Worship (PD1-14).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XON getPd114_PlaceOfWorship(int rep) throws HL7Exception {
    XON ret = null;
    try {
        Type t = this.getField(14, rep);
        ret = (XON)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Place of Worship (PD1-14).
   */
  public XON[] getPd114_PlaceOfWorship() {
     XON[] ret = null;
    try {
        Type[] t = this.getField(14);  
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
   * Returns a count of the number of repetitions of Place of Worship (PD1-14).
   */
  public int getPd114_PlaceOfWorshipReps() {
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
   * Inserts a repetition of Place of Worship (PD1-14) at a given index and returns it.
   * @param index The index
   */
  public XON insertPd114_PlaceOfWorship(int index) throws HL7Exception {
     return (XON) super.insertRepetition(14, index);
  }

  /**
   * Removes a repetition of Place of Worship (PD1-14) at a given index and returns it.
   * @param index The index
   */
  public XON removePd114_PlaceOfWorship(int index) throws HL7Exception {
     return (XON) super.removeRepetition(14, index);
  }

  /**
   * Returns a single repetition of Advance Directive Code (PD1-15).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getAdvanceDirectiveCode(int rep) throws HL7Exception {
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
   * Returns all repetitions of Advance Directive Code (PD1-15).
   */
  public CWE[] getAdvanceDirectiveCode() {
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
   * Returns a count of the number of repetitions of Advance Directive Code (PD1-15).
   */
  public int getAdvanceDirectiveCodeReps() {
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
   * Inserts a repetition of Advance Directive Code (PD1-15) at a given index and returns it.
   * @param index The index
   */
  public CWE insertAdvanceDirectiveCode(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(15, index);
  }

  /**
   * Removes a repetition of Advance Directive Code (PD1-15) at a given index and returns it.
   * @param index The index
   */
  public CWE removeAdvanceDirectiveCode(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(15, index);
  }

  /**
   * Returns a single repetition of Advance Directive Code (PD1-15).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getPd115_AdvanceDirectiveCode(int rep) throws HL7Exception {
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
   * Returns all repetitions of Advance Directive Code (PD1-15).
   */
  public CWE[] getPd115_AdvanceDirectiveCode() {
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
   * Returns a count of the number of repetitions of Advance Directive Code (PD1-15).
   */
  public int getPd115_AdvanceDirectiveCodeReps() {
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
   * Inserts a repetition of Advance Directive Code (PD1-15) at a given index and returns it.
   * @param index The index
   */
  public CWE insertPd115_AdvanceDirectiveCode(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(15, index);
  }

  /**
   * Removes a repetition of Advance Directive Code (PD1-15) at a given index and returns it.
   * @param index The index
   */
  public CWE removePd115_AdvanceDirectiveCode(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(15, index);
  }

  /**
   * Returns Immunization Registry Status (PD1-16).
   */
  public IS getImmunizationRegistryStatus()  {
    IS ret = null;
    try {
        Type t = this.getField(16, 0);
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
   * Returns Immunization Registry Status (PD1-16).
   */
  public IS getPd116_ImmunizationRegistryStatus()  {
    IS ret = null;
    try {
        Type t = this.getField(16, 0);
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
   * Returns Immunization Registry Status Effective Date (PD1-17).
   */
  public DT getImmunizationRegistryStatusEffectiveDate()  {
    DT ret = null;
    try {
        Type t = this.getField(17, 0);
        ret = (DT)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns Immunization Registry Status Effective Date (PD1-17).
   */
  public DT getPd117_ImmunizationRegistryStatusEffectiveDate()  {
    DT ret = null;
    try {
        Type t = this.getField(17, 0);
        ret = (DT)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns Publicity Code Effective Date (PD1-18).
   */
  public DT getPublicityCodeEffectiveDate()  {
    DT ret = null;
    try {
        Type t = this.getField(18, 0);
        ret = (DT)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns Publicity Code Effective Date (PD1-18).
   */
  public DT getPd118_PublicityCodeEffectiveDate()  {
    DT ret = null;
    try {
        Type t = this.getField(18, 0);
        ret = (DT)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns Military Branch (PD1-19).
   */
  public IS getMilitaryBranch()  {
    IS ret = null;
    try {
        Type t = this.getField(19, 0);
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
   * Returns Military Branch (PD1-19).
   */
  public IS getPd119_MilitaryBranch()  {
    IS ret = null;
    try {
        Type t = this.getField(19, 0);
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
   * Returns Military Rank/Grade (PD1-20).
   */
  public IS getMilitaryRankGrade()  {
    IS ret = null;
    try {
        Type t = this.getField(20, 0);
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
   * Returns Military Rank/Grade (PD1-20).
   */
  public IS getPd120_MilitaryRankGrade()  {
    IS ret = null;
    try {
        Type t = this.getField(20, 0);
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
   * Returns Military Status (PD1-21).
   */
  public IS getMilitaryStatus()  {
    IS ret = null;
    try {
        Type t = this.getField(21, 0);
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
   * Returns Military Status (PD1-21).
   */
  public IS getPd121_MilitaryStatus()  {
    IS ret = null;
    try {
        Type t = this.getField(21, 0);
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
   * Returns Advance Directive Last Verified Date (PD1-22).
   */
  public DT getAdvanceDirectiveLastVerifiedDate()  {
    DT ret = null;
    try {
        Type t = this.getField(22, 0);
        ret = (DT)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns Advance Directive Last Verified Date (PD1-22).
   */
  public DT getPd122_AdvanceDirectiveLastVerifiedDate()  {
    DT ret = null;
    try {
        Type t = this.getField(22, 0);
        ret = (DT)t;
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
         case 0: return new ca.uhn.hl7v2.model.v26.datatype.IS(getMessage(), new Integer(223));
         case 1: return new ca.uhn.hl7v2.model.v26.datatype.IS(getMessage(), new Integer(220));
         case 2: return new ca.uhn.hl7v2.model.v26.datatype.XON(getMessage());
         case 3: return new ca.uhn.hl7v2.model.v26.datatype.XCN(getMessage());
         case 4: return new ca.uhn.hl7v2.model.v26.datatype.IS(getMessage(), new Integer(231));
         case 5: return new ca.uhn.hl7v2.model.v26.datatype.IS(getMessage(), new Integer(295));
         case 6: return new ca.uhn.hl7v2.model.v26.datatype.IS(getMessage(), new Integer(315));
         case 7: return new ca.uhn.hl7v2.model.v26.datatype.IS(getMessage(), new Integer(316));
         case 8: return new ca.uhn.hl7v2.model.v26.datatype.ID(getMessage(), new Integer(136));
         case 9: return new ca.uhn.hl7v2.model.v26.datatype.CX(getMessage());
         case 10: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 11: return new ca.uhn.hl7v2.model.v26.datatype.ID(getMessage(), new Integer(136));
         case 12: return new ca.uhn.hl7v2.model.v26.datatype.DT(getMessage());
         case 13: return new ca.uhn.hl7v2.model.v26.datatype.XON(getMessage());
         case 14: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 15: return new ca.uhn.hl7v2.model.v26.datatype.IS(getMessage(), new Integer(441));
         case 16: return new ca.uhn.hl7v2.model.v26.datatype.DT(getMessage());
         case 17: return new ca.uhn.hl7v2.model.v26.datatype.DT(getMessage());
         case 18: return new ca.uhn.hl7v2.model.v26.datatype.IS(getMessage(), new Integer(140));
         case 19: return new ca.uhn.hl7v2.model.v26.datatype.IS(getMessage(), new Integer(141));
         case 20: return new ca.uhn.hl7v2.model.v26.datatype.IS(getMessage(), new Integer(142));
         case 21: return new ca.uhn.hl7v2.model.v26.datatype.DT(getMessage());
         default: return null;
      }
   }

}