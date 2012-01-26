package ca.uhn.hl7v2.model.v26.datatype;

import ca.uhn.hl7v2.model.Composite;
import ca.uhn.hl7v2.model.DataTypeException;
import ca.uhn.hl7v2.model.Message;
import ca.uhn.hl7v2.model.Type;
import ca.uhn.hl7v2.model.AbstractType;
import ca.uhn.log.HapiLogFactory;

/**
 * <p>The HL7 TS (Time Stamp) data type.  Consists of the following components: </p><ol>
 * <li>Time (-)</li>
 * <li>Degree of Precision (-)</li>
 * </ol>
 */
public class TS extends AbstractType implements Composite {

	private Type[] data;

	/**
	 * Creates a TS.
	 * @param message the Message to which this Type belongs
	 */
	public TS(Message message) {
		super(message);
		data = new Type[2];
		data[0] = new NULLDT(message);
		data[1] = new NULLDT(message);
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
			throw new DataTypeException("Element " + number + " doesn't exist in 2 element TS composite"); 
		} 
	} 
	/**
	 * Returns Time (component #0).  This is a convenience method that saves you from 
	 * casting and handling an exception.
	 */
	public NULLDT getTime() {
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
	 * Returns Time (component #0).  This is a convenience method that saves you from 
	 * casting and handling an exception.
	 */
	public NULLDT getTs1_Time() {
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
	 * Returns Degree of Precision (component #1).  This is a convenience method that saves you from 
	 * casting and handling an exception.
	 */
	public NULLDT getDegreeOfPrecision() {
	   NULLDT ret = null;
	   try {
	      ret = (NULLDT)getComponent(1);
	   } catch (DataTypeException e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem accessing known data type component - this is a bug.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns Degree of Precision (component #1).  This is a convenience method that saves you from 
	 * casting and handling an exception.
	 */
	public NULLDT getTs2_DegreeOfPrecision() {
	   NULLDT ret = null;
	   try {
	      ret = (NULLDT)getComponent(1);
	   } catch (DataTypeException e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem accessing known data type component - this is a bug.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

}