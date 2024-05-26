import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Locale;

import static org.junit.Assert.assertEquals;

public class Tests {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;
    private final InputStream originalIn = System.in;

    private static final Locale LOCALE = new Locale("en-US");
    private Locale systemLocale;

    @Before
    public void setUpStreams() {
        systemLocale = Locale.getDefault();
        Locale.setDefault(LOCALE);
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @After
    public void restoreStreams() {
        Locale.setDefault(systemLocale);
        System.setOut(originalOut);
        System.setErr(originalErr);
        System.setIn(originalIn);
    }

    @Test
    public void testSolution() {
        String inputText = "185\n70.0";
        System.setIn(new ByteArrayInputStream(inputText.getBytes()));

        Task.main(new String[]{});

        assertEquals("A person who is 185cm tall and weighs 70kg can ride.", "Fasten your seatbelt!", outContent.toString().trim());
    }

    @Test
    public void testSolution2() {
        String inputText = "150\n70.1";
        System.setIn(new ByteArrayInputStream(inputText.getBytes()));

        Task.main(new String[]{});

        assertEquals("A person who is 150cm tall and weighs 70.1kg cannot ride.", "I'm sorry you can't go!", outContent.toString().trim());
    }

    @Test
    public void testSolution3() {
        String inputText = "185\n180";
        System.setIn(new ByteArrayInputStream(inputText.getBytes()));

        Task.main(new String[]{});

        assertEquals("A person who is 185cm tall and weighs 180kg can ride.", "Fasten your seatbelt!", outContent.toString().trim());
    }

    @Test
    public void testSolution4() {
        String inputText = "185\n181.0";
        System.setIn(new ByteArrayInputStream(inputText.getBytes()));

        Task.main(new String[]{});

        assertEquals("A person who is 185cm tall and weighs 181kg cannot ride.", "I'm sorry you can't go!", outContent.toString().trim());
    }

}