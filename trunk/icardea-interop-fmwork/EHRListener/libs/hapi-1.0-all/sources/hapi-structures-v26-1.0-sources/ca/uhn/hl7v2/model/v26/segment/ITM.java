package ca.uhn.hl7v2.model.v26.segment;

import ca.uhn.hl7v2.model.*;
import ca.uhn.hl7v2.model.v26.datatype.*;
import ca.uhn.log.HapiLogFactory;
import ca.uhn.hl7v2.parser.ModelClassFactory;
import ca.uhn.hl7v2.HL7Exception;

/**
 * <p>Represents an HL7 ITM message segment. 
 * This segment has the following fields:</p><p>
 * ITM-1: Item Identifier (EI)<br> 
 * ITM-2: Item Description (ST)<br> 
 * ITM-3: Item Status (CWE)<br> 
 * ITM-4: Item Type (CWE)<br> 
 * ITM-5: Item Category (CWE)<br> 
 * ITM-6: Subject to Expiration Indicator (CNE)<br> 
 * ITM-7: Manufacturer Identifier (EI)<br> 
 * ITM-8: Manufacturer Name (ST)<br> 
 * ITM-9: Manufacturer Catalog Number (ST)<br> 
 * ITM-10: Manufacturer Labeler Identification Code (CWE)<br> 
 * ITM-11: Patient Chargeable Indicator (CNE)<br> 
 * ITM-12: Transaction Code (CWE)<br> 
 * ITM-13: Transaction amount - unit (CP)<br> 
 * ITM-14: Stocked Item Indicator (CNE)<br> 
 * ITM-15: Supply Risk Codes (CWE)<br> 
 * ITM-16: Approving Regulatory Agency (XON)<br> 
 * ITM-17: Latex Indicator (CNE)<br> 
 * ITM-18: Ruling Act (CWE)<br> 
 * ITM-19: Item Natural Account Code (IS)<br> 
 * ITM-20: Approved To Buy Quantity (NM)<br> 
 * ITM-21: Approved To Buy Price (MO)<br> 
 * ITM-22: Taxable Item Indicator (CNE)<br> 
 * ITM-23: Freight Charge Indicator (CNE)<br> 
 * ITM-24: Item Set Indicator (CNE)<br> 
 * ITM-25: Item Set Identifier (EI)<br> 
 * ITM-26: Track Department Usage Indicator (CNE)<br> 
 * ITM-27: Procedure Code (CNE)<br> 
 * ITM-28: Procedure Code Modifier (CNE)<br> 
 * ITM-29: Special Handling Code (CWE)<br> 
 * </p><p>The get...() methods return data from individual fields.  These methods 
 * do not throw exceptions and may therefore have to handle exceptions internally.  
 * If an exception is handled internally, it is logged and null is returned.  
 * This is not expected to happen - if it does happen this indicates not so much 
 * an exceptional circumstance as a bug in the code for this class.</p>    
 */
public class ITM extends AbstractSegment  {

