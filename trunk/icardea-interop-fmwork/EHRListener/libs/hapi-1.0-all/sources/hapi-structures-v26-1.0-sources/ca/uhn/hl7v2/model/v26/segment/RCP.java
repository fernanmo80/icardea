package ca.uhn.hl7v2.model.v26.segment;

import ca.uhn.hl7v2.model.*;
import ca.uhn.hl7v2.model.v26.datatype.*;
import ca.uhn.log.HapiLogFactory;
import ca.uhn.hl7v2.parser.ModelClassFactory;
import ca.uhn.hl7v2.HL7Exception;

/**
 * <p>Represents an HL7 RCP message segment. 
 * This segment has the following fields:</p><p>
 * RCP-1: Query Priority (ID)<br> 
 * RCP-2: Quantity Limited Request (CQ)<br> 
 * RCP-3: Response Modality (CNE)<br> 
 * RCP-4: Execution and Delivery Time (DTM)<br> 
 * RCP-5: Modify Indicator (ID)<br> 
 * RCP-6: Sort-by Field (SRT)<br> 
 * RCP-7: Segment group inclusion (ID)<br> 
 * </p><p>The get...() methods return data from individual fields.  These methods 
 * do not throw exceptions and may therefore have to handle exceptions internally.  
 * If an exception is handled internally, it is logged and null is returned.  
 * This is not expected to happen - if it does happen this indicates not so much 
 * an exceptional circumstance as a bug in the code for this class.</p>    
 */
public class RCP extends AbstractSegment  {

  /**
   * Creates a RCP (Response Control Parameter) segment object that belongs to the given 
   * message.  
   */
  public RCP(Group parent, ModelClassFactory factory) {
    super(parent, factory);
    Message message = getMessage();
    try {
       this.add(ID.class, false, 1, 1, new Object[]{message, new Integer(91)}, "Query Priority");
       this.add(CQ.class, false, 1, 10, new Object[]{message}, "Quantity Limited Request");
       this.add(CNE.class, false, 1, 250, new Object[]{message}, "Response Modality");
       this.add(DTM.class, false, 1, 24, new Object[]{message}, "Execution and Delivery Time");
       this.add(ID.class, false, 1, 1, new Object[]{message, new Integer(395)}, "Modify Indicator");
       this.add(SRT.class, false, 0, 512, new Object[]{message}, "Sort-by Field");
       this.add(ID.class, false, 0, 256, new Object[]{message, new Integer(391)}, "Segment group inclusion");
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Can't instantiate " + this.getClass().getName(), he);
    }
  }

