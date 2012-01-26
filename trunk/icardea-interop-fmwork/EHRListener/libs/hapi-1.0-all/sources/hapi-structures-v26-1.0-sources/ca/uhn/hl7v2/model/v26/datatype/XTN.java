package ca.uhn.hl7v2.model.v26.datatype;

import ca.uhn.hl7v2.model.Composite;
import ca.uhn.hl7v2.model.DataTypeException;
import ca.uhn.hl7v2.model.Message;
import ca.uhn.hl7v2.model.Type;
import ca.uhn.hl7v2.model.AbstractType;
import ca.uhn.log.HapiLogFactory;

/**
 * <p>The HL7 XTN (Extended Telecommunication Number) data type.  Consists of the following components: </p><ol>
 * <li>Telephone Number (-)</li>
 * <li>Telecommunication Use Code (ID)</li>
 * <li>Telecommunication Equipment Type (ID)</li>
 * <li>Communication Address (ST)</li>
 * <li>Country Code (NM)</li>
 * <li>Area/City Code (NM)</li>
 * <li>Local Number (NM)</li>
 * <li>Extension (NM)</li>
 * <li>Any Text (ST)</li>
 * <li>Extension Prefix (ST)</li>
 * <li>Speed Dial Code (ST)</li>
 * <li>Unformatted Telephone number (ST)</li>
 * <li>Effective Start Date (DTM)</li>
 * <li>Expiration Date (DTM)</li>
 * <li>Expiration Reason (CWE)</li>
 * <li>Protection Code (CWE)</li>
 * <li>Shared Telecommunication Identifier (EI)</li>
 * <li>Preference Order (NM)</li>
 * </ol>
 */
public class XTN extends AbstractType implements Composite {

	private Type[] data;

	/**
	 * Creates a XTN.
	 * @param message the Message to which this Type belongs
	 */
	public XTN(Message message) {
		super(message);
		data = new Type[18];
		data[0] = new NULLDT(message);
		data[1] = new ID(message, 201);
		data[2] = new ID(message, 202);
		data[3] = new ST(message);
		data[4] = new NM(message);
		data[5] = new NM(message);
		data[6] = new NM(message);
		data[7] = new NM(message);
		data[8] = new ST(message);
		data[9] = new ST(message);
		data[10] = new ST(message);
		data[11] = new ST(message);
		data[12] = new DTM(message);
		data[13] = new DTM(message);
		data[14] = new CWE(message);
		data[15] = new CWE(message);
		data[16] = new EI(message);
		data[17] = new NM(message);
	}

	/**
	 * Returns an array containing the data elements.
	 */
	public Type[] getComponents() { 
		return this.data; 
	}

