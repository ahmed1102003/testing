package secondCCRX.secondCCRX;

import java.io.IOException;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class Send10EmailsFor171717 {
	public static void main(String[] args) throws IOException {
		sendEmail(args[0]);
	}

	public static void sendEmail(String subject) throws IOException {
		String sender = "qatester171717@gmail.com";
		String password = "";
		String receiver = "qatester171717@gmail.com";

		String host = "smtp.gmail.com";

		Properties properties = System.getProperties();

		properties.put("mail.smtp.starttls.enable", "true");
		properties.put("mail.smtp.host", host);
		properties.put("mail.smtp.user", sender);
		properties.put("mail.smtp.password", password);
		properties.put("mail.smtp.port", "587");
		properties.put("mail.smtp.auth", "true");

		Session session = Session.getDefaultInstance(properties);

		try {
			MimeMessage message = new MimeMessage(session);
			message.setFrom(new InternetAddress(sender));
			message.addRecipient(Message.RecipientType.TO, new InternetAddress(receiver));
			message.setSubject(subject);
			message.setText("Send Test: Message");

			Transport transport = session.getTransport("smtp");
			transport.connect(host, sender, password);
			transport.sendMessage(message, message.getAllRecipients());
			transport.close();
			System.out.println("Success sending an email to gmail account");
		} catch (MessagingException e) {
			e.printStackTrace();
		}
	}
}