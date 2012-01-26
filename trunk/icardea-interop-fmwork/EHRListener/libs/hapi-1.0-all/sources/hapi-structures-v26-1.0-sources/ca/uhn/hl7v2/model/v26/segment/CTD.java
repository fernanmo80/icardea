package ca.uhn.hl7v2.model.v26.segment;

import ca.uhn.hl7v2.model.*;
import ca.uhn.hl7v2.model.v26.datatype.*;
import ca.uhn.log.HapiLogFactory;
import ca.uhn.hl7v2.parser.ModelClassFactory;
import ca.uhn.hl7v2.HL7Exception;

/**
 * <p>Represents an HL7 CTD message segment. 
 * This segment has the following fields:</p><p>
 * CTD-1: Contact Role (CWE)<br> 
 * CTD-2: Contact Name (XPN)<br> 
 * CTD-3: Contact Address (XAD)<br> 
 * CTD-4: Contact Location (PL)<br> 
 * CTD-5: Contact Communication Information (XTN)<br> 
 * CTD-6: Preferred Method of Contact (CWE)<br> 
 * CTD-7: Contact Identifiers (PLN)<br> 
 * </p><p>The get...() methods return data from individual fields.  These methods 
 * do not throw exceptions and may therefore have to handle exceptions internally.  
 * If an exception is handled internally, it is logged and null is returned.  
 * This is not expected to happen - if it does happen this indicates not so much 
 * an exceptional circumstance as a bug in the code for this class.</p>    
 */
public class CTD extends AbstractSegment  {

  /**
   * Creates a CTD (Contact Data) segment object that belongs to the given 
   * message.  
   */
  public CTD(Group parent, ModelClassFactory factory) {
    super(parent, factory);
    Message message = getMessage();
    try {
       this.add(CWE.class, true, 0, 705, new Object[]{message}, "Contact Role");
       this.add(XPN.class, false, 0, 250, new Object[]{message}, "Contact Name");
       this.add(XAD.class, false, 0, 2915, new Object[]{message}, "Contact Address");
       this.add(PL.class, false, 1, 60, new Object[]{message}, "Contact Location");
       this.add(XTN.class, false, 0, 250, new Object[]{message}, "Contact Communication Information");
       this.add(CWE.class, false, 1, 705, new Object[]{message}, "Preferred Method of Contact");
       this.add(PLN.class, false, 0, 100, new Object[]{message}, "Contact Identifiers");
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Can't instantiate " + this.getClass().getName(), he);
    }
  }

