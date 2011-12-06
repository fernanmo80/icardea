
package org.hl7.cts.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.hl7.ctsmapi.ArrayOfTns3ED;


/**
 * <p>Java class for ED complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ED">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="_this" type="{urn://cts.hl7.org/types}binary_or_text"/>
 *         &lt;element name="encoding" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="mediaType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="compression" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="integrityCheck" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *         &lt;element name="reference" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ingegrityCheckAlgorithm" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="charset" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="language" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="thumbnail" type="{urn://hl7.org/CTSMAPI}ArrayOf_tns3_ED"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ED", propOrder = {
    "_this",
    "encoding",
    "mediaType",
    "compression",
    "integrityCheck",
    "reference",
    "ingegrityCheckAlgorithm",
    "charset",
    "language",
    "thumbnail"
})
public class ED {

    @XmlElement(required = true, nillable = true)
    protected BinaryOrText _this;
    @XmlElement(required = true, nillable = true)
    protected String encoding;
    @XmlElement(required = true, nillable = true)
    protected String mediaType;
    @XmlElement(required = true, nillable = true)
    protected String compression;
    @XmlElement(required = true, nillable = true)
    protected byte[] integrityCheck;
    @XmlElement(required = true, nillable = true)
    protected String reference;
    @XmlElement(required = true, nillable = true)
    protected String ingegrityCheckAlgorithm;
    @XmlElement(required = true, nillable = true)
    protected String charset;
    @XmlElement(required = true, nillable = true)
    protected String language;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfTns3ED thumbnail;

    /**
     * Gets the value of the this property.
     * 
     * @return
     *     possible object is
     *     {@link BinaryOrText }
     *     
     */
    public BinaryOrText getThis() {
        return _this;
    }

    /**
     * Sets the value of the this property.
     * 
     * @param value
     *     allowed object is
     *     {@link BinaryOrText }
     *     
     */
    public void setThis(BinaryOrText value) {
        this._this = value;
    }

    /**
     * Gets the value of the encoding property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEncoding() {
        return encoding;
    }

    /**
     * Sets the value of the encoding property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEncoding(String value) {
        this.encoding = value;
    }

    /**
     * Gets the value of the mediaType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMediaType() {
        return mediaType;
    }

    /**
     * Sets the value of the mediaType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMediaType(String value) {
        this.mediaType = value;
    }

    /**
     * Gets the value of the compression property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompression() {
        return compression;
    }

    /**
     * Sets the value of the compression property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompression(String value) {
        this.compression = value;
    }

    /**
     * Gets the value of the integrityCheck property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getIntegrityCheck() {
        return integrityCheck;
    }

    /**
     * Sets the value of the integrityCheck property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setIntegrityCheck(byte[] value) {
        this.integrityCheck = ((byte[]) value);
    }

    /**
     * Gets the value of the reference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReference() {
        return reference;
    }

    /**
     * Sets the value of the reference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReference(String value) {
        this.reference = value;
    }

    /**
     * Gets the value of the ingegrityCheckAlgorithm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIngegrityCheckAlgorithm() {
        return ingegrityCheckAlgorithm;
    }

    /**
     * Sets the value of the ingegrityCheckAlgorithm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIngegrityCheckAlgorithm(String value) {
        this.ingegrityCheckAlgorithm = value;
    }

    /**
     * Gets the value of the charset property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCharset() {
        return charset;
    }

    /**
     * Sets the value of the charset property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCharset(String value) {
        this.charset = value;
    }

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguage(String value) {
        this.language = value;
    }

    /**
     * Gets the value of the thumbnail property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTns3ED }
     *     
     */
    public ArrayOfTns3ED getThumbnail() {
        return thumbnail;
    }

    /**
     * Sets the value of the thumbnail property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTns3ED }
     *     
     */
    public void setThumbnail(ArrayOfTns3ED value) {
        this.thumbnail = value;
    }

}
