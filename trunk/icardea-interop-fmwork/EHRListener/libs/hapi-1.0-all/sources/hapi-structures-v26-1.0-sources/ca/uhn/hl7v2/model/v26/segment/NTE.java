package ca.uhn.hl7v2.model.v26.segment;

import ca.uhn.hl7v2.model.*;
import ca.uhn.hl7v2.model.v26.datatype.*;
import ca.uhn.log.HapiLogFactory;
import ca.uhn.hl7v2.parser.ModelClassFactory;
import ca.uhn.hl7v2.HL7Exception;

/**
 * <p>Represents an HL7 NTE message segment. 
 * This segment has the following fields:</p><p>
 * NTE-1: Set ID - NTE (SI)<br> 
 * NTE-2: Source of Comment (ID)<br> 
 * NTE-3: Comment (FT)<br> 
 * NTE-4: Comment Type (CWE)<br> 
 * NTE-5: Entered By (XCN)<br> 
 * NTE-6: Entered Date/Time (DTM)<br> 
 * NTE-7: Effective Start Date (DTM)<br> 
 * NTE-8: Expiration Date (DTM)<br> 
 * </p><p>The get...() methods return data from individual fields.  These methods 
 * do not throw exceptions and may therefore have to handle exceptions internally.  
 * If an exception is handled internally, it is logged and null is returned.  
 * This is not expected to happen - if it does happen this indicates not so much 
 * an exceptional circumstance as a bug in the code for this class.</p>    
 */
public class NTE extends AbstractSegment  {

  /**
   * Creates a NTE (Notes and Comments) segment object that belongs to the given 
   * message.  
   */
  public NTE(Group parent, ModelClassFactory factory) {
    super(parent, factory);
    Message message = getMessage();
    try {
       this.add(SI.class, false, 1, 4, new Object[]{message}, "Set ID - NTE");
       this.add(ID.class, false, 1, 8, new Object[]{message, new Integer(105)}, "Source of Comment");
       this.add(FT.class, false, 0, 65536, new Object[]{message}, "Comment");
       this.add(CWE.class, false, 1, 250, new Object[]{message}, "Comment Type");
       this.add(XCN.class, false, 1, 3220, new Object[]{message}, "Entered By");
       this.add(DTM.class, false, 1, 24, new Object[]{message}, "Entered Date/Time");
       this.add(DTM.class, false, 1, 24, new Object[]{message}, "Effective Start Date");
       this.add(DTM.class, false, 1, 24, new Object[]{message}, "Expiration Date");
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Can't instantiate " + this.getClass().getName(), he);
    }
  }

  /**
   * Returns Set ID - NTE (NTE-1).
   */
  public SI getSetIDNTE()  {
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
   * Returns Set ID - NTE (NTE-1).
   */
  public SI getNte1_SetIDNTE()  {
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
   * Returns Source of Comment (NTE-2).
   */
  public ID getSourceOfComment()  {
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
   * Returns Source of Comment (NTE-2).
   */
  public ID getNte2_SourceOfComment()  {
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
   * Returns a single repetition of Comment (NTE-3).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public FT getComment(int rep) throws HL7Exception {
    FT ret = null;
    try {
        Type t = this.getField(3, rep);
        ret = (FT)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Comment (NTE-3).
   */
  public FT[] getComment() {
     FT[] ret = null;
    try {
        Type[] t = this.getField(3);  
        ret = new FT[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (FT)t[i];
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
   * Returns a count of the number of repetitions of Comment (NTE-3).
   */
  public int getCommentReps() {
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
   * Inserts a repetition of Comment (NTE-3) at a given index and returns it.
   * @param index The index
   */
  public FT insertComment(int index) throws HL7Exception {
     return (FT) super.insertRepetition(3, index);
  }

  /**
   * Removes a repetition of Comment (NTE-3) at a given index and returns it.
   * @param index The index
   */
  public FT removeComment(int index) throws HL7Exception {
     return (FT) super.removeRepetition(3, index);
  }

  /**
   * Returns a single repetition of Comment (NTE-3).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public FT getNte3_Comment(int rep) throws HL7Exception {
    FT ret = null;
    try {
        Type t = this.getField(3, rep);
        ret = (FT)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Comment (NTE-3).
   */
  public FT[] getNte3_Comment() {
     FT[] ret = null;
    try {
        Type[] t = this.getField(3);  
        ret = new FT[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (FT)t[i];
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
   * Returns a count of the number of repetitions of Comment (NTE-3).
   */
  public int getNte3_CommentReps() {
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
   * Inserts a repetition of Comment (NTE-3) at a given index and returns it.
   * @param index The index
   */
  public FT insertNte3_Comment(int index) throws HL7Exception {
     return (FT) super.insertRepetition(3, index);
  }

  /**
   * Removes a repetition of Comment (NTE-3) at a given index and returns it.
   * @param index The index
   */
  public FT removeNte3_Comment(int index) throws HL7Exception {
     return (FT) super.removeRepetition(3, index);
  }

  /**
   * Returns Comment Type (NTE-4).
   */
  public CWE getCommentType()  {
    CWE ret = null;
    try {
        Type t = this.getField(4, 0);
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
   * Returns Comment Type (NTE-4).
   */
  public CWE getNte4_CommentType()  {
    CWE ret = null;
    try {
        Type t = this.getField(4, 0);
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
   * Returns Entered By (NTE-5).
   */
  public XCN getEnteredBy()  {
    XCN ret = null;
    try {
        Type t = this.getField(5, 0);
        ret = (XCN)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns Entered By (NTE-5).
   */
  public XCN getNte5_EnteredBy()  {
    XCN ret = null;
    try {
        Type t = this.getField(5, 0);
        ret = (XCN)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns Entered Date/Time (NTE-6).
   */
  public DTM getEnteredDateTime()  {
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
   * Returns Entered Date/Time (NTE-6).
   */
  public DTM getNte6_EnteredDateTime()  {
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
   * Returns Effective Start Date (NTE-7).
   */
  public DTM getEffectiveStartDate()  {
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
   * Returns Effective Start Date (NTE-7).
   */
  public DTM getNte7_EffectiveStartDate()  {
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
   * Returns Expiration Date (NTE-8).
   */
  public DTM getExpirationDate()  {
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
   * Returns Expiration Date (NTE-8).
   */
  public DTM getNte8_ExpirationDate()  {
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

   protected Type createNewTypeWithoutReflection(int field) {
      switch (field) {
         case 0: return new ca.uhn.hl7v2.model.v26.datatype.SI(getMessage());
         case 1: return new ca.uhn.hl7v2.model.v26.datatype.ID(getMessage(), new Integer(105));
         case 2: return new ca.uhn.hl7v2.model.v26.datatype.FT(getMessage());
         case 3: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 4: return new ca.uhn.hl7v2.model.v26.datatype.XCN(getMessage());
         case 5: return new ca.uhn.hl7v2.model.v26.datatype.DTM(getMessage());
         case 6: return new ca.uhn.hl7v2.model.v26.datatype.DTM(getMessage());
         case 7: return new ca.uhn.hl7v2.model.v26.datatype.DTM(getMessage());
         default: return null;
      }
   }

}