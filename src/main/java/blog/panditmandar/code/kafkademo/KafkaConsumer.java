package blog.panditmandar.code.kafkademo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumer {

	private static final Logger logger = LoggerFactory.getLogger(KafkaConsumer.class);

	@KafkaListener(groupId = ApplicationConstant.TOPIC_GROUP_ID, topics = ApplicationConstant.STRING_TOPIC_NAME, 
			containerFactory = ApplicationConstant.STRING_KAFKA_LISTENER_CONTAINER_FACTORY)
	public void receivedMessage(String message) {
		logger.info("Message Received using Kafka listener " + message);
	}

}
