package com.api.saveservices.order.save.api.common;
import java.io.IOException;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class SendMail {

    public static void main(String[]args) throws IOException {

        final String username = "prasadbolla@venuamanchaoutlook.onmicrosoft.com";
        final String password = "Anitha@143";

        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "outlook.office365.com");
        props.put("mail.smtp.port", "587");

        Session session = Session.getInstance(props,
          new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
          });

        try {

            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress("prasadbolla@venuamanchaoutlook.onmicrosoft.com"));
            message.setRecipients(Message.RecipientType.TO,
                InternetAddress.parse("venuamancha@outlook.com"));
            message.setSubject("Test Email");
            message.setText("Test Message Body");

            Transport.send(message);

            System.out.println("Done");

        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
    }
}