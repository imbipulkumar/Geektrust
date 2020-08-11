package in.geektrust.tameofthrones.seasarcipher;

/**
* Interface for Seasar Cipher.
* 
*/
public interface SeasarCipher {

    /**
    * Decrypt the secret message using the secret key.
    * @param secretMsg secret message sent by King Shan.
    * @param secretKey secret key to decrypt the secret message.
    * @return decrypted message.
    *
    */
    String decrypt(String secretMsg, int secretKey);
    
}