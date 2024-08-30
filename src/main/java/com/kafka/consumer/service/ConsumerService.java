package com.kafka.consumer.service;

import com.kafka.dto.Customer;

import org.apache.kafka.common.serialization.StringDeserializer;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.serializer.JsonDeserializer;
import org.springframework.stereotype.Service;

@Service
public class ConsumerService {

    //Logger logger = LoggerFactory.getLogger(ConsumerService.class);

    @KafkaListener(topics = "${customer.topic.name}", groupId = "${spring.kafka.consumer.group-id}")
    public void processMessage(Customer customer) {
        //logger.info("Message received: {}", customer.toString());
        System.out.println("Message received: " + customer.toString());
    }

}
