package leetcode_75.string.palyndrome.palyndromic_substrings;

import java.util.HashMap;
import java.util.Map;

public class PalyndromicSubstrings {

    public int countSubstrings(String s) {
        int count = 0;
        StringBuilder result; ;
        for (int i = 0; i < s.length(); i++) {
            result = new StringBuilder();
            result.append(s.charAt(i));
            if(isPalindrome(result.toString())) count++;
            for (int j = i+1; j < s.length(); j++) {
                result.append(s.charAt(j));
                if(isPalindrome(result.toString())) count++;
            }
        }
        return count;
    }
    public boolean isPalindrome(String s) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetter(s.charAt(i)) || Character.isDigit(s.charAt(i))) {
                builder.append(Character.toLowerCase(s.charAt(i)));
            }
        }
        String newString = builder.toString();
        int left = 0;
        int right = newString.length() - 1;
        while (right >= left) {
            if (newString.charAt(left) != newString.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "abc";

        PalyndromicSubstrings palyndromicSubstrings = new PalyndromicSubstrings();
        System.out.println(palyndromicSubstrings.countSubstrings(s));
         s = "aaa";
        System.out.println(palyndromicSubstrings.countSubstrings(s));
        s = "dbabcccbcdbbbadabbdabaabcbbabaacdadcdbbbbdddbcbbbcbcabacacdaadaadcdccbacdaadadcbaacabbddabdadcabbccadacadaaacbbddaaababacaabbbacaccbcbbabddbbcccaaacbcdcabcbacdbddcdcadaaadcbccbbcabbcbdaadcbddaacacdadacbbdabcdcdadccaccdbdddddcabdbcdbaadacadadbabdcdbbadaacdbadcdabdbbcabbbdaacaaaaadcaabaaaadabaaddcaabdddcbcadcbdbbdbcbcdbadcadacbbcdccddaccccacbacaacbbdadadcacabdabadbbcdbcaaccdbdcabcadbacbccddbabbdacbcbbcbcabcacdaacccaadcdbdccabcaaacaddadcabacdccaaaddaaadbccdbbcccdddababcdbcddcbdddbbbdaadaccbcaabbcbdbadbabbacdbbbdaaccdcabddacadabcccacdabacbcdbcbdabddacacbdbcaacacaabbaaccddabaadbbaabaddbcacbacdbbbacdccabbcdbbbdbdbbcacabdddbdbaaabbcdcbabcbbbccdcdcdcaaddadccbabbacaddcaddcadcdccaccacabbaababdbbcbdcdccccccdadbdbdcdbdadcdcacdaabaacabaacdacdbaaccadbcddbdccabbcabcadcbdadbcdadbbbccacbcbbcaaaabdacbadacaadcadaacdacddcbbabdacacaabccdaccbbcbbcbcaacdabdcbcdbccdbcbcbddaacdacaaaddcaddcadccacbaddbbbccbbbcbbcbadcabbccbbaadaacacabddbdbddcadbdaaccadbcccabdcdbadbbacbcbbcdcabcddcddddabddbdabdcabdbdbbbcdbcdabbdcb";
        System.out.println(palyndromicSubstrings.countSubstrings(s));
    }
}
