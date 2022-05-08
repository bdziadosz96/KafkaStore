package com.store.application.kafkastore.listener;

import com.store.application.kafkastore.domain.Customer;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
class KafkaListeners {
    @KafkaListener(topics = "Kafka-Store", groupId = "Kafka-group", containerFactory = "listenerFactory")
    void configureListener(Customer data){
        System.out.println("Received: " + data);
    }
}
