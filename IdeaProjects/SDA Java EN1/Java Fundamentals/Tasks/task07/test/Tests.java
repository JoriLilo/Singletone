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
        String inputText = "71";
        System.setIn(new ByteArrayInputStream(inputText.getBytes()));

        Task.main(new String[]{});

        assertEquals("For the number n = 71, the program should write in the console the numbers: 1, 2, 4, 8, 16, 32, 64.", "1\n2\n4\n8\n16\n32\n64", outContent.toString().trim().replaceAll("\r\n", "\n"));
    }

    @Test
    public void testSolution2() {
        String inputText = "1";
        System.setIn(new ByteArrayInputStream(inputText.getBytes()));

        Task.main(new String[]{});

        assertEquals("For the number n = 1, the program should write the number 1 in the console.", "1", outContent.toString().trim().replaceAll("\r\n", "\n"));
    }

    @Test
    public void testSolution3() {
        String inputText = "423";
        System.setIn(new ByteArrayInputStream(inputText.getBytes()));

        Task.main(new String[]{});

        assertEquals("For the number n = 423, the program should write in the console the numbers: 1, 2, 4, 8, 16, 32, 64, 128, 256.", "1\n2\n4\n8\n16\n32\n64\n128\n256", outContent.toString().trim().replaceAll("\r\n", "\n"));
    }

}