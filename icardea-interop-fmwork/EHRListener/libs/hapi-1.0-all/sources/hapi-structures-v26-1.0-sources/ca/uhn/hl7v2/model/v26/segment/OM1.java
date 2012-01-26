package ca.uhn.hl7v2.model.v26.segment;

import ca.uhn.hl7v2.model.*;
import ca.uhn.hl7v2.model.v26.datatype.*;
import ca.uhn.log.HapiLogFactory;
import ca.uhn.hl7v2.parser.ModelClassFactory;
import ca.uhn.hl7v2.HL7Exception;

/**
 * <p>Represents an HL7 OM1 message segment. 
 * This segment has the following fields:</p><p>
 * OM1-1: Sequence Number - Test/Observation Master File (NM)<br> 
 * OM1-2: Producer's Service/Test/Observation ID (CWE)<br> 
 * OM1-3: Permitted Data Types (ID)<br> 
 * OM1-4: Specimen Required (ID)<br> 
 * OM1-5: Producer ID (CWE)<br> 
 * OM1-6: Observation Description (TX)<br> 
 * OM1-7: Other Service/Test/Observation IDs for the Observation (CWE)<br> 
 * OM1-8: Other Names (ST)<br> 
 * OM1-9: Preferred Report Name for the Observation (ST)<br> 
 * OM1-10: Preferred Short Name or Mnemonic for Observation (ST)<br> 
 * OM1-11: Preferred Long Name for the Observation (ST)<br> 
 * OM1-12: Orderability (ID)<br> 
 * OM1-13: Identity of Instrument Used to Perform this Study (CWE)<br> 
 * OM1-14: Coded Representation of Method (CWE)<br> 
 * OM1-15: Portable Device Indicator (ID)<br> 
 * OM1-16: Observation Producing Department/Section (CWE)<br> 
 * OM1-17: Telephone Number of Section (XTN)<br> 
 * OM1-18: Nature of Service/Test/Observation (IS)<br> 
 * OM1-19: Report Subheader (CWE)<br> 
 * OM1-20: Report Display Order (ST)<br> 
 * OM1-21: Date/Time Stamp for any change in Definition for the Observation (DTM)<br> 
 * OM1-22: Effective Date/Time of Change (DTM)<br> 
 * OM1-23: Typical Turn-Around Time (NM)<br> 
 * OM1-24: Processing Time (NM)<br> 
 * OM1-25: Processing Priority (ID)<br> 
 * OM1-26: Reporting Priority (ID)<br> 
 * OM1-27: Outside Site(s) Where Observation may be Performed (CWE)<br> 
 * OM1-28: Address of Outside Site(s) (XAD)<br> 
 * OM1-29: Phone Number of Outside Site (XTN)<br> 
 * OM1-30: Confidentiality Code (CWE)<br> 
 * OM1-31: Observations Required to Interpret the Observation (CWE)<br> 
 * OM1-32: Interpretation of Observations (TX)<br> 
 * OM1-33: Contraindications to Observations (CWE)<br> 
 * OM1-34: Reflex Tests/Observations (CWE)<br> 
 * OM1-35: Rules that Trigger Reflex Testing (TX)<br> 
 * OM1-36: Fixed Canned Message (CWE)<br> 
 * OM1-37: Patient Preparation (TX)<br> 
 * OM1-38: Procedure Medication (CWE)<br> 
 * OM1-39: Factors that may Affect the Observation (TX)<br> 
 * OM1-40: Service/Test/Observation Performance Schedule (ST)<br> 
 * OM1-41: Description of Test Methods (TX)<br> 
 * OM1-42: Kind of Quantity Observed (CWE)<br> 
 * OM1-43: Point Versus Interval (CWE)<br> 
 * OM1-44: Challenge Information (TX)<br> 
 * OM1-45: Relationship Modifier (CWE)<br> 
 * OM1-46: Target Anatomic Site Of Test (CWE)<br> 
 * OM1-47: Modality Of Imaging Measurement (CWE)<br> 
 * </p><p>The get...() methods return data from individual fields.  These methods 
 * do not throw exceptions and may therefore have to handle exceptions internally.  
 * If an exception is handled internally, it is logged and null is returned.  
 * This is not expected to happen - if it does happen this indicates not so much 
 * an exceptional circumstance as a bug in the code for this class.</p>    
 */
public class OM1 extends AbstractSegment  {

