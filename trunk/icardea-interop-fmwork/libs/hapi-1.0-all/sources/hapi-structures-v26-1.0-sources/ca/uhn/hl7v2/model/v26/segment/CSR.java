package ca.uhn.hl7v2.model.v26.segment;

import ca.uhn.hl7v2.model.*;
import ca.uhn.hl7v2.model.v26.datatype.*;
import ca.uhn.log.HapiLogFactory;
import ca.uhn.hl7v2.parser.ModelClassFactory;
import ca.uhn.hl7v2.HL7Exception;

/**
 * <p>Represents an HL7 CSR message segment. 
 * This segment has the following fields:</p><p>
 * CSR-1: Sponsor Study ID (EI)<br> 
 * CSR-2: Alternate Study ID (EI)<br> 
 * CSR-3: Institution Registering the Patient (CWE)<br> 
 * CSR-4: Sponsor Patient ID (CX)<br> 
 * CSR-5: Alternate Patient ID - CSR (CX)<br> 
 * CSR-6: Date/Time of Patient Study Registration (DTM)<br> 
 * CSR-7: Person Performing Study Registration (XCN)<br> 
 * CSR-8: Study Authorizing Provider (XCN)<br> 
 * CSR-9: Date/time Patient Study Consent Signed (DTM)<br> 
 * CSR-10: Patient Study Eligibility Status (CWE)<br> 
 * CSR-11: Study Randomization Date/time (DTM)<br> 
 * CSR-12: Randomized Study Arm (CWE)<br> 
 * CSR-13: Stratum for Study Randomization (CWE)<br> 
 * CSR-14: Patient Evaluability Status (CWE)<br> 
 * CSR-15: Date/time Ended Study (DTM)<br> 
 * CSR-16: Reason Ended Study (CWE)<br> 
 * </p><p>The get...() methods return data from individual fields.  These methods 
 * do not throw exceptions and may therefore have to handle exceptions internally.  
 * If an exception is handled internally, it is logged and null is returned.  
 * This is not expected to happen - if it does happen this indicates not so much 
 * an exceptional circumstance as a bug in the code for this class.</p>    
 */
public class CSR extends AbstractSegment  {

  /**
   * Creates a CSR (Clinical Study Registration) segment object that belongs to the given 
   * message.  
   */
  public CSR(Group parent, ModelClassFactory factory) {
    super(parent, factory);
    Message message = getMessage();
    try {
       this.add(EI.class, true, 1, 427, new Object[]{message}, "Sponsor Study ID");
       this.add(EI.class, false, 1, 427, new Object[]{message}, "Alternate Study ID");
       this.add(CWE.class, false, 1, 705, new Object[]{message}, "Institution Registering the Patient");
       this.add(CX.class, true, 1, 1913, new Object[]{message}, "Sponsor Patient ID");
       this.add(CX.class, false, 1, 1913, new Object[]{message}, "Alternate Patient ID - CSR");
       this.add(DTM.class, true, 1, 24, new Object[]{message}, "Date/Time of Patient Study Registration");
       this.add(XCN.class, false, 0, 3220, new Object[]{message}, "Person Performing Study Registration");
       this.add(XCN.class, true, 0, 3220, new Object[]{message}, "Study Authorizing Provider");
       this.add(DTM.class, false, 1, 24, new Object[]{message}, "Date/time Patient Study Consent Signed");
       this.add(CWE.class, false, 1, 705, new Object[]{message}, "Patient Study Eligibility Status");
       this.add(DTM.class, false, 3, 24, new Object[]{message}, "Study Randomization Date/time");
       this.add(CWE.class, false, 3, 705, new Object[]{message}, "Randomized Study Arm");
       this.add(CWE.class, false, 3, 705, new Object[]{message}, "Stratum for Study Randomization");
       this.add(CWE.class, false, 1, 705, new Object[]{message}, "Patient Evaluability Status");
       this.add(DTM.class, false, 1, 24, new Object[]{message}, "Date/time Ended Study");
       this.add(CWE.class, false, 1, 705, new Object[]{message}, "Reason Ended Study");
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Can't instantiate " + this.getClass().getName(), he);
    }
  }

