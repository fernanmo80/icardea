package ca.uhn.hl7v2.model.v26.segment;

import ca.uhn.hl7v2.model.*;
import ca.uhn.hl7v2.model.v26.datatype.*;
import ca.uhn.log.HapiLogFactory;
import ca.uhn.hl7v2.parser.ModelClassFactory;
import ca.uhn.hl7v2.HL7Exception;

/**
 * <p>Represents an HL7 REL message segment. 
 * This segment has the following fields:</p><p>
 * REL-1: Set ID -REL (SI)<br> 
 * REL-2: Relationship Type (CWE)<br> 
 * REL-3: This Relationship Instance Identifier (EI)<br> 
 * REL-4: Source Information Instance Identifier (EI)<br> 
 * REL-5: Target Information Instance Identifier (EI)<br> 
 * REL-6: Asserting Entity Instance ID (EI)<br> 
 * REL-7: Asserting Person (XCN)<br> 
 * REL-8: Asserting Organization (XON)<br> 
 * REL-9: Assertor Address (XAD)<br> 
 * REL-10: Assertor Contact (XTN)<br> 
 * REL-11: Assertion Date Range (DR)<br> 
 * REL-12: Negation Indicator (ID)<br> 
 * REL-13: Certainty of Relationship (CWE)<br> 
 * REL-14: Priority No (NM)<br> 
 * REL-15: Priority  Sequence No (rel preference for consideration) (NM)<br> 
 * REL-16: Separability Indicator (ID)<br> 
 * </p><p>The get...() methods return data from individual fields.  These methods 
 * do not throw exceptions and may therefore have to handle exceptions internally.  
 * If an exception is handled internally, it is logged and null is returned.  
 * This is not expected to happen - if it does happen this indicates not so much 
 * an exceptional circumstance as a bug in the code for this class.</p>    
 */
public class REL extends AbstractSegment  {

  /**
   * Creates a REL (Clinical Relationship Segment) segment object that belongs to the given 
   * message.  
   */
  public REL(Group parent, ModelClassFactory factory) {
    super(parent, factory);
    Message message = getMessage();
    try {
       this.add(SI.class, false, 1, 4, new Object[]{message}, "Set ID -REL");
       this.add(CWE.class, true, 1, 705, new Object[]{message}, "Relationship Type");
       this.add(EI.class, true, 1, 60, new Object[]{message}, "This Relationship Instance Identifier");
       this.add(EI.class, true, 1, 60, new Object[]{message}, "Source Information Instance Identifier");
       this.add(EI.class, true, 1, 60, new Object[]{message}, "Target Information Instance Identifier");
       this.add(EI.class, false, 1, 60, new Object[]{message}, "Asserting Entity Instance ID");
       this.add(XCN.class, false, 1, 250, new Object[]{message}, "Asserting Person");
       this.add(XON.class, false, 1, 250, new Object[]{message}, "Asserting Organization");
       this.add(XAD.class, false, 1, 250, new Object[]{message}, "Assertor Address");
       this.add(XTN.class, false, 1, 250, new Object[]{message}, "Assertor Contact");
       this.add(DR.class, false, 1, 53, new Object[]{message}, "Assertion Date Range");
       this.add(ID.class, false, 1, 1, new Object[]{message, new Integer(136)}, "Negation Indicator");
       this.add(CWE.class, false, 1, 705, new Object[]{message}, "Certainty of Relationship");
       this.add(NM.class, false, 1, 26, new Object[]{message}, "Priority No");
       this.add(NM.class, false, 1, 250, new Object[]{message}, "Priority  Sequence No (rel preference for consideration)");
       this.add(ID.class, false, 1, 1, new Object[]{message, new Integer(136)}, "Separability Indicator");
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Can't instantiate " + this.getClass().getName(), he);
    }
  }

