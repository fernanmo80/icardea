/**
 * RuntimeOperationsServiceSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.5.1  Built on : Oct 19, 2009 (10:59:00 EDT)
 */
package org.hl7;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.hl7.cts.BL;
import org.hl7.cts.CD;
import org.hl7.cts.INT;
import org.hl7.cts.ST;
import org.hl7.cts.UID;


/**
 * RuntimeOperationsServiceSkeleton java skeleton for the axisService
 */
public class RuntimeOperationsServiceSkeleton {

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
	 * @param lookupValueSetExpansion
	 * @throws UnknownLanguage
	 *             :
	 * @throws UnknownApplicationContextCode
	 *             :
	 * @throws UnknownVocabularyDomain
	 *             :
	 * @throws NoApplicableValueSet
	 *             :
	 * @throws TimeoutError
	 *             :
	 * @throws UnexpectedError
	 *             :
	 */

	public org.hl7.LookupValueSetExpansionResponse lookupValueSetExpansion(
			org.hl7.LookupValueSetExpansion lookupValueSetExpansion)
			throws UnknownLanguage, UnknownApplicationContextCode,
			UnknownVocabularyDomain, NoApplicableValueSet, TimeoutError,
			UnexpectedError {
		// TODO : fill this with the necessary business logic
		throw new java.lang.UnsupportedOperationException("Please implement "
				+ this.getClass().getName() + "#lookupValueSetExpansion");
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param expandValueSetExpansionContext
	 * @throws InvalidExpansionContext
	 *             :
	 * @throws TimeoutError
	 *             :
	 * @throws UnexpectedError
	 *             :
	 */

	public org.hl7.ExpandValueSetExpansionContextResponse expandValueSetExpansionContext(
			org.hl7.ExpandValueSetExpansionContext expandValueSetExpansionContext)
			throws InvalidExpansionContext, TimeoutError, UnexpectedError {
		// TODO : fill this with the necessary business logic
		throw new java.lang.UnsupportedOperationException("Please implement "
				+ this.getClass().getName() + "#expandValueSetExpansionContext");
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param getSupportedMatchAlgorithms
	 * @throws UnexpectedError
	 *             :
	 */

	public org.hl7.GetSupportedMatchAlgorithmsResponse getSupportedMatchAlgorithms(
			org.hl7.GetSupportedMatchAlgorithms getSupportedMatchAlgorithms)
			throws UnexpectedError {
		// TODO : fill this with the necessary business logic
		throw new java.lang.UnsupportedOperationException("Please implement "
				+ this.getClass().getName() + "#getSupportedMatchAlgorithms");
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param subsumes
	 * @throws SubsumptionNotSupported
	 *             :
	 * @throws QualifiersNotSupported
	 *             :
	 * @throws UnknownConceptCode
	 *             :
	 * @throws UnknownCodeSystem
	 *             :
	 * @throws UnrecognizedQualifier
	 *             :
	 * @throws UnexpectedError
	 *             :
	 */

	public org.hl7.SubsumesResponse subsumes(org.hl7.Subsumes subsumes)
			throws SubsumptionNotSupported, QualifiersNotSupported,
			UnknownConceptCode, UnknownCodeSystem, UnrecognizedQualifier,
			UnexpectedError {
		// TODO : fill this with the necessary business logic
		throw new java.lang.UnsupportedOperationException("Please implement "
				+ this.getClass().getName() + "#subsumes");
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
	 * @param fillInDetails
	 * @throws UnknownLanguage
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

	public org.hl7.FillInDetailsResponse fillInDetails(
			org.hl7.FillInDetails fillInDetails) throws UnknownLanguage,
			UnknownConceptCode, UnknownCodeSystem, UnexpectedError,
			NoApplicableDesignationFound {
		// TODO : fill this with the necessary business logic
		throw new java.lang.UnsupportedOperationException("Please implement "
				+ this.getClass().getName() + "#fillInDetails");
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
	 * @param validateCode
	 * @throws UnknownApplicationContextCode
	 *             :
	 * @throws UnknownVocabularyDomain
	 *             :
	 * @throws NoApplicableValueSet
	 *             :
	 * @throws UnexpectedError
	 *             :
	 */

	public org.hl7.ValidateCodeResponse validateCode(
			org.hl7.ValidateCode validateCode)
			throws UnknownApplicationContextCode, UnknownVocabularyDomain,
			NoApplicableValueSet, UnexpectedError {
		
		org.hl7.ValidateCodeResponse vcr = new org.hl7.ValidateCodeResponse();
		ValidateCodeReturn vcre = new ValidateCodeReturn();
		try {
		Connection conn = DBConnection.getDBConnection();		
		Statement stat;
		stat = conn.createStatement();
		
		String codeSystem = validateCode.localVocabularyDomain_name.getV();
		String code = validateCode.localCodeToValidate.getCode();
		
		ResultSet rs = stat.executeQuery("SELECT * FROM mrconso WHERE SAB='"+ codeSystem +"' AND CODE = '" + code + "'");
		if(rs.next()){
			INT integer = new INT();
			integer.setV(0);
			vcre.setNErrors(integer);		
		}else{
			INT integer = new INT();
			integer.setV(1);
			vcre.setNErrors(integer);
			ValidationDetail vd = new ValidationDetail();
			BL bl = new BL();
			bl.setV(true);
			vd.setIsError(bl);
			ST st = new ST();
			st.setV("Given code is not valid in given code system.");
			vd.setErrorText(st);
			ArrayOfValidationDetail avd = new ArrayOfValidationDetail();
			avd.addItem(vd);
			vcre.setDetail(avd);
		}
				
		vcr.setValidateCodeReturn(vcre);
		
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return vcr;
		// TODO : fill this with the necessary business logic
		//throw new java.lang.UnsupportedOperationException("Please implement "
				//+ this.getClass().getName() + "#validateCode");
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param getServiceName
	 * @throws UnexpectedError
	 *             :
	 */

	public org.hl7.GetServiceNameResponse getServiceName(
			org.hl7.GetServiceName getServiceName) throws UnexpectedError {		
		org.hl7.GetServiceNameResponse tcr = new org.hl7.GetServiceNameResponse();
		try {
		Connection conn = DBConnection.getDBConnection();
		
		Statement stat;
		
			stat = conn.createStatement();
		
		
		ResultSet rs = stat.executeQuery("SELECT SAB FROM mrconso WHERE AUI='A0016458'");
		if(rs.next()){
			System.out.println(rs.getString("SAB"));
		}
		/*ST st = new ST();
		st.setV("erdemalpay");
		tcr.setGetServiceNameReturn(st);*/
		
		} 
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return tcr;
		
		// TODO : fill this with the necessary business logic
		//throw new java.lang.UnsupportedOperationException("Please implement "
			//	+ this.getClass().getName() + "#getServiceName");
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param validateTranslation
	 * @throws UnknownApplicationContextCode
	 *             :
	 * @throws UnknownVocabularyDomain
	 *             :
	 * @throws UnexpectedError
	 *             :
	 */

	public org.hl7.ValidateTranslationResponse validateTranslation(
			org.hl7.ValidateTranslation validateTranslation)
			throws UnknownApplicationContextCode, UnknownVocabularyDomain,
			UnexpectedError {
		// TODO : fill this with the necessary business logic
		throw new java.lang.UnsupportedOperationException("Please implement "
				+ this.getClass().getName() + "#validateTranslation");
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param getSupportedVocabularyDomains
	 * @throws UnknownMatchAlgorithm
	 *             :
	 * @throws BadlyFormedMatchText
	 *             :
	 * @throws TimeoutError
	 *             :
	 * @throws UnexpectedError
	 *             :
	 */

	public org.hl7.GetSupportedVocabularyDomainsResponse getSupportedVocabularyDomains(
			org.hl7.GetSupportedVocabularyDomains getSupportedVocabularyDomains)
			throws UnknownMatchAlgorithm, BadlyFormedMatchText, TimeoutError,
			UnexpectedError {
		GetSupportedVocabularyDomainsResponse gsvdr = new GetSupportedVocabularyDomainsResponse();
		System.out.println(getSupportedVocabularyDomains.localMatchText.getV());
		System.out.println(getSupportedVocabularyDomains.localMatchAlgorithm_code.getV());
		System.out.println(getSupportedVocabularyDomains.localSizeLimit);
		
		ST[] sts = new ST[1];
		ST st = new ST();
		st.setV("erdem");
		sts[0] = st;
		gsvdr.setGetSupportedVocabularyDomainsReturn(sts);
		return gsvdr;
		// TODO : fill this with the necessary business logic
		//throw new java.lang.UnsupportedOperationException("Please implement "
			//	+ this.getClass().getName() + "#getSupportedVocabularyDomains");
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param areEquivalent
	 * @throws SubsumptionNotSupported
	 *             :
	 * @throws QualifiersNotSupported
	 *             :
	 * @throws UnknownConceptCode
	 *             :
	 * @throws UnknownCodeSystem
	 *             :
	 * @throws UnrecognizedQualifier
	 *             :
	 * @throws UnexpectedError
	 *             :
	 */

	public org.hl7.AreEquivalentResponse areEquivalent(
			org.hl7.AreEquivalent areEquivalent)
			throws SubsumptionNotSupported, QualifiersNotSupported,
			UnknownConceptCode, UnknownCodeSystem, UnrecognizedQualifier,
			UnexpectedError {
		// TODO : fill this with the necessary business logic
		throw new java.lang.UnsupportedOperationException("Please implement "
				+ this.getClass().getName() + "#areEquivalent");
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param translateCode
	 * @throws UnknownApplicationContextCode
	 *             :
	 * @throws UnknownVocabularyDomain
	 *             :
	 * @throws UnableToTranslate
	 *             :
	 * @throws UnknownCodeSystem
	 *             :
	 * @throws UnexpectedError
	 *             :
	 */

	public org.hl7.TranslateCodeResponse translateCode(
			org.hl7.TranslateCode translateCode)
			throws UnknownApplicationContextCode, UnknownVocabularyDomain,
			UnableToTranslate, UnknownCodeSystem, UnexpectedError {
				
		org.hl7.TranslateCodeResponse tcr = new org.hl7.TranslateCodeResponse();
		try {
		Connection conn = DBConnection.getDBConnection();		
		Statement stat;
		stat = conn.createStatement();
		
		String fromCodeSystem = translateCode.localParm1.getV();
		String fromCode = translateCode.localParm2.getCode();
		String toCodeSystem = translateCode.localParm3.getV();
		String toCode = "";
		
		ResultSet rs = stat.executeQuery("SELECT SAB FROM mrconso WHERE SAB='"+ toCodeSystem +"'");
		if(!toCodeSystem.equals("UMLS") && !rs.next()){
			UnknownCodeSystem ucs = new UnknownCodeSystem();
			UID uid = new UID();
			uid.setV(toCodeSystem);
			ucs.setCodeSystem_id(toCodeSystem);
			throw ucs;
		}
		
		rs = stat.executeQuery("SELECT SAB FROM mrconso WHERE SAB='"+ fromCodeSystem +"'");
		if(!rs.next()){
			UnknownCodeSystem ucs = new UnknownCodeSystem();
			UID uid = new UID();
			uid.setV(fromCodeSystem);
			ucs.setCodeSystem_id(fromCodeSystem);
			throw ucs;
		}
		
		rs = stat.executeQuery("SELECT CODE FROM mrconso WHERE CODE='"+ fromCode +"'");
		if(!rs.next()){
			System.out.println("TRACE2");
			UnableToTranslate utt = new UnableToTranslate();			
			throw utt;
		}
	
		String colName="";	
		if(toCodeSystem.equals("UMLS")) {
			rs = stat.executeQuery("SELECT DISTINCT CUI " + 
				"FROM mrconso " + 
				"WHERE SAB = '"+ fromCodeSystem +"' " + "AND CODE = '"+ fromCode +"'");
			colName="CUI";
		} else {
			colName="CODE";
			rs = stat.executeQuery(
					"SELECT DISTINCT CODE " +
					"FROM mrconso " +
					"WHERE SAB='"+ toCodeSystem +
						"' AND CUI = (" +
								"SELECT DISTINCT CUI " +
								"FROM mrconso " +
								"WHERE SAB = '"+ fromCodeSystem +"' " +
										"AND CODE = '"+ fromCode +"')");
		}
		if(rs.next()){
			toCode = rs.getString(colName);
		}else{
			UnableToTranslate utt = new UnableToTranslate();			
			throw utt;
		}		
		CD cd = new CD();
		cd.setCode(toCode);
		cd.setCodeSystem(toCodeSystem);
		tcr.setTranslateCodeReturn(cd);
		
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			UnableToTranslate utt = new UnableToTranslate();
			throw utt;
		}catch (UnknownCodeSystem e){
			throw new java.lang.UnsupportedOperationException("Unknown code system " + e.getCodeSystem_id() + ". Please check the code system.");					
		}
		return tcr;
		// TODO : fill this with the necessary business logic
		//throw new java.lang.UnsupportedOperationException("Please implement "
			//	+ this.getClass().getName() + "#translateCode");
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param getHL7ReleaseVersion
	 * @throws UnexpectedError
	 *             :
	 */

	public org.hl7.GetHL7ReleaseVersionResponse getHL7ReleaseVersion(
			org.hl7.GetHL7ReleaseVersion getHL7ReleaseVersion)
			throws UnexpectedError {
		// TODO : fill this with the necessary business logic
		throw new java.lang.UnsupportedOperationException("Please implement "
				+ this.getClass().getName() + "#getHL7ReleaseVersion");
	}

}
