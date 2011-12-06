package tr.com.srdc.icardea.careplanengine.entities;

/**
 *
 * MonitoringMessageType  is used for
 * standardization issues when generating a MonitoringMessageEntity
 *
 * @author      METU-SRDC
 * @see         <a href="mailto:icardea-technical@srdc.metu.edu.tr">Help</a>
 */
public class MonitoringMessageType {
    private static String ASSIGNMENT_ACTION         = "ASSIGNMENT_ACTION";
    private static String CASE                      = "CASE";
    private static String ELIGIBILITY               = "ELIGIBILITY";
    private static String GET_DATA_ACTION           = "GET_DATA_ACTION";
    private static String GUIDELINE_EXPRESSION      = "GUIDELINE_EXPRESSION";
    private static String MEDICALLY_ORIENTED_ACTION = "MEDICALLY_ORIENTED_ACTION";
    private static String MESSAGE_ORIENTED_ACTION   = "MESSAGE_ORIENTED_ACTION";
    private static String PATIENT_STATE             = "PATIENT_STATE";
    private static String STEP_STATUS_INFO          = "STEP_STATUS_INFO";
    private static String SUBGUIDELINE_ACTION       = "SUBGUIDELINE_ACTION";
    private static String SYNCHRONIZATION           = "SYNCHRONIZATION";

    /**
     * @return      String
     */
    public synchronized static String getStepStatusInfoType() {
        return STEP_STATUS_INFO;
    }

    /**
     * @return      String
     */
    public synchronized static String getEligibilityType() {
        return ELIGIBILITY;
    }

    /**
     * @return      String
     */
    public synchronized static String getPatientStateType() {
        return PATIENT_STATE;
    }

    /**
     * @return      String
     */
    public synchronized static String getGetDataActionType() {
        return GET_DATA_ACTION;
    }

    /**
     * @return      String
     */
    public synchronized static String getAssignmentActionType() {
        return ASSIGNMENT_ACTION;
    }

    /**
     * @return      String
     */
    public synchronized static String getMedicallyOrientedActionType() {
        return MEDICALLY_ORIENTED_ACTION;
    }

    /**
     * @return      String
     */
    public synchronized static String getSubguidelineActionType() {
        return SUBGUIDELINE_ACTION;
    }

    /**
     * @return      String
     */
    public synchronized static String getMessageOrientedActionType() {
        return MESSAGE_ORIENTED_ACTION;
    }

    /**
     * @return      String
     */
    public synchronized static String getGuidelineExpressionType() {
        return GUIDELINE_EXPRESSION;
    }

    /**
     * @return      String
     */
    public synchronized static String getSynchronizationType() {
        return SYNCHRONIZATION;
    }

    /**
     * @return      String
     */
    public synchronized static String getCaseType() {
        return CASE;
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
