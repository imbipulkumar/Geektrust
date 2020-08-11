package in.geektrust.tameofthrones.agoldencrown;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AGoldenCrownTest {

    private AGoldenCrownImpl aGoldenCrown;
    private OutputStream outputStream;
    private String expectedOutput = "SPACE FIRE AIR WATER ";
    private String actualOutput;
    private List<ArrayList<String>> messages = new ArrayList<ArrayList<String>>() {
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

    @BeforeEach
    public void setOutputSream() {
        outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
    }

    @Test
    public void rulerTest() {
        aGoldenCrown = new AGoldenCrownImpl(messages);
        aGoldenCrown.ruler();
        actualOutput = outputStream.toString();
        assertEquals(expectedOutput, actualOutput);
    }

    @AfterEach
    public void resetOutputSream() throws IOException {
        outputStream.close();
        System.setOut(new PrintStream(new FileOutputStream(FileDescriptor.out))); 
    }
}