  /**
   * Returns Query Priority (RCP-1).
   */
  public ID getQueryPriority()  {
    ID ret = null;
    try {
        Type t = this.getField(1, 0);
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
   * Returns Query Priority (RCP-1).
   */
  public ID getRcp1_QueryPriority()  {
    ID ret = null;
    try {
        Type t = this.getField(1, 0);
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
   * Returns Quantity Limited Request (RCP-2).
   */
  public CQ getQuantityLimitedRequest()  {
    CQ ret = null;
    try {
        Type t = this.getField(2, 0);
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
   * Returns Quantity Limited Request (RCP-2).
   */
  public CQ getRcp2_QuantityLimitedRequest()  {
    CQ ret = null;
    try {
        Type t = this.getField(2, 0);
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
   * Returns Response Modality (RCP-3).
   */
  public CNE getResponseModality()  {
    CNE ret = null;
    try {
        Type t = this.getField(3, 0);
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
   * Returns Response Modality (RCP-3).
   */
  public CNE getRcp3_ResponseModality()  {
    CNE ret = null;
    try {
        Type t = this.getField(3, 0);
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
   * Returns Execution and Delivery Time (RCP-4).
   */
  public DTM getExecutionAndDeliveryTime()  {
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
   * Returns Execution and Delivery Time (RCP-4).
   */
  public DTM getRcp4_ExecutionAndDeliveryTime()  {
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
   * Returns Modify Indicator (RCP-5).
   */
  public ID getModifyIndicator()  {
    ID ret = null;
    try {
        Type t = this.getField(5, 0);
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
   * Returns Modify Indicator (RCP-5).
   */
  public ID getRcp5_ModifyIndicator()  {
    ID ret = null;
    try {
        Type t = this.getField(5, 0);
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
   * Returns a single repetition of Sort-by Field (RCP-6).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public SRT getSortByField(int rep) throws HL7Exception {
    SRT ret = null;
    try {
        Type t = this.getField(6, rep);
        ret = (SRT)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Sort-by Field (RCP-6).
   */
  public SRT[] getSortByField() {
     SRT[] ret = null;
    try {
        Type[] t = this.getField(6);  
        ret = new SRT[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (SRT)t[i];
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
   * Returns a count of the number of repetitions of Sort-by Field (RCP-6).
   */
  public int getSortByFieldReps() {
    try {
        return this.getField(6).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Sort-by Field (RCP-6) at a given index and returns it.
   * @param index The index
   */
  public SRT insertSortByField(int index) throws HL7Exception {
     return (SRT) super.insertRepetition(6, index);
  }

  /**
   * Removes a repetition of Sort-by Field (RCP-6) at a given index and returns it.
   * @param index The index
   */
  public SRT removeSortByField(int index) throws HL7Exception {
     return (SRT) super.removeRepetition(6, index);
  }

  /**
   * Returns a single repetition of Sort-by Field (RCP-6).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public SRT getRcp6_SortByField(int rep) throws HL7Exception {
    SRT ret = null;
    try {
        Type t = this.getField(6, rep);
        ret = (SRT)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Sort-by Field (RCP-6).
   */
  public SRT[] getRcp6_SortByField() {
     SRT[] ret = null;
    try {
        Type[] t = this.getField(6);  
        ret = new SRT[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (SRT)t[i];
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
   * Returns a count of the number of repetitions of Sort-by Field (RCP-6).
   */
  public int getRcp6_SortByFieldReps() {
    try {
        return this.getField(6).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Sort-by Field (RCP-6) at a given index and returns it.
   * @param index The index
   */
  public SRT insertRcp6_SortByField(int index) throws HL7Exception {
     return (SRT) super.insertRepetition(6, index);
  }

  /**
   * Removes a repetition of Sort-by Field (RCP-6) at a given index and returns it.
   * @param index The index
   */
  public SRT removeRcp6_SortByField(int index) throws HL7Exception {
     return (SRT) super.removeRepetition(6, index);
  }

  /**
   * Returns a single repetition of Segment group inclusion (RCP-7).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public ID getSegmentGroupInclusion(int rep) throws HL7Exception {
    ID ret = null;
    try {
        Type t = this.getField(7, rep);
        ret = (ID)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Segment group inclusion (RCP-7).
   */
  public ID[] getSegmentGroupInclusion() {
     ID[] ret = null;
    try {
        Type[] t = this.getField(7);  
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
   * Returns a count of the number of repetitions of Segment group inclusion (RCP-7).
   */
  public int getSegmentGroupInclusionReps() {
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
   * Inserts a repetition of Segment group inclusion (RCP-7) at a given index and returns it.
   * @param index The index
   */
  public ID insertSegmentGroupInclusion(int index) throws HL7Exception {
     return (ID) super.insertRepetition(7, index);
  }

  /**
   * Removes a repetition of Segment group inclusion (RCP-7) at a given index and returns it.
   * @param index The index
   */
  public ID removeSegmentGroupInclusion(int index) throws HL7Exception {
     return (ID) super.removeRepetition(7, index);
  }

  /**
   * Returns a single repetition of Segment group inclusion (RCP-7).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public ID getRcp7_SegmentGroupInclusion(int rep) throws HL7Exception {
    ID ret = null;
    try {
        Type t = this.getField(7, rep);
        ret = (ID)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Segment group inclusion (RCP-7).
   */
  public ID[] getRcp7_SegmentGroupInclusion() {
     ID[] ret = null;
    try {
        Type[] t = this.getField(7);  
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
   * Returns a count of the number of repetitions of Segment group inclusion (RCP-7).
   */
  public int getRcp7_SegmentGroupInclusionReps() {
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
   * Inserts a repetition of Segment group inclusion (RCP-7) at a given index and returns it.
   * @param index The index
   */
  public ID insertRcp7_SegmentGroupInclusion(int index) throws HL7Exception {
     return (ID) super.insertRepetition(7, index);
  }

  /**
   * Removes a repetition of Segment group inclusion (RCP-7) at a given index and returns it.
   * @param index The index
   */
  public ID removeRcp7_SegmentGroupInclusion(int index) throws HL7Exception {
     return (ID) super.removeRepetition(7, index);
  }

   protected Type createNewTypeWithoutReflection(int field) {
      switch (field) {
         case 0: return new ca.uhn.hl7v2.model.v26.datatype.ID(getMessage(), new Integer(91));
         case 1: return new ca.uhn.hl7v2.model.v26.datatype.CQ(getMessage());
         case 2: return new ca.uhn.hl7v2.model.v26.datatype.CNE(getMessage());
         case 3: return new ca.uhn.hl7v2.model.v26.datatype.DTM(getMessage());
         case 4: return new ca.uhn.hl7v2.model.v26.datatype.ID(getMessage(), new Integer(395));
         case 5: return new ca.uhn.hl7v2.model.v26.datatype.SRT(getMessage());
         case 6: return new ca.uhn.hl7v2.model.v26.datatype.ID(getMessage(), new Integer(391));
         default: return null;
      }
   }

}