package tr.com.srdc.icardea.careplanengine.entities;

/**
 * StatusInfo class is used for addressing standardization
 * issues when declaring status of a guideline or guideline step
 *
 * @author      METU-SRDC
 * @see         <a href="mailto:icardea-technical@srdc.metu.edu.tr">Help</a>
 */
public class StatusInfo {
    public static String    GUIDELINE_STATUS_APPROVED      = "Approved";
    public static final int GUIDELINE_STATUS_APPROVED_CODE = 2;
    public static String    GUIDELINE_STATUS_BLANK         = "Blank";
    public static final int GUIDELINE_STATUS_BLANK_CODE    = 0;
    public static String    GUIDELINE_STATUS_FILLED        = "Filled";
    public static final int GUIDELINE_STATUS_FILLED_CODE   = 1;
    public static String    GUIDELINE_STATUS_RUNNING       = "Running";
    public static final int GUIDELINE_STATUS_RUNNING_CODE  = 3;
    public static String    STEP_STATUS_ABORTED            = "ABORTED";    // Exception info should be concatenated
    public static String    STEP_STATUS_COMMITTED          = "COMMITTED";
    public static String    STEP_STATUS_RUNNING            = "RUNNING";

    public static String getStatus(int statusCode) {
        switch (statusCode) {
        case GUIDELINE_STATUS_BLANK_CODE :
            return GUIDELINE_STATUS_BLANK;

        case GUIDELINE_STATUS_FILLED_CODE :
            return GUIDELINE_STATUS_FILLED;

        case GUIDELINE_STATUS_APPROVED_CODE :
            return GUIDELINE_STATUS_APPROVED;

        case GUIDELINE_STATUS_RUNNING_CODE :
            return GUIDELINE_STATUS_RUNNING;

        default :
        }

        return null;
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
