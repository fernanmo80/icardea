package ca.uhn.hl7v2.model.v26.datatype;

import ca.uhn.hl7v2.model.Composite;
import ca.uhn.hl7v2.model.DataTypeException;
import ca.uhn.hl7v2.model.Message;
import ca.uhn.hl7v2.model.Type;
import ca.uhn.hl7v2.model.AbstractType;
import ca.uhn.log.HapiLogFactory;

/**
 * <p>The HL7 CE (Coded Element) data type.  Consists of the following components: </p><ol>
 * <li>Identifier (-)</li>
 * <li>Text (-)</li>
 * <li>Name of Coding System (-)</li>
 * <li>Alternate Identifier (-)</li>
 * <li>Alternate Text (-)</li>
 * <li>Name of Alternate Coding System (-)</li>
 * </ol>
 */
public class CE extends AbstractType implements Composite {

	private Type[] data;

	/**
	 * Creates a CE.
	 * @param message the Message to which this Type belongs
	 */
	public CE(Message message) {
		super(message);
		data = new Type[6];
		data[0] = new NULLDT(message);
		data[1] = new NULLDT(message);
		data[2] = new NULLDT(message);
		data[3] = new NULLDT(message);
		data[4] = new NULLDT(message);
		data[5] = new NULLDT(message);
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
			throw new DataTypeException("Element " + number + " doesn't exist in 6 element CE composite"); 
		} 
	} 
	/**
	 * Returns Identifier (component #0).  This is a convenience method that saves you from 
	 * casting and handling an exception.
	 */
	public NULLDT getIdentifier() {
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
	 * Returns Identifier (component #0).  This is a convenience method that saves you from 
	 * casting and handling an exception.
	 */
	public NULLDT getCe1_Identifier() {
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
	 * Returns Text (component #1).  This is a convenience method that saves you from 
	 * casting and handling an exception.
	 */
	public NULLDT getText() {
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
	 * Returns Text (component #1).  This is a convenience method that saves you from 
	 * casting and handling an exception.
	 */
	public NULLDT getCe2_Text() {
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
	 * Returns Name of Coding System (component #2).  This is a convenience method that saves you from 
	 * casting and handling an exception.
	 */
	public NULLDT getNameOfCodingSystem() {
	   NULLDT ret = null;
	   try {
	      ret = (NULLDT)getComponent(2);
	   } catch (DataTypeException e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem accessing known data type component - this is a bug.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns Name of Coding System (component #2).  This is a convenience method that saves you from 
	 * casting and handling an exception.
	 */
	public NULLDT getCe3_NameOfCodingSystem() {
	   NULLDT ret = null;
	   try {
	      ret = (NULLDT)getComponent(2);
	   } catch (DataTypeException e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem accessing known data type component - this is a bug.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns Alternate Identifier (component #3).  This is a convenience method that saves you from 
	 * casting and handling an exception.
	 */
	public NULLDT getAlternateIdentifier() {
	   NULLDT ret = null;
	   try {
	      ret = (NULLDT)getComponent(3);
	   } catch (DataTypeException e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem accessing known data type component - this is a bug.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns Alternate Identifier (component #3).  This is a convenience method that saves you from 
	 * casting and handling an exception.
	 */
	public NULLDT getCe4_AlternateIdentifier() {
	   NULLDT ret = null;
	   try {
	      ret = (NULLDT)getComponent(3);
	   } catch (DataTypeException e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem accessing known data type component - this is a bug.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns Alternate Text (component #4).  This is a convenience method that saves you from 
	 * casting and handling an exception.
	 */
	public NULLDT getAlternateText() {
	   NULLDT ret = null;
	   try {
	      ret = (NULLDT)getComponent(4);
	   } catch (DataTypeException e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem accessing known data type component - this is a bug.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns Alternate Text (component #4).  This is a convenience method that saves you from 
	 * casting and handling an exception.
	 */
	public NULLDT getCe5_AlternateText() {
	   NULLDT ret = null;
	   try {
	      ret = (NULLDT)getComponent(4);
	   } catch (DataTypeException e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem accessing known data type component - this is a bug.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns Name of Alternate Coding System (component #5).  This is a convenience method that saves you from 
	 * casting and handling an exception.
	 */
	public NULLDT getNameOfAlternateCodingSystem() {
	   NULLDT ret = null;
	   try {
	      ret = (NULLDT)getComponent(5);
	   } catch (DataTypeException e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem accessing known data type component - this is a bug.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns Name of Alternate Coding System (component #5).  This is a convenience method that saves you from 
	 * casting and handling an exception.
	 */
	public NULLDT getCe6_NameOfAlternateCodingSystem() {
	   NULLDT ret = null;
	   try {
	      ret = (NULLDT)getComponent(5);
	   } catch (DataTypeException e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem accessing known data type component - this is a bug.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

}