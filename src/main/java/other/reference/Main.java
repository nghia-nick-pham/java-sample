package other.reference;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by NghiaPV on 3/9/2018.
 */
public class Main {

    public static void main(String[] args) {
        List<String> strList = new ArrayList<>();

        MyTestFunction myTestFunction = new MyTestFunction();

        myTestFunction.add(strList);

        System.out.println("abc");

    }

    void testFunction(List<String> strList){


    }

}