  /**
   * Creates a ITM (Material Item) segment object that belongs to the given 
   * message.  
   */
  public ITM(Group parent, ModelClassFactory factory) {
    super(parent, factory);
    Message message = getMessage();
    try {
       this.add(EI.class, true, 1, 250, new Object[]{message}, "Item Identifier");
       this.add(ST.class, false, 1, 999, new Object[]{message}, "Item Description");
       this.add(CWE.class, false, 1, 250, new Object[]{message}, "Item Status");
       this.add(CWE.class, false, 1, 250, new Object[]{message}, "Item Type");
       this.add(CWE.class, false, 1, 250, new Object[]{message}, "Item Category");
       this.add(CNE.class, false, 1, 4, new Object[]{message}, "Subject to Expiration Indicator");
       this.add(EI.class, false, 1, 250, new Object[]{message}, "Manufacturer Identifier");
       this.add(ST.class, false, 1, 999, new Object[]{message}, "Manufacturer Name");
       this.add(ST.class, false, 1, 20, new Object[]{message}, "Manufacturer Catalog Number");
       this.add(CWE.class, false, 1, 4, new Object[]{message}, "Manufacturer Labeler Identification Code");
       this.add(CNE.class, false, 1, 4, new Object[]{message}, "Patient Chargeable Indicator");
       this.add(CWE.class, false, 1, 250, new Object[]{message}, "Transaction Code");
       this.add(CP.class, false, 1, 12, new Object[]{message}, "Transaction amount - unit");
       this.add(CNE.class, false, 1, 4, new Object[]{message}, "Stocked Item Indicator");
       this.add(CWE.class, false, 1, 250, new Object[]{message}, "Supply Risk Codes");
       this.add(XON.class, false, 0, 250, new Object[]{message}, "Approving Regulatory Agency");
       this.add(CNE.class, false, 1, 4, new Object[]{message}, "Latex Indicator");
       this.add(CWE.class, false, 0, 250, new Object[]{message}, "Ruling Act");
       this.add(IS.class, false, 1, 30, new Object[]{message, new Integer(320)}, "Item Natural Account Code");
       this.add(NM.class, false, 1, 6, new Object[]{message}, "Approved To Buy Quantity");
       this.add(MO.class, false, 1, 10, new Object[]{message}, "Approved To Buy Price");
       this.add(CNE.class, false, 1, 4, new Object[]{message}, "Taxable Item Indicator");
       this.add(CNE.class, false, 1, 4, new Object[]{message}, "Freight Charge Indicator");
       this.add(CNE.class, false, 1, 4, new Object[]{message}, "Item Set Indicator");
       this.add(EI.class, false, 1, 250, new Object[]{message}, "Item Set Identifier");
       this.add(CNE.class, false, 1, 4, new Object[]{message}, "Track Department Usage Indicator");
       this.add(CNE.class, false, 1, 705, new Object[]{message}, "Procedure Code");
       this.add(CNE.class, false, 0, 705, new Object[]{message}, "Procedure Code Modifier");
       this.add(CWE.class, false, 1, 705, new Object[]{message}, "Special Handling Code");
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Can't instantiate " + this.getClass().getName(), he);
    }
  }

