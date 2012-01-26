package ca.uhn.hl7v2.model.v26.segment;

import ca.uhn.hl7v2.model.*;
import ca.uhn.hl7v2.model.v26.datatype.*;
import ca.uhn.log.HapiLogFactory;
import ca.uhn.hl7v2.parser.ModelClassFactory;
import ca.uhn.hl7v2.HL7Exception;

/**
 * <p>Represents an HL7 QRF message segment. 
 * This segment has the following fields:</p><p>
 * QRF-1: Where Subject Filter (ST)<br> 
 * QRF-2: When Data Start Date/Time (DTM)<br> 
 * QRF-3: When Data End Date/Time (DTM)<br> 
 * QRF-4: What User Qualifier (ST)<br> 
 * QRF-5: Other QRY Subject Filter (ST)<br> 
 * QRF-6: Which Date/Time Qualifier (ID)<br> 
 * QRF-7: Which Date/Time Status Qualifier (ID)<br> 
 * QRF-8: Date/Time Selection Qualifier (ID)<br> 
 * QRF-9: When Quantity/Timing Qualifier (TQ)<br> 
 * QRF-10: Search Confidence Threshold (NM)<br> 
 * </p><p>The get...() methods return data from individual fields.  These methods 
 * do not throw exceptions and may therefore have to handle exceptions internally.  
 * If an exception is handled internally, it is logged and null is returned.  
 * This is not expected to happen - if it does happen this indicates not so much 
 * an exceptional circumstance as a bug in the code for this class.</p>    
 */
public class QRF extends AbstractSegment  {

  /**
   * Creates a QRF (Original style query filter) segment object that belongs to the given 
   * message.  
   */
  public QRF(Group parent, ModelClassFactory factory) {
    super(parent, factory);
    Message message = getMessage();
    try {
       this.add(ST.class, true, 0, 20, new Object[]{message}, "Where Subject Filter");
       this.add(DTM.class, false, 1, 0, new Object[]{message}, "When Data Start Date/Time");
       this.add(DTM.class, false, 1, 0, new Object[]{message}, "When Data End Date/Time");
       this.add(ST.class, false, 0, 60, new Object[]{message}, "What User Qualifier");
       this.add(ST.class, false, 0, 60, new Object[]{message}, "Other QRY Subject Filter");
       this.add(ID.class, false, 0, 12, new Object[]{message, new Integer(156)}, "Which Date/Time Qualifier");
       this.add(ID.class, false, 0, 12, new Object[]{message, new Integer(157)}, "Which Date/Time Status Qualifier");
       this.add(ID.class, false, 0, 12, new Object[]{message, new Integer(158)}, "Date/Time Selection Qualifier");
       this.add(TQ.class, false, 1, 0, new Object[]{message}, "When Quantity/Timing Qualifier");
       this.add(NM.class, false, 1, 10, new Object[]{message}, "Search Confidence Threshold");
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Can't instantiate " + this.getClass().getName(), he);
    }
  }

