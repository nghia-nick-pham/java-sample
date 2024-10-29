package leetcode_75.string.window_substring;

import java.util.*;

public class WindowSubstringMySelf {
    String minWindow(String s, String t){
        //Both 'a's from t must be included in the window.
        if(t.length()>s.length()){
            return "";
        }
        //get groups of indexs of each char in String t
        List<List<Integer>> charGroups = getAllCharGroups(s, t);
        List<List<Integer>> resultAll = new ArrayList<>();

        List<Integer> result = new ArrayList<>();
        //recursion on the groups to get sufficient string result - include all char of String t
        generateCombinationsHelper(charGroups, 0, new ArrayList<>(), result, resultAll);
            //get min range (minWindow) by calculating the gap between the smallest index and the largest index of chars
        if (result == null || result.size() <= 0){
            return "";
        }
        return s.substring(result.get(0),result.get(result.size()-1)+1); //get substring from the smallest index to the largest index + 1
    }

    static  List<List<Integer>> getAllCharGroups(String s, String t){
        List<List<Integer>> listT = new ArrayList<>();
        for (int i = 0; i < t.length(); i++) {
            List<Integer> listS = new ArrayList<>();
            char charT = t.charAt(i);
            for (int j = s.indexOf(charT); j >= 0 ; j=s.indexOf(charT, j+1)) {
                listS.add(j);
            }          
            listT.add(listS);
        }
        return listT;
    }

    private static void generateCombinationsHelper(List<List<Integer>> groups, int groupIndex,
                                                   List<Integer> currentCombination, List<Integer> result, List<List<Integer>> resultAll) {
        if (groupIndex == groups.size()) {
            List<Integer> listTmp = swapMinList(result, currentCombination);
            result.clear();
            result.addAll(listTmp);
            resultAll.add(new ArrayList<>(currentCombination)); // Base case: add combination to result
            return;
        }

        List<Integer> currentGroup = groups.get(groupIndex);
        for (int element : currentGroup) {
            currentCombination.add(element);
            generateCombinationsHelper(groups, groupIndex + 1, currentCombination, result, resultAll); // Explore next group
            currentCombination.remove(currentCombination.size() - 1); // Backtrack
        }
    }

    private static List<Integer> swapMinList(List<Integer>A, List<Integer>B) {
        if(A==null || A.size() ==0){
            return new ArrayList<>(B);
        }
        List<Integer> resultA = new ArrayList<>(A);
        List<Integer> resultB = new ArrayList<>(B);

        Collections.sort(resultA);
        Collections.sort(resultB);
        int gapA = resultA.get(resultA.size()-1) - resultA.get(0);// gap between the largest element and the smallest element
        int gapB = resultB.get(resultB.size()-1) - resultB.get(0);// gap between the largest element and the smallest element
        if(gapA > gapB) {
            return resultB;
        }
        return resultA;
    }

    public static void main(String[] args) {
        WindowSubstringMySelf solution = new WindowSubstringMySelf();
        String s = "ADOBECODEBANC";
        String t = "ABC";
//        String s = "a";
//        String t = "aa";
//        String s = "ab";
//        String t = "A";
//        String s = "aa";
//        String t = "aa";
        System.out.println(solution.minWindow(s, t)); // Output: "BANC"
    }
}


