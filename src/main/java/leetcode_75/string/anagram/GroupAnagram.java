package leetcode_75.string.anagram;

import java.util.*;

public class GroupAnagram {

    public List<List<String>> groupAnagrams(String[] strs) {


        List<List<String>> result = new ArrayList<>();

        List<String> listTmp = new ArrayList<>(Arrays.asList(strs));

        recur(listTmp , result);

        return  result;

    }

    void recur(List<String> listTmp , List<List<String>> result){

        Iterator<String> iterator = listTmp.iterator();
        while (iterator.hasNext()){
            String ele = iterator.next();
            List<String> lstGrp = new ArrayList<>();
            lstGrp.add(ele); //get a first element of the array strs as a first element of a group.
            iterator.remove();//removal safety
//            Iterator<String> iteratorNested = listTmp.iterator()
            while(iterator.hasNext()){
                String eleNested = iterator.next();
                if(isAnagram(ele, eleNested)){ //compare the element to the others to gather them into the group
                    lstGrp.add(eleNested);
                    iterator.remove();

                }

            }
            //set cursor iterator = 0  <<<
            result.add(lstGrp);
        }


    }

    public static boolean isAnagram(String s, String t) {
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
        String[] strs = new String[]{"eat","tea","tan","ate","nat","bat"};
        GroupAnagram groupAnagram = new GroupAnagram();

        System.out.println(groupAnagram.groupAnagrams(strs));
    }
}
