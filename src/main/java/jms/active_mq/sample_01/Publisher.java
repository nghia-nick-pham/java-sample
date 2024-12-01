package jms.active_mq.sample_01;

public class Publisher {
    private static final String QUEUE_NAME = "MyFirstActiveMQ";

    public static void main(String[] args) throws Exception {
        Queue queue = new Queue(QUEUE_NAME);
        queue.send("Welcome to the World of ActiveMQ. Hope you will enjoy this tutorial.");
        queue.close();
    }
}
