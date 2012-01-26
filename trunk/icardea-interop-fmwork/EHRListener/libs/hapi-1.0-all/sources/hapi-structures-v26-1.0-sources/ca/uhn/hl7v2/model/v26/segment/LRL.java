package ca.uhn.hl7v2.model.v26.segment;

import ca.uhn.hl7v2.model.*;
import ca.uhn.hl7v2.model.v26.datatype.*;
import ca.uhn.log.HapiLogFactory;
import ca.uhn.hl7v2.parser.ModelClassFactory;
import ca.uhn.hl7v2.HL7Exception;

/**
 * <p>Represents an HL7 LRL message segment. 
 * This segment has the following fields:</p><p>
 * LRL-1: Primary Key Value - LRL (PL)<br> 
 * LRL-2: Segment Action Code (ID)<br> 
 * LRL-3: Segment Unique Key (EI)<br> 
 * LRL-4: Location Relationship ID (CWE)<br> 
 * LRL-5: Organizational Location Relationship Value (XON)<br> 
 * LRL-6: Patient Location Relationship Value (PL)<br> 
 * </p><p>The get...() methods return data from individual fields.  These methods 
 * do not throw exceptions and may therefore have to handle exceptions internally.  
 * If an exception is handled internally, it is logged and null is returned.  
 * This is not expected to happen - if it does happen this indicates not so much 
 * an exceptional circumstance as a bug in the code for this class.</p>    
 */
public class LRL extends AbstractSegment  {

  /**
   * Creates a LRL (Location Relationship) segment object that belongs to the given 
   * message.  
   */
  public LRL(Group parent, ModelClassFactory factory) {
    super(parent, factory);
    Message message = getMessage();
    try {
       this.add(PL.class, true, 1, 200, new Object[]{message}, "Primary Key Value - LRL");
       this.add(ID.class, false, 1, 3, new Object[]{message, new Integer(206)}, "Segment Action Code");
       this.add(EI.class, false, 1, 80, new Object[]{message}, "Segment Unique Key");
       this.add(CWE.class, true, 1, 250, new Object[]{message}, "Location Relationship ID");
       this.add(XON.class, false, 0, 250, new Object[]{message}, "Organizational Location Relationship Value");
       this.add(PL.class, false, 1, 80, new Object[]{message}, "Patient Location Relationship Value");
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Can't instantiate " + this.getClass().getName(), he);
    }
  }

  /**
   * Returns Primary Key Value - LRL (LRL-1).
   */
  public PL getPrimaryKeyValueLRL()  {
    PL ret = null;
    try {
        Type t = this.getField(1, 0);
        ret = (PL)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns Primary Key Value - LRL (LRL-1).
   */
  public PL getLrl1_PrimaryKeyValueLRL()  {
    PL ret = null;
    try {
        Type t = this.getField(1, 0);
        ret = (PL)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns Segment Action Code (LRL-2).
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
   * Returns Segment Action Code (LRL-2).
   */
  public ID getLrl2_SegmentActionCode()  {
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
   * Returns Segment Unique Key (LRL-3).
   */
  public EI getSegmentUniqueKey()  {
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
   * Returns Segment Unique Key (LRL-3).
   */
  public EI getLrl3_SegmentUniqueKey()  {
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
   * Returns Location Relationship ID (LRL-4).
   */
  public CWE getLocationRelationshipID()  {
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
   * Returns Location Relationship ID (LRL-4).
   */
  public CWE getLrl4_LocationRelationshipID()  {
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
   * Returns a single repetition of Organizational Location Relationship Value (LRL-5).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XON getOrganizationalLocationRelationshipValue(int rep) throws HL7Exception {
    XON ret = null;
    try {
        Type t = this.getField(5, rep);
        ret = (XON)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Organizational Location Relationship Value (LRL-5).
   */
  public XON[] getOrganizationalLocationRelationshipValue() {
     XON[] ret = null;
    try {
        Type[] t = this.getField(5);  
        ret = new XON[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (XON)t[i];
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
   * Returns a count of the number of repetitions of Organizational Location Relationship Value (LRL-5).
   */
  public int getOrganizationalLocationRelationshipValueReps() {
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
   * Inserts a repetition of Organizational Location Relationship Value (LRL-5) at a given index and returns it.
   * @param index The index
   */
  public XON insertOrganizationalLocationRelationshipValue(int index) throws HL7Exception {
     return (XON) super.insertRepetition(5, index);
  }

  /**
   * Removes a repetition of Organizational Location Relationship Value (LRL-5) at a given index and returns it.
   * @param index The index
   */
  public XON removeOrganizationalLocationRelationshipValue(int index) throws HL7Exception {
     return (XON) super.removeRepetition(5, index);
  }

  /**
   * Returns a single repetition of Organizational Location Relationship Value (LRL-5).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XON getLrl5_OrganizationalLocationRelationshipValue(int rep) throws HL7Exception {
    XON ret = null;
    try {
        Type t = this.getField(5, rep);
        ret = (XON)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Organizational Location Relationship Value (LRL-5).
   */
  public XON[] getLrl5_OrganizationalLocationRelationshipValue() {
     XON[] ret = null;
    try {
        Type[] t = this.getField(5);  
        ret = new XON[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (XON)t[i];
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
   * Returns a count of the number of repetitions of Organizational Location Relationship Value (LRL-5).
   */
  public int getLrl5_OrganizationalLocationRelationshipValueReps() {
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
   * Inserts a repetition of Organizational Location Relationship Value (LRL-5) at a given index and returns it.
   * @param index The index
   */
  public XON insertLrl5_OrganizationalLocationRelationshipValue(int index) throws HL7Exception {
     return (XON) super.insertRepetition(5, index);
  }

  /**
   * Removes a repetition of Organizational Location Relationship Value (LRL-5) at a given index and returns it.
   * @param index The index
   */
  public XON removeLrl5_OrganizationalLocationRelationshipValue(int index) throws HL7Exception {
     return (XON) super.removeRepetition(5, index);
  }

  /**
   * Returns Patient Location Relationship Value (LRL-6).
   */
  public PL getPatientLocationRelationshipValue()  {
    PL ret = null;
    try {
        Type t = this.getField(6, 0);
        ret = (PL)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns Patient Location Relationship Value (LRL-6).
   */
  public PL getLrl6_PatientLocationRelationshipValue()  {
    PL ret = null;
    try {
        Type t = this.getField(6, 0);
        ret = (PL)t;
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
         case 0: return new ca.uhn.hl7v2.model.v26.datatype.PL(getMessage());
         case 1: return new ca.uhn.hl7v2.model.v26.datatype.ID(getMessage(), new Integer(206));
         case 2: return new ca.uhn.hl7v2.model.v26.datatype.EI(getMessage());
         case 3: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 4: return new ca.uhn.hl7v2.model.v26.datatype.XON(getMessage());
         case 5: return new ca.uhn.hl7v2.model.v26.datatype.PL(getMessage());
         default: return null;
      }
   }

}