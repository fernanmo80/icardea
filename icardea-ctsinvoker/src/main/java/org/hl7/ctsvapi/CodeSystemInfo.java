
package org.hl7.ctsvapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CodeSystemInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CodeSystemInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codeSystem" type="{urn://hl7.org/CTSVAPI}CodeSystemIdAndVersions"/>
 *         &lt;element name="fullName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="codeSystemDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="supportedLanguages" type="{urn://hl7.org/CTSVAPI}ArrayOf_xsd_string"/>
 *         &lt;element name="supportedRelations" type="{urn://hl7.org/CTSVAPI}ArrayOf_xsd_string"/>
 *         &lt;element name="supportedProperties" type="{urn://hl7.org/CTSVAPI}ArrayOf_xsd_string"/>
 *         &lt;element name="supportedMimeTypes" type="{urn://hl7.org/CTSVAPI}ArrayOf_xsd_string"/>
 *         &lt;element name="supportedRelationQualifiers" type="{urn://hl7.org/CTSVAPI}ArrayOf_xsd_string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CodeSystemInfo", propOrder = {
    "codeSystem",
    "fullName",
    "codeSystemDescription",
    "supportedLanguages",
    "supportedRelations",
    "supportedProperties",
    "supportedMimeTypes",
    "supportedRelationQualifiers"
})
public class CodeSystemInfo {

    @XmlElement(required = true, nillable = true)
    protected CodeSystemIdAndVersions codeSystem;
    @XmlElement(required = true, nillable = true)
    protected String fullName;
    @XmlElement(required = true, nillable = true)
    protected String codeSystemDescription;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfXsdString supportedLanguages;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfXsdString supportedRelations;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfXsdString supportedProperties;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfXsdString supportedMimeTypes;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfXsdString supportedRelationQualifiers;

    /**
     * Gets the value of the codeSystem property.
     * 
     * @return
     *     possible object is
     *     {@link CodeSystemIdAndVersions }
     *     
     */
    public CodeSystemIdAndVersions getCodeSystem() {
        return codeSystem;
    }

    /**
     * Sets the value of the codeSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeSystemIdAndVersions }
     *     
     */
    public void setCodeSystem(CodeSystemIdAndVersions value) {
        this.codeSystem = value;
    }

    /**
     * Gets the value of the fullName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * Sets the value of the fullName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFullName(String value) {
        this.fullName = value;
    }

    /**
     * Gets the value of the codeSystemDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeSystemDescription() {
        return codeSystemDescription;
    }

    /**
     * Sets the value of the codeSystemDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeSystemDescription(String value) {
        this.codeSystemDescription = value;
    }

    /**
     * Gets the value of the supportedLanguages property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfXsdString }
     *     
     */
    public ArrayOfXsdString getSupportedLanguages() {
        return supportedLanguages;
    }

    /**
     * Sets the value of the supportedLanguages property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfXsdString }
     *     
     */
    public void setSupportedLanguages(ArrayOfXsdString value) {
        this.supportedLanguages = value;
    }

    /**
     * Gets the value of the supportedRelations property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfXsdString }
     *     
     */
    public ArrayOfXsdString getSupportedRelations() {
        return supportedRelations;
    }

    /**
     * Sets the value of the supportedRelations property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfXsdString }
     *     
     */
    public void setSupportedRelations(ArrayOfXsdString value) {
        this.supportedRelations = value;
    }

    /**
     * Gets the value of the supportedProperties property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfXsdString }
     *     
     */
    public ArrayOfXsdString getSupportedProperties() {
        return supportedProperties;
    }

    /**
     * Sets the value of the supportedProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfXsdString }
     *     
     */
    public void setSupportedProperties(ArrayOfXsdString value) {
        this.supportedProperties = value;
    }

    /**
     * Gets the value of the supportedMimeTypes property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfXsdString }
     *     
     */
    public ArrayOfXsdString getSupportedMimeTypes() {
        return supportedMimeTypes;
    }

    /**
     * Sets the value of the supportedMimeTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfXsdString }
     *     
     */
    public void setSupportedMimeTypes(ArrayOfXsdString value) {
        this.supportedMimeTypes = value;
    }

    /**
     * Gets the value of the supportedRelationQualifiers property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfXsdString }
     *     
     */
    public ArrayOfXsdString getSupportedRelationQualifiers() {
        return supportedRelationQualifiers;
    }

    /**
     * Sets the value of the supportedRelationQualifiers property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfXsdString }
     *     
     */
    public void setSupportedRelationQualifiers(ArrayOfXsdString value) {
        this.supportedRelationQualifiers = value;
    }

}
