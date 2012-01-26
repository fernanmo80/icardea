package ca.uhn.hl7v2.model.v26.segment;

import ca.uhn.hl7v2.model.*;
import ca.uhn.hl7v2.model.v26.datatype.*;
import ca.uhn.log.HapiLogFactory;
import ca.uhn.hl7v2.parser.ModelClassFactory;
import ca.uhn.hl7v2.HL7Exception;

/**
 * <p>Represents an HL7 SAC message segment. 
 * This segment has the following fields:</p><p>
 * SAC-1: External Accession Identifier (EI)<br> 
 * SAC-2: Accession Identifier (EI)<br> 
 * SAC-3: Container Identifier (EI)<br> 
 * SAC-4: Primary (Parent) Container Identifier (EI)<br> 
 * SAC-5: Equipment Container Identifier (EI)<br> 
 * SAC-6: Specimen Source (SPS)<br> 
 * SAC-7: Registration Date/Time (DTM)<br> 
 * SAC-8: Container Status (CWE)<br> 
 * SAC-9: Carrier Type (CWE)<br> 
 * SAC-10: Carrier Identifier (EI)<br> 
 * SAC-11: Position in Carrier (NA)<br> 
 * SAC-12: Tray Type - SAC (CWE)<br> 
 * SAC-13: Tray Identifier (EI)<br> 
 * SAC-14: Position in Tray (NA)<br> 
 * SAC-15: Location (CWE)<br> 
 * SAC-16: Container Height (NM)<br> 
 * SAC-17: Container Diameter (NM)<br> 
 * SAC-18: Barrier Delta (NM)<br> 
 * SAC-19: Bottom Delta (NM)<br> 
 * SAC-20: Container Height/Diameter/Delta Units (CWE)<br> 
 * SAC-21: Container Volume (NM)<br> 
 * SAC-22: Available Specimen Volume (NM)<br> 
 * SAC-23: Initial Specimen Volume (NM)<br> 
 * SAC-24: Volume Units (CWE)<br> 
 * SAC-25: Separator Type (CWE)<br> 
 * SAC-26: Cap Type (CWE)<br> 
 * SAC-27: Additive (CWE)<br> 
 * SAC-28: Specimen Component (CWE)<br> 
 * SAC-29: Dilution Factor (SN)<br> 
 * SAC-30: Treatment (CWE)<br> 
 * SAC-31: Temperature (SN)<br> 
 * SAC-32: Hemolysis Index (NM)<br> 
 * SAC-33: Hemolysis Index Units (CWE)<br> 
 * SAC-34: Lipemia Index (NM)<br> 
 * SAC-35: Lipemia Index Units (CWE)<br> 
 * SAC-36: Icterus Index (NM)<br> 
 * SAC-37: Icterus Index Units (CWE)<br> 
 * SAC-38: Fibrin Index (NM)<br> 
 * SAC-39: Fibrin Index Units (CWE)<br> 
 * SAC-40: System Induced Contaminants (CWE)<br> 
 * SAC-41: Drug Interference (CWE)<br> 
 * SAC-42: Artificial Blood (CWE)<br> 
 * SAC-43: Special Handling Code (CWE)<br> 
 * SAC-44: Other Environmental Factors (CWE)<br> 
 * </p><p>The get...() methods return data from individual fields.  These methods 
 * do not throw exceptions and may therefore have to handle exceptions internally.  
 * If an exception is handled internally, it is logged and null is returned.  
 * This is not expected to happen - if it does happen this indicates not so much 
 * an exceptional circumstance as a bug in the code for this class.</p>    
 */
public class SAC extends AbstractSegment  {

