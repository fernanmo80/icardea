package tr.com.srdc.icardea.platform.mail;

import org.springframework.mail.javamail.JavaMailSenderImpl;

public class MailSenderImpl extends JavaMailSenderImpl {

	private String from;
	
//	public String getHost() {
//		return host;
//	}
//	public void setHost(String host) {
//		super.host = host;
//	}

	public String getFrom() {
		
		return from;
	}

	public void setFrom(String from) {
		this.from = from;		
	}
}
