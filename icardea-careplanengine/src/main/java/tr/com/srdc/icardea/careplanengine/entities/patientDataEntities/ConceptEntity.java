package tr.com.srdc.icardea.careplanengine.entities.patientDataEntities;

//~--- non-JDK imports --------------------------------------------------------

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import tr.com.srdc.icardea.careplanengine.glmodel.Concept;

/**
 * @author itasyurt 01.05.06
 *
 */
public class ConceptEntity {
    protected String conceptID     = "";
    protected String conceptName   = "";
    protected String conceptSource = "";

    public ConceptEntity() {

        // TODO Auto-generated constructor stub
    }

    public ConceptEntity(Concept concept) {
        try {
            if (concept.hasConcept_id()) {
                this.conceptID = new String(concept.getConcept_id());
            }

            if (concept.hasConcept_name()) {
                this.conceptName = new String(concept.getConcept_name());
            }

            if (concept.hasConcept_source()) {
                this.conceptSource = new String(concept.getConcept_source());
            }
        } catch (Exception exc) {
            exc.printStackTrace();
        }
    }

    /**
     * @return Returns the conceptID.
     */
    public String getConceptID() {
        return conceptID;
    }

    /**
     * @param conceptID The conceptID to set.
     */
    public void setConceptID(String conceptID) {
        this.conceptID = conceptID;
    }

    /**
     * @return Returns the conceptName.
     */
    public String getConceptName() {
        return conceptName;
    }

    /**
     * @param conceptName The conceptName to set.
     */
    public void setConceptName(String conceptName) {
        this.conceptName = conceptName;
    }

    /**
     * @return Returns the conceptSource.
     */
    public String getConceptSource() {
        return conceptSource;
    }

    /**
     * @param conceptSource The conceptSource to set.
     */
    public void setConceptSource(String conceptSource) {
        this.conceptSource = conceptSource;
    }

/*
    * concept to xml element
 */
    public Element toXmlElement(String string, Document doc) {

        // TODO Auto-generated method stub
        try {
            Element element = doc.createElement(string);

            if (conceptID != null) {
                Element conceptIdNode = doc.createElement("Concept_Id_C");

                conceptIdNode.setTextContent(this.conceptID);
                element.appendChild(conceptIdNode);
            }

            if (conceptName != null) {
                Element conceptNameNode = doc.createElement("Concept_Name_C");

                conceptNameNode.setTextContent(this.conceptName);
                element.appendChild(conceptNameNode);
            }

            if (conceptSource != null) {
                Element conceptSourceNode = doc.createElement("Concept_Source_C");

                conceptSourceNode.setTextContent(this.conceptSource);
                element.appendChild(conceptSourceNode);
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

                    if (tagName.equals("Concept_Id_C")) {
                        conceptID = current.getTextContent();
                    } else if (tagName.equals("Concept_Name_C")) {
                        conceptName = current.getTextContent();
                    } else if (tagName.equals("Concept_Source_C")) {
                        conceptSource = current.getTextContent();
                    }
                }
            }
        } catch (Exception exc) {
            exc.printStackTrace();
        }
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
