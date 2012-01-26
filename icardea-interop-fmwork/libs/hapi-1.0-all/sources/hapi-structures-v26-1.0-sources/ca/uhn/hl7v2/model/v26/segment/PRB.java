package ca.uhn.hl7v2.model.v26.segment;

import ca.uhn.hl7v2.model.*;
import ca.uhn.hl7v2.model.v26.datatype.*;
import ca.uhn.log.HapiLogFactory;
import ca.uhn.hl7v2.parser.ModelClassFactory;
import ca.uhn.hl7v2.HL7Exception;

/**
 * <p>Represents an HL7 PRB message segment. 
 * This segment has the following fields:</p><p>
 * PRB-1: Action Code (ID)<br> 
 * PRB-2: Action Date/Time (DTM)<br> 
 * PRB-3: Problem ID (CWE)<br> 
 * PRB-4: Problem Instance ID (EI)<br> 
 * PRB-5: Episode of Care ID (EI)<br> 
 * PRB-6: Problem List Priority (NM)<br> 
 * PRB-7: Problem Established Date/Time (DTM)<br> 
 * PRB-8: Anticipated Problem Resolution Date/Time (DTM)<br> 
 * PRB-9: Actual Problem Resolution Date/Time (DTM)<br> 
 * PRB-10: Problem Classification (CWE)<br> 
 * PRB-11: Problem Management Discipline (CWE)<br> 
 * PRB-12: Problem Persistence (CWE)<br> 
 * PRB-13: Problem Confirmation Status (CWE)<br> 
 * PRB-14: Problem Life Cycle Status (CWE)<br> 
 * PRB-15: Problem Life Cycle Status Date/Time (DTM)<br> 
 * PRB-16: Problem Date of Onset (DTM)<br> 
 * PRB-17: Problem Onset Text (ST)<br> 
 * PRB-18: Problem Ranking (CWE)<br> 
 * PRB-19: Certainty of Problem (CWE)<br> 
 * PRB-20: Probability of Problem (0-1) (NM)<br> 
 * PRB-21: Individual Awareness of Problem (CWE)<br> 
 * PRB-22: Problem Prognosis (CWE)<br> 
 * PRB-23: Individual Awareness of Prognosis (CWE)<br> 
 * PRB-24: Family/Significant Other Awareness of Problem/Prognosis (ST)<br> 
 * PRB-25: Security/Sensitivity (CWE)<br> 
 * PRB-26: Problem Severity (CWE)<br> 
 * PRB-27: Problem Perspective (CWE)<br> 
 * PRB-28: Mood Code (CNE)<br> 
 * </p><p>The get...() methods return data from individual fields.  These methods 
 * do not throw exceptions and may therefore have to handle exceptions internally.  
 * If an exception is handled internally, it is logged and null is returned.  
 * This is not expected to happen - if it does happen this indicates not so much 
 * an exceptional circumstance as a bug in the code for this class.</p>    
 */
public class PRB extends AbstractSegment  {

  /**
   * Creates a PRB (Problem Details) segment object that belongs to the given 
   * message.  
   */
  public PRB(Group parent, ModelClassFactory factory) {
    super(parent, factory);
    Message message = getMessage();
    try {
       this.add(ID.class, true, 1, 2, new Object[]{message, new Integer(287)}, "Action Code");
       this.add(DTM.class, true, 1, 24, new Object[]{message}, "Action Date/Time");
       this.add(CWE.class, true, 1, 705, new Object[]{message}, "Problem ID");
       this.add(EI.class, true, 1, 60, new Object[]{message}, "Problem Instance ID");
       this.add(EI.class, false, 1, 60, new Object[]{message}, "Episode of Care ID");
       this.add(NM.class, false, 1, 60, new Object[]{message}, "Problem List Priority");
       this.add(DTM.class, false, 1, 24, new Object[]{message}, "Problem Established Date/Time");
       this.add(DTM.class, false, 1, 24, new Object[]{message}, "Anticipated Problem Resolution Date/Time");
       this.add(DTM.class, false, 1, 24, new Object[]{message}, "Actual Problem Resolution Date/Time");
       this.add(CWE.class, false, 1, 705, new Object[]{message}, "Problem Classification");
       this.add(CWE.class, false, 0, 705, new Object[]{message}, "Problem Management Discipline");
       this.add(CWE.class, false, 1, 705, new Object[]{message}, "Problem Persistence");
       this.add(CWE.class, false, 1, 705, new Object[]{message}, "Problem Confirmation Status");
       this.add(CWE.class, false, 1, 705, new Object[]{message}, "Problem Life Cycle Status");
       this.add(DTM.class, false, 1, 24, new Object[]{message}, "Problem Life Cycle Status Date/Time");
       this.add(DTM.class, false, 1, 24, new Object[]{message}, "Problem Date of Onset");
       this.add(ST.class, false, 1, 80, new Object[]{message}, "Problem Onset Text");
       this.add(CWE.class, false, 1, 705, new Object[]{message}, "Problem Ranking");
       this.add(CWE.class, false, 1, 705, new Object[]{message}, "Certainty of Problem");
       this.add(NM.class, false, 1, 5, new Object[]{message}, "Probability of Problem (0-1)");
       this.add(CWE.class, false, 1, 705, new Object[]{message}, "Individual Awareness of Problem");
       this.add(CWE.class, false, 1, 705, new Object[]{message}, "Problem Prognosis");
       this.add(CWE.class, false, 1, 705, new Object[]{message}, "Individual Awareness of Prognosis");
       this.add(ST.class, false, 1, 200, new Object[]{message}, "Family/Significant Other Awareness of Problem/Prognosis");
       this.add(CWE.class, false, 1, 705, new Object[]{message}, "Security/Sensitivity");
       this.add(CWE.class, false, 1, 705, new Object[]{message}, "Problem Severity");
       this.add(CWE.class, false, 1, 705, new Object[]{message}, "Problem Perspective");
       this.add(CNE.class, false, 1, 60, new Object[]{message}, "Mood Code");
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Can't instantiate " + this.getClass().getName(), he);
    }
  }

