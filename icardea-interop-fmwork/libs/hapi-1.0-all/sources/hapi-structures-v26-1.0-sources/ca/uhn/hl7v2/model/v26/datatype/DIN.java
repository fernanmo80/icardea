package ca.uhn.hl7v2.model.v26.datatype;

import ca.uhn.hl7v2.model.Composite;
import ca.uhn.hl7v2.model.DataTypeException;
import ca.uhn.hl7v2.model.Message;
import ca.uhn.hl7v2.model.Type;
import ca.uhn.hl7v2.model.AbstractType;
import ca.uhn.log.HapiLogFactory;

/**
 * <p>The HL7 DIN (Date and Institution Name) data type.  Consists of the following components: </p><ol>
 * <li>Date (DTM)</li>
 * <li>Institution Name (CWE)</li>
 * </ol>
 */
public class DIN extends AbstractType implements Composite {

	private Type[] data;

	/**
	 * Creates a DIN.
	 * @param message the Message to which this Type belongs
	 */
	public DIN(Message message) {
		super(message);
		data = new Type[2];
		data[0] = new DTM(message);
		data[1] = new CWE(message);
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
			throw new DataTypeException("Element " + number + " doesn't exist in 2 element DIN composite"); 
		} 
	} 
	/**
	 * Returns Date (component #0).  This is a convenience method that saves you from 
	 * casting and handling an exception.
	 */
	public DTM getDate() {
	   DTM ret = null;
	   try {
	      ret = (DTM)getComponent(0);
	   } catch (DataTypeException e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem accessing known data type component - this is a bug.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns Date (component #0).  This is a convenience method that saves you from 
	 * casting and handling an exception.
	 */
	public DTM getDin1_Date() {
	   DTM ret = null;
	   try {
	      ret = (DTM)getComponent(0);
	   } catch (DataTypeException e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem accessing known data type component - this is a bug.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns Institution Name (component #1).  This is a convenience method that saves you from 
	 * casting and handling an exception.
	 */
	public CWE getInstitutionName() {
	   CWE ret = null;
	   try {
	      ret = (CWE)getComponent(1);
	   } catch (DataTypeException e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem accessing known data type component - this is a bug.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns Institution Name (component #1).  This is a convenience method that saves you from 
	 * casting and handling an exception.
	 */
	public CWE getDin2_InstitutionName() {
	   CWE ret = null;
	   try {
	      ret = (CWE)getComponent(1);
	   } catch (DataTypeException e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem accessing known data type component - this is a bug.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

}