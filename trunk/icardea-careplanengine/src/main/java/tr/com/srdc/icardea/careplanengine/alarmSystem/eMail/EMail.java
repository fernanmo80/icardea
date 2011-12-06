package tr.com.srdc.icardea.careplanengine.alarmSystem.eMail;

import java.io.FileOutputStream;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class EMail {

	public static void main(String[] args) {
		sendEMail("yildiray@srdc.com.tr", "iCARDEA Alarm", "<html><head/><body><h1>deneme</h1></body>");
	}

	public static boolean sendEMailWithAck(String contactNumber,
		String messageSubject, String messageBody, int howMany,
		int waitDuration) {
		// TODO Auto-generated method stub
		return false;
	}

	public static void sendEMail(String contactNumber, String messageSubject,
		String messageBody) {
		//TODO: alt taraftaki if blogu sil

		if (true) {
			try {
				String command = "D:\\email\\sendEmail.bat "+contactNumber+" subject.txt body.txt";
				FileOutputStream body = new FileOutputStream("body.txt");
				FileOutputStream subject = new FileOutputStream("subject.txt");
				body.write(messageBody.getBytes());
				subject.write(messageSubject.getBytes());
				body.close();
				subject.close();
				Process p = Runtime.getRuntime().exec(command);
			} catch (Exception ex) {
				ex.printStackTrace();
			}
			return;
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
					return new PasswordAuthentication("yildiraykabak@gmail.com", "y.k-1387");
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
