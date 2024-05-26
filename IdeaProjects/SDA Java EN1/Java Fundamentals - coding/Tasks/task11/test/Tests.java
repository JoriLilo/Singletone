import org.junit.Test;

public class Tests extends BaseTest {

    @Test
    public void testSolution() {
        runTest("abc", "ABC");
    }

    @Test
    public void testSolution2() {
        runTest("abcd", "aBCD");
    }

    @Test
    public void testSolution3() {
        runTest("ok", "OK");
    }

    @Test
    public void testSolution4() {
        runTest("Lorem ipsum", "Lorem ipSUM");
    }

    @Test
    public void testSolution5() {
        runTest("Lorem ipsum???", "Lorem ipsum???");
    }

}