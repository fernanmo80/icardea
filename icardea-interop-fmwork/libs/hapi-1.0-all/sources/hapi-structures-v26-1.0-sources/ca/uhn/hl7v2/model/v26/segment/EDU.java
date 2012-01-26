package ca.uhn.hl7v2.model.v26.segment;

import ca.uhn.hl7v2.model.*;
import ca.uhn.hl7v2.model.v26.datatype.*;
import ca.uhn.log.HapiLogFactory;
import ca.uhn.hl7v2.parser.ModelClassFactory;
import ca.uhn.hl7v2.HL7Exception;

/**
 * <p>Represents an HL7 EDU message segment. 
 * This segment has the following fields:</p><p>
 * EDU-1: Set ID - EDU (SI)<br> 
 * EDU-2: Academic Degree (IS)<br> 
 * EDU-3: Academic Degree Program Date Range (DR)<br> 
 * EDU-4: Academic Degree Program Participation Date Range (DR)<br> 
 * EDU-5: Academic Degree Granted Date (DT)<br> 
 * EDU-6: School (XON)<br> 
 * EDU-7: School Type Code (CWE)<br> 
 * EDU-8: School Address (XAD)<br> 
 * EDU-9: Major Field of Study (CWE)<br> 
 * </p><p>The get...() methods return data from individual fields.  These methods 
 * do not throw exceptions and may therefore have to handle exceptions internally.  
 * If an exception is handled internally, it is logged and null is returned.  
 * This is not expected to happen - if it does happen this indicates not so much 
 * an exceptional circumstance as a bug in the code for this class.</p>    
 */
public class EDU extends AbstractSegment  {

  /**
   * Creates a EDU (Educational Detail) segment object that belongs to the given 
   * message.  
   */
  public EDU(Group parent, ModelClassFactory factory) {
    super(parent, factory);
    Message message = getMessage();
    try {
       this.add(SI.class, true, 1, 60, new Object[]{message}, "Set ID - EDU");
       this.add(IS.class, false, 1, 10, new Object[]{message, new Integer(360)}, "Academic Degree");
       this.add(DR.class, false, 1, 52, new Object[]{message}, "Academic Degree Program Date Range");
       this.add(DR.class, false, 1, 52, new Object[]{message}, "Academic Degree Program Participation Date Range");
       this.add(DT.class, false, 1, 8, new Object[]{message}, "Academic Degree Granted Date");
       this.add(XON.class, false, 1, 250, new Object[]{message}, "School");
       this.add(CWE.class, false, 1, 250, new Object[]{message}, "School Type Code");
       this.add(XAD.class, false, 1, 250, new Object[]{message}, "School Address");
       this.add(CWE.class, false, 0, 250, new Object[]{message}, "Major Field of Study");
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Can't instantiate " + this.getClass().getName(), he);
    }
  }

