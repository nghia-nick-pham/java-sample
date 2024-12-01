package jms.active_mq.durable_subcriber;

import org.apache.activemq.ActiveMQConnectionFactory;

import javax.jms.*;

public class Publisher {
    public static void main(String[] args) throws JMSException {
        // Connect to ActiveMQ broker
        ConnectionFactory connectionFactory = new ActiveMQConnectionFactory("tcp://localhost:61616");
        Connection connection = connectionFactory.createConnection();
        connection.start();

        // Create session and topic
        Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
        Topic topic = session.createTopic("example.topic");

        // Create a message producer
        MessageProducer producer = session.createProducer(topic);
        producer.setDeliveryMode(DeliveryMode.PERSISTENT); // Ensures messages are stored for durable subscribers

        // Send a message
        TextMessage message = session.createTextMessage("Hello, ActiveMQ Subscribers!");
        producer.send(message);

        System.out.println("Message sent to topic: " + message.getText());

        // Clean up
        session.close();
        connection.close();
    }
}
