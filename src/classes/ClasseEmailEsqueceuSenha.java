
package classes;

import java.util.Properties;
import javax.mail.Address;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;
import org.apache.commons.mail.EmailException;


public class ClasseEmailEsqueceuSenha {
    
    private String sender = "artthur.nunes@gmail.com";
    private String pwd = "barreto25";
    private String destino = "artthur.nunes@gmail.com";
    private String assunto;
    private String msg;
    private Properties props = new Properties();
    
    String getSender(){
        return this.sender;
    }
    String getPwd(){
        return this.pwd;
    }
    String getDestino(){
        return this.destino;
    }
    String getAssunto(){
        return this.assunto;
    }
    String getMessage(){
        return this.msg;
    }
    public void setSender(String sender){
        this.sender = sender;
    }
    public void setPwd(String pwd){
        this.pwd = pwd;
    }
    public void setDestino(String destino) {
        this.destino = destino;
    }
    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
    
    public void sendMail() throws EmailException{
        
        //props.put("mail.transport.protocol","smtp");
        props.put("mail.smtp.host","smtp.gmail.com");
        props.put("mail.smtp.auth","true");
        props.put("mail.smtp.port","587");
        props.put("mail.smtp.starttls.enable","true");
        //props.put("mail.smtp.user", from);
        //props.put("mail.debug","true");
        //props.put("mail.smtp.socketFactory.port", "587");
        //props.put("mail.smtp.socketFactory.class","javax.net.ssl.SSLSocketFactory");
        //props.put("mail.smtp.socketFactory.fallback","false");
        
                
        Session session = Session.getDefaultInstance(props, new javax.mail.Authenticator(){
           @Override
           protected PasswordAuthentication getPasswordAuthentication(){
               return new PasswordAuthentication(getSender(), getPwd());
           }
        });
        
        session.setDebug(true);

        try{
            Message message = new MimeMessage(session);
            Address[] toUser = InternetAddress.parse(destino);
            message.setRecipients(Message.RecipientType.TO,toUser);           
            message.setSubject(assunto);
            message.setContent(msg,"text/html");
            Transport.send(message);
            
        }catch(MessagingException e){
            JOptionPane.showMessageDialog(null,"Erro ao enviar mensagem"+e.getCause());
        }  
    }
}

