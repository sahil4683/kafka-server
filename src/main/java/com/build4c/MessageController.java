package com.build4c;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/message")
public class MessageController {
	
	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;
	
	@GetMapping
	public void publish() {
		kafkaTemplate.send("build4c","Hellow Form Rest");
	}

}
