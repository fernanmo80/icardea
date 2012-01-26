package ca.uhn.hl7v2.model.v26.segment;

import ca.uhn.hl7v2.model.*;
import ca.uhn.hl7v2.model.v26.datatype.*;
import ca.uhn.log.HapiLogFactory;
import ca.uhn.hl7v2.parser.ModelClassFactory;
import ca.uhn.hl7v2.HL7Exception;

/**
 * <p>Represents an HL7 ROL message segment. 
 * This segment has the following fields:</p><p>
 * ROL-1: Role Instance ID (EI)<br> 
 * ROL-2: Action Code (ID)<br> 
 * ROL-3: Role-ROL (CWE)<br> 
 * ROL-4: Role Person (XCN)<br> 
 * ROL-5: Role Begin Date/Time (DTM)<br> 
 * ROL-6: Role End Date/Time (DTM)<br> 
 * ROL-7: Role Duration (CWE)<br> 
 * ROL-8: Role Action Reason (CWE)<br> 
 * ROL-9: Provider Type (CWE)<br> 
 * ROL-10: Organization Unit Type (CWE)<br> 
 * ROL-11: Office/Home Address/Birthplace (XAD)<br> 
 * ROL-12: Phone (XTN)<br> 
 * ROL-13: Person's Location (PL)<br> 
 * </p><p>The get...() methods return data from individual fields.  These methods 
 * do not throw exceptions and may therefore have to handle exceptions internally.  
 * If an exception is handled internally, it is logged and null is returned.  
 * This is not expected to happen - if it does happen this indicates not so much 
 * an exceptional circumstance as a bug in the code for this class.</p>    
 */
public class ROL extends AbstractSegment  {

  /**
   * Creates a ROL (Role) segment object that belongs to the given 
   * message.  
   */
  public ROL(Group parent, ModelClassFactory factory) {
    super(parent, factory);
    Message message = getMessage();
    try {
       this.add(EI.class, false, 1, 60, new Object[]{message}, "Role Instance ID");
       this.add(ID.class, true, 1, 2, new Object[]{message, new Integer(287)}, "Action Code");
       this.add(CWE.class, true, 1, 250, new Object[]{message}, "Role-ROL");
       this.add(XCN.class, true, 0, 250, new Object[]{message}, "Role Person");
       this.add(DTM.class, false, 1, 24, new Object[]{message}, "Role Begin Date/Time");
       this.add(DTM.class, false, 1, 24, new Object[]{message}, "Role End Date/Time");
       this.add(CWE.class, false, 1, 250, new Object[]{message}, "Role Duration");
       this.add(CWE.class, false, 1, 250, new Object[]{message}, "Role Action Reason");
       this.add(CWE.class, false, 0, 250, new Object[]{message}, "Provider Type");
       this.add(CWE.class, false, 1, 250, new Object[]{message}, "Organization Unit Type");
       this.add(XAD.class, false, 0, 250, new Object[]{message}, "Office/Home Address/Birthplace");
       this.add(XTN.class, false, 0, 250, new Object[]{message}, "Phone");
       this.add(PL.class, false, 1, 1230, new Object[]{message}, "Person's Location");
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Can't instantiate " + this.getClass().getName(), he);
    }
  }

