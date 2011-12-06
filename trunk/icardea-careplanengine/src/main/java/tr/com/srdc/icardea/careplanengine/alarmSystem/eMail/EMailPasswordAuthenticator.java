package tr.com.srdc.icardea.careplanengine.alarmSystem.eMail;

//~--- JDK imports ------------------------------------------------------------

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;

public class EMailPasswordAuthenticator extends Authenticator {
    private String password;
    private String username;

    public EMailPasswordAuthenticator() {
        super();
    }

    public EMailPasswordAuthenticator(String username, String password) {
        super();
        this.username = username;
        this.password = password;
    }

    public PasswordAuthentication getPasswordAuthentication(String smtpUsername, String smtpPassword) {
        return new PasswordAuthentication(smtpUsername, smtpPassword);
    }

    public PasswordAuthentication getPasswordAuthentication() {
        return new PasswordAuthentication(username, password);
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
