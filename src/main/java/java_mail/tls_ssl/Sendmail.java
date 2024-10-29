package java_mail.tls_ssl;

//import javax.mail.*;
//import javax.mail.internet.InternetAddress;
//import javax.mail.internet.MimeMessage;
//import java.util.Properties;

public class Sendmail {
//    public static void main(String[] args) {
//        // {FROM [0], TO [1], HOST [2], PORT [3], SSL_PROTOCOL [4], USERNAME [5], PWD [6]}
//        final String smtpInfos[][] = {
//                {"your_email@outlook.com", "your_email@outlook.com", "smtp.office365.com", "587", "TLSv1.2", "your_email@outlook.com", "your email password"},
//                {"nvpham@codix.eu", "nvpham@codix.eu", "smtp.office365.com", "587", "TLSv1.2", "nvpham@codix.eu", Const.pwd},
//        };
//        final int infoIndex = 1;
//        String from = smtpInfos[infoIndex][0];
//        String to = smtpInfos[infoIndex][1];
//        String host = smtpInfos[infoIndex][2];
//        String port = smtpInfos[infoIndex][3];
//        String sslProtocol = smtpInfos[infoIndex][4];
//
//
//        // TLS v1.2 properties
//        Properties props = new Properties();
//        props.put("mail.smtp.auth", "true");
//        props.put("mail.smtp.host", host);
//        props.put("mail.smtp.port", port);
//        props.put("mail.smtp.starttls.enable", "true");
//        props.put("mail.smtps.ssl.protocols", sslProtocol);
//
//        // Get the Session object.
//        Session session = Session.getInstance(props, new Authenticator() {
//            String username = smtpInfos[infoIndex][5];
//            String password = smtpInfos[infoIndex][6];
//            protected PasswordAuthentication getPasswordAuthentication() {
//                return new PasswordAuthentication(username, password);
//            }
//        });
//
//        try {
//            Message message = new MimeMessage(session);
//            message.setFrom(new InternetAddress(from));
//            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));
//            message.setSubject("Testing TLS v1.2 with Java Mail API");
//            message.setText("Hello, this is a test message.");
//            Transport.send(message);
//
//            System.out.println("Sent message successfully....");
//
//        } catch (MessagingException e) {
//            throw new RuntimeException(e);
//        }
//    }
}
