package java_recursive.fibornaci;

import connection.Main;

public class Main_01 {

    public static void main(String[] args) {
        Main_01 main_01 = new Main_01();

        int n =5;
        if (n==0){
            System.out.println("0 ways");
        }
        System.out.println(main_01.recursive(n));
    }

    int recursive (int n){
        if(n >= 1){
            return recursive(n-1) + recursive(n-2);
        }
        //anchor 1: recursive(0) == 1
        else if (n == 0){
            return 1;
        }
        //anchor 2:
        else {
            return 0;
        }
    }
}
