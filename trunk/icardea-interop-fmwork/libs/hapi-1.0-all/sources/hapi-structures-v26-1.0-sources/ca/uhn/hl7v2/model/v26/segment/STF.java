package ca.uhn.hl7v2.model.v26.segment;

import ca.uhn.hl7v2.model.*;
import ca.uhn.hl7v2.model.v26.datatype.*;
import ca.uhn.log.HapiLogFactory;
import ca.uhn.hl7v2.parser.ModelClassFactory;
import ca.uhn.hl7v2.HL7Exception;

/**
 * <p>Represents an HL7 STF message segment. 
 * This segment has the following fields:</p><p>
 * STF-1: Primary Key Value - STF (CWE)<br> 
 * STF-2: Staff Identifier List (CX)<br> 
 * STF-3: Staff Name (XPN)<br> 
 * STF-4: Staff Type (IS)<br> 
 * STF-5: Administrative Sex (IS)<br> 
 * STF-6: Date/Time of Birth (DTM)<br> 
 * STF-7: Active/Inactive Flag (ID)<br> 
 * STF-8: Department (CWE)<br> 
 * STF-9: Hospital Service - STF (CWE)<br> 
 * STF-10: Phone (XTN)<br> 
 * STF-11: Office/Home Address/Birthplace (XAD)<br> 
 * STF-12: Institution Activation Date (DIN)<br> 
 * STF-13: Institution Inactivation Date (DIN)<br> 
 * STF-14: Backup Person ID (CWE)<br> 
 * STF-15: E-Mail Address (ST)<br> 
 * STF-16: Preferred Method of Contact (CWE)<br> 
 * STF-17: Marital Status (CWE)<br> 
 * STF-18: Job Title (ST)<br> 
 * STF-19: Job Code/Class (JCC)<br> 
 * STF-20: Employment Status Code (CWE)<br> 
 * STF-21: Additional Insured on Auto (ID)<br> 
 * STF-22: Driver's License Number - Staff (DLN)<br> 
 * STF-23: Copy Auto Ins (ID)<br> 
 * STF-24: Auto Ins Expires (DT)<br> 
 * STF-25: Date Last DMV Review (DT)<br> 
 * STF-26: Date Next DMV Review (DT)<br> 
 * STF-27: Race (CWE)<br> 
 * STF-28: Ethnic Group (CWE)<br> 
 * STF-29: Re-activation Approval Indicator (ID)<br> 
 * STF-30: Citizenship (CWE)<br> 
 * STF-31: Date/Time of Death (DTM)<br> 
 * STF-32: Death Indicator (ID)<br> 
 * STF-33: Institution Relationship Type Code (CWE)<br> 
 * STF-34: Institution Relationship Period (DR)<br> 
 * STF-35: Expected Return Date (DT)<br> 
 * STF-36: Cost Center Code (CWE)<br> 
 * STF-37: Generic Classification Indicator (ID)<br> 
 * STF-38: Inactive Reason Code (CWE)<br> 
 * STF-39: Generic resource type or category (CWE)<br> 
 * </p><p>The get...() methods return data from individual fields.  These methods 
 * do not throw exceptions and may therefore have to handle exceptions internally.  
 * If an exception is handled internally, it is logged and null is returned.  
 * This is not expected to happen - if it does happen this indicates not so much 
 * an exceptional circumstance as a bug in the code for this class.</p>    
 */
public class STF extends AbstractSegment  {

  /**
   * Creates a STF (Staff Identification) segment object that belongs to the given 
   * message.  
   */
  public STF(Group parent, ModelClassFactory factory) {
    super(parent, factory);
    Message message = getMessage();
    try {
       this.add(CWE.class, false, 1, 250, new Object[]{message}, "Primary Key Value - STF");
       this.add(CX.class, false, 0, 250, new Object[]{message}, "Staff Identifier List");
       this.add(XPN.class, false, 0, 250, new Object[]{message}, "Staff Name");
       this.add(IS.class, false, 0, 2, new Object[]{message, new Integer(182)}, "Staff Type");
       this.add(IS.class, false, 1, 1, new Object[]{message, new Integer(1)}, "Administrative Sex");
       this.add(DTM.class, false, 1, 24, new Object[]{message}, "Date/Time of Birth");
       this.add(ID.class, false, 1, 1, new Object[]{message, new Integer(183)}, "Active/Inactive Flag");
       this.add(CWE.class, false, 0, 250, new Object[]{message}, "Department");
       this.add(CWE.class, false, 0, 250, new Object[]{message}, "Hospital Service - STF");
       this.add(XTN.class, false, 0, 250, new Object[]{message}, "Phone");
       this.add(XAD.class, false, 0, 250, new Object[]{message}, "Office/Home Address/Birthplace");
       this.add(DIN.class, false, 0, 276, new Object[]{message}, "Institution Activation Date");
       this.add(DIN.class, false, 0, 276, new Object[]{message}, "Institution Inactivation Date");
       this.add(CWE.class, false, 0, 250, new Object[]{message}, "Backup Person ID");
       this.add(ST.class, false, 0, 40, new Object[]{message}, "E-Mail Address");
       this.add(CWE.class, false, 1, 705, new Object[]{message}, "Preferred Method of Contact");
       this.add(CWE.class, false, 1, 705, new Object[]{message}, "Marital Status");
       this.add(ST.class, false, 1, 20, new Object[]{message}, "Job Title");
       this.add(JCC.class, false, 1, 20, new Object[]{message}, "Job Code/Class");
       this.add(CWE.class, false, 1, 250, new Object[]{message}, "Employment Status Code");
       this.add(ID.class, false, 1, 1, new Object[]{message, new Integer(136)}, "Additional Insured on Auto");
       this.add(DLN.class, false, 1, 25, new Object[]{message}, "Driver's License Number - Staff");
       this.add(ID.class, false, 1, 1, new Object[]{message, new Integer(136)}, "Copy Auto Ins");
       this.add(DT.class, false, 1, 8, new Object[]{message}, "Auto Ins Expires");
       this.add(DT.class, false, 1, 8, new Object[]{message}, "Date Last DMV Review");
       this.add(DT.class, false, 1, 8, new Object[]{message}, "Date Next DMV Review");
       this.add(CWE.class, false, 1, 705, new Object[]{message}, "Race");
       this.add(CWE.class, false, 1, 705, new Object[]{message}, "Ethnic Group");
       this.add(ID.class, false, 1, 1, new Object[]{message, new Integer(136)}, "Re-activation Approval Indicator");
       this.add(CWE.class, false, 0, 705, new Object[]{message}, "Citizenship");
       this.add(DTM.class, false, 1, 8, new Object[]{message}, "Date/Time of Death");
       this.add(ID.class, false, 1, 1, new Object[]{message, new Integer(136)}, "Death Indicator");
       this.add(CWE.class, false, 1, 250, new Object[]{message}, "Institution Relationship Type Code");
       this.add(DR.class, false, 1, 52, new Object[]{message}, "Institution Relationship Period");
       this.add(DT.class, false, 1, 8, new Object[]{message}, "Expected Return Date");
       this.add(CWE.class, false, 0, 250, new Object[]{message}, "Cost Center Code");
       this.add(ID.class, false, 1, 1, new Object[]{message, new Integer(136)}, "Generic Classification Indicator");
       this.add(CWE.class, false, 1, 250, new Object[]{message}, "Inactive Reason Code");
       this.add(CWE.class, false, 0, 1, new Object[]{message}, "Generic resource type or category");
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Can't instantiate " + this.getClass().getName(), he);
    }
  }

