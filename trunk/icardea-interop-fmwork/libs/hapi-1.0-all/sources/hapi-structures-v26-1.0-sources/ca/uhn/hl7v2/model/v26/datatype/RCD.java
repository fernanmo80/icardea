package ca.uhn.hl7v2.model.v26.datatype;

import ca.uhn.hl7v2.model.Composite;
import ca.uhn.hl7v2.model.DataTypeException;
import ca.uhn.hl7v2.model.Message;
import ca.uhn.hl7v2.model.Type;
import ca.uhn.hl7v2.model.AbstractType;
import ca.uhn.log.HapiLogFactory;

/**
 * <p>The HL7 RCD (Row Column Definition) data type.  Consists of the following components: </p><ol>
 * <li>Segment Field Name (ST)</li>
 * <li>HL7 Data Type (ID)</li>
 * <li>Maximum Column Width (NM)</li>
 * </ol>
 */
public class RCD extends AbstractType implements Composite {

	private Type[] data;

	/**
	 * Creates a RCD.
	 * @param message the Message to which this Type belongs
	 */
	public RCD(Message message) {
		super(message);
		data = new Type[3];
		data[0] = new ST(message);
		data[1] = new ID(message, 440);
		data[2] = new NM(message);
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
			throw new DataTypeException("Element " + number + " doesn't exist in 3 element RCD composite"); 
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
	public ST getRcd1_SegmentFieldName() {
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
	 * Returns HL7 Data Type (component #1).  This is a convenience method that saves you from 
	 * casting and handling an exception.
	 */
	public ID getHL7DataType() {
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
	 * Returns HL7 Data Type (component #1).  This is a convenience method that saves you from 
	 * casting and handling an exception.
	 */
	public ID getRcd2_HL7DataType() {
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
	 * Returns Maximum Column Width (component #2).  This is a convenience method that saves you from 
	 * casting and handling an exception.
	 */
	public NM getMaximumColumnWidth() {
	   NM ret = null;
	   try {
	      ret = (NM)getComponent(2);
	   } catch (DataTypeException e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem accessing known data type component - this is a bug.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns Maximum Column Width (component #2).  This is a convenience method that saves you from 
	 * casting and handling an exception.
	 */
	public NM getRcd3_MaximumColumnWidth() {
	   NM ret = null;
	   try {
	      ret = (NM)getComponent(2);
	   } catch (DataTypeException e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem accessing known data type component - this is a bug.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

}