package ca.uhn.hl7v2.model.v26.segment;

import ca.uhn.hl7v2.model.*;
import ca.uhn.hl7v2.model.v26.datatype.*;
import ca.uhn.log.HapiLogFactory;
import ca.uhn.hl7v2.parser.ModelClassFactory;
import ca.uhn.hl7v2.HL7Exception;

/**
 * <p>Represents an HL7 PRD message segment. 
 * This segment has the following fields:</p><p>
 * PRD-1: Provider Role (CWE)<br> 
 * PRD-2: Provider Name (XPN)<br> 
 * PRD-3: Provider Address (XAD)<br> 
 * PRD-4: Provider Location (PL)<br> 
 * PRD-5: Provider Communication Information (XTN)<br> 
 * PRD-6: Preferred Method of Contact (CWE)<br> 
 * PRD-7: Provider Identifiers (PLN)<br> 
 * PRD-8: Effective Start Date of Provider Role (DTM)<br> 
 * PRD-9: Effective End Date of Provider Role (DTM)<br> 
 * PRD-10: Provider Organization Name and Identifier (XON)<br> 
 * PRD-11: Provider Organization Address (XAD)<br> 
 * PRD-12: Provider Organization Location Information (PL)<br> 
 * PRD-13: Provider Organization Communication Information (XTN)<br> 
 * PRD-14: Provider Organization Method of Contact (CWE)<br> 
 * </p><p>The get...() methods return data from individual fields.  These methods 
 * do not throw exceptions and may therefore have to handle exceptions internally.  
 * If an exception is handled internally, it is logged and null is returned.  
 * This is not expected to happen - if it does happen this indicates not so much 
 * an exceptional circumstance as a bug in the code for this class.</p>    
 */
public class PRD extends AbstractSegment  {

  /**
   * Creates a PRD (Provider Data) segment object that belongs to the given 
   * message.  
   */
  public PRD(Group parent, ModelClassFactory factory) {
    super(parent, factory);
    Message message = getMessage();
    try {
       this.add(CWE.class, true, 0, 705, new Object[]{message}, "Provider Role");
       this.add(XPN.class, false, 0, 250, new Object[]{message}, "Provider Name");
       this.add(XAD.class, false, 0, 250, new Object[]{message}, "Provider Address");
       this.add(PL.class, false, 1, 60, new Object[]{message}, "Provider Location");
       this.add(XTN.class, false, 0, 250, new Object[]{message}, "Provider Communication Information");
       this.add(CWE.class, false, 1, 705, new Object[]{message}, "Preferred Method of Contact");
       this.add(PLN.class, false, 0, 100, new Object[]{message}, "Provider Identifiers");
       this.add(DTM.class, false, 1, 24, new Object[]{message}, "Effective Start Date of Provider Role");
       this.add(DTM.class, false, 0, 24, new Object[]{message}, "Effective End Date of Provider Role");
       this.add(XON.class, false, 1, 250, new Object[]{message}, "Provider Organization Name and Identifier");
       this.add(XAD.class, false, 0, 60, new Object[]{message}, "Provider Organization Address");
       this.add(PL.class, false, 0, 60, new Object[]{message}, "Provider Organization Location Information");
       this.add(XTN.class, false, 0, 250, new Object[]{message}, "Provider Organization Communication Information");
       this.add(CWE.class, false, 1, 705, new Object[]{message}, "Provider Organization Method of Contact");
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Can't instantiate " + this.getClass().getName(), he);
    }
  }

