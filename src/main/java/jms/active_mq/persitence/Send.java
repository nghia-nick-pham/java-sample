package jms.active_mq.persitence;

import org.apache.activemq.ActiveMQConnectionFactory;

import javax.jms.*;

public class Send {
    private static final String BROKER_URL = "tcp://localhost:61616";
    private static final String QUEUE_NAME = "persistent-queue";
    public static void sendPersistentMessage(String messageText) throws JMSException {
        // Create a connection factory
        ActiveMQConnectionFactory connectionFactory = new ActiveMQConnectionFactory(BROKER_URL);

        // Create a connection
        Connection connection = connectionFactory.createConnection();
        connection.start();

        // Create a session
        Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);

        // Create the destination (Queue)
        Destination destination = session.createQueue(QUEUE_NAME);

        // Create a message producer for the destination
        MessageProducer producer = session.createProducer(destination);
        producer.setDeliveryMode(DeliveryMode.PERSISTENT); // Set persistent delivery mode

        // Create and send the message
        TextMessage message = session.createTextMessage(messageText);
        producer.send(message);
        System.out.println("Sent persistent message: " + messageText);

        // Clean up
        producer.close();
        session.close();
        connection.close();
    }

    public static void main(String[] args) {
        try {
            sendPersistentMessage("Hello, ActiveMQ with MySQL persistence!");
        } catch (JMSException e) {
            e.printStackTrace();
        }
    }
}
