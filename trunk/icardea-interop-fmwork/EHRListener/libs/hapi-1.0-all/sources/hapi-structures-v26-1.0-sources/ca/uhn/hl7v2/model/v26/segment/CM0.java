package ca.uhn.hl7v2.model.v26.segment;

import ca.uhn.hl7v2.model.*;
import ca.uhn.hl7v2.model.v26.datatype.*;
import ca.uhn.log.HapiLogFactory;
import ca.uhn.hl7v2.parser.ModelClassFactory;
import ca.uhn.hl7v2.HL7Exception;

/**
 * <p>Represents an HL7 CM0 message segment. 
 * This segment has the following fields:</p><p>
 * CM0-1: Set ID - CM0 (SI)<br> 
 * CM0-2: Sponsor Study ID (EI)<br> 
 * CM0-3: Alternate Study ID (EI)<br> 
 * CM0-4: Title of Study (ST)<br> 
 * CM0-5: Chairman of Study (XCN)<br> 
 * CM0-6: Last IRB Approval Date (DT)<br> 
 * CM0-7: Total Accrual to Date (NM)<br> 
 * CM0-8: Last Accrual Date (DT)<br> 
 * CM0-9: Contact for Study (XCN)<br> 
 * CM0-10: Contact's Telephone Number (XTN)<br> 
 * CM0-11: Contact's Address (XAD)<br> 
 * </p><p>The get...() methods return data from individual fields.  These methods 
 * do not throw exceptions and may therefore have to handle exceptions internally.  
 * If an exception is handled internally, it is logged and null is returned.  
 * This is not expected to happen - if it does happen this indicates not so much 
 * an exceptional circumstance as a bug in the code for this class.</p>    
 */
public class CM0 extends AbstractSegment  {

  /**
   * Creates a CM0 (Clinical Study Master) segment object that belongs to the given 
   * message.  
   */
  public CM0(Group parent, ModelClassFactory factory) {
    super(parent, factory);
    Message message = getMessage();
    try {
       this.add(SI.class, false, 1, 4, new Object[]{message}, "Set ID - CM0");
       this.add(EI.class, true, 1, 427, new Object[]{message}, "Sponsor Study ID");
       this.add(EI.class, false, 3, 427, new Object[]{message}, "Alternate Study ID");
       this.add(ST.class, true, 1, 300, new Object[]{message}, "Title of Study");
       this.add(XCN.class, false, 0, 250, new Object[]{message}, "Chairman of Study");
       this.add(DT.class, false, 1, 8, new Object[]{message}, "Last IRB Approval Date");
       this.add(NM.class, false, 1, 8, new Object[]{message}, "Total Accrual to Date");
       this.add(DT.class, false, 1, 8, new Object[]{message}, "Last Accrual Date");
       this.add(XCN.class, false, 0, 250, new Object[]{message}, "Contact for Study");
       this.add(XTN.class, false, 1, 250, new Object[]{message}, "Contact's Telephone Number");
       this.add(XAD.class, false, 0, 250, new Object[]{message}, "Contact's Address");
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Can't instantiate " + this.getClass().getName(), he);
    }
  }

