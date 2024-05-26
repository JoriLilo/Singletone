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
        String inputText = "3\n2\n5\n1\n0";
        System.setIn(new ByteArrayInputStream(inputText.getBytes()));

        Task.main(new String[]{});

        assertEquals("For a series of numbers: 3, 2, 5, 1, 0, the program should write to the console the number: 11.", "11", outContent.toString().trim().replaceAll("\r\n", "\n"));
    }

    @Test
    public void testSolution2() {
        String inputText = "33\n21\n54\n-74\n0";
        System.setIn(new ByteArrayInputStream(inputText.getBytes()));

        Task.main(new String[]{});

        assertEquals("For the sequence of numbers: 33, 21, 54, -74, 0, the program should write in the console the number: 34.", "34", outContent.toString().trim().replaceAll("\r\n", "\n"));
    }

    @Test
    public void testSolution3() {
        String inputText = "-33\n-1\n54\n-94\n0";
        System.setIn(new ByteArrayInputStream(inputText.getBytes()));

        Task.main(new String[]{});

        assertEquals("For the sequence of numbers: -33, -1, 54, -94, 0, the program should write to the console the number: -74.", "-74", outContent.toString().trim().replaceAll("\r\n", "\n"));
    }

}