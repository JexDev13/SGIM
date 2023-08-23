package Negocio;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Base64;

/*
 * @authors G2 SoftwareSolutions
 */
public class Validaciones {

    public static String generateSalt() {
        SecureRandom random = new SecureRandom();
        byte[] salt = new byte[16];
        random.nextBytes(salt);
        return Base64.getEncoder().encodeToString(salt);
    }

    public static String hashPassword(String password, String salt) {
        String hashedPassword = null;
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            md.update(salt.getBytes(StandardCharsets.UTF_8));
            byte[] bytes = md.digest(password.getBytes(StandardCharsets.UTF_8));
            StringBuilder sb = new StringBuilder();
            for (byte b : bytes) {
                sb.append(String.format("%02x", b));
            }
            hashedPassword = sb.toString();
        } catch (NoSuchAlgorithmException ex) {
            // Handle exception
        }
        return hashedPassword;
    }

    public static boolean verifyPassword(String inputPassword, String hashedPassword, String salt) {
        String newHashedPassword = hashPassword(inputPassword, salt);
        return newHashedPassword.equals(hashedPassword);
    }
}
