package in.geektrust.tameofthrones.kingdom;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class KingdomTest {

    private static final String SECRET_MSG_IN_UPPER_CASE = "AJXGAMUTA";
    private static final String SECRET_MSG_IN_LOWER_CASE = "ajxgamuta";

    public class DummyKingdomExtend extends Kingdom {

        @Override
        public String getKINGDOM() {
            return null;
        }

        @Override
        public String getEMBLEM() {
            return null;
        }

        @Override
        public int getSECRET_KEY() {
            return 0;
        }
        
        DummyKingdomExtend(String secretMsg) {
            super(secretMsg);
        }
    }

    @Test
    public void setGetSecretMsgTest() {
        Kingdom dummyKingdomExtend = new DummyKingdomExtend(SECRET_MSG_IN_UPPER_CASE);
        assertEquals(SECRET_MSG_IN_UPPER_CASE, dummyKingdomExtend.getSecretMsg());
    }

    @Test
    public void setGetSecretMsgTestToUpperCase() {
        Kingdom dummyKingdomExtend = new DummyKingdomExtend(SECRET_MSG_IN_LOWER_CASE);
        assertEquals(SECRET_MSG_IN_UPPER_CASE, dummyKingdomExtend.getSecretMsg());
    }

}