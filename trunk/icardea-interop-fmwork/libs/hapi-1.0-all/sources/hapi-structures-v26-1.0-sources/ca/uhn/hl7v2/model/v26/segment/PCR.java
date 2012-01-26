package ca.uhn.hl7v2.model.v26.segment;

import ca.uhn.hl7v2.model.*;
import ca.uhn.hl7v2.model.v26.datatype.*;
import ca.uhn.log.HapiLogFactory;
import ca.uhn.hl7v2.parser.ModelClassFactory;
import ca.uhn.hl7v2.HL7Exception;

/**
 * <p>Represents an HL7 PCR message segment. 
 * This segment has the following fields:</p><p>
 * PCR-1: Implicated Product (CWE)<br> 
 * PCR-2: Generic Product (IS)<br> 
 * PCR-3: Product Class (CWE)<br> 
 * PCR-4: Total Duration Of Therapy (CQ)<br> 
 * PCR-5: Product Manufacture Date (DTM)<br> 
 * PCR-6: Product Expiration Date (DTM)<br> 
 * PCR-7: Product Implantation Date (DTM)<br> 
 * PCR-8: Product Explantation Date (DTM)<br> 
 * PCR-9: Single Use Device (IS)<br> 
 * PCR-10: Indication For Product Use (CWE)<br> 
 * PCR-11: Product Problem (IS)<br> 
 * PCR-12: Product Serial/Lot Number (ST)<br> 
 * PCR-13: Product Available For Inspection (IS)<br> 
 * PCR-14: Product Evaluation Performed (CWE)<br> 
 * PCR-15: Product Evaluation Status (CWE)<br> 
 * PCR-16: Product Evaluation Results (CWE)<br> 
 * PCR-17: Evaluated Product Source (ID)<br> 
 * PCR-18: Date Product Returned To Manufacturer (DTM)<br> 
 * PCR-19: Device Operator Qualifications (ID)<br> 
 * PCR-20: Relatedness Assessment (ID)<br> 
 * PCR-21: Action Taken In Response To The Event (ID)<br> 
 * PCR-22: Event Causality Observations (ID)<br> 
 * PCR-23: Indirect Exposure Mechanism (ID)<br> 
 * </p><p>The get...() methods return data from individual fields.  These methods 
 * do not throw exceptions and may therefore have to handle exceptions internally.  
 * If an exception is handled internally, it is logged and null is returned.  
 * This is not expected to happen - if it does happen this indicates not so much 
 * an exceptional circumstance as a bug in the code for this class.</p>    
 */
public class PCR extends AbstractSegment  {

  /**
   * Creates a PCR (Possible Causal Relationship) segment object that belongs to the given 
   * message.  
   */
  public PCR(Group parent, ModelClassFactory factory) {
    super(parent, factory);
    Message message = getMessage();
    try {
       this.add(CWE.class, true, 1, 705, new Object[]{message}, "Implicated Product");
       this.add(IS.class, false, 1, 1, new Object[]{message, new Integer(249)}, "Generic Product");
       this.add(CWE.class, false, 1, 705, new Object[]{message}, "Product Class");
       this.add(CQ.class, false, 1, 500, new Object[]{message}, "Total Duration Of Therapy");
       this.add(DTM.class, false, 1, 24, new Object[]{message}, "Product Manufacture Date");
       this.add(DTM.class, false, 1, 24, new Object[]{message}, "Product Expiration Date");
       this.add(DTM.class, false, 1, 24, new Object[]{message}, "Product Implantation Date");
       this.add(DTM.class, false, 1, 24, new Object[]{message}, "Product Explantation Date");
       this.add(IS.class, false, 1, 8, new Object[]{message, new Integer(244)}, "Single Use Device");
       this.add(CWE.class, false, 1, 705, new Object[]{message}, "Indication For Product Use");
       this.add(IS.class, false, 1, 8, new Object[]{message, new Integer(245)}, "Product Problem");
       this.add(ST.class, false, 3, 199, new Object[]{message}, "Product Serial/Lot Number");
       this.add(IS.class, false, 1, 1, new Object[]{message, new Integer(246)}, "Product Available For Inspection");
       this.add(CWE.class, false, 1, 705, new Object[]{message}, "Product Evaluation Performed");
       this.add(CWE.class, false, 1, 705, new Object[]{message}, "Product Evaluation Status");
       this.add(CWE.class, false, 1, 705, new Object[]{message}, "Product Evaluation Results");
       this.add(ID.class, false, 1, 8, new Object[]{message, new Integer(248)}, "Evaluated Product Source");
       this.add(DTM.class, false, 1, 24, new Object[]{message}, "Date Product Returned To Manufacturer");
       this.add(ID.class, false, 1, 1, new Object[]{message, new Integer(242)}, "Device Operator Qualifications");
       this.add(ID.class, false, 1, 1, new Object[]{message, new Integer(250)}, "Relatedness Assessment");
       this.add(ID.class, false, 6, 2, new Object[]{message, new Integer(251)}, "Action Taken In Response To The Event");
       this.add(ID.class, false, 6, 2, new Object[]{message, new Integer(252)}, "Event Causality Observations");
       this.add(ID.class, false, 3, 1, new Object[]{message, new Integer(253)}, "Indirect Exposure Mechanism");
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Can't instantiate " + this.getClass().getName(), he);
    }
  }

