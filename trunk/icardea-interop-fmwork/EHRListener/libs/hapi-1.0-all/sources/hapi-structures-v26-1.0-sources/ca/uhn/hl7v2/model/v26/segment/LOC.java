package ca.uhn.hl7v2.model.v26.segment;

import ca.uhn.hl7v2.model.*;
import ca.uhn.hl7v2.model.v26.datatype.*;
import ca.uhn.log.HapiLogFactory;
import ca.uhn.hl7v2.parser.ModelClassFactory;
import ca.uhn.hl7v2.HL7Exception;

/**
 * <p>Represents an HL7 LOC message segment. 
 * This segment has the following fields:</p><p>
 * LOC-1: Primary Key Value - LOC (PL)<br> 
 * LOC-2: Location Description (ST)<br> 
 * LOC-3: Location Type - LOC (IS)<br> 
 * LOC-4: Organization Name - LOC (XON)<br> 
 * LOC-5: Location Address (XAD)<br> 
 * LOC-6: Location Phone (XTN)<br> 
 * LOC-7: License Number (CWE)<br> 
 * LOC-8: Location Equipment (IS)<br> 
 * LOC-9: Location Service Code (IS)<br> 
 * </p><p>The get...() methods return data from individual fields.  These methods 
 * do not throw exceptions and may therefore have to handle exceptions internally.  
 * If an exception is handled internally, it is logged and null is returned.  
 * This is not expected to happen - if it does happen this indicates not so much 
 * an exceptional circumstance as a bug in the code for this class.</p>    
 */
public class LOC extends AbstractSegment  {

  /**
   * Creates a LOC (Location Identification) segment object that belongs to the given 
   * message.  
   */
  public LOC(Group parent, ModelClassFactory factory) {
    super(parent, factory);
    Message message = getMessage();
    try {
       this.add(PL.class, true, 1, 200, new Object[]{message}, "Primary Key Value - LOC");
       this.add(ST.class, false, 1, 48, new Object[]{message}, "Location Description");
       this.add(IS.class, true, 0, 2, new Object[]{message, new Integer(260)}, "Location Type - LOC");
       this.add(XON.class, false, 0, 250, new Object[]{message}, "Organization Name - LOC");
       this.add(XAD.class, false, 0, 250, new Object[]{message}, "Location Address");
       this.add(XTN.class, false, 0, 250, new Object[]{message}, "Location Phone");
       this.add(CWE.class, false, 0, 250, new Object[]{message}, "License Number");
       this.add(IS.class, false, 0, 3, new Object[]{message, new Integer(261)}, "Location Equipment");
       this.add(IS.class, false, 1, 1, new Object[]{message, new Integer(442)}, "Location Service Code");
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Can't instantiate " + this.getClass().getName(), he);
    }
  }

