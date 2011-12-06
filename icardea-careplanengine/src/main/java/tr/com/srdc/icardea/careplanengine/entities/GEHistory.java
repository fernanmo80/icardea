package tr.com.srdc.icardea.careplanengine.entities;

//~--- JDK imports ------------------------------------------------------------

import java.util.Date;
import java.util.Vector;

/**
 * @author Administrator
 *
 */
public class GEHistory {
    private String col1 = null;
    private String col2 = null;
    private String col3 = null;
    private String col4 = null;
    private String col5 = null;
    private String col6 = null;
    private String col7 = null;
    private String col8 = null;
    private String col9 = null;
    private Long   id;
    private Date   messageReceivedTime;
    private Long   sessionID;
    private String subguidelineID;

    /*
     * Default constructor
     */
    public GEHistory() {
        super();

        return;
    }

    /**
     * @param sessionID
     * @param messageReceivedTime
     * @param col1
     * @param col2
     * @param col3
     * @param col4
     * @param col5
     * @param col6
     * @param col7
     * @param col8
     * @param col9
     */
    public GEHistory(Long sessionID, String id, Date messageReceivedTime, String col1, String col2, String col3,
                     String col4, String col5, String col6, String col7, String col8, String col9) {
        super();
        this.subguidelineID      = id;
        this.sessionID           = sessionID;
        this.messageReceivedTime = messageReceivedTime;
        this.col1                = col1;
        this.col2                = col2;
        this.col3                = col3;
        this.col4                = col4;
        this.col5                = col5;
        this.col6                = col6;
        this.col7                = col7;
        this.col8                = col8;
        this.col9                = col9;
    }

    /**
     * @return the col1
     */
    public String getCol1() {
        return col1;
    }

    /**
     * @param col1 the col1 to set
     */
    public void setCol1(String col1) {
        this.col1 = col1;
    }

    /**
     * @return the col2
     */
    public String getCol2() {
        return col2;
    }

    /**
     * @param col2 the col2 to set
     */
    public void setCol2(String col2) {
        this.col2 = col2;
    }

    /**
     * @return the col3
     */
    public String getCol3() {
        return col3;
    }

    /**
     * @param col3 the col3 to set
     */
    public void setCol3(String col3) {
        this.col3 = col3;
    }

    /**
     * @return the col4
     */
    public String getCol4() {
        return col4;
    }

    /**
     * @param col4 the col4 to set
     */
    public void setCol4(String col4) {
        this.col4 = col4;
    }

    /**
     * @return the col5
     */
    public String getCol5() {
        return col5;
    }

    /**
     * @param col5 the col5 to set
     */
    public void setCol5(String col5) {
        this.col5 = col5;
    }

    /**
     * @return the col6
     */
    public String getCol6() {
        return col6;
    }

    /**
     * @param col6 the col6 to set
     */
    public void setCol6(String col6) {
        this.col6 = col6;
    }

    /**
     * @return the col7
     */
    public String getCol7() {
        return col7;
    }

    /**
     * @param col7 the col7 to set
     */
    public void setCol7(String col7) {
        this.col7 = col7;
    }

    /**
     * @return the col8
     */
    public String getCol8() {
        return col8;
    }

    /**
     * @param col8 the col8 to set
     */
    public void setCol8(String col8) {
        this.col8 = col8;
    }

    /**
     * @return the col9
     */
    public String getCol9() {
        return col9;
    }

    /**
     * @param col9 the col9 to set
     */
    public void setCol9(String col9) {
        this.col9 = col9;
    }

    /**
     * @return the messageReceivedTime
     */
    public Date getMessageReceivedTime() {
        return messageReceivedTime;
    }

    /**
     * @param messageReceivedTime the messageReceivedTime to set
     */
    public void setMessageReceivedTime(Date messageReceivedTime) {
        this.messageReceivedTime = messageReceivedTime;
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

    public Vector<String> history2content() {
        Vector<String> stepInfo = new Vector();

        stepInfo.add(sessionID.toString());    // /Previously tabs are identified by assignment id but now it is sessionID

        // stepInfo.add(sessionID.toString());

        if (col1 != null) {
            stepInfo.add(col1);
        }

        if (col2 != null) {
            stepInfo.add(col2);
        }

        if (col3 != null) {
            stepInfo.add(col3);
        }

        if (col4 != null) {
            stepInfo.add(col4);
        }

        if (col5 != null) {
            stepInfo.add(col5);
        }

        if (col6 != null) {
            stepInfo.add(col6);
        }

        if (col7 != null) {
            stepInfo.add(col7);
        }

        if (col8 != null) {
            stepInfo.add(col8);
        }

        if (col9 != null) {
            stepInfo.add(col9);
        }

        stepInfo.add(subguidelineID.toString());
        stepInfo.add(String.valueOf(messageReceivedTime.getTime()));

        return stepInfo;
    }

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return the subguidelineID
     */
    public String getSubguidelineID() {
        return subguidelineID;
    }

    /**
     * @param subguidelineID the subguidelineID to set
     */
    public void setSubguidelineID(String subguidelineID) {
        this.subguidelineID = subguidelineID;
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
