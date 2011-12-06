package tr.com.srdc.icardea.careplanengine.alarmSystem;

//~--- non-JDK imports --------------------------------------------------------

import tr.com.srdc.icardea.careplanengine.alarmSystem.eMail.EMail;
import tr.com.srdc.icardea.careplanengine.alarmSystem.gtalk.ICARDEAGTalkConnection;
import tr.com.srdc.icardea.careplanengine.alarmSystem.sms.ClickatellSMS;
//~--- JDK imports ------------------------------------------------------------

import java.io.IOException;
import org.apache.log4j.Logger;

public class CommunicationMedium {
    public static final int EMAIL_COMMUNICATION = 2;

    // / enumeration of the mediums
    public static final int GOOGLETALK_COMMUNICATION = 1;
    public static final int SMS_COMMUNICATION        = 3;
    private static String   gtalkPassword            = "icardea51";

    // GTalkParamaters
    // private static String gtalkUser="icardeaAlarmSystem";
    // private static String gtalkPassword="Rasime51";
    private static String gtalkUser = "icardeaalarmsystem";
    public static Logger logger = Logger.getLogger(CommunicationMedium.class);

    // GTalkVariables
    private static ICARDEAGTalkConnection gtalk;

    public static void sendInstantMessage(String gtalkAddress, String messageBody) {
        logger.info("CHECKING GTALK");
    	if(gtalk == null){
        	logger.info("NULL GTALK");
        	connectToGtalk();
        }else{
        	logger.info("NOT NULL GTALK");
        }
    	
    	gtalk.sendInstantMessage(gtalkAddress, messageBody);
    }

    public static void connectToGtalk() {
        boolean isConnected = false;

        while (!isConnected) {
            gtalk       = new ICARDEAGTalkConnection();
            isConnected = gtalk.createConnection(gtalkUser, gtalkPassword);
        }

    }

    // [itasyurt 25.09.06 ]sends  sms to the destination
    public static String sendSMS(String contactNumber, String messageBody) {

//      return SMS.sendSMS(contactNumber, messageBody);
        return tr.com.srdc.icardea.careplanengine.alarmSystem.sms.SMSSenderService.sendSMS(contactNumber, messageBody);
    }

    public static int checkSMS(String id) {

//      return SMS.checkifSend_xml(id);
        int status = -1;

        try {
            if (ClickatellSMS.checkifSend(id)) {
                status = 1;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return status;
    }

    public static boolean sendInstantMessageWithAck(String contactNumber, String messageBody, int howMany,
            int waitDuration) {
        return gtalk.sendInstantWithAck(contactNumber, messageBody, howMany, waitDuration);
    }

    public static void sendEMail(String contactNumber, String messageSubject, String messageBody) {
        EMail.sendEMail(contactNumber, messageSubject, messageBody);
    }

    public static boolean sendEMailWithAck(String contactNumber, String messageSubject, String messageBody,
            int howMany, int waitDuration) {
        return EMail.sendEMailWithAck(contactNumber, messageSubject, messageBody, howMany, waitDuration);
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
