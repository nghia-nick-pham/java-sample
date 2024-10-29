package java_algorithm.DIY.stack_frame;

import java.util.Arrays;

public class Main {

    void rec(int a, int[] arr){

        //base case
        if (a==3)return;
        System.out.println("before");
        System.out.println(Arrays.toString(arr));
        System.out.println("a: " + a);
        for (int i = 0;  i < arr.length; i++
             ) {
            arr[i] = a;
        }
        rec(++a, arr);
        System.out.println("after");
        System.out.println(Arrays.toString(arr));
        System.out.println("a: " + a);
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.rec(0, new int[]{0,0,0});
    }
}
