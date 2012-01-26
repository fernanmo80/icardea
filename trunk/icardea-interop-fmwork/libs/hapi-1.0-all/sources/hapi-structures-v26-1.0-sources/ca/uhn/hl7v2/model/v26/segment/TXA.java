package ca.uhn.hl7v2.model.v26.segment;

import ca.uhn.hl7v2.model.*;
import ca.uhn.hl7v2.model.v26.datatype.*;
import ca.uhn.log.HapiLogFactory;
import ca.uhn.hl7v2.parser.ModelClassFactory;
import ca.uhn.hl7v2.HL7Exception;

/**
 * <p>Represents an HL7 TXA message segment. 
 * This segment has the following fields:</p><p>
 * TXA-1: Set ID- TXA (SI)<br> 
 * TXA-2: Document Type (IS)<br> 
 * TXA-3: Document Content Presentation (ID)<br> 
 * TXA-4: Activity Date/Time (DTM)<br> 
 * TXA-5: Primary Activity Provider Code/Name (XCN)<br> 
 * TXA-6: Origination Date/Time (DTM)<br> 
 * TXA-7: Transcription Date/Time (DTM)<br> 
 * TXA-8: Edit Date/Time (DTM)<br> 
 * TXA-9: Originator Code/Name (XCN)<br> 
 * TXA-10: Assigned Document Authenticator (XCN)<br> 
 * TXA-11: Transcriptionist Code/Name (XCN)<br> 
 * TXA-12: Unique Document Number (EI)<br> 
 * TXA-13: Parent Document Number (EI)<br> 
 * TXA-14: Placer Order Number (EI)<br> 
 * TXA-15: Filler Order Number (EI)<br> 
 * TXA-16: Unique Document File Name (ST)<br> 
 * TXA-17: Document Completion Status (ID)<br> 
 * TXA-18: Document Confidentiality Status (ID)<br> 
 * TXA-19: Document Availability Status (ID)<br> 
 * TXA-20: Document Storage Status (ID)<br> 
 * TXA-21: Document Change Reason (ST)<br> 
 * TXA-22: Authentication Person, Time Stamp (set) (PPN)<br> 
 * TXA-23: Distributed Copies (Code and Name of Recipient(s) ) (XCN)<br> 
 * </p><p>The get...() methods return data from individual fields.  These methods 
 * do not throw exceptions and may therefore have to handle exceptions internally.  
 * If an exception is handled internally, it is logged and null is returned.  
 * This is not expected to happen - if it does happen this indicates not so much 
 * an exceptional circumstance as a bug in the code for this class.</p>    
 */
public class TXA extends AbstractSegment  {

  /**
   * Creates a TXA (Transcription Document Header) segment object that belongs to the given 
   * message.  
   */
  public TXA(Group parent, ModelClassFactory factory) {
    super(parent, factory);
    Message message = getMessage();
    try {
       this.add(SI.class, true, 1, 4, new Object[]{message}, "Set ID- TXA");
       this.add(IS.class, true, 1, 30, new Object[]{message, new Integer(270)}, "Document Type");
       this.add(ID.class, false, 1, 2, new Object[]{message, new Integer(191)}, "Document Content Presentation");
       this.add(DTM.class, false, 1, 24, new Object[]{message}, "Activity Date/Time");
       this.add(XCN.class, false, 0, 250, new Object[]{message}, "Primary Activity Provider Code/Name");
       this.add(DTM.class, false, 1, 24, new Object[]{message}, "Origination Date/Time");
       this.add(DTM.class, false, 1, 24, new Object[]{message}, "Transcription Date/Time");
       this.add(DTM.class, false, 0, 24, new Object[]{message}, "Edit Date/Time");
       this.add(XCN.class, false, 0, 250, new Object[]{message}, "Originator Code/Name");
       this.add(XCN.class, false, 0, 250, new Object[]{message}, "Assigned Document Authenticator");
       this.add(XCN.class, false, 0, 250, new Object[]{message}, "Transcriptionist Code/Name");
       this.add(EI.class, true, 1, 427, new Object[]{message}, "Unique Document Number");
       this.add(EI.class, false, 1, 427, new Object[]{message}, "Parent Document Number");
       this.add(EI.class, false, 0, 427, new Object[]{message}, "Placer Order Number");
       this.add(EI.class, false, 1, 427, new Object[]{message}, "Filler Order Number");
       this.add(ST.class, false, 1, 30, new Object[]{message}, "Unique Document File Name");
       this.add(ID.class, true, 1, 2, new Object[]{message, new Integer(271)}, "Document Completion Status");
       this.add(ID.class, false, 1, 2, new Object[]{message, new Integer(272)}, "Document Confidentiality Status");
       this.add(ID.class, false, 1, 2, new Object[]{message, new Integer(273)}, "Document Availability Status");
       this.add(ID.class, false, 1, 2, new Object[]{message, new Integer(275)}, "Document Storage Status");
       this.add(ST.class, false, 1, 30, new Object[]{message}, "Document Change Reason");
       this.add(PPN.class, false, 0, 250, new Object[]{message}, "Authentication Person, Time Stamp (set)");
       this.add(XCN.class, false, 0, 250, new Object[]{message}, "Distributed Copies (Code and Name of Recipient(s) )");
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Can't instantiate " + this.getClass().getName(), he);
    }
  }

