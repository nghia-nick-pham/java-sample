package leetcode_75.string.sub_string_replacement;

public class SubStringReplacement {

    //424. Longest Repeating Character Replacement
//    You are given a string s and an integer k. You can choose any character of the string and change it to any other
//    uppercase English character. You can perform this operation at most k times.
//
//    Return the length of the longest substring containing the same letter you can get after performing the above operations.

    public static final char blank =' ';
    public static void main(String[] args) {


        //input
        int k = 2;
        String strInput = "ABBB";



        SubStringReplacement subStringReplacement = new SubStringReplacement();
        subStringReplacement.subString(k, strInput);

    }
    String subStringSub(int k, String strInput) {
        String strResult = "";
        //Iterate over input String chars.
        for (int i = 0; i < strInput.length(); i++) {
            //Made temp stringbuilder with i-th char and adding j-th chars
            StringBuilder strTemp = new StringBuilder();
            char currentI = strInput.charAt(i);
            strTemp.append(currentI);

            //Made countTemp to count amount of chars of stringbuilder
            int countTemp = 1;

            //initialize previous j-th index char.
            char prevJ = blank;
            int kTemp = k;
            outer:
            //Iterate over the chars after i-th char.
            for (int j = i + 1; j < strInput.length(); j++) {
                char currentJ = strInput.charAt(j);

                if (j == i + 1)
                    prevJ = currentI;

                if (prevJ == currentJ) {
                    countTemp++;
                    strTemp.append(currentJ);
                } else if (prevJ != currentJ && kTemp > 0) {
                    countTemp++;
                    strTemp.append(strInput.charAt(j));
                    kTemp--;
                    currentJ = prevJ;
                } else {//to do: escaped the second loop ...j
                    break outer;
                }

                prevJ = currentJ;

            }

            //the longest result
            if (strTemp.toString().length() > strResult.length()) {
                strResult = strTemp.toString();
            }
        }
        return strResult;
    }

    void subString(int k, String strInput){
        String strResult ="";

        String strForward = subStringSub( k, strInput) ;

        //todo: revere
        StringBuilder stringBuilderBack = new StringBuilder();
        for (int i = strInput.length() - 1; i >= 0; i--) {
            stringBuilderBack.append(strInput.charAt(i));
        }
        String strBackward = subStringSub( k, stringBuilderBack.toString()) ;

        if(strForward.length() > strBackward.length())
            System.out.println(strForward);
        else
            System.out.println(strBackward);

    }
}
