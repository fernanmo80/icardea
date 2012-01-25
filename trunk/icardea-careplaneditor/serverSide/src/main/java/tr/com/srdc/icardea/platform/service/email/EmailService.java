package tr.com.srdc.icardea.platform.service.email;

import org.apache.velocity.app.VelocityEngine;
import org.springframework.mail.javamail.JavaMailSender;

import tr.com.srdc.icardea.platform.model.Person;

public interface EmailService {
	
	 public void setMailSender(JavaMailSender mailSender);	   
	 public void setVelocityEngine(VelocityEngine velocityEngine);
	 public void sendEmail(Person person);
	 void sendConfirmationEmail(Person person);
}
