package ca.uhn.hl7v2.model.v26.segment;

import ca.uhn.hl7v2.model.*;
import ca.uhn.hl7v2.model.v26.datatype.*;
import ca.uhn.log.HapiLogFactory;
import ca.uhn.hl7v2.parser.ModelClassFactory;
import ca.uhn.hl7v2.HL7Exception;

/**
 * <p>Represents an HL7 EQP message segment. 
 * This segment has the following fields:</p><p>
 * EQP-1: Event type (CWE)<br> 
 * EQP-2: File Name (ST)<br> 
 * EQP-3: Start Date/Time (DTM)<br> 
 * EQP-4: End Date/Time (DTM)<br> 
 * EQP-5: Transaction Data (FT)<br> 
 * </p><p>The get...() methods return data from individual fields.  These methods 
 * do not throw exceptions and may therefore have to handle exceptions internally.  
 * If an exception is handled internally, it is logged and null is returned.  
 * This is not expected to happen - if it does happen this indicates not so much 
 * an exceptional circumstance as a bug in the code for this class.</p>    
 */
public class EQP extends AbstractSegment  {

  /**
   * Creates a EQP (Equipment/log Service) segment object that belongs to the given 
   * message.  
   */
  public EQP(Group parent, ModelClassFactory factory) {
    super(parent, factory);
    Message message = getMessage();
    try {
       this.add(CWE.class, true, 1, 705, new Object[]{message}, "Event type");
       this.add(ST.class, false, 1, 20, new Object[]{message}, "File Name");
       this.add(DTM.class, true, 1, 24, new Object[]{message}, "Start Date/Time");
       this.add(DTM.class, false, 1, 24, new Object[]{message}, "End Date/Time");
       this.add(FT.class, true, 1, 65536, new Object[]{message}, "Transaction Data");
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Can't instantiate " + this.getClass().getName(), he);
    }
  }

  /**
   * Returns Event type (EQP-1).
   */
  public CWE getEventType()  {
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
   * Returns Event type (EQP-1).
   */
  public CWE getEqp1_EventType()  {
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
   * Returns File Name (EQP-2).
   */
  public ST getFileName()  {
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
   * Returns File Name (EQP-2).
   */
  public ST getEqp2_FileName()  {
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
   * Returns Start Date/Time (EQP-3).
   */
  public DTM getStartDateTime()  {
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
   * Returns Start Date/Time (EQP-3).
   */
  public DTM getEqp3_StartDateTime()  {
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
   * Returns End Date/Time (EQP-4).
   */
  public DTM getEndDateTime()  {
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
   * Returns End Date/Time (EQP-4).
   */
  public DTM getEqp4_EndDateTime()  {
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
   * Returns Transaction Data (EQP-5).
   */
  public FT getTransactionData()  {
    FT ret = null;
    try {
        Type t = this.getField(5, 0);
        ret = (FT)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns Transaction Data (EQP-5).
   */
  public FT getEqp5_TransactionData()  {
    FT ret = null;
    try {
        Type t = this.getField(5, 0);
        ret = (FT)t;
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
         case 1: return new ca.uhn.hl7v2.model.v26.datatype.ST(getMessage());
         case 2: return new ca.uhn.hl7v2.model.v26.datatype.DTM(getMessage());
         case 3: return new ca.uhn.hl7v2.model.v26.datatype.DTM(getMessage());
         case 4: return new ca.uhn.hl7v2.model.v26.datatype.FT(getMessage());
         default: return null;
      }
   }

}