
/*
* Created on May 24, 2007
 */
package tr.com.srdc.icardea.careplanengine.entities;

/**
 * @author mustafa
 *
 */
public class UserAuthorityRole {
    private String authorityID;
    private String authorityRoleID;
    private String roleID;

    /**
     *
     */
    public UserAuthorityRole() {

        // TODO Auto-generated constructor stub
    }

    /**
     * @param authorityRoleID
     * @param authorityID
     * @param roleID
     */
    public UserAuthorityRole(String authorityRoleID, String authorityID, String roleID) {

        // TODO Auto-generated constructor stub
        this.authorityRoleID = authorityRoleID;
        this.authorityID     = authorityID;
        this.roleID          = roleID;
    }

    /**
     * @return Returns the authorityID.
     */
    public String getAuthorityID() {
        return authorityID;
    }

    /**
     * @param authorityID The authorityID to set.
     */
    public void setAuthorityID(String authorityID) {
        this.authorityID = authorityID;
    }

    /**
     * @return Returns the authorityRoleID.
     */
    public String getAuthorityRoleID() {
        return authorityRoleID;
    }

    /**
     * @param authorityRoleID The authorityRoleID to set.
     */
    public void setAuthorityRoleID(String authorityRoleID) {
        this.authorityRoleID = authorityRoleID;
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
}


//~ Formatted by Jindent --- http://www.jindent.com
