package java_recursive.divide_and_conquer;

import java.util.Arrays;

public class Plain_Recursion_01 {

    public static void main(String[] args) {
        Plain_Recursion_01 plain_recursion_01 = new Plain_Recursion_01();
        System.out.println(plain_recursion_01.sum(new int[]{2, 4 ,6}));
    }

    int sum(int[] arr){
        if (arr == null || arr.length == 0){
            return 0;
        }
        if (arr.length == 1){
            return arr[0];
        }else {
            return arr[0] += sum(Arrays.copyOfRange(arr,1, arr.length));
        }
    }
}
