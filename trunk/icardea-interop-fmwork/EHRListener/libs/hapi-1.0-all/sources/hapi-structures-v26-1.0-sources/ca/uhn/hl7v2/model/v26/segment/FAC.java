package ca.uhn.hl7v2.model.v26.segment;

import ca.uhn.hl7v2.model.*;
import ca.uhn.hl7v2.model.v26.datatype.*;
import ca.uhn.log.HapiLogFactory;
import ca.uhn.hl7v2.parser.ModelClassFactory;
import ca.uhn.hl7v2.HL7Exception;

/**
 * <p>Represents an HL7 FAC message segment. 
 * This segment has the following fields:</p><p>
 * FAC-1: Facility ID-FAC (EI)<br> 
 * FAC-2: Facility Type (ID)<br> 
 * FAC-3: Facility Address (XAD)<br> 
 * FAC-4: Facility Telecommunication (XTN)<br> 
 * FAC-5: Contact Person (XCN)<br> 
 * FAC-6: Contact Title (ST)<br> 
 * FAC-7: Contact Address (XAD)<br> 
 * FAC-8: Contact Telecommunication (XTN)<br> 
 * FAC-9: Signature Authority (XCN)<br> 
 * FAC-10: Signature Authority Title (ST)<br> 
 * FAC-11: Signature Authority Address (XAD)<br> 
 * FAC-12: Signature Authority Telecommunication (XTN)<br> 
 * </p><p>The get...() methods return data from individual fields.  These methods 
 * do not throw exceptions and may therefore have to handle exceptions internally.  
 * If an exception is handled internally, it is logged and null is returned.  
 * This is not expected to happen - if it does happen this indicates not so much 
 * an exceptional circumstance as a bug in the code for this class.</p>    
 */
public class FAC extends AbstractSegment  {

  /**
   * Creates a FAC (Facility) segment object that belongs to the given 
   * message.  
   */
  public FAC(Group parent, ModelClassFactory factory) {
    super(parent, factory);
    Message message = getMessage();
    try {
       this.add(EI.class, true, 1, 427, new Object[]{message}, "Facility ID-FAC");
       this.add(ID.class, false, 1, 1, new Object[]{message, new Integer(331)}, "Facility Type");
       this.add(XAD.class, true, 0, 2915, new Object[]{message}, "Facility Address");
       this.add(XTN.class, true, 1, 2743, new Object[]{message}, "Facility Telecommunication");
       this.add(XCN.class, false, 0, 3220, new Object[]{message}, "Contact Person");
       this.add(ST.class, false, 0, 60, new Object[]{message}, "Contact Title");
       this.add(XAD.class, false, 0, 2915, new Object[]{message}, "Contact Address");
       this.add(XTN.class, false, 0, 2743, new Object[]{message}, "Contact Telecommunication");
       this.add(XCN.class, true, 0, 3220, new Object[]{message}, "Signature Authority");
       this.add(ST.class, false, 1, 199, new Object[]{message}, "Signature Authority Title");
       this.add(XAD.class, false, 0, 2915, new Object[]{message}, "Signature Authority Address");
       this.add(XTN.class, false, 1, 2743, new Object[]{message}, "Signature Authority Telecommunication");
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Can't instantiate " + this.getClass().getName(), he);
    }
  }

