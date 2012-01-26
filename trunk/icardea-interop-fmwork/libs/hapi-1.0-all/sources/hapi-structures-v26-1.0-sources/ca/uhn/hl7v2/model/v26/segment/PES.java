package ca.uhn.hl7v2.model.v26.segment;

import ca.uhn.hl7v2.model.*;
import ca.uhn.hl7v2.model.v26.datatype.*;
import ca.uhn.log.HapiLogFactory;
import ca.uhn.hl7v2.parser.ModelClassFactory;
import ca.uhn.hl7v2.HL7Exception;

/**
 * <p>Represents an HL7 PES message segment. 
 * This segment has the following fields:</p><p>
 * PES-1: Sender Organization Name (XON)<br> 
 * PES-2: Sender Individual Name (XCN)<br> 
 * PES-3: Sender Address (XAD)<br> 
 * PES-4: Sender Telephone (XTN)<br> 
 * PES-5: Sender Event Identifier (EI)<br> 
 * PES-6: Sender Sequence Number (NM)<br> 
 * PES-7: Sender Event Description (FT)<br> 
 * PES-8: Sender Comment (FT)<br> 
 * PES-9: Sender Aware Date/Time (DTM)<br> 
 * PES-10: Event Report Date (DTM)<br> 
 * PES-11: Event Report Timing/Type (ID)<br> 
 * PES-12: Event Report Source (ID)<br> 
 * PES-13: Event Reported To (ID)<br> 
 * </p><p>The get...() methods return data from individual fields.  These methods 
 * do not throw exceptions and may therefore have to handle exceptions internally.  
 * If an exception is handled internally, it is logged and null is returned.  
 * This is not expected to happen - if it does happen this indicates not so much 
 * an exceptional circumstance as a bug in the code for this class.</p>    
 */
public class PES extends AbstractSegment  {

  /**
   * Creates a PES (Product Experience Sender) segment object that belongs to the given 
   * message.  
   */
  public PES(Group parent, ModelClassFactory factory) {
    super(parent, factory);
    Message message = getMessage();
    try {
       this.add(XON.class, false, 0, 567, new Object[]{message}, "Sender Organization Name");
       this.add(XCN.class, false, 0, 3220, new Object[]{message}, "Sender Individual Name");
       this.add(XAD.class, false, 0, 2915, new Object[]{message}, "Sender Address");
       this.add(XTN.class, false, 0, 2743, new Object[]{message}, "Sender Telephone");
       this.add(EI.class, false, 1, 427, new Object[]{message}, "Sender Event Identifier");
       this.add(NM.class, false, 1, 16, new Object[]{message}, "Sender Sequence Number");
       this.add(FT.class, false, 0, 600, new Object[]{message}, "Sender Event Description");
       this.add(FT.class, false, 1, 600, new Object[]{message}, "Sender Comment");
       this.add(DTM.class, false, 1, 24, new Object[]{message}, "Sender Aware Date/Time");
       this.add(DTM.class, true, 1, 24, new Object[]{message}, "Event Report Date");
       this.add(ID.class, false, 2, 3, new Object[]{message, new Integer(234)}, "Event Report Timing/Type");
       this.add(ID.class, false, 1, 1, new Object[]{message, new Integer(235)}, "Event Report Source");
       this.add(ID.class, false, 0, 1, new Object[]{message, new Integer(236)}, "Event Reported To");
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Can't instantiate " + this.getClass().getName(), he);
    }
  }

