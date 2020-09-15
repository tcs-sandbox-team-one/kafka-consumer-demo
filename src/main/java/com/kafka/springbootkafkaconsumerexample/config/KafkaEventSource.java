package com.kafka.springbootkafkaconsumerexample.config;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface KafkaEventSource {
	
	String cargoHandlingChannel2 = "cargoHandlingChannel2";

	 @Input(cargoHandlingChannel2) 
	  SubscribableChannel cargoHandlingChannel2();
}
