package leetcode_75.string.longest_repeating_character_replacement;

import java.util.LinkedList;
import java.util.List;

public class LongestRepeatingCharacterReplacement_SlideWindow_02 {

    public int characterReplacement(String s, int k) {
        int[] charCount = new int[26]; // Array to count frequencies of characters
        int maxCount = 0; // Maximum frequency of a single character in the current window
        int maxLength = 0; // Maximum length of substring found
        int left = 0; // Left pointer of the window

        for (int right = 0; right < s.length(); right++) {
            // Increment the frequency of the current character
            charCount[s.charAt(right) - 'A']++;
            // Update the maxCount to be the maximum frequency of any character in the window
            maxCount = Math.max(maxCount, charCount[s.charAt(right) - 'A']);

            // Calculate the number of characters to replace
            int windowLength = right - left + 1;
            int charsToReplace = windowLength - maxCount;

            // If charsToReplace exceeds k, shrink the window from the left
//            if (charsToReplace > k) {
//                charCount[s.charAt(left) - 'A']--;
//                left++;
//            }
            while (right - left + 1 - maxCount  > k){
                charCount[s.charAt(left) - 'A']--;
                left++;
            }

            // Update the maximum length of substring found
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;

    }

    public static void main(String[] args) {
        LongestRepeatingCharacterReplacement_SlideWindow_02 slideWindow = new LongestRepeatingCharacterReplacement_SlideWindow_02();
        String s = "AABABBA";
        int k = 1;
        System.out.println(slideWindow.characterReplacement(s, k)); // Output: 4
         s = "AAABBBAAB";
         k = 2;
        System.out.println(slideWindow.characterReplacement(s, k)); // Output: 6
        s = "AAABCABAAB";
        k = 2;
        System.out.println(slideWindow.characterReplacement(s, k)); // Output: 5
    }
}
