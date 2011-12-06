/**
 * CodeMappingOperationsServiceSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.5.1  Built on : Oct 19, 2009 (10:59:00 EDT)
 */
package org.hl7;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 * CodeMappingOperationsServiceSkeleton java skeleton for the axisService
 */



public class CodeMappingOperationsServiceSkeleton {
	
	/**
	 * Auto generated method signature
	 * 
	 * @param getServiceName
	 * @throws UnexpectedError
	 *             :
	 */

	public org.hl7.GetServiceNameResponse getServiceName(
			org.hl7.GetServiceName getServiceName) throws UnexpectedError {
		// TODO : fill this with the necessary business logic
		throw new java.lang.UnsupportedOperationException("Please implement "
				+ this.getClass() + "#getServiceName");
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param getServiceVersion
	 * @throws UnexpectedError
	 *             :
	 */

	public org.hl7.GetServiceVersionResponse getServiceVersion(
			org.hl7.GetServiceVersion getServiceVersion) throws UnexpectedError {
		// TODO : fill this with the necessary business logic
		throw new java.lang.UnsupportedOperationException("Please implement "
				+ this.getClass() + "#getServiceVersion");
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param getSupportedMaps
	 * @throws UnexpectedError
	 *             :
	 */

	public org.hl7.GetSupportedMapsResponse getSupportedMaps(
			org.hl7.GetSupportedMaps getSupportedMaps) throws UnexpectedError {
		GetSupportedMapsResponse gsmr = new GetSupportedMapsResponse();
		CodeMap[] cms = null;
		

		try {
			Connection conn = DBConnection.getDBConnection();
			Statement stat;
			stat = conn.createStatement();
			ResultSet rs;
			
			
			ArrayList<String> sabList = new ArrayList<String>();
			ArrayList<ArrayList<String>> cuiList = new ArrayList<ArrayList<String>>();
			//ArrayList<String> sonList = new ArrayList<String>();
			//ArrayList<String> verList = new ArrayList<String>();
			
			rs = stat.executeQuery("SELECT DISTINCT SAB FROM mrconso");
			while(rs.next()){
				sabList.add(rs.getString("SAB"));
			}
			
			/*for(int i = 0; i < sabList.size();i++){				
				rs = stat.executeQuery("SELECT DISTINCT SAB FROM mrconso WHERE CUI IN (SELECT CUI FROM mrconso WHERE SAB = '" + sabList.get(i) + "'");
				while(rs.next()){
					ArrayList<String> cList = new ArrayList<String>();
					cList.add(sabList.get(i));
					cList.add(rs.getString("CUI"));
					cuiList.add(cList);
				}				
			}*/
			
			
			//This part is for sending full name and version of code system
			
			/*for(int i = 0; i < sabList.size();i++){
				rs = stat.executeQuery("SELECT SON, SVER FROM mrsab WHERE RSAB = '" + sabList.get(i) + "'");
				while(rs.next()){
					sonList.add(rs.getString("SON"));
					verList.add(rs.getString("SVER"));
				}
			}*/
			cms = new CodeMap[sabList.size() * (sabList.size() - 1)];
			rs.close();
			int counter = 0;
			for(int i = 0; i < sabList.size();i++){
				for(int j = 0; j < sabList.size();j++){
					if(i==j){
						continue;
					}
					CodeMap cm = new CodeMap();
					cm.setFromCodeSystem_id(sabList.get(i));
					//cm.setFromCodeSystem_name(sonList.get(i));
					//cm.setFromCodeSystem_version(verList.get(i));
					cm.setToCodeSystem_id(sabList.get(j));
					//cm.setToCodeSystem_name(sonList.get(j));
					//cm.setToCodeSystem_version(verList.get(j));
					cms[counter] = cm;
					counter++;
				}				
			}		
			
			gsmr.setGetSupportedMapsReturn(cms);

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return gsmr;
		// TODO : fill this with the necessary business logic
		//throw new java.lang.UnsupportedOperationException("Please implement "
			//	+ this.getClass() + "#getSupportedMaps");
	}
	
	

	/**
	 * Auto generated method signature
	 * 
	 * @param getServiceDescription
	 * @throws UnexpectedError
	 *             :
	 */

	public org.hl7.GetServiceDescriptionResponse getServiceDescription(
			org.hl7.GetServiceDescription getServiceDescription)
			throws UnexpectedError {
		// TODO : fill this with the necessary business logic
		throw new java.lang.UnsupportedOperationException("Please implement "
				+ this.getClass() + "#getServiceDescription");
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param getCTSVersion
	 * @throws UnexpectedError
	 *             :
	 */

	public org.hl7.GetCTSVersionResponse getCTSVersion(
			org.hl7.GetCTSVersion getCTSVersion) throws UnexpectedError {
		// TODO : fill this with the necessary business logic
		throw new java.lang.UnsupportedOperationException("Please implement "
				+ this.getClass() + "#getCTSVersion");
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param mapConceptCode
	 * @throws AmbiguousMapRequest
	 *             :
	 * @throws MapNameTargetMismatch
	 *             :
	 * @throws UnableToMap
	 *             :
	 * @throws MapNameSourceMismatch
	 *             :
	 * @throws UnknownMapName
	 *             :
	 * @throws UnknownConceptCode
	 *             :
	 * @throws MappingNotAvailable
	 *             :
	 * @throws UnknownCodeSystem
	 *             :
	 * @throws UnexpectedError
	 *             :
	 */

	public org.hl7.MapConceptCodeResponse mapConceptCode(
			org.hl7.MapConceptCode mapConceptCode) throws AmbiguousMapRequest,
			MapNameTargetMismatch, UnableToMap, MapNameSourceMismatch,
			UnknownMapName, UnknownConceptCode, MappingNotAvailable,
			UnknownCodeSystem, UnexpectedError {
		// TODO : fill this with the necessary business logic
		throw new java.lang.UnsupportedOperationException("Please implement "
				+ this.getClass() + "#mapConceptCode");
	}
	

}
