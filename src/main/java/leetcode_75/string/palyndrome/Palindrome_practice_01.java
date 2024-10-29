package leetcode_75.string.palyndrome;

import java.util.regex.Matcher;

public class Palindrome_practice_01 {

    boolean isPalindrome(String s){
        if(s.length() == 0 || s.length() ==1 ) return true;
        s = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        System.out.println(s);

        //detect even - odd
        int leftIdxMax = s.length()/2 - 1;
        int rightIdxMin = s.length()/2;
        if(s.length() % 2 !=0) { //odd
            System.out.println(rightIdxMin);
            rightIdxMin++;
        }
        //itgeration and compare
        int leftIdx = 0; int rightIdx = s.length() -1;
        while(leftIdx <= leftIdxMax && rightIdx >= rightIdxMin){
            if (s.charAt(leftIdx) != s.charAt(rightIdx)) {
                return false;
            }
            leftIdx++;
            rightIdx--;
        }
        return true;
    }

    public static void main(String[] args) {
        Palindrome_practice_01 practice01 = new Palindrome_practice_01();
        String s = " A man nam ad.";
        System.out.println(practice01.isPalindrome(s));
    }

}