  /**
   * Returns Implicated Product (PCR-1).
   */
  public CWE getImplicatedProduct()  {
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
   * Returns Implicated Product (PCR-1).
   */
  public CWE getPcr1_ImplicatedProduct()  {
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
   * Returns Generic Product (PCR-2).
   */
  public IS getGenericProduct()  {
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
   * Returns Generic Product (PCR-2).
   */
  public IS getPcr2_GenericProduct()  {
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
   * Returns Product Class (PCR-3).
   */
  public CWE getProductClass()  {
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
   * Returns Product Class (PCR-3).
   */
  public CWE getPcr3_ProductClass()  {
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
   * Returns Total Duration Of Therapy (PCR-4).
   */
  public CQ getTotalDurationOfTherapy()  {
    CQ ret = null;
    try {
        Type t = this.getField(4, 0);
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
   * Returns Total Duration Of Therapy (PCR-4).
   */
  public CQ getPcr4_TotalDurationOfTherapy()  {
    CQ ret = null;
    try {
        Type t = this.getField(4, 0);
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
   * Returns Product Manufacture Date (PCR-5).
   */
  public DTM getProductManufactureDate()  {
    DTM ret = null;
    try {
        Type t = this.getField(5, 0);
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
   * Returns Product Manufacture Date (PCR-5).
   */
  public DTM getPcr5_ProductManufactureDate()  {
    DTM ret = null;
    try {
        Type t = this.getField(5, 0);
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
   * Returns Product Expiration Date (PCR-6).
   */
  public DTM getProductExpirationDate()  {
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
   * Returns Product Expiration Date (PCR-6).
   */
  public DTM getPcr6_ProductExpirationDate()  {
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
   * Returns Product Implantation Date (PCR-7).
   */
  public DTM getProductImplantationDate()  {
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
   * Returns Product Implantation Date (PCR-7).
   */
  public DTM getPcr7_ProductImplantationDate()  {
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
   * Returns Product Explantation Date (PCR-8).
   */
  public DTM getProductExplantationDate()  {
    DTM ret = null;
    try {
        Type t = this.getField(8, 0);
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
   * Returns Product Explantation Date (PCR-8).
   */
  public DTM getPcr8_ProductExplantationDate()  {
    DTM ret = null;
    try {
        Type t = this.getField(8, 0);
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
   * Returns Single Use Device (PCR-9).
   */
  public IS getSingleUseDevice()  {
    IS ret = null;
    try {
        Type t = this.getField(9, 0);
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
   * Returns Single Use Device (PCR-9).
   */
  public IS getPcr9_SingleUseDevice()  {
    IS ret = null;
    try {
        Type t = this.getField(9, 0);
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
   * Returns Indication For Product Use (PCR-10).
   */
  public CWE getIndicationForProductUse()  {
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
   * Returns Indication For Product Use (PCR-10).
   */
  public CWE getPcr10_IndicationForProductUse()  {
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
   * Returns Product Problem (PCR-11).
   */
  public IS getProductProblem()  {
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
   * Returns Product Problem (PCR-11).
   */
  public IS getPcr11_ProductProblem()  {
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
   * Returns a single repetition of Product Serial/Lot Number (PCR-12).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public ST getProductSerialLotNumber(int rep) throws HL7Exception {
    ST ret = null;
    try {
        Type t = this.getField(12, rep);
        ret = (ST)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Product Serial/Lot Number (PCR-12).
   */
  public ST[] getProductSerialLotNumber() {
     ST[] ret = null;
    try {
        Type[] t = this.getField(12);  
        ret = new ST[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (ST)t[i];
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
   * Returns a count of the number of repetitions of Product Serial/Lot Number (PCR-12).
   */
  public int getProductSerialLotNumberReps() {
    try {
        return this.getField(12).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Product Serial/Lot Number (PCR-12) at a given index and returns it.
   * @param index The index
   */
  public ST insertProductSerialLotNumber(int index) throws HL7Exception {
     return (ST) super.insertRepetition(12, index);
  }

  /**
   * Removes a repetition of Product Serial/Lot Number (PCR-12) at a given index and returns it.
   * @param index The index
   */
  public ST removeProductSerialLotNumber(int index) throws HL7Exception {
     return (ST) super.removeRepetition(12, index);
  }

  /**
   * Returns a single repetition of Product Serial/Lot Number (PCR-12).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public ST getPcr12_ProductSerialLotNumber(int rep) throws HL7Exception {
    ST ret = null;
    try {
        Type t = this.getField(12, rep);
        ret = (ST)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Product Serial/Lot Number (PCR-12).
   */
  public ST[] getPcr12_ProductSerialLotNumber() {
     ST[] ret = null;
    try {
        Type[] t = this.getField(12);  
        ret = new ST[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (ST)t[i];
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
   * Returns a count of the number of repetitions of Product Serial/Lot Number (PCR-12).
   */
  public int getPcr12_ProductSerialLotNumberReps() {
    try {
        return this.getField(12).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Product Serial/Lot Number (PCR-12) at a given index and returns it.
   * @param index The index
   */
  public ST insertPcr12_ProductSerialLotNumber(int index) throws HL7Exception {
     return (ST) super.insertRepetition(12, index);
  }

  /**
   * Removes a repetition of Product Serial/Lot Number (PCR-12) at a given index and returns it.
   * @param index The index
   */
  public ST removePcr12_ProductSerialLotNumber(int index) throws HL7Exception {
     return (ST) super.removeRepetition(12, index);
  }

  /**
   * Returns Product Available For Inspection (PCR-13).
   */
  public IS getProductAvailableForInspection()  {
    IS ret = null;
    try {
        Type t = this.getField(13, 0);
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
   * Returns Product Available For Inspection (PCR-13).
   */
  public IS getPcr13_ProductAvailableForInspection()  {
    IS ret = null;
    try {
        Type t = this.getField(13, 0);
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
   * Returns Product Evaluation Performed (PCR-14).
   */
  public CWE getProductEvaluationPerformed()  {
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
   * Returns Product Evaluation Performed (PCR-14).
   */
  public CWE getPcr14_ProductEvaluationPerformed()  {
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
   * Returns Product Evaluation Status (PCR-15).
   */
  public CWE getProductEvaluationStatus()  {
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
   * Returns Product Evaluation Status (PCR-15).
   */
  public CWE getPcr15_ProductEvaluationStatus()  {
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
   * Returns Product Evaluation Results (PCR-16).
   */
  public CWE getProductEvaluationResults()  {
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
   * Returns Product Evaluation Results (PCR-16).
   */
  public CWE getPcr16_ProductEvaluationResults()  {
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
   * Returns Evaluated Product Source (PCR-17).
   */
  public ID getEvaluatedProductSource()  {
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
   * Returns Evaluated Product Source (PCR-17).
   */
  public ID getPcr17_EvaluatedProductSource()  {
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
   * Returns Date Product Returned To Manufacturer (PCR-18).
   */
  public DTM getDateProductReturnedToManufacturer()  {
    DTM ret = null;
    try {
        Type t = this.getField(18, 0);
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
   * Returns Date Product Returned To Manufacturer (PCR-18).
   */
  public DTM getPcr18_DateProductReturnedToManufacturer()  {
    DTM ret = null;
    try {
        Type t = this.getField(18, 0);
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
   * Returns Device Operator Qualifications (PCR-19).
   */
  public ID getDeviceOperatorQualifications()  {
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
   * Returns Device Operator Qualifications (PCR-19).
   */
  public ID getPcr19_DeviceOperatorQualifications()  {
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
   * Returns Relatedness Assessment (PCR-20).
   */
  public ID getRelatednessAssessment()  {
    ID ret = null;
    try {
        Type t = this.getField(20, 0);
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
   * Returns Relatedness Assessment (PCR-20).
   */
  public ID getPcr20_RelatednessAssessment()  {
    ID ret = null;
    try {
        Type t = this.getField(20, 0);
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
   * Returns a single repetition of Action Taken In Response To The Event (PCR-21).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public ID getActionTakenInResponseToTheEvent(int rep) throws HL7Exception {
    ID ret = null;
    try {
        Type t = this.getField(21, rep);
        ret = (ID)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Action Taken In Response To The Event (PCR-21).
   */
  public ID[] getActionTakenInResponseToTheEvent() {
     ID[] ret = null;
    try {
        Type[] t = this.getField(21);  
        ret = new ID[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (ID)t[i];
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
   * Returns a count of the number of repetitions of Action Taken In Response To The Event (PCR-21).
   */
  public int getActionTakenInResponseToTheEventReps() {
    try {
        return this.getField(21).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Action Taken In Response To The Event (PCR-21) at a given index and returns it.
   * @param index The index
   */
  public ID insertActionTakenInResponseToTheEvent(int index) throws HL7Exception {
     return (ID) super.insertRepetition(21, index);
  }

  /**
   * Removes a repetition of Action Taken In Response To The Event (PCR-21) at a given index and returns it.
   * @param index The index
   */
  public ID removeActionTakenInResponseToTheEvent(int index) throws HL7Exception {
     return (ID) super.removeRepetition(21, index);
  }

  /**
   * Returns a single repetition of Action Taken In Response To The Event (PCR-21).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public ID getPcr21_ActionTakenInResponseToTheEvent(int rep) throws HL7Exception {
    ID ret = null;
    try {
        Type t = this.getField(21, rep);
        ret = (ID)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Action Taken In Response To The Event (PCR-21).
   */
  public ID[] getPcr21_ActionTakenInResponseToTheEvent() {
     ID[] ret = null;
    try {
        Type[] t = this.getField(21);  
        ret = new ID[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (ID)t[i];
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
   * Returns a count of the number of repetitions of Action Taken In Response To The Event (PCR-21).
   */
  public int getPcr21_ActionTakenInResponseToTheEventReps() {
    try {
        return this.getField(21).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Action Taken In Response To The Event (PCR-21) at a given index and returns it.
   * @param index The index
   */
  public ID insertPcr21_ActionTakenInResponseToTheEvent(int index) throws HL7Exception {
     return (ID) super.insertRepetition(21, index);
  }

  /**
   * Removes a repetition of Action Taken In Response To The Event (PCR-21) at a given index and returns it.
   * @param index The index
   */
  public ID removePcr21_ActionTakenInResponseToTheEvent(int index) throws HL7Exception {
     return (ID) super.removeRepetition(21, index);
  }

  /**
   * Returns a single repetition of Event Causality Observations (PCR-22).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public ID getEventCausalityObservations(int rep) throws HL7Exception {
    ID ret = null;
    try {
        Type t = this.getField(22, rep);
        ret = (ID)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Event Causality Observations (PCR-22).
   */
  public ID[] getEventCausalityObservations() {
     ID[] ret = null;
    try {
        Type[] t = this.getField(22);  
        ret = new ID[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (ID)t[i];
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
   * Returns a count of the number of repetitions of Event Causality Observations (PCR-22).
   */
  public int getEventCausalityObservationsReps() {
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
   * Inserts a repetition of Event Causality Observations (PCR-22) at a given index and returns it.
   * @param index The index
   */
  public ID insertEventCausalityObservations(int index) throws HL7Exception {
     return (ID) super.insertRepetition(22, index);
  }

  /**
   * Removes a repetition of Event Causality Observations (PCR-22) at a given index and returns it.
   * @param index The index
   */
  public ID removeEventCausalityObservations(int index) throws HL7Exception {
     return (ID) super.removeRepetition(22, index);
  }

  /**
   * Returns a single repetition of Event Causality Observations (PCR-22).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public ID getPcr22_EventCausalityObservations(int rep) throws HL7Exception {
    ID ret = null;
    try {
        Type t = this.getField(22, rep);
        ret = (ID)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Event Causality Observations (PCR-22).
   */
  public ID[] getPcr22_EventCausalityObservations() {
     ID[] ret = null;
    try {
        Type[] t = this.getField(22);  
        ret = new ID[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (ID)t[i];
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
   * Returns a count of the number of repetitions of Event Causality Observations (PCR-22).
   */
  public int getPcr22_EventCausalityObservationsReps() {
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
   * Inserts a repetition of Event Causality Observations (PCR-22) at a given index and returns it.
   * @param index The index
   */
  public ID insertPcr22_EventCausalityObservations(int index) throws HL7Exception {
     return (ID) super.insertRepetition(22, index);
  }

  /**
   * Removes a repetition of Event Causality Observations (PCR-22) at a given index and returns it.
   * @param index The index
   */
  public ID removePcr22_EventCausalityObservations(int index) throws HL7Exception {
     return (ID) super.removeRepetition(22, index);
  }

  /**
   * Returns a single repetition of Indirect Exposure Mechanism (PCR-23).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public ID getIndirectExposureMechanism(int rep) throws HL7Exception {
    ID ret = null;
    try {
        Type t = this.getField(23, rep);
        ret = (ID)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Indirect Exposure Mechanism (PCR-23).
   */
  public ID[] getIndirectExposureMechanism() {
     ID[] ret = null;
    try {
        Type[] t = this.getField(23);  
        ret = new ID[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (ID)t[i];
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
   * Returns a count of the number of repetitions of Indirect Exposure Mechanism (PCR-23).
   */
  public int getIndirectExposureMechanismReps() {
    try {
        return this.getField(23).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Indirect Exposure Mechanism (PCR-23) at a given index and returns it.
   * @param index The index
   */
  public ID insertIndirectExposureMechanism(int index) throws HL7Exception {
     return (ID) super.insertRepetition(23, index);
  }

  /**
   * Removes a repetition of Indirect Exposure Mechanism (PCR-23) at a given index and returns it.
   * @param index The index
   */
  public ID removeIndirectExposureMechanism(int index) throws HL7Exception {
     return (ID) super.removeRepetition(23, index);
  }

  /**
   * Returns a single repetition of Indirect Exposure Mechanism (PCR-23).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public ID getPcr23_IndirectExposureMechanism(int rep) throws HL7Exception {
    ID ret = null;
    try {
        Type t = this.getField(23, rep);
        ret = (ID)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Indirect Exposure Mechanism (PCR-23).
   */
  public ID[] getPcr23_IndirectExposureMechanism() {
     ID[] ret = null;
    try {
        Type[] t = this.getField(23);  
        ret = new ID[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (ID)t[i];
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
   * Returns a count of the number of repetitions of Indirect Exposure Mechanism (PCR-23).
   */
  public int getPcr23_IndirectExposureMechanismReps() {
    try {
        return this.getField(23).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Indirect Exposure Mechanism (PCR-23) at a given index and returns it.
   * @param index The index
   */
  public ID insertPcr23_IndirectExposureMechanism(int index) throws HL7Exception {
     return (ID) super.insertRepetition(23, index);
  }

  /**
   * Removes a repetition of Indirect Exposure Mechanism (PCR-23) at a given index and returns it.
   * @param index The index
   */
  public ID removePcr23_IndirectExposureMechanism(int index) throws HL7Exception {
     return (ID) super.removeRepetition(23, index);
  }

   protected Type createNewTypeWithoutReflection(int field) {
      switch (field) {
         case 0: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 1: return new ca.uhn.hl7v2.model.v26.datatype.IS(getMessage(), new Integer(249));
         case 2: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 3: return new ca.uhn.hl7v2.model.v26.datatype.CQ(getMessage());
         case 4: return new ca.uhn.hl7v2.model.v26.datatype.DTM(getMessage());
         case 5: return new ca.uhn.hl7v2.model.v26.datatype.DTM(getMessage());
         case 6: return new ca.uhn.hl7v2.model.v26.datatype.DTM(getMessage());
         case 7: return new ca.uhn.hl7v2.model.v26.datatype.DTM(getMessage());
         case 8: return new ca.uhn.hl7v2.model.v26.datatype.IS(getMessage(), new Integer(244));
         case 9: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 10: return new ca.uhn.hl7v2.model.v26.datatype.IS(getMessage(), new Integer(245));
         case 11: return new ca.uhn.hl7v2.model.v26.datatype.ST(getMessage());
         case 12: return new ca.uhn.hl7v2.model.v26.datatype.IS(getMessage(), new Integer(246));
         case 13: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 14: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 15: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 16: return new ca.uhn.hl7v2.model.v26.datatype.ID(getMessage(), new Integer(248));
         case 17: return new ca.uhn.hl7v2.model.v26.datatype.DTM(getMessage());
         case 18: return new ca.uhn.hl7v2.model.v26.datatype.ID(getMessage(), new Integer(242));
         case 19: return new ca.uhn.hl7v2.model.v26.datatype.ID(getMessage(), new Integer(250));
         case 20: return new ca.uhn.hl7v2.model.v26.datatype.ID(getMessage(), new Integer(251));
         case 21: return new ca.uhn.hl7v2.model.v26.datatype.ID(getMessage(), new Integer(252));
         case 22: return new ca.uhn.hl7v2.model.v26.datatype.ID(getMessage(), new Integer(253));
         default: return null;
      }
   }

}