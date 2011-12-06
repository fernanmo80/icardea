package tr.com.srdc.icardea.careplanengine.alarmSystem;

//~--- non-JDK imports --------------------------------------------------------

import tr.com.srdc.icardea.careplanengine.alarmSystem.alarmOntology.AlarmMessage;
//~--- JDK imports ------------------------------------------------------------

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Time;

import org.apache.log4j.Logger;

public class AlarmDatabaseConnection {
    public static final String databaseURI = "jdbc:mysql://localhost/final_icardeaalarmdatabase";
    public static final String username    = "root";
    public static final String password    = "icardea";
    private static Connection  connection  = connectToAlarmDatabase();	
    public static Logger logger = Logger.getLogger(AlarmDatabaseConnection.class);
    public static Connection connectToAlarmDatabase() {
        Connection connection = null;

        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            connection = DriverManager.getConnection(databaseURI, username, password);
        } catch (Exception exc) {
            exc.printStackTrace();
        }

        return connection;
    }

    public static ResultSet getAssignmentsWithId(String assignmentID, String roleID) {
        String query = "SELECT * FROM  GUIDELINEASSIGNMENTS G, USERS U  WHERE G.ASSIGNMENTID ='" + assignmentID + "'"
                       + " AND U.USERID=G.USERID AND U.USERROLE = " + roleID;

        try {

            // Logger.getLogger(this.getClass()).log(Level.DEBUG, (query);
            Statement statement = connection.createStatement();
            ResultSet rs        = statement.executeQuery(query);

            return rs;
        } catch (SQLException e) {

            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return null;
    }

    public static ResultSet getUserContacts(int userID, int contactType) {
        String query = "SELECT * FROM USERCONTACTS WHERE USERID=" + userID
                       + " AND CONTACTISAVAILABLE =1 AND CONTACTTYPE=" + contactType;
        ResultSet resultSet = null;

        try {
            Statement statement = connection.createStatement();

            resultSet = statement.executeQuery(query);
        } catch (SQLException e) {

            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return resultSet;
    }

    public static String getContactInfo(int userID, int contactType) {
        String query = "SELECT CONTACTNUMBER FROM USERCONTACTS WHERE USERID= " + userID + " AND CONTACTTYPE="
                       + contactType;
        ResultSet rs = null;

        try {
            Statement statement = connection.createStatement();

            rs = statement.executeQuery(query);
            rs.next();

            return rs.getString("ContactNumber");
        } catch (Exception exc) {
            exc.printStackTrace();
        }

        return null;
    }

    public static int getRoutedUser(int userID, String assignmentID) {
        String query = "SELECT  GIVENUSERID FROM PERMISSIONS WHERE USERID =" + userID + " AND ASSIGNMENTID="
                       + assignmentID;
        ResultSet rs = null;

        try {
            Statement statement = connection.createStatement();

            rs = statement.executeQuery(query);

            if (rs.next()) {
                return rs.getInt("GivenUserID");
            } else {
                return -1;
            }
        } catch (Exception exc) {
            exc.printStackTrace();
        }

        return -1;
    }

    public static String getUserNameAndSurname(int routerId) {
        String    query = "SELECT  USERFIRSTNAME,USERSURNAME FROM USERS WHERE USERID=" + routerId;
        ResultSet rs    = null;

        // Logger.getLogger(this.getClass()).log(Level.DEBUG, (query);

        try {
            Statement statement = connection.createStatement();

            rs = statement.executeQuery(query);
            rs.next();

            String ret = rs.getString("UserFirstName") + " " + rs.getString("Usersurname");

            return ret;
        } catch (Exception exc) {
            exc.printStackTrace();
        }

        return null;
    }

    public static ResultSet getMedium(int userID, int urgency) {
        String query =
            "SELECT P.USERID, MEDIUMID AS CONTACTTYPE, U.CONTACTNUMBER, P.NEEDACK, P.NUMBEROFTRY, P.WAITDURATION FROM PREFERENCES P, USERCONTACTS U WHERE P.USERID ="
            + userID + " AND URGENCYID=" + urgency
            + " AND P.USERID=U.USERID AND P.MEDIUMID =U.CONTACTTYPE AND U.CONTACTISAVAILABLE=1 ";
        ResultSet rs = null;


        try {
            Statement statement = connection.createStatement();

            rs = statement.executeQuery(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return rs;
    }

    public static String getUrgencyName(int urgency) {
        String urgencyName = "";
        String query       = "SELECT * FROM URGENCIES WHERE URGENCYID=" + urgency;

        try {
            if (connection.isClosed()) {
                connection = connectToAlarmDatabase();
            }
        } catch (SQLException e1) {

            // TODO Auto-generated catch block
            e1.printStackTrace();
        }

        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                urgencyName = resultSet.getString("UrgencyName");
            }
        } catch (SQLException e) {

            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return urgencyName;
    }

    public static ResultSet getUserContacts(int userID) {
        String    query     = "SELECT * FROM USERCONTACTS WHERE USERID=" + userID + " AND CONTACTISAVAILABLE =1";
        ResultSet resultSet = null;

        try {
            Statement statement = connection.createStatement();

            resultSet = statement.executeQuery(query);
        } catch (SQLException e) {

            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return resultSet;
    }
    
    public static ResultSet getRoles() {
        String    query     = "SELECT * FROM ROLES";
        ResultSet resultSet = null;

        try {
            Statement statement = connection.createStatement();

            resultSet = statement.executeQuery(query);
        } catch (SQLException e) {

            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return resultSet;
    }
    
    public static int insertAlertMessage(AlarmMessage alarmMessage) {
    	int result = -1;
    	int assignmentID = Integer.parseInt(alarmMessage.getPatientInfo().getAssignmentID());
    	ResultSet roles = getRoles();
    	String roleString = alarmMessage.getMessageContent().getRole();
    	int roleID = 2;
    	try {
			while(roles.next()){
				if(roles.getString("RoleName").equals(roleString)){
					roleID = roles.getInt("RoleID");
				}
			}
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
    	int urgency = alarmMessage.getMessageContent().getUrgency();
    	String messageContent = alarmMessage.getMessageContent().getContent();
    	Date date = new Date(new java.util.Date().getTime());
    	Time time = new Time(System.currentTimeMillis());
    	logger.info("DATETIME:" + date + " " + time);
    	
    	String query = "INSERT INTO ALARMMESSAGES (AssignmentID,RoleID,Urgency,MessageContent,RECEIVETIME) VALUES (" + assignmentID + "," + roleID + "," + urgency + ",'" + messageContent + "','" + date + " " + time + "')";
       

        try {
            Statement statement = connection.createStatement();
            logger.info("QUERY:" + query);
            result = statement.executeUpdate(query);
        } catch (SQLException e) {

            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return result;
    }
    
    public static String getDateOfLastMessage() {
        String    query     = "SELECT * FROM ALARMMESSAGES";
        ResultSet resultSet = null;
        String result = "";
        try {
            Statement statement = connection.createStatement();

            resultSet = statement.executeQuery(query);
            while(resultSet.next()){
            	logger.info(resultSet.getInt("MessageID"));
            	Date receiveDate = resultSet.getDate("RECEIVETIME");
            	Time receiveTime = resultSet.getTime("RECEIVETIME");
            	result = new Long((new Time(System.currentTimeMillis()).getTime() - receiveDate.getTime() - receiveTime.getTime()) / 1000 - 7200).toString(); 
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
