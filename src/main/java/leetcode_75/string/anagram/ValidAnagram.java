package leetcode_75.string.anagram;

import java.util.Arrays;

public class ValidAnagram {

    public boolean isAnagram(String s, String t) {
        //validation
        if(s == null || t==null || s.length() != t.length()){
            return false;
        }

        //convert String to List<String>
        char[] lstCharS = s.toCharArray();
        char[] lstCharT = t.toCharArray();

        //Sort two lists
        Arrays.sort(lstCharS);
        Arrays.sort(lstCharT);

        //Compare two lists.
        for (int i = 0; i < s.length(); i++) {
            if (lstCharS[i] != lstCharT[i]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "rat";
        String t = "car";
        ValidAnagram validAnagram = new ValidAnagram();
        System.out.println(validAnagram.isAnagram(s, t));
    }
}
