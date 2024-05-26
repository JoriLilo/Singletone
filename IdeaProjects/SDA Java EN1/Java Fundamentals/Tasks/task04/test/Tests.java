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
        String inputText = "10.0\n10";
        System.setIn(new ByteArrayInputStream(inputText.getBytes()));

        Task.main(new String[]{});

        assertEquals("The installment on 10.00 for 10 months is 512.50 because the amount has been increased to 5,000.00.", 512.5, Double.parseDouble(outContent.toString().trim()), 0.1);
    }

    @Test
    public void testSolution2() {
        String inputText = "100000\n10";
        System.setIn(new ByteArrayInputStream(inputText.getBytes()));

        Task.main(new String[]{});

        assertEquals("The installment on 10,000.00 for 10 months is 512.50 because the amount has been reduced to 5,000.00.", 512.5, Double.parseDouble(outContent.toString().trim()), 0.1);
    }

    @Test
    public void testSolution3() {
        String inputText = "1000\n50";
        System.setIn(new ByteArrayInputStream(inputText.getBytes()));

        Task.main(new String[]{});

        assertEquals("The installment on 1,000.00 for 50 months is 30.56 because the number of installments has been reduced to 36.", 30.56, Double.parseDouble(outContent.toString().trim()), 0.1);
    }

    @Test
    public void testSolution4() {
        String inputText = "1000\n2";
        System.setIn(new ByteArrayInputStream(inputText.getBytes()));

        Task.main(new String[]{});

        assertEquals("The installment on 1,000.00 for 2 months is 30.56 because the number of installments has been increased to 36.", 30.56, Double.parseDouble(outContent.toString().trim()), 0.1);
    }

    @Test
    public void testSolution5() {
        String inputText = "7500.50\n36";
        System.setIn(new ByteArrayInputStream(inputText.getBytes()));

        Task.main(new String[]{});

        assertEquals("The installment on 7,500.50 for 36 months is 229.18.", 229.18, Double.parseDouble(outContent.toString().trim()), 0.1);
    }

}