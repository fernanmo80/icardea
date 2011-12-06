package tr.com.srdc.icardea.careplanengine.entities.patientDataEntities;

//~--- non-JDK imports --------------------------------------------------------

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import tr.com.srdc.icardea.careplanengine.glmodel.Duration;

/**
 * @author itasyurt 01.05.06
 *
 */
public class DurationEntity {
    protected String displayName;
    protected String encodingLanguage;
    protected String specification;

    public DurationEntity() {

        // TODO Auto-generated constructor stub
    }

    public DurationEntity(Duration duration) {
        this.displayName      = new String(duration.getDisplay_name());
        this.encodingLanguage = new String(duration.getEncoding_language());
        this.specification    = new String(duration.getSpecification());
    }

    /**
     * @return Returns the displayName.
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * @param displayName The displayName to set.
     */
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * @return Returns the encodingLanguage.
     */
    public String getEncodingLanguage() {
        return encodingLanguage;
    }

    /**
     * @param encodingLanguage The encodingLanguage to set.
     */
    public void setEncodingLanguage(String encodingLanguage) {
        this.encodingLanguage = encodingLanguage;
    }

    /**
     * @return Returns the specification.
     */
    public String getSpecification() {
        return specification;
    }

    /**
     * @param specification The specification to set.
     */
    public void setSpecification(String specification) {
        this.specification = specification;
    }

    public Element toXmlElement(String string, Document doc) {

        // TODO Auto-generated method stub
        try {
            Element element = doc.createElement(string);

            if (this.displayName != null) {
                Element displayNameNode = doc.createElement("Display_Name_D");

                displayNameNode.setTextContent(displayName);
                element.appendChild(displayNameNode);
            }

            if (this.encodingLanguage != null) {
                Element encodingLanguageNode = doc.createElement("Encoding_Language_D");

                encodingLanguageNode.setTextContent(this.encodingLanguage);
                element.appendChild(encodingLanguageNode);
            }

            if (this.specification != null) {
                Element specificationNode = doc.createElement("Specification_D");

                specificationNode.setTextContent(this.specification);
                element.appendChild(specificationNode);
            }

            return element;
        } catch (Exception exc) {
            exc.printStackTrace();

            return null;
        }
    }

    public void fromXmlElement(Element element) {
        try {
            NodeList nodeList   = element.getChildNodes();
            int      listLength = nodeList.getLength();

            for (int i = 0; i < listLength; ++i) {
                Node current = nodeList.item(i);

                if (current.getNodeType() == Node.ELEMENT_NODE) {
                    String tagName = current.getNodeName();

                    if (tagName.equals("Display_Name_D")) {
                        this.displayName = current.getTextContent();
                    } else if (tagName.equals("Encoding_Language_D")) {
                        this.encodingLanguage = current.getTextContent();
                    } else if (tagName.equals("Specification_D")) {
                        this.specification = current.getTextContent();
                    }
                }
            }
        } catch (Exception exc) {
            exc.printStackTrace();
        }
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
