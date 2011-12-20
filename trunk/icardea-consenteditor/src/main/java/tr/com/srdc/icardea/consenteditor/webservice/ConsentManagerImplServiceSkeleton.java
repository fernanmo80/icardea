/**
 * ConsentManagerImplServiceSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.5.1  Built on : Oct 19, 2009 (10:59:00 EDT)
 */
package tr.com.srdc.icardea.consenteditor.webservice;

import java.net.UnknownHostException;
import java.util.ResourceBundle;

import tr.com.srdc.icardea.atnalog.client.Audit;

import tr.com.srdc.icardea.consenteditor.controller.ConsentManagerImpl;
import tr.com.srdc.icardea.consenteditor.controller.ConsentManagerInterface;
import tr.com.srdc.icardea.consenteditor.util.SAMLUtil;

/**
 * ConsentManagerImplServiceSkeleton java skeleton for the axisService
 */
public class ConsentManagerImplServiceSkeleton {

	public ConsentManagerInterface cmInterface = new ConsentManagerImpl();

	/**
	 * Auto generated method signature
	 * 
	 * @param getResources
	 */

	public tr.com.srdc.icardea.consenteditor.webservice.GetResourcesResponse getResources(
			tr.com.srdc.icardea.consenteditor.webservice.GetResources getResources) {
		GetResourcesResponse response = new GetResourcesResponse();
		ArrayOf_xsd_anyType result = new ArrayOf_xsd_anyType();
		result.setItem(cmInterface.getResources().toArray());
		response.setGetResourcesReturn(result);
		return response;
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param getDecision
	 */

	public tr.com.srdc.icardea.consenteditor.webservice.GetDecisionResponse getDecision(
			tr.com.srdc.icardea.consenteditor.webservice.GetDecision getDecision) {
		GetDecisionResponse response = new GetDecisionResponse();

		String requestString = getDecision.getRequestString();
		String patientID = getDecision.getPatientID();

		String result = cmInterface.getDecisionWithStrings(requestString,
				patientID);
		response.setGetDecisionReturn(result);
		boolean atnalog = new Boolean(ResourceBundle.getBundle("icardea")
				.getString("atna.tls")).booleanValue();
		
		// TODO: ATNA
		// Send ATNA Message: Grant Request Message
		// +"resource"+ is requested from "+requesterRole+" for
		// "+patientID+" with result "+result.
		if (atnalog) {
			ResourceBundle properties = ResourceBundle.getBundle("icardea");
			String atnalogServer = properties.getString("atna.log.server");
			
			String xml = Audit.createMessage("GRM", patientID, "", "");//TODO: Grant Request Message
			Audit a = null;
			try {
				a = new Audit(atnalogServer, 2861);
			} catch (UnknownHostException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            a.send_udp( a.create_syslog_xml("caremanager", xml) );
		}
		
		return response;
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param generateRequest
	 */

	public tr.com.srdc.icardea.consenteditor.webservice.GenerateRequestResponse generateRequest(
			tr.com.srdc.icardea.consenteditor.webservice.GenerateRequest generateRequest) {
		GenerateRequestResponse response = new GenerateRequestResponse();
		response.setGenerateRequestReturn(SAMLUtil
				.generateRequestAsString(SAMLUtil.generateSAMLRequest(
						generateRequest.getRequestId(),
						generateRequest.getIssuerName(),
						generateRequest.getSubjectCode(),
						generateRequest.getResourceCode(),
						generateRequest.getAction())));
		return response;
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param getSubjects
	 */

	public tr.com.srdc.icardea.consenteditor.webservice.GetSubjectsResponse getSubjects(
			tr.com.srdc.icardea.consenteditor.webservice.GetSubjects getSubjects) {
		GetSubjectsResponse response = new GetSubjectsResponse();
		ArrayOf_xsd_anyType result = new ArrayOf_xsd_anyType();
		result.setItem(cmInterface.getSubjects().toArray());
		response.setGetSubjectsReturn(result);
		return response;
	}

}
