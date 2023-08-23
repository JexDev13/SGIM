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

    public int recuperarUsuario(String tipo, String resultado, String destinatario) {

        try (InputStream input = getClass().getResourceAsStream("/db.properties")) {

            props = new Properties();

            props.load(input);
            String remitente = props.getProperty("db.userCorreo");
            String password = props.getProperty("db.passCorreo");
            if (tipo.equalsIgnoreCase("contrasena")) {
                tipo = "contraseña";
            } else {
                tipo = "usuario";
            }

            String mensaje = "<html><body style=\"text-align:center;\">"
                    + "<h1 style=\"font-size:32px;color:rgb(250,183,22);\">Sistema de Gestión e Inventario Mousai-SGIM</h1>"
                    + "<p style=\"font-size:24px;\">Recuperación de " + tipo + ": <strong>" + resultado + "</strong></p>"
                    + "<p style=\"font-size:16px;color:gray;\">Si usted no generó este mensaje, cambie su contraseña inmediatamente.</p>"
                    + "</body></html>";

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
