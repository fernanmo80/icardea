package ca.uhn.hl7v2.model.v26.segment;

import ca.uhn.hl7v2.model.*;
import ca.uhn.hl7v2.model.v26.datatype.*;
import ca.uhn.log.HapiLogFactory;
import ca.uhn.hl7v2.parser.ModelClassFactory;
import ca.uhn.hl7v2.HL7Exception;

/**
 * <p>Represents an HL7 IVT message segment. 
 * This segment has the following fields:</p><p>
 * IVT-1: Set Id - IVT (SI)<br> 
 * IVT-2: Inventory Location Identifier (EI)<br> 
 * IVT-3: Inventory Location Name (ST)<br> 
 * IVT-4: Source Location Identifier (EI)<br> 
 * IVT-5: Source Location Name (ST)<br> 
 * IVT-6: Item Status (CWE)<br> 
 * IVT-7: Bin Location Identifier (EI)<br> 
 * IVT-8: Order Packaging (CWE)<br> 
 * IVT-9: Issue Packaging (CWE)<br> 
 * IVT-10: Default Inventory Asset Account (EI)<br> 
 * IVT-11: Patient Chargeable Indicator (CNE)<br> 
 * IVT-12: Transaction Code (CWE)<br> 
 * IVT-13: Transaction amount - unit (CP)<br> 
 * IVT-14: Item Importance Code (CWE)<br> 
 * IVT-15: Stocked Item Indicator (CNE)<br> 
 * IVT-16: Consignment Item Indicator (CNE)<br> 
 * IVT-17: Reusable Item Indicator (CNE)<br> 
 * IVT-18: Reusable Cost (CP)<br> 
 * IVT-19: Substitute Item Identifier (EI)<br> 
 * IVT-20: Latex-Free Substitute Item Identifier (EI)<br> 
 * IVT-21: Recommended Reorder Theory (CWE)<br> 
 * IVT-22: Recommended Safety Stock Days (NM)<br> 
 * IVT-23: Recommended Maximum Days Inventory (NM)<br> 
 * IVT-24: Recommended Order Point (NM)<br> 
 * IVT-25: Recommended Order Amount (NM)<br> 
 * IVT-26: Operating Room Par Level Indicator (CNE)<br> 
 * </p><p>The get...() methods return data from individual fields.  These methods 
 * do not throw exceptions and may therefore have to handle exceptions internally.  
 * If an exception is handled internally, it is logged and null is returned.  
 * This is not expected to happen - if it does happen this indicates not so much 
 * an exceptional circumstance as a bug in the code for this class.</p>    
 */
public class IVT extends AbstractSegment  {

