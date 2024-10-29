package thread;

import java.util.concurrent.*;

/**
 * Created by NghiaPV on 9/26/2018.
 */
public class FutureAndCallableExample {

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        Callable<String> callable = () -> {
            // Perform some computation
            System.out.println("Entered Callable");
            Thread.sleep(2000);
            return "Hello from Callable";
        };

        System.out.println("Submitting Callable");
        Future<String> future = executorService.submit(callable);

        // This line executes immediately
        System.out.println("Do something else while callable is getting executed");
        long immediateTime = System.currentTimeMillis();
        System.out.println(immediateTime);

        System.out.println("Retrieve the result of the future");
        // Future.get() blocks until the result is available
        String result = future.get();
        long futureTime = System.currentTimeMillis();
        System.out.println(futureTime);
        long elapse = futureTime - immediateTime;
        System.out.println(elapse);
        System.out.println(result);

        executorService.shutdown();
    }
}
