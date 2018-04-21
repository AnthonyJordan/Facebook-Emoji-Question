import java.util.Stack;

public class parenChecker5 {

    public static String isBalanced(String input){
        if (firstCheck(input)){
            return "YES";
        } else if (secondCheck(input)){
            return "YES";
        } else if (thirdCheck(input)){
            return "YES";
        } else if (fourthCheck(input)){
            return "YES";
        } else if (fifthCheck(input)){
            return "YES";
        }
        return "NO";
    }

    private static boolean firstCheck(String input){
        Stack parenStack = new Stack();
        for (int i = 0; i < input.length(); i++){
            if (input.charAt(i) == '('){
                parenStack.push('(');
            } else if(input.charAt(i) == ')'){
                if (!parenStack.empty()){
                    parenStack.pop();
                } else {
                    return false;
                }
            }
        }
        if (parenStack.empty()){
            return true;
        } else {
            return false;
        }
    }

    private static boolean secondCheck(String input){
        int count = 0;
        for (int i = 0; i <input.length(); i++){
            if (input.charAt(i) == '(' && i-1 >= 0 && input.charAt(i-1) != ':'){
                count++;
            } else if (input.charAt(i) == ')' && i-1 >= 0 && input.charAt(i-1) != ':'){
                count++;
            }
        }
        if (count == 0){
            return true;
        } else {
            return false;
        }
    }

    private static boolean thirdCheck(String input){
        String removedSmileString = removeSmile(input);
        if (firstCheck(removedSmileString)){
            return true;
        } else {
            return false;
        }
    }

    private static String removeSmile(String line){
        return line.replaceAll(":\\)", "");
    }

    private static boolean fourthCheck(String input){
        String removedFrownString = removeFrown(input);
        if (firstCheck(removedFrownString)){
            return true;
        } else {
            return false;
        }
    }

    private static String removeFrown(String line){
        return line.replaceAll(":\\(", "");
    }

    private static boolean fifthCheck(String input){
        String removedEmjoiString = removeFrown(removeSmile(input));
        if (firstCheck(removedEmjoiString)){
            return true;
        } else {
            return false;
        }
    }
}