  /**
   * Creates a IVT (Material Location) segment object that belongs to the given 
   * message.  
   */
  public IVT(Group parent, ModelClassFactory factory) {
    super(parent, factory);
    Message message = getMessage();
    try {
       this.add(SI.class, true, 1, 4, new Object[]{message}, "Set Id - IVT");
       this.add(EI.class, true, 1, 250, new Object[]{message}, "Inventory Location Identifier");
       this.add(ST.class, false, 1, 999, new Object[]{message}, "Inventory Location Name");
       this.add(EI.class, false, 1, 250, new Object[]{message}, "Source Location Identifier");
       this.add(ST.class, false, 1, 999, new Object[]{message}, "Source Location Name");
       this.add(CWE.class, false, 1, 250, new Object[]{message}, "Item Status");
       this.add(EI.class, false, 0, 250, new Object[]{message}, "Bin Location Identifier");
       this.add(CWE.class, false, 1, 250, new Object[]{message}, "Order Packaging");
       this.add(CWE.class, false, 1, 250, new Object[]{message}, "Issue Packaging");
       this.add(EI.class, false, 1, 16, new Object[]{message}, "Default Inventory Asset Account");
       this.add(CNE.class, false, 1, 4, new Object[]{message}, "Patient Chargeable Indicator");
       this.add(CWE.class, false, 1, 250, new Object[]{message}, "Transaction Code");
       this.add(CP.class, false, 1, 12, new Object[]{message}, "Transaction amount - unit");
       this.add(CWE.class, false, 1, 250, new Object[]{message}, "Item Importance Code");
       this.add(CNE.class, false, 1, 4, new Object[]{message}, "Stocked Item Indicator");
       this.add(CNE.class, false, 1, 4, new Object[]{message}, "Consignment Item Indicator");
       this.add(CNE.class, false, 1, 4, new Object[]{message}, "Reusable Item Indicator");
       this.add(CP.class, false, 1, 12, new Object[]{message}, "Reusable Cost");
       this.add(EI.class, false, 0, 250, new Object[]{message}, "Substitute Item Identifier");
       this.add(EI.class, false, 1, 250, new Object[]{message}, "Latex-Free Substitute Item Identifier");
       this.add(CWE.class, false, 1, 250, new Object[]{message}, "Recommended Reorder Theory");
       this.add(NM.class, false, 1, 4, new Object[]{message}, "Recommended Safety Stock Days");
       this.add(NM.class, false, 1, 4, new Object[]{message}, "Recommended Maximum Days Inventory");
       this.add(NM.class, false, 1, 8, new Object[]{message}, "Recommended Order Point");
       this.add(NM.class, false, 1, 8, new Object[]{message}, "Recommended Order Amount");
       this.add(CNE.class, false, 1, 4, new Object[]{message}, "Operating Room Par Level Indicator");
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Can't instantiate " + this.getClass().getName(), he);
    }
  }

