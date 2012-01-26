package ca.uhn.hl7v2.model.v26.segment;

import ca.uhn.hl7v2.model.*;
import ca.uhn.hl7v2.model.v26.datatype.*;
import ca.uhn.log.HapiLogFactory;
import ca.uhn.hl7v2.parser.ModelClassFactory;
import ca.uhn.hl7v2.HL7Exception;

/**
 * <p>Represents an HL7 PRA message segment. 
 * This segment has the following fields:</p><p>
 * PRA-1: Primary Key Value - PRA (CWE)<br> 
 * PRA-2: Practitioner Group (CWE)<br> 
 * PRA-3: Practitioner Category (IS)<br> 
 * PRA-4: Provider Billing (ID)<br> 
 * PRA-5: Specialty (SPD)<br> 
 * PRA-6: Practitioner ID Numbers (PLN)<br> 
 * PRA-7: Privileges (PIP)<br> 
 * PRA-8: Date Entered Practice (DT)<br> 
 * PRA-9: Institution (CWE)<br> 
 * PRA-10: Date Left Practice (DT)<br> 
 * PRA-11: Government Reimbursement Billing Eligibility (CWE)<br> 
 * PRA-12: Set ID - PRA (SI)<br> 
 * </p><p>The get...() methods return data from individual fields.  These methods 
 * do not throw exceptions and may therefore have to handle exceptions internally.  
 * If an exception is handled internally, it is logged and null is returned.  
 * This is not expected to happen - if it does happen this indicates not so much 
 * an exceptional circumstance as a bug in the code for this class.</p>    
 */
public class PRA extends AbstractSegment  {

  /**
   * Creates a PRA (Practitioner Detail) segment object that belongs to the given 
   * message.  
   */
  public PRA(Group parent, ModelClassFactory factory) {
    super(parent, factory);
    Message message = getMessage();
    try {
       this.add(CWE.class, false, 1, 250, new Object[]{message}, "Primary Key Value - PRA");
       this.add(CWE.class, false, 0, 250, new Object[]{message}, "Practitioner Group");
       this.add(IS.class, false, 0, 3, new Object[]{message, new Integer(186)}, "Practitioner Category");
       this.add(ID.class, false, 1, 1, new Object[]{message, new Integer(187)}, "Provider Billing");
       this.add(SPD.class, false, 0, 112, new Object[]{message}, "Specialty");
       this.add(PLN.class, false, 0, 0, new Object[]{message}, "Practitioner ID Numbers");
       this.add(PIP.class, false, 0, 770, new Object[]{message}, "Privileges");
       this.add(DT.class, false, 1, 8, new Object[]{message}, "Date Entered Practice");
       this.add(CWE.class, false, 1, 250, new Object[]{message}, "Institution");
       this.add(DT.class, false, 1, 8, new Object[]{message}, "Date Left Practice");
       this.add(CWE.class, false, 0, 250, new Object[]{message}, "Government Reimbursement Billing Eligibility");
       this.add(SI.class, false, 1, 60, new Object[]{message}, "Set ID - PRA");
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Can't instantiate " + this.getClass().getName(), he);
    }
  }

