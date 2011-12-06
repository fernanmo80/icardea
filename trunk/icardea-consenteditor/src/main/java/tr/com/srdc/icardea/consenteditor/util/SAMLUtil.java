package tr.com.srdc.icardea.consenteditor.util;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.apache.log4j.Logger;

import org.joda.time.DateTime;
import org.opensaml.DefaultBootstrap;
import org.opensaml.saml2.core.Issuer;
import org.opensaml.xacml.ctx.ActionType;
import org.opensaml.xacml.ctx.AttributeType;
import org.opensaml.xacml.ctx.AttributeValueType;
import org.opensaml.xacml.ctx.DecisionType;
import org.opensaml.xacml.ctx.RequestType;
import org.opensaml.xacml.ctx.ResourceType;
import org.opensaml.xacml.ctx.ResponseType;
import org.opensaml.xacml.ctx.ResultType;
import org.opensaml.xacml.ctx.SubjectType;
import org.opensaml.xacml.profile.saml.XACMLAuthzDecisionQueryType;
import org.opensaml.xacml.profile.saml.XACMLAuthzDecisionStatementType;
import org.opensaml.xacml.profile.saml.impl.XACMLAuthzDecisionQueryTypeMarshaller;
import org.opensaml.xacml.profile.saml.impl.XACMLAuthzDecisionQueryTypeUnmarshaller;
import org.opensaml.xacml.profile.saml.impl.XACMLAuthzDecisionStatementTypeImplBuilder;
import org.opensaml.xacml.profile.saml.impl.XACMLAuthzDecisionStatementTypeMarshaller;
import org.opensaml.xacml.profile.saml.impl.XACMLAuthzDecisionStatementTypeUnmarshaller;
import org.opensaml.xml.ConfigurationException;
import org.opensaml.xml.io.MarshallingException;
import org.opensaml.xml.io.UnmarshallingException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.bootstrap.DOMImplementationRegistry;
import org.w3c.dom.ls.DOMImplementationLS;
import org.w3c.dom.ls.LSSerializer;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import tr.com.srdc.icardea.consenteditor.model.Group;
import tr.com.srdc.icardea.consenteditor.model.Individual;
import tr.com.srdc.icardea.consenteditor.model.ResourceElement;
import tr.com.srdc.icardea.consenteditor.model.SubjectElement;
import tr.com.srdc.icardea.consenteditor.saml.SAML;

public class SAMLUtil {

	public static SAML saml = new SAML();

	public static XACMLAuthzDecisionQueryType generateSAMLRequest(
			String requestId, String issuer, String subjectId,
			String resourceId, String actionString) {
		XACMLAuthzDecisionQueryType query = saml.create(
				XACMLAuthzDecisionQueryType.class,
				XACMLAuthzDecisionQueryType.DEFAULT_ELEMENT_NAME_XACML20);
		RequestType request = saml.create(RequestType.class,
				RequestType.DEFAULT_ELEMENT_NAME);

		DateTime now = new DateTime();

		if (!subjectId.equals("")) {
			AttributeType subjectAttr = saml.create(AttributeType.class,
					AttributeType.DEFAULT_ELEMENT_NAME);
			subjectAttr
					.setAttributeID("urn:oasis:names:tc:xacml:1.0:subject:subject-id");
			subjectAttr.setDataType("http://www.w3.org/2001/XMLSchema#string");

			AttributeValueType subjectAttrValue = saml.create(
					AttributeValueType.class,
					AttributeValueType.DEFAULT_ELEMENT_NAME);
			subjectAttrValue.setValue(subjectId);
			subjectAttr.getAttributeValues().add(subjectAttrValue);

			SubjectType subject = saml.create(SubjectType.class,
					SubjectType.DEFAULT_ELEMENT_NAME);
			subject.getAttributes().add(subjectAttr);
			request.getSubjects().add(subject);
		}

		if (!resourceId.equals("")) {
			AttributeType resourceAttr = saml.create(AttributeType.class,
					AttributeType.DEFAULT_ELEMENT_NAME);
			resourceAttr
					.setAttributeID("urn:oasis:names:tc:xacml:1.0:resource:resource-id");
			resourceAttr.setDataType("http://www.w3.org/2001/XMLSchema#string");

			AttributeValueType resourceAttrValue = saml.create(
					AttributeValueType.class,
					AttributeValueType.DEFAULT_ELEMENT_NAME);
			resourceAttrValue.setValue(resourceId);
			resourceAttr.getAttributeValues().add(resourceAttrValue);

			ResourceType resource = saml.create(ResourceType.class,
					ResourceType.DEFAULT_ELEMENT_NAME);
			resource.getAttributes().add(resourceAttr);
			request.getResources().add(resource);
		}

		if (!actionString.equals("")) {
			ActionType action = saml.create(ActionType.class,
					ActionType.DEFAULT_ELEMENT_NAME);

			AttributeType actionAttr = saml.create(AttributeType.class,
					AttributeType.DEFAULT_ELEMENT_NAME);
			actionAttr
					.setAttributeID("urn:oasis:names:tc:xacml:1.0:action:action-id");
			actionAttr.setDataType("http://www.w3.org/2001/XMLSchema#string");

			AttributeValueType actionAttrValue = saml.create(
					AttributeValueType.class,
					AttributeValueType.DEFAULT_ELEMENT_NAME);
			actionAttrValue.setValue(actionString);
			actionAttr.getAttributeValues().add(actionAttrValue);

			action.getAttributes().add(actionAttr);
			request.setAction(action);
		}
		Issuer issuer_ = saml.create(Issuer.class, Issuer.DEFAULT_ELEMENT_NAME);
		issuer_.setValue(issuer);
		query.setID(requestId);
		query.setIssueInstant(now);
		query.setIssuer(issuer_);
		query.setRequest(request);
		return query;
	}

