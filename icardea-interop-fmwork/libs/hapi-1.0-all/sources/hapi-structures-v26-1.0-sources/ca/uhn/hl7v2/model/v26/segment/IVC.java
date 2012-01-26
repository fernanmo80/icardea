package ca.uhn.hl7v2.model.v26.segment;

import ca.uhn.hl7v2.model.*;
import ca.uhn.hl7v2.model.v26.datatype.*;
import ca.uhn.log.HapiLogFactory;
import ca.uhn.hl7v2.parser.ModelClassFactory;
import ca.uhn.hl7v2.HL7Exception;

/**
 * <p>Represents an HL7 IVC message segment. 
 * This segment has the following fields:</p><p>
 * IVC-1: Provider Invoice Number (EI)<br> 
 * IVC-2: Payer Invoice Number (EI)<br> 
 * IVC-3: Contract/Agreement Number (EI)<br> 
 * IVC-4: Invoice Control (IS)<br> 
 * IVC-5: Invoice Reason (IS)<br> 
 * IVC-6: Invoice Type (IS)<br> 
 * IVC-7: Invoice Date/Time (DTM)<br> 
 * IVC-8: Invoice Amount (CP)<br> 
 * IVC-9: Payment Terms (ST)<br> 
 * IVC-10: Provider Organization (XON)<br> 
 * IVC-11: Payer Organization (XON)<br> 
 * IVC-12: Attention (XCN)<br> 
 * IVC-13: Last Invoice Indicator (ID)<br> 
 * IVC-14: Invoice Booking Period (DTM)<br> 
 * IVC-15: Origin (ST)<br> 
 * IVC-16: Invoice Fixed Amount (CP)<br> 
 * IVC-17: Special Costs (CP)<br> 
 * IVC-18: Amount for Doctors Treatment (CP)<br> 
 * IVC-19: Responsible Physician (XCN)<br> 
 * IVC-20: Cost Center (CX)<br> 
 * IVC-21: Invoice Prepaid Amount (CP)<br> 
 * IVC-22: Total Invoice Amount without Prepaid Amount (CP)<br> 
 * IVC-23: Total-Amount of VAT (CP)<br> 
 * IVC-24: VAT-Rates applied (NM)<br> 
 * IVC-25: Benefit Group (IS)<br> 
 * IVC-26: Provider Tax ID (ST)<br> 
 * IVC-27: Payer Tax ID (ST)<br> 
 * IVC-28: Provider Tax status (IS)<br> 
 * IVC-29: Payer Tax status (IS)<br> 
 * IVC-30: Sales Tax ID (ST)<br> 
 * </p><p>The get...() methods return data from individual fields.  These methods 
 * do not throw exceptions and may therefore have to handle exceptions internally.  
 * If an exception is handled internally, it is logged and null is returned.  
 * This is not expected to happen - if it does happen this indicates not so much 
 * an exceptional circumstance as a bug in the code for this class.</p>    
 */
public class IVC extends AbstractSegment  {

