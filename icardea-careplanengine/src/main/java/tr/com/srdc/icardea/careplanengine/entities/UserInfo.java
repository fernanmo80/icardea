
/*
* Created on Jul 5, 2006
 */
package tr.com.srdc.icardea.careplanengine.entities;

//~--- JDK imports ------------------------------------------------------------

import java.util.ArrayList;

/**
 * @author mustafa
 *
 */
public class UserInfo {
    private ArrayList<String> roleName = new ArrayList<String>();
    private ArrayList<String> roleInfo = new ArrayList<String>();
    private String            fullName;
    private String            password;
    private String            userID;
    private String            userName;

    /**
     *
     */
    public UserInfo() {

        // TODO Auto-generated constructor stub
    }

    /**
     *     @param userID
     *     @param userName
     *     @param fullName
     *     @param password
     */
    public UserInfo(String userID, String userName, String fullName, String password) {

        // TODO Auto-generated constructor stub
        this.userID   = userID;
        this.userName = userName;
        this.fullName = fullName;
        this.password = password;
    }

    /**
     * @return Returns the fullName.
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * @param fullName The fullName to set.
     */
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    /**
     * @return Returns the password.
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password The password to set.
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return Returns the userID.
     */
    public String getUserID() {
        return userID;
    }

    /**
     * @param userID The userID to set.
     */
    public void setUserID(String userID) {
        this.userID = userID;
    }

    /**
     * @return Returns the userName.
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName The userName to set.
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void addRoleName(String rolen) {
        this.roleName.add(rolen);
    }

    public void addRoleInfo(String rolei) {
        this.roleInfo.add(rolei);
    }

    /**
     * @return Returns the roleInfo.
     */
    public ArrayList<String> getRoleInfo() {
        return roleInfo;
    }

    /**
     * @param roleInfo The roleInfo to set.
     */
    public void setRoleInfo(ArrayList<String> roleInfo) {
        this.roleInfo = roleInfo;
    }

    /**
     * @return Returns the roleName.
     */
    public ArrayList<String> getRoleName() {
        return roleName;
    }

    /**
     * @param roleName The roleName to set.
     */
    public void setRoleName(ArrayList<String> roleName) {
        this.roleName = roleName;
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