	/**
	 * Returns an individual data component.
	 * @throws DataTypeException if the given element number is out of range.
	 */
	public Type getComponent(int number) throws DataTypeException { 

		try { 
			return this.data[number]; 
		} catch (ArrayIndexOutOfBoundsException e) { 
			throw new DataTypeException("Element " + number + " doesn't exist in 18 element XTN composite"); 
		} 
	} 
	/**
	 * Returns Telephone Number (component #0).  This is a convenience method that saves you from 
	 * casting and handling an exception.
	 */
	public NULLDT getTelephoneNumber() {
	   NULLDT ret = null;
	   try {
	      ret = (NULLDT)getComponent(0);
	   } catch (DataTypeException e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem accessing known data type component - this is a bug.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns Telephone Number (component #0).  This is a convenience method that saves you from 
	 * casting and handling an exception.
	 */
	public NULLDT getXtn1_TelephoneNumber() {
	   NULLDT ret = null;
	   try {
	      ret = (NULLDT)getComponent(0);
	   } catch (DataTypeException e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem accessing known data type component - this is a bug.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns Telecommunication Use Code (component #1).  This is a convenience method that saves you from 
	 * casting and handling an exception.
	 */
	public ID getTelecommunicationUseCode() {
	   ID ret = null;
	   try {
	      ret = (ID)getComponent(1);
	   } catch (DataTypeException e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem accessing known data type component - this is a bug.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns Telecommunication Use Code (component #1).  This is a convenience method that saves you from 
	 * casting and handling an exception.
	 */
	public ID getXtn2_TelecommunicationUseCode() {
	   ID ret = null;
	   try {
	      ret = (ID)getComponent(1);
	   } catch (DataTypeException e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem accessing known data type component - this is a bug.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns Telecommunication Equipment Type (component #2).  This is a convenience method that saves you from 
	 * casting and handling an exception.
	 */
	public ID getTelecommunicationEquipmentType() {
	   ID ret = null;
	   try {
	      ret = (ID)getComponent(2);
	   } catch (DataTypeException e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem accessing known data type component - this is a bug.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns Telecommunication Equipment Type (component #2).  This is a convenience method that saves you from 
	 * casting and handling an exception.
	 */
	public ID getXtn3_TelecommunicationEquipmentType() {
	   ID ret = null;
	   try {
	      ret = (ID)getComponent(2);
	   } catch (DataTypeException e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem accessing known data type component - this is a bug.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns Communication Address (component #3).  This is a convenience method that saves you from 
	 * casting and handling an exception.
	 */
	public ST getCommunicationAddress() {
	   ST ret = null;
	   try {
	      ret = (ST)getComponent(3);
	   } catch (DataTypeException e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem accessing known data type component - this is a bug.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns Communication Address (component #3).  This is a convenience method that saves you from 
	 * casting and handling an exception.
	 */
	public ST getXtn4_CommunicationAddress() {
	   ST ret = null;
	   try {
	      ret = (ST)getComponent(3);
	   } catch (DataTypeException e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem accessing known data type component - this is a bug.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns Country Code (component #4).  This is a convenience method that saves you from 
	 * casting and handling an exception.
	 */
	public NM getCountryCode() {
	   NM ret = null;
	   try {
	      ret = (NM)getComponent(4);
	   } catch (DataTypeException e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem accessing known data type component - this is a bug.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns Country Code (component #4).  This is a convenience method that saves you from 
	 * casting and handling an exception.
	 */
	public NM getXtn5_CountryCode() {
	   NM ret = null;
	   try {
	      ret = (NM)getComponent(4);
	   } catch (DataTypeException e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem accessing known data type component - this is a bug.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns Area/City Code (component #5).  This is a convenience method that saves you from 
	 * casting and handling an exception.
	 */
	public NM getAreaCityCode() {
	   NM ret = null;
	   try {
	      ret = (NM)getComponent(5);
	   } catch (DataTypeException e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem accessing known data type component - this is a bug.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns Area/City Code (component #5).  This is a convenience method that saves you from 
	 * casting and handling an exception.
	 */
	public NM getXtn6_AreaCityCode() {
	   NM ret = null;
	   try {
	      ret = (NM)getComponent(5);
	   } catch (DataTypeException e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem accessing known data type component - this is a bug.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns Local Number (component #6).  This is a convenience method that saves you from 
	 * casting and handling an exception.
	 */
	public NM getLocalNumber() {
	   NM ret = null;
	   try {
	      ret = (NM)getComponent(6);
	   } catch (DataTypeException e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem accessing known data type component - this is a bug.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns Local Number (component #6).  This is a convenience method that saves you from 
	 * casting and handling an exception.
	 */
	public NM getXtn7_LocalNumber() {
	   NM ret = null;
	   try {
	      ret = (NM)getComponent(6);
	   } catch (DataTypeException e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem accessing known data type component - this is a bug.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns Extension (component #7).  This is a convenience method that saves you from 
	 * casting and handling an exception.
	 */
	public NM getExtension() {
	   NM ret = null;
	   try {
	      ret = (NM)getComponent(7);
	   } catch (DataTypeException e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem accessing known data type component - this is a bug.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns Extension (component #7).  This is a convenience method that saves you from 
	 * casting and handling an exception.
	 */
	public NM getXtn8_Extension() {
	   NM ret = null;
	   try {
	      ret = (NM)getComponent(7);
	   } catch (DataTypeException e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem accessing known data type component - this is a bug.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns Any Text (component #8).  This is a convenience method that saves you from 
	 * casting and handling an exception.
	 */
	public ST getAnyText() {
	   ST ret = null;
	   try {
	      ret = (ST)getComponent(8);
	   } catch (DataTypeException e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem accessing known data type component - this is a bug.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns Any Text (component #8).  This is a convenience method that saves you from 
	 * casting and handling an exception.
	 */
	public ST getXtn9_AnyText() {
	   ST ret = null;
	   try {
	      ret = (ST)getComponent(8);
	   } catch (DataTypeException e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem accessing known data type component - this is a bug.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns Extension Prefix (component #9).  This is a convenience method that saves you from 
	 * casting and handling an exception.
	 */
	public ST getExtensionPrefix() {
	   ST ret = null;
	   try {
	      ret = (ST)getComponent(9);
	   } catch (DataTypeException e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem accessing known data type component - this is a bug.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns Extension Prefix (component #9).  This is a convenience method that saves you from 
	 * casting and handling an exception.
	 */
	public ST getXtn10_ExtensionPrefix() {
	   ST ret = null;
	   try {
	      ret = (ST)getComponent(9);
	   } catch (DataTypeException e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem accessing known data type component - this is a bug.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns Speed Dial Code (component #10).  This is a convenience method that saves you from 
	 * casting and handling an exception.
	 */
	public ST getSpeedDialCode() {
	   ST ret = null;
	   try {
	      ret = (ST)getComponent(10);
	   } catch (DataTypeException e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem accessing known data type component - this is a bug.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns Speed Dial Code (component #10).  This is a convenience method that saves you from 
	 * casting and handling an exception.
	 */
	public ST getXtn11_SpeedDialCode() {
	   ST ret = null;
	   try {
	      ret = (ST)getComponent(10);
	   } catch (DataTypeException e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem accessing known data type component - this is a bug.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns Unformatted Telephone number (component #11).  This is a convenience method that saves you from 
	 * casting and handling an exception.
	 */
	public ST getUnformattedTelephoneNumber() {
	   ST ret = null;
	   try {
	      ret = (ST)getComponent(11);
	   } catch (DataTypeException e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem accessing known data type component - this is a bug.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns Unformatted Telephone number (component #11).  This is a convenience method that saves you from 
	 * casting and handling an exception.
	 */
	public ST getXtn12_UnformattedTelephoneNumber() {
	   ST ret = null;
	   try {
	      ret = (ST)getComponent(11);
	   } catch (DataTypeException e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem accessing known data type component - this is a bug.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns Effective Start Date (component #12).  This is a convenience method that saves you from 
	 * casting and handling an exception.
	 */
	public DTM getEffectiveStartDate() {
	   DTM ret = null;
	   try {
	      ret = (DTM)getComponent(12);
	   } catch (DataTypeException e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem accessing known data type component - this is a bug.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns Effective Start Date (component #12).  This is a convenience method that saves you from 
	 * casting and handling an exception.
	 */
	public DTM getXtn13_EffectiveStartDate() {
	   DTM ret = null;
	   try {
	      ret = (DTM)getComponent(12);
	   } catch (DataTypeException e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem accessing known data type component - this is a bug.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns Expiration Date (component #13).  This is a convenience method that saves you from 
	 * casting and handling an exception.
	 */
	public DTM getExpirationDate() {
	   DTM ret = null;
	   try {
	      ret = (DTM)getComponent(13);
	   } catch (DataTypeException e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem accessing known data type component - this is a bug.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns Expiration Date (component #13).  This is a convenience method that saves you from 
	 * casting and handling an exception.
	 */
	public DTM getXtn14_ExpirationDate() {
	   DTM ret = null;
	   try {
	      ret = (DTM)getComponent(13);
	   } catch (DataTypeException e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem accessing known data type component - this is a bug.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns Expiration Reason (component #14).  This is a convenience method that saves you from 
	 * casting and handling an exception.
	 */
	public CWE getExpirationReason() {
	   CWE ret = null;
	   try {
	      ret = (CWE)getComponent(14);
	   } catch (DataTypeException e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem accessing known data type component - this is a bug.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns Expiration Reason (component #14).  This is a convenience method that saves you from 
	 * casting and handling an exception.
	 */
	public CWE getXtn15_ExpirationReason() {
	   CWE ret = null;
	   try {
	      ret = (CWE)getComponent(14);
	   } catch (DataTypeException e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem accessing known data type component - this is a bug.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns Protection Code (component #15).  This is a convenience method that saves you from 
	 * casting and handling an exception.
	 */
	public CWE getProtectionCode() {
	   CWE ret = null;
	   try {
	      ret = (CWE)getComponent(15);
	   } catch (DataTypeException e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem accessing known data type component - this is a bug.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns Protection Code (component #15).  This is a convenience method that saves you from 
	 * casting and handling an exception.
	 */
	public CWE getXtn16_ProtectionCode() {
	   CWE ret = null;
	   try {
	      ret = (CWE)getComponent(15);
	   } catch (DataTypeException e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem accessing known data type component - this is a bug.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns Shared Telecommunication Identifier (component #16).  This is a convenience method that saves you from 
	 * casting and handling an exception.
	 */
	public EI getSharedTelecommunicationIdentifier() {
	   EI ret = null;
	   try {
	      ret = (EI)getComponent(16);
	   } catch (DataTypeException e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem accessing known data type component - this is a bug.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns Shared Telecommunication Identifier (component #16).  This is a convenience method that saves you from 
	 * casting and handling an exception.
	 */
	public EI getXtn17_SharedTelecommunicationIdentifier() {
	   EI ret = null;
	   try {
	      ret = (EI)getComponent(16);
	   } catch (DataTypeException e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem accessing known data type component - this is a bug.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns Preference Order (component #17).  This is a convenience method that saves you from 
	 * casting and handling an exception.
	 */
	public NM getPreferenceOrder() {
	   NM ret = null;
	   try {
	      ret = (NM)getComponent(17);
	   } catch (DataTypeException e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem accessing known data type component - this is a bug.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns Preference Order (component #17).  This is a convenience method that saves you from 
	 * casting and handling an exception.
	 */
	public NM getXtn18_PreferenceOrder() {
	   NM ret = null;
	   try {
	      ret = (NM)getComponent(17);
	   } catch (DataTypeException e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem accessing known data type component - this is a bug.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

}