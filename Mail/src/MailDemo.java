import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
public class MailDemo {

	public MailDemo() {
		String to="bindub@ibt.example.com"; //reciver address
		Properties properties = new Properties();
		String host="192.168.0.22";
		properties.put("mail.smtp.host" , host);
		//properties.put("mail.smtp.auth", "true");
		properties.setProperty("mail.smtp.port", "25");
		properties.put("mail.smtp.starttls.enable", "true");
		/*Session session = Session.getDefaultInstance(properties,new Authenticator() {
			@Override
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication("satyamtihiya@gmail.com","dhananjay292");
			}
		});
		
*/		
		Session session = Session.getInstance(properties);
		
		try {
			MimeMessage message = new MimeMessage(session);
			message.setFrom(new InternetAddress("dhananjayp@ibt.example.com"));
			message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
			message.setSubject("Hello");
			message.setText("This is testing of java application using java mail api");
			Transport.send(message);
			System.out.println("Mail sended...!");
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		
		new MailDemo();
	}

}