  /**
   * Creates a SAC (Specimen Container detail) segment object that belongs to the given 
   * message.  
   */
  public SAC(Group parent, ModelClassFactory factory) {
    super(parent, factory);
    Message message = getMessage();
    try {
       this.add(EI.class, false, 1, 427, new Object[]{message}, "External Accession Identifier");
       this.add(EI.class, false, 1, 427, new Object[]{message}, "Accession Identifier");
       this.add(EI.class, false, 1, 427, new Object[]{message}, "Container Identifier");
       this.add(EI.class, false, 1, 427, new Object[]{message}, "Primary (Parent) Container Identifier");
       this.add(EI.class, false, 1, 427, new Object[]{message}, "Equipment Container Identifier");
       this.add(SPS.class, false, 1, 0, new Object[]{message}, "Specimen Source");
       this.add(DTM.class, false, 1, 24, new Object[]{message}, "Registration Date/Time");
       this.add(CWE.class, false, 1, 705, new Object[]{message}, "Container Status");
       this.add(CWE.class, false, 1, 705, new Object[]{message}, "Carrier Type");
       this.add(EI.class, false, 1, 705, new Object[]{message}, "Carrier Identifier");
       this.add(NA.class, false, 1, 80, new Object[]{message}, "Position in Carrier");
       this.add(CWE.class, false, 1, 705, new Object[]{message}, "Tray Type - SAC");
       this.add(EI.class, false, 1, 427, new Object[]{message}, "Tray Identifier");
       this.add(NA.class, false, 1, 80, new Object[]{message}, "Position in Tray");
       this.add(CWE.class, false, 0, 705, new Object[]{message}, "Location");
       this.add(NM.class, false, 1, 20, new Object[]{message}, "Container Height");
       this.add(NM.class, false, 1, 20, new Object[]{message}, "Container Diameter");
       this.add(NM.class, false, 1, 20, new Object[]{message}, "Barrier Delta");
       this.add(NM.class, false, 1, 20, new Object[]{message}, "Bottom Delta");
       this.add(CWE.class, false, 1, 705, new Object[]{message}, "Container Height/Diameter/Delta Units");
       this.add(NM.class, false, 1, 20, new Object[]{message}, "Container Volume");
       this.add(NM.class, false, 1, 20, new Object[]{message}, "Available Specimen Volume");
       this.add(NM.class, false, 1, 20, new Object[]{message}, "Initial Specimen Volume");
       this.add(CWE.class, false, 1, 705, new Object[]{message}, "Volume Units");
       this.add(CWE.class, false, 1, 705, new Object[]{message}, "Separator Type");
       this.add(CWE.class, false, 1, 705, new Object[]{message}, "Cap Type");
       this.add(CWE.class, false, 0, 705, new Object[]{message}, "Additive");
       this.add(CWE.class, false, 1, 705, new Object[]{message}, "Specimen Component");
       this.add(SN.class, false, 1, 36, new Object[]{message}, "Dilution Factor");
       this.add(CWE.class, false, 1, 705, new Object[]{message}, "Treatment");
       this.add(SN.class, false, 1, 36, new Object[]{message}, "Temperature");
       this.add(NM.class, false, 1, 20, new Object[]{message}, "Hemolysis Index");
       this.add(CWE.class, false, 1, 705, new Object[]{message}, "Hemolysis Index Units");
       this.add(NM.class, false, 1, 20, new Object[]{message}, "Lipemia Index");
       this.add(CWE.class, false, 1, 705, new Object[]{message}, "Lipemia Index Units");
       this.add(NM.class, false, 1, 20, new Object[]{message}, "Icterus Index");
       this.add(CWE.class, false, 1, 705, new Object[]{message}, "Icterus Index Units");
       this.add(NM.class, false, 1, 20, new Object[]{message}, "Fibrin Index");
       this.add(CWE.class, false, 1, 705, new Object[]{message}, "Fibrin Index Units");
       this.add(CWE.class, false, 0, 705, new Object[]{message}, "System Induced Contaminants");
       this.add(CWE.class, false, 0, 705, new Object[]{message}, "Drug Interference");
       this.add(CWE.class, false, 1, 705, new Object[]{message}, "Artificial Blood");
       this.add(CWE.class, false, 0, 705, new Object[]{message}, "Special Handling Code");
       this.add(CWE.class, false, 0, 705, new Object[]{message}, "Other Environmental Factors");
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Can't instantiate " + this.getClass().getName(), he);
    }
  }

