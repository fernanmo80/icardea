
package org.hl7.ctsmapi;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.hl7.ctsmapi package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Fault_QNAME = new QName("urn://hl7.org/CTSMAPI", "fault");
    private final static QName _Fault1_QNAME = new QName("urn://hl7.org/CTSMAPI", "fault1");
    private final static QName _Fault11_QNAME = new QName("urn://hl7.org/CTSMAPI", "fault11");
    private final static QName _Fault12_QNAME = new QName("urn://hl7.org/CTSMAPI", "fault12");
    private final static QName _Fault10_QNAME = new QName("urn://hl7.org/CTSMAPI", "fault10");
    private final static QName _Fault15_QNAME = new QName("urn://hl7.org/CTSMAPI", "fault15");
    private final static QName _Fault13_QNAME = new QName("urn://hl7.org/CTSMAPI", "fault13");
    private final static QName _Fault14_QNAME = new QName("urn://hl7.org/CTSMAPI", "fault14");
    private final static QName _Fault9_QNAME = new QName("urn://hl7.org/CTSMAPI", "fault9");
    private final static QName _Fault8_QNAME = new QName("urn://hl7.org/CTSMAPI", "fault8");
    private final static QName _Fault7_QNAME = new QName("urn://hl7.org/CTSMAPI", "fault7");
    private final static QName _Fault6_QNAME = new QName("urn://hl7.org/CTSMAPI", "fault6");
    private final static QName _Fault5_QNAME = new QName("urn://hl7.org/CTSMAPI", "fault5");
    private final static QName _Fault4_QNAME = new QName("urn://hl7.org/CTSMAPI", "fault4");
    private final static QName _Fault3_QNAME = new QName("urn://hl7.org/CTSMAPI", "fault3");
    private final static QName _Fault2_QNAME = new QName("urn://hl7.org/CTSMAPI", "fault2");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.hl7.ctsmapi
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link UnrecognizedQualifier }
     * 
     */
    public UnrecognizedQualifier createUnrecognizedQualifier() {
        return new UnrecognizedQualifier();
    }

    /**
     * Create an instance of {@link LookupValueSetExpansion }
     * 
     */
    public LookupValueSetExpansion createLookupValueSetExpansion() {
        return new LookupValueSetExpansion();
    }

    /**
     * Create an instance of {@link GetServiceVersionResponse }
     * 
     */
    public GetServiceVersionResponse createGetServiceVersionResponse() {
        return new GetServiceVersionResponse();
    }

    /**
     * Create an instance of {@link ArrayOfTns3ED }
     * 
     */
    public ArrayOfTns3ED createArrayOfTns3ED() {
        return new ArrayOfTns3ED();
    }

    /**
     * Create an instance of {@link GetServiceNameResponse }
     * 
     */
    public GetServiceNameResponse createGetServiceNameResponse() {
        return new GetServiceNameResponse();
    }

    /**
     * Create an instance of {@link GetSupportedVocabularyDomains }
     * 
     */
    public GetSupportedVocabularyDomains createGetSupportedVocabularyDomains() {
        return new GetSupportedVocabularyDomains();
    }

    /**
     * Create an instance of {@link ValueSetExpansion }
     * 
     */
    public ValueSetExpansion createValueSetExpansion() {
        return new ValueSetExpansion();
    }

    /**
     * Create an instance of {@link ValidateCode }
     * 
     */
    public ValidateCode createValidateCode() {
        return new ValidateCode();
    }

    /**
     * Create an instance of {@link GetServiceVersion }
     * 
     */
    public GetServiceVersion createGetServiceVersion() {
        return new GetServiceVersion();
    }

    /**
     * Create an instance of {@link TranslateCode }
     * 
     */
    public TranslateCode createTranslateCode() {
        return new TranslateCode();
    }

    /**
     * Create an instance of {@link ValueSetDescriptor }
     * 
     */
    public ValueSetDescriptor createValueSetDescriptor() {
        return new ValueSetDescriptor();
    }

    /**
     * Create an instance of {@link GetCTSVersionResponse }
     * 
     */
    public GetCTSVersionResponse createGetCTSVersionResponse() {
        return new GetCTSVersionResponse();
    }

    /**
     * Create an instance of {@link BadlyFormedMatchText }
     * 
     */
    public BadlyFormedMatchText createBadlyFormedMatchText() {
        return new BadlyFormedMatchText();
    }

    /**
     * Create an instance of {@link ValidateCodeResponse }
     * 
     */
    public ValidateCodeResponse createValidateCodeResponse() {
        return new ValidateCodeResponse();
    }

    /**
     * Create an instance of {@link ArrayOfTns3CR }
     * 
     */
    public ArrayOfTns3CR createArrayOfTns3CR() {
        return new ArrayOfTns3CR();
    }

    /**
     * Create an instance of {@link ValidateTranslationResponse }
     * 
     */
    public ValidateTranslationResponse createValidateTranslationResponse() {
        return new ValidateTranslationResponse();
    }

    /**
     * Create an instance of {@link UnknownConceptCode }
     * 
     */
    public UnknownConceptCode createUnknownConceptCode() {
        return new UnknownConceptCode();
    }

    /**
     * Create an instance of {@link UnknownCodeSystem }
     * 
     */
    public UnknownCodeSystem createUnknownCodeSystem() {
        return new UnknownCodeSystem();
    }

    /**
     * Create an instance of {@link UnableToTranslate }
     * 
     */
    public UnableToTranslate createUnableToTranslate() {
        return new UnableToTranslate();
    }

    /**
     * Create an instance of {@link AreEquivalentResponse }
     * 
     */
    public AreEquivalentResponse createAreEquivalentResponse() {
        return new AreEquivalentResponse();
    }

    /**
     * Create an instance of {@link CTSVersionId }
     * 
     */
    public CTSVersionId createCTSVersionId() {
        return new CTSVersionId();
    }

    /**
     * Create an instance of {@link ValidationDetail }
     * 
     */
    public ValidationDetail createValidationDetail() {
        return new ValidationDetail();
    }

    /**
     * Create an instance of {@link SubsumptionNotSupported }
     * 
     */
    public SubsumptionNotSupported createSubsumptionNotSupported() {
        return new SubsumptionNotSupported();
    }

    /**
     * Create an instance of {@link GetSupportedMatchAlgorithmsResponse }
     * 
     */
    public GetSupportedMatchAlgorithmsResponse createGetSupportedMatchAlgorithmsResponse() {
        return new GetSupportedMatchAlgorithmsResponse();
    }

    /**
     * Create an instance of {@link GetHL7ReleaseVersionResponse }
     * 
     */
    public GetHL7ReleaseVersionResponse createGetHL7ReleaseVersionResponse() {
        return new GetHL7ReleaseVersionResponse();
    }

    /**
     * Create an instance of {@link ExpandValueSetExpansionContextResponse }
     * 
     */
    public ExpandValueSetExpansionContextResponse createExpandValueSetExpansionContextResponse() {
        return new ExpandValueSetExpansionContextResponse();
    }

    /**
     * Create an instance of {@link AreEquivalent }
     * 
     */
    public AreEquivalent createAreEquivalent() {
        return new AreEquivalent();
    }

    /**
     * Create an instance of {@link Subsumes }
     * 
     */
    public Subsumes createSubsumes() {
        return new Subsumes();
    }

    /**
     * Create an instance of {@link UnknownMatchAlgorithm }
     * 
     */
    public UnknownMatchAlgorithm createUnknownMatchAlgorithm() {
        return new UnknownMatchAlgorithm();
    }

    /**
     * Create an instance of {@link FillInDetails }
     * 
     */
    public FillInDetails createFillInDetails() {
        return new FillInDetails();
    }

    /**
     * Create an instance of {@link NoApplicableDesignationFound }
     * 
     */
    public NoApplicableDesignationFound createNoApplicableDesignationFound() {
        return new NoApplicableDesignationFound();
    }

    /**
     * Create an instance of {@link TranslateCodeResponse }
     * 
     */
    public TranslateCodeResponse createTranslateCodeResponse() {
        return new TranslateCodeResponse();
    }

    /**
     * Create an instance of {@link ExpandValueSetExpansionContext }
     * 
     */
    public ExpandValueSetExpansionContext createExpandValueSetExpansionContext() {
        return new ExpandValueSetExpansionContext();
    }

    /**
     * Create an instance of {@link ValidateTranslation }
     * 
     */
    public ValidateTranslation createValidateTranslation() {
        return new ValidateTranslation();
    }

    /**
     * Create an instance of {@link UnknownVocabularyDomain }
     * 
     */
    public UnknownVocabularyDomain createUnknownVocabularyDomain() {
        return new UnknownVocabularyDomain();
    }

    /**
     * Create an instance of {@link TimeoutError }
     * 
     */
    public TimeoutError createTimeoutError() {
        return new TimeoutError();
    }

    /**
     * Create an instance of {@link UnknownApplicationContextCode }
     * 
     */
    public UnknownApplicationContextCode createUnknownApplicationContextCode() {
        return new UnknownApplicationContextCode();
    }

    /**
     * Create an instance of {@link ArrayOfValidationDetail }
     * 
     */
    public ArrayOfValidationDetail createArrayOfValidationDetail() {
        return new ArrayOfValidationDetail();
    }

    /**
     * Create an instance of {@link GetServiceName }
     * 
     */
    public GetServiceName createGetServiceName() {
        return new GetServiceName();
    }

    /**
     * Create an instance of {@link GetServiceDescriptionResponse }
     * 
     */
    public GetServiceDescriptionResponse createGetServiceDescriptionResponse() {
        return new GetServiceDescriptionResponse();
    }

    /**
     * Create an instance of {@link InvalidExpansionContext }
     * 
     */
    public InvalidExpansionContext createInvalidExpansionContext() {
        return new InvalidExpansionContext();
    }

    /**
     * Create an instance of {@link GetCTSVersion }
     * 
     */
    public GetCTSVersion createGetCTSVersion() {
        return new GetCTSVersion();
    }

    /**
     * Create an instance of {@link SubsumesResponse }
     * 
     */
    public SubsumesResponse createSubsumesResponse() {
        return new SubsumesResponse();
    }

    /**
     * Create an instance of {@link GetSupportedMatchAlgorithms }
     * 
     */
    public GetSupportedMatchAlgorithms createGetSupportedMatchAlgorithms() {
        return new GetSupportedMatchAlgorithms();
    }

    /**
     * Create an instance of {@link UnknownLanguage }
     * 
     */
    public UnknownLanguage createUnknownLanguage() {
        return new UnknownLanguage();
    }

    /**
     * Create an instance of {@link ArrayOfTns3CD }
     * 
     */
    public ArrayOfTns3CD createArrayOfTns3CD() {
        return new ArrayOfTns3CD();
    }

    /**
     * Create an instance of {@link FillInDetailsResponse }
     * 
     */
    public FillInDetailsResponse createFillInDetailsResponse() {
        return new FillInDetailsResponse();
    }

    /**
     * Create an instance of {@link GetHL7ReleaseVersion }
     * 
     */
    public GetHL7ReleaseVersion createGetHL7ReleaseVersion() {
        return new GetHL7ReleaseVersion();
    }

    /**
     * Create an instance of {@link GetSupportedVocabularyDomainsResponse }
     * 
     */
    public GetSupportedVocabularyDomainsResponse createGetSupportedVocabularyDomainsResponse() {
        return new GetSupportedVocabularyDomainsResponse();
    }

    /**
     * Create an instance of {@link ConceptId }
     * 
     */
    public ConceptId createConceptId() {
        return new ConceptId();
    }

    /**
     * Create an instance of {@link LookupValueSetExpansionResponse }
     * 
     */
    public LookupValueSetExpansionResponse createLookupValueSetExpansionResponse() {
        return new LookupValueSetExpansionResponse();
    }

    /**
     * Create an instance of {@link NoApplicableValueSet }
     * 
     */
    public NoApplicableValueSet createNoApplicableValueSet() {
        return new NoApplicableValueSet();
    }

    /**
     * Create an instance of {@link QualifiersNotSupported }
     * 
     */
    public QualifiersNotSupported createQualifiersNotSupported() {
        return new QualifiersNotSupported();
    }

    /**
     * Create an instance of {@link ValidateCodeReturn }
     * 
     */
    public ValidateCodeReturn createValidateCodeReturn() {
        return new ValidateCodeReturn();
    }

    /**
     * Create an instance of {@link UnexpectedError }
     * 
     */
    public UnexpectedError createUnexpectedError() {
        return new UnexpectedError();
    }

    /**
     * Create an instance of {@link GetServiceDescription }
     * 
     */
    public GetServiceDescription createGetServiceDescription() {
        return new GetServiceDescription();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubsumptionNotSupported }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn://hl7.org/CTSMAPI", name = "fault")
    public JAXBElement<SubsumptionNotSupported> createFault(SubsumptionNotSupported value) {
        return new JAXBElement<SubsumptionNotSupported>(_Fault_QNAME, SubsumptionNotSupported.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QualifiersNotSupported }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn://hl7.org/CTSMAPI", name = "fault1")
    public JAXBElement<QualifiersNotSupported> createFault1(QualifiersNotSupported value) {
        return new JAXBElement<QualifiersNotSupported>(_Fault1_QNAME, QualifiersNotSupported.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NoApplicableValueSet }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn://hl7.org/CTSMAPI", name = "fault11")
    public JAXBElement<NoApplicableValueSet> createFault11(NoApplicableValueSet value) {
        return new JAXBElement<NoApplicableValueSet>(_Fault11_QNAME, NoApplicableValueSet.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnableToTranslate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn://hl7.org/CTSMAPI", name = "fault12")
    public JAXBElement<UnableToTranslate> createFault12(UnableToTranslate value) {
        return new JAXBElement<UnableToTranslate>(_Fault12_QNAME, UnableToTranslate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnknownVocabularyDomain }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn://hl7.org/CTSMAPI", name = "fault10")
    public JAXBElement<UnknownVocabularyDomain> createFault10(UnknownVocabularyDomain value) {
        return new JAXBElement<UnknownVocabularyDomain>(_Fault10_QNAME, UnknownVocabularyDomain.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvalidExpansionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn://hl7.org/CTSMAPI", name = "fault15")
    public JAXBElement<InvalidExpansionContext> createFault15(InvalidExpansionContext value) {
        return new JAXBElement<InvalidExpansionContext>(_Fault15_QNAME, InvalidExpansionContext.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnknownLanguage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn://hl7.org/CTSMAPI", name = "fault13")
    public JAXBElement<UnknownLanguage> createFault13(UnknownLanguage value) {
        return new JAXBElement<UnknownLanguage>(_Fault13_QNAME, UnknownLanguage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NoApplicableDesignationFound }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn://hl7.org/CTSMAPI", name = "fault14")
    public JAXBElement<NoApplicableDesignationFound> createFault14(NoApplicableDesignationFound value) {
        return new JAXBElement<NoApplicableDesignationFound>(_Fault14_QNAME, NoApplicableDesignationFound.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnknownApplicationContextCode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn://hl7.org/CTSMAPI", name = "fault9")
    public JAXBElement<UnknownApplicationContextCode> createFault9(UnknownApplicationContextCode value) {
        return new JAXBElement<UnknownApplicationContextCode>(_Fault9_QNAME, UnknownApplicationContextCode.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BadlyFormedMatchText }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn://hl7.org/CTSMAPI", name = "fault8")
    public JAXBElement<BadlyFormedMatchText> createFault8(BadlyFormedMatchText value) {
        return new JAXBElement<BadlyFormedMatchText>(_Fault8_QNAME, BadlyFormedMatchText.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnknownMatchAlgorithm }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn://hl7.org/CTSMAPI", name = "fault7")
    public JAXBElement<UnknownMatchAlgorithm> createFault7(UnknownMatchAlgorithm value) {
        return new JAXBElement<UnknownMatchAlgorithm>(_Fault7_QNAME, UnknownMatchAlgorithm.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TimeoutError }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn://hl7.org/CTSMAPI", name = "fault6")
    public JAXBElement<TimeoutError> createFault6(TimeoutError value) {
        return new JAXBElement<TimeoutError>(_Fault6_QNAME, TimeoutError.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnexpectedError }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn://hl7.org/CTSMAPI", name = "fault5")
    public JAXBElement<UnexpectedError> createFault5(UnexpectedError value) {
        return new JAXBElement<UnexpectedError>(_Fault5_QNAME, UnexpectedError.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnrecognizedQualifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn://hl7.org/CTSMAPI", name = "fault4")
    public JAXBElement<UnrecognizedQualifier> createFault4(UnrecognizedQualifier value) {
        return new JAXBElement<UnrecognizedQualifier>(_Fault4_QNAME, UnrecognizedQualifier.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnknownCodeSystem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn://hl7.org/CTSMAPI", name = "fault3")
    public JAXBElement<UnknownCodeSystem> createFault3(UnknownCodeSystem value) {
        return new JAXBElement<UnknownCodeSystem>(_Fault3_QNAME, UnknownCodeSystem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnknownConceptCode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn://hl7.org/CTSMAPI", name = "fault2")
    public JAXBElement<UnknownConceptCode> createFault2(UnknownConceptCode value) {
        return new JAXBElement<UnknownConceptCode>(_Fault2_QNAME, UnknownConceptCode.class, null, value);
    }

}
