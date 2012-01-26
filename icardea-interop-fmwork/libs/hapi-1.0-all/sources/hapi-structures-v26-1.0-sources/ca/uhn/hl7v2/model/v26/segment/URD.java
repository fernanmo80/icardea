package ca.uhn.hl7v2.model.v26.segment;

import ca.uhn.hl7v2.model.*;
import ca.uhn.hl7v2.model.v26.datatype.*;
import ca.uhn.log.HapiLogFactory;
import ca.uhn.hl7v2.parser.ModelClassFactory;
import ca.uhn.hl7v2.HL7Exception;

/**
 * <p>Represents an HL7 URD message segment. 
 * This segment has the following fields:</p><p>
 * URD-1: R/U Date/Time (DTM)<br> 
 * URD-2: Report Priority (ID)<br> 
 * URD-3: R/U Who Subject Definition (XCN)<br> 
 * URD-4: R/U What Subject Definition (CWE)<br> 
 * URD-5: R/U What Department Code (CWE)<br> 
 * URD-6: R/U Display/Print Locations (ST)<br> 
 * URD-7: R/U Results Level (ID)<br> 
 * </p><p>The get...() methods return data from individual fields.  These methods 
 * do not throw exceptions and may therefore have to handle exceptions internally.  
 * If an exception is handled internally, it is logged and null is returned.  
 * This is not expected to happen - if it does happen this indicates not so much 
 * an exceptional circumstance as a bug in the code for this class.</p>    
 */
public class URD extends AbstractSegment  {

  /**
   * Creates a URD (Results/update Definition) segment object that belongs to the given 
   * message.  
   */
  public URD(Group parent, ModelClassFactory factory) {
    super(parent, factory);
    Message message = getMessage();
    try {
       this.add(DTM.class, false, 1, 24, new Object[]{message}, "R/U Date/Time");
       this.add(ID.class, false, 1, 1, new Object[]{message, new Integer(109)}, "Report Priority");
       this.add(XCN.class, true, 0, 250, new Object[]{message}, "R/U Who Subject Definition");
       this.add(CWE.class, false, 0, 250, new Object[]{message}, "R/U What Subject Definition");
       this.add(CWE.class, false, 0, 250, new Object[]{message}, "R/U What Department Code");
       this.add(ST.class, false, 0, 20, new Object[]{message}, "R/U Display/Print Locations");
       this.add(ID.class, false, 1, 1, new Object[]{message, new Integer(108)}, "R/U Results Level");
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Can't instantiate " + this.getClass().getName(), he);
    }
  }

