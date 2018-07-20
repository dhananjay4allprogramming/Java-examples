import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class MailDemo2 {
	MailDemo2() throws AddressException, MessagingException {
		Properties properties = new Properties();
		properties.put("mail.smtp.host", "192.168.0.22");
		properties.put("mail.smtp.port", "25");
		properties.put("mail.smtp.starttls.enable", "true");

		Session session = Session.getInstance(properties);

		MimeMessage message = new MimeMessage(session);
		message.setFrom(new InternetAddress("sudheerp@sutisoft.in"));
		message.addRecipient(Message.RecipientType.TO, new InternetAddress("dhananjayp@ibt.example.com"));
		message.addRecipient(Message.RecipientType.CC, new InternetAddress("maheshk@ibt.example.com"));
		message.setSubject("ISO Documentation");
		message.setText("Hi Dhanujay / Mahesh,\r\n" + 
				"\r\n" + 
				 
				 
				"You have to review struts2.x and hibernate frameworks.\r\n" + 
				 
				"Understand the existing code and functionality of how email is sending etc.\r\n" + 
				 
				"If any doubts you need to ask Bindu immediately to for doubts.\r\n\n" + 
				 
				"@Mahesh :\r\n\n" + 
				"You need to study SutiDesk help document understand each and every page write the proper ISO documents.\r\n" +
				 
				"Please plan accordingly.\r\n" + 
				"\r\n" + 
				
				"Thanks\r\n" + 
				"\r\n" + 
				"Sudheer P");
		
		
		Transport.send(message);

		System.out.println("sent success...('_')");
	}

	public static void main(String[] args) {
		try {
			new MailDemo2();
		} catch (MessagingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
