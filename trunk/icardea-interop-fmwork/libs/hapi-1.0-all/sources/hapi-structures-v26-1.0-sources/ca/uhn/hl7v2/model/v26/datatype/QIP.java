package ca.uhn.hl7v2.model.v26.datatype;

import ca.uhn.hl7v2.model.Composite;
import ca.uhn.hl7v2.model.DataTypeException;
import ca.uhn.hl7v2.model.Message;
import ca.uhn.hl7v2.model.Type;
import ca.uhn.hl7v2.model.AbstractType;
import ca.uhn.log.HapiLogFactory;

/**
 * <p>The HL7 QIP (Query Input Parameter List) data type.  Consists of the following components: </p><ol>
 * <li>Segment Field Name (ST)</li>
 * <li>Values (ST)</li>
 * </ol>
 */
public class QIP extends AbstractType implements Composite {

	private Type[] data;

	/**
	 * Creates a QIP.
	 * @param message the Message to which this Type belongs
	 */
	public QIP(Message message) {
		super(message);
		data = new Type[2];
		data[0] = new ST(message);
		data[1] = new ST(message);
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
			throw new DataTypeException("Element " + number + " doesn't exist in 2 element QIP composite"); 
		} 
	} 
	/**
	 * Returns Segment Field Name (component #0).  This is a convenience method that saves you from 
	 * casting and handling an exception.
	 */
	public ST getSegmentFieldName() {
	   ST ret = null;
	   try {
	      ret = (ST)getComponent(0);
	   } catch (DataTypeException e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem accessing known data type component - this is a bug.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns Segment Field Name (component #0).  This is a convenience method that saves you from 
	 * casting and handling an exception.
	 */
	public ST getQip1_SegmentFieldName() {
	   ST ret = null;
	   try {
	      ret = (ST)getComponent(0);
	   } catch (DataTypeException e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem accessing known data type component - this is a bug.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns Values (component #1).  This is a convenience method that saves you from 
	 * casting and handling an exception.
	 */
	public ST getValues() {
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
	 * Returns Values (component #1).  This is a convenience method that saves you from 
	 * casting and handling an exception.
	 */
	public ST getQip2_Values() {
	   ST ret = null;
	   try {
	      ret = (ST)getComponent(1);
	   } catch (DataTypeException e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem accessing known data type component - this is a bug.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

}