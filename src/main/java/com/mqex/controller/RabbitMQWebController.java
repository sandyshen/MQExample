package com.mqex.controller;

import com.mqex.model.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.mqex.service.RabbitMQSender;

@RestController
@RequestMapping(value = "/mqex-rabbitmq/")
public class RabbitMQWebController {

	@Autowired
	RabbitMQSender rabbitMQSender;



	@PostMapping(value = "/send")
	public Message sendM(@RequestParam("messageText") String messageText,
							 @RequestParam("messageId") Long messageId) {
		rabbitMQSender.sendM(new Message(messageId,messageText));
		return new Message(messageId,"success");
	}

	@GetMapping(value = "/getLast")
	public Message getLast() {

		Message message=new Message();
		message.setMessageId(23L);
		message.setMessageText("");
		rabbitMQSender.getM();

		return message;
	}

}

