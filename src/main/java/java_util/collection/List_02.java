package java_util.collection;

import java.util.Arrays;
import java.util.List;

/**
 * Created by nghiapv on 01/04/2017.
 */
public class List_02 {
    public static void main(String[] args) {
        String[] arr = new String[]{"Jim", "Catherna", "Carlos"};
        System.out.println(Arrays.toString(arr));

        List<String> lst = Arrays.asList(arr);
        System.out.println(lst);

        arr[0] += "88";
        lst.set(2, lst.get(2) + "99");
        System.out.println(Arrays.toString(arr));
        System.out.println(lst);

        List<Integer> lstInt = Arrays.asList(1,2,3);
        System.out.println(lstInt);

    }


}
