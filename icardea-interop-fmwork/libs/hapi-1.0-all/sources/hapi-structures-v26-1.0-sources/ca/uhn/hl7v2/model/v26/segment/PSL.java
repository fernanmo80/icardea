package ca.uhn.hl7v2.model.v26.segment;

import ca.uhn.hl7v2.model.*;
import ca.uhn.hl7v2.model.v26.datatype.*;
import ca.uhn.log.HapiLogFactory;
import ca.uhn.hl7v2.parser.ModelClassFactory;
import ca.uhn.hl7v2.HL7Exception;

/**
 * <p>Represents an HL7 PSL message segment. 
 * This segment has the following fields:</p><p>
 * PSL-1: Provider Product/Service Line Item Number (EI)<br> 
 * PSL-2: Payer Product/Service Line Item Number (EI)<br> 
 * PSL-3: Product/Service Line Item Sequence Number (SI)<br> 
 * PSL-4: Provider Tracking ID (EI)<br> 
 * PSL-5: Payer Tracking ID (EI)<br> 
 * PSL-6: Product/Service Line Item Status (CWE)<br> 
 * PSL-7: Product/Service Code (CWE)<br> 
 * PSL-8: Product/Service Code Modifier (CWE)<br> 
 * PSL-9: Product/Service Code Description (ST)<br> 
 * PSL-10: Product/Service Effective Date (DTM)<br> 
 * PSL-11: Product/Service Expiration Date (DTM)<br> 
 * PSL-12: Product/Service Quantity (CQ)<br> 
 * PSL-13: Product/Service Unit Cost (CP)<br> 
 * PSL-14: Number of Items per Unit (NM)<br> 
 * PSL-15: Product/Service Gross Amount (CP)<br> 
 * PSL-16: Product/Service Billed Amount (CP)<br> 
 * PSL-17: Product/Service Clarification Code Type (IS)<br> 
 * PSL-18: Product/Service Clarification Code Value (ST)<br> 
 * PSL-19: Health Document Reference Identifier (EI)<br> 
 * PSL-20: Processing Consideration Code (IS)<br> 
 * PSL-21: Restricted Disclosure Indicator (ID)<br> 
 * PSL-22: Related Product/Service Code Indicator (CWE)<br> 
 * PSL-23: Product/Service Amount for Physician (CP)<br> 
 * PSL-24: Product/Service Cost Factor (NM)<br> 
 * PSL-25: Cost Center (CX)<br> 
 * PSL-26: Billing Period (DR)<br> 
 * PSL-27: Days without Billing (NM)<br> 
 * PSL-28: Session-No (NM)<br> 
 * PSL-29: Executing Physician ID (XCN)<br> 
 * PSL-30: Responsible Physician ID (XCN)<br> 
 * PSL-31: Role Executing Physician (CWE)<br> 
 * PSL-32: Medical Role Executing Physician (CWE)<br> 
 * PSL-33: Side of body (CWE)<br> 
 * PSL-34: Number of TP's PP (NM)<br> 
 * PSL-35: TP-Value PP (CP)<br> 
 * PSL-36: Internal Scaling Factor PP (NM)<br> 
 * PSL-37: External Scaling Factor PP (NM)<br> 
 * PSL-38: Amount PP (CP)<br> 
 * PSL-39: Number of TP's Technical Part (NM)<br> 
 * PSL-40: TP-Value Technical Part (CP)<br> 
 * PSL-41: Internal Scaling Factor Technical Part (NM)<br> 
 * PSL-42: External Scaling Factor Technical Part (NM)<br> 
 * PSL-43: Amount Technical Part (CP)<br> 
 * PSL-44: Total Amount Professional Part + Technical Part (CP)<br> 
 * PSL-45: VAT-Rate (NM)<br> 
 * PSL-46: Main-Service (ID)<br> 
 * PSL-47: Validation (ID)<br> 
 * PSL-48: Comment (ST)<br> 
 * </p><p>The get...() methods return data from individual fields.  These methods 
 * do not throw exceptions and may therefore have to handle exceptions internally.  
 * If an exception is handled internally, it is logged and null is returned.  
 * This is not expected to happen - if it does happen this indicates not so much 
 * an exceptional circumstance as a bug in the code for this class.</p>    
 */
