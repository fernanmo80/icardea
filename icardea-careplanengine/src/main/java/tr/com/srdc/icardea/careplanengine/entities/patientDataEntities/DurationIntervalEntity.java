package tr.com.srdc.icardea.careplanengine.entities.patientDataEntities;

//~--- non-JDK imports --------------------------------------------------------

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import tr.com.srdc.icardea.careplanengine.glmodel.Duration_Interval;

public class DurationIntervalEntity {
    protected String         displayName = "";
    protected DurationEntity maxDuration;
    protected DurationEntity minDuration;

    public DurationIntervalEntity() {

        // TODO Auto-generated constructor stub
    }

    public DurationIntervalEntity(Duration_Interval durationInterval) {
        this.displayName = new String(durationInterval.getDisplay_name());

        if (durationInterval.getMax_duration() != null) {
            this.maxDuration = new DurationEntity(durationInterval.getMax_duration());
        }

        if (durationInterval.getMin_duration() != null) {
            this.minDuration = new DurationEntity(durationInterval.getMin_duration());
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
     * @return Returns the maxDuration.
     */
    public DurationEntity getMaxDuration() {
        return maxDuration;
    }

    /**
     * @param maxDuration The maxDuration to set.
     */
    public void setMaxDuration(DurationEntity maxDuration) {
        this.maxDuration = maxDuration;
    }

    /**
     * @return Returns the minDuration.
     */
    public DurationEntity getMinDuration() {
        return minDuration;
    }

    /**
     * @param minDuration The minDuration to set.
     */
    public void setMinDuration(DurationEntity minDuration) {
        this.minDuration = minDuration;
    }

    public Element toXmlElement(String string, Document doc) {

        // TODO Auto-generated method stub
        try {
            Element element = doc.createElement(string);

            if (this.displayName != null) {
                Element displayNameNode = doc.createElement("Display_Name_DI");

                displayNameNode.setTextContent(this.displayName);
                element.appendChild(displayNameNode);
            }

            if (this.minDuration != null) {
                element.appendChild(this.minDuration.toXmlElement("Min_Duration_DI", doc));
            }

            if (this.maxDuration != null) {
                element.appendChild(this.maxDuration.toXmlElement("Max_Duration_DI", doc));
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

                    if (tagName.equals("Display_Name_DI")) {
                        displayName = current.getTextContent();
                    } else if (tagName.equals("Min_Duration_DI")) {
                        minDuration = new DurationEntity();
                        minDuration.fromXmlElement((Element) current);
                    } else if (tagName.equals("Max_Duration_DI")) {
                        maxDuration = new DurationEntity();
                        maxDuration.fromXmlElement((Element) current);
                    }
                }
            }
        } catch (Exception exc) {
            exc.printStackTrace();
        }
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
