package tr.com.srdc.icardea.careplanengine.entities;

//~--- non-JDK imports --------------------------------------------------------

import tr.com.srdc.icardea.careplanengine.icardeaRepository.PatientRepository;
import tr.com.srdc.icardea.careplanengine.icardeaRepository.UserRepository;

//~--- JDK imports ------------------------------------------------------------

import java.io.Serializable;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Patient - Guideline Pair, initially its status is 0 means "BLANK"
 *
 * @author      METU-SRDC
 * @see         <a href="mailto:icardea-technical@srdc.metu.edu.tr"> Help</a>
 *
 */
public class AssignmentEntity implements Serializable {
    protected Set             sensorsSetInfos    = new HashSet();
    protected Set             customizationInfos = new HashSet();
    private String            active;
    protected Date            approvalDate;
    protected UserInfo        approvedBy;
    protected String          approvedByUserName;
    protected UserInfo        assignedBy;
    protected String          assignedByUserName;
    protected Date            assignmentDate;
    protected Long            assignmentID;
    protected GuidelineEntity guidelineEntity;
    protected Long            patientCode;
    protected PatientEntity   patientEntity;
    protected String          processedGuidelineURL;
    protected Date            startToExecutionDate;
    protected int             status;

    public AssignmentEntity() {
        this.status         = 0;
        this.assignmentDate = new Date();
    }

    public AssignmentEntity(Long pCode, GuidelineEntity gEntity, Date date) {
        this.patientCode     = pCode;
        this.guidelineEntity = gEntity;
        this.assignmentDate  = date;
        this.status          = 0;
    }

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }

    /**
     * @param   assignmentDate  java.util.Date
     */
    public void setAssignmentDate(Date date) {
        this.assignmentDate = date;
    }

    /**
     * @return assignmentDate
     */
    public Date getAssignmentDate() {
        return this.assignmentDate;
    }

    /**
     * @param   approvalDate    java.util.Date
     */
    public void setApprovalDate(Date date) {
        this.approvalDate = date;
    }

    /**
     * @return approvalDate
     */
    public Date getApprovalDate() {
        return this.approvalDate;
    }

    /**
     * @param   startToExecutionDate    java.util.Date
     */
    public void setStartToExecutionDate(Date date) {
        this.startToExecutionDate = date;
    }

    /**
     * @return startToExecutionDate
     */
    public Date getStartToExecutionDate() {
        return this.startToExecutionDate;
    }

    /**
     * @param   status  int
     */
    public void setStatus(int status) {
        this.status = status;
    }

    /**
     * @return status
     */
    public int getStatus() {
        return this.status;
    }

    /**
     *
     * AssignmentEntity has composite-id so it must
     * override equals()
     * @param   obj     Object
     * @return  boolean
     */
    public boolean equals(Object obj) {
        if ((obj != null) && obj.getClass().equals(this.getClass())) {
            AssignmentEntity ae = (AssignmentEntity) obj;

            return (patientCode == ae.patientCode) && (guidelineEntity == ae.guidelineEntity) && (status == ae.status)
                   && (assignedByUserName == ae.assignedByUserName) && (approvedByUserName == ae.approvedByUserName)
                   && (assignmentDate == ae.assignmentDate) && (approvalDate == ae.approvalDate)
                   && (startToExecutionDate == ae.startToExecutionDate);
        }

        return false;
    }

    /**
     * AssignmentEntity has composite-id so it must
     * override hashCode(). However, this method returns
     * only "0"
     * @return int
     */
    public int hashCode() {
        return 0;
    }

    /**
     * @return Returns the assignmentID.
     */
    public Long getAssignmentID() {
        return assignmentID;
    }

    /**
     * @param assignmentID The assignmentID to set.
     */
    public void setAssignmentID(Long assignmentID) {
        this.assignmentID = assignmentID;
    }

    /**
     * @return Returns the approvedBy.
     */
    public UserInfo getApprovedBy() {
        if (this.approvedByUserName != null) {
            return UserRepository.retrieveUserInfo(this.approvedByUserName);
        } else {
            return null;
        }
    }

    /**
     * @param approvedBy The approvedBy to set.
     */
    public void setApprovedBy(UserInfo approvedBy) {
        this.approvedByUserName = approvedBy.getUserName();
    }

    /**
     * @return Returns the assignedBy.
     */
    public UserInfo getAssignedBy() {
        if (this.assignedByUserName != null) {
            return UserRepository.retrieveUserInfo(this.assignedByUserName);
        } else {
            return null;
        }
    }

    /**
     * @param assignedBy The assignedBy to set.
     */
    public void setAssignedBy(UserInfo assignedBy) {
        this.assignedByUserName = assignedBy.getUserName();
    }

    /**
     * @return Returns the guidelineEntity.
     */
    public GuidelineEntity getGuidelineEntity() {
        return guidelineEntity;
    }

    /**
     * @param guidelineEntity The guidelineEntity to set.
     */
    public void setGuidelineEntity(GuidelineEntity guidelineEntity) {
        this.guidelineEntity = guidelineEntity;
    }

    /**
     * @return Returns the patientEntity.
     */
    public PatientEntity getPatientEntity() {
        if (this.patientCode != null) {
            return PatientRepository.retrievePatientEntity(this.patientCode);
        } else {
            return null;
        }
    }

    /**
     * @param patientEntity The patientEntity to set.
     */
    public void setPatientEntity(PatientEntity patientEntity) {
        this.patientCode = patientEntity.getPcode();
    }

    /**
     * @return Returns the customizationInfos.
     */
    public Set getCustomizationInfos() {
        return customizationInfos;
    }

    /**
     * @param customizationInfos The customizationInfos to set.
     */
    public void setCustomizationInfos(Set customizationInfos) {
        this.customizationInfos = customizationInfos;
    }

    /**
     * @return Returns the sensorsSetInfos.
     */
    public Set getSensorsSetInfos() {
        return sensorsSetInfos;
    }

    /**
     * @param sensorsSetInfos The sensorsSetInfos to set.
     */
    public void setSensorsSetInfos(Set sensorsSetInfos) {
        this.sensorsSetInfos = sensorsSetInfos;
    }

    /**
     * @return Returns the patientCode.
     */
    public Long getPatientCode() {
        return patientCode;
    }

    /**
     * @param patientCode The patientCode to set.
     */
    public void setPatientCode(Long patientCode) {
        this.patientCode = patientCode;
    }

    /**
     * @return Returns the approvedByUserName.
     */
    public String getApprovedByUserName() {
        return approvedByUserName;
    }

    /**
     * @param approvedByUserName The approvedByUserName to set.
     */
    public void setApprovedByUserName(String approvedByUserName) {
        this.approvedByUserName = approvedByUserName;
    }

    /**
     * @return Returns the assignedByUserName.
     */
    public String getAssignedByUserName() {
        return assignedByUserName;
    }

    /**
     * @param assignedByUserName The assignedByUserName to set.
     */
    public void setAssignedByUserName(String assignedByUserName) {
        this.assignedByUserName = assignedByUserName;
    }

    public String getProcessedGuidelineURL() {
        return processedGuidelineURL;
    }

    public void setProcessedGuidelineURL(String processedGuidelineURL) {
        this.processedGuidelineURL = processedGuidelineURL;
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
