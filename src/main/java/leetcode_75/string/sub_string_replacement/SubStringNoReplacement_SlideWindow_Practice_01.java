package leetcode_75.string.sub_string_replacement;

import java.util.HashSet;
import java.util.Set;

public class SubStringNoReplacement_SlideWindow_Practice_01 {

    int findLongestSubstringWORepeating( String str){
        Set<Character> hashSet = new HashSet<>();
        int maxLength = 0;
        int left = 0;

        for (int right = 0; right < str.length(); right++) {
            if(!hashSet.contains(str.charAt(right))){
                hashSet.add(str.charAt(right));
                maxLength = Math.max(maxLength, hashSet.size());
            }
            else{
                while (str.charAt(left) !=  str.charAt(right)){
                    hashSet.remove(str.charAt(left));
                    left++;
                }
                hashSet.add(str.charAt(right));
                hashSet.remove(str.charAt(left));
                left++;
            }
        }
        return maxLength;
    }

    public static void main(String[] args) {
        SubStringNoReplacement_SlideWindow_Practice_01 slideWindow_practice_01 = new SubStringNoReplacement_SlideWindow_Practice_01();
        String str = "abac";
        System.out.println(slideWindow_practice_01.findLongestSubstringWORepeating(str));
    }
}