  /**
   * Returns Role Instance ID (ROL-1).
   */
  public EI getRoleInstanceID()  {
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
   * Returns Role Instance ID (ROL-1).
   */
  public EI getRol1_RoleInstanceID()  {
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
   * Returns Action Code (ROL-2).
   */
  public ID getActionCode()  {
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
   * Returns Action Code (ROL-2).
   */
  public ID getRol2_ActionCode()  {
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
   * Returns Role-ROL (ROL-3).
   */
  public CWE getRoleROL()  {
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
   * Returns Role-ROL (ROL-3).
   */
  public CWE getRol3_RoleROL()  {
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
   * Returns a single repetition of Role Person (ROL-4).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XCN getRolePerson(int rep) throws HL7Exception {
    XCN ret = null;
    try {
        Type t = this.getField(4, rep);
        ret = (XCN)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Role Person (ROL-4).
   */
  public XCN[] getRolePerson() {
     XCN[] ret = null;
    try {
        Type[] t = this.getField(4);  
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
   * Returns a count of the number of repetitions of Role Person (ROL-4).
   */
  public int getRolePersonReps() {
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
   * Inserts a repetition of Role Person (ROL-4) at a given index and returns it.
   * @param index The index
   */
  public XCN insertRolePerson(int index) throws HL7Exception {
     return (XCN) super.insertRepetition(4, index);
  }

  /**
   * Removes a repetition of Role Person (ROL-4) at a given index and returns it.
   * @param index The index
   */
  public XCN removeRolePerson(int index) throws HL7Exception {
     return (XCN) super.removeRepetition(4, index);
  }

  /**
   * Returns a single repetition of Role Person (ROL-4).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XCN getRol4_RolePerson(int rep) throws HL7Exception {
    XCN ret = null;
    try {
        Type t = this.getField(4, rep);
        ret = (XCN)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Role Person (ROL-4).
   */
  public XCN[] getRol4_RolePerson() {
     XCN[] ret = null;
    try {
        Type[] t = this.getField(4);  
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
   * Returns a count of the number of repetitions of Role Person (ROL-4).
   */
  public int getRol4_RolePersonReps() {
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
   * Inserts a repetition of Role Person (ROL-4) at a given index and returns it.
   * @param index The index
   */
  public XCN insertRol4_RolePerson(int index) throws HL7Exception {
     return (XCN) super.insertRepetition(4, index);
  }

  /**
   * Removes a repetition of Role Person (ROL-4) at a given index and returns it.
   * @param index The index
   */
  public XCN removeRol4_RolePerson(int index) throws HL7Exception {
     return (XCN) super.removeRepetition(4, index);
  }

  /**
   * Returns Role Begin Date/Time (ROL-5).
   */
  public DTM getRoleBeginDateTime()  {
    DTM ret = null;
    try {
        Type t = this.getField(5, 0);
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
   * Returns Role Begin Date/Time (ROL-5).
   */
  public DTM getRol5_RoleBeginDateTime()  {
    DTM ret = null;
    try {
        Type t = this.getField(5, 0);
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
   * Returns Role End Date/Time (ROL-6).
   */
  public DTM getRoleEndDateTime()  {
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
   * Returns Role End Date/Time (ROL-6).
   */
  public DTM getRol6_RoleEndDateTime()  {
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
   * Returns Role Duration (ROL-7).
   */
  public CWE getRoleDuration()  {
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
   * Returns Role Duration (ROL-7).
   */
  public CWE getRol7_RoleDuration()  {
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
   * Returns Role Action Reason (ROL-8).
   */
  public CWE getRoleActionReason()  {
    CWE ret = null;
    try {
        Type t = this.getField(8, 0);
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
   * Returns Role Action Reason (ROL-8).
   */
  public CWE getRol8_RoleActionReason()  {
    CWE ret = null;
    try {
        Type t = this.getField(8, 0);
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
   * Returns a single repetition of Provider Type (ROL-9).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getProviderType(int rep) throws HL7Exception {
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
   * Returns all repetitions of Provider Type (ROL-9).
   */
  public CWE[] getProviderType() {
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
   * Returns a count of the number of repetitions of Provider Type (ROL-9).
   */
  public int getProviderTypeReps() {
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
   * Inserts a repetition of Provider Type (ROL-9) at a given index and returns it.
   * @param index The index
   */
  public CWE insertProviderType(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(9, index);
  }

  /**
   * Removes a repetition of Provider Type (ROL-9) at a given index and returns it.
   * @param index The index
   */
  public CWE removeProviderType(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(9, index);
  }

  /**
   * Returns a single repetition of Provider Type (ROL-9).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getRol9_ProviderType(int rep) throws HL7Exception {
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
   * Returns all repetitions of Provider Type (ROL-9).
   */
  public CWE[] getRol9_ProviderType() {
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
   * Returns a count of the number of repetitions of Provider Type (ROL-9).
   */
  public int getRol9_ProviderTypeReps() {
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
   * Inserts a repetition of Provider Type (ROL-9) at a given index and returns it.
   * @param index The index
   */
  public CWE insertRol9_ProviderType(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(9, index);
  }

  /**
   * Removes a repetition of Provider Type (ROL-9) at a given index and returns it.
   * @param index The index
   */
  public CWE removeRol9_ProviderType(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(9, index);
  }

  /**
   * Returns Organization Unit Type (ROL-10).
   */
  public CWE getOrganizationUnitType()  {
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
   * Returns Organization Unit Type (ROL-10).
   */
  public CWE getRol10_OrganizationUnitType()  {
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
   * Returns a single repetition of Office/Home Address/Birthplace (ROL-11).
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
   * Returns all repetitions of Office/Home Address/Birthplace (ROL-11).
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
   * Returns a count of the number of repetitions of Office/Home Address/Birthplace (ROL-11).
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
   * Inserts a repetition of Office/Home Address/Birthplace (ROL-11) at a given index and returns it.
   * @param index The index
   */
  public XAD insertOfficeHomeAddressBirthplace(int index) throws HL7Exception {
     return (XAD) super.insertRepetition(11, index);
  }

  /**
   * Removes a repetition of Office/Home Address/Birthplace (ROL-11) at a given index and returns it.
   * @param index The index
   */
  public XAD removeOfficeHomeAddressBirthplace(int index) throws HL7Exception {
     return (XAD) super.removeRepetition(11, index);
  }

  /**
   * Returns a single repetition of Office/Home Address/Birthplace (ROL-11).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XAD getRol11_OfficeHomeAddressBirthplace(int rep) throws HL7Exception {
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
   * Returns all repetitions of Office/Home Address/Birthplace (ROL-11).
   */
  public XAD[] getRol11_OfficeHomeAddressBirthplace() {
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
   * Returns a count of the number of repetitions of Office/Home Address/Birthplace (ROL-11).
   */
  public int getRol11_OfficeHomeAddressBirthplaceReps() {
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
   * Inserts a repetition of Office/Home Address/Birthplace (ROL-11) at a given index and returns it.
   * @param index The index
   */
  public XAD insertRol11_OfficeHomeAddressBirthplace(int index) throws HL7Exception {
     return (XAD) super.insertRepetition(11, index);
  }

  /**
   * Removes a repetition of Office/Home Address/Birthplace (ROL-11) at a given index and returns it.
   * @param index The index
   */
  public XAD removeRol11_OfficeHomeAddressBirthplace(int index) throws HL7Exception {
     return (XAD) super.removeRepetition(11, index);
  }

  /**
   * Returns a single repetition of Phone (ROL-12).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XTN getPhone(int rep) throws HL7Exception {
    XTN ret = null;
    try {
        Type t = this.getField(12, rep);
        ret = (XTN)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Phone (ROL-12).
   */
  public XTN[] getPhone() {
     XTN[] ret = null;
    try {
        Type[] t = this.getField(12);  
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
   * Returns a count of the number of repetitions of Phone (ROL-12).
   */
  public int getPhoneReps() {
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
   * Inserts a repetition of Phone (ROL-12) at a given index and returns it.
   * @param index The index
   */
  public XTN insertPhone(int index) throws HL7Exception {
     return (XTN) super.insertRepetition(12, index);
  }

  /**
   * Removes a repetition of Phone (ROL-12) at a given index and returns it.
   * @param index The index
   */
  public XTN removePhone(int index) throws HL7Exception {
     return (XTN) super.removeRepetition(12, index);
  }

  /**
   * Returns a single repetition of Phone (ROL-12).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XTN getRol12_Phone(int rep) throws HL7Exception {
    XTN ret = null;
    try {
        Type t = this.getField(12, rep);
        ret = (XTN)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Phone (ROL-12).
   */
  public XTN[] getRol12_Phone() {
     XTN[] ret = null;
    try {
        Type[] t = this.getField(12);  
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
   * Returns a count of the number of repetitions of Phone (ROL-12).
   */
  public int getRol12_PhoneReps() {
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
   * Inserts a repetition of Phone (ROL-12) at a given index and returns it.
   * @param index The index
   */
  public XTN insertRol12_Phone(int index) throws HL7Exception {
     return (XTN) super.insertRepetition(12, index);
  }

  /**
   * Removes a repetition of Phone (ROL-12) at a given index and returns it.
   * @param index The index
   */
  public XTN removeRol12_Phone(int index) throws HL7Exception {
     return (XTN) super.removeRepetition(12, index);
  }

  /**
   * Returns Person's Location (ROL-13).
   */
  public PL getPersonSLocation()  {
    PL ret = null;
    try {
        Type t = this.getField(13, 0);
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
   * Returns Person's Location (ROL-13).
   */
  public PL getRol13_PersonSLocation()  {
    PL ret = null;
    try {
        Type t = this.getField(13, 0);
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

   protected Type createNewTypeWithoutReflection(int field) {
      switch (field) {
         case 0: return new ca.uhn.hl7v2.model.v26.datatype.EI(getMessage());
         case 1: return new ca.uhn.hl7v2.model.v26.datatype.ID(getMessage(), new Integer(287));
         case 2: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 3: return new ca.uhn.hl7v2.model.v26.datatype.XCN(getMessage());
         case 4: return new ca.uhn.hl7v2.model.v26.datatype.DTM(getMessage());
         case 5: return new ca.uhn.hl7v2.model.v26.datatype.DTM(getMessage());
         case 6: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 7: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 8: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 9: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 10: return new ca.uhn.hl7v2.model.v26.datatype.XAD(getMessage());
         case 11: return new ca.uhn.hl7v2.model.v26.datatype.XTN(getMessage());
         case 12: return new ca.uhn.hl7v2.model.v26.datatype.PL(getMessage());
         default: return null;
      }
   }

}