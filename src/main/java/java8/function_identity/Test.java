package java8.function_identity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test {

    public static void main(String[] args) {
//        do_sample_1();
//        do_sample_2();
        do_sample_3();
    }

    public static void do_sample_1(){
        Function<Integer,Integer> id = Function.identity();

        System.out.println(id.apply(3));
    }

    public static void do_sample_2(){
//        Function<Double, Double> square = number -> number * number;
//        Function<Double, Double> half = number -> number * 2;

        List<Double> numbers = Arrays.asList(10D, 4D, 12D);
        // you can use identity to not modify them
        System.out.println(mapIt(numbers, Function.<Double>identity()));
    }

    private static List<Double> mapIt(List<Double> numbers, Function<Double, Double> fx) {
        List<Double> result = new ArrayList<>();

        for (Double number : numbers) {
            result.add(fx.apply(number));
        }

        return result;
    }

    public static void do_sample_3(){

        List<Student> students = new ArrayList<>();

        students.add(new Student(1L, "John", 25));
        students.add(new Student(2L, "Evans", 33));
        students.add(new Student(3L, "Chris", 19));
        students.add(new Student(4L, "Jennifer", 25));
        students.add(new Student(5L, "Mitch", 29));
        students.add(new Student(6L, "Evans", 25));

//        Map<Long, String> idToNames = students.stream()
//                .collect(Collectors.toMap(Student::getId, Student::getName));

        Map<Student, Long> nameToStudent = students.stream().collect(Collectors.toMap(Function.identity(), Student::getId ));
        System.out.println(nameToStudent);



    }
}
