package tr.com.srdc.icardea.consenteditor.controller;

import java.util.ArrayList;

import org.opensaml.xacml.profile.saml.XACMLAuthzDecisionQueryType;
import org.opensaml.xacml.profile.saml.XACMLAuthzDecisionStatementType;

import tr.com.srdc.icardea.consenteditor.model.ResourceElement;
import tr.com.srdc.icardea.consenteditor.model.SubjectElement;


import com.sun.xacml.ctx.RequestCtx;
import com.sun.xacml.ctx.ResponseCtx;

public interface ConsentManagerInterface {
	boolean validate(String healthcareActorID, /* such as ROLECODE:DOCTOR, ROLECODE:NURSE,etc. */ 
			String patientID,
			String resource /* such as RESOURCECODE:MEDICATION, RESOURCECODE:PROBLEM,etc. */,
			String action /* such as READ, WRITE, UPDATE */);
	
	public String getDecisionWithStrings(String requestString, String patientID);

	public XACMLAuthzDecisionStatementType getDecision(
			XACMLAuthzDecisionQueryType xrequest, String patientID);

	public ResponseCtx getDecisionAsXACML(RequestCtx request, String patientID);

	public boolean validate(SubjectElement subject, String patientID,
			ResourceElement resource, String action);

	public ArrayList<String> getSubjects();

	public ArrayList<String> getResources();

}
