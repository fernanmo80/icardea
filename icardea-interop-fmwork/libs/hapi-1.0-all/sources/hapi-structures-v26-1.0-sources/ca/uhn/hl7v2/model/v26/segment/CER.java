package ca.uhn.hl7v2.model.v26.segment;

import ca.uhn.hl7v2.model.*;
import ca.uhn.hl7v2.model.v26.datatype.*;
import ca.uhn.log.HapiLogFactory;
import ca.uhn.hl7v2.parser.ModelClassFactory;
import ca.uhn.hl7v2.HL7Exception;

/**
 * <p>Represents an HL7 CER message segment. 
 * This segment has the following fields:</p><p>
 * CER-1: Set ID - CER (SI)<br> 
 * CER-2: Serial Number (ST)<br> 
 * CER-3: Version (ST)<br> 
 * CER-4: Granting Authority (XON)<br> 
 * CER-5: Issuing Authority (XCN)<br> 
 * CER-6: Signature of Issuing Authority (ED)<br> 
 * CER-7: Granting Country (ID)<br> 
 * CER-8: Granting State/Province (CWE)<br> 
 * CER-9: Granting County/Parish (CWE)<br> 
 * CER-10: Certificate Type (CWE)<br> 
 * CER-11: Certificate Domain (CWE)<br> 
 * CER-12: Subject ID (ID)<br> 
 * CER-13: Subject Name (ST)<br> 
 * CER-14: Subject Directory Attribute Extension (CWE)<br> 
 * CER-15: Subject Public Key Info (CWE)<br> 
 * CER-16: Authority Key Identifier (CWE)<br> 
 * CER-17: Basic Constraint (ID)<br> 
 * CER-18: CRL Distribution Point (CWE)<br> 
 * CER-19: Jurisdiction Country (ID)<br> 
 * CER-20: Jurisdiction State/Province (CWE)<br> 
 * CER-21: Jurisdiction County/Parish (CWE)<br> 
 * CER-22: Jurisdiction Breadth (CWE)<br> 
 * CER-23: Granting Date (DTM)<br> 
 * CER-24: Issuing Date (DTM)<br> 
 * CER-25: Activation Date (DTM)<br> 
 * CER-26: Inactivation Date (DTM)<br> 
 * CER-27: Expiration Date (DTM)<br> 
 * CER-28: Renewal Date (DTM)<br> 
 * CER-29: Revocation Date (DTM)<br> 
 * CER-30: Revocation Reason Code (CWE)<br> 
 * CER-31: Certificate Status Code (CWE)<br> 
 * </p><p>The get...() methods return data from individual fields.  These methods 
 * do not throw exceptions and may therefore have to handle exceptions internally.  
 * If an exception is handled internally, it is logged and null is returned.  
 * This is not expected to happen - if it does happen this indicates not so much 
 * an exceptional circumstance as a bug in the code for this class.</p>    
 */
public class CER extends AbstractSegment  {

