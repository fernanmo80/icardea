package tr.com.srdc.icardea.careplanengine.alarmSystem.gtalk;

//~--- non-JDK imports --------------------------------------------------------

import org.jivesoftware.smack.Chat;
import org.jivesoftware.smack.XMPPConnection;

//aclass that stores Acknowledge information
public class ICARDEAChatAck {
    private boolean isAcked;

    public ICARDEAChatAck() {
        isAcked = false;
    }

    public boolean isAcked() {
        return isAcked;
    }

    public void setAcked() {
        this.isAcked = true;
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
