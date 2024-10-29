package leetcode_75.string.parentheses;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class ParentheseStack_practice_01 {

    boolean isValidParenthese(String str){
        HashMap<Character, Integer> hashMapOpenCracket = new HashMap<>();
        hashMapOpenCracket.put('{', 1);
        hashMapOpenCracket.put('[', 2);
        hashMapOpenCracket.put('(', 3);
        HashMap<Character, Integer> hashMapCloseCracket = new HashMap<>();
        hashMapCloseCracket.put('}',-1);
        hashMapCloseCracket.put(']',-2);
        hashMapCloseCracket.put(')',-3);
        Stack<Character> stack = new Stack<>();

        for (char c: str.toCharArray()
             ) {
            if(hashMapOpenCracket.containsKey(c)){
                stack.push(c);
            }else { //Close crackets
                if(!(hashMapOpenCracket.get(stack.pop()) + hashMapCloseCracket.get(c) == 0)) {
                    return false;
                }
            }
        }

        return stack.empty();
    }

    public static void main(String[] args) {
        String str = "([[]{}])";
        ParentheseStack_practice_01 parentheseStack = new ParentheseStack_practice_01();
        System.out.println(parentheseStack.isValidParenthese(str));

        str = "{[(])}";
        System.out.println(parentheseStack.isValidParenthese(str));

        str = "{[)])}";
        System.out.println(parentheseStack.isValidParenthese(str));
    }
}
