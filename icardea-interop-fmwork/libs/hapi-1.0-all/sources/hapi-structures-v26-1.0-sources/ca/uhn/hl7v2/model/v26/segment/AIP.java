package ca.uhn.hl7v2.model.v26.segment;

import ca.uhn.hl7v2.model.*;
import ca.uhn.hl7v2.model.v26.datatype.*;
import ca.uhn.log.HapiLogFactory;
import ca.uhn.hl7v2.parser.ModelClassFactory;
import ca.uhn.hl7v2.HL7Exception;

/**
 * <p>Represents an HL7 AIP message segment. 
 * This segment has the following fields:</p><p>
 * AIP-1: Set ID - AIP (SI)<br> 
 * AIP-2: Segment Action Code (ID)<br> 
 * AIP-3: Personnel Resource ID (XCN)<br> 
 * AIP-4: Resource Type (CWE)<br> 
 * AIP-5: Resource Group (CWE)<br> 
 * AIP-6: Start Date/Time (DTM)<br> 
 * AIP-7: Start Date/Time Offset (NM)<br> 
 * AIP-8: Start Date/Time Offset Units (CNE)<br> 
 * AIP-9: Duration (NM)<br> 
 * AIP-10: Duration Units (CNE)<br> 
 * AIP-11: Allow Substitution Code (IS)<br> 
 * AIP-12: Filler Status Code (CWE)<br> 
 * </p><p>The get...() methods return data from individual fields.  These methods 
 * do not throw exceptions and may therefore have to handle exceptions internally.  
 * If an exception is handled internally, it is logged and null is returned.  
 * This is not expected to happen - if it does happen this indicates not so much 
 * an exceptional circumstance as a bug in the code for this class.</p>    
 */
public class AIP extends AbstractSegment  {

  /**
   * Creates a AIP (Appointment Information - Personnel Resource) segment object that belongs to the given 
   * message.  
   */
  public AIP(Group parent, ModelClassFactory factory) {
    super(parent, factory);
    Message message = getMessage();
    try {
       this.add(SI.class, true, 1, 4, new Object[]{message}, "Set ID - AIP");
       this.add(ID.class, false, 1, 3, new Object[]{message, new Integer(206)}, "Segment Action Code");
       this.add(XCN.class, false, 0, 250, new Object[]{message}, "Personnel Resource ID");
       this.add(CWE.class, false, 1, 250, new Object[]{message}, "Resource Type");
       this.add(CWE.class, false, 1, 250, new Object[]{message}, "Resource Group");
       this.add(DTM.class, false, 1, 24, new Object[]{message}, "Start Date/Time");
       this.add(NM.class, false, 1, 20, new Object[]{message}, "Start Date/Time Offset");
       this.add(CNE.class, false, 1, 250, new Object[]{message}, "Start Date/Time Offset Units");
       this.add(NM.class, false, 1, 20, new Object[]{message}, "Duration");
       this.add(CNE.class, false, 1, 250, new Object[]{message}, "Duration Units");
       this.add(IS.class, false, 1, 10, new Object[]{message, new Integer(279)}, "Allow Substitution Code");
       this.add(CWE.class, false, 1, 250, new Object[]{message}, "Filler Status Code");
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Can't instantiate " + this.getClass().getName(), he);
    }
  }

