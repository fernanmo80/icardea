package ca.uhn.hl7v2.model.v26.segment;

import ca.uhn.hl7v2.model.*;
import ca.uhn.hl7v2.model.v26.datatype.*;
import ca.uhn.log.HapiLogFactory;
import ca.uhn.hl7v2.parser.ModelClassFactory;
import ca.uhn.hl7v2.HL7Exception;

/**
 * <p>Represents an HL7 QRD message segment. 
 * This segment has the following fields:</p><p>
 * QRD-1: Query Date/Time (DTM)<br> 
 * QRD-2: Query Format Code (ID)<br> 
 * QRD-3: Query Priority (ID)<br> 
 * QRD-4: Query ID (ST)<br> 
 * QRD-5: Deferred Response Type (ID)<br> 
 * QRD-6: Deferred Response Date/Time (DTM)<br> 
 * QRD-7: Quantity Limited Request (CQ)<br> 
 * QRD-8: Who Subject Filter (XCN)<br> 
 * QRD-9: What Subject Filter (CWE)<br> 
 * QRD-10: What Department Data Code (CWE)<br> 
 * QRD-11: What Data Code Value Qual. (VR)<br> 
 * QRD-12: Query Results Level (ID)<br> 
 * </p><p>The get...() methods return data from individual fields.  These methods 
 * do not throw exceptions and may therefore have to handle exceptions internally.  
 * If an exception is handled internally, it is logged and null is returned.  
 * This is not expected to happen - if it does happen this indicates not so much 
 * an exceptional circumstance as a bug in the code for this class.</p>    
 */
public class QRD extends AbstractSegment  {

  /**
   * Creates a QRD (Original-Style Query Definition) segment object that belongs to the given 
   * message.  
   */
  public QRD(Group parent, ModelClassFactory factory) {
    super(parent, factory);
    Message message = getMessage();
    try {
       this.add(DTM.class, true, 1, 24, new Object[]{message}, "Query Date/Time");
       this.add(ID.class, true, 1, 1, new Object[]{message, new Integer(106)}, "Query Format Code");
       this.add(ID.class, true, 1, 1, new Object[]{message, new Integer(91)}, "Query Priority");
       this.add(ST.class, true, 1, 10, new Object[]{message}, "Query ID");
       this.add(ID.class, false, 1, 1, new Object[]{message, new Integer(107)}, "Deferred Response Type");
       this.add(DTM.class, false, 1, 24, new Object[]{message}, "Deferred Response Date/Time");
       this.add(CQ.class, true, 1, 10, new Object[]{message}, "Quantity Limited Request");
       this.add(XCN.class, true, 0, 250, new Object[]{message}, "Who Subject Filter");
       this.add(CWE.class, true, 0, 250, new Object[]{message}, "What Subject Filter");
       this.add(CWE.class, true, 0, 250, new Object[]{message}, "What Department Data Code");
       this.add(VR.class, false, 0, 20, new Object[]{message}, "What Data Code Value Qual.");
       this.add(ID.class, false, 1, 1, new Object[]{message, new Integer(108)}, "Query Results Level");
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Can't instantiate " + this.getClass().getName(), he);
    }
  }