  /**
   * Returns Primary Key Value - PRA (PRA-1).
   */
  public CWE getPrimaryKeyValuePRA()  {
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
   * Returns Primary Key Value - PRA (PRA-1).
   */
  public CWE getPra1_PrimaryKeyValuePRA()  {
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
   * Returns a single repetition of Practitioner Group (PRA-2).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getPractitionerGroup(int rep) throws HL7Exception {
    CWE ret = null;
    try {
        Type t = this.getField(2, rep);
        ret = (CWE)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Practitioner Group (PRA-2).
   */
  public CWE[] getPractitionerGroup() {
     CWE[] ret = null;
    try {
        Type[] t = this.getField(2);  
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
   * Returns a count of the number of repetitions of Practitioner Group (PRA-2).
   */
  public int getPractitionerGroupReps() {
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
   * Inserts a repetition of Practitioner Group (PRA-2) at a given index and returns it.
   * @param index The index
   */
  public CWE insertPractitionerGroup(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(2, index);
  }

  /**
   * Removes a repetition of Practitioner Group (PRA-2) at a given index and returns it.
   * @param index The index
   */
  public CWE removePractitionerGroup(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(2, index);
  }

  /**
   * Returns a single repetition of Practitioner Group (PRA-2).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getPra2_PractitionerGroup(int rep) throws HL7Exception {
    CWE ret = null;
    try {
        Type t = this.getField(2, rep);
        ret = (CWE)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Practitioner Group (PRA-2).
   */
  public CWE[] getPra2_PractitionerGroup() {
     CWE[] ret = null;
    try {
        Type[] t = this.getField(2);  
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
   * Returns a count of the number of repetitions of Practitioner Group (PRA-2).
   */
  public int getPra2_PractitionerGroupReps() {
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
   * Inserts a repetition of Practitioner Group (PRA-2) at a given index and returns it.
   * @param index The index
   */
  public CWE insertPra2_PractitionerGroup(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(2, index);
  }

  /**
   * Removes a repetition of Practitioner Group (PRA-2) at a given index and returns it.
   * @param index The index
   */
  public CWE removePra2_PractitionerGroup(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(2, index);
  }

  /**
   * Returns a single repetition of Practitioner Category (PRA-3).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public IS getPractitionerCategory(int rep) throws HL7Exception {
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
   * Returns all repetitions of Practitioner Category (PRA-3).
   */
  public IS[] getPractitionerCategory() {
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
   * Returns a count of the number of repetitions of Practitioner Category (PRA-3).
   */
  public int getPractitionerCategoryReps() {
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
   * Inserts a repetition of Practitioner Category (PRA-3) at a given index and returns it.
   * @param index The index
   */
  public IS insertPractitionerCategory(int index) throws HL7Exception {
     return (IS) super.insertRepetition(3, index);
  }

  /**
   * Removes a repetition of Practitioner Category (PRA-3) at a given index and returns it.
   * @param index The index
   */
  public IS removePractitionerCategory(int index) throws HL7Exception {
     return (IS) super.removeRepetition(3, index);
  }

  /**
   * Returns a single repetition of Practitioner Category (PRA-3).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public IS getPra3_PractitionerCategory(int rep) throws HL7Exception {
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
   * Returns all repetitions of Practitioner Category (PRA-3).
   */
  public IS[] getPra3_PractitionerCategory() {
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
   * Returns a count of the number of repetitions of Practitioner Category (PRA-3).
   */
  public int getPra3_PractitionerCategoryReps() {
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
   * Inserts a repetition of Practitioner Category (PRA-3) at a given index and returns it.
   * @param index The index
   */
  public IS insertPra3_PractitionerCategory(int index) throws HL7Exception {
     return (IS) super.insertRepetition(3, index);
  }

  /**
   * Removes a repetition of Practitioner Category (PRA-3) at a given index and returns it.
   * @param index The index
   */
  public IS removePra3_PractitionerCategory(int index) throws HL7Exception {
     return (IS) super.removeRepetition(3, index);
  }

  /**
   * Returns Provider Billing (PRA-4).
   */
  public ID getProviderBilling()  {
    ID ret = null;
    try {
        Type t = this.getField(4, 0);
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
   * Returns Provider Billing (PRA-4).
   */
  public ID getPra4_ProviderBilling()  {
    ID ret = null;
    try {
        Type t = this.getField(4, 0);
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
   * Returns a single repetition of Specialty (PRA-5).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public SPD getSpecialty(int rep) throws HL7Exception {
    SPD ret = null;
    try {
        Type t = this.getField(5, rep);
        ret = (SPD)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Specialty (PRA-5).
   */
  public SPD[] getSpecialty() {
     SPD[] ret = null;
    try {
        Type[] t = this.getField(5);  
        ret = new SPD[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (SPD)t[i];
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
   * Returns a count of the number of repetitions of Specialty (PRA-5).
   */
  public int getSpecialtyReps() {
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
   * Inserts a repetition of Specialty (PRA-5) at a given index and returns it.
   * @param index The index
   */
  public SPD insertSpecialty(int index) throws HL7Exception {
     return (SPD) super.insertRepetition(5, index);
  }

  /**
   * Removes a repetition of Specialty (PRA-5) at a given index and returns it.
   * @param index The index
   */
  public SPD removeSpecialty(int index) throws HL7Exception {
     return (SPD) super.removeRepetition(5, index);
  }

  /**
   * Returns a single repetition of Specialty (PRA-5).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public SPD getPra5_Specialty(int rep) throws HL7Exception {
    SPD ret = null;
    try {
        Type t = this.getField(5, rep);
        ret = (SPD)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Specialty (PRA-5).
   */
  public SPD[] getPra5_Specialty() {
     SPD[] ret = null;
    try {
        Type[] t = this.getField(5);  
        ret = new SPD[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (SPD)t[i];
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
   * Returns a count of the number of repetitions of Specialty (PRA-5).
   */
  public int getPra5_SpecialtyReps() {
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
   * Inserts a repetition of Specialty (PRA-5) at a given index and returns it.
   * @param index The index
   */
  public SPD insertPra5_Specialty(int index) throws HL7Exception {
     return (SPD) super.insertRepetition(5, index);
  }

  /**
   * Removes a repetition of Specialty (PRA-5) at a given index and returns it.
   * @param index The index
   */
  public SPD removePra5_Specialty(int index) throws HL7Exception {
     return (SPD) super.removeRepetition(5, index);
  }

  /**
   * Returns a single repetition of Practitioner ID Numbers (PRA-6).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public PLN getPractitionerIDNumbers(int rep) throws HL7Exception {
    PLN ret = null;
    try {
        Type t = this.getField(6, rep);
        ret = (PLN)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Practitioner ID Numbers (PRA-6).
   */
  public PLN[] getPractitionerIDNumbers() {
     PLN[] ret = null;
    try {
        Type[] t = this.getField(6);  
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
   * Returns a count of the number of repetitions of Practitioner ID Numbers (PRA-6).
   */
  public int getPractitionerIDNumbersReps() {
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
   * Inserts a repetition of Practitioner ID Numbers (PRA-6) at a given index and returns it.
   * @param index The index
   */
  public PLN insertPractitionerIDNumbers(int index) throws HL7Exception {
     return (PLN) super.insertRepetition(6, index);
  }

  /**
   * Removes a repetition of Practitioner ID Numbers (PRA-6) at a given index and returns it.
   * @param index The index
   */
  public PLN removePractitionerIDNumbers(int index) throws HL7Exception {
     return (PLN) super.removeRepetition(6, index);
  }

  /**
   * Returns a single repetition of Practitioner ID Numbers (PRA-6).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public PLN getPra6_PractitionerIDNumbers(int rep) throws HL7Exception {
    PLN ret = null;
    try {
        Type t = this.getField(6, rep);
        ret = (PLN)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Practitioner ID Numbers (PRA-6).
   */
  public PLN[] getPra6_PractitionerIDNumbers() {
     PLN[] ret = null;
    try {
        Type[] t = this.getField(6);  
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
   * Returns a count of the number of repetitions of Practitioner ID Numbers (PRA-6).
   */
  public int getPra6_PractitionerIDNumbersReps() {
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
   * Inserts a repetition of Practitioner ID Numbers (PRA-6) at a given index and returns it.
   * @param index The index
   */
  public PLN insertPra6_PractitionerIDNumbers(int index) throws HL7Exception {
     return (PLN) super.insertRepetition(6, index);
  }

  /**
   * Removes a repetition of Practitioner ID Numbers (PRA-6) at a given index and returns it.
   * @param index The index
   */
  public PLN removePra6_PractitionerIDNumbers(int index) throws HL7Exception {
     return (PLN) super.removeRepetition(6, index);
  }

  /**
   * Returns a single repetition of Privileges (PRA-7).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public PIP getPrivileges(int rep) throws HL7Exception {
    PIP ret = null;
    try {
        Type t = this.getField(7, rep);
        ret = (PIP)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Privileges (PRA-7).
   */
  public PIP[] getPrivileges() {
     PIP[] ret = null;
    try {
        Type[] t = this.getField(7);  
        ret = new PIP[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (PIP)t[i];
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
   * Returns a count of the number of repetitions of Privileges (PRA-7).
   */
  public int getPrivilegesReps() {
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
   * Inserts a repetition of Privileges (PRA-7) at a given index and returns it.
   * @param index The index
   */
  public PIP insertPrivileges(int index) throws HL7Exception {
     return (PIP) super.insertRepetition(7, index);
  }

  /**
   * Removes a repetition of Privileges (PRA-7) at a given index and returns it.
   * @param index The index
   */
  public PIP removePrivileges(int index) throws HL7Exception {
     return (PIP) super.removeRepetition(7, index);
  }

  /**
   * Returns a single repetition of Privileges (PRA-7).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public PIP getPra7_Privileges(int rep) throws HL7Exception {
    PIP ret = null;
    try {
        Type t = this.getField(7, rep);
        ret = (PIP)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Privileges (PRA-7).
   */
  public PIP[] getPra7_Privileges() {
     PIP[] ret = null;
    try {
        Type[] t = this.getField(7);  
        ret = new PIP[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (PIP)t[i];
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
   * Returns a count of the number of repetitions of Privileges (PRA-7).
   */
  public int getPra7_PrivilegesReps() {
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
   * Inserts a repetition of Privileges (PRA-7) at a given index and returns it.
   * @param index The index
   */
  public PIP insertPra7_Privileges(int index) throws HL7Exception {
     return (PIP) super.insertRepetition(7, index);
  }

  /**
   * Removes a repetition of Privileges (PRA-7) at a given index and returns it.
   * @param index The index
   */
  public PIP removePra7_Privileges(int index) throws HL7Exception {
     return (PIP) super.removeRepetition(7, index);
  }

  /**
   * Returns Date Entered Practice (PRA-8).
   */
  public DT getDateEnteredPractice()  {
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
   * Returns Date Entered Practice (PRA-8).
   */
  public DT getPra8_DateEnteredPractice()  {
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
   * Returns Institution (PRA-9).
   */
  public CWE getInstitution()  {
    CWE ret = null;
    try {
        Type t = this.getField(9, 0);
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
   * Returns Institution (PRA-9).
   */
  public CWE getPra9_Institution()  {
    CWE ret = null;
    try {
        Type t = this.getField(9, 0);
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
   * Returns Date Left Practice (PRA-10).
   */
  public DT getDateLeftPractice()  {
    DT ret = null;
    try {
        Type t = this.getField(10, 0);
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
   * Returns Date Left Practice (PRA-10).
   */
  public DT getPra10_DateLeftPractice()  {
    DT ret = null;
    try {
        Type t = this.getField(10, 0);
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
   * Returns a single repetition of Government Reimbursement Billing Eligibility (PRA-11).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getGovernmentReimbursementBillingEligibility(int rep) throws HL7Exception {
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
   * Returns all repetitions of Government Reimbursement Billing Eligibility (PRA-11).
   */
  public CWE[] getGovernmentReimbursementBillingEligibility() {
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
   * Returns a count of the number of repetitions of Government Reimbursement Billing Eligibility (PRA-11).
   */
  public int getGovernmentReimbursementBillingEligibilityReps() {
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
   * Inserts a repetition of Government Reimbursement Billing Eligibility (PRA-11) at a given index and returns it.
   * @param index The index
   */
  public CWE insertGovernmentReimbursementBillingEligibility(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(11, index);
  }

  /**
   * Removes a repetition of Government Reimbursement Billing Eligibility (PRA-11) at a given index and returns it.
   * @param index The index
   */
  public CWE removeGovernmentReimbursementBillingEligibility(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(11, index);
  }

  /**
   * Returns a single repetition of Government Reimbursement Billing Eligibility (PRA-11).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getPra11_GovernmentReimbursementBillingEligibility(int rep) throws HL7Exception {
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
   * Returns all repetitions of Government Reimbursement Billing Eligibility (PRA-11).
   */
  public CWE[] getPra11_GovernmentReimbursementBillingEligibility() {
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
   * Returns a count of the number of repetitions of Government Reimbursement Billing Eligibility (PRA-11).
   */
  public int getPra11_GovernmentReimbursementBillingEligibilityReps() {
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
   * Inserts a repetition of Government Reimbursement Billing Eligibility (PRA-11) at a given index and returns it.
   * @param index The index
   */
  public CWE insertPra11_GovernmentReimbursementBillingEligibility(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(11, index);
  }

  /**
   * Removes a repetition of Government Reimbursement Billing Eligibility (PRA-11) at a given index and returns it.
   * @param index The index
   */
  public CWE removePra11_GovernmentReimbursementBillingEligibility(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(11, index);
  }

  /**
   * Returns Set ID - PRA (PRA-12).
   */
  public SI getSetIDPRA()  {
    SI ret = null;
    try {
        Type t = this.getField(12, 0);
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
   * Returns Set ID - PRA (PRA-12).
   */
  public SI getPra12_SetIDPRA()  {
    SI ret = null;
    try {
        Type t = this.getField(12, 0);
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

   protected Type createNewTypeWithoutReflection(int field) {
      switch (field) {
         case 0: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 1: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 2: return new ca.uhn.hl7v2.model.v26.datatype.IS(getMessage(), new Integer(186));
         case 3: return new ca.uhn.hl7v2.model.v26.datatype.ID(getMessage(), new Integer(187));
         case 4: return new ca.uhn.hl7v2.model.v26.datatype.SPD(getMessage());
         case 5: return new ca.uhn.hl7v2.model.v26.datatype.PLN(getMessage());
         case 6: return new ca.uhn.hl7v2.model.v26.datatype.PIP(getMessage());
         case 7: return new ca.uhn.hl7v2.model.v26.datatype.DT(getMessage());
         case 8: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 9: return new ca.uhn.hl7v2.model.v26.datatype.DT(getMessage());
         case 10: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 11: return new ca.uhn.hl7v2.model.v26.datatype.SI(getMessage());
         default: return null;
      }
   }

}