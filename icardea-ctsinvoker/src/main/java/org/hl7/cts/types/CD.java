
package org.hl7.cts.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.hl7.ctsmapi.ArrayOfTns3CD;
import org.hl7.ctsmapi.ArrayOfTns3CR;


/**
 * <p>Java class for CD complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CD">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="codeSystem" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="codeSystemName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="codeSystemVersion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="displayName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="qualifiers" type="{urn://hl7.org/CTSMAPI}ArrayOf_tns3_CR"/>
 *         &lt;element name="originalText" type="{urn://cts.hl7.org/types}ED"/>
 *         &lt;element name="translation" type="{urn://hl7.org/CTSMAPI}ArrayOf_tns3_CD"/>
 *         &lt;element name="codingRationale" type="{urn://cts.hl7.org/types}CS"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CD", propOrder = {
    "code",
    "codeSystem",
    "codeSystemName",
    "codeSystemVersion",
    "displayName",
    "qualifiers",
    "originalText",
    "translation",
    "codingRationale"
})
public class CD {

    @XmlElement(required = true, nillable = true)
    protected String code;
    @XmlElement(required = true, nillable = true)
    protected String codeSystem;
    @XmlElement(required = true, nillable = true)
    protected String codeSystemName;
    @XmlElement(required = true, nillable = true)
    protected String codeSystemVersion;
    @XmlElement(required = true, nillable = true)
    protected String displayName;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfTns3CR qualifiers;
    @XmlElement(required = true, nillable = true)
    protected ED originalText;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfTns3CD translation;
    @XmlElement(required = true, nillable = true)
    protected CS codingRationale;

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Gets the value of the codeSystem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeSystem() {
        return codeSystem;
    }

    /**
     * Sets the value of the codeSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeSystem(String value) {
        this.codeSystem = value;
    }

    /**
     * Gets the value of the codeSystemName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeSystemName() {
        return codeSystemName;
    }

    /**
     * Sets the value of the codeSystemName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeSystemName(String value) {
        this.codeSystemName = value;
    }

    /**
     * Gets the value of the codeSystemVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeSystemVersion() {
        return codeSystemVersion;
    }

    /**
     * Sets the value of the codeSystemVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeSystemVersion(String value) {
        this.codeSystemVersion = value;
    }

    /**
     * Gets the value of the displayName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Sets the value of the displayName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayName(String value) {
        this.displayName = value;
    }

    /**
     * Gets the value of the qualifiers property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTns3CR }
     *     
     */
    public ArrayOfTns3CR getQualifiers() {
        return qualifiers;
    }

    /**
     * Sets the value of the qualifiers property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTns3CR }
     *     
     */
    public void setQualifiers(ArrayOfTns3CR value) {
        this.qualifiers = value;
    }

    /**
     * Gets the value of the originalText property.
     * 
     * @return
     *     possible object is
     *     {@link ED }
     *     
     */
    public ED getOriginalText() {
        return originalText;
    }

    /**
     * Sets the value of the originalText property.
     * 
     * @param value
     *     allowed object is
     *     {@link ED }
     *     
     */
    public void setOriginalText(ED value) {
        this.originalText = value;
    }

    /**
     * Gets the value of the translation property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTns3CD }
     *     
     */
    public ArrayOfTns3CD getTranslation() {
        return translation;
    }

    /**
     * Sets the value of the translation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTns3CD }
     *     
     */
    public void setTranslation(ArrayOfTns3CD value) {
        this.translation = value;
    }

    /**
     * Gets the value of the codingRationale property.
     * 
     * @return
     *     possible object is
     *     {@link CS }
     *     
     */
    public CS getCodingRationale() {
        return codingRationale;
    }

    /**
     * Sets the value of the codingRationale property.
     * 
     * @param value
     *     allowed object is
     *     {@link CS }
     *     
     */
    public void setCodingRationale(CS value) {
        this.codingRationale = value;
    }

}
