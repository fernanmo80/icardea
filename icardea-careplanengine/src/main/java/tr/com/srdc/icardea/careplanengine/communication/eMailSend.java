
/*
* Created on Jan 22, 2006
*
* TODO To change the template for this generated file go to
* Window - Preferences - Java - Code Style - Code Templates
 */
package tr.com.srdc.icardea.careplanengine.communication;

//~--- JDK imports ------------------------------------------------------------

/**
 * @author Bugrahan
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
import java.io.UnsupportedEncodingException;

import java.util.Date;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

public class eMailSend {
    private String fromAddress  = "sapals@srdc.metu.edu.tr";
    private String fromName     = "iCARDEA Alert System";
    private String smtpHost     = "beykoz.srdc.metu.edu.tr";
    private String smtpPassword = "sapals";
    private String smtpUsername = "sapals";

    public eMailSend() {}

    public static void main(String[] args) {
        eMailSend mjm = new eMailSend();

        mjm.sendMail("bugrahanakcay@hotmail.com", "Deneme", "hadi <b>bakalim</b>");
    }

    public void sendMail(String toAddress, String messageSubject, String messageContent) {
        Properties props = new Properties();

        props.put("mail.smtp.host", smtpHost);
        props.put("mail.debug", "false");

        Session session = Session.getDefaultInstance(props, new ForcedAuthenticator());
        Message message = new MimeMessage(session);

        try {
            message.setFrom(new InternetAddress(fromAddress, fromName));
            message.setRecipient(Message.RecipientType.TO, new InternetAddress(toAddress));
            message.setSubject(messageSubject);

            MimeMultipart multipart   = new MimeMultipart();
            BodyPart      msgBodyPart = new MimeBodyPart();

            msgBodyPart.setContent(messageContent, "text/html");

            BodyPart embedImage = new MimeBodyPart();

            // DataSource ds=new URLDataSource(new URL(MailSettings.inlineImage));
            // embedImage.setDataHandler(new DataHandler(ds));
            // embedImage.setHeader("Content-ID","<logo>");

            multipart.addBodyPart(msgBodyPart);

            // multipart.addBodyPart(embedImage);
            message.setContent(multipart);
            message.setSentDate(new Date());
            Transport.send(message);
        } catch (AddressException e) {

            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (MessagingException e) {

            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {

            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    class ForcedAuthenticator extends Authenticator {
        public PasswordAuthentication getPasswordAuthentication() {
            return new PasswordAuthentication(smtpUsername, smtpPassword);
        }
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