  /**
   * Creates a OM1 (General Segment) segment object that belongs to the given 
   * message.  
   */
  public OM1(Group parent, ModelClassFactory factory) {
    super(parent, factory);
    Message message = getMessage();
    try {
       this.add(NM.class, true, 1, 4, new Object[]{message}, "Sequence Number - Test/Observation Master File");
       this.add(CWE.class, true, 1, 250, new Object[]{message}, "Producer's Service/Test/Observation ID");
       this.add(ID.class, false, 0, 12, new Object[]{message, new Integer(125)}, "Permitted Data Types");
       this.add(ID.class, true, 1, 1, new Object[]{message, new Integer(136)}, "Specimen Required");
       this.add(CWE.class, true, 1, 250, new Object[]{message}, "Producer ID");
       this.add(TX.class, false, 1, 200, new Object[]{message}, "Observation Description");
       this.add(CWE.class, false, 1, 250, new Object[]{message}, "Other Service/Test/Observation IDs for the Observation");
       this.add(ST.class, true, 0, 200, new Object[]{message}, "Other Names");
       this.add(ST.class, false, 1, 30, new Object[]{message}, "Preferred Report Name for the Observation");
       this.add(ST.class, false, 1, 8, new Object[]{message}, "Preferred Short Name or Mnemonic for Observation");
       this.add(ST.class, false, 1, 200, new Object[]{message}, "Preferred Long Name for the Observation");
       this.add(ID.class, false, 1, 1, new Object[]{message, new Integer(136)}, "Orderability");
       this.add(CWE.class, false, 0, 250, new Object[]{message}, "Identity of Instrument Used to Perform this Study");
       this.add(CWE.class, false, 0, 250, new Object[]{message}, "Coded Representation of Method");
       this.add(ID.class, false, 1, 1, new Object[]{message, new Integer(136)}, "Portable Device Indicator");
       this.add(CWE.class, false, 0, 250, new Object[]{message}, "Observation Producing Department/Section");
       this.add(XTN.class, false, 1, 250, new Object[]{message}, "Telephone Number of Section");
       this.add(IS.class, true, 1, 1, new Object[]{message, new Integer(174)}, "Nature of Service/Test/Observation");
       this.add(CWE.class, false, 1, 250, new Object[]{message}, "Report Subheader");
       this.add(ST.class, false, 1, 20, new Object[]{message}, "Report Display Order");
       this.add(DTM.class, false, 1, 24, new Object[]{message}, "Date/Time Stamp for any change in Definition for the Observation");
       this.add(DTM.class, false, 1, 24, new Object[]{message}, "Effective Date/Time of Change");
       this.add(NM.class, false, 1, 20, new Object[]{message}, "Typical Turn-Around Time");
       this.add(NM.class, false, 1, 20, new Object[]{message}, "Processing Time");
       this.add(ID.class, false, 0, 40, new Object[]{message, new Integer(168)}, "Processing Priority");
       this.add(ID.class, false, 1, 5, new Object[]{message, new Integer(169)}, "Reporting Priority");
       this.add(CWE.class, false, 0, 250, new Object[]{message}, "Outside Site(s) Where Observation may be Performed");
       this.add(XAD.class, false, 0, 250, new Object[]{message}, "Address of Outside Site(s)");
       this.add(XTN.class, false, 1, 250, new Object[]{message}, "Phone Number of Outside Site");
       this.add(CWE.class, false, 1, 250, new Object[]{message}, "Confidentiality Code");
       this.add(CWE.class, false, 1, 250, new Object[]{message}, "Observations Required to Interpret the Observation");
       this.add(TX.class, false, 1, 65536, new Object[]{message}, "Interpretation of Observations");
       this.add(CWE.class, false, 1, 250, new Object[]{message}, "Contraindications to Observations");
       this.add(CWE.class, false, 0, 250, new Object[]{message}, "Reflex Tests/Observations");
       this.add(TX.class, false, 1, 80, new Object[]{message}, "Rules that Trigger Reflex Testing");
       this.add(CWE.class, false, 1, 250, new Object[]{message}, "Fixed Canned Message");
       this.add(TX.class, false, 1, 200, new Object[]{message}, "Patient Preparation");
       this.add(CWE.class, false, 1, 250, new Object[]{message}, "Procedure Medication");
       this.add(TX.class, false, 1, 200, new Object[]{message}, "Factors that may Affect the Observation");
       this.add(ST.class, false, 0, 60, new Object[]{message}, "Service/Test/Observation Performance Schedule");
       this.add(TX.class, false, 1, 65536, new Object[]{message}, "Description of Test Methods");
       this.add(CWE.class, false, 1, 250, new Object[]{message}, "Kind of Quantity Observed");
       this.add(CWE.class, false, 1, 250, new Object[]{message}, "Point Versus Interval");
       this.add(TX.class, false, 1, 200, new Object[]{message}, "Challenge Information");
       this.add(CWE.class, false, 1, 250, new Object[]{message}, "Relationship Modifier");
       this.add(CWE.class, false, 1, 250, new Object[]{message}, "Target Anatomic Site Of Test");
       this.add(CWE.class, false, 1, 250, new Object[]{message}, "Modality Of Imaging Measurement");
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Can't instantiate " + this.getClass().getName(), he);
    }
  }

