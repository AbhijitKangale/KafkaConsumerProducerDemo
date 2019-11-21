package com.sapient.kafka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.sapient.kafka.model.Department;

@RestController
@RequestMapping("/sapient")
public class KafkaProducerController {

	private static final String TOPIC = "text_example_new";

	/*
	 * @Autowired KafkaTemplate<String, String> kafkaStringTemplate;
	 */

	@Autowired
	KafkaTemplate<String, Department> kafkaJsonTemplate;

	/*
	 * @RequestMapping(value = "/kafkaProducer/string/{message}", method = {
	 * RequestMethod.GET })
	 * 
	 * @ResponseStatus(HttpStatus.OK) public String
	 * publishStringMessage(@PathVariable(name = "message") String message) {
	 * kafkaStringTemplate.send(TOPIC, message); return "Published Successfully"; }
	 */

	@RequestMapping(value = "/kafkaProducer/json/{message}", method = { RequestMethod.GET })
	@ResponseStatus(HttpStatus.OK)
	public String publishJsonString(@PathVariable(name = "message") String message) {
		kafkaJsonTemplate.send(TOPIC, new Department("01", message, "Java"));
		return "Published Successfully";
	}

}
