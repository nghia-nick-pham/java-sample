package java_functional_programming.stream_api;

import org.apache.logging.log4j.core.util.JsonUtils;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CommonUsedFunctionalInterface {

//    public static void main(String[] args) {
//
////        Function<String, Integer> getLength = str -> str.length();
////        System.out.println(getLength.apply("John Doe")); // 8
////        System.out.println(1 % 2 == 0);
//
//        List<Integer> list = Arrays.asList(1, 5, 10);
//        List<String> listString = Arrays.asList("A", "BC", "EF");
////        list.stream() // Lấy ra stream từ List
////                .map(num -> num * 2) // Mỗi phần tử sẽ được nhân đôi
////                .filter(num -> num < 10) // Chỉ giữ lại các phần tử nhỏ hơn 10
////                .forEach(num -> System.out.println(num)); // In ra các phần tử còn lại
//        Map<Integer, String> hashMap = IntStream.range(0, listString.size())
//                .boxed()
//                .collect(HashMap::new, (map, i) -> map.put(i, listString.get(i)), HashMap::putAll);
//
//
//        list.stream()
//                .map(n -> {
//                    System.out.println(n);
//                    return n * 2;})
//                .filter(n -> {
//                    System.out.println("filter: " + n);
//                    return n < 20;})
//                .forEach(n -> System.out.println(n));
//    }

    public static void main(String[] args) {
        List<Fruit> arrayList = new ArrayList<>();
        arrayList.add(new Fruit(1, "Apple"));
        arrayList.add(new Fruit(2, "Banana"));
        arrayList.add(new Fruit(3, "Cherry"));

        Collectors.toMap(Fruit::getId, Fruit::getName);
        // Convert ArrayList to HashMap using the fruit's ID as key and name as value
        Map<Integer, String> hashMap = arrayList.stream()
                .collect(Collectors.toMap(Fruit::getId, Fruit::getName));

        // Print the resulting HashMap
        hashMap.forEach((key, value) -> System.out.println(key + " -> " + value));
    }
}
