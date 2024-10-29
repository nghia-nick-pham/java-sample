package leetcode_75.string.anagram.group_anagram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class GroupAnagramRecursion {

    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        List<String> listTmp = new ArrayList<>(Arrays.asList(strs));
        recur(listTmp , result);
        return  result;
    }

    void recur(List<String> listTmp , List<List<String>> result){
        //base case
        if(listTmp.size() == 0)
        {
            return;
        }
        Iterator<String> iterator = listTmp.iterator();
            String ele = iterator.next();
            List<String> lstGrp = new ArrayList<>();
            lstGrp.add(ele); //get a first element of the array strs as a first element of a group.
            iterator.remove();//removal safety
            while(iterator.hasNext()){
                String eleNested = iterator.next();
                if(isAnagram(ele, eleNested)){ //compare the element to the others to gather them into the group
                    lstGrp.add(eleNested);
                    iterator.remove();
                }
            }
            result.add(lstGrp);

            //convert remain iterator into list
            List<String> remainList = new ArrayList<>();
            iterator.forEachRemaining(remainList::add);
            recur(listTmp, result);
    }

    public static boolean isAnagram(String s, String t) {
        //validation
        if(s.length() != t.length()){
            return false;
        }

        //convert String to List<String>
        char[] lstCharS = s.toCharArray();
        char[] lstCharT = t.toCharArray();

        //Sort two lists
        Arrays.sort(lstCharS);
        Arrays.sort(lstCharT);

        //Compare two lists.
       return Arrays.equals(lstCharS, lstCharT);
    }

    public static void main(String[] args) {
        String[] strs = new String[]{"eat","tea","tan","ate","nat","bat"};
        GroupAnagramRecursion groupAnagram = new GroupAnagramRecursion();

        System.out.println(groupAnagram.groupAnagrams(strs));
    }
}