  /**
   * Returns Facility ID-FAC (FAC-1).
   */
  public EI getFacilityIDFAC()  {
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
   * Returns Facility ID-FAC (FAC-1).
   */
  public EI getFac1_FacilityIDFAC()  {
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
   * Returns Facility Type (FAC-2).
   */
  public ID getFacilityType()  {
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
   * Returns Facility Type (FAC-2).
   */
  public ID getFac2_FacilityType()  {
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
   * Returns a single repetition of Facility Address (FAC-3).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XAD getFacilityAddress(int rep) throws HL7Exception {
    XAD ret = null;
    try {
        Type t = this.getField(3, rep);
        ret = (XAD)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Facility Address (FAC-3).
   */
  public XAD[] getFacilityAddress() {
     XAD[] ret = null;
    try {
        Type[] t = this.getField(3);  
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
   * Returns a count of the number of repetitions of Facility Address (FAC-3).
   */
  public int getFacilityAddressReps() {
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
   * Inserts a repetition of Facility Address (FAC-3) at a given index and returns it.
   * @param index The index
   */
  public XAD insertFacilityAddress(int index) throws HL7Exception {
     return (XAD) super.insertRepetition(3, index);
  }

  /**
   * Removes a repetition of Facility Address (FAC-3) at a given index and returns it.
   * @param index The index
   */
  public XAD removeFacilityAddress(int index) throws HL7Exception {
     return (XAD) super.removeRepetition(3, index);
  }

  /**
   * Returns a single repetition of Facility Address (FAC-3).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XAD getFac3_FacilityAddress(int rep) throws HL7Exception {
    XAD ret = null;
    try {
        Type t = this.getField(3, rep);
        ret = (XAD)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Facility Address (FAC-3).
   */
  public XAD[] getFac3_FacilityAddress() {
     XAD[] ret = null;
    try {
        Type[] t = this.getField(3);  
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
   * Returns a count of the number of repetitions of Facility Address (FAC-3).
   */
  public int getFac3_FacilityAddressReps() {
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
   * Inserts a repetition of Facility Address (FAC-3) at a given index and returns it.
   * @param index The index
   */
  public XAD insertFac3_FacilityAddress(int index) throws HL7Exception {
     return (XAD) super.insertRepetition(3, index);
  }

  /**
   * Removes a repetition of Facility Address (FAC-3) at a given index and returns it.
   * @param index The index
   */
  public XAD removeFac3_FacilityAddress(int index) throws HL7Exception {
     return (XAD) super.removeRepetition(3, index);
  }

  /**
   * Returns Facility Telecommunication (FAC-4).
   */
  public XTN getFacilityTelecommunication()  {
    XTN ret = null;
    try {
        Type t = this.getField(4, 0);
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
   * Returns Facility Telecommunication (FAC-4).
   */
  public XTN getFac4_FacilityTelecommunication()  {
    XTN ret = null;
    try {
        Type t = this.getField(4, 0);
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
   * Returns a single repetition of Contact Person (FAC-5).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XCN getContactPerson(int rep) throws HL7Exception {
    XCN ret = null;
    try {
        Type t = this.getField(5, rep);
        ret = (XCN)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Contact Person (FAC-5).
   */
  public XCN[] getContactPerson() {
     XCN[] ret = null;
    try {
        Type[] t = this.getField(5);  
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
   * Returns a count of the number of repetitions of Contact Person (FAC-5).
   */
  public int getContactPersonReps() {
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
   * Inserts a repetition of Contact Person (FAC-5) at a given index and returns it.
   * @param index The index
   */
  public XCN insertContactPerson(int index) throws HL7Exception {
     return (XCN) super.insertRepetition(5, index);
  }

  /**
   * Removes a repetition of Contact Person (FAC-5) at a given index and returns it.
   * @param index The index
   */
  public XCN removeContactPerson(int index) throws HL7Exception {
     return (XCN) super.removeRepetition(5, index);
  }

  /**
   * Returns a single repetition of Contact Person (FAC-5).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XCN getFac5_ContactPerson(int rep) throws HL7Exception {
    XCN ret = null;
    try {
        Type t = this.getField(5, rep);
        ret = (XCN)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Contact Person (FAC-5).
   */
  public XCN[] getFac5_ContactPerson() {
     XCN[] ret = null;
    try {
        Type[] t = this.getField(5);  
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
   * Returns a count of the number of repetitions of Contact Person (FAC-5).
   */
  public int getFac5_ContactPersonReps() {
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
   * Inserts a repetition of Contact Person (FAC-5) at a given index and returns it.
   * @param index The index
   */
  public XCN insertFac5_ContactPerson(int index) throws HL7Exception {
     return (XCN) super.insertRepetition(5, index);
  }

  /**
   * Removes a repetition of Contact Person (FAC-5) at a given index and returns it.
   * @param index The index
   */
  public XCN removeFac5_ContactPerson(int index) throws HL7Exception {
     return (XCN) super.removeRepetition(5, index);
  }

  /**
   * Returns a single repetition of Contact Title (FAC-6).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public ST getContactTitle(int rep) throws HL7Exception {
    ST ret = null;
    try {
        Type t = this.getField(6, rep);
        ret = (ST)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Contact Title (FAC-6).
   */
  public ST[] getContactTitle() {
     ST[] ret = null;
    try {
        Type[] t = this.getField(6);  
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
   * Returns a count of the number of repetitions of Contact Title (FAC-6).
   */
  public int getContactTitleReps() {
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
   * Inserts a repetition of Contact Title (FAC-6) at a given index and returns it.
   * @param index The index
   */
  public ST insertContactTitle(int index) throws HL7Exception {
     return (ST) super.insertRepetition(6, index);
  }

  /**
   * Removes a repetition of Contact Title (FAC-6) at a given index and returns it.
   * @param index The index
   */
  public ST removeContactTitle(int index) throws HL7Exception {
     return (ST) super.removeRepetition(6, index);
  }

  /**
   * Returns a single repetition of Contact Title (FAC-6).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public ST getFac6_ContactTitle(int rep) throws HL7Exception {
    ST ret = null;
    try {
        Type t = this.getField(6, rep);
        ret = (ST)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Contact Title (FAC-6).
   */
  public ST[] getFac6_ContactTitle() {
     ST[] ret = null;
    try {
        Type[] t = this.getField(6);  
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
   * Returns a count of the number of repetitions of Contact Title (FAC-6).
   */
  public int getFac6_ContactTitleReps() {
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
   * Inserts a repetition of Contact Title (FAC-6) at a given index and returns it.
   * @param index The index
   */
  public ST insertFac6_ContactTitle(int index) throws HL7Exception {
     return (ST) super.insertRepetition(6, index);
  }

  /**
   * Removes a repetition of Contact Title (FAC-6) at a given index and returns it.
   * @param index The index
   */
  public ST removeFac6_ContactTitle(int index) throws HL7Exception {
     return (ST) super.removeRepetition(6, index);
  }

  /**
   * Returns a single repetition of Contact Address (FAC-7).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XAD getContactAddress(int rep) throws HL7Exception {
    XAD ret = null;
    try {
        Type t = this.getField(7, rep);
        ret = (XAD)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Contact Address (FAC-7).
   */
  public XAD[] getContactAddress() {
     XAD[] ret = null;
    try {
        Type[] t = this.getField(7);  
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
   * Returns a count of the number of repetitions of Contact Address (FAC-7).
   */
  public int getContactAddressReps() {
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
   * Inserts a repetition of Contact Address (FAC-7) at a given index and returns it.
   * @param index The index
   */
  public XAD insertContactAddress(int index) throws HL7Exception {
     return (XAD) super.insertRepetition(7, index);
  }

  /**
   * Removes a repetition of Contact Address (FAC-7) at a given index and returns it.
   * @param index The index
   */
  public XAD removeContactAddress(int index) throws HL7Exception {
     return (XAD) super.removeRepetition(7, index);
  }

  /**
   * Returns a single repetition of Contact Address (FAC-7).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XAD getFac7_ContactAddress(int rep) throws HL7Exception {
    XAD ret = null;
    try {
        Type t = this.getField(7, rep);
        ret = (XAD)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Contact Address (FAC-7).
   */
  public XAD[] getFac7_ContactAddress() {
     XAD[] ret = null;
    try {
        Type[] t = this.getField(7);  
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
   * Returns a count of the number of repetitions of Contact Address (FAC-7).
   */
  public int getFac7_ContactAddressReps() {
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
   * Inserts a repetition of Contact Address (FAC-7) at a given index and returns it.
   * @param index The index
   */
  public XAD insertFac7_ContactAddress(int index) throws HL7Exception {
     return (XAD) super.insertRepetition(7, index);
  }

  /**
   * Removes a repetition of Contact Address (FAC-7) at a given index and returns it.
   * @param index The index
   */
  public XAD removeFac7_ContactAddress(int index) throws HL7Exception {
     return (XAD) super.removeRepetition(7, index);
  }

  /**
   * Returns a single repetition of Contact Telecommunication (FAC-8).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XTN getContactTelecommunication(int rep) throws HL7Exception {
    XTN ret = null;
    try {
        Type t = this.getField(8, rep);
        ret = (XTN)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Contact Telecommunication (FAC-8).
   */
  public XTN[] getContactTelecommunication() {
     XTN[] ret = null;
    try {
        Type[] t = this.getField(8);  
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
   * Returns a count of the number of repetitions of Contact Telecommunication (FAC-8).
   */
  public int getContactTelecommunicationReps() {
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
   * Inserts a repetition of Contact Telecommunication (FAC-8) at a given index and returns it.
   * @param index The index
   */
  public XTN insertContactTelecommunication(int index) throws HL7Exception {
     return (XTN) super.insertRepetition(8, index);
  }

  /**
   * Removes a repetition of Contact Telecommunication (FAC-8) at a given index and returns it.
   * @param index The index
   */
  public XTN removeContactTelecommunication(int index) throws HL7Exception {
     return (XTN) super.removeRepetition(8, index);
  }

  /**
   * Returns a single repetition of Contact Telecommunication (FAC-8).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XTN getFac8_ContactTelecommunication(int rep) throws HL7Exception {
    XTN ret = null;
    try {
        Type t = this.getField(8, rep);
        ret = (XTN)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Contact Telecommunication (FAC-8).
   */
  public XTN[] getFac8_ContactTelecommunication() {
     XTN[] ret = null;
    try {
        Type[] t = this.getField(8);  
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
   * Returns a count of the number of repetitions of Contact Telecommunication (FAC-8).
   */
  public int getFac8_ContactTelecommunicationReps() {
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
   * Inserts a repetition of Contact Telecommunication (FAC-8) at a given index and returns it.
   * @param index The index
   */
  public XTN insertFac8_ContactTelecommunication(int index) throws HL7Exception {
     return (XTN) super.insertRepetition(8, index);
  }

  /**
   * Removes a repetition of Contact Telecommunication (FAC-8) at a given index and returns it.
   * @param index The index
   */
  public XTN removeFac8_ContactTelecommunication(int index) throws HL7Exception {
     return (XTN) super.removeRepetition(8, index);
  }

  /**
   * Returns a single repetition of Signature Authority (FAC-9).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XCN getSignatureAuthority(int rep) throws HL7Exception {
    XCN ret = null;
    try {
        Type t = this.getField(9, rep);
        ret = (XCN)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Signature Authority (FAC-9).
   */
  public XCN[] getSignatureAuthority() {
     XCN[] ret = null;
    try {
        Type[] t = this.getField(9);  
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
   * Returns a count of the number of repetitions of Signature Authority (FAC-9).
   */
  public int getSignatureAuthorityReps() {
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
   * Inserts a repetition of Signature Authority (FAC-9) at a given index and returns it.
   * @param index The index
   */
  public XCN insertSignatureAuthority(int index) throws HL7Exception {
     return (XCN) super.insertRepetition(9, index);
  }

  /**
   * Removes a repetition of Signature Authority (FAC-9) at a given index and returns it.
   * @param index The index
   */
  public XCN removeSignatureAuthority(int index) throws HL7Exception {
     return (XCN) super.removeRepetition(9, index);
  }

  /**
   * Returns a single repetition of Signature Authority (FAC-9).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XCN getFac9_SignatureAuthority(int rep) throws HL7Exception {
    XCN ret = null;
    try {
        Type t = this.getField(9, rep);
        ret = (XCN)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Signature Authority (FAC-9).
   */
  public XCN[] getFac9_SignatureAuthority() {
     XCN[] ret = null;
    try {
        Type[] t = this.getField(9);  
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
   * Returns a count of the number of repetitions of Signature Authority (FAC-9).
   */
  public int getFac9_SignatureAuthorityReps() {
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
   * Inserts a repetition of Signature Authority (FAC-9) at a given index and returns it.
   * @param index The index
   */
  public XCN insertFac9_SignatureAuthority(int index) throws HL7Exception {
     return (XCN) super.insertRepetition(9, index);
  }

  /**
   * Removes a repetition of Signature Authority (FAC-9) at a given index and returns it.
   * @param index The index
   */
  public XCN removeFac9_SignatureAuthority(int index) throws HL7Exception {
     return (XCN) super.removeRepetition(9, index);
  }

  /**
   * Returns Signature Authority Title (FAC-10).
   */
  public ST getSignatureAuthorityTitle()  {
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
   * Returns Signature Authority Title (FAC-10).
   */
  public ST getFac10_SignatureAuthorityTitle()  {
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
   * Returns a single repetition of Signature Authority Address (FAC-11).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XAD getSignatureAuthorityAddress(int rep) throws HL7Exception {
    XAD ret = null;
    try {
        Type t = this.getField(11, rep);
        ret = (XAD)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Signature Authority Address (FAC-11).
   */
  public XAD[] getSignatureAuthorityAddress() {
     XAD[] ret = null;
    try {
        Type[] t = this.getField(11);  
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
   * Returns a count of the number of repetitions of Signature Authority Address (FAC-11).
   */
  public int getSignatureAuthorityAddressReps() {
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
   * Inserts a repetition of Signature Authority Address (FAC-11) at a given index and returns it.
   * @param index The index
   */
  public XAD insertSignatureAuthorityAddress(int index) throws HL7Exception {
     return (XAD) super.insertRepetition(11, index);
  }

  /**
   * Removes a repetition of Signature Authority Address (FAC-11) at a given index and returns it.
   * @param index The index
   */
  public XAD removeSignatureAuthorityAddress(int index) throws HL7Exception {
     return (XAD) super.removeRepetition(11, index);
  }

  /**
   * Returns a single repetition of Signature Authority Address (FAC-11).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XAD getFac11_SignatureAuthorityAddress(int rep) throws HL7Exception {
    XAD ret = null;
    try {
        Type t = this.getField(11, rep);
        ret = (XAD)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Signature Authority Address (FAC-11).
   */
  public XAD[] getFac11_SignatureAuthorityAddress() {
     XAD[] ret = null;
    try {
        Type[] t = this.getField(11);  
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
   * Returns a count of the number of repetitions of Signature Authority Address (FAC-11).
   */
  public int getFac11_SignatureAuthorityAddressReps() {
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
   * Inserts a repetition of Signature Authority Address (FAC-11) at a given index and returns it.
   * @param index The index
   */
  public XAD insertFac11_SignatureAuthorityAddress(int index) throws HL7Exception {
     return (XAD) super.insertRepetition(11, index);
  }

  /**
   * Removes a repetition of Signature Authority Address (FAC-11) at a given index and returns it.
   * @param index The index
   */
  public XAD removeFac11_SignatureAuthorityAddress(int index) throws HL7Exception {
     return (XAD) super.removeRepetition(11, index);
  }

  /**
   * Returns Signature Authority Telecommunication (FAC-12).
   */
  public XTN getSignatureAuthorityTelecommunication()  {
    XTN ret = null;
    try {
        Type t = this.getField(12, 0);
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
   * Returns Signature Authority Telecommunication (FAC-12).
   */
  public XTN getFac12_SignatureAuthorityTelecommunication()  {
    XTN ret = null;
    try {
        Type t = this.getField(12, 0);
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

   protected Type createNewTypeWithoutReflection(int field) {
      switch (field) {
         case 0: return new ca.uhn.hl7v2.model.v26.datatype.EI(getMessage());
         case 1: return new ca.uhn.hl7v2.model.v26.datatype.ID(getMessage(), new Integer(331));
         case 2: return new ca.uhn.hl7v2.model.v26.datatype.XAD(getMessage());
         case 3: return new ca.uhn.hl7v2.model.v26.datatype.XTN(getMessage());
         case 4: return new ca.uhn.hl7v2.model.v26.datatype.XCN(getMessage());
         case 5: return new ca.uhn.hl7v2.model.v26.datatype.ST(getMessage());
         case 6: return new ca.uhn.hl7v2.model.v26.datatype.XAD(getMessage());
         case 7: return new ca.uhn.hl7v2.model.v26.datatype.XTN(getMessage());
         case 8: return new ca.uhn.hl7v2.model.v26.datatype.XCN(getMessage());
         case 9: return new ca.uhn.hl7v2.model.v26.datatype.ST(getMessage());
         case 10: return new ca.uhn.hl7v2.model.v26.datatype.XAD(getMessage());
         case 11: return new ca.uhn.hl7v2.model.v26.datatype.XTN(getMessage());
         default: return null;
      }
   }

}