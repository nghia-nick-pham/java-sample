package thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

public class MainSynchronised {
    int count = 0;

    void increment() {
        count = count + 1;
    }

    void doIt(){
        ExecutorService executor = Executors.newFixedThreadPool(2);

        IntStream.range(0, 10000)
                .forEach(i -> System.out.println(i));

//        stop(executor);

        System.out.println(count);  // 9965
    }

    public static void main(String[] args) {
//        ExecutorService executor = Executors.newSingleThreadExecutor();
//        executor.submit(() -> {
//            String threadName = Thread.currentThread().getName();
//            System.out.println("Hello " + threadName);
//        });
        MainSynchronised mainSynchronised = new MainSynchronised();
        mainSynchronised.doIt();
    }
}
