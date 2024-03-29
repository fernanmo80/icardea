import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.io.*;

public class SendEmail {

	public static void main(String[] args) {
		sendEMail(args[0], args[1], args[2]);
	}

	public static boolean sendEMailWithAck(String contactNumber,
		String messageSubject, String messageBody, int howMany,
		int waitDuration) {
		// TODO Auto-generated method stub
		return false;
	}

	public static void sendEMail(String contactNumber, String messageSubjectFile,
		String bodyFile) {
		String messageBody = "";
		String messageSubject = "";
		String thisLine = "";
		try {
			BufferedReader br2 = new BufferedReader(new FileReader(messageSubjectFile));
			while ((thisLine = br2.readLine()) != null) { // while loop begins here
				messageSubject += thisLine;
			} // end while 

			BufferedReader br = new BufferedReader(new FileReader(bodyFile));
			while ((thisLine = br.readLine()) != null) { // while loop begins here
				messageBody += thisLine;
			} // end while 

		} catch(Exception ex) {
			ex.printStackTrace();
		}
		System.out.println(" $$$ Sending email to:" + contactNumber + ", \nmessage subject:" + messageSubject + ", \nmessage body:" + messageBody);
		Properties props = new Properties();
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.socketFactory.port", "465");
		props.put("mail.smtp.socketFactory.class",
				"javax.net.ssl.SSLSocketFactory");
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.port", "465");

		Session session = Session.getDefaultInstance(props,
				new javax.mail.Authenticator() {

					protected PasswordAuthentication getPasswordAuthentication() {
						return new PasswordAuthentication("icardeaproject@gmail.com", "iCardea2010");
					}
				});

		try {

			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress("icardeaalarm@srdc.com.tr", "iCARDEA Alarm System"));
			message.setRecipients(Message.RecipientType.TO,
					InternetAddress.parse(contactNumber));
			message.setSubject(messageSubject);
			message.setContent(messageBody, "text/html");

			Transport.send(message);

			System.out.println("Done");

		} catch (Exception e) {
			throw new RuntimeException(e);
		}

	}
}

