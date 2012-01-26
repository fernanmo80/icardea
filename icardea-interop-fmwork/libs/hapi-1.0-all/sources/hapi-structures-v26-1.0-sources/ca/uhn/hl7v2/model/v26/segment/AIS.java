package ca.uhn.hl7v2.model.v26.segment;

import ca.uhn.hl7v2.model.*;
import ca.uhn.hl7v2.model.v26.datatype.*;
import ca.uhn.log.HapiLogFactory;
import ca.uhn.hl7v2.parser.ModelClassFactory;
import ca.uhn.hl7v2.HL7Exception;

/**
 * <p>Represents an HL7 AIS message segment. 
 * This segment has the following fields:</p><p>
 * AIS-1: Set ID - AIS (SI)<br> 
 * AIS-2: Segment Action Code (ID)<br> 
 * AIS-3: Universal Service Identifier (CWE)<br> 
 * AIS-4: Start Date/Time (DTM)<br> 
 * AIS-5: Start Date/Time Offset (NM)<br> 
 * AIS-6: Start Date/Time Offset Units (CNE)<br> 
 * AIS-7: Duration (NM)<br> 
 * AIS-8: Duration Units (CNE)<br> 
 * AIS-9: Allow Substitution Code (IS)<br> 
 * AIS-10: Filler Status Code (CWE)<br> 
 * AIS-11: Placer Supplemental Service Information (CWE)<br> 
 * AIS-12: Filler Supplemental Service Information (CWE)<br> 
 * </p><p>The get...() methods return data from individual fields.  These methods 
 * do not throw exceptions and may therefore have to handle exceptions internally.  
 * If an exception is handled internally, it is logged and null is returned.  
 * This is not expected to happen - if it does happen this indicates not so much 
 * an exceptional circumstance as a bug in the code for this class.</p>    
 */
public class AIS extends AbstractSegment  {

  /**
   * Creates a AIS (Appointment Information) segment object that belongs to the given 
   * message.  
   */
  public AIS(Group parent, ModelClassFactory factory) {
    super(parent, factory);
    Message message = getMessage();
    try {
       this.add(SI.class, true, 1, 4, new Object[]{message}, "Set ID - AIS");
       this.add(ID.class, false, 1, 3, new Object[]{message, new Integer(206)}, "Segment Action Code");
       this.add(CWE.class, true, 1, 705, new Object[]{message}, "Universal Service Identifier");
       this.add(DTM.class, false, 1, 24, new Object[]{message}, "Start Date/Time");
       this.add(NM.class, false, 1, 20, new Object[]{message}, "Start Date/Time Offset");
       this.add(CNE.class, false, 1, 250, new Object[]{message}, "Start Date/Time Offset Units");
       this.add(NM.class, false, 1, 20, new Object[]{message}, "Duration");
       this.add(CNE.class, false, 1, 250, new Object[]{message}, "Duration Units");
       this.add(IS.class, false, 1, 10, new Object[]{message, new Integer(279)}, "Allow Substitution Code");
       this.add(CWE.class, false, 1, 250, new Object[]{message}, "Filler Status Code");
       this.add(CWE.class, false, 0, 705, new Object[]{message}, "Placer Supplemental Service Information");
       this.add(CWE.class, false, 0, 705, new Object[]{message}, "Filler Supplemental Service Information");
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Can't instantiate " + this.getClass().getName(), he);
    }
  }

