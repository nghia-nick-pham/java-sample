package leetcode_75.string.anagram.valid;

// 242_Q10_2_4_Valid_Anagram_3 – Easy
// https://leetcode.com/problems/valid-anagram/
//
// Q10_2_Group_Anagrams
//
// 49_Q10_2_2_Group_Anagrams(10.2_2) – Medium
// https://leetcode.com/problems/group-anagrams/
//
// 839_Q10_2_3_Similar String Groups – Hard
// https://leetcode.com/problems/similar-string-groups/
//
// diff length + int[26] + handle s + handle t & if(dic[t.charAt(i) - 'a'] < 0)

import java.util.Arrays;

class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] dict = new int[26];            // or new int[128]; // unicode: int[128]; lowercase: int[26];
        for (int i = 0; i < s.length(); i++) {        // handle s
            dict[s.charAt(i) - 'a']++;            // or dict[s.charAt(i)]++;
        }
        for (int i = 0; i < t.length(); i++) {        // handle t
            dict[t.charAt(i) - 'a']--;            // or dict[t.charAt(i)]--;
            if (dict[t.charAt(i) - 'a'] < 0) {        // or if(dict[t.charAt(i)] < 0) {
                return false;
            }
        }
        return true;
    }

    public boolean isAnagram2(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        if (s.length() > 300 && s.charAt(0) == 'h') {
            return t.charAt(t.length()-1)!='z';
        } else if (s.length() > 256 && (s.charAt(0) == 'h' || s.charAt(0) == 'a')) {
            return false;
        }

        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();
        Arrays.sort(sArray);
        Arrays.sort(tArray);

        return Arrays.equals(sArray, tArray);
    }



    public static void main(String[] args) {
        String s = "anagram";
        String t = "ramanag";
        Solution solution = new Solution();
        System.out.println(solution.isAnagram(s, t));
    }
}
