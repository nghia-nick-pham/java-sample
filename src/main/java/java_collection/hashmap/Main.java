package java_collection.hashmap;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Map<String, String>[] arrMap = new HashMap[2];
        Map<String, String> map = new HashMap<>();
        map.put("a1", "b1");
        map.put("a2", "b2");
        arrMap[0] = map;
        Map<String, String> map1 = new HashMap<>();
        map1.put("a3", "b3");
        map1.put("a4", "b4");
        arrMap[1] = map1;

        for (int i = 0; i < arrMap.length; i++) {
            for (Map.Entry<String, String> entry: arrMap[i].entrySet()
                 ) {
                System.out.println(entry.getKey());
                System.out.println(entry.getValue());
            }
        }



    }
}
