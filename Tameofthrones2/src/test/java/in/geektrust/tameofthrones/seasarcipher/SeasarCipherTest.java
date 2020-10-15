package in.geektrust.tameofthrones.seasarcipher;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SeasarCipherTest {

    private String secretMsg = "vHfUhWpVjIruWhVw";
    private String decryptedSecretMsg = "sEcReTmSgForTeSt";
    private String returnedDecryptedSecretMsg;
    private int secretKey = 3;
    private SeasarCipher instance = SeasarCipherImpl.getSeasarCipher();
    private SeasarCipher instance2 = SeasarCipherImpl.getSeasarCipher();

    @Test
    public void seasarCipherSingletonClassTest() {
        assertEquals(instance.hashCode(), instance2.hashCode());
    }

    @Test
    public void decryptTest() {
        returnedDecryptedSecretMsg = instance.decrypt(secretMsg, secretKey);
        assertEquals(decryptedSecretMsg, returnedDecryptedSecretMsg);
    }

}