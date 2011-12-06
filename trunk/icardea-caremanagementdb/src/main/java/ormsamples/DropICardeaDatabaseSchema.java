/**
 * Licensee: Gokce  Laleci
 * License Type: Evaluation
 */
package ormsamples;

import org.orm.*;
public class DropICardeaDatabaseSchema {
	public static void main(String[] args) {
		try {
			System.out.println("Are you sure to drop table(s)? (Y/N)");
			java.io.BufferedReader reader = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
			if (reader.readLine().trim().toUpperCase().equals("Y")) {
				ORMDatabaseInitiator.dropSchema(tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance());
				tr.com.srdc.icardea.hibernate.ICardeaPersistentManager.instance().disposePersistentManager();
			}
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
