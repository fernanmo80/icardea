package tr.com.srdc.icardea.careplanengine.alarmSystem.gtalk;

//~--- non-JDK imports --------------------------------------------------------

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.jivesoftware.smack.Chat;
import org.jivesoftware.smack.GoogleTalkConnection;
import org.jivesoftware.smack.PacketListener;
import org.jivesoftware.smack.Roster;
import org.jivesoftware.smack.RosterEntry;
import org.jivesoftware.smack.XMPPException;
import org.jivesoftware.smack.packet.Message;
import org.jivesoftware.smack.packet.Packet;
import org.jivesoftware.smack.packet.Presence;

//~--- JDK imports ------------------------------------------------------------

import java.util.HashMap;
import java.util.Iterator;
import java.util.Vector;

public class ICARDEAGTalkConnection {

    // wait constant is  adjust configure the wait duration in demo modes [itasyurt 29.09.06]
    private int                   WAITCONSTANT = 60;
    private HashMap<String, Chat> chatTable    = new HashMap<String, Chat>();
    private GoogleTalkConnection  connection;

    public ICARDEAGTalkConnection() {
        try {
            connection = new GoogleTalkConnection();
            chatTable  = new HashMap<String, Chat>();
        } catch (XMPPException e) {

            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public GoogleTalkConnection getConnection() {
        return connection;
    }

    public boolean createConnection(String username, String password) {
        try {
            connection.login(username, password);

            if (connection.isAuthenticated()) {
                Logger.getLogger(this.getClass()).log(Level.DEBUG, ("GTalk Connected"));

                return true;
            }
        } catch (Exception exc) {
            exc.printStackTrace();
        }

        return false;
    }

    // sends not
    public void sendInstantMessage(String gtalkAddress, String messageBody) {
        try {
            Chat chat = chatTable.get(gtalkAddress);

            if (chat == null) {
                chat = connection.createChat(gtalkAddress);
                chatTable.put(gtalkAddress, chat);
            }

            chat.sendMessage(messageBody);
        } catch (Exception exc) {
            exc.printStackTrace();
        }
    }

    // sends waiting message with ack
    // returns whether ack received or not
    public boolean sendInstantWithAck(String gtalkAddress, String messageBody, int howMany, int waitDuration) {
        try {
            Chat chat = chatTable.get(gtalkAddress);

            if (chat == null) {
                chat = connection.createChat(gtalkAddress);
                chatTable.put(gtalkAddress, chat);
            }

            // ICARDEAChatAck ack = new ICARDEAChatAck();
            // chat.addMessageListener(new ChatListener(ack));
            chat.sendMessage(messageBody);

            for (int i = 0; i < howMany; ++i) {

                // Thread.sleep(1000* waitDuration * WAITCONSTANT);
                Message mes = chat.nextMessage(1000 * waitDuration * WAITCONSTANT);

                if (mes != null) {
                    return true;
                } else {
                    chat.sendMessage(messageBody);
                }

//              }

//              if  (ack.isAcked())  {
//                      Logger.getLogger(this.getClass()).log(Level.DEBUG, ("acked");
//                      return true;
//              }
//              
            }

            Logger.getLogger(this.getClass()).log(Level.DEBUG, ("not acked! do something else"));

            return false;
        } catch (Exception exc) {
            exc.printStackTrace();
        }

        return true;
    }

    @SuppressWarnings({ "unchecked", "unchecked" })
    public Vector getAvailableList() {
        Vector v = new Vector();

        try {
            Roster   roster = connection.getRoster();
            Iterator it     = roster.getEntries();

            while (it.hasNext()) {
                try {
                    RosterEntry entry      = (RosterEntry) it.next();
                    String      searchName = entry.getUser();
                    Presence    presence   = roster.getPresence(searchName);

                    if (presence != null) {
                        v.add(searchName);
                    }
                } catch (Exception exc) {
                    exc.printStackTrace();
                }
            }

            return v;
        } catch (Exception e) {

            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return v;
    }

    class ChatListener implements PacketListener {
        ICARDEAChatAck ack;

        public ChatListener(ICARDEAChatAck ack) {

            // TODO Auto-generated constructor stub
            this.ack = ack;
        }

        public void processPacket(Packet packet) {

            // TODO Auto-generated method stub
            // Message msg= (Message) packet;
            ack.setAcked();
        }
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