  /**
   * Returns Set ID -REL (REL-1).
   */
  public SI getSetIDREL()  {
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
   * Returns Set ID -REL (REL-1).
   */
  public SI getRel1_SetIDREL()  {
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
   * Returns Relationship Type (REL-2).
   */
  public CWE getRelationshipType()  {
    CWE ret = null;
    try {
        Type t = this.getField(2, 0);
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
   * Returns Relationship Type (REL-2).
   */
  public CWE getRel2_RelationshipType()  {
    CWE ret = null;
    try {
        Type t = this.getField(2, 0);
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
   * Returns This Relationship Instance Identifier (REL-3).
   */
  public EI getThisRelationshipInstanceIdentifier()  {
    EI ret = null;
    try {
        Type t = this.getField(3, 0);
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
   * Returns This Relationship Instance Identifier (REL-3).
   */
  public EI getRel3_ThisRelationshipInstanceIdentifier()  {
    EI ret = null;
    try {
        Type t = this.getField(3, 0);
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
   * Returns Source Information Instance Identifier (REL-4).
   */
  public EI getSourceInformationInstanceIdentifier()  {
    EI ret = null;
    try {
        Type t = this.getField(4, 0);
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
   * Returns Source Information Instance Identifier (REL-4).
   */
  public EI getRel4_SourceInformationInstanceIdentifier()  {
    EI ret = null;
    try {
        Type t = this.getField(4, 0);
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
   * Returns Target Information Instance Identifier (REL-5).
   */
  public EI getTargetInformationInstanceIdentifier()  {
    EI ret = null;
    try {
        Type t = this.getField(5, 0);
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
   * Returns Target Information Instance Identifier (REL-5).
   */
  public EI getRel5_TargetInformationInstanceIdentifier()  {
    EI ret = null;
    try {
        Type t = this.getField(5, 0);
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
   * Returns Asserting Entity Instance ID (REL-6).
   */
  public EI getAssertingEntityInstanceID()  {
    EI ret = null;
    try {
        Type t = this.getField(6, 0);
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
   * Returns Asserting Entity Instance ID (REL-6).
   */
  public EI getRel6_AssertingEntityInstanceID()  {
    EI ret = null;
    try {
        Type t = this.getField(6, 0);
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
   * Returns Asserting Person (REL-7).
   */
  public XCN getAssertingPerson()  {
    XCN ret = null;
    try {
        Type t = this.getField(7, 0);
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
   * Returns Asserting Person (REL-7).
   */
  public XCN getRel7_AssertingPerson()  {
    XCN ret = null;
    try {
        Type t = this.getField(7, 0);
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
   * Returns Asserting Organization (REL-8).
   */
  public XON getAssertingOrganization()  {
    XON ret = null;
    try {
        Type t = this.getField(8, 0);
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
   * Returns Asserting Organization (REL-8).
   */
  public XON getRel8_AssertingOrganization()  {
    XON ret = null;
    try {
        Type t = this.getField(8, 0);
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
   * Returns Assertor Address (REL-9).
   */
  public XAD getAssertorAddress()  {
    XAD ret = null;
    try {
        Type t = this.getField(9, 0);
        ret = (XAD)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns Assertor Address (REL-9).
   */
  public XAD getRel9_AssertorAddress()  {
    XAD ret = null;
    try {
        Type t = this.getField(9, 0);
        ret = (XAD)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns Assertor Contact (REL-10).
   */
  public XTN getAssertorContact()  {
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
   * Returns Assertor Contact (REL-10).
   */
  public XTN getRel10_AssertorContact()  {
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
   * Returns Assertion Date Range (REL-11).
   */
  public DR getAssertionDateRange()  {
    DR ret = null;
    try {
        Type t = this.getField(11, 0);
        ret = (DR)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns Assertion Date Range (REL-11).
   */
  public DR getRel11_AssertionDateRange()  {
    DR ret = null;
    try {
        Type t = this.getField(11, 0);
        ret = (DR)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns Negation Indicator (REL-12).
   */
  public ID getNegationIndicator()  {
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
   * Returns Negation Indicator (REL-12).
   */
  public ID getRel12_NegationIndicator()  {
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
   * Returns Certainty of Relationship (REL-13).
   */
  public CWE getCertaintyOfRelationship()  {
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
   * Returns Certainty of Relationship (REL-13).
   */
  public CWE getRel13_CertaintyOfRelationship()  {
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
   * Returns Priority No (REL-14).
   */
  public NM getPriorityNo()  {
    NM ret = null;
    try {
        Type t = this.getField(14, 0);
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
   * Returns Priority No (REL-14).
   */
  public NM getRel14_PriorityNo()  {
    NM ret = null;
    try {
        Type t = this.getField(14, 0);
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
   * Returns Priority  Sequence No (rel preference for consideration) (REL-15).
   */
  public NM getPrioritySequenceNoRelpreferenceforconsideration()  {
    NM ret = null;
    try {
        Type t = this.getField(15, 0);
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
   * Returns Priority  Sequence No (rel preference for consideration) (REL-15).
   */
  public NM getRel15_PrioritySequenceNoRelpreferenceforconsideration()  {
    NM ret = null;
    try {
        Type t = this.getField(15, 0);
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
   * Returns Separability Indicator (REL-16).
   */
  public ID getSeparabilityIndicator()  {
    ID ret = null;
    try {
        Type t = this.getField(16, 0);
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
   * Returns Separability Indicator (REL-16).
   */
  public ID getRel16_SeparabilityIndicator()  {
    ID ret = null;
    try {
        Type t = this.getField(16, 0);
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
         case 0: return new ca.uhn.hl7v2.model.v26.datatype.SI(getMessage());
         case 1: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 2: return new ca.uhn.hl7v2.model.v26.datatype.EI(getMessage());
         case 3: return new ca.uhn.hl7v2.model.v26.datatype.EI(getMessage());
         case 4: return new ca.uhn.hl7v2.model.v26.datatype.EI(getMessage());
         case 5: return new ca.uhn.hl7v2.model.v26.datatype.EI(getMessage());
         case 6: return new ca.uhn.hl7v2.model.v26.datatype.XCN(getMessage());
         case 7: return new ca.uhn.hl7v2.model.v26.datatype.XON(getMessage());
         case 8: return new ca.uhn.hl7v2.model.v26.datatype.XAD(getMessage());
         case 9: return new ca.uhn.hl7v2.model.v26.datatype.XTN(getMessage());
         case 10: return new ca.uhn.hl7v2.model.v26.datatype.DR(getMessage());
         case 11: return new ca.uhn.hl7v2.model.v26.datatype.ID(getMessage(), new Integer(136));
         case 12: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 13: return new ca.uhn.hl7v2.model.v26.datatype.NM(getMessage());
         case 14: return new ca.uhn.hl7v2.model.v26.datatype.NM(getMessage());
         case 15: return new ca.uhn.hl7v2.model.v26.datatype.ID(getMessage(), new Integer(136));
         default: return null;
      }
   }

}