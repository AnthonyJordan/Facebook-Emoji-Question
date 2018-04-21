import org.junit.Assert;
import org.junit.Test;

public class parenCheckerTest2 {


    @Test
    public void paranCheckerTest1() {
        String testCase = ":((";
        Boolean actual = parenChecker2.isBalanced(testCase);
        String expected = "NO";
        Assert.assertFalse(actual);
    }

    @Test
    public void paranCheckerTest2() {
        String testCase = "i am sick today (:()";
        Boolean actual = parenChecker2.isBalanced(testCase);
        String expected = "YES";
        Assert.assertTrue(actual);
    }

    @Test
    public void paranCheckerTest3() {
        String testCase = "(:)";
        Boolean actual = parenChecker2.isBalanced(testCase);
        String expected = "YES";
        Assert.assertTrue(actual);
    }

    @Test
    public void paranCheckerTest4() {
        String testCase = "hacker cup: started :):)";
        Boolean actual = parenChecker2.isBalanced(testCase);
        String expected = "YES";
        Assert.assertTrue(actual);
    }

    @Test
    public void paranCheckerTest5() {
        String testCase = ")(";
        Boolean actual = parenChecker2.isBalanced(testCase);
        String expected = "NO";
        Assert.assertFalse(actual);
    }

    @Test
    public void paranCheckerTest6() {
        String testCase = "((dadad))";
        Boolean actual = parenChecker2.isBalanced(testCase);
        String expected = "YES";
        Assert.assertFalse(actual);
    }

    @Test
    public void paranCheckerTest7() {
        String testCase = "((dadad:))";
        Boolean actual = parenChecker2.isBalanced(testCase);
        String expected = "YES";
        Assert.assertTrue(actual);
    }

    @Test
    public void paranCheckerTest8() {
        String testCase = "((dadad:)";
        Boolean actual = parenChecker2.isBalanced(testCase);
        String expected = "NO";
        Assert.assertFalse(actual);
    }

    @Test
    public void paranCheckerTest9() {
        String testCase = ":):(";
        Boolean actual = parenChecker2.isBalanced(testCase);
        String expected = "YES";
        Assert.assertTrue(actual);
    }

    @Test
    public void paranCheckerTest10() {
        String testCase = "((:):(";
        Boolean actual = parenChecker2.isBalanced(testCase);
        String expected = "NO";
        Assert.assertFalse(actual);
    }

    @Test
    public void paranCheckerTest11() {
        String testCase = ":):)";
        Boolean actual = parenChecker2.isBalanced(testCase);
        String expected = "YES";
        Assert.assertTrue(actual);
    }

    @Test
    public void paranCheckerTest12() {
        String testCase = "(:):)";
        Boolean actual = parenChecker2.isBalanced(testCase);
        String expected = "YES";
        Assert.assertTrue(actual);
    }

    @Test
    public void paranCheckerTest13() {
        String testCase = "()(";
        Boolean actual = parenChecker2.isBalanced(testCase);
        String expected = "NO";
        Assert.assertFalse(actual);
    }


}
