package in.geektrust.tameofthrones.agoldencrown;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import in.geektrust.tameofthrones.kingdom.Kingdom;
import in.geektrust.tameofthrones.seasarcipher.SeasarCipher;
import in.geektrust.tameofthrones.seasarcipher.SeasarCipherImpl;
import in.geektrust.tameofthrones.utils.FixtureHelpers;

/**
 * Concrete class implementing AGoldenCrown interface.
 * 
 */
public class AGoldenCrownImpl implements AGoldenCrown {

    /**
     * Number of kingdoms support needed by King Shan to be the ruler.
     */
    private final int WINS = 3;

    /**
     * Kingdoms allegiance to King Shan.
     */
    private HashMap<String, Kingdom> universeOfSoutheros;

    /**
     * Messages sent by King Shan to other kingdoms.
     */
    private List<ArrayList<String>> messages;

    /**
     * Kingdoms allegiance to King Shan.
     */
    private Set<String> allegiances;

    public AGoldenCrownImpl(String filepath) {
        universeOfSoutheros = FixtureHelpers.universeOfSoutheros("universeOfSoutheros.json");

        messages = FixtureHelpers.readInputFile(filepath);

        allegiances = new HashSet<String>();

        sendMessages();
    }

    /**
     * Checks if the secret message to a kingdom contains the kingdom emblem
     * 
     * @param secretMsg secret message sent to a kingdom.
     * @param emblem    emblem of a kingdom.
     * @return true if the secret message contains the emblem of the kingdom to
     *         which the secret message is sent and false otherwise.
     *
     */
    private boolean isContain(String secretMsg, String emblem) {
        HashMap<Character, Integer> charFreq = new HashMap<Character, Integer>();
        Character c;
        int i;
        for (i = 0; i < emblem.length(); ++i) {
            c = emblem.charAt(i);
            if (charFreq.containsKey(c)) {
                charFreq.put(c, charFreq.get(c) + 1);
            } else {
                charFreq.put(c, 1);
            }
        }
        i = 0;
        while (i < secretMsg.length() && !charFreq.isEmpty()) {
            c = secretMsg.charAt(i);
            if (charFreq.containsKey(c)) {
                charFreq.put(c, charFreq.get(c) - 1);
                if (charFreq.get(c) == 0) {
                    charFreq.remove(c);
                }
            }
            ++i;
        }
        return charFreq.isEmpty();
    }

    /**
     * Checks if a kingdom is allegient to King Shan.
     * 
     * @param kingdom a kingdom of Universe Of Southeros.
     * @return true if the kingdom is allegient to King Shan and false otherwise.
     *
     */
    private boolean isAllegiant(Kingdom kingdom) {
        SeasarCipher seasarcipher = SeasarCipherImpl.getSeasarCipher();
        String decryptedMsg = seasarcipher.decrypt(kingdom.getSecretMsg(), kingdom.getEmblem().length());
        if (isContain(decryptedMsg, kingdom.getEmblem())) {
            return true;
        }
        return false;
    }

    /**
     * Send secret messages of King Shan to their respective kingdoms.
     *
     */
    private void sendMessages() {
        for (ArrayList<String> message : messages) {
            if (!allegiances.contains(message.get(0))) {
                Kingdom kingdom = universeOfSoutheros.get(message.get(0));
                kingdom.setSecretMsg(message.get(1));
                if (isAllegiant(kingdom)) {
                    allegiances.add(message.get(0));
                }
            }
        }
    }

    /**
     * Concrete method overriding printRuler method of the implementing interface.
     * Output the Ruler and allies kingdoms.
     *
     */
    @Override
    public void printRuler() {
        if (allegiances.size() < WINS) {
            System.out.print("NONE");
        } else {
            System.out.print("SPACE ");
            for (String allegiance : allegiances) {
                System.out.print(allegiance + " ");
            }
        }
    }
}