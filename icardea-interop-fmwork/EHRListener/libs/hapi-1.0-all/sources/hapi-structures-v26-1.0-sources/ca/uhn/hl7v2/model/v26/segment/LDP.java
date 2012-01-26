package ca.uhn.hl7v2.model.v26.segment;

import ca.uhn.hl7v2.model.*;
import ca.uhn.hl7v2.model.v26.datatype.*;
import ca.uhn.log.HapiLogFactory;
import ca.uhn.hl7v2.parser.ModelClassFactory;
import ca.uhn.hl7v2.HL7Exception;

/**
 * <p>Represents an HL7 LDP message segment. 
 * This segment has the following fields:</p><p>
 * LDP-1: Primary Key Value - LDP (PL)<br> 
 * LDP-2: Location Department (CWE)<br> 
 * LDP-3: Location Service (IS)<br> 
 * LDP-4: Specialty Type (CWE)<br> 
 * LDP-5: Valid Patient Classes (IS)<br> 
 * LDP-6: Active/Inactive Flag (ID)<br> 
 * LDP-7: Activation Date - LDP (DTM)<br> 
 * LDP-8: Inactivation Date - LDP (DTM)<br> 
 * LDP-9: Inactivated Reason (ST)<br> 
 * LDP-10: Visiting Hours (VH)<br> 
 * LDP-11: Contact Phone (XTN)<br> 
 * LDP-12: Location Cost Center (CWE)<br> 
 * </p><p>The get...() methods return data from individual fields.  These methods 
 * do not throw exceptions and may therefore have to handle exceptions internally.  
 * If an exception is handled internally, it is logged and null is returned.  
 * This is not expected to happen - if it does happen this indicates not so much 
 * an exceptional circumstance as a bug in the code for this class.</p>    
 */
public class LDP extends AbstractSegment  {

  /**
   * Creates a LDP (Location Department) segment object that belongs to the given 
   * message.  
   */
  public LDP(Group parent, ModelClassFactory factory) {
    super(parent, factory);
    Message message = getMessage();
    try {
       this.add(PL.class, true, 1, 200, new Object[]{message}, "Primary Key Value - LDP");
       this.add(CWE.class, true, 1, 250, new Object[]{message}, "Location Department");
       this.add(IS.class, false, 0, 3, new Object[]{message, new Integer(69)}, "Location Service");
       this.add(CWE.class, false, 0, 250, new Object[]{message}, "Specialty Type");
       this.add(IS.class, false, 0, 1, new Object[]{message, new Integer(4)}, "Valid Patient Classes");
       this.add(ID.class, false, 1, 1, new Object[]{message, new Integer(183)}, "Active/Inactive Flag");
       this.add(DTM.class, false, 1, 24, new Object[]{message}, "Activation Date - LDP");
       this.add(DTM.class, false, 1, 24, new Object[]{message}, "Inactivation Date - LDP");
       this.add(ST.class, false, 1, 80, new Object[]{message}, "Inactivated Reason");
       this.add(VH.class, false, 0, 80, new Object[]{message}, "Visiting Hours");
       this.add(XTN.class, false, 1, 250, new Object[]{message}, "Contact Phone");
       this.add(CWE.class, false, 1, 250, new Object[]{message}, "Location Cost Center");
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Can't instantiate " + this.getClass().getName(), he);
    }
  }

