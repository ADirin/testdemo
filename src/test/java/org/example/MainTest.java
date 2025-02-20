package org.example;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

class MainTest {

    @Test
    void testMainMethodOutput() {
        // Capture system output
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));

        // Run the main method
        Main.main(new String[]{});

        // Restore original system output
        System.setOut(originalOut);

        // Get output and verify it
        String output = outputStream.toString();
        assertTrue(output.contains("Hello and welcome!"));
        assertTrue(output.contains("i = 1"));
        assertTrue(output.contains("i = 5"));
    }
}
