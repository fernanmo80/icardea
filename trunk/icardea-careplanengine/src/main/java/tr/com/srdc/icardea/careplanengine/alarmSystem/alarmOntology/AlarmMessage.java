package tr.com.srdc.icardea.careplanengine.alarmSystem.alarmOntology;

//~--- non-JDK imports --------------------------------------------------------

public class AlarmMessage {
    private MessageContent messageContent;
    private PatientInfo    patientInfo;

    public AlarmMessage() {}

    public MessageContent getMessageContent() {
        return messageContent;
    }

    public void setMessageContent(MessageContent messageContent) {
        this.messageContent = messageContent;
    }

    public PatientInfo getPatientInfo() {
        return patientInfo;
    }

    public void setPatientInfo(PatientInfo patientInfo) {
        this.patientInfo = patientInfo;
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
