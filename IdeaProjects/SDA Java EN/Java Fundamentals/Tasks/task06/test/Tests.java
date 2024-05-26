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
        String inputText = "4\n11";
        System.setIn(new ByteArrayInputStream(inputText.getBytes()));

        Task.main(new String[]{});

        assertEquals("For numbers a = 4 and b = 11, the program should write the number 60 in the console.", "60", outContent.toString().trim());
    }

    @Test
    public void testSolution2() {
        String inputText = "9\n64";
        System.setIn(new ByteArrayInputStream(inputText.getBytes()));

        Task.main(new String[]{});

        assertEquals("For numbers a = 9 and b = 64, the program should write 2044 in the console.", "2044", outContent.toString().trim());
    }

    @Test
    public void testSolution3() {
        String inputText = "2\n1";
        System.setIn(new ByteArrayInputStream(inputText.getBytes()));

        Task.main(new String[]{});

        assertEquals("For numbers a = 2 and b = 1, the program should write 'Job completed' in the console.", "Job completed", outContent.toString().trim());
    }

    @Test
    public void testSolution4() {
        String inputText = "2\n2";
        System.setIn(new ByteArrayInputStream(inputText.getBytes()));

        Task.main(new String[]{});

        assertEquals("For numbers a = 2 and b = 2, the program should write in the console the message 'Job completed'.", "Job completed", outContent.toString().trim());
    }

}