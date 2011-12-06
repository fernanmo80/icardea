package tr.com.srdc.icardea.careplanengine.entities.patientDataEntities;

//~--- non-JDK imports --------------------------------------------------------

import org.apache.xerces.dom.DocumentImpl;
import org.apache.xerces.parsers.DOMParser;
import org.apache.xml.serialize.OutputFormat;
import org.apache.xml.serialize.XMLSerializer;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

import tr.com.srdc.icardea.careplanengine.glmodel.Patient_Data;

//~--- JDK imports ------------------------------------------------------------

import java.io.StringReader;
import java.io.StringWriter;

import java.util.Collection;
import java.util.Iterator;

public class PatientDataEntity {

    /**
     * @param args
     */
    protected TimeIntervalEntity     activityTime;
    protected ConceptEntity          bodySiteCd;
    protected SymbolEntity           confidentialityCd;
    protected DurationIntervalEntity criticalDuration;
    protected TimeIntervalEntity     criticalTime;
    protected String                 id;
    protected SymbolEntity           interpretationCd;
    protected ConceptEntity          methodCd;
    protected SymbolEntity           moodCd;
    protected TimeLiteralEntity      recordingTime;
    protected ConceptEntity          serviceCd;
    protected SymbolEntity           statusCd;

    public PatientDataEntity() {}

    public PatientDataEntity(Patient_Data patientData) {
        if (patientData.getActivity_time() != null) {
            this.activityTime = new TimeIntervalEntity(patientData.getActivity_time());
        }

        if (patientData.getBody_site_cd() != null) {
            this.bodySiteCd = new ConceptEntity(patientData.getBody_site_cd());
        }

        if (patientData.getConfidentiality_cd() != null) {
            this.confidentialityCd = new SymbolEntity(patientData.getConfidentiality_cd());
        }

        if (patientData.getCritical_duration() != null) {
            this.criticalDuration = new DurationIntervalEntity(patientData.getCritical_duration());
        }

        if (patientData.getCritical_time() != null) {
            this.criticalTime = new TimeIntervalEntity(patientData.getCritical_time());
        }

        if (patientData.getId() != null) {
            this.id = new String(patientData.getId());
        }

        try {
            if (patientData.getInterpretation_cd() != null) {
                Collection c  = patientData.getInterpretation_cd();
                Iterator   it = c.iterator();

                if (it.hasNext()) {
                    Object obj = it.next();

                    this.interpretationCd = new SymbolEntity(obj.toString());
                }
            }
        } catch (Exception exc) {
            exc.printStackTrace();
        }

        if (patientData.getMethod_cd() != null) {
            this.methodCd = new ConceptEntity(patientData.getMethod_cd());
        }

        if (patientData.getMood_cd() != null) {
            this.moodCd = new SymbolEntity(patientData.getMood_cd());
        }

        if (patientData.getRecording_time() != null) {
            this.recordingTime = new TimeLiteralEntity(patientData.getRecording_time());
        }

        if (patientData.getService_cd() != null) {
            this.serviceCd = new ConceptEntity(patientData.getService_cd());
        }

        if (patientData.getStatus_cd() != null) {
            this.statusCd = new SymbolEntity(patientData.getStatus_cd());
        }
    }

    public void fromString(String str) {
        try {
            DOMParser parser = new DOMParser();

            parser.parse(new InputSource(new StringReader(str)));

            Document doc  = parser.getDocument();
            Element  root = (Element) doc.getFirstChild();
            NodeList l    = root.getChildNodes();
            int      size = l.getLength();

            for (int i = 0; i < size; ++i) {
                if (l.item(i).getNodeType() == Node.ELEMENT_NODE) {
                    this.fromXmlElement((Element) l.item(i));
                }
            }
        } catch (Exception exc) {
            exc.printStackTrace();
        }
    }

    /**
     * @return Returns the activityTime.
     */
    public TimeIntervalEntity getActivityTime() {
        return activityTime;
    }

    /**
     * @param activityTime The activityTime to set.
     */
    public void setActivityTime(TimeIntervalEntity activityTime) {
        this.activityTime = activityTime;
    }

    /**
     * @return Returns the bodySiteCd.
     */
    public ConceptEntity getBodySiteCd() {
        return bodySiteCd;
    }

