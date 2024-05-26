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
        String inputText = "23";
        System.setIn(new ByteArrayInputStream(inputText.getBytes()));

        Task.main(new String[]{});

        assertEquals("For the number 23, the program should write to the console the message: 'Yes'.", "Yes", outContent.toString().trim());
    }

    @Test
    public void testSolution2() {
        String inputText = "2";
        System.setIn(new ByteArrayInputStream(inputText.getBytes()));

        Task.main(new String[]{});

        assertEquals("For the number 2, the program should write to the console the message: 'Yes'.", "Yes", outContent.toString().trim());
    }

    @Test
    public void testSolution3() {
        String inputText = "4";
        System.setIn(new ByteArrayInputStream(inputText.getBytes()));

        Task.main(new String[]{});

        assertEquals("For the number 4, the program should write to the console the message: 'No'.", "No", outContent.toString().trim());
    }

    @Test
    public void testSolution4() {
        String inputText = "2000";
        System.setIn(new ByteArrayInputStream(inputText.getBytes()));

        Task.main(new String[]{});

        assertEquals("For the number 2000, the program should write to the console the message: 'No'.", "No", outContent.toString().trim());
    }

    @Test
    public void testSolution5() {
        String inputText = "1";
        System.setIn(new ByteArrayInputStream(inputText.getBytes()));

        Task.main(new String[]{});

        assertEquals("For the number 1, the program should write to the console the message: 'I am interrupting work'.", "I am interrupting work", outContent.toString().trim());
    }

}