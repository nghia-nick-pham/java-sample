package leetcode_75.string.parentheses;

import java.util.HashMap;
import java.util.Map;

public class Parentheses {

//    public static Map<Character, Integer> mapType = new HashMap<Character, Integer>(){{
//        put('(',1);
//        put(')',-1);
//        put('[',2);
//        put(']',-2);
//        put('{',3);
//        put('}',-3);
//    }};

    public boolean isValid(String s) {

        //convert String into char array
        char[] arr = s.toCharArray();

        //for type -- define open one is positive and close one is negative
        int totalType = 0;
        int totalTypeSquare = 0;
        int totalTypeBracket = 0;
        int totalTypeAngle = 0;



        //for order --(index close - index open) modulus 2 == 0
        // try it with  (index close + index open) modulus 2 == 1
        int totalIndexSquare = 0;
        int totalIndexBracket = 0;
        int totalIndexAngle = 0;

        for (int i = 0; i < arr.length; i++) {
            char charCur = arr[i];
            if('(' == charCur){
                totalTypeAngle +=1;
            } else if (')' == charCur) {
                totalTypeAngle -=1;
            }
            if(totalTypeAngle < 0){
                return false;
            }
            if('[' == charCur){
                totalTypeSquare +=1;
            } else if (']' == charCur) {
                totalTypeSquare -=1;
            }
            if(totalTypeSquare < 0){
                return false;
            }
            if('{' == charCur){
                totalTypeSquare +=1;
            } else if ('}' == charCur) {
                totalTypeSquare -=1;
            }
            if(totalTypeSquare < 0){
                return false;
            }

            //
            if('(' == charCur || ')' == charCur){
                totalIndexAngle += i;
            } else if ('[' == charCur || ']' == charCur) {
                totalIndexSquare += i;
            } else if ('{' == charCur || '}' == charCur) {
                totalIndexBracket += i;
            }

        }

        totalType = totalTypeAngle + totalTypeSquare + totalTypeBracket;
        if (totalType == 0 &&
                ((totalIndexAngle % 2 == 1 || totalIndexAngle == 0)
                        && (totalIndexSquare % 2 == 1 || totalIndexSquare ==0)
                        && (totalIndexBracket % 2 == 1 || totalIndexBracket ==0)))
            return true;

        return false;

    }



    public static void main(String[] args) {

        String s = "[({])}";
        Parentheses parentheses = new Parentheses();
        System.out.println(parentheses.isValid(s));

    }

    //        String s = "()[]{}";
//        String s = "{[()]}";
//        String s = "([)]";
//        String s = "(]";
//        String s = "(}{)";
//        String s = "({})";

}