  /**
   * Creates a CER (Certificate Detail) segment object that belongs to the given 
   * message.  
   */
  public CER(Group parent, ModelClassFactory factory) {
    super(parent, factory);
    Message message = getMessage();
    try {
       this.add(SI.class, true, 1, 4, new Object[]{message}, "Set ID - CER");
       this.add(ST.class, false, 1, 80, new Object[]{message}, "Serial Number");
       this.add(ST.class, false, 1, 80, new Object[]{message}, "Version");
       this.add(XON.class, false, 1, 250, new Object[]{message}, "Granting Authority");
       this.add(XCN.class, false, 1, 250, new Object[]{message}, "Issuing Authority");
       this.add(ED.class, false, 1, 65536, new Object[]{message}, "Signature of Issuing Authority");
       this.add(ID.class, false, 1, 3, new Object[]{message, new Integer(399)}, "Granting Country");
       this.add(CWE.class, false, 1, 250, new Object[]{message}, "Granting State/Province");
       this.add(CWE.class, false, 1, 250, new Object[]{message}, "Granting County/Parish");
       this.add(CWE.class, false, 1, 250, new Object[]{message}, "Certificate Type");
       this.add(CWE.class, false, 1, 250, new Object[]{message}, "Certificate Domain");
       this.add(ID.class, false, 1, 250, new Object[]{message, new Integer(0)}, "Subject ID");
       this.add(ST.class, true, 1, 250, new Object[]{message}, "Subject Name");
       this.add(CWE.class, false, 0, 250, new Object[]{message}, "Subject Directory Attribute Extension");
       this.add(CWE.class, false, 1, 250, new Object[]{message}, "Subject Public Key Info");
       this.add(CWE.class, false, 1, 250, new Object[]{message}, "Authority Key Identifier");
       this.add(ID.class, false, 1, 250, new Object[]{message, new Integer(136)}, "Basic Constraint");
       this.add(CWE.class, false, 0, 250, new Object[]{message}, "CRL Distribution Point");
       this.add(ID.class, false, 1, 3, new Object[]{message, new Integer(399)}, "Jurisdiction Country");
       this.add(CWE.class, false, 1, 250, new Object[]{message}, "Jurisdiction State/Province");
       this.add(CWE.class, false, 1, 250, new Object[]{message}, "Jurisdiction County/Parish");
       this.add(CWE.class, false, 0, 250, new Object[]{message}, "Jurisdiction Breadth");
       this.add(DTM.class, false, 1, 24, new Object[]{message}, "Granting Date");
       this.add(DTM.class, false, 1, 24, new Object[]{message}, "Issuing Date");
       this.add(DTM.class, false, 1, 24, new Object[]{message}, "Activation Date");
       this.add(DTM.class, false, 1, 24, new Object[]{message}, "Inactivation Date");
       this.add(DTM.class, false, 1, 24, new Object[]{message}, "Expiration Date");
       this.add(DTM.class, false, 1, 24, new Object[]{message}, "Renewal Date");
       this.add(DTM.class, false, 1, 24, new Object[]{message}, "Revocation Date");
       this.add(CWE.class, false, 1, 250, new Object[]{message}, "Revocation Reason Code");
       this.add(CWE.class, false, 1, 250, new Object[]{message}, "Certificate Status Code");
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Can't instantiate " + this.getClass().getName(), he);
    }
  }

