package leetcode_75.string.palyndrome;

public class Palindrome {

    public static boolean isPalindrome(String s) {
        char[] charsInput = toLowerAlphanumeric(s).toCharArray();

        if (charsInput.length==0) return true; //for exception case that just has blank character.
        //Itegrate through the String to compare forward and backward
        //Consider: just integrated through a half + one elems.
        int j = charsInput.length - 1; //a backward index
        for (int i = 0; i <= (charsInput.length/2) ; i++) {
            if(charsInput[i] != charsInput[j]) return false;
            j--;
        }

        return true;
    }

    //convert String into lowercase and alphanumeric String
    public static String toLowerAlphanumeric(String s){
        s = s.replaceAll("[^a-zA-Z0-9]","");
        return s.toLowerCase();
    }

    public static void main(String[] args) {
        String input = "A man, a plan, a canal: Panama";
        String input2 = "race a car";
        String input3 = " ";
        System.out.println(isPalindrome(input));// true
        System.out.println(isPalindrome(input2));//false
        System.out.println(isPalindrome(input3));//true
    }
}
