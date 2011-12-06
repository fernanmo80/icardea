
/**
 *
 */
package tr.com.srdc.icardea.careplanengine.entities;

//~--- JDK imports ------------------------------------------------------------

import java.util.Date;

/**
 * @author Administrator
 *
 */
public class HistoryAssignmentEntity extends AssignmentEntity {
    private Long sessionID;

    /**
     *
     */
    public HistoryAssignmentEntity(AssignmentEntity assignment, Long session) {
        this.sessionID             = session;
        this.assignmentID          = assignment.assignmentID;
        this.patientCode           = assignment.patientCode;
        this.patientEntity         = assignment.patientEntity;
        this.guidelineEntity       = assignment.guidelineEntity;
        this.status                = assignment.status;
        this.assignedBy            = assignment.assignedBy;
        this.approvedBy            = assignment.approvedBy;
        this.assignedByUserName    = assignment.assignedByUserName;
        this.approvedByUserName    = assignment.approvedByUserName;
        this.assignmentDate        = assignment.assignmentDate;
        this.approvalDate          = assignment.approvalDate;
        this.startToExecutionDate  = assignment.startToExecutionDate;
        this.processedGuidelineURL = assignment.processedGuidelineURL;
    }

    /**
     * @return the sessionID
     */
    public Long getSessionID() {
        return sessionID;
    }

    /**
     * @param sessionID the sessionID to set
     */
    public void setSessionID(Long sessionID) {
        this.sessionID = sessionID;
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