  /**
   * Creates a IVC (Invoice Segment) segment object that belongs to the given 
   * message.  
   */
  public IVC(Group parent, ModelClassFactory factory) {
    super(parent, factory);
    Message message = getMessage();
    try {
       this.add(EI.class, true, 1, 74, new Object[]{message}, "Provider Invoice Number");
       this.add(EI.class, false, 1, 74, new Object[]{message}, "Payer Invoice Number");
       this.add(EI.class, false, 1, 74, new Object[]{message}, "Contract/Agreement Number");
       this.add(IS.class, true, 1, 2, new Object[]{message, new Integer(553)}, "Invoice Control");
       this.add(IS.class, true, 1, 4, new Object[]{message, new Integer(554)}, "Invoice Reason");
       this.add(IS.class, true, 1, 2, new Object[]{message, new Integer(555)}, "Invoice Type");
       this.add(DTM.class, true, 1, 24, new Object[]{message}, "Invoice Date/Time");
       this.add(CP.class, true, 1, 254, new Object[]{message}, "Invoice Amount");
       this.add(ST.class, false, 1, 80, new Object[]{message}, "Payment Terms");
       this.add(XON.class, true, 1, 183, new Object[]{message}, "Provider Organization");
       this.add(XON.class, true, 1, 183, new Object[]{message}, "Payer Organization");
       this.add(XCN.class, false, 1, 637, new Object[]{message}, "Attention");
       this.add(ID.class, false, 1, 1, new Object[]{message, new Integer(136)}, "Last Invoice Indicator");
       this.add(DTM.class, false, 1, 24, new Object[]{message}, "Invoice Booking Period");
       this.add(ST.class, false, 1, 250, new Object[]{message}, "Origin");
       this.add(CP.class, false, 1, 254, new Object[]{message}, "Invoice Fixed Amount");
       this.add(CP.class, false, 1, 254, new Object[]{message}, "Special Costs");
       this.add(CP.class, false, 1, 254, new Object[]{message}, "Amount for Doctors Treatment");
       this.add(XCN.class, false, 1, 250, new Object[]{message}, "Responsible Physician");
       this.add(CX.class, false, 1, 250, new Object[]{message}, "Cost Center");
       this.add(CP.class, false, 1, 254, new Object[]{message}, "Invoice Prepaid Amount");
       this.add(CP.class, false, 1, 254, new Object[]{message}, "Total Invoice Amount without Prepaid Amount");
       this.add(CP.class, false, 1, 254, new Object[]{message}, "Total-Amount of VAT");
       this.add(NM.class, false, 0, 1024, new Object[]{message}, "VAT-Rates applied");
       this.add(IS.class, true, 1, 4, new Object[]{message, new Integer(556)}, "Benefit Group");
       this.add(ST.class, false, 1, 20, new Object[]{message}, "Provider Tax ID");
       this.add(ST.class, false, 1, 20, new Object[]{message}, "Payer Tax ID");
       this.add(IS.class, false, 1, 4, new Object[]{message, new Integer(572)}, "Provider Tax status");
       this.add(IS.class, false, 1, 4, new Object[]{message, new Integer(572)}, "Payer Tax status");
       this.add(ST.class, false, 1, 20, new Object[]{message}, "Sales Tax ID");
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Can't instantiate " + this.getClass().getName(), he);
    }
  }