  /**
   * Returns External Accession Identifier (SAC-1).
   */
  public EI getExternalAccessionIdentifier()  {
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
   * Returns External Accession Identifier (SAC-1).
   */
  public EI getSac1_ExternalAccessionIdentifier()  {
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
   * Returns Accession Identifier (SAC-2).
   */
  public EI getAccessionIdentifier()  {
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
   * Returns Accession Identifier (SAC-2).
   */
  public EI getSac2_AccessionIdentifier()  {
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
   * Returns Container Identifier (SAC-3).
   */
  public EI getContainerIdentifier()  {
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
   * Returns Container Identifier (SAC-3).
   */
  public EI getSac3_ContainerIdentifier()  {
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
   * Returns Primary (Parent) Container Identifier (SAC-4).
   */
  public EI getPrimaryParentContainerIdentifier()  {
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
   * Returns Primary (Parent) Container Identifier (SAC-4).
   */
  public EI getSac4_PrimaryParentContainerIdentifier()  {
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
   * Returns Equipment Container Identifier (SAC-5).
   */
  public EI getEquipmentContainerIdentifier()  {
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
   * Returns Equipment Container Identifier (SAC-5).
   */
  public EI getSac5_EquipmentContainerIdentifier()  {
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
   * Returns Specimen Source (SAC-6).
   */
  public SPS getSpecimenSource()  {
    SPS ret = null;
    try {
        Type t = this.getField(6, 0);
        ret = (SPS)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns Specimen Source (SAC-6).
   */
  public SPS getSac6_SpecimenSource()  {
    SPS ret = null;
    try {
        Type t = this.getField(6, 0);
        ret = (SPS)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns Registration Date/Time (SAC-7).
   */
  public DTM getRegistrationDateTime()  {
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
   * Returns Registration Date/Time (SAC-7).
   */
  public DTM getSac7_RegistrationDateTime()  {
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
   * Returns Container Status (SAC-8).
   */
  public CWE getContainerStatus()  {
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
   * Returns Container Status (SAC-8).
   */
  public CWE getSac8_ContainerStatus()  {
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
   * Returns Carrier Type (SAC-9).
   */
  public CWE getCarrierType()  {
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
   * Returns Carrier Type (SAC-9).
   */
  public CWE getSac9_CarrierType()  {
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
   * Returns Carrier Identifier (SAC-10).
   */
  public EI getCarrierIdentifier()  {
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
   * Returns Carrier Identifier (SAC-10).
   */
  public EI getSac10_CarrierIdentifier()  {
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
   * Returns Position in Carrier (SAC-11).
   */
  public NA getPositionInCarrier()  {
    NA ret = null;
    try {
        Type t = this.getField(11, 0);
        ret = (NA)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns Position in Carrier (SAC-11).
   */
  public NA getSac11_PositionInCarrier()  {
    NA ret = null;
    try {
        Type t = this.getField(11, 0);
        ret = (NA)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns Tray Type - SAC (SAC-12).
   */
  public CWE getTrayTypeSAC()  {
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
   * Returns Tray Type - SAC (SAC-12).
   */
  public CWE getSac12_TrayTypeSAC()  {
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
   * Returns Tray Identifier (SAC-13).
   */
  public EI getTrayIdentifier()  {
    EI ret = null;
    try {
        Type t = this.getField(13, 0);
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
   * Returns Tray Identifier (SAC-13).
   */
  public EI getSac13_TrayIdentifier()  {
    EI ret = null;
    try {
        Type t = this.getField(13, 0);
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
   * Returns Position in Tray (SAC-14).
   */
  public NA getPositionInTray()  {
    NA ret = null;
    try {
        Type t = this.getField(14, 0);
        ret = (NA)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns Position in Tray (SAC-14).
   */
  public NA getSac14_PositionInTray()  {
    NA ret = null;
    try {
        Type t = this.getField(14, 0);
        ret = (NA)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns a single repetition of Location (SAC-15).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getLocation(int rep) throws HL7Exception {
    CWE ret = null;
    try {
        Type t = this.getField(15, rep);
        ret = (CWE)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Location (SAC-15).
   */
  public CWE[] getLocation() {
     CWE[] ret = null;
    try {
        Type[] t = this.getField(15);  
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
   * Returns a count of the number of repetitions of Location (SAC-15).
   */
  public int getLocationReps() {
    try {
        return this.getField(15).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Location (SAC-15) at a given index and returns it.
   * @param index The index
   */
  public CWE insertLocation(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(15, index);
  }

  /**
   * Removes a repetition of Location (SAC-15) at a given index and returns it.
   * @param index The index
   */
  public CWE removeLocation(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(15, index);
  }

  /**
   * Returns a single repetition of Location (SAC-15).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getSac15_Location(int rep) throws HL7Exception {
    CWE ret = null;
    try {
        Type t = this.getField(15, rep);
        ret = (CWE)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Location (SAC-15).
   */
  public CWE[] getSac15_Location() {
     CWE[] ret = null;
    try {
        Type[] t = this.getField(15);  
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
   * Returns a count of the number of repetitions of Location (SAC-15).
   */
  public int getSac15_LocationReps() {
    try {
        return this.getField(15).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Location (SAC-15) at a given index and returns it.
   * @param index The index
   */
  public CWE insertSac15_Location(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(15, index);
  }

  /**
   * Removes a repetition of Location (SAC-15) at a given index and returns it.
   * @param index The index
   */
  public CWE removeSac15_Location(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(15, index);
  }

  /**
   * Returns Container Height (SAC-16).
   */
  public NM getContainerHeight()  {
    NM ret = null;
    try {
        Type t = this.getField(16, 0);
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
   * Returns Container Height (SAC-16).
   */
  public NM getSac16_ContainerHeight()  {
    NM ret = null;
    try {
        Type t = this.getField(16, 0);
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
   * Returns Container Diameter (SAC-17).
   */
  public NM getContainerDiameter()  {
    NM ret = null;
    try {
        Type t = this.getField(17, 0);
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
   * Returns Container Diameter (SAC-17).
   */
  public NM getSac17_ContainerDiameter()  {
    NM ret = null;
    try {
        Type t = this.getField(17, 0);
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
   * Returns Barrier Delta (SAC-18).
   */
  public NM getBarrierDelta()  {
    NM ret = null;
    try {
        Type t = this.getField(18, 0);
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
   * Returns Barrier Delta (SAC-18).
   */
  public NM getSac18_BarrierDelta()  {
    NM ret = null;
    try {
        Type t = this.getField(18, 0);
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
   * Returns Bottom Delta (SAC-19).
   */
  public NM getBottomDelta()  {
    NM ret = null;
    try {
        Type t = this.getField(19, 0);
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
   * Returns Bottom Delta (SAC-19).
   */
  public NM getSac19_BottomDelta()  {
    NM ret = null;
    try {
        Type t = this.getField(19, 0);
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
   * Returns Container Height/Diameter/Delta Units (SAC-20).
   */
  public CWE getContainerHeightDiameterDeltaUnits()  {
    CWE ret = null;
    try {
        Type t = this.getField(20, 0);
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
   * Returns Container Height/Diameter/Delta Units (SAC-20).
   */
  public CWE getSac20_ContainerHeightDiameterDeltaUnits()  {
    CWE ret = null;
    try {
        Type t = this.getField(20, 0);
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
   * Returns Container Volume (SAC-21).
   */
  public NM getContainerVolume()  {
    NM ret = null;
    try {
        Type t = this.getField(21, 0);
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
   * Returns Container Volume (SAC-21).
   */
  public NM getSac21_ContainerVolume()  {
    NM ret = null;
    try {
        Type t = this.getField(21, 0);
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
   * Returns Available Specimen Volume (SAC-22).
   */
  public NM getAvailableSpecimenVolume()  {
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
   * Returns Available Specimen Volume (SAC-22).
   */
  public NM getSac22_AvailableSpecimenVolume()  {
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
   * Returns Initial Specimen Volume (SAC-23).
   */
  public NM getInitialSpecimenVolume()  {
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
   * Returns Initial Specimen Volume (SAC-23).
   */
  public NM getSac23_InitialSpecimenVolume()  {
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
   * Returns Volume Units (SAC-24).
   */
  public CWE getVolumeUnits()  {
    CWE ret = null;
    try {
        Type t = this.getField(24, 0);
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
   * Returns Volume Units (SAC-24).
   */
  public CWE getSac24_VolumeUnits()  {
    CWE ret = null;
    try {
        Type t = this.getField(24, 0);
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
   * Returns Separator Type (SAC-25).
   */
  public CWE getSeparatorType()  {
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
   * Returns Separator Type (SAC-25).
   */
  public CWE getSac25_SeparatorType()  {
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
   * Returns Cap Type (SAC-26).
   */
  public CWE getCapType()  {
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
   * Returns Cap Type (SAC-26).
   */
  public CWE getSac26_CapType()  {
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
   * Returns a single repetition of Additive (SAC-27).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getAdditive(int rep) throws HL7Exception {
    CWE ret = null;
    try {
        Type t = this.getField(27, rep);
        ret = (CWE)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Additive (SAC-27).
   */
  public CWE[] getAdditive() {
     CWE[] ret = null;
    try {
        Type[] t = this.getField(27);  
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
   * Returns a count of the number of repetitions of Additive (SAC-27).
   */
  public int getAdditiveReps() {
    try {
        return this.getField(27).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Additive (SAC-27) at a given index and returns it.
   * @param index The index
   */
  public CWE insertAdditive(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(27, index);
  }

  /**
   * Removes a repetition of Additive (SAC-27) at a given index and returns it.
   * @param index The index
   */
  public CWE removeAdditive(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(27, index);
  }

  /**
   * Returns a single repetition of Additive (SAC-27).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getSac27_Additive(int rep) throws HL7Exception {
    CWE ret = null;
    try {
        Type t = this.getField(27, rep);
        ret = (CWE)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Additive (SAC-27).
   */
  public CWE[] getSac27_Additive() {
     CWE[] ret = null;
    try {
        Type[] t = this.getField(27);  
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
   * Returns a count of the number of repetitions of Additive (SAC-27).
   */
  public int getSac27_AdditiveReps() {
    try {
        return this.getField(27).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Additive (SAC-27) at a given index and returns it.
   * @param index The index
   */
  public CWE insertSac27_Additive(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(27, index);
  }

  /**
   * Removes a repetition of Additive (SAC-27) at a given index and returns it.
   * @param index The index
   */
  public CWE removeSac27_Additive(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(27, index);
  }

  /**
   * Returns Specimen Component (SAC-28).
   */
  public CWE getSpecimenComponent()  {
    CWE ret = null;
    try {
        Type t = this.getField(28, 0);
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
   * Returns Specimen Component (SAC-28).
   */
  public CWE getSac28_SpecimenComponent()  {
    CWE ret = null;
    try {
        Type t = this.getField(28, 0);
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
   * Returns Dilution Factor (SAC-29).
   */
  public SN getDilutionFactor()  {
    SN ret = null;
    try {
        Type t = this.getField(29, 0);
        ret = (SN)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns Dilution Factor (SAC-29).
   */
  public SN getSac29_DilutionFactor()  {
    SN ret = null;
    try {
        Type t = this.getField(29, 0);
        ret = (SN)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns Treatment (SAC-30).
   */
  public CWE getTreatment()  {
    CWE ret = null;
    try {
        Type t = this.getField(30, 0);
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
   * Returns Treatment (SAC-30).
   */
  public CWE getSac30_Treatment()  {
    CWE ret = null;
    try {
        Type t = this.getField(30, 0);
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
   * Returns Temperature (SAC-31).
   */
  public SN getTemperature()  {
    SN ret = null;
    try {
        Type t = this.getField(31, 0);
        ret = (SN)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns Temperature (SAC-31).
   */
  public SN getSac31_Temperature()  {
    SN ret = null;
    try {
        Type t = this.getField(31, 0);
        ret = (SN)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
    return ret;
  }

  /**
   * Returns Hemolysis Index (SAC-32).
   */
  public NM getHemolysisIndex()  {
    NM ret = null;
    try {
        Type t = this.getField(32, 0);
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
   * Returns Hemolysis Index (SAC-32).
   */
  public NM getSac32_HemolysisIndex()  {
    NM ret = null;
    try {
        Type t = this.getField(32, 0);
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
   * Returns Hemolysis Index Units (SAC-33).
   */
  public CWE getHemolysisIndexUnits()  {
    CWE ret = null;
    try {
        Type t = this.getField(33, 0);
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
   * Returns Hemolysis Index Units (SAC-33).
   */
  public CWE getSac33_HemolysisIndexUnits()  {
    CWE ret = null;
    try {
        Type t = this.getField(33, 0);
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
   * Returns Lipemia Index (SAC-34).
   */
  public NM getLipemiaIndex()  {
    NM ret = null;
    try {
        Type t = this.getField(34, 0);
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
   * Returns Lipemia Index (SAC-34).
   */
  public NM getSac34_LipemiaIndex()  {
    NM ret = null;
    try {
        Type t = this.getField(34, 0);
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
   * Returns Lipemia Index Units (SAC-35).
   */
  public CWE getLipemiaIndexUnits()  {
    CWE ret = null;
    try {
        Type t = this.getField(35, 0);
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
   * Returns Lipemia Index Units (SAC-35).
   */
  public CWE getSac35_LipemiaIndexUnits()  {
    CWE ret = null;
    try {
        Type t = this.getField(35, 0);
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
   * Returns Icterus Index (SAC-36).
   */
  public NM getIcterusIndex()  {
    NM ret = null;
    try {
        Type t = this.getField(36, 0);
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
   * Returns Icterus Index (SAC-36).
   */
  public NM getSac36_IcterusIndex()  {
    NM ret = null;
    try {
        Type t = this.getField(36, 0);
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
   * Returns Icterus Index Units (SAC-37).
   */
  public CWE getIcterusIndexUnits()  {
    CWE ret = null;
    try {
        Type t = this.getField(37, 0);
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
   * Returns Icterus Index Units (SAC-37).
   */
  public CWE getSac37_IcterusIndexUnits()  {
    CWE ret = null;
    try {
        Type t = this.getField(37, 0);
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
   * Returns Fibrin Index (SAC-38).
   */
  public NM getFibrinIndex()  {
    NM ret = null;
    try {
        Type t = this.getField(38, 0);
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
   * Returns Fibrin Index (SAC-38).
   */
  public NM getSac38_FibrinIndex()  {
    NM ret = null;
    try {
        Type t = this.getField(38, 0);
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
   * Returns Fibrin Index Units (SAC-39).
   */
  public CWE getFibrinIndexUnits()  {
    CWE ret = null;
    try {
        Type t = this.getField(39, 0);
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
   * Returns Fibrin Index Units (SAC-39).
   */
  public CWE getSac39_FibrinIndexUnits()  {
    CWE ret = null;
    try {
        Type t = this.getField(39, 0);
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
   * Returns a single repetition of System Induced Contaminants (SAC-40).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getSystemInducedContaminants(int rep) throws HL7Exception {
    CWE ret = null;
    try {
        Type t = this.getField(40, rep);
        ret = (CWE)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of System Induced Contaminants (SAC-40).
   */
  public CWE[] getSystemInducedContaminants() {
     CWE[] ret = null;
    try {
        Type[] t = this.getField(40);  
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
   * Returns a count of the number of repetitions of System Induced Contaminants (SAC-40).
   */
  public int getSystemInducedContaminantsReps() {
    try {
        return this.getField(40).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of System Induced Contaminants (SAC-40) at a given index and returns it.
   * @param index The index
   */
  public CWE insertSystemInducedContaminants(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(40, index);
  }

  /**
   * Removes a repetition of System Induced Contaminants (SAC-40) at a given index and returns it.
   * @param index The index
   */
  public CWE removeSystemInducedContaminants(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(40, index);
  }

  /**
   * Returns a single repetition of System Induced Contaminants (SAC-40).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getSac40_SystemInducedContaminants(int rep) throws HL7Exception {
    CWE ret = null;
    try {
        Type t = this.getField(40, rep);
        ret = (CWE)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of System Induced Contaminants (SAC-40).
   */
  public CWE[] getSac40_SystemInducedContaminants() {
     CWE[] ret = null;
    try {
        Type[] t = this.getField(40);  
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
   * Returns a count of the number of repetitions of System Induced Contaminants (SAC-40).
   */
  public int getSac40_SystemInducedContaminantsReps() {
    try {
        return this.getField(40).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of System Induced Contaminants (SAC-40) at a given index and returns it.
   * @param index The index
   */
  public CWE insertSac40_SystemInducedContaminants(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(40, index);
  }

  /**
   * Removes a repetition of System Induced Contaminants (SAC-40) at a given index and returns it.
   * @param index The index
   */
  public CWE removeSac40_SystemInducedContaminants(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(40, index);
  }

  /**
   * Returns a single repetition of Drug Interference (SAC-41).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getDrugInterference(int rep) throws HL7Exception {
    CWE ret = null;
    try {
        Type t = this.getField(41, rep);
        ret = (CWE)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Drug Interference (SAC-41).
   */
  public CWE[] getDrugInterference() {
     CWE[] ret = null;
    try {
        Type[] t = this.getField(41);  
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
   * Returns a count of the number of repetitions of Drug Interference (SAC-41).
   */
  public int getDrugInterferenceReps() {
    try {
        return this.getField(41).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Drug Interference (SAC-41) at a given index and returns it.
   * @param index The index
   */
  public CWE insertDrugInterference(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(41, index);
  }

  /**
   * Removes a repetition of Drug Interference (SAC-41) at a given index and returns it.
   * @param index The index
   */
  public CWE removeDrugInterference(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(41, index);
  }

  /**
   * Returns a single repetition of Drug Interference (SAC-41).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getSac41_DrugInterference(int rep) throws HL7Exception {
    CWE ret = null;
    try {
        Type t = this.getField(41, rep);
        ret = (CWE)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Drug Interference (SAC-41).
   */
  public CWE[] getSac41_DrugInterference() {
     CWE[] ret = null;
    try {
        Type[] t = this.getField(41);  
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
   * Returns a count of the number of repetitions of Drug Interference (SAC-41).
   */
  public int getSac41_DrugInterferenceReps() {
    try {
        return this.getField(41).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Drug Interference (SAC-41) at a given index and returns it.
   * @param index The index
   */
  public CWE insertSac41_DrugInterference(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(41, index);
  }

  /**
   * Removes a repetition of Drug Interference (SAC-41) at a given index and returns it.
   * @param index The index
   */
  public CWE removeSac41_DrugInterference(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(41, index);
  }

  /**
   * Returns Artificial Blood (SAC-42).
   */
  public CWE getArtificialBlood()  {
    CWE ret = null;
    try {
        Type t = this.getField(42, 0);
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
   * Returns Artificial Blood (SAC-42).
   */
  public CWE getSac42_ArtificialBlood()  {
    CWE ret = null;
    try {
        Type t = this.getField(42, 0);
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
   * Returns a single repetition of Special Handling Code (SAC-43).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getSpecialHandlingCode(int rep) throws HL7Exception {
    CWE ret = null;
    try {
        Type t = this.getField(43, rep);
        ret = (CWE)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Special Handling Code (SAC-43).
   */
  public CWE[] getSpecialHandlingCode() {
     CWE[] ret = null;
    try {
        Type[] t = this.getField(43);  
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
   * Returns a count of the number of repetitions of Special Handling Code (SAC-43).
   */
  public int getSpecialHandlingCodeReps() {
    try {
        return this.getField(43).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Special Handling Code (SAC-43) at a given index and returns it.
   * @param index The index
   */
  public CWE insertSpecialHandlingCode(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(43, index);
  }

  /**
   * Removes a repetition of Special Handling Code (SAC-43) at a given index and returns it.
   * @param index The index
   */
  public CWE removeSpecialHandlingCode(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(43, index);
  }

  /**
   * Returns a single repetition of Special Handling Code (SAC-43).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getSac43_SpecialHandlingCode(int rep) throws HL7Exception {
    CWE ret = null;
    try {
        Type t = this.getField(43, rep);
        ret = (CWE)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Special Handling Code (SAC-43).
   */
  public CWE[] getSac43_SpecialHandlingCode() {
     CWE[] ret = null;
    try {
        Type[] t = this.getField(43);  
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
   * Returns a count of the number of repetitions of Special Handling Code (SAC-43).
   */
  public int getSac43_SpecialHandlingCodeReps() {
    try {
        return this.getField(43).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Special Handling Code (SAC-43) at a given index and returns it.
   * @param index The index
   */
  public CWE insertSac43_SpecialHandlingCode(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(43, index);
  }

  /**
   * Removes a repetition of Special Handling Code (SAC-43) at a given index and returns it.
   * @param index The index
   */
  public CWE removeSac43_SpecialHandlingCode(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(43, index);
  }

  /**
   * Returns a single repetition of Other Environmental Factors (SAC-44).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getOtherEnvironmentalFactors(int rep) throws HL7Exception {
    CWE ret = null;
    try {
        Type t = this.getField(44, rep);
        ret = (CWE)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Other Environmental Factors (SAC-44).
   */
  public CWE[] getOtherEnvironmentalFactors() {
     CWE[] ret = null;
    try {
        Type[] t = this.getField(44);  
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
   * Returns a count of the number of repetitions of Other Environmental Factors (SAC-44).
   */
  public int getOtherEnvironmentalFactorsReps() {
    try {
        return this.getField(44).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Other Environmental Factors (SAC-44) at a given index and returns it.
   * @param index The index
   */
  public CWE insertOtherEnvironmentalFactors(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(44, index);
  }

  /**
   * Removes a repetition of Other Environmental Factors (SAC-44) at a given index and returns it.
   * @param index The index
   */
  public CWE removeOtherEnvironmentalFactors(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(44, index);
  }

  /**
   * Returns a single repetition of Other Environmental Factors (SAC-44).
   * @param rep the repetition number (this is a repeating field)
   * @throws HL7Exception if the repetition number is invalid.
   */
  public CWE getSac44_OtherEnvironmentalFactors(int rep) throws HL7Exception {
    CWE ret = null;
    try {
        Type t = this.getField(44, rep);
        ret = (CWE)t;
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    }
    return ret;
  }

  /**
   * Returns all repetitions of Other Environmental Factors (SAC-44).
   */
  public CWE[] getSac44_OtherEnvironmentalFactors() {
     CWE[] ret = null;
    try {
        Type[] t = this.getField(44);  
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
   * Returns a count of the number of repetitions of Other Environmental Factors (SAC-44).
   */
  public int getSac44_OtherEnvironmentalFactorsReps() {
    try {
        return this.getField(44).length;  
    } catch (ClassCastException cce) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
        throw new RuntimeException(cce);
    } catch (HL7Exception he) {
        HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
        throw new RuntimeException(he);
    }
  }

  /**
   * Inserts a repetition of Other Environmental Factors (SAC-44) at a given index and returns it.
   * @param index The index
   */
  public CWE insertSac44_OtherEnvironmentalFactors(int index) throws HL7Exception {
     return (CWE) super.insertRepetition(44, index);
  }

  /**
   * Removes a repetition of Other Environmental Factors (SAC-44) at a given index and returns it.
   * @param index The index
   */
  public CWE removeSac44_OtherEnvironmentalFactors(int index) throws HL7Exception {
     return (CWE) super.removeRepetition(44, index);
  }

   protected Type createNewTypeWithoutReflection(int field) {
      switch (field) {
         case 0: return new ca.uhn.hl7v2.model.v26.datatype.EI(getMessage());
         case 1: return new ca.uhn.hl7v2.model.v26.datatype.EI(getMessage());
         case 2: return new ca.uhn.hl7v2.model.v26.datatype.EI(getMessage());
         case 3: return new ca.uhn.hl7v2.model.v26.datatype.EI(getMessage());
         case 4: return new ca.uhn.hl7v2.model.v26.datatype.EI(getMessage());
         case 5: return new ca.uhn.hl7v2.model.v26.datatype.SPS(getMessage());
         case 6: return new ca.uhn.hl7v2.model.v26.datatype.DTM(getMessage());
         case 7: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 8: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 9: return new ca.uhn.hl7v2.model.v26.datatype.EI(getMessage());
         case 10: return new ca.uhn.hl7v2.model.v26.datatype.NA(getMessage());
         case 11: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 12: return new ca.uhn.hl7v2.model.v26.datatype.EI(getMessage());
         case 13: return new ca.uhn.hl7v2.model.v26.datatype.NA(getMessage());
         case 14: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 15: return new ca.uhn.hl7v2.model.v26.datatype.NM(getMessage());
         case 16: return new ca.uhn.hl7v2.model.v26.datatype.NM(getMessage());
         case 17: return new ca.uhn.hl7v2.model.v26.datatype.NM(getMessage());
         case 18: return new ca.uhn.hl7v2.model.v26.datatype.NM(getMessage());
         case 19: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 20: return new ca.uhn.hl7v2.model.v26.datatype.NM(getMessage());
         case 21: return new ca.uhn.hl7v2.model.v26.datatype.NM(getMessage());
         case 22: return new ca.uhn.hl7v2.model.v26.datatype.NM(getMessage());
         case 23: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 24: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 25: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 26: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 27: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 28: return new ca.uhn.hl7v2.model.v26.datatype.SN(getMessage());
         case 29: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 30: return new ca.uhn.hl7v2.model.v26.datatype.SN(getMessage());
         case 31: return new ca.uhn.hl7v2.model.v26.datatype.NM(getMessage());
         case 32: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 33: return new ca.uhn.hl7v2.model.v26.datatype.NM(getMessage());
         case 34: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 35: return new ca.uhn.hl7v2.model.v26.datatype.NM(getMessage());
         case 36: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 37: return new ca.uhn.hl7v2.model.v26.datatype.NM(getMessage());
         case 38: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 39: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 40: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 41: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 42: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         case 43: return new ca.uhn.hl7v2.model.v26.datatype.CWE(getMessage());
         default: return null;
      }
   }

}