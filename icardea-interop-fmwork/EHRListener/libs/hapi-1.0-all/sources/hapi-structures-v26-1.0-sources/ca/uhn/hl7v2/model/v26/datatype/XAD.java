package ca.uhn.hl7v2.model.v26.datatype;

import ca.uhn.hl7v2.model.Composite;
import ca.uhn.hl7v2.model.DataTypeException;
import ca.uhn.hl7v2.model.Message;
import ca.uhn.hl7v2.model.Type;
import ca.uhn.hl7v2.model.AbstractType;
import ca.uhn.log.HapiLogFactory;

/**
 * <p>The HL7 XAD (Extended Address) data type.  Consists of the following components: </p><ol>
 * <li>Street Address (SAD)</li>
 * <li>Other Designation (ST)</li>
 * <li>City (ST)</li>
 * <li>State or Province (ST)</li>
 * <li>Zip or Postal Code (ST)</li>
 * <li>Country (ID)</li>
 * <li>Address Type (ID)</li>
 * <li>Other Geographic Designation (ST)</li>
 * <li>County/Parish Code (IS)</li>
 * <li>Census Tract (IS)</li>
 * <li>Address Representation Code (ID)</li>
 * <li>Address Validity Range (DR)</li>
 * <li>Effective Date (DTM)</li>
 * <li>Expiration Date (DTM)</li>
 * <li>Expiration Reason (CWE)</li>
 * <li>Temporary Indicator (ID)</li>
 * <li>Bad Address Indicator (ID)</li>
 * <li>Address Usage (ID)</li>
 * <li>Addressee (ST)</li>
 * <li>Comment (ST)</li>
 * <li>Preference Order (NM)</li>
 * <li>Protection Code (CWE)</li>
 * <li>Address Identifier (EI)</li>
 * </ol>
 */
public class XAD extends AbstractType implements Composite {

	private Type[] data;

