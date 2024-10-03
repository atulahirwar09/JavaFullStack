package com.mail;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.MimeMessage;

public class Mail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Properties props=new Properties();
		props.put("mail.transport.protocol","smtp");
        props.put("mail.smtp.host", "smtp-mail.outlook.com");
        props.put("mail.smtp.port", 587);
        props.put("mail.smtp.auth","true");
        props.put("mail.smtp.starttls.enable","true");
		
		Session session=Session.getInstance(props,new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				//enter you email and app password
				return new PasswordAuthentication("atulraftaar09@outlook.com","Atul@1234");
				
			}
		});
		
		try {
			
	        MimeMessage message = new MimeMessage(session);
			
            message.setFrom("atulraftaar09@outlook.com");
            message.setRecipients(Message.RecipientType.TO, "atulahirwar09@gmail.com");
            message.setSubject("This is to send the mail");
            message.setContent("This is the original message from java mail", "text/html");
            Transport.send(message);
        } catch(MessagingException e) {
            e.printStackTrace();
        } 

	}

}