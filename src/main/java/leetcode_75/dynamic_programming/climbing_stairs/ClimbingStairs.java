package leetcode_75.dynamic_programming.climbing_stairs;

import java.util.ArrayList;
import java.util.List;

public class ClimbingStairs {


    public static void main(String[] args) {
        int n = 5;
        ClimbingStairs generationAlgorithm = new ClimbingStairs();
        for (int i = 0; i < n; i++) {
            List<String> sequences = new ArrayList<>();
            generationAlgorithm.generateBinarySequence(n, sequences, n-i);

            for (String seg: sequences
            ) {
                System.out.println(seg);
            }
        }


    }

    void generateBinarySequence(int total, List<String> sequence , int n){
        int result = 0;
        int[] x = new int[n];

        for (int i = 0; i < n; i++) {
            x[i] = 1;
        }

        boolean stop = false;
        //thực hiện thuật toán sinh trong vòng lặp while() {}.
        while(!stop){
            int tmp = 0;
            String biSe = "";
            for (int ele: x
                 ) {
                biSe += ele;
                tmp += ele;
            }
            //count the satisfied item.
            if(tmp == total) {
                result++;
                sequence.add(biSe);
            }

            //duyệt các phần tử từ cuối dãy trở lại.
            int i  =n -1;
            while ((i >= 0) && (x[i] == 2)){
                i--;
            }

            //thực hiện điều chỉnh giá trị của x[i] và những phần tử đứng sau trên dãy
            if(i >= 0){
                x[i] = 2;

                for (int j = i+ 1; j < n; j++) {
                    x[j] = 1;
                }
            }

            //Thuật toán sinh dừng lại khi đã sinh ra dãy 22…2.
            if (i < 0){
                stop = true;
            }

        }

        System.out.println(result + " ways");
    }




}