	/**
	 * Creates a XAD.
	 * @param message the Message to which this Type belongs
	 */
	public XAD(Message message) {
		super(message);
		data = new Type[23];
		data[0] = new SAD(message);
		data[1] = new ST(message);
		data[2] = new ST(message);
		data[3] = new ST(message);
		data[4] = new ST(message);
		data[5] = new ID(message, 399);
		data[6] = new ID(message, 190);
		data[7] = new ST(message);
		data[8] = new IS(message, 289);
		data[9] = new IS(message, 288);
		data[10] = new ID(message, 465);
		data[11] = new DR(message);
		data[12] = new DTM(message);
		data[13] = new DTM(message);
		data[14] = new CWE(message);
		data[15] = new ID(message, 136);
		data[16] = new ID(message, 136);
		data[17] = new ID(message, 617);
		data[18] = new ST(message);
		data[19] = new ST(message);
		data[20] = new NM(message);
		data[21] = new CWE(message);
		data[22] = new EI(message);
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
			throw new DataTypeException("Element " + number + " doesn't exist in 23 element XAD composite"); 
		} 
	} 
	/**
	 * Returns Street Address (component #0).  This is a convenience method that saves you from 
	 * casting and handling an exception.
	 */
	public SAD getStreetAddress() {
	   SAD ret = null;
	   try {
	      ret = (SAD)getComponent(0);
	   } catch (DataTypeException e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem accessing known data type component - this is a bug.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns Street Address (component #0).  This is a convenience method that saves you from 
	 * casting and handling an exception.
	 */
	public SAD getXad1_StreetAddress() {
	   SAD ret = null;
	   try {
	      ret = (SAD)getComponent(0);
	   } catch (DataTypeException e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem accessing known data type component - this is a bug.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns Other Designation (component #1).  This is a convenience method that saves you from 
	 * casting and handling an exception.
	 */
	public ST getOtherDesignation() {
	   ST ret = null;
	   try {
	      ret = (ST)getComponent(1);
	   } catch (DataTypeException e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem accessing known data type component - this is a bug.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns Other Designation (component #1).  This is a convenience method that saves you from 
	 * casting and handling an exception.
	 */
	public ST getXad2_OtherDesignation() {
	   ST ret = null;
	   try {
	      ret = (ST)getComponent(1);
	   } catch (DataTypeException e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem accessing known data type component - this is a bug.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns City (component #2).  This is a convenience method that saves you from 
	 * casting and handling an exception.
	 */
	public ST getCity() {
	   ST ret = null;
	   try {
	      ret = (ST)getComponent(2);
	   } catch (DataTypeException e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem accessing known data type component - this is a bug.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns City (component #2).  This is a convenience method that saves you from 
	 * casting and handling an exception.
	 */
	public ST getXad3_City() {
	   ST ret = null;
	   try {
	      ret = (ST)getComponent(2);
	   } catch (DataTypeException e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem accessing known data type component - this is a bug.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns State or Province (component #3).  This is a convenience method that saves you from 
	 * casting and handling an exception.
	 */
	public ST getStateOrProvince() {
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
	 * Returns State or Province (component #3).  This is a convenience method that saves you from 
	 * casting and handling an exception.
	 */
	public ST getXad4_StateOrProvince() {
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
	 * Returns Zip or Postal Code (component #4).  This is a convenience method that saves you from 
	 * casting and handling an exception.
	 */
	public ST getZipOrPostalCode() {
	   ST ret = null;
	   try {
	      ret = (ST)getComponent(4);
	   } catch (DataTypeException e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem accessing known data type component - this is a bug.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns Zip or Postal Code (component #4).  This is a convenience method that saves you from 
	 * casting and handling an exception.
	 */
	public ST getXad5_ZipOrPostalCode() {
	   ST ret = null;
	   try {
	      ret = (ST)getComponent(4);
	   } catch (DataTypeException e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem accessing known data type component - this is a bug.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns Country (component #5).  This is a convenience method that saves you from 
	 * casting and handling an exception.
	 */
	public ID getCountry() {
	   ID ret = null;
	   try {
	      ret = (ID)getComponent(5);
	   } catch (DataTypeException e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem accessing known data type component - this is a bug.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns Country (component #5).  This is a convenience method that saves you from 
	 * casting and handling an exception.
	 */
	public ID getXad6_Country() {
	   ID ret = null;
	   try {
	      ret = (ID)getComponent(5);
	   } catch (DataTypeException e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem accessing known data type component - this is a bug.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns Address Type (component #6).  This is a convenience method that saves you from 
	 * casting and handling an exception.
	 */
	public ID getAddressType() {
	   ID ret = null;
	   try {
	      ret = (ID)getComponent(6);
	   } catch (DataTypeException e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem accessing known data type component - this is a bug.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns Address Type (component #6).  This is a convenience method that saves you from 
	 * casting and handling an exception.
	 */
	public ID getXad7_AddressType() {
	   ID ret = null;
	   try {
	      ret = (ID)getComponent(6);
	   } catch (DataTypeException e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem accessing known data type component - this is a bug.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns Other Geographic Designation (component #7).  This is a convenience method that saves you from 
	 * casting and handling an exception.
	 */
	public ST getOtherGeographicDesignation() {
	   ST ret = null;
	   try {
	      ret = (ST)getComponent(7);
	   } catch (DataTypeException e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem accessing known data type component - this is a bug.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns Other Geographic Designation (component #7).  This is a convenience method that saves you from 
	 * casting and handling an exception.
	 */
	public ST getXad8_OtherGeographicDesignation() {
	   ST ret = null;
	   try {
	      ret = (ST)getComponent(7);
	   } catch (DataTypeException e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem accessing known data type component - this is a bug.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns County/Parish Code (component #8).  This is a convenience method that saves you from 
	 * casting and handling an exception.
	 */
	public IS getCountyParishCode() {
	   IS ret = null;
	   try {
	      ret = (IS)getComponent(8);
	   } catch (DataTypeException e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem accessing known data type component - this is a bug.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns County/Parish Code (component #8).  This is a convenience method that saves you from 
	 * casting and handling an exception.
	 */
	public IS getXad9_CountyParishCode() {
	   IS ret = null;
	   try {
	      ret = (IS)getComponent(8);
	   } catch (DataTypeException e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem accessing known data type component - this is a bug.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns Census Tract (component #9).  This is a convenience method that saves you from 
	 * casting and handling an exception.
	 */
	public IS getCensusTract() {
	   IS ret = null;
	   try {
	      ret = (IS)getComponent(9);
	   } catch (DataTypeException e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem accessing known data type component - this is a bug.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns Census Tract (component #9).  This is a convenience method that saves you from 
	 * casting and handling an exception.
	 */
	public IS getXad10_CensusTract() {
	   IS ret = null;
	   try {
	      ret = (IS)getComponent(9);
	   } catch (DataTypeException e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem accessing known data type component - this is a bug.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns Address Representation Code (component #10).  This is a convenience method that saves you from 
	 * casting and handling an exception.
	 */
	public ID getAddressRepresentationCode() {
	   ID ret = null;
	   try {
	      ret = (ID)getComponent(10);
	   } catch (DataTypeException e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem accessing known data type component - this is a bug.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns Address Representation Code (component #10).  This is a convenience method that saves you from 
	 * casting and handling an exception.
	 */
	public ID getXad11_AddressRepresentationCode() {
	   ID ret = null;
	   try {
	      ret = (ID)getComponent(10);
	   } catch (DataTypeException e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem accessing known data type component - this is a bug.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns Address Validity Range (component #11).  This is a convenience method that saves you from 
	 * casting and handling an exception.
	 */
	public DR getAddressValidityRange() {
	   DR ret = null;
	   try {
	      ret = (DR)getComponent(11);
	   } catch (DataTypeException e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem accessing known data type component - this is a bug.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns Address Validity Range (component #11).  This is a convenience method that saves you from 
	 * casting and handling an exception.
	 */
	public DR getXad12_AddressValidityRange() {
	   DR ret = null;
	   try {
	      ret = (DR)getComponent(11);
	   } catch (DataTypeException e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem accessing known data type component - this is a bug.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns Effective Date (component #12).  This is a convenience method that saves you from 
	 * casting and handling an exception.
	 */
	public DTM getEffectiveDate() {
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
	 * Returns Effective Date (component #12).  This is a convenience method that saves you from 
	 * casting and handling an exception.
	 */
	public DTM getXad13_EffectiveDate() {
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
	public DTM getXad14_ExpirationDate() {
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
	public CWE getXad15_ExpirationReason() {
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
	 * Returns Temporary Indicator (component #15).  This is a convenience method that saves you from 
	 * casting and handling an exception.
	 */
	public ID getTemporaryIndicator() {
	   ID ret = null;
	   try {
	      ret = (ID)getComponent(15);
	   } catch (DataTypeException e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem accessing known data type component - this is a bug.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns Temporary Indicator (component #15).  This is a convenience method that saves you from 
	 * casting and handling an exception.
	 */
	public ID getXad16_TemporaryIndicator() {
	   ID ret = null;
	   try {
	      ret = (ID)getComponent(15);
	   } catch (DataTypeException e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem accessing known data type component - this is a bug.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns Bad Address Indicator (component #16).  This is a convenience method that saves you from 
	 * casting and handling an exception.
	 */
	public ID getBadAddressIndicator() {
	   ID ret = null;
	   try {
	      ret = (ID)getComponent(16);
	   } catch (DataTypeException e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem accessing known data type component - this is a bug.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns Bad Address Indicator (component #16).  This is a convenience method that saves you from 
	 * casting and handling an exception.
	 */
	public ID getXad17_BadAddressIndicator() {
	   ID ret = null;
	   try {
	      ret = (ID)getComponent(16);
	   } catch (DataTypeException e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem accessing known data type component - this is a bug.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns Address Usage (component #17).  This is a convenience method that saves you from 
	 * casting and handling an exception.
	 */
	public ID getAddressUsage() {
	   ID ret = null;
	   try {
	      ret = (ID)getComponent(17);
	   } catch (DataTypeException e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem accessing known data type component - this is a bug.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns Address Usage (component #17).  This is a convenience method that saves you from 
	 * casting and handling an exception.
	 */
	public ID getXad18_AddressUsage() {
	   ID ret = null;
	   try {
	      ret = (ID)getComponent(17);
	   } catch (DataTypeException e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem accessing known data type component - this is a bug.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns Addressee (component #18).  This is a convenience method that saves you from 
	 * casting and handling an exception.
	 */
	public ST getAddressee() {
	   ST ret = null;
	   try {
	      ret = (ST)getComponent(18);
	   } catch (DataTypeException e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem accessing known data type component - this is a bug.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns Addressee (component #18).  This is a convenience method that saves you from 
	 * casting and handling an exception.
	 */
	public ST getXad19_Addressee() {
	   ST ret = null;
	   try {
	      ret = (ST)getComponent(18);
	   } catch (DataTypeException e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem accessing known data type component - this is a bug.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns Comment (component #19).  This is a convenience method that saves you from 
	 * casting and handling an exception.
	 */
	public ST getComment() {
	   ST ret = null;
	   try {
	      ret = (ST)getComponent(19);
	   } catch (DataTypeException e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem accessing known data type component - this is a bug.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns Comment (component #19).  This is a convenience method that saves you from 
	 * casting and handling an exception.
	 */
	public ST getXad20_Comment() {
	   ST ret = null;
	   try {
	      ret = (ST)getComponent(19);
	   } catch (DataTypeException e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem accessing known data type component - this is a bug.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns Preference Order (component #20).  This is a convenience method that saves you from 
	 * casting and handling an exception.
	 */
	public NM getPreferenceOrder() {
	   NM ret = null;
	   try {
	      ret = (NM)getComponent(20);
	   } catch (DataTypeException e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem accessing known data type component - this is a bug.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns Preference Order (component #20).  This is a convenience method that saves you from 
	 * casting and handling an exception.
	 */
	public NM getXad21_PreferenceOrder() {
	   NM ret = null;
	   try {
	      ret = (NM)getComponent(20);
	   } catch (DataTypeException e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem accessing known data type component - this is a bug.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns Protection Code (component #21).  This is a convenience method that saves you from 
	 * casting and handling an exception.
	 */
	public CWE getProtectionCode() {
	   CWE ret = null;
	   try {
	      ret = (CWE)getComponent(21);
	   } catch (DataTypeException e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem accessing known data type component - this is a bug.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns Protection Code (component #21).  This is a convenience method that saves you from 
	 * casting and handling an exception.
	 */
	public CWE getXad22_ProtectionCode() {
	   CWE ret = null;
	   try {
	      ret = (CWE)getComponent(21);
	   } catch (DataTypeException e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem accessing known data type component - this is a bug.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns Address Identifier (component #22).  This is a convenience method that saves you from 
	 * casting and handling an exception.
	 */
	public EI getAddressIdentifier() {
	   EI ret = null;
	   try {
	      ret = (EI)getComponent(22);
	   } catch (DataTypeException e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem accessing known data type component - this is a bug.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns Address Identifier (component #22).  This is a convenience method that saves you from 
	 * casting and handling an exception.
	 */
	public EI getXad23_AddressIdentifier() {
	   EI ret = null;
	   try {
	      ret = (EI)getComponent(22);
	   } catch (DataTypeException e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem accessing known data type component - this is a bug.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

}