  /**
   * Returns Primary Key Value - LOC (LOC-1).
   */
  public PL getPrimaryKeyValueLOC()  {
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
   * Returns Primary Key Value - LOC (LOC-1).
   */
  public PL getLoc1_PrimaryKeyValueLOC()  {
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
   * Returns Location Description (LOC-2).
   */
  public ST getLocationDescription()  {
    ST ret = null;
    try {
        Type t = this.getField(2, 0);
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
   * Returns Location Description (LOC-2).
   */
  public ST getLoc2_LocationDescription()  {
    ST ret = null;
    try {
        Type t = this.getField(2, 0);
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
   * Returns a single repetition of Location Type - LOC (LOC-3).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public IS getLocationTypeLOC(int rep) throws HL7Exception {
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
   * Returns all repetitions of Location Type - LOC (LOC-3).
   */
  public IS[] getLocationTypeLOC() {
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
   * Returns a count of the number of repetitions of Location Type - LOC (LOC-3).
   */
  public int getLocationTypeLOCReps() {
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
   * Inserts a repetition of Location Type - LOC (LOC-3) at a given index and returns it.
   * @param index The index
   */
  public IS insertLocationTypeLOC(int index) throws HL7Exception {
     return (IS) super.insertRepetition(3, index);
  }

  /**
   * Removes a repetition of Location Type - LOC (LOC-3) at a given index and returns it.
   * @param index The index
   */
  public IS removeLocationTypeLOC(int index) throws HL7Exception {
     return (IS) super.removeRepetition(3, index);
  }

  /**
   * Returns a single repetition of Location Type - LOC (LOC-3).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public IS getLoc3_LocationTypeLOC(int rep) throws HL7Exception {
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
   * Returns all repetitions of Location Type - LOC (LOC-3).
   */
  public IS[] getLoc3_LocationTypeLOC() {
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
   * Returns a count of the number of repetitions of Location Type - LOC (LOC-3).
   */
  public int getLoc3_LocationTypeLOCReps() {
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
   * Inserts a repetition of Location Type - LOC (LOC-3) at a given index and returns it.
   * @param index The index
   */
  public IS insertLoc3_LocationTypeLOC(int index) throws HL7Exception {
     return (IS) super.insertRepetition(3, index);
  }

  /**
   * Removes a repetition of Location Type - LOC (LOC-3) at a given index and returns it.
   * @param index The index
   */
  public IS removeLoc3_LocationTypeLOC(int index) throws HL7Exception {
     return (IS) super.removeRepetition(3, index);
  }

  /**
   * Returns a single repetition of Organization Name - LOC (LOC-4).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XON getOrganizationNameLOC(int rep) throws HL7Exception {
    XON ret = null;
    try {
        Type t = this.getField(4, rep);
        ret = (XON)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Organization Name - LOC (LOC-4).
   */
  public XON[] getOrganizationNameLOC() {
     XON[] ret = null;
    try {
        Type[] t = this.getField(4);  
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
   * Returns a count of the number of repetitions of Organization Name - LOC (LOC-4).
   */
  public int getOrganizationNameLOCReps() {
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
   * Inserts a repetition of Organization Name - LOC (LOC-4) at a given index and returns it.
   * @param index The index
   */
  public XON insertOrganizationNameLOC(int index) throws HL7Exception {
     return (XON) super.insertRepetition(4, index);
  }

  /**
   * Removes a repetition of Organization Name - LOC (LOC-4) at a given index and returns it.
   * @param index The index
   */
  public XON removeOrganizationNameLOC(int index) throws HL7Exception {
     return (XON) super.removeRepetition(4, index);
  }

  /**
   * Returns a single repetition of Organization Name - LOC (LOC-4).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XON getLoc4_OrganizationNameLOC(int rep) throws HL7Exception {
    XON ret = null;
    try {
        Type t = this.getField(4, rep);
        ret = (XON)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Organization Name - LOC (LOC-4).
   */
  public XON[] getLoc4_OrganizationNameLOC() {
     XON[] ret = null;
    try {
        Type[] t = this.getField(4);  
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
   * Returns a count of the number of repetitions of Organization Name - LOC (LOC-4).
   */
  public int getLoc4_OrganizationNameLOCReps() {
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
   * Inserts a repetition of Organization Name - LOC (LOC-4) at a given index and returns it.
   * @param index The index
   */
  public XON insertLoc4_OrganizationNameLOC(int index) throws HL7Exception {
     return (XON) super.insertRepetition(4, index);
  }

  /**
   * Removes a repetition of Organization Name - LOC (LOC-4) at a given index and returns it.
   * @param index The index
   */
  public XON removeLoc4_OrganizationNameLOC(int index) throws HL7Exception {
     return (XON) super.removeRepetition(4, index);
  }

  /**
   * Returns a single repetition of Location Address (LOC-5).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XAD getLocationAddress(int rep) throws HL7Exception {
    XAD ret = null;
    try {
        Type t = this.getField(5, rep);
        ret = (XAD)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Location Address (LOC-5).
   */
  public XAD[] getLocationAddress() {
     XAD[] ret = null;
    try {
        Type[] t = this.getField(5);  
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
   * Returns a count of the number of repetitions of Location Address (LOC-5).
   */
  public int getLocationAddressReps() {
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
   * Inserts a repetition of Location Address (LOC-5) at a given index and returns it.
   * @param index The index
   */
  public XAD insertLocationAddress(int index) throws HL7Exception {
     return (XAD) super.insertRepetition(5, index);
  }

  /**
   * Removes a repetition of Location Address (LOC-5) at a given index and returns it.
   * @param index The index
   */
  public XAD removeLocationAddress(int index) throws HL7Exception {
     return (XAD) super.removeRepetition(5, index);
  }

  /**
   * Returns a single repetition of Location Address (LOC-5).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XAD getLoc5_LocationAddress(int rep) throws HL7Exception {
    XAD ret = null;
    try {
        Type t = this.getField(5, rep);
        ret = (XAD)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Location Address (LOC-5).
   */
  public XAD[] getLoc5_LocationAddress() {
     XAD[] ret = null;
    try {
        Type[] t = this.getField(5);  
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
   * Returns a count of the number of repetitions of Location Address (LOC-5).
   */
  public int getLoc5_LocationAddressReps() {
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
   * Inserts a repetition of Location Address (LOC-5) at a given index and returns it.
   * @param index The index
   */
  public XAD insertLoc5_LocationAddress(int index) throws HL7Exception {
     return (XAD) super.insertRepetition(5, index);
  }

  /**
   * Removes a repetition of Location Address (LOC-5) at a given index and returns it.
   * @param index The index
   */
  public XAD removeLoc5_LocationAddress(int index) throws HL7Exception {
     return (XAD) super.removeRepetition(5, index);
  }

  /**
   * Returns a single repetition of Location Phone (LOC-6).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XTN getLocationPhone(int rep) throws HL7Exception {
    XTN ret = null;
    try {
        Type t = this.getField(6, rep);
        ret = (XTN)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Location Phone (LOC-6).
   */
  public XTN[] getLocationPhone() {
     XTN[] ret = null;
    try {
        Type[] t = this.getField(6);  
        ret = new XTN[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (XTN)t[i];
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
   * Returns a count of the number of repetitions of Location Phone (LOC-6).
   */
  public int getLocationPhoneReps() {
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
   * Inserts a repetition of Location Phone (LOC-6) at a given index and returns it.
   * @param index The index
   */
  public XTN insertLocationPhone(int index) throws HL7Exception {
     return (XTN) super.insertRepetition(6, index);
  }

  /**
   * Removes a repetition of Location Phone (LOC-6) at a given index and returns it.
   * @param index The index
   */
  public XTN removeLocationPhone(int index) throws HL7Exception {
     return (XTN) super.removeRepetition(6, index);
  }

  /**
   * Returns a single repetition of Location Phone (LOC-6).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XTN getLoc6_LocationPhone(int rep) throws HL7Exception {
    XTN ret = null;
    try {
        Type t = this.getField(6, rep);
        ret = (XTN)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Location Phone (LOC-6).
   */
  public XTN[] getLoc6_LocationPhone() {
     XTN[] ret = null;
    try {
        Type[] t = this.getField(6);  
        ret = new XTN[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (XTN)t[i];
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
   * Returns a count of the number of repetitions of Location Phone (LOC-6).
   */
  public int getLoc6_LocationPhoneReps() {
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
   * Inserts a repetition of Location Phone (LOC-6) at a given index and returns it.
   * @param index The index
   */
  public XTN insertLoc6_LocationPhone(int index) throws HL7Exception {
     return (XTN) super.insertRepetition(6, index);
  }

  /**
   * Removes a repetition of Location Phone (LOC-6) at a given index and returns it.
   * @param index The index
   */
  public XTN removeLoc6_LocationPhone(int index) throws HL7Exception {
     return (XTN) super.removeRepetition(6, index);
  }

  /**
   * Returns a single repetition of License Number (LOC-7).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getLicenseNumber(int rep) throws HL7Exception {
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
   * Returns all repetitions of License Number (LOC-7).
   */
  public CWE[] getLicenseNumber() {
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
   * Returns a count of the number of repetitions of License Number (LOC-7).
   */
  public int getLicenseNumberReps() {
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
   * Inserts a repetition of License Number (LOC-7) at a given index and returns it.
   * @param index The index
   */
  public CWE insertLicenseNumber(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(7, index);
  }

  /**
   * Removes a repetition of License Number (LOC-7) at a given index and returns it.
   * @param index The index
   */
  public CWE removeLicenseNumber(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(7, index);
  }

  /**
   * Returns a single repetition of License Number (LOC-7).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getLoc7_LicenseNumber(int rep) throws HL7Exception {
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
   * Returns all repetitions of License Number (LOC-7).
   */
  public CWE[] getLoc7_LicenseNumber() {
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
   * Returns a count of the number of repetitions of License Number (LOC-7).
   */
  public int getLoc7_LicenseNumberReps() {
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
   * Inserts a repetition of License Number (LOC-7) at a given index and returns it.
   * @param index The index
   */
  public CWE insertLoc7_LicenseNumber(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(7, index);
  }

  /**
   * Removes a repetition of License Number (LOC-7) at a given index and returns it.
   * @param index The index
   */
  public CWE removeLoc7_LicenseNumber(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(7, index);
  }

  /**
   * Returns a single repetition of Location Equipment (LOC-8).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public IS getLocationEquipment(int rep) throws HL7Exception {
    IS ret = null;
    try {
        Type t = this.getField(8, rep);
        ret = (IS)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Location Equipment (LOC-8).
   */
  public IS[] getLocationEquipment() {
     IS[] ret = null;
    try {
        Type[] t = this.getField(8);  
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
   * Returns a count of the number of repetitions of Location Equipment (LOC-8).
   */
  public int getLocationEquipmentReps() {
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
   * Inserts a repetition of Location Equipment (LOC-8) at a given index and returns it.
   * @param index The index
   */
  public IS insertLocationEquipment(int index) throws HL7Exception {
     return (IS) super.insertRepetition(8, index);
  }

  /**
   * Removes a repetition of Location Equipment (LOC-8) at a given index and returns it.
   * @param index The index
   */
  public IS removeLocationEquipment(int index) throws HL7Exception {
     return (IS) super.removeRepetition(8, index);
  }

  /**
   * Returns a single repetition of Location Equipment (LOC-8).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public IS getLoc8_LocationEquipment(int rep) throws HL7Exception {
    IS ret = null;
    try {
        Type t = this.getField(8, rep);
        ret = (IS)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Location Equipment (LOC-8).
   */
  public IS[] getLoc8_LocationEquipment() {
     IS[] ret = null;
    try {
        Type[] t = this.getField(8);  
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
   * Returns a count of the number of repetitions of Location Equipment (LOC-8).
   */
  public int getLoc8_LocationEquipmentReps() {
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
   * Inserts a repetition of Location Equipment (LOC-8) at a given index and returns it.
   * @param index The index
   */
  public IS insertLoc8_LocationEquipment(int index) throws HL7Exception {
     return (IS) super.insertRepetition(8, index);
  }

  /**
   * Removes a repetition of Location Equipment (LOC-8) at a given index and returns it.
   * @param index The index
   */
  public IS removeLoc8_LocationEquipment(int index) throws HL7Exception {
     return (IS) super.removeRepetition(8, index);
  }

  /**
   * Returns Location Service Code (LOC-9).
   */
  public IS getLocationServiceCode()  {
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
   * Returns Location Service Code (LOC-9).
   */
  public IS getLoc9_LocationServiceCode()  {
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

   protected Type createNewTypeWithoutReflection(int field) {
      switch (field) {
         case 0: return new ca.uhn.hl7v2.model.v26.datatype.PL(getMessage());
         case 1: return new ca.uhn.hl7v2.model.v26.datatype.ST(getMessage());
         case 2: return new ca.uhn.hl7v2.model.v26.datatype.IS(getMessage(), new Integer(260));
         case 3: return new ca.uhn.hl7v2.model.v26.datatype.XON(getMessage());
         case 4: return new ca.uhn.hl7v2.model.v26.datatype.XAD(getMessage());
         case 5: return new ca.uhn.hl7v2.model.v26.datatype.XTN(getMessage());
         case 6: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 7: return new ca.uhn.hl7v2.model.v26.datatype.IS(getMessage(), new Integer(261));
         case 8: return new ca.uhn.hl7v2.model.v26.datatype.IS(getMessage(), new Integer(442));
         default: return null;
      }
   }

}