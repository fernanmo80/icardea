/**
 * Licensee: Gokce  Laleci
 * License Type: Evaluation
 */
package ormsamples;

import org.orm.*;
public class CreateICardeaDatabaseSchema {
	public static void main(String[] args) {
		try {
			ORMDatabaseInitiator.createSchema(tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance());
			tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().disposePersistentManager();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
