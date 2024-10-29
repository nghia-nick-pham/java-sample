package java_recursive.over_loop;

public class RecursiveInForLoop {
    public static void foo(int n) {
        if (n > 0) {
            for (int i = 0; i < n; i++) {
                System.out.println("Level " + n + ", Iteration " + i);
                foo(n - 1);
            }
        }
    }

    public static void main(String[] args) {
        foo(3);
    }
}

