
/*
* Created on May 24, 2007
 */
package tr.com.srdc.icardea.careplanengine.entities;

/**
 * @author mustafa
 *
 */
public class UserRole {
    private String information;
    private String roleID;
    private String roleName;

    /**
     *
     */
    public UserRole() {

        // TODO Auto-generated constructor stub
    }

    /**
     * @param roleID
     * @param roleName
     * @param information
     */
    public UserRole(String roleID, String roleName, String information) {

        // TODO Auto-generated constructor stub
        this.roleID      = roleID;
        this.roleName    = roleName;
        this.information = information;
    }

    /**
     * @return Returns the information.
     */
    public String getInformation() {
        return information;
    }

    /**
     * @param information The information to set.
     */
    public void setInformation(String information) {
        this.information = information;
    }

    /**
     * @return Returns the roleID.
     */
    public String getRoleID() {
        return roleID;
    }

    /**
     * @param roleID The roleID to set.
     */
    public void setRoleID(String roleID) {
        this.roleID = roleID;
    }

    /**
     * @return Returns the roleName.
     */
    public String getRoleName() {
        return roleName;
    }

    /**
     * @param roleName The roleName to set.
     */
    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
