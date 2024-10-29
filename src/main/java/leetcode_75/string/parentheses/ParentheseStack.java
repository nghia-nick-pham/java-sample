package leetcode_75.string.parentheses;

import java.util.Stack;

public class ParentheseStack {
    public boolean isValid(String s) {
        // Initialize a stack to keep track of opening brackets
        Stack<Character> stack = new Stack<>();

        // Traverse each character in the input string
        for (char charCur : s.toCharArray()) {
            // If the character is an opening bracket, push it onto the stack
            if (charCur == '(' || charCur == '{' || charCur == '[') {
                stack.push(charCur);
            } else {
                // If the stack is empty and we encounter a closing bracket, it's invalid
                if (stack.isEmpty()) {
                    return false;
                }
                // Pop the top of the stack and check if it matches the corresponding opening bracket
                char top = stack.pop();
                if ((charCur == ')' && top != '(') ||
                        (charCur == '}' && top != '{') ||
                        (charCur == ']' && top != '[')) {
                    return false;
                }
            }
        }

        // If the stack is empty, all opening brackets have been properly closed
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        ParentheseStack solution = new ParentheseStack();

        // Test cases
        String s1 = "()";
        String s2 = "()[]{}";
        String s3 = "(]";
        String s4 = "([)]";
        String s5 = "{[]}";
        String s6 = "[({])}";

        System.out.println(solution.isValid(s1)); // true
        System.out.println(solution.isValid(s2)); // true
        System.out.println(solution.isValid(s3)); // false
        System.out.println(solution.isValid(s4)); // false
        System.out.println(solution.isValid(s5)); // true
        System.out.println(solution.isValid(s6)); // false
    }
}
