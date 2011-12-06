package tr.com.srdc.icardea.careplanengine.entities.patientDataEntities;

//~--- non-JDK imports --------------------------------------------------------

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import tr.com.srdc.icardea.careplanengine.glmodel.Index;

public class IndexEntity extends ObservationValueEntity {
    protected float index;
    protected int   precision;

    public IndexEntity() {
        super();

        // TODO Auto-generated constructor stub
    }

    public IndexEntity(Index ind) {
        if (ind.hasIndex()) {
            this.index = ind.getIndex();
        }

        if (ind.hasPrecision()) {
            this.precision = ind.getPrecision();
        }
    }

    /**
     * @return Returns the index.
     */
    public float getIndex() {
        return index;
    }

    /**
     * @param index The index to set.
     */
    public void setIndex(float index) {
        this.index = index;
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

    public Element toXmlElement(Document doc) {
        try {
            Element element   = doc.createElement("Index_Value");
            Element indexNode = doc.createElement("Index_IV");

            indexNode.setTextContent("" + index);
            element.appendChild(indexNode);

            Element precisionNode = doc.createElement("Precision_IV");

            precisionNode.setTextContent("" + precision);
            element.appendChild(precisionNode);

            return element;
        } catch (Exception exc) {
            exc.printStackTrace();

            return null;
        }
    }

    /*
     *  (non-Javadoc)
     * @see com.srdc.icardea.careplanengine.entities.patientDataEntities.ObservationValueEntity#fromXmlElement(org.w3c.dom.Element)
     */
    @Override
    public void fromXmlElement(Element element) {

        // TODO Auto-generated method stub
        try {
            NodeList nodeList   = element.getChildNodes();
            int      listLength = nodeList.getLength();

            for (int i = 0; i < listLength; ++i) {
                Node current = nodeList.item(i);

                if (current.getNodeType() == Node.ELEMENT_NODE) {
                    String tagName = current.getNodeName();

                    if (tagName.equals("Index_IV")) {
                        try {
                            index = Float.parseFloat(current.getTextContent());
                        } catch (Exception exc) {
                            exc.printStackTrace();
                        }
                    } else if (tagName.equals("Precision_IV")) {
                        try {
                            precision = Integer.parseInt(current.getTextContent());
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
