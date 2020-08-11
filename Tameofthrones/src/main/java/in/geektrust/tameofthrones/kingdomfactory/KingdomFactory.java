package in.geektrust.tameofthrones.kingdomfactory;

import in.geektrust.tameofthrones.kingdom.Kingdom;
import in.geektrust.tameofthrones.kingdom.UniverseOfSoutheros;

/**
* Factory class KingdomFactory creates the objects of 
* concrete classes extending Kingdom abstarct class.
* 
*/
public class KingdomFactory {
    
    public static Kingdom getKingdom(String kingdom, String secretMsg) {

        if (kingdom == null) {
            return null;
        }

        if (kingdom.equalsIgnoreCase("SPACE")) {
            return new UniverseOfSoutheros.SpaceKingdom(secretMsg);
        }

        if (kingdom.equalsIgnoreCase("LAND")) {
            return new UniverseOfSoutheros.LandKingdom(secretMsg);
        }

        if (kingdom.equalsIgnoreCase("WATER")) {
            return new UniverseOfSoutheros.WaterKingdom(secretMsg);
        }

        if (kingdom.equalsIgnoreCase("ICE")) {
            return new UniverseOfSoutheros.IceKingdom(secretMsg);
        }

        if (kingdom.equalsIgnoreCase("AIR")) {
            return new UniverseOfSoutheros.AirKingdom(secretMsg);
        }

        if (kingdom.equalsIgnoreCase("FIRE")) {
            return new UniverseOfSoutheros.FireKingdom(secretMsg);
        }

        return null;
    }
}