  /**
   * Returns Primary Key Value - LDP (LDP-1).
   */
  public PL getPrimaryKeyValueLDP()  {
    PL ret = null;
    try {
        Type t = this.getField(1, 0);
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
   * Returns Primary Key Value - LDP (LDP-1).
   */
  public PL getLdp1_PrimaryKeyValueLDP()  {
    PL ret = null;
    try {
        Type t = this.getField(1, 0);
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
   * Returns Location Department (LDP-2).
   */
  public CWE getLocationDepartment()  {
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
   * Returns Location Department (LDP-2).
   */
  public CWE getLdp2_LocationDepartment()  {
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
   * Returns a single repetition of Location Service (LDP-3).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public IS getLocationService(int rep) throws HL7Exception {
    IS ret = null;
    try {
        Type t = this.getField(3, rep);
        ret = (IS)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Location Service (LDP-3).
   */
  public IS[] getLocationService() {
     IS[] ret = null;
    try {
        Type[] t = this.getField(3);  
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
   * Returns a count of the number of repetitions of Location Service (LDP-3).
   */
  public int getLocationServiceReps() {
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
   * Inserts a repetition of Location Service (LDP-3) at a given index and returns it.
   * @param index The index
   */
  public IS insertLocationService(int index) throws HL7Exception {
     return (IS) super.insertRepetition(3, index);
  }

  /**
   * Removes a repetition of Location Service (LDP-3) at a given index and returns it.
   * @param index The index
   */
  public IS removeLocationService(int index) throws HL7Exception {
     return (IS) super.removeRepetition(3, index);
  }

  /**
   * Returns a single repetition of Location Service (LDP-3).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public IS getLdp3_LocationService(int rep) throws HL7Exception {
    IS ret = null;
    try {
        Type t = this.getField(3, rep);
        ret = (IS)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Location Service (LDP-3).
   */
  public IS[] getLdp3_LocationService() {
     IS[] ret = null;
    try {
        Type[] t = this.getField(3);  
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
   * Returns a count of the number of repetitions of Location Service (LDP-3).
   */
  public int getLdp3_LocationServiceReps() {
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
   * Inserts a repetition of Location Service (LDP-3) at a given index and returns it.
   * @param index The index
   */
  public IS insertLdp3_LocationService(int index) throws HL7Exception {
     return (IS) super.insertRepetition(3, index);
  }

  /**
   * Removes a repetition of Location Service (LDP-3) at a given index and returns it.
   * @param index The index
   */
  public IS removeLdp3_LocationService(int index) throws HL7Exception {
     return (IS) super.removeRepetition(3, index);
  }

  /**
   * Returns a single repetition of Specialty Type (LDP-4).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getSpecialtyType(int rep) throws HL7Exception {
    CWE ret = null;
    try {
        Type t = this.getField(4, rep);
        ret = (CWE)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Specialty Type (LDP-4).
   */
  public CWE[] getSpecialtyType() {
     CWE[] ret = null;
    try {
        Type[] t = this.getField(4);  
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
   * Returns a count of the number of repetitions of Specialty Type (LDP-4).
   */
  public int getSpecialtyTypeReps() {
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
   * Inserts a repetition of Specialty Type (LDP-4) at a given index and returns it.
   * @param index The index
   */
  public CWE insertSpecialtyType(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(4, index);
  }

  /**
   * Removes a repetition of Specialty Type (LDP-4) at a given index and returns it.
   * @param index The index
   */
  public CWE removeSpecialtyType(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(4, index);
  }

  /**
   * Returns a single repetition of Specialty Type (LDP-4).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getLdp4_SpecialtyType(int rep) throws HL7Exception {
    CWE ret = null;
    try {
        Type t = this.getField(4, rep);
        ret = (CWE)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Specialty Type (LDP-4).
   */
  public CWE[] getLdp4_SpecialtyType() {
     CWE[] ret = null;
    try {
        Type[] t = this.getField(4);  
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
   * Returns a count of the number of repetitions of Specialty Type (LDP-4).
   */
  public int getLdp4_SpecialtyTypeReps() {
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
   * Inserts a repetition of Specialty Type (LDP-4) at a given index and returns it.
   * @param index The index
   */
  public CWE insertLdp4_SpecialtyType(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(4, index);
  }

  /**
   * Removes a repetition of Specialty Type (LDP-4) at a given index and returns it.
   * @param index The index
   */
  public CWE removeLdp4_SpecialtyType(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(4, index);
  }

  /**
   * Returns a single repetition of Valid Patient Classes (LDP-5).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public IS getValidPatientClasses(int rep) throws HL7Exception {
    IS ret = null;
    try {
        Type t = this.getField(5, rep);
        ret = (IS)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Valid Patient Classes (LDP-5).
   */
  public IS[] getValidPatientClasses() {
     IS[] ret = null;
    try {
        Type[] t = this.getField(5);  
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
   * Returns a count of the number of repetitions of Valid Patient Classes (LDP-5).
   */
  public int getValidPatientClassesReps() {
    try {
        return this.getField(5).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Valid Patient Classes (LDP-5) at a given index and returns it.
   * @param index The index
   */
  public IS insertValidPatientClasses(int index) throws HL7Exception {
     return (IS) super.insertRepetition(5, index);
  }

  /**
   * Removes a repetition of Valid Patient Classes (LDP-5) at a given index and returns it.
   * @param index The index
   */
  public IS removeValidPatientClasses(int index) throws HL7Exception {
     return (IS) super.removeRepetition(5, index);
  }

  /**
   * Returns a single repetition of Valid Patient Classes (LDP-5).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public IS getLdp5_ValidPatientClasses(int rep) throws HL7Exception {
    IS ret = null;
    try {
        Type t = this.getField(5, rep);
        ret = (IS)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Valid Patient Classes (LDP-5).
   */
  public IS[] getLdp5_ValidPatientClasses() {
     IS[] ret = null;
    try {
        Type[] t = this.getField(5);  
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
   * Returns a count of the number of repetitions of Valid Patient Classes (LDP-5).
   */
  public int getLdp5_ValidPatientClassesReps() {
    try {
        return this.getField(5).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Valid Patient Classes (LDP-5) at a given index and returns it.
   * @param index The index
   */
  public IS insertLdp5_ValidPatientClasses(int index) throws HL7Exception {
     return (IS) super.insertRepetition(5, index);
  }

  /**
   * Removes a repetition of Valid Patient Classes (LDP-5) at a given index and returns it.
   * @param index The index
   */
  public IS removeLdp5_ValidPatientClasses(int index) throws HL7Exception {
     return (IS) super.removeRepetition(5, index);
  }

  /**
   * Returns Active/Inactive Flag (LDP-6).
   */
  public ID getActiveInactiveFlag()  {
    ID ret = null;
    try {
        Type t = this.getField(6, 0);
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
   * Returns Active/Inactive Flag (LDP-6).
   */
  public ID getLdp6_ActiveInactiveFlag()  {
    ID ret = null;
    try {
        Type t = this.getField(6, 0);
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
   * Returns Activation Date - LDP (LDP-7).
   */
  public DTM getActivationDateLDP()  {
    DTM ret = null;
    try {
        Type t = this.getField(7, 0);
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
   * Returns Activation Date - LDP (LDP-7).
   */
  public DTM getLdp7_ActivationDateLDP()  {
    DTM ret = null;
    try {
        Type t = this.getField(7, 0);
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
   * Returns Inactivation Date - LDP (LDP-8).
   */
  public DTM getInactivationDateLDP()  {
    DTM ret = null;
    try {
        Type t = this.getField(8, 0);
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
   * Returns Inactivation Date - LDP (LDP-8).
   */
  public DTM getLdp8_InactivationDateLDP()  {
    DTM ret = null;
    try {
        Type t = this.getField(8, 0);
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
   * Returns Inactivated Reason (LDP-9).
   */
  public ST getInactivatedReason()  {
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
   * Returns Inactivated Reason (LDP-9).
   */
  public ST getLdp9_InactivatedReason()  {
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
   * Returns a single repetition of Visiting Hours (LDP-10).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public VH getVisitingHours(int rep) throws HL7Exception {
    VH ret = null;
    try {
        Type t = this.getField(10, rep);
        ret = (VH)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Visiting Hours (LDP-10).
   */
  public VH[] getVisitingHours() {
     VH[] ret = null;
    try {
        Type[] t = this.getField(10);  
        ret = new VH[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (VH)t[i];
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
   * Returns a count of the number of repetitions of Visiting Hours (LDP-10).
   */
  public int getVisitingHoursReps() {
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
   * Inserts a repetition of Visiting Hours (LDP-10) at a given index and returns it.
   * @param index The index
   */
  public VH insertVisitingHours(int index) throws HL7Exception {
     return (VH) super.insertRepetition(10, index);
  }

  /**
   * Removes a repetition of Visiting Hours (LDP-10) at a given index and returns it.
   * @param index The index
   */
  public VH removeVisitingHours(int index) throws HL7Exception {
     return (VH) super.removeRepetition(10, index);
  }

  /**
   * Returns a single repetition of Visiting Hours (LDP-10).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public VH getLdp10_VisitingHours(int rep) throws HL7Exception {
    VH ret = null;
    try {
        Type t = this.getField(10, rep);
        ret = (VH)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Visiting Hours (LDP-10).
   */
  public VH[] getLdp10_VisitingHours() {
     VH[] ret = null;
    try {
        Type[] t = this.getField(10);  
        ret = new VH[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (VH)t[i];
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
   * Returns a count of the number of repetitions of Visiting Hours (LDP-10).
   */
  public int getLdp10_VisitingHoursReps() {
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
   * Inserts a repetition of Visiting Hours (LDP-10) at a given index and returns it.
   * @param index The index
   */
  public VH insertLdp10_VisitingHours(int index) throws HL7Exception {
     return (VH) super.insertRepetition(10, index);
  }

  /**
   * Removes a repetition of Visiting Hours (LDP-10) at a given index and returns it.
   * @param index The index
   */
  public VH removeLdp10_VisitingHours(int index) throws HL7Exception {
     return (VH) super.removeRepetition(10, index);
  }

  /**
   * Returns Contact Phone (LDP-11).
   */
  public XTN getContactPhone()  {
    XTN ret = null;
    try {
        Type t = this.getField(11, 0);
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
   * Returns Contact Phone (LDP-11).
   */
  public XTN getLdp11_ContactPhone()  {
    XTN ret = null;
    try {
        Type t = this.getField(11, 0);
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
   * Returns Location Cost Center (LDP-12).
   */
  public CWE getLocationCostCenter()  {
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
   * Returns Location Cost Center (LDP-12).
   */
  public CWE getLdp12_LocationCostCenter()  {
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

   protected Type createNewTypeWithoutReflection(int field) {
      switch (field) {
         case 0: return new ca.uhn.hl7v2.model.v26.datatype.PL(getMessage());
         case 1: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 2: return new ca.uhn.hl7v2.model.v26.datatype.IS(getMessage(), new Integer(69));
         case 3: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 4: return new ca.uhn.hl7v2.model.v26.datatype.IS(getMessage(), new Integer(4));
         case 5: return new ca.uhn.hl7v2.model.v26.datatype.ID(getMessage(), new Integer(183));
         case 6: return new ca.uhn.hl7v2.model.v26.datatype.DTM(getMessage());
         case 7: return new ca.uhn.hl7v2.model.v26.datatype.DTM(getMessage());
         case 8: return new ca.uhn.hl7v2.model.v26.datatype.ST(getMessage());
         case 9: return new ca.uhn.hl7v2.model.v26.datatype.VH(getMessage());
         case 10: return new ca.uhn.hl7v2.model.v26.datatype.XTN(getMessage());
         case 11: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         default: return null;
      }
   }

}