public class PSL extends AbstractSegment  {

  /**
   * Creates a PSL (Product/Service Line Item) segment object that belongs to the given 
   * message.  
   */
  public PSL(Group parent, ModelClassFactory factory) {
    super(parent, factory);
    Message message = getMessage();
    try {
       this.add(EI.class, true, 1, 73, new Object[]{message}, "Provider Product/Service Line Item Number");
       this.add(EI.class, false, 1, 73, new Object[]{message}, "Payer Product/Service Line Item Number");
       this.add(SI.class, true, 1, 4, new Object[]{message}, "Product/Service Line Item Sequence Number");
       this.add(EI.class, false, 1, 20, new Object[]{message}, "Provider Tracking ID");
       this.add(EI.class, false, 1, 20, new Object[]{message}, "Payer Tracking ID");
       this.add(CWE.class, true, 1, 2, new Object[]{message}, "Product/Service Line Item Status");
       this.add(CWE.class, true, 1, 177, new Object[]{message}, "Product/Service Code");
       this.add(CWE.class, false, 1, 177, new Object[]{message}, "Product/Service Code Modifier");
       this.add(ST.class, false, 1, 80, new Object[]{message}, "Product/Service Code Description");
       this.add(DTM.class, false, 1, 24, new Object[]{message}, "Product/Service Effective Date");
       this.add(DTM.class, false, 1, 24, new Object[]{message}, "Product/Service Expiration Date");
       this.add(CQ.class, false, 1, 222, new Object[]{message}, "Product/Service Quantity");
       this.add(CP.class, false, 1, 254, new Object[]{message}, "Product/Service Unit Cost");
       this.add(NM.class, false, 1, 10, new Object[]{message}, "Number of Items per Unit");
       this.add(CP.class, false, 1, 254, new Object[]{message}, "Product/Service Gross Amount");
       this.add(CP.class, false, 1, 254, new Object[]{message}, "Product/Service Billed Amount");
       this.add(IS.class, false, 1, 10, new Object[]{message, new Integer(561)}, "Product/Service Clarification Code Type");
       this.add(ST.class, false, 1, 40, new Object[]{message}, "Product/Service Clarification Code Value");
       this.add(EI.class, false, 1, 73, new Object[]{message}, "Health Document Reference Identifier");
       this.add(IS.class, false, 1, 10, new Object[]{message, new Integer(562)}, "Processing Consideration Code");
       this.add(ID.class, true, 1, 2, new Object[]{message, new Integer(532)}, "Restricted Disclosure Indicator");
       this.add(CWE.class, false, 1, 177, new Object[]{message}, "Related Product/Service Code Indicator");
       this.add(CP.class, false, 1, 254, new Object[]{message}, "Product/Service Amount for Physician");
       this.add(NM.class, false, 1, 5, new Object[]{message}, "Product/Service Cost Factor");
       this.add(CX.class, false, 1, 250, new Object[]{message}, "Cost Center");
       this.add(DR.class, false, 1, 49, new Object[]{message}, "Billing Period");
       this.add(NM.class, false, 1, 5, new Object[]{message}, "Days without Billing");
       this.add(NM.class, false, 1, 4, new Object[]{message}, "Session-No");
       this.add(XCN.class, false, 1, 20, new Object[]{message}, "Executing Physician ID");
       this.add(XCN.class, false, 1, 20, new Object[]{message}, "Responsible Physician ID");
       this.add(CWE.class, false, 1, 10, new Object[]{message}, "Role Executing Physician");
       this.add(CWE.class, false, 1, 10, new Object[]{message}, "Medical Role Executing Physician");
       this.add(CWE.class, false, 1, 3, new Object[]{message}, "Side of body");
       this.add(NM.class, false, 1, 6, new Object[]{message}, "Number of TP's PP");
       this.add(CP.class, false, 1, 6, new Object[]{message}, "TP-Value PP");
       this.add(NM.class, false, 1, 4, new Object[]{message}, "Internal Scaling Factor PP");
       this.add(NM.class, false, 1, 4, new Object[]{message}, "External Scaling Factor PP");
       this.add(CP.class, false, 1, 7, new Object[]{message}, "Amount PP");
       this.add(NM.class, false, 1, 6, new Object[]{message}, "Number of TP's Technical Part");
       this.add(CP.class, false, 1, 6, new Object[]{message}, "TP-Value Technical Part");
       this.add(NM.class, false, 1, 4, new Object[]{message}, "Internal Scaling Factor Technical Part");
       this.add(NM.class, false, 1, 4, new Object[]{message}, "External Scaling Factor Technical Part");
       this.add(CP.class, false, 1, 7, new Object[]{message}, "Amount Technical Part");
       this.add(CP.class, false, 1, 8, new Object[]{message}, "Total Amount Professional Part + Technical Part");
       this.add(NM.class, false, 1, 3, new Object[]{message}, "VAT-Rate");
       this.add(ID.class, false, 1, 20, new Object[]{message, new Integer(0)}, "Main-Service");
       this.add(ID.class, false, 1, 1, new Object[]{message, new Integer(136)}, "Validation");
       this.add(ST.class, false, 1, 255, new Object[]{message}, "Comment");
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Can't instantiate " + this.getClass().getName(), he);
    }
  }

