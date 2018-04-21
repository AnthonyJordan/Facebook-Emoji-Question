import java.util.*;

public class parenChecker {

    public static String isBalanced(String line) {
        if (line.equals("")) {
            return "YES";
        }

        String[] splitLine = line.split("");
        Stack<String> parentheses = new Stack<>();
        for (int i = 0; i < splitLine.length; i++) {

            if (splitLine[i].equals("(")) {
                parentheses.push(splitLine[i]);
            }

            if (splitLine[i].equals(")")) {

                if (i == 0) {
                    return "NO";
                } else if (parentheses.isEmpty() && splitLine[i - 1].equals(":")) {
                    return "YES";
                } else if (parentheses.isEmpty()) {
                    return "NO";
                }

                String last = parentheses.peek();
                if (last.equals("(")) {
                    parentheses.pop();
                    return "YES";
                }
            }
        }
        return "NO";
    }
}