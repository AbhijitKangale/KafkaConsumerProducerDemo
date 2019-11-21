package com.sapient.kafka.controller;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerController {

	@KafkaListener(topics = "text_example_new", groupId = "group_id")
	public void consume(String message) {
		System.out.println("Consumed message is --> " + message);
	}
}
