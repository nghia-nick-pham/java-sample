package leetcode_75.string.sub_string_replacement;

import java.util.HashSet;
import java.util.Set;

public class SubStringNoReplacement_SlideWindow {

    //https://leetcode.com/problems/longest-substring-without-repeating-characters/solutions/3157485/used-hashset-in-java-explained-approach/
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set=new HashSet<>();
        int maxLength=0;
        int left=0;
        for(int right=0;right<s.length();right++){

            if(!set.contains(s.charAt(right))){
                set.add(s.charAt(right));
                maxLength=Math.max(maxLength,right-left+1);

            }else{
                while(s.charAt(left)!=s.charAt(right)){
                    set.remove(s.charAt(left));
                    left++;
                }
                set.remove(s.charAt(left));left++;
                set.add(s.charAt(right));
            }

        }
        return maxLength;
    }
//    abcb

    public static void main(String[] args) {
        String strInput = "abcb";

        SubStringNoReplacement_SlideWindow subStringNoReplacement = new SubStringNoReplacement_SlideWindow();

        System.out.println( subStringNoReplacement.lengthOfLongestSubstring(strInput));
    }
}