  /**
   * Returns Set ID - CM0 (CM0-1).
   */
  public SI getSetIDCM0()  {
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
   * Returns Set ID - CM0 (CM0-1).
   */
  public SI getCm01_SetIDCM0()  {
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
   * Returns Sponsor Study ID (CM0-2).
   */
  public EI getSponsorStudyID()  {
    EI ret = null;
    try {
        Type t = this.getField(2, 0);
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
   * Returns Sponsor Study ID (CM0-2).
   */
  public EI getCm02_SponsorStudyID()  {
    EI ret = null;
    try {
        Type t = this.getField(2, 0);
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
   * Returns a single repetition of Alternate Study ID (CM0-3).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public EI getAlternateStudyID(int rep) throws HL7Exception {
    EI ret = null;
    try {
        Type t = this.getField(3, rep);
        ret = (EI)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Alternate Study ID (CM0-3).
   */
  public EI[] getAlternateStudyID() {
     EI[] ret = null;
    try {
        Type[] t = this.getField(3);  
        ret = new EI[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (EI)t[i];
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
   * Returns a count of the number of repetitions of Alternate Study ID (CM0-3).
   */
  public int getAlternateStudyIDReps() {
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
   * Inserts a repetition of Alternate Study ID (CM0-3) at a given index and returns it.
   * @param index The index
   */
  public EI insertAlternateStudyID(int index) throws HL7Exception {
     return (EI) super.insertRepetition(3, index);
  }

  /**
   * Removes a repetition of Alternate Study ID (CM0-3) at a given index and returns it.
   * @param index The index
   */
  public EI removeAlternateStudyID(int index) throws HL7Exception {
     return (EI) super.removeRepetition(3, index);
  }

  /**
   * Returns a single repetition of Alternate Study ID (CM0-3).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public EI getCm03_AlternateStudyID(int rep) throws HL7Exception {
    EI ret = null;
    try {
        Type t = this.getField(3, rep);
        ret = (EI)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Alternate Study ID (CM0-3).
   */
  public EI[] getCm03_AlternateStudyID() {
     EI[] ret = null;
    try {
        Type[] t = this.getField(3);  
        ret = new EI[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (EI)t[i];
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
   * Returns a count of the number of repetitions of Alternate Study ID (CM0-3).
   */
  public int getCm03_AlternateStudyIDReps() {
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
   * Inserts a repetition of Alternate Study ID (CM0-3) at a given index and returns it.
   * @param index The index
   */
  public EI insertCm03_AlternateStudyID(int index) throws HL7Exception {
     return (EI) super.insertRepetition(3, index);
  }

  /**
   * Removes a repetition of Alternate Study ID (CM0-3) at a given index and returns it.
   * @param index The index
   */
  public EI removeCm03_AlternateStudyID(int index) throws HL7Exception {
     return (EI) super.removeRepetition(3, index);
  }

  /**
   * Returns Title of Study (CM0-4).
   */
  public ST getTitleOfStudy()  {
    ST ret = null;
    try {
        Type t = this.getField(4, 0);
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
   * Returns Title of Study (CM0-4).
   */
  public ST getCm04_TitleOfStudy()  {
    ST ret = null;
    try {
        Type t = this.getField(4, 0);
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
   * Returns a single repetition of Chairman of Study (CM0-5).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XCN getChairmanOfStudy(int rep) throws HL7Exception {
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
   * Returns all repetitions of Chairman of Study (CM0-5).
   */
  public XCN[] getChairmanOfStudy() {
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
   * Returns a count of the number of repetitions of Chairman of Study (CM0-5).
   */
  public int getChairmanOfStudyReps() {
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
   * Inserts a repetition of Chairman of Study (CM0-5) at a given index and returns it.
   * @param index The index
   */
  public XCN insertChairmanOfStudy(int index) throws HL7Exception {
     return (XCN) super.insertRepetition(5, index);
  }

  /**
   * Removes a repetition of Chairman of Study (CM0-5) at a given index and returns it.
   * @param index The index
   */
  public XCN removeChairmanOfStudy(int index) throws HL7Exception {
     return (XCN) super.removeRepetition(5, index);
  }

  /**
   * Returns a single repetition of Chairman of Study (CM0-5).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XCN getCm05_ChairmanOfStudy(int rep) throws HL7Exception {
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
   * Returns all repetitions of Chairman of Study (CM0-5).
   */
  public XCN[] getCm05_ChairmanOfStudy() {
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
   * Returns a count of the number of repetitions of Chairman of Study (CM0-5).
   */
  public int getCm05_ChairmanOfStudyReps() {
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
   * Inserts a repetition of Chairman of Study (CM0-5) at a given index and returns it.
   * @param index The index
   */
  public XCN insertCm05_ChairmanOfStudy(int index) throws HL7Exception {
     return (XCN) super.insertRepetition(5, index);
  }

  /**
   * Removes a repetition of Chairman of Study (CM0-5) at a given index and returns it.
   * @param index The index
   */
  public XCN removeCm05_ChairmanOfStudy(int index) throws HL7Exception {
     return (XCN) super.removeRepetition(5, index);
  }

  /**
   * Returns Last IRB Approval Date (CM0-6).
   */
  public DT getLastIRBApprovalDate()  {
    DT ret = null;
    try {
        Type t = this.getField(6, 0);
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
   * Returns Last IRB Approval Date (CM0-6).
   */
  public DT getCm06_LastIRBApprovalDate()  {
    DT ret = null;
    try {
        Type t = this.getField(6, 0);
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
   * Returns Total Accrual to Date (CM0-7).
   */
  public NM getTotalAccrualToDate()  {
    NM ret = null;
    try {
        Type t = this.getField(7, 0);
        ret = (NM)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns Total Accrual to Date (CM0-7).
   */
  public NM getCm07_TotalAccrualToDate()  {
    NM ret = null;
    try {
        Type t = this.getField(7, 0);
        ret = (NM)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns Last Accrual Date (CM0-8).
   */
  public DT getLastAccrualDate()  {
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
   * Returns Last Accrual Date (CM0-8).
   */
  public DT getCm08_LastAccrualDate()  {
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
   * Returns a single repetition of Contact for Study (CM0-9).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XCN getContactForStudy(int rep) throws HL7Exception {
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
   * Returns all repetitions of Contact for Study (CM0-9).
   */
  public XCN[] getContactForStudy() {
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
   * Returns a count of the number of repetitions of Contact for Study (CM0-9).
   */
  public int getContactForStudyReps() {
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
   * Inserts a repetition of Contact for Study (CM0-9) at a given index and returns it.
   * @param index The index
   */
  public XCN insertContactForStudy(int index) throws HL7Exception {
     return (XCN) super.insertRepetition(9, index);
  }

  /**
   * Removes a repetition of Contact for Study (CM0-9) at a given index and returns it.
   * @param index The index
   */
  public XCN removeContactForStudy(int index) throws HL7Exception {
     return (XCN) super.removeRepetition(9, index);
  }

  /**
   * Returns a single repetition of Contact for Study (CM0-9).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XCN getCm09_ContactForStudy(int rep) throws HL7Exception {
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
   * Returns all repetitions of Contact for Study (CM0-9).
   */
  public XCN[] getCm09_ContactForStudy() {
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
   * Returns a count of the number of repetitions of Contact for Study (CM0-9).
   */
  public int getCm09_ContactForStudyReps() {
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
   * Inserts a repetition of Contact for Study (CM0-9) at a given index and returns it.
   * @param index The index
   */
  public XCN insertCm09_ContactForStudy(int index) throws HL7Exception {
     return (XCN) super.insertRepetition(9, index);
  }

  /**
   * Removes a repetition of Contact for Study (CM0-9) at a given index and returns it.
   * @param index The index
   */
  public XCN removeCm09_ContactForStudy(int index) throws HL7Exception {
     return (XCN) super.removeRepetition(9, index);
  }

  /**
   * Returns Contact's Telephone Number (CM0-10).
   */
  public XTN getContactSTelephoneNumber()  {
    XTN ret = null;
    try {
        Type t = this.getField(10, 0);
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
   * Returns Contact's Telephone Number (CM0-10).
   */
  public XTN getCm010_ContactSTelephoneNumber()  {
    XTN ret = null;
    try {
        Type t = this.getField(10, 0);
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
   * Returns a single repetition of Contact's Address (CM0-11).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XAD getContactSAddress(int rep) throws HL7Exception {
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
   * Returns all repetitions of Contact's Address (CM0-11).
   */
  public XAD[] getContactSAddress() {
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
   * Returns a count of the number of repetitions of Contact's Address (CM0-11).
   */
  public int getContactSAddressReps() {
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
   * Inserts a repetition of Contact's Address (CM0-11) at a given index and returns it.
   * @param index The index
   */
  public XAD insertContactSAddress(int index) throws HL7Exception {
     return (XAD) super.insertRepetition(11, index);
  }

  /**
   * Removes a repetition of Contact's Address (CM0-11) at a given index and returns it.
   * @param index The index
   */
  public XAD removeContactSAddress(int index) throws HL7Exception {
     return (XAD) super.removeRepetition(11, index);
  }

  /**
   * Returns a single repetition of Contact's Address (CM0-11).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XAD getCm011_ContactSAddress(int rep) throws HL7Exception {
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
   * Returns all repetitions of Contact's Address (CM0-11).
   */
  public XAD[] getCm011_ContactSAddress() {
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
   * Returns a count of the number of repetitions of Contact's Address (CM0-11).
   */
  public int getCm011_ContactSAddressReps() {
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
   * Inserts a repetition of Contact's Address (CM0-11) at a given index and returns it.
   * @param index The index
   */
  public XAD insertCm011_ContactSAddress(int index) throws HL7Exception {
     return (XAD) super.insertRepetition(11, index);
  }

  /**
   * Removes a repetition of Contact's Address (CM0-11) at a given index and returns it.
   * @param index The index
   */
  public XAD removeCm011_ContactSAddress(int index) throws HL7Exception {
     return (XAD) super.removeRepetition(11, index);
  }

   protected Type createNewTypeWithoutReflection(int field) {
      switch (field) {
         case 0: return new ca.uhn.hl7v2.model.v26.datatype.SI(getMessage());
         case 1: return new ca.uhn.hl7v2.model.v26.datatype.EI(getMessage());
         case 2: return new ca.uhn.hl7v2.model.v26.datatype.EI(getMessage());
         case 3: return new ca.uhn.hl7v2.model.v26.datatype.ST(getMessage());
         case 4: return new ca.uhn.hl7v2.model.v26.datatype.XCN(getMessage());
         case 5: return new ca.uhn.hl7v2.model.v26.datatype.DT(getMessage());
         case 6: return new ca.uhn.hl7v2.model.v26.datatype.NM(getMessage());
         case 7: return new ca.uhn.hl7v2.model.v26.datatype.DT(getMessage());
         case 8: return new ca.uhn.hl7v2.model.v26.datatype.XCN(getMessage());
         case 9: return new ca.uhn.hl7v2.model.v26.datatype.XTN(getMessage());
         case 10: return new ca.uhn.hl7v2.model.v26.datatype.XAD(getMessage());
         default: return null;
      }
   }

}