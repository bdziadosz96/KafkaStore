package com.store.application.kafkastore.controller;

import com.store.application.kafkastore.domain.Customer;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/store")
class StoreController {
    private final KafkaTemplate<String,Customer> kafkaTemplate;

    StoreController(final KafkaTemplate<String, Customer> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    @PostMapping()
    public void publish(@RequestBody Customer customer) {
        Customer customerCreated = new Customer(customer.getName(), customer.getAge());
        kafkaTemplate.send("Kafka-Store", customerCreated);
    }
}
