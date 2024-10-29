package leetcode_75.string.window_substring;

import java.util.HashMap;
import java.util.Map;

public class WindowSubstring {
    public String minWindow(String s, String t) {
        if (s == null || s.length() == 0 || t == null || t.length() == 0) {
            return "";
        }

        // Frequency maps for characters in strings s and t
        Map<Character, Integer> tFreqMap = new HashMap<>();
        for (char c : t.toCharArray()) {
            tFreqMap.put(c, tFreqMap.getOrDefault(c, 0) + 1);
        }

        Map<Character, Integer> windowFreqMap = new HashMap<>();

        // Pointers for the sliding window
        int left = 0, right = 0;

        // Variables to keep track of minimum window substring
        int minLen = Integer.MAX_VALUE;
        int minLeft = 0, minRight = 0;

        // Number of characters in t still to be found in the window
        int remaining = t.length();

        // Sliding window algorithm
        while (right < s.length()) {
            char c = s.charAt(right);
            windowFreqMap.put(c, windowFreqMap.getOrDefault(c, 0) + 1);

            if (tFreqMap.containsKey(c) && windowFreqMap.get(c).intValue() <= tFreqMap.get(c).intValue()) {
                remaining--;
            }

            while (remaining == 0) {
                // Update minimum window substring
                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    minLeft = left;
                    minRight = right + 1;
                }

                char leftChar = s.charAt(left);
                windowFreqMap.put(leftChar, windowFreqMap.get(leftChar) - 1);
                if (tFreqMap.containsKey(leftChar) && windowFreqMap.get(leftChar) < tFreqMap.get(leftChar)) {
                    remaining++;
                }

                left++;
            }

            right++;
        }

        return minLen == Integer.MAX_VALUE ? "" : s.substring(minLeft, minRight);
    }

    public static void main(String[] args) {
        WindowSubstring solution = new WindowSubstring();
        String s = "ADOBECODEBANC";
        String t = "ABC";
        System.out.println(solution.minWindow(s, t)); // Output: "BANC"
    }
}


