import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class parenChecker4 {
    /**
     * Iterate through each line of input.
     */
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
        BufferedReader in = new BufferedReader(reader);
        String line;
        while ((line = in.readLine()) != null) {
            System.out.println(isBalanced(line));
        }
    }


    public static String isBalanced(String line){
        if (balanceCheck(line)){
            //initial check, good if parens are even from the start
            return "YES";
        } else {
            //runs an additional check, that itself runs balanceCheck(line) after a layer of parsing
            return emoteCheck(line);
        }
    }

    public static String emoteCheck(String line){
        //replace emotes, then run balanceCheck again. here, we return a string to simplify the parseParens() method
        String postSmile = removeSmile(line);
        if (balanceCheck(postSmile)){
            return "YES";
        }
        String postFrown = removeFrown(line);
        if (balanceCheck(postFrown)){
            return "YES";
        }
        String postSmileAndFrown = removeSmile(removeFrown(line));
        if (balanceCheck(postSmileAndFrown)){
            return "YES";
        }
        return "NO";
    }

    public static String removeSmile(String line){
        return line.replaceAll(":\\)", "");
    }

    public static String removeFrown(String line){
        return line.replaceAll(":\\(", "");
    }

    public static boolean balanceCheck(String line){
        Stack<String> parenStack = new Stack<String>();
        String[] tempArray = line.split("");
        for (String ch:tempArray){
            if (ch.equals("(")) parenStack.push(ch);
            if (ch.equals(")")){
                try {
                    parenStack.pop();
                } catch (Exception exception){
                    return false;
                }
            }
        }
        if (parenStack.size() > 0){
            return false;
        } else {
            return true;
        }
    }
}

