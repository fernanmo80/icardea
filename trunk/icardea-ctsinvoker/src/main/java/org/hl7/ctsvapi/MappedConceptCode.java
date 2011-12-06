
package org.hl7.ctsvapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MappedConceptCode complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MappedConceptCode">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="mappedConcept_id" type="{urn://hl7.org/CTSVAPI}ConceptId"/>
 *         &lt;element name="mapQuality_code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MappedConceptCode", propOrder = {
    "mappedConceptId",
    "mapQualityCode"
})
public class MappedConceptCode {

    @XmlElement(name = "mappedConcept_id", required = true, nillable = true)
    protected ConceptId mappedConceptId;
    @XmlElement(name = "mapQuality_code", required = true, nillable = true)
    protected String mapQualityCode;

    /**
     * Gets the value of the mappedConceptId property.
     * 
     * @return
     *     possible object is
     *     {@link ConceptId }
     *     
     */
    public ConceptId getMappedConceptId() {
        return mappedConceptId;
    }

    /**
     * Sets the value of the mappedConceptId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConceptId }
     *     
     */
    public void setMappedConceptId(ConceptId value) {
        this.mappedConceptId = value;
    }

    /**
     * Gets the value of the mapQualityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMapQualityCode() {
        return mapQualityCode;
    }

    /**
     * Sets the value of the mapQualityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMapQualityCode(String value) {
        this.mapQualityCode = value;
    }

}
