package tr.com.srdc.icardea.careplanengine.entities.patientDataEntities;

//~--- non-JDK imports --------------------------------------------------------

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import tr.com.srdc.icardea.careplanengine.glmodel.Ratio;

public class RatioEntity extends ObservationValueEntity {
    protected int    denomerator;
    protected String displayName;
    protected int    numerator;

    public RatioEntity() {
        super();

        // TODO Auto-generated constructor stub
    }

    public RatioEntity(Ratio ratio) {
        if (ratio.hasDisplay_name()) {
            this.displayName = new String(ratio.getDisplay_name());
        }

        if (ratio.hasDenomerator()) {
            this.denomerator = ratio.getDenomerator();
        }

        if (ratio.hasNumerator()) {
            this.numerator = ratio.getNumerator();
        }
    }

    /**
     * @return Returns the denomerator.
     */
    public int getDenomerator() {
        return denomerator;
    }

    /**
     * @param denomerator The denomerator to set.
     */
    public void setDenomerator(int denomerator) {
        this.denomerator = denomerator;
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
     * @return Returns the numerator.
     */
    public int getNumerator() {
        return numerator;
    }

    /**
     * @param numerator The numerator to set.
     */
    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public Element toXmlElement(Document doc) {

        // TODO Auto-generated method stub
        try {
            Element element         = doc.createElement("Ratio");
            Element displayNameNode = doc.createElement("Display_Name_RT");

            displayNameNode.setTextContent(displayName);
            element.appendChild(displayNameNode);

            // / numerator
            Element numeratorNode = doc.createElement("Numerator_RT");

            numeratorNode.setTextContent("" + numerator);
            element.appendChild(numeratorNode);

            // / denominator
            Element denomeratorNode = doc.createElement("Denomerator_RT");

            denomeratorNode.setTextContent("" + this.denomerator);
            element.appendChild(denomeratorNode);

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

                    if (tagName.equals("Display_Name_RT")) {
                        displayName = current.getTextContent();
                    }

                    if (tagName.equals("Numerator_RT")) {
                        try {
                            numerator = Integer.parseInt(current.getTextContent());
                        } catch (Exception exc) {
                            exc.printStackTrace();
                        }
                    } else if (tagName.equals("Denomerator_RT")) {
                        try {
                            denomerator = Integer.parseInt(current.getTextContent());
                        } catch (Exception exc) {
                            exc.printStackTrace();
                        }
                    }
                }
            }
        } catch (Exception exc) {
            exc.printStackTrace();
        }
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
