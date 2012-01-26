package ca.uhn.hl7v2.model.v26.segment;

import ca.uhn.hl7v2.model.*;
import ca.uhn.hl7v2.model.v26.datatype.*;
import ca.uhn.log.HapiLogFactory;
import ca.uhn.hl7v2.parser.ModelClassFactory;
import ca.uhn.hl7v2.HL7Exception;

/**
 * <p>Represents an HL7 PR1 message segment. 
 * This segment has the following fields:</p><p>
 * PR1-1: Set ID - PR1 (SI)<br> 
 * PR1-2: Procedure Coding Method (-)<br> 
 * PR1-3: Procedure Code (CNE)<br> 
 * PR1-4: Procedure Description (-)<br> 
 * PR1-5: Procedure Date/Time (DTM)<br> 
 * PR1-6: Procedure Functional Type (IS)<br> 
 * PR1-7: Procedure Minutes (NM)<br> 
 * PR1-8: Anesthesiologist (-)<br> 
 * PR1-9: Anesthesia Code (IS)<br> 
 * PR1-10: Anesthesia Minutes (NM)<br> 
 * PR1-11: Surgeon (-)<br> 
 * PR1-12: Procedure Practitioner (-)<br> 
 * PR1-13: Consent Code (CWE)<br> 
 * PR1-14: Procedure Priority (ID)<br> 
 * PR1-15: Associated Diagnosis Code (CWE)<br> 
 * PR1-16: Procedure Code Modifier (CNE)<br> 
 * PR1-17: Procedure DRG Type (IS)<br> 
 * PR1-18: Tissue Type Code (CWE)<br> 
 * PR1-19: Procedure Identifier (EI)<br> 
 * PR1-20: Procedure Action Code (ID)<br> 
 * PR1-21: DRG Procedure Determination Status (IS)<br> 
 * PR1-22: DRG Procedure Relevance (IS)<br> 
 * </p><p>The get...() methods return data from individual fields.  These methods 
 * do not throw exceptions and may therefore have to handle exceptions internally.  
 * If an exception is handled internally, it is logged and null is returned.  
 * This is not expected to happen - if it does happen this indicates not so much 
 * an exceptional circumstance as a bug in the code for this class.</p>    
 */
public class PR1 extends AbstractSegment  {

  /**
   * Creates a PR1 (Procedures) segment object that belongs to the given 
   * message.  
   */
  public PR1(Group parent, ModelClassFactory factory) {
    super(parent, factory);
    Message message = getMessage();
    try {
       this.add(SI.class, true, 1, 4, new Object[]{message}, "Set ID - PR1");
       this.add(NULLDT.class, false, 1, 0, new Object[]{message}, "Procedure Coding Method");
       this.add(CNE.class, true, 1, 705, new Object[]{message}, "Procedure Code");
       this.add(NULLDT.class, false, 1, 0, new Object[]{message}, "Procedure Description");
       this.add(DTM.class, true, 1, 24, new Object[]{message}, "Procedure Date/Time");
       this.add(IS.class, false, 1, 2, new Object[]{message, new Integer(230)}, "Procedure Functional Type");
       this.add(NM.class, false, 1, 4, new Object[]{message}, "Procedure Minutes");
       this.add(NULLDT.class, false, 1, 0, new Object[]{message}, "Anesthesiologist");
       this.add(IS.class, false, 1, 2, new Object[]{message, new Integer(19)}, "Anesthesia Code");
       this.add(NM.class, false, 1, 4, new Object[]{message}, "Anesthesia Minutes");
       this.add(NULLDT.class, false, 1, 0, new Object[]{message}, "Surgeon");
       this.add(NULLDT.class, false, 1, 0, new Object[]{message}, "Procedure Practitioner");
       this.add(CWE.class, false, 1, 250, new Object[]{message}, "Consent Code");
       this.add(ID.class, false, 1, 2, new Object[]{message, new Integer(418)}, "Procedure Priority");
       this.add(CWE.class, false, 1, 250, new Object[]{message}, "Associated Diagnosis Code");
       this.add(CNE.class, false, 0, 705, new Object[]{message}, "Procedure Code Modifier");
       this.add(IS.class, false, 1, 20, new Object[]{message, new Integer(416)}, "Procedure DRG Type");
       this.add(CWE.class, false, 0, 250, new Object[]{message}, "Tissue Type Code");
       this.add(EI.class, false, 1, 427, new Object[]{message}, "Procedure Identifier");
       this.add(ID.class, false, 1, 1, new Object[]{message, new Integer(206)}, "Procedure Action Code");
       this.add(IS.class, false, 1, 20, new Object[]{message, new Integer(761)}, "DRG Procedure Determination Status");
       this.add(IS.class, false, 1, 20, new Object[]{message, new Integer(763)}, "DRG Procedure Relevance");
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Can't instantiate " + this.getClass().getName(), he);
    }
  }

