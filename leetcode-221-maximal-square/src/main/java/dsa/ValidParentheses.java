package dsa;

import java.util.Stack;

public class ValidParentheses {

    public boolean isValid(String s) {
        Stack<Character> openBrackets = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);

            if ((current == '(') || (current == '[') || (current == '{')) {
                openBrackets.push(current);
            } else {
                if (openBrackets.isEmpty()) {
                    return false;
                }

                char top = openBrackets.pop();
                if (current == ')' && top != '(') {
                    return false;
                }
                if (current == ']' && top != '[') {
                    return false;
                }
                if (current == '}' && top != '{') {
                    return false;
                }
            }
        }

        return openBrackets.isEmpty();
    }

}