  /**
   * Returns R/U Date/Time (URD-1).
   */
  public DTM getRUDateTime()  {
    DTM ret = null;
    try {
        Type t = this.getField(1, 0);
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
   * Returns R/U Date/Time (URD-1).
   */
  public DTM getUrd1_RUDateTime()  {
    DTM ret = null;
    try {
        Type t = this.getField(1, 0);
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
   * Returns Report Priority (URD-2).
   */
  public ID getReportPriority()  {
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
   * Returns Report Priority (URD-2).
   */
  public ID getUrd2_ReportPriority()  {
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
   * Returns a single repetition of R/U Who Subject Definition (URD-3).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XCN getRUWhoSubjectDefinition(int rep) throws HL7Exception {
    XCN ret = null;
    try {
        Type t = this.getField(3, rep);
        ret = (XCN)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of R/U Who Subject Definition (URD-3).
   */
  public XCN[] getRUWhoSubjectDefinition() {
     XCN[] ret = null;
    try {
        Type[] t = this.getField(3);  
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
   * Returns a count of the number of repetitions of R/U Who Subject Definition (URD-3).
   */
  public int getRUWhoSubjectDefinitionReps() {
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
   * Inserts a repetition of R/U Who Subject Definition (URD-3) at a given index and returns it.
   * @param index The index
   */
  public XCN insertRUWhoSubjectDefinition(int index) throws HL7Exception {
     return (XCN) super.insertRepetition(3, index);
  }

  /**
   * Removes a repetition of R/U Who Subject Definition (URD-3) at a given index and returns it.
   * @param index The index
   */
  public XCN removeRUWhoSubjectDefinition(int index) throws HL7Exception {
     return (XCN) super.removeRepetition(3, index);
  }

  /**
   * Returns a single repetition of R/U Who Subject Definition (URD-3).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XCN getUrd3_RUWhoSubjectDefinition(int rep) throws HL7Exception {
    XCN ret = null;
    try {
        Type t = this.getField(3, rep);
        ret = (XCN)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of R/U Who Subject Definition (URD-3).
   */
  public XCN[] getUrd3_RUWhoSubjectDefinition() {
     XCN[] ret = null;
    try {
        Type[] t = this.getField(3);  
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
   * Returns a count of the number of repetitions of R/U Who Subject Definition (URD-3).
   */
  public int getUrd3_RUWhoSubjectDefinitionReps() {
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
   * Inserts a repetition of R/U Who Subject Definition (URD-3) at a given index and returns it.
   * @param index The index
   */
  public XCN insertUrd3_RUWhoSubjectDefinition(int index) throws HL7Exception {
     return (XCN) super.insertRepetition(3, index);
  }

  /**
   * Removes a repetition of R/U Who Subject Definition (URD-3) at a given index and returns it.
   * @param index The index
   */
  public XCN removeUrd3_RUWhoSubjectDefinition(int index) throws HL7Exception {
     return (XCN) super.removeRepetition(3, index);
  }

  /**
   * Returns a single repetition of R/U What Subject Definition (URD-4).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getRUWhatSubjectDefinition(int rep) throws HL7Exception {
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
   * Returns all repetitions of R/U What Subject Definition (URD-4).
   */
  public CWE[] getRUWhatSubjectDefinition() {
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
   * Returns a count of the number of repetitions of R/U What Subject Definition (URD-4).
   */
  public int getRUWhatSubjectDefinitionReps() {
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
   * Inserts a repetition of R/U What Subject Definition (URD-4) at a given index and returns it.
   * @param index The index
   */
  public CWE insertRUWhatSubjectDefinition(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(4, index);
  }

  /**
   * Removes a repetition of R/U What Subject Definition (URD-4) at a given index and returns it.
   * @param index The index
   */
  public CWE removeRUWhatSubjectDefinition(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(4, index);
  }

  /**
   * Returns a single repetition of R/U What Subject Definition (URD-4).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getUrd4_RUWhatSubjectDefinition(int rep) throws HL7Exception {
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
   * Returns all repetitions of R/U What Subject Definition (URD-4).
   */
  public CWE[] getUrd4_RUWhatSubjectDefinition() {
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
   * Returns a count of the number of repetitions of R/U What Subject Definition (URD-4).
   */
  public int getUrd4_RUWhatSubjectDefinitionReps() {
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
   * Inserts a repetition of R/U What Subject Definition (URD-4) at a given index and returns it.
   * @param index The index
   */
  public CWE insertUrd4_RUWhatSubjectDefinition(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(4, index);
  }

  /**
   * Removes a repetition of R/U What Subject Definition (URD-4) at a given index and returns it.
   * @param index The index
   */
  public CWE removeUrd4_RUWhatSubjectDefinition(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(4, index);
  }

  /**
   * Returns a single repetition of R/U What Department Code (URD-5).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getRUWhatDepartmentCode(int rep) throws HL7Exception {
    CWE ret = null;
    try {
        Type t = this.getField(5, rep);
        ret = (CWE)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of R/U What Department Code (URD-5).
   */
  public CWE[] getRUWhatDepartmentCode() {
     CWE[] ret = null;
    try {
        Type[] t = this.getField(5);  
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
   * Returns a count of the number of repetitions of R/U What Department Code (URD-5).
   */
  public int getRUWhatDepartmentCodeReps() {
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
   * Inserts a repetition of R/U What Department Code (URD-5) at a given index and returns it.
   * @param index The index
   */
  public CWE insertRUWhatDepartmentCode(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(5, index);
  }

  /**
   * Removes a repetition of R/U What Department Code (URD-5) at a given index and returns it.
   * @param index The index
   */
  public CWE removeRUWhatDepartmentCode(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(5, index);
  }

  /**
   * Returns a single repetition of R/U What Department Code (URD-5).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getUrd5_RUWhatDepartmentCode(int rep) throws HL7Exception {
    CWE ret = null;
    try {
        Type t = this.getField(5, rep);
        ret = (CWE)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of R/U What Department Code (URD-5).
   */
  public CWE[] getUrd5_RUWhatDepartmentCode() {
     CWE[] ret = null;
    try {
        Type[] t = this.getField(5);  
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
   * Returns a count of the number of repetitions of R/U What Department Code (URD-5).
   */
  public int getUrd5_RUWhatDepartmentCodeReps() {
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
   * Inserts a repetition of R/U What Department Code (URD-5) at a given index and returns it.
   * @param index The index
   */
  public CWE insertUrd5_RUWhatDepartmentCode(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(5, index);
  }

  /**
   * Removes a repetition of R/U What Department Code (URD-5) at a given index and returns it.
   * @param index The index
   */
  public CWE removeUrd5_RUWhatDepartmentCode(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(5, index);
  }

  /**
   * Returns a single repetition of R/U Display/Print Locations (URD-6).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public ST getRUDisplayPrintLocations(int rep) throws HL7Exception {
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
   * Returns all repetitions of R/U Display/Print Locations (URD-6).
   */
  public ST[] getRUDisplayPrintLocations() {
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
   * Returns a count of the number of repetitions of R/U Display/Print Locations (URD-6).
   */
  public int getRUDisplayPrintLocationsReps() {
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
   * Inserts a repetition of R/U Display/Print Locations (URD-6) at a given index and returns it.
   * @param index The index
   */
  public ST insertRUDisplayPrintLocations(int index) throws HL7Exception {
     return (ST) super.insertRepetition(6, index);
  }

  /**
   * Removes a repetition of R/U Display/Print Locations (URD-6) at a given index and returns it.
   * @param index The index
   */
  public ST removeRUDisplayPrintLocations(int index) throws HL7Exception {
     return (ST) super.removeRepetition(6, index);
  }

  /**
   * Returns a single repetition of R/U Display/Print Locations (URD-6).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public ST getUrd6_RUDisplayPrintLocations(int rep) throws HL7Exception {
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
   * Returns all repetitions of R/U Display/Print Locations (URD-6).
   */
  public ST[] getUrd6_RUDisplayPrintLocations() {
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
   * Returns a count of the number of repetitions of R/U Display/Print Locations (URD-6).
   */
  public int getUrd6_RUDisplayPrintLocationsReps() {
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
   * Inserts a repetition of R/U Display/Print Locations (URD-6) at a given index and returns it.
   * @param index The index
   */
  public ST insertUrd6_RUDisplayPrintLocations(int index) throws HL7Exception {
     return (ST) super.insertRepetition(6, index);
  }

  /**
   * Removes a repetition of R/U Display/Print Locations (URD-6) at a given index and returns it.
   * @param index The index
   */
  public ST removeUrd6_RUDisplayPrintLocations(int index) throws HL7Exception {
     return (ST) super.removeRepetition(6, index);
  }

  /**
   * Returns R/U Results Level (URD-7).
   */
  public ID getRUResultsLevel()  {
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
   * Returns R/U Results Level (URD-7).
   */
  public ID getUrd7_RUResultsLevel()  {
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

   protected Type createNewTypeWithoutReflection(int field) {
      switch (field) {
         case 0: return new ca.uhn.hl7v2.model.v26.datatype.DTM(getMessage());
         case 1: return new ca.uhn.hl7v2.model.v26.datatype.ID(getMessage(), new Integer(109));
         case 2: return new ca.uhn.hl7v2.model.v26.datatype.XCN(getMessage());
         case 3: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 4: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 5: return new ca.uhn.hl7v2.model.v26.datatype.ST(getMessage());
         case 6: return new ca.uhn.hl7v2.model.v26.datatype.ID(getMessage(), new Integer(108));
         default: return null;
      }
   }

}