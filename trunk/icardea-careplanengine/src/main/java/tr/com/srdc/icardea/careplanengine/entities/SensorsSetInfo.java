
/*
* Created on Jul 5, 2006
 */
package tr.com.srdc.icardea.careplanengine.entities;

/**
 * @author mustafa
 *
 */
public class SensorsSetInfo {
    private boolean available;
    private String  name;
    private int     sid;

    /**
     *
     */
    public SensorsSetInfo() {

        // TODO Auto-generated constructor stub
    }

    /**
     * @param sid
     * @param name
     * @param available
     */
    public SensorsSetInfo(int sid, String name, boolean available) {

        // TODO Auto-generated constructor stub
        this.sid       = sid;
        this.name      = name;
        this.available = available;
    }

    /**
     * @return Returns the available.
     */
    public boolean isAvailable() {
        return available;
    }

    /**
     * @param available The available to set.
     */
    public void setAvailable(boolean available) {
        this.available = available;
    }

    /**
     * @return Returns the name.
     */
    public String getName() {
        return name;
    }

    /**
     * @param name The name to set.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return Returns the sid.
     */
    public int getSid() {
        return sid;
    }

    /**
     * @param sid The sid to set.
     */
    public void setSid(int sid) {
        this.sid = sid;
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
