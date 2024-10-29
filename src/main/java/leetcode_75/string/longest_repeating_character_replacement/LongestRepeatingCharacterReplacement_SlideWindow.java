package leetcode_75.string.longest_repeating_character_replacement;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class LongestRepeatingCharacterReplacement_SlideWindow {

    int getReplacement(List<Character> list){
        // get max frequency in the set
        int maxFreq = 0;
        int[] arrFreq = new int[26];
        for (char c: list
             ) {
            arrFreq[c -'A']++;
        }

        for (int freq:arrFreq
             ) {
            maxFreq = Math.max(maxFreq, freq);
        }
        // return set.size - maxFreq
        return list.size() - maxFreq;
    }

    int getLongestBlahBlahBlah(String s, int k){
        int left = 0;
        int maxLength = 0;
        List<Character> list = new LinkedList<>();

        for (int right = 0; right < s.length(); right++) {
            list.add(s.charAt(right));
            int replacement = getReplacement(list);
            if (replacement <= k){

                maxLength = Math.max(maxLength, list.size());
            }else{ // (replacement > k)
                while(replacement > k){
                    list.remove(left);
                    replacement = getReplacement(list);
                }
            }
        }
        return maxLength;

    }

    public static void main(String[] args) {
        LongestRepeatingCharacterReplacement_SlideWindow slideWindow = new LongestRepeatingCharacterReplacement_SlideWindow();
        String s = "AABABBA";
        int k = 1;
        System.out.println(slideWindow.getLongestBlahBlahBlah(s, k)); // Output: 4
         s = "AAABBBAAB";
         k = 2;
        System.out.println(slideWindow.getLongestBlahBlahBlah(s, k)); // Output: 6
    }
}
