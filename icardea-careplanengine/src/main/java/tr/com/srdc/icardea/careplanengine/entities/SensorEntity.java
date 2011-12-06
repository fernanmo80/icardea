package tr.com.srdc.icardea.careplanengine.entities;

//~--- non-JDK imports --------------------------------------------------------

import tr.com.srdc.icardea.careplanengine.glmodel.*;

/**
 * <p></p>
 *
 * @poseidon-object-id [Im1d061edbm109b190a453mm6f3b]
 */
public class SensorEntity {
    private Data_Item output;
    private String    sensorAgentID;
    private String    sensorCategory;

    /**
     *
     */
    public SensorEntity() {

        // TODO Auto-generated constructor stub
    }

    /**
     * @param sensorCategory
     * @param output
     * @param sensorAgentID
     */
    public SensorEntity(String sensorCategory, Data_Item output, String sensorAgentID) {

        // TODO Auto-generated constructor stub
        this.sensorCategory = sensorCategory;
        this.output         = output;
        this.sensorAgentID  = sensorAgentID;
    }

    /**
     * @return Returns the output.
     */
    public Data_Item getOutput() {
        return output;
    }

    /**
     * @param output The output to set.
     */
    public void setOutput(Data_Item output) {
        this.output = output;
    }

    /**
     * @return Returns the sensorAgentID.
     */
    public String getSensorAgentID() {
        return sensorAgentID;
    }

    /**
     * @param sensorAgentID The sensorAgentID to set.
     */
    public void setSensorAgentID(String sensorAgentID) {
        this.sensorAgentID = sensorAgentID;
    }

    /**
     * @return Returns the sensorCategory.
     */
    public String getSensorCategory() {
        return sensorCategory;
    }

    /**
     * @param sensorCategory The sensorCategory to set.
     */
    public void setSensorCategory(String sensorCategory) {
        this.sensorCategory = sensorCategory;
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
