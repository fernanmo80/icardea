package tr.com.srdc.icardea.consenteditor.controller;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.opensaml.DefaultBootstrap;
import org.opensaml.xacml.ctx.DecisionType;
import org.opensaml.xacml.ctx.RequestType;
import org.opensaml.xacml.ctx.DecisionType.DECISION;
import org.opensaml.xacml.profile.saml.XACMLAuthzDecisionQueryType;
import org.opensaml.xacml.profile.saml.XACMLAuthzDecisionStatementType;
import org.opensaml.xacml.profile.saml.impl.XACMLAuthzDecisionStatementTypeImplBuilder;
import org.opensaml.xml.ConfigurationException;

import tr.com.srdc.icardea.consenteditor.model.ActionElements;
import tr.com.srdc.icardea.consenteditor.model.Condition;
import tr.com.srdc.icardea.consenteditor.model.ConsentDocument;
import tr.com.srdc.icardea.consenteditor.model.ConsentRule;
import tr.com.srdc.icardea.consenteditor.model.ConsentRuleTarget;
import tr.com.srdc.icardea.consenteditor.model.Group;
import tr.com.srdc.icardea.consenteditor.model.Individual;
import tr.com.srdc.icardea.consenteditor.model.ResourceElement;
import tr.com.srdc.icardea.consenteditor.model.ResourceElements;
import tr.com.srdc.icardea.consenteditor.model.SubjectElement;
import tr.com.srdc.icardea.consenteditor.model.SubjectElements;
import tr.com.srdc.icardea.consenteditor.model.TimeConstraint;
import tr.com.srdc.icardea.consenteditor.util.JAXBUtil;
import tr.com.srdc.icardea.consenteditor.util.ModelUtil;
import tr.com.srdc.icardea.consenteditor.util.SAMLUtil;

import com.sun.xacml.attr.AttributeValue;
import com.sun.xacml.ctx.Attribute;
import com.sun.xacml.ctx.RequestCtx;
import com.sun.xacml.ctx.ResponseCtx;
import com.sun.xacml.ctx.Result;
import com.sun.xacml.ctx.Subject;

public class ConsentManagerImpl implements ConsentManagerInterface {

	public PHRInterface phrInterface;

	public ConsentManagerImpl() {
		phrInterface = new PHRJPAImpl();
	}

