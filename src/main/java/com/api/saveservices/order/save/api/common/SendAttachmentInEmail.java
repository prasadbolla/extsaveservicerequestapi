/*
 * package com.api.saveservices.order.save.api.common;
 * 
 * import java.util.Date; import java.util.Properties; import
 * javax.mail.Authenticator; import javax.mail.Message; import
 * javax.mail.MessagingException; import javax.mail.PasswordAuthentication;
 * import javax.mail.Session; import javax.mail.Transport; import
 * javax.mail.internet.InternetAddress; import javax.mail.internet.MimeMessage;
 * 
 * public class SendAttachmentInEmail {
 * 
 * 
 * private static final String SERVIDOR_SMTP = "smtp.live.com"; private static
 * final int PORTA_SERVIDOR_SMTP = 587; private static final String CONTA_PADRAO
 * = "prasadbolla@venuamanchaoutlook.onmicrosoft.com"; //Cofig Mail Id private
 * static final String SENHA_CONTA_PADRAO = "Anitha@143"; // Password
 * 
 * private final String from = "prasadbolla@venuamanchaoutlook.onmicrosoft.com";
 * private final String to = "venuamancha@outlook.com";
 * 
 * private final String subject = "Teste"; private final String messageContent =
 * "Teste de Mensagem";
 * 
 * public void sendEmail() { final Session session =
 * Session.getInstance(this.getEmailProperties(), new Authenticator() {
 * 
 * @Override protected PasswordAuthentication getPasswordAuthentication() {
 * return new PasswordAuthentication(CONTA_PADRAO, SENHA_CONTA_PADRAO); }
 * 
 * }); ///////////
 * 
 * Properties props = null; if (props == null) { props = new Properties();
 * props.put("mail.smtp.auth", true); props.put("mail.smtp.starttls.enable",
 * true); props.put("mail.smtp.host", "smtp.live.com");
 * props.put("mail.smtp.port", "587"); props.put("mail.smtp.user",
 * CONTA_PADRAO); props.put("mail.smtp.pwd", SENHA_CONTA_PADRAO); } Session
 * session1 = Session.getInstance(props, null); session1.setDebug(true); Message
 * msg = new MimeMessage(session1); msg.setFrom(new InternetAddress(User)); if
 * (Objet != null) { msg.setSubject(Objet);
 * 
 * } msg.setText(Content); msg.setRecipient(Message.RecipientType.TO, new
 * InternetAddress(to)); Transport transport = session.getTransport("smtp");
 * transport.connect("smtp.live.com", 587, CONTA_PADRAO, SENHA_CONTA_PADRAO);
 * transport.sendMessage(msg, msg.getAllRecipients());
 * System.out.println("Mail sent successfully at " + to); transport.close();
 * 
 * //////////////
 * 
 * try { final Message message = new MimeMessage(session);
 * message.setRecipient(Message.RecipientType.TO, new InternetAddress(to));
 * message.setFrom(new InternetAddress(from)); message.setSubject(subject);
 * message.setText(messageContent); message.setSentDate(new Date());
 * Transport.send(message); } catch (final MessagingException ex) {
 * System.out.println(" "+ex); } }
 * 
 * public Properties getEmailProperties() { final Properties config = new
 * Properties(); config.put("mail.smtp.auth", "true");
 * config.put("mail.smtp.starttls.enable", "true"); config.put("mail.smtp.host",
 * SERVIDOR_SMTP); config.put("mail.smtp.port", PORTA_SERVIDOR_SMTP);
 * 
 * 
 * 
 * return config; }
 * 
 * public static void main(final String[] args) { new
 * SendAttachmentInEmail().sendEmail(); }
 * 
 * }
 */