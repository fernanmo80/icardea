package tr.com.srdc.icardea.careplanengine.agents.communication.ontology.consultingOntology;

//~--- non-JDK imports --------------------------------------------------------

public class ConsultingMessage {
    private String consultSentence = "";
    private String inputName       = "";
    private String messageContent  = "";
    private String patientID       = "";
    private String patientName     = "";

    public ConsultingMessage() {}

    public String getInputName() {
        return inputName;
    }

    public void setInputName(String inputName) {
        this.inputName = inputName;
    }

    public String getMessageContent() {
        return messageContent;
    }

    public void setMessageContent(String messageContent) {
        this.messageContent = messageContent;
    }

    public String getConsultSentence() {
        return consultSentence;
    }

    public void setConsultSentence(String consultSentence) {
        this.consultSentence = consultSentence;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getPatientID() {
        return patientID;
    }

    public void setPatientID(String patientID) {
        this.patientID = patientID;
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
