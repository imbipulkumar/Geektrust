package in.geektrust.tameofthrones.agoldencrown;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.nio.file.Paths;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AGoldenCrownTest {

    private static String filepath;
    private AGoldenCrownImpl aGoldenCrown;
    private OutputStream outputStream;
    private String expectedOutput = "SPACE FIRE AIR WATER ";
    private String actualOutput;

    @BeforeAll
    public static void filePathSetUp() {
        filepath = Paths.get("src", "main", "resources", "SampleInput4.txt").toFile().getAbsolutePath();
    }

    @BeforeEach
    public void setOutputSream() {
        outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
    }

    @Test
    public void rulerTest() {
        aGoldenCrown = new AGoldenCrownImpl(filepath);
        aGoldenCrown.printRuler();
        actualOutput = outputStream.toString();
        assertEquals(expectedOutput, actualOutput);
    }

    @AfterEach
    public void resetOutputSream() throws IOException {
        outputStream.close();
        System.setOut(new PrintStream(new FileOutputStream(FileDescriptor.out)));
    }
}