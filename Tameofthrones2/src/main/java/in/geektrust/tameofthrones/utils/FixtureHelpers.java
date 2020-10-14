package in.geektrust.tameofthrones.utils;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.io.Resources;

import in.geektrust.tameofthrones.kingdom.Kingdom;

/**
 * A set of helper method for fixture files.
 */
public class FixtureHelpers {

    private FixtureHelpers() {
        /* singleton */ }

    /**
     * Reads the input file and returns a List of ArrayList of messages.
     * 
     * @param filename the absolute filepath of input file
     * @return List<ArrayList<String>>
     * @exception IOException if an I/O error occurs.
     */
    public static List<ArrayList<String>> readInputFile(String filepath) {
        List<ArrayList<String>> messages = new ArrayList<ArrayList<String>>();
        try {
            File input = new File(filepath);
            Scanner scanner = new Scanner(input);
            while (scanner.hasNextLine()) {
                String message = scanner.nextLine();
                messages.add(new ArrayList<String>(Arrays.asList(message.split(" ", 2))));
            }
            scanner.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return messages;
    }

    /**
     * Reads the given file and maps to the object. Generate and returns a HashMap
     * of Kingdom name (key) and Kingdom object (value).
     * 
     * @param filename the filename of the fixture file
     * @return HashMap<KingdomName, KingdomObject>
     * @exception IOException if an I/O error occurs.
     */
    public static HashMap<String, Kingdom> universeOfSoutheros(String filename) {
        HashMap<String, Kingdom> kingdomsMap = new HashMap<String, Kingdom>();
        try {
            String fileContents = fixture(filename);
            ObjectMapper objectMapper = new ObjectMapper();
            Kingdom[] kingdoms = objectMapper.readValue(fileContents, Kingdom[].class);
            for (Kingdom kingdom : kingdoms) {
                kingdomsMap.put(kingdom.getKingdom(), kingdom);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return kingdomsMap;
    }

    /**
     * Reads the given fixture file from the classpath (e. g.
     * {@code src/test/resources}) and returns its contents as a UTF-8 string.
     *
     * @param filename the filename of the fixture file
     * @return the contents of {@code src/test/resources/{filename}}
     * @throws IllegalArgumentException if an I/O error occurs.
     */
    public static String fixture(String filename) {
        return fixture(filename, StandardCharsets.UTF_8);
    }

    /**
     * Reads the given fixture file from the classpath (e. g.
     * {@code src/test/resources}) and returns its contents as a string.
     *
     * @param filename the filename of the fixture file
     * @param charset  the character set of {@code filename}
     * @return the contents of {@code src/test/resources/{filename}}
     * @throws IllegalArgumentException if an I/O error occurs.
     */
    private static String fixture(String filename, Charset charset) {
        final URL resource = Resources.getResource(filename);
        try {
            return Resources.toString(resource, charset).trim();
        } catch (IOException e) {
            throw new IllegalArgumentException(e);
        }
    }

}