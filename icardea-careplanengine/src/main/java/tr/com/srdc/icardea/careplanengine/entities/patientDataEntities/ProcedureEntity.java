package tr.com.srdc.icardea.careplanengine.entities.patientDataEntities;

//~--- non-JDK imports --------------------------------------------------------

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import tr.com.srdc.icardea.careplanengine.glmodel.Procedure;

public class ProcedureEntity extends PatientDataEntity {
    protected ConceptEntity entrySiteCd;

    public ProcedureEntity() {
        super();
    }

    public ProcedureEntity(Procedure procedure) {
        super(procedure);

        if (procedure.hasEntry_site_cd()) {
            this.entrySiteCd = new ConceptEntity(procedure.getEntry_site_cd());
        }
    }

    /**
     * @return Returns the entrySiteCd.
     */
    public ConceptEntity getEntrySiteCd() {
        return entrySiteCd;
    }

    /**
     * @param entrySiteCd The entrySiteCd to set.
     */
    public void setEntrySiteCd(ConceptEntity entrySiteCd) {
        this.entrySiteCd = entrySiteCd;
    }

    public Element toXmlElement(Document doc) {
        try {
            Element element = doc.createElement("Procedure");

            // /activity time
            if (this.activityTime != null) {
                element.appendChild(this.activityTime.toXmlElement("Activity_Time_PR", doc));
            }

            // /bodySitecd
            if (this.bodySiteCd != null) {
                element.appendChild(this.bodySiteCd.toXmlElement("Body_Site_Cd_PR", doc));
            }

            // / confidentialityCd
            if (this.confidentialityCd != null) {
                element.appendChild(this.confidentialityCd.toXmlElement("Confidentiality_Cd_PR", doc));
            }

            // / critical duration
            if (this.criticalDuration != null) {
                element.appendChild(this.criticalDuration.toXmlElement("Critical_Duration_PR", doc));
            }

            // / critical time
            if (this.criticalTime != null) {
                element.appendChild(this.criticalTime.toXmlElement("Critical_Time_PR", doc));
            }

            // / entry site cd
            if (this.entrySiteCd != null) {
                element.appendChild(this.entrySiteCd.toXmlElement("Entry_Site_Cd_PR", doc));
            }

            // /id node
            if (this.id != null) {
                Node idNode = doc.createElement("Id");

                idNode.setTextContent(this.id);
                element.appendChild(idNode);
            }

            // /interpreatation cd
            if (this.interpretationCd != null) {
                element.appendChild(this.interpretationCd.toXmlElement("Interpretation_Cd_PR", doc));
            }

            // / method cd
            if (this.methodCd != null) {
                element.appendChild(this.methodCd.toXmlElement("Method_Cd_PR", doc));
            }

            // / mood cd
            if (this.moodCd != null) {
                element.appendChild(this.moodCd.toXmlElement("Mood_Cd_PR", doc));
            }

            // / recording time
            if (this.recordingTime != null) {
                element.appendChild(this.recordingTime.toXmlElement("Recording_Time_PR", doc));
            }

            // / service cd
            if (this.serviceCd != null) {
                element.appendChild(this.serviceCd.toXmlElement("Service_Cd_PR", doc));
            }

            // / status cd
            if (this.statusCd != null) {
                element.appendChild(this.statusCd.toXmlElement("Status_Cd_PR", doc));
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

                    if (tagName.equals("Activity_Time_PR")) {
                        this.activityTime = new TimeIntervalEntity();
                        this.activityTime.fromXmlElement((Element) current);
                    } else if (tagName.equals("Body_Site_Cd_PR")) {
                        this.bodySiteCd = new ConceptEntity();
                        this.bodySiteCd.fromXmlElement((Element) current);
                    } else if (tagName.equals("Confidentiality_Cd_PR")) {
                        this.confidentialityCd = new SymbolEntity();
                        this.confidentialityCd.fromXmlElement((Element) current);
                    } else if (tagName.equals("Critcal_Duration_PR")) {
                        this.criticalDuration = new DurationIntervalEntity();
                        this.criticalDuration.fromXmlElement((Element) current);
                    } else if (tagName.equals("Critical_Time_PR")) {
                        this.criticalTime = new TimeIntervalEntity();
                        this.criticalTime.fromXmlElement((Element) current);
                    } else if (tagName.equals("Id_PR")) {
                        this.id = current.getTextContent();
                    } else if (tagName.equals("Interpretation_Cd_PR")) {
                        this.interpretationCd = new SymbolEntity();
                        this.interpretationCd.fromXmlElement((Element) current);
                    } else if (tagName.equals("Method_Cd_PR")) {
                        this.methodCd = new ConceptEntity();
                        this.methodCd.fromXmlElement((Element) current);
                    } else if (tagName.equals("Mood_Cd_PR")) {
                        this.moodCd = new SymbolEntity();
                        this.moodCd.fromXmlElement((Element) current);
                    } else if (tagName.equals("Recording_Time_PR")) {
                        this.recordingTime = new TimeLiteralEntity();
                        this.recordingTime.fromXmlElement((Element) current);
                    } else if (tagName.equals("Service_Cd_PR")) {
                        this.serviceCd = new ConceptEntity();
                        this.serviceCd.fromXmlElement((Element) current);
                    } else if (tagName.equals("Status_Cd_PR")) {
                        this.statusCd = new SymbolEntity();
                        this.statusCd.fromXmlElement((Element) current);
                    } else if (tagName.equals("Entry_Site_Cd")) {
                        this.entrySiteCd = new ConceptEntity();
                        this.entrySiteCd.fromXmlElement((Element) current);
                    }
                }
            }
        } catch (Exception exc) {
            exc.printStackTrace();
        }
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
