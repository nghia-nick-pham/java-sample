package java8;

import java.util.Optional;

/**
 * Created by NghiaPV on 9/24/2018.
 */
public class OptionalTest {

    public static void main(String[] args) {
        try {
            testForOptional();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    private static void testForOptional() throws Exception{
        Optional<String> strTest = Optional.empty();

        System.out.println(strTest.get());
//        if(strTest.isPresent()){
//            System.out.println("strTest is Present");
//        }
    }
}
