package java_algorithm.generation.binary_sequence;

import java.util.ArrayList;
import java.util.List;

public class GenerationAlgorithm {


    public static void main(String[] args) {
        int n = 4;
        List<String> sequences = new ArrayList<>();

        GenerationAlgorithm generationAlgorithm = new GenerationAlgorithm();
        generationAlgorithm.generateBinarySequence(n, sequences);

        for (String seg: sequences
             ) {
            System.out.println(seg);
        }

    }

    void generateBinarySequence(int n, List<String> sequence){
        int[] x = new int[n];

        for (int i = 0; i < n; i++) {
            x[i] = 0;
        }

        boolean stop = false;
        //thực hiện thuật toán sinh trong vòng lặp while() {}.
        while(!stop){
            String biSe = "";
            for (int ele: x
                 ) {
                biSe += ele;
            }
            sequence.add(biSe);

            //duyệt các phần tử từ cuối dãy trở lại.
            int i  =n -1;
            while ((i >= 0) && (x[i] == 1)){
                i--;
            }

            //thực hiện điều chỉnh giá trị của x[i] và những phần tử đứng sau trên dãy
            if(i >= 0){
                x[i] = 1;

                for (int j = i+ 1; j < n; j++) {
                    x[j] = 0;
                }
            }

            //Thuật toán sinh dừng lại khi đã sinh ra dãy 11…1.
            if (i < 0){
                stop = true;
            }

        }
    }




}
