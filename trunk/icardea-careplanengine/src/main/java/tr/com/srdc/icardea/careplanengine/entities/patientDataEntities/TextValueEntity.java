package tr.com.srdc.icardea.careplanengine.entities.patientDataEntities;

//~--- non-JDK imports --------------------------------------------------------

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import tr.com.srdc.icardea.careplanengine.glmodel.Text_Value;

public class TextValueEntity extends ObservationValueEntity {
    protected String text;

    public TextValueEntity() {
        super();

        // TODO Auto-generated constructor stub
    }

    public TextValueEntity(Text_Value value) {
        if (value.hasText()) {
            this.text = new String(value.getText());
        }
    }

    /**
     * @return Returns the text.
     */
    public String getText() {
        return text;
    }

    /**
     * @param text The text to set.
     */
    public void setText(String text) {
        this.text = text;
    }

    public Element toXmlElement(Document doc) {
        try {
            Element element = null;

            if (text != null) {
                element = doc.createElement("Text_Value");
                element.setTextContent(text);
            }

            return element;
        } catch (Exception exc) {
            exc.printStackTrace();

            return null;
        }
    }

/*    (non-Javadoc)
    * @see com.srdc.icardea.careplanengine.entities.patientDataEntities.ObservationValueEntity#fromXmlElement(org.w3c.dom.Element)
 */
    @Override
    public void fromXmlElement(Element element) {

        // TODO Auto-generated method stub
        try {
            text = element.getTextContent().trim();
        } catch (Exception exc) {
            exc.printStackTrace();
        }
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
