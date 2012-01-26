package ca.uhn.hl7v2.model.v26.datatype;

import ca.uhn.hl7v2.model.Composite;
import ca.uhn.hl7v2.model.DataTypeException;
import ca.uhn.hl7v2.model.Message;
import ca.uhn.hl7v2.model.Type;
import ca.uhn.hl7v2.model.AbstractType;
import ca.uhn.log.HapiLogFactory;

/**
 * <p>The HL7 EIP (Entity Identifier Pair) data type.  Consists of the following components: </p><ol>
 * <li>Placer Assigned Identifier (EI)</li>
 * <li>Filler Assigned Identifier (EI)</li>
 * </ol>
 */
public class EIP extends AbstractType implements Composite {

	private Type[] data;

	/**
	 * Creates a EIP.
	 * @param message the Message to which this Type belongs
	 */
	public EIP(Message message) {
		super(message);
		data = new Type[2];
		data[0] = new EI(message);
		data[1] = new EI(message);
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
			throw new DataTypeException("Element " + number + " doesn't exist in 2 element EIP composite"); 
		} 
	} 
	/**
	 * Returns Placer Assigned Identifier (component #0).  This is a convenience method that saves you from 
	 * casting and handling an exception.
	 */
	public EI getPlacerAssignedIdentifier() {
	   EI ret = null;
	   try {
	      ret = (EI)getComponent(0);
	   } catch (DataTypeException e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem accessing known data type component - this is a bug.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns Placer Assigned Identifier (component #0).  This is a convenience method that saves you from 
	 * casting and handling an exception.
	 */
	public EI getEip1_PlacerAssignedIdentifier() {
	   EI ret = null;
	   try {
	      ret = (EI)getComponent(0);
	   } catch (DataTypeException e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem accessing known data type component - this is a bug.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns Filler Assigned Identifier (component #1).  This is a convenience method that saves you from 
	 * casting and handling an exception.
	 */
	public EI getFillerAssignedIdentifier() {
	   EI ret = null;
	   try {
	      ret = (EI)getComponent(1);
	   } catch (DataTypeException e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem accessing known data type component - this is a bug.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns Filler Assigned Identifier (component #1).  This is a convenience method that saves you from 
	 * casting and handling an exception.
	 */
	public EI getEip2_FillerAssignedIdentifier() {
	   EI ret = null;
	   try {
	      ret = (EI)getComponent(1);
	   } catch (DataTypeException e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem accessing known data type component - this is a bug.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

}