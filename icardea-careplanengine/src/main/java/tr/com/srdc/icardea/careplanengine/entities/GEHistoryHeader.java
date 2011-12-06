
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
public class GEHistoryHeader {
    private Long assignmentID;
    private Date executionStartTime;
    private Long sessionID;

    /*
     * Default constructor
     */
    public GEHistoryHeader() {
        super();

        return;
    }

    /**
     * @param assignmentID
     * @param executionStartTime
     */
    public GEHistoryHeader(Long assignmentID, Date executionStartTime) {
        super();
        this.assignmentID       = assignmentID;
        this.executionStartTime = executionStartTime;
    }

    /**
     * @return the assignmentID
     */
    public Long getAssignmentID() {
        return assignmentID;
    }

    /**
     * @param assignmentID the assignmentID to set
     */
    public void setAssignmentID(Long assignmentID) {
        this.assignmentID = assignmentID;
    }

    /**
     * @return the executionStartTime
     */
    public Date getExecutionStartTime() {
        return executionStartTime;
    }

    /**
     * @param executionStartTime the executionStartTime to set
     */
    public void setExecutionStartTime(Date executionStartTime) {
        this.executionStartTime = executionStartTime;
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
