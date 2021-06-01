package com.rabbitmq.consumer.rabbitmqconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import springfox.documentation.swagger2.annotations.EnableSwagger2WebFlux;

@SpringBootApplication
@EnableSwagger2WebFlux
@EnableScheduling
public class RabbitMqConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(RabbitMqConsumerApplication.class, args);
	}

}
