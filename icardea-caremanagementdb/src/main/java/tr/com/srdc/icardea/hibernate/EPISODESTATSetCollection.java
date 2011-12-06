/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: Gokce  Laleci
 * License Type: Evaluation
 */
package tr.com.srdc.icardea.hibernate;

import org.orm.*;

public class EPISODESTATSetCollection extends org.orm.util.ORMSet {
	public EPISODESTATSetCollection(Object owner, org.orm.util.ORMAdapter adapter, int ownerKey, int targetKey, int collType) {
		super(owner, adapter, ownerKey, targetKey, true, collType);
	}
	
	public EPISODESTATSetCollection(Object owner, org.orm.util.ORMAdapter adapter, int ownerKey, int collType) {
		super(owner, adapter, ownerKey, -1, false, collType);
	}
	
	/**
	* Return an iterator over the persistent objects
	* @return The persisten objects iterator
	*/
	public java.util.Iterator getIterator() {
		return super.getIterator(_ownerAdapter);
	}
	
	/**
	 * Add the specified persistent object to ORMSet
	 * @param value the persistent object
	 */
	public void add(EPISODESTAT value) {
		if (value != null) {
			super.add(value, value._ormAdapter);
		}
	}
	
	/**
	 * Remove the specified persistent object from ORMSet
	 * @param value the persistent object
	 */
	public void remove(EPISODESTAT value) {
		super.remove(value, value._ormAdapter);
	}
	
	/**
	 * Return true if ORMSet contains the specified persistent object
	 * @param value the persistent object
	 * @return True if this contains the specified persistent object
	 */
	public boolean contains(EPISODESTAT value) {
		return super.contains(value);
	}
	
	/**
	 * Return an array containing all of the persistent objects in ORMSet
	 * @return The persistent objects array
	 */
	public EPISODESTAT[] toArray() {
		return (EPISODESTAT[]) super.toArray(new EPISODESTAT[size()]);
	}
	
	/**
	 * Return an sorted array containing all of the persistent objects in ORMSet
	 * @param propertyName Name of the property for sorting:<ul>
	 * <li>ID</li>
	 * <li>type</li>
	 * <li>type_induced</li>
	 * <li>vendor_type</li>
	 * <li>recent_count</li>
	 * <li>recent_count_dtm_start</li>
	 * <li>recent_count_dtm_end</li>
	 * <li>total_count</li>
	 * <li>total_count_dtm_start</li>
	 * <li>total_count_dtm_end</li>
	 * <li>subID</li>
	 * </ul>
	 * @return The persistent objects sorted array
	 */
	public EPISODESTAT[] toArray(String propertyName) {
		return toArray(propertyName, true);
	}
	
	/**
	 * Return an sorted array containing all of the persistent objects in ORMSet
	 * @param propertyName Name of the property for sorting:<ul>
	 * <li>ID</li>
	 * <li>type</li>
	 * <li>type_induced</li>
	 * <li>vendor_type</li>
	 * <li>recent_count</li>
	 * <li>recent_count_dtm_start</li>
	 * <li>recent_count_dtm_end</li>
	 * <li>total_count</li>
	 * <li>total_count_dtm_start</li>
	 * <li>total_count_dtm_end</li>
	 * <li>subID</li>
	 * </ul>
	 * @param ascending true for ascending, false for descending
	 * @return The persistent objects sorted array
	 */
	public EPISODESTAT[] toArray(String propertyName, boolean ascending) {
		return (EPISODESTAT[]) super.toArray(new EPISODESTAT[size()], propertyName, ascending);
	}
	
	protected PersistentManager getPersistentManager() throws PersistentException {
		return tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance();
	}
	
}

