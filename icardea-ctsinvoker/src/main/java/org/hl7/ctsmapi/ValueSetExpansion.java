
package org.hl7.ctsmapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.hl7.cts.types.BL;
import org.hl7.cts.types.INT;
import org.hl7.cts.types.ST;


/**
 * <p>Java class for ValueSetExpansion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ValueSetExpansion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pathLength" type="{urn://cts.hl7.org/types}INT"/>
 *         &lt;element name="nodeType_code" type="{urn://cts.hl7.org/types}ST"/>
 *         &lt;element name="valueSet" type="{urn://hl7.org/CTSMAPI}ValueSetDescriptor"/>
 *         &lt;element name="concept_id" type="{urn://hl7.org/CTSMAPI}ConceptId"/>
 *         &lt;element name="displayName" type="{urn://cts.hl7.org/types}ST"/>
 *         &lt;element name="isExpandable" type="{urn://cts.hl7.org/types}BL"/>
 *         &lt;element name="expansionContext" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValueSetExpansion", propOrder = {
    "pathLength",
    "nodeTypeCode",
    "valueSet",
    "conceptId",
    "displayName",
    "isExpandable",
    "expansionContext"
})
public class ValueSetExpansion {

    @XmlElement(required = true, nillable = true)
    protected INT pathLength;
    @XmlElement(name = "nodeType_code", required = true, nillable = true)
    protected ST nodeTypeCode;
    @XmlElement(required = true, nillable = true)
    protected ValueSetDescriptor valueSet;
    @XmlElement(name = "concept_id", required = true, nillable = true)
    protected ConceptId conceptId;
    @XmlElement(required = true, nillable = true)
    protected ST displayName;
    @XmlElement(required = true, nillable = true)
    protected BL isExpandable;
    @XmlElement(required = true, nillable = true)
    protected byte[] expansionContext;

    /**
     * Gets the value of the pathLength property.
     * 
     * @return
     *     possible object is
     *     {@link INT }
     *     
     */
    public INT getPathLength() {
        return pathLength;
    }

    /**
     * Sets the value of the pathLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link INT }
     *     
     */
    public void setPathLength(INT value) {
        this.pathLength = value;
    }

    /**
     * Gets the value of the nodeTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link ST }
     *     
     */
    public ST getNodeTypeCode() {
        return nodeTypeCode;
    }

    /**
     * Sets the value of the nodeTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ST }
     *     
     */
    public void setNodeTypeCode(ST value) {
        this.nodeTypeCode = value;
    }

    /**
     * Gets the value of the valueSet property.
     * 
     * @return
     *     possible object is
     *     {@link ValueSetDescriptor }
     *     
     */
    public ValueSetDescriptor getValueSet() {
        return valueSet;
    }

    /**
     * Sets the value of the valueSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValueSetDescriptor }
     *     
     */
    public void setValueSet(ValueSetDescriptor value) {
        this.valueSet = value;
    }

    /**
     * Gets the value of the conceptId property.
     * 
     * @return
     *     possible object is
     *     {@link ConceptId }
     *     
     */
    public ConceptId getConceptId() {
        return conceptId;
    }

    /**
     * Sets the value of the conceptId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConceptId }
     *     
     */
    public void setConceptId(ConceptId value) {
        this.conceptId = value;
    }

    /**
     * Gets the value of the displayName property.
     * 
     * @return
     *     possible object is
     *     {@link ST }
     *     
     */
    public ST getDisplayName() {
        return displayName;
    }

    /**
     * Sets the value of the displayName property.
     * 
     * @param value
     *     allowed object is
     *     {@link ST }
     *     
     */
    public void setDisplayName(ST value) {
        this.displayName = value;
    }

    /**
     * Gets the value of the isExpandable property.
     * 
     * @return
     *     possible object is
     *     {@link BL }
     *     
     */
    public BL getIsExpandable() {
        return isExpandable;
    }

    /**
     * Sets the value of the isExpandable property.
     * 
     * @param value
     *     allowed object is
     *     {@link BL }
     *     
     */
    public void setIsExpandable(BL value) {
        this.isExpandable = value;
    }

    /**
     * Gets the value of the expansionContext property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getExpansionContext() {
        return expansionContext;
    }

    /**
     * Sets the value of the expansionContext property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setExpansionContext(byte[] value) {
        this.expansionContext = ((byte[]) value);
    }

}
