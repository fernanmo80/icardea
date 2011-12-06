
package org.hl7.ctsvapi;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codeSystem_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="source_code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="target_code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="relationship_code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="relationQualifiers" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *         &lt;element name="directRelationsOnly" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "codeSystemId",
    "sourceCode",
    "targetCode",
    "relationshipCode",
    "relationQualifiers",
    "directRelationsOnly"
})
@XmlRootElement(name = "areCodesRelated")
public class AreCodesRelated {

    @XmlElement(name = "codeSystem_id", required = true)
    protected String codeSystemId;
    @XmlElement(name = "source_code", required = true)
    protected String sourceCode;
    @XmlElement(name = "target_code", required = true)
    protected String targetCode;
    @XmlElement(name = "relationship_code", required = true)
    protected String relationshipCode;
    @XmlElement(required = true)
    protected List<String> relationQualifiers;
    protected boolean directRelationsOnly;

    /**
     * Gets the value of the codeSystemId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeSystemId() {
        return codeSystemId;
    }

    /**
     * Sets the value of the codeSystemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeSystemId(String value) {
        this.codeSystemId = value;
    }

    /**
     * Gets the value of the sourceCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceCode() {
        return sourceCode;
    }

    /**
     * Sets the value of the sourceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceCode(String value) {
        this.sourceCode = value;
    }

    /**
     * Gets the value of the targetCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetCode() {
        return targetCode;
    }

    /**
     * Sets the value of the targetCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetCode(String value) {
        this.targetCode = value;
    }

    /**
     * Gets the value of the relationshipCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelationshipCode() {
        return relationshipCode;
    }

    /**
     * Sets the value of the relationshipCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelationshipCode(String value) {
        this.relationshipCode = value;
    }

    /**
     * Gets the value of the relationQualifiers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the relationQualifiers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelationQualifiers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getRelationQualifiers() {
        if (relationQualifiers == null) {
            relationQualifiers = new ArrayList<String>();
        }
        return this.relationQualifiers;
    }

    /**
     * Gets the value of the directRelationsOnly property.
     * 
     */
    public boolean isDirectRelationsOnly() {
        return directRelationsOnly;
    }

    /**
     * Sets the value of the directRelationsOnly property.
     * 
     */
    public void setDirectRelationsOnly(boolean value) {
        this.directRelationsOnly = value;
    }

}