  /**
   * Returns Sponsor Study ID (CSR-1).
   */
  public EI getSponsorStudyID()  {
    EI ret = null;
    try {
        Type t = this.getField(1, 0);
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
   * Returns Sponsor Study ID (CSR-1).
   */
  public EI getCsr1_SponsorStudyID()  {
    EI ret = null;
    try {
        Type t = this.getField(1, 0);
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
   * Returns Alternate Study ID (CSR-2).
   */
  public EI getAlternateStudyID()  {
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
   * Returns Alternate Study ID (CSR-2).
   */
  public EI getCsr2_AlternateStudyID()  {
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
   * Returns Institution Registering the Patient (CSR-3).
   */
  public CWE getInstitutionRegisteringThePatient()  {
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
   * Returns Institution Registering the Patient (CSR-3).
   */
  public CWE getCsr3_InstitutionRegisteringThePatient()  {
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
   * Returns Sponsor Patient ID (CSR-4).
   */
  public CX getSponsorPatientID()  {
    CX ret = null;
    try {
        Type t = this.getField(4, 0);
        ret = (CX)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns Sponsor Patient ID (CSR-4).
   */
  public CX getCsr4_SponsorPatientID()  {
    CX ret = null;
    try {
        Type t = this.getField(4, 0);
        ret = (CX)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns Alternate Patient ID - CSR (CSR-5).
   */
  public CX getAlternatePatientIDCSR()  {
    CX ret = null;
    try {
        Type t = this.getField(5, 0);
        ret = (CX)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns Alternate Patient ID - CSR (CSR-5).
   */
  public CX getCsr5_AlternatePatientIDCSR()  {
    CX ret = null;
    try {
        Type t = this.getField(5, 0);
        ret = (CX)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns Date/Time of Patient Study Registration (CSR-6).
   */
  public DTM getDateTimeOfPatientStudyRegistration()  {
    DTM ret = null;
    try {
        Type t = this.getField(6, 0);
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
   * Returns Date/Time of Patient Study Registration (CSR-6).
   */
  public DTM getCsr6_DateTimeOfPatientStudyRegistration()  {
    DTM ret = null;
    try {
        Type t = this.getField(6, 0);
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
   * Returns a single repetition of Person Performing Study Registration (CSR-7).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XCN getPersonPerformingStudyRegistration(int rep) throws HL7Exception {
    XCN ret = null;
    try {
        Type t = this.getField(7, rep);
        ret = (XCN)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Person Performing Study Registration (CSR-7).
   */
  public XCN[] getPersonPerformingStudyRegistration() {
     XCN[] ret = null;
    try {
        Type[] t = this.getField(7);  
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
   * Returns a count of the number of repetitions of Person Performing Study Registration (CSR-7).
   */
  public int getPersonPerformingStudyRegistrationReps() {
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
   * Inserts a repetition of Person Performing Study Registration (CSR-7) at a given index and returns it.
   * @param index The index
   */
  public XCN insertPersonPerformingStudyRegistration(int index) throws HL7Exception {
     return (XCN) super.insertRepetition(7, index);
  }

  /**
   * Removes a repetition of Person Performing Study Registration (CSR-7) at a given index and returns it.
   * @param index The index
   */
  public XCN removePersonPerformingStudyRegistration(int index) throws HL7Exception {
     return (XCN) super.removeRepetition(7, index);
  }

  /**
   * Returns a single repetition of Person Performing Study Registration (CSR-7).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XCN getCsr7_PersonPerformingStudyRegistration(int rep) throws HL7Exception {
    XCN ret = null;
    try {
        Type t = this.getField(7, rep);
        ret = (XCN)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Person Performing Study Registration (CSR-7).
   */
  public XCN[] getCsr7_PersonPerformingStudyRegistration() {
     XCN[] ret = null;
    try {
        Type[] t = this.getField(7);  
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
   * Returns a count of the number of repetitions of Person Performing Study Registration (CSR-7).
   */
  public int getCsr7_PersonPerformingStudyRegistrationReps() {
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
   * Inserts a repetition of Person Performing Study Registration (CSR-7) at a given index and returns it.
   * @param index The index
   */
  public XCN insertCsr7_PersonPerformingStudyRegistration(int index) throws HL7Exception {
     return (XCN) super.insertRepetition(7, index);
  }

  /**
   * Removes a repetition of Person Performing Study Registration (CSR-7) at a given index and returns it.
   * @param index The index
   */
  public XCN removeCsr7_PersonPerformingStudyRegistration(int index) throws HL7Exception {
     return (XCN) super.removeRepetition(7, index);
  }

  /**
   * Returns a single repetition of Study Authorizing Provider (CSR-8).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XCN getStudyAuthorizingProvider(int rep) throws HL7Exception {
    XCN ret = null;
    try {
        Type t = this.getField(8, rep);
        ret = (XCN)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Study Authorizing Provider (CSR-8).
   */
  public XCN[] getStudyAuthorizingProvider() {
     XCN[] ret = null;
    try {
        Type[] t = this.getField(8);  
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
   * Returns a count of the number of repetitions of Study Authorizing Provider (CSR-8).
   */
  public int getStudyAuthorizingProviderReps() {
    try {
        return this.getField(8).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Study Authorizing Provider (CSR-8) at a given index and returns it.
   * @param index The index
   */
  public XCN insertStudyAuthorizingProvider(int index) throws HL7Exception {
     return (XCN) super.insertRepetition(8, index);
  }

  /**
   * Removes a repetition of Study Authorizing Provider (CSR-8) at a given index and returns it.
   * @param index The index
   */
  public XCN removeStudyAuthorizingProvider(int index) throws HL7Exception {
     return (XCN) super.removeRepetition(8, index);
  }

  /**
   * Returns a single repetition of Study Authorizing Provider (CSR-8).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XCN getCsr8_StudyAuthorizingProvider(int rep) throws HL7Exception {
    XCN ret = null;
    try {
        Type t = this.getField(8, rep);
        ret = (XCN)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Study Authorizing Provider (CSR-8).
   */
  public XCN[] getCsr8_StudyAuthorizingProvider() {
     XCN[] ret = null;
    try {
        Type[] t = this.getField(8);  
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
   * Returns a count of the number of repetitions of Study Authorizing Provider (CSR-8).
   */
  public int getCsr8_StudyAuthorizingProviderReps() {
    try {
        return this.getField(8).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Study Authorizing Provider (CSR-8) at a given index and returns it.
   * @param index The index
   */
  public XCN insertCsr8_StudyAuthorizingProvider(int index) throws HL7Exception {
     return (XCN) super.insertRepetition(8, index);
  }

  /**
   * Removes a repetition of Study Authorizing Provider (CSR-8) at a given index and returns it.
   * @param index The index
   */
  public XCN removeCsr8_StudyAuthorizingProvider(int index) throws HL7Exception {
     return (XCN) super.removeRepetition(8, index);
  }

  /**
   * Returns Date/time Patient Study Consent Signed (CSR-9).
   */
  public DTM getDateTimePatientStudyConsentSigned()  {
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
   * Returns Date/time Patient Study Consent Signed (CSR-9).
   */
  public DTM getCsr9_DateTimePatientStudyConsentSigned()  {
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
   * Returns Patient Study Eligibility Status (CSR-10).
   */
  public CWE getPatientStudyEligibilityStatus()  {
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
   * Returns Patient Study Eligibility Status (CSR-10).
   */
  public CWE getCsr10_PatientStudyEligibilityStatus()  {
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
   * Returns a single repetition of Study Randomization Date/time (CSR-11).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public DTM getStudyRandomizationDateTime(int rep) throws HL7Exception {
    DTM ret = null;
    try {
        Type t = this.getField(11, rep);
        ret = (DTM)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Study Randomization Date/time (CSR-11).
   */
  public DTM[] getStudyRandomizationDateTime() {
     DTM[] ret = null;
    try {
        Type[] t = this.getField(11);  
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
   * Returns a count of the number of repetitions of Study Randomization Date/time (CSR-11).
   */
  public int getStudyRandomizationDateTimeReps() {
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
   * Inserts a repetition of Study Randomization Date/time (CSR-11) at a given index and returns it.
   * @param index The index
   */
  public DTM insertStudyRandomizationDateTime(int index) throws HL7Exception {
     return (DTM) super.insertRepetition(11, index);
  }

  /**
   * Removes a repetition of Study Randomization Date/time (CSR-11) at a given index and returns it.
   * @param index The index
   */
  public DTM removeStudyRandomizationDateTime(int index) throws HL7Exception {
     return (DTM) super.removeRepetition(11, index);
  }

  /**
   * Returns a single repetition of Study Randomization Date/time (CSR-11).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public DTM getCsr11_StudyRandomizationDateTime(int rep) throws HL7Exception {
    DTM ret = null;
    try {
        Type t = this.getField(11, rep);
        ret = (DTM)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Study Randomization Date/time (CSR-11).
   */
  public DTM[] getCsr11_StudyRandomizationDateTime() {
     DTM[] ret = null;
    try {
        Type[] t = this.getField(11);  
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
   * Returns a count of the number of repetitions of Study Randomization Date/time (CSR-11).
   */
  public int getCsr11_StudyRandomizationDateTimeReps() {
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
   * Inserts a repetition of Study Randomization Date/time (CSR-11) at a given index and returns it.
   * @param index The index
   */
  public DTM insertCsr11_StudyRandomizationDateTime(int index) throws HL7Exception {
     return (DTM) super.insertRepetition(11, index);
  }

  /**
   * Removes a repetition of Study Randomization Date/time (CSR-11) at a given index and returns it.
   * @param index The index
   */
  public DTM removeCsr11_StudyRandomizationDateTime(int index) throws HL7Exception {
     return (DTM) super.removeRepetition(11, index);
  }

  /**
   * Returns a single repetition of Randomized Study Arm (CSR-12).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getRandomizedStudyArm(int rep) throws HL7Exception {
    CWE ret = null;
    try {
        Type t = this.getField(12, rep);
        ret = (CWE)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Randomized Study Arm (CSR-12).
   */
  public CWE[] getRandomizedStudyArm() {
     CWE[] ret = null;
    try {
        Type[] t = this.getField(12);  
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
   * Returns a count of the number of repetitions of Randomized Study Arm (CSR-12).
   */
  public int getRandomizedStudyArmReps() {
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
   * Inserts a repetition of Randomized Study Arm (CSR-12) at a given index and returns it.
   * @param index The index
   */
  public CWE insertRandomizedStudyArm(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(12, index);
  }

  /**
   * Removes a repetition of Randomized Study Arm (CSR-12) at a given index and returns it.
   * @param index The index
   */
  public CWE removeRandomizedStudyArm(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(12, index);
  }

  /**
   * Returns a single repetition of Randomized Study Arm (CSR-12).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getCsr12_RandomizedStudyArm(int rep) throws HL7Exception {
    CWE ret = null;
    try {
        Type t = this.getField(12, rep);
        ret = (CWE)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Randomized Study Arm (CSR-12).
   */
  public CWE[] getCsr12_RandomizedStudyArm() {
     CWE[] ret = null;
    try {
        Type[] t = this.getField(12);  
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
   * Returns a count of the number of repetitions of Randomized Study Arm (CSR-12).
   */
  public int getCsr12_RandomizedStudyArmReps() {
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
   * Inserts a repetition of Randomized Study Arm (CSR-12) at a given index and returns it.
   * @param index The index
   */
  public CWE insertCsr12_RandomizedStudyArm(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(12, index);
  }

  /**
   * Removes a repetition of Randomized Study Arm (CSR-12) at a given index and returns it.
   * @param index The index
   */
  public CWE removeCsr12_RandomizedStudyArm(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(12, index);
  }

  /**
   * Returns a single repetition of Stratum for Study Randomization (CSR-13).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getStratumForStudyRandomization(int rep) throws HL7Exception {
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
   * Returns all repetitions of Stratum for Study Randomization (CSR-13).
   */
  public CWE[] getStratumForStudyRandomization() {
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
   * Returns a count of the number of repetitions of Stratum for Study Randomization (CSR-13).
   */
  public int getStratumForStudyRandomizationReps() {
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
   * Inserts a repetition of Stratum for Study Randomization (CSR-13) at a given index and returns it.
   * @param index The index
   */
  public CWE insertStratumForStudyRandomization(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(13, index);
  }

  /**
   * Removes a repetition of Stratum for Study Randomization (CSR-13) at a given index and returns it.
   * @param index The index
   */
  public CWE removeStratumForStudyRandomization(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(13, index);
  }

  /**
   * Returns a single repetition of Stratum for Study Randomization (CSR-13).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getCsr13_StratumForStudyRandomization(int rep) throws HL7Exception {
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
   * Returns all repetitions of Stratum for Study Randomization (CSR-13).
   */
  public CWE[] getCsr13_StratumForStudyRandomization() {
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
   * Returns a count of the number of repetitions of Stratum for Study Randomization (CSR-13).
   */
  public int getCsr13_StratumForStudyRandomizationReps() {
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
   * Inserts a repetition of Stratum for Study Randomization (CSR-13) at a given index and returns it.
   * @param index The index
   */
  public CWE insertCsr13_StratumForStudyRandomization(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(13, index);
  }

  /**
   * Removes a repetition of Stratum for Study Randomization (CSR-13) at a given index and returns it.
   * @param index The index
   */
  public CWE removeCsr13_StratumForStudyRandomization(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(13, index);
  }

  /**
   * Returns Patient Evaluability Status (CSR-14).
   */
  public CWE getPatientEvaluabilityStatus()  {
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
   * Returns Patient Evaluability Status (CSR-14).
   */
  public CWE getCsr14_PatientEvaluabilityStatus()  {
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
   * Returns Date/time Ended Study (CSR-15).
   */
  public DTM getDateTimeEndedStudy()  {
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
   * Returns Date/time Ended Study (CSR-15).
   */
  public DTM getCsr15_DateTimeEndedStudy()  {
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
   * Returns Reason Ended Study (CSR-16).
   */
  public CWE getReasonEndedStudy()  {
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
   * Returns Reason Ended Study (CSR-16).
   */
  public CWE getCsr16_ReasonEndedStudy()  {
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

   protected Type createNewTypeWithoutReflection(int field) {
      switch (field) {
         case 0: return new ca.uhn.hl7v2.model.v26.datatype.EI(getMessage());
         case 1: return new ca.uhn.hl7v2.model.v26.datatype.EI(getMessage());
         case 2: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 3: return new ca.uhn.hl7v2.model.v26.datatype.CX(getMessage());
         case 4: return new ca.uhn.hl7v2.model.v26.datatype.CX(getMessage());
         case 5: return new ca.uhn.hl7v2.model.v26.datatype.DTM(getMessage());
         case 6: return new ca.uhn.hl7v2.model.v26.datatype.XCN(getMessage());
         case 7: return new ca.uhn.hl7v2.model.v26.datatype.XCN(getMessage());
         case 8: return new ca.uhn.hl7v2.model.v26.datatype.DTM(getMessage());
         case 9: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 10: return new ca.uhn.hl7v2.model.v26.datatype.DTM(getMessage());
         case 11: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 12: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 13: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 14: return new ca.uhn.hl7v2.model.v26.datatype.DTM(getMessage());
         case 15: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         default: return null;
      }
   }

}