  /**
   * Returns Provider Invoice Number (IVC-1).
   */
  public EI getProviderInvoiceNumber()  {
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
   * Returns Provider Invoice Number (IVC-1).
   */
  public EI getIvc1_ProviderInvoiceNumber()  {
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
   * Returns Payer Invoice Number (IVC-2).
   */
  public EI getPayerInvoiceNumber()  {
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
   * Returns Payer Invoice Number (IVC-2).
   */
  public EI getIvc2_PayerInvoiceNumber()  {
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
   * Returns Contract/Agreement Number (IVC-3).
   */
  public EI getContractAgreementNumber()  {
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
   * Returns Contract/Agreement Number (IVC-3).
   */
  public EI getIvc3_ContractAgreementNumber()  {
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
   * Returns Invoice Control (IVC-4).
   */
  public IS getInvoiceControl()  {
    IS ret = null;
    try {
        Type t = this.getField(4, 0);
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
   * Returns Invoice Control (IVC-4).
   */
  public IS getIvc4_InvoiceControl()  {
    IS ret = null;
    try {
        Type t = this.getField(4, 0);
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
   * Returns Invoice Reason (IVC-5).
   */
  public IS getInvoiceReason()  {
    IS ret = null;
    try {
        Type t = this.getField(5, 0);
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
   * Returns Invoice Reason (IVC-5).
   */
  public IS getIvc5_InvoiceReason()  {
    IS ret = null;
    try {
        Type t = this.getField(5, 0);
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
   * Returns Invoice Type (IVC-6).
   */
  public IS getInvoiceType()  {
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
   * Returns Invoice Type (IVC-6).
   */
  public IS getIvc6_InvoiceType()  {
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
   * Returns Invoice Date/Time (IVC-7).
   */
  public DTM getInvoiceDateTime()  {
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
   * Returns Invoice Date/Time (IVC-7).
   */
  public DTM getIvc7_InvoiceDateTime()  {
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
   * Returns Invoice Amount (IVC-8).
   */
  public CP getInvoiceAmount()  {
    CP ret = null;
    try {
        Type t = this.getField(8, 0);
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
   * Returns Invoice Amount (IVC-8).
   */
  public CP getIvc8_InvoiceAmount()  {
    CP ret = null;
    try {
        Type t = this.getField(8, 0);
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
   * Returns Payment Terms (IVC-9).
   */
  public ST getPaymentTerms()  {
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
   * Returns Payment Terms (IVC-9).
   */
  public ST getIvc9_PaymentTerms()  {
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
   * Returns Provider Organization (IVC-10).
   */
  public XON getProviderOrganization()  {
    XON ret = null;
    try {
        Type t = this.getField(10, 0);
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
   * Returns Provider Organization (IVC-10).
   */
  public XON getIvc10_ProviderOrganization()  {
    XON ret = null;
    try {
        Type t = this.getField(10, 0);
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
   * Returns Payer Organization (IVC-11).
   */
  public XON getPayerOrganization()  {
    XON ret = null;
    try {
        Type t = this.getField(11, 0);
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
   * Returns Payer Organization (IVC-11).
   */
  public XON getIvc11_PayerOrganization()  {
    XON ret = null;
    try {
        Type t = this.getField(11, 0);
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
   * Returns Attention (IVC-12).
   */
  public XCN getAttention()  {
    XCN ret = null;
    try {
        Type t = this.getField(12, 0);
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
   * Returns Attention (IVC-12).
   */
  public XCN getIvc12_Attention()  {
    XCN ret = null;
    try {
        Type t = this.getField(12, 0);
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
   * Returns Last Invoice Indicator (IVC-13).
   */
  public ID getLastInvoiceIndicator()  {
    ID ret = null;
    try {
        Type t = this.getField(13, 0);
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
   * Returns Last Invoice Indicator (IVC-13).
   */
  public ID getIvc13_LastInvoiceIndicator()  {
    ID ret = null;
    try {
        Type t = this.getField(13, 0);
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
   * Returns Invoice Booking Period (IVC-14).
   */
  public DTM getInvoiceBookingPeriod()  {
    DTM ret = null;
    try {
        Type t = this.getField(14, 0);
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
   * Returns Invoice Booking Period (IVC-14).
   */
  public DTM getIvc14_InvoiceBookingPeriod()  {
    DTM ret = null;
    try {
        Type t = this.getField(14, 0);
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
   * Returns Origin (IVC-15).
   */
  public ST getOrigin()  {
    ST ret = null;
    try {
        Type t = this.getField(15, 0);
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
   * Returns Origin (IVC-15).
   */
  public ST getIvc15_Origin()  {
    ST ret = null;
    try {
        Type t = this.getField(15, 0);
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
   * Returns Invoice Fixed Amount (IVC-16).
   */
  public CP getInvoiceFixedAmount()  {
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
   * Returns Invoice Fixed Amount (IVC-16).
   */
  public CP getIvc16_InvoiceFixedAmount()  {
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
   * Returns Special Costs (IVC-17).
   */
  public CP getSpecialCosts()  {
    CP ret = null;
    try {
        Type t = this.getField(17, 0);
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
   * Returns Special Costs (IVC-17).
   */
  public CP getIvc17_SpecialCosts()  {
    CP ret = null;
    try {
        Type t = this.getField(17, 0);
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
   * Returns Amount for Doctors Treatment (IVC-18).
   */
  public CP getAmountForDoctorsTreatment()  {
    CP ret = null;
    try {
        Type t = this.getField(18, 0);
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
   * Returns Amount for Doctors Treatment (IVC-18).
   */
  public CP getIvc18_AmountForDoctorsTreatment()  {
    CP ret = null;
    try {
        Type t = this.getField(18, 0);
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
   * Returns Responsible Physician (IVC-19).
   */
  public XCN getResponsiblePhysician()  {
    XCN ret = null;
    try {
        Type t = this.getField(19, 0);
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
   * Returns Responsible Physician (IVC-19).
   */
  public XCN getIvc19_ResponsiblePhysician()  {
    XCN ret = null;
    try {
        Type t = this.getField(19, 0);
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
   * Returns Cost Center (IVC-20).
   */
  public CX getCostCenter()  {
    CX ret = null;
    try {
        Type t = this.getField(20, 0);
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
   * Returns Cost Center (IVC-20).
   */
  public CX getIvc20_CostCenter()  {
    CX ret = null;
    try {
        Type t = this.getField(20, 0);
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
   * Returns Invoice Prepaid Amount (IVC-21).
   */
  public CP getInvoicePrepaidAmount()  {
    CP ret = null;
    try {
        Type t = this.getField(21, 0);
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
   * Returns Invoice Prepaid Amount (IVC-21).
   */
  public CP getIvc21_InvoicePrepaidAmount()  {
    CP ret = null;
    try {
        Type t = this.getField(21, 0);
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
   * Returns Total Invoice Amount without Prepaid Amount (IVC-22).
   */
  public CP getTotalInvoiceAmountWithoutPrepaidAmount()  {
    CP ret = null;
    try {
        Type t = this.getField(22, 0);
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
   * Returns Total Invoice Amount without Prepaid Amount (IVC-22).
   */
  public CP getIvc22_TotalInvoiceAmountWithoutPrepaidAmount()  {
    CP ret = null;
    try {
        Type t = this.getField(22, 0);
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
   * Returns Total-Amount of VAT (IVC-23).
   */
  public CP getTotalAmountOfVAT()  {
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
   * Returns Total-Amount of VAT (IVC-23).
   */
  public CP getIvc23_TotalAmountOfVAT()  {
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
   * Returns a single repetition of VAT-Rates applied (IVC-24).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public NM getVATRatesApplied(int rep) throws HL7Exception {
    NM ret = null;
    try {
        Type t = this.getField(24, rep);
        ret = (NM)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of VAT-Rates applied (IVC-24).
   */
  public NM[] getVATRatesApplied() {
     NM[] ret = null;
    try {
        Type[] t = this.getField(24);  
        ret = new NM[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (NM)t[i];
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
   * Returns a count of the number of repetitions of VAT-Rates applied (IVC-24).
   */
  public int getVATRatesAppliedReps() {
    try {
        return this.getField(24).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of VAT-Rates applied (IVC-24) at a given index and returns it.
   * @param index The index
   */
  public NM insertVATRatesApplied(int index) throws HL7Exception {
     return (NM) super.insertRepetition(24, index);
  }

  /**
   * Removes a repetition of VAT-Rates applied (IVC-24) at a given index and returns it.
   * @param index The index
   */
  public NM removeVATRatesApplied(int index) throws HL7Exception {
     return (NM) super.removeRepetition(24, index);
  }

  /**
   * Returns a single repetition of VAT-Rates applied (IVC-24).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public NM getIvc24_VATRatesApplied(int rep) throws HL7Exception {
    NM ret = null;
    try {
        Type t = this.getField(24, rep);
        ret = (NM)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of VAT-Rates applied (IVC-24).
   */
  public NM[] getIvc24_VATRatesApplied() {
     NM[] ret = null;
    try {
        Type[] t = this.getField(24);  
        ret = new NM[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (NM)t[i];
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
   * Returns a count of the number of repetitions of VAT-Rates applied (IVC-24).
   */
  public int getIvc24_VATRatesAppliedReps() {
    try {
        return this.getField(24).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of VAT-Rates applied (IVC-24) at a given index and returns it.
   * @param index The index
   */
  public NM insertIvc24_VATRatesApplied(int index) throws HL7Exception {
     return (NM) super.insertRepetition(24, index);
  }

  /**
   * Removes a repetition of VAT-Rates applied (IVC-24) at a given index and returns it.
   * @param index The index
   */
  public NM removeIvc24_VATRatesApplied(int index) throws HL7Exception {
     return (NM) super.removeRepetition(24, index);
  }

  /**
   * Returns Benefit Group (IVC-25).
   */
  public IS getBenefitGroup()  {
    IS ret = null;
    try {
        Type t = this.getField(25, 0);
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
   * Returns Benefit Group (IVC-25).
   */
  public IS getIvc25_BenefitGroup()  {
    IS ret = null;
    try {
        Type t = this.getField(25, 0);
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
   * Returns Provider Tax ID (IVC-26).
   */
  public ST getProviderTaxID()  {
    ST ret = null;
    try {
        Type t = this.getField(26, 0);
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
   * Returns Provider Tax ID (IVC-26).
   */
  public ST getIvc26_ProviderTaxID()  {
    ST ret = null;
    try {
        Type t = this.getField(26, 0);
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
   * Returns Payer Tax ID (IVC-27).
   */
  public ST getPayerTaxID()  {
    ST ret = null;
    try {
        Type t = this.getField(27, 0);
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
   * Returns Payer Tax ID (IVC-27).
   */
  public ST getIvc27_PayerTaxID()  {
    ST ret = null;
    try {
        Type t = this.getField(27, 0);
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
   * Returns Provider Tax status (IVC-28).
   */
  public IS getProviderTaxStatus()  {
    IS ret = null;
    try {
        Type t = this.getField(28, 0);
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
   * Returns Provider Tax status (IVC-28).
   */
  public IS getIvc28_ProviderTaxStatus()  {
    IS ret = null;
    try {
        Type t = this.getField(28, 0);
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
   * Returns Payer Tax status (IVC-29).
   */
  public IS getPayerTaxStatus()  {
    IS ret = null;
    try {
        Type t = this.getField(29, 0);
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
   * Returns Payer Tax status (IVC-29).
   */
  public IS getIvc29_PayerTaxStatus()  {
    IS ret = null;
    try {
        Type t = this.getField(29, 0);
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
   * Returns Sales Tax ID (IVC-30).
   */
  public ST getSalesTaxID()  {
    ST ret = null;
    try {
        Type t = this.getField(30, 0);
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
   * Returns Sales Tax ID (IVC-30).
   */
  public ST getIvc30_SalesTaxID()  {
    ST ret = null;
    try {
        Type t = this.getField(30, 0);
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
         case 2: return new ca.uhn.hl7v2.model.v26.datatype.EI(getMessage());
         case 3: return new ca.uhn.hl7v2.model.v26.datatype.IS(getMessage(), new Integer(553));
         case 4: return new ca.uhn.hl7v2.model.v26.datatype.IS(getMessage(), new Integer(554));
         case 5: return new ca.uhn.hl7v2.model.v26.datatype.IS(getMessage(), new Integer(555));
         case 6: return new ca.uhn.hl7v2.model.v26.datatype.DTM(getMessage());
         case 7: return new ca.uhn.hl7v2.model.v26.datatype.CP(getMessage());
         case 8: return new ca.uhn.hl7v2.model.v26.datatype.ST(getMessage());
         case 9: return new ca.uhn.hl7v2.model.v26.datatype.XON(getMessage());
         case 10: return new ca.uhn.hl7v2.model.v26.datatype.XON(getMessage());
         case 11: return new ca.uhn.hl7v2.model.v26.datatype.XCN(getMessage());
         case 12: return new ca.uhn.hl7v2.model.v26.datatype.ID(getMessage(), new Integer(136));
         case 13: return new ca.uhn.hl7v2.model.v26.datatype.DTM(getMessage());
         case 14: return new ca.uhn.hl7v2.model.v26.datatype.ST(getMessage());
         case 15: return new ca.uhn.hl7v2.model.v26.datatype.CP(getMessage());
         case 16: return new ca.uhn.hl7v2.model.v26.datatype.CP(getMessage());
         case 17: return new ca.uhn.hl7v2.model.v26.datatype.CP(getMessage());
         case 18: return new ca.uhn.hl7v2.model.v26.datatype.XCN(getMessage());
         case 19: return new ca.uhn.hl7v2.model.v26.datatype.CX(getMessage());
         case 20: return new ca.uhn.hl7v2.model.v26.datatype.CP(getMessage());
         case 21: return new ca.uhn.hl7v2.model.v26.datatype.CP(getMessage());
         case 22: return new ca.uhn.hl7v2.model.v26.datatype.CP(getMessage());
         case 23: return new ca.uhn.hl7v2.model.v26.datatype.NM(getMessage());
         case 24: return new ca.uhn.hl7v2.model.v26.datatype.IS(getMessage(), new Integer(556));
         case 25: return new ca.uhn.hl7v2.model.v26.datatype.ST(getMessage());
         case 26: return new ca.uhn.hl7v2.model.v26.datatype.ST(getMessage());
         case 27: return new ca.uhn.hl7v2.model.v26.datatype.IS(getMessage(), new Integer(572));
         case 28: return new ca.uhn.hl7v2.model.v26.datatype.IS(getMessage(), new Integer(572));
         case 29: return new ca.uhn.hl7v2.model.v26.datatype.ST(getMessage());
         default: return null;
      }
   }

}