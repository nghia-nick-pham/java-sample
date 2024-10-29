package java_util.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * Created by nghiapv on 02/04/2017.
 */
public class Map_01 {

    public static void main(String[] args) {
        Map<String, String> aMap = new HashMap<String, String>();

        aMap.put("1", "Jimmy");
        aMap.put("2", "Cartherna");
        aMap.put("3", "Carlos");

        System.out.println(aMap.get("1"));

        Set<String> setVal = aMap.keySet();
        for (String str: setVal
             ) {
            System.out.print(str);
            System.out.print(":");
            System.out.println(aMap.get(str));
        }
    }
}
