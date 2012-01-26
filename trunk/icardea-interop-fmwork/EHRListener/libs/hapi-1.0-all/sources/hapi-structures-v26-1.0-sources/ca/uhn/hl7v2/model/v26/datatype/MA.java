package ca.uhn.hl7v2.model.v26.datatype;

import ca.uhn.hl7v2.model.Composite;
import ca.uhn.hl7v2.model.DataTypeException;
import ca.uhn.hl7v2.model.Message;
import ca.uhn.hl7v2.model.Type;
import ca.uhn.hl7v2.model.AbstractType;
import ca.uhn.log.HapiLogFactory;

/**
 * <p>The HL7 MA (Multiplexed Array) data type.  Consists of the following components: </p><ol>
 * <li>Sample Y From Channel 1 (NM)</li>
 * <li>Sample Y From Channel 2 (NM)</li>
 * <li>Sample Y From Channel 3 (NM)</li>
 * <li>Sample Y From Channel 4 (NM)</li>
 * </ol>
 */
public class MA extends AbstractType implements Composite {

	private Type[] data;

	/**
	 * Creates a MA.
	 * @param message the Message to which this Type belongs
	 */
	public MA(Message message) {
		super(message);
		data = new Type[4];
		data[0] = new NM(message);
		data[1] = new NM(message);
		data[2] = new NM(message);
		data[3] = new NM(message);
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
			throw new DataTypeException("Element " + number + " doesn't exist in 4 element MA composite"); 
		} 
	} 
	/**
	 * Returns Sample Y From Channel 1 (component #0).  This is a convenience method that saves you from 
	 * casting and handling an exception.
	 */
	public NM getSampleYFromChannel1() {
	   NM ret = null;
	   try {
	      ret = (NM)getComponent(0);
	   } catch (DataTypeException e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem accessing known data type component - this is a bug.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns Sample Y From Channel 1 (component #0).  This is a convenience method that saves you from 
	 * casting and handling an exception.
	 */
	public NM getMa1_SampleYFromChannel1() {
	   NM ret = null;
	   try {
	      ret = (NM)getComponent(0);
	   } catch (DataTypeException e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem accessing known data type component - this is a bug.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns Sample Y From Channel 2 (component #1).  This is a convenience method that saves you from 
	 * casting and handling an exception.
	 */
	public NM getSampleYFromChannel2() {
	   NM ret = null;
	   try {
	      ret = (NM)getComponent(1);
	   } catch (DataTypeException e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem accessing known data type component - this is a bug.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns Sample Y From Channel 2 (component #1).  This is a convenience method that saves you from 
	 * casting and handling an exception.
	 */
	public NM getMa2_SampleYFromChannel2() {
	   NM ret = null;
	   try {
	      ret = (NM)getComponent(1);
	   } catch (DataTypeException e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem accessing known data type component - this is a bug.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns Sample Y From Channel 3 (component #2).  This is a convenience method that saves you from 
	 * casting and handling an exception.
	 */
	public NM getSampleYFromChannel3() {
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
	 * Returns Sample Y From Channel 3 (component #2).  This is a convenience method that saves you from 
	 * casting and handling an exception.
	 */
	public NM getMa3_SampleYFromChannel3() {
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
	 * Returns Sample Y From Channel 4 (component #3).  This is a convenience method that saves you from 
	 * casting and handling an exception.
	 */
	public NM getSampleYFromChannel4() {
	   NM ret = null;
	   try {
	      ret = (NM)getComponent(3);
	   } catch (DataTypeException e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem accessing known data type component - this is a bug.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns Sample Y From Channel 4 (component #3).  This is a convenience method that saves you from 
	 * casting and handling an exception.
	 */
	public NM getMa4_SampleYFromChannel4() {
	   NM ret = null;
	   try {
	      ret = (NM)getComponent(3);
	   } catch (DataTypeException e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem accessing known data type component - this is a bug.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

}