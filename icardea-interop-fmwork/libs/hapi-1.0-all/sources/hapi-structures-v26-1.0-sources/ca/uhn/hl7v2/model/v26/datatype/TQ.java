package ca.uhn.hl7v2.model.v26.datatype;

import ca.uhn.hl7v2.model.Composite;
import ca.uhn.hl7v2.model.DataTypeException;
import ca.uhn.hl7v2.model.Message;
import ca.uhn.hl7v2.model.Type;
import ca.uhn.hl7v2.model.AbstractType;
import ca.uhn.log.HapiLogFactory;

/**
 * <p>The HL7 TQ (Timing Quantity) data type.  Consists of the following components: </p><ol>
 * <li>Quantity (CQ)</li>
 * <li>Interval (RI)</li>
 * <li>Duration (ST)</li>
 * <li>Start Date/Time (DTM)</li>
 * <li>End Date/Time (DTM)</li>
 * <li>Priority (ST)</li>
 * <li>Condition (ST)</li>
 * <li>Text (TX)</li>
 * <li>Conjunction (ID)</li>
 * <li>Order Sequencing (OSD)</li>
 * <li>Occurrence Duration (CWE)</li>
 * <li>Total Occurrences (NM)</li>
 * </ol>
 */
public class TQ extends AbstractType implements Composite {

	private Type[] data;