  /**
   * Returns a single repetition of Provider Role (PRD-1).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getProviderRole(int rep) throws HL7Exception {
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
   * Returns all repetitions of Provider Role (PRD-1).
   */
  public CWE[] getProviderRole() {
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
   * Returns a count of the number of repetitions of Provider Role (PRD-1).
   */
  public int getProviderRoleReps() {
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
   * Inserts a repetition of Provider Role (PRD-1) at a given index and returns it.
   * @param index The index
   */
  public CWE insertProviderRole(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(1, index);
  }

  /**
   * Removes a repetition of Provider Role (PRD-1) at a given index and returns it.
   * @param index The index
   */
  public CWE removeProviderRole(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(1, index);
  }

  /**
   * Returns a single repetition of Provider Role (PRD-1).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getPrd1_ProviderRole(int rep) throws HL7Exception {
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
   * Returns all repetitions of Provider Role (PRD-1).
   */
  public CWE[] getPrd1_ProviderRole() {
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
   * Returns a count of the number of repetitions of Provider Role (PRD-1).
   */
  public int getPrd1_ProviderRoleReps() {
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
   * Inserts a repetition of Provider Role (PRD-1) at a given index and returns it.
   * @param index The index
   */
  public CWE insertPrd1_ProviderRole(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(1, index);
  }

  /**
   * Removes a repetition of Provider Role (PRD-1) at a given index and returns it.
   * @param index The index
   */
  public CWE removePrd1_ProviderRole(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(1, index);
  }

  /**
   * Returns a single repetition of Provider Name (PRD-2).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XPN getProviderName(int rep) throws HL7Exception {
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
   * Returns all repetitions of Provider Name (PRD-2).
   */
  public XPN[] getProviderName() {
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
   * Returns a count of the number of repetitions of Provider Name (PRD-2).
   */
  public int getProviderNameReps() {
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
   * Inserts a repetition of Provider Name (PRD-2) at a given index and returns it.
   * @param index The index
   */
  public XPN insertProviderName(int index) throws HL7Exception {
     return (XPN) super.insertRepetition(2, index);
  }

  /**
   * Removes a repetition of Provider Name (PRD-2) at a given index and returns it.
   * @param index The index
   */
  public XPN removeProviderName(int index) throws HL7Exception {
     return (XPN) super.removeRepetition(2, index);
  }

  /**
   * Returns a single repetition of Provider Name (PRD-2).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XPN getPrd2_ProviderName(int rep) throws HL7Exception {
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
   * Returns all repetitions of Provider Name (PRD-2).
   */
  public XPN[] getPrd2_ProviderName() {
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
   * Returns a count of the number of repetitions of Provider Name (PRD-2).
   */
  public int getPrd2_ProviderNameReps() {
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
   * Inserts a repetition of Provider Name (PRD-2) at a given index and returns it.
   * @param index The index
   */
  public XPN insertPrd2_ProviderName(int index) throws HL7Exception {
     return (XPN) super.insertRepetition(2, index);
  }

  /**
   * Removes a repetition of Provider Name (PRD-2) at a given index and returns it.
   * @param index The index
   */
  public XPN removePrd2_ProviderName(int index) throws HL7Exception {
     return (XPN) super.removeRepetition(2, index);
  }

  /**
   * Returns a single repetition of Provider Address (PRD-3).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XAD getProviderAddress(int rep) throws HL7Exception {
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
   * Returns all repetitions of Provider Address (PRD-3).
   */
  public XAD[] getProviderAddress() {
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
   * Returns a count of the number of repetitions of Provider Address (PRD-3).
   */
  public int getProviderAddressReps() {
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
   * Inserts a repetition of Provider Address (PRD-3) at a given index and returns it.
   * @param index The index
   */
  public XAD insertProviderAddress(int index) throws HL7Exception {
     return (XAD) super.insertRepetition(3, index);
  }

  /**
   * Removes a repetition of Provider Address (PRD-3) at a given index and returns it.
   * @param index The index
   */
  public XAD removeProviderAddress(int index) throws HL7Exception {
     return (XAD) super.removeRepetition(3, index);
  }

  /**
   * Returns a single repetition of Provider Address (PRD-3).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XAD getPrd3_ProviderAddress(int rep) throws HL7Exception {
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
   * Returns all repetitions of Provider Address (PRD-3).
   */
  public XAD[] getPrd3_ProviderAddress() {
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
   * Returns a count of the number of repetitions of Provider Address (PRD-3).
   */
  public int getPrd3_ProviderAddressReps() {
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
   * Inserts a repetition of Provider Address (PRD-3) at a given index and returns it.
   * @param index The index
   */
  public XAD insertPrd3_ProviderAddress(int index) throws HL7Exception {
     return (XAD) super.insertRepetition(3, index);
  }

  /**
   * Removes a repetition of Provider Address (PRD-3) at a given index and returns it.
   * @param index The index
   */
  public XAD removePrd3_ProviderAddress(int index) throws HL7Exception {
     return (XAD) super.removeRepetition(3, index);
  }

  /**
   * Returns Provider Location (PRD-4).
   */
  public PL getProviderLocation()  {
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
   * Returns Provider Location (PRD-4).
   */
  public PL getPrd4_ProviderLocation()  {
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
   * Returns a single repetition of Provider Communication Information (PRD-5).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XTN getProviderCommunicationInformation(int rep) throws HL7Exception {
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
   * Returns all repetitions of Provider Communication Information (PRD-5).
   */
  public XTN[] getProviderCommunicationInformation() {
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
   * Returns a count of the number of repetitions of Provider Communication Information (PRD-5).
   */
  public int getProviderCommunicationInformationReps() {
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
   * Inserts a repetition of Provider Communication Information (PRD-5) at a given index and returns it.
   * @param index The index
   */
  public XTN insertProviderCommunicationInformation(int index) throws HL7Exception {
     return (XTN) super.insertRepetition(5, index);
  }

  /**
   * Removes a repetition of Provider Communication Information (PRD-5) at a given index and returns it.
   * @param index The index
   */
  public XTN removeProviderCommunicationInformation(int index) throws HL7Exception {
     return (XTN) super.removeRepetition(5, index);
  }

  /**
   * Returns a single repetition of Provider Communication Information (PRD-5).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XTN getPrd5_ProviderCommunicationInformation(int rep) throws HL7Exception {
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
   * Returns all repetitions of Provider Communication Information (PRD-5).
   */
  public XTN[] getPrd5_ProviderCommunicationInformation() {
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
   * Returns a count of the number of repetitions of Provider Communication Information (PRD-5).
   */
  public int getPrd5_ProviderCommunicationInformationReps() {
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
   * Inserts a repetition of Provider Communication Information (PRD-5) at a given index and returns it.
   * @param index The index
   */
  public XTN insertPrd5_ProviderCommunicationInformation(int index) throws HL7Exception {
     return (XTN) super.insertRepetition(5, index);
  }

  /**
   * Removes a repetition of Provider Communication Information (PRD-5) at a given index and returns it.
   * @param index The index
   */
  public XTN removePrd5_ProviderCommunicationInformation(int index) throws HL7Exception {
     return (XTN) super.removeRepetition(5, index);
  }

  /**
   * Returns Preferred Method of Contact (PRD-6).
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
   * Returns Preferred Method of Contact (PRD-6).
   */
  public CWE getPrd6_PreferredMethodOfContact()  {
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
   * Returns a single repetition of Provider Identifiers (PRD-7).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public PLN getProviderIdentifiers(int rep) throws HL7Exception {
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
   * Returns all repetitions of Provider Identifiers (PRD-7).
   */
  public PLN[] getProviderIdentifiers() {
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
   * Returns a count of the number of repetitions of Provider Identifiers (PRD-7).
   */
  public int getProviderIdentifiersReps() {
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
   * Inserts a repetition of Provider Identifiers (PRD-7) at a given index and returns it.
   * @param index The index
   */
  public PLN insertProviderIdentifiers(int index) throws HL7Exception {
     return (PLN) super.insertRepetition(7, index);
  }

  /**
   * Removes a repetition of Provider Identifiers (PRD-7) at a given index and returns it.
   * @param index The index
   */
  public PLN removeProviderIdentifiers(int index) throws HL7Exception {
     return (PLN) super.removeRepetition(7, index);
  }

  /**
   * Returns a single repetition of Provider Identifiers (PRD-7).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public PLN getPrd7_ProviderIdentifiers(int rep) throws HL7Exception {
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
   * Returns all repetitions of Provider Identifiers (PRD-7).
   */
  public PLN[] getPrd7_ProviderIdentifiers() {
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
   * Returns a count of the number of repetitions of Provider Identifiers (PRD-7).
   */
  public int getPrd7_ProviderIdentifiersReps() {
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
   * Inserts a repetition of Provider Identifiers (PRD-7) at a given index and returns it.
   * @param index The index
   */
  public PLN insertPrd7_ProviderIdentifiers(int index) throws HL7Exception {
     return (PLN) super.insertRepetition(7, index);
  }

  /**
   * Removes a repetition of Provider Identifiers (PRD-7) at a given index and returns it.
   * @param index The index
   */
  public PLN removePrd7_ProviderIdentifiers(int index) throws HL7Exception {
     return (PLN) super.removeRepetition(7, index);
  }

  /**
   * Returns Effective Start Date of Provider Role (PRD-8).
   */
  public DTM getEffectiveStartDateOfProviderRole()  {
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
   * Returns Effective Start Date of Provider Role (PRD-8).
   */
  public DTM getPrd8_EffectiveStartDateOfProviderRole()  {
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
   * Returns a single repetition of Effective End Date of Provider Role (PRD-9).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public DTM getEffectiveEndDateOfProviderRole(int rep) throws HL7Exception {
    DTM ret = null;
    try {
        Type t = this.getField(9, rep);
        ret = (DTM)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Effective End Date of Provider Role (PRD-9).
   */
  public DTM[] getEffectiveEndDateOfProviderRole() {
     DTM[] ret = null;
    try {
        Type[] t = this.getField(9);  
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
   * Returns a count of the number of repetitions of Effective End Date of Provider Role (PRD-9).
   */
  public int getEffectiveEndDateOfProviderRoleReps() {
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
   * Inserts a repetition of Effective End Date of Provider Role (PRD-9) at a given index and returns it.
   * @param index The index
   */
  public DTM insertEffectiveEndDateOfProviderRole(int index) throws HL7Exception {
     return (DTM) super.insertRepetition(9, index);
  }

  /**
   * Removes a repetition of Effective End Date of Provider Role (PRD-9) at a given index and returns it.
   * @param index The index
   */
  public DTM removeEffectiveEndDateOfProviderRole(int index) throws HL7Exception {
     return (DTM) super.removeRepetition(9, index);
  }

  /**
   * Returns a single repetition of Effective End Date of Provider Role (PRD-9).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public DTM getPrd9_EffectiveEndDateOfProviderRole(int rep) throws HL7Exception {
    DTM ret = null;
    try {
        Type t = this.getField(9, rep);
        ret = (DTM)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Effective End Date of Provider Role (PRD-9).
   */
  public DTM[] getPrd9_EffectiveEndDateOfProviderRole() {
     DTM[] ret = null;
    try {
        Type[] t = this.getField(9);  
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
   * Returns a count of the number of repetitions of Effective End Date of Provider Role (PRD-9).
   */
  public int getPrd9_EffectiveEndDateOfProviderRoleReps() {
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
   * Inserts a repetition of Effective End Date of Provider Role (PRD-9) at a given index and returns it.
   * @param index The index
   */
  public DTM insertPrd9_EffectiveEndDateOfProviderRole(int index) throws HL7Exception {
     return (DTM) super.insertRepetition(9, index);
  }

  /**
   * Removes a repetition of Effective End Date of Provider Role (PRD-9) at a given index and returns it.
   * @param index The index
   */
  public DTM removePrd9_EffectiveEndDateOfProviderRole(int index) throws HL7Exception {
     return (DTM) super.removeRepetition(9, index);
  }

  /**
   * Returns Provider Organization Name and Identifier (PRD-10).
   */
  public XON getProviderOrganizationNameAndIdentifier()  {
    XON ret = null;
    try {
        Type t = this.getField(10, 0);
        ret = (XON)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns Provider Organization Name and Identifier (PRD-10).
   */
  public XON getPrd10_ProviderOrganizationNameAndIdentifier()  {
    XON ret = null;
    try {
        Type t = this.getField(10, 0);
        ret = (XON)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns a single repetition of Provider Organization Address (PRD-11).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XAD getProviderOrganizationAddress(int rep) throws HL7Exception {
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
   * Returns all repetitions of Provider Organization Address (PRD-11).
   */
  public XAD[] getProviderOrganizationAddress() {
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
   * Returns a count of the number of repetitions of Provider Organization Address (PRD-11).
   */
  public int getProviderOrganizationAddressReps() {
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
   * Inserts a repetition of Provider Organization Address (PRD-11) at a given index and returns it.
   * @param index The index
   */
  public XAD insertProviderOrganizationAddress(int index) throws HL7Exception {
     return (XAD) super.insertRepetition(11, index);
  }

  /**
   * Removes a repetition of Provider Organization Address (PRD-11) at a given index and returns it.
   * @param index The index
   */
  public XAD removeProviderOrganizationAddress(int index) throws HL7Exception {
     return (XAD) super.removeRepetition(11, index);
  }

  /**
   * Returns a single repetition of Provider Organization Address (PRD-11).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XAD getPrd11_ProviderOrganizationAddress(int rep) throws HL7Exception {
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
   * Returns all repetitions of Provider Organization Address (PRD-11).
   */
  public XAD[] getPrd11_ProviderOrganizationAddress() {
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
   * Returns a count of the number of repetitions of Provider Organization Address (PRD-11).
   */
  public int getPrd11_ProviderOrganizationAddressReps() {
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
   * Inserts a repetition of Provider Organization Address (PRD-11) at a given index and returns it.
   * @param index The index
   */
  public XAD insertPrd11_ProviderOrganizationAddress(int index) throws HL7Exception {
     return (XAD) super.insertRepetition(11, index);
  }

  /**
   * Removes a repetition of Provider Organization Address (PRD-11) at a given index and returns it.
   * @param index The index
   */
  public XAD removePrd11_ProviderOrganizationAddress(int index) throws HL7Exception {
     return (XAD) super.removeRepetition(11, index);
  }

  /**
   * Returns a single repetition of Provider Organization Location Information (PRD-12).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public PL getProviderOrganizationLocationInformation(int rep) throws HL7Exception {
    PL ret = null;
    try {
        Type t = this.getField(12, rep);
        ret = (PL)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Provider Organization Location Information (PRD-12).
   */
  public PL[] getProviderOrganizationLocationInformation() {
     PL[] ret = null;
    try {
        Type[] t = this.getField(12);  
        ret = new PL[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (PL)t[i];
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
   * Returns a count of the number of repetitions of Provider Organization Location Information (PRD-12).
   */
  public int getProviderOrganizationLocationInformationReps() {
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
   * Inserts a repetition of Provider Organization Location Information (PRD-12) at a given index and returns it.
   * @param index The index
   */
  public PL insertProviderOrganizationLocationInformation(int index) throws HL7Exception {
     return (PL) super.insertRepetition(12, index);
  }

  /**
   * Removes a repetition of Provider Organization Location Information (PRD-12) at a given index and returns it.
   * @param index The index
   */
  public PL removeProviderOrganizationLocationInformation(int index) throws HL7Exception {
     return (PL) super.removeRepetition(12, index);
  }

  /**
   * Returns a single repetition of Provider Organization Location Information (PRD-12).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public PL getPrd12_ProviderOrganizationLocationInformation(int rep) throws HL7Exception {
    PL ret = null;
    try {
        Type t = this.getField(12, rep);
        ret = (PL)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Provider Organization Location Information (PRD-12).
   */
  public PL[] getPrd12_ProviderOrganizationLocationInformation() {
     PL[] ret = null;
    try {
        Type[] t = this.getField(12);  
        ret = new PL[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (PL)t[i];
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
   * Returns a count of the number of repetitions of Provider Organization Location Information (PRD-12).
   */
  public int getPrd12_ProviderOrganizationLocationInformationReps() {
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
   * Inserts a repetition of Provider Organization Location Information (PRD-12) at a given index and returns it.
   * @param index The index
   */
  public PL insertPrd12_ProviderOrganizationLocationInformation(int index) throws HL7Exception {
     return (PL) super.insertRepetition(12, index);
  }

  /**
   * Removes a repetition of Provider Organization Location Information (PRD-12) at a given index and returns it.
   * @param index The index
   */
  public PL removePrd12_ProviderOrganizationLocationInformation(int index) throws HL7Exception {
     return (PL) super.removeRepetition(12, index);
  }

  /**
   * Returns a single repetition of Provider Organization Communication Information (PRD-13).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XTN getProviderOrganizationCommunicationInformation(int rep) throws HL7Exception {
    XTN ret = null;
    try {
        Type t = this.getField(13, rep);
        ret = (XTN)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Provider Organization Communication Information (PRD-13).
   */
  public XTN[] getProviderOrganizationCommunicationInformation() {
     XTN[] ret = null;
    try {
        Type[] t = this.getField(13);  
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
   * Returns a count of the number of repetitions of Provider Organization Communication Information (PRD-13).
   */
  public int getProviderOrganizationCommunicationInformationReps() {
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
   * Inserts a repetition of Provider Organization Communication Information (PRD-13) at a given index and returns it.
   * @param index The index
   */
  public XTN insertProviderOrganizationCommunicationInformation(int index) throws HL7Exception {
     return (XTN) super.insertRepetition(13, index);
  }

  /**
   * Removes a repetition of Provider Organization Communication Information (PRD-13) at a given index and returns it.
   * @param index The index
   */
  public XTN removeProviderOrganizationCommunicationInformation(int index) throws HL7Exception {
     return (XTN) super.removeRepetition(13, index);
  }

  /**
   * Returns a single repetition of Provider Organization Communication Information (PRD-13).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XTN getPrd13_ProviderOrganizationCommunicationInformation(int rep) throws HL7Exception {
    XTN ret = null;
    try {
        Type t = this.getField(13, rep);
        ret = (XTN)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Provider Organization Communication Information (PRD-13).
   */
  public XTN[] getPrd13_ProviderOrganizationCommunicationInformation() {
     XTN[] ret = null;
    try {
        Type[] t = this.getField(13);  
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
   * Returns a count of the number of repetitions of Provider Organization Communication Information (PRD-13).
   */
  public int getPrd13_ProviderOrganizationCommunicationInformationReps() {
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
   * Inserts a repetition of Provider Organization Communication Information (PRD-13) at a given index and returns it.
   * @param index The index
   */
  public XTN insertPrd13_ProviderOrganizationCommunicationInformation(int index) throws HL7Exception {
     return (XTN) super.insertRepetition(13, index);
  }

  /**
   * Removes a repetition of Provider Organization Communication Information (PRD-13) at a given index and returns it.
   * @param index The index
   */
  public XTN removePrd13_ProviderOrganizationCommunicationInformation(int index) throws HL7Exception {
     return (XTN) super.removeRepetition(13, index);
  }

  /**
   * Returns Provider Organization Method of Contact (PRD-14).
   */
  public CWE getProviderOrganizationMethodOfContact()  {
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
   * Returns Provider Organization Method of Contact (PRD-14).
   */
  public CWE getPrd14_ProviderOrganizationMethodOfContact()  {
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

   protected Type createNewTypeWithoutReflection(int field) {
      switch (field) {
         case 0: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 1: return new ca.uhn.hl7v2.model.v26.datatype.XPN(getMessage());
         case 2: return new ca.uhn.hl7v2.model.v26.datatype.XAD(getMessage());
         case 3: return new ca.uhn.hl7v2.model.v26.datatype.PL(getMessage());
         case 4: return new ca.uhn.hl7v2.model.v26.datatype.XTN(getMessage());
         case 5: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 6: return new ca.uhn.hl7v2.model.v26.datatype.PLN(getMessage());
         case 7: return new ca.uhn.hl7v2.model.v26.datatype.DTM(getMessage());
         case 8: return new ca.uhn.hl7v2.model.v26.datatype.DTM(getMessage());
         case 9: return new ca.uhn.hl7v2.model.v26.datatype.XON(getMessage());
         case 10: return new ca.uhn.hl7v2.model.v26.datatype.XAD(getMessage());
         case 11: return new ca.uhn.hl7v2.model.v26.datatype.PL(getMessage());
         case 12: return new ca.uhn.hl7v2.model.v26.datatype.XTN(getMessage());
         case 13: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         default: return null;
      }
   }

}