  /**
   * Returns Set ID - PR1 (PR1-1).
   */
  public SI getSetIDPR1()  {
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
   * Returns Set ID - PR1 (PR1-1).
   */
  public SI getPr11_SetIDPR1()  {
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
   * Returns Procedure Coding Method (PR1-2).
   */
  public NULLDT getProcedureCodingMethod()  {
    NULLDT ret = null;
    try {
        Type t = this.getField(2, 0);
        ret = (NULLDT)t;
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
   * Returns Procedure Coding Method (PR1-2).
   */
  public NULLDT getPr12_ProcedureCodingMethod()  {
    NULLDT ret = null;
    try {
        Type t = this.getField(2, 0);
        ret = (NULLDT)t;
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
   * Returns Procedure Code (PR1-3).
   */
  public CNE getProcedureCode()  {
    CNE ret = null;
    try {
        Type t = this.getField(3, 0);
        ret = (CNE)t;
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
   * Returns Procedure Code (PR1-3).
   */
  public CNE getPr13_ProcedureCode()  {
    CNE ret = null;
    try {
        Type t = this.getField(3, 0);
        ret = (CNE)t;
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
   * Returns Procedure Description (PR1-4).
   */
  public NULLDT getProcedureDescription()  {
    NULLDT ret = null;
    try {
        Type t = this.getField(4, 0);
        ret = (NULLDT)t;
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
   * Returns Procedure Description (PR1-4).
   */
  public NULLDT getPr14_ProcedureDescription()  {
    NULLDT ret = null;
    try {
        Type t = this.getField(4, 0);
        ret = (NULLDT)t;
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
   * Returns Procedure Date/Time (PR1-5).
   */
  public DTM getProcedureDateTime()  {
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
   * Returns Procedure Date/Time (PR1-5).
   */
  public DTM getPr15_ProcedureDateTime()  {
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
   * Returns Procedure Functional Type (PR1-6).
   */
  public IS getProcedureFunctionalType()  {
    IS ret = null;
    try {
        Type t = this.getField(6, 0);
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
   * Returns Procedure Functional Type (PR1-6).
   */
  public IS getPr16_ProcedureFunctionalType()  {
    IS ret = null;
    try {
        Type t = this.getField(6, 0);
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
   * Returns Procedure Minutes (PR1-7).
   */
  public NM getProcedureMinutes()  {
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
   * Returns Procedure Minutes (PR1-7).
   */
  public NM getPr17_ProcedureMinutes()  {
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
   * Returns Anesthesiologist (PR1-8).
   */
  public NULLDT getAnesthesiologist()  {
    NULLDT ret = null;
    try {
        Type t = this.getField(8, 0);
        ret = (NULLDT)t;
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
   * Returns Anesthesiologist (PR1-8).
   */
  public NULLDT getPr18_Anesthesiologist()  {
    NULLDT ret = null;
    try {
        Type t = this.getField(8, 0);
        ret = (NULLDT)t;
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
   * Returns Anesthesia Code (PR1-9).
   */
  public IS getAnesthesiaCode()  {
    IS ret = null;
    try {
        Type t = this.getField(9, 0);
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
   * Returns Anesthesia Code (PR1-9).
   */
  public IS getPr19_AnesthesiaCode()  {
    IS ret = null;
    try {
        Type t = this.getField(9, 0);
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
   * Returns Anesthesia Minutes (PR1-10).
   */
  public NM getAnesthesiaMinutes()  {
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
   * Returns Anesthesia Minutes (PR1-10).
   */
  public NM getPr110_AnesthesiaMinutes()  {
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
   * Returns Surgeon (PR1-11).
   */
  public NULLDT getSurgeon()  {
    NULLDT ret = null;
    try {
        Type t = this.getField(11, 0);
        ret = (NULLDT)t;
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
   * Returns Surgeon (PR1-11).
   */
  public NULLDT getPr111_Surgeon()  {
    NULLDT ret = null;
    try {
        Type t = this.getField(11, 0);
        ret = (NULLDT)t;
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
   * Returns Procedure Practitioner (PR1-12).
   */
  public NULLDT getProcedurePractitioner()  {
    NULLDT ret = null;
    try {
        Type t = this.getField(12, 0);
        ret = (NULLDT)t;
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
   * Returns Procedure Practitioner (PR1-12).
   */
  public NULLDT getPr112_ProcedurePractitioner()  {
    NULLDT ret = null;
    try {
        Type t = this.getField(12, 0);
        ret = (NULLDT)t;
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
   * Returns Consent Code (PR1-13).
   */
  public CWE getConsentCode()  {
    CWE ret = null;
    try {
        Type t = this.getField(13, 0);
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
   * Returns Consent Code (PR1-13).
   */
  public CWE getPr113_ConsentCode()  {
    CWE ret = null;
    try {
        Type t = this.getField(13, 0);
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
   * Returns Procedure Priority (PR1-14).
   */
  public ID getProcedurePriority()  {
    ID ret = null;
    try {
        Type t = this.getField(14, 0);
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
   * Returns Procedure Priority (PR1-14).
   */
  public ID getPr114_ProcedurePriority()  {
    ID ret = null;
    try {
        Type t = this.getField(14, 0);
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
   * Returns Associated Diagnosis Code (PR1-15).
   */
  public CWE getAssociatedDiagnosisCode()  {
    CWE ret = null;
    try {
        Type t = this.getField(15, 0);
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
   * Returns Associated Diagnosis Code (PR1-15).
   */
  public CWE getPr115_AssociatedDiagnosisCode()  {
    CWE ret = null;
    try {
        Type t = this.getField(15, 0);
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
   * Returns a single repetition of Procedure Code Modifier (PR1-16).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CNE getProcedureCodeModifier(int rep) throws HL7Exception {
    CNE ret = null;
    try {
        Type t = this.getField(16, rep);
        ret = (CNE)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Procedure Code Modifier (PR1-16).
   */
  public CNE[] getProcedureCodeModifier() {
     CNE[] ret = null;
    try {
        Type[] t = this.getField(16);  
        ret = new CNE[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (CNE)t[i];
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
   * Returns a count of the number of repetitions of Procedure Code Modifier (PR1-16).
   */
  public int getProcedureCodeModifierReps() {
    try {
        return this.getField(16).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Procedure Code Modifier (PR1-16) at a given index and returns it.
   * @param index The index
   */
  public CNE insertProcedureCodeModifier(int index) throws HL7Exception {
     return (CNE) super.insertRepetition(16, index);
  }

  /**
   * Removes a repetition of Procedure Code Modifier (PR1-16) at a given index and returns it.
   * @param index The index
   */
  public CNE removeProcedureCodeModifier(int index) throws HL7Exception {
     return (CNE) super.removeRepetition(16, index);
  }

  /**
   * Returns a single repetition of Procedure Code Modifier (PR1-16).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CNE getPr116_ProcedureCodeModifier(int rep) throws HL7Exception {
    CNE ret = null;
    try {
        Type t = this.getField(16, rep);
        ret = (CNE)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Procedure Code Modifier (PR1-16).
   */
  public CNE[] getPr116_ProcedureCodeModifier() {
     CNE[] ret = null;
    try {
        Type[] t = this.getField(16);  
        ret = new CNE[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (CNE)t[i];
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
   * Returns a count of the number of repetitions of Procedure Code Modifier (PR1-16).
   */
  public int getPr116_ProcedureCodeModifierReps() {
    try {
        return this.getField(16).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Procedure Code Modifier (PR1-16) at a given index and returns it.
   * @param index The index
   */
  public CNE insertPr116_ProcedureCodeModifier(int index) throws HL7Exception {
     return (CNE) super.insertRepetition(16, index);
  }

  /**
   * Removes a repetition of Procedure Code Modifier (PR1-16) at a given index and returns it.
   * @param index The index
   */
  public CNE removePr116_ProcedureCodeModifier(int index) throws HL7Exception {
     return (CNE) super.removeRepetition(16, index);
  }

  /**
   * Returns Procedure DRG Type (PR1-17).
   */
  public IS getProcedureDRGType()  {
    IS ret = null;
    try {
        Type t = this.getField(17, 0);
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
   * Returns Procedure DRG Type (PR1-17).
   */
  public IS getPr117_ProcedureDRGType()  {
    IS ret = null;
    try {
        Type t = this.getField(17, 0);
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
   * Returns a single repetition of Tissue Type Code (PR1-18).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getTissueTypeCode(int rep) throws HL7Exception {
    CWE ret = null;
    try {
        Type t = this.getField(18, rep);
        ret = (CWE)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Tissue Type Code (PR1-18).
   */
  public CWE[] getTissueTypeCode() {
     CWE[] ret = null;
    try {
        Type[] t = this.getField(18);  
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
   * Returns a count of the number of repetitions of Tissue Type Code (PR1-18).
   */
  public int getTissueTypeCodeReps() {
    try {
        return this.getField(18).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Tissue Type Code (PR1-18) at a given index and returns it.
   * @param index The index
   */
  public CWE insertTissueTypeCode(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(18, index);
  }

  /**
   * Removes a repetition of Tissue Type Code (PR1-18) at a given index and returns it.
   * @param index The index
   */
  public CWE removeTissueTypeCode(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(18, index);
  }

  /**
   * Returns a single repetition of Tissue Type Code (PR1-18).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getPr118_TissueTypeCode(int rep) throws HL7Exception {
    CWE ret = null;
    try {
        Type t = this.getField(18, rep);
        ret = (CWE)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Tissue Type Code (PR1-18).
   */
  public CWE[] getPr118_TissueTypeCode() {
     CWE[] ret = null;
    try {
        Type[] t = this.getField(18);  
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
   * Returns a count of the number of repetitions of Tissue Type Code (PR1-18).
   */
  public int getPr118_TissueTypeCodeReps() {
    try {
        return this.getField(18).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Tissue Type Code (PR1-18) at a given index and returns it.
   * @param index The index
   */
  public CWE insertPr118_TissueTypeCode(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(18, index);
  }

  /**
   * Removes a repetition of Tissue Type Code (PR1-18) at a given index and returns it.
   * @param index The index
   */
  public CWE removePr118_TissueTypeCode(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(18, index);
  }

  /**
   * Returns Procedure Identifier (PR1-19).
   */
  public EI getProcedureIdentifier()  {
    EI ret = null;
    try {
        Type t = this.getField(19, 0);
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
   * Returns Procedure Identifier (PR1-19).
   */
  public EI getPr119_ProcedureIdentifier()  {
    EI ret = null;
    try {
        Type t = this.getField(19, 0);
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
   * Returns Procedure Action Code (PR1-20).
   */
  public ID getProcedureActionCode()  {
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
   * Returns Procedure Action Code (PR1-20).
   */
  public ID getPr120_ProcedureActionCode()  {
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
   * Returns DRG Procedure Determination Status (PR1-21).
   */
  public IS getDRGProcedureDeterminationStatus()  {
    IS ret = null;
    try {
        Type t = this.getField(21, 0);
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
   * Returns DRG Procedure Determination Status (PR1-21).
   */
  public IS getPr121_DRGProcedureDeterminationStatus()  {
    IS ret = null;
    try {
        Type t = this.getField(21, 0);
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
   * Returns DRG Procedure Relevance (PR1-22).
   */
  public IS getDRGProcedureRelevance()  {
    IS ret = null;
    try {
        Type t = this.getField(22, 0);
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
   * Returns DRG Procedure Relevance (PR1-22).
   */
  public IS getPr122_DRGProcedureRelevance()  {
    IS ret = null;
    try {
        Type t = this.getField(22, 0);
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

   protected Type createNewTypeWithoutReflection(int field) {
      switch (field) {
         case 0: return new ca.uhn.hl7v2.model.v26.datatype.SI(getMessage());
         case 1: return new ca.uhn.hl7v2.model.v26.datatype.NULLDT(getMessage());
         case 2: return new ca.uhn.hl7v2.model.v26.datatype.CNE(getMessage());
         case 3: return new ca.uhn.hl7v2.model.v26.datatype.NULLDT(getMessage());
         case 4: return new ca.uhn.hl7v2.model.v26.datatype.DTM(getMessage());
         case 5: return new ca.uhn.hl7v2.model.v26.datatype.IS(getMessage(), new Integer(230));
         case 6: return new ca.uhn.hl7v2.model.v26.datatype.NM(getMessage());
         case 7: return new ca.uhn.hl7v2.model.v26.datatype.NULLDT(getMessage());
         case 8: return new ca.uhn.hl7v2.model.v26.datatype.IS(getMessage(), new Integer(19));
         case 9: return new ca.uhn.hl7v2.model.v26.datatype.NM(getMessage());
         case 10: return new ca.uhn.hl7v2.model.v26.datatype.NULLDT(getMessage());
         case 11: return new ca.uhn.hl7v2.model.v26.datatype.NULLDT(getMessage());
         case 12: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 13: return new ca.uhn.hl7v2.model.v26.datatype.ID(getMessage(), new Integer(418));
         case 14: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 15: return new ca.uhn.hl7v2.model.v26.datatype.CNE(getMessage());
         case 16: return new ca.uhn.hl7v2.model.v26.datatype.IS(getMessage(), new Integer(416));
         case 17: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 18: return new ca.uhn.hl7v2.model.v26.datatype.EI(getMessage());
         case 19: return new ca.uhn.hl7v2.model.v26.datatype.ID(getMessage(), new Integer(206));
         case 20: return new ca.uhn.hl7v2.model.v26.datatype.IS(getMessage(), new Integer(761));
         case 21: return new ca.uhn.hl7v2.model.v26.datatype.IS(getMessage(), new Integer(763));
         default: return null;
      }
   }

}