  /**
   * Returns Set ID- TXA (TXA-1).
   */
  public SI getSetIDTXA()  {
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
   * Returns Set ID- TXA (TXA-1).
   */
  public SI getTxa1_SetIDTXA()  {
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
   * Returns Document Type (TXA-2).
   */
  public IS getDocumentType()  {
    IS ret = null;
    try {
        Type t = this.getField(2, 0);
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
   * Returns Document Type (TXA-2).
   */
  public IS getTxa2_DocumentType()  {
    IS ret = null;
    try {
        Type t = this.getField(2, 0);
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
   * Returns Document Content Presentation (TXA-3).
   */
  public ID getDocumentContentPresentation()  {
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
   * Returns Document Content Presentation (TXA-3).
   */
  public ID getTxa3_DocumentContentPresentation()  {
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
   * Returns Activity Date/Time (TXA-4).
   */
  public DTM getActivityDateTime()  {
    DTM ret = null;
    try {
        Type t = this.getField(4, 0);
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
   * Returns Activity Date/Time (TXA-4).
   */
  public DTM getTxa4_ActivityDateTime()  {
    DTM ret = null;
    try {
        Type t = this.getField(4, 0);
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
   * Returns a single repetition of Primary Activity Provider Code/Name (TXA-5).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XCN getPrimaryActivityProviderCodeName(int rep) throws HL7Exception {
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
   * Returns all repetitions of Primary Activity Provider Code/Name (TXA-5).
   */
  public XCN[] getPrimaryActivityProviderCodeName() {
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
   * Returns a count of the number of repetitions of Primary Activity Provider Code/Name (TXA-5).
   */
  public int getPrimaryActivityProviderCodeNameReps() {
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
   * Inserts a repetition of Primary Activity Provider Code/Name (TXA-5) at a given index and returns it.
   * @param index The index
   */
  public XCN insertPrimaryActivityProviderCodeName(int index) throws HL7Exception {
     return (XCN) super.insertRepetition(5, index);
  }

  /**
   * Removes a repetition of Primary Activity Provider Code/Name (TXA-5) at a given index and returns it.
   * @param index The index
   */
  public XCN removePrimaryActivityProviderCodeName(int index) throws HL7Exception {
     return (XCN) super.removeRepetition(5, index);
  }

  /**
   * Returns a single repetition of Primary Activity Provider Code/Name (TXA-5).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XCN getTxa5_PrimaryActivityProviderCodeName(int rep) throws HL7Exception {
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
   * Returns all repetitions of Primary Activity Provider Code/Name (TXA-5).
   */
  public XCN[] getTxa5_PrimaryActivityProviderCodeName() {
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
   * Returns a count of the number of repetitions of Primary Activity Provider Code/Name (TXA-5).
   */
  public int getTxa5_PrimaryActivityProviderCodeNameReps() {
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
   * Inserts a repetition of Primary Activity Provider Code/Name (TXA-5) at a given index and returns it.
   * @param index The index
   */
  public XCN insertTxa5_PrimaryActivityProviderCodeName(int index) throws HL7Exception {
     return (XCN) super.insertRepetition(5, index);
  }

  /**
   * Removes a repetition of Primary Activity Provider Code/Name (TXA-5) at a given index and returns it.
   * @param index The index
   */
  public XCN removeTxa5_PrimaryActivityProviderCodeName(int index) throws HL7Exception {
     return (XCN) super.removeRepetition(5, index);
  }

  /**
   * Returns Origination Date/Time (TXA-6).
   */
  public DTM getOriginationDateTime()  {
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
   * Returns Origination Date/Time (TXA-6).
   */
  public DTM getTxa6_OriginationDateTime()  {
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
   * Returns Transcription Date/Time (TXA-7).
   */
  public DTM getTranscriptionDateTime()  {
    DTM ret = null;
    try {
        Type t = this.getField(7, 0);
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
   * Returns Transcription Date/Time (TXA-7).
   */
  public DTM getTxa7_TranscriptionDateTime()  {
    DTM ret = null;
    try {
        Type t = this.getField(7, 0);
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
   * Returns a single repetition of Edit Date/Time (TXA-8).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public DTM getEditDateTime(int rep) throws HL7Exception {
    DTM ret = null;
    try {
        Type t = this.getField(8, rep);
        ret = (DTM)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Edit Date/Time (TXA-8).
   */
  public DTM[] getEditDateTime() {
     DTM[] ret = null;
    try {
        Type[] t = this.getField(8);  
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
   * Returns a count of the number of repetitions of Edit Date/Time (TXA-8).
   */
  public int getEditDateTimeReps() {
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
   * Inserts a repetition of Edit Date/Time (TXA-8) at a given index and returns it.
   * @param index The index
   */
  public DTM insertEditDateTime(int index) throws HL7Exception {
     return (DTM) super.insertRepetition(8, index);
  }

  /**
   * Removes a repetition of Edit Date/Time (TXA-8) at a given index and returns it.
   * @param index The index
   */
  public DTM removeEditDateTime(int index) throws HL7Exception {
     return (DTM) super.removeRepetition(8, index);
  }

  /**
   * Returns a single repetition of Edit Date/Time (TXA-8).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public DTM getTxa8_EditDateTime(int rep) throws HL7Exception {
    DTM ret = null;
    try {
        Type t = this.getField(8, rep);
        ret = (DTM)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Edit Date/Time (TXA-8).
   */
  public DTM[] getTxa8_EditDateTime() {
     DTM[] ret = null;
    try {
        Type[] t = this.getField(8);  
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
   * Returns a count of the number of repetitions of Edit Date/Time (TXA-8).
   */
  public int getTxa8_EditDateTimeReps() {
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
   * Inserts a repetition of Edit Date/Time (TXA-8) at a given index and returns it.
   * @param index The index
   */
  public DTM insertTxa8_EditDateTime(int index) throws HL7Exception {
     return (DTM) super.insertRepetition(8, index);
  }

  /**
   * Removes a repetition of Edit Date/Time (TXA-8) at a given index and returns it.
   * @param index The index
   */
  public DTM removeTxa8_EditDateTime(int index) throws HL7Exception {
     return (DTM) super.removeRepetition(8, index);
  }

  /**
   * Returns a single repetition of Originator Code/Name (TXA-9).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XCN getOriginatorCodeName(int rep) throws HL7Exception {
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
   * Returns all repetitions of Originator Code/Name (TXA-9).
   */
  public XCN[] getOriginatorCodeName() {
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
   * Returns a count of the number of repetitions of Originator Code/Name (TXA-9).
   */
  public int getOriginatorCodeNameReps() {
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
   * Inserts a repetition of Originator Code/Name (TXA-9) at a given index and returns it.
   * @param index The index
   */
  public XCN insertOriginatorCodeName(int index) throws HL7Exception {
     return (XCN) super.insertRepetition(9, index);
  }

  /**
   * Removes a repetition of Originator Code/Name (TXA-9) at a given index and returns it.
   * @param index The index
   */
  public XCN removeOriginatorCodeName(int index) throws HL7Exception {
     return (XCN) super.removeRepetition(9, index);
  }

  /**
   * Returns a single repetition of Originator Code/Name (TXA-9).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XCN getTxa9_OriginatorCodeName(int rep) throws HL7Exception {
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
   * Returns all repetitions of Originator Code/Name (TXA-9).
   */
  public XCN[] getTxa9_OriginatorCodeName() {
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
   * Returns a count of the number of repetitions of Originator Code/Name (TXA-9).
   */
  public int getTxa9_OriginatorCodeNameReps() {
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
   * Inserts a repetition of Originator Code/Name (TXA-9) at a given index and returns it.
   * @param index The index
   */
  public XCN insertTxa9_OriginatorCodeName(int index) throws HL7Exception {
     return (XCN) super.insertRepetition(9, index);
  }

  /**
   * Removes a repetition of Originator Code/Name (TXA-9) at a given index and returns it.
   * @param index The index
   */
  public XCN removeTxa9_OriginatorCodeName(int index) throws HL7Exception {
     return (XCN) super.removeRepetition(9, index);
  }

  /**
   * Returns a single repetition of Assigned Document Authenticator (TXA-10).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XCN getAssignedDocumentAuthenticator(int rep) throws HL7Exception {
    XCN ret = null;
    try {
        Type t = this.getField(10, rep);
        ret = (XCN)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Assigned Document Authenticator (TXA-10).
   */
  public XCN[] getAssignedDocumentAuthenticator() {
     XCN[] ret = null;
    try {
        Type[] t = this.getField(10);  
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
   * Returns a count of the number of repetitions of Assigned Document Authenticator (TXA-10).
   */
  public int getAssignedDocumentAuthenticatorReps() {
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
   * Inserts a repetition of Assigned Document Authenticator (TXA-10) at a given index and returns it.
   * @param index The index
   */
  public XCN insertAssignedDocumentAuthenticator(int index) throws HL7Exception {
     return (XCN) super.insertRepetition(10, index);
  }

  /**
   * Removes a repetition of Assigned Document Authenticator (TXA-10) at a given index and returns it.
   * @param index The index
   */
  public XCN removeAssignedDocumentAuthenticator(int index) throws HL7Exception {
     return (XCN) super.removeRepetition(10, index);
  }

  /**
   * Returns a single repetition of Assigned Document Authenticator (TXA-10).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XCN getTxa10_AssignedDocumentAuthenticator(int rep) throws HL7Exception {
    XCN ret = null;
    try {
        Type t = this.getField(10, rep);
        ret = (XCN)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Assigned Document Authenticator (TXA-10).
   */
  public XCN[] getTxa10_AssignedDocumentAuthenticator() {
     XCN[] ret = null;
    try {
        Type[] t = this.getField(10);  
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
   * Returns a count of the number of repetitions of Assigned Document Authenticator (TXA-10).
   */
  public int getTxa10_AssignedDocumentAuthenticatorReps() {
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
   * Inserts a repetition of Assigned Document Authenticator (TXA-10) at a given index and returns it.
   * @param index The index
   */
  public XCN insertTxa10_AssignedDocumentAuthenticator(int index) throws HL7Exception {
     return (XCN) super.insertRepetition(10, index);
  }

  /**
   * Removes a repetition of Assigned Document Authenticator (TXA-10) at a given index and returns it.
   * @param index The index
   */
  public XCN removeTxa10_AssignedDocumentAuthenticator(int index) throws HL7Exception {
     return (XCN) super.removeRepetition(10, index);
  }

  /**
   * Returns a single repetition of Transcriptionist Code/Name (TXA-11).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XCN getTranscriptionistCodeName(int rep) throws HL7Exception {
    XCN ret = null;
    try {
        Type t = this.getField(11, rep);
        ret = (XCN)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Transcriptionist Code/Name (TXA-11).
   */
  public XCN[] getTranscriptionistCodeName() {
     XCN[] ret = null;
    try {
        Type[] t = this.getField(11);  
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
   * Returns a count of the number of repetitions of Transcriptionist Code/Name (TXA-11).
   */
  public int getTranscriptionistCodeNameReps() {
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
   * Inserts a repetition of Transcriptionist Code/Name (TXA-11) at a given index and returns it.
   * @param index The index
   */
  public XCN insertTranscriptionistCodeName(int index) throws HL7Exception {
     return (XCN) super.insertRepetition(11, index);
  }

  /**
   * Removes a repetition of Transcriptionist Code/Name (TXA-11) at a given index and returns it.
   * @param index The index
   */
  public XCN removeTranscriptionistCodeName(int index) throws HL7Exception {
     return (XCN) super.removeRepetition(11, index);
  }

  /**
   * Returns a single repetition of Transcriptionist Code/Name (TXA-11).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XCN getTxa11_TranscriptionistCodeName(int rep) throws HL7Exception {
    XCN ret = null;
    try {
        Type t = this.getField(11, rep);
        ret = (XCN)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Transcriptionist Code/Name (TXA-11).
   */
  public XCN[] getTxa11_TranscriptionistCodeName() {
     XCN[] ret = null;
    try {
        Type[] t = this.getField(11);  
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
   * Returns a count of the number of repetitions of Transcriptionist Code/Name (TXA-11).
   */
  public int getTxa11_TranscriptionistCodeNameReps() {
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
   * Inserts a repetition of Transcriptionist Code/Name (TXA-11) at a given index and returns it.
   * @param index The index
   */
  public XCN insertTxa11_TranscriptionistCodeName(int index) throws HL7Exception {
     return (XCN) super.insertRepetition(11, index);
  }

  /**
   * Removes a repetition of Transcriptionist Code/Name (TXA-11) at a given index and returns it.
   * @param index The index
   */
  public XCN removeTxa11_TranscriptionistCodeName(int index) throws HL7Exception {
     return (XCN) super.removeRepetition(11, index);
  }

  /**
   * Returns Unique Document Number (TXA-12).
   */
  public EI getUniqueDocumentNumber()  {
    EI ret = null;
    try {
        Type t = this.getField(12, 0);
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
   * Returns Unique Document Number (TXA-12).
   */
  public EI getTxa12_UniqueDocumentNumber()  {
    EI ret = null;
    try {
        Type t = this.getField(12, 0);
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
   * Returns Parent Document Number (TXA-13).
   */
  public EI getParentDocumentNumber()  {
    EI ret = null;
    try {
        Type t = this.getField(13, 0);
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
   * Returns Parent Document Number (TXA-13).
   */
  public EI getTxa13_ParentDocumentNumber()  {
    EI ret = null;
    try {
        Type t = this.getField(13, 0);
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
   * Returns a single repetition of Placer Order Number (TXA-14).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public EI getPlacerOrderNumber(int rep) throws HL7Exception {
    EI ret = null;
    try {
        Type t = this.getField(14, rep);
        ret = (EI)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Placer Order Number (TXA-14).
   */
  public EI[] getPlacerOrderNumber() {
     EI[] ret = null;
    try {
        Type[] t = this.getField(14);  
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
   * Returns a count of the number of repetitions of Placer Order Number (TXA-14).
   */
  public int getPlacerOrderNumberReps() {
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
   * Inserts a repetition of Placer Order Number (TXA-14) at a given index and returns it.
   * @param index The index
   */
  public EI insertPlacerOrderNumber(int index) throws HL7Exception {
     return (EI) super.insertRepetition(14, index);
  }

  /**
   * Removes a repetition of Placer Order Number (TXA-14) at a given index and returns it.
   * @param index The index
   */
  public EI removePlacerOrderNumber(int index) throws HL7Exception {
     return (EI) super.removeRepetition(14, index);
  }

  /**
   * Returns a single repetition of Placer Order Number (TXA-14).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public EI getTxa14_PlacerOrderNumber(int rep) throws HL7Exception {
    EI ret = null;
    try {
        Type t = this.getField(14, rep);
        ret = (EI)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Placer Order Number (TXA-14).
   */
  public EI[] getTxa14_PlacerOrderNumber() {
     EI[] ret = null;
    try {
        Type[] t = this.getField(14);  
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
   * Returns a count of the number of repetitions of Placer Order Number (TXA-14).
   */
  public int getTxa14_PlacerOrderNumberReps() {
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
   * Inserts a repetition of Placer Order Number (TXA-14) at a given index and returns it.
   * @param index The index
   */
  public EI insertTxa14_PlacerOrderNumber(int index) throws HL7Exception {
     return (EI) super.insertRepetition(14, index);
  }

  /**
   * Removes a repetition of Placer Order Number (TXA-14) at a given index and returns it.
   * @param index The index
   */
  public EI removeTxa14_PlacerOrderNumber(int index) throws HL7Exception {
     return (EI) super.removeRepetition(14, index);
  }

  /**
   * Returns Filler Order Number (TXA-15).
   */
  public EI getFillerOrderNumber()  {
    EI ret = null;
    try {
        Type t = this.getField(15, 0);
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
   * Returns Filler Order Number (TXA-15).
   */
  public EI getTxa15_FillerOrderNumber()  {
    EI ret = null;
    try {
        Type t = this.getField(15, 0);
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
   * Returns Unique Document File Name (TXA-16).
   */
  public ST getUniqueDocumentFileName()  {
    ST ret = null;
    try {
        Type t = this.getField(16, 0);
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
   * Returns Unique Document File Name (TXA-16).
   */
  public ST getTxa16_UniqueDocumentFileName()  {
    ST ret = null;
    try {
        Type t = this.getField(16, 0);
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
   * Returns Document Completion Status (TXA-17).
   */
  public ID getDocumentCompletionStatus()  {
    ID ret = null;
    try {
        Type t = this.getField(17, 0);
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
   * Returns Document Completion Status (TXA-17).
   */
  public ID getTxa17_DocumentCompletionStatus()  {
    ID ret = null;
    try {
        Type t = this.getField(17, 0);
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
   * Returns Document Confidentiality Status (TXA-18).
   */
  public ID getDocumentConfidentialityStatus()  {
    ID ret = null;
    try {
        Type t = this.getField(18, 0);
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
   * Returns Document Confidentiality Status (TXA-18).
   */
  public ID getTxa18_DocumentConfidentialityStatus()  {
    ID ret = null;
    try {
        Type t = this.getField(18, 0);
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
   * Returns Document Availability Status (TXA-19).
   */
  public ID getDocumentAvailabilityStatus()  {
    ID ret = null;
    try {
        Type t = this.getField(19, 0);
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
   * Returns Document Availability Status (TXA-19).
   */
  public ID getTxa19_DocumentAvailabilityStatus()  {
    ID ret = null;
    try {
        Type t = this.getField(19, 0);
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
   * Returns Document Storage Status (TXA-20).
   */
  public ID getDocumentStorageStatus()  {
    ID ret = null;
    try {
        Type t = this.getField(20, 0);
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
   * Returns Document Storage Status (TXA-20).
   */
  public ID getTxa20_DocumentStorageStatus()  {
    ID ret = null;
    try {
        Type t = this.getField(20, 0);
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
   * Returns Document Change Reason (TXA-21).
   */
  public ST getDocumentChangeReason()  {
    ST ret = null;
    try {
        Type t = this.getField(21, 0);
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
   * Returns Document Change Reason (TXA-21).
   */
  public ST getTxa21_DocumentChangeReason()  {
    ST ret = null;
    try {
        Type t = this.getField(21, 0);
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
   * Returns a single repetition of Authentication Person, Time Stamp (set) (TXA-22).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public PPN getAuthenticationPersonTimeStampSet(int rep) throws HL7Exception {
    PPN ret = null;
    try {
        Type t = this.getField(22, rep);
        ret = (PPN)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Authentication Person, Time Stamp (set) (TXA-22).
   */
  public PPN[] getAuthenticationPersonTimeStampSet() {
     PPN[] ret = null;
    try {
        Type[] t = this.getField(22);  
        ret = new PPN[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (PPN)t[i];
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
   * Returns a count of the number of repetitions of Authentication Person, Time Stamp (set) (TXA-22).
   */
  public int getAuthenticationPersonTimeStampSetReps() {
    try {
        return this.getField(22).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Authentication Person, Time Stamp (set) (TXA-22) at a given index and returns it.
   * @param index The index
   */
  public PPN insertAuthenticationPersonTimeStampSet(int index) throws HL7Exception {
     return (PPN) super.insertRepetition(22, index);
  }

  /**
   * Removes a repetition of Authentication Person, Time Stamp (set) (TXA-22) at a given index and returns it.
   * @param index The index
   */
  public PPN removeAuthenticationPersonTimeStampSet(int index) throws HL7Exception {
     return (PPN) super.removeRepetition(22, index);
  }

  /**
   * Returns a single repetition of Authentication Person, Time Stamp (set) (TXA-22).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public PPN getTxa22_AuthenticationPersonTimeStampSet(int rep) throws HL7Exception {
    PPN ret = null;
    try {
        Type t = this.getField(22, rep);
        ret = (PPN)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Authentication Person, Time Stamp (set) (TXA-22).
   */
  public PPN[] getTxa22_AuthenticationPersonTimeStampSet() {
     PPN[] ret = null;
    try {
        Type[] t = this.getField(22);  
        ret = new PPN[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (PPN)t[i];
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
   * Returns a count of the number of repetitions of Authentication Person, Time Stamp (set) (TXA-22).
   */
  public int getTxa22_AuthenticationPersonTimeStampSetReps() {
    try {
        return this.getField(22).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Authentication Person, Time Stamp (set) (TXA-22) at a given index and returns it.
   * @param index The index
   */
  public PPN insertTxa22_AuthenticationPersonTimeStampSet(int index) throws HL7Exception {
     return (PPN) super.insertRepetition(22, index);
  }

  /**
   * Removes a repetition of Authentication Person, Time Stamp (set) (TXA-22) at a given index and returns it.
   * @param index The index
   */
  public PPN removeTxa22_AuthenticationPersonTimeStampSet(int index) throws HL7Exception {
     return (PPN) super.removeRepetition(22, index);
  }

  /**
   * Returns a single repetition of Distributed Copies (Code and Name of Recipient(s) ) (TXA-23).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XCN getDistributedCopiesCodeandNameofRecipients(int rep) throws HL7Exception {
    XCN ret = null;
    try {
        Type t = this.getField(23, rep);
        ret = (XCN)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Distributed Copies (Code and Name of Recipient(s) ) (TXA-23).
   */
  public XCN[] getDistributedCopiesCodeandNameofRecipients() {
     XCN[] ret = null;
    try {
        Type[] t = this.getField(23);  
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
   * Returns a count of the number of repetitions of Distributed Copies (Code and Name of Recipient(s) ) (TXA-23).
   */
  public int getDistributedCopiesCodeandNameofRecipientsReps() {
    try {
        return this.getField(23).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Distributed Copies (Code and Name of Recipient(s) ) (TXA-23) at a given index and returns it.
   * @param index The index
   */
  public XCN insertDistributedCopiesCodeandNameofRecipients(int index) throws HL7Exception {
     return (XCN) super.insertRepetition(23, index);
  }

  /**
   * Removes a repetition of Distributed Copies (Code and Name of Recipient(s) ) (TXA-23) at a given index and returns it.
   * @param index The index
   */
  public XCN removeDistributedCopiesCodeandNameofRecipients(int index) throws HL7Exception {
     return (XCN) super.removeRepetition(23, index);
  }

  /**
   * Returns a single repetition of Distributed Copies (Code and Name of Recipient(s) ) (TXA-23).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XCN getTxa23_DistributedCopiesCodeandNameofRecipients(int rep) throws HL7Exception {
    XCN ret = null;
    try {
        Type t = this.getField(23, rep);
        ret = (XCN)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Distributed Copies (Code and Name of Recipient(s) ) (TXA-23).
   */
  public XCN[] getTxa23_DistributedCopiesCodeandNameofRecipients() {
     XCN[] ret = null;
    try {
        Type[] t = this.getField(23);  
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
   * Returns a count of the number of repetitions of Distributed Copies (Code and Name of Recipient(s) ) (TXA-23).
   */
  public int getTxa23_DistributedCopiesCodeandNameofRecipientsReps() {
    try {
        return this.getField(23).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Distributed Copies (Code and Name of Recipient(s) ) (TXA-23) at a given index and returns it.
   * @param index The index
   */
  public XCN insertTxa23_DistributedCopiesCodeandNameofRecipients(int index) throws HL7Exception {
     return (XCN) super.insertRepetition(23, index);
  }

  /**
   * Removes a repetition of Distributed Copies (Code and Name of Recipient(s) ) (TXA-23) at a given index and returns it.
   * @param index The index
   */
  public XCN removeTxa23_DistributedCopiesCodeandNameofRecipients(int index) throws HL7Exception {
     return (XCN) super.removeRepetition(23, index);
  }

   protected Type createNewTypeWithoutReflection(int field) {
      switch (field) {
         case 0: return new ca.uhn.hl7v2.model.v26.datatype.SI(getMessage());
         case 1: return new ca.uhn.hl7v2.model.v26.datatype.IS(getMessage(), new Integer(270));
         case 2: return new ca.uhn.hl7v2.model.v26.datatype.ID(getMessage(), new Integer(191));
         case 3: return new ca.uhn.hl7v2.model.v26.datatype.DTM(getMessage());
         case 4: return new ca.uhn.hl7v2.model.v26.datatype.XCN(getMessage());
         case 5: return new ca.uhn.hl7v2.model.v26.datatype.DTM(getMessage());
         case 6: return new ca.uhn.hl7v2.model.v26.datatype.DTM(getMessage());
         case 7: return new ca.uhn.hl7v2.model.v26.datatype.DTM(getMessage());
         case 8: return new ca.uhn.hl7v2.model.v26.datatype.XCN(getMessage());
         case 9: return new ca.uhn.hl7v2.model.v26.datatype.XCN(getMessage());
         case 10: return new ca.uhn.hl7v2.model.v26.datatype.XCN(getMessage());
         case 11: return new ca.uhn.hl7v2.model.v26.datatype.EI(getMessage());
         case 12: return new ca.uhn.hl7v2.model.v26.datatype.EI(getMessage());
         case 13: return new ca.uhn.hl7v2.model.v26.datatype.EI(getMessage());
         case 14: return new ca.uhn.hl7v2.model.v26.datatype.EI(getMessage());
         case 15: return new ca.uhn.hl7v2.model.v26.datatype.ST(getMessage());
         case 16: return new ca.uhn.hl7v2.model.v26.datatype.ID(getMessage(), new Integer(271));
         case 17: return new ca.uhn.hl7v2.model.v26.datatype.ID(getMessage(), new Integer(272));
         case 18: return new ca.uhn.hl7v2.model.v26.datatype.ID(getMessage(), new Integer(273));
         case 19: return new ca.uhn.hl7v2.model.v26.datatype.ID(getMessage(), new Integer(275));
         case 20: return new ca.uhn.hl7v2.model.v26.datatype.ST(getMessage());
         case 21: return new ca.uhn.hl7v2.model.v26.datatype.PPN(getMessage());
         case 22: return new ca.uhn.hl7v2.model.v26.datatype.XCN(getMessage());
         default: return null;
      }
   }

}