	public static XACMLAuthzDecisionQueryType generateSAMLRequest(
			String requestId, String issuer, SubjectType subjectType,
			ResourceType resourceType, ActionType actionType) {
		SubjectElement se = new SubjectElement();

		String subjectId = subjectType.getAttributes().get(0)
				.getAttributeValues().get(0).getValue();
		if (subjectId.startsWith("ROLECODE:")) {
			Group group = new Group();
			group.setId(subjectId);
			se.setGroup(group);
		} else {
			Individual individual = new Individual();
			individual.setId(subjectId);
			se.setIndividual(individual);
		}

		ResourceElement re = new ResourceElement();

		String resourceId = resourceType.getAttributes().get(0)
				.getAttributeValues().get(0).getValue();
		re.setId(resourceId);

		String action = actionType.getAttributes().get(0).getAttributeValues()
				.get(0).getValue();

		return generateSAMLRequest(requestId, issuer, ModelUtil
				.findSubjectId(se), re.getId(), action);

	}

	public static XACMLAuthzDecisionStatementType generateSAMLResponse(
			DecisionType.DECISION dec) {
		XACMLAuthzDecisionStatementType response = new XACMLAuthzDecisionStatementTypeImplBuilder().buildObject(XACMLAuthzDecisionStatementType.DEFAULT_ELEMENT_NAME_XACML20); 

		ResultType result = saml.create(ResultType.class,
				ResultType.DEFAULT_ELEMENT_NAME);
		DecisionType decision = saml.create(DecisionType.class,
				DecisionType.DEFAULT_ELEMENT_NAME);

		decision.setDecision(dec);

		result.setDecision(decision);
		ResponseType responseType = saml.create(ResponseType.class,
				ResponseType.DEFAULT_ELEMENT_NAME);
		responseType.setResult(result);
		response.setResponse(responseType);
		return response;
	}

	public static DecisionType.DECISION getDecisionFromResponse(
			XACMLAuthzDecisionStatementType response) {
		return response.getResponse().getResult().getDecision().getDecision();
	}

	public static String generateResponseAsString(
			XACMLAuthzDecisionStatementType response) {
		StringWriter out = new StringWriter();
		XACMLAuthzDecisionStatementTypeMarshaller marshaller = new XACMLAuthzDecisionStatementTypeMarshaller();
		Element element = null;
		String result = "";
		try {
			element = marshaller.marshall(response);

			DOMImplementationRegistry registry = DOMImplementationRegistry
					.newInstance();

			DOMImplementationLS impl = (DOMImplementationLS) registry
					.getDOMImplementation("LS");

			LSSerializer writer = impl.createLSSerializer();
			result = writer.writeToString(element);

		} catch (MarshallingException e) {
			e.printStackTrace();
		} catch (ClassCastException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		return result;

	}

	public static String generateRequestAsString(
			XACMLAuthzDecisionQueryType request) {
		XACMLAuthzDecisionQueryTypeMarshaller marshaller = new XACMLAuthzDecisionQueryTypeMarshaller();
		Element element = null;
		String result = "";
		try {
			element = marshaller.marshall(request);

			DOMImplementationRegistry registry = DOMImplementationRegistry
					.newInstance();

			DOMImplementationLS impl = (DOMImplementationLS) registry
					.getDOMImplementation("LS");

			LSSerializer writer = impl.createLSSerializer();
			result = writer.writeToString(element);
		} catch (MarshallingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassCastException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;

	}

	public static Logger logger = Logger.getLogger(SAMLUtil.class);
	
	public static XACMLAuthzDecisionQueryType generateRequestFromString(
			String requestString) {
		StringWriter out;
		logger.info("TRACE generateRequestFromString 1");
		XACMLAuthzDecisionQueryType xrequest = null;

		try {
			DefaultBootstrap.bootstrap();
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			dbf.setNamespaceAware(true);
			DocumentBuilder db = dbf.newDocumentBuilder();
			logger.info("TRACE generateRequestFromString 2");
			Document doc = db.parse(new InputSource(new StringReader(
					requestString)));
			logger.info("TRACE generateRequestFromString 3");
			Element element = doc.getDocumentElement();

			xrequest = (XACMLAuthzDecisionQueryType) new XACMLAuthzDecisionQueryTypeUnmarshaller()
					.unmarshall(element);
			logger.info("TRACE generateRequestFromString 4");
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnmarshallingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		logger.info("TRACE generateRequestFromString 5");
		return xrequest;
	}

	public static XACMLAuthzDecisionStatementType generateResponseFromString(
			String responseString) {
		StringWriter out;
		XACMLAuthzDecisionStatementType response = null;
		try {
			DefaultBootstrap.bootstrap();
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			dbf.setNamespaceAware(true);
			DocumentBuilder db = dbf.newDocumentBuilder();
			Document doc = db.parse(new InputSource(new StringReader(
					responseString)));

			Element element = doc.getDocumentElement();

			response = (XACMLAuthzDecisionStatementType) new XACMLAuthzDecisionStatementTypeUnmarshaller()
					.unmarshall(element);
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnmarshallingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return response;
	}

}
