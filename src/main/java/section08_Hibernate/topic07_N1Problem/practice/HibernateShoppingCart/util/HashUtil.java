package section08_Hibernate.topic07_N1Problem.practice.HibernateShoppingCart.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

public class HashUtil {
    private static final String HASH_ALGORITHM = "SHA-512";

    private HashUtil() {
    }

    public static String hashPassword(String password, byte[] salt) {
        StringBuilder hashedPassword = new StringBuilder();
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(HASH_ALGORITHM);
            messageDigest.update(salt);
            byte[] symbols = messageDigest.digest(password.getBytes());
            for (byte symbol : symbols) {
                hashedPassword.append(String.format("%02x", symbol));
            }
            return hashedPassword.toString();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("Can't hash password!", e);
        }
    }

    public static byte[] getSalt() {
        SecureRandom random = new SecureRandom();
        byte[] salt = new byte[16];
        random.nextBytes(salt);
        return salt;
    }
}
