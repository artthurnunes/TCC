
package classes;

import java.util.Date;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;

public class ClasseEnviarEmail extends ClasseEsqueceuSenha {
    
    private static String to; // "artthur.nunes@outlook.com";
    private static String messageText; // "test test test";
    private static String subject ; //assunto do email

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getMessageText() {
        return messageText;
    }

    public void setMessageText(String messageText) {
        this.messageText = messageText;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
    
    public void enviarEmail(){
        try{
            String host ="smtp.gmail.com" ;
            String user = "ruthrasoftware@gmail.com";
            String from = "artthur.nunes@gmail.com";
            String pass = "ruthra2018";
            boolean sessionDebug = false;
            
            Properties props = System.getProperties();
            
            props.put("mail.smtp.starttls.enable", "true");
            props.put("mail.smtp.host", host);
            props.put("mail.smtp.port", "587");
            props.put("mail.smtp.auth", "true");
            props.put("mail.smtp.starttls.required", "true");

            java.security.Security.addProvider(new com.sun.net.ssl.internal.ssl.Provider());
            Session mailSession = Session.getDefaultInstance(props, null);
            mailSession.setDebug(sessionDebug);
            Message msg = new MimeMessage(mailSession);
            msg.setFrom(new InternetAddress(from));
            InternetAddress[] address = {new InternetAddress(to)};
            msg.setRecipients(Message.RecipientType.TO, address);
            msg.setSubject(subject); msg.setSentDate(new Date());
            msg.setText(messageText);

           Transport transport=mailSession.getTransport("smtp");
           transport.connect(host, user, pass);
           transport.sendMessage(msg, msg.getAllRecipients());
           transport.close();
           //System.out.println("message send successfully");
           
        }catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, "Erro ao enviar email :"+ex);
        }
    }
}
