package tr.com.srdc.icardea.careplanengine.entities;

//~--- JDK imports ------------------------------------------------------------

import java.util.Date;

/**
 *
 * @author      METU-SRDC
 * @see         <a href="mailto:icardea-technical@srdc.metu.edu.tr">Help</a>
 *
 */
public class AlarmEntity {
    private String alarmMessage;
    private Date   date;
    private String guidelineID;

    // private String alarmThreshold;
    // private String[] roles;
    // private String agentID;
    private String patientID;

    /**
     *
     */
    public AlarmEntity() {

        // TODO Auto-generated constructor stub
    }

    /**
     * @param patientID
     * @param guidelineID
     * @param alarmMessage
     * @param date
     */
    public AlarmEntity(String patientID, String guidelineID, String alarmMessage, Date date) {

        // TODO Auto-generated constructor stub
        this.alarmMessage = alarmMessage;
        this.patientID    = patientID;
        this.guidelineID  = guidelineID;
        this.date         = date;
    }

    /**
     * @return Returns the alarmMessage.
     */
    public String getAlarmMessage() {
        return alarmMessage;
    }

    /**
     * @param alarmMessage The alarmMessage to set.
     */
    public void setAlarmMessage(String alarmMessage) {
        this.alarmMessage = alarmMessage;
    }

    /**
     * @return Returns the patientID.
     */
    public String getPatientID() {
        return patientID;
    }

    /**
     * @param patientID The patientID to set.
     */
    public void setPatientID(String patientID) {
        this.patientID = patientID;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getGuidelineID() {
        return guidelineID;
    }

    public void setGuidelineID(String guidelineID) {
        this.guidelineID = guidelineID;
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
