package leetcode_75.string.palyndrome;

class Solution {
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
}