	public String getDecisionWithStrings(String requestString, String patientID) {
		XACMLAuthzDecisionStatementType response;
		try {
			DefaultBootstrap.bootstrap();
			response = new XACMLAuthzDecisionStatementTypeImplBuilder().buildObject(XACMLAuthzDecisionStatementType.DEFAULT_ELEMENT_NAME_XACML20);
		} catch (ConfigurationException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		XACMLAuthzDecisionQueryType xrequest = SAMLUtil.generateRequestFromString(requestString);
		RequestType request = xrequest.getRequest();

		if (request.getSubjects().size() > 1
			|| request.getResources().size() > 1) {
			for (int i = 0; i < request.getSubjects().size(); i++) {
				for (int j = 0; j < request.getResources().size(); j++) {
					XACMLAuthzDecisionQueryType tempRequest = SAMLUtil.generateSAMLRequest(xrequest.getID(), xrequest.getIssuer().getValue(), request.getSubjects().get(i), request.getResources().get(j), request.getAction());
					if (!SAMLUtil.getDecisionFromResponse(
						SAMLUtil.generateResponseFromString(getDecisionWithStrings(
						SAMLUtil.generateRequestAsString(tempRequest),
						patientID))).equals(
						DecisionType.DECISION.Permit)) {
						return SAMLUtil.generateResponseAsString(SAMLUtil.generateSAMLResponse(DecisionType.DECISION.Deny));
					}
				}
			}
			return SAMLUtil.generateResponseAsString(SAMLUtil.generateSAMLResponse(DecisionType.DECISION.Permit));
		}
		SubjectElement se = new SubjectElement();

		if (request.getSubjects().size() > 0) {
			String subjectId = request.getSubjects().get(0).getAttributes().get(0).getAttributeValues().get(0).getValue();
			if (subjectId.startsWith("ROLECODE:")) {
				Group group = new Group();
				group.setId(subjectId);
				se.setGroup(group);
			} else {
				Individual individual = new Individual();
				individual.setId(subjectId);
				se.setIndividual(individual);
			}
		}
		ResourceElement re = new ResourceElement();
		if (request.getResources().size() > 0) {
			String resourceId = request.getResources().get(0).getAttributes().get(0).getAttributeValues().get(0).getValue();
			re.setId(resourceId);
		}
		String action = null;
		if (request.getAction() != null) {
			action = request.getAction().getAttributes().get(0).getAttributeValues().get(0).getValue();
		}
		boolean givePermission = validate(se, patientID, re, action);
		if (givePermission) {
			response = SAMLUtil.generateSAMLResponse(DECISION.Permit);
		} else {
			response = SAMLUtil.generateSAMLResponse(DECISION.Deny);
		}
		return SAMLUtil.generateResponseAsString(response);
	}

	public XACMLAuthzDecisionStatementType getDecision(
		XACMLAuthzDecisionQueryType xrequest, String patientID) {
		try {
			DefaultBootstrap.bootstrap();
		} catch (ConfigurationException e) {
			e.printStackTrace();
		}
		XACMLAuthzDecisionStatementType response = new XACMLAuthzDecisionStatementTypeImplBuilder().buildObject(XACMLAuthzDecisionStatementType.DEFAULT_ELEMENT_NAME_XACML20);

		RequestType request = xrequest.getRequest();

		if (request.getSubjects().size() > 1
			|| request.getResources().size() > 1) {
			for (int i = 0; i < request.getSubjects().size(); i++) {
				for (int j = 0; j < request.getResources().size(); j++) {
					XACMLAuthzDecisionQueryType tempRequest = SAMLUtil.generateSAMLRequest(xrequest.getID(), xrequest.getIssuer().getValue(), request.getSubjects().get(i), request.getResources().get(j), request.getAction());
					if (!SAMLUtil.getDecisionFromResponse(
						getDecision((tempRequest), patientID)).equals(
						DecisionType.DECISION.Permit)) {
						return SAMLUtil.generateSAMLResponse(DecisionType.DECISION.Deny);
					}
				}
			}
			return SAMLUtil.generateSAMLResponse(DecisionType.DECISION.Permit);
		}

		SubjectElement se = new SubjectElement();

		if (request.getSubjects().size() > 0) {
			String subjectId = request.getSubjects().get(0).getAttributes().get(0).getAttributeValues().get(0).getValue();
			if (subjectId.startsWith("ROLECODE:")) {
				Group group = new Group();
				group.setId(subjectId);
				se.setGroup(group);
			} else {
				Individual individual = new Individual();
				individual.setId(subjectId);
				se.setIndividual(individual);
			}
		}

		ResourceElement re = new ResourceElement();
		if (request.getResources().size() > 0) {
			String resourceId = request.getResources().get(0).getAttributes().get(0).getAttributeValues().get(0).getValue();
			re.setId(resourceId);
		}

		String action = null;
		if (request.getAction() != null) {
			action = request.getAction().getAttributes().get(0).getAttributeValues().get(0).getValue();
		}
		boolean givePermission = validate(se, patientID, re, action);

		if (givePermission) {
			response = SAMLUtil.generateSAMLResponse(DECISION.Permit);
		} else {
			response = SAMLUtil.generateSAMLResponse(DECISION.Deny);
		}
		return response;
	}

	public ResponseCtx getDecisionAsXACML(RequestCtx request, String patientID) {
		ResponseCtx response;

		SubjectElement se = new SubjectElement();
		ResourceElement re = new ResourceElement();
		String action = "";

		Iterator<Attribute> attributeIterator = request.getResource().iterator();
		Iterator<Subject> subjectIterator = request.getSubjects().iterator();
		while (subjectIterator.hasNext()) {
			Subject subject = (Subject) (subjectIterator.next());
			attributeIterator = subject.getAttributes().iterator();
			while (attributeIterator.hasNext()) {
				Attribute attr = (Attribute) (attributeIterator.next());
				AttributeValue attrV = attr.getValue();
				String subjectId = attrV.encode().trim();
				if (subjectId.startsWith("ROLECODE:")) {
					Group group = new Group();
					group.setId(subjectId);
					se.setGroup(group);
				} else {
					Individual individual = new Individual();
					individual.setId(subjectId);
					se.setIndividual(individual);
				}
			}
		}
		attributeIterator = request.getResource().iterator();
		while (attributeIterator.hasNext()) {
			Attribute attr = (Attribute) (attributeIterator.next());
			AttributeValue attrV = attr.getValue();
			String resourceId = attrV.encode().trim();
			re.setId(resourceId);
		}

		attributeIterator = request.getAction().iterator();
		while (attributeIterator.hasNext()) {
			Attribute attr = (Attribute) (attributeIterator.next());
			AttributeValue attrV = attr.getValue();
			action = attrV.encode().trim();
		}

		boolean givePermission = validate(se, patientID, re, action);
		Result result;
		if (givePermission) {
			result = new Result(Result.DECISION_PERMIT);
		} else {
			result = new Result(Result.DECISION_DENY);
		}
		response = new ResponseCtx(result);
		return response;
	}

	public boolean validate(SubjectElement subject, String patientID,
		ResourceElement resource, String action) {
		return validate(ModelUtil.findSubjectId(subject), patientID, resource.getId(), action);
	}

	public boolean validate(String subjectId, String patientID,
		String resourceId, String action) {
		boolean result = false;
		ConsentDocument consentDocument = phrInterface.getCurrentConsentDocumentByPatientId(patientID);

		for (int i = 0; i < consentDocument.getConsentRule().size(); i++) {
			ConsentRule consentRule = consentDocument.getConsentRule().get(i);
			ConsentRuleTarget consentRuleTarget = consentRule.getConsentRuleTarget();
			SubjectElements ses = consentRuleTarget.getSubjectElements();
			ResourceElements res = consentRuleTarget.getResourceElements();
			ActionElements aes = consentRuleTarget.getActionElements();
			List<Condition> conds = consentRule.getCondition();

			DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

			for (int j = 0; j < ses.getSubjectElement().size(); j++) {
				String consentSubjectId = ModelUtil.findSubjectId(ses.getSubjectElement().get(j));
				for (int k = 0; k < res.getResourceElement().size(); k++) {
					String consentResourceId = res.getResourceElement().get(k).getId();
					for (int m = 0; m < aes.getAction().size(); m++) {
						String consentAction = aes.getAction().get(m);
						if ((consentSubjectId.equals(subjectId) || subjectId == null)
							&& (consentResourceId.equals(resourceId) || resourceId == null)
							&& (consentAction.equals(action) || action == null)) {
							boolean condValid = true;
							for (int n = 0; n < conds.size(); n++) {
								Condition cond = conds.get(n);
								TimeConstraint tc = cond.getTimeConstraint();
								Date allowFrom;
								Date allowUntil;
								try {
									allowFrom = df.parse(tc.getAllowFrom());
									allowUntil = df.parse(tc.getAllowUntil());
									Date now = new Date();
									if (!now.after(allowFrom)
										|| !now.before(allowUntil)) {
										condValid = false;
									}
								} catch (ParseException e) {
									e.printStackTrace();
								}
							}
							if (condValid) {
								if (consentRule.getIsAllow() == 1) {
									result = true;
								} else if (consentRule.getIsAllow() == 0) {
									return false;
								}
							}
						}
					}
				}
			}
		}
		return result;
	}

	public ArrayList<String> getSubjects() {
		ArrayList<String> result = new ArrayList<String>();
		SubjectElements ses = phrInterface.getSubjectList("");
		for (int i = 0; i < ses.getSubjectElement().size(); i++) {
			result.add(ModelUtil.findSubjectId(ses.getSubjectElement().get(i)));
		}
		return result;
	}

	public ArrayList<String> getResources() {
		ArrayList<String> result = new ArrayList<String>();
		ResourceElements res = phrInterface.getResourceList("");
		for (int i = 0; i < res.getResourceElement().size(); i++) {
			result.add(res.getResourceElement().get(i).getId());
		}
		return result;
	}
}