    /**
     * @param bodySiteCd The bodySiteCd to set.
     */
    public void setBodySiteCd(ConceptEntity bodySiteCd) {
        this.bodySiteCd = bodySiteCd;
    }

    /**
     * @return Returns the confidentialityCd.
     */
    public SymbolEntity getConfidentialityCd() {
        return confidentialityCd;
    }

    /**
     * @param confidentialityCd The confidentialityCd to set.
     */
    public void setConfidentialityCd(SymbolEntity confidentialityCd) {
        this.confidentialityCd = confidentialityCd;
    }

    /**
     * @return Returns the criticalDuration.
     */
    public DurationIntervalEntity getCriticalDuration() {
        return criticalDuration;
    }

    /**
     * @param criticalDuration The criticalDuration to set.
     */
    public void setCriticalDuration(DurationIntervalEntity criticalDuration) {
        this.criticalDuration = criticalDuration;
    }

    /**
     * @return Returns the criticalTime.
     */
    public TimeIntervalEntity getCriticalTime() {
        return criticalTime;
    }

    /**
     * @param criticalTime The criticalTime to set.
     */
    public void setCriticalTime(TimeIntervalEntity criticalTime) {
        this.criticalTime = criticalTime;
    }

    /**
     * @return Returns the id.
     */
    public String getId() {
        return id;
    }

    /**
     * @param id The id to set.
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return Returns the interpretationCd.
     */
    public SymbolEntity getInterpretationCd() {
        return interpretationCd;
    }

    /**
     * @param interpretationCd The interpretationCd to set.
     */
    public void setInterpretationCd(SymbolEntity interpretationCd) {
        this.interpretationCd = interpretationCd;
    }

    /**
     * @return Returns the moodCd.
     */
    public SymbolEntity getMoodCd() {
        return moodCd;
    }

    /**
     * @param moodCd The moodCd to set.
     */
    public void setMoodCd(SymbolEntity moodCd) {
        this.moodCd = moodCd;
    }

    /**
     * @return Returns the recordingTime.
     */
    public TimeLiteralEntity getRecordingTime() {
        return recordingTime;
    }

    /**
     * @param recordingTime The recordingTime to set.
     */
    public void setRecordingTime(TimeLiteralEntity recordingTime) {
        this.recordingTime = recordingTime;
    }

    /**
     * @return Returns the serviceCd.
     */
    public ConceptEntity getServiceCd() {
        return serviceCd;
    }

    /**
     * @param serviceCd The serviceCd to set.
     */
    public void setServiceCd(ConceptEntity serviceCd) {
        this.serviceCd = serviceCd;
    }

    /**
     * @return Returns the statusCd.
     */
    public SymbolEntity getStatusCd() {
        return statusCd;
    }

    /**
     * @param statusCd The statusCd to set.
     */
    public void setStatusCd(SymbolEntity statusCd) {
        this.statusCd = statusCd;
    }

    /**
     * @return Returns the methodCd.
     */
    public ConceptEntity getMethodCd() {
        return methodCd;
    }

    /**
     * @param methodCd The methodCd to set.
     */
    public void setMethodCd(ConceptEntity methodCd) {
        this.methodCd = methodCd;
    }

    public Element toXmlElement() {
        return null;
    }

    public Element toXmlElement(Document doc) {
        return null;
    }

    public void fromXmlElement(Element element) {}

    public String toString() {
        Document     doc;
        StringWriter strWriter = new StringWriter();

        try {
            doc = new DocumentImpl();
            doc.appendChild(this.toXmlElement(doc));

            OutputFormat format = new OutputFormat(doc);

            format.setLineWidth(65);
            format.setIndenting(true);
            format.setIndent(2);

            XMLSerializer serializer = new XMLSerializer(strWriter, format);

            serializer.serialize(doc);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return strWriter.toString();
    }

    public String toDataString() {
        Document     doc;
        StringWriter strWriter = new StringWriter();

        try {
            doc = new DocumentImpl();

            Element rootElem = doc.createElement("Data");

            rootElem.appendChild(this.toXmlElement(doc));
            doc.appendChild(rootElem);

            XMLSerializer serializer = new XMLSerializer(strWriter, new OutputFormat(doc));

            serializer.serialize(doc);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return strWriter.toString();
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
