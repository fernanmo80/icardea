package ca.uhn.hl7v2.model.v26.segment;

import ca.uhn.hl7v2.model.*;
import ca.uhn.hl7v2.model.v26.datatype.*;
import ca.uhn.log.HapiLogFactory;
import ca.uhn.hl7v2.parser.ModelClassFactory;
import ca.uhn.hl7v2.HL7Exception;

/**
 * <p>Represents an HL7 NK1 message segment. 
 * This segment has the following fields:</p><p>
 * NK1-1: Set ID - NK1 (SI)<br> 
 * NK1-2: Name (XPN)<br> 
 * NK1-3: Relationship (CWE)<br> 
 * NK1-4: Address (XAD)<br> 
 * NK1-5: Phone Number (XTN)<br> 
 * NK1-6: Business Phone Number (XTN)<br> 
 * NK1-7: Contact Role (CWE)<br> 
 * NK1-8: Start Date (DT)<br> 
 * NK1-9: End Date (DT)<br> 
 * NK1-10: Next of Kin / Associated Parties Job Title (ST)<br> 
 * NK1-11: Next of Kin / Associated Parties Job Code/Class (JCC)<br> 
 * NK1-12: Next of Kin / Associated Parties Employee Number (CX)<br> 
 * NK1-13: Organization Name - NK1 (XON)<br> 
 * NK1-14: Marital Status (CWE)<br> 
 * NK1-15: Administrative Sex (IS)<br> 
 * NK1-16: Date/Time of Birth (DTM)<br> 
 * NK1-17: Living Dependency (IS)<br> 
 * NK1-18: Ambulatory Status (IS)<br> 
 * NK1-19: Citizenship (CWE)<br> 
 * NK1-20: Primary Language (CWE)<br> 
 * NK1-21: Living Arrangement (IS)<br> 
 * NK1-22: Publicity Code (CWE)<br> 
 * NK1-23: Protection Indicator (ID)<br> 
 * NK1-24: Student Indicator (IS)<br> 
 * NK1-25: Religion (CWE)<br> 
 * NK1-26: Mother's Maiden Name (XPN)<br> 
 * NK1-27: Nationality (CWE)<br> 
 * NK1-28: Ethnic Group (CWE)<br> 
 * NK1-29: Contact Reason (CWE)<br> 
 * NK1-30: Contact Person's Name (XPN)<br> 
 * NK1-31: Contact Person's Telephone Number (XTN)<br> 
 * NK1-32: Contact Person's Address (XAD)<br> 
 * NK1-33: Next of Kin/Associated Party's Identifiers (CX)<br> 
 * NK1-34: Job Status (IS)<br> 
 * NK1-35: Race (CWE)<br> 
 * NK1-36: Handicap (IS)<br> 
 * NK1-37: Contact Person Social Security Number (ST)<br> 
 * NK1-38: Next of Kin Birth Place (ST)<br> 
 * NK1-39: VIP Indicator (IS)<br> 
 * </p><p>The get...() methods return data from individual fields.  These methods 
 * do not throw exceptions and may therefore have to handle exceptions internally.  
 * If an exception is handled internally, it is logged and null is returned.  
 * This is not expected to happen - if it does happen this indicates not so much 
 * an exceptional circumstance as a bug in the code for this class.</p>    
 */
public class NK1 extends AbstractSegment  {

  /**
   * Creates a NK1 (Next of Kin / Associated Parties) segment object that belongs to the given 
   * message.  
   */
  public NK1(Group parent, ModelClassFactory factory) {
    super(parent, factory);
    Message message = getMessage();
    try {
       this.add(SI.class, true, 1, 4, new Object[]{message}, "Set ID - NK1");
       this.add(XPN.class, false, 0, 250, new Object[]{message}, "Name");
       this.add(CWE.class, false, 1, 705, new Object[]{message}, "Relationship");
       this.add(XAD.class, false, 0, 250, new Object[]{message}, "Address");
       this.add(XTN.class, false, 0, 250, new Object[]{message}, "Phone Number");
       this.add(XTN.class, false, 0, 250, new Object[]{message}, "Business Phone Number");
       this.add(CWE.class, false, 1, 705, new Object[]{message}, "Contact Role");
       this.add(DT.class, false, 1, 8, new Object[]{message}, "Start Date");
       this.add(DT.class, false, 1, 8, new Object[]{message}, "End Date");
       this.add(ST.class, false, 1, 60, new Object[]{message}, "Next of Kin / Associated Parties Job Title");
       this.add(JCC.class, false, 1, 20, new Object[]{message}, "Next of Kin / Associated Parties Job Code/Class");
       this.add(CX.class, false, 1, 250, new Object[]{message}, "Next of Kin / Associated Parties Employee Number");
       this.add(XON.class, false, 0, 250, new Object[]{message}, "Organization Name - NK1");
       this.add(CWE.class, false, 1, 705, new Object[]{message}, "Marital Status");
       this.add(IS.class, false, 1, 1, new Object[]{message, new Integer(1)}, "Administrative Sex");
       this.add(DTM.class, false, 1, 24, new Object[]{message}, "Date/Time of Birth");
       this.add(IS.class, false, 0, 2, new Object[]{message, new Integer(223)}, "Living Dependency");
       this.add(IS.class, false, 0, 2, new Object[]{message, new Integer(9)}, "Ambulatory Status");
       this.add(CWE.class, false, 0, 705, new Object[]{message}, "Citizenship");
       this.add(CWE.class, false, 1, 705, new Object[]{message}, "Primary Language");
       this.add(IS.class, false, 1, 2, new Object[]{message, new Integer(220)}, "Living Arrangement");
       this.add(CWE.class, false, 1, 705, new Object[]{message}, "Publicity Code");
       this.add(ID.class, false, 1, 0, new Object[]{message, new Integer(136)}, "Protection Indicator");
       this.add(IS.class, false, 1, 2, new Object[]{message, new Integer(231)}, "Student Indicator");
       this.add(CWE.class, false, 1, 705, new Object[]{message}, "Religion");
       this.add(XPN.class, false, 0, 250, new Object[]{message}, "Mother's Maiden Name");
       this.add(CWE.class, false, 1, 0, new Object[]{message}, "Nationality");
       this.add(CWE.class, false, 0, 705, new Object[]{message}, "Ethnic Group");
       this.add(CWE.class, false, 0, 705, new Object[]{message}, "Contact Reason");
       this.add(XPN.class, false, 0, 250, new Object[]{message}, "Contact Person's Name");
       this.add(XTN.class, false, 0, 250, new Object[]{message}, "Contact Person's Telephone Number");
       this.add(XAD.class, false, 0, 250, new Object[]{message}, "Contact Person's Address");
       this.add(CX.class, false, 0, 250, new Object[]{message}, "Next of Kin/Associated Party's Identifiers");
       this.add(IS.class, false, 1, 2, new Object[]{message, new Integer(311)}, "Job Status");
       this.add(CWE.class, false, 0, 705, new Object[]{message}, "Race");
       this.add(IS.class, false, 1, 2, new Object[]{message, new Integer(295)}, "Handicap");
       this.add(ST.class, false, 1, 16, new Object[]{message}, "Contact Person Social Security Number");
       this.add(ST.class, false, 1, 250, new Object[]{message}, "Next of Kin Birth Place");
       this.add(IS.class, false, 1, 2, new Object[]{message, new Integer(99)}, "VIP Indicator");
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Can't instantiate " + this.getClass().getName(), he);
    }
  }