  /**
   * Returns Primary Key Value - STF (STF-1).
   */
  public CWE getPrimaryKeyValueSTF()  {
    CWE ret = null;
    try {
        Type t = this.getField(1, 0);
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
   * Returns Primary Key Value - STF (STF-1).
   */
  public CWE getStf1_PrimaryKeyValueSTF()  {
    CWE ret = null;
    try {
        Type t = this.getField(1, 0);
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
   * Returns a single repetition of Staff Identifier List (STF-2).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CX getStaffIdentifierList(int rep) throws HL7Exception {
    CX ret = null;
    try {
        Type t = this.getField(2, rep);
        ret = (CX)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Staff Identifier List (STF-2).
   */
  public CX[] getStaffIdentifierList() {
     CX[] ret = null;
    try {
        Type[] t = this.getField(2);  
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
   * Returns a count of the number of repetitions of Staff Identifier List (STF-2).
   */
  public int getStaffIdentifierListReps() {
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
   * Inserts a repetition of Staff Identifier List (STF-2) at a given index and returns it.
   * @param index The index
   */
  public CX insertStaffIdentifierList(int index) throws HL7Exception {
     return (CX) super.insertRepetition(2, index);
  }

  /**
   * Removes a repetition of Staff Identifier List (STF-2) at a given index and returns it.
   * @param index The index
   */
  public CX removeStaffIdentifierList(int index) throws HL7Exception {
     return (CX) super.removeRepetition(2, index);
  }

  /**
   * Returns a single repetition of Staff Identifier List (STF-2).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CX getStf2_StaffIdentifierList(int rep) throws HL7Exception {
    CX ret = null;
    try {
        Type t = this.getField(2, rep);
        ret = (CX)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Staff Identifier List (STF-2).
   */
  public CX[] getStf2_StaffIdentifierList() {
     CX[] ret = null;
    try {
        Type[] t = this.getField(2);  
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
   * Returns a count of the number of repetitions of Staff Identifier List (STF-2).
   */
  public int getStf2_StaffIdentifierListReps() {
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
   * Inserts a repetition of Staff Identifier List (STF-2) at a given index and returns it.
   * @param index The index
   */
  public CX insertStf2_StaffIdentifierList(int index) throws HL7Exception {
     return (CX) super.insertRepetition(2, index);
  }

  /**
   * Removes a repetition of Staff Identifier List (STF-2) at a given index and returns it.
   * @param index The index
   */
  public CX removeStf2_StaffIdentifierList(int index) throws HL7Exception {
     return (CX) super.removeRepetition(2, index);
  }

  /**
   * Returns a single repetition of Staff Name (STF-3).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XPN getStaffName(int rep) throws HL7Exception {
    XPN ret = null;
    try {
        Type t = this.getField(3, rep);
        ret = (XPN)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Staff Name (STF-3).
   */
  public XPN[] getStaffName() {
     XPN[] ret = null;
    try {
        Type[] t = this.getField(3);  
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
   * Returns a count of the number of repetitions of Staff Name (STF-3).
   */
  public int getStaffNameReps() {
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
   * Inserts a repetition of Staff Name (STF-3) at a given index and returns it.
   * @param index The index
   */
  public XPN insertStaffName(int index) throws HL7Exception {
     return (XPN) super.insertRepetition(3, index);
  }

  /**
   * Removes a repetition of Staff Name (STF-3) at a given index and returns it.
   * @param index The index
   */
  public XPN removeStaffName(int index) throws HL7Exception {
     return (XPN) super.removeRepetition(3, index);
  }

  /**
   * Returns a single repetition of Staff Name (STF-3).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XPN getStf3_StaffName(int rep) throws HL7Exception {
    XPN ret = null;
    try {
        Type t = this.getField(3, rep);
        ret = (XPN)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Staff Name (STF-3).
   */
  public XPN[] getStf3_StaffName() {
     XPN[] ret = null;
    try {
        Type[] t = this.getField(3);  
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
   * Returns a count of the number of repetitions of Staff Name (STF-3).
   */
  public int getStf3_StaffNameReps() {
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
   * Inserts a repetition of Staff Name (STF-3) at a given index and returns it.
   * @param index The index
   */
  public XPN insertStf3_StaffName(int index) throws HL7Exception {
     return (XPN) super.insertRepetition(3, index);
  }

  /**
   * Removes a repetition of Staff Name (STF-3) at a given index and returns it.
   * @param index The index
   */
  public XPN removeStf3_StaffName(int index) throws HL7Exception {
     return (XPN) super.removeRepetition(3, index);
  }

  /**
   * Returns a single repetition of Staff Type (STF-4).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public IS getStaffType(int rep) throws HL7Exception {
    IS ret = null;
    try {
        Type t = this.getField(4, rep);
        ret = (IS)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Staff Type (STF-4).
   */
  public IS[] getStaffType() {
     IS[] ret = null;
    try {
        Type[] t = this.getField(4);  
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
   * Returns a count of the number of repetitions of Staff Type (STF-4).
   */
  public int getStaffTypeReps() {
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
   * Inserts a repetition of Staff Type (STF-4) at a given index and returns it.
   * @param index The index
   */
  public IS insertStaffType(int index) throws HL7Exception {
     return (IS) super.insertRepetition(4, index);
  }

  /**
   * Removes a repetition of Staff Type (STF-4) at a given index and returns it.
   * @param index The index
   */
  public IS removeStaffType(int index) throws HL7Exception {
     return (IS) super.removeRepetition(4, index);
  }

  /**
   * Returns a single repetition of Staff Type (STF-4).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public IS getStf4_StaffType(int rep) throws HL7Exception {
    IS ret = null;
    try {
        Type t = this.getField(4, rep);
        ret = (IS)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Staff Type (STF-4).
   */
  public IS[] getStf4_StaffType() {
     IS[] ret = null;
    try {
        Type[] t = this.getField(4);  
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
   * Returns a count of the number of repetitions of Staff Type (STF-4).
   */
  public int getStf4_StaffTypeReps() {
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
   * Inserts a repetition of Staff Type (STF-4) at a given index and returns it.
   * @param index The index
   */
  public IS insertStf4_StaffType(int index) throws HL7Exception {
     return (IS) super.insertRepetition(4, index);
  }

  /**
   * Removes a repetition of Staff Type (STF-4) at a given index and returns it.
   * @param index The index
   */
  public IS removeStf4_StaffType(int index) throws HL7Exception {
     return (IS) super.removeRepetition(4, index);
  }

  /**
   * Returns Administrative Sex (STF-5).
   */
  public IS getAdministrativeSex()  {
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
   * Returns Administrative Sex (STF-5).
   */
  public IS getStf5_AdministrativeSex()  {
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
   * Returns Date/Time of Birth (STF-6).
   */
  public DTM getDateTimeOfBirth()  {
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
   * Returns Date/Time of Birth (STF-6).
   */
  public DTM getStf6_DateTimeOfBirth()  {
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
   * Returns Active/Inactive Flag (STF-7).
   */
  public ID getActiveInactiveFlag()  {
    ID ret = null;
    try {
        Type t = this.getField(7, 0);
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
   * Returns Active/Inactive Flag (STF-7).
   */
  public ID getStf7_ActiveInactiveFlag()  {
    ID ret = null;
    try {
        Type t = this.getField(7, 0);
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
   * Returns a single repetition of Department (STF-8).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getDepartment(int rep) throws HL7Exception {
    CWE ret = null;
    try {
        Type t = this.getField(8, rep);
        ret = (CWE)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Department (STF-8).
   */
  public CWE[] getDepartment() {
     CWE[] ret = null;
    try {
        Type[] t = this.getField(8);  
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
   * Returns a count of the number of repetitions of Department (STF-8).
   */
  public int getDepartmentReps() {
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
   * Inserts a repetition of Department (STF-8) at a given index and returns it.
   * @param index The index
   */
  public CWE insertDepartment(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(8, index);
  }

  /**
   * Removes a repetition of Department (STF-8) at a given index and returns it.
   * @param index The index
   */
  public CWE removeDepartment(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(8, index);
  }

  /**
   * Returns a single repetition of Department (STF-8).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getStf8_Department(int rep) throws HL7Exception {
    CWE ret = null;
    try {
        Type t = this.getField(8, rep);
        ret = (CWE)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Department (STF-8).
   */
  public CWE[] getStf8_Department() {
     CWE[] ret = null;
    try {
        Type[] t = this.getField(8);  
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
   * Returns a count of the number of repetitions of Department (STF-8).
   */
  public int getStf8_DepartmentReps() {
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
   * Inserts a repetition of Department (STF-8) at a given index and returns it.
   * @param index The index
   */
  public CWE insertStf8_Department(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(8, index);
  }

  /**
   * Removes a repetition of Department (STF-8) at a given index and returns it.
   * @param index The index
   */
  public CWE removeStf8_Department(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(8, index);
  }

  /**
   * Returns a single repetition of Hospital Service - STF (STF-9).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getHospitalServiceSTF(int rep) throws HL7Exception {
    CWE ret = null;
    try {
        Type t = this.getField(9, rep);
        ret = (CWE)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Hospital Service - STF (STF-9).
   */
  public CWE[] getHospitalServiceSTF() {
     CWE[] ret = null;
    try {
        Type[] t = this.getField(9);  
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
   * Returns a count of the number of repetitions of Hospital Service - STF (STF-9).
   */
  public int getHospitalServiceSTFReps() {
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
   * Inserts a repetition of Hospital Service - STF (STF-9) at a given index and returns it.
   * @param index The index
   */
  public CWE insertHospitalServiceSTF(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(9, index);
  }

  /**
   * Removes a repetition of Hospital Service - STF (STF-9) at a given index and returns it.
   * @param index The index
   */
  public CWE removeHospitalServiceSTF(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(9, index);
  }

  /**
   * Returns a single repetition of Hospital Service - STF (STF-9).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getStf9_HospitalServiceSTF(int rep) throws HL7Exception {
    CWE ret = null;
    try {
        Type t = this.getField(9, rep);
        ret = (CWE)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Hospital Service - STF (STF-9).
   */
  public CWE[] getStf9_HospitalServiceSTF() {
     CWE[] ret = null;
    try {
        Type[] t = this.getField(9);  
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
   * Returns a count of the number of repetitions of Hospital Service - STF (STF-9).
   */
  public int getStf9_HospitalServiceSTFReps() {
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
   * Inserts a repetition of Hospital Service - STF (STF-9) at a given index and returns it.
   * @param index The index
   */
  public CWE insertStf9_HospitalServiceSTF(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(9, index);
  }

  /**
   * Removes a repetition of Hospital Service - STF (STF-9) at a given index and returns it.
   * @param index The index
   */
  public CWE removeStf9_HospitalServiceSTF(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(9, index);
  }

  /**
   * Returns a single repetition of Phone (STF-10).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XTN getPhone(int rep) throws HL7Exception {
    XTN ret = null;
    try {
        Type t = this.getField(10, rep);
        ret = (XTN)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Phone (STF-10).
   */
  public XTN[] getPhone() {
     XTN[] ret = null;
    try {
        Type[] t = this.getField(10);  
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
   * Returns a count of the number of repetitions of Phone (STF-10).
   */
  public int getPhoneReps() {
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
   * Inserts a repetition of Phone (STF-10) at a given index and returns it.
   * @param index The index
   */
  public XTN insertPhone(int index) throws HL7Exception {
     return (XTN) super.insertRepetition(10, index);
  }

  /**
   * Removes a repetition of Phone (STF-10) at a given index and returns it.
   * @param index The index
   */
  public XTN removePhone(int index) throws HL7Exception {
     return (XTN) super.removeRepetition(10, index);
  }

  /**
   * Returns a single repetition of Phone (STF-10).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XTN getStf10_Phone(int rep) throws HL7Exception {
    XTN ret = null;
    try {
        Type t = this.getField(10, rep);
        ret = (XTN)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Phone (STF-10).
   */
  public XTN[] getStf10_Phone() {
     XTN[] ret = null;
    try {
        Type[] t = this.getField(10);  
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
   * Returns a count of the number of repetitions of Phone (STF-10).
   */
  public int getStf10_PhoneReps() {
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
   * Inserts a repetition of Phone (STF-10) at a given index and returns it.
   * @param index The index
   */
  public XTN insertStf10_Phone(int index) throws HL7Exception {
     return (XTN) super.insertRepetition(10, index);
  }

  /**
   * Removes a repetition of Phone (STF-10) at a given index and returns it.
   * @param index The index
   */
  public XTN removeStf10_Phone(int index) throws HL7Exception {
     return (XTN) super.removeRepetition(10, index);
  }

  /**
   * Returns a single repetition of Office/Home Address/Birthplace (STF-11).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XAD getOfficeHomeAddressBirthplace(int rep) throws HL7Exception {
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
   * Returns all repetitions of Office/Home Address/Birthplace (STF-11).
   */
  public XAD[] getOfficeHomeAddressBirthplace() {
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
   * Returns a count of the number of repetitions of Office/Home Address/Birthplace (STF-11).
   */
  public int getOfficeHomeAddressBirthplaceReps() {
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
   * Inserts a repetition of Office/Home Address/Birthplace (STF-11) at a given index and returns it.
   * @param index The index
   */
  public XAD insertOfficeHomeAddressBirthplace(int index) throws HL7Exception {
     return (XAD) super.insertRepetition(11, index);
  }

  /**
   * Removes a repetition of Office/Home Address/Birthplace (STF-11) at a given index and returns it.
   * @param index The index
   */
  public XAD removeOfficeHomeAddressBirthplace(int index) throws HL7Exception {
     return (XAD) super.removeRepetition(11, index);
  }

  /**
   * Returns a single repetition of Office/Home Address/Birthplace (STF-11).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XAD getStf11_OfficeHomeAddressBirthplace(int rep) throws HL7Exception {
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
   * Returns all repetitions of Office/Home Address/Birthplace (STF-11).
   */
  public XAD[] getStf11_OfficeHomeAddressBirthplace() {
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
   * Returns a count of the number of repetitions of Office/Home Address/Birthplace (STF-11).
   */
  public int getStf11_OfficeHomeAddressBirthplaceReps() {
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
   * Inserts a repetition of Office/Home Address/Birthplace (STF-11) at a given index and returns it.
   * @param index The index
   */
  public XAD insertStf11_OfficeHomeAddressBirthplace(int index) throws HL7Exception {
     return (XAD) super.insertRepetition(11, index);
  }

  /**
   * Removes a repetition of Office/Home Address/Birthplace (STF-11) at a given index and returns it.
   * @param index The index
   */
  public XAD removeStf11_OfficeHomeAddressBirthplace(int index) throws HL7Exception {
     return (XAD) super.removeRepetition(11, index);
  }

  /**
   * Returns a single repetition of Institution Activation Date (STF-12).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public DIN getInstitutionActivationDate(int rep) throws HL7Exception {
    DIN ret = null;
    try {
        Type t = this.getField(12, rep);
        ret = (DIN)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Institution Activation Date (STF-12).
   */
  public DIN[] getInstitutionActivationDate() {
     DIN[] ret = null;
    try {
        Type[] t = this.getField(12);  
        ret = new DIN[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (DIN)t[i];
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
   * Returns a count of the number of repetitions of Institution Activation Date (STF-12).
   */
  public int getInstitutionActivationDateReps() {
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
   * Inserts a repetition of Institution Activation Date (STF-12) at a given index and returns it.
   * @param index The index
   */
  public DIN insertInstitutionActivationDate(int index) throws HL7Exception {
     return (DIN) super.insertRepetition(12, index);
  }

  /**
   * Removes a repetition of Institution Activation Date (STF-12) at a given index and returns it.
   * @param index The index
   */
  public DIN removeInstitutionActivationDate(int index) throws HL7Exception {
     return (DIN) super.removeRepetition(12, index);
  }

  /**
   * Returns a single repetition of Institution Activation Date (STF-12).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public DIN getStf12_InstitutionActivationDate(int rep) throws HL7Exception {
    DIN ret = null;
    try {
        Type t = this.getField(12, rep);
        ret = (DIN)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Institution Activation Date (STF-12).
   */
  public DIN[] getStf12_InstitutionActivationDate() {
     DIN[] ret = null;
    try {
        Type[] t = this.getField(12);  
        ret = new DIN[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (DIN)t[i];
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
   * Returns a count of the number of repetitions of Institution Activation Date (STF-12).
   */
  public int getStf12_InstitutionActivationDateReps() {
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
   * Inserts a repetition of Institution Activation Date (STF-12) at a given index and returns it.
   * @param index The index
   */
  public DIN insertStf12_InstitutionActivationDate(int index) throws HL7Exception {
     return (DIN) super.insertRepetition(12, index);
  }

  /**
   * Removes a repetition of Institution Activation Date (STF-12) at a given index and returns it.
   * @param index The index
   */
  public DIN removeStf12_InstitutionActivationDate(int index) throws HL7Exception {
     return (DIN) super.removeRepetition(12, index);
  }

  /**
   * Returns a single repetition of Institution Inactivation Date (STF-13).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public DIN getInstitutionInactivationDate(int rep) throws HL7Exception {
    DIN ret = null;
    try {
        Type t = this.getField(13, rep);
        ret = (DIN)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Institution Inactivation Date (STF-13).
   */
  public DIN[] getInstitutionInactivationDate() {
     DIN[] ret = null;
    try {
        Type[] t = this.getField(13);  
        ret = new DIN[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (DIN)t[i];
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
   * Returns a count of the number of repetitions of Institution Inactivation Date (STF-13).
   */
  public int getInstitutionInactivationDateReps() {
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
   * Inserts a repetition of Institution Inactivation Date (STF-13) at a given index and returns it.
   * @param index The index
   */
  public DIN insertInstitutionInactivationDate(int index) throws HL7Exception {
     return (DIN) super.insertRepetition(13, index);
  }

  /**
   * Removes a repetition of Institution Inactivation Date (STF-13) at a given index and returns it.
   * @param index The index
   */
  public DIN removeInstitutionInactivationDate(int index) throws HL7Exception {
     return (DIN) super.removeRepetition(13, index);
  }

  /**
   * Returns a single repetition of Institution Inactivation Date (STF-13).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public DIN getStf13_InstitutionInactivationDate(int rep) throws HL7Exception {
    DIN ret = null;
    try {
        Type t = this.getField(13, rep);
        ret = (DIN)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Institution Inactivation Date (STF-13).
   */
  public DIN[] getStf13_InstitutionInactivationDate() {
     DIN[] ret = null;
    try {
        Type[] t = this.getField(13);  
        ret = new DIN[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (DIN)t[i];
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
   * Returns a count of the number of repetitions of Institution Inactivation Date (STF-13).
   */
  public int getStf13_InstitutionInactivationDateReps() {
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
   * Inserts a repetition of Institution Inactivation Date (STF-13) at a given index and returns it.
   * @param index The index
   */
  public DIN insertStf13_InstitutionInactivationDate(int index) throws HL7Exception {
     return (DIN) super.insertRepetition(13, index);
  }

  /**
   * Removes a repetition of Institution Inactivation Date (STF-13) at a given index and returns it.
   * @param index The index
   */
  public DIN removeStf13_InstitutionInactivationDate(int index) throws HL7Exception {
     return (DIN) super.removeRepetition(13, index);
  }

  /**
   * Returns a single repetition of Backup Person ID (STF-14).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getBackupPersonID(int rep) throws HL7Exception {
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
   * Returns all repetitions of Backup Person ID (STF-14).
   */
  public CWE[] getBackupPersonID() {
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
   * Returns a count of the number of repetitions of Backup Person ID (STF-14).
   */
  public int getBackupPersonIDReps() {
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
   * Inserts a repetition of Backup Person ID (STF-14) at a given index and returns it.
   * @param index The index
   */
  public CWE insertBackupPersonID(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(14, index);
  }

  /**
   * Removes a repetition of Backup Person ID (STF-14) at a given index and returns it.
   * @param index The index
   */
  public CWE removeBackupPersonID(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(14, index);
  }

  /**
   * Returns a single repetition of Backup Person ID (STF-14).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getStf14_BackupPersonID(int rep) throws HL7Exception {
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
   * Returns all repetitions of Backup Person ID (STF-14).
   */
  public CWE[] getStf14_BackupPersonID() {
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
   * Returns a count of the number of repetitions of Backup Person ID (STF-14).
   */
  public int getStf14_BackupPersonIDReps() {
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
   * Inserts a repetition of Backup Person ID (STF-14) at a given index and returns it.
   * @param index The index
   */
  public CWE insertStf14_BackupPersonID(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(14, index);
  }

  /**
   * Removes a repetition of Backup Person ID (STF-14) at a given index and returns it.
   * @param index The index
   */
  public CWE removeStf14_BackupPersonID(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(14, index);
  }

  /**
   * Returns a single repetition of E-Mail Address (STF-15).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public ST getEMailAddress(int rep) throws HL7Exception {
    ST ret = null;
    try {
        Type t = this.getField(15, rep);
        ret = (ST)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of E-Mail Address (STF-15).
   */
  public ST[] getEMailAddress() {
     ST[] ret = null;
    try {
        Type[] t = this.getField(15);  
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
   * Returns a count of the number of repetitions of E-Mail Address (STF-15).
   */
  public int getEMailAddressReps() {
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
   * Inserts a repetition of E-Mail Address (STF-15) at a given index and returns it.
   * @param index The index
   */
  public ST insertEMailAddress(int index) throws HL7Exception {
     return (ST) super.insertRepetition(15, index);
  }

  /**
   * Removes a repetition of E-Mail Address (STF-15) at a given index and returns it.
   * @param index The index
   */
  public ST removeEMailAddress(int index) throws HL7Exception {
     return (ST) super.removeRepetition(15, index);
  }

  /**
   * Returns a single repetition of E-Mail Address (STF-15).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public ST getStf15_EMailAddress(int rep) throws HL7Exception {
    ST ret = null;
    try {
        Type t = this.getField(15, rep);
        ret = (ST)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of E-Mail Address (STF-15).
   */
  public ST[] getStf15_EMailAddress() {
     ST[] ret = null;
    try {
        Type[] t = this.getField(15);  
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
   * Returns a count of the number of repetitions of E-Mail Address (STF-15).
   */
  public int getStf15_EMailAddressReps() {
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
   * Inserts a repetition of E-Mail Address (STF-15) at a given index and returns it.
   * @param index The index
   */
  public ST insertStf15_EMailAddress(int index) throws HL7Exception {
     return (ST) super.insertRepetition(15, index);
  }

  /**
   * Removes a repetition of E-Mail Address (STF-15) at a given index and returns it.
   * @param index The index
   */
  public ST removeStf15_EMailAddress(int index) throws HL7Exception {
     return (ST) super.removeRepetition(15, index);
  }

  /**
   * Returns Preferred Method of Contact (STF-16).
   */
  public CWE getPreferredMethodOfContact()  {
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
   * Returns Preferred Method of Contact (STF-16).
   */
  public CWE getStf16_PreferredMethodOfContact()  {
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
   * Returns Marital Status (STF-17).
   */
  public CWE getMaritalStatus()  {
    CWE ret = null;
    try {
        Type t = this.getField(17, 0);
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
   * Returns Marital Status (STF-17).
   */
  public CWE getStf17_MaritalStatus()  {
    CWE ret = null;
    try {
        Type t = this.getField(17, 0);
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
   * Returns Job Title (STF-18).
   */
  public ST getJobTitle()  {
    ST ret = null;
    try {
        Type t = this.getField(18, 0);
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
   * Returns Job Title (STF-18).
   */
  public ST getStf18_JobTitle()  {
    ST ret = null;
    try {
        Type t = this.getField(18, 0);
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
   * Returns Job Code/Class (STF-19).
   */
  public JCC getJobCodeClass()  {
    JCC ret = null;
    try {
        Type t = this.getField(19, 0);
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
   * Returns Job Code/Class (STF-19).
   */
  public JCC getStf19_JobCodeClass()  {
    JCC ret = null;
    try {
        Type t = this.getField(19, 0);
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
   * Returns Employment Status Code (STF-20).
   */
  public CWE getEmploymentStatusCode()  {
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
   * Returns Employment Status Code (STF-20).
   */
  public CWE getStf20_EmploymentStatusCode()  {
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
   * Returns Additional Insured on Auto (STF-21).
   */
  public ID getAdditionalInsuredOnAuto()  {
    ID ret = null;
    try {
        Type t = this.getField(21, 0);
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
   * Returns Additional Insured on Auto (STF-21).
   */
  public ID getStf21_AdditionalInsuredOnAuto()  {
    ID ret = null;
    try {
        Type t = this.getField(21, 0);
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
   * Returns Driver's License Number - Staff (STF-22).
   */
  public DLN getDriverSLicenseNumberStaff()  {
    DLN ret = null;
    try {
        Type t = this.getField(22, 0);
        ret = (DLN)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns Driver's License Number - Staff (STF-22).
   */
  public DLN getStf22_DriverSLicenseNumberStaff()  {
    DLN ret = null;
    try {
        Type t = this.getField(22, 0);
        ret = (DLN)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns Copy Auto Ins (STF-23).
   */
  public ID getCopyAutoIns()  {
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
   * Returns Copy Auto Ins (STF-23).
   */
  public ID getStf23_CopyAutoIns()  {
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
   * Returns Auto Ins Expires (STF-24).
   */
  public DT getAutoInsExpires()  {
    DT ret = null;
    try {
        Type t = this.getField(24, 0);
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
   * Returns Auto Ins Expires (STF-24).
   */
  public DT getStf24_AutoInsExpires()  {
    DT ret = null;
    try {
        Type t = this.getField(24, 0);
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
   * Returns Date Last DMV Review (STF-25).
   */
  public DT getDateLastDMVReview()  {
    DT ret = null;
    try {
        Type t = this.getField(25, 0);
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
   * Returns Date Last DMV Review (STF-25).
   */
  public DT getStf25_DateLastDMVReview()  {
    DT ret = null;
    try {
        Type t = this.getField(25, 0);
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
   * Returns Date Next DMV Review (STF-26).
   */
  public DT getDateNextDMVReview()  {
    DT ret = null;
    try {
        Type t = this.getField(26, 0);
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
   * Returns Date Next DMV Review (STF-26).
   */
  public DT getStf26_DateNextDMVReview()  {
    DT ret = null;
    try {
        Type t = this.getField(26, 0);
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
   * Returns Race (STF-27).
   */
  public CWE getRace()  {
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
   * Returns Race (STF-27).
   */
  public CWE getStf27_Race()  {
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
   * Returns Ethnic Group (STF-28).
   */
  public CWE getEthnicGroup()  {
    CWE ret = null;
    try {
        Type t = this.getField(28, 0);
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
   * Returns Ethnic Group (STF-28).
   */
  public CWE getStf28_EthnicGroup()  {
    CWE ret = null;
    try {
        Type t = this.getField(28, 0);
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
   * Returns Re-activation Approval Indicator (STF-29).
   */
  public ID getReActivationApprovalIndicator()  {
    ID ret = null;
    try {
        Type t = this.getField(29, 0);
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
   * Returns Re-activation Approval Indicator (STF-29).
   */
  public ID getStf29_ReActivationApprovalIndicator()  {
    ID ret = null;
    try {
        Type t = this.getField(29, 0);
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
   * Returns a single repetition of Citizenship (STF-30).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getCitizenship(int rep) throws HL7Exception {
    CWE ret = null;
    try {
        Type t = this.getField(30, rep);
        ret = (CWE)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Citizenship (STF-30).
   */
  public CWE[] getCitizenship() {
     CWE[] ret = null;
    try {
        Type[] t = this.getField(30);  
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
   * Returns a count of the number of repetitions of Citizenship (STF-30).
   */
  public int getCitizenshipReps() {
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
   * Inserts a repetition of Citizenship (STF-30) at a given index and returns it.
   * @param index The index
   */
  public CWE insertCitizenship(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(30, index);
  }

  /**
   * Removes a repetition of Citizenship (STF-30) at a given index and returns it.
   * @param index The index
   */
  public CWE removeCitizenship(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(30, index);
  }

  /**
   * Returns a single repetition of Citizenship (STF-30).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getStf30_Citizenship(int rep) throws HL7Exception {
    CWE ret = null;
    try {
        Type t = this.getField(30, rep);
        ret = (CWE)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Citizenship (STF-30).
   */
  public CWE[] getStf30_Citizenship() {
     CWE[] ret = null;
    try {
        Type[] t = this.getField(30);  
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
   * Returns a count of the number of repetitions of Citizenship (STF-30).
   */
  public int getStf30_CitizenshipReps() {
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
   * Inserts a repetition of Citizenship (STF-30) at a given index and returns it.
   * @param index The index
   */
  public CWE insertStf30_Citizenship(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(30, index);
  }

  /**
   * Removes a repetition of Citizenship (STF-30) at a given index and returns it.
   * @param index The index
   */
  public CWE removeStf30_Citizenship(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(30, index);
  }

  /**
   * Returns Date/Time of Death (STF-31).
   */
  public DTM getDateTimeOfDeath()  {
    DTM ret = null;
    try {
        Type t = this.getField(31, 0);
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
   * Returns Date/Time of Death (STF-31).
   */
  public DTM getStf31_DateTimeOfDeath()  {
    DTM ret = null;
    try {
        Type t = this.getField(31, 0);
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
   * Returns Death Indicator (STF-32).
   */
  public ID getDeathIndicator()  {
    ID ret = null;
    try {
        Type t = this.getField(32, 0);
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
   * Returns Death Indicator (STF-32).
   */
  public ID getStf32_DeathIndicator()  {
    ID ret = null;
    try {
        Type t = this.getField(32, 0);
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
   * Returns Institution Relationship Type Code (STF-33).
   */
  public CWE getInstitutionRelationshipTypeCode()  {
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
   * Returns Institution Relationship Type Code (STF-33).
   */
  public CWE getStf33_InstitutionRelationshipTypeCode()  {
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
   * Returns Institution Relationship Period (STF-34).
   */
  public DR getInstitutionRelationshipPeriod()  {
    DR ret = null;
    try {
        Type t = this.getField(34, 0);
        ret = (DR)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns Institution Relationship Period (STF-34).
   */
  public DR getStf34_InstitutionRelationshipPeriod()  {
    DR ret = null;
    try {
        Type t = this.getField(34, 0);
        ret = (DR)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns Expected Return Date (STF-35).
   */
  public DT getExpectedReturnDate()  {
    DT ret = null;
    try {
        Type t = this.getField(35, 0);
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
   * Returns Expected Return Date (STF-35).
   */
  public DT getStf35_ExpectedReturnDate()  {
    DT ret = null;
    try {
        Type t = this.getField(35, 0);
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
   * Returns a single repetition of Cost Center Code (STF-36).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getCostCenterCode(int rep) throws HL7Exception {
    CWE ret = null;
    try {
        Type t = this.getField(36, rep);
        ret = (CWE)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Cost Center Code (STF-36).
   */
  public CWE[] getCostCenterCode() {
     CWE[] ret = null;
    try {
        Type[] t = this.getField(36);  
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
   * Returns a count of the number of repetitions of Cost Center Code (STF-36).
   */
  public int getCostCenterCodeReps() {
    try {
        return this.getField(36).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Cost Center Code (STF-36) at a given index and returns it.
   * @param index The index
   */
  public CWE insertCostCenterCode(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(36, index);
  }

  /**
   * Removes a repetition of Cost Center Code (STF-36) at a given index and returns it.
   * @param index The index
   */
  public CWE removeCostCenterCode(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(36, index);
  }

  /**
   * Returns a single repetition of Cost Center Code (STF-36).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getStf36_CostCenterCode(int rep) throws HL7Exception {
    CWE ret = null;
    try {
        Type t = this.getField(36, rep);
        ret = (CWE)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Cost Center Code (STF-36).
   */
  public CWE[] getStf36_CostCenterCode() {
     CWE[] ret = null;
    try {
        Type[] t = this.getField(36);  
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
   * Returns a count of the number of repetitions of Cost Center Code (STF-36).
   */
  public int getStf36_CostCenterCodeReps() {
    try {
        return this.getField(36).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Cost Center Code (STF-36) at a given index and returns it.
   * @param index The index
   */
  public CWE insertStf36_CostCenterCode(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(36, index);
  }

  /**
   * Removes a repetition of Cost Center Code (STF-36) at a given index and returns it.
   * @param index The index
   */
  public CWE removeStf36_CostCenterCode(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(36, index);
  }

  /**
   * Returns Generic Classification Indicator (STF-37).
   */
  public ID getGenericClassificationIndicator()  {
    ID ret = null;
    try {
        Type t = this.getField(37, 0);
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
   * Returns Generic Classification Indicator (STF-37).
   */
  public ID getStf37_GenericClassificationIndicator()  {
    ID ret = null;
    try {
        Type t = this.getField(37, 0);
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
   * Returns Inactive Reason Code (STF-38).
   */
  public CWE getInactiveReasonCode()  {
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
   * Returns Inactive Reason Code (STF-38).
   */
  public CWE getStf38_InactiveReasonCode()  {
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
   * Returns a single repetition of Generic resource type or category (STF-39).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getGenericResourceTypeOrCategory(int rep) throws HL7Exception {
    CWE ret = null;
    try {
        Type t = this.getField(39, rep);
        ret = (CWE)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Generic resource type or category (STF-39).
   */
  public CWE[] getGenericResourceTypeOrCategory() {
     CWE[] ret = null;
    try {
        Type[] t = this.getField(39);  
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
   * Returns a count of the number of repetitions of Generic resource type or category (STF-39).
   */
  public int getGenericResourceTypeOrCategoryReps() {
    try {
        return this.getField(39).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Generic resource type or category (STF-39) at a given index and returns it.
   * @param index The index
   */
  public CWE insertGenericResourceTypeOrCategory(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(39, index);
  }

  /**
   * Removes a repetition of Generic resource type or category (STF-39) at a given index and returns it.
   * @param index The index
   */
  public CWE removeGenericResourceTypeOrCategory(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(39, index);
  }

  /**
   * Returns a single repetition of Generic resource type or category (STF-39).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getStf39_GenericResourceTypeOrCategory(int rep) throws HL7Exception {
    CWE ret = null;
    try {
        Type t = this.getField(39, rep);
        ret = (CWE)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Generic resource type or category (STF-39).
   */
  public CWE[] getStf39_GenericResourceTypeOrCategory() {
     CWE[] ret = null;
    try {
        Type[] t = this.getField(39);  
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
   * Returns a count of the number of repetitions of Generic resource type or category (STF-39).
   */
  public int getStf39_GenericResourceTypeOrCategoryReps() {
    try {
        return this.getField(39).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Generic resource type or category (STF-39) at a given index and returns it.
   * @param index The index
   */
  public CWE insertStf39_GenericResourceTypeOrCategory(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(39, index);
  }

  /**
   * Removes a repetition of Generic resource type or category (STF-39) at a given index and returns it.
   * @param index The index
   */
  public CWE removeStf39_GenericResourceTypeOrCategory(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(39, index);
  }

   protected Type createNewTypeWithoutReflection(int field) {
      switch (field) {
         case 0: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 1: return new ca.uhn.hl7v2.model.v26.datatype.CX(getMessage());
         case 2: return new ca.uhn.hl7v2.model.v26.datatype.XPN(getMessage());
         case 3: return new ca.uhn.hl7v2.model.v26.datatype.IS(getMessage(), new Integer(182));
         case 4: return new ca.uhn.hl7v2.model.v26.datatype.IS(getMessage(), new Integer(1));
         case 5: return new ca.uhn.hl7v2.model.v26.datatype.DTM(getMessage());
         case 6: return new ca.uhn.hl7v2.model.v26.datatype.ID(getMessage(), new Integer(183));
         case 7: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 8: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 9: return new ca.uhn.hl7v2.model.v26.datatype.XTN(getMessage());
         case 10: return new ca.uhn.hl7v2.model.v26.datatype.XAD(getMessage());
         case 11: return new ca.uhn.hl7v2.model.v26.datatype.DIN(getMessage());
         case 12: return new ca.uhn.hl7v2.model.v26.datatype.DIN(getMessage());
         case 13: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 14: return new ca.uhn.hl7v2.model.v26.datatype.ST(getMessage());
         case 15: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 16: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 17: return new ca.uhn.hl7v2.model.v26.datatype.ST(getMessage());
         case 18: return new ca.uhn.hl7v2.model.v26.datatype.JCC(getMessage());
         case 19: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 20: return new ca.uhn.hl7v2.model.v26.datatype.ID(getMessage(), new Integer(136));
         case 21: return new ca.uhn.hl7v2.model.v26.datatype.DLN(getMessage());
         case 22: return new ca.uhn.hl7v2.model.v26.datatype.ID(getMessage(), new Integer(136));
         case 23: return new ca.uhn.hl7v2.model.v26.datatype.DT(getMessage());
         case 24: return new ca.uhn.hl7v2.model.v26.datatype.DT(getMessage());
         case 25: return new ca.uhn.hl7v2.model.v26.datatype.DT(getMessage());
         case 26: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 27: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 28: return new ca.uhn.hl7v2.model.v26.datatype.ID(getMessage(), new Integer(136));
         case 29: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 30: return new ca.uhn.hl7v2.model.v26.datatype.DTM(getMessage());
         case 31: return new ca.uhn.hl7v2.model.v26.datatype.ID(getMessage(), new Integer(136));
         case 32: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 33: return new ca.uhn.hl7v2.model.v26.datatype.DR(getMessage());
         case 34: return new ca.uhn.hl7v2.model.v26.datatype.DT(getMessage());
         case 35: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 36: return new ca.uhn.hl7v2.model.v26.datatype.ID(getMessage(), new Integer(136));
         case 37: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 38: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         default: return null;
      }
   }

}