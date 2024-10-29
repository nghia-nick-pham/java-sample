package java_recursive.fibornaci;

public class Main_03_Iterator {

    public static void main(String[] args) {
        Main_03_Iterator main_01 = new Main_03_Iterator();

        int n =0;

        System.out.println(main_01.interator(n));
    }

    int interator(int n){
        if (n == 1){
            return 1;
        }

        int a = 1;
        int b = 1;
        int c = 0;
        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }
}