  /**
   * Returns a single repetition of Where Subject Filter (QRF-1).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public ST getWhereSubjectFilter(int rep) throws HL7Exception {
    ST ret = null;
    try {
        Type t = this.getField(1, rep);
        ret = (ST)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Where Subject Filter (QRF-1).
   */
  public ST[] getWhereSubjectFilter() {
     ST[] ret = null;
    try {
        Type[] t = this.getField(1);  
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
   * Returns a count of the number of repetitions of Where Subject Filter (QRF-1).
   */
  public int getWhereSubjectFilterReps() {
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
   * Inserts a repetition of Where Subject Filter (QRF-1) at a given index and returns it.
   * @param index The index
   */
  public ST insertWhereSubjectFilter(int index) throws HL7Exception {
     return (ST) super.insertRepetition(1, index);
  }

  /**
   * Removes a repetition of Where Subject Filter (QRF-1) at a given index and returns it.
   * @param index The index
   */
  public ST removeWhereSubjectFilter(int index) throws HL7Exception {
     return (ST) super.removeRepetition(1, index);
  }

  /**
   * Returns a single repetition of Where Subject Filter (QRF-1).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public ST getQrf1_WhereSubjectFilter(int rep) throws HL7Exception {
    ST ret = null;
    try {
        Type t = this.getField(1, rep);
        ret = (ST)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Where Subject Filter (QRF-1).
   */
  public ST[] getQrf1_WhereSubjectFilter() {
     ST[] ret = null;
    try {
        Type[] t = this.getField(1);  
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
   * Returns a count of the number of repetitions of Where Subject Filter (QRF-1).
   */
  public int getQrf1_WhereSubjectFilterReps() {
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
   * Inserts a repetition of Where Subject Filter (QRF-1) at a given index and returns it.
   * @param index The index
   */
  public ST insertQrf1_WhereSubjectFilter(int index) throws HL7Exception {
     return (ST) super.insertRepetition(1, index);
  }

  /**
   * Removes a repetition of Where Subject Filter (QRF-1) at a given index and returns it.
   * @param index The index
   */
  public ST removeQrf1_WhereSubjectFilter(int index) throws HL7Exception {
     return (ST) super.removeRepetition(1, index);
  }

  /**
   * Returns When Data Start Date/Time (QRF-2).
   */
  public DTM getWhenDataStartDateTime()  {
    DTM ret = null;
    try {
        Type t = this.getField(2, 0);
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
   * Returns When Data Start Date/Time (QRF-2).
   */
  public DTM getQrf2_WhenDataStartDateTime()  {
    DTM ret = null;
    try {
        Type t = this.getField(2, 0);
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
   * Returns When Data End Date/Time (QRF-3).
   */
  public DTM getWhenDataEndDateTime()  {
    DTM ret = null;
    try {
        Type t = this.getField(3, 0);
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
   * Returns When Data End Date/Time (QRF-3).
   */
  public DTM getQrf3_WhenDataEndDateTime()  {
    DTM ret = null;
    try {
        Type t = this.getField(3, 0);
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
   * Returns a single repetition of What User Qualifier (QRF-4).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public ST getWhatUserQualifier(int rep) throws HL7Exception {
    ST ret = null;
    try {
        Type t = this.getField(4, rep);
        ret = (ST)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of What User Qualifier (QRF-4).
   */
  public ST[] getWhatUserQualifier() {
     ST[] ret = null;
    try {
        Type[] t = this.getField(4);  
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
   * Returns a count of the number of repetitions of What User Qualifier (QRF-4).
   */
  public int getWhatUserQualifierReps() {
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
   * Inserts a repetition of What User Qualifier (QRF-4) at a given index and returns it.
   * @param index The index
   */
  public ST insertWhatUserQualifier(int index) throws HL7Exception {
     return (ST) super.insertRepetition(4, index);
  }

  /**
   * Removes a repetition of What User Qualifier (QRF-4) at a given index and returns it.
   * @param index The index
   */
  public ST removeWhatUserQualifier(int index) throws HL7Exception {
     return (ST) super.removeRepetition(4, index);
  }

  /**
   * Returns a single repetition of What User Qualifier (QRF-4).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public ST getQrf4_WhatUserQualifier(int rep) throws HL7Exception {
    ST ret = null;
    try {
        Type t = this.getField(4, rep);
        ret = (ST)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of What User Qualifier (QRF-4).
   */
  public ST[] getQrf4_WhatUserQualifier() {
     ST[] ret = null;
    try {
        Type[] t = this.getField(4);  
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
   * Returns a count of the number of repetitions of What User Qualifier (QRF-4).
   */
  public int getQrf4_WhatUserQualifierReps() {
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
   * Inserts a repetition of What User Qualifier (QRF-4) at a given index and returns it.
   * @param index The index
   */
  public ST insertQrf4_WhatUserQualifier(int index) throws HL7Exception {
     return (ST) super.insertRepetition(4, index);
  }

  /**
   * Removes a repetition of What User Qualifier (QRF-4) at a given index and returns it.
   * @param index The index
   */
  public ST removeQrf4_WhatUserQualifier(int index) throws HL7Exception {
     return (ST) super.removeRepetition(4, index);
  }

  /**
   * Returns a single repetition of Other QRY Subject Filter (QRF-5).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public ST getOtherQRYSubjectFilter(int rep) throws HL7Exception {
    ST ret = null;
    try {
        Type t = this.getField(5, rep);
        ret = (ST)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Other QRY Subject Filter (QRF-5).
   */
  public ST[] getOtherQRYSubjectFilter() {
     ST[] ret = null;
    try {
        Type[] t = this.getField(5);  
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
   * Returns a count of the number of repetitions of Other QRY Subject Filter (QRF-5).
   */
  public int getOtherQRYSubjectFilterReps() {
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
   * Inserts a repetition of Other QRY Subject Filter (QRF-5) at a given index and returns it.
   * @param index The index
   */
  public ST insertOtherQRYSubjectFilter(int index) throws HL7Exception {
     return (ST) super.insertRepetition(5, index);
  }

  /**
   * Removes a repetition of Other QRY Subject Filter (QRF-5) at a given index and returns it.
   * @param index The index
   */
  public ST removeOtherQRYSubjectFilter(int index) throws HL7Exception {
     return (ST) super.removeRepetition(5, index);
  }

  /**
   * Returns a single repetition of Other QRY Subject Filter (QRF-5).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public ST getQrf5_OtherQRYSubjectFilter(int rep) throws HL7Exception {
    ST ret = null;
    try {
        Type t = this.getField(5, rep);
        ret = (ST)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Other QRY Subject Filter (QRF-5).
   */
  public ST[] getQrf5_OtherQRYSubjectFilter() {
     ST[] ret = null;
    try {
        Type[] t = this.getField(5);  
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
   * Returns a count of the number of repetitions of Other QRY Subject Filter (QRF-5).
   */
  public int getQrf5_OtherQRYSubjectFilterReps() {
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
   * Inserts a repetition of Other QRY Subject Filter (QRF-5) at a given index and returns it.
   * @param index The index
   */
  public ST insertQrf5_OtherQRYSubjectFilter(int index) throws HL7Exception {
     return (ST) super.insertRepetition(5, index);
  }

  /**
   * Removes a repetition of Other QRY Subject Filter (QRF-5) at a given index and returns it.
   * @param index The index
   */
  public ST removeQrf5_OtherQRYSubjectFilter(int index) throws HL7Exception {
     return (ST) super.removeRepetition(5, index);
  }

  /**
   * Returns a single repetition of Which Date/Time Qualifier (QRF-6).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public ID getWhichDateTimeQualifier(int rep) throws HL7Exception {
    ID ret = null;
    try {
        Type t = this.getField(6, rep);
        ret = (ID)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Which Date/Time Qualifier (QRF-6).
   */
  public ID[] getWhichDateTimeQualifier() {
     ID[] ret = null;
    try {
        Type[] t = this.getField(6);  
        ret = new ID[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (ID)t[i];
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
   * Returns a count of the number of repetitions of Which Date/Time Qualifier (QRF-6).
   */
  public int getWhichDateTimeQualifierReps() {
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
   * Inserts a repetition of Which Date/Time Qualifier (QRF-6) at a given index and returns it.
   * @param index The index
   */
  public ID insertWhichDateTimeQualifier(int index) throws HL7Exception {
     return (ID) super.insertRepetition(6, index);
  }

  /**
   * Removes a repetition of Which Date/Time Qualifier (QRF-6) at a given index and returns it.
   * @param index The index
   */
  public ID removeWhichDateTimeQualifier(int index) throws HL7Exception {
     return (ID) super.removeRepetition(6, index);
  }

  /**
   * Returns a single repetition of Which Date/Time Qualifier (QRF-6).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public ID getQrf6_WhichDateTimeQualifier(int rep) throws HL7Exception {
    ID ret = null;
    try {
        Type t = this.getField(6, rep);
        ret = (ID)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Which Date/Time Qualifier (QRF-6).
   */
  public ID[] getQrf6_WhichDateTimeQualifier() {
     ID[] ret = null;
    try {
        Type[] t = this.getField(6);  
        ret = new ID[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (ID)t[i];
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
   * Returns a count of the number of repetitions of Which Date/Time Qualifier (QRF-6).
   */
  public int getQrf6_WhichDateTimeQualifierReps() {
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
   * Inserts a repetition of Which Date/Time Qualifier (QRF-6) at a given index and returns it.
   * @param index The index
   */
  public ID insertQrf6_WhichDateTimeQualifier(int index) throws HL7Exception {
     return (ID) super.insertRepetition(6, index);
  }

  /**
   * Removes a repetition of Which Date/Time Qualifier (QRF-6) at a given index and returns it.
   * @param index The index
   */
  public ID removeQrf6_WhichDateTimeQualifier(int index) throws HL7Exception {
     return (ID) super.removeRepetition(6, index);
  }

  /**
   * Returns a single repetition of Which Date/Time Status Qualifier (QRF-7).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public ID getWhichDateTimeStatusQualifier(int rep) throws HL7Exception {
    ID ret = null;
    try {
        Type t = this.getField(7, rep);
        ret = (ID)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Which Date/Time Status Qualifier (QRF-7).
   */
  public ID[] getWhichDateTimeStatusQualifier() {
     ID[] ret = null;
    try {
        Type[] t = this.getField(7);  
        ret = new ID[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (ID)t[i];
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
   * Returns a count of the number of repetitions of Which Date/Time Status Qualifier (QRF-7).
   */
  public int getWhichDateTimeStatusQualifierReps() {
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
   * Inserts a repetition of Which Date/Time Status Qualifier (QRF-7) at a given index and returns it.
   * @param index The index
   */
  public ID insertWhichDateTimeStatusQualifier(int index) throws HL7Exception {
     return (ID) super.insertRepetition(7, index);
  }

  /**
   * Removes a repetition of Which Date/Time Status Qualifier (QRF-7) at a given index and returns it.
   * @param index The index
   */
  public ID removeWhichDateTimeStatusQualifier(int index) throws HL7Exception {
     return (ID) super.removeRepetition(7, index);
  }

  /**
   * Returns a single repetition of Which Date/Time Status Qualifier (QRF-7).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public ID getQrf7_WhichDateTimeStatusQualifier(int rep) throws HL7Exception {
    ID ret = null;
    try {
        Type t = this.getField(7, rep);
        ret = (ID)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Which Date/Time Status Qualifier (QRF-7).
   */
  public ID[] getQrf7_WhichDateTimeStatusQualifier() {
     ID[] ret = null;
    try {
        Type[] t = this.getField(7);  
        ret = new ID[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (ID)t[i];
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
   * Returns a count of the number of repetitions of Which Date/Time Status Qualifier (QRF-7).
   */
  public int getQrf7_WhichDateTimeStatusQualifierReps() {
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
   * Inserts a repetition of Which Date/Time Status Qualifier (QRF-7) at a given index and returns it.
   * @param index The index
   */
  public ID insertQrf7_WhichDateTimeStatusQualifier(int index) throws HL7Exception {
     return (ID) super.insertRepetition(7, index);
  }

  /**
   * Removes a repetition of Which Date/Time Status Qualifier (QRF-7) at a given index and returns it.
   * @param index The index
   */
  public ID removeQrf7_WhichDateTimeStatusQualifier(int index) throws HL7Exception {
     return (ID) super.removeRepetition(7, index);
  }

  /**
   * Returns a single repetition of Date/Time Selection Qualifier (QRF-8).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public ID getDateTimeSelectionQualifier(int rep) throws HL7Exception {
    ID ret = null;
    try {
        Type t = this.getField(8, rep);
        ret = (ID)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Date/Time Selection Qualifier (QRF-8).
   */
  public ID[] getDateTimeSelectionQualifier() {
     ID[] ret = null;
    try {
        Type[] t = this.getField(8);  
        ret = new ID[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (ID)t[i];
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
   * Returns a count of the number of repetitions of Date/Time Selection Qualifier (QRF-8).
   */
  public int getDateTimeSelectionQualifierReps() {
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
   * Inserts a repetition of Date/Time Selection Qualifier (QRF-8) at a given index and returns it.
   * @param index The index
   */
  public ID insertDateTimeSelectionQualifier(int index) throws HL7Exception {
     return (ID) super.insertRepetition(8, index);
  }

  /**
   * Removes a repetition of Date/Time Selection Qualifier (QRF-8) at a given index and returns it.
   * @param index The index
   */
  public ID removeDateTimeSelectionQualifier(int index) throws HL7Exception {
     return (ID) super.removeRepetition(8, index);
  }

  /**
   * Returns a single repetition of Date/Time Selection Qualifier (QRF-8).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public ID getQrf8_DateTimeSelectionQualifier(int rep) throws HL7Exception {
    ID ret = null;
    try {
        Type t = this.getField(8, rep);
        ret = (ID)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Date/Time Selection Qualifier (QRF-8).
   */
  public ID[] getQrf8_DateTimeSelectionQualifier() {
     ID[] ret = null;
    try {
        Type[] t = this.getField(8);  
        ret = new ID[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (ID)t[i];
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
   * Returns a count of the number of repetitions of Date/Time Selection Qualifier (QRF-8).
   */
  public int getQrf8_DateTimeSelectionQualifierReps() {
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
   * Inserts a repetition of Date/Time Selection Qualifier (QRF-8) at a given index and returns it.
   * @param index The index
   */
  public ID insertQrf8_DateTimeSelectionQualifier(int index) throws HL7Exception {
     return (ID) super.insertRepetition(8, index);
  }

  /**
   * Removes a repetition of Date/Time Selection Qualifier (QRF-8) at a given index and returns it.
   * @param index The index
   */
  public ID removeQrf8_DateTimeSelectionQualifier(int index) throws HL7Exception {
     return (ID) super.removeRepetition(8, index);
  }

  /**
   * Returns When Quantity/Timing Qualifier (QRF-9).
   */
  public TQ getWhenQuantityTimingQualifier()  {
    TQ ret = null;
    try {
        Type t = this.getField(9, 0);
        ret = (TQ)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns When Quantity/Timing Qualifier (QRF-9).
   */
  public TQ getQrf9_WhenQuantityTimingQualifier()  {
    TQ ret = null;
    try {
        Type t = this.getField(9, 0);
        ret = (TQ)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns Search Confidence Threshold (QRF-10).
   */
  public NM getSearchConfidenceThreshold()  {
    NM ret = null;
    try {
        Type t = this.getField(10, 0);
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
   * Returns Search Confidence Threshold (QRF-10).
   */
  public NM getQrf10_SearchConfidenceThreshold()  {
    NM ret = null;
    try {
        Type t = this.getField(10, 0);
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

   protected Type createNewTypeWithoutReflection(int field) {
      switch (field) {
         case 0: return new ca.uhn.hl7v2.model.v26.datatype.ST(getMessage());
         case 1: return new ca.uhn.hl7v2.model.v26.datatype.DTM(getMessage());
         case 2: return new ca.uhn.hl7v2.model.v26.datatype.DTM(getMessage());
         case 3: return new ca.uhn.hl7v2.model.v26.datatype.ST(getMessage());
         case 4: return new ca.uhn.hl7v2.model.v26.datatype.ST(getMessage());
         case 5: return new ca.uhn.hl7v2.model.v26.datatype.ID(getMessage(), new Integer(156));
         case 6: return new ca.uhn.hl7v2.model.v26.datatype.ID(getMessage(), new Integer(157));
         case 7: return new ca.uhn.hl7v2.model.v26.datatype.ID(getMessage(), new Integer(158));
         case 8: return new ca.uhn.hl7v2.model.v26.datatype.TQ(getMessage());
         case 9: return new ca.uhn.hl7v2.model.v26.datatype.NM(getMessage());
         default: return null;
      }
   }

}