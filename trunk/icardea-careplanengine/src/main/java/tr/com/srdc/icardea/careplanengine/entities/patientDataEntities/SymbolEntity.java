package tr.com.srdc.icardea.careplanengine.entities.patientDataEntities;

//~--- non-JDK imports --------------------------------------------------------

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class SymbolEntity {
    protected String name2;
    protected String symbolValue;

    public SymbolEntity() {

        // TODO Auto-generated constructor stub
    }

    public SymbolEntity(String value) {

        // TODO Auto-generated constructor stub
        this.symbolValue = new String(value);
    }

    /**
     * @return Returns the name2.
     */
    public String getName2() {
        return name2;
    }

    /**
     * @param name2 The name2 to set.
     */
    public void setName2(String name2) {
        this.name2 = name2;
    }

    /**
     * @return Returns the symbolValue.
     */
    public String getSymbolValue() {
        return symbolValue;
    }

    /**
     * @param symbolValue The symbolValue to set.
     */
    public void setSymbolValue(String symbolValue) {
        this.symbolValue = symbolValue;
    }

    public Element toXmlElement(String string, Document doc) {

        // TODO Auto-generated method stub
        try {
            Element element = doc.createElement(string);

            if (name2 != null) {
                Element name2Node = doc.createElement("Name2_S");

                name2Node.setTextContent(this.name2);
                element.appendChild(name2Node);
            }

            if (symbolValue != null) {
                Element symbolValueNode = doc.createElement("Symbol_Value_S");

                symbolValueNode.setTextContent(this.symbolValue);
                element.appendChild(symbolValueNode);
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

                    if (tagName.equals("Name2_S")) {
                        name2 = current.getTextContent();
                    } else if (tagName.equals("Symbol_Value_S")) {
                        symbolValue = current.getTextContent();
                    }
                }
            }
        } catch (Exception exc) {
            exc.printStackTrace();
        }
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