  /**
   * Returns Query Date/Time (QRD-1).
   */
  public DTM getQueryDateTime()  {
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
   * Returns Query Date/Time (QRD-1).
   */
  public DTM getQrd1_QueryDateTime()  {
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
   * Returns Query Format Code (QRD-2).
   */
  public ID getQueryFormatCode()  {
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
   * Returns Query Format Code (QRD-2).
   */
  public ID getQrd2_QueryFormatCode()  {
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
   * Returns Query Priority (QRD-3).
   */
  public ID getQueryPriority()  {
    ID ret = null;
    try {
        Type t = this.getField(3, 0);
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
   * Returns Query Priority (QRD-3).
   */
  public ID getQrd3_QueryPriority()  {
    ID ret = null;
    try {
        Type t = this.getField(3, 0);
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
   * Returns Query ID (QRD-4).
   */
  public ST getQueryID()  {
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
   * Returns Query ID (QRD-4).
   */
  public ST getQrd4_QueryID()  {
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
   * Returns Deferred Response Type (QRD-5).
   */
  public ID getDeferredResponseType()  {
    ID ret = null;
    try {
        Type t = this.getField(5, 0);
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
   * Returns Deferred Response Type (QRD-5).
   */
  public ID getQrd5_DeferredResponseType()  {
    ID ret = null;
    try {
        Type t = this.getField(5, 0);
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
   * Returns Deferred Response Date/Time (QRD-6).
   */
  public DTM getDeferredResponseDateTime()  {
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
   * Returns Deferred Response Date/Time (QRD-6).
   */
  public DTM getQrd6_DeferredResponseDateTime()  {
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
   * Returns Quantity Limited Request (QRD-7).
   */
  public CQ getQuantityLimitedRequest()  {
    CQ ret = null;
    try {
        Type t = this.getField(7, 0);
        ret = (CQ)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns Quantity Limited Request (QRD-7).
   */
  public CQ getQrd7_QuantityLimitedRequest()  {
    CQ ret = null;
    try {
        Type t = this.getField(7, 0);
        ret = (CQ)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns a single repetition of Who Subject Filter (QRD-8).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XCN getWhoSubjectFilter(int rep) throws HL7Exception {
    XCN ret = null;
    try {
        Type t = this.getField(8, rep);
        ret = (XCN)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Who Subject Filter (QRD-8).
   */
  public XCN[] getWhoSubjectFilter() {
     XCN[] ret = null;
    try {
        Type[] t = this.getField(8);  
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
   * Returns a count of the number of repetitions of Who Subject Filter (QRD-8).
   */
  public int getWhoSubjectFilterReps() {
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
   * Inserts a repetition of Who Subject Filter (QRD-8) at a given index and returns it.
   * @param index The index
   */
  public XCN insertWhoSubjectFilter(int index) throws HL7Exception {
     return (XCN) super.insertRepetition(8, index);
  }

  /**
   * Removes a repetition of Who Subject Filter (QRD-8) at a given index and returns it.
   * @param index The index
   */
  public XCN removeWhoSubjectFilter(int index) throws HL7Exception {
     return (XCN) super.removeRepetition(8, index);
  }

  /**
   * Returns a single repetition of Who Subject Filter (QRD-8).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XCN getQrd8_WhoSubjectFilter(int rep) throws HL7Exception {
    XCN ret = null;
    try {
        Type t = this.getField(8, rep);
        ret = (XCN)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Who Subject Filter (QRD-8).
   */
  public XCN[] getQrd8_WhoSubjectFilter() {
     XCN[] ret = null;
    try {
        Type[] t = this.getField(8);  
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
   * Returns a count of the number of repetitions of Who Subject Filter (QRD-8).
   */
  public int getQrd8_WhoSubjectFilterReps() {
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
   * Inserts a repetition of Who Subject Filter (QRD-8) at a given index and returns it.
   * @param index The index
   */
  public XCN insertQrd8_WhoSubjectFilter(int index) throws HL7Exception {
     return (XCN) super.insertRepetition(8, index);
  }

  /**
   * Removes a repetition of Who Subject Filter (QRD-8) at a given index and returns it.
   * @param index The index
   */
  public XCN removeQrd8_WhoSubjectFilter(int index) throws HL7Exception {
     return (XCN) super.removeRepetition(8, index);
  }

  /**
   * Returns a single repetition of What Subject Filter (QRD-9).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getWhatSubjectFilter(int rep) throws HL7Exception {
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
   * Returns all repetitions of What Subject Filter (QRD-9).
   */
  public CWE[] getWhatSubjectFilter() {
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
   * Returns a count of the number of repetitions of What Subject Filter (QRD-9).
   */
  public int getWhatSubjectFilterReps() {
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
   * Inserts a repetition of What Subject Filter (QRD-9) at a given index and returns it.
   * @param index The index
   */
  public CWE insertWhatSubjectFilter(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(9, index);
  }

  /**
   * Removes a repetition of What Subject Filter (QRD-9) at a given index and returns it.
   * @param index The index
   */
  public CWE removeWhatSubjectFilter(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(9, index);
  }

  /**
   * Returns a single repetition of What Subject Filter (QRD-9).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getQrd9_WhatSubjectFilter(int rep) throws HL7Exception {
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
   * Returns all repetitions of What Subject Filter (QRD-9).
   */
  public CWE[] getQrd9_WhatSubjectFilter() {
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
   * Returns a count of the number of repetitions of What Subject Filter (QRD-9).
   */
  public int getQrd9_WhatSubjectFilterReps() {
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
   * Inserts a repetition of What Subject Filter (QRD-9) at a given index and returns it.
   * @param index The index
   */
  public CWE insertQrd9_WhatSubjectFilter(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(9, index);
  }

  /**
   * Removes a repetition of What Subject Filter (QRD-9) at a given index and returns it.
   * @param index The index
   */
  public CWE removeQrd9_WhatSubjectFilter(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(9, index);
  }

  /**
   * Returns a single repetition of What Department Data Code (QRD-10).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getWhatDepartmentDataCode(int rep) throws HL7Exception {
    CWE ret = null;
    try {
        Type t = this.getField(10, rep);
        ret = (CWE)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of What Department Data Code (QRD-10).
   */
  public CWE[] getWhatDepartmentDataCode() {
     CWE[] ret = null;
    try {
        Type[] t = this.getField(10);  
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
   * Returns a count of the number of repetitions of What Department Data Code (QRD-10).
   */
  public int getWhatDepartmentDataCodeReps() {
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
   * Inserts a repetition of What Department Data Code (QRD-10) at a given index and returns it.
   * @param index The index
   */
  public CWE insertWhatDepartmentDataCode(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(10, index);
  }

  /**
   * Removes a repetition of What Department Data Code (QRD-10) at a given index and returns it.
   * @param index The index
   */
  public CWE removeWhatDepartmentDataCode(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(10, index);
  }

  /**
   * Returns a single repetition of What Department Data Code (QRD-10).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getQrd10_WhatDepartmentDataCode(int rep) throws HL7Exception {
    CWE ret = null;
    try {
        Type t = this.getField(10, rep);
        ret = (CWE)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of What Department Data Code (QRD-10).
   */
  public CWE[] getQrd10_WhatDepartmentDataCode() {
     CWE[] ret = null;
    try {
        Type[] t = this.getField(10);  
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
   * Returns a count of the number of repetitions of What Department Data Code (QRD-10).
   */
  public int getQrd10_WhatDepartmentDataCodeReps() {
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
   * Inserts a repetition of What Department Data Code (QRD-10) at a given index and returns it.
   * @param index The index
   */
  public CWE insertQrd10_WhatDepartmentDataCode(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(10, index);
  }

  /**
   * Removes a repetition of What Department Data Code (QRD-10) at a given index and returns it.
   * @param index The index
   */
  public CWE removeQrd10_WhatDepartmentDataCode(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(10, index);
  }

  /**
   * Returns a single repetition of What Data Code Value Qual. (QRD-11).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public VR getWhatDataCodeValueQual(int rep) throws HL7Exception {
    VR ret = null;
    try {
        Type t = this.getField(11, rep);
        ret = (VR)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of What Data Code Value Qual. (QRD-11).
   */
  public VR[] getWhatDataCodeValueQual() {
     VR[] ret = null;
    try {
        Type[] t = this.getField(11);  
        ret = new VR[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (VR)t[i];
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
   * Returns a count of the number of repetitions of What Data Code Value Qual. (QRD-11).
   */
  public int getWhatDataCodeValueQualReps() {
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
   * Inserts a repetition of What Data Code Value Qual. (QRD-11) at a given index and returns it.
   * @param index The index
   */
  public VR insertWhatDataCodeValueQual(int index) throws HL7Exception {
     return (VR) super.insertRepetition(11, index);
  }

  /**
   * Removes a repetition of What Data Code Value Qual. (QRD-11) at a given index and returns it.
   * @param index The index
   */
  public VR removeWhatDataCodeValueQual(int index) throws HL7Exception {
     return (VR) super.removeRepetition(11, index);
  }

  /**
   * Returns a single repetition of What Data Code Value Qual. (QRD-11).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public VR getQrd11_WhatDataCodeValueQual(int rep) throws HL7Exception {
    VR ret = null;
    try {
        Type t = this.getField(11, rep);
        ret = (VR)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of What Data Code Value Qual. (QRD-11).
   */
  public VR[] getQrd11_WhatDataCodeValueQual() {
     VR[] ret = null;
    try {
        Type[] t = this.getField(11);  
        ret = new VR[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (VR)t[i];
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
   * Returns a count of the number of repetitions of What Data Code Value Qual. (QRD-11).
   */
  public int getQrd11_WhatDataCodeValueQualReps() {
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
   * Inserts a repetition of What Data Code Value Qual. (QRD-11) at a given index and returns it.
   * @param index The index
   */
  public VR insertQrd11_WhatDataCodeValueQual(int index) throws HL7Exception {
     return (VR) super.insertRepetition(11, index);
  }

  /**
   * Removes a repetition of What Data Code Value Qual. (QRD-11) at a given index and returns it.
   * @param index The index
   */
  public VR removeQrd11_WhatDataCodeValueQual(int index) throws HL7Exception {
     return (VR) super.removeRepetition(11, index);
  }

  /**
   * Returns Query Results Level (QRD-12).
   */
  public ID getQueryResultsLevel()  {
    ID ret = null;
    try {
        Type t = this.getField(12, 0);
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
   * Returns Query Results Level (QRD-12).
   */
  public ID getQrd12_QueryResultsLevel()  {
    ID ret = null;
    try {
        Type t = this.getField(12, 0);
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
         case 1: return new ca.uhn.hl7v2.model.v26.datatype.ID(getMessage(), new Integer(106));
         case 2: return new ca.uhn.hl7v2.model.v26.datatype.ID(getMessage(), new Integer(91));
         case 3: return new ca.uhn.hl7v2.model.v26.datatype.ST(getMessage());
         case 4: return new ca.uhn.hl7v2.model.v26.datatype.ID(getMessage(), new Integer(107));
         case 5: return new ca.uhn.hl7v2.model.v26.datatype.DTM(getMessage());
         case 6: return new ca.uhn.hl7v2.model.v26.datatype.CQ(getMessage());
         case 7: return new ca.uhn.hl7v2.model.v26.datatype.XCN(getMessage());
         case 8: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 9: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 10: return new ca.uhn.hl7v2.model.v26.datatype.VR(getMessage());
         case 11: return new ca.uhn.hl7v2.model.v26.datatype.ID(getMessage(), new Integer(108));
         default: return null;
      }
   }

}