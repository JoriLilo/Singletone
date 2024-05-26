import org.junit.Test;

public class Tests extends BaseTest {

    @Test
    public void testSolution() {
        runTest("http://sdacademy.dev/", "https://sdacademy.dev/");
    }

    @Test
    public void testSolution2() {
        runTest("https://sdacademy.dev/", "https://sdacademy.dev/");
    }

    @Test
    public void testSolution3() {
        runTest("http://http://sdacademy.dev/", "https://http://sdacademy.dev/");
    }

}