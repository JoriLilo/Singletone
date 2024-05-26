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
        String inputText = "Java";
        System.setIn(new ByteArrayInputStream(inputText.getBytes()));

        Task.main(new String[]{});

        String expected = "Found Java\n" +
                "Starts with Java\n" +
                "Ends with Java\n" +
                "Equals Java\n" +
                "0";

        assertEquals(String.format("For the text %s, the program should write in the console: \n%s.", inputText, expected), expected, outContent.toString().trim().replaceAll("\r\n", "\n"));
    }

    @Test
    public void testSolution2() {
        String inputText = "A java course from scratch is the best way to learn Java";
        System.setIn(new ByteArrayInputStream(inputText.getBytes()));

        Task.main(new String[]{});

        String expected = "Found Java\n" +
                "Ends with Java\n" +
                "52";

        assertEquals(String.format("For the text %s, the program should write in the console: \n%s.", inputText, expected), expected, outContent.toString().trim().replaceAll("\r\n", "\n"));
    }

    @Test
    public void testSolution3() {
        String inputText = "Only Java!";
        System.setIn(new ByteArrayInputStream(inputText.getBytes()));

        Task.main(new String[]{});

        String expected = "Found Java\n" +
                "5";

        assertEquals(String.format("For the text %s, the program should write in the console: \n%s.", inputText, expected), expected, outContent.toString().trim().replaceAll("\r\n", "\n"));
    }

}