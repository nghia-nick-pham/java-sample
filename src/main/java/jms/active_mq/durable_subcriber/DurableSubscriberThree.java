package jms.active_mq.durable_subcriber;

import org.apache.activemq.ActiveMQConnectionFactory;

import javax.jms.*;

public class DurableSubscriberThree {
    public static void main(String[] args) throws JMSException {
        ConnectionFactory connectionFactory = new ActiveMQConnectionFactory("tcp://localhost:61616");
        Connection connection = connectionFactory.createConnection();

        // Set a unique client ID for the durable subscription
        connection.setClientID("DurableSubscriberClient");

        connection.start();

        // Create session and topic
        Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
        Topic topic = session.createTopic("example.topic");

        // Create a durable subscriber
        MessageConsumer consumer = session.createDurableSubscriber(topic, "DurableSubscription");

        consumer.setMessageListener(message -> {
            if (message instanceof TextMessage) {
                try {
                    System.out.println("DurableSubscriberThree received: " + ((TextMessage) message).getText());
                } catch (JMSException e) {
                    e.printStackTrace();
                }
            }
        });

        // Keep the application running to listen for messages
        System.out.println("Durable subscriber is listening...");
    }
}
