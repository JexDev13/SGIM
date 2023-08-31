package Negocio;

import java.io.InputStream;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;


/*
 * @authors G2 SoftwareSolutions
 */
public class Correo {

    Properties props;
    MimeMessage mail;
    Session sesion;

    public int enviarCorreos(String mensaje, String destinatario) {

        try (InputStream input = getClass().getResourceAsStream("/db.properties")) {

            props = new Properties();

            props.load(input);
            String remitente = props.getProperty("db.userCorreo");
            String password = props.getProperty("db.passCorreo");
            
            props.put("mail.smtp.host", "smtp.gmail.com");
            props.put("mail.smtp.ssl.trust", "smtp.gmail.com");
            props.put("mail.smtp.port", "587");
            props.setProperty("mail.smtp.starttls.enable", "true");
            props.setProperty("mail.smtp.port", "587");
            props.setProperty("mail.smtp.user", remitente);
            props.setProperty("mail.smtp.ssl.protocols", "TLSv1.2");
            props.setProperty("mail.smtp.auth", "true");

            sesion = Session.getDefaultInstance(props);
            mail = new MimeMessage(sesion);

            mail.setFrom(new InternetAddress(remitente, "Servicio técnico Mousai"));
            mail.addRecipient(Message.RecipientType.TO, new InternetAddress(destinatario));
            mail.setSubject("Recuperacion de usuario o contraseña");
            mail.setText(mensaje, "ISO-8859-1", "html");

            Transport transporte = sesion.getTransport("smtp");
            transporte.connect(remitente, password);
            transporte.sendMessage(mail, mail.getRecipients(Message.RecipientType.TO));
            transporte.close();

            return 1;

        } catch (Exception ex) {
            System.out.println(ex);
        }
        return 0;
    }
}