  /**
   * Returns Set ID - AIP (AIP-1).
   */
  public SI getSetIDAIP()  {
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
   * Returns Set ID - AIP (AIP-1).
   */
  public SI getAip1_SetIDAIP()  {
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
   * Returns Segment Action Code (AIP-2).
   */
  public ID getSegmentActionCode()  {
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
   * Returns Segment Action Code (AIP-2).
   */
  public ID getAip2_SegmentActionCode()  {
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
   * Returns a single repetition of Personnel Resource ID (AIP-3).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XCN getPersonnelResourceID(int rep) throws HL7Exception {
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
   * Returns all repetitions of Personnel Resource ID (AIP-3).
   */
  public XCN[] getPersonnelResourceID() {
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
   * Returns a count of the number of repetitions of Personnel Resource ID (AIP-3).
   */
  public int getPersonnelResourceIDReps() {
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
   * Inserts a repetition of Personnel Resource ID (AIP-3) at a given index and returns it.
   * @param index The index
   */
  public XCN insertPersonnelResourceID(int index) throws HL7Exception {
     return (XCN) super.insertRepetition(3, index);
  }

  /**
   * Removes a repetition of Personnel Resource ID (AIP-3) at a given index and returns it.
   * @param index The index
   */
  public XCN removePersonnelResourceID(int index) throws HL7Exception {
     return (XCN) super.removeRepetition(3, index);
  }

  /**
   * Returns a single repetition of Personnel Resource ID (AIP-3).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XCN getAip3_PersonnelResourceID(int rep) throws HL7Exception {
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
   * Returns all repetitions of Personnel Resource ID (AIP-3).
   */
  public XCN[] getAip3_PersonnelResourceID() {
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
   * Returns a count of the number of repetitions of Personnel Resource ID (AIP-3).
   */
  public int getAip3_PersonnelResourceIDReps() {
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
   * Inserts a repetition of Personnel Resource ID (AIP-3) at a given index and returns it.
   * @param index The index
   */
  public XCN insertAip3_PersonnelResourceID(int index) throws HL7Exception {
     return (XCN) super.insertRepetition(3, index);
  }

  /**
   * Removes a repetition of Personnel Resource ID (AIP-3) at a given index and returns it.
   * @param index The index
   */
  public XCN removeAip3_PersonnelResourceID(int index) throws HL7Exception {
     return (XCN) super.removeRepetition(3, index);
  }

  /**
   * Returns Resource Type (AIP-4).
   */
  public CWE getResourceType()  {
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
   * Returns Resource Type (AIP-4).
   */
  public CWE getAip4_ResourceType()  {
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
   * Returns Resource Group (AIP-5).
   */
  public CWE getResourceGroup()  {
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
   * Returns Resource Group (AIP-5).
   */
  public CWE getAip5_ResourceGroup()  {
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
   * Returns Start Date/Time (AIP-6).
   */
  public DTM getStartDateTime()  {
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
   * Returns Start Date/Time (AIP-6).
   */
  public DTM getAip6_StartDateTime()  {
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
   * Returns Start Date/Time Offset (AIP-7).
   */
  public NM getStartDateTimeOffset()  {
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
   * Returns Start Date/Time Offset (AIP-7).
   */
  public NM getAip7_StartDateTimeOffset()  {
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
   * Returns Start Date/Time Offset Units (AIP-8).
   */
  public CNE getStartDateTimeOffsetUnits()  {
    CNE ret = null;
    try {
        Type t = this.getField(8, 0);
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
   * Returns Start Date/Time Offset Units (AIP-8).
   */
  public CNE getAip8_StartDateTimeOffsetUnits()  {
    CNE ret = null;
    try {
        Type t = this.getField(8, 0);
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
   * Returns Duration (AIP-9).
   */
  public NM getDuration()  {
    NM ret = null;
    try {
        Type t = this.getField(9, 0);
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
   * Returns Duration (AIP-9).
   */
  public NM getAip9_Duration()  {
    NM ret = null;
    try {
        Type t = this.getField(9, 0);
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
   * Returns Duration Units (AIP-10).
   */
  public CNE getDurationUnits()  {
    CNE ret = null;
    try {
        Type t = this.getField(10, 0);
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
   * Returns Duration Units (AIP-10).
   */
  public CNE getAip10_DurationUnits()  {
    CNE ret = null;
    try {
        Type t = this.getField(10, 0);
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
   * Returns Allow Substitution Code (AIP-11).
   */
  public IS getAllowSubstitutionCode()  {
    IS ret = null;
    try {
        Type t = this.getField(11, 0);
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
   * Returns Allow Substitution Code (AIP-11).
   */
  public IS getAip11_AllowSubstitutionCode()  {
    IS ret = null;
    try {
        Type t = this.getField(11, 0);
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
   * Returns Filler Status Code (AIP-12).
   */
  public CWE getFillerStatusCode()  {
    CWE ret = null;
    try {
        Type t = this.getField(12, 0);
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
   * Returns Filler Status Code (AIP-12).
   */
  public CWE getAip12_FillerStatusCode()  {
    CWE ret = null;
    try {
        Type t = this.getField(12, 0);
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

   protected Type createNewTypeWithoutReflection(int field) {
      switch (field) {
         case 0: return new ca.uhn.hl7v2.model.v26.datatype.SI(getMessage());
         case 1: return new ca.uhn.hl7v2.model.v26.datatype.ID(getMessage(), new Integer(206));
         case 2: return new ca.uhn.hl7v2.model.v26.datatype.XCN(getMessage());
         case 3: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 4: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 5: return new ca.uhn.hl7v2.model.v26.datatype.DTM(getMessage());
         case 6: return new ca.uhn.hl7v2.model.v26.datatype.NM(getMessage());
         case 7: return new ca.uhn.hl7v2.model.v26.datatype.CNE(getMessage());
         case 8: return new ca.uhn.hl7v2.model.v26.datatype.NM(getMessage());
         case 9: return new ca.uhn.hl7v2.model.v26.datatype.CNE(getMessage());
         case 10: return new ca.uhn.hl7v2.model.v26.datatype.IS(getMessage(), new Integer(279));
         case 11: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         default: return null;
      }
   }

}