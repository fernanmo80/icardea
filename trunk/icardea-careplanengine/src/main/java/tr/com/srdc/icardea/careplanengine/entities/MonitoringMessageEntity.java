package tr.com.srdc.icardea.careplanengine.entities;

//~--- JDK imports ------------------------------------------------------------

import java.io.Serializable;

import java.util.Date;

/**
 * Using AssignmentEntity's key attributes is beneficial
 * for querying MonitoringMessages of a GuidelineAgent. Because GuidelineAgent
 * is load a unique AssignmentEntity.
 *
 * id attribute of MME is only used by Hibernate when storing
 * this class's instance to ICARDEA Repository.
 *
 * assignmentEntity field has to be filled
 *
 * @author      METU-SRDC
 * @see         <a href="mailto:icardea-technical@srdc.metu.edu.tr">Help</a>
 */
public class MonitoringMessageEntity {

    // key attributes of AssignmentEntity
    private AssignmentEntity assignmentEntity;
    private Long             id;

    /**
     * The time when the message is created
     */
    private Date messageSentDate;

    /**
     * monitoringInfo is generated according to
     * message type
     */
    private String monitoringInfo;

    /**
     * Unique guideline step name, which this message
     * is created when that step is being executed.
     */
    private String stepName;

    /**
     * Monitoring Message types are;
     * <l>Eligibility</l>
     * <l>Patient_State</l>
     * <l>Step_Status_Info</l>
     * <l>GetDataAction</l>
     * <l>AssignmentAction</l>
     * <l>MedicallyOrientedAction</l>
     * <l>SubguidelineAction</l>
     * <l>MessageOrientedAction</l>
     * <l>SynchronizationStep</l>
     * <l>Guideline_Expression</l>
     * <l>Case_Step</l>
     */
    private String type;

    public MonitoringMessageEntity() {}

    /**
     * @param ae
     * @param type
     * @param stepName
     * @param messageSentDate
     * @param monitoringInfo
     */
    public MonitoringMessageEntity(AssignmentEntity ae, String type, String stepName, Date messageSentDate,
                                   String monitoringInfo) {
        this.assignmentEntity = ae;
        this.type             = type;
        this.stepName         = stepName;
        this.messageSentDate  = messageSentDate;
        this.monitoringInfo   = monitoringInfo;
    }

    /**
     * @param id
     * @param ae
     * @param type
     * @param stepName
     * @param messageSentDate
     * @param monitoringInfo
     */
    public MonitoringMessageEntity(Long id, AssignmentEntity ae, String type, String stepName, Date messageSentDate,
                                   String monitoringInfo) {
        this.id               = id;
        this.assignmentEntity = ae;
        this.type             = type;
        this.stepName         = stepName;
        this.messageSentDate  = messageSentDate;
        this.monitoringInfo   = monitoringInfo;
    }

    /**
     * @param       id      Long
     */
    private void setId(Long id) {
        this.id = id;
    }

    /**
     * @return      Long
     */
    public Long getId() {
        return this.id;
    }

    /**
     *
     * @return       type    String
     */
    public String getType() {
        return type;
    }

    /**
     *
     * @param type   String
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     *
     * @return       stepName        String
     */
    public String getStepName() {
        return stepName;
    }

    /**
     *
     * Step Name comes from Guideline OWL Instance.
     * It represents a unique name for that step instance.
     * @param stepName       String
     */
    public void setStepName(String name) {
        this.stepName = name;
    }

    /**
     *
     * @return monitoringInfo        String
     */
    public String getMonitoringInfo() {
        return monitoringInfo;
    }

    /**
     *
     * @param monitoringInfo String
     */
    public void setMonitoringInfo(String monitoringInfo) {
        this.monitoringInfo = monitoringInfo;
    }

    /**
     * @param       date    Date
     */
    public void setMessageSentDate(Date date) {
        this.messageSentDate = date;
    }

    /**
     * @return      date
     */
    public Date getMessageSentDate() {
        return this.messageSentDate;
    }

    public AssignmentEntity getAssignmentEntity() {
        return assignmentEntity;
    }

    private void setAssignmentEntity(AssignmentEntity assignmentEntity) {
        this.assignmentEntity = assignmentEntity;
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
