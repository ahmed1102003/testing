package secondCCRX.secondCCRX;

import java.io.File;
import java.io.IOException;
import java.util.Properties;

import javax.mail.FetchProfile;
import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.NoSuchProviderException;
import javax.mail.Provider;
import javax.mail.Session;
import javax.mail.Store;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;


public class EmailCount {
	public static int messageCount;

	public static void main(String[] args) throws IOException, MessagingException {
		System.out.println(emailCount());
	}

	public static int emailCount() throws IOException, MessagingException {


		String host = "pop.gmail.com";

		Properties properties = System.getProperties();

		 properties.put("mail.pop3.host", host);
	      properties.put("mail.pop3.port", "995");
	      properties.put("mail.pop3.starttls.enable", "true");
	      Session emailSession = Session.getDefaultInstance(properties);
	   
	      //create the POP3 store object and connect with the pop server
	      Store store = emailSession.getStore("pop3s");
	      
	      store.connect(host, "qatester0217", "");

	      //create the folder object and open it
	      Folder emailFolder = store.getFolder("INBOX");
	      emailFolder.open(Folder.READ_ONLY);
	     // int messageCount; // the same code is working fine at work but when i copy it here i go this error 
			
	      messageCount = emailFolder.getMessageCount();
			return messageCount;					
	}

}