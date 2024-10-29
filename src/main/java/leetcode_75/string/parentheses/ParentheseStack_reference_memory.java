package leetcode_75.string.parentheses;

import java.util.HashMap;
import java.util.Stack;

public class ParentheseStack_reference_memory {

    boolean isValidParenthese(String s){
            Stack<Character> stack = new Stack<Character>();
            for( char c : s.toCharArray ()){
                if(c == '(')
                    stack.push(')');
                else if( c == '{')
                    stack.push('}');
                else if( c == '[')
                    stack.push(']');
                else if ( stack.isEmpty() || stack.pop()!= c)
                    return false;

            }

            return stack.isEmpty();
    }

    public static void main(String[] args) {
        String str = "([[]{}])";
        ParentheseStack_reference_memory parentheseStack = new ParentheseStack_reference_memory();
        System.out.println(parentheseStack.isValidParenthese(str));

        str = "{[(])}";
        System.out.println(parentheseStack.isValidParenthese(str));

        str = "{[)])}";
        System.out.println(parentheseStack.isValidParenthese(str));
    }
}
