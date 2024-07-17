package com.demoproject.kafka.consumer;

import com.demoproject.kafka.payload.Student;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class KafkaConsumer {

    //@KafkaListener(topics = "myTopic", groupId = "myGroup")
    public void consumeMessage(String msg) {
        log.info(String.format("Consuming the message from myTopic:: %s", msg));
    }

    @KafkaListener(topics = "myTopic", groupId = "myGroup")
    public void consumeJsonMsg(Student student) {
        log.info(String.format("Consuming the message from myTopic:: %s", student.toString()));
    }
}
