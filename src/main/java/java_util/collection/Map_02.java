package java_util.collection;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by nghiapv on 02/04/2017.
 */
public class Map_02 {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(new File("/home/nghiapv/Programming/Samples/JavaCore/java_core_01/src/Main/resources/file/Quote_01"));

        Map<String, Integer> aMap = new HashMap<String, Integer>();

        while (in.hasNext()){
            String c = in.next();
            int freq = aMap.get(c) == null? 1 : (int)aMap.get(c) + 1;
            aMap.put(c, freq);
        }

        System.out.println(aMap);
    }
}
