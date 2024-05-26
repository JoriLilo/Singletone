import org.junit.Test;

public class Tests extends BaseTest {

    @Test
    public void testSolution() {
        runTest("It ain't compiling, cheese and rice!", "It ain't compiling, [bleep]!");
    }

    @Test
    public void testSolution2() {
        runTest("There is no swear word in this test", "There is no swear word in this test");
    }

    @Test
    public void testSolution3() {
        runTest("chuck it chuck it", "[bleep] [bleep]");
    }

    @Test
    public void testSolution4() {
        runTest("motherpuffin chuck it cheese and rice", "[bleep] [bleep] [bleep]");
    }

}