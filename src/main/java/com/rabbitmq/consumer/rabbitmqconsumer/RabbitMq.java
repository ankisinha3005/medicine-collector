package com.rabbitmq.consumer.rabbitmqconsumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class RabbitMq {

//    private static final Logger log = LoggerFactory.getLogger(RabbitMq.class);
//    @Autowired
//    private RabbitTemplate rabbitTemplate;
//
//    Integer integer = 0;
//
//    @Scheduled(fixedRate = 2000)
//    void sendMessage(){
//        integer++;
//        log.info("Hi Ankiit KUmar {}", integer);
//       rabbitTemplate.convertAndSend("hello.world", "Hello Ankit Kumar" + integer);
//    }


}