  /**
   * Returns Provider Product/Service Line Item Number (PSL-1).
   */
  public EI getProviderProductServiceLineItemNumber()  {
    EI ret = null;
    try {
        Type t = this.getField(1, 0);
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
   * Returns Provider Product/Service Line Item Number (PSL-1).
   */
  public EI getPsl1_ProviderProductServiceLineItemNumber()  {
    EI ret = null;
    try {
        Type t = this.getField(1, 0);
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
   * Returns Payer Product/Service Line Item Number (PSL-2).
   */
  public EI getPayerProductServiceLineItemNumber()  {
    EI ret = null;
    try {
        Type t = this.getField(2, 0);
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
   * Returns Payer Product/Service Line Item Number (PSL-2).
   */
  public EI getPsl2_PayerProductServiceLineItemNumber()  {
    EI ret = null;
    try {
        Type t = this.getField(2, 0);
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
   * Returns Product/Service Line Item Sequence Number (PSL-3).
   */
  public SI getProductServiceLineItemSequenceNumber()  {
    SI ret = null;
    try {
        Type t = this.getField(3, 0);
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
   * Returns Product/Service Line Item Sequence Number (PSL-3).
   */
  public SI getPsl3_ProductServiceLineItemSequenceNumber()  {
    SI ret = null;
    try {
        Type t = this.getField(3, 0);
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
   * Returns Provider Tracking ID (PSL-4).
   */
  public EI getProviderTrackingID()  {
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
   * Returns Provider Tracking ID (PSL-4).
   */
  public EI getPsl4_ProviderTrackingID()  {
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
   * Returns Payer Tracking ID (PSL-5).
   */
  public EI getPayerTrackingID()  {
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
   * Returns Payer Tracking ID (PSL-5).
   */
  public EI getPsl5_PayerTrackingID()  {
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
   * Returns Product/Service Line Item Status (PSL-6).
   */
  public CWE getProductServiceLineItemStatus()  {
    CWE ret = null;
    try {
        Type t = this.getField(6, 0);
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
   * Returns Product/Service Line Item Status (PSL-6).
   */
  public CWE getPsl6_ProductServiceLineItemStatus()  {
    CWE ret = null;
    try {
        Type t = this.getField(6, 0);
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
   * Returns Product/Service Code (PSL-7).
   */
  public CWE getProductServiceCode()  {
    CWE ret = null;
    try {
        Type t = this.getField(7, 0);
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
   * Returns Product/Service Code (PSL-7).
   */
  public CWE getPsl7_ProductServiceCode()  {
    CWE ret = null;
    try {
        Type t = this.getField(7, 0);
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
   * Returns Product/Service Code Modifier (PSL-8).
   */
  public CWE getProductServiceCodeModifier()  {
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
   * Returns Product/Service Code Modifier (PSL-8).
   */
  public CWE getPsl8_ProductServiceCodeModifier()  {
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
   * Returns Product/Service Code Description (PSL-9).
   */
  public ST getProductServiceCodeDescription()  {
    ST ret = null;
    try {
        Type t = this.getField(9, 0);
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
   * Returns Product/Service Code Description (PSL-9).
   */
  public ST getPsl9_ProductServiceCodeDescription()  {
    ST ret = null;
    try {
        Type t = this.getField(9, 0);
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
   * Returns Product/Service Effective Date (PSL-10).
   */
  public DTM getProductServiceEffectiveDate()  {
    DTM ret = null;
    try {
        Type t = this.getField(10, 0);
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
   * Returns Product/Service Effective Date (PSL-10).
   */
  public DTM getPsl10_ProductServiceEffectiveDate()  {
    DTM ret = null;
    try {
        Type t = this.getField(10, 0);
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
   * Returns Product/Service Expiration Date (PSL-11).
   */
  public DTM getProductServiceExpirationDate()  {
    DTM ret = null;
    try {
        Type t = this.getField(11, 0);
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
   * Returns Product/Service Expiration Date (PSL-11).
   */
  public DTM getPsl11_ProductServiceExpirationDate()  {
    DTM ret = null;
    try {
        Type t = this.getField(11, 0);
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
   * Returns Product/Service Quantity (PSL-12).
   */
  public CQ getProductServiceQuantity()  {
    CQ ret = null;
    try {
        Type t = this.getField(12, 0);
        ret = (CQ)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns Product/Service Quantity (PSL-12).
   */
  public CQ getPsl12_ProductServiceQuantity()  {
    CQ ret = null;
    try {
        Type t = this.getField(12, 0);
        ret = (CQ)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns Product/Service Unit Cost (PSL-13).
   */
  public CP getProductServiceUnitCost()  {
    CP ret = null;
    try {
        Type t = this.getField(13, 0);
        ret = (CP)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns Product/Service Unit Cost (PSL-13).
   */
  public CP getPsl13_ProductServiceUnitCost()  {
    CP ret = null;
    try {
        Type t = this.getField(13, 0);
        ret = (CP)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns Number of Items per Unit (PSL-14).
   */
  public NM getNumberOfItemsPerUnit()  {
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
   * Returns Number of Items per Unit (PSL-14).
   */
  public NM getPsl14_NumberOfItemsPerUnit()  {
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
   * Returns Product/Service Gross Amount (PSL-15).
   */
  public CP getProductServiceGrossAmount()  {
    CP ret = null;
    try {
        Type t = this.getField(15, 0);
        ret = (CP)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns Product/Service Gross Amount (PSL-15).
   */
  public CP getPsl15_ProductServiceGrossAmount()  {
    CP ret = null;
    try {
        Type t = this.getField(15, 0);
        ret = (CP)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns Product/Service Billed Amount (PSL-16).
   */
  public CP getProductServiceBilledAmount()  {
    CP ret = null;
    try {
        Type t = this.getField(16, 0);
        ret = (CP)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns Product/Service Billed Amount (PSL-16).
   */
  public CP getPsl16_ProductServiceBilledAmount()  {
    CP ret = null;
    try {
        Type t = this.getField(16, 0);
        ret = (CP)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns Product/Service Clarification Code Type (PSL-17).
   */
  public IS getProductServiceClarificationCodeType()  {
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
   * Returns Product/Service Clarification Code Type (PSL-17).
   */
  public IS getPsl17_ProductServiceClarificationCodeType()  {
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
   * Returns Product/Service Clarification Code Value (PSL-18).
   */
  public ST getProductServiceClarificationCodeValue()  {
    ST ret = null;
    try {
        Type t = this.getField(18, 0);
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
   * Returns Product/Service Clarification Code Value (PSL-18).
   */
  public ST getPsl18_ProductServiceClarificationCodeValue()  {
    ST ret = null;
    try {
        Type t = this.getField(18, 0);
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
   * Returns Health Document Reference Identifier (PSL-19).
   */
  public EI getHealthDocumentReferenceIdentifier()  {
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
   * Returns Health Document Reference Identifier (PSL-19).
   */
  public EI getPsl19_HealthDocumentReferenceIdentifier()  {
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
   * Returns Processing Consideration Code (PSL-20).
   */
  public IS getProcessingConsiderationCode()  {
    IS ret = null;
    try {
        Type t = this.getField(20, 0);
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
   * Returns Processing Consideration Code (PSL-20).
   */
  public IS getPsl20_ProcessingConsiderationCode()  {
    IS ret = null;
    try {
        Type t = this.getField(20, 0);
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
   * Returns Restricted Disclosure Indicator (PSL-21).
   */
  public ID getRestrictedDisclosureIndicator()  {
    ID ret = null;
    try {
        Type t = this.getField(21, 0);
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
   * Returns Restricted Disclosure Indicator (PSL-21).
   */
  public ID getPsl21_RestrictedDisclosureIndicator()  {
    ID ret = null;
    try {
        Type t = this.getField(21, 0);
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
   * Returns Related Product/Service Code Indicator (PSL-22).
   */
  public CWE getRelatedProductServiceCodeIndicator()  {
    CWE ret = null;
    try {
        Type t = this.getField(22, 0);
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
   * Returns Related Product/Service Code Indicator (PSL-22).
   */
  public CWE getPsl22_RelatedProductServiceCodeIndicator()  {
    CWE ret = null;
    try {
        Type t = this.getField(22, 0);
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
   * Returns Product/Service Amount for Physician (PSL-23).
   */
  public CP getProductServiceAmountForPhysician()  {
    CP ret = null;
    try {
        Type t = this.getField(23, 0);
        ret = (CP)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns Product/Service Amount for Physician (PSL-23).
   */
  public CP getPsl23_ProductServiceAmountForPhysician()  {
    CP ret = null;
    try {
        Type t = this.getField(23, 0);
        ret = (CP)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns Product/Service Cost Factor (PSL-24).
   */
  public NM getProductServiceCostFactor()  {
    NM ret = null;
    try {
        Type t = this.getField(24, 0);
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
   * Returns Product/Service Cost Factor (PSL-24).
   */
  public NM getPsl24_ProductServiceCostFactor()  {
    NM ret = null;
    try {
        Type t = this.getField(24, 0);
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
   * Returns Cost Center (PSL-25).
   */
  public CX getCostCenter()  {
    CX ret = null;
    try {
        Type t = this.getField(25, 0);
        ret = (CX)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns Cost Center (PSL-25).
   */
  public CX getPsl25_CostCenter()  {
    CX ret = null;
    try {
        Type t = this.getField(25, 0);
        ret = (CX)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns Billing Period (PSL-26).
   */
  public DR getBillingPeriod()  {
    DR ret = null;
    try {
        Type t = this.getField(26, 0);
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
   * Returns Billing Period (PSL-26).
   */
  public DR getPsl26_BillingPeriod()  {
    DR ret = null;
    try {
        Type t = this.getField(26, 0);
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
   * Returns Days without Billing (PSL-27).
   */
  public NM getDaysWithoutBilling()  {
    NM ret = null;
    try {
        Type t = this.getField(27, 0);
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
   * Returns Days without Billing (PSL-27).
   */
  public NM getPsl27_DaysWithoutBilling()  {
    NM ret = null;
    try {
        Type t = this.getField(27, 0);
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
   * Returns Session-No (PSL-28).
   */
  public NM getSessionNo()  {
    NM ret = null;
    try {
        Type t = this.getField(28, 0);
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
   * Returns Session-No (PSL-28).
   */
  public NM getPsl28_SessionNo()  {
    NM ret = null;
    try {
        Type t = this.getField(28, 0);
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
   * Returns Executing Physician ID (PSL-29).
   */
  public XCN getExecutingPhysicianID()  {
    XCN ret = null;
    try {
        Type t = this.getField(29, 0);
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
   * Returns Executing Physician ID (PSL-29).
   */
  public XCN getPsl29_ExecutingPhysicianID()  {
    XCN ret = null;
    try {
        Type t = this.getField(29, 0);
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
   * Returns Responsible Physician ID (PSL-30).
   */
  public XCN getResponsiblePhysicianID()  {
    XCN ret = null;
    try {
        Type t = this.getField(30, 0);
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
   * Returns Responsible Physician ID (PSL-30).
   */
  public XCN getPsl30_ResponsiblePhysicianID()  {
    XCN ret = null;
    try {
        Type t = this.getField(30, 0);
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
   * Returns Role Executing Physician (PSL-31).
   */
  public CWE getRoleExecutingPhysician()  {
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
   * Returns Role Executing Physician (PSL-31).
   */
  public CWE getPsl31_RoleExecutingPhysician()  {
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
   * Returns Medical Role Executing Physician (PSL-32).
   */
  public CWE getMedicalRoleExecutingPhysician()  {
    CWE ret = null;
    try {
        Type t = this.getField(32, 0);
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
   * Returns Medical Role Executing Physician (PSL-32).
   */
  public CWE getPsl32_MedicalRoleExecutingPhysician()  {
    CWE ret = null;
    try {
        Type t = this.getField(32, 0);
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
   * Returns Side of body (PSL-33).
   */
  public CWE getSideOfBody()  {
    CWE ret = null;
    try {
        Type t = this.getField(33, 0);
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
   * Returns Side of body (PSL-33).
   */
  public CWE getPsl33_SideOfBody()  {
    CWE ret = null;
    try {
        Type t = this.getField(33, 0);
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
   * Returns Number of TP's PP (PSL-34).
   */
  public NM getNumberOfTPSPP()  {
    NM ret = null;
    try {
        Type t = this.getField(34, 0);
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
   * Returns Number of TP's PP (PSL-34).
   */
  public NM getPsl34_NumberOfTPSPP()  {
    NM ret = null;
    try {
        Type t = this.getField(34, 0);
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
   * Returns TP-Value PP (PSL-35).
   */
  public CP getTPValuePP()  {
    CP ret = null;
    try {
        Type t = this.getField(35, 0);
        ret = (CP)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns TP-Value PP (PSL-35).
   */
  public CP getPsl35_TPValuePP()  {
    CP ret = null;
    try {
        Type t = this.getField(35, 0);
        ret = (CP)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns Internal Scaling Factor PP (PSL-36).
   */
  public NM getInternalScalingFactorPP()  {
    NM ret = null;
    try {
        Type t = this.getField(36, 0);
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
   * Returns Internal Scaling Factor PP (PSL-36).
   */
  public NM getPsl36_InternalScalingFactorPP()  {
    NM ret = null;
    try {
        Type t = this.getField(36, 0);
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
   * Returns External Scaling Factor PP (PSL-37).
   */
  public NM getExternalScalingFactorPP()  {
    NM ret = null;
    try {
        Type t = this.getField(37, 0);
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
   * Returns External Scaling Factor PP (PSL-37).
   */
  public NM getPsl37_ExternalScalingFactorPP()  {
    NM ret = null;
    try {
        Type t = this.getField(37, 0);
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
   * Returns Amount PP (PSL-38).
   */
  public CP getAmountPP()  {
    CP ret = null;
    try {
        Type t = this.getField(38, 0);
        ret = (CP)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns Amount PP (PSL-38).
   */
  public CP getPsl38_AmountPP()  {
    CP ret = null;
    try {
        Type t = this.getField(38, 0);
        ret = (CP)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns Number of TP's Technical Part (PSL-39).
   */
  public NM getNumberOfTPSTechnicalPart()  {
    NM ret = null;
    try {
        Type t = this.getField(39, 0);
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
   * Returns Number of TP's Technical Part (PSL-39).
   */
  public NM getPsl39_NumberOfTPSTechnicalPart()  {
    NM ret = null;
    try {
        Type t = this.getField(39, 0);
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
   * Returns TP-Value Technical Part (PSL-40).
   */
  public CP getTPValueTechnicalPart()  {
    CP ret = null;
    try {
        Type t = this.getField(40, 0);
        ret = (CP)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns TP-Value Technical Part (PSL-40).
   */
  public CP getPsl40_TPValueTechnicalPart()  {
    CP ret = null;
    try {
        Type t = this.getField(40, 0);
        ret = (CP)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns Internal Scaling Factor Technical Part (PSL-41).
   */
  public NM getInternalScalingFactorTechnicalPart()  {
    NM ret = null;
    try {
        Type t = this.getField(41, 0);
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
   * Returns Internal Scaling Factor Technical Part (PSL-41).
   */
  public NM getPsl41_InternalScalingFactorTechnicalPart()  {
    NM ret = null;
    try {
        Type t = this.getField(41, 0);
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
   * Returns External Scaling Factor Technical Part (PSL-42).
   */
  public NM getExternalScalingFactorTechnicalPart()  {
    NM ret = null;
    try {
        Type t = this.getField(42, 0);
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
   * Returns External Scaling Factor Technical Part (PSL-42).
   */
  public NM getPsl42_ExternalScalingFactorTechnicalPart()  {
    NM ret = null;
    try {
        Type t = this.getField(42, 0);
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
   * Returns Amount Technical Part (PSL-43).
   */
  public CP getAmountTechnicalPart()  {
    CP ret = null;
    try {
        Type t = this.getField(43, 0);
        ret = (CP)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns Amount Technical Part (PSL-43).
   */
  public CP getPsl43_AmountTechnicalPart()  {
    CP ret = null;
    try {
        Type t = this.getField(43, 0);
        ret = (CP)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns Total Amount Professional Part + Technical Part (PSL-44).
   */
  public CP getTotalAmountProfessionalPartTechnicalPart()  {
    CP ret = null;
    try {
        Type t = this.getField(44, 0);
        ret = (CP)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns Total Amount Professional Part + Technical Part (PSL-44).
   */
  public CP getPsl44_TotalAmountProfessionalPartTechnicalPart()  {
    CP ret = null;
    try {
        Type t = this.getField(44, 0);
        ret = (CP)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns VAT-Rate (PSL-45).
   */
  public NM getVATRate()  {
    NM ret = null;
    try {
        Type t = this.getField(45, 0);
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
   * Returns VAT-Rate (PSL-45).
   */
  public NM getPsl45_VATRate()  {
    NM ret = null;
    try {
        Type t = this.getField(45, 0);
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
   * Returns Main-Service (PSL-46).
   */
  public ID getMainService()  {
    ID ret = null;
    try {
        Type t = this.getField(46, 0);
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
   * Returns Main-Service (PSL-46).
   */
  public ID getPsl46_MainService()  {
    ID ret = null;
    try {
        Type t = this.getField(46, 0);
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
   * Returns Validation (PSL-47).
   */
  public ID getValidation()  {
    ID ret = null;
    try {
        Type t = this.getField(47, 0);
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
   * Returns Validation (PSL-47).
   */
  public ID getPsl47_Validation()  {
    ID ret = null;
    try {
        Type t = this.getField(47, 0);
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
   * Returns Comment (PSL-48).
   */
  public ST getComment()  {
    ST ret = null;
    try {
        Type t = this.getField(48, 0);
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
   * Returns Comment (PSL-48).
   */
  public ST getPsl48_Comment()  {
    ST ret = null;
    try {
        Type t = this.getField(48, 0);
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

   protected Type createNewTypeWithoutReflection(int field) {
      switch (field) {
         case 0: return new ca.uhn.hl7v2.model.v26.datatype.EI(getMessage());
         case 1: return new ca.uhn.hl7v2.model.v26.datatype.EI(getMessage());
         case 2: return new ca.uhn.hl7v2.model.v26.datatype.SI(getMessage());
         case 3: return new ca.uhn.hl7v2.model.v26.datatype.EI(getMessage());
         case 4: return new ca.uhn.hl7v2.model.v26.datatype.EI(getMessage());
         case 5: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 6: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 7: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 8: return new ca.uhn.hl7v2.model.v26.datatype.ST(getMessage());
         case 9: return new ca.uhn.hl7v2.model.v26.datatype.DTM(getMessage());
         case 10: return new ca.uhn.hl7v2.model.v26.datatype.DTM(getMessage());
         case 11: return new ca.uhn.hl7v2.model.v26.datatype.CQ(getMessage());
         case 12: return new ca.uhn.hl7v2.model.v26.datatype.CP(getMessage());
         case 13: return new ca.uhn.hl7v2.model.v26.datatype.NM(getMessage());
         case 14: return new ca.uhn.hl7v2.model.v26.datatype.CP(getMessage());
         case 15: return new ca.uhn.hl7v2.model.v26.datatype.CP(getMessage());
         case 16: return new ca.uhn.hl7v2.model.v26.datatype.IS(getMessage(), new Integer(561));
         case 17: return new ca.uhn.hl7v2.model.v26.datatype.ST(getMessage());
         case 18: return new ca.uhn.hl7v2.model.v26.datatype.EI(getMessage());
         case 19: return new ca.uhn.hl7v2.model.v26.datatype.IS(getMessage(), new Integer(562));
         case 20: return new ca.uhn.hl7v2.model.v26.datatype.ID(getMessage(), new Integer(532));
         case 21: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 22: return new ca.uhn.hl7v2.model.v26.datatype.CP(getMessage());
         case 23: return new ca.uhn.hl7v2.model.v26.datatype.NM(getMessage());
         case 24: return new ca.uhn.hl7v2.model.v26.datatype.CX(getMessage());
         case 25: return new ca.uhn.hl7v2.model.v26.datatype.DR(getMessage());
         case 26: return new ca.uhn.hl7v2.model.v26.datatype.NM(getMessage());
         case 27: return new ca.uhn.hl7v2.model.v26.datatype.NM(getMessage());
         case 28: return new ca.uhn.hl7v2.model.v26.datatype.XCN(getMessage());
         case 29: return new ca.uhn.hl7v2.model.v26.datatype.XCN(getMessage());
         case 30: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 31: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 32: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 33: return new ca.uhn.hl7v2.model.v26.datatype.NM(getMessage());
         case 34: return new ca.uhn.hl7v2.model.v26.datatype.CP(getMessage());
         case 35: return new ca.uhn.hl7v2.model.v26.datatype.NM(getMessage());
         case 36: return new ca.uhn.hl7v2.model.v26.datatype.NM(getMessage());
         case 37: return new ca.uhn.hl7v2.model.v26.datatype.CP(getMessage());
         case 38: return new ca.uhn.hl7v2.model.v26.datatype.NM(getMessage());
         case 39: return new ca.uhn.hl7v2.model.v26.datatype.CP(getMessage());
         case 40: return new ca.uhn.hl7v2.model.v26.datatype.NM(getMessage());
         case 41: return new ca.uhn.hl7v2.model.v26.datatype.NM(getMessage());
         case 42: return new ca.uhn.hl7v2.model.v26.datatype.CP(getMessage());
         case 43: return new ca.uhn.hl7v2.model.v26.datatype.CP(getMessage());
         case 44: return new ca.uhn.hl7v2.model.v26.datatype.NM(getMessage());
         case 45: return new ca.uhn.hl7v2.model.v26.datatype.ID(getMessage(), new Integer(0));
         case 46: return new ca.uhn.hl7v2.model.v26.datatype.ID(getMessage(), new Integer(136));
         case 47: return new ca.uhn.hl7v2.model.v26.datatype.ST(getMessage());
         default: return null;
      }
   }

}