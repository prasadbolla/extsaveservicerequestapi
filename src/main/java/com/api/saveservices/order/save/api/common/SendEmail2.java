
package com.api.saveservices.order.save.api.common;
// File Name SendEmail.java

import java.util.*;
import javax.mail.*;
import javax.mail.Message.RecipientType;
import javax.mail.internet.*;
import javax.activation.*;

public class SendEmail2 {

   public static void main(String [] args) {    
      // Recipient's email ID needs to be mentioned.
      String to = "venuamancha@outlook.com";

      // Sender's email ID needs to be mentioned
      String from = "prasadbolla@venuamanchaoutlook.onmicrosoft.com";

      // Assuming you are sending email from localhost
      String host = "localhost";

      // Get system properties
      Properties properties = System.getProperties();

      // Setup mail server
      properties.setProperty("mail.smtp.host", host);

      // Get the default Session object.
      Session session = Session.getDefaultInstance(properties);

      try {
         // Create a default MimeMessage object.
         MimeMessage message = new MimeMessage(session);

         // Set From: header field of the header.
         message.setFrom(new InternetAddress(from));

         // Set To: header field of the header.
         message.addRecipient(RecipientType.TO, new InternetAddress(to));

         // Set Subject: header field
         message.setSubject("Test Mail");

         // Now set the actual message
         message.setText("This body");

         // Send message
         Transport.send(message);
         System.out.println("Sent message successfully....");
      } catch (MessagingException mex) {
         mex.printStackTrace();
      }
   }
}