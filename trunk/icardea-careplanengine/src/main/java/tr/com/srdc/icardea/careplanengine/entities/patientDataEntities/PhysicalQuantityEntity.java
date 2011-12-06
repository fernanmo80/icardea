package tr.com.srdc.icardea.careplanengine.entities.patientDataEntities;

//~--- non-JDK imports --------------------------------------------------------

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import tr.com.srdc.icardea.careplanengine.glmodel.Physical_Quantity;

/**
 * @author itasyurt 01.05.06
 *
 */

/**
 * @author kullanici
 *
 */

/**
 * @author kullanici
 *
 */
public class PhysicalQuantityEntity extends ObservationValueEntity {
    protected String displayName;
    protected float  pqValue;
    protected int    precision;
    protected String unit;

    public PhysicalQuantityEntity() {

        // TODO Auto-generated constructor stub
    }

    public PhysicalQuantityEntity(Physical_Quantity pq) {
        if (pq.hasDisplay_name()) {
            this.displayName = new String(pq.getDisplay_name());
        }

        if (pq.hasPq_value()) {
            this.pqValue = pq.getPq_value();
        }

        if (pq.hasPrecision()) {
            this.precision = pq.getPrecision();
        }

        if (pq.hasUnit()) {
            this.unit = new String(pq.getUnit());
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
     * @return Returns the pqValue.
     */
    public float getPqValue() {
        return pqValue;
    }

    /**
     * @param pqValue The pqValue to set.
     */
    public void setPqValue(float pqValue) {
        this.pqValue = pqValue;
    }

    /**
     * @return Returns the precision.
     */
    public int getPrecision() {
        return precision;
    }

    /**
     * @param precision The precision to set.
     */
    public void setPrecision(int precision) {
        this.precision = precision;
    }

    /**
     * @return Returns the unit.
     */
    public String getUnit() {
        return unit;
    }

    /**
     * @param unit The unit to set.
     */
    public void setUnit(String unit) {
        this.unit = unit;
    }

    /**
     * @param string
     * @ returns  xml document
     */
    public Element toXmlElement(String string, Document doc) {
        try {
            Element element = doc.createElement(string);

            if (displayName != null) {
                Element displayNameNode = doc.createElement("Display_Name_PQ");

                displayNameNode.setTextContent(displayName);
                element.appendChild(displayNameNode);
            }

            Element pqValueNode = doc.createElement("PQ_Value_PQ");

            pqValueNode.setTextContent("" + this.pqValue);
            element.appendChild(pqValueNode);

            Element precisionNode = doc.createElement("Precision_PQ");

            precisionNode.setTextContent("" + precision);
            element.appendChild(precisionNode);

            if (unit != null) {
                Element unitNode = doc.createElement("Unit_PQ");

                unitNode.setTextContent(unit);
                element.appendChild(unitNode);
            }

            return element;
        } catch (Exception exc) {
            exc.printStackTrace();

            return null;
        }
    }

    public Element toXmlElement(Document doc) {
        try {
            Element element = doc.createElement("Physical_Quantity");

            if (displayName != null) {
                Element displayNameNode = doc.createElement("Display_Name_PQ");

                displayNameNode.setTextContent(displayName);
                element.appendChild(displayNameNode);
            }

            Element pqValueNode = doc.createElement("PQ_Value_PQ");

            pqValueNode.setTextContent("" + this.pqValue);
            element.appendChild(pqValueNode);

            Element precisionNode = doc.createElement("Precision_PQ");

            precisionNode.setTextContent("" + precision);
            element.appendChild(precisionNode);

            if (unit != null) {
                Element unitNode = doc.createElement("Unit_PQ");

                unitNode.setTextContent(unit);
                element.appendChild(unitNode);
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

                    if (tagName.equals("Display_Name_PQ")) {
                        displayName = current.getTextContent();
                    } else if (tagName.equals("PQ_Value_PQ")) {
                        try {
                            this.pqValue = Float.parseFloat(current.getTextContent());
                        } catch (Exception exc) {
                            exc.printStackTrace();
                        }
                    } else if (tagName.equals("Precision_PQ")) {
                        try {
                            this.precision = Integer.parseInt(current.getTextContent());
                        } catch (Exception exc) {
                            exc.printStackTrace();
                        }
                    }

                    if (tagName.equals("Unit_PQ")) {
                        unit = current.getTextContent();
                    }
                }
            }
        } catch (Exception exc) {
            exc.printStackTrace();
        }
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