  /**
   * Returns Set ID - NK1 (NK1-1).
   */
  public SI getSetIDNK1()  {
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
   * Returns Set ID - NK1 (NK1-1).
   */
  public SI getNk11_SetIDNK1()  {
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
   * Returns a single repetition of Name (NK1-2).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XPN getNK1Name(int rep) throws HL7Exception {
    XPN ret = null;
    try {
        Type t = this.getField(2, rep);
        ret = (XPN)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Name (NK1-2).
   */
  public XPN[] getNK1Name() {
     XPN[] ret = null;
    try {
        Type[] t = this.getField(2);  
        ret = new XPN[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (XPN)t[i];
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
   * Returns a count of the number of repetitions of Name (NK1-2).
   */
  public int getNK1NameReps() {
    try {
        return this.getField(2).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Name (NK1-2) at a given index and returns it.
   * @param index The index
   */
  public XPN insertNK1Name(int index) throws HL7Exception {
     return (XPN) super.insertRepetition(2, index);
  }

  /**
   * Removes a repetition of Name (NK1-2) at a given index and returns it.
   * @param index The index
   */
  public XPN removeNK1Name(int index) throws HL7Exception {
     return (XPN) super.removeRepetition(2, index);
  }

  /**
   * Returns a single repetition of Name (NK1-2).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XPN getNk12_Name(int rep) throws HL7Exception {
    XPN ret = null;
    try {
        Type t = this.getField(2, rep);
        ret = (XPN)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Name (NK1-2).
   */
  public XPN[] getNk12_Name() {
     XPN[] ret = null;
    try {
        Type[] t = this.getField(2);  
        ret = new XPN[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (XPN)t[i];
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
   * Returns a count of the number of repetitions of Name (NK1-2).
   */
  public int getNk12_NameReps() {
    try {
        return this.getField(2).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Name (NK1-2) at a given index and returns it.
   * @param index The index
   */
  public XPN insertNk12_Name(int index) throws HL7Exception {
     return (XPN) super.insertRepetition(2, index);
  }

  /**
   * Removes a repetition of Name (NK1-2) at a given index and returns it.
   * @param index The index
   */
  public XPN removeNk12_Name(int index) throws HL7Exception {
     return (XPN) super.removeRepetition(2, index);
  }

  /**
   * Returns Relationship (NK1-3).
   */
  public CWE getRelationship()  {
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
   * Returns Relationship (NK1-3).
   */
  public CWE getNk13_Relationship()  {
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
   * Returns a single repetition of Address (NK1-4).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XAD getAddress(int rep) throws HL7Exception {
    XAD ret = null;
    try {
        Type t = this.getField(4, rep);
        ret = (XAD)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Address (NK1-4).
   */
  public XAD[] getAddress() {
     XAD[] ret = null;
    try {
        Type[] t = this.getField(4);  
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
   * Returns a count of the number of repetitions of Address (NK1-4).
   */
  public int getAddressReps() {
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
   * Inserts a repetition of Address (NK1-4) at a given index and returns it.
   * @param index The index
   */
  public XAD insertAddress(int index) throws HL7Exception {
     return (XAD) super.insertRepetition(4, index);
  }

  /**
   * Removes a repetition of Address (NK1-4) at a given index and returns it.
   * @param index The index
   */
  public XAD removeAddress(int index) throws HL7Exception {
     return (XAD) super.removeRepetition(4, index);
  }

  /**
   * Returns a single repetition of Address (NK1-4).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XAD getNk14_Address(int rep) throws HL7Exception {
    XAD ret = null;
    try {
        Type t = this.getField(4, rep);
        ret = (XAD)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Address (NK1-4).
   */
  public XAD[] getNk14_Address() {
     XAD[] ret = null;
    try {
        Type[] t = this.getField(4);  
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
   * Returns a count of the number of repetitions of Address (NK1-4).
   */
  public int getNk14_AddressReps() {
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
   * Inserts a repetition of Address (NK1-4) at a given index and returns it.
   * @param index The index
   */
  public XAD insertNk14_Address(int index) throws HL7Exception {
     return (XAD) super.insertRepetition(4, index);
  }

  /**
   * Removes a repetition of Address (NK1-4) at a given index and returns it.
   * @param index The index
   */
  public XAD removeNk14_Address(int index) throws HL7Exception {
     return (XAD) super.removeRepetition(4, index);
  }

  /**
   * Returns a single repetition of Phone Number (NK1-5).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XTN getPhoneNumber(int rep) throws HL7Exception {
    XTN ret = null;
    try {
        Type t = this.getField(5, rep);
        ret = (XTN)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Phone Number (NK1-5).
   */
  public XTN[] getPhoneNumber() {
     XTN[] ret = null;
    try {
        Type[] t = this.getField(5);  
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
   * Returns a count of the number of repetitions of Phone Number (NK1-5).
   */
  public int getPhoneNumberReps() {
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
   * Inserts a repetition of Phone Number (NK1-5) at a given index and returns it.
   * @param index The index
   */
  public XTN insertPhoneNumber(int index) throws HL7Exception {
     return (XTN) super.insertRepetition(5, index);
  }

  /**
   * Removes a repetition of Phone Number (NK1-5) at a given index and returns it.
   * @param index The index
   */
  public XTN removePhoneNumber(int index) throws HL7Exception {
     return (XTN) super.removeRepetition(5, index);
  }

  /**
   * Returns a single repetition of Phone Number (NK1-5).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XTN getNk15_PhoneNumber(int rep) throws HL7Exception {
    XTN ret = null;
    try {
        Type t = this.getField(5, rep);
        ret = (XTN)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Phone Number (NK1-5).
   */
  public XTN[] getNk15_PhoneNumber() {
     XTN[] ret = null;
    try {
        Type[] t = this.getField(5);  
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
   * Returns a count of the number of repetitions of Phone Number (NK1-5).
   */
  public int getNk15_PhoneNumberReps() {
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
   * Inserts a repetition of Phone Number (NK1-5) at a given index and returns it.
   * @param index The index
   */
  public XTN insertNk15_PhoneNumber(int index) throws HL7Exception {
     return (XTN) super.insertRepetition(5, index);
  }

  /**
   * Removes a repetition of Phone Number (NK1-5) at a given index and returns it.
   * @param index The index
   */
  public XTN removeNk15_PhoneNumber(int index) throws HL7Exception {
     return (XTN) super.removeRepetition(5, index);
  }

  /**
   * Returns a single repetition of Business Phone Number (NK1-6).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XTN getBusinessPhoneNumber(int rep) throws HL7Exception {
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
   * Returns all repetitions of Business Phone Number (NK1-6).
   */
  public XTN[] getBusinessPhoneNumber() {
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
   * Returns a count of the number of repetitions of Business Phone Number (NK1-6).
   */
  public int getBusinessPhoneNumberReps() {
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
   * Inserts a repetition of Business Phone Number (NK1-6) at a given index and returns it.
   * @param index The index
   */
  public XTN insertBusinessPhoneNumber(int index) throws HL7Exception {
     return (XTN) super.insertRepetition(6, index);
  }

  /**
   * Removes a repetition of Business Phone Number (NK1-6) at a given index and returns it.
   * @param index The index
   */
  public XTN removeBusinessPhoneNumber(int index) throws HL7Exception {
     return (XTN) super.removeRepetition(6, index);
  }

  /**
   * Returns a single repetition of Business Phone Number (NK1-6).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XTN getNk16_BusinessPhoneNumber(int rep) throws HL7Exception {
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
   * Returns all repetitions of Business Phone Number (NK1-6).
   */
  public XTN[] getNk16_BusinessPhoneNumber() {
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
   * Returns a count of the number of repetitions of Business Phone Number (NK1-6).
   */
  public int getNk16_BusinessPhoneNumberReps() {
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
   * Inserts a repetition of Business Phone Number (NK1-6) at a given index and returns it.
   * @param index The index
   */
  public XTN insertNk16_BusinessPhoneNumber(int index) throws HL7Exception {
     return (XTN) super.insertRepetition(6, index);
  }

  /**
   * Removes a repetition of Business Phone Number (NK1-6) at a given index and returns it.
   * @param index The index
   */
  public XTN removeNk16_BusinessPhoneNumber(int index) throws HL7Exception {
     return (XTN) super.removeRepetition(6, index);
  }

  /**
   * Returns Contact Role (NK1-7).
   */
  public CWE getContactRole()  {
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
   * Returns Contact Role (NK1-7).
   */
  public CWE getNk17_ContactRole()  {
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
   * Returns Start Date (NK1-8).
   */
  public DT getStartDate()  {
    DT ret = null;
    try {
        Type t = this.getField(8, 0);
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
   * Returns Start Date (NK1-8).
   */
  public DT getNk18_StartDate()  {
    DT ret = null;
    try {
        Type t = this.getField(8, 0);
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
   * Returns End Date (NK1-9).
   */
  public DT getEndDate()  {
    DT ret = null;
    try {
        Type t = this.getField(9, 0);
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
   * Returns End Date (NK1-9).
   */
  public DT getNk19_EndDate()  {
    DT ret = null;
    try {
        Type t = this.getField(9, 0);
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
   * Returns Next of Kin / Associated Parties Job Title (NK1-10).
   */
  public ST getNextOfKinAssociatedPartiesJobTitle()  {
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
   * Returns Next of Kin / Associated Parties Job Title (NK1-10).
   */
  public ST getNk110_NextOfKinAssociatedPartiesJobTitle()  {
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
   * Returns Next of Kin / Associated Parties Job Code/Class (NK1-11).
   */
  public JCC getNextOfKinAssociatedPartiesJobCodeClass()  {
    JCC ret = null;
    try {
        Type t = this.getField(11, 0);
        ret = (JCC)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns Next of Kin / Associated Parties Job Code/Class (NK1-11).
   */
  public JCC getNk111_NextOfKinAssociatedPartiesJobCodeClass()  {
    JCC ret = null;
    try {
        Type t = this.getField(11, 0);
        ret = (JCC)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns Next of Kin / Associated Parties Employee Number (NK1-12).
   */
  public CX getNextOfKinAssociatedPartiesEmployeeNumber()  {
    CX ret = null;
    try {
        Type t = this.getField(12, 0);
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
   * Returns Next of Kin / Associated Parties Employee Number (NK1-12).
   */
  public CX getNk112_NextOfKinAssociatedPartiesEmployeeNumber()  {
    CX ret = null;
    try {
        Type t = this.getField(12, 0);
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
   * Returns a single repetition of Organization Name - NK1 (NK1-13).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XON getOrganizationNameNK1(int rep) throws HL7Exception {
    XON ret = null;
    try {
        Type t = this.getField(13, rep);
        ret = (XON)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Organization Name - NK1 (NK1-13).
   */
  public XON[] getOrganizationNameNK1() {
     XON[] ret = null;
    try {
        Type[] t = this.getField(13);  
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
   * Returns a count of the number of repetitions of Organization Name - NK1 (NK1-13).
   */
  public int getOrganizationNameNK1Reps() {
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
   * Inserts a repetition of Organization Name - NK1 (NK1-13) at a given index and returns it.
   * @param index The index
   */
  public XON insertOrganizationNameNK1(int index) throws HL7Exception {
     return (XON) super.insertRepetition(13, index);
  }

  /**
   * Removes a repetition of Organization Name - NK1 (NK1-13) at a given index and returns it.
   * @param index The index
   */
  public XON removeOrganizationNameNK1(int index) throws HL7Exception {
     return (XON) super.removeRepetition(13, index);
  }

  /**
   * Returns a single repetition of Organization Name - NK1 (NK1-13).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XON getNk113_OrganizationNameNK1(int rep) throws HL7Exception {
    XON ret = null;
    try {
        Type t = this.getField(13, rep);
        ret = (XON)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Organization Name - NK1 (NK1-13).
   */
  public XON[] getNk113_OrganizationNameNK1() {
     XON[] ret = null;
    try {
        Type[] t = this.getField(13);  
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
   * Returns a count of the number of repetitions of Organization Name - NK1 (NK1-13).
   */
  public int getNk113_OrganizationNameNK1Reps() {
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
   * Inserts a repetition of Organization Name - NK1 (NK1-13) at a given index and returns it.
   * @param index The index
   */
  public XON insertNk113_OrganizationNameNK1(int index) throws HL7Exception {
     return (XON) super.insertRepetition(13, index);
  }

  /**
   * Removes a repetition of Organization Name - NK1 (NK1-13) at a given index and returns it.
   * @param index The index
   */
  public XON removeNk113_OrganizationNameNK1(int index) throws HL7Exception {
     return (XON) super.removeRepetition(13, index);
  }

  /**
   * Returns Marital Status (NK1-14).
   */
  public CWE getMaritalStatus()  {
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
   * Returns Marital Status (NK1-14).
   */
  public CWE getNk114_MaritalStatus()  {
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
   * Returns Administrative Sex (NK1-15).
   */
  public IS getAdministrativeSex()  {
    IS ret = null;
    try {
        Type t = this.getField(15, 0);
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
   * Returns Administrative Sex (NK1-15).
   */
  public IS getNk115_AdministrativeSex()  {
    IS ret = null;
    try {
        Type t = this.getField(15, 0);
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
   * Returns Date/Time of Birth (NK1-16).
   */
  public DTM getDateTimeOfBirth()  {
    DTM ret = null;
    try {
        Type t = this.getField(16, 0);
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
   * Returns Date/Time of Birth (NK1-16).
   */
  public DTM getNk116_DateTimeOfBirth()  {
    DTM ret = null;
    try {
        Type t = this.getField(16, 0);
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
   * Returns a single repetition of Living Dependency (NK1-17).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public IS getLivingDependency(int rep) throws HL7Exception {
    IS ret = null;
    try {
        Type t = this.getField(17, rep);
        ret = (IS)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Living Dependency (NK1-17).
   */
  public IS[] getLivingDependency() {
     IS[] ret = null;
    try {
        Type[] t = this.getField(17);  
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
   * Returns a count of the number of repetitions of Living Dependency (NK1-17).
   */
  public int getLivingDependencyReps() {
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
   * Inserts a repetition of Living Dependency (NK1-17) at a given index and returns it.
   * @param index The index
   */
  public IS insertLivingDependency(int index) throws HL7Exception {
     return (IS) super.insertRepetition(17, index);
  }

  /**
   * Removes a repetition of Living Dependency (NK1-17) at a given index and returns it.
   * @param index The index
   */
  public IS removeLivingDependency(int index) throws HL7Exception {
     return (IS) super.removeRepetition(17, index);
  }

  /**
   * Returns a single repetition of Living Dependency (NK1-17).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public IS getNk117_LivingDependency(int rep) throws HL7Exception {
    IS ret = null;
    try {
        Type t = this.getField(17, rep);
        ret = (IS)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Living Dependency (NK1-17).
   */
  public IS[] getNk117_LivingDependency() {
     IS[] ret = null;
    try {
        Type[] t = this.getField(17);  
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
   * Returns a count of the number of repetitions of Living Dependency (NK1-17).
   */
  public int getNk117_LivingDependencyReps() {
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
   * Inserts a repetition of Living Dependency (NK1-17) at a given index and returns it.
   * @param index The index
   */
  public IS insertNk117_LivingDependency(int index) throws HL7Exception {
     return (IS) super.insertRepetition(17, index);
  }

  /**
   * Removes a repetition of Living Dependency (NK1-17) at a given index and returns it.
   * @param index The index
   */
  public IS removeNk117_LivingDependency(int index) throws HL7Exception {
     return (IS) super.removeRepetition(17, index);
  }

  /**
   * Returns a single repetition of Ambulatory Status (NK1-18).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public IS getAmbulatoryStatus(int rep) throws HL7Exception {
    IS ret = null;
    try {
        Type t = this.getField(18, rep);
        ret = (IS)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Ambulatory Status (NK1-18).
   */
  public IS[] getAmbulatoryStatus() {
     IS[] ret = null;
    try {
        Type[] t = this.getField(18);  
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
   * Returns a count of the number of repetitions of Ambulatory Status (NK1-18).
   */
  public int getAmbulatoryStatusReps() {
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
   * Inserts a repetition of Ambulatory Status (NK1-18) at a given index and returns it.
   * @param index The index
   */
  public IS insertAmbulatoryStatus(int index) throws HL7Exception {
     return (IS) super.insertRepetition(18, index);
  }

  /**
   * Removes a repetition of Ambulatory Status (NK1-18) at a given index and returns it.
   * @param index The index
   */
  public IS removeAmbulatoryStatus(int index) throws HL7Exception {
     return (IS) super.removeRepetition(18, index);
  }

  /**
   * Returns a single repetition of Ambulatory Status (NK1-18).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public IS getNk118_AmbulatoryStatus(int rep) throws HL7Exception {
    IS ret = null;
    try {
        Type t = this.getField(18, rep);
        ret = (IS)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Ambulatory Status (NK1-18).
   */
  public IS[] getNk118_AmbulatoryStatus() {
     IS[] ret = null;
    try {
        Type[] t = this.getField(18);  
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
   * Returns a count of the number of repetitions of Ambulatory Status (NK1-18).
   */
  public int getNk118_AmbulatoryStatusReps() {
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
   * Inserts a repetition of Ambulatory Status (NK1-18) at a given index and returns it.
   * @param index The index
   */
  public IS insertNk118_AmbulatoryStatus(int index) throws HL7Exception {
     return (IS) super.insertRepetition(18, index);
  }

  /**
   * Removes a repetition of Ambulatory Status (NK1-18) at a given index and returns it.
   * @param index The index
   */
  public IS removeNk118_AmbulatoryStatus(int index) throws HL7Exception {
     return (IS) super.removeRepetition(18, index);
  }

  /**
   * Returns a single repetition of Citizenship (NK1-19).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getCitizenship(int rep) throws HL7Exception {
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
   * Returns all repetitions of Citizenship (NK1-19).
   */
  public CWE[] getCitizenship() {
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
   * Returns a count of the number of repetitions of Citizenship (NK1-19).
   */
  public int getCitizenshipReps() {
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
   * Inserts a repetition of Citizenship (NK1-19) at a given index and returns it.
   * @param index The index
   */
  public CWE insertCitizenship(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(19, index);
  }

  /**
   * Removes a repetition of Citizenship (NK1-19) at a given index and returns it.
   * @param index The index
   */
  public CWE removeCitizenship(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(19, index);
  }

  /**
   * Returns a single repetition of Citizenship (NK1-19).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getNk119_Citizenship(int rep) throws HL7Exception {
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
   * Returns all repetitions of Citizenship (NK1-19).
   */
  public CWE[] getNk119_Citizenship() {
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
   * Returns a count of the number of repetitions of Citizenship (NK1-19).
   */
  public int getNk119_CitizenshipReps() {
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
   * Inserts a repetition of Citizenship (NK1-19) at a given index and returns it.
   * @param index The index
   */
  public CWE insertNk119_Citizenship(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(19, index);
  }

  /**
   * Removes a repetition of Citizenship (NK1-19) at a given index and returns it.
   * @param index The index
   */
  public CWE removeNk119_Citizenship(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(19, index);
  }

  /**
   * Returns Primary Language (NK1-20).
   */
  public CWE getPrimaryLanguage()  {
    CWE ret = null;
    try {
        Type t = this.getField(20, 0);
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
   * Returns Primary Language (NK1-20).
   */
  public CWE getNk120_PrimaryLanguage()  {
    CWE ret = null;
    try {
        Type t = this.getField(20, 0);
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
   * Returns Living Arrangement (NK1-21).
   */
  public IS getLivingArrangement()  {
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
   * Returns Living Arrangement (NK1-21).
   */
  public IS getNk121_LivingArrangement()  {
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
   * Returns Publicity Code (NK1-22).
   */
  public CWE getPublicityCode()  {
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
   * Returns Publicity Code (NK1-22).
   */
  public CWE getNk122_PublicityCode()  {
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
   * Returns Protection Indicator (NK1-23).
   */
  public ID getProtectionIndicator()  {
    ID ret = null;
    try {
        Type t = this.getField(23, 0);
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
   * Returns Protection Indicator (NK1-23).
   */
  public ID getNk123_ProtectionIndicator()  {
    ID ret = null;
    try {
        Type t = this.getField(23, 0);
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
   * Returns Student Indicator (NK1-24).
   */
  public IS getStudentIndicator()  {
    IS ret = null;
    try {
        Type t = this.getField(24, 0);
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
   * Returns Student Indicator (NK1-24).
   */
  public IS getNk124_StudentIndicator()  {
    IS ret = null;
    try {
        Type t = this.getField(24, 0);
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
   * Returns Religion (NK1-25).
   */
  public CWE getReligion()  {
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
   * Returns Religion (NK1-25).
   */
  public CWE getNk125_Religion()  {
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
   * Returns a single repetition of Mother's Maiden Name (NK1-26).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XPN getMotherSMaidenName(int rep) throws HL7Exception {
    XPN ret = null;
    try {
        Type t = this.getField(26, rep);
        ret = (XPN)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Mother's Maiden Name (NK1-26).
   */
  public XPN[] getMotherSMaidenName() {
     XPN[] ret = null;
    try {
        Type[] t = this.getField(26);  
        ret = new XPN[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (XPN)t[i];
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
   * Returns a count of the number of repetitions of Mother's Maiden Name (NK1-26).
   */
  public int getMotherSMaidenNameReps() {
    try {
        return this.getField(26).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Mother's Maiden Name (NK1-26) at a given index and returns it.
   * @param index The index
   */
  public XPN insertMotherSMaidenName(int index) throws HL7Exception {
     return (XPN) super.insertRepetition(26, index);
  }

  /**
   * Removes a repetition of Mother's Maiden Name (NK1-26) at a given index and returns it.
   * @param index The index
   */
  public XPN removeMotherSMaidenName(int index) throws HL7Exception {
     return (XPN) super.removeRepetition(26, index);
  }

  /**
   * Returns a single repetition of Mother's Maiden Name (NK1-26).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XPN getNk126_MotherSMaidenName(int rep) throws HL7Exception {
    XPN ret = null;
    try {
        Type t = this.getField(26, rep);
        ret = (XPN)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Mother's Maiden Name (NK1-26).
   */
  public XPN[] getNk126_MotherSMaidenName() {
     XPN[] ret = null;
    try {
        Type[] t = this.getField(26);  
        ret = new XPN[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (XPN)t[i];
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
   * Returns a count of the number of repetitions of Mother's Maiden Name (NK1-26).
   */
  public int getNk126_MotherSMaidenNameReps() {
    try {
        return this.getField(26).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Mother's Maiden Name (NK1-26) at a given index and returns it.
   * @param index The index
   */
  public XPN insertNk126_MotherSMaidenName(int index) throws HL7Exception {
     return (XPN) super.insertRepetition(26, index);
  }

  /**
   * Removes a repetition of Mother's Maiden Name (NK1-26) at a given index and returns it.
   * @param index The index
   */
  public XPN removeNk126_MotherSMaidenName(int index) throws HL7Exception {
     return (XPN) super.removeRepetition(26, index);
  }

  /**
   * Returns Nationality (NK1-27).
   */
  public CWE getNationality()  {
    CWE ret = null;
    try {
        Type t = this.getField(27, 0);
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
   * Returns Nationality (NK1-27).
   */
  public CWE getNk127_Nationality()  {
    CWE ret = null;
    try {
        Type t = this.getField(27, 0);
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
   * Returns a single repetition of Ethnic Group (NK1-28).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getEthnicGroup(int rep) throws HL7Exception {
    CWE ret = null;
    try {
        Type t = this.getField(28, rep);
        ret = (CWE)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Ethnic Group (NK1-28).
   */
  public CWE[] getEthnicGroup() {
     CWE[] ret = null;
    try {
        Type[] t = this.getField(28);  
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
   * Returns a count of the number of repetitions of Ethnic Group (NK1-28).
   */
  public int getEthnicGroupReps() {
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
   * Inserts a repetition of Ethnic Group (NK1-28) at a given index and returns it.
   * @param index The index
   */
  public CWE insertEthnicGroup(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(28, index);
  }

  /**
   * Removes a repetition of Ethnic Group (NK1-28) at a given index and returns it.
   * @param index The index
   */
  public CWE removeEthnicGroup(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(28, index);
  }

  /**
   * Returns a single repetition of Ethnic Group (NK1-28).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getNk128_EthnicGroup(int rep) throws HL7Exception {
    CWE ret = null;
    try {
        Type t = this.getField(28, rep);
        ret = (CWE)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Ethnic Group (NK1-28).
   */
  public CWE[] getNk128_EthnicGroup() {
     CWE[] ret = null;
    try {
        Type[] t = this.getField(28);  
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
   * Returns a count of the number of repetitions of Ethnic Group (NK1-28).
   */
  public int getNk128_EthnicGroupReps() {
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
   * Inserts a repetition of Ethnic Group (NK1-28) at a given index and returns it.
   * @param index The index
   */
  public CWE insertNk128_EthnicGroup(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(28, index);
  }

  /**
   * Removes a repetition of Ethnic Group (NK1-28) at a given index and returns it.
   * @param index The index
   */
  public CWE removeNk128_EthnicGroup(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(28, index);
  }

  /**
   * Returns a single repetition of Contact Reason (NK1-29).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getContactReason(int rep) throws HL7Exception {
    CWE ret = null;
    try {
        Type t = this.getField(29, rep);
        ret = (CWE)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Contact Reason (NK1-29).
   */
  public CWE[] getContactReason() {
     CWE[] ret = null;
    try {
        Type[] t = this.getField(29);  
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
   * Returns a count of the number of repetitions of Contact Reason (NK1-29).
   */
  public int getContactReasonReps() {
    try {
        return this.getField(29).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Contact Reason (NK1-29) at a given index and returns it.
   * @param index The index
   */
  public CWE insertContactReason(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(29, index);
  }

  /**
   * Removes a repetition of Contact Reason (NK1-29) at a given index and returns it.
   * @param index The index
   */
  public CWE removeContactReason(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(29, index);
  }

  /**
   * Returns a single repetition of Contact Reason (NK1-29).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getNk129_ContactReason(int rep) throws HL7Exception {
    CWE ret = null;
    try {
        Type t = this.getField(29, rep);
        ret = (CWE)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Contact Reason (NK1-29).
   */
  public CWE[] getNk129_ContactReason() {
     CWE[] ret = null;
    try {
        Type[] t = this.getField(29);  
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
   * Returns a count of the number of repetitions of Contact Reason (NK1-29).
   */
  public int getNk129_ContactReasonReps() {
    try {
        return this.getField(29).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Contact Reason (NK1-29) at a given index and returns it.
   * @param index The index
   */
  public CWE insertNk129_ContactReason(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(29, index);
  }

  /**
   * Removes a repetition of Contact Reason (NK1-29) at a given index and returns it.
   * @param index The index
   */
  public CWE removeNk129_ContactReason(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(29, index);
  }

  /**
   * Returns a single repetition of Contact Person's Name (NK1-30).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XPN getContactPersonSName(int rep) throws HL7Exception {
    XPN ret = null;
    try {
        Type t = this.getField(30, rep);
        ret = (XPN)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Contact Person's Name (NK1-30).
   */
  public XPN[] getContactPersonSName() {
     XPN[] ret = null;
    try {
        Type[] t = this.getField(30);  
        ret = new XPN[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (XPN)t[i];
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
   * Returns a count of the number of repetitions of Contact Person's Name (NK1-30).
   */
  public int getContactPersonSNameReps() {
    try {
        return this.getField(30).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Contact Person's Name (NK1-30) at a given index and returns it.
   * @param index The index
   */
  public XPN insertContactPersonSName(int index) throws HL7Exception {
     return (XPN) super.insertRepetition(30, index);
  }

  /**
   * Removes a repetition of Contact Person's Name (NK1-30) at a given index and returns it.
   * @param index The index
   */
  public XPN removeContactPersonSName(int index) throws HL7Exception {
     return (XPN) super.removeRepetition(30, index);
  }

  /**
   * Returns a single repetition of Contact Person's Name (NK1-30).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XPN getNk130_ContactPersonSName(int rep) throws HL7Exception {
    XPN ret = null;
    try {
        Type t = this.getField(30, rep);
        ret = (XPN)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Contact Person's Name (NK1-30).
   */
  public XPN[] getNk130_ContactPersonSName() {
     XPN[] ret = null;
    try {
        Type[] t = this.getField(30);  
        ret = new XPN[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (XPN)t[i];
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
   * Returns a count of the number of repetitions of Contact Person's Name (NK1-30).
   */
  public int getNk130_ContactPersonSNameReps() {
    try {
        return this.getField(30).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Contact Person's Name (NK1-30) at a given index and returns it.
   * @param index The index
   */
  public XPN insertNk130_ContactPersonSName(int index) throws HL7Exception {
     return (XPN) super.insertRepetition(30, index);
  }

  /**
   * Removes a repetition of Contact Person's Name (NK1-30) at a given index and returns it.
   * @param index The index
   */
  public XPN removeNk130_ContactPersonSName(int index) throws HL7Exception {
     return (XPN) super.removeRepetition(30, index);
  }

  /**
   * Returns a single repetition of Contact Person's Telephone Number (NK1-31).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XTN getContactPersonSTelephoneNumber(int rep) throws HL7Exception {
    XTN ret = null;
    try {
        Type t = this.getField(31, rep);
        ret = (XTN)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Contact Person's Telephone Number (NK1-31).
   */
  public XTN[] getContactPersonSTelephoneNumber() {
     XTN[] ret = null;
    try {
        Type[] t = this.getField(31);  
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
   * Returns a count of the number of repetitions of Contact Person's Telephone Number (NK1-31).
   */
  public int getContactPersonSTelephoneNumberReps() {
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
   * Inserts a repetition of Contact Person's Telephone Number (NK1-31) at a given index and returns it.
   * @param index The index
   */
  public XTN insertContactPersonSTelephoneNumber(int index) throws HL7Exception {
     return (XTN) super.insertRepetition(31, index);
  }

  /**
   * Removes a repetition of Contact Person's Telephone Number (NK1-31) at a given index and returns it.
   * @param index The index
   */
  public XTN removeContactPersonSTelephoneNumber(int index) throws HL7Exception {
     return (XTN) super.removeRepetition(31, index);
  }

  /**
   * Returns a single repetition of Contact Person's Telephone Number (NK1-31).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XTN getNk131_ContactPersonSTelephoneNumber(int rep) throws HL7Exception {
    XTN ret = null;
    try {
        Type t = this.getField(31, rep);
        ret = (XTN)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Contact Person's Telephone Number (NK1-31).
   */
  public XTN[] getNk131_ContactPersonSTelephoneNumber() {
     XTN[] ret = null;
    try {
        Type[] t = this.getField(31);  
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
   * Returns a count of the number of repetitions of Contact Person's Telephone Number (NK1-31).
   */
  public int getNk131_ContactPersonSTelephoneNumberReps() {
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
   * Inserts a repetition of Contact Person's Telephone Number (NK1-31) at a given index and returns it.
   * @param index The index
   */
  public XTN insertNk131_ContactPersonSTelephoneNumber(int index) throws HL7Exception {
     return (XTN) super.insertRepetition(31, index);
  }

  /**
   * Removes a repetition of Contact Person's Telephone Number (NK1-31) at a given index and returns it.
   * @param index The index
   */
  public XTN removeNk131_ContactPersonSTelephoneNumber(int index) throws HL7Exception {
     return (XTN) super.removeRepetition(31, index);
  }

  /**
   * Returns a single repetition of Contact Person's Address (NK1-32).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XAD getContactPersonSAddress(int rep) throws HL7Exception {
    XAD ret = null;
    try {
        Type t = this.getField(32, rep);
        ret = (XAD)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Contact Person's Address (NK1-32).
   */
  public XAD[] getContactPersonSAddress() {
     XAD[] ret = null;
    try {
        Type[] t = this.getField(32);  
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
   * Returns a count of the number of repetitions of Contact Person's Address (NK1-32).
   */
  public int getContactPersonSAddressReps() {
    try {
        return this.getField(32).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Contact Person's Address (NK1-32) at a given index and returns it.
   * @param index The index
   */
  public XAD insertContactPersonSAddress(int index) throws HL7Exception {
     return (XAD) super.insertRepetition(32, index);
  }

  /**
   * Removes a repetition of Contact Person's Address (NK1-32) at a given index and returns it.
   * @param index The index
   */
  public XAD removeContactPersonSAddress(int index) throws HL7Exception {
     return (XAD) super.removeRepetition(32, index);
  }

  /**
   * Returns a single repetition of Contact Person's Address (NK1-32).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XAD getNk132_ContactPersonSAddress(int rep) throws HL7Exception {
    XAD ret = null;
    try {
        Type t = this.getField(32, rep);
        ret = (XAD)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Contact Person's Address (NK1-32).
   */
  public XAD[] getNk132_ContactPersonSAddress() {
     XAD[] ret = null;
    try {
        Type[] t = this.getField(32);  
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
   * Returns a count of the number of repetitions of Contact Person's Address (NK1-32).
   */
  public int getNk132_ContactPersonSAddressReps() {
    try {
        return this.getField(32).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Contact Person's Address (NK1-32) at a given index and returns it.
   * @param index The index
   */
  public XAD insertNk132_ContactPersonSAddress(int index) throws HL7Exception {
     return (XAD) super.insertRepetition(32, index);
  }

  /**
   * Removes a repetition of Contact Person's Address (NK1-32) at a given index and returns it.
   * @param index The index
   */
  public XAD removeNk132_ContactPersonSAddress(int index) throws HL7Exception {
     return (XAD) super.removeRepetition(32, index);
  }

  /**
   * Returns a single repetition of Next of Kin/Associated Party's Identifiers (NK1-33).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CX getNextOfKinAssociatedPartySIdentifiers(int rep) throws HL7Exception {
    CX ret = null;
    try {
        Type t = this.getField(33, rep);
        ret = (CX)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Next of Kin/Associated Party's Identifiers (NK1-33).
   */
  public CX[] getNextOfKinAssociatedPartySIdentifiers() {
     CX[] ret = null;
    try {
        Type[] t = this.getField(33);  
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
   * Returns a count of the number of repetitions of Next of Kin/Associated Party's Identifiers (NK1-33).
   */
  public int getNextOfKinAssociatedPartySIdentifiersReps() {
    try {
        return this.getField(33).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Next of Kin/Associated Party's Identifiers (NK1-33) at a given index and returns it.
   * @param index The index
   */
  public CX insertNextOfKinAssociatedPartySIdentifiers(int index) throws HL7Exception {
     return (CX) super.insertRepetition(33, index);
  }

  /**
   * Removes a repetition of Next of Kin/Associated Party's Identifiers (NK1-33) at a given index and returns it.
   * @param index The index
   */
  public CX removeNextOfKinAssociatedPartySIdentifiers(int index) throws HL7Exception {
     return (CX) super.removeRepetition(33, index);
  }

  /**
   * Returns a single repetition of Next of Kin/Associated Party's Identifiers (NK1-33).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CX getNk133_NextOfKinAssociatedPartySIdentifiers(int rep) throws HL7Exception {
    CX ret = null;
    try {
        Type t = this.getField(33, rep);
        ret = (CX)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Next of Kin/Associated Party's Identifiers (NK1-33).
   */
  public CX[] getNk133_NextOfKinAssociatedPartySIdentifiers() {
     CX[] ret = null;
    try {
        Type[] t = this.getField(33);  
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
   * Returns a count of the number of repetitions of Next of Kin/Associated Party's Identifiers (NK1-33).
   */
  public int getNk133_NextOfKinAssociatedPartySIdentifiersReps() {
    try {
        return this.getField(33).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Next of Kin/Associated Party's Identifiers (NK1-33) at a given index and returns it.
   * @param index The index
   */
  public CX insertNk133_NextOfKinAssociatedPartySIdentifiers(int index) throws HL7Exception {
     return (CX) super.insertRepetition(33, index);
  }

  /**
   * Removes a repetition of Next of Kin/Associated Party's Identifiers (NK1-33) at a given index and returns it.
   * @param index The index
   */
  public CX removeNk133_NextOfKinAssociatedPartySIdentifiers(int index) throws HL7Exception {
     return (CX) super.removeRepetition(33, index);
  }

  /**
   * Returns Job Status (NK1-34).
   */
  public IS getJobStatus()  {
    IS ret = null;
    try {
        Type t = this.getField(34, 0);
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
   * Returns Job Status (NK1-34).
   */
  public IS getNk134_JobStatus()  {
    IS ret = null;
    try {
        Type t = this.getField(34, 0);
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
   * Returns a single repetition of Race (NK1-35).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getRace(int rep) throws HL7Exception {
    CWE ret = null;
    try {
        Type t = this.getField(35, rep);
        ret = (CWE)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Race (NK1-35).
   */
  public CWE[] getRace() {
     CWE[] ret = null;
    try {
        Type[] t = this.getField(35);  
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
   * Returns a count of the number of repetitions of Race (NK1-35).
   */
  public int getRaceReps() {
    try {
        return this.getField(35).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Race (NK1-35) at a given index and returns it.
   * @param index The index
   */
  public CWE insertRace(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(35, index);
  }

  /**
   * Removes a repetition of Race (NK1-35) at a given index and returns it.
   * @param index The index
   */
  public CWE removeRace(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(35, index);
  }

  /**
   * Returns a single repetition of Race (NK1-35).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getNk135_Race(int rep) throws HL7Exception {
    CWE ret = null;
    try {
        Type t = this.getField(35, rep);
        ret = (CWE)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Race (NK1-35).
   */
  public CWE[] getNk135_Race() {
     CWE[] ret = null;
    try {
        Type[] t = this.getField(35);  
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
   * Returns a count of the number of repetitions of Race (NK1-35).
   */
  public int getNk135_RaceReps() {
    try {
        return this.getField(35).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Race (NK1-35) at a given index and returns it.
   * @param index The index
   */
  public CWE insertNk135_Race(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(35, index);
  }

  /**
   * Removes a repetition of Race (NK1-35) at a given index and returns it.
   * @param index The index
   */
  public CWE removeNk135_Race(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(35, index);
  }

  /**
   * Returns Handicap (NK1-36).
   */
  public IS getHandicap()  {
    IS ret = null;
    try {
        Type t = this.getField(36, 0);
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
   * Returns Handicap (NK1-36).
   */
  public IS getNk136_Handicap()  {
    IS ret = null;
    try {
        Type t = this.getField(36, 0);
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
   * Returns Contact Person Social Security Number (NK1-37).
   */
  public ST getContactPersonSocialSecurityNumber()  {
    ST ret = null;
    try {
        Type t = this.getField(37, 0);
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
   * Returns Contact Person Social Security Number (NK1-37).
   */
  public ST getNk137_ContactPersonSocialSecurityNumber()  {
    ST ret = null;
    try {
        Type t = this.getField(37, 0);
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
   * Returns Next of Kin Birth Place (NK1-38).
   */
  public ST getNextOfKinBirthPlace()  {
    ST ret = null;
    try {
        Type t = this.getField(38, 0);
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
   * Returns Next of Kin Birth Place (NK1-38).
   */
  public ST getNk138_NextOfKinBirthPlace()  {
    ST ret = null;
    try {
        Type t = this.getField(38, 0);
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
   * Returns VIP Indicator (NK1-39).
   */
  public IS getVIPIndicator()  {
    IS ret = null;
    try {
        Type t = this.getField(39, 0);
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
   * Returns VIP Indicator (NK1-39).
   */
  public IS getNk139_VIPIndicator()  {
    IS ret = null;
    try {
        Type t = this.getField(39, 0);
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
         case 0: return new ca.uhn.hl7v2.model.v26.datatype.SI(getMessage());
         case 1: return new ca.uhn.hl7v2.model.v26.datatype.XPN(getMessage());
         case 2: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 3: return new ca.uhn.hl7v2.model.v26.datatype.XAD(getMessage());
         case 4: return new ca.uhn.hl7v2.model.v26.datatype.XTN(getMessage());
         case 5: return new ca.uhn.hl7v2.model.v26.datatype.XTN(getMessage());
         case 6: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 7: return new ca.uhn.hl7v2.model.v26.datatype.DT(getMessage());
         case 8: return new ca.uhn.hl7v2.model.v26.datatype.DT(getMessage());
         case 9: return new ca.uhn.hl7v2.model.v26.datatype.ST(getMessage());
         case 10: return new ca.uhn.hl7v2.model.v26.datatype.JCC(getMessage());
         case 11: return new ca.uhn.hl7v2.model.v26.datatype.CX(getMessage());
         case 12: return new ca.uhn.hl7v2.model.v26.datatype.XON(getMessage());
         case 13: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 14: return new ca.uhn.hl7v2.model.v26.datatype.IS(getMessage(), new Integer(1));
         case 15: return new ca.uhn.hl7v2.model.v26.datatype.DTM(getMessage());
         case 16: return new ca.uhn.hl7v2.model.v26.datatype.IS(getMessage(), new Integer(223));
         case 17: return new ca.uhn.hl7v2.model.v26.datatype.IS(getMessage(), new Integer(9));
         case 18: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 19: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 20: return new ca.uhn.hl7v2.model.v26.datatype.IS(getMessage(), new Integer(220));
         case 21: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 22: return new ca.uhn.hl7v2.model.v26.datatype.ID(getMessage(), new Integer(136));
         case 23: return new ca.uhn.hl7v2.model.v26.datatype.IS(getMessage(), new Integer(231));
         case 24: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 25: return new ca.uhn.hl7v2.model.v26.datatype.XPN(getMessage());
         case 26: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 27: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 28: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 29: return new ca.uhn.hl7v2.model.v26.datatype.XPN(getMessage());
         case 30: return new ca.uhn.hl7v2.model.v26.datatype.XTN(getMessage());
         case 31: return new ca.uhn.hl7v2.model.v26.datatype.XAD(getMessage());
         case 32: return new ca.uhn.hl7v2.model.v26.datatype.CX(getMessage());
         case 33: return new ca.uhn.hl7v2.model.v26.datatype.IS(getMessage(), new Integer(311));
         case 34: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 35: return new ca.uhn.hl7v2.model.v26.datatype.IS(getMessage(), new Integer(295));
         case 36: return new ca.uhn.hl7v2.model.v26.datatype.ST(getMessage());
         case 37: return new ca.uhn.hl7v2.model.v26.datatype.ST(getMessage());
         case 38: return new ca.uhn.hl7v2.model.v26.datatype.IS(getMessage(), new Integer(99));
         default: return null;
      }
   }

}