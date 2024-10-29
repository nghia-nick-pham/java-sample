package java_mail;

//import com.sun.mail.smtp.SMTPTransport;
//
//import javax.mail.*;
//import javax.mail.internet.InternetAddress;
//import javax.mail.internet.MimeMessage;
import java.util.Date;
import java.util.Enumeration;
import java.util.Properties;

public class MainTestMail {

    private static final String SMTP_SERVER = "smtp.gmail.com";
    private static final String USERNAME = "sgboy4gl@gmail.com";
    private static final String PASSWORD = "123456aA@";

    private static final String EMAIL_FROM = "sgboy4gl@gmail.com";
//    private static final String EMAIL_TO = "sgboy4ggcl@gmail.com";
    private static final String EMAIL_TO = "FAKEADDR@FAKECODIX.EU";
//    private static final String EMAIL_BOUNCE = "sgboy8x@gmail.com";
    private static final String EMAIL_TO_CC = "";


    private static final String EMAIL_SUBJECT = "Test Send Email via SMTP";
    private static final String EMAIL_TEXT = "Hello Java Mail \n ABC123";

    public static void main(String[] args) {
//        sendEmailSMTP   ();
//        showAllHeader   ();
    }

//    private static void sendEmailSMTP(){
//
//        Properties prop = System.getProperties();
//        // for example, smtp.mailgun.org
//
//
//        prop.put("mail.smtp.host", SMTP_SERVER); //optional, defined in SMTPTransport
//        prop.put("mail.smtp.auth", "true");
//        prop.put("mail.smtp.port", "587"); // default port 25
//        prop.put("mail.smtp.starttls.enable", "true"); //TLS
//        prop.put("mail.smtp.from", "sgboy8x@gmail.com");
//
//        Session session = Session.getInstance(prop, null);
//        Message msg = new MimeMessage(session);
//
//        try {
//
//            // from
//            msg.setFrom(new InternetAddress(EMAIL_FROM));
//
//            // to
//            msg.setRecipients(Message.RecipientType.TO,
//                    InternetAddress.parse(EMAIL_TO, false));
//
//            // cc
//            msg.setRecipients(Message.RecipientType.CC,
//                    InternetAddress.parse(EMAIL_TO_CC, false));
//
//            // subject
//            msg.setSubject(EMAIL_SUBJECT);
//
//            // content
//            msg.setText(EMAIL_TEXT);
//
//            msg.setSentDate(new Date());
//
//            // Get SMTPTransport
//            SMTPTransport t = (SMTPTransport) session.getTransport("smtp");
//
//            // connect
//            t.connect(SMTP_SERVER, USERNAME, PASSWORD);
//
//            // send
//            t.sendMessage(msg, msg.getAllRecipients());
//
//            System.out.println("Response: " + t.getLastServerResponse());
//
//            t.close();
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//    private static void showAllHeader(){
//        String host = SMTP_SERVER;
//        String user = USERNAME;
//        String password = PASSWORD;
//        try {
//            // Get system properties
//            Properties properties = System.getProperties();
//
//            // Get the default Session object.
//            Session session = Session.getDefaultInstance(properties);
//
//            // Get a Store object that implements the specified protocol.
//            Store store = session.getStore("pop3");
//
//            //Connect to the current host using the specified username and password.
//            store.connect(host, user, password);
//
//            //Create a Folder object corresponding to the given name.
//            Folder folder = store.getFolder("inbox");
//
//            // Open the Folder.
//            folder.open(Folder.READ_ONLY);
//
//            Message[] messages = folder.getMessages();
//            for (int i = 0; i < messages.length; i++) {
//                System.out.println("------------ Message " + (i + 1) + " ------------");
//                // Here's the difference...
//                Enumeration headers = messages[i].getAllHeaders();
//                while (headers.hasMoreElements()) {
//                    Header h = (Header) headers.nextElement();
//                    System.out.println(h.getName() + ": " + h.getValue());
//                }
//                System.out.println();
//            }
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//    }



}


