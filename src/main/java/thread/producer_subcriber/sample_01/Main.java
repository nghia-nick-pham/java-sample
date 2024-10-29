package thread.producer_subcriber.sample_01;

public class Main {

    public static void main(String[] args) {
        CubbyHole cubbyHole = new CubbyHole();

            new Producer(cubbyHole, 10).run();
            new Consumer(cubbyHole, 10).run();

    }
}
