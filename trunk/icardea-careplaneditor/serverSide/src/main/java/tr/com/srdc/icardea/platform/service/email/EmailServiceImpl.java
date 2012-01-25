package tr.com.srdc.icardea.platform.service.email;

import java.util.HashMap;
import java.util.Map;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.apache.velocity.app.VelocityEngine;
import org.apache.velocity.exception.VelocityException;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.mail.javamail.MimeMessagePreparator;
import org.springframework.ui.velocity.VelocityEngineUtils;

import tr.com.srdc.icardea.platform.model.Person;

public class EmailServiceImpl implements EmailService {
	private JavaMailSender mailSender;
	private VelocityEngine velocityEngine;

	public void setMailSender(JavaMailSender mailSender) {
		this.mailSender = mailSender;
	}

	public void setVelocityEngine(VelocityEngine velocityEngine) {
		this.velocityEngine = velocityEngine;
	}

	public JavaMailSender getMailSender() {
		return mailSender;
	}

	public void sendEmail(Person person) {
		sendConfirmationEmail(person);
	}

	public void sendConfirmationEmail(final Person person) {
		MimeMessagePreparator preparator = new MimeMessagePreparator() {
			public void prepare(MimeMessage mimeMessage) {
				try {
					MimeMessageHelper message = new MimeMessageHelper(mimeMessage);
					message.setSubject("iCARDEA Platform Registration");
					message.setTo(person.getContact().getEmail());

					message.setFrom("elif@srdc.com.tr");

					Map model = new HashMap();
					model.put("person", person);
					String text = VelocityEngineUtils.mergeTemplateIntoString(
							velocityEngine, "defaultEmailTemplate.vm", model);
					message.setText(text, true);
				} catch (MessagingException e) {
					System.out.println("Messagging EXCEPTION");
					e.printStackTrace();
				} catch (VelocityException e) {
					System.out.println("Velocity EXCEPTION");
					e.printStackTrace();
				}
			}
		};
		this.mailSender.send(preparator);
	}
}
