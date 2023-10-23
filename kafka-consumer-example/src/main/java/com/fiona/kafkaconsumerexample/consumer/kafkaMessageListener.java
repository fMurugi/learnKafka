package com.fiona.kafkaconsumerexample.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;


@Service
public class kafkaMessageListener {
    Logger logger = LoggerFactory.getLogger(kafkaMessageListener.class);

    @KafkaListener(topics="fiona-demo-topic1",groupId = "fi-group-1")
    public void consumeMessage1(String message){
        logger.info("consumer1 consume message{}",message);
    }
    @KafkaListener(topics="fiona-demo-topic1",groupId = "fi-group-1")
    public void consumeMessage2(String message){
        logger.info("consumer2 consume message{}",message);
    }
    @KafkaListener(topics="fiona-demo-topic1",groupId = "fi-group-1")
    public void consumeMessage3(String message){
        logger.info("consumer3 consume message{}",message);
    }

}