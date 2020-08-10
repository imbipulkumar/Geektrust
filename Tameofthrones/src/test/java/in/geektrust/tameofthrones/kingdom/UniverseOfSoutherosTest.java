package in.geektrust.tameofthrones.kingdom;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class UniverseOfSoutherosTest {
    
    private static final String SECRET_MSG = "AJXGAMUTA";

    public static class SpaceKingdomTest {

        Kingdom spaceKingdom = new  UniverseOfSoutheros.SpaceKingdom(SECRET_MSG);
    
        @Test
        public void nameOfSpaceKingdomTest() {
            assertEquals("SPACE", spaceKingdom.getKINGDOM());
        }

        @Test
        public void emblemOfSpaceKingdomTest() {
            assertEquals("GORILLA", spaceKingdom.getEMBLEM());
        }
    
        @Test
        public void secretKeyOfSpaceKingdomTest() {
            assertEquals(7, spaceKingdom.getSECRET_KEY());
        }
        
    }

    public static class LandKingdomTest {
    
        Kingdom landKingdom = new  UniverseOfSoutheros.LandKingdom(SECRET_MSG);
    
        @Test
        public void nameOfLandKingdomTest() {
            assertEquals("LAND", landKingdom.getKINGDOM());
        }

        @Test
        public void emblemOfLandKingdomTest() {
            assertEquals("PANDA", landKingdom.getEMBLEM());
        }
    
        @Test
        public void secretKeyOfLandKingdomTest() {
            assertEquals(5, landKingdom.getSECRET_KEY());
        }
        
    }

    public static class WaterKingdomTest {
    
        Kingdom waterKingdom = new  UniverseOfSoutheros.WaterKingdom(SECRET_MSG);
    
        @Test
        public void nameOfWaterKingdomTest() {
            assertEquals("WATER", waterKingdom.getKINGDOM());
        }

        @Test
        public void emblemOfWaterKingdomTest() {
            assertEquals("OCTOPUS", waterKingdom.getEMBLEM());
        }
    
        @Test
        public void secretKeyOfWaterKingdomTest() {
            assertEquals(7, waterKingdom.getSECRET_KEY());
        }
        
    }

    public static class IceKingdomTest {
    
        Kingdom iceKingdom = new  UniverseOfSoutheros.IceKingdom(SECRET_MSG);
    
        @Test
        public void nameOfIceKingdomTest() {
            assertEquals("ICE", iceKingdom.getKINGDOM());
        }

        @Test
        public void emblemOfIceKingdomTest() {
            assertEquals("MAMMOTH", iceKingdom.getEMBLEM());
        }
    
        @Test
        public void secretKeyOfIceKingdomTest() {
            assertEquals(7, iceKingdom.getSECRET_KEY());
        }
    
    }

    public static class AirKingdomTest {

        Kingdom airKingdom = new  UniverseOfSoutheros.AirKingdom(SECRET_MSG);
    
        @Test
        public void nameOfAirKingdomTest() {
            assertEquals("AIR", airKingdom.getKINGDOM());
        }

        @Test
        public void emblemOfAirKingdomTest() {
            assertEquals("OWL", airKingdom.getEMBLEM());
        }
    
        @Test
        public void secretKeyOfAirKingdomTest() {
            assertEquals(3, airKingdom.getSECRET_KEY());
        }
        
    }

    public static class FireKingdomTest {
        
        Kingdom fireKingdom = new  UniverseOfSoutheros.FireKingdom(SECRET_MSG);
    
        @Test
        public void nameOfFireKingdomTest() {
            assertEquals("FIRE", fireKingdom.getKINGDOM());
        }

        @Test
        public void emblemOfFireKingdomTest() {
            assertEquals("DRAGON", fireKingdom.getEMBLEM());
        }
    
        @Test
        public void secretKeyOfFireKingdomTest() {
            assertEquals(6, fireKingdom.getSECRET_KEY());
        }
        
    }

}