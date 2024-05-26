import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class Tests {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;
    private final InputStream originalIn = System.in;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
        System.setErr(originalErr);
        System.setIn(originalIn);
    }

    @Test
    public void testSolution() {
        String inputText = "ala has a cat\n1";
        System.setIn(new ByteArrayInputStream(inputText.getBytes()));

        Task.main(new String[]{});

        String expected = "bmb ibt b dbu";

        assertEquals(String.format("For the text %s and n %d, the program should write to the console: %s.", inputText, 1, expected), expected, outContent.toString().trim());
    }

    @Test
    public void testSolution2() {
        String inputText = "ala has a cat\n26";
        System.setIn(new ByteArrayInputStream(inputText.getBytes()));

        Task.main(new String[]{});

        String expected = "ala has a cat";

        assertEquals(String.format("For the text %s and n %d, the program should write to the console: %s.", inputText, 26, expected), expected, outContent.toString().trim());
    }

    @Test
    public void testSolution3() {
        String inputText = "This is a sentence\n13";
        System.setIn(new ByteArrayInputStream(inputText.getBytes()));

        Task.main(new String[]{});

        String expected = "auvf vf n fragrapr";

        assertEquals(String.format("For the text %s and n %d, the program should write to the console: %s.", inputText, 13, expected), expected, outContent.toString().trim());
    }

}