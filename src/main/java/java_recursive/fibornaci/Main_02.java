package java_recursive.fibornaci;

public class Main_02 {

    public static void main(String[] args) {
        Main_02 main_01 = new Main_02();

        int n =0;

        System.out.println(main_01.recursive(n));
    }

    int recursive(int n){
        if (n == 1){
            return 1;
        }else if (n == 2){
            return 2;
        }else{
            return recursive(n-1) + recursive(n-2);
        }

    }
}
