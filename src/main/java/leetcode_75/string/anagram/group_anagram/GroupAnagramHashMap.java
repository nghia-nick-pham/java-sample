package leetcode_75.string.anagram.group_anagram;

import java.util.*;

public class GroupAnagramHashMap {

        public List<List<String>> groupAnagrams(String[] strs) {
            // Create a map to hold sorted string as key and list of anagrams as value
            Map<String, List<String>> map = new HashMap<>();

            // Iterate through each string in the array
            for (String s : strs) {
                // Convert string to character array, sort it, and convert back to string
                char[] charArray = s.toCharArray();
                Arrays.sort(charArray);
                String sortedStr = new String(charArray);

                // Add the original string to the corresponding list in the map
                if (!map.containsKey(sortedStr)) {
                    map.put(sortedStr, new ArrayList<>());
                }
                map.get(sortedStr).add(s);
            }

            // Collect all the lists of anagrams from the map and return as a result
            return new ArrayList<>(map.values());
        }

        public static void main(String[] args) {
            GroupAnagramHashMap solution = new GroupAnagramHashMap();
            String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
            List<List<String>> result = solution.groupAnagrams(strs);
            System.out.println(result);
        }
    }

