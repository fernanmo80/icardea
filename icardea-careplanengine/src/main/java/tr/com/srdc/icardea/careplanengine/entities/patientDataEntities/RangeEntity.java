package tr.com.srdc.icardea.careplanengine.entities.patientDataEntities;

//~--- non-JDK imports --------------------------------------------------------

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import tr.com.srdc.icardea.careplanengine.glmodel.Range;

/**
 * @author kullanici
 *
 */

/**
 * @author itasyurt 01.05.06
 *
 */
public class RangeEntity extends ObservationValueEntity {
    protected String                 displayName;
    protected PhysicalQuantityEntity lowerBound;
    protected PhysicalQuantityEntity upperBound;

    public RangeEntity() {

        // TODO Auto-generated constructor stub
    }

    public RangeEntity(Range range) {
        if (range.hasDisplay_name()) {
            this.displayName = new String(range.getDisplay_name());
        }

        if (range.hasLower_bound()) {
            this.lowerBound = new PhysicalQuantityEntity(range.getLower_bound());
        }

        if (range.hasUpper_bound()) {
            this.upperBound = new PhysicalQuantityEntity(range.getUpper_bound());
        }
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
     * @return Returns the lowerBound.
     */
    public PhysicalQuantityEntity getLowerBound() {
        return lowerBound;
    }

    /**
     * @param lowerBound The lowerBound to set.
     */
    public void setLowerBound(PhysicalQuantityEntity lowerBound) {
        this.lowerBound = lowerBound;
    }

    /**
     * @return Returns the upperBound.
     */
    public PhysicalQuantityEntity getUpperBound() {
        return upperBound;
    }

    /**
     * @param upperBound The upperBound to set.
     */
    public void setUpperBound(PhysicalQuantityEntity upperBound) {
        this.upperBound = upperBound;
    }

    /*
     * To Xml
     *
     */
    public Element toXmlElement(Document doc) {

        // TODO Auto-generated method stub
        try {
            Element element = doc.createElement("Range");

            if (displayName != null) {
                Element displayNameNode = doc.createElement("Display_Name_RN");

                displayNameNode.setTextContent(displayName);
                element.appendChild(displayNameNode);
            }

            if (this.upperBound != null) {
                element.appendChild(this.upperBound.toXmlElement("Upper_Bound_RN", doc));
            }

            if (this.lowerBound != null) {
                element.appendChild(this.lowerBound.toXmlElement("Lower_Bound_RN", doc));
            }

            return element;
        } catch (Exception exc) {
            exc.printStackTrace();

            return null;
        }
    }

    public Element toXmlElement(String string, Document doc) {

        // TODO Auto-generated method stub
        try {
            Element element = doc.createElement(string);

            if (displayName != null) {
                Element displayNameNode = doc.createElement("Display_Name_RN");

                displayNameNode.setTextContent(displayName);
                element.appendChild(displayNameNode);
            }

            if (this.upperBound != null) {
                element.appendChild(this.upperBound.toXmlElement("Upper_Bound_RN", doc));
            }

            if (this.lowerBound != null) {
                element.appendChild(this.lowerBound.toXmlElement("Lower_Bound_RN", doc));
            }

            return element;
        } catch (Exception exc) {
            exc.printStackTrace();

            return null;
        }
    }

    public void fromXmlElement(Element element) {

        // TODO Auto-generated method stub
        try {
            NodeList nodeList   = element.getChildNodes();
            int      listLength = nodeList.getLength();

            for (int i = 0; i < listLength; ++i) {
                Node current = nodeList.item(i);

                if (current.getNodeType() == Node.ELEMENT_NODE) {
                    String tagName = current.getNodeName();

                    if (tagName.equals("Display_Name_RN")) {
                        displayName = current.getTextContent();
                    } else if (tagName.equals("Lower_Bound_RN")) {
                        lowerBound = new PhysicalQuantityEntity();
                        lowerBound.fromXmlElement((Element) current);
                    } else if (tagName.equals("Upper_Bound_RN")) {
                        upperBound = new PhysicalQuantityEntity();
                        upperBound.fromXmlElement((Element) current);
                    }
                }
            }
        } catch (Exception exc) {
            exc.printStackTrace();
        }
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
