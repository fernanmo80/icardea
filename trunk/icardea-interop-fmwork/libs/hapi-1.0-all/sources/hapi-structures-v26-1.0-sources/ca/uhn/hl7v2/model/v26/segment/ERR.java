package ca.uhn.hl7v2.model.v26.segment;

import ca.uhn.hl7v2.model.*;
import ca.uhn.hl7v2.model.v26.datatype.*;
import ca.uhn.log.HapiLogFactory;
import ca.uhn.hl7v2.parser.ModelClassFactory;
import ca.uhn.hl7v2.HL7Exception;

/**
 * <p>Represents an HL7 ERR message segment. 
 * This segment has the following fields:</p><p>
 * ERR-1: Error Code and Location (ELD)<br> 
 * ERR-2: Error Location (ERL)<br> 
 * ERR-3: HL7 Error Code (CWE)<br> 
 * ERR-4: Severity (ID)<br> 
 * ERR-5: Application Error Code (CWE)<br> 
 * ERR-6: Application Error Parameter (ST)<br> 
 * ERR-7: Diagnostic Information (TX)<br> 
 * ERR-8: User Message (TX)<br> 
 * ERR-9: Inform Person Indicator (IS)<br> 
 * ERR-10: Override Type (CWE)<br> 
 * ERR-11: Override Reason Code (CWE)<br> 
 * ERR-12: Help Desk Contact Point (XTN)<br> 
 * </p><p>The get...() methods return data from individual fields.  These methods 
 * do not throw exceptions and may therefore have to handle exceptions internally.  
 * If an exception is handled internally, it is logged and null is returned.  
 * This is not expected to happen - if it does happen this indicates not so much 
 * an exceptional circumstance as a bug in the code for this class.</p>    
 */
public class ERR extends AbstractSegment  {

  /**
   * Creates a ERR (Error) segment object that belongs to the given 
   * message.  
   */
  public ERR(Group parent, ModelClassFactory factory) {
    super(parent, factory);
    Message message = getMessage();
    try {
       this.add(ELD.class, false, 0, 0, new Object[]{message}, "Error Code and Location");
       this.add(ERL.class, false, 0, 18, new Object[]{message}, "Error Location");
       this.add(CWE.class, true, 1, 705, new Object[]{message}, "HL7 Error Code");
       this.add(ID.class, true, 1, 2, new Object[]{message, new Integer(516)}, "Severity");
       this.add(CWE.class, false, 1, 705, new Object[]{message}, "Application Error Code");
       this.add(ST.class, false, 10, 80, new Object[]{message}, "Application Error Parameter");
       this.add(TX.class, false, 1, 2048, new Object[]{message}, "Diagnostic Information");
       this.add(TX.class, false, 1, 250, new Object[]{message}, "User Message");
       this.add(IS.class, false, 0, 20, new Object[]{message, new Integer(517)}, "Inform Person Indicator");
       this.add(CWE.class, false, 1, 705, new Object[]{message}, "Override Type");
       this.add(CWE.class, false, 0, 705, new Object[]{message}, "Override Reason Code");
       this.add(XTN.class, false, 0, 652, new Object[]{message}, "Help Desk Contact Point");
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Can't instantiate " + this.getClass().getName(), he);
    }
  }

