package in.geektrust.tameofthrones.kingdom;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class KingdomTest {

    private String kingdomName = "LAND";
    private String emblem = "PANDA";
    private String secretMsg = "AJXGAMUTA";

    Kingdom kingdom = new Kingdom(kingdomName, emblem, secretMsg);

    @Test
    public void getKingdomTest() {
        assertEquals(kingdomName, kingdom.getKingdom());
    }

    @Test
    public void getEmblemTest() {
        assertEquals(emblem, kingdom.getEmblem());
    }

    @Test
    public void getSecretMsgTest() {
        assertEquals(secretMsg, kingdom.getSecretMsg());
    }

}