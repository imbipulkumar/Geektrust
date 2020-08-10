package in.geektrust.tameofthrones.kingdom;

public class UniverseOfSoutheros {
    
    public static class SpaceKingdom extends Kingdom {

        private static final String KINGDOM = "SPACE";
        private static final String EMBLEM = "GORILLA";
        private static final int SECRET_KEY = 7;
    
        @Override
        public String getKINGDOM() {
            return KINGDOM;
        }

        @Override
        public String getEMBLEM() {
            return EMBLEM;
        }
    
        @Override
        public int getSECRET_KEY() {
            return SECRET_KEY;
        }
    
        public SpaceKingdom(String secretMsg) {
            super(secretMsg);
        }
        
    }

    public static class LandKingdom extends Kingdom {

        private static final String KINGDOM = "LAND";
        private static final String EMBLEM = "PANDA";
        private static final int SECRET_KEY = 5;
    
        @Override
        public String getKINGDOM() {
            return KINGDOM;
        }

        @Override
        public String getEMBLEM() {
            return EMBLEM;
        }
    
        @Override
        public int getSECRET_KEY() {
            return SECRET_KEY;
        }
        
        public LandKingdom(String secretMsg) {
            super(secretMsg);
        }
        
    }

    public static class WaterKingdom extends Kingdom {

        private static final String KINGDOM = "WATER";
        private static final String EMBLEM = "OCTOPUS";
        private static final int SECRET_KEY = 7;
    
        @Override
        public String getKINGDOM() {
            return KINGDOM;
        }

        @Override
        public String getEMBLEM() {
            return EMBLEM;
        }
    
        @Override
        public int getSECRET_KEY() {
            return SECRET_KEY;
        }
        
        public WaterKingdom(String secretMsg) {
            super(secretMsg);
        }
        
    }

    public static class IceKingdom extends Kingdom {

        private static final String KINGDOM = "ICE";
        private static final String EMBLEM = "MAMMOTH";
        private static final int SECRET_KEY = 7;
    
        @Override
        public String getKINGDOM() {
            return KINGDOM;
        }

        @Override
        public String getEMBLEM() {
            return EMBLEM;
        }
    
        @Override
        public int getSECRET_KEY() {
            return SECRET_KEY;
        }
        
        public IceKingdom(String secretMsg) {
            super(secretMsg);
        }
    
    }

    public static class AirKingdom extends Kingdom {

        private static final String KINGDOM = "AIR";
        private static final String EMBLEM = "OWL";
        private static final int SECRET_KEY = 3;
    
        @Override
        public String getKINGDOM() {
            return KINGDOM;
        }

        @Override
        public String getEMBLEM() {
            return EMBLEM;
        }
    
        @Override
        public int getSECRET_KEY() {
            return SECRET_KEY;
        }
    
        public AirKingdom(String secretMsg) {
            super(secretMsg);
        }
        
    }

    public static class FireKingdom extends Kingdom {

        private static final String KINGDOM = "FIRE";
        private static final String EMBLEM = "DRAGON";
        private static final int SECRET_KEY = 6;
    
        @Override
        public String getKINGDOM() {
            return KINGDOM;
        }

        @Override
        public String getEMBLEM() {
            return EMBLEM;
        }
    
        @Override
        public int getSECRET_KEY() {
            return SECRET_KEY;
        }
    
        public FireKingdom(String secretMsg) {
            super(secretMsg);
        }
        
    }

}