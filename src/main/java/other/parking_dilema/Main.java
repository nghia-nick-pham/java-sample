package other.parking_dilema;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] cars = {2, 10, 8, 17};
        int k = 3;
        System.out.println(ParkingDilemma(cars, k));
    }

    public static int ParkingDilemma(int[] cars, int k) {
        // write your code here

        //sort
        Arrays.sort(cars);
        int len = cars.length;
        //min
        int min = cars[k-1] - cars[0];
        //compare
        for (int i = 1; i <= len - k; i++) {
            if (min > cars[k-1+i] - cars[i]) {
                min = cars[k-1+i] - cars[i];
            }
        }
        //recalculate
        return min + 1;
    }
}
