package in.geektrust.tameofthrones.kingdomfactory;

import in.geektrust.tameofthrones.kingdom.Kingdom;
import in.geektrust.tameofthrones.kingdom.UniverseOfSoutheros.SpaceKingdom;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class KingdomFactoryTest {
    
    private String KINGDOM = "SPACE";
    private String SECRET_MSG = "SPPPAPCPEP";

    @Test
    public void getKingdomTest() {

        Kingdom kingdom = KingdomFactory.getKingdom(KINGDOM, SECRET_MSG);
        assertTrue(kingdom instanceof SpaceKingdom);

        Kingdom kingdom2 = KingdomFactory.getKingdom(null, null);
        assertFalse(kingdom2 instanceof SpaceKingdom);
        
    }
}