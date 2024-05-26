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
        String inputText = "Ala likes cats, but she is not liked by the Cats.";
        System.setIn(new ByteArrayInputStream(inputText.getBytes()));

        Task.main(new String[]{});

        String expected = "ala - 1\n" +
                "but - 1\n" +
                "by - 1\n" +
                "cats - 2\n" +
                "is - 1\n" +
                "liked - 1\n" +
                "likes - 1\n" +
                "not - 1\n" +
                "she - 1\n" +
                "the - 1";

        assertEquals(String.format("For the text %s, the program should write in the console: \n%s.", inputText, expected), expected, outContent.toString().trim().replaceAll("\r\n", "\n"));
    }

    @Test
    public void testSolution2() {
        String inputText = "Ala! likes? cats, but. she is not liked by the Cats.";
        System.setIn(new ByteArrayInputStream(inputText.getBytes()));

        Task.main(new String[]{});

        String expected = "ala - 1\n" +
                "but - 1\n" +
                "by - 1\n" +
                "cats - 2\n" +
                "is - 1\n" +
                "liked - 1\n" +
                "likes - 1\n" +
                "not - 1\n" +
                "she - 1\n" +
                "the - 1";

        assertEquals(String.format("For the text %s, the program should write in the console: \n%s.", inputText, expected), expected, outContent.toString().trim().replaceAll("\r\n", "\n"));
    }

    @Test
    public void testSolution3() {
        String inputText = "World. Hello, World!";
        System.setIn(new ByteArrayInputStream(inputText.getBytes()));

        Task.main(new String[]{});

        String expected = "hello - 1\n" +
                "world - 2";

        assertEquals(String.format("For the text %s, the program should write in the console: \n%s.", inputText, expected), expected, outContent.toString().trim().replaceAll("\r\n", "\n"));
    }

}