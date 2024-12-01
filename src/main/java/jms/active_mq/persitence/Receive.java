package jms.active_mq.persitence;

import org.apache.activemq.ActiveMQConnectionFactory;

import javax.jms.*;

public class Receive {
    private static final String BROKER_URL = "tcp://localhost:61616";
    private static final String QUEUE_NAME = "persistent-queue";
    public static void receiveMessage() throws JMSException {
        // Create a connection factory
        ActiveMQConnectionFactory connectionFactory = new ActiveMQConnectionFactory(BROKER_URL);

        // Create a connection
        Connection connection = connectionFactory.createConnection();
        connection.start();

        // Create a session
        Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);

        // Create the destination (Queue)
        Destination destination = session.createQueue(QUEUE_NAME);

        // Create a message consumer
        MessageConsumer consumer = session.createConsumer(destination);

        // Receive the message
        Message message = consumer.receive(1000);
        if (message instanceof TextMessage) {
            TextMessage textMessage = (TextMessage) message;
            System.out.println("Received message: " + textMessage.getText());
        } else {
            System.out.println("No message received");
        }

        // Clean up
        consumer.close();
        session.close();
        connection.close();
    }

    public static void main(String[] args) {
        try {
            receiveMessage();
        } catch (JMSException e) {
            e.printStackTrace();
        }
    }
}
