package tr.com.srdc.icardea.careplanengine.alarmSystem.alarmOntology;

//~--- non-JDK imports --------------------------------------------------------

public class MessageContent {
    private String content;
    private String role;
    private int    urgency;

    public MessageContent() {}

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getUrgency() {
        return urgency;
    }

    public void setUrgency(int urgency) {
        this.urgency = urgency;
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
