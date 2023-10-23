package com.fiona.kafkaproducer.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KafkaProducerConfig  {
    @Bean
    public NewTopic createTopic(){
        return new NewTopic("fiona-demo-topic1",3,(short)1);
    }


}