  /**
   * Returns Sequence Number - Test/Observation Master File (OM1-1).
   */
  public NM getSequenceNumberTestObservationMasterFile()  {
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
   * Returns Sequence Number - Test/Observation Master File (OM1-1).
   */
  public NM getOm11_SequenceNumberTestObservationMasterFile()  {
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
   * Returns Producer's Service/Test/Observation ID (OM1-2).
   */
  public CWE getProducerSServiceTestObservationID()  {
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
   * Returns Producer's Service/Test/Observation ID (OM1-2).
   */
  public CWE getOm12_ProducerSServiceTestObservationID()  {
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
   * Returns a single repetition of Permitted Data Types (OM1-3).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public ID getPermittedDataTypes(int rep) throws HL7Exception {
    ID ret = null;
    try {
        Type t = this.getField(3, rep);
        ret = (ID)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Permitted Data Types (OM1-3).
   */
  public ID[] getPermittedDataTypes() {
     ID[] ret = null;
    try {
        Type[] t = this.getField(3);  
        ret = new ID[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (ID)t[i];
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
   * Returns a count of the number of repetitions of Permitted Data Types (OM1-3).
   */
  public int getPermittedDataTypesReps() {
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
   * Inserts a repetition of Permitted Data Types (OM1-3) at a given index and returns it.
   * @param index The index
   */
  public ID insertPermittedDataTypes(int index) throws HL7Exception {
     return (ID) super.insertRepetition(3, index);
  }

  /**
   * Removes a repetition of Permitted Data Types (OM1-3) at a given index and returns it.
   * @param index The index
   */
  public ID removePermittedDataTypes(int index) throws HL7Exception {
     return (ID) super.removeRepetition(3, index);
  }

  /**
   * Returns a single repetition of Permitted Data Types (OM1-3).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public ID getOm13_PermittedDataTypes(int rep) throws HL7Exception {
    ID ret = null;
    try {
        Type t = this.getField(3, rep);
        ret = (ID)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Permitted Data Types (OM1-3).
   */
  public ID[] getOm13_PermittedDataTypes() {
     ID[] ret = null;
    try {
        Type[] t = this.getField(3);  
        ret = new ID[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (ID)t[i];
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
   * Returns a count of the number of repetitions of Permitted Data Types (OM1-3).
   */
  public int getOm13_PermittedDataTypesReps() {
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
   * Inserts a repetition of Permitted Data Types (OM1-3) at a given index and returns it.
   * @param index The index
   */
  public ID insertOm13_PermittedDataTypes(int index) throws HL7Exception {
     return (ID) super.insertRepetition(3, index);
  }

  /**
   * Removes a repetition of Permitted Data Types (OM1-3) at a given index and returns it.
   * @param index The index
   */
  public ID removeOm13_PermittedDataTypes(int index) throws HL7Exception {
     return (ID) super.removeRepetition(3, index);
  }

  /**
   * Returns Specimen Required (OM1-4).
   */
  public ID getSpecimenRequired()  {
    ID ret = null;
    try {
        Type t = this.getField(4, 0);
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
   * Returns Specimen Required (OM1-4).
   */
  public ID getOm14_SpecimenRequired()  {
    ID ret = null;
    try {
        Type t = this.getField(4, 0);
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
   * Returns Producer ID (OM1-5).
   */
  public CWE getProducerID()  {
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
   * Returns Producer ID (OM1-5).
   */
  public CWE getOm15_ProducerID()  {
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
   * Returns Observation Description (OM1-6).
   */
  public TX getObservationDescription()  {
    TX ret = null;
    try {
        Type t = this.getField(6, 0);
        ret = (TX)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns Observation Description (OM1-6).
   */
  public TX getOm16_ObservationDescription()  {
    TX ret = null;
    try {
        Type t = this.getField(6, 0);
        ret = (TX)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns Other Service/Test/Observation IDs for the Observation (OM1-7).
   */
  public CWE getOtherServiceTestObservationIDsForTheObservation()  {
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
   * Returns Other Service/Test/Observation IDs for the Observation (OM1-7).
   */
  public CWE getOm17_OtherServiceTestObservationIDsForTheObservation()  {
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
   * Returns a single repetition of Other Names (OM1-8).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public ST getOtherNames(int rep) throws HL7Exception {
    ST ret = null;
    try {
        Type t = this.getField(8, rep);
        ret = (ST)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Other Names (OM1-8).
   */
  public ST[] getOtherNames() {
     ST[] ret = null;
    try {
        Type[] t = this.getField(8);  
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
   * Returns a count of the number of repetitions of Other Names (OM1-8).
   */
  public int getOtherNamesReps() {
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
   * Inserts a repetition of Other Names (OM1-8) at a given index and returns it.
   * @param index The index
   */
  public ST insertOtherNames(int index) throws HL7Exception {
     return (ST) super.insertRepetition(8, index);
  }

  /**
   * Removes a repetition of Other Names (OM1-8) at a given index and returns it.
   * @param index The index
   */
  public ST removeOtherNames(int index) throws HL7Exception {
     return (ST) super.removeRepetition(8, index);
  }

  /**
   * Returns a single repetition of Other Names (OM1-8).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public ST getOm18_OtherNames(int rep) throws HL7Exception {
    ST ret = null;
    try {
        Type t = this.getField(8, rep);
        ret = (ST)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Other Names (OM1-8).
   */
  public ST[] getOm18_OtherNames() {
     ST[] ret = null;
    try {
        Type[] t = this.getField(8);  
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
   * Returns a count of the number of repetitions of Other Names (OM1-8).
   */
  public int getOm18_OtherNamesReps() {
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
   * Inserts a repetition of Other Names (OM1-8) at a given index and returns it.
   * @param index The index
   */
  public ST insertOm18_OtherNames(int index) throws HL7Exception {
     return (ST) super.insertRepetition(8, index);
  }

  /**
   * Removes a repetition of Other Names (OM1-8) at a given index and returns it.
   * @param index The index
   */
  public ST removeOm18_OtherNames(int index) throws HL7Exception {
     return (ST) super.removeRepetition(8, index);
  }

  /**
   * Returns Preferred Report Name for the Observation (OM1-9).
   */
  public ST getPreferredReportNameForTheObservation()  {
    ST ret = null;
    try {
        Type t = this.getField(9, 0);
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
   * Returns Preferred Report Name for the Observation (OM1-9).
   */
  public ST getOm19_PreferredReportNameForTheObservation()  {
    ST ret = null;
    try {
        Type t = this.getField(9, 0);
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
   * Returns Preferred Short Name or Mnemonic for Observation (OM1-10).
   */
  public ST getPreferredShortNameOrMnemonicForObservation()  {
    ST ret = null;
    try {
        Type t = this.getField(10, 0);
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
   * Returns Preferred Short Name or Mnemonic for Observation (OM1-10).
   */
  public ST getOm110_PreferredShortNameOrMnemonicForObservation()  {
    ST ret = null;
    try {
        Type t = this.getField(10, 0);
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
   * Returns Preferred Long Name for the Observation (OM1-11).
   */
  public ST getPreferredLongNameForTheObservation()  {
    ST ret = null;
    try {
        Type t = this.getField(11, 0);
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
   * Returns Preferred Long Name for the Observation (OM1-11).
   */
  public ST getOm111_PreferredLongNameForTheObservation()  {
    ST ret = null;
    try {
        Type t = this.getField(11, 0);
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
   * Returns Orderability (OM1-12).
   */
  public ID getOrderability()  {
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
   * Returns Orderability (OM1-12).
   */
  public ID getOm112_Orderability()  {
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
   * Returns a single repetition of Identity of Instrument Used to Perform this Study (OM1-13).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getIdentityOfInstrumentUsedToPerformThisStudy(int rep) throws HL7Exception {
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
   * Returns all repetitions of Identity of Instrument Used to Perform this Study (OM1-13).
   */
  public CWE[] getIdentityOfInstrumentUsedToPerformThisStudy() {
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
   * Returns a count of the number of repetitions of Identity of Instrument Used to Perform this Study (OM1-13).
   */
  public int getIdentityOfInstrumentUsedToPerformThisStudyReps() {
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
   * Inserts a repetition of Identity of Instrument Used to Perform this Study (OM1-13) at a given index and returns it.
   * @param index The index
   */
  public CWE insertIdentityOfInstrumentUsedToPerformThisStudy(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(13, index);
  }

  /**
   * Removes a repetition of Identity of Instrument Used to Perform this Study (OM1-13) at a given index and returns it.
   * @param index The index
   */
  public CWE removeIdentityOfInstrumentUsedToPerformThisStudy(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(13, index);
  }

  /**
   * Returns a single repetition of Identity of Instrument Used to Perform this Study (OM1-13).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getOm113_IdentityOfInstrumentUsedToPerformThisStudy(int rep) throws HL7Exception {
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
   * Returns all repetitions of Identity of Instrument Used to Perform this Study (OM1-13).
   */
  public CWE[] getOm113_IdentityOfInstrumentUsedToPerformThisStudy() {
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
   * Returns a count of the number of repetitions of Identity of Instrument Used to Perform this Study (OM1-13).
   */
  public int getOm113_IdentityOfInstrumentUsedToPerformThisStudyReps() {
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
   * Inserts a repetition of Identity of Instrument Used to Perform this Study (OM1-13) at a given index and returns it.
   * @param index The index
   */
  public CWE insertOm113_IdentityOfInstrumentUsedToPerformThisStudy(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(13, index);
  }

  /**
   * Removes a repetition of Identity of Instrument Used to Perform this Study (OM1-13) at a given index and returns it.
   * @param index The index
   */
  public CWE removeOm113_IdentityOfInstrumentUsedToPerformThisStudy(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(13, index);
  }

  /**
   * Returns a single repetition of Coded Representation of Method (OM1-14).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getCodedRepresentationOfMethod(int rep) throws HL7Exception {
    CWE ret = null;
    try {
        Type t = this.getField(14, rep);
        ret = (CWE)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Coded Representation of Method (OM1-14).
   */
  public CWE[] getCodedRepresentationOfMethod() {
     CWE[] ret = null;
    try {
        Type[] t = this.getField(14);  
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
   * Returns a count of the number of repetitions of Coded Representation of Method (OM1-14).
   */
  public int getCodedRepresentationOfMethodReps() {
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
   * Inserts a repetition of Coded Representation of Method (OM1-14) at a given index and returns it.
   * @param index The index
   */
  public CWE insertCodedRepresentationOfMethod(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(14, index);
  }

  /**
   * Removes a repetition of Coded Representation of Method (OM1-14) at a given index and returns it.
   * @param index The index
   */
  public CWE removeCodedRepresentationOfMethod(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(14, index);
  }

  /**
   * Returns a single repetition of Coded Representation of Method (OM1-14).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getOm114_CodedRepresentationOfMethod(int rep) throws HL7Exception {
    CWE ret = null;
    try {
        Type t = this.getField(14, rep);
        ret = (CWE)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Coded Representation of Method (OM1-14).
   */
  public CWE[] getOm114_CodedRepresentationOfMethod() {
     CWE[] ret = null;
    try {
        Type[] t = this.getField(14);  
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
   * Returns a count of the number of repetitions of Coded Representation of Method (OM1-14).
   */
  public int getOm114_CodedRepresentationOfMethodReps() {
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
   * Inserts a repetition of Coded Representation of Method (OM1-14) at a given index and returns it.
   * @param index The index
   */
  public CWE insertOm114_CodedRepresentationOfMethod(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(14, index);
  }

  /**
   * Removes a repetition of Coded Representation of Method (OM1-14) at a given index and returns it.
   * @param index The index
   */
  public CWE removeOm114_CodedRepresentationOfMethod(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(14, index);
  }

  /**
   * Returns Portable Device Indicator (OM1-15).
   */
  public ID getPortableDeviceIndicator()  {
    ID ret = null;
    try {
        Type t = this.getField(15, 0);
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
   * Returns Portable Device Indicator (OM1-15).
   */
  public ID getOm115_PortableDeviceIndicator()  {
    ID ret = null;
    try {
        Type t = this.getField(15, 0);
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
   * Returns a single repetition of Observation Producing Department/Section (OM1-16).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getObservationProducingDepartmentSection(int rep) throws HL7Exception {
    CWE ret = null;
    try {
        Type t = this.getField(16, rep);
        ret = (CWE)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Observation Producing Department/Section (OM1-16).
   */
  public CWE[] getObservationProducingDepartmentSection() {
     CWE[] ret = null;
    try {
        Type[] t = this.getField(16);  
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
   * Returns a count of the number of repetitions of Observation Producing Department/Section (OM1-16).
   */
  public int getObservationProducingDepartmentSectionReps() {
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
   * Inserts a repetition of Observation Producing Department/Section (OM1-16) at a given index and returns it.
   * @param index The index
   */
  public CWE insertObservationProducingDepartmentSection(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(16, index);
  }

  /**
   * Removes a repetition of Observation Producing Department/Section (OM1-16) at a given index and returns it.
   * @param index The index
   */
  public CWE removeObservationProducingDepartmentSection(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(16, index);
  }

  /**
   * Returns a single repetition of Observation Producing Department/Section (OM1-16).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getOm116_ObservationProducingDepartmentSection(int rep) throws HL7Exception {
    CWE ret = null;
    try {
        Type t = this.getField(16, rep);
        ret = (CWE)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Observation Producing Department/Section (OM1-16).
   */
  public CWE[] getOm116_ObservationProducingDepartmentSection() {
     CWE[] ret = null;
    try {
        Type[] t = this.getField(16);  
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
   * Returns a count of the number of repetitions of Observation Producing Department/Section (OM1-16).
   */
  public int getOm116_ObservationProducingDepartmentSectionReps() {
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
   * Inserts a repetition of Observation Producing Department/Section (OM1-16) at a given index and returns it.
   * @param index The index
   */
  public CWE insertOm116_ObservationProducingDepartmentSection(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(16, index);
  }

  /**
   * Removes a repetition of Observation Producing Department/Section (OM1-16) at a given index and returns it.
   * @param index The index
   */
  public CWE removeOm116_ObservationProducingDepartmentSection(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(16, index);
  }

  /**
   * Returns Telephone Number of Section (OM1-17).
   */
  public XTN getTelephoneNumberOfSection()  {
    XTN ret = null;
    try {
        Type t = this.getField(17, 0);
        ret = (XTN)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns Telephone Number of Section (OM1-17).
   */
  public XTN getOm117_TelephoneNumberOfSection()  {
    XTN ret = null;
    try {
        Type t = this.getField(17, 0);
        ret = (XTN)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns Nature of Service/Test/Observation (OM1-18).
   */
  public IS getNatureOfServiceTestObservation()  {
    IS ret = null;
    try {
        Type t = this.getField(18, 0);
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
   * Returns Nature of Service/Test/Observation (OM1-18).
   */
  public IS getOm118_NatureOfServiceTestObservation()  {
    IS ret = null;
    try {
        Type t = this.getField(18, 0);
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
   * Returns Report Subheader (OM1-19).
   */
  public CWE getReportSubheader()  {
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
   * Returns Report Subheader (OM1-19).
   */
  public CWE getOm119_ReportSubheader()  {
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
   * Returns Report Display Order (OM1-20).
   */
  public ST getReportDisplayOrder()  {
    ST ret = null;
    try {
        Type t = this.getField(20, 0);
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
   * Returns Report Display Order (OM1-20).
   */
  public ST getOm120_ReportDisplayOrder()  {
    ST ret = null;
    try {
        Type t = this.getField(20, 0);
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
   * Returns Date/Time Stamp for any change in Definition for the Observation (OM1-21).
   */
  public DTM getDateTimeStampForAnyChangeInDefinitionForTheObservation()  {
    DTM ret = null;
    try {
        Type t = this.getField(21, 0);
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
   * Returns Date/Time Stamp for any change in Definition for the Observation (OM1-21).
   */
  public DTM getOm121_DateTimeStampForAnyChangeInDefinitionForTheObservation()  {
    DTM ret = null;
    try {
        Type t = this.getField(21, 0);
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
   * Returns Effective Date/Time of Change (OM1-22).
   */
  public DTM getEffectiveDateTimeOfChange()  {
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
   * Returns Effective Date/Time of Change (OM1-22).
   */
  public DTM getOm122_EffectiveDateTimeOfChange()  {
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
   * Returns Typical Turn-Around Time (OM1-23).
   */
  public NM getTypicalTurnAroundTime()  {
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
   * Returns Typical Turn-Around Time (OM1-23).
   */
  public NM getOm123_TypicalTurnAroundTime()  {
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
   * Returns Processing Time (OM1-24).
   */
  public NM getProcessingTime()  {
    NM ret = null;
    try {
        Type t = this.getField(24, 0);
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
   * Returns Processing Time (OM1-24).
   */
  public NM getOm124_ProcessingTime()  {
    NM ret = null;
    try {
        Type t = this.getField(24, 0);
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
   * Returns a single repetition of Processing Priority (OM1-25).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public ID getProcessingPriority(int rep) throws HL7Exception {
    ID ret = null;
    try {
        Type t = this.getField(25, rep);
        ret = (ID)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Processing Priority (OM1-25).
   */
  public ID[] getProcessingPriority() {
     ID[] ret = null;
    try {
        Type[] t = this.getField(25);  
        ret = new ID[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (ID)t[i];
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
   * Returns a count of the number of repetitions of Processing Priority (OM1-25).
   */
  public int getProcessingPriorityReps() {
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
   * Inserts a repetition of Processing Priority (OM1-25) at a given index and returns it.
   * @param index The index
   */
  public ID insertProcessingPriority(int index) throws HL7Exception {
     return (ID) super.insertRepetition(25, index);
  }

  /**
   * Removes a repetition of Processing Priority (OM1-25) at a given index and returns it.
   * @param index The index
   */
  public ID removeProcessingPriority(int index) throws HL7Exception {
     return (ID) super.removeRepetition(25, index);
  }

  /**
   * Returns a single repetition of Processing Priority (OM1-25).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public ID getOm125_ProcessingPriority(int rep) throws HL7Exception {
    ID ret = null;
    try {
        Type t = this.getField(25, rep);
        ret = (ID)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Processing Priority (OM1-25).
   */
  public ID[] getOm125_ProcessingPriority() {
     ID[] ret = null;
    try {
        Type[] t = this.getField(25);  
        ret = new ID[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (ID)t[i];
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
   * Returns a count of the number of repetitions of Processing Priority (OM1-25).
   */
  public int getOm125_ProcessingPriorityReps() {
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
   * Inserts a repetition of Processing Priority (OM1-25) at a given index and returns it.
   * @param index The index
   */
  public ID insertOm125_ProcessingPriority(int index) throws HL7Exception {
     return (ID) super.insertRepetition(25, index);
  }

  /**
   * Removes a repetition of Processing Priority (OM1-25) at a given index and returns it.
   * @param index The index
   */
  public ID removeOm125_ProcessingPriority(int index) throws HL7Exception {
     return (ID) super.removeRepetition(25, index);
  }

  /**
   * Returns Reporting Priority (OM1-26).
   */
  public ID getReportingPriority()  {
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
   * Returns Reporting Priority (OM1-26).
   */
  public ID getOm126_ReportingPriority()  {
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
   * Returns a single repetition of Outside Site(s) Where Observation may be Performed (OM1-27).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getOutsideSiteSWhereObservationMayBePerformed(int rep) throws HL7Exception {
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
   * Returns all repetitions of Outside Site(s) Where Observation may be Performed (OM1-27).
   */
  public CWE[] getOutsideSiteSWhereObservationMayBePerformed() {
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
   * Returns a count of the number of repetitions of Outside Site(s) Where Observation may be Performed (OM1-27).
   */
  public int getOutsideSiteSWhereObservationMayBePerformedReps() {
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
   * Inserts a repetition of Outside Site(s) Where Observation may be Performed (OM1-27) at a given index and returns it.
   * @param index The index
   */
  public CWE insertOutsideSiteSWhereObservationMayBePerformed(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(27, index);
  }

  /**
   * Removes a repetition of Outside Site(s) Where Observation may be Performed (OM1-27) at a given index and returns it.
   * @param index The index
   */
  public CWE removeOutsideSiteSWhereObservationMayBePerformed(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(27, index);
  }

  /**
   * Returns a single repetition of Outside Site(s) Where Observation may be Performed (OM1-27).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getOm127_OutsideSiteSWhereObservationMayBePerformed(int rep) throws HL7Exception {
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
   * Returns all repetitions of Outside Site(s) Where Observation may be Performed (OM1-27).
   */
  public CWE[] getOm127_OutsideSiteSWhereObservationMayBePerformed() {
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
   * Returns a count of the number of repetitions of Outside Site(s) Where Observation may be Performed (OM1-27).
   */
  public int getOm127_OutsideSiteSWhereObservationMayBePerformedReps() {
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
   * Inserts a repetition of Outside Site(s) Where Observation may be Performed (OM1-27) at a given index and returns it.
   * @param index The index
   */
  public CWE insertOm127_OutsideSiteSWhereObservationMayBePerformed(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(27, index);
  }

  /**
   * Removes a repetition of Outside Site(s) Where Observation may be Performed (OM1-27) at a given index and returns it.
   * @param index The index
   */
  public CWE removeOm127_OutsideSiteSWhereObservationMayBePerformed(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(27, index);
  }

  /**
   * Returns a single repetition of Address of Outside Site(s) (OM1-28).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XAD getAddressOfOutsideSiteS(int rep) throws HL7Exception {
    XAD ret = null;
    try {
        Type t = this.getField(28, rep);
        ret = (XAD)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Address of Outside Site(s) (OM1-28).
   */
  public XAD[] getAddressOfOutsideSiteS() {
     XAD[] ret = null;
    try {
        Type[] t = this.getField(28);  
        ret = new XAD[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (XAD)t[i];
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
   * Returns a count of the number of repetitions of Address of Outside Site(s) (OM1-28).
   */
  public int getAddressOfOutsideSiteSReps() {
    try {
        return this.getField(28).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Address of Outside Site(s) (OM1-28) at a given index and returns it.
   * @param index The index
   */
  public XAD insertAddressOfOutsideSiteS(int index) throws HL7Exception {
     return (XAD) super.insertRepetition(28, index);
  }

  /**
   * Removes a repetition of Address of Outside Site(s) (OM1-28) at a given index and returns it.
   * @param index The index
   */
  public XAD removeAddressOfOutsideSiteS(int index) throws HL7Exception {
     return (XAD) super.removeRepetition(28, index);
  }

  /**
   * Returns a single repetition of Address of Outside Site(s) (OM1-28).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XAD getOm128_AddressOfOutsideSiteS(int rep) throws HL7Exception {
    XAD ret = null;
    try {
        Type t = this.getField(28, rep);
        ret = (XAD)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Address of Outside Site(s) (OM1-28).
   */
  public XAD[] getOm128_AddressOfOutsideSiteS() {
     XAD[] ret = null;
    try {
        Type[] t = this.getField(28);  
        ret = new XAD[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (XAD)t[i];
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
   * Returns a count of the number of repetitions of Address of Outside Site(s) (OM1-28).
   */
  public int getOm128_AddressOfOutsideSiteSReps() {
    try {
        return this.getField(28).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Address of Outside Site(s) (OM1-28) at a given index and returns it.
   * @param index The index
   */
  public XAD insertOm128_AddressOfOutsideSiteS(int index) throws HL7Exception {
     return (XAD) super.insertRepetition(28, index);
  }

  /**
   * Removes a repetition of Address of Outside Site(s) (OM1-28) at a given index and returns it.
   * @param index The index
   */
  public XAD removeOm128_AddressOfOutsideSiteS(int index) throws HL7Exception {
     return (XAD) super.removeRepetition(28, index);
  }

  /**
   * Returns Phone Number of Outside Site (OM1-29).
   */
  public XTN getPhoneNumberOfOutsideSite()  {
    XTN ret = null;
    try {
        Type t = this.getField(29, 0);
        ret = (XTN)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns Phone Number of Outside Site (OM1-29).
   */
  public XTN getOm129_PhoneNumberOfOutsideSite()  {
    XTN ret = null;
    try {
        Type t = this.getField(29, 0);
        ret = (XTN)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns Confidentiality Code (OM1-30).
   */
  public CWE getConfidentialityCode()  {
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
   * Returns Confidentiality Code (OM1-30).
   */
  public CWE getOm130_ConfidentialityCode()  {
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
   * Returns Observations Required to Interpret the Observation (OM1-31).
   */
  public CWE getObservationsRequiredToInterpretTheObservation()  {
    CWE ret = null;
    try {
        Type t = this.getField(31, 0);
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
   * Returns Observations Required to Interpret the Observation (OM1-31).
   */
  public CWE getOm131_ObservationsRequiredToInterpretTheObservation()  {
    CWE ret = null;
    try {
        Type t = this.getField(31, 0);
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
   * Returns Interpretation of Observations (OM1-32).
   */
  public TX getInterpretationOfObservations()  {
    TX ret = null;
    try {
        Type t = this.getField(32, 0);
        ret = (TX)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns Interpretation of Observations (OM1-32).
   */
  public TX getOm132_InterpretationOfObservations()  {
    TX ret = null;
    try {
        Type t = this.getField(32, 0);
        ret = (TX)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns Contraindications to Observations (OM1-33).
   */
  public CWE getContraindicationsToObservations()  {
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
   * Returns Contraindications to Observations (OM1-33).
   */
  public CWE getOm133_ContraindicationsToObservations()  {
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
   * Returns a single repetition of Reflex Tests/Observations (OM1-34).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getReflexTestsObservations(int rep) throws HL7Exception {
    CWE ret = null;
    try {
        Type t = this.getField(34, rep);
        ret = (CWE)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Reflex Tests/Observations (OM1-34).
   */
  public CWE[] getReflexTestsObservations() {
     CWE[] ret = null;
    try {
        Type[] t = this.getField(34);  
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
   * Returns a count of the number of repetitions of Reflex Tests/Observations (OM1-34).
   */
  public int getReflexTestsObservationsReps() {
    try {
        return this.getField(34).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Reflex Tests/Observations (OM1-34) at a given index and returns it.
   * @param index The index
   */
  public CWE insertReflexTestsObservations(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(34, index);
  }

  /**
   * Removes a repetition of Reflex Tests/Observations (OM1-34) at a given index and returns it.
   * @param index The index
   */
  public CWE removeReflexTestsObservations(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(34, index);
  }

  /**
   * Returns a single repetition of Reflex Tests/Observations (OM1-34).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getOm134_ReflexTestsObservations(int rep) throws HL7Exception {
    CWE ret = null;
    try {
        Type t = this.getField(34, rep);
        ret = (CWE)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Reflex Tests/Observations (OM1-34).
   */
  public CWE[] getOm134_ReflexTestsObservations() {
     CWE[] ret = null;
    try {
        Type[] t = this.getField(34);  
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
   * Returns a count of the number of repetitions of Reflex Tests/Observations (OM1-34).
   */
  public int getOm134_ReflexTestsObservationsReps() {
    try {
        return this.getField(34).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Reflex Tests/Observations (OM1-34) at a given index and returns it.
   * @param index The index
   */
  public CWE insertOm134_ReflexTestsObservations(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(34, index);
  }

  /**
   * Removes a repetition of Reflex Tests/Observations (OM1-34) at a given index and returns it.
   * @param index The index
   */
  public CWE removeOm134_ReflexTestsObservations(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(34, index);
  }

  /**
   * Returns Rules that Trigger Reflex Testing (OM1-35).
   */
  public TX getRulesThatTriggerReflexTesting()  {
    TX ret = null;
    try {
        Type t = this.getField(35, 0);
        ret = (TX)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns Rules that Trigger Reflex Testing (OM1-35).
   */
  public TX getOm135_RulesThatTriggerReflexTesting()  {
    TX ret = null;
    try {
        Type t = this.getField(35, 0);
        ret = (TX)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns Fixed Canned Message (OM1-36).
   */
  public CWE getFixedCannedMessage()  {
    CWE ret = null;
    try {
        Type t = this.getField(36, 0);
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
   * Returns Fixed Canned Message (OM1-36).
   */
  public CWE getOm136_FixedCannedMessage()  {
    CWE ret = null;
    try {
        Type t = this.getField(36, 0);
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
   * Returns Patient Preparation (OM1-37).
   */
  public TX getPatientPreparation()  {
    TX ret = null;
    try {
        Type t = this.getField(37, 0);
        ret = (TX)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns Patient Preparation (OM1-37).
   */
  public TX getOm137_PatientPreparation()  {
    TX ret = null;
    try {
        Type t = this.getField(37, 0);
        ret = (TX)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns Procedure Medication (OM1-38).
   */
  public CWE getProcedureMedication()  {
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
   * Returns Procedure Medication (OM1-38).
   */
  public CWE getOm138_ProcedureMedication()  {
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
   * Returns Factors that may Affect the Observation (OM1-39).
   */
  public TX getFactorsThatMayAffectTheObservation()  {
    TX ret = null;
    try {
        Type t = this.getField(39, 0);
        ret = (TX)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns Factors that may Affect the Observation (OM1-39).
   */
  public TX getOm139_FactorsThatMayAffectTheObservation()  {
    TX ret = null;
    try {
        Type t = this.getField(39, 0);
        ret = (TX)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns a single repetition of Service/Test/Observation Performance Schedule (OM1-40).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public ST getServiceTestObservationPerformanceSchedule(int rep) throws HL7Exception {
    ST ret = null;
    try {
        Type t = this.getField(40, rep);
        ret = (ST)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Service/Test/Observation Performance Schedule (OM1-40).
   */
  public ST[] getServiceTestObservationPerformanceSchedule() {
     ST[] ret = null;
    try {
        Type[] t = this.getField(40);  
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
   * Returns a count of the number of repetitions of Service/Test/Observation Performance Schedule (OM1-40).
   */
  public int getServiceTestObservationPerformanceScheduleReps() {
    try {
        return this.getField(40).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Service/Test/Observation Performance Schedule (OM1-40) at a given index and returns it.
   * @param index The index
   */
  public ST insertServiceTestObservationPerformanceSchedule(int index) throws HL7Exception {
     return (ST) super.insertRepetition(40, index);
  }

  /**
   * Removes a repetition of Service/Test/Observation Performance Schedule (OM1-40) at a given index and returns it.
   * @param index The index
   */
  public ST removeServiceTestObservationPerformanceSchedule(int index) throws HL7Exception {
     return (ST) super.removeRepetition(40, index);
  }

  /**
   * Returns a single repetition of Service/Test/Observation Performance Schedule (OM1-40).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public ST getOm140_ServiceTestObservationPerformanceSchedule(int rep) throws HL7Exception {
    ST ret = null;
    try {
        Type t = this.getField(40, rep);
        ret = (ST)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Service/Test/Observation Performance Schedule (OM1-40).
   */
  public ST[] getOm140_ServiceTestObservationPerformanceSchedule() {
     ST[] ret = null;
    try {
        Type[] t = this.getField(40);  
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
   * Returns a count of the number of repetitions of Service/Test/Observation Performance Schedule (OM1-40).
   */
  public int getOm140_ServiceTestObservationPerformanceScheduleReps() {
    try {
        return this.getField(40).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Service/Test/Observation Performance Schedule (OM1-40) at a given index and returns it.
   * @param index The index
   */
  public ST insertOm140_ServiceTestObservationPerformanceSchedule(int index) throws HL7Exception {
     return (ST) super.insertRepetition(40, index);
  }

  /**
   * Removes a repetition of Service/Test/Observation Performance Schedule (OM1-40) at a given index and returns it.
   * @param index The index
   */
  public ST removeOm140_ServiceTestObservationPerformanceSchedule(int index) throws HL7Exception {
     return (ST) super.removeRepetition(40, index);
  }

  /**
   * Returns Description of Test Methods (OM1-41).
   */
  public TX getDescriptionOfTestMethods()  {
    TX ret = null;
    try {
        Type t = this.getField(41, 0);
        ret = (TX)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns Description of Test Methods (OM1-41).
   */
  public TX getOm141_DescriptionOfTestMethods()  {
    TX ret = null;
    try {
        Type t = this.getField(41, 0);
        ret = (TX)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns Kind of Quantity Observed (OM1-42).
   */
  public CWE getKindOfQuantityObserved()  {
    CWE ret = null;
    try {
        Type t = this.getField(42, 0);
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
   * Returns Kind of Quantity Observed (OM1-42).
   */
  public CWE getOm142_KindOfQuantityObserved()  {
    CWE ret = null;
    try {
        Type t = this.getField(42, 0);
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
   * Returns Point Versus Interval (OM1-43).
   */
  public CWE getPointVersusInterval()  {
    CWE ret = null;
    try {
        Type t = this.getField(43, 0);
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
   * Returns Point Versus Interval (OM1-43).
   */
  public CWE getOm143_PointVersusInterval()  {
    CWE ret = null;
    try {
        Type t = this.getField(43, 0);
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
   * Returns Challenge Information (OM1-44).
   */
  public TX getChallengeInformation()  {
    TX ret = null;
    try {
        Type t = this.getField(44, 0);
        ret = (TX)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns Challenge Information (OM1-44).
   */
  public TX getOm144_ChallengeInformation()  {
    TX ret = null;
    try {
        Type t = this.getField(44, 0);
        ret = (TX)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns Relationship Modifier (OM1-45).
   */
  public CWE getRelationshipModifier()  {
    CWE ret = null;
    try {
        Type t = this.getField(45, 0);
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
   * Returns Relationship Modifier (OM1-45).
   */
  public CWE getOm145_RelationshipModifier()  {
    CWE ret = null;
    try {
        Type t = this.getField(45, 0);
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
   * Returns Target Anatomic Site Of Test (OM1-46).
   */
  public CWE getTargetAnatomicSiteOfTest()  {
    CWE ret = null;
    try {
        Type t = this.getField(46, 0);
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
   * Returns Target Anatomic Site Of Test (OM1-46).
   */
  public CWE getOm146_TargetAnatomicSiteOfTest()  {
    CWE ret = null;
    try {
        Type t = this.getField(46, 0);
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
   * Returns Modality Of Imaging Measurement (OM1-47).
   */
  public CWE getModalityOfImagingMeasurement()  {
    CWE ret = null;
    try {
        Type t = this.getField(47, 0);
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
   * Returns Modality Of Imaging Measurement (OM1-47).
   */
  public CWE getOm147_ModalityOfImagingMeasurement()  {
    CWE ret = null;
    try {
        Type t = this.getField(47, 0);
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
         case 2: return new ca.uhn.hl7v2.model.v26.datatype.ID(getMessage(), new Integer(125));
         case 3: return new ca.uhn.hl7v2.model.v26.datatype.ID(getMessage(), new Integer(136));
         case 4: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 5: return new ca.uhn.hl7v2.model.v26.datatype.TX(getMessage());
         case 6: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 7: return new ca.uhn.hl7v2.model.v26.datatype.ST(getMessage());
         case 8: return new ca.uhn.hl7v2.model.v26.datatype.ST(getMessage());
         case 9: return new ca.uhn.hl7v2.model.v26.datatype.ST(getMessage());
         case 10: return new ca.uhn.hl7v2.model.v26.datatype.ST(getMessage());
         case 11: return new ca.uhn.hl7v2.model.v26.datatype.ID(getMessage(), new Integer(136));
         case 12: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 13: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 14: return new ca.uhn.hl7v2.model.v26.datatype.ID(getMessage(), new Integer(136));
         case 15: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 16: return new ca.uhn.hl7v2.model.v26.datatype.XTN(getMessage());
         case 17: return new ca.uhn.hl7v2.model.v26.datatype.IS(getMessage(), new Integer(174));
         case 18: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 19: return new ca.uhn.hl7v2.model.v26.datatype.ST(getMessage());
         case 20: return new ca.uhn.hl7v2.model.v26.datatype.DTM(getMessage());
         case 21: return new ca.uhn.hl7v2.model.v26.datatype.DTM(getMessage());
         case 22: return new ca.uhn.hl7v2.model.v26.datatype.NM(getMessage());
         case 23: return new ca.uhn.hl7v2.model.v26.datatype.NM(getMessage());
         case 24: return new ca.uhn.hl7v2.model.v26.datatype.ID(getMessage(), new Integer(168));
         case 25: return new ca.uhn.hl7v2.model.v26.datatype.ID(getMessage(), new Integer(169));
         case 26: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 27: return new ca.uhn.hl7v2.model.v26.datatype.XAD(getMessage());
         case 28: return new ca.uhn.hl7v2.model.v26.datatype.XTN(getMessage());
         case 29: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 30: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 31: return new ca.uhn.hl7v2.model.v26.datatype.TX(getMessage());
         case 32: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 33: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 34: return new ca.uhn.hl7v2.model.v26.datatype.TX(getMessage());
         case 35: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 36: return new ca.uhn.hl7v2.model.v26.datatype.TX(getMessage());
         case 37: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 38: return new ca.uhn.hl7v2.model.v26.datatype.TX(getMessage());
         case 39: return new ca.uhn.hl7v2.model.v26.datatype.ST(getMessage());
         case 40: return new ca.uhn.hl7v2.model.v26.datatype.TX(getMessage());
         case 41: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 42: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 43: return new ca.uhn.hl7v2.model.v26.datatype.TX(getMessage());
         case 44: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 45: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 46: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         default: return null;
      }
   }

}