  /**
   * Returns Action Code (PRB-1).
   */
  public ID getActionCode()  {
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
   * Returns Action Code (PRB-1).
   */
  public ID getPrb1_ActionCode()  {
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
   * Returns Action Date/Time (PRB-2).
   */
  public DTM getActionDateTime()  {
    DTM ret = null;
    try {
        Type t = this.getField(2, 0);
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
   * Returns Action Date/Time (PRB-2).
   */
  public DTM getPrb2_ActionDateTime()  {
    DTM ret = null;
    try {
        Type t = this.getField(2, 0);
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
   * Returns Problem ID (PRB-3).
   */
  public CWE getProblemID()  {
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
   * Returns Problem ID (PRB-3).
   */
  public CWE getPrb3_ProblemID()  {
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
   * Returns Problem Instance ID (PRB-4).
   */
  public EI getProblemInstanceID()  {
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
   * Returns Problem Instance ID (PRB-4).
   */
  public EI getPrb4_ProblemInstanceID()  {
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
   * Returns Episode of Care ID (PRB-5).
   */
  public EI getEpisodeOfCareID()  {
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
   * Returns Episode of Care ID (PRB-5).
   */
  public EI getPrb5_EpisodeOfCareID()  {
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
   * Returns Problem List Priority (PRB-6).
   */
  public NM getProblemListPriority()  {
    NM ret = null;
    try {
        Type t = this.getField(6, 0);
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
   * Returns Problem List Priority (PRB-6).
   */
  public NM getPrb6_ProblemListPriority()  {
    NM ret = null;
    try {
        Type t = this.getField(6, 0);
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
   * Returns Problem Established Date/Time (PRB-7).
   */
  public DTM getProblemEstablishedDateTime()  {
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
   * Returns Problem Established Date/Time (PRB-7).
   */
  public DTM getPrb7_ProblemEstablishedDateTime()  {
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
   * Returns Anticipated Problem Resolution Date/Time (PRB-8).
   */
  public DTM getAnticipatedProblemResolutionDateTime()  {
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
   * Returns Anticipated Problem Resolution Date/Time (PRB-8).
   */
  public DTM getPrb8_AnticipatedProblemResolutionDateTime()  {
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
   * Returns Actual Problem Resolution Date/Time (PRB-9).
   */
  public DTM getActualProblemResolutionDateTime()  {
    DTM ret = null;
    try {
        Type t = this.getField(9, 0);
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
   * Returns Actual Problem Resolution Date/Time (PRB-9).
   */
  public DTM getPrb9_ActualProblemResolutionDateTime()  {
    DTM ret = null;
    try {
        Type t = this.getField(9, 0);
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
   * Returns Problem Classification (PRB-10).
   */
  public CWE getProblemClassification()  {
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
   * Returns Problem Classification (PRB-10).
   */
  public CWE getPrb10_ProblemClassification()  {
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
   * Returns a single repetition of Problem Management Discipline (PRB-11).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getProblemManagementDiscipline(int rep) throws HL7Exception {
    CWE ret = null;
    try {
        Type t = this.getField(11, rep);
        ret = (CWE)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Problem Management Discipline (PRB-11).
   */
  public CWE[] getProblemManagementDiscipline() {
     CWE[] ret = null;
    try {
        Type[] t = this.getField(11);  
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
   * Returns a count of the number of repetitions of Problem Management Discipline (PRB-11).
   */
  public int getProblemManagementDisciplineReps() {
    try {
        return this.getField(11).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Problem Management Discipline (PRB-11) at a given index and returns it.
   * @param index The index
   */
  public CWE insertProblemManagementDiscipline(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(11, index);
  }

  /**
   * Removes a repetition of Problem Management Discipline (PRB-11) at a given index and returns it.
   * @param index The index
   */
  public CWE removeProblemManagementDiscipline(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(11, index);
  }

  /**
   * Returns a single repetition of Problem Management Discipline (PRB-11).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getPrb11_ProblemManagementDiscipline(int rep) throws HL7Exception {
    CWE ret = null;
    try {
        Type t = this.getField(11, rep);
        ret = (CWE)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Problem Management Discipline (PRB-11).
   */
  public CWE[] getPrb11_ProblemManagementDiscipline() {
     CWE[] ret = null;
    try {
        Type[] t = this.getField(11);  
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
   * Returns a count of the number of repetitions of Problem Management Discipline (PRB-11).
   */
  public int getPrb11_ProblemManagementDisciplineReps() {
    try {
        return this.getField(11).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Problem Management Discipline (PRB-11) at a given index and returns it.
   * @param index The index
   */
  public CWE insertPrb11_ProblemManagementDiscipline(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(11, index);
  }

  /**
   * Removes a repetition of Problem Management Discipline (PRB-11) at a given index and returns it.
   * @param index The index
   */
  public CWE removePrb11_ProblemManagementDiscipline(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(11, index);
  }

  /**
   * Returns Problem Persistence (PRB-12).
   */
  public CWE getProblemPersistence()  {
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
   * Returns Problem Persistence (PRB-12).
   */
  public CWE getPrb12_ProblemPersistence()  {
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
   * Returns Problem Confirmation Status (PRB-13).
   */
  public CWE getProblemConfirmationStatus()  {
    CWE ret = null;
    try {
        Type t = this.getField(13, 0);
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
   * Returns Problem Confirmation Status (PRB-13).
   */
  public CWE getPrb13_ProblemConfirmationStatus()  {
    CWE ret = null;
    try {
        Type t = this.getField(13, 0);
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
   * Returns Problem Life Cycle Status (PRB-14).
   */
  public CWE getProblemLifeCycleStatus()  {
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
   * Returns Problem Life Cycle Status (PRB-14).
   */
  public CWE getPrb14_ProblemLifeCycleStatus()  {
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
   * Returns Problem Life Cycle Status Date/Time (PRB-15).
   */
  public DTM getProblemLifeCycleStatusDateTime()  {
    DTM ret = null;
    try {
        Type t = this.getField(15, 0);
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
   * Returns Problem Life Cycle Status Date/Time (PRB-15).
   */
  public DTM getPrb15_ProblemLifeCycleStatusDateTime()  {
    DTM ret = null;
    try {
        Type t = this.getField(15, 0);
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
   * Returns Problem Date of Onset (PRB-16).
   */
  public DTM getProblemDateOfOnset()  {
    DTM ret = null;
    try {
        Type t = this.getField(16, 0);
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
   * Returns Problem Date of Onset (PRB-16).
   */
  public DTM getPrb16_ProblemDateOfOnset()  {
    DTM ret = null;
    try {
        Type t = this.getField(16, 0);
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
   * Returns Problem Onset Text (PRB-17).
   */
  public ST getProblemOnsetText()  {
    ST ret = null;
    try {
        Type t = this.getField(17, 0);
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
   * Returns Problem Onset Text (PRB-17).
   */
  public ST getPrb17_ProblemOnsetText()  {
    ST ret = null;
    try {
        Type t = this.getField(17, 0);
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
   * Returns Problem Ranking (PRB-18).
   */
  public CWE getProblemRanking()  {
    CWE ret = null;
    try {
        Type t = this.getField(18, 0);
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
   * Returns Problem Ranking (PRB-18).
   */
  public CWE getPrb18_ProblemRanking()  {
    CWE ret = null;
    try {
        Type t = this.getField(18, 0);
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
   * Returns Certainty of Problem (PRB-19).
   */
  public CWE getCertaintyOfProblem()  {
    CWE ret = null;
    try {
        Type t = this.getField(19, 0);
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
   * Returns Certainty of Problem (PRB-19).
   */
  public CWE getPrb19_CertaintyOfProblem()  {
    CWE ret = null;
    try {
        Type t = this.getField(19, 0);
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
   * Returns Probability of Problem (0-1) (PRB-20).
   */
  public NM getProbabilityOfProblem()  {
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
   * Returns Probability of Problem (0-1) (PRB-20).
   */
  public NM getPrb20_ProbabilityOfProblem()  {
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
   * Returns Individual Awareness of Problem (PRB-21).
   */
  public CWE getIndividualAwarenessOfProblem()  {
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
   * Returns Individual Awareness of Problem (PRB-21).
   */
  public CWE getPrb21_IndividualAwarenessOfProblem()  {
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
   * Returns Problem Prognosis (PRB-22).
   */
  public CWE getProblemPrognosis()  {
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
   * Returns Problem Prognosis (PRB-22).
   */
  public CWE getPrb22_ProblemPrognosis()  {
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
   * Returns Individual Awareness of Prognosis (PRB-23).
   */
  public CWE getIndividualAwarenessOfPrognosis()  {
    CWE ret = null;
    try {
        Type t = this.getField(23, 0);
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
   * Returns Individual Awareness of Prognosis (PRB-23).
   */
  public CWE getPrb23_IndividualAwarenessOfPrognosis()  {
    CWE ret = null;
    try {
        Type t = this.getField(23, 0);
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
   * Returns Family/Significant Other Awareness of Problem/Prognosis (PRB-24).
   */
  public ST getFamilySignificantOtherAwarenessOfProblemPrognosis()  {
    ST ret = null;
    try {
        Type t = this.getField(24, 0);
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
   * Returns Family/Significant Other Awareness of Problem/Prognosis (PRB-24).
   */
  public ST getPrb24_FamilySignificantOtherAwarenessOfProblemPrognosis()  {
    ST ret = null;
    try {
        Type t = this.getField(24, 0);
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
   * Returns Security/Sensitivity (PRB-25).
   */
  public CWE getSecuritySensitivity()  {
    CWE ret = null;
    try {
        Type t = this.getField(25, 0);
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
   * Returns Security/Sensitivity (PRB-25).
   */
  public CWE getPrb25_SecuritySensitivity()  {
    CWE ret = null;
    try {
        Type t = this.getField(25, 0);
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
   * Returns Problem Severity (PRB-26).
   */
  public CWE getProblemSeverity()  {
    CWE ret = null;
    try {
        Type t = this.getField(26, 0);
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
   * Returns Problem Severity (PRB-26).
   */
  public CWE getPrb26_ProblemSeverity()  {
    CWE ret = null;
    try {
        Type t = this.getField(26, 0);
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
   * Returns Problem Perspective (PRB-27).
   */
  public CWE getProblemPerspective()  {
    CWE ret = null;
    try {
        Type t = this.getField(27, 0);
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
   * Returns Problem Perspective (PRB-27).
   */
  public CWE getPrb27_ProblemPerspective()  {
    CWE ret = null;
    try {
        Type t = this.getField(27, 0);
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
   * Returns Mood Code (PRB-28).
   */
  public CNE getMoodCode()  {
    CNE ret = null;
    try {
        Type t = this.getField(28, 0);
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
   * Returns Mood Code (PRB-28).
   */
  public CNE getPrb28_MoodCode()  {
    CNE ret = null;
    try {
        Type t = this.getField(28, 0);
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
         case 0: return new ca.uhn.hl7v2.model.v26.datatype.ID(getMessage(), new Integer(287));
         case 1: return new ca.uhn.hl7v2.model.v26.datatype.DTM(getMessage());
         case 2: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 3: return new ca.uhn.hl7v2.model.v26.datatype.EI(getMessage());
         case 4: return new ca.uhn.hl7v2.model.v26.datatype.EI(getMessage());
         case 5: return new ca.uhn.hl7v2.model.v26.datatype.NM(getMessage());
         case 6: return new ca.uhn.hl7v2.model.v26.datatype.DTM(getMessage());
         case 7: return new ca.uhn.hl7v2.model.v26.datatype.DTM(getMessage());
         case 8: return new ca.uhn.hl7v2.model.v26.datatype.DTM(getMessage());
         case 9: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 10: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 11: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 12: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 13: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 14: return new ca.uhn.hl7v2.model.v26.datatype.DTM(getMessage());
         case 15: return new ca.uhn.hl7v2.model.v26.datatype.DTM(getMessage());
         case 16: return new ca.uhn.hl7v2.model.v26.datatype.ST(getMessage());
         case 17: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 18: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 19: return new ca.uhn.hl7v2.model.v26.datatype.NM(getMessage());
         case 20: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 21: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 22: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 23: return new ca.uhn.hl7v2.model.v26.datatype.ST(getMessage());
         case 24: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 25: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 26: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 27: return new ca.uhn.hl7v2.model.v26.datatype.CNE(getMessage());
         default: return null;
      }
   }

}