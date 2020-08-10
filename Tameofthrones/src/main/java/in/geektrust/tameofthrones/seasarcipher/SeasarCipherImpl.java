package in.geektrust.tameofthrones.seasarcipher;

public class SeasarCipherImpl implements SeasarCipher {

    private static final SeasarCipherImpl INSTANCE = new SeasarCipherImpl();

    private SeasarCipherImpl() {
    }

    public static SeasarCipherImpl getSeasarCipher() {
        return INSTANCE;
    }

    @Override
    public String decrypt(String secretMsg, int secretKey) {
        
        String decryptedMsg = "";
        char c;
        int key;

        for (int i = 0; i < secretMsg.length(); ++i) {
            c = secretMsg.charAt(i);
            if (Character.isUpperCase(c)) {
                key = (c - 'A' - secretKey) % 26;
                if (key < 0) {
                    decryptedMsg += (char) ('Z' + 1 + key);
                } else {
                    decryptedMsg += (char) ('A' + key);
                }
            } else {
                key = (c - 'a' - secretKey) % 26;
                if (secretKey < 0) {
                    decryptedMsg += (char) ('z' + 1 + key);
                } else {
                    decryptedMsg += (char) ('a' + key);
                }
            }
            
        }

        return decryptedMsg;
    }

}