  /**
   * Returns a single repetition of Contact Role (CTD-1).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getContactRole(int rep) throws HL7Exception {
    CWE ret = null;
    try {
        Type t = this.getField(1, rep);
        ret = (CWE)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Contact Role (CTD-1).
   */
  public CWE[] getContactRole() {
     CWE[] ret = null;
    try {
        Type[] t = this.getField(1);  
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
   * Returns a count of the number of repetitions of Contact Role (CTD-1).
   */
  public int getContactRoleReps() {
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
   * Inserts a repetition of Contact Role (CTD-1) at a given index and returns it.
   * @param index The index
   */
  public CWE insertContactRole(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(1, index);
  }

  /**
   * Removes a repetition of Contact Role (CTD-1) at a given index and returns it.
   * @param index The index
   */
  public CWE removeContactRole(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(1, index);
  }

  /**
   * Returns a single repetition of Contact Role (CTD-1).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getCtd1_ContactRole(int rep) throws HL7Exception {
    CWE ret = null;
    try {
        Type t = this.getField(1, rep);
        ret = (CWE)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Contact Role (CTD-1).
   */
  public CWE[] getCtd1_ContactRole() {
     CWE[] ret = null;
    try {
        Type[] t = this.getField(1);  
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
   * Returns a count of the number of repetitions of Contact Role (CTD-1).
   */
  public int getCtd1_ContactRoleReps() {
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
   * Inserts a repetition of Contact Role (CTD-1) at a given index and returns it.
   * @param index The index
   */
  public CWE insertCtd1_ContactRole(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(1, index);
  }

  /**
   * Removes a repetition of Contact Role (CTD-1) at a given index and returns it.
   * @param index The index
   */
  public CWE removeCtd1_ContactRole(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(1, index);
  }

  /**
   * Returns a single repetition of Contact Name (CTD-2).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XPN getContactName(int rep) throws HL7Exception {
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
   * Returns all repetitions of Contact Name (CTD-2).
   */
  public XPN[] getContactName() {
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
   * Returns a count of the number of repetitions of Contact Name (CTD-2).
   */
  public int getContactNameReps() {
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
   * Inserts a repetition of Contact Name (CTD-2) at a given index and returns it.
   * @param index The index
   */
  public XPN insertContactName(int index) throws HL7Exception {
     return (XPN) super.insertRepetition(2, index);
  }

  /**
   * Removes a repetition of Contact Name (CTD-2) at a given index and returns it.
   * @param index The index
   */
  public XPN removeContactName(int index) throws HL7Exception {
     return (XPN) super.removeRepetition(2, index);
  }

  /**
   * Returns a single repetition of Contact Name (CTD-2).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XPN getCtd2_ContactName(int rep) throws HL7Exception {
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
   * Returns all repetitions of Contact Name (CTD-2).
   */
  public XPN[] getCtd2_ContactName() {
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
   * Returns a count of the number of repetitions of Contact Name (CTD-2).
   */
  public int getCtd2_ContactNameReps() {
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
   * Inserts a repetition of Contact Name (CTD-2) at a given index and returns it.
   * @param index The index
   */
  public XPN insertCtd2_ContactName(int index) throws HL7Exception {
     return (XPN) super.insertRepetition(2, index);
  }

  /**
   * Removes a repetition of Contact Name (CTD-2) at a given index and returns it.
   * @param index The index
   */
  public XPN removeCtd2_ContactName(int index) throws HL7Exception {
     return (XPN) super.removeRepetition(2, index);
  }

  /**
   * Returns a single repetition of Contact Address (CTD-3).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XAD getContactAddress(int rep) throws HL7Exception {
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
   * Returns all repetitions of Contact Address (CTD-3).
   */
  public XAD[] getContactAddress() {
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
   * Returns a count of the number of repetitions of Contact Address (CTD-3).
   */
  public int getContactAddressReps() {
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
   * Inserts a repetition of Contact Address (CTD-3) at a given index and returns it.
   * @param index The index
   */
  public XAD insertContactAddress(int index) throws HL7Exception {
     return (XAD) super.insertRepetition(3, index);
  }

  /**
   * Removes a repetition of Contact Address (CTD-3) at a given index and returns it.
   * @param index The index
   */
  public XAD removeContactAddress(int index) throws HL7Exception {
     return (XAD) super.removeRepetition(3, index);
  }

  /**
   * Returns a single repetition of Contact Address (CTD-3).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XAD getCtd3_ContactAddress(int rep) throws HL7Exception {
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
   * Returns all repetitions of Contact Address (CTD-3).
   */
  public XAD[] getCtd3_ContactAddress() {
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
   * Returns a count of the number of repetitions of Contact Address (CTD-3).
   */
  public int getCtd3_ContactAddressReps() {
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
   * Inserts a repetition of Contact Address (CTD-3) at a given index and returns it.
   * @param index The index
   */
  public XAD insertCtd3_ContactAddress(int index) throws HL7Exception {
     return (XAD) super.insertRepetition(3, index);
  }

  /**
   * Removes a repetition of Contact Address (CTD-3) at a given index and returns it.
   * @param index The index
   */
  public XAD removeCtd3_ContactAddress(int index) throws HL7Exception {
     return (XAD) super.removeRepetition(3, index);
  }

  /**
   * Returns Contact Location (CTD-4).
   */
  public PL getContactLocation()  {
    PL ret = null;
    try {
        Type t = this.getField(4, 0);
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
   * Returns Contact Location (CTD-4).
   */
  public PL getCtd4_ContactLocation()  {
    PL ret = null;
    try {
        Type t = this.getField(4, 0);
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
   * Returns a single repetition of Contact Communication Information (CTD-5).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XTN getContactCommunicationInformation(int rep) throws HL7Exception {
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
   * Returns all repetitions of Contact Communication Information (CTD-5).
   */
  public XTN[] getContactCommunicationInformation() {
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
   * Returns a count of the number of repetitions of Contact Communication Information (CTD-5).
   */
  public int getContactCommunicationInformationReps() {
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
   * Inserts a repetition of Contact Communication Information (CTD-5) at a given index and returns it.
   * @param index The index
   */
  public XTN insertContactCommunicationInformation(int index) throws HL7Exception {
     return (XTN) super.insertRepetition(5, index);
  }

  /**
   * Removes a repetition of Contact Communication Information (CTD-5) at a given index and returns it.
   * @param index The index
   */
  public XTN removeContactCommunicationInformation(int index) throws HL7Exception {
     return (XTN) super.removeRepetition(5, index);
  }

  /**
   * Returns a single repetition of Contact Communication Information (CTD-5).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XTN getCtd5_ContactCommunicationInformation(int rep) throws HL7Exception {
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
   * Returns all repetitions of Contact Communication Information (CTD-5).
   */
  public XTN[] getCtd5_ContactCommunicationInformation() {
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
   * Returns a count of the number of repetitions of Contact Communication Information (CTD-5).
   */
  public int getCtd5_ContactCommunicationInformationReps() {
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
   * Inserts a repetition of Contact Communication Information (CTD-5) at a given index and returns it.
   * @param index The index
   */
  public XTN insertCtd5_ContactCommunicationInformation(int index) throws HL7Exception {
     return (XTN) super.insertRepetition(5, index);
  }

  /**
   * Removes a repetition of Contact Communication Information (CTD-5) at a given index and returns it.
   * @param index The index
   */
  public XTN removeCtd5_ContactCommunicationInformation(int index) throws HL7Exception {
     return (XTN) super.removeRepetition(5, index);
  }

  /**
   * Returns Preferred Method of Contact (CTD-6).
   */
  public CWE getPreferredMethodOfContact()  {
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
   * Returns Preferred Method of Contact (CTD-6).
   */
  public CWE getCtd6_PreferredMethodOfContact()  {
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
   * Returns a single repetition of Contact Identifiers (CTD-7).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public PLN getContactIdentifiers(int rep) throws HL7Exception {
    PLN ret = null;
    try {
        Type t = this.getField(7, rep);
        ret = (PLN)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Contact Identifiers (CTD-7).
   */
  public PLN[] getContactIdentifiers() {
     PLN[] ret = null;
    try {
        Type[] t = this.getField(7);  
        ret = new PLN[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (PLN)t[i];
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
   * Returns a count of the number of repetitions of Contact Identifiers (CTD-7).
   */
  public int getContactIdentifiersReps() {
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
   * Inserts a repetition of Contact Identifiers (CTD-7) at a given index and returns it.
   * @param index The index
   */
  public PLN insertContactIdentifiers(int index) throws HL7Exception {
     return (PLN) super.insertRepetition(7, index);
  }

  /**
   * Removes a repetition of Contact Identifiers (CTD-7) at a given index and returns it.
   * @param index The index
   */
  public PLN removeContactIdentifiers(int index) throws HL7Exception {
     return (PLN) super.removeRepetition(7, index);
  }

  /**
   * Returns a single repetition of Contact Identifiers (CTD-7).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public PLN getCtd7_ContactIdentifiers(int rep) throws HL7Exception {
    PLN ret = null;
    try {
        Type t = this.getField(7, rep);
        ret = (PLN)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Contact Identifiers (CTD-7).
   */
  public PLN[] getCtd7_ContactIdentifiers() {
     PLN[] ret = null;
    try {
        Type[] t = this.getField(7);  
        ret = new PLN[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (PLN)t[i];
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
   * Returns a count of the number of repetitions of Contact Identifiers (CTD-7).
   */
  public int getCtd7_ContactIdentifiersReps() {
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
   * Inserts a repetition of Contact Identifiers (CTD-7) at a given index and returns it.
   * @param index The index
   */
  public PLN insertCtd7_ContactIdentifiers(int index) throws HL7Exception {
     return (PLN) super.insertRepetition(7, index);
  }

  /**
   * Removes a repetition of Contact Identifiers (CTD-7) at a given index and returns it.
   * @param index The index
   */
  public PLN removeCtd7_ContactIdentifiers(int index) throws HL7Exception {
     return (PLN) super.removeRepetition(7, index);
  }

   protected Type createNewTypeWithoutReflection(int field) {
      switch (field) {
         case 0: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 1: return new ca.uhn.hl7v2.model.v26.datatype.XPN(getMessage());
         case 2: return new ca.uhn.hl7v2.model.v26.datatype.XAD(getMessage());
         case 3: return new ca.uhn.hl7v2.model.v26.datatype.PL(getMessage());
         case 4: return new ca.uhn.hl7v2.model.v26.datatype.XTN(getMessage());
         case 5: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 6: return new ca.uhn.hl7v2.model.v26.datatype.PLN(getMessage());
         default: return null;
      }
   }

}