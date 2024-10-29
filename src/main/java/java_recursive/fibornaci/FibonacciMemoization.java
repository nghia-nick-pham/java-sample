package java_recursive.fibornaci;

import java.util.Arrays;

public class FibonacciMemoization {

    private static int[] cache; // Memoization table

    public static int fib(int x) {
        if (cache == null) { // Initialize cache only once
            cache = new int[x + 1];
            Arrays.fill(cache, -1);
        } else if (cache.length <= x) { // Resize cache if necessary
            cache = Arrays.copyOf(cache, x + 1);
            Arrays.fill(cache, cache.length - (x + 1), cache.length, -1);
        }

        if (cache[x] != -1) {
            return cache[x]; // Return if already computed
        }

        if (x < 2) {
            cache[x] = 1; // Base cases
        } else {
            cache[x] = fib(x - 1) + fib(x - 2); // Recursive calculation
        }
        return cache[x];
    }

    public static void main(String[] args) {
        int n = 3;
//        for (int i = 0; i < n; i++) {
        int i = n;
            System.out.println("fib(" + i + ") = " + fib(i));
//        }
    }
}
