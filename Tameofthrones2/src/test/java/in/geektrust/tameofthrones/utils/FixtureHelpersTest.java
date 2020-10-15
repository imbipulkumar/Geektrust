package in.geektrust.tameofthrones.utils;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import in.geektrust.tameofthrones.kingdom.Kingdom;

public class FixtureHelpersTest {

    private static String filepath;
    private static String filename = "universeOfSoutheros.json";
    private List<ArrayList<String>> expectedFileContents = new ArrayList<ArrayList<String>>() {
        /**
         * Default serial version ID
         */
        private static final long serialVersionUID = 1L;

        {
            add(new ArrayList<String>(Arrays.asList("LAND", "PANDAUFSI")));
            add(new ArrayList<String>(Arrays.asList("ICE", "MAMMOTH THVAO")));
            add(new ArrayList<String>(Arrays.asList("FIRE", "DRAGON JXGMUT")));
            add(new ArrayList<String>(Arrays.asList("AIR", "ZORRO")));
            add(new ArrayList<String>(Arrays.asList("WATER", "OCTO VJAVWBZ PUS")));
        }
    };
    List<ArrayList<String>> actualFileContents;
    HashMap<String, Kingdom> kingdomsMap;

    @BeforeAll
    public static void filePathSetUp() {
        filepath = Paths.get("src", "main", "resources", "SampleInput4.txt").toFile().getAbsolutePath();
    }

    @Test
    public void readInputFilesTest() {
        actualFileContents = FixtureHelpers.readInputFile(filepath);
        assertEquals(expectedFileContents.size(), actualFileContents.size());
        for (int i = 0; i < expectedFileContents.size(); ++i) {
            assertArrayEquals(expectedFileContents.get(i).toArray(), actualFileContents.get(i).toArray());
        }
    }

    @Test
    public void universeOfSoutherosTest() {
        kingdomsMap = FixtureHelpers.universeOfSoutheros(filename);
        assertNotNull(kingdomsMap);
        assertEquals(6, kingdomsMap.size());
        assertEquals("WATER", kingdomsMap.get("WATER").getKingdom());
        assertEquals("FIRE", kingdomsMap.get("FIRE").getKingdom());
        assertEquals("MAMMOTH", kingdomsMap.get("ICE").getEmblem());
        assertEquals("OWL", kingdomsMap.get("AIR").getEmblem());
        assertNull(kingdomsMap.get("SPACE").getSecretMsg());
        assertNull(kingdomsMap.get("LAND").getSecretMsg());
    }

}