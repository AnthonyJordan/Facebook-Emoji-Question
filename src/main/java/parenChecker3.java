import java.util.Stack;

public class parenChecker3 {

    private static Stack parens = new Stack();

    public static String isBalanced(String input) {

        for(int i = 0; i < input.length(); i++) {
            if ((i -1) >= 0){

                if (input.charAt(i) == '(' && input.charAt((i - 1)) == ':') {

                } else if (input.charAt(i) == '(' && parens.isEmpty()) {
                    parens.push(input.charAt(i));
                }
            } else {
                if (input.charAt(i) == '(' && parens.isEmpty()) {
                    parens.push(input.charAt(i));
                }
            }

            if (input.charAt(i) == ':' && i+1 < input.length() && input.charAt(i +1) == ')') {
                continue;
            }

            if (input.charAt(i) == ')') {
                if (!parens.isEmpty()) {
                    parens.pop();
                }
            }
        }
        if(parens.isEmpty() || parens.size() % 2 == 0) {
            return  "YES";
        } else {
            return "NO";
        }
    }
}
