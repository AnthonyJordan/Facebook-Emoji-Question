import org.junit.Assert;
import org.junit.Test;


public class parenCheckerTest3 {



    @Test
    public void paranCheckerTest1() {
        String testCase = ":((";
        String actual = parenChecker3.isBalanced(testCase);
        String expected = "NO";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void paranCheckerTest2() {
        String testCase = "i am sick today (:()";
        String actual = parenChecker3.isBalanced(testCase);
        String expected = "YES";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void paranCheckerTest3() {
        String testCase = "(:)";
        String actual = parenChecker3.isBalanced(testCase);
        String expected = "YES";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void paranCheckerTest4() {
        String testCase = "hacker cup: started :):)";
        String actual = parenChecker3.isBalanced(testCase);
        String expected = "YES";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void paranCheckerTest5() {
        String testCase = ")(";
        String actual = parenChecker3.isBalanced(testCase);
        String expected = "NO";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void paranCheckerTest6() {
        String testCase = "((dadad))";
        String actual = parenChecker3.isBalanced(testCase);
        String expected = "YES";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void paranCheckerTest7() {
        String testCase = "((dadad:))";
        String actual = parenChecker3.isBalanced(testCase);
        String expected = "YES";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void paranCheckerTest8() {
        String testCase = "((dadad:)";
        String actual = parenChecker3.isBalanced(testCase);
        String expected = "NO";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void paranCheckerTest9() {
        String testCase = ":):(";
        String actual = parenChecker3.isBalanced(testCase);
        String expected = "YES";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void paranCheckerTest10() {
        String testCase = "((:):(";
        String actual = parenChecker3.isBalanced(testCase);
        String expected = "NO";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void paranCheckerTest11() {
        String testCase = ":):)";
        String actual = parenChecker3.isBalanced(testCase);
        String expected = "YES";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void paranCheckerTest12() {
        String testCase = "(:):)";
        String actual = parenChecker3.isBalanced(testCase);
        String expected = "YES";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void paranCheckerTest13() {
        String testCase = "()(";
        String actual = parenChecker3.isBalanced(testCase);
        String expected = "NO";
        Assert.assertEquals(expected, actual);
    }
}