  /**
   * Returns a single repetition of Error Code and Location (ERR-1).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public ELD getErrorCodeAndLocation(int rep) throws HL7Exception {
    ELD ret = null;
    try {
        Type t = this.getField(1, rep);
        ret = (ELD)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Error Code and Location (ERR-1).
   */
  public ELD[] getErrorCodeAndLocation() {
     ELD[] ret = null;
    try {
        Type[] t = this.getField(1);  
        ret = new ELD[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (ELD)t[i];
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
   * Returns a count of the number of repetitions of Error Code and Location (ERR-1).
   */
  public int getErrorCodeAndLocationReps() {
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
   * Inserts a repetition of Error Code and Location (ERR-1) at a given index and returns it.
   * @param index The index
   */
  public ELD insertErrorCodeAndLocation(int index) throws HL7Exception {
     return (ELD) super.insertRepetition(1, index);
  }

  /**
   * Removes a repetition of Error Code and Location (ERR-1) at a given index and returns it.
   * @param index The index
   */
  public ELD removeErrorCodeAndLocation(int index) throws HL7Exception {
     return (ELD) super.removeRepetition(1, index);
  }

  /**
   * Returns a single repetition of Error Code and Location (ERR-1).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public ELD getErr1_ErrorCodeAndLocation(int rep) throws HL7Exception {
    ELD ret = null;
    try {
        Type t = this.getField(1, rep);
        ret = (ELD)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Error Code and Location (ERR-1).
   */
  public ELD[] getErr1_ErrorCodeAndLocation() {
     ELD[] ret = null;
    try {
        Type[] t = this.getField(1);  
        ret = new ELD[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (ELD)t[i];
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
   * Returns a count of the number of repetitions of Error Code and Location (ERR-1).
   */
  public int getErr1_ErrorCodeAndLocationReps() {
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
   * Inserts a repetition of Error Code and Location (ERR-1) at a given index and returns it.
   * @param index The index
   */
  public ELD insertErr1_ErrorCodeAndLocation(int index) throws HL7Exception {
     return (ELD) super.insertRepetition(1, index);
  }

  /**
   * Removes a repetition of Error Code and Location (ERR-1) at a given index and returns it.
   * @param index The index
   */
  public ELD removeErr1_ErrorCodeAndLocation(int index) throws HL7Exception {
     return (ELD) super.removeRepetition(1, index);
  }

  /**
   * Returns a single repetition of Error Location (ERR-2).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public ERL getErrorLocation(int rep) throws HL7Exception {
    ERL ret = null;
    try {
        Type t = this.getField(2, rep);
        ret = (ERL)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Error Location (ERR-2).
   */
  public ERL[] getErrorLocation() {
     ERL[] ret = null;
    try {
        Type[] t = this.getField(2);  
        ret = new ERL[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (ERL)t[i];
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
   * Returns a count of the number of repetitions of Error Location (ERR-2).
   */
  public int getErrorLocationReps() {
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
   * Inserts a repetition of Error Location (ERR-2) at a given index and returns it.
   * @param index The index
   */
  public ERL insertErrorLocation(int index) throws HL7Exception {
     return (ERL) super.insertRepetition(2, index);
  }

  /**
   * Removes a repetition of Error Location (ERR-2) at a given index and returns it.
   * @param index The index
   */
  public ERL removeErrorLocation(int index) throws HL7Exception {
     return (ERL) super.removeRepetition(2, index);
  }

  /**
   * Returns a single repetition of Error Location (ERR-2).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public ERL getErr2_ErrorLocation(int rep) throws HL7Exception {
    ERL ret = null;
    try {
        Type t = this.getField(2, rep);
        ret = (ERL)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Error Location (ERR-2).
   */
  public ERL[] getErr2_ErrorLocation() {
     ERL[] ret = null;
    try {
        Type[] t = this.getField(2);  
        ret = new ERL[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (ERL)t[i];
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
   * Returns a count of the number of repetitions of Error Location (ERR-2).
   */
  public int getErr2_ErrorLocationReps() {
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
   * Inserts a repetition of Error Location (ERR-2) at a given index and returns it.
   * @param index The index
   */
  public ERL insertErr2_ErrorLocation(int index) throws HL7Exception {
     return (ERL) super.insertRepetition(2, index);
  }

  /**
   * Removes a repetition of Error Location (ERR-2) at a given index and returns it.
   * @param index The index
   */
  public ERL removeErr2_ErrorLocation(int index) throws HL7Exception {
     return (ERL) super.removeRepetition(2, index);
  }

  /**
   * Returns HL7 Error Code (ERR-3).
   */
  public CWE getHL7ErrorCode()  {
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
   * Returns HL7 Error Code (ERR-3).
   */
  public CWE getErr3_HL7ErrorCode()  {
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
   * Returns Severity (ERR-4).
   */
  public ID getSeverity()  {
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
   * Returns Severity (ERR-4).
   */
  public ID getErr4_Severity()  {
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
   * Returns Application Error Code (ERR-5).
   */
  public CWE getApplicationErrorCode()  {
    CWE ret = null;
    try {
        Type t = this.getField(5, 0);
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
   * Returns Application Error Code (ERR-5).
   */
  public CWE getErr5_ApplicationErrorCode()  {
    CWE ret = null;
    try {
        Type t = this.getField(5, 0);
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
   * Returns a single repetition of Application Error Parameter (ERR-6).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public ST getApplicationErrorParameter(int rep) throws HL7Exception {
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
   * Returns all repetitions of Application Error Parameter (ERR-6).
   */
  public ST[] getApplicationErrorParameter() {
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
   * Returns a count of the number of repetitions of Application Error Parameter (ERR-6).
   */
  public int getApplicationErrorParameterReps() {
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
   * Inserts a repetition of Application Error Parameter (ERR-6) at a given index and returns it.
   * @param index The index
   */
  public ST insertApplicationErrorParameter(int index) throws HL7Exception {
     return (ST) super.insertRepetition(6, index);
  }

  /**
   * Removes a repetition of Application Error Parameter (ERR-6) at a given index and returns it.
   * @param index The index
   */
  public ST removeApplicationErrorParameter(int index) throws HL7Exception {
     return (ST) super.removeRepetition(6, index);
  }

  /**
   * Returns a single repetition of Application Error Parameter (ERR-6).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public ST getErr6_ApplicationErrorParameter(int rep) throws HL7Exception {
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
   * Returns all repetitions of Application Error Parameter (ERR-6).
   */
  public ST[] getErr6_ApplicationErrorParameter() {
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
   * Returns a count of the number of repetitions of Application Error Parameter (ERR-6).
   */
  public int getErr6_ApplicationErrorParameterReps() {
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
   * Inserts a repetition of Application Error Parameter (ERR-6) at a given index and returns it.
   * @param index The index
   */
  public ST insertErr6_ApplicationErrorParameter(int index) throws HL7Exception {
     return (ST) super.insertRepetition(6, index);
  }

  /**
   * Removes a repetition of Application Error Parameter (ERR-6) at a given index and returns it.
   * @param index The index
   */
  public ST removeErr6_ApplicationErrorParameter(int index) throws HL7Exception {
     return (ST) super.removeRepetition(6, index);
  }

  /**
   * Returns Diagnostic Information (ERR-7).
   */
  public TX getDiagnosticInformation()  {
    TX ret = null;
    try {
        Type t = this.getField(7, 0);
        ret = (TX)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns Diagnostic Information (ERR-7).
   */
  public TX getErr7_DiagnosticInformation()  {
    TX ret = null;
    try {
        Type t = this.getField(7, 0);
        ret = (TX)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns User Message (ERR-8).
   */
  public TX getUserMessage()  {
    TX ret = null;
    try {
        Type t = this.getField(8, 0);
        ret = (TX)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns User Message (ERR-8).
   */
  public TX getErr8_UserMessage()  {
    TX ret = null;
    try {
        Type t = this.getField(8, 0);
        ret = (TX)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns a single repetition of Inform Person Indicator (ERR-9).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public IS getInformPersonIndicator(int rep) throws HL7Exception {
    IS ret = null;
    try {
        Type t = this.getField(9, rep);
        ret = (IS)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Inform Person Indicator (ERR-9).
   */
  public IS[] getInformPersonIndicator() {
     IS[] ret = null;
    try {
        Type[] t = this.getField(9);  
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
   * Returns a count of the number of repetitions of Inform Person Indicator (ERR-9).
   */
  public int getInformPersonIndicatorReps() {
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
   * Inserts a repetition of Inform Person Indicator (ERR-9) at a given index and returns it.
   * @param index The index
   */
  public IS insertInformPersonIndicator(int index) throws HL7Exception {
     return (IS) super.insertRepetition(9, index);
  }

  /**
   * Removes a repetition of Inform Person Indicator (ERR-9) at a given index and returns it.
   * @param index The index
   */
  public IS removeInformPersonIndicator(int index) throws HL7Exception {
     return (IS) super.removeRepetition(9, index);
  }

  /**
   * Returns a single repetition of Inform Person Indicator (ERR-9).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public IS getErr9_InformPersonIndicator(int rep) throws HL7Exception {
    IS ret = null;
    try {
        Type t = this.getField(9, rep);
        ret = (IS)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Inform Person Indicator (ERR-9).
   */
  public IS[] getErr9_InformPersonIndicator() {
     IS[] ret = null;
    try {
        Type[] t = this.getField(9);  
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
   * Returns a count of the number of repetitions of Inform Person Indicator (ERR-9).
   */
  public int getErr9_InformPersonIndicatorReps() {
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
   * Inserts a repetition of Inform Person Indicator (ERR-9) at a given index and returns it.
   * @param index The index
   */
  public IS insertErr9_InformPersonIndicator(int index) throws HL7Exception {
     return (IS) super.insertRepetition(9, index);
  }

  /**
   * Removes a repetition of Inform Person Indicator (ERR-9) at a given index and returns it.
   * @param index The index
   */
  public IS removeErr9_InformPersonIndicator(int index) throws HL7Exception {
     return (IS) super.removeRepetition(9, index);
  }

  /**
   * Returns Override Type (ERR-10).
   */
  public CWE getOverrideType()  {
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
   * Returns Override Type (ERR-10).
   */
  public CWE getErr10_OverrideType()  {
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
   * Returns a single repetition of Override Reason Code (ERR-11).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getOverrideReasonCode(int rep) throws HL7Exception {
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
   * Returns all repetitions of Override Reason Code (ERR-11).
   */
  public CWE[] getOverrideReasonCode() {
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
   * Returns a count of the number of repetitions of Override Reason Code (ERR-11).
   */
  public int getOverrideReasonCodeReps() {
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
   * Inserts a repetition of Override Reason Code (ERR-11) at a given index and returns it.
   * @param index The index
   */
  public CWE insertOverrideReasonCode(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(11, index);
  }

  /**
   * Removes a repetition of Override Reason Code (ERR-11) at a given index and returns it.
   * @param index The index
   */
  public CWE removeOverrideReasonCode(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(11, index);
  }

  /**
   * Returns a single repetition of Override Reason Code (ERR-11).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getErr11_OverrideReasonCode(int rep) throws HL7Exception {
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
   * Returns all repetitions of Override Reason Code (ERR-11).
   */
  public CWE[] getErr11_OverrideReasonCode() {
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
   * Returns a count of the number of repetitions of Override Reason Code (ERR-11).
   */
  public int getErr11_OverrideReasonCodeReps() {
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
   * Inserts a repetition of Override Reason Code (ERR-11) at a given index and returns it.
   * @param index The index
   */
  public CWE insertErr11_OverrideReasonCode(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(11, index);
  }

  /**
   * Removes a repetition of Override Reason Code (ERR-11) at a given index and returns it.
   * @param index The index
   */
  public CWE removeErr11_OverrideReasonCode(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(11, index);
  }

  /**
   * Returns a single repetition of Help Desk Contact Point (ERR-12).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XTN getHelpDeskContactPoint(int rep) throws HL7Exception {
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
   * Returns all repetitions of Help Desk Contact Point (ERR-12).
   */
  public XTN[] getHelpDeskContactPoint() {
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
   * Returns a count of the number of repetitions of Help Desk Contact Point (ERR-12).
   */
  public int getHelpDeskContactPointReps() {
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
   * Inserts a repetition of Help Desk Contact Point (ERR-12) at a given index and returns it.
   * @param index The index
   */
  public XTN insertHelpDeskContactPoint(int index) throws HL7Exception {
     return (XTN) super.insertRepetition(12, index);
  }

  /**
   * Removes a repetition of Help Desk Contact Point (ERR-12) at a given index and returns it.
   * @param index The index
   */
  public XTN removeHelpDeskContactPoint(int index) throws HL7Exception {
     return (XTN) super.removeRepetition(12, index);
  }

  /**
   * Returns a single repetition of Help Desk Contact Point (ERR-12).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XTN getErr12_HelpDeskContactPoint(int rep) throws HL7Exception {
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
   * Returns all repetitions of Help Desk Contact Point (ERR-12).
   */
  public XTN[] getErr12_HelpDeskContactPoint() {
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
   * Returns a count of the number of repetitions of Help Desk Contact Point (ERR-12).
   */
  public int getErr12_HelpDeskContactPointReps() {
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
   * Inserts a repetition of Help Desk Contact Point (ERR-12) at a given index and returns it.
   * @param index The index
   */
  public XTN insertErr12_HelpDeskContactPoint(int index) throws HL7Exception {
     return (XTN) super.insertRepetition(12, index);
  }

  /**
   * Removes a repetition of Help Desk Contact Point (ERR-12) at a given index and returns it.
   * @param index The index
   */
  public XTN removeErr12_HelpDeskContactPoint(int index) throws HL7Exception {
     return (XTN) super.removeRepetition(12, index);
  }

   protected Type createNewTypeWithoutReflection(int field) {
      switch (field) {
         case 0: return new ca.uhn.hl7v2.model.v26.datatype.ELD(getMessage());
         case 1: return new ca.uhn.hl7v2.model.v26.datatype.ERL(getMessage());
         case 2: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 3: return new ca.uhn.hl7v2.model.v26.datatype.ID(getMessage(), new Integer(516));
         case 4: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 5: return new ca.uhn.hl7v2.model.v26.datatype.ST(getMessage());
         case 6: return new ca.uhn.hl7v2.model.v26.datatype.TX(getMessage());
         case 7: return new ca.uhn.hl7v2.model.v26.datatype.TX(getMessage());
         case 8: return new ca.uhn.hl7v2.model.v26.datatype.IS(getMessage(), new Integer(517));
         case 9: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 10: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 11: return new ca.uhn.hl7v2.model.v26.datatype.XTN(getMessage());
         default: return null;
      }
   }

}