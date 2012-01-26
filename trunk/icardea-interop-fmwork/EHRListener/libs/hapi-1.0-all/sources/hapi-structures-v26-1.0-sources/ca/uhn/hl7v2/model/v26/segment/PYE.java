package ca.uhn.hl7v2.model.v26.segment;

import ca.uhn.hl7v2.model.*;
import ca.uhn.hl7v2.model.v26.datatype.*;
import ca.uhn.log.HapiLogFactory;
import ca.uhn.hl7v2.parser.ModelClassFactory;
import ca.uhn.hl7v2.HL7Exception;

/**
 * <p>Represents an HL7 PYE message segment. 
 * This segment has the following fields:</p><p>
 * PYE-1: Set ID - PYE (SI)<br> 
 * PYE-2: Payee Type (IS)<br> 
 * PYE-3: Payee Relationship to Invoice (Patient) (IS)<br> 
 * PYE-4: Payee Identification List (XON)<br> 
 * PYE-5: Payee Person Name (XPN)<br> 
 * PYE-6: Payee Address (XAD)<br> 
 * PYE-7: Payment Method (IS)<br> 
 * </p><p>The get...() methods return data from individual fields.  These methods 
 * do not throw exceptions and may therefore have to handle exceptions internally.  
 * If an exception is handled internally, it is logged and null is returned.  
 * This is not expected to happen - if it does happen this indicates not so much 
 * an exceptional circumstance as a bug in the code for this class.</p>    
 */
public class PYE extends AbstractSegment  {

  /**
   * Creates a PYE (Payee Information) segment object that belongs to the given 
   * message.  
   */
  public PYE(Group parent, ModelClassFactory factory) {
    super(parent, factory);
    Message message = getMessage();
    try {
       this.add(SI.class, true, 1, 4, new Object[]{message}, "Set ID - PYE");
       this.add(IS.class, true, 1, 6, new Object[]{message, new Integer(557)}, "Payee Type");
       this.add(IS.class, false, 1, 2, new Object[]{message, new Integer(558)}, "Payee Relationship to Invoice (Patient)");
       this.add(XON.class, false, 1, 183, new Object[]{message}, "Payee Identification List");
       this.add(XPN.class, false, 1, 466, new Object[]{message}, "Payee Person Name");
       this.add(XAD.class, false, 1, 235, new Object[]{message}, "Payee Address");
       this.add(IS.class, false, 1, 80, new Object[]{message, new Integer(570)}, "Payment Method");
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Can't instantiate " + this.getClass().getName(), he);
    }
  }

  /**
   * Returns Set ID - PYE (PYE-1).
   */
  public SI getSetIDPYE()  {
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
   * Returns Set ID - PYE (PYE-1).
   */
  public SI getPye1_SetIDPYE()  {
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
   * Returns Payee Type (PYE-2).
   */
  public IS getPayeeType()  {
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
   * Returns Payee Type (PYE-2).
   */
  public IS getPye2_PayeeType()  {
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
   * Returns Payee Relationship to Invoice (Patient) (PYE-3).
   */
  public IS getPayeeRelationshipToInvoicePatient()  {
    IS ret = null;
    try {
        Type t = this.getField(3, 0);
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
   * Returns Payee Relationship to Invoice (Patient) (PYE-3).
   */
  public IS getPye3_PayeeRelationshipToInvoicePatient()  {
    IS ret = null;
    try {
        Type t = this.getField(3, 0);
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
   * Returns Payee Identification List (PYE-4).
   */
  public XON getPayeeIdentificationList()  {
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
   * Returns Payee Identification List (PYE-4).
   */
  public XON getPye4_PayeeIdentificationList()  {
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
   * Returns Payee Person Name (PYE-5).
   */
  public XPN getPayeePersonName()  {
    XPN ret = null;
    try {
        Type t = this.getField(5, 0);
        ret = (XPN)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns Payee Person Name (PYE-5).
   */
  public XPN getPye5_PayeePersonName()  {
    XPN ret = null;
    try {
        Type t = this.getField(5, 0);
        ret = (XPN)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns Payee Address (PYE-6).
   */
  public XAD getPayeeAddress()  {
    XAD ret = null;
    try {
        Type t = this.getField(6, 0);
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
   * Returns Payee Address (PYE-6).
   */
  public XAD getPye6_PayeeAddress()  {
    XAD ret = null;
    try {
        Type t = this.getField(6, 0);
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
   * Returns Payment Method (PYE-7).
   */
  public IS getPaymentMethod()  {
    IS ret = null;
    try {
        Type t = this.getField(7, 0);
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
   * Returns Payment Method (PYE-7).
   */
  public IS getPye7_PaymentMethod()  {
    IS ret = null;
    try {
        Type t = this.getField(7, 0);
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
         case 1: return new ca.uhn.hl7v2.model.v26.datatype.IS(getMessage(), new Integer(557));
         case 2: return new ca.uhn.hl7v2.model.v26.datatype.IS(getMessage(), new Integer(558));
         case 3: return new ca.uhn.hl7v2.model.v26.datatype.XON(getMessage());
         case 4: return new ca.uhn.hl7v2.model.v26.datatype.XPN(getMessage());
         case 5: return new ca.uhn.hl7v2.model.v26.datatype.XAD(getMessage());
         case 6: return new ca.uhn.hl7v2.model.v26.datatype.IS(getMessage(), new Integer(570));
         default: return null;
      }
   }

}