  /**
   * Returns Set Id - IVT (IVT-1).
   */
  public SI getSetIdIVT()  {
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
   * Returns Set Id - IVT (IVT-1).
   */
  public SI getIvt1_SetIdIVT()  {
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
   * Returns Inventory Location Identifier (IVT-2).
   */
  public EI getInventoryLocationIdentifier()  {
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
   * Returns Inventory Location Identifier (IVT-2).
   */
  public EI getIvt2_InventoryLocationIdentifier()  {
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
   * Returns Inventory Location Name (IVT-3).
   */
  public ST getInventoryLocationName()  {
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
   * Returns Inventory Location Name (IVT-3).
   */
  public ST getIvt3_InventoryLocationName()  {
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
   * Returns Source Location Identifier (IVT-4).
   */
  public EI getSourceLocationIdentifier()  {
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
   * Returns Source Location Identifier (IVT-4).
   */
  public EI getIvt4_SourceLocationIdentifier()  {
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
   * Returns Source Location Name (IVT-5).
   */
  public ST getSourceLocationName()  {
    ST ret = null;
    try {
        Type t = this.getField(5, 0);
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
   * Returns Source Location Name (IVT-5).
   */
  public ST getIvt5_SourceLocationName()  {
    ST ret = null;
    try {
        Type t = this.getField(5, 0);
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
   * Returns Item Status (IVT-6).
   */
  public CWE getItemStatus()  {
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
   * Returns Item Status (IVT-6).
   */
  public CWE getIvt6_ItemStatus()  {
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
   * Returns a single repetition of Bin Location Identifier (IVT-7).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public EI getBinLocationIdentifier(int rep) throws HL7Exception {
    EI ret = null;
    try {
        Type t = this.getField(7, rep);
        ret = (EI)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Bin Location Identifier (IVT-7).
   */
  public EI[] getBinLocationIdentifier() {
     EI[] ret = null;
    try {
        Type[] t = this.getField(7);  
        ret = new EI[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (EI)t[i];
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
   * Returns a count of the number of repetitions of Bin Location Identifier (IVT-7).
   */
  public int getBinLocationIdentifierReps() {
    try {
        return this.getField(7).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Bin Location Identifier (IVT-7) at a given index and returns it.
   * @param index The index
   */
  public EI insertBinLocationIdentifier(int index) throws HL7Exception {
     return (EI) super.insertRepetition(7, index);
  }

  /**
   * Removes a repetition of Bin Location Identifier (IVT-7) at a given index and returns it.
   * @param index The index
   */
  public EI removeBinLocationIdentifier(int index) throws HL7Exception {
     return (EI) super.removeRepetition(7, index);
  }

  /**
   * Returns a single repetition of Bin Location Identifier (IVT-7).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public EI getIvt7_BinLocationIdentifier(int rep) throws HL7Exception {
    EI ret = null;
    try {
        Type t = this.getField(7, rep);
        ret = (EI)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Bin Location Identifier (IVT-7).
   */
  public EI[] getIvt7_BinLocationIdentifier() {
     EI[] ret = null;
    try {
        Type[] t = this.getField(7);  
        ret = new EI[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (EI)t[i];
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
   * Returns a count of the number of repetitions of Bin Location Identifier (IVT-7).
   */
  public int getIvt7_BinLocationIdentifierReps() {
    try {
        return this.getField(7).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Bin Location Identifier (IVT-7) at a given index and returns it.
   * @param index The index
   */
  public EI insertIvt7_BinLocationIdentifier(int index) throws HL7Exception {
     return (EI) super.insertRepetition(7, index);
  }

  /**
   * Removes a repetition of Bin Location Identifier (IVT-7) at a given index and returns it.
   * @param index The index
   */
  public EI removeIvt7_BinLocationIdentifier(int index) throws HL7Exception {
     return (EI) super.removeRepetition(7, index);
  }

  /**
   * Returns Order Packaging (IVT-8).
   */
  public CWE getOrderPackaging()  {
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
   * Returns Order Packaging (IVT-8).
   */
  public CWE getIvt8_OrderPackaging()  {
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
   * Returns Issue Packaging (IVT-9).
   */
  public CWE getIssuePackaging()  {
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
   * Returns Issue Packaging (IVT-9).
   */
  public CWE getIvt9_IssuePackaging()  {
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
   * Returns Default Inventory Asset Account (IVT-10).
   */
  public EI getDefaultInventoryAssetAccount()  {
    EI ret = null;
    try {
        Type t = this.getField(10, 0);
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
   * Returns Default Inventory Asset Account (IVT-10).
   */
  public EI getIvt10_DefaultInventoryAssetAccount()  {
    EI ret = null;
    try {
        Type t = this.getField(10, 0);
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
   * Returns Patient Chargeable Indicator (IVT-11).
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
   * Returns Patient Chargeable Indicator (IVT-11).
   */
  public CNE getIvt11_PatientChargeableIndicator()  {
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
   * Returns Transaction Code (IVT-12).
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
   * Returns Transaction Code (IVT-12).
   */
  public CWE getIvt12_TransactionCode()  {
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
   * Returns Transaction amount - unit (IVT-13).
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
   * Returns Transaction amount - unit (IVT-13).
   */
  public CP getIvt13_TransactionAmountUnit()  {
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
   * Returns Item Importance Code (IVT-14).
   */
  public CWE getItemImportanceCode()  {
    CWE ret = null;
    try {
        Type t = this.getField(14, 0);
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
   * Returns Item Importance Code (IVT-14).
   */
  public CWE getIvt14_ItemImportanceCode()  {
    CWE ret = null;
    try {
        Type t = this.getField(14, 0);
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
   * Returns Stocked Item Indicator (IVT-15).
   */
  public CNE getStockedItemIndicator()  {
    CNE ret = null;
    try {
        Type t = this.getField(15, 0);
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
   * Returns Stocked Item Indicator (IVT-15).
   */
  public CNE getIvt15_StockedItemIndicator()  {
    CNE ret = null;
    try {
        Type t = this.getField(15, 0);
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
   * Returns Consignment Item Indicator (IVT-16).
   */
  public CNE getConsignmentItemIndicator()  {
    CNE ret = null;
    try {
        Type t = this.getField(16, 0);
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
   * Returns Consignment Item Indicator (IVT-16).
   */
  public CNE getIvt16_ConsignmentItemIndicator()  {
    CNE ret = null;
    try {
        Type t = this.getField(16, 0);
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
   * Returns Reusable Item Indicator (IVT-17).
   */
  public CNE getReusableItemIndicator()  {
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
   * Returns Reusable Item Indicator (IVT-17).
   */
  public CNE getIvt17_ReusableItemIndicator()  {
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
   * Returns Reusable Cost (IVT-18).
   */
  public CP getReusableCost()  {
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
   * Returns Reusable Cost (IVT-18).
   */
  public CP getIvt18_ReusableCost()  {
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
   * Returns a single repetition of Substitute Item Identifier (IVT-19).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public EI getSubstituteItemIdentifier(int rep) throws HL7Exception {
    EI ret = null;
    try {
        Type t = this.getField(19, rep);
        ret = (EI)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Substitute Item Identifier (IVT-19).
   */
  public EI[] getSubstituteItemIdentifier() {
     EI[] ret = null;
    try {
        Type[] t = this.getField(19);  
        ret = new EI[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (EI)t[i];
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
   * Returns a count of the number of repetitions of Substitute Item Identifier (IVT-19).
   */
  public int getSubstituteItemIdentifierReps() {
    try {
        return this.getField(19).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Substitute Item Identifier (IVT-19) at a given index and returns it.
   * @param index The index
   */
  public EI insertSubstituteItemIdentifier(int index) throws HL7Exception {
     return (EI) super.insertRepetition(19, index);
  }

  /**
   * Removes a repetition of Substitute Item Identifier (IVT-19) at a given index and returns it.
   * @param index The index
   */
  public EI removeSubstituteItemIdentifier(int index) throws HL7Exception {
     return (EI) super.removeRepetition(19, index);
  }

  /**
   * Returns a single repetition of Substitute Item Identifier (IVT-19).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public EI getIvt19_SubstituteItemIdentifier(int rep) throws HL7Exception {
    EI ret = null;
    try {
        Type t = this.getField(19, rep);
        ret = (EI)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Substitute Item Identifier (IVT-19).
   */
  public EI[] getIvt19_SubstituteItemIdentifier() {
     EI[] ret = null;
    try {
        Type[] t = this.getField(19);  
        ret = new EI[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (EI)t[i];
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
   * Returns a count of the number of repetitions of Substitute Item Identifier (IVT-19).
   */
  public int getIvt19_SubstituteItemIdentifierReps() {
    try {
        return this.getField(19).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Substitute Item Identifier (IVT-19) at a given index and returns it.
   * @param index The index
   */
  public EI insertIvt19_SubstituteItemIdentifier(int index) throws HL7Exception {
     return (EI) super.insertRepetition(19, index);
  }

  /**
   * Removes a repetition of Substitute Item Identifier (IVT-19) at a given index and returns it.
   * @param index The index
   */
  public EI removeIvt19_SubstituteItemIdentifier(int index) throws HL7Exception {
     return (EI) super.removeRepetition(19, index);
  }

  /**
   * Returns Latex-Free Substitute Item Identifier (IVT-20).
   */
  public EI getLatexFreeSubstituteItemIdentifier()  {
    EI ret = null;
    try {
        Type t = this.getField(20, 0);
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
   * Returns Latex-Free Substitute Item Identifier (IVT-20).
   */
  public EI getIvt20_LatexFreeSubstituteItemIdentifier()  {
    EI ret = null;
    try {
        Type t = this.getField(20, 0);
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
   * Returns Recommended Reorder Theory (IVT-21).
   */
  public CWE getRecommendedReorderTheory()  {
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
   * Returns Recommended Reorder Theory (IVT-21).
   */
  public CWE getIvt21_RecommendedReorderTheory()  {
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
   * Returns Recommended Safety Stock Days (IVT-22).
   */
  public NM getRecommendedSafetyStockDays()  {
    NM ret = null;
    try {
        Type t = this.getField(22, 0);
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
   * Returns Recommended Safety Stock Days (IVT-22).
   */
  public NM getIvt22_RecommendedSafetyStockDays()  {
    NM ret = null;
    try {
        Type t = this.getField(22, 0);
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
   * Returns Recommended Maximum Days Inventory (IVT-23).
   */
  public NM getRecommendedMaximumDaysInventory()  {
    NM ret = null;
    try {
        Type t = this.getField(23, 0);
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
   * Returns Recommended Maximum Days Inventory (IVT-23).
   */
  public NM getIvt23_RecommendedMaximumDaysInventory()  {
    NM ret = null;
    try {
        Type t = this.getField(23, 0);
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
   * Returns Recommended Order Point (IVT-24).
   */
  public NM getRecommendedOrderPoint()  {
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
   * Returns Recommended Order Point (IVT-24).
   */
  public NM getIvt24_RecommendedOrderPoint()  {
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
   * Returns Recommended Order Amount (IVT-25).
   */
  public NM getRecommendedOrderAmount()  {
    NM ret = null;
    try {
        Type t = this.getField(25, 0);
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
   * Returns Recommended Order Amount (IVT-25).
   */
  public NM getIvt25_RecommendedOrderAmount()  {
    NM ret = null;
    try {
        Type t = this.getField(25, 0);
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
   * Returns Operating Room Par Level Indicator (IVT-26).
   */
  public CNE getOperatingRoomParLevelIndicator()  {
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
   * Returns Operating Room Par Level Indicator (IVT-26).
   */
  public CNE getIvt26_OperatingRoomParLevelIndicator()  {
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

   protected Type createNewTypeWithoutReflection(int field) {
      switch (field) {
         case 0: return new ca.uhn.hl7v2.model.v26.datatype.SI(getMessage());
         case 1: return new ca.uhn.hl7v2.model.v26.datatype.EI(getMessage());
         case 2: return new ca.uhn.hl7v2.model.v26.datatype.ST(getMessage());
         case 3: return new ca.uhn.hl7v2.model.v26.datatype.EI(getMessage());
         case 4: return new ca.uhn.hl7v2.model.v26.datatype.ST(getMessage());
         case 5: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 6: return new ca.uhn.hl7v2.model.v26.datatype.EI(getMessage());
         case 7: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 8: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 9: return new ca.uhn.hl7v2.model.v26.datatype.EI(getMessage());
         case 10: return new ca.uhn.hl7v2.model.v26.datatype.CNE(getMessage());
         case 11: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 12: return new ca.uhn.hl7v2.model.v26.datatype.CP(getMessage());
         case 13: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 14: return new ca.uhn.hl7v2.model.v26.datatype.CNE(getMessage());
         case 15: return new ca.uhn.hl7v2.model.v26.datatype.CNE(getMessage());
         case 16: return new ca.uhn.hl7v2.model.v26.datatype.CNE(getMessage());
         case 17: return new ca.uhn.hl7v2.model.v26.datatype.CP(getMessage());
         case 18: return new ca.uhn.hl7v2.model.v26.datatype.EI(getMessage());
         case 19: return new ca.uhn.hl7v2.model.v26.datatype.EI(getMessage());
         case 20: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 21: return new ca.uhn.hl7v2.model.v26.datatype.NM(getMessage());
         case 22: return new ca.uhn.hl7v2.model.v26.datatype.NM(getMessage());
         case 23: return new ca.uhn.hl7v2.model.v26.datatype.NM(getMessage());
         case 24: return new ca.uhn.hl7v2.model.v26.datatype.NM(getMessage());
         case 25: return new ca.uhn.hl7v2.model.v26.datatype.CNE(getMessage());
         default: return null;
      }
   }

}