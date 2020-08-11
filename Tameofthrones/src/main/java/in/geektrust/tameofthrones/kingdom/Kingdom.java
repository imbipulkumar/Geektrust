package in.geektrust.tameofthrones.kingdom;

/**
* Abstract class for Kingdom.
* 
*/
public abstract class Kingdom {

    /**
    * Secret message received from King Shan.
    */
    private String secretMsg;

    public void setSecretMsg(String secretMsg) {
        this.secretMsg = secretMsg.toUpperCase();
    }

    public String getSecretMsg() {
        return secretMsg;
    }

    public abstract String getKINGDOM();

    public abstract String getEMBLEM();
    
    public abstract int getSECRET_KEY();

    Kingdom(String secretMsg) {
        setSecretMsg(secretMsg);
    }

}