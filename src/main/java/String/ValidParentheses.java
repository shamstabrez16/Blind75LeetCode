package String;

import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        int l = 0;
        while (l<=s.length()-1){
            Character input = s.charAt(l);
            l++;
            switch (input) {
                case '{', '[', '(' -> stack.push(input);
                case '}' -> {
                    if (stack.empty())
                        return false;
                    if (stack.pop() != '{') {
                        return false;
                    }
                }
                case ']' -> {
                    if (stack.empty())
                        return false;
                    if (stack.pop() != '[') {
                        return false;
                    }
                }
                case ')' -> {
                    if (stack.empty())
                        return false;
                    if (stack.pop() != '(') {
                        return false;
                    }
                }
                default -> throw new IllegalStateException("Unexpected value: " + input);
            }
        }
        return stack.empty();
    }
}
