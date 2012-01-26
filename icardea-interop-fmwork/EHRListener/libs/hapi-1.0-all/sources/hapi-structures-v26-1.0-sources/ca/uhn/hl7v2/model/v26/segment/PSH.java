package ca.uhn.hl7v2.model.v26.segment;

import ca.uhn.hl7v2.model.*;
import ca.uhn.hl7v2.model.v26.datatype.*;
import ca.uhn.log.HapiLogFactory;
import ca.uhn.hl7v2.parser.ModelClassFactory;
import ca.uhn.hl7v2.HL7Exception;

/**
 * <p>Represents an HL7 PSH message segment. 
 * This segment has the following fields:</p><p>
 * PSH-1: Report Type (ST)<br> 
 * PSH-2: Report Form Identifier (ST)<br> 
 * PSH-3: Report Date (DTM)<br> 
 * PSH-4: Report Interval Start Date (DTM)<br> 
 * PSH-5: Report Interval End Date (DTM)<br> 
 * PSH-6: Quantity Manufactured (CQ)<br> 
 * PSH-7: Quantity Distributed (CQ)<br> 
 * PSH-8: Quantity Distributed Method (ID)<br> 
 * PSH-9: Quantity Distributed Comment (FT)<br> 
 * PSH-10: Quantity in Use (CQ)<br> 
 * PSH-11: Quantity in Use Method (ID)<br> 
 * PSH-12: Quantity in Use Comment (FT)<br> 
 * PSH-13: Number of Product Experience Reports Filed by Facility (NM)<br> 
 * PSH-14: Number of Product Experience Reports Filed by Distributor (NM)<br> 
 * </p><p>The get...() methods return data from individual fields.  These methods 
 * do not throw exceptions and may therefore have to handle exceptions internally.  
 * If an exception is handled internally, it is logged and null is returned.  
 * This is not expected to happen - if it does happen this indicates not so much 
 * an exceptional circumstance as a bug in the code for this class.</p>    
 */
public class PSH extends AbstractSegment  {

  /**
   * Creates a PSH (Product Summary Header) segment object that belongs to the given 
   * message.  
   */
  public PSH(Group parent, ModelClassFactory factory) {
    super(parent, factory);
    Message message = getMessage();
    try {
       this.add(ST.class, true, 1, 60, new Object[]{message}, "Report Type");
       this.add(ST.class, false, 1, 60, new Object[]{message}, "Report Form Identifier");
       this.add(DTM.class, true, 1, 24, new Object[]{message}, "Report Date");
       this.add(DTM.class, false, 1, 24, new Object[]{message}, "Report Interval Start Date");
       this.add(DTM.class, false, 1, 24, new Object[]{message}, "Report Interval End Date");
       this.add(CQ.class, false, 1, 722, new Object[]{message}, "Quantity Manufactured");
       this.add(CQ.class, false, 1, 722, new Object[]{message}, "Quantity Distributed");
       this.add(ID.class, false, 1, 1, new Object[]{message, new Integer(329)}, "Quantity Distributed Method");
       this.add(FT.class, false, 1, 600, new Object[]{message}, "Quantity Distributed Comment");
       this.add(CQ.class, false, 1, 722, new Object[]{message}, "Quantity in Use");
       this.add(ID.class, false, 1, 1, new Object[]{message, new Integer(329)}, "Quantity in Use Method");
       this.add(FT.class, false, 1, 600, new Object[]{message}, "Quantity in Use Comment");
       this.add(NM.class, false, 8, 16, new Object[]{message}, "Number of Product Experience Reports Filed by Facility");
       this.add(NM.class, false, 8, 16, new Object[]{message}, "Number of Product Experience Reports Filed by Distributor");
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Can't instantiate " + this.getClass().getName(), he);
    }
  }