  /**
   * Returns Set ID - AIS (AIS-1).
   */
  public SI getSetIDAIS()  {
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
   * Returns Set ID - AIS (AIS-1).
   */
  public SI getAis1_SetIDAIS()  {
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
   * Returns Segment Action Code (AIS-2).
   */
  public ID getSegmentActionCode()  {
    ID ret = null;
    try {
        Type t = this.getField(2, 0);
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
   * Returns Segment Action Code (AIS-2).
   */
  public ID getAis2_SegmentActionCode()  {
    ID ret = null;
    try {
        Type t = this.getField(2, 0);
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
   * Returns Universal Service Identifier (AIS-3).
   */
  public CWE getUniversalServiceIdentifier()  {
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
   * Returns Universal Service Identifier (AIS-3).
   */
  public CWE getAis3_UniversalServiceIdentifier()  {
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
   * Returns Start Date/Time (AIS-4).
   */
  public DTM getStartDateTime()  {
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
   * Returns Start Date/Time (AIS-4).
   */
  public DTM getAis4_StartDateTime()  {
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
   * Returns Start Date/Time Offset (AIS-5).
   */
  public NM getStartDateTimeOffset()  {
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
   * Returns Start Date/Time Offset (AIS-5).
   */
  public NM getAis5_StartDateTimeOffset()  {
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
   * Returns Start Date/Time Offset Units (AIS-6).
   */
  public CNE getStartDateTimeOffsetUnits()  {
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
   * Returns Start Date/Time Offset Units (AIS-6).
   */
  public CNE getAis6_StartDateTimeOffsetUnits()  {
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
   * Returns Duration (AIS-7).
   */
  public NM getDuration()  {
    NM ret = null;
    try {
        Type t = this.getField(7, 0);
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
   * Returns Duration (AIS-7).
   */
  public NM getAis7_Duration()  {
    NM ret = null;
    try {
        Type t = this.getField(7, 0);
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
   * Returns Duration Units (AIS-8).
   */
  public CNE getDurationUnits()  {
    CNE ret = null;
    try {
        Type t = this.getField(8, 0);
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
   * Returns Duration Units (AIS-8).
   */
  public CNE getAis8_DurationUnits()  {
    CNE ret = null;
    try {
        Type t = this.getField(8, 0);
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
   * Returns Allow Substitution Code (AIS-9).
   */
  public IS getAllowSubstitutionCode()  {
    IS ret = null;
    try {
        Type t = this.getField(9, 0);
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
   * Returns Allow Substitution Code (AIS-9).
   */
  public IS getAis9_AllowSubstitutionCode()  {
    IS ret = null;
    try {
        Type t = this.getField(9, 0);
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
   * Returns Filler Status Code (AIS-10).
   */
  public CWE getFillerStatusCode()  {
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
   * Returns Filler Status Code (AIS-10).
   */
  public CWE getAis10_FillerStatusCode()  {
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
   * Returns a single repetition of Placer Supplemental Service Information (AIS-11).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getPlacerSupplementalServiceInformation(int rep) throws HL7Exception {
    CWE ret = null;
    try {
        Type t = this.getField(11, rep);
        ret = (CWE)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Placer Supplemental Service Information (AIS-11).
   */
  public CWE[] getPlacerSupplementalServiceInformation() {
     CWE[] ret = null;
    try {
        Type[] t = this.getField(11);  
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
   * Returns a count of the number of repetitions of Placer Supplemental Service Information (AIS-11).
   */
  public int getPlacerSupplementalServiceInformationReps() {
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
   * Inserts a repetition of Placer Supplemental Service Information (AIS-11) at a given index and returns it.
   * @param index The index
   */
  public CWE insertPlacerSupplementalServiceInformation(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(11, index);
  }

  /**
   * Removes a repetition of Placer Supplemental Service Information (AIS-11) at a given index and returns it.
   * @param index The index
   */
  public CWE removePlacerSupplementalServiceInformation(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(11, index);
  }

  /**
   * Returns a single repetition of Placer Supplemental Service Information (AIS-11).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getAis11_PlacerSupplementalServiceInformation(int rep) throws HL7Exception {
    CWE ret = null;
    try {
        Type t = this.getField(11, rep);
        ret = (CWE)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Placer Supplemental Service Information (AIS-11).
   */
  public CWE[] getAis11_PlacerSupplementalServiceInformation() {
     CWE[] ret = null;
    try {
        Type[] t = this.getField(11);  
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
   * Returns a count of the number of repetitions of Placer Supplemental Service Information (AIS-11).
   */
  public int getAis11_PlacerSupplementalServiceInformationReps() {
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
   * Inserts a repetition of Placer Supplemental Service Information (AIS-11) at a given index and returns it.
   * @param index The index
   */
  public CWE insertAis11_PlacerSupplementalServiceInformation(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(11, index);
  }

  /**
   * Removes a repetition of Placer Supplemental Service Information (AIS-11) at a given index and returns it.
   * @param index The index
   */
  public CWE removeAis11_PlacerSupplementalServiceInformation(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(11, index);
  }

  /**
   * Returns a single repetition of Filler Supplemental Service Information (AIS-12).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getFillerSupplementalServiceInformation(int rep) throws HL7Exception {
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
   * Returns all repetitions of Filler Supplemental Service Information (AIS-12).
   */
  public CWE[] getFillerSupplementalServiceInformation() {
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
   * Returns a count of the number of repetitions of Filler Supplemental Service Information (AIS-12).
   */
  public int getFillerSupplementalServiceInformationReps() {
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
   * Inserts a repetition of Filler Supplemental Service Information (AIS-12) at a given index and returns it.
   * @param index The index
   */
  public CWE insertFillerSupplementalServiceInformation(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(12, index);
  }

  /**
   * Removes a repetition of Filler Supplemental Service Information (AIS-12) at a given index and returns it.
   * @param index The index
   */
  public CWE removeFillerSupplementalServiceInformation(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(12, index);
  }

  /**
   * Returns a single repetition of Filler Supplemental Service Information (AIS-12).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getAis12_FillerSupplementalServiceInformation(int rep) throws HL7Exception {
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
   * Returns all repetitions of Filler Supplemental Service Information (AIS-12).
   */
  public CWE[] getAis12_FillerSupplementalServiceInformation() {
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
   * Returns a count of the number of repetitions of Filler Supplemental Service Information (AIS-12).
   */
  public int getAis12_FillerSupplementalServiceInformationReps() {
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
   * Inserts a repetition of Filler Supplemental Service Information (AIS-12) at a given index and returns it.
   * @param index The index
   */
  public CWE insertAis12_FillerSupplementalServiceInformation(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(12, index);
  }

  /**
   * Removes a repetition of Filler Supplemental Service Information (AIS-12) at a given index and returns it.
   * @param index The index
   */
  public CWE removeAis12_FillerSupplementalServiceInformation(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(12, index);
  }

   protected Type createNewTypeWithoutReflection(int field) {
      switch (field) {
         case 0: return new ca.uhn.hl7v2.model.v26.datatype.SI(getMessage());
         case 1: return new ca.uhn.hl7v2.model.v26.datatype.ID(getMessage(), new Integer(206));
         case 2: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 3: return new ca.uhn.hl7v2.model.v26.datatype.DTM(getMessage());
         case 4: return new ca.uhn.hl7v2.model.v26.datatype.NM(getMessage());
         case 5: return new ca.uhn.hl7v2.model.v26.datatype.CNE(getMessage());
         case 6: return new ca.uhn.hl7v2.model.v26.datatype.NM(getMessage());
         case 7: return new ca.uhn.hl7v2.model.v26.datatype.CNE(getMessage());
         case 8: return new ca.uhn.hl7v2.model.v26.datatype.IS(getMessage(), new Integer(279));
         case 9: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 10: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 11: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         default: return null;
      }
   }

}