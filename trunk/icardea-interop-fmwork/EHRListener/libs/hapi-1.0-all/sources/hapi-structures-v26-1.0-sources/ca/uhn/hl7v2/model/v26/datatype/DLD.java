package ca.uhn.hl7v2.model.v26.datatype;

import ca.uhn.hl7v2.model.Composite;
import ca.uhn.hl7v2.model.DataTypeException;
import ca.uhn.hl7v2.model.Message;
import ca.uhn.hl7v2.model.Type;
import ca.uhn.hl7v2.model.AbstractType;
import ca.uhn.log.HapiLogFactory;

/**
 * <p>The HL7 DLD (Discharge to Location and Date) data type.  Consists of the following components: </p><ol>
 * <li>Discharge to Location (CWE)</li>
 * <li>Effective Date (DTM)</li>
 * </ol>
 */
public class DLD extends AbstractType implements Composite {

	private Type[] data;

	/**
	 * Creates a DLD.
	 * @param message the Message to which this Type belongs
	 */
	public DLD(Message message) {
		super(message);
		data = new Type[2];
		data[0] = new CWE(message);
		data[1] = new DTM(message);
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
			throw new DataTypeException("Element " + number + " doesn't exist in 2 element DLD composite"); 
		} 
	} 
	/**
	 * Returns Discharge to Location (component #0).  This is a convenience method that saves you from 
	 * casting and handling an exception.
	 */
	public CWE getDischargeToLocation() {
	   CWE ret = null;
	   try {
	      ret = (CWE)getComponent(0);
	   } catch (DataTypeException e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem accessing known data type component - this is a bug.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns Discharge to Location (component #0).  This is a convenience method that saves you from 
	 * casting and handling an exception.
	 */
	public CWE getDld1_DischargeToLocation() {
	   CWE ret = null;
	   try {
	      ret = (CWE)getComponent(0);
	   } catch (DataTypeException e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem accessing known data type component - this is a bug.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns Effective Date (component #1).  This is a convenience method that saves you from 
	 * casting and handling an exception.
	 */
	public DTM getEffectiveDate() {
	   DTM ret = null;
	   try {
	      ret = (DTM)getComponent(1);
	   } catch (DataTypeException e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem accessing known data type component - this is a bug.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns Effective Date (component #1).  This is a convenience method that saves you from 
	 * casting and handling an exception.
	 */
	public DTM getDld2_EffectiveDate() {
	   DTM ret = null;
	   try {
	      ret = (DTM)getComponent(1);
	   } catch (DataTypeException e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem accessing known data type component - this is a bug.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

}