package ca.uhn.hl7v2.model.v26.segment;

import ca.uhn.hl7v2.model.*;
import ca.uhn.hl7v2.model.v26.datatype.*;
import ca.uhn.log.HapiLogFactory;
import ca.uhn.hl7v2.parser.ModelClassFactory;
import ca.uhn.hl7v2.HL7Exception;

/**
 * <p>Represents an HL7 RDF message segment. 
 * This segment has the following fields:</p><p>
 * RDF-1: Number of Columns per Row (NM)<br> 
 * RDF-2: Column Description (RCD)<br> 
 * </p><p>The get...() methods return data from individual fields.  These methods 
 * do not throw exceptions and may therefore have to handle exceptions internally.  
 * If an exception is handled internally, it is logged and null is returned.  
 * This is not expected to happen - if it does happen this indicates not so much 
 * an exceptional circumstance as a bug in the code for this class.</p>    
 */
public class RDF extends AbstractSegment  {

  /**
   * Creates a RDF (Table Row Definition) segment object that belongs to the given 
   * message.  
   */
  public RDF(Group parent, ModelClassFactory factory) {
    super(parent, factory);
    Message message = getMessage();
    try {
       this.add(NM.class, true, 1, 3, new Object[]{message}, "Number of Columns per Row");
       this.add(RCD.class, true, 0, 40, new Object[]{message}, "Column Description");
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Can't instantiate " + this.getClass().getName(), he);
    }
  }

  /**
   * Returns Number of Columns per Row (RDF-1).
   */
  public NM getNumberOfColumnsPerRow()  {
    NM ret = null;
    try {
        Type t = this.getField(1, 0);
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
   * Returns Number of Columns per Row (RDF-1).
   */
  public NM getRdf1_NumberOfColumnsPerRow()  {
    NM ret = null;
    try {
        Type t = this.getField(1, 0);
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
   * Returns a single repetition of Column Description (RDF-2).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public RCD getColumnDescription(int rep) throws HL7Exception {
    RCD ret = null;
    try {
        Type t = this.getField(2, rep);
        ret = (RCD)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Column Description (RDF-2).
   */
  public RCD[] getColumnDescription() {
     RCD[] ret = null;
    try {
        Type[] t = this.getField(2);  
        ret = new RCD[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (RCD)t[i];
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
   * Returns a count of the number of repetitions of Column Description (RDF-2).
   */
  public int getColumnDescriptionReps() {
    try {
        return this.getField(2).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Column Description (RDF-2) at a given index and returns it.
   * @param index The index
   */
  public RCD insertColumnDescription(int index) throws HL7Exception {
     return (RCD) super.insertRepetition(2, index);
  }

  /**
   * Removes a repetition of Column Description (RDF-2) at a given index and returns it.
   * @param index The index
   */
  public RCD removeColumnDescription(int index) throws HL7Exception {
     return (RCD) super.removeRepetition(2, index);
  }

  /**
   * Returns a single repetition of Column Description (RDF-2).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public RCD getRdf2_ColumnDescription(int rep) throws HL7Exception {
    RCD ret = null;
    try {
        Type t = this.getField(2, rep);
        ret = (RCD)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Column Description (RDF-2).
   */
  public RCD[] getRdf2_ColumnDescription() {
     RCD[] ret = null;
    try {
        Type[] t = this.getField(2);  
        ret = new RCD[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (RCD)t[i];
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
   * Returns a count of the number of repetitions of Column Description (RDF-2).
   */
  public int getRdf2_ColumnDescriptionReps() {
    try {
        return this.getField(2).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Column Description (RDF-2) at a given index and returns it.
   * @param index The index
   */
  public RCD insertRdf2_ColumnDescription(int index) throws HL7Exception {
     return (RCD) super.insertRepetition(2, index);
  }

  /**
   * Removes a repetition of Column Description (RDF-2) at a given index and returns it.
   * @param index The index
   */
  public RCD removeRdf2_ColumnDescription(int index) throws HL7Exception {
     return (RCD) super.removeRepetition(2, index);
  }

   protected Type createNewTypeWithoutReflection(int field) {
      switch (field) {
         case 0: return new ca.uhn.hl7v2.model.v26.datatype.NM(getMessage());
         case 1: return new ca.uhn.hl7v2.model.v26.datatype.RCD(getMessage());
         default: return null;
      }
   }

}