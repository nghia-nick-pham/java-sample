package thread.synchornization;

public class Main {
    public static void main(String[] args) {
        Counter counter = new Counter();
        Thread threadA = new CounterThread(counter);
        Thread threadB = new CounterThread(counter);

        threadA.start();
        threadB.start();
        System.out.println("Demo");
        System.out.println("Demo");

    }

}
