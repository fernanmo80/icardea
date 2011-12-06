/**
 * VocabRuntimeOperationsServiceSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.5.1  Built on : Oct 19, 2009 (10:59:00 EDT)
 */
package org.hl7;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * VocabRuntimeOperationsServiceSkeleton java skeleton for the axisService
 */
public class VocabRuntimeOperationsServiceSkeleton {

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
				+ this.getClass().getName() + "#getServiceName");
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
				+ this.getClass().getName() + "#getServiceVersion");
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param lookupCodeSystemInfo
	 * @throws UnknownCodeSystem
	 *             :
	 * @throws CodeSystemNameIdMismatch
	 *             :
	 * @throws UnexpectedError
	 *             :
	 */

	public org.hl7.LookupCodeSystemInfoResponse lookupCodeSystemInfo(
			org.hl7.LookupCodeSystemInfo lookupCodeSystemInfo)
			throws UnknownCodeSystem, CodeSystemNameIdMismatch, UnexpectedError {
		// TODO : fill this with the necessary business logic
		throw new java.lang.UnsupportedOperationException("Please implement "
				+ this.getClass().getName() + "#lookupCodeSystemInfo");
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
				+ this.getClass().getName() + "#getServiceDescription");
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param areCodesRelated
	 * @throws UnknownRelationshipCode
	 *             :
	 * @throws UnknownRelationQualifier
	 *             :
	 * @throws UnknownConceptCode
	 *             :
	 * @throws UnknownCodeSystem
	 *             :
	 * @throws UnexpectedError
	 *             :
	 */

	public org.hl7.AreCodesRelatedResponse areCodesRelated(
			org.hl7.AreCodesRelated areCodesRelated)
			throws UnknownRelationshipCode, UnknownRelationQualifier,
			UnknownConceptCode, UnknownCodeSystem, UnexpectedError {
		// TODO : fill this with the necessary business logic
		throw new java.lang.UnsupportedOperationException("Please implement "
				+ this.getClass().getName() + "#areCodesRelated");
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param getSupportedCodeSystems
	 * @throws TimeoutError
	 *             :
	 * @throws UnexpectedError
	 *             :
	 */

	public org.hl7.GetSupportedCodeSystemsResponse getSupportedCodeSystems(
			org.hl7.GetSupportedCodeSystems getSupportedCodeSystems)
			throws TimeoutError, UnexpectedError {
		org.hl7.GetSupportedCodeSystemsResponse gscsr = new org.hl7.GetSupportedCodeSystemsResponse();
		CodeSystemIdAndVersions[] csivs;

		try {
			Connection conn = DBConnection.getDBConnection();
			Statement stat;
			stat = conn.createStatement();

			int sizeLimit = getSupportedCodeSystems.localSizeLimit;
			int timeLimit = getSupportedCodeSystems.localTimeout;

			ResultSet rs;
			if (sizeLimit == 0) {
				rs = stat.executeQuery("SELECT COUNT(*) FROM mrsab");
				if (rs.next()) {
					sizeLimit = rs.getInt(1);
				}
			}

			csivs = new CodeSystemIdAndVersions[sizeLimit];

			rs = stat.executeQuery("SELECT RSAB, SON, SVER FROM mrsab LIMIT " + sizeLimit);
			int counter = 0;

			while (rs.next()) {
				CodeSystemIdAndVersions csiv = new CodeSystemIdAndVersions();
				csiv.setCodeSystem_id(rs.getString("RSAB"));
				csiv.setCodeSystem_name(rs.getString("SON"));
				ArrayOf_xsd_string aoxs = new ArrayOf_xsd_string();
				String[] param = new String[1];
				param[0] = rs.getString("SVER");
				aoxs.setItem(param);
				csiv.setCodeSystem_versions(aoxs);
				csivs[counter] = csiv;
				counter++;
				if (counter == sizeLimit) {
					break;
				}
			}

			gscsr.setGetSupportedCodeSystemsReturn(csivs);

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return gscsr;

		// throw new java.lang.UnsupportedOperationException("Please implement "
		// + this.getClass().getName() + "#getSupportedCodeSystems");
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
				+ this.getClass().getName() + "#getCTSVersion");
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param lookupDesignation
	 * @throws UnknownLanguageCode
	 *             :
	 * @throws UnknownConceptCode
	 *             :
	 * @throws UnknownCodeSystem
	 *             :
	 * @throws UnexpectedError
	 *             :
	 * @throws NoApplicableDesignationFound
	 *             :
	 */

	public org.hl7.LookupDesignationResponse lookupDesignation(
			org.hl7.LookupDesignation lookupDesignation)
			throws UnknownLanguageCode, UnknownConceptCode, UnknownCodeSystem,
			UnexpectedError, NoApplicableDesignationFound {
		// TODO : fill this with the necessary business logic
		throw new java.lang.UnsupportedOperationException("Please implement "
				+ this.getClass().getName() + "#lookupDesignation");
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param isConceptIdValid
	 * @throws UnknownCodeSystem
	 *             :
	 * @throws UnexpectedError
	 *             :
	 */

	public org.hl7.IsConceptIdValidResponse isConceptIdValid(
			org.hl7.IsConceptIdValid isConceptIdValid)
			throws UnknownCodeSystem, UnexpectedError {
		// TODO : fill this with the necessary business logic
		throw new java.lang.UnsupportedOperationException("Please implement "
				+ this.getClass().getName() + "#isConceptIdValid");
	}

}
