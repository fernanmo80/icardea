
/*
* Created on Jan 30, 2006
*
* TODO To change the template for this generated file go to
* Window - Preferences - Java - Code Style - Code Templates
 */
package tr.com.srdc.icardea.careplanengine.communication;

//~--- non-JDK imports --------------------------------------------------------

import org.mrf.MSNBot.*;
//~--- JDK imports ------------------------------------------------------------

import java.util.ArrayList;

/**
 * @author Bugrahan
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class MSNCommunication extends MSNBot {
    private static MSNCommunication bot           = null;
    private static String           owneraddress  = "sapals@srdc.metu.edu.tr";
    private static String           ownerpassword = "Rasime1202662";
    private static boolean          isonline      = false;
    private static ArrayList        ack           = new ArrayList();
    private static String           msg;
    private static String           receiverMSN;
    private static String           sessionid;

    public MSNCommunication(String passport, String password) {
        setPassport(passport);
        setPassword(password);
    }

    public void incomingCreateChatSessionPacket(java.lang.String sessionID, MessagePacket message) {
        inviteOtherContact(sessionID, receiverMSN);
    }

    public void contactJoinedChatSession(java.lang.String sessionID, java.lang.String contactsPassport) {
        sendChatMessage(sessionID, msg);
        sessionid = sessionID;
    }

    public void chatMessage(String sessionID, String contactsPassport, String message) {

        // message = message.trim();
        // if(message.equalsIgnoreCase("time")){
        sendChatMessage(sessionID, "ICARDEA Alert System wishes Healthy and Happy Days...");
        ack.add(sessionID);

        // }
    }

    public static boolean isAcknowledged(String sesid) {

        for (int i = 0; i < ack.size(); i++) {

            if (ack.get(i).toString().equals(sesid)) {
                ack.remove(i);

                return true;
            }
        }

        return false;
    }

    public static void startMSN() {
        bot = new MSNCommunication(owneraddress, ownerpassword);
        bot.connect();

        try {
            bot.requestStatusChange(ProtocolValidValues.CONTACT_STATUS_CHANGE_PACKET);
        } catch (InvalidStatusException e) {

            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        isonline = true;
    }

    public static String sendMSNMessage(String msnaddress, String newmsg) {
        if (!isonline) {
            bot = new MSNCommunication(owneraddress, ownerpassword);
            bot.connect();

            try {
                bot.requestStatusChange(ProtocolValidValues.CONTACT_STATUS_CHANGE_PACKET);
            } catch (InvalidStatusException e) {

                // TODO Auto-generated catch block
                e.printStackTrace();
            }

            isonline = true;
        }

        receiverMSN = msnaddress;
        msg         = newmsg;
        bot.requestChatSession();

        while (sessionid == null) {}


        return sessionid;
    }

    public static void main(String[] args) {
        if (args.length == 2) {
            bot = new MSNCommunication(args[0], args[1]);
            bot.connect();

            try {
                bot.requestStatusChange(ProtocolValidValues.CONTACT_STATUS_CHANGE_PACKET);
                bot.requestChatSession();
                receiverMSN = "bugrahanakcay@hotmail.com";
                msg         = "deneme";
            } catch (InvalidStatusException e) {
                System.out.print("Sorry the status valid specified is not a valid status ");
                System.out.print("If this problem persist, then you should download ");
            }
        } else {
        }
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
