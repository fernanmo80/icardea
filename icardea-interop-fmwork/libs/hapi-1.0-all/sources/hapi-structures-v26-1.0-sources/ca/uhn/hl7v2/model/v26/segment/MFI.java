package ca.uhn.hl7v2.model.v26.segment;

import ca.uhn.hl7v2.model.*;
import ca.uhn.hl7v2.model.v26.datatype.*;
import ca.uhn.log.HapiLogFactory;
import ca.uhn.hl7v2.parser.ModelClassFactory;
import ca.uhn.hl7v2.HL7Exception;

/**
 * <p>Represents an HL7 MFI message segment. 
 * This segment has the following fields:</p><p>
 * MFI-1: Master File Identifier (CWE)<br> 
 * MFI-2: Master File Application Identifier (HD)<br> 
 * MFI-3: File-Level Event Code (ID)<br> 
 * MFI-4: Entered Date/Time (DTM)<br> 
 * MFI-5: Effective Date/Time (DTM)<br> 
 * MFI-6: Response Level Code (ID)<br> 
 * </p><p>The get...() methods return data from individual fields.  These methods 
 * do not throw exceptions and may therefore have to handle exceptions internally.  
 * If an exception is handled internally, it is logged and null is returned.  
 * This is not expected to happen - if it does happen this indicates not so much 
 * an exceptional circumstance as a bug in the code for this class.</p>    
 */
public class MFI extends AbstractSegment  {

  /**
   * Creates a MFI (Master File Identification) segment object that belongs to the given 
   * message.  
   */
  public MFI(Group parent, ModelClassFactory factory) {
    super(parent, factory);
    Message message = getMessage();
    try {
       this.add(CWE.class, true, 1, 250, new Object[]{message}, "Master File Identifier");
       this.add(HD.class, false, 0, 180, new Object[]{message}, "Master File Application Identifier");
       this.add(ID.class, true, 1, 3, new Object[]{message, new Integer(178)}, "File-Level Event Code");
       this.add(DTM.class, false, 1, 24, new Object[]{message}, "Entered Date/Time");
       this.add(DTM.class, false, 1, 24, new Object[]{message}, "Effective Date/Time");
       this.add(ID.class, true, 1, 2, new Object[]{message, new Integer(179)}, "Response Level Code");
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Can't instantiate " + this.getClass().getName(), he);
    }
  }

  /**
   * Returns Master File Identifier (MFI-1).
   */
  public CWE getMasterFileIdentifier()  {
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
   * Returns Master File Identifier (MFI-1).
   */
  public CWE getMfi1_MasterFileIdentifier()  {
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
   * Returns a single repetition of Master File Application Identifier (MFI-2).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public HD getMasterFileApplicationIdentifier(int rep) throws HL7Exception {
    HD ret = null;
    try {
        Type t = this.getField(2, rep);
        ret = (HD)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Master File Application Identifier (MFI-2).
   */
  public HD[] getMasterFileApplicationIdentifier() {
     HD[] ret = null;
    try {
        Type[] t = this.getField(2);  
        ret = new HD[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (HD)t[i];
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
   * Returns a count of the number of repetitions of Master File Application Identifier (MFI-2).
   */
  public int getMasterFileApplicationIdentifierReps() {
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
   * Inserts a repetition of Master File Application Identifier (MFI-2) at a given index and returns it.
   * @param index The index
   */
  public HD insertMasterFileApplicationIdentifier(int index) throws HL7Exception {
     return (HD) super.insertRepetition(2, index);
  }

  /**
   * Removes a repetition of Master File Application Identifier (MFI-2) at a given index and returns it.
   * @param index The index
   */
  public HD removeMasterFileApplicationIdentifier(int index) throws HL7Exception {
     return (HD) super.removeRepetition(2, index);
  }

  /**
   * Returns a single repetition of Master File Application Identifier (MFI-2).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public HD getMfi2_MasterFileApplicationIdentifier(int rep) throws HL7Exception {
    HD ret = null;
    try {
        Type t = this.getField(2, rep);
        ret = (HD)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Master File Application Identifier (MFI-2).
   */
  public HD[] getMfi2_MasterFileApplicationIdentifier() {
     HD[] ret = null;
    try {
        Type[] t = this.getField(2);  
        ret = new HD[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (HD)t[i];
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
   * Returns a count of the number of repetitions of Master File Application Identifier (MFI-2).
   */
  public int getMfi2_MasterFileApplicationIdentifierReps() {
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
   * Inserts a repetition of Master File Application Identifier (MFI-2) at a given index and returns it.
   * @param index The index
   */
  public HD insertMfi2_MasterFileApplicationIdentifier(int index) throws HL7Exception {
     return (HD) super.insertRepetition(2, index);
  }

  /**
   * Removes a repetition of Master File Application Identifier (MFI-2) at a given index and returns it.
   * @param index The index
   */
  public HD removeMfi2_MasterFileApplicationIdentifier(int index) throws HL7Exception {
     return (HD) super.removeRepetition(2, index);
  }

  /**
   * Returns File-Level Event Code (MFI-3).
   */
  public ID getFileLevelEventCode()  {
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
   * Returns File-Level Event Code (MFI-3).
   */
  public ID getMfi3_FileLevelEventCode()  {
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
   * Returns Entered Date/Time (MFI-4).
   */
  public DTM getEnteredDateTime()  {
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
   * Returns Entered Date/Time (MFI-4).
   */
  public DTM getMfi4_EnteredDateTime()  {
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
   * Returns Effective Date/Time (MFI-5).
   */
  public DTM getEffectiveDateTime()  {
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
   * Returns Effective Date/Time (MFI-5).
   */
  public DTM getMfi5_EffectiveDateTime()  {
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
   * Returns Response Level Code (MFI-6).
   */
  public ID getResponseLevelCode()  {
    ID ret = null;
    try {
        Type t = this.getField(6, 0);
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
   * Returns Response Level Code (MFI-6).
   */
  public ID getMfi6_ResponseLevelCode()  {
    ID ret = null;
    try {
        Type t = this.getField(6, 0);
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
         case 0: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 1: return new ca.uhn.hl7v2.model.v26.datatype.HD(getMessage());
         case 2: return new ca.uhn.hl7v2.model.v26.datatype.ID(getMessage(), new Integer(178));
         case 3: return new ca.uhn.hl7v2.model.v26.datatype.DTM(getMessage());
         case 4: return new ca.uhn.hl7v2.model.v26.datatype.DTM(getMessage());
         case 5: return new ca.uhn.hl7v2.model.v26.datatype.ID(getMessage(), new Integer(179));
         default: return null;
      }
   }

}