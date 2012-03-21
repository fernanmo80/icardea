package tr.com.srdc.icardea.careplanengine.alarmSystem.eMail;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Properties;
import java.util.ResourceBundle;

import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class EMail {

	public static void main(String[] args) {
		sendEMail("eliferylmz@gmail.com", "New iCARDEA Alarm!!!",
				"<html><head/><body><h1>Alarm</h1></body>");
		sendEMail("yildiraykabak@gmail.com", "New iCARDEA Alarm!!!",
				"<html><head/><body><h1>Alarm</h1></body>");
	}

	public static boolean sendEMailWithAck(String contactNumber,
			String messageSubject, String messageBody, int howMany,
			int waitDuration) {
		// TODO Auto-generated method stub
		return false;
	}

	public static void sendEMail(String contactNumber, String messageSubject,
			String messageBody) {
		
		ResourceBundle properties = ResourceBundle.getBundle("icardea");
		String smsProvider = properties.getString("sms.provider");
		if(smsProvider.equals("salk")) {
			try {
				System.out.println(" $$$ Sending email to:" + contactNumber
						+ ", \nmessage subject:" + messageSubject + ", \nmessage body:"
						+ messageBody+" with SALK blat script...");
				String command = "D:\\blat.exe D:\\bodyEmail.txt -html -try 3 -tf D:\\recipientsEmail.txt -subject \""+messageSubject+"\"  -f iCARDEA@salk.at -server smtp.lks.local -port 25";
				System.out.println(" Running the command: "+command);
				FileOutputStream body = new FileOutputStream("D:\\bodyEmail.txt");
				FileOutputStream recipients = new FileOutputStream("D:\\recipientsEmail.txt");
				String receiver = contactNumber;
				body.write(messageBody.getBytes());					
				recipients.write(receiver.getBytes());
				body.close();
				recipients.close();
				Process p = Runtime.getRuntime().exec(command);
				return ;
			} catch(Exception ex) {
				ex.printStackTrace();
			}
		}
		
		// TODO: alt taraftaki if blogu sil

		if (true) {
			try {

				String directory = ResourceBundle.getBundle("icardea")
						.getString("icardea.home") + "/tools_resources/email/";

				String batFile = directory + "sendEmail.bat";
				String subjectFile = directory + "subject.txt";
				String bodyFile = directory + "body.txt";

				String command = batFile + " " + contactNumber + " "
						+ subjectFile + " " + bodyFile;
				String classPath = directory + ";" + directory + "mail-1.4.jar";
				
				FileOutputStream commandFile = new FileOutputStream(batFile);
				FileOutputStream body = new FileOutputStream(bodyFile);
				FileOutputStream subject = new FileOutputStream(subjectFile);
				body.write(messageBody.getBytes());
				subject.write(messageSubject.getBytes());
				body.close();
				subject.close();
				
				String commandIntoCommandFile = "java -cp ".concat(classPath).concat(" SendEmail %1 %2 %3");
				commandIntoCommandFile = commandIntoCommandFile.replace('/', '\\');
				commandFile.write(commandIntoCommandFile.getBytes());
				commandFile.close();
				
				System.out.println(" $$$ Command:" + command);
				String line = "";
				
				Process p = Runtime.getRuntime().exec(command);

				BufferedReader bre = new BufferedReader(new InputStreamReader(
						p.getErrorStream()));
				while ((line = bre.readLine()) != null) {
					System.out.println(line);
				}
				bre.close();

				BufferedReader bri = new BufferedReader(new InputStreamReader(
						p.getInputStream()));
				
				while ((line = bri.readLine()) != null) {
					System.out.println(line);
				}
				bri.close();
				p.waitFor();
				System.out.println(" $$$ Sent email to:" + contactNumber
						+ ", \nmessage subject:" + messageSubject
						+ ", \nmessage body:" + messageBody);
			} catch (Exception ex) {
				ex.printStackTrace();
			}
			return;
		}
		System.out.println(" $$$ Sending email to:" + contactNumber
				+ ", \nmessage subject:" + messageSubject + ", \nmessage body:"
				+ messageBody);
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
						return new PasswordAuthentication(
								"icardeaproject@gmail.com", "iCardea2010");
					}
				});

		try {

			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress("icardeaalarm@srdc.com.tr",
					"iCARDEA Alarm System"));
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
