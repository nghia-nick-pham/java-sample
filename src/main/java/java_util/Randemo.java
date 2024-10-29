package java_util;

import java.util.Random;

/**
 * Created by nghiapv on 29/03/2017.
 */
public class Randemo {

    public static void main(String[] args) {
//        Random random1 = new Random(30);
//        Random random2 = new Random(30);
//        int val1, val2;
//
//        val1 = random1.nextInt(5);
//        System.out.println(val1);
//
//        val2 = random2.nextInt(5);
//        System.out.println(val2);

        Random rand = new Random(12);

        for (int j = 0; j<10; j++)
        {
            int pick = rand.nextInt(10);
            System.out.println(pick);
        }

    }
}
