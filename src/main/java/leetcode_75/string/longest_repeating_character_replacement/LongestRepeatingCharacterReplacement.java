package leetcode_75.string.longest_repeating_character_replacement;

public class LongestRepeatingCharacterReplacement {
    public int characterReplacement(String s, int k) {
        int maxLength = 0;

        // Iterate over all possible substrings
        for (int start = 0; start < s.length(); start++) {
            for (int end = start; end < s.length(); end++) {
                // Get the substring
                String substring = s.substring(start, end + 1);

                // Count frequencies of each character in the substring
                int[] charCount = new int[26];
                for (int i = 0; i < substring.length(); i++) {
                    charCount[substring.charAt(i) - 'A']++;
                }

                // Find the maximum frequency of any character in the substring
                int maxFreq = 0;
                for (int count : charCount) {
                    maxFreq = Math.max(maxFreq, count);
                }

                // Calculate the number of replacements needed
                int replacements = substring.length() - maxFreq;

                // Check if the replacements are within the allowed limit
                if (replacements <= k) {
                    maxLength = Math.max(maxLength, substring.length());
                }
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {
        LongestRepeatingCharacterReplacement solution = new LongestRepeatingCharacterReplacement();
        String s = "AABABBA";
        int k = 1;
        System.out.println(solution.characterReplacement(s, k)); // Output: 4
        s = "AAABBBAAB";
        k = 2;
        System.out.println(solution.characterReplacement(s, k)); // Output: 6
    }
}