  /**
   * Returns Item Identifier (ITM-1).
   */
  public EI getItemIdentifier()  {
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
   * Returns Item Identifier (ITM-1).
   */
  public EI getItm1_ItemIdentifier()  {
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
   * Returns Item Description (ITM-2).
   */
  public ST getItemDescription()  {
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
   * Returns Item Description (ITM-2).
   */
  public ST getItm2_ItemDescription()  {
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
   * Returns Item Status (ITM-3).
   */
  public CWE getItemStatus()  {
    CWE ret = null;
    try {
        Type t = this.getField(3, 0);
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
   * Returns Item Status (ITM-3).
   */
  public CWE getItm3_ItemStatus()  {
    CWE ret = null;
    try {
        Type t = this.getField(3, 0);
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
   * Returns Item Type (ITM-4).
   */
  public CWE getItemType()  {
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
   * Returns Item Type (ITM-4).
   */
  public CWE getItm4_ItemType()  {
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
   * Returns Item Category (ITM-5).
   */
  public CWE getItemCategory()  {
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
   * Returns Item Category (ITM-5).
   */
  public CWE getItm5_ItemCategory()  {
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
   * Returns Subject to Expiration Indicator (ITM-6).
   */
  public CNE getSubjectToExpirationIndicator()  {
    CNE ret = null;
    try {
        Type t = this.getField(6, 0);
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
   * Returns Subject to Expiration Indicator (ITM-6).
   */
  public CNE getItm6_SubjectToExpirationIndicator()  {
    CNE ret = null;
    try {
        Type t = this.getField(6, 0);
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
   * Returns Manufacturer Identifier (ITM-7).
   */
  public EI getManufacturerIdentifier()  {
    EI ret = null;
    try {
        Type t = this.getField(7, 0);
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
   * Returns Manufacturer Identifier (ITM-7).
   */
  public EI getItm7_ManufacturerIdentifier()  {
    EI ret = null;
    try {
        Type t = this.getField(7, 0);
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
   * Returns Manufacturer Name (ITM-8).
   */
  public ST getManufacturerName()  {
    ST ret = null;
    try {
        Type t = this.getField(8, 0);
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
   * Returns Manufacturer Name (ITM-8).
   */
  public ST getItm8_ManufacturerName()  {
    ST ret = null;
    try {
        Type t = this.getField(8, 0);
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
   * Returns Manufacturer Catalog Number (ITM-9).
   */
  public ST getManufacturerCatalogNumber()  {
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
   * Returns Manufacturer Catalog Number (ITM-9).
   */
  public ST getItm9_ManufacturerCatalogNumber()  {
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
   * Returns Manufacturer Labeler Identification Code (ITM-10).
   */
  public CWE getManufacturerLabelerIdentificationCode()  {
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
   * Returns Manufacturer Labeler Identification Code (ITM-10).
   */
  public CWE getItm10_ManufacturerLabelerIdentificationCode()  {
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
   * Returns Patient Chargeable Indicator (ITM-11).
   */
  public CNE getPatientChargeableIndicator()  {
    CNE ret = null;
    try {
        Type t = this.getField(11, 0);
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
   * Returns Patient Chargeable Indicator (ITM-11).
   */
  public CNE getItm11_PatientChargeableIndicator()  {
    CNE ret = null;
    try {
        Type t = this.getField(11, 0);
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
   * Returns Transaction Code (ITM-12).
   */
  public CWE getTransactionCode()  {
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
   * Returns Transaction Code (ITM-12).
   */
  public CWE getItm12_TransactionCode()  {
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
   * Returns Transaction amount - unit (ITM-13).
   */
  public CP getTransactionAmountUnit()  {
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
   * Returns Transaction amount - unit (ITM-13).
   */
  public CP getItm13_TransactionAmountUnit()  {
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
   * Returns Stocked Item Indicator (ITM-14).
   */
  public CNE getStockedItemIndicator()  {
    CNE ret = null;
    try {
        Type t = this.getField(14, 0);
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
   * Returns Stocked Item Indicator (ITM-14).
   */
  public CNE getItm14_StockedItemIndicator()  {
    CNE ret = null;
    try {
        Type t = this.getField(14, 0);
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
   * Returns Supply Risk Codes (ITM-15).
   */
  public CWE getSupplyRiskCodes()  {
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
   * Returns Supply Risk Codes (ITM-15).
   */
  public CWE getItm15_SupplyRiskCodes()  {
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
   * Returns a single repetition of Approving Regulatory Agency (ITM-16).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XON getApprovingRegulatoryAgency(int rep) throws HL7Exception {
    XON ret = null;
    try {
        Type t = this.getField(16, rep);
        ret = (XON)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Approving Regulatory Agency (ITM-16).
   */
  public XON[] getApprovingRegulatoryAgency() {
     XON[] ret = null;
    try {
        Type[] t = this.getField(16);  
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
   * Returns a count of the number of repetitions of Approving Regulatory Agency (ITM-16).
   */
  public int getApprovingRegulatoryAgencyReps() {
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
   * Inserts a repetition of Approving Regulatory Agency (ITM-16) at a given index and returns it.
   * @param index The index
   */
  public XON insertApprovingRegulatoryAgency(int index) throws HL7Exception {
     return (XON) super.insertRepetition(16, index);
  }

  /**
   * Removes a repetition of Approving Regulatory Agency (ITM-16) at a given index and returns it.
   * @param index The index
   */
  public XON removeApprovingRegulatoryAgency(int index) throws HL7Exception {
     return (XON) super.removeRepetition(16, index);
  }

  /**
   * Returns a single repetition of Approving Regulatory Agency (ITM-16).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XON getItm16_ApprovingRegulatoryAgency(int rep) throws HL7Exception {
    XON ret = null;
    try {
        Type t = this.getField(16, rep);
        ret = (XON)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Approving Regulatory Agency (ITM-16).
   */
  public XON[] getItm16_ApprovingRegulatoryAgency() {
     XON[] ret = null;
    try {
        Type[] t = this.getField(16);  
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
   * Returns a count of the number of repetitions of Approving Regulatory Agency (ITM-16).
   */
  public int getItm16_ApprovingRegulatoryAgencyReps() {
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
   * Inserts a repetition of Approving Regulatory Agency (ITM-16) at a given index and returns it.
   * @param index The index
   */
  public XON insertItm16_ApprovingRegulatoryAgency(int index) throws HL7Exception {
     return (XON) super.insertRepetition(16, index);
  }

  /**
   * Removes a repetition of Approving Regulatory Agency (ITM-16) at a given index and returns it.
   * @param index The index
   */
  public XON removeItm16_ApprovingRegulatoryAgency(int index) throws HL7Exception {
     return (XON) super.removeRepetition(16, index);
  }

  /**
   * Returns Latex Indicator (ITM-17).
   */
  public CNE getLatexIndicator()  {
    CNE ret = null;
    try {
        Type t = this.getField(17, 0);
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
   * Returns Latex Indicator (ITM-17).
   */
  public CNE getItm17_LatexIndicator()  {
    CNE ret = null;
    try {
        Type t = this.getField(17, 0);
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
   * Returns a single repetition of Ruling Act (ITM-18).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getRulingAct(int rep) throws HL7Exception {
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
   * Returns all repetitions of Ruling Act (ITM-18).
   */
  public CWE[] getRulingAct() {
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
   * Returns a count of the number of repetitions of Ruling Act (ITM-18).
   */
  public int getRulingActReps() {
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
   * Inserts a repetition of Ruling Act (ITM-18) at a given index and returns it.
   * @param index The index
   */
  public CWE insertRulingAct(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(18, index);
  }

  /**
   * Removes a repetition of Ruling Act (ITM-18) at a given index and returns it.
   * @param index The index
   */
  public CWE removeRulingAct(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(18, index);
  }

  /**
   * Returns a single repetition of Ruling Act (ITM-18).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getItm18_RulingAct(int rep) throws HL7Exception {
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
   * Returns all repetitions of Ruling Act (ITM-18).
   */
  public CWE[] getItm18_RulingAct() {
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
   * Returns a count of the number of repetitions of Ruling Act (ITM-18).
   */
  public int getItm18_RulingActReps() {
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
   * Inserts a repetition of Ruling Act (ITM-18) at a given index and returns it.
   * @param index The index
   */
  public CWE insertItm18_RulingAct(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(18, index);
  }

  /**
   * Removes a repetition of Ruling Act (ITM-18) at a given index and returns it.
   * @param index The index
   */
  public CWE removeItm18_RulingAct(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(18, index);
  }

  /**
   * Returns Item Natural Account Code (ITM-19).
   */
  public IS getItemNaturalAccountCode()  {
    IS ret = null;
    try {
        Type t = this.getField(19, 0);
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
   * Returns Item Natural Account Code (ITM-19).
   */
  public IS getItm19_ItemNaturalAccountCode()  {
    IS ret = null;
    try {
        Type t = this.getField(19, 0);
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
   * Returns Approved To Buy Quantity (ITM-20).
   */
  public NM getApprovedToBuyQuantity()  {
    NM ret = null;
    try {
        Type t = this.getField(20, 0);
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
   * Returns Approved To Buy Quantity (ITM-20).
   */
  public NM getItm20_ApprovedToBuyQuantity()  {
    NM ret = null;
    try {
        Type t = this.getField(20, 0);
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
   * Returns Approved To Buy Price (ITM-21).
   */
  public MO getApprovedToBuyPrice()  {
    MO ret = null;
    try {
        Type t = this.getField(21, 0);
        ret = (MO)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns Approved To Buy Price (ITM-21).
   */
  public MO getItm21_ApprovedToBuyPrice()  {
    MO ret = null;
    try {
        Type t = this.getField(21, 0);
        ret = (MO)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns Taxable Item Indicator (ITM-22).
   */
  public CNE getTaxableItemIndicator()  {
    CNE ret = null;
    try {
        Type t = this.getField(22, 0);
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
   * Returns Taxable Item Indicator (ITM-22).
   */
  public CNE getItm22_TaxableItemIndicator()  {
    CNE ret = null;
    try {
        Type t = this.getField(22, 0);
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
   * Returns Freight Charge Indicator (ITM-23).
   */
  public CNE getFreightChargeIndicator()  {
    CNE ret = null;
    try {
        Type t = this.getField(23, 0);
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
   * Returns Freight Charge Indicator (ITM-23).
   */
  public CNE getItm23_FreightChargeIndicator()  {
    CNE ret = null;
    try {
        Type t = this.getField(23, 0);
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
   * Returns Item Set Indicator (ITM-24).
   */
  public CNE getItemSetIndicator()  {
    CNE ret = null;
    try {
        Type t = this.getField(24, 0);
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
   * Returns Item Set Indicator (ITM-24).
   */
  public CNE getItm24_ItemSetIndicator()  {
    CNE ret = null;
    try {
        Type t = this.getField(24, 0);
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
   * Returns Item Set Identifier (ITM-25).
   */
  public EI getItemSetIdentifier()  {
    EI ret = null;
    try {
        Type t = this.getField(25, 0);
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
   * Returns Item Set Identifier (ITM-25).
   */
  public EI getItm25_ItemSetIdentifier()  {
    EI ret = null;
    try {
        Type t = this.getField(25, 0);
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
   * Returns Track Department Usage Indicator (ITM-26).
   */
  public CNE getTrackDepartmentUsageIndicator()  {
    CNE ret = null;
    try {
        Type t = this.getField(26, 0);
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
   * Returns Track Department Usage Indicator (ITM-26).
   */
  public CNE getItm26_TrackDepartmentUsageIndicator()  {
    CNE ret = null;
    try {
        Type t = this.getField(26, 0);
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
   * Returns Procedure Code (ITM-27).
   */
  public CNE getProcedureCode()  {
    CNE ret = null;
    try {
        Type t = this.getField(27, 0);
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
   * Returns Procedure Code (ITM-27).
   */
  public CNE getItm27_ProcedureCode()  {
    CNE ret = null;
    try {
        Type t = this.getField(27, 0);
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
   * Returns a single repetition of Procedure Code Modifier (ITM-28).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CNE getProcedureCodeModifier(int rep) throws HL7Exception {
    CNE ret = null;
    try {
        Type t = this.getField(28, rep);
        ret = (CNE)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Procedure Code Modifier (ITM-28).
   */
  public CNE[] getProcedureCodeModifier() {
     CNE[] ret = null;
    try {
        Type[] t = this.getField(28);  
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
   * Returns a count of the number of repetitions of Procedure Code Modifier (ITM-28).
   */
  public int getProcedureCodeModifierReps() {
    try {
        return this.getField(28).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Procedure Code Modifier (ITM-28) at a given index and returns it.
   * @param index The index
   */
  public CNE insertProcedureCodeModifier(int index) throws HL7Exception {
     return (CNE) super.insertRepetition(28, index);
  }

  /**
   * Removes a repetition of Procedure Code Modifier (ITM-28) at a given index and returns it.
   * @param index The index
   */
  public CNE removeProcedureCodeModifier(int index) throws HL7Exception {
     return (CNE) super.removeRepetition(28, index);
  }

  /**
   * Returns a single repetition of Procedure Code Modifier (ITM-28).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CNE getItm28_ProcedureCodeModifier(int rep) throws HL7Exception {
    CNE ret = null;
    try {
        Type t = this.getField(28, rep);
        ret = (CNE)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Procedure Code Modifier (ITM-28).
   */
  public CNE[] getItm28_ProcedureCodeModifier() {
     CNE[] ret = null;
    try {
        Type[] t = this.getField(28);  
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
   * Returns a count of the number of repetitions of Procedure Code Modifier (ITM-28).
   */
  public int getItm28_ProcedureCodeModifierReps() {
    try {
        return this.getField(28).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Procedure Code Modifier (ITM-28) at a given index and returns it.
   * @param index The index
   */
  public CNE insertItm28_ProcedureCodeModifier(int index) throws HL7Exception {
     return (CNE) super.insertRepetition(28, index);
  }

  /**
   * Removes a repetition of Procedure Code Modifier (ITM-28) at a given index and returns it.
   * @param index The index
   */
  public CNE removeItm28_ProcedureCodeModifier(int index) throws HL7Exception {
     return (CNE) super.removeRepetition(28, index);
  }

  /**
   * Returns Special Handling Code (ITM-29).
   */
  public CWE getSpecialHandlingCode()  {
    CWE ret = null;
    try {
        Type t = this.getField(29, 0);
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
   * Returns Special Handling Code (ITM-29).
   */
  public CWE getItm29_SpecialHandlingCode()  {
    CWE ret = null;
    try {
        Type t = this.getField(29, 0);
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
         case 0: return new ca.uhn.hl7v2.model.v26.datatype.EI(getMessage());
         case 1: return new ca.uhn.hl7v2.model.v26.datatype.ST(getMessage());
         case 2: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 3: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 4: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 5: return new ca.uhn.hl7v2.model.v26.datatype.CNE(getMessage());
         case 6: return new ca.uhn.hl7v2.model.v26.datatype.EI(getMessage());
         case 7: return new ca.uhn.hl7v2.model.v26.datatype.ST(getMessage());
         case 8: return new ca.uhn.hl7v2.model.v26.datatype.ST(getMessage());
         case 9: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 10: return new ca.uhn.hl7v2.model.v26.datatype.CNE(getMessage());
         case 11: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 12: return new ca.uhn.hl7v2.model.v26.datatype.CP(getMessage());
         case 13: return new ca.uhn.hl7v2.model.v26.datatype.CNE(getMessage());
         case 14: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 15: return new ca.uhn.hl7v2.model.v26.datatype.XON(getMessage());
         case 16: return new ca.uhn.hl7v2.model.v26.datatype.CNE(getMessage());
         case 17: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 18: return new ca.uhn.hl7v2.model.v26.datatype.IS(getMessage(), new Integer(320));
         case 19: return new ca.uhn.hl7v2.model.v26.datatype.NM(getMessage());
         case 20: return new ca.uhn.hl7v2.model.v26.datatype.MO(getMessage());
         case 21: return new ca.uhn.hl7v2.model.v26.datatype.CNE(getMessage());
         case 22: return new ca.uhn.hl7v2.model.v26.datatype.CNE(getMessage());
         case 23: return new ca.uhn.hl7v2.model.v26.datatype.CNE(getMessage());
         case 24: return new ca.uhn.hl7v2.model.v26.datatype.EI(getMessage());
         case 25: return new ca.uhn.hl7v2.model.v26.datatype.CNE(getMessage());
         case 26: return new ca.uhn.hl7v2.model.v26.datatype.CNE(getMessage());
         case 27: return new ca.uhn.hl7v2.model.v26.datatype.CNE(getMessage());
         case 28: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         default: return null;
      }
   }

}