  /**
   * Returns a single repetition of Sender Organization Name (PES-1).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XON getSenderOrganizationName(int rep) throws HL7Exception {
    XON ret = null;
    try {
        Type t = this.getField(1, rep);
        ret = (XON)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Sender Organization Name (PES-1).
   */
  public XON[] getSenderOrganizationName() {
     XON[] ret = null;
    try {
        Type[] t = this.getField(1);  
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
   * Returns a count of the number of repetitions of Sender Organization Name (PES-1).
   */
  public int getSenderOrganizationNameReps() {
    try {
        return this.getField(1).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Sender Organization Name (PES-1) at a given index and returns it.
   * @param index The index
   */
  public XON insertSenderOrganizationName(int index) throws HL7Exception {
     return (XON) super.insertRepetition(1, index);
  }

  /**
   * Removes a repetition of Sender Organization Name (PES-1) at a given index and returns it.
   * @param index The index
   */
  public XON removeSenderOrganizationName(int index) throws HL7Exception {
     return (XON) super.removeRepetition(1, index);
  }

  /**
   * Returns a single repetition of Sender Organization Name (PES-1).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XON getPes1_SenderOrganizationName(int rep) throws HL7Exception {
    XON ret = null;
    try {
        Type t = this.getField(1, rep);
        ret = (XON)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Sender Organization Name (PES-1).
   */
  public XON[] getPes1_SenderOrganizationName() {
     XON[] ret = null;
    try {
        Type[] t = this.getField(1);  
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
   * Returns a count of the number of repetitions of Sender Organization Name (PES-1).
   */
  public int getPes1_SenderOrganizationNameReps() {
    try {
        return this.getField(1).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Sender Organization Name (PES-1) at a given index and returns it.
   * @param index The index
   */
  public XON insertPes1_SenderOrganizationName(int index) throws HL7Exception {
     return (XON) super.insertRepetition(1, index);
  }

  /**
   * Removes a repetition of Sender Organization Name (PES-1) at a given index and returns it.
   * @param index The index
   */
  public XON removePes1_SenderOrganizationName(int index) throws HL7Exception {
     return (XON) super.removeRepetition(1, index);
  }

  /**
   * Returns a single repetition of Sender Individual Name (PES-2).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XCN getSenderIndividualName(int rep) throws HL7Exception {
    XCN ret = null;
    try {
        Type t = this.getField(2, rep);
        ret = (XCN)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Sender Individual Name (PES-2).
   */
  public XCN[] getSenderIndividualName() {
     XCN[] ret = null;
    try {
        Type[] t = this.getField(2);  
        ret = new XCN[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (XCN)t[i];
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
   * Returns a count of the number of repetitions of Sender Individual Name (PES-2).
   */
  public int getSenderIndividualNameReps() {
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
   * Inserts a repetition of Sender Individual Name (PES-2) at a given index and returns it.
   * @param index The index
   */
  public XCN insertSenderIndividualName(int index) throws HL7Exception {
     return (XCN) super.insertRepetition(2, index);
  }

  /**
   * Removes a repetition of Sender Individual Name (PES-2) at a given index and returns it.
   * @param index The index
   */
  public XCN removeSenderIndividualName(int index) throws HL7Exception {
     return (XCN) super.removeRepetition(2, index);
  }

  /**
   * Returns a single repetition of Sender Individual Name (PES-2).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XCN getPes2_SenderIndividualName(int rep) throws HL7Exception {
    XCN ret = null;
    try {
        Type t = this.getField(2, rep);
        ret = (XCN)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Sender Individual Name (PES-2).
   */
  public XCN[] getPes2_SenderIndividualName() {
     XCN[] ret = null;
    try {
        Type[] t = this.getField(2);  
        ret = new XCN[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (XCN)t[i];
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
   * Returns a count of the number of repetitions of Sender Individual Name (PES-2).
   */
  public int getPes2_SenderIndividualNameReps() {
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
   * Inserts a repetition of Sender Individual Name (PES-2) at a given index and returns it.
   * @param index The index
   */
  public XCN insertPes2_SenderIndividualName(int index) throws HL7Exception {
     return (XCN) super.insertRepetition(2, index);
  }

  /**
   * Removes a repetition of Sender Individual Name (PES-2) at a given index and returns it.
   * @param index The index
   */
  public XCN removePes2_SenderIndividualName(int index) throws HL7Exception {
     return (XCN) super.removeRepetition(2, index);
  }

  /**
   * Returns a single repetition of Sender Address (PES-3).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XAD getSenderAddress(int rep) throws HL7Exception {
    XAD ret = null;
    try {
        Type t = this.getField(3, rep);
        ret = (XAD)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Sender Address (PES-3).
   */
  public XAD[] getSenderAddress() {
     XAD[] ret = null;
    try {
        Type[] t = this.getField(3);  
        ret = new XAD[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (XAD)t[i];
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
   * Returns a count of the number of repetitions of Sender Address (PES-3).
   */
  public int getSenderAddressReps() {
    try {
        return this.getField(3).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Sender Address (PES-3) at a given index and returns it.
   * @param index The index
   */
  public XAD insertSenderAddress(int index) throws HL7Exception {
     return (XAD) super.insertRepetition(3, index);
  }

  /**
   * Removes a repetition of Sender Address (PES-3) at a given index and returns it.
   * @param index The index
   */
  public XAD removeSenderAddress(int index) throws HL7Exception {
     return (XAD) super.removeRepetition(3, index);
  }

  /**
   * Returns a single repetition of Sender Address (PES-3).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XAD getPes3_SenderAddress(int rep) throws HL7Exception {
    XAD ret = null;
    try {
        Type t = this.getField(3, rep);
        ret = (XAD)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Sender Address (PES-3).
   */
  public XAD[] getPes3_SenderAddress() {
     XAD[] ret = null;
    try {
        Type[] t = this.getField(3);  
        ret = new XAD[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (XAD)t[i];
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
   * Returns a count of the number of repetitions of Sender Address (PES-3).
   */
  public int getPes3_SenderAddressReps() {
    try {
        return this.getField(3).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Sender Address (PES-3) at a given index and returns it.
   * @param index The index
   */
  public XAD insertPes3_SenderAddress(int index) throws HL7Exception {
     return (XAD) super.insertRepetition(3, index);
  }

  /**
   * Removes a repetition of Sender Address (PES-3) at a given index and returns it.
   * @param index The index
   */
  public XAD removePes3_SenderAddress(int index) throws HL7Exception {
     return (XAD) super.removeRepetition(3, index);
  }

  /**
   * Returns a single repetition of Sender Telephone (PES-4).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XTN getSenderTelephone(int rep) throws HL7Exception {
    XTN ret = null;
    try {
        Type t = this.getField(4, rep);
        ret = (XTN)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Sender Telephone (PES-4).
   */
  public XTN[] getSenderTelephone() {
     XTN[] ret = null;
    try {
        Type[] t = this.getField(4);  
        ret = new XTN[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (XTN)t[i];
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
   * Returns a count of the number of repetitions of Sender Telephone (PES-4).
   */
  public int getSenderTelephoneReps() {
    try {
        return this.getField(4).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Sender Telephone (PES-4) at a given index and returns it.
   * @param index The index
   */
  public XTN insertSenderTelephone(int index) throws HL7Exception {
     return (XTN) super.insertRepetition(4, index);
  }

  /**
   * Removes a repetition of Sender Telephone (PES-4) at a given index and returns it.
   * @param index The index
   */
  public XTN removeSenderTelephone(int index) throws HL7Exception {
     return (XTN) super.removeRepetition(4, index);
  }

  /**
   * Returns a single repetition of Sender Telephone (PES-4).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public XTN getPes4_SenderTelephone(int rep) throws HL7Exception {
    XTN ret = null;
    try {
        Type t = this.getField(4, rep);
        ret = (XTN)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Sender Telephone (PES-4).
   */
  public XTN[] getPes4_SenderTelephone() {
     XTN[] ret = null;
    try {
        Type[] t = this.getField(4);  
        ret = new XTN[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (XTN)t[i];
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
   * Returns a count of the number of repetitions of Sender Telephone (PES-4).
   */
  public int getPes4_SenderTelephoneReps() {
    try {
        return this.getField(4).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Sender Telephone (PES-4) at a given index and returns it.
   * @param index The index
   */
  public XTN insertPes4_SenderTelephone(int index) throws HL7Exception {
     return (XTN) super.insertRepetition(4, index);
  }

  /**
   * Removes a repetition of Sender Telephone (PES-4) at a given index and returns it.
   * @param index The index
   */
  public XTN removePes4_SenderTelephone(int index) throws HL7Exception {
     return (XTN) super.removeRepetition(4, index);
  }

  /**
   * Returns Sender Event Identifier (PES-5).
   */
  public EI getSenderEventIdentifier()  {
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
   * Returns Sender Event Identifier (PES-5).
   */
  public EI getPes5_SenderEventIdentifier()  {
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
   * Returns Sender Sequence Number (PES-6).
   */
  public NM getSenderSequenceNumber()  {
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
   * Returns Sender Sequence Number (PES-6).
   */
  public NM getPes6_SenderSequenceNumber()  {
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
   * Returns a single repetition of Sender Event Description (PES-7).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public FT getSenderEventDescription(int rep) throws HL7Exception {
    FT ret = null;
    try {
        Type t = this.getField(7, rep);
        ret = (FT)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Sender Event Description (PES-7).
   */
  public FT[] getSenderEventDescription() {
     FT[] ret = null;
    try {
        Type[] t = this.getField(7);  
        ret = new FT[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (FT)t[i];
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
   * Returns a count of the number of repetitions of Sender Event Description (PES-7).
   */
  public int getSenderEventDescriptionReps() {
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
   * Inserts a repetition of Sender Event Description (PES-7) at a given index and returns it.
   * @param index The index
   */
  public FT insertSenderEventDescription(int index) throws HL7Exception {
     return (FT) super.insertRepetition(7, index);
  }

  /**
   * Removes a repetition of Sender Event Description (PES-7) at a given index and returns it.
   * @param index The index
   */
  public FT removeSenderEventDescription(int index) throws HL7Exception {
     return (FT) super.removeRepetition(7, index);
  }

  /**
   * Returns a single repetition of Sender Event Description (PES-7).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public FT getPes7_SenderEventDescription(int rep) throws HL7Exception {
    FT ret = null;
    try {
        Type t = this.getField(7, rep);
        ret = (FT)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Sender Event Description (PES-7).
   */
  public FT[] getPes7_SenderEventDescription() {
     FT[] ret = null;
    try {
        Type[] t = this.getField(7);  
        ret = new FT[t.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (FT)t[i];
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
   * Returns a count of the number of repetitions of Sender Event Description (PES-7).
   */
  public int getPes7_SenderEventDescriptionReps() {
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
   * Inserts a repetition of Sender Event Description (PES-7) at a given index and returns it.
   * @param index The index
   */
  public FT insertPes7_SenderEventDescription(int index) throws HL7Exception {
     return (FT) super.insertRepetition(7, index);
  }

  /**
   * Removes a repetition of Sender Event Description (PES-7) at a given index and returns it.
   * @param index The index
   */
  public FT removePes7_SenderEventDescription(int index) throws HL7Exception {
     return (FT) super.removeRepetition(7, index);
  }

  /**
   * Returns Sender Comment (PES-8).
   */
  public FT getSenderComment()  {
    FT ret = null;
    try {
        Type t = this.getField(8, 0);
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
   * Returns Sender Comment (PES-8).
   */
  public FT getPes8_SenderComment()  {
    FT ret = null;
    try {
        Type t = this.getField(8, 0);
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
   * Returns Sender Aware Date/Time (PES-9).
   */
  public DTM getSenderAwareDateTime()  {
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
   * Returns Sender Aware Date/Time (PES-9).
   */
  public DTM getPes9_SenderAwareDateTime()  {
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
   * Returns Event Report Date (PES-10).
   */
  public DTM getEventReportDate()  {
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
   * Returns Event Report Date (PES-10).
   */
  public DTM getPes10_EventReportDate()  {
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
   * Returns a single repetition of Event Report Timing/Type (PES-11).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public ID getEventReportTimingType(int rep) throws HL7Exception {
    ID ret = null;
    try {
        Type t = this.getField(11, rep);
        ret = (ID)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Event Report Timing/Type (PES-11).
   */
  public ID[] getEventReportTimingType() {
     ID[] ret = null;
    try {
        Type[] t = this.getField(11);  
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
   * Returns a count of the number of repetitions of Event Report Timing/Type (PES-11).
   */
  public int getEventReportTimingTypeReps() {
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
   * Inserts a repetition of Event Report Timing/Type (PES-11) at a given index and returns it.
   * @param index The index
   */
  public ID insertEventReportTimingType(int index) throws HL7Exception {
     return (ID) super.insertRepetition(11, index);
  }

  /**
   * Removes a repetition of Event Report Timing/Type (PES-11) at a given index and returns it.
   * @param index The index
   */
  public ID removeEventReportTimingType(int index) throws HL7Exception {
     return (ID) super.removeRepetition(11, index);
  }

  /**
   * Returns a single repetition of Event Report Timing/Type (PES-11).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public ID getPes11_EventReportTimingType(int rep) throws HL7Exception {
    ID ret = null;
    try {
        Type t = this.getField(11, rep);
        ret = (ID)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Event Report Timing/Type (PES-11).
   */
  public ID[] getPes11_EventReportTimingType() {
     ID[] ret = null;
    try {
        Type[] t = this.getField(11);  
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
   * Returns a count of the number of repetitions of Event Report Timing/Type (PES-11).
   */
  public int getPes11_EventReportTimingTypeReps() {
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
   * Inserts a repetition of Event Report Timing/Type (PES-11) at a given index and returns it.
   * @param index The index
   */
  public ID insertPes11_EventReportTimingType(int index) throws HL7Exception {
     return (ID) super.insertRepetition(11, index);
  }

  /**
   * Removes a repetition of Event Report Timing/Type (PES-11) at a given index and returns it.
   * @param index The index
   */
  public ID removePes11_EventReportTimingType(int index) throws HL7Exception {
     return (ID) super.removeRepetition(11, index);
  }

  /**
   * Returns Event Report Source (PES-12).
   */
  public ID getEventReportSource()  {
    ID ret = null;
    try {
        Type t = this.getField(12, 0);
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
   * Returns Event Report Source (PES-12).
   */
  public ID getPes12_EventReportSource()  {
    ID ret = null;
    try {
        Type t = this.getField(12, 0);
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
   * Returns a single repetition of Event Reported To (PES-13).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public ID getEventReportedTo(int rep) throws HL7Exception {
    ID ret = null;
    try {
        Type t = this.getField(13, rep);
        ret = (ID)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Event Reported To (PES-13).
   */
  public ID[] getEventReportedTo() {
     ID[] ret = null;
    try {
        Type[] t = this.getField(13);  
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
   * Returns a count of the number of repetitions of Event Reported To (PES-13).
   */
  public int getEventReportedToReps() {
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
   * Inserts a repetition of Event Reported To (PES-13) at a given index and returns it.
   * @param index The index
   */
  public ID insertEventReportedTo(int index) throws HL7Exception {
     return (ID) super.insertRepetition(13, index);
  }

  /**
   * Removes a repetition of Event Reported To (PES-13) at a given index and returns it.
   * @param index The index
   */
  public ID removeEventReportedTo(int index) throws HL7Exception {
     return (ID) super.removeRepetition(13, index);
  }

  /**
   * Returns a single repetition of Event Reported To (PES-13).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public ID getPes13_EventReportedTo(int rep) throws HL7Exception {
    ID ret = null;
    try {
        Type t = this.getField(13, rep);
        ret = (ID)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Event Reported To (PES-13).
   */
  public ID[] getPes13_EventReportedTo() {
     ID[] ret = null;
    try {
        Type[] t = this.getField(13);  
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
   * Returns a count of the number of repetitions of Event Reported To (PES-13).
   */
  public int getPes13_EventReportedToReps() {
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
   * Inserts a repetition of Event Reported To (PES-13) at a given index and returns it.
   * @param index The index
   */
  public ID insertPes13_EventReportedTo(int index) throws HL7Exception {
     return (ID) super.insertRepetition(13, index);
  }

  /**
   * Removes a repetition of Event Reported To (PES-13) at a given index and returns it.
   * @param index The index
   */
  public ID removePes13_EventReportedTo(int index) throws HL7Exception {
     return (ID) super.removeRepetition(13, index);
  }

   protected Type createNewTypeWithoutReflection(int field) {
      switch (field) {
         case 0: return new ca.uhn.hl7v2.model.v26.datatype.XON(getMessage());
         case 1: return new ca.uhn.hl7v2.model.v26.datatype.XCN(getMessage());
         case 2: return new ca.uhn.hl7v2.model.v26.datatype.XAD(getMessage());
         case 3: return new ca.uhn.hl7v2.model.v26.datatype.XTN(getMessage());
         case 4: return new ca.uhn.hl7v2.model.v26.datatype.EI(getMessage());
         case 5: return new ca.uhn.hl7v2.model.v26.datatype.NM(getMessage());
         case 6: return new ca.uhn.hl7v2.model.v26.datatype.FT(getMessage());
         case 7: return new ca.uhn.hl7v2.model.v26.datatype.FT(getMessage());
         case 8: return new ca.uhn.hl7v2.model.v26.datatype.DTM(getMessage());
         case 9: return new ca.uhn.hl7v2.model.v26.datatype.DTM(getMessage());
         case 10: return new ca.uhn.hl7v2.model.v26.datatype.ID(getMessage(), new Integer(234));
         case 11: return new ca.uhn.hl7v2.model.v26.datatype.ID(getMessage(), new Integer(235));
         case 12: return new ca.uhn.hl7v2.model.v26.datatype.ID(getMessage(), new Integer(236));
         default: return null;
      }
   }

}