package com.kafka.springbootkafkaconsumerexample.listener;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.kafka.annotation.KafkaListener;
import com.kafka.springbootkafkaconsumerexample.config.KafkaEventSource;
import com.kafka.springbootkafkaconsumerexample.model.User;

@EnableAutoConfiguration
@EnableBinding(KafkaEventSource.class)
public class KafkaEventListener {

    @StreamListener(KafkaEventSource.cargoHandlingChannel2)
	public void receiveEvent(User user) {
		System.out.println("receiveEvent : receving message from producer microservice :" +user.getName());
	}
}
