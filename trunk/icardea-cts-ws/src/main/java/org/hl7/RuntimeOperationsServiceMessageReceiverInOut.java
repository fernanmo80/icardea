/**
 * RuntimeOperationsServiceMessageReceiverInOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.5.1  Built on : Oct 19, 2009 (10:59:00 EDT)
 */
package org.hl7;

/**
 * RuntimeOperationsServiceMessageReceiverInOut message receiver
 */

public class RuntimeOperationsServiceMessageReceiverInOut extends
		org.apache.axis2.receivers.AbstractInOutMessageReceiver {

	public void invokeBusinessLogic(
			org.apache.axis2.context.MessageContext msgContext,
			org.apache.axis2.context.MessageContext newMsgContext)
			throws org.apache.axis2.AxisFault {

		try {

			// get the implementation class for the Web Service
			Object obj = getTheImplementationObject(msgContext);

			RuntimeOperationsServiceSkeleton skel = (RuntimeOperationsServiceSkeleton) obj;
			// Out Envelop
			org.apache.axiom.soap.SOAPEnvelope envelope = null;
			// Find the axisOperation that has been set by the Dispatch phase.
			org.apache.axis2.description.AxisOperation op = msgContext
					.getOperationContext().getAxisOperation();
			if (op == null) {
				throw new org.apache.axis2.AxisFault(
						"Operation is not located, if this is doclit style the SOAP-ACTION should specified via the SOAP Action to use the RawXMLProvider");
			}

			java.lang.String methodName;
			if ((op.getName() != null)
					&& ((methodName = org.apache.axis2.util.JavaUtils
							.xmlNameToJavaIdentifier(op.getName()
									.getLocalPart())) != null)) {

				if ("getServiceDescription".equals(methodName)) {

					org.hl7.GetServiceDescriptionResponse getServiceDescriptionResponse1 = null;
					org.hl7.GetServiceDescription wrappedParam = (org.hl7.GetServiceDescription) fromOM(
							msgContext.getEnvelope().getBody()
									.getFirstElement(),
							org.hl7.GetServiceDescription.class,
							getEnvelopeNamespaces(msgContext.getEnvelope()));

					getServiceDescriptionResponse1 =

					skel.getServiceDescription(wrappedParam);

					envelope = toEnvelope(getSOAPFactory(msgContext),
							getServiceDescriptionResponse1, false);
				} else

				if ("lookupValueSetExpansion".equals(methodName)) {

					org.hl7.LookupValueSetExpansionResponse lookupValueSetExpansionResponse3 = null;
					org.hl7.LookupValueSetExpansion wrappedParam = (org.hl7.LookupValueSetExpansion) fromOM(
							msgContext.getEnvelope().getBody()
									.getFirstElement(),
							org.hl7.LookupValueSetExpansion.class,
							getEnvelopeNamespaces(msgContext.getEnvelope()));

					lookupValueSetExpansionResponse3 =

					skel.lookupValueSetExpansion(wrappedParam);

					envelope = toEnvelope(getSOAPFactory(msgContext),
							lookupValueSetExpansionResponse3, false);
				} else

				if ("expandValueSetExpansionContext".equals(methodName)) {

					org.hl7.ExpandValueSetExpansionContextResponse expandValueSetExpansionContextResponse5 = null;
					org.hl7.ExpandValueSetExpansionContext wrappedParam = (org.hl7.ExpandValueSetExpansionContext) fromOM(
							msgContext.getEnvelope().getBody()
									.getFirstElement(),
							org.hl7.ExpandValueSetExpansionContext.class,
							getEnvelopeNamespaces(msgContext.getEnvelope()));

					expandValueSetExpansionContextResponse5 =

					skel.expandValueSetExpansionContext(wrappedParam);

					envelope = toEnvelope(getSOAPFactory(msgContext),
							expandValueSetExpansionContextResponse5, false);
				} else

				if ("getSupportedMatchAlgorithms".equals(methodName)) {

					org.hl7.GetSupportedMatchAlgorithmsResponse getSupportedMatchAlgorithmsResponse7 = null;
					org.hl7.GetSupportedMatchAlgorithms wrappedParam = (org.hl7.GetSupportedMatchAlgorithms) fromOM(
							msgContext.getEnvelope().getBody()
									.getFirstElement(),
							org.hl7.GetSupportedMatchAlgorithms.class,
							getEnvelopeNamespaces(msgContext.getEnvelope()));

					getSupportedMatchAlgorithmsResponse7 =

					skel.getSupportedMatchAlgorithms(wrappedParam);

					envelope = toEnvelope(getSOAPFactory(msgContext),
							getSupportedMatchAlgorithmsResponse7, false);
				} else

				if ("subsumes".equals(methodName)) {

					org.hl7.SubsumesResponse subsumesResponse9 = null;
					org.hl7.Subsumes wrappedParam = (org.hl7.Subsumes) fromOM(
							msgContext.getEnvelope().getBody()
									.getFirstElement(), org.hl7.Subsumes.class,
							getEnvelopeNamespaces(msgContext.getEnvelope()));

					subsumesResponse9 =

					skel.subsumes(wrappedParam);

					envelope = toEnvelope(getSOAPFactory(msgContext),
							subsumesResponse9, false);
				} else

				if ("getServiceVersion".equals(methodName)) {

					org.hl7.GetServiceVersionResponse getServiceVersionResponse11 = null;
					org.hl7.GetServiceVersion wrappedParam = (org.hl7.GetServiceVersion) fromOM(
							msgContext.getEnvelope().getBody()
									.getFirstElement(),
							org.hl7.GetServiceVersion.class,
							getEnvelopeNamespaces(msgContext.getEnvelope()));

					getServiceVersionResponse11 =

					skel.getServiceVersion(wrappedParam);

					envelope = toEnvelope(getSOAPFactory(msgContext),
							getServiceVersionResponse11, false);
				} else

				if ("fillInDetails".equals(methodName)) {

					org.hl7.FillInDetailsResponse fillInDetailsResponse13 = null;
					org.hl7.FillInDetails wrappedParam = (org.hl7.FillInDetails) fromOM(
							msgContext.getEnvelope().getBody()
									.getFirstElement(),
							org.hl7.FillInDetails.class,
							getEnvelopeNamespaces(msgContext.getEnvelope()));

					fillInDetailsResponse13 =

					skel.fillInDetails(wrappedParam);

					envelope = toEnvelope(getSOAPFactory(msgContext),
							fillInDetailsResponse13, false);
				} else

				if ("getCTSVersion".equals(methodName)) {

					org.hl7.GetCTSVersionResponse getCTSVersionResponse15 = null;
					org.hl7.GetCTSVersion wrappedParam = (org.hl7.GetCTSVersion) fromOM(
							msgContext.getEnvelope().getBody()
									.getFirstElement(),
							org.hl7.GetCTSVersion.class,
							getEnvelopeNamespaces(msgContext.getEnvelope()));

					getCTSVersionResponse15 =

					skel.getCTSVersion(wrappedParam);

					envelope = toEnvelope(getSOAPFactory(msgContext),
							getCTSVersionResponse15, false);
				} else

				if ("validateCode".equals(methodName)) {

					org.hl7.ValidateCodeResponse validateCodeResponse17 = null;
					org.hl7.ValidateCode wrappedParam = (org.hl7.ValidateCode) fromOM(
							msgContext.getEnvelope().getBody()
									.getFirstElement(),
							org.hl7.ValidateCode.class,
							getEnvelopeNamespaces(msgContext.getEnvelope()));

					validateCodeResponse17 =

					skel.validateCode(wrappedParam);

					envelope = toEnvelope(getSOAPFactory(msgContext),
							validateCodeResponse17, false);
				} else

				if ("getServiceName".equals(methodName)) {

					org.hl7.GetServiceNameResponse getServiceNameResponse19 = null;
					org.hl7.GetServiceName wrappedParam = (org.hl7.GetServiceName) fromOM(
							msgContext.getEnvelope().getBody()
									.getFirstElement(),
							org.hl7.GetServiceName.class,
							getEnvelopeNamespaces(msgContext.getEnvelope()));

					getServiceNameResponse19 =

					skel.getServiceName(wrappedParam);

					envelope = toEnvelope(getSOAPFactory(msgContext),
							getServiceNameResponse19, false);
				} else

				if ("validateTranslation".equals(methodName)) {

					org.hl7.ValidateTranslationResponse validateTranslationResponse21 = null;
					org.hl7.ValidateTranslation wrappedParam = (org.hl7.ValidateTranslation) fromOM(
							msgContext.getEnvelope().getBody()
									.getFirstElement(),
							org.hl7.ValidateTranslation.class,
							getEnvelopeNamespaces(msgContext.getEnvelope()));

					validateTranslationResponse21 =

					skel.validateTranslation(wrappedParam);

					envelope = toEnvelope(getSOAPFactory(msgContext),
							validateTranslationResponse21, false);
				} else

				if ("getSupportedVocabularyDomains".equals(methodName)) {

					org.hl7.GetSupportedVocabularyDomainsResponse getSupportedVocabularyDomainsResponse23 = null;
					org.hl7.GetSupportedVocabularyDomains wrappedParam = (org.hl7.GetSupportedVocabularyDomains) fromOM(
							msgContext.getEnvelope().getBody()
									.getFirstElement(),
							org.hl7.GetSupportedVocabularyDomains.class,
							getEnvelopeNamespaces(msgContext.getEnvelope()));

					getSupportedVocabularyDomainsResponse23 =

					skel.getSupportedVocabularyDomains(wrappedParam);

					envelope = toEnvelope(getSOAPFactory(msgContext),
							getSupportedVocabularyDomainsResponse23, false);
				} else

				if ("areEquivalent".equals(methodName)) {

					org.hl7.AreEquivalentResponse areEquivalentResponse25 = null;
					org.hl7.AreEquivalent wrappedParam = (org.hl7.AreEquivalent) fromOM(
							msgContext.getEnvelope().getBody()
									.getFirstElement(),
							org.hl7.AreEquivalent.class,
							getEnvelopeNamespaces(msgContext.getEnvelope()));

					areEquivalentResponse25 =

					skel.areEquivalent(wrappedParam);

					envelope = toEnvelope(getSOAPFactory(msgContext),
							areEquivalentResponse25, false);
				} else

				if ("translateCode".equals(methodName)) {

					org.hl7.TranslateCodeResponse translateCodeResponse27 = null;
					org.hl7.TranslateCode wrappedParam = (org.hl7.TranslateCode) fromOM(
							msgContext.getEnvelope().getBody()
									.getFirstElement(),
							org.hl7.TranslateCode.class,
							getEnvelopeNamespaces(msgContext.getEnvelope()));

					translateCodeResponse27 =

					skel.translateCode(wrappedParam);

					envelope = toEnvelope(getSOAPFactory(msgContext),
							translateCodeResponse27, false);
				} else

				if ("getHL7ReleaseVersion".equals(methodName)) {

					org.hl7.GetHL7ReleaseVersionResponse getHL7ReleaseVersionResponse29 = null;
					org.hl7.GetHL7ReleaseVersion wrappedParam = (org.hl7.GetHL7ReleaseVersion) fromOM(
							msgContext.getEnvelope().getBody()
									.getFirstElement(),
							org.hl7.GetHL7ReleaseVersion.class,
							getEnvelopeNamespaces(msgContext.getEnvelope()));

					getHL7ReleaseVersionResponse29 =

					skel.getHL7ReleaseVersion(wrappedParam);

					envelope = toEnvelope(getSOAPFactory(msgContext),
							getHL7ReleaseVersionResponse29, false);

				} else {
					throw new java.lang.RuntimeException("method not found");
				}

				newMsgContext.setEnvelope(envelope);
			}
		} catch (UnknownLanguage e) {

			msgContext.setProperty(org.apache.axis2.Constants.FAULT_NAME,
					"fault13");
			org.apache.axis2.AxisFault f = createAxisFault(e);
			if (e.getMessage() != null) {
				// f.setDetail(toOM(e.getMessage(),false));
			}
			throw f;
		} catch (UnknownVocabularyDomain e) {

			msgContext.setProperty(org.apache.axis2.Constants.FAULT_NAME,
					"fault10");
			org.apache.axis2.AxisFault f = createAxisFault(e);
			if (e.getMessage() != null) {
				// f.setDetail(toOM(e.getMessage(),false));
			}
			throw f;
		} catch (NoApplicableValueSet e) {

			msgContext.setProperty(org.apache.axis2.Constants.FAULT_NAME,
					"fault11");
			org.apache.axis2.AxisFault f = createAxisFault(e);
			if (e.getMessage() != null) {
				// f.setDetail(toOM(e.getMessage(),false));
			}
			throw f;
		} catch (SubsumptionNotSupported e) {

			msgContext.setProperty(org.apache.axis2.Constants.FAULT_NAME,
					"fault");
			org.apache.axis2.AxisFault f = createAxisFault(e);
			if (e.getMessage() != null) {
				 //f.setDetail(toOM(e.get,false));
			}
			throw f;
		} catch (BadlyFormedMatchText e) {

			msgContext.setProperty(org.apache.axis2.Constants.FAULT_NAME,
					"fault8");
			org.apache.axis2.AxisFault f = createAxisFault(e);
			if (e.getMessage() != null) {
				// f.setDetail(toOM(e.getMessage(),false));
			}
			throw f;
		} catch (UnknownConceptCode e) {

			msgContext.setProperty(org.apache.axis2.Constants.FAULT_NAME,
					"fault2");
			org.apache.axis2.AxisFault f = createAxisFault(e);
			if (e.getMessage() != null) {
				// f.setDetail(toOM(e.getMessage(),false));
			}
			throw f;
		} catch (UnexpectedError e) {

			msgContext.setProperty(org.apache.axis2.Constants.FAULT_NAME,
					"fault5");
			org.apache.axis2.AxisFault f = createAxisFault(e);
			if (e.getMessage() != null) {
				// f.setDetail(toOM(e.getMessage(),false));
			}
			throw f;
		} catch (UnrecognizedQualifier e) {

			msgContext.setProperty(org.apache.axis2.Constants.FAULT_NAME,
					"fault4");
			org.apache.axis2.AxisFault f = createAxisFault(e);
			if (e.getMessage() != null) {
				// f.setDetail(toOM(e.getMessage(),false));
			}
			throw f;
		} catch (UnknownApplicationContextCode e) {

			msgContext.setProperty(org.apache.axis2.Constants.FAULT_NAME,
					"fault9");
			org.apache.axis2.AxisFault f = createAxisFault(e);
			if (e.getMessage() != null) {
				// f.setDetail(toOM(e.getMessage(),false));
			}
			throw f;
		} catch (InvalidExpansionContext e) {

			msgContext.setProperty(org.apache.axis2.Constants.FAULT_NAME,
					"fault15");
			org.apache.axis2.AxisFault f = createAxisFault(e);
			if (e.getMessage() != null) {
				// f.setDetail(toOM(e.getMessage(),false));
			}
			throw f;
		} catch (QualifiersNotSupported e) {

			msgContext.setProperty(org.apache.axis2.Constants.FAULT_NAME,
					"fault1");
			org.apache.axis2.AxisFault f = createAxisFault(e);
			if (e.getMessage() != null) {
				// f.setDetail(toOM(e.getMessage(),false));
			}
			throw f;
		} catch (UnknownMatchAlgorithm e) {

			msgContext.setProperty(org.apache.axis2.Constants.FAULT_NAME,
					"fault7");
			org.apache.axis2.AxisFault f = createAxisFault(e);
			if (e.getMessage() != null) {
				// f.setDetail(toOM(e.getMessage(),false));
			}
			throw f;
		} catch (UnableToTranslate e) {

			msgContext.setProperty(org.apache.axis2.Constants.FAULT_NAME,
					"fault12");
			org.apache.axis2.AxisFault f = createAxisFault(e);
			if (e.getMessage() != null) {
				// f.setDetail(toOM(e.getMessage(),false));
			}
			throw f;
		} catch (UnknownCodeSystem e) {

			msgContext.setProperty(org.apache.axis2.Constants.FAULT_NAME,
					"fault3");
			org.apache.axis2.AxisFault f = createAxisFault(e);
			if (e.getMessage() != null) {
				GetServiceDescription gsd = new GetServiceDescription() {};				
				 //f.setDetail(toOM(e.getMessage(),false));
			}
			throw f;
		} catch (TimeoutError e) {

			msgContext.setProperty(org.apache.axis2.Constants.FAULT_NAME,
					"fault6");
			org.apache.axis2.AxisFault f = createAxisFault(e);
			if (e.getMessage() != null) {
				// f.setDetail(toOM(e.getMessage(),false));
			}
			throw f;
		} catch (NoApplicableDesignationFound e) {

			msgContext.setProperty(org.apache.axis2.Constants.FAULT_NAME,
					"fault14");
			org.apache.axis2.AxisFault f = createAxisFault(e);
			if (e.getMessage() != null) {
				// f.setDetail(toOM(e.getMessage(),false));
			}
			throw f;
		}

		catch (java.lang.Exception e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}
	}

	//
	private org.apache.axiom.om.OMElement toOM(
			org.hl7.GetServiceDescription param, boolean optimizeContent)
			throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(org.hl7.GetServiceDescription.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			org.hl7.GetServiceDescriptionResponse param, boolean optimizeContent)
			throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(
					org.hl7.GetServiceDescriptionResponse.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(org.hl7.Fault5 param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(org.hl7.Fault5.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			org.hl7.LookupValueSetExpansion param, boolean optimizeContent)
			throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(org.hl7.LookupValueSetExpansion.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			org.hl7.LookupValueSetExpansionResponse param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(
					org.hl7.LookupValueSetExpansionResponse.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(org.hl7.Fault13 param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(org.hl7.Fault13.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(org.hl7.Fault9 param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(org.hl7.Fault9.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(org.hl7.Fault10 param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(org.hl7.Fault10.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(org.hl7.Fault11 param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(org.hl7.Fault11.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(org.hl7.Fault6 param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(org.hl7.Fault6.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			org.hl7.ExpandValueSetExpansionContext param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(
					org.hl7.ExpandValueSetExpansionContext.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			org.hl7.ExpandValueSetExpansionContextResponse param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(
					org.hl7.ExpandValueSetExpansionContextResponse.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(org.hl7.Fault15 param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(org.hl7.Fault15.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			org.hl7.GetSupportedMatchAlgorithms param, boolean optimizeContent)
			throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(
					org.hl7.GetSupportedMatchAlgorithms.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			org.hl7.GetSupportedMatchAlgorithmsResponse param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(
					org.hl7.GetSupportedMatchAlgorithmsResponse.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(org.hl7.Subsumes param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(org.hl7.Subsumes.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(org.hl7.SubsumesResponse param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(org.hl7.SubsumesResponse.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(org.hl7.Fault param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(org.hl7.Fault.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(org.hl7.Fault1 param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(org.hl7.Fault1.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(org.hl7.Fault2 param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(org.hl7.Fault2.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(org.hl7.Fault3 param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(org.hl7.Fault3.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(org.hl7.Fault4 param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(org.hl7.Fault4.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(org.hl7.GetServiceVersion param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(org.hl7.GetServiceVersion.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			org.hl7.GetServiceVersionResponse param, boolean optimizeContent)
			throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(
					org.hl7.GetServiceVersionResponse.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(org.hl7.FillInDetails param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(org.hl7.FillInDetails.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			org.hl7.FillInDetailsResponse param, boolean optimizeContent)
			throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(org.hl7.FillInDetailsResponse.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(org.hl7.Fault14 param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(org.hl7.Fault14.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(org.hl7.GetCTSVersion param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(org.hl7.GetCTSVersion.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			org.hl7.GetCTSVersionResponse param, boolean optimizeContent)
			throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(org.hl7.GetCTSVersionResponse.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(org.hl7.ValidateCode param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(org.hl7.ValidateCode.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			org.hl7.ValidateCodeResponse param, boolean optimizeContent)
			throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(org.hl7.ValidateCodeResponse.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(org.hl7.GetServiceName param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(org.hl7.GetServiceName.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			org.hl7.GetServiceNameResponse param, boolean optimizeContent)
			throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(org.hl7.GetServiceNameResponse.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			org.hl7.ValidateTranslation param, boolean optimizeContent)
			throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(org.hl7.ValidateTranslation.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			org.hl7.ValidateTranslationResponse param, boolean optimizeContent)
			throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(
					org.hl7.ValidateTranslationResponse.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			org.hl7.GetSupportedVocabularyDomains param, boolean optimizeContent)
			throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(
					org.hl7.GetSupportedVocabularyDomains.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			org.hl7.GetSupportedVocabularyDomainsResponse param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(
					org.hl7.GetSupportedVocabularyDomainsResponse.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(org.hl7.Fault7 param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(org.hl7.Fault7.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(org.hl7.Fault8 param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(org.hl7.Fault8.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(org.hl7.AreEquivalent param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(org.hl7.AreEquivalent.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			org.hl7.AreEquivalentResponse param, boolean optimizeContent)
			throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(org.hl7.AreEquivalentResponse.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(org.hl7.TranslateCode param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(org.hl7.TranslateCode.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			org.hl7.TranslateCodeResponse param, boolean optimizeContent)
			throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(org.hl7.TranslateCodeResponse.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(org.hl7.Fault12 param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(org.hl7.Fault12.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			org.hl7.GetHL7ReleaseVersion param, boolean optimizeContent)
			throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(org.hl7.GetHL7ReleaseVersion.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			org.hl7.GetHL7ReleaseVersionResponse param, boolean optimizeContent)
			throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(
					org.hl7.GetHL7ReleaseVersionResponse.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
			org.apache.axiom.soap.SOAPFactory factory,
			org.hl7.GetServiceDescriptionResponse param, boolean optimizeContent)
			throws org.apache.axis2.AxisFault {
		try {
			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory
					.getDefaultEnvelope();

			emptyEnvelope.getBody().addChild(
					param.getOMElement(
							org.hl7.GetServiceDescriptionResponse.MY_QNAME,
							factory));

			return emptyEnvelope;
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}
	}

	private org.hl7.GetServiceDescriptionResponse wrapgetServiceDescription() {
		org.hl7.GetServiceDescriptionResponse wrappedElement = new org.hl7.GetServiceDescriptionResponse();
		return wrappedElement;
	}

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
			org.apache.axiom.soap.SOAPFactory factory,
			org.hl7.LookupValueSetExpansionResponse param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {
		try {
			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory
					.getDefaultEnvelope();

			emptyEnvelope.getBody().addChild(
					param.getOMElement(
							org.hl7.LookupValueSetExpansionResponse.MY_QNAME,
							factory));

			return emptyEnvelope;
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}
	}

	private org.hl7.LookupValueSetExpansionResponse wraplookupValueSetExpansion() {
		org.hl7.LookupValueSetExpansionResponse wrappedElement = new org.hl7.LookupValueSetExpansionResponse();
		return wrappedElement;
	}

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
			org.apache.axiom.soap.SOAPFactory factory,
			org.hl7.ExpandValueSetExpansionContextResponse param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {
		try {
			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory
					.getDefaultEnvelope();

			emptyEnvelope
					.getBody()
					.addChild(
							param
									.getOMElement(
											org.hl7.ExpandValueSetExpansionContextResponse.MY_QNAME,
											factory));

			return emptyEnvelope;
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}
	}

	private org.hl7.ExpandValueSetExpansionContextResponse wrapexpandValueSetExpansionContext() {
		org.hl7.ExpandValueSetExpansionContextResponse wrappedElement = new org.hl7.ExpandValueSetExpansionContextResponse();
		return wrappedElement;
	}

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
			org.apache.axiom.soap.SOAPFactory factory,
			org.hl7.GetSupportedMatchAlgorithmsResponse param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {
		try {
			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory
					.getDefaultEnvelope();

			emptyEnvelope
					.getBody()
					.addChild(
							param
									.getOMElement(
											org.hl7.GetSupportedMatchAlgorithmsResponse.MY_QNAME,
											factory));

			return emptyEnvelope;
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}
	}

	private org.hl7.GetSupportedMatchAlgorithmsResponse wrapgetSupportedMatchAlgorithms() {
		org.hl7.GetSupportedMatchAlgorithmsResponse wrappedElement = new org.hl7.GetSupportedMatchAlgorithmsResponse();
		return wrappedElement;
	}

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
			org.apache.axiom.soap.SOAPFactory factory,
			org.hl7.SubsumesResponse param, boolean optimizeContent)
			throws org.apache.axis2.AxisFault {
		try {
			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory
					.getDefaultEnvelope();

			emptyEnvelope.getBody().addChild(
					param.getOMElement(org.hl7.SubsumesResponse.MY_QNAME,
							factory));

			return emptyEnvelope;
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}
	}

	private org.hl7.SubsumesResponse wrapsubsumes() {
		org.hl7.SubsumesResponse wrappedElement = new org.hl7.SubsumesResponse();
		return wrappedElement;
	}

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
			org.apache.axiom.soap.SOAPFactory factory,
			org.hl7.GetServiceVersionResponse param, boolean optimizeContent)
			throws org.apache.axis2.AxisFault {
		try {
			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory
					.getDefaultEnvelope();

			emptyEnvelope.getBody().addChild(
					param
							.getOMElement(
									org.hl7.GetServiceVersionResponse.MY_QNAME,
									factory));

			return emptyEnvelope;
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}
	}

	private org.hl7.GetServiceVersionResponse wrapgetServiceVersion() {
		org.hl7.GetServiceVersionResponse wrappedElement = new org.hl7.GetServiceVersionResponse();
		return wrappedElement;
	}

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
			org.apache.axiom.soap.SOAPFactory factory,
			org.hl7.FillInDetailsResponse param, boolean optimizeContent)
			throws org.apache.axis2.AxisFault {
		try {
			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory
					.getDefaultEnvelope();

			emptyEnvelope.getBody().addChild(
					param.getOMElement(org.hl7.FillInDetailsResponse.MY_QNAME,
							factory));

			return emptyEnvelope;
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}
	}

	private org.hl7.FillInDetailsResponse wrapfillInDetails() {
		org.hl7.FillInDetailsResponse wrappedElement = new org.hl7.FillInDetailsResponse();
		return wrappedElement;
	}

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
			org.apache.axiom.soap.SOAPFactory factory,
			org.hl7.GetCTSVersionResponse param, boolean optimizeContent)
			throws org.apache.axis2.AxisFault {
		try {
			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory
					.getDefaultEnvelope();

			emptyEnvelope.getBody().addChild(
					param.getOMElement(org.hl7.GetCTSVersionResponse.MY_QNAME,
							factory));

			return emptyEnvelope;
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}
	}

	private org.hl7.GetCTSVersionResponse wrapgetCTSVersion() {
		org.hl7.GetCTSVersionResponse wrappedElement = new org.hl7.GetCTSVersionResponse();
		return wrappedElement;
	}

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
			org.apache.axiom.soap.SOAPFactory factory,
			org.hl7.ValidateCodeResponse param, boolean optimizeContent)
			throws org.apache.axis2.AxisFault {
		try {
			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory
					.getDefaultEnvelope();

			emptyEnvelope.getBody().addChild(
					param.getOMElement(org.hl7.ValidateCodeResponse.MY_QNAME,
							factory));

			return emptyEnvelope;
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}
	}

	private org.hl7.ValidateCodeResponse wrapvalidateCode() {
		org.hl7.ValidateCodeResponse wrappedElement = new org.hl7.ValidateCodeResponse();
		return wrappedElement;
	}

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
			org.apache.axiom.soap.SOAPFactory factory,
			org.hl7.GetServiceNameResponse param, boolean optimizeContent)
			throws org.apache.axis2.AxisFault {
		try {
			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory
					.getDefaultEnvelope();

			emptyEnvelope.getBody().addChild(
					param.getOMElement(org.hl7.GetServiceNameResponse.MY_QNAME,
							factory));

			return emptyEnvelope;
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}
	}

	private org.hl7.GetServiceNameResponse wrapgetServiceName() {
		org.hl7.GetServiceNameResponse wrappedElement = new org.hl7.GetServiceNameResponse();
		return wrappedElement;
	}

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
			org.apache.axiom.soap.SOAPFactory factory,
			org.hl7.ValidateTranslationResponse param, boolean optimizeContent)
			throws org.apache.axis2.AxisFault {
		try {
			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory
					.getDefaultEnvelope();

			emptyEnvelope.getBody().addChild(
					param.getOMElement(
							org.hl7.ValidateTranslationResponse.MY_QNAME,
							factory));

			return emptyEnvelope;
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}
	}

	private org.hl7.ValidateTranslationResponse wrapvalidateTranslation() {
		org.hl7.ValidateTranslationResponse wrappedElement = new org.hl7.ValidateTranslationResponse();
		return wrappedElement;
	}

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
			org.apache.axiom.soap.SOAPFactory factory,
			org.hl7.GetSupportedVocabularyDomainsResponse param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {
		try {
			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory
					.getDefaultEnvelope();

			emptyEnvelope
					.getBody()
					.addChild(
							param
									.getOMElement(
											org.hl7.GetSupportedVocabularyDomainsResponse.MY_QNAME,
											factory));

			return emptyEnvelope;
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}
	}

	private org.hl7.GetSupportedVocabularyDomainsResponse wrapgetSupportedVocabularyDomains() {
		org.hl7.GetSupportedVocabularyDomainsResponse wrappedElement = new org.hl7.GetSupportedVocabularyDomainsResponse();
		return wrappedElement;
	}

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
			org.apache.axiom.soap.SOAPFactory factory,
			org.hl7.AreEquivalentResponse param, boolean optimizeContent)
			throws org.apache.axis2.AxisFault {
		try {
			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory
					.getDefaultEnvelope();

			emptyEnvelope.getBody().addChild(
					param.getOMElement(org.hl7.AreEquivalentResponse.MY_QNAME,
							factory));

			return emptyEnvelope;
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}
	}

	private org.hl7.AreEquivalentResponse wrapareEquivalent() {
		org.hl7.AreEquivalentResponse wrappedElement = new org.hl7.AreEquivalentResponse();
		return wrappedElement;
	}

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
			org.apache.axiom.soap.SOAPFactory factory,
			org.hl7.TranslateCodeResponse param, boolean optimizeContent)
			throws org.apache.axis2.AxisFault {
		try {
			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory
					.getDefaultEnvelope();

			emptyEnvelope.getBody().addChild(
					param.getOMElement(org.hl7.TranslateCodeResponse.MY_QNAME,
							factory));

			return emptyEnvelope;
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}
	}

	private org.hl7.TranslateCodeResponse wraptranslateCode() {
		org.hl7.TranslateCodeResponse wrappedElement = new org.hl7.TranslateCodeResponse();
		return wrappedElement;
	}

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
			org.apache.axiom.soap.SOAPFactory factory,
			org.hl7.GetHL7ReleaseVersionResponse param, boolean optimizeContent)
			throws org.apache.axis2.AxisFault {
		try {
			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory
					.getDefaultEnvelope();

			emptyEnvelope.getBody().addChild(
					param.getOMElement(
							org.hl7.GetHL7ReleaseVersionResponse.MY_QNAME,
							factory));

			return emptyEnvelope;
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}
	}

	private org.hl7.GetHL7ReleaseVersionResponse wrapgetHL7ReleaseVersion() {
		org.hl7.GetHL7ReleaseVersionResponse wrappedElement = new org.hl7.GetHL7ReleaseVersionResponse();
		return wrappedElement;
	}

	/**
	 * get the default envelope
	 */
	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
			org.apache.axiom.soap.SOAPFactory factory) {
		return factory.getDefaultEnvelope();
	}

	private java.lang.Object fromOM(org.apache.axiom.om.OMElement param,
			java.lang.Class type, java.util.Map extraNamespaces)
			throws org.apache.axis2.AxisFault {

		try {

			if (org.hl7.GetServiceDescription.class.equals(type)) {

				return org.hl7.GetServiceDescription.Factory.parse(param
						.getXMLStreamReaderWithoutCaching());

			}

			if (org.hl7.GetServiceDescriptionResponse.class.equals(type)) {

				return org.hl7.GetServiceDescriptionResponse.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (org.hl7.Fault5.class.equals(type)) {

				return org.hl7.Fault5.Factory.parse(param
						.getXMLStreamReaderWithoutCaching());

			}

			if (org.hl7.LookupValueSetExpansion.class.equals(type)) {

				return org.hl7.LookupValueSetExpansion.Factory.parse(param
						.getXMLStreamReaderWithoutCaching());

			}

			if (org.hl7.LookupValueSetExpansionResponse.class.equals(type)) {

				return org.hl7.LookupValueSetExpansionResponse.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (org.hl7.Fault13.class.equals(type)) {

				return org.hl7.Fault13.Factory.parse(param
						.getXMLStreamReaderWithoutCaching());

			}

			if (org.hl7.Fault9.class.equals(type)) {

				return org.hl7.Fault9.Factory.parse(param
						.getXMLStreamReaderWithoutCaching());

			}

			if (org.hl7.Fault10.class.equals(type)) {

				return org.hl7.Fault10.Factory.parse(param
						.getXMLStreamReaderWithoutCaching());

			}

			if (org.hl7.Fault11.class.equals(type)) {

				return org.hl7.Fault11.Factory.parse(param
						.getXMLStreamReaderWithoutCaching());

			}

			if (org.hl7.Fault6.class.equals(type)) {

				return org.hl7.Fault6.Factory.parse(param
						.getXMLStreamReaderWithoutCaching());

			}

			if (org.hl7.Fault5.class.equals(type)) {

				return org.hl7.Fault5.Factory.parse(param
						.getXMLStreamReaderWithoutCaching());

			}

			if (org.hl7.ExpandValueSetExpansionContext.class.equals(type)) {

				return org.hl7.ExpandValueSetExpansionContext.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (org.hl7.ExpandValueSetExpansionContextResponse.class
					.equals(type)) {

				return org.hl7.ExpandValueSetExpansionContextResponse.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (org.hl7.Fault15.class.equals(type)) {

				return org.hl7.Fault15.Factory.parse(param
						.getXMLStreamReaderWithoutCaching());

			}

			if (org.hl7.Fault6.class.equals(type)) {

				return org.hl7.Fault6.Factory.parse(param
						.getXMLStreamReaderWithoutCaching());

			}

			if (org.hl7.Fault5.class.equals(type)) {

				return org.hl7.Fault5.Factory.parse(param
						.getXMLStreamReaderWithoutCaching());

			}

			if (org.hl7.GetSupportedMatchAlgorithms.class.equals(type)) {

				return org.hl7.GetSupportedMatchAlgorithms.Factory.parse(param
						.getXMLStreamReaderWithoutCaching());

			}

			if (org.hl7.GetSupportedMatchAlgorithmsResponse.class.equals(type)) {

				return org.hl7.GetSupportedMatchAlgorithmsResponse.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (org.hl7.Fault5.class.equals(type)) {

				return org.hl7.Fault5.Factory.parse(param
						.getXMLStreamReaderWithoutCaching());

			}

			if (org.hl7.Subsumes.class.equals(type)) {

				return org.hl7.Subsumes.Factory.parse(param
						.getXMLStreamReaderWithoutCaching());

			}

			if (org.hl7.SubsumesResponse.class.equals(type)) {

				return org.hl7.SubsumesResponse.Factory.parse(param
						.getXMLStreamReaderWithoutCaching());

			}

			if (org.hl7.Fault.class.equals(type)) {

				return org.hl7.Fault.Factory.parse(param
						.getXMLStreamReaderWithoutCaching());

			}

			if (org.hl7.Fault1.class.equals(type)) {

				return org.hl7.Fault1.Factory.parse(param
						.getXMLStreamReaderWithoutCaching());

			}

			if (org.hl7.Fault2.class.equals(type)) {

				return org.hl7.Fault2.Factory.parse(param
						.getXMLStreamReaderWithoutCaching());

			}

			if (org.hl7.Fault3.class.equals(type)) {

				return org.hl7.Fault3.Factory.parse(param
						.getXMLStreamReaderWithoutCaching());

			}

			if (org.hl7.Fault4.class.equals(type)) {

				return org.hl7.Fault4.Factory.parse(param
						.getXMLStreamReaderWithoutCaching());

			}

			if (org.hl7.Fault5.class.equals(type)) {

				return org.hl7.Fault5.Factory.parse(param
						.getXMLStreamReaderWithoutCaching());

			}

			if (org.hl7.GetServiceVersion.class.equals(type)) {

				return org.hl7.GetServiceVersion.Factory.parse(param
						.getXMLStreamReaderWithoutCaching());

			}

			if (org.hl7.GetServiceVersionResponse.class.equals(type)) {

				return org.hl7.GetServiceVersionResponse.Factory.parse(param
						.getXMLStreamReaderWithoutCaching());

			}

			if (org.hl7.Fault5.class.equals(type)) {

				return org.hl7.Fault5.Factory.parse(param
						.getXMLStreamReaderWithoutCaching());

			}

			if (org.hl7.FillInDetails.class.equals(type)) {

				return org.hl7.FillInDetails.Factory.parse(param
						.getXMLStreamReaderWithoutCaching());

			}

			if (org.hl7.FillInDetailsResponse.class.equals(type)) {

				return org.hl7.FillInDetailsResponse.Factory.parse(param
						.getXMLStreamReaderWithoutCaching());

			}

			if (org.hl7.Fault13.class.equals(type)) {

				return org.hl7.Fault13.Factory.parse(param
						.getXMLStreamReaderWithoutCaching());

			}

			if (org.hl7.Fault2.class.equals(type)) {

				return org.hl7.Fault2.Factory.parse(param
						.getXMLStreamReaderWithoutCaching());

			}

			if (org.hl7.Fault3.class.equals(type)) {

				return org.hl7.Fault3.Factory.parse(param
						.getXMLStreamReaderWithoutCaching());

			}

			if (org.hl7.Fault5.class.equals(type)) {

				return org.hl7.Fault5.Factory.parse(param
						.getXMLStreamReaderWithoutCaching());

			}

			if (org.hl7.Fault14.class.equals(type)) {

				return org.hl7.Fault14.Factory.parse(param
						.getXMLStreamReaderWithoutCaching());

			}

			if (org.hl7.GetCTSVersion.class.equals(type)) {

				return org.hl7.GetCTSVersion.Factory.parse(param
						.getXMLStreamReaderWithoutCaching());

			}

			if (org.hl7.GetCTSVersionResponse.class.equals(type)) {

				return org.hl7.GetCTSVersionResponse.Factory.parse(param
						.getXMLStreamReaderWithoutCaching());

			}

			if (org.hl7.Fault5.class.equals(type)) {

				return org.hl7.Fault5.Factory.parse(param
						.getXMLStreamReaderWithoutCaching());

			}

			if (org.hl7.ValidateCode.class.equals(type)) {

				return org.hl7.ValidateCode.Factory.parse(param
						.getXMLStreamReaderWithoutCaching());

			}

			if (org.hl7.ValidateCodeResponse.class.equals(type)) {

				return org.hl7.ValidateCodeResponse.Factory.parse(param
						.getXMLStreamReaderWithoutCaching());

			}

			if (org.hl7.Fault9.class.equals(type)) {

				return org.hl7.Fault9.Factory.parse(param
						.getXMLStreamReaderWithoutCaching());

			}

			if (org.hl7.Fault10.class.equals(type)) {

				return org.hl7.Fault10.Factory.parse(param
						.getXMLStreamReaderWithoutCaching());

			}

			if (org.hl7.Fault11.class.equals(type)) {

				return org.hl7.Fault11.Factory.parse(param
						.getXMLStreamReaderWithoutCaching());

			}

			if (org.hl7.Fault5.class.equals(type)) {

				return org.hl7.Fault5.Factory.parse(param
						.getXMLStreamReaderWithoutCaching());

			}

			if (org.hl7.GetServiceName.class.equals(type)) {

				return org.hl7.GetServiceName.Factory.parse(param
						.getXMLStreamReaderWithoutCaching());

			}

			if (org.hl7.GetServiceNameResponse.class.equals(type)) {

				return org.hl7.GetServiceNameResponse.Factory.parse(param
						.getXMLStreamReaderWithoutCaching());

			}

			if (org.hl7.Fault5.class.equals(type)) {

				return org.hl7.Fault5.Factory.parse(param
						.getXMLStreamReaderWithoutCaching());

			}

			if (org.hl7.ValidateTranslation.class.equals(type)) {

				return org.hl7.ValidateTranslation.Factory.parse(param
						.getXMLStreamReaderWithoutCaching());

			}

			if (org.hl7.ValidateTranslationResponse.class.equals(type)) {

				return org.hl7.ValidateTranslationResponse.Factory.parse(param
						.getXMLStreamReaderWithoutCaching());

			}

			if (org.hl7.Fault9.class.equals(type)) {

				return org.hl7.Fault9.Factory.parse(param
						.getXMLStreamReaderWithoutCaching());

			}

			if (org.hl7.Fault10.class.equals(type)) {

				return org.hl7.Fault10.Factory.parse(param
						.getXMLStreamReaderWithoutCaching());

			}

			if (org.hl7.Fault5.class.equals(type)) {

				return org.hl7.Fault5.Factory.parse(param
						.getXMLStreamReaderWithoutCaching());

			}

			if (org.hl7.GetSupportedVocabularyDomains.class.equals(type)) {

				return org.hl7.GetSupportedVocabularyDomains.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (org.hl7.GetSupportedVocabularyDomainsResponse.class
					.equals(type)) {

				return org.hl7.GetSupportedVocabularyDomainsResponse.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (org.hl7.Fault7.class.equals(type)) {

				return org.hl7.Fault7.Factory.parse(param
						.getXMLStreamReaderWithoutCaching());

			}

			if (org.hl7.Fault8.class.equals(type)) {

				return org.hl7.Fault8.Factory.parse(param
						.getXMLStreamReaderWithoutCaching());

			}

			if (org.hl7.Fault6.class.equals(type)) {

				return org.hl7.Fault6.Factory.parse(param
						.getXMLStreamReaderWithoutCaching());

			}

			if (org.hl7.Fault5.class.equals(type)) {

				return org.hl7.Fault5.Factory.parse(param
						.getXMLStreamReaderWithoutCaching());

			}

			if (org.hl7.AreEquivalent.class.equals(type)) {

				return org.hl7.AreEquivalent.Factory.parse(param
						.getXMLStreamReaderWithoutCaching());

			}

			if (org.hl7.AreEquivalentResponse.class.equals(type)) {

				return org.hl7.AreEquivalentResponse.Factory.parse(param
						.getXMLStreamReaderWithoutCaching());

			}

			if (org.hl7.Fault.class.equals(type)) {

				return org.hl7.Fault.Factory.parse(param
						.getXMLStreamReaderWithoutCaching());

			}

			if (org.hl7.Fault1.class.equals(type)) {

				return org.hl7.Fault1.Factory.parse(param
						.getXMLStreamReaderWithoutCaching());

			}

			if (org.hl7.Fault2.class.equals(type)) {

				return org.hl7.Fault2.Factory.parse(param
						.getXMLStreamReaderWithoutCaching());

			}

			if (org.hl7.Fault3.class.equals(type)) {

				return org.hl7.Fault3.Factory.parse(param
						.getXMLStreamReaderWithoutCaching());

			}

			if (org.hl7.Fault4.class.equals(type)) {

				return org.hl7.Fault4.Factory.parse(param
						.getXMLStreamReaderWithoutCaching());

			}

			if (org.hl7.Fault5.class.equals(type)) {

				return org.hl7.Fault5.Factory.parse(param
						.getXMLStreamReaderWithoutCaching());

			}

			if (org.hl7.TranslateCode.class.equals(type)) {

				return org.hl7.TranslateCode.Factory.parse(param
						.getXMLStreamReaderWithoutCaching());

			}

			if (org.hl7.TranslateCodeResponse.class.equals(type)) {

				return org.hl7.TranslateCodeResponse.Factory.parse(param
						.getXMLStreamReaderWithoutCaching());

			}

			if (org.hl7.Fault9.class.equals(type)) {

				return org.hl7.Fault9.Factory.parse(param
						.getXMLStreamReaderWithoutCaching());

			}

			if (org.hl7.Fault10.class.equals(type)) {

				return org.hl7.Fault10.Factory.parse(param
						.getXMLStreamReaderWithoutCaching());

			}

			if (org.hl7.Fault12.class.equals(type)) {

				return org.hl7.Fault12.Factory.parse(param
						.getXMLStreamReaderWithoutCaching());

			}

			if (org.hl7.Fault3.class.equals(type)) {

				return org.hl7.Fault3.Factory.parse(param
						.getXMLStreamReaderWithoutCaching());

			}

			if (org.hl7.Fault5.class.equals(type)) {

				return org.hl7.Fault5.Factory.parse(param
						.getXMLStreamReaderWithoutCaching());

			}

			if (org.hl7.GetHL7ReleaseVersion.class.equals(type)) {

				return org.hl7.GetHL7ReleaseVersion.Factory.parse(param
						.getXMLStreamReaderWithoutCaching());

			}

			if (org.hl7.GetHL7ReleaseVersionResponse.class.equals(type)) {

				return org.hl7.GetHL7ReleaseVersionResponse.Factory.parse(param
						.getXMLStreamReaderWithoutCaching());

			}

			if (org.hl7.Fault5.class.equals(type)) {

				return org.hl7.Fault5.Factory.parse(param
						.getXMLStreamReaderWithoutCaching());

			}

		} catch (java.lang.Exception e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}
		return null;
	}

	/**
	 * A utility method that copies the namepaces from the SOAPEnvelope
	 */
	private java.util.Map getEnvelopeNamespaces(
			org.apache.axiom.soap.SOAPEnvelope env) {
		java.util.Map returnMap = new java.util.HashMap();
		java.util.Iterator namespaceIterator = env.getAllDeclaredNamespaces();
		while (namespaceIterator.hasNext()) {
			org.apache.axiom.om.OMNamespace ns = (org.apache.axiom.om.OMNamespace) namespaceIterator
					.next();
			returnMap.put(ns.getPrefix(), ns.getNamespaceURI());
		}
		return returnMap;
	}

	private org.apache.axis2.AxisFault createAxisFault(java.lang.Exception e) {
		org.apache.axis2.AxisFault f;
		Throwable cause = e.getCause();
		if (cause != null) {
			f = new org.apache.axis2.AxisFault(e.getMessage(), cause);
		} else {
			f = new org.apache.axis2.AxisFault(e.getMessage());
		}

		return f;
	}

}// end of class
