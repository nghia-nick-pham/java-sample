package leetcode_75.string.sub_string_replacement;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class SubStringNoReplacement {

    public static void main(String[] args) {
        String strInput = " ";

        System.out.println( countSubString(strInput));
    }

    static int countSubString(String strInput){
        Set<Character> setResult = new HashSet<>();
        //Iterate over substring
        for (int i = 0; i < strInput.length(); i++) {

//            Character character = ' ';
            // Making temporary set with i-th char and adding some chars.
            Set<Character> setTemp = new HashSet<>();
            // deal with the java issue that can't init a set with char ' '
            setTemp.add(strInput.charAt(i));
            jLoop:

            for (int j = i + 1; j < strInput.length(); j++) {
                char charJ = strInput.charAt(j);
                // if temporay set not contains j-char
                if(!setTemp.contains(charJ)){
                    // Adding the j-th char.
                    setTemp.add(charJ);
                }else{
                    // do nothing and break the j-iteration
                    break jLoop;
                }
            }

            //Swap the setResult to be the longest one.
            if(setTemp.size() > setResult.size())
                setResult = setTemp;
        }
        return setResult.size();
    }
}
