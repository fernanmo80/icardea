package tr.com.srdc.icardea.careplanengine.entities.patientDataEntities;

//~--- non-JDK imports --------------------------------------------------------

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import tr.com.srdc.icardea.careplanengine.glmodel.Time_Interval;

public class TimeIntervalEntity {
    protected String            displayName;
    protected TimeLiteralEntity maxTimeStamp;
    protected TimeLiteralEntity minTimeStamp;

    public TimeIntervalEntity() {

        // TODO Auto-generated constructor stub
    }

    public TimeIntervalEntity(Time_Interval timeInterval) {
        if (timeInterval.getDisplay_name() != null) {
            this.displayName = new String(timeInterval.getDisplay_name());
        }

        if (timeInterval.getMax_time_stamp() != null) {
            this.maxTimeStamp = new TimeLiteralEntity(timeInterval.getMax_time_stamp());
        }

        if (timeInterval.getMin_time_stamp() != null) {
            this.minTimeStamp = new TimeLiteralEntity(timeInterval.getMin_time_stamp());
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
     * @return Returns the maxTimeStamp.
     */
    public TimeLiteralEntity getMaxTimeStamp() {
        return maxTimeStamp;
    }

    /**
     * @param maxTimeStamp The maxTimeStamp to set.
     */
    public void setMaxTimeStamp(TimeLiteralEntity maxTimeStamp) {
        this.maxTimeStamp = maxTimeStamp;
    }

    /**
     * @return Returns the minTimeStamp.
     */
    public TimeLiteralEntity getMinTimeStamp() {
        return minTimeStamp;
    }

    /**
     * @param minTimeStamp The minTimeStamp to set.
     */
    public void setMinTimeStamp(TimeLiteralEntity minTimeStamp) {
        this.minTimeStamp = minTimeStamp;
    }

    public Element toXmlElement(String string, Document doc) {
        try {
            Element element = doc.createElement(string);

            if (displayName != null) {
                Element displayNameNode = doc.createElement("Display_Name_TI");

                displayNameNode.setTextContent(displayName);
                element.appendChild(displayNameNode);
            }

            if (this.minTimeStamp != null) {
                element.appendChild(this.minTimeStamp.toXmlElement("Min_Time_Stamp_TI", doc));
            }

            if (this.maxTimeStamp != null) {
                element.appendChild(this.maxTimeStamp.toXmlElement("Max_Time_Stamp_TI", doc));
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

                    if (tagName.equals("Display_Name_TI")) {
                        displayName = current.getTextContent();
                    } else if (tagName.equals("Max_Time_Stamp_TI")) {
                        maxTimeStamp = new TimeLiteralEntity();
                        maxTimeStamp.fromXmlElement((Element) current);
                    } else if (tagName.equals("Min_Time_Stamp_TI")) {
                        minTimeStamp = new TimeLiteralEntity();
                        minTimeStamp.fromXmlElement((Element) current);
                    }
                }
            }
        } catch (Exception exc) {
            exc.printStackTrace();
        }
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