  /**
   * Returns Report Type (PSH-1).
   */
  public ST getReportType()  {
    ST ret = null;
    try {
        Type t = this.getField(1, 0);
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
   * Returns Report Type (PSH-1).
   */
  public ST getPsh1_ReportType()  {
    ST ret = null;
    try {
        Type t = this.getField(1, 0);
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
   * Returns Report Form Identifier (PSH-2).
   */
  public ST getReportFormIdentifier()  {
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
   * Returns Report Form Identifier (PSH-2).
   */
  public ST getPsh2_ReportFormIdentifier()  {
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
   * Returns Report Date (PSH-3).
   */
  public DTM getReportDate()  {
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
   * Returns Report Date (PSH-3).
   */
  public DTM getPsh3_ReportDate()  {
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
   * Returns Report Interval Start Date (PSH-4).
   */
  public DTM getReportIntervalStartDate()  {
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
   * Returns Report Interval Start Date (PSH-4).
   */
  public DTM getPsh4_ReportIntervalStartDate()  {
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
   * Returns Report Interval End Date (PSH-5).
   */
  public DTM getReportIntervalEndDate()  {
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
   * Returns Report Interval End Date (PSH-5).
   */
  public DTM getPsh5_ReportIntervalEndDate()  {
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
   * Returns Quantity Manufactured (PSH-6).
   */
  public CQ getQuantityManufactured()  {
    CQ ret = null;
    try {
        Type t = this.getField(6, 0);
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
   * Returns Quantity Manufactured (PSH-6).
   */
  public CQ getPsh6_QuantityManufactured()  {
    CQ ret = null;
    try {
        Type t = this.getField(6, 0);
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
   * Returns Quantity Distributed (PSH-7).
   */
  public CQ getQuantityDistributed()  {
    CQ ret = null;
    try {
        Type t = this.getField(7, 0);
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
   * Returns Quantity Distributed (PSH-7).
   */
  public CQ getPsh7_QuantityDistributed()  {
    CQ ret = null;
    try {
        Type t = this.getField(7, 0);
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
   * Returns Quantity Distributed Method (PSH-8).
   */
  public ID getQuantityDistributedMethod()  {
    ID ret = null;
    try {
        Type t = this.getField(8, 0);
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
   * Returns Quantity Distributed Method (PSH-8).
   */
  public ID getPsh8_QuantityDistributedMethod()  {
    ID ret = null;
    try {
        Type t = this.getField(8, 0);
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
   * Returns Quantity Distributed Comment (PSH-9).
   */
  public FT getQuantityDistributedComment()  {
    FT ret = null;
    try {
        Type t = this.getField(9, 0);
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
   * Returns Quantity Distributed Comment (PSH-9).
   */
  public FT getPsh9_QuantityDistributedComment()  {
    FT ret = null;
    try {
        Type t = this.getField(9, 0);
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
   * Returns Quantity in Use (PSH-10).
   */
  public CQ getQuantityInUse()  {
    CQ ret = null;
    try {
        Type t = this.getField(10, 0);
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
   * Returns Quantity in Use (PSH-10).
   */
  public CQ getPsh10_QuantityInUse()  {
    CQ ret = null;
    try {
        Type t = this.getField(10, 0);
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
   * Returns Quantity in Use Method (PSH-11).
   */
  public ID getQuantityInUseMethod()  {
    ID ret = null;
    try {
        Type t = this.getField(11, 0);
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
   * Returns Quantity in Use Method (PSH-11).
   */
  public ID getPsh11_QuantityInUseMethod()  {
    ID ret = null;
    try {
        Type t = this.getField(11, 0);
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
   * Returns Quantity in Use Comment (PSH-12).
   */
  public FT getQuantityInUseComment()  {
    FT ret = null;
    try {
        Type t = this.getField(12, 0);
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
   * Returns Quantity in Use Comment (PSH-12).
   */
  public FT getPsh12_QuantityInUseComment()  {
    FT ret = null;
    try {
        Type t = this.getField(12, 0);
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
   * Returns a single repetition of Number of Product Experience Reports Filed by Facility (PSH-13).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public NM getNumberOfProductExperienceReportsFiledByFacility(int rep) throws HL7Exception {
    NM ret = null;
    try {
        Type t = this.getField(13, rep);
        ret = (NM)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Number of Product Experience Reports Filed by Facility (PSH-13).
   */
  public NM[] getNumberOfProductExperienceReportsFiledByFacility() {
     NM[] ret = null;
    try {
        Type[] t = this.getField(13);  
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
   * Returns a count of the number of repetitions of Number of Product Experience Reports Filed by Facility (PSH-13).
   */
  public int getNumberOfProductExperienceReportsFiledByFacilityReps() {
    try {
        return this.getField(13).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Number of Product Experience Reports Filed by Facility (PSH-13) at a given index and returns it.
   * @param index The index
   */
  public NM insertNumberOfProductExperienceReportsFiledByFacility(int index) throws HL7Exception {
     return (NM) super.insertRepetition(13, index);
  }

  /**
   * Removes a repetition of Number of Product Experience Reports Filed by Facility (PSH-13) at a given index and returns it.
   * @param index The index
   */
  public NM removeNumberOfProductExperienceReportsFiledByFacility(int index) throws HL7Exception {
     return (NM) super.removeRepetition(13, index);
  }

  /**
   * Returns a single repetition of Number of Product Experience Reports Filed by Facility (PSH-13).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public NM getPsh13_NumberOfProductExperienceReportsFiledByFacility(int rep) throws HL7Exception {
    NM ret = null;
    try {
        Type t = this.getField(13, rep);
        ret = (NM)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Number of Product Experience Reports Filed by Facility (PSH-13).
   */
  public NM[] getPsh13_NumberOfProductExperienceReportsFiledByFacility() {
     NM[] ret = null;
    try {
        Type[] t = this.getField(13);  
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
   * Returns a count of the number of repetitions of Number of Product Experience Reports Filed by Facility (PSH-13).
   */
  public int getPsh13_NumberOfProductExperienceReportsFiledByFacilityReps() {
    try {
        return this.getField(13).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Number of Product Experience Reports Filed by Facility (PSH-13) at a given index and returns it.
   * @param index The index
   */
  public NM insertPsh13_NumberOfProductExperienceReportsFiledByFacility(int index) throws HL7Exception {
     return (NM) super.insertRepetition(13, index);
  }

  /**
   * Removes a repetition of Number of Product Experience Reports Filed by Facility (PSH-13) at a given index and returns it.
   * @param index The index
   */
  public NM removePsh13_NumberOfProductExperienceReportsFiledByFacility(int index) throws HL7Exception {
     return (NM) super.removeRepetition(13, index);
  }

  /**
   * Returns a single repetition of Number of Product Experience Reports Filed by Distributor (PSH-14).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public NM getNumberOfProductExperienceReportsFiledByDistributor(int rep) throws HL7Exception {
    NM ret = null;
    try {
        Type t = this.getField(14, rep);
        ret = (NM)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Number of Product Experience Reports Filed by Distributor (PSH-14).
   */
  public NM[] getNumberOfProductExperienceReportsFiledByDistributor() {
     NM[] ret = null;
    try {
        Type[] t = this.getField(14);  
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
   * Returns a count of the number of repetitions of Number of Product Experience Reports Filed by Distributor (PSH-14).
   */
  public int getNumberOfProductExperienceReportsFiledByDistributorReps() {
    try {
        return this.getField(14).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Number of Product Experience Reports Filed by Distributor (PSH-14) at a given index and returns it.
   * @param index The index
   */
  public NM insertNumberOfProductExperienceReportsFiledByDistributor(int index) throws HL7Exception {
     return (NM) super.insertRepetition(14, index);
  }

  /**
   * Removes a repetition of Number of Product Experience Reports Filed by Distributor (PSH-14) at a given index and returns it.
   * @param index The index
   */
  public NM removeNumberOfProductExperienceReportsFiledByDistributor(int index) throws HL7Exception {
     return (NM) super.removeRepetition(14, index);
  }

  /**
   * Returns a single repetition of Number of Product Experience Reports Filed by Distributor (PSH-14).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public NM getPsh14_NumberOfProductExperienceReportsFiledByDistributor(int rep) throws HL7Exception {
    NM ret = null;
    try {
        Type t = this.getField(14, rep);
        ret = (NM)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Number of Product Experience Reports Filed by Distributor (PSH-14).
   */
  public NM[] getPsh14_NumberOfProductExperienceReportsFiledByDistributor() {
     NM[] ret = null;
    try {
        Type[] t = this.getField(14);  
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
   * Returns a count of the number of repetitions of Number of Product Experience Reports Filed by Distributor (PSH-14).
   */
  public int getPsh14_NumberOfProductExperienceReportsFiledByDistributorReps() {
    try {
        return this.getField(14).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Number of Product Experience Reports Filed by Distributor (PSH-14) at a given index and returns it.
   * @param index The index
   */
  public NM insertPsh14_NumberOfProductExperienceReportsFiledByDistributor(int index) throws HL7Exception {
     return (NM) super.insertRepetition(14, index);
  }

  /**
   * Removes a repetition of Number of Product Experience Reports Filed by Distributor (PSH-14) at a given index and returns it.
   * @param index The index
   */
  public NM removePsh14_NumberOfProductExperienceReportsFiledByDistributor(int index) throws HL7Exception {
     return (NM) super.removeRepetition(14, index);
  }

   protected Type createNewTypeWithoutReflection(int field) {
      switch (field) {
         case 0: return new ca.uhn.hl7v2.model.v26.datatype.ST(getMessage());
         case 1: return new ca.uhn.hl7v2.model.v26.datatype.ST(getMessage());
         case 2: return new ca.uhn.hl7v2.model.v26.datatype.DTM(getMessage());
         case 3: return new ca.uhn.hl7v2.model.v26.datatype.DTM(getMessage());
         case 4: return new ca.uhn.hl7v2.model.v26.datatype.DTM(getMessage());
         case 5: return new ca.uhn.hl7v2.model.v26.datatype.CQ(getMessage());
         case 6: return new ca.uhn.hl7v2.model.v26.datatype.CQ(getMessage());
         case 7: return new ca.uhn.hl7v2.model.v26.datatype.ID(getMessage(), new Integer(329));
         case 8: return new ca.uhn.hl7v2.model.v26.datatype.FT(getMessage());
         case 9: return new ca.uhn.hl7v2.model.v26.datatype.CQ(getMessage());
         case 10: return new ca.uhn.hl7v2.model.v26.datatype.ID(getMessage(), new Integer(329));
         case 11: return new ca.uhn.hl7v2.model.v26.datatype.FT(getMessage());
         case 12: return new ca.uhn.hl7v2.model.v26.datatype.NM(getMessage());
         case 13: return new ca.uhn.hl7v2.model.v26.datatype.NM(getMessage());
         default: return null;
      }
   }

}