	/**
	 * Creates a TQ.
	 * @param message the Message to which this Type belongs
	 */
	public TQ(Message message) {
		super(message);
		data = new Type[12];
		data[0] = new CQ(message);
		data[1] = new RI(message);
		data[2] = new ST(message);
		data[3] = new DTM(message);
		data[4] = new DTM(message);
		data[5] = new ST(message);
		data[6] = new ST(message);
		data[7] = new TX(message);
		data[8] = new ID(message, 472);
		data[9] = new OSD(message);
		data[10] = new CWE(message);
		data[11] = new NM(message);
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
			throw new DataTypeException("Element " + number + " doesn't exist in 12 element TQ composite"); 
		} 
	} 
	/**
	 * Returns Quantity (component #0).  This is a convenience method that saves you from 
	 * casting and handling an exception.
	 */
	public CQ getQuantity() {
	   CQ ret = null;
	   try {
	      ret = (CQ)getComponent(0);
	   } catch (DataTypeException e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem accessing known data type component - this is a bug.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns Quantity (component #0).  This is a convenience method that saves you from 
	 * casting and handling an exception.
	 */
	public CQ getTq1_Quantity() {
	   CQ ret = null;
	   try {
	      ret = (CQ)getComponent(0);
	   } catch (DataTypeException e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem accessing known data type component - this is a bug.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns Interval (component #1).  This is a convenience method that saves you from 
	 * casting and handling an exception.
	 */
	public RI getInterval() {
	   RI ret = null;
	   try {
	      ret = (RI)getComponent(1);
	   } catch (DataTypeException e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem accessing known data type component - this is a bug.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns Interval (component #1).  This is a convenience method that saves you from 
	 * casting and handling an exception.
	 */
	public RI getTq2_Interval() {
	   RI ret = null;
	   try {
	      ret = (RI)getComponent(1);
	   } catch (DataTypeException e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem accessing known data type component - this is a bug.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns Duration (component #2).  This is a convenience method that saves you from 
	 * casting and handling an exception.
	 */
	public ST getDuration() {
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
	 * Returns Duration (component #2).  This is a convenience method that saves you from 
	 * casting and handling an exception.
	 */
	public ST getTq3_Duration() {
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
	 * Returns Start Date/Time (component #3).  This is a convenience method that saves you from 
	 * casting and handling an exception.
	 */
	public DTM getStartDateTime() {
	   DTM ret = null;
	   try {
	      ret = (DTM)getComponent(3);
	   } catch (DataTypeException e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem accessing known data type component - this is a bug.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns Start Date/Time (component #3).  This is a convenience method that saves you from 
	 * casting and handling an exception.
	 */
	public DTM getTq4_StartDateTime() {
	   DTM ret = null;
	   try {
	      ret = (DTM)getComponent(3);
	   } catch (DataTypeException e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem accessing known data type component - this is a bug.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns End Date/Time (component #4).  This is a convenience method that saves you from 
	 * casting and handling an exception.
	 */
	public DTM getEndDateTime() {
	   DTM ret = null;
	   try {
	      ret = (DTM)getComponent(4);
	   } catch (DataTypeException e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem accessing known data type component - this is a bug.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns End Date/Time (component #4).  This is a convenience method that saves you from 
	 * casting and handling an exception.
	 */
	public DTM getTq5_EndDateTime() {
	   DTM ret = null;
	   try {
	      ret = (DTM)getComponent(4);
	   } catch (DataTypeException e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem accessing known data type component - this is a bug.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns Priority (component #5).  This is a convenience method that saves you from 
	 * casting and handling an exception.
	 */
	public ST getPriority() {
	   ST ret = null;
	   try {
	      ret = (ST)getComponent(5);
	   } catch (DataTypeException e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem accessing known data type component - this is a bug.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns Priority (component #5).  This is a convenience method that saves you from 
	 * casting and handling an exception.
	 */
	public ST getTq6_Priority() {
	   ST ret = null;
	   try {
	      ret = (ST)getComponent(5);
	   } catch (DataTypeException e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem accessing known data type component - this is a bug.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns Condition (component #6).  This is a convenience method that saves you from 
	 * casting and handling an exception.
	 */
	public ST getCondition() {
	   ST ret = null;
	   try {
	      ret = (ST)getComponent(6);
	   } catch (DataTypeException e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem accessing known data type component - this is a bug.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns Condition (component #6).  This is a convenience method that saves you from 
	 * casting and handling an exception.
	 */
	public ST getTq7_Condition() {
	   ST ret = null;
	   try {
	      ret = (ST)getComponent(6);
	   } catch (DataTypeException e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem accessing known data type component - this is a bug.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns Text (component #7).  This is a convenience method that saves you from 
	 * casting and handling an exception.
	 */
	public TX getText() {
	   TX ret = null;
	   try {
	      ret = (TX)getComponent(7);
	   } catch (DataTypeException e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem accessing known data type component - this is a bug.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns Text (component #7).  This is a convenience method that saves you from 
	 * casting and handling an exception.
	 */
	public TX getTq8_Text() {
	   TX ret = null;
	   try {
	      ret = (TX)getComponent(7);
	   } catch (DataTypeException e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem accessing known data type component - this is a bug.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns Conjunction (component #8).  This is a convenience method that saves you from 
	 * casting and handling an exception.
	 */
	public ID getConjunction() {
	   ID ret = null;
	   try {
	      ret = (ID)getComponent(8);
	   } catch (DataTypeException e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem accessing known data type component - this is a bug.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns Conjunction (component #8).  This is a convenience method that saves you from 
	 * casting and handling an exception.
	 */
	public ID getTq9_Conjunction() {
	   ID ret = null;
	   try {
	      ret = (ID)getComponent(8);
	   } catch (DataTypeException e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem accessing known data type component - this is a bug.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns Order Sequencing (component #9).  This is a convenience method that saves you from 
	 * casting and handling an exception.
	 */
	public OSD getOrderSequencing() {
	   OSD ret = null;
	   try {
	      ret = (OSD)getComponent(9);
	   } catch (DataTypeException e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem accessing known data type component - this is a bug.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns Order Sequencing (component #9).  This is a convenience method that saves you from 
	 * casting and handling an exception.
	 */
	public OSD getTq10_OrderSequencing() {
	   OSD ret = null;
	   try {
	      ret = (OSD)getComponent(9);
	   } catch (DataTypeException e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem accessing known data type component - this is a bug.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns Occurrence Duration (component #10).  This is a convenience method that saves you from 
	 * casting and handling an exception.
	 */
	public CWE getOccurrenceDuration() {
	   CWE ret = null;
	   try {
	      ret = (CWE)getComponent(10);
	   } catch (DataTypeException e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem accessing known data type component - this is a bug.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns Occurrence Duration (component #10).  This is a convenience method that saves you from 
	 * casting and handling an exception.
	 */
	public CWE getTq11_OccurrenceDuration() {
	   CWE ret = null;
	   try {
	      ret = (CWE)getComponent(10);
	   } catch (DataTypeException e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem accessing known data type component - this is a bug.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns Total Occurrences (component #11).  This is a convenience method that saves you from 
	 * casting and handling an exception.
	 */
	public NM getTotalOccurrences() {
	   NM ret = null;
	   try {
	      ret = (NM)getComponent(11);
	   } catch (DataTypeException e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem accessing known data type component - this is a bug.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns Total Occurrences (component #11).  This is a convenience method that saves you from 
	 * casting and handling an exception.
	 */
	public NM getTq12_TotalOccurrences() {
	   NM ret = null;
	   try {
	      ret = (NM)getComponent(11);
	   } catch (DataTypeException e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem accessing known data type component - this is a bug.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

}