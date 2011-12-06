package tr.com.srdc.icardea.careplanengine.alarmSystem.sms;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

import java.util.ResourceBundle;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;

public class SMSSenderService {
	private static String postURL = "http://gw.maradit.net/";

	private static String username = "srdc";
	private static String password = "Rasime51";
	private static String companyCode = "100";
	private static String messageBody = "test mesaji";
	private static int command = 0; // SMS to Many

	public static void main(String[] args) {
		SMSSenderService s = new SMSSenderService();
		//s.sendSMS("00905058668960", "Sample message content");
		s.sendSMS("+905052319177", "Sample message content");
	}

	public static String sendSMS(String telephone, String messagebody) {

		System.out.println("Sending SMS to:"+telephone+" with body:"+messagebody);
		ResourceBundle properties = ResourceBundle.getBundle("icardea");
		String smsProvider = properties.getString("sms.provider");
		if(smsProvider.equals("salk")) {
			try {
				String command = "D:\\blat.exe body.txt -try 3 -tf recipients.txt -subject \"Test\" -f icardea@salk.at -server smtp.lks.local -port 25";
				FileOutputStream body = new FileOutputStream("body.txt");
				FileOutputStream recipients = new FileOutputStream("recipients.txt");
				String receiver = telephone + "@sms.salk.at";
				body.write(messagebody.getBytes());					
				recipients.write(receiver.getBytes());
				body.close();
				recipients.close();
				Process p = Runtime.getRuntime().exec(command);
				return "";
			} catch(Exception ex) {
				ex.printStackTrace();
			}
		}

		

		String xmlMessage = "<MainmsgBody> " + "<Command>" + command
				+ "</Command> " + "<PlatformID>1</PlatformID> " + "<UserName>"
				+ username + "</UserName> " + "<PassWord>" + password
				+ "</PassWord> " + "<ChannelCode>" + companyCode
				+ "</ChannelCode> " + "<Mesgbody>" + messagebody
				+ "</Mesgbody> " + "<Numbers>" + telephone + "</Numbers> "
				+ "<Type>1</Type> " + "<Originator></Originator> "
				+ "<SDate></SDate> <EDate></EDate> " + "</MainmsgBody>";

		HttpPost post = new HttpPost(postURL);
		try {
			StringEntity entity = new StringEntity(xmlMessage, "UTF-8");
			post.setEntity(entity);
			HttpClient httpClient = new DefaultHttpClient();
			HttpResponse response = httpClient.execute(post);
			System.out.println(xmlMessage);
			System.out.println(" $$$ Status:"+response.getStatusLine().getStatusCode());
			System.out.println(" $$$ Response:"+EntityUtils.toString(response.getEntity()));

		} catch (UnsupportedEncodingException e) {

			e.printStackTrace();
		} catch (ClientProtocolException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return xmlMessage;
	}
}
