package in.geektrust.tameofthrones.seasarcipher;

/**
 * Singleton concrete class implementing SeasarCipher interface.
 *
 */
public class SeasarCipherImpl implements SeasarCipher {

    private static final SeasarCipherImpl INSTANCE = new SeasarCipherImpl();

    private SeasarCipherImpl() {
    }

    public static SeasarCipherImpl getSeasarCipher() {
        return INSTANCE;
    }

    /**
     * Concrete method overriding decrypt method of the implementing interface.
     * Decrypt the secret message using the secret key.
     * 
     * @param secretMsg secret message sent by King Shan.
     * @param secretKey secret key to decrypt the secret message.
     * @return decrypted message.
     *
     */
    @Override
    public String decrypt(String secretMsg, int secretKey) {

        String decryptedMsg = "";
        char c;
        int key;

        for (int i = 0; i < secretMsg.length(); ++i) {
            c = secretMsg.charAt(i);
            if (Character.isLetter(c)) {
                if (Character.isUpperCase(c)) {
                    key = (c - 'A' - secretKey) % 26;
                    if (key < 0) {
                        decryptedMsg += (char) ('Z' + 1 + key);
                    } else {
                        decryptedMsg += (char) ('A' + key);
                    }
                } else {
                    key = (c - 'a' - secretKey) % 26;
                    if (key < 0) {
                        decryptedMsg += (char) ('z' + 1 + key);
                    } else {
                        decryptedMsg += (char) ('a' + key);
                    }
                }
            } else {
                decryptedMsg += c;
            }
        }

        return decryptedMsg;
    }

}