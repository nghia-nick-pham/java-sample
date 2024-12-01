package jms.active_mq.sample_01;

public class Consumer {

    private static final String QUEUE_NAME = "MyFirstActiveMQ";

    public static void main(String[] args) throws Exception {
        Queue queue = new Queue(QUEUE_NAME);
        queue.receive();
        queue.close();
    }
}