  /**
   * Returns Set ID - CER (CER-1).
   */
  public SI getSetIDCER()  {
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
   * Returns Set ID - CER (CER-1).
   */
  public SI getCer1_SetIDCER()  {
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
   * Returns Serial Number (CER-2).
   */
  public ST getSerialNumber()  {
    ST ret = null;
    try {
        Type t = this.getField(2, 0);
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
   * Returns Serial Number (CER-2).
   */
  public ST getCer2_SerialNumber()  {
    ST ret = null;
    try {
        Type t = this.getField(2, 0);
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
   * Returns Version (CER-3).
   */
  public ST getVersion()  {
    ST ret = null;
    try {
        Type t = this.getField(3, 0);
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
   * Returns Version (CER-3).
   */
  public ST getCer3_Version()  {
    ST ret = null;
    try {
        Type t = this.getField(3, 0);
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
   * Returns Granting Authority (CER-4).
   */
  public XON getGrantingAuthority()  {
    XON ret = null;
    try {
        Type t = this.getField(4, 0);
        ret = (XON)t;
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
   * Returns Granting Authority (CER-4).
   */
  public XON getCer4_GrantingAuthority()  {
    XON ret = null;
    try {
        Type t = this.getField(4, 0);
        ret = (XON)t;
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
   * Returns Issuing Authority (CER-5).
   */
  public XCN getIssuingAuthority()  {
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
   * Returns Issuing Authority (CER-5).
   */
  public XCN getCer5_IssuingAuthority()  {
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
   * Returns Signature of Issuing Authority (CER-6).
   */
  public ED getSignatureOfIssuingAuthority()  {
    ED ret = null;
    try {
        Type t = this.getField(6, 0);
        ret = (ED)t;
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
   * Returns Signature of Issuing Authority (CER-6).
   */
  public ED getCer6_SignatureOfIssuingAuthority()  {
    ED ret = null;
    try {
        Type t = this.getField(6, 0);
        ret = (ED)t;
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
   * Returns Granting Country (CER-7).
   */
  public ID getGrantingCountry()  {
    ID ret = null;
    try {
        Type t = this.getField(7, 0);
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
   * Returns Granting Country (CER-7).
   */
  public ID getCer7_GrantingCountry()  {
    ID ret = null;
    try {
        Type t = this.getField(7, 0);
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
   * Returns Granting State/Province (CER-8).
   */
  public CWE getGrantingStateProvince()  {
    CWE ret = null;
    try {
        Type t = this.getField(8, 0);
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
   * Returns Granting State/Province (CER-8).
   */
  public CWE getCer8_GrantingStateProvince()  {
    CWE ret = null;
    try {
        Type t = this.getField(8, 0);
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
   * Returns Granting County/Parish (CER-9).
   */
  public CWE getGrantingCountyParish()  {
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
   * Returns Granting County/Parish (CER-9).
   */
  public CWE getCer9_GrantingCountyParish()  {
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
   * Returns Certificate Type (CER-10).
   */
  public CWE getCertificateType()  {
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
   * Returns Certificate Type (CER-10).
   */
  public CWE getCer10_CertificateType()  {
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
   * Returns Certificate Domain (CER-11).
   */
  public CWE getCertificateDomain()  {
    CWE ret = null;
    try {
        Type t = this.getField(11, 0);
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
   * Returns Certificate Domain (CER-11).
   */
  public CWE getCer11_CertificateDomain()  {
    CWE ret = null;
    try {
        Type t = this.getField(11, 0);
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
   * Returns Subject ID (CER-12).
   */
  public ID getSubjectID()  {
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
   * Returns Subject ID (CER-12).
   */
  public ID getCer12_SubjectID()  {
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
   * Returns Subject Name (CER-13).
   */
  public ST getSubjectName()  {
    ST ret = null;
    try {
        Type t = this.getField(13, 0);
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
   * Returns Subject Name (CER-13).
   */
  public ST getCer13_SubjectName()  {
    ST ret = null;
    try {
        Type t = this.getField(13, 0);
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
   * Returns a single repetition of Subject Directory Attribute Extension (CER-14).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getSubjectDirectoryAttributeExtension(int rep) throws HL7Exception {
    CWE ret = null;
    try {
        Type t = this.getField(14, rep);
        ret = (CWE)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Subject Directory Attribute Extension (CER-14).
   */
  public CWE[] getSubjectDirectoryAttributeExtension() {
     CWE[] ret = null;
    try {
        Type[] t = this.getField(14);  
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
   * Returns a count of the number of repetitions of Subject Directory Attribute Extension (CER-14).
   */
  public int getSubjectDirectoryAttributeExtensionReps() {
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
   * Inserts a repetition of Subject Directory Attribute Extension (CER-14) at a given index and returns it.
   * @param index The index
   */
  public CWE insertSubjectDirectoryAttributeExtension(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(14, index);
  }

  /**
   * Removes a repetition of Subject Directory Attribute Extension (CER-14) at a given index and returns it.
   * @param index The index
   */
  public CWE removeSubjectDirectoryAttributeExtension(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(14, index);
  }

  /**
   * Returns a single repetition of Subject Directory Attribute Extension (CER-14).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getCer14_SubjectDirectoryAttributeExtension(int rep) throws HL7Exception {
    CWE ret = null;
    try {
        Type t = this.getField(14, rep);
        ret = (CWE)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Subject Directory Attribute Extension (CER-14).
   */
  public CWE[] getCer14_SubjectDirectoryAttributeExtension() {
     CWE[] ret = null;
    try {
        Type[] t = this.getField(14);  
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
   * Returns a count of the number of repetitions of Subject Directory Attribute Extension (CER-14).
   */
  public int getCer14_SubjectDirectoryAttributeExtensionReps() {
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
   * Inserts a repetition of Subject Directory Attribute Extension (CER-14) at a given index and returns it.
   * @param index The index
   */
  public CWE insertCer14_SubjectDirectoryAttributeExtension(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(14, index);
  }

  /**
   * Removes a repetition of Subject Directory Attribute Extension (CER-14) at a given index and returns it.
   * @param index The index
   */
  public CWE removeCer14_SubjectDirectoryAttributeExtension(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(14, index);
  }

  /**
   * Returns Subject Public Key Info (CER-15).
   */
  public CWE getSubjectPublicKeyInfo()  {
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
   * Returns Subject Public Key Info (CER-15).
   */
  public CWE getCer15_SubjectPublicKeyInfo()  {
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
   * Returns Authority Key Identifier (CER-16).
   */
  public CWE getAuthorityKeyIdentifier()  {
    CWE ret = null;
    try {
        Type t = this.getField(16, 0);
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
   * Returns Authority Key Identifier (CER-16).
   */
  public CWE getCer16_AuthorityKeyIdentifier()  {
    CWE ret = null;
    try {
        Type t = this.getField(16, 0);
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
   * Returns Basic Constraint (CER-17).
   */
  public ID getBasicConstraint()  {
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
   * Returns Basic Constraint (CER-17).
   */
  public ID getCer17_BasicConstraint()  {
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
   * Returns a single repetition of CRL Distribution Point (CER-18).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getCRLDistributionPoint(int rep) throws HL7Exception {
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
   * Returns all repetitions of CRL Distribution Point (CER-18).
   */
  public CWE[] getCRLDistributionPoint() {
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
   * Returns a count of the number of repetitions of CRL Distribution Point (CER-18).
   */
  public int getCRLDistributionPointReps() {
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
   * Inserts a repetition of CRL Distribution Point (CER-18) at a given index and returns it.
   * @param index The index
   */
  public CWE insertCRLDistributionPoint(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(18, index);
  }

  /**
   * Removes a repetition of CRL Distribution Point (CER-18) at a given index and returns it.
   * @param index The index
   */
  public CWE removeCRLDistributionPoint(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(18, index);
  }

  /**
   * Returns a single repetition of CRL Distribution Point (CER-18).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getCer18_CRLDistributionPoint(int rep) throws HL7Exception {
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
   * Returns all repetitions of CRL Distribution Point (CER-18).
   */
  public CWE[] getCer18_CRLDistributionPoint() {
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
   * Returns a count of the number of repetitions of CRL Distribution Point (CER-18).
   */
  public int getCer18_CRLDistributionPointReps() {
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
   * Inserts a repetition of CRL Distribution Point (CER-18) at a given index and returns it.
   * @param index The index
   */
  public CWE insertCer18_CRLDistributionPoint(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(18, index);
  }

  /**
   * Removes a repetition of CRL Distribution Point (CER-18) at a given index and returns it.
   * @param index The index
   */
  public CWE removeCer18_CRLDistributionPoint(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(18, index);
  }

  /**
   * Returns Jurisdiction Country (CER-19).
   */
  public ID getJurisdictionCountry()  {
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
   * Returns Jurisdiction Country (CER-19).
   */
  public ID getCer19_JurisdictionCountry()  {
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
   * Returns Jurisdiction State/Province (CER-20).
   */
  public CWE getJurisdictionStateProvince()  {
    CWE ret = null;
    try {
        Type t = this.getField(20, 0);
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
   * Returns Jurisdiction State/Province (CER-20).
   */
  public CWE getCer20_JurisdictionStateProvince()  {
    CWE ret = null;
    try {
        Type t = this.getField(20, 0);
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
   * Returns Jurisdiction County/Parish (CER-21).
   */
  public CWE getJurisdictionCountyParish()  {
    CWE ret = null;
    try {
        Type t = this.getField(21, 0);
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
   * Returns Jurisdiction County/Parish (CER-21).
   */
  public CWE getCer21_JurisdictionCountyParish()  {
    CWE ret = null;
    try {
        Type t = this.getField(21, 0);
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
   * Returns a single repetition of Jurisdiction Breadth (CER-22).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getJurisdictionBreadth(int rep) throws HL7Exception {
    CWE ret = null;
    try {
        Type t = this.getField(22, rep);
        ret = (CWE)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Jurisdiction Breadth (CER-22).
   */
  public CWE[] getJurisdictionBreadth() {
     CWE[] ret = null;
    try {
        Type[] t = this.getField(22);  
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
   * Returns a count of the number of repetitions of Jurisdiction Breadth (CER-22).
   */
  public int getJurisdictionBreadthReps() {
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
   * Inserts a repetition of Jurisdiction Breadth (CER-22) at a given index and returns it.
   * @param index The index
   */
  public CWE insertJurisdictionBreadth(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(22, index);
  }

  /**
   * Removes a repetition of Jurisdiction Breadth (CER-22) at a given index and returns it.
   * @param index The index
   */
  public CWE removeJurisdictionBreadth(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(22, index);
  }

  /**
   * Returns a single repetition of Jurisdiction Breadth (CER-22).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getCer22_JurisdictionBreadth(int rep) throws HL7Exception {
    CWE ret = null;
    try {
        Type t = this.getField(22, rep);
        ret = (CWE)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Jurisdiction Breadth (CER-22).
   */
  public CWE[] getCer22_JurisdictionBreadth() {
     CWE[] ret = null;
    try {
        Type[] t = this.getField(22);  
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
   * Returns a count of the number of repetitions of Jurisdiction Breadth (CER-22).
   */
  public int getCer22_JurisdictionBreadthReps() {
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
   * Inserts a repetition of Jurisdiction Breadth (CER-22) at a given index and returns it.
   * @param index The index
   */
  public CWE insertCer22_JurisdictionBreadth(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(22, index);
  }

  /**
   * Removes a repetition of Jurisdiction Breadth (CER-22) at a given index and returns it.
   * @param index The index
   */
  public CWE removeCer22_JurisdictionBreadth(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(22, index);
  }

  /**
   * Returns Granting Date (CER-23).
   */
  public DTM getGrantingDate()  {
    DTM ret = null;
    try {
        Type t = this.getField(23, 0);
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
   * Returns Granting Date (CER-23).
   */
  public DTM getCer23_GrantingDate()  {
    DTM ret = null;
    try {
        Type t = this.getField(23, 0);
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
   * Returns Issuing Date (CER-24).
   */
  public DTM getIssuingDate()  {
    DTM ret = null;
    try {
        Type t = this.getField(24, 0);
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
   * Returns Issuing Date (CER-24).
   */
  public DTM getCer24_IssuingDate()  {
    DTM ret = null;
    try {
        Type t = this.getField(24, 0);
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
   * Returns Activation Date (CER-25).
   */
  public DTM getActivationDate()  {
    DTM ret = null;
    try {
        Type t = this.getField(25, 0);
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
   * Returns Activation Date (CER-25).
   */
  public DTM getCer25_ActivationDate()  {
    DTM ret = null;
    try {
        Type t = this.getField(25, 0);
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
   * Returns Inactivation Date (CER-26).
   */
  public DTM getInactivationDate()  {
    DTM ret = null;
    try {
        Type t = this.getField(26, 0);
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
   * Returns Inactivation Date (CER-26).
   */
  public DTM getCer26_InactivationDate()  {
    DTM ret = null;
    try {
        Type t = this.getField(26, 0);
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
   * Returns Expiration Date (CER-27).
   */
  public DTM getExpirationDate()  {
    DTM ret = null;
    try {
        Type t = this.getField(27, 0);
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
   * Returns Expiration Date (CER-27).
   */
  public DTM getCer27_ExpirationDate()  {
    DTM ret = null;
    try {
        Type t = this.getField(27, 0);
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
   * Returns Renewal Date (CER-28).
   */
  public DTM getRenewalDate()  {
    DTM ret = null;
    try {
        Type t = this.getField(28, 0);
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
   * Returns Renewal Date (CER-28).
   */
  public DTM getCer28_RenewalDate()  {
    DTM ret = null;
    try {
        Type t = this.getField(28, 0);
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
   * Returns Revocation Date (CER-29).
   */
  public DTM getRevocationDate()  {
    DTM ret = null;
    try {
        Type t = this.getField(29, 0);
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
   * Returns Revocation Date (CER-29).
   */
  public DTM getCer29_RevocationDate()  {
    DTM ret = null;
    try {
        Type t = this.getField(29, 0);
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
   * Returns Revocation Reason Code (CER-30).
   */
  public CWE getRevocationReasonCode()  {
    CWE ret = null;
    try {
        Type t = this.getField(30, 0);
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
   * Returns Revocation Reason Code (CER-30).
   */
  public CWE getCer30_RevocationReasonCode()  {
    CWE ret = null;
    try {
        Type t = this.getField(30, 0);
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
   * Returns Certificate Status Code (CER-31).
   */
  public CWE getCertificateStatusCode()  {
    CWE ret = null;
    try {
        Type t = this.getField(31, 0);
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
   * Returns Certificate Status Code (CER-31).
   */
  public CWE getCer31_CertificateStatusCode()  {
    CWE ret = null;
    try {
        Type t = this.getField(31, 0);
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
         case 1: return new ca.uhn.hl7v2.model.v26.datatype.ST(getMessage());
         case 2: return new ca.uhn.hl7v2.model.v26.datatype.ST(getMessage());
         case 3: return new ca.uhn.hl7v2.model.v26.datatype.XON(getMessage());
         case 4: return new ca.uhn.hl7v2.model.v26.datatype.XCN(getMessage());
         case 5: return new ca.uhn.hl7v2.model.v26.datatype.ED(getMessage());
         case 6: return new ca.uhn.hl7v2.model.v26.datatype.ID(getMessage(), new Integer(399));
         case 7: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 8: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 9: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 10: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 11: return new ca.uhn.hl7v2.model.v26.datatype.ID(getMessage(), new Integer(0));
         case 12: return new ca.uhn.hl7v2.model.v26.datatype.ST(getMessage());
         case 13: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 14: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 15: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 16: return new ca.uhn.hl7v2.model.v26.datatype.ID(getMessage(), new Integer(136));
         case 17: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 18: return new ca.uhn.hl7v2.model.v26.datatype.ID(getMessage(), new Integer(399));
         case 19: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 20: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 21: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 22: return new ca.uhn.hl7v2.model.v26.datatype.DTM(getMessage());
         case 23: return new ca.uhn.hl7v2.model.v26.datatype.DTM(getMessage());
         case 24: return new ca.uhn.hl7v2.model.v26.datatype.DTM(getMessage());
         case 25: return new ca.uhn.hl7v2.model.v26.datatype.DTM(getMessage());
         case 26: return new ca.uhn.hl7v2.model.v26.datatype.DTM(getMessage());
         case 27: return new ca.uhn.hl7v2.model.v26.datatype.DTM(getMessage());
         case 28: return new ca.uhn.hl7v2.model.v26.datatype.DTM(getMessage());
         case 29: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 30: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         default: return null;
      }
   }

}