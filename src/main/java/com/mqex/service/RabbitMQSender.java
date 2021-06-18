package com.mqex.service;

import com.mqex.model.Message;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class RabbitMQSender {
	
	@Autowired
	private AmqpTemplate amqpTemplate;
	
	@Value("${mqex.rabbitmq.exchange}")
	private String exchange;
	
	@Value("${mqex.rabbitmq.routingkey}")
	private String routingkey;	


	public void sendM(Message message) {
		amqpTemplate.convertAndSend(exchange, routingkey, message);
		System.out.println("Send msg = " + message);

	}

	public Message getM() {
		return (Message) amqpTemplate.receiveAndConvert();
	}

}