package java_mail.apache_simple;

import java_mail.tls_ssl.Const;
import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.SimpleEmail;

public class Sendmail {
    public static void main(String[] args) throws Exception{
        // {FROM [0], TO [1], HOST [2], PORT [3], SSL_PROTOCOL [4], USERNAME [5], PWD [6]}
        final String smtpInfos[][] = {
                {"your_email@outlook.com", "your_email@outlook.com", "smtp.office365.com", "587", "TLSv1.2", "your_email@outlook.com", "your email password"},
                {"nvpham@codix.eu", "nvpham@codix.eu", "smtp.office365.com", "587", "TLSv1.2", "nvpham@codix.eu", Const.pwd},
        };
        final int infoIndex = 1;
        String from = smtpInfos[infoIndex][0];
        String to = smtpInfos[infoIndex][1];
        String host = smtpInfos[infoIndex][2];
        String port = smtpInfos[infoIndex][3];
        String sslProtocol = smtpInfos[infoIndex][4];
        String username = smtpInfos[infoIndex][5];
        String password = smtpInfos[infoIndex][6];

        SimpleEmail email = new SimpleEmail();
        email.setHostName(host);
        email.setFrom(from);
        email.setSmtpPort(587);
        System.out.println("port: " + port);
        email.setAuthentication(username, password);
//        email.setAuthenticator(new DefaultAuthenticator(username, password));
//        email.setSSLOnConnect(true);
//        email.set
        email.setStartTLSEnabled(true);
        email.setSubject("TestMail");
        email.setMsg("This is a test mail ... :-)");
        email.addTo(to);
        email.send();
    }
}