  /**
   * Returns Set ID - EDU (EDU-1).
   */
  public SI getSetIDEDU()  {
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
   * Returns Set ID - EDU (EDU-1).
   */
  public SI getEdu1_SetIDEDU()  {
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
   * Returns Academic Degree (EDU-2).
   */
  public IS getAcademicDegree()  {
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
   * Returns Academic Degree (EDU-2).
   */
  public IS getEdu2_AcademicDegree()  {
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
   * Returns Academic Degree Program Date Range (EDU-3).
   */
  public DR getAcademicDegreeProgramDateRange()  {
    DR ret = null;
    try {
        Type t = this.getField(3, 0);
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
   * Returns Academic Degree Program Date Range (EDU-3).
   */
  public DR getEdu3_AcademicDegreeProgramDateRange()  {
    DR ret = null;
    try {
        Type t = this.getField(3, 0);
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
   * Returns Academic Degree Program Participation Date Range (EDU-4).
   */
  public DR getAcademicDegreeProgramParticipationDateRange()  {
    DR ret = null;
    try {
        Type t = this.getField(4, 0);
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
   * Returns Academic Degree Program Participation Date Range (EDU-4).
   */
  public DR getEdu4_AcademicDegreeProgramParticipationDateRange()  {
    DR ret = null;
    try {
        Type t = this.getField(4, 0);
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
   * Returns Academic Degree Granted Date (EDU-5).
   */
  public DT getAcademicDegreeGrantedDate()  {
    DT ret = null;
    try {
        Type t = this.getField(5, 0);
        ret = (DT)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns Academic Degree Granted Date (EDU-5).
   */
  public DT getEdu5_AcademicDegreeGrantedDate()  {
    DT ret = null;
    try {
        Type t = this.getField(5, 0);
        ret = (DT)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns School (EDU-6).
   */
  public XON getSchool()  {
    XON ret = null;
    try {
        Type t = this.getField(6, 0);
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
   * Returns School (EDU-6).
   */
  public XON getEdu6_School()  {
    XON ret = null;
    try {
        Type t = this.getField(6, 0);
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
   * Returns School Type Code (EDU-7).
   */
  public CWE getSchoolTypeCode()  {
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
   * Returns School Type Code (EDU-7).
   */
  public CWE getEdu7_SchoolTypeCode()  {
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
   * Returns School Address (EDU-8).
   */
  public XAD getSchoolAddress()  {
    XAD ret = null;
    try {
        Type t = this.getField(8, 0);
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
   * Returns School Address (EDU-8).
   */
  public XAD getEdu8_SchoolAddress()  {
    XAD ret = null;
    try {
        Type t = this.getField(8, 0);
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
   * Returns a single repetition of Major Field of Study (EDU-9).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getMajorFieldOfStudy(int rep) throws HL7Exception {
    CWE ret = null;
    try {
        Type t = this.getField(9, rep);
        ret = (CWE)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Major Field of Study (EDU-9).
   */
  public CWE[] getMajorFieldOfStudy() {
     CWE[] ret = null;
    try {
        Type[] t = this.getField(9);  
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
   * Returns a count of the number of repetitions of Major Field of Study (EDU-9).
   */
  public int getMajorFieldOfStudyReps() {
    try {
        return this.getField(9).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Major Field of Study (EDU-9) at a given index and returns it.
   * @param index The index
   */
  public CWE insertMajorFieldOfStudy(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(9, index);
  }

  /**
   * Removes a repetition of Major Field of Study (EDU-9) at a given index and returns it.
   * @param index The index
   */
  public CWE removeMajorFieldOfStudy(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(9, index);
  }

  /**
   * Returns a single repetition of Major Field of Study (EDU-9).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getEdu9_MajorFieldOfStudy(int rep) throws HL7Exception {
    CWE ret = null;
    try {
        Type t = this.getField(9, rep);
        ret = (CWE)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Major Field of Study (EDU-9).
   */
  public CWE[] getEdu9_MajorFieldOfStudy() {
     CWE[] ret = null;
    try {
        Type[] t = this.getField(9);  
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
   * Returns a count of the number of repetitions of Major Field of Study (EDU-9).
   */
  public int getEdu9_MajorFieldOfStudyReps() {
    try {
        return this.getField(9).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Major Field of Study (EDU-9) at a given index and returns it.
   * @param index The index
   */
  public CWE insertEdu9_MajorFieldOfStudy(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(9, index);
  }

  /**
   * Removes a repetition of Major Field of Study (EDU-9) at a given index and returns it.
   * @param index The index
   */
  public CWE removeEdu9_MajorFieldOfStudy(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(9, index);
  }

   protected Type createNewTypeWithoutReflection(int field) {
      switch (field) {
         case 0: return new ca.uhn.hl7v2.model.v26.datatype.SI(getMessage());
         case 1: return new ca.uhn.hl7v2.model.v26.datatype.IS(getMessage(), new Integer(360));
         case 2: return new ca.uhn.hl7v2.model.v26.datatype.DR(getMessage());
         case 3: return new ca.uhn.hl7v2.model.v26.datatype.DR(getMessage());
         case 4: return new ca.uhn.hl7v2.model.v26.datatype.DT(getMessage());
         case 5: return new ca.uhn.hl7v2.model.v26.datatype.XON(getMessage());
         case 6: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 7: return new ca.uhn.hl7v2.model.v26.datatype.XAD(getMessage());
         case 8: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         default: return null;
      }
   }

}